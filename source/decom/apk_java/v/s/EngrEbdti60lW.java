package v.s;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class EngrEbdti60lW implements Collection, Set {
    public static Object[] D5P1xCAyuvgF;
    public static Object[] b1EoSIRjJHO5;
    public static int hjneShqpF9Tis4;
    public static int pyu8ovAipBTLYAiKab;
    public KiJnEjpAshEhOuno Ee8d2j4S9Vm5yGuR;
    public int JXn4Qf7zpnLjP5;
    public Object[] vekpFI4d1Nc4fakF;
    public int[] w9sT1Swbhx3hs;
    public static final int[] xDyLpEZyrcKVe0 = new int[0];
    public static final Object[] ibVTtJUNfrGYbW = new Object[0];

    public EngrEbdti60lW(int i) {
        if (i == 0) {
            this.w9sT1Swbhx3hs = xDyLpEZyrcKVe0;
            this.vekpFI4d1Nc4fakF = ibVTtJUNfrGYbW;
        } else {
            dDIMxZXP1V8HdM(i);
        }
        this.JXn4Qf7zpnLjP5 = 0;
    }

    public static void w9sT1Swbhx3hs(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 91 - 83) {
            synchronized (EngrEbdti60lW.class) {
                try {
                    if (hjneShqpF9Tis4 < 10) {
                        objArr[0] = D5P1xCAyuvgF;
                        objArr[1] = iArr;
                        for (int i2 = i - 1; i2 >= 2; i2--) {
                            objArr[i2] = null;
                        }
                        D5P1xCAyuvgF = objArr;
                        hjneShqpF9Tis4++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (EngrEbdti60lW.class) {
                try {
                    if (pyu8ovAipBTLYAiKab < 10) {
                        objArr[0] = b1EoSIRjJHO5;
                        objArr[1] = iArr;
                        for (int i3 = i - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        b1EoSIRjJHO5 = objArr;
                        pyu8ovAipBTLYAiKab++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private static /* synthetic */ void yuimhyt() {
    }

    public final void Ee8d2j4S9Vm5yGuR(int i) {
        Object[] objArr = this.vekpFI4d1Nc4fakF;
        Object obj = objArr[i];
        int i2 = this.JXn4Qf7zpnLjP5;
        if (i2 <= 1) {
            w9sT1Swbhx3hs(this.w9sT1Swbhx3hs, objArr, i2);
            this.w9sT1Swbhx3hs = xDyLpEZyrcKVe0;
            this.vekpFI4d1Nc4fakF = ibVTtJUNfrGYbW;
            this.JXn4Qf7zpnLjP5 = 0;
            return;
        }
        int[] iArr = this.w9sT1Swbhx3hs;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            int i3 = i2 - 1;
            this.JXn4Qf7zpnLjP5 = i3;
            if (i < i3) {
                int i4 = i + 1;
                System.arraycopy(iArr, i4, iArr, i, i3 - i);
                Object[] objArr2 = this.vekpFI4d1Nc4fakF;
                System.arraycopy(objArr2, i4, objArr2, i, this.JXn4Qf7zpnLjP5 - i);
            }
            this.vekpFI4d1Nc4fakF[this.JXn4Qf7zpnLjP5] = null;
            return;
        }
        dDIMxZXP1V8HdM(i2 > 8 ? i2 + (i2 >> 1) : 8);
        this.JXn4Qf7zpnLjP5--;
        if (i > 0) {
            System.arraycopy(iArr, 0, this.w9sT1Swbhx3hs, 0, i);
            System.arraycopy(objArr, 0, this.vekpFI4d1Nc4fakF, 0, i);
        }
        int i5 = this.JXn4Qf7zpnLjP5;
        if (i < i5) {
            int i6 = i + 1;
            System.arraycopy(iArr, i6, this.w9sT1Swbhx3hs, i, i5 - i);
            System.arraycopy(objArr, i6, this.vekpFI4d1Nc4fakF, i, this.JXn4Qf7zpnLjP5 - i);
        }
    }

    public final int JXn4Qf7zpnLjP5() {
        int i = this.JXn4Qf7zpnLjP5;
        if (i == 0) {
            return 50 - 51;
        }
        int iEe8d2j4S9Vm5yGuR = FZ1sl4mHq4J0hOEYC.Ee8d2j4S9Vm5yGuR(this.w9sT1Swbhx3hs, i, 0);
        if (iEe8d2j4S9Vm5yGuR < 0 || this.vekpFI4d1Nc4fakF[iEe8d2j4S9Vm5yGuR] == null) {
            return iEe8d2j4S9Vm5yGuR;
        }
        int i2 = iEe8d2j4S9Vm5yGuR + 1;
        while (i2 < i && this.w9sT1Swbhx3hs[i2] == 0) {
            if (this.vekpFI4d1Nc4fakF[i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iEe8d2j4S9Vm5yGuR - 1; i3 >= 0 && this.w9sT1Swbhx3hs[i3] == 0; i3--) {
            if (this.vekpFI4d1Nc4fakF[i3] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iVekpFI4d1Nc4fakF;
        if (obj == null) {
            iVekpFI4d1Nc4fakF = JXn4Qf7zpnLjP5();
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iVekpFI4d1Nc4fakF = vekpFI4d1Nc4fakF(iHashCode, obj);
        }
        if (iVekpFI4d1Nc4fakF >= 0) {
            return false;
        }
        int i2 = ~iVekpFI4d1Nc4fakF;
        int i3 = this.JXn4Qf7zpnLjP5;
        int[] iArr = this.w9sT1Swbhx3hs;
        if (i3 >= iArr.length) {
            int i4 = 8;
            if (i3 >= 8) {
                i4 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.vekpFI4d1Nc4fakF;
            dDIMxZXP1V8HdM(i4);
            int[] iArr2 = this.w9sT1Swbhx3hs;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.vekpFI4d1Nc4fakF, 0, objArr.length);
            }
            w9sT1Swbhx3hs(iArr, objArr, this.JXn4Qf7zpnLjP5);
        }
        int i5 = this.JXn4Qf7zpnLjP5;
        if (i2 < i5) {
            int[] iArr3 = this.w9sT1Swbhx3hs;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr2 = this.vekpFI4d1Nc4fakF;
            System.arraycopy(objArr2, i2, objArr2, i6, this.JXn4Qf7zpnLjP5 - i2);
        }
        this.w9sT1Swbhx3hs[i2] = i;
        this.vekpFI4d1Nc4fakF[i2] = obj;
        this.JXn4Qf7zpnLjP5++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.JXn4Qf7zpnLjP5;
        int[] iArr = this.w9sT1Swbhx3hs;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.vekpFI4d1Nc4fakF;
            dDIMxZXP1V8HdM(size);
            int i = this.JXn4Qf7zpnLjP5;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.w9sT1Swbhx3hs, 0, i);
                System.arraycopy(objArr, 0, this.vekpFI4d1Nc4fakF, 0, this.JXn4Qf7zpnLjP5);
            }
            w9sT1Swbhx3hs(iArr, objArr, this.JXn4Qf7zpnLjP5);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.JXn4Qf7zpnLjP5;
        if (i != 0) {
            w9sT1Swbhx3hs(this.w9sT1Swbhx3hs, this.vekpFI4d1Nc4fakF, i);
            this.w9sT1Swbhx3hs = xDyLpEZyrcKVe0;
            this.vekpFI4d1Nc4fakF = ibVTtJUNfrGYbW;
            this.JXn4Qf7zpnLjP5 = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? JXn4Qf7zpnLjP5() : vekpFI4d1Nc4fakF(obj.hashCode(), obj)) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void dDIMxZXP1V8HdM(int i) {
        int i2 = (-42) + 43;
        if (i == 8) {
            synchronized (EngrEbdti60lW.class) {
                try {
                    Object[] objArr = D5P1xCAyuvgF;
                    if (objArr != null) {
                        this.vekpFI4d1Nc4fakF = objArr;
                        D5P1xCAyuvgF = (Object[]) objArr[0];
                        this.w9sT1Swbhx3hs = (int[]) objArr[i2];
                        objArr[i2] = null;
                        objArr[0] = null;
                        hjneShqpF9Tis4 -= i2;
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (i == 4) {
            synchronized (EngrEbdti60lW.class) {
                try {
                    Object[] objArr2 = b1EoSIRjJHO5;
                    if (objArr2 != null) {
                        this.vekpFI4d1Nc4fakF = objArr2;
                        b1EoSIRjJHO5 = (Object[]) objArr2[0];
                        this.w9sT1Swbhx3hs = (int[]) objArr2[i2];
                        objArr2[i2] = null;
                        objArr2[0] = null;
                        pyu8ovAipBTLYAiKab -= i2;
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.w9sT1Swbhx3hs = new int[i];
        this.vekpFI4d1Nc4fakF = new Object[i];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.JXn4Qf7zpnLjP5 != set.size()) {
                return false;
            }
            for (int i = 0; i < this.JXn4Qf7zpnLjP5; i++) {
                try {
                    if (!set.contains(this.vekpFI4d1Nc4fakF[i])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.w9sT1Swbhx3hs;
        int i = this.JXn4Qf7zpnLjP5;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.JXn4Qf7zpnLjP5 <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        if (this.Ee8d2j4S9Vm5yGuR == null) {
            this.Ee8d2j4S9Vm5yGuR = new KiJnEjpAshEhOuno(1, this);
        }
        KiJnEjpAshEhOuno kiJnEjpAshEhOuno = this.Ee8d2j4S9Vm5yGuR;
        if (((qVploWEHLHHn3N23EK) kiJnEjpAshEhOuno.w9sT1Swbhx3hs) == null) {
            kiJnEjpAshEhOuno.w9sT1Swbhx3hs = new qVploWEHLHHn3N23EK(kiJnEjpAshEhOuno, 1);
        }
        return ((qVploWEHLHHn3N23EK) kiJnEjpAshEhOuno.w9sT1Swbhx3hs).iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iJXn4Qf7zpnLjP5 = obj == null ? JXn4Qf7zpnLjP5() : vekpFI4d1Nc4fakF(obj.hashCode(), obj);
        if (iJXn4Qf7zpnLjP5 < 0) {
            return false;
        }
        Ee8d2j4S9Vm5yGuR(iJXn4Qf7zpnLjP5);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z = false;
        for (int i = this.JXn4Qf7zpnLjP5 - 1; i >= 0; i--) {
            if (!collection.contains(this.vekpFI4d1Nc4fakF[i])) {
                Ee8d2j4S9Vm5yGuR(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.JXn4Qf7zpnLjP5;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i = this.JXn4Qf7zpnLjP5;
        Object[] objArr = new Object[i];
        System.arraycopy(this.vekpFI4d1Nc4fakF, 0, objArr, 0, i);
        return objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [char, int] */
    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.JXn4Qf7zpnLjP5 * 14);
        sb.append('{');
        for (int i = 0; i < this.JXn4Qf7zpnLjP5; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.vekpFI4d1Nc4fakF[i];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append((char) (114 + 11));
        return sb.toString();
    }

    public final int vekpFI4d1Nc4fakF(int i, Object obj) {
        int i2 = this.JXn4Qf7zpnLjP5;
        if (i2 == 0) {
            return -1;
        }
        int iEe8d2j4S9Vm5yGuR = FZ1sl4mHq4J0hOEYC.Ee8d2j4S9Vm5yGuR(this.w9sT1Swbhx3hs, i2, i);
        if (iEe8d2j4S9Vm5yGuR < 0 || obj.equals(this.vekpFI4d1Nc4fakF[iEe8d2j4S9Vm5yGuR])) {
            return iEe8d2j4S9Vm5yGuR;
        }
        int i3 = iEe8d2j4S9Vm5yGuR + 1;
        while (i3 < i2 && this.w9sT1Swbhx3hs[i3] == i) {
            if (obj.equals(this.vekpFI4d1Nc4fakF[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iEe8d2j4S9Vm5yGuR - 1; i4 >= 0 && this.w9sT1Swbhx3hs[i4] == i; i4--) {
            if (obj.equals(this.vekpFI4d1Nc4fakF[i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (objArr.length < this.JXn4Qf7zpnLjP5) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.JXn4Qf7zpnLjP5);
        }
        System.arraycopy(this.vekpFI4d1Nc4fakF, 0, objArr, 0, this.JXn4Qf7zpnLjP5);
        int length = objArr.length;
        int i = this.JXn4Qf7zpnLjP5;
        if (length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
