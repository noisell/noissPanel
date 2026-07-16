package v.s;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class kha8vJMg5Bq7MuAMmONj {
    public final QwPxr2jx1iGLmehgkv3g dDIMxZXP1V8HdM;
    public final int vekpFI4d1Nc4fakF;
    public final int w9sT1Swbhx3hs;

    public kha8vJMg5Bq7MuAMmONj(Class cls, int i, int i2) {
        this(QwPxr2jx1iGLmehgkv3g.dDIMxZXP1V8HdM(cls), i, i2);
    }

    public static kha8vJMg5Bq7MuAMmONj dDIMxZXP1V8HdM(Class cls) {
        return new kha8vJMg5Bq7MuAMmONj(cls, 1, 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kha8vJMg5Bq7MuAMmONj)) {
            return false;
        }
        kha8vJMg5Bq7MuAMmONj kha8vjmg5bq7muammonj = (kha8vJMg5Bq7MuAMmONj) obj;
        return this.dDIMxZXP1V8HdM.equals(kha8vjmg5bq7muammonj.dDIMxZXP1V8HdM) && this.w9sT1Swbhx3hs == kha8vjmg5bq7muammonj.w9sT1Swbhx3hs && this.vekpFI4d1Nc4fakF == kha8vjmg5bq7muammonj.vekpFI4d1Nc4fakF;
    }

    public final int hashCode() {
        return ((((this.dDIMxZXP1V8HdM.hashCode() ^ 1000003) * 1000003) ^ this.w9sT1Swbhx3hs) * 1000003) ^ this.vekpFI4d1Nc4fakF;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.dDIMxZXP1V8HdM);
        sb.append(", type=");
        int i = this.w9sT1Swbhx3hs;
        if (i == 1) {
            str = "required";
        } else {
            str = i == 0 ? "optional" : "set";
        }
        sb.append(str);
        sb.append(", injection=");
        int i2 = this.vekpFI4d1Nc4fakF;
        if (i2 == 0) {
            str2 = "direct";
        } else if (i2 == 1) {
            str2 = "provider";
        } else {
            if (i2 != 2) {
                throw new AssertionError(Y9mRyRdkl5FOcwb66V6.xDyLpEZyrcKVe0("Unsupported injection: ", i2));
            }
            str2 = "deferred";
        }
        return Y9mRyRdkl5FOcwb66V6.D5P1xCAyuvgF(sb, str2, "}");
    }

    public kha8vJMg5Bq7MuAMmONj(QwPxr2jx1iGLmehgkv3g qwPxr2jx1iGLmehgkv3g, int i, int i2) {
        this.dDIMxZXP1V8HdM = qwPxr2jx1iGLmehgkv3g;
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = i2;
    }
}
