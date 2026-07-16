package v.s;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class LPqJFMbrw2n1o implements WGrwEyVqR28VYxamRhIg, i3a7TEBUEgjcrspEhz {
    private volatile Object _parentHandle;
    private volatile Object _state;
    public static final AtomicReferenceFieldUpdater w9sT1Swbhx3hs = AtomicReferenceFieldUpdater.newUpdater(LPqJFMbrw2n1o.class, Object.class, "_state");
    public static final AtomicReferenceFieldUpdater vekpFI4d1Nc4fakF = AtomicReferenceFieldUpdater.newUpdater(LPqJFMbrw2n1o.class, Object.class, "_parentHandle");

    public LPqJFMbrw2n1o(boolean z) {
        this._state = z ? jb8et6SZeK5TWMrJFxDX.b1EoSIRjJHO5 : jb8et6SZeK5TWMrJFxDX.ibVTtJUNfrGYbW;
    }

    public static String VEkRsTDS6a9oHWI(Object obj) {
        if (!(obj instanceof vauyoRPQP1X13bGh)) {
            if (obj instanceof kZrG9UUAjHVzkL6Wn) {
                return ((kZrG9UUAjHVzkL6Wn) obj).dDIMxZXP1V8HdM() ? "Active" : "New";
            }
            return obj instanceof JQrj25Jykd1wBwb ? "Cancelled" : "Completed";
        }
        vauyoRPQP1X13bGh vauyorpqp1x13bgh = (vauyoRPQP1X13bGh) obj;
        if (vauyorpqp1x13bgh.JXn4Qf7zpnLjP5()) {
            return "Cancelling";
        }
        return vauyorpqp1x13bgh.Ee8d2j4S9Vm5yGuR() ? "Completing" : "Active";
    }

    public static ktPuRg8fuhlhDbufjD k84rwRrqzhrNQ1CdNQ9(qgQwIhtTRQZkWPNc qgqwihttrqzkwpnc) {
        while (qgqwihttrqzkwpnc.gIIiyi2ddlMDR0()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = qgQwIhtTRQZkWPNc.vekpFI4d1Nc4fakF;
            qgQwIhtTRQZkWPNc qgqwihttrqzkwpncIbVTtJUNfrGYbW = qgqwihttrqzkwpnc.ibVTtJUNfrGYbW();
            if (qgqwihttrqzkwpncIbVTtJUNfrGYbW == null) {
                Object obj = atomicReferenceFieldUpdater.get(qgqwihttrqzkwpnc);
                while (true) {
                    qgqwihttrqzkwpnc = (qgQwIhtTRQZkWPNc) obj;
                    if (!qgqwihttrqzkwpnc.gIIiyi2ddlMDR0()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(qgqwihttrqzkwpnc);
                }
            } else {
                qgqwihttrqzkwpnc = qgqwihttrqzkwpncIbVTtJUNfrGYbW;
            }
        }
        while (true) {
            qgqwihttrqzkwpnc = qgqwihttrqzkwpnc.gmNWMfvn6zlEj();
            if (!qgqwihttrqzkwpnc.gIIiyi2ddlMDR0()) {
                if (qgqwihttrqzkwpnc instanceof ktPuRg8fuhlhDbufjD) {
                    return (ktPuRg8fuhlhDbufjD) qgqwihttrqzkwpnc;
                }
                if (qgqwihttrqzkwpnc instanceof HaMJHE2hWj1dbNj) {
                    return null;
                }
            }
        }
    }

    public final void A1BaTVAMeIXMnh(HaMJHE2hWj1dbNj haMJHE2hWj1dbNj, Throwable th) {
        Sb7Xj3N9U1DQ sb7Xj3N9U1DQ = null;
        for (qgQwIhtTRQZkWPNc qgqwihttrqzkwpncGmNWMfvn6zlEj = (qgQwIhtTRQZkWPNc) haMJHE2hWj1dbNj.hjneShqpF9Tis4(); !qgqwihttrqzkwpncGmNWMfvn6zlEj.equals(haMJHE2hWj1dbNj); qgqwihttrqzkwpncGmNWMfvn6zlEj = qgqwihttrqzkwpncGmNWMfvn6zlEj.gmNWMfvn6zlEj()) {
            if (qgqwihttrqzkwpncGmNWMfvn6zlEj instanceof U9g2mOxA6v60QExhx) {
                kQNfMPvAFgenoBAn kqnfmpvafgenoban = (kQNfMPvAFgenoBAn) qgqwihttrqzkwpncGmNWMfvn6zlEj;
                try {
                    kqnfmpvafgenoban.wotphlvK9sPbXJ(th);
                } catch (Throwable th2) {
                    if (sb7Xj3N9U1DQ != null) {
                        RIZfHbqXpth8r2yN4.dDIMxZXP1V8HdM(sb7Xj3N9U1DQ, th2);
                    } else {
                        sb7Xj3N9U1DQ = new Sb7Xj3N9U1DQ("Exception in completion handler " + kqnfmpvafgenoban + " for " + this, th2);
                    }
                }
            }
        }
        if (sb7Xj3N9U1DQ != null) {
            fivkjwgu2UdAtiY(sb7Xj3N9U1DQ);
        }
        MLSIo1htfMPWeB8V876L(th);
    }

    @Override // v.s.cpTq2XMCb5JSaEhn
    public final daJe2GxqPkyrLbTKQx4 D5P1xCAyuvgF(qrp1qtE91LqdmL qrp1qte91lqdml) {
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(fadfsJa4iEdiwEC4Xm8.b1EoSIRjJHO5, qrp1qte91lqdml)) {
            return this;
        }
        return null;
    }

    @Override // v.s.cpTq2XMCb5JSaEhn
    public final cpTq2XMCb5JSaEhn DVTNwpDEVsUKuznof(qrp1qtE91LqdmL qrp1qte91lqdml) {
        return okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(fadfsJa4iEdiwEC4Xm8.b1EoSIRjJHO5, qrp1qte91lqdml) ? sNACkioAJERo.w9sT1Swbhx3hs : this;
    }

    public final void ECwLkmPW1UKz7J6E(WGrwEyVqR28VYxamRhIg wGrwEyVqR28VYxamRhIg) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = vekpFI4d1Nc4fakF;
        PsPmgmnXrw1g4Kki psPmgmnXrw1g4Kki = PsPmgmnXrw1g4Kki.w9sT1Swbhx3hs;
        if (wGrwEyVqR28VYxamRhIg == null) {
            atomicReferenceFieldUpdater.set(this, psPmgmnXrw1g4Kki);
            return;
        }
        LPqJFMbrw2n1o lPqJFMbrw2n1o = (LPqJFMbrw2n1o) wGrwEyVqR28VYxamRhIg;
        loop0: while (true) {
            Object objXfn2GJwmGqs7kWW = lPqJFMbrw2n1o.xfn2GJwmGqs7kWW();
            boolean z = objXfn2GJwmGqs7kWW instanceof UqEmA2FQjHiILndJMDn4;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = w9sT1Swbhx3hs;
            if (!z) {
                if (!(objXfn2GJwmGqs7kWW instanceof nYCUmC7Y9aNg)) {
                    break;
                }
                HaMJHE2hWj1dbNj haMJHE2hWj1dbNj = ((nYCUmC7Y9aNg) objXfn2GJwmGqs7kWW).w9sT1Swbhx3hs;
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(lPqJFMbrw2n1o, objXfn2GJwmGqs7kWW, haMJHE2hWj1dbNj)) {
                        lPqJFMbrw2n1o.getClass();
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater2.get(lPqJFMbrw2n1o) == objXfn2GJwmGqs7kWW);
            } else {
                if (((UqEmA2FQjHiILndJMDn4) objXfn2GJwmGqs7kWW).w9sT1Swbhx3hs) {
                    break;
                }
                UqEmA2FQjHiILndJMDn4 uqEmA2FQjHiILndJMDn4 = jb8et6SZeK5TWMrJFxDX.b1EoSIRjJHO5;
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(lPqJFMbrw2n1o, objXfn2GJwmGqs7kWW, uqEmA2FQjHiILndJMDn4)) {
                        lPqJFMbrw2n1o.getClass();
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater2.get(lPqJFMbrw2n1o) == objXfn2GJwmGqs7kWW);
            }
        }
        REYtCCgA2asIVSIAP7 rEYtCCgA2asIVSIAP7 = (REYtCCgA2asIVSIAP7) lPqJFMbrw2n1o.iUQk66nAiXgO35((2 & 1) == 0, (2 & 2) != 0, new ktPuRg8fuhlhDbufjD(this));
        atomicReferenceFieldUpdater.set(this, rEYtCCgA2asIVSIAP7);
        if (xfn2GJwmGqs7kWW() instanceof kZrG9UUAjHVzkL6Wn) {
            return;
        }
        rEYtCCgA2asIVSIAP7.vekpFI4d1Nc4fakF();
        atomicReferenceFieldUpdater.set(this, psPmgmnXrw1g4Kki);
    }

    @Override // v.s.cpTq2XMCb5JSaEhn
    public final cpTq2XMCb5JSaEhn EWUjsTERgdPbSw3NNlN(cpTq2XMCb5JSaEhn cptq2xmcb5jsaehn) {
        return OFMrQsTe5s1KYV0lq.MLSIo1htfMPWeB8V876L(this, cptq2xmcb5jsaehn);
    }

    public boolean H9XlUr4OeMJFiXK(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return nQilHWaqS401ZtR(th) && vIJudZvPyTuNp();
    }

    public void J0zjQ7CAgohuxU20eCW6(CancellationException cancellationException) {
        nQilHWaqS401ZtR(cancellationException);
    }

    public final Throwable K7eEOBPYP9VIoHWTe(Object obj) {
        Throwable thVekpFI4d1Nc4fakF;
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new vHgVg4NkL4VdR4ndb1m(XiR1pIn5878vVWd(), null, this) : th;
        }
        LPqJFMbrw2n1o lPqJFMbrw2n1o = (LPqJFMbrw2n1o) ((i3a7TEBUEgjcrspEhz) obj);
        Object objXfn2GJwmGqs7kWW = lPqJFMbrw2n1o.xfn2GJwmGqs7kWW();
        if (objXfn2GJwmGqs7kWW instanceof vauyoRPQP1X13bGh) {
            thVekpFI4d1Nc4fakF = ((vauyoRPQP1X13bGh) objXfn2GJwmGqs7kWW).vekpFI4d1Nc4fakF();
        } else if (objXfn2GJwmGqs7kWW instanceof JQrj25Jykd1wBwb) {
            thVekpFI4d1Nc4fakF = ((JQrj25Jykd1wBwb) objXfn2GJwmGqs7kWW).dDIMxZXP1V8HdM;
        } else {
            if (objXfn2GJwmGqs7kWW instanceof kZrG9UUAjHVzkL6Wn) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objXfn2GJwmGqs7kWW).toString());
            }
            thVekpFI4d1Nc4fakF = null;
        }
        CancellationException cancellationException = thVekpFI4d1Nc4fakF instanceof CancellationException ? (CancellationException) thVekpFI4d1Nc4fakF : null;
        return cancellationException == null ? new vHgVg4NkL4VdR4ndb1m("Parent job is ".concat(VEkRsTDS6a9oHWI(objXfn2GJwmGqs7kWW)), thVekpFI4d1Nc4fakF, lPqJFMbrw2n1o) : cancellationException;
    }

    public final boolean MLSIo1htfMPWeB8V876L(Throwable th) {
        if (XuO9PPFo607ssKwZjNW()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        REYtCCgA2asIVSIAP7 rEYtCCgA2asIVSIAP7 = (REYtCCgA2asIVSIAP7) vekpFI4d1Nc4fakF.get(this);
        if (rEYtCCgA2asIVSIAP7 == null || rEYtCCgA2asIVSIAP7 == PsPmgmnXrw1g4Kki.w9sT1Swbhx3hs) {
            return z;
        }
        return rEYtCCgA2asIVSIAP7.Ee8d2j4S9Vm5yGuR(th) || z;
    }

    public final void MSGkxvPxRYNqC(kQNfMPvAFgenoBAn kqnfmpvafgenoban) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        HaMJHE2hWj1dbNj haMJHE2hWj1dbNj = new HaMJHE2hWj1dbNj();
        kqnfmpvafgenoban.getClass();
        qgQwIhtTRQZkWPNc.vekpFI4d1Nc4fakF.lazySet(haMJHE2hWj1dbNj, kqnfmpvafgenoban);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = qgQwIhtTRQZkWPNc.w9sT1Swbhx3hs;
        atomicReferenceFieldUpdater2.lazySet(haMJHE2hWj1dbNj, kqnfmpvafgenoban);
        loop0: while (kqnfmpvafgenoban.hjneShqpF9Tis4() == kqnfmpvafgenoban) {
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(kqnfmpvafgenoban, kqnfmpvafgenoban, haMJHE2hWj1dbNj)) {
                    haMJHE2hWj1dbNj.D5P1xCAyuvgF(kqnfmpvafgenoban);
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater2.get(kqnfmpvafgenoban) == kqnfmpvafgenoban);
        }
        qgQwIhtTRQZkWPNc qgqwihttrqzkwpncGmNWMfvn6zlEj = kqnfmpvafgenoban.gmNWMfvn6zlEj();
        do {
            atomicReferenceFieldUpdater = w9sT1Swbhx3hs;
            if (atomicReferenceFieldUpdater.compareAndSet(this, kqnfmpvafgenoban, qgqwihttrqzkwpncGmNWMfvn6zlEj)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == kqnfmpvafgenoban);
    }

    public final HaMJHE2hWj1dbNj O2DHNSIGZlgPja7eqLgn(kZrG9UUAjHVzkL6Wn kzrg9uuajhvzkl6wn) {
        HaMJHE2hWj1dbNj haMJHE2hWj1dbNjXDyLpEZyrcKVe0 = kzrg9uuajhvzkl6wn.xDyLpEZyrcKVe0();
        if (haMJHE2hWj1dbNjXDyLpEZyrcKVe0 != null) {
            return haMJHE2hWj1dbNjXDyLpEZyrcKVe0;
        }
        if (kzrg9uuajhvzkl6wn instanceof UqEmA2FQjHiILndJMDn4) {
            return new HaMJHE2hWj1dbNj();
        }
        if (kzrg9uuajhvzkl6wn instanceof kQNfMPvAFgenoBAn) {
            MSGkxvPxRYNqC((kQNfMPvAFgenoBAn) kzrg9uuajhvzkl6wn);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + kzrg9uuajhvzkl6wn).toString());
    }

    @Override // v.s.cpTq2XMCb5JSaEhn
    public final Object Qrz92kRPw4GcghAc(Object obj, NhN5GSKLYh6STld4 nhN5GSKLYh6STld4) {
        return nhN5GSKLYh6STld4.b1EoSIRjJHO5(obj, this);
    }

    public String XiR1pIn5878vVWd() {
        return "Job was cancelled";
    }

    public boolean XuO9PPFo607ssKwZjNW() {
        return this instanceof kc4oFtUbogtHwFVJtc;
    }

    @Override // v.s.WGrwEyVqR28VYxamRhIg
    public boolean dDIMxZXP1V8HdM() {
        Object objXfn2GJwmGqs7kWW = xfn2GJwmGqs7kWW();
        return (objXfn2GJwmGqs7kWW instanceof kZrG9UUAjHVzkL6Wn) && ((kZrG9UUAjHVzkL6Wn) objXfn2GJwmGqs7kWW).dDIMxZXP1V8HdM();
    }

    public final Object dTS0S7eC32ubQH54j36(vauyoRPQP1X13bGh vauyorpqp1x13bgh, Object obj) {
        Object obj2 = null;
        Throwable vhgvg4nkl4vdr4ndb1m = null;
        JQrj25Jykd1wBwb jQrj25Jykd1wBwb = obj instanceof JQrj25Jykd1wBwb ? (JQrj25Jykd1wBwb) obj : null;
        Throwable th = jQrj25Jykd1wBwb != null ? jQrj25Jykd1wBwb.dDIMxZXP1V8HdM : null;
        synchronized (vauyorpqp1x13bgh) {
            vauyorpqp1x13bgh.JXn4Qf7zpnLjP5();
            ArrayList arrayListIbVTtJUNfrGYbW = vauyorpqp1x13bgh.ibVTtJUNfrGYbW(th);
            if (!arrayListIbVTtJUNfrGYbW.isEmpty()) {
                int size = arrayListIbVTtJUNfrGYbW.size();
                int i = 0;
                while (i < size) {
                    Object obj3 = arrayListIbVTtJUNfrGYbW.get(i);
                    i++;
                    if (!(((Throwable) obj3) instanceof CancellationException)) {
                        obj2 = obj3;
                        break;
                    }
                }
                vhgvg4nkl4vdr4ndb1m = (Throwable) obj2;
                if (vhgvg4nkl4vdr4ndb1m == null) {
                    vhgvg4nkl4vdr4ndb1m = (Throwable) arrayListIbVTtJUNfrGYbW.get(0);
                }
            } else if (vauyorpqp1x13bgh.JXn4Qf7zpnLjP5()) {
                vhgvg4nkl4vdr4ndb1m = new vHgVg4NkL4VdR4ndb1m(XiR1pIn5878vVWd(), null, this);
            }
            if (vhgvg4nkl4vdr4ndb1m != null && arrayListIbVTtJUNfrGYbW.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListIbVTtJUNfrGYbW.size()));
                int size2 = arrayListIbVTtJUNfrGYbW.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj4 = arrayListIbVTtJUNfrGYbW.get(i2);
                    i2++;
                    Throwable th2 = (Throwable) obj4;
                    if (th2 != vhgvg4nkl4vdr4ndb1m && th2 != vhgvg4nkl4vdr4ndb1m && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        RIZfHbqXpth8r2yN4.dDIMxZXP1V8HdM(vhgvg4nkl4vdr4ndb1m, th2);
                    }
                }
            }
        }
        if (vhgvg4nkl4vdr4ndb1m != null && vhgvg4nkl4vdr4ndb1m != th) {
            obj = new JQrj25Jykd1wBwb(vhgvg4nkl4vdr4ndb1m, false);
        }
        if (vhgvg4nkl4vdr4ndb1m != null && (MLSIo1htfMPWeB8V876L(vhgvg4nkl4vdr4ndb1m) || tne6mXOUFKdd(vhgvg4nkl4vdr4ndb1m))) {
            JQrj25Jykd1wBwb jQrj25Jykd1wBwb2 = (JQrj25Jykd1wBwb) obj;
            jQrj25Jykd1wBwb2.getClass();
            JQrj25Jykd1wBwb.w9sT1Swbhx3hs.compareAndSet(jQrj25Jykd1wBwb2, 0, 1);
        }
        euF5Udt5Rqv3Qmea(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w9sT1Swbhx3hs;
        Object dI9mjYyYGHOmxGOw = obj instanceof kZrG9UUAjHVzkL6Wn ? new DI9mjYyYGHOmxGOw((kZrG9UUAjHVzkL6Wn) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, vauyorpqp1x13bgh, dI9mjYyYGHOmxGOw) && atomicReferenceFieldUpdater.get(this) == vauyorpqp1x13bgh) {
        }
        l1V0lQr6TbwNKqHfXNbb(vauyorpqp1x13bgh, obj);
        return obj;
    }

    public void euF5Udt5Rqv3Qmea(Object obj) {
    }

    public void fivkjwgu2UdAtiY(Sb7Xj3N9U1DQ sb7Xj3N9U1DQ) {
        throw sb7Xj3N9U1DQ;
    }

    public void gIIiyi2ddlMDR0(Object obj) {
    }

    @Override // v.s.daJe2GxqPkyrLbTKQx4
    public final qrp1qtE91LqdmL getKey() {
        return fadfsJa4iEdiwEC4Xm8.b1EoSIRjJHO5;
    }

    public final boolean gmNWMfvn6zlEj(kZrG9UUAjHVzkL6Wn kzrg9uuajhvzkl6wn, HaMJHE2hWj1dbNj haMJHE2hWj1dbNj, kQNfMPvAFgenoBAn kqnfmpvafgenoban) {
        qgQwIhtTRQZkWPNc qgqwihttrqzkwpncIbVTtJUNfrGYbW;
        FXJWru6xtL1kdYRfL fXJWru6xtL1kdYRfL = new FXJWru6xtL1kdYRfL(kqnfmpvafgenoban, this, kzrg9uuajhvzkl6wn);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = qgQwIhtTRQZkWPNc.vekpFI4d1Nc4fakF;
            qgqwihttrqzkwpncIbVTtJUNfrGYbW = haMJHE2hWj1dbNj.ibVTtJUNfrGYbW();
            if (qgqwihttrqzkwpncIbVTtJUNfrGYbW == null) {
                Object obj = atomicReferenceFieldUpdater.get(haMJHE2hWj1dbNj);
                while (true) {
                    qgqwihttrqzkwpncIbVTtJUNfrGYbW = (qgQwIhtTRQZkWPNc) obj;
                    if (!qgqwihttrqzkwpncIbVTtJUNfrGYbW.gIIiyi2ddlMDR0()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(qgqwihttrqzkwpncIbVTtJUNfrGYbW);
                }
            }
            qgQwIhtTRQZkWPNc.vekpFI4d1Nc4fakF.lazySet(kqnfmpvafgenoban, qgqwihttrqzkwpncIbVTtJUNfrGYbW);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = qgQwIhtTRQZkWPNc.w9sT1Swbhx3hs;
            atomicReferenceFieldUpdater2.lazySet(kqnfmpvafgenoban, haMJHE2hWj1dbNj);
            fXJWru6xtL1kdYRfL.vekpFI4d1Nc4fakF = haMJHE2hWj1dbNj;
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(qgqwihttrqzkwpncIbVTtJUNfrGYbW, haMJHE2hWj1dbNj, fXJWru6xtL1kdYRfL)) {
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater2.get(qgqwihttrqzkwpncIbVTtJUNfrGYbW) == haMJHE2hWj1dbNj);
        }
        return fXJWru6xtL1kdYRfL.dDIMxZXP1V8HdM(qgqwihttrqzkwpncIbVTtJUNfrGYbW) == null;
    }

    public final Object hV4VTKNUdeHN(Object obj) {
        Object objJdOQeRk37T35X5xKW1P;
        do {
            objJdOQeRk37T35X5xKW1P = jdOQeRk37T35X5xKW1P(xfn2GJwmGqs7kWW(), obj);
            if (objJdOQeRk37T35X5xKW1P == jb8et6SZeK5TWMrJFxDX.w9sT1Swbhx3hs) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                JQrj25Jykd1wBwb jQrj25Jykd1wBwb = obj instanceof JQrj25Jykd1wBwb ? (JQrj25Jykd1wBwb) obj : null;
                throw new IllegalStateException(str, jQrj25Jykd1wBwb != null ? jQrj25Jykd1wBwb.dDIMxZXP1V8HdM : null);
            }
        } while (objJdOQeRk37T35X5xKW1P == jb8et6SZeK5TWMrJFxDX.JXn4Qf7zpnLjP5);
        return objJdOQeRk37T35X5xKW1P;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0032 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:98:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x00dd A[EDGE_INSN: B:99:0x00dd->B:78:0x00dd BREAK  A[LOOP:0: B:18:0x0032->B:108:0x0032], SYNTHETIC] */
    public final Xoey1fYV9aCBctS iUQk66nAiXgO35(boolean z, boolean z2, deLJ4Z0aL3hcJ3O1 delj4z0al3hcj3o1) {
        kQNfMPvAFgenoBAn cdbtq4hwzbb2eaycp;
        Throwable thVekpFI4d1Nc4fakF;
        if (z) {
            cdbtq4hwzbb2eaycp = delj4z0al3hcj3o1 instanceof U9g2mOxA6v60QExhx ? (U9g2mOxA6v60QExhx) delj4z0al3hcj3o1 : null;
            if (cdbtq4hwzbb2eaycp == null) {
                cdbtq4hwzbb2eaycp = new KDzznCVMCIQh4MFV8(delj4z0al3hcj3o1);
            }
        } else {
            cdbtq4hwzbb2eaycp = delj4z0al3hcj3o1 instanceof kQNfMPvAFgenoBAn ? (kQNfMPvAFgenoBAn) delj4z0al3hcj3o1 : null;
            if (cdbtq4hwzbb2eaycp == null) {
                cdbtq4hwzbb2eaycp = new cDBTq4hwZBb2eAYCP(delj4z0al3hcj3o1);
            }
        }
        cdbtq4hwzbb2eaycp.Ee8d2j4S9Vm5yGuR = this;
        loop0: while (true) {
            Object objXfn2GJwmGqs7kWW = xfn2GJwmGqs7kWW();
            if (objXfn2GJwmGqs7kWW instanceof UqEmA2FQjHiILndJMDn4) {
                UqEmA2FQjHiILndJMDn4 uqEmA2FQjHiILndJMDn4 = (UqEmA2FQjHiILndJMDn4) objXfn2GJwmGqs7kWW;
                if (uqEmA2FQjHiILndJMDn4.w9sT1Swbhx3hs) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w9sT1Swbhx3hs;
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, objXfn2GJwmGqs7kWW, cdbtq4hwzbb2eaycp)) {
                        if (atomicReferenceFieldUpdater.get(this) != objXfn2GJwmGqs7kWW) {
                        }
                    }
                    break loop0;
                }
                HaMJHE2hWj1dbNj haMJHE2hWj1dbNj = new HaMJHE2hWj1dbNj();
                kZrG9UUAjHVzkL6Wn nycumc7y9ang = uqEmA2FQjHiILndJMDn4.w9sT1Swbhx3hs ? haMJHE2hWj1dbNj : new nYCUmC7Y9aNg(haMJHE2hWj1dbNj);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = w9sT1Swbhx3hs;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, uqEmA2FQjHiILndJMDn4, nycumc7y9ang) && atomicReferenceFieldUpdater2.get(this) == uqEmA2FQjHiILndJMDn4) {
                }
            } else {
                if (!(objXfn2GJwmGqs7kWW instanceof kZrG9UUAjHVzkL6Wn)) {
                    if (z2) {
                        JQrj25Jykd1wBwb jQrj25Jykd1wBwb = objXfn2GJwmGqs7kWW instanceof JQrj25Jykd1wBwb ? (JQrj25Jykd1wBwb) objXfn2GJwmGqs7kWW : null;
                        delj4z0al3hcj3o1.pyu8ovAipBTLYAiKab(jQrj25Jykd1wBwb != null ? jQrj25Jykd1wBwb.dDIMxZXP1V8HdM : null);
                    }
                    return PsPmgmnXrw1g4Kki.w9sT1Swbhx3hs;
                }
                kZrG9UUAjHVzkL6Wn kzrg9uuajhvzkl6wn = (kZrG9UUAjHVzkL6Wn) objXfn2GJwmGqs7kWW;
                HaMJHE2hWj1dbNj haMJHE2hWj1dbNjXDyLpEZyrcKVe0 = kzrg9uuajhvzkl6wn.xDyLpEZyrcKVe0();
                if (haMJHE2hWj1dbNjXDyLpEZyrcKVe0 == null) {
                    MSGkxvPxRYNqC((kQNfMPvAFgenoBAn) objXfn2GJwmGqs7kWW);
                } else {
                    Xoey1fYV9aCBctS xoey1fYV9aCBctS = PsPmgmnXrw1g4Kki.w9sT1Swbhx3hs;
                    if (z && (objXfn2GJwmGqs7kWW instanceof vauyoRPQP1X13bGh)) {
                        synchronized (objXfn2GJwmGqs7kWW) {
                            try {
                                thVekpFI4d1Nc4fakF = ((vauyoRPQP1X13bGh) objXfn2GJwmGqs7kWW).vekpFI4d1Nc4fakF();
                                if (thVekpFI4d1Nc4fakF == null || ((delj4z0al3hcj3o1 instanceof ktPuRg8fuhlhDbufjD) && !((vauyoRPQP1X13bGh) objXfn2GJwmGqs7kWW).Ee8d2j4S9Vm5yGuR())) {
                                    if (gmNWMfvn6zlEj((kZrG9UUAjHVzkL6Wn) objXfn2GJwmGqs7kWW, haMJHE2hWj1dbNjXDyLpEZyrcKVe0, cdbtq4hwzbb2eaycp)) {
                                        if (thVekpFI4d1Nc4fakF == null) {
                                            return cdbtq4hwzbb2eaycp;
                                        }
                                        xoey1fYV9aCBctS = cdbtq4hwzbb2eaycp;
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (thVekpFI4d1Nc4fakF != null) {
                            if (z2) {
                                delj4z0al3hcj3o1.pyu8ovAipBTLYAiKab(thVekpFI4d1Nc4fakF);
                            }
                            return xoey1fYV9aCBctS;
                        }
                        if (gmNWMfvn6zlEj(kzrg9uuajhvzkl6wn, haMJHE2hWj1dbNjXDyLpEZyrcKVe0, cdbtq4hwzbb2eaycp)) {
                            break;
                            break;
                        }
                    } else {
                        thVekpFI4d1Nc4fakF = null;
                        if (thVekpFI4d1Nc4fakF != null) {
                            if (z2) {
                                delj4z0al3hcj3o1.pyu8ovAipBTLYAiKab(thVekpFI4d1Nc4fakF);
                            }
                            return xoey1fYV9aCBctS;
                        }
                        if (gmNWMfvn6zlEj(kzrg9uuajhvzkl6wn, haMJHE2hWj1dbNjXDyLpEZyrcKVe0, cdbtq4hwzbb2eaycp)) {
                            break;
                        }
                    }
                }
            }
        }
        return cdbtq4hwzbb2eaycp;
    }

    public final Object jdOQeRk37T35X5xKW1P(Object obj, Object obj2) {
        if (!(obj instanceof kZrG9UUAjHVzkL6Wn)) {
            return jb8et6SZeK5TWMrJFxDX.w9sT1Swbhx3hs;
        }
        if (((obj instanceof UqEmA2FQjHiILndJMDn4) || (obj instanceof kQNfMPvAFgenoBAn)) && !(obj instanceof ktPuRg8fuhlhDbufjD) && !(obj2 instanceof JQrj25Jykd1wBwb)) {
            kZrG9UUAjHVzkL6Wn kzrg9uuajhvzkl6wn = (kZrG9UUAjHVzkL6Wn) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w9sT1Swbhx3hs;
            Object dI9mjYyYGHOmxGOw = obj2 instanceof kZrG9UUAjHVzkL6Wn ? new DI9mjYyYGHOmxGOw((kZrG9UUAjHVzkL6Wn) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, kzrg9uuajhvzkl6wn, dI9mjYyYGHOmxGOw)) {
                if (atomicReferenceFieldUpdater.get(this) != kzrg9uuajhvzkl6wn) {
                    return jb8et6SZeK5TWMrJFxDX.JXn4Qf7zpnLjP5;
                }
            }
            euF5Udt5Rqv3Qmea(obj2);
            l1V0lQr6TbwNKqHfXNbb(kzrg9uuajhvzkl6wn, obj2);
            return obj2;
        }
        kZrG9UUAjHVzkL6Wn kzrg9uuajhvzkl6wn2 = (kZrG9UUAjHVzkL6Wn) obj;
        HaMJHE2hWj1dbNj haMJHE2hWj1dbNjO2DHNSIGZlgPja7eqLgn = O2DHNSIGZlgPja7eqLgn(kzrg9uuajhvzkl6wn2);
        if (haMJHE2hWj1dbNjO2DHNSIGZlgPja7eqLgn == null) {
            return jb8et6SZeK5TWMrJFxDX.JXn4Qf7zpnLjP5;
        }
        ktPuRg8fuhlhDbufjD ktpurg8fuhlhdbufjdK84rwRrqzhrNQ1CdNQ9 = null;
        vauyoRPQP1X13bGh vauyorpqp1x13bgh = kzrg9uuajhvzkl6wn2 instanceof vauyoRPQP1X13bGh ? (vauyoRPQP1X13bGh) kzrg9uuajhvzkl6wn2 : null;
        if (vauyorpqp1x13bgh == null) {
            vauyorpqp1x13bgh = new vauyoRPQP1X13bGh(haMJHE2hWj1dbNjO2DHNSIGZlgPja7eqLgn, null);
        }
        synchronized (vauyorpqp1x13bgh) {
            if (vauyorpqp1x13bgh.Ee8d2j4S9Vm5yGuR()) {
                return jb8et6SZeK5TWMrJFxDX.w9sT1Swbhx3hs;
            }
            vauyoRPQP1X13bGh.vekpFI4d1Nc4fakF.set(vauyorpqp1x13bgh, 1);
            if (vauyorpqp1x13bgh != kzrg9uuajhvzkl6wn2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = w9sT1Swbhx3hs;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, kzrg9uuajhvzkl6wn2, vauyorpqp1x13bgh)) {
                    if (atomicReferenceFieldUpdater2.get(this) != kzrg9uuajhvzkl6wn2) {
                        return jb8et6SZeK5TWMrJFxDX.JXn4Qf7zpnLjP5;
                    }
                }
            }
            boolean zJXn4Qf7zpnLjP5 = vauyorpqp1x13bgh.JXn4Qf7zpnLjP5();
            JQrj25Jykd1wBwb jQrj25Jykd1wBwb = obj2 instanceof JQrj25Jykd1wBwb ? (JQrj25Jykd1wBwb) obj2 : null;
            if (jQrj25Jykd1wBwb != null) {
                vauyorpqp1x13bgh.w9sT1Swbhx3hs(jQrj25Jykd1wBwb.dDIMxZXP1V8HdM);
            }
            Throwable thVekpFI4d1Nc4fakF = vauyorpqp1x13bgh.vekpFI4d1Nc4fakF();
            if (zJXn4Qf7zpnLjP5) {
                thVekpFI4d1Nc4fakF = null;
            }
            if (thVekpFI4d1Nc4fakF != null) {
                A1BaTVAMeIXMnh(haMJHE2hWj1dbNjO2DHNSIGZlgPja7eqLgn, thVekpFI4d1Nc4fakF);
            }
            ktPuRg8fuhlhDbufjD ktpurg8fuhlhdbufjd = kzrg9uuajhvzkl6wn2 instanceof ktPuRg8fuhlhDbufjD ? (ktPuRg8fuhlhDbufjD) kzrg9uuajhvzkl6wn2 : null;
            if (ktpurg8fuhlhdbufjd == null) {
                HaMJHE2hWj1dbNj haMJHE2hWj1dbNjXDyLpEZyrcKVe0 = kzrg9uuajhvzkl6wn2.xDyLpEZyrcKVe0();
                if (haMJHE2hWj1dbNjXDyLpEZyrcKVe0 != null) {
                    ktpurg8fuhlhdbufjdK84rwRrqzhrNQ1CdNQ9 = k84rwRrqzhrNQ1CdNQ9(haMJHE2hWj1dbNjXDyLpEZyrcKVe0);
                }
            } else {
                ktpurg8fuhlhdbufjdK84rwRrqzhrNQ1CdNQ9 = ktpurg8fuhlhdbufjd;
            }
            if (ktpurg8fuhlhdbufjdK84rwRrqzhrNQ1CdNQ9 != null) {
                while (ktpurg8fuhlhdbufjdK84rwRrqzhrNQ1CdNQ9.xDyLpEZyrcKVe0.iUQk66nAiXgO35((2 & 1) == 0, (2 & 2) != 0, new RQ1T5qaLxfet05yNYnaI(this, vauyorpqp1x13bgh, ktpurg8fuhlhdbufjdK84rwRrqzhrNQ1CdNQ9, obj2)) == PsPmgmnXrw1g4Kki.w9sT1Swbhx3hs) {
                    ktpurg8fuhlhdbufjdK84rwRrqzhrNQ1CdNQ9 = k84rwRrqzhrNQ1CdNQ9(ktpurg8fuhlhdbufjdK84rwRrqzhrNQ1CdNQ9);
                    if (ktpurg8fuhlhdbufjdK84rwRrqzhrNQ1CdNQ9 == null) {
                    }
                }
                return jb8et6SZeK5TWMrJFxDX.vekpFI4d1Nc4fakF;
            }
            return dTS0S7eC32ubQH54j36(vauyorpqp1x13bgh, obj2);
        }
    }

    public final void l1V0lQr6TbwNKqHfXNbb(kZrG9UUAjHVzkL6Wn kzrg9uuajhvzkl6wn, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = vekpFI4d1Nc4fakF;
        REYtCCgA2asIVSIAP7 rEYtCCgA2asIVSIAP7 = (REYtCCgA2asIVSIAP7) atomicReferenceFieldUpdater.get(this);
        if (rEYtCCgA2asIVSIAP7 != null) {
            rEYtCCgA2asIVSIAP7.vekpFI4d1Nc4fakF();
            atomicReferenceFieldUpdater.set(this, PsPmgmnXrw1g4Kki.w9sT1Swbhx3hs);
        }
        Sb7Xj3N9U1DQ sb7Xj3N9U1DQ = null;
        JQrj25Jykd1wBwb jQrj25Jykd1wBwb = obj instanceof JQrj25Jykd1wBwb ? (JQrj25Jykd1wBwb) obj : null;
        Throwable th = jQrj25Jykd1wBwb != null ? jQrj25Jykd1wBwb.dDIMxZXP1V8HdM : null;
        if (kzrg9uuajhvzkl6wn instanceof kQNfMPvAFgenoBAn) {
            try {
                ((kQNfMPvAFgenoBAn) kzrg9uuajhvzkl6wn).wotphlvK9sPbXJ(th);
                return;
            } catch (Throwable th2) {
                fivkjwgu2UdAtiY(new Sb7Xj3N9U1DQ("Exception in completion handler " + kzrg9uuajhvzkl6wn + " for " + this, th2));
                return;
            }
        }
        HaMJHE2hWj1dbNj haMJHE2hWj1dbNjXDyLpEZyrcKVe0 = kzrg9uuajhvzkl6wn.xDyLpEZyrcKVe0();
        if (haMJHE2hWj1dbNjXDyLpEZyrcKVe0 != null) {
            for (qgQwIhtTRQZkWPNc qgqwihttrqzkwpncGmNWMfvn6zlEj = (qgQwIhtTRQZkWPNc) haMJHE2hWj1dbNjXDyLpEZyrcKVe0.hjneShqpF9Tis4(); !qgqwihttrqzkwpncGmNWMfvn6zlEj.equals(haMJHE2hWj1dbNjXDyLpEZyrcKVe0); qgqwihttrqzkwpncGmNWMfvn6zlEj = qgqwihttrqzkwpncGmNWMfvn6zlEj.gmNWMfvn6zlEj()) {
                if (qgqwihttrqzkwpncGmNWMfvn6zlEj instanceof kQNfMPvAFgenoBAn) {
                    kQNfMPvAFgenoBAn kqnfmpvafgenoban = (kQNfMPvAFgenoBAn) qgqwihttrqzkwpncGmNWMfvn6zlEj;
                    try {
                        kqnfmpvafgenoban.wotphlvK9sPbXJ(th);
                    } catch (Throwable th3) {
                        if (sb7Xj3N9U1DQ != null) {
                            RIZfHbqXpth8r2yN4.dDIMxZXP1V8HdM(sb7Xj3N9U1DQ, th3);
                        } else {
                            sb7Xj3N9U1DQ = new Sb7Xj3N9U1DQ("Exception in completion handler " + kqnfmpvafgenoban + " for " + this, th3);
                        }
                    }
                }
            }
            if (sb7Xj3N9U1DQ != null) {
                fivkjwgu2UdAtiY(sb7Xj3N9U1DQ);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:? A[LOOP:2: B:59:0x00c4->B:101:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x0041 A[PHI: r0
      0x0041: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v12 java.lang.Object) binds: [B:3:0x0008, B:16:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    /* JADX WARN: Code duplicated, block: B:29:0x0068 A[Catch: all -> 0x006e, TRY_LEAVE, TryCatch #0 {, blocks: (B:24:0x0052, B:29:0x0068, B:34:0x0070, B:40:0x0088, B:38:0x007e, B:39:0x0082), top: B:84:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0070 A[Catch: all -> 0x006e, TRY_ENTER, TryCatch #0 {, blocks: (B:24:0x0052, B:29:0x0068, B:34:0x0070, B:40:0x0088, B:38:0x007e, B:39:0x0082), top: B:84:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x007e A[Catch: all -> 0x006e, TryCatch #0 {, blocks: (B:24:0x0052, B:29:0x0068, B:34:0x0070, B:40:0x0088, B:38:0x007e, B:39:0x0082), top: B:84:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0091  */
    /* JADX WARN: Code duplicated, block: B:45:0x0095  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:81:0x0118 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:82:0x0119  */
    /* JADX WARN: Code duplicated, block: B:84:0x0052 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x0045, please report this as an issue */
    public final boolean nQilHWaqS401ZtR(Object obj) {
        Throwable thK7eEOBPYP9VIoHWTe;
        Object objXfn2GJwmGqs7kWW;
        boolean z;
        Throwable thVekpFI4d1Nc4fakF;
        o0rN3ekjBJ6kKwok o0rn3ekjbj6kkwok;
        kZrG9UUAjHVzkL6Wn kzrg9uuajhvzkl6wn;
        HaMJHE2hWj1dbNj haMJHE2hWj1dbNjO2DHNSIGZlgPja7eqLgn;
        vauyoRPQP1X13bGh vauyorpqp1x13bgh;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object objJdOQeRk37T35X5xKW1P;
        Object objJdOQeRk37T35X5xKW1P2 = jb8et6SZeK5TWMrJFxDX.w9sT1Swbhx3hs;
        if (rCHnHJBAlOpNI5()) {
            do {
                Object objXfn2GJwmGqs7kWW2 = xfn2GJwmGqs7kWW();
                if (!(objXfn2GJwmGqs7kWW2 instanceof kZrG9UUAjHVzkL6Wn) || ((objXfn2GJwmGqs7kWW2 instanceof vauyoRPQP1X13bGh) && ((vauyoRPQP1X13bGh) objXfn2GJwmGqs7kWW2).Ee8d2j4S9Vm5yGuR())) {
                    objJdOQeRk37T35X5xKW1P2 = jb8et6SZeK5TWMrJFxDX.w9sT1Swbhx3hs;
                    break;
                }
                objJdOQeRk37T35X5xKW1P2 = jdOQeRk37T35X5xKW1P(objXfn2GJwmGqs7kWW2, new JQrj25Jykd1wBwb(K7eEOBPYP9VIoHWTe(obj), false));
            } while (objJdOQeRk37T35X5xKW1P2 == jb8et6SZeK5TWMrJFxDX.JXn4Qf7zpnLjP5);
            if (objJdOQeRk37T35X5xKW1P2 != jb8et6SZeK5TWMrJFxDX.vekpFI4d1Nc4fakF) {
                if (objJdOQeRk37T35X5xKW1P2 == jb8et6SZeK5TWMrJFxDX.w9sT1Swbhx3hs) {
                    thK7eEOBPYP9VIoHWTe = null;
                    loop1: while (true) {
                        objXfn2GJwmGqs7kWW = xfn2GJwmGqs7kWW();
                        if (objXfn2GJwmGqs7kWW instanceof vauyoRPQP1X13bGh) {
                            synchronized (objXfn2GJwmGqs7kWW) {
                                if (vauyoRPQP1X13bGh.Ee8d2j4S9Vm5yGuR.get((vauyoRPQP1X13bGh) objXfn2GJwmGqs7kWW) == jb8et6SZeK5TWMrJFxDX.xDyLpEZyrcKVe0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    o0rn3ekjbj6kkwok = jb8et6SZeK5TWMrJFxDX.Ee8d2j4S9Vm5yGuR;
                                } else {
                                    boolean zJXn4Qf7zpnLjP5 = ((vauyoRPQP1X13bGh) objXfn2GJwmGqs7kWW).JXn4Qf7zpnLjP5();
                                    if (obj == null || !zJXn4Qf7zpnLjP5) {
                                        if (thK7eEOBPYP9VIoHWTe == null) {
                                            thK7eEOBPYP9VIoHWTe = K7eEOBPYP9VIoHWTe(obj);
                                        }
                                        ((vauyoRPQP1X13bGh) objXfn2GJwmGqs7kWW).w9sT1Swbhx3hs(thK7eEOBPYP9VIoHWTe);
                                    }
                                    thVekpFI4d1Nc4fakF = zJXn4Qf7zpnLjP5 ? null : ((vauyoRPQP1X13bGh) objXfn2GJwmGqs7kWW).vekpFI4d1Nc4fakF();
                                    if (thVekpFI4d1Nc4fakF != null) {
                                        A1BaTVAMeIXMnh(((vauyoRPQP1X13bGh) objXfn2GJwmGqs7kWW).w9sT1Swbhx3hs, thVekpFI4d1Nc4fakF);
                                    }
                                    o0rn3ekjbj6kkwok = jb8et6SZeK5TWMrJFxDX.w9sT1Swbhx3hs;
                                }
                            }
                        } else if (objXfn2GJwmGqs7kWW instanceof kZrG9UUAjHVzkL6Wn) {
                            if (thK7eEOBPYP9VIoHWTe == null) {
                                thK7eEOBPYP9VIoHWTe = K7eEOBPYP9VIoHWTe(obj);
                            }
                            kzrg9uuajhvzkl6wn = (kZrG9UUAjHVzkL6Wn) objXfn2GJwmGqs7kWW;
                            if (kzrg9uuajhvzkl6wn.dDIMxZXP1V8HdM()) {
                                haMJHE2hWj1dbNjO2DHNSIGZlgPja7eqLgn = O2DHNSIGZlgPja7eqLgn(kzrg9uuajhvzkl6wn);
                                if (haMJHE2hWj1dbNjO2DHNSIGZlgPja7eqLgn == null) {
                                    continue;
                                } else {
                                    vauyorpqp1x13bgh = new vauyoRPQP1X13bGh(haMJHE2hWj1dbNjO2DHNSIGZlgPja7eqLgn, thK7eEOBPYP9VIoHWTe);
                                    atomicReferenceFieldUpdater = w9sT1Swbhx3hs;
                                    while (true) {
                                        if (atomicReferenceFieldUpdater.compareAndSet(this, kzrg9uuajhvzkl6wn, vauyorpqp1x13bgh)) {
                                            A1BaTVAMeIXMnh(haMJHE2hWj1dbNjO2DHNSIGZlgPja7eqLgn, thK7eEOBPYP9VIoHWTe);
                                            o0rn3ekjbj6kkwok = jb8et6SZeK5TWMrJFxDX.w9sT1Swbhx3hs;
                                        } else if (atomicReferenceFieldUpdater.get(this) != kzrg9uuajhvzkl6wn) {
                                        }
                                    }
                                }
                            } else {
                                objJdOQeRk37T35X5xKW1P = jdOQeRk37T35X5xKW1P(objXfn2GJwmGqs7kWW, new JQrj25Jykd1wBwb(thK7eEOBPYP9VIoHWTe, false));
                                if (objJdOQeRk37T35X5xKW1P != jb8et6SZeK5TWMrJFxDX.w9sT1Swbhx3hs) {
                                    throw new IllegalStateException(("Cannot happen in " + objXfn2GJwmGqs7kWW).toString());
                                }
                                if (objJdOQeRk37T35X5xKW1P != jb8et6SZeK5TWMrJFxDX.JXn4Qf7zpnLjP5) {
                                    objJdOQeRk37T35X5xKW1P2 = objJdOQeRk37T35X5xKW1P;
                                    break;
                                }
                            }
                        } else {
                            o0rn3ekjbj6kkwok = jb8et6SZeK5TWMrJFxDX.Ee8d2j4S9Vm5yGuR;
                        }
                        objJdOQeRk37T35X5xKW1P2 = o0rn3ekjbj6kkwok;
                        break;
                    }
                }
                if (objJdOQeRk37T35X5xKW1P2 != jb8et6SZeK5TWMrJFxDX.w9sT1Swbhx3hs && objJdOQeRk37T35X5xKW1P2 != jb8et6SZeK5TWMrJFxDX.vekpFI4d1Nc4fakF) {
                    if (objJdOQeRk37T35X5xKW1P2 == jb8et6SZeK5TWMrJFxDX.Ee8d2j4S9Vm5yGuR) {
                        return false;
                    }
                    gIIiyi2ddlMDR0(objJdOQeRk37T35X5xKW1P2);
                    return true;
                }
            }
        } else {
            if (objJdOQeRk37T35X5xKW1P2 == jb8et6SZeK5TWMrJFxDX.w9sT1Swbhx3hs) {
                thK7eEOBPYP9VIoHWTe = null;
                loop1: while (true) {
                    objXfn2GJwmGqs7kWW = xfn2GJwmGqs7kWW();
                    if (objXfn2GJwmGqs7kWW instanceof vauyoRPQP1X13bGh) {
                        synchronized (objXfn2GJwmGqs7kWW) {
                            if (vauyoRPQP1X13bGh.Ee8d2j4S9Vm5yGuR.get((vauyoRPQP1X13bGh) objXfn2GJwmGqs7kWW) == jb8et6SZeK5TWMrJFxDX.xDyLpEZyrcKVe0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                o0rn3ekjbj6kkwok = jb8et6SZeK5TWMrJFxDX.Ee8d2j4S9Vm5yGuR;
                            } else {
                                boolean zJXn4Qf7zpnLjP6 = ((vauyoRPQP1X13bGh) objXfn2GJwmGqs7kWW).JXn4Qf7zpnLjP5();
                                if (obj == null) {
                                    if (thK7eEOBPYP9VIoHWTe == null) {
                                        thK7eEOBPYP9VIoHWTe = K7eEOBPYP9VIoHWTe(obj);
                                    }
                                    ((vauyoRPQP1X13bGh) objXfn2GJwmGqs7kWW).w9sT1Swbhx3hs(thK7eEOBPYP9VIoHWTe);
                                } else {
                                    if (thK7eEOBPYP9VIoHWTe == null) {
                                        thK7eEOBPYP9VIoHWTe = K7eEOBPYP9VIoHWTe(obj);
                                    }
                                    ((vauyoRPQP1X13bGh) objXfn2GJwmGqs7kWW).w9sT1Swbhx3hs(thK7eEOBPYP9VIoHWTe);
                                }
                                if (zJXn4Qf7zpnLjP6) {
                                }
                                if (thVekpFI4d1Nc4fakF != null) {
                                    A1BaTVAMeIXMnh(((vauyoRPQP1X13bGh) objXfn2GJwmGqs7kWW).w9sT1Swbhx3hs, thVekpFI4d1Nc4fakF);
                                }
                                o0rn3ekjbj6kkwok = jb8et6SZeK5TWMrJFxDX.w9sT1Swbhx3hs;
                            }
                        }
                    } else if (objXfn2GJwmGqs7kWW instanceof kZrG9UUAjHVzkL6Wn) {
                        if (thK7eEOBPYP9VIoHWTe == null) {
                            thK7eEOBPYP9VIoHWTe = K7eEOBPYP9VIoHWTe(obj);
                        }
                        kzrg9uuajhvzkl6wn = (kZrG9UUAjHVzkL6Wn) objXfn2GJwmGqs7kWW;
                        if (kzrg9uuajhvzkl6wn.dDIMxZXP1V8HdM()) {
                            haMJHE2hWj1dbNjO2DHNSIGZlgPja7eqLgn = O2DHNSIGZlgPja7eqLgn(kzrg9uuajhvzkl6wn);
                            if (haMJHE2hWj1dbNjO2DHNSIGZlgPja7eqLgn == null) {
                                continue;
                            } else {
                                vauyorpqp1x13bgh = new vauyoRPQP1X13bGh(haMJHE2hWj1dbNjO2DHNSIGZlgPja7eqLgn, thK7eEOBPYP9VIoHWTe);
                                atomicReferenceFieldUpdater = w9sT1Swbhx3hs;
                                while (true) {
                                    if (atomicReferenceFieldUpdater.compareAndSet(this, kzrg9uuajhvzkl6wn, vauyorpqp1x13bgh)) {
                                        A1BaTVAMeIXMnh(haMJHE2hWj1dbNjO2DHNSIGZlgPja7eqLgn, thK7eEOBPYP9VIoHWTe);
                                        o0rn3ekjbj6kkwok = jb8et6SZeK5TWMrJFxDX.w9sT1Swbhx3hs;
                                    } else if (atomicReferenceFieldUpdater.get(this) != kzrg9uuajhvzkl6wn) {
                                    }
                                }
                            }
                        } else {
                            objJdOQeRk37T35X5xKW1P = jdOQeRk37T35X5xKW1P(objXfn2GJwmGqs7kWW, new JQrj25Jykd1wBwb(thK7eEOBPYP9VIoHWTe, false));
                            if (objJdOQeRk37T35X5xKW1P != jb8et6SZeK5TWMrJFxDX.w9sT1Swbhx3hs) {
                                throw new IllegalStateException(("Cannot happen in " + objXfn2GJwmGqs7kWW).toString());
                            }
                            if (objJdOQeRk37T35X5xKW1P != jb8et6SZeK5TWMrJFxDX.JXn4Qf7zpnLjP5) {
                                objJdOQeRk37T35X5xKW1P2 = objJdOQeRk37T35X5xKW1P;
                                break;
                            }
                        }
                    } else {
                        o0rn3ekjbj6kkwok = jb8et6SZeK5TWMrJFxDX.Ee8d2j4S9Vm5yGuR;
                    }
                    objJdOQeRk37T35X5xKW1P2 = o0rn3ekjbj6kkwok;
                    break;
                }
            }
            if (objJdOQeRk37T35X5xKW1P2 != jb8et6SZeK5TWMrJFxDX.w9sT1Swbhx3hs) {
                if (objJdOQeRk37T35X5xKW1P2 == jb8et6SZeK5TWMrJFxDX.Ee8d2j4S9Vm5yGuR) {
                    return false;
                }
                gIIiyi2ddlMDR0(objJdOQeRk37T35X5xKW1P2);
                return true;
            }
        }
        return true;
    }

    public void qfTrc75xwRVMl85vh() {
    }

    public boolean rCHnHJBAlOpNI5() {
        return false;
    }

    public boolean tne6mXOUFKdd(Throwable th) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [char, int] */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + ((char) (177 - 54)) + VEkRsTDS6a9oHWI(xfn2GJwmGqs7kWW()) + '}');
        sb.append('@');
        sb.append(gA5gCwTK0qjTIn.pyu8ovAipBTLYAiKab(this));
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public boolean vIJudZvPyTuNp() {
        return (-88) + 89;
    }

    @Override // v.s.WGrwEyVqR28VYxamRhIg
    public void vekpFI4d1Nc4fakF(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new vHgVg4NkL4VdR4ndb1m(XiR1pIn5878vVWd(), null, this);
        }
        J0zjQ7CAgohuxU20eCW6(cancellationException);
    }

    public void wotphlvK9sPbXJ(Object obj) {
        gIIiyi2ddlMDR0(obj);
    }

    public final Object xfn2GJwmGqs7kWW() {
        while (true) {
            Object obj = w9sT1Swbhx3hs.get(this);
            if (!(obj instanceof GRPcLaQWtuGXi1HP7)) {
                return obj;
            }
            ((GRPcLaQWtuGXi1HP7) obj).dDIMxZXP1V8HdM(this);
        }
    }

    public final CancellationException yTljMGnIibTRdOpSh4() {
        CancellationException cancellationException;
        Object objXfn2GJwmGqs7kWW = xfn2GJwmGqs7kWW();
        if (!(objXfn2GJwmGqs7kWW instanceof vauyoRPQP1X13bGh)) {
            if (objXfn2GJwmGqs7kWW instanceof kZrG9UUAjHVzkL6Wn) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(objXfn2GJwmGqs7kWW instanceof JQrj25Jykd1wBwb)) {
                return new vHgVg4NkL4VdR4ndb1m(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((JQrj25Jykd1wBwb) objXfn2GJwmGqs7kWW).dDIMxZXP1V8HdM;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new vHgVg4NkL4VdR4ndb1m(XiR1pIn5878vVWd(), th, this) : cancellationException;
        }
        Throwable thVekpFI4d1Nc4fakF = ((vauyoRPQP1X13bGh) objXfn2GJwmGqs7kWW).vekpFI4d1Nc4fakF();
        if (thVekpFI4d1Nc4fakF == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thVekpFI4d1Nc4fakF instanceof CancellationException ? (CancellationException) thVekpFI4d1Nc4fakF : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = XiR1pIn5878vVWd();
        }
        return new vHgVg4NkL4VdR4ndb1m(strConcat, thVekpFI4d1Nc4fakF, this);
    }
}
