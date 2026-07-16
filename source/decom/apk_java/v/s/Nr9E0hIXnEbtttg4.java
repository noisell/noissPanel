package v.s;

import android.content.Context;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class Nr9E0hIXnEbtttg4 implements Runnable {
    public static final /* synthetic */ int b1EoSIRjJHO5 = 0;
    public final Qa4pJoqqkp7u Ee8d2j4S9Vm5yGuR;
    public final sFdNPiaH9eT4T JXn4Qf7zpnLjP5;
    public final fUH025aw0Rgl ibVTtJUNfrGYbW;
    public final Context vekpFI4d1Nc4fakF;
    public final Af6wX3D8R2iFhqxr w9sT1Swbhx3hs = new Af6wX3D8R2iFhqxr();
    public final xdpm5SYr3bAV0rTS6 xDyLpEZyrcKVe0;

    static {
        fEyMFFyOOvHURJ7To6L.wotphlvK9sPbXJ("WorkForegroundRunnable");
    }

    public Nr9E0hIXnEbtttg4(Context context, sFdNPiaH9eT4T sfdnpiah9et4t, Qa4pJoqqkp7u qa4pJoqqkp7u, xdpm5SYr3bAV0rTS6 xdpm5syr3bav0rts6, fUH025aw0Rgl fuh025aw0rgl) {
        this.vekpFI4d1Nc4fakF = context;
        this.JXn4Qf7zpnLjP5 = sfdnpiah9et4t;
        this.Ee8d2j4S9Vm5yGuR = qa4pJoqqkp7u;
        this.xDyLpEZyrcKVe0 = xdpm5syr3bav0rts6;
        this.ibVTtJUNfrGYbW = fuh025aw0rgl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.JXn4Qf7zpnLjP5.J0zjQ7CAgohuxU20eCW6 || Build.VERSION.SDK_INT >= 31) {
            this.w9sT1Swbhx3hs.pyu8ovAipBTLYAiKab(null);
            return;
        }
        Af6wX3D8R2iFhqxr af6wX3D8R2iFhqxr = new Af6wX3D8R2iFhqxr();
        fUH025aw0Rgl fuh025aw0rgl = this.ibVTtJUNfrGYbW;
        ((Qxq4OCIomL3rf7RSR) fuh025aw0rgl.JXn4Qf7zpnLjP5).execute(new A68NpXPqwTFos99nt(this, 25, af6wX3D8R2iFhqxr));
        af6wX3D8R2iFhqxr.dDIMxZXP1V8HdM(new UubaJZRp66jTeLre(this, 8, af6wX3D8R2iFhqxr), (Qxq4OCIomL3rf7RSR) fuh025aw0rgl.JXn4Qf7zpnLjP5);
    }
}
