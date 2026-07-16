package v.s;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class CXBnffhfeleWi implements W8OnGfuXen8U, IInterface {
    public final IBinder JXn4Qf7zpnLjP5;

    public CXBnffhfeleWi(IBinder iBinder) {
        this.JXn4Qf7zpnLjP5 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.JXn4Qf7zpnLjP5;
    }

    public final Account dDIMxZXP1V8HdM() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IAccountAccessor");
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                this.JXn4Qf7zpnLjP5.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                parcelObtain.recycle();
                Account account = (Account) wuBAPrVsWrOr6aKUnfP.dDIMxZXP1V8HdM(parcelObtain2, Account.CREATOR);
                parcelObtain2.recycle();
                return account;
            } catch (RuntimeException e) {
                parcelObtain2.recycle();
                throw e;
            }
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }
}
