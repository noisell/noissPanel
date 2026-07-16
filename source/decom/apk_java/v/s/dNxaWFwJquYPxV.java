package v.s;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class dNxaWFwJquYPxV extends xfn2GJwmGqs7kWW {
    public static final Parcelable.Creator<dNxaWFwJquYPxV> CREATOR = new hV4VTKNUdeHN(10);
    public final int Ee8d2j4S9Vm5yGuR;
    public final boolean JXn4Qf7zpnLjP5;
    public final boolean vekpFI4d1Nc4fakF;
    public final int w9sT1Swbhx3hs;
    public final int xDyLpEZyrcKVe0;

    public dNxaWFwJquYPxV(int i, boolean z, boolean z2, int i2, int i3) {
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = z;
        this.JXn4Qf7zpnLjP5 = z2;
        this.Ee8d2j4S9Vm5yGuR = i2;
        this.xDyLpEZyrcKVe0 = i3;
    }

    private static /* synthetic */ void pugrk() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iMLSIo1htfMPWeB8V876L = RIZfHbqXpth8r2yN4.MLSIo1htfMPWeB8V876L(parcel, 20293);
        RIZfHbqXpth8r2yN4.H9XlUr4OeMJFiXK(parcel, 1, 4);
        parcel.writeInt(this.w9sT1Swbhx3hs);
        RIZfHbqXpth8r2yN4.H9XlUr4OeMJFiXK(parcel, 2, 4);
        parcel.writeInt(this.vekpFI4d1Nc4fakF ? 1 : 0);
        RIZfHbqXpth8r2yN4.H9XlUr4OeMJFiXK(parcel, 3, 4);
        parcel.writeInt(this.JXn4Qf7zpnLjP5 ? 1 : 0);
        RIZfHbqXpth8r2yN4.H9XlUr4OeMJFiXK(parcel, 4, 4);
        parcel.writeInt(this.Ee8d2j4S9Vm5yGuR);
        RIZfHbqXpth8r2yN4.H9XlUr4OeMJFiXK(parcel, 5, 4);
        parcel.writeInt(this.xDyLpEZyrcKVe0);
        RIZfHbqXpth8r2yN4.XiR1pIn5878vVWd(parcel, iMLSIo1htfMPWeB8V876L);
    }
}
