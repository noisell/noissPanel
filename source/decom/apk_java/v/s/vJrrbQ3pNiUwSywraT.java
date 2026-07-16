package v.s;

import android.app.Notification;
import android.content.Intent;
import android.content.IntentSender;
import androidx.work.impl.foreground.SystemForegroundService;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class vJrrbQ3pNiUwSywraT implements Runnable {
    public final Object Ee8d2j4S9Vm5yGuR;
    public final Object JXn4Qf7zpnLjP5;
    public final int vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs;

    public /* synthetic */ vJrrbQ3pNiUwSywraT(Object obj, int i, Object obj2, int i2) {
        this.w9sT1Swbhx3hs = i2;
        this.JXn4Qf7zpnLjP5 = obj;
        this.vekpFI4d1Nc4fakF = i;
        this.Ee8d2j4S9Vm5yGuR = obj2;
    }

    private static /* synthetic */ void xvwgroa() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                dVqgoa0SkAqEhJNiRgLu dvqgoa0skaqehjnirglu = (dVqgoa0SkAqEhJNiRgLu) this.JXn4Qf7zpnLjP5;
                Serializable serializable = (Serializable) ((r5XEUfod5GSCCwq6c) this.Ee8d2j4S9Vm5yGuR).vekpFI4d1Nc4fakF;
                String str = (String) dvqgoa0skaqehjnirglu.dDIMxZXP1V8HdM.get(Integer.valueOf(this.vekpFI4d1Nc4fakF));
                if (str != null) {
                    qfTrc75xwRVMl85vh qftrc75xwrvml85vh = (qfTrc75xwRVMl85vh) dvqgoa0skaqehjnirglu.Ee8d2j4S9Vm5yGuR.get(str);
                    if (qftrc75xwrvml85vh == null) {
                        dvqgoa0skaqehjnirglu.ibVTtJUNfrGYbW.remove(str);
                        dvqgoa0skaqehjnirglu.xDyLpEZyrcKVe0.put(str, serializable);
                    } else {
                        A1BaTVAMeIXMnh a1BaTVAMeIXMnh = qftrc75xwrvml85vh.dDIMxZXP1V8HdM;
                        if (dvqgoa0skaqehjnirglu.JXn4Qf7zpnLjP5.remove(str)) {
                            a1BaTVAMeIXMnh.dDIMxZXP1V8HdM(serializable);
                        }
                    }
                    break;
                }
                break;
            case 1:
                ((dVqgoa0SkAqEhJNiRgLu) this.JXn4Qf7zpnLjP5).dDIMxZXP1V8HdM(this.vekpFI4d1Nc4fakF, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.Ee8d2j4S9Vm5yGuR));
                break;
            case 2:
                ((YBgPeyiVTstFMkDCziC) this.Ee8d2j4S9Vm5yGuR).dDIMxZXP1V8HdM((Intent) this.JXn4Qf7zpnLjP5, this.vekpFI4d1Nc4fakF);
                break;
            default:
                ((SystemForegroundService) this.JXn4Qf7zpnLjP5).Ee8d2j4S9Vm5yGuR.notify(this.vekpFI4d1Nc4fakF, (Notification) this.Ee8d2j4S9Vm5yGuR);
                break;
        }
    }

    public vJrrbQ3pNiUwSywraT(int i, Intent intent, YBgPeyiVTstFMkDCziC yBgPeyiVTstFMkDCziC) {
        this.w9sT1Swbhx3hs = 2;
        this.Ee8d2j4S9Vm5yGuR = yBgPeyiVTstFMkDCziC;
        this.JXn4Qf7zpnLjP5 = intent;
        this.vekpFI4d1Nc4fakF = i;
    }
}
