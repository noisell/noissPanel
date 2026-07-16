package v.s;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class bbLLF31we2Iu implements ZEBd2nNtvnSQpUDBe {
    private static /* synthetic */ void cchqu() {
    }

    @Override // v.s.ZEBd2nNtvnSQpUDBe
    public final void JXn4Qf7zpnLjP5(SSLSocket sSLSocket, String str, List list) throws IOException {
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            QnMItFgHCjZ1bOS qnMItFgHCjZ1bOS = QnMItFgHCjZ1bOS.dDIMxZXP1V8HdM;
            sSLParameters.setApplicationProtocols((String[]) fEyMFFyOOvHURJ7To6L.xDyLpEZyrcKVe0(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }

    @Override // v.s.ZEBd2nNtvnSQpUDBe
    public final boolean dDIMxZXP1V8HdM(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // v.s.ZEBd2nNtvnSQpUDBe
    public final boolean vekpFI4d1Nc4fakF() {
        QnMItFgHCjZ1bOS qnMItFgHCjZ1bOS = QnMItFgHCjZ1bOS.dDIMxZXP1V8HdM;
        return fEyMFFyOOvHURJ7To6L.D5P1xCAyuvgF() && Build.VERSION.SDK_INT >= (-41) + 70;
    }

    @Override // v.s.ZEBd2nNtvnSQpUDBe
    public final String w9sT1Swbhx3hs(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }
}
