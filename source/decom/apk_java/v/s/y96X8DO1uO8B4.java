package v.s;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class y96X8DO1uO8B4 implements Ftk7acqAlBdS {
    public final B62d1BWQ36VxGmXU Ee8d2j4S9Vm5yGuR;
    public volatile Eruqtn8YZhu5 JXn4Qf7zpnLjP5;
    public final zfPdbqrCOkdxWPAv dDIMxZXP1V8HdM;
    public final Ksynl03UBrEMVM80NQ vekpFI4d1Nc4fakF;
    public final h5bWEMI2dN1jRNFWXg7 w9sT1Swbhx3hs;
    public volatile boolean xDyLpEZyrcKVe0;
    public static final List ibVTtJUNfrGYbW = yrMnf4fyLGfIJbMg8IbG.hjneShqpF9Tis4("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List b1EoSIRjJHO5 = yrMnf4fyLGfIJbMg8IbG.hjneShqpF9Tis4("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    public y96X8DO1uO8B4(sp6apkX00TawY02qGY6r sp6apkx00tawy02qgy6r, zfPdbqrCOkdxWPAv zfpdbqrcokdxwpav, h5bWEMI2dN1jRNFWXg7 h5bwemi2dn1jrnfwxg7, Ksynl03UBrEMVM80NQ ksynl03UBrEMVM80NQ) {
        this.dDIMxZXP1V8HdM = zfpdbqrcokdxwpav;
        this.w9sT1Swbhx3hs = h5bwemi2dn1jrnfwxg7;
        this.vekpFI4d1Nc4fakF = ksynl03UBrEMVM80NQ;
        List list = sp6apkx00tawy02qgy6r.XiR1pIn5878vVWd;
        B62d1BWQ36VxGmXU b62d1BWQ36VxGmXU = B62d1BWQ36VxGmXU.H2_PRIOR_KNOWLEDGE;
        this.Ee8d2j4S9Vm5yGuR = list.contains(b62d1BWQ36VxGmXU) ? b62d1BWQ36VxGmXU : B62d1BWQ36VxGmXU.HTTP_2;
    }

    private static /* synthetic */ void aloeroszq() {
    }

    @Override // v.s.Ftk7acqAlBdS
    public final nj8JtA7VVVuzq Ee8d2j4S9Vm5yGuR(Box5SCj0ZNnLNdOqQxT box5SCj0ZNnLNdOqQxT) {
        return this.JXn4Qf7zpnLjP5.pyu8ovAipBTLYAiKab;
    }

    @Override // v.s.Ftk7acqAlBdS
    public final void JXn4Qf7zpnLjP5() {
        this.vekpFI4d1Nc4fakF.flush();
    }

    @Override // v.s.Ftk7acqAlBdS
    public final void cancel() {
        this.xDyLpEZyrcKVe0 = true;
        Eruqtn8YZhu5 eruqtn8YZhu5 = this.JXn4Qf7zpnLjP5;
        if (eruqtn8YZhu5 != null) {
            eruqtn8YZhu5.Ee8d2j4S9Vm5yGuR(9);
        }
    }

    @Override // v.s.Ftk7acqAlBdS
    public final void dDIMxZXP1V8HdM(iniVyKd0OGb2raI4 inivykd0ogb2rai4) throws IOException {
        int i;
        Eruqtn8YZhu5 eruqtn8YZhu5;
        if (this.JXn4Qf7zpnLjP5 != null) {
            return;
        }
        inivykd0ogb2rai4.getClass();
        SzicGcOQovJ1JhxwfLo8 szicGcOQovJ1JhxwfLo8 = (SzicGcOQovJ1JhxwfLo8) inivykd0ogb2rai4.Ee8d2j4S9Vm5yGuR;
        ArrayList arrayList = new ArrayList(szicGcOQovJ1JhxwfLo8.size() + 4);
        arrayList.add(new RSjkliukrZnQXjh(RSjkliukrZnQXjh.xDyLpEZyrcKVe0, (String) inivykd0ogb2rai4.JXn4Qf7zpnLjP5));
        XslKUngIJyofTLpQ5 xslKUngIJyofTLpQ5 = RSjkliukrZnQXjh.ibVTtJUNfrGYbW;
        xc6AKez33c65zO xc6akez33c65zo = (xc6AKez33c65zO) inivykd0ogb2rai4.vekpFI4d1Nc4fakF;
        String strW9sT1Swbhx3hs = xc6akez33c65zo.w9sT1Swbhx3hs();
        String strJXn4Qf7zpnLjP5 = xc6akez33c65zo.JXn4Qf7zpnLjP5();
        if (strJXn4Qf7zpnLjP5 != null) {
            strW9sT1Swbhx3hs = strW9sT1Swbhx3hs + '?' + strJXn4Qf7zpnLjP5;
        }
        arrayList.add(new RSjkliukrZnQXjh(xslKUngIJyofTLpQ5, strW9sT1Swbhx3hs));
        String strDDIMxZXP1V8HdM = szicGcOQovJ1JhxwfLo8.dDIMxZXP1V8HdM("Host");
        if (strDDIMxZXP1V8HdM != null) {
            arrayList.add(new RSjkliukrZnQXjh(RSjkliukrZnQXjh.pyu8ovAipBTLYAiKab, strDDIMxZXP1V8HdM));
        }
        arrayList.add(new RSjkliukrZnQXjh(RSjkliukrZnQXjh.b1EoSIRjJHO5, xc6akez33c65zo.dDIMxZXP1V8HdM));
        int size = szicGcOQovJ1JhxwfLo8.size();
        for (int i2 = 0; i2 < size; i2++) {
            String lowerCase = szicGcOQovJ1JhxwfLo8.w9sT1Swbhx3hs(i2).toLowerCase(Locale.US);
            if (!ibVTtJUNfrGYbW.contains(lowerCase) || (lowerCase.equals("te") && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(szicGcOQovJ1JhxwfLo8.JXn4Qf7zpnLjP5(i2), "trailers"))) {
                arrayList.add(new RSjkliukrZnQXjh(lowerCase, szicGcOQovJ1JhxwfLo8.JXn4Qf7zpnLjP5(i2)));
            }
        }
        Ksynl03UBrEMVM80NQ ksynl03UBrEMVM80NQ = this.vekpFI4d1Nc4fakF;
        boolean z = !false;
        synchronized (ksynl03UBrEMVM80NQ.EWUjsTERgdPbSw3NNlN) {
            synchronized (ksynl03UBrEMVM80NQ) {
                try {
                    if (ksynl03UBrEMVM80NQ.xDyLpEZyrcKVe0 > 1073741823) {
                        ksynl03UBrEMVM80NQ.hjneShqpF9Tis4(8);
                    }
                    if (ksynl03UBrEMVM80NQ.ibVTtJUNfrGYbW) {
                        throw new oD54hfY99k9U();
                    }
                    i = ksynl03UBrEMVM80NQ.xDyLpEZyrcKVe0;
                    ksynl03UBrEMVM80NQ.xDyLpEZyrcKVe0 = i + 2;
                    eruqtn8YZhu5 = new Eruqtn8YZhu5(i, ksynl03UBrEMVM80NQ, z, false, null);
                    if (eruqtn8YZhu5.ibVTtJUNfrGYbW()) {
                        ksynl03UBrEMVM80NQ.vekpFI4d1Nc4fakF.put(Integer.valueOf(i), eruqtn8YZhu5);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ksynl03UBrEMVM80NQ.EWUjsTERgdPbSw3NNlN.Qrz92kRPw4GcghAc(z, i, arrayList);
        }
        ksynl03UBrEMVM80NQ.EWUjsTERgdPbSw3NNlN.flush();
        this.JXn4Qf7zpnLjP5 = eruqtn8YZhu5;
        if (this.xDyLpEZyrcKVe0) {
            this.JXn4Qf7zpnLjP5.Ee8d2j4S9Vm5yGuR(9);
            throw new IOException("Canceled");
        }
        lGJOCtgOpmH2 lgjoctgopmh2 = this.JXn4Qf7zpnLjP5.hjneShqpF9Tis4;
        long j = this.w9sT1Swbhx3hs.ibVTtJUNfrGYbW;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        lgjoctgopmh2.ibVTtJUNfrGYbW(j, timeUnit);
        this.JXn4Qf7zpnLjP5.gmNWMfvn6zlEj.ibVTtJUNfrGYbW(this.w9sT1Swbhx3hs.b1EoSIRjJHO5, timeUnit);
    }

    @Override // v.s.Ftk7acqAlBdS
    public final zfPdbqrCOkdxWPAv ibVTtJUNfrGYbW() {
        return this.dDIMxZXP1V8HdM;
    }

    @Override // v.s.Ftk7acqAlBdS
    public final void vekpFI4d1Nc4fakF() {
        Eruqtn8YZhu5 eruqtn8YZhu5 = this.JXn4Qf7zpnLjP5;
        synchronized (eruqtn8YZhu5) {
            if (!eruqtn8YZhu5.b1EoSIRjJHO5 && !eruqtn8YZhu5.xDyLpEZyrcKVe0()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        eruqtn8YZhu5.D5P1xCAyuvgF.close();
    }

    @Override // v.s.Ftk7acqAlBdS
    public final long w9sT1Swbhx3hs(Box5SCj0ZNnLNdOqQxT box5SCj0ZNnLNdOqQxT) {
        if (Bsr8WAhbbWJl.dDIMxZXP1V8HdM(box5SCj0ZNnLNdOqQxT)) {
            return yrMnf4fyLGfIJbMg8IbG.D5P1xCAyuvgF(box5SCj0ZNnLNdOqQxT);
        }
        return 0L;
    }

    @Override // v.s.Ftk7acqAlBdS
    public final OHTCdIMQ8dDzHn2uIc xDyLpEZyrcKVe0(boolean z) throws IOException {
        SzicGcOQovJ1JhxwfLo8 szicGcOQovJ1JhxwfLo8;
        Eruqtn8YZhu5 eruqtn8YZhu5 = this.JXn4Qf7zpnLjP5;
        if (eruqtn8YZhu5 == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (eruqtn8YZhu5) {
            eruqtn8YZhu5.hjneShqpF9Tis4.pyu8ovAipBTLYAiKab();
            while (eruqtn8YZhu5.ibVTtJUNfrGYbW.isEmpty() && eruqtn8YZhu5.gIIiyi2ddlMDR0 == 0) {
                try {
                    try {
                        eruqtn8YZhu5.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    eruqtn8YZhu5.hjneShqpF9Tis4.gmNWMfvn6zlEj();
                    throw th;
                }
            }
            eruqtn8YZhu5.hjneShqpF9Tis4.gmNWMfvn6zlEj();
            if (eruqtn8YZhu5.ibVTtJUNfrGYbW.isEmpty()) {
                IOException iOException = eruqtn8YZhu5.wotphlvK9sPbXJ;
                if (iOException != null) {
                    throw iOException;
                }
                throw new qdSbSo4AtinS0kmNwf(eruqtn8YZhu5.gIIiyi2ddlMDR0);
            }
            szicGcOQovJ1JhxwfLo8 = (SzicGcOQovJ1JhxwfLo8) eruqtn8YZhu5.ibVTtJUNfrGYbW.removeFirst();
        }
        B62d1BWQ36VxGmXU b62d1BWQ36VxGmXU = this.Ee8d2j4S9Vm5yGuR;
        ArrayList arrayList = new ArrayList(20);
        int size = szicGcOQovJ1JhxwfLo8.size();
        sfr0Aaw8vBbkmexjHdWK sfr0aaw8vbbkmexjhdwkXiR1pIn5878vVWd = null;
        for (int i = 0; i < size; i++) {
            String strW9sT1Swbhx3hs = szicGcOQovJ1JhxwfLo8.w9sT1Swbhx3hs(i);
            String strJXn4Qf7zpnLjP5 = szicGcOQovJ1JhxwfLo8.JXn4Qf7zpnLjP5(i);
            if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strW9sT1Swbhx3hs, ":status")) {
                sfr0aaw8vbbkmexjhdwkXiR1pIn5878vVWd = jb8et6SZeK5TWMrJFxDX.XiR1pIn5878vVWd("HTTP/1.1 " + strJXn4Qf7zpnLjP5);
            } else if (!b1EoSIRjJHO5.contains(strW9sT1Swbhx3hs)) {
                arrayList.add(strW9sT1Swbhx3hs);
                arrayList.add(KgSM0TsKUpCiuePB.uW0IRoPBZMj2QmBkkp(strJXn4Qf7zpnLjP5).toString());
            }
        }
        if (sfr0aaw8vbbkmexjhdwkXiR1pIn5878vVWd == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        OHTCdIMQ8dDzHn2uIc oHTCdIMQ8dDzHn2uIc = new OHTCdIMQ8dDzHn2uIc();
        oHTCdIMQ8dDzHn2uIc.w9sT1Swbhx3hs = b62d1BWQ36VxGmXU;
        oHTCdIMQ8dDzHn2uIc.vekpFI4d1Nc4fakF = sfr0aaw8vbbkmexjhdwkXiR1pIn5878vVWd.w9sT1Swbhx3hs;
        oHTCdIMQ8dDzHn2uIc.JXn4Qf7zpnLjP5 = (String) sfr0aaw8vbbkmexjhdwkXiR1pIn5878vVWd.vekpFI4d1Nc4fakF;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c = new r5XEUfod5GSCCwq6c(11);
        ((ArrayList) r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF).addAll(Arrays.asList(strArr));
        oHTCdIMQ8dDzHn2uIc.xDyLpEZyrcKVe0 = r5xeufod5gsccwq6c;
        if (z && oHTCdIMQ8dDzHn2uIc.vekpFI4d1Nc4fakF == 100) {
            return null;
        }
        return oHTCdIMQ8dDzHn2uIc;
    }
}
