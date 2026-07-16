package v.s;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import app.mobilex.plus.services.DataQFAdapter;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final /* synthetic */ class ePkLbnAmfpx0dtD implements Runnable {
    public final /* synthetic */ Object Ee8d2j4S9Vm5yGuR;
    public final /* synthetic */ Object JXn4Qf7zpnLjP5;
    public final /* synthetic */ boolean vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs;

    public /* synthetic */ ePkLbnAmfpx0dtD(int i, Object obj, Object obj2, boolean z) {
        this.w9sT1Swbhx3hs = i;
        this.JXn4Qf7zpnLjP5 = obj;
        this.vekpFI4d1Nc4fakF = z;
        this.Ee8d2j4S9Vm5yGuR = obj2;
    }

    private static /* synthetic */ void yvkgc() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                Context context = (Context) this.JXn4Qf7zpnLjP5;
                al3CoDKXO0nvx al3codkxo0nvx = (al3CoDKXO0nvx) this.Ee8d2j4S9Vm5yGuR;
                try {
                    if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext == null) {
                            applicationContext = context;
                        }
                        SharedPreferences.Editor editorEdit = applicationContext.getSharedPreferences("com.google.firebase.messaging", 0).edit();
                        editorEdit.putBoolean("proxy_notification_initialized", true);
                        editorEdit.apply();
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                        if (this.vekpFI4d1Nc4fakF) {
                            notificationManager.setNotificationDelegate("com.google.android.gms");
                        } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                            notificationManager.setNotificationDelegate(null);
                        }
                    } else {
                        context.getPackageName();
                    }
                    return;
                } finally {
                    al3codkxo0nvx.vekpFI4d1Nc4fakF(null);
                }
            default:
                ((AuGYnq4dE8pY) this.JXn4Qf7zpnLjP5).pyu8ovAipBTLYAiKab(new N7tHynvwnXYR((DataQFAdapter) this.Ee8d2j4S9Vm5yGuR, this.vekpFI4d1Nc4fakF));
                return;
        }
    }
}
