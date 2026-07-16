package v.s;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class VUjeMiNYIJhgmVJopga extends dPxH1qsKC2Lxf7PHXDZT {
    public static final VUjeMiNYIJhgmVJopga Ee8d2j4S9Vm5yGuR = new VUjeMiNYIJhgmVJopga(1, 0, 1);

    @Override // v.s.dPxH1qsKC2Lxf7PHXDZT
    public final boolean equals(Object obj) {
        if (!(obj instanceof VUjeMiNYIJhgmVJopga)) {
            return false;
        }
        if (isEmpty() && ((VUjeMiNYIJhgmVJopga) obj).isEmpty()) {
            return true;
        }
        VUjeMiNYIJhgmVJopga vUjeMiNYIJhgmVJopga = (VUjeMiNYIJhgmVJopga) obj;
        return this.w9sT1Swbhx3hs == vUjeMiNYIJhgmVJopga.w9sT1Swbhx3hs && this.vekpFI4d1Nc4fakF == vUjeMiNYIJhgmVJopga.vekpFI4d1Nc4fakF;
    }

    @Override // v.s.dPxH1qsKC2Lxf7PHXDZT
    public final int hashCode() {
        return isEmpty() ? (-52) + 51 : (this.w9sT1Swbhx3hs * 31) + this.vekpFI4d1Nc4fakF;
    }

    @Override // v.s.dPxH1qsKC2Lxf7PHXDZT
    public final boolean isEmpty() {
        return this.w9sT1Swbhx3hs > this.vekpFI4d1Nc4fakF;
    }

    @Override // v.s.dPxH1qsKC2Lxf7PHXDZT
    public final String toString() {
        return this.w9sT1Swbhx3hs + ".." + this.vekpFI4d1Nc4fakF;
    }

    public final boolean w9sT1Swbhx3hs(int i) {
        return this.w9sT1Swbhx3hs <= i && i <= this.vekpFI4d1Nc4fakF;
    }
}
