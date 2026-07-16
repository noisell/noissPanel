package v.s;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class PajExCRgG5Vm implements Iterator, buUjKwCmuWSvVXs {
    public final /* synthetic */ int Ee8d2j4S9Vm5yGuR;
    public int JXn4Qf7zpnLjP5 = -1;
    public int vekpFI4d1Nc4fakF;
    public final lmS3EL5eXtpmSti w9sT1Swbhx3hs;

    public PajExCRgG5Vm(lmS3EL5eXtpmSti lms3el5extpmsti, int i) {
        this.Ee8d2j4S9Vm5yGuR = i;
        this.w9sT1Swbhx3hs = lms3el5extpmsti;
        dDIMxZXP1V8HdM();
    }

    private static /* synthetic */ void fibk() {
    }

    public final void dDIMxZXP1V8HdM() {
        while (true) {
            int i = this.vekpFI4d1Nc4fakF;
            lmS3EL5eXtpmSti lms3el5extpmsti = this.w9sT1Swbhx3hs;
            if (i >= lms3el5extpmsti.ibVTtJUNfrGYbW || lms3el5extpmsti.JXn4Qf7zpnLjP5[i] >= 0) {
                return;
            } else {
                this.vekpFI4d1Nc4fakF = i + 1;
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.vekpFI4d1Nc4fakF < this.w9sT1Swbhx3hs.ibVTtJUNfrGYbW;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.Ee8d2j4S9Vm5yGuR) {
            case 0:
                int i = this.vekpFI4d1Nc4fakF;
                lmS3EL5eXtpmSti lms3el5extpmsti = this.w9sT1Swbhx3hs;
                if (i >= lms3el5extpmsti.ibVTtJUNfrGYbW) {
                    throw new NoSuchElementException();
                }
                this.vekpFI4d1Nc4fakF = i + 1;
                this.JXn4Qf7zpnLjP5 = i;
                AeZLb8bvhjbhq aeZLb8bvhjbhq = new AeZLb8bvhjbhq(lms3el5extpmsti, i);
                dDIMxZXP1V8HdM();
                return aeZLb8bvhjbhq;
            case 1:
                int i2 = this.vekpFI4d1Nc4fakF;
                lmS3EL5eXtpmSti lms3el5extpmsti2 = this.w9sT1Swbhx3hs;
                if (i2 >= lms3el5extpmsti2.ibVTtJUNfrGYbW) {
                    throw new NoSuchElementException();
                }
                this.vekpFI4d1Nc4fakF = i2 + 1;
                this.JXn4Qf7zpnLjP5 = i2;
                Object obj = lms3el5extpmsti2.w9sT1Swbhx3hs[i2];
                dDIMxZXP1V8HdM();
                return obj;
            default:
                int i3 = this.vekpFI4d1Nc4fakF;
                lmS3EL5eXtpmSti lms3el5extpmsti3 = this.w9sT1Swbhx3hs;
                if (i3 >= lms3el5extpmsti3.ibVTtJUNfrGYbW) {
                    throw new NoSuchElementException();
                }
                this.vekpFI4d1Nc4fakF = i3 + 1;
                this.JXn4Qf7zpnLjP5 = i3;
                Object obj2 = lms3el5extpmsti3.vekpFI4d1Nc4fakF[i3];
                dDIMxZXP1V8HdM();
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.JXn4Qf7zpnLjP5 == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        lmS3EL5eXtpmSti lms3el5extpmsti = this.w9sT1Swbhx3hs;
        lms3el5extpmsti.w9sT1Swbhx3hs();
        lms3el5extpmsti.ibVTtJUNfrGYbW(this.JXn4Qf7zpnLjP5);
        this.JXn4Qf7zpnLjP5 = -1;
    }
}
