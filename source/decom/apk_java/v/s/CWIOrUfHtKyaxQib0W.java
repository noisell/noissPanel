package v.s;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class CWIOrUfHtKyaxQib0W implements b9xRoaXFR1fmOO2Q, ldRXVAtAYtfEIpl, Serializable {
    public transient b9xRoaXFR1fmOO2Q JXn4Qf7zpnLjP5;
    public final cpTq2XMCb5JSaEhn vekpFI4d1Nc4fakF;
    public final b9xRoaXFR1fmOO2Q w9sT1Swbhx3hs;

    public CWIOrUfHtKyaxQib0W(b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q) {
        cpTq2XMCb5JSaEhn cptq2xmcb5jsaehnXDyLpEZyrcKVe0 = b9xroaxfr1fmoo2q != null ? b9xroaxfr1fmoo2q.xDyLpEZyrcKVe0() : null;
        this.w9sT1Swbhx3hs = b9xroaxfr1fmoo2q;
        this.vekpFI4d1Nc4fakF = cptq2xmcb5jsaehnXDyLpEZyrcKVe0;
    }

    private static /* synthetic */ void jqvvyualz() {
    }

    @Override // v.s.ldRXVAtAYtfEIpl
    public final ldRXVAtAYtfEIpl Ee8d2j4S9Vm5yGuR() {
        b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q = this.w9sT1Swbhx3hs;
        if (b9xroaxfr1fmoo2q instanceof ldRXVAtAYtfEIpl) {
            return (ldRXVAtAYtfEIpl) b9xroaxfr1fmoo2q;
        }
        return null;
    }

    public b9xRoaXFR1fmOO2Q dDIMxZXP1V8HdM(Object obj, b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override // v.s.b9xRoaXFR1fmOO2Q
    public final void ibVTtJUNfrGYbW(Object obj) {
        b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q = this;
        while (true) {
            CWIOrUfHtKyaxQib0W cWIOrUfHtKyaxQib0W = (CWIOrUfHtKyaxQib0W) b9xroaxfr1fmoo2q;
            b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q2 = cWIOrUfHtKyaxQib0W.w9sT1Swbhx3hs;
            try {
                obj = cWIOrUfHtKyaxQib0W.vekpFI4d1Nc4fakF(obj);
                if (obj == pjN1L01KDMWnPCy0daD.w9sT1Swbhx3hs) {
                    return;
                }
            } catch (Throwable th) {
                obj = new VSZeS5mia3yEXbAe(th);
            }
            b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q3 = cWIOrUfHtKyaxQib0W.JXn4Qf7zpnLjP5;
            if (b9xroaxfr1fmoo2q3 != null && b9xroaxfr1fmoo2q3 != cWIOrUfHtKyaxQib0W) {
                ((XsD7TIOExRJcOn4m) cWIOrUfHtKyaxQib0W.vekpFI4d1Nc4fakF.D5P1xCAyuvgF(W6dfON4KdcdxlH.vekpFI4d1Nc4fakF)).getClass();
                V9IxQnfNrXampq7vuj6 v9IxQnfNrXampq7vuj6 = (V9IxQnfNrXampq7vuj6) b9xroaxfr1fmoo2q3;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = V9IxQnfNrXampq7vuj6.pyu8ovAipBTLYAiKab;
                while (atomicReferenceFieldUpdater.get(v9IxQnfNrXampq7vuj6) == y6jRGLEWNMir.w9sT1Swbhx3hs) {
                }
                Object obj2 = atomicReferenceFieldUpdater.get(v9IxQnfNrXampq7vuj6);
                hD886kxBkce8U hd886kxbkce8u = obj2 instanceof hD886kxBkce8U ? (hD886kxBkce8U) obj2 : null;
                if (hd886kxbkce8u != null) {
                    hd886kxbkce8u.Qrz92kRPw4GcghAc();
                }
            }
            cWIOrUfHtKyaxQib0W.JXn4Qf7zpnLjP5 = O7XKRXL5mVXO4X.w9sT1Swbhx3hs;
            if (!(b9xroaxfr1fmoo2q2 instanceof CWIOrUfHtKyaxQib0W)) {
                b9xroaxfr1fmoo2q2.ibVTtJUNfrGYbW(obj);
                return;
            }
            b9xroaxfr1fmoo2q = b9xroaxfr1fmoo2q2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    public String toString() {
        int iIntValue;
        String strC;
        StringBuilder sb = new StringBuilder("Continuation at ");
        OKJgxbYpiTv0E6qyjOOS oKJgxbYpiTv0E6qyjOOS = (OKJgxbYpiTv0E6qyjOOS) getClass().getAnnotation(OKJgxbYpiTv0E6qyjOOS.class);
        Object name = null;
        str = null;
        str = null;
        str = null;
        String str = null;
        if (oKJgxbYpiTv0E6qyjOOS != null) {
            int iV = oKJgxbYpiTv0E6qyjOOS.v();
            ?? r4 = 44 - 43;
            if (iV > r4) {
                throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iV + ". Please update the Kotlin standard library.").toString());
            }
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(r4);
                Object obj = declaredField.get(this);
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                iIntValue = (num != null ? num.intValue() : 0) - r4;
            } catch (Exception unused) {
                iIntValue = -1;
            }
            int i = iIntValue >= 0 ? oKJgxbYpiTv0E6qyjOOS.l()[iIntValue] : -1;
            Skepx2yfpiHXKq skepx2yfpiHXKq = FZ1sl4mHq4J0hOEYC.vekpFI4d1Nc4fakF;
            Skepx2yfpiHXKq skepx2yfpiHXKq2 = FZ1sl4mHq4J0hOEYC.JXn4Qf7zpnLjP5;
            if (skepx2yfpiHXKq2 == null) {
                try {
                    Skepx2yfpiHXKq skepx2yfpiHXKq3 = new Skepx2yfpiHXKq(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                    FZ1sl4mHq4J0hOEYC.JXn4Qf7zpnLjP5 = skepx2yfpiHXKq3;
                    skepx2yfpiHXKq2 = skepx2yfpiHXKq3;
                } catch (Exception unused2) {
                    FZ1sl4mHq4J0hOEYC.JXn4Qf7zpnLjP5 = skepx2yfpiHXKq;
                    skepx2yfpiHXKq2 = skepx2yfpiHXKq;
                }
            }
            if (skepx2yfpiHXKq2 != skepx2yfpiHXKq) {
                Method method = skepx2yfpiHXKq2.dDIMxZXP1V8HdM;
                Object objInvoke = method != null ? method.invoke(getClass(), null) : null;
                if (objInvoke != null) {
                    Method method2 = skepx2yfpiHXKq2.w9sT1Swbhx3hs;
                    Object objInvoke2 = method2 != null ? method2.invoke(objInvoke, null) : null;
                    if (objInvoke2 != null) {
                        Method method3 = skepx2yfpiHXKq2.vekpFI4d1Nc4fakF;
                        Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
                        if (objInvoke3 instanceof String) {
                            str = (String) objInvoke3;
                        }
                    }
                }
            }
            if (str == null) {
                strC = oKJgxbYpiTv0E6qyjOOS.c();
            } else {
                strC = str + '/' + oKJgxbYpiTv0E6qyjOOS.c();
            }
            name = new StackTraceElement(strC, oKJgxbYpiTv0E6qyjOOS.m(), oKJgxbYpiTv0E6qyjOOS.f(), i);
        }
        if (name == null) {
            name = getClass().getName();
        }
        sb.append(name);
        return sb.toString();
    }

    public abstract Object vekpFI4d1Nc4fakF(Object obj);

    @Override // v.s.b9xRoaXFR1fmOO2Q
    public final cpTq2XMCb5JSaEhn xDyLpEZyrcKVe0() {
        return this.vekpFI4d1Nc4fakF;
    }
}
