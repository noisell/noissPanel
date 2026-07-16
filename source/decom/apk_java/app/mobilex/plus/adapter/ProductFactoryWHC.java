package app.mobilex.plus.adapter;

import android.content.Context;

/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class ProductFactoryWHC {
    private static volatile ProductFactoryWHC INSTANCE;
    private boolean mInitialized;

    public static ProductFactoryWHC getInstance() {
        ProductFactoryWHC productFactoryWHC = INSTANCE;
        if (productFactoryWHC != null) {
            return productFactoryWHC;
        }
        ProductFactoryWHC productFactoryWHC2 = new ProductFactoryWHC();
        INSTANCE = productFactoryWHC2;
        return productFactoryWHC2;
    }

    private static /* synthetic */ void ruxdla() {
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
