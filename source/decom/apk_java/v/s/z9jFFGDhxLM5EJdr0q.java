package v.s;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class z9jFFGDhxLM5EJdr0q {
    public static final CqFI2TATM8BM dDIMxZXP1V8HdM = new CqFI2TATM8BM();
    public static final Object w9sT1Swbhx3hs = new Object();
    public static fadfsJa4iEdiwEC4Xm8 vekpFI4d1Nc4fakF = null;

    public static long dDIMxZXP1V8HdM(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? qWMJliJ37h9mbEL4sdd.dDIMxZXP1V8HdM(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static void vekpFI4d1Nc4fakF(Context context, boolean z) {
        nun0xIAdZq1q8DxhG5c nun0xiadzq1q8dxhg5cDDIMxZXP1V8HdM;
        int i;
        if (z || vekpFI4d1Nc4fakF == null) {
            synchronized (w9sT1Swbhx3hs) {
                if (!z) {
                    try {
                        if (vekpFI4d1Nc4fakF != null) {
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 28 && i2 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    int i3 = 0;
                    boolean z2 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z3 = file2.exists() && length2 > 0;
                    try {
                        long jDDIMxZXP1V8HdM = dDIMxZXP1V8HdM(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                nun0xiadzq1q8dxhg5cDDIMxZXP1V8HdM = nun0xIAdZq1q8DxhG5c.dDIMxZXP1V8HdM(file3);
                            } catch (IOException unused) {
                                w9sT1Swbhx3hs();
                                return;
                            }
                        } else {
                            nun0xiadzq1q8dxhg5cDDIMxZXP1V8HdM = null;
                        }
                        if (nun0xiadzq1q8dxhg5cDDIMxZXP1V8HdM != null && nun0xiadzq1q8dxhg5cDDIMxZXP1V8HdM.vekpFI4d1Nc4fakF == jDDIMxZXP1V8HdM && (i = nun0xiadzq1q8dxhg5cDDIMxZXP1V8HdM.w9sT1Swbhx3hs) != 2) {
                            i3 = i;
                        } else if (z2) {
                            i3 = 1;
                        } else if (z3) {
                            i3 = 2;
                        }
                        if (z && z3 && i3 != 1) {
                            i3 = 2;
                        }
                        if (nun0xiadzq1q8dxhg5cDDIMxZXP1V8HdM != null && nun0xiadzq1q8dxhg5cDDIMxZXP1V8HdM.w9sT1Swbhx3hs == 2 && i3 == 1 && length < nun0xiadzq1q8dxhg5cDDIMxZXP1V8HdM.JXn4Qf7zpnLjP5) {
                            i3 = 3;
                        }
                        nun0xIAdZq1q8DxhG5c nun0xiadzq1q8dxhg5c = new nun0xIAdZq1q8DxhG5c(1, i3, jDDIMxZXP1V8HdM, length2);
                        if (nun0xiadzq1q8dxhg5cDDIMxZXP1V8HdM == null || !nun0xiadzq1q8dxhg5cDDIMxZXP1V8HdM.equals(nun0xiadzq1q8dxhg5c)) {
                            try {
                                nun0xiadzq1q8dxhg5c.w9sT1Swbhx3hs(file3);
                            } catch (IOException unused2) {
                            }
                        }
                        w9sT1Swbhx3hs();
                        return;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        w9sT1Swbhx3hs();
                        return;
                    }
                }
                w9sT1Swbhx3hs();
            }
        }
    }

    public static fadfsJa4iEdiwEC4Xm8 w9sT1Swbhx3hs() {
        fadfsJa4iEdiwEC4Xm8 fadfsja4iediwec4xm8 = new fadfsJa4iEdiwEC4Xm8(14);
        vekpFI4d1Nc4fakF = fadfsja4iediwec4xm8;
        CqFI2TATM8BM cqFI2TATM8BM = dDIMxZXP1V8HdM;
        cqFI2TATM8BM.getClass();
        if (O2DHNSIGZlgPja7eqLgn.ibVTtJUNfrGYbW.JXn4Qf7zpnLjP5(cqFI2TATM8BM, null, fadfsja4iediwec4xm8)) {
            O2DHNSIGZlgPja7eqLgn.JXn4Qf7zpnLjP5(cqFI2TATM8BM);
        }
        return vekpFI4d1Nc4fakF;
    }
}
