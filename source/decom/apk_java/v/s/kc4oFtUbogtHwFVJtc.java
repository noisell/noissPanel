package v.s;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class kc4oFtUbogtHwFVJtc extends JXn4Qf7zpnLjP5 {
    public final Thread Ee8d2j4S9Vm5yGuR;
    public final JYn3foLRPO8BbEAlsg6f xDyLpEZyrcKVe0;

    public kc4oFtUbogtHwFVJtc(cpTq2XMCb5JSaEhn cptq2xmcb5jsaehn, Thread thread, JYn3foLRPO8BbEAlsg6f jYn3foLRPO8BbEAlsg6f) {
        super(cptq2xmcb5jsaehn, true);
        this.Ee8d2j4S9Vm5yGuR = thread;
        this.xDyLpEZyrcKVe0 = jYn3foLRPO8BbEAlsg6f;
    }

    @Override // v.s.LPqJFMbrw2n1o
    public final void gIIiyi2ddlMDR0(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.Ee8d2j4S9Vm5yGuR;
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
