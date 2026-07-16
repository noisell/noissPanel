package v.s;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class hY5LMKhGGQVxmKz6FME extends zz3xpWRzprUTdR {
    public static final long D5P1xCAyuvgF;
    public static final ReentrantLock b1EoSIRjJHO5;
    public static hY5LMKhGGQVxmKz6FME gmNWMfvn6zlEj;
    public static final long hjneShqpF9Tis4;
    public static final Condition pyu8ovAipBTLYAiKab;
    public boolean Ee8d2j4S9Vm5yGuR;
    public long ibVTtJUNfrGYbW;
    public hY5LMKhGGQVxmKz6FME xDyLpEZyrcKVe0;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        b1EoSIRjJHO5 = reentrantLock;
        pyu8ovAipBTLYAiKab = reentrantLock.newCondition();
        long millis = TimeUnit.SECONDS.toMillis(60L);
        D5P1xCAyuvgF = millis;
        hjneShqpF9Tis4 = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    private static /* synthetic */ void yxzqugrtr() {
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
    public final boolean D5P1xCAyuvgF() {
        ReentrantLock reentrantLock = b1EoSIRjJHO5;
        reentrantLock.lock();
        try {
            if (!this.Ee8d2j4S9Vm5yGuR) {
                return false;
            }
            this.Ee8d2j4S9Vm5yGuR = false;
            hY5LMKhGGQVxmKz6FME hy5lmkhggqvxmkz6fme = gmNWMfvn6zlEj;
            while (hy5lmkhggqvxmkz6fme != null) {
                hY5LMKhGGQVxmKz6FME hy5lmkhggqvxmkz6fme2 = hy5lmkhggqvxmkz6fme.xDyLpEZyrcKVe0;
                if (hy5lmkhggqvxmkz6fme2 == this) {
                    hy5lmkhggqvxmkz6fme.xDyLpEZyrcKVe0 = this.xDyLpEZyrcKVe0;
                    this.xDyLpEZyrcKVe0 = null;
                    return false;
                }
                hy5lmkhggqvxmkz6fme = hy5lmkhggqvxmkz6fme2;
            }
            return (-2) + 3;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void hjneShqpF9Tis4() {
    }

    public final void pyu8ovAipBTLYAiKab() {
        hY5LMKhGGQVxmKz6FME hy5lmkhggqvxmkz6fme;
        long j = this.vekpFI4d1Nc4fakF;
        boolean z = this.dDIMxZXP1V8HdM;
        if (j != 0 || z) {
            ReentrantLock reentrantLock = b1EoSIRjJHO5;
            reentrantLock.lock();
            try {
                if (this.Ee8d2j4S9Vm5yGuR) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.Ee8d2j4S9Vm5yGuR = true;
                if (gmNWMfvn6zlEj == null) {
                    gmNWMfvn6zlEj = new hY5LMKhGGQVxmKz6FME();
                    YgNx8HKgNruMC7D ygNx8HKgNruMC7D = new YgNx8HKgNruMC7D("Okio Watchdog");
                    ygNx8HKgNruMC7D.setDaemon(true);
                    ygNx8HKgNruMC7D.start();
                }
                long jNanoTime = System.nanoTime();
                if (j != 0 && z) {
                    this.ibVTtJUNfrGYbW = Math.min(j, vekpFI4d1Nc4fakF() - jNanoTime) + jNanoTime;
                } else if (j != 0) {
                    this.ibVTtJUNfrGYbW = j + jNanoTime;
                } else {
                    if (!z) {
                        throw new AssertionError();
                    }
                    this.ibVTtJUNfrGYbW = vekpFI4d1Nc4fakF();
                }
                long j2 = this.ibVTtJUNfrGYbW - jNanoTime;
                hY5LMKhGGQVxmKz6FME hy5lmkhggqvxmkz6fme2 = gmNWMfvn6zlEj;
                while (true) {
                    hy5lmkhggqvxmkz6fme = hy5lmkhggqvxmkz6fme2.xDyLpEZyrcKVe0;
                    if (hy5lmkhggqvxmkz6fme == null || j2 < hy5lmkhggqvxmkz6fme.ibVTtJUNfrGYbW - jNanoTime) {
                        break;
                        break;
                    }
                    hy5lmkhggqvxmkz6fme2 = hy5lmkhggqvxmkz6fme;
                }
                this.xDyLpEZyrcKVe0 = hy5lmkhggqvxmkz6fme;
                hy5lmkhggqvxmkz6fme2.xDyLpEZyrcKVe0 = this;
                if (hy5lmkhggqvxmkz6fme2 == gmNWMfvn6zlEj) {
                    pyu8ovAipBTLYAiKab.signal();
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }
}
