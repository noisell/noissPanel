package v.s;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class hsuD9tQdOSW5 {
    public final long dDIMxZXP1V8HdM;
    public final long vekpFI4d1Nc4fakF;
    public final long w9sT1Swbhx3hs;

    public hsuD9tQdOSW5(long j, long j2, long j3) {
        this.dDIMxZXP1V8HdM = j;
        this.w9sT1Swbhx3hs = j2;
        this.vekpFI4d1Nc4fakF = j3;
    }

    private static /* synthetic */ void pnknoww() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hsuD9tQdOSW5) {
            hsuD9tQdOSW5 hsud9tqdosw5 = (hsuD9tQdOSW5) obj;
            if (this.dDIMxZXP1V8HdM == hsud9tqdosw5.dDIMxZXP1V8HdM && this.w9sT1Swbhx3hs == hsud9tqdosw5.w9sT1Swbhx3hs && this.vekpFI4d1Nc4fakF == hsud9tqdosw5.vekpFI4d1Nc4fakF) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.dDIMxZXP1V8HdM;
        long j2 = this.w9sT1Swbhx3hs;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.vekpFI4d1Nc4fakF;
        return i ^ ((int) ((j3 >>> 32) ^ j3));
    }

    public final String toString() {
        return "StartupTime{epochMillis=" + this.dDIMxZXP1V8HdM + ", elapsedRealtime=" + this.w9sT1Swbhx3hs + ", uptimeMillis=" + this.vekpFI4d1Nc4fakF + "}";
    }
}
