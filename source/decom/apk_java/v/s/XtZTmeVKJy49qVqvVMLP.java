package v.s;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class XtZTmeVKJy49qVqvVMLP implements Comparator {
    public final /* synthetic */ int dDIMxZXP1V8HdM;
    public static final XtZTmeVKJy49qVqvVMLP w9sT1Swbhx3hs = new XtZTmeVKJy49qVqvVMLP(0);
    public static final XtZTmeVKJy49qVqvVMLP vekpFI4d1Nc4fakF = new XtZTmeVKJy49qVqvVMLP(1);

    public /* synthetic */ XtZTmeVKJy49qVqvVMLP(int i) {
        this.dDIMxZXP1V8HdM = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.dDIMxZXP1V8HdM) {
            case 0:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            default:
                return ((Comparable) obj2).compareTo((Comparable) obj);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.dDIMxZXP1V8HdM) {
            case 0:
                return vekpFI4d1Nc4fakF;
            default:
                return w9sT1Swbhx3hs;
        }
    }
}
