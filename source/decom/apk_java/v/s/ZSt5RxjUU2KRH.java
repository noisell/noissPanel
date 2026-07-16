package v.s;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class ZSt5RxjUU2KRH extends Thread {
    public static final AtomicIntegerFieldUpdater D5P1xCAyuvgF = AtomicIntegerFieldUpdater.newUpdater(ZSt5RxjUU2KRH.class, "workerCtl");
    public long Ee8d2j4S9Vm5yGuR;
    public int JXn4Qf7zpnLjP5;
    public boolean b1EoSIRjJHO5;
    public int ibVTtJUNfrGYbW;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    public final /* synthetic */ pdRVkdqnInX2Z3mdd pyu8ovAipBTLYAiKab;
    public final aqjfZUF02xH6w vekpFI4d1Nc4fakF;
    public final rBaarsM55BtPU5 w9sT1Swbhx3hs;
    private volatile int workerCtl;
    public long xDyLpEZyrcKVe0;

    public ZSt5RxjUU2KRH(pdRVkdqnInX2Z3mdd pdrvkdqninx2z3mdd, int i) {
        this.pyu8ovAipBTLYAiKab = pdrvkdqninx2z3mdd;
        setDaemon(true);
        this.w9sT1Swbhx3hs = new rBaarsM55BtPU5();
        this.vekpFI4d1Nc4fakF = new aqjfZUF02xH6w();
        this.JXn4Qf7zpnLjP5 = 4;
        this.nextParkedWorker = pdRVkdqnInX2Z3mdd.gmNWMfvn6zlEj;
        this.ibVTtJUNfrGYbW = lMJPWn8FzeWU82pNUhWl.w9sT1Swbhx3hs.w9sT1Swbhx3hs();
        xDyLpEZyrcKVe0(i);
    }

    public final xya403kVTOXbAjP0he3 Ee8d2j4S9Vm5yGuR() {
        int iJXn4Qf7zpnLjP5 = JXn4Qf7zpnLjP5(2);
        pdRVkdqnInX2Z3mdd pdrvkdqninx2z3mdd = this.pyu8ovAipBTLYAiKab;
        if (iJXn4Qf7zpnLjP5 == 0) {
            xya403kVTOXbAjP0he3 xya403kvtoxbajp0he3 = (xya403kVTOXbAjP0he3) pdrvkdqninx2z3mdd.xDyLpEZyrcKVe0.JXn4Qf7zpnLjP5();
            return xya403kvtoxbajp0he3 != null ? xya403kvtoxbajp0he3 : (xya403kVTOXbAjP0he3) pdrvkdqninx2z3mdd.ibVTtJUNfrGYbW.JXn4Qf7zpnLjP5();
        }
        xya403kVTOXbAjP0he3 xya403kvtoxbajp0he4 = (xya403kVTOXbAjP0he3) pdrvkdqninx2z3mdd.ibVTtJUNfrGYbW.JXn4Qf7zpnLjP5();
        return xya403kvtoxbajp0he4 != null ? xya403kvtoxbajp0he4 : (xya403kVTOXbAjP0he3) pdrvkdqninx2z3mdd.xDyLpEZyrcKVe0.JXn4Qf7zpnLjP5();
    }

    public final int JXn4Qf7zpnLjP5(int i) {
        int i2 = this.ibVTtJUNfrGYbW;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.ibVTtJUNfrGYbW = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b1EoSIRjJHO5(int i) {
        int i2 = this.JXn4Qf7zpnLjP5;
        int i3 = (-61) + 62;
        boolean z = i3;
        if (i2 != i3) {
            z = 0;
        }
        if (z != 0) {
            pdRVkdqnInX2Z3mdd.D5P1xCAyuvgF.addAndGet(this.pyu8ovAipBTLYAiKab, 4398046511104L);
        }
        if (i2 != i) {
            this.JXn4Qf7zpnLjP5 = i;
        }
        return z;
    }

    public final xya403kVTOXbAjP0he3 dDIMxZXP1V8HdM(boolean z) {
        xya403kVTOXbAjP0he3 xya403kvtoxbajp0he3Ee8d2j4S9Vm5yGuR;
        xya403kVTOXbAjP0he3 xya403kvtoxbajp0he3Ee8d2j4S9Vm5yGuR2;
        long j;
        int i = this.JXn4Qf7zpnLjP5;
        pdRVkdqnInX2Z3mdd pdrvkdqninx2z3mdd = this.pyu8ovAipBTLYAiKab;
        xya403kVTOXbAjP0he3 xya403kvtoxbajp0he3 = null;
        rBaarsM55BtPU5 rbaarsm55btpu5 = this.w9sT1Swbhx3hs;
        if (i != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = pdRVkdqnInX2Z3mdd.D5P1xCAyuvgF;
            do {
                j = atomicLongFieldUpdater.get(pdrvkdqninx2z3mdd);
                if (((int) ((9223367638808264704L & j) >> (62 - 20))) == 0) {
                    rbaarsm55btpu5.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = rBaarsM55BtPU5.w9sT1Swbhx3hs;
                        xya403kVTOXbAjP0he3 xya403kvtoxbajp0he4 = (xya403kVTOXbAjP0he3) atomicReferenceFieldUpdater.get(rbaarsm55btpu5);
                        if (xya403kvtoxbajp0he4 == null || xya403kvtoxbajp0he4.vekpFI4d1Nc4fakF.dDIMxZXP1V8HdM != 1) {
                            int i2 = rBaarsM55BtPU5.JXn4Qf7zpnLjP5.get(rbaarsm55btpu5);
                            int i3 = rBaarsM55BtPU5.vekpFI4d1Nc4fakF.get(rbaarsm55btpu5);
                            while (i2 != i3 && rBaarsM55BtPU5.Ee8d2j4S9Vm5yGuR.get(rbaarsm55btpu5) != 0) {
                                i3--;
                                xya403kVTOXbAjP0he3 xya403kvtoxbajp0he3VekpFI4d1Nc4fakF = rbaarsm55btpu5.vekpFI4d1Nc4fakF(i3, true);
                                if (xya403kvtoxbajp0he3VekpFI4d1Nc4fakF != null) {
                                    xya403kvtoxbajp0he3 = xya403kvtoxbajp0he3VekpFI4d1Nc4fakF;
                                    break;
                                }
                            }
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(rbaarsm55btpu5, xya403kvtoxbajp0he4, null)) {
                                xya403kvtoxbajp0he3 = xya403kvtoxbajp0he4;
                                break loop1;
                            }
                        } while (atomicReferenceFieldUpdater.get(rbaarsm55btpu5) == xya403kvtoxbajp0he4);
                    }
                    if (xya403kvtoxbajp0he3 != null) {
                        return xya403kvtoxbajp0he3;
                    }
                    xya403kVTOXbAjP0he3 xya403kvtoxbajp0he5 = (xya403kVTOXbAjP0he3) pdrvkdqninx2z3mdd.ibVTtJUNfrGYbW.JXn4Qf7zpnLjP5();
                    return xya403kvtoxbajp0he5 == null ? pyu8ovAipBTLYAiKab(1) : xya403kvtoxbajp0he5;
                }
            } while (!pdRVkdqnInX2Z3mdd.D5P1xCAyuvgF.compareAndSet(pdrvkdqninx2z3mdd, j, j - 4398046511104L));
            this.JXn4Qf7zpnLjP5 = 1;
        }
        if (z) {
            boolean z2 = JXn4Qf7zpnLjP5(pdrvkdqninx2z3mdd.w9sT1Swbhx3hs * 2) == 0;
            if (z2 && (xya403kvtoxbajp0he3Ee8d2j4S9Vm5yGuR2 = Ee8d2j4S9Vm5yGuR()) != null) {
                return xya403kvtoxbajp0he3Ee8d2j4S9Vm5yGuR2;
            }
            rbaarsm55btpu5.getClass();
            xya403kVTOXbAjP0he3 xya403kvtoxbajp0he3W9sT1Swbhx3hs = (xya403kVTOXbAjP0he3) rBaarsM55BtPU5.w9sT1Swbhx3hs.getAndSet(rbaarsm55btpu5, null);
            if (xya403kvtoxbajp0he3W9sT1Swbhx3hs == null) {
                xya403kvtoxbajp0he3W9sT1Swbhx3hs = rbaarsm55btpu5.w9sT1Swbhx3hs();
            }
            if (xya403kvtoxbajp0he3W9sT1Swbhx3hs != null) {
                return xya403kvtoxbajp0he3W9sT1Swbhx3hs;
            }
            if (!z2 && (xya403kvtoxbajp0he3Ee8d2j4S9Vm5yGuR = Ee8d2j4S9Vm5yGuR()) != null) {
                return xya403kvtoxbajp0he3Ee8d2j4S9Vm5yGuR;
            }
        } else {
            xya403kVTOXbAjP0he3 xya403kvtoxbajp0he3Ee8d2j4S9Vm5yGuR3 = Ee8d2j4S9Vm5yGuR();
            if (xya403kvtoxbajp0he3Ee8d2j4S9Vm5yGuR3 != null) {
                return xya403kvtoxbajp0he3Ee8d2j4S9Vm5yGuR3;
            }
        }
        return pyu8ovAipBTLYAiKab(3);
    }

    public final void ibVTtJUNfrGYbW(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final xya403kVTOXbAjP0he3 pyu8ovAipBTLYAiKab(int i) {
        long j;
        xya403kVTOXbAjP0he3 xya403kvtoxbajp0he3VekpFI4d1Nc4fakF;
        long j2;
        long j3;
        xya403kVTOXbAjP0he3 xya403kvtoxbajp0he3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = pdRVkdqnInX2Z3mdd.D5P1xCAyuvgF;
        pdRVkdqnInX2Z3mdd pdrvkdqninx2z3mdd = this.pyu8ovAipBTLYAiKab;
        int i2 = (int) (atomicLongFieldUpdater.get(pdrvkdqninx2z3mdd) & 2097151);
        xya403kVTOXbAjP0he3 xya403kvtoxbajp0he4 = null;
        if (i2 < 2) {
            return null;
        }
        int iJXn4Qf7zpnLjP5 = JXn4Qf7zpnLjP5(i2);
        int i3 = 0;
        long jMin = Long.MAX_VALUE;
        while (i3 < i2) {
            iJXn4Qf7zpnLjP5++;
            if (iJXn4Qf7zpnLjP5 > i2) {
                iJXn4Qf7zpnLjP5 = 1;
            }
            ZSt5RxjUU2KRH zSt5RxjUU2KRH = (ZSt5RxjUU2KRH) pdrvkdqninx2z3mdd.b1EoSIRjJHO5.w9sT1Swbhx3hs(iJXn4Qf7zpnLjP5);
            if (zSt5RxjUU2KRH != null && zSt5RxjUU2KRH != this) {
                rBaarsM55BtPU5 rbaarsm55btpu5 = zSt5RxjUU2KRH.w9sT1Swbhx3hs;
                if (i != 3) {
                    rbaarsm55btpu5.getClass();
                    int i4 = rBaarsM55BtPU5.JXn4Qf7zpnLjP5.get(rbaarsm55btpu5);
                    int i5 = rBaarsM55BtPU5.vekpFI4d1Nc4fakF.get(rbaarsm55btpu5);
                    boolean z = i == 1;
                    while (true) {
                        if (i4 != i5) {
                            j = 0;
                            if (!z || rBaarsM55BtPU5.Ee8d2j4S9Vm5yGuR.get(rbaarsm55btpu5) != 0) {
                                int i6 = i4 + 1;
                                xya403kvtoxbajp0he3VekpFI4d1Nc4fakF = rbaarsm55btpu5.vekpFI4d1Nc4fakF(i4, z);
                                if (xya403kvtoxbajp0he3VekpFI4d1Nc4fakF != null) {
                                    break;
                                }
                                i4 = i6;
                            }
                        } else {
                            j = 0;
                        }
                        xya403kvtoxbajp0he3VekpFI4d1Nc4fakF = xya403kvtoxbajp0he4;
                        break;
                    }
                } else {
                    xya403kvtoxbajp0he3VekpFI4d1Nc4fakF = rbaarsm55btpu5.w9sT1Swbhx3hs();
                    j = 0;
                }
                aqjfZUF02xH6w aqjfzuf02xh6w = this.vekpFI4d1Nc4fakF;
                if (xya403kvtoxbajp0he3VekpFI4d1Nc4fakF == null) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = rBaarsM55BtPU5.w9sT1Swbhx3hs;
                        xya403kVTOXbAjP0he3 xya403kvtoxbajp0he5 = (xya403kVTOXbAjP0he3) atomicReferenceFieldUpdater.get(rbaarsm55btpu5);
                        if (xya403kvtoxbajp0he5 == null) {
                            j2 = -1;
                        } else {
                            j2 = -1;
                            if (((xya403kvtoxbajp0he5.vekpFI4d1Nc4fakF.dDIMxZXP1V8HdM == 1 ? 1 : 2) & i) != 0) {
                                PdgYASR7b2Di.xDyLpEZyrcKVe0.getClass();
                                rBaarsM55BtPU5 rbaarsm55btpu6 = rbaarsm55btpu5;
                                long jNanoTime = System.nanoTime() - xya403kvtoxbajp0he5.w9sT1Swbhx3hs;
                                long j4 = PdgYASR7b2Di.w9sT1Swbhx3hs;
                                if (jNanoTime < j4) {
                                    j3 = j4 - jNanoTime;
                                    xya403kvtoxbajp0he3 = null;
                                    break;
                                }
                                do {
                                    xya403kvtoxbajp0he3 = null;
                                    if (atomicReferenceFieldUpdater.compareAndSet(rbaarsm55btpu6, xya403kvtoxbajp0he5, null)) {
                                        aqjfzuf02xh6w.w9sT1Swbhx3hs = xya403kvtoxbajp0he5;
                                        j3 = -1;
                                        break;
                                    }
                                } while (atomicReferenceFieldUpdater.get(rbaarsm55btpu6) == xya403kvtoxbajp0he5);
                                rbaarsm55btpu5 = rbaarsm55btpu6;
                                xya403kvtoxbajp0he4 = null;
                            }
                        }
                        j3 = -2;
                        xya403kvtoxbajp0he3 = xya403kvtoxbajp0he4;
                        break;
                    }
                } else {
                    aqjfzuf02xh6w.w9sT1Swbhx3hs = xya403kvtoxbajp0he3VekpFI4d1Nc4fakF;
                    xya403kvtoxbajp0he3 = xya403kvtoxbajp0he4;
                    j3 = -1;
                    j2 = -1;
                }
                if (j3 == j2) {
                    xya403kVTOXbAjP0he3 xya403kvtoxbajp0he6 = (xya403kVTOXbAjP0he3) aqjfzuf02xh6w.w9sT1Swbhx3hs;
                    aqjfzuf02xh6w.w9sT1Swbhx3hs = xya403kvtoxbajp0he3;
                    return xya403kvtoxbajp0he6;
                }
                if (j3 > j) {
                    jMin = Math.min(jMin, j3);
                }
            }
            i3++;
            xya403kvtoxbajp0he4 = null;
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.xDyLpEZyrcKVe0 = jMin;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        long j;
        loop0: while (true) {
            boolean z = false;
            while (true) {
                if (pdRVkdqnInX2Z3mdd.hjneShqpF9Tis4.get(this.pyu8ovAipBTLYAiKab) != 0 || this.JXn4Qf7zpnLjP5 == 5) {
                    break loop0;
                }
                xya403kVTOXbAjP0he3 xya403kvtoxbajp0he3DDIMxZXP1V8HdM = dDIMxZXP1V8HdM(this.b1EoSIRjJHO5);
                if (xya403kvtoxbajp0he3DDIMxZXP1V8HdM != null) {
                    this.xDyLpEZyrcKVe0 = 0L;
                    pdRVkdqnInX2Z3mdd pdrvkdqninx2z3mdd = this.pyu8ovAipBTLYAiKab;
                    int i = xya403kvtoxbajp0he3DDIMxZXP1V8HdM.vekpFI4d1Nc4fakF.dDIMxZXP1V8HdM;
                    this.Ee8d2j4S9Vm5yGuR = 0L;
                    if (this.JXn4Qf7zpnLjP5 == 3) {
                        this.JXn4Qf7zpnLjP5 = 2;
                    }
                    if (i != 0 && b1EoSIRjJHO5(2) && !pdrvkdqninx2z3mdd.DVTNwpDEVsUKuznof() && !pdrvkdqninx2z3mdd.Qrz92kRPw4GcghAc(pdRVkdqnInX2Z3mdd.D5P1xCAyuvgF.get(pdrvkdqninx2z3mdd))) {
                        pdrvkdqninx2z3mdd.DVTNwpDEVsUKuznof();
                    }
                    try {
                        xya403kvtoxbajp0he3DDIMxZXP1V8HdM.run();
                    } catch (Throwable th) {
                        Thread threadCurrentThread = Thread.currentThread();
                        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                    }
                    if (i != 0) {
                        pdRVkdqnInX2Z3mdd.D5P1xCAyuvgF.addAndGet(pdrvkdqninx2z3mdd, -2097152L);
                        if (this.JXn4Qf7zpnLjP5 == 5) {
                            break;
                        }
                        this.JXn4Qf7zpnLjP5 = (-41) + 45;
                        break;
                    }
                    break;
                }
                this.b1EoSIRjJHO5 = false;
                if (this.xDyLpEZyrcKVe0 == 0) {
                    Object obj = this.nextParkedWorker;
                    o0rN3ekjBJ6kKwok o0rn3ekjbj6kkwok = pdRVkdqnInX2Z3mdd.gmNWMfvn6zlEj;
                    if (obj != o0rn3ekjbj6kkwok) {
                        D5P1xCAyuvgF.set(this, -1);
                        while (this.nextParkedWorker != pdRVkdqnInX2Z3mdd.gmNWMfvn6zlEj) {
                            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = D5P1xCAyuvgF;
                            if (atomicIntegerFieldUpdater.get(this) != -1) {
                                break;
                            }
                            pdRVkdqnInX2Z3mdd pdrvkdqninx2z3mdd2 = this.pyu8ovAipBTLYAiKab;
                            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = pdRVkdqnInX2Z3mdd.hjneShqpF9Tis4;
                            if (atomicIntegerFieldUpdater2.get(pdrvkdqninx2z3mdd2) != 0 || this.JXn4Qf7zpnLjP5 == 5) {
                                break;
                            }
                            b1EoSIRjJHO5(3);
                            Thread.interrupted();
                            if (this.Ee8d2j4S9Vm5yGuR == 0) {
                                j = 2097151;
                                this.Ee8d2j4S9Vm5yGuR = System.nanoTime() + this.pyu8ovAipBTLYAiKab.JXn4Qf7zpnLjP5;
                            } else {
                                j = 2097151;
                            }
                            LockSupport.parkNanos(this.pyu8ovAipBTLYAiKab.JXn4Qf7zpnLjP5);
                            if (System.nanoTime() - this.Ee8d2j4S9Vm5yGuR >= 0) {
                                this.Ee8d2j4S9Vm5yGuR = 0L;
                                pdRVkdqnInX2Z3mdd pdrvkdqninx2z3mdd3 = this.pyu8ovAipBTLYAiKab;
                                synchronized (pdrvkdqninx2z3mdd3.b1EoSIRjJHO5) {
                                    try {
                                        if (!(atomicIntegerFieldUpdater2.get(pdrvkdqninx2z3mdd3) != 0)) {
                                            AtomicLongFieldUpdater atomicLongFieldUpdater = pdRVkdqnInX2Z3mdd.D5P1xCAyuvgF;
                                            if (((int) (atomicLongFieldUpdater.get(pdrvkdqninx2z3mdd3) & j)) > pdrvkdqninx2z3mdd3.w9sT1Swbhx3hs) {
                                                if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                    int i2 = this.indexInArray;
                                                    xDyLpEZyrcKVe0(0);
                                                    pdrvkdqninx2z3mdd3.hjneShqpF9Tis4(this, i2, 0);
                                                    int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(pdrvkdqninx2z3mdd3) & j);
                                                    if (andDecrement != i2) {
                                                        ZSt5RxjUU2KRH zSt5RxjUU2KRH = (ZSt5RxjUU2KRH) pdrvkdqninx2z3mdd3.b1EoSIRjJHO5.w9sT1Swbhx3hs(andDecrement);
                                                        pdrvkdqninx2z3mdd3.b1EoSIRjJHO5.vekpFI4d1Nc4fakF(i2, zSt5RxjUU2KRH);
                                                        zSt5RxjUU2KRH.xDyLpEZyrcKVe0(i2);
                                                        pdrvkdqninx2z3mdd3.hjneShqpF9Tis4(zSt5RxjUU2KRH, andDecrement, i2);
                                                    }
                                                    pdrvkdqninx2z3mdd3.b1EoSIRjJHO5.vekpFI4d1Nc4fakF(andDecrement, null);
                                                    this.JXn4Qf7zpnLjP5 = 5;
                                                }
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                            }
                        }
                    } else {
                        pdRVkdqnInX2Z3mdd pdrvkdqninx2z3mdd4 = this.pyu8ovAipBTLYAiKab;
                        if (this.nextParkedWorker == o0rn3ekjbj6kkwok) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater2 = pdRVkdqnInX2Z3mdd.pyu8ovAipBTLYAiKab;
                            while (true) {
                                long j2 = atomicLongFieldUpdater2.get(pdrvkdqninx2z3mdd4);
                                int i3 = this.indexInArray;
                                this.nextParkedWorker = pdrvkdqninx2z3mdd4.b1EoSIRjJHO5.w9sT1Swbhx3hs((int) (j2 & 2097151));
                                pdRVkdqnInX2Z3mdd pdrvkdqninx2z3mdd5 = pdrvkdqninx2z3mdd4;
                                if (pdRVkdqnInX2Z3mdd.pyu8ovAipBTLYAiKab.compareAndSet(pdrvkdqninx2z3mdd5, j2, ((j2 + 2097152) & (-2097152)) | ((long) i3))) {
                                    break;
                                } else {
                                    pdrvkdqninx2z3mdd4 = pdrvkdqninx2z3mdd5;
                                }
                            }
                        }
                    }
                } else {
                    if (z) {
                        b1EoSIRjJHO5(3);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.xDyLpEZyrcKVe0);
                        this.xDyLpEZyrcKVe0 = 0L;
                        break;
                    }
                    z = true;
                }
            }
        }
        b1EoSIRjJHO5(5);
    }

    public final Object vekpFI4d1Nc4fakF() {
        return this.nextParkedWorker;
    }

    public final int w9sT1Swbhx3hs() {
        return this.indexInArray;
    }

    public final void xDyLpEZyrcKVe0(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.pyu8ovAipBTLYAiKab.Ee8d2j4S9Vm5yGuR);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }
}
