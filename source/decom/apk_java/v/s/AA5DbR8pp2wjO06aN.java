package v.s;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class AA5DbR8pp2wjO06aN extends qF9Q6Ob40fRrerpE {
    public final ArrayList dDIMxZXP1V8HdM;

    public AA5DbR8pp2wjO06aN(ArrayList arrayList) {
        this.dDIMxZXP1V8HdM = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qF9Q6Ob40fRrerpE)) {
            return false;
        }
        return this.dDIMxZXP1V8HdM.equals(((AA5DbR8pp2wjO06aN) ((qF9Q6Ob40fRrerpE) obj)).dDIMxZXP1V8HdM);
    }

    public final int hashCode() {
        return this.dDIMxZXP1V8HdM.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.dDIMxZXP1V8HdM + "}";
    }
}
