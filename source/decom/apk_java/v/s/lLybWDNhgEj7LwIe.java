package v.s;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.view.Surface;
import app.mobilex.plus.util.TypefaceCache;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class lLybWDNhgEj7LwIe {
    public Thread JXn4Qf7zpnLjP5;
    public MediaCodec dDIMxZXP1V8HdM;
    public Surface w9sT1Swbhx3hs;
    public final AtomicBoolean vekpFI4d1Nc4fakF = new AtomicBoolean(false);
    public final ConcurrentLinkedQueue Ee8d2j4S9Vm5yGuR = new ConcurrentLinkedQueue();

    static {
        TypefaceCache.obtain("001300640054009100F900BB00D700B500040051006B009500FF00BC00D700B4003000790049");
    }

    public lLybWDNhgEj7LwIe(int i, int i2) {
    }

    public final void dDIMxZXP1V8HdM(Bitmap bitmap) {
        Surface surface = this.w9sT1Swbhx3hs;
        if (surface == null || !this.vekpFI4d1Nc4fakF.get() || bitmap.isRecycled()) {
            return;
        }
        Canvas canvas = null;
        try {
            Canvas canvasLockHardwareCanvas = surface.lockHardwareCanvas();
            if (canvasLockHardwareCanvas != null) {
                try {
                    canvasLockHardwareCanvas.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(0, 0, canvasLockHardwareCanvas.getWidth(), canvasLockHardwareCanvas.getHeight()), (Paint) null);
                    surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                } catch (Exception e) {
                    e = e;
                    canvas = canvasLockHardwareCanvas;
                    TypefaceCache.obtain("00250073005E008300D200B600C600AA00220066001B008200E200AD00DD00B500790036");
                    e.getMessage();
                    if (canvas != null) {
                        try {
                            surface.unlockCanvasAndPost(canvas);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
