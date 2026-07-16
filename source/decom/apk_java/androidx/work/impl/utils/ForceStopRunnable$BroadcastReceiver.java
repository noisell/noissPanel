package androidx.work.impl.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import v.s.BXg2vC5cHAAWqI;
import v.s.fEyMFFyOOvHURJ7To6L;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class ForceStopRunnable$BroadcastReceiver extends BroadcastReceiver {
    static {
        fEyMFFyOOvHURJ7To6L.wotphlvK9sPbXJ("ForceStopRunnable$Rcvr");
    }

    private static /* synthetic */ void scfnjtmx() {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
            return;
        }
        fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
        BXg2vC5cHAAWqI.w9sT1Swbhx3hs(context);
    }
}
