package api

import (
	"bytes"
	"crypto"
	"crypto/rand"
	"crypto/rsa"
	"crypto/sha256"
	"crypto/x509"
	"encoding/base64"
	"encoding/json"
	"encoding/pem"
	"fmt"
	"io"
	"net/http"
	"net/url"
	"sync"
	"time"

	"redwing/internal/db"
)

// --- OAuth2 token cache ---

type fcmToken struct {
	access    string
	expiresAt time.Time
}

var (
	fcmTokenCache   = map[string]*fcmToken{}
	fcmTokenCacheMu sync.Mutex
)

// --- Handlers ---

func HandleFCMWakeup(w http.ResponseWriter, r *http.Request) {
	if r.Method != http.MethodPost {
		writeJSON(w, map[string]any{"error": "method not allowed"})
		return
	}

	teamID := SessionTeamID(r)
	if teamID == "" {
		writeJSON(w, map[string]any{"error": "unauthorized"})
		return
	}

	var req struct {
		DeviceID string `json:"device_id"`
	}
	if json.NewDecoder(r.Body).Decode(&req) != nil || req.DeviceID == "" {
		writeJSON(w, map[string]any{"error": "device_id required"})
		return
	}

	var fcmToken string
	db.DB.QueryRow(
		"SELECT COALESCE(fcm_token,'') FROM devices WHERE device_id = ? AND team_id = ? AND COALESCE(deleted,0) = 0",
		req.DeviceID, teamID,
	).Scan(&fcmToken)

	if fcmToken == "" {
		writeJSON(w, map[string]any{"error": "no_fcm_token", "message": "FCM токен не получен — установи APK собранный после обновления"})
		return
	}

	var saJSON string
	db.DB.QueryRow("SELECT value FROM team_settings WHERE team_id = ? AND key = 'fcm_service_account'", teamID).Scan(&saJSON)
	if saJSON == "" {
		writeJSON(w, map[string]any{"error": "no_fcm_key", "message": "Service Account не настроен — укажи в Настройках"})
		return
	}

	if err := sendFCMWakeup(teamID, saJSON, fcmToken); err != nil {
		writeJSON(w, map[string]any{"error": err.Error()})
		return
	}

	writeJSON(w, map[string]any{"success": true})
}

func HandleFCMStatus(w http.ResponseWriter, r *http.Request) {
	teamID := SessionTeamID(r)
	if teamID == "" {
		writeJSON(w, map[string]any{"error": "unauthorized"})
		return
	}

	deviceID := r.URL.Query().Get("device_id")
	if deviceID == "" {
		writeJSON(w, map[string]any{"error": "device_id required"})
		return
	}

	var fcmToken string
	db.DB.QueryRow(
		"SELECT COALESCE(fcm_token,'') FROM devices WHERE device_id = ? AND team_id = ? AND COALESCE(deleted,0) = 0",
		deviceID, teamID,
	).Scan(&fcmToken)

	writeJSON(w, map[string]any{"has_token": fcmToken != ""})
}

// --- FCM v1 send ---

type serviceAccount struct {
	ProjectID   string `json:"project_id"`
	ClientEmail string `json:"client_email"`
	PrivateKey  string `json:"private_key"`
}

func sendFCMWakeup(teamID, saJSON, deviceToken string) error {
	var sa serviceAccount
	if err := json.Unmarshal([]byte(saJSON), &sa); err != nil {
		return fmt.Errorf("invalid service account JSON: %v", err)
	}

	accessToken, err := getOAuthToken(teamID, sa)
	if err != nil {
		return fmt.Errorf("OAuth2 error: %v", err)
	}

	payload := map[string]any{
		"message": map[string]any{
			"token": deviceToken,
			"data": map[string]string{
				"type": "FCM_WAKEUP",
			},
			"android": map[string]any{
				"priority": "HIGH",
			},
		},
	}
	body, _ := json.Marshal(payload)

	endpoint := fmt.Sprintf("https://fcm.googleapis.com/v1/projects/%s/messages:send", sa.ProjectID)
	req, err := http.NewRequest("POST", endpoint, bytes.NewReader(body))
	if err != nil {
		return err
	}
	req.Header.Set("Authorization", "Bearer "+accessToken)
	req.Header.Set("Content-Type", "application/json")

	resp, err := http.DefaultClient.Do(req)
	if err != nil {
		return err
	}
	defer resp.Body.Close()

	respBody, _ := io.ReadAll(resp.Body)
	if resp.StatusCode != http.StatusOK {
		return fmt.Errorf("FCM v1 error %d: %s", resp.StatusCode, string(respBody))
	}

	return nil
}

