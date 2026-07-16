package v.s;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class xm8FciQZdMj7 extends SQLiteOpenHelper {
    public static final /* synthetic */ int pyu8ovAipBTLYAiKab = 0;
    public final boolean Ee8d2j4S9Vm5yGuR;
    public final sfr0Aaw8vBbkmexjHdWK JXn4Qf7zpnLjP5;
    public boolean b1EoSIRjJHO5;
    public final Qaufr4RG6hhFZDELvS ibVTtJUNfrGYbW;
    public final r5XEUfod5GSCCwq6c vekpFI4d1Nc4fakF;
    public final Context w9sT1Swbhx3hs;
    public boolean xDyLpEZyrcKVe0;

    public xm8FciQZdMj7(Context context, String str, final r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c, final sfr0Aaw8vBbkmexjHdWK sfr0aaw8vbbkmexjhdwk, boolean z) {
        super(context, str, null, sfr0aaw8vbbkmexjhdwk.w9sT1Swbhx3hs, new DatabaseErrorHandler(sfr0aaw8vbbkmexjhdwk, r5xeufod5gsccwq6c) { // from class: v.s.FyriKYljygGd
            public final /* synthetic */ r5XEUfod5GSCCwq6c dDIMxZXP1V8HdM;

            {
                this.dDIMxZXP1V8HdM = r5xeufod5gsccwq6c;
            }

            private static /* synthetic */ void suvm() {
            }

            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i = xm8FciQZdMj7.pyu8ovAipBTLYAiKab;
                r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c2 = this.dDIMxZXP1V8HdM;
                eyije75asyarHGHdxkfX eyije75asyarhghdxkfx = (eyije75asyarHGHdxkfX) r5xeufod5gsccwq6c2.vekpFI4d1Nc4fakF;
                if (eyije75asyarhghdxkfx == null || !okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(eyije75asyarhghdxkfx.w9sT1Swbhx3hs, sQLiteDatabase)) {
                    eyije75asyarhghdxkfx = new eyije75asyarHGHdxkfX(sQLiteDatabase);
                    r5xeufod5gsccwq6c2.vekpFI4d1Nc4fakF = eyije75asyarhghdxkfx;
                }
                SQLiteDatabase sQLiteDatabase2 = eyije75asyarhghdxkfx.w9sT1Swbhx3hs;
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        sfr0Aaw8vBbkmexjHdWK.w9sT1Swbhx3hs(path);
                        return;
                    }
                    return;
                }
                List list = null;
                try {
                    try {
                        list = eyije75asyarhghdxkfx.vekpFI4d1Nc4fakF;
                    } catch (SQLiteException unused) {
                    }
                    try {
                        eyije75asyarhghdxkfx.close();
                    } catch (IOException unused2) {
                    }
                    if (list != null) {
                        return;
                    }
                } finally {
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            sfr0Aaw8vBbkmexjHdWK.w9sT1Swbhx3hs((String) ((Pair) it.next()).second);
                        }
                    } else {
                        String path2 = sQLiteDatabase2.getPath();
                        if (path2 != null) {
                            sfr0Aaw8vBbkmexjHdWK.w9sT1Swbhx3hs(path2);
                        }
                    }
                }
            }
        });
        this.w9sT1Swbhx3hs = context;
        this.vekpFI4d1Nc4fakF = r5xeufod5gsccwq6c;
        this.JXn4Qf7zpnLjP5 = sfr0aaw8vbbkmexjhdwk;
        this.Ee8d2j4S9Vm5yGuR = z;
        this.ibVTtJUNfrGYbW = new Qaufr4RG6hhFZDELvS(str == null ? UUID.randomUUID().toString() : str, context.getCacheDir(), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v9, types: [android.database.sqlite.SQLiteDatabase] */
    public final SQLiteDatabase D5P1xCAyuvgF(boolean z) throws Throwable {
        File parentFile;
        String databaseName = getDatabaseName();
        Context context = this.w9sT1Swbhx3hs;
        if (databaseName != null && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                parentFile.toString();
            }
        }
        try {
            z = z != 0 ? getWritableDatabase() : getReadableDatabase();
            return z;
        } catch (Throwable unused) {
            super.close();
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                z = z != 0 ? getWritableDatabase() : getReadableDatabase();
                return z;
            } catch (Throwable th) {
                super.close();
                if (th instanceof jGAQMa5w7IIe0Q) {
                    jGAQMa5w7IIe0Q jgaqma5w7iie0q = th;
                    int iJ0zjQ7CAgohuxU20eCW6 = Y9mRyRdkl5FOcwb66V6.J0zjQ7CAgohuxU20eCW6(jgaqma5w7iie0q.w9sT1Swbhx3hs);
                    Throwable th2 = jgaqma5w7iie0q.vekpFI4d1Nc4fakF;
                    if (iJ0zjQ7CAgohuxU20eCW6 == 0 || iJ0zjQ7CAgohuxU20eCW6 == 1 || iJ0zjQ7CAgohuxU20eCW6 == 2 || iJ0zjQ7CAgohuxU20eCW6 == 3 || !(th2 instanceof SQLiteException)) {
                        throw th2;
                    }
                } else if (!(th instanceof SQLiteException) || databaseName == null || !this.Ee8d2j4S9Vm5yGuR) {
                    throw th;
                }
                context.deleteDatabase(databaseName);
                try {
                    return z != 0 ? getWritableDatabase() : getReadableDatabase();
                } catch (jGAQMa5w7IIe0Q e) {
                    throw e.vekpFI4d1Nc4fakF;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        Qaufr4RG6hhFZDELvS qaufr4RG6hhFZDELvS = this.ibVTtJUNfrGYbW;
        try {
            qaufr4RG6hhFZDELvS.dDIMxZXP1V8HdM(qaufr4RG6hhFZDELvS.dDIMxZXP1V8HdM);
            super.close();
            this.vekpFI4d1Nc4fakF.vekpFI4d1Nc4fakF = null;
            this.b1EoSIRjJHO5 = false;
        } finally {
            qaufr4RG6hhFZDELvS.w9sT1Swbhx3hs();
        }
    }

    public final eyije75asyarHGHdxkfX dDIMxZXP1V8HdM(boolean z) {
        Qaufr4RG6hhFZDELvS qaufr4RG6hhFZDELvS = this.ibVTtJUNfrGYbW;
        try {
            qaufr4RG6hhFZDELvS.dDIMxZXP1V8HdM((this.b1EoSIRjJHO5 || getDatabaseName() == null) ? false : true);
            this.xDyLpEZyrcKVe0 = false;
            SQLiteDatabase sQLiteDatabaseD5P1xCAyuvgF = D5P1xCAyuvgF(z);
            if (!this.xDyLpEZyrcKVe0) {
                return vekpFI4d1Nc4fakF(sQLiteDatabaseD5P1xCAyuvgF);
            }
            close();
            return dDIMxZXP1V8HdM(z);
        } finally {
            qaufr4RG6hhFZDELvS.w9sT1Swbhx3hs();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        try {
            sfr0Aaw8vBbkmexjHdWK sfr0aaw8vbbkmexjhdwk = this.JXn4Qf7zpnLjP5;
            vekpFI4d1Nc4fakF(sQLiteDatabase);
            sfr0aaw8vbbkmexjhdwk.getClass();
        } catch (Throwable th) {
            throw new jGAQMa5w7IIe0Q(21 - 20, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            this.JXn4Qf7zpnLjP5.vekpFI4d1Nc4fakF(vekpFI4d1Nc4fakF(sQLiteDatabase));
        } catch (Throwable th) {
            throw new jGAQMa5w7IIe0Q(2, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.xDyLpEZyrcKVe0 = true;
        try {
            this.JXn4Qf7zpnLjP5.Ee8d2j4S9Vm5yGuR(vekpFI4d1Nc4fakF(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new jGAQMa5w7IIe0Q(4, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.xDyLpEZyrcKVe0) {
            try {
                this.JXn4Qf7zpnLjP5.JXn4Qf7zpnLjP5(vekpFI4d1Nc4fakF(sQLiteDatabase));
            } catch (Throwable th) {
                throw new jGAQMa5w7IIe0Q(85 - 80, th);
            }
        }
        this.b1EoSIRjJHO5 = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.xDyLpEZyrcKVe0 = true;
        try {
            this.JXn4Qf7zpnLjP5.Ee8d2j4S9Vm5yGuR(vekpFI4d1Nc4fakF(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new jGAQMa5w7IIe0Q(3, th);
        }
    }

    public final eyije75asyarHGHdxkfX vekpFI4d1Nc4fakF(SQLiteDatabase sQLiteDatabase) {
        r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c = this.vekpFI4d1Nc4fakF;
        eyije75asyarHGHdxkfX eyije75asyarhghdxkfx = (eyije75asyarHGHdxkfX) r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF;
        if (eyije75asyarhghdxkfx != null && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(eyije75asyarhghdxkfx.w9sT1Swbhx3hs, sQLiteDatabase)) {
            return eyije75asyarhghdxkfx;
        }
        eyije75asyarHGHdxkfX eyije75asyarhghdxkfx2 = new eyije75asyarHGHdxkfX(sQLiteDatabase);
        r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF = eyije75asyarhghdxkfx2;
        return eyije75asyarhghdxkfx2;
    }
}
