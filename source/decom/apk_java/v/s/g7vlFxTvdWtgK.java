package v.s;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class g7vlFxTvdWtgK implements Closeable {
    public boolean D5P1xCAyuvgF;
    public final boolean Ee8d2j4S9Vm5yGuR;
    public final boolean JXn4Qf7zpnLjP5;
    public long b1EoSIRjJHO5;
    public boolean hjneShqpF9Tis4;
    public int ibVTtJUNfrGYbW;
    public boolean pyu8ovAipBTLYAiKab;
    public final SA8HyHBX03d7mOB8LPJM vekpFI4d1Nc4fakF;
    public final enW4UFmBttog4rg5RB w9sT1Swbhx3hs;
    public PPVKHKekPtxKcnappF wotphlvK9sPbXJ;
    public boolean xDyLpEZyrcKVe0;
    public final LTdvNeHFqTsIb9 gmNWMfvn6zlEj = new LTdvNeHFqTsIb9();
    public final LTdvNeHFqTsIb9 gIIiyi2ddlMDR0 = new LTdvNeHFqTsIb9();
    public final byte[] Qrz92kRPw4GcghAc = null;

    public g7vlFxTvdWtgK(enW4UFmBttog4rg5RB enw4ufmbttog4rg5rb, J1m0XraSkScfWFMIlTC j1m0XraSkScfWFMIlTC, boolean z, boolean z2) {
        this.w9sT1Swbhx3hs = enw4ufmbttog4rg5rb;
        this.vekpFI4d1Nc4fakF = j1m0XraSkScfWFMIlTC;
        this.JXn4Qf7zpnLjP5 = z;
        this.Ee8d2j4S9Vm5yGuR = z2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        PPVKHKekPtxKcnappF pPVKHKekPtxKcnappF = this.wotphlvK9sPbXJ;
        if (pPVKHKekPtxKcnappF != null) {
            pPVKHKekPtxKcnappF.close();
        }
    }

    public final void dDIMxZXP1V8HdM() throws ProtocolException, EOFException {
        short s;
        g7vlFxTvdWtgK g7vlfxtvdwtgk;
        vAfoY7dO2avAiOg vafoy7do2avaiog;
        String strXDyLpEZyrcKVe0;
        long j = this.b1EoSIRjJHO5;
        if (j > 0) {
            this.w9sT1Swbhx3hs.J0zjQ7CAgohuxU20eCW6(this.gmNWMfvn6zlEj, j);
        }
        switch (this.ibVTtJUNfrGYbW) {
            case 8:
                LTdvNeHFqTsIb9 lTdvNeHFqTsIb9 = this.gmNWMfvn6zlEj;
                long j2 = lTdvNeHFqTsIb9.vekpFI4d1Nc4fakF;
                if (j2 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                ks8dKkpy03zBkyez4b ks8dkkpy03zbkyez4b = null;
                if (j2 != 0) {
                    s = lTdvNeHFqTsIb9.readShort();
                    this.gmNWMfvn6zlEj.vIJudZvPyTuNp();
                    if (s < 1000 || s >= 5000) {
                        strXDyLpEZyrcKVe0 = Y9mRyRdkl5FOcwb66V6.xDyLpEZyrcKVe0("Code must be in range [1000,5000): ", s);
                    } else {
                        strXDyLpEZyrcKVe0 = ((1004 > s || s >= 1007) && (1012 + 3 > s || s >= 2920 + 80)) ? null : Y9mRyRdkl5FOcwb66V6.b1EoSIRjJHO5("Code ", " is reserved and may not be used.", s);
                    }
                    if (strXDyLpEZyrcKVe0 != null) {
                        throw new ProtocolException(strXDyLpEZyrcKVe0);
                    }
                } else {
                    s = 1005;
                }
                J1m0XraSkScfWFMIlTC j1m0XraSkScfWFMIlTC = (J1m0XraSkScfWFMIlTC) this.vekpFI4d1Nc4fakF;
                if (s == -1) {
                    j1m0XraSkScfWFMIlTC.getClass();
                    throw new IllegalArgumentException("Failed requirement.");
                }
                synchronized (j1m0XraSkScfWFMIlTC) {
                    if (j1m0XraSkScfWFMIlTC.MLSIo1htfMPWeB8V876L != -1) {
                        throw new IllegalStateException("already closed");
                    }
                    j1m0XraSkScfWFMIlTC.MLSIo1htfMPWeB8V876L = s;
                    if (j1m0XraSkScfWFMIlTC.J0zjQ7CAgohuxU20eCW6 && j1m0XraSkScfWFMIlTC.Qrz92kRPw4GcghAc.isEmpty()) {
                        ks8dKkpy03zBkyez4b ks8dkkpy03zbkyez4b2 = j1m0XraSkScfWFMIlTC.gIIiyi2ddlMDR0;
                        j1m0XraSkScfWFMIlTC.gIIiyi2ddlMDR0 = null;
                        g7vlfxtvdwtgk = j1m0XraSkScfWFMIlTC.pyu8ovAipBTLYAiKab;
                        j1m0XraSkScfWFMIlTC.pyu8ovAipBTLYAiKab = null;
                        vafoy7do2avaiog = j1m0XraSkScfWFMIlTC.D5P1xCAyuvgF;
                        j1m0XraSkScfWFMIlTC.D5P1xCAyuvgF = null;
                        j1m0XraSkScfWFMIlTC.hjneShqpF9Tis4.Ee8d2j4S9Vm5yGuR();
                        ks8dkkpy03zbkyez4b = ks8dkkpy03zbkyez4b2;
                    } else {
                        g7vlfxtvdwtgk = null;
                        vafoy7do2avaiog = null;
                    }
                }
                try {
                    j1m0XraSkScfWFMIlTC.dDIMxZXP1V8HdM.DVTNwpDEVsUKuznof();
                    if (ks8dkkpy03zbkyez4b != null) {
                        j1m0XraSkScfWFMIlTC.dDIMxZXP1V8HdM.H9XlUr4OeMJFiXK();
                        break;
                    }
                    if (ks8dkkpy03zbkyez4b != null) {
                        yrMnf4fyLGfIJbMg8IbG.vekpFI4d1Nc4fakF(ks8dkkpy03zbkyez4b);
                    }
                    if (g7vlfxtvdwtgk != null) {
                        yrMnf4fyLGfIJbMg8IbG.vekpFI4d1Nc4fakF(g7vlfxtvdwtgk);
                    }
                    if (vafoy7do2avaiog != null) {
                        yrMnf4fyLGfIJbMg8IbG.vekpFI4d1Nc4fakF(vafoy7do2avaiog);
                    }
                    this.xDyLpEZyrcKVe0 = true;
                    return;
                } catch (Throwable th) {
                    if (ks8dkkpy03zbkyez4b != null) {
                        yrMnf4fyLGfIJbMg8IbG.vekpFI4d1Nc4fakF(ks8dkkpy03zbkyez4b);
                    }
                    if (g7vlfxtvdwtgk != null) {
                        yrMnf4fyLGfIJbMg8IbG.vekpFI4d1Nc4fakF(g7vlfxtvdwtgk);
                    }
                    if (vafoy7do2avaiog != null) {
                        yrMnf4fyLGfIJbMg8IbG.vekpFI4d1Nc4fakF(vafoy7do2avaiog);
                    }
                    throw th;
                }
            case 9:
                SA8HyHBX03d7mOB8LPJM sA8HyHBX03d7mOB8LPJM = this.vekpFI4d1Nc4fakF;
                LTdvNeHFqTsIb9 lTdvNeHFqTsIb10 = this.gmNWMfvn6zlEj;
                XslKUngIJyofTLpQ5 xslKUngIJyofTLpQ5JXn4Qf7zpnLjP5 = lTdvNeHFqTsIb10.JXn4Qf7zpnLjP5(lTdvNeHFqTsIb10.vekpFI4d1Nc4fakF);
                J1m0XraSkScfWFMIlTC j1m0XraSkScfWFMIlTC2 = (J1m0XraSkScfWFMIlTC) sA8HyHBX03d7mOB8LPJM;
                synchronized (j1m0XraSkScfWFMIlTC2) {
                    try {
                        if (!j1m0XraSkScfWFMIlTC2.XiR1pIn5878vVWd && (!j1m0XraSkScfWFMIlTC2.J0zjQ7CAgohuxU20eCW6 || !j1m0XraSkScfWFMIlTC2.Qrz92kRPw4GcghAc.isEmpty())) {
                            j1m0XraSkScfWFMIlTC2.wotphlvK9sPbXJ.add(xslKUngIJyofTLpQ5JXn4Qf7zpnLjP5);
                            j1m0XraSkScfWFMIlTC2.xDyLpEZyrcKVe0();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            case 10:
                SA8HyHBX03d7mOB8LPJM sA8HyHBX03d7mOB8LPJM2 = this.vekpFI4d1Nc4fakF;
                LTdvNeHFqTsIb9 lTdvNeHFqTsIb11 = this.gmNWMfvn6zlEj;
                lTdvNeHFqTsIb11.JXn4Qf7zpnLjP5(lTdvNeHFqTsIb11.vekpFI4d1Nc4fakF);
                J1m0XraSkScfWFMIlTC j1m0XraSkScfWFMIlTC3 = (J1m0XraSkScfWFMIlTC) sA8HyHBX03d7mOB8LPJM2;
                synchronized (j1m0XraSkScfWFMIlTC3) {
                    j1m0XraSkScfWFMIlTC3.DVTNwpDEVsUKuznof = false;
                }
                return;
            default:
                int i = this.ibVTtJUNfrGYbW;
                byte[] bArr = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
                throw new ProtocolException("Unknown control opcode: ".concat(Integer.toHexString(i)));
        }
    }

    public final void vekpFI4d1Nc4fakF() throws IOException {
        boolean z;
        if (this.xDyLpEZyrcKVe0) {
            throw new IOException("closed");
        }
        enW4UFmBttog4rg5RB enw4ufmbttog4rg5rb = this.w9sT1Swbhx3hs;
        long jB1EoSIRjJHO5 = enw4ufmbttog4rg5rb.w9sT1Swbhx3hs().b1EoSIRjJHO5();
        enw4ufmbttog4rg5rb.w9sT1Swbhx3hs().w9sT1Swbhx3hs();
        try {
            byte b = enw4ufmbttog4rg5rb.readByte();
            byte[] bArr = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
            enw4ufmbttog4rg5rb.w9sT1Swbhx3hs().ibVTtJUNfrGYbW(jB1EoSIRjJHO5, TimeUnit.NANOSECONDS);
            int i = b & 15;
            this.ibVTtJUNfrGYbW = i;
            boolean z2 = (b & 128) != 0;
            this.pyu8ovAipBTLYAiKab = z2;
            boolean z3 = (b & 8) != 0;
            this.D5P1xCAyuvgF = z3;
            if (z3 && !z2) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z4 = (b & 64) != 0;
            if (i == 1 || i == 2) {
                if (!z4) {
                    z = false;
                } else {
                    if (!this.JXn4Qf7zpnLjP5) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z = true;
                }
                this.hjneShqpF9Tis4 = z;
            } else if (z4) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((b & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((b & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            byte b2 = enw4ufmbttog4rg5rb.readByte();
            boolean z5 = (b2 & 128) != 0;
            if (z5) {
                throw new ProtocolException("Server-sent frames must not be masked.");
            }
            long j = b2 & 127;
            this.b1EoSIRjJHO5 = j;
            if (j == 126) {
                this.b1EoSIRjJHO5 = enw4ufmbttog4rg5rb.readShort() & 65535;
            } else if (j == 127) {
                long j2 = enw4ufmbttog4rg5rb.readLong();
                this.b1EoSIRjJHO5 = j2;
                if (j2 < 0) {
                    throw new ProtocolException("Frame length 0x" + Long.toHexString(this.b1EoSIRjJHO5) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.D5P1xCAyuvgF && this.b1EoSIRjJHO5 > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z5) {
                enw4ufmbttog4rg5rb.readFully(this.Qrz92kRPw4GcghAc);
            }
        } catch (Throwable th) {
            enw4ufmbttog4rg5rb.w9sT1Swbhx3hs().ibVTtJUNfrGYbW(jB1EoSIRjJHO5, TimeUnit.NANOSECONDS);
            throw th;
        }
    }
}
