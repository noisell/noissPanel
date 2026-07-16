package v.s;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class PMsMcTnvHIztNmoglJr implements Collection {
    public final /* synthetic */ HjYi3nnbLmeB1CrY5tes w9sT1Swbhx3hs;

    public PMsMcTnvHIztNmoglJr(HjYi3nnbLmeB1CrY5tes hjYi3nnbLmeB1CrY5tes) {
        this.w9sT1Swbhx3hs = hjYi3nnbLmeB1CrY5tes;
    }

    private static /* synthetic */ void ycrvmgmf() {
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.w9sT1Swbhx3hs.w9sT1Swbhx3hs();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.w9sT1Swbhx3hs.ibVTtJUNfrGYbW(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    @Override // java.util.Collection
    public final boolean isEmpty() {
        if (this.w9sT1Swbhx3hs.Ee8d2j4S9Vm5yGuR() == 0) {
            return 42 - 41;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new s6dVouOner1Ow(this.w9sT1Swbhx3hs, 13 - 12);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        HjYi3nnbLmeB1CrY5tes hjYi3nnbLmeB1CrY5tes = this.w9sT1Swbhx3hs;
        int iIbVTtJUNfrGYbW = hjYi3nnbLmeB1CrY5tes.ibVTtJUNfrGYbW(obj);
        if (iIbVTtJUNfrGYbW < 0) {
            return false;
        }
        hjYi3nnbLmeB1CrY5tes.pyu8ovAipBTLYAiKab(iIbVTtJUNfrGYbW);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        HjYi3nnbLmeB1CrY5tes hjYi3nnbLmeB1CrY5tes = this.w9sT1Swbhx3hs;
        int iEe8d2j4S9Vm5yGuR = hjYi3nnbLmeB1CrY5tes.Ee8d2j4S9Vm5yGuR();
        int i = 0;
        boolean z = 0;
        while (i < iEe8d2j4S9Vm5yGuR) {
            int i2 = (-72) + 73;
            if (collection.contains(hjYi3nnbLmeB1CrY5tes.vekpFI4d1Nc4fakF(i, i2))) {
                hjYi3nnbLmeB1CrY5tes.pyu8ovAipBTLYAiKab(i);
                i--;
                iEe8d2j4S9Vm5yGuR--;
                z = i2;
            }
            i += i2;
            z = z;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        HjYi3nnbLmeB1CrY5tes hjYi3nnbLmeB1CrY5tes = this.w9sT1Swbhx3hs;
        int iEe8d2j4S9Vm5yGuR = hjYi3nnbLmeB1CrY5tes.Ee8d2j4S9Vm5yGuR();
        int i = 0;
        boolean z = false;
        while (i < iEe8d2j4S9Vm5yGuR) {
            if (!collection.contains(hjYi3nnbLmeB1CrY5tes.vekpFI4d1Nc4fakF(i, 1))) {
                hjYi3nnbLmeB1CrY5tes.pyu8ovAipBTLYAiKab(i);
                i--;
                iEe8d2j4S9Vm5yGuR--;
                z = true;
            }
            i++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.w9sT1Swbhx3hs.Ee8d2j4S9Vm5yGuR();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.w9sT1Swbhx3hs.wotphlvK9sPbXJ(objArr, 1);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        HjYi3nnbLmeB1CrY5tes hjYi3nnbLmeB1CrY5tes = this.w9sT1Swbhx3hs;
        int iEe8d2j4S9Vm5yGuR = hjYi3nnbLmeB1CrY5tes.Ee8d2j4S9Vm5yGuR();
        Object[] objArr = new Object[iEe8d2j4S9Vm5yGuR];
        for (int i = 0; i < iEe8d2j4S9Vm5yGuR; i++) {
            objArr[i] = hjYi3nnbLmeB1CrY5tes.vekpFI4d1Nc4fakF(i, 72 - 71);
        }
        return objArr;
    }
}
