package v.s;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class WwSWNyqqftA9x extends DialogFragment {
    public Dialog dDIMxZXP1V8HdM;
    public AlertDialog vekpFI4d1Nc4fakF;
    public DialogInterface.OnCancelListener w9sT1Swbhx3hs;

    private static /* synthetic */ void jbvpihzy() {
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.w9sT1Swbhx3hs;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.dDIMxZXP1V8HdM;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.vekpFI4d1Nc4fakF == null) {
            Activity activity = getActivity();
            SbxdZ6Kq2uhHQ5RPRqm.ibVTtJUNfrGYbW(activity);
            this.vekpFI4d1Nc4fakF = new AlertDialog.Builder(activity).create();
        }
        return this.vekpFI4d1Nc4fakF;
    }
}
