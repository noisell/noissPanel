package v.s;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class u9IBFWnIoP0MgX8BmWO {
    public static Qn6Oecz8en5Uu D5P1xCAyuvgF(View view) {
        kCmqVepHqBoku zNdUlKcvQZwD35Rg;
        if (fQOfBsK7VV3bRf87vLVf.JXn4Qf7zpnLjP5 && view.isAttachedToWindow()) {
            try {
                Object obj = fQOfBsK7VV3bRf87vLVf.dDIMxZXP1V8HdM.get(view.getRootView());
                if (obj != null) {
                    Rect rect = (Rect) fQOfBsK7VV3bRf87vLVf.w9sT1Swbhx3hs.get(obj);
                    Rect rect2 = (Rect) fQOfBsK7VV3bRf87vLVf.vekpFI4d1Nc4fakF.get(obj);
                    if (rect != null && rect2 != null) {
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 30) {
                            zNdUlKcvQZwD35Rg = new OLcvPL8G4MBVNrYgcP();
                        } else {
                            zNdUlKcvQZwD35Rg = i >= 29 ? new ZNdUlKcvQZwD35Rg() : new qtjTltQevMG2p3M4L3X();
                        }
                        zNdUlKcvQZwD35Rg.vekpFI4d1Nc4fakF(cW9NuMIelqMpa.dDIMxZXP1V8HdM(rect.left, rect.top, rect.right, rect.bottom));
                        zNdUlKcvQZwD35Rg.JXn4Qf7zpnLjP5(cW9NuMIelqMpa.dDIMxZXP1V8HdM(rect2.left, rect2.top, rect2.right, rect2.bottom));
                        Qn6Oecz8en5Uu qn6Oecz8en5UuW9sT1Swbhx3hs = zNdUlKcvQZwD35Rg.w9sT1Swbhx3hs();
                        qn6Oecz8en5UuW9sT1Swbhx3hs.dDIMxZXP1V8HdM.hjneShqpF9Tis4(qn6Oecz8en5UuW9sT1Swbhx3hs);
                        qn6Oecz8en5UuW9sT1Swbhx3hs.dDIMxZXP1V8HdM.JXn4Qf7zpnLjP5(view.getRootView());
                        return qn6Oecz8en5UuW9sT1Swbhx3hs;
                    }
                }
            } catch (IllegalAccessException e) {
                e.getMessage();
            }
        }
        return null;
    }

    public static void DVTNwpDEVsUKuznof(View view, E3ID92BLpALTum9 e3ID92BLpALTum9) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(2131099743, e3ID92BLpALTum9);
        }
        if (e3ID92BLpALTum9 == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(2131099751));
        } else {
            view.setOnApplyWindowInsetsListener(new cGTj1ryKTvs5D7Sb(view, e3ID92BLpALTum9));
        }
    }

    public static boolean EWUjsTERgdPbSw3NNlN(View view, int i) {
        return view.startNestedScroll(i);
    }

    public static boolean Ee8d2j4S9Vm5yGuR(View view, int i, int i2, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    public static void H9XlUr4OeMJFiXK(View view, boolean z) {
        view.setNestedScrollingEnabled(z);
    }

    public static void J0zjQ7CAgohuxU20eCW6(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static boolean JXn4Qf7zpnLjP5(View view, float f, float f2) {
        return view.dispatchNestedPreFling(f, f2);
    }

    public static void K7eEOBPYP9VIoHWTe(View view, float f) {
        view.setTranslationZ(f);
    }

    public static void MLSIo1htfMPWeB8V876L(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static boolean Qrz92kRPw4GcghAc(View view) {
        return view.isImportantForAccessibility();
    }

    public static void XiR1pIn5878vVWd(View view, float f) {
        view.setElevation(f);
    }

    public static PorterDuff.Mode b1EoSIRjJHO5(View view) {
        return view.getBackgroundTintMode();
    }

    public static void dDIMxZXP1V8HdM(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(2131099751);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static void dTS0S7eC32ubQH54j36(View view, float f) {
        view.setZ(f);
    }

    public static float gIIiyi2ddlMDR0(View view) {
        return view.getZ();
    }

    public static float gmNWMfvn6zlEj(View view) {
        return view.getTranslationZ();
    }

    public static String hjneShqpF9Tis4(View view) {
        return view.getTransitionName();
    }

    public static ColorStateList ibVTtJUNfrGYbW(View view) {
        return view.getBackgroundTintList();
    }

    public static void l1V0lQr6TbwNKqHfXNbb(View view, String str) {
        view.setTransitionName(str);
    }

    private static /* synthetic */ void leah() {
    }

    public static boolean nQilHWaqS401ZtR(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static float pyu8ovAipBTLYAiKab(View view) {
        return view.getElevation();
    }

    public static boolean vekpFI4d1Nc4fakF(View view, float f, float f2, boolean z) {
        return view.dispatchNestedFling(f, f2, z);
    }

    public static Qn6Oecz8en5Uu w9sT1Swbhx3hs(View view, Qn6Oecz8en5Uu qn6Oecz8en5Uu, Rect rect) {
        dvuzqcnBXF3OIH dvuzqcnbxf3oih = qn6Oecz8en5Uu.dDIMxZXP1V8HdM;
        WindowInsets windowInsets = dvuzqcnbxf3oih instanceof DCB8nyKgYUfVe3Gvkcd ? ((DCB8nyKgYUfVe3Gvkcd) dvuzqcnbxf3oih).vekpFI4d1Nc4fakF : null;
        if (windowInsets != null) {
            return Qn6Oecz8en5Uu.dDIMxZXP1V8HdM(view.computeSystemWindowInsets(windowInsets, rect), view);
        }
        rect.setEmpty();
        return qn6Oecz8en5Uu;
    }

    public static boolean wotphlvK9sPbXJ(View view) {
        return view.hasNestedScrollingParent();
    }

    public static boolean xDyLpEZyrcKVe0(View view, int i, int i2, int i3, int i4, int[] iArr) {
        return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    public static void yTljMGnIibTRdOpSh4(View view) {
        view.stopNestedScroll();
    }
}
