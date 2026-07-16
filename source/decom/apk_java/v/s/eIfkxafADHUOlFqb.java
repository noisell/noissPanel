package v.s;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class eIfkxafADHUOlFqb {
    public static final int dDIMxZXP1V8HdM;

    static {
        int i = WUKu8Lj5A4IfwZ.vekpFI4d1Nc4fakF;
        dDIMxZXP1V8HdM = 12451000;
    }

    private static /* synthetic */ void dpmmvfte() {
    }

    public Intent dDIMxZXP1V8HdM(int i, Context context, String str) {
        if (i != (-54) + 55 && i != 2) {
            if (i != 3) {
                return null;
            }
            int i2 = Zj9BGvFK9KzfSwa.dDIMxZXP1V8HdM;
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && okc5AGRjqrud84oM6d.gIIiyi2ddlMDR0(context)) {
            int i3 = Zj9BGvFK9KzfSwa.dDIMxZXP1V8HdM;
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder("gcore_");
        sb.append(dDIMxZXP1V8HdM);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                rJtRT3pOA9KOQCsVr3 rjtrt3poa9koqcsvr3DDIMxZXP1V8HdM = I5wRTRZp0psyO1L.dDIMxZXP1V8HdM(context);
                sb.append(rjtrt3poa9koqcsvr3DDIMxZXP1V8HdM.dDIMxZXP1V8HdM.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb.toString();
        int i4 = Zj9BGvFK9KzfSwa.dDIMxZXP1V8HdM;
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x018f  */
    /* JADX WARN: Code duplicated, block: B:108:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:109:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:135:0x0193 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:86:0x015c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0179  */
    /* JADX WARN: Code duplicated, block: B:93:0x017e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0181  */
    /* JADX WARN: Code duplicated, block: B:97:0x0186  */
    /* JADX WARN: Code duplicated, block: B:99:0x018a  */
    /* JADX WARN: Instruction removed from duplicated block: B:91:0x0179, please report this as an issue */
    public int w9sT1Swbhx3hs(Context context, int i) {
        boolean z;
        PackageInfo packageInfo;
        int i2;
        int i3;
        ApplicationInfo applicationInfo;
        int i4 = WUKu8Lj5A4IfwZ.vekpFI4d1Nc4fakF;
        try {
            context.getResources().getString(2131427346);
        } catch (Throwable unused) {
        }
        boolean z2 = true;
        if (!"com.google.android.gms".equals(context.getPackageName()) && !WUKu8Lj5A4IfwZ.w9sT1Swbhx3hs.get()) {
            synchronized (RIZfHbqXpth8r2yN4.vekpFI4d1Nc4fakF) {
                try {
                    if (!RIZfHbqXpth8r2yN4.JXn4Qf7zpnLjP5) {
                        RIZfHbqXpth8r2yN4.JXn4Qf7zpnLjP5 = true;
                        try {
                            Bundle bundle = I5wRTRZp0psyO1L.dDIMxZXP1V8HdM(context).dDIMxZXP1V8HdM.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                            if (bundle != null) {
                                bundle.getString("com.google.app.id");
                                RIZfHbqXpth8r2yN4.Ee8d2j4S9Vm5yGuR = bundle.getInt("com.google.android.gms.version");
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int i5 = RIZfHbqXpth8r2yN4.Ee8d2j4S9Vm5yGuR;
            if (i5 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i5 != 12451000) {
                throw new GooglePlayServicesIncorrectManifestValueException("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected " + dDIMxZXP1V8HdM + " but found " + i5 + ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            }
        }
        if (okc5AGRjqrud84oM6d.gIIiyi2ddlMDR0(context)) {
            z = false;
        } else {
            if (okc5AGRjqrud84oM6d.b1EoSIRjJHO5 == null) {
                okc5AGRjqrud84oM6d.b1EoSIRjJHO5 = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
            }
            if (okc5AGRjqrud84oM6d.b1EoSIRjJHO5.booleanValue()) {
                z = false;
            } else {
                z = true;
            }
        }
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        int i6 = 9;
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException unused3) {
                String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing.");
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            synchronized (fEyMFFyOOvHURJ7To6L.class) {
                if (fEyMFFyOOvHURJ7To6L.vekpFI4d1Nc4fakF == null) {
                    yZmnwGUeOE0cyfVzXDK yzmnwgueoe0cyfvzxdk = n22iY7IsOHjG.dDIMxZXP1V8HdM;
                    synchronized (n22iY7IsOHjG.class) {
                        try {
                            if (n22iY7IsOHjG.vekpFI4d1Nc4fakF == null) {
                                n22iY7IsOHjG.vekpFI4d1Nc4fakF = context.getApplicationContext();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6l = new fEyMFFyOOvHURJ7To6L(0);
                    context.getApplicationContext();
                    fEyMFFyOOvHURJ7To6L.vekpFI4d1Nc4fakF = feymffyoovhurj7to6l;
                }
            }
            if (!fEyMFFyOOvHURJ7To6L.J0zjQ7CAgohuxU20eCW6(packageInfo2)) {
                String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid.");
            } else if (z) {
                SbxdZ6Kq2uhHQ5RPRqm.ibVTtJUNfrGYbW(packageInfo);
                if (!fEyMFFyOOvHURJ7To6L.J0zjQ7CAgohuxU20eCW6(packageInfo)) {
                    String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid.");
                } else if (z || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    i2 = packageInfo2.versionCode;
                    if (i2 == -1) {
                        i3 = -1;
                    } else {
                        i3 = i2 / 1000;
                    }
                    if (i3 < (i != -1 ? i / 1000 : -1)) {
                        i6 = (-80) + 82;
                    } else {
                        applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            try {
                                applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                            } catch (PackageManager.NameNotFoundException unused4) {
                                String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info.");
                                i6 = 1;
                            }
                        }
                        if (applicationInfo.enabled) {
                            i6 = 0;
                        } else {
                            i6 = 3;
                        }
                    }
                } else {
                    String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services.");
                }
            } else if (z) {
                i2 = packageInfo2.versionCode;
                if (i2 == -1) {
                    i3 = -1;
                } else {
                    i3 = i2 / 1000;
                }
                if (i3 < (i != -1 ? i / 1000 : -1)) {
                    i6 = (-80) + 82;
                } else {
                    applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                    }
                    if (applicationInfo.enabled) {
                        i6 = 3;
                    } else {
                        i6 = 0;
                    }
                }
            } else {
                i2 = packageInfo2.versionCode;
                if (i2 == -1) {
                    i3 = -1;
                } else {
                    i3 = i2 / 1000;
                }
                if (i3 < (i != -1 ? i / 1000 : -1)) {
                    i6 = (-80) + 82;
                } else {
                    applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                    }
                    if (applicationInfo.enabled) {
                        i6 = 3;
                    } else {
                        i6 = 0;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused5) {
            String.valueOf(packageName).concat(" requires Google Play services, but they are missing.");
        }
        if (i6 != 18) {
            if (i6 == 1) {
                try {
                    Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                    while (it.hasNext()) {
                        if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                        }
                    }
                    z2 = context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
                } catch (PackageManager.NameNotFoundException | Exception unused6) {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
        }
        if (z2) {
            return 18;
        }
        return i6;
    }
}
