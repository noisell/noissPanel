package v.s;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class MPPGXLipja3aW {
    public static MPPGXLipja3aW b1EoSIRjJHO5;
    public static final Object ibVTtJUNfrGYbW = new Object();
    public static HandlerThread pyu8ovAipBTLYAiKab;
    public final long Ee8d2j4S9Vm5yGuR;
    public final r5XEUfod5GSCCwq6c JXn4Qf7zpnLjP5;
    public final HashMap dDIMxZXP1V8HdM = new HashMap();
    public volatile iFLJbvrqroccc6 vekpFI4d1Nc4fakF;
    public final Context w9sT1Swbhx3hs;
    public final long xDyLpEZyrcKVe0;

    public MPPGXLipja3aW(Context context, Looper looper) {
        JgKM3Ax00dYE7I6ud2c jgKM3Ax00dYE7I6ud2c = new JgKM3Ax00dYE7I6ud2c(1, this);
        this.w9sT1Swbhx3hs = context.getApplicationContext();
        this.vekpFI4d1Nc4fakF = new iFLJbvrqroccc6(looper, jgKM3Ax00dYE7I6ud2c);
        this.JXn4Qf7zpnLjP5 = r5XEUfod5GSCCwq6c.D5P1xCAyuvgF();
        this.Ee8d2j4S9Vm5yGuR = 5000L;
        this.xDyLpEZyrcKVe0 = 300000L;
    }

    public final void dDIMxZXP1V8HdM(String str, ServiceConnection serviceConnection, boolean z) {
        VlWj8OWl0tBj2oBSb3 vlWj8OWl0tBj2oBSb3 = new VlWj8OWl0tBj2oBSb3(str, z);
        SbxdZ6Kq2uhHQ5RPRqm.b1EoSIRjJHO5(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.dDIMxZXP1V8HdM) {
            try {
                zOrvdeexKSd0Bj zorvdeexksd0bj = (zOrvdeexKSd0Bj) this.dDIMxZXP1V8HdM.get(vlWj8OWl0tBj2oBSb3);
                if (zorvdeexksd0bj == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(vlWj8OWl0tBj2oBSb3.toString()));
                }
                if (!zorvdeexksd0bj.dDIMxZXP1V8HdM.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(vlWj8OWl0tBj2oBSb3.toString()));
                }
                zorvdeexksd0bj.dDIMxZXP1V8HdM.remove(serviceConnection);
                if (zorvdeexksd0bj.dDIMxZXP1V8HdM.isEmpty()) {
                    this.vekpFI4d1Nc4fakF.sendMessageDelayed(this.vekpFI4d1Nc4fakF.obtainMessage(0, vlWj8OWl0tBj2oBSb3), this.Ee8d2j4S9Vm5yGuR);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean w9sT1Swbhx3hs(VlWj8OWl0tBj2oBSb3 vlWj8OWl0tBj2oBSb3, C37DGECHfvLDfGxxgQ9I c37DGECHfvLDfGxxgQ9I, String str) {
        boolean z;
        synchronized (this.dDIMxZXP1V8HdM) {
            try {
                zOrvdeexKSd0Bj zorvdeexksd0bj = (zOrvdeexKSd0Bj) this.dDIMxZXP1V8HdM.get(vlWj8OWl0tBj2oBSb3);
                if (zorvdeexksd0bj == null) {
                    zorvdeexksd0bj = new zOrvdeexKSd0Bj(this, vlWj8OWl0tBj2oBSb3);
                    zorvdeexksd0bj.dDIMxZXP1V8HdM.put(c37DGECHfvLDfGxxgQ9I, c37DGECHfvLDfGxxgQ9I);
                    zorvdeexksd0bj.dDIMxZXP1V8HdM(str);
                    this.dDIMxZXP1V8HdM.put(vlWj8OWl0tBj2oBSb3, zorvdeexksd0bj);
                } else {
                    this.vekpFI4d1Nc4fakF.removeMessages(0, vlWj8OWl0tBj2oBSb3);
                    if (zorvdeexksd0bj.dDIMxZXP1V8HdM.containsKey(c37DGECHfvLDfGxxgQ9I)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(vlWj8OWl0tBj2oBSb3.toString()));
                    }
                    zorvdeexksd0bj.dDIMxZXP1V8HdM.put(c37DGECHfvLDfGxxgQ9I, c37DGECHfvLDfGxxgQ9I);
                    int i = zorvdeexksd0bj.w9sT1Swbhx3hs;
                    if (i == 1) {
                        c37DGECHfvLDfGxxgQ9I.onServiceConnected(zorvdeexksd0bj.xDyLpEZyrcKVe0, zorvdeexksd0bj.JXn4Qf7zpnLjP5);
                    } else if (i == 2) {
                        zorvdeexksd0bj.dDIMxZXP1V8HdM(str);
                    }
                }
                z = zorvdeexksd0bj.vekpFI4d1Nc4fakF;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
