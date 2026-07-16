package v.s;

import android.os.Process;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class MPy558nhplGUC implements Runnable {
    public final Runnable vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs;

    public /* synthetic */ MPy558nhplGUC(Runnable runnable, int i) {
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                try {
                    this.vekpFI4d1Nc4fakF.run();
                } catch (Exception unused) {
                    jb8et6SZeK5TWMrJFxDX.hjneShqpF9Tis4("Executor");
                    return;
                }
                break;
            case 1:
                this.vekpFI4d1Nc4fakF.run();
                break;
            default:
                Process.setThreadPriority(0);
                this.vekpFI4d1Nc4fakF.run();
                break;
        }
    }

    public String toString() {
        switch (this.w9sT1Swbhx3hs) {
            case 1:
                return this.vekpFI4d1Nc4fakF.toString();
            default:
                return super.toString();
        }
    }
}
