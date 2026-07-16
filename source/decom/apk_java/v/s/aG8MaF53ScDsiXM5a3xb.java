package v.s;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final /* synthetic */ class aG8MaF53ScDsiXM5a3xb implements r96gMQOC3qOmbjRQeT1, z3H4CF5ES1APfy6l {
    public final /* synthetic */ Object Ee8d2j4S9Vm5yGuR;
    public final /* synthetic */ long JXn4Qf7zpnLjP5;
    public final /* synthetic */ Object vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs;
    public final /* synthetic */ Object xDyLpEZyrcKVe0;

    public /* synthetic */ aG8MaF53ScDsiXM5a3xb(CX2cgp0VaeW1h7Cx14 cX2cgp0VaeW1h7Cx14, Object obj, long j, TimeUnit timeUnit, int i) {
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = cX2cgp0VaeW1h7Cx14;
        this.xDyLpEZyrcKVe0 = obj;
        this.JXn4Qf7zpnLjP5 = j;
        this.Ee8d2j4S9Vm5yGuR = timeUnit;
    }

    @Override // v.s.z3H4CF5ES1APfy6l
    public Object JXn4Qf7zpnLjP5() {
        LutdQZ2I9fVx lutdQZ2I9fVx = (LutdQZ2I9fVx) this.vekpFI4d1Nc4fakF;
        Iterable iterable = (Iterable) this.xDyLpEZyrcKVe0;
        oO26y14q3Pwf oo26y14q3pwf = (oO26y14q3Pwf) this.Ee8d2j4S9Vm5yGuR;
        c0GsmbUiugE231HPbX c0gsmbuiuge231hpbx = (c0GsmbUiugE231HPbX) lutdQZ2I9fVx.vekpFI4d1Nc4fakF;
        c0gsmbuiuge231hpbx.getClass();
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + c0GsmbUiugE231HPbX.EWUjsTERgdPbSw3NNlN(iterable);
            SQLiteDatabase sQLiteDatabaseDDIMxZXP1V8HdM = c0gsmbuiuge231hpbx.dDIMxZXP1V8HdM();
            sQLiteDatabaseDDIMxZXP1V8HdM.beginTransaction();
            try {
                sQLiteDatabaseDDIMxZXP1V8HdM.compileStatement(str).execute();
                Cursor cursorRawQuery = sQLiteDatabaseDDIMxZXP1V8HdM.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        c0gsmbuiuge231hpbx.Qrz92kRPw4GcghAc(cursorRawQuery.getInt(0), gBBpLea0L3FRWXAzN.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                }
                cursorRawQuery.close();
                sQLiteDatabaseDDIMxZXP1V8HdM.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                sQLiteDatabaseDDIMxZXP1V8HdM.setTransactionSuccessful();
                sQLiteDatabaseDDIMxZXP1V8HdM.endTransaction();
            } catch (Throwable th2) {
                sQLiteDatabaseDDIMxZXP1V8HdM.endTransaction();
                throw th2;
            }
        }
        c0gsmbuiuge231hpbx.D5P1xCAyuvgF(new VlgbFe2EYrGc(lutdQZ2I9fVx.ibVTtJUNfrGYbW.JXn4Qf7zpnLjP5() + this.JXn4Qf7zpnLjP5, oo26y14q3pwf));
        return null;
    }

    @Override // v.s.r96gMQOC3qOmbjRQeT1
    public ScheduledFuture dDIMxZXP1V8HdM(r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c) {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                CX2cgp0VaeW1h7Cx14 cX2cgp0VaeW1h7Cx14 = (CX2cgp0VaeW1h7Cx14) this.vekpFI4d1Nc4fakF;
                Runnable runnable = (Runnable) this.xDyLpEZyrcKVe0;
                return cX2cgp0VaeW1h7Cx14.vekpFI4d1Nc4fakF.schedule(new tFtl6ch6nfbOxTcgPE(cX2cgp0VaeW1h7Cx14, runnable, r5xeufod5gsccwq6c, 1), this.JXn4Qf7zpnLjP5, (TimeUnit) this.Ee8d2j4S9Vm5yGuR);
            default:
                CX2cgp0VaeW1h7Cx14 cX2cgp0VaeW1h7Cx15 = (CX2cgp0VaeW1h7Cx14) this.vekpFI4d1Nc4fakF;
                Callable callable = (Callable) this.xDyLpEZyrcKVe0;
                return cX2cgp0VaeW1h7Cx15.vekpFI4d1Nc4fakF.schedule(new C5H5IAPDXXiG(cX2cgp0VaeW1h7Cx15, callable, r5xeufod5gsccwq6c, 0), this.JXn4Qf7zpnLjP5, (TimeUnit) this.Ee8d2j4S9Vm5yGuR);
        }
    }

    public /* synthetic */ aG8MaF53ScDsiXM5a3xb(LutdQZ2I9fVx lutdQZ2I9fVx, Iterable iterable, oO26y14q3Pwf oo26y14q3pwf, long j) {
        this.w9sT1Swbhx3hs = 2;
        this.vekpFI4d1Nc4fakF = lutdQZ2I9fVx;
        this.xDyLpEZyrcKVe0 = iterable;
        this.Ee8d2j4S9Vm5yGuR = oo26y14q3pwf;
        this.JXn4Qf7zpnLjP5 = j;
    }
}
