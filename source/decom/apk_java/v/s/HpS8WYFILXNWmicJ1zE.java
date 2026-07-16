package v.s;

import android.animation.Animator;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class HpS8WYFILXNWmicJ1zE implements ComponentCallbacks, View.OnCreateContextMenuListener, Xdb7JFhCToIIjDFJDI, fvBWJ8YGASft {
    public static final O162WzpEtUgucWBV euF5Udt5Rqv3Qmea = new O162WzpEtUgucWBV();
    public static final Object qfTrc75xwRVMl85vh = new Object();
    public boolean D5P1xCAyuvgF;
    public Xu6l0U3w5XcZ8Nkn DVTNwpDEVsUKuznof;
    public String EWUjsTERgdPbSw3NNlN;
    public String Ee8d2j4S9Vm5yGuR;
    public GE98OsRNceCmGYz2z H9XlUr4OeMJFiXK;
    public y376IWm9dQvh0JucoHX J0zjQ7CAgohuxU20eCW6;
    public int K7eEOBPYP9VIoHWTe;
    public P3NzOtJRLIgJpXupQRO6 MLSIo1htfMPWeB8V876L;
    public boolean O2DHNSIGZlgPja7eqLgn;
    public boolean Qrz92kRPw4GcghAc;
    public y376IWm9dQvh0JucoHX XiR1pIn5878vVWd;
    public boolean XuO9PPFo607ssKwZjNW;
    public int dTS0S7eC32ubQH54j36;
    public boolean fivkjwgu2UdAtiY;
    public boolean gIIiyi2ddlMDR0;
    public boolean gmNWMfvn6zlEj;
    public boolean hV4VTKNUdeHN;
    public boolean hjneShqpF9Tis4;
    public sQnYZADWHPzbB iUQk66nAiXgO35;
    public HpS8WYFILXNWmicJ1zE ibVTtJUNfrGYbW;
    public HpS8WYFILXNWmicJ1zE l1V0lQr6TbwNKqHfXNbb;
    public int nQilHWaqS401ZtR;
    public int pyu8ovAipBTLYAiKab;
    public boolean rCHnHJBAlOpNI5;
    public ViewGroup tne6mXOUFKdd;
    public boolean vIJudZvPyTuNp;
    public SparseArray vekpFI4d1Nc4fakF;
    public Bundle w9sT1Swbhx3hs;
    public boolean wotphlvK9sPbXJ;
    public Bundle xDyLpEZyrcKVe0;
    public boolean xfn2GJwmGqs7kWW;
    public boolean yTljMGnIibTRdOpSh4;
    public int dDIMxZXP1V8HdM = 0;
    public int JXn4Qf7zpnLjP5 = -1;
    public int b1EoSIRjJHO5 = -1;
    public boolean ECwLkmPW1UKz7J6E = true;
    public final p9Dc9HHikKZdWDIj k84rwRrqzhrNQ1CdNQ9 = new p9Dc9HHikKZdWDIj(this);
    public final XQCWJqAefViH A1BaTVAMeIXMnh = new XQCWJqAefViH();

    public static HpS8WYFILXNWmicJ1zE Ee8d2j4S9Vm5yGuR(Context context, String str, Bundle bundle) {
        try {
            O162WzpEtUgucWBV o162WzpEtUgucWBV = euF5Udt5Rqv3Qmea;
            Class<?> clsLoadClass = (Class) o162WzpEtUgucWBV.get(str);
            if (clsLoadClass == null) {
                clsLoadClass = context.getClassLoader().loadClass(str);
                o162WzpEtUgucWBV.put(str, clsLoadClass);
            }
            HpS8WYFILXNWmicJ1zE hpS8WYFILXNWmicJ1zE = (HpS8WYFILXNWmicJ1zE) clsLoadClass.getConstructor(null).newInstance(null);
            if (bundle != null) {
                bundle.setClassLoader(hpS8WYFILXNWmicJ1zE.getClass().getClassLoader());
                hpS8WYFILXNWmicJ1zE.l1V0lQr6TbwNKqHfXNbb(bundle);
            }
            return hpS8WYFILXNWmicJ1zE;
        } catch (ClassNotFoundException e) {
            throw new Sb7Xj3N9U1DQ("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (IllegalAccessException e2) {
            throw new Sb7Xj3N9U1DQ("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (InstantiationException e3) {
            throw new Sb7Xj3N9U1DQ("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new Sb7Xj3N9U1DQ("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new Sb7Xj3N9U1DQ("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e5);
        }
    }

    public abstract void D5P1xCAyuvgF(Bundle bundle);

    public final void DVTNwpDEVsUKuznof(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        if (this.XiR1pIn5878vVWd == null) {
            xDyLpEZyrcKVe0();
        }
        this.XiR1pIn5878vVWd.uV1d27nePzvpefeE(parcelable, this.H9XlUr4OeMJFiXK);
        this.H9XlUr4OeMJFiXK = null;
        y376IWm9dQvh0JucoHX y376iwm9dqvh0jucohx = this.XiR1pIn5878vVWd;
        y376iwm9dqvh0jucohx.EWUjsTERgdPbSw3NNlN = false;
        y376iwm9dqvh0jucohx.yTljMGnIibTRdOpSh4 = false;
        y376iwm9dqvh0jucohx.n8nqApvKDYz7s8llJ2jf(74 - 73);
    }

    public final void H9XlUr4OeMJFiXK() {
        y376IWm9dQvh0JucoHX y376iwm9dqvh0jucohx = this.XiR1pIn5878vVWd;
        if (y376iwm9dqvh0jucohx != null) {
            ArrayList arrayList = y376iwm9dqvh0jucohx.gIIiyi2ddlMDR0;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                HpS8WYFILXNWmicJ1zE hpS8WYFILXNWmicJ1zE = (HpS8WYFILXNWmicJ1zE) arrayList.get(size);
                if (hpS8WYFILXNWmicJ1zE != null) {
                    hpS8WYFILXNWmicJ1zE.H9XlUr4OeMJFiXK();
                }
            }
        }
    }

    public final void J0zjQ7CAgohuxU20eCW6() {
        this.xfn2GJwmGqs7kWW = true;
        y376IWm9dQvh0JucoHX y376iwm9dqvh0jucohx = this.XiR1pIn5878vVWd;
        if (y376iwm9dqvh0jucohx != null) {
            ArrayList arrayList = y376iwm9dqvh0jucohx.gIIiyi2ddlMDR0;
            for (int i = 0; i < arrayList.size(); i++) {
                HpS8WYFILXNWmicJ1zE hpS8WYFILXNWmicJ1zE = (HpS8WYFILXNWmicJ1zE) arrayList.get(i);
                if (hpS8WYFILXNWmicJ1zE != null) {
                    hpS8WYFILXNWmicJ1zE.J0zjQ7CAgohuxU20eCW6();
                }
            }
        }
    }

    public final Animator JXn4Qf7zpnLjP5() {
        sQnYZADWHPzbB sqnyzadwhpzbb = this.iUQk66nAiXgO35;
        if (sqnyzadwhpzbb == null) {
            return null;
        }
        return sqnyzadwhpzbb.dDIMxZXP1V8HdM;
    }

    public final void K7eEOBPYP9VIoHWTe(int i, HpS8WYFILXNWmicJ1zE hpS8WYFILXNWmicJ1zE) {
        this.JXn4Qf7zpnLjP5 = i;
        if (hpS8WYFILXNWmicJ1zE == null) {
            this.Ee8d2j4S9Vm5yGuR = "android:fragment:" + this.JXn4Qf7zpnLjP5;
        } else {
            this.Ee8d2j4S9Vm5yGuR = hpS8WYFILXNWmicJ1zE.Ee8d2j4S9Vm5yGuR + ":" + this.JXn4Qf7zpnLjP5;
        }
    }

    public final void MLSIo1htfMPWeB8V876L() {
        this.xfn2GJwmGqs7kWW = true;
        y376IWm9dQvh0JucoHX y376iwm9dqvh0jucohx = this.XiR1pIn5878vVWd;
        if (y376iwm9dqvh0jucohx != null) {
            ArrayList arrayList = y376iwm9dqvh0jucohx.gIIiyi2ddlMDR0;
            for (int i = 0; i < arrayList.size(); i++) {
                HpS8WYFILXNWmicJ1zE hpS8WYFILXNWmicJ1zE = (HpS8WYFILXNWmicJ1zE) arrayList.get(i);
                if (hpS8WYFILXNWmicJ1zE != null) {
                    hpS8WYFILXNWmicJ1zE.MLSIo1htfMPWeB8V876L();
                }
            }
        }
    }

    public abstract void Qrz92kRPw4GcghAc();

    public final void XiR1pIn5878vVWd() {
        y376IWm9dQvh0JucoHX y376iwm9dqvh0jucohx = this.XiR1pIn5878vVWd;
        if (y376iwm9dqvh0jucohx != null) {
            ArrayList arrayList = y376iwm9dqvh0jucohx.gIIiyi2ddlMDR0;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                HpS8WYFILXNWmicJ1zE hpS8WYFILXNWmicJ1zE = (HpS8WYFILXNWmicJ1zE) arrayList.get(size);
                if (hpS8WYFILXNWmicJ1zE != null) {
                    hpS8WYFILXNWmicJ1zE.XiR1pIn5878vVWd();
                }
            }
        }
    }

    public void b1EoSIRjJHO5(int i, int i2, Intent intent) {
    }

    @Override // v.s.fvBWJ8YGASft
    public final Xu6l0U3w5XcZ8Nkn dDIMxZXP1V8HdM() {
        P3NzOtJRLIgJpXupQRO6 p3NzOtJRLIgJpXupQRO6 = this.MLSIo1htfMPWeB8V876L;
        if ((p3NzOtJRLIgJpXupQRO6 == null ? null : p3NzOtJRLIgJpXupQRO6.xDyLpEZyrcKVe0) == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.DVTNwpDEVsUKuznof == null) {
            this.DVTNwpDEVsUKuznof = new Xu6l0U3w5XcZ8Nkn();
        }
        return this.DVTNwpDEVsUKuznof;
    }

    public final void dTS0S7eC32ubQH54j36(int i) {
        if (this.iUQk66nAiXgO35 == null && i == 0) {
            return;
        }
        vekpFI4d1Nc4fakF().vekpFI4d1Nc4fakF = i;
    }

    public LayoutInflater gIIiyi2ddlMDR0(Bundle bundle) {
        P3NzOtJRLIgJpXupQRO6 p3NzOtJRLIgJpXupQRO6 = this.MLSIo1htfMPWeB8V876L;
        if (p3NzOtJRLIgJpXupQRO6 == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        FragmentActivity fragmentActivity = p3NzOtJRLIgJpXupQRO6.pyu8ovAipBTLYAiKab;
        LayoutInflater layoutInflaterCloneInContext = fragmentActivity.getLayoutInflater().cloneInContext(fragmentActivity);
        if (this.XiR1pIn5878vVWd == null) {
            xDyLpEZyrcKVe0();
            int i = this.dDIMxZXP1V8HdM;
            if (i >= 4) {
                y376IWm9dQvh0JucoHX y376iwm9dqvh0jucohx = this.XiR1pIn5878vVWd;
                y376iwm9dqvh0jucohx.EWUjsTERgdPbSw3NNlN = false;
                y376iwm9dqvh0jucohx.yTljMGnIibTRdOpSh4 = false;
                y376iwm9dqvh0jucohx.n8nqApvKDYz7s8llJ2jf(4);
            } else if (i >= 3) {
                y376IWm9dQvh0JucoHX y376iwm9dqvh0jucohx2 = this.XiR1pIn5878vVWd;
                y376iwm9dqvh0jucohx2.EWUjsTERgdPbSw3NNlN = false;
                y376iwm9dqvh0jucohx2.yTljMGnIibTRdOpSh4 = false;
                y376iwm9dqvh0jucohx2.n8nqApvKDYz7s8llJ2jf(3);
            } else if (i >= 2) {
                y376IWm9dQvh0JucoHX y376iwm9dqvh0jucohx3 = this.XiR1pIn5878vVWd;
                y376iwm9dqvh0jucohx3.EWUjsTERgdPbSw3NNlN = false;
                y376iwm9dqvh0jucohx3.yTljMGnIibTRdOpSh4 = false;
                y376iwm9dqvh0jucohx3.n8nqApvKDYz7s8llJ2jf(2);
            } else if (i >= 1) {
                y376IWm9dQvh0JucoHX y376iwm9dqvh0jucohx4 = this.XiR1pIn5878vVWd;
                y376iwm9dqvh0jucohx4.EWUjsTERgdPbSw3NNlN = false;
                y376iwm9dqvh0jucohx4.yTljMGnIibTRdOpSh4 = false;
                y376iwm9dqvh0jucohx4.n8nqApvKDYz7s8llJ2jf(1);
            }
        }
        y376IWm9dQvh0JucoHX y376iwm9dqvh0jucohx5 = this.XiR1pIn5878vVWd;
        y376iwm9dqvh0jucohx5.getClass();
        layoutInflaterCloneInContext.setFactory2(y376iwm9dqvh0jucohx5);
        return layoutInflaterCloneInContext;
    }

    public abstract void gmNWMfvn6zlEj();

    public abstract void hjneShqpF9Tis4();

    public abstract void ibVTtJUNfrGYbW(Bundle bundle);

    public final void l1V0lQr6TbwNKqHfXNbb(Bundle bundle) {
        y376IWm9dQvh0JucoHX y376iwm9dqvh0jucohx;
        if (this.JXn4Qf7zpnLjP5 >= 0 && (y376iwm9dqvh0jucohx = this.J0zjQ7CAgohuxU20eCW6) != null && (y376iwm9dqvh0jucohx.EWUjsTERgdPbSw3NNlN || y376iwm9dqvh0jucohx.yTljMGnIibTRdOpSh4)) {
            throw new IllegalStateException("Fragment already active and state has been saved");
        }
        this.xDyLpEZyrcKVe0 = bundle;
    }

    public abstract void nQilHWaqS401ZtR();

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.xfn2GJwmGqs7kWW = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        P3NzOtJRLIgJpXupQRO6 p3NzOtJRLIgJpXupQRO6 = this.MLSIo1htfMPWeB8V876L;
        (p3NzOtJRLIgJpXupQRO6 == null ? null : p3NzOtJRLIgJpXupQRO6.Ee8d2j4S9Vm5yGuR).onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.xfn2GJwmGqs7kWW = true;
    }

    public void pyu8ovAipBTLYAiKab(Context context) {
        this.xfn2GJwmGqs7kWW = true;
        P3NzOtJRLIgJpXupQRO6 p3NzOtJRLIgJpXupQRO6 = this.MLSIo1htfMPWeB8V876L;
        if ((p3NzOtJRLIgJpXupQRO6 == null ? null : p3NzOtJRLIgJpXupQRO6.Ee8d2j4S9Vm5yGuR) != null) {
            this.xfn2GJwmGqs7kWW = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [char, int] */
    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        OFtLBiBbrrTHWu.w9sT1Swbhx3hs(this, sb);
        if (this.JXn4Qf7zpnLjP5 >= 0) {
            sb.append(" #");
            sb.append(this.JXn4Qf7zpnLjP5);
        }
        if (this.K7eEOBPYP9VIoHWTe != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.K7eEOBPYP9VIoHWTe));
        }
        if (this.EWUjsTERgdPbSw3NNlN != null) {
            sb.append(" ");
            sb.append(this.EWUjsTERgdPbSw3NNlN);
        }
        sb.append((char) (51 + 74));
        return sb.toString();
    }

    public final sQnYZADWHPzbB vekpFI4d1Nc4fakF() {
        if (this.iUQk66nAiXgO35 == null) {
            sQnYZADWHPzbB sqnyzadwhpzbb = new sQnYZADWHPzbB();
            Object obj = qfTrc75xwRVMl85vh;
            sqnyzadwhpzbb.xDyLpEZyrcKVe0 = obj;
            sqnyzadwhpzbb.ibVTtJUNfrGYbW = obj;
            sqnyzadwhpzbb.b1EoSIRjJHO5 = obj;
            this.iUQk66nAiXgO35 = sqnyzadwhpzbb;
        }
        return this.iUQk66nAiXgO35;
    }

    @Override // v.s.Xdb7JFhCToIIjDFJDI
    public final p9Dc9HHikKZdWDIj w9sT1Swbhx3hs() {
        return this.k84rwRrqzhrNQ1CdNQ9;
    }

    public abstract void wotphlvK9sPbXJ(Bundle bundle);

    public final void xDyLpEZyrcKVe0() {
        if (this.MLSIo1htfMPWeB8V876L == null) {
            throw new IllegalStateException("Fragment has not been attached yet.");
        }
        y376IWm9dQvh0JucoHX y376iwm9dqvh0jucohx = new y376IWm9dQvh0JucoHX();
        this.XiR1pIn5878vVWd = y376iwm9dqvh0jucohx;
        P3NzOtJRLIgJpXupQRO6 p3NzOtJRLIgJpXupQRO6 = this.MLSIo1htfMPWeB8V876L;
        IoI4iP6gQ9ce ioI4iP6gQ9ce = new IoI4iP6gQ9ce(this);
        if (y376iwm9dqvh0jucohx.DVTNwpDEVsUKuznof != null) {
            throw new IllegalStateException("Already attached");
        }
        y376iwm9dqvh0jucohx.DVTNwpDEVsUKuznof = p3NzOtJRLIgJpXupQRO6;
        y376iwm9dqvh0jucohx.l1V0lQr6TbwNKqHfXNbb = ioI4iP6gQ9ce;
        y376iwm9dqvh0jucohx.K7eEOBPYP9VIoHWTe = this;
    }
}
