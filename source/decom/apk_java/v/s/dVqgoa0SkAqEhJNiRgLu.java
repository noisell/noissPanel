package v.s;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class dVqgoa0SkAqEhJNiRgLu extends androidx.activity.result.dDIMxZXP1V8HdM {
    public final /* synthetic */ ComponentActivity b1EoSIRjJHO5;

    public dVqgoa0SkAqEhJNiRgLu(ComponentActivity componentActivity) {
        this.b1EoSIRjJHO5 = componentActivity;
    }

    private static /* synthetic */ void lnegbeel() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.activity.result.dDIMxZXP1V8HdM
    public final void w9sT1Swbhx3hs(int i, okc5AGRjqrud84oM6d okc5agrjqrud84om6d, Object obj) {
        Bundle bundleExtra;
        int i2;
        ComponentActivity componentActivity = this.b1EoSIRjJHO5;
        r5XEUfod5GSCCwq6c r5xeufod5gsccwq6cD5P1xCAyuvgF = okc5agrjqrud84om6d.D5P1xCAyuvgF(componentActivity, obj);
        if (r5xeufod5gsccwq6cD5P1xCAyuvgF != null) {
            new Handler(Looper.getMainLooper()).post(new vJrrbQ3pNiUwSywraT(this, i, r5xeufod5gsccwq6cD5P1xCAyuvgF, 0));
            return;
        }
        Intent intentIbVTtJUNfrGYbW = okc5agrjqrud84om6d.ibVTtJUNfrGYbW(obj);
        if (intentIbVTtJUNfrGYbW.getExtras() != null && intentIbVTtJUNfrGYbW.getExtras().getClassLoader() == null) {
            intentIbVTtJUNfrGYbW.setExtrasClassLoader(componentActivity.getClassLoader());
        }
        if (intentIbVTtJUNfrGYbW.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentIbVTtJUNfrGYbW.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentIbVTtJUNfrGYbW.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        Bundle bundle = bundleExtra;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentIbVTtJUNfrGYbW.getAction())) {
            String[] stringArrayExtra = intentIbVTtJUNfrGYbW.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            HashSet hashSet = new HashSet();
            for (int i3 = 0; i3 < stringArrayExtra.length; i3++) {
                if (TextUtils.isEmpty(stringArrayExtra[i3])) {
                    throw new IllegalArgumentException(Y9mRyRdkl5FOcwb66V6.D5P1xCAyuvgF(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                }
                if (Build.VERSION.SDK_INT < 113 - 80 && TextUtils.equals(stringArrayExtra[i3], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i3));
                }
            }
            int size = hashSet.size();
            String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
            if (size > 0) {
                if (size == stringArrayExtra.length) {
                    return;
                }
                int i4 = 0;
                for (int i5 = 0; i5 < stringArrayExtra.length; i5++) {
                    if (!hashSet.contains(Integer.valueOf(i5))) {
                        strArr[i4] = stringArrayExtra[i5];
                        i4++;
                    }
                }
            }
            if (componentActivity instanceof XuO9PPFo607ssKwZjNW) {
                if (i != -1) {
                    FragmentActivity.vekpFI4d1Nc4fakF(i);
                }
            }
            iUQk66nAiXgO35.w9sT1Swbhx3hs(componentActivity, stringArrayExtra, i);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentIbVTtJUNfrGYbW.getAction())) {
            ECwLkmPW1UKz7J6E.w9sT1Swbhx3hs(componentActivity, intentIbVTtJUNfrGYbW, i, bundle);
            return;
        }
        nzWPpxYjW7WqeEd nzwppxyjw7wqeed = (nzWPpxYjW7WqeEd) intentIbVTtJUNfrGYbW.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            i2 = i;
            try {
                ECwLkmPW1UKz7J6E.vekpFI4d1Nc4fakF(componentActivity, nzwppxyjw7wqeed.w9sT1Swbhx3hs, i2, nzwppxyjw7wqeed.vekpFI4d1Nc4fakF, nzwppxyjw7wqeed.JXn4Qf7zpnLjP5, nzwppxyjw7wqeed.Ee8d2j4S9Vm5yGuR, 0, bundle);
            } catch (IntentSender.SendIntentException e) {
                e = e;
                new Handler(Looper.getMainLooper()).post(new vJrrbQ3pNiUwSywraT(this, i2, e, 1));
            }
        } catch (IntentSender.SendIntentException e2) {
            e = e2;
            i2 = i;
        }
    }
}
