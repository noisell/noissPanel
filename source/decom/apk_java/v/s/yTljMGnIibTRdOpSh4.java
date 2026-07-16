package v.s;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class yTljMGnIibTRdOpSh4 extends gA5gCwTK0qjTIn {
    public final AtomicReferenceFieldUpdater D5P1xCAyuvgF;
    public final AtomicReferenceFieldUpdater gIIiyi2ddlMDR0;
    public final AtomicReferenceFieldUpdater gmNWMfvn6zlEj;
    public final AtomicReferenceFieldUpdater hjneShqpF9Tis4;
    public final AtomicReferenceFieldUpdater wotphlvK9sPbXJ;

    public yTljMGnIibTRdOpSh4(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.D5P1xCAyuvgF = atomicReferenceFieldUpdater;
        this.hjneShqpF9Tis4 = atomicReferenceFieldUpdater2;
        this.gmNWMfvn6zlEj = atomicReferenceFieldUpdater3;
        this.gIIiyi2ddlMDR0 = atomicReferenceFieldUpdater4;
        this.wotphlvK9sPbXJ = atomicReferenceFieldUpdater5;
    }

    @Override // v.s.gA5gCwTK0qjTIn
    public final boolean Ee8d2j4S9Vm5yGuR(O2DHNSIGZlgPja7eqLgn o2DHNSIGZlgPja7eqLgn, rCHnHJBAlOpNI5 rchnhjbalopni5, rCHnHJBAlOpNI5 rchnhjbalopni6) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.gmNWMfvn6zlEj;
            if (atomicReferenceFieldUpdater.compareAndSet(o2DHNSIGZlgPja7eqLgn, rchnhjbalopni5, rchnhjbalopni6)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(o2DHNSIGZlgPja7eqLgn) == rchnhjbalopni5);
        return false;
    }

    @Override // v.s.gA5gCwTK0qjTIn
    public final void J0zjQ7CAgohuxU20eCW6(rCHnHJBAlOpNI5 rchnhjbalopni5, Thread thread) {
        this.D5P1xCAyuvgF.lazySet(rchnhjbalopni5, thread);
    }

    @Override // v.s.gA5gCwTK0qjTIn
    public final boolean JXn4Qf7zpnLjP5(O2DHNSIGZlgPja7eqLgn o2DHNSIGZlgPja7eqLgn, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.wotphlvK9sPbXJ;
            if (atomicReferenceFieldUpdater.compareAndSet(o2DHNSIGZlgPja7eqLgn, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(o2DHNSIGZlgPja7eqLgn) == obj);
        return false;
    }

    @Override // v.s.gA5gCwTK0qjTIn
    public final void nQilHWaqS401ZtR(rCHnHJBAlOpNI5 rchnhjbalopni5, rCHnHJBAlOpNI5 rchnhjbalopni6) {
        this.hjneShqpF9Tis4.lazySet(rchnhjbalopni5, rchnhjbalopni6);
    }

    @Override // v.s.gA5gCwTK0qjTIn
    public final boolean vekpFI4d1Nc4fakF(O2DHNSIGZlgPja7eqLgn o2DHNSIGZlgPja7eqLgn, EWUjsTERgdPbSw3NNlN eWUjsTERgdPbSw3NNlN, EWUjsTERgdPbSw3NNlN eWUjsTERgdPbSw3NNlN2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.gIIiyi2ddlMDR0;
            if (atomicReferenceFieldUpdater.compareAndSet(o2DHNSIGZlgPja7eqLgn, eWUjsTERgdPbSw3NNlN, eWUjsTERgdPbSw3NNlN2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(o2DHNSIGZlgPja7eqLgn) == eWUjsTERgdPbSw3NNlN);
        return false;
    }
}
