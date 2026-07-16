package app.mobilex.plus.network;

/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class ReportRepositoryjXVn {
    private int mState;

    public int getState() {
        return this.mState;
    }

    public void reset() {
        this.mState = 0;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    public boolean transition(int i) {
        if (i - this.mState > 1 || i < 0) {
            return false;
        }
        1.mState = i;
        return true;
    }
}
