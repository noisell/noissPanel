package v.s;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.security.MessageDigest;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class J1m0XraSkScfWFMIlTC implements n456oOyX6Umn21f, SA8HyHBX03d7mOB8LPJM {
    public static final List l1V0lQr6TbwNKqHfXNbb = Collections.singletonList(B62d1BWQ36VxGmXU.HTTP_1_1);
    public vAfoY7dO2avAiOg D5P1xCAyuvgF;
    public boolean DVTNwpDEVsUKuznof;
    public final long Ee8d2j4S9Vm5yGuR;
    public int H9XlUr4OeMJFiXK;
    public boolean J0zjQ7CAgohuxU20eCW6;
    public boolean XiR1pIn5878vVWd;
    public T2DwUEsPFL03 b1EoSIRjJHO5;
    public final FZ1sl4mHq4J0hOEYC dDIMxZXP1V8HdM;
    public ks8dKkpy03zBkyez4b gIIiyi2ddlMDR0;
    public String gmNWMfvn6zlEj;
    public final uV3RzXbqCGFOlAdx hjneShqpF9Tis4;
    public VdAulbq7zlVjr545h ibVTtJUNfrGYbW;
    public long nQilHWaqS401ZtR;
    public g7vlFxTvdWtgK pyu8ovAipBTLYAiKab;
    public final long vekpFI4d1Nc4fakF;
    public final Random w9sT1Swbhx3hs;
    public final String xDyLpEZyrcKVe0;
    public mKd2cKytq1dSGgTQdn JXn4Qf7zpnLjP5 = null;
    public final ArrayDeque wotphlvK9sPbXJ = new ArrayDeque();
    public final ArrayDeque Qrz92kRPw4GcghAc = new ArrayDeque();
    public int MLSIo1htfMPWeB8V876L = -1;

    public J1m0XraSkScfWFMIlTC(Cid8LKolL4e2FdtXe cid8LKolL4e2FdtXe, iniVyKd0OGb2raI4 inivykd0ogb2rai4, FZ1sl4mHq4J0hOEYC fZ1sl4mHq4J0hOEYC, Random random, long j, long j2) {
        this.dDIMxZXP1V8HdM = fZ1sl4mHq4J0hOEYC;
        this.w9sT1Swbhx3hs = random;
        this.vekpFI4d1Nc4fakF = j;
        this.Ee8d2j4S9Vm5yGuR = j2;
        this.hjneShqpF9Tis4 = cid8LKolL4e2FdtXe.Ee8d2j4S9Vm5yGuR();
        String str = (String) inivykd0ogb2rai4.JXn4Qf7zpnLjP5;
        if (!"GET".equals(str)) {
            throw new IllegalArgumentException(("Request must be GET: " + str).toString());
        }
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.xDyLpEZyrcKVe0 = fadfsJa4iEdiwEC4Xm8.ibVTtJUNfrGYbW(bArr).dDIMxZXP1V8HdM();
    }

    public final void Ee8d2j4S9Vm5yGuR() {
        while (this.MLSIo1htfMPWeB8V876L == -1) {
            g7vlFxTvdWtgK g7vlfxtvdwtgk = this.pyu8ovAipBTLYAiKab;
            g7vlfxtvdwtgk.vekpFI4d1Nc4fakF();
            if (g7vlfxtvdwtgk.D5P1xCAyuvgF) {
                g7vlfxtvdwtgk.dDIMxZXP1V8HdM();
            } else {
                SA8HyHBX03d7mOB8LPJM sA8HyHBX03d7mOB8LPJM = g7vlfxtvdwtgk.vekpFI4d1Nc4fakF;
                LTdvNeHFqTsIb9 lTdvNeHFqTsIb9 = g7vlfxtvdwtgk.gIIiyi2ddlMDR0;
                int i = g7vlfxtvdwtgk.ibVTtJUNfrGYbW;
                if (i != 1 && i != 2) {
                    byte[] bArr = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
                    throw new ProtocolException("Unknown opcode: ".concat(Integer.toHexString(i)));
                }
                while (true) {
                    if (!g7vlfxtvdwtgk.xDyLpEZyrcKVe0) {
                        long j = g7vlfxtvdwtgk.b1EoSIRjJHO5;
                        if (j > 0) {
                            g7vlfxtvdwtgk.w9sT1Swbhx3hs.J0zjQ7CAgohuxU20eCW6(lTdvNeHFqTsIb9, j);
                        }
                        if (g7vlfxtvdwtgk.pyu8ovAipBTLYAiKab) {
                            if (g7vlfxtvdwtgk.hjneShqpF9Tis4) {
                                PPVKHKekPtxKcnappF pPVKHKekPtxKcnappF = g7vlfxtvdwtgk.wotphlvK9sPbXJ;
                                if (pPVKHKekPtxKcnappF == null) {
                                    pPVKHKekPtxKcnappF = new PPVKHKekPtxKcnappF(1, g7vlfxtvdwtgk.Ee8d2j4S9Vm5yGuR);
                                    g7vlfxtvdwtgk.wotphlvK9sPbXJ = pPVKHKekPtxKcnappF;
                                }
                                Inflater inflater = (Inflater) pPVKHKekPtxKcnappF.Ee8d2j4S9Vm5yGuR;
                                LTdvNeHFqTsIb9 lTdvNeHFqTsIb10 = pPVKHKekPtxKcnappF.JXn4Qf7zpnLjP5;
                                if (lTdvNeHFqTsIb10.vekpFI4d1Nc4fakF != 0) {
                                    throw new IllegalArgumentException("Failed requirement.");
                                }
                                if (pPVKHKekPtxKcnappF.vekpFI4d1Nc4fakF) {
                                    inflater.reset();
                                }
                                lTdvNeHFqTsIb10.fivkjwgu2UdAtiY(lTdvNeHFqTsIb9);
                                lTdvNeHFqTsIb10.XuO9PPFo607ssKwZjNW(65535);
                                long bytesRead = inflater.getBytesRead() + lTdvNeHFqTsIb10.vekpFI4d1Nc4fakF;
                                do {
                                    ((pZpQ49r581UQ) pPVKHKekPtxKcnappF.xDyLpEZyrcKVe0).dDIMxZXP1V8HdM(lTdvNeHFqTsIb9, Long.MAX_VALUE);
                                } while (inflater.getBytesRead() < bytesRead);
                            }
                            if (i != 1) {
                                ((J1m0XraSkScfWFMIlTC) sA8HyHBX03d7mOB8LPJM).dDIMxZXP1V8HdM.dTS0S7eC32ubQH54j36(lTdvNeHFqTsIb9.JXn4Qf7zpnLjP5(lTdvNeHFqTsIb9.vekpFI4d1Nc4fakF));
                                break;
                            } else {
                                ((J1m0XraSkScfWFMIlTC) sA8HyHBX03d7mOB8LPJM).dDIMxZXP1V8HdM.K7eEOBPYP9VIoHWTe(lTdvNeHFqTsIb9.vIJudZvPyTuNp());
                                break;
                            }
                        }
                        while (!g7vlfxtvdwtgk.xDyLpEZyrcKVe0) {
                            g7vlfxtvdwtgk.vekpFI4d1Nc4fakF();
                            if (!g7vlfxtvdwtgk.D5P1xCAyuvgF) {
                                break;
                            } else {
                                g7vlfxtvdwtgk.dDIMxZXP1V8HdM();
                            }
                        }
                        if (g7vlfxtvdwtgk.ibVTtJUNfrGYbW != 0) {
                            int i2 = g7vlfxtvdwtgk.ibVTtJUNfrGYbW;
                            byte[] bArr2 = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
                            throw new ProtocolException("Expected continuation opcode. Got: ".concat(Integer.toHexString(i2)));
                        }
                    } else {
                        throw new IOException("closed");
                    }
                }
            }
        }
    }

    public final void JXn4Qf7zpnLjP5(String str, ks8dKkpy03zBkyez4b ks8dkkpy03zbkyez4b) {
        J1m0XraSkScfWFMIlTC j1m0XraSkScfWFMIlTC;
        mKd2cKytq1dSGgTQdn mkd2ckytq1dsggtqdn = this.JXn4Qf7zpnLjP5;
        synchronized (this) {
            try {
                this.gmNWMfvn6zlEj = str;
                this.gIIiyi2ddlMDR0 = ks8dkkpy03zbkyez4b;
                this.D5P1xCAyuvgF = new vAfoY7dO2avAiOg(ks8dkkpy03zbkyez4b.vekpFI4d1Nc4fakF, this.w9sT1Swbhx3hs, mkd2ckytq1dsggtqdn.dDIMxZXP1V8HdM, mkd2ckytq1dsggtqdn.vekpFI4d1Nc4fakF, this.Ee8d2j4S9Vm5yGuR);
                this.b1EoSIRjJHO5 = new T2DwUEsPFL03(this);
                long j = this.vekpFI4d1Nc4fakF;
                if (j != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                    j1m0XraSkScfWFMIlTC = this;
                    try {
                        this.hjneShqpF9Tis4.vekpFI4d1Nc4fakF(new jD7dMU2Tgl0TPPeOMj(str.concat(" ping"), j1m0XraSkScfWFMIlTC, nanos, 1), nanos);
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                } else {
                    j1m0XraSkScfWFMIlTC = this;
                }
                if (!j1m0XraSkScfWFMIlTC.Qrz92kRPw4GcghAc.isEmpty()) {
                    xDyLpEZyrcKVe0();
                }
                j1m0XraSkScfWFMIlTC.pyu8ovAipBTLYAiKab = new g7vlFxTvdWtgK(ks8dkkpy03zbkyez4b.w9sT1Swbhx3hs, this, mkd2ckytq1dsggtqdn.dDIMxZXP1V8HdM, mkd2ckytq1dsggtqdn.Ee8d2j4S9Vm5yGuR);
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final boolean b1EoSIRjJHO5(String str) {
        XslKUngIJyofTLpQ5 xslKUngIJyofTLpQ5 = new XslKUngIJyofTLpQ5(str.getBytes(N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM));
        xslKUngIJyofTLpQ5.JXn4Qf7zpnLjP5 = str;
        return ibVTtJUNfrGYbW(1, xslKUngIJyofTLpQ5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [char, int] */
    public final void dDIMxZXP1V8HdM(Box5SCj0ZNnLNdOqQxT box5SCj0ZNnLNdOqQxT, D9RooUzwy6gf47M9NDX d9RooUzwy6gf47M9NDX) {
        SzicGcOQovJ1JhxwfLo8 szicGcOQovJ1JhxwfLo8 = box5SCj0ZNnLNdOqQxT.ibVTtJUNfrGYbW;
        int i = box5SCj0ZNnLNdOqQxT.Ee8d2j4S9Vm5yGuR;
        ?? r3 = 57 - 18;
        if (i != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + i + ' ' + box5SCj0ZNnLNdOqQxT.JXn4Qf7zpnLjP5 + ((char) r3));
        }
        String strDDIMxZXP1V8HdM = szicGcOQovJ1JhxwfLo8.dDIMxZXP1V8HdM("Connection");
        if (strDDIMxZXP1V8HdM == null) {
            strDDIMxZXP1V8HdM = null;
        }
        if (!"Upgrade".equalsIgnoreCase(strDDIMxZXP1V8HdM)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + strDDIMxZXP1V8HdM + ((char) r3));
        }
        String strDDIMxZXP1V8HdM2 = szicGcOQovJ1JhxwfLo8.dDIMxZXP1V8HdM("Upgrade");
        if (strDDIMxZXP1V8HdM2 == null) {
            strDDIMxZXP1V8HdM2 = null;
        }
        if (!"websocket".equalsIgnoreCase(strDDIMxZXP1V8HdM2)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + strDDIMxZXP1V8HdM2 + ((char) r3));
        }
        String strDDIMxZXP1V8HdM3 = szicGcOQovJ1JhxwfLo8.dDIMxZXP1V8HdM("Sec-WebSocket-Accept");
        String str = strDDIMxZXP1V8HdM3 != null ? strDDIMxZXP1V8HdM3 : null;
        byte[] bytes = Y9mRyRdkl5FOcwb66V6.D5P1xCAyuvgF(new StringBuilder(), this.xDyLpEZyrcKVe0, "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").getBytes(N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        messageDigest.update(bytes, 0, bytes.length);
        String strDDIMxZXP1V8HdM4 = new XslKUngIJyofTLpQ5(messageDigest.digest()).dDIMxZXP1V8HdM();
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strDDIMxZXP1V8HdM4, str)) {
            if (d9RooUzwy6gf47M9NDX == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strDDIMxZXP1V8HdM4 + "' but was '" + str + ((char) r3));
    }

    public final synchronized boolean ibVTtJUNfrGYbW(int i, XslKUngIJyofTLpQ5 xslKUngIJyofTLpQ5) {
        if (!this.XiR1pIn5878vVWd && !this.J0zjQ7CAgohuxU20eCW6) {
            long j = this.nQilHWaqS401ZtR;
            byte[] bArr = xslKUngIJyofTLpQ5.w9sT1Swbhx3hs;
            if (((long) bArr.length) + j > 16777216) {
                w9sT1Swbhx3hs(null, 1001);
                return false;
            }
            this.nQilHWaqS401ZtR = j + ((long) bArr.length);
            this.Qrz92kRPw4GcghAc.add(new f142bo3i89Wqeq(i, xslKUngIJyofTLpQ5));
            xDyLpEZyrcKVe0();
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0081 A[Catch: all -> 0x008a, TRY_ENTER, TryCatch #2 {all -> 0x008a, blocks: (B:27:0x0081, B:30:0x008d, B:32:0x0094, B:33:0x009d, B:35:0x00ab, B:38:0x00af, B:39:0x00b0, B:40:0x00b1, B:42:0x00b5, B:56:0x00da, B:59:0x0100, B:61:0x010a, B:62:0x0111, B:65:0x011c, B:67:0x0120, B:76:0x0138, B:77:0x013a, B:78:0x013b, B:79:0x0144, B:57:0x00ef, B:80:0x0145, B:81:0x014a, B:64:0x0119, B:34:0x00a0), top: B:94:0x007f, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x008d A[Catch: all -> 0x008a, TryCatch #2 {all -> 0x008a, blocks: (B:27:0x0081, B:30:0x008d, B:32:0x0094, B:33:0x009d, B:35:0x00ab, B:38:0x00af, B:39:0x00b0, B:40:0x00b1, B:42:0x00b5, B:56:0x00da, B:59:0x0100, B:61:0x010a, B:62:0x0111, B:65:0x011c, B:67:0x0120, B:76:0x0138, B:77:0x013a, B:78:0x013b, B:79:0x0144, B:57:0x00ef, B:80:0x0145, B:81:0x014a, B:64:0x0119, B:34:0x00a0), top: B:94:0x007f, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0094 A[Catch: all -> 0x008a, TryCatch #2 {all -> 0x008a, blocks: (B:27:0x0081, B:30:0x008d, B:32:0x0094, B:33:0x009d, B:35:0x00ab, B:38:0x00af, B:39:0x00b0, B:40:0x00b1, B:42:0x00b5, B:56:0x00da, B:59:0x0100, B:61:0x010a, B:62:0x0111, B:65:0x011c, B:67:0x0120, B:76:0x0138, B:77:0x013a, B:78:0x013b, B:79:0x0144, B:57:0x00ef, B:80:0x0145, B:81:0x014a, B:64:0x0119, B:34:0x00a0), top: B:94:0x007f, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b1 A[Catch: all -> 0x008a, TryCatch #2 {all -> 0x008a, blocks: (B:27:0x0081, B:30:0x008d, B:32:0x0094, B:33:0x009d, B:35:0x00ab, B:38:0x00af, B:39:0x00b0, B:40:0x00b1, B:42:0x00b5, B:56:0x00da, B:59:0x0100, B:61:0x010a, B:62:0x0111, B:65:0x011c, B:67:0x0120, B:76:0x0138, B:77:0x013a, B:78:0x013b, B:79:0x0144, B:57:0x00ef, B:80:0x0145, B:81:0x014a, B:64:0x0119, B:34:0x00a0), top: B:94:0x007f, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b5 A[Catch: all -> 0x008a, TryCatch #2 {all -> 0x008a, blocks: (B:27:0x0081, B:30:0x008d, B:32:0x0094, B:33:0x009d, B:35:0x00ab, B:38:0x00af, B:39:0x00b0, B:40:0x00b1, B:42:0x00b5, B:56:0x00da, B:59:0x0100, B:61:0x010a, B:62:0x0111, B:65:0x011c, B:67:0x0120, B:76:0x0138, B:77:0x013a, B:78:0x013b, B:79:0x0144, B:57:0x00ef, B:80:0x0145, B:81:0x014a, B:64:0x0119, B:34:0x00a0), top: B:94:0x007f, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00ef A[Catch: all -> 0x008a, TryCatch #2 {all -> 0x008a, blocks: (B:27:0x0081, B:30:0x008d, B:32:0x0094, B:33:0x009d, B:35:0x00ab, B:38:0x00af, B:39:0x00b0, B:40:0x00b1, B:42:0x00b5, B:56:0x00da, B:59:0x0100, B:61:0x010a, B:62:0x0111, B:65:0x011c, B:67:0x0120, B:76:0x0138, B:77:0x013a, B:78:0x013b, B:79:0x0144, B:57:0x00ef, B:80:0x0145, B:81:0x014a, B:64:0x0119, B:34:0x00a0), top: B:94:0x007f, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0100 A[Catch: all -> 0x008a, TryCatch #2 {all -> 0x008a, blocks: (B:27:0x0081, B:30:0x008d, B:32:0x0094, B:33:0x009d, B:35:0x00ab, B:38:0x00af, B:39:0x00b0, B:40:0x00b1, B:42:0x00b5, B:56:0x00da, B:59:0x0100, B:61:0x010a, B:62:0x0111, B:65:0x011c, B:67:0x0120, B:76:0x0138, B:77:0x013a, B:78:0x013b, B:79:0x0144, B:57:0x00ef, B:80:0x0145, B:81:0x014a, B:64:0x0119, B:34:0x00a0), top: B:94:0x007f, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x010a A[Catch: all -> 0x008a, TryCatch #2 {all -> 0x008a, blocks: (B:27:0x0081, B:30:0x008d, B:32:0x0094, B:33:0x009d, B:35:0x00ab, B:38:0x00af, B:39:0x00b0, B:40:0x00b1, B:42:0x00b5, B:56:0x00da, B:59:0x0100, B:61:0x010a, B:62:0x0111, B:65:0x011c, B:67:0x0120, B:76:0x0138, B:77:0x013a, B:78:0x013b, B:79:0x0144, B:57:0x00ef, B:80:0x0145, B:81:0x014a, B:64:0x0119, B:34:0x00a0), top: B:94:0x007f, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0120 A[Catch: all -> 0x008a, TRY_LEAVE, TryCatch #2 {all -> 0x008a, blocks: (B:27:0x0081, B:30:0x008d, B:32:0x0094, B:33:0x009d, B:35:0x00ab, B:38:0x00af, B:39:0x00b0, B:40:0x00b1, B:42:0x00b5, B:56:0x00da, B:59:0x0100, B:61:0x010a, B:62:0x0111, B:65:0x011c, B:67:0x0120, B:76:0x0138, B:77:0x013a, B:78:0x013b, B:79:0x0144, B:57:0x00ef, B:80:0x0145, B:81:0x014a, B:64:0x0119, B:34:0x00a0), top: B:94:0x007f, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0127  */
    /* JADX WARN: Code duplicated, block: B:71:0x012c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0132  */
    /* JADX WARN: Code duplicated, block: B:78:0x013b A[Catch: all -> 0x008a, TryCatch #2 {all -> 0x008a, blocks: (B:27:0x0081, B:30:0x008d, B:32:0x0094, B:33:0x009d, B:35:0x00ab, B:38:0x00af, B:39:0x00b0, B:40:0x00b1, B:42:0x00b5, B:56:0x00da, B:59:0x0100, B:61:0x010a, B:62:0x0111, B:65:0x011c, B:67:0x0120, B:76:0x0138, B:77:0x013a, B:78:0x013b, B:79:0x0144, B:57:0x00ef, B:80:0x0145, B:81:0x014a, B:64:0x0119, B:34:0x00a0), top: B:94:0x007f, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0145 A[Catch: all -> 0x008a, TryCatch #2 {all -> 0x008a, blocks: (B:27:0x0081, B:30:0x008d, B:32:0x0094, B:33:0x009d, B:35:0x00ab, B:38:0x00af, B:39:0x00b0, B:40:0x00b1, B:42:0x00b5, B:56:0x00da, B:59:0x0100, B:61:0x010a, B:62:0x0111, B:65:0x011c, B:67:0x0120, B:76:0x0138, B:77:0x013a, B:78:0x013b, B:79:0x0144, B:57:0x00ef, B:80:0x0145, B:81:0x014a, B:64:0x0119, B:34:0x00a0), top: B:94:0x007f, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x00a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:57:0x00ef, please report this as an issue */
    public final boolean pyu8ovAipBTLYAiKab() {
        ks8dKkpy03zBkyez4b ks8dkkpy03zbkyez4b;
        Object objPoll;
        g7vlFxTvdWtgK g7vlfxtvdwtgk;
        Closeable closeable;
        int i;
        XslKUngIJyofTLpQ5 xslKUngIJyofTLpQ5;
        LTdvNeHFqTsIb9 lTdvNeHFqTsIb9;
        f142bo3i89Wqeq f142bo3i89wqeq;
        synchronized (this) {
            try {
                if (this.XiR1pIn5878vVWd) {
                    return false;
                }
                vAfoY7dO2avAiOg vafoy7do2avaiog = this.D5P1xCAyuvgF;
                Object objPoll2 = this.wotphlvK9sPbXJ.poll();
                String str = null;
                try {
                    if (objPoll2 == null) {
                        objPoll = this.Qrz92kRPw4GcghAc.poll();
                        if (objPoll instanceof tabSSvVGTudrStMsUD) {
                            if (this.MLSIo1htfMPWeB8V876L != -1) {
                                ks8dkkpy03zbkyez4b = this.gIIiyi2ddlMDR0;
                                this.gIIiyi2ddlMDR0 = null;
                                g7vlfxtvdwtgk = this.pyu8ovAipBTLYAiKab;
                                this.pyu8ovAipBTLYAiKab = null;
                                closeable = this.D5P1xCAyuvgF;
                                this.D5P1xCAyuvgF = null;
                                this.hjneShqpF9Tis4.Ee8d2j4S9Vm5yGuR();
                            } else {
                                this.hjneShqpF9Tis4.vekpFI4d1Nc4fakF(new T2DwUEsPFL03(this.gmNWMfvn6zlEj + " cancel", this), TimeUnit.MILLISECONDS.toNanos(60000L));
                            }
                            if (objPoll2 != null) {
                                vafoy7do2avaiog.dDIMxZXP1V8HdM(10, (XslKUngIJyofTLpQ5) objPoll2);
                            } else if (objPoll instanceof f142bo3i89Wqeq) {
                                f142bo3i89wqeq = (f142bo3i89Wqeq) objPoll;
                                vafoy7do2avaiog.vekpFI4d1Nc4fakF(f142bo3i89wqeq.dDIMxZXP1V8HdM, f142bo3i89wqeq.w9sT1Swbhx3hs);
                                synchronized (this) {
                                    this.nQilHWaqS401ZtR -= (long) f142bo3i89wqeq.w9sT1Swbhx3hs.w9sT1Swbhx3hs.length;
                                }
                            } else {
                                if (objPoll instanceof tabSSvVGTudrStMsUD) {
                                    throw new AssertionError();
                                }
                                tabSSvVGTudrStMsUD tabssvvgtudrstmsud = (tabSSvVGTudrStMsUD) objPoll;
                                i = tabssvvgtudrstmsud.dDIMxZXP1V8HdM;
                                xslKUngIJyofTLpQ5 = tabssvvgtudrstmsud.w9sT1Swbhx3hs;
                                vafoy7do2avaiog.getClass();
                                if (i >= 1000 || i >= 5000) {
                                    str = "Code must be in range [1000,5000): " + i;
                                } else if ((1004 <= i && i < 1007) || (1015 <= i && i < 3000)) {
                                    str = "Code " + i + " is reserved and may not be used.";
                                }
                                if (str == null) {
                                    throw new IllegalArgumentException(str.toString());
                                }
                                lTdvNeHFqTsIb9 = new LTdvNeHFqTsIb9();
                                lTdvNeHFqTsIb9.hV4VTKNUdeHN(i);
                                if (xslKUngIJyofTLpQ5 != null) {
                                    xslKUngIJyofTLpQ5.gmNWMfvn6zlEj(lTdvNeHFqTsIb9, xslKUngIJyofTLpQ5.vekpFI4d1Nc4fakF());
                                }
                                try {
                                    vafoy7do2avaiog.dDIMxZXP1V8HdM(8, lTdvNeHFqTsIb9.JXn4Qf7zpnLjP5(lTdvNeHFqTsIb9.vekpFI4d1Nc4fakF));
                                    vafoy7do2avaiog.pyu8ovAipBTLYAiKab = true;
                                    if (ks8dkkpy03zbkyez4b != null) {
                                        this.dDIMxZXP1V8HdM.H9XlUr4OeMJFiXK();
                                    }
                                } catch (Throwable th) {
                                    vafoy7do2avaiog.pyu8ovAipBTLYAiKab = true;
                                    throw th;
                                }
                            }
                            if (ks8dkkpy03zbkyez4b != null) {
                                yrMnf4fyLGfIJbMg8IbG.vekpFI4d1Nc4fakF(ks8dkkpy03zbkyez4b);
                            }
                            if (g7vlfxtvdwtgk != null) {
                                yrMnf4fyLGfIJbMg8IbG.vekpFI4d1Nc4fakF(g7vlfxtvdwtgk);
                            }
                            if (closeable != null) {
                                yrMnf4fyLGfIJbMg8IbG.vekpFI4d1Nc4fakF(closeable);
                            }
                            return true;
                        }
                        if (objPoll == null) {
                            return false;
                        }
                        ks8dkkpy03zbkyez4b = null;
                        g7vlfxtvdwtgk = null;
                    } else {
                        ks8dkkpy03zbkyez4b = null;
                        objPoll = null;
                        g7vlfxtvdwtgk = null;
                    }
                    if (objPoll2 != null) {
                        vafoy7do2avaiog.dDIMxZXP1V8HdM(10, (XslKUngIJyofTLpQ5) objPoll2);
                    } else if (objPoll instanceof f142bo3i89Wqeq) {
                        f142bo3i89wqeq = (f142bo3i89Wqeq) objPoll;
                        vafoy7do2avaiog.vekpFI4d1Nc4fakF(f142bo3i89wqeq.dDIMxZXP1V8HdM, f142bo3i89wqeq.w9sT1Swbhx3hs);
                        synchronized (this) {
                            this.nQilHWaqS401ZtR -= (long) f142bo3i89wqeq.w9sT1Swbhx3hs.w9sT1Swbhx3hs.length;
                        }
                    } else {
                        if (objPoll instanceof tabSSvVGTudrStMsUD) {
                            throw new AssertionError();
                        }
                        tabSSvVGTudrStMsUD tabssvvgtudrstmsud2 = (tabSSvVGTudrStMsUD) objPoll;
                        i = tabssvvgtudrstmsud2.dDIMxZXP1V8HdM;
                        xslKUngIJyofTLpQ5 = tabssvvgtudrstmsud2.w9sT1Swbhx3hs;
                        vafoy7do2avaiog.getClass();
                        if (i >= 1000) {
                            str = "Code must be in range [1000,5000): " + i;
                        } else {
                            str = "Code must be in range [1000,5000): " + i;
                        }
                        if (str == null) {
                            throw new IllegalArgumentException(str.toString());
                        }
                        lTdvNeHFqTsIb9 = new LTdvNeHFqTsIb9();
                        lTdvNeHFqTsIb9.hV4VTKNUdeHN(i);
                        if (xslKUngIJyofTLpQ5 != null) {
                            xslKUngIJyofTLpQ5.gmNWMfvn6zlEj(lTdvNeHFqTsIb9, xslKUngIJyofTLpQ5.vekpFI4d1Nc4fakF());
                        }
                        vafoy7do2avaiog.dDIMxZXP1V8HdM(8, lTdvNeHFqTsIb9.JXn4Qf7zpnLjP5(lTdvNeHFqTsIb9.vekpFI4d1Nc4fakF));
                        vafoy7do2avaiog.pyu8ovAipBTLYAiKab = true;
                        if (ks8dkkpy03zbkyez4b != null) {
                            this.dDIMxZXP1V8HdM.H9XlUr4OeMJFiXK();
                        }
                    }
                    if (ks8dkkpy03zbkyez4b != null) {
                        yrMnf4fyLGfIJbMg8IbG.vekpFI4d1Nc4fakF(ks8dkkpy03zbkyez4b);
                    }
                    if (g7vlfxtvdwtgk != null) {
                        yrMnf4fyLGfIJbMg8IbG.vekpFI4d1Nc4fakF(g7vlfxtvdwtgk);
                    }
                    if (closeable != null) {
                        yrMnf4fyLGfIJbMg8IbG.vekpFI4d1Nc4fakF(closeable);
                    }
                    return true;
                } catch (Throwable th2) {
                    if (ks8dkkpy03zbkyez4b != null) {
                        yrMnf4fyLGfIJbMg8IbG.vekpFI4d1Nc4fakF(ks8dkkpy03zbkyez4b);
                    }
                    if (g7vlfxtvdwtgk != null) {
                        yrMnf4fyLGfIJbMg8IbG.vekpFI4d1Nc4fakF(g7vlfxtvdwtgk);
                    }
                    if (closeable != null) {
                        yrMnf4fyLGfIJbMg8IbG.vekpFI4d1Nc4fakF(closeable);
                    }
                    throw th2;
                }
                closeable = g7vlfxtvdwtgk;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void vekpFI4d1Nc4fakF(Exception exc, Box5SCj0ZNnLNdOqQxT box5SCj0ZNnLNdOqQxT) {
        synchronized (this) {
            if (this.XiR1pIn5878vVWd) {
                return;
            }
            this.XiR1pIn5878vVWd = true;
            ks8dKkpy03zBkyez4b ks8dkkpy03zbkyez4b = this.gIIiyi2ddlMDR0;
            this.gIIiyi2ddlMDR0 = null;
            g7vlFxTvdWtgK g7vlfxtvdwtgk = this.pyu8ovAipBTLYAiKab;
            this.pyu8ovAipBTLYAiKab = null;
            vAfoY7dO2avAiOg vafoy7do2avaiog = this.D5P1xCAyuvgF;
            this.D5P1xCAyuvgF = null;
            this.hjneShqpF9Tis4.Ee8d2j4S9Vm5yGuR();
            try {
                this.dDIMxZXP1V8HdM.l1V0lQr6TbwNKqHfXNbb(exc);
            } finally {
                if (ks8dkkpy03zbkyez4b != null) {
                    yrMnf4fyLGfIJbMg8IbG.vekpFI4d1Nc4fakF(ks8dkkpy03zbkyez4b);
                }
                if (g7vlfxtvdwtgk != null) {
                    yrMnf4fyLGfIJbMg8IbG.vekpFI4d1Nc4fakF(g7vlfxtvdwtgk);
                }
                if (vafoy7do2avaiog != null) {
                    yrMnf4fyLGfIJbMg8IbG.vekpFI4d1Nc4fakF(vafoy7do2avaiog);
                }
            }
        }
    }

    public final boolean w9sT1Swbhx3hs(String str, int i) {
        String str2;
        synchronized (this) {
            XslKUngIJyofTLpQ5 xslKUngIJyofTLpQ5 = null;
            try {
                if (i < 1000 || i >= 5000) {
                    str2 = "Code must be in range [1000,5000): " + i;
                } else if ((1004 > i || i >= 1007) && (1015 > i || i >= 3000)) {
                    str2 = null;
                } else {
                    str2 = "Code " + i + " is reserved and may not be used.";
                }
                if (str2 != null) {
                    throw new IllegalArgumentException(str2.toString());
                }
                if (str != null) {
                    byte[] bytes = str.getBytes(N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM);
                    xslKUngIJyofTLpQ5 = new XslKUngIJyofTLpQ5(bytes);
                    xslKUngIJyofTLpQ5.JXn4Qf7zpnLjP5 = str;
                    if (bytes.length > 123) {
                        throw new IllegalArgumentException("reason.size() > 123: ".concat(str).toString());
                    }
                }
                if (!this.XiR1pIn5878vVWd && !this.J0zjQ7CAgohuxU20eCW6) {
                    this.J0zjQ7CAgohuxU20eCW6 = true;
                    this.Qrz92kRPw4GcghAc.add(new tabSSvVGTudrStMsUD(i, xslKUngIJyofTLpQ5));
                    xDyLpEZyrcKVe0();
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void xDyLpEZyrcKVe0() {
        byte[] bArr = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
        T2DwUEsPFL03 t2DwUEsPFL03 = this.b1EoSIRjJHO5;
        if (t2DwUEsPFL03 != null) {
            this.hjneShqpF9Tis4.vekpFI4d1Nc4fakF(t2DwUEsPFL03, 0L);
        }
    }
}
