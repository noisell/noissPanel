package v.s;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class h2asZwzesjZZDy implements ThreadFactory {
    public final AtomicInteger dDIMxZXP1V8HdM = new AtomicInteger(0);
    public final /* synthetic */ boolean w9sT1Swbhx3hs;

    public h2asZwzesjZZDy(boolean z) {
        this.w9sT1Swbhx3hs = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, (this.w9sT1Swbhx3hs ? "WM.task-" : "androidx.work-") + this.dDIMxZXP1V8HdM.incrementAndGet());
    }
}
