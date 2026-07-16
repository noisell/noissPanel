package v.s;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class rPTA1zWZR3GTVlGPw extends iCNHb4Pr9dcL1 implements mGuhJf2Mcqg8m {
    public final Executor vekpFI4d1Nc4fakF;

    public rPTA1zWZR3GTVlGPw(Executor executor) {
        Method method;
        this.vekpFI4d1Nc4fakF = executor;
        Method method2 = wzA5ACpG7roHGEuwN0jS.dDIMxZXP1V8HdM;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = wzA5ACpG7roHGEuwN0jS.dDIMxZXP1V8HdM) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    private static /* synthetic */ void gcyhv() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.vekpFI4d1Nc4fakF;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof rPTA1zWZR3GTVlGPw) && ((rPTA1zWZR3GTVlGPw) obj).vekpFI4d1Nc4fakF == this.vekpFI4d1Nc4fakF;
    }

    public final int hashCode() {
        return System.identityHashCode(this.vekpFI4d1Nc4fakF);
    }

    @Override // v.s.mGuhJf2Mcqg8m
    public final void hjneShqpF9Tis4(long j, hD886kxBkce8U hd886kxbkce8u) {
        Executor executor = this.vekpFI4d1Nc4fakF;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            UubaJZRp66jTeLre uubaJZRp66jTeLre = new UubaJZRp66jTeLre(3, this, hd886kxbkce8u, false);
            cpTq2XMCb5JSaEhn cptq2xmcb5jsaehn = hd886kxbkce8u.xDyLpEZyrcKVe0;
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(uubaJZRp66jTeLre, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                WGrwEyVqR28VYxamRhIg wGrwEyVqR28VYxamRhIg = (WGrwEyVqR28VYxamRhIg) cptq2xmcb5jsaehn.D5P1xCAyuvgF(fadfsJa4iEdiwEC4Xm8.b1EoSIRjJHO5);
                if (wGrwEyVqR28VYxamRhIg != null) {
                    wGrwEyVqR28VYxamRhIg.vekpFI4d1Nc4fakF(cancellationException);
                }
            }
        }
        if (scheduledFutureSchedule != null) {
            hd886kxbkce8u.H9XlUr4OeMJFiXK(new LR2N3RA8S6gSP2jwUGa(0, scheduledFutureSchedule));
        } else {
            TPn79U74HIyAMBnIr.pyu8ovAipBTLYAiKab.hjneShqpF9Tis4(j, hd886kxbkce8u);
        }
    }

    @Override // v.s.XsD7TIOExRJcOn4m
    public final String toString() {
        return this.vekpFI4d1Nc4fakF.toString();
    }

    @Override // v.s.XsD7TIOExRJcOn4m
    public final void vIJudZvPyTuNp(cpTq2XMCb5JSaEhn cptq2xmcb5jsaehn, Runnable runnable) {
        try {
            this.vekpFI4d1Nc4fakF.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            WGrwEyVqR28VYxamRhIg wGrwEyVqR28VYxamRhIg = (WGrwEyVqR28VYxamRhIg) cptq2xmcb5jsaehn.D5P1xCAyuvgF(fadfsJa4iEdiwEC4Xm8.b1EoSIRjJHO5);
            if (wGrwEyVqR28VYxamRhIg != null) {
                wGrwEyVqR28VYxamRhIg.vekpFI4d1Nc4fakF(cancellationException);
            }
            umMdYoePNXvWWPn.w9sT1Swbhx3hs.vIJudZvPyTuNp(cptq2xmcb5jsaehn, runnable);
        }
    }
}
