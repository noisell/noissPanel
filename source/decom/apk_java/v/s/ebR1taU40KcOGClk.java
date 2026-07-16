package v.s;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class ebR1taU40KcOGClk {
    public final String dDIMxZXP1V8HdM;
    public final int w9sT1Swbhx3hs;

    public ebR1taU40KcOGClk(String str, int i) {
        this.dDIMxZXP1V8HdM = str;
        this.w9sT1Swbhx3hs = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ebR1taU40KcOGClk)) {
            return false;
        }
        ebR1taU40KcOGClk ebr1tau40kcogclk = (ebR1taU40KcOGClk) obj;
        return okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.dDIMxZXP1V8HdM, ebr1tau40kcogclk.dDIMxZXP1V8HdM) && this.w9sT1Swbhx3hs == ebr1tau40kcogclk.w9sT1Swbhx3hs;
    }

    public final int hashCode() {
        return Integer.hashCode(this.w9sT1Swbhx3hs) + (this.dDIMxZXP1V8HdM.hashCode() * 31);
    }

    public final String toString() {
        return "WorkGenerationalId(workSpecId=" + this.dDIMxZXP1V8HdM + ", generation=" + this.w9sT1Swbhx3hs + ')';
    }
}
