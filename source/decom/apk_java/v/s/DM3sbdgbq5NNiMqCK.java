package v.s;

import android.app.Notification;
import android.content.LocusId;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class DM3sbdgbq5NNiMqCK {
    public static Notification.Builder JXn4Qf7zpnLjP5(Notification.Builder builder, Object obj) {
        return builder.setLocusId((LocusId) obj);
    }

    public static Notification.Builder dDIMxZXP1V8HdM(Notification.Builder builder, boolean z) {
        return builder.setAllowSystemGeneratedContextualActions(z);
    }

    public static Notification.Action.Builder vekpFI4d1Nc4fakF(Notification.Action.Builder builder, boolean z) {
        return builder.setContextual(z);
    }

    public static Notification.Builder w9sT1Swbhx3hs(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
        return builder.setBubbleMetadata(bubbleMetadata);
    }
}
