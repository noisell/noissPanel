package v.s;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class RdWywP7AQUqPn0G {
    public static final RdWywP7AQUqPn0G pyu8ovAipBTLYAiKab = new RdWywP7AQUqPn0G(1, false, false, false, false, -1, -1, wSoqO88HRpr5B2md.w9sT1Swbhx3hs);
    public final boolean Ee8d2j4S9Vm5yGuR;
    public final boolean JXn4Qf7zpnLjP5;
    public final Set b1EoSIRjJHO5;
    public final int dDIMxZXP1V8HdM;
    public final long ibVTtJUNfrGYbW;
    public final boolean vekpFI4d1Nc4fakF;
    public final boolean w9sT1Swbhx3hs;
    public final long xDyLpEZyrcKVe0;

    public RdWywP7AQUqPn0G(int i, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, Set set) {
        this.dDIMxZXP1V8HdM = i;
        this.w9sT1Swbhx3hs = z;
        this.vekpFI4d1Nc4fakF = z2;
        this.JXn4Qf7zpnLjP5 = z3;
        this.Ee8d2j4S9Vm5yGuR = z4;
        this.xDyLpEZyrcKVe0 = j;
        this.ibVTtJUNfrGYbW = j2;
        this.b1EoSIRjJHO5 = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !RdWywP7AQUqPn0G.class.equals(obj.getClass())) {
            return false;
        }
        RdWywP7AQUqPn0G rdWywP7AQUqPn0G = (RdWywP7AQUqPn0G) obj;
        if (this.w9sT1Swbhx3hs == rdWywP7AQUqPn0G.w9sT1Swbhx3hs && this.vekpFI4d1Nc4fakF == rdWywP7AQUqPn0G.vekpFI4d1Nc4fakF && this.JXn4Qf7zpnLjP5 == rdWywP7AQUqPn0G.JXn4Qf7zpnLjP5 && this.Ee8d2j4S9Vm5yGuR == rdWywP7AQUqPn0G.Ee8d2j4S9Vm5yGuR && this.xDyLpEZyrcKVe0 == rdWywP7AQUqPn0G.xDyLpEZyrcKVe0 && this.ibVTtJUNfrGYbW == rdWywP7AQUqPn0G.ibVTtJUNfrGYbW && this.dDIMxZXP1V8HdM == rdWywP7AQUqPn0G.dDIMxZXP1V8HdM) {
            return okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.b1EoSIRjJHO5, rdWywP7AQUqPn0G.b1EoSIRjJHO5);
        }
        return false;
    }

    public final int hashCode() {
        int iJ0zjQ7CAgohuxU20eCW6 = ((((((((Y9mRyRdkl5FOcwb66V6.J0zjQ7CAgohuxU20eCW6(this.dDIMxZXP1V8HdM) * 31) + (this.w9sT1Swbhx3hs ? 1 : 0)) * 31) + (this.vekpFI4d1Nc4fakF ? 1 : 0)) * 31) + (this.JXn4Qf7zpnLjP5 ? 1 : 0)) * 31) + (this.Ee8d2j4S9Vm5yGuR ? 1 : 0)) * 31;
        long j = this.xDyLpEZyrcKVe0;
        int i = (iJ0zjQ7CAgohuxU20eCW6 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.ibVTtJUNfrGYbW;
        return this.b1EoSIRjJHO5.hashCode() + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + Y9mRyRdkl5FOcwb66V6.MLSIo1htfMPWeB8V876L(this.dDIMxZXP1V8HdM) + ", requiresCharging=" + this.w9sT1Swbhx3hs + ", requiresDeviceIdle=" + this.vekpFI4d1Nc4fakF + ", requiresBatteryNotLow=" + this.JXn4Qf7zpnLjP5 + ", requiresStorageNotLow=" + this.Ee8d2j4S9Vm5yGuR + ", contentTriggerUpdateDelayMillis=" + this.xDyLpEZyrcKVe0 + ", contentTriggerMaxDelayMillis=" + this.ibVTtJUNfrGYbW + ", contentUriTriggers=" + this.b1EoSIRjJHO5 + ", }";
    }

    public RdWywP7AQUqPn0G(RdWywP7AQUqPn0G rdWywP7AQUqPn0G) {
        this.w9sT1Swbhx3hs = rdWywP7AQUqPn0G.w9sT1Swbhx3hs;
        this.vekpFI4d1Nc4fakF = rdWywP7AQUqPn0G.vekpFI4d1Nc4fakF;
        this.dDIMxZXP1V8HdM = rdWywP7AQUqPn0G.dDIMxZXP1V8HdM;
        this.JXn4Qf7zpnLjP5 = rdWywP7AQUqPn0G.JXn4Qf7zpnLjP5;
        this.Ee8d2j4S9Vm5yGuR = rdWywP7AQUqPn0G.Ee8d2j4S9Vm5yGuR;
        this.b1EoSIRjJHO5 = rdWywP7AQUqPn0G.b1EoSIRjJHO5;
        this.xDyLpEZyrcKVe0 = rdWywP7AQUqPn0G.xDyLpEZyrcKVe0;
        this.ibVTtJUNfrGYbW = rdWywP7AQUqPn0G.ibVTtJUNfrGYbW;
    }
}
