package v.s;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class hhSFZZuhM8Vq extends jh03IwKTfxTtT1U implements NhN5GSKLYh6STld4 {
    public final /* synthetic */ HT6Px2xDdrmDEbykyYy D5P1xCAyuvgF;
    public final /* synthetic */ int b1EoSIRjJHO5;
    public final /* synthetic */ xuyi7QZPbnP6xOQ3Cu[] ibVTtJUNfrGYbW;
    public final /* synthetic */ AtomicInteger pyu8ovAipBTLYAiKab;
    public int xDyLpEZyrcKVe0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hhSFZZuhM8Vq(xuyi7QZPbnP6xOQ3Cu[] xuyi7qzpbnp6xoq3cuArr, int i, AtomicInteger atomicInteger, HT6Px2xDdrmDEbykyYy hT6Px2xDdrmDEbykyYy, b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q) {
        super(2, b9xroaxfr1fmoo2q);
        this.ibVTtJUNfrGYbW = xuyi7qzpbnp6xoq3cuArr;
        this.b1EoSIRjJHO5 = i;
        this.pyu8ovAipBTLYAiKab = atomicInteger;
        this.D5P1xCAyuvgF = hT6Px2xDdrmDEbykyYy;
    }

    private static /* synthetic */ void bvdbiydvss() {
    }

    @Override // v.s.NhN5GSKLYh6STld4
    public final Object b1EoSIRjJHO5(Object obj, Object obj2) {
        return ((hhSFZZuhM8Vq) dDIMxZXP1V8HdM((wh3Lv6S5rs6zqjV) obj, (b9xRoaXFR1fmOO2Q) obj2)).vekpFI4d1Nc4fakF(Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM);
    }

    @Override // v.s.CWIOrUfHtKyaxQib0W
    public final b9xRoaXFR1fmOO2Q dDIMxZXP1V8HdM(Object obj, b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q) {
        return new hhSFZZuhM8Vq(this.ibVTtJUNfrGYbW, this.b1EoSIRjJHO5, this.pyu8ovAipBTLYAiKab, this.D5P1xCAyuvgF, b9xroaxfr1fmoo2q);
    }

    @Override // v.s.CWIOrUfHtKyaxQib0W
    public final Object vekpFI4d1Nc4fakF(Object obj) {
        int i = this.xDyLpEZyrcKVe0;
        AtomicInteger atomicInteger = this.pyu8ovAipBTLYAiKab;
        HT6Px2xDdrmDEbykyYy hT6Px2xDdrmDEbykyYy = this.D5P1xCAyuvgF;
        try {
            if (i == 0) {
                SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                xuyi7QZPbnP6xOQ3Cu[] xuyi7qzpbnp6xoq3cuArr = this.ibVTtJUNfrGYbW;
                int i2 = this.b1EoSIRjJHO5;
                xuyi7QZPbnP6xOQ3Cu xuyi7qzpbnp6xoq3cu = xuyi7qzpbnp6xoq3cuArr[i2];
                EmMqMvvuaBifx1DNo6 emMqMvvuaBifx1DNo6 = new EmMqMvvuaBifx1DNo6(hT6Px2xDdrmDEbykyYy, i2);
                this.xDyLpEZyrcKVe0 = 1;
                Object objDDIMxZXP1V8HdM = xuyi7qzpbnp6xoq3cu.dDIMxZXP1V8HdM(emMqMvvuaBifx1DNo6, this);
                pjN1L01KDMWnPCy0daD pjn1l01kdmwnpcy0dad = pjN1L01KDMWnPCy0daD.w9sT1Swbhx3hs;
                if (objDDIMxZXP1V8HdM == pjn1l01kdmwnpcy0dad) {
                    return pjn1l01kdmwnpcy0dad;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                OFMrQsTe5s1KYV0lq.xDyLpEZyrcKVe0(hT6Px2xDdrmDEbykyYy);
            }
            return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
        } catch (Throwable th) {
            if (atomicInteger.decrementAndGet() == 0) {
                OFMrQsTe5s1KYV0lq.xDyLpEZyrcKVe0(hT6Px2xDdrmDEbykyYy);
            }
            throw th;
        }
    }
}
