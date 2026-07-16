package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import v.s.fpLUurEzh4fb4JIu1w4;
import v.s.hV4VTKNUdeHN;
import v.s.uhZmrHoOCxNeh;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new hV4VTKNUdeHN(5);
    public final uhZmrHoOCxNeh w9sT1Swbhx3hs;

    public ParcelImpl(Parcel parcel) {
        this.w9sT1Swbhx3hs = new fpLUurEzh4fb4JIu1w4(parcel).ibVTtJUNfrGYbW();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new fpLUurEzh4fb4JIu1w4(parcel).pyu8ovAipBTLYAiKab(this.w9sT1Swbhx3hs);
    }
}
