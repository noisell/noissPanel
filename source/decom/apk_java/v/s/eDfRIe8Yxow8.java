package v.s;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class eDfRIe8Yxow8 {
    public final Object Ee8d2j4S9Vm5yGuR;
    public final Object JXn4Qf7zpnLjP5;
    public Object b1EoSIRjJHO5;
    public int dDIMxZXP1V8HdM;
    public Object ibVTtJUNfrGYbW;
    public Object pyu8ovAipBTLYAiKab;
    public int vekpFI4d1Nc4fakF;
    public int w9sT1Swbhx3hs;
    public final Object xDyLpEZyrcKVe0;

    public eDfRIe8Yxow8(AfJGc52iVl6Gj afJGc52iVl6Gj) {
        this.JXn4Qf7zpnLjP5 = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new h2asZwzesjZZDy(false));
        this.Ee8d2j4S9Vm5yGuR = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new h2asZwzesjZZDy(true));
        this.xDyLpEZyrcKVe0 = new fEyMFFyOOvHURJ7To6L(17);
        this.ibVTtJUNfrGYbW = new CnoOvV7IQM0UcSfbVg();
        this.b1EoSIRjJHO5 = fadfsJa4iEdiwEC4Xm8.pyu8ovAipBTLYAiKab;
        this.pyu8ovAipBTLYAiKab = new r5XEUfod5GSCCwq6c(6);
        int i = afJGc52iVl6Gj.dDIMxZXP1V8HdM;
        this.dDIMxZXP1V8HdM = Integer.MAX_VALUE;
        this.vekpFI4d1Nc4fakF = 20;
        this.w9sT1Swbhx3hs = 8;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:127:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:129:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:130:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:132:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:141:0x034c  */
    /* JADX WARN: Code duplicated, block: B:142:0x035d  */
    /* JADX WARN: Code duplicated, block: B:184:0x0331 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x035e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x03e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x028b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x03d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x03d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0089  */
    /* JADX WARN: Code duplicated, block: B:35:0x0090  */
    /* JADX WARN: Code duplicated, block: B:37:0x0096  */
    /* JADX WARN: Code duplicated, block: B:39:0x009b  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:56:0x0104  */
    /* JADX WARN: Code duplicated, block: B:58:0x0117  */
    /* JADX WARN: Code duplicated, block: B:72:0x017c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [char, int] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, java.util.List] */
    public zfPdbqrCOkdxWPAv dDIMxZXP1V8HdM(int i, int i2, int i3, int i4, boolean z, boolean z2) throws IOException {
        uob4giiHlHBr6F5NYv uob4giihlhbr6f5nyv;
        OLiXdgIH3STgCLxE6Pzb oLiXdgIH3STgCLxE6Pzb;
        lqtgH1LJNxLx lqtgh1ljnxlx;
        ArrayList arrayList;
        OLiXdgIH3STgCLxE6Pzb oLiXdgIH3STgCLxE6Pzb2;
        VEkRsTDS6a9oHWI vEkRsTDS6a9oHWI;
        Proxy proxy;
        String hostName;
        int port;
        List arrayList2;
        List listSingletonList;
        boolean zContains;
        zfPdbqrCOkdxWPAv zfpdbqrcokdxwpav;
        r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c;
        Socket socketPyu8ovAipBTLYAiKab;
        while (!((VdAulbq7zlVjr545h) this.xDyLpEZyrcKVe0).Qrz92kRPw4GcghAc) {
            zfPdbqrCOkdxWPAv zfpdbqrcokdxwpav2 = ((VdAulbq7zlVjr545h) this.xDyLpEZyrcKVe0).pyu8ovAipBTLYAiKab;
            if (zfpdbqrcokdxwpav2 != null) {
                synchronized (zfpdbqrcokdxwpav2) {
                    try {
                        if (!zfpdbqrcokdxwpav2.D5P1xCAyuvgF) {
                            xc6AKez33c65zO xc6akez33c65zo = zfpdbqrcokdxwpav2.w9sT1Swbhx3hs.dDIMxZXP1V8HdM.b1EoSIRjJHO5;
                            xc6AKez33c65zO xc6akez33c65zo2 = ((VEkRsTDS6a9oHWI) this.Ee8d2j4S9Vm5yGuR).b1EoSIRjJHO5;
                            socketPyu8ovAipBTLYAiKab = !(xc6akez33c65zo.Ee8d2j4S9Vm5yGuR == xc6akez33c65zo2.Ee8d2j4S9Vm5yGuR && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(xc6akez33c65zo.JXn4Qf7zpnLjP5, xc6akez33c65zo2.JXn4Qf7zpnLjP5)) ? ((VdAulbq7zlVjr545h) this.xDyLpEZyrcKVe0).pyu8ovAipBTLYAiKab() : null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (((VdAulbq7zlVjr545h) this.xDyLpEZyrcKVe0).pyu8ovAipBTLYAiKab == null) {
                    if (socketPyu8ovAipBTLYAiKab != null) {
                        yrMnf4fyLGfIJbMg8IbG.JXn4Qf7zpnLjP5(socketPyu8ovAipBTLYAiKab);
                    }
                    this.dDIMxZXP1V8HdM = 0;
                    this.w9sT1Swbhx3hs = 0;
                    this.vekpFI4d1Nc4fakF = 0;
                    if (((AW3ZFVDOCYNQG2ry0h) this.JXn4Qf7zpnLjP5).dDIMxZXP1V8HdM((VEkRsTDS6a9oHWI) this.Ee8d2j4S9Vm5yGuR, (VdAulbq7zlVjr545h) this.xDyLpEZyrcKVe0, null, false)) {
                        zfpdbqrcokdxwpav2 = ((VdAulbq7zlVjr545h) this.xDyLpEZyrcKVe0).pyu8ovAipBTLYAiKab;
                    } else {
                        uob4giihlhbr6f5nyv = (uob4giiHlHBr6F5NYv) this.pyu8ovAipBTLYAiKab;
                        try {
                            if (uob4giihlhbr6f5nyv != null) {
                                this.pyu8ovAipBTLYAiKab = null;
                            } else {
                                oLiXdgIH3STgCLxE6Pzb = (OLiXdgIH3STgCLxE6Pzb) this.ibVTtJUNfrGYbW;
                                if (oLiXdgIH3STgCLxE6Pzb == null && oLiXdgIH3STgCLxE6Pzb.dDIMxZXP1V8HdM()) {
                                    OLiXdgIH3STgCLxE6Pzb oLiXdgIH3STgCLxE6Pzb3 = (OLiXdgIH3STgCLxE6Pzb) this.ibVTtJUNfrGYbW;
                                    if (!oLiXdgIH3STgCLxE6Pzb3.dDIMxZXP1V8HdM()) {
                                        throw new NoSuchElementException();
                                    }
                                    ArrayList arrayList3 = (ArrayList) oLiXdgIH3STgCLxE6Pzb3.w9sT1Swbhx3hs;
                                    int i5 = oLiXdgIH3STgCLxE6Pzb3.dDIMxZXP1V8HdM;
                                    oLiXdgIH3STgCLxE6Pzb3.dDIMxZXP1V8HdM = i5 + 1;
                                    uob4giihlhbr6f5nyv = (uob4giiHlHBr6F5NYv) arrayList3.get(i5);
                                } else {
                                    lqtgh1ljnxlx = (lqtgH1LJNxLx) this.b1EoSIRjJHO5;
                                    if (lqtgh1ljnxlx == null) {
                                        VEkRsTDS6a9oHWI vEkRsTDS6a9oHWI2 = (VEkRsTDS6a9oHWI) this.Ee8d2j4S9Vm5yGuR;
                                        VdAulbq7zlVjr545h vdAulbq7zlVjr545h = (VdAulbq7zlVjr545h) this.xDyLpEZyrcKVe0;
                                        lqtgh1ljnxlx = new lqtgH1LJNxLx(vEkRsTDS6a9oHWI2, vdAulbq7zlVjr545h.w9sT1Swbhx3hs.rCHnHJBAlOpNI5, vdAulbq7zlVjr545h);
                                        this.b1EoSIRjJHO5 = lqtgh1ljnxlx;
                                    }
                                    if (lqtgh1ljnxlx.b1EoSIRjJHO5()) {
                                        throw new NoSuchElementException();
                                    }
                                    arrayList = new ArrayList();
                                    while (lqtgh1ljnxlx.dDIMxZXP1V8HdM < ((List) lqtgh1ljnxlx.JXn4Qf7zpnLjP5).size()) {
                                        vEkRsTDS6a9oHWI = (VEkRsTDS6a9oHWI) lqtgh1ljnxlx.w9sT1Swbhx3hs;
                                        if (lqtgh1ljnxlx.dDIMxZXP1V8HdM < ((List) lqtgh1ljnxlx.JXn4Qf7zpnLjP5).size()) {
                                            throw new SocketException("No route to " + vEkRsTDS6a9oHWI.b1EoSIRjJHO5.JXn4Qf7zpnLjP5 + "; exhausted proxy configurations: " + ((List) lqtgh1ljnxlx.JXn4Qf7zpnLjP5));
                                        }
                                        List list = (List) lqtgh1ljnxlx.JXn4Qf7zpnLjP5;
                                        int i6 = lqtgh1ljnxlx.dDIMxZXP1V8HdM;
                                        lqtgh1ljnxlx.dDIMxZXP1V8HdM = i6 + 1;
                                        proxy = (Proxy) list.get(i6);
                                        ArrayList arrayList4 = new ArrayList();
                                        lqtgh1ljnxlx.Ee8d2j4S9Vm5yGuR = arrayList4;
                                        if (proxy.type() != Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                            xc6AKez33c65zO xc6akez33c65zo3 = vEkRsTDS6a9oHWI.b1EoSIRjJHO5;
                                            hostName = xc6akez33c65zo3.JXn4Qf7zpnLjP5;
                                            port = xc6akez33c65zo3.Ee8d2j4S9Vm5yGuR;
                                        } else {
                                            SocketAddress socketAddressAddress = proxy.address();
                                            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                                                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass()).toString());
                                            }
                                            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                                            InetAddress address = inetSocketAddress.getAddress();
                                            hostName = address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
                                            port = inetSocketAddress.getPort();
                                        }
                                        if (1 <= port || port >= 65536) {
                                            throw new SocketException("No route to " + hostName + ((char) (96 - 38)) + port + "; port is out of range");
                                        }
                                        if (proxy.type() == Proxy.Type.SOCKS) {
                                            arrayList4.add(InetSocketAddress.createUnresolved(hostName, port));
                                        } else {
                                            if (yrMnf4fyLGfIJbMg8IbG.Ee8d2j4S9Vm5yGuR.w9sT1Swbhx3hs(hostName)) {
                                                listSingletonList = Collections.singletonList(InetAddress.getByName(hostName));
                                            } else {
                                                vEkRsTDS6a9oHWI.dDIMxZXP1V8HdM.getClass();
                                                try {
                                                    InetAddress[] allByName = InetAddress.getAllByName(hostName);
                                                    int length = allByName.length;
                                                    if (length != 0) {
                                                        arrayList2 = length != 1 ? new ArrayList(new GUsyOYEIobMSb6n(allByName, false)) : Collections.singletonList(allByName[0]);
                                                    } else {
                                                        arrayList2 = qkzRt1s9DJNNYwsqt.w9sT1Swbhx3hs;
                                                    }
                                                    if (arrayList2.isEmpty()) {
                                                        throw new UnknownHostException(vEkRsTDS6a9oHWI.dDIMxZXP1V8HdM + " returned no addresses for " + hostName);
                                                    }
                                                    listSingletonList = arrayList2;
                                                } catch (NullPointerException e) {
                                                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostName));
                                                    unknownHostException.initCause(e);
                                                    throw unknownHostException;
                                                }
                                            }
                                            Iterator it = listSingletonList.iterator();
                                            while (it.hasNext()) {
                                                arrayList4.add(new InetSocketAddress((InetAddress) it.next(), port));
                                            }
                                        }
                                        Iterator it2 = lqtgh1ljnxlx.Ee8d2j4S9Vm5yGuR.iterator();
                                        while (it2.hasNext()) {
                                            uob4giiHlHBr6F5NYv uob4giihlhbr6f5nyv2 = new uob4giiHlHBr6F5NYv((VEkRsTDS6a9oHWI) lqtgh1ljnxlx.w9sT1Swbhx3hs, proxy, (InetSocketAddress) it2.next());
                                            r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c2 = (r5XEUfod5GSCCwq6c) lqtgh1ljnxlx.vekpFI4d1Nc4fakF;
                                            synchronized (r5xeufod5gsccwq6c2) {
                                                zContains = ((LinkedHashSet) r5xeufod5gsccwq6c2.vekpFI4d1Nc4fakF).contains(uob4giihlhbr6f5nyv2);
                                            }
                                            if (zContains) {
                                                ((ArrayList) lqtgh1ljnxlx.xDyLpEZyrcKVe0).add(uob4giihlhbr6f5nyv2);
                                            } else {
                                                arrayList.add(uob4giihlhbr6f5nyv2);
                                            }
                                        }
                                        if (!arrayList.isEmpty()) {
                                            break;
                                        }
                                    }
                                    if (arrayList.isEmpty()) {
                                        O0DzWbzyYI2BykPDCod.tne6mXOUFKdd(arrayList, (ArrayList) lqtgh1ljnxlx.xDyLpEZyrcKVe0);
                                        ((ArrayList) lqtgh1ljnxlx.xDyLpEZyrcKVe0).clear();
                                    }
                                    oLiXdgIH3STgCLxE6Pzb2 = new OLiXdgIH3STgCLxE6Pzb(arrayList);
                                    this.ibVTtJUNfrGYbW = oLiXdgIH3STgCLxE6Pzb2;
                                    if (!((VdAulbq7zlVjr545h) this.xDyLpEZyrcKVe0).Qrz92kRPw4GcghAc) {
                                        throw new IOException("Canceled");
                                    }
                                    if (((AW3ZFVDOCYNQG2ry0h) this.JXn4Qf7zpnLjP5).dDIMxZXP1V8HdM((VEkRsTDS6a9oHWI) this.Ee8d2j4S9Vm5yGuR, (VdAulbq7zlVjr545h) this.xDyLpEZyrcKVe0, arrayList, false)) {
                                        zfpdbqrcokdxwpav2 = ((VdAulbq7zlVjr545h) this.xDyLpEZyrcKVe0).pyu8ovAipBTLYAiKab;
                                    } else {
                                        if (oLiXdgIH3STgCLxE6Pzb2.dDIMxZXP1V8HdM()) {
                                            throw new NoSuchElementException();
                                        }
                                        int i7 = oLiXdgIH3STgCLxE6Pzb2.dDIMxZXP1V8HdM;
                                        oLiXdgIH3STgCLxE6Pzb2.dDIMxZXP1V8HdM = i7 + 1;
                                        uob4giihlhbr6f5nyv = (uob4giiHlHBr6F5NYv) arrayList.get(i7);
                                        zfpdbqrcokdxwpav = new zfPdbqrCOkdxWPAv(uob4giihlhbr6f5nyv);
                                        ((VdAulbq7zlVjr545h) this.xDyLpEZyrcKVe0).J0zjQ7CAgohuxU20eCW6 = zfpdbqrcokdxwpav;
                                        zfpdbqrcokdxwpav.vekpFI4d1Nc4fakF(i, i2, i3, i4, z, (VdAulbq7zlVjr545h) this.xDyLpEZyrcKVe0);
                                        ((VdAulbq7zlVjr545h) this.xDyLpEZyrcKVe0).J0zjQ7CAgohuxU20eCW6 = null;
                                        r5xeufod5gsccwq6c = ((VdAulbq7zlVjr545h) this.xDyLpEZyrcKVe0).w9sT1Swbhx3hs.rCHnHJBAlOpNI5;
                                        synchronized (r5xeufod5gsccwq6c) {
                                            ((LinkedHashSet) r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF).remove(uob4giihlhbr6f5nyv);
                                        }
                                        if (((AW3ZFVDOCYNQG2ry0h) this.JXn4Qf7zpnLjP5).dDIMxZXP1V8HdM((VEkRsTDS6a9oHWI) this.Ee8d2j4S9Vm5yGuR, (VdAulbq7zlVjr545h) this.xDyLpEZyrcKVe0, arrayList, true)) {
                                            zfPdbqrCOkdxWPAv zfpdbqrcokdxwpav3 = ((VdAulbq7zlVjr545h) this.xDyLpEZyrcKVe0).pyu8ovAipBTLYAiKab;
                                            this.pyu8ovAipBTLYAiKab = uob4giihlhbr6f5nyv;
                                            yrMnf4fyLGfIJbMg8IbG.JXn4Qf7zpnLjP5(zfpdbqrcokdxwpav.JXn4Qf7zpnLjP5);
                                            zfpdbqrcokdxwpav2 = zfpdbqrcokdxwpav3;
                                        } else {
                                            synchronized (zfpdbqrcokdxwpav) {
                                                AW3ZFVDOCYNQG2ry0h aW3ZFVDOCYNQG2ry0h = (AW3ZFVDOCYNQG2ry0h) this.JXn4Qf7zpnLjP5;
                                                aW3ZFVDOCYNQG2ry0h.getClass();
                                                byte[] bArr = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
                                                aW3ZFVDOCYNQG2ry0h.JXn4Qf7zpnLjP5.add(zfpdbqrcokdxwpav);
                                                aW3ZFVDOCYNQG2ry0h.w9sT1Swbhx3hs.vekpFI4d1Nc4fakF(aW3ZFVDOCYNQG2ry0h.vekpFI4d1Nc4fakF, 0L);
                                                ((VdAulbq7zlVjr545h) this.xDyLpEZyrcKVe0).w9sT1Swbhx3hs(zfpdbqrcokdxwpav);
                                            }
                                            zfpdbqrcokdxwpav2 = zfpdbqrcokdxwpav;
                                        }
                                    }
                                }
                            }
                            zfpdbqrcokdxwpav.vekpFI4d1Nc4fakF(i, i2, i3, i4, z, (VdAulbq7zlVjr545h) this.xDyLpEZyrcKVe0);
                            ((VdAulbq7zlVjr545h) this.xDyLpEZyrcKVe0).J0zjQ7CAgohuxU20eCW6 = null;
                            r5xeufod5gsccwq6c = ((VdAulbq7zlVjr545h) this.xDyLpEZyrcKVe0).w9sT1Swbhx3hs.rCHnHJBAlOpNI5;
                            synchronized (r5xeufod5gsccwq6c) {
                                ((LinkedHashSet) r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF).remove(uob4giihlhbr6f5nyv);
                                if (((AW3ZFVDOCYNQG2ry0h) this.JXn4Qf7zpnLjP5).dDIMxZXP1V8HdM((VEkRsTDS6a9oHWI) this.Ee8d2j4S9Vm5yGuR, (VdAulbq7zlVjr545h) this.xDyLpEZyrcKVe0, arrayList, true)) {
                                    zfPdbqrCOkdxWPAv zfpdbqrcokdxwpav4 = ((VdAulbq7zlVjr545h) this.xDyLpEZyrcKVe0).pyu8ovAipBTLYAiKab;
                                    this.pyu8ovAipBTLYAiKab = uob4giihlhbr6f5nyv;
                                    yrMnf4fyLGfIJbMg8IbG.JXn4Qf7zpnLjP5(zfpdbqrcokdxwpav.JXn4Qf7zpnLjP5);
                                    zfpdbqrcokdxwpav2 = zfpdbqrcokdxwpav4;
                                } else {
                                    synchronized (zfpdbqrcokdxwpav) {
                                        AW3ZFVDOCYNQG2ry0h aW3ZFVDOCYNQG2ry0h2 = (AW3ZFVDOCYNQG2ry0h) this.JXn4Qf7zpnLjP5;
                                        aW3ZFVDOCYNQG2ry0h2.getClass();
                                        byte[] bArr2 = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
                                        aW3ZFVDOCYNQG2ry0h2.JXn4Qf7zpnLjP5.add(zfpdbqrcokdxwpav);
                                        aW3ZFVDOCYNQG2ry0h2.w9sT1Swbhx3hs.vekpFI4d1Nc4fakF(aW3ZFVDOCYNQG2ry0h2.vekpFI4d1Nc4fakF, 0L);
                                        ((VdAulbq7zlVjr545h) this.xDyLpEZyrcKVe0).w9sT1Swbhx3hs(zfpdbqrcokdxwpav);
                                        zfpdbqrcokdxwpav2 = zfpdbqrcokdxwpav;
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            ((VdAulbq7zlVjr545h) this.xDyLpEZyrcKVe0).J0zjQ7CAgohuxU20eCW6 = null;
                            throw th2;
                        }
                        arrayList = null;
                        zfpdbqrcokdxwpav = new zfPdbqrCOkdxWPAv(uob4giihlhbr6f5nyv);
                        ((VdAulbq7zlVjr545h) this.xDyLpEZyrcKVe0).J0zjQ7CAgohuxU20eCW6 = zfpdbqrcokdxwpav;
                    }
                } else if (socketPyu8ovAipBTLYAiKab != null) {
                    throw new IllegalStateException("Check failed.");
                }
            } else {
                this.dDIMxZXP1V8HdM = 0;
                this.w9sT1Swbhx3hs = 0;
                this.vekpFI4d1Nc4fakF = 0;
                if (((AW3ZFVDOCYNQG2ry0h) this.JXn4Qf7zpnLjP5).dDIMxZXP1V8HdM((VEkRsTDS6a9oHWI) this.Ee8d2j4S9Vm5yGuR, (VdAulbq7zlVjr545h) this.xDyLpEZyrcKVe0, null, false)) {
                    zfpdbqrcokdxwpav2 = ((VdAulbq7zlVjr545h) this.xDyLpEZyrcKVe0).pyu8ovAipBTLYAiKab;
                } else {
                    uob4giihlhbr6f5nyv = (uob4giiHlHBr6F5NYv) this.pyu8ovAipBTLYAiKab;
                    if (uob4giihlhbr6f5nyv != null) {
                        this.pyu8ovAipBTLYAiKab = null;
                    } else {
                        oLiXdgIH3STgCLxE6Pzb = (OLiXdgIH3STgCLxE6Pzb) this.ibVTtJUNfrGYbW;
                        if (oLiXdgIH3STgCLxE6Pzb == null) {
                        }
                        lqtgh1ljnxlx = (lqtgH1LJNxLx) this.b1EoSIRjJHO5;
                        if (lqtgh1ljnxlx == null) {
                            VEkRsTDS6a9oHWI vEkRsTDS6a9oHWI3 = (VEkRsTDS6a9oHWI) this.Ee8d2j4S9Vm5yGuR;
                            VdAulbq7zlVjr545h vdAulbq7zlVjr545h2 = (VdAulbq7zlVjr545h) this.xDyLpEZyrcKVe0;
                            lqtgh1ljnxlx = new lqtgH1LJNxLx(vEkRsTDS6a9oHWI3, vdAulbq7zlVjr545h2.w9sT1Swbhx3hs.rCHnHJBAlOpNI5, vdAulbq7zlVjr545h2);
                            this.b1EoSIRjJHO5 = lqtgh1ljnxlx;
                        }
                        if (lqtgh1ljnxlx.b1EoSIRjJHO5()) {
                            throw new NoSuchElementException();
                        }
                        arrayList = new ArrayList();
                        while (lqtgh1ljnxlx.dDIMxZXP1V8HdM < ((List) lqtgh1ljnxlx.JXn4Qf7zpnLjP5).size()) {
                            vEkRsTDS6a9oHWI = (VEkRsTDS6a9oHWI) lqtgh1ljnxlx.w9sT1Swbhx3hs;
                            if (lqtgh1ljnxlx.dDIMxZXP1V8HdM < ((List) lqtgh1ljnxlx.JXn4Qf7zpnLjP5).size()) {
                                throw new SocketException("No route to " + vEkRsTDS6a9oHWI.b1EoSIRjJHO5.JXn4Qf7zpnLjP5 + "; exhausted proxy configurations: " + ((List) lqtgh1ljnxlx.JXn4Qf7zpnLjP5));
                            }
                            List list2 = (List) lqtgh1ljnxlx.JXn4Qf7zpnLjP5;
                            int i8 = lqtgh1ljnxlx.dDIMxZXP1V8HdM;
                            lqtgh1ljnxlx.dDIMxZXP1V8HdM = i8 + 1;
                            proxy = (Proxy) list2.get(i8);
                            ArrayList arrayList5 = new ArrayList();
                            lqtgh1ljnxlx.Ee8d2j4S9Vm5yGuR = arrayList5;
                            if (proxy.type() != Proxy.Type.DIRECT) {
                                xc6AKez33c65zO xc6akez33c65zo4 = vEkRsTDS6a9oHWI.b1EoSIRjJHO5;
                                hostName = xc6akez33c65zo4.JXn4Qf7zpnLjP5;
                                port = xc6akez33c65zo4.Ee8d2j4S9Vm5yGuR;
                            } else {
                                xc6AKez33c65zO xc6akez33c65zo5 = vEkRsTDS6a9oHWI.b1EoSIRjJHO5;
                                hostName = xc6akez33c65zo5.JXn4Qf7zpnLjP5;
                                port = xc6akez33c65zo5.Ee8d2j4S9Vm5yGuR;
                            }
                            if (1 <= port) {
                            }
                            throw new SocketException("No route to " + hostName + ((char) (96 - 38)) + port + "; port is out of range");
                        }
                        if (arrayList.isEmpty()) {
                            O0DzWbzyYI2BykPDCod.tne6mXOUFKdd(arrayList, (ArrayList) lqtgh1ljnxlx.xDyLpEZyrcKVe0);
                            ((ArrayList) lqtgh1ljnxlx.xDyLpEZyrcKVe0).clear();
                        }
                        oLiXdgIH3STgCLxE6Pzb2 = new OLiXdgIH3STgCLxE6Pzb(arrayList);
                        this.ibVTtJUNfrGYbW = oLiXdgIH3STgCLxE6Pzb2;
                        if (!((VdAulbq7zlVjr545h) this.xDyLpEZyrcKVe0).Qrz92kRPw4GcghAc) {
                            throw new IOException("Canceled");
                        }
                        if (((AW3ZFVDOCYNQG2ry0h) this.JXn4Qf7zpnLjP5).dDIMxZXP1V8HdM((VEkRsTDS6a9oHWI) this.Ee8d2j4S9Vm5yGuR, (VdAulbq7zlVjr545h) this.xDyLpEZyrcKVe0, arrayList, false)) {
                            zfpdbqrcokdxwpav2 = ((VdAulbq7zlVjr545h) this.xDyLpEZyrcKVe0).pyu8ovAipBTLYAiKab;
                        } else {
                            if (oLiXdgIH3STgCLxE6Pzb2.dDIMxZXP1V8HdM()) {
                                throw new NoSuchElementException();
                            }
                            int i9 = oLiXdgIH3STgCLxE6Pzb2.dDIMxZXP1V8HdM;
                            oLiXdgIH3STgCLxE6Pzb2.dDIMxZXP1V8HdM = i9 + 1;
                            uob4giihlhbr6f5nyv = (uob4giiHlHBr6F5NYv) arrayList.get(i9);
                            zfpdbqrcokdxwpav = new zfPdbqrCOkdxWPAv(uob4giihlhbr6f5nyv);
                            ((VdAulbq7zlVjr545h) this.xDyLpEZyrcKVe0).J0zjQ7CAgohuxU20eCW6 = zfpdbqrcokdxwpav;
                            zfpdbqrcokdxwpav.vekpFI4d1Nc4fakF(i, i2, i3, i4, z, (VdAulbq7zlVjr545h) this.xDyLpEZyrcKVe0);
                            ((VdAulbq7zlVjr545h) this.xDyLpEZyrcKVe0).J0zjQ7CAgohuxU20eCW6 = null;
                            r5xeufod5gsccwq6c = ((VdAulbq7zlVjr545h) this.xDyLpEZyrcKVe0).w9sT1Swbhx3hs.rCHnHJBAlOpNI5;
                            synchronized (r5xeufod5gsccwq6c) {
                                ((LinkedHashSet) r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF).remove(uob4giihlhbr6f5nyv);
                                if (((AW3ZFVDOCYNQG2ry0h) this.JXn4Qf7zpnLjP5).dDIMxZXP1V8HdM((VEkRsTDS6a9oHWI) this.Ee8d2j4S9Vm5yGuR, (VdAulbq7zlVjr545h) this.xDyLpEZyrcKVe0, arrayList, true)) {
                                    zfPdbqrCOkdxWPAv zfpdbqrcokdxwpav5 = ((VdAulbq7zlVjr545h) this.xDyLpEZyrcKVe0).pyu8ovAipBTLYAiKab;
                                    this.pyu8ovAipBTLYAiKab = uob4giihlhbr6f5nyv;
                                    yrMnf4fyLGfIJbMg8IbG.JXn4Qf7zpnLjP5(zfpdbqrcokdxwpav.JXn4Qf7zpnLjP5);
                                    zfpdbqrcokdxwpav2 = zfpdbqrcokdxwpav5;
                                } else {
                                    synchronized (zfpdbqrcokdxwpav) {
                                        AW3ZFVDOCYNQG2ry0h aW3ZFVDOCYNQG2ry0h3 = (AW3ZFVDOCYNQG2ry0h) this.JXn4Qf7zpnLjP5;
                                        aW3ZFVDOCYNQG2ry0h3.getClass();
                                        byte[] bArr3 = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
                                        aW3ZFVDOCYNQG2ry0h3.JXn4Qf7zpnLjP5.add(zfpdbqrcokdxwpav);
                                        aW3ZFVDOCYNQG2ry0h3.w9sT1Swbhx3hs.vekpFI4d1Nc4fakF(aW3ZFVDOCYNQG2ry0h3.vekpFI4d1Nc4fakF, 0L);
                                        ((VdAulbq7zlVjr545h) this.xDyLpEZyrcKVe0).w9sT1Swbhx3hs(zfpdbqrcokdxwpav);
                                        zfpdbqrcokdxwpav2 = zfpdbqrcokdxwpav;
                                    }
                                }
                            }
                        }
                    }
                    arrayList = null;
                    zfpdbqrcokdxwpav = new zfPdbqrCOkdxWPAv(uob4giihlhbr6f5nyv);
                    ((VdAulbq7zlVjr545h) this.xDyLpEZyrcKVe0).J0zjQ7CAgohuxU20eCW6 = zfpdbqrcokdxwpav;
                    zfpdbqrcokdxwpav.vekpFI4d1Nc4fakF(i, i2, i3, i4, z, (VdAulbq7zlVjr545h) this.xDyLpEZyrcKVe0);
                    ((VdAulbq7zlVjr545h) this.xDyLpEZyrcKVe0).J0zjQ7CAgohuxU20eCW6 = null;
                    r5xeufod5gsccwq6c = ((VdAulbq7zlVjr545h) this.xDyLpEZyrcKVe0).w9sT1Swbhx3hs.rCHnHJBAlOpNI5;
                    synchronized (r5xeufod5gsccwq6c) {
                        ((LinkedHashSet) r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF).remove(uob4giihlhbr6f5nyv);
                        if (((AW3ZFVDOCYNQG2ry0h) this.JXn4Qf7zpnLjP5).dDIMxZXP1V8HdM((VEkRsTDS6a9oHWI) this.Ee8d2j4S9Vm5yGuR, (VdAulbq7zlVjr545h) this.xDyLpEZyrcKVe0, arrayList, true)) {
                            zfPdbqrCOkdxWPAv zfpdbqrcokdxwpav6 = ((VdAulbq7zlVjr545h) this.xDyLpEZyrcKVe0).pyu8ovAipBTLYAiKab;
                            this.pyu8ovAipBTLYAiKab = uob4giihlhbr6f5nyv;
                            yrMnf4fyLGfIJbMg8IbG.JXn4Qf7zpnLjP5(zfpdbqrcokdxwpav.JXn4Qf7zpnLjP5);
                            zfpdbqrcokdxwpav2 = zfpdbqrcokdxwpav6;
                        } else {
                            synchronized (zfpdbqrcokdxwpav) {
                                AW3ZFVDOCYNQG2ry0h aW3ZFVDOCYNQG2ry0h4 = (AW3ZFVDOCYNQG2ry0h) this.JXn4Qf7zpnLjP5;
                                aW3ZFVDOCYNQG2ry0h4.getClass();
                                byte[] bArr4 = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
                                aW3ZFVDOCYNQG2ry0h4.JXn4Qf7zpnLjP5.add(zfpdbqrcokdxwpav);
                                aW3ZFVDOCYNQG2ry0h4.w9sT1Swbhx3hs.vekpFI4d1Nc4fakF(aW3ZFVDOCYNQG2ry0h4.vekpFI4d1Nc4fakF, 0L);
                                ((VdAulbq7zlVjr545h) this.xDyLpEZyrcKVe0).w9sT1Swbhx3hs(zfpdbqrcokdxwpav);
                                zfpdbqrcokdxwpav2 = zfpdbqrcokdxwpav;
                            }
                        }
                    }
                }
            }
            if (zfpdbqrcokdxwpav2.pyu8ovAipBTLYAiKab(z2)) {
                return zfpdbqrcokdxwpav2;
            }
            zfpdbqrcokdxwpav2.hjneShqpF9Tis4();
            if (((uob4giiHlHBr6F5NYv) this.pyu8ovAipBTLYAiKab) == null) {
                OLiXdgIH3STgCLxE6Pzb oLiXdgIH3STgCLxE6Pzb4 = (OLiXdgIH3STgCLxE6Pzb) this.ibVTtJUNfrGYbW;
                if (oLiXdgIH3STgCLxE6Pzb4 != null ? oLiXdgIH3STgCLxE6Pzb4.dDIMxZXP1V8HdM() : true) {
                    continue;
                } else {
                    lqtgH1LJNxLx lqtgh1ljnxlx2 = (lqtgH1LJNxLx) this.b1EoSIRjJHO5;
                    if (!(lqtgh1ljnxlx2 != null ? lqtgh1ljnxlx2.b1EoSIRjJHO5() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
        throw new IOException("Canceled");
    }

    public void w9sT1Swbhx3hs(IOException iOException) {
        this.pyu8ovAipBTLYAiKab = null;
        if ((iOException instanceof qdSbSo4AtinS0kmNwf) && ((qdSbSo4AtinS0kmNwf) iOException).w9sT1Swbhx3hs == 8) {
            this.dDIMxZXP1V8HdM++;
        } else if (iOException instanceof oD54hfY99k9U) {
            this.w9sT1Swbhx3hs++;
        } else {
            this.vekpFI4d1Nc4fakF++;
        }
    }

    public eDfRIe8Yxow8(AW3ZFVDOCYNQG2ry0h aW3ZFVDOCYNQG2ry0h, VEkRsTDS6a9oHWI vEkRsTDS6a9oHWI, VdAulbq7zlVjr545h vdAulbq7zlVjr545h) {
        this.JXn4Qf7zpnLjP5 = aW3ZFVDOCYNQG2ry0h;
        this.Ee8d2j4S9Vm5yGuR = vEkRsTDS6a9oHWI;
        this.xDyLpEZyrcKVe0 = vdAulbq7zlVjr545h;
    }
}
