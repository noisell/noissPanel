package v.s;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class WfDiJ9fpTiab implements Comparable {
    public static final WfDiJ9fpTiab vekpFI4d1Nc4fakF = new WfDiJ9fpTiab();
    public final int w9sT1Swbhx3hs;

    public WfDiJ9fpTiab() {
        if (!new VUjeMiNYIJhgmVJopga(0, 255, 1).w9sT1Swbhx3hs(1) || !new VUjeMiNYIJhgmVJopga(0, 255, 1).w9sT1Swbhx3hs(9) || !new VUjeMiNYIJhgmVJopga(0, 255, 1).w9sT1Swbhx3hs(10)) {
            throw new IllegalArgumentException("Version components are out of range: 1.9.10".toString());
        }
        this.w9sT1Swbhx3hs = 67850;
    }

    private static /* synthetic */ void efcngkocl() {
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.w9sT1Swbhx3hs - ((WfDiJ9fpTiab) obj).w9sT1Swbhx3hs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        WfDiJ9fpTiab wfDiJ9fpTiab = obj instanceof WfDiJ9fpTiab ? (WfDiJ9fpTiab) obj : null;
        return wfDiJ9fpTiab != null && this.w9sT1Swbhx3hs == wfDiJ9fpTiab.w9sT1Swbhx3hs;
    }

    public final int hashCode() {
        return this.w9sT1Swbhx3hs;
    }

    public final String toString() {
        return "1.9.10";
    }
}
