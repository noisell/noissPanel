package v.s;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class BS2kx9eAoOyDiNGAFlFk extends VRUWMIt9DMXCmdEpyK46 {
    public static boolean A1BaTVAMeIXMnh(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equalsIgnoreCase(str2);
    }

    public static String MSGkxvPxRYNqC(String str, String str2, String str3) {
        int iYIgR6F2ZXmLx2ul = KgSM0TsKUpCiuePB.YIgR6F2ZXmLx2ul(str, str2, 0, false);
        if (iYIgR6F2ZXmLx2ul < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str, i2, iYIgR6F2ZXmLx2ul);
            sb.append(str3);
            i2 = iYIgR6F2ZXmLx2ul + length;
            if (iYIgR6F2ZXmLx2ul >= str.length()) {
                break;
            }
            iYIgR6F2ZXmLx2ul = KgSM0TsKUpCiuePB.YIgR6F2ZXmLx2ul(str, str2, iYIgR6F2ZXmLx2ul + i, false);
        } while (iYIgR6F2ZXmLx2ul > 0);
        sb.append((CharSequence) str, i2, str.length());
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    public static boolean euF5Udt5Rqv3Qmea(CharSequence charSequence) {
        ?? r1 = (-55) + 56;
        if (charSequence.length() != 0) {
            Iterable vUjeMiNYIJhgmVJopga = new VUjeMiNYIJhgmVJopga(0, charSequence.length() - r1, r1);
            if (!(vUjeMiNYIJhgmVJopga instanceof Collection) || !((Collection) vUjeMiNYIJhgmVJopga).isEmpty()) {
                Iterator it = vUjeMiNYIJhgmVJopga.iterator();
                while (it.hasNext()) {
                    if (!OFMrQsTe5s1KYV0lq.gIIiyi2ddlMDR0(charSequence.charAt(((xH380dEhDsa5zwemTP) it).nextInt()))) {
                        return false;
                    }
                }
            }
        }
        return r1;
    }

    private static /* synthetic */ void pjzwxjoyxb() {
    }

    public static String qfTrc75xwRVMl85vh(String str, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
        }
        if (i == 0) {
            return "";
        }
        if (i == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length != 1) {
            StringBuilder sb = new StringBuilder(str.length() * i);
            xH380dEhDsa5zwemTP it = new VUjeMiNYIJhgmVJopga(1, i, 1).iterator();
            while (it.JXn4Qf7zpnLjP5) {
                it.nextInt();
                sb.append((CharSequence) str);
            }
            return sb.toString();
        }
        char cCharAt = str.charAt(0);
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = cCharAt;
        }
        return new String(cArr);
    }
}
