package v.s;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class hXWTjYzJCr2glJDZJMlR implements Handler.Callback, ServiceConnection {
    public final Context dDIMxZXP1V8HdM;
    public final Handler w9sT1Swbhx3hs;
    public final HashMap vekpFI4d1Nc4fakF = new HashMap();
    public HashSet JXn4Qf7zpnLjP5 = new HashSet();

    public hXWTjYzJCr2glJDZJMlR(Context context) {
        this.dDIMxZXP1V8HdM = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.w9sT1Swbhx3hs = new Handler(handlerThread.getLooper(), this);
    }

    public final void dDIMxZXP1V8HdM(qN2XfrNx8Sva76jY8 qn2xfrnx8sva76jy8) {
        boolean z;
        ArrayDeque arrayDeque = qn2xfrnx8sva76jy8.JXn4Qf7zpnLjP5;
        ComponentName componentName = qn2xfrnx8sva76jy8.dDIMxZXP1V8HdM;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
            arrayDeque.size();
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (qn2xfrnx8sva76jy8.w9sT1Swbhx3hs) {
            z = true;
        } else {
            Context context = this.dDIMxZXP1V8HdM;
            boolean zBindService = context.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName), this, 70 - 37);
            qn2xfrnx8sva76jy8.w9sT1Swbhx3hs = zBindService;
            if (zBindService) {
                qn2xfrnx8sva76jy8.Ee8d2j4S9Vm5yGuR = 0;
            } else {
                Objects.toString(componentName);
                context.unbindService(this);
            }
            z = qn2xfrnx8sva76jy8.w9sT1Swbhx3hs;
        }
        if (!z || qn2xfrnx8sva76jy8.vekpFI4d1Nc4fakF == null) {
            w9sT1Swbhx3hs(qn2xfrnx8sva76jy8);
            return;
        }
        while (true) {
            AD5cUFNRRldgyKWT aD5cUFNRRldgyKWT = (AD5cUFNRRldgyKWT) arrayDeque.peek();
            if (aD5cUFNRRldgyKWT == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    aD5cUFNRRldgyKWT.toString();
                }
                ((gkrME4EN2eOCWFLS) qn2xfrnx8sva76jy8.vekpFI4d1Nc4fakF).dDIMxZXP1V8HdM(aD5cUFNRRldgyKWT.dDIMxZXP1V8HdM, aD5cUFNRRldgyKWT.w9sT1Swbhx3hs, aD5cUFNRRldgyKWT.vekpFI4d1Nc4fakF);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Objects.toString(componentName);
                }
            } catch (RemoteException unused2) {
                Objects.toString(componentName);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        w9sT1Swbhx3hs(qn2xfrnx8sva76jy8);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i = message.what;
        zb1Doc3Oy0ONl2wW zb1doc3oy0onl2ww = null;
        if (i == 0) {
            AD5cUFNRRldgyKWT aD5cUFNRRldgyKWT = (AD5cUFNRRldgyKWT) message.obj;
            String string = Settings.Secure.getString(this.dDIMxZXP1V8HdM.getContentResolver(), "enabled_notification_listeners");
            synchronized (HEqPccX85NcWnm0.vekpFI4d1Nc4fakF) {
                if (string != null) {
                    try {
                        if (!string.equals(HEqPccX85NcWnm0.JXn4Qf7zpnLjP5)) {
                            String[] strArrSplit = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(strArrSplit.length);
                            for (String str : strArrSplit) {
                                ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                                if (componentNameUnflattenFromString != null) {
                                    hashSet2.add(componentNameUnflattenFromString.getPackageName());
                                }
                            }
                            HEqPccX85NcWnm0.Ee8d2j4S9Vm5yGuR = hashSet2;
                            HEqPccX85NcWnm0.JXn4Qf7zpnLjP5 = string;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                hashSet = HEqPccX85NcWnm0.Ee8d2j4S9Vm5yGuR;
            }
            if (!hashSet.equals(this.JXn4Qf7zpnLjP5)) {
                this.JXn4Qf7zpnLjP5 = hashSet;
                List<ResolveInfo> listQueryIntentServices = this.dDIMxZXP1V8HdM.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet3 = new HashSet();
                for (ResolveInfo resolveInfo : listQueryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            componentName.toString();
                        } else {
                            hashSet3.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet3) {
                    if (!this.vekpFI4d1Nc4fakF.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Objects.toString(componentName2);
                        }
                        this.vekpFI4d1Nc4fakF.put(componentName2, new qN2XfrNx8Sva76jY8(componentName2));
                    }
                }
                Iterator it = this.vekpFI4d1Nc4fakF.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Objects.toString(entry.getKey());
                        }
                        qN2XfrNx8Sva76jY8 qn2xfrnx8sva76jy8 = (qN2XfrNx8Sva76jY8) entry.getValue();
                        if (qn2xfrnx8sva76jy8.w9sT1Swbhx3hs) {
                            this.dDIMxZXP1V8HdM.unbindService(this);
                            qn2xfrnx8sva76jy8.w9sT1Swbhx3hs = false;
                        }
                        qn2xfrnx8sva76jy8.vekpFI4d1Nc4fakF = null;
                        it.remove();
                    }
                }
            }
            for (qN2XfrNx8Sva76jY8 qn2xfrnx8sva76jy9 : this.vekpFI4d1Nc4fakF.values()) {
                qn2xfrnx8sva76jy9.JXn4Qf7zpnLjP5.add(aD5cUFNRRldgyKWT);
                dDIMxZXP1V8HdM(qn2xfrnx8sva76jy9);
            }
        } else if (i == 1) {
            xzNVlOixE1GbCy5b xznvloixe1gbcy5b = (xzNVlOixE1GbCy5b) message.obj;
            ComponentName componentName3 = xznvloixe1gbcy5b.dDIMxZXP1V8HdM;
            IBinder iBinder = xznvloixe1gbcy5b.w9sT1Swbhx3hs;
            qN2XfrNx8Sva76jY8 qn2xfrnx8sva76jy10 = (qN2XfrNx8Sva76jY8) this.vekpFI4d1Nc4fakF.get(componentName3);
            if (qn2xfrnx8sva76jy10 != null) {
                int i2 = ou7XxYrznuFxOYeCV.JXn4Qf7zpnLjP5;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(zb1Doc3Oy0ONl2wW.dDIMxZXP1V8HdM);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof zb1Doc3Oy0ONl2wW)) {
                        gkrME4EN2eOCWFLS gkrme4en2eocwfls = new gkrME4EN2eOCWFLS();
                        gkrme4en2eocwfls.JXn4Qf7zpnLjP5 = iBinder;
                        zb1doc3oy0onl2ww = gkrme4en2eocwfls;
                    } else {
                        zb1doc3oy0onl2ww = (zb1Doc3Oy0ONl2wW) iInterfaceQueryLocalInterface;
                    }
                }
                qn2xfrnx8sva76jy10.vekpFI4d1Nc4fakF = zb1doc3oy0onl2ww;
                qn2xfrnx8sva76jy10.Ee8d2j4S9Vm5yGuR = 0;
                dDIMxZXP1V8HdM(qn2xfrnx8sva76jy10);
                return true;
            }
        } else if (i == 2) {
            qN2XfrNx8Sva76jY8 qn2xfrnx8sva76jy11 = (qN2XfrNx8Sva76jY8) this.vekpFI4d1Nc4fakF.get((ComponentName) message.obj);
            if (qn2xfrnx8sva76jy11 != null) {
                if (qn2xfrnx8sva76jy11.w9sT1Swbhx3hs) {
                    this.dDIMxZXP1V8HdM.unbindService(this);
                    qn2xfrnx8sva76jy11.w9sT1Swbhx3hs = false;
                }
                qn2xfrnx8sva76jy11.vekpFI4d1Nc4fakF = null;
                return true;
            }
        } else {
            if (i != 3) {
                return false;
            }
            qN2XfrNx8Sva76jY8 qn2xfrnx8sva76jy12 = (qN2XfrNx8Sva76jY8) this.vekpFI4d1Nc4fakF.get((ComponentName) message.obj);
            if (qn2xfrnx8sva76jy12 != null) {
                dDIMxZXP1V8HdM(qn2xfrnx8sva76jy12);
                return true;
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
        }
        this.w9sT1Swbhx3hs.obtainMessage(1, new xzNVlOixE1GbCy5b(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 7 - 4)) {
            Objects.toString(componentName);
        }
        this.w9sT1Swbhx3hs.obtainMessage(2, componentName).sendToTarget();
    }

    public final void w9sT1Swbhx3hs(qN2XfrNx8Sva76jY8 qn2xfrnx8sva76jy8) {
        ComponentName componentName = qn2xfrnx8sva76jy8.dDIMxZXP1V8HdM;
        ArrayDeque arrayDeque = qn2xfrnx8sva76jy8.JXn4Qf7zpnLjP5;
        Handler handler = this.w9sT1Swbhx3hs;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = qn2xfrnx8sva76jy8.Ee8d2j4S9Vm5yGuR;
        int i2 = i + 1;
        qn2xfrnx8sva76jy8.Ee8d2j4S9Vm5yGuR = i2;
        if (i2 <= 6) {
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), (1 << i) * 1000);
            return;
        }
        arrayDeque.size();
        Objects.toString(componentName);
        arrayDeque.clear();
    }
}
