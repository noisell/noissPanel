package v.s;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class agyaknTU4kgQn extends O2DHNSIGZlgPja7eqLgn implements ScheduledFuture {
    public final ScheduledFuture pyu8ovAipBTLYAiKab;

    public agyaknTU4kgQn(r96gMQOC3qOmbjRQeT1 r96gmqoc3qombjrqet1) {
        this.pyu8ovAipBTLYAiKab = r96gmqoc3qombjrqet1.dDIMxZXP1V8HdM(new r5XEUfod5GSCCwq6c(7, this));
    }

    private static /* synthetic */ void ogwzas() {
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.pyu8ovAipBTLYAiKab.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.pyu8ovAipBTLYAiKab.getDelay(timeUnit);
    }

    @Override // v.s.O2DHNSIGZlgPja7eqLgn
    public final void vekpFI4d1Nc4fakF() {
        ScheduledFuture scheduledFuture = this.pyu8ovAipBTLYAiKab;
        Object obj = this.w9sT1Swbhx3hs;
        scheduledFuture.cancel((obj instanceof K7eEOBPYP9VIoHWTe) && ((K7eEOBPYP9VIoHWTe) obj).dDIMxZXP1V8HdM);
    }
}
