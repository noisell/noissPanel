package v.s;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class c0GsmbUiugE231HPbX implements qAHCZrfOx8WOS, WwqoyKhrbNp5qcng0CM, rR47ZPwFk6l5cadn8 {
    public static final DixbgjZDrgKGsYk0Hj ibVTtJUNfrGYbW = new DixbgjZDrgKGsYk0Hj("proto");
    public final bqyPVYVs67un5CcbShz Ee8d2j4S9Vm5yGuR;
    public final bYZKmsM130y5GVhnn JXn4Qf7zpnLjP5;
    public final bYZKmsM130y5GVhnn vekpFI4d1Nc4fakF;
    public final gOGZ1ZK6M3bWo9 w9sT1Swbhx3hs;
    public final RZKLDkRu6ZWDxTDL71X xDyLpEZyrcKVe0;

    public c0GsmbUiugE231HPbX(bYZKmsM130y5GVhnn byzkmsm130y5gvhnn, bYZKmsM130y5GVhnn byzkmsm130y5gvhnn2, bqyPVYVs67un5CcbShz bqypvyvs67un5ccbshz, gOGZ1ZK6M3bWo9 gogz1zk6m3bwo9, RZKLDkRu6ZWDxTDL71X rZKLDkRu6ZWDxTDL71X) {
        this.w9sT1Swbhx3hs = gogz1zk6m3bwo9;
        this.vekpFI4d1Nc4fakF = byzkmsm130y5gvhnn;
        this.JXn4Qf7zpnLjP5 = byzkmsm130y5gvhnn2;
        this.Ee8d2j4S9Vm5yGuR = bqypvyvs67un5ccbshz;
        this.xDyLpEZyrcKVe0 = rZKLDkRu6ZWDxTDL71X;
    }

    public static String EWUjsTERgdPbSw3NNlN(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((XLl8iYn7yPzhz) it.next()).dDIMxZXP1V8HdM);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object vIJudZvPyTuNp(Cursor cursor, VMDuz8aYZEdHqSIte vMDuz8aYZEdHqSIte) {
        try {
            return vMDuz8aYZEdHqSIte.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static Long vekpFI4d1Nc4fakF(SQLiteDatabase sQLiteDatabase, oO26y14q3Pwf oo26y14q3pwf) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(oo26y14q3pwf.dDIMxZXP1V8HdM, String.valueOf(oAbr1ycaDgFnfg.dDIMxZXP1V8HdM(oo26y14q3pwf.vekpFI4d1Nc4fakF))));
        byte[] bArr = oo26y14q3pwf.w9sT1Swbhx3hs;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public final Object D5P1xCAyuvgF(VMDuz8aYZEdHqSIte vMDuz8aYZEdHqSIte) {
        SQLiteDatabase sQLiteDatabaseDDIMxZXP1V8HdM = dDIMxZXP1V8HdM();
        sQLiteDatabaseDDIMxZXP1V8HdM.beginTransaction();
        try {
            Object objApply = vMDuz8aYZEdHqSIte.apply(sQLiteDatabaseDDIMxZXP1V8HdM);
            sQLiteDatabaseDDIMxZXP1V8HdM.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseDDIMxZXP1V8HdM.endTransaction();
        }
    }

    public final Object DVTNwpDEVsUKuznof(z3H4CF5ES1APfy6l z3h4cf5es1apfy6l) {
        SQLiteDatabase sQLiteDatabaseDDIMxZXP1V8HdM = dDIMxZXP1V8HdM();
        bYZKmsM130y5GVhnn byzkmsm130y5gvhnn = this.JXn4Qf7zpnLjP5;
        long jJXn4Qf7zpnLjP5 = byzkmsm130y5gvhnn.JXn4Qf7zpnLjP5();
        while (true) {
            try {
                sQLiteDatabaseDDIMxZXP1V8HdM.beginTransaction();
                try {
                    Object objJXn4Qf7zpnLjP5 = z3h4cf5es1apfy6l.JXn4Qf7zpnLjP5();
                    sQLiteDatabaseDDIMxZXP1V8HdM.setTransactionSuccessful();
                    return objJXn4Qf7zpnLjP5;
                } finally {
                    sQLiteDatabaseDDIMxZXP1V8HdM.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (byzkmsm130y5gvhnn.JXn4Qf7zpnLjP5() >= ((long) this.Ee8d2j4S9Vm5yGuR.vekpFI4d1Nc4fakF) + jJXn4Qf7zpnLjP5) {
                    throw new nChsZFUyUkSpmR("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final void Qrz92kRPw4GcghAc(long j, gBBpLea0L3FRWXAzN gbbplea0l3frwxazn, String str) {
        D5P1xCAyuvgF(new la5sybrtamx9S4qO(str, gbbplea0l3frwxazn, j));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.w9sT1Swbhx3hs.close();
    }

    public final SQLiteDatabase dDIMxZXP1V8HdM() {
        gOGZ1ZK6M3bWo9 gogz1zk6m3bwo9 = this.w9sT1Swbhx3hs;
        Objects.requireNonNull(gogz1zk6m3bwo9);
        bYZKmsM130y5GVhnn byzkmsm130y5gvhnn = this.JXn4Qf7zpnLjP5;
        long jJXn4Qf7zpnLjP5 = byzkmsm130y5gvhnn.JXn4Qf7zpnLjP5();
        while (true) {
            try {
                return gogz1zk6m3bwo9.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (byzkmsm130y5gvhnn.JXn4Qf7zpnLjP5() >= ((long) this.Ee8d2j4S9Vm5yGuR.vekpFI4d1Nc4fakF) + jJXn4Qf7zpnLjP5) {
                    throw new nChsZFUyUkSpmR("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final ArrayList hjneShqpF9Tis4(SQLiteDatabase sQLiteDatabase, oO26y14q3Pwf oo26y14q3pwf, int i) {
        ArrayList arrayList = new ArrayList();
        Long lVekpFI4d1Nc4fakF = vekpFI4d1Nc4fakF(sQLiteDatabase, oo26y14q3pwf);
        if (lVekpFI4d1Nc4fakF == null) {
            return arrayList;
        }
        vIJudZvPyTuNp(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lVekpFI4d1Nc4fakF.toString()}, null, null, null, String.valueOf(i)), new q5BX8lVsyHlpw(this, (Object) arrayList, oo26y14q3pwf, 3));
        return arrayList;
    }
}
