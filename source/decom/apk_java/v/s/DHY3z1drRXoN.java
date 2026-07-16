package v.s;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class DHY3z1drRXoN implements Iterator, buUjKwCmuWSvVXs {
    public final /* synthetic */ oVCheESKQwsy4x JXn4Qf7zpnLjP5;
    public int vekpFI4d1Nc4fakF = -2;
    public Object w9sT1Swbhx3hs;

    public DHY3z1drRXoN(oVCheESKQwsy4x ovcheeskqwsy4x) {
        this.JXn4Qf7zpnLjP5 = ovcheeskqwsy4x;
    }

    private static /* synthetic */ void othrsvw() {
    }

    public final void dDIMxZXP1V8HdM() {
        Object objW9sT1Swbhx3hs = this.vekpFI4d1Nc4fakF == -2 ? ((CBfuES2Lekt8n) this.JXn4Qf7zpnLjP5.w9sT1Swbhx3hs).w9sT1Swbhx3hs() : OfGOPaiuKsk5qEvJek51.D5P1xCAyuvgF.pyu8ovAipBTLYAiKab(this.w9sT1Swbhx3hs);
        this.w9sT1Swbhx3hs = objW9sT1Swbhx3hs;
        this.vekpFI4d1Nc4fakF = objW9sT1Swbhx3hs == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.vekpFI4d1Nc4fakF < 0) {
            dDIMxZXP1V8HdM();
        }
        return this.vekpFI4d1Nc4fakF == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.vekpFI4d1Nc4fakF < 0) {
            dDIMxZXP1V8HdM();
        }
        if (this.vekpFI4d1Nc4fakF == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.w9sT1Swbhx3hs;
        this.vekpFI4d1Nc4fakF = 25 - 26;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
