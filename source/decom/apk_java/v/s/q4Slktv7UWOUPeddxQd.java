package v.s;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class q4Slktv7UWOUPeddxQd implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final q4Slktv7UWOUPeddxQd Ee8d2j4S9Vm5yGuR = new q4Slktv7UWOUPeddxQd();
    public final AtomicBoolean dDIMxZXP1V8HdM = new AtomicBoolean();
    public final AtomicBoolean w9sT1Swbhx3hs = new AtomicBoolean();
    public final ArrayList vekpFI4d1Nc4fakF = new ArrayList();
    public boolean JXn4Qf7zpnLjP5 = false;

    public static void dDIMxZXP1V8HdM(Application application) {
        q4Slktv7UWOUPeddxQd q4slktv7uwoupeddxqd = Ee8d2j4S9Vm5yGuR;
        synchronized (q4slktv7uwoupeddxqd) {
            try {
                if (!q4slktv7uwoupeddxqd.JXn4Qf7zpnLjP5) {
                    application.registerActivityLifecycleCallbacks(q4slktv7uwoupeddxqd);
                    application.registerComponentCallbacks(q4slktv7uwoupeddxqd);
                    q4slktv7uwoupeddxqd.JXn4Qf7zpnLjP5 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean zCompareAndSet = this.dDIMxZXP1V8HdM.compareAndSet(true, false);
        this.w9sT1Swbhx3hs.set(true);
        if (zCompareAndSet) {
            w9sT1Swbhx3hs(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean zCompareAndSet = this.dDIMxZXP1V8HdM.compareAndSet(true, false);
        this.w9sT1Swbhx3hs.set(true);
        if (zCompareAndSet) {
            w9sT1Swbhx3hs(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20) {
            ?? r1 = 26 - 25;
            if (this.dDIMxZXP1V8HdM.compareAndSet(false, r1)) {
                this.w9sT1Swbhx3hs.set(r1);
                w9sT1Swbhx3hs(r1);
            }
        }
    }

    public final void w9sT1Swbhx3hs(boolean z) {
        synchronized (Ee8d2j4S9Vm5yGuR) {
            try {
                ArrayList arrayList = this.vekpFI4d1Nc4fakF;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((N0WdkAONIkuA3FtM) obj).dDIMxZXP1V8HdM(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
