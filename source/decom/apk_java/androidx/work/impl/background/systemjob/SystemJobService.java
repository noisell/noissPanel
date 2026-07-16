package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import java.util.Arrays;
import java.util.HashMap;
import v.s.DP5sXJhndWh8c4VkCzdA;
import v.s.GFrvMgfdhLhlsMf9HK;
import v.s.Hnsrhf2jJV8dCt;
import v.s.ICw2ufPtGwBVC9;
import v.s.TGxMmCziAiRmHXAunL;
import v.s.W6dfON4KdcdxlH;
import v.s.bIQtXpTQsEoGIf25Z;
import v.s.ebR1taU40KcOGClk;
import v.s.fEyMFFyOOvHURJ7To6L;
import v.s.icsq4nzWNlK1KIU2Hp;
import v.s.r9c8qUHbkyLZi;
import v.s.tnAmGCFqcZm9axi;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class SystemJobService extends JobService implements tnAmGCFqcZm9axi {
    public static final /* synthetic */ int Ee8d2j4S9Vm5yGuR = 0;
    public Hnsrhf2jJV8dCt JXn4Qf7zpnLjP5;
    public bIQtXpTQsEoGIf25Z dDIMxZXP1V8HdM;
    public final HashMap w9sT1Swbhx3hs = new HashMap();
    public final icsq4nzWNlK1KIU2Hp vekpFI4d1Nc4fakF = new icsq4nzWNlK1KIU2Hp(5);

    static {
        fEyMFFyOOvHURJ7To6L.wotphlvK9sPbXJ("SystemJobService");
    }

    public static ebR1taU40KcOGClk dDIMxZXP1V8HdM(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new ebR1taU40KcOGClk(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    private static /* synthetic */ void pzpq() {
    }

    @Override // v.s.tnAmGCFqcZm9axi
    public final void JXn4Qf7zpnLjP5(ebR1taU40KcOGClk ebr1tau40kcogclk, boolean z) {
        JobParameters jobParameters;
        fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
        synchronized (this.w9sT1Swbhx3hs) {
            jobParameters = (JobParameters) this.w9sT1Swbhx3hs.remove(ebr1tau40kcogclk);
        }
        this.vekpFI4d1Nc4fakF.pyu8ovAipBTLYAiKab(ebr1tau40kcogclk);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            bIQtXpTQsEoGIf25Z biqtxptqseogif25zL1V0lQr6TbwNKqHfXNbb = bIQtXpTQsEoGIf25Z.l1V0lQr6TbwNKqHfXNbb(getApplicationContext());
            this.dDIMxZXP1V8HdM = biqtxptqseogif25zL1V0lQr6TbwNKqHfXNbb;
            DP5sXJhndWh8c4VkCzdA dP5sXJhndWh8c4VkCzdA = biqtxptqseogif25zL1V0lQr6TbwNKqHfXNbb.hjneShqpF9Tis4;
            this.JXn4Qf7zpnLjP5 = new Hnsrhf2jJV8dCt(dP5sXJhndWh8c4VkCzdA, biqtxptqseogif25zL1V0lQr6TbwNKqHfXNbb.pyu8ovAipBTLYAiKab);
            dP5sXJhndWh8c4VkCzdA.dDIMxZXP1V8HdM(this);
        } catch (IllegalStateException e) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
            }
            fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        bIQtXpTQsEoGIf25Z biqtxptqseogif25z = this.dDIMxZXP1V8HdM;
        if (biqtxptqseogif25z != null) {
            biqtxptqseogif25z.hjneShqpF9Tis4.xDyLpEZyrcKVe0(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        if (this.dDIMxZXP1V8HdM == null) {
            fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
            jobFinished(jobParameters, true);
            return false;
        }
        ebR1taU40KcOGClk ebr1tau40kcogclkDDIMxZXP1V8HdM = dDIMxZXP1V8HdM(jobParameters);
        if (ebr1tau40kcogclkDDIMxZXP1V8HdM == null) {
            fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
            return false;
        }
        synchronized (this.w9sT1Swbhx3hs) {
            try {
                if (this.w9sT1Swbhx3hs.containsKey(ebr1tau40kcogclkDDIMxZXP1V8HdM)) {
                    fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
                    ebr1tau40kcogclkDDIMxZXP1V8HdM.toString();
                    feymffyoovhurj7to6lPyu8ovAipBTLYAiKab.getClass();
                    return false;
                }
                fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab2 = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
                ebr1tau40kcogclkDDIMxZXP1V8HdM.toString();
                feymffyoovhurj7to6lPyu8ovAipBTLYAiKab2.getClass();
                this.w9sT1Swbhx3hs.put(ebr1tau40kcogclkDDIMxZXP1V8HdM, jobParameters);
                int i = Build.VERSION.SDK_INT;
                W6dfON4KdcdxlH w6dfON4KdcdxlH = new W6dfON4KdcdxlH();
                if (ICw2ufPtGwBVC9.w9sT1Swbhx3hs(jobParameters) != null) {
                    Arrays.asList(ICw2ufPtGwBVC9.w9sT1Swbhx3hs(jobParameters));
                }
                if (ICw2ufPtGwBVC9.dDIMxZXP1V8HdM(jobParameters) != null) {
                    Arrays.asList(ICw2ufPtGwBVC9.dDIMxZXP1V8HdM(jobParameters));
                }
                if (i >= 28) {
                    GFrvMgfdhLhlsMf9HK.dDIMxZXP1V8HdM(jobParameters);
                }
                this.JXn4Qf7zpnLjP5.pyu8ovAipBTLYAiKab(this.vekpFI4d1Nc4fakF.D5P1xCAyuvgF(ebr1tau40kcogclkDDIMxZXP1V8HdM), w6dfON4KdcdxlH);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        ?? r1 = 62 - 61;
        if (this.dDIMxZXP1V8HdM == null) {
            fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
            return r1;
        }
        ebR1taU40KcOGClk ebr1tau40kcogclkDDIMxZXP1V8HdM = dDIMxZXP1V8HdM(jobParameters);
        if (ebr1tau40kcogclkDDIMxZXP1V8HdM == null) {
            fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
            return false;
        }
        fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
        ebr1tau40kcogclkDDIMxZXP1V8HdM.toString();
        feymffyoovhurj7to6lPyu8ovAipBTLYAiKab.getClass();
        synchronized (this.w9sT1Swbhx3hs) {
            this.w9sT1Swbhx3hs.remove(ebr1tau40kcogclkDDIMxZXP1V8HdM);
        }
        r9c8qUHbkyLZi r9c8quhbkylziPyu8ovAipBTLYAiKab = this.vekpFI4d1Nc4fakF.pyu8ovAipBTLYAiKab(ebr1tau40kcogclkDDIMxZXP1V8HdM);
        if (r9c8quhbkylziPyu8ovAipBTLYAiKab != null) {
            this.JXn4Qf7zpnLjP5.D5P1xCAyuvgF(r9c8quhbkylziPyu8ovAipBTLYAiKab, Build.VERSION.SDK_INT >= 31 ? TGxMmCziAiRmHXAunL.dDIMxZXP1V8HdM(jobParameters) : -512);
        }
        DP5sXJhndWh8c4VkCzdA dP5sXJhndWh8c4VkCzdA = this.dDIMxZXP1V8HdM.hjneShqpF9Tis4;
        String str = ebr1tau40kcogclkDDIMxZXP1V8HdM.dDIMxZXP1V8HdM;
        synchronized (dP5sXJhndWh8c4VkCzdA.hjneShqpF9Tis4) {
            zContains = dP5sXJhndWh8c4VkCzdA.pyu8ovAipBTLYAiKab.contains(str);
        }
        return (zContains ? 1 : 0) ^ r1;
    }
}
