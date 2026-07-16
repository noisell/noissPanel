package v.s;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class K3kPk3jNrQadry74Mtp implements nj8JtA7VVVuzq {
    public final Object JXn4Qf7zpnLjP5;
    public final Object vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs;

    public /* synthetic */ K3kPk3jNrQadry74Mtp(Object obj, int i, Object obj2) {
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = obj;
        this.JXn4Qf7zpnLjP5 = obj2;
    }

    private static /* synthetic */ void ijcmly() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                tdVrJ0LVZVn68Eqj tdvrj0lvzvn68eqj = (tdVrJ0LVZVn68Eqj) this.vekpFI4d1Nc4fakF;
                K3kPk3jNrQadry74Mtp k3kPk3jNrQadry74Mtp = (K3kPk3jNrQadry74Mtp) this.JXn4Qf7zpnLjP5;
                tdvrj0lvzvn68eqj.pyu8ovAipBTLYAiKab();
                try {
                    try {
                        k3kPk3jNrQadry74Mtp.close();
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
                ((InputStream) this.vekpFI4d1Nc4fakF).close();
                return;
        }
    }

    public final String toString() {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                return "AsyncTimeout.source(" + ((K3kPk3jNrQadry74Mtp) this.JXn4Qf7zpnLjP5) + ')';
            default:
                return "source(" + ((InputStream) this.vekpFI4d1Nc4fakF) + ')';
        }
    }

    @Override // v.s.nj8JtA7VVVuzq
    public final zz3xpWRzprUTdR w9sT1Swbhx3hs() {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                return (tdVrJ0LVZVn68Eqj) this.vekpFI4d1Nc4fakF;
            default:
                return (zz3xpWRzprUTdR) this.JXn4Qf7zpnLjP5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0072  */
    @Override // v.s.nj8JtA7VVVuzq
    public final long yTljMGnIibTRdOpSh4(LTdvNeHFqTsIb9 lTdvNeHFqTsIb9, long j) throws IOException {
        boolean z;
        int i = this.w9sT1Swbhx3hs;
        Object obj = this.vekpFI4d1Nc4fakF;
        Object obj2 = this.JXn4Qf7zpnLjP5;
        switch (i) {
            case 0:
                tdVrJ0LVZVn68Eqj tdvrj0lvzvn68eqj = (tdVrJ0LVZVn68Eqj) obj;
                K3kPk3jNrQadry74Mtp k3kPk3jNrQadry74Mtp = (K3kPk3jNrQadry74Mtp) obj2;
                tdvrj0lvzvn68eqj.pyu8ovAipBTLYAiKab();
                try {
                    try {
                        long jYTljMGnIibTRdOpSh4 = k3kPk3jNrQadry74Mtp.yTljMGnIibTRdOpSh4(lTdvNeHFqTsIb9, 8192L);
                        if (tdvrj0lvzvn68eqj.D5P1xCAyuvgF()) {
                            throw tdvrj0lvzvn68eqj.gmNWMfvn6zlEj(null);
                        }
                        return jYTljMGnIibTRdOpSh4;
                    } catch (IOException e) {
                        if (tdvrj0lvzvn68eqj.D5P1xCAyuvgF()) {
                            throw tdvrj0lvzvn68eqj.gmNWMfvn6zlEj(e);
                        }
                        throw e;
                    }
                } catch (Throwable th) {
                    tdvrj0lvzvn68eqj.D5P1xCAyuvgF();
                    throw th;
                }
            default:
                try {
                    ((zz3xpWRzprUTdR) obj2).xDyLpEZyrcKVe0();
                    cwZXScWRdjOa6 cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn = lTdvNeHFqTsIb9.O2DHNSIGZlgPja7eqLgn(1);
                    int i2 = ((InputStream) obj).read(cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.dDIMxZXP1V8HdM, cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.vekpFI4d1Nc4fakF, (int) Math.min(8192L, 8192 - cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.vekpFI4d1Nc4fakF));
                    if (i2 == -1) {
                        if (cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.w9sT1Swbhx3hs == cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.vekpFI4d1Nc4fakF) {
                            lTdvNeHFqTsIb9.w9sT1Swbhx3hs = cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.dDIMxZXP1V8HdM();
                            iykucgHX1u40BAuhp.dDIMxZXP1V8HdM(cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn);
                        }
                        return -1L;
                    }
                    cwzxscwrdjoa6O2DHNSIGZlgPja7eqLgn.vekpFI4d1Nc4fakF += i2;
                    long j2 = i2;
                    lTdvNeHFqTsIb9.vekpFI4d1Nc4fakF += j2;
                    return j2;
                } catch (AssertionError e2) {
                    Logger logger = tntAixqOgreLyNBUe.dDIMxZXP1V8HdM;
                    if (e2.getCause() != null) {
                        String message = e2.getMessage();
                        z = message != null ? KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(message, "getsockname failed", false) : false;
                    }
                    if (z) {
                        throw new IOException(e2);
                    }
                    throw e2;
                }
        }
    }
}
