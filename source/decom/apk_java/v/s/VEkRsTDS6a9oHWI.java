package v.s;

import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class VEkRsTDS6a9oHWI {
    public final List D5P1xCAyuvgF;
    public final O9Ad3O0crmyhDHMF Ee8d2j4S9Vm5yGuR;
    public final HostnameVerifier JXn4Qf7zpnLjP5;
    public final xc6AKez33c65zO b1EoSIRjJHO5;
    public final fadfsJa4iEdiwEC4Xm8 dDIMxZXP1V8HdM;
    public final ProxySelector ibVTtJUNfrGYbW;
    public final List pyu8ovAipBTLYAiKab;
    public final SSLSocketFactory vekpFI4d1Nc4fakF;
    public final SocketFactory w9sT1Swbhx3hs;
    public final fEyMFFyOOvHURJ7To6L xDyLpEZyrcKVe0;

    public VEkRsTDS6a9oHWI(String str, int i, fadfsJa4iEdiwEC4Xm8 fadfsja4iediwec4xm8, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, O9Ad3O0crmyhDHMF o9Ad3O0crmyhDHMF, fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6l, List list, List list2, ProxySelector proxySelector) {
        this.dDIMxZXP1V8HdM = fadfsja4iediwec4xm8;
        this.w9sT1Swbhx3hs = socketFactory;
        this.vekpFI4d1Nc4fakF = sSLSocketFactory;
        this.JXn4Qf7zpnLjP5 = hostnameVerifier;
        this.Ee8d2j4S9Vm5yGuR = o9Ad3O0crmyhDHMF;
        this.xDyLpEZyrcKVe0 = feymffyoovhurj7to6l;
        this.ibVTtJUNfrGYbW = proxySelector;
        JVe8d5JCsGlrBZvcax jVe8d5JCsGlrBZvcax = new JVe8d5JCsGlrBZvcax();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            jVe8d5JCsGlrBZvcax.dDIMxZXP1V8HdM = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            jVe8d5JCsGlrBZvcax.dDIMxZXP1V8HdM = "https";
        }
        String strH9XlUr4OeMJFiXK = y6jRGLEWNMir.H9XlUr4OeMJFiXK(fEyMFFyOOvHURJ7To6L.gIIiyi2ddlMDR0(str, 0, 0, 7));
        if (strH9XlUr4OeMJFiXK == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        jVe8d5JCsGlrBZvcax.JXn4Qf7zpnLjP5 = strH9XlUr4OeMJFiXK;
        if (1 > i || i >= 65536) {
            throw new IllegalArgumentException(Y9mRyRdkl5FOcwb66V6.xDyLpEZyrcKVe0("unexpected port: ", i).toString());
        }
        jVe8d5JCsGlrBZvcax.Ee8d2j4S9Vm5yGuR = i;
        this.b1EoSIRjJHO5 = jVe8d5JCsGlrBZvcax.dDIMxZXP1V8HdM();
        byte[] bArr = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
        this.pyu8ovAipBTLYAiKab = Collections.unmodifiableList(new ArrayList(list));
        this.D5P1xCAyuvgF = Collections.unmodifiableList(new ArrayList(list2));
    }

    public final boolean dDIMxZXP1V8HdM(VEkRsTDS6a9oHWI vEkRsTDS6a9oHWI) {
        return okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.dDIMxZXP1V8HdM, vEkRsTDS6a9oHWI.dDIMxZXP1V8HdM) && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.xDyLpEZyrcKVe0, vEkRsTDS6a9oHWI.xDyLpEZyrcKVe0) && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.pyu8ovAipBTLYAiKab, vEkRsTDS6a9oHWI.pyu8ovAipBTLYAiKab) && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.D5P1xCAyuvgF, vEkRsTDS6a9oHWI.D5P1xCAyuvgF) && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.ibVTtJUNfrGYbW, vEkRsTDS6a9oHWI.ibVTtJUNfrGYbW) && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.vekpFI4d1Nc4fakF, vEkRsTDS6a9oHWI.vekpFI4d1Nc4fakF) && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.JXn4Qf7zpnLjP5, vEkRsTDS6a9oHWI.JXn4Qf7zpnLjP5) && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.Ee8d2j4S9Vm5yGuR, vEkRsTDS6a9oHWI.Ee8d2j4S9Vm5yGuR) && this.b1EoSIRjJHO5.Ee8d2j4S9Vm5yGuR == vEkRsTDS6a9oHWI.b1EoSIRjJHO5.Ee8d2j4S9Vm5yGuR;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof VEkRsTDS6a9oHWI)) {
            return false;
        }
        VEkRsTDS6a9oHWI vEkRsTDS6a9oHWI = (VEkRsTDS6a9oHWI) obj;
        return okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.b1EoSIRjJHO5, vEkRsTDS6a9oHWI.b1EoSIRjJHO5) && dDIMxZXP1V8HdM(vEkRsTDS6a9oHWI);
    }

    public final int hashCode() {
        return Objects.hashCode(this.Ee8d2j4S9Vm5yGuR) + ((Objects.hashCode(this.JXn4Qf7zpnLjP5) + ((Objects.hashCode(this.vekpFI4d1Nc4fakF) + ((this.ibVTtJUNfrGYbW.hashCode() + ((this.D5P1xCAyuvgF.hashCode() + ((this.pyu8ovAipBTLYAiKab.hashCode() + ((this.xDyLpEZyrcKVe0.hashCode() + ((this.dDIMxZXP1V8HdM.hashCode() + Y9mRyRdkl5FOcwb66V6.JXn4Qf7zpnLjP5(this.b1EoSIRjJHO5.b1EoSIRjJHO5, 527, 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        xc6AKez33c65zO xc6akez33c65zo = this.b1EoSIRjJHO5;
        sb.append(xc6akez33c65zo.JXn4Qf7zpnLjP5);
        sb.append(':');
        sb.append(xc6akez33c65zo.Ee8d2j4S9Vm5yGuR);
        sb.append(", ");
        sb.append("proxySelector=" + this.ibVTtJUNfrGYbW);
        sb.append('}');
        return sb.toString();
    }
}
