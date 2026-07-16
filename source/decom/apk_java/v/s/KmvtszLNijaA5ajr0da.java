package v.s;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class KmvtszLNijaA5ajr0da extends uR99txr6B9mvs4E {
    public final /* synthetic */ Object Ee8d2j4S9Vm5yGuR;
    public final /* synthetic */ bIQtXpTQsEoGIf25Z JXn4Qf7zpnLjP5;
    public final /* synthetic */ int vekpFI4d1Nc4fakF;

    public /* synthetic */ KmvtszLNijaA5ajr0da(bIQtXpTQsEoGIf25Z biqtxptqseogif25z, Object obj, int i) {
        this.vekpFI4d1Nc4fakF = i;
        this.JXn4Qf7zpnLjP5 = biqtxptqseogif25z;
        this.Ee8d2j4S9Vm5yGuR = obj;
    }

    private static /* synthetic */ void bqoadnnlu() {
    }

    @Override // v.s.uR99txr6B9mvs4E
    public final void w9sT1Swbhx3hs() {
        switch (this.vekpFI4d1Nc4fakF) {
            case 0:
                bIQtXpTQsEoGIf25Z biqtxptqseogif25z = this.JXn4Qf7zpnLjP5;
                WorkDatabase workDatabase = biqtxptqseogif25z.b1EoSIRjJHO5;
                workDatabase.vekpFI4d1Nc4fakF();
                try {
                    uR99txr6B9mvs4E.dDIMxZXP1V8HdM(biqtxptqseogif25z, ((UUID) this.Ee8d2j4S9Vm5yGuR).toString());
                    workDatabase.wotphlvK9sPbXJ();
                    workDatabase.D5P1xCAyuvgF();
                    Qbw3oj5SB4rmsG0k8.w9sT1Swbhx3hs(biqtxptqseogif25z.ibVTtJUNfrGYbW, biqtxptqseogif25z.b1EoSIRjJHO5, biqtxptqseogif25z.D5P1xCAyuvgF);
                    return;
                } catch (Throwable th) {
                    workDatabase.D5P1xCAyuvgF();
                    throw th;
                }
            default:
                bIQtXpTQsEoGIf25Z biqtxptqseogif25z2 = this.JXn4Qf7zpnLjP5;
                WorkDatabase workDatabase2 = biqtxptqseogif25z2.b1EoSIRjJHO5;
                workDatabase2.vekpFI4d1Nc4fakF();
                try {
                    ArrayList arrayListHjneShqpF9Tis4 = workDatabase2.XiR1pIn5878vVWd().hjneShqpF9Tis4((String) this.Ee8d2j4S9Vm5yGuR);
                    int size = arrayListHjneShqpF9Tis4.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayListHjneShqpF9Tis4.get(i);
                        i++;
                        uR99txr6B9mvs4E.dDIMxZXP1V8HdM(biqtxptqseogif25z2, (String) obj);
                    }
                    workDatabase2.wotphlvK9sPbXJ();
                    return;
                } finally {
                    workDatabase2.D5P1xCAyuvgF();
                }
        }
    }
}
