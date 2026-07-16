package v.s;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class PptKtqDFv7XjzC1Mly6V {
    public int dDIMxZXP1V8HdM;
    public final Object vekpFI4d1Nc4fakF;
    public int w9sT1Swbhx3hs;

    public PptKtqDFv7XjzC1Mly6V(Context context) {
        this.w9sT1Swbhx3hs = 0;
        this.vekpFI4d1Nc4fakF = context;
    }

    private static /* synthetic */ void jdacejzz() {
    }

    public synchronized int dDIMxZXP1V8HdM() {
        PackageInfo packageInfo;
        if (this.dDIMxZXP1V8HdM == 0) {
            try {
                packageInfo = I5wRTRZp0psyO1L.dDIMxZXP1V8HdM((Context) this.vekpFI4d1Nc4fakF).dDIMxZXP1V8HdM.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e) {
                "Failed to find package ".concat(e.toString());
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.dDIMxZXP1V8HdM = packageInfo.versionCode;
            }
        }
        return this.dDIMxZXP1V8HdM;
    }

    public synchronized int w9sT1Swbhx3hs() {
        int i = this.w9sT1Swbhx3hs;
        if (i != 0) {
            return i;
        }
        Context context = (Context) this.vekpFI4d1Nc4fakF;
        PackageManager packageManager = context.getPackageManager();
        if (I5wRTRZp0psyO1L.dDIMxZXP1V8HdM(context).dDIMxZXP1V8HdM.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            return 0;
        }
        Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
        intent.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers == null || listQueryBroadcastReceivers.isEmpty()) {
            this.w9sT1Swbhx3hs = 2;
            return 2;
        }
        this.w9sT1Swbhx3hs = 2;
        return 2;
    }

    public PptKtqDFv7XjzC1Mly6V() {
        this.vekpFI4d1Nc4fakF = new PptKtqDFv7XjzC1Mly6V[256];
        this.dDIMxZXP1V8HdM = 0;
        this.w9sT1Swbhx3hs = 0;
    }

    public PptKtqDFv7XjzC1Mly6V(int i, int i2) {
        this.vekpFI4d1Nc4fakF = null;
        this.dDIMxZXP1V8HdM = i;
        int i3 = i2 & 7;
        this.w9sT1Swbhx3hs = i3 == 0 ? 8 : i3;
    }
}
