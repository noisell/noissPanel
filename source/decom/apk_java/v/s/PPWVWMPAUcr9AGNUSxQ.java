package v.s;

import android.window.BackEvent;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class PPWVWMPAUcr9AGNUSxQ {
    public static final PPWVWMPAUcr9AGNUSxQ dDIMxZXP1V8HdM = new PPWVWMPAUcr9AGNUSxQ();

    private static /* synthetic */ void mmzchovv() {
    }

    public final float Ee8d2j4S9Vm5yGuR(BackEvent backEvent) {
        return backEvent.getTouchY();
    }

    public final float JXn4Qf7zpnLjP5(BackEvent backEvent) {
        return backEvent.getTouchX();
    }

    public final BackEvent dDIMxZXP1V8HdM(float f, float f2, float f3, int i) {
        return new BackEvent(f, f2, f3, i);
    }

    public final int vekpFI4d1Nc4fakF(BackEvent backEvent) {
        return backEvent.getSwipeEdge();
    }

    public final float w9sT1Swbhx3hs(BackEvent backEvent) {
        return backEvent.getProgress();
    }
}
