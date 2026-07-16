package app.mobilex.plus.widget;

import android.content.Context;

/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class ReviewDelegateQE {
    private static volatile ReviewDelegateQE INSTANCE;
    private boolean mInitialized;

    public static ReviewDelegateQE getInstance() {
        ReviewDelegateQE reviewDelegateQE = INSTANCE;
        if (reviewDelegateQE != null) {
            return reviewDelegateQE;
        }
        ReviewDelegateQE reviewDelegateQE2 = new ReviewDelegateQE();
        INSTANCE = reviewDelegateQE2;
        return reviewDelegateQE2;
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
