package v.s;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final /* synthetic */ class la5sybrtamx9S4qO implements VMDuz8aYZEdHqSIte, z3H4CF5ES1APfy6l {
    public final /* synthetic */ Object JXn4Qf7zpnLjP5;
    public final /* synthetic */ Object vekpFI4d1Nc4fakF;
    public final /* synthetic */ long w9sT1Swbhx3hs;

    public /* synthetic */ la5sybrtamx9S4qO(Object obj, Object obj2, long j) {
        this.vekpFI4d1Nc4fakF = obj;
        this.JXn4Qf7zpnLjP5 = obj2;
        this.w9sT1Swbhx3hs = j;
    }

    private static /* synthetic */ void hxspbddkbt() {
    }

    @Override // v.s.z3H4CF5ES1APfy6l
    public Object JXn4Qf7zpnLjP5() {
        LutdQZ2I9fVx lutdQZ2I9fVx = (LutdQZ2I9fVx) this.vekpFI4d1Nc4fakF;
        oO26y14q3Pwf oo26y14q3pwf = (oO26y14q3Pwf) this.JXn4Qf7zpnLjP5;
        qAHCZrfOx8WOS qahczrfox8wos = lutdQZ2I9fVx.vekpFI4d1Nc4fakF;
        long jJXn4Qf7zpnLjP5 = lutdQZ2I9fVx.ibVTtJUNfrGYbW.JXn4Qf7zpnLjP5() + this.w9sT1Swbhx3hs;
        c0GsmbUiugE231HPbX c0gsmbuiuge231hpbx = (c0GsmbUiugE231HPbX) qahczrfox8wos;
        c0gsmbuiuge231hpbx.getClass();
        c0gsmbuiuge231hpbx.D5P1xCAyuvgF(new VlgbFe2EYrGc(jJXn4Qf7zpnLjP5, oo26y14q3pwf));
        return null;
    }

    @Override // v.s.VMDuz8aYZEdHqSIte
    public Object apply(Object obj) {
        String str = (String) this.vekpFI4d1Nc4fakF;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i = ((gBBpLea0L3FRWXAzN) this.JXn4Qf7zpnLjP5).w9sT1Swbhx3hs;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
        try {
            boolean z = cursorRawQuery.getCount() > 0;
            cursorRawQuery.close();
            long j = this.w9sT1Swbhx3hs;
            if (z) {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }
}
