package v.s;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class GYJ3wxVSK6wC {
    public final bYZKmsM130y5GVhnn dDIMxZXP1V8HdM;
    public final HashMap w9sT1Swbhx3hs;

    public GYJ3wxVSK6wC(bYZKmsM130y5GVhnn byzkmsm130y5gvhnn, HashMap map) {
        this.dDIMxZXP1V8HdM = byzkmsm130y5gvhnn;
        this.w9sT1Swbhx3hs = map;
    }

    private static /* synthetic */ void vljl() {
    }

    public final long dDIMxZXP1V8HdM(LB7U1qakabytBm lB7U1qakabytBm, long j, int i) {
        long jJXn4Qf7zpnLjP5 = j - this.dDIMxZXP1V8HdM.JXn4Qf7zpnLjP5();
        oHwsq5s6lj9C1 ohwsq5s6lj9c1 = (oHwsq5s6lj9C1) this.w9sT1Swbhx3hs.get(lB7U1qakabytBm);
        long j2 = ohwsq5s6lj9c1.dDIMxZXP1V8HdM;
        int i2 = i - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i2) * j2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * ((long) i2)))), jJXn4Qf7zpnLjP5), ohwsq5s6lj9c1.w9sT1Swbhx3hs);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GYJ3wxVSK6wC)) {
            return false;
        }
        GYJ3wxVSK6wC gYJ3wxVSK6wC = (GYJ3wxVSK6wC) obj;
        return this.dDIMxZXP1V8HdM.equals(gYJ3wxVSK6wC.dDIMxZXP1V8HdM) && this.w9sT1Swbhx3hs.equals(gYJ3wxVSK6wC.w9sT1Swbhx3hs);
    }

    public final int hashCode() {
        return ((this.dDIMxZXP1V8HdM.hashCode() ^ 1000003) * 1000003) ^ this.w9sT1Swbhx3hs.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.dDIMxZXP1V8HdM + ", values=" + this.w9sT1Swbhx3hs + "}";
    }
}
