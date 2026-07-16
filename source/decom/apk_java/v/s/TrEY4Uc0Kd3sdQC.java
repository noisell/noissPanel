package v.s;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class TrEY4Uc0Kd3sdQC {
    public final List JXn4Qf7zpnLjP5;
    public final String dDIMxZXP1V8HdM;
    public final List vekpFI4d1Nc4fakF;
    public final boolean w9sT1Swbhx3hs;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public TrEY4Uc0Kd3sdQC(String str, boolean z, List list, List list2) {
        this.dDIMxZXP1V8HdM = str;
        this.w9sT1Swbhx3hs = z;
        this.vekpFI4d1Nc4fakF = list;
        this.JXn4Qf7zpnLjP5 = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                list2.add("ASC");
            }
        }
        this.JXn4Qf7zpnLjP5 = list2;
    }

    private static /* synthetic */ void pidtwukq() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrEY4Uc0Kd3sdQC)) {
            return false;
        }
        TrEY4Uc0Kd3sdQC trEY4Uc0Kd3sdQC = (TrEY4Uc0Kd3sdQC) obj;
        String str = trEY4Uc0Kd3sdQC.dDIMxZXP1V8HdM;
        if (this.w9sT1Swbhx3hs != trEY4Uc0Kd3sdQC.w9sT1Swbhx3hs || !okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.vekpFI4d1Nc4fakF, trEY4Uc0Kd3sdQC.vekpFI4d1Nc4fakF) || !okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.JXn4Qf7zpnLjP5, trEY4Uc0Kd3sdQC.JXn4Qf7zpnLjP5)) {
            return false;
        }
        String str2 = this.dDIMxZXP1V8HdM;
        return str2.startsWith("index_") ? str.startsWith("index_") : str2.equals(str);
    }

    public final int hashCode() {
        String str = this.dDIMxZXP1V8HdM;
        return this.JXn4Qf7zpnLjP5.hashCode() + ((this.vekpFI4d1Nc4fakF.hashCode() + ((((str.startsWith("index_") ? -1184239155 : str.hashCode()) * 31) + (this.w9sT1Swbhx3hs ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "Index{name='" + this.dDIMxZXP1V8HdM + "', unique=" + this.w9sT1Swbhx3hs + ", columns=" + this.vekpFI4d1Nc4fakF + ", orders=" + this.JXn4Qf7zpnLjP5 + "'}";
    }
}
