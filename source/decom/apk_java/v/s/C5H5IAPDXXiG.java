package v.s;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final /* synthetic */ class C5H5IAPDXXiG implements Callable {
    public final /* synthetic */ Object JXn4Qf7zpnLjP5;
    public final /* synthetic */ int dDIMxZXP1V8HdM;
    public final /* synthetic */ Object vekpFI4d1Nc4fakF;
    public final /* synthetic */ Object w9sT1Swbhx3hs;

    public /* synthetic */ C5H5IAPDXXiG(Object obj, Object obj2, Object obj3, int i) {
        this.dDIMxZXP1V8HdM = i;
        this.w9sT1Swbhx3hs = obj;
        this.vekpFI4d1Nc4fakF = obj2;
        this.JXn4Qf7zpnLjP5 = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.dDIMxZXP1V8HdM) {
            case 0:
                return ((CX2cgp0VaeW1h7Cx14) this.w9sT1Swbhx3hs).w9sT1Swbhx3hs.submit(new A68NpXPqwTFos99nt((Callable) this.vekpFI4d1Nc4fakF, 7, (r5XEUfod5GSCCwq6c) this.JXn4Qf7zpnLjP5));
            default:
                DP5sXJhndWh8c4VkCzdA dP5sXJhndWh8c4VkCzdA = (DP5sXJhndWh8c4VkCzdA) this.w9sT1Swbhx3hs;
                ArrayList arrayList = (ArrayList) this.vekpFI4d1Nc4fakF;
                String str = (String) this.JXn4Qf7zpnLjP5;
                WorkDatabase workDatabase = dP5sXJhndWh8c4VkCzdA.Ee8d2j4S9Vm5yGuR;
                arrayList.addAll(workDatabase.H9XlUr4OeMJFiXK().w9sT1Swbhx3hs(str));
                return workDatabase.XiR1pIn5878vVWd().gmNWMfvn6zlEj(str);
        }
    }
}
