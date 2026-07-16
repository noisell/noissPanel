package v.s;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final /* synthetic */ class CHR3YTVRmy7y60KoqK implements r96gMQOC3qOmbjRQeT1 {
    public final /* synthetic */ long Ee8d2j4S9Vm5yGuR;
    public final /* synthetic */ Runnable JXn4Qf7zpnLjP5;
    public final /* synthetic */ TimeUnit ibVTtJUNfrGYbW;
    public final /* synthetic */ CX2cgp0VaeW1h7Cx14 vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs;
    public final /* synthetic */ long xDyLpEZyrcKVe0;

    public /* synthetic */ CHR3YTVRmy7y60KoqK(CX2cgp0VaeW1h7Cx14 cX2cgp0VaeW1h7Cx14, Runnable runnable, long j, long j2, TimeUnit timeUnit, int i) {
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = cX2cgp0VaeW1h7Cx14;
        this.JXn4Qf7zpnLjP5 = runnable;
        this.Ee8d2j4S9Vm5yGuR = j;
        this.xDyLpEZyrcKVe0 = j2;
        this.ibVTtJUNfrGYbW = timeUnit;
    }

    private static /* synthetic */ void rfhw() {
    }

    @Override // v.s.r96gMQOC3qOmbjRQeT1
    public final ScheduledFuture dDIMxZXP1V8HdM(r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c) {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                CX2cgp0VaeW1h7Cx14 cX2cgp0VaeW1h7Cx14 = this.vekpFI4d1Nc4fakF;
                return cX2cgp0VaeW1h7Cx14.vekpFI4d1Nc4fakF.scheduleAtFixedRate(new tFtl6ch6nfbOxTcgPE(cX2cgp0VaeW1h7Cx14, this.JXn4Qf7zpnLjP5, r5xeufod5gsccwq6c, 0), this.Ee8d2j4S9Vm5yGuR, this.xDyLpEZyrcKVe0, this.ibVTtJUNfrGYbW);
            default:
                CX2cgp0VaeW1h7Cx14 cX2cgp0VaeW1h7Cx15 = this.vekpFI4d1Nc4fakF;
                return cX2cgp0VaeW1h7Cx15.vekpFI4d1Nc4fakF.scheduleWithFixedDelay(new tFtl6ch6nfbOxTcgPE(cX2cgp0VaeW1h7Cx15, this.JXn4Qf7zpnLjP5, r5xeufod5gsccwq6c, 2), this.Ee8d2j4S9Vm5yGuR, this.xDyLpEZyrcKVe0, this.ibVTtJUNfrGYbW);
        }
    }
}
