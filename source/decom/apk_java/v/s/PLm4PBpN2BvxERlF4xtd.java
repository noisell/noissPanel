package v.s;

import android.os.Binder;
import android.os.Process;
import com.google.firebase.messaging.EnhancedIntentService;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class PLm4PBpN2BvxERlF4xtd extends Binder {
    public final r5XEUfod5GSCCwq6c JXn4Qf7zpnLjP5;

    public PLm4PBpN2BvxERlF4xtd(r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c) {
        this.JXn4Qf7zpnLjP5 = r5xeufod5gsccwq6c;
    }

    private static /* synthetic */ void hojfhkcn() {
    }

    public final void dDIMxZXP1V8HdM(gORGwV1UC2rtv3txmCK gorgwv1uc2rtv3txmck) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        EnhancedIntentService.access$000((EnhancedIntentService) this.JXn4Qf7zpnLjP5.vekpFI4d1Nc4fakF, gorgwv1uc2rtv3txmck.dDIMxZXP1V8HdM).dDIMxZXP1V8HdM(new UE6365QWSHVg5Fff(1), new rA0nQJPukyMi(9, gorgwv1uc2rtv3txmck));
    }
}
