package v.s;

import java.net.Socket;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedTrustManager;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class Egj8dNiKdwl62BjzhGNm extends X509ExtendedTrustManager {
    public final /* synthetic */ X509ExtendedTrustManager dDIMxZXP1V8HdM;

    public Egj8dNiKdwl62BjzhGNm(X509ExtendedTrustManager x509ExtendedTrustManager) {
        this.dDIMxZXP1V8HdM = x509ExtendedTrustManager;
    }

    private static /* synthetic */ void mqrjyi() {
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        this.dDIMxZXP1V8HdM.checkClientTrusted(x509CertificateArr, str, socket);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        this.dDIMxZXP1V8HdM.checkServerTrusted(x509CertificateArr, str, socket);
        ktukzhfmAkOuMU.w9sT1Swbhx3hs(x509CertificateArr);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return this.dDIMxZXP1V8HdM.getAcceptedIssuers();
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        this.dDIMxZXP1V8HdM.checkClientTrusted(x509CertificateArr, str, sSLEngine);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        this.dDIMxZXP1V8HdM.checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        this.dDIMxZXP1V8HdM.checkServerTrusted(x509CertificateArr, str, sSLEngine);
        ktukzhfmAkOuMU.w9sT1Swbhx3hs(x509CertificateArr);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        this.dDIMxZXP1V8HdM.checkServerTrusted(x509CertificateArr, str);
        ktukzhfmAkOuMU.w9sT1Swbhx3hs(x509CertificateArr);
    }
}
