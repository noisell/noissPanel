package v.s;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class xU0rTjyeInI6ZXnysXT {
    private volatile Object _next;
    private volatile Object _prev;
    public static final AtomicReferenceFieldUpdater w9sT1Swbhx3hs = AtomicReferenceFieldUpdater.newUpdater(xU0rTjyeInI6ZXnysXT.class, Object.class, "_next");
    public static final AtomicReferenceFieldUpdater vekpFI4d1Nc4fakF = AtomicReferenceFieldUpdater.newUpdater(xU0rTjyeInI6ZXnysXT.class, Object.class, "_prev");

    public xU0rTjyeInI6ZXnysXT(endHZiILsQwz endhziilsqwz) {
        this._prev = endhziilsqwz;
    }

    public final void JXn4Qf7zpnLjP5() {
        xU0rTjyeInI6ZXnysXT xu0rtjyeini6zxnysxtW9sT1Swbhx3hs;
        if (w9sT1Swbhx3hs() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = vekpFI4d1Nc4fakF;
            xU0rTjyeInI6ZXnysXT xu0rtjyeini6zxnysxt = (xU0rTjyeInI6ZXnysXT) atomicReferenceFieldUpdater.get(this);
            while (xu0rtjyeini6zxnysxt != null && xu0rtjyeini6zxnysxt.vekpFI4d1Nc4fakF()) {
                xu0rtjyeini6zxnysxt = (xU0rTjyeInI6ZXnysXT) atomicReferenceFieldUpdater.get(xu0rtjyeini6zxnysxt);
            }
            xU0rTjyeInI6ZXnysXT xu0rtjyeini6zxnysxtW9sT1Swbhx3hs2 = w9sT1Swbhx3hs();
            while (xu0rtjyeini6zxnysxtW9sT1Swbhx3hs2.vekpFI4d1Nc4fakF() && (xu0rtjyeini6zxnysxtW9sT1Swbhx3hs = xu0rtjyeini6zxnysxtW9sT1Swbhx3hs2.w9sT1Swbhx3hs()) != null) {
                xu0rtjyeini6zxnysxtW9sT1Swbhx3hs2 = xu0rtjyeini6zxnysxtW9sT1Swbhx3hs;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(xu0rtjyeini6zxnysxtW9sT1Swbhx3hs2);
                xU0rTjyeInI6ZXnysXT xu0rtjyeini6zxnysxt2 = ((xU0rTjyeInI6ZXnysXT) obj) == null ? null : xu0rtjyeini6zxnysxt;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(xu0rtjyeini6zxnysxtW9sT1Swbhx3hs2, obj, xu0rtjyeini6zxnysxt2)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(xu0rtjyeini6zxnysxtW9sT1Swbhx3hs2) != obj) {
                    }
                }
            }
            if (xu0rtjyeini6zxnysxt != null) {
                w9sT1Swbhx3hs.set(xu0rtjyeini6zxnysxt, xu0rtjyeini6zxnysxtW9sT1Swbhx3hs2);
            }
            if (!xu0rtjyeini6zxnysxtW9sT1Swbhx3hs2.vekpFI4d1Nc4fakF() || xu0rtjyeini6zxnysxtW9sT1Swbhx3hs2.w9sT1Swbhx3hs() == null) {
                if (xu0rtjyeini6zxnysxt == null || !xu0rtjyeini6zxnysxt.vekpFI4d1Nc4fakF()) {
                    return;
                }
            }
        }
    }

    public final void dDIMxZXP1V8HdM() {
        vekpFI4d1Nc4fakF.lazySet(this, null);
    }

    public abstract boolean vekpFI4d1Nc4fakF();

    public final xU0rTjyeInI6ZXnysXT w9sT1Swbhx3hs() {
        Object obj = w9sT1Swbhx3hs.get(this);
        if (obj == SbxdZ6Kq2uhHQ5RPRqm.dDIMxZXP1V8HdM) {
            return null;
        }
        return (xU0rTjyeInI6ZXnysXT) obj;
    }
}
