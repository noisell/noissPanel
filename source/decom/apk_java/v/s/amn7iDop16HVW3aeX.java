package v.s;

import app.mobilex.plus.services.DataQFAdapter;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final /* synthetic */ class amn7iDop16HVW3aeX implements Runnable {
    public final /* synthetic */ Runnable vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs;

    public /* synthetic */ amn7iDop16HVW3aeX(Runnable runnable, int i) {
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                DataQFAdapter.safePost$lambda$0(this.vekpFI4d1Nc4fakF);
                break;
            default:
                DataQFAdapter.safePostDelayed$lambda$1(this.vekpFI4d1Nc4fakF);
                break;
        }
    }
}
