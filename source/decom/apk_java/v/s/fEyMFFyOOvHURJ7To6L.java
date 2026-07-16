package v.s;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class fEyMFFyOOvHURJ7To6L implements qrp1qtE91LqdmL, As2k35rSTTZ3RAUS, WRfNrRcBPJAejspMKu, pARxL2hv3Xoc, bYZKmsM130y5GVhnn {
    public static volatile fEyMFFyOOvHURJ7To6L D5P1xCAyuvgF;
    public static fEyMFFyOOvHURJ7To6L vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs;
    public static final fEyMFFyOOvHURJ7To6L JXn4Qf7zpnLjP5 = new fEyMFFyOOvHURJ7To6L(1);
    public static final /* synthetic */ fEyMFFyOOvHURJ7To6L Ee8d2j4S9Vm5yGuR = new fEyMFFyOOvHURJ7To6L(2);
    public static final fEyMFFyOOvHURJ7To6L xDyLpEZyrcKVe0 = new fEyMFFyOOvHURJ7To6L(3);
    public static final fEyMFFyOOvHURJ7To6L ibVTtJUNfrGYbW = new fEyMFFyOOvHURJ7To6L(4);
    public static final fEyMFFyOOvHURJ7To6L b1EoSIRjJHO5 = new fEyMFFyOOvHURJ7To6L(5);
    public static final Object pyu8ovAipBTLYAiKab = new Object();
    public static final fEyMFFyOOvHURJ7To6L hjneShqpF9Tis4 = new fEyMFFyOOvHURJ7To6L(7);
    public static final fEyMFFyOOvHURJ7To6L gmNWMfvn6zlEj = new fEyMFFyOOvHURJ7To6L(8);

    public /* synthetic */ fEyMFFyOOvHURJ7To6L(int i) {
        this.w9sT1Swbhx3hs = i;
    }

    public static boolean D5P1xCAyuvgF() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    public static final Box5SCj0ZNnLNdOqQxT Ee8d2j4S9Vm5yGuR(Box5SCj0ZNnLNdOqQxT box5SCj0ZNnLNdOqQxT) {
        if ((box5SCj0ZNnLNdOqQxT != null ? box5SCj0ZNnLNdOqQxT.b1EoSIRjJHO5 : null) == null) {
            return box5SCj0ZNnLNdOqQxT;
        }
        OHTCdIMQ8dDzHn2uIc oHTCdIMQ8dDzHn2uIcDDIMxZXP1V8HdM = box5SCj0ZNnLNdOqQxT.dDIMxZXP1V8HdM();
        oHTCdIMQ8dDzHn2uIcDDIMxZXP1V8HdM.ibVTtJUNfrGYbW = null;
        return oHTCdIMQ8dDzHn2uIcDDIMxZXP1V8HdM.dDIMxZXP1V8HdM();
    }

    public static final boolean J0zjQ7CAgohuxU20eCW6(PackageInfo packageInfo) {
        ApplicationInfo applicationInfo;
        boolean z = packageInfo == null || !(("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) && ((applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 129) == 0));
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z ? nQilHWaqS401ZtR(packageInfo, yIrCtqz4JvM7DQ3xUhmU.dDIMxZXP1V8HdM) : nQilHWaqS401ZtR(packageInfo, yIrCtqz4JvM7DQ3xUhmU.dDIMxZXP1V8HdM[0])) != null) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList Qrz92kRPw4GcghAc(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iJW3Lh9hxwLsO2ArTlH = KgSM0TsKUpCiuePB.JW3Lh9hxwLsO2ArTlH(str, '&', i, 4);
            if (iJW3Lh9hxwLsO2ArTlH == -1) {
                iJW3Lh9hxwLsO2ArTlH = str.length();
            }
            int iJW3Lh9hxwLsO2ArTlH2 = KgSM0TsKUpCiuePB.JW3Lh9hxwLsO2ArTlH(str, '=', i, 4);
            if (iJW3Lh9hxwLsO2ArTlH2 == -1 || iJW3Lh9hxwLsO2ArTlH2 > iJW3Lh9hxwLsO2ArTlH) {
                arrayList.add(str.substring(i, iJW3Lh9hxwLsO2ArTlH));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, iJW3Lh9hxwLsO2ArTlH2));
                arrayList.add(str.substring(iJW3Lh9hxwLsO2ArTlH2 + 1, iJW3Lh9hxwLsO2ArTlH));
            }
            i = iJW3Lh9hxwLsO2ArTlH + 1;
        }
        return arrayList;
    }

    public static byte[] b1EoSIRjJHO5(List list) {
        LTdvNeHFqTsIb9 lTdvNeHFqTsIb9 = new LTdvNeHFqTsIb9();
        ArrayList arrayListXDyLpEZyrcKVe0 = xDyLpEZyrcKVe0(list);
        int size = arrayListXDyLpEZyrcKVe0.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListXDyLpEZyrcKVe0.get(i);
            i++;
            String str = (String) obj;
            lTdvNeHFqTsIb9.ECwLkmPW1UKz7J6E(str.length());
            lTdvNeHFqTsIb9.k84rwRrqzhrNQ1CdNQ9(str, 0, str.length());
        }
        return lTdvNeHFqTsIb9.DVTNwpDEVsUKuznof(lTdvNeHFqTsIb9.vekpFI4d1Nc4fakF);
    }

    public static String gIIiyi2ddlMDR0(String str, int i, int i2, int i3) {
        int i4;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z = (i3 & 4) == 0;
        int iCharCount = i;
        while (iCharCount < i2) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                LTdvNeHFqTsIb9 lTdvNeHFqTsIb9 = new LTdvNeHFqTsIb9();
                lTdvNeHFqTsIb9.k84rwRrqzhrNQ1CdNQ9(str, i, iCharCount);
                while (iCharCount < i2) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i4 = iCharCount + 2) < i2) {
                        int iJ0zjQ7CAgohuxU20eCW6 = yrMnf4fyLGfIJbMg8IbG.J0zjQ7CAgohuxU20eCW6(str.charAt(iCharCount + 1));
                        int iJ0zjQ7CAgohuxU20eCW7 = yrMnf4fyLGfIJbMg8IbG.J0zjQ7CAgohuxU20eCW6(str.charAt(i4));
                        if (iJ0zjQ7CAgohuxU20eCW6 == -1 || iJ0zjQ7CAgohuxU20eCW7 == -1) {
                            lTdvNeHFqTsIb9.A1BaTVAMeIXMnh(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            lTdvNeHFqTsIb9.ECwLkmPW1UKz7J6E((iJ0zjQ7CAgohuxU20eCW6 << 4) + iJ0zjQ7CAgohuxU20eCW7);
                            iCharCount = Character.charCount(iCodePointAt) + i4;
                        }
                    } else if (iCodePointAt == 43 && z) {
                        lTdvNeHFqTsIb9.ECwLkmPW1UKz7J6E(32);
                        iCharCount++;
                    } else {
                        lTdvNeHFqTsIb9.A1BaTVAMeIXMnh(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return lTdvNeHFqTsIb9.vIJudZvPyTuNp();
            }
            iCharCount++;
        }
        return str.substring(i, i2);
    }

    public static boolean gmNWMfvn6zlEj(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && yrMnf4fyLGfIJbMg8IbG.J0zjQ7CAgohuxU20eCW6(str.charAt(i + 1)) != -1 && yrMnf4fyLGfIJbMg8IbG.J0zjQ7CAgohuxU20eCW6(str.charAt(i3)) != -1;
    }

    public static boolean hjneShqpF9Tis4(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static String ibVTtJUNfrGYbW(int i, int i2, int i3, String str, String str2) {
        int i4 = 0;
        int i5 = (i3 & 1) != 0 ? 0 : i;
        int length = (i3 & 2) != 0 ? str.length() : i2;
        boolean z = (i3 & 8) == 0;
        boolean z2 = (i3 & 16) == 0;
        boolean z3 = (i3 & 32) == 0;
        boolean z4 = (i3 & 64) == 0;
        int iCharCount = i5;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i6 = 32;
            int i7 = 43;
            int i8 = 48 + 79;
            if (iCodePointAt < 32 || iCodePointAt == i8 || ((iCodePointAt >= 128 && !z4) || KgSM0TsKUpCiuePB.jdOQeRk37T35X5xKW1P(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z || (z2 && !gmNWMfvn6zlEj(str, iCharCount, length)))) || (iCodePointAt == 43 && z3)))) {
                LTdvNeHFqTsIb9 lTdvNeHFqTsIb9 = new LTdvNeHFqTsIb9();
                lTdvNeHFqTsIb9.k84rwRrqzhrNQ1CdNQ9(str, i5, iCharCount);
                LTdvNeHFqTsIb9 lTdvNeHFqTsIb10 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == i7 && z3) {
                            String str3 = z ? "+" : "%2B";
                            lTdvNeHFqTsIb9.k84rwRrqzhrNQ1CdNQ9(str3, i4, str3.length());
                        } else {
                            if (iCodePointAt2 >= i6 && iCodePointAt2 != i8) {
                                if ((iCodePointAt2 < 128 || z4) && !KgSM0TsKUpCiuePB.jdOQeRk37T35X5xKW1P(str2, (char) iCodePointAt2) && (iCodePointAt2 != 37 || (z && (!z2 || gmNWMfvn6zlEj(str, iCharCount, length))))) {
                                    lTdvNeHFqTsIb9.A1BaTVAMeIXMnh(iCodePointAt2);
                                }
                            }
                            if (lTdvNeHFqTsIb10 == null) {
                                lTdvNeHFqTsIb10 = new LTdvNeHFqTsIb9();
                            }
                            lTdvNeHFqTsIb10.A1BaTVAMeIXMnh(iCodePointAt2);
                            while (!lTdvNeHFqTsIb10.vekpFI4d1Nc4fakF()) {
                                byte b = lTdvNeHFqTsIb10.readByte();
                                lTdvNeHFqTsIb9.ECwLkmPW1UKz7J6E(37);
                                char[] cArr = xc6AKez33c65zO.D5P1xCAyuvgF;
                                lTdvNeHFqTsIb9.ECwLkmPW1UKz7J6E(cArr[((b & 255) >> 4) & 15]);
                                lTdvNeHFqTsIb9.ECwLkmPW1UKz7J6E(cArr[b & 15]);
                            }
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i4 = 0;
                    i6 = 32;
                    i7 = 43;
                }
                return lTdvNeHFqTsIb9.vIJudZvPyTuNp();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i5, length);
    }

    private static /* synthetic */ void maphqad() {
    }

    public static final hqXdb5QpExRzJuC6iUi nQilHWaqS401ZtR(PackageInfo packageInfo, hqXdb5QpExRzJuC6iUi... hqxdb5qpexrzjuc6iuiArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        hfFZ7uq0bijs4VleVe hffz7uq0bijs4vleve = new hfFZ7uq0bijs4VleVe(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < hqxdb5qpexrzjuc6iuiArr.length; i++) {
            if (hqxdb5qpexrzjuc6iuiArr[i].equals(hffz7uq0bijs4vleve)) {
                return hqxdb5qpexrzjuc6iuiArr[i];
            }
        }
        return null;
    }

    public static fEyMFFyOOvHURJ7To6L pyu8ovAipBTLYAiKab() {
        fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6l;
        synchronized (pyu8ovAipBTLYAiKab) {
            try {
                if (D5P1xCAyuvgF == null) {
                    D5P1xCAyuvgF = new fEyMFFyOOvHURJ7To6L(6);
                }
                feymffyoovhurj7to6l = D5P1xCAyuvgF;
            } catch (Throwable th) {
                throw th;
            }
        }
        return feymffyoovhurj7to6l;
    }

    public static String wotphlvK9sPbXJ(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i = 98 - 78;
        if (length >= i) {
            sb.append(str.substring(0, i));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public static ArrayList xDyLpEZyrcKVe0(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((B62d1BWQ36VxGmXU) obj) != B62d1BWQ36VxGmXU.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(D8f4u3NB1PCAS427.xfn2GJwmGqs7kWW(arrayList));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((B62d1BWQ36VxGmXU) obj2).toString());
        }
        return arrayList2;
    }

    @Override // v.s.bYZKmsM130y5GVhnn
    public long JXn4Qf7zpnLjP5() {
        return System.currentTimeMillis();
    }

    @Override // v.s.WRfNrRcBPJAejspMKu
    public boolean dDIMxZXP1V8HdM(SSLSocket sSLSocket) {
        return sSLSocket.getClass().getName().startsWith("com.google.android.gms.org.conscrypt.");
    }

    @Override // v.s.RZKLDkRu6ZWDxTDL71X
    public Object get() {
        return new Qxq4OCIomL3rf7RSR(0, Executors.newSingleThreadExecutor());
    }

    @Override // v.s.WRfNrRcBPJAejspMKu
    public ZEBd2nNtvnSQpUDBe vekpFI4d1Nc4fakF(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new fxMPJzvjKAjA(superclass);
    }

    @Override // v.s.As2k35rSTTZ3RAUS
    public Object w9sT1Swbhx3hs(iniVyKd0OGb2raI4 inivykd0ogb2rai4) {
        switch (this.w9sT1Swbhx3hs) {
            case 3:
                return new rPTA1zWZR3GTVlGPw((Executor) inivykd0ogb2rai4.vekpFI4d1Nc4fakF(new QwPxr2jx1iGLmehgkv3g(G6671wZlei2pbk4f8.class, Executor.class)));
            case 4:
                return new rPTA1zWZR3GTVlGPw((Executor) inivykd0ogb2rai4.vekpFI4d1Nc4fakF(new QwPxr2jx1iGLmehgkv3g(ZWT4Q2gfG7cBDIhWQsfN.class, Executor.class)));
            default:
                return new rPTA1zWZR3GTVlGPw((Executor) inivykd0ogb2rai4.vekpFI4d1Nc4fakF(new QwPxr2jx1iGLmehgkv3g(GFeyKt8p4Qhv.class, Executor.class)));
        }
    }
}
