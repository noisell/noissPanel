package v.s;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class Ta3vIDawI9HnG7KkuDG implements OnBackAnimationCallback {
    public final /* synthetic */ JRdueaGIH5g8DVCPba JXn4Qf7zpnLjP5;
    public final /* synthetic */ deLJ4Z0aL3hcJ3O1 dDIMxZXP1V8HdM;
    public final /* synthetic */ JRdueaGIH5g8DVCPba vekpFI4d1Nc4fakF;
    public final /* synthetic */ deLJ4Z0aL3hcJ3O1 w9sT1Swbhx3hs;

    public Ta3vIDawI9HnG7KkuDG(deLJ4Z0aL3hcJ3O1 delj4z0al3hcj3o1, deLJ4Z0aL3hcJ3O1 delj4z0al3hcj3o2, JRdueaGIH5g8DVCPba jRdueaGIH5g8DVCPba, JRdueaGIH5g8DVCPba jRdueaGIH5g8DVCPba2) {
        this.dDIMxZXP1V8HdM = delj4z0al3hcj3o1;
        this.w9sT1Swbhx3hs = delj4z0al3hcj3o2;
        this.vekpFI4d1Nc4fakF = jRdueaGIH5g8DVCPba;
        this.JXn4Qf7zpnLjP5 = jRdueaGIH5g8DVCPba2;
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackCancelled() {
        this.JXn4Qf7zpnLjP5.w9sT1Swbhx3hs();
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        this.vekpFI4d1Nc4fakF.w9sT1Swbhx3hs();
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackProgressed(BackEvent backEvent) {
        this.w9sT1Swbhx3hs.pyu8ovAipBTLYAiKab(new opRRh1aTWunWa(backEvent));
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackStarted(BackEvent backEvent) {
        this.dDIMxZXP1V8HdM.pyu8ovAipBTLYAiKab(new opRRh1aTWunWa(backEvent));
    }
}
