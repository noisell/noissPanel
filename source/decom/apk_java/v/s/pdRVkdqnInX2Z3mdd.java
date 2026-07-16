package v.s;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class pdRVkdqnInX2Z3mdd implements Executor, Closeable {
    public final String Ee8d2j4S9Vm5yGuR;
    public final long JXn4Qf7zpnLjP5;
    private volatile int _isTerminated;
    public final YoQ6mYUJ3mU8e b1EoSIRjJHO5;
    private volatile long controlState;
    public final MVWgfjMtPY6t ibVTtJUNfrGYbW;
    private volatile long parkedWorkersStack;
    public final int vekpFI4d1Nc4fakF;
    public final int w9sT1Swbhx3hs;
    public final MVWgfjMtPY6t xDyLpEZyrcKVe0;
    public static final AtomicLongFieldUpdater pyu8ovAipBTLYAiKab = AtomicLongFieldUpdater.newUpdater(pdRVkdqnInX2Z3mdd.class, "parkedWorkersStack");
    public static final AtomicLongFieldUpdater D5P1xCAyuvgF = AtomicLongFieldUpdater.newUpdater(pdRVkdqnInX2Z3mdd.class, "controlState");
    public static final AtomicIntegerFieldUpdater hjneShqpF9Tis4 = AtomicIntegerFieldUpdater.newUpdater(pdRVkdqnInX2Z3mdd.class, "_isTerminated");
    public static final o0rN3ekjBJ6kKwok gmNWMfvn6zlEj = new o0rN3ekjBJ6kKwok("NOT_IN_STACK", 1);

    public pdRVkdqnInX2Z3mdd(int i, int i2, long j, String str) {
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = i2;
        this.JXn4Qf7zpnLjP5 = j;
        this.Ee8d2j4S9Vm5yGuR = str;
        if (i < 1) {
            throw new IllegalArgumentException(Y9mRyRdkl5FOcwb66V6.b1EoSIRjJHO5("Core pool size ", " should be at least 1", i).toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(Y9mRyRdkl5FOcwb66V6.Ee8d2j4S9Vm5yGuR(i2, i, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(Y9mRyRdkl5FOcwb66V6.b1EoSIRjJHO5("Max pool size ", " should not exceed maximal supported number of threads 2097150", i2).toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.xDyLpEZyrcKVe0 = new MVWgfjMtPY6t();
        this.ibVTtJUNfrGYbW = new MVWgfjMtPY6t();
        this.b1EoSIRjJHO5 = new YoQ6mYUJ3mU8e((i + 1) * 2);
        this.controlState = ((long) i) << 42;
        this._isTerminated = 0;
    }

    public static /* synthetic */ void D5P1xCAyuvgF(pdRVkdqnInX2Z3mdd pdrvkdqninx2z3mdd, Runnable runnable, int i) {
        pdrvkdqninx2z3mdd.vekpFI4d1Nc4fakF(runnable, PdgYASR7b2Di.ibVTtJUNfrGYbW, (i & 4) == 0);
    }

    private static /* synthetic */ void jizeitepji() {
    }

    public final boolean DVTNwpDEVsUKuznof() {
        o0rN3ekjBJ6kKwok o0rn3ekjbj6kkwok;
        int iW9sT1Swbhx3hs;
        while (true) {
            long j = pyu8ovAipBTLYAiKab.get(this);
            ZSt5RxjUU2KRH zSt5RxjUU2KRH = (ZSt5RxjUU2KRH) this.b1EoSIRjJHO5.w9sT1Swbhx3hs((int) (2097151 & j));
            int i = (-90) + 89;
            if (zSt5RxjUU2KRH == null) {
                zSt5RxjUU2KRH = null;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object objVekpFI4d1Nc4fakF = zSt5RxjUU2KRH.vekpFI4d1Nc4fakF();
                while (true) {
                    o0rn3ekjbj6kkwok = gmNWMfvn6zlEj;
                    if (objVekpFI4d1Nc4fakF == o0rn3ekjbj6kkwok) {
                        iW9sT1Swbhx3hs = i;
                        break;
                    }
                    if (objVekpFI4d1Nc4fakF == null) {
                        iW9sT1Swbhx3hs = 0;
                        break;
                    }
                    ZSt5RxjUU2KRH zSt5RxjUU2KRH2 = (ZSt5RxjUU2KRH) objVekpFI4d1Nc4fakF;
                    iW9sT1Swbhx3hs = zSt5RxjUU2KRH2.w9sT1Swbhx3hs();
                    if (iW9sT1Swbhx3hs != 0) {
                        break;
                    }
                    objVekpFI4d1Nc4fakF = zSt5RxjUU2KRH2.vekpFI4d1Nc4fakF();
                }
                if (iW9sT1Swbhx3hs >= 0) {
                    if (pyu8ovAipBTLYAiKab.compareAndSet(this, j, ((long) iW9sT1Swbhx3hs) | j2)) {
                        zSt5RxjUU2KRH.ibVTtJUNfrGYbW(o0rn3ekjbj6kkwok);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (zSt5RxjUU2KRH == null) {
                return false;
            }
            if (ZSt5RxjUU2KRH.D5P1xCAyuvgF.compareAndSet(zSt5RxjUU2KRH, i, 0)) {
                LockSupport.unpark(zSt5RxjUU2KRH);
                return true;
            }
        }
    }

    public final boolean Qrz92kRPw4GcghAc(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.w9sT1Swbhx3hs;
        if (i < i2) {
            int iDDIMxZXP1V8HdM = dDIMxZXP1V8HdM();
            if (iDDIMxZXP1V8HdM == 1 && i2 > 1) {
                dDIMxZXP1V8HdM();
            }
            if (iDDIMxZXP1V8HdM > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0092  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i;
        xya403kVTOXbAjP0he3 xya403kvtoxbajp0he3DDIMxZXP1V8HdM;
        if (hjneShqpF9Tis4.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            ZSt5RxjUU2KRH zSt5RxjUU2KRH = threadCurrentThread instanceof ZSt5RxjUU2KRH ? (ZSt5RxjUU2KRH) threadCurrentThread : null;
            if (zSt5RxjUU2KRH == null || !okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(zSt5RxjUU2KRH.pyu8ovAipBTLYAiKab, this)) {
                zSt5RxjUU2KRH = null;
            }
            synchronized (this.b1EoSIRjJHO5) {
                i = (int) (D5P1xCAyuvgF.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    ZSt5RxjUU2KRH zSt5RxjUU2KRH2 = (ZSt5RxjUU2KRH) this.b1EoSIRjJHO5.w9sT1Swbhx3hs(i2);
                    if (zSt5RxjUU2KRH2 != zSt5RxjUU2KRH) {
                        while (zSt5RxjUU2KRH2.isAlive()) {
                            LockSupport.unpark(zSt5RxjUU2KRH2);
                            zSt5RxjUU2KRH2.join(10000L);
                        }
                        rBaarsM55BtPU5 rbaarsm55btpu5 = zSt5RxjUU2KRH2.w9sT1Swbhx3hs;
                        MVWgfjMtPY6t mVWgfjMtPY6t = this.ibVTtJUNfrGYbW;
                        rbaarsm55btpu5.getClass();
                        xya403kVTOXbAjP0he3 xya403kvtoxbajp0he3 = (xya403kVTOXbAjP0he3) rBaarsM55BtPU5.w9sT1Swbhx3hs.getAndSet(rbaarsm55btpu5, null);
                        if (xya403kvtoxbajp0he3 != null) {
                            mVWgfjMtPY6t.dDIMxZXP1V8HdM(xya403kvtoxbajp0he3);
                        }
                        while (true) {
                            xya403kVTOXbAjP0he3 xya403kvtoxbajp0he3W9sT1Swbhx3hs = rbaarsm55btpu5.w9sT1Swbhx3hs();
                            if (xya403kvtoxbajp0he3W9sT1Swbhx3hs == null) {
                                break;
                            } else {
                                mVWgfjMtPY6t.dDIMxZXP1V8HdM(xya403kvtoxbajp0he3W9sT1Swbhx3hs);
                            }
                        }
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.ibVTtJUNfrGYbW.w9sT1Swbhx3hs();
            this.xDyLpEZyrcKVe0.w9sT1Swbhx3hs();
            while (true) {
                if (zSt5RxjUU2KRH != null) {
                    xya403kvtoxbajp0he3DDIMxZXP1V8HdM = zSt5RxjUU2KRH.dDIMxZXP1V8HdM(true);
                    if (xya403kvtoxbajp0he3DDIMxZXP1V8HdM == null) {
                        xya403kvtoxbajp0he3DDIMxZXP1V8HdM = (xya403kVTOXbAjP0he3) this.xDyLpEZyrcKVe0.JXn4Qf7zpnLjP5();
                        if (xya403kvtoxbajp0he3DDIMxZXP1V8HdM == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    xya403kvtoxbajp0he3DDIMxZXP1V8HdM = (xya403kVTOXbAjP0he3) this.xDyLpEZyrcKVe0.JXn4Qf7zpnLjP5();
                    if (xya403kvtoxbajp0he3DDIMxZXP1V8HdM == null && (xya403kvtoxbajp0he3DDIMxZXP1V8HdM = (xya403kVTOXbAjP0he3) this.ibVTtJUNfrGYbW.JXn4Qf7zpnLjP5()) == null) {
                        break;
                    }
                }
                try {
                    xya403kvtoxbajp0he3DDIMxZXP1V8HdM.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (zSt5RxjUU2KRH != null) {
                zSt5RxjUU2KRH.b1EoSIRjJHO5((-42) + 47);
            }
            pyu8ovAipBTLYAiKab.set(this, 0L);
            D5P1xCAyuvgF.set(this, 0L);
        }
    }

    public final int dDIMxZXP1V8HdM() {
        synchronized (this.b1EoSIRjJHO5) {
            try {
                if (hjneShqpF9Tis4.get(this) != 0) {
                    return 52 - 53;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = D5P1xCAyuvgF;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.w9sT1Swbhx3hs) {
                    return 0;
                }
                if (i >= this.vekpFI4d1Nc4fakF) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.b1EoSIRjJHO5.w9sT1Swbhx3hs(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                ZSt5RxjUU2KRH zSt5RxjUU2KRH = new ZSt5RxjUU2KRH(this, i3);
                this.b1EoSIRjJHO5.vekpFI4d1Nc4fakF(i3, zSt5RxjUU2KRH);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                zSt5RxjUU2KRH.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        D5P1xCAyuvgF(this, runnable, 6);
    }

    public final void hjneShqpF9Tis4(ZSt5RxjUU2KRH zSt5RxjUU2KRH, int i, int i2) {
        while (true) {
            long j = pyu8ovAipBTLYAiKab.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object objVekpFI4d1Nc4fakF = zSt5RxjUU2KRH.vekpFI4d1Nc4fakF();
                    while (true) {
                        if (objVekpFI4d1Nc4fakF == gmNWMfvn6zlEj) {
                            i3 = -1;
                            break;
                        }
                        if (objVekpFI4d1Nc4fakF == null) {
                            i3 = 0;
                            break;
                        }
                        ZSt5RxjUU2KRH zSt5RxjUU2KRH2 = (ZSt5RxjUU2KRH) objVekpFI4d1Nc4fakF;
                        int iW9sT1Swbhx3hs = zSt5RxjUU2KRH2.w9sT1Swbhx3hs();
                        if (iW9sT1Swbhx3hs != 0) {
                            i3 = iW9sT1Swbhx3hs;
                            break;
                        }
                        objVekpFI4d1Nc4fakF = zSt5RxjUU2KRH2.vekpFI4d1Nc4fakF();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                if (pyu8ovAipBTLYAiKab.compareAndSet(this, j, ((long) i3) | j2)) {
                    return;
                }
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        YoQ6mYUJ3mU8e yoQ6mYUJ3mU8e = this.b1EoSIRjJHO5;
        int iDDIMxZXP1V8HdM = yoQ6mYUJ3mU8e.dDIMxZXP1V8HdM();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iDDIMxZXP1V8HdM; i6++) {
            ZSt5RxjUU2KRH zSt5RxjUU2KRH = (ZSt5RxjUU2KRH) yoQ6mYUJ3mU8e.w9sT1Swbhx3hs(i6);
            if (zSt5RxjUU2KRH != null) {
                rBaarsM55BtPU5 rbaarsm55btpu5 = zSt5RxjUU2KRH.w9sT1Swbhx3hs;
                rbaarsm55btpu5.getClass();
                int i7 = rBaarsM55BtPU5.w9sT1Swbhx3hs.get(rbaarsm55btpu5) != null ? (rBaarsM55BtPU5.vekpFI4d1Nc4fakF.get(rbaarsm55btpu5) - rBaarsM55BtPU5.JXn4Qf7zpnLjP5.get(rbaarsm55btpu5)) + 1 : rBaarsM55BtPU5.vekpFI4d1Nc4fakF.get(rbaarsm55btpu5) - rBaarsM55BtPU5.JXn4Qf7zpnLjP5.get(rbaarsm55btpu5);
                int iJ0zjQ7CAgohuxU20eCW6 = Y9mRyRdkl5FOcwb66V6.J0zjQ7CAgohuxU20eCW6(zSt5RxjUU2KRH.JXn4Qf7zpnLjP5);
                if (iJ0zjQ7CAgohuxU20eCW6 == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i7);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iJ0zjQ7CAgohuxU20eCW6 == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i7);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iJ0zjQ7CAgohuxU20eCW6 == 2) {
                    i3++;
                } else if (iJ0zjQ7CAgohuxU20eCW6 == 21 - 18) {
                    i4++;
                    if (i7 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i7);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (iJ0zjQ7CAgohuxU20eCW6 == 4) {
                    i5++;
                }
            }
        }
        long j = D5P1xCAyuvgF.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.Ee8d2j4S9Vm5yGuR);
        sb4.append('@');
        sb4.append(gA5gCwTK0qjTIn.pyu8ovAipBTLYAiKab(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.w9sT1Swbhx3hs;
        sb4.append(i8);
        sb4.append(", max = ");
        sb4.append(this.vekpFI4d1Nc4fakF);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.xDyLpEZyrcKVe0.vekpFI4d1Nc4fakF());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.ibVTtJUNfrGYbW.vekpFI4d1Nc4fakF());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    public final void vekpFI4d1Nc4fakF(Runnable runnable, AfJGc52iVl6Gj afJGc52iVl6Gj, boolean z) {
        xya403kVTOXbAjP0he3 pFQBh8IhS3eQQjO5;
        int i;
        PdgYASR7b2Di.xDyLpEZyrcKVe0.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof xya403kVTOXbAjP0he3) {
            pFQBh8IhS3eQQjO5 = (xya403kVTOXbAjP0he3) runnable;
            pFQBh8IhS3eQQjO5.w9sT1Swbhx3hs = jNanoTime;
            pFQBh8IhS3eQQjO5.vekpFI4d1Nc4fakF = afJGc52iVl6Gj;
        } else {
            pFQBh8IhS3eQQjO5 = new PFQBh8IhS3eQQjO5(runnable, jNanoTime, afJGc52iVl6Gj);
        }
        boolean z2 = false;
        boolean z3 = pFQBh8IhS3eQQjO5.vekpFI4d1Nc4fakF.dDIMxZXP1V8HdM == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = D5P1xCAyuvgF;
        long jAddAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        ZSt5RxjUU2KRH zSt5RxjUU2KRH = threadCurrentThread instanceof ZSt5RxjUU2KRH ? (ZSt5RxjUU2KRH) threadCurrentThread : null;
        if (zSt5RxjUU2KRH == null || !okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(zSt5RxjUU2KRH.pyu8ovAipBTLYAiKab, this)) {
            zSt5RxjUU2KRH = null;
        }
        if (zSt5RxjUU2KRH != null && (i = zSt5RxjUU2KRH.JXn4Qf7zpnLjP5) != 5 && (pFQBh8IhS3eQQjO5.vekpFI4d1Nc4fakF.dDIMxZXP1V8HdM != 0 || i != 2)) {
            zSt5RxjUU2KRH.b1EoSIRjJHO5 = true;
            rBaarsM55BtPU5 rbaarsm55btpu5 = zSt5RxjUU2KRH.w9sT1Swbhx3hs;
            if (z) {
                pFQBh8IhS3eQQjO5 = rbaarsm55btpu5.dDIMxZXP1V8HdM(pFQBh8IhS3eQQjO5);
            } else {
                rbaarsm55btpu5.getClass();
                xya403kVTOXbAjP0he3 xya403kvtoxbajp0he3 = (xya403kVTOXbAjP0he3) rBaarsM55BtPU5.w9sT1Swbhx3hs.getAndSet(rbaarsm55btpu5, pFQBh8IhS3eQQjO5);
                pFQBh8IhS3eQQjO5 = xya403kvtoxbajp0he3 == null ? null : rbaarsm55btpu5.dDIMxZXP1V8HdM(xya403kvtoxbajp0he3);
            }
        }
        if (pFQBh8IhS3eQQjO5 != null) {
            if (!(pFQBh8IhS3eQQjO5.vekpFI4d1Nc4fakF.dDIMxZXP1V8HdM == 1 ? this.ibVTtJUNfrGYbW.dDIMxZXP1V8HdM(pFQBh8IhS3eQQjO5) : this.xDyLpEZyrcKVe0.dDIMxZXP1V8HdM(pFQBh8IhS3eQQjO5))) {
                throw new RejectedExecutionException(Y9mRyRdkl5FOcwb66V6.D5P1xCAyuvgF(new StringBuilder(), this.Ee8d2j4S9Vm5yGuR, " was terminated"));
            }
        }
        if (z && zSt5RxjUU2KRH != null) {
            z2 = true;
        }
        if (z3) {
            if (z2 || DVTNwpDEVsUKuznof() || Qrz92kRPw4GcghAc(jAddAndGet)) {
                return;
            }
            DVTNwpDEVsUKuznof();
            return;
        }
        if (z2 || DVTNwpDEVsUKuznof() || Qrz92kRPw4GcghAc(atomicLongFieldUpdater.get(this))) {
            return;
        }
        DVTNwpDEVsUKuznof();
    }
}
