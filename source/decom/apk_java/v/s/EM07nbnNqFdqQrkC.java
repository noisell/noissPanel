package v.s;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class EM07nbnNqFdqQrkC implements d7yjIEB02ZavJfb7Dt, tnAmGCFqcZm9axi {
    public static final /* synthetic */ int D5P1xCAyuvgF = 0;
    public final LinkedHashMap Ee8d2j4S9Vm5yGuR;
    public ebR1taU40KcOGClk JXn4Qf7zpnLjP5;
    public final r5XEUfod5GSCCwq6c b1EoSIRjJHO5;
    public final bIQtXpTQsEoGIf25Z dDIMxZXP1V8HdM;
    public final HashMap ibVTtJUNfrGYbW;
    public SystemForegroundService pyu8ovAipBTLYAiKab;
    public final Object vekpFI4d1Nc4fakF = new Object();
    public final fUH025aw0Rgl w9sT1Swbhx3hs;
    public final HashMap xDyLpEZyrcKVe0;

    static {
        fEyMFFyOOvHURJ7To6L.wotphlvK9sPbXJ("SystemFgDispatcher");
    }

    public EM07nbnNqFdqQrkC(Context context) {
        bIQtXpTQsEoGIf25Z biqtxptqseogif25zL1V0lQr6TbwNKqHfXNbb = bIQtXpTQsEoGIf25Z.l1V0lQr6TbwNKqHfXNbb(context);
        this.dDIMxZXP1V8HdM = biqtxptqseogif25zL1V0lQr6TbwNKqHfXNbb;
        this.w9sT1Swbhx3hs = biqtxptqseogif25zL1V0lQr6TbwNKqHfXNbb.pyu8ovAipBTLYAiKab;
        this.JXn4Qf7zpnLjP5 = null;
        this.Ee8d2j4S9Vm5yGuR = new LinkedHashMap();
        this.ibVTtJUNfrGYbW = new HashMap();
        this.xDyLpEZyrcKVe0 = new HashMap();
        this.b1EoSIRjJHO5 = new r5XEUfod5GSCCwq6c(biqtxptqseogif25zL1V0lQr6TbwNKqHfXNbb.Qrz92kRPw4GcghAc);
        biqtxptqseogif25zL1V0lQr6TbwNKqHfXNbb.hjneShqpF9Tis4.dDIMxZXP1V8HdM(this);
    }

    private static /* synthetic */ void cvzpwj() {
    }

    public static Intent dDIMxZXP1V8HdM(Context context, ebR1taU40KcOGClk ebr1tau40kcogclk, BXrZf9mCiRhvBOt7P bXrZf9mCiRhvBOt7P) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", bXrZf9mCiRhvBOt7P.dDIMxZXP1V8HdM);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", bXrZf9mCiRhvBOt7P.w9sT1Swbhx3hs);
        intent.putExtra("KEY_NOTIFICATION", bXrZf9mCiRhvBOt7P.vekpFI4d1Nc4fakF);
        intent.putExtra("KEY_WORKSPEC_ID", ebr1tau40kcogclk.dDIMxZXP1V8HdM);
        intent.putExtra("KEY_GENERATION", ebr1tau40kcogclk.w9sT1Swbhx3hs);
        return intent;
    }

    public static Intent vekpFI4d1Nc4fakF(Context context, ebR1taU40KcOGClk ebr1tau40kcogclk, BXrZf9mCiRhvBOt7P bXrZf9mCiRhvBOt7P) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", ebr1tau40kcogclk.dDIMxZXP1V8HdM);
        intent.putExtra("KEY_GENERATION", ebr1tau40kcogclk.w9sT1Swbhx3hs);
        intent.putExtra("KEY_NOTIFICATION_ID", bXrZf9mCiRhvBOt7P.dDIMxZXP1V8HdM);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", bXrZf9mCiRhvBOt7P.w9sT1Swbhx3hs);
        intent.putExtra("KEY_NOTIFICATION", bXrZf9mCiRhvBOt7P.vekpFI4d1Nc4fakF);
        return intent;
    }

    public final void Ee8d2j4S9Vm5yGuR(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        ebR1taU40KcOGClk ebr1tau40kcogclk = new ebR1taU40KcOGClk(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
        if (notification == null || this.pyu8ovAipBTLYAiKab == null) {
            return;
        }
        BXrZf9mCiRhvBOt7P bXrZf9mCiRhvBOt7P = new BXrZf9mCiRhvBOt7P(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.Ee8d2j4S9Vm5yGuR;
        linkedHashMap.put(ebr1tau40kcogclk, bXrZf9mCiRhvBOt7P);
        if (this.JXn4Qf7zpnLjP5 == null) {
            this.JXn4Qf7zpnLjP5 = ebr1tau40kcogclk;
            SystemForegroundService systemForegroundService = this.pyu8ovAipBTLYAiKab;
            systemForegroundService.w9sT1Swbhx3hs.post(new HApDvSifKFkCstHF(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        SystemForegroundService systemForegroundService2 = this.pyu8ovAipBTLYAiKab;
        systemForegroundService2.w9sT1Swbhx3hs.post(new vJrrbQ3pNiUwSywraT(systemForegroundService2, intExtra, notification, 3));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i |= ((BXrZf9mCiRhvBOt7P) ((Map.Entry) it.next()).getValue()).w9sT1Swbhx3hs;
        }
        BXrZf9mCiRhvBOt7P bXrZf9mCiRhvBOt7P2 = (BXrZf9mCiRhvBOt7P) linkedHashMap.get(this.JXn4Qf7zpnLjP5);
        if (bXrZf9mCiRhvBOt7P2 != null) {
            SystemForegroundService systemForegroundService3 = this.pyu8ovAipBTLYAiKab;
            systemForegroundService3.w9sT1Swbhx3hs.post(new HApDvSifKFkCstHF(systemForegroundService3, bXrZf9mCiRhvBOt7P2.dDIMxZXP1V8HdM, bXrZf9mCiRhvBOt7P2.vekpFI4d1Nc4fakF, i));
        }
    }

    @Override // v.s.tnAmGCFqcZm9axi
    public final void JXn4Qf7zpnLjP5(ebR1taU40KcOGClk ebr1tau40kcogclk, boolean z) {
        Map.Entry entry;
        synchronized (this.vekpFI4d1Nc4fakF) {
            try {
                WGrwEyVqR28VYxamRhIg wGrwEyVqR28VYxamRhIg = ((sFdNPiaH9eT4T) this.xDyLpEZyrcKVe0.remove(ebr1tau40kcogclk)) != null ? (WGrwEyVqR28VYxamRhIg) this.ibVTtJUNfrGYbW.remove(ebr1tau40kcogclk) : null;
                if (wGrwEyVqR28VYxamRhIg != null) {
                    wGrwEyVqR28VYxamRhIg.vekpFI4d1Nc4fakF(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        BXrZf9mCiRhvBOt7P bXrZf9mCiRhvBOt7P = (BXrZf9mCiRhvBOt7P) this.Ee8d2j4S9Vm5yGuR.remove(ebr1tau40kcogclk);
        if (ebr1tau40kcogclk.equals(this.JXn4Qf7zpnLjP5)) {
            if (this.Ee8d2j4S9Vm5yGuR.size() > 0) {
                Iterator it = this.Ee8d2j4S9Vm5yGuR.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.JXn4Qf7zpnLjP5 = (ebR1taU40KcOGClk) entry.getKey();
                if (this.pyu8ovAipBTLYAiKab != null) {
                    BXrZf9mCiRhvBOt7P bXrZf9mCiRhvBOt7P2 = (BXrZf9mCiRhvBOt7P) entry.getValue();
                    SystemForegroundService systemForegroundService = this.pyu8ovAipBTLYAiKab;
                    systemForegroundService.w9sT1Swbhx3hs.post(new HApDvSifKFkCstHF(systemForegroundService, bXrZf9mCiRhvBOt7P2.dDIMxZXP1V8HdM, bXrZf9mCiRhvBOt7P2.vekpFI4d1Nc4fakF, bXrZf9mCiRhvBOt7P2.w9sT1Swbhx3hs));
                    SystemForegroundService systemForegroundService2 = this.pyu8ovAipBTLYAiKab;
                    systemForegroundService2.w9sT1Swbhx3hs.post(new cc1Kpxq5ItylWb495tu(systemForegroundService2, bXrZf9mCiRhvBOt7P2.dDIMxZXP1V8HdM, 0));
                }
            } else {
                this.JXn4Qf7zpnLjP5 = null;
            }
        }
        SystemForegroundService systemForegroundService3 = this.pyu8ovAipBTLYAiKab;
        if (bXrZf9mCiRhvBOt7P == null || systemForegroundService3 == null) {
            return;
        }
        fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
        ebr1tau40kcogclk.toString();
        feymffyoovhurj7to6lPyu8ovAipBTLYAiKab.getClass();
        systemForegroundService3.w9sT1Swbhx3hs.post(new cc1Kpxq5ItylWb495tu(systemForegroundService3, bXrZf9mCiRhvBOt7P.dDIMxZXP1V8HdM, 0));
    }

    @Override // v.s.d7yjIEB02ZavJfb7Dt
    public final void w9sT1Swbhx3hs(sFdNPiaH9eT4T sfdnpiah9et4t, vLtzHklHcOmK17 vltzhklhcomk17) {
        if (vltzhklhcomk17 instanceof PmgYwiy2tMPByUG991) {
            fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
            ebR1taU40KcOGClk ebr1tau40kcogclkB1EoSIRjJHO5 = okc5AGRjqrud84oM6d.b1EoSIRjJHO5(sfdnpiah9et4t);
            bIQtXpTQsEoGIf25Z biqtxptqseogif25z = this.dDIMxZXP1V8HdM;
            biqtxptqseogif25z.pyu8ovAipBTLYAiKab.w9sT1Swbhx3hs(new Qs7pEhrUyxRnfgePs(biqtxptqseogif25z.hjneShqpF9Tis4, new r9c8qUHbkyLZi(ebr1tau40kcogclkB1EoSIRjJHO5), true, -512));
        }
    }

    public final void xDyLpEZyrcKVe0() {
        this.pyu8ovAipBTLYAiKab = null;
        synchronized (this.vekpFI4d1Nc4fakF) {
            try {
                Iterator it = this.ibVTtJUNfrGYbW.values().iterator();
                while (it.hasNext()) {
                    ((WGrwEyVqR28VYxamRhIg) it.next()).vekpFI4d1Nc4fakF(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.dDIMxZXP1V8HdM.hjneShqpF9Tis4.xDyLpEZyrcKVe0(this);
    }
}
