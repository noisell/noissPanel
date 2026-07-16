package v.s;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class Xmmn1A4TQOiVOB {
    public static final AtomicIntegerFieldUpdater JXn4Qf7zpnLjP5;
    private volatile int _availablePermits;
    public final vekpFI4d1Nc4fakF dDIMxZXP1V8HdM;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;
    public static final AtomicReferenceFieldUpdater w9sT1Swbhx3hs = AtomicReferenceFieldUpdater.newUpdater(Xmmn1A4TQOiVOB.class, Object.class, "head");
    public static final AtomicLongFieldUpdater vekpFI4d1Nc4fakF = AtomicLongFieldUpdater.newUpdater(Xmmn1A4TQOiVOB.class, "deqIdx");

    static {
        AtomicReferenceFieldUpdater.newUpdater(Xmmn1A4TQOiVOB.class, Object.class, "tail");
        AtomicLongFieldUpdater.newUpdater(Xmmn1A4TQOiVOB.class, "enqIdx");
        JXn4Qf7zpnLjP5 = AtomicIntegerFieldUpdater.newUpdater(Xmmn1A4TQOiVOB.class, "_availablePermits");
    }

    public Xmmn1A4TQOiVOB() {
        CJ36UJ7QoEqIeR4 cJ36UJ7QoEqIeR4 = new CJ36UJ7QoEqIeR4(0L, null, 2);
        this.head = cJ36UJ7QoEqIeR4;
        this.tail = cJ36UJ7QoEqIeR4;
        this._availablePermits = 1;
        this.dDIMxZXP1V8HdM = new vekpFI4d1Nc4fakF(3, this);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0085  */
    public final void dDIMxZXP1V8HdM() {
        int i;
        int i2;
        Object objGIIiyi2ddlMDR0;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = JXn4Qf7zpnLjP5;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            i = (-40) + 41;
            if (andIncrement >= i) {
                do {
                    i2 = atomicIntegerFieldUpdater.get(this);
                    if (i2 <= i) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, i));
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w9sT1Swbhx3hs;
            CJ36UJ7QoEqIeR4 cJ36UJ7QoEqIeR4 = (CJ36UJ7QoEqIeR4) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = vekpFI4d1Nc4fakF.getAndIncrement(this);
            long j = andIncrement2 / ((long) UycVpZTyzvcK9Q8ao.xDyLpEZyrcKVe0);
            skC8q30OEAwekSKIDt skc8q30oeawekskidt = skC8q30OEAwekSKIDt.D5P1xCAyuvgF;
            while (true) {
                objGIIiyi2ddlMDR0 = SbxdZ6Kq2uhHQ5RPRqm.gIIiyi2ddlMDR0(cJ36UJ7QoEqIeR4, j, skc8q30oeawekskidt);
                if (!y6jRGLEWNMir.ibVTtJUNfrGYbW(objGIIiyi2ddlMDR0)) {
                    endHZiILsQwz endhziilsqwzXDyLpEZyrcKVe0 = y6jRGLEWNMir.xDyLpEZyrcKVe0(objGIIiyi2ddlMDR0);
                    while (true) {
                        endHZiILsQwz endhziilsqwz = (endHZiILsQwz) atomicReferenceFieldUpdater.get(this);
                        if (endhziilsqwz.JXn4Qf7zpnLjP5 >= endhziilsqwzXDyLpEZyrcKVe0.JXn4Qf7zpnLjP5) {
                            break;
                        }
                        if (!endhziilsqwzXDyLpEZyrcKVe0.pyu8ovAipBTLYAiKab()) {
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, endhziilsqwz, endhziilsqwzXDyLpEZyrcKVe0)) {
                                if (!endhziilsqwz.Ee8d2j4S9Vm5yGuR()) {
                                    break;
                                }
                                endhziilsqwz.JXn4Qf7zpnLjP5();
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == endhziilsqwz);
                        if (endhziilsqwzXDyLpEZyrcKVe0.Ee8d2j4S9Vm5yGuR()) {
                            endhziilsqwzXDyLpEZyrcKVe0.JXn4Qf7zpnLjP5();
                        }
                    }
                } else {
                    break;
                }
            }
            CJ36UJ7QoEqIeR4 cJ36UJ7QoEqIeR5 = (CJ36UJ7QoEqIeR4) y6jRGLEWNMir.xDyLpEZyrcKVe0(objGIIiyi2ddlMDR0);
            AtomicReferenceArray atomicReferenceArray = cJ36UJ7QoEqIeR5.xDyLpEZyrcKVe0;
            cJ36UJ7QoEqIeR5.dDIMxZXP1V8HdM();
            int i3 = 0;
            if (cJ36UJ7QoEqIeR5.JXn4Qf7zpnLjP5 <= j) {
                int i4 = (int) (andIncrement2 % ((long) UycVpZTyzvcK9Q8ao.xDyLpEZyrcKVe0));
                Object andSet = atomicReferenceArray.getAndSet(i4, UycVpZTyzvcK9Q8ao.w9sT1Swbhx3hs);
                if (andSet == null) {
                    int i5 = UycVpZTyzvcK9Q8ao.dDIMxZXP1V8HdM;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= i5) {
                            o0rN3ekjBJ6kKwok o0rn3ekjbj6kkwok = UycVpZTyzvcK9Q8ao.w9sT1Swbhx3hs;
                            o0rN3ekjBJ6kKwok o0rn3ekjbj6kkwok2 = UycVpZTyzvcK9Q8ao.JXn4Qf7zpnLjP5;
                            do {
                                if (atomicReferenceArray.compareAndSet(i4, o0rn3ekjbj6kkwok, o0rn3ekjbj6kkwok2)) {
                                    i3 = i;
                                    break;
                                }
                            } while (atomicReferenceArray.get(i4) == o0rn3ekjbj6kkwok);
                            i ^= i3;
                            break;
                        }
                        if (atomicReferenceArray.get(i4) == UycVpZTyzvcK9Q8ao.vekpFI4d1Nc4fakF) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                } else if (andSet == UycVpZTyzvcK9Q8ao.Ee8d2j4S9Vm5yGuR) {
                    i = 0;
                } else {
                    if (!(andSet instanceof wxzKGhimDkb70lgmfb69)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    hD886kxBkce8U hd886kxbkce8u = (hD886kxBkce8U) ((wxzKGhimDkb70lgmfb69) andSet);
                    if (hd886kxbkce8u.rCHnHJBAlOpNI5(Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM, this.dDIMxZXP1V8HdM) != null) {
                        hd886kxbkce8u.nQilHWaqS401ZtR(hd886kxbkce8u.JXn4Qf7zpnLjP5);
                    } else {
                        i = 0;
                    }
                }
            } else {
                i = 0;
            }
        } while (i == 0);
    }
}
