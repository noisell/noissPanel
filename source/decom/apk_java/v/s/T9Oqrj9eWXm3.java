package v.s;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class T9Oqrj9eWXm3 extends HT6Px2xDdrmDEbykyYy {
    public final int gmNWMfvn6zlEj;

    public T9Oqrj9eWXm3(int i, int i2) {
        String str;
        super(i);
        this.gmNWMfvn6zlEj = i2;
        if (i2 != 1) {
            if (i < 1) {
                throw new IllegalArgumentException(Y9mRyRdkl5FOcwb66V6.b1EoSIRjJHO5("Buffered channel capacity must be at least 1, but ", " was specified", i).toString());
            }
            return;
        }
        StringBuilder sb = new StringBuilder("This implementation does not support suspension for senders, use ");
        Q7ncPL8Ht3Jh70mWLfou.dDIMxZXP1V8HdM.getClass();
        LinkedHashMap linkedHashMap = NR9JYyosoI0WX.vekpFI4d1Nc4fakF;
        String simpleName = null;
        if (!HT6Px2xDdrmDEbykyYy.class.isAnonymousClass()) {
            if (HT6Px2xDdrmDEbykyYy.class.isLocalClass()) {
                simpleName = HT6Px2xDdrmDEbykyYy.class.getSimpleName();
                Method enclosingMethod = HT6Px2xDdrmDEbykyYy.class.getEnclosingMethod();
                if (enclosingMethod == null) {
                    Constructor<?> enclosingConstructor = HT6Px2xDdrmDEbykyYy.class.getEnclosingConstructor();
                    if (enclosingConstructor == null) {
                        int iJW3Lh9hxwLsO2ArTlH = KgSM0TsKUpCiuePB.JW3Lh9hxwLsO2ArTlH(simpleName, '$', 0, 6);
                        if (iJW3Lh9hxwLsO2ArTlH != -1) {
                            simpleName = simpleName.substring(iJW3Lh9hxwLsO2ArTlH + 1, simpleName.length());
                        }
                    } else {
                        simpleName = KgSM0TsKUpCiuePB.SggvLZZelD4B3v(simpleName, enclosingConstructor.getName() + '$');
                    }
                } else {
                    simpleName = KgSM0TsKUpCiuePB.SggvLZZelD4B3v(simpleName, enclosingMethod.getName() + '$');
                }
            } else if (HT6Px2xDdrmDEbykyYy.class.isArray()) {
                Class<?> componentType = HT6Px2xDdrmDEbykyYy.class.getComponentType();
                if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                    simpleName = str.concat("Array");
                }
                if (simpleName == null) {
                    simpleName = "Array";
                }
            } else {
                simpleName = (String) linkedHashMap.get(HT6Px2xDdrmDEbykyYy.class.getName());
                if (simpleName == null) {
                    simpleName = HT6Px2xDdrmDEbykyYy.class.getSimpleName();
                }
            }
        }
        throw new IllegalArgumentException(Y9mRyRdkl5FOcwb66V6.D5P1xCAyuvgF(sb, simpleName, " instead").toString());
    }

    @Override // v.s.HT6Px2xDdrmDEbykyYy
    public final boolean DVTNwpDEVsUKuznof() {
        return this.gmNWMfvn6zlEj == 2;
    }

    public final Object ECwLkmPW1UKz7J6E(Object obj, boolean z) {
        Eo0e0FTdv96U7KeCzoB eo0e0FTdv96U7KeCzoB = Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
        if (this.gmNWMfvn6zlEj == 3) {
            Object objPyu8ovAipBTLYAiKab = super.pyu8ovAipBTLYAiKab(obj);
            return (!(objPyu8ovAipBTLYAiKab instanceof BuBD1pdyBtuGt0z) || (objPyu8ovAipBTLYAiKab instanceof Jdyt6TPRBOj1K9aOy91D)) ? objPyu8ovAipBTLYAiKab : eo0e0FTdv96U7KeCzoB;
        }
        Object obj2 = LYgmvfM6ccmccA0DV.JXn4Qf7zpnLjP5;
        J4oFIJEn5DDil2 j4oFIJEn5DDil2 = (J4oFIJEn5DDil2) HT6Px2xDdrmDEbykyYy.ibVTtJUNfrGYbW.get(this);
        while (true) {
            long andIncrement = HT6Px2xDdrmDEbykyYy.vekpFI4d1Nc4fakF.getAndIncrement(this);
            long j = 1152921504606846975L & andIncrement;
            boolean zXiR1pIn5878vVWd = XiR1pIn5878vVWd(andIncrement, false);
            int i = LYgmvfM6ccmccA0DV.w9sT1Swbhx3hs;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (j4oFIJEn5DDil2.JXn4Qf7zpnLjP5 != j3) {
                J4oFIJEn5DDil2 j4oFIJEn5DDil2DDIMxZXP1V8HdM = HT6Px2xDdrmDEbykyYy.dDIMxZXP1V8HdM(this, j3, j4oFIJEn5DDil2);
                if (j4oFIJEn5DDil2DDIMxZXP1V8HdM != null) {
                    j4oFIJEn5DDil2 = j4oFIJEn5DDil2DDIMxZXP1V8HdM;
                } else if (zXiR1pIn5878vVWd) {
                    return new Jdyt6TPRBOj1K9aOy91D(nQilHWaqS401ZtR());
                }
            }
            int iEe8d2j4S9Vm5yGuR = HT6Px2xDdrmDEbykyYy.Ee8d2j4S9Vm5yGuR(this, j4oFIJEn5DDil2, i2, obj, j, obj2, zXiR1pIn5878vVWd);
            if (iEe8d2j4S9Vm5yGuR == 0) {
                j4oFIJEn5DDil2.dDIMxZXP1V8HdM();
                return eo0e0FTdv96U7KeCzoB;
            }
            if (iEe8d2j4S9Vm5yGuR != 1) {
                if (iEe8d2j4S9Vm5yGuR != 2) {
                    if (iEe8d2j4S9Vm5yGuR == 3) {
                        throw new IllegalStateException("unexpected");
                    }
                    if (iEe8d2j4S9Vm5yGuR == 4) {
                        if (j < HT6Px2xDdrmDEbykyYy.JXn4Qf7zpnLjP5.get(this)) {
                            j4oFIJEn5DDil2.dDIMxZXP1V8HdM();
                        }
                        return new Jdyt6TPRBOj1K9aOy91D(nQilHWaqS401ZtR());
                    }
                    if (iEe8d2j4S9Vm5yGuR == 5) {
                        j4oFIJEn5DDil2.dDIMxZXP1V8HdM();
                    }
                } else {
                    if (zXiR1pIn5878vVWd) {
                        j4oFIJEn5DDil2.b1EoSIRjJHO5();
                        return new Jdyt6TPRBOj1K9aOy91D(nQilHWaqS401ZtR());
                    }
                    S1QQVRz2bJQ7 s1QQVRz2bJQ7 = obj2 instanceof S1QQVRz2bJQ7 ? (S1QQVRz2bJQ7) obj2 : null;
                    if (s1QQVRz2bJQ7 != null) {
                        s1QQVRz2bJQ7.dDIMxZXP1V8HdM(j4oFIJEn5DDil2, i2 + i);
                    }
                    gmNWMfvn6zlEj((j4oFIJEn5DDil2.JXn4Qf7zpnLjP5 * j2) + ((long) i2));
                }
            }
            return eo0e0FTdv96U7KeCzoB;
        }
    }

    @Override // v.s.HT6Px2xDdrmDEbykyYy, v.s.UDr2ORhCq7XyGYjS5
    public final Object hjneShqpF9Tis4(GoFryeNz7Rqaz7fcxHnt goFryeNz7Rqaz7fcxHnt, vJpP6RThpasAD vjpp6rthpasad) throws Throwable {
        if (ECwLkmPW1UKz7J6E(goFryeNz7Rqaz7fcxHnt, true) instanceof Jdyt6TPRBOj1K9aOy91D) {
            throw nQilHWaqS401ZtR();
        }
        return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
    }

    @Override // v.s.HT6Px2xDdrmDEbykyYy, v.s.UDr2ORhCq7XyGYjS5
    public final Object pyu8ovAipBTLYAiKab(Object obj) {
        return ECwLkmPW1UKz7J6E(obj, false);
    }
}
