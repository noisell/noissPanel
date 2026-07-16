package v.s;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class IUoLUUMj5JfAg {
    public int b1EoSIRjJHO5;
    public final LTdvNeHFqTsIb9 dDIMxZXP1V8HdM;
    public int ibVTtJUNfrGYbW;
    public boolean vekpFI4d1Nc4fakF;
    public int w9sT1Swbhx3hs = Integer.MAX_VALUE;
    public int JXn4Qf7zpnLjP5 = 4096;
    public RSjkliukrZnQXjh[] Ee8d2j4S9Vm5yGuR = new RSjkliukrZnQXjh[8];
    public int xDyLpEZyrcKVe0 = 7;

    public IUoLUUMj5JfAg(LTdvNeHFqTsIb9 lTdvNeHFqTsIb9) {
        this.dDIMxZXP1V8HdM = lTdvNeHFqTsIb9;
    }

    private static /* synthetic */ void ytpuq() {
    }

    public final void Ee8d2j4S9Vm5yGuR(int i, int i2, int i3) {
        LTdvNeHFqTsIb9 lTdvNeHFqTsIb9 = this.dDIMxZXP1V8HdM;
        if (i < i2) {
            lTdvNeHFqTsIb9.ECwLkmPW1UKz7J6E(i | i3);
            return;
        }
        lTdvNeHFqTsIb9.ECwLkmPW1UKz7J6E(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            lTdvNeHFqTsIb9.ECwLkmPW1UKz7J6E(128 | (i4 & 127));
            i4 >>>= 7;
        }
        lTdvNeHFqTsIb9.ECwLkmPW1UKz7J6E(i4);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007a  */
    public final void JXn4Qf7zpnLjP5(ArrayList arrayList) throws EOFException {
        int length;
        int length2;
        if (this.vekpFI4d1Nc4fakF) {
            int i = this.w9sT1Swbhx3hs;
            int i2 = 19 + 13;
            if (i < this.JXn4Qf7zpnLjP5) {
                Ee8d2j4S9Vm5yGuR(i, 31, i2);
            }
            this.vekpFI4d1Nc4fakF = false;
            this.w9sT1Swbhx3hs = Integer.MAX_VALUE;
            Ee8d2j4S9Vm5yGuR(this.JXn4Qf7zpnLjP5, 31, i2);
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            RSjkliukrZnQXjh rSjkliukrZnQXjh = (RSjkliukrZnQXjh) arrayList.get(i3);
            XslKUngIJyofTLpQ5 xslKUngIJyofTLpQ5Pyu8ovAipBTLYAiKab = rSjkliukrZnQXjh.dDIMxZXP1V8HdM.pyu8ovAipBTLYAiKab();
            XslKUngIJyofTLpQ5 xslKUngIJyofTLpQ5 = rSjkliukrZnQXjh.w9sT1Swbhx3hs;
            Integer num = (Integer) mwfWxnlFuO8m1ba.w9sT1Swbhx3hs.get(xslKUngIJyofTLpQ5Pyu8ovAipBTLYAiKab);
            if (num != null) {
                int iIntValue = num.intValue();
                length2 = iIntValue + 1;
                if (2 > length2 || length2 >= 8) {
                    length = length2;
                    length2 = -1;
                } else {
                    RSjkliukrZnQXjh[] rSjkliukrZnQXjhArr = mwfWxnlFuO8m1ba.dDIMxZXP1V8HdM;
                    if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(rSjkliukrZnQXjhArr[iIntValue].w9sT1Swbhx3hs, xslKUngIJyofTLpQ5)) {
                        length = length2;
                    } else if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(rSjkliukrZnQXjhArr[length2].w9sT1Swbhx3hs, xslKUngIJyofTLpQ5)) {
                        length2 = iIntValue + 2;
                        length = length2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                }
            } else {
                length = -1;
                length2 = -1;
            }
            if (length2 == -1) {
                int length3 = this.Ee8d2j4S9Vm5yGuR.length;
                for (int i4 = this.xDyLpEZyrcKVe0 + 1; i4 < length3; i4++) {
                    if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.Ee8d2j4S9Vm5yGuR[i4].dDIMxZXP1V8HdM, xslKUngIJyofTLpQ5Pyu8ovAipBTLYAiKab)) {
                        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.Ee8d2j4S9Vm5yGuR[i4].w9sT1Swbhx3hs, xslKUngIJyofTLpQ5)) {
                            length2 = mwfWxnlFuO8m1ba.dDIMxZXP1V8HdM.length + (i4 - this.xDyLpEZyrcKVe0);
                            break;
                        } else if (length == -1) {
                            length = (i4 - this.xDyLpEZyrcKVe0) + mwfWxnlFuO8m1ba.dDIMxZXP1V8HdM.length;
                        }
                    }
                }
            }
            if (length2 != -1) {
                Ee8d2j4S9Vm5yGuR(length2, 127, 128);
            } else if (length == -1) {
                this.dDIMxZXP1V8HdM.ECwLkmPW1UKz7J6E(64);
                vekpFI4d1Nc4fakF(xslKUngIJyofTLpQ5Pyu8ovAipBTLYAiKab);
                vekpFI4d1Nc4fakF(xslKUngIJyofTLpQ5);
                w9sT1Swbhx3hs(rSjkliukrZnQXjh);
            } else {
                XslKUngIJyofTLpQ5 xslKUngIJyofTLpQ6 = RSjkliukrZnQXjh.JXn4Qf7zpnLjP5;
                xslKUngIJyofTLpQ5Pyu8ovAipBTLYAiKab.getClass();
                if (!xslKUngIJyofTLpQ5Pyu8ovAipBTLYAiKab.ibVTtJUNfrGYbW(xslKUngIJyofTLpQ6.vekpFI4d1Nc4fakF(), xslKUngIJyofTLpQ6) || okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(RSjkliukrZnQXjh.pyu8ovAipBTLYAiKab, xslKUngIJyofTLpQ5Pyu8ovAipBTLYAiKab)) {
                    Ee8d2j4S9Vm5yGuR(length, 63, 64);
                    vekpFI4d1Nc4fakF(xslKUngIJyofTLpQ5);
                    w9sT1Swbhx3hs(rSjkliukrZnQXjh);
                } else {
                    Ee8d2j4S9Vm5yGuR(length, 15, 0);
                    vekpFI4d1Nc4fakF(xslKUngIJyofTLpQ5);
                }
            }
        }
    }

    public final void dDIMxZXP1V8HdM(int i) {
        int i2;
        if (i > 0) {
            int length = this.Ee8d2j4S9Vm5yGuR.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.xDyLpEZyrcKVe0;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.Ee8d2j4S9Vm5yGuR[length].vekpFI4d1Nc4fakF;
                i -= i4;
                this.b1EoSIRjJHO5 -= i4;
                this.ibVTtJUNfrGYbW--;
                i3++;
                length--;
            }
            RSjkliukrZnQXjh[] rSjkliukrZnQXjhArr = this.Ee8d2j4S9Vm5yGuR;
            int i5 = i2 + 1;
            System.arraycopy(rSjkliukrZnQXjhArr, i5, rSjkliukrZnQXjhArr, i5 + i3, this.ibVTtJUNfrGYbW);
            RSjkliukrZnQXjh[] rSjkliukrZnQXjhArr2 = this.Ee8d2j4S9Vm5yGuR;
            int i6 = this.xDyLpEZyrcKVe0 + 1;
            Arrays.fill(rSjkliukrZnQXjhArr2, i6, i6 + i3, (Object) null);
            this.xDyLpEZyrcKVe0 += i3;
        }
    }

    public final void vekpFI4d1Nc4fakF(XslKUngIJyofTLpQ5 xslKUngIJyofTLpQ5) throws EOFException {
        int[] iArr = OewXb6QdIQvK4.dDIMxZXP1V8HdM;
        int iVekpFI4d1Nc4fakF = xslKUngIJyofTLpQ5.vekpFI4d1Nc4fakF();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < iVekpFI4d1Nc4fakF; i++) {
            byte bXDyLpEZyrcKVe0 = xslKUngIJyofTLpQ5.xDyLpEZyrcKVe0(i);
            byte[] bArr = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
            j2 += (long) OewXb6QdIQvK4.w9sT1Swbhx3hs[bXDyLpEZyrcKVe0 & 255];
        }
        int i2 = (int) ((j2 + ((long) 7)) >> 3);
        int iVekpFI4d1Nc4fakF2 = xslKUngIJyofTLpQ5.vekpFI4d1Nc4fakF();
        LTdvNeHFqTsIb9 lTdvNeHFqTsIb9 = this.dDIMxZXP1V8HdM;
        if (i2 >= iVekpFI4d1Nc4fakF2) {
            Ee8d2j4S9Vm5yGuR(xslKUngIJyofTLpQ5.vekpFI4d1Nc4fakF(), 127, 0);
            xslKUngIJyofTLpQ5.gmNWMfvn6zlEj(lTdvNeHFqTsIb9, xslKUngIJyofTLpQ5.vekpFI4d1Nc4fakF());
            return;
        }
        LTdvNeHFqTsIb9 lTdvNeHFqTsIb10 = new LTdvNeHFqTsIb9();
        int[] iArr2 = OewXb6QdIQvK4.dDIMxZXP1V8HdM;
        int iVekpFI4d1Nc4fakF3 = xslKUngIJyofTLpQ5.vekpFI4d1Nc4fakF();
        int i3 = 0;
        for (int i4 = 0; i4 < iVekpFI4d1Nc4fakF3; i4++) {
            byte bXDyLpEZyrcKVe1 = xslKUngIJyofTLpQ5.xDyLpEZyrcKVe0(i4);
            byte[] bArr2 = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
            int i5 = bXDyLpEZyrcKVe1 & 255;
            int i6 = OewXb6QdIQvK4.dDIMxZXP1V8HdM[i5];
            byte b = OewXb6QdIQvK4.w9sT1Swbhx3hs[i5];
            j = (j << b) | ((long) i6);
            i3 += b;
            while (i3 >= 8) {
                i3 -= 8;
                lTdvNeHFqTsIb10.ECwLkmPW1UKz7J6E((int) (j >> i3));
            }
        }
        if (i3 > 0) {
            lTdvNeHFqTsIb10.ECwLkmPW1UKz7J6E((int) ((j << (8 - i3)) | (255 >>> i3)));
        }
        XslKUngIJyofTLpQ5 xslKUngIJyofTLpQ5JXn4Qf7zpnLjP5 = lTdvNeHFqTsIb10.JXn4Qf7zpnLjP5(lTdvNeHFqTsIb10.vekpFI4d1Nc4fakF);
        Ee8d2j4S9Vm5yGuR(xslKUngIJyofTLpQ5JXn4Qf7zpnLjP5.vekpFI4d1Nc4fakF(), 127, 128);
        xslKUngIJyofTLpQ5JXn4Qf7zpnLjP5.gmNWMfvn6zlEj(lTdvNeHFqTsIb9, xslKUngIJyofTLpQ5JXn4Qf7zpnLjP5.vekpFI4d1Nc4fakF());
    }

    public final void w9sT1Swbhx3hs(RSjkliukrZnQXjh rSjkliukrZnQXjh) {
        int i = rSjkliukrZnQXjh.vekpFI4d1Nc4fakF;
        int i2 = this.JXn4Qf7zpnLjP5;
        if (i > i2) {
            RSjkliukrZnQXjh[] rSjkliukrZnQXjhArr = this.Ee8d2j4S9Vm5yGuR;
            Arrays.fill(rSjkliukrZnQXjhArr, 0, rSjkliukrZnQXjhArr.length, (Object) null);
            this.xDyLpEZyrcKVe0 = this.Ee8d2j4S9Vm5yGuR.length - 1;
            this.ibVTtJUNfrGYbW = 0;
            this.b1EoSIRjJHO5 = 0;
            return;
        }
        dDIMxZXP1V8HdM((this.b1EoSIRjJHO5 + i) - i2);
        int i3 = this.ibVTtJUNfrGYbW + 1;
        RSjkliukrZnQXjh[] rSjkliukrZnQXjhArr2 = this.Ee8d2j4S9Vm5yGuR;
        if (i3 > rSjkliukrZnQXjhArr2.length) {
            RSjkliukrZnQXjh[] rSjkliukrZnQXjhArr3 = new RSjkliukrZnQXjh[rSjkliukrZnQXjhArr2.length * 2];
            System.arraycopy(rSjkliukrZnQXjhArr2, 0, rSjkliukrZnQXjhArr3, rSjkliukrZnQXjhArr2.length, rSjkliukrZnQXjhArr2.length);
            this.xDyLpEZyrcKVe0 = this.Ee8d2j4S9Vm5yGuR.length - 1;
            this.Ee8d2j4S9Vm5yGuR = rSjkliukrZnQXjhArr3;
        }
        int i4 = this.xDyLpEZyrcKVe0;
        this.xDyLpEZyrcKVe0 = i4 - 1;
        this.Ee8d2j4S9Vm5yGuR[i4] = rSjkliukrZnQXjh;
        this.ibVTtJUNfrGYbW++;
        this.b1EoSIRjJHO5 += i;
    }
}
