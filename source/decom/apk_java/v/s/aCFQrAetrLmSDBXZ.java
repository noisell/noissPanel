package v.s;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class aCFQrAetrLmSDBXZ extends XsD7TIOExRJcOn4m implements mGuhJf2Mcqg8m {
    public static final AtomicIntegerFieldUpdater ibVTtJUNfrGYbW = AtomicIntegerFieldUpdater.newUpdater(aCFQrAetrLmSDBXZ.class, "runningWorkers");
    public final rOa7qxc8aCxK8H0q Ee8d2j4S9Vm5yGuR;
    public final /* synthetic */ mGuhJf2Mcqg8m JXn4Qf7zpnLjP5;
    private volatile int runningWorkers;
    public final int vekpFI4d1Nc4fakF;
    public final Object xDyLpEZyrcKVe0;

    public aCFQrAetrLmSDBXZ(int i) {
        cpTq2XMCb5JSaEhn cptq2xmcb5jsaehn = VcXtsPqXIQefFtYUZ.vekpFI4d1Nc4fakF;
        this.vekpFI4d1Nc4fakF = i;
        mGuhJf2Mcqg8m mguhjf2mcqg8m = cptq2xmcb5jsaehn instanceof mGuhJf2Mcqg8m ? (mGuhJf2Mcqg8m) cptq2xmcb5jsaehn : null;
        this.JXn4Qf7zpnLjP5 = mguhjf2mcqg8m == null ? yta3jf6IlTW2h5s8880Q.dDIMxZXP1V8HdM : mguhjf2mcqg8m;
        this.Ee8d2j4S9Vm5yGuR = new rOa7qxc8aCxK8H0q();
        this.xDyLpEZyrcKVe0 = new Object();
    }

    @Override // v.s.mGuhJf2Mcqg8m
    public final void hjneShqpF9Tis4(long j, hD886kxBkce8U hd886kxbkce8u) {
        this.JXn4Qf7zpnLjP5.hjneShqpF9Tis4(j, hd886kxbkce8u);
    }

    @Override // v.s.XsD7TIOExRJcOn4m
    public final void rCHnHJBAlOpNI5(cpTq2XMCb5JSaEhn cptq2xmcb5jsaehn, Runnable runnable) {
        Runnable runnableXfn2GJwmGqs7kWW;
        this.Ee8d2j4S9Vm5yGuR.dDIMxZXP1V8HdM(runnable);
        if (ibVTtJUNfrGYbW.get(this) >= this.vekpFI4d1Nc4fakF || !tne6mXOUFKdd() || (runnableXfn2GJwmGqs7kWW = xfn2GJwmGqs7kWW()) == null) {
            return;
        }
        VcXtsPqXIQefFtYUZ.vekpFI4d1Nc4fakF.rCHnHJBAlOpNI5(this, new UubaJZRp66jTeLre(this, 2, runnableXfn2GJwmGqs7kWW));
    }

    public final boolean tne6mXOUFKdd() {
        synchronized (this.xDyLpEZyrcKVe0) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = ibVTtJUNfrGYbW;
            if (atomicIntegerFieldUpdater.get(this) >= this.vekpFI4d1Nc4fakF) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // v.s.XsD7TIOExRJcOn4m
    public final void vIJudZvPyTuNp(cpTq2XMCb5JSaEhn cptq2xmcb5jsaehn, Runnable runnable) {
        Runnable runnableXfn2GJwmGqs7kWW;
        this.Ee8d2j4S9Vm5yGuR.dDIMxZXP1V8HdM(runnable);
        if (ibVTtJUNfrGYbW.get(this) >= this.vekpFI4d1Nc4fakF || !tne6mXOUFKdd() || (runnableXfn2GJwmGqs7kWW = xfn2GJwmGqs7kWW()) == null) {
            return;
        }
        VcXtsPqXIQefFtYUZ.vekpFI4d1Nc4fakF.vIJudZvPyTuNp(this, new UubaJZRp66jTeLre(this, (-52) + 54, runnableXfn2GJwmGqs7kWW));
    }

    public final Runnable xfn2GJwmGqs7kWW() {
        while (true) {
            Runnable runnable = (Runnable) this.Ee8d2j4S9Vm5yGuR.JXn4Qf7zpnLjP5();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.xDyLpEZyrcKVe0) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = ibVTtJUNfrGYbW;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.Ee8d2j4S9Vm5yGuR.vekpFI4d1Nc4fakF() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
