package v.s;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class tDlqCGNnTg3Ni implements Comparable {
    public final String Ee8d2j4S9Vm5yGuR;
    public final String JXn4Qf7zpnLjP5;
    public final int vekpFI4d1Nc4fakF;
    public final int w9sT1Swbhx3hs;

    public tDlqCGNnTg3Ni(int i, int i2, String str, String str2) {
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = i2;
        this.JXn4Qf7zpnLjP5 = str;
        this.Ee8d2j4S9Vm5yGuR = str2;
    }

    private static /* synthetic */ void emvsf() {
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        tDlqCGNnTg3Ni tdlqcgnntg3ni = (tDlqCGNnTg3Ni) obj;
        int i = this.w9sT1Swbhx3hs - tdlqcgnntg3ni.w9sT1Swbhx3hs;
        return i == 0 ? this.vekpFI4d1Nc4fakF - tdlqcgnntg3ni.vekpFI4d1Nc4fakF : i;
    }
}
