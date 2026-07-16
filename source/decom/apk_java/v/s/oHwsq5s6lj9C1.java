package v.s;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class oHwsq5s6lj9C1 {
    public final long dDIMxZXP1V8HdM;
    public final Set vekpFI4d1Nc4fakF;
    public final long w9sT1Swbhx3hs;

    public oHwsq5s6lj9C1(long j, long j2, Set set) {
        this.dDIMxZXP1V8HdM = j;
        this.w9sT1Swbhx3hs = j2;
        this.vekpFI4d1Nc4fakF = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oHwsq5s6lj9C1) {
            oHwsq5s6lj9C1 ohwsq5s6lj9c1 = (oHwsq5s6lj9C1) obj;
            if (this.dDIMxZXP1V8HdM == ohwsq5s6lj9c1.dDIMxZXP1V8HdM && this.w9sT1Swbhx3hs == ohwsq5s6lj9c1.w9sT1Swbhx3hs && this.vekpFI4d1Nc4fakF.equals(ohwsq5s6lj9c1.vekpFI4d1Nc4fakF)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.dDIMxZXP1V8HdM;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.w9sT1Swbhx3hs;
        return ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.vekpFI4d1Nc4fakF.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.dDIMxZXP1V8HdM + ", maxAllowedDelay=" + this.w9sT1Swbhx3hs + ", flags=" + this.vekpFI4d1Nc4fakF + "}";
    }
}
