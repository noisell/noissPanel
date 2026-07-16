package app.mobilex.plus;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class SettingsFragmentYmer {
    private Context ctx;

    public static boolean getBool(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.getBoolean(str, false);
    }

    public static SharedPreferences getDefaultPrefs(Context context) {
        return context.getSharedPreferences("SettingsFragmentYmer_prefs", 0);
    }
}
