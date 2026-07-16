package v.s;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class R7DJBBZoaraqxH implements aFzDD3O0j1AOZBM7 {
    public final AtomicReference dDIMxZXP1V8HdM;

    public R7DJBBZoaraqxH(oVCheESKQwsy4x ovcheeskqwsy4x) {
        this.dDIMxZXP1V8HdM = new AtomicReference(ovcheeskqwsy4x);
    }

    private static /* synthetic */ void lygqyqki() {
    }

    @Override // v.s.aFzDD3O0j1AOZBM7
    public final Iterator iterator() {
        aFzDD3O0j1AOZBM7 afzdd3o0j1aozbm7 = (aFzDD3O0j1AOZBM7) this.dDIMxZXP1V8HdM.getAndSet(null);
        if (afzdd3o0j1aozbm7 != null) {
            return afzdd3o0j1aozbm7.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
