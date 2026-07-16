package v.s;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class xH380dEhDsa5zwemTP implements Iterator, buUjKwCmuWSvVXs {
    public int Ee8d2j4S9Vm5yGuR;
    public boolean JXn4Qf7zpnLjP5;
    public final int vekpFI4d1Nc4fakF;
    public final int w9sT1Swbhx3hs;

    public xH380dEhDsa5zwemTP(int i, int i2, int i3) {
        this.w9sT1Swbhx3hs = i3;
        this.vekpFI4d1Nc4fakF = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.JXn4Qf7zpnLjP5 = z;
        this.Ee8d2j4S9Vm5yGuR = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.JXn4Qf7zpnLjP5;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }

    public final int nextInt() {
        int i = this.Ee8d2j4S9Vm5yGuR;
        if (i != this.vekpFI4d1Nc4fakF) {
            this.Ee8d2j4S9Vm5yGuR = this.w9sT1Swbhx3hs + i;
            return i;
        }
        if (!this.JXn4Qf7zpnLjP5) {
            throw new NoSuchElementException();
        }
        this.JXn4Qf7zpnLjP5 = false;
        return i;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
