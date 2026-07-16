package v.s;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class l3fPij8CYcI7xO {
    public final String dDIMxZXP1V8HdM;
    public final int vekpFI4d1Nc4fakF;
    public final long w9sT1Swbhx3hs;

    public l3fPij8CYcI7xO(int i, long j, String str) {
        this.dDIMxZXP1V8HdM = str;
        this.w9sT1Swbhx3hs = j;
        this.vekpFI4d1Nc4fakF = i;
    }

    public static sfr0Aaw8vBbkmexjHdWK dDIMxZXP1V8HdM() {
        sfr0Aaw8vBbkmexjHdWK sfr0aaw8vbbkmexjhdwk = new sfr0Aaw8vBbkmexjHdWK();
        sfr0aaw8vbbkmexjhdwk.JXn4Qf7zpnLjP5 = 0L;
        return sfr0aaw8vbbkmexjhdwk;
    }

    private static /* synthetic */ void ugbdhz() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l3fPij8CYcI7xO)) {
            return false;
        }
        l3fPij8CYcI7xO l3fpij8cyci7xo = (l3fPij8CYcI7xO) obj;
        int i = l3fpij8cyci7xo.vekpFI4d1Nc4fakF;
        String str = l3fpij8cyci7xo.dDIMxZXP1V8HdM;
        String str2 = this.dDIMxZXP1V8HdM;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.w9sT1Swbhx3hs != l3fpij8cyci7xo.w9sT1Swbhx3hs) {
            return false;
        }
        int i2 = this.vekpFI4d1Nc4fakF;
        if (i2 == 0) {
            return i == 0;
        }
        return Y9mRyRdkl5FOcwb66V6.w9sT1Swbhx3hs(i2, i);
    }

    public final int hashCode() {
        String str = this.dDIMxZXP1V8HdM;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.w9sT1Swbhx3hs;
        int i = (((iHashCode ^ 1000003) * 1000003) ^ ((int) ((j >>> (93 - 61)) ^ j))) * 1000003;
        int i2 = this.vekpFI4d1Nc4fakF;
        return (i2 != 0 ? Y9mRyRdkl5FOcwb66V6.J0zjQ7CAgohuxU20eCW6(i2) : 0) ^ i;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.dDIMxZXP1V8HdM);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.w9sT1Swbhx3hs);
        sb.append(", responseCode=");
        int i = this.vekpFI4d1Nc4fakF;
        if (i == 1) {
            str = "OK";
        } else if (i != 2) {
            str = i != 3 ? "null" : "AUTH_ERROR";
        } else {
            str = "BAD_CONFIG";
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
