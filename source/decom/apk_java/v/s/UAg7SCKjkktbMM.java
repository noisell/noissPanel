package v.s;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class UAg7SCKjkktbMM {
    public final long Ee8d2j4S9Vm5yGuR;
    public final long JXn4Qf7zpnLjP5;
    public final String dDIMxZXP1V8HdM;
    public final lIOSSTYOutyFnDV8Yx vekpFI4d1Nc4fakF;
    public final Integer w9sT1Swbhx3hs;
    public final Map xDyLpEZyrcKVe0;

    public UAg7SCKjkktbMM(String str, Integer num, lIOSSTYOutyFnDV8Yx liosstyoutyfndv8yx, long j, long j2, HashMap map) {
        this.dDIMxZXP1V8HdM = str;
        this.w9sT1Swbhx3hs = num;
        this.vekpFI4d1Nc4fakF = liosstyoutyfndv8yx;
        this.JXn4Qf7zpnLjP5 = j;
        this.Ee8d2j4S9Vm5yGuR = j2;
        this.xDyLpEZyrcKVe0 = map;
    }

    private static /* synthetic */ void lacmjsx() {
    }

    public final String dDIMxZXP1V8HdM(String str) {
        String str2 = (String) this.xDyLpEZyrcKVe0.get(str);
        return str2 == null ? "" : str2;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof UAg7SCKjkktbMM) {
            UAg7SCKjkktbMM uAg7SCKjkktbMM = (UAg7SCKjkktbMM) obj;
            Integer num2 = uAg7SCKjkktbMM.w9sT1Swbhx3hs;
            if (this.dDIMxZXP1V8HdM.equals(uAg7SCKjkktbMM.dDIMxZXP1V8HdM) && ((num = this.w9sT1Swbhx3hs) != null ? num.equals(num2) : num2 == null) && this.vekpFI4d1Nc4fakF.equals(uAg7SCKjkktbMM.vekpFI4d1Nc4fakF) && this.JXn4Qf7zpnLjP5 == uAg7SCKjkktbMM.JXn4Qf7zpnLjP5 && this.Ee8d2j4S9Vm5yGuR == uAg7SCKjkktbMM.Ee8d2j4S9Vm5yGuR && this.xDyLpEZyrcKVe0.equals(uAg7SCKjkktbMM.xDyLpEZyrcKVe0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.dDIMxZXP1V8HdM.hashCode() ^ 1000003) * 1000003;
        Integer num = this.w9sT1Swbhx3hs;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.vekpFI4d1Nc4fakF.hashCode()) * 1000003;
        long j = this.JXn4Qf7zpnLjP5;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.Ee8d2j4S9Vm5yGuR;
        return ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.xDyLpEZyrcKVe0.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.dDIMxZXP1V8HdM + ", code=" + this.w9sT1Swbhx3hs + ", encodedPayload=" + this.vekpFI4d1Nc4fakF + ", eventMillis=" + this.JXn4Qf7zpnLjP5 + ", uptimeMillis=" + this.Ee8d2j4S9Vm5yGuR + ", autoMetadata=" + this.xDyLpEZyrcKVe0 + "}";
    }

    public final xXexZC0ehrqHnWzLCz vekpFI4d1Nc4fakF() {
        xXexZC0ehrqHnWzLCz xxexzc0ehrqhnwzlcz = new xXexZC0ehrqHnWzLCz();
        String str = this.dDIMxZXP1V8HdM;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        xxexzc0ehrqhnwzlcz.dDIMxZXP1V8HdM = str;
        xxexzc0ehrqhnwzlcz.w9sT1Swbhx3hs = this.w9sT1Swbhx3hs;
        lIOSSTYOutyFnDV8Yx liosstyoutyfndv8yx = this.vekpFI4d1Nc4fakF;
        if (liosstyoutyfndv8yx == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        xxexzc0ehrqhnwzlcz.vekpFI4d1Nc4fakF = liosstyoutyfndv8yx;
        xxexzc0ehrqhnwzlcz.JXn4Qf7zpnLjP5 = Long.valueOf(this.JXn4Qf7zpnLjP5);
        xxexzc0ehrqhnwzlcz.Ee8d2j4S9Vm5yGuR = Long.valueOf(this.Ee8d2j4S9Vm5yGuR);
        xxexzc0ehrqhnwzlcz.xDyLpEZyrcKVe0 = new HashMap(this.xDyLpEZyrcKVe0);
        return xxexzc0ehrqhnwzlcz;
    }

    public final int w9sT1Swbhx3hs(String str) {
        String str2 = (String) this.xDyLpEZyrcKVe0.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }
}
