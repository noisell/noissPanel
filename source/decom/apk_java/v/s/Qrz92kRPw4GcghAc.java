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
public abstract class Qrz92kRPw4GcghAc implements R1oztwybM9zU2mqV {
    public static final Object b1EoSIRjJHO5;
    public static final OFMrQsTe5s1KYV0lq ibVTtJUNfrGYbW;
    public volatile wotphlvK9sPbXJ JXn4Qf7zpnLjP5;
    public volatile D5P1xCAyuvgF vekpFI4d1Nc4fakF;
    public volatile Object w9sT1Swbhx3hs;
    public static final boolean Ee8d2j4S9Vm5yGuR = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger xDyLpEZyrcKVe0 = Logger.getLogger(Qrz92kRPw4GcghAc.class.getName());

    static {
        OFMrQsTe5s1KYV0lq giiiyi2ddlmdr0;
        try {
            giiiyi2ddlmdr0 = new hjneShqpF9Tis4(AtomicReferenceFieldUpdater.newUpdater(wotphlvK9sPbXJ.class, Thread.class, "dDIMxZXP1V8HdM"), AtomicReferenceFieldUpdater.newUpdater(wotphlvK9sPbXJ.class, wotphlvK9sPbXJ.class, "w9sT1Swbhx3hs"), AtomicReferenceFieldUpdater.newUpdater(Qrz92kRPw4GcghAc.class, wotphlvK9sPbXJ.class, "JXn4Qf7zpnLjP5"), AtomicReferenceFieldUpdater.newUpdater(Qrz92kRPw4GcghAc.class, D5P1xCAyuvgF.class, "vekpFI4d1Nc4fakF"), AtomicReferenceFieldUpdater.newUpdater(Qrz92kRPw4GcghAc.class, Object.class, "w9sT1Swbhx3hs"));
            th = null;
        } catch (Throwable th) {
            th = th;
            giiiyi2ddlmdr0 = new gIIiyi2ddlMDR0();
        }
        ibVTtJUNfrGYbW = giiiyi2ddlmdr0;
        if (th != null) {
            xDyLpEZyrcKVe0.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        b1EoSIRjJHO5 = new Object();
    }

    public static Object Ee8d2j4S9Vm5yGuR(Object obj) throws ExecutionException {
        if (obj instanceof ibVTtJUNfrGYbW) {
            Throwable th = ((ibVTtJUNfrGYbW) obj).w9sT1Swbhx3hs;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof pyu8ovAipBTLYAiKab) {
            throw new ExecutionException(((pyu8ovAipBTLYAiKab) obj).dDIMxZXP1V8HdM);
        }
        if (obj == b1EoSIRjJHO5) {
            return null;
        }
        return obj;
    }

    public static void JXn4Qf7zpnLjP5(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            xDyLpEZyrcKVe0.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    private static /* synthetic */ void hgehwo() {
    }

    public static void vekpFI4d1Nc4fakF(Qrz92kRPw4GcghAc qrz92kRPw4GcghAc) {
        D5P1xCAyuvgF d5P1xCAyuvgF;
        D5P1xCAyuvgF d5P1xCAyuvgF2;
        D5P1xCAyuvgF d5P1xCAyuvgF3 = null;
        while (true) {
            wotphlvK9sPbXJ wotphlvk9spbxj = qrz92kRPw4GcghAc.JXn4Qf7zpnLjP5;
            if (ibVTtJUNfrGYbW.JXn4Qf7zpnLjP5(qrz92kRPw4GcghAc, wotphlvk9spbxj, wotphlvK9sPbXJ.vekpFI4d1Nc4fakF)) {
                while (wotphlvk9spbxj != null) {
                    Thread thread = wotphlvk9spbxj.dDIMxZXP1V8HdM;
                    if (thread != null) {
                        wotphlvk9spbxj.dDIMxZXP1V8HdM = null;
                        LockSupport.unpark(thread);
                    }
                    wotphlvk9spbxj = wotphlvk9spbxj.w9sT1Swbhx3hs;
                }
                do {
                    d5P1xCAyuvgF = qrz92kRPw4GcghAc.vekpFI4d1Nc4fakF;
                } while (!ibVTtJUNfrGYbW.w9sT1Swbhx3hs(qrz92kRPw4GcghAc, d5P1xCAyuvgF, D5P1xCAyuvgF.JXn4Qf7zpnLjP5));
                while (true) {
                    d5P1xCAyuvgF2 = d5P1xCAyuvgF3;
                    d5P1xCAyuvgF3 = d5P1xCAyuvgF;
                    if (d5P1xCAyuvgF3 == null) {
                        break;
                    }
                    d5P1xCAyuvgF = d5P1xCAyuvgF3.vekpFI4d1Nc4fakF;
                    d5P1xCAyuvgF3.vekpFI4d1Nc4fakF = d5P1xCAyuvgF2;
                }
                while (d5P1xCAyuvgF2 != null) {
                    d5P1xCAyuvgF3 = d5P1xCAyuvgF2.vekpFI4d1Nc4fakF;
                    Runnable runnable = d5P1xCAyuvgF2.dDIMxZXP1V8HdM;
                    if (runnable instanceof gmNWMfvn6zlEj) {
                        gmNWMfvn6zlEj gmnwmfvn6zlej = (gmNWMfvn6zlEj) runnable;
                        qrz92kRPw4GcghAc = gmnwmfvn6zlej.w9sT1Swbhx3hs;
                        if (qrz92kRPw4GcghAc.w9sT1Swbhx3hs == gmnwmfvn6zlej) {
                            if (ibVTtJUNfrGYbW.vekpFI4d1Nc4fakF(qrz92kRPw4GcghAc, gmnwmfvn6zlej, xDyLpEZyrcKVe0(gmnwmfvn6zlej.vekpFI4d1Nc4fakF))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        JXn4Qf7zpnLjP5(runnable, d5P1xCAyuvgF2.w9sT1Swbhx3hs);
                    }
                    d5P1xCAyuvgF2 = d5P1xCAyuvgF3;
                }
                return;
            }
        }
    }

    public static Object xDyLpEZyrcKVe0(R1oztwybM9zU2mqV r1oztwybM9zU2mqV) {
        Object obj;
        if (r1oztwybM9zU2mqV instanceof Qrz92kRPw4GcghAc) {
            Object obj2 = ((Qrz92kRPw4GcghAc) r1oztwybM9zU2mqV).w9sT1Swbhx3hs;
            if (!(obj2 instanceof ibVTtJUNfrGYbW)) {
                return obj2;
            }
            ibVTtJUNfrGYbW ibvttjunfrgybw = (ibVTtJUNfrGYbW) obj2;
            if (ibvttjunfrgybw.dDIMxZXP1V8HdM) {
                return ibvttjunfrgybw.w9sT1Swbhx3hs != null ? new ibVTtJUNfrGYbW(ibvttjunfrgybw.w9sT1Swbhx3hs, false) : ibVTtJUNfrGYbW.JXn4Qf7zpnLjP5;
            }
            return obj2;
        }
        boolean zIsCancelled = r1oztwybM9zU2mqV.isCancelled();
        int i = (-19) + 20;
        if ((((Ee8d2j4S9Vm5yGuR ? 1 : 0) ^ i) & (zIsCancelled ? 1 : 0)) != 0) {
            return ibVTtJUNfrGYbW.JXn4Qf7zpnLjP5;
        }
        int i2 = 0;
        while (true) {
            try {
                try {
                    obj = r1oztwybM9zU2mqV.get();
                    break;
                } catch (InterruptedException unused) {
                    i2 = i;
                } catch (Throwable th) {
                    if (i2 != 0) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException e) {
                if (zIsCancelled) {
                    return new ibVTtJUNfrGYbW(e, false);
                }
                return new pyu8ovAipBTLYAiKab(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + r1oztwybM9zU2mqV, e));
            } catch (ExecutionException e2) {
                return new pyu8ovAipBTLYAiKab(e2.getCause());
            } catch (Throwable th2) {
                return new pyu8ovAipBTLYAiKab(th2);
            }
        }
        if (i2 != 0) {
            Thread.currentThread().interrupt();
        }
        return obj == null ? b1EoSIRjJHO5 : obj;
    }

    public final void b1EoSIRjJHO5(wotphlvK9sPbXJ wotphlvk9spbxj) {
        wotphlvk9spbxj.dDIMxZXP1V8HdM = null;
        while (true) {
            wotphlvK9sPbXJ wotphlvk9spbxj2 = this.JXn4Qf7zpnLjP5;
            if (wotphlvk9spbxj2 == wotphlvK9sPbXJ.vekpFI4d1Nc4fakF) {
                return;
            }
            wotphlvK9sPbXJ wotphlvk9spbxj3 = null;
            while (wotphlvk9spbxj2 != null) {
                wotphlvK9sPbXJ wotphlvk9spbxj4 = wotphlvk9spbxj2.w9sT1Swbhx3hs;
                if (wotphlvk9spbxj2.dDIMxZXP1V8HdM != null) {
                    wotphlvk9spbxj3 = wotphlvk9spbxj2;
                } else if (wotphlvk9spbxj3 != null) {
                    wotphlvk9spbxj3.w9sT1Swbhx3hs = wotphlvk9spbxj4;
                    if (wotphlvk9spbxj3.dDIMxZXP1V8HdM == null) {
                    }
                } else if (!ibVTtJUNfrGYbW.JXn4Qf7zpnLjP5(this, wotphlvk9spbxj2, wotphlvk9spbxj4)) {
                }
                wotphlvk9spbxj2 = wotphlvk9spbxj4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        ibVTtJUNfrGYbW ibvttjunfrgybw;
        Object obj = this.w9sT1Swbhx3hs;
        if (!(obj == null) && !(obj instanceof gmNWMfvn6zlEj)) {
            return false;
        }
        if (Ee8d2j4S9Vm5yGuR) {
            ibvttjunfrgybw = new ibVTtJUNfrGYbW(new CancellationException("Future.cancel() was called."), z);
        } else {
            ibvttjunfrgybw = z ? ibVTtJUNfrGYbW.vekpFI4d1Nc4fakF : ibVTtJUNfrGYbW.JXn4Qf7zpnLjP5;
        }
        Qrz92kRPw4GcghAc qrz92kRPw4GcghAc = this;
        boolean z2 = false;
        while (true) {
            if (ibVTtJUNfrGYbW.vekpFI4d1Nc4fakF(qrz92kRPw4GcghAc, obj, ibvttjunfrgybw)) {
                vekpFI4d1Nc4fakF(qrz92kRPw4GcghAc);
                if (!(obj instanceof gmNWMfvn6zlEj)) {
                    break;
                }
                R1oztwybM9zU2mqV r1oztwybM9zU2mqV = ((gmNWMfvn6zlEj) obj).vekpFI4d1Nc4fakF;
                if (!(r1oztwybM9zU2mqV instanceof Qrz92kRPw4GcghAc)) {
                    r1oztwybM9zU2mqV.cancel(z);
                    break;
                }
                qrz92kRPw4GcghAc = (Qrz92kRPw4GcghAc) r1oztwybM9zU2mqV;
                obj = qrz92kRPw4GcghAc.w9sT1Swbhx3hs;
                if (!(obj == null) && !(obj instanceof gmNWMfvn6zlEj)) {
                    break;
                }
                z2 = true;
            } else {
                obj = qrz92kRPw4GcghAc.w9sT1Swbhx3hs;
                if (!(obj instanceof gmNWMfvn6zlEj)) {
                    return z2;
                }
            }
        }
        return true;
    }

    @Override // v.s.R1oztwybM9zU2mqV
    public final void dDIMxZXP1V8HdM(Runnable runnable, Executor executor) {
        executor.getClass();
        D5P1xCAyuvgF d5P1xCAyuvgF = this.vekpFI4d1Nc4fakF;
        D5P1xCAyuvgF d5P1xCAyuvgF2 = D5P1xCAyuvgF.JXn4Qf7zpnLjP5;
        if (d5P1xCAyuvgF != d5P1xCAyuvgF2) {
            D5P1xCAyuvgF d5P1xCAyuvgF3 = new D5P1xCAyuvgF(runnable, executor);
            do {
                d5P1xCAyuvgF3.vekpFI4d1Nc4fakF = d5P1xCAyuvgF;
                if (ibVTtJUNfrGYbW.w9sT1Swbhx3hs(this, d5P1xCAyuvgF, d5P1xCAyuvgF3)) {
                    return;
                } else {
                    d5P1xCAyuvgF = this.vekpFI4d1Nc4fakF;
                }
            } while (d5P1xCAyuvgF != d5P1xCAyuvgF2);
        }
        JXn4Qf7zpnLjP5(runnable, executor);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 10 */
    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z;
        wotphlvK9sPbXJ wotphlvk9spbxj = wotphlvK9sPbXJ.vekpFI4d1Nc4fakF;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.w9sT1Swbhx3hs;
        if ((obj != null) && (!(obj instanceof gmNWMfvn6zlEj))) {
            return Ee8d2j4S9Vm5yGuR(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            wotphlvK9sPbXJ wotphlvk9spbxj2 = this.JXn4Qf7zpnLjP5;
            if (wotphlvk9spbxj2 != wotphlvk9spbxj) {
                wotphlvK9sPbXJ wotphlvk9spbxj3 = new wotphlvK9sPbXJ();
                z = true;
                while (true) {
                    OFMrQsTe5s1KYV0lq oFMrQsTe5s1KYV0lq = ibVTtJUNfrGYbW;
                    oFMrQsTe5s1KYV0lq.XiR1pIn5878vVWd(wotphlvk9spbxj3, wotphlvk9spbxj2);
                    if (oFMrQsTe5s1KYV0lq.JXn4Qf7zpnLjP5(this, wotphlvk9spbxj2, wotphlvk9spbxj3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                b1EoSIRjJHO5(wotphlvk9spbxj3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.w9sT1Swbhx3hs;
                            if ((obj2 != null) && (!(obj2 instanceof gmNWMfvn6zlEj))) {
                                return Ee8d2j4S9Vm5yGuR(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        b1EoSIRjJHO5(wotphlvk9spbxj3);
                        break;
                    }
                    wotphlvk9spbxj2 = this.JXn4Qf7zpnLjP5;
                    if (wotphlvk9spbxj2 == wotphlvk9spbxj) {
                    }
                }
            }
            return Ee8d2j4S9Vm5yGuR(this.w9sT1Swbhx3hs);
        }
        z = true;
        while (nanos > 0) {
            Object obj3 = this.w9sT1Swbhx3hs;
            if ((obj3 != null ? z : false) && (!(obj3 instanceof gmNWMfvn6zlEj))) {
                return Ee8d2j4S9Vm5yGuR(obj3);
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
            boolean z2 = (jConvert == 0 || nanos2 > 1000) ? z : false;
            if (jConvert > 0) {
                String strIbVTtJUNfrGYbW3 = strIbVTtJUNfrGYbW2 + jConvert + " " + lowerCase;
                if (z2) {
                    strIbVTtJUNfrGYbW3 = Y9mRyRdkl5FOcwb66V6.ibVTtJUNfrGYbW(strIbVTtJUNfrGYbW3, ",");
                }
                strIbVTtJUNfrGYbW2 = Y9mRyRdkl5FOcwb66V6.ibVTtJUNfrGYbW(strIbVTtJUNfrGYbW3, " ");
            }
            if (z2) {
                strIbVTtJUNfrGYbW2 = strIbVTtJUNfrGYbW2 + nanos2 + " nanoseconds ";
            }
            strIbVTtJUNfrGYbW = Y9mRyRdkl5FOcwb66V6.ibVTtJUNfrGYbW(strIbVTtJUNfrGYbW2, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(Y9mRyRdkl5FOcwb66V6.ibVTtJUNfrGYbW(strIbVTtJUNfrGYbW, " but future completed as timeout expired"));
        }
        throw new TimeoutException(strIbVTtJUNfrGYbW + " for " + string);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String ibVTtJUNfrGYbW() {
        Object obj = this.w9sT1Swbhx3hs;
        if (obj instanceof gmNWMfvn6zlEj) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            R1oztwybM9zU2mqV r1oztwybM9zU2mqV = ((gmNWMfvn6zlEj) obj).vekpFI4d1Nc4fakF;
            return Y9mRyRdkl5FOcwb66V6.D5P1xCAyuvgF(sb, r1oztwybM9zU2mqV == this ? "this future" : String.valueOf(r1oztwybM9zU2mqV), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.w9sT1Swbhx3hs instanceof ibVTtJUNfrGYbW;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.w9sT1Swbhx3hs;
        return (!(obj instanceof gmNWMfvn6zlEj)) & (obj != null);
    }

    public final String toString() {
        String strIbVTtJUNfrGYbW;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.w9sT1Swbhx3hs instanceof ibVTtJUNfrGYbW) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            w9sT1Swbhx3hs(sb);
        } else {
            try {
                strIbVTtJUNfrGYbW = ibVTtJUNfrGYbW();
            } catch (RuntimeException e) {
                strIbVTtJUNfrGYbW = "Exception thrown from implementation: " + e.getClass();
            }
            if (strIbVTtJUNfrGYbW != null && !strIbVTtJUNfrGYbW.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strIbVTtJUNfrGYbW);
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

    public final void w9sT1Swbhx3hs(StringBuilder sb) {
        Object obj;
        int i = 0;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    i = 53 - 52;
                } catch (Throwable th) {
                    if (i != 0) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e2) {
                sb.append("FAILURE, cause=[");
                sb.append(e2.getCause());
                sb.append("]");
                return;
            }
        }
        if (i != 0) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 6 */
    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        wotphlvK9sPbXJ wotphlvk9spbxj = wotphlvK9sPbXJ.vekpFI4d1Nc4fakF;
        if (!Thread.interrupted()) {
            Object obj2 = this.w9sT1Swbhx3hs;
            if ((obj2 != null) & (!(obj2 instanceof gmNWMfvn6zlEj))) {
                return Ee8d2j4S9Vm5yGuR(obj2);
            }
            wotphlvK9sPbXJ wotphlvk9spbxj2 = this.JXn4Qf7zpnLjP5;
            if (wotphlvk9spbxj2 != wotphlvk9spbxj) {
                wotphlvK9sPbXJ wotphlvk9spbxj3 = new wotphlvK9sPbXJ();
                do {
                    OFMrQsTe5s1KYV0lq oFMrQsTe5s1KYV0lq = ibVTtJUNfrGYbW;
                    oFMrQsTe5s1KYV0lq.XiR1pIn5878vVWd(wotphlvk9spbxj3, wotphlvk9spbxj2);
                    if (oFMrQsTe5s1KYV0lq.JXn4Qf7zpnLjP5(this, wotphlvk9spbxj2, wotphlvk9spbxj3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.w9sT1Swbhx3hs;
                            } else {
                                b1EoSIRjJHO5(wotphlvk9spbxj3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof gmNWMfvn6zlEj))));
                        return Ee8d2j4S9Vm5yGuR(obj);
                    }
                    wotphlvk9spbxj2 = this.JXn4Qf7zpnLjP5;
                } while (wotphlvk9spbxj2 != wotphlvk9spbxj);
            }
            return Ee8d2j4S9Vm5yGuR(this.w9sT1Swbhx3hs);
        }
        throw new InterruptedException();
    }
}
