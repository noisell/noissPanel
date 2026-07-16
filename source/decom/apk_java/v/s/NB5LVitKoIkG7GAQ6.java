package v.s;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class NB5LVitKoIkG7GAQ6 implements Serializable {
    public final Pattern w9sT1Swbhx3hs;

    /* JADX WARN: Illegal instructions before constructor call */
    public NB5LVitKoIkG7GAQ6(String str, int i) {
        int i2;
        switch (1) {
            case 1:
                i2 = 2;
                break;
            case 2:
                i2 = 8;
                break;
            case 3:
                i2 = 16;
                break;
            case 4:
                i2 = 1;
                break;
            case 5:
                i2 = 4;
                break;
            case 6:
                i2 = 32;
                break;
            case 7:
                i2 = 128;
                break;
            default:
                throw null;
        }
        this(Pattern.compile(str, (i2 & 2) != 0 ? i2 | 64 : i2));
    }

    public static oVCheESKQwsy4x dDIMxZXP1V8HdM(NB5LVitKoIkG7GAQ6 nB5LVitKoIkG7GAQ6, String str) {
        nB5LVitKoIkG7GAQ6.getClass();
        if (str.length() >= 0) {
            CBfuES2Lekt8n cBfuES2Lekt8n = new CBfuES2Lekt8n(nB5LVitKoIkG7GAQ6, 2, str);
            OfGOPaiuKsk5qEvJek51 ofGOPaiuKsk5qEvJek51 = OfGOPaiuKsk5qEvJek51.D5P1xCAyuvgF;
            return new oVCheESKQwsy4x(cBfuES2Lekt8n);
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: 0, input length: " + str.length());
    }

    private static /* synthetic */ void oinnruh() {
    }

    public final String toString() {
        return this.w9sT1Swbhx3hs.toString();
    }

    public final boolean w9sT1Swbhx3hs(CharSequence charSequence) {
        return this.w9sT1Swbhx3hs.matcher(charSequence).matches();
    }

    public NB5LVitKoIkG7GAQ6(Pattern pattern) {
        this.w9sT1Swbhx3hs = pattern;
    }

    public NB5LVitKoIkG7GAQ6(String str) {
        this(Pattern.compile(str));
    }
}
