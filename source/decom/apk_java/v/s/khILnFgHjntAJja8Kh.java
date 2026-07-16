package v.s;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class khILnFgHjntAJja8Kh {
    public final String Ee8d2j4S9Vm5yGuR;
    public final String JXn4Qf7zpnLjP5;
    public final boolean b1EoSIRjJHO5;
    public final String dDIMxZXP1V8HdM;
    public final boolean ibVTtJUNfrGYbW;
    public final boolean pyu8ovAipBTLYAiKab;
    public final long vekpFI4d1Nc4fakF;
    public final String w9sT1Swbhx3hs;
    public final boolean xDyLpEZyrcKVe0;
    public static final Pattern D5P1xCAyuvgF = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern hjneShqpF9Tis4 = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern gmNWMfvn6zlEj = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern gIIiyi2ddlMDR0 = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    public khILnFgHjntAJja8Kh(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.dDIMxZXP1V8HdM = str;
        this.w9sT1Swbhx3hs = str2;
        this.vekpFI4d1Nc4fakF = j;
        this.JXn4Qf7zpnLjP5 = str3;
        this.Ee8d2j4S9Vm5yGuR = str4;
        this.xDyLpEZyrcKVe0 = z;
        this.ibVTtJUNfrGYbW = z2;
        this.b1EoSIRjJHO5 = z3;
        this.pyu8ovAipBTLYAiKab = z4;
    }

    private static /* synthetic */ void mlmci() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof khILnFgHjntAJja8Kh)) {
            return false;
        }
        khILnFgHjntAJja8Kh khilnfghjntajja8kh = (khILnFgHjntAJja8Kh) obj;
        return okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(khilnfghjntajja8kh.dDIMxZXP1V8HdM, this.dDIMxZXP1V8HdM) && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(khilnfghjntajja8kh.w9sT1Swbhx3hs, this.w9sT1Swbhx3hs) && khilnfghjntajja8kh.vekpFI4d1Nc4fakF == this.vekpFI4d1Nc4fakF && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(khilnfghjntajja8kh.JXn4Qf7zpnLjP5, this.JXn4Qf7zpnLjP5) && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(khilnfghjntajja8kh.Ee8d2j4S9Vm5yGuR, this.Ee8d2j4S9Vm5yGuR) && khilnfghjntajja8kh.xDyLpEZyrcKVe0 == this.xDyLpEZyrcKVe0 && khilnfghjntajja8kh.ibVTtJUNfrGYbW == this.ibVTtJUNfrGYbW && khilnfghjntajja8kh.b1EoSIRjJHO5 == this.b1EoSIRjJHO5 && khilnfghjntajja8kh.pyu8ovAipBTLYAiKab == this.pyu8ovAipBTLYAiKab;
    }

    public final int hashCode() {
        int i = 68 - 37;
        return Boolean.hashCode(this.pyu8ovAipBTLYAiKab) + ((Boolean.hashCode(this.b1EoSIRjJHO5) + ((Boolean.hashCode(this.ibVTtJUNfrGYbW) + ((Boolean.hashCode(this.xDyLpEZyrcKVe0) + Y9mRyRdkl5FOcwb66V6.JXn4Qf7zpnLjP5(this.Ee8d2j4S9Vm5yGuR, Y9mRyRdkl5FOcwb66V6.JXn4Qf7zpnLjP5(this.JXn4Qf7zpnLjP5, Y9mRyRdkl5FOcwb66V6.vekpFI4d1Nc4fakF(Y9mRyRdkl5FOcwb66V6.JXn4Qf7zpnLjP5(this.w9sT1Swbhx3hs, Y9mRyRdkl5FOcwb66V6.JXn4Qf7zpnLjP5(this.dDIMxZXP1V8HdM, 527, i), i), i, this.vekpFI4d1Nc4fakF), i), i)) * i)) * i)) * i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.dDIMxZXP1V8HdM);
        sb.append('=');
        sb.append(this.w9sT1Swbhx3hs);
        if (this.b1EoSIRjJHO5) {
            long j = this.vekpFI4d1Nc4fakF;
            if (j == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(((DateFormat) blZNnT2Ca7wu.dDIMxZXP1V8HdM.get()).format(new Date(j)));
            }
        }
        if (!this.pyu8ovAipBTLYAiKab) {
            sb.append("; domain=");
            sb.append(this.JXn4Qf7zpnLjP5);
        }
        sb.append("; path=");
        sb.append(this.Ee8d2j4S9Vm5yGuR);
        if (this.xDyLpEZyrcKVe0) {
            sb.append("; secure");
        }
        if (this.ibVTtJUNfrGYbW) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}
