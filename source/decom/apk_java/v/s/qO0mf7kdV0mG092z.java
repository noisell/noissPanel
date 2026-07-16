package v.s;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class qO0mf7kdV0mG092z extends GYkdAGGWWPCn2kb8Q {
    public com.google.android.gms.common.internal.dDIMxZXP1V8HdM Ee8d2j4S9Vm5yGuR;
    public final int xDyLpEZyrcKVe0;

    public qO0mf7kdV0mG092z(com.google.android.gms.common.internal.dDIMxZXP1V8HdM ddimxzxp1v8hdm, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.Ee8d2j4S9Vm5yGuR = ddimxzxp1v8hdm;
        this.xDyLpEZyrcKVe0 = i;
    }

    @Override // v.s.GYkdAGGWWPCn2kb8Q
    public final boolean JXn4Qf7zpnLjP5(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int i2 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) wuBAPrVsWrOr6aKUnfP.dDIMxZXP1V8HdM(parcel, Bundle.CREATOR);
            wuBAPrVsWrOr6aKUnfP.w9sT1Swbhx3hs(parcel);
            SbxdZ6Kq2uhHQ5RPRqm.b1EoSIRjJHO5(this.Ee8d2j4S9Vm5yGuR, "onPostInitComplete can be called only once per call to getRemoteService");
            com.google.android.gms.common.internal.dDIMxZXP1V8HdM ddimxzxp1v8hdm = this.Ee8d2j4S9Vm5yGuR;
            int i3 = this.xDyLpEZyrcKVe0;
            ae3ufUFlmQpITaPpj ae3ufuflmqpitappj = ddimxzxp1v8hdm.Ee8d2j4S9Vm5yGuR;
            ae3ufuflmqpitappj.sendMessage(ae3ufuflmqpitappj.obtainMessage(1, i3, -1, new id5aTbnJ2wwrZgf8(ddimxzxp1v8hdm, i2, strongBinder, bundle)));
            this.Ee8d2j4S9Vm5yGuR = null;
        } else if (i == 2) {
            parcel.readInt();
            wuBAPrVsWrOr6aKUnfP.w9sT1Swbhx3hs(parcel);
            new Exception();
        } else {
            if (i != 3) {
                return false;
            }
            int i4 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            x3KUHp0bS6JZ7 x3kuhp0bs6jz7 = (x3KUHp0bS6JZ7) wuBAPrVsWrOr6aKUnfP.dDIMxZXP1V8HdM(parcel, x3KUHp0bS6JZ7.CREATOR);
            wuBAPrVsWrOr6aKUnfP.w9sT1Swbhx3hs(parcel);
            com.google.android.gms.common.internal.dDIMxZXP1V8HdM ddimxzxp1v8hdm2 = this.Ee8d2j4S9Vm5yGuR;
            SbxdZ6Kq2uhHQ5RPRqm.b1EoSIRjJHO5(ddimxzxp1v8hdm2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            SbxdZ6Kq2uhHQ5RPRqm.ibVTtJUNfrGYbW(x3kuhp0bs6jz7);
            ddimxzxp1v8hdm2.DVTNwpDEVsUKuznof = x3kuhp0bs6jz7;
            Bundle bundle2 = x3kuhp0bs6jz7.w9sT1Swbhx3hs;
            SbxdZ6Kq2uhHQ5RPRqm.b1EoSIRjJHO5(this.Ee8d2j4S9Vm5yGuR, "onPostInitComplete can be called only once per call to getRemoteService");
            com.google.android.gms.common.internal.dDIMxZXP1V8HdM ddimxzxp1v8hdm3 = this.Ee8d2j4S9Vm5yGuR;
            int i5 = this.xDyLpEZyrcKVe0;
            ae3ufUFlmQpITaPpj ae3ufuflmqpitappj2 = ddimxzxp1v8hdm3.Ee8d2j4S9Vm5yGuR;
            ae3ufuflmqpitappj2.sendMessage(ae3ufuflmqpitappj2.obtainMessage(1, i5, -1, new id5aTbnJ2wwrZgf8(ddimxzxp1v8hdm3, i4, strongBinder2, bundle2)));
            this.Ee8d2j4S9Vm5yGuR = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
