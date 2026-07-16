package v.s;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class pZpQ49r581UQ implements nj8JtA7VVVuzq {
    public boolean Ee8d2j4S9Vm5yGuR;
    public int JXn4Qf7zpnLjP5;
    public final Inflater vekpFI4d1Nc4fakF;
    public final ZHKD3ddbUALiCxl w9sT1Swbhx3hs;

    public pZpQ49r581UQ(ZHKD3ddbUALiCxl zHKD3ddbUALiCxl, Inflater inflater) {
        this.w9sT1Swbhx3hs = zHKD3ddbUALiCxl;
        this.vekpFI4d1Nc4fakF = inflater;
    }

    private static /* synthetic */ void mgkzsjiil() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.Ee8d2j4S9Vm5yGuR) {
            return;
        }
        this.vekpFI4d1Nc4fakF.end();
        this.Ee8d2j4S9Vm5yGuR = true;
        this.w9sT1Swbhx3hs.close();
    }

    public final long dDIMxZXP1V8HdM(LTdvNeHFqTsIb9 lTdvNeHFqTsIb9, long j) throws IOException {
        Inflater inflater = this.vekpFI4d1Nc4fakF;
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (this.Ee8d2j4S9Vm5yGuR) {
            throw new IllegalStateException("closed");
        }
        if (j != 0) {
            try {
                cwZXScWRdjOa6 cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn = lTdvNeHFqTsIb9.O2DHNSIGZlgPja7eqLgn(1);
                int iMin = (int) Math.min(j, 8192 - cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.vekpFI4d1Nc4fakF);
                boolean zNeedsInput = inflater.needsInput();
                ZHKD3ddbUALiCxl zHKD3ddbUALiCxl = this.w9sT1Swbhx3hs;
                if (zNeedsInput && !zHKD3ddbUALiCxl.dDIMxZXP1V8HdM()) {
                    cwZXScWRdjOa6 cwzxscwrdjoa6 = zHKD3ddbUALiCxl.vekpFI4d1Nc4fakF.w9sT1Swbhx3hs;
                    int i = cwzxscwrdjoa6.vekpFI4d1Nc4fakF;
                    int i2 = cwzxscwrdjoa6.w9sT1Swbhx3hs;
                    int i3 = i - i2;
                    this.JXn4Qf7zpnLjP5 = i3;
                    inflater.setInput(cwzxscwrdjoa6.dDIMxZXP1V8HdM, i2, i3);
                }
                int iInflate = inflater.inflate(cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.dDIMxZXP1V8HdM, cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.vekpFI4d1Nc4fakF, iMin);
                int i4 = this.JXn4Qf7zpnLjP5;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.JXn4Qf7zpnLjP5 -= remaining;
                    zHKD3ddbUALiCxl.skip(remaining);
                }
                if (iInflate > 0) {
                    cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.vekpFI4d1Nc4fakF += iInflate;
                    long j2 = iInflate;
                    lTdvNeHFqTsIb9.vekpFI4d1Nc4fakF += j2;
                    return j2;
                }
                if (cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.w9sT1Swbhx3hs == cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.vekpFI4d1Nc4fakF) {
                    lTdvNeHFqTsIb9.w9sT1Swbhx3hs = cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.dDIMxZXP1V8HdM();
                    iykucgHX1u40BAuhp.dDIMxZXP1V8HdM(cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn);
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        return 0L;
    }

    @Override // v.s.nj8JtA7VVVuzq
    public final zz3xpWRzprUTdR w9sT1Swbhx3hs() {
        return this.w9sT1Swbhx3hs.w9sT1Swbhx3hs.w9sT1Swbhx3hs();
    }

    @Override // v.s.nj8JtA7VVVuzq
    public final long yTljMGnIibTRdOpSh4(LTdvNeHFqTsIb9 lTdvNeHFqTsIb9, long j) throws IOException {
        do {
            long jDDIMxZXP1V8HdM = dDIMxZXP1V8HdM(lTdvNeHFqTsIb9, 8192L);
            if (jDDIMxZXP1V8HdM > 0) {
                return jDDIMxZXP1V8HdM;
            }
            Inflater inflater = this.vekpFI4d1Nc4fakF;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.w9sT1Swbhx3hs.dDIMxZXP1V8HdM());
        throw new EOFException("source exhausted prematurely");
    }
}
