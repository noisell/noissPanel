package v.s;

import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class lqtgH1LJNxLx implements Ftk7acqAlBdS {
    public Object Ee8d2j4S9Vm5yGuR;
    public final Object JXn4Qf7zpnLjP5;
    public int dDIMxZXP1V8HdM;
    public final Object vekpFI4d1Nc4fakF;
    public final Object w9sT1Swbhx3hs;
    public final Object xDyLpEZyrcKVe0;

    public lqtgH1LJNxLx(VEkRsTDS6a9oHWI vEkRsTDS6a9oHWI, r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c, VdAulbq7zlVjr545h vdAulbq7zlVjr545h) {
        List listHjneShqpF9Tis4;
        this.w9sT1Swbhx3hs = vEkRsTDS6a9oHWI;
        this.vekpFI4d1Nc4fakF = r5xeufod5gsccwq6c;
        qkzRt1s9DJNNYwsqt qkzrt1s9djnnywsqt = qkzRt1s9DJNNYwsqt.w9sT1Swbhx3hs;
        this.JXn4Qf7zpnLjP5 = qkzrt1s9djnnywsqt;
        this.Ee8d2j4S9Vm5yGuR = qkzrt1s9djnnywsqt;
        this.xDyLpEZyrcKVe0 = new ArrayList();
        URI uriIbVTtJUNfrGYbW = vEkRsTDS6a9oHWI.b1EoSIRjJHO5.ibVTtJUNfrGYbW();
        if (uriIbVTtJUNfrGYbW.getHost() == null) {
            listHjneShqpF9Tis4 = yrMnf4fyLGfIJbMg8IbG.hjneShqpF9Tis4(Proxy.NO_PROXY);
        } else {
            List<Proxy> listSelect = vEkRsTDS6a9oHWI.ibVTtJUNfrGYbW.select(uriIbVTtJUNfrGYbW);
            listHjneShqpF9Tis4 = (listSelect == null || listSelect.isEmpty()) ? yrMnf4fyLGfIJbMg8IbG.hjneShqpF9Tis4(Proxy.NO_PROXY) : Collections.unmodifiableList(new ArrayList(listSelect));
        }
        this.JXn4Qf7zpnLjP5 = listHjneShqpF9Tis4;
        this.dDIMxZXP1V8HdM = 0;
    }

    public void D5P1xCAyuvgF(SzicGcOQovJ1JhxwfLo8 szicGcOQovJ1JhxwfLo8, String str) {
        fwkml16WWLbAl fwkml16wwlbal = (fwkml16WWLbAl) this.Ee8d2j4S9Vm5yGuR;
        if (this.dDIMxZXP1V8HdM != 0) {
            throw new IllegalStateException(("state: " + this.dDIMxZXP1V8HdM).toString());
        }
        fwkml16wwlbal.H9XlUr4OeMJFiXK(str).H9XlUr4OeMJFiXK("\r\n");
        int size = szicGcOQovJ1JhxwfLo8.size();
        for (int i = 0; i < size; i++) {
            fwkml16wwlbal.H9XlUr4OeMJFiXK(szicGcOQovJ1JhxwfLo8.w9sT1Swbhx3hs(i)).H9XlUr4OeMJFiXK(": ").H9XlUr4OeMJFiXK(szicGcOQovJ1JhxwfLo8.JXn4Qf7zpnLjP5(i)).H9XlUr4OeMJFiXK("\r\n");
        }
        fwkml16wwlbal.H9XlUr4OeMJFiXK("\r\n");
        this.dDIMxZXP1V8HdM = 1;
    }

    @Override // v.s.Ftk7acqAlBdS
    public nj8JtA7VVVuzq Ee8d2j4S9Vm5yGuR(Box5SCj0ZNnLNdOqQxT box5SCj0ZNnLNdOqQxT) {
        if (!Bsr8WAhbbWJl.dDIMxZXP1V8HdM(box5SCj0ZNnLNdOqQxT)) {
            return pyu8ovAipBTLYAiKab(0L);
        }
        String strDDIMxZXP1V8HdM = box5SCj0ZNnLNdOqQxT.ibVTtJUNfrGYbW.dDIMxZXP1V8HdM("Transfer-Encoding");
        if (strDDIMxZXP1V8HdM == null) {
            strDDIMxZXP1V8HdM = null;
        }
        if ("chunked".equalsIgnoreCase(strDDIMxZXP1V8HdM)) {
            xc6AKez33c65zO xc6akez33c65zo = (xc6AKez33c65zO) box5SCj0ZNnLNdOqQxT.w9sT1Swbhx3hs.vekpFI4d1Nc4fakF;
            if (this.dDIMxZXP1V8HdM == 4) {
                this.dDIMxZXP1V8HdM = 5;
                return new JqkqWdzKkW9ovNGu3(this, xc6akez33c65zo);
            }
            throw new IllegalStateException(("state: " + this.dDIMxZXP1V8HdM).toString());
        }
        long jD5P1xCAyuvgF = yrMnf4fyLGfIJbMg8IbG.D5P1xCAyuvgF(box5SCj0ZNnLNdOqQxT);
        if (jD5P1xCAyuvgF != -1) {
            return pyu8ovAipBTLYAiKab(jD5P1xCAyuvgF);
        }
        if (this.dDIMxZXP1V8HdM == 4) {
            this.dDIMxZXP1V8HdM = 5;
            ((zfPdbqrCOkdxWPAv) this.vekpFI4d1Nc4fakF).hjneShqpF9Tis4();
            return new hWd44YJgRsLm(this);
        }
        throw new IllegalStateException(("state: " + this.dDIMxZXP1V8HdM).toString());
    }

    @Override // v.s.Ftk7acqAlBdS
    public void JXn4Qf7zpnLjP5() {
        ((fwkml16WWLbAl) this.Ee8d2j4S9Vm5yGuR).flush();
    }

    public boolean b1EoSIRjJHO5() {
        return this.dDIMxZXP1V8HdM < ((List) this.JXn4Qf7zpnLjP5).size() || !((ArrayList) this.xDyLpEZyrcKVe0).isEmpty();
    }

    @Override // v.s.Ftk7acqAlBdS
    public void cancel() {
        Socket socket = ((zfPdbqrCOkdxWPAv) this.vekpFI4d1Nc4fakF).vekpFI4d1Nc4fakF;
        if (socket != null) {
            yrMnf4fyLGfIJbMg8IbG.JXn4Qf7zpnLjP5(socket);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [char, int] */
    @Override // v.s.Ftk7acqAlBdS
    public void dDIMxZXP1V8HdM(iniVyKd0OGb2raI4 inivykd0ogb2rai4) {
        Proxy.Type type = ((zfPdbqrCOkdxWPAv) this.vekpFI4d1Nc4fakF).w9sT1Swbhx3hs.w9sT1Swbhx3hs.type();
        StringBuilder sb = new StringBuilder();
        sb.append((String) inivykd0ogb2rai4.JXn4Qf7zpnLjP5);
        sb.append(' ');
        xc6AKez33c65zO xc6akez33c65zo = (xc6AKez33c65zO) inivykd0ogb2rai4.vekpFI4d1Nc4fakF;
        if (xc6akez33c65zo.pyu8ovAipBTLYAiKab || type != Proxy.Type.HTTP) {
            String strW9sT1Swbhx3hs = xc6akez33c65zo.w9sT1Swbhx3hs();
            String strJXn4Qf7zpnLjP5 = xc6akez33c65zo.JXn4Qf7zpnLjP5();
            if (strJXn4Qf7zpnLjP5 != null) {
                strW9sT1Swbhx3hs = strW9sT1Swbhx3hs + ((char) (16 + 47)) + strJXn4Qf7zpnLjP5;
            }
            sb.append(strW9sT1Swbhx3hs);
        } else {
            sb.append(xc6akez33c65zo);
        }
        sb.append(" HTTP/1.1");
        D5P1xCAyuvgF((SzicGcOQovJ1JhxwfLo8) inivykd0ogb2rai4.Ee8d2j4S9Vm5yGuR, sb.toString());
    }

    @Override // v.s.Ftk7acqAlBdS
    public zfPdbqrCOkdxWPAv ibVTtJUNfrGYbW() {
        return (zfPdbqrCOkdxWPAv) this.vekpFI4d1Nc4fakF;
    }

    public e7g79jevOor5vdCta pyu8ovAipBTLYAiKab(long j) {
        if (this.dDIMxZXP1V8HdM == 4) {
            this.dDIMxZXP1V8HdM = (-68) + 73;
            return new e7g79jevOor5vdCta(this, j);
        }
        throw new IllegalStateException(("state: " + this.dDIMxZXP1V8HdM).toString());
    }

    @Override // v.s.Ftk7acqAlBdS
    public void vekpFI4d1Nc4fakF() {
        ((fwkml16WWLbAl) this.Ee8d2j4S9Vm5yGuR).flush();
    }

    @Override // v.s.Ftk7acqAlBdS
    public long w9sT1Swbhx3hs(Box5SCj0ZNnLNdOqQxT box5SCj0ZNnLNdOqQxT) {
        if (!Bsr8WAhbbWJl.dDIMxZXP1V8HdM(box5SCj0ZNnLNdOqQxT)) {
            return 0L;
        }
        String strDDIMxZXP1V8HdM = box5SCj0ZNnLNdOqQxT.ibVTtJUNfrGYbW.dDIMxZXP1V8HdM("Transfer-Encoding");
        if (strDDIMxZXP1V8HdM == null) {
            strDDIMxZXP1V8HdM = null;
        }
        if ("chunked".equalsIgnoreCase(strDDIMxZXP1V8HdM)) {
            return -1L;
        }
        return yrMnf4fyLGfIJbMg8IbG.D5P1xCAyuvgF(box5SCj0ZNnLNdOqQxT);
    }

    @Override // v.s.Ftk7acqAlBdS
    public OHTCdIMQ8dDzHn2uIc xDyLpEZyrcKVe0(boolean z) throws IOException {
        VkZdYZ8plDAnnSJM vkZdYZ8plDAnnSJM = (VkZdYZ8plDAnnSJM) this.xDyLpEZyrcKVe0;
        int i = this.dDIMxZXP1V8HdM;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.dDIMxZXP1V8HdM).toString());
        }
        try {
            String strGIIiyi2ddlMDR0 = vkZdYZ8plDAnnSJM.dDIMxZXP1V8HdM.gIIiyi2ddlMDR0(vkZdYZ8plDAnnSJM.w9sT1Swbhx3hs);
            vkZdYZ8plDAnnSJM.w9sT1Swbhx3hs -= (long) strGIIiyi2ddlMDR0.length();
            sfr0Aaw8vBbkmexjHdWK sfr0aaw8vbbkmexjhdwkXiR1pIn5878vVWd = jb8et6SZeK5TWMrJFxDX.XiR1pIn5878vVWd(strGIIiyi2ddlMDR0);
            int i2 = sfr0aaw8vbbkmexjhdwkXiR1pIn5878vVWd.w9sT1Swbhx3hs;
            OHTCdIMQ8dDzHn2uIc oHTCdIMQ8dDzHn2uIc = new OHTCdIMQ8dDzHn2uIc();
            oHTCdIMQ8dDzHn2uIc.w9sT1Swbhx3hs = (B62d1BWQ36VxGmXU) sfr0aaw8vbbkmexjhdwkXiR1pIn5878vVWd.JXn4Qf7zpnLjP5;
            oHTCdIMQ8dDzHn2uIc.vekpFI4d1Nc4fakF = i2;
            oHTCdIMQ8dDzHn2uIc.JXn4Qf7zpnLjP5 = (String) sfr0aaw8vbbkmexjhdwkXiR1pIn5878vVWd.vekpFI4d1Nc4fakF;
            oHTCdIMQ8dDzHn2uIc.xDyLpEZyrcKVe0 = vkZdYZ8plDAnnSJM.dDIMxZXP1V8HdM().vekpFI4d1Nc4fakF();
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.dDIMxZXP1V8HdM = 3;
                return oHTCdIMQ8dDzHn2uIc;
            }
            if (102 > i2 || i2 >= 200) {
                this.dDIMxZXP1V8HdM = 4;
                return oHTCdIMQ8dDzHn2uIc;
            }
            this.dDIMxZXP1V8HdM = 3;
            return oHTCdIMQ8dDzHn2uIc;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(((zfPdbqrCOkdxWPAv) this.vekpFI4d1Nc4fakF).w9sT1Swbhx3hs.dDIMxZXP1V8HdM.b1EoSIRjJHO5.xDyLpEZyrcKVe0()), e);
        }
    }

    public lqtgH1LJNxLx(sp6apkX00TawY02qGY6r sp6apkx00tawy02qgy6r, zfPdbqrCOkdxWPAv zfpdbqrcokdxwpav, ZHKD3ddbUALiCxl zHKD3ddbUALiCxl, lpsYIxZHQFa6jCAhXSJ lpsyixzhqfa6jcahxsj) {
        this.w9sT1Swbhx3hs = sp6apkx00tawy02qgy6r;
        this.vekpFI4d1Nc4fakF = zfpdbqrcokdxwpav;
        this.JXn4Qf7zpnLjP5 = zHKD3ddbUALiCxl;
        this.Ee8d2j4S9Vm5yGuR = lpsyixzhqfa6jcahxsj;
        this.xDyLpEZyrcKVe0 = new VkZdYZ8plDAnnSJM(zHKD3ddbUALiCxl);
    }
}
