package v.s;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class iYDLATcr7uQpkM implements ZEBd2nNtvnSQpUDBe {
    public static final JQWOjTnzQW7WamDxt dDIMxZXP1V8HdM = new JQWOjTnzQW7WamDxt();

    private static /* synthetic */ void oeslsou() {
    }

    @Override // v.s.ZEBd2nNtvnSQpUDBe
    public final void JXn4Qf7zpnLjP5(SSLSocket sSLSocket, String str, List list) {
        if (dDIMxZXP1V8HdM(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            QnMItFgHCjZ1bOS qnMItFgHCjZ1bOS = QnMItFgHCjZ1bOS.dDIMxZXP1V8HdM;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) fEyMFFyOOvHURJ7To6L.xDyLpEZyrcKVe0(list).toArray(new String[0]));
        }
    }

    @Override // v.s.ZEBd2nNtvnSQpUDBe
    public final boolean dDIMxZXP1V8HdM(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // v.s.ZEBd2nNtvnSQpUDBe
    public final boolean vekpFI4d1Nc4fakF() {
        boolean z = WlkInImUvZMBlF4FhRXf.JXn4Qf7zpnLjP5;
        return WlkInImUvZMBlF4FhRXf.JXn4Qf7zpnLjP5;
    }

    @Override // v.s.ZEBd2nNtvnSQpUDBe
    public final String w9sT1Swbhx3hs(SSLSocket sSLSocket) {
        if (dDIMxZXP1V8HdM(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }
}
