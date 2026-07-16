package v.s;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final /* synthetic */ class ALblcarwcMqLybfR5 implements Runnable {
    public final /* synthetic */ Runnable Ee8d2j4S9Vm5yGuR;
    public final /* synthetic */ int JXn4Qf7zpnLjP5;
    public final /* synthetic */ oO26y14q3Pwf vekpFI4d1Nc4fakF;
    public final /* synthetic */ LutdQZ2I9fVx w9sT1Swbhx3hs;

    public /* synthetic */ ALblcarwcMqLybfR5(LutdQZ2I9fVx lutdQZ2I9fVx, oO26y14q3Pwf oo26y14q3pwf, int i, Runnable runnable) {
        this.w9sT1Swbhx3hs = lutdQZ2I9fVx;
        this.vekpFI4d1Nc4fakF = oo26y14q3pwf;
        this.JXn4Qf7zpnLjP5 = i;
        this.Ee8d2j4S9Vm5yGuR = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final oO26y14q3Pwf oo26y14q3pwf = this.vekpFI4d1Nc4fakF;
        final int i = this.JXn4Qf7zpnLjP5;
        Runnable runnable = this.Ee8d2j4S9Vm5yGuR;
        final LutdQZ2I9fVx lutdQZ2I9fVx = this.w9sT1Swbhx3hs;
        WwqoyKhrbNp5qcng0CM wwqoyKhrbNp5qcng0CM = lutdQZ2I9fVx.xDyLpEZyrcKVe0;
        try {
            qAHCZrfOx8WOS qahczrfox8wos = lutdQZ2I9fVx.vekpFI4d1Nc4fakF;
            Objects.requireNonNull(qahczrfox8wos);
            ((c0GsmbUiugE231HPbX) wwqoyKhrbNp5qcng0CM).DVTNwpDEVsUKuznof(new rA0nQJPukyMi(6, qahczrfox8wos));
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) lutdQZ2I9fVx.dDIMxZXP1V8HdM.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                ((c0GsmbUiugE231HPbX) wwqoyKhrbNp5qcng0CM).DVTNwpDEVsUKuznof(new z3H4CF5ES1APfy6l() { // from class: v.s.qti77Rl7GAa6tKUhuxAc
                    @Override // v.s.z3H4CF5ES1APfy6l
                    public final Object JXn4Qf7zpnLjP5() {
                        lutdQZ2I9fVx.JXn4Qf7zpnLjP5.Ee8d2j4S9Vm5yGuR(oo26y14q3pwf, i + 1, false);
                        return null;
                    }
                });
            } else {
                lutdQZ2I9fVx.dDIMxZXP1V8HdM(oo26y14q3pwf, i);
            }
        } catch (nChsZFUyUkSpmR unused) {
            lutdQZ2I9fVx.JXn4Qf7zpnLjP5.Ee8d2j4S9Vm5yGuR(oo26y14q3pwf, i + 1, false);
        } finally {
            runnable.run();
        }
    }
}
