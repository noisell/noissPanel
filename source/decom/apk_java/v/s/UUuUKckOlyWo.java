package v.s;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class UUuUKckOlyWo {
    public static void JXn4Qf7zpnLjP5(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }

    public static Qn6Oecz8en5Uu dDIMxZXP1V8HdM(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        Qn6Oecz8en5Uu qn6Oecz8en5UuDDIMxZXP1V8HdM = Qn6Oecz8en5Uu.dDIMxZXP1V8HdM(rootWindowInsets, null);
        dvuzqcnBXF3OIH dvuzqcnbxf3oih = qn6Oecz8en5UuDDIMxZXP1V8HdM.dDIMxZXP1V8HdM;
        dvuzqcnbxf3oih.hjneShqpF9Tis4(qn6Oecz8en5UuDDIMxZXP1V8HdM);
        dvuzqcnbxf3oih.JXn4Qf7zpnLjP5(view.getRootView());
        return qn6Oecz8en5UuDDIMxZXP1V8HdM;
    }

    public static void vekpFI4d1Nc4fakF(View view, int i) {
        view.setScrollIndicators(i);
    }

    public static int w9sT1Swbhx3hs(View view) {
        return view.getScrollIndicators();
    }
}
