package v.s;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class mK2inw7EtW3HfMfj extends l1V0lQr6TbwNKqHfXNbb {
    @Override // v.s.lMJPWn8FzeWU82pNUhWl
    public final long Ee8d2j4S9Vm5yGuR(long j) {
        return ThreadLocalRandom.current().nextLong(j);
    }

    @Override // v.s.l1V0lQr6TbwNKqHfXNbb
    public final Random ibVTtJUNfrGYbW() {
        return ThreadLocalRandom.current();
    }

    @Override // v.s.lMJPWn8FzeWU82pNUhWl
    public final int vekpFI4d1Nc4fakF(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    @Override // v.s.lMJPWn8FzeWU82pNUhWl
    public final long xDyLpEZyrcKVe0(long j, long j2) {
        return ThreadLocalRandom.current().nextLong(j, j2);
    }
}
