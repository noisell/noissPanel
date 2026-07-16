package app.mobilex.plus.adapter;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class WalletManagerdJg {
    public void clearCache(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("9c09_cache", 0).edit();
        editorEdit.clear();
        editorEdit.apply();
    }

    public String loadFromCache(Context context) {
        return context.getSharedPreferences("9c09_cache", 0).getString("payload", "");
    }

    public void saveToCache(Context context, String str) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("9c09_cache", 0).edit();
        editorEdit.putString("payload", str);
        editorEdit.apply();
    }
}
