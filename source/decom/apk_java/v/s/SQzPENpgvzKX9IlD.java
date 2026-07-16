package v.s;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class SQzPENpgvzKX9IlD extends DfUmSWZwfhCUz {
    public Object Ee8d2j4S9Vm5yGuR;
    public volatile boolean JXn4Qf7zpnLjP5;
    public boolean vekpFI4d1Nc4fakF;
    public Exception xDyLpEZyrcKVe0;
    public final Object dDIMxZXP1V8HdM = new Object();
    public final RpiSWFqg6frykGldgWGU w9sT1Swbhx3hs = new RpiSWFqg6frykGldgWGU();

    private static /* synthetic */ void prvltb() {
    }

    public final void D5P1xCAyuvgF(Exception exc) {
        SbxdZ6Kq2uhHQ5RPRqm.b1EoSIRjJHO5(exc, "Exception must not be null");
        synchronized (this.dDIMxZXP1V8HdM) {
            gIIiyi2ddlMDR0();
            this.vekpFI4d1Nc4fakF = true;
            this.xDyLpEZyrcKVe0 = exc;
        }
        this.w9sT1Swbhx3hs.JXn4Qf7zpnLjP5(this);
    }

    @Override // v.s.DfUmSWZwfhCUz
    public final boolean Ee8d2j4S9Vm5yGuR() {
        boolean z;
        synchronized (this.dDIMxZXP1V8HdM) {
            z = this.vekpFI4d1Nc4fakF;
        }
        return z;
    }

    @Override // v.s.DfUmSWZwfhCUz
    public final Object JXn4Qf7zpnLjP5() {
        Object obj;
        synchronized (this.dDIMxZXP1V8HdM) {
            try {
                if (!this.vekpFI4d1Nc4fakF) {
                    throw new IllegalStateException("Task is not yet complete");
                }
                if (this.JXn4Qf7zpnLjP5) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.xDyLpEZyrcKVe0;
                if (exc != null) {
                    throw new XrwVOyHvqSOc4psxRfT(exc);
                }
                obj = this.Ee8d2j4S9Vm5yGuR;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final SQzPENpgvzKX9IlD b1EoSIRjJHO5(Executor executor, aTR0Fvd9tAh4Aa atr0fvd9tah4aa) {
        SQzPENpgvzKX9IlD sQzPENpgvzKX9IlD = new SQzPENpgvzKX9IlD();
        this.w9sT1Swbhx3hs.vekpFI4d1Nc4fakF(new M7v8siJ8iOCdVQbcjJD(executor, atr0fvd9tah4aa, sQzPENpgvzKX9IlD, 1));
        wotphlvK9sPbXJ();
        return sQzPENpgvzKX9IlD;
    }

    @Override // v.s.DfUmSWZwfhCUz
    public final SQzPENpgvzKX9IlD dDIMxZXP1V8HdM(Executor executor, hYMmDgRUK0a6MaJzT hymmdgruk0a6majzt) {
        this.w9sT1Swbhx3hs.vekpFI4d1Nc4fakF(new x5CIqN8F1vjSbVyt9vrp(executor, hymmdgruk0a6majzt));
        wotphlvK9sPbXJ();
        return this;
    }

    public final void gIIiyi2ddlMDR0() {
        String strConcat;
        if (this.vekpFI4d1Nc4fakF) {
            int i = TIlE8KQMNcX68iPXhhLy.w9sT1Swbhx3hs;
            if (!Ee8d2j4S9Vm5yGuR()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excVekpFI4d1Nc4fakF = vekpFI4d1Nc4fakF();
            if (excVekpFI4d1Nc4fakF != null) {
                strConcat = "failure";
            } else if (xDyLpEZyrcKVe0()) {
                strConcat = "result ".concat(String.valueOf(JXn4Qf7zpnLjP5()));
            } else {
                strConcat = this.JXn4Qf7zpnLjP5 ? "cancellation" : "unknown issue";
            }
        }
    }

    public final void gmNWMfvn6zlEj() {
        synchronized (this.dDIMxZXP1V8HdM) {
            try {
                if (this.vekpFI4d1Nc4fakF) {
                    return;
                }
                this.vekpFI4d1Nc4fakF = true;
                this.JXn4Qf7zpnLjP5 = true;
                this.w9sT1Swbhx3hs.JXn4Qf7zpnLjP5(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void hjneShqpF9Tis4(Object obj) {
        synchronized (this.dDIMxZXP1V8HdM) {
            gIIiyi2ddlMDR0();
            this.vekpFI4d1Nc4fakF = true;
            this.Ee8d2j4S9Vm5yGuR = obj;
        }
        this.w9sT1Swbhx3hs.JXn4Qf7zpnLjP5(this);
    }

    public final SQzPENpgvzKX9IlD ibVTtJUNfrGYbW(Executor executor, aTR0Fvd9tAh4Aa atr0fvd9tah4aa) {
        SQzPENpgvzKX9IlD sQzPENpgvzKX9IlD = new SQzPENpgvzKX9IlD();
        this.w9sT1Swbhx3hs.vekpFI4d1Nc4fakF(new M7v8siJ8iOCdVQbcjJD(executor, atr0fvd9tah4aa, sQzPENpgvzKX9IlD, 0));
        wotphlvK9sPbXJ();
        return sQzPENpgvzKX9IlD;
    }

    public final SQzPENpgvzKX9IlD pyu8ovAipBTLYAiKab(Executor executor, LtzmUxGUgkaP2P4zmQl6 ltzmUxGUgkaP2P4zmQl6) {
        SQzPENpgvzKX9IlD sQzPENpgvzKX9IlD = new SQzPENpgvzKX9IlD();
        this.w9sT1Swbhx3hs.vekpFI4d1Nc4fakF(new x5CIqN8F1vjSbVyt9vrp(executor, ltzmUxGUgkaP2P4zmQl6, sQzPENpgvzKX9IlD));
        wotphlvK9sPbXJ();
        return sQzPENpgvzKX9IlD;
    }

    @Override // v.s.DfUmSWZwfhCUz
    public final Exception vekpFI4d1Nc4fakF() {
        Exception exc;
        synchronized (this.dDIMxZXP1V8HdM) {
            exc = this.xDyLpEZyrcKVe0;
        }
        return exc;
    }

    @Override // v.s.DfUmSWZwfhCUz
    public final SQzPENpgvzKX9IlD w9sT1Swbhx3hs(Executor executor, EedOwBpLU616tq0s0D eedOwBpLU616tq0s0D) {
        this.w9sT1Swbhx3hs.vekpFI4d1Nc4fakF(new x5CIqN8F1vjSbVyt9vrp(executor, eedOwBpLU616tq0s0D));
        wotphlvK9sPbXJ();
        return this;
    }

    public final void wotphlvK9sPbXJ() {
        synchronized (this.dDIMxZXP1V8HdM) {
            try {
                if (this.vekpFI4d1Nc4fakF) {
                    this.w9sT1Swbhx3hs.JXn4Qf7zpnLjP5(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // v.s.DfUmSWZwfhCUz
    public final boolean xDyLpEZyrcKVe0() {
        boolean z;
        synchronized (this.dDIMxZXP1V8HdM) {
            try {
                z = false;
                if (this.vekpFI4d1Nc4fakF && !this.JXn4Qf7zpnLjP5 && this.xDyLpEZyrcKVe0 == null) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
