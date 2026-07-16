package v.s;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class DBz5KzDJzqYVg1s implements Handler.Callback {
    public static DBz5KzDJzqYVg1s MLSIo1htfMPWeB8V876L;
    public final ConcurrentHashMap D5P1xCAyuvgF;
    public final Context Ee8d2j4S9Vm5yGuR;
    public ny2QaoAAyfdnXseU2mn JXn4Qf7zpnLjP5;
    public final AtomicInteger b1EoSIRjJHO5;
    public long dDIMxZXP1V8HdM;
    public final iFLJbvrqroccc6 gIIiyi2ddlMDR0;
    public final EngrEbdti60lW gmNWMfvn6zlEj;
    public final EngrEbdti60lW hjneShqpF9Tis4;
    public final Hnsrhf2jJV8dCt ibVTtJUNfrGYbW;
    public final AtomicInteger pyu8ovAipBTLYAiKab;
    public N3OQwXegjg1zeRF vekpFI4d1Nc4fakF;
    public boolean w9sT1Swbhx3hs;
    public volatile boolean wotphlvK9sPbXJ;
    public final a4Aq5QBZFai3VwgjU xDyLpEZyrcKVe0;
    public static final Status Qrz92kRPw4GcghAc = new Status("Sign-out occurred while this API call was in progress.", 4);
    public static final Status nQilHWaqS401ZtR = new Status("The user must be signed in to make this API call.", 4);
    public static final Object J0zjQ7CAgohuxU20eCW6 = new Object();

    public DBz5KzDJzqYVg1s(Context context, Looper looper) {
        a4Aq5QBZFai3VwgjU a4aq5qbzfai3vwgju = a4Aq5QBZFai3VwgjU.vekpFI4d1Nc4fakF;
        this.dDIMxZXP1V8HdM = 10000L;
        this.w9sT1Swbhx3hs = false;
        this.b1EoSIRjJHO5 = new AtomicInteger(1);
        this.pyu8ovAipBTLYAiKab = new AtomicInteger(0);
        this.D5P1xCAyuvgF = new ConcurrentHashMap(5, 0.75f, 1);
        this.hjneShqpF9Tis4 = new EngrEbdti60lW(0);
        this.gmNWMfvn6zlEj = new EngrEbdti60lW(0);
        this.wotphlvK9sPbXJ = true;
        this.Ee8d2j4S9Vm5yGuR = context;
        iFLJbvrqroccc6 ifljbvrqroccc6 = new iFLJbvrqroccc6(looper, this);
        this.gIIiyi2ddlMDR0 = ifljbvrqroccc6;
        this.xDyLpEZyrcKVe0 = a4aq5qbzfai3vwgju;
        a4Aq5QBZFai3VwgjU a4aq5qbzfai3vwgju2 = a4Aq5QBZFai3VwgjU.vekpFI4d1Nc4fakF;
        Hnsrhf2jJV8dCt hnsrhf2jJV8dCt = new Hnsrhf2jJV8dCt();
        hnsrhf2jJV8dCt.w9sT1Swbhx3hs = new SparseIntArray();
        hnsrhf2jJV8dCt.vekpFI4d1Nc4fakF = a4aq5qbzfai3vwgju2;
        this.ibVTtJUNfrGYbW = hnsrhf2jJV8dCt;
        PackageManager packageManager = context.getPackageManager();
        if (okc5AGRjqrud84oM6d.pyu8ovAipBTLYAiKab == null) {
            okc5AGRjqrud84oM6d.pyu8ovAipBTLYAiKab = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (okc5AGRjqrud84oM6d.pyu8ovAipBTLYAiKab.booleanValue()) {
            this.wotphlvK9sPbXJ = false;
        }
        ifljbvrqroccc6.sendMessage(ifljbvrqroccc6.obtainMessage(6));
    }

    public static DBz5KzDJzqYVg1s JXn4Qf7zpnLjP5(Context context) {
        DBz5KzDJzqYVg1s dBz5KzDJzqYVg1s;
        HandlerThread handlerThread;
        synchronized (J0zjQ7CAgohuxU20eCW6) {
            if (MLSIo1htfMPWeB8V876L == null) {
                synchronized (MPPGXLipja3aW.ibVTtJUNfrGYbW) {
                    try {
                        handlerThread = MPPGXLipja3aW.pyu8ovAipBTLYAiKab;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            MPPGXLipja3aW.pyu8ovAipBTLYAiKab = handlerThread2;
                            handlerThread2.start();
                            handlerThread = MPPGXLipja3aW.pyu8ovAipBTLYAiKab;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = a4Aq5QBZFai3VwgjU.w9sT1Swbhx3hs;
                MLSIo1htfMPWeB8V876L = new DBz5KzDJzqYVg1s(applicationContext, looper);
            }
            dBz5KzDJzqYVg1s = MLSIo1htfMPWeB8V876L;
        }
        return dBz5KzDJzqYVg1s;
    }

    private static /* synthetic */ void fvpqoubj() {
    }

    public static Status w9sT1Swbhx3hs(uW0IRoPBZMj2QmBkkp uw0iropbzmj2qmbkkp, nyZDwrpXoi7nqMd nyzdwrpxoi7nqmd) {
        String str = (String) uw0iropbzmj2qmbkkp.w9sT1Swbhx3hs.vekpFI4d1Nc4fakF;
        String strValueOf = String.valueOf(nyzdwrpxoi7nqmd);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + strValueOf.length());
        sb.append("API: ");
        sb.append(str);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(strValueOf);
        return new Status(1, 17, sb.toString(), nyzdwrpxoi7nqmd.JXn4Qf7zpnLjP5, nyzdwrpxoi7nqmd);
    }

    public final void Ee8d2j4S9Vm5yGuR(nyZDwrpXoi7nqMd nyzdwrpxoi7nqmd, int i) {
        if (dDIMxZXP1V8HdM(nyzdwrpxoi7nqmd, i)) {
            return;
        }
        iFLJbvrqroccc6 ifljbvrqroccc6 = this.gIIiyi2ddlMDR0;
        ifljbvrqroccc6.sendMessage(ifljbvrqroccc6.obtainMessage(5, i, 0, nyzdwrpxoi7nqmd));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.content.Intent] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v6 */
    public final boolean dDIMxZXP1V8HdM(nyZDwrpXoi7nqMd nyzdwrpxoi7nqmd, int i) {
        boolean zBooleanValue;
        PendingIntent activity;
        Boolean bool;
        a4Aq5QBZFai3VwgjU a4aq5qbzfai3vwgju = this.xDyLpEZyrcKVe0;
        Context context = this.Ee8d2j4S9Vm5yGuR;
        a4aq5qbzfai3vwgju.getClass();
        synchronized (okc5AGRjqrud84oM6d.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = okc5AGRjqrud84oM6d.dDIMxZXP1V8HdM;
            if (context2 == null || (bool = okc5AGRjqrud84oM6d.w9sT1Swbhx3hs) == null || context2 != applicationContext) {
                okc5AGRjqrud84oM6d.w9sT1Swbhx3hs = null;
                boolean zIsInstantApp = applicationContext.getPackageManager().isInstantApp();
                okc5AGRjqrud84oM6d.w9sT1Swbhx3hs = Boolean.valueOf(zIsInstantApp);
                okc5AGRjqrud84oM6d.dDIMxZXP1V8HdM = applicationContext;
                zBooleanValue = zIsInstantApp;
            } else {
                zBooleanValue = bool.booleanValue();
            }
        }
        if (!zBooleanValue) {
            int i2 = nyzdwrpxoi7nqmd.vekpFI4d1Nc4fakF;
            ?? r4 = 98 - 97;
            if (((i2 == 0 || nyzdwrpxoi7nqmd.JXn4Qf7zpnLjP5 == null) ? 0 : r4) != 0) {
                activity = nyzdwrpxoi7nqmd.JXn4Qf7zpnLjP5;
            } else {
                Intent intentDDIMxZXP1V8HdM = a4aq5qbzfai3vwgju.dDIMxZXP1V8HdM(i2, context, null);
                activity = intentDDIMxZXP1V8HdM != null ? PendingIntent.getActivity(context, 0, intentDDIMxZXP1V8HdM, 201326592) : null;
            }
            if (activity != null) {
                int i3 = nyzdwrpxoi7nqmd.vekpFI4d1Nc4fakF;
                int i4 = GoogleApiActivity.w9sT1Swbhx3hs;
                ?? intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", r4);
                a4aq5qbzfai3vwgju.xDyLpEZyrcKVe0(context, i3, PendingIntent.getActivity(context, 0, intent, uHUbtcxz6RtCYDztja.dDIMxZXP1V8HdM | 134217728));
                return r4;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:192:0x0382  */
    /* JADX WARN: Code duplicated, block: B:194:0x038d  */
    /* JADX WARN: Code duplicated, block: B:196:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:198:0x03df  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:50:0x00be  */
    /* JADX WARN: Code duplicated, block: B:79:0x012f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0133  */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i;
        ZOu84RhGdb62AhIs[] zOu84RhGdb62AhIsArrW9sT1Swbhx3hs;
        fadfsJa4iEdiwEC4Xm8 fadfsja4iediwec4xm8;
        fadfsJa4iEdiwEC4Xm8 fadfsja4iediwec4xm9;
        Context context = this.Ee8d2j4S9Vm5yGuR;
        EngrEbdti60lW engrEbdti60lW = this.gmNWMfvn6zlEj;
        iFLJbvrqroccc6 ifljbvrqroccc6 = this.gIIiyi2ddlMDR0;
        ConcurrentHashMap concurrentHashMap = this.D5P1xCAyuvgF;
        int i2 = (-66) + 65;
        eJzD6jrSBjwYspq ejzd6jrsbjwyspq = null;
        int i3 = 0;
        switch (message.what) {
            case 1:
                this.dDIMxZXP1V8HdM = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                ifljbvrqroccc6.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    ifljbvrqroccc6.sendMessageDelayed(ifljbvrqroccc6.obtainMessage(12, (uW0IRoPBZMj2QmBkkp) it.next()), this.dDIMxZXP1V8HdM);
                }
                return true;
            case 2:
                message.obj.getClass();
                throw new ClassCastException();
            case 3:
                for (eJzD6jrSBjwYspq ejzd6jrsbjwyspq2 : concurrentHashMap.values()) {
                    SbxdZ6Kq2uhHQ5RPRqm.JXn4Qf7zpnLjP5(ejzd6jrsbjwyspq2.wotphlvK9sPbXJ.gIIiyi2ddlMDR0);
                    ejzd6jrsbjwyspq2.gIIiyi2ddlMDR0 = null;
                    ejzd6jrsbjwyspq2.gIIiyi2ddlMDR0();
                }
                return true;
            case 4:
            case 8:
            case 13:
                yaw9gSarozwmk yaw9gsarozwmk = (yaw9gSarozwmk) message.obj;
                ny2QaoAAyfdnXseU2mn ny2qaoaayfdnxseu2mn = yaw9gsarozwmk.vekpFI4d1Nc4fakF;
                udvnM2Z9rzwC32 udvnm2z9rzwc32 = yaw9gsarozwmk.dDIMxZXP1V8HdM;
                eJzD6jrSBjwYspq ejzd6jrsbjwyspqVekpFI4d1Nc4fakF = (eJzD6jrSBjwYspq) concurrentHashMap.get(ny2qaoaayfdnxseu2mn.Ee8d2j4S9Vm5yGuR);
                if (ejzd6jrsbjwyspqVekpFI4d1Nc4fakF == null) {
                    ejzd6jrsbjwyspqVekpFI4d1Nc4fakF = vekpFI4d1Nc4fakF(yaw9gsarozwmk.vekpFI4d1Nc4fakF);
                }
                if (!ejzd6jrsbjwyspqVekpFI4d1Nc4fakF.Ee8d2j4S9Vm5yGuR.gIIiyi2ddlMDR0() || this.pyu8ovAipBTLYAiKab.get() == yaw9gsarozwmk.w9sT1Swbhx3hs) {
                    ejzd6jrsbjwyspqVekpFI4d1Nc4fakF.wotphlvK9sPbXJ(udvnm2z9rzwc32);
                    return true;
                }
                udvnm2z9rzwc32.vekpFI4d1Nc4fakF(Qrz92kRPw4GcghAc);
                ejzd6jrsbjwyspqVekpFI4d1Nc4fakF.nQilHWaqS401ZtR();
                return true;
            case 5:
                int i4 = message.arg1;
                nyZDwrpXoi7nqMd nyzdwrpxoi7nqmd = (nyZDwrpXoi7nqMd) message.obj;
                for (eJzD6jrSBjwYspq ejzd6jrsbjwyspq3 : concurrentHashMap.values()) {
                    if (ejzd6jrsbjwyspq3.D5P1xCAyuvgF == i4) {
                        ejzd6jrsbjwyspq = ejzd6jrsbjwyspq3;
                        if (ejzd6jrsbjwyspq != null) {
                            new Exception();
                            return true;
                        }
                        i = nyzdwrpxoi7nqmd.vekpFI4d1Nc4fakF;
                        if (i == 5 + 8) {
                            ejzd6jrsbjwyspq.Ee8d2j4S9Vm5yGuR(w9sT1Swbhx3hs(ejzd6jrsbjwyspq.xDyLpEZyrcKVe0, nyzdwrpxoi7nqmd));
                            return true;
                        }
                        this.xDyLpEZyrcKVe0.getClass();
                        int i5 = WUKu8Lj5A4IfwZ.vekpFI4d1Nc4fakF;
                        String strDDIMxZXP1V8HdM = nyZDwrpXoi7nqMd.dDIMxZXP1V8HdM(i);
                        String str = nyzdwrpxoi7nqmd.Ee8d2j4S9Vm5yGuR;
                        StringBuilder sb = new StringBuilder(String.valueOf(strDDIMxZXP1V8HdM).length() + 69 + String.valueOf(str).length());
                        sb.append("Error resolution was canceled by the user, original error message: ");
                        sb.append(strDDIMxZXP1V8HdM);
                        sb.append(": ");
                        sb.append(str);
                        ejzd6jrsbjwyspq.Ee8d2j4S9Vm5yGuR(new Status(sb.toString(), 17));
                        return true;
                    }
                }
                if (ejzd6jrsbjwyspq != null) {
                    new Exception();
                    return true;
                }
                i = nyzdwrpxoi7nqmd.vekpFI4d1Nc4fakF;
                if (i == 5 + 8) {
                    ejzd6jrsbjwyspq.Ee8d2j4S9Vm5yGuR(w9sT1Swbhx3hs(ejzd6jrsbjwyspq.xDyLpEZyrcKVe0, nyzdwrpxoi7nqmd));
                    return true;
                }
                this.xDyLpEZyrcKVe0.getClass();
                int i6 = WUKu8Lj5A4IfwZ.vekpFI4d1Nc4fakF;
                String strDDIMxZXP1V8HdM2 = nyZDwrpXoi7nqMd.dDIMxZXP1V8HdM(i);
                String str2 = nyzdwrpxoi7nqmd.Ee8d2j4S9Vm5yGuR;
                StringBuilder sb2 = new StringBuilder(String.valueOf(strDDIMxZXP1V8HdM2).length() + 69 + String.valueOf(str2).length());
                sb2.append("Error resolution was canceled by the user, original error message: ");
                sb2.append(strDDIMxZXP1V8HdM2);
                sb2.append(": ");
                sb2.append(str2);
                ejzd6jrsbjwyspq.Ee8d2j4S9Vm5yGuR(new Status(sb2.toString(), 17));
                return true;
            case 6:
                if (context.getApplicationContext() instanceof Application) {
                    q4Slktv7UWOUPeddxQd.dDIMxZXP1V8HdM((Application) context.getApplicationContext());
                    q4Slktv7UWOUPeddxQd q4slktv7uwoupeddxqd = q4Slktv7UWOUPeddxQd.Ee8d2j4S9Vm5yGuR;
                    NU8wPWN7el1l nU8wPWN7el1l = new NU8wPWN7el1l(this);
                    q4slktv7uwoupeddxqd.getClass();
                    synchronized (q4slktv7uwoupeddxqd) {
                        q4slktv7uwoupeddxqd.vekpFI4d1Nc4fakF.add(nU8wPWN7el1l);
                        break;
                    }
                    AtomicBoolean atomicBoolean = q4slktv7uwoupeddxqd.dDIMxZXP1V8HdM;
                    AtomicBoolean atomicBoolean2 = q4slktv7uwoupeddxqd.w9sT1Swbhx3hs;
                    if (!atomicBoolean2.get()) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!atomicBoolean2.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            atomicBoolean.set(true);
                        }
                    }
                    if (!atomicBoolean.get()) {
                        this.dDIMxZXP1V8HdM = 300000L;
                        return true;
                    }
                }
                return true;
            case 7:
                vekpFI4d1Nc4fakF((ny2QaoAAyfdnXseU2mn) message.obj);
                return true;
            case 9:
                if (concurrentHashMap.containsKey(message.obj)) {
                    eJzD6jrSBjwYspq ejzd6jrsbjwyspq4 = (eJzD6jrSBjwYspq) concurrentHashMap.get(message.obj);
                    SbxdZ6Kq2uhHQ5RPRqm.JXn4Qf7zpnLjP5(ejzd6jrsbjwyspq4.wotphlvK9sPbXJ.gIIiyi2ddlMDR0);
                    if (ejzd6jrsbjwyspq4.hjneShqpF9Tis4) {
                        ejzd6jrsbjwyspq4.gIIiyi2ddlMDR0();
                        return true;
                    }
                }
                return true;
            case 10:
                Iterator it2 = engrEbdti60lW.iterator();
                while (true) {
                    s6dVouOner1Ow s6dvouoner1ow = (s6dVouOner1Ow) it2;
                    if (!s6dvouoner1ow.hasNext()) {
                        engrEbdti60lW.clear();
                        return true;
                    }
                    eJzD6jrSBjwYspq ejzd6jrsbjwyspq5 = (eJzD6jrSBjwYspq) concurrentHashMap.remove((uW0IRoPBZMj2QmBkkp) s6dvouoner1ow.next());
                    if (ejzd6jrsbjwyspq5 != null) {
                        ejzd6jrsbjwyspq5.nQilHWaqS401ZtR();
                    }
                }
                break;
            case 11:
                if (concurrentHashMap.containsKey(message.obj)) {
                    eJzD6jrSBjwYspq ejzd6jrsbjwyspq6 = (eJzD6jrSBjwYspq) concurrentHashMap.get(message.obj);
                    DBz5KzDJzqYVg1s dBz5KzDJzqYVg1s = ejzd6jrsbjwyspq6.wotphlvK9sPbXJ;
                    SbxdZ6Kq2uhHQ5RPRqm.JXn4Qf7zpnLjP5(dBz5KzDJzqYVg1s.gIIiyi2ddlMDR0);
                    boolean z = ejzd6jrsbjwyspq6.hjneShqpF9Tis4;
                    if (z) {
                        uW0IRoPBZMj2QmBkkp uw0iropbzmj2qmbkkp = ejzd6jrsbjwyspq6.xDyLpEZyrcKVe0;
                        iFLJbvrqroccc6 ifljbvrqroccc7 = ejzd6jrsbjwyspq6.wotphlvK9sPbXJ.gIIiyi2ddlMDR0;
                        if (z) {
                            ifljbvrqroccc7.removeMessages(11, uw0iropbzmj2qmbkkp);
                            ifljbvrqroccc7.removeMessages(9, uw0iropbzmj2qmbkkp);
                            ejzd6jrsbjwyspq6.hjneShqpF9Tis4 = false;
                        }
                        ejzd6jrsbjwyspq6.Ee8d2j4S9Vm5yGuR(dBz5KzDJzqYVg1s.xDyLpEZyrcKVe0.w9sT1Swbhx3hs(dBz5KzDJzqYVg1s.Ee8d2j4S9Vm5yGuR, eIfkxafADHUOlFqb.dDIMxZXP1V8HdM) == 21 + (-3) ? new Status("Connection timed out waiting for Google Play services update to complete.", 21) : new Status("API failed to connect while resuming due to an unknown error.", 22));
                        ejzd6jrsbjwyspq6.Ee8d2j4S9Vm5yGuR.xDyLpEZyrcKVe0("Timing out connection while resuming.");
                        return true;
                    }
                }
                return true;
            case 12:
                if (concurrentHashMap.containsKey(message.obj)) {
                    eJzD6jrSBjwYspq ejzd6jrsbjwyspq7 = (eJzD6jrSBjwYspq) concurrentHashMap.get(message.obj);
                    SbxdZ6Kq2uhHQ5RPRqm.JXn4Qf7zpnLjP5(ejzd6jrsbjwyspq7.wotphlvK9sPbXJ.gIIiyi2ddlMDR0);
                    K5l5kmuyJzrgUX k5l5kmuyJzrgUX = ejzd6jrsbjwyspq7.Ee8d2j4S9Vm5yGuR;
                    if (k5l5kmuyJzrgUX.dDIMxZXP1V8HdM() && ejzd6jrsbjwyspq7.pyu8ovAipBTLYAiKab.size() == 0) {
                        IXBvAqS2fpdIRK iXBvAqS2fpdIRK = ejzd6jrsbjwyspq7.ibVTtJUNfrGYbW;
                        if (((Map) iXBvAqS2fpdIRK.w9sT1Swbhx3hs).isEmpty() && ((Map) iXBvAqS2fpdIRK.vekpFI4d1Nc4fakF).isEmpty()) {
                            k5l5kmuyJzrgUX.xDyLpEZyrcKVe0("Timing out service connection.");
                            return true;
                        }
                        ejzd6jrsbjwyspq7.D5P1xCAyuvgF();
                        return true;
                    }
                }
                return true;
            case 14:
                message.obj.getClass();
                throw new ClassCastException();
            case 15:
                obPVwzN78doH4L0 obpvwzn78doh4l0 = (obPVwzN78doH4L0) message.obj;
                if (concurrentHashMap.containsKey(obpvwzn78doh4l0.dDIMxZXP1V8HdM)) {
                    eJzD6jrSBjwYspq ejzd6jrsbjwyspq8 = (eJzD6jrSBjwYspq) concurrentHashMap.get(obpvwzn78doh4l0.dDIMxZXP1V8HdM);
                    if (ejzd6jrsbjwyspq8.gmNWMfvn6zlEj.contains(obpvwzn78doh4l0) && !ejzd6jrsbjwyspq8.hjneShqpF9Tis4) {
                        if (ejzd6jrsbjwyspq8.Ee8d2j4S9Vm5yGuR.dDIMxZXP1V8HdM()) {
                            ejzd6jrsbjwyspq8.ibVTtJUNfrGYbW();
                            return true;
                        }
                        ejzd6jrsbjwyspq8.gIIiyi2ddlMDR0();
                        return true;
                    }
                }
                return true;
            case 16:
                obPVwzN78doH4L0 obpvwzn78doh4l1 = (obPVwzN78doH4L0) message.obj;
                if (concurrentHashMap.containsKey(obpvwzn78doh4l1.dDIMxZXP1V8HdM)) {
                    eJzD6jrSBjwYspq ejzd6jrsbjwyspq9 = (eJzD6jrSBjwYspq) concurrentHashMap.get(obpvwzn78doh4l1.dDIMxZXP1V8HdM);
                    ArrayList arrayList = ejzd6jrsbjwyspq9.gmNWMfvn6zlEj;
                    DBz5KzDJzqYVg1s dBz5KzDJzqYVg1s2 = ejzd6jrsbjwyspq9.wotphlvK9sPbXJ;
                    LinkedList<IAoJ6MjurI42ZsE> linkedList = ejzd6jrsbjwyspq9.JXn4Qf7zpnLjP5;
                    if (arrayList.remove(obpvwzn78doh4l1)) {
                        dBz5KzDJzqYVg1s2.gIIiyi2ddlMDR0.removeMessages(15, obpvwzn78doh4l1);
                        dBz5KzDJzqYVg1s2.gIIiyi2ddlMDR0.removeMessages(16, obpvwzn78doh4l1);
                        ZOu84RhGdb62AhIs zOu84RhGdb62AhIs = obpvwzn78doh4l1.w9sT1Swbhx3hs;
                        ArrayList arrayList2 = new ArrayList(linkedList.size());
                        for (IAoJ6MjurI42ZsE iAoJ6MjurI42ZsE : linkedList) {
                            if (iAoJ6MjurI42ZsE != null && (zOu84RhGdb62AhIsArrW9sT1Swbhx3hs = iAoJ6MjurI42ZsE.w9sT1Swbhx3hs(ejzd6jrsbjwyspq9)) != null) {
                                int length = zOu84RhGdb62AhIsArrW9sT1Swbhx3hs.length;
                                for (int i7 = 0; i7 < length; i7++) {
                                    if (OFtLBiBbrrTHWu.gIIiyi2ddlMDR0(zOu84RhGdb62AhIsArrW9sT1Swbhx3hs[i7], zOu84RhGdb62AhIs)) {
                                        if (i7 < 0) {
                                        }
                                        arrayList2.add(iAoJ6MjurI42ZsE);
                                    }
                                    break;
                                }
                            }
                        }
                        int size = arrayList2.size();
                        while (i3 < size) {
                            IAoJ6MjurI42ZsE iAoJ6MjurI42ZsE2 = (IAoJ6MjurI42ZsE) arrayList2.get(i3);
                            linkedList.remove(iAoJ6MjurI42ZsE2);
                            iAoJ6MjurI42ZsE2.JXn4Qf7zpnLjP5(new zRCKG8cSSr4p(zOu84RhGdb62AhIs));
                            i3++;
                        }
                    }
                }
                return true;
            case 17:
                N3OQwXegjg1zeRF n3OQwXegjg1zeRF = this.vekpFI4d1Nc4fakF;
                if (n3OQwXegjg1zeRF != null) {
                    if (n3OQwXegjg1zeRF.w9sT1Swbhx3hs > 0) {
                        if (this.JXn4Qf7zpnLjP5 == null) {
                            this.JXn4Qf7zpnLjP5 = new ny2QaoAAyfdnXseU2mn(this.Ee8d2j4S9Vm5yGuR, ny2QaoAAyfdnXseU2mn.pyu8ovAipBTLYAiKab, yRLsxLigSiPhRQHp.w9sT1Swbhx3hs);
                        }
                        this.JXn4Qf7zpnLjP5.dDIMxZXP1V8HdM(n3OQwXegjg1zeRF);
                    } else if (!this.w9sT1Swbhx3hs) {
                        synchronized (fadfsJa4iEdiwEC4Xm8.class) {
                            try {
                                if (fadfsJa4iEdiwEC4Xm8.vekpFI4d1Nc4fakF == null) {
                                    fadfsJa4iEdiwEC4Xm8.vekpFI4d1Nc4fakF = new fadfsJa4iEdiwEC4Xm8(i3);
                                }
                                fadfsja4iediwec4xm8 = fadfsJa4iEdiwEC4Xm8.vekpFI4d1Nc4fakF;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        fadfsja4iediwec4xm8.getClass();
                        int i8 = ((SparseIntArray) this.ibVTtJUNfrGYbW.w9sT1Swbhx3hs).get(203400000, i2);
                        if (i8 == i2 || i8 == 0) {
                            if (this.JXn4Qf7zpnLjP5 == null) {
                                this.JXn4Qf7zpnLjP5 = new ny2QaoAAyfdnXseU2mn(this.Ee8d2j4S9Vm5yGuR, ny2QaoAAyfdnXseU2mn.pyu8ovAipBTLYAiKab, yRLsxLigSiPhRQHp.w9sT1Swbhx3hs);
                            }
                            this.JXn4Qf7zpnLjP5.dDIMxZXP1V8HdM(n3OQwXegjg1zeRF);
                        }
                    }
                    this.vekpFI4d1Nc4fakF = null;
                    return true;
                }
                return true;
            case 18:
                ((WNYzVfkLqBOl) message.obj).getClass();
                if (0 == 0) {
                    N3OQwXegjg1zeRF n3OQwXegjg1zeRF2 = new N3OQwXegjg1zeRF(0, Arrays.asList(null));
                    if (this.JXn4Qf7zpnLjP5 == null) {
                        this.JXn4Qf7zpnLjP5 = new ny2QaoAAyfdnXseU2mn(this.Ee8d2j4S9Vm5yGuR, ny2QaoAAyfdnXseU2mn.pyu8ovAipBTLYAiKab, yRLsxLigSiPhRQHp.w9sT1Swbhx3hs);
                    }
                    this.JXn4Qf7zpnLjP5.dDIMxZXP1V8HdM(n3OQwXegjg1zeRF2);
                    return true;
                }
                N3OQwXegjg1zeRF n3OQwXegjg1zeRF3 = this.vekpFI4d1Nc4fakF;
                if (n3OQwXegjg1zeRF3 != null) {
                    List list = n3OQwXegjg1zeRF3.vekpFI4d1Nc4fakF;
                    if (n3OQwXegjg1zeRF3.w9sT1Swbhx3hs != 0 || (list != null && list.size() >= 0)) {
                        ifljbvrqroccc6.removeMessages(17);
                        N3OQwXegjg1zeRF n3OQwXegjg1zeRF4 = this.vekpFI4d1Nc4fakF;
                        if (n3OQwXegjg1zeRF4 != null) {
                            if (n3OQwXegjg1zeRF4.w9sT1Swbhx3hs > 0) {
                                if (this.JXn4Qf7zpnLjP5 == null) {
                                    this.JXn4Qf7zpnLjP5 = new ny2QaoAAyfdnXseU2mn(this.Ee8d2j4S9Vm5yGuR, ny2QaoAAyfdnXseU2mn.pyu8ovAipBTLYAiKab, yRLsxLigSiPhRQHp.w9sT1Swbhx3hs);
                                }
                                this.JXn4Qf7zpnLjP5.dDIMxZXP1V8HdM(n3OQwXegjg1zeRF4);
                            } else if (!this.w9sT1Swbhx3hs) {
                                synchronized (fadfsJa4iEdiwEC4Xm8.class) {
                                    try {
                                        if (fadfsJa4iEdiwEC4Xm8.vekpFI4d1Nc4fakF == null) {
                                            fadfsJa4iEdiwEC4Xm8.vekpFI4d1Nc4fakF = new fadfsJa4iEdiwEC4Xm8(i3);
                                        }
                                        fadfsja4iediwec4xm9 = fadfsJa4iEdiwEC4Xm8.vekpFI4d1Nc4fakF;
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                fadfsja4iediwec4xm9.getClass();
                                int i9 = ((SparseIntArray) this.ibVTtJUNfrGYbW.w9sT1Swbhx3hs).get(203400000, i2);
                                if (i9 == i2 || i9 == 0) {
                                    if (this.JXn4Qf7zpnLjP5 == null) {
                                        this.JXn4Qf7zpnLjP5 = new ny2QaoAAyfdnXseU2mn(this.Ee8d2j4S9Vm5yGuR, ny2QaoAAyfdnXseU2mn.pyu8ovAipBTLYAiKab, yRLsxLigSiPhRQHp.w9sT1Swbhx3hs);
                                    }
                                    this.JXn4Qf7zpnLjP5.dDIMxZXP1V8HdM(n3OQwXegjg1zeRF4);
                                }
                            }
                            this.vekpFI4d1Nc4fakF = null;
                        }
                    } else {
                        N3OQwXegjg1zeRF n3OQwXegjg1zeRF5 = this.vekpFI4d1Nc4fakF;
                        if (n3OQwXegjg1zeRF5.vekpFI4d1Nc4fakF == null) {
                            n3OQwXegjg1zeRF5.vekpFI4d1Nc4fakF = new ArrayList();
                        }
                        n3OQwXegjg1zeRF5.vekpFI4d1Nc4fakF.add(null);
                    }
                }
                if (this.vekpFI4d1Nc4fakF == null) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(null);
                    this.vekpFI4d1Nc4fakF = new N3OQwXegjg1zeRF(0, arrayList3);
                    ifljbvrqroccc6.sendMessageDelayed(ifljbvrqroccc6.obtainMessage(17), 0L);
                    return true;
                }
                return true;
            case 19:
                this.w9sT1Swbhx3hs = false;
                return true;
            default:
                return false;
        }
    }

    public final eJzD6jrSBjwYspq vekpFI4d1Nc4fakF(ny2QaoAAyfdnXseU2mn ny2qaoaayfdnxseu2mn) {
        uW0IRoPBZMj2QmBkkp uw0iropbzmj2qmbkkp = ny2qaoaayfdnxseu2mn.Ee8d2j4S9Vm5yGuR;
        ConcurrentHashMap concurrentHashMap = this.D5P1xCAyuvgF;
        eJzD6jrSBjwYspq ejzd6jrsbjwyspq = (eJzD6jrSBjwYspq) concurrentHashMap.get(uw0iropbzmj2qmbkkp);
        if (ejzd6jrsbjwyspq == null) {
            ejzd6jrsbjwyspq = new eJzD6jrSBjwYspq(this, ny2qaoaayfdnxseu2mn);
            concurrentHashMap.put(uw0iropbzmj2qmbkkp, ejzd6jrsbjwyspq);
        }
        if (ejzd6jrsbjwyspq.Ee8d2j4S9Vm5yGuR.gIIiyi2ddlMDR0()) {
            this.gmNWMfvn6zlEj.add(uw0iropbzmj2qmbkkp);
        }
        ejzd6jrsbjwyspq.gIIiyi2ddlMDR0();
        return ejzd6jrsbjwyspq;
    }
}
