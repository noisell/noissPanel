package v.s;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class qgQwIhtTRQZkWPNc {
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;
    public static final AtomicReferenceFieldUpdater w9sT1Swbhx3hs = AtomicReferenceFieldUpdater.newUpdater(qgQwIhtTRQZkWPNc.class, Object.class, "_next");
    public static final AtomicReferenceFieldUpdater vekpFI4d1Nc4fakF = AtomicReferenceFieldUpdater.newUpdater(qgQwIhtTRQZkWPNc.class, Object.class, "_prev");
    public static final AtomicReferenceFieldUpdater JXn4Qf7zpnLjP5 = AtomicReferenceFieldUpdater.newUpdater(qgQwIhtTRQZkWPNc.class, Object.class, "_removedRef");

    public final void D5P1xCAyuvgF(qgQwIhtTRQZkWPNc qgqwihttrqzkwpnc) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = vekpFI4d1Nc4fakF;
            qgQwIhtTRQZkWPNc qgqwihttrqzkwpnc2 = (qgQwIhtTRQZkWPNc) atomicReferenceFieldUpdater.get(qgqwihttrqzkwpnc);
            if (hjneShqpF9Tis4() != qgqwihttrqzkwpnc) {
                return;
            }
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(qgqwihttrqzkwpnc, qgqwihttrqzkwpnc2, this)) {
                    if (gIIiyi2ddlMDR0()) {
                        qgqwihttrqzkwpnc.ibVTtJUNfrGYbW();
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(qgqwihttrqzkwpnc) == qgqwihttrqzkwpnc2);
        }
    }

    public boolean gIIiyi2ddlMDR0() {
        return hjneShqpF9Tis4() instanceof CUtLm1SgUMIDluAJx;
    }

    public final qgQwIhtTRQZkWPNc gmNWMfvn6zlEj() {
        qgQwIhtTRQZkWPNc qgqwihttrqzkwpnc;
        Object objHjneShqpF9Tis4 = hjneShqpF9Tis4();
        CUtLm1SgUMIDluAJx cUtLm1SgUMIDluAJx = objHjneShqpF9Tis4 instanceof CUtLm1SgUMIDluAJx ? (CUtLm1SgUMIDluAJx) objHjneShqpF9Tis4 : null;
        return (cUtLm1SgUMIDluAJx == null || (qgqwihttrqzkwpnc = cUtLm1SgUMIDluAJx.dDIMxZXP1V8HdM) == null) ? (qgQwIhtTRQZkWPNc) objHjneShqpF9Tis4 : qgqwihttrqzkwpnc;
    }

    public final Object hjneShqpF9Tis4() {
        while (true) {
            Object obj = w9sT1Swbhx3hs.get(this);
            if (!(obj instanceof GRPcLaQWtuGXi1HP7)) {
                return obj;
            }
            ((GRPcLaQWtuGXi1HP7) obj).dDIMxZXP1V8HdM(this);
        }
    }

    public final qgQwIhtTRQZkWPNc ibVTtJUNfrGYbW() {
        qgQwIhtTRQZkWPNc qgqwihttrqzkwpnc;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = vekpFI4d1Nc4fakF;
            qgQwIhtTRQZkWPNc qgqwihttrqzkwpnc2 = (qgQwIhtTRQZkWPNc) atomicReferenceFieldUpdater2.get(this);
            qgqwihttrqzkwpnc = qgqwihttrqzkwpnc2;
            while (true) {
                qgQwIhtTRQZkWPNc qgqwihttrqzkwpnc3 = null;
                while (true) {
                    atomicReferenceFieldUpdater = w9sT1Swbhx3hs;
                    obj = atomicReferenceFieldUpdater.get(qgqwihttrqzkwpnc);
                    if (obj == this) {
                        if (qgqwihttrqzkwpnc2 != qgqwihttrqzkwpnc) {
                            while (!atomicReferenceFieldUpdater2.compareAndSet(this, qgqwihttrqzkwpnc2, qgqwihttrqzkwpnc)) {
                                if (atomicReferenceFieldUpdater2.get(this) != qgqwihttrqzkwpnc2) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                    if (gIIiyi2ddlMDR0()) {
                        return null;
                    }
                    if (obj == null) {
                        break loop0;
                    }
                    if (obj instanceof GRPcLaQWtuGXi1HP7) {
                        ((GRPcLaQWtuGXi1HP7) obj).dDIMxZXP1V8HdM(qgqwihttrqzkwpnc);
                        break;
                    }
                    if (!(obj instanceof CUtLm1SgUMIDluAJx)) {
                        qgqwihttrqzkwpnc3 = qgqwihttrqzkwpnc;
                        qgqwihttrqzkwpnc = (qgQwIhtTRQZkWPNc) obj;
                    } else {
                        if (qgqwihttrqzkwpnc3 != null) {
                            break;
                        }
                        qgqwihttrqzkwpnc = (qgQwIhtTRQZkWPNc) atomicReferenceFieldUpdater2.get(qgqwihttrqzkwpnc);
                    }
                }
                qgQwIhtTRQZkWPNc qgqwihttrqzkwpnc4 = ((CUtLm1SgUMIDluAJx) obj).dDIMxZXP1V8HdM;
                while (!atomicReferenceFieldUpdater.compareAndSet(qgqwihttrqzkwpnc3, qgqwihttrqzkwpnc, qgqwihttrqzkwpnc4)) {
                    if (atomicReferenceFieldUpdater.get(qgqwihttrqzkwpnc3) != qgqwihttrqzkwpnc) {
                        break;
                    }
                }
                qgqwihttrqzkwpnc = qgqwihttrqzkwpnc3;
            }
        }
        return qgqwihttrqzkwpnc;
    }

    public String toString() {
        return new Avy74hhKRk0Wqi(this) + '@' + gA5gCwTK0qjTIn.pyu8ovAipBTLYAiKab(this);
    }
}
