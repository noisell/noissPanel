package v.s;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class j378CNXHLyDTS1wSJ {
    public static volatile XoBekkiVsT5HH4S7VYDn Ee8d2j4S9Vm5yGuR;
    public final LutdQZ2I9fVx JXn4Qf7zpnLjP5;
    public final bYZKmsM130y5GVhnn dDIMxZXP1V8HdM;
    public final bepyb17lqmd1a4tQ vekpFI4d1Nc4fakF;
    public final bYZKmsM130y5GVhnn w9sT1Swbhx3hs;

    public j378CNXHLyDTS1wSJ(bYZKmsM130y5GVhnn byzkmsm130y5gvhnn, bYZKmsM130y5GVhnn byzkmsm130y5gvhnn2, bepyb17lqmd1a4tQ bepyb17lqmd1a4tq, LutdQZ2I9fVx lutdQZ2I9fVx, fUH025aw0Rgl fuh025aw0rgl) {
        this.dDIMxZXP1V8HdM = byzkmsm130y5gvhnn;
        this.w9sT1Swbhx3hs = byzkmsm130y5gvhnn2;
        this.vekpFI4d1Nc4fakF = bepyb17lqmd1a4tq;
        this.JXn4Qf7zpnLjP5 = lutdQZ2I9fVx;
        ((Executor) fuh025aw0rgl.dDIMxZXP1V8HdM).execute(new hzCVl0f866ksvpzUUql(19, fuh025aw0rgl));
    }

    public static j378CNXHLyDTS1wSJ dDIMxZXP1V8HdM() {
        XoBekkiVsT5HH4S7VYDn xoBekkiVsT5HH4S7VYDn = Ee8d2j4S9Vm5yGuR;
        if (xoBekkiVsT5HH4S7VYDn != null) {
            return (j378CNXHLyDTS1wSJ) xoBekkiVsT5HH4S7VYDn.ibVTtJUNfrGYbW.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static /* synthetic */ void pszxkvk() {
    }

    public static void w9sT1Swbhx3hs(Context context) {
        if (Ee8d2j4S9Vm5yGuR == null) {
            synchronized (j378CNXHLyDTS1wSJ.class) {
                try {
                    if (Ee8d2j4S9Vm5yGuR == null) {
                        rJtRT3pOA9KOQCsVr3 rjtrt3poa9koqcsvr3 = new rJtRT3pOA9KOQCsVr3();
                        context.getClass();
                        rjtrt3poa9koqcsvr3.dDIMxZXP1V8HdM = context;
                        Ee8d2j4S9Vm5yGuR = rjtrt3poa9koqcsvr3.dDIMxZXP1V8HdM();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
