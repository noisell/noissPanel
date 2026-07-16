package v.s;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Base64;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class Hnsrhf2jJV8dCt implements pARxL2hv3Xoc, aTR0Fvd9tAh4Aa {
    public static RYW6r6dK10fdDcUQ Ee8d2j4S9Vm5yGuR;
    public static final Object JXn4Qf7zpnLjP5 = new Object();
    public Object vekpFI4d1Nc4fakF;
    public Object w9sT1Swbhx3hs;

    public /* synthetic */ Hnsrhf2jJV8dCt(Object obj, Object obj2) {
        this.w9sT1Swbhx3hs = obj;
        this.vekpFI4d1Nc4fakF = obj2;
    }

    private static /* synthetic */ void qdkwmsrr() {
    }

    public static SQzPENpgvzKX9IlD w9sT1Swbhx3hs(Context context, Intent intent, boolean z) {
        RYW6r6dK10fdDcUQ rYW6r6dK10fdDcUQ;
        synchronized (JXn4Qf7zpnLjP5) {
            try {
                if (Ee8d2j4S9Vm5yGuR == null) {
                    Ee8d2j4S9Vm5yGuR = new RYW6r6dK10fdDcUQ(context);
                }
                rYW6r6dK10fdDcUQ = Ee8d2j4S9Vm5yGuR;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z) {
            return rYW6r6dK10fdDcUQ.w9sT1Swbhx3hs(intent).ibVTtJUNfrGYbW(new UE6365QWSHVg5Fff(1), new UeVBYgBvSKYfVuXLhMs(6));
        }
        if (mYrXZiFjFW2Xg.dDIMxZXP1V8HdM().vekpFI4d1Nc4fakF(context)) {
            synchronized (vM8ZJw883KaO.w9sT1Swbhx3hs) {
                try {
                    vM8ZJw883KaO.dDIMxZXP1V8HdM(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        vM8ZJw883KaO.vekpFI4d1Nc4fakF.dDIMxZXP1V8HdM(vM8ZJw883KaO.dDIMxZXP1V8HdM);
                    }
                    SQzPENpgvzKX9IlD sQzPENpgvzKX9IlDW9sT1Swbhx3hs = rYW6r6dK10fdDcUQ.w9sT1Swbhx3hs(intent);
                    rA0nQJPukyMi ra0nqjpukymi = new rA0nQJPukyMi(8, intent);
                    sQzPENpgvzKX9IlDW9sT1Swbhx3hs.getClass();
                    sQzPENpgvzKX9IlDW9sT1Swbhx3hs.w9sT1Swbhx3hs.vekpFI4d1Nc4fakF(new x5CIqN8F1vjSbVyt9vrp((Executor) uwCvwKxW5TmMNPa1.dDIMxZXP1V8HdM, (hYMmDgRUK0a6MaJzT) ra0nqjpukymi));
                    sQzPENpgvzKX9IlDW9sT1Swbhx3hs.wotphlvK9sPbXJ();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            rYW6r6dK10fdDcUQ.w9sT1Swbhx3hs(intent);
        }
        return SbxdZ6Kq2uhHQ5RPRqm.wotphlvK9sPbXJ(-1);
    }

    public void D5P1xCAyuvgF(r9c8qUHbkyLZi r9c8quhbkylzi, int i) {
        ((fUH025aw0Rgl) this.vekpFI4d1Nc4fakF).w9sT1Swbhx3hs(new Qs7pEhrUyxRnfgePs((DP5sXJhndWh8c4VkCzdA) this.w9sT1Swbhx3hs, r9c8quhbkylzi, false, i));
    }

    public ArrayList Ee8d2j4S9Vm5yGuR(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.w9sT1Swbhx3hs;
        eZ6soZeOs7kkqZcCQFOR ez6sozeos7kkqzccqforD5P1xCAyuvgF = eZ6soZeOs7kkqZcCQFOR.D5P1xCAyuvgF("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            ez6sozeos7kkqzccqforD5P1xCAyuvgF.xDyLpEZyrcKVe0(1);
        } else {
            ez6sozeos7kkqzccqforD5P1xCAyuvgF.MLSIo1htfMPWeB8V876L(str, 1);
        }
        workDatabase_Impl.w9sT1Swbhx3hs();
        Cursor cursorGmNWMfvn6zlEj = workDatabase_Impl.gmNWMfvn6zlEj(ez6sozeos7kkqzccqforD5P1xCAyuvgF);
        try {
            ArrayList arrayList = new ArrayList(cursorGmNWMfvn6zlEj.getCount());
            while (cursorGmNWMfvn6zlEj.moveToNext()) {
                arrayList.add(cursorGmNWMfvn6zlEj.isNull(0) ? null : cursorGmNWMfvn6zlEj.getString(0));
            }
            return arrayList;
        } finally {
            cursorGmNWMfvn6zlEj.close();
            ez6sozeos7kkqzccqforD5P1xCAyuvgF.hjneShqpF9Tis4();
        }
    }

    public File JXn4Qf7zpnLjP5() {
        if (((File) this.w9sT1Swbhx3hs) == null) {
            synchronized (this) {
                try {
                    if (((File) this.w9sT1Swbhx3hs) == null) {
                        dfwkxUDiclPw1BowH4 dfwkxudiclpw1bowh4 = (dfwkxUDiclPw1BowH4) this.vekpFI4d1Nc4fakF;
                        dfwkxudiclpw1bowh4.dDIMxZXP1V8HdM();
                        this.w9sT1Swbhx3hs = new File(dfwkxudiclpw1bowh4.dDIMxZXP1V8HdM.getFilesDir(), "PersistedInstallation." + ((dfwkxUDiclPw1BowH4) this.vekpFI4d1Nc4fakF).vekpFI4d1Nc4fakF() + ".json");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (File) this.w9sT1Swbhx3hs;
    }

    public qhsM0NLCW4lYFI8kGz b1EoSIRjJHO5() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 16361 + 23;
        byte[] bArr = new byte[i];
        try {
            FileInputStream fileInputStream = new FileInputStream(JXn4Qf7zpnLjP5());
            while (true) {
                try {
                    int i2 = fileInputStream.read(bArr, 0, i);
                    if (i2 < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i2);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i3 = Y9mRyRdkl5FOcwb66V6.H9XlUr4OeMJFiXK(5)[iOptInt];
        if (i3 == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        String str = i3 == 0 ? " registrationStatus" : "";
        if (str.isEmpty()) {
            return new qhsM0NLCW4lYFI8kGz(strOptString, i3, strOptString2, strOptString3, jOptLong2, jOptLong, strOptString4);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // v.s.aTR0Fvd9tAh4Aa
    public Object dDIMxZXP1V8HdM(DfUmSWZwfhCUz dfUmSWZwfhCUz) {
        Bundle bundle;
        OfLkl9rR9exIS ofLkl9rR9exIS = (OfLkl9rR9exIS) this.w9sT1Swbhx3hs;
        Bundle bundle2 = (Bundle) this.vekpFI4d1Nc4fakF;
        ofLkl9rR9exIS.getClass();
        return (dfUmSWZwfhCUz.xDyLpEZyrcKVe0() && (bundle = (Bundle) dfUmSWZwfhCUz.JXn4Qf7zpnLjP5()) != null && bundle.containsKey("google.messenger")) ? ofLkl9rR9exIS.dDIMxZXP1V8HdM(bundle2).pyu8ovAipBTLYAiKab(S7iZMVp9ciczvGPfF.JXn4Qf7zpnLjP5, fadfsJa4iEdiwEC4Xm8.hjneShqpF9Tis4) : dfUmSWZwfhCUz;
    }

    @Override // v.s.RZKLDkRu6ZWDxTDL71X
    public Object get() {
        fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6l = new fEyMFFyOOvHURJ7To6L(18);
        fadfsJa4iEdiwEC4Xm8 fadfsja4iediwec4xm8 = new fadfsJa4iEdiwEC4Xm8(17);
        Object obj = ((RZKLDkRu6ZWDxTDL71X) this.w9sT1Swbhx3hs).get();
        RZKLDkRu6ZWDxTDL71X rZKLDkRu6ZWDxTDL71X = (RZKLDkRu6ZWDxTDL71X) this.vekpFI4d1Nc4fakF;
        return new c0GsmbUiugE231HPbX(feymffyoovhurj7to6l, fadfsja4iediwec4xm8, bqyPVYVs67un5CcbShz.xDyLpEZyrcKVe0, (gOGZ1ZK6M3bWo9) obj, rZKLDkRu6ZWDxTDL71X);
    }

    public SQzPENpgvzKX9IlD ibVTtJUNfrGYbW(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final Context context = (Context) this.w9sT1Swbhx3hs;
        UE6365QWSHVg5Fff uE6365QWSHVg5Fff = (UE6365QWSHVg5Fff) this.vekpFI4d1Nc4fakF;
        boolean z = context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z2 = (intent.getFlags() & 268435456) != 0;
        return (!z || z2) ? SbxdZ6Kq2uhHQ5RPRqm.vekpFI4d1Nc4fakF(uE6365QWSHVg5Fff, new Callable() { // from class: v.s.HLcM4gFkW0yR
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                ServiceInfo serviceInfo;
                String str2;
                int i;
                Context context2 = context;
                Intent intent2 = intent;
                mYrXZiFjFW2Xg myrxzifjfw2xgDDIMxZXP1V8HdM = mYrXZiFjFW2Xg.dDIMxZXP1V8HdM();
                ((ArrayDeque) myrxzifjfw2xgDDIMxZXP1V8HdM.Ee8d2j4S9Vm5yGuR).offer(intent2);
                Intent intent3 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent3.setPackage(context2.getPackageName());
                synchronized (myrxzifjfw2xgDDIMxZXP1V8HdM) {
                    try {
                        str = (String) myrxzifjfw2xgDDIMxZXP1V8HdM.w9sT1Swbhx3hs;
                        if (str == null) {
                            ResolveInfo resolveInfoResolveService = context2.getPackageManager().resolveService(intent3, 0);
                            if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null || !context2.getPackageName().equals(serviceInfo.packageName) || (str2 = serviceInfo.name) == null) {
                                str = null;
                            } else {
                                if (str2.startsWith(".")) {
                                    myrxzifjfw2xgDDIMxZXP1V8HdM.w9sT1Swbhx3hs = context2.getPackageName() + serviceInfo.name;
                                } else {
                                    myrxzifjfw2xgDDIMxZXP1V8HdM.w9sT1Swbhx3hs = serviceInfo.name;
                                }
                                str = (String) myrxzifjfw2xgDDIMxZXP1V8HdM.w9sT1Swbhx3hs;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (str != null) {
                    intent3.setClassName(context2.getPackageName(), str);
                }
                try {
                    i = (myrxzifjfw2xgDDIMxZXP1V8HdM.vekpFI4d1Nc4fakF(context2) ? vM8ZJw883KaO.vekpFI4d1Nc4fakF(context2, intent3) : context2.startService(intent3)) == null ? 306 + 98 : -1;
                } catch (IllegalStateException e) {
                    e.toString();
                    i = 402;
                } catch (SecurityException unused) {
                    i = 401;
                }
                return Integer.valueOf(i);
            }
        }).b1EoSIRjJHO5(uE6365QWSHVg5Fff, new aTR0Fvd9tAh4Aa() { // from class: v.s.Xnqs64T3ROvRdBdeBjv
            @Override // v.s.aTR0Fvd9tAh4Aa
            public final Object dDIMxZXP1V8HdM(DfUmSWZwfhCUz dfUmSWZwfhCUz) {
                return ((Integer) dfUmSWZwfhCUz.JXn4Qf7zpnLjP5()).intValue() != 402 ? dfUmSWZwfhCUz : Hnsrhf2jJV8dCt.w9sT1Swbhx3hs(context, intent, z2).ibVTtJUNfrGYbW(new UE6365QWSHVg5Fff(1), new UeVBYgBvSKYfVuXLhMs(5));
            }
        }) : w9sT1Swbhx3hs(context, intent, z2);
    }

    public void pyu8ovAipBTLYAiKab(r9c8qUHbkyLZi r9c8quhbkylzi, W6dfON4KdcdxlH w6dfON4KdcdxlH) {
        ((fUH025aw0Rgl) this.vekpFI4d1Nc4fakF).w9sT1Swbhx3hs(new qjpsB7oD4nN4npCMR4XF((DP5sXJhndWh8c4VkCzdA) this.w9sT1Swbhx3hs, r9c8quhbkylzi, w6dfON4KdcdxlH, 1));
    }

    public CctBackendFactory vekpFI4d1Nc4fakF(String str) {
        Bundle bundle;
        Map map;
        ServiceInfo serviceInfo;
        if (((Map) this.vekpFI4d1Nc4fakF) == null) {
            Context context = (Context) this.w9sT1Swbhx3hs;
            try {
                PackageManager packageManager = context.getPackageManager();
                bundle = (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128)) == null) ? null : serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (bundle == null) {
                map = Collections.EMPTY_MAP;
            } else {
                HashMap map2 = new HashMap();
                for (String str2 : bundle.keySet()) {
                    Object obj = bundle.get(str2);
                    if ((obj instanceof String) && str2.startsWith("backend:")) {
                        for (String str3 : ((String) obj).split(",", -1)) {
                            String strTrim = str3.trim();
                            if (!strTrim.isEmpty()) {
                                map2.put(strTrim, str2.substring(8));
                            }
                        }
                    }
                }
                map = map2;
            }
            this.vekpFI4d1Nc4fakF = map;
        }
        String str4 = (String) ((Map) this.vekpFI4d1Nc4fakF).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException unused2) {
            StringBuilder sb = new StringBuilder("Class ");
            sb.append(str4);
            sb.append(" is not found.");
            return null;
        } catch (IllegalAccessException unused3) {
            StringBuilder sb2 = new StringBuilder("Could not instantiate ");
            sb2.append(str4);
            sb2.append(".");
            return null;
        } catch (InstantiationException unused4) {
            StringBuilder sb3 = new StringBuilder("Could not instantiate ");
            sb3.append(str4);
            sb3.append(".");
            return null;
        } catch (NoSuchMethodException unused5) {
            "Could not instantiate ".concat(str4);
            return null;
        } catch (InvocationTargetException unused6) {
            "Could not instantiate ".concat(str4);
            return null;
        }
    }

    public void xDyLpEZyrcKVe0(qhsM0NLCW4lYFI8kGz qhsm0nlcw4lyfi8kgz) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", qhsm0nlcw4lyfi8kgz.dDIMxZXP1V8HdM);
            jSONObject.put("Status", Y9mRyRdkl5FOcwb66V6.J0zjQ7CAgohuxU20eCW6(qhsm0nlcw4lyfi8kgz.w9sT1Swbhx3hs));
            jSONObject.put("AuthToken", qhsm0nlcw4lyfi8kgz.vekpFI4d1Nc4fakF);
            jSONObject.put("RefreshToken", qhsm0nlcw4lyfi8kgz.JXn4Qf7zpnLjP5);
            jSONObject.put("TokenCreationEpochInSecs", qhsm0nlcw4lyfi8kgz.xDyLpEZyrcKVe0);
            jSONObject.put("ExpiresInSecs", qhsm0nlcw4lyfi8kgz.Ee8d2j4S9Vm5yGuR);
            jSONObject.put("FisError", qhsm0nlcw4lyfi8kgz.ibVTtJUNfrGYbW);
            dfwkxUDiclPw1BowH4 dfwkxudiclpw1bowh4 = (dfwkxUDiclPw1BowH4) this.vekpFI4d1Nc4fakF;
            dfwkxudiclpw1bowh4.dDIMxZXP1V8HdM();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", dfwkxudiclpw1bowh4.dDIMxZXP1V8HdM.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(JXn4Qf7zpnLjP5())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public Hnsrhf2jJV8dCt(Context context, int i) {
        switch (i) {
            case 3:
                this.vekpFI4d1Nc4fakF = null;
                this.w9sT1Swbhx3hs = context;
                break;
            default:
                this.w9sT1Swbhx3hs = context;
                this.vekpFI4d1Nc4fakF = new UE6365QWSHVg5Fff(1);
                break;
        }
    }
}
