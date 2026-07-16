package v.s;

import app.mobilex.plus.util.TypefaceCache;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Collections;
import javax.net.ssl.SNIHostName;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class MOOdXFNSArQOU69IuE extends SSLSocketFactory {
    public final /* synthetic */ int dDIMxZXP1V8HdM;
    public final Serializable vekpFI4d1Nc4fakF;
    public final SSLSocketFactory w9sT1Swbhx3hs;

    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.Serializable, java.lang.String[]] */
    public MOOdXFNSArQOU69IuE(SSLSocketFactory sSLSocketFactory) {
        this.dDIMxZXP1V8HdM = 1;
        this.w9sT1Swbhx3hs = sSLSocketFactory;
        this.vekpFI4d1Nc4fakF = new String[]{TypefaceCache.obtain("0017005A0068009100A100F10081"), TypefaceCache.obtain("0017005A0068009100A100F10080")};
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        switch (this.dDIMxZXP1V8HdM) {
            case 0:
                String str2 = (String) this.vekpFI4d1Nc4fakF;
                SSLSocket sSLSocket = (SSLSocket) this.w9sT1Swbhx3hs.createSocket(socket, str2, i, z);
                SSLParameters sSLParameters = sSLSocket.getSSLParameters();
                sSLParameters.setServerNames(Collections.singletonList(new SNIHostName(str2)));
                sSLSocket.setSSLParameters(sSLParameters);
                return sSLSocket;
            default:
                SSLSocket sSLSocket2 = (SSLSocket) this.w9sT1Swbhx3hs.createSocket(socket, str, i, z);
                sSLSocket2.setEnabledProtocols((String[]) this.vekpFI4d1Nc4fakF);
                return sSLSocket2;
        }
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        switch (this.dDIMxZXP1V8HdM) {
            case 0:
                break;
        }
        return this.w9sT1Swbhx3hs.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        switch (this.dDIMxZXP1V8HdM) {
            case 0:
                break;
        }
        return this.w9sT1Swbhx3hs.getSupportedCipherSuites();
    }

    public MOOdXFNSArQOU69IuE(SSLSocketFactory sSLSocketFactory, String str) {
        this.dDIMxZXP1V8HdM = 0;
        this.w9sT1Swbhx3hs = sSLSocketFactory;
        this.vekpFI4d1Nc4fakF = str;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        switch (this.dDIMxZXP1V8HdM) {
            case 0:
                SSLSocket sSLSocket = (SSLSocket) this.w9sT1Swbhx3hs.createSocket(str, i);
                SSLParameters sSLParameters = sSLSocket.getSSLParameters();
                sSLParameters.setServerNames(Collections.singletonList(new SNIHostName((String) this.vekpFI4d1Nc4fakF)));
                sSLSocket.setSSLParameters(sSLParameters);
                return sSLSocket;
            default:
                SSLSocket sSLSocket2 = (SSLSocket) this.w9sT1Swbhx3hs.createSocket(str, i);
                sSLSocket2.setEnabledProtocols((String[]) this.vekpFI4d1Nc4fakF);
                return sSLSocket2;
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        switch (this.dDIMxZXP1V8HdM) {
            case 0:
                SSLSocket sSLSocket = (SSLSocket) this.w9sT1Swbhx3hs.createSocket(str, i, inetAddress, i2);
                SSLParameters sSLParameters = sSLSocket.getSSLParameters();
                sSLParameters.setServerNames(Collections.singletonList(new SNIHostName((String) this.vekpFI4d1Nc4fakF)));
                sSLSocket.setSSLParameters(sSLParameters);
                return sSLSocket;
            default:
                SSLSocket sSLSocket2 = (SSLSocket) this.w9sT1Swbhx3hs.createSocket(str, i, inetAddress, i2);
                sSLSocket2.setEnabledProtocols((String[]) this.vekpFI4d1Nc4fakF);
                return sSLSocket2;
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        switch (this.dDIMxZXP1V8HdM) {
            case 0:
                SSLSocket sSLSocket = (SSLSocket) this.w9sT1Swbhx3hs.createSocket(inetAddress, i);
                SSLParameters sSLParameters = sSLSocket.getSSLParameters();
                sSLParameters.setServerNames(Collections.singletonList(new SNIHostName((String) this.vekpFI4d1Nc4fakF)));
                sSLSocket.setSSLParameters(sSLParameters);
                return sSLSocket;
            default:
                SSLSocket sSLSocket2 = (SSLSocket) this.w9sT1Swbhx3hs.createSocket(inetAddress, i);
                sSLSocket2.setEnabledProtocols((String[]) this.vekpFI4d1Nc4fakF);
                return sSLSocket2;
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        switch (this.dDIMxZXP1V8HdM) {
            case 0:
                SSLSocket sSLSocket = (SSLSocket) this.w9sT1Swbhx3hs.createSocket(inetAddress, i, inetAddress2, i2);
                SSLParameters sSLParameters = sSLSocket.getSSLParameters();
                sSLParameters.setServerNames(Collections.singletonList(new SNIHostName((String) this.vekpFI4d1Nc4fakF)));
                sSLSocket.setSSLParameters(sSLParameters);
                return sSLSocket;
            default:
                SSLSocket sSLSocket2 = (SSLSocket) this.w9sT1Swbhx3hs.createSocket(inetAddress, i, inetAddress2, i2);
                sSLSocket2.setEnabledProtocols((String[]) this.vekpFI4d1Nc4fakF);
                return sSLSocket2;
        }
    }
}
