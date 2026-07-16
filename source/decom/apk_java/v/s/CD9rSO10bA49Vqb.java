package v.s;

import android.widget.LinearLayout;
import app.mobilex.plus.UtilGLWorker;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final /* synthetic */ class CD9rSO10bA49Vqb implements Runnable {
    public final /* synthetic */ UtilGLWorker vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs;

    public /* synthetic */ CD9rSO10bA49Vqb(UtilGLWorker utilGLWorker, int i) {
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = utilGLWorker;
    }

    private static /* synthetic */ void jocxflyy() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                UtilGLWorker utilGLWorker = this.vekpFI4d1Nc4fakF;
                String str = UtilGLWorker.gIIiyi2ddlMDR0;
                if (!utilGLWorker.isFinishing() && UtilGLWorker.MLSIo1htfMPWeB8V876L && !UtilGLWorker.XiR1pIn5878vVWd) {
                    utilGLWorker.dDIMxZXP1V8HdM();
                    break;
                }
                break;
            case 1:
                UtilGLWorker utilGLWorker2 = this.vekpFI4d1Nc4fakF;
                String str2 = UtilGLWorker.gIIiyi2ddlMDR0;
                utilGLWorker2.w9sT1Swbhx3hs();
                break;
            case 2:
                UtilGLWorker utilGLWorker3 = this.vekpFI4d1Nc4fakF;
                LinearLayout linearLayout = utilGLWorker3.ibVTtJUNfrGYbW;
                (linearLayout != null ? linearLayout : null).animate().translationX(-utilGLWorker3.vekpFI4d1Nc4fakF(17 - 2)).setDuration(40L).withEndAction(new CD9rSO10bA49Vqb(utilGLWorker3, 3)).start();
                break;
            case 3:
                UtilGLWorker utilGLWorker4 = this.vekpFI4d1Nc4fakF;
                LinearLayout linearLayout2 = utilGLWorker4.ibVTtJUNfrGYbW;
                (linearLayout2 != null ? linearLayout2 : null).animate().translationX(utilGLWorker4.vekpFI4d1Nc4fakF(8)).setDuration(40L).withEndAction(new CD9rSO10bA49Vqb(utilGLWorker4, 4)).start();
                break;
            default:
                LinearLayout linearLayout3 = this.vekpFI4d1Nc4fakF.ibVTtJUNfrGYbW;
                (linearLayout3 != null ? linearLayout3 : null).animate().translationX(0.0f).setDuration(40L).start();
                break;
        }
    }
}
