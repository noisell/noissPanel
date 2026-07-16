package v.s;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class cGTj1ryKTvs5D7Sb implements View.OnApplyWindowInsetsListener {
    public Qn6Oecz8en5Uu dDIMxZXP1V8HdM = null;
    public final /* synthetic */ View w9sT1Swbhx3hs;

    public cGTj1ryKTvs5D7Sb(View view, E3ID92BLpALTum9 e3ID92BLpALTum9) {
        this.w9sT1Swbhx3hs = view;
    }

    private static /* synthetic */ void jiou() {
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Qn6Oecz8en5Uu qn6Oecz8en5UuDDIMxZXP1V8HdM = Qn6Oecz8en5Uu.dDIMxZXP1V8HdM(windowInsets, view);
        if (Build.VERSION.SDK_INT < 30) {
            u9IBFWnIoP0MgX8BmWO.dDIMxZXP1V8HdM(windowInsets, this.w9sT1Swbhx3hs);
            if (qn6Oecz8en5UuDDIMxZXP1V8HdM.equals(this.dDIMxZXP1V8HdM)) {
                throw null;
            }
        }
        this.dDIMxZXP1V8HdM = qn6Oecz8en5UuDDIMxZXP1V8HdM;
        throw null;
    }
}
