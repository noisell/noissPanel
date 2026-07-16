package app.mobilex.plus;

import android.content.Context;
import java.util.UUID;

/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class AnalyticsTrackerVBe {
    private static boolean enabled;
    private static String sessionId;

    public static void init(Context context) {
        enabled = true;
        sessionId = UUID.randomUUID().toString();
    }

    private static /* synthetic */ void qahreeq() {
    }
}
