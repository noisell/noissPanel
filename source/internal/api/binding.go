package api

import (
	"net/http"
	"strings"

	"redwing/internal/auth"
	"redwing/internal/db"
)

func HandleDeviceBindings(w http.ResponseWriter, r *http.Request) {
	session, err := auth.GetSessionFromRequest(r)
	if err != nil {
		writeJSON(w, map[string]any{"error": "unauthorized"})
		return
	}
	teamID := session.TeamID

	// Extract deviceID from path: /api/panel/device-bindings/{teamId}/{deviceId}
	parts := strings.Split(strings.TrimPrefix(r.URL.Path, "/api/panel/device-bindings/"), "/")
	if len(parts) < 2 {
		writeJSON(w, map[string]any{"error": "bad path"})
		return
	}
	deviceID := parts[1]

	rows, err := db.DB.Query(
		`SELECT operator_login, operator_name, bound_at FROM device_bindings
		 WHERE team_id = ? AND device_id = ? AND is_active = 1 ORDER BY bound_at DESC`,
		teamID, deviceID,
	)
	var bindings []map[string]any
	if err == nil {
		defer rows.Close()
		for rows.Next() {
			var login, name, boundAt string
			rows.Scan(&login, &name, &boundAt)
			bindings = append(bindings, map[string]any{
				"operator_login": login,
				"operator_name":  name,
				"bound_at":       boundAt,
				"device_id":      deviceID,
			})
		}
	}
	if bindings == nil {
		bindings = []map[string]any{}
	}

	// Current user's binding for this device
	var myBinding map[string]any
	for _, b := range bindings {
		if b["operator_login"] == session.Login {
			myBinding = map[string]any{
				"device_id": deviceID,
				"bound_at":  b["bound_at"],
			}
			break
		}
	}

	// History (last 20 inactive)
	histRows, err := db.DB.Query(
		`SELECT operator_login, operator_name, bound_at, COALESCE(unbound_at,''), is_active
		 FROM device_bindings WHERE team_id = ? AND device_id = ? ORDER BY bound_at DESC LIMIT 20`,
		teamID, deviceID,
	)
	var history []map[string]any
	if err == nil {
		defer histRows.Close()
		for histRows.Next() {
			var login, name, boundAt, unboundAt string
			var isActive int
			histRows.Scan(&login, &name, &boundAt, &unboundAt, &isActive)
			entry := map[string]any{
				"operator_login": login,
				"operator_name":  name,
				"bound_at":       boundAt,
				"is_active":      isActive == 1,
			}
			if unboundAt != "" {
				entry["unbound_at"] = unboundAt
			}
			history = append(history, entry)
		}
	}
	if history == nil {
		history = []map[string]any{}
	}

	writeJSON(w, map[string]any{
		"bindings":   bindings,
		"my_binding": myBinding,
		"history":    history,
	})
}

func HandleDeviceBind(w http.ResponseWriter, r *http.Request) {
	if r.Method != http.MethodPost {
		writeJSON(w, map[string]any{"error": "method not allowed"})
		return
	}
	session, err := auth.GetSessionFromRequest(r)
	if err != nil {
		writeJSON(w, map[string]any{"error": "unauthorized"})
		return
	}
	teamID := session.TeamID

	parts := strings.Split(strings.TrimPrefix(r.URL.Path, "/api/panel/device-bind/"), "/")
	if len(parts) < 2 {
		writeJSON(w, map[string]any{"error": "bad path"})
		return
	}
	deviceID := parts[1]

	// Already bound to this device?
	var count int
	db.DB.QueryRow(
		`SELECT COUNT(*) FROM device_bindings WHERE team_id = ? AND device_id = ? AND operator_login = ? AND is_active = 1`,
		teamID, deviceID, session.Login,
	).Scan(&count)
	if count > 0 {
		writeJSON(w, map[string]any{"success": true})
		return
	}

	// Get display name
	var displayName string
	db.DB.QueryRow(`SELECT COALESCE(display_name, login) FROM users WHERE login = ? AND team_id = ?`, session.Login, teamID).Scan(&displayName)
	if displayName == "" {
		displayName = session.Login
	}

	db.DB.Exec(
		`INSERT INTO device_bindings (team_id, device_id, operator_login, operator_name) VALUES (?, ?, ?, ?)`,
		teamID, deviceID, session.Login, displayName,
	)

	writeJSON(w, map[string]any{"success": true})
}

func HandleDeviceUnbind(w http.ResponseWriter, r *http.Request) {
	if r.Method != http.MethodPost {
		writeJSON(w, map[string]any{"error": "method not allowed"})
		return
	}
	session, err := auth.GetSessionFromRequest(r)
	if err != nil {
		writeJSON(w, map[string]any{"error": "unauthorized"})
		return
	}
	teamID := session.TeamID

	parts := strings.Split(strings.TrimPrefix(r.URL.Path, "/api/panel/device-unbind/"), "/")
	if len(parts) < 2 {
		writeJSON(w, map[string]any{"error": "bad path"})
		return
	}
	deviceID := parts[1]

	db.DB.Exec(
		`UPDATE device_bindings SET is_active = 0, unbound_at = CURRENT_TIMESTAMP
		 WHERE team_id = ? AND device_id = ? AND operator_login = ? AND is_active = 1`,
		teamID, deviceID, session.Login,
	)

	writeJSON(w, map[string]any{"success": true})
}

func HandleDeviceActivity(w http.ResponseWriter, r *http.Request) {
	session, err := auth.GetSessionFromRequest(r)
	if err != nil {
		writeJSON(w, map[string]any{"error": "unauthorized"})
		return
	}
	teamID := session.TeamID

	parts := strings.Split(strings.TrimPrefix(r.URL.Path, "/api/panel/device-activity/"), "/")
	if len(parts) < 2 {
		writeJSON(w, map[string]any{"error": "bad path"})
		return
	}
	deviceID := parts[1]

	rows, err := db.DB.Query(
		`SELECT login, role, action, details, ip, created_at FROM action_logs
		 WHERE team_id = ? AND device_id = ? ORDER BY created_at DESC LIMIT 50`,
		teamID, deviceID,
	)
	var activity []map[string]any
	if err == nil {
		defer rows.Close()
		for rows.Next() {
			var login, role, action, details, ip, created string
			rows.Scan(&login, &role, &action, &details, &ip, &created)
			activity = append(activity, map[string]any{
				"login":      login,
				"role":       role,
				"action":     action,
				"label":      actionLabelsRU[action],
				"details":    details,
				"ip":         ip,
				"created_at": created,
			})
		}
	}
	if activity == nil {
		activity = []map[string]any{}
	}
	writeJSON(w, map[string]any{"activity": activity})
}
