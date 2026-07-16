package v.s;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class qhsM0NLCW4lYFI8kGz {
    public final long Ee8d2j4S9Vm5yGuR;
    public final String JXn4Qf7zpnLjP5;
    public final String dDIMxZXP1V8HdM;
    public final String ibVTtJUNfrGYbW;
    public final String vekpFI4d1Nc4fakF;
    public final int w9sT1Swbhx3hs;
    public final long xDyLpEZyrcKVe0;

    public qhsM0NLCW4lYFI8kGz(String str, int i, String str2, String str3, long j, long j2, String str4) {
        this.dDIMxZXP1V8HdM = str;
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = str2;
        this.JXn4Qf7zpnLjP5 = str3;
        this.Ee8d2j4S9Vm5yGuR = j;
        this.xDyLpEZyrcKVe0 = j2;
        this.ibVTtJUNfrGYbW = str4;
    }

    public final P7b7KFoJnwoYcb dDIMxZXP1V8HdM() {
        P7b7KFoJnwoYcb p7b7KFoJnwoYcb = new P7b7KFoJnwoYcb();
        p7b7KFoJnwoYcb.dDIMxZXP1V8HdM = this.dDIMxZXP1V8HdM;
        p7b7KFoJnwoYcb.w9sT1Swbhx3hs = this.w9sT1Swbhx3hs;
        p7b7KFoJnwoYcb.vekpFI4d1Nc4fakF = this.vekpFI4d1Nc4fakF;
        p7b7KFoJnwoYcb.JXn4Qf7zpnLjP5 = this.JXn4Qf7zpnLjP5;
        p7b7KFoJnwoYcb.xDyLpEZyrcKVe0 = Long.valueOf(this.Ee8d2j4S9Vm5yGuR);
        p7b7KFoJnwoYcb.ibVTtJUNfrGYbW = Long.valueOf(this.xDyLpEZyrcKVe0);
        p7b7KFoJnwoYcb.Ee8d2j4S9Vm5yGuR = this.ibVTtJUNfrGYbW;
        return p7b7KFoJnwoYcb;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qhsM0NLCW4lYFI8kGz)) {
            return false;
        }
        qhsM0NLCW4lYFI8kGz qhsm0nlcw4lyfi8kgz = (qhsM0NLCW4lYFI8kGz) obj;
        String str = qhsm0nlcw4lyfi8kgz.ibVTtJUNfrGYbW;
        String str2 = qhsm0nlcw4lyfi8kgz.JXn4Qf7zpnLjP5;
        String str3 = qhsm0nlcw4lyfi8kgz.vekpFI4d1Nc4fakF;
        String str4 = qhsm0nlcw4lyfi8kgz.dDIMxZXP1V8HdM;
        String str5 = this.dDIMxZXP1V8HdM;
        if (str5 == null) {
            if (str4 != null) {
                return false;
            }
        } else if (!str5.equals(str4)) {
            return false;
        }
        if (!Y9mRyRdkl5FOcwb66V6.w9sT1Swbhx3hs(this.w9sT1Swbhx3hs, qhsm0nlcw4lyfi8kgz.w9sT1Swbhx3hs)) {
            return false;
        }
        String str6 = this.vekpFI4d1Nc4fakF;
        if (str6 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str6.equals(str3)) {
            return false;
        }
        String str7 = this.JXn4Qf7zpnLjP5;
        if (str7 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str7.equals(str2)) {
            return false;
        }
        if (this.Ee8d2j4S9Vm5yGuR != qhsm0nlcw4lyfi8kgz.Ee8d2j4S9Vm5yGuR || this.xDyLpEZyrcKVe0 != qhsm0nlcw4lyfi8kgz.xDyLpEZyrcKVe0) {
            return false;
        }
        String str8 = this.ibVTtJUNfrGYbW;
        if (str8 == null) {
            return str == null;
        }
        return str8.equals(str);
    }

    public final int hashCode() {
        String str = this.dDIMxZXP1V8HdM;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ Y9mRyRdkl5FOcwb66V6.J0zjQ7CAgohuxU20eCW6(this.w9sT1Swbhx3hs)) * 1000003;
        String str2 = this.vekpFI4d1Nc4fakF;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.JXn4Qf7zpnLjP5;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.Ee8d2j4S9Vm5yGuR;
        int i = (iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.xDyLpEZyrcKVe0;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.ibVTtJUNfrGYbW;
        return (str4 != null ? str4.hashCode() : 0) ^ i2;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.dDIMxZXP1V8HdM);
        sb.append(", registrationStatus=");
        int i = this.w9sT1Swbhx3hs;
        if (i == 1) {
            str = "ATTEMPT_MIGRATION";
        } else if (i == 2) {
            str = "NOT_GENERATED";
        } else if (i == 3) {
            str = "UNREGISTERED";
        } else if (i != (-12) + 16) {
            str = i != 5 ? "null" : "REGISTER_ERROR";
        } else {
            str = "REGISTERED";
        }
        sb.append(str);
        sb.append(", authToken=");
        sb.append(this.vekpFI4d1Nc4fakF);
        sb.append(", refreshToken=");
        sb.append(this.JXn4Qf7zpnLjP5);
        sb.append(", expiresInSecs=");
        sb.append(this.Ee8d2j4S9Vm5yGuR);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.xDyLpEZyrcKVe0);
        sb.append(", fisError=");
        return Y9mRyRdkl5FOcwb66V6.D5P1xCAyuvgF(sb, this.ibVTtJUNfrGYbW, "}");
    }
}
