package v.s;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class Yz1USB4jlmvFxN4ddip {
    public static final ArrayList JXn4Qf7zpnLjP5 = new ArrayList();
    public WeakHashMap dDIMxZXP1V8HdM;
    public WeakReference vekpFI4d1Nc4fakF;
    public SparseArray w9sT1Swbhx3hs;

    private static /* synthetic */ void ghfouaqh() {
    }

    public final View dDIMxZXP1V8HdM(View view) {
        int size;
        WeakHashMap weakHashMap = this.dDIMxZXP1V8HdM;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View viewDDIMxZXP1V8HdM = dDIMxZXP1V8HdM(viewGroup.getChildAt(childCount));
                if (viewDDIMxZXP1V8HdM != null) {
                    return viewDDIMxZXP1V8HdM;
                }
            }
        }
        ArrayList arrayList = (ArrayList) view.getTag(2131099750);
        if (arrayList == null || (size = arrayList.size() - 1) < 0) {
            return null;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }
}
