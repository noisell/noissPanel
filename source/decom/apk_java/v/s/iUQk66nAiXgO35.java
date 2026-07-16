package v.s;

import android.app.Activity;
import android.app.SharedElementCallback;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class iUQk66nAiXgO35 {
    public static void dDIMxZXP1V8HdM(Object obj) {
        ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
    }

    public static boolean vekpFI4d1Nc4fakF(Activity activity, String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }

    public static void w9sT1Swbhx3hs(Activity activity, String[] strArr, int i) {
        activity.requestPermissions(strArr, i);
    }
}
