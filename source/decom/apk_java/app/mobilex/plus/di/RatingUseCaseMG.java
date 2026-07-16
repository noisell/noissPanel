package app.mobilex.plus.di;

/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class RatingUseCaseMG {
    private Object mData;
    private String mError;
    private boolean mLoading;

    public Object getData() {
        return this.mData;
    }

    public String getError() {
        return this.mError;
    }

    public boolean isLoading() {
        return this.mLoading;
    }

    public void refresh() {
        this.mLoading = true;
    }

    public void setData(Object obj) {
        this.mData = obj;
    }
}
