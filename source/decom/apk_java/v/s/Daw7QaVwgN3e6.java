package v.s;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final /* synthetic */ class Daw7QaVwgN3e6 implements ThreadFactory {
    public final /* synthetic */ String dDIMxZXP1V8HdM;
    public final /* synthetic */ boolean w9sT1Swbhx3hs;

    public /* synthetic */ Daw7QaVwgN3e6(String str, boolean z) {
        this.dDIMxZXP1V8HdM = str;
        this.w9sT1Swbhx3hs = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.dDIMxZXP1V8HdM);
        thread.setDaemon(this.w9sT1Swbhx3hs);
        return thread;
    }
}
