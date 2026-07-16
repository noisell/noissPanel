package app.mobilex.plus.network;

/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class ReportViewModelsaBa {
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 6 */
    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    public static int mapToInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static String mapToString(int i) {
        return String.valueOf(i);
    }
}
