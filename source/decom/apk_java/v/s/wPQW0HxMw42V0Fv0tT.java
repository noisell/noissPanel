package v.s;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class wPQW0HxMw42V0Fv0tT implements ListIterator, buUjKwCmuWSvVXs {
    public int JXn4Qf7zpnLjP5 = -1;
    public int vekpFI4d1Nc4fakF;
    public final ygw2lLTDaECI24gLm1 w9sT1Swbhx3hs;

    public wPQW0HxMw42V0Fv0tT(ygw2lLTDaECI24gLm1 ygw2lltdaeci24glm1, int i) {
        this.w9sT1Swbhx3hs = ygw2lltdaeci24glm1;
        this.vekpFI4d1Nc4fakF = i;
    }

    private static /* synthetic */ void ldygezh() {
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.vekpFI4d1Nc4fakF;
        this.vekpFI4d1Nc4fakF = i + 1;
        this.w9sT1Swbhx3hs.add(i, obj);
        this.JXn4Qf7zpnLjP5 = -1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.vekpFI4d1Nc4fakF < this.w9sT1Swbhx3hs.JXn4Qf7zpnLjP5;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.vekpFI4d1Nc4fakF > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.vekpFI4d1Nc4fakF;
        ygw2lLTDaECI24gLm1 ygw2lltdaeci24glm1 = this.w9sT1Swbhx3hs;
        if (i >= ygw2lltdaeci24glm1.JXn4Qf7zpnLjP5) {
            throw new NoSuchElementException();
        }
        this.vekpFI4d1Nc4fakF = i + 1;
        this.JXn4Qf7zpnLjP5 = i;
        return ygw2lltdaeci24glm1.w9sT1Swbhx3hs[ygw2lltdaeci24glm1.vekpFI4d1Nc4fakF + i];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.vekpFI4d1Nc4fakF;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.vekpFI4d1Nc4fakF;
        if (i <= 0) {
            throw new NoSuchElementException();
        }
        int i2 = i - 1;
        this.vekpFI4d1Nc4fakF = i2;
        this.JXn4Qf7zpnLjP5 = i2;
        ygw2lLTDaECI24gLm1 ygw2lltdaeci24glm1 = this.w9sT1Swbhx3hs;
        return ygw2lltdaeci24glm1.w9sT1Swbhx3hs[ygw2lltdaeci24glm1.vekpFI4d1Nc4fakF + i2];
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.vekpFI4d1Nc4fakF - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.JXn4Qf7zpnLjP5;
        if (i == -1) {
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
        }
        this.w9sT1Swbhx3hs.w9sT1Swbhx3hs(i);
        this.vekpFI4d1Nc4fakF = this.JXn4Qf7zpnLjP5;
        this.JXn4Qf7zpnLjP5 = -1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.JXn4Qf7zpnLjP5;
        if (i == -1) {
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
        }
        this.w9sT1Swbhx3hs.set(i, obj);
    }
}
