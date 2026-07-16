package v.s;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final /* synthetic */ class JgKM3Ax00dYE7I6ud2c implements Handler.Callback {
    public final /* synthetic */ int dDIMxZXP1V8HdM;
    public final /* synthetic */ Object w9sT1Swbhx3hs;

    public /* synthetic */ JgKM3Ax00dYE7I6ud2c(int i, Object obj) {
        this.dDIMxZXP1V8HdM = i;
        this.w9sT1Swbhx3hs = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.dDIMxZXP1V8HdM) {
            case 0:
                int i = message.arg1;
                fuhSwJR8Sgz92H fuhswjr8sgz92h = (fuhSwJR8Sgz92H) this.w9sT1Swbhx3hs;
                synchronized (fuhswjr8sgz92h) {
                    try {
                        wx1uy9kWo2J3 wx1uy9kwo2j3 = (wx1uy9kWo2J3) fuhswjr8sgz92h.Ee8d2j4S9Vm5yGuR.get(i);
                        if (wx1uy9kwo2j3 == null) {
                            return true;
                        }
                        fuhswjr8sgz92h.Ee8d2j4S9Vm5yGuR.remove(i);
                        fuhswjr8sgz92h.vekpFI4d1Nc4fakF();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            wx1uy9kwo2j3.w9sT1Swbhx3hs(new OYRwk007Mtyi("Not supported by GmsCore", null));
                            return true;
                        }
                        switch (wx1uy9kwo2j3.Ee8d2j4S9Vm5yGuR) {
                            case 0:
                                if (!data.getBoolean("ack", false)) {
                                    wx1uy9kwo2j3.w9sT1Swbhx3hs(new OYRwk007Mtyi("Invalid response to one way request", null));
                                    return true;
                                }
                                if (Log.isLoggable("MessengerIpcClient", 3)) {
                                    wx1uy9kwo2j3.toString();
                                }
                                wx1uy9kwo2j3.w9sT1Swbhx3hs.dDIMxZXP1V8HdM(null);
                                return true;
                            default:
                                Bundle bundle = data.getBundle("data");
                                if (bundle == null) {
                                    bundle = Bundle.EMPTY;
                                }
                                if (Log.isLoggable("MessengerIpcClient", 3)) {
                                    wx1uy9kwo2j3.toString();
                                    String.valueOf(bundle);
                                }
                                wx1uy9kwo2j3.w9sT1Swbhx3hs.dDIMxZXP1V8HdM(bundle);
                                return true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            default:
                int i2 = message.what;
                if (i2 != 0) {
                    if (i2 != 1) {
                        return false;
                    }
                    synchronized (((MPPGXLipja3aW) this.w9sT1Swbhx3hs).dDIMxZXP1V8HdM) {
                        try {
                            VlWj8OWl0tBj2oBSb3 vlWj8OWl0tBj2oBSb3 = (VlWj8OWl0tBj2oBSb3) message.obj;
                            zOrvdeexKSd0Bj zorvdeexksd0bj = (zOrvdeexKSd0Bj) ((MPPGXLipja3aW) this.w9sT1Swbhx3hs).dDIMxZXP1V8HdM.get(vlWj8OWl0tBj2oBSb3);
                            if (zorvdeexksd0bj != null && zorvdeexksd0bj.w9sT1Swbhx3hs == 3) {
                                String.valueOf(vlWj8OWl0tBj2oBSb3);
                                new Exception();
                                ComponentName componentName = zorvdeexksd0bj.xDyLpEZyrcKVe0;
                                if (componentName == null) {
                                    vlWj8OWl0tBj2oBSb3.getClass();
                                    componentName = null;
                                }
                                if (componentName == null) {
                                    String str = vlWj8OWl0tBj2oBSb3.w9sT1Swbhx3hs;
                                    SbxdZ6Kq2uhHQ5RPRqm.ibVTtJUNfrGYbW(str);
                                    componentName = new ComponentName(str, "unknown");
                                }
                                zorvdeexksd0bj.onServiceDisconnected(componentName);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                } else {
                    synchronized (((MPPGXLipja3aW) this.w9sT1Swbhx3hs).dDIMxZXP1V8HdM) {
                        try {
                            VlWj8OWl0tBj2oBSb3 vlWj8OWl0tBj2oBSb4 = (VlWj8OWl0tBj2oBSb3) message.obj;
                            zOrvdeexKSd0Bj zorvdeexksd0bj2 = (zOrvdeexKSd0Bj) ((MPPGXLipja3aW) this.w9sT1Swbhx3hs).dDIMxZXP1V8HdM.get(vlWj8OWl0tBj2oBSb4);
                            if (zorvdeexksd0bj2 != null && zorvdeexksd0bj2.dDIMxZXP1V8HdM.isEmpty()) {
                                if (zorvdeexksd0bj2.vekpFI4d1Nc4fakF) {
                                    zorvdeexksd0bj2.ibVTtJUNfrGYbW.vekpFI4d1Nc4fakF.removeMessages(1, zorvdeexksd0bj2.Ee8d2j4S9Vm5yGuR);
                                    MPPGXLipja3aW mPPGXLipja3aW = zorvdeexksd0bj2.ibVTtJUNfrGYbW;
                                    mPPGXLipja3aW.JXn4Qf7zpnLjP5.rCHnHJBAlOpNI5(mPPGXLipja3aW.w9sT1Swbhx3hs, zorvdeexksd0bj2);
                                    zorvdeexksd0bj2.vekpFI4d1Nc4fakF = false;
                                    zorvdeexksd0bj2.w9sT1Swbhx3hs = 2;
                                }
                                ((MPPGXLipja3aW) this.w9sT1Swbhx3hs).dDIMxZXP1V8HdM.remove(vlWj8OWl0tBj2oBSb4);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                        break;
                    }
                }
                return true;
        }
    }
}
