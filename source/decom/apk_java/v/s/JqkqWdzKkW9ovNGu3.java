package v.s;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class JqkqWdzKkW9ovNGu3 extends EIMfBwUZ2Xsf {
    public final xc6AKez33c65zO Ee8d2j4S9Vm5yGuR;
    public final /* synthetic */ lqtgH1LJNxLx b1EoSIRjJHO5;
    public boolean ibVTtJUNfrGYbW;
    public long xDyLpEZyrcKVe0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JqkqWdzKkW9ovNGu3(lqtgH1LJNxLx lqtgh1ljnxlx, xc6AKez33c65zO xc6akez33c65zo) {
        super(lqtgh1ljnxlx);
        this.b1EoSIRjJHO5 = lqtgh1ljnxlx;
        this.Ee8d2j4S9Vm5yGuR = xc6akez33c65zo;
        this.xDyLpEZyrcKVe0 = -1L;
        this.ibVTtJUNfrGYbW = true;
    }

    private static /* synthetic */ void iochlpol() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zXiR1pIn5878vVWd;
        if (this.vekpFI4d1Nc4fakF) {
            return;
        }
        if (this.ibVTtJUNfrGYbW) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            try {
                zXiR1pIn5878vVWd = yrMnf4fyLGfIJbMg8IbG.XiR1pIn5878vVWd(this, 100);
            } catch (IOException unused) {
                zXiR1pIn5878vVWd = false;
            }
            if (!zXiR1pIn5878vVWd) {
                ((zfPdbqrCOkdxWPAv) this.b1EoSIRjJHO5.vekpFI4d1Nc4fakF).hjneShqpF9Tis4();
                dDIMxZXP1V8HdM();
            }
        }
        this.vekpFI4d1Nc4fakF = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0079, code lost:
    
        if (r7.ibVTtJUNfrGYbW == false) goto L28;
     */
    @Override // v.s.EIMfBwUZ2Xsf, v.s.nj8JtA7VVVuzq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long yTljMGnIibTRdOpSh4(LTdvNeHFqTsIb9 lTdvNeHFqTsIb9, long j) throws IOException {
        lqtgH1LJNxLx lqtgh1ljnxlx = this.b1EoSIRjJHO5;
        enW4UFmBttog4rg5RB enw4ufmbttog4rg5rb = (enW4UFmBttog4rg5RB) lqtgh1ljnxlx.JXn4Qf7zpnLjP5;
        if (this.vekpFI4d1Nc4fakF) {
            throw new IllegalStateException("closed");
        }
        if (this.ibVTtJUNfrGYbW) {
            long j2 = this.xDyLpEZyrcKVe0;
            if (j2 == 0 || j2 == -1) {
                if (j2 != -1) {
                    enw4ufmbttog4rg5rb.ibVTtJUNfrGYbW();
                }
                try {
                    this.xDyLpEZyrcKVe0 = enw4ufmbttog4rg5rb.K7eEOBPYP9VIoHWTe();
                    String string = KgSM0TsKUpCiuePB.uW0IRoPBZMj2QmBkkp(enw4ufmbttog4rg5rb.ibVTtJUNfrGYbW()).toString();
                    if (this.xDyLpEZyrcKVe0 < 0 || (string.length() > 0 && !string.startsWith(";"))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.xDyLpEZyrcKVe0 + string + '\"');
                    }
                    if (this.xDyLpEZyrcKVe0 == 0) {
                        this.ibVTtJUNfrGYbW = false;
                        Bsr8WAhbbWJl.w9sT1Swbhx3hs(((sp6apkX00TawY02qGY6r) lqtgh1ljnxlx.w9sT1Swbhx3hs).hjneShqpF9Tis4, this.Ee8d2j4S9Vm5yGuR, ((VkZdYZ8plDAnnSJM) lqtgh1ljnxlx.xDyLpEZyrcKVe0).dDIMxZXP1V8HdM());
                        dDIMxZXP1V8HdM();
                    }
                } catch (NumberFormatException e) {
                    throw new ProtocolException(e.getMessage());
                }
            }
            long jYTljMGnIibTRdOpSh4 = super.yTljMGnIibTRdOpSh4(lTdvNeHFqTsIb9, Math.min(8192L, this.xDyLpEZyrcKVe0));
            if (jYTljMGnIibTRdOpSh4 != -1) {
                this.xDyLpEZyrcKVe0 -= jYTljMGnIibTRdOpSh4;
                return jYTljMGnIibTRdOpSh4;
            }
            ((zfPdbqrCOkdxWPAv) lqtgh1ljnxlx.vekpFI4d1Nc4fakF).hjneShqpF9Tis4();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            dDIMxZXP1V8HdM();
            throw protocolException;
        }
        return -1L;
    }
}
