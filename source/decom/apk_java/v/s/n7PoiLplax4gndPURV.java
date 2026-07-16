package v.s;

import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class n7PoiLplax4gndPURV {
    public final int Ee8d2j4S9Vm5yGuR;
    public int JXn4Qf7zpnLjP5;
    public String dDIMxZXP1V8HdM = null;
    public final HashSet ibVTtJUNfrGYbW;
    public final HashSet vekpFI4d1Nc4fakF;
    public final HashSet w9sT1Swbhx3hs;
    public As2k35rSTTZ3RAUS xDyLpEZyrcKVe0;

    public n7PoiLplax4gndPURV(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.w9sT1Swbhx3hs = hashSet;
        this.vekpFI4d1Nc4fakF = new HashSet();
        this.JXn4Qf7zpnLjP5 = 0;
        this.Ee8d2j4S9Vm5yGuR = 0;
        this.ibVTtJUNfrGYbW = new HashSet();
        hashSet.add(QwPxr2jx1iGLmehgkv3g.dDIMxZXP1V8HdM(cls));
        for (Class cls2 : clsArr) {
            jb8et6SZeK5TWMrJFxDX.JXn4Qf7zpnLjP5(cls2, "Null interface");
            this.w9sT1Swbhx3hs.add(QwPxr2jx1iGLmehgkv3g.dDIMxZXP1V8HdM(cls2));
        }
    }

    private static /* synthetic */ void gutdudahff() {
    }

    public final void dDIMxZXP1V8HdM(kha8vJMg5Bq7MuAMmONj kha8vjmg5bq7muammonj) {
        if (this.w9sT1Swbhx3hs.contains(kha8vjmg5bq7muammonj.dDIMxZXP1V8HdM)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        this.vekpFI4d1Nc4fakF.add(kha8vjmg5bq7muammonj);
    }

    public final FVxyDmZ6Vklq5C w9sT1Swbhx3hs() {
        if (this.xDyLpEZyrcKVe0 != null) {
            return new FVxyDmZ6Vklq5C(this.dDIMxZXP1V8HdM, new HashSet(this.w9sT1Swbhx3hs), new HashSet(this.vekpFI4d1Nc4fakF), this.JXn4Qf7zpnLjP5, this.Ee8d2j4S9Vm5yGuR, this.xDyLpEZyrcKVe0, this.ibVTtJUNfrGYbW);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public n7PoiLplax4gndPURV(QwPxr2jx1iGLmehgkv3g qwPxr2jx1iGLmehgkv3g, QwPxr2jx1iGLmehgkv3g[] qwPxr2jx1iGLmehgkv3gArr) {
        HashSet hashSet = new HashSet();
        this.w9sT1Swbhx3hs = hashSet;
        this.vekpFI4d1Nc4fakF = new HashSet();
        this.JXn4Qf7zpnLjP5 = 0;
        this.Ee8d2j4S9Vm5yGuR = 0;
        this.ibVTtJUNfrGYbW = new HashSet();
        hashSet.add(qwPxr2jx1iGLmehgkv3g);
        for (QwPxr2jx1iGLmehgkv3g qwPxr2jx1iGLmehgkv3g2 : qwPxr2jx1iGLmehgkv3gArr) {
            jb8et6SZeK5TWMrJFxDX.JXn4Qf7zpnLjP5(qwPxr2jx1iGLmehgkv3g2, "Null interface");
        }
        Collections.addAll(this.w9sT1Swbhx3hs, qwPxr2jx1iGLmehgkv3gArr);
    }
}
