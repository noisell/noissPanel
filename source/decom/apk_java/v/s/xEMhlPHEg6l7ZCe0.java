package v.s;

import android.app.Activity;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import app.mobilex.plus.HelperYOLoader;
import app.mobilex.plus.UtilNWWrapper;
import app.mobilex.plus.util.TypefaceCache;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class xEMhlPHEg6l7ZCe0 extends WebViewClient {
    public final /* synthetic */ int dDIMxZXP1V8HdM;
    public final /* synthetic */ Activity w9sT1Swbhx3hs;

    public /* synthetic */ xEMhlPHEg6l7ZCe0(Activity activity, int i) {
        this.dDIMxZXP1V8HdM = i;
        this.w9sT1Swbhx3hs = activity;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        int i = this.dDIMxZXP1V8HdM;
        Activity activity = this.w9sT1Swbhx3hs;
        switch (i) {
            case 0:
                super.onPageFinished(webView, str);
                HelperYOLoader helperYOLoader = (HelperYOLoader) activity;
                if (!BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(helperYOLoader.vekpFI4d1Nc4fakF) && webView != null) {
                    webView.evaluateJavascript(helperYOLoader.vekpFI4d1Nc4fakF, null);
                    break;
                }
                break;
            default:
                super.onPageFinished(webView, str);
                UtilNWWrapper utilNWWrapper = (UtilNWWrapper) activity;
                String str2 = UtilNWWrapper.A1BaTVAMeIXMnh;
                int identifier = utilNWWrapper.getResources().getIdentifier(TypefaceCache.obtain("002D0077004D008E00F700BE00C600AE002C00780064008500F100AD00ED00AF0026007F005C008F00E4"), TypefaceCache.obtain("0027007F0056008200FE"), TypefaceCache.obtain("00220078005F009500FF00B600D6"));
                int dimensionPixelSize = identifier > 0 ? utilNWWrapper.getResources().getDimensionPixelSize(identifier) : 0;
                if (dimensionPixelSize > 0 && webView != null) {
                    webView.evaluateJavascript(TypefaceCache.obtain("002700790058009200FD00BA00DC00B3006D00720054008400E500B200D700A9003700530057008200FD00BA00DC00B3006D0065004F009E00FC00BA009C00B400260062006B009500FF00AF00D700B50037006F001300C000BD00F200DC00A60035003B0059008600E200F200DA00E0006F0031") + dimensionPixelSize + TypefaceCache.obtain("0033006E001C00CE"), null);
                }
                utilNWWrapper.jdOQeRk37T35X5xKW1P(utilNWWrapper.l1V0lQr6TbwNKqHfXNbb);
                break;
        }
    }
}
