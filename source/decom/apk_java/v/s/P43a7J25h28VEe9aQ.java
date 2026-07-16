package v.s;

import android.database.sqlite.SQLiteProgram;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class P43a7J25h28VEe9aQ implements SFSz9tfWEAQo {
    public final SQLiteProgram w9sT1Swbhx3hs;

    public P43a7J25h28VEe9aQ(SQLiteProgram sQLiteProgram) {
        this.w9sT1Swbhx3hs = sQLiteProgram;
    }

    @Override // v.s.SFSz9tfWEAQo
    public final void MLSIo1htfMPWeB8V876L(String str, int i) {
        this.w9sT1Swbhx3hs.bindString(i, str);
    }

    @Override // v.s.SFSz9tfWEAQo
    public final void b1EoSIRjJHO5(int i, double d) {
        this.w9sT1Swbhx3hs.bindDouble(i, d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.w9sT1Swbhx3hs.close();
    }

    @Override // v.s.SFSz9tfWEAQo
    public final void dTS0S7eC32ubQH54j36(byte[] bArr, int i) {
        this.w9sT1Swbhx3hs.bindBlob(i, bArr);
    }

    @Override // v.s.SFSz9tfWEAQo
    public final void wotphlvK9sPbXJ(int i, long j) {
        this.w9sT1Swbhx3hs.bindLong(i, j);
    }

    @Override // v.s.SFSz9tfWEAQo
    public final void xDyLpEZyrcKVe0(int i) {
        this.w9sT1Swbhx3hs.bindNull(i);
    }
}
