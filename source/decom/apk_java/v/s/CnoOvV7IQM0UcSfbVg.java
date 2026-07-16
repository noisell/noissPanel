package v.s;

import android.content.Context;
import androidx.work.WorkerParameters;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class CnoOvV7IQM0UcSfbVg {
    static {
        fEyMFFyOOvHURJ7To6L.wotphlvK9sPbXJ("WorkerFactory");
    }

    public static Qa4pJoqqkp7u dDIMxZXP1V8HdM(Context context, String str, WorkerParameters workerParameters) {
        Class clsAsSubclass;
        Qa4pJoqqkp7u qa4pJoqqkp7u = null;
        try {
            clsAsSubclass = Class.forName(str).asSubclass(Qa4pJoqqkp7u.class);
        } catch (Throwable unused) {
            fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
            clsAsSubclass = null;
        }
        if (clsAsSubclass != null) {
            try {
                qa4pJoqqkp7u = (Qa4pJoqqkp7u) clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            } catch (Throwable unused2) {
                fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
            }
        }
        if (qa4pJoqqkp7u == null || !qa4pJoqqkp7u.JXn4Qf7zpnLjP5) {
            return qa4pJoqqkp7u;
        }
        throw new IllegalStateException("WorkerFactory (" + CnoOvV7IQM0UcSfbVg.class.getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
