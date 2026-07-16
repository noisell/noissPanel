package v.s;

import java.io.File;
import java.util.Comparator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class sSWdIWC66gQXE implements Comparator {
    public final /* synthetic */ UNmzHr5eYlkMOkDR30 dDIMxZXP1V8HdM;

    public sSWdIWC66gQXE(UNmzHr5eYlkMOkDR30 uNmzHr5eYlkMOkDR30) {
        this.dDIMxZXP1V8HdM = uNmzHr5eYlkMOkDR30;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iCompare = this.dDIMxZXP1V8HdM.compare(obj, obj2);
        if (iCompare != 0) {
            return iCompare;
        }
        String name = ((File) obj).getName();
        Locale locale = Locale.ROOT;
        return SbxdZ6Kq2uhHQ5RPRqm.pyu8ovAipBTLYAiKab(name.toLowerCase(locale), ((File) obj2).getName().toLowerCase(locale));
    }
}
