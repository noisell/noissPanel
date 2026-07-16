package v.s;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class Qxq4OCIomL3rf7RSR implements Executor {
    public final Object vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs;

    public /* synthetic */ Qxq4OCIomL3rf7RSR(int i, Object obj) {
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                ((Executor) this.vekpFI4d1Nc4fakF).execute(new MPy558nhplGUC(runnable, 0));
                break;
            case 1:
                ((Handler) ((fUH025aw0Rgl) this.vekpFI4d1Nc4fakF).vekpFI4d1Nc4fakF).post(runnable);
                break;
            default:
                ((iFLJbvrqroccc6) this.vekpFI4d1Nc4fakF).post(runnable);
                break;
        }
    }

    public Qxq4OCIomL3rf7RSR() {
        this.w9sT1Swbhx3hs = 2;
        this.vekpFI4d1Nc4fakF = new iFLJbvrqroccc6(Looper.getMainLooper());
    }
}
