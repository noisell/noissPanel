package v.s;

import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class l1V0lQr6TbwNKqHfXNbb extends lMJPWn8FzeWU82pNUhWl {
    @Override // v.s.lMJPWn8FzeWU82pNUhWl
    public final long JXn4Qf7zpnLjP5() {
        return ibVTtJUNfrGYbW().nextLong();
    }

    public final int b1EoSIRjJHO5(int i) {
        return ibVTtJUNfrGYbW().nextInt(i);
    }

    @Override // v.s.lMJPWn8FzeWU82pNUhWl
    public final int dDIMxZXP1V8HdM(int i) {
        return ((-i) >> 31) & (ibVTtJUNfrGYbW().nextInt() >>> (32 - i));
    }

    public abstract Random ibVTtJUNfrGYbW();

    @Override // v.s.lMJPWn8FzeWU82pNUhWl
    public final int w9sT1Swbhx3hs() {
        return ibVTtJUNfrGYbW().nextInt();
    }
}
