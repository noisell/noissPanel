package v.s;

import android.app.job.JobWorkItem;
import android.content.Context;
import android.content.res.Resources;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class IXBvAqS2fpdIRK {
    public final /* synthetic */ int dDIMxZXP1V8HdM;
    public final Object vekpFI4d1Nc4fakF;
    public final Object w9sT1Swbhx3hs;

    public IXBvAqS2fpdIRK() {
        this.dDIMxZXP1V8HdM = 6;
        this.w9sT1Swbhx3hs = Collections.synchronizedMap(new WeakHashMap());
        this.vekpFI4d1Nc4fakF = Collections.synchronizedMap(new WeakHashMap());
    }

    private static /* synthetic */ void qzuej() {
    }

    public void dDIMxZXP1V8HdM(Object obj, String str) {
        ((ArrayList) this.w9sT1Swbhx3hs).add(str + "=" + String.valueOf(obj));
    }

    public String toString() {
        switch (this.dDIMxZXP1V8HdM) {
            case 3:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.vekpFI4d1Nc4fakF.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.w9sT1Swbhx3hs;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void vekpFI4d1Nc4fakF(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (((Map) this.w9sT1Swbhx3hs)) {
            map = new HashMap((Map) this.w9sT1Swbhx3hs);
        }
        synchronized (((Map) this.vekpFI4d1Nc4fakF)) {
            map2 = new HashMap((Map) this.vekpFI4d1Nc4fakF);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                throw new ClassCastException();
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((al3CoDKXO0nvx) entry2.getKey()).w9sT1Swbhx3hs(new OYRwk007Mtyi(status));
            }
        }
    }

    public String w9sT1Swbhx3hs(String str) {
        Resources resources = (Resources) this.w9sT1Swbhx3hs;
        int identifier = resources.getIdentifier(str, "string", (String) this.vekpFI4d1Nc4fakF);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public IXBvAqS2fpdIRK(Context context) {
        this.dDIMxZXP1V8HdM = 5;
        SbxdZ6Kq2uhHQ5RPRqm.ibVTtJUNfrGYbW(context);
        Resources resources = context.getResources();
        this.w9sT1Swbhx3hs = resources;
        this.vekpFI4d1Nc4fakF = resources.getResourcePackageName(2131427346);
    }

    public IXBvAqS2fpdIRK(IBinder iBinder) throws RemoteException {
        this.dDIMxZXP1V8HdM = 7;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (interfaceDescriptor != "android.os.IMessenger" && (interfaceDescriptor == null || !interfaceDescriptor.equals("android.os.IMessenger"))) {
            if (interfaceDescriptor != "com.google.android.gms.iid.IMessengerCompat" && (interfaceDescriptor == null || !interfaceDescriptor.equals("com.google.android.gms.iid.IMessengerCompat"))) {
                "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor));
                throw new RemoteException();
            }
            this.vekpFI4d1Nc4fakF = new D3FfxRNDtw22r(iBinder);
            this.w9sT1Swbhx3hs = null;
            return;
        }
        this.w9sT1Swbhx3hs = new Messenger(iBinder);
        this.vekpFI4d1Nc4fakF = null;
    }

    public /* synthetic */ IXBvAqS2fpdIRK(Object obj) {
        this.dDIMxZXP1V8HdM = 3;
        this.vekpFI4d1Nc4fakF = obj;
        this.w9sT1Swbhx3hs = new ArrayList();
    }

    public IXBvAqS2fpdIRK(q2cpFJJZo2i97uMpROz q2cpfjjzo2i97umproz, W6dfON4KdcdxlH w6dfON4KdcdxlH) {
        this.dDIMxZXP1V8HdM = 1;
        this.vekpFI4d1Nc4fakF = "ClientTelemetry.API";
        this.w9sT1Swbhx3hs = q2cpfjjzo2i97umproz;
    }

    public IXBvAqS2fpdIRK(WorkDatabase_Impl workDatabase_Impl) {
        this.dDIMxZXP1V8HdM = 0;
        this.w9sT1Swbhx3hs = workDatabase_Impl;
        this.vekpFI4d1Nc4fakF = new LeKZUBhDBK6LgUr(workDatabase_Impl, 3);
    }

    public IXBvAqS2fpdIRK(ExecutorService executorService) {
        this.dDIMxZXP1V8HdM = 4;
        this.vekpFI4d1Nc4fakF = new Sn2d19yOBfyV0rw();
        this.w9sT1Swbhx3hs = executorService;
    }

    public IXBvAqS2fpdIRK(aU71xeS1mg88JgBsKh au71xes1mg88jgbskh, JobWorkItem jobWorkItem) {
        this.dDIMxZXP1V8HdM = 2;
        this.vekpFI4d1Nc4fakF = au71xes1mg88jgbskh;
        this.w9sT1Swbhx3hs = jobWorkItem;
    }
}
