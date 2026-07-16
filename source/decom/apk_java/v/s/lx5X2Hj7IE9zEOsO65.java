package v.s;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class lx5X2Hj7IE9zEOsO65 implements Closeable {
    public static final Logger Ee8d2j4S9Vm5yGuR = Logger.getLogger(yg3wKheju8eW4e6qsE.class.getName());
    public final iDtHNba8JQ5I8Z JXn4Qf7zpnLjP5;
    public final FfMehSALMFdtxtvcE vekpFI4d1Nc4fakF;
    public final enW4UFmBttog4rg5RB w9sT1Swbhx3hs;

    public lx5X2Hj7IE9zEOsO65(enW4UFmBttog4rg5RB enw4ufmbttog4rg5rb) {
        this.w9sT1Swbhx3hs = enw4ufmbttog4rg5rb;
        FfMehSALMFdtxtvcE ffMehSALMFdtxtvcE = new FfMehSALMFdtxtvcE(enw4ufmbttog4rg5rb);
        this.vekpFI4d1Nc4fakF = ffMehSALMFdtxtvcE;
        this.JXn4Qf7zpnLjP5 = new iDtHNba8JQ5I8Z(ffMehSALMFdtxtvcE);
    }

    private static /* synthetic */ void izizgroyjt() {
    }

    public final List D5P1xCAyuvgF(int i, int i2, int i3, int i4) throws IOException {
        FfMehSALMFdtxtvcE ffMehSALMFdtxtvcE = this.vekpFI4d1Nc4fakF;
        ffMehSALMFdtxtvcE.xDyLpEZyrcKVe0 = i;
        ffMehSALMFdtxtvcE.vekpFI4d1Nc4fakF = i;
        ffMehSALMFdtxtvcE.ibVTtJUNfrGYbW = i2;
        ffMehSALMFdtxtvcE.JXn4Qf7zpnLjP5 = i3;
        ffMehSALMFdtxtvcE.Ee8d2j4S9Vm5yGuR = i4;
        iDtHNba8JQ5I8Z idthnba8jq5i8z = this.JXn4Qf7zpnLjP5;
        ZHKD3ddbUALiCxl zHKD3ddbUALiCxl = idthnba8jq5i8z.vekpFI4d1Nc4fakF;
        ArrayList arrayList = idthnba8jq5i8z.w9sT1Swbhx3hs;
        while (!zHKD3ddbUALiCxl.dDIMxZXP1V8HdM()) {
            byte b = zHKD3ddbUALiCxl.readByte();
            byte[] bArr = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
            int i5 = b & 255;
            int i6 = 49 + 79;
            if (i5 == i6) {
                throw new IOException("index == 0");
            }
            if ((b & 128) == i6) {
                int iEe8d2j4S9Vm5yGuR = idthnba8jq5i8z.Ee8d2j4S9Vm5yGuR(i5, 127);
                int i7 = iEe8d2j4S9Vm5yGuR - 1;
                if (i7 >= 0) {
                    RSjkliukrZnQXjh[] rSjkliukrZnQXjhArr = mwfWxnlFuO8m1ba.dDIMxZXP1V8HdM;
                    if (i7 <= rSjkliukrZnQXjhArr.length - 1) {
                        arrayList.add(rSjkliukrZnQXjhArr[i7]);
                    }
                }
                int length = idthnba8jq5i8z.Ee8d2j4S9Vm5yGuR + 1 + (i7 - mwfWxnlFuO8m1ba.dDIMxZXP1V8HdM.length);
                if (length >= 0) {
                    RSjkliukrZnQXjh[] rSjkliukrZnQXjhArr2 = idthnba8jq5i8z.JXn4Qf7zpnLjP5;
                    if (length < rSjkliukrZnQXjhArr2.length) {
                        arrayList.add(rSjkliukrZnQXjhArr2[length]);
                    }
                }
                throw new IOException(Y9mRyRdkl5FOcwb66V6.xDyLpEZyrcKVe0("Header index too large ", iEe8d2j4S9Vm5yGuR));
            }
            if (i5 == 64) {
                RSjkliukrZnQXjh[] rSjkliukrZnQXjhArr3 = mwfWxnlFuO8m1ba.dDIMxZXP1V8HdM;
                XslKUngIJyofTLpQ5 xslKUngIJyofTLpQ5JXn4Qf7zpnLjP5 = idthnba8jq5i8z.JXn4Qf7zpnLjP5();
                mwfWxnlFuO8m1ba.dDIMxZXP1V8HdM(xslKUngIJyofTLpQ5JXn4Qf7zpnLjP5);
                idthnba8jq5i8z.vekpFI4d1Nc4fakF(new RSjkliukrZnQXjh(xslKUngIJyofTLpQ5JXn4Qf7zpnLjP5, idthnba8jq5i8z.JXn4Qf7zpnLjP5()));
            } else if ((b & 64) == 64) {
                idthnba8jq5i8z.vekpFI4d1Nc4fakF(new RSjkliukrZnQXjh(idthnba8jq5i8z.w9sT1Swbhx3hs(idthnba8jq5i8z.Ee8d2j4S9Vm5yGuR(i5, 63) - 1), idthnba8jq5i8z.JXn4Qf7zpnLjP5()));
            } else if ((b & 32) == 32) {
                int iEe8d2j4S9Vm5yGuR2 = idthnba8jq5i8z.Ee8d2j4S9Vm5yGuR(i5, 31);
                idthnba8jq5i8z.dDIMxZXP1V8HdM = iEe8d2j4S9Vm5yGuR2;
                if (iEe8d2j4S9Vm5yGuR2 < 0 || iEe8d2j4S9Vm5yGuR2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + idthnba8jq5i8z.dDIMxZXP1V8HdM);
                }
                int i8 = idthnba8jq5i8z.ibVTtJUNfrGYbW;
                if (iEe8d2j4S9Vm5yGuR2 < i8) {
                    if (iEe8d2j4S9Vm5yGuR2 == 0) {
                        VnDsNIgXNCQywv8lGh.euF5Udt5Rqv3Qmea(idthnba8jq5i8z.JXn4Qf7zpnLjP5, null);
                        idthnba8jq5i8z.Ee8d2j4S9Vm5yGuR = idthnba8jq5i8z.JXn4Qf7zpnLjP5.length - 1;
                        idthnba8jq5i8z.xDyLpEZyrcKVe0 = 0;
                        idthnba8jq5i8z.ibVTtJUNfrGYbW = 0;
                    } else {
                        idthnba8jq5i8z.dDIMxZXP1V8HdM(i8 - iEe8d2j4S9Vm5yGuR2);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                RSjkliukrZnQXjh[] rSjkliukrZnQXjhArr4 = mwfWxnlFuO8m1ba.dDIMxZXP1V8HdM;
                XslKUngIJyofTLpQ5 xslKUngIJyofTLpQ5JXn4Qf7zpnLjP6 = idthnba8jq5i8z.JXn4Qf7zpnLjP5();
                mwfWxnlFuO8m1ba.dDIMxZXP1V8HdM(xslKUngIJyofTLpQ5JXn4Qf7zpnLjP6);
                arrayList.add(new RSjkliukrZnQXjh(xslKUngIJyofTLpQ5JXn4Qf7zpnLjP6, idthnba8jq5i8z.JXn4Qf7zpnLjP5()));
            } else {
                arrayList.add(new RSjkliukrZnQXjh(idthnba8jq5i8z.w9sT1Swbhx3hs(idthnba8jq5i8z.Ee8d2j4S9Vm5yGuR(i5, 15) - 1), idthnba8jq5i8z.JXn4Qf7zpnLjP5()));
            }
        }
        List listDQC4QhgRN3MSEAP3HW0 = imhBI9RqzETHtVIJe.dQC4QhgRN3MSEAP3HW0(arrayList);
        arrayList.clear();
        return listDQC4QhgRN3MSEAP3HW0;
    }

    public final void Qrz92kRPw4GcghAc(t2ZbW7oLdQKLzaw6dyP t2zbw7oldqklzaw6dyp, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i2 & 8) != 0) {
            byte b = this.w9sT1Swbhx3hs.readByte();
            byte[] bArr = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        int i5 = this.w9sT1Swbhx3hs.readInt() & Integer.MAX_VALUE;
        List listD5P1xCAyuvgF = D5P1xCAyuvgF(OFMrQsTe5s1KYV0lq.wotphlvK9sPbXJ(i - 4, i2, i4), i4, i2, i3);
        Ksynl03UBrEMVM80NQ ksynl03UBrEMVM80NQ = t2zbw7oldqklzaw6dyp.vekpFI4d1Nc4fakF;
        synchronized (ksynl03UBrEMVM80NQ) {
            if (ksynl03UBrEMVM80NQ.vIJudZvPyTuNp.contains(Integer.valueOf(i5))) {
                ksynl03UBrEMVM80NQ.EWUjsTERgdPbSw3NNlN(i5, 2);
                return;
            }
            ksynl03UBrEMVM80NQ.vIJudZvPyTuNp.add(Integer.valueOf(i5));
            ksynl03UBrEMVM80NQ.D5P1xCAyuvgF.vekpFI4d1Nc4fakF(new qNidEJgkzM07Nht53w2L(ksynl03UBrEMVM80NQ.JXn4Qf7zpnLjP5 + '[' + i5 + "] onRequest", ksynl03UBrEMVM80NQ, i5, listD5P1xCAyuvgF), 0L);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.w9sT1Swbhx3hs.close();
    }

    public final boolean dDIMxZXP1V8HdM(boolean z, t2ZbW7oLdQKLzaw6dyP t2zbw7oldqklzaw6dyp) throws IOException {
        int i;
        int i2;
        Object[] array;
        int i3 = 0;
        try {
            this.w9sT1Swbhx3hs.XiR1pIn5878vVWd(9L);
            int iMLSIo1htfMPWeB8V876L = yrMnf4fyLGfIJbMg8IbG.MLSIo1htfMPWeB8V876L(this.w9sT1Swbhx3hs);
            if (iMLSIo1htfMPWeB8V876L > 16384) {
                throw new IOException(Y9mRyRdkl5FOcwb66V6.xDyLpEZyrcKVe0("FRAME_SIZE_ERROR: ", iMLSIo1htfMPWeB8V876L));
            }
            int i4 = this.w9sT1Swbhx3hs.readByte() & 255;
            byte b = this.w9sT1Swbhx3hs.readByte();
            int i5 = b & 255;
            int i6 = this.w9sT1Swbhx3hs.readInt();
            int i7 = Integer.MAX_VALUE & i6;
            Logger logger = Ee8d2j4S9Vm5yGuR;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(yg3wKheju8eW4e6qsE.dDIMxZXP1V8HdM(true, i7, iMLSIo1htfMPWeB8V876L, i4, i5));
            }
            if (z && i4 != 4) {
                StringBuilder sb = new StringBuilder("Expected a SETTINGS frame but was ");
                String[] strArr = yg3wKheju8eW4e6qsE.w9sT1Swbhx3hs;
                sb.append(i4 < strArr.length ? strArr[i4] : yrMnf4fyLGfIJbMg8IbG.b1EoSIRjJHO5("0x%02x", Integer.valueOf(i4)));
                throw new IOException(sb.toString());
            }
            int i8 = 3;
            int i9 = 2;
            switch (i4) {
                case 0:
                    vekpFI4d1Nc4fakF(t2zbw7oldqklzaw6dyp, iMLSIo1htfMPWeB8V876L, i5, i7);
                    return true;
                case 1:
                    hjneShqpF9Tis4(t2zbw7oldqklzaw6dyp, iMLSIo1htfMPWeB8V876L, i5, i7);
                    return true;
                case 2:
                    if (iMLSIo1htfMPWeB8V876L != 5) {
                        throw new IOException(Y9mRyRdkl5FOcwb66V6.b1EoSIRjJHO5("TYPE_PRIORITY length: ", " != 5", iMLSIo1htfMPWeB8V876L));
                    }
                    if (i7 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    enW4UFmBttog4rg5RB enw4ufmbttog4rg5rb = this.w9sT1Swbhx3hs;
                    enw4ufmbttog4rg5rb.readInt();
                    enw4ufmbttog4rg5rb.readByte();
                    return true;
                case 3:
                    if (iMLSIo1htfMPWeB8V876L != 4) {
                        throw new IOException(Y9mRyRdkl5FOcwb66V6.b1EoSIRjJHO5("TYPE_RST_STREAM length: ", " != 4", iMLSIo1htfMPWeB8V876L));
                    }
                    if (i7 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int i10 = this.w9sT1Swbhx3hs.readInt();
                    int[] iArrH9XlUr4OeMJFiXK = Y9mRyRdkl5FOcwb66V6.H9XlUr4OeMJFiXK(14);
                    int length = iArrH9XlUr4OeMJFiXK.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 < length) {
                            i = iArrH9XlUr4OeMJFiXK[i11];
                            if (Y9mRyRdkl5FOcwb66V6.J0zjQ7CAgohuxU20eCW6(i) != i10) {
                                i11++;
                            }
                        } else {
                            i = 0;
                        }
                    }
                    if (i == 0) {
                        throw new IOException(Y9mRyRdkl5FOcwb66V6.xDyLpEZyrcKVe0("TYPE_RST_STREAM unexpected error code: ", i10));
                    }
                    Ksynl03UBrEMVM80NQ ksynl03UBrEMVM80NQ = t2zbw7oldqklzaw6dyp.vekpFI4d1Nc4fakF;
                    if (i7 != 0 && (i6 & 1) == 0) {
                        i3 = 1;
                    }
                    if (i3 != 0) {
                        ksynl03UBrEMVM80NQ.D5P1xCAyuvgF.vekpFI4d1Nc4fakF(new qNidEJgkzM07Nht53w2L(ksynl03UBrEMVM80NQ.JXn4Qf7zpnLjP5 + '[' + i7 + "] onReset", ksynl03UBrEMVM80NQ, i7, i), 0L);
                        return true;
                    }
                    Eruqtn8YZhu5 eruqtn8YZhu5D5P1xCAyuvgF = ksynl03UBrEMVM80NQ.D5P1xCAyuvgF(i7);
                    if (eruqtn8YZhu5D5P1xCAyuvgF != null) {
                        synchronized (eruqtn8YZhu5D5P1xCAyuvgF) {
                            if (eruqtn8YZhu5D5P1xCAyuvgF.gIIiyi2ddlMDR0 == 0) {
                                eruqtn8YZhu5D5P1xCAyuvgF.gIIiyi2ddlMDR0 = i;
                                eruqtn8YZhu5D5P1xCAyuvgF.notifyAll();
                            }
                            break;
                        }
                        return true;
                    }
                    return true;
                case 4:
                    enW4UFmBttog4rg5RB enw4ufmbttog4rg5rb2 = this.w9sT1Swbhx3hs;
                    if (i7 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((b & 1) != 0) {
                        if (iMLSIo1htfMPWeB8V876L != 0) {
                            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                        }
                        return true;
                    }
                    if (iMLSIo1htfMPWeB8V876L % 6 != 0) {
                        throw new IOException(Y9mRyRdkl5FOcwb66V6.xDyLpEZyrcKVe0("TYPE_SETTINGS length % 6 != 0: ", iMLSIo1htfMPWeB8V876L));
                    }
                    WCObt0AknnroPeo3Y2G0 wCObt0AknnroPeo3Y2G0 = new WCObt0AknnroPeo3Y2G0();
                    dPxH1qsKC2Lxf7PHXDZT dpxh1qskc2lxf7phxdztTne6mXOUFKdd = OFtLBiBbrrTHWu.tne6mXOUFKdd(OFtLBiBbrrTHWu.ECwLkmPW1UKz7J6E(0, iMLSIo1htfMPWeB8V876L), 6);
                    int i12 = dpxh1qskc2lxf7phxdztTne6mXOUFKdd.w9sT1Swbhx3hs;
                    int i13 = dpxh1qskc2lxf7phxdztTne6mXOUFKdd.vekpFI4d1Nc4fakF;
                    int i14 = dpxh1qskc2lxf7phxdztTne6mXOUFKdd.JXn4Qf7zpnLjP5;
                    if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                        while (true) {
                            short s = enw4ufmbttog4rg5rb2.readShort();
                            byte[] bArr = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
                            int i15 = s & 65535;
                            int i16 = enw4ufmbttog4rg5rb2.readInt();
                            if (i15 != 2) {
                                if (i15 == i8) {
                                    i15 = 4;
                                } else if (i15 == 4) {
                                    if (i16 < 0) {
                                        throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                    }
                                    i15 = 3 + 4;
                                } else if (i15 == 5 && (i16 < 16384 || i16 > 16777215)) {
                                    throw new IOException(Y9mRyRdkl5FOcwb66V6.xDyLpEZyrcKVe0("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", i16));
                                }
                            } else if (i16 != 0 && i16 != 1) {
                                throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                            }
                            wCObt0AknnroPeo3Y2G0.w9sT1Swbhx3hs(i15, i16);
                            if (i12 != i13) {
                                i12 += i14;
                                i8 = 3;
                            }
                        }
                    }
                    Ksynl03UBrEMVM80NQ ksynl03UBrEMVM80NQ2 = t2zbw7oldqklzaw6dyp.vekpFI4d1Nc4fakF;
                    ksynl03UBrEMVM80NQ2.pyu8ovAipBTLYAiKab.vekpFI4d1Nc4fakF(new bZrzpcw4jpBdHboe4MCr(Y9mRyRdkl5FOcwb66V6.D5P1xCAyuvgF(new StringBuilder(), ksynl03UBrEMVM80NQ2.JXn4Qf7zpnLjP5, " applyAndAckSettings"), t2zbw7oldqklzaw6dyp, wCObt0AknnroPeo3Y2G0, i9), 0L);
                    return true;
                case 5:
                    Qrz92kRPw4GcghAc(t2zbw7oldqklzaw6dyp, iMLSIo1htfMPWeB8V876L, i5, i7);
                    return true;
                case 6:
                    if (iMLSIo1htfMPWeB8V876L != 8) {
                        throw new IOException(Y9mRyRdkl5FOcwb66V6.xDyLpEZyrcKVe0("TYPE_PING length != 8: ", iMLSIo1htfMPWeB8V876L));
                    }
                    if (i7 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    int i17 = this.w9sT1Swbhx3hs.readInt();
                    int i18 = this.w9sT1Swbhx3hs.readInt();
                    if (((b & 1) != 0 ? 1 : 0) == 0) {
                        t2zbw7oldqklzaw6dyp.vekpFI4d1Nc4fakF.pyu8ovAipBTLYAiKab.vekpFI4d1Nc4fakF(new MnIjcJIDayJe0m5kU(Y9mRyRdkl5FOcwb66V6.D5P1xCAyuvgF(new StringBuilder(), t2zbw7oldqklzaw6dyp.vekpFI4d1Nc4fakF.JXn4Qf7zpnLjP5, " ping"), t2zbw7oldqklzaw6dyp.vekpFI4d1Nc4fakF, i17, i18, 0), 0L);
                        return true;
                    }
                    Ksynl03UBrEMVM80NQ ksynl03UBrEMVM80NQ3 = t2zbw7oldqklzaw6dyp.vekpFI4d1Nc4fakF;
                    synchronized (ksynl03UBrEMVM80NQ3) {
                        try {
                            if (i17 == 1) {
                                ksynl03UBrEMVM80NQ3.wotphlvK9sPbXJ++;
                            } else if (i17 == 2) {
                                ksynl03UBrEMVM80NQ3.nQilHWaqS401ZtR++;
                            } else if (i17 == 3) {
                                ksynl03UBrEMVM80NQ3.notifyAll();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return true;
                case 7:
                    if (iMLSIo1htfMPWeB8V876L < 8) {
                        throw new IOException(Y9mRyRdkl5FOcwb66V6.xDyLpEZyrcKVe0("TYPE_GOAWAY length < 8: ", iMLSIo1htfMPWeB8V876L));
                    }
                    if (i7 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int i19 = this.w9sT1Swbhx3hs.readInt();
                    int i20 = this.w9sT1Swbhx3hs.readInt();
                    int i21 = iMLSIo1htfMPWeB8V876L - 8;
                    int[] iArrH9XlUr4OeMJFiXK2 = Y9mRyRdkl5FOcwb66V6.H9XlUr4OeMJFiXK(14);
                    int length2 = iArrH9XlUr4OeMJFiXK2.length;
                    int i22 = 0;
                    while (true) {
                        if (i22 < length2) {
                            i2 = iArrH9XlUr4OeMJFiXK2[i22];
                            if (Y9mRyRdkl5FOcwb66V6.J0zjQ7CAgohuxU20eCW6(i2) != i20) {
                                i22++;
                            }
                        } else {
                            i2 = 0;
                        }
                    }
                    if (i2 == 0) {
                        throw new IOException(Y9mRyRdkl5FOcwb66V6.xDyLpEZyrcKVe0("TYPE_GOAWAY unexpected error code: ", i20));
                    }
                    XslKUngIJyofTLpQ5 xslKUngIJyofTLpQ5JXn4Qf7zpnLjP5 = XslKUngIJyofTLpQ5.Ee8d2j4S9Vm5yGuR;
                    if (i21 > 0) {
                        xslKUngIJyofTLpQ5JXn4Qf7zpnLjP5 = this.w9sT1Swbhx3hs.JXn4Qf7zpnLjP5(i21);
                    }
                    xslKUngIJyofTLpQ5JXn4Qf7zpnLjP5.vekpFI4d1Nc4fakF();
                    Ksynl03UBrEMVM80NQ ksynl03UBrEMVM80NQ4 = t2zbw7oldqklzaw6dyp.vekpFI4d1Nc4fakF;
                    synchronized (ksynl03UBrEMVM80NQ4) {
                        array = ksynl03UBrEMVM80NQ4.vekpFI4d1Nc4fakF.values().toArray(new Eruqtn8YZhu5[0]);
                        ksynl03UBrEMVM80NQ4.ibVTtJUNfrGYbW = true;
                    }
                    Eruqtn8YZhu5[] eruqtn8YZhu5Arr = (Eruqtn8YZhu5[]) array;
                    int length3 = eruqtn8YZhu5Arr.length;
                    while (i3 < length3) {
                        Eruqtn8YZhu5 eruqtn8YZhu5 = eruqtn8YZhu5Arr[i3];
                        if (eruqtn8YZhu5.dDIMxZXP1V8HdM > i19 && eruqtn8YZhu5.xDyLpEZyrcKVe0()) {
                            synchronized (eruqtn8YZhu5) {
                                if (eruqtn8YZhu5.gIIiyi2ddlMDR0 == 0) {
                                    eruqtn8YZhu5.gIIiyi2ddlMDR0 = 8;
                                    eruqtn8YZhu5.notifyAll();
                                }
                                break;
                            }
                            t2zbw7oldqklzaw6dyp.vekpFI4d1Nc4fakF.D5P1xCAyuvgF(eruqtn8YZhu5.dDIMxZXP1V8HdM);
                        }
                        i3++;
                    }
                    return true;
                case 8:
                    if (iMLSIo1htfMPWeB8V876L != 4) {
                        throw new IOException(Y9mRyRdkl5FOcwb66V6.xDyLpEZyrcKVe0("TYPE_WINDOW_UPDATE length !=4: ", iMLSIo1htfMPWeB8V876L));
                    }
                    long j = ((long) this.w9sT1Swbhx3hs.readInt()) & 2147483647L;
                    if (j == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    if (i7 == 0) {
                        Ksynl03UBrEMVM80NQ ksynl03UBrEMVM80NQ5 = t2zbw7oldqklzaw6dyp.vekpFI4d1Nc4fakF;
                        synchronized (ksynl03UBrEMVM80NQ5) {
                            ksynl03UBrEMVM80NQ5.K7eEOBPYP9VIoHWTe += j;
                            ksynl03UBrEMVM80NQ5.notifyAll();
                        }
                        return true;
                    }
                    Eruqtn8YZhu5 eruqtn8YZhu5VekpFI4d1Nc4fakF = t2zbw7oldqklzaw6dyp.vekpFI4d1Nc4fakF.vekpFI4d1Nc4fakF(i7);
                    if (eruqtn8YZhu5VekpFI4d1Nc4fakF != null) {
                        synchronized (eruqtn8YZhu5VekpFI4d1Nc4fakF) {
                            eruqtn8YZhu5VekpFI4d1Nc4fakF.xDyLpEZyrcKVe0 += j;
                            if (j > 0) {
                                eruqtn8YZhu5VekpFI4d1Nc4fakF.notifyAll();
                            }
                            break;
                        }
                        return true;
                    }
                    return true;
                default:
                    this.w9sT1Swbhx3hs.skip(iMLSIo1htfMPWeB8V876L);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void hjneShqpF9Tis4(t2ZbW7oLdQKLzaw6dyP t2zbw7oldqklzaw6dyp, int i, int i2, int i3) throws IOException {
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        int i4 = 0;
        int i5 = 1;
        boolean z = (i2 & 1) != 0;
        if ((i2 & 8) != 0) {
            byte b = this.w9sT1Swbhx3hs.readByte();
            byte[] bArr = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
            i4 = b & 255;
        }
        if ((i2 & 32) != 0) {
            enW4UFmBttog4rg5RB enw4ufmbttog4rg5rb = this.w9sT1Swbhx3hs;
            enw4ufmbttog4rg5rb.readInt();
            enw4ufmbttog4rg5rb.readByte();
            byte[] bArr2 = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
            i -= 5;
        }
        List listD5P1xCAyuvgF = D5P1xCAyuvgF(OFMrQsTe5s1KYV0lq.wotphlvK9sPbXJ(i, i2, i4), i4, i2, i3);
        Ksynl03UBrEMVM80NQ ksynl03UBrEMVM80NQ = t2zbw7oldqklzaw6dyp.vekpFI4d1Nc4fakF;
        if (i3 != 0 && (i3 & 1) == 0) {
            ksynl03UBrEMVM80NQ.D5P1xCAyuvgF.vekpFI4d1Nc4fakF(new qNidEJgkzM07Nht53w2L(ksynl03UBrEMVM80NQ.JXn4Qf7zpnLjP5 + '[' + i3 + "] onHeaders", ksynl03UBrEMVM80NQ, i3, listD5P1xCAyuvgF, z), 0L);
            return;
        }
        synchronized (ksynl03UBrEMVM80NQ) {
            Eruqtn8YZhu5 eruqtn8YZhu5VekpFI4d1Nc4fakF = ksynl03UBrEMVM80NQ.vekpFI4d1Nc4fakF(i3);
            if (eruqtn8YZhu5VekpFI4d1Nc4fakF != null) {
                eruqtn8YZhu5VekpFI4d1Nc4fakF.b1EoSIRjJHO5(yrMnf4fyLGfIJbMg8IbG.H9XlUr4OeMJFiXK(listD5P1xCAyuvgF), z);
                return;
            }
            if (ksynl03UBrEMVM80NQ.ibVTtJUNfrGYbW) {
                return;
            }
            if (i3 <= ksynl03UBrEMVM80NQ.Ee8d2j4S9Vm5yGuR) {
                return;
            }
            if (i3 % 2 == ksynl03UBrEMVM80NQ.xDyLpEZyrcKVe0 % 2) {
                return;
            }
            Eruqtn8YZhu5 eruqtn8YZhu5 = new Eruqtn8YZhu5(i3, ksynl03UBrEMVM80NQ, false, z, yrMnf4fyLGfIJbMg8IbG.H9XlUr4OeMJFiXK(listD5P1xCAyuvgF));
            ksynl03UBrEMVM80NQ.Ee8d2j4S9Vm5yGuR = i3;
            ksynl03UBrEMVM80NQ.vekpFI4d1Nc4fakF.put(Integer.valueOf(i3), eruqtn8YZhu5);
            ksynl03UBrEMVM80NQ.b1EoSIRjJHO5.Ee8d2j4S9Vm5yGuR().vekpFI4d1Nc4fakF(new bZrzpcw4jpBdHboe4MCr(ksynl03UBrEMVM80NQ.JXn4Qf7zpnLjP5 + '[' + i3 + "] onStream", ksynl03UBrEMVM80NQ, eruqtn8YZhu5, i5), 0L);
        }
    }

    public final void vekpFI4d1Nc4fakF(t2ZbW7oLdQKLzaw6dyP t2zbw7oldqklzaw6dyp, int i, int i2, int i3) throws IOException {
        int i4;
        boolean z;
        long j;
        boolean z2;
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z3 = (i2 & 1) != 0;
        if ((i2 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        if ((i2 & 8) != 0) {
            byte b = this.w9sT1Swbhx3hs.readByte();
            byte[] bArr = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        int iWotphlvK9sPbXJ = OFMrQsTe5s1KYV0lq.wotphlvK9sPbXJ(i, i2, i4);
        enW4UFmBttog4rg5RB enw4ufmbttog4rg5rb = this.w9sT1Swbhx3hs;
        Ksynl03UBrEMVM80NQ ksynl03UBrEMVM80NQ = t2zbw7oldqklzaw6dyp.vekpFI4d1Nc4fakF;
        long j2 = 0;
        if (i3 == 0 || (i3 & 1) != 0) {
            Eruqtn8YZhu5 eruqtn8YZhu5VekpFI4d1Nc4fakF = ksynl03UBrEMVM80NQ.vekpFI4d1Nc4fakF(i3);
            if (eruqtn8YZhu5VekpFI4d1Nc4fakF == null) {
                t2zbw7oldqklzaw6dyp.vekpFI4d1Nc4fakF.EWUjsTERgdPbSw3NNlN(i3, (-97) + 99);
                long j3 = iWotphlvK9sPbXJ;
                t2zbw7oldqklzaw6dyp.vekpFI4d1Nc4fakF.Qrz92kRPw4GcghAc(j3);
                enw4ufmbttog4rg5rb.skip(j3);
            } else {
                byte[] bArr2 = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
                gvlctfzwrJh09D58 gvlctfzwrjh09d58 = eruqtn8YZhu5VekpFI4d1Nc4fakF.pyu8ovAipBTLYAiKab;
                long j4 = iWotphlvK9sPbXJ;
                gvlctfzwrjh09d58.getClass();
                long j5 = j4;
                while (true) {
                    if (j5 <= j2) {
                        Eruqtn8YZhu5 eruqtn8YZhu5 = gvlctfzwrjh09d58.ibVTtJUNfrGYbW;
                        byte[] bArr3 = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
                        eruqtn8YZhu5.w9sT1Swbhx3hs.Qrz92kRPw4GcghAc(j4);
                        break;
                    }
                    synchronized (gvlctfzwrjh09d58.ibVTtJUNfrGYbW) {
                        z = gvlctfzwrjh09d58.vekpFI4d1Nc4fakF;
                        j = j2;
                        z2 = gvlctfzwrjh09d58.Ee8d2j4S9Vm5yGuR.vekpFI4d1Nc4fakF + j5 > gvlctfzwrjh09d58.w9sT1Swbhx3hs;
                    }
                    if (z2) {
                        enw4ufmbttog4rg5rb.skip(j5);
                        gvlctfzwrjh09d58.ibVTtJUNfrGYbW.Ee8d2j4S9Vm5yGuR(4);
                        break;
                    }
                    if (z) {
                        enw4ufmbttog4rg5rb.skip(j5);
                        break;
                    }
                    long jYTljMGnIibTRdOpSh4 = enw4ufmbttog4rg5rb.yTljMGnIibTRdOpSh4(gvlctfzwrjh09d58.JXn4Qf7zpnLjP5, j5);
                    if (jYTljMGnIibTRdOpSh4 == -1) {
                        throw new EOFException();
                    }
                    j5 -= jYTljMGnIibTRdOpSh4;
                    Eruqtn8YZhu5 eruqtn8YZhu6 = gvlctfzwrjh09d58.ibVTtJUNfrGYbW;
                    synchronized (eruqtn8YZhu6) {
                        try {
                            if (gvlctfzwrjh09d58.xDyLpEZyrcKVe0) {
                                LTdvNeHFqTsIb9 lTdvNeHFqTsIb9 = gvlctfzwrjh09d58.JXn4Qf7zpnLjP5;
                                lTdvNeHFqTsIb9.skip(lTdvNeHFqTsIb9.vekpFI4d1Nc4fakF);
                            } else {
                                LTdvNeHFqTsIb9 lTdvNeHFqTsIb10 = gvlctfzwrjh09d58.Ee8d2j4S9Vm5yGuR;
                                boolean z4 = lTdvNeHFqTsIb10.vekpFI4d1Nc4fakF == j;
                                lTdvNeHFqTsIb10.fivkjwgu2UdAtiY(gvlctfzwrjh09d58.JXn4Qf7zpnLjP5);
                                if (z4) {
                                    eruqtn8YZhu6.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    j2 = j;
                }
                if (z3) {
                    eruqtn8YZhu5VekpFI4d1Nc4fakF.b1EoSIRjJHO5(yrMnf4fyLGfIJbMg8IbG.w9sT1Swbhx3hs, true);
                }
            }
        } else {
            LTdvNeHFqTsIb9 lTdvNeHFqTsIb11 = new LTdvNeHFqTsIb9();
            long j6 = iWotphlvK9sPbXJ;
            enw4ufmbttog4rg5rb.XiR1pIn5878vVWd(j6);
            enw4ufmbttog4rg5rb.yTljMGnIibTRdOpSh4(lTdvNeHFqTsIb11, j6);
            ksynl03UBrEMVM80NQ.D5P1xCAyuvgF.vekpFI4d1Nc4fakF(new Fyf95o2Y5vGR(ksynl03UBrEMVM80NQ.JXn4Qf7zpnLjP5 + '[' + i3 + "] onData", ksynl03UBrEMVM80NQ, i3, lTdvNeHFqTsIb11, iWotphlvK9sPbXJ, z3), 0L);
        }
        this.w9sT1Swbhx3hs.skip(i4);
    }
}
