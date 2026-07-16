package v.s;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class FVxyDmZ6Vklq5C {
    public final int Ee8d2j4S9Vm5yGuR;
    public final int JXn4Qf7zpnLjP5;
    public final String dDIMxZXP1V8HdM;
    public final Set ibVTtJUNfrGYbW;
    public final Set vekpFI4d1Nc4fakF;
    public final Set w9sT1Swbhx3hs;
    public final As2k35rSTTZ3RAUS xDyLpEZyrcKVe0;

    public FVxyDmZ6Vklq5C(String str, Set set, Set set2, int i, int i2, As2k35rSTTZ3RAUS as2k35rSTTZ3RAUS, Set set3) {
        this.dDIMxZXP1V8HdM = str;
        this.w9sT1Swbhx3hs = Collections.unmodifiableSet(set);
        this.vekpFI4d1Nc4fakF = Collections.unmodifiableSet(set2);
        this.JXn4Qf7zpnLjP5 = i;
        this.Ee8d2j4S9Vm5yGuR = i2;
        this.xDyLpEZyrcKVe0 = as2k35rSTTZ3RAUS;
        this.ibVTtJUNfrGYbW = Collections.unmodifiableSet(set3);
    }

    public static n7PoiLplax4gndPURV dDIMxZXP1V8HdM(QwPxr2jx1iGLmehgkv3g qwPxr2jx1iGLmehgkv3g) {
        return new n7PoiLplax4gndPURV(qwPxr2jx1iGLmehgkv3g, new QwPxr2jx1iGLmehgkv3g[0]);
    }

    public static FVxyDmZ6Vklq5C w9sT1Swbhx3hs(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(QwPxr2jx1iGLmehgkv3g.dDIMxZXP1V8HdM(cls));
        for (Class cls2 : clsArr) {
            jb8et6SZeK5TWMrJFxDX.JXn4Qf7zpnLjP5(cls2, "Null interface");
            hashSet.add(QwPxr2jx1iGLmehgkv3g.dDIMxZXP1V8HdM(cls2));
        }
        return new FVxyDmZ6Vklq5C(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new rA0nQJPukyMi(1, obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.w9sT1Swbhx3hs.toArray()) + ">{" + this.JXn4Qf7zpnLjP5 + ", type=" + this.Ee8d2j4S9Vm5yGuR + ", deps=" + Arrays.toString(this.vekpFI4d1Nc4fakF.toArray()) + "}";
    }
}
