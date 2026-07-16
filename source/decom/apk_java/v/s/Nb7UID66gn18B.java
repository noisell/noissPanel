package v.s;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class Nb7UID66gn18B {
    public mIJpk1YW0Wj57i6sI60 Ee8d2j4S9Vm5yGuR;
    public boolean JXn4Qf7zpnLjP5;
    public Bundle vekpFI4d1Nc4fakF;
    public boolean w9sT1Swbhx3hs;
    public final oxDJvY4rcWCrlE dDIMxZXP1V8HdM = new oxDJvY4rcWCrlE();
    public boolean xDyLpEZyrcKVe0 = true;

    private static /* synthetic */ void vwjnzeceqi() {
    }

    public final Bundle dDIMxZXP1V8HdM(String str) {
        if (!this.JXn4Qf7zpnLjP5) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.vekpFI4d1Nc4fakF;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = this.vekpFI4d1Nc4fakF;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.vekpFI4d1Nc4fakF;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.vekpFI4d1Nc4fakF = null;
        return bundle2;
    }

    public final void w9sT1Swbhx3hs(String str, dNtntUMNZmBvzB dntntumnzmbvzb) {
        Object obj;
        oxDJvY4rcWCrlE oxdjvy4rcwcrle = this.dDIMxZXP1V8HdM;
        S4NwUM5fV12C6gDO s4NwUM5fV12C6gDODDIMxZXP1V8HdM = oxdjvy4rcwcrle.dDIMxZXP1V8HdM(str);
        if (s4NwUM5fV12C6gDODDIMxZXP1V8HdM != null) {
            obj = s4NwUM5fV12C6gDODDIMxZXP1V8HdM.vekpFI4d1Nc4fakF;
        } else {
            S4NwUM5fV12C6gDO s4NwUM5fV12C6gDO = new S4NwUM5fV12C6gDO(str, dntntumnzmbvzb);
            oxdjvy4rcwcrle.Ee8d2j4S9Vm5yGuR++;
            S4NwUM5fV12C6gDO s4NwUM5fV12C6gDO2 = oxdjvy4rcwcrle.vekpFI4d1Nc4fakF;
            if (s4NwUM5fV12C6gDO2 == null) {
                oxdjvy4rcwcrle.w9sT1Swbhx3hs = s4NwUM5fV12C6gDO;
                oxdjvy4rcwcrle.vekpFI4d1Nc4fakF = s4NwUM5fV12C6gDO;
            } else {
                s4NwUM5fV12C6gDO2.JXn4Qf7zpnLjP5 = s4NwUM5fV12C6gDO;
                s4NwUM5fV12C6gDO.Ee8d2j4S9Vm5yGuR = s4NwUM5fV12C6gDO2;
                oxdjvy4rcwcrle.vekpFI4d1Nc4fakF = s4NwUM5fV12C6gDO;
            }
            obj = null;
        }
        if (((dNtntUMNZmBvzB) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }
}
