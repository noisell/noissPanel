package v.s;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.view.MotionEvent;
import android.view.View;
import app.mobilex.plus.util.TypefaceCache;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class V3YwOBcZuHItC extends View {
    public final Paint D5P1xCAyuvgF;
    public boolean Ee8d2j4S9Vm5yGuR;
    public final PointF JXn4Qf7zpnLjP5;
    public final Paint b1EoSIRjJHO5;
    public final ofxQWGnngPxGI3OtvQn dDIMxZXP1V8HdM;
    public final Paint gIIiyi2ddlMDR0;
    public final Paint gmNWMfvn6zlEj;
    public final Paint hjneShqpF9Tis4;
    public final float ibVTtJUNfrGYbW;
    public final Paint pyu8ovAipBTLYAiKab;
    public final ArrayList vekpFI4d1Nc4fakF;
    public final PointF[] w9sT1Swbhx3hs;
    public final Paint wotphlvK9sPbXJ;
    public final float xDyLpEZyrcKVe0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V3YwOBcZuHItC(Context context) {
        super(context);
        ofxQWGnngPxGI3OtvQn ofxqwgnngpxgi3otvqn = ofxQWGnngPxGI3OtvQn.wotphlvK9sPbXJ;
        this.dDIMxZXP1V8HdM = ofxqwgnngpxgi3otvqn;
        PointF[] pointFArr = new PointF[9];
        for (int i = 0; i < 9; i++) {
            pointFArr[i] = new PointF();
        }
        this.w9sT1Swbhx3hs = pointFArr;
        this.vekpFI4d1Nc4fakF = new ArrayList();
        this.JXn4Qf7zpnLjP5 = new PointF();
        Paint paint = new Paint();
        paint.setColor(Color.parseColor(TypefaceCache.obtain("00600052007F00D700A000EF008200F70073")));
        this.b1EoSIRjJHO5 = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(Color.parseColor(TypefaceCache.obtain("00600023000E00A100D6009900F400810005")));
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.pyu8ovAipBTLYAiKab = paint2;
        Paint paint3 = new Paint(1);
        paint3.setColor(Color.parseColor(TypefaceCache.obtain("00600050007D00D700A0009A008400F00075")));
        paint3.setStyle(style);
        this.D5P1xCAyuvgF = paint3;
        Paint paint4 = new Paint(1);
        paint4.setColor(Color.parseColor(TypefaceCache.obtain("00600022000F00D700A0009A008400F00075")));
        Paint.Style style2 = Paint.Style.STROKE;
        paint4.setStyle(style2);
        paint4.setStrokeWidth(4.0f);
        this.hjneShqpF9Tis4 = paint4;
        Paint paint5 = new Paint(1);
        paint5.setColor(Color.parseColor(TypefaceCache.obtain("00600057007A00D700A0009A008400F00075")));
        paint5.setStyle(style2);
        paint5.setStrokeWidth(8.0f);
        paint5.setStrokeCap(Paint.Cap.ROUND);
        paint5.setStrokeJoin(Paint.Join.ROUND);
        this.gmNWMfvn6zlEj = paint5;
        Paint paint6 = new Paint(1);
        paint6.setColor(Color.parseColor(TypefaceCache.obtain("00600057007A00A100D6009900F400810005")));
        paint6.setTextSize(42.0f);
        Paint.Align align = Paint.Align.CENTER;
        paint6.setTextAlign(align);
        paint6.setTypeface(Typeface.DEFAULT_BOLD);
        this.gIIiyi2ddlMDR0 = paint6;
        Paint paint7 = new Paint(1);
        paint7.setColor(Color.parseColor(TypefaceCache.obtain("00600021000C00A100D6009900F400810005")));
        paint7.setTextSize(28.0f);
        paint7.setTextAlign(align);
        this.wotphlvK9sPbXJ = paint7;
        float f = context.getResources().getDisplayMetrics().density;
        this.xDyLpEZyrcKVe0 = 18.0f * f;
        this.ibVTtJUNfrGYbW = f * 48.0f;
    }

    private static /* synthetic */ void ndcqwfbad() {
    }

    public final void dDIMxZXP1V8HdM(float f, float f2) {
        for (int i = 0; i < 8 + 1; i++) {
            Integer numValueOf = Integer.valueOf(i);
            ArrayList arrayList = this.vekpFI4d1Nc4fakF;
            if (!arrayList.contains(numValueOf)) {
                PointF pointF = this.w9sT1Swbhx3hs[i];
                float f3 = f - pointF.x;
                float f4 = f2 - pointF.y;
                float f5 = (f4 * f4) + (f3 * f3);
                float f6 = this.ibVTtJUNfrGYbW;
                if (f5 < f6 * f6) {
                    arrayList.add(Integer.valueOf(i));
                    return;
                }
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.b1EoSIRjJHO5);
        canvas.drawText(TypefaceCache.checked("045E0426047B04DF04D1049C048B048504760036040804A704A0049B048A048004760457040104DF04A900FF048804FC040D0451"), getWidth() / 2.0f, getHeight() * 0.18f, this.gIIiyi2ddlMDR0);
        canvas.drawText(TypefaceCache.checked("0477042D047400C704D004EF048504F604780428040104DF04D004E1048004FD047B0036047804A604D2049F048C04FE04020454040904D7"), getWidth() / 2.0f, (getHeight() * 0.18f) + 40.0f, this.wotphlvK9sPbXJ);
        ArrayList arrayList = this.vekpFI4d1Nc4fakF;
        int size = arrayList.size();
        Paint paint = this.gmNWMfvn6zlEj;
        PointF pointF = this.JXn4Qf7zpnLjP5;
        PointF[] pointFArr = this.w9sT1Swbhx3hs;
        if (size >= 2) {
            Path path = new Path();
            PointF pointF2 = pointFArr[((Number) arrayList.get(0)).intValue()];
            path.moveTo(pointF2.x, pointF2.y);
            int size2 = arrayList.size();
            for (int i = 1; i < size2; i++) {
                PointF pointF3 = pointFArr[((Number) arrayList.get(i)).intValue()];
                path.lineTo(pointF3.x, pointF3.y);
            }
            if (this.Ee8d2j4S9Vm5yGuR) {
                path.lineTo(pointF.x, pointF.y);
            }
            canvas.drawPath(path, paint);
        } else if (arrayList.size() == 1 && this.Ee8d2j4S9Vm5yGuR) {
            PointF pointF4 = pointFArr[((Number) arrayList.get(0)).intValue()];
            canvas.drawLine(pointF4.x, pointF4.y, pointF.x, pointF.y, paint);
        }
        for (int i2 = 0; i2 < 9; i2++) {
            PointF pointF5 = pointFArr[i2];
            boolean zContains = arrayList.contains(Integer.valueOf(i2));
            float f = this.xDyLpEZyrcKVe0;
            if (zContains) {
                canvas.drawCircle(pointF5.x, pointF5.y, f * 2.0f, this.hjneShqpF9Tis4);
                canvas.drawCircle(pointF5.x, pointF5.y, f, this.D5P1xCAyuvgF);
            } else {
                canvas.drawCircle(pointF5.x, pointF5.y, f * 0.7f, this.pyu8ovAipBTLYAiKab);
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        float f = i;
        float f2 = 0.65f * f;
        float f3 = (f - f2) / 2.0f;
        float f4 = i2 * 0.32f;
        float f5 = f2 / 2.0f;
        int i5 = 0;
        while (true) {
            int i6 = (-11) + 14;
            if (i5 >= i6) {
                return;
            }
            for (int i7 = 0; i7 < i6; i7++) {
                this.w9sT1Swbhx3hs[(i5 * 3) + i7].set((i7 * f5) + f3, (i5 * f5) + f4);
            }
            i5++;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        PointF pointF = this.JXn4Qf7zpnLjP5;
        ArrayList arrayList = this.vekpFI4d1Nc4fakF;
        if (action == 0) {
            arrayList.clear();
            this.Ee8d2j4S9Vm5yGuR = true;
            pointF.set(motionEvent.getX(), motionEvent.getY());
            dDIMxZXP1V8HdM(motionEvent.getX(), motionEvent.getY());
            invalidate();
            return true;
        }
        if (action != 1) {
            if (action != 2) {
                return true;
            }
            pointF.set(motionEvent.getX(), motionEvent.getY());
            dDIMxZXP1V8HdM(motionEvent.getX(), motionEvent.getY());
            invalidate();
            return true;
        }
        this.Ee8d2j4S9Vm5yGuR = false;
        if (arrayList.size() >= 4) {
            this.dDIMxZXP1V8HdM.pyu8ovAipBTLYAiKab(imhBI9RqzETHtVIJe.dQC4QhgRN3MSEAP3HW0(arrayList));
            return true;
        }
        arrayList.clear();
        invalidate();
        return true;
    }
}
