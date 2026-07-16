package v.s;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class iuz9HpMY1j7vNt3k3 implements yzLUrS855q0WL0X9r {
    public final /* synthetic */ int dDIMxZXP1V8HdM;
    public final Object w9sT1Swbhx3hs;

    public /* synthetic */ iuz9HpMY1j7vNt3k3(int i, Object obj) {
        this.dDIMxZXP1V8HdM = i;
        this.w9sT1Swbhx3hs = obj;
    }

    public static int JXn4Qf7zpnLjP5(Box5SCj0ZNnLNdOqQxT box5SCj0ZNnLNdOqQxT, int i) {
        String strDDIMxZXP1V8HdM = box5SCj0ZNnLNdOqQxT.ibVTtJUNfrGYbW.dDIMxZXP1V8HdM("Retry-After");
        if (strDDIMxZXP1V8HdM == null) {
            strDDIMxZXP1V8HdM = null;
        }
        if (strDDIMxZXP1V8HdM == null) {
            return i;
        }
        if (Pattern.compile("\\d+").matcher(strDDIMxZXP1V8HdM).matches()) {
            return Integer.valueOf(strDDIMxZXP1V8HdM).intValue();
        }
        return Integer.MAX_VALUE;
    }

    @Override // v.s.yzLUrS855q0WL0X9r
    public final Box5SCj0ZNnLNdOqQxT dDIMxZXP1V8HdM(h5bWEMI2dN1jRNFWXg7 h5bwemi2dn1jrnfwxg7) {
        T3JeDzw7Re7Z t3JeDzw7Re7Z;
        Box5SCj0ZNnLNdOqQxT box5SCj0ZNnLNdOqQxTW9sT1Swbhx3hs;
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        O9Ad3O0crmyhDHMF o9Ad3O0crmyhDHMF;
        switch (this.dDIMxZXP1V8HdM) {
            case 0:
                fadfsJa4iEdiwEC4Xm8 fadfsja4iediwec4xm8 = (fadfsJa4iEdiwEC4Xm8) this.w9sT1Swbhx3hs;
                iniVyKd0OGb2raI4 inivykd0ogb2rai4 = h5bwemi2dn1jrnfwxg7.Ee8d2j4S9Vm5yGuR;
                fUH025aw0Rgl fuh025aw0rglB1EoSIRjJHO5 = inivykd0ogb2rai4.b1EoSIRjJHO5();
                xc6AKez33c65zO xc6akez33c65zo = (xc6AKez33c65zO) inivykd0ogb2rai4.vekpFI4d1Nc4fakF;
                SzicGcOQovJ1JhxwfLo8 szicGcOQovJ1JhxwfLo8 = (SzicGcOQovJ1JhxwfLo8) inivykd0ogb2rai4.Ee8d2j4S9Vm5yGuR;
                boolean z = false;
                if (szicGcOQovJ1JhxwfLo8.dDIMxZXP1V8HdM("Host") == null) {
                    fuh025aw0rglB1EoSIRjJHO5.Ee8d2j4S9Vm5yGuR("Host", yrMnf4fyLGfIJbMg8IbG.DVTNwpDEVsUKuznof(xc6akez33c65zo, false));
                }
                if (szicGcOQovJ1JhxwfLo8.dDIMxZXP1V8HdM("Connection") == null) {
                    fuh025aw0rglB1EoSIRjJHO5.Ee8d2j4S9Vm5yGuR("Connection", "Keep-Alive");
                }
                if (szicGcOQovJ1JhxwfLo8.dDIMxZXP1V8HdM("Accept-Encoding") == null && szicGcOQovJ1JhxwfLo8.dDIMxZXP1V8HdM("Range") == null) {
                    fuh025aw0rglB1EoSIRjJHO5.Ee8d2j4S9Vm5yGuR("Accept-Encoding", "gzip");
                    z = true;
                }
                fadfsja4iediwec4xm8.getClass();
                if (szicGcOQovJ1JhxwfLo8.dDIMxZXP1V8HdM("User-Agent") == null) {
                    fuh025aw0rglB1EoSIRjJHO5.Ee8d2j4S9Vm5yGuR("User-Agent", "okhttp/4.12.0");
                }
                Box5SCj0ZNnLNdOqQxT box5SCj0ZNnLNdOqQxTW9sT1Swbhx3hs2 = h5bwemi2dn1jrnfwxg7.w9sT1Swbhx3hs(fuh025aw0rglB1EoSIRjJHO5.dDIMxZXP1V8HdM());
                SzicGcOQovJ1JhxwfLo8 szicGcOQovJ1JhxwfLo9 = box5SCj0ZNnLNdOqQxTW9sT1Swbhx3hs2.ibVTtJUNfrGYbW;
                Bsr8WAhbbWJl.w9sT1Swbhx3hs(fadfsja4iediwec4xm8, xc6akez33c65zo, szicGcOQovJ1JhxwfLo9);
                OHTCdIMQ8dDzHn2uIc oHTCdIMQ8dDzHn2uIcDDIMxZXP1V8HdM = box5SCj0ZNnLNdOqQxTW9sT1Swbhx3hs2.dDIMxZXP1V8HdM();
                oHTCdIMQ8dDzHn2uIcDDIMxZXP1V8HdM.dDIMxZXP1V8HdM = inivykd0ogb2rai4;
                if (z) {
                    String strDDIMxZXP1V8HdM = szicGcOQovJ1JhxwfLo9.dDIMxZXP1V8HdM("Content-Encoding");
                    if (strDDIMxZXP1V8HdM == null) {
                        strDDIMxZXP1V8HdM = null;
                    }
                    if ("gzip".equalsIgnoreCase(strDDIMxZXP1V8HdM) && Bsr8WAhbbWJl.dDIMxZXP1V8HdM(box5SCj0ZNnLNdOqQxTW9sT1Swbhx3hs2) && (t3JeDzw7Re7Z = box5SCj0ZNnLNdOqQxTW9sT1Swbhx3hs2.b1EoSIRjJHO5) != null) {
                        ybFszvGt45UNzfQ ybfszvgt45unzfq = new ybFszvGt45UNzfQ(t3JeDzw7Re7Z.vekpFI4d1Nc4fakF());
                        r5XEUfod5GSCCwq6c r5xeufod5gsccwq6cVekpFI4d1Nc4fakF = szicGcOQovJ1JhxwfLo9.vekpFI4d1Nc4fakF();
                        r5xeufod5gsccwq6cVekpFI4d1Nc4fakF.EWUjsTERgdPbSw3NNlN("Content-Encoding");
                        r5xeufod5gsccwq6cVekpFI4d1Nc4fakF.EWUjsTERgdPbSw3NNlN("Content-Length");
                        oHTCdIMQ8dDzHn2uIcDDIMxZXP1V8HdM.xDyLpEZyrcKVe0 = r5xeufod5gsccwq6cVekpFI4d1Nc4fakF.ibVTtJUNfrGYbW().vekpFI4d1Nc4fakF();
                        szicGcOQovJ1JhxwfLo9.dDIMxZXP1V8HdM("Content-Type");
                        oHTCdIMQ8dDzHn2uIcDDIMxZXP1V8HdM.ibVTtJUNfrGYbW = new T3JeDzw7Re7Z(-1L, new ZHKD3ddbUALiCxl(ybfszvgt45unzfq), 0);
                    }
                }
                return oHTCdIMQ8dDzHn2uIcDDIMxZXP1V8HdM.dDIMxZXP1V8HdM();
            default:
                iniVyKd0OGb2raI4 inivykd0ogb2rai5 = h5bwemi2dn1jrnfwxg7.Ee8d2j4S9Vm5yGuR;
                VdAulbq7zlVjr545h vdAulbq7zlVjr545h = h5bwemi2dn1jrnfwxg7.dDIMxZXP1V8HdM;
                List list = qkzRt1s9DJNNYwsqt.w9sT1Swbhx3hs;
                Box5SCj0ZNnLNdOqQxT box5SCj0ZNnLNdOqQxT = null;
                int i = 0;
                iniVyKd0OGb2raI4 inivykd0ogb2rai4W9sT1Swbhx3hs = inivykd0ogb2rai5;
                while (true) {
                    boolean z2 = true;
                    while (true) {
                        if (vdAulbq7zlVjr545h.hjneShqpF9Tis4 != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        synchronized (vdAulbq7zlVjr545h) {
                            try {
                                if (vdAulbq7zlVjr545h.gIIiyi2ddlMDR0) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (vdAulbq7zlVjr545h.gmNWMfvn6zlEj) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z2) {
                            AW3ZFVDOCYNQG2ry0h aW3ZFVDOCYNQG2ry0h = vdAulbq7zlVjr545h.JXn4Qf7zpnLjP5;
                            xc6AKez33c65zO xc6akez33c65zo2 = (xc6AKez33c65zO) inivykd0ogb2rai4W9sT1Swbhx3hs.vekpFI4d1Nc4fakF;
                            sp6apkX00TawY02qGY6r sp6apkx00tawy02qgy6r = vdAulbq7zlVjr545h.w9sT1Swbhx3hs;
                            if (xc6akez33c65zo2.pyu8ovAipBTLYAiKab) {
                                SSLSocketFactory sSLSocketFactory2 = sp6apkx00tawy02qgy6r.nQilHWaqS401ZtR;
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("CLEARTEXT-only client");
                                }
                                HostnameVerifier hostnameVerifier2 = sp6apkx00tawy02qgy6r.H9XlUr4OeMJFiXK;
                                o9Ad3O0crmyhDHMF = sp6apkx00tawy02qgy6r.DVTNwpDEVsUKuznof;
                                sSLSocketFactory = sSLSocketFactory2;
                                hostnameVerifier = hostnameVerifier2;
                            } else {
                                sSLSocketFactory = null;
                                hostnameVerifier = null;
                                o9Ad3O0crmyhDHMF = null;
                            }
                            vdAulbq7zlVjr545h.b1EoSIRjJHO5 = new eDfRIe8Yxow8(aW3ZFVDOCYNQG2ry0h, new VEkRsTDS6a9oHWI(xc6akez33c65zo2.JXn4Qf7zpnLjP5, xc6akez33c65zo2.Ee8d2j4S9Vm5yGuR, sp6apkx00tawy02qgy6r.gmNWMfvn6zlEj, sp6apkx00tawy02qgy6r.Qrz92kRPw4GcghAc, sSLSocketFactory, hostnameVerifier, o9Ad3O0crmyhDHMF, sp6apkx00tawy02qgy6r.wotphlvK9sPbXJ, sp6apkx00tawy02qgy6r.XiR1pIn5878vVWd, sp6apkx00tawy02qgy6r.MLSIo1htfMPWeB8V876L, sp6apkx00tawy02qgy6r.gIIiyi2ddlMDR0), vdAulbq7zlVjr545h);
                        }
                        try {
                            if (vdAulbq7zlVjr545h.Qrz92kRPw4GcghAc) {
                                throw new IOException("Canceled");
                            }
                            try {
                                box5SCj0ZNnLNdOqQxTW9sT1Swbhx3hs = h5bwemi2dn1jrnfwxg7.w9sT1Swbhx3hs(inivykd0ogb2rai4W9sT1Swbhx3hs);
                            } catch (IOException e) {
                                if (!vekpFI4d1Nc4fakF(e, vdAulbq7zlVjr545h, inivykd0ogb2rai4W9sT1Swbhx3hs, !(e instanceof oD54hfY99k9U))) {
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        RIZfHbqXpth8r2yN4.dDIMxZXP1V8HdM(e, (Exception) it.next());
                                    }
                                    throw e;
                                }
                                ArrayList arrayList = new ArrayList(list.size() + 1);
                                arrayList.addAll(list);
                                arrayList.add(e);
                                vdAulbq7zlVjr545h.Ee8d2j4S9Vm5yGuR(true);
                                list = arrayList;
                                z2 = false;
                            } catch (LJkReZ725aUn8k e2) {
                                if (!vekpFI4d1Nc4fakF(e2.vekpFI4d1Nc4fakF, vdAulbq7zlVjr545h, inivykd0ogb2rai4W9sT1Swbhx3hs, false)) {
                                    IOException iOException = e2.w9sT1Swbhx3hs;
                                    Iterator it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        RIZfHbqXpth8r2yN4.dDIMxZXP1V8HdM(iOException, (Exception) it2.next());
                                    }
                                    throw iOException;
                                }
                                IOException iOException2 = e2.w9sT1Swbhx3hs;
                                ArrayList arrayList2 = new ArrayList(list.size() + 1);
                                arrayList2.addAll(list);
                                arrayList2.add(iOException2);
                                vdAulbq7zlVjr545h.Ee8d2j4S9Vm5yGuR(true);
                                list = arrayList2;
                                z2 = false;
                            }
                        } catch (Throwable th2) {
                            vdAulbq7zlVjr545h.Ee8d2j4S9Vm5yGuR(true);
                            throw th2;
                        }
                        break;
                    }
                    if (box5SCj0ZNnLNdOqQxT != null) {
                        OHTCdIMQ8dDzHn2uIc oHTCdIMQ8dDzHn2uIcDDIMxZXP1V8HdM2 = box5SCj0ZNnLNdOqQxTW9sT1Swbhx3hs.dDIMxZXP1V8HdM();
                        OHTCdIMQ8dDzHn2uIc oHTCdIMQ8dDzHn2uIcDDIMxZXP1V8HdM3 = box5SCj0ZNnLNdOqQxT.dDIMxZXP1V8HdM();
                        oHTCdIMQ8dDzHn2uIcDDIMxZXP1V8HdM3.ibVTtJUNfrGYbW = null;
                        Box5SCj0ZNnLNdOqQxT box5SCj0ZNnLNdOqQxTDDIMxZXP1V8HdM = oHTCdIMQ8dDzHn2uIcDDIMxZXP1V8HdM3.dDIMxZXP1V8HdM();
                        if (box5SCj0ZNnLNdOqQxTDDIMxZXP1V8HdM.b1EoSIRjJHO5 != null) {
                            throw new IllegalArgumentException("priorResponse.body != null");
                        }
                        oHTCdIMQ8dDzHn2uIcDDIMxZXP1V8HdM2.D5P1xCAyuvgF = box5SCj0ZNnLNdOqQxTDDIMxZXP1V8HdM;
                        box5SCj0ZNnLNdOqQxTW9sT1Swbhx3hs = oHTCdIMQ8dDzHn2uIcDDIMxZXP1V8HdM2.dDIMxZXP1V8HdM();
                    }
                    box5SCj0ZNnLNdOqQxT = box5SCj0ZNnLNdOqQxTW9sT1Swbhx3hs;
                    inivykd0ogb2rai4W9sT1Swbhx3hs = w9sT1Swbhx3hs(box5SCj0ZNnLNdOqQxT, vdAulbq7zlVjr545h.hjneShqpF9Tis4);
                    if (inivykd0ogb2rai4W9sT1Swbhx3hs == null) {
                        vdAulbq7zlVjr545h.Ee8d2j4S9Vm5yGuR(false);
                        return box5SCj0ZNnLNdOqQxT;
                    }
                    T3JeDzw7Re7Z t3JeDzw7Re7Z2 = box5SCj0ZNnLNdOqQxT.b1EoSIRjJHO5;
                    if (t3JeDzw7Re7Z2 != null) {
                        yrMnf4fyLGfIJbMg8IbG.vekpFI4d1Nc4fakF(t3JeDzw7Re7Z2);
                    }
                    i++;
                    if (i > 38 - 18) {
                        throw new ProtocolException("Too many follow-up requests: " + i);
                    }
                    vdAulbq7zlVjr545h.Ee8d2j4S9Vm5yGuR(true);
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0049  */
    /* JADX WARN: Code duplicated, block: B:36:0x0050  */
    /* JADX WARN: Code duplicated, block: B:38:0x0053  */
    /* JADX WARN: Code duplicated, block: B:49:0x006b A[ADDED_TO_REGION, DONT_GENERATE, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:51:0x006d A[Catch: all -> 0x0089, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:47:0x0067, B:51:0x006d, B:55:0x0084), top: B:76:0x0067 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x008e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0090  */
    /* JADX WARN: Code duplicated, block: B:64:0x0092  */
    /* JADX WARN: Code duplicated, block: B:66:0x0099  */
    /* JADX WARN: Code duplicated, block: B:69:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ae A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:76:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public boolean vekpFI4d1Nc4fakF(IOException iOException, VdAulbq7zlVjr545h vdAulbq7zlVjr545h, iniVyKd0OGb2raI4 inivykd0ogb2rai4, boolean z) {
        eDfRIe8Yxow8 edfrie8yxow8;
        int i;
        boolean zB1EoSIRjJHO5;
        uob4giiHlHBr6F5NYv uob4giihlhbr6f5nyv;
        OLiXdgIH3STgCLxE6Pzb oLiXdgIH3STgCLxE6Pzb;
        lqtgH1LJNxLx lqtgh1ljnxlx;
        zfPdbqrCOkdxWPAv zfpdbqrcokdxwpav;
        if (!((sp6apkX00TawY02qGY6r) this.w9sT1Swbhx3hs).ibVTtJUNfrGYbW || ((z && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException))) {
            return false;
        }
        if (!(iOException instanceof InterruptedIOException)) {
            if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
                return false;
            }
            edfrie8yxow8 = vdAulbq7zlVjr545h.b1EoSIRjJHO5;
            i = edfrie8yxow8.dDIMxZXP1V8HdM;
            if (i != 0) {
                if (((uob4giiHlHBr6F5NYv) edfrie8yxow8.pyu8ovAipBTLYAiKab) != null) {
                    zB1EoSIRjJHO5 = true;
                } else {
                    uob4giihlhbr6f5nyv = null;
                    if (i <= 1) {
                        synchronized (zfpdbqrcokdxwpav) {
                            if (zfpdbqrcokdxwpav.gmNWMfvn6zlEj != 0) {
                                uob4giihlhbr6f5nyv = zfpdbqrcokdxwpav.w9sT1Swbhx3hs;
                            }
                        }
                    }
                    if (uob4giihlhbr6f5nyv != null) {
                        edfrie8yxow8.pyu8ovAipBTLYAiKab = uob4giihlhbr6f5nyv;
                    } else {
                        oLiXdgIH3STgCLxE6Pzb = (OLiXdgIH3STgCLxE6Pzb) edfrie8yxow8.ibVTtJUNfrGYbW;
                        zB1EoSIRjJHO5 = oLiXdgIH3STgCLxE6Pzb != null ? lqtgh1ljnxlx.b1EoSIRjJHO5() : lqtgh1ljnxlx.b1EoSIRjJHO5();
                    }
                    zB1EoSIRjJHO5 = true;
                }
            } else if (((uob4giiHlHBr6F5NYv) edfrie8yxow8.pyu8ovAipBTLYAiKab) != null) {
                zB1EoSIRjJHO5 = true;
            } else {
                uob4giihlhbr6f5nyv = null;
                if (i <= 1) {
                    synchronized (zfpdbqrcokdxwpav) {
                        if (zfpdbqrcokdxwpav.gmNWMfvn6zlEj != 0) {
                            uob4giihlhbr6f5nyv = zfpdbqrcokdxwpav.w9sT1Swbhx3hs;
                        }
                    }
                }
                if (uob4giihlhbr6f5nyv != null) {
                    edfrie8yxow8.pyu8ovAipBTLYAiKab = uob4giihlhbr6f5nyv;
                } else {
                    oLiXdgIH3STgCLxE6Pzb = (OLiXdgIH3STgCLxE6Pzb) edfrie8yxow8.ibVTtJUNfrGYbW;
                    if (oLiXdgIH3STgCLxE6Pzb != null) {
                    }
                }
                zB1EoSIRjJHO5 = true;
            }
            if (!zB1EoSIRjJHO5) {
                return true;
            }
        } else if ((iOException instanceof SocketTimeoutException) && !z) {
            edfrie8yxow8 = vdAulbq7zlVjr545h.b1EoSIRjJHO5;
            i = edfrie8yxow8.dDIMxZXP1V8HdM;
            if (i != 0 && edfrie8yxow8.w9sT1Swbhx3hs == 0 && edfrie8yxow8.vekpFI4d1Nc4fakF == 0) {
                zB1EoSIRjJHO5 = false;
            } else if (((uob4giiHlHBr6F5NYv) edfrie8yxow8.pyu8ovAipBTLYAiKab) != null) {
                zB1EoSIRjJHO5 = true;
            } else {
                uob4giihlhbr6f5nyv = null;
                if (i <= 1 && edfrie8yxow8.w9sT1Swbhx3hs <= 1 && edfrie8yxow8.vekpFI4d1Nc4fakF <= 0 && (zfpdbqrcokdxwpav = ((VdAulbq7zlVjr545h) edfrie8yxow8.xDyLpEZyrcKVe0).pyu8ovAipBTLYAiKab) != null) {
                    synchronized (zfpdbqrcokdxwpav) {
                        if (zfpdbqrcokdxwpav.gmNWMfvn6zlEj != 0 && yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM(zfpdbqrcokdxwpav.w9sT1Swbhx3hs.dDIMxZXP1V8HdM.b1EoSIRjJHO5, ((VEkRsTDS6a9oHWI) edfrie8yxow8.Ee8d2j4S9Vm5yGuR).b1EoSIRjJHO5)) {
                            uob4giihlhbr6f5nyv = zfpdbqrcokdxwpav.w9sT1Swbhx3hs;
                        }
                    }
                }
                if (uob4giihlhbr6f5nyv != null) {
                    edfrie8yxow8.pyu8ovAipBTLYAiKab = uob4giihlhbr6f5nyv;
                } else {
                    oLiXdgIH3STgCLxE6Pzb = (OLiXdgIH3STgCLxE6Pzb) edfrie8yxow8.ibVTtJUNfrGYbW;
                    if ((oLiXdgIH3STgCLxE6Pzb != null || !oLiXdgIH3STgCLxE6Pzb.dDIMxZXP1V8HdM()) && (lqtgh1ljnxlx = (lqtgH1LJNxLx) edfrie8yxow8.b1EoSIRjJHO5) != null) {
                    }
                }
                zB1EoSIRjJHO5 = true;
            }
            if (!zB1EoSIRjJHO5) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x014e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0155  */
    /* JADX WARN: Code duplicated, block: B:106:0x016e  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:80:0x0106  */
    /* JADX WARN: Code duplicated, block: B:81:0x010b  */
    /* JADX WARN: Code duplicated, block: B:91:0x012e  */
    /* JADX WARN: Code duplicated, block: B:95:0x013b  */
    public iniVyKd0OGb2raI4 w9sT1Swbhx3hs(Box5SCj0ZNnLNdOqQxT box5SCj0ZNnLNdOqQxT, D9RooUzwy6gf47M9NDX d9RooUzwy6gf47M9NDX) throws ProtocolException {
        sp6apkX00TawY02qGY6r sp6apkx00tawy02qgy6r;
        String strDDIMxZXP1V8HdM;
        iniVyKd0OGb2raI4 inivykd0ogb2rai4;
        JVe8d5JCsGlrBZvcax jVe8d5JCsGlrBZvcax;
        xc6AKez33c65zO xc6akez33c65zoDDIMxZXP1V8HdM;
        fUH025aw0Rgl fuh025aw0rglB1EoSIRjJHO5;
        boolean z;
        Box5SCj0ZNnLNdOqQxT box5SCj0ZNnLNdOqQxT2;
        zfPdbqrCOkdxWPAv zfpdbqrcokdxwpav;
        uob4giiHlHBr6F5NYv uob4giihlhbr6f5nyv = (d9RooUzwy6gf47M9NDX == null || (zfpdbqrcokdxwpav = (zfPdbqrCOkdxWPAv) d9RooUzwy6gf47M9NDX.Ee8d2j4S9Vm5yGuR) == null) ? null : zfpdbqrcokdxwpav.w9sT1Swbhx3hs;
        int i = box5SCj0ZNnLNdOqQxT.Ee8d2j4S9Vm5yGuR;
        String str = (String) box5SCj0ZNnLNdOqQxT.w9sT1Swbhx3hs.JXn4Qf7zpnLjP5;
        if (i == 307 || i == 308) {
            sp6apkx00tawy02qgy6r = (sp6apkX00TawY02qGY6r) this.w9sT1Swbhx3hs;
            if (sp6apkx00tawy02qgy6r.pyu8ovAipBTLYAiKab) {
                strDDIMxZXP1V8HdM = box5SCj0ZNnLNdOqQxT.ibVTtJUNfrGYbW.dDIMxZXP1V8HdM("Location");
                if (strDDIMxZXP1V8HdM == null) {
                    strDDIMxZXP1V8HdM = null;
                }
                inivykd0ogb2rai4 = box5SCj0ZNnLNdOqQxT.w9sT1Swbhx3hs;
                if (strDDIMxZXP1V8HdM != null) {
                    xc6AKez33c65zO xc6akez33c65zo = (xc6AKez33c65zO) inivykd0ogb2rai4.vekpFI4d1Nc4fakF;
                    xc6akez33c65zo.getClass();
                    try {
                        jVe8d5JCsGlrBZvcax = new JVe8d5JCsGlrBZvcax();
                        jVe8d5JCsGlrBZvcax.vekpFI4d1Nc4fakF(xc6akez33c65zo, strDDIMxZXP1V8HdM);
                    } catch (IllegalArgumentException unused) {
                        jVe8d5JCsGlrBZvcax = null;
                    }
                    if (jVe8d5JCsGlrBZvcax != null) {
                        xc6akez33c65zoDDIMxZXP1V8HdM = jVe8d5JCsGlrBZvcax.dDIMxZXP1V8HdM();
                    } else {
                        xc6akez33c65zoDDIMxZXP1V8HdM = null;
                    }
                    if (xc6akez33c65zoDDIMxZXP1V8HdM != null && (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(xc6akez33c65zoDDIMxZXP1V8HdM.dDIMxZXP1V8HdM, ((xc6AKez33c65zO) inivykd0ogb2rai4.vekpFI4d1Nc4fakF).dDIMxZXP1V8HdM) || sp6apkx00tawy02qgy6r.D5P1xCAyuvgF)) {
                        fuh025aw0rglB1EoSIRjJHO5 = inivykd0ogb2rai4.b1EoSIRjJHO5();
                        if (OFtLBiBbrrTHWu.DVTNwpDEVsUKuznof(str)) {
                            int i2 = box5SCj0ZNnLNdOqQxT.Ee8d2j4S9Vm5yGuR;
                            z = !str.equals("PROPFIND") || i2 == 308 || i2 == 307;
                            if (!str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                                fuh025aw0rglB1EoSIRjJHO5.ibVTtJUNfrGYbW(str, null);
                            } else {
                                fuh025aw0rglB1EoSIRjJHO5.ibVTtJUNfrGYbW("GET", null);
                            }
                            if (!z) {
                                fuh025aw0rglB1EoSIRjJHO5.pyu8ovAipBTLYAiKab("Transfer-Encoding");
                                fuh025aw0rglB1EoSIRjJHO5.pyu8ovAipBTLYAiKab("Content-Length");
                                fuh025aw0rglB1EoSIRjJHO5.pyu8ovAipBTLYAiKab("Content-Type");
                            }
                        }
                        if (!yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM((xc6AKez33c65zO) inivykd0ogb2rai4.vekpFI4d1Nc4fakF, xc6akez33c65zoDDIMxZXP1V8HdM)) {
                            fuh025aw0rglB1EoSIRjJHO5.pyu8ovAipBTLYAiKab("Authorization");
                        }
                        fuh025aw0rglB1EoSIRjJHO5.dDIMxZXP1V8HdM = xc6akez33c65zoDDIMxZXP1V8HdM;
                        return fuh025aw0rglB1EoSIRjJHO5.dDIMxZXP1V8HdM();
                    }
                }
            }
        } else {
            if (i == 401) {
                ((sp6apkX00TawY02qGY6r) this.w9sT1Swbhx3hs).b1EoSIRjJHO5.getClass();
                return null;
            }
            if (i != 421) {
                if (i == 503) {
                    Box5SCj0ZNnLNdOqQxT box5SCj0ZNnLNdOqQxT3 = box5SCj0ZNnLNdOqQxT.hjneShqpF9Tis4;
                    if ((box5SCj0ZNnLNdOqQxT3 == null || box5SCj0ZNnLNdOqQxT3.Ee8d2j4S9Vm5yGuR != 503) && JXn4Qf7zpnLjP5(box5SCj0ZNnLNdOqQxT, Integer.MAX_VALUE) == 0) {
                        return box5SCj0ZNnLNdOqQxT.w9sT1Swbhx3hs;
                    }
                } else {
                    if (i == 407) {
                        if (uob4giihlhbr6f5nyv.w9sT1Swbhx3hs.type() != Proxy.Type.HTTP) {
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                        ((sp6apkX00TawY02qGY6r) this.w9sT1Swbhx3hs).wotphlvK9sPbXJ.getClass();
                        return null;
                    }
                    if (i != 408) {
                        switch (i) {
                            case 300:
                            case 301:
                            case 302:
                            case 303:
                                sp6apkx00tawy02qgy6r = (sp6apkX00TawY02qGY6r) this.w9sT1Swbhx3hs;
                                if (sp6apkx00tawy02qgy6r.pyu8ovAipBTLYAiKab) {
                                    strDDIMxZXP1V8HdM = box5SCj0ZNnLNdOqQxT.ibVTtJUNfrGYbW.dDIMxZXP1V8HdM("Location");
                                    if (strDDIMxZXP1V8HdM == null) {
                                        strDDIMxZXP1V8HdM = null;
                                    }
                                    inivykd0ogb2rai4 = box5SCj0ZNnLNdOqQxT.w9sT1Swbhx3hs;
                                    if (strDDIMxZXP1V8HdM != null) {
                                        xc6AKez33c65zO xc6akez33c65zo2 = (xc6AKez33c65zO) inivykd0ogb2rai4.vekpFI4d1Nc4fakF;
                                        xc6akez33c65zo2.getClass();
                                        jVe8d5JCsGlrBZvcax = new JVe8d5JCsGlrBZvcax();
                                        jVe8d5JCsGlrBZvcax.vekpFI4d1Nc4fakF(xc6akez33c65zo2, strDDIMxZXP1V8HdM);
                                        if (jVe8d5JCsGlrBZvcax != null) {
                                            xc6akez33c65zoDDIMxZXP1V8HdM = jVe8d5JCsGlrBZvcax.dDIMxZXP1V8HdM();
                                        } else {
                                            xc6akez33c65zoDDIMxZXP1V8HdM = null;
                                        }
                                        if (xc6akez33c65zoDDIMxZXP1V8HdM != null) {
                                            fuh025aw0rglB1EoSIRjJHO5 = inivykd0ogb2rai4.b1EoSIRjJHO5();
                                            if (OFtLBiBbrrTHWu.DVTNwpDEVsUKuznof(str)) {
                                                int i3 = box5SCj0ZNnLNdOqQxT.Ee8d2j4S9Vm5yGuR;
                                                if (str.equals("PROPFIND")) {
                                                }
                                                if (str.equals("PROPFIND")) {
                                                    fuh025aw0rglB1EoSIRjJHO5.ibVTtJUNfrGYbW(str, null);
                                                } else {
                                                    fuh025aw0rglB1EoSIRjJHO5.ibVTtJUNfrGYbW(str, null);
                                                }
                                                if (!z) {
                                                    fuh025aw0rglB1EoSIRjJHO5.pyu8ovAipBTLYAiKab("Transfer-Encoding");
                                                    fuh025aw0rglB1EoSIRjJHO5.pyu8ovAipBTLYAiKab("Content-Length");
                                                    fuh025aw0rglB1EoSIRjJHO5.pyu8ovAipBTLYAiKab("Content-Type");
                                                }
                                            }
                                            if (!yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM((xc6AKez33c65zO) inivykd0ogb2rai4.vekpFI4d1Nc4fakF, xc6akez33c65zoDDIMxZXP1V8HdM)) {
                                                fuh025aw0rglB1EoSIRjJHO5.pyu8ovAipBTLYAiKab("Authorization");
                                            }
                                            fuh025aw0rglB1EoSIRjJHO5.dDIMxZXP1V8HdM = xc6akez33c65zoDDIMxZXP1V8HdM;
                                            return fuh025aw0rglB1EoSIRjJHO5.dDIMxZXP1V8HdM();
                                        }
                                    }
                                }
                            default:
                                return null;
                        }
                    } else if (((sp6apkX00TawY02qGY6r) this.w9sT1Swbhx3hs).ibVTtJUNfrGYbW && (((box5SCj0ZNnLNdOqQxT2 = box5SCj0ZNnLNdOqQxT.hjneShqpF9Tis4) == null || box5SCj0ZNnLNdOqQxT2.Ee8d2j4S9Vm5yGuR != 408) && JXn4Qf7zpnLjP5(box5SCj0ZNnLNdOqQxT, 0) <= 0)) {
                        return box5SCj0ZNnLNdOqQxT.w9sT1Swbhx3hs;
                    }
                }
            } else if (d9RooUzwy6gf47M9NDX != null && !okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(((VEkRsTDS6a9oHWI) ((eDfRIe8Yxow8) d9RooUzwy6gf47M9NDX.vekpFI4d1Nc4fakF).Ee8d2j4S9Vm5yGuR).b1EoSIRjJHO5.JXn4Qf7zpnLjP5, ((zfPdbqrCOkdxWPAv) d9RooUzwy6gf47M9NDX.Ee8d2j4S9Vm5yGuR).w9sT1Swbhx3hs.dDIMxZXP1V8HdM.b1EoSIRjJHO5.JXn4Qf7zpnLjP5)) {
                zfPdbqrCOkdxWPAv zfpdbqrcokdxwpav2 = (zfPdbqrCOkdxWPAv) d9RooUzwy6gf47M9NDX.Ee8d2j4S9Vm5yGuR;
                synchronized (zfpdbqrcokdxwpav2) {
                    zfpdbqrcokdxwpav2.hjneShqpF9Tis4 = true;
                }
                return box5SCj0ZNnLNdOqQxT.w9sT1Swbhx3hs;
            }
        }
        return null;
    }
}
