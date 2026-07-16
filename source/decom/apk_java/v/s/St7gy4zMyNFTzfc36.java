package v.s;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class St7gy4zMyNFTzfc36 implements RZKLDkRu6ZWDxTDL71X {
    public static final Object JXn4Qf7zpnLjP5 = new Object();
    public volatile Object vekpFI4d1Nc4fakF;
    public volatile pARxL2hv3Xoc w9sT1Swbhx3hs;

    public static RZKLDkRu6ZWDxTDL71X dDIMxZXP1V8HdM(pARxL2hv3Xoc parxl2hv3xoc) {
        if (parxl2hv3xoc instanceof St7gy4zMyNFTzfc36) {
            return parxl2hv3xoc;
        }
        St7gy4zMyNFTzfc36 st7gy4zMyNFTzfc36 = new St7gy4zMyNFTzfc36();
        st7gy4zMyNFTzfc36.vekpFI4d1Nc4fakF = JXn4Qf7zpnLjP5;
        st7gy4zMyNFTzfc36.w9sT1Swbhx3hs = parxl2hv3xoc;
        return st7gy4zMyNFTzfc36;
    }

    @Override // v.s.RZKLDkRu6ZWDxTDL71X
    public final Object get() {
        Object obj;
        Object obj2 = this.vekpFI4d1Nc4fakF;
        Object obj3 = JXn4Qf7zpnLjP5;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.vekpFI4d1Nc4fakF;
                if (obj == obj3) {
                    obj = this.w9sT1Swbhx3hs.get();
                    Object obj4 = this.vekpFI4d1Nc4fakF;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.vekpFI4d1Nc4fakF = obj;
                    this.w9sT1Swbhx3hs = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
