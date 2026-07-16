package v.s;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class ANRnCX6eNIDLxM1T0g implements Runnable {
    public final /* synthetic */ Object Ee8d2j4S9Vm5yGuR;
    public final /* synthetic */ Object JXn4Qf7zpnLjP5;
    public final /* synthetic */ Object ibVTtJUNfrGYbW;
    public final /* synthetic */ boolean vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs = 1;
    public final /* synthetic */ Object xDyLpEZyrcKVe0;

    public /* synthetic */ ANRnCX6eNIDLxM1T0g(CloudMessagingReceiver cloudMessagingReceiver, Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.JXn4Qf7zpnLjP5 = cloudMessagingReceiver;
        this.Ee8d2j4S9Vm5yGuR = intent;
        this.xDyLpEZyrcKVe0 = context;
        this.vekpFI4d1Nc4fakF = z;
        this.ibVTtJUNfrGYbW = pendingResult;
    }

    private static /* synthetic */ void drezb() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        int iVekpFI4d1Nc4fakF;
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                HpS8WYFILXNWmicJ1zE hpS8WYFILXNWmicJ1zE = (HpS8WYFILXNWmicJ1zE) this.JXn4Qf7zpnLjP5;
                HpS8WYFILXNWmicJ1zE hpS8WYFILXNWmicJ1zE2 = (HpS8WYFILXNWmicJ1zE) this.Ee8d2j4S9Vm5yGuR;
                if (this.vekpFI4d1Nc4fakF) {
                    hpS8WYFILXNWmicJ1zE2.getClass();
                } else {
                    hpS8WYFILXNWmicJ1zE.getClass();
                }
                View view = (View) this.xDyLpEZyrcKVe0;
                if (view != null) {
                    wLs7ypyhWiPv.vekpFI4d1Nc4fakF(view, (Rect) this.ibVTtJUNfrGYbW);
                    return;
                }
                return;
            default:
                CloudMessagingReceiver cloudMessagingReceiver = (CloudMessagingReceiver) this.JXn4Qf7zpnLjP5;
                Intent intent = (Intent) this.Ee8d2j4S9Vm5yGuR;
                Context context = (Context) this.xDyLpEZyrcKVe0;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.ibVTtJUNfrGYbW;
                try {
                    Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
                    Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    if (intent2 != null) {
                        PendingIntent pendingIntent = (PendingIntent) intent2.getParcelableExtra("pending_intent");
                        if (pendingIntent != null) {
                            try {
                                pendingIntent.send();
                                break;
                            } catch (PendingIntent.CanceledException unused) {
                            }
                        }
                        Bundle extras = intent2.getExtras();
                        if (extras != null) {
                            extras.remove("pending_intent");
                        } else {
                            extras = new Bundle();
                        }
                        String action = intent2.getAction();
                        if (action == "com.google.firebase.messaging.NOTIFICATION_DISMISS" || (action != null && action.equals("com.google.firebase.messaging.NOTIFICATION_DISMISS"))) {
                            cloudMessagingReceiver.w9sT1Swbhx3hs(extras);
                            iVekpFI4d1Nc4fakF = -1;
                        } else {
                            iVekpFI4d1Nc4fakF = 500;
                        }
                    } else {
                        iVekpFI4d1Nc4fakF = cloudMessagingReceiver.vekpFI4d1Nc4fakF(context, intent);
                    }
                    if (this.vekpFI4d1Nc4fakF) {
                        pendingResult.setResultCode(iVekpFI4d1Nc4fakF);
                        break;
                    }
                    return;
                } finally {
                    pendingResult.finish();
                }
        }
    }

    public ANRnCX6eNIDLxM1T0g(HpS8WYFILXNWmicJ1zE hpS8WYFILXNWmicJ1zE, HpS8WYFILXNWmicJ1zE hpS8WYFILXNWmicJ1zE2, boolean z, Sn2d19yOBfyV0rw sn2d19yOBfyV0rw, View view, wLs7ypyhWiPv wls7ypyhwipv, Rect rect) {
        this.JXn4Qf7zpnLjP5 = hpS8WYFILXNWmicJ1zE;
        this.Ee8d2j4S9Vm5yGuR = hpS8WYFILXNWmicJ1zE2;
        this.vekpFI4d1Nc4fakF = z;
        this.xDyLpEZyrcKVe0 = view;
        this.ibVTtJUNfrGYbW = rect;
    }
}
