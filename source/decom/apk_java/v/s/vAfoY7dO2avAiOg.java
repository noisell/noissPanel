package v.s;

import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import java.util.zip.Deflater;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class vAfoY7dO2avAiOg implements Closeable {
    public PPVKHKekPtxKcnappF D5P1xCAyuvgF;
    public final boolean Ee8d2j4S9Vm5yGuR;
    public final boolean JXn4Qf7zpnLjP5;
    public final LTdvNeHFqTsIb9 b1EoSIRjJHO5;
    public boolean pyu8ovAipBTLYAiKab;
    public final Random vekpFI4d1Nc4fakF;
    public final fwkml16WWLbAl w9sT1Swbhx3hs;
    public final long xDyLpEZyrcKVe0;
    public final LTdvNeHFqTsIb9 ibVTtJUNfrGYbW = new LTdvNeHFqTsIb9();
    public final byte[] hjneShqpF9Tis4 = new byte[4];
    public final R8Y7LdR0VPAAn gmNWMfvn6zlEj = new R8Y7LdR0VPAAn();

    public vAfoY7dO2avAiOg(fwkml16WWLbAl fwkml16wwlbal, Random random, boolean z, boolean z2, long j) {
        this.w9sT1Swbhx3hs = fwkml16wwlbal;
        this.vekpFI4d1Nc4fakF = random;
        this.JXn4Qf7zpnLjP5 = z;
        this.Ee8d2j4S9Vm5yGuR = z2;
        this.xDyLpEZyrcKVe0 = j;
        this.b1EoSIRjJHO5 = fwkml16wwlbal.pyu8ovAipBTLYAiKab();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        PPVKHKekPtxKcnappF pPVKHKekPtxKcnappF = this.D5P1xCAyuvgF;
        if (pPVKHKekPtxKcnappF != null) {
            pPVKHKekPtxKcnappF.close();
        }
    }

    public final void dDIMxZXP1V8HdM(int i, XslKUngIJyofTLpQ5 xslKUngIJyofTLpQ5) {
        if (this.pyu8ovAipBTLYAiKab) {
            throw new IOException("closed");
        }
        int iVekpFI4d1Nc4fakF = xslKUngIJyofTLpQ5.vekpFI4d1Nc4fakF();
        if (iVekpFI4d1Nc4fakF > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        LTdvNeHFqTsIb9 lTdvNeHFqTsIb9 = this.b1EoSIRjJHO5;
        lTdvNeHFqTsIb9.ECwLkmPW1UKz7J6E(i | 128);
        lTdvNeHFqTsIb9.ECwLkmPW1UKz7J6E(iVekpFI4d1Nc4fakF | 128);
        Random random = this.vekpFI4d1Nc4fakF;
        byte[] bArr = this.hjneShqpF9Tis4;
        random.nextBytes(bArr);
        lTdvNeHFqTsIb9.tne6mXOUFKdd(bArr, bArr.length);
        if (iVekpFI4d1Nc4fakF > 0) {
            long j = lTdvNeHFqTsIb9.vekpFI4d1Nc4fakF;
            xslKUngIJyofTLpQ5.gmNWMfvn6zlEj(lTdvNeHFqTsIb9, xslKUngIJyofTLpQ5.vekpFI4d1Nc4fakF());
            R8Y7LdR0VPAAn r8Y7LdR0VPAAn = this.gmNWMfvn6zlEj;
            lTdvNeHFqTsIb9.Qrz92kRPw4GcghAc(r8Y7LdR0VPAAn);
            r8Y7LdR0VPAAn.vekpFI4d1Nc4fakF(j);
            RIZfHbqXpth8r2yN4.gIIiyi2ddlMDR0(r8Y7LdR0VPAAn, bArr);
            r8Y7LdR0VPAAn.close();
        }
        this.w9sT1Swbhx3hs.flush();
    }

    public final void vekpFI4d1Nc4fakF(int i, XslKUngIJyofTLpQ5 xslKUngIJyofTLpQ5) throws IOException {
        long j;
        if (this.pyu8ovAipBTLYAiKab) {
            throw new IOException("closed");
        }
        int iVekpFI4d1Nc4fakF = xslKUngIJyofTLpQ5.vekpFI4d1Nc4fakF();
        LTdvNeHFqTsIb9 lTdvNeHFqTsIb9 = this.ibVTtJUNfrGYbW;
        xslKUngIJyofTLpQ5.gmNWMfvn6zlEj(lTdvNeHFqTsIb9, iVekpFI4d1Nc4fakF);
        int i2 = i | 128;
        if (!this.JXn4Qf7zpnLjP5 || xslKUngIJyofTLpQ5.w9sT1Swbhx3hs.length < this.xDyLpEZyrcKVe0) {
            j = 0;
        } else {
            PPVKHKekPtxKcnappF pPVKHKekPtxKcnappF = this.D5P1xCAyuvgF;
            if (pPVKHKekPtxKcnappF == null) {
                pPVKHKekPtxKcnappF = new PPVKHKekPtxKcnappF(0, this.Ee8d2j4S9Vm5yGuR);
                this.D5P1xCAyuvgF = pPVKHKekPtxKcnappF;
            }
            lsjwLzoU12hrEGbpVyI lsjwlzou12hregbpvyi = (lsjwLzoU12hrEGbpVyI) pPVKHKekPtxKcnappF.xDyLpEZyrcKVe0;
            LTdvNeHFqTsIb9 lTdvNeHFqTsIb10 = pPVKHKekPtxKcnappF.JXn4Qf7zpnLjP5;
            if (lTdvNeHFqTsIb10.vekpFI4d1Nc4fakF != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (pPVKHKekPtxKcnappF.vekpFI4d1Nc4fakF) {
                ((Deflater) pPVKHKekPtxKcnappF.Ee8d2j4S9Vm5yGuR).reset();
            }
            lsjwlzou12hregbpvyi.nQilHWaqS401ZtR(lTdvNeHFqTsIb9, lTdvNeHFqTsIb9.vekpFI4d1Nc4fakF);
            lsjwlzou12hregbpvyi.flush();
            XslKUngIJyofTLpQ5 xslKUngIJyofTLpQ6 = nmfdSUHdhf6AtVY9QU.dDIMxZXP1V8HdM;
            long j2 = lTdvNeHFqTsIb10.vekpFI4d1Nc4fakF;
            byte[] bArr = xslKUngIJyofTLpQ6.w9sT1Swbhx3hs;
            long length = j2 - ((long) bArr.length);
            int length2 = bArr.length;
            if (length < 0 || length2 < 0) {
                j = 0;
            } else {
                j = 0;
                if (j2 - length >= length2 && bArr.length >= length2) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length2) {
                            long j3 = lTdvNeHFqTsIb10.vekpFI4d1Nc4fakF - ((long) 4);
                            R8Y7LdR0VPAAn r8Y7LdR0VPAAnQrz92kRPw4GcghAc = lTdvNeHFqTsIb10.Qrz92kRPw4GcghAc(OFtLBiBbrrTHWu.dDIMxZXP1V8HdM);
                            try {
                                r8Y7LdR0VPAAnQrz92kRPw4GcghAc.dDIMxZXP1V8HdM(j3);
                                r8Y7LdR0VPAAnQrz92kRPw4GcghAc.close();
                                break;
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    okc5AGRjqrud84oM6d.Ee8d2j4S9Vm5yGuR(r8Y7LdR0VPAAnQrz92kRPw4GcghAc, th);
                                    throw th2;
                                }
                            }
                        }
                        if (lTdvNeHFqTsIb10.D5P1xCAyuvgF(((long) i3) + length) == xslKUngIJyofTLpQ6.w9sT1Swbhx3hs[i3]) {
                            i3++;
                        }
                    }
                }
                lTdvNeHFqTsIb9.nQilHWaqS401ZtR(lTdvNeHFqTsIb10, lTdvNeHFqTsIb10.vekpFI4d1Nc4fakF);
                i2 = i | 192;
            }
            lTdvNeHFqTsIb10.ECwLkmPW1UKz7J6E(0);
            lTdvNeHFqTsIb9.nQilHWaqS401ZtR(lTdvNeHFqTsIb10, lTdvNeHFqTsIb10.vekpFI4d1Nc4fakF);
            i2 = i | 192;
        }
        long j4 = lTdvNeHFqTsIb9.vekpFI4d1Nc4fakF;
        LTdvNeHFqTsIb9 lTdvNeHFqTsIb11 = this.b1EoSIRjJHO5;
        lTdvNeHFqTsIb11.ECwLkmPW1UKz7J6E(i2);
        if (j4 <= 125) {
            lTdvNeHFqTsIb11.ECwLkmPW1UKz7J6E(((int) j4) | 128);
        } else if (j4 <= 65535) {
            lTdvNeHFqTsIb11.ECwLkmPW1UKz7J6E(254);
            lTdvNeHFqTsIb11.hV4VTKNUdeHN((int) j4);
        } else {
            lTdvNeHFqTsIb11.ECwLkmPW1UKz7J6E(255);
            int i4 = (-24) + 32;
            cwZXScWRdjOa6 cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn = lTdvNeHFqTsIb11.O2DHNSIGZlgPja7eqLgn(i4);
            byte[] bArr2 = cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.dDIMxZXP1V8HdM;
            int i5 = cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.vekpFI4d1Nc4fakF;
            bArr2[i5] = (byte) ((j4 >>> (31 + 25)) & 255);
            bArr2[i5 + 1] = (byte) ((j4 >>> 48) & 255);
            bArr2[i5 + 2] = (byte) ((j4 >>> 40) & 255);
            bArr2[i5 + 3] = (byte) ((j4 >>> 32) & 255);
            bArr2[i5 + 4] = (byte) ((j4 >>> 24) & 255);
            bArr2[i5 + 5] = (byte) ((j4 >>> 16) & 255);
            bArr2[i5 + 6] = (byte) ((j4 >>> i4) & 255);
            bArr2[i5 + 7] = (byte) (j4 & 255);
            cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.vekpFI4d1Nc4fakF = i5 + i4;
            lTdvNeHFqTsIb11.vekpFI4d1Nc4fakF += 8;
        }
        Random random = this.vekpFI4d1Nc4fakF;
        byte[] bArr3 = this.hjneShqpF9Tis4;
        random.nextBytes(bArr3);
        lTdvNeHFqTsIb11.tne6mXOUFKdd(bArr3, bArr3.length);
        if (j4 > j) {
            R8Y7LdR0VPAAn r8Y7LdR0VPAAn = this.gmNWMfvn6zlEj;
            lTdvNeHFqTsIb9.Qrz92kRPw4GcghAc(r8Y7LdR0VPAAn);
            r8Y7LdR0VPAAn.vekpFI4d1Nc4fakF(j);
            RIZfHbqXpth8r2yN4.gIIiyi2ddlMDR0(r8Y7LdR0VPAAn, bArr3);
            r8Y7LdR0VPAAn.close();
        }
        lTdvNeHFqTsIb11.nQilHWaqS401ZtR(lTdvNeHFqTsIb9, j4);
        this.w9sT1Swbhx3hs.Ee8d2j4S9Vm5yGuR();
    }
}
