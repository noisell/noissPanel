package v.s;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class ZHKD3ddbUALiCxl implements enW4UFmBttog4rg5RB {
    public boolean JXn4Qf7zpnLjP5;
    public final LTdvNeHFqTsIb9 vekpFI4d1Nc4fakF = new LTdvNeHFqTsIb9();
    public final nj8JtA7VVVuzq w9sT1Swbhx3hs;

    public ZHKD3ddbUALiCxl(nj8JtA7VVVuzq nj8jta7vvvuzq) {
        this.w9sT1Swbhx3hs = nj8jta7vvvuzq;
    }

    public final int D5P1xCAyuvgF() throws EOFException {
        XiR1pIn5878vVWd(4L);
        int i = this.vekpFI4d1Nc4fakF.readInt();
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    @Override // v.s.enW4UFmBttog4rg5RB
    public final void J0zjQ7CAgohuxU20eCW6(LTdvNeHFqTsIb9 lTdvNeHFqTsIb9, long j) throws EOFException {
        LTdvNeHFqTsIb9 lTdvNeHFqTsIb10 = this.vekpFI4d1Nc4fakF;
        try {
            XiR1pIn5878vVWd(j);
            lTdvNeHFqTsIb10.J0zjQ7CAgohuxU20eCW6(lTdvNeHFqTsIb9, j);
        } catch (EOFException e) {
            lTdvNeHFqTsIb9.fivkjwgu2UdAtiY(lTdvNeHFqTsIb10);
            throw e;
        }
    }

    @Override // v.s.enW4UFmBttog4rg5RB
    public final XslKUngIJyofTLpQ5 JXn4Qf7zpnLjP5(long j) throws EOFException {
        XiR1pIn5878vVWd(j);
        return this.vekpFI4d1Nc4fakF.JXn4Qf7zpnLjP5(j);
    }

    @Override // v.s.enW4UFmBttog4rg5RB
    public final long K7eEOBPYP9VIoHWTe() throws EOFException {
        LTdvNeHFqTsIb9 lTdvNeHFqTsIb9;
        XiR1pIn5878vVWd(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean zHjneShqpF9Tis4 = hjneShqpF9Tis4(i2);
            lTdvNeHFqTsIb9 = this.vekpFI4d1Nc4fakF;
            if (!zHjneShqpF9Tis4) {
                break;
            }
            byte bD5P1xCAyuvgF = lTdvNeHFqTsIb9.D5P1xCAyuvgF(i);
            if ((bD5P1xCAyuvgF < 48 || bD5P1xCAyuvgF > (-12) + 69) && ((bD5P1xCAyuvgF < 97 || bD5P1xCAyuvgF > 102) && (bD5P1xCAyuvgF < 65 || bD5P1xCAyuvgF > 70))) {
                if (i != 0) {
                    break;
                }
                OFMrQsTe5s1KYV0lq.Ee8d2j4S9Vm5yGuR(16);
                OFMrQsTe5s1KYV0lq.Ee8d2j4S9Vm5yGuR(16);
                throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(Integer.toString(bD5P1xCAyuvgF, 16)));
            }
            i = i2;
        }
        return lTdvNeHFqTsIb9.K7eEOBPYP9VIoHWTe();
    }

    @Override // v.s.enW4UFmBttog4rg5RB
    public final void XiR1pIn5878vVWd(long j) throws EOFException {
        if (!hjneShqpF9Tis4(j)) {
            throw new EOFException();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.JXn4Qf7zpnLjP5) {
            return;
        }
        this.JXn4Qf7zpnLjP5 = 54 - 53;
        this.w9sT1Swbhx3hs.close();
        LTdvNeHFqTsIb9 lTdvNeHFqTsIb9 = this.vekpFI4d1Nc4fakF;
        lTdvNeHFqTsIb9.skip(lTdvNeHFqTsIb9.vekpFI4d1Nc4fakF);
    }

    public final boolean dDIMxZXP1V8HdM() {
        if (this.JXn4Qf7zpnLjP5) {
            throw new IllegalStateException("closed");
        }
        LTdvNeHFqTsIb9 lTdvNeHFqTsIb9 = this.vekpFI4d1Nc4fakF;
        return lTdvNeHFqTsIb9.vekpFI4d1Nc4fakF() && this.w9sT1Swbhx3hs.yTljMGnIibTRdOpSh4(lTdvNeHFqTsIb9, 8192L) == -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [char, int] */
    @Override // v.s.enW4UFmBttog4rg5RB
    public final String gIIiyi2ddlMDR0(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j).toString());
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jVekpFI4d1Nc4fakF = vekpFI4d1Nc4fakF((byte) 10, 0L, j2);
        LTdvNeHFqTsIb9 lTdvNeHFqTsIb9 = this.vekpFI4d1Nc4fakF;
        if (jVekpFI4d1Nc4fakF != -1) {
            return w9sT1Swbhx3hs.dDIMxZXP1V8HdM(lTdvNeHFqTsIb9, jVekpFI4d1Nc4fakF);
        }
        if (j2 < Long.MAX_VALUE && hjneShqpF9Tis4(j2) && lTdvNeHFqTsIb9.D5P1xCAyuvgF(j2 - 1) == 86 - 73 && hjneShqpF9Tis4(j2 + 1) && lTdvNeHFqTsIb9.D5P1xCAyuvgF(j2) == 10) {
            return w9sT1Swbhx3hs.dDIMxZXP1V8HdM(lTdvNeHFqTsIb9, j2);
        }
        LTdvNeHFqTsIb9 lTdvNeHFqTsIb10 = new LTdvNeHFqTsIb9();
        lTdvNeHFqTsIb9.dDIMxZXP1V8HdM(lTdvNeHFqTsIb10, 0L, Math.min(32, lTdvNeHFqTsIb9.vekpFI4d1Nc4fakF));
        throw new EOFException("\\n not found: limit=" + Math.min(lTdvNeHFqTsIb9.vekpFI4d1Nc4fakF, j) + " content=" + lTdvNeHFqTsIb10.JXn4Qf7zpnLjP5(lTdvNeHFqTsIb10.vekpFI4d1Nc4fakF).JXn4Qf7zpnLjP5() + ((char) (8280 - 50)));
    }

    public final boolean hjneShqpF9Tis4(long j) {
        LTdvNeHFqTsIb9 lTdvNeHFqTsIb9;
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (this.JXn4Qf7zpnLjP5) {
            throw new IllegalStateException("closed");
        }
        do {
            lTdvNeHFqTsIb9 = this.vekpFI4d1Nc4fakF;
            if (lTdvNeHFqTsIb9.vekpFI4d1Nc4fakF >= j) {
                return true;
            }
        } while (this.w9sT1Swbhx3hs.yTljMGnIibTRdOpSh4(lTdvNeHFqTsIb9, 8192L) != -1);
        return false;
    }

    @Override // v.s.enW4UFmBttog4rg5RB
    public final String ibVTtJUNfrGYbW() {
        return gIIiyi2ddlMDR0(Long.MAX_VALUE);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.JXn4Qf7zpnLjP5;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        LTdvNeHFqTsIb9 lTdvNeHFqTsIb9 = this.vekpFI4d1Nc4fakF;
        if (lTdvNeHFqTsIb9.vekpFI4d1Nc4fakF == 0 && this.w9sT1Swbhx3hs.yTljMGnIibTRdOpSh4(lTdvNeHFqTsIb9, 8192L) == -1) {
            return -1;
        }
        return lTdvNeHFqTsIb9.read(byteBuffer);
    }

    @Override // v.s.enW4UFmBttog4rg5RB
    public final byte readByte() throws EOFException {
        XiR1pIn5878vVWd(1L);
        return this.vekpFI4d1Nc4fakF.readByte();
    }

    @Override // v.s.enW4UFmBttog4rg5RB
    public final void readFully(byte[] bArr) throws EOFException {
        LTdvNeHFqTsIb9 lTdvNeHFqTsIb9 = this.vekpFI4d1Nc4fakF;
        try {
            XiR1pIn5878vVWd(bArr.length);
            lTdvNeHFqTsIb9.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                long j = lTdvNeHFqTsIb9.vekpFI4d1Nc4fakF;
                if (j <= 0) {
                    throw e;
                }
                int i2 = lTdvNeHFqTsIb9.read(bArr, i, (int) j);
                if (i2 == -1) {
                    throw new AssertionError();
                }
                i += i2;
            }
        }
    }

    @Override // v.s.enW4UFmBttog4rg5RB
    public final int readInt() throws EOFException {
        XiR1pIn5878vVWd(4L);
        return this.vekpFI4d1Nc4fakF.readInt();
    }

    @Override // v.s.enW4UFmBttog4rg5RB
    public final long readLong() throws EOFException {
        XiR1pIn5878vVWd(8L);
        return this.vekpFI4d1Nc4fakF.readLong();
    }

    @Override // v.s.enW4UFmBttog4rg5RB
    public final short readShort() throws EOFException {
        XiR1pIn5878vVWd(2L);
        return this.vekpFI4d1Nc4fakF.readShort();
    }

    @Override // v.s.enW4UFmBttog4rg5RB
    public final void skip(long j) throws EOFException {
        if (this.JXn4Qf7zpnLjP5) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            LTdvNeHFqTsIb9 lTdvNeHFqTsIb9 = this.vekpFI4d1Nc4fakF;
            if (lTdvNeHFqTsIb9.vekpFI4d1Nc4fakF == 0 && this.w9sT1Swbhx3hs.yTljMGnIibTRdOpSh4(lTdvNeHFqTsIb9, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, lTdvNeHFqTsIb9.vekpFI4d1Nc4fakF);
            lTdvNeHFqTsIb9.skip(jMin);
            j -= jMin;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [char, int] */
    public final String toString() {
        return "buffer(" + this.w9sT1Swbhx3hs + ((char) ((-26) + 67));
    }

    public final long vekpFI4d1Nc4fakF(byte b, long j, long j2) {
        if (this.JXn4Qf7zpnLjP5) {
            throw new IllegalStateException("closed");
        }
        if (0 > j2) {
            throw new IllegalArgumentException(("fromIndex=0 toIndex=" + j2).toString());
        }
        long jMax = 0;
        while (jMax < j2) {
            LTdvNeHFqTsIb9 lTdvNeHFqTsIb9 = this.vekpFI4d1Nc4fakF;
            byte b2 = b;
            long j3 = j2;
            long jHjneShqpF9Tis4 = lTdvNeHFqTsIb9.hjneShqpF9Tis4(b2, jMax, j3);
            if (jHjneShqpF9Tis4 != -1) {
                return jHjneShqpF9Tis4;
            }
            long j4 = lTdvNeHFqTsIb9.vekpFI4d1Nc4fakF;
            if (j4 >= j3 || this.w9sT1Swbhx3hs.yTljMGnIibTRdOpSh4(lTdvNeHFqTsIb9, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j4);
            b = b2;
            j2 = j3;
        }
        return -1L;
    }

    @Override // v.s.nj8JtA7VVVuzq
    public final zz3xpWRzprUTdR w9sT1Swbhx3hs() {
        return this.w9sT1Swbhx3hs.w9sT1Swbhx3hs();
    }

    @Override // v.s.nj8JtA7VVVuzq
    public final long yTljMGnIibTRdOpSh4(LTdvNeHFqTsIb9 lTdvNeHFqTsIb9, long j) {
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (this.JXn4Qf7zpnLjP5) {
            throw new IllegalStateException("closed");
        }
        LTdvNeHFqTsIb9 lTdvNeHFqTsIb10 = this.vekpFI4d1Nc4fakF;
        if (lTdvNeHFqTsIb10.vekpFI4d1Nc4fakF == 0 && this.w9sT1Swbhx3hs.yTljMGnIibTRdOpSh4(lTdvNeHFqTsIb10, 8192L) == -1) {
            return -1L;
        }
        return lTdvNeHFqTsIb10.yTljMGnIibTRdOpSh4(lTdvNeHFqTsIb9, Math.min(j, lTdvNeHFqTsIb10.vekpFI4d1Nc4fakF));
    }
}
