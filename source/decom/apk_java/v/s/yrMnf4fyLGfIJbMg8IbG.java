package v.s;

import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class yrMnf4fyLGfIJbMg8IbG {
    public static final NB5LVitKoIkG7GAQ6 Ee8d2j4S9Vm5yGuR;
    public static final TimeZone JXn4Qf7zpnLjP5;
    public static final byte[] dDIMxZXP1V8HdM;
    public static final T3JeDzw7Re7Z vekpFI4d1Nc4fakF;
    public static final SzicGcOQovJ1JhxwfLo8 w9sT1Swbhx3hs = FZ1sl4mHq4J0hOEYC.XiR1pIn5878vVWd(new String[0]);
    public static final String xDyLpEZyrcKVe0;

    static {
        int i;
        byte[] bArr = new byte[0];
        dDIMxZXP1V8HdM = bArr;
        LTdvNeHFqTsIb9 lTdvNeHFqTsIb9 = new LTdvNeHFqTsIb9();
        lTdvNeHFqTsIb9.tne6mXOUFKdd(bArr, 0);
        long j = 0;
        vekpFI4d1Nc4fakF = new T3JeDzw7Re7Z(j, lTdvNeHFqTsIb9, 1);
        if (j < 0 || j > j || 0 < j) {
            throw new ArrayIndexOutOfBoundsException();
        }
        XslKUngIJyofTLpQ5[] xslKUngIJyofTLpQ5Arr = {fadfsJa4iEdiwEC4Xm8.vekpFI4d1Nc4fakF("efbbbf"), fadfsJa4iEdiwEC4Xm8.vekpFI4d1Nc4fakF("feff"), fadfsJa4iEdiwEC4Xm8.vekpFI4d1Nc4fakF("fffe"), fadfsJa4iEdiwEC4Xm8.vekpFI4d1Nc4fakF("0000ffff"), fadfsJa4iEdiwEC4Xm8.vekpFI4d1Nc4fakF("ffff0000")};
        ArrayList arrayList = new ArrayList(new GUsyOYEIobMSb6n(xslKUngIJyofTLpQ5Arr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(5);
        for (int i2 = 0; i2 < 5; i2++) {
            XslKUngIJyofTLpQ5 xslKUngIJyofTLpQ5 = xslKUngIJyofTLpQ5Arr[i2];
            arrayList2.add(-1);
        }
        Integer[] numArr = (Integer[]) arrayList2.toArray(new Integer[0]);
        ArrayList arrayListVIJudZvPyTuNp = Aqh0grSwgDbwr.vIJudZvPyTuNp(Arrays.copyOf(numArr, numArr.length));
        int i3 = 0;
        int i4 = 0;
        while (i3 < 5) {
            XslKUngIJyofTLpQ5 xslKUngIJyofTLpQ6 = xslKUngIJyofTLpQ5Arr[i3];
            int i5 = i4 + 1;
            int size = arrayList.size();
            int size2 = arrayList.size();
            if (size < 0) {
                throw new IllegalArgumentException(Y9mRyRdkl5FOcwb66V6.b1EoSIRjJHO5("fromIndex (0) is greater than toIndex (", ").", size));
            }
            if (size > size2) {
                throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
            }
            int i6 = size - 1;
            int i7 = 0;
            while (true) {
                if (i7 > i6) {
                    i = -(i7 + 1);
                    break;
                }
                i = (i7 + i6) >>> 1;
                int iPyu8ovAipBTLYAiKab = SbxdZ6Kq2uhHQ5RPRqm.pyu8ovAipBTLYAiKab((Comparable) arrayList.get(i), xslKUngIJyofTLpQ6);
                if (iPyu8ovAipBTLYAiKab < 0) {
                    i7 = i + 1;
                } else if (iPyu8ovAipBTLYAiKab <= 0) {
                    break;
                } else {
                    i6 = i - 1;
                }
            }
            arrayListVIJudZvPyTuNp.set(i, Integer.valueOf(i4));
            i3++;
            i4 = i5;
        }
        if (((XslKUngIJyofTLpQ5) arrayList.get(0)).vekpFI4d1Nc4fakF() <= 0) {
            throw new IllegalArgumentException("the empty byte string is not a supported option");
        }
        int i8 = 0;
        while (i8 < arrayList.size()) {
            XslKUngIJyofTLpQ5 xslKUngIJyofTLpQ7 = (XslKUngIJyofTLpQ5) arrayList.get(i8);
            int i9 = i8 + 1;
            int i10 = i9;
            while (i10 < arrayList.size()) {
                XslKUngIJyofTLpQ5 xslKUngIJyofTLpQ8 = (XslKUngIJyofTLpQ5) arrayList.get(i10);
                xslKUngIJyofTLpQ8.getClass();
                if (!xslKUngIJyofTLpQ8.ibVTtJUNfrGYbW(xslKUngIJyofTLpQ7.vekpFI4d1Nc4fakF(), xslKUngIJyofTLpQ7)) {
                    break;
                }
                if (xslKUngIJyofTLpQ8.vekpFI4d1Nc4fakF() == xslKUngIJyofTLpQ7.vekpFI4d1Nc4fakF()) {
                    throw new IllegalArgumentException(("duplicate option: " + xslKUngIJyofTLpQ8).toString());
                }
                if (((Number) arrayListVIJudZvPyTuNp.get(i10)).intValue() > ((Number) arrayListVIJudZvPyTuNp.get(i8)).intValue()) {
                    arrayList.remove(i10);
                    arrayListVIJudZvPyTuNp.remove(i10);
                } else {
                    i10++;
                }
            }
            i8 = i9;
        }
        LTdvNeHFqTsIb9 lTdvNeHFqTsIb10 = new LTdvNeHFqTsIb9();
        okc5AGRjqrud84oM6d.JXn4Qf7zpnLjP5(0L, lTdvNeHFqTsIb10, 0, arrayList, 0, arrayList.size(), arrayListVIJudZvPyTuNp);
        int[] iArr = new int[(int) (lTdvNeHFqTsIb10.vekpFI4d1Nc4fakF / ((long) 4))];
        int i11 = 0;
        while (!lTdvNeHFqTsIb10.vekpFI4d1Nc4fakF()) {
            iArr[i11] = lTdvNeHFqTsIb10.readInt();
            i11++;
        }
        JXn4Qf7zpnLjP5 = TimeZone.getTimeZone("GMT");
        Ee8d2j4S9Vm5yGuR = new NB5LVitKoIkG7GAQ6("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        String strQ7qC5ia93qGCjkBXCF0A = KgSM0TsKUpCiuePB.Q7qC5ia93qGCjkBXCF0A(sp6apkX00TawY02qGY6r.class.getName(), "okhttp3.");
        if (strQ7qC5ia93qGCjkBXCF0A.endsWith("Client")) {
            strQ7qC5ia93qGCjkBXCF0A = strQ7qC5ia93qGCjkBXCF0A.substring(0, strQ7qC5ia93qGCjkBXCF0A.length() - 6);
        }
        xDyLpEZyrcKVe0 = strQ7qC5ia93qGCjkBXCF0A;
    }

    public static final long D5P1xCAyuvgF(Box5SCj0ZNnLNdOqQxT box5SCj0ZNnLNdOqQxT) {
        String strDDIMxZXP1V8HdM = box5SCj0ZNnLNdOqQxT.ibVTtJUNfrGYbW.dDIMxZXP1V8HdM("Content-Length");
        if (strDDIMxZXP1V8HdM == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strDDIMxZXP1V8HdM);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final String DVTNwpDEVsUKuznof(xc6AKez33c65zO xc6akez33c65zo, boolean z) {
        int i;
        int i2 = xc6akez33c65zo.Ee8d2j4S9Vm5yGuR;
        String str = xc6akez33c65zo.JXn4Qf7zpnLjP5;
        if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(str, ":", false)) {
            str = "[" + str + ']';
        }
        if (!z) {
            String str2 = xc6akez33c65zo.dDIMxZXP1V8HdM;
            if (str2.equals("http")) {
                i = 80;
            } else {
                i = str2.equals("https") ? 443 : -1;
            }
            if (i2 == i) {
                return str;
            }
        }
        return str + ':' + i2;
    }

    public static final int Ee8d2j4S9Vm5yGuR(int i, int i2, String str, String str2) {
        while (i < i2) {
            if (KgSM0TsKUpCiuePB.jdOQeRk37T35X5xKW1P(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final SzicGcOQovJ1JhxwfLo8 H9XlUr4OeMJFiXK(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            RSjkliukrZnQXjh rSjkliukrZnQXjh = (RSjkliukrZnQXjh) it.next();
            XslKUngIJyofTLpQ5 xslKUngIJyofTLpQ5 = rSjkliukrZnQXjh.dDIMxZXP1V8HdM;
            XslKUngIJyofTLpQ5 xslKUngIJyofTLpQ6 = rSjkliukrZnQXjh.w9sT1Swbhx3hs;
            String strHjneShqpF9Tis4 = xslKUngIJyofTLpQ5.hjneShqpF9Tis4();
            String strHjneShqpF9Tis5 = xslKUngIJyofTLpQ6.hjneShqpF9Tis4();
            arrayList.add(strHjneShqpF9Tis4);
            arrayList.add(KgSM0TsKUpCiuePB.uW0IRoPBZMj2QmBkkp(strHjneShqpF9Tis5).toString());
        }
        return new SzicGcOQovJ1JhxwfLo8((String[]) arrayList.toArray(new String[0]));
    }

    public static final int J0zjQ7CAgohuxU20eCW6(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' > c || c >= 'G') {
            return -1;
        }
        return c - '7';
    }

    public static final void JXn4Qf7zpnLjP5(Socket socket) {
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    public static final String K7eEOBPYP9VIoHWTe(String str, int i, int i2) {
        int iGIIiyi2ddlMDR0 = gIIiyi2ddlMDR0(str, i, i2);
        return str.substring(iGIIiyi2ddlMDR0, wotphlvK9sPbXJ(str, iGIIiyi2ddlMDR0, i2));
    }

    public static final int MLSIo1htfMPWeB8V876L(enW4UFmBttog4rg5RB enw4ufmbttog4rg5rb) {
        return (enw4ufmbttog4rg5rb.readByte() & 255) | ((enw4ufmbttog4rg5rb.readByte() & 255) << 16) | ((enw4ufmbttog4rg5rb.readByte() & 255) << 8);
    }

    public static final String[] Qrz92kRPw4GcghAc(String[] strArr, String[] strArr2, Comparator comparator) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : strArr2) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean XiR1pIn5878vVWd(nj8JtA7VVVuzq nj8jta7vvvuzq, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long jNanoTime = System.nanoTime();
        long jVekpFI4d1Nc4fakF = nj8jta7vvvuzq.w9sT1Swbhx3hs().Ee8d2j4S9Vm5yGuR() ? nj8jta7vvvuzq.w9sT1Swbhx3hs().vekpFI4d1Nc4fakF() - jNanoTime : Long.MAX_VALUE;
        nj8jta7vvvuzq.w9sT1Swbhx3hs().JXn4Qf7zpnLjP5(Math.min(jVekpFI4d1Nc4fakF, timeUnit.toNanos(i)) + jNanoTime);
        try {
            LTdvNeHFqTsIb9 lTdvNeHFqTsIb9 = new LTdvNeHFqTsIb9();
            while (nj8jta7vvvuzq.yTljMGnIibTRdOpSh4(lTdvNeHFqTsIb9, 8192L) != -1) {
                lTdvNeHFqTsIb9.skip(lTdvNeHFqTsIb9.vekpFI4d1Nc4fakF);
            }
            if (jVekpFI4d1Nc4fakF == Long.MAX_VALUE) {
                nj8jta7vvvuzq.w9sT1Swbhx3hs().dDIMxZXP1V8HdM();
                return true;
            }
            nj8jta7vvvuzq.w9sT1Swbhx3hs().JXn4Qf7zpnLjP5(jNanoTime + jVekpFI4d1Nc4fakF);
            return true;
        } catch (InterruptedIOException unused) {
            if (jVekpFI4d1Nc4fakF == Long.MAX_VALUE) {
                nj8jta7vvvuzq.w9sT1Swbhx3hs().dDIMxZXP1V8HdM();
                return false;
            }
            nj8jta7vvvuzq.w9sT1Swbhx3hs().JXn4Qf7zpnLjP5(jNanoTime + jVekpFI4d1Nc4fakF);
            return false;
        } catch (Throwable th) {
            if (jVekpFI4d1Nc4fakF == Long.MAX_VALUE) {
                nj8jta7vvvuzq.w9sT1Swbhx3hs().dDIMxZXP1V8HdM();
            } else {
                nj8jta7vvvuzq.w9sT1Swbhx3hs().JXn4Qf7zpnLjP5(jNanoTime + jVekpFI4d1Nc4fakF);
            }
            throw th;
        }
    }

    public static final String b1EoSIRjJHO5(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    private static /* synthetic */ void cfdpzpza() {
    }

    public static final boolean dDIMxZXP1V8HdM(xc6AKez33c65zO xc6akez33c65zo, xc6AKez33c65zO xc6akez33c65zo2) {
        return okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(xc6akez33c65zo.JXn4Qf7zpnLjP5, xc6akez33c65zo2.JXn4Qf7zpnLjP5) && xc6akez33c65zo.Ee8d2j4S9Vm5yGuR == xc6akez33c65zo2.Ee8d2j4S9Vm5yGuR && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(xc6akez33c65zo.dDIMxZXP1V8HdM, xc6akez33c65zo2.dDIMxZXP1V8HdM);
    }

    public static final int gIIiyi2ddlMDR0(String str, int i, int i2) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != 34 - 24 && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int gmNWMfvn6zlEj(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (okc5AGRjqrud84oM6d.xDyLpEZyrcKVe0(cCharAt, 31) <= 0 || okc5AGRjqrud84oM6d.xDyLpEZyrcKVe0(cCharAt, 68 + 59) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final List hjneShqpF9Tis4(Object... objArr) {
        Object[] objArr2 = (Object[]) objArr.clone();
        return Collections.unmodifiableList(Aqh0grSwgDbwr.yTljMGnIibTRdOpSh4(Arrays.copyOf(objArr2, objArr2.length)));
    }

    public static /* synthetic */ int ibVTtJUNfrGYbW(String str, char c, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return xDyLpEZyrcKVe0(str, c, i, i2);
    }

    public static final int l1V0lQr6TbwNKqHfXNbb(String str, int i) {
        if (str != null) {
            try {
                long j = Long.parseLong(str);
                if (j > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (j < 0) {
                    return 0;
                }
                return (int) j;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public static final boolean nQilHWaqS401ZtR(String str) {
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    public static final boolean pyu8ovAipBTLYAiKab(String[] strArr, String[] strArr2, Comparator comparator) {
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                int i = 0;
                while (true) {
                    if (i < strArr2.length) {
                        int i2 = i + 1;
                        try {
                            if (comparator.compare(str, strArr2[i]) == 0) {
                                return true;
                            }
                            i = i2;
                        } catch (ArrayIndexOutOfBoundsException e) {
                            throw new NoSuchElementException(e.getMessage());
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final void vekpFI4d1Nc4fakF(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final int w9sT1Swbhx3hs(String str, long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalStateException(str.concat(" < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException(str.concat(" too large.").toString());
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException(str.concat(" too small.").toString());
    }

    public static final int wotphlvK9sPbXJ(String str, int i, int i2) {
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char cCharAt = str.charAt(i3);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i3 + 1;
                }
                if (i3 != i) {
                    i3--;
                }
            }
        }
        return i;
    }

    public static final int xDyLpEZyrcKVe0(String str, char c, int i, int i2) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }
}
