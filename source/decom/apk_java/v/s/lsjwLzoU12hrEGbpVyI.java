package v.s;

import java.io.IOException;
import java.util.zip.Deflater;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class lsjwLzoU12hrEGbpVyI implements kdnUsNLKSJv552LW2x {
    public boolean JXn4Qf7zpnLjP5;
    public final Deflater vekpFI4d1Nc4fakF;
    public final lpsYIxZHQFa6jCAhXSJ w9sT1Swbhx3hs;

    public lsjwLzoU12hrEGbpVyI(LTdvNeHFqTsIb9 lTdvNeHFqTsIb9, Deflater deflater) {
        this.w9sT1Swbhx3hs = new lpsYIxZHQFa6jCAhXSJ(lTdvNeHFqTsIb9);
        this.vekpFI4d1Nc4fakF = deflater;
    }

    @Override // v.s.kdnUsNLKSJv552LW2x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Deflater deflater = this.vekpFI4d1Nc4fakF;
        if (this.JXn4Qf7zpnLjP5) {
            return;
        }
        deflater.finish();
        dDIMxZXP1V8HdM(false);
        th = null;
        try {
            deflater.end();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        try {
            this.w9sT1Swbhx3hs.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.JXn4Qf7zpnLjP5 = true;
        if (th != null) {
            throw th;
        }
    }

    public final void dDIMxZXP1V8HdM(boolean z) throws IOException {
        cwZXScWRdjOa6 cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn;
        int iDeflate;
        lpsYIxZHQFa6jCAhXSJ lpsyixzhqfa6jcahxsj = this.w9sT1Swbhx3hs;
        LTdvNeHFqTsIb9 lTdvNeHFqTsIb9 = lpsyixzhqfa6jcahxsj.vekpFI4d1Nc4fakF;
        while (true) {
            cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn = lTdvNeHFqTsIb9.O2DHNSIGZlgPja7eqLgn(1);
            byte[] bArr = cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.dDIMxZXP1V8HdM;
            Deflater deflater = this.vekpFI4d1Nc4fakF;
            if (z) {
                try {
                    int i = cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.vekpFI4d1Nc4fakF;
                    iDeflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (NullPointerException e) {
                    throw new IOException("Deflater already closed", e);
                }
            } else {
                int i2 = cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.vekpFI4d1Nc4fakF;
                iDeflate = deflater.deflate(bArr, i2, 8192 - i2);
            }
            if (iDeflate > 0) {
                cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.vekpFI4d1Nc4fakF += iDeflate;
                lTdvNeHFqTsIb9.vekpFI4d1Nc4fakF += (long) iDeflate;
                lpsyixzhqfa6jcahxsj.dDIMxZXP1V8HdM();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.w9sT1Swbhx3hs == cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.vekpFI4d1Nc4fakF) {
            lTdvNeHFqTsIb9.w9sT1Swbhx3hs = cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.dDIMxZXP1V8HdM();
            iykucgHX1u40BAuhp.dDIMxZXP1V8HdM(cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @Override // v.s.kdnUsNLKSJv552LW2x, java.io.Flushable
    public final void flush() throws IOException {
        dDIMxZXP1V8HdM((-63) + 64);
        this.w9sT1Swbhx3hs.flush();
    }

    @Override // v.s.kdnUsNLKSJv552LW2x
    public final void nQilHWaqS401ZtR(LTdvNeHFqTsIb9 lTdvNeHFqTsIb9, long j) throws IOException {
        OFtLBiBbrrTHWu.vekpFI4d1Nc4fakF(lTdvNeHFqTsIb9.vekpFI4d1Nc4fakF, 0L, j);
        while (j > 0) {
            cwZXScWRdjOa6 cwzxscwrdjoa6 = lTdvNeHFqTsIb9.w9sT1Swbhx3hs;
            int iMin = (int) Math.min(j, cwzxscwrdjoa6.vekpFI4d1Nc4fakF - cwzxscwrdjoa6.w9sT1Swbhx3hs);
            this.vekpFI4d1Nc4fakF.setInput(cwzxscwrdjoa6.dDIMxZXP1V8HdM, cwzxscwrdjoa6.w9sT1Swbhx3hs, iMin);
            dDIMxZXP1V8HdM(false);
            long j2 = iMin;
            lTdvNeHFqTsIb9.vekpFI4d1Nc4fakF -= j2;
            int i = cwzxscwrdjoa6.w9sT1Swbhx3hs + iMin;
            cwzxscwrdjoa6.w9sT1Swbhx3hs = i;
            if (i == cwzxscwrdjoa6.vekpFI4d1Nc4fakF) {
                lTdvNeHFqTsIb9.w9sT1Swbhx3hs = cwzxscwrdjoa6.dDIMxZXP1V8HdM();
                iykucgHX1u40BAuhp.dDIMxZXP1V8HdM(cwzxscwrdjoa6);
            }
            j -= j2;
        }
    }

    public final String toString() {
        return "DeflaterSink(" + this.w9sT1Swbhx3hs + ')';
    }

    @Override // v.s.kdnUsNLKSJv552LW2x
    public final zz3xpWRzprUTdR w9sT1Swbhx3hs() {
        return this.w9sT1Swbhx3hs.w9sT1Swbhx3hs.w9sT1Swbhx3hs();
    }
}
