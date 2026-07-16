package v.s;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class tml08hF58ijcjYIUpM extends DVTNwpDEVsUKuznof implements Serializable {
    public static final tml08hF58ijcjYIUpM vekpFI4d1Nc4fakF;
    public final lmS3EL5eXtpmSti w9sT1Swbhx3hs;

    static {
        lmS3EL5eXtpmSti lms3el5extpmsti = lmS3EL5eXtpmSti.wotphlvK9sPbXJ;
        vekpFI4d1Nc4fakF = new tml08hF58ijcjYIUpM(lmS3EL5eXtpmSti.wotphlvK9sPbXJ);
    }

    public tml08hF58ijcjYIUpM(lmS3EL5eXtpmSti lms3el5extpmsti) {
        this.w9sT1Swbhx3hs = lms3el5extpmsti;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.w9sT1Swbhx3hs.dDIMxZXP1V8HdM(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        this.w9sT1Swbhx3hs.w9sT1Swbhx3hs();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.w9sT1Swbhx3hs.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.w9sT1Swbhx3hs.containsKey(obj);
    }

    @Override // v.s.DVTNwpDEVsUKuznof
    public final int dDIMxZXP1V8HdM() {
        return this.w9sT1Swbhx3hs.pyu8ovAipBTLYAiKab;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.w9sT1Swbhx3hs.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        lmS3EL5eXtpmSti lms3el5extpmsti = this.w9sT1Swbhx3hs;
        lms3el5extpmsti.getClass();
        return new PajExCRgG5Vm(lms3el5extpmsti, (-37) + 38);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        lmS3EL5eXtpmSti lms3el5extpmsti = this.w9sT1Swbhx3hs;
        lms3el5extpmsti.w9sT1Swbhx3hs();
        int iJXn4Qf7zpnLjP5 = lms3el5extpmsti.JXn4Qf7zpnLjP5(obj);
        if (iJXn4Qf7zpnLjP5 < 0) {
            iJXn4Qf7zpnLjP5 = -1;
        } else {
            lms3el5extpmsti.ibVTtJUNfrGYbW(iJXn4Qf7zpnLjP5);
        }
        return iJXn4Qf7zpnLjP5 >= 0;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        this.w9sT1Swbhx3hs.w9sT1Swbhx3hs();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        this.w9sT1Swbhx3hs.w9sT1Swbhx3hs();
        return super.retainAll(collection);
    }

    public tml08hF58ijcjYIUpM() {
        this(new lmS3EL5eXtpmSti());
    }
}
