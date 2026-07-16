package v.s;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class LR2N3RA8S6gSP2jwUGa implements E9az9PfAcrslNncVQ, deLJ4Z0aL3hcJ3O1 {
    public final Object vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs;

    public /* synthetic */ LR2N3RA8S6gSP2jwUGa(int i, Object obj) {
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = obj;
    }

    public final void dDIMxZXP1V8HdM(Throwable th) {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                if (th != null) {
                    ((ScheduledFuture) this.vekpFI4d1Nc4fakF).cancel(false);
                }
                break;
            case 1:
                ((CSRsULpNTLZDl) this.vekpFI4d1Nc4fakF).vekpFI4d1Nc4fakF();
                break;
            default:
                ((deLJ4Z0aL3hcJ3O1) this.vekpFI4d1Nc4fakF).pyu8ovAipBTLYAiKab(th);
                break;
        }
    }

    @Override // v.s.deLJ4Z0aL3hcJ3O1
    public final /* bridge */ /* synthetic */ Object pyu8ovAipBTLYAiKab(Object obj) {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                dDIMxZXP1V8HdM((Throwable) obj);
                break;
            case 1:
                dDIMxZXP1V8HdM((Throwable) obj);
                break;
            default:
                dDIMxZXP1V8HdM((Throwable) obj);
                break;
        }
        return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
    }

    public final String toString() {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.vekpFI4d1Nc4fakF) + ']';
            case 1:
                return "DisposeOnCancel[" + ((CSRsULpNTLZDl) this.vekpFI4d1Nc4fakF) + ']';
            default:
                return "InvokeOnCancel[" + ((deLJ4Z0aL3hcJ3O1) this.vekpFI4d1Nc4fakF).getClass().getSimpleName() + '@' + gA5gCwTK0qjTIn.pyu8ovAipBTLYAiKab(this) + ']';
        }
    }
}
