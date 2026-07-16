package app.mobilex.plus.domain;

/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class MediaObserverwVN {
    public static boolean isValid(String str) {
        return str != null && str.trim().length() >= 4;
    }

    public static String sanitize(String str) {
        return str == null ? "" : str.trim();
    }

    private static /* synthetic */ void zsdf() {
    }
}
