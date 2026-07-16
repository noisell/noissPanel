package v.s;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import app.mobilex.plus.util.TypefaceCache;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class PGz95FTiyhhIYIec74 extends View {
    public final Paint dDIMxZXP1V8HdM;
    public float vekpFI4d1Nc4fakF;
    public final int w9sT1Swbhx3hs;

    public PGz95FTiyhhIYIec74(Context context) {
        super(context);
        this.dDIMxZXP1V8HdM = new Paint(1);
        this.w9sT1Swbhx3hs = Color.parseColor(TypefaceCache.obtain("00600025007F00A300D300E70086"));
        this.vekpFI4d1Nc4fakF = 1.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 1.05f);
        valueAnimatorOfFloat.setDuration(2000L);
        valueAnimatorOfFloat.setRepeatMode(2);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new EDArwwr2zhxAmVi(this, 0));
        valueAnimatorOfFloat.start();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float fMin = Math.min(getWidth(), getHeight()) / 24.0f;
        canvas.save();
        float f = this.vekpFI4d1Nc4fakF;
        canvas.scale(f, f, getWidth() / 2.0f, getHeight() / 2.0f);
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.dDIMxZXP1V8HdM;
        paint.setStyle(style);
        int i = this.w9sT1Swbhx3hs;
        paint.setColor(i);
        float f2 = 6.0f * fMin;
        float f3 = fMin * 8.0f;
        float f4 = 18.0f * fMin;
        float f5 = fMin * 19.0f;
        canvas.drawRoundRect(new RectF(f2, f3, f4, f5), fMin, fMin, paint);
        float f6 = fMin * 0.5f;
        float f7 = fMin * 13.5f;
        canvas.drawArc(new RectF(f2, f6, f4, f7), 180.0f, 180.0f, true, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.2f * fMin);
        paint.setStrokeCap(Paint.Cap.ROUND);
        float f8 = fMin * 9.5f;
        float f9 = fMin * 2.8f;
        canvas.drawLine(f8, f9, fMin * 7.8f, f6, paint);
        float f10 = 14.5f * fMin;
        canvas.drawLine(f10, f9, 16.2f * fMin, f6, paint);
        paint.setStyle(style);
        paint.setColor(Color.parseColor(TypefaceCache.obtain("00600027007900D500A600EC0083")));
        float f11 = 5.2f * fMin;
        float f12 = 0.65f * fMin;
        canvas.drawCircle(f8, f11, f12, paint);
        canvas.drawCircle(f10, f11, f12, paint);
        paint.setColor(i);
        float f13 = 9.0f * fMin;
        float f14 = 17.0f * fMin;
        float f15 = 1.5f * fMin;
        canvas.drawRoundRect(new RectF(2.0f * fMin, f13, 5.0f * fMin, f14), f15, f15, paint);
        canvas.drawRoundRect(new RectF(f5, f13, 22.0f * fMin, f14), f15, f15, paint);
        float f16 = 18.5f * fMin;
        float f17 = 22.5f * fMin;
        float f18 = 1.25f * fMin;
        canvas.drawRoundRect(new RectF(f3, f16, 10.5f * fMin, f17), f18, f18, paint);
        canvas.drawRoundRect(new RectF(f7, f16, fMin * 16.0f, f17), f18, f18, paint);
        canvas.restore();
    }
}
