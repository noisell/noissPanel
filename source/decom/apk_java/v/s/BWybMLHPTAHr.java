package v.s;

import android.content.Context;
import android.os.PowerManager;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class BWybMLHPTAHr {
    public static final /* synthetic */ int dDIMxZXP1V8HdM = 0;

    static {
        fEyMFFyOOvHURJ7To6L.wotphlvK9sPbXJ("WakeLocks");
    }

    public static final PowerManager.WakeLock dDIMxZXP1V8HdM(Context context, String str) {
        PowerManager powerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
        String strConcat = "WorkManager: ".concat(str);
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, strConcat);
        synchronized (qf9xIurtngmmaY9Cdx.dDIMxZXP1V8HdM) {
        }
        return wakeLockNewWakeLock;
    }

    private static /* synthetic */ void phvemzr() {
    }
}
