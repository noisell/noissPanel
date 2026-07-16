package v.s;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class Qn6Oecz8en5Uu {
    public final dvuzqcnBXF3OIH dDIMxZXP1V8HdM;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            int i = ub3qrc8BRBtj1QcvKHp5.gmNWMfvn6zlEj;
        } else {
            int i2 = dvuzqcnBXF3OIH.w9sT1Swbhx3hs;
        }
    }

    public Qn6Oecz8en5Uu(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.dDIMxZXP1V8HdM = new ub3qrc8BRBtj1QcvKHp5(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.dDIMxZXP1V8HdM = new P6ltWtl0GLiy(this, windowInsets);
        } else if (i >= 28) {
            this.dDIMxZXP1V8HdM = new dl2D4rAEOrKoP(this, windowInsets);
        } else {
            this.dDIMxZXP1V8HdM = new hzTimD5Ludyab7p6KFj(this, windowInsets);
        }
    }

    public static Qn6Oecz8en5Uu dDIMxZXP1V8HdM(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        Qn6Oecz8en5Uu qn6Oecz8en5Uu = new Qn6Oecz8en5Uu(windowInsets);
        if (view != null) {
            int i = tg6EjdKQH74QUty.dDIMxZXP1V8HdM;
            if (c3ktnmRelrusjqF5BDPM.w9sT1Swbhx3hs(view)) {
                Qn6Oecz8en5Uu qn6Oecz8en5UuDDIMxZXP1V8HdM = UUuUKckOlyWo.dDIMxZXP1V8HdM(view);
                dvuzqcnBXF3OIH dvuzqcnbxf3oih = qn6Oecz8en5Uu.dDIMxZXP1V8HdM;
                dvuzqcnbxf3oih.hjneShqpF9Tis4(qn6Oecz8en5UuDDIMxZXP1V8HdM);
                dvuzqcnbxf3oih.JXn4Qf7zpnLjP5(view.getRootView());
            }
        }
        return qn6Oecz8en5Uu;
    }

    private static /* synthetic */ void xwocvgc() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Qn6Oecz8en5Uu) {
            return Mcngq0nRJGlzNPdrzNDO.dDIMxZXP1V8HdM(this.dDIMxZXP1V8HdM, ((Qn6Oecz8en5Uu) obj).dDIMxZXP1V8HdM);
        }
        return false;
    }

    public final int hashCode() {
        dvuzqcnBXF3OIH dvuzqcnbxf3oih = this.dDIMxZXP1V8HdM;
        if (dvuzqcnbxf3oih == null) {
            return 0;
        }
        return dvuzqcnbxf3oih.hashCode();
    }

    public Qn6Oecz8en5Uu() {
        this.dDIMxZXP1V8HdM = new dvuzqcnBXF3OIH(this);
    }
}
