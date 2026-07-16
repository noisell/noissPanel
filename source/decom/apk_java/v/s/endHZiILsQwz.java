package v.s;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class endHZiILsQwz extends xU0rTjyeInI6ZXnysXT implements E9az9PfAcrslNncVQ {
    public static final AtomicIntegerFieldUpdater Ee8d2j4S9Vm5yGuR = AtomicIntegerFieldUpdater.newUpdater(endHZiILsQwz.class, "cleanedAndPointers");
    public final long JXn4Qf7zpnLjP5;
    private volatile int cleanedAndPointers;

    public endHZiILsQwz(long j, endHZiILsQwz endhziilsqwz, int i) {
        super(endhziilsqwz);
        this.JXn4Qf7zpnLjP5 = j;
        this.cleanedAndPointers = i << 16;
    }

    private static /* synthetic */ void mjhtkevfb() {
    }

    public final boolean Ee8d2j4S9Vm5yGuR() {
        return Ee8d2j4S9Vm5yGuR.addAndGet(this, -65536) == xDyLpEZyrcKVe0() && w9sT1Swbhx3hs() != null;
    }

    public final void b1EoSIRjJHO5() {
        if (Ee8d2j4S9Vm5yGuR.incrementAndGet(this) == xDyLpEZyrcKVe0()) {
            JXn4Qf7zpnLjP5();
        }
    }

    public abstract void ibVTtJUNfrGYbW(int i, cpTq2XMCb5JSaEhn cptq2xmcb5jsaehn);

    public final boolean pyu8ovAipBTLYAiKab() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = Ee8d2j4S9Vm5yGuR;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == xDyLpEZyrcKVe0() && w9sT1Swbhx3hs() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }

    @Override // v.s.xU0rTjyeInI6ZXnysXT
    public final boolean vekpFI4d1Nc4fakF() {
        return Ee8d2j4S9Vm5yGuR.get(this) == xDyLpEZyrcKVe0() && w9sT1Swbhx3hs() != null;
    }

    public abstract int xDyLpEZyrcKVe0();
}
