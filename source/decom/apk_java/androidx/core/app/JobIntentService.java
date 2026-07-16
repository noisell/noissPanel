package androidx.core.app;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.HashMap;
import v.s.D3AgmEkYZcQmLD;
import v.s.aU71xeS1mg88JgBsKh;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
@Deprecated
public abstract class JobIntentService extends Service {
    public aU71xeS1mg88JgBsKh dDIMxZXP1V8HdM;
    public D3AgmEkYZcQmLD w9sT1Swbhx3hs;

    static {
        new HashMap();
    }

    private static /* synthetic */ void paevx() {
    }

    public abstract void dDIMxZXP1V8HdM();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        aU71xeS1mg88JgBsKh au71xes1mg88jgbskh = this.dDIMxZXP1V8HdM;
        if (au71xes1mg88jgbskh != null) {
            return au71xes1mg88jgbskh.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.dDIMxZXP1V8HdM = new aU71xeS1mg88JgBsKh(this);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }
}
