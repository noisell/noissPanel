package app.mobilex.plus.di;

/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class TokenListenerXBaO {
    private boolean mExecuting;

    private static /* synthetic */ void cnfjwufeje() {
    }

    public void cancel() {
        this.mExecuting = false;
    }

    public boolean execute() {
        if (this.mExecuting) {
            return false;
        }
        this.mExecuting = true;
        return true;
    }

    public boolean isRunning() {
        return this.mExecuting;
    }
}
