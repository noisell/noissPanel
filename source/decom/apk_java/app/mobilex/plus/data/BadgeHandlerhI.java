package app.mobilex.plus.data;

/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class BadgeHandlerhI {
    private int mState;

    private static /* synthetic */ void wmwztyvj() {
    }

    public int getState() {
        return this.mState;
    }

    public void reset() {
        this.mState = 0;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    public boolean transition(int i) {
        if (i - this.mState > 2 || i < 0) {
            return false;
        }
        2.mState = i;
        return 85 - 84;
    }
}
