package app.mobilex.plus;

import android.app.NotificationManager;
import android.content.Context;

/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class NotifHelperumy {
    public static void cancel(Context context, int i) {
        ((NotificationManager) context.getSystemService("notification")).cancel(i);
    }
}
