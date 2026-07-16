package v.s;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.ComponentActivity;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class WhSJ01fPTInt0NpjnUKC extends Fragment {
    public static final /* synthetic */ int dDIMxZXP1V8HdM = 0;

    /* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
    public static final class dDIMxZXP1V8HdM implements Application.ActivityLifecycleCallbacks {
        public static final Bl2aocmEtB2b Companion = new Bl2aocmEtB2b();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new dDIMxZXP1V8HdM());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            int i = WhSJ01fPTInt0NpjnUKC.dDIMxZXP1V8HdM;
            ZnTULNYfGXTHFFxgMdC.dDIMxZXP1V8HdM(activity, Jf9nGec8iqajtj.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            int i = WhSJ01fPTInt0NpjnUKC.dDIMxZXP1V8HdM;
            ZnTULNYfGXTHFFxgMdC.dDIMxZXP1V8HdM(activity, Jf9nGec8iqajtj.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            int i = WhSJ01fPTInt0NpjnUKC.dDIMxZXP1V8HdM;
            ZnTULNYfGXTHFFxgMdC.dDIMxZXP1V8HdM(activity, Jf9nGec8iqajtj.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            int i = WhSJ01fPTInt0NpjnUKC.dDIMxZXP1V8HdM;
            ZnTULNYfGXTHFFxgMdC.dDIMxZXP1V8HdM(activity, Jf9nGec8iqajtj.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            int i = WhSJ01fPTInt0NpjnUKC.dDIMxZXP1V8HdM;
            ZnTULNYfGXTHFFxgMdC.dDIMxZXP1V8HdM(activity, Jf9nGec8iqajtj.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            int i = WhSJ01fPTInt0NpjnUKC.dDIMxZXP1V8HdM;
            ZnTULNYfGXTHFFxgMdC.dDIMxZXP1V8HdM(activity, Jf9nGec8iqajtj.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    public static final void w9sT1Swbhx3hs(ComponentActivity componentActivity) {
        if (Build.VERSION.SDK_INT >= 29) {
            dDIMxZXP1V8HdM.Companion.getClass();
            componentActivity.registerActivityLifecycleCallbacks(new dDIMxZXP1V8HdM());
        }
        FragmentManager fragmentManager = componentActivity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new WhSJ01fPTInt0NpjnUKC(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public final void dDIMxZXP1V8HdM(Jf9nGec8iqajtj jf9nGec8iqajtj) {
        if (Build.VERSION.SDK_INT < 29) {
            ZnTULNYfGXTHFFxgMdC.dDIMxZXP1V8HdM(getActivity(), jf9nGec8iqajtj);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        dDIMxZXP1V8HdM(Jf9nGec8iqajtj.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        dDIMxZXP1V8HdM(Jf9nGec8iqajtj.ON_DESTROY);
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        dDIMxZXP1V8HdM(Jf9nGec8iqajtj.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        dDIMxZXP1V8HdM(Jf9nGec8iqajtj.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        dDIMxZXP1V8HdM(Jf9nGec8iqajtj.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        dDIMxZXP1V8HdM(Jf9nGec8iqajtj.ON_STOP);
    }
}
