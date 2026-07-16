package v.s;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class GiffeZJ1rbwyx extends QnMItFgHCjZ1bOS {
    public static final boolean JXn4Qf7zpnLjP5;
    public final ArrayList vekpFI4d1Nc4fakF;

    static {
        JXn4Qf7zpnLjP5 = fEyMFFyOOvHURJ7To6L.D5P1xCAyuvgF() && Build.VERSION.SDK_INT >= 29;
    }

    public GiffeZJ1rbwyx() {
        int i = 0;
        ArrayList arrayListQfTrc75xwRVMl85vh = VnDsNIgXNCQywv8lGh.qfTrc75xwRVMl85vh(new ZEBd2nNtvnSQpUDBe[]{(!fEyMFFyOOvHURJ7To6L.D5P1xCAyuvgF() || Build.VERSION.SDK_INT < 29) ? null : new bbLLF31we2Iu(), new SdwNlmbbJBoSfmeP85WB(fxMPJzvjKAjA.xDyLpEZyrcKVe0), new SdwNlmbbJBoSfmeP85WB(iYDLATcr7uQpkM.dDIMxZXP1V8HdM), new SdwNlmbbJBoSfmeP85WB(w661qZtTQO5WCrjy.dDIMxZXP1V8HdM)});
        ArrayList arrayList = new ArrayList();
        int size = arrayListQfTrc75xwRVMl85vh.size();
        while (i < size) {
            Object obj = arrayListQfTrc75xwRVMl85vh.get(i);
            i++;
            if (((ZEBd2nNtvnSQpUDBe) obj).vekpFI4d1Nc4fakF()) {
                arrayList.add(obj);
            }
        }
        this.vekpFI4d1Nc4fakF = arrayList;
    }

    @Override // v.s.QnMItFgHCjZ1bOS
    public final void JXn4Qf7zpnLjP5(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        ArrayList arrayList = this.vekpFI4d1Nc4fakF;
        int size = arrayList.size();
        int i = 0;
        do {
            if (i >= size) {
                obj = null;
                break;
            } else {
                obj = arrayList.get(i);
                i++;
            }
        } while (!((ZEBd2nNtvnSQpUDBe) obj).dDIMxZXP1V8HdM(sSLSocket));
        ZEBd2nNtvnSQpUDBe zEBd2nNtvnSQpUDBe = (ZEBd2nNtvnSQpUDBe) obj;
        if (zEBd2nNtvnSQpUDBe != null) {
            zEBd2nNtvnSQpUDBe.JXn4Qf7zpnLjP5(sSLSocket, str, list);
        }
    }

    @Override // v.s.QnMItFgHCjZ1bOS
    public final boolean b1EoSIRjJHO5(String str) {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // v.s.QnMItFgHCjZ1bOS
    public final FZ1sl4mHq4J0hOEYC w9sT1Swbhx3hs(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        Yrf7mWjzxCbCCUcSPwXl yrf7mWjzxCbCCUcSPwXl = x509TrustManagerExtensions != null ? new Yrf7mWjzxCbCCUcSPwXl(x509TrustManager, x509TrustManagerExtensions) : null;
        return yrf7mWjzxCbCCUcSPwXl != null ? yrf7mWjzxCbCCUcSPwXl : super.w9sT1Swbhx3hs(x509TrustManager);
    }

    @Override // v.s.QnMItFgHCjZ1bOS
    public final String xDyLpEZyrcKVe0(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.vekpFI4d1Nc4fakF;
        int size = arrayList.size();
        int i = 0;
        do {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
        } while (!((ZEBd2nNtvnSQpUDBe) obj).dDIMxZXP1V8HdM(sSLSocket));
        ZEBd2nNtvnSQpUDBe zEBd2nNtvnSQpUDBe = (ZEBd2nNtvnSQpUDBe) obj;
        if (zEBd2nNtvnSQpUDBe != null) {
            return zEBd2nNtvnSQpUDBe.w9sT1Swbhx3hs(sSLSocket);
        }
        return null;
    }
}
