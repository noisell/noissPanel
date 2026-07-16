package v.s;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.firebase.messaging.FirebaseMessaging;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class WtBZXsoeQ5Gr5bcl7Qiw extends BroadcastReceiver {
    public dPIdzwIwS3r9wk9 dDIMxZXP1V8HdM;

    private static /* synthetic */ void dkjmjhoo() {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        dPIdzwIwS3r9wk9 dpidzwiws3r9wk9 = this.dDIMxZXP1V8HdM;
        if (dpidzwiws3r9wk9 != null && dpidzwiws3r9wk9.dDIMxZXP1V8HdM()) {
            dPIdzwIwS3r9wk9 dpidzwiws3r9wk10 = this.dDIMxZXP1V8HdM;
            dpidzwiws3r9wk10.JXn4Qf7zpnLjP5.getClass();
            FirebaseMessaging.w9sT1Swbhx3hs(dpidzwiws3r9wk10, 0L);
            this.dDIMxZXP1V8HdM.JXn4Qf7zpnLjP5.w9sT1Swbhx3hs.unregisterReceiver(this);
            this.dDIMxZXP1V8HdM = null;
        }
    }
}
