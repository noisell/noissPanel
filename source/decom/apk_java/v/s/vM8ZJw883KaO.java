package v.s;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class vM8ZJw883KaO {
    public static g53KeHSJCprsAC3vW6 vekpFI4d1Nc4fakF;
    public static final long dDIMxZXP1V8HdM = TimeUnit.MINUTES.toMillis(1);
    public static final Object w9sT1Swbhx3hs = new Object();

    public static void dDIMxZXP1V8HdM(Context context) {
        if (vekpFI4d1Nc4fakF == null) {
            g53KeHSJCprsAC3vW6 g53kehsjcprsac3vw6 = new g53KeHSJCprsAC3vW6(context);
            vekpFI4d1Nc4fakF = g53kehsjcprsac3vw6;
            synchronized (g53kehsjcprsac3vw6.dDIMxZXP1V8HdM) {
                g53kehsjcprsac3vw6.ibVTtJUNfrGYbW = true;
            }
        }
    }

    private static /* synthetic */ void urwachj() {
    }

    public static ComponentName vekpFI4d1Nc4fakF(Context context, Intent intent) {
        synchronized (w9sT1Swbhx3hs) {
            try {
                dDIMxZXP1V8HdM(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    vekpFI4d1Nc4fakF.dDIMxZXP1V8HdM(dDIMxZXP1V8HdM);
                }
                return componentNameStartService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void w9sT1Swbhx3hs(Intent intent) {
        synchronized (w9sT1Swbhx3hs) {
            try {
                if (vekpFI4d1Nc4fakF != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    vekpFI4d1Nc4fakF.vekpFI4d1Nc4fakF();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
