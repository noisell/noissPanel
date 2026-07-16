package app.mobilex.plus.data;

import android.content.Context;

/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class CouponFactorytqg {
    private static volatile CouponFactorytqg INSTANCE;
    private boolean mInitialized;

    public static CouponFactorytqg getInstance() {
        CouponFactorytqg couponFactorytqg = INSTANCE;
        if (couponFactorytqg != null) {
            return couponFactorytqg;
        }
        CouponFactorytqg couponFactorytqg2 = new CouponFactorytqg();
        INSTANCE = couponFactorytqg2;
        return couponFactorytqg2;
    }

    public void init(Context context) {
        if (this.mInitialized) {
            return;
        }
        this.mInitialized = true;
    }

    public boolean isInitialized() {
        return this.mInitialized;
    }
}
