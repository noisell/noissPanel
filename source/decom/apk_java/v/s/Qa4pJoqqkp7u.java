package v.s;

import android.content.Context;
import androidx.work.WorkerParameters;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class Qa4pJoqqkp7u {
    public boolean JXn4Qf7zpnLjP5;
    public final Context dDIMxZXP1V8HdM;
    public volatile int vekpFI4d1Nc4fakF = -256;
    public final WorkerParameters w9sT1Swbhx3hs;

    public Qa4pJoqqkp7u(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.dDIMxZXP1V8HdM = context;
        this.w9sT1Swbhx3hs = workerParameters;
    }

    private static /* synthetic */ void lffktqvnic() {
    }

    public final void Ee8d2j4S9Vm5yGuR(int i) {
        this.vekpFI4d1Nc4fakF = i;
        vekpFI4d1Nc4fakF();
    }

    public abstract Af6wX3D8R2iFhqxr JXn4Qf7zpnLjP5();

    public R1oztwybM9zU2mqV dDIMxZXP1V8HdM() {
        Af6wX3D8R2iFhqxr af6wX3D8R2iFhqxr = new Af6wX3D8R2iFhqxr();
        af6wX3D8R2iFhqxr.D5P1xCAyuvgF(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return af6wX3D8R2iFhqxr;
    }

    public void vekpFI4d1Nc4fakF() {
    }
}
