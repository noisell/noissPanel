package v.s;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class Ksynl03UBrEMVM80NQ implements Closeable {
    public static final WCObt0AknnroPeo3Y2G0 rCHnHJBAlOpNI5;
    public final uV3RzXbqCGFOlAdx D5P1xCAyuvgF;
    public long DVTNwpDEVsUKuznof;
    public final opWpJwGfRP1bT1 EWUjsTERgdPbSw3NNlN;
    public int Ee8d2j4S9Vm5yGuR;
    public long H9XlUr4OeMJFiXK;
    public long J0zjQ7CAgohuxU20eCW6;
    public final String JXn4Qf7zpnLjP5;
    public long K7eEOBPYP9VIoHWTe;
    public final WCObt0AknnroPeo3Y2G0 MLSIo1htfMPWeB8V876L;
    public long Qrz92kRPw4GcghAc;
    public WCObt0AknnroPeo3Y2G0 XiR1pIn5878vVWd;
    public final Cid8LKolL4e2FdtXe b1EoSIRjJHO5;
    public final Socket dTS0S7eC32ubQH54j36;
    public long gIIiyi2ddlMDR0;
    public final fEyMFFyOOvHURJ7To6L gmNWMfvn6zlEj;
    public final uV3RzXbqCGFOlAdx hjneShqpF9Tis4;
    public boolean ibVTtJUNfrGYbW;
    public long l1V0lQr6TbwNKqHfXNbb;
    public long nQilHWaqS401ZtR;
    public final uV3RzXbqCGFOlAdx pyu8ovAipBTLYAiKab;
    public final LinkedHashSet vIJudZvPyTuNp;
    public final LinkedHashMap vekpFI4d1Nc4fakF = new LinkedHashMap();
    public final NnOm424seWgUNKa w9sT1Swbhx3hs;
    public long wotphlvK9sPbXJ;
    public int xDyLpEZyrcKVe0;
    public final t2ZbW7oLdQKLzaw6dyP yTljMGnIibTRdOpSh4;

    static {
        WCObt0AknnroPeo3Y2G0 wCObt0AknnroPeo3Y2G0 = new WCObt0AknnroPeo3Y2G0();
        wCObt0AknnroPeo3Y2G0.w9sT1Swbhx3hs(7, 65535);
        wCObt0AknnroPeo3Y2G0.w9sT1Swbhx3hs(5, 16384);
        rCHnHJBAlOpNI5 = wCObt0AknnroPeo3Y2G0;
    }

    public Ksynl03UBrEMVM80NQ(P7b7KFoJnwoYcb p7b7KFoJnwoYcb) {
        this.w9sT1Swbhx3hs = (NnOm424seWgUNKa) p7b7KFoJnwoYcb.ibVTtJUNfrGYbW;
        String str = p7b7KFoJnwoYcb.dDIMxZXP1V8HdM;
        str = str == null ? null : str;
        this.JXn4Qf7zpnLjP5 = str;
        this.xDyLpEZyrcKVe0 = 3;
        Cid8LKolL4e2FdtXe cid8LKolL4e2FdtXe = (Cid8LKolL4e2FdtXe) p7b7KFoJnwoYcb.vekpFI4d1Nc4fakF;
        this.b1EoSIRjJHO5 = cid8LKolL4e2FdtXe;
        uV3RzXbqCGFOlAdx uv3rzxbqcgfoladxEe8d2j4S9Vm5yGuR = cid8LKolL4e2FdtXe.Ee8d2j4S9Vm5yGuR();
        this.pyu8ovAipBTLYAiKab = uv3rzxbqcgfoladxEe8d2j4S9Vm5yGuR;
        this.D5P1xCAyuvgF = cid8LKolL4e2FdtXe.Ee8d2j4S9Vm5yGuR();
        this.hjneShqpF9Tis4 = cid8LKolL4e2FdtXe.Ee8d2j4S9Vm5yGuR();
        this.gmNWMfvn6zlEj = fEyMFFyOOvHURJ7To6L.hjneShqpF9Tis4;
        WCObt0AknnroPeo3Y2G0 wCObt0AknnroPeo3Y2G0 = new WCObt0AknnroPeo3Y2G0();
        wCObt0AknnroPeo3Y2G0.w9sT1Swbhx3hs(7, 16777216);
        this.MLSIo1htfMPWeB8V876L = wCObt0AknnroPeo3Y2G0;
        WCObt0AknnroPeo3Y2G0 wCObt0AknnroPeo3Y2G1 = rCHnHJBAlOpNI5;
        this.XiR1pIn5878vVWd = wCObt0AknnroPeo3Y2G1;
        this.K7eEOBPYP9VIoHWTe = wCObt0AknnroPeo3Y2G1.dDIMxZXP1V8HdM();
        Socket socket = (Socket) p7b7KFoJnwoYcb.JXn4Qf7zpnLjP5;
        this.dTS0S7eC32ubQH54j36 = socket == null ? null : socket;
        lpsYIxZHQFa6jCAhXSJ lpsyixzhqfa6jcahxsj = (lpsYIxZHQFa6jCAhXSJ) p7b7KFoJnwoYcb.xDyLpEZyrcKVe0;
        this.EWUjsTERgdPbSw3NNlN = new opWpJwGfRP1bT1(lpsyixzhqfa6jcahxsj == null ? null : lpsyixzhqfa6jcahxsj);
        ZHKD3ddbUALiCxl zHKD3ddbUALiCxl = (ZHKD3ddbUALiCxl) p7b7KFoJnwoYcb.Ee8d2j4S9Vm5yGuR;
        this.yTljMGnIibTRdOpSh4 = new t2ZbW7oLdQKLzaw6dyP(this, new lx5X2Hj7IE9zEOsO65(zHKD3ddbUALiCxl != null ? zHKD3ddbUALiCxl : null));
        this.vIJudZvPyTuNp = new LinkedHashSet();
        int i = p7b7KFoJnwoYcb.w9sT1Swbhx3hs;
        if (i != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(i);
            uv3rzxbqcgfoladxEe8d2j4S9Vm5yGuR.vekpFI4d1Nc4fakF(new jD7dMU2Tgl0TPPeOMj(Y9mRyRdkl5FOcwb66V6.ibVTtJUNfrGYbW(str, " ping"), this, nanos, 0), nanos);
        }
    }

    private static /* synthetic */ void wngqgrsinq() {
    }

    public final synchronized Eruqtn8YZhu5 D5P1xCAyuvgF(int i) {
        Eruqtn8YZhu5 eruqtn8YZhu5;
        eruqtn8YZhu5 = (Eruqtn8YZhu5) this.vekpFI4d1Nc4fakF.remove(Integer.valueOf(i));
        notifyAll();
        return eruqtn8YZhu5;
    }

    public final void DVTNwpDEVsUKuznof(int i, boolean z, LTdvNeHFqTsIb9 lTdvNeHFqTsIb9, long j) {
        long j2;
        long j3;
        int iMin;
        long j4;
        if (j == 0) {
            this.EWUjsTERgdPbSw3NNlN.vekpFI4d1Nc4fakF(z, i, lTdvNeHFqTsIb9, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j2 = this.l1V0lQr6TbwNKqHfXNbb;
                            j3 = this.K7eEOBPYP9VIoHWTe;
                            if (j2 >= j3) {
                                if (!this.vekpFI4d1Nc4fakF.containsKey(Integer.valueOf(i))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    throw th;
                }
                iMin = Math.min((int) Math.min(j, j3 - j2), this.EWUjsTERgdPbSw3NNlN.JXn4Qf7zpnLjP5);
                j4 = iMin;
                this.l1V0lQr6TbwNKqHfXNbb += j4;
            }
            j -= j4;
            this.EWUjsTERgdPbSw3NNlN.vekpFI4d1Nc4fakF(z && j == 0, i, lTdvNeHFqTsIb9, iMin);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [char, int] */
    public final void EWUjsTERgdPbSw3NNlN(int i, int i2) {
        this.pyu8ovAipBTLYAiKab.vekpFI4d1Nc4fakF(new MnIjcJIDayJe0m5kU(this.JXn4Qf7zpnLjP5 + ((char) (110 - 19)) + i + "] writeSynReset", this, i, i2, 1), 0L);
    }

    public final synchronized void Qrz92kRPw4GcghAc(long j) {
        long j2 = this.H9XlUr4OeMJFiXK + j;
        this.H9XlUr4OeMJFiXK = j2;
        long j3 = j2 - this.DVTNwpDEVsUKuznof;
        if (j3 >= this.MLSIo1htfMPWeB8V876L.dDIMxZXP1V8HdM() / 2) {
            vIJudZvPyTuNp(0, j3);
            this.DVTNwpDEVsUKuznof += j3;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        dDIMxZXP1V8HdM((-28) + 29, 9, null);
    }

    public final void dDIMxZXP1V8HdM(int i, int i2, IOException iOException) {
        int i3;
        Object[] array;
        byte[] bArr = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
        try {
            hjneShqpF9Tis4(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.vekpFI4d1Nc4fakF.isEmpty()) {
                array = null;
            } else {
                array = this.vekpFI4d1Nc4fakF.values().toArray(new Eruqtn8YZhu5[0]);
                this.vekpFI4d1Nc4fakF.clear();
            }
        }
        Eruqtn8YZhu5[] eruqtn8YZhu5Arr = (Eruqtn8YZhu5[]) array;
        if (eruqtn8YZhu5Arr != null) {
            for (Eruqtn8YZhu5 eruqtn8YZhu5 : eruqtn8YZhu5Arr) {
                try {
                    eruqtn8YZhu5.vekpFI4d1Nc4fakF(i2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.EWUjsTERgdPbSw3NNlN.close();
        } catch (IOException unused3) {
        }
        try {
            this.dTS0S7eC32ubQH54j36.close();
        } catch (IOException unused4) {
        }
        this.pyu8ovAipBTLYAiKab.Ee8d2j4S9Vm5yGuR();
        this.D5P1xCAyuvgF.Ee8d2j4S9Vm5yGuR();
        this.hjneShqpF9Tis4.Ee8d2j4S9Vm5yGuR();
    }

    public final void flush() {
        this.EWUjsTERgdPbSw3NNlN.flush();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    public final void hjneShqpF9Tis4(int i) {
        synchronized (this.EWUjsTERgdPbSw3NNlN) {
            synchronized (this) {
                if (this.ibVTtJUNfrGYbW) {
                    return;
                }
                this.ibVTtJUNfrGYbW = (-67) + 68;
                this.EWUjsTERgdPbSw3NNlN.hjneShqpF9Tis4(yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM, this.Ee8d2j4S9Vm5yGuR, i);
            }
        }
    }

    public final void vIJudZvPyTuNp(int i, long j) {
        this.pyu8ovAipBTLYAiKab.vekpFI4d1Nc4fakF(new na3KQSoV3RzSLZ5(this.JXn4Qf7zpnLjP5 + '[' + i + "] windowUpdate", this, i, j), 0L);
    }

    public final synchronized Eruqtn8YZhu5 vekpFI4d1Nc4fakF(int i) {
        return (Eruqtn8YZhu5) this.vekpFI4d1Nc4fakF.get(Integer.valueOf(i));
    }
}
