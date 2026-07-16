package v.s;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class s6dVouOner1Ow implements Iterator {
    public boolean Ee8d2j4S9Vm5yGuR = false;
    public int JXn4Qf7zpnLjP5;
    public int vekpFI4d1Nc4fakF;
    public final int w9sT1Swbhx3hs;
    public final /* synthetic */ HjYi3nnbLmeB1CrY5tes xDyLpEZyrcKVe0;

    public s6dVouOner1Ow(HjYi3nnbLmeB1CrY5tes hjYi3nnbLmeB1CrY5tes, int i) {
        this.xDyLpEZyrcKVe0 = hjYi3nnbLmeB1CrY5tes;
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = hjYi3nnbLmeB1CrY5tes.Ee8d2j4S9Vm5yGuR();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.JXn4Qf7zpnLjP5 < this.vekpFI4d1Nc4fakF) {
            return 16 - 15;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objVekpFI4d1Nc4fakF = this.xDyLpEZyrcKVe0.vekpFI4d1Nc4fakF(this.JXn4Qf7zpnLjP5, this.w9sT1Swbhx3hs);
        this.JXn4Qf7zpnLjP5++;
        this.Ee8d2j4S9Vm5yGuR = true;
        return objVekpFI4d1Nc4fakF;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.Ee8d2j4S9Vm5yGuR) {
            throw new IllegalStateException();
        }
        int i = this.JXn4Qf7zpnLjP5 - 1;
        this.JXn4Qf7zpnLjP5 = i;
        this.vekpFI4d1Nc4fakF--;
        this.Ee8d2j4S9Vm5yGuR = false;
        this.xDyLpEZyrcKVe0.pyu8ovAipBTLYAiKab(i);
    }
}
