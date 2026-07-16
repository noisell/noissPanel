package v.s;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class wLs7ypyhWiPv {
    public static void Ee8d2j4S9Vm5yGuR(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                Ee8d2j4S9Vm5yGuR(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (JXn4Qf7zpnLjP5(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size) {
            transition.addTarget((View) arrayList2.get(i));
            i++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget((View) arrayList.get(size2));
        }
    }

    public static boolean JXn4Qf7zpnLjP5(Transition transition) {
        List<Integer> targetIds = transition.getTargetIds();
        if (targetIds != null && !targetIds.isEmpty()) {
            return true;
        }
        List<String> targetNames = transition.getTargetNames();
        if (targetNames != null && !targetNames.isEmpty()) {
            return true;
        }
        List<Class> targetTypes = transition.getTargetTypes();
        return (targetTypes == null || targetTypes.isEmpty()) ? false : true;
    }

    public static void dDIMxZXP1V8HdM(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                dDIMxZXP1V8HdM(transitionSet.getTransitionAt(i), arrayList);
                i++;
            }
            return;
        }
        if (JXn4Qf7zpnLjP5(transition)) {
            return;
        }
        List<View> targets = transition.getTargets();
        if (targets == null || targets.isEmpty()) {
            int size = arrayList.size();
            while (i < size) {
                transition.addTarget((View) arrayList.get(i));
                i++;
            }
        }
    }

    private static /* synthetic */ void fkicwd() {
    }

    public static void vekpFI4d1Nc4fakF(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        rect.set(i, iArr[1], view.getWidth() + i, view.getHeight() + iArr[1]);
    }

    public static void w9sT1Swbhx3hs(Sn2d19yOBfyV0rw sn2d19yOBfyV0rw, View view) {
        if (view.getVisibility() == 0) {
            int i = tg6EjdKQH74QUty.dDIMxZXP1V8HdM;
            String strHjneShqpF9Tis4 = u9IBFWnIoP0MgX8BmWO.hjneShqpF9Tis4(view);
            if (strHjneShqpF9Tis4 != null) {
                sn2d19yOBfyV0rw.put(strHjneShqpF9Tis4, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    w9sT1Swbhx3hs(sn2d19yOBfyV0rw, viewGroup.getChildAt(i2));
                }
            }
        }
    }
}
