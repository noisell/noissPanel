package v.s;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class opWpJwGfRP1bT1 implements Closeable {
    public static final Logger ibVTtJUNfrGYbW = Logger.getLogger(yg3wKheju8eW4e6qsE.class.getName());
    public boolean Ee8d2j4S9Vm5yGuR;
    public int JXn4Qf7zpnLjP5;
    public final LTdvNeHFqTsIb9 vekpFI4d1Nc4fakF;
    public final fwkml16WWLbAl w9sT1Swbhx3hs;
    public final IUoLUUMj5JfAg xDyLpEZyrcKVe0;

    public opWpJwGfRP1bT1(fwkml16WWLbAl fwkml16wwlbal) {
        this.w9sT1Swbhx3hs = fwkml16wwlbal;
        LTdvNeHFqTsIb9 lTdvNeHFqTsIb9 = new LTdvNeHFqTsIb9();
        this.vekpFI4d1Nc4fakF = lTdvNeHFqTsIb9;
        this.JXn4Qf7zpnLjP5 = 16384;
        this.xDyLpEZyrcKVe0 = new IUoLUUMj5JfAg(lTdvNeHFqTsIb9);
    }

    private static /* synthetic */ void xlhlow() {
    }

    public final void D5P1xCAyuvgF(int i, int i2, int i3, int i4) {
        Level level = Level.FINE;
        Logger logger = ibVTtJUNfrGYbW;
        if (logger.isLoggable(level)) {
            logger.fine(yg3wKheju8eW4e6qsE.dDIMxZXP1V8HdM(false, i, i2, i3, i4));
        }
        if (i2 > this.JXn4Qf7zpnLjP5) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.JXn4Qf7zpnLjP5 + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw new IllegalArgumentException(Y9mRyRdkl5FOcwb66V6.xDyLpEZyrcKVe0("reserved bit set: ", i).toString());
        }
        byte[] bArr = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
        fwkml16WWLbAl fwkml16wwlbal = this.w9sT1Swbhx3hs;
        fwkml16wwlbal.writeByte((i2 >>> 16) & 255);
        fwkml16wwlbal.writeByte((i2 >>> 8) & 255);
        fwkml16wwlbal.writeByte(i2 & 255);
        fwkml16wwlbal.writeByte(i3 & 255);
        fwkml16wwlbal.writeByte(i4 & 255);
        fwkml16wwlbal.writeInt(i & Integer.MAX_VALUE);
    }

    public final synchronized void DVTNwpDEVsUKuznof(boolean z, int i, int i2) {
        if (this.Ee8d2j4S9Vm5yGuR) {
            throw new IOException("closed");
        }
        D5P1xCAyuvgF(0, 8, 6, z ? 1 : 0);
        this.w9sT1Swbhx3hs.writeInt(i);
        this.w9sT1Swbhx3hs.writeInt(i2);
        this.w9sT1Swbhx3hs.flush();
    }

    public final synchronized void EWUjsTERgdPbSw3NNlN(int i, int i2) {
        if (this.Ee8d2j4S9Vm5yGuR) {
            throw new IOException("closed");
        }
        if (Y9mRyRdkl5FOcwb66V6.J0zjQ7CAgohuxU20eCW6(i2) == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        D5P1xCAyuvgF(i, 4, 3, 0);
        this.w9sT1Swbhx3hs.writeInt(Y9mRyRdkl5FOcwb66V6.J0zjQ7CAgohuxU20eCW6(i2));
        this.w9sT1Swbhx3hs.flush();
    }

    public final synchronized void Qrz92kRPw4GcghAc(boolean z, int i, ArrayList arrayList) {
        if (this.Ee8d2j4S9Vm5yGuR) {
            throw new IOException("closed");
        }
        this.xDyLpEZyrcKVe0.JXn4Qf7zpnLjP5(arrayList);
        long j = this.vekpFI4d1Nc4fakF.vekpFI4d1Nc4fakF;
        long jMin = Math.min(this.JXn4Qf7zpnLjP5, j);
        int i2 = j == jMin ? 4 : 0;
        if (z) {
            i2 |= 1;
        }
        D5P1xCAyuvgF(i, (int) jMin, 1, i2);
        this.w9sT1Swbhx3hs.nQilHWaqS401ZtR(this.vekpFI4d1Nc4fakF, jMin);
        if (j > jMin) {
            long j2 = j - jMin;
            while (j2 > 0) {
                long jMin2 = Math.min(this.JXn4Qf7zpnLjP5, j2);
                j2 -= jMin2;
                D5P1xCAyuvgF(i, (int) jMin2, 9, j2 == 0 ? 4 : 0);
                this.w9sT1Swbhx3hs.nQilHWaqS401ZtR(this.vekpFI4d1Nc4fakF, jMin2);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.Ee8d2j4S9Vm5yGuR = true;
        this.w9sT1Swbhx3hs.close();
    }

    public final synchronized void dDIMxZXP1V8HdM(WCObt0AknnroPeo3Y2G0 wCObt0AknnroPeo3Y2G0) {
        try {
            if (this.Ee8d2j4S9Vm5yGuR) {
                throw new IOException("closed");
            }
            int i = this.JXn4Qf7zpnLjP5;
            int i2 = wCObt0AknnroPeo3Y2G0.dDIMxZXP1V8HdM;
            if ((i2 & 32) != 0) {
                i = wCObt0AknnroPeo3Y2G0.w9sT1Swbhx3hs[5];
            }
            this.JXn4Qf7zpnLjP5 = i;
            if (((i2 & 2) != 0 ? wCObt0AknnroPeo3Y2G0.w9sT1Swbhx3hs[1] : -1) != -1) {
                IUoLUUMj5JfAg iUoLUUMj5JfAg = this.xDyLpEZyrcKVe0;
                int iMin = Math.min((i2 & 2) != 0 ? wCObt0AknnroPeo3Y2G0.w9sT1Swbhx3hs[1] : -1, 16384);
                int i3 = iUoLUUMj5JfAg.JXn4Qf7zpnLjP5;
                if (i3 != iMin) {
                    if (iMin < i3) {
                        iUoLUUMj5JfAg.w9sT1Swbhx3hs = Math.min(iUoLUUMj5JfAg.w9sT1Swbhx3hs, iMin);
                    }
                    iUoLUUMj5JfAg.vekpFI4d1Nc4fakF = true;
                    iUoLUUMj5JfAg.JXn4Qf7zpnLjP5 = iMin;
                    int i4 = iUoLUUMj5JfAg.b1EoSIRjJHO5;
                    if (iMin < i4) {
                        if (iMin == 0) {
                            RSjkliukrZnQXjh[] rSjkliukrZnQXjhArr = iUoLUUMj5JfAg.Ee8d2j4S9Vm5yGuR;
                            Arrays.fill(rSjkliukrZnQXjhArr, 0, rSjkliukrZnQXjhArr.length, (Object) null);
                            iUoLUUMj5JfAg.xDyLpEZyrcKVe0 = iUoLUUMj5JfAg.Ee8d2j4S9Vm5yGuR.length - 1;
                            iUoLUUMj5JfAg.ibVTtJUNfrGYbW = 0;
                            iUoLUUMj5JfAg.b1EoSIRjJHO5 = 0;
                        } else {
                            iUoLUUMj5JfAg.dDIMxZXP1V8HdM(i4 - iMin);
                        }
                    }
                }
            }
            D5P1xCAyuvgF(0, 0, 4, 1);
            this.w9sT1Swbhx3hs.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void flush() {
        if (this.Ee8d2j4S9Vm5yGuR) {
            throw new IOException("closed");
        }
        this.w9sT1Swbhx3hs.flush();
    }

    public final synchronized void hjneShqpF9Tis4(byte[] bArr, int i, int i2) {
        if (this.Ee8d2j4S9Vm5yGuR) {
            throw new IOException("closed");
        }
        if (Y9mRyRdkl5FOcwb66V6.J0zjQ7CAgohuxU20eCW6(i2) == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        D5P1xCAyuvgF(0, bArr.length + 8, 7, 0);
        this.w9sT1Swbhx3hs.writeInt(i);
        this.w9sT1Swbhx3hs.writeInt(Y9mRyRdkl5FOcwb66V6.J0zjQ7CAgohuxU20eCW6(i2));
        if (bArr.length != 0) {
            this.w9sT1Swbhx3hs.write(bArr);
        }
        this.w9sT1Swbhx3hs.flush();
    }

    public final synchronized void vIJudZvPyTuNp(int i, long j) {
        if (this.Ee8d2j4S9Vm5yGuR) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
        }
        D5P1xCAyuvgF(i, 4, 8, 0);
        this.w9sT1Swbhx3hs.writeInt((int) j);
        this.w9sT1Swbhx3hs.flush();
    }

    public final synchronized void vekpFI4d1Nc4fakF(boolean z, int i, LTdvNeHFqTsIb9 lTdvNeHFqTsIb9, int i2) {
        if (this.Ee8d2j4S9Vm5yGuR) {
            throw new IOException("closed");
        }
        D5P1xCAyuvgF(i, i2, 0, z ? 1 : 0);
        if (i2 > 0) {
            this.w9sT1Swbhx3hs.nQilHWaqS401ZtR(lTdvNeHFqTsIb9, i2);
        }
    }
}
