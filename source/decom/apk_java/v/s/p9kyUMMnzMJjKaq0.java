package v.s;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class p9kyUMMnzMJjKaq0 extends jY5GWhdUHyokX {
    public final String Ee8d2j4S9Vm5yGuR;
    public final Integer JXn4Qf7zpnLjP5;
    public final long dDIMxZXP1V8HdM;
    public final jZnJIJ9XWyPWR6i6tCvt vekpFI4d1Nc4fakF;
    public final long w9sT1Swbhx3hs;
    public final ArrayList xDyLpEZyrcKVe0;

    public p9kyUMMnzMJjKaq0(long j, long j2, jZnJIJ9XWyPWR6i6tCvt jznjij9xwypwr6i6tcvt, Integer num, String str, ArrayList arrayList) {
        WhOHSFV3G9aP8ArcgZu whOHSFV3G9aP8ArcgZu = WhOHSFV3G9aP8ArcgZu.w9sT1Swbhx3hs;
        this.dDIMxZXP1V8HdM = j;
        this.w9sT1Swbhx3hs = j2;
        this.vekpFI4d1Nc4fakF = jznjij9xwypwr6i6tcvt;
        this.JXn4Qf7zpnLjP5 = num;
        this.Ee8d2j4S9Vm5yGuR = str;
        this.xDyLpEZyrcKVe0 = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jY5GWhdUHyokX)) {
            return false;
        }
        p9kyUMMnzMJjKaq0 p9kyummnzmjjkaq0 = (p9kyUMMnzMJjKaq0) ((jY5GWhdUHyokX) obj);
        Object obj2 = WhOHSFV3G9aP8ArcgZu.w9sT1Swbhx3hs;
        ArrayList arrayList = p9kyummnzmjjkaq0.xDyLpEZyrcKVe0;
        String str = p9kyummnzmjjkaq0.Ee8d2j4S9Vm5yGuR;
        Integer num = p9kyummnzmjjkaq0.JXn4Qf7zpnLjP5;
        jZnJIJ9XWyPWR6i6tCvt jznjij9xwypwr6i6tcvt = p9kyummnzmjjkaq0.vekpFI4d1Nc4fakF;
        if (this.dDIMxZXP1V8HdM != p9kyummnzmjjkaq0.dDIMxZXP1V8HdM || this.w9sT1Swbhx3hs != p9kyummnzmjjkaq0.w9sT1Swbhx3hs || !this.vekpFI4d1Nc4fakF.equals(jznjij9xwypwr6i6tcvt)) {
            return false;
        }
        Integer num2 = this.JXn4Qf7zpnLjP5;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str2 = this.Ee8d2j4S9Vm5yGuR;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return this.xDyLpEZyrcKVe0.equals(arrayList) && obj2.equals(obj2);
    }

    public final int hashCode() {
        long j = this.dDIMxZXP1V8HdM;
        long j2 = this.w9sT1Swbhx3hs;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.vekpFI4d1Nc4fakF.hashCode()) * 1000003;
        Integer num = this.JXn4Qf7zpnLjP5;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.Ee8d2j4S9Vm5yGuR;
        return ((((iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.xDyLpEZyrcKVe0.hashCode()) * 1000003) ^ WhOHSFV3G9aP8ArcgZu.w9sT1Swbhx3hs.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.dDIMxZXP1V8HdM + ", requestUptimeMs=" + this.w9sT1Swbhx3hs + ", clientInfo=" + this.vekpFI4d1Nc4fakF + ", logSource=" + this.JXn4Qf7zpnLjP5 + ", logSourceName=" + this.Ee8d2j4S9Vm5yGuR + ", logEvents=" + this.xDyLpEZyrcKVe0 + ", qosTier=" + WhOHSFV3G9aP8ArcgZu.w9sT1Swbhx3hs + "}";
    }
}
