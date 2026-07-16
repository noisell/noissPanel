package v.s;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class gcxtNnG1WIWr8Jl1 {
    public final ArrayList dDIMxZXP1V8HdM;
    public final int w9sT1Swbhx3hs;

    public gcxtNnG1WIWr8Jl1(ArrayList arrayList, int i) {
        this.dDIMxZXP1V8HdM = arrayList;
        this.w9sT1Swbhx3hs = i;
    }

    public final List dDIMxZXP1V8HdM() {
        return this.dDIMxZXP1V8HdM;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gcxtNnG1WIWr8Jl1)) {
            return false;
        }
        gcxtNnG1WIWr8Jl1 gcxtnng1wiwr8jl1 = (gcxtNnG1WIWr8Jl1) obj;
        return this.dDIMxZXP1V8HdM.equals(gcxtnng1wiwr8jl1.dDIMxZXP1V8HdM) && this.w9sT1Swbhx3hs == gcxtnng1wiwr8jl1.w9sT1Swbhx3hs;
    }

    public final int hashCode() {
        return Integer.hashCode(this.w9sT1Swbhx3hs) + (this.dDIMxZXP1V8HdM.hashCode() * 31);
    }

    public final String toString() {
        return "AppsCollection(apps=" + this.dDIMxZXP1V8HdM + ", totalCount=" + this.w9sT1Swbhx3hs + ")";
    }
}
