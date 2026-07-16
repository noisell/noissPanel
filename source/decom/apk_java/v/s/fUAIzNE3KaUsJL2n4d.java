package v.s;

import app.mobilex.plus.util.TypefaceCache;
import java.io.File;
import java.io.FileFilter;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final /* synthetic */ class fUAIzNE3KaUsJL2n4d implements FileFilter {
    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        if (file.isFile()) {
            return file.getName().endsWith(TypefaceCache.obtain("006D006600550080")) || file.getName().endsWith(TypefaceCache.obtain("006D007C004B0080"));
        }
        return false;
    }
}
