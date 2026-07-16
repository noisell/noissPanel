package v.s;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class O162WzpEtUgucWBV {
    public static Object[] Ee8d2j4S9Vm5yGuR;
    public static int b1EoSIRjJHO5;
    public static Object[] ibVTtJUNfrGYbW;
    public static int xDyLpEZyrcKVe0;
    public int[] w9sT1Swbhx3hs = FZ1sl4mHq4J0hOEYC.dDIMxZXP1V8HdM;
    public Object[] vekpFI4d1Nc4fakF = FZ1sl4mHq4J0hOEYC.w9sT1Swbhx3hs;
    public int JXn4Qf7zpnLjP5 = 0;

    public static void w9sT1Swbhx3hs(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (Sn2d19yOBfyV0rw.class) {
                try {
                    if (b1EoSIRjJHO5 < 10) {
                        objArr[0] = ibVTtJUNfrGYbW;
                        objArr[1] = iArr;
                        for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                            objArr[i2] = null;
                        }
                        ibVTtJUNfrGYbW = objArr;
                        b1EoSIRjJHO5++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (iArr.length == 97 - 93) {
            synchronized (Sn2d19yOBfyV0rw.class) {
                try {
                    if (xDyLpEZyrcKVe0 < 10) {
                        objArr[0] = Ee8d2j4S9Vm5yGuR;
                        objArr[1] = iArr;
                        for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        Ee8d2j4S9Vm5yGuR = objArr;
                        xDyLpEZyrcKVe0++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final int Ee8d2j4S9Vm5yGuR(Object obj) {
        int i = this.JXn4Qf7zpnLjP5 * 2;
        Object[] objArr = this.vekpFI4d1Nc4fakF;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final int JXn4Qf7zpnLjP5() {
        int i = this.JXn4Qf7zpnLjP5;
        if (i == 0) {
            return -1;
        }
        try {
            int iEe8d2j4S9Vm5yGuR = FZ1sl4mHq4J0hOEYC.Ee8d2j4S9Vm5yGuR(this.w9sT1Swbhx3hs, i, 0);
            if (iEe8d2j4S9Vm5yGuR < 0 || this.vekpFI4d1Nc4fakF[iEe8d2j4S9Vm5yGuR << 1] == null) {
                return iEe8d2j4S9Vm5yGuR;
            }
            int i2 = iEe8d2j4S9Vm5yGuR + 1;
            while (i2 < i && this.w9sT1Swbhx3hs[i2] == 0) {
                if (this.vekpFI4d1Nc4fakF[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = iEe8d2j4S9Vm5yGuR - 1; i3 >= 0 && this.w9sT1Swbhx3hs[i3] == 0; i3--) {
                if (this.vekpFI4d1Nc4fakF[i3 << 1] == null) {
                    return i3;
                }
            }
            return ~i2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        int i = this.JXn4Qf7zpnLjP5;
        if (i > 0) {
            int[] iArr = this.w9sT1Swbhx3hs;
            Object[] objArr = this.vekpFI4d1Nc4fakF;
            this.w9sT1Swbhx3hs = FZ1sl4mHq4J0hOEYC.dDIMxZXP1V8HdM;
            this.vekpFI4d1Nc4fakF = FZ1sl4mHq4J0hOEYC.w9sT1Swbhx3hs;
            this.JXn4Qf7zpnLjP5 = 0;
            w9sT1Swbhx3hs(iArr, objArr, i);
        }
        if (this.JXn4Qf7zpnLjP5 > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return (obj == null ? JXn4Qf7zpnLjP5() : vekpFI4d1Nc4fakF(obj.hashCode(), obj)) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return Ee8d2j4S9Vm5yGuR(obj) >= 0;
    }

    public final void dDIMxZXP1V8HdM(int i) {
        if (i == (-52) + 60) {
            synchronized (Sn2d19yOBfyV0rw.class) {
                try {
                    Object[] objArr = ibVTtJUNfrGYbW;
                    if (objArr != null) {
                        this.vekpFI4d1Nc4fakF = objArr;
                        ibVTtJUNfrGYbW = (Object[]) objArr[0];
                        this.w9sT1Swbhx3hs = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        b1EoSIRjJHO5--;
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (i == 4) {
            synchronized (Sn2d19yOBfyV0rw.class) {
                try {
                    Object[] objArr2 = Ee8d2j4S9Vm5yGuR;
                    if (objArr2 != null) {
                        this.vekpFI4d1Nc4fakF = objArr2;
                        Ee8d2j4S9Vm5yGuR = (Object[]) objArr2[0];
                        this.w9sT1Swbhx3hs = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        xDyLpEZyrcKVe0--;
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.w9sT1Swbhx3hs = new int[i];
        this.vekpFI4d1Nc4fakF = new Object[i << 1];
    }

    public final boolean equals(Object obj) {
        int i;
        int i2;
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof O162WzpEtUgucWBV) {
                O162WzpEtUgucWBV o162WzpEtUgucWBV = (O162WzpEtUgucWBV) obj;
                if (this.JXn4Qf7zpnLjP5 == o162WzpEtUgucWBV.JXn4Qf7zpnLjP5) {
                    for (0; i2 < this.JXn4Qf7zpnLjP5; i2 + 1) {
                        Object obj2 = this.vekpFI4d1Nc4fakF[i2 << 1];
                        Object objIbVTtJUNfrGYbW = ibVTtJUNfrGYbW(i2);
                        Object obj3 = o162WzpEtUgucWBV.get(obj2);
                        if (objIbVTtJUNfrGYbW == null) {
                            i2 = (obj3 == null && o162WzpEtUgucWBV.containsKey(obj2)) ? i2 + 1 : 0;
                        } else if (objIbVTtJUNfrGYbW.equals(obj3)) {
                        }
                    }
                    return true;
                }
            } else if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.JXn4Qf7zpnLjP5 == map.size()) {
                    for (0; i < this.JXn4Qf7zpnLjP5; i + 1) {
                        Object obj4 = this.vekpFI4d1Nc4fakF[i << 1];
                        Object objIbVTtJUNfrGYbW2 = ibVTtJUNfrGYbW(i);
                        Object obj5 = map.get(obj4);
                        if (objIbVTtJUNfrGYbW2 == null) {
                            i = (obj5 == null && map.containsKey(obj4)) ? i + 1 : 0;
                        } else if (objIbVTtJUNfrGYbW2.equals(obj5)) {
                        }
                    }
                    return true;
                }
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object get(Object obj) {
        int iJXn4Qf7zpnLjP5 = obj == null ? JXn4Qf7zpnLjP5() : vekpFI4d1Nc4fakF(obj.hashCode(), obj);
        if (iJXn4Qf7zpnLjP5 >= 0) {
            return this.vekpFI4d1Nc4fakF[(iJXn4Qf7zpnLjP5 << 1) + 1];
        }
        return null;
    }

    public final int hashCode() {
        int[] iArr = this.w9sT1Swbhx3hs;
        Object[] objArr = this.vekpFI4d1Nc4fakF;
        int i = this.JXn4Qf7zpnLjP5;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public final Object ibVTtJUNfrGYbW(int i) {
        return this.vekpFI4d1Nc4fakF[(i << 1) + 1];
    }

    public final boolean isEmpty() {
        return this.JXn4Qf7zpnLjP5 <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i;
        int iVekpFI4d1Nc4fakF;
        int i2 = this.JXn4Qf7zpnLjP5;
        if (obj == null) {
            iVekpFI4d1Nc4fakF = JXn4Qf7zpnLjP5();
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iVekpFI4d1Nc4fakF = vekpFI4d1Nc4fakF(iHashCode, obj);
        }
        if (iVekpFI4d1Nc4fakF >= 0) {
            int i3 = (iVekpFI4d1Nc4fakF << 1) + 1;
            Object[] objArr = this.vekpFI4d1Nc4fakF;
            Object obj3 = objArr[i3];
            objArr[i3] = obj2;
            return obj3;
        }
        int i4 = ~iVekpFI4d1Nc4fakF;
        int[] iArr = this.w9sT1Swbhx3hs;
        if (i2 >= iArr.length) {
            int i5 = 59 - 51;
            if (i2 >= i5) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i5 = 4;
            }
            Object[] objArr2 = this.vekpFI4d1Nc4fakF;
            dDIMxZXP1V8HdM(i5);
            if (i2 != this.JXn4Qf7zpnLjP5) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.w9sT1Swbhx3hs;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.vekpFI4d1Nc4fakF, 0, objArr2.length);
            }
            w9sT1Swbhx3hs(iArr, objArr2, i2);
        }
        if (i4 < i2) {
            int[] iArr3 = this.w9sT1Swbhx3hs;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.vekpFI4d1Nc4fakF;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.JXn4Qf7zpnLjP5 - i4) << 1);
        }
        int i7 = this.JXn4Qf7zpnLjP5;
        if (i2 == i7) {
            int[] iArr4 = this.w9sT1Swbhx3hs;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.vekpFI4d1Nc4fakF;
                int i8 = i4 << 1;
                objArr4[i8] = obj;
                objArr4[i8 + 1] = obj2;
                this.JXn4Qf7zpnLjP5 = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object remove(Object obj) {
        int iJXn4Qf7zpnLjP5 = obj == null ? JXn4Qf7zpnLjP5() : vekpFI4d1Nc4fakF(obj.hashCode(), obj);
        if (iJXn4Qf7zpnLjP5 >= 0) {
            return xDyLpEZyrcKVe0(iJXn4Qf7zpnLjP5);
        }
        return null;
    }

    public final int size() {
        return this.JXn4Qf7zpnLjP5;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.JXn4Qf7zpnLjP5 * 28);
        sb.append('{');
        for (int i = 0; i < this.JXn4Qf7zpnLjP5; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.vekpFI4d1Nc4fakF[i << 1];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objIbVTtJUNfrGYbW = ibVTtJUNfrGYbW(i);
            if (objIbVTtJUNfrGYbW != this) {
                sb.append(objIbVTtJUNfrGYbW);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final int vekpFI4d1Nc4fakF(int i, Object obj) {
        int i2 = this.JXn4Qf7zpnLjP5;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iEe8d2j4S9Vm5yGuR = FZ1sl4mHq4J0hOEYC.Ee8d2j4S9Vm5yGuR(this.w9sT1Swbhx3hs, i2, i);
            if (iEe8d2j4S9Vm5yGuR < 0 || obj.equals(this.vekpFI4d1Nc4fakF[iEe8d2j4S9Vm5yGuR << 1])) {
                return iEe8d2j4S9Vm5yGuR;
            }
            int i3 = iEe8d2j4S9Vm5yGuR + 1;
            while (i3 < i2 && this.w9sT1Swbhx3hs[i3] == i) {
                if (obj.equals(this.vekpFI4d1Nc4fakF[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iEe8d2j4S9Vm5yGuR - 1; i4 >= 0 && this.w9sT1Swbhx3hs[i4] == i; i4--) {
                if (obj.equals(this.vekpFI4d1Nc4fakF[i4 << 1])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final Object xDyLpEZyrcKVe0(int i) {
        Object[] objArr = this.vekpFI4d1Nc4fakF;
        int i2 = i << 1;
        Object obj = objArr[i2 + 1];
        int i3 = this.JXn4Qf7zpnLjP5;
        int i4 = 0;
        if (i3 <= 1) {
            w9sT1Swbhx3hs(this.w9sT1Swbhx3hs, objArr, i3);
            this.w9sT1Swbhx3hs = FZ1sl4mHq4J0hOEYC.dDIMxZXP1V8HdM;
            this.vekpFI4d1Nc4fakF = FZ1sl4mHq4J0hOEYC.w9sT1Swbhx3hs;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.w9sT1Swbhx3hs;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i6 = i + 1;
                    int i7 = i5 - i;
                    System.arraycopy(iArr, i6, iArr, i, i7);
                    Object[] objArr2 = this.vekpFI4d1Nc4fakF;
                    System.arraycopy(objArr2, i6 << 1, objArr2, i2, i7 << 1);
                }
                Object[] objArr3 = this.vekpFI4d1Nc4fakF;
                int i8 = i5 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            } else {
                dDIMxZXP1V8HdM(i3 > 8 ? i3 + (i3 >> 1) : 8);
                if (i3 != this.JXn4Qf7zpnLjP5) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.w9sT1Swbhx3hs, 0, i);
                    System.arraycopy(objArr, 0, this.vekpFI4d1Nc4fakF, 0, i2);
                }
                if (i < i5) {
                    int i9 = i + 1;
                    int i10 = i5 - i;
                    System.arraycopy(iArr, i9, this.w9sT1Swbhx3hs, i, i10);
                    System.arraycopy(objArr, i9 << 1, this.vekpFI4d1Nc4fakF, i2, i10 << 1);
                }
            }
            i4 = i5;
        }
        if (i3 != this.JXn4Qf7zpnLjP5) {
            throw new ConcurrentModificationException();
        }
        this.JXn4Qf7zpnLjP5 = i4;
        return obj;
    }
}
