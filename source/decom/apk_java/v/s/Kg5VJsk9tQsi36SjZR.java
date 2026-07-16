package v.s;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class Kg5VJsk9tQsi36SjZR implements Application.ActivityLifecycleCallbacks {
    public final Set dDIMxZXP1V8HdM = Collections.newSetFromMap(new WeakHashMap());

    private static /* synthetic */ void wwyzco() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intent intent = activity.getIntent();
        if (intent == null || !this.dDIMxZXP1V8HdM.add(intent)) {
            return;
        }
        Bundle bundle2 = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                bundle2 = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException unused) {
        }
        if (bundle2 == null ? false : "1".equals(bundle2.getString("google.c.a.e"))) {
            if (bundle2 != null && "1".equals(bundle2.getString("google.c.a.tc"))) {
                dfwkxUDiclPw1BowH4 dfwkxudiclpw1bowh4W9sT1Swbhx3hs = dfwkxUDiclPw1BowH4.w9sT1Swbhx3hs();
                dfwkxudiclpw1bowh4W9sT1Swbhx3hs.dDIMxZXP1V8HdM();
                if (dfwkxudiclpw1bowh4W9sT1Swbhx3hs.JXn4Qf7zpnLjP5.dDIMxZXP1V8HdM(YIgR6F2ZXmLx2ul.class) != null) {
                    throw new ClassCastException();
                }
            }
            y6jRGLEWNMir.pyu8ovAipBTLYAiKab("_no", bundle2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (activity.isFinishing()) {
            this.dDIMxZXP1V8HdM.remove(activity.getIntent());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
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
}
