package v.s;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class BrTrnVPOcXmQM extends ThreadLocal {
    public final /* synthetic */ int dDIMxZXP1V8HdM;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.dDIMxZXP1V8HdM) {
            case 0:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(yrMnf4fyLGfIJbMg8IbG.JXn4Qf7zpnLjP5);
                return simpleDateFormat;
            default:
                return new Random();
        }
    }
}
