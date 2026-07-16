package v.s;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class RYW6r6dK10fdDcUQ implements ServiceConnection {
    public PLm4PBpN2BvxERlF4xtd Ee8d2j4S9Vm5yGuR;
    public final ArrayDeque JXn4Qf7zpnLjP5;
    public final Context dDIMxZXP1V8HdM;
    public final ScheduledThreadPoolExecutor vekpFI4d1Nc4fakF;
    public final Intent w9sT1Swbhx3hs;
    public boolean xDyLpEZyrcKVe0;

    public RYW6r6dK10fdDcUQ(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new okZcyTTNtG3Y("Firebase-FirebaseInstanceIdServiceConnection"));
        this.JXn4Qf7zpnLjP5 = new ArrayDeque();
        this.xDyLpEZyrcKVe0 = false;
        Context applicationContext = context.getApplicationContext();
        this.dDIMxZXP1V8HdM = applicationContext;
        this.w9sT1Swbhx3hs = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.vekpFI4d1Nc4fakF = scheduledThreadPoolExecutor;
    }

    private static /* synthetic */ void sxin() {
    }

    public final synchronized void dDIMxZXP1V8HdM() throws Throwable {
        RYW6r6dK10fdDcUQ rYW6r6dK10fdDcUQ;
        while (!this.JXn4Qf7zpnLjP5.isEmpty()) {
            try {
                try {
                    PLm4PBpN2BvxERlF4xtd pLm4PBpN2BvxERlF4xtd = this.Ee8d2j4S9Vm5yGuR;
                    if (pLm4PBpN2BvxERlF4xtd == null || !pLm4PBpN2BvxERlF4xtd.isBinderAlive()) {
                        if (!this.xDyLpEZyrcKVe0) {
                            this.xDyLpEZyrcKVe0 = true;
                            try {
                                r5XEUfod5GSCCwq6c r5xeufod5gsccwq6cD5P1xCAyuvgF = r5XEUfod5GSCCwq6c.D5P1xCAyuvgF();
                                Context context = this.dDIMxZXP1V8HdM;
                                rYW6r6dK10fdDcUQ = this;
                                try {
                                    if (!r5xeufod5gsccwq6cD5P1xCAyuvgF.xfn2GJwmGqs7kWW(context, context.getClass().getName(), this.w9sT1Swbhx3hs, rYW6r6dK10fdDcUQ, 65)) {
                                        rYW6r6dK10fdDcUQ.xDyLpEZyrcKVe0 = false;
                                        ArrayDeque arrayDeque = rYW6r6dK10fdDcUQ.JXn4Qf7zpnLjP5;
                                        while (!arrayDeque.isEmpty()) {
                                            ((gORGwV1UC2rtv3txmCK) arrayDeque.poll()).w9sT1Swbhx3hs.vekpFI4d1Nc4fakF(null);
                                        }
                                    }
                                } catch (SecurityException unused) {
                                }
                            } catch (SecurityException unused2) {
                                rYW6r6dK10fdDcUQ = this;
                            }
                        }
                        return;
                    }
                    this.Ee8d2j4S9Vm5yGuR.dDIMxZXP1V8HdM((gORGwV1UC2rtv3txmCK) this.JXn4Qf7zpnLjP5.poll());
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Objects.toString(componentName);
            }
            this.xDyLpEZyrcKVe0 = false;
            if (iBinder instanceof PLm4PBpN2BvxERlF4xtd) {
                this.Ee8d2j4S9Vm5yGuR = (PLm4PBpN2BvxERlF4xtd) iBinder;
                dDIMxZXP1V8HdM();
            } else {
                Objects.toString(iBinder);
                ArrayDeque arrayDeque = this.JXn4Qf7zpnLjP5;
                while (!arrayDeque.isEmpty()) {
                    ((gORGwV1UC2rtv3txmCK) arrayDeque.poll()).w9sT1Swbhx3hs.vekpFI4d1Nc4fakF(null);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) throws Throwable {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Objects.toString(componentName);
        }
        dDIMxZXP1V8HdM();
    }

    public final synchronized SQzPENpgvzKX9IlD w9sT1Swbhx3hs(Intent intent) {
        gORGwV1UC2rtv3txmCK gorgwv1uc2rtv3txmck;
        gorgwv1uc2rtv3txmck = new gORGwV1UC2rtv3txmCK(intent);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.vekpFI4d1Nc4fakF;
        gorgwv1uc2rtv3txmck.w9sT1Swbhx3hs.dDIMxZXP1V8HdM.dDIMxZXP1V8HdM(scheduledThreadPoolExecutor, new rA0nQJPukyMi(10, scheduledThreadPoolExecutor.schedule(new hzCVl0f866ksvpzUUql(18, gorgwv1uc2rtv3txmck), 20L, TimeUnit.SECONDS)));
        this.JXn4Qf7zpnLjP5.add(gorgwv1uc2rtv3txmck);
        dDIMxZXP1V8HdM();
        return gorgwv1uc2rtv3txmck.w9sT1Swbhx3hs.dDIMxZXP1V8HdM;
    }
}
