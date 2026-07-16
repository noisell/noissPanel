package v.s;

import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class MLSIo1htfMPWeB8V876L extends XiR1pIn5878vVWd implements RandomAccess {
    public final int JXn4Qf7zpnLjP5;
    public final int vekpFI4d1Nc4fakF;
    public final XiR1pIn5878vVWd w9sT1Swbhx3hs;

    public MLSIo1htfMPWeB8V876L(XiR1pIn5878vVWd xiR1pIn5878vVWd, int i, int i2) {
        this.w9sT1Swbhx3hs = xiR1pIn5878vVWd;
        this.vekpFI4d1Nc4fakF = i;
        OFtLBiBbrrTHWu.JXn4Qf7zpnLjP5(i, i2, xiR1pIn5878vVWd.dDIMxZXP1V8HdM());
        this.JXn4Qf7zpnLjP5 = i2 - i;
    }

    private static /* synthetic */ void htej() {
    }

    @Override // v.s.XiR1pIn5878vVWd
    public final int dDIMxZXP1V8HdM() {
        return this.JXn4Qf7zpnLjP5;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.JXn4Qf7zpnLjP5;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(Y9mRyRdkl5FOcwb66V6.Ee8d2j4S9Vm5yGuR(i, i2, "index: ", ", size: "));
        }
        return this.w9sT1Swbhx3hs.get(this.vekpFI4d1Nc4fakF + i);
    }
}
