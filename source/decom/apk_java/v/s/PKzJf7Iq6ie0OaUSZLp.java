package v.s;

import android.app.AppOpsManager;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class PKzJf7Iq6ie0OaUSZLp {
    public static int dDIMxZXP1V8HdM(AppOpsManager appOpsManager, String str, int i, String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i, str2);
    }

    public static AppOpsManager vekpFI4d1Nc4fakF(Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }

    public static String w9sT1Swbhx3hs(Context context) {
        return context.getOpPackageName();
    }
}
