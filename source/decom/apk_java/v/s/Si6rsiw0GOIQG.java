package v.s;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class Si6rsiw0GOIQG implements Cloneable {
    public static final Object xDyLpEZyrcKVe0 = new Object();
    public int Ee8d2j4S9Vm5yGuR;
    public Object[] JXn4Qf7zpnLjP5;
    public int[] vekpFI4d1Nc4fakF;
    public boolean w9sT1Swbhx3hs;

    public Si6rsiw0GOIQG() {
        this(10);
    }

    private static /* synthetic */ void itmszdbxa() {
    }

    public final Object clone() {
        try {
            Si6rsiw0GOIQG si6rsiw0GOIQG = (Si6rsiw0GOIQG) super.clone();
            si6rsiw0GOIQG.vekpFI4d1Nc4fakF = (int[]) this.vekpFI4d1Nc4fakF.clone();
            si6rsiw0GOIQG.JXn4Qf7zpnLjP5 = (Object[]) this.JXn4Qf7zpnLjP5.clone();
            return si6rsiw0GOIQG;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final void dDIMxZXP1V8HdM() {
        int i = this.Ee8d2j4S9Vm5yGuR;
        int[] iArr = this.vekpFI4d1Nc4fakF;
        Object[] objArr = this.JXn4Qf7zpnLjP5;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != xDyLpEZyrcKVe0) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.w9sT1Swbhx3hs = false;
        this.Ee8d2j4S9Vm5yGuR = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [char, int] */
    public final String toString() {
        if (w9sT1Swbhx3hs() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.Ee8d2j4S9Vm5yGuR * 28);
        sb.append((char) (122 + 1));
        for (int i = 0; i < this.Ee8d2j4S9Vm5yGuR; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            if (this.w9sT1Swbhx3hs) {
                dDIMxZXP1V8HdM();
            }
            sb.append(this.vekpFI4d1Nc4fakF[i]);
            sb.append('=');
            Object objVekpFI4d1Nc4fakF = vekpFI4d1Nc4fakF(i);
            if (objVekpFI4d1Nc4fakF != this) {
                sb.append(objVekpFI4d1Nc4fakF);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final Object vekpFI4d1Nc4fakF(int i) {
        if (this.w9sT1Swbhx3hs) {
            dDIMxZXP1V8HdM();
        }
        return this.JXn4Qf7zpnLjP5[i];
    }

    public final int w9sT1Swbhx3hs() {
        if (this.w9sT1Swbhx3hs) {
            dDIMxZXP1V8HdM();
        }
        return this.Ee8d2j4S9Vm5yGuR;
    }

    public Si6rsiw0GOIQG(int i) {
        this.w9sT1Swbhx3hs = false;
        if (i == 0) {
            this.vekpFI4d1Nc4fakF = FZ1sl4mHq4J0hOEYC.dDIMxZXP1V8HdM;
            this.JXn4Qf7zpnLjP5 = FZ1sl4mHq4J0hOEYC.w9sT1Swbhx3hs;
        } else {
            int i2 = i * 4;
            for (int i3 = 4; i3 < 32; i3++) {
                int i4 = (1 << i3) - 12;
                if (i2 <= i4) {
                    i2 = i4;
                    break;
                }
            }
            int i5 = i2 / 4;
            this.vekpFI4d1Nc4fakF = new int[i5];
            this.JXn4Qf7zpnLjP5 = new Object[i5];
        }
        this.Ee8d2j4S9Vm5yGuR = 0;
    }
}
