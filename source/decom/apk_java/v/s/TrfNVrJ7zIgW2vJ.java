package v.s;

import android.app.AppOpsManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.Process;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class TrfNVrJ7zIgW2vJ {
    /* JADX WARN: Code duplicated, block: B:31:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a6  */
    public static Intent dDIMxZXP1V8HdM(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        int iVekpFI4d1Nc4fakF;
        if ((i & 4) == 0 || str != null) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i & 1);
        }
        String str2 = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        byte b = -1;
        if (context.checkPermission(str2, iMyPid, iMyUid) != -1) {
            String strJXn4Qf7zpnLjP5 = d6c98qX7r0XzUZFibx.JXn4Qf7zpnLjP5(str2);
            if (strJXn4Qf7zpnLjP5 == null) {
                b = 0;
            } else if (packageName != null) {
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid || !Mcngq0nRJGlzNPdrzNDO.dDIMxZXP1V8HdM(packageName2, packageName) || Build.VERSION.SDK_INT < 29) {
                    iVekpFI4d1Nc4fakF = d6c98qX7r0XzUZFibx.vekpFI4d1Nc4fakF((AppOpsManager) d6c98qX7r0XzUZFibx.dDIMxZXP1V8HdM(context, AppOpsManager.class), strJXn4Qf7zpnLjP5, packageName);
                } else {
                    AppOpsManager appOpsManagerVekpFI4d1Nc4fakF = PKzJf7Iq6ie0OaUSZLp.vekpFI4d1Nc4fakF(context);
                    iVekpFI4d1Nc4fakF = PKzJf7Iq6ie0OaUSZLp.dDIMxZXP1V8HdM(appOpsManagerVekpFI4d1Nc4fakF, strJXn4Qf7zpnLjP5, Binder.getCallingUid(), packageName);
                    if (iVekpFI4d1Nc4fakF == 0) {
                        iVekpFI4d1Nc4fakF = PKzJf7Iq6ie0OaUSZLp.dDIMxZXP1V8HdM(appOpsManagerVekpFI4d1Nc4fakF, strJXn4Qf7zpnLjP5, iMyUid, PKzJf7Iq6ie0OaUSZLp.w9sT1Swbhx3hs(context));
                    }
                }
                if (iVekpFI4d1Nc4fakF == 0) {
                    b = 0;
                } else {
                    b = -2;
                }
            } else {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                if (packagesForUid != null && packagesForUid.length > 0) {
                    packageName = packagesForUid[0];
                    int iMyUid3 = Process.myUid();
                    String packageName3 = context.getPackageName();
                    iVekpFI4d1Nc4fakF = iMyUid3 == iMyUid ? d6c98qX7r0XzUZFibx.vekpFI4d1Nc4fakF((AppOpsManager) d6c98qX7r0XzUZFibx.dDIMxZXP1V8HdM(context, AppOpsManager.class), strJXn4Qf7zpnLjP5, packageName) : d6c98qX7r0XzUZFibx.vekpFI4d1Nc4fakF((AppOpsManager) d6c98qX7r0XzUZFibx.dDIMxZXP1V8HdM(context, AppOpsManager.class), strJXn4Qf7zpnLjP5, packageName);
                    if (iVekpFI4d1Nc4fakF == 0) {
                        b = 0;
                    } else {
                        b = -2;
                    }
                }
            }
        }
        if (b == 0) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str2, handler);
        }
        throw new RuntimeException("Permission " + str2 + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    public static ComponentName w9sT1Swbhx3hs(Context context, Intent intent) {
        return context.startForegroundService(intent);
    }
}
