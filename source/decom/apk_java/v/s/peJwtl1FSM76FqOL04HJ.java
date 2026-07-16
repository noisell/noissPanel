package v.s;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class peJwtl1FSM76FqOL04HJ {
    public static WeakReference w9sT1Swbhx3hs;
    public iniVyKd0OGb2raI4 dDIMxZXP1V8HdM;

    private static /* synthetic */ void hqzba() {
    }

    public final synchronized BskzYla6Czi7M64 dDIMxZXP1V8HdM() {
        String str;
        BskzYla6Czi7M64 bskzYla6Czi7M64;
        iniVyKd0OGb2raI4 inivykd0ogb2rai4 = this.dDIMxZXP1V8HdM;
        synchronized (((ArrayDeque) inivykd0ogb2rai4.xDyLpEZyrcKVe0)) {
            str = (String) ((ArrayDeque) inivykd0ogb2rai4.xDyLpEZyrcKVe0).peek();
        }
        Pattern pattern = BskzYla6Czi7M64.JXn4Qf7zpnLjP5;
        bskzYla6Czi7M64 = null;
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split("!", -1);
            if (strArrSplit.length == 2) {
                bskzYla6Czi7M64 = new BskzYla6Czi7M64(strArrSplit[0], strArrSplit[1]);
            }
        }
        return bskzYla6Czi7M64;
    }
}
