package v.s;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class dQC4QhgRN3MSEAP3HW0 {
    public static final /* synthetic */ int dDIMxZXP1V8HdM = 0;

    static {
        fEyMFFyOOvHURJ7To6L.wotphlvK9sPbXJ("Alarms");
    }

    public static void dDIMxZXP1V8HdM(Context context, ebR1taU40KcOGClk ebr1tau40kcogclk, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i2 = i4q7NrKXalWiVky.xDyLpEZyrcKVe0;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        i4q7NrKXalWiVky.vekpFI4d1Nc4fakF(intent, ebr1tau40kcogclk);
        PendingIntent service = PendingIntent.getService(context, i, intent, 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
        ebr1tau40kcogclk.toString();
        feymffyoovhurj7to6lPyu8ovAipBTLYAiKab.getClass();
        alarmManager.cancel(service);
    }

    private static /* synthetic */ void iafaaengdi() {
    }

    public static void w9sT1Swbhx3hs(Context context, WorkDatabase workDatabase, ebR1taU40KcOGClk ebr1tau40kcogclk, long j) {
        fUH025aw0Rgl fuh025aw0rglQrz92kRPw4GcghAc = workDatabase.Qrz92kRPw4GcghAc();
        x0NSvOTfFiEnik x0nsvotffienikJXn4Qf7zpnLjP5 = fuh025aw0rglQrz92kRPw4GcghAc.JXn4Qf7zpnLjP5(ebr1tau40kcogclk);
        if (x0nsvotffienikJXn4Qf7zpnLjP5 != null) {
            int i = x0nsvotffienikJXn4Qf7zpnLjP5.vekpFI4d1Nc4fakF;
            dDIMxZXP1V8HdM(context, ebr1tau40kcogclk, i);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            int i2 = i4q7NrKXalWiVky.xDyLpEZyrcKVe0;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_DELAY_MET");
            i4q7NrKXalWiVky.vekpFI4d1Nc4fakF(intent, ebr1tau40kcogclk);
            PendingIntent service = PendingIntent.getService(context, i, intent, 201326592);
            if (alarmManager != null) {
                is7XW2V21HfKv7MihWy.dDIMxZXP1V8HdM(alarmManager, 0, j, service);
                return;
            }
            return;
        }
        int iIntValue = ((Number) workDatabase.gIIiyi2ddlMDR0(new rziO4QJcO9ArAydJLO(0, new maeSa89IyXlbthYlXVv(workDatabase)))).intValue();
        fuh025aw0rglQrz92kRPw4GcghAc.xDyLpEZyrcKVe0(new x0NSvOTfFiEnik(ebr1tau40kcogclk.dDIMxZXP1V8HdM, ebr1tau40kcogclk.w9sT1Swbhx3hs, iIntValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        int i3 = i4q7NrKXalWiVky.xDyLpEZyrcKVe0;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_DELAY_MET");
        i4q7NrKXalWiVky.vekpFI4d1Nc4fakF(intent2, ebr1tau40kcogclk);
        PendingIntent service2 = PendingIntent.getService(context, iIntValue, intent2, 201326592);
        if (alarmManager2 != null) {
            is7XW2V21HfKv7MihWy.dDIMxZXP1V8HdM(alarmManager2, 0, j, service2);
        }
    }
}
