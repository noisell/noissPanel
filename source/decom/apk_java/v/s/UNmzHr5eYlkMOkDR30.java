package v.s;

import android.hardware.Camera;
import java.io.File;
import java.util.Comparator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class UNmzHr5eYlkMOkDR30 implements Comparator {
    public final /* synthetic */ int dDIMxZXP1V8HdM;

    public /* synthetic */ UNmzHr5eYlkMOkDR30(int i) {
        this.dDIMxZXP1V8HdM = i;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00b4 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x00b8 A[RETURN, SYNTHETIC] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.dDIMxZXP1V8HdM) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                int iMin = Math.min(str.length(), str2.length());
                for (int i = 4; i < iMin; i++) {
                    char cCharAt = str.charAt(i);
                    char cCharAt2 = str2.charAt(i);
                    if (cCharAt != cCharAt2) {
                        if (okc5AGRjqrud84oM6d.xDyLpEZyrcKVe0(cCharAt, cCharAt2) < 0) {
                            return -1;
                        }
                        return 1;
                    }
                }
                int length = str.length();
                int length2 = str2.length();
                if (length == length2) {
                    return 0;
                }
                if (length < length2) {
                    return -1;
                }
                return 1;
            case 1:
                String str3 = ((WIKLcjboz2gWNKuJLy) obj).dDIMxZXP1V8HdM;
                Locale locale = Locale.ROOT;
                return SbxdZ6Kq2uhHQ5RPRqm.pyu8ovAipBTLYAiKab(str3.toLowerCase(locale), ((WIKLcjboz2gWNKuJLy) obj2).dDIMxZXP1V8HdM.toLowerCase(locale));
            case 2:
                return SbxdZ6Kq2uhHQ5RPRqm.pyu8ovAipBTLYAiKab(Long.valueOf(((PBAylXS4TQHeesjIdIs) obj2).vekpFI4d1Nc4fakF), Long.valueOf(((PBAylXS4TQHeesjIdIs) obj).vekpFI4d1Nc4fakF));
            case 3:
                return SbxdZ6Kq2uhHQ5RPRqm.pyu8ovAipBTLYAiKab(Boolean.valueOf(!((File) obj).isDirectory()), Boolean.valueOf(!((File) obj2).isDirectory()));
            case 4:
                return SbxdZ6Kq2uhHQ5RPRqm.pyu8ovAipBTLYAiKab(Integer.valueOf(((Camera.Size) obj).width), Integer.valueOf(((Camera.Size) obj2).width));
            default:
                return SbxdZ6Kq2uhHQ5RPRqm.pyu8ovAipBTLYAiKab(Long.valueOf(((dZVJuBScWGpS) obj2).JXn4Qf7zpnLjP5), Long.valueOf(((dZVJuBScWGpS) obj).JXn4Qf7zpnLjP5));
        }
    }
}
