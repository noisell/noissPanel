package v.s;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import java.io.Closeable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class eyije75asyarHGHdxkfX implements Closeable {
    public final List vekpFI4d1Nc4fakF;
    public final SQLiteDatabase w9sT1Swbhx3hs;
    public static final String[] JXn4Qf7zpnLjP5 = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] Ee8d2j4S9Vm5yGuR = new String[0];

    public eyije75asyarHGHdxkfX(SQLiteDatabase sQLiteDatabase) {
        this.w9sT1Swbhx3hs = sQLiteDatabase;
        this.vekpFI4d1Nc4fakF = sQLiteDatabase.getAttachedDbs();
    }

    private static /* synthetic */ void qibxxbycd() {
    }

    public final IvGcaSCdlPOakpJ6v D5P1xCAyuvgF(String str) {
        return new IvGcaSCdlPOakpJ6v(this.w9sT1Swbhx3hs.compileStatement(str));
    }

    public final void DVTNwpDEVsUKuznof(Object[] objArr) {
        this.w9sT1Swbhx3hs.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    public final boolean EWUjsTERgdPbSw3NNlN() {
        return this.w9sT1Swbhx3hs.inTransaction();
    }

    public final Cursor O2DHNSIGZlgPja7eqLgn(B2htgWMZxsdry b2htgWMZxsdry) {
        final lD7NtjPYi4fA ld7ntjpyi4fa = new lD7NtjPYi4fA(b2htgWMZxsdry);
        return this.w9sT1Swbhx3hs.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: v.s.mi9aNPM3iOdGyZ
            private static /* synthetic */ void mnhiby() {
            }

            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                ld7ntjpyi4fa.vekpFI4d1Nc4fakF.vekpFI4d1Nc4fakF(new P43a7J25h28VEe9aQ(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, b2htgWMZxsdry.dDIMxZXP1V8HdM(), Ee8d2j4S9Vm5yGuR, null);
    }

    public final void Qrz92kRPw4GcghAc(String str) {
        this.w9sT1Swbhx3hs.execSQL(str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.w9sT1Swbhx3hs.close();
    }

    public final void dDIMxZXP1V8HdM() {
        this.w9sT1Swbhx3hs.beginTransaction();
    }

    public final void hjneShqpF9Tis4() {
        this.w9sT1Swbhx3hs.endTransaction();
    }

    public final Cursor rCHnHJBAlOpNI5(String str) {
        return O2DHNSIGZlgPja7eqLgn(new o0rN3ekjBJ6kKwok(str, 0));
    }

    public final boolean vIJudZvPyTuNp() {
        return this.w9sT1Swbhx3hs.isWriteAheadLoggingEnabled();
    }

    public final void vekpFI4d1Nc4fakF() {
        this.w9sT1Swbhx3hs.beginTransactionNonExclusive();
    }

    public final void xfn2GJwmGqs7kWW() {
        this.w9sT1Swbhx3hs.setTransactionSuccessful();
    }
}
