package v.s;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class dfz6ltSv908J2w {
    public final Uri dDIMxZXP1V8HdM;
    public final boolean w9sT1Swbhx3hs;

    public dfz6ltSv908J2w(boolean z, Uri uri) {
        this.dDIMxZXP1V8HdM = uri;
        this.w9sT1Swbhx3hs = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!dfz6ltSv908J2w.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        dfz6ltSv908J2w dfz6ltsv908j2w = (dfz6ltSv908J2w) obj;
        return okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.dDIMxZXP1V8HdM, dfz6ltsv908j2w.dDIMxZXP1V8HdM) && this.w9sT1Swbhx3hs == dfz6ltsv908j2w.w9sT1Swbhx3hs;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.w9sT1Swbhx3hs) + (this.dDIMxZXP1V8HdM.hashCode() * 31);
    }
}
