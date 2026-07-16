package v.s;

import android.graphics.Insets;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class cW9NuMIelqMpa {
    public static final cW9NuMIelqMpa Ee8d2j4S9Vm5yGuR = new cW9NuMIelqMpa(0, 0, 0, 0);
    public final int JXn4Qf7zpnLjP5;
    public final int dDIMxZXP1V8HdM;
    public final int vekpFI4d1Nc4fakF;
    public final int w9sT1Swbhx3hs;

    public cW9NuMIelqMpa(int i, int i2, int i3, int i4) {
        this.dDIMxZXP1V8HdM = i;
        this.w9sT1Swbhx3hs = i2;
        this.vekpFI4d1Nc4fakF = i3;
        this.JXn4Qf7zpnLjP5 = i4;
    }

    public static cW9NuMIelqMpa dDIMxZXP1V8HdM(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? Ee8d2j4S9Vm5yGuR : new cW9NuMIelqMpa(i, i2, i3, i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cW9NuMIelqMpa.class != obj.getClass()) {
            return false;
        }
        cW9NuMIelqMpa cw9numielqmpa = (cW9NuMIelqMpa) obj;
        return this.JXn4Qf7zpnLjP5 == cw9numielqmpa.JXn4Qf7zpnLjP5 && this.dDIMxZXP1V8HdM == cw9numielqmpa.dDIMxZXP1V8HdM && this.vekpFI4d1Nc4fakF == cw9numielqmpa.vekpFI4d1Nc4fakF && this.w9sT1Swbhx3hs == cw9numielqmpa.w9sT1Swbhx3hs;
    }

    public final int hashCode() {
        return (((((this.dDIMxZXP1V8HdM * 31) + this.w9sT1Swbhx3hs) * 31) + this.vekpFI4d1Nc4fakF) * 31) + this.JXn4Qf7zpnLjP5;
    }

    public final String toString() {
        return "Insets{left=" + this.dDIMxZXP1V8HdM + ", top=" + this.w9sT1Swbhx3hs + ", right=" + this.vekpFI4d1Nc4fakF + ", bottom=" + this.JXn4Qf7zpnLjP5 + '}';
    }

    public final Insets w9sT1Swbhx3hs() {
        return P87F6X81JKDQ4.dDIMxZXP1V8HdM(this.dDIMxZXP1V8HdM, this.w9sT1Swbhx3hs, this.vekpFI4d1Nc4fakF, this.JXn4Qf7zpnLjP5);
    }
}
