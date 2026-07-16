package v.s;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class s9ii0A4dnO6stgtFpy implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View dDIMxZXP1V8HdM;
    public final Runnable vekpFI4d1Nc4fakF;
    public ViewTreeObserver w9sT1Swbhx3hs;

    public s9ii0A4dnO6stgtFpy(View view, Runnable runnable) {
        this.dDIMxZXP1V8HdM = view;
        this.w9sT1Swbhx3hs = view.getViewTreeObserver();
        this.vekpFI4d1Nc4fakF = runnable;
    }

    public static void dDIMxZXP1V8HdM(View view, Runnable runnable) {
        s9ii0A4dnO6stgtFpy s9ii0a4dno6stgtfpy = new s9ii0A4dnO6stgtFpy(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(s9ii0a4dno6stgtfpy);
        view.addOnAttachStateChangeListener(s9ii0a4dno6stgtfpy);
    }

    private static /* synthetic */ void svaul() {
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.w9sT1Swbhx3hs.isAlive();
        View view = this.dDIMxZXP1V8HdM;
        if (zIsAlive) {
            this.w9sT1Swbhx3hs.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.vekpFI4d1Nc4fakF.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.w9sT1Swbhx3hs = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.w9sT1Swbhx3hs.isAlive();
        View view2 = this.dDIMxZXP1V8HdM;
        if (zIsAlive) {
            this.w9sT1Swbhx3hs.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
