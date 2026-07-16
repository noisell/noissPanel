package v.s;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class dl2D4rAEOrKoP extends hzTimD5Ludyab7p6KFj {
    public dl2D4rAEOrKoP(Qn6Oecz8en5Uu qn6Oecz8en5Uu, WindowInsets windowInsets) {
        super(qn6Oecz8en5Uu, windowInsets);
    }

    private static /* synthetic */ void fbjspnvb() {
    }

    @Override // v.s.dvuzqcnBXF3OIH
    public LON4bDWRM17KC5Y Ee8d2j4S9Vm5yGuR() {
        DisplayCutout displayCutout = this.vekpFI4d1Nc4fakF.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new LON4bDWRM17KC5Y(displayCutout);
    }

    @Override // v.s.dvuzqcnBXF3OIH
    public Qn6Oecz8en5Uu dDIMxZXP1V8HdM() {
        return Qn6Oecz8en5Uu.dDIMxZXP1V8HdM(this.vekpFI4d1Nc4fakF.consumeDisplayCutout(), null);
    }

    @Override // v.s.DCB8nyKgYUfVe3Gvkcd, v.s.dvuzqcnBXF3OIH
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dl2D4rAEOrKoP)) {
            return false;
        }
        dl2D4rAEOrKoP dl2d4raeorkop = (dl2D4rAEOrKoP) obj;
        return Objects.equals(this.vekpFI4d1Nc4fakF, dl2d4raeorkop.vekpFI4d1Nc4fakF) && Objects.equals(this.Ee8d2j4S9Vm5yGuR, dl2d4raeorkop.Ee8d2j4S9Vm5yGuR);
    }

    @Override // v.s.dvuzqcnBXF3OIH
    public int hashCode() {
        return this.vekpFI4d1Nc4fakF.hashCode();
    }
}
