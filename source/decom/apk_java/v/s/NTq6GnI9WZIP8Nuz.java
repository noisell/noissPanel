package v.s;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class NTq6GnI9WZIP8Nuz implements Executor {
    public Runnable JXn4Qf7zpnLjP5;
    public final Executor vekpFI4d1Nc4fakF;
    public final ArrayDeque w9sT1Swbhx3hs = new ArrayDeque();
    public final Object Ee8d2j4S9Vm5yGuR = new Object();

    public NTq6GnI9WZIP8Nuz(Executor executor) {
        this.vekpFI4d1Nc4fakF = executor;
    }

    public final void dDIMxZXP1V8HdM() {
        Runnable runnable = (Runnable) this.w9sT1Swbhx3hs.poll();
        this.JXn4Qf7zpnLjP5 = runnable;
        if (runnable != null) {
            this.vekpFI4d1Nc4fakF.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.Ee8d2j4S9Vm5yGuR) {
            try {
                this.w9sT1Swbhx3hs.add(new UubaJZRp66jTeLre(5, this, runnable, false));
                if (this.JXn4Qf7zpnLjP5 == null) {
                    dDIMxZXP1V8HdM();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
