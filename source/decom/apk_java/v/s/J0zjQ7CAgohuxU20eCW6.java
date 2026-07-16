package v.s;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class J0zjQ7CAgohuxU20eCW6 extends nQilHWaqS401ZtR implements ListIterator {
    public final /* synthetic */ XiR1pIn5878vVWd Ee8d2j4S9Vm5yGuR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J0zjQ7CAgohuxU20eCW6(XiR1pIn5878vVWd xiR1pIn5878vVWd, int i) {
        super(0, xiR1pIn5878vVWd);
        this.Ee8d2j4S9Vm5yGuR = xiR1pIn5878vVWd;
        int iDDIMxZXP1V8HdM = xiR1pIn5878vVWd.dDIMxZXP1V8HdM();
        if (i < 0 || i > iDDIMxZXP1V8HdM) {
            throw new IndexOutOfBoundsException(Y9mRyRdkl5FOcwb66V6.Ee8d2j4S9Vm5yGuR(i, iDDIMxZXP1V8HdM, "index: ", ", size: "));
        }
        this.vekpFI4d1Nc4fakF = i;
    }

    private static /* synthetic */ void dibq() {
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.vekpFI4d1Nc4fakF > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.vekpFI4d1Nc4fakF;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.vekpFI4d1Nc4fakF - 1;
        this.vekpFI4d1Nc4fakF = i;
        return this.Ee8d2j4S9Vm5yGuR.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.vekpFI4d1Nc4fakF - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
