package v.s;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class xXexZC0ehrqHnWzLCz {
    public Object Ee8d2j4S9Vm5yGuR;
    public Object JXn4Qf7zpnLjP5;
    public Object dDIMxZXP1V8HdM;
    public Object vekpFI4d1Nc4fakF;
    public Object w9sT1Swbhx3hs;
    public Object xDyLpEZyrcKVe0;

    public SQzPENpgvzKX9IlD Ee8d2j4S9Vm5yGuR(String str, String str2, Bundle bundle) {
        int i;
        try {
            JXn4Qf7zpnLjP5(str, str2, bundle);
            OfLkl9rR9exIS ofLkl9rR9exIS = (OfLkl9rR9exIS) this.vekpFI4d1Nc4fakF;
            S7iZMVp9ciczvGPfF s7iZMVp9ciczvGPfF = S7iZMVp9ciczvGPfF.JXn4Qf7zpnLjP5;
            PptKtqDFv7XjzC1Mly6V pptKtqDFv7XjzC1Mly6V = ofLkl9rR9exIS.vekpFI4d1Nc4fakF;
            if (pptKtqDFv7XjzC1Mly6V.dDIMxZXP1V8HdM() >= 12000000) {
                NeMF2Rxt7VnmPi5V neMF2Rxt7VnmPi5VDDIMxZXP1V8HdM = NeMF2Rxt7VnmPi5V.dDIMxZXP1V8HdM(ofLkl9rR9exIS.w9sT1Swbhx3hs);
                synchronized (neMF2Rxt7VnmPi5VDDIMxZXP1V8HdM) {
                    i = neMF2Rxt7VnmPi5VDDIMxZXP1V8HdM.JXn4Qf7zpnLjP5;
                    neMF2Rxt7VnmPi5VDDIMxZXP1V8HdM.JXn4Qf7zpnLjP5 = i + 1;
                }
                return neMF2Rxt7VnmPi5VDDIMxZXP1V8HdM.w9sT1Swbhx3hs(new wx1uy9kWo2J3(i, 1, bundle, 1)).ibVTtJUNfrGYbW(s7iZMVp9ciczvGPfF, W6dfON4KdcdxlH.D5P1xCAyuvgF);
            }
            if (pptKtqDFv7XjzC1Mly6V.w9sT1Swbhx3hs() != 0) {
                return ofLkl9rR9exIS.dDIMxZXP1V8HdM(bundle).b1EoSIRjJHO5(s7iZMVp9ciczvGPfF, new Hnsrhf2jJV8dCt(ofLkl9rR9exIS, bundle));
            }
            IOException iOException = new IOException("MISSING_INSTANCEID_SERVICE");
            SQzPENpgvzKX9IlD sQzPENpgvzKX9IlD = new SQzPENpgvzKX9IlD();
            sQzPENpgvzKX9IlD.D5P1xCAyuvgF(iOException);
            return sQzPENpgvzKX9IlD;
        } catch (InterruptedException | ExecutionException e) {
            SQzPENpgvzKX9IlD sQzPENpgvzKX9IlD2 = new SQzPENpgvzKX9IlD();
            sQzPENpgvzKX9IlD2.D5P1xCAyuvgF(e);
            return sQzPENpgvzKX9IlD2;
        }
    }

    public void JXn4Qf7zpnLjP5(String str, String str2, Bundle bundle) {
        int i;
        String str3;
        String strEncodeToString;
        boolean zIbVTtJUNfrGYbW;
        int i2;
        PackageInfo packageInfo;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        dfwkxUDiclPw1BowH4 dfwkxudiclpw1bowh4 = (dfwkxUDiclPw1BowH4) this.dDIMxZXP1V8HdM;
        dfwkxudiclpw1bowh4.dDIMxZXP1V8HdM();
        bundle.putString("gmp_app_id", dfwkxudiclpw1bowh4.vekpFI4d1Nc4fakF.w9sT1Swbhx3hs);
        EPXwpnHeMDtvkKf ePXwpnHeMDtvkKf = (EPXwpnHeMDtvkKf) this.w9sT1Swbhx3hs;
        synchronized (ePXwpnHeMDtvkKf) {
            try {
                if (ePXwpnHeMDtvkKf.JXn4Qf7zpnLjP5 == 0) {
                    try {
                        packageInfo = ePXwpnHeMDtvkKf.dDIMxZXP1V8HdM.getPackageManager().getPackageInfo("com.google.android.gms", 0);
                    } catch (PackageManager.NameNotFoundException e) {
                        e.toString();
                        packageInfo = null;
                    }
                    if (packageInfo != null) {
                        ePXwpnHeMDtvkKf.JXn4Qf7zpnLjP5 = packageInfo.versionCode;
                    }
                }
                i = ePXwpnHeMDtvkKf.JXn4Qf7zpnLjP5;
            } catch (Throwable th) {
                throw th;
            }
        }
        bundle.putString("gmsv", Integer.toString(i));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((EPXwpnHeMDtvkKf) this.w9sT1Swbhx3hs).dDIMxZXP1V8HdM());
        EPXwpnHeMDtvkKf ePXwpnHeMDtvkKf2 = (EPXwpnHeMDtvkKf) this.w9sT1Swbhx3hs;
        synchronized (ePXwpnHeMDtvkKf2) {
            try {
                if (ePXwpnHeMDtvkKf2.vekpFI4d1Nc4fakF == null) {
                    ePXwpnHeMDtvkKf2.JXn4Qf7zpnLjP5();
                }
                str3 = ePXwpnHeMDtvkKf2.vekpFI4d1Nc4fakF;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        bundle.putString("app_ver_name", str3);
        dfwkxUDiclPw1BowH4 dfwkxudiclpw1bowh5 = (dfwkxUDiclPw1BowH4) this.dDIMxZXP1V8HdM;
        dfwkxudiclpw1bowh5.dDIMxZXP1V8HdM();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(dfwkxudiclpw1bowh5.w9sT1Swbhx3hs.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String str4 = ((ARQl16O9WYnJLiV4i) SbxdZ6Kq2uhHQ5RPRqm.dDIMxZXP1V8HdM(((iEFNWgvzPrlQ461CEU3) ((L3dp66w8ustOJLN7unY) this.xDyLpEZyrcKVe0)).JXn4Qf7zpnLjP5())).dDIMxZXP1V8HdM;
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("Goog-Firebase-Installations-Auth", str4);
            }
        } catch (InterruptedException | ExecutionException unused2) {
        }
        bundle.putString("appid", (String) SbxdZ6Kq2uhHQ5RPRqm.dDIMxZXP1V8HdM(((iEFNWgvzPrlQ461CEU3) ((L3dp66w8ustOJLN7unY) this.xDyLpEZyrcKVe0)).vekpFI4d1Nc4fakF()));
        bundle.putString("cliv", "fcm-23.4.1");
        kGIhwaqen3iSouOraOKT kgihwaqen3isouoraokt = (kGIhwaqen3iSouOraOKT) ((zzxeBctTPcbuazkjVgh) this.Ee8d2j4S9Vm5yGuR).get();
        JIlQIGti1DoC jIlQIGti1DoC = (JIlQIGti1DoC) ((zzxeBctTPcbuazkjVgh) this.JXn4Qf7zpnLjP5).get();
        if (kgihwaqen3isouoraokt == null || jIlQIGti1DoC == null) {
            return;
        }
        TT2KHOpLgEiQtjhkGm tT2KHOpLgEiQtjhkGm = (TT2KHOpLgEiQtjhkGm) kgihwaqen3isouoraokt;
        synchronized (tT2KHOpLgEiQtjhkGm) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            XlNqgz8EVh2x11Ly xlNqgz8EVh2x11Ly = (XlNqgz8EVh2x11Ly) tT2KHOpLgEiQtjhkGm.dDIMxZXP1V8HdM.get();
            synchronized (xlNqgz8EVh2x11Ly) {
                zIbVTtJUNfrGYbW = xlNqgz8EVh2x11Ly.ibVTtJUNfrGYbW(jCurrentTimeMillis);
            }
            if (zIbVTtJUNfrGYbW) {
                synchronized (xlNqgz8EVh2x11Ly) {
                    String strJXn4Qf7zpnLjP5 = xlNqgz8EVh2x11Ly.JXn4Qf7zpnLjP5(System.currentTimeMillis());
                    xlNqgz8EVh2x11Ly.dDIMxZXP1V8HdM.edit().putString("last-used-date", strJXn4Qf7zpnLjP5).commit();
                    xlNqgz8EVh2x11Ly.xDyLpEZyrcKVe0(strJXn4Qf7zpnLjP5);
                }
                i2 = 3;
            } else {
                i2 = 1;
            }
        }
        if (i2 != 1) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(Y9mRyRdkl5FOcwb66V6.J0zjQ7CAgohuxU20eCW6(i2)));
            bundle.putString("Firebase-Client", jIlQIGti1DoC.dDIMxZXP1V8HdM());
        }
    }

    public void dDIMxZXP1V8HdM(String str, String str2) {
        HashMap map = (HashMap) this.xDyLpEZyrcKVe0;
        if (map == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put(str, str2);
    }

    public SQzPENpgvzKX9IlD vekpFI4d1Nc4fakF(SQzPENpgvzKX9IlD sQzPENpgvzKX9IlD) {
        return sQzPENpgvzKX9IlD.ibVTtJUNfrGYbW(new UE6365QWSHVg5Fff(1), new UeVBYgBvSKYfVuXLhMs(this));
    }

    public UAg7SCKjkktbMM w9sT1Swbhx3hs() {
        String strIbVTtJUNfrGYbW = ((String) this.dDIMxZXP1V8HdM) == null ? " transportName" : "";
        if (((lIOSSTYOutyFnDV8Yx) this.vekpFI4d1Nc4fakF) == null) {
            strIbVTtJUNfrGYbW = strIbVTtJUNfrGYbW.concat(" encodedPayload");
        }
        if (((Long) this.JXn4Qf7zpnLjP5) == null) {
            strIbVTtJUNfrGYbW = Y9mRyRdkl5FOcwb66V6.ibVTtJUNfrGYbW(strIbVTtJUNfrGYbW, " eventMillis");
        }
        if (((Long) this.Ee8d2j4S9Vm5yGuR) == null) {
            strIbVTtJUNfrGYbW = Y9mRyRdkl5FOcwb66V6.ibVTtJUNfrGYbW(strIbVTtJUNfrGYbW, " uptimeMillis");
        }
        if (((HashMap) this.xDyLpEZyrcKVe0) == null) {
            strIbVTtJUNfrGYbW = Y9mRyRdkl5FOcwb66V6.ibVTtJUNfrGYbW(strIbVTtJUNfrGYbW, " autoMetadata");
        }
        if (strIbVTtJUNfrGYbW.isEmpty()) {
            return new UAg7SCKjkktbMM((String) this.dDIMxZXP1V8HdM, (Integer) this.w9sT1Swbhx3hs, (lIOSSTYOutyFnDV8Yx) this.vekpFI4d1Nc4fakF, ((Long) this.JXn4Qf7zpnLjP5).longValue(), ((Long) this.Ee8d2j4S9Vm5yGuR).longValue(), (HashMap) this.xDyLpEZyrcKVe0);
        }
        throw new IllegalStateException("Missing required properties:".concat(strIbVTtJUNfrGYbW));
    }
}
