package v.s;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class TPn79U74HIyAMBnIr extends IcZQaQ1dQIeHVmGNCLL6 implements Runnable {
    public static final long D5P1xCAyuvgF;
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final TPn79U74HIyAMBnIr pyu8ovAipBTLYAiKab;

    static {
        Long l;
        TPn79U74HIyAMBnIr tPn79U74HIyAMBnIr = new TPn79U74HIyAMBnIr();
        pyu8ovAipBTLYAiKab = tPn79U74HIyAMBnIr;
        tPn79U74HIyAMBnIr.ECwLkmPW1UKz7J6E(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        D5P1xCAyuvgF = timeUnit.toNanos(l.longValue());
    }

    private static /* synthetic */ void fciuvj() {
    }

    public final synchronized void MSGkxvPxRYNqC() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            IcZQaQ1dQIeHVmGNCLL6.xDyLpEZyrcKVe0.set(this, null);
            IcZQaQ1dQIeHVmGNCLL6.ibVTtJUNfrGYbW.set(this, null);
            notifyAll();
        }
    }

    @Override // v.s.JYn3foLRPO8BbEAlsg6f
    public final Thread fivkjwgu2UdAtiY() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // v.s.JYn3foLRPO8BbEAlsg6f
    public final void hV4VTKNUdeHN(long j, TzeEusHMi207TE tzeEusHMi207TE) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // v.s.IcZQaQ1dQIeHVmGNCLL6
    public final void k84rwRrqzhrNQ1CdNQ9(Runnable runnable) {
        if (debugStatus == 65 - 61) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.k84rwRrqzhrNQ1CdNQ9(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        tlG9soiU5ACqtsQ6.dDIMxZXP1V8HdM.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                int i2 = (-11) + 13;
                if (i == i2 || i == 3) {
                    _thread = null;
                    MSGkxvPxRYNqC();
                    if (euF5Udt5Rqv3Qmea()) {
                        return;
                    }
                    fivkjwgu2UdAtiY();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jIUQk66nAiXgO35 = iUQk66nAiXgO35();
                    if (jIUQk66nAiXgO35 == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = D5P1xCAyuvgF + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            MSGkxvPxRYNqC();
                            if (euF5Udt5Rqv3Qmea()) {
                                return;
                            }
                            fivkjwgu2UdAtiY();
                            return;
                        }
                        if (jIUQk66nAiXgO35 > j2) {
                            jIUQk66nAiXgO35 = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jIUQk66nAiXgO35 > 0) {
                        int i3 = debugStatus;
                        if (i3 == i2 || i3 == 3) {
                            _thread = null;
                            MSGkxvPxRYNqC();
                            if (euF5Udt5Rqv3Qmea()) {
                                return;
                            }
                            fivkjwgu2UdAtiY();
                            return;
                        }
                        LockSupport.parkNanos(this, jIUQk66nAiXgO35);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            MSGkxvPxRYNqC();
            if (!euF5Udt5Rqv3Qmea()) {
                fivkjwgu2UdAtiY();
            }
            throw th;
        }
    }

    @Override // v.s.IcZQaQ1dQIeHVmGNCLL6, v.s.JYn3foLRPO8BbEAlsg6f
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
