package v.s;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class kQNfMPvAFgenoBAn extends qgQwIhtTRQZkWPNc implements Xoey1fYV9aCBctS, kZrG9UUAjHVzkL6Wn, deLJ4Z0aL3hcJ3O1 {
    public LPqJFMbrw2n1o Ee8d2j4S9Vm5yGuR;

    @Override // v.s.kZrG9UUAjHVzkL6Wn
    public final boolean dDIMxZXP1V8HdM() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [char, int] */
    @Override // v.s.qgQwIhtTRQZkWPNc
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append((char) ((-14) + 78));
        sb.append(gA5gCwTK0qjTIn.pyu8ovAipBTLYAiKab(this));
        sb.append("[job@");
        LPqJFMbrw2n1o lPqJFMbrw2n1o = this.Ee8d2j4S9Vm5yGuR;
        if (lPqJFMbrw2n1o == null) {
            lPqJFMbrw2n1o = null;
        }
        sb.append(gA5gCwTK0qjTIn.pyu8ovAipBTLYAiKab(lPqJFMbrw2n1o));
        sb.append(']');
        return sb.toString();
    }

    @Override // v.s.Xoey1fYV9aCBctS
    public final void vekpFI4d1Nc4fakF() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        LPqJFMbrw2n1o lPqJFMbrw2n1o = this.Ee8d2j4S9Vm5yGuR;
        if (lPqJFMbrw2n1o == null) {
            lPqJFMbrw2n1o = null;
        }
        while (true) {
            Object objXfn2GJwmGqs7kWW = lPqJFMbrw2n1o.xfn2GJwmGqs7kWW();
            if (objXfn2GJwmGqs7kWW instanceof kQNfMPvAFgenoBAn) {
                if (objXfn2GJwmGqs7kWW != this) {
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LPqJFMbrw2n1o.w9sT1Swbhx3hs;
                UqEmA2FQjHiILndJMDn4 uqEmA2FQjHiILndJMDn4 = jb8et6SZeK5TWMrJFxDX.b1EoSIRjJHO5;
                while (!atomicReferenceFieldUpdater2.compareAndSet(lPqJFMbrw2n1o, objXfn2GJwmGqs7kWW, uqEmA2FQjHiILndJMDn4)) {
                    if (atomicReferenceFieldUpdater2.get(lPqJFMbrw2n1o) != objXfn2GJwmGqs7kWW) {
                    }
                }
                return;
            }
            if (!(objXfn2GJwmGqs7kWW instanceof kZrG9UUAjHVzkL6Wn) || ((kZrG9UUAjHVzkL6Wn) objXfn2GJwmGqs7kWW).xDyLpEZyrcKVe0() == null) {
                return;
            }
            while (true) {
                Object objHjneShqpF9Tis4 = hjneShqpF9Tis4();
                if (objHjneShqpF9Tis4 instanceof CUtLm1SgUMIDluAJx) {
                    return;
                }
                if (objHjneShqpF9Tis4 == this) {
                    return;
                }
                qgQwIhtTRQZkWPNc qgqwihttrqzkwpnc = (qgQwIhtTRQZkWPNc) objHjneShqpF9Tis4;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = qgQwIhtTRQZkWPNc.JXn4Qf7zpnLjP5;
                CUtLm1SgUMIDluAJx cUtLm1SgUMIDluAJx = (CUtLm1SgUMIDluAJx) atomicReferenceFieldUpdater3.get(qgqwihttrqzkwpnc);
                if (cUtLm1SgUMIDluAJx == null) {
                    cUtLm1SgUMIDluAJx = new CUtLm1SgUMIDluAJx(qgqwihttrqzkwpnc);
                    atomicReferenceFieldUpdater3.lazySet(qgqwihttrqzkwpnc, cUtLm1SgUMIDluAJx);
                }
                do {
                    atomicReferenceFieldUpdater = qgQwIhtTRQZkWPNc.w9sT1Swbhx3hs;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, objHjneShqpF9Tis4, cUtLm1SgUMIDluAJx)) {
                        qgqwihttrqzkwpnc.ibVTtJUNfrGYbW();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == objHjneShqpF9Tis4);
            }
        }
    }

    public abstract void wotphlvK9sPbXJ(Throwable th);

    @Override // v.s.kZrG9UUAjHVzkL6Wn
    public final HaMJHE2hWj1dbNj xDyLpEZyrcKVe0() {
        return null;
    }
}
