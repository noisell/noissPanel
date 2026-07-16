package v.s;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class goHawlkqf1iP extends Ndz86LBW9Rzz {
    public static final AtomicIntegerFieldUpdater xDyLpEZyrcKVe0 = AtomicIntegerFieldUpdater.newUpdater(goHawlkqf1iP.class, "_decision");
    private volatile int _decision;

    private static /* synthetic */ void qqiecwylqm() {
    }

    @Override // v.s.Ndz86LBW9Rzz, v.s.LPqJFMbrw2n1o
    public final void gIIiyi2ddlMDR0(Object obj) {
        wotphlvK9sPbXJ(obj);
    }

    @Override // v.s.Ndz86LBW9Rzz, v.s.LPqJFMbrw2n1o
    public final void wotphlvK9sPbXJ(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = xDyLpEZyrcKVe0;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                y6jRGLEWNMir.gmNWMfvn6zlEj(FZ1sl4mHq4J0hOEYC.O2DHNSIGZlgPja7eqLgn(obj), jb8et6SZeK5TWMrJFxDX.J0zjQ7CAgohuxU20eCW6(this.Ee8d2j4S9Vm5yGuR));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
