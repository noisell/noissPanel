package v.s;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class jNtR9eeHNtQpa implements Executor {
    public static final Logger ibVTtJUNfrGYbW = Logger.getLogger(jNtR9eeHNtQpa.class.getName());
    public final Executor w9sT1Swbhx3hs;
    public final ArrayDeque vekpFI4d1Nc4fakF = new ArrayDeque();
    public int JXn4Qf7zpnLjP5 = 1;
    public long Ee8d2j4S9Vm5yGuR = 0;
    public final UubaJZRp66jTeLre xDyLpEZyrcKVe0 = new UubaJZRp66jTeLre(this);

    public jNtR9eeHNtQpa(Executor executor) {
        SbxdZ6Kq2uhHQ5RPRqm.ibVTtJUNfrGYbW(executor);
        this.w9sT1Swbhx3hs = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        SbxdZ6Kq2uhHQ5RPRqm.ibVTtJUNfrGYbW(runnable);
        synchronized (this.vekpFI4d1Nc4fakF) {
            int i = this.JXn4Qf7zpnLjP5;
            if (i != 4 && i != 3) {
                long j = this.Ee8d2j4S9Vm5yGuR;
                MPy558nhplGUC mPy558nhplGUC = new MPy558nhplGUC(runnable, 1);
                this.vekpFI4d1Nc4fakF.add(mPy558nhplGUC);
                this.JXn4Qf7zpnLjP5 = 2;
                try {
                    this.w9sT1Swbhx3hs.execute(this.xDyLpEZyrcKVe0);
                    if (this.JXn4Qf7zpnLjP5 != 2) {
                        return;
                    }
                    synchronized (this.vekpFI4d1Nc4fakF) {
                        try {
                            if (this.Ee8d2j4S9Vm5yGuR == j && this.JXn4Qf7zpnLjP5 == 2) {
                                this.JXn4Qf7zpnLjP5 = 3;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.vekpFI4d1Nc4fakF) {
                        try {
                            int i2 = this.JXn4Qf7zpnLjP5;
                            boolean z = true;
                            if ((i2 != 1 && i2 != 2) || !this.vekpFI4d1Nc4fakF.removeLastOccurrence(mPy558nhplGUC)) {
                                z = false;
                            }
                            if (!(e instanceof RejectedExecutionException) || z) {
                                throw e;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
            }
            this.vekpFI4d1Nc4fakF.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.w9sT1Swbhx3hs + "}";
    }
}
