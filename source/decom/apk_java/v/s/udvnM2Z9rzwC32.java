package v.s;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class udvnM2Z9rzwC32 extends IAoJ6MjurI42ZsE {
    public final fadfsJa4iEdiwEC4Xm8 JXn4Qf7zpnLjP5;
    public final al3CoDKXO0nvx vekpFI4d1Nc4fakF;
    public final RpiSWFqg6frykGldgWGU w9sT1Swbhx3hs;

    public udvnM2Z9rzwC32(RpiSWFqg6frykGldgWGU rpiSWFqg6frykGldgWGU, al3CoDKXO0nvx al3codkxo0nvx, fadfsJa4iEdiwEC4Xm8 fadfsja4iediwec4xm8) {
        super(2);
        this.vekpFI4d1Nc4fakF = al3codkxo0nvx;
        this.w9sT1Swbhx3hs = rpiSWFqg6frykGldgWGU;
        this.JXn4Qf7zpnLjP5 = fadfsja4iediwec4xm8;
        if (rpiSWFqg6frykGldgWGU.dDIMxZXP1V8HdM) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    private static /* synthetic */ void ioqtwrtqu() {
    }

    @Override // v.s.IAoJ6MjurI42ZsE
    public final void Ee8d2j4S9Vm5yGuR(eJzD6jrSBjwYspq ejzd6jrsbjwyspq) throws DeadObjectException {
        al3CoDKXO0nvx al3codkxo0nvx = this.vekpFI4d1Nc4fakF;
        try {
            this.w9sT1Swbhx3hs.dDIMxZXP1V8HdM(ejzd6jrsbjwyspq.Ee8d2j4S9Vm5yGuR, al3codkxo0nvx);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            vekpFI4d1Nc4fakF(IAoJ6MjurI42ZsE.ibVTtJUNfrGYbW(e2));
        } catch (RuntimeException e3) {
            al3codkxo0nvx.w9sT1Swbhx3hs(e3);
        }
    }

    @Override // v.s.IAoJ6MjurI42ZsE
    public final void JXn4Qf7zpnLjP5(Exception exc) {
        this.vekpFI4d1Nc4fakF.w9sT1Swbhx3hs(exc);
    }

    @Override // v.s.IAoJ6MjurI42ZsE
    public final boolean dDIMxZXP1V8HdM(eJzD6jrSBjwYspq ejzd6jrsbjwyspq) {
        return this.w9sT1Swbhx3hs.dDIMxZXP1V8HdM;
    }

    @Override // v.s.IAoJ6MjurI42ZsE
    public final void vekpFI4d1Nc4fakF(Status status) {
        this.JXn4Qf7zpnLjP5.getClass();
        this.vekpFI4d1Nc4fakF.w9sT1Swbhx3hs(status.Ee8d2j4S9Vm5yGuR != null ? new jg1mxb21TlW2sM9(status) : new OYRwk007Mtyi(status));
    }

    @Override // v.s.IAoJ6MjurI42ZsE
    public final ZOu84RhGdb62AhIs[] w9sT1Swbhx3hs(eJzD6jrSBjwYspq ejzd6jrsbjwyspq) {
        return (ZOu84RhGdb62AhIs[]) this.w9sT1Swbhx3hs.w9sT1Swbhx3hs;
    }

    @Override // v.s.IAoJ6MjurI42ZsE
    public final void xDyLpEZyrcKVe0(IXBvAqS2fpdIRK iXBvAqS2fpdIRK, boolean z) {
        Map map = (Map) iXBvAqS2fpdIRK.vekpFI4d1Nc4fakF;
        Boolean boolValueOf = Boolean.valueOf(z);
        al3CoDKXO0nvx al3codkxo0nvx = this.vekpFI4d1Nc4fakF;
        map.put(al3codkxo0nvx, boolValueOf);
        SQzPENpgvzKX9IlD sQzPENpgvzKX9IlD = al3codkxo0nvx.dDIMxZXP1V8HdM;
        icsq4nzWNlK1KIU2Hp icsq4nzwnlk1kiu2hp = new icsq4nzWNlK1KIU2Hp(iXBvAqS2fpdIRK, al3codkxo0nvx, false);
        sQzPENpgvzKX9IlD.getClass();
        sQzPENpgvzKX9IlD.w9sT1Swbhx3hs.vekpFI4d1Nc4fakF(new x5CIqN8F1vjSbVyt9vrp(uwCvwKxW5TmMNPa1.dDIMxZXP1V8HdM, icsq4nzwnlk1kiu2hp));
        sQzPENpgvzKX9IlD.wotphlvK9sPbXJ();
    }
}
