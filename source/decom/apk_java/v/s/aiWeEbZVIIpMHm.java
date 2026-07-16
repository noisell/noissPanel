package v.s;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class aiWeEbZVIIpMHm {
    public final List Ee8d2j4S9Vm5yGuR;
    public final List JXn4Qf7zpnLjP5;
    public final String dDIMxZXP1V8HdM;
    public final String vekpFI4d1Nc4fakF;
    public final String w9sT1Swbhx3hs;

    public aiWeEbZVIIpMHm(String str, String str2, String str3, List list, List list2) {
        this.dDIMxZXP1V8HdM = str;
        this.w9sT1Swbhx3hs = str2;
        this.vekpFI4d1Nc4fakF = str3;
        this.JXn4Qf7zpnLjP5 = list;
        this.Ee8d2j4S9Vm5yGuR = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aiWeEbZVIIpMHm)) {
            return false;
        }
        aiWeEbZVIIpMHm aiweebzviipmhm = (aiWeEbZVIIpMHm) obj;
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.dDIMxZXP1V8HdM, aiweebzviipmhm.dDIMxZXP1V8HdM) && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.w9sT1Swbhx3hs, aiweebzviipmhm.w9sT1Swbhx3hs) && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.vekpFI4d1Nc4fakF, aiweebzviipmhm.vekpFI4d1Nc4fakF) && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.JXn4Qf7zpnLjP5, aiweebzviipmhm.JXn4Qf7zpnLjP5)) {
            return okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.Ee8d2j4S9Vm5yGuR, aiweebzviipmhm.Ee8d2j4S9Vm5yGuR);
        }
        return false;
    }

    public final int hashCode() {
        return this.Ee8d2j4S9Vm5yGuR.hashCode() + ((this.JXn4Qf7zpnLjP5.hashCode() + Y9mRyRdkl5FOcwb66V6.JXn4Qf7zpnLjP5(this.vekpFI4d1Nc4fakF, Y9mRyRdkl5FOcwb66V6.JXn4Qf7zpnLjP5(this.w9sT1Swbhx3hs, this.dDIMxZXP1V8HdM.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.dDIMxZXP1V8HdM + "', onDelete='" + this.w9sT1Swbhx3hs + " +', onUpdate='" + this.vekpFI4d1Nc4fakF + "', columnNames=" + this.JXn4Qf7zpnLjP5 + ", referenceColumnNames=" + this.Ee8d2j4S9Vm5yGuR + '}';
    }
}
