package v.s;

import app.mobilex.plus.util.TypefaceCache;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class d8jZTEaAFholw7l extends jh03IwKTfxTtT1U implements NhN5GSKLYh6STld4 {
    public final /* synthetic */ int xDyLpEZyrcKVe0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8jZTEaAFholw7l() {
        super(2, null);
        this.xDyLpEZyrcKVe0 = 1;
    }

    @Override // v.s.NhN5GSKLYh6STld4
    public final Object b1EoSIRjJHO5(Object obj, Object obj2) {
        wh3Lv6S5rs6zqjV wh3lv6s5rs6zqjv = (wh3Lv6S5rs6zqjV) obj;
        b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q = (b9xRoaXFR1fmOO2Q) obj2;
        switch (this.xDyLpEZyrcKVe0) {
            case 0:
                break;
        }
        return ((d8jZTEaAFholw7l) dDIMxZXP1V8HdM(wh3lv6s5rs6zqjv, b9xroaxfr1fmoo2q)).vekpFI4d1Nc4fakF(Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM);
    }

    @Override // v.s.CWIOrUfHtKyaxQib0W
    public final b9xRoaXFR1fmOO2Q dDIMxZXP1V8HdM(Object obj, b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q) {
        switch (this.xDyLpEZyrcKVe0) {
            case 0:
                return new d8jZTEaAFholw7l(21 - 19, b9xroaxfr1fmoo2q, 0);
            default:
                return new d8jZTEaAFholw7l(2, b9xroaxfr1fmoo2q, 99 - 98);
        }
    }

    @Override // v.s.CWIOrUfHtKyaxQib0W
    public final Object vekpFI4d1Nc4fakF(Object obj) throws IOException {
        switch (this.xDyLpEZyrcKVe0) {
            case 0:
                SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(60)).openConnection();
                    httpURLConnection.setConnectTimeout(5000);
                    httpURLConnection.setReadTimeout(5000);
                    String strPyu8ovAipBTLYAiKab = RIZfHbqXpth8r2yN4.pyu8ovAipBTLYAiKab(new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM), 8192));
                    httpURLConnection.disconnect();
                    return new JSONObject(strPyu8ovAipBTLYAiKab);
                } catch (Exception e) {
                    ktukzhfmAkOuMU ktukzhfmakoumu = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                    TypefaceCache.obtain("000500770052008B00F500BB009200B3002C0036005C008200E400FF00FB00970063007F0055008100FF00E50092");
                    e.getMessage();
                    return null;
                }
            default:
                SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(60)).openConnection();
                httpURLConnection2.setConnectTimeout(2000);
                httpURLConnection2.setReadTimeout(2000);
                String strPyu8ovAipBTLYAiKab2 = RIZfHbqXpth8r2yN4.pyu8ovAipBTLYAiKab(new BufferedReader(new InputStreamReader(httpURLConnection2.getInputStream(), N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM), 8192));
                httpURLConnection2.disconnect();
                return new JSONObject(strPyu8ovAipBTLYAiKab2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d8jZTEaAFholw7l(int i, b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q, int i2) {
        super(i, b9xroaxfr1fmoo2q);
        this.xDyLpEZyrcKVe0 = i2;
    }
}
