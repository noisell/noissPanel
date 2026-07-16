package v.s;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class PoVDiNYMKgNfF {
    public static final /* synthetic */ int dDIMxZXP1V8HdM = 0;

    static {
        fEyMFFyOOvHURJ7To6L.wotphlvK9sPbXJ("NetworkStateTracker");
    }

    public static final VkQG3YKcRU3qaiFy6K1 dDIMxZXP1V8HdM(ConnectivityManager connectivityManager) {
        boolean zW9sT1Swbhx3hs;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            NetworkCapabilities networkCapabilitiesDDIMxZXP1V8HdM = IDfcxMnxNsnKybScx.dDIMxZXP1V8HdM(connectivityManager, mRnObzGiVc3rkq2.dDIMxZXP1V8HdM(connectivityManager));
            zW9sT1Swbhx3hs = networkCapabilitiesDDIMxZXP1V8HdM != null ? IDfcxMnxNsnKybScx.w9sT1Swbhx3hs(networkCapabilitiesDDIMxZXP1V8HdM, 16) : false;
        } catch (SecurityException unused) {
            fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
        }
        return new VkQG3YKcRU3qaiFy6K1(z, zW9sT1Swbhx3hs, I204ComZBcSXftU.dDIMxZXP1V8HdM(connectivityManager), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
    }
}
