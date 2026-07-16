package v.s;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class ERLOVgHI5kyglIQbb implements Runnable {
    public final /* synthetic */ Object D5P1xCAyuvgF;
    public final /* synthetic */ ArrayList Ee8d2j4S9Vm5yGuR;
    public final /* synthetic */ Bf7HAFpIKfIPl2 JXn4Qf7zpnLjP5;
    public final /* synthetic */ boolean b1EoSIRjJHO5;
    public final /* synthetic */ Rect hjneShqpF9Tis4;
    public final /* synthetic */ HpS8WYFILXNWmicJ1zE ibVTtJUNfrGYbW;
    public final /* synthetic */ ArrayList pyu8ovAipBTLYAiKab;
    public final /* synthetic */ Object vekpFI4d1Nc4fakF;
    public final /* synthetic */ Sn2d19yOBfyV0rw w9sT1Swbhx3hs;
    public final /* synthetic */ HpS8WYFILXNWmicJ1zE xDyLpEZyrcKVe0;

    public ERLOVgHI5kyglIQbb(wLs7ypyhWiPv wls7ypyhwipv, Sn2d19yOBfyV0rw sn2d19yOBfyV0rw, TransitionSet transitionSet, Bf7HAFpIKfIPl2 bf7HAFpIKfIPl2, ArrayList arrayList, View view, HpS8WYFILXNWmicJ1zE hpS8WYFILXNWmicJ1zE, HpS8WYFILXNWmicJ1zE hpS8WYFILXNWmicJ1zE2, boolean z, ArrayList arrayList2, Transition transition, Rect rect) {
        this.w9sT1Swbhx3hs = sn2d19yOBfyV0rw;
        this.vekpFI4d1Nc4fakF = transitionSet;
        this.JXn4Qf7zpnLjP5 = bf7HAFpIKfIPl2;
        this.Ee8d2j4S9Vm5yGuR = arrayList;
        this.xDyLpEZyrcKVe0 = hpS8WYFILXNWmicJ1zE;
        this.ibVTtJUNfrGYbW = hpS8WYFILXNWmicJ1zE2;
        this.b1EoSIRjJHO5 = z;
        this.pyu8ovAipBTLYAiKab = arrayList2;
        this.D5P1xCAyuvgF = transition;
        this.hjneShqpF9Tis4 = rect;
    }

    private static /* synthetic */ void beeihbqvx() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Sn2d19yOBfyV0rw sn2d19yOBfyV0rw = this.w9sT1Swbhx3hs;
        Object obj = this.vekpFI4d1Nc4fakF;
        Bf7HAFpIKfIPl2 bf7HAFpIKfIPl2 = this.JXn4Qf7zpnLjP5;
        CLhpxpKTpqUQISCXEKY.w9sT1Swbhx3hs(sn2d19yOBfyV0rw, obj, bf7HAFpIKfIPl2);
        if (this.b1EoSIRjJHO5) {
            this.ibVTtJUNfrGYbW.getClass();
        } else {
            this.xDyLpEZyrcKVe0.getClass();
        }
        if (obj != null) {
            TransitionSet transitionSet = (TransitionSet) obj;
            transitionSet.getTargets().clear();
            List<View> targets = transitionSet.getTargets();
            ArrayList arrayList = this.Ee8d2j4S9Vm5yGuR;
            targets.addAll(arrayList);
            wLs7ypyhWiPv.Ee8d2j4S9Vm5yGuR(transitionSet, this.pyu8ovAipBTLYAiKab, arrayList);
            s6GzzATP8xbv7YKDDrkn s6gzzatp8xbv7ykddrkn = bf7HAFpIKfIPl2.vekpFI4d1Nc4fakF;
        }
    }
}
