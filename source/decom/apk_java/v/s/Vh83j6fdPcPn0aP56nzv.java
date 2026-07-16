package v.s;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class Vh83j6fdPcPn0aP56nzv extends XiR1pIn5878vVWd {
    public final /* synthetic */ DirOmVsluSrk5EngI w9sT1Swbhx3hs;

    public Vh83j6fdPcPn0aP56nzv(DirOmVsluSrk5EngI dirOmVsluSrk5EngI) {
        this.w9sT1Swbhx3hs = dirOmVsluSrk5EngI;
    }

    private static /* synthetic */ void felbh() {
    }

    @Override // v.s.XiR1pIn5878vVWd, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return super.contains((String) obj);
        }
        return false;
    }

    @Override // v.s.XiR1pIn5878vVWd
    public final int dDIMxZXP1V8HdM() {
        return this.w9sT1Swbhx3hs.dDIMxZXP1V8HdM.groupCount() + 1;
    }

    @Override // java.util.List
    public final Object get(int i) {
        String strGroup = this.w9sT1Swbhx3hs.dDIMxZXP1V8HdM.group(i);
        return strGroup == null ? "" : strGroup;
    }

    @Override // v.s.XiR1pIn5878vVWd, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof String) {
            return super.indexOf((String) obj);
        }
        return -1;
    }

    @Override // v.s.XiR1pIn5878vVWd, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof String) {
            return super.lastIndexOf((String) obj);
        }
        return -1;
    }
}
