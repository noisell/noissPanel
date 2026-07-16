package v.s;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class xVlakCYGEYJ0 implements nj8JtA7VVVuzq {
    public boolean Ee8d2j4S9Vm5yGuR = true;
    public long JXn4Qf7zpnLjP5;
    public final /* synthetic */ D9RooUzwy6gf47M9NDX b1EoSIRjJHO5;
    public boolean ibVTtJUNfrGYbW;
    public final long vekpFI4d1Nc4fakF;
    public final nj8JtA7VVVuzq w9sT1Swbhx3hs;
    public boolean xDyLpEZyrcKVe0;

    public xVlakCYGEYJ0(D9RooUzwy6gf47M9NDX d9RooUzwy6gf47M9NDX, nj8JtA7VVVuzq nj8jta7vvvuzq, long j) {
        this.b1EoSIRjJHO5 = d9RooUzwy6gf47M9NDX;
        this.w9sT1Swbhx3hs = nj8jta7vvvuzq;
        this.vekpFI4d1Nc4fakF = j;
        if (j == 0) {
            vekpFI4d1Nc4fakF(null);
        }
    }

    private static /* synthetic */ void hxdioknq() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.ibVTtJUNfrGYbW) {
            return;
        }
        this.ibVTtJUNfrGYbW = true;
        try {
            dDIMxZXP1V8HdM();
            vekpFI4d1Nc4fakF(null);
        } catch (IOException e) {
            throw vekpFI4d1Nc4fakF(e);
        }
    }

    public final void dDIMxZXP1V8HdM() throws IOException {
        this.w9sT1Swbhx3hs.close();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [char, int] */
    public final String toString() {
        return xVlakCYGEYJ0.class.getSimpleName() + '(' + this.w9sT1Swbhx3hs + ((char) (40 + 1));
    }

    public final IOException vekpFI4d1Nc4fakF(IOException iOException) {
        if (this.xDyLpEZyrcKVe0) {
            return iOException;
        }
        this.xDyLpEZyrcKVe0 = true;
        if (iOException == null && this.Ee8d2j4S9Vm5yGuR) {
            this.Ee8d2j4S9Vm5yGuR = false;
        }
        return this.b1EoSIRjJHO5.dDIMxZXP1V8HdM(true, false, iOException);
    }

    @Override // v.s.nj8JtA7VVVuzq
    public final zz3xpWRzprUTdR w9sT1Swbhx3hs() {
        return this.w9sT1Swbhx3hs.w9sT1Swbhx3hs();
    }

    @Override // v.s.nj8JtA7VVVuzq
    public final long yTljMGnIibTRdOpSh4(LTdvNeHFqTsIb9 lTdvNeHFqTsIb9, long j) throws IOException {
        if (this.ibVTtJUNfrGYbW) {
            throw new IllegalStateException("closed");
        }
        try {
            long jYTljMGnIibTRdOpSh4 = this.w9sT1Swbhx3hs.yTljMGnIibTRdOpSh4(lTdvNeHFqTsIb9, 8192L);
            if (this.Ee8d2j4S9Vm5yGuR) {
                this.Ee8d2j4S9Vm5yGuR = false;
            }
            if (jYTljMGnIibTRdOpSh4 == -1) {
                vekpFI4d1Nc4fakF(null);
                return -1L;
            }
            long j2 = this.JXn4Qf7zpnLjP5 + jYTljMGnIibTRdOpSh4;
            long j3 = this.vekpFI4d1Nc4fakF;
            if (j3 == -1 || j2 <= j3) {
                this.JXn4Qf7zpnLjP5 = j2;
                if (j2 == j3) {
                    vekpFI4d1Nc4fakF(null);
                }
                return jYTljMGnIibTRdOpSh4;
            }
            throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
        } catch (IOException e) {
            throw vekpFI4d1Nc4fakF(e);
        }
    }
}
