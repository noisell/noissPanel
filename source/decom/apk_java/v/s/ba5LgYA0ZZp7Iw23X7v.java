package v.s;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class ba5LgYA0ZZp7Iw23X7v implements DialogInterface.OnClickListener {
    public final /* synthetic */ int dDIMxZXP1V8HdM;
    public final /* synthetic */ Object vekpFI4d1Nc4fakF;
    public final /* synthetic */ Intent w9sT1Swbhx3hs;

    public /* synthetic */ ba5LgYA0ZZp7Iw23X7v(Intent intent, Object obj, int i) {
        this.dDIMxZXP1V8HdM = i;
        this.w9sT1Swbhx3hs = intent;
        this.vekpFI4d1Nc4fakF = obj;
    }

    private static /* synthetic */ void hwxnlbq() {
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, v.s.je0sQalrykIjkQwyhopU] */
    public final void dDIMxZXP1V8HdM() {
        switch (this.dDIMxZXP1V8HdM) {
            case 0:
                Intent intent = this.w9sT1Swbhx3hs;
                if (intent != null) {
                    ((GoogleApiActivity) this.vekpFI4d1Nc4fakF).startActivityForResult(intent, 2);
                }
                break;
            default:
                Intent intent2 = this.w9sT1Swbhx3hs;
                if (intent2 != null) {
                    this.vekpFI4d1Nc4fakF.dDIMxZXP1V8HdM(intent2, 2);
                }
                break;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            dDIMxZXP1V8HdM();
        } catch (ActivityNotFoundException unused) {
            Build.FINGERPRINT.contains("generic");
        } finally {
            dialogInterface.dismiss();
        }
    }
}
