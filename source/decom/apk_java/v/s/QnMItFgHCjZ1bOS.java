package v.s;

import android.util.Log;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class QnMItFgHCjZ1bOS {
    public static volatile QnMItFgHCjZ1bOS dDIMxZXP1V8HdM;
    public static final Logger w9sT1Swbhx3hs;

    /* JADX WARN: Code duplicated, block: B:25:0x0074 A[PHI: r0
      0x0074: PHI (r0v32 v.s.QnMItFgHCjZ1bOS) = 
      (r0v15 v.s.QnMItFgHCjZ1bOS)
      (r0v17 v.s.QnMItFgHCjZ1bOS)
      (r0v22 v.s.QnMItFgHCjZ1bOS)
      (r0v26 v.s.QnMItFgHCjZ1bOS)
      (r0v30 v.s.QnMItFgHCjZ1bOS)
      (r0v41 v.s.QnMItFgHCjZ1bOS)
     binds: [B:54:0x00ed, B:66:0x014b, B:48:0x00dc, B:40:0x00b9, B:32:0x0098, B:21:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00be  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00da  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:61:0x0105  */
    /* JADX WARN: Code duplicated, block: B:66:0x014b  */
    static {
        QnMItFgHCjZ1bOS qnMItFgHCjZ1bOS;
        QnMItFgHCjZ1bOS ojh24qoemc6f = null;
        if (fEyMFFyOOvHURJ7To6L.D5P1xCAyuvgF()) {
            for (Map.Entry entry : n8nqApvKDYz7s8llJ2jf.w9sT1Swbhx3hs.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Logger logger = Logger.getLogger(str);
                if (n8nqApvKDYz7s8llJ2jf.dDIMxZXP1V8HdM.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(uCN4HERvZEfG7JjL.dDIMxZXP1V8HdM);
                }
            }
            qnMItFgHCjZ1bOS = GiffeZJ1rbwyx.JXn4Qf7zpnLjP5 ? new GiffeZJ1rbwyx() : null;
            if (qnMItFgHCjZ1bOS != null) {
                ojh24qoemc6f = qnMItFgHCjZ1bOS;
            } else if (qiOhdF48gPbc.Ee8d2j4S9Vm5yGuR) {
                ojh24qoemc6f = new qiOhdF48gPbc();
            }
        } else if ("Conscrypt".equals(Security.getProviders()[0].getName())) {
            qnMItFgHCjZ1bOS = WlkInImUvZMBlF4FhRXf.JXn4Qf7zpnLjP5 ? new WlkInImUvZMBlF4FhRXf() : null;
            if (qnMItFgHCjZ1bOS != null) {
                ojh24qoemc6f = qnMItFgHCjZ1bOS;
            } else if (!"BC".equals(Security.getProviders()[0].getName())) {
                if (HWmCWuyStN5Ponf4bDQK.JXn4Qf7zpnLjP5) {
                    qnMItFgHCjZ1bOS = new HWmCWuyStN5Ponf4bDQK();
                } else {
                    qnMItFgHCjZ1bOS = null;
                }
                if (qnMItFgHCjZ1bOS != null) {
                    ojh24qoemc6f = qnMItFgHCjZ1bOS;
                } else if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
                    if (g3Ryz5KhWgXcz.JXn4Qf7zpnLjP5) {
                        qnMItFgHCjZ1bOS = new g3Ryz5KhWgXcz();
                    } else {
                        qnMItFgHCjZ1bOS = null;
                    }
                    if (qnMItFgHCjZ1bOS != null) {
                        ojh24qoemc6f = qnMItFgHCjZ1bOS;
                    } else {
                        if (E6LOIpVzgpFhIRv.vekpFI4d1Nc4fakF) {
                            qnMItFgHCjZ1bOS = new E6LOIpVzgpFhIRv();
                        } else {
                            qnMItFgHCjZ1bOS = null;
                        }
                        if (qnMItFgHCjZ1bOS != null) {
                            ojh24qoemc6f = qnMItFgHCjZ1bOS;
                        } else {
                            if (Integer.parseInt(System.getProperty("java.specification.version", "unknown")) < 9) {
                                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                ojh24qoemc6f = new ojH24QOEMC6f(cls.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null)), cls.getMethod("get", SSLSocket.class), cls.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null));
                            }
                            if (ojh24qoemc6f == null) {
                                qnMItFgHCjZ1bOS = new QnMItFgHCjZ1bOS();
                                ojh24qoemc6f = qnMItFgHCjZ1bOS;
                            }
                        }
                    }
                } else {
                    if (E6LOIpVzgpFhIRv.vekpFI4d1Nc4fakF) {
                        qnMItFgHCjZ1bOS = new E6LOIpVzgpFhIRv();
                    } else {
                        qnMItFgHCjZ1bOS = null;
                    }
                    if (qnMItFgHCjZ1bOS != null) {
                        ojh24qoemc6f = qnMItFgHCjZ1bOS;
                    } else {
                        if (Integer.parseInt(System.getProperty("java.specification.version", "unknown")) < 9) {
                            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            ojh24qoemc6f = new ojH24QOEMC6f(cls2.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null)), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null));
                        }
                        if (ojh24qoemc6f == null) {
                            qnMItFgHCjZ1bOS = new QnMItFgHCjZ1bOS();
                            ojh24qoemc6f = qnMItFgHCjZ1bOS;
                        }
                    }
                }
            } else if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
                if (E6LOIpVzgpFhIRv.vekpFI4d1Nc4fakF) {
                    qnMItFgHCjZ1bOS = new E6LOIpVzgpFhIRv();
                } else {
                    qnMItFgHCjZ1bOS = null;
                }
                if (qnMItFgHCjZ1bOS != null) {
                    ojh24qoemc6f = qnMItFgHCjZ1bOS;
                } else {
                    if (Integer.parseInt(System.getProperty("java.specification.version", "unknown")) < 9) {
                        Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                        ojh24qoemc6f = new ojH24QOEMC6f(cls3.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null)), cls3.getMethod("get", SSLSocket.class), cls3.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null));
                    }
                    if (ojh24qoemc6f == null) {
                        qnMItFgHCjZ1bOS = new QnMItFgHCjZ1bOS();
                        ojh24qoemc6f = qnMItFgHCjZ1bOS;
                    }
                }
            } else {
                if (g3Ryz5KhWgXcz.JXn4Qf7zpnLjP5) {
                    qnMItFgHCjZ1bOS = new g3Ryz5KhWgXcz();
                } else {
                    qnMItFgHCjZ1bOS = null;
                }
                if (qnMItFgHCjZ1bOS != null) {
                    ojh24qoemc6f = qnMItFgHCjZ1bOS;
                } else {
                    if (E6LOIpVzgpFhIRv.vekpFI4d1Nc4fakF) {
                        qnMItFgHCjZ1bOS = new E6LOIpVzgpFhIRv();
                    } else {
                        qnMItFgHCjZ1bOS = null;
                    }
                    if (qnMItFgHCjZ1bOS != null) {
                        ojh24qoemc6f = qnMItFgHCjZ1bOS;
                    } else {
                        if (Integer.parseInt(System.getProperty("java.specification.version", "unknown")) < 9) {
                            Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            ojh24qoemc6f = new ojH24QOEMC6f(cls4.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null)), cls4.getMethod("get", SSLSocket.class), cls4.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null));
                        }
                        if (ojh24qoemc6f == null) {
                            qnMItFgHCjZ1bOS = new QnMItFgHCjZ1bOS();
                            ojh24qoemc6f = qnMItFgHCjZ1bOS;
                        }
                    }
                }
            }
        } else if (!"BC".equals(Security.getProviders()[0].getName())) {
            if (HWmCWuyStN5Ponf4bDQK.JXn4Qf7zpnLjP5) {
                qnMItFgHCjZ1bOS = new HWmCWuyStN5Ponf4bDQK();
            } else {
                qnMItFgHCjZ1bOS = null;
            }
            if (qnMItFgHCjZ1bOS != null) {
                ojh24qoemc6f = qnMItFgHCjZ1bOS;
            } else if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
                if (E6LOIpVzgpFhIRv.vekpFI4d1Nc4fakF) {
                    qnMItFgHCjZ1bOS = new E6LOIpVzgpFhIRv();
                } else {
                    qnMItFgHCjZ1bOS = null;
                }
                if (qnMItFgHCjZ1bOS != null) {
                    ojh24qoemc6f = qnMItFgHCjZ1bOS;
                } else {
                    if (Integer.parseInt(System.getProperty("java.specification.version", "unknown")) < 9) {
                        Class<?> cls5 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                        ojh24qoemc6f = new ojH24QOEMC6f(cls5.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null)), cls5.getMethod("get", SSLSocket.class), cls5.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null));
                    }
                    if (ojh24qoemc6f == null) {
                        qnMItFgHCjZ1bOS = new QnMItFgHCjZ1bOS();
                        ojh24qoemc6f = qnMItFgHCjZ1bOS;
                    }
                }
            } else {
                if (g3Ryz5KhWgXcz.JXn4Qf7zpnLjP5) {
                    qnMItFgHCjZ1bOS = new g3Ryz5KhWgXcz();
                } else {
                    qnMItFgHCjZ1bOS = null;
                }
                if (qnMItFgHCjZ1bOS != null) {
                    ojh24qoemc6f = qnMItFgHCjZ1bOS;
                } else {
                    if (E6LOIpVzgpFhIRv.vekpFI4d1Nc4fakF) {
                        qnMItFgHCjZ1bOS = new E6LOIpVzgpFhIRv();
                    } else {
                        qnMItFgHCjZ1bOS = null;
                    }
                    if (qnMItFgHCjZ1bOS != null) {
                        ojh24qoemc6f = qnMItFgHCjZ1bOS;
                    } else {
                        if (Integer.parseInt(System.getProperty("java.specification.version", "unknown")) < 9) {
                            Class<?> cls6 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            ojh24qoemc6f = new ojH24QOEMC6f(cls6.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null)), cls6.getMethod("get", SSLSocket.class), cls6.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null));
                        }
                        if (ojh24qoemc6f == null) {
                            qnMItFgHCjZ1bOS = new QnMItFgHCjZ1bOS();
                            ojh24qoemc6f = qnMItFgHCjZ1bOS;
                        }
                    }
                }
            }
        } else if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
            if (E6LOIpVzgpFhIRv.vekpFI4d1Nc4fakF) {
                qnMItFgHCjZ1bOS = new E6LOIpVzgpFhIRv();
            } else {
                qnMItFgHCjZ1bOS = null;
            }
            if (qnMItFgHCjZ1bOS != null) {
                ojh24qoemc6f = qnMItFgHCjZ1bOS;
            } else {
                try {
                    if (Integer.parseInt(System.getProperty("java.specification.version", "unknown")) < 9) {
                        try {
                            Class<?> cls7 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            ojh24qoemc6f = new ojH24QOEMC6f(cls7.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null)), cls7.getMethod("get", SSLSocket.class), cls7.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null));
                        } catch (ClassNotFoundException | NoSuchMethodException unused) {
                        }
                    }
                } catch (NumberFormatException unused2) {
                }
                if (ojh24qoemc6f == null) {
                    qnMItFgHCjZ1bOS = new QnMItFgHCjZ1bOS();
                    ojh24qoemc6f = qnMItFgHCjZ1bOS;
                }
            }
        } else {
            if (g3Ryz5KhWgXcz.JXn4Qf7zpnLjP5) {
                qnMItFgHCjZ1bOS = new g3Ryz5KhWgXcz();
            } else {
                qnMItFgHCjZ1bOS = null;
            }
            if (qnMItFgHCjZ1bOS != null) {
                ojh24qoemc6f = qnMItFgHCjZ1bOS;
            } else {
                if (E6LOIpVzgpFhIRv.vekpFI4d1Nc4fakF) {
                    qnMItFgHCjZ1bOS = new E6LOIpVzgpFhIRv();
                } else {
                    qnMItFgHCjZ1bOS = null;
                }
                if (qnMItFgHCjZ1bOS != null) {
                    ojh24qoemc6f = qnMItFgHCjZ1bOS;
                } else {
                    if (Integer.parseInt(System.getProperty("java.specification.version", "unknown")) < 9) {
                        Class<?> cls8 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                        ojh24qoemc6f = new ojH24QOEMC6f(cls8.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null)), cls8.getMethod("get", SSLSocket.class), cls8.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null));
                    }
                    if (ojh24qoemc6f == null) {
                        qnMItFgHCjZ1bOS = new QnMItFgHCjZ1bOS();
                        ojh24qoemc6f = qnMItFgHCjZ1bOS;
                    }
                }
            }
        }
        dDIMxZXP1V8HdM = ojh24qoemc6f;
        w9sT1Swbhx3hs = Logger.getLogger(sp6apkX00TawY02qGY6r.class.getName());
    }

    public static void pyu8ovAipBTLYAiKab(String str, int i, Throwable th) {
        w9sT1Swbhx3hs.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    private static /* synthetic */ void ymtlfftcrj() {
    }

    public void D5P1xCAyuvgF(Object obj, String str) {
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        pyu8ovAipBTLYAiKab(str, 5, (Throwable) obj);
    }

    public void Ee8d2j4S9Vm5yGuR(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.connect(inetSocketAddress, i);
    }

    public void JXn4Qf7zpnLjP5(SSLSocket sSLSocket, String str, List list) {
    }

    public boolean b1EoSIRjJHO5(String str) {
        return true;
    }

    public void dDIMxZXP1V8HdM(SSLSocket sSLSocket) {
    }

    public X509TrustManager gIIiyi2ddlMDR0() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                return (X509TrustManager) trustManager;
            }
        }
        throw new IllegalStateException("Unexpected default trust managers: ".concat(Arrays.toString(trustManagers)).toString());
    }

    public SSLSocketFactory gmNWMfvn6zlEj(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContextHjneShqpF9Tis4 = hjneShqpF9Tis4();
            sSLContextHjneShqpF9Tis4.init(null, new TrustManager[]{x509TrustManager}, null);
            return sSLContextHjneShqpF9Tis4.getSocketFactory();
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS: " + e, e);
        }
    }

    public SSLContext hjneShqpF9Tis4() {
        return SSLContext.getInstance("TLS");
    }

    public Object ibVTtJUNfrGYbW() {
        if (w9sT1Swbhx3hs.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public final String toString() {
        return getClass().getSimpleName();
    }

    public EHhQl0J8kFArK vekpFI4d1Nc4fakF(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new rAckXJVpHeILmMRqovSI((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public FZ1sl4mHq4J0hOEYC w9sT1Swbhx3hs(X509TrustManager x509TrustManager) {
        return new P3DiyBV7wfhPB0a1Q6(vekpFI4d1Nc4fakF(x509TrustManager));
    }

    public String xDyLpEZyrcKVe0(SSLSocket sSLSocket) {
        return null;
    }
}
