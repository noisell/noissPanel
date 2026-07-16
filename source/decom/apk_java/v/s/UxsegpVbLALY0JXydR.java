package v.s;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class UxsegpVbLALY0JXydR implements Iterator, buUjKwCmuWSvVXs {
    public VUjeMiNYIJhgmVJopga Ee8d2j4S9Vm5yGuR;
    public int JXn4Qf7zpnLjP5;
    public int vekpFI4d1Nc4fakF;
    public int w9sT1Swbhx3hs = -1;
    public final /* synthetic */ t5I6jdrMX1qc4Tt xDyLpEZyrcKVe0;

    public UxsegpVbLALY0JXydR(t5I6jdrMX1qc4Tt t5i6jdrmx1qc4tt) {
        this.xDyLpEZyrcKVe0 = t5i6jdrmx1qc4tt;
        int iXDyLpEZyrcKVe0 = OFtLBiBbrrTHWu.xDyLpEZyrcKVe0(0, 0, ((CharSequence) t5i6jdrmx1qc4tt.w9sT1Swbhx3hs).length());
        this.vekpFI4d1Nc4fakF = iXDyLpEZyrcKVe0;
        this.JXn4Qf7zpnLjP5 = iXDyLpEZyrcKVe0;
    }

    private static /* synthetic */ void bjlendx() {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [v.s.LGm23hksIOxB, v.s.NhN5GSKLYh6STld4] */
    public final void dDIMxZXP1V8HdM() {
        yI1KTRoNlsjx yi1ktronlsjx;
        t5I6jdrMX1qc4Tt t5i6jdrmx1qc4tt = this.xDyLpEZyrcKVe0;
        CharSequence charSequence = (CharSequence) t5i6jdrmx1qc4tt.w9sT1Swbhx3hs;
        int i = this.JXn4Qf7zpnLjP5;
        if (i < 0) {
            this.w9sT1Swbhx3hs = 0;
            this.Ee8d2j4S9Vm5yGuR = null;
            return;
        }
        if (i <= charSequence.length() && (yi1ktronlsjx = (yI1KTRoNlsjx) t5i6jdrmx1qc4tt.vekpFI4d1Nc4fakF.b1EoSIRjJHO5(charSequence, Integer.valueOf(this.JXn4Qf7zpnLjP5))) != null) {
            int iIntValue = ((Number) yi1ktronlsjx.w9sT1Swbhx3hs).intValue();
            int iIntValue2 = ((Number) yi1ktronlsjx.vekpFI4d1Nc4fakF).intValue();
            this.Ee8d2j4S9Vm5yGuR = OFtLBiBbrrTHWu.ECwLkmPW1UKz7J6E(this.vekpFI4d1Nc4fakF, iIntValue);
            int i2 = iIntValue + iIntValue2;
            this.vekpFI4d1Nc4fakF = i2;
            this.JXn4Qf7zpnLjP5 = i2 + (iIntValue2 == 0 ? 1 : 0);
        } else {
            this.Ee8d2j4S9Vm5yGuR = new VUjeMiNYIJhgmVJopga(this.vekpFI4d1Nc4fakF, KgSM0TsKUpCiuePB.dQC4QhgRN3MSEAP3HW0(charSequence), 1);
            this.JXn4Qf7zpnLjP5 = -1;
        }
        this.w9sT1Swbhx3hs = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.w9sT1Swbhx3hs == -1) {
            dDIMxZXP1V8HdM();
        }
        return this.w9sT1Swbhx3hs == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.w9sT1Swbhx3hs == -1) {
            dDIMxZXP1V8HdM();
        }
        if (this.w9sT1Swbhx3hs == 0) {
            throw new NoSuchElementException();
        }
        VUjeMiNYIJhgmVJopga vUjeMiNYIJhgmVJopga = this.Ee8d2j4S9Vm5yGuR;
        this.Ee8d2j4S9Vm5yGuR = null;
        this.w9sT1Swbhx3hs = -1;
        return vUjeMiNYIJhgmVJopga;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
