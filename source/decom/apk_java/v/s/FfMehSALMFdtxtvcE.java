package v.s;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class FfMehSALMFdtxtvcE implements nj8JtA7VVVuzq {
    public int Ee8d2j4S9Vm5yGuR;
    public int JXn4Qf7zpnLjP5;
    public int ibVTtJUNfrGYbW;
    public int vekpFI4d1Nc4fakF;
    public final enW4UFmBttog4rg5RB w9sT1Swbhx3hs;
    public int xDyLpEZyrcKVe0;

    public FfMehSALMFdtxtvcE(enW4UFmBttog4rg5RB enw4ufmbttog4rg5rb) {
        this.w9sT1Swbhx3hs = enw4ufmbttog4rg5rb;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // v.s.nj8JtA7VVVuzq
    public final zz3xpWRzprUTdR w9sT1Swbhx3hs() {
        return this.w9sT1Swbhx3hs.w9sT1Swbhx3hs();
    }

    @Override // v.s.nj8JtA7VVVuzq
    public final long yTljMGnIibTRdOpSh4(LTdvNeHFqTsIb9 lTdvNeHFqTsIb9, long j) throws IOException {
        int i;
        int i2;
        do {
            int i3 = this.xDyLpEZyrcKVe0;
            enW4UFmBttog4rg5RB enw4ufmbttog4rg5rb = this.w9sT1Swbhx3hs;
            if (i3 == 0) {
                enw4ufmbttog4rg5rb.skip(this.ibVTtJUNfrGYbW);
                this.ibVTtJUNfrGYbW = 0;
                if ((this.JXn4Qf7zpnLjP5 & 4) == 0) {
                    i = this.Ee8d2j4S9Vm5yGuR;
                    int iMLSIo1htfMPWeB8V876L = yrMnf4fyLGfIJbMg8IbG.MLSIo1htfMPWeB8V876L(enw4ufmbttog4rg5rb);
                    this.xDyLpEZyrcKVe0 = iMLSIo1htfMPWeB8V876L;
                    this.vekpFI4d1Nc4fakF = iMLSIo1htfMPWeB8V876L;
                    int i4 = enw4ufmbttog4rg5rb.readByte() & 255;
                    this.JXn4Qf7zpnLjP5 = enw4ufmbttog4rg5rb.readByte() & 255;
                    Logger logger = lx5X2Hj7IE9zEOsO65.Ee8d2j4S9Vm5yGuR;
                    if (logger.isLoggable(Level.FINE)) {
                        XslKUngIJyofTLpQ5 xslKUngIJyofTLpQ5 = yg3wKheju8eW4e6qsE.dDIMxZXP1V8HdM;
                        logger.fine(yg3wKheju8eW4e6qsE.dDIMxZXP1V8HdM(true, this.Ee8d2j4S9Vm5yGuR, this.vekpFI4d1Nc4fakF, i4, this.JXn4Qf7zpnLjP5));
                    }
                    i2 = enw4ufmbttog4rg5rb.readInt() & Integer.MAX_VALUE;
                    this.Ee8d2j4S9Vm5yGuR = i2;
                    if (i4 != 9) {
                        throw new IOException(i4 + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long jYTljMGnIibTRdOpSh4 = enw4ufmbttog4rg5rb.yTljMGnIibTRdOpSh4(lTdvNeHFqTsIb9, Math.min(8192L, i3));
                if (jYTljMGnIibTRdOpSh4 != -1) {
                    this.xDyLpEZyrcKVe0 -= (int) jYTljMGnIibTRdOpSh4;
                    return jYTljMGnIibTRdOpSh4;
                }
            }
            return -1L;
        } while (i2 == i);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }
}
