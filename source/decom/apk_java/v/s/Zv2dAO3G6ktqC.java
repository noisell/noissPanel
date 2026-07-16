package v.s;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class Zv2dAO3G6ktqC {
    public final String dDIMxZXP1V8HdM;
    public final ArrayList w9sT1Swbhx3hs;

    public Zv2dAO3G6ktqC(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.dDIMxZXP1V8HdM = str;
        this.w9sT1Swbhx3hs = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Zv2dAO3G6ktqC)) {
            return false;
        }
        Zv2dAO3G6ktqC zv2dAO3G6ktqC = (Zv2dAO3G6ktqC) obj;
        return this.dDIMxZXP1V8HdM.equals(zv2dAO3G6ktqC.dDIMxZXP1V8HdM) && this.w9sT1Swbhx3hs.equals(zv2dAO3G6ktqC.w9sT1Swbhx3hs);
    }

    public final int hashCode() {
        return ((this.dDIMxZXP1V8HdM.hashCode() ^ 1000003) * 1000003) ^ this.w9sT1Swbhx3hs.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.dDIMxZXP1V8HdM + ", usedDates=" + this.w9sT1Swbhx3hs + "}";
    }
}
