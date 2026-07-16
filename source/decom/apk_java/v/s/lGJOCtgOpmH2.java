package v.s;

import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class lGJOCtgOpmH2 extends hY5LMKhGGQVxmKz6FME {
    public final /* synthetic */ Eruqtn8YZhu5 gIIiyi2ddlMDR0;

    public lGJOCtgOpmH2(Eruqtn8YZhu5 eruqtn8YZhu5) {
        this.gIIiyi2ddlMDR0 = eruqtn8YZhu5;
    }

    public final void gmNWMfvn6zlEj() {
        if (D5P1xCAyuvgF()) {
            throw new SocketTimeoutException("timeout");
        }
    }

    @Override // v.s.hY5LMKhGGQVxmKz6FME
    public final void hjneShqpF9Tis4() {
        this.gIIiyi2ddlMDR0.Ee8d2j4S9Vm5yGuR(9);
        Ksynl03UBrEMVM80NQ ksynl03UBrEMVM80NQ = this.gIIiyi2ddlMDR0.w9sT1Swbhx3hs;
        synchronized (ksynl03UBrEMVM80NQ) {
            long j = ksynl03UBrEMVM80NQ.nQilHWaqS401ZtR;
            long j2 = ksynl03UBrEMVM80NQ.Qrz92kRPw4GcghAc;
            if (j < j2) {
                return;
            }
            ksynl03UBrEMVM80NQ.Qrz92kRPw4GcghAc = j2 + 1;
            ksynl03UBrEMVM80NQ.J0zjQ7CAgohuxU20eCW6 = System.nanoTime() + ((long) 1000000000);
            ksynl03UBrEMVM80NQ.pyu8ovAipBTLYAiKab.vekpFI4d1Nc4fakF(new m2RLabjFXo9vTghXAsK(Y9mRyRdkl5FOcwb66V6.D5P1xCAyuvgF(new StringBuilder(), ksynl03UBrEMVM80NQ.JXn4Qf7zpnLjP5, " ping"), ksynl03UBrEMVM80NQ, 0), 0L);
        }
    }
}
