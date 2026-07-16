package v.s;

import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class c3ktnmRelrusjqF5BDPM {
    public static void Ee8d2j4S9Vm5yGuR(ViewParent viewParent, View view, View view2, int i) {
        viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
    }

    public static boolean JXn4Qf7zpnLjP5(View view) {
        return view.isLayoutDirectionResolved();
    }

    public static int dDIMxZXP1V8HdM(View view) {
        return view.getAccessibilityLiveRegion();
    }

    public static void ibVTtJUNfrGYbW(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentChangeTypes(i);
    }

    private static /* synthetic */ void mrhsu() {
    }

    public static boolean vekpFI4d1Nc4fakF(View view) {
        return view.isLaidOut();
    }

    public static boolean w9sT1Swbhx3hs(View view) {
        return view.isAttachedToWindow();
    }

    public static void xDyLpEZyrcKVe0(View view, int i) {
        view.setAccessibilityLiveRegion(i);
    }
}
