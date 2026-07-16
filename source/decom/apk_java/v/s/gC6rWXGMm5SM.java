package v.s;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class gC6rWXGMm5SM extends U9g2mOxA6v60QExhx {
    public final hD886kxBkce8U xDyLpEZyrcKVe0;

    public gC6rWXGMm5SM(hD886kxBkce8U hd886kxbkce8u) {
        this.xDyLpEZyrcKVe0 = hd886kxbkce8u;
    }

    private static /* synthetic */ void vxhkxck() {
    }

    @Override // v.s.deLJ4Z0aL3hcJ3O1
    public final /* bridge */ /* synthetic */ Object pyu8ovAipBTLYAiKab(Object obj) {
        wotphlvK9sPbXJ((Throwable) obj);
        return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
    }

    @Override // v.s.kQNfMPvAFgenoBAn
    public final void wotphlvK9sPbXJ(Throwable th) {
        LPqJFMbrw2n1o lPqJFMbrw2n1o = this.Ee8d2j4S9Vm5yGuR;
        if (lPqJFMbrw2n1o == null) {
            lPqJFMbrw2n1o = null;
        }
        CancellationException cancellationExceptionYTljMGnIibTRdOpSh4 = lPqJFMbrw2n1o.yTljMGnIibTRdOpSh4();
        hD886kxBkce8U hd886kxbkce8u = this.xDyLpEZyrcKVe0;
        if (hd886kxbkce8u.l1V0lQr6TbwNKqHfXNbb()) {
            V9IxQnfNrXampq7vuj6 v9IxQnfNrXampq7vuj6 = (V9IxQnfNrXampq7vuj6) hd886kxbkce8u.Ee8d2j4S9Vm5yGuR;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = V9IxQnfNrXampq7vuj6.pyu8ovAipBTLYAiKab;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(v9IxQnfNrXampq7vuj6);
                o0rN3ekjBJ6kKwok o0rn3ekjbj6kkwok = y6jRGLEWNMir.w9sT1Swbhx3hs;
                if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(obj, o0rn3ekjbj6kkwok)) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(v9IxQnfNrXampq7vuj6, o0rn3ekjbj6kkwok, cancellationExceptionYTljMGnIibTRdOpSh4)) {
                        if (atomicReferenceFieldUpdater.get(v9IxQnfNrXampq7vuj6) != o0rn3ekjbj6kkwok) {
                        }
                    }
                    return;
                } else {
                    if (obj instanceof Throwable) {
                        return;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(v9IxQnfNrXampq7vuj6, obj, null)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(v9IxQnfNrXampq7vuj6) == obj);
                }
            }
        }
        hd886kxbkce8u.wotphlvK9sPbXJ(cancellationExceptionYTljMGnIibTRdOpSh4);
        if (hd886kxbkce8u.l1V0lQr6TbwNKqHfXNbb()) {
            return;
        }
        hd886kxbkce8u.Qrz92kRPw4GcghAc();
    }
}
