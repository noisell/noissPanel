package v.s;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class g53KeHSJCprsAC3vW6 {
    public final String D5P1xCAyuvgF;
    public long Ee8d2j4S9Vm5yGuR;
    public ScheduledFuture JXn4Qf7zpnLjP5;
    public ts9epBRLIB0mMCGXG b1EoSIRjJHO5;
    public final Object dDIMxZXP1V8HdM;
    public final ScheduledExecutorService gIIiyi2ddlMDR0;
    public final AtomicInteger gmNWMfvn6zlEj;
    public final HashMap hjneShqpF9Tis4;
    public boolean ibVTtJUNfrGYbW;
    public final W6dfON4KdcdxlH pyu8ovAipBTLYAiKab;
    public int vekpFI4d1Nc4fakF;
    public final PowerManager.WakeLock w9sT1Swbhx3hs;
    public final HashSet xDyLpEZyrcKVe0;
    public static final long wotphlvK9sPbXJ = TimeUnit.DAYS.toMillis(366);
    public static volatile ScheduledExecutorService Qrz92kRPw4GcghAc = null;
    public static final Object nQilHWaqS401ZtR = new Object();

    public g53KeHSJCprsAC3vW6(Context context) {
        String packageName = context.getPackageName();
        this.dDIMxZXP1V8HdM = new Object();
        this.vekpFI4d1Nc4fakF = 0;
        this.xDyLpEZyrcKVe0 = new HashSet();
        this.ibVTtJUNfrGYbW = true;
        this.pyu8ovAipBTLYAiKab = W6dfON4KdcdxlH.JXn4Qf7zpnLjP5;
        this.hjneShqpF9Tis4 = new HashMap();
        this.gmNWMfvn6zlEj = new AtomicInteger(0);
        SbxdZ6Kq2uhHQ5RPRqm.xDyLpEZyrcKVe0("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.b1EoSIRjJHO5 = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.D5P1xCAyuvgF = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.D5P1xCAyuvgF = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new Sb7Xj3N9U1DQ(sb.toString());
        }
        this.w9sT1Swbhx3hs = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        Method method = Ic0WCFF99xW2n4nT.dDIMxZXP1V8HdM;
        if (context.getPackageManager() != null) {
            if (I5wRTRZp0psyO1L.dDIMxZXP1V8HdM(context).dDIMxZXP1V8HdM.getPackageManager().checkPermission("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) == 0) {
                int i = cYsUaUHQWoSkocVq.dDIMxZXP1V8HdM;
                packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
                if (context.getPackageManager() != null && packageName != null) {
                    try {
                        ApplicationInfo applicationInfo = I5wRTRZp0psyO1L.dDIMxZXP1V8HdM(context).dDIMxZXP1V8HdM.getPackageManager().getApplicationInfo(packageName, 0);
                        if (applicationInfo == null) {
                            "Could not get applicationInfo from package: ".concat(packageName);
                        } else {
                            int i2 = applicationInfo.uid;
                            workSource = new WorkSource();
                            Method method2 = Ic0WCFF99xW2n4nT.w9sT1Swbhx3hs;
                            try {
                                if (method2 != null) {
                                    method2.invoke(workSource, Integer.valueOf(i2), packageName);
                                } else {
                                    Method method3 = Ic0WCFF99xW2n4nT.dDIMxZXP1V8HdM;
                                    if (method3 != null) {
                                        method3.invoke(workSource, Integer.valueOf(i2));
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    } catch (PackageManager.NameNotFoundException unused2) {
                        "Could not find package: ".concat(packageName);
                    }
                }
                if (workSource != null) {
                    try {
                        this.w9sT1Swbhx3hs.setWorkSource(workSource);
                    } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                        e.toString();
                    }
                }
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = Qrz92kRPw4GcghAc;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (nQilHWaqS401ZtR) {
                try {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = Qrz92kRPw4GcghAc;
                    if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        Qrz92kRPw4GcghAc = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.gIIiyi2ddlMDR0 = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    public final void Ee8d2j4S9Vm5yGuR() {
        synchronized (this.dDIMxZXP1V8HdM) {
            try {
                if (w9sT1Swbhx3hs()) {
                    if (this.ibVTtJUNfrGYbW) {
                        int i = this.vekpFI4d1Nc4fakF - 1;
                        this.vekpFI4d1Nc4fakF = i;
                        if (i > 0) {
                            return;
                        }
                    } else {
                        this.vekpFI4d1Nc4fakF = 0;
                    }
                    JXn4Qf7zpnLjP5();
                    Iterator it = this.hjneShqpF9Tis4.values().iterator();
                    while (it.hasNext()) {
                        ((lQ0rZoCo4m99tvd) it.next()).dDIMxZXP1V8HdM = 0;
                    }
                    this.hjneShqpF9Tis4.clear();
                    ScheduledFuture scheduledFuture = this.JXn4Qf7zpnLjP5;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.JXn4Qf7zpnLjP5 = null;
                        this.Ee8d2j4S9Vm5yGuR = 0L;
                    }
                    if (this.w9sT1Swbhx3hs.isHeld()) {
                        try {
                            try {
                                this.w9sT1Swbhx3hs.release();
                                if (this.b1EoSIRjJHO5 != null) {
                                    this.b1EoSIRjJHO5 = null;
                                }
                            } catch (RuntimeException e) {
                                if (!e.getClass().equals(RuntimeException.class)) {
                                    throw e;
                                }
                                String.valueOf(this.D5P1xCAyuvgF).concat(" failed to release!");
                                if (this.b1EoSIRjJHO5 != null) {
                                    this.b1EoSIRjJHO5 = null;
                                }
                            }
                        } catch (Throwable th) {
                            if (this.b1EoSIRjJHO5 != null) {
                                this.b1EoSIRjJHO5 = null;
                            }
                            throw th;
                        }
                    } else {
                        String.valueOf(this.D5P1xCAyuvgF).concat(" should be held!");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void JXn4Qf7zpnLjP5() {
        HashSet hashSet = this.xDyLpEZyrcKVe0;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public final void dDIMxZXP1V8HdM(long j) {
        this.gmNWMfvn6zlEj.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, wotphlvK9sPbXJ), 1L);
        if (j > 0) {
            jMax = Math.min(j, jMax);
        }
        synchronized (this.dDIMxZXP1V8HdM) {
            try {
                if (!w9sT1Swbhx3hs()) {
                    this.b1EoSIRjJHO5 = ts9epBRLIB0mMCGXG.w9sT1Swbhx3hs;
                    this.w9sT1Swbhx3hs.acquire();
                    this.pyu8ovAipBTLYAiKab.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.vekpFI4d1Nc4fakF++;
                if (this.ibVTtJUNfrGYbW) {
                    TextUtils.isEmpty(null);
                }
                lQ0rZoCo4m99tvd lq0rzoco4m99tvd = (lQ0rZoCo4m99tvd) this.hjneShqpF9Tis4.get(null);
                if (lq0rzoco4m99tvd == null) {
                    lq0rzoco4m99tvd = new lQ0rZoCo4m99tvd();
                    this.hjneShqpF9Tis4.put(null, lq0rzoco4m99tvd);
                }
                lq0rzoco4m99tvd.dDIMxZXP1V8HdM++;
                this.pyu8ovAipBTLYAiKab.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j2 = Long.MAX_VALUE - jElapsedRealtime > jMax ? jElapsedRealtime + jMax : Long.MAX_VALUE;
                if (j2 > this.Ee8d2j4S9Vm5yGuR) {
                    this.Ee8d2j4S9Vm5yGuR = j2;
                    ScheduledFuture scheduledFuture = this.JXn4Qf7zpnLjP5;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.JXn4Qf7zpnLjP5 = this.gIIiyi2ddlMDR0.schedule(new YqOiSVb2wSv9Lq63qb(15, this), jMax, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void vekpFI4d1Nc4fakF() {
        if (this.gmNWMfvn6zlEj.decrementAndGet() < 0) {
            String.valueOf(this.D5P1xCAyuvgF).concat(" release without a matched acquire!");
        }
        synchronized (this.dDIMxZXP1V8HdM) {
            try {
                if (this.ibVTtJUNfrGYbW) {
                    TextUtils.isEmpty(null);
                }
                if (this.hjneShqpF9Tis4.containsKey(null)) {
                    lQ0rZoCo4m99tvd lq0rzoco4m99tvd = (lQ0rZoCo4m99tvd) this.hjneShqpF9Tis4.get(null);
                    if (lq0rzoco4m99tvd != null) {
                        int i = lq0rzoco4m99tvd.dDIMxZXP1V8HdM - 1;
                        lq0rzoco4m99tvd.dDIMxZXP1V8HdM = i;
                        if (i == 0) {
                            this.hjneShqpF9Tis4.remove(null);
                        }
                    }
                } else {
                    String.valueOf(this.D5P1xCAyuvgF).concat(" counter does not exist");
                }
                Ee8d2j4S9Vm5yGuR();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean w9sT1Swbhx3hs() {
        boolean z;
        synchronized (this.dDIMxZXP1V8HdM) {
            z = this.vekpFI4d1Nc4fakF > 0;
        }
        return z;
    }
}
