package v.s;

import java.io.Closeable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class R8Y7LdR0VPAAn implements Closeable {
    public cwZXScWRdjOa6 JXn4Qf7zpnLjP5;
    public boolean vekpFI4d1Nc4fakF;
    public LTdvNeHFqTsIb9 w9sT1Swbhx3hs;
    public byte[] xDyLpEZyrcKVe0;
    public long Ee8d2j4S9Vm5yGuR = -1;
    public int ibVTtJUNfrGYbW = -1;
    public int b1EoSIRjJHO5 = -1;

    private static /* synthetic */ void onyi() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.w9sT1Swbhx3hs == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        this.w9sT1Swbhx3hs = null;
        this.JXn4Qf7zpnLjP5 = null;
        this.Ee8d2j4S9Vm5yGuR = -1L;
        this.xDyLpEZyrcKVe0 = null;
        this.ibVTtJUNfrGYbW = -1;
        this.b1EoSIRjJHO5 = -1;
    }

    public final void dDIMxZXP1V8HdM(long j) {
        LTdvNeHFqTsIb9 lTdvNeHFqTsIb9 = this.w9sT1Swbhx3hs;
        if (lTdvNeHFqTsIb9 == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!this.vekpFI4d1Nc4fakF) {
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
        }
        long j2 = lTdvNeHFqTsIb9.vekpFI4d1Nc4fakF;
        if (j <= j2) {
            if (j < 0) {
                throw new IllegalArgumentException(("newSize < 0: " + j).toString());
            }
            long j3 = j2 - j;
            while (j3 > 0) {
                cwZXScWRdjOa6 cwzxscwrdjoa6 = lTdvNeHFqTsIb9.w9sT1Swbhx3hs.ibVTtJUNfrGYbW;
                int i = cwzxscwrdjoa6.vekpFI4d1Nc4fakF;
                long j4 = i - cwzxscwrdjoa6.w9sT1Swbhx3hs;
                if (j4 > j3) {
                    cwzxscwrdjoa6.vekpFI4d1Nc4fakF = i - ((int) j3);
                    break;
                } else {
                    lTdvNeHFqTsIb9.w9sT1Swbhx3hs = cwzxscwrdjoa6.dDIMxZXP1V8HdM();
                    iykucgHX1u40BAuhp.dDIMxZXP1V8HdM(cwzxscwrdjoa6);
                    j3 -= j4;
                }
            }
            this.JXn4Qf7zpnLjP5 = null;
            this.Ee8d2j4S9Vm5yGuR = j;
            this.xDyLpEZyrcKVe0 = null;
            this.ibVTtJUNfrGYbW = -1;
            this.b1EoSIRjJHO5 = -1;
        } else if (j > j2) {
            long j5 = j - j2;
            int i2 = 1;
            boolean z = true;
            for (long j6 = 0; j5 > j6; j6 = 0) {
                cwZXScWRdjOa6 cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn = lTdvNeHFqTsIb9.O2DHNSIGZlgPja7eqLgn(i2);
                int iMin = (int) Math.min(j5, 8192 - cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.vekpFI4d1Nc4fakF);
                int i3 = cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.vekpFI4d1Nc4fakF + iMin;
                cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.vekpFI4d1Nc4fakF = i3;
                j5 -= (long) iMin;
                if (z) {
                    this.JXn4Qf7zpnLjP5 = cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn;
                    this.Ee8d2j4S9Vm5yGuR = j2;
                    this.xDyLpEZyrcKVe0 = cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.dDIMxZXP1V8HdM;
                    this.ibVTtJUNfrGYbW = i3 - iMin;
                    this.b1EoSIRjJHO5 = i3;
                    z = false;
                }
                i2 = 1;
            }
        }
        lTdvNeHFqTsIb9.vekpFI4d1Nc4fakF = j;
    }

    public final int vekpFI4d1Nc4fakF(long j) {
        LTdvNeHFqTsIb9 lTdvNeHFqTsIb9 = this.w9sT1Swbhx3hs;
        if (lTdvNeHFqTsIb9 == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (j >= -1) {
            long j2 = lTdvNeHFqTsIb9.vekpFI4d1Nc4fakF;
            if (j <= j2) {
                if (j == -1 || j == j2) {
                    this.JXn4Qf7zpnLjP5 = null;
                    this.Ee8d2j4S9Vm5yGuR = j;
                    this.xDyLpEZyrcKVe0 = null;
                    this.ibVTtJUNfrGYbW = -1;
                    this.b1EoSIRjJHO5 = -1;
                    return -1;
                }
                cwZXScWRdjOa6 cwzxscwrdjoa6 = lTdvNeHFqTsIb9.w9sT1Swbhx3hs;
                cwZXScWRdjOa6 cwzxscwrdjoa7 = this.JXn4Qf7zpnLjP5;
                long j3 = 0;
                if (cwzxscwrdjoa7 != null) {
                    long j4 = this.Ee8d2j4S9Vm5yGuR - ((long) (this.ibVTtJUNfrGYbW - cwzxscwrdjoa7.w9sT1Swbhx3hs));
                    if (j4 > j) {
                        cwzxscwrdjoa7 = cwzxscwrdjoa6;
                        cwzxscwrdjoa6 = cwzxscwrdjoa7;
                        j2 = j4;
                    } else {
                        j3 = j4;
                    }
                } else {
                    cwzxscwrdjoa7 = cwzxscwrdjoa6;
                }
                if (j2 - j > j - j3) {
                    while (true) {
                        long j5 = ((long) (cwzxscwrdjoa7.vekpFI4d1Nc4fakF - cwzxscwrdjoa7.w9sT1Swbhx3hs)) + j3;
                        if (j < j5) {
                            break;
                        }
                        cwzxscwrdjoa7 = cwzxscwrdjoa7.xDyLpEZyrcKVe0;
                        j3 = j5;
                    }
                } else {
                    while (j2 > j) {
                        cwzxscwrdjoa6 = cwzxscwrdjoa6.ibVTtJUNfrGYbW;
                        j2 -= (long) (cwzxscwrdjoa6.vekpFI4d1Nc4fakF - cwzxscwrdjoa6.w9sT1Swbhx3hs);
                    }
                    cwzxscwrdjoa7 = cwzxscwrdjoa6;
                    j3 = j2;
                }
                if (this.vekpFI4d1Nc4fakF && cwzxscwrdjoa7.JXn4Qf7zpnLjP5) {
                    byte[] bArr = cwzxscwrdjoa7.dDIMxZXP1V8HdM;
                    cwZXScWRdjOa6 cwzxscwrdjoa8 = new cwZXScWRdjOa6(Arrays.copyOf(bArr, bArr.length), cwzxscwrdjoa7.w9sT1Swbhx3hs, cwzxscwrdjoa7.vekpFI4d1Nc4fakF, false, true);
                    if (lTdvNeHFqTsIb9.w9sT1Swbhx3hs == cwzxscwrdjoa7) {
                        lTdvNeHFqTsIb9.w9sT1Swbhx3hs = cwzxscwrdjoa8;
                    }
                    cwzxscwrdjoa7.w9sT1Swbhx3hs(cwzxscwrdjoa8);
                    cwzxscwrdjoa8.ibVTtJUNfrGYbW.dDIMxZXP1V8HdM();
                    cwzxscwrdjoa7 = cwzxscwrdjoa8;
                }
                this.JXn4Qf7zpnLjP5 = cwzxscwrdjoa7;
                this.Ee8d2j4S9Vm5yGuR = j;
                this.xDyLpEZyrcKVe0 = cwzxscwrdjoa7.dDIMxZXP1V8HdM;
                int i = cwzxscwrdjoa7.w9sT1Swbhx3hs + ((int) (j - j3));
                this.ibVTtJUNfrGYbW = i;
                int i2 = cwzxscwrdjoa7.vekpFI4d1Nc4fakF;
                this.b1EoSIRjJHO5 = i2;
                return i2 - i;
            }
        }
        throw new ArrayIndexOutOfBoundsException("offset=" + j + " > size=" + lTdvNeHFqTsIb9.vekpFI4d1Nc4fakF);
    }
}
