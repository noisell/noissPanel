package v.s;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class qnm6iqPQy0KTns5Pe extends H9XlUr4OeMJFiXK {
    public static final Object[] Ee8d2j4S9Vm5yGuR = new Object[0];
    public int JXn4Qf7zpnLjP5;
    public Object[] vekpFI4d1Nc4fakF = Ee8d2j4S9Vm5yGuR;
    public int w9sT1Swbhx3hs;

    private static /* synthetic */ void potu() {
    }

    public final int Ee8d2j4S9Vm5yGuR(int i) {
        if (i == this.vekpFI4d1Nc4fakF.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final void JXn4Qf7zpnLjP5(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.vekpFI4d1Nc4fakF;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == Ee8d2j4S9Vm5yGuR) {
            if (i < 10) {
                i = 10;
            }
            this.vekpFI4d1Nc4fakF = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        VnDsNIgXNCQywv8lGh.hV4VTKNUdeHN(objArr, objArr2, 0, this.w9sT1Swbhx3hs, objArr.length);
        Object[] objArr3 = this.vekpFI4d1Nc4fakF;
        int length2 = objArr3.length;
        int i3 = this.w9sT1Swbhx3hs;
        VnDsNIgXNCQywv8lGh.hV4VTKNUdeHN(objArr3, objArr2, length2 - i3, 0, i3);
        this.w9sT1Swbhx3hs = 0;
        this.vekpFI4d1Nc4fakF = objArr2;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 5 */
    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.JXn4Qf7zpnLjP5;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(Y9mRyRdkl5FOcwb66V6.Ee8d2j4S9Vm5yGuR(i, i2, "index: ", ", size: "));
        }
        if (i == i2) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            JXn4Qf7zpnLjP5(i2 + 1);
            int length = this.w9sT1Swbhx3hs;
            if (length == 0) {
                length = this.vekpFI4d1Nc4fakF.length;
            }
            int i3 = length - 1;
            this.w9sT1Swbhx3hs = i3;
            this.vekpFI4d1Nc4fakF[i3] = obj;
            this.JXn4Qf7zpnLjP5++;
            return;
        }
        JXn4Qf7zpnLjP5(i2 + 1);
        int iXDyLpEZyrcKVe0 = xDyLpEZyrcKVe0(this.w9sT1Swbhx3hs + i);
        int i4 = this.JXn4Qf7zpnLjP5;
        if (i < ((i4 + 1) >> 1)) {
            int length2 = iXDyLpEZyrcKVe0 == 0 ? this.vekpFI4d1Nc4fakF.length - 1 : iXDyLpEZyrcKVe0 - 1;
            int i5 = this.w9sT1Swbhx3hs;
            int length3 = i5 == 0 ? this.vekpFI4d1Nc4fakF.length - 1 : i5 - 1;
            if (length2 >= i5) {
                Object[] objArr = this.vekpFI4d1Nc4fakF;
                objArr[length3] = objArr[i5];
                VnDsNIgXNCQywv8lGh.hV4VTKNUdeHN(objArr, objArr, i5, i5 + 1, length2 + 1);
            } else {
                Object[] objArr2 = this.vekpFI4d1Nc4fakF;
                VnDsNIgXNCQywv8lGh.hV4VTKNUdeHN(objArr2, objArr2, i5 - 1, i5, objArr2.length);
                Object[] objArr3 = this.vekpFI4d1Nc4fakF;
                objArr3[objArr3.length - 1] = objArr3[0];
                VnDsNIgXNCQywv8lGh.hV4VTKNUdeHN(objArr3, objArr3, 0, 1, length2 + 1);
            }
            this.vekpFI4d1Nc4fakF[length2] = obj;
            this.w9sT1Swbhx3hs = length3;
        } else {
            int iXDyLpEZyrcKVe1 = xDyLpEZyrcKVe0(i4 + this.w9sT1Swbhx3hs);
            if (iXDyLpEZyrcKVe0 < iXDyLpEZyrcKVe1) {
                Object[] objArr4 = this.vekpFI4d1Nc4fakF;
                VnDsNIgXNCQywv8lGh.hV4VTKNUdeHN(objArr4, objArr4, iXDyLpEZyrcKVe0 + 1, iXDyLpEZyrcKVe0, iXDyLpEZyrcKVe1);
            } else {
                Object[] objArr5 = this.vekpFI4d1Nc4fakF;
                VnDsNIgXNCQywv8lGh.hV4VTKNUdeHN(objArr5, objArr5, 1, 0, iXDyLpEZyrcKVe1);
                Object[] objArr6 = this.vekpFI4d1Nc4fakF;
                objArr6[0] = objArr6[objArr6.length - 1];
                VnDsNIgXNCQywv8lGh.hV4VTKNUdeHN(objArr6, objArr6, iXDyLpEZyrcKVe0 + 1, iXDyLpEZyrcKVe0, objArr6.length - 1);
            }
            this.vekpFI4d1Nc4fakF[iXDyLpEZyrcKVe0] = obj;
        }
        this.JXn4Qf7zpnLjP5++;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 7 */
    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.JXn4Qf7zpnLjP5;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(Y9mRyRdkl5FOcwb66V6.Ee8d2j4S9Vm5yGuR(i, i2, "index: ", ", size: "));
        }
        if (collection.isEmpty()) {
            return false;
        }
        int i3 = this.JXn4Qf7zpnLjP5;
        if (i == i3) {
            return addAll(collection);
        }
        JXn4Qf7zpnLjP5(collection.size() + i3);
        int iXDyLpEZyrcKVe0 = xDyLpEZyrcKVe0(this.JXn4Qf7zpnLjP5 + this.w9sT1Swbhx3hs);
        int iXDyLpEZyrcKVe1 = xDyLpEZyrcKVe0(this.w9sT1Swbhx3hs + i);
        int size = collection.size();
        if (i >= ((this.JXn4Qf7zpnLjP5 + 1) >> 1)) {
            int i4 = iXDyLpEZyrcKVe1 + size;
            if (iXDyLpEZyrcKVe1 < iXDyLpEZyrcKVe0) {
                int i5 = size + iXDyLpEZyrcKVe0;
                Object[] objArr = this.vekpFI4d1Nc4fakF;
                if (i5 <= objArr.length) {
                    VnDsNIgXNCQywv8lGh.hV4VTKNUdeHN(objArr, objArr, i4, iXDyLpEZyrcKVe1, iXDyLpEZyrcKVe0);
                } else if (i4 >= objArr.length) {
                    VnDsNIgXNCQywv8lGh.hV4VTKNUdeHN(objArr, objArr, i4 - objArr.length, iXDyLpEZyrcKVe1, iXDyLpEZyrcKVe0);
                } else {
                    int length = iXDyLpEZyrcKVe0 - (i5 - objArr.length);
                    VnDsNIgXNCQywv8lGh.hV4VTKNUdeHN(objArr, objArr, 0, length, iXDyLpEZyrcKVe0);
                    Object[] objArr2 = this.vekpFI4d1Nc4fakF;
                    VnDsNIgXNCQywv8lGh.hV4VTKNUdeHN(objArr2, objArr2, i4, iXDyLpEZyrcKVe1, length);
                }
            } else {
                Object[] objArr3 = this.vekpFI4d1Nc4fakF;
                VnDsNIgXNCQywv8lGh.hV4VTKNUdeHN(objArr3, objArr3, size, 0, iXDyLpEZyrcKVe0);
                Object[] objArr4 = this.vekpFI4d1Nc4fakF;
                if (i4 >= objArr4.length) {
                    VnDsNIgXNCQywv8lGh.hV4VTKNUdeHN(objArr4, objArr4, i4 - objArr4.length, iXDyLpEZyrcKVe1, objArr4.length);
                } else {
                    VnDsNIgXNCQywv8lGh.hV4VTKNUdeHN(objArr4, objArr4, 0, objArr4.length - size, objArr4.length);
                    Object[] objArr5 = this.vekpFI4d1Nc4fakF;
                    VnDsNIgXNCQywv8lGh.hV4VTKNUdeHN(objArr5, objArr5, i4, iXDyLpEZyrcKVe1, objArr5.length - size);
                }
            }
            vekpFI4d1Nc4fakF(iXDyLpEZyrcKVe1, collection);
            return true;
        }
        int i6 = this.w9sT1Swbhx3hs;
        int length2 = i6 - size;
        if (iXDyLpEZyrcKVe1 < i6) {
            Object[] objArr6 = this.vekpFI4d1Nc4fakF;
            VnDsNIgXNCQywv8lGh.hV4VTKNUdeHN(objArr6, objArr6, length2, i6, objArr6.length);
            if (size >= iXDyLpEZyrcKVe1) {
                Object[] objArr7 = this.vekpFI4d1Nc4fakF;
                VnDsNIgXNCQywv8lGh.hV4VTKNUdeHN(objArr7, objArr7, objArr7.length - size, 0, iXDyLpEZyrcKVe1);
            } else {
                Object[] objArr8 = this.vekpFI4d1Nc4fakF;
                VnDsNIgXNCQywv8lGh.hV4VTKNUdeHN(objArr8, objArr8, objArr8.length - size, 0, size);
                Object[] objArr9 = this.vekpFI4d1Nc4fakF;
                VnDsNIgXNCQywv8lGh.hV4VTKNUdeHN(objArr9, objArr9, 0, size, iXDyLpEZyrcKVe1);
            }
        } else if (length2 >= 0) {
            Object[] objArr10 = this.vekpFI4d1Nc4fakF;
            VnDsNIgXNCQywv8lGh.hV4VTKNUdeHN(objArr10, objArr10, length2, i6, iXDyLpEZyrcKVe1);
        } else {
            Object[] objArr11 = this.vekpFI4d1Nc4fakF;
            length2 += objArr11.length;
            int i7 = iXDyLpEZyrcKVe1 - i6;
            int length3 = objArr11.length - length2;
            if (length3 >= i7) {
                VnDsNIgXNCQywv8lGh.hV4VTKNUdeHN(objArr11, objArr11, length2, i6, iXDyLpEZyrcKVe1);
            } else {
                VnDsNIgXNCQywv8lGh.hV4VTKNUdeHN(objArr11, objArr11, length2, i6, i6 + length3);
                Object[] objArr12 = this.vekpFI4d1Nc4fakF;
                VnDsNIgXNCQywv8lGh.hV4VTKNUdeHN(objArr12, objArr12, 0, this.w9sT1Swbhx3hs + length3, iXDyLpEZyrcKVe1);
            }
        }
        this.w9sT1Swbhx3hs = length2;
        int length4 = iXDyLpEZyrcKVe1 - size;
        if (length4 < 0) {
            length4 += this.vekpFI4d1Nc4fakF.length;
        }
        vekpFI4d1Nc4fakF(length4, collection);
        return true;
    }

    public final void addLast(Object obj) {
        JXn4Qf7zpnLjP5(dDIMxZXP1V8HdM() + 1);
        this.vekpFI4d1Nc4fakF[xDyLpEZyrcKVe0(dDIMxZXP1V8HdM() + this.w9sT1Swbhx3hs)] = obj;
        this.JXn4Qf7zpnLjP5 = dDIMxZXP1V8HdM() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int iXDyLpEZyrcKVe0 = xDyLpEZyrcKVe0(dDIMxZXP1V8HdM() + this.w9sT1Swbhx3hs);
        int i = this.w9sT1Swbhx3hs;
        if (i < iXDyLpEZyrcKVe0) {
            Arrays.fill(this.vekpFI4d1Nc4fakF, i, iXDyLpEZyrcKVe0, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr = this.vekpFI4d1Nc4fakF;
            Arrays.fill(objArr, this.w9sT1Swbhx3hs, objArr.length, (Object) null);
            Arrays.fill(this.vekpFI4d1Nc4fakF, 0, iXDyLpEZyrcKVe0, (Object) null);
        }
        this.w9sT1Swbhx3hs = 0;
        this.JXn4Qf7zpnLjP5 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // v.s.H9XlUr4OeMJFiXK
    public final int dDIMxZXP1V8HdM() {
        return this.JXn4Qf7zpnLjP5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int iDDIMxZXP1V8HdM = dDIMxZXP1V8HdM();
        if (i < 0 || i >= iDDIMxZXP1V8HdM) {
            throw new IndexOutOfBoundsException(Y9mRyRdkl5FOcwb66V6.Ee8d2j4S9Vm5yGuR(i, iDDIMxZXP1V8HdM, "index: ", ", size: "));
        }
        return this.vekpFI4d1Nc4fakF[xDyLpEZyrcKVe0(this.w9sT1Swbhx3hs + i)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iXDyLpEZyrcKVe0 = xDyLpEZyrcKVe0(dDIMxZXP1V8HdM() + this.w9sT1Swbhx3hs);
        int length = this.w9sT1Swbhx3hs;
        if (length < iXDyLpEZyrcKVe0) {
            while (length < iXDyLpEZyrcKVe0) {
                if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(obj, this.vekpFI4d1Nc4fakF[length])) {
                    i = this.w9sT1Swbhx3hs;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iXDyLpEZyrcKVe0) {
            return -1;
        }
        int length2 = this.vekpFI4d1Nc4fakF.length;
        while (length < length2) {
            if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(obj, this.vekpFI4d1Nc4fakF[length])) {
                i = this.w9sT1Swbhx3hs;
            } else {
                length++;
            }
        }
        for (int i2 = 0; i2 < iXDyLpEZyrcKVe0; i2++) {
            if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(obj, this.vekpFI4d1Nc4fakF[i2])) {
                length = i2 + this.vekpFI4d1Nc4fakF.length;
                i = this.w9sT1Swbhx3hs;
            }
        }
        return -1;
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return dDIMxZXP1V8HdM() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iXDyLpEZyrcKVe0 = xDyLpEZyrcKVe0(dDIMxZXP1V8HdM() + this.w9sT1Swbhx3hs);
        int i2 = this.w9sT1Swbhx3hs;
        int i3 = 69 - 70;
        if (i2 < iXDyLpEZyrcKVe0) {
            length = iXDyLpEZyrcKVe0 - 1;
            if (i2 <= length) {
                while (!okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(obj, this.vekpFI4d1Nc4fakF[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.w9sT1Swbhx3hs;
                return length - i;
            }
            return i3;
        }
        if (i2 > iXDyLpEZyrcKVe0) {
            for (int i4 = iXDyLpEZyrcKVe0 - 1; i3 < i4; i4--) {
                if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(obj, this.vekpFI4d1Nc4fakF[i4])) {
                    length = i4 + this.vekpFI4d1Nc4fakF.length;
                    i = this.w9sT1Swbhx3hs;
                    return length - i;
                }
            }
            length = this.vekpFI4d1Nc4fakF.length - 1;
            int i5 = this.w9sT1Swbhx3hs;
            if (i5 <= length) {
                while (!okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(obj, this.vekpFI4d1Nc4fakF[length])) {
                    if (length != i5) {
                        length--;
                    }
                }
                i = this.w9sT1Swbhx3hs;
                return length - i;
            }
        }
        return i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        w9sT1Swbhx3hs(iIndexOf);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iXDyLpEZyrcKVe0;
        ?? r1 = 0;
        int i = 0;
        r1 = 0;
        if (!isEmpty() && this.vekpFI4d1Nc4fakF.length != 0) {
            int iXDyLpEZyrcKVe1 = xDyLpEZyrcKVe0(this.JXn4Qf7zpnLjP5 + this.w9sT1Swbhx3hs);
            int i2 = this.w9sT1Swbhx3hs;
            int i3 = (-25) + 26;
            if (i2 < iXDyLpEZyrcKVe1) {
                iXDyLpEZyrcKVe0 = i2;
                while (i2 < iXDyLpEZyrcKVe1) {
                    Object obj = this.vekpFI4d1Nc4fakF[i2];
                    if (collection.contains(obj)) {
                        i = i3;
                    } else {
                        this.vekpFI4d1Nc4fakF[iXDyLpEZyrcKVe0] = obj;
                        iXDyLpEZyrcKVe0++;
                    }
                    i2++;
                    i = i;
                }
                Arrays.fill(this.vekpFI4d1Nc4fakF, iXDyLpEZyrcKVe0, iXDyLpEZyrcKVe1, (Object) null);
                r1 = i;
            } else {
                int length = this.vekpFI4d1Nc4fakF.length;
                int i4 = 0;
                int i5 = i2;
                while (i2 < length) {
                    Object[] objArr = this.vekpFI4d1Nc4fakF;
                    Object obj2 = objArr[i2];
                    objArr[i2] = null;
                    if (collection.contains(obj2)) {
                        i4 = i3;
                    } else {
                        this.vekpFI4d1Nc4fakF[i5] = obj2;
                        i5++;
                    }
                    i2++;
                }
                iXDyLpEZyrcKVe0 = xDyLpEZyrcKVe0(i5);
                for (int i6 = 0; i6 < iXDyLpEZyrcKVe1; i6++) {
                    Object[] objArr2 = this.vekpFI4d1Nc4fakF;
                    Object obj3 = objArr2[i6];
                    objArr2[i6] = null;
                    if (collection.contains(obj3)) {
                        i4 = i3;
                    } else {
                        this.vekpFI4d1Nc4fakF[iXDyLpEZyrcKVe0] = obj3;
                        iXDyLpEZyrcKVe0 = Ee8d2j4S9Vm5yGuR(iXDyLpEZyrcKVe0);
                    }
                }
                r1 = i4;
            }
            if (r1 != 0) {
                int length2 = iXDyLpEZyrcKVe0 - this.w9sT1Swbhx3hs;
                if (length2 < 0) {
                    length2 += this.vekpFI4d1Nc4fakF.length;
                }
                this.JXn4Qf7zpnLjP5 = length2;
            }
        }
        return r1;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.vekpFI4d1Nc4fakF;
        int i = this.w9sT1Swbhx3hs;
        Object obj = objArr[i];
        objArr[i] = null;
        this.w9sT1Swbhx3hs = Ee8d2j4S9Vm5yGuR(i);
        this.JXn4Qf7zpnLjP5 = dDIMxZXP1V8HdM() - 1;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iXDyLpEZyrcKVe0;
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.vekpFI4d1Nc4fakF.length != 0) {
            int iXDyLpEZyrcKVe1 = xDyLpEZyrcKVe0(this.JXn4Qf7zpnLjP5 + this.w9sT1Swbhx3hs);
            int i = this.w9sT1Swbhx3hs;
            if (i < iXDyLpEZyrcKVe1) {
                iXDyLpEZyrcKVe0 = i;
                while (i < iXDyLpEZyrcKVe1) {
                    Object obj = this.vekpFI4d1Nc4fakF[i];
                    if (collection.contains(obj)) {
                        this.vekpFI4d1Nc4fakF[iXDyLpEZyrcKVe0] = obj;
                        iXDyLpEZyrcKVe0++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                Arrays.fill(this.vekpFI4d1Nc4fakF, iXDyLpEZyrcKVe0, iXDyLpEZyrcKVe1, (Object) null);
            } else {
                int length = this.vekpFI4d1Nc4fakF.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.vekpFI4d1Nc4fakF;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.vekpFI4d1Nc4fakF[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iXDyLpEZyrcKVe0 = xDyLpEZyrcKVe0(i2);
                for (int i3 = 0; i3 < iXDyLpEZyrcKVe1; i3++) {
                    Object[] objArr2 = this.vekpFI4d1Nc4fakF;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        this.vekpFI4d1Nc4fakF[iXDyLpEZyrcKVe0] = obj3;
                        iXDyLpEZyrcKVe0 = Ee8d2j4S9Vm5yGuR(iXDyLpEZyrcKVe0);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                int length2 = iXDyLpEZyrcKVe0 - this.w9sT1Swbhx3hs;
                if (length2 < 0) {
                    length2 += this.vekpFI4d1Nc4fakF.length;
                }
                this.JXn4Qf7zpnLjP5 = length2;
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iDDIMxZXP1V8HdM = dDIMxZXP1V8HdM();
        if (i < 0 || i >= iDDIMxZXP1V8HdM) {
            throw new IndexOutOfBoundsException(Y9mRyRdkl5FOcwb66V6.Ee8d2j4S9Vm5yGuR(i, iDDIMxZXP1V8HdM, "index: ", ", size: "));
        }
        int iXDyLpEZyrcKVe0 = xDyLpEZyrcKVe0(this.w9sT1Swbhx3hs + i);
        Object[] objArr = this.vekpFI4d1Nc4fakF;
        Object obj2 = objArr[iXDyLpEZyrcKVe0];
        objArr[iXDyLpEZyrcKVe0] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[dDIMxZXP1V8HdM()]);
    }

    public final void vekpFI4d1Nc4fakF(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.vekpFI4d1Nc4fakF.length;
        while (i < length && it.hasNext()) {
            this.vekpFI4d1Nc4fakF[i] = it.next();
            i++;
        }
        int i2 = this.w9sT1Swbhx3hs;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.vekpFI4d1Nc4fakF[i3] = it.next();
        }
        this.JXn4Qf7zpnLjP5 = collection.size() + this.JXn4Qf7zpnLjP5;
    }

    @Override // v.s.H9XlUr4OeMJFiXK
    public final Object w9sT1Swbhx3hs(int i) {
        int i2 = this.JXn4Qf7zpnLjP5;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(Y9mRyRdkl5FOcwb66V6.Ee8d2j4S9Vm5yGuR(i, i2, "index: ", ", size: "));
        }
        if (i == Aqh0grSwgDbwr.EWUjsTERgdPbSw3NNlN(this)) {
            if (isEmpty()) {
                throw new NoSuchElementException("ArrayDeque is empty.");
            }
            int iXDyLpEZyrcKVe0 = xDyLpEZyrcKVe0(Aqh0grSwgDbwr.EWUjsTERgdPbSw3NNlN(this) + this.w9sT1Swbhx3hs);
            Object[] objArr = this.vekpFI4d1Nc4fakF;
            Object obj = objArr[iXDyLpEZyrcKVe0];
            objArr[iXDyLpEZyrcKVe0] = null;
            this.JXn4Qf7zpnLjP5--;
            return obj;
        }
        if (i == 0) {
            return removeFirst();
        }
        int iXDyLpEZyrcKVe1 = xDyLpEZyrcKVe0(this.w9sT1Swbhx3hs + i);
        Object[] objArr2 = this.vekpFI4d1Nc4fakF;
        Object obj2 = objArr2[iXDyLpEZyrcKVe1];
        if (i < (this.JXn4Qf7zpnLjP5 >> 1)) {
            int i3 = this.w9sT1Swbhx3hs;
            if (iXDyLpEZyrcKVe1 >= i3) {
                VnDsNIgXNCQywv8lGh.hV4VTKNUdeHN(objArr2, objArr2, i3 + 1, i3, iXDyLpEZyrcKVe1);
            } else {
                VnDsNIgXNCQywv8lGh.hV4VTKNUdeHN(objArr2, objArr2, 1, 0, iXDyLpEZyrcKVe1);
                Object[] objArr3 = this.vekpFI4d1Nc4fakF;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i4 = this.w9sT1Swbhx3hs;
                VnDsNIgXNCQywv8lGh.hV4VTKNUdeHN(objArr3, objArr3, i4 + 1, i4, objArr3.length - 1);
            }
            Object[] objArr4 = this.vekpFI4d1Nc4fakF;
            int i5 = this.w9sT1Swbhx3hs;
            objArr4[i5] = null;
            this.w9sT1Swbhx3hs = Ee8d2j4S9Vm5yGuR(i5);
        } else {
            int iXDyLpEZyrcKVe2 = xDyLpEZyrcKVe0(Aqh0grSwgDbwr.EWUjsTERgdPbSw3NNlN(this) + this.w9sT1Swbhx3hs);
            if (iXDyLpEZyrcKVe1 <= iXDyLpEZyrcKVe2) {
                Object[] objArr5 = this.vekpFI4d1Nc4fakF;
                VnDsNIgXNCQywv8lGh.hV4VTKNUdeHN(objArr5, objArr5, iXDyLpEZyrcKVe1, iXDyLpEZyrcKVe1 + 1, iXDyLpEZyrcKVe2 + 1);
            } else {
                Object[] objArr6 = this.vekpFI4d1Nc4fakF;
                VnDsNIgXNCQywv8lGh.hV4VTKNUdeHN(objArr6, objArr6, iXDyLpEZyrcKVe1, iXDyLpEZyrcKVe1 + 1, objArr6.length);
                Object[] objArr7 = this.vekpFI4d1Nc4fakF;
                objArr7[objArr7.length - 1] = objArr7[0];
                VnDsNIgXNCQywv8lGh.hV4VTKNUdeHN(objArr7, objArr7, 0, 1, iXDyLpEZyrcKVe2 + 1);
            }
            this.vekpFI4d1Nc4fakF[iXDyLpEZyrcKVe2] = null;
        }
        this.JXn4Qf7zpnLjP5--;
        return obj2;
    }

    public final int xDyLpEZyrcKVe0(int i) {
        Object[] objArr = this.vekpFI4d1Nc4fakF;
        return i >= objArr.length ? i - objArr.length : i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        int length = objArr.length;
        int i = this.JXn4Qf7zpnLjP5;
        if (length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        int iXDyLpEZyrcKVe0 = xDyLpEZyrcKVe0(this.JXn4Qf7zpnLjP5 + this.w9sT1Swbhx3hs);
        int i2 = this.w9sT1Swbhx3hs;
        if (i2 < iXDyLpEZyrcKVe0) {
            VnDsNIgXNCQywv8lGh.A1BaTVAMeIXMnh(this.vekpFI4d1Nc4fakF, objArr, i2, iXDyLpEZyrcKVe0, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.vekpFI4d1Nc4fakF;
            VnDsNIgXNCQywv8lGh.hV4VTKNUdeHN(objArr2, objArr, 0, this.w9sT1Swbhx3hs, objArr2.length);
            Object[] objArr3 = this.vekpFI4d1Nc4fakF;
            VnDsNIgXNCQywv8lGh.hV4VTKNUdeHN(objArr3, objArr, objArr3.length - this.w9sT1Swbhx3hs, 0, iXDyLpEZyrcKVe0);
        }
        int length2 = objArr.length;
        int i3 = this.JXn4Qf7zpnLjP5;
        if (length2 > i3) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        JXn4Qf7zpnLjP5(collection.size() + dDIMxZXP1V8HdM());
        vekpFI4d1Nc4fakF(xDyLpEZyrcKVe0(dDIMxZXP1V8HdM() + this.w9sT1Swbhx3hs), collection);
        return true;
    }
}
