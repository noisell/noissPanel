package v.s;

import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class oAbr1ycaDgFnfg {
    public static final SparseArray dDIMxZXP1V8HdM = new SparseArray();
    public static final HashMap w9sT1Swbhx3hs;

    static {
        HashMap map = new HashMap();
        w9sT1Swbhx3hs = map;
        map.put(LB7U1qakabytBm.w9sT1Swbhx3hs, 0);
        map.put(LB7U1qakabytBm.vekpFI4d1Nc4fakF, 1);
        map.put(LB7U1qakabytBm.JXn4Qf7zpnLjP5, 2);
        for (LB7U1qakabytBm lB7U1qakabytBm : map.keySet()) {
            dDIMxZXP1V8HdM.append(((Integer) w9sT1Swbhx3hs.get(lB7U1qakabytBm)).intValue(), lB7U1qakabytBm);
        }
    }

    public static int dDIMxZXP1V8HdM(LB7U1qakabytBm lB7U1qakabytBm) {
        Integer num = (Integer) w9sT1Swbhx3hs.get(lB7U1qakabytBm);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + lB7U1qakabytBm);
    }

    private static /* synthetic */ void qjkrpzilas() {
    }

    public static LB7U1qakabytBm w9sT1Swbhx3hs(int i) {
        LB7U1qakabytBm lB7U1qakabytBm = (LB7U1qakabytBm) dDIMxZXP1V8HdM.get(i);
        if (lB7U1qakabytBm != null) {
            return lB7U1qakabytBm;
        }
        throw new IllegalArgumentException(Y9mRyRdkl5FOcwb66V6.xDyLpEZyrcKVe0("Unknown Priority for value ", i));
    }
}
