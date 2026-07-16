package v.s;

import android.util.Base64;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class oO26y14q3Pwf {
    public final String dDIMxZXP1V8HdM;
    public final LB7U1qakabytBm vekpFI4d1Nc4fakF;
    public final byte[] w9sT1Swbhx3hs;

    public oO26y14q3Pwf(String str, byte[] bArr, LB7U1qakabytBm lB7U1qakabytBm) {
        this.dDIMxZXP1V8HdM = str;
        this.w9sT1Swbhx3hs = bArr;
        this.vekpFI4d1Nc4fakF = lB7U1qakabytBm;
    }

    private static /* synthetic */ void abtrqrfmf() {
    }

    public static UWYuX9UTvV9YpFO4TOW dDIMxZXP1V8HdM() {
        UWYuX9UTvV9YpFO4TOW uWYuX9UTvV9YpFO4TOW = new UWYuX9UTvV9YpFO4TOW();
        uWYuX9UTvV9YpFO4TOW.JXn4Qf7zpnLjP5 = LB7U1qakabytBm.w9sT1Swbhx3hs;
        return uWYuX9UTvV9YpFO4TOW;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oO26y14q3Pwf) {
            oO26y14q3Pwf oo26y14q3pwf = (oO26y14q3Pwf) obj;
            if (this.dDIMxZXP1V8HdM.equals(oo26y14q3pwf.dDIMxZXP1V8HdM) && Arrays.equals(this.w9sT1Swbhx3hs, oo26y14q3pwf.w9sT1Swbhx3hs) && this.vekpFI4d1Nc4fakF.equals(oo26y14q3pwf.vekpFI4d1Nc4fakF)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.dDIMxZXP1V8HdM.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.w9sT1Swbhx3hs)) * 1000003) ^ this.vekpFI4d1Nc4fakF.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.w9sT1Swbhx3hs;
        String strEncodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.dDIMxZXP1V8HdM);
        sb.append(", ");
        sb.append(this.vekpFI4d1Nc4fakF);
        sb.append(", ");
        return Y9mRyRdkl5FOcwb66V6.D5P1xCAyuvgF(sb, strEncodeToString, ")");
    }
}
