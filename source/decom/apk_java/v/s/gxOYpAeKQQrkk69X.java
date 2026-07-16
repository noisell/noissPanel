package v.s;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class gxOYpAeKQQrkk69X extends XslKUngIJyofTLpQ5 {
    public final transient int[] ibVTtJUNfrGYbW;
    public final transient byte[][] xDyLpEZyrcKVe0;

    public gxOYpAeKQQrkk69X(byte[][] bArr, int[] iArr) {
        super(XslKUngIJyofTLpQ5.Ee8d2j4S9Vm5yGuR.w9sT1Swbhx3hs);
        this.xDyLpEZyrcKVe0 = bArr;
        this.ibVTtJUNfrGYbW = iArr;
    }

    @Override // v.s.XslKUngIJyofTLpQ5
    public final byte[] D5P1xCAyuvgF() {
        byte[] bArr = new byte[vekpFI4d1Nc4fakF()];
        byte[][] bArr2 = this.xDyLpEZyrcKVe0;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.ibVTtJUNfrGYbW;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            System.arraycopy(bArr2[i], i4, bArr, i3, (i4 + i6) - i4);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // v.s.XslKUngIJyofTLpQ5
    public final byte[] Ee8d2j4S9Vm5yGuR() {
        return D5P1xCAyuvgF();
    }

    @Override // v.s.XslKUngIJyofTLpQ5
    public final String JXn4Qf7zpnLjP5() {
        byte[] bArrD5P1xCAyuvgF = D5P1xCAyuvgF();
        char[] cArr = new char[bArrD5P1xCAyuvgF.length * 2];
        int i = 0;
        for (byte b : bArrD5P1xCAyuvgF) {
            int i2 = i + 1;
            char[] cArr2 = OFMrQsTe5s1KYV0lq.dDIMxZXP1V8HdM;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    @Override // v.s.XslKUngIJyofTLpQ5
    public final boolean b1EoSIRjJHO5(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0 && i <= vekpFI4d1Nc4fakF() - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
            int i4 = i3 + i;
            int iMLSIo1htfMPWeB8V876L = y6jRGLEWNMir.MLSIo1htfMPWeB8V876L(this, i);
            while (i < i4) {
                int[] iArr = this.ibVTtJUNfrGYbW;
                int i5 = iMLSIo1htfMPWeB8V876L == 0 ? 0 : iArr[iMLSIo1htfMPWeB8V876L - 1];
                int i6 = iArr[iMLSIo1htfMPWeB8V876L] - i5;
                byte[][] bArr2 = this.xDyLpEZyrcKVe0;
                int i7 = iArr[bArr2.length + iMLSIo1htfMPWeB8V876L];
                int iMin = Math.min(i4, i6 + i5) - i;
                int i8 = (i - i5) + i7;
                byte[] bArr3 = bArr2[iMLSIo1htfMPWeB8V876L];
                for (int i9 = 0; i9 < iMin; i9++) {
                    if (bArr3[i9 + i8] == bArr[i9 + i2]) {
                    }
                }
                i2 += iMin;
                i += iMin;
                iMLSIo1htfMPWeB8V876L++;
            }
            return true;
        }
        return false;
    }

    @Override // v.s.XslKUngIJyofTLpQ5
    public final String dDIMxZXP1V8HdM() {
        throw null;
    }

    @Override // v.s.XslKUngIJyofTLpQ5
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof XslKUngIJyofTLpQ5)) {
            return false;
        }
        XslKUngIJyofTLpQ5 xslKUngIJyofTLpQ5 = (XslKUngIJyofTLpQ5) obj;
        return xslKUngIJyofTLpQ5.vekpFI4d1Nc4fakF() == vekpFI4d1Nc4fakF() && ibVTtJUNfrGYbW(vekpFI4d1Nc4fakF(), xslKUngIJyofTLpQ5);
    }

    @Override // v.s.XslKUngIJyofTLpQ5
    public final void gmNWMfvn6zlEj(LTdvNeHFqTsIb9 lTdvNeHFqTsIb9, int i) {
        int iMLSIo1htfMPWeB8V876L = y6jRGLEWNMir.MLSIo1htfMPWeB8V876L(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.ibVTtJUNfrGYbW;
            int i3 = iMLSIo1htfMPWeB8V876L == 0 ? 0 : iArr[iMLSIo1htfMPWeB8V876L - 1];
            int i4 = iArr[iMLSIo1htfMPWeB8V876L] - i3;
            byte[][] bArr = this.xDyLpEZyrcKVe0;
            int i5 = iArr[bArr.length + iMLSIo1htfMPWeB8V876L];
            int iMin = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            cwZXScWRdjOa6 cwzxscwrdjoa6 = new cwZXScWRdjOa6(bArr[iMLSIo1htfMPWeB8V876L], i6, i6 + iMin, true, false);
            cwZXScWRdjOa6 cwzxscwrdjoa7 = lTdvNeHFqTsIb9.w9sT1Swbhx3hs;
            if (cwzxscwrdjoa7 == null) {
                cwzxscwrdjoa6.ibVTtJUNfrGYbW = cwzxscwrdjoa6;
                cwzxscwrdjoa6.xDyLpEZyrcKVe0 = cwzxscwrdjoa6;
                lTdvNeHFqTsIb9.w9sT1Swbhx3hs = cwzxscwrdjoa6;
            } else {
                cwzxscwrdjoa7.ibVTtJUNfrGYbW.w9sT1Swbhx3hs(cwzxscwrdjoa6);
            }
            i2 += iMin;
            iMLSIo1htfMPWeB8V876L++;
        }
        lTdvNeHFqTsIb9.vekpFI4d1Nc4fakF += (long) i;
    }

    @Override // v.s.XslKUngIJyofTLpQ5
    public final int hashCode() {
        int i = this.vekpFI4d1Nc4fakF;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.xDyLpEZyrcKVe0;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 83 - 82;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.ibVTtJUNfrGYbW;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.vekpFI4d1Nc4fakF = i3;
        return i3;
    }

    @Override // v.s.XslKUngIJyofTLpQ5
    public final boolean ibVTtJUNfrGYbW(int i, XslKUngIJyofTLpQ5 xslKUngIJyofTLpQ5) {
        if (vekpFI4d1Nc4fakF() - i >= 0) {
            int iMLSIo1htfMPWeB8V876L = y6jRGLEWNMir.MLSIo1htfMPWeB8V876L(this, 0);
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int[] iArr = this.ibVTtJUNfrGYbW;
                int i4 = iMLSIo1htfMPWeB8V876L == 0 ? 0 : iArr[iMLSIo1htfMPWeB8V876L - 1];
                int i5 = iArr[iMLSIo1htfMPWeB8V876L] - i4;
                byte[][] bArr = this.xDyLpEZyrcKVe0;
                int i6 = iArr[bArr.length + iMLSIo1htfMPWeB8V876L];
                int iMin = Math.min(i, i5 + i4) - i2;
                if (xslKUngIJyofTLpQ5.b1EoSIRjJHO5(i3, bArr[iMLSIo1htfMPWeB8V876L], (i2 - i4) + i6, iMin)) {
                    i3 += iMin;
                    i2 += iMin;
                    iMLSIo1htfMPWeB8V876L++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // v.s.XslKUngIJyofTLpQ5
    public final XslKUngIJyofTLpQ5 pyu8ovAipBTLYAiKab() {
        return new XslKUngIJyofTLpQ5(D5P1xCAyuvgF()).pyu8ovAipBTLYAiKab();
    }

    @Override // v.s.XslKUngIJyofTLpQ5
    public final String toString() {
        return new XslKUngIJyofTLpQ5(D5P1xCAyuvgF()).toString();
    }

    @Override // v.s.XslKUngIJyofTLpQ5
    public final int vekpFI4d1Nc4fakF() {
        return this.ibVTtJUNfrGYbW[this.xDyLpEZyrcKVe0.length - 1];
    }

    @Override // v.s.XslKUngIJyofTLpQ5
    public final XslKUngIJyofTLpQ5 w9sT1Swbhx3hs(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.xDyLpEZyrcKVe0;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.ibVTtJUNfrGYbW;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        return new XslKUngIJyofTLpQ5(messageDigest.digest());
    }

    @Override // v.s.XslKUngIJyofTLpQ5
    public final byte xDyLpEZyrcKVe0(int i) {
        byte[][] bArr = this.xDyLpEZyrcKVe0;
        int length = bArr.length - 1;
        int[] iArr = this.ibVTtJUNfrGYbW;
        OFtLBiBbrrTHWu.vekpFI4d1Nc4fakF(iArr[length], i, 1L);
        int iMLSIo1htfMPWeB8V876L = y6jRGLEWNMir.MLSIo1htfMPWeB8V876L(this, i);
        return bArr[iMLSIo1htfMPWeB8V876L][(i - (iMLSIo1htfMPWeB8V876L == 0 ? 0 : iArr[iMLSIo1htfMPWeB8V876L - 1])) + iArr[bArr.length + iMLSIo1htfMPWeB8V876L]];
    }
}
