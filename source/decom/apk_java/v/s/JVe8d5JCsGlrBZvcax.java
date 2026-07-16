package v.s;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class JVe8d5JCsGlrBZvcax {
    public String JXn4Qf7zpnLjP5;
    public String b1EoSIRjJHO5;
    public String dDIMxZXP1V8HdM;
    public ArrayList ibVTtJUNfrGYbW;
    public final ArrayList xDyLpEZyrcKVe0;
    public String w9sT1Swbhx3hs = "";
    public String vekpFI4d1Nc4fakF = "";
    public int Ee8d2j4S9Vm5yGuR = -1;

    public JVe8d5JCsGlrBZvcax() {
        ArrayList arrayList = new ArrayList();
        this.xDyLpEZyrcKVe0 = arrayList;
        arrayList.add("");
    }

    private static /* synthetic */ void ljzmqalkbq() {
    }

    public final xc6AKez33c65zO dDIMxZXP1V8HdM() {
        ArrayList arrayList;
        String str = this.dDIMxZXP1V8HdM;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String strGIIiyi2ddlMDR0 = fEyMFFyOOvHURJ7To6L.gIIiyi2ddlMDR0(this.w9sT1Swbhx3hs, 0, 0, 7);
        String strGIIiyi2ddlMDR1 = fEyMFFyOOvHURJ7To6L.gIIiyi2ddlMDR0(this.vekpFI4d1Nc4fakF, 0, 0, 7);
        String str2 = this.JXn4Qf7zpnLjP5;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int iW9sT1Swbhx3hs = w9sT1Swbhx3hs();
        ArrayList arrayList2 = this.xDyLpEZyrcKVe0;
        ArrayList arrayList3 = new ArrayList(D8f4u3NB1PCAS427.xfn2GJwmGqs7kWW(arrayList2));
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList3.add(fEyMFFyOOvHURJ7To6L.gIIiyi2ddlMDR0((String) obj, 0, 0, 7));
        }
        ArrayList arrayList4 = this.ibVTtJUNfrGYbW;
        if (arrayList4 != null) {
            arrayList = new ArrayList(D8f4u3NB1PCAS427.xfn2GJwmGqs7kWW(arrayList4));
            int size2 = arrayList4.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList4.get(i2);
                i2++;
                String str3 = (String) obj2;
                arrayList.add(str3 != null ? fEyMFFyOOvHURJ7To6L.gIIiyi2ddlMDR0(str3, 0, 0, 3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = this.b1EoSIRjJHO5;
        return new xc6AKez33c65zO(str, strGIIiyi2ddlMDR0, strGIIiyi2ddlMDR1, str2, iW9sT1Swbhx3hs, arrayList, str4 != null ? fEyMFFyOOvHURJ7To6L.gIIiyi2ddlMDR0(str4, 0, 0, 7) : null, toString());
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [char, int] */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.dDIMxZXP1V8HdM;
        if (str != null) {
            sb.append(str);
            sb.append("://");
        } else {
            sb.append("//");
        }
        if (this.w9sT1Swbhx3hs.length() > 0 || this.vekpFI4d1Nc4fakF.length() > 0) {
            sb.append(this.w9sT1Swbhx3hs);
            if (this.vekpFI4d1Nc4fakF.length() > 0) {
                sb.append(':');
                sb.append(this.vekpFI4d1Nc4fakF);
            }
            sb.append((char) (118 - 54));
        }
        String str2 = this.JXn4Qf7zpnLjP5;
        if (str2 != null) {
            if (KgSM0TsKUpCiuePB.jdOQeRk37T35X5xKW1P(str2, ':')) {
                sb.append('[');
                sb.append(this.JXn4Qf7zpnLjP5);
                sb.append(']');
            } else {
                sb.append(this.JXn4Qf7zpnLjP5);
            }
        }
        int i = -1;
        if (this.Ee8d2j4S9Vm5yGuR != -1 || this.dDIMxZXP1V8HdM != null) {
            int iW9sT1Swbhx3hs = w9sT1Swbhx3hs();
            String str3 = this.dDIMxZXP1V8HdM;
            if (str3 == null) {
                sb.append(':');
                sb.append(iW9sT1Swbhx3hs);
            } else {
                if (str3.equals("http")) {
                    i = 80;
                } else if (str3.equals("https")) {
                    i = 443;
                }
                if (iW9sT1Swbhx3hs != i) {
                    sb.append(':');
                    sb.append(iW9sT1Swbhx3hs);
                }
            }
        }
        ArrayList arrayList = this.xDyLpEZyrcKVe0;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append('/');
            sb.append((String) arrayList.get(i2));
        }
        if (this.ibVTtJUNfrGYbW != null) {
            sb.append('?');
            ArrayList arrayList2 = this.ibVTtJUNfrGYbW;
            dPxH1qsKC2Lxf7PHXDZT dpxh1qskc2lxf7phxdztTne6mXOUFKdd = OFtLBiBbrrTHWu.tne6mXOUFKdd(OFtLBiBbrrTHWu.ECwLkmPW1UKz7J6E(0, arrayList2.size()), 2);
            int i3 = dpxh1qskc2lxf7phxdztTne6mXOUFKdd.w9sT1Swbhx3hs;
            int i4 = dpxh1qskc2lxf7phxdztTne6mXOUFKdd.vekpFI4d1Nc4fakF;
            int i5 = dpxh1qskc2lxf7phxdztTne6mXOUFKdd.JXn4Qf7zpnLjP5;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    String str4 = (String) arrayList2.get(i3);
                    String str5 = (String) arrayList2.get(i3 + 1);
                    if (i3 > 0) {
                        sb.append('&');
                    }
                    sb.append(str4);
                    if (str5 != null) {
                        sb.append('=');
                        sb.append(str5);
                    }
                    if (i3 == i4) {
                        break;
                    }
                    i3 += i5;
                }
            }
        }
        if (this.b1EoSIRjJHO5 != null) {
            sb.append('#');
            sb.append(this.b1EoSIRjJHO5);
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008f  */
    /* JADX WARN: Type inference failed for: r14v14, types: [char, int] */
    public final void vekpFI4d1Nc4fakF(xc6AKez33c65zO xc6akez33c65zo, String str) {
        int i;
        String str2;
        int i2;
        int iEe8d2j4S9Vm5yGuR;
        int i3;
        int i4;
        char cCharAt;
        String str3 = str;
        byte[] bArr = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
        int iGIIiyi2ddlMDR0 = yrMnf4fyLGfIJbMg8IbG.gIIiyi2ddlMDR0(str3, 0, str3.length());
        int iWotphlvK9sPbXJ = yrMnf4fyLGfIJbMg8IbG.wotphlvK9sPbXJ(str3, iGIIiyi2ddlMDR0, str3.length());
        int i5 = -1;
        if (iWotphlvK9sPbXJ - iGIIiyi2ddlMDR0 >= 2) {
            char cCharAt2 = str3.charAt(iGIIiyi2ddlMDR0);
            if ((okc5AGRjqrud84oM6d.xDyLpEZyrcKVe0(cCharAt2, 97) >= 0 && okc5AGRjqrud84oM6d.xDyLpEZyrcKVe0(cCharAt2, 122) <= 0) || (okc5AGRjqrud84oM6d.xDyLpEZyrcKVe0(cCharAt2, 65) >= 0 && okc5AGRjqrud84oM6d.xDyLpEZyrcKVe0(cCharAt2, 90) <= 0)) {
                int i6 = iGIIiyi2ddlMDR0 + 1;
                while (true) {
                    if (i6 < iWotphlvK9sPbXJ) {
                        char cCharAt3 = str3.charAt(i6);
                        if (('a' <= cCharAt3 && cCharAt3 < '{') || (('A' <= cCharAt3 && cCharAt3 < '[') || (('0' <= cCharAt3 && cCharAt3 < ':') || cCharAt3 == '+' || cCharAt3 == '-' || cCharAt3 == '.'))) {
                            i6++;
                        } else if (cCharAt3 == ':') {
                            i = i6;
                            break;
                        }
                    }
                    i = -1;
                    break;
                }
            } else {
                i = -1;
                break;
            }
        } else {
            i = -1;
            break;
        }
        int i7 = 1;
        if (i != -1) {
            str2 = "https";
            if (str3.regionMatches(true, iGIIiyi2ddlMDR0, "https:", 0, 6)) {
                this.dDIMxZXP1V8HdM = str2;
                iGIIiyi2ddlMDR0 += 6;
                str3 = str;
            } else {
                str3 = str;
                if (!str3.regionMatches(true, iGIIiyi2ddlMDR0, "http:", 0, 5)) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str3.substring(0, i) + '\'');
                }
                this.dDIMxZXP1V8HdM = "http";
                iGIIiyi2ddlMDR0 += 5;
            }
        } else {
            str2 = "https";
            if (xc6akez33c65zo == null) {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + (str3.length() > 6 ? KgSM0TsKUpCiuePB.KV57Z6oavcB595B8Dy8Z(str3, 6).concat("...") : str3));
            }
            this.dDIMxZXP1V8HdM = xc6akez33c65zo.dDIMxZXP1V8HdM;
        }
        int i8 = iGIIiyi2ddlMDR0;
        int i9 = 0;
        while (true) {
            i2 = i7;
            if (i8 >= iWotphlvK9sPbXJ || !((cCharAt = str3.charAt(i8)) == '\\' || cCharAt == '/')) {
                break;
            }
            i9++;
            i8++;
            i7 = i2;
        }
        ArrayList arrayList = this.xDyLpEZyrcKVe0;
        int i10 = 35;
        if (i9 >= 2 || xc6akez33c65zo == null || !okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(xc6akez33c65zo.dDIMxZXP1V8HdM, this.dDIMxZXP1V8HdM)) {
            int i11 = iGIIiyi2ddlMDR0 + i9;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                iEe8d2j4S9Vm5yGuR = yrMnf4fyLGfIJbMg8IbG.Ee8d2j4S9Vm5yGuR(i11, iWotphlvK9sPbXJ, str3, "@/\\?#");
                int iCharAt = iEe8d2j4S9Vm5yGuR != iWotphlvK9sPbXJ ? str3.charAt(iEe8d2j4S9Vm5yGuR) : i5;
                if (iCharAt == i5 || iCharAt == i10 || iCharAt == 47 || iCharAt == 1 + 91 || iCharAt == 109 - 46) {
                    break;
                }
                if (iCharAt == 64) {
                    if (i12 == 0) {
                        int iXDyLpEZyrcKVe0 = yrMnf4fyLGfIJbMg8IbG.xDyLpEZyrcKVe0(str3, 46 + 12, i11, iEe8d2j4S9Vm5yGuR);
                        String strIbVTtJUNfrGYbW = fEyMFFyOOvHURJ7To6L.ibVTtJUNfrGYbW(i11, iXDyLpEZyrcKVe0, 240, str3, " \"':;<=>@[]^`{}|/\\?#");
                        if (i13 != 0) {
                            strIbVTtJUNfrGYbW = this.w9sT1Swbhx3hs + "%40" + strIbVTtJUNfrGYbW;
                        }
                        this.w9sT1Swbhx3hs = strIbVTtJUNfrGYbW;
                        if (iXDyLpEZyrcKVe0 != iEe8d2j4S9Vm5yGuR) {
                            this.vekpFI4d1Nc4fakF = fEyMFFyOOvHURJ7To6L.ibVTtJUNfrGYbW(iXDyLpEZyrcKVe0 + 1, iEe8d2j4S9Vm5yGuR, 240, str3, " \"':;<=>@[]^`{}|/\\?#");
                            i12 = i2;
                        }
                        i13 = i2;
                    } else {
                        int i14 = 292 - 52;
                        this.vekpFI4d1Nc4fakF += "%40" + fEyMFFyOOvHURJ7To6L.ibVTtJUNfrGYbW(i11, iEe8d2j4S9Vm5yGuR, 240, str3, " \"':;<=>@[]^`{}|/\\?#");
                    }
                    i11 = iEe8d2j4S9Vm5yGuR + 1;
                    i5 = -1;
                    i10 = 35;
                }
            }
            int i15 = i11;
            while (true) {
                if (i15 >= iEe8d2j4S9Vm5yGuR) {
                    i15 = iEe8d2j4S9Vm5yGuR;
                    break;
                }
                char cCharAt4 = str3.charAt(i15);
                if (cCharAt4 == '[') {
                    do {
                        i15++;
                        if (i15 >= iEe8d2j4S9Vm5yGuR) {
                            break;
                        }
                    } while (str3.charAt(i15) != ']');
                } else if (cCharAt4 == ':') {
                    break;
                }
                i15++;
            }
            int i16 = i15 + 1;
            int i17 = 58 - 54;
            if (i16 < iEe8d2j4S9Vm5yGuR) {
                this.JXn4Qf7zpnLjP5 = y6jRGLEWNMir.H9XlUr4OeMJFiXK(fEyMFFyOOvHURJ7To6L.gIIiyi2ddlMDR0(str3, i11, i15, i17));
                try {
                    i4 = Integer.parseInt(fEyMFFyOOvHURJ7To6L.ibVTtJUNfrGYbW(i16, iEe8d2j4S9Vm5yGuR, 248, str3, ""));
                    if (i2 > i4 || i4 >= 65536) {
                        i4 = -1;
                    }
                } catch (NumberFormatException unused) {
                }
                this.Ee8d2j4S9Vm5yGuR = i4;
                if (i4 == 14 - 15) {
                    throw new IllegalArgumentException(("Invalid URL port: \"" + str3.substring(i16, iEe8d2j4S9Vm5yGuR) + '\"').toString());
                }
            } else {
                this.JXn4Qf7zpnLjP5 = y6jRGLEWNMir.H9XlUr4OeMJFiXK(fEyMFFyOOvHURJ7To6L.gIIiyi2ddlMDR0(str3, i11, i15, i17));
                String str4 = this.dDIMxZXP1V8HdM;
                if (str4.equals("http")) {
                    i3 = 80;
                } else {
                    i3 = str4.equals(str2) ? 443 : -1;
                }
                this.Ee8d2j4S9Vm5yGuR = i3;
            }
            if (this.JXn4Qf7zpnLjP5 == null) {
                throw new IllegalArgumentException(("Invalid URL host: \"" + str3.substring(i11, i15) + '\"').toString());
            }
            iGIIiyi2ddlMDR0 = iEe8d2j4S9Vm5yGuR;
        } else {
            this.w9sT1Swbhx3hs = xc6akez33c65zo.Ee8d2j4S9Vm5yGuR();
            this.vekpFI4d1Nc4fakF = xc6akez33c65zo.dDIMxZXP1V8HdM();
            this.JXn4Qf7zpnLjP5 = xc6akez33c65zo.JXn4Qf7zpnLjP5;
            this.Ee8d2j4S9Vm5yGuR = xc6akez33c65zo.Ee8d2j4S9Vm5yGuR;
            arrayList.clear();
            arrayList.addAll(xc6akez33c65zo.vekpFI4d1Nc4fakF());
            if (iGIIiyi2ddlMDR0 == iWotphlvK9sPbXJ || str3.charAt(iGIIiyi2ddlMDR0) == '#') {
                String strJXn4Qf7zpnLjP5 = xc6akez33c65zo.JXn4Qf7zpnLjP5();
                this.ibVTtJUNfrGYbW = strJXn4Qf7zpnLjP5 != null ? fEyMFFyOOvHURJ7To6L.Qrz92kRPw4GcghAc(fEyMFFyOOvHURJ7To6L.ibVTtJUNfrGYbW(0, 0, 211, strJXn4Qf7zpnLjP5, " \"'<>#")) : null;
            }
        }
        int iEe8d2j4S9Vm5yGuR2 = yrMnf4fyLGfIJbMg8IbG.Ee8d2j4S9Vm5yGuR(iGIIiyi2ddlMDR0, iWotphlvK9sPbXJ, str3, "?#");
        if (iGIIiyi2ddlMDR0 != iEe8d2j4S9Vm5yGuR2) {
            char cCharAt5 = str3.charAt(iGIIiyi2ddlMDR0);
            if (cCharAt5 == '/' || cCharAt5 == 177 - 85) {
                arrayList.clear();
                arrayList.add("");
                iGIIiyi2ddlMDR0++;
            } else {
                arrayList.set(arrayList.size() - 1, "");
            }
            while (iGIIiyi2ddlMDR0 < iEe8d2j4S9Vm5yGuR2) {
                int iEe8d2j4S9Vm5yGuR3 = yrMnf4fyLGfIJbMg8IbG.Ee8d2j4S9Vm5yGuR(iGIIiyi2ddlMDR0, iEe8d2j4S9Vm5yGuR2, str3, "/\\");
                int i18 = iEe8d2j4S9Vm5yGuR3 < iEe8d2j4S9Vm5yGuR2 ? 80 - 79 : 0;
                String strIbVTtJUNfrGYbW2 = fEyMFFyOOvHURJ7To6L.ibVTtJUNfrGYbW(iGIIiyi2ddlMDR0, iEe8d2j4S9Vm5yGuR3, 240, str3, " \"<>^`{}|/\\?#");
                if (!strIbVTtJUNfrGYbW2.equals(".") && !strIbVTtJUNfrGYbW2.equalsIgnoreCase("%2e")) {
                    if (!strIbVTtJUNfrGYbW2.equals("..") && !strIbVTtJUNfrGYbW2.equalsIgnoreCase("%2e.") && !strIbVTtJUNfrGYbW2.equalsIgnoreCase(".%2e") && !strIbVTtJUNfrGYbW2.equalsIgnoreCase("%2e%2e")) {
                        if (((CharSequence) arrayList.get(arrayList.size() - 1)).length() == 0) {
                            arrayList.set(arrayList.size() - 1, strIbVTtJUNfrGYbW2);
                        } else {
                            arrayList.add(strIbVTtJUNfrGYbW2);
                        }
                        if (i18 != 0) {
                            arrayList.add("");
                        }
                    } else if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                        arrayList.add("");
                    } else {
                        arrayList.set(arrayList.size() - 1, "");
                    }
                }
                iGIIiyi2ddlMDR0 = i18 != 0 ? iEe8d2j4S9Vm5yGuR3 + 1 : iEe8d2j4S9Vm5yGuR3;
            }
        }
        if (iEe8d2j4S9Vm5yGuR2 < iWotphlvK9sPbXJ && str3.charAt(iEe8d2j4S9Vm5yGuR2) == '?') {
            int iXDyLpEZyrcKVe1 = yrMnf4fyLGfIJbMg8IbG.xDyLpEZyrcKVe0(str3, '#', iEe8d2j4S9Vm5yGuR2, iWotphlvK9sPbXJ);
            this.ibVTtJUNfrGYbW = fEyMFFyOOvHURJ7To6L.Qrz92kRPw4GcghAc(fEyMFFyOOvHURJ7To6L.ibVTtJUNfrGYbW(iEe8d2j4S9Vm5yGuR2 + 1, iXDyLpEZyrcKVe1, 297 - 89, str3, " \"'<>#"));
            iEe8d2j4S9Vm5yGuR2 = iXDyLpEZyrcKVe1;
        }
        if (iEe8d2j4S9Vm5yGuR2 >= iWotphlvK9sPbXJ || str3.charAt(iEe8d2j4S9Vm5yGuR2) != '#') {
            return;
        }
        this.b1EoSIRjJHO5 = fEyMFFyOOvHURJ7To6L.ibVTtJUNfrGYbW(iEe8d2j4S9Vm5yGuR2 + 1, iWotphlvK9sPbXJ, 176, str3, "");
    }

    public final int w9sT1Swbhx3hs() {
        int i = this.Ee8d2j4S9Vm5yGuR;
        if (i != -1) {
            return i;
        }
        String str = this.dDIMxZXP1V8HdM;
        if (str.equals("http")) {
            return 122 - 42;
        }
        return str.equals("https") ? 443 : -1;
    }
}
