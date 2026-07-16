package v.s;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class D3nkzQlSKjHnRbwlOY extends xfn2GJwmGqs7kWW {
    public static final Parcelable.Creator<D3nkzQlSKjHnRbwlOY> CREATOR = new hV4VTKNUdeHN(6);
    public fEyMFFyOOvHURJ7To6L JXn4Qf7zpnLjP5;
    public Sn2d19yOBfyV0rw vekpFI4d1Nc4fakF;
    public final Bundle w9sT1Swbhx3hs;

    public D3nkzQlSKjHnRbwlOY(Bundle bundle) {
        this.w9sT1Swbhx3hs = bundle;
    }

    private static /* synthetic */ void rhcaekhqh() {
    }

    public final Map dDIMxZXP1V8HdM() {
        if (this.vekpFI4d1Nc4fakF == null) {
            Sn2d19yOBfyV0rw sn2d19yOBfyV0rw = new Sn2d19yOBfyV0rw();
            Bundle bundle = this.w9sT1Swbhx3hs;
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        sn2d19yOBfyV0rw.put(str, str2);
                    }
                }
            }
            this.vekpFI4d1Nc4fakF = sn2d19yOBfyV0rw;
        }
        return this.vekpFI4d1Nc4fakF;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iMLSIo1htfMPWeB8V876L = RIZfHbqXpth8r2yN4.MLSIo1htfMPWeB8V876L(parcel, 20293);
        RIZfHbqXpth8r2yN4.wotphlvK9sPbXJ(parcel, 2, this.w9sT1Swbhx3hs);
        RIZfHbqXpth8r2yN4.XiR1pIn5878vVWd(parcel, iMLSIo1htfMPWeB8V876L);
    }
}
