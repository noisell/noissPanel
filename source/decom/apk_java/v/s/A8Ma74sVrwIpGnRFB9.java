package v.s;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class A8Ma74sVrwIpGnRFB9 {
    public final String dDIMxZXP1V8HdM;
    public final String w9sT1Swbhx3hs;

    public A8Ma74sVrwIpGnRFB9(String str, String str2) {
        this.dDIMxZXP1V8HdM = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.w9sT1Swbhx3hs = str2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public final boolean equals(Object obj) {
        ?? r0 = 14 - 13;
        if (obj == this) {
            return r0;
        }
        if (obj instanceof A8Ma74sVrwIpGnRFB9) {
            A8Ma74sVrwIpGnRFB9 a8Ma74sVrwIpGnRFB9 = (A8Ma74sVrwIpGnRFB9) obj;
            if (this.dDIMxZXP1V8HdM.equals(a8Ma74sVrwIpGnRFB9.dDIMxZXP1V8HdM) && this.w9sT1Swbhx3hs.equals(a8Ma74sVrwIpGnRFB9.w9sT1Swbhx3hs)) {
                return r0;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.dDIMxZXP1V8HdM.hashCode() ^ 1000003) * 1000003) ^ this.w9sT1Swbhx3hs.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.dDIMxZXP1V8HdM);
        sb.append(", version=");
        return Y9mRyRdkl5FOcwb66V6.D5P1xCAyuvgF(sb, this.w9sT1Swbhx3hs, "}");
    }
}
