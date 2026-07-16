package v.s;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class l5I5SpXbt39FIPGMZQ extends wnAUdPpYfSNv9 {
    public final String Ee8d2j4S9Vm5yGuR;
    public final byte[] JXn4Qf7zpnLjP5;
    public final long dDIMxZXP1V8HdM;
    public final sSCRnSATURRg6i ibVTtJUNfrGYbW;
    public final long vekpFI4d1Nc4fakF;
    public final Integer w9sT1Swbhx3hs;
    public final long xDyLpEZyrcKVe0;

    public l5I5SpXbt39FIPGMZQ(long j, Integer num, long j2, byte[] bArr, String str, long j3, sSCRnSATURRg6i sscrnsaturrg6i) {
        this.dDIMxZXP1V8HdM = j;
        this.w9sT1Swbhx3hs = num;
        this.vekpFI4d1Nc4fakF = j2;
        this.JXn4Qf7zpnLjP5 = bArr;
        this.Ee8d2j4S9Vm5yGuR = str;
        this.xDyLpEZyrcKVe0 = j3;
        this.ibVTtJUNfrGYbW = sscrnsaturrg6i;
    }

    public final boolean equals(Object obj) {
        Integer num;
        String str;
        sSCRnSATURRg6i sscrnsaturrg6i;
        if (obj == this) {
            return true;
        }
        if (obj instanceof wnAUdPpYfSNv9) {
            wnAUdPpYfSNv9 wnaudppyfsnv9 = (wnAUdPpYfSNv9) obj;
            l5I5SpXbt39FIPGMZQ l5i5spxbt39fipgmzq = (l5I5SpXbt39FIPGMZQ) wnaudppyfsnv9;
            sSCRnSATURRg6i sscrnsaturrg6i2 = l5i5spxbt39fipgmzq.ibVTtJUNfrGYbW;
            String str2 = l5i5spxbt39fipgmzq.Ee8d2j4S9Vm5yGuR;
            Integer num2 = l5i5spxbt39fipgmzq.w9sT1Swbhx3hs;
            if (this.dDIMxZXP1V8HdM == l5i5spxbt39fipgmzq.dDIMxZXP1V8HdM && ((num = this.w9sT1Swbhx3hs) != null ? num.equals(num2) : num2 == null) && this.vekpFI4d1Nc4fakF == l5i5spxbt39fipgmzq.vekpFI4d1Nc4fakF) {
                if (Arrays.equals(this.JXn4Qf7zpnLjP5, wnaudppyfsnv9 instanceof l5I5SpXbt39FIPGMZQ ? ((l5I5SpXbt39FIPGMZQ) wnaudppyfsnv9).JXn4Qf7zpnLjP5 : l5i5spxbt39fipgmzq.JXn4Qf7zpnLjP5) && ((str = this.Ee8d2j4S9Vm5yGuR) != null ? str.equals(str2) : str2 == null) && this.xDyLpEZyrcKVe0 == l5i5spxbt39fipgmzq.xDyLpEZyrcKVe0 && ((sscrnsaturrg6i = this.ibVTtJUNfrGYbW) != null ? sscrnsaturrg6i.equals(sscrnsaturrg6i2) : sscrnsaturrg6i2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.dDIMxZXP1V8HdM;
        int i = (-59) + 91;
        int i2 = (((int) (j ^ (j >>> i))) ^ 1000003) * 1000003;
        Integer num = this.w9sT1Swbhx3hs;
        int iHashCode = (i2 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j2 = this.vekpFI4d1Nc4fakF;
        int iHashCode2 = (((iHashCode ^ ((int) (j2 ^ (j2 >>> i)))) * 1000003) ^ Arrays.hashCode(this.JXn4Qf7zpnLjP5)) * 1000003;
        String str = this.Ee8d2j4S9Vm5yGuR;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.xDyLpEZyrcKVe0;
        int i3 = (iHashCode3 ^ ((int) (j3 ^ (j3 >>> i)))) * 1000003;
        sSCRnSATURRg6i sscrnsaturrg6i = this.ibVTtJUNfrGYbW;
        return i3 ^ (sscrnsaturrg6i != null ? sscrnsaturrg6i.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.dDIMxZXP1V8HdM + ", eventCode=" + this.w9sT1Swbhx3hs + ", eventUptimeMs=" + this.vekpFI4d1Nc4fakF + ", sourceExtension=" + Arrays.toString(this.JXn4Qf7zpnLjP5) + ", sourceExtensionJsonProto3=" + this.Ee8d2j4S9Vm5yGuR + ", timezoneOffsetSeconds=" + this.xDyLpEZyrcKVe0 + ", networkConnectionInfo=" + this.ibVTtJUNfrGYbW + "}";
    }
}
