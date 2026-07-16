package v.s;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class wm29dOL0HZT4SW65 {
    public final Object JXn4Qf7zpnLjP5;
    public boolean dDIMxZXP1V8HdM;
    public Serializable vekpFI4d1Nc4fakF;
    public final Object w9sT1Swbhx3hs;

    public wm29dOL0HZT4SW65(FirebaseMessaging firebaseMessaging, RqLIwoK3mjYHtQ7Aj rqLIwoK3mjYHtQ7Aj) {
        this.JXn4Qf7zpnLjP5 = firebaseMessaging;
        this.w9sT1Swbhx3hs = rqLIwoK3mjYHtQ7Aj;
    }

    public int[] dDIMxZXP1V8HdM() {
        synchronized (this) {
            try {
                if (!this.dDIMxZXP1V8HdM) {
                    return null;
                }
                long[] jArr = (long[]) this.w9sT1Swbhx3hs;
                int length = jArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    int i4 = 1;
                    boolean z = jArr[i] > 0;
                    boolean[] zArr = (boolean[]) this.vekpFI4d1Nc4fakF;
                    if (z != zArr[i2]) {
                        int[] iArr = (int[]) this.JXn4Qf7zpnLjP5;
                        if (!z) {
                            i4 = 2;
                        }
                        iArr[i2] = i4;
                    } else {
                        ((int[]) this.JXn4Qf7zpnLjP5)[i2] = 0;
                    }
                    zArr[i2] = z;
                    i++;
                    i2 = i3;
                }
                this.dDIMxZXP1V8HdM = false;
                return (int[]) ((int[]) this.JXn4Qf7zpnLjP5).clone();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Boolean vekpFI4d1Nc4fakF() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        dfwkxUDiclPw1BowH4 dfwkxudiclpw1bowh4 = ((FirebaseMessaging) this.JXn4Qf7zpnLjP5).dDIMxZXP1V8HdM;
        dfwkxudiclpw1bowh4.dDIMxZXP1V8HdM();
        Context context = dfwkxudiclpw1bowh4.dDIMxZXP1V8HdM;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public synchronized boolean w9sT1Swbhx3hs() {
        boolean z;
        boolean zBooleanValue;
        try {
            synchronized (this) {
                try {
                    if (!this.dDIMxZXP1V8HdM) {
                        Boolean boolVekpFI4d1Nc4fakF = vekpFI4d1Nc4fakF();
                        this.vekpFI4d1Nc4fakF = boolVekpFI4d1Nc4fakF;
                        if (boolVekpFI4d1Nc4fakF == null) {
                            ((KkDKQuF0Y4jTwIefNU) ((RqLIwoK3mjYHtQ7Aj) this.w9sT1Swbhx3hs)).dDIMxZXP1V8HdM(new UeVBYgBvSKYfVuXLhMs(12));
                        }
                        this.dDIMxZXP1V8HdM = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zBooleanValue;
        } catch (Throwable th2) {
            throw th2;
        }
        Boolean bool = (Boolean) this.vekpFI4d1Nc4fakF;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            dfwkxUDiclPw1BowH4 dfwkxudiclpw1bowh4 = ((FirebaseMessaging) this.JXn4Qf7zpnLjP5).dDIMxZXP1V8HdM;
            dfwkxudiclpw1bowh4.dDIMxZXP1V8HdM();
            gvOlsH7NUhtM4SC gvolsh7nuhtm4sc = (gvOlsH7NUhtM4SC) dfwkxudiclpw1bowh4.ibVTtJUNfrGYbW.get();
            synchronized (gvolsh7nuhtm4sc) {
                z = gvolsh7nuhtm4sc.dDIMxZXP1V8HdM;
            }
            zBooleanValue = z;
        }
        return zBooleanValue;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean[], java.io.Serializable] */
    public wm29dOL0HZT4SW65(int i) {
        this.w9sT1Swbhx3hs = new long[i];
        this.vekpFI4d1Nc4fakF = new boolean[i];
        this.JXn4Qf7zpnLjP5 = new int[i];
    }
}
