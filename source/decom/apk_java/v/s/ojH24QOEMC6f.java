package v.s;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class ojH24QOEMC6f extends QnMItFgHCjZ1bOS {
    public final Method Ee8d2j4S9Vm5yGuR;
    public final Method JXn4Qf7zpnLjP5;
    public final Class ibVTtJUNfrGYbW;
    public final Method vekpFI4d1Nc4fakF;
    public final Class xDyLpEZyrcKVe0;

    public ojH24QOEMC6f(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.vekpFI4d1Nc4fakF = method;
        this.JXn4Qf7zpnLjP5 = method2;
        this.Ee8d2j4S9Vm5yGuR = method3;
        this.xDyLpEZyrcKVe0 = cls;
        this.ibVTtJUNfrGYbW = cls2;
    }

    private static /* synthetic */ void jhiolyzo() {
    }

    @Override // v.s.QnMItFgHCjZ1bOS
    public final void JXn4Qf7zpnLjP5(SSLSocket sSLSocket, String str, List list) {
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
        try {
            this.vekpFI4d1Nc4fakF.invoke(null, sSLSocket, Proxy.newProxyInstance(QnMItFgHCjZ1bOS.class.getClassLoader(), new Class[]{this.xDyLpEZyrcKVe0, this.ibVTtJUNfrGYbW}, new yNYEpdVbN7wPXf5(arrayList2)));
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }

    @Override // v.s.QnMItFgHCjZ1bOS
    public final void dDIMxZXP1V8HdM(SSLSocket sSLSocket) {
        try {
            this.Ee8d2j4S9Vm5yGuR.invoke(null, sSLSocket);
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }

    @Override // v.s.QnMItFgHCjZ1bOS
    public final String xDyLpEZyrcKVe0(SSLSocket sSLSocket) {
        try {
            yNYEpdVbN7wPXf5 ynyepdvbn7wpxf5 = (yNYEpdVbN7wPXf5) Proxy.getInvocationHandler(this.JXn4Qf7zpnLjP5.invoke(null, sSLSocket));
            boolean z = ynyepdvbn7wpxf5.w9sT1Swbhx3hs;
            if (!z && ynyepdvbn7wpxf5.vekpFI4d1Nc4fakF == null) {
                QnMItFgHCjZ1bOS.pyu8ovAipBTLYAiKab("ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 4, null);
                return null;
            }
            if (z) {
                return null;
            }
            return ynyepdvbn7wpxf5.vekpFI4d1Nc4fakF;
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }
}
