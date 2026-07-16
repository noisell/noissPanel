package v.s;

import java.io.IOException;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class jD7dMU2Tgl0TPPeOMj extends lF98dCR0TIO8DDCYOu {
    public final /* synthetic */ int Ee8d2j4S9Vm5yGuR;
    public final /* synthetic */ Object ibVTtJUNfrGYbW;
    public final /* synthetic */ long xDyLpEZyrcKVe0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jD7dMU2Tgl0TPPeOMj(String str, Object obj, long j, int i) {
        super(str, true);
        this.Ee8d2j4S9Vm5yGuR = i;
        this.ibVTtJUNfrGYbW = obj;
        this.xDyLpEZyrcKVe0 = j;
    }

    @Override // v.s.lF98dCR0TIO8DDCYOu
    public final long dDIMxZXP1V8HdM() {
        Ksynl03UBrEMVM80NQ ksynl03UBrEMVM80NQ;
        boolean z;
        vAfoY7dO2avAiOg vafoy7do2avaiog;
        switch (this.Ee8d2j4S9Vm5yGuR) {
            case 0:
                synchronized (((Ksynl03UBrEMVM80NQ) this.ibVTtJUNfrGYbW)) {
                    ksynl03UBrEMVM80NQ = (Ksynl03UBrEMVM80NQ) this.ibVTtJUNfrGYbW;
                    long j = ksynl03UBrEMVM80NQ.wotphlvK9sPbXJ;
                    long j2 = ksynl03UBrEMVM80NQ.gIIiyi2ddlMDR0;
                    if (j < j2) {
                        z = true;
                    } else {
                        ksynl03UBrEMVM80NQ.gIIiyi2ddlMDR0 = j2 + 1;
                        z = false;
                    }
                }
                if (z) {
                    ksynl03UBrEMVM80NQ.dDIMxZXP1V8HdM(2, 2, null);
                    return -1L;
                }
                try {
                    ksynl03UBrEMVM80NQ.EWUjsTERgdPbSw3NNlN.DVTNwpDEVsUKuznof(false, 1, 0);
                    break;
                } catch (IOException e) {
                    ksynl03UBrEMVM80NQ.dDIMxZXP1V8HdM(2, 2, e);
                }
                return this.xDyLpEZyrcKVe0;
            default:
                J1m0XraSkScfWFMIlTC j1m0XraSkScfWFMIlTC = (J1m0XraSkScfWFMIlTC) this.ibVTtJUNfrGYbW;
                synchronized (j1m0XraSkScfWFMIlTC) {
                    try {
                        if (!j1m0XraSkScfWFMIlTC.XiR1pIn5878vVWd && (vafoy7do2avaiog = j1m0XraSkScfWFMIlTC.D5P1xCAyuvgF) != null) {
                            int i = j1m0XraSkScfWFMIlTC.DVTNwpDEVsUKuznof ? j1m0XraSkScfWFMIlTC.H9XlUr4OeMJFiXK : -1;
                            j1m0XraSkScfWFMIlTC.H9XlUr4OeMJFiXK++;
                            j1m0XraSkScfWFMIlTC.DVTNwpDEVsUKuznof = true;
                            if (i != -1) {
                                j1m0XraSkScfWFMIlTC.vekpFI4d1Nc4fakF(new SocketTimeoutException("sent ping but didn't receive pong within " + j1m0XraSkScfWFMIlTC.vekpFI4d1Nc4fakF + "ms (after " + (i - 1) + " successful ping/pongs)"), null);
                            } else {
                                try {
                                    vafoy7do2avaiog.dDIMxZXP1V8HdM(9, XslKUngIJyofTLpQ5.Ee8d2j4S9Vm5yGuR);
                                } catch (IOException e2) {
                                    j1m0XraSkScfWFMIlTC.vekpFI4d1Nc4fakF(e2, null);
                                }
                            }
                            break;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return this.xDyLpEZyrcKVe0;
        }
    }
}
