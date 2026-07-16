package v.s;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class PFQBh8IhS3eQQjO5 extends xya403kVTOXbAjP0he3 {
    public final Runnable JXn4Qf7zpnLjP5;

    public PFQBh8IhS3eQQjO5(Runnable runnable, long j, AfJGc52iVl6Gj afJGc52iVl6Gj) {
        super(j, afJGc52iVl6Gj);
        this.JXn4Qf7zpnLjP5 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.JXn4Qf7zpnLjP5.run();
        } finally {
            this.vekpFI4d1Nc4fakF.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.JXn4Qf7zpnLjP5;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(gA5gCwTK0qjTIn.pyu8ovAipBTLYAiKab(runnable));
        sb.append(", ");
        sb.append(this.w9sT1Swbhx3hs);
        sb.append(", ");
        sb.append(this.vekpFI4d1Nc4fakF);
        sb.append(']');
        return sb.toString();
    }
}
