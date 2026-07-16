package v.s;

import android.content.Context;
import android.net.VpnService;
import app.mobilex.plus.services.KeepAliveVpnService;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class z1hY5aHhkqjyGs45lX0l extends LGm23hksIOxB implements JRdueaGIH5g8DVCPba {
    public final /* synthetic */ Context JXn4Qf7zpnLjP5;
    public final /* synthetic */ int vekpFI4d1Nc4fakF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z1hY5aHhkqjyGs45lX0l(Context context, int i) {
        super(0);
        this.vekpFI4d1Nc4fakF = i;
        this.JXn4Qf7zpnLjP5 = context;
    }

    private static /* synthetic */ void isvuxnpdaq() {
    }

    @Override // v.s.JRdueaGIH5g8DVCPba
    public final Object w9sT1Swbhx3hs() {
        boolean z;
        int i = this.vekpFI4d1Nc4fakF;
        Context context = this.JXn4Qf7zpnLjP5;
        switch (i) {
            case 0:
                VpKcDcuRNaQkRJ5 vpKcDcuRNaQkRJ5 = VpKcDcuRNaQkRJ5.dDIMxZXP1V8HdM;
                return Boolean.valueOf(VpKcDcuRNaQkRJ5.JXn4Qf7zpnLjP5(context));
            case 1:
                return Boolean.valueOf(context.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0);
            case 2:
                VpKcDcuRNaQkRJ5 vpKcDcuRNaQkRJ6 = VpKcDcuRNaQkRJ5.dDIMxZXP1V8HdM;
                return Boolean.valueOf(VpKcDcuRNaQkRJ5.Ee8d2j4S9Vm5yGuR(context));
            case 3:
                VpKcDcuRNaQkRJ5 vpKcDcuRNaQkRJ7 = VpKcDcuRNaQkRJ5.dDIMxZXP1V8HdM;
                return Boolean.valueOf(VpKcDcuRNaQkRJ5.xDyLpEZyrcKVe0(context));
            default:
                String str = KeepAliveVpnService.w9sT1Swbhx3hs;
                try {
                    z = VpnService.prepare(context) == null;
                } catch (Throwable unused) {
                }
                return Boolean.valueOf(z);
        }
    }
}
