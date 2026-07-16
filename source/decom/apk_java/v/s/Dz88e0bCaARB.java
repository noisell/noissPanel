package v.s;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class Dz88e0bCaARB extends BroadcastReceiver {
    public zIvf07vZUCvFR82f8Qd2 dDIMxZXP1V8HdM;

    private static /* synthetic */ void sjkbaesyt() {
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        zIvf07vZUCvFR82f8Qd2 zivf07vzucvfr82f8qd2 = this.dDIMxZXP1V8HdM;
        if (zivf07vzucvfr82f8qd2 == null) {
            return;
        }
        if (zivf07vzucvfr82f8qd2.vekpFI4d1Nc4fakF()) {
            zIvf07vZUCvFR82f8Qd2 zivf07vzucvfr82f8qd3 = this.dDIMxZXP1V8HdM;
            zivf07vzucvfr82f8qd3.Ee8d2j4S9Vm5yGuR.xDyLpEZyrcKVe0.schedule(zivf07vzucvfr82f8qd3, 0L, TimeUnit.SECONDS);
            context.unregisterReceiver(this);
            this.dDIMxZXP1V8HdM = null;
        }
    }
}
