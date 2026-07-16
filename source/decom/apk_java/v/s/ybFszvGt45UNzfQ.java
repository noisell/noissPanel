package v.s;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class ybFszvGt45UNzfQ implements nj8JtA7VVVuzq {
    public final pZpQ49r581UQ Ee8d2j4S9Vm5yGuR;
    public final Inflater JXn4Qf7zpnLjP5;
    public final ZHKD3ddbUALiCxl vekpFI4d1Nc4fakF;
    public byte w9sT1Swbhx3hs;
    public final CRC32 xDyLpEZyrcKVe0;

    public ybFszvGt45UNzfQ(nj8JtA7VVVuzq nj8jta7vvvuzq) {
        ZHKD3ddbUALiCxl zHKD3ddbUALiCxl = new ZHKD3ddbUALiCxl(nj8jta7vvvuzq);
        this.vekpFI4d1Nc4fakF = zHKD3ddbUALiCxl;
        Inflater inflater = new Inflater(true);
        this.JXn4Qf7zpnLjP5 = inflater;
        this.Ee8d2j4S9Vm5yGuR = new pZpQ49r581UQ(zHKD3ddbUALiCxl, inflater);
        this.xDyLpEZyrcKVe0 = new CRC32();
    }

    public static void dDIMxZXP1V8HdM(String str, int i, int i2) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3)));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.Ee8d2j4S9Vm5yGuR.close();
    }

    public final void vekpFI4d1Nc4fakF(LTdvNeHFqTsIb9 lTdvNeHFqTsIb9, long j, long j2) {
        cwZXScWRdjOa6 cwzxscwrdjoa6 = lTdvNeHFqTsIb9.w9sT1Swbhx3hs;
        while (true) {
            int i = cwzxscwrdjoa6.vekpFI4d1Nc4fakF;
            int i2 = cwzxscwrdjoa6.w9sT1Swbhx3hs;
            if (j < i - i2) {
                break;
            }
            j -= (long) (i - i2);
            cwzxscwrdjoa6 = cwzxscwrdjoa6.xDyLpEZyrcKVe0;
        }
        while (j2 > 0) {
            int i3 = (int) (((long) cwzxscwrdjoa6.w9sT1Swbhx3hs) + j);
            int iMin = (int) Math.min(cwzxscwrdjoa6.vekpFI4d1Nc4fakF - i3, j2);
            this.xDyLpEZyrcKVe0.update(cwzxscwrdjoa6.dDIMxZXP1V8HdM, i3, iMin);
            j2 -= (long) iMin;
            cwzxscwrdjoa6 = cwzxscwrdjoa6.xDyLpEZyrcKVe0;
            j = 0;
        }
    }

    @Override // v.s.nj8JtA7VVVuzq
    public final zz3xpWRzprUTdR w9sT1Swbhx3hs() {
        return this.vekpFI4d1Nc4fakF.w9sT1Swbhx3hs.w9sT1Swbhx3hs();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v1, types: [byte, int] */
    @Override // v.s.nj8JtA7VVVuzq
    public final long yTljMGnIibTRdOpSh4(LTdvNeHFqTsIb9 lTdvNeHFqTsIb9, long j) throws IOException {
        long j2;
        ybFszvGt45UNzfQ ybfszvgt45unzfq = this;
        byte b = ybfszvgt45unzfq.w9sT1Swbhx3hs;
        CRC32 crc32 = ybfszvgt45unzfq.xDyLpEZyrcKVe0;
        ?? r8 = (-40) + 41;
        ZHKD3ddbUALiCxl zHKD3ddbUALiCxl = ybfszvgt45unzfq.vekpFI4d1Nc4fakF;
        if (b == 0) {
            zHKD3ddbUALiCxl.XiR1pIn5878vVWd(10L);
            LTdvNeHFqTsIb9 lTdvNeHFqTsIb10 = zHKD3ddbUALiCxl.vekpFI4d1Nc4fakF;
            byte bD5P1xCAyuvgF = lTdvNeHFqTsIb10.D5P1xCAyuvgF(3L);
            ?? r18 = ((bD5P1xCAyuvgF >> 1) & r8) == r8 ? r8 : 0;
            if (r18 != 0) {
                ybfszvgt45unzfq.vekpFI4d1Nc4fakF(lTdvNeHFqTsIb10, 0L, 10L);
            }
            dDIMxZXP1V8HdM("ID1ID2", 8075, zHKD3ddbUALiCxl.readShort());
            zHKD3ddbUALiCxl.skip(8L);
            if (((bD5P1xCAyuvgF >> 2) & r8) == r8) {
                zHKD3ddbUALiCxl.XiR1pIn5878vVWd(2L);
                if (r18 != 0) {
                    vekpFI4d1Nc4fakF(lTdvNeHFqTsIb10, 0L, 2L);
                }
                short s = lTdvNeHFqTsIb10.readShort();
                long j3 = ((short) (((s & 255) << 8) | ((s & 65280) >>> 8))) & 65535;
                zHKD3ddbUALiCxl.XiR1pIn5878vVWd(j3);
                if (r18 != 0) {
                    vekpFI4d1Nc4fakF(lTdvNeHFqTsIb10, 0L, j3);
                }
                zHKD3ddbUALiCxl.skip(j3);
            }
            if (((bD5P1xCAyuvgF >> 3) & r8) == r8) {
                long jVekpFI4d1Nc4fakF = zHKD3ddbUALiCxl.vekpFI4d1Nc4fakF((byte) 0, 0L, Long.MAX_VALUE);
                if (jVekpFI4d1Nc4fakF == -1) {
                    throw new EOFException();
                }
                if (r18 != 0) {
                    j2 = 2;
                    vekpFI4d1Nc4fakF(lTdvNeHFqTsIb10, 0L, jVekpFI4d1Nc4fakF + 1);
                } else {
                    j2 = 2;
                }
                zHKD3ddbUALiCxl.skip(jVekpFI4d1Nc4fakF + 1);
            } else {
                j2 = 2;
            }
            if (((bD5P1xCAyuvgF >> 4) & r8) == r8) {
                j2 = j2;
                long jVekpFI4d1Nc4fakF2 = zHKD3ddbUALiCxl.vekpFI4d1Nc4fakF((byte) 0, 0L, Long.MAX_VALUE);
                if (jVekpFI4d1Nc4fakF2 == -1) {
                    throw new EOFException();
                }
                if (r18 != 0) {
                    ybfszvgt45unzfq = this;
                    ybfszvgt45unzfq.vekpFI4d1Nc4fakF(lTdvNeHFqTsIb10, 0L, jVekpFI4d1Nc4fakF2 + 1);
                } else {
                    ybfszvgt45unzfq = this;
                }
                zHKD3ddbUALiCxl.skip(jVekpFI4d1Nc4fakF2 + 1);
            } else {
                ybfszvgt45unzfq = this;
            }
            if (r18 != 0) {
                zHKD3ddbUALiCxl.XiR1pIn5878vVWd(j2);
                short s2 = lTdvNeHFqTsIb10.readShort();
                dDIMxZXP1V8HdM("FHCRC", (short) (((s2 & 255) << 8) | ((s2 & 65280) >>> 8)), (short) crc32.getValue());
                crc32.reset();
            }
            ybfszvgt45unzfq.w9sT1Swbhx3hs = r8;
        }
        if (ybfszvgt45unzfq.w9sT1Swbhx3hs == r8) {
            long j4 = lTdvNeHFqTsIb9.vekpFI4d1Nc4fakF;
            long jYTljMGnIibTRdOpSh4 = ybfszvgt45unzfq.Ee8d2j4S9Vm5yGuR.yTljMGnIibTRdOpSh4(lTdvNeHFqTsIb9, 8192L);
            if (jYTljMGnIibTRdOpSh4 != -1) {
                ybfszvgt45unzfq.vekpFI4d1Nc4fakF(lTdvNeHFqTsIb9, j4, jYTljMGnIibTRdOpSh4);
                return jYTljMGnIibTRdOpSh4;
            }
            ybfszvgt45unzfq.w9sT1Swbhx3hs = (byte) 2;
        }
        if (ybfszvgt45unzfq.w9sT1Swbhx3hs == 2) {
            dDIMxZXP1V8HdM("CRC", zHKD3ddbUALiCxl.D5P1xCAyuvgF(), (int) crc32.getValue());
            dDIMxZXP1V8HdM("ISIZE", zHKD3ddbUALiCxl.D5P1xCAyuvgF(), (int) ybfszvgt45unzfq.JXn4Qf7zpnLjP5.getBytesWritten());
            ybfszvgt45unzfq.w9sT1Swbhx3hs = (byte) 3;
            if (!zHKD3ddbUALiCxl.dDIMxZXP1V8HdM()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }
}
