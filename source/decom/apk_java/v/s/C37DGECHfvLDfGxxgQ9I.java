package v.s;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class C37DGECHfvLDfGxxgQ9I implements ServiceConnection {
    public final int dDIMxZXP1V8HdM;
    public final /* synthetic */ com.google.android.gms.common.internal.dDIMxZXP1V8HdM w9sT1Swbhx3hs;

    public C37DGECHfvLDfGxxgQ9I(com.google.android.gms.common.internal.dDIMxZXP1V8HdM ddimxzxp1v8hdm, int i) {
        this.w9sT1Swbhx3hs = ddimxzxp1v8hdm;
        this.dDIMxZXP1V8HdM = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i2;
        com.google.android.gms.common.internal.dDIMxZXP1V8HdM ddimxzxp1v8hdm = this.w9sT1Swbhx3hs;
        if (iBinder == null) {
            synchronized (ddimxzxp1v8hdm.xDyLpEZyrcKVe0) {
                i = ddimxzxp1v8hdm.gIIiyi2ddlMDR0;
            }
            if (i == 3) {
                ddimxzxp1v8hdm.H9XlUr4OeMJFiXK = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            ae3ufUFlmQpITaPpj ae3ufuflmqpitappj = ddimxzxp1v8hdm.Ee8d2j4S9Vm5yGuR;
            ae3ufuflmqpitappj.sendMessage(ae3ufuflmqpitappj.obtainMessage(i2, ddimxzxp1v8hdm.l1V0lQr6TbwNKqHfXNbb.get(), 16));
            return;
        }
        synchronized (ddimxzxp1v8hdm.ibVTtJUNfrGYbW) {
            try {
                com.google.android.gms.common.internal.dDIMxZXP1V8HdM ddimxzxp1v8hdm2 = this.w9sT1Swbhx3hs;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                ddimxzxp1v8hdm2.b1EoSIRjJHO5 = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof m9U1Y5V2QncYDRyonv)) ? new m9U1Y5V2QncYDRyonv(iBinder) : (m9U1Y5V2QncYDRyonv) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.common.internal.dDIMxZXP1V8HdM ddimxzxp1v8hdm3 = this.w9sT1Swbhx3hs;
        int i3 = this.dDIMxZXP1V8HdM;
        ae3ufUFlmQpITaPpj ae3ufuflmqpitappj2 = ddimxzxp1v8hdm3.Ee8d2j4S9Vm5yGuR;
        ae3ufuflmqpitappj2.sendMessage(ae3ufuflmqpitappj2.obtainMessage(7, i3, -1, new eO2DRBl0g10gsbN7WKX(ddimxzxp1v8hdm3, 0)));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.common.internal.dDIMxZXP1V8HdM ddimxzxp1v8hdm;
        synchronized (this.w9sT1Swbhx3hs.ibVTtJUNfrGYbW) {
            ddimxzxp1v8hdm = this.w9sT1Swbhx3hs;
            ddimxzxp1v8hdm.b1EoSIRjJHO5 = null;
        }
        ae3ufUFlmQpITaPpj ae3ufuflmqpitappj = ddimxzxp1v8hdm.Ee8d2j4S9Vm5yGuR;
        ae3ufuflmqpitappj.sendMessage(ae3ufuflmqpitappj.obtainMessage(6, this.dDIMxZXP1V8HdM, 1));
    }
}
