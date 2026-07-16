package v.s;

import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class Eruqtn8YZhu5 {
    public final hnTADs6OrkjX29sawef D5P1xCAyuvgF;
    public long Ee8d2j4S9Vm5yGuR;
    public long JXn4Qf7zpnLjP5;
    public boolean b1EoSIRjJHO5;
    public final int dDIMxZXP1V8HdM;
    public int gIIiyi2ddlMDR0;
    public final lGJOCtgOpmH2 gmNWMfvn6zlEj;
    public final lGJOCtgOpmH2 hjneShqpF9Tis4;
    public final ArrayDeque ibVTtJUNfrGYbW;
    public final gvlctfzwrJh09D58 pyu8ovAipBTLYAiKab;
    public long vekpFI4d1Nc4fakF;
    public final Ksynl03UBrEMVM80NQ w9sT1Swbhx3hs;
    public IOException wotphlvK9sPbXJ;
    public long xDyLpEZyrcKVe0;

    public Eruqtn8YZhu5(int i, Ksynl03UBrEMVM80NQ ksynl03UBrEMVM80NQ, boolean z, boolean z2, SzicGcOQovJ1JhxwfLo8 szicGcOQovJ1JhxwfLo8) {
        this.dDIMxZXP1V8HdM = i;
        this.w9sT1Swbhx3hs = ksynl03UBrEMVM80NQ;
        this.xDyLpEZyrcKVe0 = ksynl03UBrEMVM80NQ.XiR1pIn5878vVWd.dDIMxZXP1V8HdM();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.ibVTtJUNfrGYbW = arrayDeque;
        this.pyu8ovAipBTLYAiKab = new gvlctfzwrJh09D58(this, ksynl03UBrEMVM80NQ.MLSIo1htfMPWeB8V876L.dDIMxZXP1V8HdM(), z2);
        this.D5P1xCAyuvgF = new hnTADs6OrkjX29sawef(this, z);
        this.hjneShqpF9Tis4 = new lGJOCtgOpmH2(this);
        this.gmNWMfvn6zlEj = new lGJOCtgOpmH2(this);
        if (szicGcOQovJ1JhxwfLo8 == null) {
            if (!xDyLpEZyrcKVe0()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (xDyLpEZyrcKVe0()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(szicGcOQovJ1JhxwfLo8);
        }
    }

    private static /* synthetic */ void nxoixsm() {
    }

    public final void Ee8d2j4S9Vm5yGuR(int i) {
        if (JXn4Qf7zpnLjP5(i, null)) {
            this.w9sT1Swbhx3hs.EWUjsTERgdPbSw3NNlN(this.dDIMxZXP1V8HdM, i);
        }
    }

    public final boolean JXn4Qf7zpnLjP5(int i, IOException iOException) {
        byte[] bArr = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
        synchronized (this) {
            if (this.gIIiyi2ddlMDR0 != 0) {
                return false;
            }
            this.gIIiyi2ddlMDR0 = i;
            this.wotphlvK9sPbXJ = iOException;
            notifyAll();
            if (this.pyu8ovAipBTLYAiKab.vekpFI4d1Nc4fakF && this.D5P1xCAyuvgF.w9sT1Swbhx3hs) {
                return false;
            }
            this.w9sT1Swbhx3hs.D5P1xCAyuvgF(this.dDIMxZXP1V8HdM);
            return true;
        }
    }

    public final void b1EoSIRjJHO5(SzicGcOQovJ1JhxwfLo8 szicGcOQovJ1JhxwfLo8, boolean z) {
        boolean zIbVTtJUNfrGYbW;
        byte[] bArr = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
        synchronized (this) {
            try {
                if (this.b1EoSIRjJHO5 && z) {
                    this.pyu8ovAipBTLYAiKab.getClass();
                } else {
                    this.b1EoSIRjJHO5 = true;
                    this.ibVTtJUNfrGYbW.add(szicGcOQovJ1JhxwfLo8);
                }
                if (z) {
                    this.pyu8ovAipBTLYAiKab.vekpFI4d1Nc4fakF = true;
                }
                zIbVTtJUNfrGYbW = ibVTtJUNfrGYbW();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zIbVTtJUNfrGYbW) {
            return;
        }
        this.w9sT1Swbhx3hs.D5P1xCAyuvgF(this.dDIMxZXP1V8HdM);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0022  */
    public final void dDIMxZXP1V8HdM() {
        boolean z;
        boolean zIbVTtJUNfrGYbW;
        byte[] bArr = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
        synchronized (this) {
            try {
                gvlctfzwrJh09D58 gvlctfzwrjh09d58 = this.pyu8ovAipBTLYAiKab;
                if (gvlctfzwrjh09d58.vekpFI4d1Nc4fakF || !gvlctfzwrjh09d58.xDyLpEZyrcKVe0) {
                    z = false;
                } else {
                    hnTADs6OrkjX29sawef hntads6orkjx29sawef = this.D5P1xCAyuvgF;
                    if (hntads6orkjx29sawef.w9sT1Swbhx3hs || hntads6orkjx29sawef.JXn4Qf7zpnLjP5) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                zIbVTtJUNfrGYbW = ibVTtJUNfrGYbW();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            vekpFI4d1Nc4fakF(18 - 9, null);
        } else {
            if (zIbVTtJUNfrGYbW) {
                return;
            }
            this.w9sT1Swbhx3hs.D5P1xCAyuvgF(this.dDIMxZXP1V8HdM);
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [boolean, int] */
    public final synchronized boolean ibVTtJUNfrGYbW() {
        try {
            if (this.gIIiyi2ddlMDR0 != 0) {
                return false;
            }
            gvlctfzwrJh09D58 gvlctfzwrjh09d58 = this.pyu8ovAipBTLYAiKab;
            if (gvlctfzwrjh09d58.vekpFI4d1Nc4fakF || gvlctfzwrjh09d58.xDyLpEZyrcKVe0) {
                hnTADs6OrkjX29sawef hntads6orkjx29sawef = this.D5P1xCAyuvgF;
                if ((hntads6orkjx29sawef.w9sT1Swbhx3hs || hntads6orkjx29sawef.JXn4Qf7zpnLjP5) && this.b1EoSIRjJHO5) {
                    return false;
                }
            }
            return (-14) + 15;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void vekpFI4d1Nc4fakF(int i, IOException iOException) {
        if (JXn4Qf7zpnLjP5(i, iOException)) {
            this.w9sT1Swbhx3hs.EWUjsTERgdPbSw3NNlN.EWUjsTERgdPbSw3NNlN(this.dDIMxZXP1V8HdM, i);
        }
    }

    public final void w9sT1Swbhx3hs() throws IOException {
        hnTADs6OrkjX29sawef hntads6orkjx29sawef = this.D5P1xCAyuvgF;
        if (hntads6orkjx29sawef.JXn4Qf7zpnLjP5) {
            throw new IOException("stream closed");
        }
        if (hntads6orkjx29sawef.w9sT1Swbhx3hs) {
            throw new IOException("stream finished");
        }
        if (this.gIIiyi2ddlMDR0 != 0) {
            IOException iOException = this.wotphlvK9sPbXJ;
            if (iOException == null) {
                throw new qdSbSo4AtinS0kmNwf(this.gIIiyi2ddlMDR0);
            }
        }
    }

    public final boolean xDyLpEZyrcKVe0() {
        boolean z = (this.dDIMxZXP1V8HdM & 1) == 1;
        this.w9sT1Swbhx3hs.getClass();
        return true == z;
    }
}
