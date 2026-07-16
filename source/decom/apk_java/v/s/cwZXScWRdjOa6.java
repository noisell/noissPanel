package v.s;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class cwZXScWRdjOa6 {
    public final boolean Ee8d2j4S9Vm5yGuR;
    public boolean JXn4Qf7zpnLjP5;
    public final byte[] dDIMxZXP1V8HdM;
    public cwZXScWRdjOa6 ibVTtJUNfrGYbW;
    public int vekpFI4d1Nc4fakF;
    public int w9sT1Swbhx3hs;
    public cwZXScWRdjOa6 xDyLpEZyrcKVe0;

    public cwZXScWRdjOa6() {
        this.dDIMxZXP1V8HdM = new byte[8192];
        this.Ee8d2j4S9Vm5yGuR = true;
        this.JXn4Qf7zpnLjP5 = false;
    }

    public final void JXn4Qf7zpnLjP5(cwZXScWRdjOa6 cwzxscwrdjoa6, int i) {
        boolean z = cwzxscwrdjoa6.Ee8d2j4S9Vm5yGuR;
        byte[] bArr = cwzxscwrdjoa6.dDIMxZXP1V8HdM;
        if (!z) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = cwzxscwrdjoa6.vekpFI4d1Nc4fakF;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (cwzxscwrdjoa6.JXn4Qf7zpnLjP5) {
                throw new IllegalArgumentException();
            }
            int i4 = cwzxscwrdjoa6.w9sT1Swbhx3hs;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            VnDsNIgXNCQywv8lGh.k84rwRrqzhrNQ1CdNQ9(bArr, bArr, i4, i2);
            cwzxscwrdjoa6.vekpFI4d1Nc4fakF -= cwzxscwrdjoa6.w9sT1Swbhx3hs;
            cwzxscwrdjoa6.w9sT1Swbhx3hs = 0;
        }
        int i5 = cwzxscwrdjoa6.vekpFI4d1Nc4fakF;
        int i6 = this.w9sT1Swbhx3hs;
        System.arraycopy(this.dDIMxZXP1V8HdM, i6, bArr, i5, (i6 + i) - i6);
        cwzxscwrdjoa6.vekpFI4d1Nc4fakF += i;
        this.w9sT1Swbhx3hs += i;
    }

    public final cwZXScWRdjOa6 dDIMxZXP1V8HdM() {
        cwZXScWRdjOa6 cwzxscwrdjoa6 = this.xDyLpEZyrcKVe0;
        cwZXScWRdjOa6 cwzxscwrdjoa7 = cwzxscwrdjoa6 != this ? cwzxscwrdjoa6 : null;
        cwZXScWRdjOa6 cwzxscwrdjoa8 = this.ibVTtJUNfrGYbW;
        cwzxscwrdjoa8.xDyLpEZyrcKVe0 = cwzxscwrdjoa6;
        this.xDyLpEZyrcKVe0.ibVTtJUNfrGYbW = cwzxscwrdjoa8;
        this.xDyLpEZyrcKVe0 = null;
        this.ibVTtJUNfrGYbW = null;
        return cwzxscwrdjoa7;
    }

    public final cwZXScWRdjOa6 vekpFI4d1Nc4fakF() {
        this.JXn4Qf7zpnLjP5 = true;
        return new cwZXScWRdjOa6(this.dDIMxZXP1V8HdM, this.w9sT1Swbhx3hs, this.vekpFI4d1Nc4fakF, true, false);
    }

    public final void w9sT1Swbhx3hs(cwZXScWRdjOa6 cwzxscwrdjoa6) {
        cwzxscwrdjoa6.ibVTtJUNfrGYbW = this;
        cwzxscwrdjoa6.xDyLpEZyrcKVe0 = this.xDyLpEZyrcKVe0;
        this.xDyLpEZyrcKVe0.ibVTtJUNfrGYbW = cwzxscwrdjoa6;
        this.xDyLpEZyrcKVe0 = cwzxscwrdjoa6;
    }

    public cwZXScWRdjOa6(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.dDIMxZXP1V8HdM = bArr;
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = i2;
        this.JXn4Qf7zpnLjP5 = z;
        this.Ee8d2j4S9Vm5yGuR = z2;
    }
}
