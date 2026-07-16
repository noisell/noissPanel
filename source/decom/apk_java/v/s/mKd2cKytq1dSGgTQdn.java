package v.s;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class mKd2cKytq1dSGgTQdn {
    public final boolean Ee8d2j4S9Vm5yGuR;
    public final Integer JXn4Qf7zpnLjP5;
    public final boolean dDIMxZXP1V8HdM;
    public final boolean vekpFI4d1Nc4fakF;
    public final Integer w9sT1Swbhx3hs;
    public final boolean xDyLpEZyrcKVe0;

    public mKd2cKytq1dSGgTQdn(boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4) {
        this.dDIMxZXP1V8HdM = z;
        this.w9sT1Swbhx3hs = num;
        this.vekpFI4d1Nc4fakF = z2;
        this.JXn4Qf7zpnLjP5 = num2;
        this.Ee8d2j4S9Vm5yGuR = z3;
        this.xDyLpEZyrcKVe0 = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mKd2cKytq1dSGgTQdn)) {
            return false;
        }
        mKd2cKytq1dSGgTQdn mkd2ckytq1dsggtqdn = (mKd2cKytq1dSGgTQdn) obj;
        return this.dDIMxZXP1V8HdM == mkd2ckytq1dsggtqdn.dDIMxZXP1V8HdM && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.w9sT1Swbhx3hs, mkd2ckytq1dsggtqdn.w9sT1Swbhx3hs) && this.vekpFI4d1Nc4fakF == mkd2ckytq1dsggtqdn.vekpFI4d1Nc4fakF && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.JXn4Qf7zpnLjP5, mkd2ckytq1dsggtqdn.JXn4Qf7zpnLjP5) && this.Ee8d2j4S9Vm5yGuR == mkd2ckytq1dsggtqdn.Ee8d2j4S9Vm5yGuR && this.xDyLpEZyrcKVe0 == mkd2ckytq1dsggtqdn.xDyLpEZyrcKVe0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r3v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    public final int hashCode() {
        boolean z = this.dDIMxZXP1V8HdM;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = r1 * 31;
        Integer num = this.w9sT1Swbhx3hs;
        int iHashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        boolean z2 = this.vekpFI4d1Nc4fakF;
        ?? r3 = z2;
        if (z2) {
            r3 = 1;
        }
        int i2 = (iHashCode + r3) * 31;
        Integer num2 = this.JXn4Qf7zpnLjP5;
        int iHashCode2 = (i2 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z3 = this.Ee8d2j4S9Vm5yGuR;
        ?? r2 = z3;
        if (z3) {
            r2 = 1;
        }
        int i3 = (iHashCode2 + r2) * 31;
        boolean z4 = this.xDyLpEZyrcKVe0;
        return i3 + (z4 ? 1 : z4);
    }

    public final String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.dDIMxZXP1V8HdM + ", clientMaxWindowBits=" + this.w9sT1Swbhx3hs + ", clientNoContextTakeover=" + this.vekpFI4d1Nc4fakF + ", serverMaxWindowBits=" + this.JXn4Qf7zpnLjP5 + ", serverNoContextTakeover=" + this.Ee8d2j4S9Vm5yGuR + ", unknownValues=" + this.xDyLpEZyrcKVe0 + ')';
    }
}
