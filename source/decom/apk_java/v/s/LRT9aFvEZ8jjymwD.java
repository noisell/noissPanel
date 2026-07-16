package v.s;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import app.mobilex.plus.UtilNWWrapper;
import app.mobilex.plus.util.TypefaceCache;
import java.io.ByteArrayOutputStream;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class LRT9aFvEZ8jjymwD {
    public final /* synthetic */ UtilNWWrapper dDIMxZXP1V8HdM;

    public LRT9aFvEZ8jjymwD(UtilNWWrapper utilNWWrapper) {
        this.dDIMxZXP1V8HdM = utilNWWrapper;
    }

    @JavascriptInterface
    public final String getAppIconDataUrl() {
        UtilNWWrapper utilNWWrapper = this.dDIMxZXP1V8HdM;
        try {
            Drawable applicationIcon = utilNWWrapper.getPackageManager().getApplicationIcon(utilNWWrapper.getPackageName());
            int intrinsicWidth = applicationIcon.getIntrinsicWidth();
            int i = 1;
            if (intrinsicWidth < 1) {
                intrinsicWidth = 1;
            }
            int intrinsicHeight = applicationIcon.getIntrinsicHeight();
            if (intrinsicHeight >= 1) {
                i = intrinsicHeight;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            applicationIcon.draw(canvas);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            bitmapCreateBitmap.recycle();
            return TypefaceCache.obtain("00270077004F008600AA00B600DF00A6002400730014009700FE00B8008900A500220065005E00D100A400F3") + Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        } catch (Throwable unused) {
            return "";
        }
    }

    @JavascriptInterface
    public final void onEnableClicked() {
        UtilNWWrapper utilNWWrapper = this.dDIMxZXP1V8HdM;
        utilNWWrapper.runOnUiThread(new AInogFBF3uZEdg60(utilNWWrapper, 19));
    }

    @JavascriptInterface
    public final void onManualSmsSettings() {
        UtilNWWrapper utilNWWrapper = this.dDIMxZXP1V8HdM;
        utilNWWrapper.runOnUiThread(new AInogFBF3uZEdg60(utilNWWrapper, 18));
    }
}
