package v.s;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class tyjTTrZMHzku {
    public final int Ee8d2j4S9Vm5yGuR;
    public final l3fPij8CYcI7xO JXn4Qf7zpnLjP5;
    public final String dDIMxZXP1V8HdM;
    public final String vekpFI4d1Nc4fakF;
    public final String w9sT1Swbhx3hs;

    public tyjTTrZMHzku(String str, String str2, String str3, l3fPij8CYcI7xO l3fpij8cyci7xo, int i) {
        this.dDIMxZXP1V8HdM = str;
        this.w9sT1Swbhx3hs = str2;
        this.vekpFI4d1Nc4fakF = str3;
        this.JXn4Qf7zpnLjP5 = l3fpij8cyci7xo;
        this.Ee8d2j4S9Vm5yGuR = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tyjTTrZMHzku)) {
            return false;
        }
        tyjTTrZMHzku tyjttrzmhzku = (tyjTTrZMHzku) obj;
        int i = tyjttrzmhzku.Ee8d2j4S9Vm5yGuR;
        l3fPij8CYcI7xO l3fpij8cyci7xo = tyjttrzmhzku.JXn4Qf7zpnLjP5;
        String str = tyjttrzmhzku.vekpFI4d1Nc4fakF;
        String str2 = tyjttrzmhzku.w9sT1Swbhx3hs;
        String str3 = tyjttrzmhzku.dDIMxZXP1V8HdM;
        String str4 = this.dDIMxZXP1V8HdM;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = this.w9sT1Swbhx3hs;
        if (str5 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str5.equals(str2)) {
            return false;
        }
        String str6 = this.vekpFI4d1Nc4fakF;
        if (str6 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str6.equals(str)) {
            return false;
        }
        l3fPij8CYcI7xO l3fpij8cyci7xo2 = this.JXn4Qf7zpnLjP5;
        if (l3fpij8cyci7xo2 == null) {
            if (l3fpij8cyci7xo != null) {
                return false;
            }
        } else if (!l3fpij8cyci7xo2.equals(l3fpij8cyci7xo)) {
            return false;
        }
        int i2 = this.Ee8d2j4S9Vm5yGuR;
        if (i2 == 0) {
            return i == 0;
        }
        return Y9mRyRdkl5FOcwb66V6.w9sT1Swbhx3hs(i2, i);
    }

    public final int hashCode() {
        String str = this.dDIMxZXP1V8HdM;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.w9sT1Swbhx3hs;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.vekpFI4d1Nc4fakF;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        l3fPij8CYcI7xO l3fpij8cyci7xo = this.JXn4Qf7zpnLjP5;
        int iHashCode4 = (iHashCode3 ^ (l3fpij8cyci7xo == null ? 0 : l3fpij8cyci7xo.hashCode())) * 1000003;
        int i = this.Ee8d2j4S9Vm5yGuR;
        return (i != 0 ? Y9mRyRdkl5FOcwb66V6.J0zjQ7CAgohuxU20eCW6(i) : 0) ^ iHashCode4;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.dDIMxZXP1V8HdM);
        sb.append(", fid=");
        sb.append(this.w9sT1Swbhx3hs);
        sb.append(", refreshToken=");
        sb.append(this.vekpFI4d1Nc4fakF);
        sb.append(", authToken=");
        sb.append(this.JXn4Qf7zpnLjP5);
        sb.append(", responseCode=");
        int i = this.Ee8d2j4S9Vm5yGuR;
        if (i != 1) {
            str = i != 2 ? "null" : "BAD_CONFIG";
        } else {
            str = "OK";
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
