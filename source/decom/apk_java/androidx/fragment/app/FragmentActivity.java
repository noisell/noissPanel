package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.core.app.ComponentActivity;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import v.s.FZ1sl4mHq4J0hOEYC;
import v.s.GE98OsRNceCmGYz2z;
import v.s.HpS8WYFILXNWmicJ1zE;
import v.s.NxoJLFH7TrhGd5768J;
import v.s.P3NzOtJRLIgJpXupQRO6;
import v.s.PSTeSXylP4RRVFYFKF;
import v.s.Si6rsiw0GOIQG;
import v.s.TktRugEjjmLzz8;
import v.s.Xu6l0U3w5XcZ8Nkn;
import v.s.XuO9PPFo607ssKwZjNW;
import v.s.eEkc8BfG5ogJ;
import v.s.fEyMFFyOOvHURJ7To6L;
import v.s.fvBWJ8YGASft;
import v.s.iy6XJYBMukwASsw;
import v.s.lK1IHVVetx4U;
import v.s.o2YnR8TExesBGT2N;
import v.s.p9Dc9HHikKZdWDIj;
import v.s.r5XEUfod5GSCCwq6c;
import v.s.y376IWm9dQvh0JucoHX;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class FragmentActivity extends ComponentActivity implements fvBWJ8YGASft, XuO9PPFo607ssKwZjNW {
    public boolean Ee8d2j4S9Vm5yGuR;
    public Xu6l0U3w5XcZ8Nkn JXn4Qf7zpnLjP5;
    public int b1EoSIRjJHO5;
    public Si6rsiw0GOIQG pyu8ovAipBTLYAiKab;
    public boolean xDyLpEZyrcKVe0;
    public final o2YnR8TExesBGT2N w9sT1Swbhx3hs = new o2YnR8TExesBGT2N(this);
    public final r5XEUfod5GSCCwq6c vekpFI4d1Nc4fakF = new r5XEUfod5GSCCwq6c(9, new P3NzOtJRLIgJpXupQRO6(this));
    public boolean ibVTtJUNfrGYbW = true;

    public static boolean JXn4Qf7zpnLjP5(y376IWm9dQvh0JucoHX y376iwm9dqvh0jucohx) {
        List<HpS8WYFILXNWmicJ1zE> list;
        if (y376iwm9dqvh0jucohx.gIIiyi2ddlMDR0.isEmpty()) {
            list = Collections.EMPTY_LIST;
        } else {
            synchronized (y376iwm9dqvh0jucohx.gIIiyi2ddlMDR0) {
                list = (List) y376iwm9dqvh0jucohx.gIIiyi2ddlMDR0.clone();
            }
        }
        boolean zJXn4Qf7zpnLjP5 = false;
        for (HpS8WYFILXNWmicJ1zE hpS8WYFILXNWmicJ1zE : list) {
            if (hpS8WYFILXNWmicJ1zE != null) {
                if (hpS8WYFILXNWmicJ1zE.k84rwRrqzhrNQ1CdNQ9.vekpFI4d1Nc4fakF.compareTo(lK1IHVVetx4U.Ee8d2j4S9Vm5yGuR) >= 0) {
                    p9Dc9HHikKZdWDIj p9dc9hhikkzdwdij = hpS8WYFILXNWmicJ1zE.k84rwRrqzhrNQ1CdNQ9;
                    p9dc9hhikkzdwdij.vekpFI4d1Nc4fakF("markState");
                    lK1IHVVetx4U lk1ihvvetx4u = lK1IHVVetx4U.JXn4Qf7zpnLjP5;
                    p9dc9hhikkzdwdij.vekpFI4d1Nc4fakF("setCurrentState");
                    p9dc9hhikkzdwdij.Ee8d2j4S9Vm5yGuR(lk1ihvvetx4u);
                    zJXn4Qf7zpnLjP5 = true;
                }
                y376IWm9dQvh0JucoHX y376iwm9dqvh0jucohx2 = hpS8WYFILXNWmicJ1zE.XiR1pIn5878vVWd;
                if (y376iwm9dqvh0jucohx2 != null) {
                    zJXn4Qf7zpnLjP5 |= JXn4Qf7zpnLjP5(y376iwm9dqvh0jucohx2);
                }
            }
        }
        return zJXn4Qf7zpnLjP5;
    }

    public static void vekpFI4d1Nc4fakF(int i) {
        if ((i & (-65536)) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    @Override // v.s.fvBWJ8YGASft
    public final Xu6l0U3w5XcZ8Nkn dDIMxZXP1V8HdM() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.JXn4Qf7zpnLjP5 == null) {
            TktRugEjjmLzz8 tktRugEjjmLzz8 = (TktRugEjjmLzz8) getLastNonConfigurationInstance();
            if (tktRugEjjmLzz8 != null) {
                this.JXn4Qf7zpnLjP5 = tktRugEjjmLzz8.dDIMxZXP1V8HdM;
            }
            if (this.JXn4Qf7zpnLjP5 == null) {
                this.JXn4Qf7zpnLjP5 = new Xu6l0U3w5XcZ8Nkn();
            }
        }
        return this.JXn4Qf7zpnLjP5;
    }

    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        PSTeSXylP4RRVFYFKF pSTeSXylP4RRVFYFKF;
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.Ee8d2j4S9Vm5yGuR);
        printWriter.print(" mResumed=");
        printWriter.print(this.xDyLpEZyrcKVe0);
        printWriter.print(" mStopped=");
        printWriter.print(this.ibVTtJUNfrGYbW);
        if (getApplication() != null) {
            Xu6l0U3w5XcZ8Nkn xu6l0U3w5XcZ8NknDDIMxZXP1V8HdM = dDIMxZXP1V8HdM();
            eEkc8BfG5ogJ eekc8bfg5ogj = eEkc8BfG5ogJ.w9sT1Swbhx3hs;
            String canonicalName = PSTeSXylP4RRVFYFKF.class.getCanonicalName();
            if (canonicalName == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            String strConcat = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName);
            NxoJLFH7TrhGd5768J nxoJLFH7TrhGd5768J = (NxoJLFH7TrhGd5768J) xu6l0U3w5XcZ8NknDDIMxZXP1V8HdM.dDIMxZXP1V8HdM.get(strConcat);
            if (!PSTeSXylP4RRVFYFKF.class.isInstance(nxoJLFH7TrhGd5768J)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.putAll((LinkedHashMap) eekc8bfg5ogj.dDIMxZXP1V8HdM);
                linkedHashMap.put(fEyMFFyOOvHURJ7To6L.gmNWMfvn6zlEj, strConcat);
                try {
                    pSTeSXylP4RRVFYFKF = new PSTeSXylP4RRVFYFKF();
                } catch (AbstractMethodError unused) {
                    pSTeSXylP4RRVFYFKF = new PSTeSXylP4RRVFYFKF();
                }
                nxoJLFH7TrhGd5768J = pSTeSXylP4RRVFYFKF;
                NxoJLFH7TrhGd5768J nxoJLFH7TrhGd5768J2 = (NxoJLFH7TrhGd5768J) xu6l0U3w5XcZ8NknDDIMxZXP1V8HdM.dDIMxZXP1V8HdM.put(strConcat, nxoJLFH7TrhGd5768J);
                if (nxoJLFH7TrhGd5768J2 != null) {
                    nxoJLFH7TrhGd5768J2.dDIMxZXP1V8HdM();
                }
            }
            Si6rsiw0GOIQG si6rsiw0GOIQG = ((PSTeSXylP4RRVFYFKF) nxoJLFH7TrhGd5768J).vekpFI4d1Nc4fakF;
            if (si6rsiw0GOIQG.w9sT1Swbhx3hs() > 0) {
                printWriter.print(str2);
                printWriter.println("Loaders:");
                if (si6rsiw0GOIQG.w9sT1Swbhx3hs() > 0) {
                    if (si6rsiw0GOIQG.vekpFI4d1Nc4fakF(0) != null) {
                        throw new ClassCastException();
                    }
                    printWriter.print(str2);
                    printWriter.print("  #");
                    if (si6rsiw0GOIQG.w9sT1Swbhx3hs) {
                        si6rsiw0GOIQG.dDIMxZXP1V8HdM();
                    }
                    printWriter.print(si6rsiw0GOIQG.vekpFI4d1Nc4fakF[0]);
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        ((P3NzOtJRLIgJpXupQRO6) this.vekpFI4d1Nc4fakF.vekpFI4d1Nc4fakF).b1EoSIRjJHO5.uCN4HERvZEfG7JjL(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        Object obj;
        HpS8WYFILXNWmicJ1zE hpS8WYFILXNWmicJ1zEPPWVWMPAUcr9AGNUSxQ;
        r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c = this.vekpFI4d1Nc4fakF;
        r5xeufod5gsccwq6c.H9XlUr4OeMJFiXK();
        int i3 = i >> 16;
        if (i3 == 0) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        int i4 = i3 - 1;
        Si6rsiw0GOIQG si6rsiw0GOIQG = this.pyu8ovAipBTLYAiKab;
        int iEe8d2j4S9Vm5yGuR = FZ1sl4mHq4J0hOEYC.Ee8d2j4S9Vm5yGuR(si6rsiw0GOIQG.vekpFI4d1Nc4fakF, si6rsiw0GOIQG.Ee8d2j4S9Vm5yGuR, i4);
        Object obj2 = Si6rsiw0GOIQG.xDyLpEZyrcKVe0;
        if (iEe8d2j4S9Vm5yGuR < 0 || (obj = si6rsiw0GOIQG.JXn4Qf7zpnLjP5[iEe8d2j4S9Vm5yGuR]) == obj2) {
            obj = null;
        }
        String str = (String) obj;
        Si6rsiw0GOIQG si6rsiw0GOIQG2 = this.pyu8ovAipBTLYAiKab;
        int iEe8d2j4S9Vm5yGuR2 = FZ1sl4mHq4J0hOEYC.Ee8d2j4S9Vm5yGuR(si6rsiw0GOIQG2.vekpFI4d1Nc4fakF, si6rsiw0GOIQG2.Ee8d2j4S9Vm5yGuR, i4);
        if (iEe8d2j4S9Vm5yGuR2 >= 0) {
            Object[] objArr = si6rsiw0GOIQG2.JXn4Qf7zpnLjP5;
            if (objArr[iEe8d2j4S9Vm5yGuR2] != obj2) {
                objArr[iEe8d2j4S9Vm5yGuR2] = obj2;
                si6rsiw0GOIQG2.w9sT1Swbhx3hs = true;
            }
        }
        if (str == null || (hpS8WYFILXNWmicJ1zEPPWVWMPAUcr9AGNUSxQ = ((P3NzOtJRLIgJpXupQRO6) r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF).b1EoSIRjJHO5.PPWVWMPAUcr9AGNUSxQ(str)) == null) {
            return;
        }
        hpS8WYFILXNWmicJ1zEPPWVWMPAUcr9AGNUSxQ.getClass();
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        y376IWm9dQvh0JucoHX y376iwm9dqvh0jucohx = ((P3NzOtJRLIgJpXupQRO6) this.vekpFI4d1Nc4fakF.vekpFI4d1Nc4fakF).b1EoSIRjJHO5;
        if (y376iwm9dqvh0jucohx.EWUjsTERgdPbSw3NNlN || y376iwm9dqvh0jucohx.yTljMGnIibTRdOpSh4 || !y376iwm9dqvh0jucohx.fuVo7ziLxZvlZPnaGfbO()) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c = this.vekpFI4d1Nc4fakF;
        r5xeufod5gsccwq6c.H9XlUr4OeMJFiXK();
        ArrayList arrayList = ((P3NzOtJRLIgJpXupQRO6) r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF).b1EoSIRjJHO5.gIIiyi2ddlMDR0;
        for (int i = 0; i < arrayList.size(); i++) {
            HpS8WYFILXNWmicJ1zE hpS8WYFILXNWmicJ1zE = (HpS8WYFILXNWmicJ1zE) arrayList.get(i);
            if (hpS8WYFILXNWmicJ1zE != null) {
                hpS8WYFILXNWmicJ1zE.J0zjQ7CAgohuxU20eCW6();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e0 A[LOOP:1: B:43:0x00d0->B:48:0x00e0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x0104  */
    /* JADX WARN: Code duplicated, block: B:67:0x00dc A[SYNTHETIC] */
    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Xu6l0U3w5XcZ8Nkn xu6l0U3w5XcZ8Nkn;
        r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c = this.vekpFI4d1Nc4fakF;
        P3NzOtJRLIgJpXupQRO6 p3NzOtJRLIgJpXupQRO6 = (P3NzOtJRLIgJpXupQRO6) r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF;
        P3NzOtJRLIgJpXupQRO6 p3NzOtJRLIgJpXupQRO7 = (P3NzOtJRLIgJpXupQRO6) r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF;
        y376IWm9dQvh0JucoHX y376iwm9dqvh0jucohx = p3NzOtJRLIgJpXupQRO6.b1EoSIRjJHO5;
        if (y376iwm9dqvh0jucohx.DVTNwpDEVsUKuznof != null) {
            throw new IllegalStateException("Already attached");
        }
        y376iwm9dqvh0jucohx.DVTNwpDEVsUKuznof = p3NzOtJRLIgJpXupQRO6;
        y376iwm9dqvh0jucohx.l1V0lQr6TbwNKqHfXNbb = p3NzOtJRLIgJpXupQRO6;
        y376iwm9dqvh0jucohx.K7eEOBPYP9VIoHWTe = null;
        super.onCreate(bundle);
        TktRugEjjmLzz8 tktRugEjjmLzz8 = (TktRugEjjmLzz8) getLastNonConfigurationInstance();
        if (tktRugEjjmLzz8 != null && (xu6l0U3w5XcZ8Nkn = tktRugEjjmLzz8.dDIMxZXP1V8HdM) != null && this.JXn4Qf7zpnLjP5 == null) {
            this.JXn4Qf7zpnLjP5 = xu6l0U3w5XcZ8Nkn;
        }
        if (bundle != null) {
            p3NzOtJRLIgJpXupQRO7.b1EoSIRjJHO5.uV1d27nePzvpefeE(bundle.getParcelable("android:support:fragments"), tktRugEjjmLzz8 != null ? tktRugEjjmLzz8.w9sT1Swbhx3hs : null);
            if (bundle.containsKey("android:support:next_request_index")) {
                this.b1EoSIRjJHO5 = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray != null && stringArray != null && intArray.length == stringArray.length) {
                    this.pyu8ovAipBTLYAiKab = new Si6rsiw0GOIQG(intArray.length);
                    for (int i6 = 0; i6 < intArray.length; i6++) {
                        Si6rsiw0GOIQG si6rsiw0GOIQG = this.pyu8ovAipBTLYAiKab;
                        int i7 = intArray[i6];
                        String str = stringArray[i6];
                        int iEe8d2j4S9Vm5yGuR = FZ1sl4mHq4J0hOEYC.Ee8d2j4S9Vm5yGuR(si6rsiw0GOIQG.vekpFI4d1Nc4fakF, si6rsiw0GOIQG.Ee8d2j4S9Vm5yGuR, i7);
                        if (iEe8d2j4S9Vm5yGuR >= 0) {
                            si6rsiw0GOIQG.JXn4Qf7zpnLjP5[iEe8d2j4S9Vm5yGuR] = str;
                        } else {
                            int i8 = ~iEe8d2j4S9Vm5yGuR;
                            int i9 = si6rsiw0GOIQG.Ee8d2j4S9Vm5yGuR;
                            if (i8 < i9) {
                                Object[] objArr = si6rsiw0GOIQG.JXn4Qf7zpnLjP5;
                                if (objArr[i8] == Si6rsiw0GOIQG.xDyLpEZyrcKVe0) {
                                    si6rsiw0GOIQG.vekpFI4d1Nc4fakF[i8] = i7;
                                    objArr[i8] = str;
                                } else {
                                    if (si6rsiw0GOIQG.w9sT1Swbhx3hs && i9 >= si6rsiw0GOIQG.vekpFI4d1Nc4fakF.length) {
                                        si6rsiw0GOIQG.dDIMxZXP1V8HdM();
                                        i8 = ~FZ1sl4mHq4J0hOEYC.Ee8d2j4S9Vm5yGuR(si6rsiw0GOIQG.vekpFI4d1Nc4fakF, si6rsiw0GOIQG.Ee8d2j4S9Vm5yGuR, i7);
                                    }
                                    i = si6rsiw0GOIQG.Ee8d2j4S9Vm5yGuR;
                                    if (i >= si6rsiw0GOIQG.vekpFI4d1Nc4fakF.length) {
                                        i3 = (i + 1) * 4;
                                        for (i4 = 4; i4 < 117 - 85; i4++) {
                                            i5 = (1 << i4) - 12;
                                            if (i3 <= i5) {
                                                i3 = i5;
                                                break;
                                            }
                                        }
                                        int i10 = i3 / 4;
                                        int[] iArr = new int[i10];
                                        Object[] objArr2 = new Object[i10];
                                        int[] iArr2 = si6rsiw0GOIQG.vekpFI4d1Nc4fakF;
                                        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                                        Object[] objArr3 = si6rsiw0GOIQG.JXn4Qf7zpnLjP5;
                                        System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
                                        si6rsiw0GOIQG.vekpFI4d1Nc4fakF = iArr;
                                        si6rsiw0GOIQG.JXn4Qf7zpnLjP5 = objArr2;
                                    }
                                    i2 = si6rsiw0GOIQG.Ee8d2j4S9Vm5yGuR - i8;
                                    if (i2 != 0) {
                                        int[] iArr3 = si6rsiw0GOIQG.vekpFI4d1Nc4fakF;
                                        int i11 = i8 + 1;
                                        System.arraycopy(iArr3, i8, iArr3, i11, i2);
                                        Object[] objArr4 = si6rsiw0GOIQG.JXn4Qf7zpnLjP5;
                                        System.arraycopy(objArr4, i8, objArr4, i11, si6rsiw0GOIQG.Ee8d2j4S9Vm5yGuR - i8);
                                    }
                                    si6rsiw0GOIQG.vekpFI4d1Nc4fakF[i8] = i7;
                                    si6rsiw0GOIQG.JXn4Qf7zpnLjP5[i8] = str;
                                    si6rsiw0GOIQG.Ee8d2j4S9Vm5yGuR++;
                                }
                            } else {
                                if (si6rsiw0GOIQG.w9sT1Swbhx3hs) {
                                    si6rsiw0GOIQG.dDIMxZXP1V8HdM();
                                    i8 = ~FZ1sl4mHq4J0hOEYC.Ee8d2j4S9Vm5yGuR(si6rsiw0GOIQG.vekpFI4d1Nc4fakF, si6rsiw0GOIQG.Ee8d2j4S9Vm5yGuR, i7);
                                }
                                i = si6rsiw0GOIQG.Ee8d2j4S9Vm5yGuR;
                                if (i >= si6rsiw0GOIQG.vekpFI4d1Nc4fakF.length) {
                                    i3 = (i + 1) * 4;
                                    while (i4 < 117 - 85) {
                                        i5 = (1 << i4) - 12;
                                        if (i3 <= i5) {
                                            i3 = i5;
                                            break;
                                        }
                                    }
                                    int i12 = i3 / 4;
                                    int[] iArr4 = new int[i12];
                                    Object[] objArr5 = new Object[i12];
                                    int[] iArr5 = si6rsiw0GOIQG.vekpFI4d1Nc4fakF;
                                    System.arraycopy(iArr5, 0, iArr4, 0, iArr5.length);
                                    Object[] objArr6 = si6rsiw0GOIQG.JXn4Qf7zpnLjP5;
                                    System.arraycopy(objArr6, 0, objArr5, 0, objArr6.length);
                                    si6rsiw0GOIQG.vekpFI4d1Nc4fakF = iArr4;
                                    si6rsiw0GOIQG.JXn4Qf7zpnLjP5 = objArr5;
                                }
                                i2 = si6rsiw0GOIQG.Ee8d2j4S9Vm5yGuR - i8;
                                if (i2 != 0) {
                                    int[] iArr6 = si6rsiw0GOIQG.vekpFI4d1Nc4fakF;
                                    int i13 = i8 + 1;
                                    System.arraycopy(iArr6, i8, iArr6, i13, i2);
                                    Object[] objArr7 = si6rsiw0GOIQG.JXn4Qf7zpnLjP5;
                                    System.arraycopy(objArr7, i8, objArr7, i13, si6rsiw0GOIQG.Ee8d2j4S9Vm5yGuR - i8);
                                }
                                si6rsiw0GOIQG.vekpFI4d1Nc4fakF[i8] = i7;
                                si6rsiw0GOIQG.JXn4Qf7zpnLjP5[i8] = str;
                                si6rsiw0GOIQG.Ee8d2j4S9Vm5yGuR++;
                            }
                        }
                    }
                }
            }
        }
        if (this.pyu8ovAipBTLYAiKab == null) {
            this.pyu8ovAipBTLYAiKab = new Si6rsiw0GOIQG();
            this.b1EoSIRjJHO5 = 0;
        }
        y376IWm9dQvh0JucoHX y376iwm9dqvh0jucohx2 = p3NzOtJRLIgJpXupQRO7.b1EoSIRjJHO5;
        y376iwm9dqvh0jucohx2.EWUjsTERgdPbSw3NNlN = false;
        y376iwm9dqvh0jucohx2.yTljMGnIibTRdOpSh4 = false;
        y376iwm9dqvh0jucohx2.n8nqApvKDYz7s8llJ2jf(1);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return super.onCreatePanelMenu(i, menu);
        }
        boolean zOnCreatePanelMenu = super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        return zOnCreatePanelMenu | ((P3NzOtJRLIgJpXupQRO6) this.vekpFI4d1Nc4fakF.vekpFI4d1Nc4fakF).b1EoSIRjJHO5.hV4VTKNUdeHN();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        ((P3NzOtJRLIgJpXupQRO6) this.vekpFI4d1Nc4fakF.vekpFI4d1Nc4fakF).b1EoSIRjJHO5.onCreateView(view, str, context, attributeSet);
        return super.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (this.JXn4Qf7zpnLjP5 != null && !isChangingConfigurations()) {
            this.JXn4Qf7zpnLjP5.dDIMxZXP1V8HdM();
        }
        ((P3NzOtJRLIgJpXupQRO6) this.vekpFI4d1Nc4fakF.vekpFI4d1Nc4fakF).b1EoSIRjJHO5.k84rwRrqzhrNQ1CdNQ9();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        ArrayList arrayList = ((P3NzOtJRLIgJpXupQRO6) this.vekpFI4d1Nc4fakF.vekpFI4d1Nc4fakF).b1EoSIRjJHO5.gIIiyi2ddlMDR0;
        for (int i = 0; i < arrayList.size(); i++) {
            HpS8WYFILXNWmicJ1zE hpS8WYFILXNWmicJ1zE = (HpS8WYFILXNWmicJ1zE) arrayList.get(i);
            if (hpS8WYFILXNWmicJ1zE != null) {
                hpS8WYFILXNWmicJ1zE.MLSIo1htfMPWeB8V876L();
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c = this.vekpFI4d1Nc4fakF;
        if (i == 0) {
            return ((P3NzOtJRLIgJpXupQRO6) r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF).b1EoSIRjJHO5.t9CXKrwDxrnFA6g23hZU();
        }
        if (i != (-66) + 72) {
            return false;
        }
        return ((P3NzOtJRLIgJpXupQRO6) r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF).b1EoSIRjJHO5.XuO9PPFo607ssKwZjNW();
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        ArrayList arrayList = ((P3NzOtJRLIgJpXupQRO6) this.vekpFI4d1Nc4fakF.vekpFI4d1Nc4fakF).b1EoSIRjJHO5.gIIiyi2ddlMDR0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            HpS8WYFILXNWmicJ1zE hpS8WYFILXNWmicJ1zE = (HpS8WYFILXNWmicJ1zE) arrayList.get(size);
            if (hpS8WYFILXNWmicJ1zE != null) {
                hpS8WYFILXNWmicJ1zE.XiR1pIn5878vVWd();
            }
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.vekpFI4d1Nc4fakF.H9XlUr4OeMJFiXK();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            ((P3NzOtJRLIgJpXupQRO6) this.vekpFI4d1Nc4fakF.vekpFI4d1Nc4fakF).b1EoSIRjJHO5.UoxIZOBVZaubOFdPNaXK();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.xDyLpEZyrcKVe0 = false;
        o2YnR8TExesBGT2N o2ynr8texesbgt2n = this.w9sT1Swbhx3hs;
        boolean zHasMessages = o2ynr8texesbgt2n.hasMessages(2);
        r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c = this.vekpFI4d1Nc4fakF;
        if (zHasMessages) {
            o2ynr8texesbgt2n.removeMessages(2);
            y376IWm9dQvh0JucoHX y376iwm9dqvh0jucohx = ((P3NzOtJRLIgJpXupQRO6) r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF).b1EoSIRjJHO5;
            y376iwm9dqvh0jucohx.EWUjsTERgdPbSw3NNlN = false;
            y376iwm9dqvh0jucohx.yTljMGnIibTRdOpSh4 = false;
            y376iwm9dqvh0jucohx.n8nqApvKDYz7s8llJ2jf((-54) + 58);
        }
        ((P3NzOtJRLIgJpXupQRO6) r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF).b1EoSIRjJHO5.n8nqApvKDYz7s8llJ2jf(3);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        ArrayList arrayList = ((P3NzOtJRLIgJpXupQRO6) this.vekpFI4d1Nc4fakF.vekpFI4d1Nc4fakF).b1EoSIRjJHO5.gIIiyi2ddlMDR0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            HpS8WYFILXNWmicJ1zE hpS8WYFILXNWmicJ1zE = (HpS8WYFILXNWmicJ1zE) arrayList.get(size);
            if (hpS8WYFILXNWmicJ1zE != null) {
                hpS8WYFILXNWmicJ1zE.H9XlUr4OeMJFiXK();
            }
        }
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        this.w9sT1Swbhx3hs.removeMessages(2);
        r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c = this.vekpFI4d1Nc4fakF;
        y376IWm9dQvh0JucoHX y376iwm9dqvh0jucohx = ((P3NzOtJRLIgJpXupQRO6) r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF).b1EoSIRjJHO5;
        y376iwm9dqvh0jucohx.EWUjsTERgdPbSw3NNlN = false;
        y376iwm9dqvh0jucohx.yTljMGnIibTRdOpSh4 = false;
        y376iwm9dqvh0jucohx.n8nqApvKDYz7s8llJ2jf(4);
        ((P3NzOtJRLIgJpXupQRO6) r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF).b1EoSIRjJHO5.fxMPJzvjKAjA();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        return (i != 0 || menu == null) ? super.onPreparePanel(i, view, menu) : super.onPreparePanel(0, view, menu) | ((P3NzOtJRLIgJpXupQRO6) this.vekpFI4d1Nc4fakF.vekpFI4d1Nc4fakF).b1EoSIRjJHO5.ajrMZmky8AIb2Pr();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Object obj;
        r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c = this.vekpFI4d1Nc4fakF;
        r5xeufod5gsccwq6c.H9XlUr4OeMJFiXK();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            Si6rsiw0GOIQG si6rsiw0GOIQG = this.pyu8ovAipBTLYAiKab;
            int iEe8d2j4S9Vm5yGuR = FZ1sl4mHq4J0hOEYC.Ee8d2j4S9Vm5yGuR(si6rsiw0GOIQG.vekpFI4d1Nc4fakF, si6rsiw0GOIQG.Ee8d2j4S9Vm5yGuR, i3);
            Object obj2 = Si6rsiw0GOIQG.xDyLpEZyrcKVe0;
            if (iEe8d2j4S9Vm5yGuR < 0 || (obj = si6rsiw0GOIQG.JXn4Qf7zpnLjP5[iEe8d2j4S9Vm5yGuR]) == obj2) {
                obj = null;
            }
            String str = (String) obj;
            Si6rsiw0GOIQG si6rsiw0GOIQG2 = this.pyu8ovAipBTLYAiKab;
            int iEe8d2j4S9Vm5yGuR2 = FZ1sl4mHq4J0hOEYC.Ee8d2j4S9Vm5yGuR(si6rsiw0GOIQG2.vekpFI4d1Nc4fakF, si6rsiw0GOIQG2.Ee8d2j4S9Vm5yGuR, i3);
            if (iEe8d2j4S9Vm5yGuR2 >= 0) {
                Object[] objArr = si6rsiw0GOIQG2.JXn4Qf7zpnLjP5;
                if (objArr[iEe8d2j4S9Vm5yGuR2] != obj2) {
                    objArr[iEe8d2j4S9Vm5yGuR2] = obj2;
                    si6rsiw0GOIQG2.w9sT1Swbhx3hs = true;
                }
            }
            if (str == null) {
                return;
            }
            ((P3NzOtJRLIgJpXupQRO6) r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF).b1EoSIRjJHO5.PPWVWMPAUcr9AGNUSxQ(str);
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        this.w9sT1Swbhx3hs.sendEmptyMessage((-86) + 88);
        this.xDyLpEZyrcKVe0 = true;
        ((P3NzOtJRLIgJpXupQRO6) this.vekpFI4d1Nc4fakF.vekpFI4d1Nc4fakF).b1EoSIRjJHO5.fxMPJzvjKAjA();
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        y376IWm9dQvh0JucoHX y376iwm9dqvh0jucohx = ((P3NzOtJRLIgJpXupQRO6) this.vekpFI4d1Nc4fakF.vekpFI4d1Nc4fakF).b1EoSIRjJHO5;
        y376IWm9dQvh0JucoHX.Sn2d19yOBfyV0rw(y376iwm9dqvh0jucohx.ECwLkmPW1UKz7J6E);
        GE98OsRNceCmGYz2z gE98OsRNceCmGYz2z = y376iwm9dqvh0jucohx.ECwLkmPW1UKz7J6E;
        if (gE98OsRNceCmGYz2z == null && this.JXn4Qf7zpnLjP5 == null) {
            return null;
        }
        TktRugEjjmLzz8 tktRugEjjmLzz8 = new TktRugEjjmLzz8();
        tktRugEjjmLzz8.dDIMxZXP1V8HdM = this.JXn4Qf7zpnLjP5;
        tktRugEjjmLzz8.w9sT1Swbhx3hs = gE98OsRNceCmGYz2z;
        return tktRugEjjmLzz8;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c;
        super.onSaveInstanceState(bundle);
        do {
            r5xeufod5gsccwq6c = this.vekpFI4d1Nc4fakF;
        } while (JXn4Qf7zpnLjP5(((P3NzOtJRLIgJpXupQRO6) r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF).b1EoSIRjJHO5));
        iy6XJYBMukwASsw iy6xjybmukwasswGUsyOYEIobMSb6n = ((P3NzOtJRLIgJpXupQRO6) r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF).b1EoSIRjJHO5.GUsyOYEIobMSb6n();
        if (iy6xjybmukwasswGUsyOYEIobMSb6n != null) {
            bundle.putParcelable("android:support:fragments", iy6xjybmukwasswGUsyOYEIobMSb6n);
        }
        if (this.pyu8ovAipBTLYAiKab.w9sT1Swbhx3hs() > 0) {
            bundle.putInt("android:support:next_request_index", this.b1EoSIRjJHO5);
            int[] iArr = new int[this.pyu8ovAipBTLYAiKab.w9sT1Swbhx3hs()];
            String[] strArr = new String[this.pyu8ovAipBTLYAiKab.w9sT1Swbhx3hs()];
            for (int i = 0; i < this.pyu8ovAipBTLYAiKab.w9sT1Swbhx3hs(); i++) {
                Si6rsiw0GOIQG si6rsiw0GOIQG = this.pyu8ovAipBTLYAiKab;
                if (si6rsiw0GOIQG.w9sT1Swbhx3hs) {
                    si6rsiw0GOIQG.dDIMxZXP1V8HdM();
                }
                iArr[i] = si6rsiw0GOIQG.vekpFI4d1Nc4fakF[i];
                strArr[i] = (String) this.pyu8ovAipBTLYAiKab.vekpFI4d1Nc4fakF(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        this.ibVTtJUNfrGYbW = false;
        boolean z = this.Ee8d2j4S9Vm5yGuR;
        r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c = this.vekpFI4d1Nc4fakF;
        if (!z) {
            this.Ee8d2j4S9Vm5yGuR = true;
            y376IWm9dQvh0JucoHX y376iwm9dqvh0jucohx = ((P3NzOtJRLIgJpXupQRO6) r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF).b1EoSIRjJHO5;
            y376iwm9dqvh0jucohx.EWUjsTERgdPbSw3NNlN = false;
            y376iwm9dqvh0jucohx.yTljMGnIibTRdOpSh4 = false;
            y376iwm9dqvh0jucohx.n8nqApvKDYz7s8llJ2jf(2);
        }
        r5xeufod5gsccwq6c.H9XlUr4OeMJFiXK();
        P3NzOtJRLIgJpXupQRO6 p3NzOtJRLIgJpXupQRO6 = (P3NzOtJRLIgJpXupQRO6) r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF;
        p3NzOtJRLIgJpXupQRO6.b1EoSIRjJHO5.fxMPJzvjKAjA();
        y376IWm9dQvh0JucoHX y376iwm9dqvh0jucohx2 = p3NzOtJRLIgJpXupQRO6.b1EoSIRjJHO5;
        y376iwm9dqvh0jucohx2.EWUjsTERgdPbSw3NNlN = false;
        y376iwm9dqvh0jucohx2.yTljMGnIibTRdOpSh4 = false;
        y376iwm9dqvh0jucohx2.n8nqApvKDYz7s8llJ2jf(3);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.vekpFI4d1Nc4fakF.H9XlUr4OeMJFiXK();
    }

    @Override // android.app.Activity
    public final void onStop() {
        r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c;
        super.onStop();
        this.ibVTtJUNfrGYbW = true;
        do {
            r5xeufod5gsccwq6c = this.vekpFI4d1Nc4fakF;
        } while (JXn4Qf7zpnLjP5(((P3NzOtJRLIgJpXupQRO6) r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF).b1EoSIRjJHO5));
        y376IWm9dQvh0JucoHX y376iwm9dqvh0jucohx = ((P3NzOtJRLIgJpXupQRO6) r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF).b1EoSIRjJHO5;
        y376iwm9dqvh0jucohx.yTljMGnIibTRdOpSh4 = true;
        y376iwm9dqvh0jucohx.n8nqApvKDYz7s8llJ2jf(2);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        if (i != -1) {
            vekpFI4d1Nc4fakF(i);
        }
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        if (i != (-56) + 55) {
            vekpFI4d1Nc4fakF(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // androidx.core.app.ComponentActivity, v.s.Xdb7JFhCToIIjDFJDI
    public final p9Dc9HHikKZdWDIj w9sT1Swbhx3hs() {
        return this.dDIMxZXP1V8HdM;
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (i != -1) {
            vekpFI4d1Nc4fakF(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i != -1) {
            vekpFI4d1Nc4fakF(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        ((P3NzOtJRLIgJpXupQRO6) this.vekpFI4d1Nc4fakF.vekpFI4d1Nc4fakF).b1EoSIRjJHO5.onCreateView(null, str, context, attributeSet);
        return super.onCreateView(str, context, attributeSet);
    }
}
