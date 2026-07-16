package v.s;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class i4q7NrKXalWiVky implements tnAmGCFqcZm9axi {
    public static final /* synthetic */ int xDyLpEZyrcKVe0 = 0;
    public final icsq4nzWNlK1KIU2Hp Ee8d2j4S9Vm5yGuR;
    public final fEyMFFyOOvHURJ7To6L JXn4Qf7zpnLjP5;
    public final Context dDIMxZXP1V8HdM;
    public final HashMap w9sT1Swbhx3hs = new HashMap();
    public final Object vekpFI4d1Nc4fakF = new Object();

    static {
        fEyMFFyOOvHURJ7To6L.wotphlvK9sPbXJ("CommandHandler");
    }

    public i4q7NrKXalWiVky(Context context, fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6l, icsq4nzWNlK1KIU2Hp icsq4nzwnlk1kiu2hp) {
        this.dDIMxZXP1V8HdM = context;
        this.JXn4Qf7zpnLjP5 = feymffyoovhurj7to6l;
        this.Ee8d2j4S9Vm5yGuR = icsq4nzwnlk1kiu2hp;
    }

    public static void vekpFI4d1Nc4fakF(Intent intent, ebR1taU40KcOGClk ebr1tau40kcogclk) {
        intent.putExtra("KEY_WORKSPEC_ID", ebr1tau40kcogclk.dDIMxZXP1V8HdM);
        intent.putExtra("KEY_WORKSPEC_GENERATION", ebr1tau40kcogclk.w9sT1Swbhx3hs);
    }

    public static ebR1taU40KcOGClk w9sT1Swbhx3hs(Intent intent) {
        return new ebR1taU40KcOGClk(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    @Override // v.s.tnAmGCFqcZm9axi
    public final void JXn4Qf7zpnLjP5(ebR1taU40KcOGClk ebr1tau40kcogclk, boolean z) {
        synchronized (this.vekpFI4d1Nc4fakF) {
            try {
                MEHk9HGe2w9cEAsx9 mEHk9HGe2w9cEAsx9 = (MEHk9HGe2w9cEAsx9) this.w9sT1Swbhx3hs.remove(ebr1tau40kcogclk);
                this.Ee8d2j4S9Vm5yGuR.pyu8ovAipBTLYAiKab(ebr1tau40kcogclk);
                if (mEHk9HGe2w9cEAsx9 != null) {
                    mEHk9HGe2w9cEAsx9.xDyLpEZyrcKVe0(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void dDIMxZXP1V8HdM(int i, Intent intent, YBgPeyiVTstFMkDCziC yBgPeyiVTstFMkDCziC) {
        List<r9c8qUHbkyLZi> listB1EoSIRjJHO5;
        ArrayList arrayList;
        String action = intent.getAction();
        int i2 = (-10) + 11;
        int i3 = 0;
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
            Objects.toString(intent);
            feymffyoovhurj7to6lPyu8ovAipBTLYAiKab.getClass();
            Context context = this.dDIMxZXP1V8HdM;
            TnaSMX2IEYZI4c tnaSMX2IEYZI4c = new TnaSMX2IEYZI4c(context, this.JXn4Qf7zpnLjP5, i, yBgPeyiVTstFMkDCziC);
            ArrayList arrayListPyu8ovAipBTLYAiKab = yBgPeyiVTstFMkDCziC.Ee8d2j4S9Vm5yGuR.b1EoSIRjJHO5.XiR1pIn5878vVWd().pyu8ovAipBTLYAiKab();
            int i4 = TPmmkjQ3eELZVgWS6.dDIMxZXP1V8HdM;
            int size = arrayListPyu8ovAipBTLYAiKab.size();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = 0;
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayListPyu8ovAipBTLYAiKab.get(i5);
                i5++;
                RdWywP7AQUqPn0G rdWywP7AQUqPn0G = ((sFdNPiaH9eT4T) obj).D5P1xCAyuvgF;
                z |= rdWywP7AQUqPn0G.JXn4Qf7zpnLjP5;
                z2 |= rdWywP7AQUqPn0G.w9sT1Swbhx3hs;
                z3 |= rdWywP7AQUqPn0G.Ee8d2j4S9Vm5yGuR;
                z4 = (z4 ? 1 : 0) | (rdWywP7AQUqPn0G.dDIMxZXP1V8HdM != i2 ? i2 : 0);
                if (z && z2 && z3 && z4 != 0) {
                    break;
                }
            }
            int i6 = ConstraintProxyUpdateReceiver.dDIMxZXP1V8HdM;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
            context.sendBroadcast(intent2);
            ArrayList arrayList2 = new ArrayList(arrayListPyu8ovAipBTLYAiKab.size());
            tnaSMX2IEYZI4c.dDIMxZXP1V8HdM.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            int size2 = arrayListPyu8ovAipBTLYAiKab.size();
            int i7 = 0;
            while (i7 < size2) {
                Object obj2 = arrayListPyu8ovAipBTLYAiKab.get(i7);
                i7++;
                sFdNPiaH9eT4T sfdnpiah9et4t = (sFdNPiaH9eT4T) obj2;
                if (jCurrentTimeMillis >= sfdnpiah9et4t.dDIMxZXP1V8HdM() && (!sfdnpiah9et4t.vekpFI4d1Nc4fakF() || tnaSMX2IEYZI4c.vekpFI4d1Nc4fakF.JXn4Qf7zpnLjP5(sfdnpiah9et4t))) {
                    arrayList2.add(sfdnpiah9et4t);
                }
            }
            int size3 = arrayList2.size();
            while (i3 < size3) {
                Object obj3 = arrayList2.get(i3);
                i3++;
                sFdNPiaH9eT4T sfdnpiah9et4t2 = (sFdNPiaH9eT4T) obj3;
                String str = sfdnpiah9et4t2.dDIMxZXP1V8HdM;
                ebR1taU40KcOGClk ebr1tau40kcogclkB1EoSIRjJHO5 = okc5AGRjqrud84oM6d.b1EoSIRjJHO5(sfdnpiah9et4t2);
                Intent intent3 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                vekpFI4d1Nc4fakF(intent3, ebr1tau40kcogclkB1EoSIRjJHO5);
                fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
                ((Qxq4OCIomL3rf7RSR) yBgPeyiVTstFMkDCziC.w9sT1Swbhx3hs.JXn4Qf7zpnLjP5).execute(new vJrrbQ3pNiUwSywraT(tnaSMX2IEYZI4c.w9sT1Swbhx3hs, intent3, yBgPeyiVTstFMkDCziC));
            }
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab2 = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
            Objects.toString(intent);
            feymffyoovhurj7to6lPyu8ovAipBTLYAiKab2.getClass();
            yBgPeyiVTstFMkDCziC.Ee8d2j4S9Vm5yGuR.EWUjsTERgdPbSw3NNlN();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            Context context2 = this.dDIMxZXP1V8HdM;
            ebR1taU40KcOGClk ebr1tau40kcogclkW9sT1Swbhx3hs = w9sT1Swbhx3hs(intent);
            fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab3 = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
            ebr1tau40kcogclkW9sT1Swbhx3hs.toString();
            feymffyoovhurj7to6lPyu8ovAipBTLYAiKab3.getClass();
            WorkDatabase workDatabase = yBgPeyiVTstFMkDCziC.Ee8d2j4S9Vm5yGuR.b1EoSIRjJHO5;
            workDatabase.vekpFI4d1Nc4fakF();
            try {
                sFdNPiaH9eT4T sfdnpiah9et4tGmNWMfvn6zlEj = workDatabase.XiR1pIn5878vVWd().gmNWMfvn6zlEj(ebr1tau40kcogclkW9sT1Swbhx3hs.dDIMxZXP1V8HdM);
                if (sfdnpiah9et4tGmNWMfvn6zlEj == null) {
                    fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab4 = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
                    ebr1tau40kcogclkW9sT1Swbhx3hs.toString();
                    feymffyoovhurj7to6lPyu8ovAipBTLYAiKab4.getClass();
                    return;
                }
                if (Y9mRyRdkl5FOcwb66V6.dDIMxZXP1V8HdM(sfdnpiah9et4tGmNWMfvn6zlEj.w9sT1Swbhx3hs)) {
                    fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab5 = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
                    ebr1tau40kcogclkW9sT1Swbhx3hs.toString();
                    feymffyoovhurj7to6lPyu8ovAipBTLYAiKab5.getClass();
                    return;
                }
                long jDDIMxZXP1V8HdM = sfdnpiah9et4tGmNWMfvn6zlEj.dDIMxZXP1V8HdM();
                if (sfdnpiah9et4tGmNWMfvn6zlEj.vekpFI4d1Nc4fakF()) {
                    fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab6 = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
                    ebr1tau40kcogclkW9sT1Swbhx3hs.toString();
                    feymffyoovhurj7to6lPyu8ovAipBTLYAiKab6.getClass();
                    dQC4QhgRN3MSEAP3HW0.w9sT1Swbhx3hs(context2, workDatabase, ebr1tau40kcogclkW9sT1Swbhx3hs, jDDIMxZXP1V8HdM);
                    Intent intent4 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                    intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                    ((Qxq4OCIomL3rf7RSR) yBgPeyiVTstFMkDCziC.w9sT1Swbhx3hs.JXn4Qf7zpnLjP5).execute(new vJrrbQ3pNiUwSywraT(i, intent4, yBgPeyiVTstFMkDCziC));
                } else {
                    fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab7 = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
                    ebr1tau40kcogclkW9sT1Swbhx3hs.toString();
                    feymffyoovhurj7to6lPyu8ovAipBTLYAiKab7.getClass();
                    dQC4QhgRN3MSEAP3HW0.w9sT1Swbhx3hs(context2, workDatabase, ebr1tau40kcogclkW9sT1Swbhx3hs, jDDIMxZXP1V8HdM);
                }
                workDatabase.wotphlvK9sPbXJ();
                return;
            } finally {
                workDatabase.D5P1xCAyuvgF();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            synchronized (this.vekpFI4d1Nc4fakF) {
                try {
                    ebR1taU40KcOGClk ebr1tau40kcogclkW9sT1Swbhx3hs2 = w9sT1Swbhx3hs(intent);
                    fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab8 = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
                    ebr1tau40kcogclkW9sT1Swbhx3hs2.toString();
                    feymffyoovhurj7to6lPyu8ovAipBTLYAiKab8.getClass();
                    if (this.w9sT1Swbhx3hs.containsKey(ebr1tau40kcogclkW9sT1Swbhx3hs2)) {
                        fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab9 = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
                        ebr1tau40kcogclkW9sT1Swbhx3hs2.toString();
                        feymffyoovhurj7to6lPyu8ovAipBTLYAiKab9.getClass();
                    } else {
                        MEHk9HGe2w9cEAsx9 mEHk9HGe2w9cEAsx9 = new MEHk9HGe2w9cEAsx9(this.dDIMxZXP1V8HdM, i, yBgPeyiVTstFMkDCziC, this.Ee8d2j4S9Vm5yGuR.D5P1xCAyuvgF(ebr1tau40kcogclkW9sT1Swbhx3hs2));
                        this.w9sT1Swbhx3hs.put(ebr1tau40kcogclkW9sT1Swbhx3hs2, mEHk9HGe2w9cEAsx9);
                        mEHk9HGe2w9cEAsx9.Ee8d2j4S9Vm5yGuR();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab10 = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
                intent.toString();
                feymffyoovhurj7to6lPyu8ovAipBTLYAiKab10.getClass();
                return;
            } else {
                ebR1taU40KcOGClk ebr1tau40kcogclkW9sT1Swbhx3hs3 = w9sT1Swbhx3hs(intent);
                boolean z5 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
                fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab11 = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
                intent.toString();
                feymffyoovhurj7to6lPyu8ovAipBTLYAiKab11.getClass();
                JXn4Qf7zpnLjP5(ebr1tau40kcogclkW9sT1Swbhx3hs3, z5);
                return;
            }
        }
        icsq4nzWNlK1KIU2Hp icsq4nzwnlk1kiu2hp = this.Ee8d2j4S9Vm5yGuR;
        Bundle extras2 = intent.getExtras();
        String string = extras2.getString("KEY_WORKSPEC_ID");
        if (extras2.containsKey("KEY_WORKSPEC_GENERATION")) {
            int i8 = extras2.getInt("KEY_WORKSPEC_GENERATION");
            arrayList = new ArrayList(i2);
            r9c8qUHbkyLZi r9c8quhbkylziPyu8ovAipBTLYAiKab = icsq4nzwnlk1kiu2hp.pyu8ovAipBTLYAiKab(new ebR1taU40KcOGClk(string, i8));
            if (r9c8quhbkylziPyu8ovAipBTLYAiKab != null) {
                listB1EoSIRjJHO5 = arrayList;
                arrayList.add(r9c8quhbkylziPyu8ovAipBTLYAiKab);
                listB1EoSIRjJHO5 = arrayList;
            }
        } else {
            listB1EoSIRjJHO5 = icsq4nzwnlk1kiu2hp.b1EoSIRjJHO5(string);
        }
        listB1EoSIRjJHO5 = arrayList;
        for (r9c8qUHbkyLZi r9c8quhbkylzi : listB1EoSIRjJHO5) {
            fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
            yBgPeyiVTstFMkDCziC.D5P1xCAyuvgF.D5P1xCAyuvgF(r9c8quhbkylzi, (-577) + 65);
            ebR1taU40KcOGClk ebr1tau40kcogclk = r9c8quhbkylzi.dDIMxZXP1V8HdM;
            Context context3 = this.dDIMxZXP1V8HdM;
            WorkDatabase workDatabase2 = yBgPeyiVTstFMkDCziC.Ee8d2j4S9Vm5yGuR.b1EoSIRjJHO5;
            int i9 = dQC4QhgRN3MSEAP3HW0.dDIMxZXP1V8HdM;
            fUH025aw0Rgl fuh025aw0rglQrz92kRPw4GcghAc = workDatabase2.Qrz92kRPw4GcghAc();
            x0NSvOTfFiEnik x0nsvotffienikJXn4Qf7zpnLjP5 = fuh025aw0rglQrz92kRPw4GcghAc.JXn4Qf7zpnLjP5(ebr1tau40kcogclk);
            if (x0nsvotffienikJXn4Qf7zpnLjP5 != null) {
                dQC4QhgRN3MSEAP3HW0.dDIMxZXP1V8HdM(context3, ebr1tau40kcogclk, x0nsvotffienikJXn4Qf7zpnLjP5.vekpFI4d1Nc4fakF);
                fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab12 = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
                ebr1tau40kcogclk.toString();
                feymffyoovhurj7to6lPyu8ovAipBTLYAiKab12.getClass();
                String str2 = ebr1tau40kcogclk.dDIMxZXP1V8HdM;
                int i10 = ebr1tau40kcogclk.w9sT1Swbhx3hs;
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) fuh025aw0rglQrz92kRPw4GcghAc.dDIMxZXP1V8HdM;
                workDatabase_Impl.w9sT1Swbhx3hs();
                wrjXKFWxtWGPk22 wrjxkfwxtwgpk22 = (wrjXKFWxtWGPk22) fuh025aw0rglQrz92kRPw4GcghAc.vekpFI4d1Nc4fakF;
                IvGcaSCdlPOakpJ6v ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM = wrjxkfwxtwgpk22.dDIMxZXP1V8HdM();
                if (str2 == null) {
                    ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM.xDyLpEZyrcKVe0(i2);
                } else {
                    ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM.MLSIo1htfMPWeB8V876L(str2, i2);
                }
                ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM.wotphlvK9sPbXJ(2, i10);
                workDatabase_Impl.vekpFI4d1Nc4fakF();
                try {
                    ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM.dDIMxZXP1V8HdM();
                    workDatabase_Impl.wotphlvK9sPbXJ();
                    workDatabase_Impl.D5P1xCAyuvgF();
                    wrjxkfwxtwgpk22.gIIiyi2ddlMDR0(ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM);
                } catch (Throwable th2) {
                    workDatabase_Impl.D5P1xCAyuvgF();
                    wrjxkfwxtwgpk22.gIIiyi2ddlMDR0(ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM);
                    throw th2;
                }
            }
            yBgPeyiVTstFMkDCziC.JXn4Qf7zpnLjP5(ebr1tau40kcogclk, false);
        }
    }
}
