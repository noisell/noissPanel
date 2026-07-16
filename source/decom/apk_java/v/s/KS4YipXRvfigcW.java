package v.s;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class KS4YipXRvfigcW implements Iterator, buUjKwCmuWSvVXs {
    public final /* synthetic */ OxLFCGMMwTLJfW Ee8d2j4S9Vm5yGuR;
    public final ArrayDeque JXn4Qf7zpnLjP5;
    public File vekpFI4d1Nc4fakF;
    public int w9sT1Swbhx3hs;

    public KS4YipXRvfigcW(OxLFCGMMwTLJfW oxLFCGMMwTLJfW) {
        this.Ee8d2j4S9Vm5yGuR = oxLFCGMMwTLJfW;
        this.w9sT1Swbhx3hs = 2;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.JXn4Qf7zpnLjP5 = arrayDeque;
        File file = oxLFCGMMwTLJfW.dDIMxZXP1V8HdM;
        if (file.isDirectory()) {
            arrayDeque.push(dDIMxZXP1V8HdM(file));
        } else if (file.isFile()) {
            arrayDeque.push(new zaEFzxAYacmip8QFX15(file));
        } else {
            this.w9sT1Swbhx3hs = 3;
        }
    }

    public final wA1wgbvy8fId8a dDIMxZXP1V8HdM(File file) {
        int iJ0zjQ7CAgohuxU20eCW6 = Y9mRyRdkl5FOcwb66V6.J0zjQ7CAgohuxU20eCW6(this.Ee8d2j4S9Vm5yGuR.w9sT1Swbhx3hs);
        if (iJ0zjQ7CAgohuxU20eCW6 == 0) {
            return new EhHlMwmHiuOWUADRbJs5(file);
        }
        if (iJ0zjQ7CAgohuxU20eCW6 == 1) {
            return new nYZgHCBzizEbbKO8(file);
        }
        throw new Sb7Xj3N9U1DQ();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        File file;
        int i = this.w9sT1Swbhx3hs;
        if (i == 4) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int iJ0zjQ7CAgohuxU20eCW6 = Y9mRyRdkl5FOcwb66V6.J0zjQ7CAgohuxU20eCW6(i);
        if (iJ0zjQ7CAgohuxU20eCW6 != 0) {
            if (iJ0zjQ7CAgohuxU20eCW6 == 2) {
                return false;
            }
            this.w9sT1Swbhx3hs = 4;
            while (true) {
                ArrayDeque arrayDeque = this.JXn4Qf7zpnLjP5;
                BWK2ncTYuVFSp bWK2ncTYuVFSp = (BWK2ncTYuVFSp) arrayDeque.peek();
                if (bWK2ncTYuVFSp == null) {
                    file = null;
                    break;
                }
                File fileDDIMxZXP1V8HdM = bWK2ncTYuVFSp.dDIMxZXP1V8HdM();
                if (fileDDIMxZXP1V8HdM == null) {
                    arrayDeque.pop();
                } else {
                    if (fileDDIMxZXP1V8HdM.equals(bWK2ncTYuVFSp.dDIMxZXP1V8HdM) || !fileDDIMxZXP1V8HdM.isDirectory() || arrayDeque.size() >= Integer.MAX_VALUE) {
                        file = fileDDIMxZXP1V8HdM;
                        break;
                    }
                    arrayDeque.push(dDIMxZXP1V8HdM(fileDDIMxZXP1V8HdM));
                }
            }
            if (file != null) {
                this.vekpFI4d1Nc4fakF = file;
                this.w9sT1Swbhx3hs = 1;
            } else {
                this.w9sT1Swbhx3hs = 3;
            }
            if (this.w9sT1Swbhx3hs != 1) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.w9sT1Swbhx3hs = 2;
        return this.vekpFI4d1Nc4fakF;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
