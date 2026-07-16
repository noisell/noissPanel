package v.s;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class KDzznCVMCIQh4MFV8 extends U9g2mOxA6v60QExhx {
    public static final AtomicIntegerFieldUpdater ibVTtJUNfrGYbW = AtomicIntegerFieldUpdater.newUpdater(KDzznCVMCIQh4MFV8.class, "_invoked");
    private volatile int _invoked;
    public final deLJ4Z0aL3hcJ3O1 xDyLpEZyrcKVe0;

    public KDzznCVMCIQh4MFV8(deLJ4Z0aL3hcJ3O1 delj4z0al3hcj3o1) {
        this.xDyLpEZyrcKVe0 = delj4z0al3hcj3o1;
    }

    private static /* synthetic */ void eqjnwj() {
    }

    @Override // v.s.deLJ4Z0aL3hcJ3O1
    public final /* bridge */ /* synthetic */ Object pyu8ovAipBTLYAiKab(Object obj) {
        wotphlvK9sPbXJ((Throwable) obj);
        return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
    }

    @Override // v.s.kQNfMPvAFgenoBAn
    public final void wotphlvK9sPbXJ(Throwable th) {
        if (ibVTtJUNfrGYbW.compareAndSet(this, 0, 1)) {
            this.xDyLpEZyrcKVe0.pyu8ovAipBTLYAiKab(th);
        }
    }
}
