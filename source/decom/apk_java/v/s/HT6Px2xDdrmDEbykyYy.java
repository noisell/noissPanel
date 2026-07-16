package v.s;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class HT6Px2xDdrmDEbykyYy implements OXZJw8mg0hnX {
    private volatile Object _closeCause;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;
    public final int w9sT1Swbhx3hs;
    public static final AtomicLongFieldUpdater vekpFI4d1Nc4fakF = AtomicLongFieldUpdater.newUpdater(HT6Px2xDdrmDEbykyYy.class, "sendersAndCloseStatus");
    public static final AtomicLongFieldUpdater JXn4Qf7zpnLjP5 = AtomicLongFieldUpdater.newUpdater(HT6Px2xDdrmDEbykyYy.class, "receivers");
    public static final AtomicLongFieldUpdater Ee8d2j4S9Vm5yGuR = AtomicLongFieldUpdater.newUpdater(HT6Px2xDdrmDEbykyYy.class, "bufferEnd");
    public static final AtomicLongFieldUpdater xDyLpEZyrcKVe0 = AtomicLongFieldUpdater.newUpdater(HT6Px2xDdrmDEbykyYy.class, "completedExpandBuffersAndPauseFlag");
    public static final AtomicReferenceFieldUpdater ibVTtJUNfrGYbW = AtomicReferenceFieldUpdater.newUpdater(HT6Px2xDdrmDEbykyYy.class, Object.class, "sendSegment");
    public static final AtomicReferenceFieldUpdater b1EoSIRjJHO5 = AtomicReferenceFieldUpdater.newUpdater(HT6Px2xDdrmDEbykyYy.class, Object.class, "receiveSegment");
    public static final AtomicReferenceFieldUpdater pyu8ovAipBTLYAiKab = AtomicReferenceFieldUpdater.newUpdater(HT6Px2xDdrmDEbykyYy.class, Object.class, "bufferEndSegment");
    public static final AtomicReferenceFieldUpdater D5P1xCAyuvgF = AtomicReferenceFieldUpdater.newUpdater(HT6Px2xDdrmDEbykyYy.class, Object.class, "_closeCause");
    public static final AtomicReferenceFieldUpdater hjneShqpF9Tis4 = AtomicReferenceFieldUpdater.newUpdater(HT6Px2xDdrmDEbykyYy.class, Object.class, "closeHandler");

    public HT6Px2xDdrmDEbykyYy(int i) {
        long j;
        this.w9sT1Swbhx3hs = i;
        if (i < 0) {
            throw new IllegalArgumentException(Y9mRyRdkl5FOcwb66V6.b1EoSIRjJHO5("Invalid channel capacity: ", ", should be >=0", i).toString());
        }
        J4oFIJEn5DDil2 j4oFIJEn5DDil2 = LYgmvfM6ccmccA0DV.dDIMxZXP1V8HdM;
        if (i != 0) {
            j = i != Integer.MAX_VALUE ? i : Long.MAX_VALUE;
        } else {
            j = 0;
        }
        this.bufferEnd = j;
        this.completedExpandBuffersAndPauseFlag = Ee8d2j4S9Vm5yGuR.get(this);
        J4oFIJEn5DDil2 j4oFIJEn5DDil3 = new J4oFIJEn5DDil2(0L, null, this, 3);
        this.sendSegment = j4oFIJEn5DDil3;
        this.receiveSegment = j4oFIJEn5DDil3;
        this.bufferEndSegment = l1V0lQr6TbwNKqHfXNbb() ? LYgmvfM6ccmccA0DV.dDIMxZXP1V8HdM : j4oFIJEn5DDil3;
        this._closeCause = LYgmvfM6ccmccA0DV.XiR1pIn5878vVWd;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public static Object EWUjsTERgdPbSw3NNlN(HT6Px2xDdrmDEbykyYy hT6Px2xDdrmDEbykyYy, CWIOrUfHtKyaxQib0W cWIOrUfHtKyaxQib0W) {
        cPviC34PlGFJQEfjCD4 cpvic34plgfjqefjcd4;
        J4oFIJEn5DDil2 j4oFIJEn5DDil2;
        if (cWIOrUfHtKyaxQib0W instanceof cPviC34PlGFJQEfjCD4) {
            cpvic34plgfjqefjcd4 = (cPviC34PlGFJQEfjCD4) cWIOrUfHtKyaxQib0W;
            int i = cpvic34plgfjqefjcd4.ibVTtJUNfrGYbW;
            if ((i & Integer.MIN_VALUE) != 0) {
                cpvic34plgfjqefjcd4.ibVTtJUNfrGYbW = i - Integer.MIN_VALUE;
            } else {
                cpvic34plgfjqefjcd4 = new cPviC34PlGFJQEfjCD4(hT6Px2xDdrmDEbykyYy, cWIOrUfHtKyaxQib0W);
            }
        } else {
            cpvic34plgfjqefjcd4 = new cPviC34PlGFJQEfjCD4(hT6Px2xDdrmDEbykyYy, cWIOrUfHtKyaxQib0W);
        }
        cPviC34PlGFJQEfjCD4 cpvic34plgfjqefjcd5 = cpvic34plgfjqefjcd4;
        Object obj = cpvic34plgfjqefjcd5.Ee8d2j4S9Vm5yGuR;
        int i2 = cpvic34plgfjqefjcd5.ibVTtJUNfrGYbW;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
            return ((F5LI90Tmwo1KQ) obj).dDIMxZXP1V8HdM;
        }
        SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
        J4oFIJEn5DDil2 j4oFIJEn5DDil3 = (J4oFIJEn5DDil2) b1EoSIRjJHO5.get(hT6Px2xDdrmDEbykyYy);
        while (!hT6Px2xDdrmDEbykyYy.XiR1pIn5878vVWd(vekpFI4d1Nc4fakF.get(hT6Px2xDdrmDEbykyYy), true)) {
            long andIncrement = JXn4Qf7zpnLjP5.getAndIncrement(hT6Px2xDdrmDEbykyYy);
            long j = LYgmvfM6ccmccA0DV.w9sT1Swbhx3hs;
            long j2 = andIncrement / j;
            int i3 = (int) (andIncrement % j);
            if (j4oFIJEn5DDil3.JXn4Qf7zpnLjP5 != j2) {
                J4oFIJEn5DDil2 j4oFIJEn5DDil2WotphlvK9sPbXJ = hT6Px2xDdrmDEbykyYy.wotphlvK9sPbXJ(j2, j4oFIJEn5DDil3);
                if (j4oFIJEn5DDil2WotphlvK9sPbXJ == null) {
                    continue;
                } else {
                    j4oFIJEn5DDil2 = j4oFIJEn5DDil2WotphlvK9sPbXJ;
                }
            } else {
                j4oFIJEn5DDil2 = j4oFIJEn5DDil3;
            }
            HT6Px2xDdrmDEbykyYy hT6Px2xDdrmDEbykyYy2 = hT6Px2xDdrmDEbykyYy;
            Object objXfn2GJwmGqs7kWW = hT6Px2xDdrmDEbykyYy2.xfn2GJwmGqs7kWW(j4oFIJEn5DDil2, i3, andIncrement, null);
            if (objXfn2GJwmGqs7kWW == LYgmvfM6ccmccA0DV.gIIiyi2ddlMDR0) {
                throw new IllegalStateException("unexpected");
            }
            if (objXfn2GJwmGqs7kWW != LYgmvfM6ccmccA0DV.Qrz92kRPw4GcghAc) {
                if (objXfn2GJwmGqs7kWW != LYgmvfM6ccmccA0DV.wotphlvK9sPbXJ) {
                    j4oFIJEn5DDil2.dDIMxZXP1V8HdM();
                    return objXfn2GJwmGqs7kWW;
                }
                cpvic34plgfjqefjcd5.ibVTtJUNfrGYbW = 1;
                Object objYTljMGnIibTRdOpSh4 = hT6Px2xDdrmDEbykyYy2.yTljMGnIibTRdOpSh4(j4oFIJEn5DDil2, i3, andIncrement, cpvic34plgfjqefjcd5);
                pjN1L01KDMWnPCy0daD pjn1l01kdmwnpcy0dad = pjN1L01KDMWnPCy0daD.w9sT1Swbhx3hs;
                return objYTljMGnIibTRdOpSh4 == pjn1l01kdmwnpcy0dad ? pjn1l01kdmwnpcy0dad : objYTljMGnIibTRdOpSh4;
            }
            if (andIncrement < hT6Px2xDdrmDEbykyYy2.J0zjQ7CAgohuxU20eCW6()) {
                j4oFIJEn5DDil2.dDIMxZXP1V8HdM();
            }
            j4oFIJEn5DDil3 = j4oFIJEn5DDil2;
            hT6Px2xDdrmDEbykyYy = hT6Px2xDdrmDEbykyYy2;
        }
        return new Jdyt6TPRBOj1K9aOy91D(hT6Px2xDdrmDEbykyYy.Qrz92kRPw4GcghAc());
    }

    public static final int Ee8d2j4S9Vm5yGuR(HT6Px2xDdrmDEbykyYy hT6Px2xDdrmDEbykyYy, J4oFIJEn5DDil2 j4oFIJEn5DDil2, int i, Object obj, long j, Object obj2, boolean z) {
        j4oFIJEn5DDil2.gIIiyi2ddlMDR0(i, obj);
        if (z) {
            return hT6Px2xDdrmDEbykyYy.tne6mXOUFKdd(j4oFIJEn5DDil2, i, obj, j, obj2, z);
        }
        Object objHjneShqpF9Tis4 = j4oFIJEn5DDil2.hjneShqpF9Tis4(i);
        if (objHjneShqpF9Tis4 == null) {
            if (hT6Px2xDdrmDEbykyYy.xDyLpEZyrcKVe0(j)) {
                if (j4oFIJEn5DDil2.D5P1xCAyuvgF(null, i, LYgmvfM6ccmccA0DV.JXn4Qf7zpnLjP5)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (j4oFIJEn5DDil2.D5P1xCAyuvgF(null, i, obj2)) {
                    return 2;
                }
            }
        } else if (objHjneShqpF9Tis4 instanceof S1QQVRz2bJQ7) {
            j4oFIJEn5DDil2.gIIiyi2ddlMDR0(i, null);
            if (hT6Px2xDdrmDEbykyYy.rCHnHJBAlOpNI5(objHjneShqpF9Tis4, obj)) {
                j4oFIJEn5DDil2.wotphlvK9sPbXJ(i, LYgmvfM6ccmccA0DV.pyu8ovAipBTLYAiKab);
                return 0;
            }
            o0rN3ekjBJ6kKwok o0rn3ekjbj6kkwok = LYgmvfM6ccmccA0DV.hjneShqpF9Tis4;
            if (j4oFIJEn5DDil2.ibVTtJUNfrGYbW.getAndSet((i * 2) + 1, o0rn3ekjbj6kkwok) == o0rn3ekjbj6kkwok) {
                return 5;
            }
            j4oFIJEn5DDil2.gmNWMfvn6zlEj(i, true);
            return 5;
        }
        return hT6Px2xDdrmDEbykyYy.tne6mXOUFKdd(j4oFIJEn5DDil2, i, obj, j, obj2, z);
    }

    public static void MLSIo1htfMPWeB8V876L(HT6Px2xDdrmDEbykyYy hT6Px2xDdrmDEbykyYy) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = xDyLpEZyrcKVe0;
        if ((atomicLongFieldUpdater.addAndGet(hT6Px2xDdrmDEbykyYy, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(hT6Px2xDdrmDEbykyYy) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static boolean O2DHNSIGZlgPja7eqLgn(Object obj) {
        if (obj instanceof wxzKGhimDkb70lgmfb69) {
            return LYgmvfM6ccmccA0DV.dDIMxZXP1V8HdM((wxzKGhimDkb70lgmfb69) obj, Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public static final J4oFIJEn5DDil2 dDIMxZXP1V8HdM(HT6Px2xDdrmDEbykyYy hT6Px2xDdrmDEbykyYy, long j, J4oFIJEn5DDil2 j4oFIJEn5DDil2) {
        Object objGIIiyi2ddlMDR0;
        HT6Px2xDdrmDEbykyYy hT6Px2xDdrmDEbykyYy2;
        J4oFIJEn5DDil2 j4oFIJEn5DDil3 = LYgmvfM6ccmccA0DV.dDIMxZXP1V8HdM;
        SpFALcGAA4NXKhu spFALcGAA4NXKhu = SpFALcGAA4NXKhu.D5P1xCAyuvgF;
        loop0: while (true) {
            objGIIiyi2ddlMDR0 = SbxdZ6Kq2uhHQ5RPRqm.gIIiyi2ddlMDR0(j4oFIJEn5DDil2, j, spFALcGAA4NXKhu);
            if (!y6jRGLEWNMir.ibVTtJUNfrGYbW(objGIIiyi2ddlMDR0)) {
                endHZiILsQwz endhziilsqwzXDyLpEZyrcKVe0 = y6jRGLEWNMir.xDyLpEZyrcKVe0(objGIIiyi2ddlMDR0);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ibVTtJUNfrGYbW;
                    endHZiILsQwz endhziilsqwz = (endHZiILsQwz) atomicReferenceFieldUpdater.get(hT6Px2xDdrmDEbykyYy);
                    if (endhziilsqwz.JXn4Qf7zpnLjP5 >= endhziilsqwzXDyLpEZyrcKVe0.JXn4Qf7zpnLjP5) {
                        break loop0;
                    }
                    if (!endhziilsqwzXDyLpEZyrcKVe0.pyu8ovAipBTLYAiKab()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(hT6Px2xDdrmDEbykyYy, endhziilsqwz, endhziilsqwzXDyLpEZyrcKVe0)) {
                            if (!endhziilsqwz.Ee8d2j4S9Vm5yGuR()) {
                                break loop0;
                            }
                            endhziilsqwz.JXn4Qf7zpnLjP5();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(hT6Px2xDdrmDEbykyYy) == endhziilsqwz);
                    if (endhziilsqwzXDyLpEZyrcKVe0.Ee8d2j4S9Vm5yGuR()) {
                        endhziilsqwzXDyLpEZyrcKVe0.JXn4Qf7zpnLjP5();
                    }
                }
            } else {
                break;
            }
        }
        boolean zIbVTtJUNfrGYbW = y6jRGLEWNMir.ibVTtJUNfrGYbW(objGIIiyi2ddlMDR0);
        AtomicLongFieldUpdater atomicLongFieldUpdater = JXn4Qf7zpnLjP5;
        if (zIbVTtJUNfrGYbW) {
            hT6Px2xDdrmDEbykyYy.H9XlUr4OeMJFiXK();
            if (j4oFIJEn5DDil2.JXn4Qf7zpnLjP5 * ((long) LYgmvfM6ccmccA0DV.w9sT1Swbhx3hs) < atomicLongFieldUpdater.get(hT6Px2xDdrmDEbykyYy)) {
                j4oFIJEn5DDil2.dDIMxZXP1V8HdM();
                return null;
            }
        } else {
            J4oFIJEn5DDil2 j4oFIJEn5DDil4 = (J4oFIJEn5DDil2) y6jRGLEWNMir.xDyLpEZyrcKVe0(objGIIiyi2ddlMDR0);
            long j2 = j4oFIJEn5DDil4.JXn4Qf7zpnLjP5;
            if (j2 <= j) {
                return j4oFIJEn5DDil4;
            }
            long j3 = ((long) LYgmvfM6ccmccA0DV.w9sT1Swbhx3hs) * j2;
            while (true) {
                long j4 = vekpFI4d1Nc4fakF.get(hT6Px2xDdrmDEbykyYy);
                long j5 = 1152921504606846975L & j4;
                if (j5 >= j3) {
                    hT6Px2xDdrmDEbykyYy2 = hT6Px2xDdrmDEbykyYy;
                    break;
                }
                hT6Px2xDdrmDEbykyYy2 = hT6Px2xDdrmDEbykyYy;
                if (vekpFI4d1Nc4fakF.compareAndSet(hT6Px2xDdrmDEbykyYy2, j4, (((long) ((int) (j4 >> 60))) << 60) + j5)) {
                    break;
                }
                hT6Px2xDdrmDEbykyYy = hT6Px2xDdrmDEbykyYy2;
            }
            if (j2 * ((long) LYgmvfM6ccmccA0DV.w9sT1Swbhx3hs) < atomicLongFieldUpdater.get(hT6Px2xDdrmDEbykyYy2)) {
                j4oFIJEn5DDil4.dDIMxZXP1V8HdM();
            }
        }
        return null;
    }

    public static final void w9sT1Swbhx3hs(HT6Px2xDdrmDEbykyYy hT6Px2xDdrmDEbykyYy, GoFryeNz7Rqaz7fcxHnt goFryeNz7Rqaz7fcxHnt, hD886kxBkce8U hd886kxbkce8u) {
        hd886kxbkce8u.ibVTtJUNfrGYbW(new VSZeS5mia3yEXbAe(hT6Px2xDdrmDEbykyYy.nQilHWaqS401ZtR()));
    }

    public final J4oFIJEn5DDil2 D5P1xCAyuvgF(long j) {
        Object objQrz92kRPw4GcghAc;
        long j2;
        Object obj = pyu8ovAipBTLYAiKab.get(this);
        J4oFIJEn5DDil2 j4oFIJEn5DDil2 = (J4oFIJEn5DDil2) ibVTtJUNfrGYbW.get(this);
        if (j4oFIJEn5DDil2.JXn4Qf7zpnLjP5 > ((J4oFIJEn5DDil2) obj).JXn4Qf7zpnLjP5) {
            obj = j4oFIJEn5DDil2;
        }
        J4oFIJEn5DDil2 j4oFIJEn5DDil3 = (J4oFIJEn5DDil2) b1EoSIRjJHO5.get(this);
        if (j4oFIJEn5DDil3.JXn4Qf7zpnLjP5 > ((J4oFIJEn5DDil2) obj).JXn4Qf7zpnLjP5) {
            obj = j4oFIJEn5DDil3;
        }
        xU0rTjyeInI6ZXnysXT xu0rtjyeini6zxnysxt = (xU0rTjyeInI6ZXnysXT) obj;
        loop0: while (true) {
            xu0rtjyeini6zxnysxt.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = xU0rTjyeInI6ZXnysXT.w9sT1Swbhx3hs;
            Object obj2 = atomicReferenceFieldUpdater.get(xu0rtjyeini6zxnysxt);
            o0rN3ekjBJ6kKwok o0rn3ekjbj6kkwok = SbxdZ6Kq2uhHQ5RPRqm.dDIMxZXP1V8HdM;
            objQrz92kRPw4GcghAc = null;
            if (obj2 == o0rn3ekjbj6kkwok) {
                break;
            }
            xU0rTjyeInI6ZXnysXT xu0rtjyeini6zxnysxt2 = (xU0rTjyeInI6ZXnysXT) obj2;
            if (xu0rtjyeini6zxnysxt2 == null) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(xu0rtjyeini6zxnysxt, null, o0rn3ekjbj6kkwok)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(xu0rtjyeini6zxnysxt) == null);
            } else {
                xu0rtjyeini6zxnysxt = xu0rtjyeini6zxnysxt2;
            }
        }
        J4oFIJEn5DDil2 j4oFIJEn5DDil4 = (J4oFIJEn5DDil2) xu0rtjyeini6zxnysxt;
        if (DVTNwpDEVsUKuznof()) {
            J4oFIJEn5DDil2 j4oFIJEn5DDil5 = j4oFIJEn5DDil4;
            loop2: while (true) {
                int i = LYgmvfM6ccmccA0DV.w9sT1Swbhx3hs - 1;
                while (true) {
                    if (-1 < i) {
                        j2 = (j4oFIJEn5DDil5.JXn4Qf7zpnLjP5 * ((long) LYgmvfM6ccmccA0DV.w9sT1Swbhx3hs)) + ((long) i);
                        if (j2 >= JXn4Qf7zpnLjP5.get(this)) {
                            while (true) {
                                Object objHjneShqpF9Tis4 = j4oFIJEn5DDil5.hjneShqpF9Tis4(i);
                                if (objHjneShqpF9Tis4 != null && objHjneShqpF9Tis4 != LYgmvfM6ccmccA0DV.Ee8d2j4S9Vm5yGuR) {
                                    if (objHjneShqpF9Tis4 != LYgmvfM6ccmccA0DV.JXn4Qf7zpnLjP5) {
                                        break;
                                    }
                                    break loop2;
                                }
                                if (j4oFIJEn5DDil5.D5P1xCAyuvgF(objHjneShqpF9Tis4, i, LYgmvfM6ccmccA0DV.gmNWMfvn6zlEj)) {
                                    j4oFIJEn5DDil5.b1EoSIRjJHO5();
                                    break;
                                }
                            }
                            i--;
                        }
                    } else {
                        j4oFIJEn5DDil5 = (J4oFIJEn5DDil2) ((xU0rTjyeInI6ZXnysXT) xU0rTjyeInI6ZXnysXT.vekpFI4d1Nc4fakF.get(j4oFIJEn5DDil5));
                        if (j4oFIJEn5DDil5 == null) {
                        }
                    }
                    j2 = -1;
                    break;
                }
            }
            if (j2 != -1) {
                gmNWMfvn6zlEj(j2);
            }
        }
        loop5: for (J4oFIJEn5DDil2 j4oFIJEn5DDil6 = j4oFIJEn5DDil4; j4oFIJEn5DDil6 != null; j4oFIJEn5DDil6 = (J4oFIJEn5DDil2) ((xU0rTjyeInI6ZXnysXT) xU0rTjyeInI6ZXnysXT.vekpFI4d1Nc4fakF.get(j4oFIJEn5DDil6))) {
            for (int i2 = LYgmvfM6ccmccA0DV.w9sT1Swbhx3hs - 1; -1 < i2; i2--) {
                if ((j4oFIJEn5DDil6.JXn4Qf7zpnLjP5 * ((long) LYgmvfM6ccmccA0DV.w9sT1Swbhx3hs)) + ((long) i2) < j) {
                    break loop5;
                }
                while (true) {
                    Object objHjneShqpF9Tis5 = j4oFIJEn5DDil6.hjneShqpF9Tis4(i2);
                    if (objHjneShqpF9Tis5 != null && objHjneShqpF9Tis5 != LYgmvfM6ccmccA0DV.Ee8d2j4S9Vm5yGuR) {
                        if (!(objHjneShqpF9Tis5 instanceof OGXArWikeWfH)) {
                            if (!(objHjneShqpF9Tis5 instanceof S1QQVRz2bJQ7)) {
                                break;
                            }
                            if (j4oFIJEn5DDil6.D5P1xCAyuvgF(objHjneShqpF9Tis5, i2, LYgmvfM6ccmccA0DV.gmNWMfvn6zlEj)) {
                                objQrz92kRPw4GcghAc = gA5gCwTK0qjTIn.Qrz92kRPw4GcghAc(objQrz92kRPw4GcghAc, objHjneShqpF9Tis5);
                                j4oFIJEn5DDil6.gmNWMfvn6zlEj(i2, true);
                                break;
                            }
                        } else {
                            if (j4oFIJEn5DDil6.D5P1xCAyuvgF(objHjneShqpF9Tis5, i2, LYgmvfM6ccmccA0DV.gmNWMfvn6zlEj)) {
                                objQrz92kRPw4GcghAc = gA5gCwTK0qjTIn.Qrz92kRPw4GcghAc(objQrz92kRPw4GcghAc, ((OGXArWikeWfH) objHjneShqpF9Tis5).dDIMxZXP1V8HdM);
                                j4oFIJEn5DDil6.gmNWMfvn6zlEj(i2, true);
                                break;
                            }
                        }
                    } else {
                        if (j4oFIJEn5DDil6.D5P1xCAyuvgF(objHjneShqpF9Tis5, i2, LYgmvfM6ccmccA0DV.gmNWMfvn6zlEj)) {
                            j4oFIJEn5DDil6.b1EoSIRjJHO5();
                            break;
                        }
                    }
                }
            }
        }
        if (objQrz92kRPw4GcghAc != null) {
            if (!(objQrz92kRPw4GcghAc instanceof ArrayList)) {
                vIJudZvPyTuNp((S1QQVRz2bJQ7) objQrz92kRPw4GcghAc, true);
                return j4oFIJEn5DDil4;
            }
            ArrayList arrayList = (ArrayList) objQrz92kRPw4GcghAc;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                vIJudZvPyTuNp((S1QQVRz2bJQ7) arrayList.get(size), true);
            }
        }
        return j4oFIJEn5DDil4;
    }

    public boolean DVTNwpDEVsUKuznof() {
        return false;
    }

    public final boolean H9XlUr4OeMJFiXK() {
        return XiR1pIn5878vVWd(vekpFI4d1Nc4fakF.get(this), false);
    }

    public final long J0zjQ7CAgohuxU20eCW6() {
        return vekpFI4d1Nc4fakF.get(this) & 1152921504606846975L;
    }

    @Override // v.s.gUw52pKTgwkb0KB
    public final Object JXn4Qf7zpnLjP5(Ry0qdYcyMI47soiNYB ry0qdYcyMI47soiNYB) {
        return EWUjsTERgdPbSw3NNlN(this, ry0qdYcyMI47soiNYB);
    }

    public final void K7eEOBPYP9VIoHWTe(long j, J4oFIJEn5DDil2 j4oFIJEn5DDil2) {
        J4oFIJEn5DDil2 j4oFIJEn5DDil3;
        J4oFIJEn5DDil2 j4oFIJEn5DDil4;
        while (j4oFIJEn5DDil2.JXn4Qf7zpnLjP5 < j && (j4oFIJEn5DDil4 = (J4oFIJEn5DDil2) j4oFIJEn5DDil2.w9sT1Swbhx3hs()) != null) {
            j4oFIJEn5DDil2 = j4oFIJEn5DDil4;
        }
        while (true) {
            if (!j4oFIJEn5DDil2.vekpFI4d1Nc4fakF() || (j4oFIJEn5DDil3 = (J4oFIJEn5DDil2) j4oFIJEn5DDil2.w9sT1Swbhx3hs()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = pyu8ovAipBTLYAiKab;
                    endHZiILsQwz endhziilsqwz = (endHZiILsQwz) atomicReferenceFieldUpdater.get(this);
                    if (endhziilsqwz.JXn4Qf7zpnLjP5 >= j4oFIJEn5DDil2.JXn4Qf7zpnLjP5) {
                        return;
                    }
                    if (!j4oFIJEn5DDil2.pyu8ovAipBTLYAiKab()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, endhziilsqwz, j4oFIJEn5DDil2)) {
                            if (endhziilsqwz.Ee8d2j4S9Vm5yGuR()) {
                                endhziilsqwz.JXn4Qf7zpnLjP5();
                                return;
                            }
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == endhziilsqwz);
                    if (j4oFIJEn5DDil2.Ee8d2j4S9Vm5yGuR()) {
                        j4oFIJEn5DDil2.JXn4Qf7zpnLjP5();
                    }
                }
            } else {
                j4oFIJEn5DDil2 = j4oFIJEn5DDil3;
            }
        }
    }

    public final Throwable Qrz92kRPw4GcghAc() {
        return (Throwable) D5P1xCAyuvgF.get(this);
    }

    public final boolean XiR1pIn5878vVWd(long j, boolean z) {
        int i;
        int i2 = (int) (j >> 60);
        if (i2 != 0 && i2 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = JXn4Qf7zpnLjP5;
            if (i2 == 2) {
                D5P1xCAyuvgF(1152921504606846975L & j);
                if (z) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b1EoSIRjJHO5;
                        J4oFIJEn5DDil2 j4oFIJEn5DDil2WotphlvK9sPbXJ = (J4oFIJEn5DDil2) atomicReferenceFieldUpdater.get(this);
                        long j2 = atomicLongFieldUpdater.get(this);
                        if (J0zjQ7CAgohuxU20eCW6() <= j2) {
                            break;
                        }
                        long j3 = LYgmvfM6ccmccA0DV.w9sT1Swbhx3hs;
                        long j4 = j2 / j3;
                        if (j4oFIJEn5DDil2WotphlvK9sPbXJ.JXn4Qf7zpnLjP5 != j4 && (j4oFIJEn5DDil2WotphlvK9sPbXJ = wotphlvK9sPbXJ(j4, j4oFIJEn5DDil2WotphlvK9sPbXJ)) == null) {
                            if (((J4oFIJEn5DDil2) atomicReferenceFieldUpdater.get(this)).JXn4Qf7zpnLjP5 < j4) {
                                break;
                            }
                        } else {
                            j4oFIJEn5DDil2WotphlvK9sPbXJ.dDIMxZXP1V8HdM();
                            int i3 = (int) (j2 % j3);
                            while (true) {
                                Object objHjneShqpF9Tis4 = j4oFIJEn5DDil2WotphlvK9sPbXJ.hjneShqpF9Tis4(i3);
                                if (objHjneShqpF9Tis4 != null && objHjneShqpF9Tis4 != LYgmvfM6ccmccA0DV.Ee8d2j4S9Vm5yGuR) {
                                    if (objHjneShqpF9Tis4 != LYgmvfM6ccmccA0DV.JXn4Qf7zpnLjP5 && (objHjneShqpF9Tis4 == LYgmvfM6ccmccA0DV.D5P1xCAyuvgF || objHjneShqpF9Tis4 == LYgmvfM6ccmccA0DV.gmNWMfvn6zlEj || objHjneShqpF9Tis4 == LYgmvfM6ccmccA0DV.pyu8ovAipBTLYAiKab || objHjneShqpF9Tis4 == LYgmvfM6ccmccA0DV.b1EoSIRjJHO5 || (objHjneShqpF9Tis4 != LYgmvfM6ccmccA0DV.ibVTtJUNfrGYbW && (objHjneShqpF9Tis4 == LYgmvfM6ccmccA0DV.xDyLpEZyrcKVe0 || j2 != atomicLongFieldUpdater.get(this))))) {
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                    }
                                } else if (j4oFIJEn5DDil2WotphlvK9sPbXJ.D5P1xCAyuvgF(objHjneShqpF9Tis4, i3, LYgmvfM6ccmccA0DV.b1EoSIRjJHO5)) {
                                    gIIiyi2ddlMDR0();
                                    break;
                                }
                            }
                            JXn4Qf7zpnLjP5.compareAndSet(this, j2, j2 + 1);
                        }
                    }
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException(Y9mRyRdkl5FOcwb66V6.xDyLpEZyrcKVe0("unexpected close status: ", i2).toString());
                }
                J4oFIJEn5DDil2 j4oFIJEn5DDil2D5P1xCAyuvgF = D5P1xCAyuvgF(1152921504606846975L & j);
                Object objQrz92kRPw4GcghAc = null;
                loop0: do {
                    int i4 = LYgmvfM6ccmccA0DV.w9sT1Swbhx3hs - 1;
                    while (true) {
                        i = 24 - 25;
                        if (i < i4) {
                            long j5 = (j4oFIJEn5DDil2D5P1xCAyuvgF.JXn4Qf7zpnLjP5 * ((long) LYgmvfM6ccmccA0DV.w9sT1Swbhx3hs)) + ((long) i4);
                            while (true) {
                                Object objHjneShqpF9Tis5 = j4oFIJEn5DDil2D5P1xCAyuvgF.hjneShqpF9Tis4(i4);
                                if (objHjneShqpF9Tis5 == LYgmvfM6ccmccA0DV.pyu8ovAipBTLYAiKab) {
                                    break loop0;
                                }
                                if (objHjneShqpF9Tis5 != LYgmvfM6ccmccA0DV.JXn4Qf7zpnLjP5) {
                                    if (objHjneShqpF9Tis5 != LYgmvfM6ccmccA0DV.Ee8d2j4S9Vm5yGuR && objHjneShqpF9Tis5 != null) {
                                        if (!(objHjneShqpF9Tis5 instanceof S1QQVRz2bJQ7) && !(objHjneShqpF9Tis5 instanceof OGXArWikeWfH)) {
                                            o0rN3ekjBJ6kKwok o0rn3ekjbj6kkwok = LYgmvfM6ccmccA0DV.ibVTtJUNfrGYbW;
                                            if (objHjneShqpF9Tis5 == o0rn3ekjbj6kkwok || objHjneShqpF9Tis5 == LYgmvfM6ccmccA0DV.xDyLpEZyrcKVe0) {
                                                break loop0;
                                            }
                                            if (objHjneShqpF9Tis5 != o0rn3ekjbj6kkwok) {
                                                break;
                                            }
                                        } else {
                                            if (j5 < atomicLongFieldUpdater.get(this)) {
                                                break loop0;
                                            }
                                            S1QQVRz2bJQ7 s1QQVRz2bJQ7 = objHjneShqpF9Tis5 instanceof OGXArWikeWfH ? ((OGXArWikeWfH) objHjneShqpF9Tis5).dDIMxZXP1V8HdM : (S1QQVRz2bJQ7) objHjneShqpF9Tis5;
                                            if (j4oFIJEn5DDil2D5P1xCAyuvgF.D5P1xCAyuvgF(objHjneShqpF9Tis5, i4, LYgmvfM6ccmccA0DV.gmNWMfvn6zlEj)) {
                                                objQrz92kRPw4GcghAc = gA5gCwTK0qjTIn.Qrz92kRPw4GcghAc(objQrz92kRPw4GcghAc, s1QQVRz2bJQ7);
                                                j4oFIJEn5DDil2D5P1xCAyuvgF.gIIiyi2ddlMDR0(i4, null);
                                                j4oFIJEn5DDil2D5P1xCAyuvgF.b1EoSIRjJHO5();
                                                break;
                                            }
                                        }
                                    } else {
                                        if (j4oFIJEn5DDil2D5P1xCAyuvgF.D5P1xCAyuvgF(objHjneShqpF9Tis5, i4, LYgmvfM6ccmccA0DV.gmNWMfvn6zlEj)) {
                                            j4oFIJEn5DDil2D5P1xCAyuvgF.b1EoSIRjJHO5();
                                            break;
                                        }
                                    }
                                } else {
                                    if (j5 < atomicLongFieldUpdater.get(this)) {
                                        break loop0;
                                    }
                                    if (j4oFIJEn5DDil2D5P1xCAyuvgF.D5P1xCAyuvgF(objHjneShqpF9Tis5, i4, LYgmvfM6ccmccA0DV.gmNWMfvn6zlEj)) {
                                        j4oFIJEn5DDil2D5P1xCAyuvgF.gIIiyi2ddlMDR0(i4, null);
                                        j4oFIJEn5DDil2D5P1xCAyuvgF.b1EoSIRjJHO5();
                                        break;
                                    }
                                }
                            }
                            i4--;
                        }
                    }
                    j4oFIJEn5DDil2D5P1xCAyuvgF = (J4oFIJEn5DDil2) ((xU0rTjyeInI6ZXnysXT) xU0rTjyeInI6ZXnysXT.vekpFI4d1Nc4fakF.get(j4oFIJEn5DDil2D5P1xCAyuvgF));
                } while (j4oFIJEn5DDil2D5P1xCAyuvgF != null);
                if (objQrz92kRPw4GcghAc != null) {
                    if (objQrz92kRPw4GcghAc instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objQrz92kRPw4GcghAc;
                        for (int size = arrayList.size() - 1; i < size; size--) {
                            vIJudZvPyTuNp((S1QQVRz2bJQ7) arrayList.get(size), false);
                        }
                    } else {
                        vIJudZvPyTuNp((S1QQVRz2bJQ7) objQrz92kRPw4GcghAc, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // v.s.gUw52pKTgwkb0KB
    public final Object b1EoSIRjJHO5() {
        J4oFIJEn5DDil2 j4oFIJEn5DDil2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = JXn4Qf7zpnLjP5;
        long j = atomicLongFieldUpdater.get(this);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = vekpFI4d1Nc4fakF;
        long j2 = atomicLongFieldUpdater2.get(this);
        if (XiR1pIn5878vVWd(j2, true)) {
            return new Jdyt6TPRBOj1K9aOy91D(Qrz92kRPw4GcghAc());
        }
        long j3 = j2 & 1152921504606846975L;
        BuBD1pdyBtuGt0z buBD1pdyBtuGt0z = F5LI90Tmwo1KQ.w9sT1Swbhx3hs;
        if (j >= j3) {
            return buBD1pdyBtuGt0z;
        }
        Object obj = LYgmvfM6ccmccA0DV.hjneShqpF9Tis4;
        J4oFIJEn5DDil2 j4oFIJEn5DDil3 = (J4oFIJEn5DDil2) b1EoSIRjJHO5.get(this);
        while (!XiR1pIn5878vVWd(atomicLongFieldUpdater2.get(this), true)) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = LYgmvfM6ccmccA0DV.w9sT1Swbhx3hs;
            long j5 = andIncrement / j4;
            int i = (int) (andIncrement % j4);
            if (j4oFIJEn5DDil3.JXn4Qf7zpnLjP5 != j5) {
                J4oFIJEn5DDil2 j4oFIJEn5DDil2WotphlvK9sPbXJ = wotphlvK9sPbXJ(j5, j4oFIJEn5DDil3);
                if (j4oFIJEn5DDil2WotphlvK9sPbXJ == null) {
                    continue;
                } else {
                    j4oFIJEn5DDil2 = j4oFIJEn5DDil2WotphlvK9sPbXJ;
                }
            } else {
                j4oFIJEn5DDil2 = j4oFIJEn5DDil3;
            }
            Object objXfn2GJwmGqs7kWW = xfn2GJwmGqs7kWW(j4oFIJEn5DDil2, i, andIncrement, obj);
            J4oFIJEn5DDil2 j4oFIJEn5DDil4 = j4oFIJEn5DDil2;
            if (objXfn2GJwmGqs7kWW == LYgmvfM6ccmccA0DV.gIIiyi2ddlMDR0) {
                S1QQVRz2bJQ7 s1QQVRz2bJQ7 = obj instanceof S1QQVRz2bJQ7 ? (S1QQVRz2bJQ7) obj : null;
                if (s1QQVRz2bJQ7 != null) {
                    s1QQVRz2bJQ7.dDIMxZXP1V8HdM(j4oFIJEn5DDil4, i);
                }
                fivkjwgu2UdAtiY(andIncrement);
                j4oFIJEn5DDil4.b1EoSIRjJHO5();
                return buBD1pdyBtuGt0z;
            }
            if (objXfn2GJwmGqs7kWW != LYgmvfM6ccmccA0DV.Qrz92kRPw4GcghAc) {
                if (objXfn2GJwmGqs7kWW == LYgmvfM6ccmccA0DV.wotphlvK9sPbXJ) {
                    throw new IllegalStateException("unexpected");
                }
                j4oFIJEn5DDil4.dDIMxZXP1V8HdM();
                return objXfn2GJwmGqs7kWW;
            }
            if (andIncrement < J0zjQ7CAgohuxU20eCW6()) {
                j4oFIJEn5DDil4.dDIMxZXP1V8HdM();
            }
            j4oFIJEn5DDil3 = j4oFIJEn5DDil4;
        }
        return new Jdyt6TPRBOj1K9aOy91D(Qrz92kRPw4GcghAc());
    }

    public final Object dTS0S7eC32ubQH54j36(GoFryeNz7Rqaz7fcxHnt goFryeNz7Rqaz7fcxHnt, vJpP6RThpasAD vjpp6rthpasad) {
        hD886kxBkce8U hd886kxbkce8u = new hD886kxBkce8U(1, jb8et6SZeK5TWMrJFxDX.J0zjQ7CAgohuxU20eCW6(vjpp6rthpasad));
        hd886kxbkce8u.MLSIo1htfMPWeB8V876L();
        hd886kxbkce8u.ibVTtJUNfrGYbW(new VSZeS5mia3yEXbAe(nQilHWaqS401ZtR()));
        Object objJ0zjQ7CAgohuxU20eCW6 = hd886kxbkce8u.J0zjQ7CAgohuxU20eCW6();
        return objJ0zjQ7CAgohuxU20eCW6 == pjN1L01KDMWnPCy0daD.w9sT1Swbhx3hs ? objJ0zjQ7CAgohuxU20eCW6 : Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
    }

    public final void fivkjwgu2UdAtiY(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        HT6Px2xDdrmDEbykyYy hT6Px2xDdrmDEbykyYy = this;
        if (hT6Px2xDdrmDEbykyYy.l1V0lQr6TbwNKqHfXNbb()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = Ee8d2j4S9Vm5yGuR;
            if (atomicLongFieldUpdater.get(hT6Px2xDdrmDEbykyYy) > j) {
                break;
            } else {
                hT6Px2xDdrmDEbykyYy = this;
            }
        }
        int i = LYgmvfM6ccmccA0DV.vekpFI4d1Nc4fakF;
        int i2 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = xDyLpEZyrcKVe0;
            if (i2 < i) {
                long j2 = atomicLongFieldUpdater.get(hT6Px2xDdrmDEbykyYy);
                if (j2 == (4611686018427387903L & atomicLongFieldUpdater2.get(hT6Px2xDdrmDEbykyYy)) && j2 == atomicLongFieldUpdater.get(hT6Px2xDdrmDEbykyYy)) {
                    return;
                } else {
                    i2++;
                }
            } else {
                while (true) {
                    long j3 = atomicLongFieldUpdater2.get(hT6Px2xDdrmDEbykyYy);
                    if (atomicLongFieldUpdater2.compareAndSet(hT6Px2xDdrmDEbykyYy, j3, (j3 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        hT6Px2xDdrmDEbykyYy = this;
                    }
                }
                while (true) {
                    long j4 = atomicLongFieldUpdater.get(hT6Px2xDdrmDEbykyYy);
                    long j5 = atomicLongFieldUpdater2.get(hT6Px2xDdrmDEbykyYy);
                    long j6 = j5 & 4611686018427387903L;
                    boolean z = (j5 & 4611686018427387904L) != 0;
                    if (j4 == j6 && j4 == atomicLongFieldUpdater.get(hT6Px2xDdrmDEbykyYy)) {
                        break;
                    }
                    if (z) {
                        hT6Px2xDdrmDEbykyYy = this;
                    } else {
                        hT6Px2xDdrmDEbykyYy = this;
                        atomicLongFieldUpdater2.compareAndSet(hT6Px2xDdrmDEbykyYy, j5, 4611686018427387904L + j6);
                    }
                }
                while (true) {
                    long j7 = atomicLongFieldUpdater2.get(hT6Px2xDdrmDEbykyYy);
                    if (atomicLongFieldUpdater2.compareAndSet(hT6Px2xDdrmDEbykyYy, j7, j7 & 4611686018427387903L)) {
                        return;
                    } else {
                        hT6Px2xDdrmDEbykyYy = this;
                    }
                }
            }
        }
    }

    public final void gIIiyi2ddlMDR0() {
        Object objGIIiyi2ddlMDR0;
        if (l1V0lQr6TbwNKqHfXNbb()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = pyu8ovAipBTLYAiKab;
        J4oFIJEn5DDil2 j4oFIJEn5DDil2 = (J4oFIJEn5DDil2) atomicReferenceFieldUpdater.get(this);
        while (true) {
            long andIncrement = Ee8d2j4S9Vm5yGuR.getAndIncrement(this);
            long j = andIncrement / ((long) LYgmvfM6ccmccA0DV.w9sT1Swbhx3hs);
            if (J0zjQ7CAgohuxU20eCW6() <= andIncrement) {
                if (j4oFIJEn5DDil2.JXn4Qf7zpnLjP5 < j && j4oFIJEn5DDil2.w9sT1Swbhx3hs() != null) {
                    K7eEOBPYP9VIoHWTe(j, j4oFIJEn5DDil2);
                }
                MLSIo1htfMPWeB8V876L(this);
                return;
            }
            if (j4oFIJEn5DDil2.JXn4Qf7zpnLjP5 != j) {
                SpFALcGAA4NXKhu spFALcGAA4NXKhu = SpFALcGAA4NXKhu.D5P1xCAyuvgF;
                while (true) {
                    objGIIiyi2ddlMDR0 = SbxdZ6Kq2uhHQ5RPRqm.gIIiyi2ddlMDR0(j4oFIJEn5DDil2, j, spFALcGAA4NXKhu);
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
                J4oFIJEn5DDil2 j4oFIJEn5DDil3 = null;
                if (y6jRGLEWNMir.ibVTtJUNfrGYbW(objGIIiyi2ddlMDR0)) {
                    H9XlUr4OeMJFiXK();
                    K7eEOBPYP9VIoHWTe(j, j4oFIJEn5DDil2);
                    MLSIo1htfMPWeB8V876L(this);
                } else {
                    J4oFIJEn5DDil2 j4oFIJEn5DDil4 = (J4oFIJEn5DDil2) y6jRGLEWNMir.xDyLpEZyrcKVe0(objGIIiyi2ddlMDR0);
                    long j2 = j4oFIJEn5DDil4.JXn4Qf7zpnLjP5;
                    if (j2 > j) {
                        long j3 = j2 * ((long) LYgmvfM6ccmccA0DV.w9sT1Swbhx3hs);
                        if (Ee8d2j4S9Vm5yGuR.compareAndSet(this, 1 + andIncrement, j3)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = xDyLpEZyrcKVe0;
                            if ((atomicLongFieldUpdater.addAndGet(this, j3 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            MLSIo1htfMPWeB8V876L(this);
                        }
                    } else {
                        j4oFIJEn5DDil3 = j4oFIJEn5DDil4;
                    }
                }
                if (j4oFIJEn5DDil3 == null) {
                    continue;
                } else {
                    j4oFIJEn5DDil2 = j4oFIJEn5DDil3;
                }
            }
            int i = (int) (andIncrement % ((long) LYgmvfM6ccmccA0DV.w9sT1Swbhx3hs));
            Object objHjneShqpF9Tis4 = j4oFIJEn5DDil2.hjneShqpF9Tis4(i);
            boolean z = objHjneShqpF9Tis4 instanceof S1QQVRz2bJQ7;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = JXn4Qf7zpnLjP5;
            if (!z || andIncrement < atomicLongFieldUpdater2.get(this) || !j4oFIJEn5DDil2.D5P1xCAyuvgF(objHjneShqpF9Tis4, i, LYgmvfM6ccmccA0DV.ibVTtJUNfrGYbW)) {
                while (true) {
                    Object objHjneShqpF9Tis5 = j4oFIJEn5DDil2.hjneShqpF9Tis4(i);
                    if (objHjneShqpF9Tis5 instanceof S1QQVRz2bJQ7) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (j4oFIJEn5DDil2.D5P1xCAyuvgF(objHjneShqpF9Tis5, i, new OGXArWikeWfH((S1QQVRz2bJQ7) objHjneShqpF9Tis5))) {
                                MLSIo1htfMPWeB8V876L(this);
                                return;
                            }
                        } else if (j4oFIJEn5DDil2.D5P1xCAyuvgF(objHjneShqpF9Tis5, i, LYgmvfM6ccmccA0DV.ibVTtJUNfrGYbW)) {
                            if (!O2DHNSIGZlgPja7eqLgn(objHjneShqpF9Tis5)) {
                                j4oFIJEn5DDil2.wotphlvK9sPbXJ(i, LYgmvfM6ccmccA0DV.D5P1xCAyuvgF);
                                j4oFIJEn5DDil2.b1EoSIRjJHO5();
                                break;
                            } else {
                                j4oFIJEn5DDil2.wotphlvK9sPbXJ(i, LYgmvfM6ccmccA0DV.JXn4Qf7zpnLjP5);
                                MLSIo1htfMPWeB8V876L(this);
                                return;
                            }
                        }
                    } else {
                        if (objHjneShqpF9Tis5 == LYgmvfM6ccmccA0DV.D5P1xCAyuvgF) {
                            break;
                        }
                        if (objHjneShqpF9Tis5 == null) {
                            if (j4oFIJEn5DDil2.D5P1xCAyuvgF(objHjneShqpF9Tis5, i, LYgmvfM6ccmccA0DV.Ee8d2j4S9Vm5yGuR)) {
                                MLSIo1htfMPWeB8V876L(this);
                                return;
                            }
                        } else if (objHjneShqpF9Tis5 == LYgmvfM6ccmccA0DV.JXn4Qf7zpnLjP5 || objHjneShqpF9Tis5 == LYgmvfM6ccmccA0DV.b1EoSIRjJHO5 || objHjneShqpF9Tis5 == LYgmvfM6ccmccA0DV.pyu8ovAipBTLYAiKab || objHjneShqpF9Tis5 == LYgmvfM6ccmccA0DV.hjneShqpF9Tis4 || objHjneShqpF9Tis5 == LYgmvfM6ccmccA0DV.gmNWMfvn6zlEj) {
                            MLSIo1htfMPWeB8V876L(this);
                            return;
                        } else if (objHjneShqpF9Tis5 != LYgmvfM6ccmccA0DV.xDyLpEZyrcKVe0) {
                            throw new IllegalStateException(("Unexpected cell state: " + objHjneShqpF9Tis5).toString());
                        }
                    }
                }
                MLSIo1htfMPWeB8V876L(this);
            } else if (O2DHNSIGZlgPja7eqLgn(objHjneShqpF9Tis4)) {
                j4oFIJEn5DDil2.wotphlvK9sPbXJ(i, LYgmvfM6ccmccA0DV.JXn4Qf7zpnLjP5);
                MLSIo1htfMPWeB8V876L(this);
                return;
            } else {
                j4oFIJEn5DDil2.wotphlvK9sPbXJ(i, LYgmvfM6ccmccA0DV.D5P1xCAyuvgF);
                j4oFIJEn5DDil2.b1EoSIRjJHO5();
                MLSIo1htfMPWeB8V876L(this);
            }
        }
    }

    public final void gmNWMfvn6zlEj(long j) {
        J4oFIJEn5DDil2 j4oFIJEn5DDil2 = (J4oFIJEn5DDil2) b1EoSIRjJHO5.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = JXn4Qf7zpnLjP5;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(((long) this.w9sT1Swbhx3hs) + j2, Ee8d2j4S9Vm5yGuR.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j2, 1 + j2)) {
                long j3 = LYgmvfM6ccmccA0DV.w9sT1Swbhx3hs;
                long j4 = j2 / j3;
                int i = (int) (j2 % j3);
                if (j4oFIJEn5DDil2.JXn4Qf7zpnLjP5 != j4) {
                    J4oFIJEn5DDil2 j4oFIJEn5DDil2WotphlvK9sPbXJ = wotphlvK9sPbXJ(j4, j4oFIJEn5DDil2);
                    if (j4oFIJEn5DDil2WotphlvK9sPbXJ != null) {
                        j4oFIJEn5DDil2 = j4oFIJEn5DDil2WotphlvK9sPbXJ;
                    }
                }
                J4oFIJEn5DDil2 j4oFIJEn5DDil3 = j4oFIJEn5DDil2;
                if (xfn2GJwmGqs7kWW(j4oFIJEn5DDil3, i, j2, null) != LYgmvfM6ccmccA0DV.Qrz92kRPw4GcghAc || j2 < J0zjQ7CAgohuxU20eCW6()) {
                    j4oFIJEn5DDil3.dDIMxZXP1V8HdM();
                }
                j4oFIJEn5DDil2 = j4oFIJEn5DDil3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:93:0x0191  */
    /* JADX WARN: Code duplicated, block: B:95:0x0195 A[RETURN] */
    @Override // v.s.UDr2ORhCq7XyGYjS5
    public Object hjneShqpF9Tis4(GoFryeNz7Rqaz7fcxHnt goFryeNz7Rqaz7fcxHnt, vJpP6RThpasAD vjpp6rthpasad) throws Throwable {
        Eo0e0FTdv96U7KeCzoB eo0e0FTdv96U7KeCzoB;
        Object objJ0zjQ7CAgohuxU20eCW6;
        GoFryeNz7Rqaz7fcxHnt goFryeNz7Rqaz7fcxHnt2;
        HT6Px2xDdrmDEbykyYy hT6Px2xDdrmDEbykyYy;
        J4oFIJEn5DDil2 j4oFIJEn5DDil2;
        int i;
        HT6Px2xDdrmDEbykyYy hT6Px2xDdrmDEbykyYy2 = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ibVTtJUNfrGYbW;
        J4oFIJEn5DDil2 j4oFIJEn5DDil3 = (J4oFIJEn5DDil2) atomicReferenceFieldUpdater.get(hT6Px2xDdrmDEbykyYy2);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = vekpFI4d1Nc4fakF;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(hT6Px2xDdrmDEbykyYy2);
            long j = andIncrement & 1152921504606846975L;
            boolean zXiR1pIn5878vVWd = hT6Px2xDdrmDEbykyYy2.XiR1pIn5878vVWd(andIncrement, false);
            int i2 = LYgmvfM6ccmccA0DV.w9sT1Swbhx3hs;
            long j2 = i2;
            long j3 = j / j2;
            int i3 = (int) (j % j2);
            long j4 = j4oFIJEn5DDil3.JXn4Qf7zpnLjP5;
            eo0e0FTdv96U7KeCzoB = Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
            pjN1L01KDMWnPCy0daD pjn1l01kdmwnpcy0dad = pjN1L01KDMWnPCy0daD.w9sT1Swbhx3hs;
            if (j4 != j3) {
                J4oFIJEn5DDil2 j4oFIJEn5DDil2DDIMxZXP1V8HdM = dDIMxZXP1V8HdM(hT6Px2xDdrmDEbykyYy2, j3, j4oFIJEn5DDil3);
                if (j4oFIJEn5DDil2DDIMxZXP1V8HdM != null) {
                    j4oFIJEn5DDil3 = j4oFIJEn5DDil2DDIMxZXP1V8HdM;
                } else if (zXiR1pIn5878vVWd) {
                    Object objDTS0S7eC32ubQH54j36 = dTS0S7eC32ubQH54j36(goFryeNz7Rqaz7fcxHnt, vjpp6rthpasad);
                    if (objDTS0S7eC32ubQH54j36 != pjn1l01kdmwnpcy0dad) {
                        break;
                    }
                    return objDTS0S7eC32ubQH54j36;
                }
            }
            int iEe8d2j4S9Vm5yGuR = Ee8d2j4S9Vm5yGuR(hT6Px2xDdrmDEbykyYy2, j4oFIJEn5DDil3, i3, goFryeNz7Rqaz7fcxHnt, j, null, zXiR1pIn5878vVWd);
            if (iEe8d2j4S9Vm5yGuR == 0) {
                j4oFIJEn5DDil3.dDIMxZXP1V8HdM();
                return eo0e0FTdv96U7KeCzoB;
            }
            if (iEe8d2j4S9Vm5yGuR == 1) {
                break;
            }
            if (iEe8d2j4S9Vm5yGuR != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = JXn4Qf7zpnLjP5;
                int i4 = 20 - 16;
                if (iEe8d2j4S9Vm5yGuR == 3) {
                    hD886kxBkce8U hd886kxbkce8uPyu8ovAipBTLYAiKab = jb8et6SZeK5TWMrJFxDX.pyu8ovAipBTLYAiKab(jb8et6SZeK5TWMrJFxDX.J0zjQ7CAgohuxU20eCW6(vjpp6rthpasad));
                    GoFryeNz7Rqaz7fcxHnt goFryeNz7Rqaz7fcxHnt3 = goFryeNz7Rqaz7fcxHnt;
                    try {
                        int iEe8d2j4S9Vm5yGuR2 = Ee8d2j4S9Vm5yGuR(hT6Px2xDdrmDEbykyYy2, j4oFIJEn5DDil3, i3, goFryeNz7Rqaz7fcxHnt3, j, hd886kxbkce8uPyu8ovAipBTLYAiKab, false);
                        try {
                            if (iEe8d2j4S9Vm5yGuR2 != 0) {
                                if (iEe8d2j4S9Vm5yGuR2 == 1) {
                                    hd886kxbkce8uPyu8ovAipBTLYAiKab.ibVTtJUNfrGYbW(eo0e0FTdv96U7KeCzoB);
                                } else if (iEe8d2j4S9Vm5yGuR2 != 2) {
                                    if (iEe8d2j4S9Vm5yGuR2 != i4) {
                                        String str = "unexpected";
                                        if (iEe8d2j4S9Vm5yGuR2 != 5) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        j4oFIJEn5DDil3.dDIMxZXP1V8HdM();
                                        J4oFIJEn5DDil2 j4oFIJEn5DDil4 = (J4oFIJEn5DDil2) atomicReferenceFieldUpdater.get(hT6Px2xDdrmDEbykyYy2);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(hT6Px2xDdrmDEbykyYy2);
                                            long j5 = andIncrement2 & 1152921504606846975L;
                                            boolean zXiR1pIn5878vVWd2 = hT6Px2xDdrmDEbykyYy2.XiR1pIn5878vVWd(andIncrement2, false);
                                            int i5 = LYgmvfM6ccmccA0DV.w9sT1Swbhx3hs;
                                            long j6 = i5;
                                            str = str;
                                            long j7 = j5 / j6;
                                            int i6 = (int) (j5 % j6);
                                            if (j4oFIJEn5DDil4.JXn4Qf7zpnLjP5 != j7) {
                                                J4oFIJEn5DDil2 j4oFIJEn5DDil2DDIMxZXP1V8HdM2 = dDIMxZXP1V8HdM(hT6Px2xDdrmDEbykyYy2, j7, j4oFIJEn5DDil4);
                                                if (j4oFIJEn5DDil2DDIMxZXP1V8HdM2 != null) {
                                                    i = i5;
                                                    j4oFIJEn5DDil2 = j4oFIJEn5DDil2DDIMxZXP1V8HdM2;
                                                } else if (zXiR1pIn5878vVWd2) {
                                                    w9sT1Swbhx3hs(hT6Px2xDdrmDEbykyYy2, goFryeNz7Rqaz7fcxHnt3, hd886kxbkce8uPyu8ovAipBTLYAiKab);
                                                    break;
                                                }
                                            } else {
                                                j4oFIJEn5DDil2 = j4oFIJEn5DDil4;
                                                i = i5;
                                            }
                                            int iEe8d2j4S9Vm5yGuR3 = Ee8d2j4S9Vm5yGuR(hT6Px2xDdrmDEbykyYy2, j4oFIJEn5DDil2, i6, goFryeNz7Rqaz7fcxHnt3, j5, hd886kxbkce8uPyu8ovAipBTLYAiKab, zXiR1pIn5878vVWd2);
                                            GoFryeNz7Rqaz7fcxHnt goFryeNz7Rqaz7fcxHnt4 = goFryeNz7Rqaz7fcxHnt3;
                                            hT6Px2xDdrmDEbykyYy = hT6Px2xDdrmDEbykyYy2;
                                            J4oFIJEn5DDil2 j4oFIJEn5DDil5 = j4oFIJEn5DDil2;
                                            goFryeNz7Rqaz7fcxHnt2 = goFryeNz7Rqaz7fcxHnt4;
                                            if (iEe8d2j4S9Vm5yGuR3 == 0) {
                                                j4oFIJEn5DDil5.dDIMxZXP1V8HdM();
                                            } else if (iEe8d2j4S9Vm5yGuR3 != 1) {
                                                if (iEe8d2j4S9Vm5yGuR3 == 2) {
                                                    if (!zXiR1pIn5878vVWd2) {
                                                        hd886kxbkce8uPyu8ovAipBTLYAiKab.dDIMxZXP1V8HdM(j4oFIJEn5DDil5, i6 + i);
                                                        break;
                                                    }
                                                    j4oFIJEn5DDil5.b1EoSIRjJHO5();
                                                } else {
                                                    if (iEe8d2j4S9Vm5yGuR3 == 3) {
                                                        throw new IllegalStateException(str);
                                                    }
                                                    if (iEe8d2j4S9Vm5yGuR3 != 4) {
                                                        if (iEe8d2j4S9Vm5yGuR3 == 5) {
                                                            j4oFIJEn5DDil5.dDIMxZXP1V8HdM();
                                                        }
                                                        j4oFIJEn5DDil4 = j4oFIJEn5DDil5;
                                                        hT6Px2xDdrmDEbykyYy2 = hT6Px2xDdrmDEbykyYy;
                                                        goFryeNz7Rqaz7fcxHnt3 = goFryeNz7Rqaz7fcxHnt2;
                                                    } else if (j5 < atomicLongFieldUpdater2.get(hT6Px2xDdrmDEbykyYy)) {
                                                        j4oFIJEn5DDil5.dDIMxZXP1V8HdM();
                                                    }
                                                }
                                            }
                                        }
                                        hd886kxbkce8uPyu8ovAipBTLYAiKab.dTS0S7eC32ubQH54j36();
                                        throw th;
                                    }
                                    goFryeNz7Rqaz7fcxHnt2 = goFryeNz7Rqaz7fcxHnt3;
                                    hT6Px2xDdrmDEbykyYy = hT6Px2xDdrmDEbykyYy2;
                                    if (j < atomicLongFieldUpdater2.get(hT6Px2xDdrmDEbykyYy)) {
                                        j4oFIJEn5DDil3.dDIMxZXP1V8HdM();
                                    }
                                    w9sT1Swbhx3hs(hT6Px2xDdrmDEbykyYy, goFryeNz7Rqaz7fcxHnt2, hd886kxbkce8uPyu8ovAipBTLYAiKab);
                                    break;
                                } else {
                                    hd886kxbkce8uPyu8ovAipBTLYAiKab.dDIMxZXP1V8HdM(j4oFIJEn5DDil3, i3 + i2);
                                }
                                objJ0zjQ7CAgohuxU20eCW6 = hd886kxbkce8uPyu8ovAipBTLYAiKab.J0zjQ7CAgohuxU20eCW6();
                                if (objJ0zjQ7CAgohuxU20eCW6 != pjn1l01kdmwnpcy0dad) {
                                    objJ0zjQ7CAgohuxU20eCW6 = eo0e0FTdv96U7KeCzoB;
                                }
                                if (objJ0zjQ7CAgohuxU20eCW6 == pjn1l01kdmwnpcy0dad) {
                                    return objJ0zjQ7CAgohuxU20eCW6;
                                }
                            } else {
                                j4oFIJEn5DDil3.dDIMxZXP1V8HdM();
                            }
                            hd886kxbkce8uPyu8ovAipBTLYAiKab.ibVTtJUNfrGYbW(eo0e0FTdv96U7KeCzoB);
                            objJ0zjQ7CAgohuxU20eCW6 = hd886kxbkce8uPyu8ovAipBTLYAiKab.J0zjQ7CAgohuxU20eCW6();
                            if (objJ0zjQ7CAgohuxU20eCW6 != pjn1l01kdmwnpcy0dad) {
                                objJ0zjQ7CAgohuxU20eCW6 = eo0e0FTdv96U7KeCzoB;
                            }
                            if (objJ0zjQ7CAgohuxU20eCW6 == pjn1l01kdmwnpcy0dad) {
                                return objJ0zjQ7CAgohuxU20eCW6;
                            }
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    if (iEe8d2j4S9Vm5yGuR == i4) {
                        if (j < atomicLongFieldUpdater2.get(hT6Px2xDdrmDEbykyYy2)) {
                            j4oFIJEn5DDil3.dDIMxZXP1V8HdM();
                        }
                        Object objDTS0S7eC32ubQH54j37 = dTS0S7eC32ubQH54j36(goFryeNz7Rqaz7fcxHnt, vjpp6rthpasad);
                        if (objDTS0S7eC32ubQH54j37 != pjn1l01kdmwnpcy0dad) {
                            break;
                        }
                        return objDTS0S7eC32ubQH54j37;
                    }
                    if (iEe8d2j4S9Vm5yGuR == 5) {
                        j4oFIJEn5DDil3.dDIMxZXP1V8HdM();
                    }
                }
            } else if (zXiR1pIn5878vVWd) {
                j4oFIJEn5DDil3.b1EoSIRjJHO5();
                Object objDTS0S7eC32ubQH54j38 = dTS0S7eC32ubQH54j36(goFryeNz7Rqaz7fcxHnt, vjpp6rthpasad);
                if (objDTS0S7eC32ubQH54j38 == pjn1l01kdmwnpcy0dad) {
                    return objDTS0S7eC32ubQH54j38;
                }
            }
            return eo0e0FTdv96U7KeCzoB;
        }
        return eo0e0FTdv96U7KeCzoB;
    }

    public final boolean ibVTtJUNfrGYbW(Throwable th, boolean z) {
        HT6Px2xDdrmDEbykyYy hT6Px2xDdrmDEbykyYy;
        boolean z2;
        long j;
        long j2;
        long j3;
        Object obj;
        long j4;
        long j5;
        AtomicLongFieldUpdater atomicLongFieldUpdater = vekpFI4d1Nc4fakF;
        if (!z) {
            hT6Px2xDdrmDEbykyYy = this;
            break;
        }
        do {
            j5 = atomicLongFieldUpdater.get(this);
            if (((int) (j5 >> 60)) != 0) {
                hT6Px2xDdrmDEbykyYy = this;
                break;
            }
            J4oFIJEn5DDil2 j4oFIJEn5DDil2 = LYgmvfM6ccmccA0DV.dDIMxZXP1V8HdM;
            hT6Px2xDdrmDEbykyYy = this;
        } while (!atomicLongFieldUpdater.compareAndSet(hT6Px2xDdrmDEbykyYy, j5, (j5 & 1152921504606846975L) + (((long) 1) << 60)));
        o0rN3ekjBJ6kKwok o0rn3ekjbj6kkwok = LYgmvfM6ccmccA0DV.XiR1pIn5878vVWd;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = D5P1xCAyuvgF;
            if (atomicReferenceFieldUpdater.compareAndSet(this, o0rn3ekjbj6kkwok, th)) {
                z2 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != o0rn3ekjbj6kkwok) {
                z2 = false;
                break;
            }
        }
        if (z) {
            do {
                j4 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(hT6Px2xDdrmDEbykyYy, j4, (((long) 3) << 60) + (j4 & 1152921504606846975L)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(this);
                int i = (int) (j >> 60);
                if (i == 0) {
                    j2 = j & 1152921504606846975L;
                    j3 = 2;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j2 = j & 1152921504606846975L;
                    j3 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(hT6Px2xDdrmDEbykyYy, j, (j3 << 60) + j2));
        }
        H9XlUr4OeMJFiXK();
        if (z2) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = hjneShqpF9Tis4;
                obj = atomicReferenceFieldUpdater2.get(this);
                o0rN3ekjBJ6kKwok o0rn3ekjbj6kkwok2 = obj == null ? LYgmvfM6ccmccA0DV.J0zjQ7CAgohuxU20eCW6 : LYgmvfM6ccmccA0DV.MLSIo1htfMPWeB8V876L;
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, o0rn3ekjbj6kkwok2)) {
                        break loop3;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj);
            }
            if (obj != null) {
                FZ1sl4mHq4J0hOEYC.JXn4Qf7zpnLjP5(1, obj);
                ((deLJ4Z0aL3hcJ3O1) obj).pyu8ovAipBTLYAiKab(Qrz92kRPw4GcghAc());
                return z2;
            }
        }
        return z2;
    }

    public final boolean l1V0lQr6TbwNKqHfXNbb() {
        long j = Ee8d2j4S9Vm5yGuR.get(this);
        return j == 0 || j == Long.MAX_VALUE;
    }

    public final Throwable nQilHWaqS401ZtR() {
        Throwable thQrz92kRPw4GcghAc = Qrz92kRPw4GcghAc();
        return thQrz92kRPw4GcghAc == null ? new TIlE8KQMNcX68iPXhhLy("Channel was closed") : thQrz92kRPw4GcghAc;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0075  */
    /* JADX WARN: Code duplicated, block: B:24:0x0078  */
    /* JADX WARN: Code duplicated, block: B:26:0x007b  */
    /* JADX WARN: Code duplicated, block: B:28:0x007f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:33:0x008a  */
    /* JADX WARN: Code duplicated, block: B:37:0x009e  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0093 A[SYNTHETIC] */
    @Override // v.s.UDr2ORhCq7XyGYjS5
    public Object pyu8ovAipBTLYAiKab(Object obj) {
        int iEe8d2j4S9Vm5yGuR;
        Eo0e0FTdv96U7KeCzoB eo0e0FTdv96U7KeCzoB;
        S1QQVRz2bJQ7 s1QQVRz2bJQ7;
        AtomicLongFieldUpdater atomicLongFieldUpdater = vekpFI4d1Nc4fakF;
        long j = atomicLongFieldUpdater.get(this);
        boolean z = false;
        long j2 = 1152921504606846975L;
        boolean z2 = XiR1pIn5878vVWd(j, false) ? false : !xDyLpEZyrcKVe0(j & 1152921504606846975L);
        BuBD1pdyBtuGt0z buBD1pdyBtuGt0z = F5LI90Tmwo1KQ.w9sT1Swbhx3hs;
        if (z2) {
            return buBD1pdyBtuGt0z;
        }
        Object obj2 = LYgmvfM6ccmccA0DV.D5P1xCAyuvgF;
        J4oFIJEn5DDil2 j4oFIJEn5DDil2 = (J4oFIJEn5DDil2) ibVTtJUNfrGYbW.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = andIncrement & j2;
            boolean zXiR1pIn5878vVWd = XiR1pIn5878vVWd(andIncrement, z);
            int i = LYgmvfM6ccmccA0DV.w9sT1Swbhx3hs;
            long j4 = i;
            long j5 = j3 / j4;
            int i2 = (int) (j3 % j4);
            if (j4oFIJEn5DDil2.JXn4Qf7zpnLjP5 == j5) {
                iEe8d2j4S9Vm5yGuR = Ee8d2j4S9Vm5yGuR(this, j4oFIJEn5DDil2, i2, obj, j3, obj2, zXiR1pIn5878vVWd);
                eo0e0FTdv96U7KeCzoB = Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
                if (iEe8d2j4S9Vm5yGuR != 0) {
                    j4oFIJEn5DDil2.dDIMxZXP1V8HdM();
                    return eo0e0FTdv96U7KeCzoB;
                }
                if (iEe8d2j4S9Vm5yGuR != 1) {
                    return eo0e0FTdv96U7KeCzoB;
                }
                if (iEe8d2j4S9Vm5yGuR != 2) {
                    if (zXiR1pIn5878vVWd) {
                        j4oFIJEn5DDil2.b1EoSIRjJHO5();
                        return new Jdyt6TPRBOj1K9aOy91D(nQilHWaqS401ZtR());
                    }
                    if (obj2 instanceof S1QQVRz2bJQ7) {
                        s1QQVRz2bJQ7 = (S1QQVRz2bJQ7) obj2;
                    } else {
                        s1QQVRz2bJQ7 = null;
                    }
                    if (s1QQVRz2bJQ7 != null) {
                        s1QQVRz2bJQ7.dDIMxZXP1V8HdM(j4oFIJEn5DDil2, i2 + i);
                    }
                    j4oFIJEn5DDil2.b1EoSIRjJHO5();
                    return buBD1pdyBtuGt0z;
                }
                if (iEe8d2j4S9Vm5yGuR != 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (iEe8d2j4S9Vm5yGuR != 4) {
                    if (j3 < JXn4Qf7zpnLjP5.get(this)) {
                        j4oFIJEn5DDil2.dDIMxZXP1V8HdM();
                    }
                    return new Jdyt6TPRBOj1K9aOy91D(nQilHWaqS401ZtR());
                }
                if (iEe8d2j4S9Vm5yGuR == 5) {
                    j4oFIJEn5DDil2.dDIMxZXP1V8HdM();
                }
                z = false;
            } else {
                J4oFIJEn5DDil2 j4oFIJEn5DDil2DDIMxZXP1V8HdM = dDIMxZXP1V8HdM(this, j5, j4oFIJEn5DDil2);
                if (j4oFIJEn5DDil2DDIMxZXP1V8HdM != null) {
                    j4oFIJEn5DDil2 = j4oFIJEn5DDil2DDIMxZXP1V8HdM;
                    iEe8d2j4S9Vm5yGuR = Ee8d2j4S9Vm5yGuR(this, j4oFIJEn5DDil2, i2, obj, j3, obj2, zXiR1pIn5878vVWd);
                    eo0e0FTdv96U7KeCzoB = Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
                    if (iEe8d2j4S9Vm5yGuR != 0) {
                        j4oFIJEn5DDil2.dDIMxZXP1V8HdM();
                        return eo0e0FTdv96U7KeCzoB;
                    }
                    if (iEe8d2j4S9Vm5yGuR != 1) {
                        return eo0e0FTdv96U7KeCzoB;
                    }
                    if (iEe8d2j4S9Vm5yGuR != 2) {
                        if (zXiR1pIn5878vVWd) {
                            j4oFIJEn5DDil2.b1EoSIRjJHO5();
                            return new Jdyt6TPRBOj1K9aOy91D(nQilHWaqS401ZtR());
                        }
                        if (obj2 instanceof S1QQVRz2bJQ7) {
                            s1QQVRz2bJQ7 = (S1QQVRz2bJQ7) obj2;
                        } else {
                            s1QQVRz2bJQ7 = null;
                        }
                        if (s1QQVRz2bJQ7 != null) {
                            s1QQVRz2bJQ7.dDIMxZXP1V8HdM(j4oFIJEn5DDil2, i2 + i);
                        }
                        j4oFIJEn5DDil2.b1EoSIRjJHO5();
                        return buBD1pdyBtuGt0z;
                    }
                    if (iEe8d2j4S9Vm5yGuR != 3) {
                        throw new IllegalStateException("unexpected");
                    }
                    if (iEe8d2j4S9Vm5yGuR != 4) {
                        if (j3 < JXn4Qf7zpnLjP5.get(this)) {
                            j4oFIJEn5DDil2.dDIMxZXP1V8HdM();
                        }
                        return new Jdyt6TPRBOj1K9aOy91D(nQilHWaqS401ZtR());
                    }
                    if (iEe8d2j4S9Vm5yGuR == 5) {
                        j4oFIJEn5DDil2.dDIMxZXP1V8HdM();
                    }
                    z = false;
                } else {
                    if (zXiR1pIn5878vVWd) {
                        return new Jdyt6TPRBOj1K9aOy91D(nQilHWaqS401ZtR());
                    }
                    z = false;
                }
            }
            j2 = 1152921504606846975L;
        }
    }

    public final boolean rCHnHJBAlOpNI5(Object obj, Object obj2) {
        if (obj instanceof iyjZs74mUtBxDJ655) {
            return LYgmvfM6ccmccA0DV.dDIMxZXP1V8HdM(((iyjZs74mUtBxDJ655) obj).w9sT1Swbhx3hs, new F5LI90Tmwo1KQ(obj2), null);
        }
        if (obj instanceof OQ5dNvIVkA1dcss1) {
            OQ5dNvIVkA1dcss1 oQ5dNvIVkA1dcss1 = (OQ5dNvIVkA1dcss1) obj;
            hD886kxBkce8U hd886kxbkce8u = oQ5dNvIVkA1dcss1.vekpFI4d1Nc4fakF;
            oQ5dNvIVkA1dcss1.vekpFI4d1Nc4fakF = null;
            oQ5dNvIVkA1dcss1.w9sT1Swbhx3hs = obj2;
            return LYgmvfM6ccmccA0DV.dDIMxZXP1V8HdM(hd886kxbkce8u, Boolean.TRUE, null);
        }
        if (obj instanceof wxzKGhimDkb70lgmfb69) {
            return LYgmvfM6ccmccA0DV.dDIMxZXP1V8HdM((wxzKGhimDkb70lgmfb69) obj, obj2, null);
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    public final int tne6mXOUFKdd(J4oFIJEn5DDil2 j4oFIJEn5DDil2, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object objHjneShqpF9Tis4 = j4oFIJEn5DDil2.hjneShqpF9Tis4(i);
            if (objHjneShqpF9Tis4 == null) {
                if (!xDyLpEZyrcKVe0(j) || z) {
                    if (z) {
                        if (j4oFIJEn5DDil2.D5P1xCAyuvgF(null, i, LYgmvfM6ccmccA0DV.D5P1xCAyuvgF)) {
                            j4oFIJEn5DDil2.b1EoSIRjJHO5();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (j4oFIJEn5DDil2.D5P1xCAyuvgF(null, i, obj2)) {
                            return 2;
                        }
                    }
                } else if (j4oFIJEn5DDil2.D5P1xCAyuvgF(null, i, LYgmvfM6ccmccA0DV.JXn4Qf7zpnLjP5)) {
                    break;
                }
            } else {
                if (objHjneShqpF9Tis4 != LYgmvfM6ccmccA0DV.Ee8d2j4S9Vm5yGuR) {
                    o0rN3ekjBJ6kKwok o0rn3ekjbj6kkwok = LYgmvfM6ccmccA0DV.hjneShqpF9Tis4;
                    if (objHjneShqpF9Tis4 == o0rn3ekjbj6kkwok) {
                        j4oFIJEn5DDil2.gIIiyi2ddlMDR0(i, null);
                        return 5;
                    }
                    if (objHjneShqpF9Tis4 == LYgmvfM6ccmccA0DV.b1EoSIRjJHO5) {
                        j4oFIJEn5DDil2.gIIiyi2ddlMDR0(i, null);
                        return 5;
                    }
                    if (objHjneShqpF9Tis4 == LYgmvfM6ccmccA0DV.gmNWMfvn6zlEj) {
                        j4oFIJEn5DDil2.gIIiyi2ddlMDR0(i, null);
                        H9XlUr4OeMJFiXK();
                        return 4;
                    }
                    j4oFIJEn5DDil2.gIIiyi2ddlMDR0(i, null);
                    if (objHjneShqpF9Tis4 instanceof OGXArWikeWfH) {
                        objHjneShqpF9Tis4 = ((OGXArWikeWfH) objHjneShqpF9Tis4).dDIMxZXP1V8HdM;
                    }
                    if (rCHnHJBAlOpNI5(objHjneShqpF9Tis4, obj)) {
                        j4oFIJEn5DDil2.wotphlvK9sPbXJ(i, LYgmvfM6ccmccA0DV.pyu8ovAipBTLYAiKab);
                        return 0;
                    }
                    if (j4oFIJEn5DDil2.ibVTtJUNfrGYbW.getAndSet((i * 2) + 1, o0rn3ekjbj6kkwok) != o0rn3ekjbj6kkwok) {
                        j4oFIJEn5DDil2.gmNWMfvn6zlEj(i, true);
                    }
                    return 5;
                }
                if (j4oFIJEn5DDil2.D5P1xCAyuvgF(objHjneShqpF9Tis4, i, LYgmvfM6ccmccA0DV.JXn4Qf7zpnLjP5)) {
                    break;
                }
            }
        }
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        int i = (int) (vekpFI4d1Nc4fakF.get(this) >> 60);
        if (i == 2) {
            sb.append("closed,");
        } else if (i == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.w9sT1Swbhx3hs + ',');
        sb.append("data=[");
        int i2 = 0;
        boolean z = true;
        List listYTljMGnIibTRdOpSh4 = Aqh0grSwgDbwr.yTljMGnIibTRdOpSh4(b1EoSIRjJHO5.get(this), ibVTtJUNfrGYbW.get(this), pyu8ovAipBTLYAiKab.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listYTljMGnIibTRdOpSh4) {
            if (((J4oFIJEn5DDil2) obj) != LYgmvfM6ccmccA0DV.dDIMxZXP1V8HdM) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((J4oFIJEn5DDil2) next).JXn4Qf7zpnLjP5;
            do {
                Object next2 = it.next();
                long j2 = ((J4oFIJEn5DDil2) next2).JXn4Qf7zpnLjP5;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        J4oFIJEn5DDil2 j4oFIJEn5DDil2 = (J4oFIJEn5DDil2) next;
        long j3 = JXn4Qf7zpnLjP5.get(this);
        long jJ0zjQ7CAgohuxU20eCW6 = J0zjQ7CAgohuxU20eCW6();
        loop2: while (true) {
            int i3 = LYgmvfM6ccmccA0DV.w9sT1Swbhx3hs;
            int i4 = i2;
            while (i4 < i3) {
                long j4 = (j4oFIJEn5DDil2.JXn4Qf7zpnLjP5 * ((long) LYgmvfM6ccmccA0DV.w9sT1Swbhx3hs)) + ((long) i4);
                if (j4 >= jJ0zjQ7CAgohuxU20eCW6 && j4 >= j3) {
                    break loop2;
                }
                Object objHjneShqpF9Tis4 = j4oFIJEn5DDil2.hjneShqpF9Tis4(i4);
                boolean z2 = z;
                Object obj2 = j4oFIJEn5DDil2.ibVTtJUNfrGYbW.get(i4 * 2);
                if (objHjneShqpF9Tis4 instanceof wxzKGhimDkb70lgmfb69) {
                    string = (j4 >= j3 || j4 < jJ0zjQ7CAgohuxU20eCW6) ? (j4 >= jJ0zjQ7CAgohuxU20eCW6 || j4 < j3) ? "cont" : "send" : "receive";
                } else if (objHjneShqpF9Tis4 instanceof iyjZs74mUtBxDJ655) {
                    string = "receiveCatching";
                } else if (objHjneShqpF9Tis4 instanceof OGXArWikeWfH) {
                    string = "EB(" + objHjneShqpF9Tis4 + ')';
                } else if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(objHjneShqpF9Tis4, LYgmvfM6ccmccA0DV.xDyLpEZyrcKVe0) ? z2 : okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(objHjneShqpF9Tis4, LYgmvfM6ccmccA0DV.ibVTtJUNfrGYbW)) {
                    string = "resuming_sender";
                } else {
                    if (!(objHjneShqpF9Tis4 == null ? z2 : objHjneShqpF9Tis4.equals(LYgmvfM6ccmccA0DV.Ee8d2j4S9Vm5yGuR) ? z2 : okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(objHjneShqpF9Tis4, LYgmvfM6ccmccA0DV.pyu8ovAipBTLYAiKab) ? z2 : okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(objHjneShqpF9Tis4, LYgmvfM6ccmccA0DV.b1EoSIRjJHO5) ? z2 : okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(objHjneShqpF9Tis4, LYgmvfM6ccmccA0DV.hjneShqpF9Tis4) ? z2 : okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(objHjneShqpF9Tis4, LYgmvfM6ccmccA0DV.D5P1xCAyuvgF) ? z2 : okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(objHjneShqpF9Tis4, LYgmvfM6ccmccA0DV.gmNWMfvn6zlEj))) {
                        string = objHjneShqpF9Tis4.toString();
                    }
                    i4++;
                    z = z2;
                }
                if (obj2 != null) {
                    sb.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb.append(string + ',');
                }
                i4++;
                z = z2;
            }
            boolean z3 = z;
            j4oFIJEn5DDil2 = (J4oFIJEn5DDil2) j4oFIJEn5DDil2.w9sT1Swbhx3hs();
            if (j4oFIJEn5DDil2 == null) {
                break;
            }
            z = z3;
            i2 = 0;
        }
        if (KgSM0TsKUpCiuePB.t9CXKrwDxrnFA6g23hZU(sb) == ',') {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append("]");
        return sb.toString();
    }

    public final void vIJudZvPyTuNp(S1QQVRz2bJQ7 s1QQVRz2bJQ7, boolean z) {
        Throwable thNQilHWaqS401ZtR;
        if (s1QQVRz2bJQ7 instanceof wxzKGhimDkb70lgmfb69) {
            b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q = (b9xRoaXFR1fmOO2Q) s1QQVRz2bJQ7;
            if (z) {
                thNQilHWaqS401ZtR = Qrz92kRPw4GcghAc();
                if (thNQilHWaqS401ZtR == null) {
                    thNQilHWaqS401ZtR = new GF2XQtecfzOat6RtF("Channel was closed");
                }
            } else {
                thNQilHWaqS401ZtR = nQilHWaqS401ZtR();
            }
            b9xroaxfr1fmoo2q.ibVTtJUNfrGYbW(new VSZeS5mia3yEXbAe(thNQilHWaqS401ZtR));
            return;
        }
        if (s1QQVRz2bJQ7 instanceof iyjZs74mUtBxDJ655) {
            ((iyjZs74mUtBxDJ655) s1QQVRz2bJQ7).w9sT1Swbhx3hs.ibVTtJUNfrGYbW(new F5LI90Tmwo1KQ(new Jdyt6TPRBOj1K9aOy91D(Qrz92kRPw4GcghAc())));
            return;
        }
        if (!(s1QQVRz2bJQ7 instanceof OQ5dNvIVkA1dcss1)) {
            throw new IllegalStateException(("Unexpected waiter: " + s1QQVRz2bJQ7).toString());
        }
        OQ5dNvIVkA1dcss1 oQ5dNvIVkA1dcss1 = (OQ5dNvIVkA1dcss1) s1QQVRz2bJQ7;
        hD886kxBkce8U hd886kxbkce8u = oQ5dNvIVkA1dcss1.vekpFI4d1Nc4fakF;
        oQ5dNvIVkA1dcss1.vekpFI4d1Nc4fakF = null;
        oQ5dNvIVkA1dcss1.w9sT1Swbhx3hs = LYgmvfM6ccmccA0DV.gmNWMfvn6zlEj;
        Throwable thQrz92kRPw4GcghAc = oQ5dNvIVkA1dcss1.JXn4Qf7zpnLjP5.Qrz92kRPw4GcghAc();
        if (thQrz92kRPw4GcghAc == null) {
            hd886kxbkce8u.ibVTtJUNfrGYbW(Boolean.FALSE);
        } else {
            hd886kxbkce8u.ibVTtJUNfrGYbW(new VSZeS5mia3yEXbAe(thQrz92kRPw4GcghAc));
        }
    }

    @Override // v.s.gUw52pKTgwkb0KB
    public final void vekpFI4d1Nc4fakF(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        ibVTtJUNfrGYbW(cancellationException, true);
    }

    public final J4oFIJEn5DDil2 wotphlvK9sPbXJ(long j, J4oFIJEn5DDil2 j4oFIJEn5DDil2) {
        Object objGIIiyi2ddlMDR0;
        long j2;
        J4oFIJEn5DDil2 j4oFIJEn5DDil3 = LYgmvfM6ccmccA0DV.dDIMxZXP1V8HdM;
        SpFALcGAA4NXKhu spFALcGAA4NXKhu = SpFALcGAA4NXKhu.D5P1xCAyuvgF;
        loop0: while (true) {
            objGIIiyi2ddlMDR0 = SbxdZ6Kq2uhHQ5RPRqm.gIIiyi2ddlMDR0(j4oFIJEn5DDil2, j, spFALcGAA4NXKhu);
            if (!y6jRGLEWNMir.ibVTtJUNfrGYbW(objGIIiyi2ddlMDR0)) {
                endHZiILsQwz endhziilsqwzXDyLpEZyrcKVe0 = y6jRGLEWNMir.xDyLpEZyrcKVe0(objGIIiyi2ddlMDR0);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b1EoSIRjJHO5;
                    endHZiILsQwz endhziilsqwz = (endHZiILsQwz) atomicReferenceFieldUpdater.get(this);
                    if (endhziilsqwz.JXn4Qf7zpnLjP5 >= endhziilsqwzXDyLpEZyrcKVe0.JXn4Qf7zpnLjP5) {
                        break loop0;
                    }
                    if (!endhziilsqwzXDyLpEZyrcKVe0.pyu8ovAipBTLYAiKab()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, endhziilsqwz, endhziilsqwzXDyLpEZyrcKVe0)) {
                            if (!endhziilsqwz.Ee8d2j4S9Vm5yGuR()) {
                                break loop0;
                            }
                            endhziilsqwz.JXn4Qf7zpnLjP5();
                            break loop0;
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
        if (y6jRGLEWNMir.ibVTtJUNfrGYbW(objGIIiyi2ddlMDR0)) {
            H9XlUr4OeMJFiXK();
            if (j4oFIJEn5DDil2.JXn4Qf7zpnLjP5 * ((long) LYgmvfM6ccmccA0DV.w9sT1Swbhx3hs) < J0zjQ7CAgohuxU20eCW6()) {
                j4oFIJEn5DDil2.dDIMxZXP1V8HdM();
                return null;
            }
        } else {
            J4oFIJEn5DDil2 j4oFIJEn5DDil4 = (J4oFIJEn5DDil2) y6jRGLEWNMir.xDyLpEZyrcKVe0(objGIIiyi2ddlMDR0);
            long j3 = j4oFIJEn5DDil4.JXn4Qf7zpnLjP5;
            if (!l1V0lQr6TbwNKqHfXNbb() && j <= Ee8d2j4S9Vm5yGuR.get(this) / ((long) LYgmvfM6ccmccA0DV.w9sT1Swbhx3hs)) {
                loop3: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = pyu8ovAipBTLYAiKab;
                    endHZiILsQwz endhziilsqwz2 = (endHZiILsQwz) atomicReferenceFieldUpdater2.get(this);
                    if (endhziilsqwz2.JXn4Qf7zpnLjP5 >= j3 || !j4oFIJEn5DDil4.pyu8ovAipBTLYAiKab()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, endhziilsqwz2, j4oFIJEn5DDil4)) {
                            if (!endhziilsqwz2.Ee8d2j4S9Vm5yGuR()) {
                                break loop3;
                            }
                            endhziilsqwz2.JXn4Qf7zpnLjP5();
                            break loop3;
                        }
                    } while (atomicReferenceFieldUpdater2.get(this) == endhziilsqwz2);
                    if (j4oFIJEn5DDil4.Ee8d2j4S9Vm5yGuR()) {
                        j4oFIJEn5DDil4.JXn4Qf7zpnLjP5();
                    }
                }
            }
            if (j3 <= j) {
                return j4oFIJEn5DDil4;
            }
            long j4 = j3 * ((long) LYgmvfM6ccmccA0DV.w9sT1Swbhx3hs);
            do {
                j2 = JXn4Qf7zpnLjP5.get(this);
                if (j2 >= j4) {
                    break;
                }
            } while (!JXn4Qf7zpnLjP5.compareAndSet(this, j2, j4));
            if (j3 * ((long) LYgmvfM6ccmccA0DV.w9sT1Swbhx3hs) < J0zjQ7CAgohuxU20eCW6()) {
                j4oFIJEn5DDil4.dDIMxZXP1V8HdM();
            }
        }
        return null;
    }

    public final boolean xDyLpEZyrcKVe0(long j) {
        return j < Ee8d2j4S9Vm5yGuR.get(this) || j < JXn4Qf7zpnLjP5.get(this) + ((long) this.w9sT1Swbhx3hs);
    }

    public final Object xfn2GJwmGqs7kWW(J4oFIJEn5DDil2 j4oFIJEn5DDil2, int i, long j, Object obj) {
        Object objHjneShqpF9Tis4 = j4oFIJEn5DDil2.hjneShqpF9Tis4(i);
        AtomicReferenceArray atomicReferenceArray = j4oFIJEn5DDil2.ibVTtJUNfrGYbW;
        AtomicLongFieldUpdater atomicLongFieldUpdater = vekpFI4d1Nc4fakF;
        if (objHjneShqpF9Tis4 == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return LYgmvfM6ccmccA0DV.wotphlvK9sPbXJ;
                }
                if (j4oFIJEn5DDil2.D5P1xCAyuvgF(objHjneShqpF9Tis4, i, obj)) {
                    gIIiyi2ddlMDR0();
                    return LYgmvfM6ccmccA0DV.gIIiyi2ddlMDR0;
                }
            }
        } else if (objHjneShqpF9Tis4 == LYgmvfM6ccmccA0DV.JXn4Qf7zpnLjP5 && j4oFIJEn5DDil2.D5P1xCAyuvgF(objHjneShqpF9Tis4, i, LYgmvfM6ccmccA0DV.pyu8ovAipBTLYAiKab)) {
            gIIiyi2ddlMDR0();
            Object obj2 = atomicReferenceArray.get(i * 2);
            j4oFIJEn5DDil2.gIIiyi2ddlMDR0(i, null);
            return obj2;
        }
        while (true) {
            Object objHjneShqpF9Tis5 = j4oFIJEn5DDil2.hjneShqpF9Tis4(i);
            if (objHjneShqpF9Tis5 == null || objHjneShqpF9Tis5 == LYgmvfM6ccmccA0DV.Ee8d2j4S9Vm5yGuR) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (j4oFIJEn5DDil2.D5P1xCAyuvgF(objHjneShqpF9Tis5, i, LYgmvfM6ccmccA0DV.b1EoSIRjJHO5)) {
                        gIIiyi2ddlMDR0();
                        return LYgmvfM6ccmccA0DV.Qrz92kRPw4GcghAc;
                    }
                } else {
                    if (obj == null) {
                        return LYgmvfM6ccmccA0DV.wotphlvK9sPbXJ;
                    }
                    if (j4oFIJEn5DDil2.D5P1xCAyuvgF(objHjneShqpF9Tis5, i, obj)) {
                        gIIiyi2ddlMDR0();
                        return LYgmvfM6ccmccA0DV.gIIiyi2ddlMDR0;
                    }
                }
            } else if (objHjneShqpF9Tis5 != LYgmvfM6ccmccA0DV.JXn4Qf7zpnLjP5) {
                o0rN3ekjBJ6kKwok o0rn3ekjbj6kkwok = LYgmvfM6ccmccA0DV.D5P1xCAyuvgF;
                if (objHjneShqpF9Tis5 == o0rn3ekjbj6kkwok) {
                    return LYgmvfM6ccmccA0DV.Qrz92kRPw4GcghAc;
                }
                if (objHjneShqpF9Tis5 == LYgmvfM6ccmccA0DV.b1EoSIRjJHO5) {
                    return LYgmvfM6ccmccA0DV.Qrz92kRPw4GcghAc;
                }
                if (objHjneShqpF9Tis5 == LYgmvfM6ccmccA0DV.gmNWMfvn6zlEj) {
                    gIIiyi2ddlMDR0();
                    return LYgmvfM6ccmccA0DV.Qrz92kRPw4GcghAc;
                }
                if (objHjneShqpF9Tis5 != LYgmvfM6ccmccA0DV.ibVTtJUNfrGYbW && j4oFIJEn5DDil2.D5P1xCAyuvgF(objHjneShqpF9Tis5, i, LYgmvfM6ccmccA0DV.xDyLpEZyrcKVe0)) {
                    boolean z = objHjneShqpF9Tis5 instanceof OGXArWikeWfH;
                    if (z) {
                        objHjneShqpF9Tis5 = ((OGXArWikeWfH) objHjneShqpF9Tis5).dDIMxZXP1V8HdM;
                    }
                    if (O2DHNSIGZlgPja7eqLgn(objHjneShqpF9Tis5)) {
                        j4oFIJEn5DDil2.wotphlvK9sPbXJ(i, LYgmvfM6ccmccA0DV.pyu8ovAipBTLYAiKab);
                        gIIiyi2ddlMDR0();
                        Object obj3 = atomicReferenceArray.get(i * 2);
                        j4oFIJEn5DDil2.gIIiyi2ddlMDR0(i, null);
                        return obj3;
                    }
                    j4oFIJEn5DDil2.wotphlvK9sPbXJ(i, o0rn3ekjbj6kkwok);
                    j4oFIJEn5DDil2.b1EoSIRjJHO5();
                    if (z) {
                        gIIiyi2ddlMDR0();
                    }
                    return LYgmvfM6ccmccA0DV.Qrz92kRPw4GcghAc;
                }
            } else if (j4oFIJEn5DDil2.D5P1xCAyuvgF(objHjneShqpF9Tis5, i, LYgmvfM6ccmccA0DV.pyu8ovAipBTLYAiKab)) {
                gIIiyi2ddlMDR0();
                Object obj4 = atomicReferenceArray.get(i * 2);
                j4oFIJEn5DDil2.gIIiyi2ddlMDR0(i, null);
                return obj4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    public final Object yTljMGnIibTRdOpSh4(J4oFIJEn5DDil2 j4oFIJEn5DDil2, int i, long j, CWIOrUfHtKyaxQib0W cWIOrUfHtKyaxQib0W) {
        JWtuCeccCIzS4k jWtuCeccCIzS4k;
        F5LI90Tmwo1KQ f5LI90Tmwo1KQ;
        J4oFIJEn5DDil2 j4oFIJEn5DDil3;
        if (cWIOrUfHtKyaxQib0W instanceof JWtuCeccCIzS4k) {
            jWtuCeccCIzS4k = (JWtuCeccCIzS4k) cWIOrUfHtKyaxQib0W;
            int i2 = jWtuCeccCIzS4k.ibVTtJUNfrGYbW;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jWtuCeccCIzS4k.ibVTtJUNfrGYbW = i2 - Integer.MIN_VALUE;
            } else {
                jWtuCeccCIzS4k = new JWtuCeccCIzS4k(this, cWIOrUfHtKyaxQib0W);
            }
        } else {
            jWtuCeccCIzS4k = new JWtuCeccCIzS4k(this, cWIOrUfHtKyaxQib0W);
        }
        Object objJ0zjQ7CAgohuxU20eCW6 = jWtuCeccCIzS4k.Ee8d2j4S9Vm5yGuR;
        int i3 = jWtuCeccCIzS4k.ibVTtJUNfrGYbW;
        ?? r2 = (-23) + 24;
        if (i3 == 0) {
            SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(objJ0zjQ7CAgohuxU20eCW6);
            jWtuCeccCIzS4k.ibVTtJUNfrGYbW = r2;
            hD886kxBkce8U hd886kxbkce8uPyu8ovAipBTLYAiKab = jb8et6SZeK5TWMrJFxDX.pyu8ovAipBTLYAiKab(jb8et6SZeK5TWMrJFxDX.J0zjQ7CAgohuxU20eCW6(jWtuCeccCIzS4k));
            try {
                iyjZs74mUtBxDJ655 iyjzs74mutbxdj655 = new iyjZs74mUtBxDJ655(hd886kxbkce8uPyu8ovAipBTLYAiKab);
                HT6Px2xDdrmDEbykyYy hT6Px2xDdrmDEbykyYy = this;
                Object objXfn2GJwmGqs7kWW = hT6Px2xDdrmDEbykyYy.xfn2GJwmGqs7kWW(j4oFIJEn5DDil2, i, j, iyjzs74mutbxdj655);
                if (objXfn2GJwmGqs7kWW == LYgmvfM6ccmccA0DV.gIIiyi2ddlMDR0) {
                    iyjzs74mutbxdj655.dDIMxZXP1V8HdM(j4oFIJEn5DDil2, i);
                } else {
                    if (objXfn2GJwmGqs7kWW == LYgmvfM6ccmccA0DV.Qrz92kRPw4GcghAc) {
                        if (j < J0zjQ7CAgohuxU20eCW6()) {
                            j4oFIJEn5DDil2.dDIMxZXP1V8HdM();
                        }
                        J4oFIJEn5DDil2 j4oFIJEn5DDil4 = (J4oFIJEn5DDil2) b1EoSIRjJHO5.get(this);
                        while (true) {
                            if (XiR1pIn5878vVWd(vekpFI4d1Nc4fakF.get(this), r2)) {
                                hd886kxbkce8uPyu8ovAipBTLYAiKab.ibVTtJUNfrGYbW(new F5LI90Tmwo1KQ(new Jdyt6TPRBOj1K9aOy91D(Qrz92kRPw4GcghAc())));
                            } else {
                                long andIncrement = JXn4Qf7zpnLjP5.getAndIncrement(this);
                                long j2 = LYgmvfM6ccmccA0DV.w9sT1Swbhx3hs;
                                long j3 = andIncrement / j2;
                                int i4 = (int) (andIncrement % j2);
                                if (j4oFIJEn5DDil4.JXn4Qf7zpnLjP5 != j3) {
                                    J4oFIJEn5DDil2 j4oFIJEn5DDil2WotphlvK9sPbXJ = wotphlvK9sPbXJ(j3, j4oFIJEn5DDil4);
                                    if (j4oFIJEn5DDil2WotphlvK9sPbXJ != null) {
                                        j4oFIJEn5DDil3 = j4oFIJEn5DDil2WotphlvK9sPbXJ;
                                    }
                                } else {
                                    j4oFIJEn5DDil3 = j4oFIJEn5DDil4;
                                }
                                Object objXfn2GJwmGqs7kWW2 = hT6Px2xDdrmDEbykyYy.xfn2GJwmGqs7kWW(j4oFIJEn5DDil3, i4, andIncrement, iyjzs74mutbxdj655);
                                J4oFIJEn5DDil2 j4oFIJEn5DDil5 = j4oFIJEn5DDil3;
                                if (objXfn2GJwmGqs7kWW2 == LYgmvfM6ccmccA0DV.gIIiyi2ddlMDR0) {
                                    iyjzs74mutbxdj655.dDIMxZXP1V8HdM(j4oFIJEn5DDil5, i4);
                                } else if (objXfn2GJwmGqs7kWW2 == LYgmvfM6ccmccA0DV.Qrz92kRPw4GcghAc) {
                                    if (andIncrement < J0zjQ7CAgohuxU20eCW6()) {
                                        j4oFIJEn5DDil5.dDIMxZXP1V8HdM();
                                    }
                                    hT6Px2xDdrmDEbykyYy = this;
                                    j4oFIJEn5DDil4 = j4oFIJEn5DDil5;
                                } else {
                                    if (objXfn2GJwmGqs7kWW2 == LYgmvfM6ccmccA0DV.wotphlvK9sPbXJ) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    j4oFIJEn5DDil5.dDIMxZXP1V8HdM();
                                    f5LI90Tmwo1KQ = new F5LI90Tmwo1KQ(objXfn2GJwmGqs7kWW2);
                                }
                            }
                        }
                    } else {
                        j4oFIJEn5DDil2.dDIMxZXP1V8HdM();
                        f5LI90Tmwo1KQ = new F5LI90Tmwo1KQ(objXfn2GJwmGqs7kWW);
                    }
                    hd886kxbkce8uPyu8ovAipBTLYAiKab.EWUjsTERgdPbSw3NNlN(f5LI90Tmwo1KQ, hd886kxbkce8uPyu8ovAipBTLYAiKab.JXn4Qf7zpnLjP5, null);
                }
                objJ0zjQ7CAgohuxU20eCW6 = hd886kxbkce8uPyu8ovAipBTLYAiKab.J0zjQ7CAgohuxU20eCW6();
                pjN1L01KDMWnPCy0daD pjn1l01kdmwnpcy0dad = pjN1L01KDMWnPCy0daD.w9sT1Swbhx3hs;
                if (objJ0zjQ7CAgohuxU20eCW6 == pjn1l01kdmwnpcy0dad) {
                    return pjn1l01kdmwnpcy0dad;
                }
            } catch (Throwable th) {
                hd886kxbkce8uPyu8ovAipBTLYAiKab.dTS0S7eC32ubQH54j36();
                throw th;
            }
        } else {
            if (i3 != r2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(objJ0zjQ7CAgohuxU20eCW6);
        }
        return ((F5LI90Tmwo1KQ) objJ0zjQ7CAgohuxU20eCW6).dDIMxZXP1V8HdM;
    }
}
