package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import v.s.Af6wX3D8R2iFhqxr;
import v.s.PmgYwiy2tMPByUG991;
import v.s.Qa4pJoqqkp7u;
import v.s.X4MUXskPk6V6I;
import v.s.d7yjIEB02ZavJfb7Dt;
import v.s.fEyMFFyOOvHURJ7To6L;
import v.s.hzCVl0f866ksvpzUUql;
import v.s.sFdNPiaH9eT4T;
import v.s.vLtzHklHcOmK17;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class ConstraintTrackingWorker extends Qa4pJoqqkp7u implements d7yjIEB02ZavJfb7Dt {
    public final WorkerParameters Ee8d2j4S9Vm5yGuR;
    public final Af6wX3D8R2iFhqxr b1EoSIRjJHO5;
    public volatile boolean ibVTtJUNfrGYbW;
    public Qa4pJoqqkp7u pyu8ovAipBTLYAiKab;
    public final Object xDyLpEZyrcKVe0;

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.Ee8d2j4S9Vm5yGuR = workerParameters;
        this.xDyLpEZyrcKVe0 = new Object();
        this.b1EoSIRjJHO5 = new Af6wX3D8R2iFhqxr();
    }

    @Override // v.s.Qa4pJoqqkp7u
    public final Af6wX3D8R2iFhqxr JXn4Qf7zpnLjP5() {
        this.w9sT1Swbhx3hs.JXn4Qf7zpnLjP5.execute(new hzCVl0f866ksvpzUUql(6, this));
        return this.b1EoSIRjJHO5;
    }

    @Override // v.s.Qa4pJoqqkp7u
    public final void vekpFI4d1Nc4fakF() {
        Qa4pJoqqkp7u qa4pJoqqkp7u = this.pyu8ovAipBTLYAiKab;
        if (qa4pJoqqkp7u == null || qa4pJoqqkp7u.vekpFI4d1Nc4fakF != -256) {
            return;
        }
        qa4pJoqqkp7u.Ee8d2j4S9Vm5yGuR(Build.VERSION.SDK_INT >= 31 ? this.vekpFI4d1Nc4fakF : 0);
    }

    @Override // v.s.d7yjIEB02ZavJfb7Dt
    public final void w9sT1Swbhx3hs(sFdNPiaH9eT4T sfdnpiah9et4t, vLtzHklHcOmK17 vltzhklhcomk17) {
        fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
        int i = X4MUXskPk6V6I.dDIMxZXP1V8HdM;
        sfdnpiah9et4t.toString();
        feymffyoovhurj7to6lPyu8ovAipBTLYAiKab.getClass();
        if (vltzhklhcomk17 instanceof PmgYwiy2tMPByUG991) {
            synchronized (this.xDyLpEZyrcKVe0) {
                this.ibVTtJUNfrGYbW = true;
            }
        }
    }
}
