package v.s;

import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class gvlctfzwrJh09D58 implements nj8JtA7VVVuzq {
    public final /* synthetic */ Eruqtn8YZhu5 ibVTtJUNfrGYbW;
    public boolean vekpFI4d1Nc4fakF;
    public final long w9sT1Swbhx3hs;
    public boolean xDyLpEZyrcKVe0;
    public final LTdvNeHFqTsIb9 JXn4Qf7zpnLjP5 = new LTdvNeHFqTsIb9();
    public final LTdvNeHFqTsIb9 Ee8d2j4S9Vm5yGuR = new LTdvNeHFqTsIb9();

    public gvlctfzwrJh09D58(Eruqtn8YZhu5 eruqtn8YZhu5, long j, boolean z) {
        this.ibVTtJUNfrGYbW = eruqtn8YZhu5;
        this.w9sT1Swbhx3hs = j;
        this.vekpFI4d1Nc4fakF = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        Eruqtn8YZhu5 eruqtn8YZhu5 = this.ibVTtJUNfrGYbW;
        synchronized (eruqtn8YZhu5) {
            this.xDyLpEZyrcKVe0 = true;
            LTdvNeHFqTsIb9 lTdvNeHFqTsIb9 = this.Ee8d2j4S9Vm5yGuR;
            j = lTdvNeHFqTsIb9.vekpFI4d1Nc4fakF;
            lTdvNeHFqTsIb9.skip(j);
            eruqtn8YZhu5.notifyAll();
        }
        if (j > 0) {
            Eruqtn8YZhu5 eruqtn8YZhu6 = this.ibVTtJUNfrGYbW;
            byte[] bArr = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
            eruqtn8YZhu6.w9sT1Swbhx3hs.Qrz92kRPw4GcghAc(j);
        }
        this.ibVTtJUNfrGYbW.dDIMxZXP1V8HdM();
    }

    @Override // v.s.nj8JtA7VVVuzq
    public final zz3xpWRzprUTdR w9sT1Swbhx3hs() {
        return this.ibVTtJUNfrGYbW.hjneShqpF9Tis4;
    }

    @Override // v.s.nj8JtA7VVVuzq
    public final long yTljMGnIibTRdOpSh4(LTdvNeHFqTsIb9 lTdvNeHFqTsIb9, long j) throws Throwable {
        int i;
        Throwable qdsbso4atins0kmnwf;
        boolean z;
        long jYTljMGnIibTRdOpSh4;
        do {
            Eruqtn8YZhu5 eruqtn8YZhu5 = this.ibVTtJUNfrGYbW;
            synchronized (eruqtn8YZhu5) {
                eruqtn8YZhu5.hjneShqpF9Tis4.pyu8ovAipBTLYAiKab();
                try {
                    synchronized (eruqtn8YZhu5) {
                        i = eruqtn8YZhu5.gIIiyi2ddlMDR0;
                    }
                } catch (Throwable th) {
                    eruqtn8YZhu5.hjneShqpF9Tis4.gmNWMfvn6zlEj();
                    throw th;
                }
            }
            if (i != 0 && !this.vekpFI4d1Nc4fakF) {
                qdsbso4atins0kmnwf = eruqtn8YZhu5.wotphlvK9sPbXJ;
                if (qdsbso4atins0kmnwf == null) {
                    synchronized (eruqtn8YZhu5) {
                        qdsbso4atins0kmnwf = new qdSbSo4AtinS0kmNwf(eruqtn8YZhu5.gIIiyi2ddlMDR0);
                    }
                }
                throw th;
            }
            qdsbso4atins0kmnwf = null;
            if (this.xDyLpEZyrcKVe0) {
                throw new IOException("stream closed");
            }
            LTdvNeHFqTsIb9 lTdvNeHFqTsIb10 = this.Ee8d2j4S9Vm5yGuR;
            long j2 = lTdvNeHFqTsIb10.vekpFI4d1Nc4fakF;
            z = false;
            if (j2 > 0) {
                jYTljMGnIibTRdOpSh4 = lTdvNeHFqTsIb10.yTljMGnIibTRdOpSh4(lTdvNeHFqTsIb9, Math.min(8192L, j2));
                long j3 = eruqtn8YZhu5.vekpFI4d1Nc4fakF + jYTljMGnIibTRdOpSh4;
                eruqtn8YZhu5.vekpFI4d1Nc4fakF = j3;
                long j4 = j3 - eruqtn8YZhu5.JXn4Qf7zpnLjP5;
                if (qdsbso4atins0kmnwf == null && j4 >= eruqtn8YZhu5.w9sT1Swbhx3hs.MLSIo1htfMPWeB8V876L.dDIMxZXP1V8HdM() / 2) {
                    eruqtn8YZhu5.w9sT1Swbhx3hs.vIJudZvPyTuNp(eruqtn8YZhu5.dDIMxZXP1V8HdM, j4);
                    eruqtn8YZhu5.JXn4Qf7zpnLjP5 = eruqtn8YZhu5.vekpFI4d1Nc4fakF;
                }
            } else {
                if (!this.vekpFI4d1Nc4fakF && qdsbso4atins0kmnwf == null) {
                    try {
                        eruqtn8YZhu5.wait();
                        z = true;
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                jYTljMGnIibTRdOpSh4 = -1;
            }
            eruqtn8YZhu5.hjneShqpF9Tis4.gmNWMfvn6zlEj();
        } while (z);
        if (jYTljMGnIibTRdOpSh4 != -1) {
            return jYTljMGnIibTRdOpSh4;
        }
        if (qdsbso4atins0kmnwf == null) {
            return -1L;
        }
        throw qdsbso4atins0kmnwf;
    }
}
