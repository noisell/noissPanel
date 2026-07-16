package v.s;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class HEqPccX85NcWnm0 {
    public static String JXn4Qf7zpnLjP5;
    public static hXWTjYzJCr2glJDZJMlR ibVTtJUNfrGYbW;
    public final Context dDIMxZXP1V8HdM;
    public final NotificationManager w9sT1Swbhx3hs;
    public static final Object vekpFI4d1Nc4fakF = new Object();
    public static HashSet Ee8d2j4S9Vm5yGuR = new HashSet();
    public static final Object xDyLpEZyrcKVe0 = new Object();

    public HEqPccX85NcWnm0(Context context) {
        this.dDIMxZXP1V8HdM = context;
        this.w9sT1Swbhx3hs = (NotificationManager) context.getSystemService("notification");
    }

    private static /* synthetic */ void gzrgkqyp() {
    }

    public final void dDIMxZXP1V8HdM(int i, Notification notification) {
        NotificationManager notificationManager = this.w9sT1Swbhx3hs;
        Bundle bundle = notification.extras;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            notificationManager.notify(null, i, notification);
            return;
        }
        AD5cUFNRRldgyKWT aD5cUFNRRldgyKWT = new AD5cUFNRRldgyKWT(this.dDIMxZXP1V8HdM.getPackageName(), i, notification);
        synchronized (xDyLpEZyrcKVe0) {
            try {
                if (ibVTtJUNfrGYbW == null) {
                    ibVTtJUNfrGYbW = new hXWTjYzJCr2glJDZJMlR(this.dDIMxZXP1V8HdM.getApplicationContext());
                }
                ibVTtJUNfrGYbW.w9sT1Swbhx3hs.obtainMessage(0, aD5cUFNRRldgyKWT).sendToTarget();
            } catch (Throwable th) {
                throw th;
            }
        }
        notificationManager.cancel(null, i);
    }
}
