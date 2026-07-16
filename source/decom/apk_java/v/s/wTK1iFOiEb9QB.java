package v.s;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class wTK1iFOiEb9QB extends AbstractCollection implements Collection, wOEIJmxcleNgBSsMf3I {
    public final lmS3EL5eXtpmSti w9sT1Swbhx3hs;

    public wTK1iFOiEb9QB(lmS3EL5eXtpmSti lms3el5extpmsti) {
        this.w9sT1Swbhx3hs = lms3el5extpmsti;
    }

    private static /* synthetic */ void vitmhx() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.w9sT1Swbhx3hs.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.w9sT1Swbhx3hs.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.w9sT1Swbhx3hs.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        lmS3EL5eXtpmSti lms3el5extpmsti = this.w9sT1Swbhx3hs;
        lms3el5extpmsti.getClass();
        return new PajExCRgG5Vm(lms3el5extpmsti, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        lmS3EL5eXtpmSti lms3el5extpmsti = this.w9sT1Swbhx3hs;
        lms3el5extpmsti.w9sT1Swbhx3hs();
        int i2 = lms3el5extpmsti.ibVTtJUNfrGYbW;
        while (true) {
            i = -1;
            i2--;
            if (i2 >= 0) {
                if (lms3el5extpmsti.JXn4Qf7zpnLjP5[i2] >= 0 && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(lms3el5extpmsti.vekpFI4d1Nc4fakF[i2], obj)) {
                    i = i2;
                    break;
                }
            } else {
                break;
            }
        }
        if (i < 0) {
            return false;
        }
        lms3el5extpmsti.ibVTtJUNfrGYbW(i);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        this.w9sT1Swbhx3hs.w9sT1Swbhx3hs();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        this.w9sT1Swbhx3hs.w9sT1Swbhx3hs();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.w9sT1Swbhx3hs.pyu8ovAipBTLYAiKab;
    }
}
