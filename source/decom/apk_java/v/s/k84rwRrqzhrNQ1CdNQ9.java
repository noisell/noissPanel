package v.s;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class k84rwRrqzhrNQ1CdNQ9 implements Parcelable {
    public static final Parcelable.Creator<k84rwRrqzhrNQ1CdNQ9> CREATOR = new hV4VTKNUdeHN(0);
    public final Intent vekpFI4d1Nc4fakF;
    public final int w9sT1Swbhx3hs;

    public k84rwRrqzhrNQ1CdNQ9(Intent intent, int i) {
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = intent;
    }

    private static /* synthetic */ void ywobyrihb() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [char, int] */
    public final String toString() {
        String strValueOf;
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.w9sT1Swbhx3hs;
        if (i != -1) {
            strValueOf = i != 0 ? String.valueOf(i) : "RESULT_CANCELED";
        } else {
            strValueOf = "RESULT_OK";
        }
        sb.append(strValueOf);
        sb.append(", data=");
        sb.append(this.vekpFI4d1Nc4fakF);
        sb.append((char) (214 - 89));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.w9sT1Swbhx3hs);
        Intent intent = this.vekpFI4d1Nc4fakF;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }

    public k84rwRrqzhrNQ1CdNQ9(Parcel parcel) {
        this.w9sT1Swbhx3hs = parcel.readInt();
        this.vekpFI4d1Nc4fakF = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
