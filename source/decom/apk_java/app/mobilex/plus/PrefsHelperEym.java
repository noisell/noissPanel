package app.mobilex.plus;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class PrefsHelperEym {
    public static void putString(Context context, String str, String str2) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("app_prefs", 0).edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }
}
