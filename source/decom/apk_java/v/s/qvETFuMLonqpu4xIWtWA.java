package v.s;

import android.os.Handler;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class qvETFuMLonqpu4xIWtWA {
    public final LinkedHashMap Ee8d2j4S9Vm5yGuR;
    public final Object JXn4Qf7zpnLjP5;
    public final r5XEUfod5GSCCwq6c dDIMxZXP1V8HdM;
    public final long vekpFI4d1Nc4fakF;
    public final Hnsrhf2jJV8dCt w9sT1Swbhx3hs;

    public qvETFuMLonqpu4xIWtWA(r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c, Hnsrhf2jJV8dCt hnsrhf2jJV8dCt) {
        long millis = TimeUnit.MINUTES.toMillis(90L);
        this.dDIMxZXP1V8HdM = r5xeufod5gsccwq6c;
        this.w9sT1Swbhx3hs = hnsrhf2jJV8dCt;
        this.vekpFI4d1Nc4fakF = millis;
        this.JXn4Qf7zpnLjP5 = new Object();
        this.Ee8d2j4S9Vm5yGuR = new LinkedHashMap();
    }

    private static /* synthetic */ void ziduobqrm() {
    }

    public final void dDIMxZXP1V8HdM(r9c8qUHbkyLZi r9c8quhbkylzi) {
        Runnable runnable;
        synchronized (this.JXn4Qf7zpnLjP5) {
            runnable = (Runnable) this.Ee8d2j4S9Vm5yGuR.remove(r9c8quhbkylzi);
        }
        if (runnable != null) {
            ((Handler) this.dDIMxZXP1V8HdM.vekpFI4d1Nc4fakF).removeCallbacks(runnable);
        }
    }

    public final void w9sT1Swbhx3hs(r9c8qUHbkyLZi r9c8quhbkylzi) {
        A68NpXPqwTFos99nt a68NpXPqwTFos99nt = new A68NpXPqwTFos99nt(this, 19, r9c8quhbkylzi);
        synchronized (this.JXn4Qf7zpnLjP5) {
        }
        r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c = this.dDIMxZXP1V8HdM;
        ((Handler) r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF).postDelayed(a68NpXPqwTFos99nt, this.vekpFI4d1Nc4fakF);
    }
}
