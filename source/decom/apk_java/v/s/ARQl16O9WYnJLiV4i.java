package v.s;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class ARQl16O9WYnJLiV4i {
    public final String dDIMxZXP1V8HdM;
    public final long vekpFI4d1Nc4fakF;
    public final long w9sT1Swbhx3hs;

    public ARQl16O9WYnJLiV4i(String str, long j, long j2) {
        this.dDIMxZXP1V8HdM = str;
        this.w9sT1Swbhx3hs = j;
        this.vekpFI4d1Nc4fakF = j2;
    }

    private static /* synthetic */ void ghedsvbmw() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ARQl16O9WYnJLiV4i) {
            ARQl16O9WYnJLiV4i aRQl16O9WYnJLiV4i = (ARQl16O9WYnJLiV4i) obj;
            if (this.dDIMxZXP1V8HdM.equals(aRQl16O9WYnJLiV4i.dDIMxZXP1V8HdM) && this.w9sT1Swbhx3hs == aRQl16O9WYnJLiV4i.w9sT1Swbhx3hs && this.vekpFI4d1Nc4fakF == aRQl16O9WYnJLiV4i.vekpFI4d1Nc4fakF) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.dDIMxZXP1V8HdM.hashCode() ^ 1000003) * 1000003;
        long j = this.w9sT1Swbhx3hs;
        long j2 = this.vekpFI4d1Nc4fakF;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "InstallationTokenResult{token=" + this.dDIMxZXP1V8HdM + ", tokenExpirationTimestamp=" + this.w9sT1Swbhx3hs + ", tokenCreationTimestamp=" + this.vekpFI4d1Nc4fakF + "}";
    }
}
