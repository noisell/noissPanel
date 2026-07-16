package v.s;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class kqr9a6cdIajJ19jP {
    public final String Ee8d2j4S9Vm5yGuR;
    public final int JXn4Qf7zpnLjP5;
    public final String dDIMxZXP1V8HdM;
    public final int ibVTtJUNfrGYbW;
    public final boolean vekpFI4d1Nc4fakF;
    public final String w9sT1Swbhx3hs;
    public final int xDyLpEZyrcKVe0;

    public kqr9a6cdIajJ19jP(String str, String str2, boolean z, int i, String str3, int i2) {
        this.dDIMxZXP1V8HdM = str;
        this.w9sT1Swbhx3hs = str2;
        this.vekpFI4d1Nc4fakF = z;
        this.JXn4Qf7zpnLjP5 = i;
        this.Ee8d2j4S9Vm5yGuR = str3;
        this.xDyLpEZyrcKVe0 = i2;
        String upperCase = str2.toUpperCase(Locale.US);
        this.ibVTtJUNfrGYbW = KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(upperCase, "INT", false) ? 3 : (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(upperCase, "CHAR", false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(upperCase, "CLOB", false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(upperCase, "TEXT", false)) ? 2 : KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(upperCase, "BLOB", false) ? 5 : (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(upperCase, "REAL", false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(upperCase, "FLOA", false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(upperCase, "DOUB", false)) ? 4 : 1;
    }

    private static /* synthetic */ void zdjb() {
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof kqr9a6cdIajJ19jP)) {
                return false;
            }
            kqr9a6cdIajJ19jP kqr9a6cdiajj19jp = (kqr9a6cdIajJ19jP) obj;
            if (this.JXn4Qf7zpnLjP5 != kqr9a6cdiajj19jp.JXn4Qf7zpnLjP5) {
                return false;
            }
            int i = kqr9a6cdiajj19jp.xDyLpEZyrcKVe0;
            String str = kqr9a6cdiajj19jp.Ee8d2j4S9Vm5yGuR;
            if (!okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.dDIMxZXP1V8HdM, kqr9a6cdiajj19jp.dDIMxZXP1V8HdM) || this.vekpFI4d1Nc4fakF != kqr9a6cdiajj19jp.vekpFI4d1Nc4fakF) {
                return false;
            }
            String str2 = this.Ee8d2j4S9Vm5yGuR;
            int i2 = this.xDyLpEZyrcKVe0;
            if (i2 == 1 && i == 2 && str2 != null && !OFtLBiBbrrTHWu.gmNWMfvn6zlEj(str2, str)) {
                return false;
            }
            if (i2 == 2 && i == 1 && str != null && !OFtLBiBbrrTHWu.gmNWMfvn6zlEj(str, str2)) {
                return false;
            }
            if (i2 != 0 && i2 == i) {
                if (str2 != null) {
                    if (!OFtLBiBbrrTHWu.gmNWMfvn6zlEj(str2, str)) {
                        return false;
                    }
                } else if (str != null) {
                    return false;
                }
            }
            if (this.ibVTtJUNfrGYbW != kqr9a6cdiajj19jp.ibVTtJUNfrGYbW) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.dDIMxZXP1V8HdM.hashCode() * 31) + this.ibVTtJUNfrGYbW) * 31) + (this.vekpFI4d1Nc4fakF ? 1231 : 1237)) * 31) + this.JXn4Qf7zpnLjP5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.dDIMxZXP1V8HdM);
        sb.append("', type='");
        sb.append(this.w9sT1Swbhx3hs);
        sb.append("', affinity='");
        sb.append(this.ibVTtJUNfrGYbW);
        sb.append("', notNull=");
        sb.append(this.vekpFI4d1Nc4fakF);
        sb.append(", primaryKeyPosition=");
        sb.append(this.JXn4Qf7zpnLjP5);
        sb.append(", defaultValue='");
        String str = this.Ee8d2j4S9Vm5yGuR;
        if (str == null) {
            str = "undefined";
        }
        return Y9mRyRdkl5FOcwb66V6.D5P1xCAyuvgF(sb, str, "'}");
    }
}
