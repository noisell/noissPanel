package v.s;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class oiz770u6HRtGO implements Iterator, buUjKwCmuWSvVXs {
    public final /* synthetic */ t5I6jdrMX1qc4Tt vekpFI4d1Nc4fakF;
    public final Iterator w9sT1Swbhx3hs;

    public oiz770u6HRtGO(t5I6jdrMX1qc4Tt t5i6jdrmx1qc4tt) {
        this.vekpFI4d1Nc4fakF = t5i6jdrmx1qc4tt;
        this.w9sT1Swbhx3hs = new UxsegpVbLALY0JXydR((t5I6jdrMX1qc4Tt) t5i6jdrmx1qc4tt.w9sT1Swbhx3hs);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.w9sT1Swbhx3hs.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ((vekpFI4d1Nc4fakF) this.vekpFI4d1Nc4fakF.vekpFI4d1Nc4fakF).pyu8ovAipBTLYAiKab(this.w9sT1Swbhx3hs.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
