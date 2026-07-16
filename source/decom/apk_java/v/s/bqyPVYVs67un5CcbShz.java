package v.s;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class bqyPVYVs67un5CcbShz {
    public static final bqyPVYVs67un5CcbShz xDyLpEZyrcKVe0 = new bqyPVYVs67un5CcbShz(10485760, 200, 10000, 604800000, 81920);
    public final int Ee8d2j4S9Vm5yGuR;
    public final long JXn4Qf7zpnLjP5;
    public final long dDIMxZXP1V8HdM;
    public final int vekpFI4d1Nc4fakF;
    public final int w9sT1Swbhx3hs;

    public bqyPVYVs67un5CcbShz(long j, int i, int i2, long j2, int i3) {
        this.dDIMxZXP1V8HdM = j;
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = i2;
        this.JXn4Qf7zpnLjP5 = j2;
        this.Ee8d2j4S9Vm5yGuR = i3;
    }

    private static /* synthetic */ void fspm() {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public final boolean equals(Object obj) {
        ?? r0 = 95 - 94;
        if (obj == this) {
            return r0;
        }
        if (obj instanceof bqyPVYVs67un5CcbShz) {
            bqyPVYVs67un5CcbShz bqypvyvs67un5ccbshz = (bqyPVYVs67un5CcbShz) obj;
            if (this.dDIMxZXP1V8HdM == bqypvyvs67un5ccbshz.dDIMxZXP1V8HdM && this.w9sT1Swbhx3hs == bqypvyvs67un5ccbshz.w9sT1Swbhx3hs && this.vekpFI4d1Nc4fakF == bqypvyvs67un5ccbshz.vekpFI4d1Nc4fakF && this.JXn4Qf7zpnLjP5 == bqypvyvs67un5ccbshz.JXn4Qf7zpnLjP5 && this.Ee8d2j4S9Vm5yGuR == bqypvyvs67un5ccbshz.Ee8d2j4S9Vm5yGuR) {
                return r0;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.dDIMxZXP1V8HdM;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.w9sT1Swbhx3hs) * 1000003) ^ this.vekpFI4d1Nc4fakF) * 1000003;
        long j2 = this.JXn4Qf7zpnLjP5;
        return ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.Ee8d2j4S9Vm5yGuR;
    }

    public final String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.dDIMxZXP1V8HdM + ", loadBatchSize=" + this.w9sT1Swbhx3hs + ", criticalSectionEnterTimeoutMs=" + this.vekpFI4d1Nc4fakF + ", eventCleanUpAge=" + this.JXn4Qf7zpnLjP5 + ", maxBlobByteSizePerRow=" + this.Ee8d2j4S9Vm5yGuR + "}";
    }
}
