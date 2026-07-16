package v.s;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class jT0yxhiu58TfqgtEl extends C2Ijs2qpFRcKXI implements MNtJgB2yjlHSGZEkvaz, PlEar6PWlRV4Ye5VJrU, I8VlxcUqeeopgTsc7h {
    public final int b1EoSIRjJHO5;
    public final int pyu8ovAipBTLYAiKab;

    public jT0yxhiu58TfqgtEl(int i, Class cls, String str, String str2, int i2) {
        super(V1XIEYmMexyqOT.w9sT1Swbhx3hs, cls, str, str2, (i2 & 1) == 1);
        this.b1EoSIRjJHO5 = i;
        this.pyu8ovAipBTLYAiKab = 0;
    }

    private static /* synthetic */ void zymdrr() {
    }

    @Override // v.s.MNtJgB2yjlHSGZEkvaz
    public final int JXn4Qf7zpnLjP5() {
        return this.b1EoSIRjJHO5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jT0yxhiu58TfqgtEl) {
            jT0yxhiu58TfqgtEl jt0yxhiu58tfqgtel = (jT0yxhiu58TfqgtEl) obj;
            return this.Ee8d2j4S9Vm5yGuR.equals(jt0yxhiu58tfqgtel.Ee8d2j4S9Vm5yGuR) && this.xDyLpEZyrcKVe0.equals(jt0yxhiu58tfqgtel.xDyLpEZyrcKVe0) && this.pyu8ovAipBTLYAiKab == jt0yxhiu58tfqgtel.pyu8ovAipBTLYAiKab && this.b1EoSIRjJHO5 == jt0yxhiu58tfqgtel.b1EoSIRjJHO5 && this.vekpFI4d1Nc4fakF.equals(jt0yxhiu58tfqgtel.vekpFI4d1Nc4fakF) && dDIMxZXP1V8HdM().equals(jt0yxhiu58tfqgtel.dDIMxZXP1V8HdM());
        }
        if (!(obj instanceof jT0yxhiu58TfqgtEl)) {
            return false;
        }
        PlEar6PWlRV4Ye5VJrU plEar6PWlRV4Ye5VJrU = this.w9sT1Swbhx3hs;
        if (plEar6PWlRV4Ye5VJrU == null) {
            vekpFI4d1Nc4fakF();
            this.w9sT1Swbhx3hs = this;
            plEar6PWlRV4Ye5VJrU = this;
        }
        return obj.equals(plEar6PWlRV4Ye5VJrU);
    }

    public final int hashCode() {
        dDIMxZXP1V8HdM();
        return this.xDyLpEZyrcKVe0.hashCode() + Y9mRyRdkl5FOcwb66V6.JXn4Qf7zpnLjP5(this.Ee8d2j4S9Vm5yGuR, dDIMxZXP1V8HdM().hashCode() * 31, 31);
    }

    public final String toString() {
        PlEar6PWlRV4Ye5VJrU plEar6PWlRV4Ye5VJrU = this.w9sT1Swbhx3hs;
        if (plEar6PWlRV4Ye5VJrU == null) {
            vekpFI4d1Nc4fakF();
            this.w9sT1Swbhx3hs = this;
            plEar6PWlRV4Ye5VJrU = this;
        }
        if (plEar6PWlRV4Ye5VJrU != this) {
            return plEar6PWlRV4Ye5VJrU.toString();
        }
        String str = this.Ee8d2j4S9Vm5yGuR;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + str + " (Kotlin reflection is not available)";
    }

    public final PlEar6PWlRV4Ye5VJrU vekpFI4d1Nc4fakF() {
        Q7ncPL8Ht3Jh70mWLfou.dDIMxZXP1V8HdM.getClass();
        return this;
    }
}
