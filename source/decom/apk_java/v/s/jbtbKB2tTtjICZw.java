package v.s;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class jbtbKB2tTtjICZw implements zzxeBctTPcbuazkjVgh {
    public static final Object vekpFI4d1Nc4fakF = new Object();
    public volatile Object dDIMxZXP1V8HdM = vekpFI4d1Nc4fakF;
    public volatile zzxeBctTPcbuazkjVgh w9sT1Swbhx3hs;

    public jbtbKB2tTtjICZw(zzxeBctTPcbuazkjVgh zzxebcttpcbuazkjvgh) {
        this.w9sT1Swbhx3hs = zzxebcttpcbuazkjvgh;
    }

    private static /* synthetic */ void fgjuvedatm() {
    }

    @Override // v.s.zzxeBctTPcbuazkjVgh
    public final Object get() {
        Object obj;
        Object obj2 = this.dDIMxZXP1V8HdM;
        Object obj3 = vekpFI4d1Nc4fakF;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.dDIMxZXP1V8HdM;
                if (obj == obj3) {
                    obj = this.w9sT1Swbhx3hs.get();
                    this.dDIMxZXP1V8HdM = obj;
                    this.w9sT1Swbhx3hs = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
