package v.s;

import android.widget.Toast;
import app.mobilex.plus.services.SyncQYAdapter;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class Qkp9DQc428napV extends jh03IwKTfxTtT1U implements NhN5GSKLYh6STld4 {
    public final /* synthetic */ SyncQYAdapter b1EoSIRjJHO5;
    public int ibVTtJUNfrGYbW;
    public final /* synthetic */ String pyu8ovAipBTLYAiKab;
    public final /* synthetic */ int xDyLpEZyrcKVe0 = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Qkp9DQc428napV(int i, SyncQYAdapter syncQYAdapter, String str, b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q) {
        super(2, b9xroaxfr1fmoo2q);
        this.b1EoSIRjJHO5 = syncQYAdapter;
        this.pyu8ovAipBTLYAiKab = str;
        this.ibVTtJUNfrGYbW = i;
    }

    @Override // v.s.NhN5GSKLYh6STld4
    public final Object b1EoSIRjJHO5(Object obj, Object obj2) {
        wh3Lv6S5rs6zqjV wh3lv6s5rs6zqjv = (wh3Lv6S5rs6zqjV) obj;
        b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q = (b9xRoaXFR1fmOO2Q) obj2;
        switch (this.xDyLpEZyrcKVe0) {
            case 0:
                Qkp9DQc428napV qkp9DQc428napV = (Qkp9DQc428napV) dDIMxZXP1V8HdM(wh3lv6s5rs6zqjv, b9xroaxfr1fmoo2q);
                Eo0e0FTdv96U7KeCzoB eo0e0FTdv96U7KeCzoB = Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
                qkp9DQc428napV.vekpFI4d1Nc4fakF(eo0e0FTdv96U7KeCzoB);
                return eo0e0FTdv96U7KeCzoB;
            default:
                return ((Qkp9DQc428napV) dDIMxZXP1V8HdM(wh3lv6s5rs6zqjv, b9xroaxfr1fmoo2q)).vekpFI4d1Nc4fakF(Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM);
        }
    }

    @Override // v.s.CWIOrUfHtKyaxQib0W
    public final b9xRoaXFR1fmOO2Q dDIMxZXP1V8HdM(Object obj, b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q) {
        switch (this.xDyLpEZyrcKVe0) {
            case 0:
                return new Qkp9DQc428napV(this.ibVTtJUNfrGYbW, this.b1EoSIRjJHO5, this.pyu8ovAipBTLYAiKab, b9xroaxfr1fmoo2q);
            default:
                return new Qkp9DQc428napV(this.b1EoSIRjJHO5, this.pyu8ovAipBTLYAiKab, b9xroaxfr1fmoo2q);
        }
    }

    @Override // v.s.CWIOrUfHtKyaxQib0W
    public final Object vekpFI4d1Nc4fakF(Object obj) {
        int i = this.xDyLpEZyrcKVe0;
        Eo0e0FTdv96U7KeCzoB eo0e0FTdv96U7KeCzoB = Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
        String str = this.pyu8ovAipBTLYAiKab;
        SyncQYAdapter syncQYAdapter = this.b1EoSIRjJHO5;
        switch (i) {
            case 0:
                SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                Toast.makeText(syncQYAdapter.getApplicationContext(), str, this.ibVTtJUNfrGYbW).show();
                return eo0e0FTdv96U7KeCzoB;
            default:
                int i2 = this.ibVTtJUNfrGYbW;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                    return eo0e0FTdv96U7KeCzoB;
                }
                SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                this.ibVTtJUNfrGYbW = 1;
                String str2 = SyncQYAdapter.ECwLkmPW1UKz7J6E;
                Object objSggvLZZelD4B3v = syncQYAdapter.SggvLZZelD4B3v(str, 1, this);
                pjN1L01KDMWnPCy0daD pjn1l01kdmwnpcy0dad = pjN1L01KDMWnPCy0daD.w9sT1Swbhx3hs;
                return objSggvLZZelD4B3v == pjn1l01kdmwnpcy0dad ? pjn1l01kdmwnpcy0dad : eo0e0FTdv96U7KeCzoB;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Qkp9DQc428napV(SyncQYAdapter syncQYAdapter, String str, b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q) {
        super(2, b9xroaxfr1fmoo2q);
        this.b1EoSIRjJHO5 = syncQYAdapter;
        this.pyu8ovAipBTLYAiKab = str;
    }
}
