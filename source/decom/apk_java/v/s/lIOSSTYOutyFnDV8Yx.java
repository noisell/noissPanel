package v.s;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class lIOSSTYOutyFnDV8Yx {
    public final DixbgjZDrgKGsYk0Hj dDIMxZXP1V8HdM;
    public final byte[] w9sT1Swbhx3hs;

    public lIOSSTYOutyFnDV8Yx(DixbgjZDrgKGsYk0Hj dixbgjZDrgKGsYk0Hj, byte[] bArr) {
        if (dixbgjZDrgKGsYk0Hj == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.dDIMxZXP1V8HdM = dixbgjZDrgKGsYk0Hj;
        this.w9sT1Swbhx3hs = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lIOSSTYOutyFnDV8Yx)) {
            return false;
        }
        lIOSSTYOutyFnDV8Yx liosstyoutyfndv8yx = (lIOSSTYOutyFnDV8Yx) obj;
        if (this.dDIMxZXP1V8HdM.equals(liosstyoutyfndv8yx.dDIMxZXP1V8HdM)) {
            return Arrays.equals(this.w9sT1Swbhx3hs, liosstyoutyfndv8yx.w9sT1Swbhx3hs);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.dDIMxZXP1V8HdM.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.w9sT1Swbhx3hs);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.dDIMxZXP1V8HdM + ", bytes=[...]}";
    }
}
