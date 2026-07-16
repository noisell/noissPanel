package v.s;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class bIQtXpTQsEoGIf25Z extends RIZfHbqXpth8r2yN4 {
    public static bIQtXpTQsEoGIf25Z J0zjQ7CAgohuxU20eCW6;
    public static final Object MLSIo1htfMPWeB8V876L;
    public static bIQtXpTQsEoGIf25Z nQilHWaqS401ZtR;
    public final List D5P1xCAyuvgF;
    public final mYrXZiFjFW2Xg Qrz92kRPw4GcghAc;
    public final WorkDatabase b1EoSIRjJHO5;
    public boolean gIIiyi2ddlMDR0 = false;
    public final maeSa89IyXlbthYlXVv gmNWMfvn6zlEj;
    public final DP5sXJhndWh8c4VkCzdA hjneShqpF9Tis4;
    public final eDfRIe8Yxow8 ibVTtJUNfrGYbW;
    public final fUH025aw0Rgl pyu8ovAipBTLYAiKab;
    public BroadcastReceiver.PendingResult wotphlvK9sPbXJ;
    public final Context xDyLpEZyrcKVe0;

    static {
        fEyMFFyOOvHURJ7To6L.wotphlvK9sPbXJ("WorkManagerImpl");
        nQilHWaqS401ZtR = null;
        J0zjQ7CAgohuxU20eCW6 = null;
        MLSIo1htfMPWeB8V876L = new Object();
    }

    public bIQtXpTQsEoGIf25Z(Context context, final eDfRIe8Yxow8 edfrie8yxow8, fUH025aw0Rgl fuh025aw0rgl, final WorkDatabase workDatabase, final List list, DP5sXJhndWh8c4VkCzdA dP5sXJhndWh8c4VkCzdA, mYrXZiFjFW2Xg myrxzifjfw2xg) {
        Context applicationContext = context.getApplicationContext();
        if (ZoRulTtPm8WEZY98.dDIMxZXP1V8HdM(applicationContext)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6l = new fEyMFFyOOvHURJ7To6L(6);
        synchronized (fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab) {
            fEyMFFyOOvHURJ7To6L.D5P1xCAyuvgF = feymffyoovhurj7to6l;
        }
        this.xDyLpEZyrcKVe0 = applicationContext;
        this.pyu8ovAipBTLYAiKab = fuh025aw0rgl;
        this.b1EoSIRjJHO5 = workDatabase;
        this.hjneShqpF9Tis4 = dP5sXJhndWh8c4VkCzdA;
        this.Qrz92kRPw4GcghAc = myrxzifjfw2xg;
        this.ibVTtJUNfrGYbW = edfrie8yxow8;
        this.D5P1xCAyuvgF = list;
        this.gmNWMfvn6zlEj = new maeSa89IyXlbthYlXVv(workDatabase);
        final NTq6GnI9WZIP8Nuz nTq6GnI9WZIP8Nuz = (NTq6GnI9WZIP8Nuz) fuh025aw0rgl.dDIMxZXP1V8HdM;
        int i = Qbw3oj5SB4rmsG0k8.dDIMxZXP1V8HdM;
        dP5sXJhndWh8c4VkCzdA.dDIMxZXP1V8HdM(new tnAmGCFqcZm9axi() { // from class: v.s.QT9k51fWem9q
            @Override // v.s.tnAmGCFqcZm9axi
            public final void JXn4Qf7zpnLjP5(ebR1taU40KcOGClk ebr1tau40kcogclk, boolean z) {
                nTq6GnI9WZIP8Nuz.execute(new TLNVSdc9dyzTVW7(list, ebr1tau40kcogclk, edfrie8yxow8, workDatabase));
            }
        });
        fuh025aw0rgl.w9sT1Swbhx3hs(new BXg2vC5cHAAWqI(applicationContext, this));
    }

    public static void K7eEOBPYP9VIoHWTe(Context context, eDfRIe8Yxow8 edfrie8yxow8) {
        synchronized (MLSIo1htfMPWeB8V876L) {
            try {
                bIQtXpTQsEoGIf25Z biqtxptqseogif25z = nQilHWaqS401ZtR;
                if (biqtxptqseogif25z != null && J0zjQ7CAgohuxU20eCW6 != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (biqtxptqseogif25z == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (J0zjQ7CAgohuxU20eCW6 == null) {
                        J0zjQ7CAgohuxU20eCW6 = OFtLBiBbrrTHWu.hjneShqpF9Tis4(applicationContext, edfrie8yxow8);
                    }
                    nQilHWaqS401ZtR = J0zjQ7CAgohuxU20eCW6;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static bIQtXpTQsEoGIf25Z l1V0lQr6TbwNKqHfXNbb(Context context) {
        bIQtXpTQsEoGIf25Z biqtxptqseogif25z;
        Object obj = MLSIo1htfMPWeB8V876L;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    try {
                        biqtxptqseogif25z = nQilHWaqS401ZtR;
                        if (biqtxptqseogif25z == null) {
                            biqtxptqseogif25z = J0zjQ7CAgohuxU20eCW6;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return biqtxptqseogif25z;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (biqtxptqseogif25z != null) {
            return biqtxptqseogif25z;
        }
        context.getApplicationContext();
        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
    }

    private static /* synthetic */ void ucesstpipq() {
    }

    public final icsq4nzWNlK1KIU2Hp DVTNwpDEVsUKuznof(final String str, int i, final zx5222rdBWLkmaqS zx5222rdbwlkmaqs) {
        if (i != (-5) + 8) {
            return new bVJI6LA77fw3pJCMf(this, str, i != 2 ? 1 : 2, Collections.singletonList(zx5222rdbwlkmaqs), 0).dTS0S7eC32ubQH54j36();
        }
        final icsq4nzWNlK1KIU2Hp icsq4nzwnlk1kiu2hp = new icsq4nzWNlK1KIU2Hp(1);
        final t5CIta0Gf7eDP t5cita0gf7edp = new t5CIta0Gf7eDP(zx5222rdbwlkmaqs, this, str, icsq4nzwnlk1kiu2hp);
        ((NTq6GnI9WZIP8Nuz) this.pyu8ovAipBTLYAiKab.dDIMxZXP1V8HdM).execute(new Runnable() { // from class: v.s.HwtvRRt7nXCAgdoyF2
            private static /* synthetic */ void mmcttkymry() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                bIQtXpTQsEoGIf25Z biqtxptqseogif25z = this.w9sT1Swbhx3hs;
                WorkDatabase workDatabase = biqtxptqseogif25z.b1EoSIRjJHO5;
                nLrxl2ExJj45rGBsZNLQ nlrxl2exjj45rgbsznlqXiR1pIn5878vVWd = workDatabase.XiR1pIn5878vVWd();
                String str2 = str;
                ArrayList arrayListGIIiyi2ddlMDR0 = nlrxl2exjj45rgbsznlqXiR1pIn5878vVWd.gIIiyi2ddlMDR0(str2);
                int size = arrayListGIIiyi2ddlMDR0.size();
                icsq4nzWNlK1KIU2Hp icsq4nzwnlk1kiu2hp2 = icsq4nzwnlk1kiu2hp;
                if (size > 1) {
                    icsq4nzwnlk1kiu2hp2.JXn4Qf7zpnLjP5(new bb30I3udhbiUr0X08G6(new UnsupportedOperationException("Can't apply UPDATE policy to the chains of work.")));
                    return;
                }
                Xc1FQ2gtMD4wYN6jPv xc1FQ2gtMD4wYN6jPv = (Xc1FQ2gtMD4wYN6jPv) (arrayListGIIiyi2ddlMDR0.isEmpty() ? null : arrayListGIIiyi2ddlMDR0.get(0));
                t5CIta0Gf7eDP t5cita0gf7edp2 = t5cita0gf7edp;
                if (xc1FQ2gtMD4wYN6jPv == null) {
                    t5cita0gf7edp2.w9sT1Swbhx3hs();
                    return;
                }
                String str3 = xc1FQ2gtMD4wYN6jPv.dDIMxZXP1V8HdM;
                sFdNPiaH9eT4T sfdnpiah9et4tGmNWMfvn6zlEj = nlrxl2exjj45rgbsznlqXiR1pIn5878vVWd.gmNWMfvn6zlEj(str3);
                if (sfdnpiah9et4tGmNWMfvn6zlEj == null) {
                    icsq4nzwnlk1kiu2hp2.JXn4Qf7zpnLjP5(new bb30I3udhbiUr0X08G6(new IllegalStateException("WorkSpec with " + str3 + ", that matches a name \"" + str2 + "\", wasn't found")));
                    return;
                }
                if (!sfdnpiah9et4tGmNWMfvn6zlEj.JXn4Qf7zpnLjP5()) {
                    icsq4nzwnlk1kiu2hp2.JXn4Qf7zpnLjP5(new bb30I3udhbiUr0X08G6(new UnsupportedOperationException("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.")));
                    return;
                }
                if (xc1FQ2gtMD4wYN6jPv.w9sT1Swbhx3hs == 6) {
                    nlrxl2exjj45rgbsznlqXiR1pIn5878vVWd.vekpFI4d1Nc4fakF(str3);
                    t5cita0gf7edp2.w9sT1Swbhx3hs();
                    return;
                }
                GIUFlVOyGkYog gIUFlVOyGkYog = zx5222rdbwlkmaqs;
                try {
                    SbxdZ6Kq2uhHQ5RPRqm.fivkjwgu2UdAtiY(biqtxptqseogif25z.hjneShqpF9Tis4, workDatabase, biqtxptqseogif25z.ibVTtJUNfrGYbW, biqtxptqseogif25z.D5P1xCAyuvgF, sFdNPiaH9eT4T.w9sT1Swbhx3hs(gIUFlVOyGkYog.w9sT1Swbhx3hs, xc1FQ2gtMD4wYN6jPv.dDIMxZXP1V8HdM, 0, null, null, 0, 0L, 0, 0, 0L, 0, 8388606), gIUFlVOyGkYog.vekpFI4d1Nc4fakF);
                    icsq4nzwnlk1kiu2hp2.JXn4Qf7zpnLjP5(icsq4nzWNlK1KIU2Hp.JXn4Qf7zpnLjP5);
                } catch (Throwable th) {
                    icsq4nzwnlk1kiu2hp2.JXn4Qf7zpnLjP5(new bb30I3udhbiUr0X08G6(th));
                }
            }
        });
        return icsq4nzwnlk1kiu2hp;
    }

    public final void EWUjsTERgdPbSw3NNlN() {
        ArrayList arrayListJXn4Qf7zpnLjP5;
        int i = csZnheAmFN7UO.xDyLpEZyrcKVe0;
        Context context = this.xDyLpEZyrcKVe0;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (arrayListJXn4Qf7zpnLjP5 = csZnheAmFN7UO.JXn4Qf7zpnLjP5(context, jobScheduler)) != null && !arrayListJXn4Qf7zpnLjP5.isEmpty()) {
            int size = arrayListJXn4Qf7zpnLjP5.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayListJXn4Qf7zpnLjP5.get(i2);
                i2++;
                csZnheAmFN7UO.w9sT1Swbhx3hs(jobScheduler, ((JobInfo) obj).getId());
            }
        }
        WorkDatabase workDatabase = this.b1EoSIRjJHO5;
        nLrxl2ExJj45rGBsZNLQ nlrxl2exjj45rgbsznlqXiR1pIn5878vVWd = workDatabase.XiR1pIn5878vVWd();
        WorkDatabase_Impl workDatabase_Impl = nlrxl2exjj45rgbsznlqXiR1pIn5878vVWd.dDIMxZXP1V8HdM;
        workDatabase_Impl.w9sT1Swbhx3hs();
        wrjXKFWxtWGPk22 wrjxkfwxtwgpk22 = nlrxl2exjj45rgbsznlqXiR1pIn5878vVWd.wotphlvK9sPbXJ;
        IvGcaSCdlPOakpJ6v ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM = wrjxkfwxtwgpk22.dDIMxZXP1V8HdM();
        workDatabase_Impl.vekpFI4d1Nc4fakF();
        try {
            ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM.dDIMxZXP1V8HdM();
            workDatabase_Impl.wotphlvK9sPbXJ();
            workDatabase_Impl.D5P1xCAyuvgF();
            wrjxkfwxtwgpk22.gIIiyi2ddlMDR0(ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM);
            Qbw3oj5SB4rmsG0k8.w9sT1Swbhx3hs(this.ibVTtJUNfrGYbW, workDatabase, this.D5P1xCAyuvgF);
        } catch (Throwable th) {
            workDatabase_Impl.D5P1xCAyuvgF();
            wrjxkfwxtwgpk22.gIIiyi2ddlMDR0(ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM);
            throw th;
        }
    }

    public final void dTS0S7eC32ubQH54j36() {
        synchronized (MLSIo1htfMPWeB8V876L) {
            try {
                this.gIIiyi2ddlMDR0 = true;
                BroadcastReceiver.PendingResult pendingResult = this.wotphlvK9sPbXJ;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.wotphlvK9sPbXJ = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
