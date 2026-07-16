package v.s;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class PdgYASR7b2Di {
    public static final long Ee8d2j4S9Vm5yGuR;
    public static final int JXn4Qf7zpnLjP5;
    public static final AfJGc52iVl6Gj b1EoSIRjJHO5;
    public static final String dDIMxZXP1V8HdM;
    public static final AfJGc52iVl6Gj ibVTtJUNfrGYbW;
    public static final int vekpFI4d1Nc4fakF;
    public static final long w9sT1Swbhx3hs;
    public static final W6dfON4KdcdxlH xDyLpEZyrcKVe0;

    static {
        String property;
        int i = RN3oZ7h5zHy79TdFsDfo.dDIMxZXP1V8HdM;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        dDIMxZXP1V8HdM = property;
        w9sT1Swbhx3hs = OFMrQsTe5s1KYV0lq.EWUjsTERgdPbSw3NNlN("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = RN3oZ7h5zHy79TdFsDfo.dDIMxZXP1V8HdM;
        if (i2 < 2) {
            i2 = 2;
        }
        vekpFI4d1Nc4fakF = OFMrQsTe5s1KYV0lq.yTljMGnIibTRdOpSh4("kotlinx.coroutines.scheduler.core.pool.size", i2, 8);
        JXn4Qf7zpnLjP5 = OFMrQsTe5s1KYV0lq.yTljMGnIibTRdOpSh4("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 4);
        Ee8d2j4S9Vm5yGuR = TimeUnit.SECONDS.toNanos(OFMrQsTe5s1KYV0lq.EWUjsTERgdPbSw3NNlN("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        xDyLpEZyrcKVe0 = W6dfON4KdcdxlH.b1EoSIRjJHO5;
        ibVTtJUNfrGYbW = new AfJGc52iVl6Gj(0);
        b1EoSIRjJHO5 = new AfJGc52iVl6Gj(1);
    }

    private static /* synthetic */ void pewpgq() {
    }
}
