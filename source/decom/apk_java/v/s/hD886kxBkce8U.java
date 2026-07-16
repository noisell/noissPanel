package v.s;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class hD886kxBkce8U extends KGpgQH6viQ5JszZ implements wxzKGhimDkb70lgmfb69, ldRXVAtAYtfEIpl, S1QQVRz2bJQ7 {
    public final b9xRoaXFR1fmOO2Q Ee8d2j4S9Vm5yGuR;
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;
    public final cpTq2XMCb5JSaEhn xDyLpEZyrcKVe0;
    public static final AtomicIntegerFieldUpdater ibVTtJUNfrGYbW = AtomicIntegerFieldUpdater.newUpdater(hD886kxBkce8U.class, "_decisionAndIndex");
    public static final AtomicReferenceFieldUpdater b1EoSIRjJHO5 = AtomicReferenceFieldUpdater.newUpdater(hD886kxBkce8U.class, Object.class, "_state");
    public static final AtomicReferenceFieldUpdater pyu8ovAipBTLYAiKab = AtomicReferenceFieldUpdater.newUpdater(hD886kxBkce8U.class, Object.class, "_parentHandle");

    public hD886kxBkce8U(int i, b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q) {
        super(i);
        this.Ee8d2j4S9Vm5yGuR = b9xroaxfr1fmoo2q;
        this.xDyLpEZyrcKVe0 = b9xroaxfr1fmoo2q.xDyLpEZyrcKVe0();
        this._decisionAndIndex = 536870911;
        this._state = fivkjwgu2UdAtiY.w9sT1Swbhx3hs;
    }

    public static void K7eEOBPYP9VIoHWTe(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public static Object vIJudZvPyTuNp(E9az9PfAcrslNncVQ e9az9PfAcrslNncVQ, Object obj, int i, deLJ4Z0aL3hcJ3O1 delj4z0al3hcj3o1) {
        if (obj instanceof JQrj25Jykd1wBwb) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (delj4z0al3hcj3o1 != null || (e9az9PfAcrslNncVQ instanceof LR2N3RA8S6gSP2jwUGa)) {
            return new x2ai6Gfmg8zOa(obj, e9az9PfAcrslNncVQ instanceof LR2N3RA8S6gSP2jwUGa ? (LR2N3RA8S6gSP2jwUGa) e9az9PfAcrslNncVQ : null, delj4z0al3hcj3o1, (CancellationException) null, 16);
        }
        return obj;
    }

    @Override // v.s.KGpgQH6viQ5JszZ
    public final Object D5P1xCAyuvgF() {
        return b1EoSIRjJHO5.get(this);
    }

    public final void DVTNwpDEVsUKuznof(E9az9PfAcrslNncVQ e9az9PfAcrslNncVQ) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b1EoSIRjJHO5;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof fivkjwgu2UdAtiY) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, e9az9PfAcrslNncVQ)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            boolean z = true;
            if (obj instanceof LR2N3RA8S6gSP2jwUGa ? true : obj instanceof endHZiILsQwz) {
                K7eEOBPYP9VIoHWTe(e9az9PfAcrslNncVQ, obj);
                throw null;
            }
            if (obj instanceof JQrj25Jykd1wBwb) {
                JQrj25Jykd1wBwb jQrj25Jykd1wBwb = (JQrj25Jykd1wBwb) obj;
                if (!JQrj25Jykd1wBwb.w9sT1Swbhx3hs.compareAndSet(jQrj25Jykd1wBwb, 0, 1)) {
                    K7eEOBPYP9VIoHWTe(e9az9PfAcrslNncVQ, obj);
                    throw null;
                }
                if (obj instanceof livmVtKj7J2GcsEi4FE) {
                    Throwable th = jQrj25Jykd1wBwb.dDIMxZXP1V8HdM;
                    if (e9az9PfAcrslNncVQ instanceof LR2N3RA8S6gSP2jwUGa) {
                        hjneShqpF9Tis4((LR2N3RA8S6gSP2jwUGa) e9az9PfAcrslNncVQ, th);
                        return;
                    } else {
                        gIIiyi2ddlMDR0((endHZiILsQwz) e9az9PfAcrslNncVQ, th);
                        return;
                    }
                }
                return;
            }
            if (obj instanceof x2ai6Gfmg8zOa) {
                x2ai6Gfmg8zOa x2ai6gfmg8zoa = (x2ai6Gfmg8zOa) obj;
                if (x2ai6gfmg8zoa.w9sT1Swbhx3hs != null) {
                    K7eEOBPYP9VIoHWTe(e9az9PfAcrslNncVQ, obj);
                    throw null;
                }
                if (e9az9PfAcrslNncVQ instanceof endHZiILsQwz) {
                    return;
                }
                LR2N3RA8S6gSP2jwUGa lR2N3RA8S6gSP2jwUGa = (LR2N3RA8S6gSP2jwUGa) e9az9PfAcrslNncVQ;
                Throwable th2 = x2ai6gfmg8zoa.Ee8d2j4S9Vm5yGuR;
                if (th2 != null) {
                    hjneShqpF9Tis4(lR2N3RA8S6gSP2jwUGa, th2);
                    return;
                }
                x2ai6Gfmg8zOa x2ai6gfmg8zoaDDIMxZXP1V8HdM = x2ai6Gfmg8zOa.dDIMxZXP1V8HdM(x2ai6gfmg8zoa, lR2N3RA8S6gSP2jwUGa, null, 29);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, x2ai6gfmg8zoaDDIMxZXP1V8HdM)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    return;
                }
            } else {
                if (e9az9PfAcrslNncVQ instanceof endHZiILsQwz) {
                    return;
                }
                x2ai6Gfmg8zOa x2ai6gfmg8zoa2 = new x2ai6Gfmg8zOa(obj, (LR2N3RA8S6gSP2jwUGa) e9az9PfAcrslNncVQ, (deLJ4Z0aL3hcJ3O1) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, x2ai6gfmg8zoa2)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    return;
                }
            }
        }
    }

    public final void EWUjsTERgdPbSw3NNlN(Object obj, int i, deLJ4Z0aL3hcJ3O1 delj4z0al3hcj3o1) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b1EoSIRjJHO5;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof E9az9PfAcrslNncVQ)) {
                if (obj2 instanceof livmVtKj7J2GcsEi4FE) {
                    livmVtKj7J2GcsEi4FE livmvtkj7j2gcsei4fe = (livmVtKj7J2GcsEi4FE) obj2;
                    if (livmVtKj7J2GcsEi4FE.vekpFI4d1Nc4fakF.compareAndSet(livmvtkj7j2gcsei4fe, 0, 1)) {
                        if (delj4z0al3hcj3o1 != null) {
                            gmNWMfvn6zlEj(delj4z0al3hcj3o1, livmvtkj7j2gcsei4fe.dDIMxZXP1V8HdM);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            Object objVIJudZvPyTuNp = vIJudZvPyTuNp((E9az9PfAcrslNncVQ) obj2, obj, i, delj4z0al3hcj3o1);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objVIJudZvPyTuNp)) {
                    if (!l1V0lQr6TbwNKqHfXNbb()) {
                        Qrz92kRPw4GcghAc();
                    }
                    nQilHWaqS401ZtR(i);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    @Override // v.s.ldRXVAtAYtfEIpl
    public final ldRXVAtAYtfEIpl Ee8d2j4S9Vm5yGuR() {
        b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q = this.Ee8d2j4S9Vm5yGuR;
        if (b9xroaxfr1fmoo2q instanceof ldRXVAtAYtfEIpl) {
            return (ldRXVAtAYtfEIpl) b9xroaxfr1fmoo2q;
        }
        return null;
    }

    public final void H9XlUr4OeMJFiXK(deLJ4Z0aL3hcJ3O1 delj4z0al3hcj3o1) {
        DVTNwpDEVsUKuznof(delj4z0al3hcj3o1 instanceof LR2N3RA8S6gSP2jwUGa ? (LR2N3RA8S6gSP2jwUGa) delj4z0al3hcj3o1 : new LR2N3RA8S6gSP2jwUGa(2, delj4z0al3hcj3o1));
    }

    public final Object J0zjQ7CAgohuxU20eCW6() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        WGrwEyVqR28VYxamRhIg wGrwEyVqR28VYxamRhIg;
        boolean zL1V0lQr6TbwNKqHfXNbb = l1V0lQr6TbwNKqHfXNbb();
        do {
            atomicIntegerFieldUpdater = ibVTtJUNfrGYbW;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zL1V0lQr6TbwNKqHfXNbb) {
                    dTS0S7eC32ubQH54j36();
                }
                Object obj = b1EoSIRjJHO5.get(this);
                if (obj instanceof JQrj25Jykd1wBwb) {
                    throw ((JQrj25Jykd1wBwb) obj).dDIMxZXP1V8HdM;
                }
                int i3 = this.JXn4Qf7zpnLjP5;
                if ((i3 != 56 - 55 && i3 != 2) || (wGrwEyVqR28VYxamRhIg = (WGrwEyVqR28VYxamRhIg) this.xDyLpEZyrcKVe0.D5P1xCAyuvgF(fadfsJa4iEdiwEC4Xm8.b1EoSIRjJHO5)) == null || wGrwEyVqR28VYxamRhIg.dDIMxZXP1V8HdM()) {
                    return b1EoSIRjJHO5(obj);
                }
                CancellationException cancellationExceptionYTljMGnIibTRdOpSh4 = ((LPqJFMbrw2n1o) wGrwEyVqR28VYxamRhIg).yTljMGnIibTRdOpSh4();
                w9sT1Swbhx3hs(obj, cancellationExceptionYTljMGnIibTRdOpSh4);
                throw cancellationExceptionYTljMGnIibTRdOpSh4;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((Xoey1fYV9aCBctS) pyu8ovAipBTLYAiKab.get(this)) == null) {
            XiR1pIn5878vVWd();
        }
        if (zL1V0lQr6TbwNKqHfXNbb) {
            dTS0S7eC32ubQH54j36();
        }
        return pjN1L01KDMWnPCy0daD.w9sT1Swbhx3hs;
    }

    @Override // v.s.KGpgQH6viQ5JszZ
    public final Throwable JXn4Qf7zpnLjP5(Object obj) {
        Throwable thJXn4Qf7zpnLjP5 = super.JXn4Qf7zpnLjP5(obj);
        if (thJXn4Qf7zpnLjP5 != null) {
            return thJXn4Qf7zpnLjP5;
        }
        return null;
    }

    public final void MLSIo1htfMPWeB8V876L() {
        Xoey1fYV9aCBctS xoey1fYV9aCBctSXiR1pIn5878vVWd = XiR1pIn5878vVWd();
        if (xoey1fYV9aCBctSXiR1pIn5878vVWd == null || (b1EoSIRjJHO5.get(this) instanceof E9az9PfAcrslNncVQ)) {
            return;
        }
        xoey1fYV9aCBctSXiR1pIn5878vVWd.vekpFI4d1Nc4fakF();
        pyu8ovAipBTLYAiKab.set(this, PsPmgmnXrw1g4Kki.w9sT1Swbhx3hs);
    }

    public final void Qrz92kRPw4GcghAc() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = pyu8ovAipBTLYAiKab;
        Xoey1fYV9aCBctS xoey1fYV9aCBctS = (Xoey1fYV9aCBctS) atomicReferenceFieldUpdater.get(this);
        if (xoey1fYV9aCBctS == null) {
            return;
        }
        xoey1fYV9aCBctS.vekpFI4d1Nc4fakF();
        atomicReferenceFieldUpdater.set(this, PsPmgmnXrw1g4Kki.w9sT1Swbhx3hs);
    }

    public final Xoey1fYV9aCBctS XiR1pIn5878vVWd() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        WGrwEyVqR28VYxamRhIg wGrwEyVqR28VYxamRhIg = (WGrwEyVqR28VYxamRhIg) this.xDyLpEZyrcKVe0.D5P1xCAyuvgF(fadfsJa4iEdiwEC4Xm8.b1EoSIRjJHO5);
        if (wGrwEyVqR28VYxamRhIg == null) {
            return null;
        }
        int i = (-45) + 47;
        Xoey1fYV9aCBctS xoey1fYV9aCBctSIUQk66nAiXgO35 = ((LPqJFMbrw2n1o) wGrwEyVqR28VYxamRhIg).iUQk66nAiXgO35((2 & 1) == 0, (2 & 2) != 0, new gC6rWXGMm5SM(this));
        do {
            atomicReferenceFieldUpdater = pyu8ovAipBTLYAiKab;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, xoey1fYV9aCBctSIUQk66nAiXgO35)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return xoey1fYV9aCBctSIUQk66nAiXgO35;
    }

    @Override // v.s.KGpgQH6viQ5JszZ
    public final Object b1EoSIRjJHO5(Object obj) {
        return obj instanceof x2ai6Gfmg8zOa ? ((x2ai6Gfmg8zOa) obj).dDIMxZXP1V8HdM : obj;
    }

    @Override // v.s.S1QQVRz2bJQ7
    public final void dDIMxZXP1V8HdM(endHZiILsQwz endhziilsqwz, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = ibVTtJUNfrGYbW;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        DVTNwpDEVsUKuznof(endhziilsqwz);
    }

    public final void dTS0S7eC32ubQH54j36() {
        b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q = this.Ee8d2j4S9Vm5yGuR;
        Throwable th = null;
        V9IxQnfNrXampq7vuj6 v9IxQnfNrXampq7vuj6 = b9xroaxfr1fmoo2q instanceof V9IxQnfNrXampq7vuj6 ? (V9IxQnfNrXampq7vuj6) b9xroaxfr1fmoo2q : null;
        if (v9IxQnfNrXampq7vuj6 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = V9IxQnfNrXampq7vuj6.pyu8ovAipBTLYAiKab;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(v9IxQnfNrXampq7vuj6);
                o0rN3ekjBJ6kKwok o0rn3ekjbj6kkwok = y6jRGLEWNMir.w9sT1Swbhx3hs;
                if (obj != o0rn3ekjbj6kkwok) {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(v9IxQnfNrXampq7vuj6, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(v9IxQnfNrXampq7vuj6) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(v9IxQnfNrXampq7vuj6, o0rn3ekjbj6kkwok, this)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(v9IxQnfNrXampq7vuj6) == o0rn3ekjbj6kkwok);
            }
            if (th == null) {
                return;
            }
            Qrz92kRPw4GcghAc();
            wotphlvK9sPbXJ(th);
        }
    }

    public final void gIIiyi2ddlMDR0(endHZiILsQwz endhziilsqwz, Throwable th) {
        cpTq2XMCb5JSaEhn cptq2xmcb5jsaehn = this.xDyLpEZyrcKVe0;
        int i = ibVTtJUNfrGYbW.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            endhziilsqwz.ibVTtJUNfrGYbW(i, cptq2xmcb5jsaehn);
        } catch (Throwable th2) {
            okc5AGRjqrud84oM6d.hjneShqpF9Tis4(cptq2xmcb5jsaehn, new Sb7Xj3N9U1DQ("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void gmNWMfvn6zlEj(deLJ4Z0aL3hcJ3O1 delj4z0al3hcj3o1, Throwable th) {
        try {
            delj4z0al3hcj3o1.pyu8ovAipBTLYAiKab(th);
        } catch (Throwable th2) {
            okc5AGRjqrud84oM6d.hjneShqpF9Tis4(this.xDyLpEZyrcKVe0, new Sb7Xj3N9U1DQ("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void hjneShqpF9Tis4(LR2N3RA8S6gSP2jwUGa lR2N3RA8S6gSP2jwUGa, Throwable th) {
        try {
            lR2N3RA8S6gSP2jwUGa.dDIMxZXP1V8HdM(th);
        } catch (Throwable th2) {
            okc5AGRjqrud84oM6d.hjneShqpF9Tis4(this.xDyLpEZyrcKVe0, new Sb7Xj3N9U1DQ("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // v.s.b9xRoaXFR1fmOO2Q
    public final void ibVTtJUNfrGYbW(Object obj) {
        Throwable thDDIMxZXP1V8HdM = roAK4OF9CtSmlCJgpQ.dDIMxZXP1V8HdM(obj);
        if (thDDIMxZXP1V8HdM != null) {
            obj = new JQrj25Jykd1wBwb(thDDIMxZXP1V8HdM, false);
        }
        EWUjsTERgdPbSw3NNlN(obj, this.JXn4Qf7zpnLjP5, null);
    }

    public final boolean l1V0lQr6TbwNKqHfXNbb() {
        if (this.JXn4Qf7zpnLjP5 == (-94) + 96) {
            return V9IxQnfNrXampq7vuj6.pyu8ovAipBTLYAiKab.get((V9IxQnfNrXampq7vuj6) this.Ee8d2j4S9Vm5yGuR) != null;
        }
        return false;
    }

    public final void nQilHWaqS401ZtR(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = ibVTtJUNfrGYbW;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z = i == 4;
                b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q = this.Ee8d2j4S9Vm5yGuR;
                if (!z && (b9xroaxfr1fmoo2q instanceof V9IxQnfNrXampq7vuj6)) {
                    int i4 = (-26) + 28;
                    boolean z2 = i == 1 || i == i4;
                    int i5 = this.JXn4Qf7zpnLjP5;
                    if (z2 == (i5 == 1 || i5 == i4)) {
                        V9IxQnfNrXampq7vuj6 v9IxQnfNrXampq7vuj6 = (V9IxQnfNrXampq7vuj6) b9xroaxfr1fmoo2q;
                        XsD7TIOExRJcOn4m xsD7TIOExRJcOn4m = v9IxQnfNrXampq7vuj6.Ee8d2j4S9Vm5yGuR;
                        cpTq2XMCb5JSaEhn cptq2xmcb5jsaehn = v9IxQnfNrXampq7vuj6.xDyLpEZyrcKVe0.vekpFI4d1Nc4fakF;
                        if (xsD7TIOExRJcOn4m.O2DHNSIGZlgPja7eqLgn()) {
                            xsD7TIOExRJcOn4m.vIJudZvPyTuNp(cptq2xmcb5jsaehn, this);
                            return;
                        }
                        JYn3foLRPO8BbEAlsg6f jYn3foLRPO8BbEAlsg6fDDIMxZXP1V8HdM = tlG9soiU5ACqtsQ6.dDIMxZXP1V8HdM();
                        if (jYn3foLRPO8BbEAlsg6fDDIMxZXP1V8HdM.vekpFI4d1Nc4fakF >= 4294967296L) {
                            jYn3foLRPO8BbEAlsg6fDDIMxZXP1V8HdM.tne6mXOUFKdd(this);
                            return;
                        }
                        jYn3foLRPO8BbEAlsg6fDDIMxZXP1V8HdM.ECwLkmPW1UKz7J6E(true);
                        try {
                            jb8et6SZeK5TWMrJFxDX.H9XlUr4OeMJFiXK(this, b9xroaxfr1fmoo2q, true);
                            do {
                            } while (jYn3foLRPO8BbEAlsg6fDDIMxZXP1V8HdM.XuO9PPFo607ssKwZjNW());
                        } catch (Throwable th) {
                            try {
                                pyu8ovAipBTLYAiKab(th, null);
                            } finally {
                                jYn3foLRPO8BbEAlsg6fDDIMxZXP1V8HdM.xfn2GJwmGqs7kWW(true);
                            }
                        }
                        return;
                    }
                }
                jb8et6SZeK5TWMrJFxDX.H9XlUr4OeMJFiXK(this, b9xroaxfr1fmoo2q, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    public final o0rN3ekjBJ6kKwok rCHnHJBAlOpNI5(Object obj, deLJ4Z0aL3hcJ3O1 delj4z0al3hcj3o1) {
        o0rN3ekjBJ6kKwok o0rn3ekjbj6kkwok = okc5AGRjqrud84oM6d.vekpFI4d1Nc4fakF;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b1EoSIRjJHO5;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof E9az9PfAcrslNncVQ)) {
                return null;
            }
            Object objVIJudZvPyTuNp = vIJudZvPyTuNp((E9az9PfAcrslNncVQ) obj2, obj, this.JXn4Qf7zpnLjP5, delj4z0al3hcj3o1);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objVIJudZvPyTuNp)) {
                    if (!l1V0lQr6TbwNKqHfXNbb()) {
                        Qrz92kRPw4GcghAc();
                    }
                    return o0rn3ekjbj6kkwok;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("CancellableContinuation(");
        sb.append(gA5gCwTK0qjTIn.rCHnHJBAlOpNI5(this.Ee8d2j4S9Vm5yGuR));
        sb.append("){");
        Object obj = b1EoSIRjJHO5.get(this);
        if (obj instanceof E9az9PfAcrslNncVQ) {
            str = "Active";
        } else {
            str = obj instanceof livmVtKj7J2GcsEi4FE ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(gA5gCwTK0qjTIn.pyu8ovAipBTLYAiKab(this));
        return sb.toString();
    }

    @Override // v.s.KGpgQH6viQ5JszZ
    public final b9xRoaXFR1fmOO2Q vekpFI4d1Nc4fakF() {
        return this.Ee8d2j4S9Vm5yGuR;
    }

    @Override // v.s.KGpgQH6viQ5JszZ
    public final void w9sT1Swbhx3hs(Object obj, CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b1EoSIRjJHO5;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof E9az9PfAcrslNncVQ) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof JQrj25Jykd1wBwb) {
                return;
            }
            if (!(obj2 instanceof x2ai6Gfmg8zOa)) {
                cancellationException2 = cancellationException;
                x2ai6Gfmg8zOa x2ai6gfmg8zoa = new x2ai6Gfmg8zOa(obj2, (LR2N3RA8S6gSP2jwUGa) null, (deLJ4Z0aL3hcJ3O1) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, x2ai6gfmg8zoa)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    }
                }
                return;
            }
            x2ai6Gfmg8zOa x2ai6gfmg8zoa2 = (x2ai6Gfmg8zOa) obj2;
            if (x2ai6gfmg8zoa2.Ee8d2j4S9Vm5yGuR != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            x2ai6Gfmg8zOa x2ai6gfmg8zoaDDIMxZXP1V8HdM = x2ai6Gfmg8zOa.dDIMxZXP1V8HdM(x2ai6gfmg8zoa2, null, cancellationException, 15);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, x2ai6gfmg8zoaDDIMxZXP1V8HdM)) {
                    LR2N3RA8S6gSP2jwUGa lR2N3RA8S6gSP2jwUGa = x2ai6gfmg8zoa2.w9sT1Swbhx3hs;
                    if (lR2N3RA8S6gSP2jwUGa != null) {
                        hjneShqpF9Tis4(lR2N3RA8S6gSP2jwUGa, cancellationException);
                    }
                    deLJ4Z0aL3hcJ3O1 delj4z0al3hcj3o1 = x2ai6gfmg8zoa2.vekpFI4d1Nc4fakF;
                    if (delj4z0al3hcj3o1 != null) {
                        gmNWMfvn6zlEj(delj4z0al3hcj3o1, cancellationException);
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
            cancellationException2 = cancellationException;
            cancellationException = cancellationException2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    public final boolean wotphlvK9sPbXJ(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b1EoSIRjJHO5;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof E9az9PfAcrslNncVQ)) {
                return false;
            }
            ?? r5 = 56 - 55;
            livmVtKj7J2GcsEi4FE livmvtkj7j2gcsei4fe = new livmVtKj7J2GcsEi4FE(this, th, ((obj instanceof LR2N3RA8S6gSP2jwUGa) || (obj instanceof endHZiILsQwz)) ? r5 : 0);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, livmvtkj7j2gcsei4fe)) {
                    E9az9PfAcrslNncVQ e9az9PfAcrslNncVQ = (E9az9PfAcrslNncVQ) obj;
                    if (e9az9PfAcrslNncVQ instanceof LR2N3RA8S6gSP2jwUGa) {
                        hjneShqpF9Tis4((LR2N3RA8S6gSP2jwUGa) obj, th);
                    } else if (e9az9PfAcrslNncVQ instanceof endHZiILsQwz) {
                        gIIiyi2ddlMDR0((endHZiILsQwz) obj, th);
                    }
                    if (!l1V0lQr6TbwNKqHfXNbb()) {
                        Qrz92kRPw4GcghAc();
                    }
                    nQilHWaqS401ZtR(this.JXn4Qf7zpnLjP5);
                    return r5;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    @Override // v.s.b9xRoaXFR1fmOO2Q
    public final cpTq2XMCb5JSaEhn xDyLpEZyrcKVe0() {
        return this.xDyLpEZyrcKVe0;
    }

    public final void yTljMGnIibTRdOpSh4(XsD7TIOExRJcOn4m xsD7TIOExRJcOn4m) {
        b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q = this.Ee8d2j4S9Vm5yGuR;
        V9IxQnfNrXampq7vuj6 v9IxQnfNrXampq7vuj6 = b9xroaxfr1fmoo2q instanceof V9IxQnfNrXampq7vuj6 ? (V9IxQnfNrXampq7vuj6) b9xroaxfr1fmoo2q : null;
        EWUjsTERgdPbSw3NNlN(Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM, (v9IxQnfNrXampq7vuj6 != null ? v9IxQnfNrXampq7vuj6.Ee8d2j4S9Vm5yGuR : null) == xsD7TIOExRJcOn4m ? 4 : this.JXn4Qf7zpnLjP5, null);
    }
}
