package v.s;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class XtLOeRoTc17KDsIUy extends rIdlHTr6qdca implements Iterator {
    public final /* synthetic */ oxDJvY4rcWCrlE JXn4Qf7zpnLjP5;
    public boolean vekpFI4d1Nc4fakF = true;
    public S4NwUM5fV12C6gDO w9sT1Swbhx3hs;

    public XtLOeRoTc17KDsIUy(oxDJvY4rcWCrlE oxdjvy4rcwcrle) {
        this.JXn4Qf7zpnLjP5 = oxdjvy4rcwcrle;
    }

    @Override // v.s.rIdlHTr6qdca
    public final void dDIMxZXP1V8HdM(S4NwUM5fV12C6gDO s4NwUM5fV12C6gDO) {
        S4NwUM5fV12C6gDO s4NwUM5fV12C6gDO2 = this.w9sT1Swbhx3hs;
        if (s4NwUM5fV12C6gDO == s4NwUM5fV12C6gDO2) {
            S4NwUM5fV12C6gDO s4NwUM5fV12C6gDO3 = s4NwUM5fV12C6gDO2.Ee8d2j4S9Vm5yGuR;
            this.w9sT1Swbhx3hs = s4NwUM5fV12C6gDO3;
            this.vekpFI4d1Nc4fakF = s4NwUM5fV12C6gDO3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.vekpFI4d1Nc4fakF) {
            return this.JXn4Qf7zpnLjP5.w9sT1Swbhx3hs != null;
        }
        S4NwUM5fV12C6gDO s4NwUM5fV12C6gDO = this.w9sT1Swbhx3hs;
        return (s4NwUM5fV12C6gDO == null || s4NwUM5fV12C6gDO.JXn4Qf7zpnLjP5 == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.vekpFI4d1Nc4fakF) {
            this.vekpFI4d1Nc4fakF = false;
            this.w9sT1Swbhx3hs = this.JXn4Qf7zpnLjP5.w9sT1Swbhx3hs;
        } else {
            S4NwUM5fV12C6gDO s4NwUM5fV12C6gDO = this.w9sT1Swbhx3hs;
            this.w9sT1Swbhx3hs = s4NwUM5fV12C6gDO != null ? s4NwUM5fV12C6gDO.JXn4Qf7zpnLjP5 : null;
        }
        return this.w9sT1Swbhx3hs;
    }
}
