package v.s;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class Yrf7mWjzxCbCCUcSPwXl extends FZ1sl4mHq4J0hOEYC {
    public final X509TrustManagerExtensions D5P1xCAyuvgF;
    public final X509TrustManager pyu8ovAipBTLYAiKab;

    public Yrf7mWjzxCbCCUcSPwXl(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.pyu8ovAipBTLYAiKab = x509TrustManager;
        this.D5P1xCAyuvgF = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Yrf7mWjzxCbCCUcSPwXl) && ((Yrf7mWjzxCbCCUcSPwXl) obj).pyu8ovAipBTLYAiKab == this.pyu8ovAipBTLYAiKab;
    }

    public final int hashCode() {
        return System.identityHashCode(this.pyu8ovAipBTLYAiKab);
    }

    @Override // v.s.FZ1sl4mHq4J0hOEYC
    public final List pyu8ovAipBTLYAiKab(String str, List list) throws SSLPeerUnverifiedException {
        try {
            return this.D5P1xCAyuvgF.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }
}
