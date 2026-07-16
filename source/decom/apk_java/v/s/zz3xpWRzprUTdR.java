package v.s;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class zz3xpWRzprUTdR {
    public static final Sh7RGIEOYyBoHg JXn4Qf7zpnLjP5 = new Sh7RGIEOYyBoHg();
    public boolean dDIMxZXP1V8HdM;
    public long vekpFI4d1Nc4fakF;
    public long w9sT1Swbhx3hs;

    private static /* synthetic */ void vgzjt() {
    }

    public boolean Ee8d2j4S9Vm5yGuR() {
        return this.dDIMxZXP1V8HdM;
    }

    public zz3xpWRzprUTdR JXn4Qf7zpnLjP5(long j) {
        this.dDIMxZXP1V8HdM = true;
        this.w9sT1Swbhx3hs = j;
        return this;
    }

    public long b1EoSIRjJHO5() {
        return this.vekpFI4d1Nc4fakF;
    }

    public zz3xpWRzprUTdR dDIMxZXP1V8HdM() {
        this.dDIMxZXP1V8HdM = false;
        return this;
    }

    public zz3xpWRzprUTdR ibVTtJUNfrGYbW(long j, TimeUnit timeUnit) {
        if (j >= 0) {
            this.vekpFI4d1Nc4fakF = timeUnit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j).toString());
    }

    public long vekpFI4d1Nc4fakF() {
        if (this.dDIMxZXP1V8HdM) {
            return this.w9sT1Swbhx3hs;
        }
        throw new IllegalStateException("No deadline");
    }

    public zz3xpWRzprUTdR w9sT1Swbhx3hs() {
        this.vekpFI4d1Nc4fakF = 0L;
        return this;
    }

    public void xDyLpEZyrcKVe0() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.dDIMxZXP1V8HdM && this.w9sT1Swbhx3hs - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }
}
