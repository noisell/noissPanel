package v.s;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class P3DiyBV7wfhPB0a1Q6 extends FZ1sl4mHq4J0hOEYC {
    public final EHhQl0J8kFArK pyu8ovAipBTLYAiKab;

    public P3DiyBV7wfhPB0a1Q6(EHhQl0J8kFArK eHhQl0J8kFArK) {
        this.pyu8ovAipBTLYAiKab = eHhQl0J8kFArK;
    }

    private static /* synthetic */ void lsil() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof P3DiyBV7wfhPB0a1Q6) && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(((P3DiyBV7wfhPB0a1Q6) obj).pyu8ovAipBTLYAiKab, this.pyu8ovAipBTLYAiKab);
    }

    public final int hashCode() {
        return this.pyu8ovAipBTLYAiKab.hashCode();
    }

    @Override // v.s.FZ1sl4mHq4J0hOEYC
    public final List pyu8ovAipBTLYAiKab(String str, List list) throws SSLPeerUnverifiedException {
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(arrayDeque.removeFirst());
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            X509Certificate x509Certificate = (X509Certificate) arrayList.get(arrayList.size() - 1);
            X509Certificate x509CertificateDDIMxZXP1V8HdM = this.pyu8ovAipBTLYAiKab.dDIMxZXP1V8HdM(x509Certificate);
            if (x509CertificateDDIMxZXP1V8HdM != null) {
                if (arrayList.size() > 1 || !x509Certificate.equals(x509CertificateDDIMxZXP1V8HdM)) {
                    arrayList.add(x509CertificateDDIMxZXP1V8HdM);
                }
                if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(x509CertificateDDIMxZXP1V8HdM.getIssuerDN(), x509CertificateDDIMxZXP1V8HdM.getSubjectDN())) {
                    try {
                        x509CertificateDDIMxZXP1V8HdM.verify(x509CertificateDDIMxZXP1V8HdM.getPublicKey());
                        return arrayList;
                    } catch (GeneralSecurityException unused) {
                    }
                }
                z = true;
            } else {
                Iterator it = arrayDeque.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        if (!z) {
                            throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                        }
                        return arrayList;
                    }
                    X509Certificate x509Certificate2 = (X509Certificate) it.next();
                    if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
                        try {
                            x509Certificate.verify(x509Certificate2.getPublicKey());
                            it.remove();
                            arrayList.add(x509Certificate2);
                            break;
                        } catch (GeneralSecurityException unused2) {
                            continue;
                        }
                    }
                }
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }
}
