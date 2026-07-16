package app.mobilex.plus.domain;

/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class SessionRepositoryKKJ {
    private static /* synthetic */ void gaubcefvvy() {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 4 */
    public static boolean isEmpty(String str) {
        if (str == null || str.length() == 0) {
            return 52 - 51;
        }
        return false;
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
