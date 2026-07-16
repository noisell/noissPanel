package v.s;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class hzTimD5Ludyab7p6KFj extends DCB8nyKgYUfVe3Gvkcd {
    public cW9NuMIelqMpa hjneShqpF9Tis4;

    public hzTimD5Ludyab7p6KFj(Qn6Oecz8en5Uu qn6Oecz8en5Uu, WindowInsets windowInsets) {
        super(qn6Oecz8en5Uu, windowInsets);
        this.hjneShqpF9Tis4 = null;
    }

    @Override // v.s.dvuzqcnBXF3OIH
    public boolean b1EoSIRjJHO5() {
        return this.vekpFI4d1Nc4fakF.isConsumed();
    }

    @Override // v.s.dvuzqcnBXF3OIH
    public void gmNWMfvn6zlEj(cW9NuMIelqMpa cw9numielqmpa) {
        this.hjneShqpF9Tis4 = cw9numielqmpa;
    }

    @Override // v.s.dvuzqcnBXF3OIH
    public Qn6Oecz8en5Uu vekpFI4d1Nc4fakF() {
        return Qn6Oecz8en5Uu.dDIMxZXP1V8HdM(this.vekpFI4d1Nc4fakF.consumeSystemWindowInsets(), null);
    }

    @Override // v.s.dvuzqcnBXF3OIH
    public Qn6Oecz8en5Uu w9sT1Swbhx3hs() {
        return Qn6Oecz8en5Uu.dDIMxZXP1V8HdM(this.vekpFI4d1Nc4fakF.consumeStableInsets(), null);
    }

    @Override // v.s.dvuzqcnBXF3OIH
    public final cW9NuMIelqMpa xDyLpEZyrcKVe0() {
        if (this.hjneShqpF9Tis4 == null) {
            WindowInsets windowInsets = this.vekpFI4d1Nc4fakF;
            this.hjneShqpF9Tis4 = cW9NuMIelqMpa.dDIMxZXP1V8HdM(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.hjneShqpF9Tis4;
    }
}
