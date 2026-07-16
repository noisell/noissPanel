package v.s;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class tiwWCjQGBV6U4NwhL {
    public static final tiwWCjQGBV6U4NwhL dDIMxZXP1V8HdM = new tiwWCjQGBV6U4NwhL();

    public final OnBackInvokedCallback dDIMxZXP1V8HdM(final JRdueaGIH5g8DVCPba jRdueaGIH5g8DVCPba) {
        return new OnBackInvokedCallback() { // from class: v.s.tECvk3v5kYM0iSg
            @Override // android.window.OnBackInvokedCallback
            public final void onBackInvoked() {
                jRdueaGIH5g8DVCPba.w9sT1Swbhx3hs();
            }
        };
    }

    public final void vekpFI4d1Nc4fakF(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }

    public final void w9sT1Swbhx3hs(Object obj, int i, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
    }
}
