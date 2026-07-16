package v.s;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final /* synthetic */ class VlgbFe2EYrGc implements VMDuz8aYZEdHqSIte {
    public final /* synthetic */ oO26y14q3Pwf vekpFI4d1Nc4fakF;
    public final /* synthetic */ long w9sT1Swbhx3hs;

    public /* synthetic */ VlgbFe2EYrGc(long j, oO26y14q3Pwf oo26y14q3pwf) {
        this.w9sT1Swbhx3hs = j;
        this.vekpFI4d1Nc4fakF = oo26y14q3pwf;
    }

    private static /* synthetic */ void zsmpdm() {
    }

    @Override // v.s.VMDuz8aYZEdHqSIte
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.w9sT1Swbhx3hs));
        oO26y14q3Pwf oo26y14q3pwf = this.vekpFI4d1Nc4fakF;
        String str = oo26y14q3pwf.dDIMxZXP1V8HdM;
        LB7U1qakabytBm lB7U1qakabytBm = oo26y14q3pwf.vekpFI4d1Nc4fakF;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(oAbr1ycaDgFnfg.dDIMxZXP1V8HdM(lB7U1qakabytBm))}) < 1) {
            contentValues.put("backend_name", oo26y14q3pwf.dDIMxZXP1V8HdM);
            contentValues.put("priority", Integer.valueOf(oAbr1ycaDgFnfg.dDIMxZXP1V8HdM(lB7U1qakabytBm)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
