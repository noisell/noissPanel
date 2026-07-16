package v.s;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class N3OQwXegjg1zeRF extends xfn2GJwmGqs7kWW {
    public static final Parcelable.Creator<N3OQwXegjg1zeRF> CREATOR = new hV4VTKNUdeHN(7);
    public List vekpFI4d1Nc4fakF;
    public final int w9sT1Swbhx3hs;

    public N3OQwXegjg1zeRF(int i, List list) {
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iMLSIo1htfMPWeB8V876L = RIZfHbqXpth8r2yN4.MLSIo1htfMPWeB8V876L(parcel, 20293);
        RIZfHbqXpth8r2yN4.H9XlUr4OeMJFiXK(parcel, 1, 4);
        parcel.writeInt(this.w9sT1Swbhx3hs);
        List list = this.vekpFI4d1Nc4fakF;
        if (list != null) {
            int iMLSIo1htfMPWeB8V876L2 = RIZfHbqXpth8r2yN4.MLSIo1htfMPWeB8V876L(parcel, 2);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcelable parcelable = (Parcelable) list.get(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    int iDataPosition = parcel.dataPosition();
                    parcel.writeInt(1);
                    int iDataPosition2 = parcel.dataPosition();
                    parcelable.writeToParcel(parcel, 0);
                    int iDataPosition3 = parcel.dataPosition();
                    parcel.setDataPosition(iDataPosition);
                    parcel.writeInt(iDataPosition3 - iDataPosition2);
                    parcel.setDataPosition(iDataPosition3);
                }
            }
            RIZfHbqXpth8r2yN4.XiR1pIn5878vVWd(parcel, iMLSIo1htfMPWeB8V876L2);
        }
        RIZfHbqXpth8r2yN4.XiR1pIn5878vVWd(parcel, iMLSIo1htfMPWeB8V876L);
    }
}
