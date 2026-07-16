package v.s;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.drawable.Icon;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class nM2DcAOLC8BKUucj {
    public static Notification.Action.Builder dDIMxZXP1V8HdM(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
        return new Notification.Action.Builder(icon, charSequence, pendingIntent);
    }

    public static Notification.Builder vekpFI4d1Nc4fakF(Notification.Builder builder, Object obj) {
        return builder.setSmallIcon((Icon) obj);
    }

    public static Notification.Builder w9sT1Swbhx3hs(Notification.Builder builder, Icon icon) {
        return builder.setLargeIcon(icon);
    }
}
