package v.s;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class BXg2vC5cHAAWqI implements Runnable {
    public static final long xDyLpEZyrcKVe0;
    public int Ee8d2j4S9Vm5yGuR = 0;
    public final maeSa89IyXlbthYlXVv JXn4Qf7zpnLjP5;
    public final bIQtXpTQsEoGIf25Z vekpFI4d1Nc4fakF;
    public final Context w9sT1Swbhx3hs;

    static {
        fEyMFFyOOvHURJ7To6L.wotphlvK9sPbXJ("ForceStopRunnable");
        xDyLpEZyrcKVe0 = TimeUnit.DAYS.toMillis(3650L);
    }

    public BXg2vC5cHAAWqI(Context context, bIQtXpTQsEoGIf25Z biqtxptqseogif25z) {
        this.w9sT1Swbhx3hs = context.getApplicationContext();
        this.vekpFI4d1Nc4fakF = biqtxptqseogif25z;
        this.JXn4Qf7zpnLjP5 = biqtxptqseogif25z.gmNWMfvn6zlEj;
    }

    public static void w9sT1Swbhx3hs(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = Build.VERSION.SDK_INT >= (-52) + 83 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long jCurrentTimeMillis = System.currentTimeMillis() + xDyLpEZyrcKVe0;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Code duplicated, block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0249  */
    public final void dDIMxZXP1V8HdM() {
        boolean z;
        maeSa89IyXlbthYlXVv maesa89iyxlbthylxvv = this.JXn4Qf7zpnLjP5;
        bIQtXpTQsEoGIf25Z biqtxptqseogif25z = this.vekpFI4d1Nc4fakF;
        WorkDatabase workDatabase = biqtxptqseogif25z.b1EoSIRjJHO5;
        eDfRIe8Yxow8 edfrie8yxow8 = biqtxptqseogif25z.ibVTtJUNfrGYbW;
        maeSa89IyXlbthYlXVv maesa89iyxlbthylxvv2 = biqtxptqseogif25z.gmNWMfvn6zlEj;
        WorkDatabase workDatabase2 = biqtxptqseogif25z.b1EoSIRjJHO5;
        int i = csZnheAmFN7UO.xDyLpEZyrcKVe0;
        Context context = this.w9sT1Swbhx3hs;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        ArrayList arrayListJXn4Qf7zpnLjP5 = csZnheAmFN7UO.JXn4Qf7zpnLjP5(context, jobScheduler);
        fUH025aw0Rgl fuh025aw0rglQrz92kRPw4GcghAc = workDatabase.Qrz92kRPw4GcghAc();
        fuh025aw0rglQrz92kRPw4GcghAc.getClass();
        eZ6soZeOs7kkqZcCQFOR ez6sozeos7kkqzccqforD5P1xCAyuvgF = eZ6soZeOs7kkqZcCQFOR.D5P1xCAyuvgF("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) fuh025aw0rglQrz92kRPw4GcghAc.dDIMxZXP1V8HdM;
        workDatabase_Impl.w9sT1Swbhx3hs();
        Cursor cursorGmNWMfvn6zlEj = workDatabase_Impl.gmNWMfvn6zlEj(ez6sozeos7kkqzccqforD5P1xCAyuvgF);
        try {
            ArrayList arrayList = new ArrayList(cursorGmNWMfvn6zlEj.getCount());
            while (cursorGmNWMfvn6zlEj.moveToNext()) {
                arrayList.add(cursorGmNWMfvn6zlEj.isNull(0) ? null : cursorGmNWMfvn6zlEj.getString(0));
            }
            cursorGmNWMfvn6zlEj.close();
            ez6sozeos7kkqzccqforD5P1xCAyuvgF.hjneShqpF9Tis4();
            HashSet hashSet = new HashSet(arrayListJXn4Qf7zpnLjP5 != null ? arrayListJXn4Qf7zpnLjP5.size() : 0);
            if (arrayListJXn4Qf7zpnLjP5 != null && !arrayListJXn4Qf7zpnLjP5.isEmpty()) {
                int size = arrayListJXn4Qf7zpnLjP5.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayListJXn4Qf7zpnLjP5.get(i2);
                    i2++;
                    JobInfo jobInfo = (JobInfo) obj;
                    ebR1taU40KcOGClk ebr1tau40kcogclkXDyLpEZyrcKVe0 = csZnheAmFN7UO.xDyLpEZyrcKVe0(jobInfo);
                    if (ebr1tau40kcogclkXDyLpEZyrcKVe0 != null) {
                        hashSet.add(ebr1tau40kcogclkXDyLpEZyrcKVe0.dDIMxZXP1V8HdM);
                    } else {
                        csZnheAmFN7UO.w9sT1Swbhx3hs(jobScheduler, jobInfo.getId());
                    }
                }
            }
            int size2 = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size2) {
                    z = false;
                    break;
                }
                Object obj2 = arrayList.get(i3);
                i3++;
                if (!hashSet.contains((String) obj2)) {
                    fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
                    z = true;
                    break;
                }
            }
            if (z) {
                workDatabase.vekpFI4d1Nc4fakF();
                try {
                    nLrxl2ExJj45rGBsZNLQ nlrxl2exjj45rgbsznlqXiR1pIn5878vVWd = workDatabase.XiR1pIn5878vVWd();
                    int size3 = arrayList.size();
                    int i4 = 0;
                    while (i4 < size3) {
                        Object obj3 = arrayList.get(i4);
                        i4++;
                        nlrxl2exjj45rgbsznlqXiR1pIn5878vVWd.wotphlvK9sPbXJ(-1L, (String) obj3);
                    }
                    workDatabase.wotphlvK9sPbXJ();
                    workDatabase.D5P1xCAyuvgF();
                } catch (Throwable th) {
                    workDatabase.D5P1xCAyuvgF();
                    throw th;
                }
            }
            nLrxl2ExJj45rGBsZNLQ nlrxl2exjj45rgbsznlqXiR1pIn5878vVWd2 = workDatabase2.XiR1pIn5878vVWd();
            eTeIZwLyooQrZ0ICI9i eteizwlyooqrz0ici9iMLSIo1htfMPWeB8V876L = workDatabase2.MLSIo1htfMPWeB8V876L();
            workDatabase2.vekpFI4d1Nc4fakF();
            try {
                ArrayList arrayListB1EoSIRjJHO5 = nlrxl2exjj45rgbsznlqXiR1pIn5878vVWd2.b1EoSIRjJHO5();
                boolean zIsEmpty = arrayListB1EoSIRjJHO5.isEmpty();
                if (!zIsEmpty) {
                    int size4 = arrayListB1EoSIRjJHO5.size();
                    int i5 = 0;
                    while (i5 < size4) {
                        Object obj4 = arrayListB1EoSIRjJHO5.get(i5);
                        i5++;
                        String str = ((sFdNPiaH9eT4T) obj4).dDIMxZXP1V8HdM;
                        nlrxl2exjj45rgbsznlqXiR1pIn5878vVWd2.MLSIo1htfMPWeB8V876L(str, 1);
                        nlrxl2exjj45rgbsznlqXiR1pIn5878vVWd2.XiR1pIn5878vVWd(str, -512);
                        nlrxl2exjj45rgbsznlqXiR1pIn5878vVWd2.wotphlvK9sPbXJ(-1L, str);
                        arrayListB1EoSIRjJHO5 = arrayListB1EoSIRjJHO5;
                        zIsEmpty = zIsEmpty;
                    }
                }
                boolean z2 = zIsEmpty;
                WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) eteizwlyooqrz0ici9iMLSIo1htfMPWeB8V876L.w9sT1Swbhx3hs;
                workDatabase_Impl2.w9sT1Swbhx3hs();
                wrjXKFWxtWGPk22 wrjxkfwxtwgpk22 = (wrjXKFWxtWGPk22) eteizwlyooqrz0ici9iMLSIo1htfMPWeB8V876L.JXn4Qf7zpnLjP5;
                IvGcaSCdlPOakpJ6v ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM = wrjxkfwxtwgpk22.dDIMxZXP1V8HdM();
                workDatabase_Impl2.vekpFI4d1Nc4fakF();
                try {
                    ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM.dDIMxZXP1V8HdM();
                    workDatabase_Impl2.wotphlvK9sPbXJ();
                    workDatabase_Impl2.D5P1xCAyuvgF();
                    wrjxkfwxtwgpk22.gIIiyi2ddlMDR0(ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM);
                    workDatabase2.wotphlvK9sPbXJ();
                    workDatabase2.D5P1xCAyuvgF();
                    boolean z3 = !z2 || z;
                    Long lW9sT1Swbhx3hs = maesa89iyxlbthylxvv2.dDIMxZXP1V8HdM.hjneShqpF9Tis4().w9sT1Swbhx3hs("reschedule_needed");
                    if (lW9sT1Swbhx3hs != null && lW9sT1Swbhx3hs.longValue() == 1) {
                        fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
                        biqtxptqseogif25z.EWUjsTERgdPbSw3NNlN();
                        maesa89iyxlbthylxvv2.getClass();
                        maesa89iyxlbthylxvv2.dDIMxZXP1V8HdM.hjneShqpF9Tis4().vekpFI4d1Nc4fakF(new DFi6QeYwJSAjQ("reschedule_needed", 0L));
                        return;
                    }
                    try {
                        int i6 = Build.VERSION.SDK_INT;
                        int i7 = i6 >= 31 ? 570425344 : 536870912;
                        Intent intent = new Intent();
                        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
                        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i7);
                        if (i6 < 30) {
                            if (broadcast == null) {
                                w9sT1Swbhx3hs(context);
                                fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
                                biqtxptqseogif25z.EWUjsTERgdPbSw3NNlN();
                                ((fEyMFFyOOvHURJ7To6L) edfrie8yxow8.xDyLpEZyrcKVe0).getClass();
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                maesa89iyxlbthylxvv.getClass();
                                maesa89iyxlbthylxvv.dDIMxZXP1V8HdM.hjneShqpF9Tis4().vekpFI4d1Nc4fakF(new DFi6QeYwJSAjQ("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis)));
                                return;
                            }
                            if (z3) {
                                fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
                                Qbw3oj5SB4rmsG0k8.w9sT1Swbhx3hs(edfrie8yxow8, workDatabase2, biqtxptqseogif25z.D5P1xCAyuvgF);
                            }
                        }
                        if (broadcast != null) {
                            broadcast.cancel();
                        }
                        List historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                        if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                            Long lW9sT1Swbhx3hs2 = maesa89iyxlbthylxvv.dDIMxZXP1V8HdM.hjneShqpF9Tis4().w9sT1Swbhx3hs("last_force_stop_ms");
                            long jLongValue = lW9sT1Swbhx3hs2 != null ? lW9sT1Swbhx3hs2.longValue() : 0L;
                            for (int i8 = 0; i8 < historicalProcessExitReasons.size(); i8++) {
                                ApplicationExitInfo applicationExitInfoVekpFI4d1Nc4fakF = VhkhkItRHoue.vekpFI4d1Nc4fakF(historicalProcessExitReasons.get(i8));
                                if (applicationExitInfoVekpFI4d1Nc4fakF.getReason() == 10 && applicationExitInfoVekpFI4d1Nc4fakF.getTimestamp() >= jLongValue) {
                                    fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
                                    biqtxptqseogif25z.EWUjsTERgdPbSw3NNlN();
                                    ((fEyMFFyOOvHURJ7To6L) edfrie8yxow8.xDyLpEZyrcKVe0).getClass();
                                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                                    maesa89iyxlbthylxvv.getClass();
                                    maesa89iyxlbthylxvv.dDIMxZXP1V8HdM.hjneShqpF9Tis4().vekpFI4d1Nc4fakF(new DFi6QeYwJSAjQ("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis2)));
                                    return;
                                }
                            }
                        }
                        if (z3) {
                            fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
                            Qbw3oj5SB4rmsG0k8.w9sT1Swbhx3hs(edfrie8yxow8, workDatabase2, biqtxptqseogif25z.D5P1xCAyuvgF);
                        }
                    } catch (IllegalArgumentException | SecurityException unused) {
                        fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
                    }
                } catch (Throwable th2) {
                    workDatabase_Impl2.D5P1xCAyuvgF();
                    wrjxkfwxtwgpk22.gIIiyi2ddlMDR0(ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM);
                    throw th2;
                }
            } catch (Throwable th3) {
                workDatabase2.D5P1xCAyuvgF();
                throw th3;
            }
        } catch (Throwable th4) {
            cursorGmNWMfvn6zlEj.close();
            ez6sozeos7kkqzccqforD5P1xCAyuvgF.hjneShqpF9Tis4();
            throw th4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // java.lang.Runnable
    public final void run() {
        boolean zDDIMxZXP1V8HdM;
        ?? r1;
        bIQtXpTQsEoGIf25Z biqtxptqseogif25z = this.vekpFI4d1Nc4fakF;
        try {
            biqtxptqseogif25z.ibVTtJUNfrGYbW.getClass();
            boolean zIsEmpty = TextUtils.isEmpty(null);
            int i = 22 - 21;
            Context context = this.w9sT1Swbhx3hs;
            if (zIsEmpty) {
                fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
                r1 = i;
            } else {
                zDDIMxZXP1V8HdM = rSRPUo6m8jmdbQfXxQ.dDIMxZXP1V8HdM(context);
                fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
            }
            if (r1 == 0) {
                r1 = zDDIMxZXP1V8HdM;
                biqtxptqseogif25z.dTS0S7eC32ubQH54j36();
                return;
            }
            while (true) {
                try {
                    r1 = zDDIMxZXP1V8HdM;
                    OFMrQsTe5s1KYV0lq.Qrz92kRPw4GcghAc(context);
                    fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
                    try {
                        dDIMxZXP1V8HdM();
                        biqtxptqseogif25z.dTS0S7eC32ubQH54j36();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e) {
                        int i2 = this.Ee8d2j4S9Vm5yGuR + i;
                        this.Ee8d2j4S9Vm5yGuR = i2;
                        if (i2 >= 3) {
                            String str = TcylCvHPQabyEWdUAO.dDIMxZXP1V8HdM(context) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
                            IllegalStateException illegalStateException = new IllegalStateException(str, e);
                            biqtxptqseogif25z.ibVTtJUNfrGYbW.getClass();
                            throw illegalStateException;
                        }
                        fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
                        try {
                            Thread.sleep(((long) this.Ee8d2j4S9Vm5yGuR) * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e2) {
                    fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e2);
                    biqtxptqseogif25z.ibVTtJUNfrGYbW.getClass();
                    throw illegalStateException2;
                }
            }
        } catch (Throwable th) {
            biqtxptqseogif25z.dTS0S7eC32ubQH54j36();
            throw th;
        }
    }
}
