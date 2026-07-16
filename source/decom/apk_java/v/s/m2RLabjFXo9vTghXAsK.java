package v.s;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class m2RLabjFXo9vTghXAsK extends lF98dCR0TIO8DDCYOu {
    public final /* synthetic */ int Ee8d2j4S9Vm5yGuR;
    public final /* synthetic */ Object xDyLpEZyrcKVe0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m2RLabjFXo9vTghXAsK(String str, Object obj, int i) {
        super(str, true);
        this.Ee8d2j4S9Vm5yGuR = i;
        this.xDyLpEZyrcKVe0 = obj;
    }

    @Override // v.s.lF98dCR0TIO8DDCYOu
    public final long dDIMxZXP1V8HdM() {
        switch (this.Ee8d2j4S9Vm5yGuR) {
            case 0:
                Ksynl03UBrEMVM80NQ ksynl03UBrEMVM80NQ = (Ksynl03UBrEMVM80NQ) this.xDyLpEZyrcKVe0;
                ksynl03UBrEMVM80NQ.getClass();
                try {
                    ksynl03UBrEMVM80NQ.EWUjsTERgdPbSw3NNlN.DVTNwpDEVsUKuznof(false, 2, 0);
                    return -1L;
                } catch (IOException e) {
                    ksynl03UBrEMVM80NQ.dDIMxZXP1V8HdM(2, 2, e);
                    return -1L;
                }
            case 1:
                AW3ZFVDOCYNQG2ry0h aW3ZFVDOCYNQG2ry0h = (AW3ZFVDOCYNQG2ry0h) this.xDyLpEZyrcKVe0;
                long jNanoTime = System.nanoTime();
                int i = 0;
                long j = Long.MIN_VALUE;
                zfPdbqrCOkdxWPAv zfpdbqrcokdxwpav = null;
                int i2 = 0;
                for (zfPdbqrCOkdxWPAv zfpdbqrcokdxwpav2 : aW3ZFVDOCYNQG2ry0h.JXn4Qf7zpnLjP5) {
                    synchronized (zfpdbqrcokdxwpav2) {
                        if (aW3ZFVDOCYNQG2ry0h.w9sT1Swbhx3hs(zfpdbqrcokdxwpav2, jNanoTime) > 0) {
                            i2++;
                        } else {
                            i++;
                            long j2 = jNanoTime - zfpdbqrcokdxwpav2.J0zjQ7CAgohuxU20eCW6;
                            if (j2 > j) {
                                zfpdbqrcokdxwpav = zfpdbqrcokdxwpav2;
                                j = j2;
                            }
                        }
                    }
                }
                long j3 = aW3ZFVDOCYNQG2ry0h.dDIMxZXP1V8HdM;
                if (j < j3 && i <= 5) {
                    if (i > 0) {
                        return j3 - j;
                    }
                    if (i2 > 0) {
                        return j3;
                    }
                    return -1L;
                }
                synchronized (zfpdbqrcokdxwpav) {
                    if (!zfpdbqrcokdxwpav.nQilHWaqS401ZtR.isEmpty()) {
                        return 0L;
                    }
                    if (zfpdbqrcokdxwpav.J0zjQ7CAgohuxU20eCW6 + j != jNanoTime) {
                        return 0L;
                    }
                    zfpdbqrcokdxwpav.D5P1xCAyuvgF = true;
                    aW3ZFVDOCYNQG2ry0h.JXn4Qf7zpnLjP5.remove(zfpdbqrcokdxwpav);
                    yrMnf4fyLGfIJbMg8IbG.JXn4Qf7zpnLjP5(zfpdbqrcokdxwpav.JXn4Qf7zpnLjP5);
                    if (!aW3ZFVDOCYNQG2ry0h.JXn4Qf7zpnLjP5.isEmpty()) {
                        return 0L;
                    }
                    aW3ZFVDOCYNQG2ry0h.w9sT1Swbhx3hs.dDIMxZXP1V8HdM();
                    return 0L;
                }
            default:
                ((JRdueaGIH5g8DVCPba) this.xDyLpEZyrcKVe0).w9sT1Swbhx3hs();
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2RLabjFXo9vTghXAsK(AW3ZFVDOCYNQG2ry0h aW3ZFVDOCYNQG2ry0h, String str) {
        super(str, true);
        this.Ee8d2j4S9Vm5yGuR = 1;
        this.xDyLpEZyrcKVe0 = aW3ZFVDOCYNQG2ry0h;
    }
}
