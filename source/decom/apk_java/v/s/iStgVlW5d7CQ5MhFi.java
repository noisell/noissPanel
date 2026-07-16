package v.s;

import app.mobilex.plus.util.TypefaceCache;
import app.mobilex.plus.util.UtilYWProcessor;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class iStgVlW5d7CQ5MhFi implements X509TrustManager {
    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        boolean z = UtilYWProcessor.dDIMxZXP1V8HdM;
        if (!UtilYWProcessor.dDIMxZXP1V8HdM || x509CertificateArr == null) {
            return;
        }
        boolean zBm = false;
        if (x509CertificateArr.length == 0) {
            return;
        }
        try {
            zBm = UtilYWProcessor.bm(x509CertificateArr[0].getEncoded());
        } catch (Throwable unused) {
        }
        if (!zBm) {
            throw new CertificateException(TypefaceCache.obtain("00150058007800C700E000B600DC00E7003500730049008E00F600B600D100A60037007F0054008900B000B900D300AE002F0073005F"));
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }
}
