package v.s;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class LxcWwhUIAZTomaullvAU {
    public final int dDIMxZXP1V8HdM;
    public final long w9sT1Swbhx3hs;

    public LxcWwhUIAZTomaullvAU(int i, long j) {
        if (i == 0) {
            throw new NullPointerException("Null status");
        }
        this.dDIMxZXP1V8HdM = i;
        this.w9sT1Swbhx3hs = j;
    }

    private static /* synthetic */ void boryoyc() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LxcWwhUIAZTomaullvAU)) {
            return false;
        }
        LxcWwhUIAZTomaullvAU lxcWwhUIAZTomaullvAU = (LxcWwhUIAZTomaullvAU) obj;
        return Y9mRyRdkl5FOcwb66V6.w9sT1Swbhx3hs(this.dDIMxZXP1V8HdM, lxcWwhUIAZTomaullvAU.dDIMxZXP1V8HdM) && this.w9sT1Swbhx3hs == lxcWwhUIAZTomaullvAU.w9sT1Swbhx3hs;
    }

    public final int hashCode() {
        int iJ0zjQ7CAgohuxU20eCW6 = (Y9mRyRdkl5FOcwb66V6.J0zjQ7CAgohuxU20eCW6(this.dDIMxZXP1V8HdM) ^ 1000003) * 1000003;
        long j = this.w9sT1Swbhx3hs;
        return iJ0zjQ7CAgohuxU20eCW6 ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i = 37 - 36;
        int i2 = this.dDIMxZXP1V8HdM;
        if (i2 == i) {
            str = "OK";
        } else if (i2 == 2) {
            str = "TRANSIENT_ERROR";
        } else if (i2 != 3) {
            str = i2 != 4 ? "null" : "INVALID_PAYLOAD";
        } else {
            str = "FATAL_ERROR";
        }
        sb.append(str);
        sb.append(", nextRequestWaitMillis=");
        sb.append(this.w9sT1Swbhx3hs);
        sb.append("}");
        return sb.toString();
    }
}
