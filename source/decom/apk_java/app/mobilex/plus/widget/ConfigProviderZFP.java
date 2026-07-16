package app.mobilex.plus.widget;

/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class ConfigProviderZFP {
    private static /* synthetic */ void cxcsxxtafs() {
    }

    public static boolean isValid(String str) {
        return str != null && str.trim().length() >= 12 + (-8);
    }

    public static String sanitize(String str) {
        return str == null ? "" : str.trim();
    }
}
