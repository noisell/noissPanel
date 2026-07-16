package v.s;

import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class cc1Kpxq5ItylWb495tu implements Runnable {
    public final /* synthetic */ Object JXn4Qf7zpnLjP5;
    public final /* synthetic */ int vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs;

    public /* synthetic */ cc1Kpxq5ItylWb495tu(Object obj, int i, int i2) {
        this.w9sT1Swbhx3hs = i2;
        this.JXn4Qf7zpnLjP5 = obj;
        this.vekpFI4d1Nc4fakF = i;
    }

    private static /* synthetic */ void oqlnt() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                ((SystemForegroundService) this.JXn4Qf7zpnLjP5).Ee8d2j4S9Vm5yGuR.cancel(this.vekpFI4d1Nc4fakF);
                break;
            default:
                ((eJzD6jrSBjwYspq) this.JXn4Qf7zpnLjP5).pyu8ovAipBTLYAiKab(this.vekpFI4d1Nc4fakF);
                break;
        }
    }
}
