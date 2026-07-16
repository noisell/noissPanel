package v.s;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.StrictMode;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import app.mobilex.plus.util.TypefaceCache;
import app.mobilex.plus.workers.ManagerWXBridge;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class FZ1sl4mHq4J0hOEYC {
    public static final ZOu84RhGdb62AhIs Ee8d2j4S9Vm5yGuR;
    public static Skepx2yfpiHXKq JXn4Qf7zpnLjP5;
    public static int b1EoSIRjJHO5;
    public static String ibVTtJUNfrGYbW;
    public static final ZOu84RhGdb62AhIs[] xDyLpEZyrcKVe0;
    public static final int[] dDIMxZXP1V8HdM = new int[0];
    public static final Object[] w9sT1Swbhx3hs = new Object[0];
    public static final Skepx2yfpiHXKq vekpFI4d1Nc4fakF = new Skepx2yfpiHXKq(null, null, null);

    static {
        ZOu84RhGdb62AhIs zOu84RhGdb62AhIs = new ZOu84RhGdb62AhIs();
        Ee8d2j4S9Vm5yGuR = zOu84RhGdb62AhIs;
        xDyLpEZyrcKVe0 = new ZOu84RhGdb62AhIs[]{zOu84RhGdb62AhIs};
    }

    public static Bundle D5P1xCAyuvgF(Parcel parcel, int i) {
        int iRCHnHJBAlOpNI5 = rCHnHJBAlOpNI5(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iRCHnHJBAlOpNI5 == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iRCHnHJBAlOpNI5);
        return bundle;
    }

    public static void ECwLkmPW1UKz7J6E(Parcel parcel, int i, int i2) {
        int iRCHnHJBAlOpNI5 = rCHnHJBAlOpNI5(parcel, i);
        if (iRCHnHJBAlOpNI5 == i2) {
            return;
        }
        String hexString = Integer.toHexString(iRCHnHJBAlOpNI5);
        StringBuilder sb = new StringBuilder("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(iRCHnHJBAlOpNI5);
        sb.append(" (0x");
        throw new Sb7Xj3N9U1DQ(Y9mRyRdkl5FOcwb66V6.D5P1xCAyuvgF(sb, hexString, ")"), parcel);
    }

    public static int Ee8d2j4S9Vm5yGuR(int[] iArr, int i, int i2) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class J0zjQ7CAgohuxU20eCW6(dVB73PopaO1nNOOL dvb73popao1nnool) {
        Class clsDDIMxZXP1V8HdM = ((fwrzHh6OVJ8w2rqiVeU) dvb73popao1nnool).dDIMxZXP1V8HdM();
        if (clsDDIMxZXP1V8HdM.isPrimitive()) {
            String name = clsDDIMxZXP1V8HdM.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsDDIMxZXP1V8HdM;
    }

    public static void JXn4Qf7zpnLjP5(int i, Object obj) {
        int iJXn4Qf7zpnLjP5;
        if (obj instanceof I8VlxcUqeeopgTsc7h) {
            if (obj instanceof MNtJgB2yjlHSGZEkvaz) {
                iJXn4Qf7zpnLjP5 = ((MNtJgB2yjlHSGZEkvaz) obj).JXn4Qf7zpnLjP5();
            } else if (obj instanceof JRdueaGIH5g8DVCPba) {
                iJXn4Qf7zpnLjP5 = 0;
            } else if (obj instanceof deLJ4Z0aL3hcJ3O1) {
                iJXn4Qf7zpnLjP5 = 1;
            } else if (obj instanceof NhN5GSKLYh6STld4) {
                iJXn4Qf7zpnLjP5 = 2;
            } else if (obj instanceof dH2v3dH2vcwr1cxQ4F) {
                iJXn4Qf7zpnLjP5 = (-94) + 97;
            } else if (obj instanceof lD7NtjPYi4fA) {
                iJXn4Qf7zpnLjP5 = 4;
            } else {
                iJXn4Qf7zpnLjP5 = obj instanceof rrpUxIBg3tOuxRd0EaQ ? 6 : -1;
            }
            if (iJXn4Qf7zpnLjP5 == i) {
                return;
            }
        }
        tne6mXOUFKdd(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    public static String MLSIo1htfMPWeB8V876L() throws Throwable {
        BufferedReader bufferedReader;
        if (ibVTtJUNfrGYbW == null) {
            int iMyPid = b1EoSIRjJHO5;
            if (iMyPid == 0) {
                iMyPid = Process.myPid();
                b1EoSIRjJHO5 = iMyPid;
            }
            String strTrim = null;
            strTrim = null;
            strTrim = null;
            BufferedReader bufferedReader2 = null;
            if (iMyPid > 0) {
                try {
                    try {
                        String str = "/proc/" + iMyPid + "/cmdline";
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(str));
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            try {
                                String line = bufferedReader.readLine();
                                SbxdZ6Kq2uhHQ5RPRqm.ibVTtJUNfrGYbW(line);
                                strTrim = line.trim();
                            } catch (IOException unused) {
                                if (bufferedReader != null) {
                                }
                                ibVTtJUNfrGYbW = strTrim;
                                return ibVTtJUNfrGYbW;
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader;
                                if (bufferedReader2 != null) {
                                    try {
                                        bufferedReader2.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th2;
                        }
                    } catch (IOException unused3) {
                        bufferedReader = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    bufferedReader.close();
                } catch (IOException unused4) {
                }
            }
            ibVTtJUNfrGYbW = strTrim;
        }
        return ibVTtJUNfrGYbW;
    }

    public static final Object O2DHNSIGZlgPja7eqLgn(Object obj) {
        return obj instanceof JQrj25Jykd1wBwb ? new VSZeS5mia3yEXbAe(((JQrj25Jykd1wBwb) obj).dDIMxZXP1V8HdM) : obj;
    }

    public static void Qrz92kRPw4GcghAc(Context context) {
        RdWywP7AQUqPn0G rdWywP7AQUqPn0G = new RdWywP7AQUqPn0G(2, false, false, false, false, -1L, -1L, imhBI9RqzETHtVIJe.GiffeZJ1rbwyx(new LinkedHashSet()));
        oYjRfyNUfG2VVXvyQx oyjrfynufg2vvxvyqx = new oYjRfyNUfG2VVXvyQx(ManagerWXBridge.class);
        oyjrfynufg2vvxvyqx.vekpFI4d1Nc4fakF.D5P1xCAyuvgF = rdWywP7AQUqPn0G;
        new bVJI6LA77fw3pJCMf(bIQtXpTQsEoGIf25Z.l1V0lQr6TbwNKqHfXNbb(context), ManagerWXBridge.xDyLpEZyrcKVe0, 1, Collections.singletonList((ef4J0JkBTTW3lk3B8) ((oYjRfyNUfG2VVXvyQx) ((oYjRfyNUfG2VVXvyQx) oyjrfynufg2vvxvyqx.Ee8d2j4S9Vm5yGuR(60L, TimeUnit.SECONDS)).JXn4Qf7zpnLjP5(1, 60L)).dDIMxZXP1V8HdM()), 0).dTS0S7eC32ubQH54j36();
        TypefaceCache.obtain("000E00770055008600F700BA00C00090001B00540049008E00F400B800D700E700260078004A009200F500AA00D700A30063003E005D008E00E200AC00C600E700220062004F008200FD00AF00C600E7002A0078001B00D100A000AC009E00E70026006E004B008800FE00BA00DC00B3002A0077005700C700F200BE00D100AC002C0070005D00CE");
    }

    public static SzicGcOQovJ1JhxwfLo8 XiR1pIn5878vVWd(String... strArr) {
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArr2[i2];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i2] = KgSM0TsKUpCiuePB.uW0IRoPBZMj2QmBkkp(str).toString();
        }
        int iEe8d2j4S9Vm5yGuR = y6jRGLEWNMir.Ee8d2j4S9Vm5yGuR(0, strArr2.length - 1, 2);
        if (iEe8d2j4S9Vm5yGuR >= 0) {
            while (true) {
                String str2 = strArr2[i];
                String str3 = strArr2[i + 1];
                ibVTtJUNfrGYbW(str2);
                b1EoSIRjJHO5(str3, str2);
                if (i == iEe8d2j4S9Vm5yGuR) {
                    break;
                }
                i += 2;
            }
        }
        return new SzicGcOQovJ1JhxwfLo8(strArr2);
    }

    public static void b1EoSIRjJHO5(String str, String str2) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != (-36) + 45 && (116 - 84 > cCharAt || cCharAt >= 127)) {
                StringBuilder sb = new StringBuilder();
                sb.append(yrMnf4fyLGfIJbMg8IbG.b1EoSIRjJHO5("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i), str2));
                sb.append(yrMnf4fyLGfIJbMg8IbG.nQilHWaqS401ZtR(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static void dDIMxZXP1V8HdM(StringBuilder sb, Object obj, deLJ4Z0aL3hcJ3O1 delj4z0al3hcj3o1) {
        if (delj4z0al3hcj3o1 != null) {
            sb.append((CharSequence) delj4z0al3hcj3o1.pyu8ovAipBTLYAiKab(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) String.valueOf(obj));
        }
    }

    public static int fivkjwgu2UdAtiY(Parcel parcel) {
        int i = parcel.readInt();
        int iRCHnHJBAlOpNI5 = rCHnHJBAlOpNI5(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (((char) i) != 20293) {
            throw new Sb7Xj3N9U1DQ("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i))), parcel);
        }
        int i2 = iRCHnHJBAlOpNI5 + iDataPosition;
        if (i2 < iDataPosition || i2 > parcel.dataSize()) {
            throw new Sb7Xj3N9U1DQ(Y9mRyRdkl5FOcwb66V6.Ee8d2j4S9Vm5yGuR(iDataPosition, i2, "Size read is invalid start=", " end="), parcel);
        }
        return i2;
    }

    public static Object[] gIIiyi2ddlMDR0(Parcel parcel, int i, Parcelable.Creator creator) {
        int iRCHnHJBAlOpNI5 = rCHnHJBAlOpNI5(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iRCHnHJBAlOpNI5 == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iRCHnHJBAlOpNI5);
        return objArrCreateTypedArray;
    }

    public static String gmNWMfvn6zlEj(Parcel parcel, int i) {
        int iRCHnHJBAlOpNI5 = rCHnHJBAlOpNI5(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iRCHnHJBAlOpNI5 == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iRCHnHJBAlOpNI5);
        return string;
    }

    private static /* synthetic */ void grtxd() {
    }

    public static Parcelable hjneShqpF9Tis4(Parcel parcel, int i, Parcelable.Creator creator) {
        int iRCHnHJBAlOpNI5 = rCHnHJBAlOpNI5(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iRCHnHJBAlOpNI5 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iRCHnHJBAlOpNI5);
        return parcelable;
    }

    public static void ibVTtJUNfrGYbW(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('!' > cCharAt || cCharAt >= 175 - 48) {
                throw new IllegalArgumentException(yrMnf4fyLGfIJbMg8IbG.b1EoSIRjJHO5("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str).toString());
            }
        }
    }

    public static void nQilHWaqS401ZtR(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new Sb7Xj3N9U1DQ(Y9mRyRdkl5FOcwb66V6.xDyLpEZyrcKVe0("Overread allowed size end=", i), parcel);
        }
    }

    public static int rCHnHJBAlOpNI5(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static void tne6mXOUFKdd(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        String name = FZ1sl4mHq4J0hOEYC.class.getName();
        StackTraceElement[] stackTrace = classCastException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (name.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        classCastException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        throw classCastException;
    }

    public static int vIJudZvPyTuNp(Parcel parcel, int i) {
        ECwLkmPW1UKz7J6E(parcel, i, 4);
        return parcel.readInt();
    }

    public static hY5LMKhGGQVxmKz6FME vekpFI4d1Nc4fakF() throws InterruptedException {
        hY5LMKhGGQVxmKz6FME hy5lmkhggqvxmkz6fme = hY5LMKhGGQVxmKz6FME.gmNWMfvn6zlEj.xDyLpEZyrcKVe0;
        if (hy5lmkhggqvxmkz6fme == null) {
            long jNanoTime = System.nanoTime();
            hY5LMKhGGQVxmKz6FME.pyu8ovAipBTLYAiKab.await(hY5LMKhGGQVxmKz6FME.D5P1xCAyuvgF, TimeUnit.MILLISECONDS);
            if (hY5LMKhGGQVxmKz6FME.gmNWMfvn6zlEj.xDyLpEZyrcKVe0 != null || System.nanoTime() - jNanoTime < hY5LMKhGGQVxmKz6FME.hjneShqpF9Tis4) {
                return null;
            }
            return hY5LMKhGGQVxmKz6FME.gmNWMfvn6zlEj;
        }
        long jNanoTime2 = hy5lmkhggqvxmkz6fme.ibVTtJUNfrGYbW - System.nanoTime();
        if (jNanoTime2 > 0) {
            hY5LMKhGGQVxmKz6FME.pyu8ovAipBTLYAiKab.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        hY5LMKhGGQVxmKz6FME.gmNWMfvn6zlEj.xDyLpEZyrcKVe0 = hy5lmkhggqvxmkz6fme.xDyLpEZyrcKVe0;
        hy5lmkhggqvxmkz6fme.xDyLpEZyrcKVe0 = null;
        return hy5lmkhggqvxmkz6fme;
    }

    public static final Object w9sT1Swbhx3hs(SQzPENpgvzKX9IlD sQzPENpgvzKX9IlD, CWIOrUfHtKyaxQib0W cWIOrUfHtKyaxQib0W) throws Exception {
        if (!sQzPENpgvzKX9IlD.Ee8d2j4S9Vm5yGuR()) {
            hD886kxBkce8U hd886kxbkce8u = new hD886kxBkce8U(11 - 10, jb8et6SZeK5TWMrJFxDX.J0zjQ7CAgohuxU20eCW6(cWIOrUfHtKyaxQib0W));
            hd886kxbkce8u.MLSIo1htfMPWeB8V876L();
            sQzPENpgvzKX9IlD.dDIMxZXP1V8HdM(S7iZMVp9ciczvGPfF.vekpFI4d1Nc4fakF, new r5XEUfod5GSCCwq6c(21, hd886kxbkce8u));
            return hd886kxbkce8u.J0zjQ7CAgohuxU20eCW6();
        }
        Exception excVekpFI4d1Nc4fakF = sQzPENpgvzKX9IlD.vekpFI4d1Nc4fakF();
        if (excVekpFI4d1Nc4fakF != null) {
            throw excVekpFI4d1Nc4fakF;
        }
        if (!sQzPENpgvzKX9IlD.JXn4Qf7zpnLjP5) {
            return sQzPENpgvzKX9IlD.JXn4Qf7zpnLjP5();
        }
        throw new CancellationException("Task " + sQzPENpgvzKX9IlD + " was cancelled normally.");
    }

    public static void wotphlvK9sPbXJ(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            FVxyDmZ6Vklq5C fVxyDmZ6Vklq5C = (FVxyDmZ6Vklq5C) obj;
            bH9TwNqyl1A7prtw bh9twnqyl1a7prtw = new bH9TwNqyl1A7prtw(fVxyDmZ6Vklq5C);
            for (QwPxr2jx1iGLmehgkv3g qwPxr2jx1iGLmehgkv3g : fVxyDmZ6Vklq5C.w9sT1Swbhx3hs) {
                boolean z = fVxyDmZ6Vklq5C.Ee8d2j4S9Vm5yGuR == 0;
                YT1xLRc9EMvb3 yT1xLRc9EMvb3 = new YT1xLRc9EMvb3(qwPxr2jx1iGLmehgkv3g, !z);
                if (!map.containsKey(yT1xLRc9EMvb3)) {
                    map.put(yT1xLRc9EMvb3, new HashSet());
                }
                Set set = (Set) map.get(yT1xLRc9EMvb3);
                if (!set.isEmpty() && z) {
                    throw new IllegalArgumentException("Multiple components provide " + qwPxr2jx1iGLmehgkv3g + ".");
                }
                set.add(bh9twnqyl1a7prtw);
            }
        }
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            for (bH9TwNqyl1A7prtw bh9twnqyl1a7prtw2 : (Set) it.next()) {
                for (kha8vJMg5Bq7MuAMmONj kha8vjmg5bq7muammonj : bh9twnqyl1a7prtw2.dDIMxZXP1V8HdM.vekpFI4d1Nc4fakF) {
                    if (kha8vjmg5bq7muammonj.vekpFI4d1Nc4fakF == 0) {
                        Set<bH9TwNqyl1A7prtw> set2 = (Set) map.get(new YT1xLRc9EMvb3(kha8vjmg5bq7muammonj.dDIMxZXP1V8HdM, kha8vjmg5bq7muammonj.w9sT1Swbhx3hs == 2));
                        if (set2 != null) {
                            for (bH9TwNqyl1A7prtw bh9twnqyl1a7prtw3 : set2) {
                                bh9twnqyl1a7prtw2.w9sT1Swbhx3hs.add(bh9twnqyl1a7prtw3);
                                bh9twnqyl1a7prtw3.vekpFI4d1Nc4fakF.add(bh9twnqyl1a7prtw2);
                            }
                        }
                    }
                }
            }
        }
        HashSet<bH9TwNqyl1A7prtw> hashSet = new HashSet();
        Iterator it2 = map.values().iterator();
        while (it2.hasNext()) {
            hashSet.addAll((Set) it2.next());
        }
        HashSet hashSet2 = new HashSet();
        for (bH9TwNqyl1A7prtw bh9twnqyl1a7prtw4 : hashSet) {
            if (bh9twnqyl1a7prtw4.vekpFI4d1Nc4fakF.isEmpty()) {
                hashSet2.add(bh9twnqyl1a7prtw4);
            }
        }
        while (!hashSet2.isEmpty()) {
            bH9TwNqyl1A7prtw bh9twnqyl1a7prtw5 = (bH9TwNqyl1A7prtw) hashSet2.iterator().next();
            hashSet2.remove(bh9twnqyl1a7prtw5);
            i++;
            for (bH9TwNqyl1A7prtw bh9twnqyl1a7prtw6 : bh9twnqyl1a7prtw5.w9sT1Swbhx3hs) {
                bh9twnqyl1a7prtw6.vekpFI4d1Nc4fakF.remove(bh9twnqyl1a7prtw5);
                if (bh9twnqyl1a7prtw6.vekpFI4d1Nc4fakF.isEmpty()) {
                    hashSet2.add(bh9twnqyl1a7prtw6);
                }
            }
        }
        if (i == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (bH9TwNqyl1A7prtw bh9twnqyl1a7prtw7 : hashSet) {
            if (!bh9twnqyl1a7prtw7.vekpFI4d1Nc4fakF.isEmpty() && !bh9twnqyl1a7prtw7.w9sT1Swbhx3hs.isEmpty()) {
                arrayList2.add(bh9twnqyl1a7prtw7.dDIMxZXP1V8HdM);
            }
        }
        throw new Nu1RZytRZGiHqTFlrUmf("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }

    public static final void xDyLpEZyrcKVe0(WorkDatabase workDatabase, eDfRIe8Yxow8 edfrie8yxow8, bVJI6LA77fw3pJCMf bvji6la77fw3pjcmf) {
        int i;
        ArrayList arrayListVIJudZvPyTuNp = Aqh0grSwgDbwr.vIJudZvPyTuNp(bvji6la77fw3pjcmf);
        int i2 = 0;
        while (!arrayListVIJudZvPyTuNp.isEmpty()) {
            if (arrayListVIJudZvPyTuNp.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            List list = ((bVJI6LA77fw3pJCMf) arrayListVIJudZvPyTuNp.remove(Aqh0grSwgDbwr.EWUjsTERgdPbSw3NNlN(arrayListVIJudZvPyTuNp))).b1EoSIRjJHO5;
            if (list.isEmpty()) {
                i = 0;
            } else {
                Iterator it = list.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (!((GIUFlVOyGkYog) it.next()).w9sT1Swbhx3hs.D5P1xCAyuvgF.b1EoSIRjJHO5.isEmpty() && (i = i + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
            }
            i2 += i;
        }
        if (i2 == 0) {
            return;
        }
        nLrxl2ExJj45rGBsZNLQ nlrxl2exjj45rgbsznlqXiR1pIn5878vVWd = workDatabase.XiR1pIn5878vVWd();
        nlrxl2exjj45rgbsznlqXiR1pIn5878vVWd.getClass();
        eZ6soZeOs7kkqZcCQFOR ez6sozeos7kkqzccqforD5P1xCAyuvgF = eZ6soZeOs7kkqZcCQFOR.D5P1xCAyuvgF("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)", 0);
        WorkDatabase_Impl workDatabase_Impl = nlrxl2exjj45rgbsznlqXiR1pIn5878vVWd.dDIMxZXP1V8HdM;
        workDatabase_Impl.w9sT1Swbhx3hs();
        Cursor cursorGmNWMfvn6zlEj = workDatabase_Impl.gmNWMfvn6zlEj(ez6sozeos7kkqzccqforD5P1xCAyuvgF);
        try {
            int i3 = cursorGmNWMfvn6zlEj.moveToFirst() ? cursorGmNWMfvn6zlEj.getInt(0) : 0;
            cursorGmNWMfvn6zlEj.close();
            ez6sozeos7kkqzccqforD5P1xCAyuvgF.hjneShqpF9Tis4();
            int i4 = edfrie8yxow8.w9sT1Swbhx3hs;
            if (i3 + i2 <= i4) {
                return;
            }
            throw new IllegalArgumentException("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: " + i4 + ";\nalready enqueued count: " + i3 + ";\ncurrent enqueue operation count: " + i2 + ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.");
        } catch (Throwable th) {
            cursorGmNWMfvn6zlEj.close();
            ez6sozeos7kkqzccqforD5P1xCAyuvgF.hjneShqpF9Tis4();
            throw th;
        }
    }

    public static void xfn2GJwmGqs7kWW(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + rCHnHJBAlOpNI5(parcel, i));
    }

    public static boolean yTljMGnIibTRdOpSh4(Parcel parcel, int i) {
        ECwLkmPW1UKz7J6E(parcel, i, 100 - 96);
        return parcel.readInt() != 0;
    }

    public void DVTNwpDEVsUKuznof() {
    }

    public abstract void EWUjsTERgdPbSw3NNlN(n456oOyX6Umn21f n456ooyx6umn21f);

    public abstract void H9XlUr4OeMJFiXK();

    public void K7eEOBPYP9VIoHWTe(String str) {
    }

    public void dTS0S7eC32ubQH54j36(XslKUngIJyofTLpQ5 xslKUngIJyofTLpQ5) {
    }

    public abstract void l1V0lQr6TbwNKqHfXNbb(Exception exc);

    public abstract List pyu8ovAipBTLYAiKab(String str, List list);
}
