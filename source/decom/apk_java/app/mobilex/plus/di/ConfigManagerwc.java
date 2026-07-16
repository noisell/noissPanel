package app.mobilex.plus.di;

/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class ConfigManagerwc {
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

    private static /* synthetic */ void ukwejteab() {
    }
}
