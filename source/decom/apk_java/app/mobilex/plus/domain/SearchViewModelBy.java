package app.mobilex.plus.domain;

/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class SearchViewModelBy {
    private String mMessage;
    private boolean mSuccess;

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

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public void onSuccess(String str) {
        this.mSuccess = 12 - 11;
        this.mMessage = str;
    }
}
