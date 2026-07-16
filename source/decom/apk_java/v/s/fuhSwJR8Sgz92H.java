package v.s;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class fuhSwJR8Sgz92H implements ServiceConnection {
    public final SparseArray Ee8d2j4S9Vm5yGuR;
    public final ArrayDeque JXn4Qf7zpnLjP5;
    public int dDIMxZXP1V8HdM = 0;
    public IXBvAqS2fpdIRK vekpFI4d1Nc4fakF;
    public final Messenger w9sT1Swbhx3hs;
    public final /* synthetic */ NeMF2Rxt7VnmPi5V xDyLpEZyrcKVe0;

    public fuhSwJR8Sgz92H(NeMF2Rxt7VnmPi5V neMF2Rxt7VnmPi5V) {
        this.xDyLpEZyrcKVe0 = neMF2Rxt7VnmPi5V;
        iFLJbvrqroccc6 ifljbvrqroccc6 = new iFLJbvrqroccc6(Looper.getMainLooper(), new JgKM3Ax00dYE7I6ud2c(0, this));
        Looper.getMainLooper();
        this.w9sT1Swbhx3hs = new Messenger(ifljbvrqroccc6);
        this.JXn4Qf7zpnLjP5 = new ArrayDeque();
        this.Ee8d2j4S9Vm5yGuR = new SparseArray();
    }

    public final synchronized boolean JXn4Qf7zpnLjP5(wx1uy9kWo2J3 wx1uy9kwo2j3) throws Throwable {
        Throwable th;
        try {
            try {
                int i = this.dDIMxZXP1V8HdM;
                if (i == 0) {
                    this.JXn4Qf7zpnLjP5.add(wx1uy9kwo2j3);
                    if (this.dDIMxZXP1V8HdM != 0) {
                        throw new IllegalStateException();
                    }
                    this.dDIMxZXP1V8HdM = 1;
                    Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                    intent.setPackage("com.google.android.gms");
                    try {
                        r5XEUfod5GSCCwq6c r5xeufod5gsccwq6cD5P1xCAyuvgF = r5XEUfod5GSCCwq6c.D5P1xCAyuvgF();
                        Context context = this.xDyLpEZyrcKVe0.dDIMxZXP1V8HdM;
                        try {
                            if (r5xeufod5gsccwq6cD5P1xCAyuvgF.xfn2GJwmGqs7kWW(context, context.getClass().getName(), intent, this, 1)) {
                                this.xDyLpEZyrcKVe0.w9sT1Swbhx3hs.schedule(new jIx0xSeBgC5A5f(this, 1), 30L, TimeUnit.SECONDS);
                            } else {
                                dDIMxZXP1V8HdM("Unable to bind to service");
                            }
                        } catch (SecurityException e) {
                            e = e;
                            w9sT1Swbhx3hs("Unable to bind to service", e);
                        }
                    } catch (SecurityException e2) {
                        e = e2;
                    }
                    return true;
                }
                try {
                    if (i == 1) {
                        this.JXn4Qf7zpnLjP5.add(wx1uy9kwo2j3);
                        return true;
                    }
                    if (i != 2) {
                        return false;
                    }
                    this.JXn4Qf7zpnLjP5.add(wx1uy9kwo2j3);
                    this.xDyLpEZyrcKVe0.w9sT1Swbhx3hs.execute(new jIx0xSeBgC5A5f(this, 0));
                    return true;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        throw th;
    }

    public final synchronized void dDIMxZXP1V8HdM(String str) {
        w9sT1Swbhx3hs(str, null);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.xDyLpEZyrcKVe0.w9sT1Swbhx3hs.execute(new UubaJZRp66jTeLre(34 - 20, this, iBinder, false));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.xDyLpEZyrcKVe0.w9sT1Swbhx3hs.execute(new jIx0xSeBgC5A5f(this, 2));
    }

    public final synchronized void vekpFI4d1Nc4fakF() {
        if (this.dDIMxZXP1V8HdM == 2 && this.JXn4Qf7zpnLjP5.isEmpty() && this.Ee8d2j4S9Vm5yGuR.size() == 0) {
            this.dDIMxZXP1V8HdM = 3;
            r5XEUfod5GSCCwq6c.D5P1xCAyuvgF().rCHnHJBAlOpNI5(this.xDyLpEZyrcKVe0.dDIMxZXP1V8HdM, this);
        }
    }

    public final synchronized void w9sT1Swbhx3hs(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Disconnected: ".concat(String.valueOf(str));
            }
            int i = this.dDIMxZXP1V8HdM;
            if (i == 0) {
                throw new IllegalStateException();
            }
            if (i != 1 && i != (-83) + 85) {
                if (i != 3) {
                    return;
                }
                this.dDIMxZXP1V8HdM = 4;
                return;
            }
            this.dDIMxZXP1V8HdM = 4;
            r5XEUfod5GSCCwq6c.D5P1xCAyuvgF().rCHnHJBAlOpNI5(this.xDyLpEZyrcKVe0.dDIMxZXP1V8HdM, this);
            OYRwk007Mtyi oYRwk007Mtyi = new OYRwk007Mtyi(str, securityException);
            Iterator it = this.JXn4Qf7zpnLjP5.iterator();
            while (it.hasNext()) {
                ((wx1uy9kWo2J3) it.next()).w9sT1Swbhx3hs(oYRwk007Mtyi);
            }
            this.JXn4Qf7zpnLjP5.clear();
            for (int i2 = 0; i2 < this.Ee8d2j4S9Vm5yGuR.size(); i2++) {
                ((wx1uy9kWo2J3) this.Ee8d2j4S9Vm5yGuR.valueAt(i2)).w9sT1Swbhx3hs(oYRwk007Mtyi);
            }
            this.Ee8d2j4S9Vm5yGuR.clear();
        } catch (Throwable th) {
            throw th;
        }
    }
}
