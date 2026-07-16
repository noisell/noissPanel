package v.s;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class livmVtKj7J2GcsEi4FE extends JQrj25Jykd1wBwb {
    public static final AtomicIntegerFieldUpdater vekpFI4d1Nc4fakF = AtomicIntegerFieldUpdater.newUpdater(livmVtKj7J2GcsEi4FE.class, "_resumed");
    private volatile int _resumed;

    public livmVtKj7J2GcsEi4FE(hD886kxBkce8U hd886kxbkce8u, Throwable th, boolean z) {
        if (th == null) {
            th = new CancellationException("Continuation " + hd886kxbkce8u + " was cancelled normally");
        }
        super(th, z);
        this._resumed = 0;
    }

    private static /* synthetic */ void sble() {
    }
}
