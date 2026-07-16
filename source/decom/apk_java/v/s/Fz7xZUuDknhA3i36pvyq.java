package v.s;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class Fz7xZUuDknhA3i36pvyq extends FZ1sl4mHq4J0hOEYC {
    public static String iUQk66nAiXgO35(String str) {
        if (BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listAjrMZmky8AIb2Pr = KgSM0TsKUpCiuePB.ajrMZmky8AIb2Pr(str);
        int length = str.length();
        listAjrMZmky8AIb2Pr.size();
        int iEWUjsTERgdPbSw3NNlN = Aqh0grSwgDbwr.EWUjsTERgdPbSw3NNlN(listAjrMZmky8AIb2Pr);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listAjrMZmky8AIb2Pr) {
            int i2 = i + 1;
            String strSubstring = null;
            if (i < 0) {
                Aqh0grSwgDbwr.O2DHNSIGZlgPja7eqLgn();
                throw null;
            }
            String str2 = (String) obj;
            if ((i != 0 && i != iEWUjsTERgdPbSw3NNlN) || !BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(str2)) {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!OFMrQsTe5s1KYV0lq.gIIiyi2ddlMDR0(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1 && str2.startsWith("|", i3)) {
                    strSubstring = str2.substring("|".length() + i3);
                }
                if (strSubstring == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList.add(strSubstring);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        imhBI9RqzETHtVIJe.k84rwRrqzhrNQ1CdNQ9(arrayList, sb, "\n", "", "", null);
        return sb.toString();
    }
}
