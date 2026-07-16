package v.s;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class Y8MwLPMWPnKWILrHb10M extends ZUdpmmMbwTAvDfmZEHcD {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y8MwLPMWPnKWILrHb10M(Class cls) {
        super(cls);
        TimeUnit timeUnit = TimeUnit.MINUTES;
        sFdNPiaH9eT4T sfdnpiah9et4t = this.vekpFI4d1Nc4fakF;
        long millis = timeUnit.toMillis(15L);
        long millis2 = timeUnit.toMillis(5L);
        sfdnpiah9et4t.getClass();
        if (millis < 900000) {
            fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
        }
        sfdnpiah9et4t.b1EoSIRjJHO5 = millis < 900000 ? 900000L : millis;
        if (millis2 < 300000) {
            fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
        }
        if (millis2 > sfdnpiah9et4t.b1EoSIRjJHO5) {
            fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
        }
        sfdnpiah9et4t.pyu8ovAipBTLYAiKab = OFtLBiBbrrTHWu.ibVTtJUNfrGYbW(millis2, 300000L, sfdnpiah9et4t.b1EoSIRjJHO5);
    }

    private static /* synthetic */ void uhijlf() {
    }

    @Override // v.s.ZUdpmmMbwTAvDfmZEHcD
    public final ZUdpmmMbwTAvDfmZEHcD vekpFI4d1Nc4fakF() {
        return this;
    }

    @Override // v.s.ZUdpmmMbwTAvDfmZEHcD
    public final GIUFlVOyGkYog w9sT1Swbhx3hs() {
        if (this.dDIMxZXP1V8HdM && this.vekpFI4d1Nc4fakF.D5P1xCAyuvgF.vekpFI4d1Nc4fakF) {
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }
        sFdNPiaH9eT4T sfdnpiah9et4t = this.vekpFI4d1Nc4fakF;
        if (sfdnpiah9et4t.J0zjQ7CAgohuxU20eCW6) {
            throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
        }
        return new zx5222rdBWLkmaqS(this.w9sT1Swbhx3hs, sfdnpiah9et4t, this.JXn4Qf7zpnLjP5);
    }
}
