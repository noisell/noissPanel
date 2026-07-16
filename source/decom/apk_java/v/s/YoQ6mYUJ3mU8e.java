package v.s;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class YoQ6mYUJ3mU8e {
    private volatile AtomicReferenceArray<Object> array;

    public YoQ6mYUJ3mU8e(int i) {
        this.array = new AtomicReferenceArray<>(i);
    }

    private static /* synthetic */ void jtea() {
    }

    public final int dDIMxZXP1V8HdM() {
        return this.array.length();
    }

    public final void vekpFI4d1Nc4fakF(int i, ZSt5RxjUU2KRH zSt5RxjUU2KRH) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i < length) {
            atomicReferenceArray.set(i, zSt5RxjUU2KRH);
            return;
        }
        int i2 = i + 1;
        int i3 = length * 2;
        if (i2 < i3) {
            i2 = i3;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(i2);
        for (int i4 = 0; i4 < length; i4++) {
            atomicReferenceArray2.set(i4, atomicReferenceArray.get(i4));
        }
        atomicReferenceArray2.set(i, zSt5RxjUU2KRH);
        this.array = atomicReferenceArray2;
    }

    public final Object w9sT1Swbhx3hs(int i) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i);
        }
        return null;
    }
}
