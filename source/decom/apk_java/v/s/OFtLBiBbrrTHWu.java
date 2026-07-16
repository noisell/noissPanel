package v.s;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import app.mobilex.plus.ChatActivity;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class OFtLBiBbrrTHWu {
    public static final R8Y7LdR0VPAAn dDIMxZXP1V8HdM = new R8Y7LdR0VPAAn();
    public static final fEyMFFyOOvHURJ7To6L w9sT1Swbhx3hs = new fEyMFFyOOvHURJ7To6L(12);
    public static final byte[] vekpFI4d1Nc4fakF = {112, 114, 111, 0};
    public static final byte[] JXn4Qf7zpnLjP5 = {112, 114, 109, 0};

    public static byte[] D5P1xCAyuvgF(SvaRwOgSe9xmOs[] svaRwOgSe9xmOsArr, byte[] bArr) throws IOException {
        int length = 0;
        for (SvaRwOgSe9xmOs svaRwOgSe9xmOs : svaRwOgSe9xmOsArr) {
            length += ((((svaRwOgSe9xmOs.ibVTtJUNfrGYbW * 2) + 7) & (-8)) / 8) + (svaRwOgSe9xmOs.Ee8d2j4S9Vm5yGuR * 2) + nQilHWaqS401ZtR(svaRwOgSe9xmOs.dDIMxZXP1V8HdM, svaRwOgSe9xmOs.w9sT1Swbhx3hs, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + svaRwOgSe9xmOs.xDyLpEZyrcKVe0;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, gA5gCwTK0qjTIn.Ee8d2j4S9Vm5yGuR)) {
            for (SvaRwOgSe9xmOs svaRwOgSe9xmOs2 : svaRwOgSe9xmOsArr) {
                XuO9PPFo607ssKwZjNW(byteArrayOutputStream, svaRwOgSe9xmOs2, nQilHWaqS401ZtR(svaRwOgSe9xmOs2.dDIMxZXP1V8HdM, svaRwOgSe9xmOs2.w9sT1Swbhx3hs, bArr));
                k84rwRrqzhrNQ1CdNQ9(byteArrayOutputStream, svaRwOgSe9xmOs2);
                int[] iArr = svaRwOgSe9xmOs2.b1EoSIRjJHO5;
                int length2 = iArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length2) {
                    int i3 = iArr[i];
                    SbxdZ6Kq2uhHQ5RPRqm.iUQk66nAiXgO35(byteArrayOutputStream, i3 - i2);
                    i++;
                    i2 = i3;
                }
                hV4VTKNUdeHN(byteArrayOutputStream, svaRwOgSe9xmOs2);
            }
        } else {
            for (SvaRwOgSe9xmOs svaRwOgSe9xmOs3 : svaRwOgSe9xmOsArr) {
                XuO9PPFo607ssKwZjNW(byteArrayOutputStream, svaRwOgSe9xmOs3, nQilHWaqS401ZtR(svaRwOgSe9xmOs3.dDIMxZXP1V8HdM, svaRwOgSe9xmOs3.w9sT1Swbhx3hs, bArr));
            }
            for (SvaRwOgSe9xmOs svaRwOgSe9xmOs4 : svaRwOgSe9xmOsArr) {
                k84rwRrqzhrNQ1CdNQ9(byteArrayOutputStream, svaRwOgSe9xmOs4);
                int[] iArr2 = svaRwOgSe9xmOs4.b1EoSIRjJHO5;
                int length3 = iArr2.length;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length3) {
                    int i6 = iArr2[i4];
                    SbxdZ6Kq2uhHQ5RPRqm.iUQk66nAiXgO35(byteArrayOutputStream, i6 - i5);
                    i4++;
                    i5 = i6;
                }
                hV4VTKNUdeHN(byteArrayOutputStream, svaRwOgSe9xmOs4);
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static final boolean DVTNwpDEVsUKuznof(String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static VUjeMiNYIJhgmVJopga ECwLkmPW1UKz7J6E(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new VUjeMiNYIJhgmVJopga(i, i2 - 1, 1);
        }
        VUjeMiNYIJhgmVJopga vUjeMiNYIJhgmVJopga = VUjeMiNYIJhgmVJopga.Ee8d2j4S9Vm5yGuR;
        return VUjeMiNYIJhgmVJopga.Ee8d2j4S9Vm5yGuR;
    }

    public static SvaRwOgSe9xmOs[] EWUjsTERgdPbSw3NNlN(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, SvaRwOgSe9xmOs[] svaRwOgSe9xmOsArr) throws IOException {
        byte[] bArr3 = gA5gCwTK0qjTIn.b1EoSIRjJHO5;
        int i = (-89) + 93;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, gA5gCwTK0qjTIn.pyu8ovAipBTLYAiKab)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iYTljMGnIibTRdOpSh4 = (int) SbxdZ6Kq2uhHQ5RPRqm.yTljMGnIibTRdOpSh4(fileInputStream, 2);
            byte[] bArrEWUjsTERgdPbSw3NNlN = SbxdZ6Kq2uhHQ5RPRqm.EWUjsTERgdPbSw3NNlN(fileInputStream, (int) SbxdZ6Kq2uhHQ5RPRqm.yTljMGnIibTRdOpSh4(fileInputStream, i), (int) SbxdZ6Kq2uhHQ5RPRqm.yTljMGnIibTRdOpSh4(fileInputStream, i));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrEWUjsTERgdPbSw3NNlN);
            try {
                SvaRwOgSe9xmOs[] svaRwOgSe9xmOsArrVIJudZvPyTuNp = vIJudZvPyTuNp(byteArrayInputStream, bArr2, iYTljMGnIibTRdOpSh4, svaRwOgSe9xmOsArr);
                byteArrayInputStream.close();
                return svaRwOgSe9xmOsArrVIJudZvPyTuNp;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(gA5gCwTK0qjTIn.vekpFI4d1Nc4fakF, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iYTljMGnIibTRdOpSh5 = (int) SbxdZ6Kq2uhHQ5RPRqm.yTljMGnIibTRdOpSh4(fileInputStream, 1);
        byte[] bArrEWUjsTERgdPbSw3NNlN2 = SbxdZ6Kq2uhHQ5RPRqm.EWUjsTERgdPbSw3NNlN(fileInputStream, (int) SbxdZ6Kq2uhHQ5RPRqm.yTljMGnIibTRdOpSh4(fileInputStream, i), (int) SbxdZ6Kq2uhHQ5RPRqm.yTljMGnIibTRdOpSh4(fileInputStream, i));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrEWUjsTERgdPbSw3NNlN2);
        try {
            SvaRwOgSe9xmOs[] svaRwOgSe9xmOsArrYTljMGnIibTRdOpSh4 = yTljMGnIibTRdOpSh4(byteArrayInputStream2, iYTljMGnIibTRdOpSh5, svaRwOgSe9xmOsArr);
            byteArrayInputStream2.close();
            return svaRwOgSe9xmOsArrYTljMGnIibTRdOpSh4;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static int Ee8d2j4S9Vm5yGuR(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    public static ChatActivity J0zjQ7CAgohuxU20eCW6() {
        return ChatActivity.ibVTtJUNfrGYbW;
    }

    public static void JXn4Qf7zpnLjP5(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i > i2) {
                throw new IllegalArgumentException(Y9mRyRdkl5FOcwb66V6.Ee8d2j4S9Vm5yGuR(i, i2, "fromIndex: ", " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
    }

    public static long K7eEOBPYP9VIoHWTe(D9wzo6HEnqch09S d9wzo6HEnqch09S) {
        l1V0lQr6TbwNKqHfXNbb l1v0lqr6tbwnkqhfxnbb = lMJPWn8FzeWU82pNUhWl.w9sT1Swbhx3hs;
        try {
            long j = d9wzo6HEnqch09S.w9sT1Swbhx3hs;
            long j2 = d9wzo6HEnqch09S.vekpFI4d1Nc4fakF;
            if (j > j2) {
                throw new IllegalArgumentException("Cannot get random in empty range: " + d9wzo6HEnqch09S);
            }
            if (j2 < Long.MAX_VALUE) {
                return lMJPWn8FzeWU82pNUhWl.w9sT1Swbhx3hs.xDyLpEZyrcKVe0(j, j2 + 1);
            }
            if (j > Long.MIN_VALUE) {
                return lMJPWn8FzeWU82pNUhWl.w9sT1Swbhx3hs.xDyLpEZyrcKVe0(j - 1, j2) + 1;
            }
            return lMJPWn8FzeWU82pNUhWl.w9sT1Swbhx3hs.JXn4Qf7zpnLjP5();
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public static SvaRwOgSe9xmOs[] O2DHNSIGZlgPja7eqLgn(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new SvaRwOgSe9xmOs[0];
        }
        SvaRwOgSe9xmOs[] svaRwOgSe9xmOsArr = new SvaRwOgSe9xmOs[i];
        for (int i3 = 0; i3 < i; i3++) {
            int iYTljMGnIibTRdOpSh4 = (int) SbxdZ6Kq2uhHQ5RPRqm.yTljMGnIibTRdOpSh4(byteArrayInputStream, 2);
            int iYTljMGnIibTRdOpSh5 = (int) SbxdZ6Kq2uhHQ5RPRqm.yTljMGnIibTRdOpSh4(byteArrayInputStream, 2);
            int i4 = 77 - 73;
            svaRwOgSe9xmOsArr[i3] = new SvaRwOgSe9xmOs(str, new String(SbxdZ6Kq2uhHQ5RPRqm.dTS0S7eC32ubQH54j36(byteArrayInputStream, iYTljMGnIibTRdOpSh4), StandardCharsets.UTF_8), SbxdZ6Kq2uhHQ5RPRqm.yTljMGnIibTRdOpSh4(byteArrayInputStream, i4), iYTljMGnIibTRdOpSh5, (int) SbxdZ6Kq2uhHQ5RPRqm.yTljMGnIibTRdOpSh4(byteArrayInputStream, i4), (int) SbxdZ6Kq2uhHQ5RPRqm.yTljMGnIibTRdOpSh4(byteArrayInputStream, i4), new int[iYTljMGnIibTRdOpSh5], new TreeMap());
        }
        int i5 = 0;
        while (i5 < i) {
            SvaRwOgSe9xmOs svaRwOgSe9xmOs = svaRwOgSe9xmOsArr[i5];
            int iAvailable = byteArrayInputStream.available();
            int i6 = svaRwOgSe9xmOs.xDyLpEZyrcKVe0;
            int i7 = svaRwOgSe9xmOs.ibVTtJUNfrGYbW;
            TreeMap treeMap = svaRwOgSe9xmOs.pyu8ovAipBTLYAiKab;
            int i8 = iAvailable - i6;
            int iYTljMGnIibTRdOpSh6 = i2;
            while (byteArrayInputStream.available() > i8) {
                iYTljMGnIibTRdOpSh6 += (int) SbxdZ6Kq2uhHQ5RPRqm.yTljMGnIibTRdOpSh4(byteArrayInputStream, 2);
                int i9 = 57 - 56;
                treeMap.put(Integer.valueOf(iYTljMGnIibTRdOpSh6), Integer.valueOf(i9));
                int iYTljMGnIibTRdOpSh7 = (int) SbxdZ6Kq2uhHQ5RPRqm.yTljMGnIibTRdOpSh4(byteArrayInputStream, 2);
                while (iYTljMGnIibTRdOpSh7 > 0) {
                    SbxdZ6Kq2uhHQ5RPRqm.yTljMGnIibTRdOpSh4(byteArrayInputStream, 2);
                    int iYTljMGnIibTRdOpSh8 = (int) SbxdZ6Kq2uhHQ5RPRqm.yTljMGnIibTRdOpSh4(byteArrayInputStream, i9);
                    if (iYTljMGnIibTRdOpSh8 != 6 && iYTljMGnIibTRdOpSh8 != 7) {
                        while (iYTljMGnIibTRdOpSh8 > 0) {
                            SbxdZ6Kq2uhHQ5RPRqm.yTljMGnIibTRdOpSh4(byteArrayInputStream, i9);
                            int i10 = i2;
                            int i11 = i5;
                            for (int iYTljMGnIibTRdOpSh9 = (int) SbxdZ6Kq2uhHQ5RPRqm.yTljMGnIibTRdOpSh4(byteArrayInputStream, i9); iYTljMGnIibTRdOpSh9 > 0; iYTljMGnIibTRdOpSh9--) {
                                SbxdZ6Kq2uhHQ5RPRqm.yTljMGnIibTRdOpSh4(byteArrayInputStream, 2);
                            }
                            iYTljMGnIibTRdOpSh8--;
                            i2 = i10;
                            i5 = i11;
                        }
                    }
                    iYTljMGnIibTRdOpSh7--;
                    i2 = i2;
                    i5 = i5;
                }
            }
            int i12 = i2;
            int i13 = i5;
            if (byteArrayInputStream.available() != i8) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            svaRwOgSe9xmOs.b1EoSIRjJHO5 = dTS0S7eC32ubQH54j36(byteArrayInputStream, svaRwOgSe9xmOs.Ee8d2j4S9Vm5yGuR);
            BitSet bitSetValueOf = BitSet.valueOf(SbxdZ6Kq2uhHQ5RPRqm.dTS0S7eC32ubQH54j36(byteArrayInputStream, (((i7 * 2) + 7) & (-8)) / 8));
            for (int i14 = i12; i14 < i7; i14++) {
                int i15 = bitSetValueOf.get(i14) ? 2 : i12;
                if (bitSetValueOf.get(i14 + i7)) {
                    i15 |= 4;
                }
                if (i15 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i14));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i12);
                    }
                    treeMap.put(Integer.valueOf(i14), Integer.valueOf(i15 | numValueOf.intValue()));
                }
            }
            i5 = i13 + 1;
            i2 = i12;
        }
        return svaRwOgSe9xmOsArr;
    }

    public static FVxyDmZ6Vklq5C Qrz92kRPw4GcghAc(String str, UeVBYgBvSKYfVuXLhMs ueVBYgBvSKYfVuXLhMs) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(QwPxr2jx1iGLmehgkv3g.dDIMxZXP1V8HdM(A8Ma74sVrwIpGnRFB9.class));
        for (Class cls : new Class[0]) {
            jb8et6SZeK5TWMrJFxDX.JXn4Qf7zpnLjP5(cls, "Null interface");
            hashSet.add(QwPxr2jx1iGLmehgkv3g.dDIMxZXP1V8HdM(cls));
        }
        kha8vJMg5Bq7MuAMmONj kha8vjmg5bq7muammonjDDIMxZXP1V8HdM = kha8vJMg5Bq7MuAMmONj.dDIMxZXP1V8HdM(Context.class);
        if (hashSet.contains(kha8vjmg5bq7muammonjDDIMxZXP1V8HdM.dDIMxZXP1V8HdM)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet2.add(kha8vjmg5bq7muammonjDDIMxZXP1V8HdM);
        return new FVxyDmZ6Vklq5C(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 101 - 100, new cY0DNVJM1fAUrMWIl7k(str, 2, ueVBYgBvSKYfVuXLhMs), hashSet3);
    }

    public static void XuO9PPFo607ssKwZjNW(ByteArrayOutputStream byteArrayOutputStream, SvaRwOgSe9xmOs svaRwOgSe9xmOs, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        SbxdZ6Kq2uhHQ5RPRqm.iUQk66nAiXgO35(byteArrayOutputStream, str.getBytes(charset).length);
        SbxdZ6Kq2uhHQ5RPRqm.iUQk66nAiXgO35(byteArrayOutputStream, svaRwOgSe9xmOs.Ee8d2j4S9Vm5yGuR);
        SbxdZ6Kq2uhHQ5RPRqm.ECwLkmPW1UKz7J6E(byteArrayOutputStream, svaRwOgSe9xmOs.xDyLpEZyrcKVe0, 4);
        SbxdZ6Kq2uhHQ5RPRqm.ECwLkmPW1UKz7J6E(byteArrayOutputStream, svaRwOgSe9xmOs.vekpFI4d1Nc4fakF, 4);
        SbxdZ6Kq2uhHQ5RPRqm.ECwLkmPW1UKz7J6E(byteArrayOutputStream, svaRwOgSe9xmOs.ibVTtJUNfrGYbW, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void b1EoSIRjJHO5(InputStream inputStream, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        byte[] bArr = new byte[8176 + 16];
        int i = inputStream.read(bArr);
        while (i >= 0) {
            byteArrayOutputStream.write(bArr, 0, i);
            i = inputStream.read(bArr);
        }
    }

    public static void dDIMxZXP1V8HdM(String str) {
        ChatActivity chatActivity = ChatActivity.ibVTtJUNfrGYbW;
        if (chatActivity != null) {
            chatActivity.runOnUiThread(new hzCVl0f866ksvpzUUql(3, str));
        }
    }

    public static int[] dTS0S7eC32ubQH54j36(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int iYTljMGnIibTRdOpSh4 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iYTljMGnIibTRdOpSh4 += (int) SbxdZ6Kq2uhHQ5RPRqm.yTljMGnIibTRdOpSh4(byteArrayInputStream, 2);
            iArr[i2] = iYTljMGnIibTRdOpSh4;
        }
        return iArr;
    }

    public static boolean fivkjwgu2UdAtiY(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, SvaRwOgSe9xmOs[] svaRwOgSe9xmOsArr) throws IOException {
        long j;
        int length;
        byte[] bArr2 = gA5gCwTK0qjTIn.ibVTtJUNfrGYbW;
        byte[] bArr3 = gA5gCwTK0qjTIn.xDyLpEZyrcKVe0;
        byte[] bArr4 = gA5gCwTK0qjTIn.vekpFI4d1Nc4fakF;
        int i = 0;
        if (Arrays.equals(bArr, bArr4)) {
            ArrayList arrayList = new ArrayList(3);
            ArrayList arrayList2 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                SbxdZ6Kq2uhHQ5RPRqm.iUQk66nAiXgO35(byteArrayOutputStream2, svaRwOgSe9xmOsArr.length);
                int i2 = 2;
                int i3 = 2;
                for (SvaRwOgSe9xmOs svaRwOgSe9xmOs : svaRwOgSe9xmOsArr) {
                    SbxdZ6Kq2uhHQ5RPRqm.ECwLkmPW1UKz7J6E(byteArrayOutputStream2, svaRwOgSe9xmOs.vekpFI4d1Nc4fakF, 4);
                    SbxdZ6Kq2uhHQ5RPRqm.ECwLkmPW1UKz7J6E(byteArrayOutputStream2, svaRwOgSe9xmOs.JXn4Qf7zpnLjP5, 4);
                    SbxdZ6Kq2uhHQ5RPRqm.ECwLkmPW1UKz7J6E(byteArrayOutputStream2, svaRwOgSe9xmOs.ibVTtJUNfrGYbW, 4);
                    String strNQilHWaqS401ZtR = nQilHWaqS401ZtR(svaRwOgSe9xmOs.dDIMxZXP1V8HdM, svaRwOgSe9xmOs.w9sT1Swbhx3hs, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = strNQilHWaqS401ZtR.getBytes(charset).length;
                    SbxdZ6Kq2uhHQ5RPRqm.iUQk66nAiXgO35(byteArrayOutputStream2, length2);
                    i3 = i3 + 14 + length2;
                    byteArrayOutputStream2.write(strNQilHWaqS401ZtR.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i3 != byteArray.length) {
                    throw new IllegalStateException("Expected size " + i3 + ", does not match actual size " + byteArray.length);
                }
                JdFyJDgGqaUv jdFyJDgGqaUv = new JdFyJDgGqaUv(1, byteArray, false);
                byteArrayOutputStream2.close();
                arrayList.add(jdFyJDgGqaUv);
                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                int i4 = 0;
                int i5 = 0;
                while (i4 < svaRwOgSe9xmOsArr.length) {
                    try {
                        SvaRwOgSe9xmOs svaRwOgSe9xmOs2 = svaRwOgSe9xmOsArr[i4];
                        SbxdZ6Kq2uhHQ5RPRqm.iUQk66nAiXgO35(byteArrayOutputStream3, i4);
                        SbxdZ6Kq2uhHQ5RPRqm.iUQk66nAiXgO35(byteArrayOutputStream3, svaRwOgSe9xmOs2.Ee8d2j4S9Vm5yGuR);
                        i5 = i5 + 4 + (svaRwOgSe9xmOs2.Ee8d2j4S9Vm5yGuR * i2);
                        int[] iArr = svaRwOgSe9xmOs2.b1EoSIRjJHO5;
                        int length3 = iArr.length;
                        int i6 = i;
                        int i7 = i2;
                        int i8 = i6;
                        while (i8 < length3) {
                            int i9 = iArr[i8];
                            SbxdZ6Kq2uhHQ5RPRqm.iUQk66nAiXgO35(byteArrayOutputStream3, i9 - i6);
                            i8++;
                            i6 = i9;
                        }
                        i4++;
                        i2 = i7;
                        i = 0;
                    } catch (Throwable th) {
                        try {
                            byteArrayOutputStream3.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
                byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                if (i5 != byteArray2.length) {
                    throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray2.length);
                }
                JdFyJDgGqaUv jdFyJDgGqaUv2 = new JdFyJDgGqaUv(3, byteArray2, true);
                byteArrayOutputStream3.close();
                arrayList.add(jdFyJDgGqaUv2);
                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                int i10 = 0;
                int i11 = 0;
                while (i10 < svaRwOgSe9xmOsArr.length) {
                    try {
                        SvaRwOgSe9xmOs svaRwOgSe9xmOs3 = svaRwOgSe9xmOsArr[i10];
                        Iterator it = svaRwOgSe9xmOs3.pyu8ovAipBTLYAiKab.entrySet().iterator();
                        int iIntValue = 0;
                        while (it.hasNext()) {
                            iIntValue |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
                        }
                        ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                        try {
                            hV4VTKNUdeHN(byteArrayOutputStream5, svaRwOgSe9xmOs3);
                            byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                            byteArrayOutputStream5.close();
                            ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                            try {
                                k84rwRrqzhrNQ1CdNQ9(byteArrayOutputStream6, svaRwOgSe9xmOs3);
                                byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                                byteArrayOutputStream6.close();
                                SbxdZ6Kq2uhHQ5RPRqm.iUQk66nAiXgO35(byteArrayOutputStream4, i10);
                                int length4 = byteArray3.length + 2 + byteArray4.length;
                                int i12 = i11 + 6;
                                int i13 = i10;
                                SbxdZ6Kq2uhHQ5RPRqm.ECwLkmPW1UKz7J6E(byteArrayOutputStream4, length4, 4);
                                SbxdZ6Kq2uhHQ5RPRqm.iUQk66nAiXgO35(byteArrayOutputStream4, iIntValue);
                                byteArrayOutputStream4.write(byteArray3);
                                byteArrayOutputStream4.write(byteArray4);
                                i11 = i12 + length4;
                                i10 = i13 + 1;
                            } catch (Throwable th3) {
                                try {
                                    byteArrayOutputStream6.close();
                                    throw th3;
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                    throw th3;
                                }
                            }
                        } catch (Throwable th5) {
                            try {
                                byteArrayOutputStream5.close();
                                throw th5;
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                                throw th5;
                            }
                        }
                    } catch (Throwable th7) {
                        try {
                            byteArrayOutputStream4.close();
                            throw th7;
                        } catch (Throwable th8) {
                            th7.addSuppressed(th8);
                            throw th7;
                        }
                    }
                }
                byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
                if (i11 != byteArray5.length) {
                    throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray5.length);
                }
                JdFyJDgGqaUv jdFyJDgGqaUv3 = new JdFyJDgGqaUv(4, byteArray5, true);
                byteArrayOutputStream4.close();
                arrayList.add(jdFyJDgGqaUv3);
                long j2 = 4;
                long size = j2 + j2 + 4 + ((long) (arrayList.size() * 16));
                SbxdZ6Kq2uhHQ5RPRqm.ECwLkmPW1UKz7J6E(byteArrayOutputStream, arrayList.size(), 4);
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    JdFyJDgGqaUv jdFyJDgGqaUv4 = (JdFyJDgGqaUv) arrayList.get(i14);
                    int i15 = jdFyJDgGqaUv4.dDIMxZXP1V8HdM;
                    byte[] bArr5 = jdFyJDgGqaUv4.w9sT1Swbhx3hs;
                    if (i15 == 1) {
                        j = 0;
                    } else if (i15 == 2) {
                        j = 1;
                    } else if (i15 == 3) {
                        j = 2;
                    } else if (i15 == 4) {
                        j = 3;
                    } else {
                        if (i15 != 42 - 37) {
                            throw null;
                        }
                        j = 4;
                    }
                    SbxdZ6Kq2uhHQ5RPRqm.ECwLkmPW1UKz7J6E(byteArrayOutputStream, j, 4);
                    SbxdZ6Kq2uhHQ5RPRqm.ECwLkmPW1UKz7J6E(byteArrayOutputStream, size, 4);
                    if (jdFyJDgGqaUv4.vekpFI4d1Nc4fakF) {
                        long length5 = bArr5.length;
                        byte[] bArrD5P1xCAyuvgF = SbxdZ6Kq2uhHQ5RPRqm.D5P1xCAyuvgF(bArr5);
                        arrayList2.add(bArrD5P1xCAyuvgF);
                        SbxdZ6Kq2uhHQ5RPRqm.ECwLkmPW1UKz7J6E(byteArrayOutputStream, bArrD5P1xCAyuvgF.length, 4);
                        SbxdZ6Kq2uhHQ5RPRqm.ECwLkmPW1UKz7J6E(byteArrayOutputStream, length5, 4);
                        length = bArrD5P1xCAyuvgF.length;
                    } else {
                        arrayList2.add(bArr5);
                        SbxdZ6Kq2uhHQ5RPRqm.ECwLkmPW1UKz7J6E(byteArrayOutputStream, bArr5.length, 4);
                        SbxdZ6Kq2uhHQ5RPRqm.ECwLkmPW1UKz7J6E(byteArrayOutputStream, 0L, 4);
                        length = bArr5.length;
                    }
                    size += (long) length;
                }
                for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                    byteArrayOutputStream.write((byte[]) arrayList2.get(i16));
                }
            } catch (Throwable th9) {
                try {
                    byteArrayOutputStream2.close();
                    throw th9;
                } catch (Throwable th10) {
                    th9.addSuppressed(th10);
                    throw th9;
                }
            }
        } else {
            byte[] bArr6 = gA5gCwTK0qjTIn.JXn4Qf7zpnLjP5;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] bArrD5P1xCAyuvgF2 = D5P1xCAyuvgF(svaRwOgSe9xmOsArr, bArr6);
                SbxdZ6Kq2uhHQ5RPRqm.ECwLkmPW1UKz7J6E(byteArrayOutputStream, svaRwOgSe9xmOsArr.length, 1);
                SbxdZ6Kq2uhHQ5RPRqm.ECwLkmPW1UKz7J6E(byteArrayOutputStream, bArrD5P1xCAyuvgF2.length, 4);
                byte[] bArrD5P1xCAyuvgF3 = SbxdZ6Kq2uhHQ5RPRqm.D5P1xCAyuvgF(bArrD5P1xCAyuvgF2);
                SbxdZ6Kq2uhHQ5RPRqm.ECwLkmPW1UKz7J6E(byteArrayOutputStream, bArrD5P1xCAyuvgF3.length, 4);
                byteArrayOutputStream.write(bArrD5P1xCAyuvgF3);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                SbxdZ6Kq2uhHQ5RPRqm.ECwLkmPW1UKz7J6E(byteArrayOutputStream, svaRwOgSe9xmOsArr.length, 1);
                for (SvaRwOgSe9xmOs svaRwOgSe9xmOs4 : svaRwOgSe9xmOsArr) {
                    int size2 = svaRwOgSe9xmOs4.pyu8ovAipBTLYAiKab.size() * 4;
                    String strNQilHWaqS401ZtR2 = nQilHWaqS401ZtR(svaRwOgSe9xmOs4.dDIMxZXP1V8HdM, svaRwOgSe9xmOs4.w9sT1Swbhx3hs, bArr3);
                    Charset charset2 = StandardCharsets.UTF_8;
                    SbxdZ6Kq2uhHQ5RPRqm.iUQk66nAiXgO35(byteArrayOutputStream, strNQilHWaqS401ZtR2.getBytes(charset2).length);
                    SbxdZ6Kq2uhHQ5RPRqm.iUQk66nAiXgO35(byteArrayOutputStream, svaRwOgSe9xmOs4.b1EoSIRjJHO5.length);
                    SbxdZ6Kq2uhHQ5RPRqm.ECwLkmPW1UKz7J6E(byteArrayOutputStream, size2, 4);
                    SbxdZ6Kq2uhHQ5RPRqm.ECwLkmPW1UKz7J6E(byteArrayOutputStream, svaRwOgSe9xmOs4.vekpFI4d1Nc4fakF, 4);
                    byteArrayOutputStream.write(strNQilHWaqS401ZtR2.getBytes(charset2));
                    Iterator it2 = svaRwOgSe9xmOs4.pyu8ovAipBTLYAiKab.keySet().iterator();
                    while (it2.hasNext()) {
                        SbxdZ6Kq2uhHQ5RPRqm.iUQk66nAiXgO35(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                        SbxdZ6Kq2uhHQ5RPRqm.iUQk66nAiXgO35(byteArrayOutputStream, 0);
                    }
                    for (int i17 : svaRwOgSe9xmOs4.b1EoSIRjJHO5) {
                        SbxdZ6Kq2uhHQ5RPRqm.iUQk66nAiXgO35(byteArrayOutputStream, i17);
                    }
                }
            } else {
                byte[] bArr7 = gA5gCwTK0qjTIn.Ee8d2j4S9Vm5yGuR;
                if (Arrays.equals(bArr, bArr7)) {
                    byte[] bArrD5P1xCAyuvgF4 = D5P1xCAyuvgF(svaRwOgSe9xmOsArr, bArr7);
                    SbxdZ6Kq2uhHQ5RPRqm.ECwLkmPW1UKz7J6E(byteArrayOutputStream, svaRwOgSe9xmOsArr.length, 1);
                    SbxdZ6Kq2uhHQ5RPRqm.ECwLkmPW1UKz7J6E(byteArrayOutputStream, bArrD5P1xCAyuvgF4.length, 4);
                    byte[] bArrD5P1xCAyuvgF5 = SbxdZ6Kq2uhHQ5RPRqm.D5P1xCAyuvgF(bArrD5P1xCAyuvgF4);
                    SbxdZ6Kq2uhHQ5RPRqm.ECwLkmPW1UKz7J6E(byteArrayOutputStream, bArrD5P1xCAyuvgF5.length, 4);
                    byteArrayOutputStream.write(bArrD5P1xCAyuvgF5);
                    return true;
                }
                if (!Arrays.equals(bArr, bArr2)) {
                    return false;
                }
                SbxdZ6Kq2uhHQ5RPRqm.iUQk66nAiXgO35(byteArrayOutputStream, svaRwOgSe9xmOsArr.length);
                for (SvaRwOgSe9xmOs svaRwOgSe9xmOs5 : svaRwOgSe9xmOsArr) {
                    String str = svaRwOgSe9xmOs5.dDIMxZXP1V8HdM;
                    TreeMap treeMap = svaRwOgSe9xmOs5.pyu8ovAipBTLYAiKab;
                    String strNQilHWaqS401ZtR3 = nQilHWaqS401ZtR(str, svaRwOgSe9xmOs5.w9sT1Swbhx3hs, bArr2);
                    Charset charset3 = StandardCharsets.UTF_8;
                    SbxdZ6Kq2uhHQ5RPRqm.iUQk66nAiXgO35(byteArrayOutputStream, strNQilHWaqS401ZtR3.getBytes(charset3).length);
                    SbxdZ6Kq2uhHQ5RPRqm.iUQk66nAiXgO35(byteArrayOutputStream, treeMap.size());
                    SbxdZ6Kq2uhHQ5RPRqm.iUQk66nAiXgO35(byteArrayOutputStream, svaRwOgSe9xmOs5.b1EoSIRjJHO5.length);
                    SbxdZ6Kq2uhHQ5RPRqm.ECwLkmPW1UKz7J6E(byteArrayOutputStream, svaRwOgSe9xmOs5.vekpFI4d1Nc4fakF, 4);
                    byteArrayOutputStream.write(strNQilHWaqS401ZtR3.getBytes(charset3));
                    Iterator it3 = treeMap.keySet().iterator();
                    while (it3.hasNext()) {
                        SbxdZ6Kq2uhHQ5RPRqm.iUQk66nAiXgO35(byteArrayOutputStream, ((Integer) it3.next()).intValue());
                    }
                    for (int i18 : svaRwOgSe9xmOs5.b1EoSIRjJHO5) {
                        SbxdZ6Kq2uhHQ5RPRqm.iUQk66nAiXgO35(byteArrayOutputStream, i18);
                    }
                }
            }
        }
        return true;
    }

    public static boolean gIIiyi2ddlMDR0(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    public static boolean gmNWMfvn6zlEj(String str, String str2) {
        ?? r1 = 70 - 69;
        if (str.equals(str2)) {
            return r1;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                int i4 = i3 + 1;
                int i5 = (-38) + 78;
                if (i3 != 0 || cCharAt == i5) {
                    if (cCharAt == i5) {
                        i2++;
                    } else if (cCharAt != ')' || (i2 = i2 - 1) != 0 || i3 == str.length() - r1) {
                    }
                    i++;
                    i3 = i4;
                }
            }
            if (i2 == 0) {
                return okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(KgSM0TsKUpCiuePB.uW0IRoPBZMj2QmBkkp(str.substring(r1, str.length() - r1)).toString(), str2);
            }
        }
        return false;
    }

    public static void hV4VTKNUdeHN(ByteArrayOutputStream byteArrayOutputStream, SvaRwOgSe9xmOs svaRwOgSe9xmOs) throws IOException {
        byte[] bArr = new byte[(((svaRwOgSe9xmOs.ibVTtJUNfrGYbW * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : svaRwOgSe9xmOs.pyu8ovAipBTLYAiKab.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i = iIntValue / 8;
                bArr[i] = (byte) (bArr[i] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i2 = iIntValue + svaRwOgSe9xmOs.ibVTtJUNfrGYbW;
                int i3 = i2 / 8;
                bArr[i3] = (byte) ((1 << (i2 % 8)) | bArr[i3]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v2, types: [char, int] */
    public static final bIQtXpTQsEoGIf25Z hjneShqpF9Tis4(Context context, eDfRIe8Yxow8 edfrie8yxow8) {
        p2UvnVFEiQ1v8XEou p2uvnvfeiq1v8xeou;
        String strSubstring;
        boolean zContainsKey;
        int i;
        ExecutorService executorService = (ExecutorService) edfrie8yxow8.Ee8d2j4S9Vm5yGuR;
        fUH025aw0Rgl fuh025aw0rgl = new fUH025aw0Rgl();
        fuh025aw0rgl.vekpFI4d1Nc4fakF = new Handler(Looper.getMainLooper());
        fuh025aw0rgl.JXn4Qf7zpnLjP5 = new Qxq4OCIomL3rf7RSR(1, fuh025aw0rgl);
        NTq6GnI9WZIP8Nuz nTq6GnI9WZIP8Nuz = new NTq6GnI9WZIP8Nuz(executorService);
        fuh025aw0rgl.dDIMxZXP1V8HdM = nTq6GnI9WZIP8Nuz;
        fuh025aw0rgl.w9sT1Swbhx3hs = new rPTA1zWZR3GTVlGPw(nTq6GnI9WZIP8Nuz);
        Context applicationContext = context.getApplicationContext();
        NTq6GnI9WZIP8Nuz nTq6GnI9WZIP8Nuz2 = (NTq6GnI9WZIP8Nuz) fuh025aw0rgl.dDIMxZXP1V8HdM;
        fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6l = (fEyMFFyOOvHURJ7To6L) edfrie8yxow8.xDyLpEZyrcKVe0;
        int i2 = 11;
        if (context.getResources().getBoolean(2130837507)) {
            p2uvnvfeiq1v8xeou = new p2UvnVFEiQ1v8XEou(applicationContext, null);
            p2uvnvfeiq1v8xeou.pyu8ovAipBTLYAiKab = true;
        } else {
            if (BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea("androidx.work.workdb")) {
                throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
            }
            p2UvnVFEiQ1v8XEou p2uvnvfeiq1v8xeou2 = new p2UvnVFEiQ1v8XEou(applicationContext, "androidx.work.workdb");
            p2uvnvfeiq1v8xeou2.b1EoSIRjJHO5 = new rA0nQJPukyMi(i2, applicationContext);
            p2uvnvfeiq1v8xeou = p2uvnvfeiq1v8xeou2;
        }
        p2uvnvfeiq1v8xeou.xDyLpEZyrcKVe0 = nTq6GnI9WZIP8Nuz2;
        cfMxtqMAcYzBzliR cfmxtqmacyzbzlir = new cfMxtqMAcYzBzliR(feymffyoovhurj7to6l);
        ArrayList arrayList = p2uvnvfeiq1v8xeou.vekpFI4d1Nc4fakF;
        arrayList.add(cfmxtqmacyzbzlir);
        p2uvnvfeiq1v8xeou.dDIMxZXP1V8HdM(tkTEvUX7a8z4uCBlH0D.b1EoSIRjJHO5);
        p2uvnvfeiq1v8xeou.dDIMxZXP1V8HdM(new JnkZJex0SMuKJxcADTQo(applicationContext, 2, 3));
        p2uvnvfeiq1v8xeou.dDIMxZXP1V8HdM(tkTEvUX7a8z4uCBlH0D.pyu8ovAipBTLYAiKab);
        p2uvnvfeiq1v8xeou.dDIMxZXP1V8HdM(tkTEvUX7a8z4uCBlH0D.D5P1xCAyuvgF);
        p2uvnvfeiq1v8xeou.dDIMxZXP1V8HdM(new JnkZJex0SMuKJxcADTQo(applicationContext, 5, 6));
        p2uvnvfeiq1v8xeou.dDIMxZXP1V8HdM(tkTEvUX7a8z4uCBlH0D.hjneShqpF9Tis4);
        p2uvnvfeiq1v8xeou.dDIMxZXP1V8HdM(tkTEvUX7a8z4uCBlH0D.gmNWMfvn6zlEj);
        p2uvnvfeiq1v8xeou.dDIMxZXP1V8HdM(tkTEvUX7a8z4uCBlH0D.gIIiyi2ddlMDR0);
        p2uvnvfeiq1v8xeou.dDIMxZXP1V8HdM(new JnkZJex0SMuKJxcADTQo(applicationContext));
        p2uvnvfeiq1v8xeou.dDIMxZXP1V8HdM(new JnkZJex0SMuKJxcADTQo(applicationContext, 10, 11));
        p2uvnvfeiq1v8xeou.dDIMxZXP1V8HdM(tkTEvUX7a8z4uCBlH0D.JXn4Qf7zpnLjP5);
        p2uvnvfeiq1v8xeou.dDIMxZXP1V8HdM(tkTEvUX7a8z4uCBlH0D.Ee8d2j4S9Vm5yGuR);
        p2uvnvfeiq1v8xeou.dDIMxZXP1V8HdM(tkTEvUX7a8z4uCBlH0D.xDyLpEZyrcKVe0);
        p2uvnvfeiq1v8xeou.dDIMxZXP1V8HdM(tkTEvUX7a8z4uCBlH0D.ibVTtJUNfrGYbW);
        p2uvnvfeiq1v8xeou.hjneShqpF9Tis4 = false;
        p2uvnvfeiq1v8xeou.gmNWMfvn6zlEj = true;
        Executor executor = p2uvnvfeiq1v8xeou.xDyLpEZyrcKVe0;
        if (executor == null && p2uvnvfeiq1v8xeou.ibVTtJUNfrGYbW == null) {
            UE6365QWSHVg5Fff uE6365QWSHVg5Fff = uV1d27nePzvpefeE.gmNWMfvn6zlEj;
            p2uvnvfeiq1v8xeou.ibVTtJUNfrGYbW = uE6365QWSHVg5Fff;
            p2uvnvfeiq1v8xeou.xDyLpEZyrcKVe0 = uE6365QWSHVg5Fff;
        } else if (executor != null && p2uvnvfeiq1v8xeou.ibVTtJUNfrGYbW == null) {
            p2uvnvfeiq1v8xeou.ibVTtJUNfrGYbW = executor;
        } else if (executor == null) {
            p2uvnvfeiq1v8xeou.xDyLpEZyrcKVe0 = p2uvnvfeiq1v8xeou.ibVTtJUNfrGYbW;
        }
        HashSet hashSet = p2uvnvfeiq1v8xeou.nQilHWaqS401ZtR;
        LinkedHashSet linkedHashSet = p2uvnvfeiq1v8xeou.Qrz92kRPw4GcghAc;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (linkedHashSet.contains(Integer.valueOf(iIntValue))) {
                    throw new IllegalArgumentException(Y9mRyRdkl5FOcwb66V6.xDyLpEZyrcKVe0("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ", iIntValue).toString());
                }
            }
        }
        TbaRGxkAafT5 w6dfON4KdcdxlH = p2uvnvfeiq1v8xeou.b1EoSIRjJHO5;
        if (w6dfON4KdcdxlH == null) {
            w6dfON4KdcdxlH = new W6dfON4KdcdxlH(12);
        }
        TbaRGxkAafT5 tbaRGxkAafT5 = w6dfON4KdcdxlH;
        if (p2uvnvfeiq1v8xeou.gIIiyi2ddlMDR0 > 0) {
            if (p2uvnvfeiq1v8xeou.w9sT1Swbhx3hs != null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
        }
        boolean z = p2uvnvfeiq1v8xeou.pyu8ovAipBTLYAiKab;
        int i3 = p2uvnvfeiq1v8xeou.D5P1xCAyuvgF;
        if (i3 == 0) {
            throw null;
        }
        Context context2 = p2uvnvfeiq1v8xeou.dDIMxZXP1V8HdM;
        int i4 = i3 != 1 ? i3 : !((ActivityManager) context2.getSystemService("activity")).isLowRamDevice() ? 3 : 2;
        Executor executor2 = p2uvnvfeiq1v8xeou.xDyLpEZyrcKVe0;
        if (executor2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Executor executor3 = p2uvnvfeiq1v8xeou.ibVTtJUNfrGYbW;
        if (executor3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        boolean z2 = p2uvnvfeiq1v8xeou.hjneShqpF9Tis4;
        boolean z3 = p2uvnvfeiq1v8xeou.gmNWMfvn6zlEj;
        String str = p2uvnvfeiq1v8xeou.w9sT1Swbhx3hs;
        r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c = p2uvnvfeiq1v8xeou.wotphlvK9sPbXJ;
        ArrayList arrayList2 = p2uvnvfeiq1v8xeou.JXn4Qf7zpnLjP5;
        ArrayList arrayList3 = p2uvnvfeiq1v8xeou.Ee8d2j4S9Vm5yGuR;
        cEBaU8QnH2devCCLv3V cebau8qnh2devcclv3v = new cEBaU8QnH2devCCLv3V(context2, str, tbaRGxkAafT5, r5xeufod5gsccwq6c, arrayList, z, i4, executor2, executor3, z2, z3, linkedHashSet, arrayList2, arrayList3);
        String name = WorkDatabase.class.getPackage().getName();
        String canonicalName = WorkDatabase.class.getCanonicalName();
        if (name.length() != 0) {
            strSubstring = canonicalName;
            strSubstring = canonicalName.substring(name.length() + 1);
        }
        strSubstring = canonicalName;
        ?? r15 = (-3) + 49;
        String strConcat = strSubstring.replace((char) r15, '_').concat("_Impl");
        try {
            WorkDatabase workDatabase = (WorkDatabase) Class.forName(name.length() == 0 ? strConcat : name + ((char) r15) + strConcat, true, WorkDatabase.class.getClassLoader()).newInstance();
            W3MG38bRt8NhVbCQ w3MG38bRt8NhVbCQ = workDatabase.JXn4Qf7zpnLjP5;
            LinkedHashMap linkedHashMap = workDatabase.ibVTtJUNfrGYbW;
            workDatabase.vekpFI4d1Nc4fakF = workDatabase.Ee8d2j4S9Vm5yGuR(cebau8qnh2devcclv3v);
            Set<Class> setB1EoSIRjJHO5 = workDatabase.b1EoSIRjJHO5();
            BitSet bitSet = new BitSet();
            for (Class cls : setB1EoSIRjJHO5) {
                int size = arrayList3.size() - 1;
                if (size < 0) {
                    i = -1;
                    break;
                }
                while (true) {
                    i = size;
                    size = i - 1;
                    if (cls.isAssignableFrom(arrayList3.get(i).getClass())) {
                        bitSet.set(i);
                        break;
                    }
                    if (size < 0) {
                        i = -1;
                        break;
                    }
                }
                if (i < 0) {
                    throw new IllegalArgumentException(("A required auto migration spec (" + cls.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
                linkedHashMap.put(cls, arrayList3.get(i));
            }
            int size2 = arrayList3.size() - 1;
            if (size2 >= 0) {
                while (true) {
                    int i5 = size2 - 1;
                    if (!bitSet.get(size2)) {
                        throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                    }
                    if (i5 < 0) {
                        break;
                    }
                    size2 = i5;
                }
            }
            for (G3FkI4yU8rMPR g3FkI4yU8rMPR : workDatabase.ibVTtJUNfrGYbW()) {
                int i6 = g3FkI4yU8rMPR.dDIMxZXP1V8HdM;
                int i7 = g3FkI4yU8rMPR.w9sT1Swbhx3hs;
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF;
                if (linkedHashMap2.containsKey(Integer.valueOf(i6))) {
                    Map map = (Map) linkedHashMap2.get(Integer.valueOf(i6));
                    if (map == null) {
                        map = jB7suWpUqheaHlr52SG.w9sT1Swbhx3hs;
                    }
                    zContainsKey = map.containsKey(Integer.valueOf(i7));
                } else {
                    zContainsKey = false;
                }
                if (!zContainsKey) {
                    r5xeufod5gsccwq6c.w9sT1Swbhx3hs(g3FkI4yU8rMPR);
                }
            }
            z4xRvJ1RJf5JDR z4xrvj1rjf5jdr = workDatabase.vekpFI4d1Nc4fakF;
            if (z4xrvj1rjf5jdr == null) {
                z4xrvj1rjf5jdr = null;
            }
            z4xRvJ1RJf5JDR z4xrvj1rjf5jdr2 = workDatabase.vekpFI4d1Nc4fakF;
            if (z4xrvj1rjf5jdr2 == null) {
                z4xrvj1rjf5jdr2 = null;
            }
            boolean z4 = cebau8qnh2devcclv3v.ibVTtJUNfrGYbW == 3;
            z4xRvJ1RJf5JDR z4xrvj1rjf5jdr3 = workDatabase.vekpFI4d1Nc4fakF;
            if (z4xrvj1rjf5jdr3 == null) {
                z4xrvj1rjf5jdr3 = null;
            }
            z4xrvj1rjf5jdr3.setWriteAheadLoggingEnabled(z4);
            workDatabase.xDyLpEZyrcKVe0 = cebau8qnh2devcclv3v.Ee8d2j4S9Vm5yGuR;
            workDatabase.w9sT1Swbhx3hs = cebau8qnh2devcclv3v.b1EoSIRjJHO5;
            new ArrayDeque();
            workDatabase.Ee8d2j4S9Vm5yGuR = cebau8qnh2devcclv3v.xDyLpEZyrcKVe0;
            Map mapPyu8ovAipBTLYAiKab = workDatabase.pyu8ovAipBTLYAiKab();
            BitSet bitSet2 = new BitSet();
            for (Map.Entry entry : mapPyu8ovAipBTLYAiKab.entrySet()) {
                Class cls2 = (Class) entry.getKey();
                for (Class cls3 : (List) entry.getValue()) {
                    int size3 = arrayList2.size() - 1;
                    if (size3 < 0) {
                        size3 = -1;
                        break;
                    }
                    while (true) {
                        int i8 = size3 - 1;
                        if (cls3.isAssignableFrom(arrayList2.get(size3).getClass())) {
                            bitSet2.set(size3);
                            break;
                        }
                        if (i8 < 0) {
                            size3 = -1;
                            break;
                        }
                        size3 = i8;
                    }
                    if (!(size3 >= 0)) {
                        throw new IllegalArgumentException(("A required type converter (" + cls3 + ") for " + cls2.getCanonicalName() + " is missing in the database configuration.").toString());
                    }
                    workDatabase.D5P1xCAyuvgF.put(cls3, arrayList2.get(size3));
                }
            }
            int size4 = arrayList2.size() - 1;
            if (size4 >= 0) {
                while (true) {
                    int i9 = size4 - 1;
                    if (!bitSet2.get(size4)) {
                        throw new IllegalArgumentException("Unexpected type converter " + arrayList2.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                    if (i9 >= 0) {
                        size4 = i9;
                    }
                }
            }
            Context applicationContext2 = context.getApplicationContext();
            lnZAzok3Cgjp5b lnzazok3cgjp5b = new lnZAzok3Cgjp5b(applicationContext2.getApplicationContext(), fuh025aw0rgl, 0);
            lnZAzok3Cgjp5b lnzazok3cgjp5b2 = new lnZAzok3Cgjp5b(applicationContext2.getApplicationContext(), fuh025aw0rgl, 1);
            Context applicationContext3 = applicationContext2.getApplicationContext();
            int i10 = PoVDiNYMKgNfF.dDIMxZXP1V8HdM;
            GHV5q6ADozYUUx gHV5q6ADozYUUx = new GHV5q6ADozYUUx(applicationContext3, fuh025aw0rgl);
            int i11 = (-83) + 85;
            lnZAzok3Cgjp5b lnzazok3cgjp5b3 = new lnZAzok3Cgjp5b(applicationContext2.getApplicationContext(), fuh025aw0rgl, i11);
            mYrXZiFjFW2Xg myrxzifjfw2xg = new mYrXZiFjFW2Xg();
            myrxzifjfw2xg.w9sT1Swbhx3hs = lnzazok3cgjp5b;
            myrxzifjfw2xg.vekpFI4d1Nc4fakF = lnzazok3cgjp5b2;
            myrxzifjfw2xg.JXn4Qf7zpnLjP5 = gHV5q6ADozYUUx;
            myrxzifjfw2xg.Ee8d2j4S9Vm5yGuR = lnzazok3cgjp5b3;
            DP5sXJhndWh8c4VkCzdA dP5sXJhndWh8c4VkCzdA = new DP5sXJhndWh8c4VkCzdA(context.getApplicationContext(), edfrie8yxow8, fuh025aw0rgl, workDatabase);
            int i12 = Qbw3oj5SB4rmsG0k8.dDIMxZXP1V8HdM;
            csZnheAmFN7UO csznheamfn7uo = new csZnheAmFN7UO(context, workDatabase, edfrie8yxow8);
            ?? r12 = (-77) + 78;
            ppGAzznNjZ5j6h.dDIMxZXP1V8HdM(context, SystemJobService.class, r12);
            fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
            IYOSYKlnoVjmlQQ6i iYOSYKlnoVjmlQQ6i = new IYOSYKlnoVjmlQQ6i(context, edfrie8yxow8, myrxzifjfw2xg, dP5sXJhndWh8c4VkCzdA, new Hnsrhf2jJV8dCt(dP5sXJhndWh8c4VkCzdA, fuh025aw0rgl), fuh025aw0rgl);
            IaJdiuw5vdcTDn7[] iaJdiuw5vdcTDn7Arr = new IaJdiuw5vdcTDn7[i11];
            iaJdiuw5vdcTDn7Arr[0] = csznheamfn7uo;
            iaJdiuw5vdcTDn7Arr[r12] = iYOSYKlnoVjmlQQ6i;
            return new bIQtXpTQsEoGIf25Z(context.getApplicationContext(), edfrie8yxow8, fuh025aw0rgl, workDatabase, Aqh0grSwgDbwr.yTljMGnIibTRdOpSh4(iaJdiuw5vdcTDn7Arr), dP5sXJhndWh8c4VkCzdA, myrxzifjfw2xg);
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + WorkDatabase.class.getCanonicalName() + ". " + strConcat + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + WorkDatabase.class + ".canonicalName");
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + WorkDatabase.class + ".canonicalName");
        }
    }

    public static final YudW7JNC7tJhZ iUQk66nAiXgO35(b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q, cpTq2XMCb5JSaEhn cptq2xmcb5jsaehn, Object obj) {
        YudW7JNC7tJhZ yudW7JNC7tJhZ = null;
        if ((b9xroaxfr1fmoo2q instanceof ldRXVAtAYtfEIpl) && cptq2xmcb5jsaehn.D5P1xCAyuvgF(xTp7AWKejEh5.w9sT1Swbhx3hs) != null) {
            ldRXVAtAYtfEIpl ldrxvataytfeiplEe8d2j4S9Vm5yGuR = (ldRXVAtAYtfEIpl) b9xroaxfr1fmoo2q;
            while (!(ldrxvataytfeiplEe8d2j4S9Vm5yGuR instanceof goHawlkqf1iP) && (ldrxvataytfeiplEe8d2j4S9Vm5yGuR = ldrxvataytfeiplEe8d2j4S9Vm5yGuR.Ee8d2j4S9Vm5yGuR()) != null) {
                if (ldrxvataytfeiplEe8d2j4S9Vm5yGuR instanceof YudW7JNC7tJhZ) {
                    yudW7JNC7tJhZ = (YudW7JNC7tJhZ) ldrxvataytfeiplEe8d2j4S9Vm5yGuR;
                    break;
                }
            }
            if (yudW7JNC7tJhZ != null) {
                yudW7JNC7tJhZ.JW3Lh9hxwLsO2ArTlH(cptq2xmcb5jsaehn, obj);
            }
        }
        return yudW7JNC7tJhZ;
    }

    public static long ibVTtJUNfrGYbW(long j, long j2, long j3) {
        if (j2 <= j3) {
            if (j < j2) {
                return j2;
            }
            return j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + '.');
    }

    public static void k84rwRrqzhrNQ1CdNQ9(ByteArrayOutputStream byteArrayOutputStream, SvaRwOgSe9xmOs svaRwOgSe9xmOs) throws IOException {
        int i = 0;
        for (Map.Entry entry : svaRwOgSe9xmOs.pyu8ovAipBTLYAiKab.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                SbxdZ6Kq2uhHQ5RPRqm.iUQk66nAiXgO35(byteArrayOutputStream, iIntValue - i);
                SbxdZ6Kq2uhHQ5RPRqm.iUQk66nAiXgO35(byteArrayOutputStream, 0);
                i = iIntValue;
            }
        }
    }

    public static int l1V0lQr6TbwNKqHfXNbb(VUjeMiNYIJhgmVJopga vUjeMiNYIJhgmVJopga) {
        l1V0lQr6TbwNKqHfXNbb l1v0lqr6tbwnkqhfxnbb = lMJPWn8FzeWU82pNUhWl.w9sT1Swbhx3hs;
        try {
            int i = vUjeMiNYIJhgmVJopga.w9sT1Swbhx3hs;
            if (vUjeMiNYIJhgmVJopga.isEmpty()) {
                throw new IllegalArgumentException("Cannot get random in empty range: " + vUjeMiNYIJhgmVJopga);
            }
            int i2 = vUjeMiNYIJhgmVJopga.vekpFI4d1Nc4fakF;
            if (i2 < Integer.MAX_VALUE) {
                return lMJPWn8FzeWU82pNUhWl.w9sT1Swbhx3hs.vekpFI4d1Nc4fakF(i, i2 + 1);
            }
            if (i <= Integer.MIN_VALUE) {
                return lMJPWn8FzeWU82pNUhWl.w9sT1Swbhx3hs.w9sT1Swbhx3hs();
            }
            return lMJPWn8FzeWU82pNUhWl.w9sT1Swbhx3hs.vekpFI4d1Nc4fakF(i - 1, i2) + 1;
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public static String nQilHWaqS401ZtR(String str, String str2, byte[] bArr) {
        byte[] bArr2 = gA5gCwTK0qjTIn.xDyLpEZyrcKVe0;
        byte[] bArr3 = gA5gCwTK0qjTIn.ibVTtJUNfrGYbW;
        Object obj = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                return Y9mRyRdkl5FOcwb66V6.D5P1xCAyuvgF(sb, (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    private static /* synthetic */ void odlgplkxqy() {
    }

    public static FVxyDmZ6Vklq5C pyu8ovAipBTLYAiKab(String str, String str2) {
        A8Ma74sVrwIpGnRFB9 a8Ma74sVrwIpGnRFB9 = new A8Ma74sVrwIpGnRFB9(str, str2);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(QwPxr2jx1iGLmehgkv3g.dDIMxZXP1V8HdM(A8Ma74sVrwIpGnRFB9.class));
        return new FVxyDmZ6Vklq5C(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new rA0nQJPukyMi(1, a8Ma74sVrwIpGnRFB9), hashSet3);
    }

    public static SvaRwOgSe9xmOs[] rCHnHJBAlOpNI5(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, gA5gCwTK0qjTIn.JXn4Qf7zpnLjP5)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iYTljMGnIibTRdOpSh4 = (int) SbxdZ6Kq2uhHQ5RPRqm.yTljMGnIibTRdOpSh4(fileInputStream, 1);
        byte[] bArrEWUjsTERgdPbSw3NNlN = SbxdZ6Kq2uhHQ5RPRqm.EWUjsTERgdPbSw3NNlN(fileInputStream, (int) SbxdZ6Kq2uhHQ5RPRqm.yTljMGnIibTRdOpSh4(fileInputStream, 4), (int) SbxdZ6Kq2uhHQ5RPRqm.yTljMGnIibTRdOpSh4(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrEWUjsTERgdPbSw3NNlN);
        try {
            SvaRwOgSe9xmOs[] svaRwOgSe9xmOsArrO2DHNSIGZlgPja7eqLgn = O2DHNSIGZlgPja7eqLgn(byteArrayInputStream, str, iYTljMGnIibTRdOpSh4);
            byteArrayInputStream.close();
            return svaRwOgSe9xmOsArrO2DHNSIGZlgPja7eqLgn;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static dPxH1qsKC2Lxf7PHXDZT tne6mXOUFKdd(VUjeMiNYIJhgmVJopga vUjeMiNYIJhgmVJopga, int i) {
        boolean z = i > 0;
        Integer numValueOf = Integer.valueOf(i);
        if (!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
        }
        int i2 = vUjeMiNYIJhgmVJopga.w9sT1Swbhx3hs;
        int i3 = vUjeMiNYIJhgmVJopga.vekpFI4d1Nc4fakF;
        if (vUjeMiNYIJhgmVJopga.JXn4Qf7zpnLjP5 <= 0) {
            i = -i;
        }
        return new dPxH1qsKC2Lxf7PHXDZT(i2, i3, i);
    }

    public static SvaRwOgSe9xmOs[] vIJudZvPyTuNp(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, SvaRwOgSe9xmOs[] svaRwOgSe9xmOsArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new SvaRwOgSe9xmOs[0];
        }
        if (i != svaRwOgSe9xmOsArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i2 = 0; i2 < i; i2++) {
            SbxdZ6Kq2uhHQ5RPRqm.yTljMGnIibTRdOpSh4(byteArrayInputStream, 2);
            String str = new String(SbxdZ6Kq2uhHQ5RPRqm.dTS0S7eC32ubQH54j36(byteArrayInputStream, (int) SbxdZ6Kq2uhHQ5RPRqm.yTljMGnIibTRdOpSh4(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jYTljMGnIibTRdOpSh4 = SbxdZ6Kq2uhHQ5RPRqm.yTljMGnIibTRdOpSh4(byteArrayInputStream, 4);
            int iYTljMGnIibTRdOpSh4 = (int) SbxdZ6Kq2uhHQ5RPRqm.yTljMGnIibTRdOpSh4(byteArrayInputStream, 2);
            SvaRwOgSe9xmOs svaRwOgSe9xmOs = null;
            if (svaRwOgSe9xmOsArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i3 = 0; i3 < svaRwOgSe9xmOsArr.length; i3++) {
                    if (svaRwOgSe9xmOsArr[i3].w9sT1Swbhx3hs.equals(strSubstring)) {
                        svaRwOgSe9xmOs = svaRwOgSe9xmOsArr[i3];
                        break;
                    }
                }
            }
            if (svaRwOgSe9xmOs == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            svaRwOgSe9xmOs.JXn4Qf7zpnLjP5 = jYTljMGnIibTRdOpSh4;
            int[] iArrDTS0S7eC32ubQH54j36 = dTS0S7eC32ubQH54j36(byteArrayInputStream, iYTljMGnIibTRdOpSh4);
            if (Arrays.equals(bArr, gA5gCwTK0qjTIn.ibVTtJUNfrGYbW)) {
                svaRwOgSe9xmOs.Ee8d2j4S9Vm5yGuR = iYTljMGnIibTRdOpSh4;
                svaRwOgSe9xmOs.b1EoSIRjJHO5 = iArrDTS0S7eC32ubQH54j36;
            }
        }
        return svaRwOgSe9xmOsArr;
    }

    public static final void vekpFI4d1Nc4fakF(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    public static void w9sT1Swbhx3hs(Object obj, StringBuilder sb) {
        int iLastIndexOf;
        if (obj == null) {
            sb.append("null");
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(iLastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    public static final cpTq2XMCb5JSaEhn wotphlvK9sPbXJ(cpTq2XMCb5JSaEhn cptq2xmcb5jsaehn, cpTq2XMCb5JSaEhn cptq2xmcb5jsaehn2, boolean z) {
        Boolean bool = Boolean.FALSE;
        FSwSEr9VdwZSt232c7Cj fSwSEr9VdwZSt232c7Cj = FSwSEr9VdwZSt232c7Cj.ibVTtJUNfrGYbW;
        boolean zBooleanValue = ((Boolean) cptq2xmcb5jsaehn.Qrz92kRPw4GcghAc(bool, fSwSEr9VdwZSt232c7Cj)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) cptq2xmcb5jsaehn2.Qrz92kRPw4GcghAc(bool, fSwSEr9VdwZSt232c7Cj)).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return cptq2xmcb5jsaehn.EWUjsTERgdPbSw3NNlN(cptq2xmcb5jsaehn2);
        }
        FSwSEr9VdwZSt232c7Cj fSwSEr9VdwZSt232c7Cj2 = new FSwSEr9VdwZSt232c7Cj(2, 7);
        sNACkioAJERo snackioajero = sNACkioAJERo.w9sT1Swbhx3hs;
        cpTq2XMCb5JSaEhn cptq2xmcb5jsaehn3 = (cpTq2XMCb5JSaEhn) cptq2xmcb5jsaehn.Qrz92kRPw4GcghAc(snackioajero, fSwSEr9VdwZSt232c7Cj2);
        Object objQrz92kRPw4GcghAc = cptq2xmcb5jsaehn2;
        if (zBooleanValue2) {
            objQrz92kRPw4GcghAc = cptq2xmcb5jsaehn2.Qrz92kRPw4GcghAc(snackioajero, FSwSEr9VdwZSt232c7Cj.xDyLpEZyrcKVe0);
        }
        return cptq2xmcb5jsaehn3.EWUjsTERgdPbSw3NNlN((cpTq2XMCb5JSaEhn) objQrz92kRPw4GcghAc);
    }

    public static int xDyLpEZyrcKVe0(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i < i2) {
                return i2;
            }
            return i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static final Object xfn2GJwmGqs7kWW(Ndz86LBW9Rzz ndz86LBW9Rzz, Ndz86LBW9Rzz ndz86LBW9Rzz2, NhN5GSKLYh6STld4 nhN5GSKLYh6STld4) throws Throwable {
        Object jQrj25Jykd1wBwb;
        Object objHV4VTKNUdeHN;
        kZrG9UUAjHVzkL6Wn kzrg9uuajhvzkl6wn;
        try {
            FZ1sl4mHq4J0hOEYC.JXn4Qf7zpnLjP5((-90) + 92, nhN5GSKLYh6STld4);
            jQrj25Jykd1wBwb = nhN5GSKLYh6STld4.b1EoSIRjJHO5(ndz86LBW9Rzz2, ndz86LBW9Rzz);
        } catch (Throwable th) {
            jQrj25Jykd1wBwb = new JQrj25Jykd1wBwb(th, false);
        }
        pjN1L01KDMWnPCy0daD pjn1l01kdmwnpcy0dad = pjN1L01KDMWnPCy0daD.w9sT1Swbhx3hs;
        if (jQrj25Jykd1wBwb == pjn1l01kdmwnpcy0dad || (objHV4VTKNUdeHN = ndz86LBW9Rzz.hV4VTKNUdeHN(jQrj25Jykd1wBwb)) == jb8et6SZeK5TWMrJFxDX.vekpFI4d1Nc4fakF) {
            return pjn1l01kdmwnpcy0dad;
        }
        if (objHV4VTKNUdeHN instanceof JQrj25Jykd1wBwb) {
            throw ((JQrj25Jykd1wBwb) objHV4VTKNUdeHN).dDIMxZXP1V8HdM;
        }
        DI9mjYyYGHOmxGOw dI9mjYyYGHOmxGOw = objHV4VTKNUdeHN instanceof DI9mjYyYGHOmxGOw ? (DI9mjYyYGHOmxGOw) objHV4VTKNUdeHN : null;
        return (dI9mjYyYGHOmxGOw == null || (kzrg9uuajhvzkl6wn = dI9mjYyYGHOmxGOw.dDIMxZXP1V8HdM) == null) ? objHV4VTKNUdeHN : kzrg9uuajhvzkl6wn;
    }

    public static SvaRwOgSe9xmOs[] yTljMGnIibTRdOpSh4(ByteArrayInputStream byteArrayInputStream, int i, SvaRwOgSe9xmOs[] svaRwOgSe9xmOsArr) {
        if (byteArrayInputStream.available() == 0) {
            return new SvaRwOgSe9xmOs[0];
        }
        if (i != svaRwOgSe9xmOsArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iYTljMGnIibTRdOpSh4 = (int) SbxdZ6Kq2uhHQ5RPRqm.yTljMGnIibTRdOpSh4(byteArrayInputStream, 2);
            iArr[i2] = (int) SbxdZ6Kq2uhHQ5RPRqm.yTljMGnIibTRdOpSh4(byteArrayInputStream, 2);
            strArr[i2] = new String(SbxdZ6Kq2uhHQ5RPRqm.dTS0S7eC32ubQH54j36(byteArrayInputStream, iYTljMGnIibTRdOpSh4), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            SvaRwOgSe9xmOs svaRwOgSe9xmOs = svaRwOgSe9xmOsArr[i3];
            if (!svaRwOgSe9xmOs.w9sT1Swbhx3hs.equals(strArr[i3])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i4 = iArr[i3];
            svaRwOgSe9xmOs.Ee8d2j4S9Vm5yGuR = i4;
            svaRwOgSe9xmOs.b1EoSIRjJHO5 = dTS0S7eC32ubQH54j36(byteArrayInputStream, i4);
        }
        return svaRwOgSe9xmOsArr;
    }

    public abstract boolean H9XlUr4OeMJFiXK();

    public HpS8WYFILXNWmicJ1zE MLSIo1htfMPWeB8V876L(Context context, String str, Bundle bundle) {
        return HpS8WYFILXNWmicJ1zE.Ee8d2j4S9Vm5yGuR(context, str, bundle);
    }

    public abstract View XiR1pIn5878vVWd(int i);
}
