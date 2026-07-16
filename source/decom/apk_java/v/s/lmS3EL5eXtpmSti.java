package v.s;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class lmS3EL5eXtpmSti implements Map, Serializable, buUjKwCmuWSvVXs {
    public static final lmS3EL5eXtpmSti wotphlvK9sPbXJ;
    public DgfWFHNhxstn87SPuN D5P1xCAyuvgF;
    public int[] Ee8d2j4S9Vm5yGuR;
    public int[] JXn4Qf7zpnLjP5;
    public int b1EoSIRjJHO5;
    public boolean gIIiyi2ddlMDR0;
    public DgfWFHNhxstn87SPuN gmNWMfvn6zlEj;
    public wTK1iFOiEb9QB hjneShqpF9Tis4;
    public int ibVTtJUNfrGYbW;
    public int pyu8ovAipBTLYAiKab;
    public Object[] vekpFI4d1Nc4fakF;
    public Object[] w9sT1Swbhx3hs;
    public int xDyLpEZyrcKVe0;

    static {
        lmS3EL5eXtpmSti lms3el5extpmsti = new lmS3EL5eXtpmSti(0);
        lms3el5extpmsti.gIIiyi2ddlMDR0 = true;
        wotphlvK9sPbXJ = lms3el5extpmsti;
    }

    public lmS3EL5eXtpmSti() {
        this(8);
    }

    public final int Ee8d2j4S9Vm5yGuR(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.b1EoSIRjJHO5;
    }

    public final int JXn4Qf7zpnLjP5(Object obj) {
        int iEe8d2j4S9Vm5yGuR = Ee8d2j4S9Vm5yGuR(obj);
        int i = this.xDyLpEZyrcKVe0;
        while (true) {
            int i2 = this.Ee8d2j4S9Vm5yGuR[iEe8d2j4S9Vm5yGuR];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.w9sT1Swbhx3hs[i3], obj)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iEe8d2j4S9Vm5yGuR = iEe8d2j4S9Vm5yGuR == 0 ? this.Ee8d2j4S9Vm5yGuR.length - 1 : iEe8d2j4S9Vm5yGuR - 1;
        }
    }

    @Override // java.util.Map
    public final void clear() {
        w9sT1Swbhx3hs();
        xH380dEhDsa5zwemTP it = new VUjeMiNYIJhgmVJopga(0, this.ibVTtJUNfrGYbW - 1, 1).iterator();
        while (it.JXn4Qf7zpnLjP5) {
            int iNextInt = it.nextInt();
            int[] iArr = this.JXn4Qf7zpnLjP5;
            int i = iArr[iNextInt];
            if (i >= 0) {
                this.Ee8d2j4S9Vm5yGuR[i] = 0;
                iArr[iNextInt] = -1;
            }
        }
        gA5gCwTK0qjTIn.DVTNwpDEVsUKuznof(this.w9sT1Swbhx3hs, 0, this.ibVTtJUNfrGYbW);
        Object[] objArr = this.vekpFI4d1Nc4fakF;
        if (objArr != null) {
            gA5gCwTK0qjTIn.DVTNwpDEVsUKuznof(objArr, 0, this.ibVTtJUNfrGYbW);
        }
        this.pyu8ovAipBTLYAiKab = 0;
        this.ibVTtJUNfrGYbW = 0;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return JXn4Qf7zpnLjP5(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        int i;
        int i2 = this.ibVTtJUNfrGYbW;
        while (true) {
            i = -1;
            i2--;
            if (i2 >= 0) {
                if (this.JXn4Qf7zpnLjP5[i2] >= 0 && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.vekpFI4d1Nc4fakF[i2], obj)) {
                    i = i2;
                    break;
                }
            } else {
                break;
            }
        }
        return i >= 0;
    }

    public final int dDIMxZXP1V8HdM(Object obj) {
        w9sT1Swbhx3hs();
        while (true) {
            int iEe8d2j4S9Vm5yGuR = Ee8d2j4S9Vm5yGuR(obj);
            int i = this.xDyLpEZyrcKVe0 * 2;
            int length = this.Ee8d2j4S9Vm5yGuR.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.Ee8d2j4S9Vm5yGuR;
                int i3 = iArr[iEe8d2j4S9Vm5yGuR];
                if (i3 <= 0) {
                    int i4 = this.ibVTtJUNfrGYbW;
                    Object[] objArr = this.w9sT1Swbhx3hs;
                    if (i4 >= objArr.length) {
                        vekpFI4d1Nc4fakF(1);
                        break;
                    }
                    int i5 = i4 + 1;
                    this.ibVTtJUNfrGYbW = i5;
                    objArr[i4] = obj;
                    this.JXn4Qf7zpnLjP5[i4] = iEe8d2j4S9Vm5yGuR;
                    iArr[iEe8d2j4S9Vm5yGuR] = i5;
                    this.pyu8ovAipBTLYAiKab++;
                    if (i2 > this.xDyLpEZyrcKVe0) {
                        this.xDyLpEZyrcKVe0 = i2;
                    }
                    return i4;
                }
                if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.w9sT1Swbhx3hs[i3 - 1], obj)) {
                    return -i3;
                }
                i2++;
                if (i2 > i) {
                    xDyLpEZyrcKVe0(this.Ee8d2j4S9Vm5yGuR.length * 2);
                    break;
                }
                iEe8d2j4S9Vm5yGuR = iEe8d2j4S9Vm5yGuR == 0 ? this.Ee8d2j4S9Vm5yGuR.length - 1 : iEe8d2j4S9Vm5yGuR - 1;
            }
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        DgfWFHNhxstn87SPuN dgfWFHNhxstn87SPuN = this.gmNWMfvn6zlEj;
        if (dgfWFHNhxstn87SPuN != null) {
            return dgfWFHNhxstn87SPuN;
        }
        DgfWFHNhxstn87SPuN dgfWFHNhxstn87SPuN2 = new DgfWFHNhxstn87SPuN(this, 0);
        this.gmNWMfvn6zlEj = dgfWFHNhxstn87SPuN2;
        return dgfWFHNhxstn87SPuN2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        boolean z;
        Map.Entry entry;
        int iJXn4Qf7zpnLjP5;
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.pyu8ovAipBTLYAiKab == map.size()) {
                    Iterator it = map.entrySet().iterator();
                    do {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (next == null) {
                                break;
                            }
                            try {
                                entry = (Map.Entry) next;
                                iJXn4Qf7zpnLjP5 = JXn4Qf7zpnLjP5(entry.getKey());
                            } catch (ClassCastException unused) {
                            }
                        } else {
                            z = true;
                        }
                        if (z) {
                        }
                    } while (iJXn4Qf7zpnLjP5 < 0 ? false : okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.vekpFI4d1Nc4fakF[iJXn4Qf7zpnLjP5], entry.getValue()));
                    z = false;
                    if (z) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iJXn4Qf7zpnLjP5 = JXn4Qf7zpnLjP5(obj);
        if (iJXn4Qf7zpnLjP5 < 0) {
            return null;
        }
        return this.vekpFI4d1Nc4fakF[iJXn4Qf7zpnLjP5];
    }

    @Override // java.util.Map
    public final int hashCode() {
        PajExCRgG5Vm pajExCRgG5Vm = new PajExCRgG5Vm(this, 0);
        int i = 0;
        while (pajExCRgG5Vm.hasNext()) {
            int i2 = pajExCRgG5Vm.vekpFI4d1Nc4fakF;
            lmS3EL5eXtpmSti lms3el5extpmsti = pajExCRgG5Vm.w9sT1Swbhx3hs;
            if (i2 >= lms3el5extpmsti.ibVTtJUNfrGYbW) {
                throw new NoSuchElementException();
            }
            pajExCRgG5Vm.vekpFI4d1Nc4fakF = i2 + 1;
            pajExCRgG5Vm.JXn4Qf7zpnLjP5 = i2;
            Object obj = lms3el5extpmsti.w9sT1Swbhx3hs[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object obj2 = lms3el5extpmsti.vekpFI4d1Nc4fakF[pajExCRgG5Vm.JXn4Qf7zpnLjP5];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            pajExCRgG5Vm.dDIMxZXP1V8HdM();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    public final void ibVTtJUNfrGYbW(int i) {
        this.w9sT1Swbhx3hs[i] = null;
        int length = this.JXn4Qf7zpnLjP5[i];
        int i2 = this.xDyLpEZyrcKVe0 * 2;
        int length2 = this.Ee8d2j4S9Vm5yGuR.length / 2;
        if (i2 > length2) {
            i2 = length2;
        }
        int i3 = i2;
        int i4 = 0;
        int i5 = length;
        do {
            length = length == 0 ? this.Ee8d2j4S9Vm5yGuR.length - 1 : length - 1;
            i4++;
            if (i4 > this.xDyLpEZyrcKVe0) {
                this.Ee8d2j4S9Vm5yGuR[i5] = 0;
            } else {
                int[] iArr = this.Ee8d2j4S9Vm5yGuR;
                int i6 = iArr[length];
                if (i6 == 0) {
                    iArr[i5] = 0;
                } else {
                    if (i6 < 0) {
                        iArr[i5] = -1;
                    } else {
                        int i7 = i6 - 1;
                        int iEe8d2j4S9Vm5yGuR = Ee8d2j4S9Vm5yGuR(this.w9sT1Swbhx3hs[i7]) - length;
                        int[] iArr2 = this.Ee8d2j4S9Vm5yGuR;
                        if ((iEe8d2j4S9Vm5yGuR & (iArr2.length - 1)) >= i4) {
                            iArr2[i5] = i6;
                            this.JXn4Qf7zpnLjP5[i7] = i5;
                        }
                        i3--;
                    }
                    i5 = length;
                    i4 = 0;
                    i3--;
                }
            }
            this.JXn4Qf7zpnLjP5[i] = -1;
            this.pyu8ovAipBTLYAiKab--;
        } while (i3 >= 0);
        this.Ee8d2j4S9Vm5yGuR[i5] = -1;
        this.JXn4Qf7zpnLjP5[i] = -1;
        this.pyu8ovAipBTLYAiKab--;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.pyu8ovAipBTLYAiKab == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        DgfWFHNhxstn87SPuN dgfWFHNhxstn87SPuN = this.D5P1xCAyuvgF;
        if (dgfWFHNhxstn87SPuN != null) {
            return dgfWFHNhxstn87SPuN;
        }
        DgfWFHNhxstn87SPuN dgfWFHNhxstn87SPuN2 = new DgfWFHNhxstn87SPuN(this, 1);
        this.D5P1xCAyuvgF = dgfWFHNhxstn87SPuN2;
        return dgfWFHNhxstn87SPuN2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        w9sT1Swbhx3hs();
        int iDDIMxZXP1V8HdM = dDIMxZXP1V8HdM(obj);
        Object[] objArr = this.vekpFI4d1Nc4fakF;
        if (objArr == null) {
            int length = this.w9sT1Swbhx3hs.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.vekpFI4d1Nc4fakF = objArr;
        }
        if (iDDIMxZXP1V8HdM >= 0) {
            objArr[iDDIMxZXP1V8HdM] = obj2;
            return null;
        }
        int i = (-iDDIMxZXP1V8HdM) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        w9sT1Swbhx3hs();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        vekpFI4d1Nc4fakF(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iDDIMxZXP1V8HdM = dDIMxZXP1V8HdM(entry.getKey());
            Object[] objArr = this.vekpFI4d1Nc4fakF;
            if (objArr == null) {
                int length = this.w9sT1Swbhx3hs.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.vekpFI4d1Nc4fakF = objArr;
            }
            if (iDDIMxZXP1V8HdM >= 0) {
                objArr[iDDIMxZXP1V8HdM] = entry.getValue();
            } else {
                int i = (-iDDIMxZXP1V8HdM) - 1;
                if (!okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        w9sT1Swbhx3hs();
        int iJXn4Qf7zpnLjP5 = JXn4Qf7zpnLjP5(obj);
        if (iJXn4Qf7zpnLjP5 < 0) {
            iJXn4Qf7zpnLjP5 = -1;
        } else {
            ibVTtJUNfrGYbW(iJXn4Qf7zpnLjP5);
        }
        if (iJXn4Qf7zpnLjP5 < 0) {
            return null;
        }
        Object[] objArr = this.vekpFI4d1Nc4fakF;
        Object obj2 = objArr[iJXn4Qf7zpnLjP5];
        objArr[iJXn4Qf7zpnLjP5] = null;
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.pyu8ovAipBTLYAiKab;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.pyu8ovAipBTLYAiKab * 3) + 2);
        sb.append("{");
        int i = 0;
        PajExCRgG5Vm pajExCRgG5Vm = new PajExCRgG5Vm(this, 0);
        while (pajExCRgG5Vm.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = pajExCRgG5Vm.vekpFI4d1Nc4fakF;
            lmS3EL5eXtpmSti lms3el5extpmsti = pajExCRgG5Vm.w9sT1Swbhx3hs;
            if (i2 >= lms3el5extpmsti.ibVTtJUNfrGYbW) {
                throw new NoSuchElementException();
            }
            pajExCRgG5Vm.vekpFI4d1Nc4fakF = i2 + 1;
            pajExCRgG5Vm.JXn4Qf7zpnLjP5 = i2;
            Object obj = lms3el5extpmsti.w9sT1Swbhx3hs[i2];
            if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(obj, lms3el5extpmsti)) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object obj2 = lms3el5extpmsti.vekpFI4d1Nc4fakF[pajExCRgG5Vm.JXn4Qf7zpnLjP5];
            if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(obj2, lms3el5extpmsti)) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            pajExCRgG5Vm.dDIMxZXP1V8HdM();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        wTK1iFOiEb9QB wtk1ifoieb9qb = this.hjneShqpF9Tis4;
        if (wtk1ifoieb9qb != null) {
            return wtk1ifoieb9qb;
        }
        wTK1iFOiEb9QB wtk1ifoieb9qb2 = new wTK1iFOiEb9QB(this);
        this.hjneShqpF9Tis4 = wtk1ifoieb9qb2;
        return wtk1ifoieb9qb2;
    }

    public final void vekpFI4d1Nc4fakF(int i) {
        Object[] objArr = this.w9sT1Swbhx3hs;
        int length = objArr.length;
        int i2 = this.ibVTtJUNfrGYbW;
        int i3 = length - i2;
        int i4 = i2 - this.pyu8ovAipBTLYAiKab;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            xDyLpEZyrcKVe0(this.Ee8d2j4S9Vm5yGuR.length);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            int length2 = (objArr.length * 3) / 2;
            if (i5 <= length2) {
                i5 = length2;
            }
            this.w9sT1Swbhx3hs = Arrays.copyOf(objArr, i5);
            Object[] objArr2 = this.vekpFI4d1Nc4fakF;
            this.vekpFI4d1Nc4fakF = objArr2 != null ? Arrays.copyOf(objArr2, i5) : null;
            this.JXn4Qf7zpnLjP5 = Arrays.copyOf(this.JXn4Qf7zpnLjP5, i5);
            if (i5 < 1) {
                i5 = 1;
            }
            int iHighestOneBit = Integer.highestOneBit(i5 * 3);
            if (iHighestOneBit > this.Ee8d2j4S9Vm5yGuR.length) {
                xDyLpEZyrcKVe0(iHighestOneBit);
            }
        }
    }

    public final void w9sT1Swbhx3hs() {
        if (this.gIIiyi2ddlMDR0) {
            throw new UnsupportedOperationException();
        }
    }

    public final void xDyLpEZyrcKVe0(int i) {
        int[] iArr;
        int i2;
        int i3 = 0;
        if (this.ibVTtJUNfrGYbW > this.pyu8ovAipBTLYAiKab) {
            Object[] objArr = this.vekpFI4d1Nc4fakF;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                i2 = this.ibVTtJUNfrGYbW;
                if (i4 >= i2) {
                    break;
                }
                if (this.JXn4Qf7zpnLjP5[i4] >= 0) {
                    Object[] objArr2 = this.w9sT1Swbhx3hs;
                    objArr2[i5] = objArr2[i4];
                    if (objArr != null) {
                        objArr[i5] = objArr[i4];
                    }
                    i5++;
                }
                i4++;
            }
            gA5gCwTK0qjTIn.DVTNwpDEVsUKuznof(this.w9sT1Swbhx3hs, i5, i2);
            if (objArr != null) {
                gA5gCwTK0qjTIn.DVTNwpDEVsUKuznof(objArr, i5, this.ibVTtJUNfrGYbW);
            }
            this.ibVTtJUNfrGYbW = i5;
        }
        int[] iArr2 = this.Ee8d2j4S9Vm5yGuR;
        if (i != iArr2.length) {
            this.Ee8d2j4S9Vm5yGuR = new int[i];
            this.b1EoSIRjJHO5 = Integer.numberOfLeadingZeros(i) + 1;
        } else {
            Arrays.fill(iArr2, 0, iArr2.length, 0);
        }
        while (i3 < this.ibVTtJUNfrGYbW) {
            int i6 = i3 + 1;
            int iEe8d2j4S9Vm5yGuR = Ee8d2j4S9Vm5yGuR(this.w9sT1Swbhx3hs[i3]);
            int i7 = this.xDyLpEZyrcKVe0;
            while (true) {
                iArr = this.Ee8d2j4S9Vm5yGuR;
                if (iArr[iEe8d2j4S9Vm5yGuR] == 0) {
                    break;
                }
                i7--;
                if (i7 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                iEe8d2j4S9Vm5yGuR = iEe8d2j4S9Vm5yGuR == 0 ? iArr.length - 1 : iEe8d2j4S9Vm5yGuR - 1;
            }
            iArr[iEe8d2j4S9Vm5yGuR] = i6;
            this.JXn4Qf7zpnLjP5[i3] = iEe8d2j4S9Vm5yGuR;
            i3 = i6;
        }
    }

    public lmS3EL5eXtpmSti(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.w9sT1Swbhx3hs = objArr;
        this.vekpFI4d1Nc4fakF = null;
        this.JXn4Qf7zpnLjP5 = iArr;
        this.Ee8d2j4S9Vm5yGuR = new int[iHighestOneBit];
        this.xDyLpEZyrcKVe0 = 2;
        this.ibVTtJUNfrGYbW = 0;
        this.b1EoSIRjJHO5 = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }
}
