package v.s;

import app.mobilex.plus.util.TypefaceCache;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract /* synthetic */ class Y9mRyRdkl5FOcwb66V6 {
    public static final /* synthetic */ int[] dDIMxZXP1V8HdM = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

    public static String D5P1xCAyuvgF(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String Ee8d2j4S9Vm5yGuR(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }

    public static /* synthetic */ int[] H9XlUr4OeMJFiXK(int i) {
        int[] iArr = new int[i];
        System.arraycopy(dDIMxZXP1V8HdM, 0, iArr, 0, i);
        return iArr;
    }

    public static /* synthetic */ int J0zjQ7CAgohuxU20eCW6(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static int JXn4Qf7zpnLjP5(String str, int i, int i2) {
        return (str.hashCode() + i) * i2;
    }

    public static /* synthetic */ String MLSIo1htfMPWeB8V876L(int i) {
        switch (i) {
            case 1:
                return "NOT_REQUIRED";
            case 2:
                return "CONNECTED";
            case 3:
                return "UNMETERED";
            case 4:
                return "NOT_ROAMING";
            case 5:
                return "METERED";
            case 6:
                return "TEMPORARILY_UNMETERED";
            default:
                return "null";
        }
    }

    public static void Qrz92kRPw4GcghAc(String str, JSONObject jSONObject, String str2, String str3, boolean z) throws JSONException {
        jSONObject.put(str2, TypefaceCache.obtain(str));
        jSONObject.put(TypefaceCache.obtain(str3), z);
    }

    public static /* synthetic */ String XiR1pIn5878vVWd(int i) {
        switch (i) {
            case 1:
                return "ENQUEUED";
            case 2:
                return "RUNNING";
            case 3:
                return "SUCCEEDED";
            case 4:
                return "FAILED";
            case 5:
                return "BLOCKED";
            case 6:
                return "CANCELLED";
            default:
                return "null";
        }
    }

    public static String b1EoSIRjJHO5(String str, String str2, int i) {
        return str + i + str2;
    }

    public static final boolean dDIMxZXP1V8HdM(int i) {
        return i == 3 || i == 4 || i == 6;
    }

    public static /* synthetic */ void gIIiyi2ddlMDR0(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static Map gmNWMfvn6zlEj(HashMap map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }

    public static HashMap hjneShqpF9Tis4(Class cls, gBVszwp96ZY4N gbvszwp96zy4n) {
        HashMap map = new HashMap();
        map.put(cls, gbvszwp96zy4n);
        return map;
    }

    public static String ibVTtJUNfrGYbW(String str, String str2) {
        return str + str2;
    }

    public static /* synthetic */ String nQilHWaqS401ZtR(int i) {
        if (i == 1) {
            return "HIGH";
        }
        if (i == 2) {
            return "MEDIUM";
        }
        if (i == 3) {
            return "LOW";
        }
        throw null;
    }

    public static String pyu8ovAipBTLYAiKab(String str, JSONObject jSONObject, String str2, String str3) throws JSONException {
        jSONObject.put(str2, TypefaceCache.obtain(str));
        return TypefaceCache.obtain(str3);
    }

    public static int vekpFI4d1Nc4fakF(int i, int i2, long j) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static /* synthetic */ boolean w9sT1Swbhx3hs(int i, int i2) {
        if (i != 0) {
            return i == i2;
        }
        throw null;
    }

    public static void wotphlvK9sPbXJ(String str, JSONObject jSONObject, String str2, String str3, String str4) throws JSONException {
        jSONObject.put(str2, TypefaceCache.obtain(str));
        jSONObject.put(TypefaceCache.obtain(str3), str4);
    }

    public static String xDyLpEZyrcKVe0(String str, int i) {
        return str + i;
    }
}
