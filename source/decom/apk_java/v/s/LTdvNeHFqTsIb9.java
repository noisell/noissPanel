package v.s;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class LTdvNeHFqTsIb9 implements enW4UFmBttog4rg5RB, fwkml16WWLbAl, Cloneable, ByteChannel {
    public long vekpFI4d1Nc4fakF;
    public cwZXScWRdjOa6 w9sT1Swbhx3hs;

    public final void A1BaTVAMeIXMnh(int i) {
        String str;
        if (i < 128) {
            ECwLkmPW1UKz7J6E(i);
            return;
        }
        if (i < 2048) {
            cwZXScWRdjOa6 cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn = O2DHNSIGZlgPja7eqLgn(2);
            byte[] bArr = cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.dDIMxZXP1V8HdM;
            int i2 = cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.vekpFI4d1Nc4fakF;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.vekpFI4d1Nc4fakF = i2 + 2;
            this.vekpFI4d1Nc4fakF += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            ECwLkmPW1UKz7J6E(63);
            return;
        }
        if (i < 65536) {
            cwZXScWRdjOa6 cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn2 = O2DHNSIGZlgPja7eqLgn(3);
            byte[] bArr2 = cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn2.dDIMxZXP1V8HdM;
            int i3 = cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn2.vekpFI4d1Nc4fakF;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn2.vekpFI4d1Nc4fakF = i3 + 3;
            this.vekpFI4d1Nc4fakF += 3;
            return;
        }
        if (i <= 1114111) {
            cwZXScWRdjOa6 cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn3 = O2DHNSIGZlgPja7eqLgn(4);
            byte[] bArr3 = cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn3.dDIMxZXP1V8HdM;
            int i4 = cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn3.vekpFI4d1Nc4fakF;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn3.vekpFI4d1Nc4fakF = i4 + 4;
            this.vekpFI4d1Nc4fakF += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        if (i != 0) {
            char[] cArr = OFMrQsTe5s1KYV0lq.dDIMxZXP1V8HdM;
            char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
            int i5 = 0;
            while (i5 < 8 && cArr2[i5] == '0') {
                i5++;
            }
            if (i5 < 0) {
                throw new IndexOutOfBoundsException(Y9mRyRdkl5FOcwb66V6.b1EoSIRjJHO5("startIndex: ", ", endIndex: 8, size: 8", i5));
            }
            if (i5 > 8) {
                throw new IllegalArgumentException(Y9mRyRdkl5FOcwb66V6.b1EoSIRjJHO5("startIndex: ", " > endIndex: 8", i5));
            }
            str = new String(cArr2, i5, 8 - i5);
        } else {
            str = "0";
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    public final byte D5P1xCAyuvgF(long j) {
        OFtLBiBbrrTHWu.vekpFI4d1Nc4fakF(this.vekpFI4d1Nc4fakF, j, 1L);
        cwZXScWRdjOa6 cwzxscwrdjoa6 = this.w9sT1Swbhx3hs;
        cwzxscwrdjoa6.getClass();
        long j2 = this.vekpFI4d1Nc4fakF;
        if (j2 - j < j) {
            while (j2 > j) {
                cwzxscwrdjoa6 = cwzxscwrdjoa6.ibVTtJUNfrGYbW;
                j2 -= (long) (cwzxscwrdjoa6.vekpFI4d1Nc4fakF - cwzxscwrdjoa6.w9sT1Swbhx3hs);
            }
            return cwzxscwrdjoa6.dDIMxZXP1V8HdM[(int) ((((long) cwzxscwrdjoa6.w9sT1Swbhx3hs) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = cwzxscwrdjoa6.vekpFI4d1Nc4fakF;
            int i2 = cwzxscwrdjoa6.w9sT1Swbhx3hs;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                return cwzxscwrdjoa6.dDIMxZXP1V8HdM[(int) ((((long) i2) + j) - j3)];
            }
            cwzxscwrdjoa6 = cwzxscwrdjoa6.xDyLpEZyrcKVe0;
            j3 = j4;
        }
    }

    public final byte[] DVTNwpDEVsUKuznof(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (this.vekpFI4d1Nc4fakF < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    public final void ECwLkmPW1UKz7J6E(int i) {
        cwZXScWRdjOa6 cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn = O2DHNSIGZlgPja7eqLgn(1);
        byte[] bArr = cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.dDIMxZXP1V8HdM;
        int i2 = cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.vekpFI4d1Nc4fakF;
        cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.vekpFI4d1Nc4fakF = i2 + 1;
        bArr[i2] = (byte) i;
        this.vekpFI4d1Nc4fakF++;
    }

    public final String EWUjsTERgdPbSw3NNlN(long j, Charset charset) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (this.vekpFI4d1Nc4fakF < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        cwZXScWRdjOa6 cwzxscwrdjoa6 = this.w9sT1Swbhx3hs;
        int i = cwzxscwrdjoa6.w9sT1Swbhx3hs;
        if (((long) i) + j > cwzxscwrdjoa6.vekpFI4d1Nc4fakF) {
            return new String(DVTNwpDEVsUKuznof(j), charset);
        }
        int i2 = (int) j;
        String str = new String(cwzxscwrdjoa6.dDIMxZXP1V8HdM, i, i2, charset);
        int i3 = cwzxscwrdjoa6.w9sT1Swbhx3hs + i2;
        cwzxscwrdjoa6.w9sT1Swbhx3hs = i3;
        this.vekpFI4d1Nc4fakF -= j;
        if (i3 == cwzxscwrdjoa6.vekpFI4d1Nc4fakF) {
            this.w9sT1Swbhx3hs = cwzxscwrdjoa6.dDIMxZXP1V8HdM();
            iykucgHX1u40BAuhp.dDIMxZXP1V8HdM(cwzxscwrdjoa6);
        }
        return str;
    }

    @Override // v.s.fwkml16WWLbAl
    public final fwkml16WWLbAl Ee8d2j4S9Vm5yGuR() {
        return this;
    }

    @Override // v.s.fwkml16WWLbAl
    public final fwkml16WWLbAl H9XlUr4OeMJFiXK(String str) {
        k84rwRrqzhrNQ1CdNQ9(str, 0, str.length());
        return this;
    }

    @Override // v.s.enW4UFmBttog4rg5RB
    public final void J0zjQ7CAgohuxU20eCW6(LTdvNeHFqTsIb9 lTdvNeHFqTsIb9, long j) throws EOFException {
        long j2 = this.vekpFI4d1Nc4fakF;
        if (j2 >= j) {
            lTdvNeHFqTsIb9.nQilHWaqS401ZtR(this, j);
        } else {
            lTdvNeHFqTsIb9.nQilHWaqS401ZtR(this, j2);
            throw new EOFException();
        }
    }

    @Override // v.s.enW4UFmBttog4rg5RB
    public final XslKUngIJyofTLpQ5 JXn4Qf7zpnLjP5(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (this.vekpFI4d1Nc4fakF < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new XslKUngIJyofTLpQ5(DVTNwpDEVsUKuznof(j));
        }
        XslKUngIJyofTLpQ5 xslKUngIJyofTLpQ5RCHnHJBAlOpNI5 = rCHnHJBAlOpNI5((int) j);
        skip(j);
        return xslKUngIJyofTLpQ5RCHnHJBAlOpNI5;
    }

    @Override // v.s.enW4UFmBttog4rg5RB
    public final long K7eEOBPYP9VIoHWTe() throws EOFException {
        int i;
        if (this.vekpFI4d1Nc4fakF == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        int i3 = 0;
        long j = 0;
        do {
            cwZXScWRdjOa6 cwzxscwrdjoa6 = this.w9sT1Swbhx3hs;
            byte[] bArr = cwzxscwrdjoa6.dDIMxZXP1V8HdM;
            int i4 = cwzxscwrdjoa6.w9sT1Swbhx3hs;
            int i5 = cwzxscwrdjoa6.vekpFI4d1Nc4fakF;
            while (i4 < i5) {
                byte b = bArr[i4];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else {
                    if (b < 65 || b > 70) {
                        i3 = (-83) + 84;
                        if (i2 != 0) {
                            break;
                        }
                        char[] cArr = OFMrQsTe5s1KYV0lq.dDIMxZXP1V8HdM;
                        char c = cArr[(b >> 4) & 15];
                        char c2 = cArr[b & 15];
                        char[] cArr2 = new char[2];
                        cArr2[0] = c;
                        cArr2[i3] = c2;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(cArr2)));
                    }
                    i = b - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    LTdvNeHFqTsIb9 lTdvNeHFqTsIb9 = new LTdvNeHFqTsIb9();
                    lTdvNeHFqTsIb9.iUQk66nAiXgO35(j);
                    lTdvNeHFqTsIb9.ECwLkmPW1UKz7J6E(b);
                    throw new NumberFormatException("Number too large: ".concat(lTdvNeHFqTsIb9.vIJudZvPyTuNp()));
                }
                j = (j << 4) | ((long) i);
                i4++;
                i2++;
            }
            if (i4 == i5) {
                this.w9sT1Swbhx3hs = cwzxscwrdjoa6.dDIMxZXP1V8HdM();
                iykucgHX1u40BAuhp.dDIMxZXP1V8HdM(cwzxscwrdjoa6);
            } else {
                cwzxscwrdjoa6.w9sT1Swbhx3hs = i4;
            }
            if (i3 != 0) {
                break;
            }
        } while (this.w9sT1Swbhx3hs != null);
        this.vekpFI4d1Nc4fakF -= (long) i2;
        return j;
    }

    public final cwZXScWRdjOa6 O2DHNSIGZlgPja7eqLgn(int i) {
        if (i < 2 - 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        cwZXScWRdjOa6 cwzxscwrdjoa6 = this.w9sT1Swbhx3hs;
        if (cwzxscwrdjoa6 == null) {
            cwZXScWRdjOa6 cwzxscwrdjoa6W9sT1Swbhx3hs = iykucgHX1u40BAuhp.w9sT1Swbhx3hs();
            this.w9sT1Swbhx3hs = cwzxscwrdjoa6W9sT1Swbhx3hs;
            cwzxscwrdjoa6W9sT1Swbhx3hs.ibVTtJUNfrGYbW = cwzxscwrdjoa6W9sT1Swbhx3hs;
            cwzxscwrdjoa6W9sT1Swbhx3hs.xDyLpEZyrcKVe0 = cwzxscwrdjoa6W9sT1Swbhx3hs;
            return cwzxscwrdjoa6W9sT1Swbhx3hs;
        }
        cwZXScWRdjOa6 cwzxscwrdjoa7 = cwzxscwrdjoa6.ibVTtJUNfrGYbW;
        if (cwzxscwrdjoa7.vekpFI4d1Nc4fakF + i <= 8192 && cwzxscwrdjoa7.Ee8d2j4S9Vm5yGuR) {
            return cwzxscwrdjoa7;
        }
        cwZXScWRdjOa6 cwzxscwrdjoa6W9sT1Swbhx3hs2 = iykucgHX1u40BAuhp.w9sT1Swbhx3hs();
        cwzxscwrdjoa7.w9sT1Swbhx3hs(cwzxscwrdjoa6W9sT1Swbhx3hs2);
        return cwzxscwrdjoa6W9sT1Swbhx3hs2;
    }

    public final R8Y7LdR0VPAAn Qrz92kRPw4GcghAc(R8Y7LdR0VPAAn r8Y7LdR0VPAAn) {
        byte[] bArr = w9sT1Swbhx3hs.dDIMxZXP1V8HdM;
        if (r8Y7LdR0VPAAn == OFtLBiBbrrTHWu.dDIMxZXP1V8HdM) {
            r8Y7LdR0VPAAn = new R8Y7LdR0VPAAn();
        }
        if (r8Y7LdR0VPAAn.w9sT1Swbhx3hs != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        r8Y7LdR0VPAAn.w9sT1Swbhx3hs = this;
        r8Y7LdR0VPAAn.vekpFI4d1Nc4fakF = true;
        return r8Y7LdR0VPAAn;
    }

    @Override // v.s.enW4UFmBttog4rg5RB
    public final void XiR1pIn5878vVWd(long j) throws EOFException {
        if (this.vekpFI4d1Nc4fakF < j) {
            throw new EOFException();
        }
    }

    public final void XuO9PPFo607ssKwZjNW(int i) {
        cwZXScWRdjOa6 cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn = O2DHNSIGZlgPja7eqLgn(4);
        byte[] bArr = cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.dDIMxZXP1V8HdM;
        int i2 = cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.vekpFI4d1Nc4fakF;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.vekpFI4d1Nc4fakF = i2 + 4;
        this.vekpFI4d1Nc4fakF += 4;
    }

    public final Object clone() {
        LTdvNeHFqTsIb9 lTdvNeHFqTsIb9 = new LTdvNeHFqTsIb9();
        if (this.vekpFI4d1Nc4fakF == 0) {
            return lTdvNeHFqTsIb9;
        }
        cwZXScWRdjOa6 cwzxscwrdjoa6 = this.w9sT1Swbhx3hs;
        cwZXScWRdjOa6 cwzxscwrdjoa6VekpFI4d1Nc4fakF = cwzxscwrdjoa6.vekpFI4d1Nc4fakF();
        lTdvNeHFqTsIb9.w9sT1Swbhx3hs = cwzxscwrdjoa6VekpFI4d1Nc4fakF;
        cwzxscwrdjoa6VekpFI4d1Nc4fakF.ibVTtJUNfrGYbW = cwzxscwrdjoa6VekpFI4d1Nc4fakF;
        cwzxscwrdjoa6VekpFI4d1Nc4fakF.xDyLpEZyrcKVe0 = cwzxscwrdjoa6VekpFI4d1Nc4fakF;
        for (cwZXScWRdjOa6 cwzxscwrdjoa7 = cwzxscwrdjoa6.xDyLpEZyrcKVe0; cwzxscwrdjoa7 != cwzxscwrdjoa6; cwzxscwrdjoa7 = cwzxscwrdjoa7.xDyLpEZyrcKVe0) {
            cwzxscwrdjoa6VekpFI4d1Nc4fakF.ibVTtJUNfrGYbW.w9sT1Swbhx3hs(cwzxscwrdjoa7.vekpFI4d1Nc4fakF());
        }
        lTdvNeHFqTsIb9.vekpFI4d1Nc4fakF = this.vekpFI4d1Nc4fakF;
        return lTdvNeHFqTsIb9;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, v.s.kdnUsNLKSJv552LW2x
    public final void close() {
    }

    public final void dDIMxZXP1V8HdM(LTdvNeHFqTsIb9 lTdvNeHFqTsIb9, long j, long j2) {
        long j3 = j;
        OFtLBiBbrrTHWu.vekpFI4d1Nc4fakF(this.vekpFI4d1Nc4fakF, j3, j2);
        if (j2 == 0) {
            return;
        }
        lTdvNeHFqTsIb9.vekpFI4d1Nc4fakF += j2;
        cwZXScWRdjOa6 cwzxscwrdjoa6 = this.w9sT1Swbhx3hs;
        while (true) {
            long j4 = cwzxscwrdjoa6.vekpFI4d1Nc4fakF - cwzxscwrdjoa6.w9sT1Swbhx3hs;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            cwzxscwrdjoa6 = cwzxscwrdjoa6.xDyLpEZyrcKVe0;
        }
        cwZXScWRdjOa6 cwzxscwrdjoa7 = cwzxscwrdjoa6;
        long j5 = j2;
        while (j5 > 0) {
            cwZXScWRdjOa6 cwzxscwrdjoa6VekpFI4d1Nc4fakF = cwzxscwrdjoa7.vekpFI4d1Nc4fakF();
            int i = cwzxscwrdjoa6VekpFI4d1Nc4fakF.w9sT1Swbhx3hs + ((int) j3);
            cwzxscwrdjoa6VekpFI4d1Nc4fakF.w9sT1Swbhx3hs = i;
            cwzxscwrdjoa6VekpFI4d1Nc4fakF.vekpFI4d1Nc4fakF = Math.min(i + ((int) j5), cwzxscwrdjoa6VekpFI4d1Nc4fakF.vekpFI4d1Nc4fakF);
            cwZXScWRdjOa6 cwzxscwrdjoa8 = lTdvNeHFqTsIb9.w9sT1Swbhx3hs;
            if (cwzxscwrdjoa8 == null) {
                cwzxscwrdjoa6VekpFI4d1Nc4fakF.ibVTtJUNfrGYbW = cwzxscwrdjoa6VekpFI4d1Nc4fakF;
                cwzxscwrdjoa6VekpFI4d1Nc4fakF.xDyLpEZyrcKVe0 = cwzxscwrdjoa6VekpFI4d1Nc4fakF;
                lTdvNeHFqTsIb9.w9sT1Swbhx3hs = cwzxscwrdjoa6VekpFI4d1Nc4fakF;
            } else {
                cwzxscwrdjoa8.ibVTtJUNfrGYbW.w9sT1Swbhx3hs(cwzxscwrdjoa6VekpFI4d1Nc4fakF);
            }
            j5 -= (long) (cwzxscwrdjoa6VekpFI4d1Nc4fakF.vekpFI4d1Nc4fakF - cwzxscwrdjoa6VekpFI4d1Nc4fakF.w9sT1Swbhx3hs);
            cwzxscwrdjoa7 = cwzxscwrdjoa7.xDyLpEZyrcKVe0;
            j3 = 0;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LTdvNeHFqTsIb9)) {
            return false;
        }
        long j = this.vekpFI4d1Nc4fakF;
        LTdvNeHFqTsIb9 lTdvNeHFqTsIb9 = (LTdvNeHFqTsIb9) obj;
        if (j != lTdvNeHFqTsIb9.vekpFI4d1Nc4fakF) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        cwZXScWRdjOa6 cwzxscwrdjoa6 = this.w9sT1Swbhx3hs;
        cwZXScWRdjOa6 cwzxscwrdjoa7 = lTdvNeHFqTsIb9.w9sT1Swbhx3hs;
        int i = cwzxscwrdjoa6.w9sT1Swbhx3hs;
        int i2 = cwzxscwrdjoa7.w9sT1Swbhx3hs;
        long j2 = 0;
        while (j2 < this.vekpFI4d1Nc4fakF) {
            long jMin = Math.min(cwzxscwrdjoa6.vekpFI4d1Nc4fakF - i, cwzxscwrdjoa7.vekpFI4d1Nc4fakF - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (cwzxscwrdjoa6.dDIMxZXP1V8HdM[i] != cwzxscwrdjoa7.dDIMxZXP1V8HdM[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == cwzxscwrdjoa6.vekpFI4d1Nc4fakF) {
                cwzxscwrdjoa6 = cwzxscwrdjoa6.xDyLpEZyrcKVe0;
                i = cwzxscwrdjoa6.w9sT1Swbhx3hs;
            }
            if (i2 == cwzxscwrdjoa7.vekpFI4d1Nc4fakF) {
                cwzxscwrdjoa7 = cwzxscwrdjoa7.xDyLpEZyrcKVe0;
                i2 = cwzxscwrdjoa7.w9sT1Swbhx3hs;
            }
            j2 += jMin;
        }
        return true;
    }

    public final void fivkjwgu2UdAtiY(nj8JtA7VVVuzq nj8jta7vvvuzq) {
        while (nj8jta7vvvuzq.yTljMGnIibTRdOpSh4(this, 8192L) != -1) {
        }
    }

    @Override // v.s.fwkml16WWLbAl, v.s.kdnUsNLKSJv552LW2x, java.io.Flushable
    public final void flush() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [byte, int] */
    @Override // v.s.enW4UFmBttog4rg5RB
    public final String gIIiyi2ddlMDR0(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j).toString());
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jHjneShqpF9Tis4 = hjneShqpF9Tis4(38 - 28, 0L, j2);
        if (jHjneShqpF9Tis4 != -1) {
            return w9sT1Swbhx3hs.dDIMxZXP1V8HdM(this, jHjneShqpF9Tis4);
        }
        if (j2 < this.vekpFI4d1Nc4fakF && D5P1xCAyuvgF(j2 - 1) == (-19) + 32 && D5P1xCAyuvgF(j2) == 10) {
            return w9sT1Swbhx3hs.dDIMxZXP1V8HdM(this, j2);
        }
        LTdvNeHFqTsIb9 lTdvNeHFqTsIb9 = new LTdvNeHFqTsIb9();
        dDIMxZXP1V8HdM(lTdvNeHFqTsIb9, 0L, Math.min(113 - 81, this.vekpFI4d1Nc4fakF));
        throw new EOFException("\\n not found: limit=" + Math.min(this.vekpFI4d1Nc4fakF, j) + " content=" + lTdvNeHFqTsIb9.JXn4Qf7zpnLjP5(lTdvNeHFqTsIb9.vekpFI4d1Nc4fakF).JXn4Qf7zpnLjP5() + (char) 8230);
    }

    @Override // v.s.fwkml16WWLbAl
    public final /* bridge */ /* synthetic */ fwkml16WWLbAl gmNWMfvn6zlEj(XslKUngIJyofTLpQ5 xslKUngIJyofTLpQ5) {
        xfn2GJwmGqs7kWW(xslKUngIJyofTLpQ5);
        return this;
    }

    public final void hV4VTKNUdeHN(int i) {
        cwZXScWRdjOa6 cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn = O2DHNSIGZlgPja7eqLgn(2);
        byte[] bArr = cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.dDIMxZXP1V8HdM;
        int i2 = cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.vekpFI4d1Nc4fakF;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.vekpFI4d1Nc4fakF = i2 + 2;
        this.vekpFI4d1Nc4fakF += 2;
    }

    public final int hashCode() {
        cwZXScWRdjOa6 cwzxscwrdjoa6 = this.w9sT1Swbhx3hs;
        if (cwzxscwrdjoa6 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = cwzxscwrdjoa6.vekpFI4d1Nc4fakF;
            for (int i3 = cwzxscwrdjoa6.w9sT1Swbhx3hs; i3 < i2; i3++) {
                i = (i * 31) + cwzxscwrdjoa6.dDIMxZXP1V8HdM[i3];
            }
            cwzxscwrdjoa6 = cwzxscwrdjoa6.xDyLpEZyrcKVe0;
        } while (cwzxscwrdjoa6 != this.w9sT1Swbhx3hs);
        return i;
    }

    public final long hjneShqpF9Tis4(byte b, long j, long j2) {
        cwZXScWRdjOa6 cwzxscwrdjoa6;
        long j3 = 0;
        if (0 > j || j > j2) {
            throw new IllegalArgumentException(("size=" + this.vekpFI4d1Nc4fakF + " fromIndex=" + j + " toIndex=" + j2).toString());
        }
        long j4 = this.vekpFI4d1Nc4fakF;
        if (j2 > j4) {
            j2 = j4;
        }
        if (j == j2 || (cwzxscwrdjoa6 = this.w9sT1Swbhx3hs) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                cwzxscwrdjoa6 = cwzxscwrdjoa6.ibVTtJUNfrGYbW;
                j4 -= (long) (cwzxscwrdjoa6.vekpFI4d1Nc4fakF - cwzxscwrdjoa6.w9sT1Swbhx3hs);
            }
            while (j4 < j2) {
                byte[] bArr = cwzxscwrdjoa6.dDIMxZXP1V8HdM;
                int iMin = (int) Math.min(cwzxscwrdjoa6.vekpFI4d1Nc4fakF, (((long) cwzxscwrdjoa6.w9sT1Swbhx3hs) + j2) - j4);
                for (int i = (int) ((((long) cwzxscwrdjoa6.w9sT1Swbhx3hs) + j) - j4); i < iMin; i++) {
                    if (bArr[i] == b) {
                        return ((long) (i - cwzxscwrdjoa6.w9sT1Swbhx3hs)) + j4;
                    }
                }
                j4 += (long) (cwzxscwrdjoa6.vekpFI4d1Nc4fakF - cwzxscwrdjoa6.w9sT1Swbhx3hs);
                cwzxscwrdjoa6 = cwzxscwrdjoa6.xDyLpEZyrcKVe0;
                j = j4;
            }
            return -1L;
        }
        while (true) {
            long j5 = ((long) (cwzxscwrdjoa6.vekpFI4d1Nc4fakF - cwzxscwrdjoa6.w9sT1Swbhx3hs)) + j3;
            if (j5 > j) {
                break;
            }
            cwzxscwrdjoa6 = cwzxscwrdjoa6.xDyLpEZyrcKVe0;
            j3 = j5;
        }
        while (j3 < j2) {
            byte[] bArr2 = cwzxscwrdjoa6.dDIMxZXP1V8HdM;
            int iMin2 = (int) Math.min(cwzxscwrdjoa6.vekpFI4d1Nc4fakF, (((long) cwzxscwrdjoa6.w9sT1Swbhx3hs) + j2) - j3);
            for (int i2 = (int) ((((long) cwzxscwrdjoa6.w9sT1Swbhx3hs) + j) - j3); i2 < iMin2; i2++) {
                if (bArr2[i2] == b) {
                    return ((long) (i2 - cwzxscwrdjoa6.w9sT1Swbhx3hs)) + j3;
                }
            }
            j3 += (long) (cwzxscwrdjoa6.vekpFI4d1Nc4fakF - cwzxscwrdjoa6.w9sT1Swbhx3hs);
            cwzxscwrdjoa6 = cwzxscwrdjoa6.xDyLpEZyrcKVe0;
            j = j3;
        }
        return -1L;
    }

    public final void iUQk66nAiXgO35(long j) {
        if (j == 0) {
            ECwLkmPW1UKz7J6E(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        int i = 22 - 18;
        long j4 = j3 | (j3 >>> i);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> i) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i2 = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + ((long) 3)) / ((long) i));
        cwZXScWRdjOa6 cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn = O2DHNSIGZlgPja7eqLgn(i2);
        byte[] bArr = cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.dDIMxZXP1V8HdM;
        int i3 = cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.vekpFI4d1Nc4fakF;
        for (int i4 = (i3 + i2) - 1; i4 >= i3; i4--) {
            bArr[i4] = w9sT1Swbhx3hs.dDIMxZXP1V8HdM[(int) (15 & j)];
            j >>>= i;
        }
        cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.vekpFI4d1Nc4fakF += i2;
        this.vekpFI4d1Nc4fakF += (long) i2;
    }

    @Override // v.s.enW4UFmBttog4rg5RB
    public final String ibVTtJUNfrGYbW() {
        return gIIiyi2ddlMDR0(Long.MAX_VALUE);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final void k84rwRrqzhrNQ1CdNQ9(String str, int i, int i2) {
        char cCharAt;
        if (i < 0) {
            throw new IllegalArgumentException(Y9mRyRdkl5FOcwb66V6.xDyLpEZyrcKVe0("beginIndex < 0: ", i).toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(Y9mRyRdkl5FOcwb66V6.Ee8d2j4S9Vm5yGuR(i2, i, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                cwZXScWRdjOa6 cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn = O2DHNSIGZlgPja7eqLgn(1);
                byte[] bArr = cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.dDIMxZXP1V8HdM;
                int i3 = cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.vekpFI4d1Nc4fakF - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.vekpFI4d1Nc4fakF;
                int i6 = (i3 + i) - i5;
                cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.vekpFI4d1Nc4fakF = i5 + i6;
                this.vekpFI4d1Nc4fakF += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    cwZXScWRdjOa6 cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn2 = O2DHNSIGZlgPja7eqLgn(2);
                    byte[] bArr2 = cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn2.dDIMxZXP1V8HdM;
                    int i7 = cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn2.vekpFI4d1Nc4fakF;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn2.vekpFI4d1Nc4fakF = i7 + 2;
                    this.vekpFI4d1Nc4fakF += 2;
                } else {
                    int i8 = (-11) + 74;
                    if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                        cwZXScWRdjOa6 cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn3 = O2DHNSIGZlgPja7eqLgn(3);
                        byte[] bArr3 = cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn3.dDIMxZXP1V8HdM;
                        int i9 = cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn3.vekpFI4d1Nc4fakF;
                        bArr3[i9] = (byte) ((cCharAt2 >> '\f') | 224);
                        bArr3[i9 + 1] = (byte) ((i8 & (cCharAt2 >> 6)) | 128);
                        bArr3[i9 + 2] = (byte) ((cCharAt2 & '?') | 128);
                        cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn3.vekpFI4d1Nc4fakF = i9 + 3;
                        this.vekpFI4d1Nc4fakF += 3;
                    } else {
                        int i10 = i + 1;
                        char cCharAt3 = i10 < i2 ? str.charAt(i10) : (char) 0;
                        if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                            ECwLkmPW1UKz7J6E(i8);
                            i = i10;
                        } else {
                            int i11 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                            cwZXScWRdjOa6 cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn4 = O2DHNSIGZlgPja7eqLgn(4);
                            byte[] bArr4 = cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn4.dDIMxZXP1V8HdM;
                            int i12 = cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn4.vekpFI4d1Nc4fakF;
                            bArr4[i12] = (byte) ((i11 >> 18) | 240);
                            bArr4[i12 + 1] = (byte) (((i11 >> 12) & i8) | 128);
                            bArr4[i12 + 2] = (byte) (((i11 >> 6) & i8) | 128);
                            bArr4[i12 + 3] = (byte) ((i11 & i8) | 128);
                            cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn4.vekpFI4d1Nc4fakF = i12 + 4;
                            this.vekpFI4d1Nc4fakF += 4;
                            i += 2;
                        }
                    }
                }
                i++;
            }
        }
    }

    @Override // v.s.kdnUsNLKSJv552LW2x
    public final void nQilHWaqS401ZtR(LTdvNeHFqTsIb9 lTdvNeHFqTsIb9, long j) {
        cwZXScWRdjOa6 cwzxscwrdjoa6W9sT1Swbhx3hs;
        if (lTdvNeHFqTsIb9 == this) {
            throw new IllegalArgumentException("source == this");
        }
        OFtLBiBbrrTHWu.vekpFI4d1Nc4fakF(lTdvNeHFqTsIb9.vekpFI4d1Nc4fakF, 0L, j);
        while (j > 0) {
            cwZXScWRdjOa6 cwzxscwrdjoa6 = lTdvNeHFqTsIb9.w9sT1Swbhx3hs;
            int i = cwzxscwrdjoa6.vekpFI4d1Nc4fakF - cwzxscwrdjoa6.w9sT1Swbhx3hs;
            if (j < i) {
                cwZXScWRdjOa6 cwzxscwrdjoa7 = this.w9sT1Swbhx3hs;
                cwZXScWRdjOa6 cwzxscwrdjoa8 = cwzxscwrdjoa7 != null ? cwzxscwrdjoa7.ibVTtJUNfrGYbW : null;
                if (cwzxscwrdjoa8 != null && cwzxscwrdjoa8.Ee8d2j4S9Vm5yGuR) {
                    if ((((long) cwzxscwrdjoa8.vekpFI4d1Nc4fakF) + j) - ((long) (cwzxscwrdjoa8.JXn4Qf7zpnLjP5 ? 0 : cwzxscwrdjoa8.w9sT1Swbhx3hs)) <= 8192) {
                        cwzxscwrdjoa6.JXn4Qf7zpnLjP5(cwzxscwrdjoa8, (int) j);
                        lTdvNeHFqTsIb9.vekpFI4d1Nc4fakF -= j;
                        this.vekpFI4d1Nc4fakF += j;
                        return;
                    }
                }
                int i2 = (int) j;
                if (i2 <= 0 || i2 > i) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i2 >= 1020 + 4) {
                    cwzxscwrdjoa6W9sT1Swbhx3hs = cwzxscwrdjoa6.vekpFI4d1Nc4fakF();
                } else {
                    cwzxscwrdjoa6W9sT1Swbhx3hs = iykucgHX1u40BAuhp.w9sT1Swbhx3hs();
                    byte[] bArr = cwzxscwrdjoa6.dDIMxZXP1V8HdM;
                    byte[] bArr2 = cwzxscwrdjoa6W9sT1Swbhx3hs.dDIMxZXP1V8HdM;
                    int i3 = cwzxscwrdjoa6.w9sT1Swbhx3hs;
                    VnDsNIgXNCQywv8lGh.k84rwRrqzhrNQ1CdNQ9(bArr, bArr2, i3, i3 + i2);
                }
                cwzxscwrdjoa6W9sT1Swbhx3hs.vekpFI4d1Nc4fakF = cwzxscwrdjoa6W9sT1Swbhx3hs.w9sT1Swbhx3hs + i2;
                cwzxscwrdjoa6.w9sT1Swbhx3hs += i2;
                cwzxscwrdjoa6.ibVTtJUNfrGYbW.w9sT1Swbhx3hs(cwzxscwrdjoa6W9sT1Swbhx3hs);
                lTdvNeHFqTsIb9.w9sT1Swbhx3hs = cwzxscwrdjoa6W9sT1Swbhx3hs;
            }
            cwZXScWRdjOa6 cwzxscwrdjoa9 = lTdvNeHFqTsIb9.w9sT1Swbhx3hs;
            long j2 = cwzxscwrdjoa9.vekpFI4d1Nc4fakF - cwzxscwrdjoa9.w9sT1Swbhx3hs;
            lTdvNeHFqTsIb9.w9sT1Swbhx3hs = cwzxscwrdjoa9.dDIMxZXP1V8HdM();
            cwZXScWRdjOa6 cwzxscwrdjoa10 = this.w9sT1Swbhx3hs;
            if (cwzxscwrdjoa10 == null) {
                this.w9sT1Swbhx3hs = cwzxscwrdjoa9;
                cwzxscwrdjoa9.ibVTtJUNfrGYbW = cwzxscwrdjoa9;
                cwzxscwrdjoa9.xDyLpEZyrcKVe0 = cwzxscwrdjoa9;
            } else {
                cwzxscwrdjoa10.ibVTtJUNfrGYbW.w9sT1Swbhx3hs(cwzxscwrdjoa9);
                cwZXScWRdjOa6 cwzxscwrdjoa11 = cwzxscwrdjoa9.ibVTtJUNfrGYbW;
                if (cwzxscwrdjoa11 == cwzxscwrdjoa9) {
                    throw new IllegalStateException("cannot compact");
                }
                if (cwzxscwrdjoa11.Ee8d2j4S9Vm5yGuR) {
                    int i4 = cwzxscwrdjoa9.vekpFI4d1Nc4fakF - cwzxscwrdjoa9.w9sT1Swbhx3hs;
                    if (i4 <= (8192 - cwzxscwrdjoa11.vekpFI4d1Nc4fakF) + (cwzxscwrdjoa11.JXn4Qf7zpnLjP5 ? 0 : cwzxscwrdjoa11.w9sT1Swbhx3hs)) {
                        cwzxscwrdjoa9.JXn4Qf7zpnLjP5(cwzxscwrdjoa11, i4);
                        cwzxscwrdjoa9.dDIMxZXP1V8HdM();
                        iykucgHX1u40BAuhp.dDIMxZXP1V8HdM(cwzxscwrdjoa9);
                    }
                }
            }
            lTdvNeHFqTsIb9.vekpFI4d1Nc4fakF -= j2;
            this.vekpFI4d1Nc4fakF += j2;
            j -= j2;
        }
    }

    @Override // v.s.fwkml16WWLbAl
    public final LTdvNeHFqTsIb9 pyu8ovAipBTLYAiKab() {
        return this;
    }

    public final XslKUngIJyofTLpQ5 rCHnHJBAlOpNI5(int i) {
        if (i == 0) {
            return XslKUngIJyofTLpQ5.Ee8d2j4S9Vm5yGuR;
        }
        OFtLBiBbrrTHWu.vekpFI4d1Nc4fakF(this.vekpFI4d1Nc4fakF, 0L, i);
        cwZXScWRdjOa6 cwzxscwrdjoa6 = this.w9sT1Swbhx3hs;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = cwzxscwrdjoa6.vekpFI4d1Nc4fakF;
            int i6 = cwzxscwrdjoa6.w9sT1Swbhx3hs;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            cwzxscwrdjoa6 = cwzxscwrdjoa6.xDyLpEZyrcKVe0;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        cwZXScWRdjOa6 cwzxscwrdjoa7 = this.w9sT1Swbhx3hs;
        int i7 = 0;
        while (i2 < i) {
            bArr[i7] = cwzxscwrdjoa7.dDIMxZXP1V8HdM;
            i2 += cwzxscwrdjoa7.vekpFI4d1Nc4fakF - cwzxscwrdjoa7.w9sT1Swbhx3hs;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = cwzxscwrdjoa7.w9sT1Swbhx3hs;
            cwzxscwrdjoa7.JXn4Qf7zpnLjP5 = true;
            i7++;
            cwzxscwrdjoa7 = cwzxscwrdjoa7.xDyLpEZyrcKVe0;
        }
        return new gxOYpAeKQQrkk69X(bArr, iArr);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        cwZXScWRdjOa6 cwzxscwrdjoa6 = this.w9sT1Swbhx3hs;
        if (cwzxscwrdjoa6 == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), cwzxscwrdjoa6.vekpFI4d1Nc4fakF - cwzxscwrdjoa6.w9sT1Swbhx3hs);
        byteBuffer.put(cwzxscwrdjoa6.dDIMxZXP1V8HdM, cwzxscwrdjoa6.w9sT1Swbhx3hs, iMin);
        int i = cwzxscwrdjoa6.w9sT1Swbhx3hs + iMin;
        cwzxscwrdjoa6.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF -= (long) iMin;
        if (i == cwzxscwrdjoa6.vekpFI4d1Nc4fakF) {
            this.w9sT1Swbhx3hs = cwzxscwrdjoa6.dDIMxZXP1V8HdM();
            iykucgHX1u40BAuhp.dDIMxZXP1V8HdM(cwzxscwrdjoa6);
        }
        return iMin;
    }

    @Override // v.s.enW4UFmBttog4rg5RB
    public final byte readByte() {
        long j = this.vekpFI4d1Nc4fakF;
        if (j == 0) {
            throw new EOFException();
        }
        cwZXScWRdjOa6 cwzxscwrdjoa6 = this.w9sT1Swbhx3hs;
        int i = cwzxscwrdjoa6.w9sT1Swbhx3hs;
        int i2 = cwzxscwrdjoa6.vekpFI4d1Nc4fakF;
        int i3 = i + 1;
        byte b = cwzxscwrdjoa6.dDIMxZXP1V8HdM[i];
        this.vekpFI4d1Nc4fakF = j - 1;
        if (i3 != i2) {
            cwzxscwrdjoa6.w9sT1Swbhx3hs = i3;
            return b;
        }
        this.w9sT1Swbhx3hs = cwzxscwrdjoa6.dDIMxZXP1V8HdM();
        iykucgHX1u40BAuhp.dDIMxZXP1V8HdM(cwzxscwrdjoa6);
        return b;
    }

    @Override // v.s.enW4UFmBttog4rg5RB
    public final void readFully(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int i2 = read(bArr, i, bArr.length - i);
            if (i2 == -1) {
                throw new EOFException();
            }
            i += i2;
        }
    }

    @Override // v.s.enW4UFmBttog4rg5RB
    public final int readInt() throws EOFException {
        long j = this.vekpFI4d1Nc4fakF;
        if (j < 4) {
            throw new EOFException();
        }
        cwZXScWRdjOa6 cwzxscwrdjoa6 = this.w9sT1Swbhx3hs;
        int i = cwzxscwrdjoa6.w9sT1Swbhx3hs;
        int i2 = cwzxscwrdjoa6.vekpFI4d1Nc4fakF;
        if (i2 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = cwzxscwrdjoa6.dDIMxZXP1V8HdM;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.vekpFI4d1Nc4fakF = j - 4;
        if (i5 != i2) {
            cwzxscwrdjoa6.w9sT1Swbhx3hs = i5;
            return i6;
        }
        this.w9sT1Swbhx3hs = cwzxscwrdjoa6.dDIMxZXP1V8HdM();
        iykucgHX1u40BAuhp.dDIMxZXP1V8HdM(cwzxscwrdjoa6);
        return i6;
    }

    @Override // v.s.enW4UFmBttog4rg5RB
    public final long readLong() throws EOFException {
        long j = this.vekpFI4d1Nc4fakF;
        if (j < 8) {
            throw new EOFException();
        }
        cwZXScWRdjOa6 cwzxscwrdjoa6 = this.w9sT1Swbhx3hs;
        int i = cwzxscwrdjoa6.w9sT1Swbhx3hs;
        int i2 = cwzxscwrdjoa6.vekpFI4d1Nc4fakF;
        if (i2 - i < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = cwzxscwrdjoa6.dDIMxZXP1V8HdM;
        int i3 = i + 7;
        long j2 = ((((long) bArr[i + 1]) & 255) << (148 - 100)) | ((((long) bArr[i]) & 255) << ((-20) + 76)) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << (99 - 83)) | ((((long) bArr[i + 6]) & 255) << 8);
        int i4 = i + 8;
        long j3 = j2 | (((long) bArr[i3]) & 255);
        this.vekpFI4d1Nc4fakF = j - 8;
        if (i4 != i2) {
            cwzxscwrdjoa6.w9sT1Swbhx3hs = i4;
            return j3;
        }
        this.w9sT1Swbhx3hs = cwzxscwrdjoa6.dDIMxZXP1V8HdM();
        iykucgHX1u40BAuhp.dDIMxZXP1V8HdM(cwzxscwrdjoa6);
        return j3;
    }

    @Override // v.s.enW4UFmBttog4rg5RB
    public final short readShort() throws EOFException {
        long j = this.vekpFI4d1Nc4fakF;
        if (j < 2) {
            throw new EOFException();
        }
        cwZXScWRdjOa6 cwzxscwrdjoa6 = this.w9sT1Swbhx3hs;
        int i = cwzxscwrdjoa6.w9sT1Swbhx3hs;
        int i2 = cwzxscwrdjoa6.vekpFI4d1Nc4fakF;
        if (i2 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = cwzxscwrdjoa6.dDIMxZXP1V8HdM;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.vekpFI4d1Nc4fakF = j - 2;
        if (i5 == i2) {
            this.w9sT1Swbhx3hs = cwzxscwrdjoa6.dDIMxZXP1V8HdM();
            iykucgHX1u40BAuhp.dDIMxZXP1V8HdM(cwzxscwrdjoa6);
        } else {
            cwzxscwrdjoa6.w9sT1Swbhx3hs = i5;
        }
        return (short) i6;
    }

    @Override // v.s.enW4UFmBttog4rg5RB
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            cwZXScWRdjOa6 cwzxscwrdjoa6 = this.w9sT1Swbhx3hs;
            if (cwzxscwrdjoa6 == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, cwzxscwrdjoa6.vekpFI4d1Nc4fakF - cwzxscwrdjoa6.w9sT1Swbhx3hs);
            long j2 = iMin;
            this.vekpFI4d1Nc4fakF -= j2;
            j -= j2;
            int i = cwzxscwrdjoa6.w9sT1Swbhx3hs + iMin;
            cwzxscwrdjoa6.w9sT1Swbhx3hs = i;
            if (i == cwzxscwrdjoa6.vekpFI4d1Nc4fakF) {
                this.w9sT1Swbhx3hs = cwzxscwrdjoa6.dDIMxZXP1V8HdM();
                iykucgHX1u40BAuhp.dDIMxZXP1V8HdM(cwzxscwrdjoa6);
            }
        }
    }

    public final void tne6mXOUFKdd(byte[] bArr, int i) {
        int i2 = 0;
        long j = i;
        OFtLBiBbrrTHWu.vekpFI4d1Nc4fakF(bArr.length, 0, j);
        while (i2 < i) {
            cwZXScWRdjOa6 cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn = O2DHNSIGZlgPja7eqLgn(92 - 91);
            int iMin = Math.min(i - i2, 8192 - cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.vekpFI4d1Nc4fakF);
            int i3 = i2 + iMin;
            System.arraycopy(bArr, i2, cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.dDIMxZXP1V8HdM, cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.vekpFI4d1Nc4fakF, i3 - i2);
            cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.vekpFI4d1Nc4fakF += iMin;
            i2 = i3;
        }
        this.vekpFI4d1Nc4fakF += j;
    }

    public final String toString() {
        long j = this.vekpFI4d1Nc4fakF;
        if (j <= 2147483647L) {
            return rCHnHJBAlOpNI5((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.vekpFI4d1Nc4fakF).toString());
    }

    public final String vIJudZvPyTuNp() {
        return EWUjsTERgdPbSw3NNlN(this.vekpFI4d1Nc4fakF, N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM);
    }

    public final boolean vekpFI4d1Nc4fakF() {
        return this.vekpFI4d1Nc4fakF == 0;
    }

    @Override // v.s.nj8JtA7VVVuzq
    public final zz3xpWRzprUTdR w9sT1Swbhx3hs() {
        return zz3xpWRzprUTdR.JXn4Qf7zpnLjP5;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            cwZXScWRdjOa6 cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn = O2DHNSIGZlgPja7eqLgn(1);
            int iMin = Math.min(i, 8192 - cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.vekpFI4d1Nc4fakF);
            byteBuffer.get(cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.dDIMxZXP1V8HdM, cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.vekpFI4d1Nc4fakF, iMin);
            i -= iMin;
            cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.vekpFI4d1Nc4fakF += iMin;
        }
        this.vekpFI4d1Nc4fakF += (long) iRemaining;
        return iRemaining;
    }

    @Override // v.s.fwkml16WWLbAl
    public final /* bridge */ /* synthetic */ fwkml16WWLbAl writeByte(int i) {
        ECwLkmPW1UKz7J6E(i);
        return this;
    }

    @Override // v.s.fwkml16WWLbAl
    public final /* bridge */ /* synthetic */ fwkml16WWLbAl writeInt(int i) {
        XuO9PPFo607ssKwZjNW(i);
        return this;
    }

    @Override // v.s.fwkml16WWLbAl
    public final /* bridge */ /* synthetic */ fwkml16WWLbAl writeShort(int i) {
        hV4VTKNUdeHN(i);
        return this;
    }

    public final void xfn2GJwmGqs7kWW(XslKUngIJyofTLpQ5 xslKUngIJyofTLpQ5) {
        xslKUngIJyofTLpQ5.gmNWMfvn6zlEj(this, xslKUngIJyofTLpQ5.vekpFI4d1Nc4fakF());
    }

    @Override // v.s.nj8JtA7VVVuzq
    public final long yTljMGnIibTRdOpSh4(LTdvNeHFqTsIb9 lTdvNeHFqTsIb9, long j) {
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        long j2 = this.vekpFI4d1Nc4fakF;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        lTdvNeHFqTsIb9.nQilHWaqS401ZtR(this, j);
        return j;
    }

    @Override // v.s.fwkml16WWLbAl
    public final fwkml16WWLbAl write(byte[] bArr) {
        tne6mXOUFKdd(bArr, bArr.length);
        return this;
    }

    public final int read(byte[] bArr, int i, int i2) {
        OFtLBiBbrrTHWu.vekpFI4d1Nc4fakF(bArr.length, i, i2);
        cwZXScWRdjOa6 cwzxscwrdjoa6 = this.w9sT1Swbhx3hs;
        if (cwzxscwrdjoa6 == null) {
            return -1;
        }
        int iMin = Math.min(i2, cwzxscwrdjoa6.vekpFI4d1Nc4fakF - cwzxscwrdjoa6.w9sT1Swbhx3hs);
        byte[] bArr2 = cwzxscwrdjoa6.dDIMxZXP1V8HdM;
        int i3 = cwzxscwrdjoa6.w9sT1Swbhx3hs;
        System.arraycopy(bArr2, i3, bArr, i, (i3 + iMin) - i3);
        int i4 = cwzxscwrdjoa6.w9sT1Swbhx3hs + iMin;
        cwzxscwrdjoa6.w9sT1Swbhx3hs = i4;
        this.vekpFI4d1Nc4fakF -= (long) iMin;
        if (i4 == cwzxscwrdjoa6.vekpFI4d1Nc4fakF) {
            this.w9sT1Swbhx3hs = cwzxscwrdjoa6.dDIMxZXP1V8HdM();
            iykucgHX1u40BAuhp.dDIMxZXP1V8HdM(cwzxscwrdjoa6);
        }
        return iMin;
    }
}
