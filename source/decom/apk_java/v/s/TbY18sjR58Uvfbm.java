package v.s;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class TbY18sjR58Uvfbm implements aFzDD3O0j1AOZBM7 {
    public final aFzDD3O0j1AOZBM7 dDIMxZXP1V8HdM;
    public final int w9sT1Swbhx3hs;

    public TbY18sjR58Uvfbm(aFzDD3O0j1AOZBM7 afzdd3o0j1aozbm7, int i) {
        this.dDIMxZXP1V8HdM = afzdd3o0j1aozbm7;
        this.w9sT1Swbhx3hs = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // v.s.aFzDD3O0j1AOZBM7
    public final Iterator iterator() {
        return new nQilHWaqS401ZtR(this);
    }
}
