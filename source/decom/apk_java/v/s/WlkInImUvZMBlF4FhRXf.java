package v.s;

import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class WlkInImUvZMBlF4FhRXf extends QnMItFgHCjZ1bOS {
    public static final boolean JXn4Qf7zpnLjP5;
    public final Provider vekpFI4d1Nc4fakF = Conscrypt.newProvider();

    static {
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, gj2IXYMlDcSXqsIk.class.getClassLoader());
            if (Conscrypt.isAvailable() && gj2IXYMlDcSXqsIk.dDIMxZXP1V8HdM()) {
                z = true;
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        JXn4Qf7zpnLjP5 = z;
    }

    @Override // v.s.QnMItFgHCjZ1bOS
    public final void JXn4Qf7zpnLjP5(SSLSocket sSLSocket, String str, List list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((B62d1BWQ36VxGmXU) obj) != B62d1BWQ36VxGmXU.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(D8f4u3NB1PCAS427.xfn2GJwmGqs7kWW(arrayList));
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                arrayList2.add(((B62d1BWQ36VxGmXU) obj2).toString());
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) arrayList2.toArray(new String[0]));
        }
    }

    @Override // v.s.QnMItFgHCjZ1bOS
    public final X509TrustManager gIIiyi2ddlMDR0() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, qE71ZedKGKtUPLoLg.dDIMxZXP1V8HdM);
                return x509TrustManager;
            }
        }
        throw new IllegalStateException("Unexpected default trust managers: ".concat(Arrays.toString(trustManagers)).toString());
    }

    @Override // v.s.QnMItFgHCjZ1bOS
    public final SSLSocketFactory gmNWMfvn6zlEj(X509TrustManager x509TrustManager) throws KeyManagementException {
        SSLContext sSLContextHjneShqpF9Tis4 = hjneShqpF9Tis4();
        sSLContextHjneShqpF9Tis4.init(null, new TrustManager[]{x509TrustManager}, null);
        return sSLContextHjneShqpF9Tis4.getSocketFactory();
    }

    @Override // v.s.QnMItFgHCjZ1bOS
    public final SSLContext hjneShqpF9Tis4() {
        return SSLContext.getInstance("TLS", this.vekpFI4d1Nc4fakF);
    }

    @Override // v.s.QnMItFgHCjZ1bOS
    public final String xDyLpEZyrcKVe0(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }
}
