package v.s;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.activity.ComponentActivity;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class WKsCRCZJmHvmMVmS26jN implements Executor, ViewTreeObserver.OnDrawListener, Runnable {
    public final /* synthetic */ ComponentActivity Ee8d2j4S9Vm5yGuR;
    public Runnable vekpFI4d1Nc4fakF;
    public final long w9sT1Swbhx3hs = SystemClock.uptimeMillis() + 10000;
    public boolean JXn4Qf7zpnLjP5 = false;

    public WKsCRCZJmHvmMVmS26jN(ComponentActivity componentActivity) {
        this.Ee8d2j4S9Vm5yGuR = componentActivity;
    }

    private static /* synthetic */ void hjlknpd() {
    }

    public final void dDIMxZXP1V8HdM(View view) {
        if (this.JXn4Qf7zpnLjP5) {
            return;
        }
        this.JXn4Qf7zpnLjP5 = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.vekpFI4d1Nc4fakF = runnable;
        View decorView = this.Ee8d2j4S9Vm5yGuR.getWindow().getDecorView();
        if (!this.JXn4Qf7zpnLjP5) {
            decorView.postOnAnimation(new hzCVl0f866ksvpzUUql(5, this));
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.vekpFI4d1Nc4fakF;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.w9sT1Swbhx3hs) {
                this.JXn4Qf7zpnLjP5 = false;
                this.Ee8d2j4S9Vm5yGuR.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.vekpFI4d1Nc4fakF = null;
        RpiSWFqg6frykGldgWGU rpiSWFqg6frykGldgWGU = this.Ee8d2j4S9Vm5yGuR.pyu8ovAipBTLYAiKab;
        synchronized (rpiSWFqg6frykGldgWGU.w9sT1Swbhx3hs) {
            z = rpiSWFqg6frykGldgWGU.dDIMxZXP1V8HdM;
        }
        if (z) {
            this.JXn4Qf7zpnLjP5 = false;
            this.Ee8d2j4S9Vm5yGuR.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.Ee8d2j4S9Vm5yGuR.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
