package app.mobilex.plus.widget;

/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class TokenBuilderSzx {
    private int mState;

    public int getState() {
        return this.mState;
    }

    public void reset() {
        this.mState = 0;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [app.mobilex.plus.widget.TokenBuilderSzx, int] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 3 */
    public boolean transition(int i) {
        int i2 = i - this.mState;
        ?? r2 = 97 - 95;
        if (i2 > r2 || i < 0) {
            return false;
        }
        r2.mState = i;
        return true;
    }
}
