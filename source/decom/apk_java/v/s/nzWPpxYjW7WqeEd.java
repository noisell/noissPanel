package v.s;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class nzWPpxYjW7WqeEd implements Parcelable {
    public static final Parcelable.Creator<nzWPpxYjW7WqeEd> CREATOR = new hV4VTKNUdeHN(4);
    public final int Ee8d2j4S9Vm5yGuR;
    public final int JXn4Qf7zpnLjP5;
    public final Intent vekpFI4d1Nc4fakF;
    public final IntentSender w9sT1Swbhx3hs;

    public nzWPpxYjW7WqeEd(Parcel parcel) {
        IntentSender intentSender = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        Intent intent = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        int i = parcel.readInt();
        int i2 = parcel.readInt();
        this.w9sT1Swbhx3hs = intentSender;
        this.vekpFI4d1Nc4fakF = intent;
        this.JXn4Qf7zpnLjP5 = i;
        this.Ee8d2j4S9Vm5yGuR = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.w9sT1Swbhx3hs, i);
        parcel.writeParcelable(this.vekpFI4d1Nc4fakF, i);
        parcel.writeInt(this.JXn4Qf7zpnLjP5);
        parcel.writeInt(this.Ee8d2j4S9Vm5yGuR);
    }
}
