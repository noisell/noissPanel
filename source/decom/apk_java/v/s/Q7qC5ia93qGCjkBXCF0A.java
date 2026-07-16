package v.s;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class Q7qC5ia93qGCjkBXCF0A implements EHhQl0J8kFArK {
    public final X509TrustManager dDIMxZXP1V8HdM;
    public final Method w9sT1Swbhx3hs;

    public Q7qC5ia93qGCjkBXCF0A(X509TrustManager x509TrustManager, Method method) {
        this.dDIMxZXP1V8HdM = x509TrustManager;
        this.w9sT1Swbhx3hs = method;
    }

    private static /* synthetic */ void tqvlhnz() {
    }

    @Override // v.s.EHhQl0J8kFArK
    public final X509Certificate dDIMxZXP1V8HdM(X509Certificate x509Certificate) {
        try {
            return ((TrustAnchor) this.w9sT1Swbhx3hs.invoke(this.dDIMxZXP1V8HdM, x509Certificate)).getTrustedCert();
        } catch (IllegalAccessException e) {
            throw new AssertionError("unable to get issues and signature", e);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public final boolean equals(Object obj) {
        ?? r0 = 0 + 1;
        if (this == obj) {
            return r0;
        }
        if (!(obj instanceof Q7qC5ia93qGCjkBXCF0A)) {
            return false;
        }
        Q7qC5ia93qGCjkBXCF0A q7qC5ia93qGCjkBXCF0A = (Q7qC5ia93qGCjkBXCF0A) obj;
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.dDIMxZXP1V8HdM, q7qC5ia93qGCjkBXCF0A.dDIMxZXP1V8HdM) && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.w9sT1Swbhx3hs, q7qC5ia93qGCjkBXCF0A.w9sT1Swbhx3hs)) {
            return r0;
        }
        return false;
    }

    public final int hashCode() {
        return this.w9sT1Swbhx3hs.hashCode() + (this.dDIMxZXP1V8HdM.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.dDIMxZXP1V8HdM + ", findByIssuerAndSignatureMethod=" + this.w9sT1Swbhx3hs + ')';
    }
}
