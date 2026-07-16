package v.s;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class erZKFX6OwHmny8Sd6 extends com.google.android.gms.common.internal.dDIMxZXP1V8HdM {
    public final m4D1Mt1iPzE1q0xxRP EWUjsTERgdPbSw3NNlN;

    public erZKFX6OwHmny8Sd6(Context context, Looper looper, eTeIZwLyooQrZ0ICI9i eteizwlyooqrz0ici9i, m4D1Mt1iPzE1q0xxRP m4d1mt1ipze1q0xxrp, eJzD6jrSBjwYspq ejzd6jrsbjwyspq, eJzD6jrSBjwYspq ejzd6jrsbjwyspq2) {
        super(context, looper, 270, eteizwlyooqrz0ici9i, ejzd6jrsbjwyspq, ejzd6jrsbjwyspq2);
        this.EWUjsTERgdPbSw3NNlN = m4d1mt1ipze1q0xxrp;
    }

    private static /* synthetic */ void mzwtx() {
    }

    @Override // com.google.android.gms.common.internal.dDIMxZXP1V8HdM
    public final boolean H9XlUr4OeMJFiXK() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.dDIMxZXP1V8HdM
    public final Bundle J0zjQ7CAgohuxU20eCW6() {
        this.EWUjsTERgdPbSw3NNlN.getClass();
        return new Bundle();
    }

    @Override // com.google.android.gms.common.internal.dDIMxZXP1V8HdM
    public final String MLSIo1htfMPWeB8V876L() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.dDIMxZXP1V8HdM
    public final IInterface Qrz92kRPw4GcghAc(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof TWNI5JFAawh52MYAtBI7 ? (TWNI5JFAawh52MYAtBI7) iInterfaceQueryLocalInterface : new TWNI5JFAawh52MYAtBI7(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    @Override // com.google.android.gms.common.internal.dDIMxZXP1V8HdM
    public final String XiR1pIn5878vVWd() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // v.s.K5l5kmuyJzrgUX
    public final int ibVTtJUNfrGYbW() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.dDIMxZXP1V8HdM
    public final ZOu84RhGdb62AhIs[] nQilHWaqS401ZtR() {
        return FZ1sl4mHq4J0hOEYC.xDyLpEZyrcKVe0;
    }
}
