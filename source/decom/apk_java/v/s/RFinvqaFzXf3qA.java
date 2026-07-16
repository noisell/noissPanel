package v.s;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class RFinvqaFzXf3qA extends oxDJvY4rcWCrlE {
    public final HashMap xDyLpEZyrcKVe0 = new HashMap();

    @Override // v.s.oxDJvY4rcWCrlE
    public final S4NwUM5fV12C6gDO dDIMxZXP1V8HdM(Object obj) {
        return (S4NwUM5fV12C6gDO) this.xDyLpEZyrcKVe0.get(obj);
    }

    @Override // v.s.oxDJvY4rcWCrlE
    public final Object w9sT1Swbhx3hs(Object obj) {
        Object objW9sT1Swbhx3hs = super.w9sT1Swbhx3hs(obj);
        this.xDyLpEZyrcKVe0.remove(obj);
        return objW9sT1Swbhx3hs;
    }
}
