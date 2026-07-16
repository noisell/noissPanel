package v.s;

import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class CLhpxpKTpqUQISCXEKY {
    public static final wLs7ypyhWiPv vekpFI4d1Nc4fakF;
    public static final int[] dDIMxZXP1V8HdM = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8};
    public static final wLs7ypyhWiPv w9sT1Swbhx3hs = new wLs7ypyhWiPv();

    static {
        wLs7ypyhWiPv wls7ypyhwipv = null;
        try {
            wls7ypyhwipv = (wLs7ypyhWiPv) Class.forName("androidx.transition.FragmentTransitionSupport").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        vekpFI4d1Nc4fakF = wls7ypyhwipv;
    }

    public static ArrayList Ee8d2j4S9Vm5yGuR(Object obj, HpS8WYFILXNWmicJ1zE hpS8WYFILXNWmicJ1zE, ArrayList arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        hpS8WYFILXNWmicJ1zE.getClass();
        arrayList2.removeAll(arrayList);
        if (!arrayList2.isEmpty()) {
            arrayList2.add(view);
            wLs7ypyhWiPv.dDIMxZXP1V8HdM(obj, arrayList2);
        }
        return arrayList2;
    }

    public static wLs7ypyhWiPv JXn4Qf7zpnLjP5(HpS8WYFILXNWmicJ1zE hpS8WYFILXNWmicJ1zE, HpS8WYFILXNWmicJ1zE hpS8WYFILXNWmicJ1zE2) {
        Object obj;
        Object obj2;
        Object obj3;
        ArrayList arrayList = new ArrayList();
        if (hpS8WYFILXNWmicJ1zE != null) {
            sQnYZADWHPzbB sqnyzadwhpzbb = hpS8WYFILXNWmicJ1zE.iUQk66nAiXgO35;
            if (sqnyzadwhpzbb == null || (obj2 = sqnyzadwhpzbb.xDyLpEZyrcKVe0) == HpS8WYFILXNWmicJ1zE.qfTrc75xwRVMl85vh) {
                obj2 = null;
            }
            if (obj2 != null) {
                arrayList.add(obj2);
            }
            sQnYZADWHPzbB sqnyzadwhpzbb2 = hpS8WYFILXNWmicJ1zE.iUQk66nAiXgO35;
            if (sqnyzadwhpzbb2 == null || (obj3 = sqnyzadwhpzbb2.b1EoSIRjJHO5) == HpS8WYFILXNWmicJ1zE.qfTrc75xwRVMl85vh) {
                obj3 = null;
            }
            if (obj3 != null) {
                arrayList.add(obj3);
            }
        }
        if (hpS8WYFILXNWmicJ1zE2 != null) {
            sQnYZADWHPzbB sqnyzadwhpzbb3 = hpS8WYFILXNWmicJ1zE2.iUQk66nAiXgO35;
            if (sqnyzadwhpzbb3 == null || (obj = sqnyzadwhpzbb3.ibVTtJUNfrGYbW) == HpS8WYFILXNWmicJ1zE.qfTrc75xwRVMl85vh) {
                obj = null;
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!(arrayList.get(i) instanceof Transition)) {
                wLs7ypyhWiPv wls7ypyhwipv = vekpFI4d1Nc4fakF;
                if (wls7ypyhwipv != null) {
                    int size2 = arrayList.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        if (arrayList.get(i2) instanceof Transition) {
                        }
                    }
                    return wls7ypyhwipv;
                }
                throw new IllegalArgumentException("Invalid Transition types");
            }
        }
        return w9sT1Swbhx3hs;
    }

    public static void b1EoSIRjJHO5(ArrayList arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((View) arrayList.get(size)).setVisibility(i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x004a  */
    /* JADX WARN: Code duplicated, block: B:32:0x004d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0069  */
    /* JADX WARN: Code duplicated, block: B:43:0x006b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:57:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x0095  */
    public static void dDIMxZXP1V8HdM(s6GzzATP8xbv7YKDDrkn s6gzzatp8xbv7ykddrkn, bDLizfK87pPvhTehh1Z bdlizfk87ppvhtehh1z, SparseArray sparseArray, boolean z, boolean z2) {
        int i;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        HpS8WYFILXNWmicJ1zE hpS8WYFILXNWmicJ1zE = bdlizfk87ppvhtehh1z.w9sT1Swbhx3hs;
        if (hpS8WYFILXNWmicJ1zE == null || (i = hpS8WYFILXNWmicJ1zE.dTS0S7eC32ubQH54j36) == 0) {
            return;
        }
        int i2 = z ? dDIMxZXP1V8HdM[bdlizfk87ppvhtehh1z.dDIMxZXP1V8HdM] : bdlizfk87ppvhtehh1z.dDIMxZXP1V8HdM;
        boolean z8 = false;
        if (i2 == 1) {
            if (z2) {
                z3 = false;
            } else if (!hpS8WYFILXNWmicJ1zE.D5P1xCAyuvgF || hpS8WYFILXNWmicJ1zE.yTljMGnIibTRdOpSh4) {
                z3 = false;
            } else {
                z3 = true;
            }
            z4 = false;
            z5 = false;
            z8 = z3;
            z6 = true;
        } else if (i2 == (-54) + 57) {
            if (z2 || !hpS8WYFILXNWmicJ1zE.D5P1xCAyuvgF || hpS8WYFILXNWmicJ1zE.yTljMGnIibTRdOpSh4) {
                z7 = false;
            } else {
                z7 = true;
            }
            z5 = z7;
            z6 = false;
            z4 = true;
        } else if (i2 == 4) {
            if (!z2 ? !(!hpS8WYFILXNWmicJ1zE.D5P1xCAyuvgF || hpS8WYFILXNWmicJ1zE.yTljMGnIibTRdOpSh4) : hpS8WYFILXNWmicJ1zE.XuO9PPFo607ssKwZjNW && hpS8WYFILXNWmicJ1zE.D5P1xCAyuvgF && hpS8WYFILXNWmicJ1zE.yTljMGnIibTRdOpSh4) {
                z7 = false;
            } else {
                z7 = true;
            }
            z5 = z7;
            z6 = false;
            z4 = true;
        } else if (i2 == 5) {
            if (!z2) {
                z3 = hpS8WYFILXNWmicJ1zE.yTljMGnIibTRdOpSh4;
            } else if (hpS8WYFILXNWmicJ1zE.XuO9PPFo607ssKwZjNW && !hpS8WYFILXNWmicJ1zE.yTljMGnIibTRdOpSh4 && hpS8WYFILXNWmicJ1zE.D5P1xCAyuvgF) {
                z3 = true;
            } else {
                z3 = false;
            }
            z4 = false;
            z5 = false;
            z8 = z3;
            z6 = true;
        } else if (i2 == 6) {
            if (z2) {
                z7 = true;
                z5 = z7;
                z6 = false;
                z4 = true;
            }
            z7 = false;
            z5 = z7;
            z6 = false;
            z4 = true;
        } else if (i2 != (-39) + 46) {
            z6 = false;
            z4 = false;
            z5 = false;
        } else {
            if (z2) {
                z3 = false;
            } else {
                if (hpS8WYFILXNWmicJ1zE.D5P1xCAyuvgF) {
                }
                z3 = false;
            }
            z4 = false;
            z5 = false;
            z8 = z3;
            z6 = true;
        }
        Bf7HAFpIKfIPl2 bf7HAFpIKfIPl2 = (Bf7HAFpIKfIPl2) sparseArray.get(i);
        if (z8) {
            if (bf7HAFpIKfIPl2 == null) {
                bf7HAFpIKfIPl2 = new Bf7HAFpIKfIPl2();
                sparseArray.put(i, bf7HAFpIKfIPl2);
            }
            bf7HAFpIKfIPl2.dDIMxZXP1V8HdM = hpS8WYFILXNWmicJ1zE;
            bf7HAFpIKfIPl2.w9sT1Swbhx3hs = z;
            bf7HAFpIKfIPl2.vekpFI4d1Nc4fakF = s6gzzatp8xbv7ykddrkn;
        }
        Bf7HAFpIKfIPl2 bf7HAFpIKfIPl3 = bf7HAFpIKfIPl2;
        if (!z2 && z6) {
            if (bf7HAFpIKfIPl3 != null && bf7HAFpIKfIPl3.JXn4Qf7zpnLjP5 == hpS8WYFILXNWmicJ1zE) {
                bf7HAFpIKfIPl3.JXn4Qf7zpnLjP5 = null;
            }
            y376IWm9dQvh0JucoHX y376iwm9dqvh0jucohx = s6gzzatp8xbv7ykddrkn.dDIMxZXP1V8HdM;
            if (hpS8WYFILXNWmicJ1zE.dDIMxZXP1V8HdM < 1 && y376iwm9dqvh0jucohx.H9XlUr4OeMJFiXK >= 1 && !s6gzzatp8xbv7ykddrkn.XiR1pIn5878vVWd) {
                y376iwm9dqvh0jucohx.KV57Z6oavcB595B8Dy8Z(hpS8WYFILXNWmicJ1zE);
                y376iwm9dqvh0jucohx.gwqvW1YsHBmGtO8bW7F(hpS8WYFILXNWmicJ1zE, 1, 0, 0, false);
            }
        }
        if (z5 && (bf7HAFpIKfIPl3 == null || bf7HAFpIKfIPl3.JXn4Qf7zpnLjP5 == null)) {
            if (bf7HAFpIKfIPl3 == null) {
                bf7HAFpIKfIPl3 = new Bf7HAFpIKfIPl2();
                sparseArray.put(i, bf7HAFpIKfIPl3);
            }
            bf7HAFpIKfIPl3.JXn4Qf7zpnLjP5 = hpS8WYFILXNWmicJ1zE;
            bf7HAFpIKfIPl3.Ee8d2j4S9Vm5yGuR = z;
        }
        if (z2 || !z4 || bf7HAFpIKfIPl3 == null || bf7HAFpIKfIPl3.dDIMxZXP1V8HdM != hpS8WYFILXNWmicJ1zE) {
            return;
        }
        bf7HAFpIKfIPl3.dDIMxZXP1V8HdM = null;
    }

    public static TransitionSet ibVTtJUNfrGYbW(wLs7ypyhWiPv wls7ypyhwipv, Transition transition, Transition transition2, TransitionSet transitionSet, HpS8WYFILXNWmicJ1zE hpS8WYFILXNWmicJ1zE) {
        TransitionSet transitionSet2 = new TransitionSet();
        if (transition2 != null) {
            transitionSet2.addTransition(transition2);
        }
        if (transition != null) {
            transitionSet2.addTransition(transition);
        }
        if (transitionSet != null) {
            transitionSet2.addTransition(transitionSet);
        }
        return transitionSet2;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x028f A[LOOP:7: B:120:0x028d->B:121:0x028f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:124:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:126:0x02f5 A[PHI: r5
      0x02f5: PHI (r5v22 java.lang.String) = (r5v14 java.lang.String), (r5v15 java.lang.String) binds: [B:125:0x02f3, B:223:0x02f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:127:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:129:0x0307  */
    /* JADX WARN: Code duplicated, block: B:132:0x031d A[LOOP:9: B:128:0x0305->B:132:0x031d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:150:0x037c  */
    /* JADX WARN: Code duplicated, block: B:161:0x039d  */
    /* JADX WARN: Code duplicated, block: B:183:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:223:0x02f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0313 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0178  */
    /* JADX WARN: Code duplicated, block: B:73:0x0197  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v9, types: [java.lang.Throwable] */
    public static void pyu8ovAipBTLYAiKab(y376IWm9dQvh0JucoHX y376iwm9dqvh0jucohx, ArrayList arrayList, ArrayList arrayList2, int i, int i2, boolean z) {
        SparseArray sparseArray;
        int i3;
        int i4;
        HpS8WYFILXNWmicJ1zE hpS8WYFILXNWmicJ1zE;
        HpS8WYFILXNWmicJ1zE hpS8WYFILXNWmicJ1zE2;
        wLs7ypyhWiPv wls7ypyhwipvJXn4Qf7zpnLjP5;
        Object obj;
        Transition transitionClone;
        sQnYZADWHPzbB sqnyzadwhpzbb;
        Object obj2;
        Transition transitionClone2;
        sQnYZADWHPzbB sqnyzadwhpzbb2;
        TransitionSet transitionSet;
        boolean z2;
        int i5;
        HpS8WYFILXNWmicJ1zE hpS8WYFILXNWmicJ1zE3;
        HpS8WYFILXNWmicJ1zE hpS8WYFILXNWmicJ1zE4;
        wLs7ypyhWiPv wls7ypyhwipvJXn4Qf7zpnLjP6;
        Object obj3;
        Transition transitionClone3;
        sQnYZADWHPzbB sqnyzadwhpzbb3;
        Object obj4;
        Transition transitionClone4;
        sQnYZADWHPzbB sqnyzadwhpzbb4;
        ArrayList arrayListEe8d2j4S9Vm5yGuR;
        ArrayList arrayList3;
        int size;
        int i6;
        String str;
        int size2;
        ArrayList arrayList4;
        int i7;
        View view;
        String strHjneShqpF9Tis4;
        String str2;
        int i8;
        String str3;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7 = arrayList;
        ArrayList arrayList8 = arrayList2;
        int i9 = i2;
        boolean z3 = z;
        int i10 = 1;
        if (y376iwm9dqvh0jucohx.H9XlUr4OeMJFiXK < 1) {
            return;
        }
        SparseArray sparseArray2 = new SparseArray();
        for (int i11 = i; i11 < i9; i11++) {
            s6GzzATP8xbv7YKDDrkn s6gzzatp8xbv7ykddrkn = (s6GzzATP8xbv7YKDDrkn) arrayList7.get(i11);
            if (((Boolean) arrayList8.get(i11)).booleanValue()) {
                y376IWm9dQvh0JucoHX y376iwm9dqvh0jucohx2 = s6gzzatp8xbv7ykddrkn.dDIMxZXP1V8HdM;
                ArrayList arrayList9 = s6gzzatp8xbv7ykddrkn.w9sT1Swbhx3hs;
                if (y376iwm9dqvh0jucohx2.l1V0lQr6TbwNKqHfXNbb.H9XlUr4OeMJFiXK()) {
                    for (int size3 = arrayList9.size() - 1; size3 >= 0; size3--) {
                        dDIMxZXP1V8HdM(s6gzzatp8xbv7ykddrkn, (bDLizfK87pPvhTehh1Z) arrayList9.get(size3), sparseArray2, true, z3);
                    }
                }
            } else {
                int size4 = s6gzzatp8xbv7ykddrkn.w9sT1Swbhx3hs.size();
                for (int i12 = 0; i12 < size4; i12++) {
                    dDIMxZXP1V8HdM(s6gzzatp8xbv7ykddrkn, (bDLizfK87pPvhTehh1Z) s6gzzatp8xbv7ykddrkn.w9sT1Swbhx3hs.get(i12), sparseArray2, false, z3);
                }
            }
        }
        if (sparseArray2.size() != 0) {
            View view2 = new View(y376iwm9dqvh0jucohx.DVTNwpDEVsUKuznof.xDyLpEZyrcKVe0);
            int size5 = sparseArray2.size();
            int i13 = 0;
            while (i13 < size5) {
                int iKeyAt = sparseArray2.keyAt(i13);
                Sn2d19yOBfyV0rw sn2d19yOBfyV0rw = new Sn2d19yOBfyV0rw();
                int i14 = i9 - 1;
                while (i14 >= i) {
                    s6GzzATP8xbv7YKDDrkn s6gzzatp8xbv7ykddrkn2 = (s6GzzATP8xbv7YKDDrkn) arrayList7.get(i14);
                    int i15 = i10;
                    ArrayList arrayList10 = s6gzzatp8xbv7ykddrkn2.w9sT1Swbhx3hs;
                    int size6 = arrayList10.size();
                    int i16 = 0;
                    while (i16 < size6) {
                        int i17 = i16;
                        HpS8WYFILXNWmicJ1zE hpS8WYFILXNWmicJ1zE5 = ((bDLizfK87pPvhTehh1Z) arrayList10.get(i16)).w9sT1Swbhx3hs;
                        int i18 = hpS8WYFILXNWmicJ1zE5 != null ? hpS8WYFILXNWmicJ1zE5.dTS0S7eC32ubQH54j36 : 0;
                        if (i18 != 0 && i18 == iKeyAt) {
                            boolean zBooleanValue = ((Boolean) arrayList8.get(i14)).booleanValue();
                            ArrayList arrayList11 = s6gzzatp8xbv7ykddrkn2.J0zjQ7CAgohuxU20eCW6;
                            if (arrayList11 == null) {
                                break;
                            }
                            int size7 = arrayList11.size();
                            if (zBooleanValue) {
                                arrayList6 = s6gzzatp8xbv7ykddrkn2.J0zjQ7CAgohuxU20eCW6;
                                arrayList5 = s6gzzatp8xbv7ykddrkn2.MLSIo1htfMPWeB8V876L;
                            } else {
                                arrayList5 = s6gzzatp8xbv7ykddrkn2.J0zjQ7CAgohuxU20eCW6;
                                arrayList6 = s6gzzatp8xbv7ykddrkn2.MLSIo1htfMPWeB8V876L;
                            }
                            int i19 = 0;
                            while (i19 < size7) {
                                String str4 = (String) arrayList5.get(i19);
                                ArrayList arrayList12 = arrayList6;
                                String str5 = (String) arrayList6.get(i19);
                                String str6 = (String) sn2d19yOBfyV0rw.remove(str5);
                                if (str6 != null) {
                                    sn2d19yOBfyV0rw.put(str4, str6);
                                } else {
                                    sn2d19yOBfyV0rw.put(str4, str5);
                                }
                                i19++;
                                arrayList6 = arrayList12;
                            }
                            break;
                        }
                        i16 = i17 + 1;
                        arrayList8 = arrayList2;
                    }
                    i14--;
                    arrayList7 = arrayList;
                    arrayList8 = arrayList2;
                    i10 = i15;
                }
                int i20 = i10;
                Bf7HAFpIKfIPl2 bf7HAFpIKfIPl2 = (Bf7HAFpIKfIPl2) sparseArray2.valueAt(i13);
                if (z3) {
                    ViewGroup viewGroup = y376iwm9dqvh0jucohx.l1V0lQr6TbwNKqHfXNbb.H9XlUr4OeMJFiXK() ? (ViewGroup) y376iwm9dqvh0jucohx.l1V0lQr6TbwNKqHfXNbb.XiR1pIn5878vVWd(iKeyAt) : null;
                    if (viewGroup == null || (wls7ypyhwipvJXn4Qf7zpnLjP6 = JXn4Qf7zpnLjP5((hpS8WYFILXNWmicJ1zE4 = bf7HAFpIKfIPl2.JXn4Qf7zpnLjP5), (hpS8WYFILXNWmicJ1zE3 = bf7HAFpIKfIPl2.dDIMxZXP1V8HdM))) == null) {
                        sparseArray = sparseArray2;
                        i3 = size5;
                    } else {
                        boolean z4 = bf7HAFpIKfIPl2.w9sT1Swbhx3hs;
                        boolean z5 = bf7HAFpIKfIPl2.Ee8d2j4S9Vm5yGuR;
                        ArrayList arrayList13 = new ArrayList();
                        ArrayList arrayList14 = new ArrayList();
                        if (hpS8WYFILXNWmicJ1zE3 != null) {
                            if (!z4 || (sqnyzadwhpzbb3 = hpS8WYFILXNWmicJ1zE3.iUQk66nAiXgO35) == null || (obj3 = sqnyzadwhpzbb3.ibVTtJUNfrGYbW) == HpS8WYFILXNWmicJ1zE.qfTrc75xwRVMl85vh) {
                                obj3 = null;
                            }
                            if (obj3 != null) {
                                transitionClone3 = ((Transition) obj3).clone();
                            } else {
                                transitionClone3 = null;
                            }
                        } else {
                            transitionClone3 = null;
                        }
                        if (hpS8WYFILXNWmicJ1zE4 != null) {
                            if (!z5 || (sqnyzadwhpzbb4 = hpS8WYFILXNWmicJ1zE4.iUQk66nAiXgO35) == null || (obj4 = sqnyzadwhpzbb4.xDyLpEZyrcKVe0) == HpS8WYFILXNWmicJ1zE.qfTrc75xwRVMl85vh) {
                                obj4 = null;
                            }
                            if (obj4 != null) {
                                transitionClone4 = ((Transition) obj4).clone();
                            } else {
                                transitionClone4 = null;
                            }
                        } else {
                            transitionClone4 = null;
                        }
                        HpS8WYFILXNWmicJ1zE hpS8WYFILXNWmicJ1zE6 = bf7HAFpIKfIPl2.dDIMxZXP1V8HdM;
                        sparseArray = sparseArray2;
                        HpS8WYFILXNWmicJ1zE hpS8WYFILXNWmicJ1zE7 = bf7HAFpIKfIPl2.JXn4Qf7zpnLjP5;
                        if (hpS8WYFILXNWmicJ1zE6 != null) {
                            throw null;
                        }
                        if (hpS8WYFILXNWmicJ1zE6 == null || hpS8WYFILXNWmicJ1zE7 == null) {
                            i3 = size5;
                        } else {
                            i3 = size5;
                            boolean z6 = bf7HAFpIKfIPl2.w9sT1Swbhx3hs;
                            TransitionSet transitionSetXDyLpEZyrcKVe0 = sn2d19yOBfyV0rw.isEmpty() ? null : xDyLpEZyrcKVe0(hpS8WYFILXNWmicJ1zE6, hpS8WYFILXNWmicJ1zE7, z6);
                            vekpFI4d1Nc4fakF(sn2d19yOBfyV0rw, transitionSetXDyLpEZyrcKVe0, bf7HAFpIKfIPl2);
                            w9sT1Swbhx3hs(sn2d19yOBfyV0rw, transitionSetXDyLpEZyrcKVe0, bf7HAFpIKfIPl2);
                            if (!sn2d19yOBfyV0rw.isEmpty()) {
                                Set setKeySet = sn2d19yOBfyV0rw.keySet();
                                O162WzpEtUgucWBV o162WzpEtUgucWBV = null;
                                int i21 = o162WzpEtUgucWBV.JXn4Qf7zpnLjP5 - 1;
                                while (i21 >= 0) {
                                    View view3 = (View) o162WzpEtUgucWBV.ibVTtJUNfrGYbW(i21);
                                    int i22 = tg6EjdKQH74QUty.dDIMxZXP1V8HdM;
                                    if (setKeySet.contains(u9IBFWnIoP0MgX8BmWO.hjneShqpF9Tis4(view3))) {
                                        arrayList14.add(view3);
                                    }
                                    i21--;
                                    o162WzpEtUgucWBV = null;
                                }
                                throw o162WzpEtUgucWBV;
                            }
                            if (transitionClone3 != null || transitionClone4 != null) {
                                s9ii0A4dnO6stgtFpy.dDIMxZXP1V8HdM(viewGroup, new ANRnCX6eNIDLxM1T0g(hpS8WYFILXNWmicJ1zE6, hpS8WYFILXNWmicJ1zE7, z6, null, null, wls7ypyhwipvJXn4Qf7zpnLjP6, null));
                            }
                            if (transitionClone3 == null || transitionClone4 != null) {
                                arrayListEe8d2j4S9Vm5yGuR = Ee8d2j4S9Vm5yGuR(transitionClone4, hpS8WYFILXNWmicJ1zE4, arrayList14, view2);
                                ArrayList arrayListEe8d2j4S9Vm5yGuR2 = Ee8d2j4S9Vm5yGuR(transitionClone3, hpS8WYFILXNWmicJ1zE3, arrayList13, view2);
                                b1EoSIRjJHO5(arrayListEe8d2j4S9Vm5yGuR2, 4);
                                TransitionSet transitionSetIbVTtJUNfrGYbW = ibVTtJUNfrGYbW(wls7ypyhwipvJXn4Qf7zpnLjP6, transitionClone3, transitionClone4, 0, hpS8WYFILXNWmicJ1zE3);
                                if (hpS8WYFILXNWmicJ1zE4 != null && transitionClone4 != null && hpS8WYFILXNWmicJ1zE4.D5P1xCAyuvgF && hpS8WYFILXNWmicJ1zE4.yTljMGnIibTRdOpSh4 && hpS8WYFILXNWmicJ1zE4.XuO9PPFo607ssKwZjNW) {
                                    hpS8WYFILXNWmicJ1zE4.vekpFI4d1Nc4fakF().getClass();
                                    transitionClone4.addListener(new lOWEgjl1OxPPTbGVE451());
                                    s9ii0A4dnO6stgtFpy.dDIMxZXP1V8HdM(hpS8WYFILXNWmicJ1zE4.tne6mXOUFKdd, new YqOiSVb2wSv9Lq63qb(2, arrayListEe8d2j4S9Vm5yGuR));
                                }
                                arrayList3 = new ArrayList();
                                size = arrayList13.size();
                                i6 = 0;
                                while (i6 < size) {
                                    Transition transition = transitionClone3;
                                    View view4 = (View) arrayList13.get(i6);
                                    int i23 = tg6EjdKQH74QUty.dDIMxZXP1V8HdM;
                                    arrayList3.add(u9IBFWnIoP0MgX8BmWO.hjneShqpF9Tis4(view4));
                                    u9IBFWnIoP0MgX8BmWO.l1V0lQr6TbwNKqHfXNbb(view4, null);
                                    i6++;
                                    transitionClone3 = transition;
                                    wls7ypyhwipvJXn4Qf7zpnLjP6 = wls7ypyhwipvJXn4Qf7zpnLjP6;
                                }
                                wLs7ypyhWiPv wls7ypyhwipv = wls7ypyhwipvJXn4Qf7zpnLjP6;
                                str = null;
                                transitionSetIbVTtJUNfrGYbW.addListener((Transition.TransitionListener) new jElpf95ipPKNat(wls7ypyhwipv, transitionClone3, arrayListEe8d2j4S9Vm5yGuR2, transitionClone4, arrayListEe8d2j4S9Vm5yGuR, null, arrayList13));
                                TransitionManager.beginDelayedTransition(viewGroup, transitionSetIbVTtJUNfrGYbW);
                                size2 = arrayList13.size();
                                arrayList4 = new ArrayList();
                                i7 = 0;
                                while (i7 < size2) {
                                    view = (View) arrayList14.get(i7);
                                    int i24 = tg6EjdKQH74QUty.dDIMxZXP1V8HdM;
                                    strHjneShqpF9Tis4 = u9IBFWnIoP0MgX8BmWO.hjneShqpF9Tis4(view);
                                    arrayList4.add(strHjneShqpF9Tis4);
                                    if (strHjneShqpF9Tis4 == null) {
                                        str3 = str;
                                        break;
                                    }
                                    u9IBFWnIoP0MgX8BmWO.l1V0lQr6TbwNKqHfXNbb(view, str);
                                    str2 = (String) sn2d19yOBfyV0rw.get(strHjneShqpF9Tis4);
                                    i8 = 0;
                                    while (true) {
                                        if (i8 < size2) {
                                            str3 = str;
                                            break;
                                            break;
                                        }
                                        str3 = str;
                                        if (str2.equals(arrayList3.get(i8))) {
                                            u9IBFWnIoP0MgX8BmWO.l1V0lQr6TbwNKqHfXNbb((View) arrayList13.get(i8), strHjneShqpF9Tis4);
                                            break;
                                        } else {
                                            i8++;
                                            str = str3;
                                        }
                                    }
                                    i7++;
                                    str = str3;
                                }
                                s9ii0A4dnO6stgtFpy.dDIMxZXP1V8HdM(viewGroup, new jdCLwLRpmACj3In(size2, arrayList13, arrayList3, arrayList14, arrayList4));
                                b1EoSIRjJHO5(arrayListEe8d2j4S9Vm5yGuR2, 0);
                            }
                            i4 = i13;
                        }
                        if (transitionClone3 == null) {
                        }
                        arrayListEe8d2j4S9Vm5yGuR = Ee8d2j4S9Vm5yGuR(transitionClone4, hpS8WYFILXNWmicJ1zE4, arrayList14, view2);
                        ArrayList arrayListEe8d2j4S9Vm5yGuR3 = Ee8d2j4S9Vm5yGuR(transitionClone3, hpS8WYFILXNWmicJ1zE3, arrayList13, view2);
                        b1EoSIRjJHO5(arrayListEe8d2j4S9Vm5yGuR3, 4);
                        TransitionSet transitionSetIbVTtJUNfrGYbW2 = ibVTtJUNfrGYbW(wls7ypyhwipvJXn4Qf7zpnLjP6, transitionClone3, transitionClone4, 0, hpS8WYFILXNWmicJ1zE3);
                        if (hpS8WYFILXNWmicJ1zE4 != null) {
                            hpS8WYFILXNWmicJ1zE4.vekpFI4d1Nc4fakF().getClass();
                            transitionClone4.addListener(new lOWEgjl1OxPPTbGVE451());
                            s9ii0A4dnO6stgtFpy.dDIMxZXP1V8HdM(hpS8WYFILXNWmicJ1zE4.tne6mXOUFKdd, new YqOiSVb2wSv9Lq63qb(2, arrayListEe8d2j4S9Vm5yGuR));
                        }
                        arrayList3 = new ArrayList();
                        size = arrayList13.size();
                        i6 = 0;
                        while (i6 < size) {
                            Transition transition2 = transitionClone3;
                            View view5 = (View) arrayList13.get(i6);
                            int i25 = tg6EjdKQH74QUty.dDIMxZXP1V8HdM;
                            arrayList3.add(u9IBFWnIoP0MgX8BmWO.hjneShqpF9Tis4(view5));
                            u9IBFWnIoP0MgX8BmWO.l1V0lQr6TbwNKqHfXNbb(view5, null);
                            i6++;
                            transitionClone3 = transition2;
                            wls7ypyhwipvJXn4Qf7zpnLjP6 = wls7ypyhwipvJXn4Qf7zpnLjP6;
                        }
                        wLs7ypyhWiPv wls7ypyhwipv2 = wls7ypyhwipvJXn4Qf7zpnLjP6;
                        str = null;
                        transitionSetIbVTtJUNfrGYbW2.addListener((Transition.TransitionListener) new jElpf95ipPKNat(wls7ypyhwipv2, transitionClone3, arrayListEe8d2j4S9Vm5yGuR3, transitionClone4, arrayListEe8d2j4S9Vm5yGuR, null, arrayList13));
                        TransitionManager.beginDelayedTransition(viewGroup, transitionSetIbVTtJUNfrGYbW2);
                        size2 = arrayList13.size();
                        arrayList4 = new ArrayList();
                        i7 = 0;
                        while (i7 < size2) {
                            view = (View) arrayList14.get(i7);
                            int i26 = tg6EjdKQH74QUty.dDIMxZXP1V8HdM;
                            strHjneShqpF9Tis4 = u9IBFWnIoP0MgX8BmWO.hjneShqpF9Tis4(view);
                            arrayList4.add(strHjneShqpF9Tis4);
                            if (strHjneShqpF9Tis4 == null) {
                                str3 = str;
                                break;
                                break;
                            }
                            u9IBFWnIoP0MgX8BmWO.l1V0lQr6TbwNKqHfXNbb(view, str);
                            str2 = (String) sn2d19yOBfyV0rw.get(strHjneShqpF9Tis4);
                            i8 = 0;
                            while (true) {
                                if (i8 < size2) {
                                    str3 = str;
                                    break;
                                    break;
                                }
                                str3 = str;
                                if (str2.equals(arrayList3.get(i8))) {
                                    u9IBFWnIoP0MgX8BmWO.l1V0lQr6TbwNKqHfXNbb((View) arrayList13.get(i8), strHjneShqpF9Tis4);
                                    break;
                                    break;
                                } else {
                                    i8++;
                                    str = str3;
                                }
                            }
                            i7++;
                            str = str3;
                        }
                        s9ii0A4dnO6stgtFpy.dDIMxZXP1V8HdM(viewGroup, new jdCLwLRpmACj3In(size2, arrayList13, arrayList3, arrayList14, arrayList4));
                        b1EoSIRjJHO5(arrayListEe8d2j4S9Vm5yGuR3, 0);
                        i4 = i13;
                    }
                    i4 = i13;
                } else {
                    sparseArray = sparseArray2;
                    i3 = size5;
                    i4 = i13;
                    ViewGroup viewGroup2 = y376iwm9dqvh0jucohx.l1V0lQr6TbwNKqHfXNbb.H9XlUr4OeMJFiXK() ? (ViewGroup) y376iwm9dqvh0jucohx.l1V0lQr6TbwNKqHfXNbb.XiR1pIn5878vVWd(iKeyAt) : null;
                    if (viewGroup2 == null || (wls7ypyhwipvJXn4Qf7zpnLjP5 = JXn4Qf7zpnLjP5((hpS8WYFILXNWmicJ1zE2 = bf7HAFpIKfIPl2.JXn4Qf7zpnLjP5), (hpS8WYFILXNWmicJ1zE = bf7HAFpIKfIPl2.dDIMxZXP1V8HdM))) == null) {
                        i4 = i4;
                    } else {
                        boolean z7 = bf7HAFpIKfIPl2.w9sT1Swbhx3hs;
                        boolean z8 = bf7HAFpIKfIPl2.Ee8d2j4S9Vm5yGuR;
                        if (hpS8WYFILXNWmicJ1zE != null) {
                            if (!z7 || (sqnyzadwhpzbb = hpS8WYFILXNWmicJ1zE.iUQk66nAiXgO35) == null || (obj = sqnyzadwhpzbb.ibVTtJUNfrGYbW) == HpS8WYFILXNWmicJ1zE.qfTrc75xwRVMl85vh) {
                                obj = null;
                            }
                            if (obj != null) {
                                transitionClone = ((Transition) obj).clone();
                            } else {
                                transitionClone = null;
                            }
                        } else {
                            transitionClone = null;
                        }
                        if (hpS8WYFILXNWmicJ1zE2 != null) {
                            if (!z8 || (sqnyzadwhpzbb2 = hpS8WYFILXNWmicJ1zE2.iUQk66nAiXgO35) == null || (obj2 = sqnyzadwhpzbb2.xDyLpEZyrcKVe0) == HpS8WYFILXNWmicJ1zE.qfTrc75xwRVMl85vh) {
                                obj2 = null;
                            }
                            if (obj2 != null) {
                                transitionClone2 = ((Transition) obj2).clone();
                            } else {
                                transitionClone2 = null;
                            }
                        } else {
                            transitionClone2 = null;
                        }
                        ArrayList arrayList15 = new ArrayList();
                        ArrayList arrayList16 = new ArrayList();
                        HpS8WYFILXNWmicJ1zE hpS8WYFILXNWmicJ1zE8 = bf7HAFpIKfIPl2.dDIMxZXP1V8HdM;
                        HpS8WYFILXNWmicJ1zE hpS8WYFILXNWmicJ1zE9 = bf7HAFpIKfIPl2.JXn4Qf7zpnLjP5;
                        if (hpS8WYFILXNWmicJ1zE8 == null || hpS8WYFILXNWmicJ1zE9 == null) {
                            transitionSet = null;
                        } else {
                            boolean z9 = bf7HAFpIKfIPl2.w9sT1Swbhx3hs;
                            vekpFI4d1Nc4fakF(sn2d19yOBfyV0rw, sn2d19yOBfyV0rw.isEmpty() ? null : xDyLpEZyrcKVe0(hpS8WYFILXNWmicJ1zE8, hpS8WYFILXNWmicJ1zE9, z9), bf7HAFpIKfIPl2);
                            if (!sn2d19yOBfyV0rw.isEmpty()) {
                                throw null;
                            }
                            if (transitionClone == null && transitionClone2 == null) {
                                transitionSet = null;
                            } else {
                                View view6 = view2;
                                ERLOVgHI5kyglIQbb eRLOVgHI5kyglIQbb = new ERLOVgHI5kyglIQbb(wls7ypyhwipvJXn4Qf7zpnLjP5, sn2d19yOBfyV0rw, null, bf7HAFpIKfIPl2, arrayList16, view6, hpS8WYFILXNWmicJ1zE8, hpS8WYFILXNWmicJ1zE9, z9, arrayList15, transitionClone, null);
                                transitionSet = null;
                                view2 = view6;
                                s9ii0A4dnO6stgtFpy.dDIMxZXP1V8HdM(viewGroup2, eRLOVgHI5kyglIQbb);
                            }
                        }
                        if (transitionClone != 0 || transitionClone2 != null) {
                            ArrayList arrayListEe8d2j4S9Vm5yGuR4 = Ee8d2j4S9Vm5yGuR(transitionClone2, hpS8WYFILXNWmicJ1zE2, arrayList15, view2);
                            if (arrayListEe8d2j4S9Vm5yGuR4 == null || arrayListEe8d2j4S9Vm5yGuR4.isEmpty()) {
                                transitionClone2 = transitionSet;
                            }
                            if (transitionClone != 0) {
                                transitionClone.addTarget(view2);
                            }
                            TransitionSet transitionSetIbVTtJUNfrGYbW3 = ibVTtJUNfrGYbW(wls7ypyhwipvJXn4Qf7zpnLjP5, transitionClone, transitionClone2, transitionSet, hpS8WYFILXNWmicJ1zE);
                            ArrayList arrayList17 = new ArrayList();
                            Transition transition3 = transitionClone2;
                            Transition transition4 = transitionClone;
                            transitionSetIbVTtJUNfrGYbW3.addListener((Transition.TransitionListener) new jElpf95ipPKNat(wls7ypyhwipvJXn4Qf7zpnLjP5, transition4, arrayList17, transition3, arrayListEe8d2j4S9Vm5yGuR4, transitionSet, arrayList16));
                            s9ii0A4dnO6stgtFpy.dDIMxZXP1V8HdM(viewGroup2, new eerpp8UrI0o0y(transition4, wls7ypyhwipvJXn4Qf7zpnLjP5, view2, hpS8WYFILXNWmicJ1zE, arrayList16, arrayList17, arrayListEe8d2j4S9Vm5yGuR4, transition3));
                            z2 = false;
                            s9ii0A4dnO6stgtFpy.dDIMxZXP1V8HdM(viewGroup2, new jLkVFW6jYxnN(arrayList16, sn2d19yOBfyV0rw, 0));
                            TransitionManager.beginDelayedTransition(viewGroup2, transitionSetIbVTtJUNfrGYbW3);
                            i5 = i20;
                            s9ii0A4dnO6stgtFpy.dDIMxZXP1V8HdM(viewGroup2, new jLkVFW6jYxnN(arrayList16, sn2d19yOBfyV0rw, i5));
                        }
                        i13 = i4 + 1;
                        arrayList7 = arrayList;
                        arrayList8 = arrayList2;
                        i10 = i5;
                        sparseArray2 = sparseArray;
                        size5 = i3;
                        i9 = i2;
                        z3 = z;
                    }
                }
                i5 = i20;
                z2 = false;
                i13 = i4 + 1;
                arrayList7 = arrayList;
                arrayList8 = arrayList2;
                i10 = i5;
                sparseArray2 = sparseArray;
                size5 = i3;
                i9 = i2;
                z3 = z;
            }
        }
    }

    public static Sn2d19yOBfyV0rw vekpFI4d1Nc4fakF(Sn2d19yOBfyV0rw sn2d19yOBfyV0rw, TransitionSet transitionSet, Bf7HAFpIKfIPl2 bf7HAFpIKfIPl2) {
        if (sn2d19yOBfyV0rw.isEmpty() || transitionSet == null) {
            sn2d19yOBfyV0rw.clear();
            return null;
        }
        HpS8WYFILXNWmicJ1zE hpS8WYFILXNWmicJ1zE = bf7HAFpIKfIPl2.JXn4Qf7zpnLjP5;
        Sn2d19yOBfyV0rw sn2d19yOBfyV0rw2 = new Sn2d19yOBfyV0rw();
        hpS8WYFILXNWmicJ1zE.getClass();
        wLs7ypyhWiPv.w9sT1Swbhx3hs(sn2d19yOBfyV0rw2, null);
        throw null;
    }

    public static Sn2d19yOBfyV0rw w9sT1Swbhx3hs(Sn2d19yOBfyV0rw sn2d19yOBfyV0rw, Object obj, Bf7HAFpIKfIPl2 bf7HAFpIKfIPl2) {
        bf7HAFpIKfIPl2.dDIMxZXP1V8HdM.getClass();
        sn2d19yOBfyV0rw.clear();
        return null;
    }

    public static TransitionSet xDyLpEZyrcKVe0(HpS8WYFILXNWmicJ1zE hpS8WYFILXNWmicJ1zE, HpS8WYFILXNWmicJ1zE hpS8WYFILXNWmicJ1zE2, boolean z) {
        Object obj;
        sQnYZADWHPzbB sqnyzadwhpzbb;
        if (hpS8WYFILXNWmicJ1zE != null && hpS8WYFILXNWmicJ1zE2 != null) {
            if (!z || (sqnyzadwhpzbb = hpS8WYFILXNWmicJ1zE2.iUQk66nAiXgO35) == null || (obj = sqnyzadwhpzbb.b1EoSIRjJHO5) == HpS8WYFILXNWmicJ1zE.qfTrc75xwRVMl85vh) {
                obj = null;
            }
            Transition transitionClone = obj != null ? ((Transition) obj).clone() : null;
            if (transitionClone != null) {
                TransitionSet transitionSet = new TransitionSet();
                transitionSet.addTransition(transitionClone);
                return transitionSet;
            }
        }
        return null;
    }
}
