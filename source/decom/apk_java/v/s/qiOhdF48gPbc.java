package v.s;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class qiOhdF48gPbc extends QnMItFgHCjZ1bOS {
    public static final boolean Ee8d2j4S9Vm5yGuR;
    public final Skepx2yfpiHXKq JXn4Qf7zpnLjP5;
    public final ArrayList vekpFI4d1Nc4fakF;

    static {
        boolean z = false;
        if (fEyMFFyOOvHURJ7To6L.D5P1xCAyuvgF() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        Ee8d2j4S9Vm5yGuR = z;
    }

    public qiOhdF48gPbc() throws NoSuchMethodException {
        GqsWmc8dJJvY gqsWmc8dJJvY;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            gqsWmc8dJJvY = new GqsWmc8dJJvY(cls);
        } catch (Exception e) {
            QnMItFgHCjZ1bOS.dDIMxZXP1V8HdM.getClass();
            QnMItFgHCjZ1bOS.pyu8ovAipBTLYAiKab("unable to load android socket classes", 5, e);
            gqsWmc8dJJvY = null;
        }
        int i = 0;
        ArrayList arrayListQfTrc75xwRVMl85vh = VnDsNIgXNCQywv8lGh.qfTrc75xwRVMl85vh(new ZEBd2nNtvnSQpUDBe[]{gqsWmc8dJJvY, new SdwNlmbbJBoSfmeP85WB(fxMPJzvjKAjA.xDyLpEZyrcKVe0), new SdwNlmbbJBoSfmeP85WB(iYDLATcr7uQpkM.dDIMxZXP1V8HdM), new SdwNlmbbJBoSfmeP85WB(w661qZtTQO5WCrjy.dDIMxZXP1V8HdM)});
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
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", null);
            method2 = cls2.getMethod("open", String.class);
            method = cls2.getMethod("warnIfOpen", null);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.JXn4Qf7zpnLjP5 = new Skepx2yfpiHXKq(method3, method2, method);
    }

    @Override // v.s.QnMItFgHCjZ1bOS
    public final void D5P1xCAyuvgF(Object obj, String str) {
        Skepx2yfpiHXKq skepx2yfpiHXKq = this.JXn4Qf7zpnLjP5;
        skepx2yfpiHXKq.getClass();
        if (obj != null) {
            try {
                skepx2yfpiHXKq.vekpFI4d1Nc4fakF.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        QnMItFgHCjZ1bOS.pyu8ovAipBTLYAiKab(str, 5, null);
    }

    @Override // v.s.QnMItFgHCjZ1bOS
    public final void Ee8d2j4S9Vm5yGuR(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e;
            }
            throw new IOException("Exception in connect", e);
        }
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
    public final Object ibVTtJUNfrGYbW() {
        Skepx2yfpiHXKq skepx2yfpiHXKq = this.JXn4Qf7zpnLjP5;
        Method method = skepx2yfpiHXKq.dDIMxZXP1V8HdM;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, null);
                skepx2yfpiHXKq.w9sT1Swbhx3hs.invoke(objInvoke, "response.body().close()");
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // v.s.QnMItFgHCjZ1bOS
    public final EHhQl0J8kFArK vekpFI4d1Nc4fakF(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new Q7qC5ia93qGCjkBXCF0A(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.vekpFI4d1Nc4fakF(x509TrustManager);
        }
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
