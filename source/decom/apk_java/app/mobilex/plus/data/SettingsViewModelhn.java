package app.mobilex.plus.data;

/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class SettingsViewModelhn {
    public static boolean isValid(String str) {
        return str != null && str.trim().length() >= 7;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 5 */
    public static String sanitize(String str) {
        return str == null ? "" : str.trim();
    }
}
