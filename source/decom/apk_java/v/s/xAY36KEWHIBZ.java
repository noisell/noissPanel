package v.s;

import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import app.mobilex.plus.ManagerGXController;
import app.mobilex.plus.UtilNWWrapper;
import app.mobilex.plus.util.TypefaceCache;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final /* synthetic */ class xAY36KEWHIBZ implements View.OnClickListener {
    public final /* synthetic */ int dDIMxZXP1V8HdM;
    public final /* synthetic */ Object w9sT1Swbhx3hs;

    public /* synthetic */ xAY36KEWHIBZ(int i, Object obj) {
        this.dDIMxZXP1V8HdM = i;
        this.w9sT1Swbhx3hs = obj;
    }

    private static /* synthetic */ void ncpohcb() {
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [v.s.JRdueaGIH5g8DVCPba, v.s.LGm23hksIOxB] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string;
        Editable text;
        int i = this.dDIMxZXP1V8HdM;
        Object obj = this.w9sT1Swbhx3hs;
        switch (i) {
            case 0:
                int i2 = ManagerGXController.dDIMxZXP1V8HdM;
                ((ManagerGXController) obj).finish();
                break;
            case 1:
                String str = UtilNWWrapper.A1BaTVAMeIXMnh;
                view.animate().scaleX(0.95f).scaleY(0.95f).setDuration(80L).withEndAction(new mSyFfcAAyjxLnl2Ul6(view, 2)).start();
                ((jme6JDteoDB1AsG4) obj).b1EoSIRjJHO5.w9sT1Swbhx3hs();
                break;
            default:
                EditText editText = (EditText) ((aqjfZUF02xH6w) obj).w9sT1Swbhx3hs;
                if (editText == null || (text = editText.getText()) == null || (string = text.toString()) == null) {
                    string = "";
                }
                String str2 = vbdyByOHPJmeGXlq.dDIMxZXP1V8HdM;
                vbdyByOHPJmeGXlq.nQilHWaqS401ZtR(TypefaceCache.obtain("002000790055008100F900AD00DF00A20027"), string);
                vbdyByOHPJmeGXlq.gIIiyi2ddlMDR0();
                break;
        }
    }
}
