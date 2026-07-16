package v.s;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class c3iEN8plP13UDv9MQvT implements HostnameVerifier {
    public static final c3iEN8plP13UDv9MQvT dDIMxZXP1V8HdM = new c3iEN8plP13UDv9MQvT();

    public static List dDIMxZXP1V8HdM(X509Certificate x509Certificate, int i) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames != null) {
                ArrayList arrayList = new ArrayList();
                for (List<?> list : subjectAlternativeNames) {
                    if (list != null && list.size() >= 2 && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                        arrayList.add((String) obj);
                    }
                }
                return arrayList;
            }
        } catch (CertificateParsingException unused) {
        }
        return qkzRt1s9DJNNYwsqt.w9sT1Swbhx3hs;
    }

    private static /* synthetic */ void kekm() {
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00ed  */
    public static boolean vekpFI4d1Nc4fakF(String str, X509Certificate x509Certificate) {
        boolean zW9sT1Swbhx3hs;
        int length;
        if (yrMnf4fyLGfIJbMg8IbG.Ee8d2j4S9Vm5yGuR.w9sT1Swbhx3hs(str)) {
            String strH9XlUr4OeMJFiXK = y6jRGLEWNMir.H9XlUr4OeMJFiXK(str);
            List listDDIMxZXP1V8HdM = dDIMxZXP1V8HdM(x509Certificate, 7);
            if (!listDDIMxZXP1V8HdM.isEmpty()) {
                Iterator it = listDDIMxZXP1V8HdM.iterator();
                while (it.hasNext()) {
                    if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strH9XlUr4OeMJFiXK, y6jRGLEWNMir.H9XlUr4OeMJFiXK((String) it.next()))) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (w9sT1Swbhx3hs(str)) {
            str = str.toLowerCase(Locale.US);
        }
        List<String> listDDIMxZXP1V8HdM2 = dDIMxZXP1V8HdM(x509Certificate, 2);
        if (!listDDIMxZXP1V8HdM2.isEmpty()) {
            for (String lowerCase : listDDIMxZXP1V8HdM2) {
                if (str.length() == 0 || str.startsWith(".") || str.endsWith("..") || lowerCase == null || lowerCase.length() == 0 || lowerCase.startsWith(".") || lowerCase.endsWith("..")) {
                    zW9sT1Swbhx3hs = false;
                } else {
                    String strConcat = !str.endsWith(".") ? str.concat(".") : str;
                    if (!lowerCase.endsWith(".")) {
                        lowerCase = lowerCase.concat(".");
                    }
                    if (w9sT1Swbhx3hs(lowerCase)) {
                        lowerCase = lowerCase.toLowerCase(Locale.US);
                    }
                    if (!KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, "*", false)) {
                        zW9sT1Swbhx3hs = okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strConcat, lowerCase);
                    } else if (!lowerCase.startsWith("*.") || KgSM0TsKUpCiuePB.JW3Lh9hxwLsO2ArTlH(lowerCase, '*', 1, 4) != -1 || strConcat.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                        zW9sT1Swbhx3hs = false;
                    } else {
                        String strSubstring = lowerCase.substring(1);
                        if (strConcat.endsWith(strSubstring) && ((length = strConcat.length() - strSubstring.length()) <= 0 || KgSM0TsKUpCiuePB.UoxIZOBVZaubOFdPNaXK(strConcat, '.', length - 1, 4) == -1)) {
                            zW9sT1Swbhx3hs = true;
                        } else {
                            zW9sT1Swbhx3hs = false;
                        }
                    }
                }
                if (zW9sT1Swbhx3hs) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean w9sT1Swbhx3hs(String str) {
        int i;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            throw new IllegalArgumentException(Y9mRyRdkl5FOcwb66V6.b1EoSIRjJHO5("endIndex < beginIndex: ", " < 0", length2).toString());
        }
        if (length2 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + length2 + " > " + str.length()).toString());
        }
        long j = 0;
        int i2 = 0;
        while (i2 < length2) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 40 + 88) {
                j++;
            } else {
                if (cCharAt < 2048) {
                    i = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i = 3;
                } else {
                    int i3 = i2 + 1;
                    char cCharAt2 = i3 < length2 ? str.charAt(i3) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j++;
                        i2 = i3;
                    } else {
                        j += (long) 4;
                        i2 += 2;
                    }
                }
                j += (long) i;
            }
            i2++;
        }
        return length == ((int) j);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        if (w9sT1Swbhx3hs(str)) {
            try {
                return vekpFI4d1Nc4fakF(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
