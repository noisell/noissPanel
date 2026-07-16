package v.s;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class nQilHWaqS401ZtR implements Iterator, buUjKwCmuWSvVXs {
    public final Object JXn4Qf7zpnLjP5;
    public int vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs;

    public /* synthetic */ nQilHWaqS401ZtR(int i, Object obj) {
        this.w9sT1Swbhx3hs = i;
        this.JXn4Qf7zpnLjP5 = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                return this.vekpFI4d1Nc4fakF < ((XiR1pIn5878vVWd) this.JXn4Qf7zpnLjP5).dDIMxZXP1V8HdM();
            case 1:
                return this.vekpFI4d1Nc4fakF < ((Object[]) this.JXn4Qf7zpnLjP5).length;
            default:
                Iterator it = (Iterator) this.JXn4Qf7zpnLjP5;
                while (this.vekpFI4d1Nc4fakF > 0 && it.hasNext()) {
                    it.next();
                    this.vekpFI4d1Nc4fakF--;
                }
                return it.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XiR1pIn5878vVWd xiR1pIn5878vVWd = (XiR1pIn5878vVWd) this.JXn4Qf7zpnLjP5;
                int i = this.vekpFI4d1Nc4fakF;
                this.vekpFI4d1Nc4fakF = i + 1;
                return xiR1pIn5878vVWd.get(i);
            case 1:
                try {
                    Object[] objArr = (Object[]) this.JXn4Qf7zpnLjP5;
                    int i2 = this.vekpFI4d1Nc4fakF;
                    this.vekpFI4d1Nc4fakF = i2 + 1;
                    return objArr[i2];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.vekpFI4d1Nc4fakF--;
                    throw new NoSuchElementException(e.getMessage());
                }
            default:
                Iterator it = (Iterator) this.JXn4Qf7zpnLjP5;
                while (this.vekpFI4d1Nc4fakF > 0 && it.hasNext()) {
                    it.next();
                    this.vekpFI4d1Nc4fakF--;
                }
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public nQilHWaqS401ZtR(TbY18sjR58Uvfbm tbY18sjR58Uvfbm) {
        this.w9sT1Swbhx3hs = 2;
        this.JXn4Qf7zpnLjP5 = tbY18sjR58Uvfbm.dDIMxZXP1V8HdM.iterator();
        this.vekpFI4d1Nc4fakF = tbY18sjR58Uvfbm.w9sT1Swbhx3hs;
    }
}
