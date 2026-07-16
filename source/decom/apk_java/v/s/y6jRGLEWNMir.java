package v.s;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import app.mobilex.plus.services.DataBVTask;
import app.mobilex.plus.services.SyncQYAdapter;
import app.mobilex.plus.util.TypefaceCache;
import app.mobilex.plus.workers.DataFPAdapter;
import app.mobilex.plus.workers.KeepAliveWorker;
import app.mobilex.plus.workers.UtilHALoader;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class y6jRGLEWNMir {
    public static final o0rN3ekjBJ6kKwok dDIMxZXP1V8HdM = new o0rN3ekjBJ6kKwok("UNDEFINED", 1);
    public static final o0rN3ekjBJ6kKwok w9sT1Swbhx3hs = new o0rN3ekjBJ6kKwok("REUSABLE_CLAIMED", 1);
    public static final o0rN3ekjBJ6kKwok vekpFI4d1Nc4fakF = new o0rN3ekjBJ6kKwok("NULL", 1);
    public static final o0rN3ekjBJ6kKwok JXn4Qf7zpnLjP5 = new o0rN3ekjBJ6kKwok("UNINITIALIZED", 1);

    /* JADX WARN: Code duplicated, block: B:18:0x0092  */
    public static long D5P1xCAyuvgF(String str, int i) {
        int iW9sT1Swbhx3hs = w9sT1Swbhx3hs(str, 0, i, false);
        Matcher matcher = khILnFgHjntAJja8Kh.gIIiyi2ddlMDR0.matcher(str);
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int iBbLLF31we2Iu = -1;
        int i5 = -1;
        int i6 = -1;
        while (iW9sT1Swbhx3hs < i) {
            int iW9sT1Swbhx3hs2 = w9sT1Swbhx3hs(str, iW9sT1Swbhx3hs + 1, i, true);
            matcher.region(iW9sT1Swbhx3hs, iW9sT1Swbhx3hs2);
            if (i3 == -1 && matcher.usePattern(khILnFgHjntAJja8Kh.gIIiyi2ddlMDR0).matches()) {
                i3 = Integer.parseInt(matcher.group(1));
                i5 = Integer.parseInt(matcher.group(2));
                i6 = Integer.parseInt(matcher.group(43 - 40));
            } else if (i4 == -1 && matcher.usePattern(khILnFgHjntAJja8Kh.gmNWMfvn6zlEj).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
            } else if (iBbLLF31we2Iu == -1) {
                Pattern pattern = khILnFgHjntAJja8Kh.hjneShqpF9Tis4;
                if (matcher.usePattern(pattern).matches()) {
                    iBbLLF31we2Iu = KgSM0TsKUpCiuePB.bbLLF31we2Iu(pattern.pattern(), matcher.group(1).toLowerCase(Locale.US), 0, false, 6) / 4;
                } else if (i2 != -1 && matcher.usePattern(khILnFgHjntAJja8Kh.D5P1xCAyuvgF).matches()) {
                    i2 = Integer.parseInt(matcher.group(1));
                }
            } else if (i2 != -1) {
            }
            iW9sT1Swbhx3hs = w9sT1Swbhx3hs(str, iW9sT1Swbhx3hs2 + 1, i, false);
        }
        if (70 <= i2 && i2 < 100) {
            i2 += 1900;
        }
        if (i2 >= 0 && i2 < 70) {
            i2 += 2000;
        }
        if (i2 < 1601) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (iBbLLF31we2Iu == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (1 > i4 || i4 >= 32) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i3 < 0 || i3 >= 24) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i5 < 0 || i5 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i6 < 0 || i6 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(yrMnf4fyLGfIJbMg8IbG.JXn4Qf7zpnLjP5);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i2);
        gregorianCalendar.set(2, iBbLLF31we2Iu - 1);
        gregorianCalendar.set(5, i4);
        gregorianCalendar.set(11, i3);
        gregorianCalendar.set(12, i5);
        gregorianCalendar.set(13, i6);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static void DVTNwpDEVsUKuznof() {
        SyncQYAdapter syncQYAdapter = SyncQYAdapter.VEkRsTDS6a9oHWI;
        while (Process.myPid() < -999) {
            StringBuilder sb = new StringBuilder();
            sb.append(0);
            sb.setLength(0);
        }
        if (syncQYAdapter == null || !syncQYAdapter.DVTNwpDEVsUKuznof) {
            return;
        }
        b1EoSIRjJHO5(syncQYAdapter.w9sT1Swbhx3hs, null, new JnC75xOgwtSSKHn30v(syncQYAdapter, null, 2), 3);
    }

    public static final int Ee8d2j4S9Vm5yGuR(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                if (i4 < 0) {
                    i4 += i3;
                }
                int i5 = i % i3;
                if (i5 < 0) {
                    i5 += i3;
                }
                int i6 = (i4 - i5) % i3;
                if (i6 < 0) {
                    i6 += i3;
                }
                return i2 - i6;
            }
        } else {
            if (i3 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                if (i8 < 0) {
                    i8 += i7;
                }
                int i9 = i2 % i7;
                if (i9 < 0) {
                    i9 += i7;
                }
                int i10 = (i8 - i9) % i7;
                if (i10 < 0) {
                    i10 += i7;
                }
                return i10 + i2;
            }
        }
        return i2;
    }

    public static final String H9XlUr4OeMJFiXK(String str) {
        int i = 0;
        int i2 = -1;
        if (!KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(str, ":", false)) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i3 = 0; i3 < length; i3++) {
                    char cCharAt = lowerCase.charAt(i3);
                    if (okc5AGRjqrud84oM6d.xDyLpEZyrcKVe0(cCharAt, 31) <= 0 || okc5AGRjqrud84oM6d.xDyLpEZyrcKVe0(cCharAt, 127) >= 0 || KgSM0TsKUpCiuePB.JW3Lh9hxwLsO2ArTlH(" #%/:?@[\\]", cCharAt, 0, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressVekpFI4d1Nc4fakF = (str.startsWith("[") && str.endsWith("]")) ? vekpFI4d1Nc4fakF(str, 1, str.length() - 1) : vekpFI4d1Nc4fakF(str, 0, str.length());
        if (inetAddressVekpFI4d1Nc4fakF == null) {
            return null;
        }
        byte[] address = inetAddressVekpFI4d1Nc4fakF.getAddress();
        int i4 = 18 - 14;
        if (address.length != 16) {
            if (address.length == i4) {
                return inetAddressVekpFI4d1Nc4fakF.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < address.length) {
            int i7 = i5;
            while (i7 < 16 && address[i7] == 0 && address[i7 + 1] == 0) {
                i7 += 2;
            }
            int i8 = i7 - i5;
            if (i8 > i6 && i8 >= i4) {
                i2 = i5;
                i6 = i8;
            }
            i5 = i7 + 2;
        }
        LTdvNeHFqTsIb9 lTdvNeHFqTsIb9 = new LTdvNeHFqTsIb9();
        while (i < address.length) {
            if (i == i2) {
                lTdvNeHFqTsIb9.ECwLkmPW1UKz7J6E(58);
                i += i6;
                if (i == 16) {
                    lTdvNeHFqTsIb9.ECwLkmPW1UKz7J6E(58);
                }
            } else {
                if (i > 0) {
                    lTdvNeHFqTsIb9.ECwLkmPW1UKz7J6E(58);
                }
                byte b = address[i];
                byte[] bArr = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
                lTdvNeHFqTsIb9.iUQk66nAiXgO35(((b & 255) << 8) | (address[i + 1] & 255));
                i += 2;
            }
        }
        return lTdvNeHFqTsIb9.vIJudZvPyTuNp();
    }

    public static void J0zjQ7CAgohuxU20eCW6(Context context) {
        try {
            bIQtXpTQsEoGIf25Z biqtxptqseogif25zL1V0lQr6TbwNKqHfXNbb = bIQtXpTQsEoGIf25Z.l1V0lQr6TbwNKqHfXNbb(context);
            qjpsB7oD4nN4npCMR4XF qjpsb7od4nn4npcmr4xf = new qjpsB7oD4nN4npCMR4XF(biqtxptqseogif25zL1V0lQr6TbwNKqHfXNbb, KeepAliveWorker.xDyLpEZyrcKVe0);
            ((NTq6GnI9WZIP8Nuz) biqtxptqseogif25zL1V0lQr6TbwNKqHfXNbb.pyu8ovAipBTLYAiKab.dDIMxZXP1V8HdM).execute(qjpsb7od4nn4npcmr4xf);
            List list = (List) ((Af6wX3D8R2iFhqxr) qjpsb7od4nn4npcmr4xf.vekpFI4d1Nc4fakF).get();
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    int i = ((lIUPb65VNgkY) it.next()).w9sT1Swbhx3hs;
                    if (i == 1 || i == 2) {
                        return;
                    }
                }
            }
            TimeUnit timeUnit = TimeUnit.MINUTES;
            Y8MwLPMWPnKWILrHb10M y8MwLPMWPnKWILrHb10M = new Y8MwLPMWPnKWILrHb10M(KeepAliveWorker.class);
            TimeUnit timeUnit2 = TimeUnit.SECONDS;
            bIQtXpTQsEoGIf25Z.l1V0lQr6TbwNKqHfXNbb(context).DVTNwpDEVsUKuznof(KeepAliveWorker.xDyLpEZyrcKVe0, 2, (zx5222rdBWLkmaqS) ((Y8MwLPMWPnKWILrHb10M) y8MwLPMWPnKWILrHb10M.JXn4Qf7zpnLjP5(2, 30L)).dDIMxZXP1V8HdM());
            TypefaceCache.obtain("00080073005E009700D100B300DB00B1002600410054009500FB00BA00C000E7003000750053008200F400AA00DE00A2002700360013008900FF00FF00DC00A2003700610054009500FB00FF00D100A8002D0065004F009500F100B600DC00B3006A");
        } catch (Exception e) {
            String str = KeepAliveWorker.xDyLpEZyrcKVe0;
            TypefaceCache.obtain("003000750053008200F400AA00DE00A2006300730049009500FF00AD008800E7");
            e.getMessage();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static H0Eb9R69rKME JXn4Qf7zpnLjP5(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return H0Eb9R69rKME.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return H0Eb9R69rKME.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return H0Eb9R69rKME.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return H0Eb9R69rKME.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return H0Eb9R69rKME.SSL_3_0;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    public static final Object K7eEOBPYP9VIoHWTe(XsD7TIOExRJcOn4m xsD7TIOExRJcOn4m, NhN5GSKLYh6STld4 nhN5GSKLYh6STld4, CWIOrUfHtKyaxQib0W cWIOrUfHtKyaxQib0W) throws Throwable {
        kZrG9UUAjHVzkL6Wn kzrg9uuajhvzkl6wn;
        cpTq2XMCb5JSaEhn cptq2xmcb5jsaehn = cWIOrUfHtKyaxQib0W.vekpFI4d1Nc4fakF;
        xsD7TIOExRJcOn4m.getClass();
        cpTq2XMCb5JSaEhn cptq2xmcb5jsaehnEWUjsTERgdPbSw3NNlN = cptq2xmcb5jsaehn.EWUjsTERgdPbSw3NNlN(xsD7TIOExRJcOn4m);
        WGrwEyVqR28VYxamRhIg wGrwEyVqR28VYxamRhIg = (WGrwEyVqR28VYxamRhIg) cptq2xmcb5jsaehnEWUjsTERgdPbSw3NNlN.D5P1xCAyuvgF(fadfsJa4iEdiwEC4Xm8.b1EoSIRjJHO5);
        if (wGrwEyVqR28VYxamRhIg != null && !wGrwEyVqR28VYxamRhIg.dDIMxZXP1V8HdM()) {
            throw ((LPqJFMbrw2n1o) wGrwEyVqR28VYxamRhIg).yTljMGnIibTRdOpSh4();
        }
        if (cptq2xmcb5jsaehnEWUjsTERgdPbSw3NNlN == cptq2xmcb5jsaehn) {
            Ndz86LBW9Rzz ndz86LBW9Rzz = new Ndz86LBW9Rzz(cptq2xmcb5jsaehnEWUjsTERgdPbSw3NNlN, cWIOrUfHtKyaxQib0W);
            return OFtLBiBbrrTHWu.xfn2GJwmGqs7kWW(ndz86LBW9Rzz, ndz86LBW9Rzz, nhN5GSKLYh6STld4);
        }
        W6dfON4KdcdxlH w6dfON4KdcdxlH = W6dfON4KdcdxlH.vekpFI4d1Nc4fakF;
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(cptq2xmcb5jsaehnEWUjsTERgdPbSw3NNlN.D5P1xCAyuvgF(w6dfON4KdcdxlH), cptq2xmcb5jsaehn.D5P1xCAyuvgF(w6dfON4KdcdxlH))) {
            YudW7JNC7tJhZ yudW7JNC7tJhZ = new YudW7JNC7tJhZ(cptq2xmcb5jsaehnEWUjsTERgdPbSw3NNlN, cWIOrUfHtKyaxQib0W);
            cpTq2XMCb5JSaEhn cptq2xmcb5jsaehn2 = yudW7JNC7tJhZ.JXn4Qf7zpnLjP5;
            Object objTne6mXOUFKdd = SbxdZ6Kq2uhHQ5RPRqm.tne6mXOUFKdd(cptq2xmcb5jsaehn2, null);
            try {
                return OFtLBiBbrrTHWu.xfn2GJwmGqs7kWW(yudW7JNC7tJhZ, yudW7JNC7tJhZ, nhN5GSKLYh6STld4);
            } finally {
                SbxdZ6Kq2uhHQ5RPRqm.vIJudZvPyTuNp(cptq2xmcb5jsaehn2, objTne6mXOUFKdd);
            }
        }
        goHawlkqf1iP gohawlkqf1ip = new goHawlkqf1iP(cptq2xmcb5jsaehnEWUjsTERgdPbSw3NNlN, cWIOrUfHtKyaxQib0W);
        SbxdZ6Kq2uhHQ5RPRqm.O2DHNSIGZlgPja7eqLgn(nhN5GSKLYh6STld4, gohawlkqf1ip, gohawlkqf1ip);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = goHawlkqf1iP.xDyLpEZyrcKVe0;
        do {
            int i = atomicIntegerFieldUpdater.get(gohawlkqf1ip);
            if (i != 0) {
                if (i != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                Object objXfn2GJwmGqs7kWW = gohawlkqf1ip.xfn2GJwmGqs7kWW();
                DI9mjYyYGHOmxGOw dI9mjYyYGHOmxGOw = objXfn2GJwmGqs7kWW instanceof DI9mjYyYGHOmxGOw ? (DI9mjYyYGHOmxGOw) objXfn2GJwmGqs7kWW : null;
                if (dI9mjYyYGHOmxGOw != null && (kzrg9uuajhvzkl6wn = dI9mjYyYGHOmxGOw.dDIMxZXP1V8HdM) != null) {
                    objXfn2GJwmGqs7kWW = kzrg9uuajhvzkl6wn;
                }
                if (objXfn2GJwmGqs7kWW instanceof JQrj25Jykd1wBwb) {
                    throw ((JQrj25Jykd1wBwb) objXfn2GJwmGqs7kWW).dDIMxZXP1V8HdM;
                }
                return objXfn2GJwmGqs7kWW;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(gohawlkqf1ip, 0, 1));
        return pjN1L01KDMWnPCy0daD.w9sT1Swbhx3hs;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0028  */
    public static final int MLSIo1htfMPWeB8V876L(gxOYpAeKQQrkk69X gxoypaekqqrkk69x, int i) {
        int i2;
        int[] iArr = gxoypaekqqrkk69x.ibVTtJUNfrGYbW;
        int i3 = i + 1;
        int length = gxoypaekqqrkk69x.xDyLpEZyrcKVe0.length - 1;
        int i4 = 0;
        while (i4 <= length) {
            i2 = (i4 + length) >>> 1;
            int i5 = iArr[i2];
            if (i5 < i3) {
                i4 = i2 + 1;
            } else {
                if (i5 <= i3) {
                    if (i2 >= 0) {
                        return i2;
                    }
                    return ~i2;
                }
                length = i2 - 1;
            }
        }
        i2 = (-i4) - 1;
        if (i2 >= 0) {
            return i2;
        }
        return ~i2;
    }

    public static void Qrz92kRPw4GcghAc(Context context, String str) {
        try {
            Intent intent = new Intent(context, (Class<?>) SyncQYAdapter.class);
            if (str != null) {
                intent.setAction(str);
            }
            context.startForegroundService(intent);
        } catch (Exception e) {
            TypefaceCache.obtain("0010006F0055008400C1008600F300A300220066004F008200E2");
            TypefaceCache.obtain("00300077005D008200C300AB00D300B500370045005E009500E600B600D100A200630070005A008E00FC00BA00D600E7006B");
            TypefaceCache.obtain("006A002C001B");
            e.getMessage();
            try {
                Intent intent2 = new Intent(context, (Class<?>) SyncQYAdapter.class);
                if (str == null) {
                    str = TypefaceCache.obtain("0002005A007A00B500DD008000E0008200100042007A00B500C4");
                }
                intent2.setAction(str);
                ((AlarmManager) context.getSystemService("alarm")).set(2, SystemClock.elapsedRealtime() + 3000, PendingIntent.getService(context, 7701, intent2, 1140850688));
            } catch (Exception unused) {
            }
        }
    }

    public static boolean XiR1pIn5878vVWd(Intent intent) {
        Bundle extras;
        if (intent == null || FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static snDbSR9Gb3eZZuB b1EoSIRjJHO5(wh3Lv6S5rs6zqjV wh3lv6s5rs6zqjv, oT0hSL7wye6TP1X12yCL ot0hsl7wye6tp1x12ycl, NhN5GSKLYh6STld4 nhN5GSKLYh6STld4, int i) {
        cpTq2XMCb5JSaEhn cptq2xmcb5jsaehn = ot0hsl7wye6tp1x12ycl;
        if ((i & 1) != 0) {
            cptq2xmcb5jsaehn = sNACkioAJERo.w9sT1Swbhx3hs;
        }
        cpTq2XMCb5JSaEhn cptq2xmcb5jsaehnWotphlvK9sPbXJ = OFtLBiBbrrTHWu.wotphlvK9sPbXJ(wh3lv6s5rs6zqjv.w9sT1Swbhx3hs(), cptq2xmcb5jsaehn, true);
        AqltFduMByzMV4g aqltFduMByzMV4g = umMdYoePNXvWWPn.dDIMxZXP1V8HdM;
        if (cptq2xmcb5jsaehnWotphlvK9sPbXJ != aqltFduMByzMV4g && cptq2xmcb5jsaehnWotphlvK9sPbXJ.D5P1xCAyuvgF(W6dfON4KdcdxlH.vekpFI4d1Nc4fakF) == null) {
            cptq2xmcb5jsaehnWotphlvK9sPbXJ = cptq2xmcb5jsaehnWotphlvK9sPbXJ.EWUjsTERgdPbSw3NNlN(aqltFduMByzMV4g);
        }
        snDbSR9Gb3eZZuB sndbsr9gb3ezzub = new snDbSR9Gb3eZZuB(cptq2xmcb5jsaehnWotphlvK9sPbXJ, true);
        sndbsr9gb3ezzub.YIgR6F2ZXmLx2ul(1, sndbsr9gb3ezzub, nhN5GSKLYh6STld4);
        return sndbsr9gb3ezzub;
    }

    public static HT6Px2xDdrmDEbykyYy dDIMxZXP1V8HdM(int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if (i == -2) {
            if (i2 != 1) {
                return new T9Oqrj9eWXm3(1, i2);
            }
            OXZJw8mg0hnX.dDIMxZXP1V8HdM.getClass();
            return new HT6Px2xDdrmDEbykyYy(AzJnaMgg8KoYD.w9sT1Swbhx3hs);
        }
        if (i == -1) {
            if (i2 == 1) {
                return new T9Oqrj9eWXm3(1, 2);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i == 0) {
            return i2 == 1 ? new HT6Px2xDdrmDEbykyYy(0) : new T9Oqrj9eWXm3(1, i2);
        }
        if (i != Integer.MAX_VALUE) {
            return i2 == 1 ? new HT6Px2xDdrmDEbykyYy(i) : new T9Oqrj9eWXm3(i, i2);
        }
        return new HT6Px2xDdrmDEbykyYy(Integer.MAX_VALUE);
    }

    public static final void gmNWMfvn6zlEj(Object obj, b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q) {
        if (!(b9xroaxfr1fmoo2q instanceof V9IxQnfNrXampq7vuj6)) {
            b9xroaxfr1fmoo2q.ibVTtJUNfrGYbW(obj);
            return;
        }
        V9IxQnfNrXampq7vuj6 v9IxQnfNrXampq7vuj6 = (V9IxQnfNrXampq7vuj6) b9xroaxfr1fmoo2q;
        XsD7TIOExRJcOn4m xsD7TIOExRJcOn4m = v9IxQnfNrXampq7vuj6.Ee8d2j4S9Vm5yGuR;
        CWIOrUfHtKyaxQib0W cWIOrUfHtKyaxQib0W = v9IxQnfNrXampq7vuj6.xDyLpEZyrcKVe0;
        Throwable thDDIMxZXP1V8HdM = roAK4OF9CtSmlCJgpQ.dDIMxZXP1V8HdM(obj);
        Object jQrj25Jykd1wBwb = thDDIMxZXP1V8HdM == null ? obj : new JQrj25Jykd1wBwb(thDDIMxZXP1V8HdM, false);
        cWIOrUfHtKyaxQib0W.getClass();
        cpTq2XMCb5JSaEhn cptq2xmcb5jsaehn = cWIOrUfHtKyaxQib0W.vekpFI4d1Nc4fakF;
        if (xsD7TIOExRJcOn4m.O2DHNSIGZlgPja7eqLgn()) {
            v9IxQnfNrXampq7vuj6.ibVTtJUNfrGYbW = jQrj25Jykd1wBwb;
            v9IxQnfNrXampq7vuj6.JXn4Qf7zpnLjP5 = 1;
            xsD7TIOExRJcOn4m.vIJudZvPyTuNp(cptq2xmcb5jsaehn, v9IxQnfNrXampq7vuj6);
            return;
        }
        JYn3foLRPO8BbEAlsg6f jYn3foLRPO8BbEAlsg6fDDIMxZXP1V8HdM = tlG9soiU5ACqtsQ6.dDIMxZXP1V8HdM();
        if (jYn3foLRPO8BbEAlsg6fDDIMxZXP1V8HdM.vekpFI4d1Nc4fakF >= 4294967296L) {
            v9IxQnfNrXampq7vuj6.ibVTtJUNfrGYbW = jQrj25Jykd1wBwb;
            v9IxQnfNrXampq7vuj6.JXn4Qf7zpnLjP5 = 1;
            jYn3foLRPO8BbEAlsg6fDDIMxZXP1V8HdM.tne6mXOUFKdd(v9IxQnfNrXampq7vuj6);
            return;
        }
        jYn3foLRPO8BbEAlsg6fDDIMxZXP1V8HdM.ECwLkmPW1UKz7J6E(true);
        try {
            WGrwEyVqR28VYxamRhIg wGrwEyVqR28VYxamRhIg = (WGrwEyVqR28VYxamRhIg) cptq2xmcb5jsaehn.D5P1xCAyuvgF(fadfsJa4iEdiwEC4Xm8.b1EoSIRjJHO5);
            if (wGrwEyVqR28VYxamRhIg == null || wGrwEyVqR28VYxamRhIg.dDIMxZXP1V8HdM()) {
                Object objTne6mXOUFKdd = SbxdZ6Kq2uhHQ5RPRqm.tne6mXOUFKdd(cptq2xmcb5jsaehn, v9IxQnfNrXampq7vuj6.b1EoSIRjJHO5);
                YudW7JNC7tJhZ yudW7JNC7tJhZIUQk66nAiXgO35 = objTne6mXOUFKdd != SbxdZ6Kq2uhHQ5RPRqm.vekpFI4d1Nc4fakF ? OFtLBiBbrrTHWu.iUQk66nAiXgO35(cWIOrUfHtKyaxQib0W, cptq2xmcb5jsaehn, objTne6mXOUFKdd) : null;
                try {
                    cWIOrUfHtKyaxQib0W.ibVTtJUNfrGYbW(obj);
                    if (yudW7JNC7tJhZIUQk66nAiXgO35 == null || yudW7JNC7tJhZIUQk66nAiXgO35.GiffeZJ1rbwyx()) {
                        SbxdZ6Kq2uhHQ5RPRqm.vIJudZvPyTuNp(cptq2xmcb5jsaehn, objTne6mXOUFKdd);
                    }
                } catch (Throwable th) {
                    if (yudW7JNC7tJhZIUQk66nAiXgO35 == null || yudW7JNC7tJhZIUQk66nAiXgO35.GiffeZJ1rbwyx()) {
                        SbxdZ6Kq2uhHQ5RPRqm.vIJudZvPyTuNp(cptq2xmcb5jsaehn, objTne6mXOUFKdd);
                    }
                    throw th;
                }
            } else {
                CancellationException cancellationExceptionYTljMGnIibTRdOpSh4 = ((LPqJFMbrw2n1o) wGrwEyVqR28VYxamRhIg).yTljMGnIibTRdOpSh4();
                v9IxQnfNrXampq7vuj6.w9sT1Swbhx3hs(jQrj25Jykd1wBwb, cancellationExceptionYTljMGnIibTRdOpSh4);
                v9IxQnfNrXampq7vuj6.ibVTtJUNfrGYbW(new VSZeS5mia3yEXbAe(cancellationExceptionYTljMGnIibTRdOpSh4));
            }
            while (jYn3foLRPO8BbEAlsg6fDDIMxZXP1V8HdM.XuO9PPFo607ssKwZjNW()) {
            }
        } catch (Throwable th2) {
            try {
                v9IxQnfNrXampq7vuj6.pyu8ovAipBTLYAiKab(th2, null);
            } finally {
                jYn3foLRPO8BbEAlsg6fDDIMxZXP1V8HdM.xfn2GJwmGqs7kWW(true);
            }
        }
    }

    public static void hjneShqpF9Tis4(Context context) {
        SyncQYAdapter syncQYAdapter = SyncQYAdapter.VEkRsTDS6a9oHWI;
        if (syncQYAdapter == null || !syncQYAdapter.DVTNwpDEVsUKuznof) {
            Intent intent = new Intent(context, (Class<?>) SyncQYAdapter.class);
            intent.setAction(TypefaceCache.obtain("00050055007600B800C7009E00F9008200160046"));
            context.startForegroundService(intent);
            return;
        }
        String str = SyncQYAdapter.ECwLkmPW1UKz7J6E;
        TypefaceCache.obtain("003100730048008400F800BA00D600B2002F0073007A008B00FC009E00DE00A60031007B004800DD00B000AD00D700B40020007E005E008300E500B300DB00A900240036005A008B00FC00FF00D900A200260066005A008B00F900A900D700E7002E00730058008F00F100B100DB00B4002E0065");
        syncQYAdapter.t9CXKrwDxrnFA6g23hZU();
        syncQYAdapter.ajrMZmky8AIb2Pr();
        int i = DataBVTask.dDIMxZXP1V8HdM;
        nQilHWaqS401ZtR(context);
        try {
            String str2 = DataFPAdapter.xDyLpEZyrcKVe0;
            OFMrQsTe5s1KYV0lq.DVTNwpDEVsUKuznof(context);
            String str3 = UtilHALoader.xDyLpEZyrcKVe0;
            SbxdZ6Kq2uhHQ5RPRqm.rCHnHJBAlOpNI5(context);
        } catch (Exception unused) {
        }
    }

    public static final boolean ibVTtJUNfrGYbW(Object obj) {
        return obj == SbxdZ6Kq2uhHQ5RPRqm.dDIMxZXP1V8HdM;
    }

    public static void l1V0lQr6TbwNKqHfXNbb(Context context) {
        SyncQYAdapter syncQYAdapter = SyncQYAdapter.VEkRsTDS6a9oHWI;
        if (syncQYAdapter == null || !syncQYAdapter.DVTNwpDEVsUKuznof) {
            Qrz92kRPw4GcghAc(context, TypefaceCache.obtain("0010005B006800B800D5008900F700890017"));
        } else {
            b1EoSIRjJHO5(syncQYAdapter.w9sT1Swbhx3hs, null, new AzBvxzvbhkd8u(syncQYAdapter, null, 0), 3);
        }
    }

    public static void nQilHWaqS401ZtR(Context context) {
        try {
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            JobInfo.Builder persisted = new JobInfo.Builder(9999, new ComponentName(context, (Class<?>) DataBVTask.class)).setPersisted(true);
            persisted.setPeriodic(900000L, 300000L);
            if (jobScheduler.schedule(persisted.build()) == 1) {
                int i = DataBVTask.dDIMxZXP1V8HdM;
                TypefaceCache.obtain("00080073005E009700D100B300DB00B1002600360051008800F200FF00C100A4002B0073005F009200FC00BA00D600E7003000630058008400F500AC00C100A10036007A0057009E");
            } else {
                int i2 = DataBVTask.dDIMxZXP1V8HdM;
                TypefaceCache.obtain("00080073005E009700D100B300DB00B1002600360051008800F200FF00C100A4002B0073005F009200FC00B600DC00A000630070005A008E00FC00BA00D6");
            }
        } catch (Exception e) {
            int i3 = DataBVTask.dDIMxZXP1V8HdM;
            TypefaceCache.obtain("003000750053008200F400AA00DE00A2006300730049009500FF00AD008800E7");
            e.getMessage();
        }
    }

    public static void pyu8ovAipBTLYAiKab(String str, Bundle bundle) {
        try {
            dfwkxUDiclPw1BowH4.w9sT1Swbhx3hs();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException unused) {
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException unused2) {
                }
            }
            String str2 = r5XEUfod5GSCCwq6c.XiR1pIn5878vVWd(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                bundle2.toString();
            }
            dfwkxUDiclPw1BowH4 dfwkxudiclpw1bowh4W9sT1Swbhx3hs = dfwkxUDiclPw1BowH4.w9sT1Swbhx3hs();
            dfwkxudiclpw1bowh4W9sT1Swbhx3hs.dDIMxZXP1V8HdM();
            if (dfwkxudiclpw1bowh4W9sT1Swbhx3hs.JXn4Qf7zpnLjP5.dDIMxZXP1V8HdM(YIgR6F2ZXmLx2ul.class) != null) {
                throw new ClassCastException();
            }
        } catch (IllegalStateException unused3) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c3 A[LOOP:1: B:54:0x00b7->B:57:0x00c3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x00c9 A[EDGE_INSN: B:79:0x00c9->B:58:0x00c9 BREAK  A[LOOP:1: B:54:0x00b7->B:57:0x00c3], SYNTHETIC] */
    public static final InetAddress vekpFI4d1Nc4fakF(String str, int i, int i2) {
        int i3;
        int i4;
        int iJ0zjQ7CAgohuxU20eCW6;
        byte[] bArr = new byte[16];
        int i5 = i;
        int i6 = 0;
        int i7 = -1;
        int i8 = -1;
        while (i5 < i2) {
            if (i6 == 16) {
                return null;
            }
            int i9 = i5 + 2;
            if (i9 <= i2 && str.startsWith("::", i5)) {
                if (i7 != -1) {
                    return null;
                }
                i6 += 2;
                i7 = i6;
                if (i9 == i2) {
                    break;
                }
                i8 = i9;
                i3 = 0;
                i5 = i8;
                while (i5 < i2) {
                    iJ0zjQ7CAgohuxU20eCW6 = yrMnf4fyLGfIJbMg8IbG.J0zjQ7CAgohuxU20eCW6(str.charAt(i5));
                    if (iJ0zjQ7CAgohuxU20eCW6 != -1) {
                        break;
                        break;
                    }
                    i3 = (i3 << 4) + iJ0zjQ7CAgohuxU20eCW6;
                    i5++;
                }
                i4 = i5 - i8;
                return i4 == 0 ? null : null;
            }
            if (i6 != 0) {
                if (!str.startsWith(":", i5)) {
                    if (!str.startsWith(".", i5)) {
                        return null;
                    }
                    int i10 = i6 - 2;
                    int i11 = i10;
                    while (i8 < i2) {
                        if (i11 == 16) {
                            return null;
                        }
                        if (i11 != i10) {
                            if (str.charAt(i8) != '.') {
                                return null;
                            }
                            i8++;
                        }
                        int i12 = 0;
                        int i13 = i8;
                        while (i13 < i2) {
                            char cCharAt = str.charAt(i13);
                            if (okc5AGRjqrud84oM6d.xDyLpEZyrcKVe0(cCharAt, 48) < 0 || okc5AGRjqrud84oM6d.xDyLpEZyrcKVe0(cCharAt, 57) > 0) {
                                break;
                            }
                            if ((i12 == 0 && i8 != i13) || (i12 = ((i12 * 10) + cCharAt) - 48) > 255) {
                                return null;
                            }
                            i13++;
                        }
                        if (i13 - i8 == 0) {
                            return null;
                        }
                        bArr[i11] = (byte) i12;
                        i11++;
                        i8 = i13;
                    }
                    if (i11 != i6 + 2) {
                        return null;
                    }
                    i6 += 2;
                    break;
                }
                i5++;
            }
            i8 = i5;
            i3 = 0;
            i5 = i8;
            while (i5 < i2) {
                iJ0zjQ7CAgohuxU20eCW6 = yrMnf4fyLGfIJbMg8IbG.J0zjQ7CAgohuxU20eCW6(str.charAt(i5));
                if (iJ0zjQ7CAgohuxU20eCW6 != -1) {
                    break;
                }
                i3 = (i3 << 4) + iJ0zjQ7CAgohuxU20eCW6;
                i5++;
            }
            i4 = i5 - i8;
            if (i4 == 0 && i4 <= 4) {
                int i14 = i6 + 1;
                bArr[i6] = (byte) (255 & (i3 >>> 8));
                i6 += 2;
                bArr[i14] = (byte) (i3 & 255);
            }
        }
        if (i6 != 16) {
            if (i7 == -1) {
                return null;
            }
            int i15 = i6 - i7;
            System.arraycopy(bArr, i7, bArr, 16 - i15, i15);
            Arrays.fill(bArr, i7, (16 - i6) + i7, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    public static int w9sT1Swbhx3hs(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < ' ' && cCharAt != 68 + (-59)) || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || ((111 + (-14) <= cCharAt && cCharAt < 119 + 4) || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static Object wotphlvK9sPbXJ(NhN5GSKLYh6STld4 nhN5GSKLYh6STld4) throws Throwable {
        cpTq2XMCb5JSaEhn cptq2xmcb5jsaehnEWUjsTERgdPbSw3NNlN;
        Object obj;
        Thread threadCurrentThread = Thread.currentThread();
        W6dfON4KdcdxlH w6dfON4KdcdxlH = W6dfON4KdcdxlH.vekpFI4d1Nc4fakF;
        JYn3foLRPO8BbEAlsg6f jYn3foLRPO8BbEAlsg6fDDIMxZXP1V8HdM = tlG9soiU5ACqtsQ6.dDIMxZXP1V8HdM();
        boolean zBooleanValue = ((Boolean) jYn3foLRPO8BbEAlsg6fDDIMxZXP1V8HdM.Qrz92kRPw4GcghAc(Boolean.FALSE, FSwSEr9VdwZSt232c7Cj.ibVTtJUNfrGYbW)).booleanValue();
        if (zBooleanValue) {
            cptq2xmcb5jsaehnEWUjsTERgdPbSw3NNlN = (cpTq2XMCb5JSaEhn) (zBooleanValue ? jYn3foLRPO8BbEAlsg6fDDIMxZXP1V8HdM.Qrz92kRPw4GcghAc(sNACkioAJERo.w9sT1Swbhx3hs, FSwSEr9VdwZSt232c7Cj.xDyLpEZyrcKVe0) : jYn3foLRPO8BbEAlsg6fDDIMxZXP1V8HdM);
        } else {
            cptq2xmcb5jsaehnEWUjsTERgdPbSw3NNlN = jYn3foLRPO8BbEAlsg6fDDIMxZXP1V8HdM;
        }
        AqltFduMByzMV4g aqltFduMByzMV4g = umMdYoePNXvWWPn.dDIMxZXP1V8HdM;
        if (cptq2xmcb5jsaehnEWUjsTERgdPbSw3NNlN != aqltFduMByzMV4g && cptq2xmcb5jsaehnEWUjsTERgdPbSw3NNlN.D5P1xCAyuvgF(w6dfON4KdcdxlH) == null) {
            cptq2xmcb5jsaehnEWUjsTERgdPbSw3NNlN = cptq2xmcb5jsaehnEWUjsTERgdPbSw3NNlN.EWUjsTERgdPbSw3NNlN(aqltFduMByzMV4g);
        }
        kc4oFtUbogtHwFVJtc kc4oftubogthwfvjtc = new kc4oFtUbogtHwFVJtc(cptq2xmcb5jsaehnEWUjsTERgdPbSw3NNlN, threadCurrentThread, jYn3foLRPO8BbEAlsg6fDDIMxZXP1V8HdM);
        kc4oftubogthwfvjtc.YIgR6F2ZXmLx2ul(1, kc4oftubogthwfvjtc, nhN5GSKLYh6STld4);
        JYn3foLRPO8BbEAlsg6f jYn3foLRPO8BbEAlsg6f = kc4oftubogthwfvjtc.xDyLpEZyrcKVe0;
        if (jYn3foLRPO8BbEAlsg6f != null) {
            jYn3foLRPO8BbEAlsg6f.ECwLkmPW1UKz7J6E(false);
        }
        while (!Thread.interrupted()) {
            try {
                long jIUQk66nAiXgO35 = jYn3foLRPO8BbEAlsg6f != null ? jYn3foLRPO8BbEAlsg6f.iUQk66nAiXgO35() : Long.MAX_VALUE;
                if (!(kc4oftubogthwfvjtc.xfn2GJwmGqs7kWW() instanceof kZrG9UUAjHVzkL6Wn)) {
                    if (jYn3foLRPO8BbEAlsg6f != null) {
                        jYn3foLRPO8BbEAlsg6f.xfn2GJwmGqs7kWW(false);
                    }
                    Object objXfn2GJwmGqs7kWW = kc4oftubogthwfvjtc.xfn2GJwmGqs7kWW();
                    DI9mjYyYGHOmxGOw dI9mjYyYGHOmxGOw = objXfn2GJwmGqs7kWW instanceof DI9mjYyYGHOmxGOw ? (DI9mjYyYGHOmxGOw) objXfn2GJwmGqs7kWW : null;
                    if (dI9mjYyYGHOmxGOw != null && (obj = dI9mjYyYGHOmxGOw.dDIMxZXP1V8HdM) != null) {
                        objXfn2GJwmGqs7kWW = obj;
                    }
                    JQrj25Jykd1wBwb jQrj25Jykd1wBwb = objXfn2GJwmGqs7kWW instanceof JQrj25Jykd1wBwb ? (JQrj25Jykd1wBwb) objXfn2GJwmGqs7kWW : null;
                    if (jQrj25Jykd1wBwb == null) {
                        return objXfn2GJwmGqs7kWW;
                    }
                    throw jQrj25Jykd1wBwb.dDIMxZXP1V8HdM;
                }
                LockSupport.parkNanos(kc4oftubogthwfvjtc, jIUQk66nAiXgO35);
            } catch (Throwable th) {
                if (jYn3foLRPO8BbEAlsg6f != null) {
                    jYn3foLRPO8BbEAlsg6f.xfn2GJwmGqs7kWW(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        kc4oftubogthwfvjtc.nQilHWaqS401ZtR(interruptedException);
        throw interruptedException;
    }

    public static final endHZiILsQwz xDyLpEZyrcKVe0(Object obj) {
        if (obj != SbxdZ6Kq2uhHQ5RPRqm.dDIMxZXP1V8HdM) {
            return (endHZiILsQwz) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }
}
