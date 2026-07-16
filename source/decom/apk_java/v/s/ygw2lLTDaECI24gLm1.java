package v.s;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class ygw2lLTDaECI24gLm1 extends H9XlUr4OeMJFiXK implements RandomAccess, Serializable {
    public static final ygw2lLTDaECI24gLm1 b1EoSIRjJHO5;
    public boolean Ee8d2j4S9Vm5yGuR;
    public int JXn4Qf7zpnLjP5;
    public final ygw2lLTDaECI24gLm1 ibVTtJUNfrGYbW;
    public final int vekpFI4d1Nc4fakF;
    public Object[] w9sT1Swbhx3hs;
    public final ygw2lLTDaECI24gLm1 xDyLpEZyrcKVe0;

    static {
        ygw2lLTDaECI24gLm1 ygw2lltdaeci24glm1 = new ygw2lLTDaECI24gLm1(0);
        ygw2lltdaeci24glm1.Ee8d2j4S9Vm5yGuR = true;
        b1EoSIRjJHO5 = ygw2lltdaeci24glm1;
    }

    public ygw2lLTDaECI24gLm1(Object[] objArr, int i, int i2, boolean z, ygw2lLTDaECI24gLm1 ygw2lltdaeci24glm1, ygw2lLTDaECI24gLm1 ygw2lltdaeci24glm2) {
        this.w9sT1Swbhx3hs = objArr;
        this.vekpFI4d1Nc4fakF = i;
        this.JXn4Qf7zpnLjP5 = i2;
        this.Ee8d2j4S9Vm5yGuR = z;
        this.xDyLpEZyrcKVe0 = ygw2lltdaeci24glm1;
        this.ibVTtJUNfrGYbW = ygw2lltdaeci24glm2;
    }

    private static /* synthetic */ void jggnwnb() {
    }

    public final void Ee8d2j4S9Vm5yGuR() {
        ygw2lLTDaECI24gLm1 ygw2lltdaeci24glm1;
        if (this.Ee8d2j4S9Vm5yGuR || ((ygw2lltdaeci24glm1 = this.ibVTtJUNfrGYbW) != null && ygw2lltdaeci24glm1.Ee8d2j4S9Vm5yGuR)) {
            throw new UnsupportedOperationException();
        }
    }

    public final void JXn4Qf7zpnLjP5(int i, Object obj) {
        ygw2lLTDaECI24gLm1 ygw2lltdaeci24glm1 = this.xDyLpEZyrcKVe0;
        if (ygw2lltdaeci24glm1 == null) {
            xDyLpEZyrcKVe0(i, 1);
            this.w9sT1Swbhx3hs[i] = obj;
        } else {
            ygw2lltdaeci24glm1.JXn4Qf7zpnLjP5(i, obj);
            this.w9sT1Swbhx3hs = ygw2lltdaeci24glm1.w9sT1Swbhx3hs;
            this.JXn4Qf7zpnLjP5++;
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        Ee8d2j4S9Vm5yGuR();
        JXn4Qf7zpnLjP5(this.vekpFI4d1Nc4fakF + this.JXn4Qf7zpnLjP5, obj);
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 5 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        Ee8d2j4S9Vm5yGuR();
        int size = collection.size();
        vekpFI4d1Nc4fakF(this.vekpFI4d1Nc4fakF + this.JXn4Qf7zpnLjP5, collection, size);
        return size > 0;
    }

    public final void b1EoSIRjJHO5(int i, int i2) {
        ygw2lLTDaECI24gLm1 ygw2lltdaeci24glm1 = this.xDyLpEZyrcKVe0;
        if (ygw2lltdaeci24glm1 != null) {
            ygw2lltdaeci24glm1.b1EoSIRjJHO5(i, i2);
        } else {
            Object[] objArr = this.w9sT1Swbhx3hs;
            VnDsNIgXNCQywv8lGh.hV4VTKNUdeHN(objArr, objArr, i, i + i2, this.JXn4Qf7zpnLjP5);
            Object[] objArr2 = this.w9sT1Swbhx3hs;
            int i3 = this.JXn4Qf7zpnLjP5;
            gA5gCwTK0qjTIn.DVTNwpDEVsUKuznof(objArr2, i3 - i2, i3);
        }
        this.JXn4Qf7zpnLjP5 -= i2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        Ee8d2j4S9Vm5yGuR();
        b1EoSIRjJHO5(this.vekpFI4d1Nc4fakF, this.JXn4Qf7zpnLjP5);
    }

    @Override // v.s.H9XlUr4OeMJFiXK
    public final int dDIMxZXP1V8HdM() {
        return this.JXn4Qf7zpnLjP5;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.w9sT1Swbhx3hs;
            int i = this.JXn4Qf7zpnLjP5;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(objArr[this.vekpFI4d1Nc4fakF + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.JXn4Qf7zpnLjP5;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(Y9mRyRdkl5FOcwb66V6.Ee8d2j4S9Vm5yGuR(i, i2, "index: ", ", size: "));
        }
        return this.w9sT1Swbhx3hs[this.vekpFI4d1Nc4fakF + i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.w9sT1Swbhx3hs;
        int i = this.JXn4Qf7zpnLjP5;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[this.vekpFI4d1Nc4fakF + i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final Object ibVTtJUNfrGYbW(int i) {
        ygw2lLTDaECI24gLm1 ygw2lltdaeci24glm1 = this.xDyLpEZyrcKVe0;
        if (ygw2lltdaeci24glm1 != null) {
            Object objIbVTtJUNfrGYbW = ygw2lltdaeci24glm1.ibVTtJUNfrGYbW(i);
            this.JXn4Qf7zpnLjP5--;
            return objIbVTtJUNfrGYbW;
        }
        Object[] objArr = this.w9sT1Swbhx3hs;
        Object obj = objArr[i];
        int i2 = this.JXn4Qf7zpnLjP5;
        int i3 = this.vekpFI4d1Nc4fakF;
        VnDsNIgXNCQywv8lGh.hV4VTKNUdeHN(objArr, objArr, i, i + 1, i2 + i3);
        Object[] objArr2 = this.w9sT1Swbhx3hs;
        int i4 = this.JXn4Qf7zpnLjP5;
        objArr2[(i3 + i4) - 1] = null;
        this.JXn4Qf7zpnLjP5 = i4 - 1;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.JXn4Qf7zpnLjP5; i++) {
            if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.w9sT1Swbhx3hs[this.vekpFI4d1Nc4fakF + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.JXn4Qf7zpnLjP5 == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new wPQW0HxMw42V0Fv0tT(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.JXn4Qf7zpnLjP5 - 1; i >= 0; i--) {
            if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.w9sT1Swbhx3hs[this.vekpFI4d1Nc4fakF + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new wPQW0HxMw42V0Fv0tT(this, 0);
    }

    public final int pyu8ovAipBTLYAiKab(int i, int i2, Collection collection, boolean z) {
        ygw2lLTDaECI24gLm1 ygw2lltdaeci24glm1 = this.xDyLpEZyrcKVe0;
        if (ygw2lltdaeci24glm1 != null) {
            int iPyu8ovAipBTLYAiKab = ygw2lltdaeci24glm1.pyu8ovAipBTLYAiKab(i, i2, collection, z);
            this.JXn4Qf7zpnLjP5 -= iPyu8ovAipBTLYAiKab;
            return iPyu8ovAipBTLYAiKab;
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.w9sT1Swbhx3hs[i5]) == z) {
                Object[] objArr = this.w9sT1Swbhx3hs;
                i3++;
                objArr[i4 + i] = objArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        Object[] objArr2 = this.w9sT1Swbhx3hs;
        VnDsNIgXNCQywv8lGh.hV4VTKNUdeHN(objArr2, objArr2, i + i4, i2 + i, this.JXn4Qf7zpnLjP5);
        Object[] objArr3 = this.w9sT1Swbhx3hs;
        int i7 = this.JXn4Qf7zpnLjP5;
        gA5gCwTK0qjTIn.DVTNwpDEVsUKuznof(objArr3, i7 - i6, i7);
        this.JXn4Qf7zpnLjP5 -= i6;
        return i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        Ee8d2j4S9Vm5yGuR();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            w9sT1Swbhx3hs(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        Ee8d2j4S9Vm5yGuR();
        return pyu8ovAipBTLYAiKab(this.vekpFI4d1Nc4fakF, this.JXn4Qf7zpnLjP5, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        Ee8d2j4S9Vm5yGuR();
        return pyu8ovAipBTLYAiKab(this.vekpFI4d1Nc4fakF, this.JXn4Qf7zpnLjP5, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Ee8d2j4S9Vm5yGuR();
        int i2 = this.JXn4Qf7zpnLjP5;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(Y9mRyRdkl5FOcwb66V6.Ee8d2j4S9Vm5yGuR(i, i2, "index: ", ", size: "));
        }
        Object[] objArr = this.w9sT1Swbhx3hs;
        int i3 = this.vekpFI4d1Nc4fakF;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        OFtLBiBbrrTHWu.JXn4Qf7zpnLjP5(i, i2, this.JXn4Qf7zpnLjP5);
        Object[] objArr = this.w9sT1Swbhx3hs;
        int i3 = this.vekpFI4d1Nc4fakF + i;
        int i4 = i2 - i;
        boolean z = this.Ee8d2j4S9Vm5yGuR;
        ygw2lLTDaECI24gLm1 ygw2lltdaeci24glm1 = this.ibVTtJUNfrGYbW;
        return new ygw2lLTDaECI24gLm1(objArr, i3, i4, z, this, ygw2lltdaeci24glm1 == null ? this : ygw2lltdaeci24glm1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        int length = objArr.length;
        int i = this.JXn4Qf7zpnLjP5;
        int i2 = this.vekpFI4d1Nc4fakF;
        if (length < i) {
            return Arrays.copyOfRange(this.w9sT1Swbhx3hs, i2, i + i2, objArr.getClass());
        }
        VnDsNIgXNCQywv8lGh.hV4VTKNUdeHN(this.w9sT1Swbhx3hs, objArr, 0, i2, i + i2);
        int length2 = objArr.length;
        int i3 = this.JXn4Qf7zpnLjP5;
        if (length2 > i3) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        Object[] objArr = this.w9sT1Swbhx3hs;
        int i = this.JXn4Qf7zpnLjP5;
        StringBuilder sb = new StringBuilder((i * 3) + 2);
        sb.append("[");
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(objArr[this.vekpFI4d1Nc4fakF + i2]);
        }
        sb.append("]");
        return sb.toString();
    }

    public final void vekpFI4d1Nc4fakF(int i, Collection collection, int i2) {
        ygw2lLTDaECI24gLm1 ygw2lltdaeci24glm1 = this.xDyLpEZyrcKVe0;
        if (ygw2lltdaeci24glm1 != null) {
            ygw2lltdaeci24glm1.vekpFI4d1Nc4fakF(i, collection, i2);
            this.w9sT1Swbhx3hs = ygw2lltdaeci24glm1.w9sT1Swbhx3hs;
            this.JXn4Qf7zpnLjP5 += i2;
        } else {
            xDyLpEZyrcKVe0(i, i2);
            Iterator it = collection.iterator();
            for (int i3 = 0; i3 < i2; i3++) {
                this.w9sT1Swbhx3hs[i + i3] = it.next();
            }
        }
    }

    @Override // v.s.H9XlUr4OeMJFiXK
    public final Object w9sT1Swbhx3hs(int i) {
        Ee8d2j4S9Vm5yGuR();
        int i2 = this.JXn4Qf7zpnLjP5;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(Y9mRyRdkl5FOcwb66V6.Ee8d2j4S9Vm5yGuR(i, i2, "index: ", ", size: "));
        }
        return ibVTtJUNfrGYbW(this.vekpFI4d1Nc4fakF + i);
    }

    public final void xDyLpEZyrcKVe0(int i, int i2) {
        int i3 = this.JXn4Qf7zpnLjP5 + i2;
        if (this.xDyLpEZyrcKVe0 != null) {
            throw new IllegalStateException();
        }
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.w9sT1Swbhx3hs;
        if (i3 > objArr.length) {
            int length = objArr.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.w9sT1Swbhx3hs = Arrays.copyOf(objArr, i4);
        }
        Object[] objArr2 = this.w9sT1Swbhx3hs;
        VnDsNIgXNCQywv8lGh.hV4VTKNUdeHN(objArr2, objArr2, i + i2, i, this.vekpFI4d1Nc4fakF + this.JXn4Qf7zpnLjP5);
        this.JXn4Qf7zpnLjP5 += i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.JXn4Qf7zpnLjP5;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(Y9mRyRdkl5FOcwb66V6.Ee8d2j4S9Vm5yGuR(i, i2, "index: ", ", size: "));
        }
        return new wPQW0HxMw42V0Fv0tT(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        Ee8d2j4S9Vm5yGuR();
        int i2 = this.JXn4Qf7zpnLjP5;
        if (i >= 0 && i <= i2) {
            JXn4Qf7zpnLjP5(this.vekpFI4d1Nc4fakF + i, obj);
            return;
        }
        throw new IndexOutOfBoundsException(Y9mRyRdkl5FOcwb66V6.Ee8d2j4S9Vm5yGuR(i, i2, "index: ", ", size: "));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 5 */
    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Ee8d2j4S9Vm5yGuR();
        int i2 = this.JXn4Qf7zpnLjP5;
        if (i >= 0 && i <= i2) {
            int size = collection.size();
            vekpFI4d1Nc4fakF(this.vekpFI4d1Nc4fakF + i, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(Y9mRyRdkl5FOcwb66V6.Ee8d2j4S9Vm5yGuR(i, i2, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        Object[] objArr = this.w9sT1Swbhx3hs;
        int i = this.JXn4Qf7zpnLjP5;
        int i2 = this.vekpFI4d1Nc4fakF;
        int i3 = i + i2;
        SbxdZ6Kq2uhHQ5RPRqm.hjneShqpF9Tis4(i3, objArr.length);
        return Arrays.copyOfRange(objArr, i2, i3);
    }

    public ygw2lLTDaECI24gLm1() {
        this(10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ygw2lLTDaECI24gLm1(int i) {
        this(new Object[i], 0, 0, false, null, null);
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }
}
