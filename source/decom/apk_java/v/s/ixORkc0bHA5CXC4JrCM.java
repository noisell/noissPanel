package v.s;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final /* synthetic */ class ixORkc0bHA5CXC4JrCM {
    public final /* synthetic */ ComponentActivity dDIMxZXP1V8HdM;

    public /* synthetic */ ixORkc0bHA5CXC4JrCM(ComponentActivity componentActivity) {
        this.dDIMxZXP1V8HdM = componentActivity;
    }

    public final void dDIMxZXP1V8HdM() {
        ComponentActivity componentActivity = this.dDIMxZXP1V8HdM;
        Bundle bundleDDIMxZXP1V8HdM = ((Nb7UID66gn18B) componentActivity.Ee8d2j4S9Vm5yGuR.vekpFI4d1Nc4fakF).dDIMxZXP1V8HdM("android:support:activity-result");
        if (bundleDDIMxZXP1V8HdM != null) {
            dVqgoa0SkAqEhJNiRgLu dvqgoa0skaqehjnirglu = componentActivity.hjneShqpF9Tis4;
            HashMap map = dvqgoa0skaqehjnirglu.w9sT1Swbhx3hs;
            HashMap map2 = dvqgoa0skaqehjnirglu.dDIMxZXP1V8HdM;
            Bundle bundle = dvqgoa0skaqehjnirglu.ibVTtJUNfrGYbW;
            ArrayList<Integer> integerArrayList = bundleDDIMxZXP1V8HdM.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleDDIMxZXP1V8HdM.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            dvqgoa0skaqehjnirglu.JXn4Qf7zpnLjP5 = bundleDDIMxZXP1V8HdM.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            bundle.putAll(bundleDDIMxZXP1V8HdM.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
            for (int i = 0; i < stringArrayList.size(); i++) {
                String str = stringArrayList.get(i);
                if (map.containsKey(str)) {
                    Integer num = (Integer) map.remove(str);
                    if (!bundle.containsKey(str)) {
                        map2.remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i);
                num2.intValue();
                String str2 = stringArrayList.get(i);
                map2.put(num2, str2);
                dvqgoa0skaqehjnirglu.w9sT1Swbhx3hs.put(str2, num2);
            }
        }
    }
}
