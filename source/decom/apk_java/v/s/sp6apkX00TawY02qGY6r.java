package v.s;

import java.net.ProtocolException;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class sp6apkX00TawY02qGY6r implements Cloneable {
    public static final List O2DHNSIGZlgPja7eqLgn = yrMnf4fyLGfIJbMg8IbG.hjneShqpF9Tis4(B62d1BWQ36VxGmXU.HTTP_2, B62d1BWQ36VxGmXU.HTTP_1_1);
    public static final List xfn2GJwmGqs7kWW = yrMnf4fyLGfIJbMg8IbG.hjneShqpF9Tis4(OSOlo3oGIKrMzEnWP.Ee8d2j4S9Vm5yGuR, OSOlo3oGIKrMzEnWP.xDyLpEZyrcKVe0);
    public final boolean D5P1xCAyuvgF;
    public final O9Ad3O0crmyhDHMF DVTNwpDEVsUKuznof;
    public final int EWUjsTERgdPbSw3NNlN;
    public final List Ee8d2j4S9Vm5yGuR;
    public final HostnameVerifier H9XlUr4OeMJFiXK;
    public final X509TrustManager J0zjQ7CAgohuxU20eCW6;
    public final List JXn4Qf7zpnLjP5;
    public final int K7eEOBPYP9VIoHWTe;
    public final List MLSIo1htfMPWeB8V876L;
    public final SocketFactory Qrz92kRPw4GcghAc;
    public final List XiR1pIn5878vVWd;
    public final fEyMFFyOOvHURJ7To6L b1EoSIRjJHO5;
    public final int dTS0S7eC32ubQH54j36;
    public final ProxySelector gIIiyi2ddlMDR0;
    public final fadfsJa4iEdiwEC4Xm8 gmNWMfvn6zlEj;
    public final fadfsJa4iEdiwEC4Xm8 hjneShqpF9Tis4;
    public final boolean ibVTtJUNfrGYbW;
    public final FZ1sl4mHq4J0hOEYC l1V0lQr6TbwNKqHfXNbb;
    public final SSLSocketFactory nQilHWaqS401ZtR;
    public final boolean pyu8ovAipBTLYAiKab;
    public final r5XEUfod5GSCCwq6c rCHnHJBAlOpNI5;
    public final long vIJudZvPyTuNp;
    public final r5XEUfod5GSCCwq6c vekpFI4d1Nc4fakF;
    public final fUH025aw0Rgl w9sT1Swbhx3hs;
    public final fEyMFFyOOvHURJ7To6L wotphlvK9sPbXJ;
    public final UeVBYgBvSKYfVuXLhMs xDyLpEZyrcKVe0;
    public final int yTljMGnIibTRdOpSh4;

    public sp6apkX00TawY02qGY6r(Vb7X6LE0p9sZh vb7X6LE0p9sZh) throws NoSuchAlgorithmException, KeyStoreException {
        this.w9sT1Swbhx3hs = vb7X6LE0p9sZh.dDIMxZXP1V8HdM;
        this.vekpFI4d1Nc4fakF = vb7X6LE0p9sZh.w9sT1Swbhx3hs;
        this.JXn4Qf7zpnLjP5 = Collections.unmodifiableList(new ArrayList(vb7X6LE0p9sZh.vekpFI4d1Nc4fakF));
        this.Ee8d2j4S9Vm5yGuR = Collections.unmodifiableList(new ArrayList(vb7X6LE0p9sZh.JXn4Qf7zpnLjP5));
        this.xDyLpEZyrcKVe0 = vb7X6LE0p9sZh.Ee8d2j4S9Vm5yGuR;
        this.ibVTtJUNfrGYbW = vb7X6LE0p9sZh.xDyLpEZyrcKVe0;
        this.b1EoSIRjJHO5 = vb7X6LE0p9sZh.ibVTtJUNfrGYbW;
        this.pyu8ovAipBTLYAiKab = vb7X6LE0p9sZh.b1EoSIRjJHO5;
        this.D5P1xCAyuvgF = vb7X6LE0p9sZh.pyu8ovAipBTLYAiKab;
        this.hjneShqpF9Tis4 = vb7X6LE0p9sZh.D5P1xCAyuvgF;
        this.gmNWMfvn6zlEj = vb7X6LE0p9sZh.hjneShqpF9Tis4;
        ProxySelector proxySelector = vb7X6LE0p9sZh.gmNWMfvn6zlEj;
        proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
        this.gIIiyi2ddlMDR0 = proxySelector == null ? MKinvHBhr4g4cw0wYvNo.dDIMxZXP1V8HdM : proxySelector;
        this.wotphlvK9sPbXJ = vb7X6LE0p9sZh.gIIiyi2ddlMDR0;
        this.Qrz92kRPw4GcghAc = vb7X6LE0p9sZh.wotphlvK9sPbXJ;
        List list = vb7X6LE0p9sZh.J0zjQ7CAgohuxU20eCW6;
        this.MLSIo1htfMPWeB8V876L = list;
        this.XiR1pIn5878vVWd = vb7X6LE0p9sZh.MLSIo1htfMPWeB8V876L;
        this.H9XlUr4OeMJFiXK = vb7X6LE0p9sZh.XiR1pIn5878vVWd;
        this.K7eEOBPYP9VIoHWTe = vb7X6LE0p9sZh.l1V0lQr6TbwNKqHfXNbb;
        this.dTS0S7eC32ubQH54j36 = vb7X6LE0p9sZh.K7eEOBPYP9VIoHWTe;
        this.EWUjsTERgdPbSw3NNlN = vb7X6LE0p9sZh.dTS0S7eC32ubQH54j36;
        this.yTljMGnIibTRdOpSh4 = vb7X6LE0p9sZh.EWUjsTERgdPbSw3NNlN;
        this.vIJudZvPyTuNp = vb7X6LE0p9sZh.yTljMGnIibTRdOpSh4;
        r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c = vb7X6LE0p9sZh.vIJudZvPyTuNp;
        this.rCHnHJBAlOpNI5 = r5xeufod5gsccwq6c == null ? new r5XEUfod5GSCCwq6c(18) : r5xeufod5gsccwq6c;
        if (list != null && list.isEmpty()) {
            this.nQilHWaqS401ZtR = null;
            this.l1V0lQr6TbwNKqHfXNbb = null;
            this.J0zjQ7CAgohuxU20eCW6 = null;
            this.DVTNwpDEVsUKuznof = O9Ad3O0crmyhDHMF.vekpFI4d1Nc4fakF;
            break;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                this.nQilHWaqS401ZtR = null;
                this.l1V0lQr6TbwNKqHfXNbb = null;
                this.J0zjQ7CAgohuxU20eCW6 = null;
                this.DVTNwpDEVsUKuznof = O9Ad3O0crmyhDHMF.vekpFI4d1Nc4fakF;
                break;
            }
            if (((OSOlo3oGIKrMzEnWP) it.next()).dDIMxZXP1V8HdM) {
                SSLSocketFactory sSLSocketFactory = vb7X6LE0p9sZh.Qrz92kRPw4GcghAc;
                if (sSLSocketFactory == null) {
                    QnMItFgHCjZ1bOS qnMItFgHCjZ1bOS = QnMItFgHCjZ1bOS.dDIMxZXP1V8HdM;
                    X509TrustManager x509TrustManagerGIIiyi2ddlMDR0 = QnMItFgHCjZ1bOS.dDIMxZXP1V8HdM.gIIiyi2ddlMDR0();
                    this.J0zjQ7CAgohuxU20eCW6 = x509TrustManagerGIIiyi2ddlMDR0;
                    this.nQilHWaqS401ZtR = QnMItFgHCjZ1bOS.dDIMxZXP1V8HdM.gmNWMfvn6zlEj(x509TrustManagerGIIiyi2ddlMDR0);
                    FZ1sl4mHq4J0hOEYC fZ1sl4mHq4J0hOEYCW9sT1Swbhx3hs = QnMItFgHCjZ1bOS.dDIMxZXP1V8HdM.w9sT1Swbhx3hs(x509TrustManagerGIIiyi2ddlMDR0);
                    this.l1V0lQr6TbwNKqHfXNbb = fZ1sl4mHq4J0hOEYCW9sT1Swbhx3hs;
                    O9Ad3O0crmyhDHMF o9Ad3O0crmyhDHMF = vb7X6LE0p9sZh.H9XlUr4OeMJFiXK;
                    this.DVTNwpDEVsUKuznof = okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(o9Ad3O0crmyhDHMF.w9sT1Swbhx3hs, fZ1sl4mHq4J0hOEYCW9sT1Swbhx3hs) ? o9Ad3O0crmyhDHMF : new O9Ad3O0crmyhDHMF(o9Ad3O0crmyhDHMF.dDIMxZXP1V8HdM, fZ1sl4mHq4J0hOEYCW9sT1Swbhx3hs);
                    break;
                }
                this.nQilHWaqS401ZtR = sSLSocketFactory;
                FZ1sl4mHq4J0hOEYC fZ1sl4mHq4J0hOEYC = vb7X6LE0p9sZh.DVTNwpDEVsUKuznof;
                this.l1V0lQr6TbwNKqHfXNbb = fZ1sl4mHq4J0hOEYC;
                this.J0zjQ7CAgohuxU20eCW6 = vb7X6LE0p9sZh.nQilHWaqS401ZtR;
                O9Ad3O0crmyhDHMF o9Ad3O0crmyhDHMF2 = vb7X6LE0p9sZh.H9XlUr4OeMJFiXK;
                this.DVTNwpDEVsUKuznof = okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(o9Ad3O0crmyhDHMF2.w9sT1Swbhx3hs, fZ1sl4mHq4J0hOEYC) ? o9Ad3O0crmyhDHMF2 : new O9Ad3O0crmyhDHMF(o9Ad3O0crmyhDHMF2.dDIMxZXP1V8HdM, fZ1sl4mHq4J0hOEYC);
                break;
            }
        }
        X509TrustManager x509TrustManager = this.J0zjQ7CAgohuxU20eCW6;
        FZ1sl4mHq4J0hOEYC fZ1sl4mHq4J0hOEYC2 = this.l1V0lQr6TbwNKqHfXNbb;
        SSLSocketFactory sSLSocketFactory2 = this.nQilHWaqS401ZtR;
        List list2 = this.Ee8d2j4S9Vm5yGuR;
        List list3 = this.JXn4Qf7zpnLjP5;
        if (list3.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + list3).toString());
        }
        if (list2.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + list2).toString());
        }
        List list4 = this.MLSIo1htfMPWeB8V876L;
        if (list4 == null || !list4.isEmpty()) {
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                if (((OSOlo3oGIKrMzEnWP) it2.next()).dDIMxZXP1V8HdM) {
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (fZ1sl4mHq4J0hOEYC2 == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (x509TrustManager == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (sSLSocketFactory2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (fZ1sl4mHq4J0hOEYC2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (x509TrustManager != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.DVTNwpDEVsUKuznof, O9Ad3O0crmyhDHMF.vekpFI4d1Nc4fakF)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    private static /* synthetic */ void wpzypkmnsv() {
    }

    public final Object clone() {
        return super.clone();
    }

    public final Vb7X6LE0p9sZh dDIMxZXP1V8HdM() {
        Vb7X6LE0p9sZh vb7X6LE0p9sZh = new Vb7X6LE0p9sZh();
        vb7X6LE0p9sZh.dDIMxZXP1V8HdM = this.w9sT1Swbhx3hs;
        vb7X6LE0p9sZh.w9sT1Swbhx3hs = this.vekpFI4d1Nc4fakF;
        O0DzWbzyYI2BykPDCod.tne6mXOUFKdd(vb7X6LE0p9sZh.vekpFI4d1Nc4fakF, this.JXn4Qf7zpnLjP5);
        O0DzWbzyYI2BykPDCod.tne6mXOUFKdd(vb7X6LE0p9sZh.JXn4Qf7zpnLjP5, this.Ee8d2j4S9Vm5yGuR);
        vb7X6LE0p9sZh.Ee8d2j4S9Vm5yGuR = this.xDyLpEZyrcKVe0;
        vb7X6LE0p9sZh.xDyLpEZyrcKVe0 = this.ibVTtJUNfrGYbW;
        vb7X6LE0p9sZh.ibVTtJUNfrGYbW = this.b1EoSIRjJHO5;
        vb7X6LE0p9sZh.b1EoSIRjJHO5 = this.pyu8ovAipBTLYAiKab;
        vb7X6LE0p9sZh.pyu8ovAipBTLYAiKab = this.D5P1xCAyuvgF;
        vb7X6LE0p9sZh.D5P1xCAyuvgF = this.hjneShqpF9Tis4;
        vb7X6LE0p9sZh.hjneShqpF9Tis4 = this.gmNWMfvn6zlEj;
        vb7X6LE0p9sZh.gmNWMfvn6zlEj = this.gIIiyi2ddlMDR0;
        vb7X6LE0p9sZh.gIIiyi2ddlMDR0 = this.wotphlvK9sPbXJ;
        vb7X6LE0p9sZh.wotphlvK9sPbXJ = this.Qrz92kRPw4GcghAc;
        vb7X6LE0p9sZh.Qrz92kRPw4GcghAc = this.nQilHWaqS401ZtR;
        vb7X6LE0p9sZh.nQilHWaqS401ZtR = this.J0zjQ7CAgohuxU20eCW6;
        vb7X6LE0p9sZh.J0zjQ7CAgohuxU20eCW6 = this.MLSIo1htfMPWeB8V876L;
        vb7X6LE0p9sZh.MLSIo1htfMPWeB8V876L = this.XiR1pIn5878vVWd;
        vb7X6LE0p9sZh.XiR1pIn5878vVWd = this.H9XlUr4OeMJFiXK;
        vb7X6LE0p9sZh.H9XlUr4OeMJFiXK = this.DVTNwpDEVsUKuznof;
        vb7X6LE0p9sZh.DVTNwpDEVsUKuznof = this.l1V0lQr6TbwNKqHfXNbb;
        vb7X6LE0p9sZh.l1V0lQr6TbwNKqHfXNbb = this.K7eEOBPYP9VIoHWTe;
        vb7X6LE0p9sZh.K7eEOBPYP9VIoHWTe = this.dTS0S7eC32ubQH54j36;
        vb7X6LE0p9sZh.dTS0S7eC32ubQH54j36 = this.EWUjsTERgdPbSw3NNlN;
        vb7X6LE0p9sZh.EWUjsTERgdPbSw3NNlN = this.yTljMGnIibTRdOpSh4;
        vb7X6LE0p9sZh.yTljMGnIibTRdOpSh4 = this.vIJudZvPyTuNp;
        vb7X6LE0p9sZh.vIJudZvPyTuNp = this.rCHnHJBAlOpNI5;
        return vb7X6LE0p9sZh;
    }

    public final J1m0XraSkScfWFMIlTC w9sT1Swbhx3hs(iniVyKd0OGb2raI4 inivykd0ogb2rai4, FZ1sl4mHq4J0hOEYC fZ1sl4mHq4J0hOEYC) {
        J1m0XraSkScfWFMIlTC j1m0XraSkScfWFMIlTC = new J1m0XraSkScfWFMIlTC(Cid8LKolL4e2FdtXe.pyu8ovAipBTLYAiKab, inivykd0ogb2rai4, fZ1sl4mHq4J0hOEYC, new Random(), this.yTljMGnIibTRdOpSh4, this.vIJudZvPyTuNp);
        if (((SzicGcOQovJ1JhxwfLo8) inivykd0ogb2rai4.Ee8d2j4S9Vm5yGuR).dDIMxZXP1V8HdM("Sec-WebSocket-Extensions") != null) {
            j1m0XraSkScfWFMIlTC.vekpFI4d1Nc4fakF(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
            return j1m0XraSkScfWFMIlTC;
        }
        Vb7X6LE0p9sZh vb7X6LE0p9sZhDDIMxZXP1V8HdM = dDIMxZXP1V8HdM();
        byte[] bArr = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
        vb7X6LE0p9sZhDDIMxZXP1V8HdM.Ee8d2j4S9Vm5yGuR = new UeVBYgBvSKYfVuXLhMs(69 - 49);
        vb7X6LE0p9sZhDDIMxZXP1V8HdM.dDIMxZXP1V8HdM(J1m0XraSkScfWFMIlTC.l1V0lQr6TbwNKqHfXNbb);
        sp6apkX00TawY02qGY6r sp6apkx00tawy02qgy6r = new sp6apkX00TawY02qGY6r(vb7X6LE0p9sZhDDIMxZXP1V8HdM);
        fUH025aw0Rgl fuh025aw0rglB1EoSIRjJHO5 = inivykd0ogb2rai4.b1EoSIRjJHO5();
        ((r5XEUfod5GSCCwq6c) fuh025aw0rglB1EoSIRjJHO5.vekpFI4d1Nc4fakF).yTljMGnIibTRdOpSh4("Upgrade", "websocket");
        ((r5XEUfod5GSCCwq6c) fuh025aw0rglB1EoSIRjJHO5.vekpFI4d1Nc4fakF).yTljMGnIibTRdOpSh4("Connection", "Upgrade");
        ((r5XEUfod5GSCCwq6c) fuh025aw0rglB1EoSIRjJHO5.vekpFI4d1Nc4fakF).yTljMGnIibTRdOpSh4("Sec-WebSocket-Key", j1m0XraSkScfWFMIlTC.xDyLpEZyrcKVe0);
        ((r5XEUfod5GSCCwq6c) fuh025aw0rglB1EoSIRjJHO5.vekpFI4d1Nc4fakF).yTljMGnIibTRdOpSh4("Sec-WebSocket-Version", "13");
        ((r5XEUfod5GSCCwq6c) fuh025aw0rglB1EoSIRjJHO5.vekpFI4d1Nc4fakF).yTljMGnIibTRdOpSh4("Sec-WebSocket-Extensions", "permessage-deflate");
        iniVyKd0OGb2raI4 inivykd0ogb2rai4DDIMxZXP1V8HdM = fuh025aw0rglB1EoSIRjJHO5.dDIMxZXP1V8HdM();
        VdAulbq7zlVjr545h vdAulbq7zlVjr545h = new VdAulbq7zlVjr545h(sp6apkx00tawy02qgy6r, inivykd0ogb2rai4DDIMxZXP1V8HdM);
        j1m0XraSkScfWFMIlTC.ibVTtJUNfrGYbW = vdAulbq7zlVjr545h;
        icsq4nzWNlK1KIU2Hp icsq4nzwnlk1kiu2hp = new icsq4nzWNlK1KIU2Hp(j1m0XraSkScfWFMIlTC, inivykd0ogb2rai4DDIMxZXP1V8HdM);
        if (!vdAulbq7zlVjr545h.xDyLpEZyrcKVe0.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        QnMItFgHCjZ1bOS qnMItFgHCjZ1bOS = QnMItFgHCjZ1bOS.dDIMxZXP1V8HdM;
        vdAulbq7zlVjr545h.ibVTtJUNfrGYbW = QnMItFgHCjZ1bOS.dDIMxZXP1V8HdM.ibVTtJUNfrGYbW();
        fUH025aw0Rgl fuh025aw0rgl = sp6apkx00tawy02qgy6r.w9sT1Swbhx3hs;
        exQloPNkvIFRvh exqlopnkvifrvh = new exQloPNkvIFRvh(vdAulbq7zlVjr545h, icsq4nzwnlk1kiu2hp);
        synchronized (fuh025aw0rgl) {
            ((ArrayDeque) fuh025aw0rgl.w9sT1Swbhx3hs).add(exqlopnkvifrvh);
        }
        fuh025aw0rgl.b1EoSIRjJHO5();
        return j1m0XraSkScfWFMIlTC;
    }
}
