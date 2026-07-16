package app.mobilex.plus.di;

import android.content.Context;

/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class MessageViewModelxSB {
    private static volatile MessageViewModelxSB INSTANCE;
    private boolean mInitialized;

    public static MessageViewModelxSB getInstance() {
        MessageViewModelxSB messageViewModelxSB = INSTANCE;
        if (messageViewModelxSB != null) {
            return messageViewModelxSB;
        }
        MessageViewModelxSB messageViewModelxSB2 = new MessageViewModelxSB();
        INSTANCE = messageViewModelxSB2;
        return messageViewModelxSB2;
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
