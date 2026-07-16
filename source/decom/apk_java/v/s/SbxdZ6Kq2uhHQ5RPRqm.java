package v.s;

import android.app.ActivityManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.database.Cursor;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import app.mobilex.plus.services.ManagerUMController;
import app.mobilex.plus.util.TypefaceCache;
import app.mobilex.plus.workers.UtilHALoader;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class SbxdZ6Kq2uhHQ5RPRqm {
    public static final o0rN3ekjBJ6kKwok dDIMxZXP1V8HdM = new o0rN3ekjBJ6kKwok("CLOSED", 1);
    public static final o0rN3ekjBJ6kKwok w9sT1Swbhx3hs = new o0rN3ekjBJ6kKwok("CONDITION_FALSE", 1);
    public static final o0rN3ekjBJ6kKwok vekpFI4d1Nc4fakF = new o0rN3ekjBJ6kKwok("NO_THREAD_ELEMENTS", 1);

    public static byte[] D5P1xCAyuvgF(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    public static void ECwLkmPW1UKz7J6E(ByteArrayOutputStream byteArrayOutputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static byte[] EWUjsTERgdPbSw3NNlN(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = fileInputStream.read(bArr2);
                if (i4 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e) {
                    throw new IllegalStateException(e.getMessage());
                }
            }
            if (i3 == i) {
                if (!inflater.finished()) {
                    throw new IllegalStateException("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    public static void Ee8d2j4S9Vm5yGuR(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    public static Intent H9XlUr4OeMJFiXK(Context context, int i, Intent intent, int i2) {
        Intent intent2 = new Intent(context, (Class<?>) ManagerUMController.class);
        intent2.putExtra(ManagerUMController.yTljMGnIibTRdOpSh4, ManagerUMController.vIJudZvPyTuNp);
        intent2.putExtra(ManagerUMController.K7eEOBPYP9VIoHWTe, i);
        intent2.putExtra(ManagerUMController.dTS0S7eC32ubQH54j36, intent);
        intent2.putExtra(ManagerUMController.EWUjsTERgdPbSw3NNlN, i2);
        return intent2;
    }

    public static final int J0zjQ7CAgohuxU20eCW6(Cursor cursor, String str) {
        String strVEkRsTDS6a9oHWI;
        int iNQilHWaqS401ZtR = nQilHWaqS401ZtR(cursor, str);
        if (iNQilHWaqS401ZtR >= 0) {
            return iNQilHWaqS401ZtR;
        }
        try {
            strVEkRsTDS6a9oHWI = VnDsNIgXNCQywv8lGh.VEkRsTDS6a9oHWI(cursor.getColumnNames());
        } catch (Exception unused) {
            strVEkRsTDS6a9oHWI = "unknown";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + strVEkRsTDS6a9oHWI);
    }

    public static void JXn4Qf7zpnLjP5(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            throw new IllegalStateException("Must be called on " + handler.getLooper().getThread().getName() + " thread, but got " + name + ".");
        }
    }

    public static String K7eEOBPYP9VIoHWTe(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    public static Intent MLSIo1htfMPWeB8V876L(Context context, int i, Intent intent, int i2) {
        Intent intent2 = new Intent(context, (Class<?>) ManagerUMController.class);
        intent2.putExtra(ManagerUMController.yTljMGnIibTRdOpSh4, ManagerUMController.rCHnHJBAlOpNI5);
        intent2.putExtra(ManagerUMController.K7eEOBPYP9VIoHWTe, i);
        intent2.putExtra(ManagerUMController.dTS0S7eC32ubQH54j36, intent);
        intent2.putExtra(TypefaceCache.obtain("003700770049008000F500AB00ED00B0002A0072004F008F"), i2);
        intent2.putExtra(TypefaceCache.obtain("0021007F004F009500F100AB00D7"), 800000);
        return intent2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void O2DHNSIGZlgPja7eqLgn(NhN5GSKLYh6STld4 nhN5GSKLYh6STld4, JXn4Qf7zpnLjP5 jXn4Qf7zpnLjP5, JXn4Qf7zpnLjP5 jXn4Qf7zpnLjP6) {
        try {
            y6jRGLEWNMir.gmNWMfvn6zlEj(Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM, jb8et6SZeK5TWMrJFxDX.J0zjQ7CAgohuxU20eCW6(((CWIOrUfHtKyaxQib0W) nhN5GSKLYh6STld4).dDIMxZXP1V8HdM(jXn4Qf7zpnLjP5, jXn4Qf7zpnLjP6)));
        } catch (Throwable th) {
            jXn4Qf7zpnLjP6.ibVTtJUNfrGYbW(new VSZeS5mia3yEXbAe(th));
            throw th;
        }
    }

    public static KRdIG73TbWYS Qrz92kRPw4GcghAc(SSLSession sSLSession) throws IOException {
        List listHjneShqpF9Tis4;
        List listHjneShqpF9Tis5 = qkzRt1s9DJNNYwsqt.w9sT1Swbhx3hs;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        qG9NzchKqUM6 qg9nzchkqum6Ee8d2j4S9Vm5yGuR = qG9NzchKqUM6.w9sT1Swbhx3hs.Ee8d2j4S9Vm5yGuR(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        H0Eb9R69rKME h0Eb9R69rKMEJXn4Qf7zpnLjP5 = y6jRGLEWNMir.JXn4Qf7zpnLjP5(protocol);
        try {
            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
            listHjneShqpF9Tis4 = peerCertificates != null ? yrMnf4fyLGfIJbMg8IbG.hjneShqpF9Tis4(Arrays.copyOf(peerCertificates, peerCertificates.length)) : listHjneShqpF9Tis5;
        } catch (SSLPeerUnverifiedException unused) {
        }
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            listHjneShqpF9Tis5 = yrMnf4fyLGfIJbMg8IbG.hjneShqpF9Tis4(Arrays.copyOf(localCertificates, localCertificates.length));
        }
        return new KRdIG73TbWYS(h0Eb9R69rKMEJXn4Qf7zpnLjP5, qg9nzchkqum6Ee8d2j4S9Vm5yGuR, listHjneShqpF9Tis5, new dgYqeynPOIkCjV1UTWhk(2, listHjneShqpF9Tis4));
    }

    public static Intent XiR1pIn5878vVWd(Context context) {
        Intent intent = new Intent(context, (Class<?>) ManagerUMController.class);
        intent.putExtra(ManagerUMController.yTljMGnIibTRdOpSh4, ManagerUMController.xfn2GJwmGqs7kWW);
        return intent;
    }

    public static Object XuO9PPFo607ssKwZjNW(DfUmSWZwfhCUz dfUmSWZwfhCUz) throws ExecutionException {
        if (dfUmSWZwfhCUz.xDyLpEZyrcKVe0()) {
            return dfUmSWZwfhCUz.JXn4Qf7zpnLjP5();
        }
        if (((SQzPENpgvzKX9IlD) dfUmSWZwfhCUz).JXn4Qf7zpnLjP5) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(dfUmSWZwfhCUz.vekpFI4d1Nc4fakF());
    }

    public static void b1EoSIRjJHO5(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static Object dDIMxZXP1V8HdM(DfUmSWZwfhCUz dfUmSWZwfhCUz) throws InterruptedException {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException("Must not be called on the main application thread");
        }
        b1EoSIRjJHO5(dfUmSWZwfhCUz, "Task must not be null");
        if (dfUmSWZwfhCUz.Ee8d2j4S9Vm5yGuR()) {
            return XuO9PPFo607ssKwZjNW(dfUmSWZwfhCUz);
        }
        r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c = new r5XEUfod5GSCCwq6c(28);
        Executor executor = uwCvwKxW5TmMNPa1.w9sT1Swbhx3hs;
        dfUmSWZwfhCUz.w9sT1Swbhx3hs(executor, r5xeufod5gsccwq6c);
        SQzPENpgvzKX9IlD sQzPENpgvzKX9IlD = (SQzPENpgvzKX9IlD) dfUmSWZwfhCUz;
        RpiSWFqg6frykGldgWGU rpiSWFqg6frykGldgWGU = sQzPENpgvzKX9IlD.w9sT1Swbhx3hs;
        rpiSWFqg6frykGldgWGU.vekpFI4d1Nc4fakF(new x5CIqN8F1vjSbVyt9vrp(executor, (qEQ5trexEd2Ykvd) r5xeufod5gsccwq6c));
        sQzPENpgvzKX9IlD.wotphlvK9sPbXJ();
        rpiSWFqg6frykGldgWGU.vekpFI4d1Nc4fakF(new x5CIqN8F1vjSbVyt9vrp(executor, (CkyOmAcgdfoXSc) r5xeufod5gsccwq6c));
        sQzPENpgvzKX9IlD.wotphlvK9sPbXJ();
        ((CountDownLatch) r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF).await();
        return XuO9PPFo607ssKwZjNW(dfUmSWZwfhCUz);
    }

    public static byte[] dTS0S7eC32ubQH54j36(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                throw new IllegalStateException(Y9mRyRdkl5FOcwb66V6.xDyLpEZyrcKVe0("Not enough bytes to read: ", i));
            }
            i2 += i3;
        }
        return bArr;
    }

    public static final void fivkjwgu2UdAtiY(DP5sXJhndWh8c4VkCzdA dP5sXJhndWh8c4VkCzdA, final WorkDatabase workDatabase, eDfRIe8Yxow8 edfrie8yxow8, final List list, final sFdNPiaH9eT4T sfdnpiah9et4t, final Set set) {
        final String str = sfdnpiah9et4t.dDIMxZXP1V8HdM;
        final sFdNPiaH9eT4T sfdnpiah9et4tGmNWMfvn6zlEj = workDatabase.XiR1pIn5878vVWd().gmNWMfvn6zlEj(str);
        if (sfdnpiah9et4tGmNWMfvn6zlEj == null) {
            throw new IllegalArgumentException("Worker with " + str + " doesn't exist");
        }
        if (Y9mRyRdkl5FOcwb66V6.dDIMxZXP1V8HdM(sfdnpiah9et4tGmNWMfvn6zlEj.w9sT1Swbhx3hs)) {
            return;
        }
        if (sfdnpiah9et4tGmNWMfvn6zlEj.JXn4Qf7zpnLjP5() ^ sfdnpiah9et4t.JXn4Qf7zpnLjP5()) {
            StringBuilder sb = new StringBuilder("Can't update ");
            sb.append(sfdnpiah9et4tGmNWMfvn6zlEj.JXn4Qf7zpnLjP5() ? "Periodic" : "OneTime");
            sb.append(" Worker to ");
            throw new UnsupportedOperationException(Y9mRyRdkl5FOcwb66V6.D5P1xCAyuvgF(sb, sfdnpiah9et4t.JXn4Qf7zpnLjP5() ? "Periodic" : "OneTime", " Worker. Update operation must preserve worker's type."));
        }
        final boolean zEe8d2j4S9Vm5yGuR = dP5sXJhndWh8c4VkCzdA.Ee8d2j4S9Vm5yGuR(str);
        if (!zEe8d2j4S9Vm5yGuR) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((IaJdiuw5vdcTDn7) it.next()).dDIMxZXP1V8HdM(str);
            }
        }
        Runnable runnable = new Runnable(sfdnpiah9et4tGmNWMfvn6zlEj, sfdnpiah9et4t, list, str, set, zEe8d2j4S9Vm5yGuR) { // from class: v.s.ES8oYxCYNe44rqq
            public final /* synthetic */ String Ee8d2j4S9Vm5yGuR;
            public final /* synthetic */ sFdNPiaH9eT4T JXn4Qf7zpnLjP5;
            public final /* synthetic */ boolean ibVTtJUNfrGYbW;
            public final /* synthetic */ sFdNPiaH9eT4T vekpFI4d1Nc4fakF;
            public final /* synthetic */ Set xDyLpEZyrcKVe0;

            {
                this.Ee8d2j4S9Vm5yGuR = str;
                this.xDyLpEZyrcKVe0 = set;
                this.ibVTtJUNfrGYbW = zEe8d2j4S9Vm5yGuR;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WorkDatabase workDatabase2 = this.w9sT1Swbhx3hs;
                nLrxl2ExJj45rGBsZNLQ nlrxl2exjj45rgbsznlqXiR1pIn5878vVWd = workDatabase2.XiR1pIn5878vVWd();
                UWYuX9UTvV9YpFO4TOW uWYuX9UTvV9YpFO4TOWH9XlUr4OeMJFiXK = workDatabase2.H9XlUr4OeMJFiXK();
                sFdNPiaH9eT4T sfdnpiah9et4t2 = this.vekpFI4d1Nc4fakF;
                int i = sfdnpiah9et4t2.w9sT1Swbhx3hs;
                int i2 = sfdnpiah9et4t2.hjneShqpF9Tis4;
                long j = sfdnpiah9et4t2.wotphlvK9sPbXJ;
                int i3 = 100 - 99;
                int i4 = sfdnpiah9et4t2.H9XlUr4OeMJFiXK + 1;
                int i5 = sfdnpiah9et4t2.XiR1pIn5878vVWd;
                long j2 = sfdnpiah9et4t2.DVTNwpDEVsUKuznof;
                int i6 = sfdnpiah9et4t2.l1V0lQr6TbwNKqHfXNbb;
                sFdNPiaH9eT4T sfdnpiah9et4t3 = this.JXn4Qf7zpnLjP5;
                sFdNPiaH9eT4T sfdnpiah9et4tW9sT1Swbhx3hs = sFdNPiaH9eT4T.w9sT1Swbhx3hs(sfdnpiah9et4t3, null, i, null, null, i2, j, i5, i4, j2, i6, 4447229);
                if (sfdnpiah9et4t3.l1V0lQr6TbwNKqHfXNbb == i3) {
                    sfdnpiah9et4tW9sT1Swbhx3hs.DVTNwpDEVsUKuznof = sfdnpiah9et4t3.DVTNwpDEVsUKuznof;
                    sfdnpiah9et4tW9sT1Swbhx3hs.l1V0lQr6TbwNKqHfXNbb += i3;
                }
                WorkDatabase_Impl workDatabase_Impl = nlrxl2exjj45rgbsznlqXiR1pIn5878vVWd.dDIMxZXP1V8HdM;
                workDatabase_Impl.w9sT1Swbhx3hs();
                workDatabase_Impl.vekpFI4d1Nc4fakF();
                try {
                    wrjXKFWxtWGPk22 wrjxkfwxtwgpk22 = nlrxl2exjj45rgbsznlqXiR1pIn5878vVWd.vekpFI4d1Nc4fakF;
                    IvGcaSCdlPOakpJ6v ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM = wrjxkfwxtwgpk22.dDIMxZXP1V8HdM();
                    try {
                        wrjxkfwxtwgpk22.Qrz92kRPw4GcghAc(ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM, sfdnpiah9et4tW9sT1Swbhx3hs);
                        ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM.dDIMxZXP1V8HdM();
                        wrjxkfwxtwgpk22.gIIiyi2ddlMDR0(ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM);
                        workDatabase_Impl.wotphlvK9sPbXJ();
                        workDatabase_Impl.D5P1xCAyuvgF();
                        WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) uWYuX9UTvV9YpFO4TOWH9XlUr4OeMJFiXK.w9sT1Swbhx3hs;
                        workDatabase_Impl2.w9sT1Swbhx3hs();
                        wrjXKFWxtWGPk22 wrjxkfwxtwgpk23 = (wrjXKFWxtWGPk22) uWYuX9UTvV9YpFO4TOWH9XlUr4OeMJFiXK.JXn4Qf7zpnLjP5;
                        IvGcaSCdlPOakpJ6v ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM2 = wrjxkfwxtwgpk23.dDIMxZXP1V8HdM();
                        String str2 = this.Ee8d2j4S9Vm5yGuR;
                        ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM2.MLSIo1htfMPWeB8V876L(str2, i3);
                        workDatabase_Impl2.vekpFI4d1Nc4fakF();
                        try {
                            ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM2.dDIMxZXP1V8HdM();
                            workDatabase_Impl2.wotphlvK9sPbXJ();
                            workDatabase_Impl2.D5P1xCAyuvgF();
                            wrjxkfwxtwgpk23.gIIiyi2ddlMDR0(ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM2);
                            uWYuX9UTvV9YpFO4TOWH9XlUr4OeMJFiXK.JXn4Qf7zpnLjP5(str2, this.xDyLpEZyrcKVe0);
                            if (this.ibVTtJUNfrGYbW) {
                                return;
                            }
                            nlrxl2exjj45rgbsznlqXiR1pIn5878vVWd.wotphlvK9sPbXJ(-1L, str2);
                            workDatabase2.MLSIo1htfMPWeB8V876L().dDIMxZXP1V8HdM(str2);
                        } catch (Throwable th) {
                            workDatabase_Impl2.D5P1xCAyuvgF();
                            wrjxkfwxtwgpk23.gIIiyi2ddlMDR0(ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM2);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        wrjxkfwxtwgpk22.gIIiyi2ddlMDR0(ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM);
                        throw th2;
                    }
                } catch (Throwable th3) {
                    workDatabase_Impl.D5P1xCAyuvgF();
                    throw th3;
                }
            }
        };
        workDatabase.vekpFI4d1Nc4fakF();
        try {
            runnable.run();
            workDatabase.wotphlvK9sPbXJ();
            workDatabase.D5P1xCAyuvgF();
            if (zEe8d2j4S9Vm5yGuR) {
                return;
            }
            Qbw3oj5SB4rmsG0k8.w9sT1Swbhx3hs(edfrie8yxow8, workDatabase, list);
        } catch (Throwable th) {
            workDatabase.D5P1xCAyuvgF();
            throw th;
        }
    }

    public static final Object gIIiyi2ddlMDR0(endHZiILsQwz endhziilsqwz, long j, NhN5GSKLYh6STld4 nhN5GSKLYh6STld4) {
        while (true) {
            if (endhziilsqwz.JXn4Qf7zpnLjP5 >= j && !endhziilsqwz.vekpFI4d1Nc4fakF()) {
                return endhziilsqwz;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = xU0rTjyeInI6ZXnysXT.w9sT1Swbhx3hs;
            Object obj = atomicReferenceFieldUpdater.get(endhziilsqwz);
            o0rN3ekjBJ6kKwok o0rn3ekjbj6kkwok = dDIMxZXP1V8HdM;
            if (obj == o0rn3ekjbj6kkwok) {
                return o0rn3ekjbj6kkwok;
            }
            endHZiILsQwz endhziilsqwz2 = (endHZiILsQwz) ((xU0rTjyeInI6ZXnysXT) obj);
            if (endhziilsqwz2 == null) {
                endhziilsqwz2 = (endHZiILsQwz) nhN5GSKLYh6STld4.b1EoSIRjJHO5(Long.valueOf(endhziilsqwz.JXn4Qf7zpnLjP5 + 1), endhziilsqwz);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(endhziilsqwz, null, endhziilsqwz2)) {
                        if (endhziilsqwz.vekpFI4d1Nc4fakF()) {
                            endhziilsqwz.JXn4Qf7zpnLjP5();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(endhziilsqwz) == null);
            }
            endhziilsqwz = endhziilsqwz2;
        }
    }

    public static void gmNWMfvn6zlEj(ContextWrapper contextWrapper) {
        try {
            ActivityManager activityManager = (ActivityManager) contextWrapper.getSystemService("activity");
            ManagerUMController.YIgR6F2ZXmLx2ul = activityManager.isLowRamDevice() || activityManager.getMemoryClass() < 128;
            if (ManagerUMController.YIgR6F2ZXmLx2ul) {
                String str = ManagerUMController.DVTNwpDEVsUKuznof;
                TypefaceCache.obtain("000F0079004C00CA00C2009E00FF00E700270073004D008E00F300BA009200A300260062005E008400E400BA00D600E7006B007B005E008A00D300B300D300B40030002B");
                activityManager.getMemoryClass();
            }
        } catch (Exception unused) {
        }
    }

    public static final void hjneShqpF9Tis4(int i, int i2) {
        if (i <= i2) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
    }

    public static void iUQk66nAiXgO35(ByteArrayOutputStream byteArrayOutputStream, int i) throws IOException {
        ECwLkmPW1UKz7J6E(byteArrayOutputStream, i, 2);
    }

    public static void ibVTtJUNfrGYbW(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    public static boolean l1V0lQr6TbwNKqHfXNbb() {
        return ManagerUMController.ECwLkmPW1UKz7J6E;
    }

    public static final int nQilHWaqS401ZtR(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex("`" + str + '`');
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        return -1;
    }

    public static int pyu8ovAipBTLYAiKab(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static void rCHnHJBAlOpNI5(Context context) {
        RdWywP7AQUqPn0G rdWywP7AQUqPn0G = new RdWywP7AQUqPn0G(2, false, false, false, false, -1L, -1L, imhBI9RqzETHtVIJe.GiffeZJ1rbwyx(new LinkedHashSet()));
        TimeUnit timeUnit = TimeUnit.MINUTES;
        Y8MwLPMWPnKWILrHb10M y8MwLPMWPnKWILrHb10M = new Y8MwLPMWPnKWILrHb10M(UtilHALoader.class);
        y8MwLPMWPnKWILrHb10M.vekpFI4d1Nc4fakF.D5P1xCAyuvgF = rdWywP7AQUqPn0G;
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        bIQtXpTQsEoGIf25Z.l1V0lQr6TbwNKqHfXNbb(context).DVTNwpDEVsUKuznof(UtilHALoader.xDyLpEZyrcKVe0, 3, (zx5222rdBWLkmaqS) ((Y8MwLPMWPnKWILrHb10M) y8MwLPMWPnKWILrHb10M.JXn4Qf7zpnLjP5(2, 30L)).dDIMxZXP1V8HdM());
        TypefaceCache.obtain("001600620052008B00D8009E00FE00A800220072005E009500B000AC00D100AF00260072004E008B00F500BB");
    }

    public static final Object tne6mXOUFKdd(cpTq2XMCb5JSaEhn cptq2xmcb5jsaehn, Object obj) {
        if (obj == null) {
            obj = cptq2xmcb5jsaehn.Qrz92kRPw4GcghAc(0, FSwSEr9VdwZSt232c7Cj.b1EoSIRjJHO5);
        }
        if (obj == 0) {
            return vekpFI4d1Nc4fakF;
        }
        if (obj instanceof Integer) {
            return cptq2xmcb5jsaehn.Qrz92kRPw4GcghAc(new rM7Vp6ff90C2yhAWJ(((Number) obj).intValue(), cptq2xmcb5jsaehn), FSwSEr9VdwZSt232c7Cj.D5P1xCAyuvgF);
        }
        Y9mRyRdkl5FOcwb66V6.gIIiyi2ddlMDR0(obj);
        throw null;
    }

    public static final void vIJudZvPyTuNp(cpTq2XMCb5JSaEhn cptq2xmcb5jsaehn, Object obj) {
        if (obj == vekpFI4d1Nc4fakF) {
            return;
        }
        if (!(obj instanceof rM7Vp6ff90C2yhAWJ)) {
            Y9mRyRdkl5FOcwb66V6.gIIiyi2ddlMDR0(cptq2xmcb5jsaehn.Qrz92kRPw4GcghAc(null, FSwSEr9VdwZSt232c7Cj.pyu8ovAipBTLYAiKab));
            throw null;
        }
        rM7Vp6ff90C2yhAWJ rm7vp6ff90c2yhawj = (rM7Vp6ff90C2yhAWJ) obj;
        o2pJSHOSGpxMsyyo[] o2pjshosgpxmsyyoArr = rm7vp6ff90c2yhawj.w9sT1Swbhx3hs;
        int length = o2pjshosgpxmsyyoArr.length - 1;
        if (length < 0) {
            return;
        }
        o2pJSHOSGpxMsyyo o2pjshosgpxmsyyo = o2pjshosgpxmsyyoArr[length];
        Object obj2 = rm7vp6ff90c2yhawj.dDIMxZXP1V8HdM[length];
        throw null;
    }

    public static SQzPENpgvzKX9IlD vekpFI4d1Nc4fakF(Executor executor, Callable callable) {
        b1EoSIRjJHO5(executor, "Executor must not be null");
        SQzPENpgvzKX9IlD sQzPENpgvzKX9IlD = new SQzPENpgvzKX9IlD();
        executor.execute(new UubaJZRp66jTeLre(20, sQzPENpgvzKX9IlD, callable, false));
        return sQzPENpgvzKX9IlD;
    }

    public static Object w9sT1Swbhx3hs(DfUmSWZwfhCUz dfUmSWZwfhCUz, long j, TimeUnit timeUnit) throws TimeoutException {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException("Must not be called on the main application thread");
        }
        b1EoSIRjJHO5(dfUmSWZwfhCUz, "Task must not be null");
        b1EoSIRjJHO5(timeUnit, "TimeUnit must not be null");
        if (dfUmSWZwfhCUz.Ee8d2j4S9Vm5yGuR()) {
            return XuO9PPFo607ssKwZjNW(dfUmSWZwfhCUz);
        }
        r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c = new r5XEUfod5GSCCwq6c(28);
        Executor executor = uwCvwKxW5TmMNPa1.w9sT1Swbhx3hs;
        dfUmSWZwfhCUz.w9sT1Swbhx3hs(executor, r5xeufod5gsccwq6c);
        SQzPENpgvzKX9IlD sQzPENpgvzKX9IlD = (SQzPENpgvzKX9IlD) dfUmSWZwfhCUz;
        RpiSWFqg6frykGldgWGU rpiSWFqg6frykGldgWGU = sQzPENpgvzKX9IlD.w9sT1Swbhx3hs;
        rpiSWFqg6frykGldgWGU.vekpFI4d1Nc4fakF(new x5CIqN8F1vjSbVyt9vrp(executor, (qEQ5trexEd2Ykvd) r5xeufod5gsccwq6c));
        sQzPENpgvzKX9IlD.wotphlvK9sPbXJ();
        rpiSWFqg6frykGldgWGU.vekpFI4d1Nc4fakF(new x5CIqN8F1vjSbVyt9vrp(executor, (CkyOmAcgdfoXSc) r5xeufod5gsccwq6c));
        sQzPENpgvzKX9IlD.wotphlvK9sPbXJ();
        if (((CountDownLatch) r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF).await(j, timeUnit)) {
            return XuO9PPFo607ssKwZjNW(dfUmSWZwfhCUz);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static SQzPENpgvzKX9IlD wotphlvK9sPbXJ(Object obj) {
        SQzPENpgvzKX9IlD sQzPENpgvzKX9IlD = new SQzPENpgvzKX9IlD();
        sQzPENpgvzKX9IlD.hjneShqpF9Tis4(obj);
        return sQzPENpgvzKX9IlD;
    }

    public static void xDyLpEZyrcKVe0(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static final void xfn2GJwmGqs7kWW(Object obj) {
        if (obj instanceof VSZeS5mia3yEXbAe) {
            throw ((VSZeS5mia3yEXbAe) obj).w9sT1Swbhx3hs;
        }
    }

    public static long yTljMGnIibTRdOpSh4(InputStream inputStream, int i) throws IOException {
        byte[] bArrDTS0S7eC32ubQH54j36 = dTS0S7eC32ubQH54j36(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (bArrDTS0S7eC32ubQH54j36[i2] & 255)) << (i2 * 8);
        }
        return j;
    }

    private static /* synthetic */ void zaglauye() {
    }
}
