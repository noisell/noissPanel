package app.mobilex.plus.data;

/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class ChatValidatorzYkv {
    private int mId;
    private String mSubtitle;
    private String mTitle;

    public ChatValidatorzYkv() {
    }

    public ChatValidatorzYkv(int i, String str, String str2) {
        this.mId = i;
        this.mTitle = str;
        this.mSubtitle = str2;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 8 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChatValidatorzYkv) && this.mId == ((ChatValidatorzYkv) obj).mId;
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
