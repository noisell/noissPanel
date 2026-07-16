package v.s;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class V20IGCy8JC99pmhwML implements bLhN5yakPGE6G {
    public final bYZKmsM130y5GVhnn Ee8d2j4S9Vm5yGuR;
    public final URL JXn4Qf7zpnLjP5;
    public final r5XEUfod5GSCCwq6c dDIMxZXP1V8HdM;
    public final int ibVTtJUNfrGYbW;
    public final Context vekpFI4d1Nc4fakF;
    public final ConnectivityManager w9sT1Swbhx3hs;
    public final bYZKmsM130y5GVhnn xDyLpEZyrcKVe0;

    public V20IGCy8JC99pmhwML(Context context, bYZKmsM130y5GVhnn byzkmsm130y5gvhnn, bYZKmsM130y5GVhnn byzkmsm130y5gvhnn2) {
        JEAVCzceAY7qFyOT jEAVCzceAY7qFyOT = new JEAVCzceAY7qFyOT();
        K56xL2OyHzI1oE k56xL2OyHzI1oE = K56xL2OyHzI1oE.dDIMxZXP1V8HdM;
        jEAVCzceAY7qFyOT.dDIMxZXP1V8HdM(qF9Q6Ob40fRrerpE.class, k56xL2OyHzI1oE);
        jEAVCzceAY7qFyOT.dDIMxZXP1V8HdM(AA5DbR8pp2wjO06aN.class, k56xL2OyHzI1oE);
        EDTqPhBm8aw9oetI eDTqPhBm8aw9oetI = EDTqPhBm8aw9oetI.dDIMxZXP1V8HdM;
        jEAVCzceAY7qFyOT.dDIMxZXP1V8HdM(jY5GWhdUHyokX.class, eDTqPhBm8aw9oetI);
        jEAVCzceAY7qFyOT.dDIMxZXP1V8HdM(p9kyUMMnzMJjKaq0.class, eDTqPhBm8aw9oetI);
        Bm99a0jlZ8eJh bm99a0jlZ8eJh = Bm99a0jlZ8eJh.dDIMxZXP1V8HdM;
        jEAVCzceAY7qFyOT.dDIMxZXP1V8HdM(CU4QGs17z50ZMsRhj.class, bm99a0jlZ8eJh);
        jEAVCzceAY7qFyOT.dDIMxZXP1V8HdM(jZnJIJ9XWyPWR6i6tCvt.class, bm99a0jlZ8eJh);
        QrrIZWTh3QYRRv1bL qrrIZWTh3QYRRv1bL = QrrIZWTh3QYRRv1bL.dDIMxZXP1V8HdM;
        jEAVCzceAY7qFyOT.dDIMxZXP1V8HdM(t9CXKrwDxrnFA6g23hZU.class, qrrIZWTh3QYRRv1bL);
        jEAVCzceAY7qFyOT.dDIMxZXP1V8HdM(p39Zh4aR40p79Ao0cCxv.class, qrrIZWTh3QYRRv1bL);
        a1zqmthPeWsMb3LPA a1zqmthpewsmb3lpa = a1zqmthPeWsMb3LPA.dDIMxZXP1V8HdM;
        jEAVCzceAY7qFyOT.dDIMxZXP1V8HdM(wnAUdPpYfSNv9.class, a1zqmthpewsmb3lpa);
        jEAVCzceAY7qFyOT.dDIMxZXP1V8HdM(l5I5SpXbt39FIPGMZQ.class, a1zqmthpewsmb3lpa);
        pKjBsZ0mj3kI8WE pkjbsz0mj3ki8we = pKjBsZ0mj3kI8WE.dDIMxZXP1V8HdM;
        jEAVCzceAY7qFyOT.dDIMxZXP1V8HdM(sSCRnSATURRg6i.class, pkjbsz0mj3ki8we);
        jEAVCzceAY7qFyOT.dDIMxZXP1V8HdM(MwZjcr6Jo2nms.class, pkjbsz0mj3ki8we);
        jEAVCzceAY7qFyOT.JXn4Qf7zpnLjP5 = true;
        this.dDIMxZXP1V8HdM = new r5XEUfod5GSCCwq6c(13, jEAVCzceAY7qFyOT);
        this.vekpFI4d1Nc4fakF = context;
        this.w9sT1Swbhx3hs = (ConnectivityManager) context.getSystemService("connectivity");
        this.JXn4Qf7zpnLjP5 = w9sT1Swbhx3hs(ULO76INtY6ygYJ.vekpFI4d1Nc4fakF);
        this.Ee8d2j4S9Vm5yGuR = byzkmsm130y5gvhnn2;
        this.xDyLpEZyrcKVe0 = byzkmsm130y5gvhnn;
        this.ibVTtJUNfrGYbW = 130000;
    }

    public static URL w9sT1Swbhx3hs(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url: " + str, e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:29:0x011c  */
    public final UAg7SCKjkktbMM dDIMxZXP1V8HdM(UAg7SCKjkktbMM uAg7SCKjkktbMM) {
        int type;
        int subtype;
        HashMap map;
        NetworkInfo activeNetworkInfo = this.w9sT1Swbhx3hs.getActiveNetworkInfo();
        xXexZC0ehrqHnWzLCz xxexzc0ehrqhnwzlczVekpFI4d1Nc4fakF = uAg7SCKjkktbMM.vekpFI4d1Nc4fakF();
        int i = Build.VERSION.SDK_INT;
        HashMap map2 = (HashMap) xxexzc0ehrqhnwzlczVekpFI4d1Nc4fakF.xDyLpEZyrcKVe0;
        if (map2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map2.put("sdk-version", String.valueOf(i));
        xxexzc0ehrqhnwzlczVekpFI4d1Nc4fakF.dDIMxZXP1V8HdM("model", Build.MODEL);
        xxexzc0ehrqhnwzlczVekpFI4d1Nc4fakF.dDIMxZXP1V8HdM("hardware", Build.HARDWARE);
        xxexzc0ehrqhnwzlczVekpFI4d1Nc4fakF.dDIMxZXP1V8HdM("device", Build.DEVICE);
        xxexzc0ehrqhnwzlczVekpFI4d1Nc4fakF.dDIMxZXP1V8HdM("product", Build.PRODUCT);
        xxexzc0ehrqhnwzlczVekpFI4d1Nc4fakF.dDIMxZXP1V8HdM("os-uild", Build.ID);
        xxexzc0ehrqhnwzlczVekpFI4d1Nc4fakF.dDIMxZXP1V8HdM("manufacturer", Build.MANUFACTURER);
        xxexzc0ehrqhnwzlczVekpFI4d1Nc4fakF.dDIMxZXP1V8HdM("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap map3 = (HashMap) xxexzc0ehrqhnwzlczVekpFI4d1Nc4fakF.xDyLpEZyrcKVe0;
        if (map3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map3.put("tz-offset", String.valueOf(offset));
        int i2 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = M2aRKtFjAXgZr79ytAww.w9sT1Swbhx3hs;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap map4 = (HashMap) xxexzc0ehrqhnwzlczVekpFI4d1Nc4fakF.xDyLpEZyrcKVe0;
        if (map4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = yp2NLvJDeqG6m3p5OdOY.w9sT1Swbhx3hs;
                subtype = 53 + 47;
            } else if (((yp2NLvJDeqG6m3p5OdOY) yp2NLvJDeqG6m3p5OdOY.w9sT1Swbhx3hs.get(subtype)) == null) {
            }
            map = (HashMap) xxexzc0ehrqhnwzlczVekpFI4d1Nc4fakF.xDyLpEZyrcKVe0;
            if (map != null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            map.put("mobile-subtype", String.valueOf(subtype));
            xxexzc0ehrqhnwzlczVekpFI4d1Nc4fakF.dDIMxZXP1V8HdM("country", Locale.getDefault().getCountry());
            xxexzc0ehrqhnwzlczVekpFI4d1Nc4fakF.dDIMxZXP1V8HdM("locale", Locale.getDefault().getLanguage());
            Context context = this.vekpFI4d1Nc4fakF;
            xxexzc0ehrqhnwzlczVekpFI4d1Nc4fakF.dDIMxZXP1V8HdM("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
            try {
                i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                jb8et6SZeK5TWMrJFxDX.hjneShqpF9Tis4("CctTransportBackend");
            }
            xxexzc0ehrqhnwzlczVekpFI4d1Nc4fakF.dDIMxZXP1V8HdM("application_build", Integer.toString(i2));
            return xxexzc0ehrqhnwzlczVekpFI4d1Nc4fakF.w9sT1Swbhx3hs();
        }
        SparseArray sparseArray3 = yp2NLvJDeqG6m3p5OdOY.w9sT1Swbhx3hs;
        subtype = 0;
        map = (HashMap) xxexzc0ehrqhnwzlczVekpFI4d1Nc4fakF.xDyLpEZyrcKVe0;
        if (map != null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put("mobile-subtype", String.valueOf(subtype));
        xxexzc0ehrqhnwzlczVekpFI4d1Nc4fakF.dDIMxZXP1V8HdM("country", Locale.getDefault().getCountry());
        xxexzc0ehrqhnwzlczVekpFI4d1Nc4fakF.dDIMxZXP1V8HdM("locale", Locale.getDefault().getLanguage());
        Context context2 = this.vekpFI4d1Nc4fakF;
        xxexzc0ehrqhnwzlczVekpFI4d1Nc4fakF.dDIMxZXP1V8HdM("mcc_mnc", ((TelephonyManager) context2.getSystemService("phone")).getSimOperator());
        i2 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
        xxexzc0ehrqhnwzlczVekpFI4d1Nc4fakF.dDIMxZXP1V8HdM("application_build", Integer.toString(i2));
        return xxexzc0ehrqhnwzlczVekpFI4d1Nc4fakF.w9sT1Swbhx3hs();
    }
}
