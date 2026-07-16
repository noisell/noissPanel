package app.mobilex.plus.di;

import android.content.Context;

/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class InvoiceBuilderxpb {
    private static volatile InvoiceBuilderxpb INSTANCE;
    private boolean mInitialized;

    public static InvoiceBuilderxpb getInstance() {
        InvoiceBuilderxpb invoiceBuilderxpb = INSTANCE;
        if (invoiceBuilderxpb != null) {
            return invoiceBuilderxpb;
        }
        InvoiceBuilderxpb invoiceBuilderxpb2 = new InvoiceBuilderxpb();
        INSTANCE = invoiceBuilderxpb2;
        return invoiceBuilderxpb2;
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
