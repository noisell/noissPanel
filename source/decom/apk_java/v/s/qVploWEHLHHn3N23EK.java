package v.s;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class qVploWEHLHHn3N23EK implements Set {
    public final /* synthetic */ HjYi3nnbLmeB1CrY5tes vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs;

    public /* synthetic */ qVploWEHLHHn3N23EK(HjYi3nnbLmeB1CrY5tes hjYi3nnbLmeB1CrY5tes, int i) {
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = hjYi3nnbLmeB1CrY5tes;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                HjYi3nnbLmeB1CrY5tes hjYi3nnbLmeB1CrY5tes = this.vekpFI4d1Nc4fakF;
                int iEe8d2j4S9Vm5yGuR = hjYi3nnbLmeB1CrY5tes.Ee8d2j4S9Vm5yGuR();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    hjYi3nnbLmeB1CrY5tes.b1EoSIRjJHO5(entry.getKey(), entry.getValue());
                }
                return iEe8d2j4S9Vm5yGuR != hjYi3nnbLmeB1CrY5tes.Ee8d2j4S9Vm5yGuR();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                this.vekpFI4d1Nc4fakF.w9sT1Swbhx3hs();
                break;
            default:
                this.vekpFI4d1Nc4fakF.w9sT1Swbhx3hs();
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                HjYi3nnbLmeB1CrY5tes hjYi3nnbLmeB1CrY5tes = this.vekpFI4d1Nc4fakF;
                int iXDyLpEZyrcKVe0 = hjYi3nnbLmeB1CrY5tes.xDyLpEZyrcKVe0(key);
                if (iXDyLpEZyrcKVe0 < 0) {
                    return false;
                }
                Object objVekpFI4d1Nc4fakF = hjYi3nnbLmeB1CrY5tes.vekpFI4d1Nc4fakF(iXDyLpEZyrcKVe0, 1);
                Object value = entry.getValue();
                return objVekpFI4d1Nc4fakF == value || (objVekpFI4d1Nc4fakF != null && objVekpFI4d1Nc4fakF.equals(value));
            default:
                return this.vekpFI4d1Nc4fakF.xDyLpEZyrcKVe0(obj) >= 0;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                Map mapJXn4Qf7zpnLjP5 = this.vekpFI4d1Nc4fakF.JXn4Qf7zpnLjP5();
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!mapJXn4Qf7zpnLjP5.containsKey(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                break;
        }
        return HjYi3nnbLmeB1CrY5tes.gmNWMfvn6zlEj(this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                HjYi3nnbLmeB1CrY5tes hjYi3nnbLmeB1CrY5tes = this.vekpFI4d1Nc4fakF;
                int i = 51 - 50;
                int iHashCode = 0;
                for (int iEe8d2j4S9Vm5yGuR = hjYi3nnbLmeB1CrY5tes.Ee8d2j4S9Vm5yGuR() - i; iEe8d2j4S9Vm5yGuR >= 0; iEe8d2j4S9Vm5yGuR--) {
                    Object objVekpFI4d1Nc4fakF = hjYi3nnbLmeB1CrY5tes.vekpFI4d1Nc4fakF(iEe8d2j4S9Vm5yGuR, 0);
                    Object objVekpFI4d1Nc4fakF2 = hjYi3nnbLmeB1CrY5tes.vekpFI4d1Nc4fakF(iEe8d2j4S9Vm5yGuR, i);
                    iHashCode += (objVekpFI4d1Nc4fakF == null ? 0 : objVekpFI4d1Nc4fakF.hashCode()) ^ (objVekpFI4d1Nc4fakF2 == null ? 0 : objVekpFI4d1Nc4fakF2.hashCode());
                }
                return iHashCode;
            default:
                HjYi3nnbLmeB1CrY5tes hjYi3nnbLmeB1CrY5tes2 = this.vekpFI4d1Nc4fakF;
                int iHashCode2 = 0;
                for (int iEe8d2j4S9Vm5yGuR2 = hjYi3nnbLmeB1CrY5tes2.Ee8d2j4S9Vm5yGuR() - 1; iEe8d2j4S9Vm5yGuR2 >= 0; iEe8d2j4S9Vm5yGuR2--) {
                    Object objVekpFI4d1Nc4fakF3 = hjYi3nnbLmeB1CrY5tes2.vekpFI4d1Nc4fakF(iEe8d2j4S9Vm5yGuR2, 0);
                    iHashCode2 += objVekpFI4d1Nc4fakF3 == null ? 0 : objVekpFI4d1Nc4fakF3.hashCode();
                }
                return iHashCode2;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                return this.vekpFI4d1Nc4fakF.Ee8d2j4S9Vm5yGuR() == 0;
            default:
                return this.vekpFI4d1Nc4fakF.Ee8d2j4S9Vm5yGuR() == 0;
        }
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                return new hLOE1wBdOCExK6(this.vekpFI4d1Nc4fakF);
            default:
                return new s6dVouOner1Ow(this.vekpFI4d1Nc4fakF, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                HjYi3nnbLmeB1CrY5tes hjYi3nnbLmeB1CrY5tes = this.vekpFI4d1Nc4fakF;
                int iXDyLpEZyrcKVe0 = hjYi3nnbLmeB1CrY5tes.xDyLpEZyrcKVe0(obj);
                if (iXDyLpEZyrcKVe0 < 0) {
                    return false;
                }
                hjYi3nnbLmeB1CrY5tes.pyu8ovAipBTLYAiKab(iXDyLpEZyrcKVe0);
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map mapJXn4Qf7zpnLjP5 = this.vekpFI4d1Nc4fakF.JXn4Qf7zpnLjP5();
                int size = mapJXn4Qf7zpnLjP5.size();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    mapJXn4Qf7zpnLjP5.remove(it.next());
                }
                return size != mapJXn4Qf7zpnLjP5.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map mapJXn4Qf7zpnLjP5 = this.vekpFI4d1Nc4fakF.JXn4Qf7zpnLjP5();
                int size = mapJXn4Qf7zpnLjP5.size();
                Iterator it = mapJXn4Qf7zpnLjP5.keySet().iterator();
                while (it.hasNext()) {
                    if (!collection.contains(it.next())) {
                        it.remove();
                    }
                }
                return size != mapJXn4Qf7zpnLjP5.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                break;
        }
        return this.vekpFI4d1Nc4fakF.Ee8d2j4S9Vm5yGuR();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return this.vekpFI4d1Nc4fakF.wotphlvK9sPbXJ(objArr, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                HjYi3nnbLmeB1CrY5tes hjYi3nnbLmeB1CrY5tes = this.vekpFI4d1Nc4fakF;
                int iEe8d2j4S9Vm5yGuR = hjYi3nnbLmeB1CrY5tes.Ee8d2j4S9Vm5yGuR();
                Object[] objArr = new Object[iEe8d2j4S9Vm5yGuR];
                for (int i = 0; i < iEe8d2j4S9Vm5yGuR; i++) {
                    objArr[i] = hjYi3nnbLmeB1CrY5tes.vekpFI4d1Nc4fakF(i, 0);
                }
                return objArr;
        }
    }
}
