package v.s;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class zfPdbqrCOkdxWPAv extends NnOm424seWgUNKa {
    public boolean D5P1xCAyuvgF;
    public KRdIG73TbWYS Ee8d2j4S9Vm5yGuR;
    public Socket JXn4Qf7zpnLjP5;
    public ZHKD3ddbUALiCxl b1EoSIRjJHO5;
    public int gIIiyi2ddlMDR0;
    public int gmNWMfvn6zlEj;
    public boolean hjneShqpF9Tis4;
    public Ksynl03UBrEMVM80NQ ibVTtJUNfrGYbW;
    public lpsYIxZHQFa6jCAhXSJ pyu8ovAipBTLYAiKab;
    public Socket vekpFI4d1Nc4fakF;
    public final uob4giiHlHBr6F5NYv w9sT1Swbhx3hs;
    public int wotphlvK9sPbXJ;
    public B62d1BWQ36VxGmXU xDyLpEZyrcKVe0;
    public int Qrz92kRPw4GcghAc = 1;
    public final ArrayList nQilHWaqS401ZtR = new ArrayList();
    public long J0zjQ7CAgohuxU20eCW6 = Long.MAX_VALUE;

    public zfPdbqrCOkdxWPAv(uob4giiHlHBr6F5NYv uob4giihlhbr6f5nyv) {
        this.w9sT1Swbhx3hs = uob4giihlhbr6f5nyv;
    }

    public static void JXn4Qf7zpnLjP5(sp6apkX00TawY02qGY6r sp6apkx00tawy02qgy6r, uob4giiHlHBr6F5NYv uob4giihlhbr6f5nyv, IOException iOException) {
        if (uob4giihlhbr6f5nyv.w9sT1Swbhx3hs.type() != Proxy.Type.DIRECT) {
            VEkRsTDS6a9oHWI vEkRsTDS6a9oHWI = uob4giihlhbr6f5nyv.dDIMxZXP1V8HdM;
            vEkRsTDS6a9oHWI.ibVTtJUNfrGYbW.connectFailed(vEkRsTDS6a9oHWI.b1EoSIRjJHO5.ibVTtJUNfrGYbW(), uob4giihlhbr6f5nyv.w9sT1Swbhx3hs.address(), iOException);
        }
        r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c = sp6apkx00tawy02qgy6r.rCHnHJBAlOpNI5;
        synchronized (r5xeufod5gsccwq6c) {
            ((LinkedHashSet) r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF).add(uob4giihlhbr6f5nyv);
        }
    }

    private static /* synthetic */ void cldwrfllz() {
    }

    public final Ftk7acqAlBdS D5P1xCAyuvgF(sp6apkX00TawY02qGY6r sp6apkx00tawy02qgy6r, h5bWEMI2dN1jRNFWXg7 h5bwemi2dn1jrnfwxg7) throws SocketException {
        int i = h5bwemi2dn1jrnfwxg7.ibVTtJUNfrGYbW;
        Socket socket = this.JXn4Qf7zpnLjP5;
        ZHKD3ddbUALiCxl zHKD3ddbUALiCxl = this.b1EoSIRjJHO5;
        lpsYIxZHQFa6jCAhXSJ lpsyixzhqfa6jcahxsj = this.pyu8ovAipBTLYAiKab;
        Ksynl03UBrEMVM80NQ ksynl03UBrEMVM80NQ = this.ibVTtJUNfrGYbW;
        if (ksynl03UBrEMVM80NQ != null) {
            return new y96X8DO1uO8B4(sp6apkx00tawy02qgy6r, this, h5bwemi2dn1jrnfwxg7, ksynl03UBrEMVM80NQ);
        }
        socket.setSoTimeout(i);
        zz3xpWRzprUTdR zz3xpwrzprutdrW9sT1Swbhx3hs = zHKD3ddbUALiCxl.w9sT1Swbhx3hs.w9sT1Swbhx3hs();
        long j = i;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        zz3xpwrzprutdrW9sT1Swbhx3hs.ibVTtJUNfrGYbW(j, timeUnit);
        lpsyixzhqfa6jcahxsj.w9sT1Swbhx3hs.w9sT1Swbhx3hs().ibVTtJUNfrGYbW(h5bwemi2dn1jrnfwxg7.b1EoSIRjJHO5, timeUnit);
        return new lqtgH1LJNxLx(sp6apkx00tawy02qgy6r, this, zHKD3ddbUALiCxl, lpsyixzhqfa6jcahxsj);
    }

    public final void Ee8d2j4S9Vm5yGuR(int i, int i2) throws IOException {
        uob4giiHlHBr6F5NYv uob4giihlhbr6f5nyv = this.w9sT1Swbhx3hs;
        Proxy proxy = uob4giihlhbr6f5nyv.w9sT1Swbhx3hs;
        VEkRsTDS6a9oHWI vEkRsTDS6a9oHWI = uob4giihlhbr6f5nyv.dDIMxZXP1V8HdM;
        Proxy.Type type = proxy.type();
        int i3 = type == null ? -1 : jSmHUlfCXbqNk.$EnumSwitchMapping$0[type.ordinal()];
        int i4 = 1;
        Socket socketCreateSocket = (i3 == 1 || i3 == 79 + (-77)) ? vEkRsTDS6a9oHWI.w9sT1Swbhx3hs.createSocket() : new Socket(proxy);
        this.vekpFI4d1Nc4fakF = socketCreateSocket;
        InetSocketAddress inetSocketAddress = this.w9sT1Swbhx3hs.vekpFI4d1Nc4fakF;
        socketCreateSocket.setSoTimeout(i2);
        try {
            QnMItFgHCjZ1bOS qnMItFgHCjZ1bOS = QnMItFgHCjZ1bOS.dDIMxZXP1V8HdM;
            QnMItFgHCjZ1bOS.dDIMxZXP1V8HdM.Ee8d2j4S9Vm5yGuR(socketCreateSocket, this.w9sT1Swbhx3hs.vekpFI4d1Nc4fakF, i);
            try {
                Logger logger = tntAixqOgreLyNBUe.dDIMxZXP1V8HdM;
                tdVrJ0LVZVn68Eqj tdvrj0lvzvn68eqj = new tdVrJ0LVZVn68Eqj(socketCreateSocket);
                this.b1EoSIRjJHO5 = new ZHKD3ddbUALiCxl(new K3kPk3jNrQadry74Mtp(tdvrj0lvzvn68eqj, 0, new K3kPk3jNrQadry74Mtp(socketCreateSocket.getInputStream(), i4, tdvrj0lvzvn68eqj)));
                tdVrJ0LVZVn68Eqj tdvrj0lvzvn68eqj2 = new tdVrJ0LVZVn68Eqj(socketCreateSocket);
                this.pyu8ovAipBTLYAiKab = new lpsYIxZHQFa6jCAhXSJ(new CkC4NMgVEUM3UELo(tdvrj0lvzvn68eqj2, new CkC4NMgVEUM3UELo(socketCreateSocket.getOutputStream(), tdvrj0lvzvn68eqj2)));
            } catch (NullPointerException e) {
                if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.w9sT1Swbhx3hs.vekpFI4d1Nc4fakF);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final boolean b1EoSIRjJHO5(VEkRsTDS6a9oHWI vEkRsTDS6a9oHWI, List list) {
        KRdIG73TbWYS kRdIG73TbWYS;
        xc6AKez33c65zO xc6akez33c65zo = vEkRsTDS6a9oHWI.b1EoSIRjJHO5;
        byte[] bArr = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
        if (this.nQilHWaqS401ZtR.size() < this.Qrz92kRPw4GcghAc && !this.D5P1xCAyuvgF) {
            uob4giiHlHBr6F5NYv uob4giihlhbr6f5nyv = this.w9sT1Swbhx3hs;
            VEkRsTDS6a9oHWI vEkRsTDS6a9oHWI2 = uob4giihlhbr6f5nyv.dDIMxZXP1V8HdM;
            VEkRsTDS6a9oHWI vEkRsTDS6a9oHWI3 = uob4giihlhbr6f5nyv.dDIMxZXP1V8HdM;
            if (vEkRsTDS6a9oHWI2.dDIMxZXP1V8HdM(vEkRsTDS6a9oHWI)) {
                if (!okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(xc6akez33c65zo.JXn4Qf7zpnLjP5, vEkRsTDS6a9oHWI3.b1EoSIRjJHO5.JXn4Qf7zpnLjP5)) {
                    if (this.ibVTtJUNfrGYbW != null && list != null && !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            uob4giiHlHBr6F5NYv uob4giihlhbr6f5nyv2 = (uob4giiHlHBr6F5NYv) it.next();
                            Proxy.Type type = uob4giihlhbr6f5nyv2.w9sT1Swbhx3hs.type();
                            Proxy.Type type2 = Proxy.Type.DIRECT;
                            if (type == type2 && uob4giihlhbr6f5nyv.w9sT1Swbhx3hs.type() == type2 && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(uob4giihlhbr6f5nyv.vekpFI4d1Nc4fakF, uob4giihlhbr6f5nyv2.vekpFI4d1Nc4fakF)) {
                                if (vEkRsTDS6a9oHWI.JXn4Qf7zpnLjP5 != c3iEN8plP13UDv9MQvT.dDIMxZXP1V8HdM) {
                                    break;
                                }
                                byte[] bArr2 = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
                                xc6AKez33c65zO xc6akez33c65zo2 = vEkRsTDS6a9oHWI3.b1EoSIRjJHO5;
                                int i = xc6akez33c65zo.Ee8d2j4S9Vm5yGuR;
                                String str = xc6akez33c65zo.JXn4Qf7zpnLjP5;
                                if (i != xc6akez33c65zo2.Ee8d2j4S9Vm5yGuR) {
                                    break;
                                }
                                if (!okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, xc6akez33c65zo2.JXn4Qf7zpnLjP5)) {
                                    if (!this.hjneShqpF9Tis4 && (kRdIG73TbWYS = this.Ee8d2j4S9Vm5yGuR) != null) {
                                        List listDDIMxZXP1V8HdM = kRdIG73TbWYS.dDIMxZXP1V8HdM();
                                        if (listDDIMxZXP1V8HdM.isEmpty() || !c3iEN8plP13UDv9MQvT.vekpFI4d1Nc4fakF(str, (X509Certificate) listDDIMxZXP1V8HdM.get(0))) {
                                            break;
                                            break;
                                        }
                                    } else {
                                        break;
                                        break;
                                    }
                                }
                                try {
                                    O9Ad3O0crmyhDHMF o9Ad3O0crmyhDHMF = vEkRsTDS6a9oHWI.Ee8d2j4S9Vm5yGuR;
                                    this.Ee8d2j4S9Vm5yGuR.dDIMxZXP1V8HdM();
                                    Iterator it2 = o9Ad3O0crmyhDHMF.dDIMxZXP1V8HdM.iterator();
                                    if (!it2.hasNext()) {
                                        return true;
                                    }
                                    Y9mRyRdkl5FOcwb66V6.gIIiyi2ddlMDR0(it2.next());
                                    throw null;
                                } catch (SSLPeerUnverifiedException unused) {
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // v.s.NnOm424seWgUNKa
    public final synchronized void dDIMxZXP1V8HdM(WCObt0AknnroPeo3Y2G0 wCObt0AknnroPeo3Y2G0) {
        this.Qrz92kRPw4GcghAc = (wCObt0AknnroPeo3Y2G0.dDIMxZXP1V8HdM & 16) != 0 ? wCObt0AknnroPeo3Y2G0.w9sT1Swbhx3hs[4] : Integer.MAX_VALUE;
    }

    public final void gmNWMfvn6zlEj(int i) throws SocketException {
        int i2;
        Socket socket = this.JXn4Qf7zpnLjP5;
        ZHKD3ddbUALiCxl zHKD3ddbUALiCxl = this.b1EoSIRjJHO5;
        lpsYIxZHQFa6jCAhXSJ lpsyixzhqfa6jcahxsj = this.pyu8ovAipBTLYAiKab;
        socket.setSoTimeout(0);
        Cid8LKolL4e2FdtXe cid8LKolL4e2FdtXe = Cid8LKolL4e2FdtXe.pyu8ovAipBTLYAiKab;
        P7b7KFoJnwoYcb p7b7KFoJnwoYcb = new P7b7KFoJnwoYcb();
        p7b7KFoJnwoYcb.vekpFI4d1Nc4fakF = cid8LKolL4e2FdtXe;
        p7b7KFoJnwoYcb.ibVTtJUNfrGYbW = NnOm424seWgUNKa.dDIMxZXP1V8HdM;
        String str = this.w9sT1Swbhx3hs.dDIMxZXP1V8HdM.b1EoSIRjJHO5.JXn4Qf7zpnLjP5;
        p7b7KFoJnwoYcb.JXn4Qf7zpnLjP5 = socket;
        p7b7KFoJnwoYcb.dDIMxZXP1V8HdM = yrMnf4fyLGfIJbMg8IbG.xDyLpEZyrcKVe0 + ' ' + str;
        p7b7KFoJnwoYcb.Ee8d2j4S9Vm5yGuR = zHKD3ddbUALiCxl;
        p7b7KFoJnwoYcb.xDyLpEZyrcKVe0 = lpsyixzhqfa6jcahxsj;
        p7b7KFoJnwoYcb.ibVTtJUNfrGYbW = this;
        p7b7KFoJnwoYcb.w9sT1Swbhx3hs = i;
        Ksynl03UBrEMVM80NQ ksynl03UBrEMVM80NQ = new Ksynl03UBrEMVM80NQ(p7b7KFoJnwoYcb);
        this.ibVTtJUNfrGYbW = ksynl03UBrEMVM80NQ;
        WCObt0AknnroPeo3Y2G0 wCObt0AknnroPeo3Y2G0 = Ksynl03UBrEMVM80NQ.rCHnHJBAlOpNI5;
        this.Qrz92kRPw4GcghAc = (wCObt0AknnroPeo3Y2G0.dDIMxZXP1V8HdM & 16) != 0 ? wCObt0AknnroPeo3Y2G0.w9sT1Swbhx3hs[4] : Integer.MAX_VALUE;
        opWpJwGfRP1bT1 opwpjwgfrp1bt1 = ksynl03UBrEMVM80NQ.EWUjsTERgdPbSw3NNlN;
        synchronized (opwpjwgfrp1bt1) {
            try {
                if (opwpjwgfrp1bt1.Ee8d2j4S9Vm5yGuR) {
                    throw new IOException("closed");
                }
                Logger logger = opWpJwGfRP1bT1.ibVTtJUNfrGYbW;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(yrMnf4fyLGfIJbMg8IbG.b1EoSIRjJHO5(">> CONNECTION " + yg3wKheju8eW4e6qsE.dDIMxZXP1V8HdM.JXn4Qf7zpnLjP5(), new Object[0]));
                }
                opwpjwgfrp1bt1.w9sT1Swbhx3hs.gmNWMfvn6zlEj(yg3wKheju8eW4e6qsE.dDIMxZXP1V8HdM);
                opwpjwgfrp1bt1.w9sT1Swbhx3hs.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
        opWpJwGfRP1bT1 opwpjwgfrp1bt2 = ksynl03UBrEMVM80NQ.EWUjsTERgdPbSw3NNlN;
        WCObt0AknnroPeo3Y2G0 wCObt0AknnroPeo3Y2G1 = ksynl03UBrEMVM80NQ.MLSIo1htfMPWeB8V876L;
        synchronized (opwpjwgfrp1bt2) {
            try {
                if (opwpjwgfrp1bt2.Ee8d2j4S9Vm5yGuR) {
                    throw new IOException("closed");
                }
                opwpjwgfrp1bt2.D5P1xCAyuvgF(0, Integer.bitCount(wCObt0AknnroPeo3Y2G1.dDIMxZXP1V8HdM) * 6, 4, 0);
                int i3 = 0;
                while (i3 < 10) {
                    boolean z = true;
                    if (((1 << i3) & wCObt0AknnroPeo3Y2G1.dDIMxZXP1V8HdM) == 0) {
                        z = false;
                    }
                    if (z) {
                        if (i3 != 4) {
                            i2 = i3 != 7 ? i3 : 4;
                        } else {
                            i2 = 3;
                        }
                        opwpjwgfrp1bt2.w9sT1Swbhx3hs.writeShort(i2);
                        opwpjwgfrp1bt2.w9sT1Swbhx3hs.writeInt(wCObt0AknnroPeo3Y2G1.w9sT1Swbhx3hs[i3]);
                    }
                    i3++;
                }
                opwpjwgfrp1bt2.w9sT1Swbhx3hs.flush();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int iDDIMxZXP1V8HdM = ksynl03UBrEMVM80NQ.MLSIo1htfMPWeB8V876L.dDIMxZXP1V8HdM();
        if (iDDIMxZXP1V8HdM != 65535) {
            ksynl03UBrEMVM80NQ.EWUjsTERgdPbSw3NNlN.vIJudZvPyTuNp(0, iDDIMxZXP1V8HdM - 65535);
        }
        cid8LKolL4e2FdtXe.Ee8d2j4S9Vm5yGuR().vekpFI4d1Nc4fakF(new m2RLabjFXo9vTghXAsK(ksynl03UBrEMVM80NQ.JXn4Qf7zpnLjP5, ksynl03UBrEMVM80NQ.yTljMGnIibTRdOpSh4, 2), 0L);
    }

    public final synchronized void hjneShqpF9Tis4() {
        this.D5P1xCAyuvgF = true;
    }

    public final void ibVTtJUNfrGYbW(RljmcpStUP0oyVsOQZ rljmcpStUP0oyVsOQZ, int i) throws Throwable {
        SSLSocket sSLSocket;
        String strXDyLpEZyrcKVe0;
        B62d1BWQ36VxGmXU b62d1BWQ36VxGmXU = B62d1BWQ36VxGmXU.HTTP_2;
        B62d1BWQ36VxGmXU b62d1BWQ36VxGmXU2 = B62d1BWQ36VxGmXU.HTTP_1_1;
        B62d1BWQ36VxGmXU b62d1BWQ36VxGmXU3 = B62d1BWQ36VxGmXU.H2_PRIOR_KNOWLEDGE;
        VEkRsTDS6a9oHWI vEkRsTDS6a9oHWI = this.w9sT1Swbhx3hs.dDIMxZXP1V8HdM;
        SSLSocketFactory sSLSocketFactory = vEkRsTDS6a9oHWI.vekpFI4d1Nc4fakF;
        if (sSLSocketFactory == null) {
            if (!vEkRsTDS6a9oHWI.pyu8ovAipBTLYAiKab.contains(b62d1BWQ36VxGmXU3)) {
                this.JXn4Qf7zpnLjP5 = this.vekpFI4d1Nc4fakF;
                this.xDyLpEZyrcKVe0 = b62d1BWQ36VxGmXU2;
                return;
            } else {
                this.JXn4Qf7zpnLjP5 = this.vekpFI4d1Nc4fakF;
                this.xDyLpEZyrcKVe0 = b62d1BWQ36VxGmXU3;
                gmNWMfvn6zlEj(i);
                return;
            }
        }
        try {
            Socket socket = this.vekpFI4d1Nc4fakF;
            xc6AKez33c65zO xc6akez33c65zo = vEkRsTDS6a9oHWI.b1EoSIRjJHO5;
            int i2 = 1;
            SSLSocket sSLSocket2 = (SSLSocket) sSLSocketFactory.createSocket(socket, xc6akez33c65zo.JXn4Qf7zpnLjP5, xc6akez33c65zo.Ee8d2j4S9Vm5yGuR, true);
            try {
                OSOlo3oGIKrMzEnWP oSOlo3oGIKrMzEnWPDDIMxZXP1V8HdM = rljmcpStUP0oyVsOQZ.dDIMxZXP1V8HdM(sSLSocket2);
                if (oSOlo3oGIKrMzEnWPDDIMxZXP1V8HdM.w9sT1Swbhx3hs) {
                    QnMItFgHCjZ1bOS qnMItFgHCjZ1bOS = QnMItFgHCjZ1bOS.dDIMxZXP1V8HdM;
                    QnMItFgHCjZ1bOS.dDIMxZXP1V8HdM.JXn4Qf7zpnLjP5(sSLSocket2, vEkRsTDS6a9oHWI.b1EoSIRjJHO5.JXn4Qf7zpnLjP5, vEkRsTDS6a9oHWI.pyu8ovAipBTLYAiKab);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                KRdIG73TbWYS kRdIG73TbWYSQrz92kRPw4GcghAc = SbxdZ6Kq2uhHQ5RPRqm.Qrz92kRPw4GcghAc(session);
                if (!vEkRsTDS6a9oHWI.JXn4Qf7zpnLjP5.verify(vEkRsTDS6a9oHWI.b1EoSIRjJHO5.JXn4Qf7zpnLjP5, session)) {
                    List listDDIMxZXP1V8HdM = kRdIG73TbWYSQrz92kRPw4GcghAc.dDIMxZXP1V8HdM();
                    if (listDDIMxZXP1V8HdM.isEmpty()) {
                        throw new SSLPeerUnverifiedException("Hostname " + vEkRsTDS6a9oHWI.b1EoSIRjJHO5.JXn4Qf7zpnLjP5 + " not verified (no certificates)");
                    }
                    X509Certificate x509Certificate = (X509Certificate) listDDIMxZXP1V8HdM.get(0);
                    StringBuilder sb = new StringBuilder("\n              |Hostname ");
                    sb.append(vEkRsTDS6a9oHWI.b1EoSIRjJHO5.JXn4Qf7zpnLjP5);
                    sb.append(" not verified:\n              |    certificate: ");
                    O9Ad3O0crmyhDHMF o9Ad3O0crmyhDHMF = O9Ad3O0crmyhDHMF.vekpFI4d1Nc4fakF;
                    sb.append(RIZfHbqXpth8r2yN4.ibVTtJUNfrGYbW(x509Certificate));
                    sb.append("\n              |    DN: ");
                    sb.append(x509Certificate.getSubjectDN().getName());
                    sb.append("\n              |    subjectAltNames: ");
                    sb.append(imhBI9RqzETHtVIJe.qfTrc75xwRVMl85vh(c3iEN8plP13UDv9MQvT.dDIMxZXP1V8HdM(x509Certificate, 7), c3iEN8plP13UDv9MQvT.dDIMxZXP1V8HdM(x509Certificate, 2)));
                    sb.append("\n              ");
                    throw new SSLPeerUnverifiedException(Fz7xZUuDknhA3i36pvyq.iUQk66nAiXgO35(sb.toString()));
                }
                O9Ad3O0crmyhDHMF o9Ad3O0crmyhDHMF2 = vEkRsTDS6a9oHWI.Ee8d2j4S9Vm5yGuR;
                this.Ee8d2j4S9Vm5yGuR = new KRdIG73TbWYS(kRdIG73TbWYSQrz92kRPw4GcghAc.dDIMxZXP1V8HdM, kRdIG73TbWYSQrz92kRPw4GcghAc.w9sT1Swbhx3hs, kRdIG73TbWYSQrz92kRPw4GcghAc.vekpFI4d1Nc4fakF, new yNHSZZlPw4l91GEjcB(o9Ad3O0crmyhDHMF2, kRdIG73TbWYSQrz92kRPw4GcghAc, vEkRsTDS6a9oHWI));
                String str = vEkRsTDS6a9oHWI.b1EoSIRjJHO5.JXn4Qf7zpnLjP5;
                Iterator it = o9Ad3O0crmyhDHMF2.dDIMxZXP1V8HdM.iterator();
                if (it.hasNext()) {
                    Y9mRyRdkl5FOcwb66V6.gIIiyi2ddlMDR0(it.next());
                    throw null;
                }
                if (oSOlo3oGIKrMzEnWPDDIMxZXP1V8HdM.w9sT1Swbhx3hs) {
                    QnMItFgHCjZ1bOS qnMItFgHCjZ1bOS2 = QnMItFgHCjZ1bOS.dDIMxZXP1V8HdM;
                    strXDyLpEZyrcKVe0 = QnMItFgHCjZ1bOS.dDIMxZXP1V8HdM.xDyLpEZyrcKVe0(sSLSocket2);
                } else {
                    strXDyLpEZyrcKVe0 = null;
                }
                this.JXn4Qf7zpnLjP5 = sSLSocket2;
                Logger logger = tntAixqOgreLyNBUe.dDIMxZXP1V8HdM;
                tdVrJ0LVZVn68Eqj tdvrj0lvzvn68eqj = new tdVrJ0LVZVn68Eqj(sSLSocket2);
                this.b1EoSIRjJHO5 = new ZHKD3ddbUALiCxl(new K3kPk3jNrQadry74Mtp(tdvrj0lvzvn68eqj, 0, new K3kPk3jNrQadry74Mtp(sSLSocket2.getInputStream(), i2, tdvrj0lvzvn68eqj)));
                tdVrJ0LVZVn68Eqj tdvrj0lvzvn68eqj2 = new tdVrJ0LVZVn68Eqj(sSLSocket2);
                this.pyu8ovAipBTLYAiKab = new lpsYIxZHQFa6jCAhXSJ(new CkC4NMgVEUM3UELo(tdvrj0lvzvn68eqj2, new CkC4NMgVEUM3UELo(sSLSocket2.getOutputStream(), tdvrj0lvzvn68eqj2)));
                if (strXDyLpEZyrcKVe0 != null) {
                    B62d1BWQ36VxGmXU b62d1BWQ36VxGmXU4 = B62d1BWQ36VxGmXU.HTTP_1_0;
                    if (strXDyLpEZyrcKVe0.equals("http/1.0")) {
                        b62d1BWQ36VxGmXU2 = b62d1BWQ36VxGmXU4;
                    } else if (!strXDyLpEZyrcKVe0.equals("http/1.1")) {
                        if (strXDyLpEZyrcKVe0.equals("h2_prior_knowledge")) {
                            b62d1BWQ36VxGmXU2 = b62d1BWQ36VxGmXU3;
                        } else if (strXDyLpEZyrcKVe0.equals("h2")) {
                            b62d1BWQ36VxGmXU2 = b62d1BWQ36VxGmXU;
                        } else {
                            b62d1BWQ36VxGmXU2 = B62d1BWQ36VxGmXU.SPDY_3;
                            if (!strXDyLpEZyrcKVe0.equals("spdy/3.1")) {
                                b62d1BWQ36VxGmXU2 = B62d1BWQ36VxGmXU.QUIC;
                                if (!strXDyLpEZyrcKVe0.equals("quic")) {
                                    throw new IOException("Unexpected protocol: ".concat(strXDyLpEZyrcKVe0));
                                }
                            }
                        }
                    }
                }
                this.xDyLpEZyrcKVe0 = b62d1BWQ36VxGmXU2;
                QnMItFgHCjZ1bOS qnMItFgHCjZ1bOS3 = QnMItFgHCjZ1bOS.dDIMxZXP1V8HdM;
                QnMItFgHCjZ1bOS.dDIMxZXP1V8HdM.dDIMxZXP1V8HdM(sSLSocket2);
                if (this.xDyLpEZyrcKVe0 == b62d1BWQ36VxGmXU) {
                    gmNWMfvn6zlEj(i);
                }
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    QnMItFgHCjZ1bOS qnMItFgHCjZ1bOS4 = QnMItFgHCjZ1bOS.dDIMxZXP1V8HdM;
                    QnMItFgHCjZ1bOS.dDIMxZXP1V8HdM.dDIMxZXP1V8HdM(sSLSocket);
                }
                if (sSLSocket != null) {
                    yrMnf4fyLGfIJbMg8IbG.JXn4Qf7zpnLjP5(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            sSLSocket = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    public final boolean pyu8ovAipBTLYAiKab(boolean z) {
        long j;
        byte[] bArr = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
        long jNanoTime = System.nanoTime();
        Socket socket = this.vekpFI4d1Nc4fakF;
        Socket socket2 = this.JXn4Qf7zpnLjP5;
        ZHKD3ddbUALiCxl zHKD3ddbUALiCxl = this.b1EoSIRjJHO5;
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        Ksynl03UBrEMVM80NQ ksynl03UBrEMVM80NQ = this.ibVTtJUNfrGYbW;
        ?? r6 = 48 - 47;
        if (ksynl03UBrEMVM80NQ != null) {
            synchronized (ksynl03UBrEMVM80NQ) {
                if (ksynl03UBrEMVM80NQ.ibVTtJUNfrGYbW) {
                    return false;
                }
                if (ksynl03UBrEMVM80NQ.nQilHWaqS401ZtR >= ksynl03UBrEMVM80NQ.Qrz92kRPw4GcghAc || jNanoTime < ksynl03UBrEMVM80NQ.J0zjQ7CAgohuxU20eCW6) {
                    return r6;
                }
                return false;
            }
        }
        synchronized (this) {
            j = jNanoTime - this.J0zjQ7CAgohuxU20eCW6;
        }
        if (j < 10000000000L || !z) {
            return r6;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(r6);
                return (zHKD3ddbUALiCxl.dDIMxZXP1V8HdM() ? 1 : 0) ^ r6;
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return r6;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        uob4giiHlHBr6F5NYv uob4giihlhbr6f5nyv = this.w9sT1Swbhx3hs;
        sb.append(uob4giihlhbr6f5nyv.dDIMxZXP1V8HdM.b1EoSIRjJHO5.JXn4Qf7zpnLjP5);
        sb.append(':');
        sb.append(uob4giihlhbr6f5nyv.dDIMxZXP1V8HdM.b1EoSIRjJHO5.Ee8d2j4S9Vm5yGuR);
        sb.append(", proxy=");
        sb.append(uob4giihlhbr6f5nyv.w9sT1Swbhx3hs);
        sb.append(" hostAddress=");
        sb.append(uob4giihlhbr6f5nyv.vekpFI4d1Nc4fakF);
        sb.append(" cipherSuite=");
        KRdIG73TbWYS kRdIG73TbWYS = this.Ee8d2j4S9Vm5yGuR;
        if (kRdIG73TbWYS == null || (obj = kRdIG73TbWYS.w9sT1Swbhx3hs) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.xDyLpEZyrcKVe0);
        sb.append('}');
        return sb.toString();
    }

    public final void vekpFI4d1Nc4fakF(int i, int i2, int i3, int i4, boolean z, VdAulbq7zlVjr545h vdAulbq7zlVjr545h) throws Throwable {
        if (this.xDyLpEZyrcKVe0 != null) {
            throw new IllegalStateException("already connected");
        }
        VEkRsTDS6a9oHWI vEkRsTDS6a9oHWI = this.w9sT1Swbhx3hs.dDIMxZXP1V8HdM;
        List list = vEkRsTDS6a9oHWI.D5P1xCAyuvgF;
        RljmcpStUP0oyVsOQZ rljmcpStUP0oyVsOQZ = new RljmcpStUP0oyVsOQZ(list);
        if (vEkRsTDS6a9oHWI.vekpFI4d1Nc4fakF == null) {
            if (!list.contains(OSOlo3oGIKrMzEnWP.xDyLpEZyrcKVe0)) {
                throw new LJkReZ725aUn8k(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.w9sT1Swbhx3hs.dDIMxZXP1V8HdM.b1EoSIRjJHO5.JXn4Qf7zpnLjP5;
            QnMItFgHCjZ1bOS qnMItFgHCjZ1bOS = QnMItFgHCjZ1bOS.dDIMxZXP1V8HdM;
            if (!QnMItFgHCjZ1bOS.dDIMxZXP1V8HdM.b1EoSIRjJHO5(str)) {
                throw new LJkReZ725aUn8k(new UnknownServiceException("CLEARTEXT communication to " + str + " not permitted by network security policy"));
            }
        } else if (vEkRsTDS6a9oHWI.pyu8ovAipBTLYAiKab.contains(B62d1BWQ36VxGmXU.H2_PRIOR_KNOWLEDGE)) {
            throw new LJkReZ725aUn8k(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        LJkReZ725aUn8k lJkReZ725aUn8k = null;
        while (true) {
            try {
                uob4giiHlHBr6F5NYv uob4giihlhbr6f5nyv = this.w9sT1Swbhx3hs;
                if (uob4giihlhbr6f5nyv.dDIMxZXP1V8HdM.vekpFI4d1Nc4fakF != null && uob4giihlhbr6f5nyv.w9sT1Swbhx3hs.type() == Proxy.Type.HTTP) {
                    xDyLpEZyrcKVe0(i, i2, i3);
                    if (this.vekpFI4d1Nc4fakF != null) {
                        break;
                    } else {
                        break;
                    }
                }
                Ee8d2j4S9Vm5yGuR(i, i2);
                ibVTtJUNfrGYbW(rljmcpStUP0oyVsOQZ, i4);
                InetSocketAddress inetSocketAddress = this.w9sT1Swbhx3hs.vekpFI4d1Nc4fakF;
                break;
            } catch (IOException e) {
                Socket socket = this.JXn4Qf7zpnLjP5;
                if (socket != null) {
                    yrMnf4fyLGfIJbMg8IbG.JXn4Qf7zpnLjP5(socket);
                }
                Socket socket2 = this.vekpFI4d1Nc4fakF;
                if (socket2 != null) {
                    yrMnf4fyLGfIJbMg8IbG.JXn4Qf7zpnLjP5(socket2);
                }
                this.JXn4Qf7zpnLjP5 = null;
                this.vekpFI4d1Nc4fakF = null;
                this.b1EoSIRjJHO5 = null;
                this.pyu8ovAipBTLYAiKab = null;
                this.Ee8d2j4S9Vm5yGuR = null;
                this.xDyLpEZyrcKVe0 = null;
                this.ibVTtJUNfrGYbW = null;
                this.Qrz92kRPw4GcghAc = 1;
                InetSocketAddress inetSocketAddress2 = this.w9sT1Swbhx3hs.vekpFI4d1Nc4fakF;
                if (lJkReZ725aUn8k == null) {
                    lJkReZ725aUn8k = new LJkReZ725aUn8k(e);
                } else {
                    RIZfHbqXpth8r2yN4.dDIMxZXP1V8HdM(lJkReZ725aUn8k.w9sT1Swbhx3hs, e);
                    lJkReZ725aUn8k.vekpFI4d1Nc4fakF = e;
                }
                if (!z) {
                    throw lJkReZ725aUn8k;
                }
                rljmcpStUP0oyVsOQZ.JXn4Qf7zpnLjP5 = true;
                if (!rljmcpStUP0oyVsOQZ.vekpFI4d1Nc4fakF) {
                    throw lJkReZ725aUn8k;
                }
                if (e instanceof ProtocolException) {
                    throw lJkReZ725aUn8k;
                }
                if (e instanceof InterruptedIOException) {
                    throw lJkReZ725aUn8k;
                }
                if ((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) {
                    throw lJkReZ725aUn8k;
                }
                if (e instanceof SSLPeerUnverifiedException) {
                    throw lJkReZ725aUn8k;
                }
                if (!(e instanceof SSLException)) {
                    throw lJkReZ725aUn8k;
                }
            }
        }
        uob4giiHlHBr6F5NYv uob4giihlhbr6f5nyv2 = this.w9sT1Swbhx3hs;
        if (uob4giihlhbr6f5nyv2.dDIMxZXP1V8HdM.vekpFI4d1Nc4fakF != null && uob4giihlhbr6f5nyv2.w9sT1Swbhx3hs.type() == Proxy.Type.HTTP && this.vekpFI4d1Nc4fakF == null) {
            throw new LJkReZ725aUn8k(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        this.J0zjQ7CAgohuxU20eCW6 = System.nanoTime();
    }

    @Override // v.s.NnOm424seWgUNKa
    public final void w9sT1Swbhx3hs(Eruqtn8YZhu5 eruqtn8YZhu5) {
        eruqtn8YZhu5.vekpFI4d1Nc4fakF(8, null);
    }

    public final void xDyLpEZyrcKVe0(int i, int i2, int i3) throws IOException {
        fUH025aw0Rgl fuh025aw0rgl = new fUH025aw0Rgl((-92) + 94);
        uob4giiHlHBr6F5NYv uob4giihlhbr6f5nyv = this.w9sT1Swbhx3hs;
        fuh025aw0rgl.dDIMxZXP1V8HdM = uob4giihlhbr6f5nyv.dDIMxZXP1V8HdM.b1EoSIRjJHO5;
        fuh025aw0rgl.ibVTtJUNfrGYbW("CONNECT", null);
        VEkRsTDS6a9oHWI vEkRsTDS6a9oHWI = uob4giihlhbr6f5nyv.dDIMxZXP1V8HdM;
        ((r5XEUfod5GSCCwq6c) fuh025aw0rgl.vekpFI4d1Nc4fakF).yTljMGnIibTRdOpSh4("Host", yrMnf4fyLGfIJbMg8IbG.DVTNwpDEVsUKuznof(vEkRsTDS6a9oHWI.b1EoSIRjJHO5, true));
        ((r5XEUfod5GSCCwq6c) fuh025aw0rgl.vekpFI4d1Nc4fakF).yTljMGnIibTRdOpSh4("Proxy-Connection", "Keep-Alive");
        ((r5XEUfod5GSCCwq6c) fuh025aw0rgl.vekpFI4d1Nc4fakF).yTljMGnIibTRdOpSh4("User-Agent", "okhttp/4.12.0");
        iniVyKd0OGb2raI4 inivykd0ogb2rai4DDIMxZXP1V8HdM = fuh025aw0rgl.dDIMxZXP1V8HdM();
        r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c = new r5XEUfod5GSCCwq6c(11);
        r5xeufod5gsccwq6c.yTljMGnIibTRdOpSh4("Proxy-Authenticate", "OkHttp-Preemptive");
        r5xeufod5gsccwq6c.ibVTtJUNfrGYbW();
        vEkRsTDS6a9oHWI.xDyLpEZyrcKVe0.getClass();
        xc6AKez33c65zO xc6akez33c65zo = (xc6AKez33c65zO) inivykd0ogb2rai4DDIMxZXP1V8HdM.vekpFI4d1Nc4fakF;
        Ee8d2j4S9Vm5yGuR(i, i2);
        String str = "CONNECT " + yrMnf4fyLGfIJbMg8IbG.DVTNwpDEVsUKuznof(xc6akez33c65zo, true) + " HTTP/1.1";
        ZHKD3ddbUALiCxl zHKD3ddbUALiCxl = this.b1EoSIRjJHO5;
        lpsYIxZHQFa6jCAhXSJ lpsyixzhqfa6jcahxsj = this.pyu8ovAipBTLYAiKab;
        lqtgH1LJNxLx lqtgh1ljnxlx = new lqtgH1LJNxLx(null, this, zHKD3ddbUALiCxl, lpsyixzhqfa6jcahxsj);
        zz3xpWRzprUTdR zz3xpwrzprutdrW9sT1Swbhx3hs = zHKD3ddbUALiCxl.w9sT1Swbhx3hs.w9sT1Swbhx3hs();
        long j = i2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        zz3xpwrzprutdrW9sT1Swbhx3hs.ibVTtJUNfrGYbW(j, timeUnit);
        lpsyixzhqfa6jcahxsj.w9sT1Swbhx3hs.w9sT1Swbhx3hs().ibVTtJUNfrGYbW(i3, timeUnit);
        lqtgh1ljnxlx.D5P1xCAyuvgF((SzicGcOQovJ1JhxwfLo8) inivykd0ogb2rai4DDIMxZXP1V8HdM.Ee8d2j4S9Vm5yGuR, str);
        lqtgh1ljnxlx.vekpFI4d1Nc4fakF();
        OHTCdIMQ8dDzHn2uIc oHTCdIMQ8dDzHn2uIcXDyLpEZyrcKVe0 = lqtgh1ljnxlx.xDyLpEZyrcKVe0(false);
        oHTCdIMQ8dDzHn2uIcXDyLpEZyrcKVe0.dDIMxZXP1V8HdM = inivykd0ogb2rai4DDIMxZXP1V8HdM;
        Box5SCj0ZNnLNdOqQxT box5SCj0ZNnLNdOqQxTDDIMxZXP1V8HdM = oHTCdIMQ8dDzHn2uIcXDyLpEZyrcKVe0.dDIMxZXP1V8HdM();
        int i4 = box5SCj0ZNnLNdOqQxTDDIMxZXP1V8HdM.Ee8d2j4S9Vm5yGuR;
        long jD5P1xCAyuvgF = yrMnf4fyLGfIJbMg8IbG.D5P1xCAyuvgF(box5SCj0ZNnLNdOqQxTDDIMxZXP1V8HdM);
        if (jD5P1xCAyuvgF != -1) {
            e7g79jevOor5vdCta e7g79jevoor5vdctaPyu8ovAipBTLYAiKab = lqtgh1ljnxlx.pyu8ovAipBTLYAiKab(jD5P1xCAyuvgF);
            yrMnf4fyLGfIJbMg8IbG.XiR1pIn5878vVWd(e7g79jevoor5vdctaPyu8ovAipBTLYAiKab, Integer.MAX_VALUE);
            e7g79jevoor5vdctaPyu8ovAipBTLYAiKab.close();
        }
        if (i4 != 200) {
            if (i4 != 407) {
                throw new IOException(Y9mRyRdkl5FOcwb66V6.xDyLpEZyrcKVe0("Unexpected response code for CONNECT: ", i4));
            }
            vEkRsTDS6a9oHWI.xDyLpEZyrcKVe0.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!zHKD3ddbUALiCxl.vekpFI4d1Nc4fakF.vekpFI4d1Nc4fakF() || !lpsyixzhqfa6jcahxsj.vekpFI4d1Nc4fakF.vekpFI4d1Nc4fakF()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }
}
