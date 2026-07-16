package v.s;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class ULO76INtY6ygYJ {
    public static final ULO76INtY6ygYJ Ee8d2j4S9Vm5yGuR;
    public static final Set JXn4Qf7zpnLjP5;
    public static final String vekpFI4d1Nc4fakF = SbxdZ6Kq2uhHQ5RPRqm.K7eEOBPYP9VIoHWTe("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
    public final String dDIMxZXP1V8HdM;
    public final String w9sT1Swbhx3hs;

    static {
        String strK7eEOBPYP9VIoHWTe = SbxdZ6Kq2uhHQ5RPRqm.K7eEOBPYP9VIoHWTe("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strK7eEOBPYP9VIoHWTe2 = SbxdZ6Kq2uhHQ5RPRqm.K7eEOBPYP9VIoHWTe("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        JXn4Qf7zpnLjP5 = Collections.unmodifiableSet(new HashSet(Arrays.asList(new DixbgjZDrgKGsYk0Hj("proto"), new DixbgjZDrgKGsYk0Hj("json"))));
        Ee8d2j4S9Vm5yGuR = new ULO76INtY6ygYJ(strK7eEOBPYP9VIoHWTe, strK7eEOBPYP9VIoHWTe2);
    }

    public ULO76INtY6ygYJ(String str, String str2) {
        this.dDIMxZXP1V8HdM = str;
        this.w9sT1Swbhx3hs = str2;
    }

    public static ULO76INtY6ygYJ dDIMxZXP1V8HdM(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new ULO76INtY6ygYJ(str2, str3);
    }

    private static /* synthetic */ void tacldsev() {
    }
}
