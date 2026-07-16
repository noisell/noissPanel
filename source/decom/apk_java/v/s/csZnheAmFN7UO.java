package v.s;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class csZnheAmFN7UO implements IaJdiuw5vdcTDn7 {
    public static final /* synthetic */ int xDyLpEZyrcKVe0 = 0;
    public final eDfRIe8Yxow8 Ee8d2j4S9Vm5yGuR;
    public final WorkDatabase JXn4Qf7zpnLjP5;
    public final Context dDIMxZXP1V8HdM;
    public final IQm2Jih2GrhkfC8oTABJ vekpFI4d1Nc4fakF;
    public final JobScheduler w9sT1Swbhx3hs;

    static {
        fEyMFFyOOvHURJ7To6L.wotphlvK9sPbXJ("SystemJobScheduler");
    }

    public csZnheAmFN7UO(Context context, WorkDatabase workDatabase, eDfRIe8Yxow8 edfrie8yxow8) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        IQm2Jih2GrhkfC8oTABJ iQm2Jih2GrhkfC8oTABJ = new IQm2Jih2GrhkfC8oTABJ(context, (fEyMFFyOOvHURJ7To6L) edfrie8yxow8.xDyLpEZyrcKVe0);
        this.dDIMxZXP1V8HdM = context;
        this.w9sT1Swbhx3hs = jobScheduler;
        this.vekpFI4d1Nc4fakF = iQm2Jih2GrhkfC8oTABJ;
        this.JXn4Qf7zpnLjP5 = workDatabase;
        this.Ee8d2j4S9Vm5yGuR = edfrie8yxow8;
    }

    public static ArrayList JXn4Qf7zpnLjP5(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable unused) {
            fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    private static /* synthetic */ void eqgk() {
    }

    public static void w9sT1Swbhx3hs(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable unused) {
            fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
            String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i));
            feymffyoovhurj7to6lPyu8ovAipBTLYAiKab.getClass();
        }
    }

    public static ebR1taU40KcOGClk xDyLpEZyrcKVe0(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new ebR1taU40KcOGClk(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // v.s.IaJdiuw5vdcTDn7
    public final boolean Ee8d2j4S9Vm5yGuR() {
        return true;
    }

    @Override // v.s.IaJdiuw5vdcTDn7
    public final void dDIMxZXP1V8HdM(String str) {
        ArrayList arrayList;
        Context context = this.dDIMxZXP1V8HdM;
        JobScheduler jobScheduler = this.w9sT1Swbhx3hs;
        ArrayList arrayListJXn4Qf7zpnLjP5 = JXn4Qf7zpnLjP5(context, jobScheduler);
        int i = 0;
        if (arrayListJXn4Qf7zpnLjP5 == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            int size = arrayListJXn4Qf7zpnLjP5.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayListJXn4Qf7zpnLjP5.get(i2);
                i2++;
                JobInfo jobInfo = (JobInfo) obj;
                ebR1taU40KcOGClk ebr1tau40kcogclkXDyLpEZyrcKVe0 = xDyLpEZyrcKVe0(jobInfo);
                if (ebr1tau40kcogclkXDyLpEZyrcKVe0 != null && str.equals(ebr1tau40kcogclkXDyLpEZyrcKVe0.dDIMxZXP1V8HdM)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            w9sT1Swbhx3hs(jobScheduler, ((Integer) obj2).intValue());
        }
        fUH025aw0Rgl fuh025aw0rglQrz92kRPw4GcghAc = this.JXn4Qf7zpnLjP5.Qrz92kRPw4GcghAc();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) fuh025aw0rglQrz92kRPw4GcghAc.dDIMxZXP1V8HdM;
        workDatabase_Impl.w9sT1Swbhx3hs();
        wrjXKFWxtWGPk22 wrjxkfwxtwgpk22 = (wrjXKFWxtWGPk22) fuh025aw0rglQrz92kRPw4GcghAc.JXn4Qf7zpnLjP5;
        IvGcaSCdlPOakpJ6v ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM = wrjxkfwxtwgpk22.dDIMxZXP1V8HdM();
        if (str == null) {
            ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM.xDyLpEZyrcKVe0(1);
        } else {
            ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM.MLSIo1htfMPWeB8V876L(str, 1);
        }
        workDatabase_Impl.vekpFI4d1Nc4fakF();
        try {
            ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM.dDIMxZXP1V8HdM();
            workDatabase_Impl.wotphlvK9sPbXJ();
        } finally {
            workDatabase_Impl.D5P1xCAyuvgF();
            wrjxkfwxtwgpk22.gIIiyi2ddlMDR0(ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void ibVTtJUNfrGYbW(sFdNPiaH9eT4T sfdnpiah9et4t, int i) {
        int i2;
        JobScheduler jobScheduler = this.w9sT1Swbhx3hs;
        IQm2Jih2GrhkfC8oTABJ iQm2Jih2GrhkfC8oTABJ = this.vekpFI4d1Nc4fakF;
        iQm2Jih2GrhkfC8oTABJ.getClass();
        RdWywP7AQUqPn0G rdWywP7AQUqPn0G = sfdnpiah9et4t.D5P1xCAyuvgF;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", sfdnpiah9et4t.dDIMxZXP1V8HdM);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", sfdnpiah9et4t.H9XlUr4OeMJFiXK);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", sfdnpiah9et4t.JXn4Qf7zpnLjP5());
        JobInfo.Builder builder = new JobInfo.Builder(i, iQm2Jih2GrhkfC8oTABJ.dDIMxZXP1V8HdM);
        boolean z = rdWywP7AQUqPn0G.w9sT1Swbhx3hs;
        Set<dfz6ltSv908J2w> set = rdWywP7AQUqPn0G.b1EoSIRjJHO5;
        JobInfo.Builder requiresCharging = builder.setRequiresCharging(z);
        boolean z2 = rdWywP7AQUqPn0G.vekpFI4d1Nc4fakF;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z2).setExtras(persistableBundle);
        int i3 = rdWywP7AQUqPn0G.dDIMxZXP1V8HdM;
        int i4 = Build.VERSION.SDK_INT;
        int i5 = (-74) + 76;
        if (i4 < 30 || i3 != (-13) + 19) {
            int iJ0zjQ7CAgohuxU20eCW6 = Y9mRyRdkl5FOcwb66V6.J0zjQ7CAgohuxU20eCW6(i3);
            if (iJ0zjQ7CAgohuxU20eCW6 == 0) {
                i2 = 0;
            } else if (iJ0zjQ7CAgohuxU20eCW6 == 1) {
                i2 = 1;
            } else if (iJ0zjQ7CAgohuxU20eCW6 != i5) {
                i2 = 3;
                if (iJ0zjQ7CAgohuxU20eCW6 != 3) {
                    i2 = 4;
                    if (iJ0zjQ7CAgohuxU20eCW6 != 4) {
                        fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
                        i2 = 1;
                    }
                }
            } else {
                i2 = i5;
            }
            extras.setRequiredNetworkType(i2);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (!z2) {
            extras.setBackoffCriteria(sfdnpiah9et4t.gIIiyi2ddlMDR0, sfdnpiah9et4t.gmNWMfvn6zlEj == i5 ? 0 : 1);
        }
        long jDDIMxZXP1V8HdM = sfdnpiah9et4t.dDIMxZXP1V8HdM();
        iQm2Jih2GrhkfC8oTABJ.w9sT1Swbhx3hs.getClass();
        long jMax = Math.max(jDDIMxZXP1V8HdM - System.currentTimeMillis(), 0L);
        if (i4 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!sfdnpiah9et4t.J0zjQ7CAgohuxU20eCW6) {
            extras.setImportantWhileForeground(true);
        }
        if (!set.isEmpty()) {
            for (dfz6ltSv908J2w dfz6ltsv908j2w : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(dfz6ltsv908j2w.dDIMxZXP1V8HdM, dfz6ltsv908j2w.w9sT1Swbhx3hs ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(rdWywP7AQUqPn0G.xDyLpEZyrcKVe0);
            extras.setTriggerContentMaxDelay(rdWywP7AQUqPn0G.ibVTtJUNfrGYbW);
        }
        extras.setPersisted(false);
        int i6 = Build.VERSION.SDK_INT;
        extras.setRequiresBatteryNotLow(rdWywP7AQUqPn0G.JXn4Qf7zpnLjP5);
        extras.setRequiresStorageNotLow(rdWywP7AQUqPn0G.Ee8d2j4S9Vm5yGuR);
        Object[] objArr = sfdnpiah9et4t.hjneShqpF9Tis4 > 0;
        Object[] objArr2 = jMax > 0;
        if (i6 >= 31 && sfdnpiah9et4t.J0zjQ7CAgohuxU20eCW6 && objArr == false && objArr2 == false) {
            extras.setExpedited(true);
        }
        JobInfo jobInfoBuild = extras.build();
        fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
        try {
            if (jobScheduler.schedule(jobInfoBuild) == 0) {
                fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
                if (sfdnpiah9et4t.J0zjQ7CAgohuxU20eCW6 && sfdnpiah9et4t.MLSIo1htfMPWeB8V876L == 1) {
                    sfdnpiah9et4t.J0zjQ7CAgohuxU20eCW6 = false;
                    fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
                    ibVTtJUNfrGYbW(sfdnpiah9et4t, i);
                }
            }
        } catch (IllegalStateException e) {
            ArrayList arrayListJXn4Qf7zpnLjP5 = JXn4Qf7zpnLjP5(this.dDIMxZXP1V8HdM, jobScheduler);
            String str = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(arrayListJXn4Qf7zpnLjP5 != null ? arrayListJXn4Qf7zpnLjP5.size() : 0), Integer.valueOf(this.JXn4Qf7zpnLjP5.XiR1pIn5878vVWd().pyu8ovAipBTLYAiKab().size()), Integer.valueOf(this.Ee8d2j4S9Vm5yGuR.vekpFI4d1Nc4fakF));
            fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
            throw new IllegalStateException(str, e);
        } catch (Throwable unused) {
            fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
            sfdnpiah9et4t.toString();
            feymffyoovhurj7to6lPyu8ovAipBTLYAiKab.getClass();
        }
    }

    @Override // v.s.IaJdiuw5vdcTDn7
    public final void vekpFI4d1Nc4fakF(sFdNPiaH9eT4T... sfdnpiah9et4tArr) {
        int iIntValue;
        eDfRIe8Yxow8 edfrie8yxow8 = this.Ee8d2j4S9Vm5yGuR;
        WorkDatabase workDatabase = this.JXn4Qf7zpnLjP5;
        final maeSa89IyXlbthYlXVv maesa89iyxlbthylxvv = new maeSa89IyXlbthYlXVv(workDatabase);
        for (sFdNPiaH9eT4T sfdnpiah9et4t : sfdnpiah9et4tArr) {
            workDatabase.vekpFI4d1Nc4fakF();
            try {
                sFdNPiaH9eT4T sfdnpiah9et4tGmNWMfvn6zlEj = workDatabase.XiR1pIn5878vVWd().gmNWMfvn6zlEj(sfdnpiah9et4t.dDIMxZXP1V8HdM);
                if (sfdnpiah9et4tGmNWMfvn6zlEj != null && sfdnpiah9et4tGmNWMfvn6zlEj.w9sT1Swbhx3hs == 1) {
                    ebR1taU40KcOGClk ebr1tau40kcogclkB1EoSIRjJHO5 = okc5AGRjqrud84oM6d.b1EoSIRjJHO5(sfdnpiah9et4t);
                    x0NSvOTfFiEnik x0nsvotffienikJXn4Qf7zpnLjP5 = workDatabase.Qrz92kRPw4GcghAc().JXn4Qf7zpnLjP5(ebr1tau40kcogclkB1EoSIRjJHO5);
                    if (x0nsvotffienikJXn4Qf7zpnLjP5 != null) {
                        iIntValue = x0nsvotffienikJXn4Qf7zpnLjP5.vekpFI4d1Nc4fakF;
                    } else {
                        edfrie8yxow8.getClass();
                        final int i = edfrie8yxow8.dDIMxZXP1V8HdM;
                        iIntValue = ((Number) maesa89iyxlbthylxvv.dDIMxZXP1V8HdM.gIIiyi2ddlMDR0(new Callable() { // from class: v.s.DEqbQpIjGMZ273vil
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                WorkDatabase workDatabase2 = maesa89iyxlbthylxvv.dDIMxZXP1V8HdM;
                                Long lW9sT1Swbhx3hs = workDatabase2.hjneShqpF9Tis4().w9sT1Swbhx3hs("next_job_scheduler_id");
                                int i2 = 0;
                                int iLongValue = lW9sT1Swbhx3hs != null ? (int) lW9sT1Swbhx3hs.longValue() : 0;
                                workDatabase2.hjneShqpF9Tis4().vekpFI4d1Nc4fakF(new DFi6QeYwJSAjQ("next_job_scheduler_id", Long.valueOf(iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1)));
                                if (iLongValue < 0 || iLongValue > i) {
                                    workDatabase2.hjneShqpF9Tis4().vekpFI4d1Nc4fakF(new DFi6QeYwJSAjQ("next_job_scheduler_id", Long.valueOf(1)));
                                } else {
                                    i2 = iLongValue;
                                }
                                return Integer.valueOf(i2);
                            }
                        })).intValue();
                    }
                    if (x0nsvotffienikJXn4Qf7zpnLjP5 == null) {
                        workDatabase.Qrz92kRPw4GcghAc().xDyLpEZyrcKVe0(new x0NSvOTfFiEnik(ebr1tau40kcogclkB1EoSIRjJHO5.dDIMxZXP1V8HdM, ebr1tau40kcogclkB1EoSIRjJHO5.w9sT1Swbhx3hs, iIntValue));
                    }
                    ibVTtJUNfrGYbW(sfdnpiah9et4t, iIntValue);
                    workDatabase.wotphlvK9sPbXJ();
                } else {
                    fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
                    workDatabase.wotphlvK9sPbXJ();
                }
                workDatabase.D5P1xCAyuvgF();
            } catch (Throwable th) {
                workDatabase.D5P1xCAyuvgF();
                throw th;
            }
        }
    }
}
