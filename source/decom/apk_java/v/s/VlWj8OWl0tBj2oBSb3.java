package v.s;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class VlWj8OWl0tBj2oBSb3 {
    public static final Uri Ee8d2j4S9Vm5yGuR = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final boolean JXn4Qf7zpnLjP5;
    public final String dDIMxZXP1V8HdM;
    public final int vekpFI4d1Nc4fakF;
    public final String w9sT1Swbhx3hs;

    public VlWj8OWl0tBj2oBSb3(String str, boolean z) {
        SbxdZ6Kq2uhHQ5RPRqm.Ee8d2j4S9Vm5yGuR(str);
        this.dDIMxZXP1V8HdM = str;
        SbxdZ6Kq2uhHQ5RPRqm.Ee8d2j4S9Vm5yGuR("com.google.android.gms");
        this.w9sT1Swbhx3hs = "com.google.android.gms";
        this.vekpFI4d1Nc4fakF = 4225;
        this.JXn4Qf7zpnLjP5 = z;
    }

    private static /* synthetic */ void mimjj() {
    }

    public final Intent dDIMxZXP1V8HdM(Context context) {
        Bundle bundleCall;
        Intent intent = null;
        String str = this.dDIMxZXP1V8HdM;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (this.JXn4Qf7zpnLjP5) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", str);
            try {
                bundleCall = context.getContentResolver().call(Ee8d2j4S9Vm5yGuR, "serviceIntentCall", (String) null, bundle);
            } catch (IllegalArgumentException e) {
                "Dynamic intent resolution failed: ".concat(e.toString());
                bundleCall = null;
            }
            intent = bundleCall != null ? (Intent) bundleCall.getParcelable("serviceResponseIntentKey") : null;
            if (intent == null) {
                "Dynamic lookup for intent failed for action: ".concat(String.valueOf(str));
            }
        }
        return intent != null ? intent : new Intent(str).setPackage(this.w9sT1Swbhx3hs);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VlWj8OWl0tBj2oBSb3)) {
            return false;
        }
        VlWj8OWl0tBj2oBSb3 vlWj8OWl0tBj2oBSb3 = (VlWj8OWl0tBj2oBSb3) obj;
        return OFtLBiBbrrTHWu.gIIiyi2ddlMDR0(this.dDIMxZXP1V8HdM, vlWj8OWl0tBj2oBSb3.dDIMxZXP1V8HdM) && OFtLBiBbrrTHWu.gIIiyi2ddlMDR0(this.w9sT1Swbhx3hs, vlWj8OWl0tBj2oBSb3.w9sT1Swbhx3hs) && OFtLBiBbrrTHWu.gIIiyi2ddlMDR0(null, null) && this.vekpFI4d1Nc4fakF == vlWj8OWl0tBj2oBSb3.vekpFI4d1Nc4fakF && this.JXn4Qf7zpnLjP5 == vlWj8OWl0tBj2oBSb3.JXn4Qf7zpnLjP5;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.dDIMxZXP1V8HdM, this.w9sT1Swbhx3hs, null, Integer.valueOf(this.vekpFI4d1Nc4fakF), Boolean.valueOf(this.JXn4Qf7zpnLjP5)});
    }

    public final String toString() {
        String str = this.dDIMxZXP1V8HdM;
        if (str != null) {
            return str;
        }
        SbxdZ6Kq2uhHQ5RPRqm.ibVTtJUNfrGYbW(null);
        throw null;
    }
}