// --- JWT / OAuth2 ---

func getOAuthToken(cacheKey string, sa serviceAccount) (string, error) {
	fcmTokenCacheMu.Lock()
	cached := fcmTokenCache[cacheKey]
	fcmTokenCacheMu.Unlock()

	if cached != nil && time.Now().Before(cached.expiresAt) {
		return cached.access, nil
	}

	token, err := requestOAuthToken(sa)
	if err != nil {
		return "", err
	}

	fcmTokenCacheMu.Lock()
	fcmTokenCache[cacheKey] = &fcmToken{
		access:    token,
		expiresAt: time.Now().Add(55 * time.Minute),
	}
	fcmTokenCacheMu.Unlock()

	return token, nil
}

func requestOAuthToken(sa serviceAccount) (string, error) {
	now := time.Now().Unix()
	header := base64url(mustJSON(map[string]string{"alg": "RS256", "typ": "JWT"}))
	claims := base64url(mustJSON(map[string]any{
		"iss":   sa.ClientEmail,
		"scope": "https://www.googleapis.com/auth/firebase.messaging",
		"aud":   "https://oauth2.googleapis.com/token",
		"iat":   now,
		"exp":   now + 3600,
	}))

	signingInput := header + "." + claims
	sig, err := signRS256([]byte(signingInput), sa.PrivateKey)
	if err != nil {
		return "", err
	}

	jwt := signingInput + "." + sig

	resp, err := http.PostForm("https://oauth2.googleapis.com/token", url.Values{
		"grant_type": {"urn:ietf:params:oauth2:grant-type:jwt-bearer"},
		"assertion":  {jwt},
	})
	if err != nil {
		return "", err
	}
	defer resp.Body.Close()

	body, _ := io.ReadAll(resp.Body)
	if resp.StatusCode != http.StatusOK {
		return "", fmt.Errorf("token error %d: %s", resp.StatusCode, string(body))
	}

	var result struct {
		AccessToken string `json:"access_token"`
	}
	if err := json.Unmarshal(body, &result); err != nil || result.AccessToken == "" {
		return "", fmt.Errorf("bad token response: %s", string(body))
	}

	return result.AccessToken, nil
}

func signRS256(data []byte, pemKey string) (string, error) {
	block, _ := pem.Decode([]byte(pemKey))
	if block == nil {
		return "", fmt.Errorf("failed to decode PEM block")
	}

	key, err := x509.ParsePKCS8PrivateKey(block.Bytes)
	if err != nil {
		return "", fmt.Errorf("parse private key: %v", err)
	}

	rsaKey, ok := key.(*rsa.PrivateKey)
	if !ok {
		return "", fmt.Errorf("not an RSA key")
	}

	h := sha256.New()
	h.Write(data)
	digest := h.Sum(nil)

	sig, err := rsa.SignPKCS1v15(rand.Reader, rsaKey, crypto.SHA256, digest)
	if err != nil {
		return "", err
	}

	return base64url(sig), nil
}

func base64url(data any) string {
	var b []byte
	switch v := data.(type) {
	case []byte:
		b = v
	default:
		b, _ = json.Marshal(v)
	}
	return base64.RawURLEncoding.EncodeToString(b)
}

func mustJSON(v any) []byte {
	b, _ := json.Marshal(v)
	return b
}

// InvalidateFCMTokenCache clears cached OAuth tokens (call on settings update)
func InvalidateFCMTokenCache(teamID string) {
	fcmTokenCacheMu.Lock()
	delete(fcmTokenCache, teamID)
	fcmTokenCacheMu.Unlock()
}

