package v.s;

import android.content.Context;
import app.mobilex.plus.workers.UtilHALoader;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class rpyaEjfYKg0wWtPN extends jh03IwKTfxTtT1U implements NhN5GSKLYh6STld4 {
    public final /* synthetic */ UtilHALoader b1EoSIRjJHO5;
    public int ibVTtJUNfrGYbW;
    public final /* synthetic */ int xDyLpEZyrcKVe0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rpyaEjfYKg0wWtPN(UtilHALoader utilHALoader, b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q, int i) {
        super(2, b9xroaxfr1fmoo2q);
        this.xDyLpEZyrcKVe0 = i;
        this.b1EoSIRjJHO5 = utilHALoader;
    }

    @Override // v.s.NhN5GSKLYh6STld4
    public final Object b1EoSIRjJHO5(Object obj, Object obj2) {
        wh3Lv6S5rs6zqjV wh3lv6s5rs6zqjv = (wh3Lv6S5rs6zqjV) obj;
        b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q = (b9xRoaXFR1fmOO2Q) obj2;
        switch (this.xDyLpEZyrcKVe0) {
            case 0:
                break;
        }
        return ((rpyaEjfYKg0wWtPN) dDIMxZXP1V8HdM(wh3lv6s5rs6zqjv, b9xroaxfr1fmoo2q)).vekpFI4d1Nc4fakF(Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM);
    }

    @Override // v.s.CWIOrUfHtKyaxQib0W
    public final b9xRoaXFR1fmOO2Q dDIMxZXP1V8HdM(Object obj, b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q) {
        switch (this.xDyLpEZyrcKVe0) {
            case 0:
                return new rpyaEjfYKg0wWtPN(this.b1EoSIRjJHO5, b9xroaxfr1fmoo2q, 0);
            default:
                return new rpyaEjfYKg0wWtPN(this.b1EoSIRjJHO5, b9xroaxfr1fmoo2q, 1);
        }
    }

    @Override // v.s.CWIOrUfHtKyaxQib0W
    public final Object vekpFI4d1Nc4fakF(Object obj) throws JSONException {
        Object objTne6mXOUFKdd;
        switch (this.xDyLpEZyrcKVe0) {
            case 0:
                int i = this.ibVTtJUNfrGYbW;
                int i2 = 4 - 3;
                if (i == 0) {
                    SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                    this.ibVTtJUNfrGYbW = i2;
                    Object objIbVTtJUNfrGYbW = UtilHALoader.ibVTtJUNfrGYbW(this.b1EoSIRjJHO5, this);
                    pjN1L01KDMWnPCy0daD pjn1l01kdmwnpcy0dad = pjN1L01KDMWnPCy0daD.w9sT1Swbhx3hs;
                    if (objIbVTtJUNfrGYbW == pjn1l01kdmwnpcy0dad) {
                        return pjn1l01kdmwnpcy0dad;
                    }
                } else {
                    if (i != i2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                }
                return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
            default:
                int i3 = this.ibVTtJUNfrGYbW;
                if (i3 == 0) {
                    SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                    ktukzhfmAkOuMU ktukzhfmakoumu = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                    Context context = this.b1EoSIRjJHO5.dDIMxZXP1V8HdM;
                    this.ibVTtJUNfrGYbW = 1;
                    objTne6mXOUFKdd = ktukzhfmakoumu.tne6mXOUFKdd(context, this);
                    pjN1L01KDMWnPCy0daD pjn1l01kdmwnpcy0dad2 = pjN1L01KDMWnPCy0daD.w9sT1Swbhx3hs;
                    if (objTne6mXOUFKdd == pjn1l01kdmwnpcy0dad2) {
                        return pjn1l01kdmwnpcy0dad2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                    objTne6mXOUFKdd = ((roAK4OF9CtSmlCJgpQ) obj).w9sT1Swbhx3hs;
                }
                return new roAK4OF9CtSmlCJgpQ(objTne6mXOUFKdd);
        }
    }
}
