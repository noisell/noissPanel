package v.s;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class DCB8nyKgYUfVe3Gvkcd extends dvuzqcnBXF3OIH {
    public static Field D5P1xCAyuvgF;
    public static Class b1EoSIRjJHO5;
    public static Method ibVTtJUNfrGYbW;
    public static Field pyu8ovAipBTLYAiKab;
    public static boolean xDyLpEZyrcKVe0;
    public cW9NuMIelqMpa Ee8d2j4S9Vm5yGuR;
    public cW9NuMIelqMpa JXn4Qf7zpnLjP5;
    public final WindowInsets vekpFI4d1Nc4fakF;

    public DCB8nyKgYUfVe3Gvkcd(Qn6Oecz8en5Uu qn6Oecz8en5Uu, WindowInsets windowInsets) {
        super(qn6Oecz8en5Uu);
        this.JXn4Qf7zpnLjP5 = null;
        this.vekpFI4d1Nc4fakF = windowInsets;
    }

    private cW9NuMIelqMpa gIIiyi2ddlMDR0(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!xDyLpEZyrcKVe0) {
            wotphlvK9sPbXJ();
        }
        Method method = ibVTtJUNfrGYbW;
        if (method != null && b1EoSIRjJHO5 != null && pyu8ovAipBTLYAiKab != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke != null) {
                    Rect rect = (Rect) pyu8ovAipBTLYAiKab.get(D5P1xCAyuvgF.get(objInvoke));
                    if (rect != null) {
                        return cW9NuMIelqMpa.dDIMxZXP1V8HdM(rect.left, rect.top, rect.right, rect.bottom);
                    }
                }
            } catch (ReflectiveOperationException e) {
                e.getMessage();
            }
        }
        return null;
    }

    private static /* synthetic */ void vybwgkraen() {
    }

    @SuppressLint({"PrivateApi"})
    private static void wotphlvK9sPbXJ() {
        try {
            ibVTtJUNfrGYbW = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            b1EoSIRjJHO5 = cls;
            pyu8ovAipBTLYAiKab = cls.getDeclaredField("mVisibleInsets");
            D5P1xCAyuvgF = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            pyu8ovAipBTLYAiKab.setAccessible(true);
            D5P1xCAyuvgF.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            e.getMessage();
        }
        xDyLpEZyrcKVe0 = true;
    }

    @Override // v.s.dvuzqcnBXF3OIH
    public void D5P1xCAyuvgF(cW9NuMIelqMpa[] cw9numielqmpaArr) {
    }

    @Override // v.s.dvuzqcnBXF3OIH
    public void JXn4Qf7zpnLjP5(View view) {
        cW9NuMIelqMpa cw9numielqmpaGIIiyi2ddlMDR0 = gIIiyi2ddlMDR0(view);
        if (cw9numielqmpaGIIiyi2ddlMDR0 == null) {
            cw9numielqmpaGIIiyi2ddlMDR0 = cW9NuMIelqMpa.Ee8d2j4S9Vm5yGuR;
        }
        Qrz92kRPw4GcghAc(cw9numielqmpaGIIiyi2ddlMDR0);
    }

    public void Qrz92kRPw4GcghAc(cW9NuMIelqMpa cw9numielqmpa) {
        this.Ee8d2j4S9Vm5yGuR = cw9numielqmpa;
    }

    @Override // v.s.dvuzqcnBXF3OIH
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.Ee8d2j4S9Vm5yGuR, ((DCB8nyKgYUfVe3Gvkcd) obj).Ee8d2j4S9Vm5yGuR);
        }
        return false;
    }

    @Override // v.s.dvuzqcnBXF3OIH
    public void hjneShqpF9Tis4(Qn6Oecz8en5Uu qn6Oecz8en5Uu) {
    }

    @Override // v.s.dvuzqcnBXF3OIH
    public final cW9NuMIelqMpa ibVTtJUNfrGYbW() {
        if (this.JXn4Qf7zpnLjP5 == null) {
            WindowInsets windowInsets = this.vekpFI4d1Nc4fakF;
            this.JXn4Qf7zpnLjP5 = cW9NuMIelqMpa.dDIMxZXP1V8HdM(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.JXn4Qf7zpnLjP5;
    }

    @Override // v.s.dvuzqcnBXF3OIH
    public boolean pyu8ovAipBTLYAiKab() {
        return this.vekpFI4d1Nc4fakF.isRound();
    }
}
