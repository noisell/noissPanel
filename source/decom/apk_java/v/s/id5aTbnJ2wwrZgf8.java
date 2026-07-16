package v.s;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class id5aTbnJ2wwrZgf8 extends Es1n423DpwihY8I {
    public final /* synthetic */ com.google.android.gms.common.internal.dDIMxZXP1V8HdM b1EoSIRjJHO5;
    public final IBinder ibVTtJUNfrGYbW;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public id5aTbnJ2wwrZgf8(com.google.android.gms.common.internal.dDIMxZXP1V8HdM ddimxzxp1v8hdm, int i, IBinder iBinder, Bundle bundle) {
        super(ddimxzxp1v8hdm, i, bundle);
        this.b1EoSIRjJHO5 = ddimxzxp1v8hdm;
        this.ibVTtJUNfrGYbW = iBinder;
    }

    private static /* synthetic */ void djjctf() {
    }

    @Override // v.s.Es1n423DpwihY8I
    public final void dDIMxZXP1V8HdM(nyZDwrpXoi7nqMd nyzdwrpxoi7nqmd) {
        r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c = this.b1EoSIRjJHO5.Qrz92kRPw4GcghAc;
        if (r5xeufod5gsccwq6c != null) {
            ((VjoqvUCgHSpPnaGc) r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF).dDIMxZXP1V8HdM(nyzdwrpxoi7nqmd);
        }
        System.currentTimeMillis();
    }

    @Override // v.s.Es1n423DpwihY8I
    public final boolean w9sT1Swbhx3hs() {
        IInterface iInterfaceQrz92kRPw4GcghAc;
        IBinder iBinder = this.ibVTtJUNfrGYbW;
        try {
            SbxdZ6Kq2uhHQ5RPRqm.ibVTtJUNfrGYbW(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            com.google.android.gms.common.internal.dDIMxZXP1V8HdM ddimxzxp1v8hdm = this.b1EoSIRjJHO5;
            if (!ddimxzxp1v8hdm.MLSIo1htfMPWeB8V876L().equals(interfaceDescriptor) || (iInterfaceQrz92kRPw4GcghAc = ddimxzxp1v8hdm.Qrz92kRPw4GcghAc(iBinder)) == null) {
                return false;
            }
            if (!com.google.android.gms.common.internal.dDIMxZXP1V8HdM.DVTNwpDEVsUKuznof(ddimxzxp1v8hdm, 2, 4, iInterfaceQrz92kRPw4GcghAc) && !com.google.android.gms.common.internal.dDIMxZXP1V8HdM.DVTNwpDEVsUKuznof(ddimxzxp1v8hdm, 3, 4, iInterfaceQrz92kRPw4GcghAc)) {
                return false;
            }
            ddimxzxp1v8hdm.XiR1pIn5878vVWd = null;
            r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c = ddimxzxp1v8hdm.wotphlvK9sPbXJ;
            if (r5xeufod5gsccwq6c == null) {
                return true;
            }
            ((Irpcf8dxYWkn3XNhG) r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF).vekpFI4d1Nc4fakF();
            return true;
        } catch (RemoteException unused) {
            return false;
        }
    }
}
