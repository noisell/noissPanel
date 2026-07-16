package app.mobilex.plus.domain;

/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class BadgeInterceptorftu {
    private int mState;

    private static /* synthetic */ void xlqe() {
    }

    public int getState() {
        return this.mState;
    }

    public void reset() {
        this.mState = 0;
    }

    public boolean transition(int i) {
        if (i - this.mState > 5 || i < 0) {
            return false;
        }
        5.mState = i;
        return true;
    }
}
