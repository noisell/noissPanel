package v.s;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class dPxH1qsKC2Lxf7PHXDZT implements Iterable, buUjKwCmuWSvVXs {
    public final int JXn4Qf7zpnLjP5;
    public final int vekpFI4d1Nc4fakF;
    public final int w9sT1Swbhx3hs;

    public dPxH1qsKC2Lxf7PHXDZT(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = y6jRGLEWNMir.Ee8d2j4S9Vm5yGuR(i, i2, i3);
        this.JXn4Qf7zpnLjP5 = i3;
    }

    private static /* synthetic */ void pbxhjnhf() {
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: dDIMxZXP1V8HdM, reason: merged with bridge method [inline-methods] */
    public final xH380dEhDsa5zwemTP iterator() {
        return new xH380dEhDsa5zwemTP(this.w9sT1Swbhx3hs, this.vekpFI4d1Nc4fakF, this.JXn4Qf7zpnLjP5);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof dPxH1qsKC2Lxf7PHXDZT)) {
            return false;
        }
        if (isEmpty() && ((dPxH1qsKC2Lxf7PHXDZT) obj).isEmpty()) {
            return true;
        }
        dPxH1qsKC2Lxf7PHXDZT dpxh1qskc2lxf7phxdzt = (dPxH1qsKC2Lxf7PHXDZT) obj;
        return this.w9sT1Swbhx3hs == dpxh1qskc2lxf7phxdzt.w9sT1Swbhx3hs && this.vekpFI4d1Nc4fakF == dpxh1qskc2lxf7phxdzt.vekpFI4d1Nc4fakF && this.JXn4Qf7zpnLjP5 == dpxh1qskc2lxf7phxdzt.JXn4Qf7zpnLjP5;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.w9sT1Swbhx3hs * 31) + this.vekpFI4d1Nc4fakF) * 31) + this.JXn4Qf7zpnLjP5;
    }

    public boolean isEmpty() {
        int i = this.JXn4Qf7zpnLjP5;
        int i2 = this.vekpFI4d1Nc4fakF;
        int i3 = this.w9sT1Swbhx3hs;
        if (i > 0) {
            return i3 > i2;
        }
        return i3 < i2;
    }

    public String toString() {
        StringBuilder sb;
        int i = this.vekpFI4d1Nc4fakF;
        int i2 = this.w9sT1Swbhx3hs;
        int i3 = this.JXn4Qf7zpnLjP5;
        if (i3 > 0) {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i3);
        } else {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i3);
        }
        return sb.toString();
    }
}
