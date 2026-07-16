package v.s;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class yxHahRRBtYSFIdIyJfsV {
    public static final O162WzpEtUgucWBV dDIMxZXP1V8HdM = new O162WzpEtUgucWBV();
    public static Locale w9sT1Swbhx3hs;

    public static String Ee8d2j4S9Vm5yGuR(Context context, String str) {
        Resources resourcesForApplication;
        O162WzpEtUgucWBV o162WzpEtUgucWBV = dDIMxZXP1V8HdM;
        synchronized (o162WzpEtUgucWBV) {
            try {
                Locale locale = fMwFhLScJ8pv.dDIMxZXP1V8HdM(context.getResources().getConfiguration()).get(0);
                if (!locale.equals(w9sT1Swbhx3hs)) {
                    o162WzpEtUgucWBV.clear();
                    w9sT1Swbhx3hs = locale;
                }
                String str2 = (String) o162WzpEtUgucWBV.get(str);
                if (str2 != null) {
                    return str2;
                }
                int i = WUKu8Lj5A4IfwZ.vekpFI4d1Nc4fakF;
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resourcesForApplication = null;
                }
                if (resourcesForApplication != null) {
                    int identifier = resourcesForApplication.getIdentifier(str, "string", "com.google.android.gms");
                    if (identifier != 0) {
                        String string = resourcesForApplication.getString(identifier);
                        if (!TextUtils.isEmpty(string)) {
                            dDIMxZXP1V8HdM.put(str, string);
                            return string;
                        }
                        if (str.length() != 0) {
                            "Got empty resource: ".concat(str);
                        }
                    } else if (str.length() != 0) {
                        "Missing resource: ".concat(str);
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String JXn4Qf7zpnLjP5(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strEe8d2j4S9Vm5yGuR = Ee8d2j4S9Vm5yGuR(context, str);
        if (strEe8d2j4S9Vm5yGuR == null) {
            strEe8d2j4S9Vm5yGuR = resources.getString(2131427346);
        }
        return String.format(resources.getConfiguration().locale, strEe8d2j4S9Vm5yGuR, str2);
    }

    public static String dDIMxZXP1V8HdM(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = I5wRTRZp0psyO1L.dDIMxZXP1V8HdM(context).dDIMxZXP1V8HdM;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    private static /* synthetic */ void kvzkinlsbp() {
    }

    public static String vekpFI4d1Nc4fakF(Context context, int i) {
        Resources resources = context.getResources();
        if (i == 1) {
            return resources.getString(2131427343);
        }
        if (i == (-8) + 10) {
            return resources.getString(2131427350);
        }
        if (i == 3) {
            return resources.getString(2131427340);
        }
        if (i == 5) {
            return Ee8d2j4S9Vm5yGuR(context, "common_google_play_services_invalid_account_title");
        }
        if (i == 7) {
            return Ee8d2j4S9Vm5yGuR(context, "common_google_play_services_network_error_title");
        }
        if (i == 17) {
            return Ee8d2j4S9Vm5yGuR(context, "common_google_play_services_sign_in_failed_title");
        }
        if (i != 20) {
            return null;
        }
        return Ee8d2j4S9Vm5yGuR(context, "common_google_play_services_restricted_profile_title");
    }

    public static String w9sT1Swbhx3hs(Context context, int i) {
        Resources resources = context.getResources();
        String strDDIMxZXP1V8HdM = dDIMxZXP1V8HdM(context);
        if (i == 1) {
            return resources.getString(2131427342, strDDIMxZXP1V8HdM);
        }
        if (i == 2) {
            return okc5AGRjqrud84oM6d.gIIiyi2ddlMDR0(context) ? resources.getString(2131427352) : resources.getString(2131427349, strDDIMxZXP1V8HdM);
        }
        if (i == 3) {
            return resources.getString(2131427339, strDDIMxZXP1V8HdM);
        }
        if (i == 5) {
            return JXn4Qf7zpnLjP5(context, "common_google_play_services_invalid_account_text", strDDIMxZXP1V8HdM);
        }
        if (i == 7) {
            return JXn4Qf7zpnLjP5(context, "common_google_play_services_network_error_text", strDDIMxZXP1V8HdM);
        }
        if (i == 9) {
            return resources.getString(2131427347, strDDIMxZXP1V8HdM);
        }
        if (i == 55 - 35) {
            return JXn4Qf7zpnLjP5(context, "common_google_play_services_restricted_profile_text", strDDIMxZXP1V8HdM);
        }
        switch (i) {
            case 16:
                return JXn4Qf7zpnLjP5(context, "common_google_play_services_api_unavailable_text", strDDIMxZXP1V8HdM);
            case 17:
                return JXn4Qf7zpnLjP5(context, "common_google_play_services_sign_in_failed_text", strDDIMxZXP1V8HdM);
            case 18:
                return resources.getString(2131427351, strDDIMxZXP1V8HdM);
            default:
                return resources.getString(2131427346, strDDIMxZXP1V8HdM);
        }
    }
}
