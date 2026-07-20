package api

import (
	"bytes"
	"encoding/json"
	"fmt"
	"io"
	"net/http"

	"redwing/internal/db"
)

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
		writeJSON(w, map[string]any{"error": "no_fcm_token", "message": "FCM token not available for this device"})
		return
	}

	var serverKey string
	db.DB.QueryRow("SELECT value FROM team_settings WHERE team_id = ? AND key = 'fcm_server_key'", teamID).Scan(&serverKey)
	if serverKey == "" {
		writeJSON(w, map[string]any{"error": "no_fcm_key", "message": "FCM server key not configured in Settings"})
		return
	}

	if err := sendFCMWakeup(serverKey, fcmToken); err != nil {
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

func sendFCMWakeup(serverKey, deviceToken string) error {
	payload := map[string]any{
		"to":       deviceToken,
		"priority": "high",
		"data": map[string]any{
			"type": "FCM_WAKEUP",
		},
	}
	body, _ := json.Marshal(payload)

	req, err := http.NewRequest("POST", "https://fcm.googleapis.com/fcm/send", bytes.NewReader(body))
	if err != nil {
		return err
	}
	req.Header.Set("Authorization", "key="+serverKey)
	req.Header.Set("Content-Type", "application/json")

	resp, err := http.DefaultClient.Do(req)
	if err != nil {
		return err
	}
	defer resp.Body.Close()

	respBody, _ := io.ReadAll(resp.Body)
	if resp.StatusCode != http.StatusOK {
		return fmt.Errorf("FCM error %d: %s", resp.StatusCode, string(respBody))
	}

	var result map[string]any
	json.Unmarshal(respBody, &result)
	if failure, _ := result["failure"].(float64); failure > 0 {
		return fmt.Errorf("FCM delivery failed: %s", string(respBody))
	}

	return nil
}
