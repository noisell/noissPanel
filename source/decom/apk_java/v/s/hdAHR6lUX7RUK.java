package v.s;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.LinearInterpolator;
import app.mobilex.plus.util.TypefaceCache;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class hdAHR6lUX7RUK extends View {
    public float JXn4Qf7zpnLjP5;
    public final Paint dDIMxZXP1V8HdM;
    public final int vekpFI4d1Nc4fakF;
    public final int w9sT1Swbhx3hs;

    public hdAHR6lUX7RUK(Context context, float f) {
        super(context);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f * 3.0f);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.dDIMxZXP1V8HdM = paint;
        this.w9sT1Swbhx3hs = Color.parseColor(TypefaceCache.obtain("00600027007E00D600D500EE00F7"));
        this.vekpFI4d1Nc4fakF = Color.parseColor(TypefaceCache.obtain("0060002E007A00A500A40099008A"));
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        valueAnimatorOfFloat.setDuration(800L);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new EDArwwr2zhxAmVi(this, 1));
        valueAnimatorOfFloat.start();
    }

    private static /* synthetic */ void gphhwkzwj() {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.dDIMxZXP1V8HdM;
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        RectF rectF = new RectF(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth);
        paint.setColor(this.w9sT1Swbhx3hs);
        canvas.drawArc(rectF, 0.0f, 360.0f, false, paint);
        paint.setColor(this.vekpFI4d1Nc4fakF);
        canvas.drawArc(rectF, this.JXn4Qf7zpnLjP5, 90.0f, false, paint);
    }
}
