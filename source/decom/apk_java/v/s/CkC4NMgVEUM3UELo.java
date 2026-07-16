package v.s;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class CkC4NMgVEUM3UELo implements kdnUsNLKSJv552LW2x {
    public final Object JXn4Qf7zpnLjP5;
    public final tdVrJ0LVZVn68Eqj vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs = 1;

    public CkC4NMgVEUM3UELo(OutputStream outputStream, tdVrJ0LVZVn68Eqj tdvrj0lvzvn68eqj) {
        this.JXn4Qf7zpnLjP5 = outputStream;
        this.vekpFI4d1Nc4fakF = tdvrj0lvzvn68eqj;
    }

    @Override // v.s.kdnUsNLKSJv552LW2x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                CkC4NMgVEUM3UELo ckC4NMgVEUM3UELo = (CkC4NMgVEUM3UELo) this.JXn4Qf7zpnLjP5;
                tdVrJ0LVZVn68Eqj tdvrj0lvzvn68eqj = this.vekpFI4d1Nc4fakF;
                tdvrj0lvzvn68eqj.pyu8ovAipBTLYAiKab();
                try {
                    try {
                        ckC4NMgVEUM3UELo.close();
                        if (tdvrj0lvzvn68eqj.D5P1xCAyuvgF()) {
                            throw tdvrj0lvzvn68eqj.gmNWMfvn6zlEj(null);
                        }
                        return;
                    } catch (IOException e) {
                        if (!tdvrj0lvzvn68eqj.D5P1xCAyuvgF()) {
                            throw e;
                        }
                        throw tdvrj0lvzvn68eqj.gmNWMfvn6zlEj(e);
                    }
                } catch (Throwable th) {
                    tdvrj0lvzvn68eqj.D5P1xCAyuvgF();
                    throw th;
                }
            default:
                ((OutputStream) this.JXn4Qf7zpnLjP5).close();
                return;
        }
    }

    @Override // v.s.kdnUsNLKSJv552LW2x, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                CkC4NMgVEUM3UELo ckC4NMgVEUM3UELo = (CkC4NMgVEUM3UELo) this.JXn4Qf7zpnLjP5;
                tdVrJ0LVZVn68Eqj tdvrj0lvzvn68eqj = this.vekpFI4d1Nc4fakF;
                tdvrj0lvzvn68eqj.pyu8ovAipBTLYAiKab();
                try {
                    try {
                        ckC4NMgVEUM3UELo.flush();
                        if (tdvrj0lvzvn68eqj.D5P1xCAyuvgF()) {
                            throw tdvrj0lvzvn68eqj.gmNWMfvn6zlEj(null);
                        }
                        return;
                    } catch (IOException e) {
                        if (!tdvrj0lvzvn68eqj.D5P1xCAyuvgF()) {
                            throw e;
                        }
                        throw tdvrj0lvzvn68eqj.gmNWMfvn6zlEj(e);
                    }
                } catch (Throwable th) {
                    tdvrj0lvzvn68eqj.D5P1xCAyuvgF();
                    throw th;
                }
            default:
                ((OutputStream) this.JXn4Qf7zpnLjP5).flush();
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008c A[LOOP:1: B:12:0x005a->B:25:0x008c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x008f A[SYNTHETIC] */
    @Override // v.s.kdnUsNLKSJv552LW2x
    public final void nQilHWaqS401ZtR(LTdvNeHFqTsIb9 lTdvNeHFqTsIb9, long j) throws IOException {
        tdVrJ0LVZVn68Eqj tdvrj0lvzvn68eqj;
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                OFtLBiBbrrTHWu.vekpFI4d1Nc4fakF(lTdvNeHFqTsIb9.vekpFI4d1Nc4fakF, 0L, j);
                long j2 = j;
                while (true) {
                    long j3 = 0;
                    if (j2 <= 0) {
                        return;
                    }
                    cwZXScWRdjOa6 cwzxscwrdjoa6 = lTdvNeHFqTsIb9.w9sT1Swbhx3hs;
                    try {
                        try {
                            while (j3 < 65536) {
                                j3 += (long) (cwzxscwrdjoa6.vekpFI4d1Nc4fakF - cwzxscwrdjoa6.w9sT1Swbhx3hs);
                                if (j3 >= j2) {
                                    j3 = j2;
                                    CkC4NMgVEUM3UELo ckC4NMgVEUM3UELo = (CkC4NMgVEUM3UELo) this.JXn4Qf7zpnLjP5;
                                    tdvrj0lvzvn68eqj = this.vekpFI4d1Nc4fakF;
                                    tdvrj0lvzvn68eqj.pyu8ovAipBTLYAiKab();
                                    ckC4NMgVEUM3UELo.nQilHWaqS401ZtR(lTdvNeHFqTsIb9, j3);
                                    if (!tdvrj0lvzvn68eqj.D5P1xCAyuvgF()) {
                                        throw tdvrj0lvzvn68eqj.gmNWMfvn6zlEj(null);
                                    }
                                    j2 -= j3;
                                } else {
                                    cwzxscwrdjoa6 = cwzxscwrdjoa6.xDyLpEZyrcKVe0;
                                }
                            }
                            ckC4NMgVEUM3UELo.nQilHWaqS401ZtR(lTdvNeHFqTsIb9, j3);
                            if (!tdvrj0lvzvn68eqj.D5P1xCAyuvgF()) {
                                throw tdvrj0lvzvn68eqj.gmNWMfvn6zlEj(null);
                            }
                            j2 -= j3;
                        } catch (IOException e) {
                            if (!tdvrj0lvzvn68eqj.D5P1xCAyuvgF()) {
                                throw e;
                            }
                            throw tdvrj0lvzvn68eqj.gmNWMfvn6zlEj(e);
                        }
                    } catch (Throwable th) {
                        tdvrj0lvzvn68eqj.D5P1xCAyuvgF();
                        throw th;
                    }
                    CkC4NMgVEUM3UELo ckC4NMgVEUM3UELo2 = (CkC4NMgVEUM3UELo) this.JXn4Qf7zpnLjP5;
                    tdvrj0lvzvn68eqj = this.vekpFI4d1Nc4fakF;
                    tdvrj0lvzvn68eqj.pyu8ovAipBTLYAiKab();
                }
                break;
            default:
                OFtLBiBbrrTHWu.vekpFI4d1Nc4fakF(lTdvNeHFqTsIb9.vekpFI4d1Nc4fakF, 0L, j);
                while (j > 0) {
                    this.vekpFI4d1Nc4fakF.xDyLpEZyrcKVe0();
                    cwZXScWRdjOa6 cwzxscwrdjoa7 = lTdvNeHFqTsIb9.w9sT1Swbhx3hs;
                    int iMin = (int) Math.min(j, cwzxscwrdjoa7.vekpFI4d1Nc4fakF - cwzxscwrdjoa7.w9sT1Swbhx3hs);
                    ((OutputStream) this.JXn4Qf7zpnLjP5).write(cwzxscwrdjoa7.dDIMxZXP1V8HdM, cwzxscwrdjoa7.w9sT1Swbhx3hs, iMin);
                    int i = cwzxscwrdjoa7.w9sT1Swbhx3hs + iMin;
                    cwzxscwrdjoa7.w9sT1Swbhx3hs = i;
                    long j4 = iMin;
                    j -= j4;
                    lTdvNeHFqTsIb9.vekpFI4d1Nc4fakF -= j4;
                    if (i == cwzxscwrdjoa7.vekpFI4d1Nc4fakF) {
                        lTdvNeHFqTsIb9.w9sT1Swbhx3hs = cwzxscwrdjoa7.dDIMxZXP1V8HdM();
                        iykucgHX1u40BAuhp.dDIMxZXP1V8HdM(cwzxscwrdjoa7);
                    }
                }
                return;
        }
    }

    public final String toString() {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                return "AsyncTimeout.sink(" + ((CkC4NMgVEUM3UELo) this.JXn4Qf7zpnLjP5) + ')';
            default:
                return "sink(" + ((OutputStream) this.JXn4Qf7zpnLjP5) + ')';
        }
    }

    @Override // v.s.kdnUsNLKSJv552LW2x
    public final zz3xpWRzprUTdR w9sT1Swbhx3hs() {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                break;
        }
        return this.vekpFI4d1Nc4fakF;
    }

    public CkC4NMgVEUM3UELo(tdVrJ0LVZVn68Eqj tdvrj0lvzvn68eqj, CkC4NMgVEUM3UELo ckC4NMgVEUM3UELo) {
        this.vekpFI4d1Nc4fakF = tdvrj0lvzvn68eqj;
        this.JXn4Qf7zpnLjP5 = ckC4NMgVEUM3UELo;
    }
}
