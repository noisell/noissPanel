package v.s;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class Qs7pEhrUyxRnfgePs implements Runnable {
    public final int Ee8d2j4S9Vm5yGuR;
    public final boolean JXn4Qf7zpnLjP5;
    public final r9c8qUHbkyLZi vekpFI4d1Nc4fakF;
    public final DP5sXJhndWh8c4VkCzdA w9sT1Swbhx3hs;

    public Qs7pEhrUyxRnfgePs(DP5sXJhndWh8c4VkCzdA dP5sXJhndWh8c4VkCzdA, r9c8qUHbkyLZi r9c8quhbkylzi, boolean z, int i) {
        this.w9sT1Swbhx3hs = dP5sXJhndWh8c4VkCzdA;
        this.vekpFI4d1Nc4fakF = r9c8quhbkylzi;
        this.JXn4Qf7zpnLjP5 = z;
        this.Ee8d2j4S9Vm5yGuR = i;
    }

    private static /* synthetic */ void poov() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        E9ubbQbrd21H0Yk4 e9ubbQbrd21H0Yk4W9sT1Swbhx3hs;
        if (this.JXn4Qf7zpnLjP5) {
            DP5sXJhndWh8c4VkCzdA dP5sXJhndWh8c4VkCzdA = this.w9sT1Swbhx3hs;
            r9c8qUHbkyLZi r9c8quhbkylzi = this.vekpFI4d1Nc4fakF;
            int i = this.Ee8d2j4S9Vm5yGuR;
            dP5sXJhndWh8c4VkCzdA.getClass();
            String str = r9c8quhbkylzi.dDIMxZXP1V8HdM.dDIMxZXP1V8HdM;
            synchronized (dP5sXJhndWh8c4VkCzdA.hjneShqpF9Tis4) {
                e9ubbQbrd21H0Yk4W9sT1Swbhx3hs = dP5sXJhndWh8c4VkCzdA.w9sT1Swbhx3hs(str);
            }
            DP5sXJhndWh8c4VkCzdA.JXn4Qf7zpnLjP5(e9ubbQbrd21H0Yk4W9sT1Swbhx3hs, i);
        } else {
            DP5sXJhndWh8c4VkCzdA dP5sXJhndWh8c4VkCzdA2 = this.w9sT1Swbhx3hs;
            r9c8qUHbkyLZi r9c8quhbkylzi2 = this.vekpFI4d1Nc4fakF;
            int i2 = this.Ee8d2j4S9Vm5yGuR;
            dP5sXJhndWh8c4VkCzdA2.getClass();
            String str2 = r9c8quhbkylzi2.dDIMxZXP1V8HdM.dDIMxZXP1V8HdM;
            synchronized (dP5sXJhndWh8c4VkCzdA2.hjneShqpF9Tis4) {
                try {
                    if (dP5sXJhndWh8c4VkCzdA2.xDyLpEZyrcKVe0.get(str2) != null) {
                        fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
                    } else {
                        Set set = (Set) dP5sXJhndWh8c4VkCzdA2.b1EoSIRjJHO5.get(str2);
                        if (set != null && set.contains(r9c8quhbkylzi2)) {
                            DP5sXJhndWh8c4VkCzdA.JXn4Qf7zpnLjP5(dP5sXJhndWh8c4VkCzdA2.w9sT1Swbhx3hs(str2), i2);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
        fEyMFFyOOvHURJ7To6L.wotphlvK9sPbXJ("StopWorkRunnable");
        ebR1taU40KcOGClk ebr1tau40kcogclk = this.vekpFI4d1Nc4fakF.dDIMxZXP1V8HdM;
        feymffyoovhurj7to6lPyu8ovAipBTLYAiKab.getClass();
    }
}
