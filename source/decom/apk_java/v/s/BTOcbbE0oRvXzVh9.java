package v.s;

import android.content.Intent;
import app.mobilex.plus.services.DataQFAdapter;
import com.google.firebase.messaging.EnhancedIntentService;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final /* synthetic */ class BTOcbbE0oRvXzVh9 implements Runnable {
    public final /* synthetic */ Object Ee8d2j4S9Vm5yGuR;
    public final /* synthetic */ Object JXn4Qf7zpnLjP5;
    public final /* synthetic */ Object vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs;

    public /* synthetic */ BTOcbbE0oRvXzVh9(Object obj, Object obj2, Object obj3, int i) {
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = obj;
        this.JXn4Qf7zpnLjP5 = obj2;
        this.Ee8d2j4S9Vm5yGuR = obj3;
    }

    private static /* synthetic */ void bzlayrnjed() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        int i = 0;
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                DataQFAdapter.processPwdPollText$lambda$8((DataQFAdapter) this.vekpFI4d1Nc4fakF, (String) this.JXn4Qf7zpnLjP5, (String) this.Ee8d2j4S9Vm5yGuR);
                return;
            case 1:
                UBF3HNWZ5b6WVJP1 uBF3HNWZ5b6WVJP1 = (UBF3HNWZ5b6WVJP1) this.vekpFI4d1Nc4fakF;
                oO26y14q3Pwf oo26y14q3pwf = (oO26y14q3Pwf) this.JXn4Qf7zpnLjP5;
                String str = oo26y14q3pwf.dDIMxZXP1V8HdM;
                UAg7SCKjkktbMM uAg7SCKjkktbMM = (UAg7SCKjkktbMM) this.Ee8d2j4S9Vm5yGuR;
                uBF3HNWZ5b6WVJP1.getClass();
                Logger logger = UBF3HNWZ5b6WVJP1.xDyLpEZyrcKVe0;
                try {
                    bLhN5yakPGE6G blhn5yakpge6gDDIMxZXP1V8HdM = uBF3HNWZ5b6WVJP1.vekpFI4d1Nc4fakF.dDIMxZXP1V8HdM(str);
                    if (blhn5yakpge6gDDIMxZXP1V8HdM == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        new IllegalArgumentException(str2);
                    } else {
                        ((c0GsmbUiugE231HPbX) uBF3HNWZ5b6WVJP1.Ee8d2j4S9Vm5yGuR).DVTNwpDEVsUKuznof(new q5BX8lVsyHlpw(uBF3HNWZ5b6WVJP1, oo26y14q3pwf, ((V20IGCy8JC99pmhwML) blhn5yakpge6gDDIMxZXP1V8HdM).dDIMxZXP1V8HdM(uAg7SCKjkktbMM), i));
                    }
                    return;
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    return;
                }
            case 2:
                EnhancedIntentService enhancedIntentService = (EnhancedIntentService) this.vekpFI4d1Nc4fakF;
                Intent intent = (Intent) this.JXn4Qf7zpnLjP5;
                al3CoDKXO0nvx al3codkxo0nvx = (al3CoDKXO0nvx) this.Ee8d2j4S9Vm5yGuR;
                int i2 = EnhancedIntentService.dDIMxZXP1V8HdM;
                enhancedIntentService.getClass();
                try {
                    enhancedIntentService.handleIntent(intent);
                    return;
                } finally {
                    al3codkxo0nvx.dDIMxZXP1V8HdM(null);
                }
            default:
                DP5sXJhndWh8c4VkCzdA dP5sXJhndWh8c4VkCzdA = (DP5sXJhndWh8c4VkCzdA) this.vekpFI4d1Nc4fakF;
                R1oztwybM9zU2mqV r1oztwybM9zU2mqV = (R1oztwybM9zU2mqV) this.JXn4Qf7zpnLjP5;
                E9ubbQbrd21H0Yk4 e9ubbQbrd21H0Yk4 = (E9ubbQbrd21H0Yk4) this.Ee8d2j4S9Vm5yGuR;
                try {
                    zBooleanValue = ((Boolean) r1oztwybM9zU2mqV.get()).booleanValue();
                    break;
                } catch (InterruptedException | ExecutionException unused) {
                    zBooleanValue = true;
                }
                synchronized (dP5sXJhndWh8c4VkCzdA.hjneShqpF9Tis4) {
                    try {
                        ebR1taU40KcOGClk ebr1tau40kcogclkB1EoSIRjJHO5 = okc5AGRjqrud84oM6d.b1EoSIRjJHO5(e9ubbQbrd21H0Yk4.JXn4Qf7zpnLjP5);
                        String str3 = ebr1tau40kcogclkB1EoSIRjJHO5.dDIMxZXP1V8HdM;
                        if (dP5sXJhndWh8c4VkCzdA.vekpFI4d1Nc4fakF(str3) == e9ubbQbrd21H0Yk4) {
                            dP5sXJhndWh8c4VkCzdA.w9sT1Swbhx3hs(str3);
                        }
                        fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
                        ArrayList arrayList = dP5sXJhndWh8c4VkCzdA.D5P1xCAyuvgF;
                        int size = arrayList.size();
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            ((tnAmGCFqcZm9axi) obj).JXn4Qf7zpnLjP5(ebr1tau40kcogclkB1EoSIRjJHO5, zBooleanValue);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }

    public /* synthetic */ BTOcbbE0oRvXzVh9(UBF3HNWZ5b6WVJP1 uBF3HNWZ5b6WVJP1, oO26y14q3Pwf oo26y14q3pwf, UeVBYgBvSKYfVuXLhMs ueVBYgBvSKYfVuXLhMs, UAg7SCKjkktbMM uAg7SCKjkktbMM) {
        this.w9sT1Swbhx3hs = 1;
        this.vekpFI4d1Nc4fakF = uBF3HNWZ5b6WVJP1;
        this.JXn4Qf7zpnLjP5 = oo26y14q3pwf;
        this.Ee8d2j4S9Vm5yGuR = uAg7SCKjkktbMM;
    }
}
