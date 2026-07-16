package v.s;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class vauyoRPQP1X13bGh implements kZrG9UUAjHVzkL6Wn {
    private volatile Object _exceptionsHolder;
    private volatile int _isCompleting = 0;
    private volatile Object _rootCause;
    public final HaMJHE2hWj1dbNj w9sT1Swbhx3hs;
    public static final AtomicIntegerFieldUpdater vekpFI4d1Nc4fakF = AtomicIntegerFieldUpdater.newUpdater(vauyoRPQP1X13bGh.class, "_isCompleting");
    public static final AtomicReferenceFieldUpdater JXn4Qf7zpnLjP5 = AtomicReferenceFieldUpdater.newUpdater(vauyoRPQP1X13bGh.class, Object.class, "_rootCause");
    public static final AtomicReferenceFieldUpdater Ee8d2j4S9Vm5yGuR = AtomicReferenceFieldUpdater.newUpdater(vauyoRPQP1X13bGh.class, Object.class, "_exceptionsHolder");

    public vauyoRPQP1X13bGh(HaMJHE2hWj1dbNj haMJHE2hWj1dbNj, Throwable th) {
        this.w9sT1Swbhx3hs = haMJHE2hWj1dbNj;
        this._rootCause = th;
    }

    private static /* synthetic */ void ipyalln() {
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    public final boolean Ee8d2j4S9Vm5yGuR() {
        if (vekpFI4d1Nc4fakF.get(this) != 0) {
            return 13 - 12;
        }
        return false;
    }

    public final boolean JXn4Qf7zpnLjP5() {
        return vekpFI4d1Nc4fakF() != null;
    }

    @Override // v.s.kZrG9UUAjHVzkL6Wn
    public final boolean dDIMxZXP1V8HdM() {
        return vekpFI4d1Nc4fakF() == null;
    }

    public final ArrayList ibVTtJUNfrGYbW(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Ee8d2j4S9Vm5yGuR;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            arrayList = (ArrayList) obj;
        }
        Throwable thVekpFI4d1Nc4fakF = vekpFI4d1Nc4fakF();
        if (thVekpFI4d1Nc4fakF != null) {
            arrayList.add(0, thVekpFI4d1Nc4fakF);
        }
        if (th != null && !th.equals(thVekpFI4d1Nc4fakF)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, jb8et6SZeK5TWMrJFxDX.xDyLpEZyrcKVe0);
        return arrayList;
    }

    public final String toString() {
        return "Finishing[cancelling=" + JXn4Qf7zpnLjP5() + ", completing=" + Ee8d2j4S9Vm5yGuR() + ", rootCause=" + vekpFI4d1Nc4fakF() + ", exceptions=" + Ee8d2j4S9Vm5yGuR.get(this) + ", list=" + this.w9sT1Swbhx3hs + ']';
    }

    public final Throwable vekpFI4d1Nc4fakF() {
        return (Throwable) JXn4Qf7zpnLjP5.get(this);
    }

    public final void w9sT1Swbhx3hs(Throwable th) {
        Throwable thVekpFI4d1Nc4fakF = vekpFI4d1Nc4fakF();
        if (thVekpFI4d1Nc4fakF == null) {
            JXn4Qf7zpnLjP5.set(this, th);
            return;
        }
        if (th == thVekpFI4d1Nc4fakF) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Ee8d2j4S9Vm5yGuR;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
                return;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
        if (th == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }

    @Override // v.s.kZrG9UUAjHVzkL6Wn
    public final HaMJHE2hWj1dbNj xDyLpEZyrcKVe0() {
        return this.w9sT1Swbhx3hs;
    }
}
