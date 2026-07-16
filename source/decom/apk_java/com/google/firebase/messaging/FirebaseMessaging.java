package com.google.firebase.messaging;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import v.s.DfUmSWZwfhCUz;
import v.s.EPXwpnHeMDtvkKf;
import v.s.IXBvAqS2fpdIRK;
import v.s.Kg5VJsk9tQsi36SjZR;
import v.s.L3dp66w8ustOJLN7unY;
import v.s.OfLkl9rR9exIS;
import v.s.QbnuJYfmluA6tNLYu;
import v.s.RqLIwoK3mjYHtQ7Aj;
import v.s.SbxdZ6Kq2uhHQ5RPRqm;
import v.s.Sn2d19yOBfyV0rw;
import v.s.XlNqgz8EVh2x11Ly;
import v.s.cY0DNVJM1fAUrMWIl7k;
import v.s.dPIdzwIwS3r9wk9;
import v.s.dfwkxUDiclPw1BowH4;
import v.s.g3SNBiUFGCDVZ1c;
import v.s.okZcyTTNtG3Y;
import v.s.q5BX8lVsyHlpw;
import v.s.rA0nQJPukyMi;
import v.s.uuzuO8nhb2ti0qHyFb;
import v.s.wm29dOL0HZT4SW65;
import v.s.xXexZC0ehrqHnWzLCz;
import v.s.zzxeBctTPcbuazkjVgh;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class FirebaseMessaging {
    public static final long D5P1xCAyuvgF = TimeUnit.HOURS.toSeconds(8);
    public static ScheduledThreadPoolExecutor gIIiyi2ddlMDR0;
    public static QbnuJYfmluA6tNLYu gmNWMfvn6zlEj;
    public static XlNqgz8EVh2x11Ly hjneShqpF9Tis4;
    public final wm29dOL0HZT4SW65 Ee8d2j4S9Vm5yGuR;
    public final IXBvAqS2fpdIRK JXn4Qf7zpnLjP5;
    public final EPXwpnHeMDtvkKf b1EoSIRjJHO5;
    public final dfwkxUDiclPw1BowH4 dDIMxZXP1V8HdM;
    public final ThreadPoolExecutor ibVTtJUNfrGYbW;
    public boolean pyu8ovAipBTLYAiKab;
    public final xXexZC0ehrqHnWzLCz vekpFI4d1Nc4fakF;
    public final Context w9sT1Swbhx3hs;
    public final ScheduledThreadPoolExecutor xDyLpEZyrcKVe0;

    public FirebaseMessaging(dfwkxUDiclPw1BowH4 dfwkxudiclpw1bowh4, zzxeBctTPcbuazkjVgh zzxebcttpcbuazkjvgh, zzxeBctTPcbuazkjVgh zzxebcttpcbuazkjvgh2, L3dp66w8ustOJLN7unY l3dp66w8ustOJLN7unY, QbnuJYfmluA6tNLYu qbnuJYfmluA6tNLYu, RqLIwoK3mjYHtQ7Aj rqLIwoK3mjYHtQ7Aj) {
        dfwkxudiclpw1bowh4.dDIMxZXP1V8HdM();
        Context context = dfwkxudiclpw1bowh4.dDIMxZXP1V8HdM;
        final EPXwpnHeMDtvkKf ePXwpnHeMDtvkKf = new EPXwpnHeMDtvkKf(context);
        dfwkxudiclpw1bowh4.dDIMxZXP1V8HdM();
        OfLkl9rR9exIS ofLkl9rR9exIS = new OfLkl9rR9exIS(dfwkxudiclpw1bowh4.dDIMxZXP1V8HdM);
        final xXexZC0ehrqHnWzLCz xxexzc0ehrqhnwzlcz = new xXexZC0ehrqHnWzLCz();
        xxexzc0ehrqhnwzlcz.dDIMxZXP1V8HdM = dfwkxudiclpw1bowh4;
        xxexzc0ehrqhnwzlcz.w9sT1Swbhx3hs = ePXwpnHeMDtvkKf;
        xxexzc0ehrqhnwzlcz.vekpFI4d1Nc4fakF = ofLkl9rR9exIS;
        xxexzc0ehrqhnwzlcz.JXn4Qf7zpnLjP5 = zzxebcttpcbuazkjvgh;
        xxexzc0ehrqhnwzlcz.Ee8d2j4S9Vm5yGuR = zzxebcttpcbuazkjvgh2;
        xxexzc0ehrqhnwzlcz.xDyLpEZyrcKVe0 = l3dp66w8ustOJLN7unY;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new okZcyTTNtG3Y("Firebase-Messaging-Task"));
        final int i = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new okZcyTTNtG3Y("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new okZcyTTNtG3Y("Firebase-Messaging-File-Io"));
        final int i2 = 0;
        this.pyu8ovAipBTLYAiKab = false;
        gmNWMfvn6zlEj = qbnuJYfmluA6tNLYu;
        this.dDIMxZXP1V8HdM = dfwkxudiclpw1bowh4;
        this.Ee8d2j4S9Vm5yGuR = new wm29dOL0HZT4SW65(this, rqLIwoK3mjYHtQ7Aj);
        dfwkxudiclpw1bowh4.dDIMxZXP1V8HdM();
        final Context context2 = dfwkxudiclpw1bowh4.dDIMxZXP1V8HdM;
        this.w9sT1Swbhx3hs = context2;
        Kg5VJsk9tQsi36SjZR kg5VJsk9tQsi36SjZR = new Kg5VJsk9tQsi36SjZR();
        this.b1EoSIRjJHO5 = ePXwpnHeMDtvkKf;
        this.vekpFI4d1Nc4fakF = xxexzc0ehrqhnwzlcz;
        this.JXn4Qf7zpnLjP5 = new IXBvAqS2fpdIRK(executorServiceNewSingleThreadExecutor);
        this.xDyLpEZyrcKVe0 = scheduledThreadPoolExecutor;
        this.ibVTtJUNfrGYbW = threadPoolExecutor;
        dfwkxudiclpw1bowh4.dDIMxZXP1V8HdM();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(kg5VJsk9tQsi36SjZR);
        } else {
            Objects.toString(context);
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: v.s.XQm8xRBTnhbMcKcM
            public final /* synthetic */ FirebaseMessaging vekpFI4d1Nc4fakF;

            {
                this.vekpFI4d1Nc4fakF = this;
            }

            private static /* synthetic */ void yaifme() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                ApplicationInfo applicationInfo;
                Bundle bundle;
                switch (i2) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.vekpFI4d1Nc4fakF;
                        if (firebaseMessaging.Ee8d2j4S9Vm5yGuR.w9sT1Swbhx3hs() && firebaseMessaging.xDyLpEZyrcKVe0(firebaseMessaging.JXn4Qf7zpnLjP5())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.pyu8ovAipBTLYAiKab) {
                                    firebaseMessaging.Ee8d2j4S9Vm5yGuR(0L);
                                }
                                break;
                            }
                            return;
                        }
                        return;
                    default:
                        Context context3 = this.vekpFI4d1Nc4fakF.w9sT1Swbhx3hs;
                        Context applicationContext = context3.getApplicationContext();
                        if (applicationContext == null) {
                            applicationContext = context3;
                        }
                        if (applicationContext.getSharedPreferences("com.google.firebase.messaging", 0).getBoolean("proxy_notification_initialized", false)) {
                            return;
                        }
                        try {
                            Context applicationContext2 = context3.getApplicationContext();
                            PackageManager packageManager = applicationContext2.getPackageManager();
                            z = (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext2.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled") : true;
                            break;
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        if (Build.VERSION.SDK_INT >= (-16) + 45) {
                            new ePkLbnAmfpx0dtD(0, context3, new al3CoDKXO0nvx(), z).run();
                            return;
                        } else {
                            SbxdZ6Kq2uhHQ5RPRqm.wotphlvK9sPbXJ(null);
                            return;
                        }
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new okZcyTTNtG3Y("Firebase-Messaging-Topics-Io"));
        int i3 = g3SNBiUFGCDVZ1c.D5P1xCAyuvgF;
        SbxdZ6Kq2uhHQ5RPRqm.vekpFI4d1Nc4fakF(scheduledThreadPoolExecutor2, new Callable() { // from class: v.s.x0KOgut72KRx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                peJwtl1FSM76FqOL04HJ pejwtl1fsm76fqol04hj;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                EPXwpnHeMDtvkKf ePXwpnHeMDtvkKf2 = ePXwpnHeMDtvkKf;
                xXexZC0ehrqHnWzLCz xxexzc0ehrqhnwzlcz2 = xxexzc0ehrqhnwzlcz;
                synchronized (peJwtl1FSM76FqOL04HJ.class) {
                    try {
                        WeakReference weakReference = peJwtl1FSM76FqOL04HJ.w9sT1Swbhx3hs;
                        pejwtl1fsm76fqol04hj = weakReference != null ? (peJwtl1FSM76FqOL04HJ) weakReference.get() : null;
                        if (pejwtl1fsm76fqol04hj == null) {
                            SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                            peJwtl1FSM76FqOL04HJ pejwtl1fsm76fqol04hj2 = new peJwtl1FSM76FqOL04HJ();
                            synchronized (pejwtl1fsm76fqol04hj2) {
                                pejwtl1fsm76fqol04hj2.dDIMxZXP1V8HdM = iniVyKd0OGb2raI4.ibVTtJUNfrGYbW(sharedPreferences, scheduledThreadPoolExecutor3);
                            }
                            peJwtl1FSM76FqOL04HJ.w9sT1Swbhx3hs = new WeakReference(pejwtl1fsm76fqol04hj2);
                            pejwtl1fsm76fqol04hj = pejwtl1fsm76fqol04hj2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new g3SNBiUFGCDVZ1c(firebaseMessaging, ePXwpnHeMDtvkKf2, pejwtl1fsm76fqol04hj, xxexzc0ehrqhnwzlcz2, context3, scheduledThreadPoolExecutor3);
            }
        }).w9sT1Swbhx3hs(scheduledThreadPoolExecutor, new rA0nQJPukyMi(3, this));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: v.s.XQm8xRBTnhbMcKcM
            public final /* synthetic */ FirebaseMessaging vekpFI4d1Nc4fakF;

            {
                this.vekpFI4d1Nc4fakF = this;
            }

            private static /* synthetic */ void yaifme() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                ApplicationInfo applicationInfo;
                Bundle bundle;
                switch (i) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.vekpFI4d1Nc4fakF;
                        if (firebaseMessaging.Ee8d2j4S9Vm5yGuR.w9sT1Swbhx3hs() && firebaseMessaging.xDyLpEZyrcKVe0(firebaseMessaging.JXn4Qf7zpnLjP5())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.pyu8ovAipBTLYAiKab) {
                                    firebaseMessaging.Ee8d2j4S9Vm5yGuR(0L);
                                }
                                break;
                            }
                            return;
                        }
                        return;
                    default:
                        Context context3 = this.vekpFI4d1Nc4fakF.w9sT1Swbhx3hs;
                        Context applicationContext = context3.getApplicationContext();
                        if (applicationContext == null) {
                            applicationContext = context3;
                        }
                        if (applicationContext.getSharedPreferences("com.google.firebase.messaging", 0).getBoolean("proxy_notification_initialized", false)) {
                            return;
                        }
                        try {
                            Context applicationContext2 = context3.getApplicationContext();
                            PackageManager packageManager = applicationContext2.getPackageManager();
                            z = (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext2.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled") : true;
                            break;
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        if (Build.VERSION.SDK_INT >= (-16) + 45) {
                            new ePkLbnAmfpx0dtD(0, context3, new al3CoDKXO0nvx(), z).run();
                            return;
                        } else {
                            SbxdZ6Kq2uhHQ5RPRqm.wotphlvK9sPbXJ(null);
                            return;
                        }
                }
            }
        });
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(dfwkxUDiclPw1BowH4 dfwkxudiclpw1bowh4) {
        FirebaseMessaging firebaseMessaging;
        dfwkxudiclpw1bowh4.dDIMxZXP1V8HdM();
        firebaseMessaging = (FirebaseMessaging) dfwkxudiclpw1bowh4.JXn4Qf7zpnLjP5.dDIMxZXP1V8HdM(FirebaseMessaging.class);
        SbxdZ6Kq2uhHQ5RPRqm.b1EoSIRjJHO5(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public static synchronized XlNqgz8EVh2x11Ly vekpFI4d1Nc4fakF(Context context) {
        try {
            if (hjneShqpF9Tis4 == null) {
                hjneShqpF9Tis4 = new XlNqgz8EVh2x11Ly(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return hjneShqpF9Tis4;
    }

    public static void w9sT1Swbhx3hs(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (gIIiyi2ddlMDR0 == null) {
                    gIIiyi2ddlMDR0 = new ScheduledThreadPoolExecutor(1, new okZcyTTNtG3Y("TAG"));
                }
                gIIiyi2ddlMDR0.schedule(runnable, j, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void Ee8d2j4S9Vm5yGuR(long j) {
        w9sT1Swbhx3hs(new dPIdzwIwS3r9wk9(this, Math.min(Math.max(30L, 2 * j), D5P1xCAyuvgF)), j);
        this.pyu8ovAipBTLYAiKab = true;
    }

    public final uuzuO8nhb2ti0qHyFb JXn4Qf7zpnLjP5() {
        uuzuO8nhb2ti0qHyFb uuzuo8nhb2ti0qhyfbDDIMxZXP1V8HdM;
        XlNqgz8EVh2x11Ly xlNqgz8EVh2x11LyVekpFI4d1Nc4fakF = vekpFI4d1Nc4fakF(this.w9sT1Swbhx3hs);
        dfwkxUDiclPw1BowH4 dfwkxudiclpw1bowh4 = this.dDIMxZXP1V8HdM;
        dfwkxudiclpw1bowh4.dDIMxZXP1V8HdM();
        String strVekpFI4d1Nc4fakF = "[DEFAULT]".equals(dfwkxudiclpw1bowh4.w9sT1Swbhx3hs) ? "" : dfwkxudiclpw1bowh4.vekpFI4d1Nc4fakF();
        String strW9sT1Swbhx3hs = EPXwpnHeMDtvkKf.w9sT1Swbhx3hs(this.dDIMxZXP1V8HdM);
        synchronized (xlNqgz8EVh2x11LyVekpFI4d1Nc4fakF) {
            uuzuo8nhb2ti0qhyfbDDIMxZXP1V8HdM = uuzuO8nhb2ti0qHyFb.dDIMxZXP1V8HdM(xlNqgz8EVh2x11LyVekpFI4d1Nc4fakF.dDIMxZXP1V8HdM.getString(strVekpFI4d1Nc4fakF + "|T|" + strW9sT1Swbhx3hs + "|*", null));
        }
        return uuzuo8nhb2ti0qhyfbDDIMxZXP1V8HdM;
    }

    public final String dDIMxZXP1V8HdM() {
        DfUmSWZwfhCUz dfUmSWZwfhCUzB1EoSIRjJHO5;
        uuzuO8nhb2ti0qHyFb uuzuo8nhb2ti0qhyfbJXn4Qf7zpnLjP5 = JXn4Qf7zpnLjP5();
        if (!xDyLpEZyrcKVe0(uuzuo8nhb2ti0qhyfbJXn4Qf7zpnLjP5)) {
            return uuzuo8nhb2ti0qhyfbJXn4Qf7zpnLjP5.dDIMxZXP1V8HdM;
        }
        String strW9sT1Swbhx3hs = EPXwpnHeMDtvkKf.w9sT1Swbhx3hs(this.dDIMxZXP1V8HdM);
        IXBvAqS2fpdIRK iXBvAqS2fpdIRK = this.JXn4Qf7zpnLjP5;
        synchronized (iXBvAqS2fpdIRK) {
            dfUmSWZwfhCUzB1EoSIRjJHO5 = (DfUmSWZwfhCUz) ((Sn2d19yOBfyV0rw) iXBvAqS2fpdIRK.vekpFI4d1Nc4fakF).get(strW9sT1Swbhx3hs);
            if (dfUmSWZwfhCUzB1EoSIRjJHO5 == null) {
                xXexZC0ehrqHnWzLCz xxexzc0ehrqhnwzlcz = this.vekpFI4d1Nc4fakF;
                dfUmSWZwfhCUzB1EoSIRjJHO5 = xxexzc0ehrqhnwzlcz.vekpFI4d1Nc4fakF(xxexzc0ehrqhnwzlcz.Ee8d2j4S9Vm5yGuR(EPXwpnHeMDtvkKf.w9sT1Swbhx3hs((dfwkxUDiclPw1BowH4) xxexzc0ehrqhnwzlcz.dDIMxZXP1V8HdM), "*", new Bundle())).pyu8ovAipBTLYAiKab(this.ibVTtJUNfrGYbW, new q5BX8lVsyHlpw(this, strW9sT1Swbhx3hs, uuzuo8nhb2ti0qhyfbJXn4Qf7zpnLjP5, 1)).b1EoSIRjJHO5((Executor) iXBvAqS2fpdIRK.w9sT1Swbhx3hs, new cY0DNVJM1fAUrMWIl7k(iXBvAqS2fpdIRK, strW9sT1Swbhx3hs));
                ((Sn2d19yOBfyV0rw) iXBvAqS2fpdIRK.vekpFI4d1Nc4fakF).put(strW9sT1Swbhx3hs, dfUmSWZwfhCUzB1EoSIRjJHO5);
            }
        }
        try {
            return (String) SbxdZ6Kq2uhHQ5RPRqm.dDIMxZXP1V8HdM(dfUmSWZwfhCUzB1EoSIRjJHO5);
        } catch (InterruptedException | ExecutionException e) {
            throw new IOException(e);
        }
    }

    public final boolean xDyLpEZyrcKVe0(uuzuO8nhb2ti0qHyFb uuzuo8nhb2ti0qhyfb) {
        if (uuzuo8nhb2ti0qhyfb != null) {
            return System.currentTimeMillis() > uuzuo8nhb2ti0qhyfb.vekpFI4d1Nc4fakF + uuzuO8nhb2ti0qHyFb.JXn4Qf7zpnLjP5 || !this.b1EoSIRjJHO5.dDIMxZXP1V8HdM().equals(uuzuo8nhb2ti0qhyfb.w9sT1Swbhx3hs);
        }
        return true;
    }
}
