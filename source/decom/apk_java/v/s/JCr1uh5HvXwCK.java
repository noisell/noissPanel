package v.s;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class JCr1uh5HvXwCK {
    public static JCr1uh5HvXwCK JXn4Qf7zpnLjP5;
    public final fadfsJa4iEdiwEC4Xm8 dDIMxZXP1V8HdM;
    public static final long w9sT1Swbhx3hs = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern vekpFI4d1Nc4fakF = Pattern.compile("\\AA[\\w-]{38}\\z");

    public JCr1uh5HvXwCK(fadfsJa4iEdiwEC4Xm8 fadfsja4iediwec4xm8) {
        this.dDIMxZXP1V8HdM = fadfsja4iediwec4xm8;
    }

    private static /* synthetic */ void fsgy() {
    }

    public final boolean dDIMxZXP1V8HdM(qhsM0NLCW4lYFI8kGz qhsm0nlcw4lyfi8kgz) {
        if (TextUtils.isEmpty(qhsm0nlcw4lyfi8kgz.vekpFI4d1Nc4fakF)) {
            return true;
        }
        long j = qhsm0nlcw4lyfi8kgz.xDyLpEZyrcKVe0 + qhsm0nlcw4lyfi8kgz.Ee8d2j4S9Vm5yGuR;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.dDIMxZXP1V8HdM.getClass();
        return j < timeUnit.toSeconds(System.currentTimeMillis()) + w9sT1Swbhx3hs;
    }
}
