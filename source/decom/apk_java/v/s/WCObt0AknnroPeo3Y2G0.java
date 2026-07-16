package v.s;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class WCObt0AknnroPeo3Y2G0 {
    public int dDIMxZXP1V8HdM;
    public final int[] w9sT1Swbhx3hs = new int[10];

    private static /* synthetic */ void xqedbwxpl() {
    }

    public final int dDIMxZXP1V8HdM() {
        if ((this.dDIMxZXP1V8HdM & 128) != 0) {
            return this.w9sT1Swbhx3hs[7];
        }
        return 65535;
    }

    public final void w9sT1Swbhx3hs(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.w9sT1Swbhx3hs;
            if (i >= iArr.length) {
                return;
            }
            this.dDIMxZXP1V8HdM = (1 << i) | this.dDIMxZXP1V8HdM;
            iArr[i] = i2;
        }
    }
}
