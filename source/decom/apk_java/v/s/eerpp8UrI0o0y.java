package v.s;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class eerpp8UrI0o0y implements Runnable {
    public final /* synthetic */ ArrayList Ee8d2j4S9Vm5yGuR;
    public final /* synthetic */ HpS8WYFILXNWmicJ1zE JXn4Qf7zpnLjP5;
    public final /* synthetic */ Object b1EoSIRjJHO5;
    public final /* synthetic */ ArrayList ibVTtJUNfrGYbW;
    public final /* synthetic */ View vekpFI4d1Nc4fakF;
    public final /* synthetic */ Object w9sT1Swbhx3hs;
    public final /* synthetic */ ArrayList xDyLpEZyrcKVe0;

    public eerpp8UrI0o0y(Transition transition, wLs7ypyhWiPv wls7ypyhwipv, View view, HpS8WYFILXNWmicJ1zE hpS8WYFILXNWmicJ1zE, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Transition transition2) {
        this.w9sT1Swbhx3hs = transition;
        this.vekpFI4d1Nc4fakF = view;
        this.JXn4Qf7zpnLjP5 = hpS8WYFILXNWmicJ1zE;
        this.Ee8d2j4S9Vm5yGuR = arrayList;
        this.xDyLpEZyrcKVe0 = arrayList2;
        this.ibVTtJUNfrGYbW = arrayList3;
        this.b1EoSIRjJHO5 = transition2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.vekpFI4d1Nc4fakF;
        Object obj = this.w9sT1Swbhx3hs;
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
            this.xDyLpEZyrcKVe0.addAll(CLhpxpKTpqUQISCXEKY.Ee8d2j4S9Vm5yGuR(obj, this.JXn4Qf7zpnLjP5, this.Ee8d2j4S9Vm5yGuR, view));
        }
        ArrayList arrayList = this.ibVTtJUNfrGYbW;
        if (arrayList != null) {
            Object obj2 = this.b1EoSIRjJHO5;
            if (obj2 != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(view);
                wLs7ypyhWiPv.Ee8d2j4S9Vm5yGuR(obj2, arrayList, arrayList2);
            }
            arrayList.clear();
            arrayList.add(view);
        }
    }
}
