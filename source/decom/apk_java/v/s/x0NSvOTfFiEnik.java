package v.s;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class x0NSvOTfFiEnik {
    public final String dDIMxZXP1V8HdM;
    public final int vekpFI4d1Nc4fakF;
    public final int w9sT1Swbhx3hs;

    public x0NSvOTfFiEnik(String str, int i, int i2) {
        this.dDIMxZXP1V8HdM = str;
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0NSvOTfFiEnik)) {
            return false;
        }
        x0NSvOTfFiEnik x0nsvotffienik = (x0NSvOTfFiEnik) obj;
        return okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.dDIMxZXP1V8HdM, x0nsvotffienik.dDIMxZXP1V8HdM) && this.w9sT1Swbhx3hs == x0nsvotffienik.w9sT1Swbhx3hs && this.vekpFI4d1Nc4fakF == x0nsvotffienik.vekpFI4d1Nc4fakF;
    }

    public final int hashCode() {
        return Integer.hashCode(this.vekpFI4d1Nc4fakF) + ((Integer.hashCode(this.w9sT1Swbhx3hs) + (this.dDIMxZXP1V8HdM.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SystemIdInfo(workSpecId=" + this.dDIMxZXP1V8HdM + ", generation=" + this.w9sT1Swbhx3hs + ", systemId=" + this.vekpFI4d1Nc4fakF + ')';
    }
}
