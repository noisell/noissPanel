package v.s;

import android.util.Base64;
import app.mobilex.plus.HandlerSJAdapter;
import app.mobilex.plus.services.ManagerUMController;
import app.mobilex.plus.util.TypefaceCache;
import app.mobilex.plus.util.UtilYWProcessor;
import java.io.ByteArrayInputStream;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.NoSuchElementException;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class XjSHuXm0nOSRc3iA9 extends LGm23hksIOxB implements JRdueaGIH5g8DVCPba {
    public static final XjSHuXm0nOSRc3iA9 D5P1xCAyuvgF;
    public static final XjSHuXm0nOSRc3iA9 Ee8d2j4S9Vm5yGuR;
    public static final XjSHuXm0nOSRc3iA9 JXn4Qf7zpnLjP5;
    public static final XjSHuXm0nOSRc3iA9 b1EoSIRjJHO5;
    public static final XjSHuXm0nOSRc3iA9 ibVTtJUNfrGYbW;
    public static final XjSHuXm0nOSRc3iA9 pyu8ovAipBTLYAiKab;
    public static final XjSHuXm0nOSRc3iA9 xDyLpEZyrcKVe0;
    public final /* synthetic */ int vekpFI4d1Nc4fakF;

    static {
        int i = 0;
        JXn4Qf7zpnLjP5 = new XjSHuXm0nOSRc3iA9(i, 0);
        Ee8d2j4S9Vm5yGuR = new XjSHuXm0nOSRc3iA9(i, 1);
        xDyLpEZyrcKVe0 = new XjSHuXm0nOSRc3iA9(i, 2);
        ibVTtJUNfrGYbW = new XjSHuXm0nOSRc3iA9(i, 3);
        b1EoSIRjJHO5 = new XjSHuXm0nOSRc3iA9(i, 4);
        pyu8ovAipBTLYAiKab = new XjSHuXm0nOSRc3iA9(i, 5);
        D5P1xCAyuvgF = new XjSHuXm0nOSRc3iA9(i, 6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ XjSHuXm0nOSRc3iA9(int i, int i2) {
        super(i);
        this.vekpFI4d1Nc4fakF = i2;
    }

    private static /* synthetic */ void lvljsej() {
    }

    @Override // v.s.JRdueaGIH5g8DVCPba
    public final Object w9sT1Swbhx3hs() throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException {
        byte[] bArrDecode;
        KeyManager[] keyManagers;
        int i;
        String strCo;
        int i2;
        String strCo2;
        boolean z = true;
        switch (this.vekpFI4d1Nc4fakF) {
            case 0:
                SSLContext sSLContext = SSLContext.getInstance(TypefaceCache.obtain("0017005A0068"));
                sSLContext.init(null, new TrustManager[]{(X509TrustManager) ktukzhfmAkOuMU.D5P1xCAyuvgF.dDIMxZXP1V8HdM()}, null);
                return sSLContext.getSocketFactory();
            case 1:
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init((KeyStore) null);
                for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                    if (trustManager instanceof X509TrustManager) {
                        X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                        return x509TrustManager instanceof X509ExtendedTrustManager ? new Egj8dNiKdwl62BjzhGNm((X509ExtendedTrustManager) x509TrustManager) : new zZspSMUA9NHs8(x509TrustManager);
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            case 2:
                SSLContext sSLContext2 = SSLContext.getInstance(TypefaceCache.obtain("0017005A0068"));
                iStgVlW5d7CQ5MhFi istgvlw5d7cq5mhfi = RWY6BVSB0XxPbw.d6c98qX7r0XzUZFibx;
                try {
                    bArrDecode = (UtilYWProcessor.dDIMxZXP1V8HdM && (i2 = KV57Z6oavcB595B8Dy8Z.Ee8d2j4S9Vm5yGuR) >= 0 && (strCo2 = UtilYWProcessor.co(i2)) != null && !BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(strCo2) && strCo2.length() >= 10) ? Base64.decode(strCo2, 0) : null;
                    break;
                } catch (Throwable unused) {
                }
                if (bArrDecode != null) {
                    String str = "";
                    if (UtilYWProcessor.dDIMxZXP1V8HdM && (i = KV57Z6oavcB595B8Dy8Z.xDyLpEZyrcKVe0) >= 0 && (strCo = UtilYWProcessor.co(i)) != null) {
                        str = strCo;
                    }
                    try {
                        KeyStore keyStore = KeyStore.getInstance(TypefaceCache.obtain("0013005D007800B400A100ED"));
                        keyStore.load(new ByteArrayInputStream(bArrDecode), str.toCharArray());
                        KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
                        keyManagerFactory.init(keyStore, str.toCharArray());
                        keyManagers = keyManagerFactory.getKeyManagers();
                    } catch (Exception e) {
                        iStgVlW5d7CQ5MhFi istgvlw5d7cq5mhfi2 = RWY6BVSB0XxPbw.d6c98qX7r0XzUZFibx;
                        TypefaceCache.obtain("002E0042007700B400B000B600DC00AE00370036005D008600F900B300D700A3006F00360055008800B000BC00DE00AE00260078004F00C700F300BA00C000B300790036");
                        e.getMessage();
                        keyManagers = null;
                    }
                    break;
                } else {
                    keyManagers = null;
                }
                iStgVlW5d7CQ5MhFi istgvlw5d7cq5mhfi3 = RWY6BVSB0XxPbw.d6c98qX7r0XzUZFibx;
                sSLContext2.init(keyManagers, new TrustManager[]{istgvlw5d7cq5mhfi3}, new SecureRandom());
                Vb7X6LE0p9sZh vb7X6LE0p9sZh = new Vb7X6LE0p9sZh();
                MOOdXFNSArQOU69IuE mOOdXFNSArQOU69IuE = new MOOdXFNSArQOU69IuE(sSLContext2.getSocketFactory());
                if (!mOOdXFNSArQOU69IuE.equals(vb7X6LE0p9sZh.Qrz92kRPw4GcghAc) || !istgvlw5d7cq5mhfi3.equals(vb7X6LE0p9sZh.nQilHWaqS401ZtR)) {
                    vb7X6LE0p9sZh.vIJudZvPyTuNp = null;
                }
                vb7X6LE0p9sZh.Qrz92kRPw4GcghAc = mOOdXFNSArQOU69IuE;
                QnMItFgHCjZ1bOS qnMItFgHCjZ1bOS = QnMItFgHCjZ1bOS.dDIMxZXP1V8HdM;
                vb7X6LE0p9sZh.DVTNwpDEVsUKuznof = QnMItFgHCjZ1bOS.dDIMxZXP1V8HdM.w9sT1Swbhx3hs(istgvlw5d7cq5mhfi3);
                vb7X6LE0p9sZh.nQilHWaqS401ZtR = istgvlw5d7cq5mhfi3;
                fDfo6OgW9tSXV fdfo6ogw9tsxv = new fDfo6OgW9tSXV();
                if (!fdfo6ogw9tsxv.equals(vb7X6LE0p9sZh.XiR1pIn5878vVWd)) {
                    vb7X6LE0p9sZh.vIJudZvPyTuNp = null;
                }
                vb7X6LE0p9sZh.XiR1pIn5878vVWd = fdfo6ogw9tsxv;
                vb7X6LE0p9sZh.dDIMxZXP1V8HdM(Collections.singletonList(B62d1BWQ36VxGmXU.HTTP_1_1));
                vb7X6LE0p9sZh.xDyLpEZyrcKVe0 = true;
                return new sp6apkX00TawY02qGY6r(vb7X6LE0p9sZh);
            case 3:
                String str2 = HandlerSJAdapter.dTS0S7eC32ubQH54j36;
                if (!jb8et6SZeK5TWMrJFxDX.gmNWMfvn6zlEj()) {
                    String str3 = ManagerUMController.DVTNwpDEVsUKuznof;
                    if (!ManagerUMController.ECwLkmPW1UKz7J6E) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            case 4:
                String str4 = HandlerSJAdapter.dTS0S7eC32ubQH54j36;
                return Boolean.valueOf(jb8et6SZeK5TWMrJFxDX.gmNWMfvn6zlEj());
            case 5:
                return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
            default:
                return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
        }
    }
}
