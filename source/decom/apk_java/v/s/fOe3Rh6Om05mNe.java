package v.s;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class fOe3Rh6Om05mNe extends nbpujQcKWlhZ {
    public boolean JXn4Qf7zpnLjP5;
    public IconCompat vekpFI4d1Nc4fakF;
    public IconCompat w9sT1Swbhx3hs;

    @Override // v.s.nbpujQcKWlhZ
    public final void dDIMxZXP1V8HdM(mYrXZiFjFW2Xg myrxzifjfw2xg) {
        Bitmap bitmap;
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) myrxzifjfw2xg.vekpFI4d1Nc4fakF;
        Context context = (Context) myrxzifjfw2xg.w9sT1Swbhx3hs;
        Notification.BigPictureStyle bigPictureStyleVekpFI4d1Nc4fakF = cStdgCX1Tuy0dVd.vekpFI4d1Nc4fakF(cStdgCX1Tuy0dVd.w9sT1Swbhx3hs(builder), null);
        IconCompat iconCompat = this.w9sT1Swbhx3hs;
        if (iconCompat != null) {
            if (i >= 31) {
                VtTsjGMvGR3Yfp.dDIMxZXP1V8HdM(bigPictureStyleVekpFI4d1Nc4fakF, WnmhoEFZo5Hp9n.vekpFI4d1Nc4fakF(iconCompat, context));
            } else if (iconCompat.vekpFI4d1Nc4fakF() == 1) {
                IconCompat iconCompat2 = this.w9sT1Swbhx3hs;
                int i2 = iconCompat2.dDIMxZXP1V8HdM;
                if (i2 == -1) {
                    Object obj = iconCompat2.w9sT1Swbhx3hs;
                    bitmap = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i2 == 1) {
                    bitmap = (Bitmap) iconCompat2.w9sT1Swbhx3hs;
                } else {
                    if (i2 != 5) {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    Bitmap bitmap2 = (Bitmap) iconCompat2.w9sT1Swbhx3hs;
                    int iMin = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.6666667f);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    Paint paint = new Paint(3);
                    float f = iMin;
                    float f2 = 0.5f * f;
                    float f3 = 0.9166667f * f2;
                    float f4 = 0.010416667f * f;
                    paint.setColor(0);
                    paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
                    canvas.drawCircle(f2, f2, f3, paint);
                    paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
                    canvas.drawCircle(f2, f2, f3, paint);
                    paint.clearShadowLayer();
                    paint.setColor(-16777216);
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                    Matrix matrix = new Matrix();
                    matrix.setTranslate((-(bitmap2.getWidth() - iMin)) / 2.0f, (-(bitmap2.getHeight() - iMin)) / 2.0f);
                    bitmapShader.setLocalMatrix(matrix);
                    paint.setShader(bitmapShader);
                    canvas.drawCircle(f2, f2, f3, paint);
                    canvas.setBitmap(null);
                    bitmap = bitmapCreateBitmap;
                }
                bigPictureStyleVekpFI4d1Nc4fakF = cStdgCX1Tuy0dVd.dDIMxZXP1V8HdM(bigPictureStyleVekpFI4d1Nc4fakF, bitmap);
            }
        }
        if (this.JXn4Qf7zpnLjP5) {
            IconCompat iconCompat3 = this.vekpFI4d1Nc4fakF;
            if (iconCompat3 == null) {
                cStdgCX1Tuy0dVd.JXn4Qf7zpnLjP5(bigPictureStyleVekpFI4d1Nc4fakF, null);
            } else {
                qZz1vtvQDipEkKFni3D.dDIMxZXP1V8HdM(bigPictureStyleVekpFI4d1Nc4fakF, WnmhoEFZo5Hp9n.vekpFI4d1Nc4fakF(iconCompat3, context));
            }
        }
        if (i >= 31) {
            VtTsjGMvGR3Yfp.vekpFI4d1Nc4fakF(bigPictureStyleVekpFI4d1Nc4fakF, false);
            VtTsjGMvGR3Yfp.w9sT1Swbhx3hs(bigPictureStyleVekpFI4d1Nc4fakF, null);
        }
    }

    @Override // v.s.nbpujQcKWlhZ
    public final String w9sT1Swbhx3hs() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
