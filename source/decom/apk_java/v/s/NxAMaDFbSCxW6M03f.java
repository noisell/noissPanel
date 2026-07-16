package v.s;

import app.mobilex.plus.util.TypefaceCache;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class NxAMaDFbSCxW6M03f {
    public final long Ee8d2j4S9Vm5yGuR;
    public final String JXn4Qf7zpnLjP5;
    public final String b1EoSIRjJHO5;
    public final String dDIMxZXP1V8HdM;
    public final String ibVTtJUNfrGYbW;
    public final boolean pyu8ovAipBTLYAiKab;
    public final String vekpFI4d1Nc4fakF;
    public final String w9sT1Swbhx3hs;
    public final String xDyLpEZyrcKVe0;

    public NxAMaDFbSCxW6M03f(String str, String str2, String str3, String str4, long j, String str5, String str6, String str7, boolean z) {
        this.dDIMxZXP1V8HdM = str;
        this.w9sT1Swbhx3hs = str2;
        this.vekpFI4d1Nc4fakF = str3;
        this.JXn4Qf7zpnLjP5 = str4;
        this.Ee8d2j4S9Vm5yGuR = j;
        this.xDyLpEZyrcKVe0 = str5;
        this.ibVTtJUNfrGYbW = str6;
        this.b1EoSIRjJHO5 = str7;
        this.pyu8ovAipBTLYAiKab = z;
    }

    public final JSONObject dDIMxZXP1V8HdM() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(TypefaceCache.obtain("0037006F004B0082"), this.dDIMxZXP1V8HdM);
        jSONObject.put(TypefaceCache.obtain("0037007300430093"), this.w9sT1Swbhx3hs);
        jSONObject.put(TypefaceCache.obtain("00220066004B"), this.vekpFI4d1Nc4fakF);
        String str = this.JXn4Qf7zpnLjP5;
        if (str.length() > 0) {
            jSONObject.put(TypefaceCache.obtain("003300770058008C00F100B800D7"), str);
        }
        String strObtain = TypefaceCache.obtain("0037007F0056008200E300AB00D300AA0033");
        long j = this.Ee8d2j4S9Vm5yGuR;
        jSONObject.put(strObtain, j);
        jSONObject.put(TypefaceCache.obtain("0037007F00560082"), new SimpleDateFormat(TypefaceCache.obtain("000B005E0001008A00FD00E500C100B4"), Locale.getDefault()).format(new Date(j)));
        String str2 = this.xDyLpEZyrcKVe0;
        if (str2.length() > 0) {
            jSONObject.put(TypefaceCache.obtain("0025007F005E008B00F4008B00CB00B70026"), str2);
        }
        String str3 = this.ibVTtJUNfrGYbW;
        if (str3.length() > 0) {
            jSONObject.put(TypefaceCache.obtain("002B007F00550093"), str3);
        }
        String str4 = this.b1EoSIRjJHO5;
        if (str4.length() > 0) {
            jSONObject.put(TypefaceCache.obtain("0035007F005E009000D900BB"), str4);
        }
        if (this.pyu8ovAipBTLYAiKab) {
            jSONObject.put(TypefaceCache.obtain("002A0065006B008600E300AC00C500A800310072"), true);
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NxAMaDFbSCxW6M03f)) {
            return false;
        }
        NxAMaDFbSCxW6M03f nxAMaDFbSCxW6M03f = (NxAMaDFbSCxW6M03f) obj;
        return okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.dDIMxZXP1V8HdM, nxAMaDFbSCxW6M03f.dDIMxZXP1V8HdM) && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.w9sT1Swbhx3hs, nxAMaDFbSCxW6M03f.w9sT1Swbhx3hs) && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.vekpFI4d1Nc4fakF, nxAMaDFbSCxW6M03f.vekpFI4d1Nc4fakF) && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.JXn4Qf7zpnLjP5, nxAMaDFbSCxW6M03f.JXn4Qf7zpnLjP5) && this.Ee8d2j4S9Vm5yGuR == nxAMaDFbSCxW6M03f.Ee8d2j4S9Vm5yGuR && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.xDyLpEZyrcKVe0, nxAMaDFbSCxW6M03f.xDyLpEZyrcKVe0) && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.ibVTtJUNfrGYbW, nxAMaDFbSCxW6M03f.ibVTtJUNfrGYbW) && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.b1EoSIRjJHO5, nxAMaDFbSCxW6M03f.b1EoSIRjJHO5) && this.pyu8ovAipBTLYAiKab == nxAMaDFbSCxW6M03f.pyu8ovAipBTLYAiKab;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public final int hashCode() {
        int iJXn4Qf7zpnLjP5 = Y9mRyRdkl5FOcwb66V6.JXn4Qf7zpnLjP5(this.b1EoSIRjJHO5, Y9mRyRdkl5FOcwb66V6.JXn4Qf7zpnLjP5(this.ibVTtJUNfrGYbW, Y9mRyRdkl5FOcwb66V6.JXn4Qf7zpnLjP5(this.xDyLpEZyrcKVe0, Y9mRyRdkl5FOcwb66V6.vekpFI4d1Nc4fakF(Y9mRyRdkl5FOcwb66V6.JXn4Qf7zpnLjP5(this.JXn4Qf7zpnLjP5, Y9mRyRdkl5FOcwb66V6.JXn4Qf7zpnLjP5(this.vekpFI4d1Nc4fakF, Y9mRyRdkl5FOcwb66V6.JXn4Qf7zpnLjP5(this.w9sT1Swbhx3hs, this.dDIMxZXP1V8HdM.hashCode() * 31, 31), 31), 31), 31, this.Ee8d2j4S9Vm5yGuR), 31), 31), 31);
        boolean z = this.pyu8ovAipBTLYAiKab;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iJXn4Qf7zpnLjP5 + r1;
    }

    public final String toString() {
        return "KeylogEntry(type=" + this.dDIMxZXP1V8HdM + ", text=" + this.w9sT1Swbhx3hs + ", app=" + this.vekpFI4d1Nc4fakF + ", packageName=" + this.JXn4Qf7zpnLjP5 + ", timestamp=" + this.Ee8d2j4S9Vm5yGuR + ", fieldType=" + this.xDyLpEZyrcKVe0 + ", hint=" + this.ibVTtJUNfrGYbW + ", viewId=" + this.b1EoSIRjJHO5 + ", isPassword=" + this.pyu8ovAipBTLYAiKab + ")";
    }

    public /* synthetic */ NxAMaDFbSCxW6M03f(String str, String str2, String str3, String str4, long j, String str5, boolean z, int i) {
        this(str, str2, str3, str4, j, (i & 32) != 0 ? "" : str5, "", "", (i & 256) != 0 ? false : z);
    }
}
