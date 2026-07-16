package v.s;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class zZspSMUA9NHs8 implements X509TrustManager {
    public final /* synthetic */ X509TrustManager dDIMxZXP1V8HdM;

    public zZspSMUA9NHs8(X509TrustManager x509TrustManager) {
        this.dDIMxZXP1V8HdM = x509TrustManager;
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        this.dDIMxZXP1V8HdM.checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        this.dDIMxZXP1V8HdM.checkServerTrusted(x509CertificateArr, str);
        ktukzhfmAkOuMU.w9sT1Swbhx3hs(x509CertificateArr);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return this.dDIMxZXP1V8HdM.getAcceptedIssuers();
    }
}
