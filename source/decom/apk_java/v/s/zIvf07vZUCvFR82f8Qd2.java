package v.s;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class zIvf07vZUCvFR82f8Qd2 implements Runnable {
    public static Boolean b1EoSIRjJHO5;
    public static final Object ibVTtJUNfrGYbW = new Object();
    public static Boolean pyu8ovAipBTLYAiKab;
    public final g3SNBiUFGCDVZ1c Ee8d2j4S9Vm5yGuR;
    public final PowerManager.WakeLock JXn4Qf7zpnLjP5;
    public final EPXwpnHeMDtvkKf vekpFI4d1Nc4fakF;
    public final Context w9sT1Swbhx3hs;
    public final long xDyLpEZyrcKVe0;

    public zIvf07vZUCvFR82f8Qd2(g3SNBiUFGCDVZ1c g3snbiufgcdvz1c, Context context, EPXwpnHeMDtvkKf ePXwpnHeMDtvkKf, long j) {
        this.Ee8d2j4S9Vm5yGuR = g3snbiufgcdvz1c;
        this.w9sT1Swbhx3hs = context;
        this.xDyLpEZyrcKVe0 = j;
        this.vekpFI4d1Nc4fakF = ePXwpnHeMDtvkKf;
        this.JXn4Qf7zpnLjP5 = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean dDIMxZXP1V8HdM(Context context) {
        boolean zBooleanValue;
        synchronized (ibVTtJUNfrGYbW) {
            try {
                Boolean bool = pyu8ovAipBTLYAiKab;
                if (bool == null && bool == null) {
                    zBooleanValue = context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0;
                } else {
                    zBooleanValue = bool.booleanValue();
                }
                pyu8ovAipBTLYAiKab = Boolean.valueOf(zBooleanValue);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public static boolean w9sT1Swbhx3hs(Context context) {
        boolean zBooleanValue;
        synchronized (ibVTtJUNfrGYbW) {
            try {
                Boolean bool = b1EoSIRjJHO5;
                if (bool == null && bool == null) {
                    zBooleanValue = context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0;
                } else {
                    zBooleanValue = bool.booleanValue();
                }
                b1EoSIRjJHO5 = Boolean.valueOf(zBooleanValue);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    private static /* synthetic */ void ygfntiyf() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        g3SNBiUFGCDVZ1c g3snbiufgcdvz1c = this.Ee8d2j4S9Vm5yGuR;
        Context context = this.w9sT1Swbhx3hs;
        boolean zW9sT1Swbhx3hs = w9sT1Swbhx3hs(context);
        PowerManager.WakeLock wakeLock = this.JXn4Qf7zpnLjP5;
        if (zW9sT1Swbhx3hs) {
            wakeLock.acquire(ywGItlsX97pjy8fc.dDIMxZXP1V8HdM);
        }
        try {
            try {
                try {
                    g3snbiufgcdvz1c.JXn4Qf7zpnLjP5(true);
                    if (!this.vekpFI4d1Nc4fakF.vekpFI4d1Nc4fakF()) {
                        g3snbiufgcdvz1c.JXn4Qf7zpnLjP5(false);
                        if (w9sT1Swbhx3hs(context)) {
                            try {
                                wakeLock.release();
                                return;
                            } catch (RuntimeException unused) {
                                return;
                            }
                        }
                        return;
                    }
                    if (!dDIMxZXP1V8HdM(context) || vekpFI4d1Nc4fakF()) {
                        if (g3snbiufgcdvz1c.Ee8d2j4S9Vm5yGuR()) {
                            g3snbiufgcdvz1c.JXn4Qf7zpnLjP5(false);
                        } else {
                            g3snbiufgcdvz1c.xDyLpEZyrcKVe0(this.xDyLpEZyrcKVe0);
                        }
                        if (w9sT1Swbhx3hs(context)) {
                            wakeLock.release();
                            return;
                        }
                        return;
                    }
                    Dz88e0bCaARB dz88e0bCaARB = new Dz88e0bCaARB();
                    dz88e0bCaARB.dDIMxZXP1V8HdM = this;
                    context.registerReceiver(dz88e0bCaARB, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    if (w9sT1Swbhx3hs(context)) {
                        try {
                            wakeLock.release();
                        } catch (RuntimeException unused2) {
                        }
                    }
                } catch (RuntimeException unused3) {
                }
            } catch (IOException e) {
                e.getMessage();
                g3snbiufgcdvz1c.JXn4Qf7zpnLjP5(false);
                if (w9sT1Swbhx3hs(context)) {
                    wakeLock.release();
                }
            }
        } catch (Throwable th) {
            if (w9sT1Swbhx3hs(context)) {
                try {
                    wakeLock.release();
                } catch (RuntimeException unused4) {
                }
            }
            throw th;
        }
    }

    public final synchronized boolean vekpFI4d1Nc4fakF() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.w9sT1Swbhx3hs.getSystemService("connectivity");
            activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        } catch (Throwable th) {
            throw th;
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
