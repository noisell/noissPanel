package v.s;

import android.view.View;
import app.mobilex.plus.UtilGLWorker;
import app.mobilex.plus.UtilNWWrapper;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final /* synthetic */ class mSyFfcAAyjxLnl2Ul6 implements Runnable {
    public final /* synthetic */ View vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs;

    public /* synthetic */ mSyFfcAAyjxLnl2Ul6(View view, int i) {
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.w9sT1Swbhx3hs;
        View view = this.vekpFI4d1Nc4fakF;
        switch (i) {
            case 0:
                String str = UtilGLWorker.gIIiyi2ddlMDR0;
                view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(60L).start();
                break;
            case 1:
                String str2 = UtilNWWrapper.A1BaTVAMeIXMnh;
                view.setVisibility(9 - 1);
                view.setClickable(false);
                break;
            default:
                String str3 = UtilNWWrapper.A1BaTVAMeIXMnh;
                view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(80L).start();
                break;
        }
    }
}
