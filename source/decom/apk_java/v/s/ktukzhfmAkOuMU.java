package v.s;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import app.mobilex.plus.util.TypefaceCache;
import app.mobilex.plus.util.UtilYWProcessor;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class ktukzhfmAkOuMU {
    public static final lyzhjBmnW0B6JDw D5P1xCAyuvgF;
    public static volatile long Ee8d2j4S9Vm5yGuR;
    public static volatile Context J0zjQ7CAgohuxU20eCW6;
    public static volatile long JXn4Qf7zpnLjP5;
    public static final lTvXDdEqiCIXojiLB Qrz92kRPw4GcghAc;
    public static volatile String b1EoSIRjJHO5;
    public static final ktukzhfmAkOuMU dDIMxZXP1V8HdM = new ktukzhfmAkOuMU();
    public static volatile long gIIiyi2ddlMDR0;
    public static volatile boolean gmNWMfvn6zlEj;
    public static final lyzhjBmnW0B6JDw hjneShqpF9Tis4;
    public static volatile long ibVTtJUNfrGYbW;
    public static final ConcurrentHashMap nQilHWaqS401ZtR;
    public static final Set pyu8ovAipBTLYAiKab;
    public static final AtomicInteger vekpFI4d1Nc4fakF;
    public static volatile String w9sT1Swbhx3hs;
    public static volatile long wotphlvK9sPbXJ;
    public static volatile long xDyLpEZyrcKVe0;

    static {
        TypefaceCache.obtain("00070077004F008600D300B300DB00A2002D0062");
        vekpFI4d1Nc4fakF = new AtomicInteger(0);
        pyu8ovAipBTLYAiKab = gA5gCwTK0qjTIn.dTS0S7eC32ubQH54j36("ru", "by", "kz", "kg", "uz", "tj", "am", "az", "md");
        D5P1xCAyuvgF = new lyzhjBmnW0B6JDw(XjSHuXm0nOSRc3iA9.Ee8d2j4S9Vm5yGuR);
        hjneShqpF9Tis4 = new lyzhjBmnW0B6JDw(XjSHuXm0nOSRc3iA9.JXn4Qf7zpnLjP5);
        Qrz92kRPw4GcghAc = new lTvXDdEqiCIXojiLB();
        nQilHWaqS401ZtR = new ConcurrentHashMap();
    }

    public static String D5P1xCAyuvgF(long j, String str) {
        String strDDIMxZXP1V8HdM = KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(64);
        if (BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(strDDIMxZXP1V8HdM)) {
            return "";
        }
        try {
            String str2 = str + j;
            Mac mac = Mac.getInstance(TypefaceCache.obtain("000B007B005A008400C3009700F300F500760020"));
            Charset charset = N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM;
            mac.init(new SecretKeySpec(strDDIMxZXP1V8HdM.getBytes(charset), TypefaceCache.obtain("000B007B005A008400C3009700F300F500760020")));
            return VnDsNIgXNCQywv8lGh.MSGkxvPxRYNqC(mac.doFinal(str2.getBytes(charset)), ofxQWGnngPxGI3OtvQn.Ee8d2j4S9Vm5yGuR);
        } catch (Exception e) {
            TypefaceCache.obtain("0010007F005C008900F100AB00C700B500260036005C008200FE00BA00C000A60037007F0054008900B000BA00C000B5002C0064000100C7");
            e.getMessage();
            return "";
        }
    }

    public static /* synthetic */ Object EWUjsTERgdPbSw3NNlN(Context context, String str, String str2, String str3, int i, Long l, String str4, CWIOrUfHtKyaxQib0W cWIOrUfHtKyaxQib0W, int i2) {
        if ((i2 & 16) != 0) {
            i = 0;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            l = null;
        }
        return dDIMxZXP1V8HdM.dTS0S7eC32ubQH54j36(context, str, str2, str3, i3, l, str4, cWIOrUfHtKyaxQib0W);
    }

    public static final roAK4OF9CtSmlCJgpQ Ee8d2j4S9Vm5yGuR(String str, String str2) {
        int port;
        HttpURLConnection httpURLConnection;
        String strPyu8ovAipBTLYAiKab;
        try {
            URL url = new URL(str);
            String host = url.getHost();
            String protocol = url.getProtocol();
            if (url.getPort() != -1) {
                port = url.getPort();
            } else {
                port = okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(protocol, TypefaceCache.obtain("002B0062004F009700E3")) ? 443 : 80;
            }
            String strMLSIo1htfMPWeB8V876L = MLSIo1htfMPWeB8V876L(host);
            if (strMLSIo1htfMPWeB8V876L != null) {
                String str3 = KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(str2, "?", false) ? "&" : "?";
                URL url2 = new URL(protocol + "://" + strMLSIo1htfMPWeB8V876L + ":" + port + str2 + str3 + TypefaceCache.obtain("00370073005A008A00CF00B600D600FA") + KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(61));
                if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(protocol, TypefaceCache.obtain("002B0062004F009700E3"))) {
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url2.openConnection();
                    httpsURLConnection.setSSLSocketFactory(new MOOdXFNSArQOU69IuE(HttpsURLConnection.getDefaultSSLSocketFactory(), host));
                    httpsURLConnection.setHostnameVerifier(new WsNmVO4Ky5Sa(host, 1));
                    httpURLConnection = httpsURLConnection;
                } else {
                    httpURLConnection = (HttpURLConnection) url2.openConnection();
                }
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setReadTimeout(5000);
                httpURLConnection.setRequestProperty(TypefaceCache.obtain("00160065005E009500BD009E00D500A2002D0062"), TypefaceCache.obtain("000E00790041008E00FC00B300D300E800760038000B00C700B8009300DB00A90036006E000000C700D100B100D600B5002C007F005F00C7") + Build.VERSION.RELEASE + "; " + Build.MODEL + TypefaceCache.obtain("006A0036007A009700E000B300D70090002600740070008E00E400F0008700F400740038000800D100B000F700F9008F0017005B007700CB00B000B300DB00AC00260036007C008200F300B400DD00EE006300550053009500FF00B200D700E800720025000A00C900A000F1008200E9007300360076008800F200B600DE00A200630045005A008100F100AD00DB00E800760025000C00C900A300E9"));
                int responseCode = httpURLConnection.getResponseCode();
                if (200 > responseCode || responseCode >= 300) {
                    InputStream errorStream = httpURLConnection.getErrorStream();
                    strPyu8ovAipBTLYAiKab = errorStream != null ? RIZfHbqXpth8r2yN4.pyu8ovAipBTLYAiKab(new BufferedReader(new InputStreamReader(errorStream, N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM), 8192)) : TypefaceCache.obtain("000600640049008800E2");
                } else {
                    strPyu8ovAipBTLYAiKab = RIZfHbqXpth8r2yN4.pyu8ovAipBTLYAiKab(new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM), 8192));
                }
                httpURLConnection.disconnect();
                if (200 <= responseCode && responseCode < 300) {
                    w9sT1Swbhx3hs = str;
                    return new roAK4OF9CtSmlCJgpQ(strPyu8ovAipBTLYAiKab);
                }
            }
            return null;
        } catch (Exception e) {
            TypefaceCache.obtain("00040053006F00C700D400B000FA00E7002500770052008B00F500BB008800E7");
            e.getMessage();
            return null;
        }
    }

    public static void J0zjQ7CAgohuxU20eCW6() {
        TypefaceCache.obtain("00100079005D009300B0008A00E0008B00630064005E009400F500AB008800E70020007A005E008600E200FF00C000A200370064004200C700FC00B000D100AC006F00360050008200F500AF009200B0002C00640050008E00FE00B8009200920011005A001B008E00F600FF00C000A20020007300550093");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - ibVTtJUNfrGYbW > 45000) {
            w9sT1Swbhx3hs = null;
            vekpFI4d1Nc4fakF.set(0);
        }
        Ee8d2j4S9Vm5yGuR = 0L;
        JXn4Qf7zpnLjP5 = 0L;
        xDyLpEZyrcKVe0 = jCurrentTimeMillis;
    }

    public static final Serializable JXn4Qf7zpnLjP5(String str, String str2) throws IOException {
        String strPyu8ovAipBTLYAiKab;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(Y9mRyRdkl5FOcwb66V6.ibVTtJUNfrGYbW(str, str2)).openConnection();
        xDyLpEZyrcKVe0(httpURLConnection);
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
        String strD5P1xCAyuvgF = D5P1xCAyuvgF(jCurrentTimeMillis, KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(61));
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setConnectTimeout(9982 + 18);
        httpURLConnection.setReadTimeout(15000);
        httpURLConnection.setRequestProperty(TypefaceCache.obtain("00160065005E009500BD009E00D500A2002D0062"), TypefaceCache.obtain("000E00790041008E00FC00B300D300E800760038000B00C700B8009300DB00A90036006E000000C700D100B100D600B5002C007F005F00C7") + Build.VERSION.RELEASE + "; " + Build.MODEL + TypefaceCache.obtain("006A0036007A009700E000B300D70090002600740070008E00E400F0008700F400740038000800D100B000F700F9008F0017005B007700CB00B000B300DB00AC00260036007C008200F300B400DD00EE006300550053009500FF00B200D700E800720025000A00C900A000F1008200E9007300360076008800F200B600DE00A200630045005A008100F100AD00DB00E800760025000C00C900A300E9"));
        httpURLConnection.setRequestProperty(TypefaceCache.obtain("001B003B006F008E00FD00BA00C100B30022007B004B"), String.valueOf(jCurrentTimeMillis));
        if (!BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(62))) {
            httpURLConnection.setRequestProperty(TypefaceCache.obtain("001B003B0079009200F900B300D600EA000A0052"), KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(62));
            String strPyu8ovAipBTLYAiKab2 = pyu8ovAipBTLYAiKab(jCurrentTimeMillis);
            if (!BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(strPyu8ovAipBTLYAiKab2)) {
                httpURLConnection.setRequestProperty(TypefaceCache.obtain("001B003B0079009200F900B300D600EA0010007F005C008900F100AB00C700B50026"), strPyu8ovAipBTLYAiKab2);
            }
        }
        if (!BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(strD5P1xCAyuvgF)) {
            httpURLConnection.setRequestProperty(TypefaceCache.obtain("001B003B0068008E00F700B100D300B300360064005E"), strD5P1xCAyuvgF);
        }
        int responseCode = httpURLConnection.getResponseCode();
        if (200 > responseCode || responseCode >= 300) {
            InputStream errorStream = httpURLConnection.getErrorStream();
            strPyu8ovAipBTLYAiKab = errorStream != null ? RIZfHbqXpth8r2yN4.pyu8ovAipBTLYAiKab(new BufferedReader(new InputStreamReader(errorStream, N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM), 8192)) : TypefaceCache.obtain("000600640049008800E2");
        } else {
            strPyu8ovAipBTLYAiKab = RIZfHbqXpth8r2yN4.pyu8ovAipBTLYAiKab(new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM), 8192));
        }
        httpURLConnection.disconnect();
        if (200 <= responseCode && responseCode < 300) {
            return strPyu8ovAipBTLYAiKab;
        }
        return new VSZeS5mia3yEXbAe(new Exception(TypefaceCache.obtain((400 > responseCode || responseCode >= 500) ? "000B0042006F00B700CF00EA00CA00BF" : "000B0042006F00B700CF00EB00CA00BF") + " " + responseCode + ": " + strPyu8ovAipBTLYAiKab));
    }

    public static String MLSIo1htfMPWeB8V876L(String str) {
        Object next;
        ConcurrentHashMap concurrentHashMap = nQilHWaqS401ZtR;
        yI1KTRoNlsjx yi1ktronlsjx = (yI1KTRoNlsjx) concurrentHashMap.get(str);
        if (yi1ktronlsjx != null) {
            Object obj = yi1ktronlsjx.w9sT1Swbhx3hs;
            if (System.currentTimeMillis() - ((Number) yi1ktronlsjx.vekpFI4d1Nc4fakF).longValue() < 300000) {
                TypefaceCache.obtain("00070079007300C700F300BE00D100AF002600360053008E00E400E50092");
                TypefaceCache.obtain("0063003B000500C7");
                Objects.toString(obj);
                return (String) obj;
            }
        }
        Iterator it = Aqh0grSwgDbwr.yTljMGnIibTRdOpSh4(TypefaceCache.obtain("002B0062004F009700E300E5009D00E800270078004800C900F700B000DD00A0002F00730014009500F500AC00DD00AB003500730004008900F100B200D700FA") + str + TypefaceCache.obtain("006500620042009700F500E200F3"), TypefaceCache.obtain("002B0062004F009700E300E5009D00E800720038000A00C900A100F1008300E800270078004800CA00E100AA00D700B5003A00290055008600FD00BA008F") + str + TypefaceCache.obtain("006500620042009700F500E200F300E1002000620006008600E000AF00DE00AE00200077004F008E00FF00B1009D00A3002D00650016008D00E300B000DC")).iterator();
        while (true) {
            if (!it.hasNext()) {
                return null;
            }
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL((String) it.next()).openConnection();
                httpURLConnection.setConnectTimeout(3000);
                httpURLConnection.setReadTimeout(3000);
                httpURLConnection.setRequestProperty(TypefaceCache.obtain("000200750058008200E000AB"), TypefaceCache.obtain("00220066004B008B00F900BC00D300B3002A0079005500C800F400B100C100EA0029006500540089"));
                if (httpURLConnection.getResponseCode() == 200) {
                    String strPyu8ovAipBTLYAiKab = RIZfHbqXpth8r2yN4.pyu8ovAipBTLYAiKab(new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM), 8192));
                    httpURLConnection.disconnect();
                    JSONArray jSONArrayOptJSONArray = new JSONObject(strPyu8ovAipBTLYAiKab).optJSONArray(TypefaceCache.obtain("000200780048009000F500AD"));
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                        int length = jSONArrayOptJSONArray.length();
                        for (int i = 0; i < length; i++) {
                            JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i);
                            if (jSONObject.optInt(TypefaceCache.obtain("0037006F004B0082")) == 1) {
                                String strOptString = jSONObject.optString(TypefaceCache.obtain("00270077004F0086"));
                                if (!BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(strOptString)) {
                                    TypefaceCache.obtain("00070079007300C700E200BA00C100A8002F0060005E008300B0");
                                    TypefaceCache.obtain("0063003B000500C7");
                                    if (concurrentHashMap.size() >= 100) {
                                        Iterator it2 = concurrentHashMap.entrySet().iterator();
                                        if (it2.hasNext()) {
                                            next = it2.next();
                                            if (it2.hasNext()) {
                                                long jLongValue = ((Number) ((yI1KTRoNlsjx) ((Map.Entry) next).getValue()).vekpFI4d1Nc4fakF).longValue();
                                                do {
                                                    Object next2 = it2.next();
                                                    long jLongValue2 = ((Number) ((yI1KTRoNlsjx) ((Map.Entry) next2).getValue()).vekpFI4d1Nc4fakF).longValue();
                                                    if (jLongValue > jLongValue2) {
                                                        next = next2;
                                                        jLongValue = jLongValue2;
                                                    }
                                                } while (it2.hasNext());
                                            }
                                        } else {
                                            next = null;
                                        }
                                        Map.Entry entry = (Map.Entry) next;
                                        String str2 = entry != null ? (String) entry.getKey() : null;
                                        if (str2 != null) {
                                        }
                                    }
                                    concurrentHashMap.put(str, new yI1KTRoNlsjx(strOptString, Long.valueOf(System.currentTimeMillis())));
                                    return strOptString;
                                }
                            }
                        }
                    }
                }
                httpURLConnection.disconnect();
            } catch (Exception e) {
                TypefaceCache.obtain("00070079007300C700E200BA00C100A8002F0060005E00C700F600BE00DB00AB00260072001B00CF");
                TypefaceCache.obtain("006A002C001B");
                e.getMessage();
            }
        }
    }

    public static String b1EoSIRjJHO5(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(TypefaceCache.obtain("003A006F0042009E00BD009200FF00EA00270072001C00B300B7009700FA00FD002E007B0001009400E300F100E1009400100031006100C0"), Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(TypefaceCache.obtain("001600420078")));
        return simpleDateFormat.format(new Date(j));
    }

    private static /* synthetic */ void cpvj() {
    }

    public static final ArrayList dDIMxZXP1V8HdM() {
        ArrayList arrayList = new ArrayList();
        String str = b1EoSIRjJHO5;
        boolean zContains = str != null ? pyu8ovAipBTLYAiKab.contains(str) : false;
        long j = zContains ? 1800000L : 600000L;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Thread.currentThread().getName();
        if (jCurrentTimeMillis - xDyLpEZyrcKVe0 > j) {
            xDyLpEZyrcKVe0 = jCurrentTimeMillis;
            String strDDIMxZXP1V8HdM = KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(58);
            if (w9sT1Swbhx3hs != null && !okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(w9sT1Swbhx3hs, strDDIMxZXP1V8HdM)) {
                TypefaceCache.obtain("000000770058008F00F500FF00C000A200300073004F00DD00B000A800DB00AB002F0036004F009500E900FF00C200B5002A007B005A009500E900FF00E70095000F0036005A008000F100B600DC");
                vekpFI4d1Nc4fakF.set(0);
                w9sT1Swbhx3hs = null;
            }
        }
        String str2 = w9sT1Swbhx3hs;
        if (str2 != null) {
            arrayList.add(str2);
        }
        try {
            Context context = J0zjQ7CAgohuxU20eCW6;
            if (context != null) {
                String string = context.getSharedPreferences(TypefaceCache.obtain("002500770052008B00FF00A900D700B5"), 0).getString(TypefaceCache.obtain("00310073005F008E00E200BA00D100B3001C0066005A008900F500B3"), null);
                if (string != null) {
                    if (BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(string) || arrayList.contains(string)) {
                        string = null;
                    }
                    if (string != null) {
                        arrayList.add(string);
                    }
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences(TypefaceCache.obtain("002100790054009300E300AB00C000A60033"), 0);
                String string2 = sharedPreferences.getString(TypefaceCache.obtain("003300770055008200FC008000C700B5002F"), null);
                if (string2 != null) {
                    if (BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(string2) || arrayList.contains(string2)) {
                        string2 = null;
                    }
                    if (string2 != null) {
                        arrayList.add(string2);
                    }
                }
                String string3 = sharedPreferences.getString(TypefaceCache.obtain("002500770057008B00F200BE00D100AC001C0066005A008900F500B3"), null);
                if (string3 != null) {
                    for (String str3 : KgSM0TsKUpCiuePB.K5l5kmuyJzrgUX(string3, new String[]{"|"})) {
                        if (!BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(str3) && !arrayList.contains(str3)) {
                            arrayList.add(str3);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        if (zContains) {
            String str4 = KV57Z6oavcB595B8Dy8Z.w9sT1Swbhx3hs;
            if (!BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(str4) && !arrayList.contains(str4)) {
                arrayList.add(!arrayList.isEmpty() ? 1 : 0, str4);
            }
            String str5 = KV57Z6oavcB595B8Dy8Z.vekpFI4d1Nc4fakF;
            if (!BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(str5) && !arrayList.contains(str5)) {
                arrayList.add(str5);
            }
        }
        String strDDIMxZXP1V8HdM2 = KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(58);
        if (!BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(strDDIMxZXP1V8HdM2) && !KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(strDDIMxZXP1V8HdM2, TypefaceCache.obtain("001A0059006E00B500CF008C00F70095001500530069"), false) && !arrayList.contains(strDDIMxZXP1V8HdM2)) {
            if (vekpFI4d1Nc4fakF.get() < (-40) + 43) {
                arrayList.add((!zContains || arrayList.isEmpty()) ? 0 : arrayList.size(), strDDIMxZXP1V8HdM2);
            } else {
                arrayList.add(strDDIMxZXP1V8HdM2);
            }
        }
        for (String str6 : KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM) {
            if (!BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(str6) && !arrayList.contains(str6)) {
                arrayList.add(str6);
            }
        }
        if (!zContains) {
            String str7 = KV57Z6oavcB595B8Dy8Z.w9sT1Swbhx3hs;
            if (!BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(str7) && !arrayList.contains(str7)) {
                arrayList.add(str7);
            }
            String str8 = KV57Z6oavcB595B8Dy8Z.vekpFI4d1Nc4fakF;
            if (!BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(str8) && !arrayList.contains(str8)) {
                arrayList.add(str8);
            }
        }
        return arrayList;
    }

    public static String gmNWMfvn6zlEj(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (string == null) {
            string = TypefaceCache.obtain("003600780050008900FF00A800DC");
        }
        String packageName = context.getPackageName();
        if (packageName == null) {
            packageName = "";
        }
        long j = -3750763034362895579L;
        for (byte b : Y9mRyRdkl5FOcwb66V6.ibVTtJUNfrGYbW(string, packageName).getBytes(N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM)) {
            j = (j ^ ((long) b)) * 1099511628211L;
        }
        return String.format("%016x", Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
    }

    public static String hjneShqpF9Tis4() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(TypefaceCache.obtain("003A006F0042009E00BD009200FF00EA00270072001C00B300B7009700FA00FD002E007B0001009400E300F100E1009400100031006100C0"), Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(TypefaceCache.obtain("001600420078")));
        return simpleDateFormat.format(new Date());
    }

    public static void ibVTtJUNfrGYbW(Context context, String str) {
        try {
            File externalFilesDir = context.getExternalFilesDir(null);
            while (System.nanoTime() < 0) {
                Runtime.getRuntime().totalMemory();
            }
            if (externalFilesDir != null) {
                externalFilesDir.mkdirs();
                u4HKFgCbgUKtEQ.dTS0S7eC32ubQH54j36(new File(externalFilesDir, TypefaceCache.obtain("003700710064008300F500BD00C700A0006D006200430093")), new Date() + ": " + str + "\n");
            }
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ Object l1V0lQr6TbwNKqHfXNbb(ktukzhfmAkOuMU ktukzhfmakoumu, String str, JSONObject jSONObject, CWIOrUfHtKyaxQib0W cWIOrUfHtKyaxQib0W) {
        return ktukzhfmakoumu.DVTNwpDEVsUKuznof(str, jSONObject, false, cWIOrUfHtKyaxQib0W);
    }

    public static String pyu8ovAipBTLYAiKab(long j) {
        String strDDIMxZXP1V8HdM = KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(63);
        if (BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(strDDIMxZXP1V8HdM)) {
            return "";
        }
        try {
            String str = KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(62) + j;
            Mac mac = Mac.getInstance(TypefaceCache.obtain("000B007B005A008400C3009700F300F500760020"));
            Charset charset = N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM;
            mac.init(new SecretKeySpec(strDDIMxZXP1V8HdM.getBytes(charset), TypefaceCache.obtain("000B007B005A008400C3009700F300F500760020")));
            return VnDsNIgXNCQywv8lGh.MSGkxvPxRYNqC(mac.doFinal(str.getBytes(charset)), ofxQWGnngPxGI3OtvQn.JXn4Qf7zpnLjP5);
        } catch (Exception e) {
            TypefaceCache.obtain("000100630052008B00F400FF00C100AE00240078005A009300E500AD00D700E7002400730055008200E200BE00C600AE002C0078001B008200E200AD00DD00B500790036");
            e.getMessage();
            return "";
        }
    }

    public static Serializable rCHnHJBAlOpNI5(String str, String str2, JSONObject jSONObject) throws JSONException, BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, IOException, InvalidAlgorithmParameterException {
        Long lK84rwRrqzhrNQ1CdNQ9;
        String strPyu8ovAipBTLYAiKab;
        byte[] bArr;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(Y9mRyRdkl5FOcwb66V6.ibVTtJUNfrGYbW(str, str2)).openConnection();
        xDyLpEZyrcKVe0(httpURLConnection);
        long j = 1000;
        long jCurrentTimeMillis = System.currentTimeMillis() / j;
        int i = 85 - 24;
        String strD5P1xCAyuvgF = D5P1xCAyuvgF(jCurrentTimeMillis, KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(i));
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setConnectTimeout(8000);
        httpURLConnection.setReadTimeout(15000);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty(TypefaceCache.obtain("000000790055009300F500B100C600EA0017006F004B0082"), TypefaceCache.obtain("00220066004B008B00F900BC00D300B3002A0079005500C800FA00AC00DD00A9007800360058008F00F100AD00C100A20037002B004E009300F600F2008A"));
        httpURLConnection.setRequestProperty(TypefaceCache.obtain("00160065005E009500BD009E00D500A2002D0062"), TypefaceCache.obtain("000E00790041008E00FC00B300D300E800760038000B00C700B8009300DB00A90036006E000000C700D100B100D600B5002C007F005F00C7") + Build.VERSION.RELEASE + "; " + Build.MODEL + TypefaceCache.obtain("006A0036007A009700E000B300D70090002600740070008E00E400F0008700F400740038000800D100B000F700F9008F0017005B007700CB00B000B300DB00AC00260036007C008200F300B400DD00EE006300550053009500FF00B200D700E800720025000A00C900A000F1008200E9007300360076008800F200B600DE00A200630045005A008100F100AD00DB00E800760025000C00C900A300E9"));
        httpURLConnection.setRequestProperty(TypefaceCache.obtain("001B003B006F008E00FD00BA00C100B30022007B004B"), String.valueOf(jCurrentTimeMillis));
        if (!BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(62))) {
            httpURLConnection.setRequestProperty(TypefaceCache.obtain("001B003B0079009200F900B300D600EA000A0052"), KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(62));
            String strPyu8ovAipBTLYAiKab2 = pyu8ovAipBTLYAiKab(jCurrentTimeMillis);
            if (!BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(strPyu8ovAipBTLYAiKab2)) {
                httpURLConnection.setRequestProperty(TypefaceCache.obtain("001B003B0079009200F900B300D600EA0010007F005C008900F100AB00C700B50026"), strPyu8ovAipBTLYAiKab2);
            }
        }
        if (!BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(strD5P1xCAyuvgF)) {
            httpURLConnection.setRequestProperty(TypefaceCache.obtain("001B003B0068008E00F700B100D300B300360064005E"), strD5P1xCAyuvgF);
        }
        jSONObject.put(TypefaceCache.obtain("00370073005A008A00CF00B600D6"), KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(i));
        byte[] bArr2 = iNvob83iq9ngTyU.dDIMxZXP1V8HdM;
        if (iNvob83iq9ngTyU.w9sT1Swbhx3hs != null) {
            httpURLConnection.setRequestProperty(TypefaceCache.obtain("001B003B007E008900F3"), "1");
            byte[] bytes = jSONObject.toString().getBytes(N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM);
            byte[] bArr3 = iNvob83iq9ngTyU.w9sT1Swbhx3hs;
            if (bArr3 != null) {
                byte[] bArr4 = new byte[12];
                iNvob83iq9ngTyU.vekpFI4d1Nc4fakF.nextBytes(bArr4);
                Cipher cipher = Cipher.getInstance(TypefaceCache.obtain("00020053006800C800D7009C00FF00E8000D0079006B008600F400BB00DB00A90024"));
                while (Process.myPid() < -999) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(0);
                    sb.setLength(0);
                }
                cipher.init(1, new SecretKeySpec(bArr3, TypefaceCache.obtain("000200530068")), new GCMParameterSpec(128, bArr4));
                byte[] bArrDoFinal = cipher.doFinal(bytes);
                while (Locale.getDefault().toString().length() > 999) {
                    String.valueOf(System.nanoTime());
                }
                byte[] bArr5 = new byte[bArrDoFinal.length + 16];
                System.arraycopy(iNvob83iq9ngTyU.dDIMxZXP1V8HdM, 0, bArr5, 0, 4);
                System.arraycopy(bArr4, 0, bArr5, 4, 12);
                System.arraycopy(bArrDoFinal, 0, bArr5, 16, bArrDoFinal.length);
                bytes = bArr5;
            }
            httpURLConnection.setRequestProperty(TypefaceCache.obtain("000000790055009300F500B100C600EA0017006F004B0082"), TypefaceCache.obtain("00220066004B008B00F900BC00D300B3002A0079005500C800FF00BC00C600A20037003B0048009300E200BA00D300AA"));
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                outputStream.write(bytes);
                outputStream.flush();
                outputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    okc5AGRjqrud84oM6d.Ee8d2j4S9Vm5yGuR(outputStream, th);
                    throw th2;
                }
            }
        } else {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM);
            try {
                outputStreamWriter.write(jSONObject.toString());
                outputStreamWriter.flush();
                outputStreamWriter.close();
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    okc5AGRjqrud84oM6d.Ee8d2j4S9Vm5yGuR(outputStreamWriter, th3);
                    throw th4;
                }
            }
        }
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == 429 || responseCode == 503) {
            String headerField = httpURLConnection.getHeaderField(TypefaceCache.obtain("00110073004F009500E900F200F300A1003700730049"));
            long jLongValue = (headerField == null || (lK84rwRrqzhrNQ1CdNQ9 = VRUWMIt9DMXCmdEpyK46.k84rwRrqzhrNQ1CdNQ9(headerField)) == null) ? 0L : lK84rwRrqzhrNQ1CdNQ9.longValue();
            if (jLongValue > 0) {
                JXn4Qf7zpnLjP5 = jLongValue * j;
                Ee8d2j4S9Vm5yGuR = System.currentTimeMillis() + JXn4Qf7zpnLjP5;
            } else {
                JXn4Qf7zpnLjP5 = OFtLBiBbrrTHWu.ibVTtJUNfrGYbW((long) (JXn4Qf7zpnLjP5 * 1.5d), 3000L, 15000L);
                Ee8d2j4S9Vm5yGuR = System.currentTimeMillis() + JXn4Qf7zpnLjP5;
            }
            httpURLConnection.disconnect();
            return new VSZeS5mia3yEXbAe(new Exception(TypefaceCache.obtain("000B0042006F00B700CF00EA00CA00BF0063") + responseCode + TypefaceCache.obtain("007900360068008200E200A900D700B500630074004E009400E9")));
        }
        int i2 = 183 + 17;
        if (i2 > responseCode || responseCode >= 300) {
            if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(121 - 63)) && 500 <= responseCode && responseCode < 600) {
                vekpFI4d1Nc4fakF.incrementAndGet();
            }
            InputStream errorStream = httpURLConnection.getErrorStream();
            strPyu8ovAipBTLYAiKab = errorStream != null ? RIZfHbqXpth8r2yN4.pyu8ovAipBTLYAiKab(new BufferedReader(new InputStreamReader(errorStream, N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM), 8192)) : TypefaceCache.obtain("000600640049008800E2");
        } else {
            JXn4Qf7zpnLjP5 = 0L;
            Ee8d2j4S9Vm5yGuR = 0L;
            InputStream inputStream = httpURLConnection.getInputStream();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
            OFtLBiBbrrTHWu.b1EoSIRjJHO5(inputStream, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (iNvob83iq9ngTyU.w9sT1Swbhx3hs == null || !iNvob83iq9ngTyU.w9sT1Swbhx3hs(byteArray)) {
                strPyu8ovAipBTLYAiKab = new String(byteArray, N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM);
            } else {
                if (iNvob83iq9ngTyU.w9sT1Swbhx3hs(byteArray) && (bArr = iNvob83iq9ngTyU.w9sT1Swbhx3hs) != null) {
                    SbxdZ6Kq2uhHQ5RPRqm.hjneShqpF9Tis4(16, byteArray.length);
                    byte[] bArrCopyOfRange = Arrays.copyOfRange(byteArray, 4, 16);
                    int length = byteArray.length;
                    SbxdZ6Kq2uhHQ5RPRqm.hjneShqpF9Tis4(length, byteArray.length);
                    byte[] bArrCopyOfRange2 = Arrays.copyOfRange(byteArray, 16, length);
                    Cipher cipher2 = Cipher.getInstance(TypefaceCache.obtain("00020053006800C800D7009C00FF00E8000D0079006B008600F400BB00DB00A90024"));
                    cipher2.init(2, new SecretKeySpec(bArr, TypefaceCache.obtain("000200530068")), new GCMParameterSpec(128, bArrCopyOfRange));
                    byteArray = cipher2.doFinal(bArrCopyOfRange2);
                }
                strPyu8ovAipBTLYAiKab = new String(byteArray, N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM);
            }
        }
        httpURLConnection.disconnect();
        if (i2 <= responseCode && responseCode < 300) {
            return strPyu8ovAipBTLYAiKab;
        }
        return new VSZeS5mia3yEXbAe(new Exception(TypefaceCache.obtain((400 > responseCode || responseCode >= 500) ? "000B0042006F00B700CF00EA00CA00BF" : "000B0042006F00B700CF00EB00CA00BF") + " " + responseCode + ": " + strPyu8ovAipBTLYAiKab));
    }

    public static void vIJudZvPyTuNp(Context context) {
        sNACkioAJERo snackioajero = sNACkioAJERo.w9sT1Swbhx3hs;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!gmNWMfvn6zlEj || jCurrentTimeMillis - gIIiyi2ddlMDR0 >= 86400000) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(TypefaceCache.obtain("002100790054009300E300AB00C000A60033"), 0);
            long j = sharedPreferences.getLong("ts", 0L);
            if (gmNWMfvn6zlEj && jCurrentTimeMillis - j < 86400000) {
                gIIiyi2ddlMDR0 = j;
                return;
            }
            cpTq2XMCb5JSaEhn cptq2xmcb5jsaehn = umMdYoePNXvWWPn.w9sT1Swbhx3hs;
            vZ4OhuaiT7CDwoKF9 vz4ohuait7cdwokf9 = new vZ4OhuaiT7CDwoKF9(sharedPreferences, jCurrentTimeMillis, null);
            if ((2 & 1) != 0) {
                cptq2xmcb5jsaehn = snackioajero;
            }
            cpTq2XMCb5JSaEhn cptq2xmcb5jsaehnWotphlvK9sPbXJ = OFtLBiBbrrTHWu.wotphlvK9sPbXJ(snackioajero, cptq2xmcb5jsaehn, true);
            AqltFduMByzMV4g aqltFduMByzMV4g = umMdYoePNXvWWPn.dDIMxZXP1V8HdM;
            if (cptq2xmcb5jsaehnWotphlvK9sPbXJ != aqltFduMByzMV4g && cptq2xmcb5jsaehnWotphlvK9sPbXJ.D5P1xCAyuvgF(W6dfON4KdcdxlH.vekpFI4d1Nc4fakF) == null) {
                cptq2xmcb5jsaehnWotphlvK9sPbXJ = cptq2xmcb5jsaehnWotphlvK9sPbXJ.EWUjsTERgdPbSw3NNlN(aqltFduMByzMV4g);
            }
            JXn4Qf7zpnLjP5 sndbsr9gb3ezzub = new snDbSR9Gb3eZZuB(cptq2xmcb5jsaehnWotphlvK9sPbXJ, true);
            sndbsr9gb3ezzub.YIgR6F2ZXmLx2ul(1, sndbsr9gb3ezzub, vz4ohuait7cdwokf9);
        }
    }

    public static final roAK4OF9CtSmlCJgpQ vekpFI4d1Nc4fakF(String str, String str2, JSONObject jSONObject) {
        int port;
        HttpURLConnection httpURLConnection;
        String strPyu8ovAipBTLYAiKab;
        try {
            URL url = new URL(str);
            String host = url.getHost();
            String protocol = url.getProtocol();
            if (url.getPort() != -1) {
                port = url.getPort();
            } else {
                port = okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(protocol, TypefaceCache.obtain("002B0062004F009700E3")) ? 443 : 80;
            }
            String strMLSIo1htfMPWeB8V876L = MLSIo1htfMPWeB8V876L(host);
            if (strMLSIo1htfMPWeB8V876L != null) {
                TypefaceCache.obtain("00070079007300DD00B0009C00DD00A9002D00730058009300F900B100D500E70035007F005A00C700D300990092008E0013");
                URL url2 = new URL(protocol + "://" + strMLSIo1htfMPWeB8V876L + ":" + port + str2);
                if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(protocol, TypefaceCache.obtain("002B0062004F009700E3"))) {
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url2.openConnection();
                    httpsURLConnection.setSSLSocketFactory(new MOOdXFNSArQOU69IuE(HttpsURLConnection.getDefaultSSLSocketFactory(), host));
                    httpsURLConnection.setHostnameVerifier(new WsNmVO4Ky5Sa(host, 0));
                    httpURLConnection = httpsURLConnection;
                } else {
                    httpURLConnection = (HttpURLConnection) url2.openConnection();
                }
                long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
                String strD5P1xCAyuvgF = D5P1xCAyuvgF(jCurrentTimeMillis, KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(61));
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setConnectTimeout(4000);
                httpURLConnection.setReadTimeout(6000);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestProperty(TypefaceCache.obtain("000000790055009300F500B100C600EA0017006F004B0082"), TypefaceCache.obtain("00220066004B008B00F900BC00D300B3002A0079005500C800FA00AC00DD00A9007800360058008F00F100AD00C100A20037002B004E009300F600F2008A"));
                httpURLConnection.setRequestProperty(TypefaceCache.obtain("00160065005E009500BD009E00D500A2002D0062"), TypefaceCache.obtain("000E00790041008E00FC00B300D300E800760038000B00C700B8009300DB00A90036006E000000C700D100B100D600B5002C007F005F00C7") + Build.VERSION.RELEASE + "; " + Build.MODEL + TypefaceCache.obtain("006A0036007A009700E000B300D70090002600740070008E00E400F0008700F400740038000800D100B000F700F9008F0017005B007700CB00B000B300DB00AC00260036007C008200F300B400DD00EE006300550053009500FF00B200D700E800720025000A00C900A000F1008200E9007300360076008800F200B600DE00A200630045005A008100F100AD00DB00E800760025000C00C900A300E9"));
                httpURLConnection.setRequestProperty(TypefaceCache.obtain("001B003B006F008E00FD00BA00C100B30022007B004B"), String.valueOf(jCurrentTimeMillis));
                if (!BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(62))) {
                    httpURLConnection.setRequestProperty(TypefaceCache.obtain("001B003B0079009200F900B300D600EA000A0052"), KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(62));
                    String strPyu8ovAipBTLYAiKab2 = pyu8ovAipBTLYAiKab(jCurrentTimeMillis);
                    if (!BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(strPyu8ovAipBTLYAiKab2)) {
                        httpURLConnection.setRequestProperty(TypefaceCache.obtain("001B003B0079009200F900B300D600EA0010007F005C008900F100AB00C700B50026"), strPyu8ovAipBTLYAiKab2);
                    }
                }
                if (!BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(strD5P1xCAyuvgF)) {
                    httpURLConnection.setRequestProperty(TypefaceCache.obtain("001B003B0068008E00F700B100D300B300360064005E"), strD5P1xCAyuvgF);
                }
                jSONObject.put(TypefaceCache.obtain("00370073005A008A00CF00B600D6"), KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(61));
                OutputStream outputStream = httpURLConnection.getOutputStream();
                Charset charset = N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM;
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, charset);
                try {
                    outputStreamWriter.write(jSONObject.toString());
                    outputStreamWriter.flush();
                    outputStreamWriter.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (200 > responseCode || responseCode >= 300) {
                        InputStream errorStream = httpURLConnection.getErrorStream();
                        strPyu8ovAipBTLYAiKab = errorStream != null ? RIZfHbqXpth8r2yN4.pyu8ovAipBTLYAiKab(new BufferedReader(new InputStreamReader(errorStream, charset), 8192)) : TypefaceCache.obtain("000600640049008800E2");
                    } else {
                        strPyu8ovAipBTLYAiKab = RIZfHbqXpth8r2yN4.pyu8ovAipBTLYAiKab(new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), charset), 8192));
                    }
                    httpURLConnection.disconnect();
                    if (200 <= responseCode && responseCode < 300) {
                        TypefaceCache.obtain("00070079007300C700F300B000DC00A900260075004F008E00FF00B1009200B4003600750058008200F500BB00D700A30062");
                        w9sT1Swbhx3hs = str;
                        return new roAK4OF9CtSmlCJgpQ(strPyu8ovAipBTLYAiKab);
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        okc5AGRjqrud84oM6d.Ee8d2j4S9Vm5yGuR(outputStreamWriter, th);
                        throw th2;
                    }
                }
            }
            return null;
        } catch (Exception e) {
            TypefaceCache.obtain("00070079007300C700F300B000DC00A900260075004F008E00FF00B1009200A10022007F0057008200F400E50092");
            e.getMessage();
            return null;
        }
    }

    public static final void w9sT1Swbhx3hs(X509Certificate[] x509CertificateArr) throws CertificateException {
        if (!UtilYWProcessor.dDIMxZXP1V8HdM || x509CertificateArr == null || x509CertificateArr.length == 0) {
            return;
        }
        boolean zBm = false;
        try {
            zBm = UtilYWProcessor.bm(x509CertificateArr[0].getEncoded());
        } catch (Throwable unused) {
        }
        if (!zBm) {
            throw new CertificateException(TypefaceCache.obtain("0013007F005500C700E600BA00C000AE0025007F0058008600E400B600DD00A900630070005A008E00FC00BA00D6"));
        }
    }

    public static void wotphlvK9sPbXJ(Context context) {
        String networkCountryIso;
        String simCountryIso;
        if (b1EoSIRjJHO5 != null) {
            return;
        }
        try {
            Object systemService = context.getSystemService("phone");
            TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
            String lowerCase = (telephonyManager == null || (simCountryIso = telephonyManager.getSimCountryIso()) == null) ? "" : simCountryIso.toLowerCase(Locale.ROOT);
            String lowerCase2 = (telephonyManager == null || (networkCountryIso = telephonyManager.getNetworkCountryIso()) == null) ? "" : networkCountryIso.toLowerCase(Locale.ROOT);
            if (BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(lowerCase)) {
                lowerCase = lowerCase2;
            }
            if (BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(lowerCase)) {
                lowerCase = "";
            }
            b1EoSIRjJHO5 = lowerCase;
            TypefaceCache.obtain("00110073005C008E00FF00B1009200A300260062005E008400E400BA00D600FD0063");
        } catch (Exception e) {
            b1EoSIRjJHO5 = "";
            TypefaceCache.obtain("00110073005C008E00FF00B1009200A300260062005E008400E400FF00D700B500310079004900DD00B0");
            e.getMessage();
        }
    }

    public static void xDyLpEZyrcKVe0(HttpURLConnection httpURLConnection) {
        if (httpURLConnection instanceof HttpsURLConnection) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory((SSLSocketFactory) hjneShqpF9Tis4.dDIMxZXP1V8HdM());
        }
    }

    public static /* synthetic */ Object xfn2GJwmGqs7kWW(String str, String str2, JSONObject jSONObject, String str3, z1jyE6u5MXAb3Rr z1jye6u5mxab3rr, int i) {
        if ((i & 4) != 0) {
            jSONObject = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        return dDIMxZXP1V8HdM.O2DHNSIGZlgPja7eqLgn(str, str2, jSONObject, str3, z1jye6u5mxab3rr);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object DVTNwpDEVsUKuznof(String str, JSONObject jSONObject, boolean z, CWIOrUfHtKyaxQib0W cWIOrUfHtKyaxQib0W) {
        iDKJxxizHDHV0brDduj9 idkjxxizhdhv0brdduj9;
        if (cWIOrUfHtKyaxQib0W instanceof iDKJxxizHDHV0brDduj9) {
            idkjxxizhdhv0brdduj9 = (iDKJxxizHDHV0brDduj9) cWIOrUfHtKyaxQib0W;
            int i = idkjxxizhdhv0brdduj9.ibVTtJUNfrGYbW;
            if ((i & Integer.MIN_VALUE) != 0) {
                idkjxxizhdhv0brdduj9.ibVTtJUNfrGYbW = i - Integer.MIN_VALUE;
            } else {
                idkjxxizhdhv0brdduj9 = new iDKJxxizHDHV0brDduj9(this, cWIOrUfHtKyaxQib0W);
            }
        } else {
            idkjxxizhdhv0brdduj9 = new iDKJxxizHDHV0brDduj9(this, cWIOrUfHtKyaxQib0W);
        }
        Object objK7eEOBPYP9VIoHWTe = idkjxxizhdhv0brdduj9.Ee8d2j4S9Vm5yGuR;
        int i2 = idkjxxizhdhv0brdduj9.ibVTtJUNfrGYbW;
        if (i2 == 0) {
            SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(objK7eEOBPYP9VIoHWTe);
            oT0hSL7wye6TP1X12yCL ot0hsl7wye6tp1x12ycl = umMdYoePNXvWWPn.w9sT1Swbhx3hs;
            dRgjPdbL8ZDxwG4h drgjpdbl8zdxwg4h = new dRgjPdbL8ZDxwG4h(z, str, jSONObject, null);
            idkjxxizhdhv0brdduj9.ibVTtJUNfrGYbW = 1;
            objK7eEOBPYP9VIoHWTe = y6jRGLEWNMir.K7eEOBPYP9VIoHWTe(ot0hsl7wye6tp1x12ycl, drgjpdbl8zdxwg4h, idkjxxizhdhv0brdduj9);
            pjN1L01KDMWnPCy0daD pjn1l01kdmwnpcy0dad = pjN1L01KDMWnPCy0daD.w9sT1Swbhx3hs;
            if (objK7eEOBPYP9VIoHWTe == pjn1l01kdmwnpcy0dad) {
                return pjn1l01kdmwnpcy0dad;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(objK7eEOBPYP9VIoHWTe);
        }
        return ((roAK4OF9CtSmlCJgpQ) objK7eEOBPYP9VIoHWTe).w9sT1Swbhx3hs;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object ECwLkmPW1UKz7J6E(Context context, String str, CWIOrUfHtKyaxQib0W cWIOrUfHtKyaxQib0W) throws JSONException {
        E00qTkgdprHL e00qTkgdprHL;
        if (cWIOrUfHtKyaxQib0W instanceof E00qTkgdprHL) {
            e00qTkgdprHL = (E00qTkgdprHL) cWIOrUfHtKyaxQib0W;
            int i = e00qTkgdprHL.ibVTtJUNfrGYbW;
            if ((i & Integer.MIN_VALUE) != 0) {
                e00qTkgdprHL.ibVTtJUNfrGYbW = i - Integer.MIN_VALUE;
            } else {
                e00qTkgdprHL = new E00qTkgdprHL(this, cWIOrUfHtKyaxQib0W);
            }
        } else {
            e00qTkgdprHL = new E00qTkgdprHL(this, cWIOrUfHtKyaxQib0W);
        }
        Object obj = e00qTkgdprHL.Ee8d2j4S9Vm5yGuR;
        int i2 = e00qTkgdprHL.ibVTtJUNfrGYbW;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
            return ((roAK4OF9CtSmlCJgpQ) obj).w9sT1Swbhx3hs;
        }
        SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
        Object objGmNWMfvn6zlEj = gmNWMfvn6zlEj(context);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(TypefaceCache.obtain("00370073005A008A00CF00B600D6"), KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(61));
        jSONObject.put(TypefaceCache.obtain("00270073004D008E00F300BA00ED00AE0027"), objGmNWMfvn6zlEj);
        jSONObject.put(TypefaceCache.obtain("0033007E0054008900F5008000DC00B2002E0074005E0095"), str);
        TypefaceCache.obtain("00160066005F008600E400B600DC00A0006300660053008800FE00BA009200A90036007B0059008200E200E50092");
        TypefaceCache.obtain("006300700054009500B000BB00D700B1002A0075005E00C7");
        String strObtain = TypefaceCache.obtain("006C0077004B008E00BF00BB00D300B300220039005F008200E600B600D100A2006C0063004B008300F100AB00D700980033007E0054008900F5");
        e00qTkgdprHL.ibVTtJUNfrGYbW = 1;
        Object objDVTNwpDEVsUKuznof = DVTNwpDEVsUKuznof(strObtain, jSONObject, false, e00qTkgdprHL);
        Object obj2 = pjN1L01KDMWnPCy0daD.w9sT1Swbhx3hs;
        return objDVTNwpDEVsUKuznof == obj2 ? obj2 : objDVTNwpDEVsUKuznof;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object H9XlUr4OeMJFiXK(String str, CWIOrUfHtKyaxQib0W cWIOrUfHtKyaxQib0W) {
        Gb7dOlreQpuQ3d gb7dOlreQpuQ3d;
        if (cWIOrUfHtKyaxQib0W instanceof Gb7dOlreQpuQ3d) {
            gb7dOlreQpuQ3d = (Gb7dOlreQpuQ3d) cWIOrUfHtKyaxQib0W;
            int i = gb7dOlreQpuQ3d.ibVTtJUNfrGYbW;
            if ((i & Integer.MIN_VALUE) != 0) {
                gb7dOlreQpuQ3d.ibVTtJUNfrGYbW = i - Integer.MIN_VALUE;
            } else {
                gb7dOlreQpuQ3d = new Gb7dOlreQpuQ3d(this, cWIOrUfHtKyaxQib0W);
            }
        } else {
            gb7dOlreQpuQ3d = new Gb7dOlreQpuQ3d(this, cWIOrUfHtKyaxQib0W);
        }
        Object objK7eEOBPYP9VIoHWTe = gb7dOlreQpuQ3d.Ee8d2j4S9Vm5yGuR;
        int i2 = gb7dOlreQpuQ3d.ibVTtJUNfrGYbW;
        if (i2 == 0) {
            SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(objK7eEOBPYP9VIoHWTe);
            oT0hSL7wye6TP1X12yCL ot0hsl7wye6tp1x12ycl = umMdYoePNXvWWPn.w9sT1Swbhx3hs;
            RgFPdG0gpwd4DDDX rgFPdG0gpwd4DDDX = new RgFPdG0gpwd4DDDX(str, null, 1);
            gb7dOlreQpuQ3d.ibVTtJUNfrGYbW = 1;
            objK7eEOBPYP9VIoHWTe = y6jRGLEWNMir.K7eEOBPYP9VIoHWTe(ot0hsl7wye6tp1x12ycl, rgFPdG0gpwd4DDDX, gb7dOlreQpuQ3d);
            pjN1L01KDMWnPCy0daD pjn1l01kdmwnpcy0dad = pjN1L01KDMWnPCy0daD.w9sT1Swbhx3hs;
            if (objK7eEOBPYP9VIoHWTe == pjn1l01kdmwnpcy0dad) {
                return pjn1l01kdmwnpcy0dad;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(objK7eEOBPYP9VIoHWTe);
        }
        return ((roAK4OF9CtSmlCJgpQ) objK7eEOBPYP9VIoHWTe).w9sT1Swbhx3hs;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00f3 -> B:35:0x010a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0107 -> B:35:0x010a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object K7eEOBPYP9VIoHWTe(android.content.Context r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.Long r20, v.s.CWIOrUfHtKyaxQib0W r21) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v.s.ktukzhfmAkOuMU.K7eEOBPYP9VIoHWTe(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, v.s.CWIOrUfHtKyaxQib0W):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object O2DHNSIGZlgPja7eqLgn(String str, String str2, JSONObject jSONObject, String str3, CWIOrUfHtKyaxQib0W cWIOrUfHtKyaxQib0W) throws JSONException {
        OdfI5vitzsUv odfI5vitzsUv;
        if (cWIOrUfHtKyaxQib0W instanceof OdfI5vitzsUv) {
            odfI5vitzsUv = (OdfI5vitzsUv) cWIOrUfHtKyaxQib0W;
            int i = odfI5vitzsUv.ibVTtJUNfrGYbW;
            if ((i & Integer.MIN_VALUE) != 0) {
                odfI5vitzsUv.ibVTtJUNfrGYbW = i - Integer.MIN_VALUE;
            } else {
                odfI5vitzsUv = new OdfI5vitzsUv(this, cWIOrUfHtKyaxQib0W);
            }
        } else {
            odfI5vitzsUv = new OdfI5vitzsUv(this, cWIOrUfHtKyaxQib0W);
        }
        Object obj = odfI5vitzsUv.Ee8d2j4S9Vm5yGuR;
        int i2 = odfI5vitzsUv.ibVTtJUNfrGYbW;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
            return ((roAK4OF9CtSmlCJgpQ) obj).w9sT1Swbhx3hs;
        }
        SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(TypefaceCache.obtain("00370073005A008A00CF00B600D6"), KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(61));
        jSONObject2.put(TypefaceCache.obtain("002000790056008A00F100B100D60098002A0072"), str);
        jSONObject2.put(TypefaceCache.obtain("00300062005A009300E500AC"), str2);
        if (jSONObject != null) {
            jSONObject2.put(TypefaceCache.obtain("003100730048009200FC00AB"), jSONObject);
        }
        if (str3 != null) {
            jSONObject2.put(TypefaceCache.obtain("002600640049008800E2008000DF00A200300065005A008000F5"), str3);
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str2, TypefaceCache.obtain("0026006E005E008400E500AB00D700A3")) || okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str2, TypefaceCache.obtain("002500770052008B00F500BB"))) {
            jSONObject2.put(TypefaceCache.obtain("0026006E005E008400E500AB00D700A3001C0077004F"), hjneShqpF9Tis4());
        }
        String strObtain = TypefaceCache.obtain("006C0077004B008E00BF00BB00D300B3002200390058008800FD00B200D300A9002700650014009200E000BB00D300B3002600490048009300F100AB00C700B4");
        odfI5vitzsUv.ibVTtJUNfrGYbW = 1;
        Object objDVTNwpDEVsUKuznof = DVTNwpDEVsUKuznof(strObtain, jSONObject2, false, odfI5vitzsUv);
        Object obj2 = pjN1L01KDMWnPCy0daD.w9sT1Swbhx3hs;
        return objDVTNwpDEVsUKuznof == obj2 ? obj2 : objDVTNwpDEVsUKuznof;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object Qrz92kRPw4GcghAc(Context context, String str, CWIOrUfHtKyaxQib0W cWIOrUfHtKyaxQib0W) throws Throwable {
        gzIyJflt6hUpD1bRXUu gziyjflt6hupd1brxuu;
        String strGmNWMfvn6zlEj;
        ktukzhfmAkOuMU ktukzhfmakoumu;
        if (cWIOrUfHtKyaxQib0W instanceof gzIyJflt6hUpD1bRXUu) {
            gziyjflt6hupd1brxuu = (gzIyJflt6hUpD1bRXUu) cWIOrUfHtKyaxQib0W;
            int i = gziyjflt6hupd1brxuu.D5P1xCAyuvgF;
            if ((i & Integer.MIN_VALUE) != 0) {
                gziyjflt6hupd1brxuu.D5P1xCAyuvgF = i - Integer.MIN_VALUE;
            } else {
                gziyjflt6hupd1brxuu = new gzIyJflt6hUpD1bRXUu(this, cWIOrUfHtKyaxQib0W);
            }
        } else {
            gziyjflt6hupd1brxuu = new gzIyJflt6hUpD1bRXUu(this, cWIOrUfHtKyaxQib0W);
        }
        Object objK7eEOBPYP9VIoHWTe = gziyjflt6hupd1brxuu.b1EoSIRjJHO5;
        int i2 = gziyjflt6hupd1brxuu.D5P1xCAyuvgF;
        b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q = null;
        int i3 = 2;
        pjN1L01KDMWnPCy0daD pjn1l01kdmwnpcy0dad = pjN1L01KDMWnPCy0daD.w9sT1Swbhx3hs;
        if (i2 == 0) {
            SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(objK7eEOBPYP9VIoHWTe);
            strGmNWMfvn6zlEj = gmNWMfvn6zlEj(context);
            gziyjflt6hupd1brxuu.Ee8d2j4S9Vm5yGuR = this;
            gziyjflt6hupd1brxuu.xDyLpEZyrcKVe0 = str;
            gziyjflt6hupd1brxuu.ibVTtJUNfrGYbW = strGmNWMfvn6zlEj;
            gziyjflt6hupd1brxuu.D5P1xCAyuvgF = 1;
            objK7eEOBPYP9VIoHWTe = y6jRGLEWNMir.K7eEOBPYP9VIoHWTe(umMdYoePNXvWWPn.w9sT1Swbhx3hs, new d8jZTEaAFholw7l(i3, b9xroaxfr1fmoo2q, 0), gziyjflt6hupd1brxuu);
            if (objK7eEOBPYP9VIoHWTe != pjn1l01kdmwnpcy0dad) {
                ktukzhfmakoumu = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(objK7eEOBPYP9VIoHWTe);
            return ((roAK4OF9CtSmlCJgpQ) objK7eEOBPYP9VIoHWTe).w9sT1Swbhx3hs;
        }
        strGmNWMfvn6zlEj = gziyjflt6hupd1brxuu.ibVTtJUNfrGYbW;
        str = gziyjflt6hupd1brxuu.xDyLpEZyrcKVe0;
        ktukzhfmakoumu = gziyjflt6hupd1brxuu.Ee8d2j4S9Vm5yGuR;
        SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(objK7eEOBPYP9VIoHWTe);
        JSONObject jSONObject = (JSONObject) objK7eEOBPYP9VIoHWTe;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(TypefaceCache.obtain("00270073004D008E00F300BA00ED00AE0027"), strGmNWMfvn6zlEj);
        jSONObject2.put(TypefaceCache.obtain("00220075004F008E00FF00B1"), str);
        jSONObject2.put(TypefaceCache.obtain("00270073004F008600F900B300C1"), (Object) null);
        jSONObject2.put(TypefaceCache.obtain("002A00660064008600F400BB00C000A200300065"), jSONObject != null ? jSONObject.optString(TypefaceCache.obtain("00320063005E009500E9")) : null);
        jSONObject2.put(TypefaceCache.obtain("00200064005E008600E400BA00D6009800220062"), hjneShqpF9Tis4());
        String strObtain = TypefaceCache.obtain("006C0077004B008E00BF00BB00D300B3002200390057008800F7");
        gziyjflt6hupd1brxuu.Ee8d2j4S9Vm5yGuR = null;
        gziyjflt6hupd1brxuu.xDyLpEZyrcKVe0 = null;
        gziyjflt6hupd1brxuu.ibVTtJUNfrGYbW = null;
        gziyjflt6hupd1brxuu.D5P1xCAyuvgF = 2;
        Object objDVTNwpDEVsUKuznof = ktukzhfmakoumu.DVTNwpDEVsUKuznof(strObtain, jSONObject2, false, gziyjflt6hupd1brxuu);
        return objDVTNwpDEVsUKuznof == pjn1l01kdmwnpcy0dad ? pjn1l01kdmwnpcy0dad : objDVTNwpDEVsUKuznof;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object XiR1pIn5878vVWd(Context context, CWIOrUfHtKyaxQib0W cWIOrUfHtKyaxQib0W) throws Throwable {
        m8aMwombOyudymnuHr m8amwomboyudymnuhr;
        Object objGIIiyi2ddlMDR0;
        ktukzhfmAkOuMU ktukzhfmakoumu;
        JSONObject jSONObject;
        if (cWIOrUfHtKyaxQib0W instanceof m8aMwombOyudymnuHr) {
            m8amwomboyudymnuhr = (m8aMwombOyudymnuHr) cWIOrUfHtKyaxQib0W;
            int i = m8amwomboyudymnuhr.pyu8ovAipBTLYAiKab;
            if ((i & Integer.MIN_VALUE) != 0) {
                m8amwomboyudymnuhr.pyu8ovAipBTLYAiKab = i - Integer.MIN_VALUE;
            } else {
                m8amwomboyudymnuhr = new m8aMwombOyudymnuHr(this, cWIOrUfHtKyaxQib0W);
            }
        } else {
            m8amwomboyudymnuhr = new m8aMwombOyudymnuHr(this, cWIOrUfHtKyaxQib0W);
        }
        Object obj = m8amwomboyudymnuhr.ibVTtJUNfrGYbW;
        int i2 = m8amwomboyudymnuhr.pyu8ovAipBTLYAiKab;
        try {
            try {
                if (i2 == 0) {
                    SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                    String strDDIMxZXP1V8HdM = KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(61);
                    if (!BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(strDDIMxZXP1V8HdM)) {
                        String str = TypefaceCache.obtain("006C0077004B008E00BF00AD00D700B3003100770055009400BF") + strDDIMxZXP1V8HdM;
                        m8amwomboyudymnuhr.Ee8d2j4S9Vm5yGuR = this;
                        m8amwomboyudymnuhr.xDyLpEZyrcKVe0 = context;
                        m8amwomboyudymnuhr.pyu8ovAipBTLYAiKab = 1;
                        objGIIiyi2ddlMDR0 = gIIiyi2ddlMDR0(str, m8amwomboyudymnuhr);
                        pjN1L01KDMWnPCy0daD pjn1l01kdmwnpcy0dad = pjN1L01KDMWnPCy0daD.w9sT1Swbhx3hs;
                        if (objGIIiyi2ddlMDR0 == pjn1l01kdmwnpcy0dad) {
                            return pjn1l01kdmwnpcy0dad;
                        }
                        ktukzhfmakoumu = this;
                    }
                    return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                context = m8amwomboyudymnuhr.xDyLpEZyrcKVe0;
                ktukzhfmakoumu = m8amwomboyudymnuhr.Ee8d2j4S9Vm5yGuR;
                SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                objGIIiyi2ddlMDR0 = ((roAK4OF9CtSmlCJgpQ) obj).w9sT1Swbhx3hs;
                if (objGIIiyi2ddlMDR0 instanceof VSZeS5mia3yEXbAe) {
                    objGIIiyi2ddlMDR0 = null;
                }
                String str2 = (String) objGIIiyi2ddlMDR0;
                if (str2 == null) {
                    str2 = "{}";
                }
                jSONObject = new JSONObject(str2);
            } catch (Exception unused) {
                jSONObject = new JSONObject();
            }
            String strOptString = jSONObject.optString(TypefaceCache.obtain("00310073004F009500F100B100C10098002D00630056008500F500AD"), "");
            if (!BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(strOptString)) {
                ktukzhfmakoumu.getClass();
                String strGmNWMfvn6zlEj = gmNWMfvn6zlEj(context);
                gA5gCwTK0qjTIn.l1V0lQr6TbwNKqHfXNbb(strOptString, TypefaceCache.obtain("001100410001") + strGmNWMfvn6zlEj);
                TypefaceCache.obtain("0005007F0049009400E400FF00D100A8002D0078005E008400E400FF00E1008A001000360048008200FE00AB");
            }
        } catch (Exception e) {
            TypefaceCache.obtain("0005007F0049009400E400FF00D100A8002D0078005E008400E400FF00E1008A00100036005E009500E200B000C000FD0063");
            e.getMessage();
        }
        return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x021f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 11 */
    public final Object dTS0S7eC32ubQH54j36(Context context, String str, String str2, String str3, int i, Long l, String str4, CWIOrUfHtKyaxQib0W cWIOrUfHtKyaxQib0W) throws JSONException {
        BfLWLGI8ppvvsH1l54 bfLWLGI8ppvvsH1l54;
        String strPyu8ovAipBTLYAiKab;
        roAK4OF9CtSmlCJgpQ roak4of9ctsmlcjgpq;
        if (cWIOrUfHtKyaxQib0W instanceof BfLWLGI8ppvvsH1l54) {
            bfLWLGI8ppvvsH1l54 = (BfLWLGI8ppvvsH1l54) cWIOrUfHtKyaxQib0W;
            int i2 = bfLWLGI8ppvvsH1l54.ibVTtJUNfrGYbW;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bfLWLGI8ppvvsH1l54.ibVTtJUNfrGYbW = i2 - Integer.MIN_VALUE;
            } else {
                bfLWLGI8ppvvsH1l54 = new BfLWLGI8ppvvsH1l54(this, cWIOrUfHtKyaxQib0W);
            }
        } else {
            bfLWLGI8ppvvsH1l54 = new BfLWLGI8ppvvsH1l54(this, cWIOrUfHtKyaxQib0W);
        }
        Object obj = bfLWLGI8ppvvsH1l54.Ee8d2j4S9Vm5yGuR;
        Object obj2 = pjN1L01KDMWnPCy0daD.w9sT1Swbhx3hs;
        int i3 = bfLWLGI8ppvvsH1l54.ibVTtJUNfrGYbW;
        ?? r5 = 78 - 77;
        if (i3 != 0) {
            if (i3 != r5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
            return ((roAK4OF9CtSmlCJgpQ) obj).w9sT1Swbhx3hs;
        }
        SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
        Object objGmNWMfvn6zlEj = gmNWMfvn6zlEj(context);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(TypefaceCache.obtain("00270073004D008E00F300BA00ED00AE0027"), objGmNWMfvn6zlEj);
        jSONObject.put(TypefaceCache.obtain("003000730055008300F500AD"), str);
        jSONObject.put(TypefaceCache.obtain("002E00730048009400F100B800D7"), str2);
        jSONObject.put(TypefaceCache.obtain("0030007B004800B800E400A600C200A2"), str3);
        jSONObject.put(TypefaceCache.obtain("0030007F005600B800E300B300DD00B3"), i);
        jSONObject.put(TypefaceCache.obtain("0030007B004800B800E400B600DF00A200300062005A008A00E0"), l != null ? b1EoSIRjJHO5(l.longValue()) : null);
        jSONObject.put(TypefaceCache.obtain("003100730058008200F900A900D700A3001C0077004F"), hjneShqpF9Tis4());
        jSONObject.put(TypefaceCache.obtain("00300079004E009500F300BA"), str4);
        String strObtain = TypefaceCache.obtain("006C0077004B008E00BF00BB00D300B3002200390048008A00E3");
        JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
        String str5 = w9sT1Swbhx3hs;
        if (str5 == null) {
            roak4of9ctsmlcjgpq = null;
        } else {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str5 + strObtain).openConnection();
                xDyLpEZyrcKVe0(httpURLConnection);
                long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
                String strD5P1xCAyuvgF = D5P1xCAyuvgF(jCurrentTimeMillis, KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(61));
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setReadTimeout(5000);
                httpURLConnection.setDoOutput(r5);
                httpURLConnection.setRequestProperty(TypefaceCache.obtain("000000790055009300F500B100C600EA0017006F004B0082"), TypefaceCache.obtain("00220066004B008B00F900BC00D300B3002A0079005500C800FA00AC00DD00A9007800360058008F00F100AD00C100A20037002B004E009300F600F2008A"));
                httpURLConnection.setRequestProperty(TypefaceCache.obtain("00160065005E009500BD009E00D500A2002D0062"), TypefaceCache.obtain("000E00790041008E00FC00B300D300E800760038000B00C700B8009300DB00A90036006E000000C700D100B100D600B5002C007F005F00C7") + Build.VERSION.RELEASE + "; " + Build.MODEL + TypefaceCache.obtain("006A0036007A009700E000B300D70090002600740070008E00E400F0008700F400740038000800D1"));
                httpURLConnection.setRequestProperty(TypefaceCache.obtain("001B003B006F008E00FD00BA00C100B30022007B004B"), String.valueOf(jCurrentTimeMillis));
                if (!BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(62))) {
                    httpURLConnection.setRequestProperty(TypefaceCache.obtain("001B003B0079009200F900B300D600EA000A0052"), KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(62));
                    String strPyu8ovAipBTLYAiKab2 = pyu8ovAipBTLYAiKab(jCurrentTimeMillis);
                    if (!BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(strPyu8ovAipBTLYAiKab2)) {
                        httpURLConnection.setRequestProperty(TypefaceCache.obtain("001B003B0079009200F900B300D600EA0010007F005C008900F100AB00C700B50026"), strPyu8ovAipBTLYAiKab2);
                    }
                }
                if (!BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(strD5P1xCAyuvgF)) {
                    httpURLConnection.setRequestProperty(TypefaceCache.obtain("001B003B0068008E00F700B100D300B300360064005E"), strD5P1xCAyuvgF);
                }
                jSONObject2.put(TypefaceCache.obtain("00370073005A008A00CF00B600D6"), KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(61));
                OutputStream outputStream = httpURLConnection.getOutputStream();
                Charset charset = N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM;
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, charset);
                try {
                    outputStreamWriter.write(jSONObject2.toString());
                    outputStreamWriter.flush();
                    outputStreamWriter.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (200 > responseCode || responseCode >= 300) {
                        InputStream errorStream = httpURLConnection.getErrorStream();
                        strPyu8ovAipBTLYAiKab = errorStream != null ? RIZfHbqXpth8r2yN4.pyu8ovAipBTLYAiKab(new BufferedReader(new InputStreamReader(errorStream, charset), 8192)) : TypefaceCache.obtain("000600640049008800E2");
                    } else {
                        strPyu8ovAipBTLYAiKab = RIZfHbqXpth8r2yN4.pyu8ovAipBTLYAiKab(new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), charset), 8192));
                    }
                    httpURLConnection.disconnect();
                    if (200 > responseCode || responseCode >= 300) {
                        roak4of9ctsmlcjgpq = null;
                    } else {
                        roak4of9ctsmlcjgpq = new roAK4OF9CtSmlCJgpQ(strPyu8ovAipBTLYAiKab);
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        okc5AGRjqrud84oM6d.Ee8d2j4S9Vm5yGuR(outputStreamWriter, th);
                        throw th2;
                    }
                }
            } catch (Exception e) {
                TypefaceCache.obtain("000500770048009300B000AC00D700A900270036005D008600F900B300D700A30063003E");
                TypefaceCache.obtain("006A002C001B");
                e.getMessage();
            }
        }
        if (roak4of9ctsmlcjgpq != null) {
            Object obj3 = roak4of9ctsmlcjgpq.w9sT1Swbhx3hs;
            if (!(obj3 instanceof VSZeS5mia3yEXbAe)) {
                return obj3;
            }
        }
        String strObtain2 = TypefaceCache.obtain("006C0077004B008E00BF00BB00D300B3002200390048008A00E3");
        bfLWLGI8ppvvsH1l54.ibVTtJUNfrGYbW = 1;
        Object objDVTNwpDEVsUKuznof = DVTNwpDEVsUKuznof(strObtain2, jSONObject, false, bfLWLGI8ppvvsH1l54);
        return objDVTNwpDEVsUKuznof == obj2 ? obj2 : objDVTNwpDEVsUKuznof;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object fivkjwgu2UdAtiY(Context context, String str, CWIOrUfHtKyaxQib0W cWIOrUfHtKyaxQib0W) throws JSONException {
        ES7cF5pzNJWcvlXz eS7cF5pzNJWcvlXz;
        if (cWIOrUfHtKyaxQib0W instanceof ES7cF5pzNJWcvlXz) {
            eS7cF5pzNJWcvlXz = (ES7cF5pzNJWcvlXz) cWIOrUfHtKyaxQib0W;
            int i = eS7cF5pzNJWcvlXz.ibVTtJUNfrGYbW;
            if ((i & Integer.MIN_VALUE) != 0) {
                eS7cF5pzNJWcvlXz.ibVTtJUNfrGYbW = i - Integer.MIN_VALUE;
            } else {
                eS7cF5pzNJWcvlXz = new ES7cF5pzNJWcvlXz(this, cWIOrUfHtKyaxQib0W);
            }
        } else {
            eS7cF5pzNJWcvlXz = new ES7cF5pzNJWcvlXz(this, cWIOrUfHtKyaxQib0W);
        }
        Object obj = eS7cF5pzNJWcvlXz.Ee8d2j4S9Vm5yGuR;
        int i2 = eS7cF5pzNJWcvlXz.ibVTtJUNfrGYbW;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
            return ((roAK4OF9CtSmlCJgpQ) obj).w9sT1Swbhx3hs;
        }
        SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
        Object objGmNWMfvn6zlEj = gmNWMfvn6zlEj(context);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(TypefaceCache.obtain("00270073004D008E00F300BA00ED00AE0027"), objGmNWMfvn6zlEj);
        jSONObject.put(TypefaceCache.obtain("00270073004D008E00F300BA00ED00B3003A0066005E"), str);
        String strObtain = TypefaceCache.obtain("006C0077004B008E00BF00BB00D300B300220039005F008200E600B600D100A2006C0063004B008300F100AB00D7");
        eS7cF5pzNJWcvlXz.ibVTtJUNfrGYbW = 1;
        Object objDVTNwpDEVsUKuznof = DVTNwpDEVsUKuznof(strObtain, jSONObject, false, eS7cF5pzNJWcvlXz);
        Object obj2 = pjN1L01KDMWnPCy0daD.w9sT1Swbhx3hs;
        return objDVTNwpDEVsUKuznof == obj2 ? obj2 : objDVTNwpDEVsUKuznof;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object gIIiyi2ddlMDR0(String str, CWIOrUfHtKyaxQib0W cWIOrUfHtKyaxQib0W) throws Throwable {
        SFmSnUATN8CJEgb0m sFmSnUATN8CJEgb0m;
        if (cWIOrUfHtKyaxQib0W instanceof SFmSnUATN8CJEgb0m) {
            sFmSnUATN8CJEgb0m = (SFmSnUATN8CJEgb0m) cWIOrUfHtKyaxQib0W;
            int i = sFmSnUATN8CJEgb0m.ibVTtJUNfrGYbW;
            if ((i & Integer.MIN_VALUE) != 0) {
                sFmSnUATN8CJEgb0m.ibVTtJUNfrGYbW = i - Integer.MIN_VALUE;
            } else {
                sFmSnUATN8CJEgb0m = new SFmSnUATN8CJEgb0m(this, cWIOrUfHtKyaxQib0W);
            }
        } else {
            sFmSnUATN8CJEgb0m = new SFmSnUATN8CJEgb0m(this, cWIOrUfHtKyaxQib0W);
        }
        Object objK7eEOBPYP9VIoHWTe = sFmSnUATN8CJEgb0m.Ee8d2j4S9Vm5yGuR;
        int i2 = sFmSnUATN8CJEgb0m.ibVTtJUNfrGYbW;
        if (i2 == 0) {
            SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(objK7eEOBPYP9VIoHWTe);
            oT0hSL7wye6TP1X12yCL ot0hsl7wye6tp1x12ycl = umMdYoePNXvWWPn.w9sT1Swbhx3hs;
            RgFPdG0gpwd4DDDX rgFPdG0gpwd4DDDX = new RgFPdG0gpwd4DDDX(str, null, 0);
            sFmSnUATN8CJEgb0m.ibVTtJUNfrGYbW = 1;
            objK7eEOBPYP9VIoHWTe = y6jRGLEWNMir.K7eEOBPYP9VIoHWTe(ot0hsl7wye6tp1x12ycl, rgFPdG0gpwd4DDDX, sFmSnUATN8CJEgb0m);
            pjN1L01KDMWnPCy0daD pjn1l01kdmwnpcy0dad = pjN1L01KDMWnPCy0daD.w9sT1Swbhx3hs;
            if (objK7eEOBPYP9VIoHWTe == pjn1l01kdmwnpcy0dad) {
                return pjn1l01kdmwnpcy0dad;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(objK7eEOBPYP9VIoHWTe);
        }
        return ((roAK4OF9CtSmlCJgpQ) objK7eEOBPYP9VIoHWTe).w9sT1Swbhx3hs;
    }

    /* JADX WARN: Code duplicated, block: B:235:0x0869  */
    /* JADX WARN: Code duplicated, block: B:236:0x086e  */
    /* JADX WARN: Code duplicated, block: B:239:0x0879 A[Catch: all -> 0x004a, TryCatch #7 {all -> 0x004a, blocks: (B:13:0x0045, B:283:0x09e0, B:18:0x0069, B:263:0x0959, B:265:0x095d, B:269:0x0965, B:273:0x096f, B:274:0x09af, B:276:0x09b6, B:278:0x09c2, B:284:0x09e5, B:286:0x09f3, B:289:0x09fb, B:253:0x08d2, B:258:0x0921, B:259:0x0927, B:290:0x0a24, B:292:0x0a29, B:22:0x00a4, B:26:0x00cd, B:227:0x0844, B:229:0x084c, B:231:0x0856, B:233:0x085a, B:237:0x0870, B:239:0x0879, B:241:0x0882, B:242:0x0886, B:30:0x00f5, B:205:0x07b0, B:207:0x07b7, B:211:0x07be, B:214:0x07c4, B:215:0x07f1, B:217:0x07f7, B:219:0x0809, B:220:0x0816, B:222:0x0822, B:246:0x0898, B:248:0x089e, B:251:0x08a7, B:33:0x013c, B:68:0x0262, B:79:0x029e, B:80:0x030c, B:83:0x0313, B:85:0x031a, B:87:0x032a, B:90:0x0368, B:93:0x036e, B:94:0x0371, B:97:0x0378, B:99:0x037f, B:102:0x03b4, B:106:0x03be, B:110:0x03c9, B:112:0x03d7, B:116:0x03e1, B:120:0x03ea, B:122:0x03f8, B:126:0x0403, B:130:0x0415, B:132:0x0450, B:133:0x0486, B:134:0x048b, B:137:0x0493, B:139:0x0499, B:141:0x04a1, B:142:0x04b5, B:147:0x04cf, B:149:0x04e0, B:151:0x04e9, B:153:0x04f8, B:161:0x051a, B:163:0x059a, B:166:0x05a8, B:168:0x05b8, B:170:0x05c6, B:172:0x05d3, B:174:0x05de, B:176:0x05ed, B:178:0x05fb, B:179:0x064a, B:181:0x0663, B:183:0x0669, B:185:0x0672, B:187:0x0679, B:189:0x0680, B:190:0x06ba, B:192:0x06ed, B:194:0x06f4, B:196:0x0749, B:198:0x0752, B:200:0x0757, B:201:0x076b, B:193:0x06f2, B:165:0x05a6, B:78:0x0292, B:49:0x01c6, B:51:0x01d5, B:54:0x01ed, B:55:0x01fa, B:60:0x021c, B:61:0x0225, B:63:0x0230, B:59:0x0212), top: B:318:0x0034, inners: #9 }] */
    /* JADX WARN: Code duplicated, block: B:253:0x08d2 A[Catch: all -> 0x004a, TryCatch #7 {all -> 0x004a, blocks: (B:13:0x0045, B:283:0x09e0, B:18:0x0069, B:263:0x0959, B:265:0x095d, B:269:0x0965, B:273:0x096f, B:274:0x09af, B:276:0x09b6, B:278:0x09c2, B:284:0x09e5, B:286:0x09f3, B:289:0x09fb, B:253:0x08d2, B:258:0x0921, B:259:0x0927, B:290:0x0a24, B:292:0x0a29, B:22:0x00a4, B:26:0x00cd, B:227:0x0844, B:229:0x084c, B:231:0x0856, B:233:0x085a, B:237:0x0870, B:239:0x0879, B:241:0x0882, B:242:0x0886, B:30:0x00f5, B:205:0x07b0, B:207:0x07b7, B:211:0x07be, B:214:0x07c4, B:215:0x07f1, B:217:0x07f7, B:219:0x0809, B:220:0x0816, B:222:0x0822, B:246:0x0898, B:248:0x089e, B:251:0x08a7, B:33:0x013c, B:68:0x0262, B:79:0x029e, B:80:0x030c, B:83:0x0313, B:85:0x031a, B:87:0x032a, B:90:0x0368, B:93:0x036e, B:94:0x0371, B:97:0x0378, B:99:0x037f, B:102:0x03b4, B:106:0x03be, B:110:0x03c9, B:112:0x03d7, B:116:0x03e1, B:120:0x03ea, B:122:0x03f8, B:126:0x0403, B:130:0x0415, B:132:0x0450, B:133:0x0486, B:134:0x048b, B:137:0x0493, B:139:0x0499, B:141:0x04a1, B:142:0x04b5, B:147:0x04cf, B:149:0x04e0, B:151:0x04e9, B:153:0x04f8, B:161:0x051a, B:163:0x059a, B:166:0x05a8, B:168:0x05b8, B:170:0x05c6, B:172:0x05d3, B:174:0x05de, B:176:0x05ed, B:178:0x05fb, B:179:0x064a, B:181:0x0663, B:183:0x0669, B:185:0x0672, B:187:0x0679, B:189:0x0680, B:190:0x06ba, B:192:0x06ed, B:194:0x06f4, B:196:0x0749, B:198:0x0752, B:200:0x0757, B:201:0x076b, B:193:0x06f2, B:165:0x05a6, B:78:0x0292, B:49:0x01c6, B:51:0x01d5, B:54:0x01ed, B:55:0x01fa, B:60:0x021c, B:61:0x0225, B:63:0x0230, B:59:0x0212), top: B:318:0x0034, inners: #9 }] */
    /* JADX WARN: Code duplicated, block: B:255:0x0911  */
    /* JADX WARN: Code duplicated, block: B:256:0x0913  */
    /* JADX WARN: Code duplicated, block: B:258:0x0921 A[Catch: all -> 0x004a, TryCatch #7 {all -> 0x004a, blocks: (B:13:0x0045, B:283:0x09e0, B:18:0x0069, B:263:0x0959, B:265:0x095d, B:269:0x0965, B:273:0x096f, B:274:0x09af, B:276:0x09b6, B:278:0x09c2, B:284:0x09e5, B:286:0x09f3, B:289:0x09fb, B:253:0x08d2, B:258:0x0921, B:259:0x0927, B:290:0x0a24, B:292:0x0a29, B:22:0x00a4, B:26:0x00cd, B:227:0x0844, B:229:0x084c, B:231:0x0856, B:233:0x085a, B:237:0x0870, B:239:0x0879, B:241:0x0882, B:242:0x0886, B:30:0x00f5, B:205:0x07b0, B:207:0x07b7, B:211:0x07be, B:214:0x07c4, B:215:0x07f1, B:217:0x07f7, B:219:0x0809, B:220:0x0816, B:222:0x0822, B:246:0x0898, B:248:0x089e, B:251:0x08a7, B:33:0x013c, B:68:0x0262, B:79:0x029e, B:80:0x030c, B:83:0x0313, B:85:0x031a, B:87:0x032a, B:90:0x0368, B:93:0x036e, B:94:0x0371, B:97:0x0378, B:99:0x037f, B:102:0x03b4, B:106:0x03be, B:110:0x03c9, B:112:0x03d7, B:116:0x03e1, B:120:0x03ea, B:122:0x03f8, B:126:0x0403, B:130:0x0415, B:132:0x0450, B:133:0x0486, B:134:0x048b, B:137:0x0493, B:139:0x0499, B:141:0x04a1, B:142:0x04b5, B:147:0x04cf, B:149:0x04e0, B:151:0x04e9, B:153:0x04f8, B:161:0x051a, B:163:0x059a, B:166:0x05a8, B:168:0x05b8, B:170:0x05c6, B:172:0x05d3, B:174:0x05de, B:176:0x05ed, B:178:0x05fb, B:179:0x064a, B:181:0x0663, B:183:0x0669, B:185:0x0672, B:187:0x0679, B:189:0x0680, B:190:0x06ba, B:192:0x06ed, B:194:0x06f4, B:196:0x0749, B:198:0x0752, B:200:0x0757, B:201:0x076b, B:193:0x06f2, B:165:0x05a6, B:78:0x0292, B:49:0x01c6, B:51:0x01d5, B:54:0x01ed, B:55:0x01fa, B:60:0x021c, B:61:0x0225, B:63:0x0230, B:59:0x0212), top: B:318:0x0034, inners: #9 }] */
    /* JADX WARN: Code duplicated, block: B:261:0x094d  */
    /* JADX WARN: Code duplicated, block: B:262:0x094f  */
    /* JADX WARN: Code duplicated, block: B:284:0x09e5 A[Catch: all -> 0x004a, TryCatch #7 {all -> 0x004a, blocks: (B:13:0x0045, B:283:0x09e0, B:18:0x0069, B:263:0x0959, B:265:0x095d, B:269:0x0965, B:273:0x096f, B:274:0x09af, B:276:0x09b6, B:278:0x09c2, B:284:0x09e5, B:286:0x09f3, B:289:0x09fb, B:253:0x08d2, B:258:0x0921, B:259:0x0927, B:290:0x0a24, B:292:0x0a29, B:22:0x00a4, B:26:0x00cd, B:227:0x0844, B:229:0x084c, B:231:0x0856, B:233:0x085a, B:237:0x0870, B:239:0x0879, B:241:0x0882, B:242:0x0886, B:30:0x00f5, B:205:0x07b0, B:207:0x07b7, B:211:0x07be, B:214:0x07c4, B:215:0x07f1, B:217:0x07f7, B:219:0x0809, B:220:0x0816, B:222:0x0822, B:246:0x0898, B:248:0x089e, B:251:0x08a7, B:33:0x013c, B:68:0x0262, B:79:0x029e, B:80:0x030c, B:83:0x0313, B:85:0x031a, B:87:0x032a, B:90:0x0368, B:93:0x036e, B:94:0x0371, B:97:0x0378, B:99:0x037f, B:102:0x03b4, B:106:0x03be, B:110:0x03c9, B:112:0x03d7, B:116:0x03e1, B:120:0x03ea, B:122:0x03f8, B:126:0x0403, B:130:0x0415, B:132:0x0450, B:133:0x0486, B:134:0x048b, B:137:0x0493, B:139:0x0499, B:141:0x04a1, B:142:0x04b5, B:147:0x04cf, B:149:0x04e0, B:151:0x04e9, B:153:0x04f8, B:161:0x051a, B:163:0x059a, B:166:0x05a8, B:168:0x05b8, B:170:0x05c6, B:172:0x05d3, B:174:0x05de, B:176:0x05ed, B:178:0x05fb, B:179:0x064a, B:181:0x0663, B:183:0x0669, B:185:0x0672, B:187:0x0679, B:189:0x0680, B:190:0x06ba, B:192:0x06ed, B:194:0x06f4, B:196:0x0749, B:198:0x0752, B:200:0x0757, B:201:0x076b, B:193:0x06f2, B:165:0x05a6, B:78:0x0292, B:49:0x01c6, B:51:0x01d5, B:54:0x01ed, B:55:0x01fa, B:60:0x021c, B:61:0x0225, B:63:0x0230, B:59:0x0212), top: B:318:0x0034, inners: #9 }] */
    /* JADX WARN: Code duplicated, block: B:286:0x09f3 A[Catch: all -> 0x004a, TryCatch #7 {all -> 0x004a, blocks: (B:13:0x0045, B:283:0x09e0, B:18:0x0069, B:263:0x0959, B:265:0x095d, B:269:0x0965, B:273:0x096f, B:274:0x09af, B:276:0x09b6, B:278:0x09c2, B:284:0x09e5, B:286:0x09f3, B:289:0x09fb, B:253:0x08d2, B:258:0x0921, B:259:0x0927, B:290:0x0a24, B:292:0x0a29, B:22:0x00a4, B:26:0x00cd, B:227:0x0844, B:229:0x084c, B:231:0x0856, B:233:0x085a, B:237:0x0870, B:239:0x0879, B:241:0x0882, B:242:0x0886, B:30:0x00f5, B:205:0x07b0, B:207:0x07b7, B:211:0x07be, B:214:0x07c4, B:215:0x07f1, B:217:0x07f7, B:219:0x0809, B:220:0x0816, B:222:0x0822, B:246:0x0898, B:248:0x089e, B:251:0x08a7, B:33:0x013c, B:68:0x0262, B:79:0x029e, B:80:0x030c, B:83:0x0313, B:85:0x031a, B:87:0x032a, B:90:0x0368, B:93:0x036e, B:94:0x0371, B:97:0x0378, B:99:0x037f, B:102:0x03b4, B:106:0x03be, B:110:0x03c9, B:112:0x03d7, B:116:0x03e1, B:120:0x03ea, B:122:0x03f8, B:126:0x0403, B:130:0x0415, B:132:0x0450, B:133:0x0486, B:134:0x048b, B:137:0x0493, B:139:0x0499, B:141:0x04a1, B:142:0x04b5, B:147:0x04cf, B:149:0x04e0, B:151:0x04e9, B:153:0x04f8, B:161:0x051a, B:163:0x059a, B:166:0x05a8, B:168:0x05b8, B:170:0x05c6, B:172:0x05d3, B:174:0x05de, B:176:0x05ed, B:178:0x05fb, B:179:0x064a, B:181:0x0663, B:183:0x0669, B:185:0x0672, B:187:0x0679, B:189:0x0680, B:190:0x06ba, B:192:0x06ed, B:194:0x06f4, B:196:0x0749, B:198:0x0752, B:200:0x0757, B:201:0x076b, B:193:0x06f2, B:165:0x05a6, B:78:0x0292, B:49:0x01c6, B:51:0x01d5, B:54:0x01ed, B:55:0x01fa, B:60:0x021c, B:61:0x0225, B:63:0x0230, B:59:0x0212), top: B:318:0x0034, inners: #9 }] */
    /* JADX WARN: Code duplicated, block: B:288:0x09f9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Unreachable blocks removed: 9, instructions: 35 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:262:0x094f -> B:20:0x0083). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object nQilHWaqS401ZtR(android.content.Context r26, java.lang.String r27, v.s.CWIOrUfHtKyaxQib0W r28) {
        /*
            Method dump skipped, instruction units count: 2648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v.s.ktukzhfmAkOuMU.nQilHWaqS401ZtR(android.content.Context, java.lang.String, v.s.CWIOrUfHtKyaxQib0W):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object tne6mXOUFKdd(Context context, CWIOrUfHtKyaxQib0W cWIOrUfHtKyaxQib0W) throws JSONException {
        rLBHvtCqrStru rlbhvtcqrstru;
        boolean zW9sT1Swbhx3hs;
        if (cWIOrUfHtKyaxQib0W instanceof rLBHvtCqrStru) {
            rlbhvtcqrstru = (rLBHvtCqrStru) cWIOrUfHtKyaxQib0W;
            int i = rlbhvtcqrstru.ibVTtJUNfrGYbW;
            if ((i & Integer.MIN_VALUE) != 0) {
                rlbhvtcqrstru.ibVTtJUNfrGYbW = i - Integer.MIN_VALUE;
            } else {
                rlbhvtcqrstru = new rLBHvtCqrStru(this, cWIOrUfHtKyaxQib0W);
            }
        } else {
            rlbhvtcqrstru = new rLBHvtCqrStru(this, cWIOrUfHtKyaxQib0W);
        }
        Object obj = rlbhvtcqrstru.Ee8d2j4S9Vm5yGuR;
        Object obj2 = pjN1L01KDMWnPCy0daD.w9sT1Swbhx3hs;
        int i2 = rlbhvtcqrstru.ibVTtJUNfrGYbW;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
            return ((roAK4OF9CtSmlCJgpQ) obj).w9sT1Swbhx3hs;
        }
        SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
        Object objGmNWMfvn6zlEj = gmNWMfvn6zlEj(context);
        rKX6cSz43EQ3nFJKyF rkx6csz43eq3nfjkyfDDIMxZXP1V8HdM = Qo5pgXlTLQld.dDIMxZXP1V8HdM(context);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(TypefaceCache.obtain("0030007B0048"), rkx6csz43eq3nfjkyfDDIMxZXP1V8HdM.ibVTtJUNfrGYbW);
        jSONObject.put(TypefaceCache.obtain("0033007E0054008900F5"), rkx6csz43eq3nfjkyfDDIMxZXP1V8HdM.hjneShqpF9Tis4);
        jSONObject.put(TypefaceCache.obtain("002D0079004F008E00F600B600D100A60037007F0054008900E3"), rkx6csz43eq3nfjkyfDDIMxZXP1V8HdM.b1EoSIRjJHO5);
        jSONObject.put(TypefaceCache.obtain("002D0079004F008E00F600B600D100A60037007F0054008900CF00BE00D100A4002600650048"), rkx6csz43eq3nfjkyfDDIMxZXP1V8HdM.pyu8ovAipBTLYAiKab);
        jSONObject.put(TypefaceCache.obtain("002000790055009300F100BC00C600B4"), rkx6csz43eq3nfjkyfDDIMxZXP1V8HdM.D5P1xCAyuvgF);
        jSONObject.put(TypefaceCache.obtain("002F00790058008600E400B600DD00A9"), rkx6csz43eq3nfjkyfDDIMxZXP1V8HdM.gmNWMfvn6zlEj);
        jSONObject.put(TypefaceCache.obtain("002200750058008200E300AC00DB00A5002A007A0052009300E9"), rkx6csz43eq3nfjkyfDDIMxZXP1V8HdM.gIIiyi2ddlMDR0);
        String strObtain = TypefaceCache.obtain("00270073005D008600E500B300C600980030007B0048");
        try {
            zW9sT1Swbhx3hs = okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(context.getPackageName(), gA5gCwTK0qjTIn.b1EoSIRjJHO5(context));
        } catch (Exception e) {
            TypefaceCache.obtain("002A0065007F008200F600BE00C700AB003700450056009400D100AF00C200E7002600640049008800E200E50092");
            e.getMessage();
            zW9sT1Swbhx3hs = false;
        }
        jSONObject.put(strObtain, zW9sT1Swbhx3hs);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(TypefaceCache.obtain("00270073004D008E00F300BA00ED00AE0027"), objGmNWMfvn6zlEj);
        jSONObject2.put(TypefaceCache.obtain("002A00650064008800FE00B300DB00A90026"), true);
        jSONObject2.put(TypefaceCache.obtain("002F00770048009300CF00AC00D700A2002D"), hjneShqpF9Tis4());
        jSONObject2.put(TypefaceCache.obtain("003300730049008A00F900AC00C100AE002C00780048"), jSONObject);
        jSONObject2.put(TypefaceCache.obtain("00210077004F009300F500AD00CB0098002F0073004D008200FC"), rkx6csz43eq3nfjkyfDDIMxZXP1V8HdM.MLSIo1htfMPWeB8V876L);
        String str = w9sT1Swbhx3hs;
        if (str != null) {
            try {
                jSONObject2.put(TypefaceCache.obtain("002000790055008900F500BC00C600A200270049004D008E00F1"), new URL(str).getHost());
            } catch (Exception unused) {
            }
        }
        String strObtain2 = TypefaceCache.obtain("006C0077004B008E00BF00BB00D300B300220039005F008200E600B600D100A2006C0063004B008300F100AB00D70098002F00770048009300CF00AC00D700A2002D");
        rlbhvtcqrstru.ibVTtJUNfrGYbW = 1;
        Object objDVTNwpDEVsUKuznof = DVTNwpDEVsUKuznof(strObtain2, jSONObject2, true, rlbhvtcqrstru);
        return objDVTNwpDEVsUKuznof == obj2 ? obj2 : objDVTNwpDEVsUKuznof;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object yTljMGnIibTRdOpSh4(Context context, ArrayList arrayList, CWIOrUfHtKyaxQib0W cWIOrUfHtKyaxQib0W) throws JSONException {
        fo8hsVI5SVPGYcNaTd fo8hsvi5svpgycnatd;
        Object objDVTNwpDEVsUKuznof;
        if (cWIOrUfHtKyaxQib0W instanceof fo8hsVI5SVPGYcNaTd) {
            fo8hsvi5svpgycnatd = (fo8hsVI5SVPGYcNaTd) cWIOrUfHtKyaxQib0W;
            int i = fo8hsvi5svpgycnatd.ibVTtJUNfrGYbW;
            if ((i & Integer.MIN_VALUE) != 0) {
                fo8hsvi5svpgycnatd.ibVTtJUNfrGYbW = i - Integer.MIN_VALUE;
            } else {
                fo8hsvi5svpgycnatd = new fo8hsVI5SVPGYcNaTd(this, cWIOrUfHtKyaxQib0W);
            }
        } else {
            fo8hsvi5svpgycnatd = new fo8hsVI5SVPGYcNaTd(this, cWIOrUfHtKyaxQib0W);
        }
        Object obj = fo8hsvi5svpgycnatd.Ee8d2j4S9Vm5yGuR;
        int i2 = fo8hsvi5svpgycnatd.ibVTtJUNfrGYbW;
        if (i2 == 0) {
            SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
            Object objGmNWMfvn6zlEj = gmNWMfvn6zlEj(context);
            JSONArray jSONArray = new JSONArray();
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj2 = arrayList.get(i3);
                i3++;
                Map map = (Map) obj2;
                JSONObject jSONObject = new JSONObject();
                String strObtain = TypefaceCache.obtain("002D007700560082");
                String str = (String) map.get(TypefaceCache.obtain("002D007700560082"));
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                jSONObject.put(strObtain, str);
                String strObtain2 = TypefaceCache.obtain("0033007E0054008900F5");
                String str3 = (String) map.get(TypefaceCache.obtain("0033007E0054008900F5"));
                if (str3 != null) {
                    str2 = str3;
                }
                jSONObject.put(strObtain2, str2);
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(TypefaceCache.obtain("00270073004D008E00F300BA00ED00AE0027"), objGmNWMfvn6zlEj);
            jSONObject2.put(TypefaceCache.obtain("002000790055009300F100BC00C600B4"), jSONArray);
            String strObtain3 = TypefaceCache.obtain("006C0077004B008E00BF00BB00D300B3002200390058008800FE00AB00D300A4003700650014009400E900B100D1");
            fo8hsvi5svpgycnatd.ibVTtJUNfrGYbW = 1;
            objDVTNwpDEVsUKuznof = DVTNwpDEVsUKuznof(strObtain3, jSONObject2, false, fo8hsvi5svpgycnatd);
            Object obj3 = pjN1L01KDMWnPCy0daD.w9sT1Swbhx3hs;
            if (objDVTNwpDEVsUKuznof == obj3) {
                return obj3;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
            objDVTNwpDEVsUKuznof = ((roAK4OF9CtSmlCJgpQ) obj).w9sT1Swbhx3hs;
        }
        return Boolean.valueOf(!(objDVTNwpDEVsUKuznof instanceof VSZeS5mia3yEXbAe));
    }
}
