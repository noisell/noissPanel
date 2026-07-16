package androidx.lifecycle;

import v.s.Jf9nGec8iqajtj;
import v.s.OGI3jG3mkhPSTcSz;
import v.s.Xdb7JFhCToIIjDFJDI;
import v.s.jKoJvqOPSXt3Jpz6eED;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class SavedStateHandleAttacher implements OGI3jG3mkhPSTcSz {
    public final jKoJvqOPSXt3Jpz6eED w9sT1Swbhx3hs;

    public SavedStateHandleAttacher(jKoJvqOPSXt3Jpz6eED jkojvqopsxt3jpz6eed) {
        this.w9sT1Swbhx3hs = jkojvqopsxt3jpz6eed;
    }

    private static /* synthetic */ void gzie() {
    }

    @Override // v.s.OGI3jG3mkhPSTcSz
    public final void dDIMxZXP1V8HdM(Xdb7JFhCToIIjDFJDI xdb7JFhCToIIjDFJDI, Jf9nGec8iqajtj jf9nGec8iqajtj) {
        if (jf9nGec8iqajtj != Jf9nGec8iqajtj.ON_CREATE) {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + jf9nGec8iqajtj).toString());
        }
        xdb7JFhCToIIjDFJDI.w9sT1Swbhx3hs().xDyLpEZyrcKVe0(this);
        jKoJvqOPSXt3Jpz6eED jkojvqopsxt3jpz6eed = this.w9sT1Swbhx3hs;
        if (jkojvqopsxt3jpz6eed.w9sT1Swbhx3hs) {
            return;
        }
        jkojvqopsxt3jpz6eed.vekpFI4d1Nc4fakF = jkojvqopsxt3jpz6eed.dDIMxZXP1V8HdM.dDIMxZXP1V8HdM("androidx.lifecycle.internal.SavedStateHandlesProvider");
        jkojvqopsxt3jpz6eed.w9sT1Swbhx3hs = true;
    }
}
