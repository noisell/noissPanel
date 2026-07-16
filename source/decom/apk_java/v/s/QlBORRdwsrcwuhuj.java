package v.s;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class QlBORRdwsrcwuhuj {
    public static Context dDIMxZXP1V8HdM(Context context) {
        return context.createDeviceProtectedStorageContext();
    }

    public static boolean vekpFI4d1Nc4fakF(Context context) {
        return context.isDeviceProtectedStorage();
    }

    public static File w9sT1Swbhx3hs(Context context) {
        return context.getDataDir();
    }
}
