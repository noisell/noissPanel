package v.s;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final /* synthetic */ class EDArwwr2zhxAmVi implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int dDIMxZXP1V8HdM;
    public final /* synthetic */ View w9sT1Swbhx3hs;

    public /* synthetic */ EDArwwr2zhxAmVi(View view, int i) {
        this.dDIMxZXP1V8HdM = i;
        this.w9sT1Swbhx3hs = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.dDIMxZXP1V8HdM) {
            case 0:
                PGz95FTiyhhIYIec74 pGz95FTiyhhIYIec74 = (PGz95FTiyhhIYIec74) this.w9sT1Swbhx3hs;
                pGz95FTiyhhIYIec74.vekpFI4d1Nc4fakF = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pGz95FTiyhhIYIec74.invalidate();
                break;
            default:
                hdAHR6lUX7RUK hdahr6lux7ruk = (hdAHR6lUX7RUK) this.w9sT1Swbhx3hs;
                hdahr6lux7ruk.JXn4Qf7zpnLjP5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hdahr6lux7ruk.invalidate();
                break;
        }
    }
}
