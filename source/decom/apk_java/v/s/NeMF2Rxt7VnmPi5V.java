package v.s;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class NeMF2Rxt7VnmPi5V {
    public static NeMF2Rxt7VnmPi5V Ee8d2j4S9Vm5yGuR;
    public final Context dDIMxZXP1V8HdM;
    public final ScheduledExecutorService w9sT1Swbhx3hs;
    public fuhSwJR8Sgz92H vekpFI4d1Nc4fakF = new fuhSwJR8Sgz92H(this);
    public int JXn4Qf7zpnLjP5 = 1;

    public NeMF2Rxt7VnmPi5V(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.w9sT1Swbhx3hs = scheduledExecutorService;
        this.dDIMxZXP1V8HdM = context.getApplicationContext();
    }

    public static synchronized NeMF2Rxt7VnmPi5V dDIMxZXP1V8HdM(Context context) {
        try {
            if (Ee8d2j4S9Vm5yGuR == null) {
                Ee8d2j4S9Vm5yGuR = new NeMF2Rxt7VnmPi5V(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new okZcyTTNtG3Y("MessengerIpcClient"))));
            }
        } catch (Throwable th) {
            throw th;
        }
        return Ee8d2j4S9Vm5yGuR;
    }

    private static /* synthetic */ void zhmek() {
    }

    public final synchronized SQzPENpgvzKX9IlD w9sT1Swbhx3hs(wx1uy9kWo2J3 wx1uy9kwo2j3) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Queueing ".concat(wx1uy9kwo2j3.toString());
            }
            if (!this.vekpFI4d1Nc4fakF.JXn4Qf7zpnLjP5(wx1uy9kwo2j3)) {
                fuhSwJR8Sgz92H fuhswjr8sgz92h = new fuhSwJR8Sgz92H(this);
                this.vekpFI4d1Nc4fakF = fuhswjr8sgz92h;
                fuhswjr8sgz92h.JXn4Qf7zpnLjP5(wx1uy9kwo2j3);
            }
        } catch (Throwable th) {
            throw th;
        }
        return wx1uy9kwo2j3.w9sT1Swbhx3hs.dDIMxZXP1V8HdM;
    }
}
