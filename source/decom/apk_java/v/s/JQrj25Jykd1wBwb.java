package v.s;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class JQrj25Jykd1wBwb {
    public static final AtomicIntegerFieldUpdater w9sT1Swbhx3hs = AtomicIntegerFieldUpdater.newUpdater(JQrj25Jykd1wBwb.class, "_handled");
    private volatile int _handled;
    public final Throwable dDIMxZXP1V8HdM;

    public JQrj25Jykd1wBwb(Throwable th, boolean z) {
        this.dDIMxZXP1V8HdM = th;
        this._handled = z ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [char, int] */
    public final String toString() {
        return getClass().getSimpleName() + ((char) (92 - 1)) + this.dDIMxZXP1V8HdM + ']';
    }
}
