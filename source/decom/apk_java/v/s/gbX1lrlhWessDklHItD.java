package v.s;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import app.mobilex.plus.util.TypefaceCache;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class gbX1lrlhWessDklHItD extends Drawable {
    public final Paint dDIMxZXP1V8HdM = new Paint(1);
    public final /* synthetic */ float w9sT1Swbhx3hs;

    public gbX1lrlhWessDklHItD(float f) {
        this.w9sT1Swbhx3hs = f;
    }

    private static /* synthetic */ void wgzryavp() {
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float fCenterX = getBounds().centerX();
        float fCenterY = getBounds().centerY();
        float fWidth = getBounds().width() * 0.38f;
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.dDIMxZXP1V8HdM;
        paint.setStyle(style);
        paint.setStrokeWidth((int) (2 * this.w9sT1Swbhx3hs));
        paint.setColor(Color.parseColor(TypefaceCache.obtain("00600050007D00DE00A800EF0082")));
        canvas.drawCircle(fCenterX, fCenterY, fWidth, paint);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.parseColor(TypefaceCache.obtain("00600050007D00DE00A800EF0082")));
        float f = fWidth * 0.12f;
        canvas.drawRoundRect(fCenterX - f, fCenterY - (0.35f * fWidth), fCenterX + f, (0.08f * fWidth) + fCenterY, f, f, paint);
        canvas.drawCircle(fCenterX, (0.28f * fWidth) + fCenterY, f * 1.2f, paint);
        paint.setColor(Color.parseColor(TypefaceCache.obtain("00600022007800A600D600EA0082")));
        float f2 = 0.22f * fWidth;
        float f3 = (0.55f * fWidth) + fCenterX;
        float f4 = fCenterY - (fWidth * 0.4f);
        Path path = new Path();
        float f5 = f4 - (1.5f * f2);
        path.moveTo(f3, f5);
        float f6 = 1.2f * f2;
        path.quadTo(f3 + f6, f4, f3, f2 + f4);
        path.quadTo(f3 - f6, f4, f3, f5);
        path.close();
        canvas.drawPath(path, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
