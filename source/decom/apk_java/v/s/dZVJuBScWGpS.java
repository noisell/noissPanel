package v.s;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class dZVJuBScWGpS {
    public final long JXn4Qf7zpnLjP5;
    public final String dDIMxZXP1V8HdM;
    public final String vekpFI4d1Nc4fakF;
    public final String w9sT1Swbhx3hs;

    public dZVJuBScWGpS(String str, String str2, String str3, long j) {
        this.dDIMxZXP1V8HdM = str;
        this.w9sT1Swbhx3hs = str2;
        this.vekpFI4d1Nc4fakF = str3;
        this.JXn4Qf7zpnLjP5 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dZVJuBScWGpS)) {
            return false;
        }
        dZVJuBScWGpS dzvjubscwgps = (dZVJuBScWGpS) obj;
        return okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.dDIMxZXP1V8HdM, dzvjubscwgps.dDIMxZXP1V8HdM) && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.w9sT1Swbhx3hs, dzvjubscwgps.w9sT1Swbhx3hs) && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.vekpFI4d1Nc4fakF, dzvjubscwgps.vekpFI4d1Nc4fakF) && this.JXn4Qf7zpnLjP5 == dzvjubscwgps.JXn4Qf7zpnLjP5;
    }

    public final int hashCode() {
        int iJXn4Qf7zpnLjP5 = Y9mRyRdkl5FOcwb66V6.JXn4Qf7zpnLjP5(this.w9sT1Swbhx3hs, this.dDIMxZXP1V8HdM.hashCode() * 31, 31);
        String str = this.vekpFI4d1Nc4fakF;
        return Long.hashCode(this.JXn4Qf7zpnLjP5) + ((iJXn4Qf7zpnLjP5 + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "CardInfo(cardNumber=" + this.dDIMxZXP1V8HdM + ", bank=" + this.w9sT1Swbhx3hs + ", amount=" + this.vekpFI4d1Nc4fakF + ", timestamp=" + this.JXn4Qf7zpnLjP5 + ")";
    }
}
