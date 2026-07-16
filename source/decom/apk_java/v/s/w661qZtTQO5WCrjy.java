package v.s;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class w661qZtTQO5WCrjy implements ZEBd2nNtvnSQpUDBe {
    public static final heGxaSS9QOIZ dDIMxZXP1V8HdM = new heGxaSS9QOIZ();

    @Override // v.s.ZEBd2nNtvnSQpUDBe
    public final void JXn4Qf7zpnLjP5(SSLSocket sSLSocket, String str, List list) {
        if (dDIMxZXP1V8HdM(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            QnMItFgHCjZ1bOS qnMItFgHCjZ1bOS = QnMItFgHCjZ1bOS.dDIMxZXP1V8HdM;
            parameters.setApplicationProtocols((String[]) fEyMFFyOOvHURJ7To6L.xDyLpEZyrcKVe0(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }

    @Override // v.s.ZEBd2nNtvnSQpUDBe
    public final boolean dDIMxZXP1V8HdM(SSLSocket sSLSocket) {
        return false;
    }

    @Override // v.s.ZEBd2nNtvnSQpUDBe
    public final boolean vekpFI4d1Nc4fakF() {
        boolean z = HWmCWuyStN5Ponf4bDQK.JXn4Qf7zpnLjP5;
        return HWmCWuyStN5Ponf4bDQK.JXn4Qf7zpnLjP5;
    }

    @Override // v.s.ZEBd2nNtvnSQpUDBe
    public final String w9sT1Swbhx3hs(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }
}
