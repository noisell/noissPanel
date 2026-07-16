package v.s;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class bVJI6LA77fw3pJCMf extends y6jRGLEWNMir {
    public final ArrayList D5P1xCAyuvgF = new ArrayList();
    public final bIQtXpTQsEoGIf25Z Ee8d2j4S9Vm5yGuR;
    public final List b1EoSIRjJHO5;
    public icsq4nzWNlK1KIU2Hp gmNWMfvn6zlEj;
    public boolean hjneShqpF9Tis4;
    public final int ibVTtJUNfrGYbW;
    public final ArrayList pyu8ovAipBTLYAiKab;
    public final String xDyLpEZyrcKVe0;

    static {
        fEyMFFyOOvHURJ7To6L.wotphlvK9sPbXJ("WorkContinuationImpl");
    }

    public bVJI6LA77fw3pJCMf(bIQtXpTQsEoGIf25Z biqtxptqseogif25z, String str, int i, List list, int i2) {
        this.Ee8d2j4S9Vm5yGuR = biqtxptqseogif25z;
        this.xDyLpEZyrcKVe0 = str;
        this.ibVTtJUNfrGYbW = i;
        this.b1EoSIRjJHO5 = list;
        this.pyu8ovAipBTLYAiKab = new ArrayList(list.size());
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (i == 1 && ((GIUFlVOyGkYog) list.get(i3)).w9sT1Swbhx3hs.DVTNwpDEVsUKuznof != Long.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String string = ((GIUFlVOyGkYog) list.get(i3)).dDIMxZXP1V8HdM.toString();
            this.pyu8ovAipBTLYAiKab.add(string);
            this.D5P1xCAyuvgF.add(string);
        }
    }

    public static HashSet EWUjsTERgdPbSw3NNlN(bVJI6LA77fw3pJCMf bvji6la77fw3pjcmf) {
        HashSet hashSet = new HashSet();
        bvji6la77fw3pjcmf.getClass();
        return hashSet;
    }

    private static /* synthetic */ void smzhhfg() {
    }

    public final icsq4nzWNlK1KIU2Hp dTS0S7eC32ubQH54j36() {
        if (this.hjneShqpF9Tis4) {
            fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
            TextUtils.join(", ", this.pyu8ovAipBTLYAiKab);
            feymffyoovhurj7to6lPyu8ovAipBTLYAiKab.getClass();
        } else {
            icsq4nzWNlK1KIU2Hp icsq4nzwnlk1kiu2hp = new icsq4nzWNlK1KIU2Hp(1);
            this.Ee8d2j4S9Vm5yGuR.pyu8ovAipBTLYAiKab.w9sT1Swbhx3hs(new q0qRAVRPfyJWkUkZ2(this, icsq4nzwnlk1kiu2hp));
            this.gmNWMfvn6zlEj = icsq4nzwnlk1kiu2hp;
        }
        return this.gmNWMfvn6zlEj;
    }
}
