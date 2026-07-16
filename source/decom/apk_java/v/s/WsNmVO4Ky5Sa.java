package v.s;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final /* synthetic */ class WsNmVO4Ky5Sa implements HostnameVerifier {
    public final /* synthetic */ int dDIMxZXP1V8HdM;
    public final /* synthetic */ String w9sT1Swbhx3hs;

    public /* synthetic */ WsNmVO4Ky5Sa(String str, int i) {
        this.dDIMxZXP1V8HdM = i;
        this.w9sT1Swbhx3hs = str;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        switch (this.dDIMxZXP1V8HdM) {
            case 0:
                return HttpsURLConnection.getDefaultHostnameVerifier().verify(this.w9sT1Swbhx3hs, sSLSession);
            default:
                return HttpsURLConnection.getDefaultHostnameVerifier().verify(this.w9sT1Swbhx3hs, sSLSession);
        }
    }
}
