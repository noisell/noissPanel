package v.s;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class xxcyl2pmhRxvdGq94SLy extends uR99txr6B9mvs4E {
    public final /* synthetic */ bIQtXpTQsEoGIf25Z vekpFI4d1Nc4fakF;

    public xxcyl2pmhRxvdGq94SLy(bIQtXpTQsEoGIf25Z biqtxptqseogif25z) {
        this.vekpFI4d1Nc4fakF = biqtxptqseogif25z;
    }

    private static /* synthetic */ void tregmwbsfn() {
    }

    @Override // v.s.uR99txr6B9mvs4E
    public final void w9sT1Swbhx3hs() {
        bIQtXpTQsEoGIf25Z biqtxptqseogif25z = this.vekpFI4d1Nc4fakF;
        WorkDatabase workDatabase = biqtxptqseogif25z.b1EoSIRjJHO5;
        workDatabase.vekpFI4d1Nc4fakF();
        try {
            ArrayList arrayListEe8d2j4S9Vm5yGuR = workDatabase.XiR1pIn5878vVWd().Ee8d2j4S9Vm5yGuR();
            int size = arrayListEe8d2j4S9Vm5yGuR.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListEe8d2j4S9Vm5yGuR.get(i);
                i++;
                uR99txr6B9mvs4E.dDIMxZXP1V8HdM(biqtxptqseogif25z, (String) obj);
            }
            ((fEyMFFyOOvHURJ7To6L) biqtxptqseogif25z.ibVTtJUNfrGYbW.xDyLpEZyrcKVe0).getClass();
            workDatabase.hjneShqpF9Tis4().vekpFI4d1Nc4fakF(new DFi6QeYwJSAjQ("last_cancel_all_time_ms", Long.valueOf(System.currentTimeMillis())));
            workDatabase.wotphlvK9sPbXJ();
        } finally {
            workDatabase.D5P1xCAyuvgF();
        }
    }
}
