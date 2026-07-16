package v.s;

import android.os.Bundle;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class wx1uy9kWo2J3 {
    public final /* synthetic */ int Ee8d2j4S9Vm5yGuR;
    public final Bundle JXn4Qf7zpnLjP5;
    public final int dDIMxZXP1V8HdM;
    public final int vekpFI4d1Nc4fakF;
    public final al3CoDKXO0nvx w9sT1Swbhx3hs = new al3CoDKXO0nvx();

    public wx1uy9kWo2J3(int i, int i2, Bundle bundle, int i3) {
        this.Ee8d2j4S9Vm5yGuR = i3;
        this.dDIMxZXP1V8HdM = i;
        this.vekpFI4d1Nc4fakF = i2;
        this.JXn4Qf7zpnLjP5 = bundle;
    }

    public final boolean dDIMxZXP1V8HdM() {
        switch (this.Ee8d2j4S9Vm5yGuR) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final String toString() {
        return "Request { what=" + this.vekpFI4d1Nc4fakF + " id=" + this.dDIMxZXP1V8HdM + " oneWay=" + dDIMxZXP1V8HdM() + "}";
    }

    public final void w9sT1Swbhx3hs(OYRwk007Mtyi oYRwk007Mtyi) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            toString();
            oYRwk007Mtyi.toString();
        }
        this.w9sT1Swbhx3hs.dDIMxZXP1V8HdM.D5P1xCAyuvgF(oYRwk007Mtyi);
    }
}
