package v.s;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final /* synthetic */ class LJ724HHGeqKLPqZG implements zzxeBctTPcbuazkjVgh {
    public final /* synthetic */ int dDIMxZXP1V8HdM;
    public final /* synthetic */ Object vekpFI4d1Nc4fakF;
    public final /* synthetic */ Object w9sT1Swbhx3hs;

    public /* synthetic */ LJ724HHGeqKLPqZG(Object obj, int i, Object obj2) {
        this.dDIMxZXP1V8HdM = i;
        this.w9sT1Swbhx3hs = obj;
        this.vekpFI4d1Nc4fakF = obj2;
    }

    private static /* synthetic */ void bgnzhh() {
    }

    @Override // v.s.zzxeBctTPcbuazkjVgh
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.dDIMxZXP1V8HdM) {
            case 0:
                NYXyLhuO3qlh84AKe52 nYXyLhuO3qlh84AKe52 = (NYXyLhuO3qlh84AKe52) this.w9sT1Swbhx3hs;
                FVxyDmZ6Vklq5C fVxyDmZ6Vklq5C = (FVxyDmZ6Vklq5C) this.vekpFI4d1Nc4fakF;
                return fVxyDmZ6Vklq5C.xDyLpEZyrcKVe0.w9sT1Swbhx3hs(new iniVyKd0OGb2raI4(fVxyDmZ6Vklq5C, nYXyLhuO3qlh84AKe52));
            case 1:
                return new XlNqgz8EVh2x11Ly((Context) this.w9sT1Swbhx3hs, (String) this.vekpFI4d1Nc4fakF);
            default:
                dfwkxUDiclPw1BowH4 dfwkxudiclpw1bowh4 = (dfwkxUDiclPw1BowH4) this.w9sT1Swbhx3hs;
                Context context = (Context) this.vekpFI4d1Nc4fakF;
                String strVekpFI4d1Nc4fakF = dfwkxudiclpw1bowh4.vekpFI4d1Nc4fakF();
                gvOlsH7NUhtM4SC gvolsh7nuhtm4sc = new gvOlsH7NUhtM4SC();
                Context contextDDIMxZXP1V8HdM = QlBORRdwsrcwuhuj.dDIMxZXP1V8HdM(context);
                SharedPreferences sharedPreferences = contextDDIMxZXP1V8HdM.getSharedPreferences("com.google.firebase.common.prefs:" + strVekpFI4d1Nc4fakF, 0);
                boolean z = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = contextDDIMxZXP1V8HdM.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextDDIMxZXP1V8HdM.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                        break;
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                gvolsh7nuhtm4sc.dDIMxZXP1V8HdM = z;
                return gvolsh7nuhtm4sc;
        }
    }
}
