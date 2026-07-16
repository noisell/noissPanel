package v.s;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class yI1KTRoNlsjx implements Serializable {
    public final Object vekpFI4d1Nc4fakF;
    public final Object w9sT1Swbhx3hs;

    public yI1KTRoNlsjx(Object obj, Object obj2) {
        this.w9sT1Swbhx3hs = obj;
        this.vekpFI4d1Nc4fakF = obj2;
    }

    private static /* synthetic */ void jzrnpuo() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yI1KTRoNlsjx)) {
            return false;
        }
        yI1KTRoNlsjx yi1ktronlsjx = (yI1KTRoNlsjx) obj;
        return okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.w9sT1Swbhx3hs, yi1ktronlsjx.w9sT1Swbhx3hs) && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.vekpFI4d1Nc4fakF, yi1ktronlsjx.vekpFI4d1Nc4fakF);
    }

    public final int hashCode() {
        Object obj = this.w9sT1Swbhx3hs;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.vekpFI4d1Nc4fakF;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.w9sT1Swbhx3hs + ", " + this.vekpFI4d1Nc4fakF + ')';
    }
}
