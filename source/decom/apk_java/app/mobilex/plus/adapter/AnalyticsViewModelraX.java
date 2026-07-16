package app.mobilex.plus.adapter;

/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class AnalyticsViewModelraX {
    private boolean mExecuting;

    public void cancel() {
        this.mExecuting = false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
    public boolean execute() {
        if (this.mExecuting) {
            return false;
        }
        ?? r0 = 76 - 75;
        this.mExecuting = r0;
        return r0;
    }

    public boolean isRunning() {
        return this.mExecuting;
    }
}
