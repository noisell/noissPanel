package v.s;

import android.app.Notification;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class BXrZf9mCiRhvBOt7P {
    public final int dDIMxZXP1V8HdM;
    public final Notification vekpFI4d1Nc4fakF;
    public final int w9sT1Swbhx3hs;

    public BXrZf9mCiRhvBOt7P(int i, Notification notification, int i2) {
        this.dDIMxZXP1V8HdM = i;
        this.vekpFI4d1Nc4fakF = notification;
        this.w9sT1Swbhx3hs = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BXrZf9mCiRhvBOt7P.class != obj.getClass()) {
            return false;
        }
        BXrZf9mCiRhvBOt7P bXrZf9mCiRhvBOt7P = (BXrZf9mCiRhvBOt7P) obj;
        if (this.dDIMxZXP1V8HdM == bXrZf9mCiRhvBOt7P.dDIMxZXP1V8HdM && this.w9sT1Swbhx3hs == bXrZf9mCiRhvBOt7P.w9sT1Swbhx3hs) {
            return this.vekpFI4d1Nc4fakF.equals(bXrZf9mCiRhvBOt7P.vekpFI4d1Nc4fakF);
        }
        return false;
    }

    public final int hashCode() {
        return this.vekpFI4d1Nc4fakF.hashCode() + (((this.dDIMxZXP1V8HdM * 31) + this.w9sT1Swbhx3hs) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.dDIMxZXP1V8HdM + ", mForegroundServiceType=" + this.w9sT1Swbhx3hs + ", mNotification=" + this.vekpFI4d1Nc4fakF + '}';
    }
}
