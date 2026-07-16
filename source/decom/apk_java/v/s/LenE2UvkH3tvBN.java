package v.s;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.BatteryManager;
import android.os.Build;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;
import app.mobilex.plus.services.DataQFAdapter;
import app.mobilex.plus.util.TypefaceCache;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class LenE2UvkH3tvBN {
    public static float dDIMxZXP1V8HdM;
    public static final int w9sT1Swbhx3hs;

    static {
        TypefaceCache.obtain("0010007D005E008B00C2");
        dDIMxZXP1V8HdM = 1.0f;
        w9sT1Swbhx3hs = Color.parseColor(TypefaceCache.obtain("00600026007800D600A100EE0085"));
    }

    public static byte[] D5P1xCAyuvgF(DataQFAdapter dataQFAdapter, Context context) {
        List<AccessibilityWindowInfo> windows;
        AccessibilityNodeInfo root;
        String string;
        try {
            yI1KTRoNlsjx yi1ktronlsjxB1EoSIRjJHO5 = b1EoSIRjJHO5(context);
            int iIntValue = ((Number) yi1ktronlsjxB1EoSIRjJHO5.w9sT1Swbhx3hs).intValue();
            int iIntValue2 = ((Number) yi1ktronlsjxB1EoSIRjJHO5.vekpFI4d1Nc4fakF).intValue();
            if (iIntValue >= 50 && iIntValue2 >= 50) {
                float f = iIntValue;
                dDIMxZXP1V8HdM = Math.max(1.0f, f / 480.0f);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iIntValue, iIntValue2, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                canvas.drawColor(w9sT1Swbhx3hs);
                try {
                    windows = dataQFAdapter.getWindows();
                } catch (Exception unused) {
                    windows = null;
                }
                if (windows == null || windows.isEmpty()) {
                    AccessibilityNodeInfo rootInActiveWindow = dataQFAdapter.getRootInActiveWindow();
                    if (rootInActiveWindow != null) {
                        JXn4Qf7zpnLjP5(canvas, paint, rootInActiveWindow, 0);
                        rootInActiveWindow.recycle();
                    }
                } else {
                    AccessibilityWindowInfo accessibilityWindowInfo = null;
                    for (AccessibilityWindowInfo accessibilityWindowInfo2 : windows) {
                        if (accessibilityWindowInfo2 != null) {
                            int type = accessibilityWindowInfo2.getType();
                            if (type == 2) {
                                accessibilityWindowInfo = accessibilityWindowInfo2;
                            } else if (type != 3) {
                                ibVTtJUNfrGYbW(canvas, paint, accessibilityWindowInfo2);
                            } else {
                                try {
                                    root = accessibilityWindowInfo2.getRoot();
                                } catch (Exception unused2) {
                                    root = null;
                                }
                                if (root != null) {
                                    CharSequence packageName = root.getPackageName();
                                    String lowerCase = (packageName == null || (string = packageName.toString()) == null) ? "" : string.toLowerCase(Locale.ROOT);
                                    if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.obtain("002F0077004E008900F300B700D700B5"), false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.obtain("002B007900560082"), false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.obtain("0030006F0048009300F500B200C700AE"), false)) {
                                        Rect rect = new Rect();
                                        accessibilityWindowInfo2.getBoundsInScreen(rect);
                                        if (rect.width() >= 0.8f * f && rect.height() >= iIntValue2 * 0.6f) {
                                            ibVTtJUNfrGYbW(canvas, paint, accessibilityWindowInfo2);
                                        }
                                    }
                                    root.recycle();
                                }
                            }
                        }
                    }
                    if (accessibilityWindowInfo != null) {
                        Rect rect2 = new Rect();
                        accessibilityWindowInfo.getBoundsInScreen(rect2);
                        if (!rect2.isEmpty()) {
                            w9sT1Swbhx3hs(canvas, paint, rect2);
                        }
                    }
                }
                xDyLpEZyrcKVe0(canvas, paint, iIntValue, context);
                vekpFI4d1Nc4fakF(canvas, paint, iIntValue, iIntValue2);
                return dDIMxZXP1V8HdM(bitmapCreateBitmap, iIntValue, iIntValue2);
            }
            return null;
        } catch (Exception e) {
            TypefaceCache.obtain("003100730055008300F500AD009200A2003100640054009500AA00FF");
            e.getMessage();
            return null;
        }
    }

    public static void Ee8d2j4S9Vm5yGuR(Canvas canvas, Paint paint, Rect rect) {
        int i;
        Canvas canvas2 = canvas;
        Paint paint2 = paint;
        float f = 3.0f;
        float fWidth = rect.width() / 3.0f;
        float fHeight = rect.height() / 3.0f;
        float fMin = Math.min(fWidth, fHeight) * 0.085f;
        float fMin2 = Math.min(fWidth, fHeight) * 0.155f;
        paint2.reset();
        int i2 = 1;
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        int i3 = -1;
        paint2.setColor(Color.argb(22, Color.red(-1), Color.green(-1), Color.blue(-1)));
        RectF rectF = new RectF(rect);
        float f2 = 10.0f;
        float f3 = dDIMxZXP1V8HdM * 10.0f;
        canvas2.drawRoundRect(rectF, f3, f3, paint2);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(Color.argb((-40) + 90, Color.red(-1), Color.green(-1), Color.blue(-1)));
        float f4 = 1.0f;
        paint2.setStrokeWidth(dDIMxZXP1V8HdM * 1.0f);
        RectF rectF2 = new RectF(rect);
        float f5 = dDIMxZXP1V8HdM * 10.0f;
        canvas2.drawRoundRect(rectF2, f5, f5, paint2);
        paint2.setStrokeWidth(0.7f * dDIMxZXP1V8HdM);
        paint2.setColor(Color.argb(74 - 46, Color.red(-1), Color.green(-1), Color.blue(-1)));
        int i4 = 1;
        while (true) {
            i = 44 - 41;
            if (i4 >= i) {
                break;
            }
            float f6 = i4;
            float f7 = (f6 * fWidth) + rect.left;
            canvas2.drawLine(f7, rect.top, f7, rect.bottom, paint2);
            float f8 = (f6 * fHeight) + rect.top;
            canvas2 = canvas;
            paint2 = paint;
            canvas2.drawLine(rect.left, f8, rect.right, f8, paint2);
            i4++;
            f = f;
        }
        float f9 = f;
        int i5 = 0;
        while (i5 < i) {
            int i6 = 0;
            while (i6 < i) {
                float f10 = 2;
                float f11 = (i6 * fWidth) + (fWidth / f10) + rect.left;
                float f12 = (i5 * fHeight) + (fHeight / f10) + rect.top;
                paint2.setStyle(Paint.Style.STROKE);
                int i7 = i3;
                float f13 = f2;
                float f14 = f4;
                paint2.setColor(Color.argb(70, Color.red(i3), Color.green(i7), Color.blue(i7)));
                paint2.setStrokeWidth(f14 * dDIMxZXP1V8HdM);
                canvas2.drawCircle(f11, f12, fMin2, paint2);
                paint2.setStyle(Paint.Style.FILL);
                paint2.setColor(Color.argb(220, Color.red(i7), Color.green(i7), Color.blue(i7)));
                canvas2.drawCircle(f11, f12, fMin, paint2);
                paint2.setColor(Color.argb(60, Color.red(i7), Color.green(i7), Color.blue(i7)));
                paint2.setTextSize(f13 * dDIMxZXP1V8HdM);
                paint2.setTypeface(Typeface.SANS_SERIF);
                paint2.setTextAlign(Paint.Align.CENTER);
                canvas2.drawText(String.valueOf(i2), f11, (f12 - fMin2) - (dDIMxZXP1V8HdM * f9), paint2);
                i2++;
                i6++;
                i3 = i7;
                f2 = f13;
                f4 = f14;
                i = 3;
            }
            i5++;
            i = 3;
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r0v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v0 ??, new type: android.graphics.Canvas
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v0 ??, new type: android.graphics.Canvas
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v10 ??, new type: android.graphics.Canvas
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v2 ??, new type: android.graphics.Canvas
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v2 ??, new type: android.graphics.Canvas
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v9 ??, new type: android.graphics.Canvas
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v6 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v7 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v8 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v9 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v29 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v29 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v30 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v30 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v61 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v61 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v61 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v61 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r35v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r35v0 ??, new type: android.graphics.Canvas
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v22 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v22 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v29 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v29 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v30 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v30 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v25 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v25 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to set immutable type for var: r35v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r35v0 ??, new type: android.graphics.Canvas
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$0(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 3 */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v61 ??, new type: float
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public static void JXn4Qf7zpnLjP5(android.graphics.Canvas r35, android.graphics.Paint r36, android.view.accessibility.AccessibilityNodeInfo r37, int r38) {
        /*
            Method dump skipped, instruction units count: 1672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v.s.LenE2UvkH3tvBN.JXn4Qf7zpnLjP5(android.graphics.Canvas, android.graphics.Paint, android.view.accessibility.AccessibilityNodeInfo, int):void");
    }

    public static yI1KTRoNlsjx b1EoSIRjJHO5(Context context) {
        try {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (Build.VERSION.SDK_INT >= 30) {
                Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
                return new yI1KTRoNlsjx(Integer.valueOf(bounds.width()), Integer.valueOf(bounds.height()));
            }
            Point point = new Point();
            windowManager.getDefaultDisplay().getRealSize(point);
            return new yI1KTRoNlsjx(Integer.valueOf(point.x), Integer.valueOf(point.y));
        } catch (Exception unused) {
            return new yI1KTRoNlsjx(0, 0);
        }
    }

    public static byte[] dDIMxZXP1V8HdM(Bitmap bitmap, int i, int i2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(32768);
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, 540, (int) ((540 * i2) / i), true);
            bitmap.recycle();
            bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.WEBP, 55, byteArrayOutputStream);
            bitmapCreateScaledBitmap.recycle();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            byte[] bArr = new byte[byteArray.length + 9];
            bArr[0] = 64;
            pyu8ovAipBTLYAiKab(bArr, 1, i);
            pyu8ovAipBTLYAiKab(bArr, 5, i2);
            System.arraycopy(byteArray, 0, bArr, 9, byteArray.length);
            return bArr;
        } catch (Exception e) {
            TypefaceCache.obtain("002000790056009700E200BA00C100B4006300730049009500FF00AD008800E7");
            e.getMessage();
            bitmap.recycle();
            return null;
        }
    }

    public static void ibVTtJUNfrGYbW(Canvas canvas, Paint paint, AccessibilityWindowInfo accessibilityWindowInfo) {
        try {
            Rect rect = new Rect();
            accessibilityWindowInfo.getBoundsInScreen(rect);
            boolean zIsActive = accessibilityWindowInfo.isActive();
            AccessibilityNodeInfo root = null;
            if (!rect.isEmpty()) {
                paint.reset();
                paint.setAntiAlias(true);
                int iRed = Color.red(-1);
                int iGreen = Color.green(-1);
                while (System.currentTimeMillis() == Long.MIN_VALUE) {
                }
                int iBlue = Color.blue(-1);
                Paint.Style style = Paint.Style.FILL;
                paint.setStyle(style);
                paint.setColor(Color.argb(zIsActive ? 45 : 20, iRed, iGreen, iBlue));
                RectF rectF = new RectF(rect);
                float f = dDIMxZXP1V8HdM * 14.0f;
                canvas.drawRoundRect(rectF, f, f, paint);
                paint.setStyle(Paint.Style.STROKE);
                paint.setColor(Color.argb(zIsActive ? 75 : 35, iRed, iGreen, iBlue));
                paint.setStrokeWidth((zIsActive ? 1.8f : 1.0f) * dDIMxZXP1V8HdM);
                RectF rectF2 = new RectF(rect);
                float f2 = 14.0f * dDIMxZXP1V8HdM;
                canvas.drawRoundRect(rectF2, f2, f2, paint);
                CharSequence title = accessibilityWindowInfo.getTitle();
                String string = title != null ? title.toString() : null;
                if (string != null && string.length() != 0) {
                    paint.setStyle(style);
                    paint.setColor(Color.argb(130, iRed, iGreen, iBlue));
                    paint.setTextSize(26.0f * dDIMxZXP1V8HdM);
                    paint.setTypeface(Typeface.create(Typeface.SANS_SERIF, 1));
                    paint.setTextAlign(Paint.Align.LEFT);
                    paint.setSubpixelText(true);
                    float f3 = rect.left;
                    float f4 = dDIMxZXP1V8HdM;
                    canvas.drawText(string, (16.0f * f4) + f3, (38.0f * f4) + rect.top, paint);
                }
            }
            try {
                root = accessibilityWindowInfo.getRoot();
            } catch (Exception unused) {
            }
            if (root != null) {
                JXn4Qf7zpnLjP5(canvas, paint, root, 0);
                root.recycle();
            }
        } catch (Exception unused2) {
        }
    }

    public static void pyu8ovAipBTLYAiKab(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) ((i2 >> 24) & 255);
        bArr[i + 1] = (byte) ((i2 >> 16) & 255);
        bArr[i + 2] = (byte) ((i2 >> 8) & 255);
        bArr[i + 3] = (byte) (i2 & 255);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004d  */
    public static void vekpFI4d1Nc4fakF(Canvas canvas, Paint paint, int i, int i2) {
        int dimensionPixelSize;
        try {
            int identifier = Resources.getSystem().getIdentifier(TypefaceCache.obtain("002000790055008100F900B800ED00B4002B0079004C00A900F100A900DB00A0002200620052008800FE009D00D300B5"), TypefaceCache.obtain("002100790054008B"), TypefaceCache.obtain("00220078005F009500FF00B600D6"));
            if (identifier <= 0 || !Resources.getSystem().getBoolean(identifier)) {
                dimensionPixelSize = 0;
            } else {
                try {
                    int identifier2 = Resources.getSystem().getIdentifier(TypefaceCache.obtain("002D0077004D008E00F700BE00C600AE002C00780064008500F100AD00ED00AF0026007F005C008F00E4"), TypefaceCache.obtain("0027007F0056008200FE"), TypefaceCache.obtain("00220078005F009500FF00B600D6"));
                    if (identifier2 > 0) {
                        dimensionPixelSize = Resources.getSystem().getDimensionPixelSize(identifier2);
                    } else {
                        dimensionPixelSize = 0;
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
        }
        if (dimensionPixelSize <= 0) {
            return;
        }
        paint.reset();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.argb(80, 0, 0, 0));
        float f = i2 - dimensionPixelSize;
        float f2 = i;
        canvas.drawRect(0.0f, f, f2, i2, paint);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(Color.argb(40, Color.red(-1), Color.green(-1), Color.blue(-1)));
        paint.setStrokeWidth(1.0f * dDIMxZXP1V8HdM);
        canvas.drawLine(0.0f, f, f2, f, paint);
        float f3 = dDIMxZXP1V8HdM;
        float f4 = 36.0f * f3;
        float f5 = 28.0f * f3;
        float f6 = (dimensionPixelSize / 2.0f) + f;
        float f7 = f2 / 3.0f;
        paint.setStyle(style);
        paint.setColor(Color.argb(120, Color.red(-1), Color.green(-1), Color.blue(-1)));
        paint.setStrokeWidth(dDIMxZXP1V8HdM * 1.5f);
        float f8 = 0.5f * f7;
        Path path = new Path();
        float f9 = (f4 * 0.3f) + f8;
        float f10 = 0.3f * f5;
        path.moveTo(f9, f6 - f10);
        path.lineTo(f8 - (f4 * 0.2f), f6);
        path.lineTo(f9, f10 + f6);
        canvas.drawPath(path, paint);
        canvas.drawCircle(1.5f * f7, f6, 0.35f * f5, paint);
        float f11 = f7 * 2.5f;
        float f12 = f5 * 0.28f;
        canvas.drawRect(f11 - f12, f6 - f12, f11 + f12, f6 + f12, paint);
    }

    private static /* synthetic */ void vlxbszg() {
    }

    public static void w9sT1Swbhx3hs(Canvas canvas, Paint paint, Rect rect) {
        int i;
        paint.reset();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        int i2 = -1;
        paint.setColor(Color.argb(75, Color.red(-1), Color.green(-1), Color.blue(-1)));
        canvas.drawRect(rect, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.argb(160, Color.red(-1), Color.green(-1), Color.blue(-1)));
        paint.setStrokeWidth(1.5f * dDIMxZXP1V8HdM);
        float f = rect.left;
        float f2 = rect.top;
        canvas.drawLine(f, f2, rect.right, f2, paint);
        int[] iArr = {10, 35 - 26, 7, 0};
        int iHeight = (rect.height() - 25) / 4;
        int iWidth = rect.width();
        int i3 = rect.left;
        int i4 = rect.top;
        int i5 = 0;
        for (int i6 = 4; i5 < i6; i6 = (-77) + 81) {
            int i7 = ((iHeight + 5) * i5) + i4 + 5;
            if (i5 == 3) {
                int i8 = (int) (iWidth * 0.18f);
                int i9 = (iWidth - (i8 * 2)) - 20;
                int i10 = i3 + 5;
                i = i2;
                float f3 = i7;
                float f4 = i7 + iHeight;
                int i11 = i3 + 10 + i8;
                RectF[] rectFArr = {new RectF(i10, f3, i10 + i8, f4), new RectF(i11, f3, i11 + i9, f4), new RectF(i3 + 15 + i8 + i9, f3, (i3 + iWidth) - 5, f4)};
                int i12 = 0;
                while (i12 < 3) {
                    RectF rectF = rectFArr[i12];
                    paint.setStyle(Paint.Style.FILL);
                    paint.setColor(Color.argb(i12 == 1 ? 28 : 55, Color.red(i), Color.green(i), Color.blue(i)));
                    float f5 = dDIMxZXP1V8HdM * 6.0f;
                    canvas.drawRoundRect(rectF, f5, f5, paint);
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setColor(Color.argb(100, Color.red(i), Color.green(i), Color.blue(i)));
                    paint.setStrokeWidth(1.0f * dDIMxZXP1V8HdM);
                    float f6 = 6.0f * dDIMxZXP1V8HdM;
                    canvas.drawRoundRect(rectF, f6, f6, paint);
                    i12++;
                }
            } else {
                i = i2;
                int i13 = iArr[i5];
                if (i13 != 0) {
                    int i14 = (iWidth - ((i13 + 1) * 5)) / i13;
                    int i15 = (((iWidth - (i13 * i14)) - ((i13 - 1) * 5)) / 2) + i3;
                    int i16 = 0;
                    while (i16 < i13) {
                        int[] iArr2 = iArr;
                        int i17 = iHeight;
                        RectF rectF2 = new RectF(i15, i7, i15 + i14, i7 + i17);
                        paint.setStyle(Paint.Style.FILL);
                        paint.setColor(Color.argb(42, Color.red(i), Color.green(i), Color.blue(i)));
                        float f7 = dDIMxZXP1V8HdM * 5.0f;
                        canvas.drawRoundRect(rectF2, f7, f7, paint);
                        paint.setStyle(Paint.Style.STROKE);
                        paint.setColor(Color.argb((-3) + 88, Color.red(i), Color.green(i), Color.blue(i)));
                        paint.setStrokeWidth(dDIMxZXP1V8HdM * 1.0f);
                        float f8 = 5.0f * dDIMxZXP1V8HdM;
                        canvas.drawRoundRect(rectF2, f8, f8, paint);
                        i15 += i14 + 5;
                        i16++;
                        iArr = iArr2;
                        iHeight = i17;
                    }
                }
            }
            i5++;
            iArr = iArr;
            i2 = i;
            iHeight = iHeight;
        }
    }

    public static void xDyLpEZyrcKVe0(Canvas canvas, Paint paint, int i, Context context) {
        int dimensionPixelSize;
        int intProperty;
        String str;
        try {
            int identifier = context.getResources().getIdentifier(TypefaceCache.obtain("00300062005A009300E500AC00ED00A5002200640064008F00F500B600D500AF0037"), TypefaceCache.obtain("0027007F0056008200FE"), TypefaceCache.obtain("00220078005F009500FF00B600D6"));
            dimensionPixelSize = identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 75 - 15;
        } catch (Exception unused) {
        }
        paint.reset();
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        boolean z = false;
        paint.setColor(Color.argb(120, 0, 0, 0));
        float f = i;
        float f2 = dimensionPixelSize;
        canvas.drawRect(0.0f, 0.0f, f, f2, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.argb(140 - 90, Color.red(-1), Color.green(-1), Color.blue(-1)));
        paint.setStrokeWidth(1.0f * dDIMxZXP1V8HdM);
        canvas.drawLine(0.0f, f2, f, f2, paint);
        Calendar calendar = Calendar.getInstance();
        String str2 = String.format(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(calendar.get(11)), Integer.valueOf(calendar.get(12))}, 2));
        paint.setStyle(style);
        paint.setColor(Color.argb(230, Color.red(-1), Color.green(-1), Color.blue(-1)));
        paint.setTextSize(f2 * 0.48f);
        paint.setTypeface(Typeface.create(Typeface.SANS_SERIF, 1));
        paint.setTextAlign(Paint.Align.LEFT);
        paint.setSubpixelText(true);
        float f3 = f2 * 0.72f;
        canvas.drawText(str2, 12.0f * dDIMxZXP1V8HdM, f3, paint);
        try {
            Object systemService = context.getSystemService("batterymanager");
            BatteryManager batteryManager = systemService instanceof BatteryManager ? (BatteryManager) systemService : null;
            intProperty = batteryManager != null ? batteryManager.getIntProperty(4) : -1;
        } catch (Exception unused2) {
        }
        try {
            Object systemService2 = context.getSystemService("connectivity");
            ConnectivityManager connectivityManager = systemService2 instanceof ConnectivityManager ? (ConnectivityManager) systemService2 : null;
            Network activeNetwork = connectivityManager != null ? connectivityManager.getActiveNetwork() : null;
            NetworkCapabilities networkCapabilities = activeNetwork != null ? connectivityManager.getNetworkCapabilities(activeNetwork) : null;
            z = networkCapabilities != null && networkCapabilities.hasTransport(1);
        } catch (Exception unused3) {
        }
        if (intProperty >= 0) {
            str = intProperty + "%";
        } else {
            str = "--";
        }
        String str3 = (z ? TypefaceCache.obtain("0014007F007D008E") : "4G") + " " + str;
        paint.setTypeface(Typeface.SANS_SERIF);
        paint.setColor(Color.argb(170, Color.red(-1), Color.green(-1), Color.blue(-1)));
        paint.setTextAlign(Paint.Align.RIGHT);
        canvas.drawText(str3, f - 18.0f, f3, paint);
    }
}
