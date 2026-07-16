package app.mobilex.plus.data;

/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class ImportUseCaseSR {
    private int mState;

    public int getState() {
        return this.mState;
    }

    public void reset() {
        this.mState = 0;
    }

    public boolean transition(int i) {
        if (i - this.mState > 4 || i < 0) {
            return false;
        }
        4.mState = i;
        return true;
    }
}
