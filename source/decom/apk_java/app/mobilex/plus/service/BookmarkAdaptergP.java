package app.mobilex.plus.service;

/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class BookmarkAdaptergP {
    private int mId;
    private String mSubtitle;
    private String mTitle;

    public BookmarkAdaptergP() {
    }

    public BookmarkAdaptergP(int i, String str, String str2) {
        this.mId = i;
        this.mTitle = str;
        this.mSubtitle = str2;
    }

    private static /* synthetic */ void jdlpl() {
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 4 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BookmarkAdaptergP) && this.mId == ((BookmarkAdaptergP) obj).mId;
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
