package v.s;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class DgfWFHNhxstn87SPuN extends DVTNwpDEVsUKuznof {
    public final lmS3EL5eXtpmSti vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs;

    public /* synthetic */ DgfWFHNhxstn87SPuN(lmS3EL5eXtpmSti lms3el5extpmsti, int i) {
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = lms3el5extpmsti;
    }

    private static /* synthetic */ void brbmi() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                this.vekpFI4d1Nc4fakF.clear();
                break;
            default:
                this.vekpFI4d1Nc4fakF.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                lmS3EL5eXtpmSti lms3el5extpmsti = this.vekpFI4d1Nc4fakF;
                lms3el5extpmsti.getClass();
                int iJXn4Qf7zpnLjP5 = lms3el5extpmsti.JXn4Qf7zpnLjP5(entry.getKey());
                if (iJXn4Qf7zpnLjP5 < 0) {
                    return false;
                }
                return okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(lms3el5extpmsti.vekpFI4d1Nc4fakF[iJXn4Qf7zpnLjP5], entry.getValue());
            default:
                return this.vekpFI4d1Nc4fakF.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                lmS3EL5eXtpmSti lms3el5extpmsti = this.vekpFI4d1Nc4fakF;
                lms3el5extpmsti.getClass();
                for (Object obj : collection) {
                    if (obj == null) {
                        return false;
                    }
                    try {
                        Map.Entry entry = (Map.Entry) obj;
                        int iJXn4Qf7zpnLjP5 = lms3el5extpmsti.JXn4Qf7zpnLjP5(entry.getKey());
                        if (!(iJXn4Qf7zpnLjP5 < 0 ? false : okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(lms3el5extpmsti.vekpFI4d1Nc4fakF[iJXn4Qf7zpnLjP5], entry.getValue()))) {
                            return false;
                        }
                    } catch (ClassCastException unused) {
                        return false;
                    }
                }
                return true;
            default:
                return super.containsAll(collection);
        }
    }

    @Override // v.s.DVTNwpDEVsUKuznof
    public final int dDIMxZXP1V8HdM() {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                break;
        }
        return this.vekpFI4d1Nc4fakF.pyu8ovAipBTLYAiKab;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                break;
        }
        return this.vekpFI4d1Nc4fakF.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                lmS3EL5eXtpmSti lms3el5extpmsti = this.vekpFI4d1Nc4fakF;
                lms3el5extpmsti.getClass();
                return new PajExCRgG5Vm(lms3el5extpmsti, 0);
            default:
                lmS3EL5eXtpmSti lms3el5extpmsti2 = this.vekpFI4d1Nc4fakF;
                lms3el5extpmsti2.getClass();
                return new PajExCRgG5Vm(lms3el5extpmsti2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                lmS3EL5eXtpmSti lms3el5extpmsti = this.vekpFI4d1Nc4fakF;
                lms3el5extpmsti.w9sT1Swbhx3hs();
                int iJXn4Qf7zpnLjP5 = lms3el5extpmsti.JXn4Qf7zpnLjP5(entry.getKey());
                if (iJXn4Qf7zpnLjP5 < 0 || !okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(lms3el5extpmsti.vekpFI4d1Nc4fakF[iJXn4Qf7zpnLjP5], entry.getValue())) {
                    return false;
                }
                lms3el5extpmsti.ibVTtJUNfrGYbW(iJXn4Qf7zpnLjP5);
                return true;
            default:
                lmS3EL5eXtpmSti lms3el5extpmsti2 = this.vekpFI4d1Nc4fakF;
                lms3el5extpmsti2.w9sT1Swbhx3hs();
                int iJXn4Qf7zpnLjP6 = lms3el5extpmsti2.JXn4Qf7zpnLjP5(obj);
                if (iJXn4Qf7zpnLjP6 < 0) {
                    iJXn4Qf7zpnLjP6 = -1;
                } else {
                    lms3el5extpmsti2.ibVTtJUNfrGYbW(iJXn4Qf7zpnLjP6);
                }
                return iJXn4Qf7zpnLjP6 >= 0;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                this.vekpFI4d1Nc4fakF.w9sT1Swbhx3hs();
                break;
            default:
                this.vekpFI4d1Nc4fakF.w9sT1Swbhx3hs();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                this.vekpFI4d1Nc4fakF.w9sT1Swbhx3hs();
                break;
            default:
                this.vekpFI4d1Nc4fakF.w9sT1Swbhx3hs();
                break;
        }
        return super.retainAll(collection);
    }
}
