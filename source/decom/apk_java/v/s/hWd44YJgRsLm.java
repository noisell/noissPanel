package v.s;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class hWd44YJgRsLm extends EIMfBwUZ2Xsf {
    public boolean Ee8d2j4S9Vm5yGuR;

    private static /* synthetic */ void fuxkib() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.vekpFI4d1Nc4fakF) {
            return;
        }
        if (!this.Ee8d2j4S9Vm5yGuR) {
            dDIMxZXP1V8HdM();
        }
        this.vekpFI4d1Nc4fakF = true;
    }

    @Override // v.s.EIMfBwUZ2Xsf, v.s.nj8JtA7VVVuzq
    public final long yTljMGnIibTRdOpSh4(LTdvNeHFqTsIb9 lTdvNeHFqTsIb9, long j) throws IOException {
        if (this.vekpFI4d1Nc4fakF) {
            throw new IllegalStateException("closed");
        }
        if (this.Ee8d2j4S9Vm5yGuR) {
            return -1L;
        }
        long jYTljMGnIibTRdOpSh4 = super.yTljMGnIibTRdOpSh4(lTdvNeHFqTsIb9, 8192L);
        if (jYTljMGnIibTRdOpSh4 != -1) {
            return jYTljMGnIibTRdOpSh4;
        }
        this.Ee8d2j4S9Vm5yGuR = true;
        dDIMxZXP1V8HdM();
        return -1L;
    }
}
