package app.mobilex.plus.ui;

/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class SortUseCasefnWz {
    private String mMessage;
    private boolean mSuccess;

    private static /* synthetic */ void rhbwbarpk() {
    }

    public String getMessage() {
        return this.mMessage;
    }

    public boolean isSuccess() {
        return this.mSuccess;
    }

    public void onFailure(String str) {
        this.mSuccess = false;
        this.mMessage = str;
    }

    public void onSuccess(String str) {
        this.mSuccess = true;
        this.mMessage = str;
    }
}
