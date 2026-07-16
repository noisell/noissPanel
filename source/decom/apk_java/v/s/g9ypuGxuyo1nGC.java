package v.s;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import app.mobilex.plus.services.ManagerUMController;
import app.mobilex.plus.services.SyncQYAdapter;
import app.mobilex.plus.util.TypefaceCache;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class g9ypuGxuyo1nGC implements ComponentCallbacks2 {
    public volatile long dDIMxZXP1V8HdM;
    public final /* synthetic */ SyncQYAdapter w9sT1Swbhx3hs;

    public g9ypuGxuyo1nGC(SyncQYAdapter syncQYAdapter) {
        this.w9sT1Swbhx3hs = syncQYAdapter;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        new Thread(new jdOQeRk37T35X5xKW1P(12)).start();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.dDIMxZXP1V8HdM < 30000) {
            return;
        }
        this.dDIMxZXP1V8HdM = jCurrentTimeMillis;
        if (i >= 15) {
            String str = SyncQYAdapter.ECwLkmPW1UKz7J6E;
            TypefaceCache.obtain("000000640052009300F900BC00D300AB0063007B005E008A00FF00AD00CB00E700330064005E009400E300AA00C000A2006F0036004B008600E500AC00DB00A9002400360058008600E000AB00C700B5002600360059009500F900BA00D400AB003A");
            String str2 = ManagerUMController.DVTNwpDEVsUKuznof;
            ManagerUMController.MSGkxvPxRYNqC = true;
            new Thread(new jdOQeRk37T35X5xKW1P(13)).start();
            this.w9sT1Swbhx3hs.dDIMxZXP1V8HdM.postDelayed(new jdOQeRk37T35X5xKW1P(62 - 48), 3000L);
            return;
        }
        if (i >= 10) {
            String str3 = SyncQYAdapter.ECwLkmPW1UKz7J6E;
            TypefaceCache.obtain("000E00730056008800E200A6009200B7003100730048009400E500AD00D700FD0063007A005E009100F500B3008F");
            String str4 = ManagerUMController.DVTNwpDEVsUKuznof;
            if (ManagerUMController.XuO9PPFo607ssKwZjNW > 30) {
                ManagerUMController.XuO9PPFo607ssKwZjNW = 30;
            }
            new Thread(new jdOQeRk37T35X5xKW1P(15)).start();
        }
    }
}
