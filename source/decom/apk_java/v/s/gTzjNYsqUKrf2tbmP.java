package v.s;

import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import app.mobilex.plus.UtilNWWrapper;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class gTzjNYsqUKrf2tbmP extends View {
    public final /* synthetic */ jme6JDteoDB1AsG4 dDIMxZXP1V8HdM;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gTzjNYsqUKrf2tbmP(UtilNWWrapper utilNWWrapper, jme6JDteoDB1AsG4 jme6jdteodb1asg4) {
        super(utilNWWrapper);
        this.dDIMxZXP1V8HdM = jme6jdteodb1asg4;
    }

    private static /* synthetic */ void fkfzgae() {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [v.s.LGm23hksIOxB, v.s.NhN5GSKLYh6STld4] */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TL_BR;
        jme6JDteoDB1AsG4 jme6jdteodb1asg4 = this.dDIMxZXP1V8HdM;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{jme6jdteodb1asg4.JXn4Qf7zpnLjP5, jme6jdteodb1asg4.Ee8d2j4S9Vm5yGuR});
        gradientDrawable.setCornerRadius(getWidth() / 2.0f);
        gradientDrawable.setBounds(0, 0, getWidth(), getHeight());
        gradientDrawable.draw(canvas);
        jme6jdteodb1asg4.xDyLpEZyrcKVe0.b1EoSIRjJHO5(canvas, Float.valueOf(getWidth()));
    }
}
