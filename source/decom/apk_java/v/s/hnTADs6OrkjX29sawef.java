package v.s;

import java.io.InterruptedIOException;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class hnTADs6OrkjX29sawef implements kdnUsNLKSJv552LW2x {
    public final /* synthetic */ Eruqtn8YZhu5 Ee8d2j4S9Vm5yGuR;
    public boolean JXn4Qf7zpnLjP5;
    public final LTdvNeHFqTsIb9 vekpFI4d1Nc4fakF = new LTdvNeHFqTsIb9();
    public final boolean w9sT1Swbhx3hs;

    public hnTADs6OrkjX29sawef(Eruqtn8YZhu5 eruqtn8YZhu5, boolean z) {
        this.Ee8d2j4S9Vm5yGuR = eruqtn8YZhu5;
        this.w9sT1Swbhx3hs = z;
    }

    @Override // v.s.kdnUsNLKSJv552LW2x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        Eruqtn8YZhu5 eruqtn8YZhu5 = this.Ee8d2j4S9Vm5yGuR;
        byte[] bArr = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
        synchronized (eruqtn8YZhu5) {
            if (this.JXn4Qf7zpnLjP5) {
                return;
            }
            synchronized (eruqtn8YZhu5) {
                z = eruqtn8YZhu5.gIIiyi2ddlMDR0 == 0;
            }
            Eruqtn8YZhu5 eruqtn8YZhu6 = this.Ee8d2j4S9Vm5yGuR;
            if (!eruqtn8YZhu6.D5P1xCAyuvgF.w9sT1Swbhx3hs) {
                if (this.vekpFI4d1Nc4fakF.vekpFI4d1Nc4fakF > 0) {
                    while (this.vekpFI4d1Nc4fakF.vekpFI4d1Nc4fakF > 0) {
                        dDIMxZXP1V8HdM(true);
                    }
                } else if (z) {
                    eruqtn8YZhu6.w9sT1Swbhx3hs.DVTNwpDEVsUKuznof(eruqtn8YZhu6.dDIMxZXP1V8HdM, true, null, 0L);
                }
            }
            synchronized (this.Ee8d2j4S9Vm5yGuR) {
                this.JXn4Qf7zpnLjP5 = true;
            }
            this.Ee8d2j4S9Vm5yGuR.w9sT1Swbhx3hs.flush();
            this.Ee8d2j4S9Vm5yGuR.dDIMxZXP1V8HdM();
        }
    }

    public final void dDIMxZXP1V8HdM(boolean z) {
        long jMin;
        boolean z2;
        Eruqtn8YZhu5 eruqtn8YZhu5 = this.Ee8d2j4S9Vm5yGuR;
        synchronized (eruqtn8YZhu5) {
            eruqtn8YZhu5.gmNWMfvn6zlEj.pyu8ovAipBTLYAiKab();
            while (eruqtn8YZhu5.Ee8d2j4S9Vm5yGuR >= eruqtn8YZhu5.xDyLpEZyrcKVe0 && !this.w9sT1Swbhx3hs && !this.JXn4Qf7zpnLjP5) {
                try {
                    synchronized (eruqtn8YZhu5) {
                        int i = eruqtn8YZhu5.gIIiyi2ddlMDR0;
                        if (i != 0) {
                            break;
                        }
                        try {
                            eruqtn8YZhu5.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    }
                } catch (Throwable th) {
                    eruqtn8YZhu5.gmNWMfvn6zlEj.gmNWMfvn6zlEj();
                    throw th;
                }
            }
            eruqtn8YZhu5.gmNWMfvn6zlEj.gmNWMfvn6zlEj();
            eruqtn8YZhu5.w9sT1Swbhx3hs();
            jMin = Math.min(eruqtn8YZhu5.xDyLpEZyrcKVe0 - eruqtn8YZhu5.Ee8d2j4S9Vm5yGuR, this.vekpFI4d1Nc4fakF.vekpFI4d1Nc4fakF);
            eruqtn8YZhu5.Ee8d2j4S9Vm5yGuR += jMin;
            z2 = z && jMin == this.vekpFI4d1Nc4fakF.vekpFI4d1Nc4fakF;
        }
        this.Ee8d2j4S9Vm5yGuR.gmNWMfvn6zlEj.pyu8ovAipBTLYAiKab();
        try {
            Eruqtn8YZhu5 eruqtn8YZhu6 = this.Ee8d2j4S9Vm5yGuR;
            eruqtn8YZhu6.w9sT1Swbhx3hs.DVTNwpDEVsUKuznof(eruqtn8YZhu6.dDIMxZXP1V8HdM, z2, this.vekpFI4d1Nc4fakF, jMin);
        } finally {
            this.Ee8d2j4S9Vm5yGuR.gmNWMfvn6zlEj.gmNWMfvn6zlEj();
        }
    }

    @Override // v.s.kdnUsNLKSJv552LW2x, java.io.Flushable
    public final void flush() {
        Eruqtn8YZhu5 eruqtn8YZhu5 = this.Ee8d2j4S9Vm5yGuR;
        byte[] bArr = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
        synchronized (eruqtn8YZhu5) {
            eruqtn8YZhu5.w9sT1Swbhx3hs();
        }
        while (this.vekpFI4d1Nc4fakF.vekpFI4d1Nc4fakF > 0) {
            dDIMxZXP1V8HdM(false);
            this.Ee8d2j4S9Vm5yGuR.w9sT1Swbhx3hs.flush();
        }
    }

    @Override // v.s.kdnUsNLKSJv552LW2x
    public final void nQilHWaqS401ZtR(LTdvNeHFqTsIb9 lTdvNeHFqTsIb9, long j) {
        byte[] bArr = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
        LTdvNeHFqTsIb9 lTdvNeHFqTsIb10 = this.vekpFI4d1Nc4fakF;
        lTdvNeHFqTsIb10.nQilHWaqS401ZtR(lTdvNeHFqTsIb9, j);
        while (lTdvNeHFqTsIb10.vekpFI4d1Nc4fakF >= 16384) {
            dDIMxZXP1V8HdM(false);
        }
    }

    @Override // v.s.kdnUsNLKSJv552LW2x
    public final zz3xpWRzprUTdR w9sT1Swbhx3hs() {
        return this.Ee8d2j4S9Vm5yGuR.gmNWMfvn6zlEj;
    }
}
