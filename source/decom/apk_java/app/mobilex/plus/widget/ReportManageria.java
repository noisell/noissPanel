package app.mobilex.plus.widget;

/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class ReportManageria {
    private int mId;
    private String mSubtitle;
    private String mTitle;

    public ReportManageria() {
    }

    public ReportManageria(int i, String str, String str2) {
        this.mId = i;
        this.mTitle = str;
        this.mSubtitle = str2;
    }

    private static /* synthetic */ void wfriy() {
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 7 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReportManageria) && this.mId == ((ReportManageria) obj).mId;
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
