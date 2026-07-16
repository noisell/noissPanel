package v.s;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class EPXwpnHeMDtvkKf {
    public int Ee8d2j4S9Vm5yGuR = 0;
    public int JXn4Qf7zpnLjP5;
    public final Context dDIMxZXP1V8HdM;
    public String vekpFI4d1Nc4fakF;
    public String w9sT1Swbhx3hs;

    public EPXwpnHeMDtvkKf(Context context) {
        this.dDIMxZXP1V8HdM = context;
    }

    public static String w9sT1Swbhx3hs(dfwkxUDiclPw1BowH4 dfwkxudiclpw1bowh4) {
        dfwkxudiclpw1bowh4.dDIMxZXP1V8HdM();
        VTs3SU2MiIMPb2VCqAuc vTs3SU2MiIMPb2VCqAuc = dfwkxudiclpw1bowh4.vekpFI4d1Nc4fakF;
        String str = vTs3SU2MiIMPb2VCqAuc.Ee8d2j4S9Vm5yGuR;
        if (str != null) {
            return str;
        }
        dfwkxudiclpw1bowh4.dDIMxZXP1V8HdM();
        String str2 = vTs3SU2MiIMPb2VCqAuc.w9sT1Swbhx3hs;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] strArrSplit = str2.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public final synchronized void JXn4Qf7zpnLjP5() {
        PackageInfo packageInfo;
        try {
            packageInfo = this.dDIMxZXP1V8HdM.getPackageManager().getPackageInfo(this.dDIMxZXP1V8HdM.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.toString();
            packageInfo = null;
        }
        if (packageInfo != null) {
            this.w9sT1Swbhx3hs = Integer.toString(packageInfo.versionCode);
            this.vekpFI4d1Nc4fakF = packageInfo.versionName;
        }
    }

    public final synchronized String dDIMxZXP1V8HdM() {
        try {
            if (this.w9sT1Swbhx3hs == null) {
                JXn4Qf7zpnLjP5();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.w9sT1Swbhx3hs;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [boolean, int] */
    public final boolean vekpFI4d1Nc4fakF() {
        int i;
        synchronized (this) {
            i = this.Ee8d2j4S9Vm5yGuR;
            if (i == 0) {
                PackageManager packageManager = this.dDIMxZXP1V8HdM.getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    i = 0;
                } else {
                    Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent.setPackage("com.google.android.gms");
                    List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                    if (listQueryBroadcastReceivers == null || listQueryBroadcastReceivers.size() <= 0) {
                        this.Ee8d2j4S9Vm5yGuR = 2;
                    } else {
                        this.Ee8d2j4S9Vm5yGuR = 2;
                    }
                    i = 2;
                }
            }
        }
        if (i != 0) {
            return 69 - 68;
        }
        return false;
    }
}
