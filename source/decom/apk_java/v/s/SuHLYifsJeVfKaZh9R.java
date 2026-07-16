package v.s;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class SuHLYifsJeVfKaZh9R {
    public final AtomicReferenceArray JXn4Qf7zpnLjP5;
    private volatile Object _next;
    private volatile long _state;
    public final int dDIMxZXP1V8HdM;
    public final int vekpFI4d1Nc4fakF;
    public final boolean w9sT1Swbhx3hs;
    public static final AtomicReferenceFieldUpdater Ee8d2j4S9Vm5yGuR = AtomicReferenceFieldUpdater.newUpdater(SuHLYifsJeVfKaZh9R.class, Object.class, "_next");
    public static final AtomicLongFieldUpdater xDyLpEZyrcKVe0 = AtomicLongFieldUpdater.newUpdater(SuHLYifsJeVfKaZh9R.class, "_state");
    public static final o0rN3ekjBJ6kKwok ibVTtJUNfrGYbW = new o0rN3ekjBJ6kKwok("REMOVE_FROZEN", 1);

    public SuHLYifsJeVfKaZh9R(int i, boolean z) {
        this.dDIMxZXP1V8HdM = i;
        this.w9sT1Swbhx3hs = z;
        int i2 = i - 1;
        this.vekpFI4d1Nc4fakF = i2;
        this.JXn4Qf7zpnLjP5 = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final Object JXn4Qf7zpnLjP5() {
        SuHLYifsJeVfKaZh9R suHLYifsJeVfKaZh9RVekpFI4d1Nc4fakF = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = xDyLpEZyrcKVe0;
            long j = atomicLongFieldUpdater.get(suHLYifsJeVfKaZh9RVekpFI4d1Nc4fakF);
            if ((j & 1152921504606846976L) != 0) {
                return ibVTtJUNfrGYbW;
            }
            int i = (int) (j & 1073741823);
            int i2 = suHLYifsJeVfKaZh9RVekpFI4d1Nc4fakF.vekpFI4d1Nc4fakF;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) != i3) {
                AtomicReferenceArray atomicReferenceArray = suHLYifsJeVfKaZh9RVekpFI4d1Nc4fakF.JXn4Qf7zpnLjP5;
                Object obj = atomicReferenceArray.get(i3);
                boolean z = suHLYifsJeVfKaZh9RVekpFI4d1Nc4fakF.w9sT1Swbhx3hs;
                if (obj == null) {
                    if (z) {
                    }
                } else if (!(obj instanceof VIASV1uK3Xonuv)) {
                    long j2 = (i + 1) & 1073741823;
                    if (xDyLpEZyrcKVe0.compareAndSet(suHLYifsJeVfKaZh9RVekpFI4d1Nc4fakF, j, (j & (-1073741824)) | j2)) {
                        atomicReferenceArray.set(i3, null);
                        return obj;
                    }
                    suHLYifsJeVfKaZh9RVekpFI4d1Nc4fakF = this;
                    if (z) {
                        while (true) {
                            long j3 = atomicLongFieldUpdater.get(suHLYifsJeVfKaZh9RVekpFI4d1Nc4fakF);
                            int i4 = (int) (j3 & 1073741823);
                            if ((j3 & 1152921504606846976L) != 0) {
                                suHLYifsJeVfKaZh9RVekpFI4d1Nc4fakF = suHLYifsJeVfKaZh9RVekpFI4d1Nc4fakF.vekpFI4d1Nc4fakF();
                            } else {
                                SuHLYifsJeVfKaZh9R suHLYifsJeVfKaZh9R = suHLYifsJeVfKaZh9RVekpFI4d1Nc4fakF;
                                if (xDyLpEZyrcKVe0.compareAndSet(suHLYifsJeVfKaZh9R, j3, (j3 & (-1073741824)) | j2)) {
                                    suHLYifsJeVfKaZh9R.JXn4Qf7zpnLjP5.set(i4 & suHLYifsJeVfKaZh9R.vekpFI4d1Nc4fakF, null);
                                    suHLYifsJeVfKaZh9RVekpFI4d1Nc4fakF = null;
                                } else {
                                    suHLYifsJeVfKaZh9RVekpFI4d1Nc4fakF = suHLYifsJeVfKaZh9R;
                                }
                            }
                            if (suHLYifsJeVfKaZh9RVekpFI4d1Nc4fakF == null) {
                                return obj;
                            }
                        }
                    }
                }
            }
            return null;
        }
    }

    public final int dDIMxZXP1V8HdM(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = xDyLpEZyrcKVe0;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.vekpFI4d1Nc4fakF;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = this.w9sT1Swbhx3hs;
            AtomicReferenceArray atomicReferenceArray = this.JXn4Qf7zpnLjP5;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                if (xDyLpEZyrcKVe0.compareAndSet(this, j, ((-1152921503533105153L) & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    SuHLYifsJeVfKaZh9R suHLYifsJeVfKaZh9RVekpFI4d1Nc4fakF = this;
                    while ((atomicLongFieldUpdater.get(suHLYifsJeVfKaZh9RVekpFI4d1Nc4fakF) & 1152921504606846976L) != 0) {
                        suHLYifsJeVfKaZh9RVekpFI4d1Nc4fakF = suHLYifsJeVfKaZh9RVekpFI4d1Nc4fakF.vekpFI4d1Nc4fakF();
                        AtomicReferenceArray atomicReferenceArray2 = suHLYifsJeVfKaZh9RVekpFI4d1Nc4fakF.JXn4Qf7zpnLjP5;
                        int i4 = suHLYifsJeVfKaZh9RVekpFI4d1Nc4fakF.vekpFI4d1Nc4fakF & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof VIASV1uK3Xonuv) && ((VIASV1uK3Xonuv) obj2).dDIMxZXP1V8HdM == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            suHLYifsJeVfKaZh9RVekpFI4d1Nc4fakF = null;
                        }
                        if (suHLYifsJeVfKaZh9RVekpFI4d1Nc4fakF == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i5 = this.dDIMxZXP1V8HdM;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final SuHLYifsJeVfKaZh9R vekpFI4d1Nc4fakF() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        SuHLYifsJeVfKaZh9R suHLYifsJeVfKaZh9R;
        while (true) {
            atomicLongFieldUpdater = xDyLpEZyrcKVe0;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                suHLYifsJeVfKaZh9R = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            suHLYifsJeVfKaZh9R = this;
            if (atomicLongFieldUpdater.compareAndSet(suHLYifsJeVfKaZh9R, j, j2)) {
                j = j2;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Ee8d2j4S9Vm5yGuR;
            SuHLYifsJeVfKaZh9R suHLYifsJeVfKaZh9R2 = (SuHLYifsJeVfKaZh9R) atomicReferenceFieldUpdater.get(this);
            if (suHLYifsJeVfKaZh9R2 != null) {
                return suHLYifsJeVfKaZh9R2;
            }
            SuHLYifsJeVfKaZh9R suHLYifsJeVfKaZh9R3 = new SuHLYifsJeVfKaZh9R(suHLYifsJeVfKaZh9R.dDIMxZXP1V8HdM * 2, suHLYifsJeVfKaZh9R.w9sT1Swbhx3hs);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = suHLYifsJeVfKaZh9R.vekpFI4d1Nc4fakF;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object vIASV1uK3Xonuv = suHLYifsJeVfKaZh9R.JXn4Qf7zpnLjP5.get(i4);
                if (vIASV1uK3Xonuv == null) {
                    vIASV1uK3Xonuv = new VIASV1uK3Xonuv(i);
                }
                suHLYifsJeVfKaZh9R3.JXn4Qf7zpnLjP5.set(suHLYifsJeVfKaZh9R3.vekpFI4d1Nc4fakF & i, vIASV1uK3Xonuv);
                i++;
            }
            atomicLongFieldUpdater.set(suHLYifsJeVfKaZh9R3, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, suHLYifsJeVfKaZh9R3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [boolean, int] */
    public final boolean w9sT1Swbhx3hs() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        ?? r6;
        do {
            atomicLongFieldUpdater = xDyLpEZyrcKVe0;
            j = atomicLongFieldUpdater.get(this);
            r6 = 25 - 24;
            if ((j & 2305843009213693952L) != 0) {
                return r6;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, 2305843009213693952L | j));
        return r6;
    }
}
