package v.s;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.openjsse.net.ssl.OpenJSSE;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class g3Ryz5KhWgXcz extends QnMItFgHCjZ1bOS {
    public static final boolean JXn4Qf7zpnLjP5;
    public final Provider vekpFI4d1Nc4fakF = new OpenJSSE();

    static {
        boolean z = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, jb8et6SZeK5TWMrJFxDX.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        JXn4Qf7zpnLjP5 = z;
    }

    private static /* synthetic */ void italvcua() {
    }

    @Override // v.s.QnMItFgHCjZ1bOS
    public final void JXn4Qf7zpnLjP5(SSLSocket sSLSocket, String str, List list) {
    }

    @Override // v.s.QnMItFgHCjZ1bOS
    public final X509TrustManager gIIiyi2ddlMDR0() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.vekpFI4d1Nc4fakF);
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                return (X509TrustManager) trustManager;
            }
        }
        throw new IllegalStateException("Unexpected default trust managers: ".concat(Arrays.toString(trustManagers)).toString());
    }

    @Override // v.s.QnMItFgHCjZ1bOS
    public final SSLContext hjneShqpF9Tis4() {
        return SSLContext.getInstance("TLSv1.3", this.vekpFI4d1Nc4fakF);
    }

    @Override // v.s.QnMItFgHCjZ1bOS
    public final String xDyLpEZyrcKVe0(SSLSocket sSLSocket) {
        return null;
    }
}
