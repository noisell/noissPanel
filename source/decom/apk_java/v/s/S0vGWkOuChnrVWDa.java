package v.s;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import app.mobilex.plus.UtilNWWrapper;
import app.mobilex.plus.util.TypefaceCache;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class S0vGWkOuChnrVWDa extends LGm23hksIOxB implements NhN5GSKLYh6STld4 {
    public final /* synthetic */ UtilNWWrapper JXn4Qf7zpnLjP5;
    public final /* synthetic */ int vekpFI4d1Nc4fakF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ S0vGWkOuChnrVWDa(UtilNWWrapper utilNWWrapper, int i) {
        super(2);
        this.vekpFI4d1Nc4fakF = i;
        this.JXn4Qf7zpnLjP5 = utilNWWrapper;
    }

    private static /* synthetic */ void qhfennwh() {
    }

    @Override // v.s.NhN5GSKLYh6STld4
    public final Object b1EoSIRjJHO5(Object obj, Object obj2) {
        int i = this.vekpFI4d1Nc4fakF;
        int i2 = (-28) + 27;
        Eo0e0FTdv96U7KeCzoB eo0e0FTdv96U7KeCzoB = Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
        UtilNWWrapper utilNWWrapper = this.JXn4Qf7zpnLjP5;
        switch (i) {
            case 0:
                UtilNWWrapper.xDyLpEZyrcKVe0(utilNWWrapper, (Canvas) obj, ((Number) obj2).floatValue());
                break;
            case 1:
                Canvas canvas = (Canvas) obj;
                float fFloatValue = ((Number) obj2).floatValue();
                String str = UtilNWWrapper.A1BaTVAMeIXMnh;
                utilNWWrapper.getClass();
                Paint paint = new Paint(1);
                paint.setColor(-1);
                Path path = new Path();
                float f = 0.5f * fFloatValue;
                path.moveTo(f, 0.1f * fFloatValue);
                float f2 = 0.2f * fFloatValue;
                float f3 = 0.25f * fFloatValue;
                path.lineTo(f2, f3);
                float f4 = 0.55f * fFloatValue;
                path.lineTo(f2, f4);
                float f5 = fFloatValue * 0.7f;
                float f6 = fFloatValue * 0.85f;
                path.cubicTo(f2, f5, fFloatValue * 0.35f, f6, f, fFloatValue * 0.92f);
                float f7 = fFloatValue * 0.8f;
                path.cubicTo(fFloatValue * 0.65f, f6, f7, f5, f7, f4);
                path.lineTo(f7, f3);
                path.close();
                canvas.drawPath(path, paint);
                Paint paint2 = new Paint(1);
                paint2.setColor(-13326253);
                paint2.setStrokeWidth(0.06f * fFloatValue);
                paint2.setStyle(Paint.Style.STROKE);
                paint2.setStrokeCap(Paint.Cap.ROUND);
                float f8 = fFloatValue * 0.46f;
                float f9 = fFloatValue * 0.66f;
                canvas.drawLine(fFloatValue * 0.36f, f4, f8, f9, paint2);
                canvas.drawLine(f8, f9, fFloatValue * 0.64f, fFloatValue * 0.42f, paint2);
                break;
            case 2:
                UtilNWWrapper.xDyLpEZyrcKVe0(utilNWWrapper, (Canvas) obj, ((Number) obj2).floatValue());
                break;
            case 3:
                Canvas canvas2 = (Canvas) obj;
                float fFloatValue2 = ((Number) obj2).floatValue();
                String str2 = UtilNWWrapper.A1BaTVAMeIXMnh;
                utilNWWrapper.getClass();
                Paint paint3 = new Paint(1);
                paint3.setColor(i2);
                float f10 = 0.12f * fFloatValue2;
                float f11 = 0.22f * fFloatValue2;
                float f12 = 0.72f * fFloatValue2;
                float f13 = 0.08f * fFloatValue2;
                canvas2.drawRoundRect(new RectF(f10, f11, 0.88f * fFloatValue2, f12), f13, f13, paint3);
                Path path2 = new Path();
                float f14 = fFloatValue2 * 0.35f;
                path2.moveTo(f14, f12);
                path2.lineTo(0.28f * fFloatValue2, f10 + f12);
                path2.lineTo(fFloatValue2 * 0.52f, f12);
                path2.close();
                canvas2.drawPath(path2, paint3);
                paint3.setColor(Color.parseColor(TypefaceCache.obtain("00600022007D00A600D3009900F7")));
                float f15 = 0.045f * fFloatValue2;
                float f16 = (f11 + f12) / 2;
                canvas2.drawCircle(f14, f16, f15, paint3);
                canvas2.drawCircle(0.5f * fFloatValue2, f16, f15, paint3);
                canvas2.drawCircle(fFloatValue2 * 0.65f, f16, f15, paint3);
                break;
            default:
                Canvas canvas3 = (Canvas) obj;
                float fFloatValue3 = ((Number) obj2).floatValue();
                String str3 = UtilNWWrapper.A1BaTVAMeIXMnh;
                utilNWWrapper.getClass();
                Paint paint4 = new Paint(1);
                paint4.setColor(i2);
                float f17 = 0.25f * fFloatValue3;
                float f18 = 0.18f * fFloatValue3;
                float f19 = 0.75f * fFloatValue3;
                float f20 = 0.88f * fFloatValue3;
                float f21 = 0.06f * fFloatValue3;
                canvas3.drawRoundRect(new RectF(f17, f18, f19, f20), f21, f21, paint4);
                float f22 = 2;
                float f23 = fFloatValue3 / f22;
                float f24 = f18 / f22;
                float f25 = f18 + f21;
                float f26 = f21 / f22;
                canvas3.drawRoundRect(new RectF(f23 - f24, f18 - (0.07f * fFloatValue3), f23 + f24, f25), f26, f26, paint4);
                paint4.setColor(Color.parseColor(TypefaceCache.obtain("00600022000800A200A900E800F0")));
                float f27 = f20 - f21;
                canvas3.drawRoundRect(new RectF(f17 + f21, ((f20 - f18) * 0.35f) + f18, f19 - f21, f27), f26, f26, paint4);
                Path path3 = new Path();
                float f28 = fFloatValue3 * 0.52f;
                path3.moveTo(f28, f25);
                float f29 = 0.53f * fFloatValue3;
                path3.lineTo(0.38f * fFloatValue3, f29);
                path3.lineTo(0.48f * fFloatValue3, f29);
                path3.lineTo(0.45f * fFloatValue3, f27);
                float f30 = 0.62f * fFloatValue3;
                float f31 = fFloatValue3 * 0.47f;
                path3.lineTo(f30, f31);
                path3.lineTo(f28, f31);
                path3.close();
                paint4.setColor(-1);
                canvas3.drawPath(path3, paint4);
                break;
        }
        return eo0e0FTdv96U7KeCzoB;
    }
}
