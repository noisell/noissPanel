package v.s;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class rBaarsM55BtPU5 {
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    public final AtomicReferenceArray dDIMxZXP1V8HdM = new AtomicReferenceArray(128);
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;
    public static final AtomicReferenceFieldUpdater w9sT1Swbhx3hs = AtomicReferenceFieldUpdater.newUpdater(rBaarsM55BtPU5.class, Object.class, "lastScheduledTask");
    public static final AtomicIntegerFieldUpdater vekpFI4d1Nc4fakF = AtomicIntegerFieldUpdater.newUpdater(rBaarsM55BtPU5.class, "producerIndex");
    public static final AtomicIntegerFieldUpdater JXn4Qf7zpnLjP5 = AtomicIntegerFieldUpdater.newUpdater(rBaarsM55BtPU5.class, "consumerIndex");
    public static final AtomicIntegerFieldUpdater Ee8d2j4S9Vm5yGuR = AtomicIntegerFieldUpdater.newUpdater(rBaarsM55BtPU5.class, "blockingTasksInBuffer");

    public final xya403kVTOXbAjP0he3 dDIMxZXP1V8HdM(xya403kVTOXbAjP0he3 xya403kvtoxbajp0he3) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = vekpFI4d1Nc4fakF;
        int i = 52 + 75;
        if (atomicIntegerFieldUpdater.get(this) - JXn4Qf7zpnLjP5.get(this) == i) {
            return xya403kvtoxbajp0he3;
        }
        if (xya403kvtoxbajp0he3.vekpFI4d1Nc4fakF.dDIMxZXP1V8HdM == 1) {
            Ee8d2j4S9Vm5yGuR.incrementAndGet(this);
        }
        int i2 = atomicIntegerFieldUpdater.get(this) & i;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.dDIMxZXP1V8HdM;
            if (atomicReferenceArray.get(i2) == null) {
                atomicReferenceArray.lazySet(i2, xya403kvtoxbajp0he3);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final xya403kVTOXbAjP0he3 vekpFI4d1Nc4fakF(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.dDIMxZXP1V8HdM;
        xya403kVTOXbAjP0he3 xya403kvtoxbajp0he3 = (xya403kVTOXbAjP0he3) atomicReferenceArray.get(i2);
        if (xya403kvtoxbajp0he3 != null) {
            int i3 = 86 - 85;
            if (xya403kvtoxbajp0he3.vekpFI4d1Nc4fakF.dDIMxZXP1V8HdM != i3) {
                i3 = 0;
            }
            if (i3 == z) {
                while (!atomicReferenceArray.compareAndSet(i2, xya403kvtoxbajp0he3, null)) {
                    if (atomicReferenceArray.get(i2) != xya403kvtoxbajp0he3) {
                    }
                }
                if (z) {
                    Ee8d2j4S9Vm5yGuR.decrementAndGet(this);
                }
                return xya403kvtoxbajp0he3;
            }
        }
        return null;
    }

    public final xya403kVTOXbAjP0he3 w9sT1Swbhx3hs() {
        xya403kVTOXbAjP0he3 xya403kvtoxbajp0he3;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = JXn4Qf7zpnLjP5;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - vekpFI4d1Nc4fakF.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (xya403kvtoxbajp0he3 = (xya403kVTOXbAjP0he3) this.dDIMxZXP1V8HdM.getAndSet(i2, null)) != null) {
                if (xya403kvtoxbajp0he3.vekpFI4d1Nc4fakF.dDIMxZXP1V8HdM == 1) {
                    Ee8d2j4S9Vm5yGuR.decrementAndGet(this);
                }
                return xya403kvtoxbajp0he3;
            }
        }
    }
}
