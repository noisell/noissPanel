package app.mobilex.plus.domain;

/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class SettingsListenerRtwy {
    public static boolean isValid(String str) {
        return str != null && str.trim().length() >= 3;
    }

    private static /* synthetic */ void lbtgvsjk() {
    }

    public static String sanitize(String str) {
        return str == null ? "" : str.trim();
    }
}
