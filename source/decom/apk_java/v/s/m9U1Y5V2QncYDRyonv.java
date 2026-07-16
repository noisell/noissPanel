package v.s;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class m9U1Y5V2QncYDRyonv implements IInterface {
    public final IBinder JXn4Qf7zpnLjP5;

    public m9U1Y5V2QncYDRyonv(IBinder iBinder) {
        this.JXn4Qf7zpnLjP5 = iBinder;
    }

    private static /* synthetic */ void pkefvybmt() {
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.JXn4Qf7zpnLjP5;
    }

    public final void dDIMxZXP1V8HdM(qO0mf7kdV0mG092z qo0mf7kdv0mg092z, tx2mRXNGxbMRUeJLCkv tx2mrxngxbmruejlckv) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(qo0mf7kdv0mg092z);
            parcelObtain.writeInt(1);
            hV4VTKNUdeHN.dDIMxZXP1V8HdM(tx2mrxngxbmruejlckv, parcelObtain, 0);
            this.JXn4Qf7zpnLjP5.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
