package v.s;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class HApDvSifKFkCstHF implements Runnable {
    public final /* synthetic */ SystemForegroundService Ee8d2j4S9Vm5yGuR;
    public final /* synthetic */ int JXn4Qf7zpnLjP5;
    public final /* synthetic */ Notification vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs;

    public HApDvSifKFkCstHF(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        this.Ee8d2j4S9Vm5yGuR = systemForegroundService;
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = notification;
        this.JXn4Qf7zpnLjP5 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = Build.VERSION.SDK_INT;
        int i2 = (-65) + 96;
        int i3 = this.JXn4Qf7zpnLjP5;
        Notification notification = this.vekpFI4d1Nc4fakF;
        int i4 = this.w9sT1Swbhx3hs;
        SystemForegroundService systemForegroundService = this.Ee8d2j4S9Vm5yGuR;
        if (i >= i2) {
            KPuZPxtT0aSR.dDIMxZXP1V8HdM(systemForegroundService, i4, notification, i3);
        } else if (i >= 29) {
            guks6WNotW56.dDIMxZXP1V8HdM(systemForegroundService, i4, notification, i3);
        } else {
            systemForegroundService.startForeground(i4, notification);
        }
    }
}
