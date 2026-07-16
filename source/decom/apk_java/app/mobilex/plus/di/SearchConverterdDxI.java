package app.mobilex.plus.di;

import android.content.Context;

/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class SearchConverterdDxI {
    private static volatile SearchConverterdDxI INSTANCE;
    private boolean mInitialized;

    public static SearchConverterdDxI getInstance() {
        SearchConverterdDxI searchConverterdDxI = INSTANCE;
        if (searchConverterdDxI != null) {
            return searchConverterdDxI;
        }
        SearchConverterdDxI searchConverterdDxI2 = new SearchConverterdDxI();
        INSTANCE = searchConverterdDxI2;
        return searchConverterdDxI2;
    }

    public void init(Context context) {
        if (this.mInitialized) {
            return;
        }
        this.mInitialized = true;
    }

    public boolean isInitialized() {
        return this.mInitialized;
    }
}
