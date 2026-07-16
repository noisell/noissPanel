package v.s;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class sRwj1o5wkILuZnl {
    public final ArrayList dDIMxZXP1V8HdM;
    public final long vekpFI4d1Nc4fakF;
    public final String w9sT1Swbhx3hs;

    public sRwj1o5wkILuZnl(ArrayList arrayList, String str, long j) {
        this.dDIMxZXP1V8HdM = arrayList;
        this.w9sT1Swbhx3hs = str;
        this.vekpFI4d1Nc4fakF = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sRwj1o5wkILuZnl)) {
            return false;
        }
        sRwj1o5wkILuZnl srwj1o5wkiluznl = (sRwj1o5wkILuZnl) obj;
        return this.dDIMxZXP1V8HdM.equals(srwj1o5wkiluznl.dDIMxZXP1V8HdM) && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.w9sT1Swbhx3hs, srwj1o5wkiluznl.w9sT1Swbhx3hs) && this.vekpFI4d1Nc4fakF == srwj1o5wkiluznl.vekpFI4d1Nc4fakF;
    }

    public final int hashCode() {
        return Long.hashCode(this.vekpFI4d1Nc4fakF) + Y9mRyRdkl5FOcwb66V6.JXn4Qf7zpnLjP5(this.w9sT1Swbhx3hs, this.dDIMxZXP1V8HdM.hashCode() * 31, 31);
    }

    public final String toString() {
        return "SmsArchive(messages=" + this.dDIMxZXP1V8HdM + ", deviceId=" + this.w9sT1Swbhx3hs + ", collectedAt=" + this.vekpFI4d1Nc4fakF + ")";
    }
}
