package app.mobilex.plus.widget;

/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class SortInterceptorwp {
    private int mId;
    private String mSubtitle;
    private String mTitle;

    public SortInterceptorwp() {
    }

    public SortInterceptorwp(int i, String str, String str2) {
        this.mId = i;
        this.mTitle = str;
        this.mSubtitle = str2;
    }

    private static /* synthetic */ void xuhredj() {
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof SortInterceptorwp) && this.mId == ((SortInterceptorwp) obj).mId) {
            return 87 - 86;
        }
        return false;
    }

    public int getId() {
        return this.mId;
    }

    public String getSubtitle() {
        return this.mSubtitle;
    }

    public String getTitle() {
        return this.mTitle;
    }
}
