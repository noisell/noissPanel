package v.s;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class Bsr8WAhbbWJl {
    static {
        new XslKUngIJyofTLpQ5("\"\\".getBytes(N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM)).JXn4Qf7zpnLjP5 = "\"\\";
        new XslKUngIJyofTLpQ5("\t ,=".getBytes(N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM)).JXn4Qf7zpnLjP5 = "\t ,=";
    }

    public static final boolean dDIMxZXP1V8HdM(Box5SCj0ZNnLNdOqQxT box5SCj0ZNnLNdOqQxT) {
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs((String) box5SCj0ZNnLNdOqQxT.w9sT1Swbhx3hs.JXn4Qf7zpnLjP5, "HEAD")) {
            return false;
        }
        int i = box5SCj0ZNnLNdOqQxT.Ee8d2j4S9Vm5yGuR;
        if (((i < 100 || i >= 200) && i != 204 && i != 304) || yrMnf4fyLGfIJbMg8IbG.D5P1xCAyuvgF(box5SCj0ZNnLNdOqQxT) != -1) {
            return true;
        }
        String strDDIMxZXP1V8HdM = box5SCj0ZNnLNdOqQxT.ibVTtJUNfrGYbW.dDIMxZXP1V8HdM("Transfer-Encoding");
        if (strDDIMxZXP1V8HdM == null) {
            strDDIMxZXP1V8HdM = null;
        }
        return "chunked".equalsIgnoreCase(strDDIMxZXP1V8HdM);
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:31:0x0092  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [char, int] */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r9v5, types: [char, int] */
    public static final void w9sT1Swbhx3hs(fadfsJa4iEdiwEC4Xm8 fadfsja4iediwec4xm8, xc6AKez33c65zO xc6akez33c65zo, SzicGcOQovJ1JhxwfLo8 szicGcOQovJ1JhxwfLo8) {
        int i;
        int i2;
        khILnFgHjntAJja8Kh khilnfghjntajja8kh;
        khILnFgHjntAJja8Kh khilnfghjntajja8kh2;
        if (fadfsja4iediwec4xm8 == fadfsJa4iEdiwEC4Xm8.JXn4Qf7zpnLjP5) {
            return;
        }
        Pattern pattern = khILnFgHjntAJja8Kh.D5P1xCAyuvgF;
        int size = szicGcOQovJ1JhxwfLo8.size();
        int i3 = 0;
        int i4 = 0;
        ArrayList arrayList = null;
        while (true) {
            i = (-62) + 64;
            if (i4 >= size) {
                break;
            }
            if ("Set-Cookie".equalsIgnoreCase(szicGcOQovJ1JhxwfLo8.w9sT1Swbhx3hs(i4))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(i);
                }
                arrayList.add(szicGcOQovJ1JhxwfLo8.JXn4Qf7zpnLjP5(i4));
            }
            i4++;
        }
        List listUnmodifiableList = qkzRt1s9DJNNYwsqt.w9sT1Swbhx3hs;
        List listUnmodifiableList2 = arrayList != null ? Collections.unmodifiableList(arrayList) : listUnmodifiableList;
        int size2 = listUnmodifiableList2.size();
        int i5 = 0;
        ArrayList arrayList2 = null;
        while (i5 < size2) {
            String str = (String) listUnmodifiableList2.get(i5);
            long jCurrentTimeMillis = System.currentTimeMillis();
            ?? r12 = 31 + 28;
            int i6 = 7 - 1;
            int iIbVTtJUNfrGYbW = yrMnf4fyLGfIJbMg8IbG.ibVTtJUNfrGYbW(str, r12, i3, i3, i6);
            char c = '=';
            int iIbVTtJUNfrGYbW2 = yrMnf4fyLGfIJbMg8IbG.ibVTtJUNfrGYbW(str, '=', i3, iIbVTtJUNfrGYbW, i);
            if (iIbVTtJUNfrGYbW2 == iIbVTtJUNfrGYbW) {
                i2 = i3;
                khilnfghjntajja8kh = null;
            } else {
                String strK7eEOBPYP9VIoHWTe = yrMnf4fyLGfIJbMg8IbG.K7eEOBPYP9VIoHWTe(str, i3, iIbVTtJUNfrGYbW2);
                if (strK7eEOBPYP9VIoHWTe.length() != 0 && yrMnf4fyLGfIJbMg8IbG.gmNWMfvn6zlEj(strK7eEOBPYP9VIoHWTe) == -1) {
                    String strK7eEOBPYP9VIoHWTe2 = yrMnf4fyLGfIJbMg8IbG.K7eEOBPYP9VIoHWTe(str, iIbVTtJUNfrGYbW2 + 1, iIbVTtJUNfrGYbW);
                    if (yrMnf4fyLGfIJbMg8IbG.gmNWMfvn6zlEj(strK7eEOBPYP9VIoHWTe2) == -1) {
                        int i7 = iIbVTtJUNfrGYbW + 1;
                        int length = str.length();
                        long j = 253402300799999L;
                        int i8 = i3;
                        int i9 = i8;
                        boolean z = i9 == true ? 1 : 0;
                        long jD5P1xCAyuvgF = 253402300799999L;
                        String str2 = null;
                        String strSubstring = null;
                        long j2 = -1;
                        boolean z2 = true;
                        char c2 = r12;
                        boolean z3 = i9;
                        while (true) {
                            if (i7 >= length) {
                                if (j2 == Long.MIN_VALUE) {
                                    j = Long.MIN_VALUE;
                                } else if (j2 != -1) {
                                    long j3 = jCurrentTimeMillis + (j2 <= 9223372036854775L ? j2 * ((long) 1000) : Long.MAX_VALUE);
                                    if (j3 >= jCurrentTimeMillis && j3 <= 253402300799999L) {
                                        j = j3;
                                    }
                                } else {
                                    j = jD5P1xCAyuvgF;
                                }
                                String str3 = xc6akez33c65zo.JXn4Qf7zpnLjP5;
                                if (str2 != null) {
                                    if (!okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str3, str2) && (!str3.endsWith(str2) || str3.charAt((str3.length() - str2.length()) - 1) != '.' || yrMnf4fyLGfIJbMg8IbG.Ee8d2j4S9Vm5yGuR.w9sT1Swbhx3hs(str3))) {
                                        i2 = 0;
                                        khilnfghjntajja8kh2 = null;
                                    }
                                    khilnfghjntajja8kh = khilnfghjntajja8kh2;
                                    break;
                                }
                                str2 = str3;
                                if (str3.length() != str2.length()) {
                                    PublicSuffixDatabase.Companion.getClass();
                                    if (PublicSuffixDatabase.instance.getEffectiveTldPlusOne(str2) == null) {
                                        i2 = 0;
                                        khilnfghjntajja8kh2 = null;
                                    }
                                    khilnfghjntajja8kh = khilnfghjntajja8kh2;
                                    break;
                                }
                                if (strSubstring == null || !strSubstring.startsWith("/")) {
                                    String strW9sT1Swbhx3hs = xc6akez33c65zo.w9sT1Swbhx3hs();
                                    i2 = 0;
                                    int iUoxIZOBVZaubOFdPNaXK = KgSM0TsKUpCiuePB.UoxIZOBVZaubOFdPNaXK(strW9sT1Swbhx3hs, 68 - 21, 0, i6);
                                    strSubstring = iUoxIZOBVZaubOFdPNaXK != 0 ? strW9sT1Swbhx3hs.substring(0, iUoxIZOBVZaubOFdPNaXK) : "/";
                                } else {
                                    i2 = 0;
                                }
                                khilnfghjntajja8kh2 = new khILnFgHjntAJja8Kh(strK7eEOBPYP9VIoHWTe, strK7eEOBPYP9VIoHWTe2, j, str2, strSubstring, z ? 1 : 0, i8, z3, z2);
                                khilnfghjntajja8kh = khilnfghjntajja8kh2;
                                break;
                            }
                            int iXDyLpEZyrcKVe0 = yrMnf4fyLGfIJbMg8IbG.xDyLpEZyrcKVe0(str, c2, i7, length);
                            int iXDyLpEZyrcKVe1 = yrMnf4fyLGfIJbMg8IbG.xDyLpEZyrcKVe0(str, c, i7, iXDyLpEZyrcKVe0);
                            String strK7eEOBPYP9VIoHWTe3 = yrMnf4fyLGfIJbMg8IbG.K7eEOBPYP9VIoHWTe(str, i7, iXDyLpEZyrcKVe1);
                            String strK7eEOBPYP9VIoHWTe4 = iXDyLpEZyrcKVe1 < iXDyLpEZyrcKVe0 ? yrMnf4fyLGfIJbMg8IbG.K7eEOBPYP9VIoHWTe(str, iXDyLpEZyrcKVe1 + 1, iXDyLpEZyrcKVe0) : "";
                            if (strK7eEOBPYP9VIoHWTe3.equalsIgnoreCase("expires")) {
                                try {
                                    jD5P1xCAyuvgF = y6jRGLEWNMir.D5P1xCAyuvgF(strK7eEOBPYP9VIoHWTe4, strK7eEOBPYP9VIoHWTe4.length());
                                    z3 = 1;
                                } catch (NumberFormatException | IllegalArgumentException unused) {
                                }
                            } else if (strK7eEOBPYP9VIoHWTe3.equalsIgnoreCase("max-age")) {
                                try {
                                    j2 = Long.parseLong(strK7eEOBPYP9VIoHWTe4);
                                    if (j2 <= 0) {
                                        j2 = Long.MIN_VALUE;
                                    }
                                } catch (NumberFormatException e) {
                                    if (!Pattern.compile("-?\\d+").matcher(strK7eEOBPYP9VIoHWTe4).matches()) {
                                        throw e;
                                    }
                                    j2 = strK7eEOBPYP9VIoHWTe4.startsWith("-") ? Long.MIN_VALUE : Long.MAX_VALUE;
                                }
                                z3 = 1;
                            } else if (strK7eEOBPYP9VIoHWTe3.equalsIgnoreCase("domain")) {
                                if (strK7eEOBPYP9VIoHWTe4.endsWith(".")) {
                                    throw new IllegalArgumentException("Failed requirement.");
                                }
                                String strH9XlUr4OeMJFiXK = y6jRGLEWNMir.H9XlUr4OeMJFiXK(KgSM0TsKUpCiuePB.Q7qC5ia93qGCjkBXCF0A(strK7eEOBPYP9VIoHWTe4, "."));
                                if (strH9XlUr4OeMJFiXK == null) {
                                    throw new IllegalArgumentException();
                                }
                                str2 = strH9XlUr4OeMJFiXK;
                                z2 = false;
                            } else if (strK7eEOBPYP9VIoHWTe3.equalsIgnoreCase("path")) {
                                strSubstring = strK7eEOBPYP9VIoHWTe4;
                            } else if (strK7eEOBPYP9VIoHWTe3.equalsIgnoreCase("secure")) {
                                z = true;
                            } else if (strK7eEOBPYP9VIoHWTe3.equalsIgnoreCase("httponly")) {
                                i8 = 1;
                            }
                            i7 = iXDyLpEZyrcKVe0 + 1;
                            c2 = 59;
                            c = '=';
                            z3 = z3;
                            z = z;
                        }
                    } else {
                        i2 = i3;
                        khilnfghjntajja8kh = null;
                    }
                } else {
                    i2 = i3;
                    khilnfghjntajja8kh = null;
                }
            }
            if (khilnfghjntajja8kh != null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(khilnfghjntajja8kh);
            }
            i5++;
            i3 = i2;
            i = 2;
        }
        if (arrayList2 != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList2);
        }
        listUnmodifiableList.isEmpty();
    }
}
