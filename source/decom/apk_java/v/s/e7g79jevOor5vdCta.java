package v.s;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class e7g79jevOor5vdCta extends EIMfBwUZ2Xsf {
    public long Ee8d2j4S9Vm5yGuR;
    public final /* synthetic */ lqtgH1LJNxLx xDyLpEZyrcKVe0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7g79jevOor5vdCta(lqtgH1LJNxLx lqtgh1ljnxlx, long j) {
        super(lqtgh1ljnxlx);
        this.xDyLpEZyrcKVe0 = lqtgh1ljnxlx;
        this.Ee8d2j4S9Vm5yGuR = j;
        if (j == 0) {
            dDIMxZXP1V8HdM();
        }
    }

    private static /* synthetic */ void stenpbg() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zXiR1pIn5878vVWd;
        if (this.vekpFI4d1Nc4fakF) {
            return;
        }
        if (this.Ee8d2j4S9Vm5yGuR != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            try {
                zXiR1pIn5878vVWd = yrMnf4fyLGfIJbMg8IbG.XiR1pIn5878vVWd(this, 100);
            } catch (IOException unused) {
                zXiR1pIn5878vVWd = false;
            }
            if (!zXiR1pIn5878vVWd) {
                ((zfPdbqrCOkdxWPAv) this.xDyLpEZyrcKVe0.vekpFI4d1Nc4fakF).hjneShqpF9Tis4();
                dDIMxZXP1V8HdM();
            }
        }
        this.vekpFI4d1Nc4fakF = true;
    }

    @Override // v.s.EIMfBwUZ2Xsf, v.s.nj8JtA7VVVuzq
    public final long yTljMGnIibTRdOpSh4(LTdvNeHFqTsIb9 lTdvNeHFqTsIb9, long j) throws IOException {
        if (this.vekpFI4d1Nc4fakF) {
            throw new IllegalStateException("closed");
        }
        long j2 = this.Ee8d2j4S9Vm5yGuR;
        if (j2 == 0) {
            return -1L;
        }
        long jYTljMGnIibTRdOpSh4 = super.yTljMGnIibTRdOpSh4(lTdvNeHFqTsIb9, Math.min(j2, 8192L));
        if (jYTljMGnIibTRdOpSh4 == -1) {
            ((zfPdbqrCOkdxWPAv) this.xDyLpEZyrcKVe0.vekpFI4d1Nc4fakF).hjneShqpF9Tis4();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            dDIMxZXP1V8HdM();
            throw protocolException;
        }
        long j3 = this.Ee8d2j4S9Vm5yGuR - jYTljMGnIibTRdOpSh4;
        this.Ee8d2j4S9Vm5yGuR = j3;
        if (j3 == 0) {
            dDIMxZXP1V8HdM();
        }
        return jYTljMGnIibTRdOpSh4;
    }
}
