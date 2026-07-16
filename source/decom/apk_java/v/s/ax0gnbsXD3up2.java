package v.s;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class ax0gnbsXD3up2 implements b9xRoaXFR1fmOO2Q, ldRXVAtAYtfEIpl {
    public static final AtomicReferenceFieldUpdater vekpFI4d1Nc4fakF = AtomicReferenceFieldUpdater.newUpdater(ax0gnbsXD3up2.class, Object.class, "result");
    private volatile Object result;
    public final b9xRoaXFR1fmOO2Q w9sT1Swbhx3hs;

    public ax0gnbsXD3up2(b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q) {
        pjN1L01KDMWnPCy0daD pjn1l01kdmwnpcy0dad = pjN1L01KDMWnPCy0daD.vekpFI4d1Nc4fakF;
        this.w9sT1Swbhx3hs = b9xroaxfr1fmoo2q;
        this.result = pjn1l01kdmwnpcy0dad;
    }

    @Override // v.s.ldRXVAtAYtfEIpl
    public final ldRXVAtAYtfEIpl Ee8d2j4S9Vm5yGuR() {
        b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q = this.w9sT1Swbhx3hs;
        if (b9xroaxfr1fmoo2q instanceof ldRXVAtAYtfEIpl) {
            return (ldRXVAtAYtfEIpl) b9xroaxfr1fmoo2q;
        }
        return null;
    }

    public final Object dDIMxZXP1V8HdM() throws Throwable {
        pjN1L01KDMWnPCy0daD pjn1l01kdmwnpcy0dad = pjN1L01KDMWnPCy0daD.w9sT1Swbhx3hs;
        Object obj = this.result;
        pjN1L01KDMWnPCy0daD pjn1l01kdmwnpcy0dad2 = pjN1L01KDMWnPCy0daD.vekpFI4d1Nc4fakF;
        if (obj == pjn1l01kdmwnpcy0dad2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = vekpFI4d1Nc4fakF;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, pjn1l01kdmwnpcy0dad2, pjn1l01kdmwnpcy0dad)) {
                if (atomicReferenceFieldUpdater.get(this) != pjn1l01kdmwnpcy0dad2) {
                    obj = this.result;
                }
            }
            return pjn1l01kdmwnpcy0dad;
        }
        if (obj == pjN1L01KDMWnPCy0daD.JXn4Qf7zpnLjP5) {
            return pjn1l01kdmwnpcy0dad;
        }
        if (obj instanceof VSZeS5mia3yEXbAe) {
            throw ((VSZeS5mia3yEXbAe) obj).w9sT1Swbhx3hs;
        }
        return obj;
    }

    @Override // v.s.b9xRoaXFR1fmOO2Q
    public final void ibVTtJUNfrGYbW(Object obj) {
        while (true) {
            Object obj2 = this.result;
            pjN1L01KDMWnPCy0daD pjn1l01kdmwnpcy0dad = pjN1L01KDMWnPCy0daD.vekpFI4d1Nc4fakF;
            if (obj2 == pjn1l01kdmwnpcy0dad) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = vekpFI4d1Nc4fakF;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, pjn1l01kdmwnpcy0dad, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != pjn1l01kdmwnpcy0dad) {
                    }
                }
                return;
            }
            pjN1L01KDMWnPCy0daD pjn1l01kdmwnpcy0dad2 = pjN1L01KDMWnPCy0daD.w9sT1Swbhx3hs;
            if (obj2 != pjn1l01kdmwnpcy0dad2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = vekpFI4d1Nc4fakF;
            pjN1L01KDMWnPCy0daD pjn1l01kdmwnpcy0dad3 = pjN1L01KDMWnPCy0daD.JXn4Qf7zpnLjP5;
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, pjn1l01kdmwnpcy0dad2, pjn1l01kdmwnpcy0dad3)) {
                    this.w9sT1Swbhx3hs.ibVTtJUNfrGYbW(obj);
                    return;
                }
            } while (atomicReferenceFieldUpdater2.get(this) == pjn1l01kdmwnpcy0dad2);
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.w9sT1Swbhx3hs;
    }

    @Override // v.s.b9xRoaXFR1fmOO2Q
    public final cpTq2XMCb5JSaEhn xDyLpEZyrcKVe0() {
        return this.w9sT1Swbhx3hs.xDyLpEZyrcKVe0();
    }
}
