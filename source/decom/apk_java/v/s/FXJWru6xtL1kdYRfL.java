package v.s;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class FXJWru6xtL1kdYRfL extends REagpsGy8qcv0hG08 {
    public final /* synthetic */ kZrG9UUAjHVzkL6Wn Ee8d2j4S9Vm5yGuR;
    public final /* synthetic */ LPqJFMbrw2n1o JXn4Qf7zpnLjP5;
    public HaMJHE2hWj1dbNj vekpFI4d1Nc4fakF;
    public final kQNfMPvAFgenoBAn w9sT1Swbhx3hs;

    public FXJWru6xtL1kdYRfL(kQNfMPvAFgenoBAn kqnfmpvafgenoban, LPqJFMbrw2n1o lPqJFMbrw2n1o, kZrG9UUAjHVzkL6Wn kzrg9uuajhvzkl6wn) {
        this.JXn4Qf7zpnLjP5 = lPqJFMbrw2n1o;
        this.Ee8d2j4S9Vm5yGuR = kzrg9uuajhvzkl6wn;
        this.w9sT1Swbhx3hs = kqnfmpvafgenoban;
    }

    @Override // v.s.REagpsGy8qcv0hG08
    public final o0rN3ekjBJ6kKwok vekpFI4d1Nc4fakF(Object obj) {
        if (this.JXn4Qf7zpnLjP5.xfn2GJwmGqs7kWW() == this.Ee8d2j4S9Vm5yGuR) {
            return null;
        }
        return SbxdZ6Kq2uhHQ5RPRqm.w9sT1Swbhx3hs;
    }

    @Override // v.s.REagpsGy8qcv0hG08
    public final void w9sT1Swbhx3hs(Object obj, Object obj2) {
        qgQwIhtTRQZkWPNc qgqwihttrqzkwpnc = (qgQwIhtTRQZkWPNc) obj;
        boolean z = obj2 == null;
        qgQwIhtTRQZkWPNc qgqwihttrqzkwpnc2 = this.w9sT1Swbhx3hs;
        qgQwIhtTRQZkWPNc qgqwihttrqzkwpnc3 = z ? qgqwihttrqzkwpnc2 : this.vekpFI4d1Nc4fakF;
        if (qgqwihttrqzkwpnc3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = qgQwIhtTRQZkWPNc.w9sT1Swbhx3hs;
            while (!atomicReferenceFieldUpdater.compareAndSet(qgqwihttrqzkwpnc, this, qgqwihttrqzkwpnc3)) {
                if (atomicReferenceFieldUpdater.get(qgqwihttrqzkwpnc) != this) {
                    return;
                }
            }
            if (z) {
                qgqwihttrqzkwpnc2.D5P1xCAyuvgF(this.vekpFI4d1Nc4fakF);
            }
        }
    }
}
