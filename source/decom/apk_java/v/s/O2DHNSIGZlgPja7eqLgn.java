package v.s;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class O2DHNSIGZlgPja7eqLgn implements R1oztwybM9zU2mqV {
    public static final Object b1EoSIRjJHO5;
    public static final gA5gCwTK0qjTIn ibVTtJUNfrGYbW;
    public volatile rCHnHJBAlOpNI5 JXn4Qf7zpnLjP5;
    public volatile EWUjsTERgdPbSw3NNlN vekpFI4d1Nc4fakF;
    public volatile Object w9sT1Swbhx3hs;
    public static final boolean Ee8d2j4S9Vm5yGuR = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger xDyLpEZyrcKVe0 = Logger.getLogger(O2DHNSIGZlgPja7eqLgn.class.getName());

    static {
        gA5gCwTK0qjTIn vijudzvpytunp;
        try {
            vijudzvpytunp = new yTljMGnIibTRdOpSh4(AtomicReferenceFieldUpdater.newUpdater(rCHnHJBAlOpNI5.class, Thread.class, "dDIMxZXP1V8HdM"), AtomicReferenceFieldUpdater.newUpdater(rCHnHJBAlOpNI5.class, rCHnHJBAlOpNI5.class, "w9sT1Swbhx3hs"), AtomicReferenceFieldUpdater.newUpdater(O2DHNSIGZlgPja7eqLgn.class, rCHnHJBAlOpNI5.class, "JXn4Qf7zpnLjP5"), AtomicReferenceFieldUpdater.newUpdater(O2DHNSIGZlgPja7eqLgn.class, EWUjsTERgdPbSw3NNlN.class, "vekpFI4d1Nc4fakF"), AtomicReferenceFieldUpdater.newUpdater(O2DHNSIGZlgPja7eqLgn.class, Object.class, "w9sT1Swbhx3hs"));
            th = null;
        } catch (Throwable th) {
            th = th;
            vijudzvpytunp = new vIJudZvPyTuNp();
        }
        ibVTtJUNfrGYbW = vijudzvpytunp;
        if (th != null) {
            xDyLpEZyrcKVe0.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        b1EoSIRjJHO5 = new Object();
    }

    public static void Ee8d2j4S9Vm5yGuR(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            xDyLpEZyrcKVe0.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static void JXn4Qf7zpnLjP5(O2DHNSIGZlgPja7eqLgn o2DHNSIGZlgPja7eqLgn) {
        rCHnHJBAlOpNI5 rchnhjbalopni5;
        EWUjsTERgdPbSw3NNlN eWUjsTERgdPbSw3NNlN;
        EWUjsTERgdPbSw3NNlN eWUjsTERgdPbSw3NNlN2;
        EWUjsTERgdPbSw3NNlN eWUjsTERgdPbSw3NNlN3;
        do {
            rchnhjbalopni5 = o2DHNSIGZlgPja7eqLgn.JXn4Qf7zpnLjP5;
        } while (!ibVTtJUNfrGYbW.Ee8d2j4S9Vm5yGuR(o2DHNSIGZlgPja7eqLgn, rchnhjbalopni5, rCHnHJBAlOpNI5.vekpFI4d1Nc4fakF));
        while (true) {
            eWUjsTERgdPbSw3NNlN = null;
            if (rchnhjbalopni5 == null) {
                break;
            }
            Thread thread = rchnhjbalopni5.dDIMxZXP1V8HdM;
            if (thread != null) {
                rchnhjbalopni5.dDIMxZXP1V8HdM = null;
                LockSupport.unpark(thread);
            }
            rchnhjbalopni5 = rchnhjbalopni5.w9sT1Swbhx3hs;
        }
        o2DHNSIGZlgPja7eqLgn.vekpFI4d1Nc4fakF();
        do {
            eWUjsTERgdPbSw3NNlN2 = o2DHNSIGZlgPja7eqLgn.vekpFI4d1Nc4fakF;
        } while (!ibVTtJUNfrGYbW.vekpFI4d1Nc4fakF(o2DHNSIGZlgPja7eqLgn, eWUjsTERgdPbSw3NNlN2, EWUjsTERgdPbSw3NNlN.JXn4Qf7zpnLjP5));
        while (true) {
            eWUjsTERgdPbSw3NNlN3 = eWUjsTERgdPbSw3NNlN;
            eWUjsTERgdPbSw3NNlN = eWUjsTERgdPbSw3NNlN2;
            if (eWUjsTERgdPbSw3NNlN == null) {
                break;
            }
            eWUjsTERgdPbSw3NNlN2 = eWUjsTERgdPbSw3NNlN.vekpFI4d1Nc4fakF;
            eWUjsTERgdPbSw3NNlN.vekpFI4d1Nc4fakF = eWUjsTERgdPbSw3NNlN3;
        }
        while (eWUjsTERgdPbSw3NNlN3 != null) {
            EWUjsTERgdPbSw3NNlN eWUjsTERgdPbSw3NNlN4 = eWUjsTERgdPbSw3NNlN3.vekpFI4d1Nc4fakF;
            Ee8d2j4S9Vm5yGuR(eWUjsTERgdPbSw3NNlN3.dDIMxZXP1V8HdM, eWUjsTERgdPbSw3NNlN3.w9sT1Swbhx3hs);
            eWUjsTERgdPbSw3NNlN3 = eWUjsTERgdPbSw3NNlN4;
        }
    }

    public static Object ibVTtJUNfrGYbW(O2DHNSIGZlgPja7eqLgn o2DHNSIGZlgPja7eqLgn) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = o2DHNSIGZlgPja7eqLgn.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static Object xDyLpEZyrcKVe0(Object obj) throws ExecutionException {
        if (obj instanceof K7eEOBPYP9VIoHWTe) {
            Throwable th = ((K7eEOBPYP9VIoHWTe) obj).w9sT1Swbhx3hs;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof dTS0S7eC32ubQH54j36) {
            throw new ExecutionException(((dTS0S7eC32ubQH54j36) obj).dDIMxZXP1V8HdM);
        }
        if (obj == b1EoSIRjJHO5) {
            return null;
        }
        return obj;
    }

    public final void b1EoSIRjJHO5(rCHnHJBAlOpNI5 rchnhjbalopni5) {
        rchnhjbalopni5.dDIMxZXP1V8HdM = null;
        while (true) {
            rCHnHJBAlOpNI5 rchnhjbalopni6 = this.JXn4Qf7zpnLjP5;
            if (rchnhjbalopni6 == rCHnHJBAlOpNI5.vekpFI4d1Nc4fakF) {
                return;
            }
            rCHnHJBAlOpNI5 rchnhjbalopni7 = null;
            while (rchnhjbalopni6 != null) {
                rCHnHJBAlOpNI5 rchnhjbalopni8 = rchnhjbalopni6.w9sT1Swbhx3hs;
                if (rchnhjbalopni6.dDIMxZXP1V8HdM != null) {
                    rchnhjbalopni7 = rchnhjbalopni6;
                } else if (rchnhjbalopni7 != null) {
                    rchnhjbalopni7.w9sT1Swbhx3hs = rchnhjbalopni8;
                    if (rchnhjbalopni7.dDIMxZXP1V8HdM == null) {
                    }
                } else if (!ibVTtJUNfrGYbW.Ee8d2j4S9Vm5yGuR(this, rchnhjbalopni6, rchnhjbalopni8)) {
                }
                rchnhjbalopni6 = rchnhjbalopni8;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        K7eEOBPYP9VIoHWTe k7eEOBPYP9VIoHWTe;
        Object obj = this.w9sT1Swbhx3hs;
        if (obj == null) {
            if (Ee8d2j4S9Vm5yGuR) {
                k7eEOBPYP9VIoHWTe = new K7eEOBPYP9VIoHWTe(new CancellationException("Future.cancel() was called."), z);
            } else {
                k7eEOBPYP9VIoHWTe = z ? K7eEOBPYP9VIoHWTe.vekpFI4d1Nc4fakF : K7eEOBPYP9VIoHWTe.JXn4Qf7zpnLjP5;
            }
            if (ibVTtJUNfrGYbW.JXn4Qf7zpnLjP5(this, obj, k7eEOBPYP9VIoHWTe)) {
                JXn4Qf7zpnLjP5(this);
                return true;
            }
        }
        return false;
    }

    @Override // v.s.R1oztwybM9zU2mqV
    public final void dDIMxZXP1V8HdM(Runnable runnable, Executor executor) {
        executor.getClass();
        EWUjsTERgdPbSw3NNlN eWUjsTERgdPbSw3NNlN = this.vekpFI4d1Nc4fakF;
        EWUjsTERgdPbSw3NNlN eWUjsTERgdPbSw3NNlN2 = EWUjsTERgdPbSw3NNlN.JXn4Qf7zpnLjP5;
        if (eWUjsTERgdPbSw3NNlN != eWUjsTERgdPbSw3NNlN2) {
            EWUjsTERgdPbSw3NNlN eWUjsTERgdPbSw3NNlN3 = new EWUjsTERgdPbSw3NNlN(runnable, executor);
            do {
                eWUjsTERgdPbSw3NNlN3.vekpFI4d1Nc4fakF = eWUjsTERgdPbSw3NNlN;
                if (ibVTtJUNfrGYbW.vekpFI4d1Nc4fakF(this, eWUjsTERgdPbSw3NNlN, eWUjsTERgdPbSw3NNlN3)) {
                    return;
                } else {
                    eWUjsTERgdPbSw3NNlN = this.vekpFI4d1Nc4fakF;
                }
            } while (eWUjsTERgdPbSw3NNlN != eWUjsTERgdPbSw3NNlN2);
        }
        Ee8d2j4S9Vm5yGuR(runnable, executor);
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 13 */
    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        rCHnHJBAlOpNI5 rchnhjbalopni5 = rCHnHJBAlOpNI5.vekpFI4d1Nc4fakF;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.w9sT1Swbhx3hs;
        if (obj != null) {
            return xDyLpEZyrcKVe0(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            rCHnHJBAlOpNI5 rchnhjbalopni6 = this.JXn4Qf7zpnLjP5;
            if (rchnhjbalopni6 != rchnhjbalopni5) {
                rCHnHJBAlOpNI5 rchnhjbalopni7 = new rCHnHJBAlOpNI5();
                while (true) {
                    gA5gCwTK0qjTIn ga5gcwtk0qjtin = ibVTtJUNfrGYbW;
                    ga5gcwtk0qjtin.nQilHWaqS401ZtR(rchnhjbalopni7, rchnhjbalopni6);
                    if (ga5gcwtk0qjtin.Ee8d2j4S9Vm5yGuR(this, rchnhjbalopni6, rchnhjbalopni7)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                b1EoSIRjJHO5(rchnhjbalopni7);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.w9sT1Swbhx3hs;
                            if (obj2 != null) {
                                return xDyLpEZyrcKVe0(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        b1EoSIRjJHO5(rchnhjbalopni7);
                        break;
                    }
                    rchnhjbalopni6 = this.JXn4Qf7zpnLjP5;
                    if (rchnhjbalopni6 == rchnhjbalopni5) {
                    }
                }
            }
            return xDyLpEZyrcKVe0(this.w9sT1Swbhx3hs);
        }
        while (nanos > 0) {
            Object obj3 = this.w9sT1Swbhx3hs;
            if (obj3 != null) {
                return xDyLpEZyrcKVe0(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strIbVTtJUNfrGYbW = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strIbVTtJUNfrGYbW2 = Y9mRyRdkl5FOcwb66V6.ibVTtJUNfrGYbW(strIbVTtJUNfrGYbW, " (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strIbVTtJUNfrGYbW3 = strIbVTtJUNfrGYbW2 + jConvert + " " + lowerCase;
                if (z) {
                    strIbVTtJUNfrGYbW3 = Y9mRyRdkl5FOcwb66V6.ibVTtJUNfrGYbW(strIbVTtJUNfrGYbW3, ",");
                }
                strIbVTtJUNfrGYbW2 = Y9mRyRdkl5FOcwb66V6.ibVTtJUNfrGYbW(strIbVTtJUNfrGYbW3, " ");
            }
            if (z) {
                strIbVTtJUNfrGYbW2 = strIbVTtJUNfrGYbW2 + nanos2 + " nanoseconds ";
            }
            strIbVTtJUNfrGYbW = Y9mRyRdkl5FOcwb66V6.ibVTtJUNfrGYbW(strIbVTtJUNfrGYbW2, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(Y9mRyRdkl5FOcwb66V6.ibVTtJUNfrGYbW(strIbVTtJUNfrGYbW, " but future completed as timeout expired"));
        }
        throw new TimeoutException(strIbVTtJUNfrGYbW + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.w9sT1Swbhx3hs instanceof K7eEOBPYP9VIoHWTe;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        if (this.w9sT1Swbhx3hs != null) {
            return (-41) + 42;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.w9sT1Swbhx3hs instanceof K7eEOBPYP9VIoHWTe) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            w9sT1Swbhx3hs(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                w9sT1Swbhx3hs(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void vekpFI4d1Nc4fakF() {
    }

    public final void w9sT1Swbhx3hs(StringBuilder sb) {
        try {
            Object objIbVTtJUNfrGYbW = ibVTtJUNfrGYbW(this);
            sb.append("SUCCESS, result=[");
            sb.append(objIbVTtJUNfrGYbW == this ? "this future" : String.valueOf(objIbVTtJUNfrGYbW));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        rCHnHJBAlOpNI5 rchnhjbalopni5 = rCHnHJBAlOpNI5.vekpFI4d1Nc4fakF;
        if (!Thread.interrupted()) {
            Object obj2 = this.w9sT1Swbhx3hs;
            if (obj2 != null) {
                return xDyLpEZyrcKVe0(obj2);
            }
            rCHnHJBAlOpNI5 rchnhjbalopni6 = this.JXn4Qf7zpnLjP5;
            if (rchnhjbalopni6 != rchnhjbalopni5) {
                rCHnHJBAlOpNI5 rchnhjbalopni7 = new rCHnHJBAlOpNI5();
                do {
                    gA5gCwTK0qjTIn ga5gcwtk0qjtin = ibVTtJUNfrGYbW;
                    ga5gcwtk0qjtin.nQilHWaqS401ZtR(rchnhjbalopni7, rchnhjbalopni6);
                    if (ga5gcwtk0qjtin.Ee8d2j4S9Vm5yGuR(this, rchnhjbalopni6, rchnhjbalopni7)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.w9sT1Swbhx3hs;
                            } else {
                                b1EoSIRjJHO5(rchnhjbalopni7);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return xDyLpEZyrcKVe0(obj);
                    }
                    rchnhjbalopni6 = this.JXn4Qf7zpnLjP5;
                } while (rchnhjbalopni6 != rchnhjbalopni5);
            }
            return xDyLpEZyrcKVe0(this.w9sT1Swbhx3hs);
        }
        throw new InterruptedException();
    }
}
