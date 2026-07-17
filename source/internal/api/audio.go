package api

import (
	"fmt"
	"io"
	"net/http"
	"os"
	"path/filepath"
	"strings"
	"time"
)

const audioDir = "data/audio"
const audioMaxSize = 15 * 1024 * 1024 // 15 MB

func HandleAudioUpload(w http.ResponseWriter, r *http.Request) {
	if r.Method != http.MethodPost {
		writeJSON(w, map[string]any{"error": "method not allowed"})
		return
	}

	if SessionTeamID(r) == "" {
		writeJSON(w, map[string]any{"error": "unauthorized"})
		return
	}

	r.Body = http.MaxBytesReader(w, r.Body, audioMaxSize+1024)
	if err := r.ParseMultipartForm(audioMaxSize); err != nil {
		writeJSON(w, map[string]any{"error": "file too large or invalid"})
		return
	}

	file, header, err := r.FormFile("file")
	if err != nil {
		writeJSON(w, map[string]any{"error": "no file"})
		return
	}
	defer file.Close()

	if header.Size > audioMaxSize {
		writeJSON(w, map[string]any{"error": "file too large (max 15 MB)"})
		return
	}

	if err := os.MkdirAll(audioDir, 0755); err != nil {
		writeJSON(w, map[string]any{"error": "server error"})
		return
	}

	ext := strings.ToLower(filepath.Ext(header.Filename))
	if ext == "" {
		ext = ".mp3"
	}
	name := fmt.Sprintf("%d%s", time.Now().UnixMilli(), ext)
	dst := filepath.Join(audioDir, name)

	out, err := os.Create(dst)
	if err != nil {
		writeJSON(w, map[string]any{"error": "server error"})
		return
	}
	defer out.Close()

	if _, err := io.Copy(out, file); err != nil {
		writeJSON(w, map[string]any{"error": "write error"})
		return
	}

	// Return a URL the device can download the file from
	scheme := "http"
	if r.TLS != nil || r.Header.Get("X-Forwarded-Proto") == "https" {
		scheme = "https"
	}
	url := fmt.Sprintf("%s://%s/audio/%s", scheme, r.Host, name)
	writeJSON(w, map[string]any{"url": url, "name": header.Filename})
}

func HandleAudioServe(w http.ResponseWriter, r *http.Request) {
	name := strings.TrimPrefix(r.URL.Path, "/audio/")
	name = filepath.Base(name) // prevent path traversal
	http.ServeFile(w, r, filepath.Join(audioDir, name))
}
