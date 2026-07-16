package v.s;

import android.content.Context;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class ny2QaoAAyfdnXseU2mn {
    public static final IXBvAqS2fpdIRK pyu8ovAipBTLYAiKab = new IXBvAqS2fpdIRK(new q2cpFJJZo2i97uMpROz(), new W6dfON4KdcdxlH(9));
    public final uW0IRoPBZMj2QmBkkp Ee8d2j4S9Vm5yGuR;
    public final m4D1Mt1iPzE1q0xxRP JXn4Qf7zpnLjP5;
    public final DBz5KzDJzqYVg1s b1EoSIRjJHO5;
    public final Context dDIMxZXP1V8HdM;
    public final fadfsJa4iEdiwEC4Xm8 ibVTtJUNfrGYbW;
    public final IXBvAqS2fpdIRK vekpFI4d1Nc4fakF;
    public final String w9sT1Swbhx3hs;
    public final int xDyLpEZyrcKVe0;

    public ny2QaoAAyfdnXseU2mn(Context context, IXBvAqS2fpdIRK iXBvAqS2fpdIRK, yRLsxLigSiPhRQHp yrlsxligsiphrqhp) {
        SbxdZ6Kq2uhHQ5RPRqm.b1EoSIRjJHO5(context, "Null context is not permitted.");
        SbxdZ6Kq2uhHQ5RPRqm.b1EoSIRjJHO5(iXBvAqS2fpdIRK, "Api must not be null.");
        SbxdZ6Kq2uhHQ5RPRqm.b1EoSIRjJHO5(yrlsxligsiphrqhp, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.dDIMxZXP1V8HdM = context.getApplicationContext();
        String str = null;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", null).invoke(context, null);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.w9sT1Swbhx3hs = str;
        this.vekpFI4d1Nc4fakF = iXBvAqS2fpdIRK;
        this.JXn4Qf7zpnLjP5 = m4D1Mt1iPzE1q0xxRP.dDIMxZXP1V8HdM;
        this.Ee8d2j4S9Vm5yGuR = new uW0IRoPBZMj2QmBkkp(iXBvAqS2fpdIRK, str);
        DBz5KzDJzqYVg1s dBz5KzDJzqYVg1sJXn4Qf7zpnLjP5 = DBz5KzDJzqYVg1s.JXn4Qf7zpnLjP5(this.dDIMxZXP1V8HdM);
        this.b1EoSIRjJHO5 = dBz5KzDJzqYVg1sJXn4Qf7zpnLjP5;
        this.xDyLpEZyrcKVe0 = dBz5KzDJzqYVg1sJXn4Qf7zpnLjP5.b1EoSIRjJHO5.getAndIncrement();
        this.ibVTtJUNfrGYbW = yrlsxligsiphrqhp.dDIMxZXP1V8HdM;
        iFLJbvrqroccc6 ifljbvrqroccc6 = dBz5KzDJzqYVg1sJXn4Qf7zpnLjP5.gIIiyi2ddlMDR0;
        ifljbvrqroccc6.sendMessage(ifljbvrqroccc6.obtainMessage(7, this));
    }

    public final SQzPENpgvzKX9IlD dDIMxZXP1V8HdM(N3OQwXegjg1zeRF n3OQwXegjg1zeRF) {
        r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c = new r5XEUfod5GSCCwq6c(19, false);
        ZOu84RhGdb62AhIs[] zOu84RhGdb62AhIsArr = {FZ1sl4mHq4J0hOEYC.Ee8d2j4S9Vm5yGuR};
        r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF = new r5XEUfod5GSCCwq6c(27, n3OQwXegjg1zeRF);
        RpiSWFqg6frykGldgWGU rpiSWFqg6frykGldgWGU = new RpiSWFqg6frykGldgWGU(r5xeufod5gsccwq6c, zOu84RhGdb62AhIsArr, false);
        al3CoDKXO0nvx al3codkxo0nvx = new al3CoDKXO0nvx();
        DBz5KzDJzqYVg1s dBz5KzDJzqYVg1s = this.b1EoSIRjJHO5;
        dBz5KzDJzqYVg1s.getClass();
        udvnM2Z9rzwC32 udvnm2z9rzwc32 = new udvnM2Z9rzwC32(rpiSWFqg6frykGldgWGU, al3codkxo0nvx, this.ibVTtJUNfrGYbW);
        iFLJbvrqroccc6 ifljbvrqroccc6 = dBz5KzDJzqYVg1s.gIIiyi2ddlMDR0;
        ifljbvrqroccc6.sendMessage(ifljbvrqroccc6.obtainMessage(4, new yaw9gSarozwmk(udvnm2z9rzwc32, dBz5KzDJzqYVg1s.pyu8ovAipBTLYAiKab.get(), this)));
        return al3codkxo0nvx.dDIMxZXP1V8HdM;
    }
}
