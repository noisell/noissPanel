package v.s;

import android.content.Context;
import android.os.Vibrator;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import app.mobilex.plus.util.TypefaceCache;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final /* synthetic */ class qWdun9tpyrzMOCG8H4x implements View.OnClickListener {
    public final /* synthetic */ int dDIMxZXP1V8HdM;
    public final /* synthetic */ Object vekpFI4d1Nc4fakF;
    public final /* synthetic */ EditText w9sT1Swbhx3hs;

    public /* synthetic */ qWdun9tpyrzMOCG8H4x(EditText editText, Object obj, int i) {
        this.dDIMxZXP1V8HdM = i;
        this.w9sT1Swbhx3hs = editText;
        this.vekpFI4d1Nc4fakF = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string;
        int i = this.dDIMxZXP1V8HdM;
        String str = "";
        Object obj = this.vekpFI4d1Nc4fakF;
        EditText editText = this.w9sT1Swbhx3hs;
        switch (i) {
            case 0:
                Context context = (Context) obj;
                if (!okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(editText.getText().toString(), vbdyByOHPJmeGXlq.gIIiyi2ddlMDR0)) {
                    try {
                        ((Vibrator) context.getSystemService("vibrator")).vibrate(200L);
                        break;
                    } catch (Exception unused) {
                    }
                    editText.setText("");
                    editText.setHint(TypefaceCache.checked("045E0423040904D204D004E204F904FE00630046007200A9"));
                } else {
                    String str2 = vbdyByOHPJmeGXlq.dDIMxZXP1V8HdM;
                    vbdyByOHPJmeGXlq.gIIiyi2ddlMDR0();
                }
                break;
            default:
                NiXw8wskyH18G niXw8wskyH18G = (NiXw8wskyH18G) obj;
                Editable text = editText.getText();
                if (text != null && (string = text.toString()) != null) {
                    str = string;
                }
                if (str.length() > 0) {
                    niXw8wskyH18G.dDIMxZXP1V8HdM.pyu8ovAipBTLYAiKab(str);
                }
                break;
        }
    }
}
