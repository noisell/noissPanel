package v.s;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class MwZjcr6Jo2nms extends sSCRnSATURRg6i {
    public final M2aRKtFjAXgZr79ytAww dDIMxZXP1V8HdM;
    public final yp2NLvJDeqG6m3p5OdOY w9sT1Swbhx3hs;

    public MwZjcr6Jo2nms(M2aRKtFjAXgZr79ytAww m2aRKtFjAXgZr79ytAww, yp2NLvJDeqG6m3p5OdOY yp2nlvjdeqg6m3p5odoy) {
        this.dDIMxZXP1V8HdM = m2aRKtFjAXgZr79ytAww;
        this.w9sT1Swbhx3hs = yp2nlvjdeqg6m3p5odoy;
    }

    private static /* synthetic */ void carhtjy() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sSCRnSATURRg6i) {
            sSCRnSATURRg6i sscrnsaturrg6i = (sSCRnSATURRg6i) obj;
            M2aRKtFjAXgZr79ytAww m2aRKtFjAXgZr79ytAww = this.dDIMxZXP1V8HdM;
            if (m2aRKtFjAXgZr79ytAww != null ? m2aRKtFjAXgZr79ytAww.equals(((MwZjcr6Jo2nms) sscrnsaturrg6i).dDIMxZXP1V8HdM) : ((MwZjcr6Jo2nms) sscrnsaturrg6i).dDIMxZXP1V8HdM == null) {
                yp2NLvJDeqG6m3p5OdOY yp2nlvjdeqg6m3p5odoy = this.w9sT1Swbhx3hs;
                if (yp2nlvjdeqg6m3p5odoy != null ? yp2nlvjdeqg6m3p5odoy.equals(((MwZjcr6Jo2nms) sscrnsaturrg6i).w9sT1Swbhx3hs) : ((MwZjcr6Jo2nms) sscrnsaturrg6i).w9sT1Swbhx3hs == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        M2aRKtFjAXgZr79ytAww m2aRKtFjAXgZr79ytAww = this.dDIMxZXP1V8HdM;
        int iHashCode = ((m2aRKtFjAXgZr79ytAww == null ? 0 : m2aRKtFjAXgZr79ytAww.hashCode()) ^ 1000003) * 1000003;
        yp2NLvJDeqG6m3p5OdOY yp2nlvjdeqg6m3p5odoy = this.w9sT1Swbhx3hs;
        return (yp2nlvjdeqg6m3p5odoy != null ? yp2nlvjdeqg6m3p5odoy.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.dDIMxZXP1V8HdM + ", mobileSubtype=" + this.w9sT1Swbhx3hs + "}";
    }
}
