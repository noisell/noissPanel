package api

import (
	"bytes"
	"context"
	"encoding/json"
	"fmt"
	"io"
	"net/http"
	"sync"
	"time"

	"golang.org/x/oauth2/google"

	"redwing/internal/db"
)

// --- OAuth2 token cache ---

type cachedToken struct {
	access    string
	expiresAt time.Time
}

var (
	tokenCache   = map[string]*cachedToken{}
	tokenCacheMu sync.Mutex
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

	var saJSON string
	db.DB.QueryRow("SELECT COALESCE(value,'') FROM team_settings WHERE team_id = ? AND key = 'fcm_service_account'", teamID).Scan(&saJSON)

	writeJSON(w, map[string]any{
		"has_token":           fcmToken != "",
		"has_service_account": saJSON != "",
		"fcm_ready":           fcmToken != "" && saJSON != "",
	})
}

// --- FCM v1 send ---

func sendFCMWakeup(teamID, saJSON, deviceToken string) error {
	accessToken, projectID, err := getAccessToken(teamID, []byte(saJSON))
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

	if projectID == "" {
		return fmt.Errorf("service account JSON missing project_id")
	}

	endpoint := fmt.Sprintf("https://fcm.googleapis.com/v1/projects/%s/messages:send", projectID)
	req, err := http.NewRequest("POST", endpoint, bytes.NewReader(body))
	if err != nil {
		return err
	}
	req.Header.Set("Authorization", "Bearer "+accessToken)
	req.Header.Set("Content-Type", "application/json")

	fcmClient := &http.Client{Timeout: 10 * time.Second}
	resp, err := fcmClient.Do(req)
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

// --- OAuth2 with google package ---

func getAccessToken(cacheKey string, saJSON []byte) (token, projectID string, err error) {
	tokenCacheMu.Lock()
	cached := tokenCache[cacheKey]
	tokenCacheMu.Unlock()

	if cached != nil && time.Now().Before(cached.expiresAt) {
		// extract project_id from cached JSON
		var meta struct {
			ProjectID string `json:"project_id"`
		}
		json.Unmarshal(saJSON, &meta)
		return cached.access, meta.ProjectID, nil
	}

	var meta struct {
		ProjectID string `json:"project_id"`
	}
	if err := json.Unmarshal(saJSON, &meta); err != nil {
		return "", "", fmt.Errorf("invalid service account JSON: %v", err)
	}

	const scope = "https://www.googleapis.com/auth/firebase.messaging"
	cfg, err := google.JWTConfigFromJSON(saJSON, scope)
	if err != nil {
		return "", "", fmt.Errorf("JWTConfigFromJSON: %v", err)
	}

	ts := cfg.TokenSource(context.Background())
	t, err := ts.Token()
	if err != nil {
		return "", "", fmt.Errorf("TokenSource: %v", err)
	}

	expiry := t.Expiry
	if expiry.IsZero() {
		expiry = time.Now().Add(55 * time.Minute)
	}
	tokenCacheMu.Lock()
	tokenCache[cacheKey] = &cachedToken{
		access:    t.AccessToken,
		expiresAt: expiry.Add(-5 * time.Minute),
	}
	tokenCacheMu.Unlock()

	return t.AccessToken, meta.ProjectID, nil
}

// InvalidateFCMTokenCache clears cached OAuth tokens (call on settings update)
func InvalidateFCMTokenCache(teamID string) {
	tokenCacheMu.Lock()
	delete(tokenCache, teamID)
	tokenCacheMu.Unlock()
}
