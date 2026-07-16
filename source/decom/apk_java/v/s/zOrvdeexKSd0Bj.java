package v.s;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class zOrvdeexKSd0Bj implements ServiceConnection {
    public final VlWj8OWl0tBj2oBSb3 Ee8d2j4S9Vm5yGuR;
    public IBinder JXn4Qf7zpnLjP5;
    public final /* synthetic */ MPPGXLipja3aW ibVTtJUNfrGYbW;
    public boolean vekpFI4d1Nc4fakF;
    public ComponentName xDyLpEZyrcKVe0;
    public final HashMap dDIMxZXP1V8HdM = new HashMap();
    public int w9sT1Swbhx3hs = 2;

    public zOrvdeexKSd0Bj(MPPGXLipja3aW mPPGXLipja3aW, VlWj8OWl0tBj2oBSb3 vlWj8OWl0tBj2oBSb3) {
        this.ibVTtJUNfrGYbW = mPPGXLipja3aW;
        this.Ee8d2j4S9Vm5yGuR = vlWj8OWl0tBj2oBSb3;
    }

    private static /* synthetic */ void heojmhj() {
    }

    public final void dDIMxZXP1V8HdM(String str) throws Throwable {
        this.w9sT1Swbhx3hs = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            MPPGXLipja3aW mPPGXLipja3aW = this.ibVTtJUNfrGYbW;
            r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c = mPPGXLipja3aW.JXn4Qf7zpnLjP5;
            Context context = mPPGXLipja3aW.w9sT1Swbhx3hs;
            try {
                boolean zXfn2GJwmGqs7kWW = r5xeufod5gsccwq6c.xfn2GJwmGqs7kWW(context, str, this.Ee8d2j4S9Vm5yGuR.dDIMxZXP1V8HdM(context), this, this.Ee8d2j4S9Vm5yGuR.vekpFI4d1Nc4fakF);
                this.vekpFI4d1Nc4fakF = zXfn2GJwmGqs7kWW;
                if (zXfn2GJwmGqs7kWW) {
                    this.ibVTtJUNfrGYbW.vekpFI4d1Nc4fakF.sendMessageDelayed(this.ibVTtJUNfrGYbW.vekpFI4d1Nc4fakF.obtainMessage(1, this.Ee8d2j4S9Vm5yGuR), this.ibVTtJUNfrGYbW.xDyLpEZyrcKVe0);
                } else {
                    this.w9sT1Swbhx3hs = 2;
                    try {
                        MPPGXLipja3aW mPPGXLipja3aW2 = this.ibVTtJUNfrGYbW;
                        mPPGXLipja3aW2.JXn4Qf7zpnLjP5.rCHnHJBAlOpNI5(mPPGXLipja3aW2.w9sT1Swbhx3hs, this);
                    } catch (IllegalArgumentException unused) {
                    }
                }
                StrictMode.setVmPolicy(vmPolicy);
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                StrictMode.setVmPolicy(vmPolicy);
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.ibVTtJUNfrGYbW.dDIMxZXP1V8HdM) {
            try {
                this.ibVTtJUNfrGYbW.vekpFI4d1Nc4fakF.removeMessages(1, this.Ee8d2j4S9Vm5yGuR);
                this.JXn4Qf7zpnLjP5 = iBinder;
                this.xDyLpEZyrcKVe0 = componentName;
                Iterator it = this.dDIMxZXP1V8HdM.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.w9sT1Swbhx3hs = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.ibVTtJUNfrGYbW.dDIMxZXP1V8HdM) {
            try {
                this.ibVTtJUNfrGYbW.vekpFI4d1Nc4fakF.removeMessages(1, this.Ee8d2j4S9Vm5yGuR);
                this.JXn4Qf7zpnLjP5 = null;
                this.xDyLpEZyrcKVe0 = componentName;
                Iterator it = this.dDIMxZXP1V8HdM.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.w9sT1Swbhx3hs = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
