package v.s;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class P7b7KFoJnwoYcb {
    public Object Ee8d2j4S9Vm5yGuR;
    public Object JXn4Qf7zpnLjP5;
    public String dDIMxZXP1V8HdM;
    public Object ibVTtJUNfrGYbW;
    public Object vekpFI4d1Nc4fakF;
    public int w9sT1Swbhx3hs;
    public Object xDyLpEZyrcKVe0;

    private static /* synthetic */ void mino() {
    }

    public qhsM0NLCW4lYFI8kGz dDIMxZXP1V8HdM() {
        String strIbVTtJUNfrGYbW = this.w9sT1Swbhx3hs == 0 ? " registrationStatus" : "";
        if (((Long) this.xDyLpEZyrcKVe0) == null) {
            strIbVTtJUNfrGYbW = strIbVTtJUNfrGYbW.concat(" expiresInSecs");
        }
        if (((Long) this.ibVTtJUNfrGYbW) == null) {
            strIbVTtJUNfrGYbW = Y9mRyRdkl5FOcwb66V6.ibVTtJUNfrGYbW(strIbVTtJUNfrGYbW, " tokenCreationEpochInSecs");
        }
        if (strIbVTtJUNfrGYbW.isEmpty()) {
            return new qhsM0NLCW4lYFI8kGz(this.dDIMxZXP1V8HdM, this.w9sT1Swbhx3hs, (String) this.vekpFI4d1Nc4fakF, (String) this.JXn4Qf7zpnLjP5, ((Long) this.xDyLpEZyrcKVe0).longValue(), ((Long) this.ibVTtJUNfrGYbW).longValue(), (String) this.Ee8d2j4S9Vm5yGuR);
        }
        throw new IllegalStateException("Missing required properties:".concat(strIbVTtJUNfrGYbW));
    }
}
