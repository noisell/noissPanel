package v.s;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Trace;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.messaging.EnhancedIntentService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final /* synthetic */ class cY0DNVJM1fAUrMWIl7k implements As2k35rSTTZ3RAUS, hYMmDgRUK0a6MaJzT, aTR0Fvd9tAh4Aa, VMDuz8aYZEdHqSIte, z3H4CF5ES1APfy6l {
    public final /* synthetic */ Object JXn4Qf7zpnLjP5;
    public final /* synthetic */ Object vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs;

    public /* synthetic */ cY0DNVJM1fAUrMWIl7k(Object obj, int i, Object obj2) {
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = obj;
        this.JXn4Qf7zpnLjP5 = obj2;
    }

    @Override // v.s.z3H4CF5ES1APfy6l
    public Object JXn4Qf7zpnLjP5() {
        switch (this.w9sT1Swbhx3hs) {
            case 5:
                LutdQZ2I9fVx lutdQZ2I9fVx = (LutdQZ2I9fVx) this.vekpFI4d1Nc4fakF;
                Iterable iterable = (Iterable) this.JXn4Qf7zpnLjP5;
                c0GsmbUiugE231HPbX c0gsmbuiuge231hpbx = (c0GsmbUiugE231HPbX) lutdQZ2I9fVx.vekpFI4d1Nc4fakF;
                c0gsmbuiuge231hpbx.getClass();
                if (iterable.iterator().hasNext()) {
                    c0gsmbuiuge231hpbx.dDIMxZXP1V8HdM().compileStatement("DELETE FROM events WHERE _id in " + c0GsmbUiugE231HPbX.EWUjsTERgdPbSw3NNlN(iterable)).execute();
                    break;
                }
                break;
            default:
                LutdQZ2I9fVx lutdQZ2I9fVx2 = (LutdQZ2I9fVx) this.vekpFI4d1Nc4fakF;
                for (Map.Entry entry : ((HashMap) this.JXn4Qf7zpnLjP5).entrySet()) {
                    ((c0GsmbUiugE231HPbX) lutdQZ2I9fVx2.pyu8ovAipBTLYAiKab).Qrz92kRPw4GcghAc(((Integer) entry.getValue()).intValue(), gBBpLea0L3FRWXAzN.INVALID_PAYLOD, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override // v.s.VMDuz8aYZEdHqSIte
    public Object apply(Object obj) {
        int i;
        c0GsmbUiugE231HPbX c0gsmbuiuge231hpbx = (c0GsmbUiugE231HPbX) this.vekpFI4d1Nc4fakF;
        oO26y14q3Pwf oo26y14q3pwf = (oO26y14q3Pwf) this.JXn4Qf7zpnLjP5;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        bqyPVYVs67un5CcbShz bqypvyvs67un5ccbshz = c0gsmbuiuge231hpbx.Ee8d2j4S9Vm5yGuR;
        ArrayList arrayListHjneShqpF9Tis4 = c0gsmbuiuge231hpbx.hjneShqpF9Tis4(sQLiteDatabase, oo26y14q3pwf, bqypvyvs67un5ccbshz.w9sT1Swbhx3hs);
        for (LB7U1qakabytBm lB7U1qakabytBm : LB7U1qakabytBm.values()) {
            if (lB7U1qakabytBm != oo26y14q3pwf.vekpFI4d1Nc4fakF) {
                int size = bqypvyvs67un5ccbshz.w9sT1Swbhx3hs - arrayListHjneShqpF9Tis4.size();
                if (size <= 0) {
                    break;
                }
                UWYuX9UTvV9YpFO4TOW uWYuX9UTvV9YpFO4TOWDDIMxZXP1V8HdM = oO26y14q3Pwf.dDIMxZXP1V8HdM();
                uWYuX9UTvV9YpFO4TOWDDIMxZXP1V8HdM.ibVTtJUNfrGYbW(oo26y14q3pwf.dDIMxZXP1V8HdM);
                if (lB7U1qakabytBm == null) {
                    throw new NullPointerException("Null priority");
                }
                uWYuX9UTvV9YpFO4TOWDDIMxZXP1V8HdM.JXn4Qf7zpnLjP5 = lB7U1qakabytBm;
                uWYuX9UTvV9YpFO4TOWDDIMxZXP1V8HdM.vekpFI4d1Nc4fakF = oo26y14q3pwf.w9sT1Swbhx3hs;
                arrayListHjneShqpF9Tis4.addAll(c0gsmbuiuge231hpbx.hjneShqpF9Tis4(sQLiteDatabase, uWYuX9UTvV9YpFO4TOWDDIMxZXP1V8HdM.dDIMxZXP1V8HdM(), size));
            }
        }
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        int i2 = 0;
        while (true) {
            i = 84 - 83;
            if (i2 >= arrayListHjneShqpF9Tis4.size()) {
                break;
            }
            sb.append(((XLl8iYn7yPzhz) arrayListHjneShqpF9Tis4.get(i2)).dDIMxZXP1V8HdM);
            if (i2 < arrayListHjneShqpF9Tis4.size() - i) {
                sb.append(',');
            }
            i2++;
        }
        sb.append(')');
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                long j = cursorQuery.getLong(0);
                Set hashSet = (Set) map.get(Long.valueOf(j));
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(Long.valueOf(j), hashSet);
                }
                hashSet.add(new G6wrmrMOLf6x(cursorQuery.getString(i), cursorQuery.getString(2)));
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        ListIterator listIterator = arrayListHjneShqpF9Tis4.listIterator();
        while (listIterator.hasNext()) {
            XLl8iYn7yPzhz xLl8iYn7yPzhz = (XLl8iYn7yPzhz) listIterator.next();
            long j2 = xLl8iYn7yPzhz.dDIMxZXP1V8HdM;
            if (map.containsKey(Long.valueOf(j2))) {
                xXexZC0ehrqHnWzLCz xxexzc0ehrqhnwzlczVekpFI4d1Nc4fakF = xLl8iYn7yPzhz.vekpFI4d1Nc4fakF.vekpFI4d1Nc4fakF();
                for (G6wrmrMOLf6x g6wrmrMOLf6x : (Set) map.get(Long.valueOf(j2))) {
                    xxexzc0ehrqhnwzlczVekpFI4d1Nc4fakF.dDIMxZXP1V8HdM(g6wrmrMOLf6x.dDIMxZXP1V8HdM, g6wrmrMOLf6x.w9sT1Swbhx3hs);
                }
                listIterator.set(new XLl8iYn7yPzhz(j2, xLl8iYn7yPzhz.w9sT1Swbhx3hs, xxexzc0ehrqhnwzlczVekpFI4d1Nc4fakF.w9sT1Swbhx3hs()));
            }
        }
        return arrayListHjneShqpF9Tis4;
    }

    @Override // v.s.aTR0Fvd9tAh4Aa
    public Object dDIMxZXP1V8HdM(DfUmSWZwfhCUz dfUmSWZwfhCUz) {
        IXBvAqS2fpdIRK iXBvAqS2fpdIRK = (IXBvAqS2fpdIRK) this.JXn4Qf7zpnLjP5;
        String str = (String) this.vekpFI4d1Nc4fakF;
        synchronized (iXBvAqS2fpdIRK) {
            ((Sn2d19yOBfyV0rw) iXBvAqS2fpdIRK.vekpFI4d1Nc4fakF).remove(str);
        }
        return dfUmSWZwfhCUz;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0032  */
    @Override // v.s.As2k35rSTTZ3RAUS
    public Object w9sT1Swbhx3hs(iniVyKd0OGb2raI4 inivykd0ogb2rai4) {
        String strValueOf;
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                String str = (String) this.vekpFI4d1Nc4fakF;
                FVxyDmZ6Vklq5C fVxyDmZ6Vklq5C = (FVxyDmZ6Vklq5C) this.JXn4Qf7zpnLjP5;
                try {
                    Trace.beginSection(str);
                    return fVxyDmZ6Vklq5C.xDyLpEZyrcKVe0.w9sT1Swbhx3hs(inivykd0ogb2rai4);
                } finally {
                    Trace.endSection();
                }
            default:
                String str2 = (String) this.vekpFI4d1Nc4fakF;
                UeVBYgBvSKYfVuXLhMs ueVBYgBvSKYfVuXLhMs = (UeVBYgBvSKYfVuXLhMs) this.JXn4Qf7zpnLjP5;
                Context context = (Context) inivykd0ogb2rai4.dDIMxZXP1V8HdM(Context.class);
                switch (ueVBYgBvSKYfVuXLhMs.w9sT1Swbhx3hs) {
                    case 7:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo == null) {
                            strValueOf = "";
                        } else {
                            strValueOf = String.valueOf(applicationInfo.targetSdkVersion);
                        }
                        break;
                    case 8:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 == null) {
                            strValueOf = "";
                        } else {
                            strValueOf = String.valueOf(applicationInfo2.minSdkVersion);
                        }
                        break;
                    case 9:
                        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            strValueOf = "tv";
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                            strValueOf = "watch";
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            strValueOf = "auto";
                        } else if (!context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                            strValueOf = "";
                        } else {
                            strValueOf = "embedded";
                        }
                        break;
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName == null) {
                            strValueOf = "";
                        } else {
                            strValueOf = FirebaseCommonRegistrar.dDIMxZXP1V8HdM(installerPackageName);
                        }
                        break;
                }
                return new A8Ma74sVrwIpGnRFB9(str2, strValueOf);
        }
    }

    @Override // v.s.hYMmDgRUK0a6MaJzT
    public void xDyLpEZyrcKVe0(DfUmSWZwfhCUz dfUmSWZwfhCUz) {
        EnhancedIntentService enhancedIntentService = (EnhancedIntentService) this.vekpFI4d1Nc4fakF;
        Intent intent = (Intent) this.JXn4Qf7zpnLjP5;
        int i = EnhancedIntentService.dDIMxZXP1V8HdM;
        enhancedIntentService.dDIMxZXP1V8HdM(intent);
    }

    public /* synthetic */ cY0DNVJM1fAUrMWIl7k(IXBvAqS2fpdIRK iXBvAqS2fpdIRK, String str) {
        this.w9sT1Swbhx3hs = 3;
        this.JXn4Qf7zpnLjP5 = iXBvAqS2fpdIRK;
        this.vekpFI4d1Nc4fakF = str;
    }
}
