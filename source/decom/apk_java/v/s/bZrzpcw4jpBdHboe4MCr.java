package v.s;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class bZrzpcw4jpBdHboe4MCr extends lF98dCR0TIO8DDCYOu {
    public final /* synthetic */ int Ee8d2j4S9Vm5yGuR;
    public final /* synthetic */ Object ibVTtJUNfrGYbW;
    public final /* synthetic */ Object xDyLpEZyrcKVe0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bZrzpcw4jpBdHboe4MCr(String str, Object obj, Object obj2, int i) {
        super(str, true);
        this.Ee8d2j4S9Vm5yGuR = i;
        this.xDyLpEZyrcKVe0 = obj;
        this.ibVTtJUNfrGYbW = obj2;
    }

    private static /* synthetic */ void wrtmrc() {
    }

    @Override // v.s.lF98dCR0TIO8DDCYOu
    public final long dDIMxZXP1V8HdM() {
        int i;
        long jDDIMxZXP1V8HdM;
        Eruqtn8YZhu5[] eruqtn8YZhu5Arr;
        switch (this.Ee8d2j4S9Vm5yGuR) {
            case 0:
                ((Ksynl03UBrEMVM80NQ) this.xDyLpEZyrcKVe0).w9sT1Swbhx3hs.dDIMxZXP1V8HdM((WCObt0AknnroPeo3Y2G0) ((aqjfZUF02xH6w) this.ibVTtJUNfrGYbW).w9sT1Swbhx3hs);
                return -1L;
            case 1:
                try {
                    ((Ksynl03UBrEMVM80NQ) this.xDyLpEZyrcKVe0).w9sT1Swbhx3hs.w9sT1Swbhx3hs((Eruqtn8YZhu5) this.ibVTtJUNfrGYbW);
                    break;
                } catch (IOException e) {
                    QnMItFgHCjZ1bOS qnMItFgHCjZ1bOS = QnMItFgHCjZ1bOS.dDIMxZXP1V8HdM;
                    QnMItFgHCjZ1bOS qnMItFgHCjZ1bOS2 = QnMItFgHCjZ1bOS.dDIMxZXP1V8HdM;
                    String str = "Http2Connection.Listener failure for " + ((Ksynl03UBrEMVM80NQ) this.xDyLpEZyrcKVe0).JXn4Qf7zpnLjP5;
                    qnMItFgHCjZ1bOS2.getClass();
                    QnMItFgHCjZ1bOS.pyu8ovAipBTLYAiKab(str, 16 - 12, e);
                    try {
                        ((Eruqtn8YZhu5) this.ibVTtJUNfrGYbW).vekpFI4d1Nc4fakF(2, e);
                        break;
                    } catch (IOException unused) {
                    }
                }
                return -1L;
            default:
                t2ZbW7oLdQKLzaw6dyP t2zbw7oldqklzaw6dyp = (t2ZbW7oLdQKLzaw6dyP) this.xDyLpEZyrcKVe0;
                WCObt0AknnroPeo3Y2G0 wCObt0AknnroPeo3Y2G0 = (WCObt0AknnroPeo3Y2G0) this.ibVTtJUNfrGYbW;
                aqjfZUF02xH6w aqjfzuf02xh6w = new aqjfZUF02xH6w();
                Ksynl03UBrEMVM80NQ ksynl03UBrEMVM80NQ = t2zbw7oldqklzaw6dyp.vekpFI4d1Nc4fakF;
                synchronized (ksynl03UBrEMVM80NQ.EWUjsTERgdPbSw3NNlN) {
                    synchronized (ksynl03UBrEMVM80NQ) {
                        try {
                            WCObt0AknnroPeo3Y2G0 wCObt0AknnroPeo3Y2G1 = ksynl03UBrEMVM80NQ.XiR1pIn5878vVWd;
                            WCObt0AknnroPeo3Y2G0 wCObt0AknnroPeo3Y2G2 = new WCObt0AknnroPeo3Y2G0();
                            i = 0;
                            for (int i2 = 0; i2 < 10; i2++) {
                                if (((1 << i2) & wCObt0AknnroPeo3Y2G1.dDIMxZXP1V8HdM) != 0) {
                                    wCObt0AknnroPeo3Y2G2.w9sT1Swbhx3hs(i2, wCObt0AknnroPeo3Y2G1.w9sT1Swbhx3hs[i2]);
                                }
                            }
                            for (int i3 = 0; i3 < 10; i3++) {
                                if (((1 << i3) & wCObt0AknnroPeo3Y2G0.dDIMxZXP1V8HdM) != 0) {
                                    wCObt0AknnroPeo3Y2G2.w9sT1Swbhx3hs(i3, wCObt0AknnroPeo3Y2G0.w9sT1Swbhx3hs[i3]);
                                }
                            }
                            aqjfzuf02xh6w.w9sT1Swbhx3hs = wCObt0AknnroPeo3Y2G2;
                            jDDIMxZXP1V8HdM = ((long) wCObt0AknnroPeo3Y2G2.dDIMxZXP1V8HdM()) - ((long) wCObt0AknnroPeo3Y2G1.dDIMxZXP1V8HdM());
                            eruqtn8YZhu5Arr = (jDDIMxZXP1V8HdM == 0 || ksynl03UBrEMVM80NQ.vekpFI4d1Nc4fakF.isEmpty()) ? null : (Eruqtn8YZhu5[]) ksynl03UBrEMVM80NQ.vekpFI4d1Nc4fakF.values().toArray(new Eruqtn8YZhu5[0]);
                            ksynl03UBrEMVM80NQ.XiR1pIn5878vVWd = (WCObt0AknnroPeo3Y2G0) aqjfzuf02xh6w.w9sT1Swbhx3hs;
                            ksynl03UBrEMVM80NQ.hjneShqpF9Tis4.vekpFI4d1Nc4fakF(new bZrzpcw4jpBdHboe4MCr(ksynl03UBrEMVM80NQ.JXn4Qf7zpnLjP5 + " onSettings", ksynl03UBrEMVM80NQ, aqjfzuf02xh6w, i), 0L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        ksynl03UBrEMVM80NQ.EWUjsTERgdPbSw3NNlN.dDIMxZXP1V8HdM((WCObt0AknnroPeo3Y2G0) aqjfzuf02xh6w.w9sT1Swbhx3hs);
                    } catch (IOException e2) {
                        ksynl03UBrEMVM80NQ.dDIMxZXP1V8HdM(2, 2, e2);
                    }
                    break;
                }
                if (eruqtn8YZhu5Arr != null) {
                    int length = eruqtn8YZhu5Arr.length;
                    while (i < length) {
                        Eruqtn8YZhu5 eruqtn8YZhu5 = eruqtn8YZhu5Arr[i];
                        synchronized (eruqtn8YZhu5) {
                            eruqtn8YZhu5.xDyLpEZyrcKVe0 += jDDIMxZXP1V8HdM;
                            if (jDDIMxZXP1V8HdM > 0) {
                                eruqtn8YZhu5.notifyAll();
                            }
                            break;
                        }
                        i++;
                    }
                }
                return -1L;
        }
    }
}
