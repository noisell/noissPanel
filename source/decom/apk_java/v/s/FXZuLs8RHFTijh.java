package v.s;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class FXZuLs8RHFTijh implements Iterator, buUjKwCmuWSvVXs {
    public long Ee8d2j4S9Vm5yGuR;
    public boolean JXn4Qf7zpnLjP5;
    public final long vekpFI4d1Nc4fakF;
    public final long w9sT1Swbhx3hs;

    public FXZuLs8RHFTijh(long j, long j2, long j3) {
        this.w9sT1Swbhx3hs = j3;
        this.vekpFI4d1Nc4fakF = j2;
        boolean z = false;
        if (j3 <= 0 ? j >= j2 : j <= j2) {
            z = true;
        }
        this.JXn4Qf7zpnLjP5 = z;
        this.Ee8d2j4S9Vm5yGuR = z ? j : j2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.JXn4Qf7zpnLjP5;
    }

    @Override // java.util.Iterator
    public final Object next() {
        long j = this.Ee8d2j4S9Vm5yGuR;
        if (j != this.vekpFI4d1Nc4fakF) {
            this.Ee8d2j4S9Vm5yGuR = this.w9sT1Swbhx3hs + j;
        } else {
            if (!this.JXn4Qf7zpnLjP5) {
                throw new NoSuchElementException();
            }
            this.JXn4Qf7zpnLjP5 = false;
        }
        return Long.valueOf(j);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
