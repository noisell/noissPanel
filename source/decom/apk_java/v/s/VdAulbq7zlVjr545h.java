package v.s;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class VdAulbq7zlVjr545h implements Cloneable {
    public boolean D5P1xCAyuvgF;
    public final uRXa0eUnZJgETX Ee8d2j4S9Vm5yGuR;
    public volatile zfPdbqrCOkdxWPAv J0zjQ7CAgohuxU20eCW6;
    public final AW3ZFVDOCYNQG2ry0h JXn4Qf7zpnLjP5;
    public volatile boolean Qrz92kRPw4GcghAc;
    public eDfRIe8Yxow8 b1EoSIRjJHO5;
    public boolean gIIiyi2ddlMDR0;
    public boolean gmNWMfvn6zlEj;
    public D9RooUzwy6gf47M9NDX hjneShqpF9Tis4;
    public Object ibVTtJUNfrGYbW;
    public volatile D9RooUzwy6gf47M9NDX nQilHWaqS401ZtR;
    public zfPdbqrCOkdxWPAv pyu8ovAipBTLYAiKab;
    public final iniVyKd0OGb2raI4 vekpFI4d1Nc4fakF;
    public final sp6apkX00TawY02qGY6r w9sT1Swbhx3hs;
    public boolean wotphlvK9sPbXJ;
    public final AtomicBoolean xDyLpEZyrcKVe0;

    public VdAulbq7zlVjr545h(sp6apkX00TawY02qGY6r sp6apkx00tawy02qgy6r, iniVyKd0OGb2raI4 inivykd0ogb2rai4) {
        this.w9sT1Swbhx3hs = sp6apkx00tawy02qgy6r;
        this.vekpFI4d1Nc4fakF = inivykd0ogb2rai4;
        this.JXn4Qf7zpnLjP5 = (AW3ZFVDOCYNQG2ry0h) sp6apkx00tawy02qgy6r.vekpFI4d1Nc4fakF.vekpFI4d1Nc4fakF;
        sp6apkx00tawy02qgy6r.xDyLpEZyrcKVe0.getClass();
        uRXa0eUnZJgETX urxa0eunzjgetx = new uRXa0eUnZJgETX(this);
        urxa0eunzjgetx.ibVTtJUNfrGYbW(0, TimeUnit.MILLISECONDS);
        this.Ee8d2j4S9Vm5yGuR = urxa0eunzjgetx;
        this.xDyLpEZyrcKVe0 = new AtomicBoolean();
        this.wotphlvK9sPbXJ = true;
    }

    public static final String dDIMxZXP1V8HdM(VdAulbq7zlVjr545h vdAulbq7zlVjr545h) {
        StringBuilder sb = new StringBuilder();
        sb.append(vdAulbq7zlVjr545h.Qrz92kRPw4GcghAc ? "canceled " : "");
        sb.append("web socket");
        sb.append(" to ");
        sb.append(((xc6AKez33c65zO) vdAulbq7zlVjr545h.vekpFI4d1Nc4fakF.vekpFI4d1Nc4fakF).xDyLpEZyrcKVe0());
        return sb.toString();
    }

    public final void Ee8d2j4S9Vm5yGuR(boolean z) {
        D9RooUzwy6gf47M9NDX d9RooUzwy6gf47M9NDX;
        synchronized (this) {
            if (!this.wotphlvK9sPbXJ) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (d9RooUzwy6gf47M9NDX = this.nQilHWaqS401ZtR) != null) {
            ((Ftk7acqAlBdS) d9RooUzwy6gf47M9NDX.JXn4Qf7zpnLjP5).cancel();
            ((VdAulbq7zlVjr545h) d9RooUzwy6gf47M9NDX.w9sT1Swbhx3hs).ibVTtJUNfrGYbW(d9RooUzwy6gf47M9NDX, true, true, null);
        }
        this.hjneShqpF9Tis4 = null;
    }

    public final void JXn4Qf7zpnLjP5() {
        Socket socket;
        if (this.Qrz92kRPw4GcghAc) {
            return;
        }
        this.Qrz92kRPw4GcghAc = true;
        D9RooUzwy6gf47M9NDX d9RooUzwy6gf47M9NDX = this.nQilHWaqS401ZtR;
        if (d9RooUzwy6gf47M9NDX != null) {
            ((Ftk7acqAlBdS) d9RooUzwy6gf47M9NDX.JXn4Qf7zpnLjP5).cancel();
        }
        zfPdbqrCOkdxWPAv zfpdbqrcokdxwpav = this.J0zjQ7CAgohuxU20eCW6;
        if (zfpdbqrcokdxwpav == null || (socket = zfpdbqrcokdxwpav.vekpFI4d1Nc4fakF) == null) {
            return;
        }
        yrMnf4fyLGfIJbMg8IbG.JXn4Qf7zpnLjP5(socket);
    }

    public final IOException b1EoSIRjJHO5(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.wotphlvK9sPbXJ) {
                this.wotphlvK9sPbXJ = false;
                if (!this.gmNWMfvn6zlEj && !this.gIIiyi2ddlMDR0) {
                    z = true;
                }
            }
        }
        return z ? vekpFI4d1Nc4fakF(iOException) : iOException;
    }

    public final Object clone() {
        return new VdAulbq7zlVjr545h(this.w9sT1Swbhx3hs, this.vekpFI4d1Nc4fakF);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0020 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0022 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:17:0x0022, B:19:0x0026, B:20:0x0028, B:22:0x0030, B:27:0x003a, B:29:0x003e, B:14:0x001c), top: B:51:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0026 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:17:0x0022, B:19:0x0026, B:20:0x0028, B:22:0x0030, B:27:0x003a, B:29:0x003e, B:14:0x001c), top: B:51:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0037  */
    public final IOException ibVTtJUNfrGYbW(D9RooUzwy6gf47M9NDX d9RooUzwy6gf47M9NDX, boolean z, boolean z2, IOException iOException) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (d9RooUzwy6gf47M9NDX.equals(this.nQilHWaqS401ZtR)) {
            synchronized (this) {
                z3 = false;
                if (z) {
                    try {
                        if (this.gmNWMfvn6zlEj) {
                            if (z) {
                                this.gmNWMfvn6zlEj = false;
                            }
                            if (z2) {
                                this.gIIiyi2ddlMDR0 = false;
                            }
                            z5 = this.gmNWMfvn6zlEj;
                            if (z5) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            if (!z5) {
                                z3 = true;
                            }
                            z4 = z3;
                            z3 = z6;
                        } else if (z2 || !this.gIIiyi2ddlMDR0) {
                            z4 = false;
                        } else {
                            if (z) {
                                this.gmNWMfvn6zlEj = false;
                            }
                            if (z2) {
                                this.gIIiyi2ddlMDR0 = false;
                            }
                            z5 = this.gmNWMfvn6zlEj;
                            if (z5 || this.gIIiyi2ddlMDR0) {
                                z6 = false;
                            } else {
                                z6 = true;
                            }
                            if (!z5 && !this.gIIiyi2ddlMDR0 && !this.wotphlvK9sPbXJ) {
                                z3 = true;
                            }
                            z4 = z3;
                            z3 = z6;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    if (z2) {
                    }
                    z4 = false;
                }
            }
            if (z3) {
                this.nQilHWaqS401ZtR = null;
                zfPdbqrCOkdxWPAv zfpdbqrcokdxwpav = this.pyu8ovAipBTLYAiKab;
                if (zfpdbqrcokdxwpav != null) {
                    synchronized (zfpdbqrcokdxwpav) {
                        zfpdbqrcokdxwpav.gIIiyi2ddlMDR0++;
                    }
                }
            }
            if (z4) {
                return vekpFI4d1Nc4fakF(iOException);
            }
        }
        return iOException;
    }

    public final Socket pyu8ovAipBTLYAiKab() {
        zfPdbqrCOkdxWPAv zfpdbqrcokdxwpav = this.pyu8ovAipBTLYAiKab;
        byte[] bArr = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
        ArrayList arrayList = zfpdbqrcokdxwpav.nQilHWaqS401ZtR;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i = -1;
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(((Reference) obj).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i);
        this.pyu8ovAipBTLYAiKab = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        zfpdbqrcokdxwpav.J0zjQ7CAgohuxU20eCW6 = System.nanoTime();
        AW3ZFVDOCYNQG2ry0h aW3ZFVDOCYNQG2ry0h = this.JXn4Qf7zpnLjP5;
        ConcurrentLinkedQueue concurrentLinkedQueue = aW3ZFVDOCYNQG2ry0h.JXn4Qf7zpnLjP5;
        uV3RzXbqCGFOlAdx uv3rzxbqcgfoladx = aW3ZFVDOCYNQG2ry0h.w9sT1Swbhx3hs;
        byte[] bArr2 = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
        if (!zfpdbqrcokdxwpav.D5P1xCAyuvgF) {
            uv3rzxbqcgfoladx.vekpFI4d1Nc4fakF(aW3ZFVDOCYNQG2ry0h.vekpFI4d1Nc4fakF, 0L);
            return null;
        }
        zfpdbqrcokdxwpav.D5P1xCAyuvgF = true;
        concurrentLinkedQueue.remove(zfpdbqrcokdxwpav);
        if (concurrentLinkedQueue.isEmpty()) {
            uv3rzxbqcgfoladx.dDIMxZXP1V8HdM();
        }
        return zfpdbqrcokdxwpav.JXn4Qf7zpnLjP5;
    }

    public final IOException vekpFI4d1Nc4fakF(IOException iOException) {
        Socket socketPyu8ovAipBTLYAiKab;
        byte[] bArr = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
        zfPdbqrCOkdxWPAv zfpdbqrcokdxwpav = this.pyu8ovAipBTLYAiKab;
        if (zfpdbqrcokdxwpav != null) {
            synchronized (zfpdbqrcokdxwpav) {
                socketPyu8ovAipBTLYAiKab = pyu8ovAipBTLYAiKab();
            }
            if (this.pyu8ovAipBTLYAiKab == null) {
                if (socketPyu8ovAipBTLYAiKab != null) {
                    yrMnf4fyLGfIJbMg8IbG.JXn4Qf7zpnLjP5(socketPyu8ovAipBTLYAiKab);
                }
            } else if (socketPyu8ovAipBTLYAiKab != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (this.D5P1xCAyuvgF || !this.Ee8d2j4S9Vm5yGuR.D5P1xCAyuvgF()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final void w9sT1Swbhx3hs(zfPdbqrCOkdxWPAv zfpdbqrcokdxwpav) {
        byte[] bArr = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
        if (this.pyu8ovAipBTLYAiKab != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.pyu8ovAipBTLYAiKab = zfpdbqrcokdxwpav;
        zfpdbqrcokdxwpav.nQilHWaqS401ZtR.add(new RJ8VTQCOfB7ZL32c8xJ(this, this.ibVTtJUNfrGYbW));
    }

    public final Box5SCj0ZNnLNdOqQxT xDyLpEZyrcKVe0() {
        ArrayList arrayList = new ArrayList();
        O0DzWbzyYI2BykPDCod.tne6mXOUFKdd(arrayList, this.w9sT1Swbhx3hs.JXn4Qf7zpnLjP5);
        arrayList.add(new iuz9HpMY1j7vNt3k3(1, this.w9sT1Swbhx3hs));
        arrayList.add(new iuz9HpMY1j7vNt3k3(0, this.w9sT1Swbhx3hs.hjneShqpF9Tis4));
        arrayList.add(new zBinnA7JinbcPPAu1(0));
        arrayList.add(zBinnA7JinbcPPAu1.w9sT1Swbhx3hs);
        arrayList.add(new zBinnA7JinbcPPAu1(7 - 5));
        iniVyKd0OGb2raI4 inivykd0ogb2rai4 = this.vekpFI4d1Nc4fakF;
        sp6apkX00TawY02qGY6r sp6apkx00tawy02qgy6r = this.w9sT1Swbhx3hs;
        try {
            try {
                Box5SCj0ZNnLNdOqQxT box5SCj0ZNnLNdOqQxTW9sT1Swbhx3hs = new h5bWEMI2dN1jRNFWXg7(this, arrayList, 0, null, inivykd0ogb2rai4, sp6apkx00tawy02qgy6r.K7eEOBPYP9VIoHWTe, sp6apkx00tawy02qgy6r.dTS0S7eC32ubQH54j36, sp6apkx00tawy02qgy6r.EWUjsTERgdPbSw3NNlN).w9sT1Swbhx3hs(inivykd0ogb2rai4);
                if (this.Qrz92kRPw4GcghAc) {
                    yrMnf4fyLGfIJbMg8IbG.vekpFI4d1Nc4fakF(box5SCj0ZNnLNdOqQxTW9sT1Swbhx3hs);
                    throw new IOException("Canceled");
                }
                b1EoSIRjJHO5(null);
                return box5SCj0ZNnLNdOqQxTW9sT1Swbhx3hs;
            } catch (IOException e) {
                throw b1EoSIRjJHO5(e);
            }
        } catch (Throwable th) {
            if (0 == 0) {
                b1EoSIRjJHO5(null);
            }
            throw th;
        }
    }
}
