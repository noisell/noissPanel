package app.mobilex.plus;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class CacheManagereIzJ {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 3 */
    public static void clearCache(Context context) {
        Object[] objArr;
        File[] fileArrListFiles = context.getCacheDir().listFiles();
        if (fileArrListFiles != null) {
            int length = fileArrListFiles.length;
            int i = 0;
            while (i < length) {
                objArr = fileArrListFiles;
                File file = objArr[i];
                file.delete();
                i++;
                objArr = file;
            }
            objArr = fileArrListFiles;
        }
    }
}
