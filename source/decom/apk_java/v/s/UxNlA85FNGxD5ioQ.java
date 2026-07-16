package v.s;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class UxNlA85FNGxD5ioQ extends DZqYM9pKIWUq8PKvfof8 {
    public final String JXn4Qf7zpnLjP5;
    public final Context dDIMxZXP1V8HdM;
    public final bYZKmsM130y5GVhnn vekpFI4d1Nc4fakF;
    public final bYZKmsM130y5GVhnn w9sT1Swbhx3hs;

    public UxNlA85FNGxD5ioQ(Context context, bYZKmsM130y5GVhnn byzkmsm130y5gvhnn, bYZKmsM130y5GVhnn byzkmsm130y5gvhnn2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.dDIMxZXP1V8HdM = context;
        if (byzkmsm130y5gvhnn == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.w9sT1Swbhx3hs = byzkmsm130y5gvhnn;
        if (byzkmsm130y5gvhnn2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.vekpFI4d1Nc4fakF = byzkmsm130y5gvhnn2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.JXn4Qf7zpnLjP5 = str;
    }

    private static /* synthetic */ void fepqtuub() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DZqYM9pKIWUq8PKvfof8) {
            UxNlA85FNGxD5ioQ uxNlA85FNGxD5ioQ = (UxNlA85FNGxD5ioQ) ((DZqYM9pKIWUq8PKvfof8) obj);
            if (this.dDIMxZXP1V8HdM.equals(uxNlA85FNGxD5ioQ.dDIMxZXP1V8HdM) && this.w9sT1Swbhx3hs.equals(uxNlA85FNGxD5ioQ.w9sT1Swbhx3hs) && this.vekpFI4d1Nc4fakF.equals(uxNlA85FNGxD5ioQ.vekpFI4d1Nc4fakF) && this.JXn4Qf7zpnLjP5.equals(uxNlA85FNGxD5ioQ.JXn4Qf7zpnLjP5)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.dDIMxZXP1V8HdM.hashCode() ^ 1000003) * 1000003) ^ this.w9sT1Swbhx3hs.hashCode()) * 1000003) ^ this.vekpFI4d1Nc4fakF.hashCode()) * 1000003) ^ this.JXn4Qf7zpnLjP5.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.dDIMxZXP1V8HdM);
        sb.append(", wallClock=");
        sb.append(this.w9sT1Swbhx3hs);
        sb.append(", monotonicClock=");
        sb.append(this.vekpFI4d1Nc4fakF);
        sb.append(", backendName=");
        return Y9mRyRdkl5FOcwb66V6.D5P1xCAyuvgF(sb, this.JXn4Qf7zpnLjP5, "}");
    }
}
