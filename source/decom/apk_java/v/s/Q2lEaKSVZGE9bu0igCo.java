package v.s;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class Q2lEaKSVZGE9bu0igCo {
    public static final AtomicIntegerFieldUpdater w9sT1Swbhx3hs = AtomicIntegerFieldUpdater.newUpdater(Q2lEaKSVZGE9bu0igCo.class, "_size");
    private volatile int _size;
    public TzeEusHMi207TE[] dDIMxZXP1V8HdM;

    public final void dDIMxZXP1V8HdM(TzeEusHMi207TE tzeEusHMi207TE) {
        tzeEusHMi207TE.w9sT1Swbhx3hs((f13op62NCrgMb8IPpQhI) this);
        TzeEusHMi207TE[] tzeEusHMi207TEArr = this.dDIMxZXP1V8HdM;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = w9sT1Swbhx3hs;
        if (tzeEusHMi207TEArr == null) {
            tzeEusHMi207TEArr = new TzeEusHMi207TE[4];
            this.dDIMxZXP1V8HdM = tzeEusHMi207TEArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= tzeEusHMi207TEArr.length) {
            tzeEusHMi207TEArr = (TzeEusHMi207TE[]) Arrays.copyOf(tzeEusHMi207TEArr, atomicIntegerFieldUpdater.get(this) * 2);
            this.dDIMxZXP1V8HdM = tzeEusHMi207TEArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        tzeEusHMi207TEArr[i] = tzeEusHMi207TE;
        tzeEusHMi207TE.vekpFI4d1Nc4fakF = i;
        while (i > 0) {
            Object[] objArr = this.dDIMxZXP1V8HdM;
            int i2 = (i - 1) / 2;
            if (objArr[i2].compareTo(objArr[i]) <= 0) {
                return;
            }
            vekpFI4d1Nc4fakF(i, i2);
            i = i2;
        }
    }

    public final void vekpFI4d1Nc4fakF(int i, int i2) {
        TzeEusHMi207TE[] tzeEusHMi207TEArr = this.dDIMxZXP1V8HdM;
        TzeEusHMi207TE tzeEusHMi207TE = tzeEusHMi207TEArr[i2];
        TzeEusHMi207TE tzeEusHMi207TE2 = tzeEusHMi207TEArr[i];
        tzeEusHMi207TEArr[i] = tzeEusHMi207TE;
        tzeEusHMi207TEArr[i2] = tzeEusHMi207TE2;
        tzeEusHMi207TE.vekpFI4d1Nc4fakF = i;
        tzeEusHMi207TE2.vekpFI4d1Nc4fakF = i2;
    }

    public final TzeEusHMi207TE w9sT1Swbhx3hs(int i) {
        Object[] objArr = this.dDIMxZXP1V8HdM;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = w9sT1Swbhx3hs;
        int i2 = 61 - 62;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) + i2);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            vekpFI4d1Nc4fakF(i, atomicIntegerFieldUpdater.get(this));
            int i3 = (i - 1) / 2;
            if (i <= 0 || objArr[i].compareTo(objArr[i3]) >= 0) {
                while (true) {
                    int i4 = i * 2;
                    int i5 = i4 + 1;
                    if (i5 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                    }
                    Object[] objArr2 = this.dDIMxZXP1V8HdM;
                    int i6 = i4 + 2;
                    if (i6 >= atomicIntegerFieldUpdater.get(this) || objArr2[i6].compareTo(objArr2[i5]) >= 0) {
                        i6 = i5;
                    }
                    if (objArr2[i].compareTo(objArr2[i6]) <= 0) {
                        break;
                    }
                    vekpFI4d1Nc4fakF(i, i6);
                    i = i6;
                }
            } else {
                vekpFI4d1Nc4fakF(i, i3);
                while (i3 > 0) {
                    Object[] objArr3 = this.dDIMxZXP1V8HdM;
                    int i7 = (i3 - 1) / 2;
                    if (objArr3[i7].compareTo(objArr3[i3]) <= 0) {
                        break;
                    }
                    vekpFI4d1Nc4fakF(i3, i7);
                    i3 = i7;
                }
            }
        }
        TzeEusHMi207TE tzeEusHMi207TE = objArr[atomicIntegerFieldUpdater.get(this)];
        tzeEusHMi207TE.w9sT1Swbhx3hs(null);
        tzeEusHMi207TE.vekpFI4d1Nc4fakF = i2;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return tzeEusHMi207TE;
    }
}
