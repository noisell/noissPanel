package v.s;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class iy6XJYBMukwASsw implements Parcelable {
    public static final Parcelable.Creator<iy6XJYBMukwASsw> CREATOR = new hV4VTKNUdeHN(2);
    public int Ee8d2j4S9Vm5yGuR;
    public zanAuj2ot0jORaEjW[] JXn4Qf7zpnLjP5;
    public int[] vekpFI4d1Nc4fakF;
    public RaNTLh2L5X1WKOT[] w9sT1Swbhx3hs;
    public int xDyLpEZyrcKVe0;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.w9sT1Swbhx3hs, i);
        parcel.writeIntArray(this.vekpFI4d1Nc4fakF);
        parcel.writeTypedArray(this.JXn4Qf7zpnLjP5, i);
        parcel.writeInt(this.Ee8d2j4S9Vm5yGuR);
        parcel.writeInt(this.xDyLpEZyrcKVe0);
    }
}
