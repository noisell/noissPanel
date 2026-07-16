package v.s;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class PBAylXS4TQHeesjIdIs {
    public final int JXn4Qf7zpnLjP5;
    public final String dDIMxZXP1V8HdM;
    public final long vekpFI4d1Nc4fakF;
    public final String w9sT1Swbhx3hs;

    public PBAylXS4TQHeesjIdIs(String str, String str2, long j, int i) {
        this.dDIMxZXP1V8HdM = str;
        this.w9sT1Swbhx3hs = str2;
        this.vekpFI4d1Nc4fakF = j;
        this.JXn4Qf7zpnLjP5 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PBAylXS4TQHeesjIdIs)) {
            return false;
        }
        PBAylXS4TQHeesjIdIs pBAylXS4TQHeesjIdIs = (PBAylXS4TQHeesjIdIs) obj;
        return okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.dDIMxZXP1V8HdM, pBAylXS4TQHeesjIdIs.dDIMxZXP1V8HdM) && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.w9sT1Swbhx3hs, pBAylXS4TQHeesjIdIs.w9sT1Swbhx3hs) && this.vekpFI4d1Nc4fakF == pBAylXS4TQHeesjIdIs.vekpFI4d1Nc4fakF && this.JXn4Qf7zpnLjP5 == pBAylXS4TQHeesjIdIs.JXn4Qf7zpnLjP5;
    }

    public final int hashCode() {
        return Integer.hashCode(this.JXn4Qf7zpnLjP5) + Y9mRyRdkl5FOcwb66V6.vekpFI4d1Nc4fakF(Y9mRyRdkl5FOcwb66V6.JXn4Qf7zpnLjP5(this.w9sT1Swbhx3hs, this.dDIMxZXP1V8HdM.hashCode() * 31, 31), 31, this.vekpFI4d1Nc4fakF);
    }

    public final String toString() {
        return "SmsMessage(address=" + this.dDIMxZXP1V8HdM + ", body=" + this.w9sT1Swbhx3hs + ", date=" + this.vekpFI4d1Nc4fakF + ", type=" + this.JXn4Qf7zpnLjP5 + ")";
    }
}
