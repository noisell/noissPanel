package v.s;

import android.app.Notification;
import android.media.AudioAttributes;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class dokDau91egnH {
    public static Notification.Builder Ee8d2j4S9Vm5yGuR(Notification.Builder builder, Uri uri, Object obj) {
        return builder.setSound(uri, (AudioAttributes) obj);
    }

    public static Notification.Builder JXn4Qf7zpnLjP5(Notification.Builder builder, Notification notification) {
        return builder.setPublicVersion(notification);
    }

    public static Notification.Builder dDIMxZXP1V8HdM(Notification.Builder builder, String str) {
        return builder.addPerson(str);
    }

    public static Notification.Builder vekpFI4d1Nc4fakF(Notification.Builder builder, int i) {
        return builder.setColor(i);
    }

    public static Notification.Builder w9sT1Swbhx3hs(Notification.Builder builder, String str) {
        return builder.setCategory(str);
    }

    public static Notification.Builder xDyLpEZyrcKVe0(Notification.Builder builder, int i) {
        return builder.setVisibility(i);
    }
}
