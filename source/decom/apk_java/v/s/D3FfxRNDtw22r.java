package v.s;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class D3FfxRNDtw22r implements Parcelable {
    public static final Parcelable.Creator<D3FfxRNDtw22r> CREATOR = new hV4VTKNUdeHN(15);
    public final Messenger w9sT1Swbhx3hs;

    public D3FfxRNDtw22r(IBinder iBinder) {
        this.w9sT1Swbhx3hs = new Messenger(iBinder);
    }

    private static /* synthetic */ void ntnuivlv() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Messenger messenger = this.w9sT1Swbhx3hs;
            messenger.getClass();
            IBinder binder = messenger.getBinder();
            Messenger messenger2 = ((D3FfxRNDtw22r) obj).w9sT1Swbhx3hs;
            messenger2.getClass();
            return binder.equals(messenger2.getBinder());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        Messenger messenger = this.w9sT1Swbhx3hs;
        messenger.getClass();
        return messenger.getBinder().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.w9sT1Swbhx3hs;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
