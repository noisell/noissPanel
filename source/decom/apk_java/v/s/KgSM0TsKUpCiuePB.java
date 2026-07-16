package v.s;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class KgSM0TsKUpCiuePB extends BS2kx9eAoOyDiNGAFlFk {
    public static final int GiffeZJ1rbwyx(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        dPxH1qsKC2Lxf7PHXDZT dpxh1qskc2lxf7phxdzt;
        CharSequence charSequence3 = charSequence2;
        int i3 = i;
        int i4 = i2;
        if (z2) {
            int iDQC4QhgRN3MSEAP3HW0 = dQC4QhgRN3MSEAP3HW0(charSequence);
            if (i3 > iDQC4QhgRN3MSEAP3HW0) {
                i3 = iDQC4QhgRN3MSEAP3HW0;
            }
            if (i4 < 0) {
                i4 = 0;
            }
            dpxh1qskc2lxf7phxdzt = new dPxH1qsKC2Lxf7PHXDZT(i3, i4, -1);
        } else {
            if (i3 < 0) {
                i3 = 0;
            }
            int length = charSequence.length();
            if (i4 > length) {
                i4 = length;
            }
            dpxh1qskc2lxf7phxdzt = new VUjeMiNYIJhgmVJopga(i3, i4, 1);
        }
        boolean z3 = charSequence instanceof String;
        int i5 = dpxh1qskc2lxf7phxdzt.JXn4Qf7zpnLjP5;
        int i6 = dpxh1qskc2lxf7phxdzt.vekpFI4d1Nc4fakF;
        int i7 = dpxh1qskc2lxf7phxdzt.w9sT1Swbhx3hs;
        if (z3 && (charSequence3 instanceof String)) {
            if ((i5 > 0 && i7 <= i6) || (i5 < 0 && i6 <= i7)) {
                int i8 = i7;
                while (true) {
                    String str = (String) charSequence3;
                    String str2 = (String) charSequence;
                    int length2 = str.length();
                    if (!(!z ? str.regionMatches(0, str2, i8, length2) : str.regionMatches(z, 0, str2, i8, length2))) {
                        if (i8 == i6) {
                            break;
                        }
                        i8 += i5;
                    } else {
                        return i8;
                    }
                }
            }
        } else if ((i5 > 0 && i7 <= i6) || (i5 < 0 && i6 <= i7)) {
            int i9 = i7;
            while (!uCN4HERvZEfG7JjL(charSequence3, 0, charSequence, i9, charSequence3.length(), z)) {
                if (i9 != i6) {
                    i9 += i5;
                    charSequence3 = charSequence2;
                }
            }
            return i9;
        }
        return -1;
    }

    public static int JW3Lh9hxwLsO2ArTlH(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return !(charSequence instanceof String) ? Yrf7mWjzxCbCCUcSPwXl(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    public static List K5l5kmuyJzrgUX(String str, String[] strArr) {
        if (strArr.length == 1) {
            String str2 = strArr[0];
            if (str2.length() != 0) {
                return qiOhdF48gPbc(str, str2);
            }
        }
        OnBMI8c4mp1s6ungV onBMI8c4mp1s6ungV = new OnBMI8c4mp1s6ungV(n8nqApvKDYz7s8llJ2jf(str, strArr));
        ArrayList arrayList = new ArrayList(D8f4u3NB1PCAS427.xfn2GJwmGqs7kWW(onBMI8c4mp1s6ungV));
        Iterator it = onBMI8c4mp1s6ungV.iterator();
        while (true) {
            UxsegpVbLALY0JXydR uxsegpVbLALY0JXydR = (UxsegpVbLALY0JXydR) it;
            if (!uxsegpVbLALY0JXydR.hasNext()) {
                return arrayList;
            }
            VUjeMiNYIJhgmVJopga vUjeMiNYIJhgmVJopga = (VUjeMiNYIJhgmVJopga) uxsegpVbLALY0JXydR.next();
            arrayList.add(str.subSequence(vUjeMiNYIJhgmVJopga.w9sT1Swbhx3hs, vUjeMiNYIJhgmVJopga.vekpFI4d1Nc4fakF + 1).toString());
        }
    }

    public static String KV57Z6oavcB595B8Dy8Z(String str, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(Y9mRyRdkl5FOcwb66V6.b1EoSIRjJHO5("Requested character count ", " is less than zero.", i).toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    public static String OYRwk007Mtyi(String str, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(Y9mRyRdkl5FOcwb66V6.b1EoSIRjJHO5("Requested character count ", " is less than zero.", i).toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(length - i);
    }

    public static String PPWVWMPAUcr9AGNUSxQ(String str, String str2) {
        int iUoxIZOBVZaubOFdPNaXK = UoxIZOBVZaubOFdPNaXK(str, '.', 0, 6);
        return iUoxIZOBVZaubOFdPNaXK == -1 ? str2 : str.substring(iUoxIZOBVZaubOFdPNaXK + 1, str.length());
    }

    public static String Q7qC5ia93qGCjkBXCF0A(String str, String str2) {
        return SZMVQHSLEmk3KzoEzyls(str2, str) ? str.substring(str2.length()) : str;
    }

    public static boolean SZMVQHSLEmk3KzoEzyls(CharSequence charSequence, String str) {
        return (str == null || !(charSequence instanceof String)) ? uCN4HERvZEfG7JjL(str, 0, charSequence, 0, charSequence.length(), false) : str.startsWith((String) charSequence);
    }

    public static String SggvLZZelD4B3v(String str, String str2) {
        int iBbLLF31we2Iu = bbLLF31we2Iu(str, str2, 0, false, 6);
        return iBbLLF31we2Iu == -1 ? str : str.substring(str2.length() + iBbLLF31we2Iu, str.length());
    }

    public static int UoxIZOBVZaubOFdPNaXK(String str, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = dQC4QhgRN3MSEAP3HW0(str);
        }
        if (str != null) {
            return str.lastIndexOf(c, i);
        }
        char[] cArr = {c};
        if (str != null) {
            return str.lastIndexOf(cArr[0], i);
        }
        int iDQC4QhgRN3MSEAP3HW0 = dQC4QhgRN3MSEAP3HW0(str);
        if (i > iDQC4QhgRN3MSEAP3HW0) {
            i = iDQC4QhgRN3MSEAP3HW0;
        }
        while (-1 < i) {
            if (OFMrQsTe5s1KYV0lq.D5P1xCAyuvgF(cArr[0], str.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static boolean VEkRsTDS6a9oHWI(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        if (charSequence2 instanceof String) {
            if (bbLLF31we2Iu(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
                return true;
            }
        } else if (GiffeZJ1rbwyx(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }

    public static final int YIgR6F2ZXmLx2ul(CharSequence charSequence, String str, int i, boolean z) {
        return (z || !(charSequence instanceof String)) ? GiffeZJ1rbwyx(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    public static final int Yrf7mWjzxCbCCUcSPwXl(CharSequence charSequence, char[] cArr, int i, boolean z) {
        int i2 = 53 - 52;
        if (!z && cArr.length == i2 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != i2) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(cArr[0], i);
        }
        if (i < 0) {
            i = 0;
        }
        xH380dEhDsa5zwemTP xh380dehdsa5zwemtpDDIMxZXP1V8HdM = new VUjeMiNYIJhgmVJopga(i, dQC4QhgRN3MSEAP3HW0(charSequence), i2).iterator();
        while (xh380dehdsa5zwemtpDDIMxZXP1V8HdM.JXn4Qf7zpnLjP5) {
            int iNextInt = xh380dehdsa5zwemtpDDIMxZXP1V8HdM.nextInt();
            char cCharAt = charSequence.charAt(iNextInt);
            for (char c : cArr) {
                if (OFMrQsTe5s1KYV0lq.D5P1xCAyuvgF(c, cCharAt, z)) {
                    return iNextInt;
                }
            }
        }
        return -1;
    }

    public static final List ajrMZmky8AIb2Pr(String str) {
        return V6MzUQ0ByrLAmz0N.A1BaTVAMeIXMnh(new t5I6jdrMX1qc4Tt(n8nqApvKDYz7s8llJ2jf(str, new String[]{"\r\n", "\n", "\r"}), new vekpFI4d1Nc4fakF((-30) + 34, str)));
    }

    public static /* synthetic */ int bbLLF31we2Iu(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return YIgR6F2ZXmLx2ul(charSequence, str, i, z);
    }

    public static final int dQC4QhgRN3MSEAP3HW0(CharSequence charSequence) {
        return charSequence.length() - 1;
    }

    public static List fxMPJzvjKAjA(String str, char[] cArr) {
        int i = (-86) + 87;
        if (cArr.length == i) {
            return qiOhdF48gPbc(str, String.valueOf(cArr[0]));
        }
        OnBMI8c4mp1s6ungV onBMI8c4mp1s6ungV = new OnBMI8c4mp1s6ungV(new t5I6jdrMX1qc4Tt(str, new GMAxgSNlIWpB8atgti(0, cArr)));
        ArrayList arrayList = new ArrayList(D8f4u3NB1PCAS427.xfn2GJwmGqs7kWW(onBMI8c4mp1s6ungV));
        Iterator it = onBMI8c4mp1s6ungV.iterator();
        while (true) {
            UxsegpVbLALY0JXydR uxsegpVbLALY0JXydR = (UxsegpVbLALY0JXydR) it;
            if (!uxsegpVbLALY0JXydR.hasNext()) {
                return arrayList;
            }
            VUjeMiNYIJhgmVJopga vUjeMiNYIJhgmVJopga = (VUjeMiNYIJhgmVJopga) uxsegpVbLALY0JXydR.next();
            arrayList.add(str.subSequence(vUjeMiNYIJhgmVJopga.w9sT1Swbhx3hs, vUjeMiNYIJhgmVJopga.vekpFI4d1Nc4fakF + i).toString());
        }
    }

    public static String gwqvW1YsHBmGtO8bW7F(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        int length = str.length() - 1;
        if (length < 0) {
            charSequenceSubSequence = "";
            break;
        }
        while (true) {
            int i = length - 1;
            char cCharAt = str.charAt(length);
            int length2 = cArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    i2 = -1;
                    break;
                }
                if (cCharAt == cArr[i2]) {
                    break;
                }
                i2++;
            }
            if (!(i2 >= 0)) {
                charSequenceSubSequence = str.subSequence(0, length + 1);
                break;
            }
            if (i < 0) {
                charSequenceSubSequence = "";
                break;
            }
            length = i;
        }
        return charSequenceSubSequence.toString();
    }

    public static boolean jdOQeRk37T35X5xKW1P(CharSequence charSequence, char c) {
        return JW3Lh9hxwLsO2ArTlH(charSequence, c, 0, 2) >= 0;
    }

    public static t5I6jdrMX1qc4Tt n8nqApvKDYz7s8llJ2jf(CharSequence charSequence, String[] strArr) {
        return new t5I6jdrMX1qc4Tt(charSequence, new GMAxgSNlIWpB8atgti(1, Arrays.asList(strArr)));
    }

    public static final List qiOhdF48gPbc(CharSequence charSequence, String str) {
        int iYIgR6F2ZXmLx2ul = YIgR6F2ZXmLx2ul(charSequence, str, 0, false);
        if (iYIgR6F2ZXmLx2ul == -1) {
            return Collections.singletonList(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iYIgR6F2ZXmLx2ul).toString());
            length = str.length() + iYIgR6F2ZXmLx2ul;
            iYIgR6F2ZXmLx2ul = YIgR6F2ZXmLx2ul(charSequence, str, length, false);
        } while (iYIgR6F2ZXmLx2ul != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static char t9CXKrwDxrnFA6g23hZU(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(dQC4QhgRN3MSEAP3HW0(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static final boolean uCN4HERvZEfG7JjL(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!OFMrQsTe5s1KYV0lq.D5P1xCAyuvgF(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static CharSequence uW0IRoPBZMj2QmBkkp(String str) {
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zGIIiyi2ddlMDR0 = OFMrQsTe5s1KYV0lq.gIIiyi2ddlMDR0(str.charAt(!z ? i : length));
            if (z) {
                if (!zGIIiyi2ddlMDR0) {
                    break;
                }
                length--;
            } else if (zGIIiyi2ddlMDR0) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1);
    }
}
