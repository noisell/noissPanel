package v.s;

import android.app.Notification;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class gkrME4EN2eOCWFLS implements zb1Doc3Oy0ONl2wW {
    public IBinder JXn4Qf7zpnLjP5;

    private static /* synthetic */ void mftgeea() {
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.JXn4Qf7zpnLjP5;
    }

    public final void dDIMxZXP1V8HdM(String str, int i, Notification notification) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(zb1Doc3Oy0ONl2wW.dDIMxZXP1V8HdM);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            parcelObtain.writeString(null);
            if (notification != null) {
                parcelObtain.writeInt(1);
                notification.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.JXn4Qf7zpnLjP5.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
