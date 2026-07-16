package v.s;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class x2ai6Gfmg8zOa {
    public final Throwable Ee8d2j4S9Vm5yGuR;
    public final Object JXn4Qf7zpnLjP5;
    public final Object dDIMxZXP1V8HdM;
    public final deLJ4Z0aL3hcJ3O1 vekpFI4d1Nc4fakF;
    public final LR2N3RA8S6gSP2jwUGa w9sT1Swbhx3hs;

    public x2ai6Gfmg8zOa(Object obj, LR2N3RA8S6gSP2jwUGa lR2N3RA8S6gSP2jwUGa, deLJ4Z0aL3hcJ3O1 delj4z0al3hcj3o1, Object obj2, Throwable th) {
        this.dDIMxZXP1V8HdM = obj;
        this.w9sT1Swbhx3hs = lR2N3RA8S6gSP2jwUGa;
        this.vekpFI4d1Nc4fakF = delj4z0al3hcj3o1;
        this.JXn4Qf7zpnLjP5 = obj2;
        this.Ee8d2j4S9Vm5yGuR = th;
    }

    public static x2ai6Gfmg8zOa dDIMxZXP1V8HdM(x2ai6Gfmg8zOa x2ai6gfmg8zoa, LR2N3RA8S6gSP2jwUGa lR2N3RA8S6gSP2jwUGa, CancellationException cancellationException, int i) {
        Object obj = x2ai6gfmg8zoa.dDIMxZXP1V8HdM;
        if ((i & 2) != 0) {
            lR2N3RA8S6gSP2jwUGa = x2ai6gfmg8zoa.w9sT1Swbhx3hs;
        }
        LR2N3RA8S6gSP2jwUGa lR2N3RA8S6gSP2jwUGa2 = lR2N3RA8S6gSP2jwUGa;
        deLJ4Z0aL3hcJ3O1 delj4z0al3hcj3o1 = x2ai6gfmg8zoa.vekpFI4d1Nc4fakF;
        Object obj2 = x2ai6gfmg8zoa.JXn4Qf7zpnLjP5;
        Throwable th = cancellationException;
        if ((i & 16) != 0) {
            th = x2ai6gfmg8zoa.Ee8d2j4S9Vm5yGuR;
        }
        return new x2ai6Gfmg8zOa(obj, lR2N3RA8S6gSP2jwUGa2, delj4z0al3hcj3o1, obj2, th);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public final boolean equals(Object obj) {
        ?? r0 = (-88) + 89;
        if (this == obj) {
            return r0;
        }
        if (!(obj instanceof x2ai6Gfmg8zOa)) {
            return false;
        }
        x2ai6Gfmg8zOa x2ai6gfmg8zoa = (x2ai6Gfmg8zOa) obj;
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.dDIMxZXP1V8HdM, x2ai6gfmg8zoa.dDIMxZXP1V8HdM) && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.w9sT1Swbhx3hs, x2ai6gfmg8zoa.w9sT1Swbhx3hs) && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.vekpFI4d1Nc4fakF, x2ai6gfmg8zoa.vekpFI4d1Nc4fakF) && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.JXn4Qf7zpnLjP5, x2ai6gfmg8zoa.JXn4Qf7zpnLjP5) && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.Ee8d2j4S9Vm5yGuR, x2ai6gfmg8zoa.Ee8d2j4S9Vm5yGuR)) {
            return r0;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.dDIMxZXP1V8HdM;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        LR2N3RA8S6gSP2jwUGa lR2N3RA8S6gSP2jwUGa = this.w9sT1Swbhx3hs;
        int iHashCode2 = (iHashCode + (lR2N3RA8S6gSP2jwUGa == null ? 0 : lR2N3RA8S6gSP2jwUGa.hashCode())) * 31;
        deLJ4Z0aL3hcJ3O1 delj4z0al3hcj3o1 = this.vekpFI4d1Nc4fakF;
        int iHashCode3 = (iHashCode2 + (delj4z0al3hcj3o1 == null ? 0 : delj4z0al3hcj3o1.hashCode())) * 31;
        Object obj2 = this.JXn4Qf7zpnLjP5;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.Ee8d2j4S9Vm5yGuR;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.dDIMxZXP1V8HdM + ", cancelHandler=" + this.w9sT1Swbhx3hs + ", onCancellation=" + this.vekpFI4d1Nc4fakF + ", idempotentResume=" + this.JXn4Qf7zpnLjP5 + ", cancelCause=" + this.Ee8d2j4S9Vm5yGuR + ')';
    }

    public /* synthetic */ x2ai6Gfmg8zOa(Object obj, LR2N3RA8S6gSP2jwUGa lR2N3RA8S6gSP2jwUGa, deLJ4Z0aL3hcJ3O1 delj4z0al3hcj3o1, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : lR2N3RA8S6gSP2jwUGa, (i & 4) != 0 ? null : delj4z0al3hcj3o1, (Object) null, (i & 16) != 0 ? null : cancellationException);
    }
}
