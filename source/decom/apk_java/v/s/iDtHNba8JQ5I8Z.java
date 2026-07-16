package v.s;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class iDtHNba8JQ5I8Z {
    public int ibVTtJUNfrGYbW;
    public final ZHKD3ddbUALiCxl vekpFI4d1Nc4fakF;
    public int xDyLpEZyrcKVe0;
    public int dDIMxZXP1V8HdM = 4096;
    public final ArrayList w9sT1Swbhx3hs = new ArrayList();
    public RSjkliukrZnQXjh[] JXn4Qf7zpnLjP5 = new RSjkliukrZnQXjh[8];
    public int Ee8d2j4S9Vm5yGuR = 7;

    public iDtHNba8JQ5I8Z(FfMehSALMFdtxtvcE ffMehSALMFdtxtvcE) {
        this.vekpFI4d1Nc4fakF = new ZHKD3ddbUALiCxl(ffMehSALMFdtxtvcE);
    }

    public final int Ee8d2j4S9Vm5yGuR(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte b = this.vekpFI4d1Nc4fakF.readByte();
            byte[] bArr = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
            int i5 = b & 255;
            if ((b & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (b & 127) << i4;
            i4 += 7;
        }
    }

    public final XslKUngIJyofTLpQ5 JXn4Qf7zpnLjP5() {
        ZHKD3ddbUALiCxl zHKD3ddbUALiCxl = this.vekpFI4d1Nc4fakF;
        byte b = zHKD3ddbUALiCxl.readByte();
        byte[] bArr = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
        int i = b & 255;
        int i2 = 0;
        boolean z = (b & 128) == 128;
        long jEe8d2j4S9Vm5yGuR = Ee8d2j4S9Vm5yGuR(i, 69 + 58);
        if (!z) {
            return zHKD3ddbUALiCxl.JXn4Qf7zpnLjP5(jEe8d2j4S9Vm5yGuR);
        }
        LTdvNeHFqTsIb9 lTdvNeHFqTsIb9 = new LTdvNeHFqTsIb9();
        PptKtqDFv7XjzC1Mly6V pptKtqDFv7XjzC1Mly6V = OewXb6QdIQvK4.vekpFI4d1Nc4fakF;
        PptKtqDFv7XjzC1Mly6V pptKtqDFv7XjzC1Mly6V2 = pptKtqDFv7XjzC1Mly6V;
        int i3 = 0;
        for (long j = 0; j < jEe8d2j4S9Vm5yGuR; j++) {
            byte b2 = zHKD3ddbUALiCxl.readByte();
            byte[] bArr2 = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
            i2 = (i2 << 8) | (b2 & 255);
            i3 += 8;
            while (i3 >= 8) {
                pptKtqDFv7XjzC1Mly6V2 = ((PptKtqDFv7XjzC1Mly6V[]) pptKtqDFv7XjzC1Mly6V2.vekpFI4d1Nc4fakF)[(i2 >>> (i3 - 8)) & 255];
                if (((PptKtqDFv7XjzC1Mly6V[]) pptKtqDFv7XjzC1Mly6V2.vekpFI4d1Nc4fakF) == null) {
                    lTdvNeHFqTsIb9.ECwLkmPW1UKz7J6E(pptKtqDFv7XjzC1Mly6V2.dDIMxZXP1V8HdM);
                    i3 -= pptKtqDFv7XjzC1Mly6V2.w9sT1Swbhx3hs;
                    pptKtqDFv7XjzC1Mly6V2 = pptKtqDFv7XjzC1Mly6V;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            PptKtqDFv7XjzC1Mly6V pptKtqDFv7XjzC1Mly6V3 = ((PptKtqDFv7XjzC1Mly6V[]) pptKtqDFv7XjzC1Mly6V2.vekpFI4d1Nc4fakF)[(i2 << (8 - i3)) & 255];
            PptKtqDFv7XjzC1Mly6V[] pptKtqDFv7XjzC1Mly6VArr = (PptKtqDFv7XjzC1Mly6V[]) pptKtqDFv7XjzC1Mly6V3.vekpFI4d1Nc4fakF;
            int i4 = pptKtqDFv7XjzC1Mly6V3.w9sT1Swbhx3hs;
            if (pptKtqDFv7XjzC1Mly6VArr != null || i4 > i3) {
                break;
            }
            lTdvNeHFqTsIb9.ECwLkmPW1UKz7J6E(pptKtqDFv7XjzC1Mly6V3.dDIMxZXP1V8HdM);
            i3 -= i4;
            pptKtqDFv7XjzC1Mly6V2 = pptKtqDFv7XjzC1Mly6V;
        }
        return lTdvNeHFqTsIb9.JXn4Qf7zpnLjP5(lTdvNeHFqTsIb9.vekpFI4d1Nc4fakF);
    }

    public final int dDIMxZXP1V8HdM(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.JXn4Qf7zpnLjP5.length;
            while (true) {
                length--;
                i2 = this.Ee8d2j4S9Vm5yGuR;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.JXn4Qf7zpnLjP5[length].vekpFI4d1Nc4fakF;
                i -= i4;
                this.ibVTtJUNfrGYbW -= i4;
                this.xDyLpEZyrcKVe0--;
                i3++;
            }
            RSjkliukrZnQXjh[] rSjkliukrZnQXjhArr = this.JXn4Qf7zpnLjP5;
            System.arraycopy(rSjkliukrZnQXjhArr, i2 + 1, rSjkliukrZnQXjhArr, i2 + 1 + i3, this.xDyLpEZyrcKVe0);
            this.Ee8d2j4S9Vm5yGuR += i3;
        }
        return i3;
    }

    public final void vekpFI4d1Nc4fakF(RSjkliukrZnQXjh rSjkliukrZnQXjh) {
        this.w9sT1Swbhx3hs.add(rSjkliukrZnQXjh);
        int i = rSjkliukrZnQXjh.vekpFI4d1Nc4fakF;
        int i2 = this.dDIMxZXP1V8HdM;
        if (i > i2) {
            VnDsNIgXNCQywv8lGh.euF5Udt5Rqv3Qmea(this.JXn4Qf7zpnLjP5, null);
            this.Ee8d2j4S9Vm5yGuR = this.JXn4Qf7zpnLjP5.length - 1;
            this.xDyLpEZyrcKVe0 = 0;
            this.ibVTtJUNfrGYbW = 0;
            return;
        }
        dDIMxZXP1V8HdM((this.ibVTtJUNfrGYbW + i) - i2);
        int i3 = this.xDyLpEZyrcKVe0 + 1;
        RSjkliukrZnQXjh[] rSjkliukrZnQXjhArr = this.JXn4Qf7zpnLjP5;
        if (i3 > rSjkliukrZnQXjhArr.length) {
            RSjkliukrZnQXjh[] rSjkliukrZnQXjhArr2 = new RSjkliukrZnQXjh[rSjkliukrZnQXjhArr.length * 2];
            System.arraycopy(rSjkliukrZnQXjhArr, 0, rSjkliukrZnQXjhArr2, rSjkliukrZnQXjhArr.length, rSjkliukrZnQXjhArr.length);
            this.Ee8d2j4S9Vm5yGuR = this.JXn4Qf7zpnLjP5.length - 1;
            this.JXn4Qf7zpnLjP5 = rSjkliukrZnQXjhArr2;
        }
        int i4 = this.Ee8d2j4S9Vm5yGuR;
        this.Ee8d2j4S9Vm5yGuR = i4 - 1;
        this.JXn4Qf7zpnLjP5[i4] = rSjkliukrZnQXjh;
        this.xDyLpEZyrcKVe0++;
        this.ibVTtJUNfrGYbW += i;
    }

    public final XslKUngIJyofTLpQ5 w9sT1Swbhx3hs(int i) throws IOException {
        if (i >= 0) {
            RSjkliukrZnQXjh[] rSjkliukrZnQXjhArr = mwfWxnlFuO8m1ba.dDIMxZXP1V8HdM;
            if (i <= rSjkliukrZnQXjhArr.length - 1) {
                return rSjkliukrZnQXjhArr[i].dDIMxZXP1V8HdM;
            }
        }
        int length = this.Ee8d2j4S9Vm5yGuR + 1 + (i - mwfWxnlFuO8m1ba.dDIMxZXP1V8HdM.length);
        if (length >= 0) {
            RSjkliukrZnQXjh[] rSjkliukrZnQXjhArr2 = this.JXn4Qf7zpnLjP5;
            if (length < rSjkliukrZnQXjhArr2.length) {
                return rSjkliukrZnQXjhArr2[length].dDIMxZXP1V8HdM;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }
}
