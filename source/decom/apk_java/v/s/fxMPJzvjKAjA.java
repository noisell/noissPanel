package v.s;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class fxMPJzvjKAjA implements ZEBd2nNtvnSQpUDBe {
    public static final fEyMFFyOOvHURJ7To6L xDyLpEZyrcKVe0 = new fEyMFFyOOvHURJ7To6L(9);
    public final Method Ee8d2j4S9Vm5yGuR;
    public final Method JXn4Qf7zpnLjP5;
    public final Class dDIMxZXP1V8HdM;
    public final Method vekpFI4d1Nc4fakF;
    public final Method w9sT1Swbhx3hs;

    public fxMPJzvjKAjA(Class cls) {
        this.dDIMxZXP1V8HdM = cls;
        this.w9sT1Swbhx3hs = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        this.vekpFI4d1Nc4fakF = cls.getMethod("setHostname", String.class);
        this.JXn4Qf7zpnLjP5 = cls.getMethod("getAlpnSelectedProtocol", null);
        this.Ee8d2j4S9Vm5yGuR = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    private static /* synthetic */ void mnrybdipii() {
    }

    @Override // v.s.ZEBd2nNtvnSQpUDBe
    public final void JXn4Qf7zpnLjP5(SSLSocket sSLSocket, String str, List list) {
        if (this.dDIMxZXP1V8HdM.isInstance(sSLSocket)) {
            try {
                this.w9sT1Swbhx3hs.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.vekpFI4d1Nc4fakF.invoke(sSLSocket, str);
                }
                Method method = this.Ee8d2j4S9Vm5yGuR;
                QnMItFgHCjZ1bOS qnMItFgHCjZ1bOS = QnMItFgHCjZ1bOS.dDIMxZXP1V8HdM;
                method.invoke(sSLSocket, fEyMFFyOOvHURJ7To6L.b1EoSIRjJHO5(list));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    @Override // v.s.ZEBd2nNtvnSQpUDBe
    public final boolean dDIMxZXP1V8HdM(SSLSocket sSLSocket) {
        return this.dDIMxZXP1V8HdM.isInstance(sSLSocket);
    }

    @Override // v.s.ZEBd2nNtvnSQpUDBe
    public final boolean vekpFI4d1Nc4fakF() {
        boolean z = qiOhdF48gPbc.Ee8d2j4S9Vm5yGuR;
        return qiOhdF48gPbc.Ee8d2j4S9Vm5yGuR;
    }

    @Override // v.s.ZEBd2nNtvnSQpUDBe
    public final String w9sT1Swbhx3hs(SSLSocket sSLSocket) {
        if (this.dDIMxZXP1V8HdM.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.JXn4Qf7zpnLjP5.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM);
                }
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (!(cause instanceof NullPointerException) || !okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    throw new AssertionError(e2);
                }
            }
        }
        return null;
    }
}
