package v.s;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class VTs3SU2MiIMPb2VCqAuc {
    public final String Ee8d2j4S9Vm5yGuR;
    public final String JXn4Qf7zpnLjP5;
    public final String dDIMxZXP1V8HdM;
    public final String ibVTtJUNfrGYbW;
    public final String vekpFI4d1Nc4fakF;
    public final String w9sT1Swbhx3hs;
    public final String xDyLpEZyrcKVe0;

    public VTs3SU2MiIMPb2VCqAuc(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i = cYsUaUHQWoSkocVq.dDIMxZXP1V8HdM;
        if (str == null || str.trim().isEmpty()) {
            throw new IllegalStateException("ApplicationId must be set.");
        }
        this.w9sT1Swbhx3hs = str;
        this.dDIMxZXP1V8HdM = str2;
        this.vekpFI4d1Nc4fakF = str3;
        this.JXn4Qf7zpnLjP5 = str4;
        this.Ee8d2j4S9Vm5yGuR = str5;
        this.xDyLpEZyrcKVe0 = str6;
        this.ibVTtJUNfrGYbW = str7;
    }

    public static VTs3SU2MiIMPb2VCqAuc dDIMxZXP1V8HdM(Application application) {
        IXBvAqS2fpdIRK iXBvAqS2fpdIRK = new IXBvAqS2fpdIRK((Context) application);
        String strW9sT1Swbhx3hs = iXBvAqS2fpdIRK.w9sT1Swbhx3hs("google_app_id");
        if (TextUtils.isEmpty(strW9sT1Swbhx3hs)) {
            return null;
        }
        return new VTs3SU2MiIMPb2VCqAuc(strW9sT1Swbhx3hs, iXBvAqS2fpdIRK.w9sT1Swbhx3hs("google_api_key"), iXBvAqS2fpdIRK.w9sT1Swbhx3hs("firebase_database_url"), iXBvAqS2fpdIRK.w9sT1Swbhx3hs("ga_trackingId"), iXBvAqS2fpdIRK.w9sT1Swbhx3hs("gcm_defaultSenderId"), iXBvAqS2fpdIRK.w9sT1Swbhx3hs("google_storage_bucket"), iXBvAqS2fpdIRK.w9sT1Swbhx3hs("project_id"));
    }

    private static /* synthetic */ void vggvz() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof VTs3SU2MiIMPb2VCqAuc)) {
            return false;
        }
        VTs3SU2MiIMPb2VCqAuc vTs3SU2MiIMPb2VCqAuc = (VTs3SU2MiIMPb2VCqAuc) obj;
        return OFtLBiBbrrTHWu.gIIiyi2ddlMDR0(this.w9sT1Swbhx3hs, vTs3SU2MiIMPb2VCqAuc.w9sT1Swbhx3hs) && OFtLBiBbrrTHWu.gIIiyi2ddlMDR0(this.dDIMxZXP1V8HdM, vTs3SU2MiIMPb2VCqAuc.dDIMxZXP1V8HdM) && OFtLBiBbrrTHWu.gIIiyi2ddlMDR0(this.vekpFI4d1Nc4fakF, vTs3SU2MiIMPb2VCqAuc.vekpFI4d1Nc4fakF) && OFtLBiBbrrTHWu.gIIiyi2ddlMDR0(this.JXn4Qf7zpnLjP5, vTs3SU2MiIMPb2VCqAuc.JXn4Qf7zpnLjP5) && OFtLBiBbrrTHWu.gIIiyi2ddlMDR0(this.Ee8d2j4S9Vm5yGuR, vTs3SU2MiIMPb2VCqAuc.Ee8d2j4S9Vm5yGuR) && OFtLBiBbrrTHWu.gIIiyi2ddlMDR0(this.xDyLpEZyrcKVe0, vTs3SU2MiIMPb2VCqAuc.xDyLpEZyrcKVe0) && OFtLBiBbrrTHWu.gIIiyi2ddlMDR0(this.ibVTtJUNfrGYbW, vTs3SU2MiIMPb2VCqAuc.ibVTtJUNfrGYbW);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.w9sT1Swbhx3hs, this.dDIMxZXP1V8HdM, this.vekpFI4d1Nc4fakF, this.JXn4Qf7zpnLjP5, this.Ee8d2j4S9Vm5yGuR, this.xDyLpEZyrcKVe0, this.ibVTtJUNfrGYbW});
    }

    public final String toString() {
        IXBvAqS2fpdIRK iXBvAqS2fpdIRK = new IXBvAqS2fpdIRK(this);
        iXBvAqS2fpdIRK.dDIMxZXP1V8HdM(this.w9sT1Swbhx3hs, "applicationId");
        iXBvAqS2fpdIRK.dDIMxZXP1V8HdM(this.dDIMxZXP1V8HdM, "apiKey");
        iXBvAqS2fpdIRK.dDIMxZXP1V8HdM(this.vekpFI4d1Nc4fakF, "databaseUrl");
        iXBvAqS2fpdIRK.dDIMxZXP1V8HdM(this.Ee8d2j4S9Vm5yGuR, "gcmSenderId");
        iXBvAqS2fpdIRK.dDIMxZXP1V8HdM(this.xDyLpEZyrcKVe0, "storageBucket");
        iXBvAqS2fpdIRK.dDIMxZXP1V8HdM(this.ibVTtJUNfrGYbW, "projectId");
        return iXBvAqS2fpdIRK.toString();
    }
}
