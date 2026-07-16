package v.s;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class eJ9sZWlEXcxX3ubkM extends IAoJ6MjurI42ZsE {
    public final al3CoDKXO0nvx w9sT1Swbhx3hs;

    public eJ9sZWlEXcxX3ubkM(al3CoDKXO0nvx al3codkxo0nvx) {
        super(4);
        this.w9sT1Swbhx3hs = al3codkxo0nvx;
    }

    @Override // v.s.IAoJ6MjurI42ZsE
    public final void Ee8d2j4S9Vm5yGuR(eJzD6jrSBjwYspq ejzd6jrsbjwyspq) throws DeadObjectException {
        try {
            b1EoSIRjJHO5(ejzd6jrsbjwyspq);
        } catch (DeadObjectException e) {
            vekpFI4d1Nc4fakF(IAoJ6MjurI42ZsE.ibVTtJUNfrGYbW(e));
            throw e;
        } catch (RemoteException e2) {
            vekpFI4d1Nc4fakF(IAoJ6MjurI42ZsE.ibVTtJUNfrGYbW(e2));
        } catch (RuntimeException e3) {
            this.w9sT1Swbhx3hs.w9sT1Swbhx3hs(e3);
        }
    }

    @Override // v.s.IAoJ6MjurI42ZsE
    public final void JXn4Qf7zpnLjP5(Exception exc) {
        this.w9sT1Swbhx3hs.w9sT1Swbhx3hs(exc);
    }

    public final void b1EoSIRjJHO5(eJzD6jrSBjwYspq ejzd6jrsbjwyspq) {
        if (ejzd6jrsbjwyspq.pyu8ovAipBTLYAiKab.remove(null) != null) {
            throw new ClassCastException();
        }
        this.w9sT1Swbhx3hs.vekpFI4d1Nc4fakF(Boolean.FALSE);
    }

    @Override // v.s.IAoJ6MjurI42ZsE
    public final boolean dDIMxZXP1V8HdM(eJzD6jrSBjwYspq ejzd6jrsbjwyspq) {
        if (ejzd6jrsbjwyspq.pyu8ovAipBTLYAiKab.get(null) == null) {
            return false;
        }
        throw new ClassCastException();
    }

    @Override // v.s.IAoJ6MjurI42ZsE
    public final void vekpFI4d1Nc4fakF(Status status) {
        this.w9sT1Swbhx3hs.w9sT1Swbhx3hs(new OYRwk007Mtyi(status));
    }

    @Override // v.s.IAoJ6MjurI42ZsE
    public final ZOu84RhGdb62AhIs[] w9sT1Swbhx3hs(eJzD6jrSBjwYspq ejzd6jrsbjwyspq) {
        if (ejzd6jrsbjwyspq.pyu8ovAipBTLYAiKab.get(null) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    @Override // v.s.IAoJ6MjurI42ZsE
    public final /* bridge */ /* synthetic */ void xDyLpEZyrcKVe0(IXBvAqS2fpdIRK iXBvAqS2fpdIRK, boolean z) {
    }
}
