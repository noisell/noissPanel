package v.s;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class R5WF639wwoyEjivV7M7 extends JXn4Qf7zpnLjP5 implements lRXMEtwekxl6YBP0L2K, OXZJw8mg0hnX {
    public final HT6Px2xDdrmDEbykyYy Ee8d2j4S9Vm5yGuR;

    public R5WF639wwoyEjivV7M7(cpTq2XMCb5JSaEhn cptq2xmcb5jsaehn, HT6Px2xDdrmDEbykyYy hT6Px2xDdrmDEbykyYy) {
        super(cptq2xmcb5jsaehn, true);
        this.Ee8d2j4S9Vm5yGuR = hT6Px2xDdrmDEbykyYy;
    }

    public final void GiffeZJ1rbwyx(vekpFI4d1Nc4fakF vekpfi4d1nc4fakf) {
        HT6Px2xDdrmDEbykyYy hT6Px2xDdrmDEbykyYy = this.Ee8d2j4S9Vm5yGuR;
        hT6Px2xDdrmDEbykyYy.getClass();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = HT6Px2xDdrmDEbykyYy.hjneShqpF9Tis4;
        while (!atomicReferenceFieldUpdater.compareAndSet(hT6Px2xDdrmDEbykyYy, null, vekpfi4d1nc4fakf)) {
            if (atomicReferenceFieldUpdater.get(hT6Px2xDdrmDEbykyYy) != null) {
                while (true) {
                    Object obj = atomicReferenceFieldUpdater.get(hT6Px2xDdrmDEbykyYy);
                    o0rN3ekjBJ6kKwok o0rn3ekjbj6kkwok = LYgmvfM6ccmccA0DV.J0zjQ7CAgohuxU20eCW6;
                    if (obj != o0rn3ekjbj6kkwok) {
                        if (obj == LYgmvfM6ccmccA0DV.MLSIo1htfMPWeB8V876L) {
                            throw new IllegalStateException("Another handler was already registered and successfully invoked");
                        }
                        throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
                    }
                    o0rN3ekjBJ6kKwok o0rn3ekjbj6kkwok2 = LYgmvfM6ccmccA0DV.MLSIo1htfMPWeB8V876L;
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(hT6Px2xDdrmDEbykyYy, o0rn3ekjbj6kkwok, o0rn3ekjbj6kkwok2)) {
                            vekpfi4d1nc4fakf.pyu8ovAipBTLYAiKab(hT6Px2xDdrmDEbykyYy.Qrz92kRPw4GcghAc());
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(hT6Px2xDdrmDEbykyYy) == o0rn3ekjbj6kkwok);
                }
            }
        }
    }

    @Override // v.s.LPqJFMbrw2n1o
    public final void J0zjQ7CAgohuxU20eCW6(CancellationException cancellationException) {
        this.Ee8d2j4S9Vm5yGuR.ibVTtJUNfrGYbW(cancellationException, true);
        nQilHWaqS401ZtR(cancellationException);
    }

    @Override // v.s.gUw52pKTgwkb0KB
    public final Object JXn4Qf7zpnLjP5(Ry0qdYcyMI47soiNYB ry0qdYcyMI47soiNYB) {
        HT6Px2xDdrmDEbykyYy hT6Px2xDdrmDEbykyYy = this.Ee8d2j4S9Vm5yGuR;
        hT6Px2xDdrmDEbykyYy.getClass();
        return HT6Px2xDdrmDEbykyYy.EWUjsTERgdPbSw3NNlN(hT6Px2xDdrmDEbykyYy, ry0qdYcyMI47soiNYB);
    }

    @Override // v.s.gUw52pKTgwkb0KB
    public final Object b1EoSIRjJHO5() {
        return this.Ee8d2j4S9Vm5yGuR.b1EoSIRjJHO5();
    }

    @Override // v.s.JXn4Qf7zpnLjP5
    public final void dQC4QhgRN3MSEAP3HW0(Object obj) {
        OFMrQsTe5s1KYV0lq.xDyLpEZyrcKVe0(this.Ee8d2j4S9Vm5yGuR);
    }

    @Override // v.s.UDr2ORhCq7XyGYjS5
    public final Object hjneShqpF9Tis4(GoFryeNz7Rqaz7fcxHnt goFryeNz7Rqaz7fcxHnt, vJpP6RThpasAD vjpp6rthpasad) {
        return this.Ee8d2j4S9Vm5yGuR.hjneShqpF9Tis4(goFryeNz7Rqaz7fcxHnt, vjpp6rthpasad);
    }

    @Override // v.s.JXn4Qf7zpnLjP5
    public final void is7XW2V21HfKv7MihWy(Throwable th, boolean z) {
        if (this.Ee8d2j4S9Vm5yGuR.ibVTtJUNfrGYbW(th, false) || z) {
            return;
        }
        okc5AGRjqrud84oM6d.hjneShqpF9Tis4(this.JXn4Qf7zpnLjP5, th);
    }

    @Override // v.s.UDr2ORhCq7XyGYjS5
    public final Object pyu8ovAipBTLYAiKab(Object obj) {
        return this.Ee8d2j4S9Vm5yGuR.pyu8ovAipBTLYAiKab(obj);
    }

    @Override // v.s.LPqJFMbrw2n1o, v.s.WGrwEyVqR28VYxamRhIg
    public final void vekpFI4d1Nc4fakF(CancellationException cancellationException) {
        Object objXfn2GJwmGqs7kWW = xfn2GJwmGqs7kWW();
        if (objXfn2GJwmGqs7kWW instanceof JQrj25Jykd1wBwb) {
            return;
        }
        if ((objXfn2GJwmGqs7kWW instanceof vauyoRPQP1X13bGh) && ((vauyoRPQP1X13bGh) objXfn2GJwmGqs7kWW).JXn4Qf7zpnLjP5()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new vHgVg4NkL4VdR4ndb1m(XiR1pIn5878vVWd(), null, this);
        }
        J0zjQ7CAgohuxU20eCW6(cancellationException);
    }
}
