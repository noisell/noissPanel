package v.s;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class O0fufoPIziZB7 extends BroadcastReceiver {
    public static final AtomicReference w9sT1Swbhx3hs = new AtomicReference();
    public final Context dDIMxZXP1V8HdM;

    public O0fufoPIziZB7(Context context) {
        this.dDIMxZXP1V8HdM = context;
    }

    private static /* synthetic */ void jahqr() {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (dfwkxUDiclPw1BowH4.D5P1xCAyuvgF) {
            try {
                Iterator it = ((PMsMcTnvHIztNmoglJr) dfwkxUDiclPw1BowH4.hjneShqpF9Tis4.values()).iterator();
                while (it.hasNext()) {
                    ((dfwkxUDiclPw1BowH4) it.next()).JXn4Qf7zpnLjP5();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.dDIMxZXP1V8HdM.unregisterReceiver(this);
    }
}
