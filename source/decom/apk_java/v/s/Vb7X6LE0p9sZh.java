package v.s;

import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class Vb7X6LE0p9sZh {
    public fadfsJa4iEdiwEC4Xm8 D5P1xCAyuvgF;
    public FZ1sl4mHq4J0hOEYC DVTNwpDEVsUKuznof;
    public int EWUjsTERgdPbSw3NNlN;
    public O9Ad3O0crmyhDHMF H9XlUr4OeMJFiXK;
    public List J0zjQ7CAgohuxU20eCW6;
    public int K7eEOBPYP9VIoHWTe;
    public List MLSIo1htfMPWeB8V876L;
    public SSLSocketFactory Qrz92kRPw4GcghAc;
    public HostnameVerifier XiR1pIn5878vVWd;
    public boolean b1EoSIRjJHO5;
    public int dTS0S7eC32ubQH54j36;
    public fEyMFFyOOvHURJ7To6L gIIiyi2ddlMDR0;
    public ProxySelector gmNWMfvn6zlEj;
    public fadfsJa4iEdiwEC4Xm8 hjneShqpF9Tis4;
    public fEyMFFyOOvHURJ7To6L ibVTtJUNfrGYbW;
    public int l1V0lQr6TbwNKqHfXNbb;
    public X509TrustManager nQilHWaqS401ZtR;
    public boolean pyu8ovAipBTLYAiKab;
    public r5XEUfod5GSCCwq6c vIJudZvPyTuNp;
    public SocketFactory wotphlvK9sPbXJ;
    public long yTljMGnIibTRdOpSh4;
    public fUH025aw0Rgl dDIMxZXP1V8HdM = new fUH025aw0Rgl(1);
    public r5XEUfod5GSCCwq6c w9sT1Swbhx3hs = new r5XEUfod5GSCCwq6c(3);
    public final ArrayList vekpFI4d1Nc4fakF = new ArrayList();
    public final ArrayList JXn4Qf7zpnLjP5 = new ArrayList();
    public UeVBYgBvSKYfVuXLhMs Ee8d2j4S9Vm5yGuR = new UeVBYgBvSKYfVuXLhMs(20);
    public boolean xDyLpEZyrcKVe0 = true;

    public Vb7X6LE0p9sZh() {
        fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6l = fEyMFFyOOvHURJ7To6L.JXn4Qf7zpnLjP5;
        this.ibVTtJUNfrGYbW = feymffyoovhurj7to6l;
        this.b1EoSIRjJHO5 = true;
        this.pyu8ovAipBTLYAiKab = true;
        this.D5P1xCAyuvgF = fadfsJa4iEdiwEC4Xm8.JXn4Qf7zpnLjP5;
        this.hjneShqpF9Tis4 = fadfsJa4iEdiwEC4Xm8.Ee8d2j4S9Vm5yGuR;
        this.gIIiyi2ddlMDR0 = feymffyoovhurj7to6l;
        this.wotphlvK9sPbXJ = SocketFactory.getDefault();
        this.J0zjQ7CAgohuxU20eCW6 = sp6apkX00TawY02qGY6r.xfn2GJwmGqs7kWW;
        this.MLSIo1htfMPWeB8V876L = sp6apkX00TawY02qGY6r.O2DHNSIGZlgPja7eqLgn;
        this.XiR1pIn5878vVWd = c3iEN8plP13UDv9MQvT.dDIMxZXP1V8HdM;
        this.H9XlUr4OeMJFiXK = O9Ad3O0crmyhDHMF.vekpFI4d1Nc4fakF;
        this.l1V0lQr6TbwNKqHfXNbb = 10000;
        this.K7eEOBPYP9VIoHWTe = 10000;
        this.dTS0S7eC32ubQH54j36 = 10000;
        this.yTljMGnIibTRdOpSh4 = 1024L;
    }

    public final void dDIMxZXP1V8HdM(List list) {
        ArrayList arrayList = new ArrayList(list);
        B62d1BWQ36VxGmXU b62d1BWQ36VxGmXU = B62d1BWQ36VxGmXU.H2_PRIOR_KNOWLEDGE;
        if (!arrayList.contains(b62d1BWQ36VxGmXU) && !arrayList.contains(B62d1BWQ36VxGmXU.HTTP_1_1)) {
            throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + arrayList).toString());
        }
        if (arrayList.contains(b62d1BWQ36VxGmXU) && arrayList.size() > 16 - 15) {
            throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + arrayList).toString());
        }
        if (arrayList.contains(B62d1BWQ36VxGmXU.HTTP_1_0)) {
            throw new IllegalArgumentException(("protocols must not contain http/1.0: " + arrayList).toString());
        }
        if (arrayList.contains(null)) {
            throw new IllegalArgumentException("protocols must not contain null");
        }
        arrayList.remove(B62d1BWQ36VxGmXU.SPDY_3);
        if (!arrayList.equals(this.MLSIo1htfMPWeB8V876L)) {
            this.vIJudZvPyTuNp = null;
        }
        this.MLSIo1htfMPWeB8V876L = Collections.unmodifiableList(arrayList);
    }
}
