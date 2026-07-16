package v.s;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class VkQG3YKcRU3qaiFy6K1 {
    public final boolean JXn4Qf7zpnLjP5;
    public final boolean dDIMxZXP1V8HdM;
    public final boolean vekpFI4d1Nc4fakF;
    public final boolean w9sT1Swbhx3hs;

    public VkQG3YKcRU3qaiFy6K1(boolean z, boolean z2, boolean z3, boolean z4) {
        this.dDIMxZXP1V8HdM = z;
        this.w9sT1Swbhx3hs = z2;
        this.vekpFI4d1Nc4fakF = z3;
        this.JXn4Qf7zpnLjP5 = z4;
    }

    private static /* synthetic */ void lphj() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkQG3YKcRU3qaiFy6K1)) {
            return false;
        }
        VkQG3YKcRU3qaiFy6K1 vkQG3YKcRU3qaiFy6K1 = (VkQG3YKcRU3qaiFy6K1) obj;
        return this.dDIMxZXP1V8HdM == vkQG3YKcRU3qaiFy6K1.dDIMxZXP1V8HdM && this.w9sT1Swbhx3hs == vkQG3YKcRU3qaiFy6K1.w9sT1Swbhx3hs && this.vekpFI4d1Nc4fakF == vkQG3YKcRU3qaiFy6K1.vekpFI4d1Nc4fakF && this.JXn4Qf7zpnLjP5 == vkQG3YKcRU3qaiFy6K1.JXn4Qf7zpnLjP5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final int hashCode() {
        boolean z = this.dDIMxZXP1V8HdM;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = r1 * 31;
        boolean z2 = this.w9sT1Swbhx3hs;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.vekpFI4d1Nc4fakF;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int i3 = (i2 + r3) * 31;
        boolean z4 = this.JXn4Qf7zpnLjP5;
        return i3 + (z4 ? 1 : z4);
    }

    public final String toString() {
        return "NetworkState(isConnected=" + this.dDIMxZXP1V8HdM + ", isValidated=" + this.w9sT1Swbhx3hs + ", isMetered=" + this.vekpFI4d1Nc4fakF + ", isNotRoaming=" + this.JXn4Qf7zpnLjP5 + ')';
    }
}
