package v.s;

import java.util.Arrays;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class BskzYla6Czi7M64 {
    public static final Pattern JXn4Qf7zpnLjP5 = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    public final String dDIMxZXP1V8HdM;
    public final String vekpFI4d1Nc4fakF;
    public final String w9sT1Swbhx3hs;

    public BskzYla6Czi7M64(String str, String str2) {
        String strSubstring = (str2 == null || !str2.startsWith("/topics/")) ? str2 : str2.substring(8);
        if (strSubstring == null || !JXn4Qf7zpnLjP5.matcher(strSubstring).matches()) {
            throw new IllegalArgumentException("Invalid topic name: " + strSubstring + " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}.");
        }
        this.dDIMxZXP1V8HdM = strSubstring;
        this.w9sT1Swbhx3hs = str;
        this.vekpFI4d1Nc4fakF = str + "!" + str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BskzYla6Czi7M64)) {
            return false;
        }
        BskzYla6Czi7M64 bskzYla6Czi7M64 = (BskzYla6Czi7M64) obj;
        return this.dDIMxZXP1V8HdM.equals(bskzYla6Czi7M64.dDIMxZXP1V8HdM) && this.w9sT1Swbhx3hs.equals(bskzYla6Czi7M64.w9sT1Swbhx3hs);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.w9sT1Swbhx3hs, this.dDIMxZXP1V8HdM});
    }
}
