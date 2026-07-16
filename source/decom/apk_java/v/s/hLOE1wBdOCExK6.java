package v.s;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class hLOE1wBdOCExK6 implements Iterator, Map.Entry {
    public final /* synthetic */ HjYi3nnbLmeB1CrY5tes Ee8d2j4S9Vm5yGuR;
    public boolean JXn4Qf7zpnLjP5 = false;
    public int vekpFI4d1Nc4fakF = -1;
    public int w9sT1Swbhx3hs;

    public hLOE1wBdOCExK6(HjYi3nnbLmeB1CrY5tes hjYi3nnbLmeB1CrY5tes) {
        this.Ee8d2j4S9Vm5yGuR = hjYi3nnbLmeB1CrY5tes;
        this.w9sT1Swbhx3hs = hjYi3nnbLmeB1CrY5tes.Ee8d2j4S9Vm5yGuR() - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.JXn4Qf7zpnLjP5) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.vekpFI4d1Nc4fakF;
        HjYi3nnbLmeB1CrY5tes hjYi3nnbLmeB1CrY5tes = this.Ee8d2j4S9Vm5yGuR;
        Object objVekpFI4d1Nc4fakF = hjYi3nnbLmeB1CrY5tes.vekpFI4d1Nc4fakF(i, 0);
        if (key != objVekpFI4d1Nc4fakF && (key == null || !key.equals(objVekpFI4d1Nc4fakF))) {
            return false;
        }
        Object value = entry.getValue();
        Object objVekpFI4d1Nc4fakF2 = hjYi3nnbLmeB1CrY5tes.vekpFI4d1Nc4fakF(this.vekpFI4d1Nc4fakF, 1);
        return value == objVekpFI4d1Nc4fakF2 || (value != null && value.equals(objVekpFI4d1Nc4fakF2));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!this.JXn4Qf7zpnLjP5) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.Ee8d2j4S9Vm5yGuR.vekpFI4d1Nc4fakF(this.vekpFI4d1Nc4fakF, 0);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!this.JXn4Qf7zpnLjP5) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.Ee8d2j4S9Vm5yGuR.vekpFI4d1Nc4fakF(this.vekpFI4d1Nc4fakF, 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.vekpFI4d1Nc4fakF < this.w9sT1Swbhx3hs;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.JXn4Qf7zpnLjP5) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.vekpFI4d1Nc4fakF;
        HjYi3nnbLmeB1CrY5tes hjYi3nnbLmeB1CrY5tes = this.Ee8d2j4S9Vm5yGuR;
        Object objVekpFI4d1Nc4fakF = hjYi3nnbLmeB1CrY5tes.vekpFI4d1Nc4fakF(i, 0);
        Object objVekpFI4d1Nc4fakF2 = hjYi3nnbLmeB1CrY5tes.vekpFI4d1Nc4fakF(this.vekpFI4d1Nc4fakF, 1);
        return (objVekpFI4d1Nc4fakF == null ? 0 : objVekpFI4d1Nc4fakF.hashCode()) ^ (objVekpFI4d1Nc4fakF2 != null ? objVekpFI4d1Nc4fakF2.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.vekpFI4d1Nc4fakF++;
        this.JXn4Qf7zpnLjP5 = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.JXn4Qf7zpnLjP5) {
            throw new IllegalStateException();
        }
        this.Ee8d2j4S9Vm5yGuR.pyu8ovAipBTLYAiKab(this.vekpFI4d1Nc4fakF);
        this.vekpFI4d1Nc4fakF--;
        this.w9sT1Swbhx3hs--;
        this.JXn4Qf7zpnLjP5 = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.JXn4Qf7zpnLjP5) {
            return this.Ee8d2j4S9Vm5yGuR.D5P1xCAyuvgF(this.vekpFI4d1Nc4fakF, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
