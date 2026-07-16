package v.s;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class uHUbtcxz6RtCYDztja {
    public static final int dDIMxZXP1V8HdM;

    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    static {
        int i = Build.VERSION.SDK_INT;
        int i2 = 33554432;
        if (i < 31) {
            if (i >= 30) {
                String str = Build.VERSION.CODENAME;
                if (str.length() != 1 || str.charAt(0) < 'S' || str.charAt(0) > 'Z') {
                    i2 = 0;
                }
            } else {
                i2 = 0;
            }
        }
        dDIMxZXP1V8HdM = i2;
    }

    private static /* synthetic */ void vvymb() {
    }
}
