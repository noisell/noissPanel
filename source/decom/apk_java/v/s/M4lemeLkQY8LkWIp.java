package v.s;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class M4lemeLkQY8LkWIp extends xfn2GJwmGqs7kWW {
    public static final Parcelable.Creator<M4lemeLkQY8LkWIp> CREATOR = new hV4VTKNUdeHN(17);
    public final int[] Ee8d2j4S9Vm5yGuR;
    public final boolean JXn4Qf7zpnLjP5;
    public final int[] ibVTtJUNfrGYbW;
    public final boolean vekpFI4d1Nc4fakF;
    public final dNxaWFwJquYPxV w9sT1Swbhx3hs;
    public final int xDyLpEZyrcKVe0;

    public M4lemeLkQY8LkWIp(dNxaWFwJquYPxV dnxawfwjquypxv, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.w9sT1Swbhx3hs = dnxawfwjquypxv;
        this.vekpFI4d1Nc4fakF = z;
        this.JXn4Qf7zpnLjP5 = z2;
        this.Ee8d2j4S9Vm5yGuR = iArr;
        this.xDyLpEZyrcKVe0 = i;
        this.ibVTtJUNfrGYbW = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iMLSIo1htfMPWeB8V876L = RIZfHbqXpth8r2yN4.MLSIo1htfMPWeB8V876L(parcel, 20380 - 87);
        RIZfHbqXpth8r2yN4.Qrz92kRPw4GcghAc(parcel, 1, this.w9sT1Swbhx3hs, i);
        RIZfHbqXpth8r2yN4.H9XlUr4OeMJFiXK(parcel, 2, 4);
        parcel.writeInt(this.vekpFI4d1Nc4fakF ? 1 : 0);
        RIZfHbqXpth8r2yN4.H9XlUr4OeMJFiXK(parcel, 3, 4);
        parcel.writeInt(this.JXn4Qf7zpnLjP5 ? 1 : 0);
        int[] iArr = this.Ee8d2j4S9Vm5yGuR;
        if (iArr != null) {
            int iMLSIo1htfMPWeB8V876L2 = RIZfHbqXpth8r2yN4.MLSIo1htfMPWeB8V876L(parcel, 4);
            parcel.writeIntArray(iArr);
            RIZfHbqXpth8r2yN4.XiR1pIn5878vVWd(parcel, iMLSIo1htfMPWeB8V876L2);
        }
        RIZfHbqXpth8r2yN4.H9XlUr4OeMJFiXK(parcel, 5, 4);
        parcel.writeInt(this.xDyLpEZyrcKVe0);
        int[] iArr2 = this.ibVTtJUNfrGYbW;
        if (iArr2 != null) {
            int iMLSIo1htfMPWeB8V876L3 = RIZfHbqXpth8r2yN4.MLSIo1htfMPWeB8V876L(parcel, 6);
            parcel.writeIntArray(iArr2);
            RIZfHbqXpth8r2yN4.XiR1pIn5878vVWd(parcel, iMLSIo1htfMPWeB8V876L3);
        }
        RIZfHbqXpth8r2yN4.XiR1pIn5878vVWd(parcel, iMLSIo1htfMPWeB8V876L);
    }
}
