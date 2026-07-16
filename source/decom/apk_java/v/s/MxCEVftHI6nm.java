package v.s;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import app.mobilex.plus.util.TypefaceCache;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class MxCEVftHI6nm extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ int dDIMxZXP1V8HdM;
    public final /* synthetic */ Object w9sT1Swbhx3hs;

    public /* synthetic */ MxCEVftHI6nm(int i, Object obj) {
        this.dDIMxZXP1V8HdM = i;
        this.w9sT1Swbhx3hs = obj;
    }

    private static /* synthetic */ void fnzownbvxm() {
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.dDIMxZXP1V8HdM) {
            case 0:
                iStgVlW5d7CQ5MhFi istgvlw5d7cq5mhfi = RWY6BVSB0XxPbw.d6c98qX7r0XzUZFibx;
                TypefaceCache.obtain("000D0073004F009000FF00AD00D900E700220060005A008E00FC00BE00D000AB0026003A001B008400FF00B100DC00A200200062005E008300AD");
                RWY6BVSB0XxPbw rWY6BVSB0XxPbw = (RWY6BVSB0XxPbw) this.w9sT1Swbhx3hs;
                if (!rWY6BVSB0XxPbw.xDyLpEZyrcKVe0 && rWY6BVSB0XxPbw.ibVTtJUNfrGYbW && rWY6BVSB0XxPbw.b1EoSIRjJHO5.length() > 0) {
                    ((RWY6BVSB0XxPbw) this.w9sT1Swbhx3hs).hjneShqpF9Tis4 = 0;
                    RWY6BVSB0XxPbw rWY6BVSB0XxPbw2 = (RWY6BVSB0XxPbw) this.w9sT1Swbhx3hs;
                    rWY6BVSB0XxPbw2.nQilHWaqS401ZtR.post(new uY2iPU7ne5s7Y5LeXnLI(rWY6BVSB0XxPbw2, 25));
                    break;
                }
                break;
            default:
                super.onAvailable(network);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.dDIMxZXP1V8HdM) {
            case 1:
                fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
                int i = PoVDiNYMKgNfF.dDIMxZXP1V8HdM;
                networkCapabilities.toString();
                feymffyoovhurj7to6lPyu8ovAipBTLYAiKab.getClass();
                GHV5q6ADozYUUx gHV5q6ADozYUUx = (GHV5q6ADozYUUx) this.w9sT1Swbhx3hs;
                gHV5q6ADozYUUx.w9sT1Swbhx3hs(PoVDiNYMKgNfF.dDIMxZXP1V8HdM(gHV5q6ADozYUUx.xDyLpEZyrcKVe0));
                break;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        int i = this.dDIMxZXP1V8HdM;
        Object obj = this.w9sT1Swbhx3hs;
        switch (i) {
            case 0:
                iStgVlW5d7CQ5MhFi istgvlw5d7cq5mhfi = RWY6BVSB0XxPbw.d6c98qX7r0XzUZFibx;
                TypefaceCache.obtain("000D0073004F009000FF00AD00D900E7002F00790048009300BC00FF00D100A8002D0078005E008400E400BA00D600FA");
                RWY6BVSB0XxPbw rWY6BVSB0XxPbw = (RWY6BVSB0XxPbw) obj;
                if (rWY6BVSB0XxPbw.xDyLpEZyrcKVe0) {
                    rWY6BVSB0XxPbw.nQilHWaqS401ZtR.post(new uY2iPU7ne5s7Y5LeXnLI(rWY6BVSB0XxPbw, 24));
                }
                break;
            default:
                fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
                int i2 = PoVDiNYMKgNfF.dDIMxZXP1V8HdM;
                feymffyoovhurj7to6lPyu8ovAipBTLYAiKab.getClass();
                GHV5q6ADozYUUx gHV5q6ADozYUUx = (GHV5q6ADozYUUx) obj;
                gHV5q6ADozYUUx.w9sT1Swbhx3hs(PoVDiNYMKgNfF.dDIMxZXP1V8HdM(gHV5q6ADozYUUx.xDyLpEZyrcKVe0));
                break;
        }
    }
}
