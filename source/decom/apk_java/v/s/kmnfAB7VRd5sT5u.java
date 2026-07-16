package v.s;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class kmnfAB7VRd5sT5u {
    public final JCr1uh5HvXwCK dDIMxZXP1V8HdM;
    public int vekpFI4d1Nc4fakF;
    public long w9sT1Swbhx3hs;
    public static final long JXn4Qf7zpnLjP5 = TimeUnit.HOURS.toMillis(24);
    public static final long Ee8d2j4S9Vm5yGuR = TimeUnit.MINUTES.toMillis(30);

    public kmnfAB7VRd5sT5u() {
        if (fadfsJa4iEdiwEC4Xm8.gmNWMfvn6zlEj == null) {
            Pattern pattern = JCr1uh5HvXwCK.vekpFI4d1Nc4fakF;
            fadfsJa4iEdiwEC4Xm8.gmNWMfvn6zlEj = new fadfsJa4iEdiwEC4Xm8(16);
        }
        fadfsJa4iEdiwEC4Xm8 fadfsja4iediwec4xm8 = fadfsJa4iEdiwEC4Xm8.gmNWMfvn6zlEj;
        if (JCr1uh5HvXwCK.JXn4Qf7zpnLjP5 == null) {
            JCr1uh5HvXwCK.JXn4Qf7zpnLjP5 = new JCr1uh5HvXwCK(fadfsja4iediwec4xm8);
        }
        this.dDIMxZXP1V8HdM = JCr1uh5HvXwCK.JXn4Qf7zpnLjP5;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001e  */
    public final synchronized boolean dDIMxZXP1V8HdM() {
        boolean z;
        if (this.vekpFI4d1Nc4fakF != 0) {
            this.dDIMxZXP1V8HdM.dDIMxZXP1V8HdM.getClass();
            if (System.currentTimeMillis() > this.w9sT1Swbhx3hs) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        return z;
    }

    public final synchronized void w9sT1Swbhx3hs(int i) {
        long jMin;
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            synchronized (this) {
                this.vekpFI4d1Nc4fakF = 0;
            }
            return;
        }
        this.vekpFI4d1Nc4fakF++;
        synchronized (this) {
            try {
                if (i == 429 || (i >= 476 + 24 && i < 600)) {
                    double dPow = Math.pow(2.0d, this.vekpFI4d1Nc4fakF);
                    this.dDIMxZXP1V8HdM.getClass();
                    jMin = (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), Ee8d2j4S9Vm5yGuR);
                } else {
                    jMin = JXn4Qf7zpnLjP5;
                }
                this.dDIMxZXP1V8HdM.dDIMxZXP1V8HdM.getClass();
                this.w9sT1Swbhx3hs = System.currentTimeMillis() + jMin;
            } catch (Throwable th) {
                throw th;
            }
        }
        return;
        throw th;
    }
}
