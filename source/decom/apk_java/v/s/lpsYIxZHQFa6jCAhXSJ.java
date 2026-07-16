package v.s;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class lpsYIxZHQFa6jCAhXSJ implements fwkml16WWLbAl {
    public boolean JXn4Qf7zpnLjP5;
    public final LTdvNeHFqTsIb9 vekpFI4d1Nc4fakF = new LTdvNeHFqTsIb9();
    public final kdnUsNLKSJv552LW2x w9sT1Swbhx3hs;

    public lpsYIxZHQFa6jCAhXSJ(kdnUsNLKSJv552LW2x kdnusnlksjv552lw2x) {
        this.w9sT1Swbhx3hs = kdnusnlksjv552lw2x;
    }

    private static /* synthetic */ void sbghgpjeo() {
    }

    @Override // v.s.fwkml16WWLbAl
    public final fwkml16WWLbAl Ee8d2j4S9Vm5yGuR() {
        if (this.JXn4Qf7zpnLjP5) {
            throw new IllegalStateException("closed");
        }
        LTdvNeHFqTsIb9 lTdvNeHFqTsIb9 = this.vekpFI4d1Nc4fakF;
        long j = lTdvNeHFqTsIb9.vekpFI4d1Nc4fakF;
        if (j > 0) {
            this.w9sT1Swbhx3hs.nQilHWaqS401ZtR(lTdvNeHFqTsIb9, j);
        }
        return this;
    }

    @Override // v.s.fwkml16WWLbAl
    public final fwkml16WWLbAl H9XlUr4OeMJFiXK(String str) {
        if (this.JXn4Qf7zpnLjP5) {
            throw new IllegalStateException("closed");
        }
        this.vekpFI4d1Nc4fakF.k84rwRrqzhrNQ1CdNQ9(str, 0, str.length());
        dDIMxZXP1V8HdM();
        return this;
    }

    @Override // v.s.kdnUsNLKSJv552LW2x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        kdnUsNLKSJv552LW2x kdnusnlksjv552lw2x = this.w9sT1Swbhx3hs;
        if (this.JXn4Qf7zpnLjP5) {
            return;
        }
        LTdvNeHFqTsIb9 lTdvNeHFqTsIb9 = this.vekpFI4d1Nc4fakF;
        long j = lTdvNeHFqTsIb9.vekpFI4d1Nc4fakF;
        if (j > 0) {
            kdnusnlksjv552lw2x.nQilHWaqS401ZtR(lTdvNeHFqTsIb9, j);
        }
        th = null;
        try {
            kdnusnlksjv552lw2x.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.JXn4Qf7zpnLjP5 = true;
        if (th != null) {
            throw th;
        }
    }

    public final fwkml16WWLbAl dDIMxZXP1V8HdM() {
        if (this.JXn4Qf7zpnLjP5) {
            throw new IllegalStateException("closed");
        }
        LTdvNeHFqTsIb9 lTdvNeHFqTsIb9 = this.vekpFI4d1Nc4fakF;
        long j = lTdvNeHFqTsIb9.vekpFI4d1Nc4fakF;
        if (j == 0) {
            j = 0;
        } else {
            cwZXScWRdjOa6 cwzxscwrdjoa6 = lTdvNeHFqTsIb9.w9sT1Swbhx3hs.ibVTtJUNfrGYbW;
            int i = cwzxscwrdjoa6.vekpFI4d1Nc4fakF;
            if (i < 8192 && cwzxscwrdjoa6.Ee8d2j4S9Vm5yGuR) {
                j -= (long) (i - cwzxscwrdjoa6.w9sT1Swbhx3hs);
            }
        }
        if (j > 0) {
            this.w9sT1Swbhx3hs.nQilHWaqS401ZtR(lTdvNeHFqTsIb9, j);
        }
        return this;
    }

    @Override // v.s.fwkml16WWLbAl, v.s.kdnUsNLKSJv552LW2x, java.io.Flushable
    public final void flush() {
        if (this.JXn4Qf7zpnLjP5) {
            throw new IllegalStateException("closed");
        }
        LTdvNeHFqTsIb9 lTdvNeHFqTsIb9 = this.vekpFI4d1Nc4fakF;
        long j = lTdvNeHFqTsIb9.vekpFI4d1Nc4fakF;
        kdnUsNLKSJv552LW2x kdnusnlksjv552lw2x = this.w9sT1Swbhx3hs;
        if (j > 0) {
            kdnusnlksjv552lw2x.nQilHWaqS401ZtR(lTdvNeHFqTsIb9, j);
        }
        kdnusnlksjv552lw2x.flush();
    }

    @Override // v.s.fwkml16WWLbAl
    public final fwkml16WWLbAl gmNWMfvn6zlEj(XslKUngIJyofTLpQ5 xslKUngIJyofTLpQ5) {
        if (this.JXn4Qf7zpnLjP5) {
            throw new IllegalStateException("closed");
        }
        this.vekpFI4d1Nc4fakF.xfn2GJwmGqs7kWW(xslKUngIJyofTLpQ5);
        dDIMxZXP1V8HdM();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.JXn4Qf7zpnLjP5;
    }

    @Override // v.s.kdnUsNLKSJv552LW2x
    public final void nQilHWaqS401ZtR(LTdvNeHFqTsIb9 lTdvNeHFqTsIb9, long j) {
        if (this.JXn4Qf7zpnLjP5) {
            throw new IllegalStateException("closed");
        }
        this.vekpFI4d1Nc4fakF.nQilHWaqS401ZtR(lTdvNeHFqTsIb9, j);
        dDIMxZXP1V8HdM();
    }

    @Override // v.s.fwkml16WWLbAl
    public final LTdvNeHFqTsIb9 pyu8ovAipBTLYAiKab() {
        return this.vekpFI4d1Nc4fakF;
    }

    public final String toString() {
        return "buffer(" + this.w9sT1Swbhx3hs + ')';
    }

    @Override // v.s.kdnUsNLKSJv552LW2x
    public final zz3xpWRzprUTdR w9sT1Swbhx3hs() {
        return this.w9sT1Swbhx3hs.w9sT1Swbhx3hs();
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (this.JXn4Qf7zpnLjP5) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.vekpFI4d1Nc4fakF.write(byteBuffer);
        dDIMxZXP1V8HdM();
        return iWrite;
    }

    @Override // v.s.fwkml16WWLbAl
    public final fwkml16WWLbAl writeByte(int i) {
        if (this.JXn4Qf7zpnLjP5) {
            throw new IllegalStateException("closed");
        }
        this.vekpFI4d1Nc4fakF.ECwLkmPW1UKz7J6E(i);
        dDIMxZXP1V8HdM();
        return this;
    }

    @Override // v.s.fwkml16WWLbAl
    public final fwkml16WWLbAl writeInt(int i) {
        if (this.JXn4Qf7zpnLjP5) {
            throw new IllegalStateException("closed");
        }
        this.vekpFI4d1Nc4fakF.XuO9PPFo607ssKwZjNW(i);
        dDIMxZXP1V8HdM();
        return this;
    }

    @Override // v.s.fwkml16WWLbAl
    public final fwkml16WWLbAl writeShort(int i) {
        if (this.JXn4Qf7zpnLjP5) {
            throw new IllegalStateException("closed");
        }
        this.vekpFI4d1Nc4fakF.hV4VTKNUdeHN(i);
        dDIMxZXP1V8HdM();
        return this;
    }

    @Override // v.s.fwkml16WWLbAl
    public final fwkml16WWLbAl write(byte[] bArr) {
        if (!this.JXn4Qf7zpnLjP5) {
            this.vekpFI4d1Nc4fakF.tne6mXOUFKdd(bArr, bArr.length);
            dDIMxZXP1V8HdM();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
