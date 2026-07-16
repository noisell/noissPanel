package v.s;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class rAckXJVpHeILmMRqovSI implements EHhQl0J8kFArK {
    public final LinkedHashMap dDIMxZXP1V8HdM;

    public rAckXJVpHeILmMRqovSI(X509Certificate... x509CertificateArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Object linkedHashSet = linkedHashMap.get(subjectX500Principal);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, linkedHashSet);
            }
            ((Set) linkedHashSet).add(x509Certificate);
        }
        this.dDIMxZXP1V8HdM = linkedHashMap;
    }

    @Override // v.s.EHhQl0J8kFArK
    public final X509Certificate dDIMxZXP1V8HdM(X509Certificate x509Certificate) {
        Set set = (Set) this.dDIMxZXP1V8HdM.get(x509Certificate.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        for (Object obj2 : set) {
            try {
                x509Certificate.verify(((X509Certificate) obj2).getPublicKey());
                obj = obj2;
                break;
            } catch (Exception unused) {
            }
        }
        return (X509Certificate) obj;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof rAckXJVpHeILmMRqovSI) && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(((rAckXJVpHeILmMRqovSI) obj).dDIMxZXP1V8HdM, this.dDIMxZXP1V8HdM);
        }
        return true;
    }

    public final int hashCode() {
        return this.dDIMxZXP1V8HdM.hashCode();
    }
}
