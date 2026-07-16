package v.s;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class rOa7qxc8aCxK8H0q {
    public static final AtomicReferenceFieldUpdater dDIMxZXP1V8HdM = AtomicReferenceFieldUpdater.newUpdater(rOa7qxc8aCxK8H0q.class, Object.class, "_cur");
    private volatile Object _cur = new SuHLYifsJeVfKaZh9R(8, false);

    public final Object JXn4Qf7zpnLjP5() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = dDIMxZXP1V8HdM;
            SuHLYifsJeVfKaZh9R suHLYifsJeVfKaZh9R = (SuHLYifsJeVfKaZh9R) atomicReferenceFieldUpdater.get(this);
            Object objJXn4Qf7zpnLjP5 = suHLYifsJeVfKaZh9R.JXn4Qf7zpnLjP5();
            if (objJXn4Qf7zpnLjP5 != SuHLYifsJeVfKaZh9R.ibVTtJUNfrGYbW) {
                return objJXn4Qf7zpnLjP5;
            }
            SuHLYifsJeVfKaZh9R suHLYifsJeVfKaZh9RVekpFI4d1Nc4fakF = suHLYifsJeVfKaZh9R.vekpFI4d1Nc4fakF();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, suHLYifsJeVfKaZh9R, suHLYifsJeVfKaZh9RVekpFI4d1Nc4fakF) && atomicReferenceFieldUpdater.get(this) == suHLYifsJeVfKaZh9R) {
            }
        }
    }

    public final boolean dDIMxZXP1V8HdM(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = dDIMxZXP1V8HdM;
            SuHLYifsJeVfKaZh9R suHLYifsJeVfKaZh9R = (SuHLYifsJeVfKaZh9R) atomicReferenceFieldUpdater.get(this);
            int iDDIMxZXP1V8HdM = suHLYifsJeVfKaZh9R.dDIMxZXP1V8HdM(runnable);
            if (iDDIMxZXP1V8HdM == 0) {
                return true;
            }
            if (iDDIMxZXP1V8HdM == 1) {
                SuHLYifsJeVfKaZh9R suHLYifsJeVfKaZh9RVekpFI4d1Nc4fakF = suHLYifsJeVfKaZh9R.vekpFI4d1Nc4fakF();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, suHLYifsJeVfKaZh9R, suHLYifsJeVfKaZh9RVekpFI4d1Nc4fakF) && atomicReferenceFieldUpdater.get(this) == suHLYifsJeVfKaZh9R) {
                }
            } else if (iDDIMxZXP1V8HdM == 2) {
                return false;
            }
        }
    }

    public final int vekpFI4d1Nc4fakF() {
        SuHLYifsJeVfKaZh9R suHLYifsJeVfKaZh9R = (SuHLYifsJeVfKaZh9R) dDIMxZXP1V8HdM.get(this);
        suHLYifsJeVfKaZh9R.getClass();
        long j = SuHLYifsJeVfKaZh9R.xDyLpEZyrcKVe0.get(suHLYifsJeVfKaZh9R);
        return (((int) ((j & 1152921503533105152L) >> ((-40) + 70))) - ((int) (1073741823 & j))) & 1073741823;
    }

    public final void w9sT1Swbhx3hs() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = dDIMxZXP1V8HdM;
            SuHLYifsJeVfKaZh9R suHLYifsJeVfKaZh9R = (SuHLYifsJeVfKaZh9R) atomicReferenceFieldUpdater.get(this);
            if (suHLYifsJeVfKaZh9R.w9sT1Swbhx3hs()) {
                return;
            }
            SuHLYifsJeVfKaZh9R suHLYifsJeVfKaZh9RVekpFI4d1Nc4fakF = suHLYifsJeVfKaZh9R.vekpFI4d1Nc4fakF();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, suHLYifsJeVfKaZh9R, suHLYifsJeVfKaZh9RVekpFI4d1Nc4fakF) && atomicReferenceFieldUpdater.get(this) == suHLYifsJeVfKaZh9R) {
            }
        }
    }
}
