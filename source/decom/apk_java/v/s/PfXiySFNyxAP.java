package v.s;

import android.content.Context;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class PfXiySFNyxAP implements Runnable {
    public final /* synthetic */ Context Ee8d2j4S9Vm5yGuR;
    public final /* synthetic */ BXrZf9mCiRhvBOt7P JXn4Qf7zpnLjP5;
    public final /* synthetic */ UUID vekpFI4d1Nc4fakF;
    public final /* synthetic */ Af6wX3D8R2iFhqxr w9sT1Swbhx3hs;
    public final /* synthetic */ xdpm5SYr3bAV0rTS6 xDyLpEZyrcKVe0;

    public PfXiySFNyxAP(xdpm5SYr3bAV0rTS6 xdpm5syr3bav0rts6, Af6wX3D8R2iFhqxr af6wX3D8R2iFhqxr, UUID uuid, BXrZf9mCiRhvBOt7P bXrZf9mCiRhvBOt7P, Context context) {
        this.xDyLpEZyrcKVe0 = xdpm5syr3bav0rts6;
        this.w9sT1Swbhx3hs = af6wX3D8R2iFhqxr;
        this.vekpFI4d1Nc4fakF = uuid;
        this.JXn4Qf7zpnLjP5 = bXrZf9mCiRhvBOt7P;
        this.Ee8d2j4S9Vm5yGuR = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!(this.w9sT1Swbhx3hs.w9sT1Swbhx3hs instanceof ibVTtJUNfrGYbW)) {
                String string = this.vekpFI4d1Nc4fakF.toString();
                sFdNPiaH9eT4T sfdnpiah9et4tGmNWMfvn6zlEj = this.xDyLpEZyrcKVe0.vekpFI4d1Nc4fakF.gmNWMfvn6zlEj(string);
                if (sfdnpiah9et4tGmNWMfvn6zlEj == null || Y9mRyRdkl5FOcwb66V6.dDIMxZXP1V8HdM(sfdnpiah9et4tGmNWMfvn6zlEj.w9sT1Swbhx3hs)) {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                ((DP5sXJhndWh8c4VkCzdA) this.xDyLpEZyrcKVe0.w9sT1Swbhx3hs).ibVTtJUNfrGYbW(string, this.JXn4Qf7zpnLjP5);
                this.Ee8d2j4S9Vm5yGuR.startService(EM07nbnNqFdqQrkC.dDIMxZXP1V8HdM(this.Ee8d2j4S9Vm5yGuR, okc5AGRjqrud84oM6d.b1EoSIRjJHO5(sfdnpiah9et4tGmNWMfvn6zlEj), this.JXn4Qf7zpnLjP5));
            }
            this.w9sT1Swbhx3hs.pyu8ovAipBTLYAiKab(null);
        } catch (Throwable th) {
            this.w9sT1Swbhx3hs.D5P1xCAyuvgF(th);
        }
    }
}
