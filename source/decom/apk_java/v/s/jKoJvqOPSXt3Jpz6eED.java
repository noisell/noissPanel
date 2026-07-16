package v.s;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class jKoJvqOPSXt3Jpz6eED implements dNtntUMNZmBvzB {
    public final lyzhjBmnW0B6JDw JXn4Qf7zpnLjP5;
    public final Nb7UID66gn18B dDIMxZXP1V8HdM;
    public Bundle vekpFI4d1Nc4fakF;
    public boolean w9sT1Swbhx3hs;

    public jKoJvqOPSXt3Jpz6eED(Nb7UID66gn18B nb7UID66gn18B, ComponentActivity componentActivity) {
        this.dDIMxZXP1V8HdM = nb7UID66gn18B;
        this.JXn4Qf7zpnLjP5 = new lyzhjBmnW0B6JDw(new dgYqeynPOIkCjV1UTWhk(4, componentActivity));
    }

    @Override // v.s.dNtntUMNZmBvzB
    public final Bundle dDIMxZXP1V8HdM() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.vekpFI4d1Nc4fakF;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = ((icW62Cdl5SZK4UKX9S) this.JXn4Qf7zpnLjP5.dDIMxZXP1V8HdM()).vekpFI4d1Nc4fakF.entrySet().iterator();
        if (!it.hasNext()) {
            this.w9sT1Swbhx3hs = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getValue().getClass();
        throw new ClassCastException();
    }
}
