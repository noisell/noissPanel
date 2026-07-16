package v.s;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class hjneShqpF9Tis4 extends OFMrQsTe5s1KYV0lq {
    public final AtomicReferenceFieldUpdater D5P1xCAyuvgF;
    public final AtomicReferenceFieldUpdater b1EoSIRjJHO5;
    public final AtomicReferenceFieldUpdater gmNWMfvn6zlEj;
    public final AtomicReferenceFieldUpdater hjneShqpF9Tis4;
    public final AtomicReferenceFieldUpdater pyu8ovAipBTLYAiKab;

    public hjneShqpF9Tis4(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.b1EoSIRjJHO5 = atomicReferenceFieldUpdater;
        this.pyu8ovAipBTLYAiKab = atomicReferenceFieldUpdater2;
        this.D5P1xCAyuvgF = atomicReferenceFieldUpdater3;
        this.hjneShqpF9Tis4 = atomicReferenceFieldUpdater4;
        this.gmNWMfvn6zlEj = atomicReferenceFieldUpdater5;
    }

    @Override // v.s.OFMrQsTe5s1KYV0lq
    public final void H9XlUr4OeMJFiXK(wotphlvK9sPbXJ wotphlvk9spbxj, Thread thread) {
        this.b1EoSIRjJHO5.lazySet(wotphlvk9spbxj, thread);
    }

    @Override // v.s.OFMrQsTe5s1KYV0lq
    public final boolean JXn4Qf7zpnLjP5(Qrz92kRPw4GcghAc qrz92kRPw4GcghAc, wotphlvK9sPbXJ wotphlvk9spbxj, wotphlvK9sPbXJ wotphlvk9spbxj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.D5P1xCAyuvgF;
            if (atomicReferenceFieldUpdater.compareAndSet(qrz92kRPw4GcghAc, wotphlvk9spbxj, wotphlvk9spbxj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(qrz92kRPw4GcghAc) == wotphlvk9spbxj);
        return false;
    }

    @Override // v.s.OFMrQsTe5s1KYV0lq
    public final void XiR1pIn5878vVWd(wotphlvK9sPbXJ wotphlvk9spbxj, wotphlvK9sPbXJ wotphlvk9spbxj2) {
        this.pyu8ovAipBTLYAiKab.lazySet(wotphlvk9spbxj, wotphlvk9spbxj2);
    }

    @Override // v.s.OFMrQsTe5s1KYV0lq
    public final boolean vekpFI4d1Nc4fakF(Qrz92kRPw4GcghAc qrz92kRPw4GcghAc, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.gmNWMfvn6zlEj;
            if (atomicReferenceFieldUpdater.compareAndSet(qrz92kRPw4GcghAc, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(qrz92kRPw4GcghAc) == obj);
        return false;
    }

    @Override // v.s.OFMrQsTe5s1KYV0lq
    public final boolean w9sT1Swbhx3hs(Qrz92kRPw4GcghAc qrz92kRPw4GcghAc, D5P1xCAyuvgF d5P1xCAyuvgF, D5P1xCAyuvgF d5P1xCAyuvgF2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.hjneShqpF9Tis4;
            if (atomicReferenceFieldUpdater.compareAndSet(qrz92kRPw4GcghAc, d5P1xCAyuvgF, d5P1xCAyuvgF2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(qrz92kRPw4GcghAc) == d5P1xCAyuvgF);
        return false;
    }
}
