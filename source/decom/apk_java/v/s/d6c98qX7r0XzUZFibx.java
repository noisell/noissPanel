package v.s;

import android.app.AppOpsManager;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class d6c98qX7r0XzUZFibx {
    public static String JXn4Qf7zpnLjP5(String str) {
        return AppOpsManager.permissionToOp(str);
    }

    public static <T> T dDIMxZXP1V8HdM(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    public static int vekpFI4d1Nc4fakF(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOpNoThrow(str, str2);
    }

    public static int w9sT1Swbhx3hs(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOp(str, str2);
    }
}
