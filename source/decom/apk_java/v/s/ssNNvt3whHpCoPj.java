package v.s;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class ssNNvt3whHpCoPj {
    private static volatile Choreographer choreographer;

    static {
        Object vSZeS5mia3yEXbAe;
        try {
            vSZeS5mia3yEXbAe = new zcffvBooRp7uR1q(dDIMxZXP1V8HdM(Looper.getMainLooper()), false);
        } catch (Throwable th) {
            vSZeS5mia3yEXbAe = new VSZeS5mia3yEXbAe(th);
        }
        if (vSZeS5mia3yEXbAe instanceof VSZeS5mia3yEXbAe) {
            vSZeS5mia3yEXbAe = null;
        }
    }

    public static final Handler dDIMxZXP1V8HdM(Looper looper) {
        if (Build.VERSION.SDK_INT >= (-27) + 55) {
            return (Handler) Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
