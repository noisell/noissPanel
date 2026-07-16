package v.s;

import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final /* synthetic */ class q5BX8lVsyHlpw implements z3H4CF5ES1APfy6l, LtzmUxGUgkaP2P4zmQl6, VMDuz8aYZEdHqSIte {
    public final /* synthetic */ Object Ee8d2j4S9Vm5yGuR;
    public final /* synthetic */ Object JXn4Qf7zpnLjP5;
    public final /* synthetic */ Object vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs;

    public /* synthetic */ q5BX8lVsyHlpw(Object obj, Object obj2, Object obj3, int i) {
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = obj;
        this.JXn4Qf7zpnLjP5 = obj2;
        this.Ee8d2j4S9Vm5yGuR = obj3;
    }

    @Override // v.s.z3H4CF5ES1APfy6l
    public Object JXn4Qf7zpnLjP5() {
        UBF3HNWZ5b6WVJP1 uBF3HNWZ5b6WVJP1 = (UBF3HNWZ5b6WVJP1) this.vekpFI4d1Nc4fakF;
        oO26y14q3Pwf oo26y14q3pwf = (oO26y14q3Pwf) this.JXn4Qf7zpnLjP5;
        UAg7SCKjkktbMM uAg7SCKjkktbMM = (UAg7SCKjkktbMM) this.Ee8d2j4S9Vm5yGuR;
        c0GsmbUiugE231HPbX c0gsmbuiuge231hpbx = (c0GsmbUiugE231HPbX) uBF3HNWZ5b6WVJP1.JXn4Qf7zpnLjP5;
        c0gsmbuiuge231hpbx.getClass();
        LB7U1qakabytBm lB7U1qakabytBm = oo26y14q3pwf.vekpFI4d1Nc4fakF;
        if (Log.isLoggable("TRuntime.".concat("SQLiteEventStore"), 3)) {
            new StringBuilder("Storing event with priority=").append(lB7U1qakabytBm);
        }
        ((Long) c0gsmbuiuge231hpbx.D5P1xCAyuvgF(new q5BX8lVsyHlpw(c0gsmbuiuge231hpbx, (Object) uAg7SCKjkktbMM, oo26y14q3pwf, 2))).getClass();
        uBF3HNWZ5b6WVJP1.dDIMxZXP1V8HdM.Ee8d2j4S9Vm5yGuR(oo26y14q3pwf, 1, false);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v.s.VMDuz8aYZEdHqSIte
    public Object apply(Object obj) throws Throwable {
        long jInsert;
        Cursor cursor;
        gBBpLea0L3FRWXAzN gbbplea0l3frwxazn;
        int i = this.w9sT1Swbhx3hs;
        int i2 = 5;
        int i3 = 98 - 94;
        int i4 = 3;
        gBBpLea0L3FRWXAzN gbbplea0l3frwxazn2 = gBBpLea0L3FRWXAzN.CACHE_FULL;
        int i5 = (-6) + 8;
        int i6 = 1;
        Object obj2 = this.Ee8d2j4S9Vm5yGuR;
        Object obj3 = this.JXn4Qf7zpnLjP5;
        int i7 = 0;
        c0GsmbUiugE231HPbX c0gsmbuiuge231hpbx = (c0GsmbUiugE231HPbX) this.vekpFI4d1Nc4fakF;
        switch (i) {
            case 2:
                UAg7SCKjkktbMM uAg7SCKjkktbMM = (UAg7SCKjkktbMM) obj2;
                lIOSSTYOutyFnDV8Yx liosstyoutyfndv8yx = uAg7SCKjkktbMM.vekpFI4d1Nc4fakF;
                String str = uAg7SCKjkktbMM.dDIMxZXP1V8HdM;
                oO26y14q3Pwf oo26y14q3pwf = (oO26y14q3Pwf) obj3;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long jSimpleQueryForLong = c0gsmbuiuge231hpbx.dDIMxZXP1V8HdM().compileStatement("PRAGMA page_size").simpleQueryForLong() * c0gsmbuiuge231hpbx.dDIMxZXP1V8HdM().compileStatement("PRAGMA page_count").simpleQueryForLong();
                bqyPVYVs67un5CcbShz bqypvyvs67un5ccbshz = c0gsmbuiuge231hpbx.Ee8d2j4S9Vm5yGuR;
                if (jSimpleQueryForLong >= bqypvyvs67un5ccbshz.dDIMxZXP1V8HdM) {
                    c0gsmbuiuge231hpbx.Qrz92kRPw4GcghAc(1L, gbbplea0l3frwxazn2, str);
                    return -1L;
                }
                Long lVekpFI4d1Nc4fakF = c0GsmbUiugE231HPbX.vekpFI4d1Nc4fakF(sQLiteDatabase, oo26y14q3pwf);
                if (lVekpFI4d1Nc4fakF != null) {
                    jInsert = lVekpFI4d1Nc4fakF.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", oo26y14q3pwf.dDIMxZXP1V8HdM);
                    contentValues.put("priority", Integer.valueOf(oAbr1ycaDgFnfg.dDIMxZXP1V8HdM(oo26y14q3pwf.vekpFI4d1Nc4fakF)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = oo26y14q3pwf.w9sT1Swbhx3hs;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i8 = bqypvyvs67un5ccbshz.Ee8d2j4S9Vm5yGuR;
                byte[] bArr2 = liosstyoutyfndv8yx.w9sT1Swbhx3hs;
                boolean z = bArr2.length <= i8 ? (-9) + 10 : 0;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(uAg7SCKjkktbMM.JXn4Qf7zpnLjP5));
                contentValues2.put("uptime_ms", Long.valueOf(uAg7SCKjkktbMM.Ee8d2j4S9Vm5yGuR));
                contentValues2.put("payload_encoding", liosstyoutyfndv8yx.dDIMxZXP1V8HdM.dDIMxZXP1V8HdM);
                contentValues2.put("code", uAg7SCKjkktbMM.w9sT1Swbhx3hs);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                contentValues2.put("payload", z != 0 ? bArr2 : new byte[0]);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (z == 0) {
                    int iCeil = (int) Math.ceil(((double) bArr2.length) / ((double) i8));
                    for (int i9 = 1; i9 <= iCeil; i9++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i9 - 1) * i8, Math.min(i9 * i8, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i9));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(uAg7SCKjkktbMM.xDyLpEZyrcKVe0).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            case 3:
                ArrayList arrayList = (ArrayList) obj2;
                oO26y14q3Pwf oo26y14q3pwf2 = (oO26y14q3Pwf) obj3;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j = cursor2.getLong(0);
                    int i10 = cursor2.getInt(7) != 0 ? i6 : 0;
                    xXexZC0ehrqHnWzLCz xxexzc0ehrqhnwzlcz = new xXexZC0ehrqHnWzLCz();
                    xxexzc0ehrqhnwzlcz.xDyLpEZyrcKVe0 = new HashMap();
                    String string = cursor2.getString(i6);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    xxexzc0ehrqhnwzlcz.dDIMxZXP1V8HdM = string;
                    xxexzc0ehrqhnwzlcz.JXn4Qf7zpnLjP5 = Long.valueOf(cursor2.getLong(i5));
                    xxexzc0ehrqhnwzlcz.Ee8d2j4S9Vm5yGuR = Long.valueOf(cursor2.getLong(3));
                    if (i10 != 0) {
                        String string2 = cursor2.getString(4);
                        xxexzc0ehrqhnwzlcz.vekpFI4d1Nc4fakF = new lIOSSTYOutyFnDV8Yx(string2 == null ? c0GsmbUiugE231HPbX.ibVTtJUNfrGYbW : new DixbgjZDrgKGsYk0Hj(string2), cursor2.getBlob(5));
                    } else {
                        String string3 = cursor2.getString(4);
                        DixbgjZDrgKGsYk0Hj dixbgjZDrgKGsYk0Hj = string3 == null ? c0GsmbUiugE231HPbX.ibVTtJUNfrGYbW : new DixbgjZDrgKGsYk0Hj(string3);
                        Cursor cursorQuery = c0gsmbuiuge231hpbx.dDIMxZXP1V8HdM().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int length = 0;
                            while (cursorQuery.moveToNext()) {
                                byte[] blob = cursorQuery.getBlob(0);
                                arrayList2.add(blob);
                                length += blob.length;
                            }
                            byte[] bArr3 = new byte[length];
                            int i11 = 0;
                            int length2 = 0;
                            while (i11 < arrayList2.size()) {
                                byte[] bArr4 = (byte[]) arrayList2.get(i11);
                                cursor = cursorQuery;
                                try {
                                    ArrayList arrayList3 = arrayList2;
                                    System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
                                    length2 += bArr4.length;
                                    i11++;
                                    cursorQuery = cursor;
                                    arrayList2 = arrayList3;
                                } catch (Throwable th) {
                                    th = th;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            cursorQuery.close();
                            xxexzc0ehrqhnwzlcz.vekpFI4d1Nc4fakF = new lIOSSTYOutyFnDV8Yx(dixbgjZDrgKGsYk0Hj, bArr3);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        xxexzc0ehrqhnwzlcz.w9sT1Swbhx3hs = Integer.valueOf(cursor2.getInt(6));
                    }
                    arrayList.add(new XLl8iYn7yPzhz(j, oo26y14q3pwf2, xxexzc0ehrqhnwzlcz.w9sT1Swbhx3hs()));
                    i5 = 2;
                    i6 = 1;
                }
                return null;
            default:
                HashMap map = (HashMap) obj3;
                mYrXZiFjFW2Xg myrxzifjfw2xg = (mYrXZiFjFW2Xg) obj2;
                ArrayList arrayList4 = (ArrayList) myrxzifjfw2xg.JXn4Qf7zpnLjP5;
                Cursor cursor3 = (Cursor) obj;
                c0gsmbuiuge231hpbx.getClass();
                while (cursor3.moveToNext()) {
                    String string4 = cursor3.getString(i7);
                    int i12 = cursor3.getInt(1);
                    gBBpLea0L3FRWXAzN gbbplea0l3frwxazn3 = gBBpLea0L3FRWXAzN.REASON_UNKNOWN;
                    if (i12 != 0) {
                        if (i12 == 1) {
                            gbbplea0l3frwxazn3 = gBBpLea0L3FRWXAzN.MESSAGE_TOO_OLD;
                        } else if (i12 == i5) {
                            gbbplea0l3frwxazn = gbbplea0l3frwxazn2;
                        } else if (i12 == i4) {
                            gbbplea0l3frwxazn3 = gBBpLea0L3FRWXAzN.PAYLOAD_TOO_BIG;
                        } else if (i12 == i3) {
                            gbbplea0l3frwxazn3 = gBBpLea0L3FRWXAzN.MAX_RETRIES_REACHED;
                        } else if (i12 == i2) {
                            gbbplea0l3frwxazn3 = gBBpLea0L3FRWXAzN.INVALID_PAYLOD;
                        } else if (i12 == 6) {
                            gbbplea0l3frwxazn3 = gBBpLea0L3FRWXAzN.SERVER_ERROR;
                        } else {
                            jb8et6SZeK5TWMrJFxDX.Ee8d2j4S9Vm5yGuR("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i12));
                        }
                        gbbplea0l3frwxazn = gbbplea0l3frwxazn3;
                    } else {
                        gbbplea0l3frwxazn = gbbplea0l3frwxazn3;
                    }
                    long j2 = cursor3.getLong(i5);
                    if (!map.containsKey(string4)) {
                        map.put(string4, new ArrayList());
                    }
                    ((List) map.get(string4)).add(new k4LH6GKnJE938(j2, gbbplea0l3frwxazn));
                    i7 = 0;
                    i2 = 5;
                    i3 = 4;
                    i4 = 3;
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    int i13 = c9n7rIzOUZvccQ.vekpFI4d1Nc4fakF;
                    new ArrayList();
                    arrayList4.add(new c9n7rIzOUZvccQ((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                }
                long jJXn4Qf7zpnLjP5 = c0gsmbuiuge231hpbx.vekpFI4d1Nc4fakF.JXn4Qf7zpnLjP5();
                SQLiteDatabase sQLiteDatabaseDDIMxZXP1V8HdM = c0gsmbuiuge231hpbx.dDIMxZXP1V8HdM();
                sQLiteDatabaseDDIMxZXP1V8HdM.beginTransaction();
                try {
                    Cursor cursorRawQuery = sQLiteDatabaseDDIMxZXP1V8HdM.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        cursorRawQuery.moveToNext();
                        xZIUZeefpVNszWtdR xziuzeefpvnszwtdr = new xZIUZeefpVNszWtdR(cursorRawQuery.getLong(0), jJXn4Qf7zpnLjP5);
                        cursorRawQuery.close();
                        sQLiteDatabaseDDIMxZXP1V8HdM.setTransactionSuccessful();
                        sQLiteDatabaseDDIMxZXP1V8HdM.endTransaction();
                        myrxzifjfw2xg.vekpFI4d1Nc4fakF = xziuzeefpvnszwtdr;
                        myrxzifjfw2xg.Ee8d2j4S9Vm5yGuR = new PChFGwb87ceQ7tQgzgh(new GTVYc6VxL71Dum(c0gsmbuiuge231hpbx.dDIMxZXP1V8HdM().compileStatement("PRAGMA page_size").simpleQueryForLong() * c0gsmbuiuge231hpbx.dDIMxZXP1V8HdM().compileStatement("PRAGMA page_count").simpleQueryForLong(), bqyPVYVs67un5CcbShz.xDyLpEZyrcKVe0.dDIMxZXP1V8HdM));
                        myrxzifjfw2xg.w9sT1Swbhx3hs = (String) c0gsmbuiuge231hpbx.xDyLpEZyrcKVe0.get();
                        return new gWzBsjX17jYks((xZIUZeefpVNszWtdR) myrxzifjfw2xg.vekpFI4d1Nc4fakF, Collections.unmodifiableList(arrayList4), (PChFGwb87ceQ7tQgzgh) myrxzifjfw2xg.Ee8d2j4S9Vm5yGuR, (String) myrxzifjfw2xg.w9sT1Swbhx3hs);
                    } catch (Throwable th3) {
                        cursorRawQuery.close();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    sQLiteDatabaseDDIMxZXP1V8HdM.endTransaction();
                    throw th4;
                }
        }
    }

    @Override // v.s.LtzmUxGUgkaP2P4zmQl6
    public SQzPENpgvzKX9IlD dDIMxZXP1V8HdM(Object obj) {
        String string;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.vekpFI4d1Nc4fakF;
        String str = (String) this.JXn4Qf7zpnLjP5;
        uuzuO8nhb2ti0qHyFb uuzuo8nhb2ti0qhyfb = (uuzuO8nhb2ti0qHyFb) this.Ee8d2j4S9Vm5yGuR;
        String str2 = (String) obj;
        XlNqgz8EVh2x11Ly xlNqgz8EVh2x11LyVekpFI4d1Nc4fakF = FirebaseMessaging.vekpFI4d1Nc4fakF(firebaseMessaging.w9sT1Swbhx3hs);
        dfwkxUDiclPw1BowH4 dfwkxudiclpw1bowh4 = firebaseMessaging.dDIMxZXP1V8HdM;
        dfwkxudiclpw1bowh4.dDIMxZXP1V8HdM();
        String strVekpFI4d1Nc4fakF = "[DEFAULT]".equals(dfwkxudiclpw1bowh4.w9sT1Swbhx3hs) ? "" : dfwkxudiclpw1bowh4.vekpFI4d1Nc4fakF();
        String strDDIMxZXP1V8HdM = firebaseMessaging.b1EoSIRjJHO5.dDIMxZXP1V8HdM();
        synchronized (xlNqgz8EVh2x11LyVekpFI4d1Nc4fakF) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            int i = uuzuO8nhb2ti0qHyFb.Ee8d2j4S9Vm5yGuR;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str2);
                jSONObject.put("appVersion", strDDIMxZXP1V8HdM);
                jSONObject.put("timestamp", jCurrentTimeMillis);
                string = jSONObject.toString();
            } catch (JSONException e) {
                e.toString();
                string = null;
            }
            if (string != null) {
                SharedPreferences.Editor editorEdit = xlNqgz8EVh2x11LyVekpFI4d1Nc4fakF.dDIMxZXP1V8HdM.edit();
                editorEdit.putString(strVekpFI4d1Nc4fakF + "|T|" + str + "|*", string);
                editorEdit.commit();
            }
        }
        if (uuzuo8nhb2ti0qhyfb == null || !str2.equals(uuzuo8nhb2ti0qhyfb.dDIMxZXP1V8HdM)) {
            dfwkxUDiclPw1BowH4 dfwkxudiclpw1bowh5 = firebaseMessaging.dDIMxZXP1V8HdM;
            dfwkxudiclpw1bowh5.dDIMxZXP1V8HdM();
            if ("[DEFAULT]".equals(dfwkxudiclpw1bowh5.w9sT1Swbhx3hs)) {
                if (Log.isLoggable("FirebaseMessaging", (-7) + 10)) {
                    dfwkxudiclpw1bowh5.dDIMxZXP1V8HdM();
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new Hnsrhf2jJV8dCt(firebaseMessaging.w9sT1Swbhx3hs, 1).ibVTtJUNfrGYbW(intent);
            }
        }
        return SbxdZ6Kq2uhHQ5RPRqm.wotphlvK9sPbXJ(str2);
    }

    public /* synthetic */ q5BX8lVsyHlpw(c0GsmbUiugE231HPbX c0gsmbuiuge231hpbx, Object obj, oO26y14q3Pwf oo26y14q3pwf, int i) {
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = c0gsmbuiuge231hpbx;
        this.Ee8d2j4S9Vm5yGuR = obj;
        this.JXn4Qf7zpnLjP5 = oo26y14q3pwf;
    }
}
