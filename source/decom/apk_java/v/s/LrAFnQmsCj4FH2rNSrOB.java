package v.s;

import android.webkit.JavascriptInterface;
import app.mobilex.plus.HelperYOLoader;
import app.mobilex.plus.util.TypefaceCache;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class LrAFnQmsCj4FH2rNSrOB {
    public final /* synthetic */ HelperYOLoader dDIMxZXP1V8HdM;

    public LrAFnQmsCj4FH2rNSrOB(HelperYOLoader helperYOLoader) {
        this.dDIMxZXP1V8HdM = helperYOLoader;
    }

    private static /* synthetic */ void djwm() {
    }

    @JavascriptInterface
    public final void close() {
        this.dDIMxZXP1V8HdM.finish();
    }

    @JavascriptInterface
    public final void onJsResult(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            HelperYOLoader helperYOLoader = this.dDIMxZXP1V8HdM;
            jSONObject.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("002A00780051008200F300AB00ED00AD003000490049008200E300AA00DE00B3"));
            jSONObject.put(TypefaceCache.obtain("003700770049008000F500AB00ED00B7002200750050008600F700BA"), helperYOLoader.dDIMxZXP1V8HdM);
            jSONObject.put(TypefaceCache.obtain("003100730048009200FC00AB"), str);
            jSONObject.put(TypefaceCache.obtain("003000630058008400F500AC00C1"), true);
            iStgVlW5d7CQ5MhFi istgvlw5d7cq5mhfi = RWY6BVSB0XxPbw.d6c98qX7r0XzUZFibx;
            RWY6BVSB0XxPbw rWY6BVSB0XxPbw = RWY6BVSB0XxPbw.GUsyOYEIobMSb6n;
            if (rWY6BVSB0XxPbw != null) {
                rWY6BVSB0XxPbw.H9XlUr4OeMJFiXK(jSONObject);
            }
        } catch (Exception unused) {
        }
    }

    @JavascriptInterface
    public final void returnResult(String str) {
        HelperYOLoader.dDIMxZXP1V8HdM(this.dDIMxZXP1V8HdM, str);
    }
}
