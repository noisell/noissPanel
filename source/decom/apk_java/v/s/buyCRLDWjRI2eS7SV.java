package v.s;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class buyCRLDWjRI2eS7SV {
    public static Notification.Builder D5P1xCAyuvgF(Notification.Builder builder, String str) {
        return builder.setSortKey(str);
    }

    public static Notification.Action.Builder Ee8d2j4S9Vm5yGuR(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        return new Notification.Action.Builder(i, charSequence, pendingIntent);
    }

    public static Notification.Action JXn4Qf7zpnLjP5(Notification.Action.Builder builder) {
        return builder.build();
    }

    public static Notification.Builder b1EoSIRjJHO5(Notification.Builder builder, boolean z) {
        return builder.setGroupSummary(z);
    }

    public static Notification.Builder dDIMxZXP1V8HdM(Notification.Builder builder, Notification.Action action) {
        return builder.addAction(action);
    }

    public static Notification.Builder ibVTtJUNfrGYbW(Notification.Builder builder, String str) {
        return builder.setGroup(str);
    }

    private static /* synthetic */ void ppyplqqoq() {
    }

    public static Notification.Builder pyu8ovAipBTLYAiKab(Notification.Builder builder, boolean z) {
        return builder.setLocalOnly(z);
    }

    public static Notification.Action.Builder vekpFI4d1Nc4fakF(Notification.Action.Builder builder, RemoteInput remoteInput) {
        return builder.addRemoteInput(remoteInput);
    }

    public static Notification.Action.Builder w9sT1Swbhx3hs(Notification.Action.Builder builder, Bundle bundle) {
        return builder.addExtras(bundle);
    }

    public static String xDyLpEZyrcKVe0(Notification notification) {
        return notification.getGroup();
    }
}
