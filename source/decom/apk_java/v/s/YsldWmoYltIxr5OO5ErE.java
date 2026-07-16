package v.s;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class YsldWmoYltIxr5OO5ErE extends rIdlHTr6qdca implements Iterator {
    public final /* synthetic */ int JXn4Qf7zpnLjP5;
    public S4NwUM5fV12C6gDO vekpFI4d1Nc4fakF;
    public S4NwUM5fV12C6gDO w9sT1Swbhx3hs;

    public YsldWmoYltIxr5OO5ErE(S4NwUM5fV12C6gDO s4NwUM5fV12C6gDO, S4NwUM5fV12C6gDO s4NwUM5fV12C6gDO2, int i) {
        this.JXn4Qf7zpnLjP5 = i;
        this.w9sT1Swbhx3hs = s4NwUM5fV12C6gDO2;
        this.vekpFI4d1Nc4fakF = s4NwUM5fV12C6gDO;
    }

    @Override // v.s.rIdlHTr6qdca
    public final void dDIMxZXP1V8HdM(S4NwUM5fV12C6gDO s4NwUM5fV12C6gDO) {
        S4NwUM5fV12C6gDO s4NwUM5fV12C6gDO2;
        S4NwUM5fV12C6gDO s4NwUM5fV12C6gDOW9sT1Swbhx3hs = null;
        if (this.w9sT1Swbhx3hs == s4NwUM5fV12C6gDO && s4NwUM5fV12C6gDO == this.vekpFI4d1Nc4fakF) {
            this.vekpFI4d1Nc4fakF = null;
            this.w9sT1Swbhx3hs = null;
        }
        S4NwUM5fV12C6gDO s4NwUM5fV12C6gDO3 = this.w9sT1Swbhx3hs;
        if (s4NwUM5fV12C6gDO3 == s4NwUM5fV12C6gDO) {
            switch (this.JXn4Qf7zpnLjP5) {
                case 0:
                    s4NwUM5fV12C6gDO2 = s4NwUM5fV12C6gDO3.Ee8d2j4S9Vm5yGuR;
                    break;
                default:
                    s4NwUM5fV12C6gDO2 = s4NwUM5fV12C6gDO3.JXn4Qf7zpnLjP5;
                    break;
            }
            this.w9sT1Swbhx3hs = s4NwUM5fV12C6gDO2;
        }
        S4NwUM5fV12C6gDO s4NwUM5fV12C6gDO4 = this.vekpFI4d1Nc4fakF;
        if (s4NwUM5fV12C6gDO4 == s4NwUM5fV12C6gDO) {
            S4NwUM5fV12C6gDO s4NwUM5fV12C6gDO5 = this.w9sT1Swbhx3hs;
            if (s4NwUM5fV12C6gDO4 != s4NwUM5fV12C6gDO5 && s4NwUM5fV12C6gDO5 != null) {
                s4NwUM5fV12C6gDOW9sT1Swbhx3hs = w9sT1Swbhx3hs(s4NwUM5fV12C6gDO4);
            }
            this.vekpFI4d1Nc4fakF = s4NwUM5fV12C6gDOW9sT1Swbhx3hs;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.vekpFI4d1Nc4fakF != null) {
            return 55 - 54;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        S4NwUM5fV12C6gDO s4NwUM5fV12C6gDO = this.vekpFI4d1Nc4fakF;
        S4NwUM5fV12C6gDO s4NwUM5fV12C6gDO2 = this.w9sT1Swbhx3hs;
        this.vekpFI4d1Nc4fakF = (s4NwUM5fV12C6gDO == s4NwUM5fV12C6gDO2 || s4NwUM5fV12C6gDO2 == null) ? null : w9sT1Swbhx3hs(s4NwUM5fV12C6gDO);
        return s4NwUM5fV12C6gDO;
    }

    public final S4NwUM5fV12C6gDO w9sT1Swbhx3hs(S4NwUM5fV12C6gDO s4NwUM5fV12C6gDO) {
        switch (this.JXn4Qf7zpnLjP5) {
            case 0:
                return s4NwUM5fV12C6gDO.JXn4Qf7zpnLjP5;
            default:
                return s4NwUM5fV12C6gDO.Ee8d2j4S9Vm5yGuR;
        }
    }
}
