package v.s;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import android.util.JsonReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class ZnNamfORKnDP4nm4M {
    public final Context dDIMxZXP1V8HdM;
    public final kmnfAB7VRd5sT5u vekpFI4d1Nc4fakF = new kmnfAB7VRd5sT5u();
    public final zzxeBctTPcbuazkjVgh w9sT1Swbhx3hs;
    public static final Pattern JXn4Qf7zpnLjP5 = Pattern.compile("[0-9]+s");
    public static final Charset Ee8d2j4S9Vm5yGuR = Charset.forName("UTF-8");

    public ZnNamfORKnDP4nm4M(Context context, zzxeBctTPcbuazkjVgh zzxebcttpcbuazkjvgh) {
        this.dDIMxZXP1V8HdM = context;
        this.w9sT1Swbhx3hs = zzxebcttpcbuazkjvgh;
    }

    public static tyjTTrZMHzku Ee8d2j4S9Vm5yGuR(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, Ee8d2j4S9Vm5yGuR));
        sfr0Aaw8vBbkmexjHdWK sfr0aaw8vbbkmexjhdwkDDIMxZXP1V8HdM = l3fPij8CYcI7xO.dDIMxZXP1V8HdM();
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        String strNextString3 = null;
        l3fPij8CYcI7xO l3fpij8cyci7xo = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("name")) {
                strNextString = jsonReader.nextString();
            } else if (strNextName.equals("fid")) {
                strNextString2 = jsonReader.nextString();
            } else if (strNextName.equals("refreshToken")) {
                strNextString3 = jsonReader.nextString();
            } else if (strNextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if (strNextName2.equals("token")) {
                        sfr0aaw8vbbkmexjhdwkDDIMxZXP1V8HdM.vekpFI4d1Nc4fakF = jsonReader.nextString();
                    } else if (strNextName2.equals("expiresIn")) {
                        sfr0aaw8vbbkmexjhdwkDDIMxZXP1V8HdM.JXn4Qf7zpnLjP5 = Long.valueOf(JXn4Qf7zpnLjP5(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                l3fPij8CYcI7xO l3fpij8cyci7xoDDIMxZXP1V8HdM = sfr0aaw8vbbkmexjhdwkDDIMxZXP1V8HdM.dDIMxZXP1V8HdM();
                jsonReader.endObject();
                l3fpij8cyci7xo = l3fpij8cyci7xoDDIMxZXP1V8HdM;
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new tyjTTrZMHzku(strNextString, strNextString2, strNextString3, l3fpij8cyci7xo, 1);
    }

    public static long JXn4Qf7zpnLjP5(String str) {
        if (!JXn4Qf7zpnLjP5.matcher(str).matches()) {
            throw new IllegalArgumentException("Invalid Expiration Timestamp.");
        }
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    public static void b1EoSIRjJHO5(HttpURLConnection httpURLConnection) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.2.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            pyu8ovAipBTLYAiKab(httpURLConnection, jSONObject2.toString().getBytes("UTF-8"));
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    public static URL dDIMxZXP1V8HdM(String str) throws SlO9I1a8dU6ZDZ8g {
        try {
            return new URL("https://firebaseinstallations.googleapis.com/v1/" + str);
        } catch (MalformedURLException e) {
            throw new SlO9I1a8dU6ZDZ8g(e.getMessage());
        }
    }

    public static void ibVTtJUNfrGYbW(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.2.0");
            pyu8ovAipBTLYAiKab(httpURLConnection, jSONObject.toString().getBytes("UTF-8"));
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    public static void pyu8ovAipBTLYAiKab(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = httpURLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void w9sT1Swbhx3hs(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, Ee8d2j4S9Vm5yGuR));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                    sb.append('\n');
                }
                str4 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
            } catch (IOException unused) {
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str)) {
            return;
        }
        new StringBuilder(", ").append(str);
    }

    public static l3fPij8CYcI7xO xDyLpEZyrcKVe0(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, Ee8d2j4S9Vm5yGuR));
        sfr0Aaw8vBbkmexjHdWK sfr0aaw8vbbkmexjhdwkDDIMxZXP1V8HdM = l3fPij8CYcI7xO.dDIMxZXP1V8HdM();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("token")) {
                sfr0aaw8vbbkmexjhdwkDDIMxZXP1V8HdM.vekpFI4d1Nc4fakF = jsonReader.nextString();
            } else if (strNextName.equals("expiresIn")) {
                sfr0aaw8vbbkmexjhdwkDDIMxZXP1V8HdM.JXn4Qf7zpnLjP5 = Long.valueOf(JXn4Qf7zpnLjP5(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        sfr0aaw8vbbkmexjhdwkDDIMxZXP1V8HdM.w9sT1Swbhx3hs = 1;
        return sfr0aaw8vbbkmexjhdwkDDIMxZXP1V8HdM.dDIMxZXP1V8HdM();
    }

    private static /* synthetic */ void xbaxvwfpak() {
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a1  */
    public final HttpURLConnection vekpFI4d1Nc4fakF(URL url, String str) throws SlO9I1a8dU6ZDZ8g {
        byte[] bArrDigest;
        MessageDigest messageDigest;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            Context context = this.dDIMxZXP1V8HdM;
            httpURLConnection.addRequestProperty("X-Android-Package", context.getPackageName());
            H3cMHJSEFrHN h3cMHJSEFrHN = (H3cMHJSEFrHN) this.w9sT1Swbhx3hs.get();
            if (h3cMHJSEFrHN != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) SbxdZ6Kq2uhHQ5RPRqm.dDIMxZXP1V8HdM(((TT2KHOpLgEiQtjhkGm) h3cMHJSEFrHN).dDIMxZXP1V8HdM()));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (ExecutionException unused2) {
                }
            }
            String string = null;
            try {
                PackageInfo packageInfo = I5wRTRZp0psyO1L.dDIMxZXP1V8HdM(context).dDIMxZXP1V8HdM.getPackageManager().getPackageInfo(context.getPackageName(), 64);
                Signature[] signatureArr = packageInfo.signatures;
                if (signatureArr == null || signatureArr.length != 1) {
                    bArrDigest = null;
                } else {
                    int i = 0;
                    while (true) {
                        if (i >= 2) {
                            messageDigest = null;
                            break;
                        }
                        try {
                            messageDigest = MessageDigest.getInstance("SHA1");
                            if (messageDigest != null) {
                                break;
                            }
                            i++;
                        } catch (NoSuchAlgorithmException unused3) {
                        }
                    }
                    if (messageDigest == null) {
                        bArrDigest = null;
                    } else {
                        bArrDigest = messageDigest.digest(packageInfo.signatures[0].toByteArray());
                    }
                }
                if (bArrDigest == null) {
                    context.getPackageName();
                } else {
                    int length = bArrDigest.length;
                    StringBuilder sb = new StringBuilder(length + length);
                    for (int i2 = 0; i2 < length; i2++) {
                        char[] cArr = okc5AGRjqrud84oM6d.JXn4Qf7zpnLjP5;
                        sb.append(cArr[(bArrDigest[i2] & 240) >>> 4]);
                        sb.append(cArr[bArrDigest[i2] & 15]);
                    }
                    string = sb.toString();
                }
            } catch (PackageManager.NameNotFoundException unused4) {
                context.getPackageName();
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", string);
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused5) {
            throw new SlO9I1a8dU6ZDZ8g("Firebase Installations Service is unavailable. Please try again later.");
        }
    }
}
