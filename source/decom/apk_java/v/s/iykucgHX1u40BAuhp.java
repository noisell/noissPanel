package v.s;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class iykucgHX1u40BAuhp {
    public static final cwZXScWRdjOa6 dDIMxZXP1V8HdM = new cwZXScWRdjOa6(new byte[0], 0, 0, false, false);
    public static final AtomicReference[] vekpFI4d1Nc4fakF;
    public static final int w9sT1Swbhx3hs;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        w9sT1Swbhx3hs = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        vekpFI4d1Nc4fakF = atomicReferenceArr;
    }

    public static final void dDIMxZXP1V8HdM(cwZXScWRdjOa6 cwzxscwrdjoa6) {
        if (cwzxscwrdjoa6.xDyLpEZyrcKVe0 != null || cwzxscwrdjoa6.ibVTtJUNfrGYbW != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (cwzxscwrdjoa6.JXn4Qf7zpnLjP5) {
            return;
        }
        AtomicReference atomicReference = vekpFI4d1Nc4fakF[(int) (Thread.currentThread().getId() & (((long) w9sT1Swbhx3hs) - 1))];
        cwZXScWRdjOa6 cwzxscwrdjoa7 = dDIMxZXP1V8HdM;
        cwZXScWRdjOa6 cwzxscwrdjoa8 = (cwZXScWRdjOa6) atomicReference.getAndSet(cwzxscwrdjoa7);
        if (cwzxscwrdjoa8 == cwzxscwrdjoa7) {
            return;
        }
        int i = cwzxscwrdjoa8 != null ? cwzxscwrdjoa8.vekpFI4d1Nc4fakF : 0;
        if (i >= 65536) {
            atomicReference.set(cwzxscwrdjoa8);
            return;
        }
        cwzxscwrdjoa6.xDyLpEZyrcKVe0 = cwzxscwrdjoa8;
        cwzxscwrdjoa6.w9sT1Swbhx3hs = 0;
        cwzxscwrdjoa6.vekpFI4d1Nc4fakF = i + 8192;
        atomicReference.set(cwzxscwrdjoa6);
    }

    public static final cwZXScWRdjOa6 w9sT1Swbhx3hs() {
        AtomicReference atomicReference = vekpFI4d1Nc4fakF[(int) (Thread.currentThread().getId() & (((long) w9sT1Swbhx3hs) - 1))];
        cwZXScWRdjOa6 cwzxscwrdjoa6 = dDIMxZXP1V8HdM;
        cwZXScWRdjOa6 cwzxscwrdjoa7 = (cwZXScWRdjOa6) atomicReference.getAndSet(cwzxscwrdjoa6);
        if (cwzxscwrdjoa7 == cwzxscwrdjoa6) {
            return new cwZXScWRdjOa6();
        }
        if (cwzxscwrdjoa7 == null) {
            atomicReference.set(null);
            return new cwZXScWRdjOa6();
        }
        atomicReference.set(cwzxscwrdjoa7.xDyLpEZyrcKVe0);
        cwzxscwrdjoa7.xDyLpEZyrcKVe0 = null;
        cwzxscwrdjoa7.vekpFI4d1Nc4fakF = 0;
        return cwzxscwrdjoa7;
    }
}
