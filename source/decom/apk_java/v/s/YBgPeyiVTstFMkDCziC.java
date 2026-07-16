package v.s;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class YBgPeyiVTstFMkDCziC implements tnAmGCFqcZm9axi {
    public static final /* synthetic */ int hjneShqpF9Tis4 = 0;
    public final Hnsrhf2jJV8dCt D5P1xCAyuvgF;
    public final bIQtXpTQsEoGIf25Z Ee8d2j4S9Vm5yGuR;
    public final DP5sXJhndWh8c4VkCzdA JXn4Qf7zpnLjP5;
    public Intent b1EoSIRjJHO5;
    public final Context dDIMxZXP1V8HdM;
    public final ArrayList ibVTtJUNfrGYbW;
    public SystemAlarmService pyu8ovAipBTLYAiKab;
    public final of8L9erzXSTdsHBj8 vekpFI4d1Nc4fakF;
    public final fUH025aw0Rgl w9sT1Swbhx3hs;
    public final i4q7NrKXalWiVky xDyLpEZyrcKVe0;

    static {
        fEyMFFyOOvHURJ7To6L.wotphlvK9sPbXJ("SystemAlarmDispatcher");
    }

    public YBgPeyiVTstFMkDCziC(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.dDIMxZXP1V8HdM = applicationContext;
        icsq4nzWNlK1KIU2Hp icsq4nzwnlk1kiu2hp = new icsq4nzWNlK1KIU2Hp(5);
        bIQtXpTQsEoGIf25Z biqtxptqseogif25zL1V0lQr6TbwNKqHfXNbb = bIQtXpTQsEoGIf25Z.l1V0lQr6TbwNKqHfXNbb(systemAlarmService);
        eDfRIe8Yxow8 edfrie8yxow8 = biqtxptqseogif25zL1V0lQr6TbwNKqHfXNbb.ibVTtJUNfrGYbW;
        this.Ee8d2j4S9Vm5yGuR = biqtxptqseogif25zL1V0lQr6TbwNKqHfXNbb;
        this.xDyLpEZyrcKVe0 = new i4q7NrKXalWiVky(applicationContext, (fEyMFFyOOvHURJ7To6L) edfrie8yxow8.xDyLpEZyrcKVe0, icsq4nzwnlk1kiu2hp);
        this.vekpFI4d1Nc4fakF = new of8L9erzXSTdsHBj8((r5XEUfod5GSCCwq6c) edfrie8yxow8.pyu8ovAipBTLYAiKab);
        DP5sXJhndWh8c4VkCzdA dP5sXJhndWh8c4VkCzdA = biqtxptqseogif25zL1V0lQr6TbwNKqHfXNbb.hjneShqpF9Tis4;
        this.JXn4Qf7zpnLjP5 = dP5sXJhndWh8c4VkCzdA;
        fUH025aw0Rgl fuh025aw0rgl = biqtxptqseogif25zL1V0lQr6TbwNKqHfXNbb.pyu8ovAipBTLYAiKab;
        this.w9sT1Swbhx3hs = fuh025aw0rgl;
        this.D5P1xCAyuvgF = new Hnsrhf2jJV8dCt(dP5sXJhndWh8c4VkCzdA, fuh025aw0rgl);
        dP5sXJhndWh8c4VkCzdA.dDIMxZXP1V8HdM(this);
        this.ibVTtJUNfrGYbW = new ArrayList();
        this.b1EoSIRjJHO5 = null;
    }

    public static void w9sT1Swbhx3hs() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    @Override // v.s.tnAmGCFqcZm9axi
    public final void JXn4Qf7zpnLjP5(ebR1taU40KcOGClk ebr1tau40kcogclk, boolean z) {
        Qxq4OCIomL3rf7RSR qxq4OCIomL3rf7RSR = (Qxq4OCIomL3rf7RSR) this.w9sT1Swbhx3hs.JXn4Qf7zpnLjP5;
        int i = i4q7NrKXalWiVky.xDyLpEZyrcKVe0;
        Intent intent = new Intent(this.dDIMxZXP1V8HdM, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        i4q7NrKXalWiVky.vekpFI4d1Nc4fakF(intent, ebr1tau40kcogclk);
        qxq4OCIomL3rf7RSR.execute(new vJrrbQ3pNiUwSywraT(0, intent, this));
    }

    public final void dDIMxZXP1V8HdM(Intent intent, int i) {
        fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
        Objects.toString(intent);
        feymffyoovhurj7to6lPyu8ovAipBTLYAiKab.getClass();
        w9sT1Swbhx3hs();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            w9sT1Swbhx3hs();
            synchronized (this.ibVTtJUNfrGYbW) {
                try {
                    ArrayList arrayList = this.ibVTtJUNfrGYbW;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) obj).getAction())) {
                            return;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.ibVTtJUNfrGYbW) {
            try {
                boolean zIsEmpty = this.ibVTtJUNfrGYbW.isEmpty();
                this.ibVTtJUNfrGYbW.add(intent);
                if (zIsEmpty) {
                    vekpFI4d1Nc4fakF();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void vekpFI4d1Nc4fakF() {
        w9sT1Swbhx3hs();
        PowerManager.WakeLock wakeLockDDIMxZXP1V8HdM = BWybMLHPTAHr.dDIMxZXP1V8HdM(this.dDIMxZXP1V8HdM, "ProcessCommand");
        try {
            wakeLockDDIMxZXP1V8HdM.acquire();
            this.Ee8d2j4S9Vm5yGuR.pyu8ovAipBTLYAiKab.w9sT1Swbhx3hs(new Qb8181WgcuUWi(this, 0));
        } finally {
            wakeLockDDIMxZXP1V8HdM.release();
        }
    }
}
