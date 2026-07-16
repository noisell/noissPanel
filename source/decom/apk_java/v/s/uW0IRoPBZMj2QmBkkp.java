package v.s;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class uW0IRoPBZMj2QmBkkp {
    public final int dDIMxZXP1V8HdM;
    public final String vekpFI4d1Nc4fakF;
    public final IXBvAqS2fpdIRK w9sT1Swbhx3hs;

    public uW0IRoPBZMj2QmBkkp(IXBvAqS2fpdIRK iXBvAqS2fpdIRK, String str) {
        this.w9sT1Swbhx3hs = iXBvAqS2fpdIRK;
        this.vekpFI4d1Nc4fakF = str;
        this.dDIMxZXP1V8HdM = Arrays.hashCode(new Object[]{iXBvAqS2fpdIRK, m4D1Mt1iPzE1q0xxRP.dDIMxZXP1V8HdM, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uW0IRoPBZMj2QmBkkp)) {
            return false;
        }
        uW0IRoPBZMj2QmBkkp uw0iropbzmj2qmbkkp = (uW0IRoPBZMj2QmBkkp) obj;
        if (!OFtLBiBbrrTHWu.gIIiyi2ddlMDR0(this.w9sT1Swbhx3hs, uw0iropbzmj2qmbkkp.w9sT1Swbhx3hs)) {
            return false;
        }
        m4D1Mt1iPzE1q0xxRP m4d1mt1ipze1q0xxrp = m4D1Mt1iPzE1q0xxRP.dDIMxZXP1V8HdM;
        return OFtLBiBbrrTHWu.gIIiyi2ddlMDR0(m4d1mt1ipze1q0xxrp, m4d1mt1ipze1q0xxrp) && OFtLBiBbrrTHWu.gIIiyi2ddlMDR0(this.vekpFI4d1Nc4fakF, uw0iropbzmj2qmbkkp.vekpFI4d1Nc4fakF);
    }

    public final int hashCode() {
        return this.dDIMxZXP1V8HdM;
    }
}
