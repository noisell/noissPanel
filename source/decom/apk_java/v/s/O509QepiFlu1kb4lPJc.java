package v.s;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class O509QepiFlu1kb4lPJc implements Executor {
    public static final /* synthetic */ O509QepiFlu1kb4lPJc[] vekpFI4d1Nc4fakF;
    public static final O509QepiFlu1kb4lPJc w9sT1Swbhx3hs;

    static {
        O509QepiFlu1kb4lPJc o509QepiFlu1kb4lPJc = new O509QepiFlu1kb4lPJc("INSTANCE", 0);
        w9sT1Swbhx3hs = o509QepiFlu1kb4lPJc;
        vekpFI4d1Nc4fakF = new O509QepiFlu1kb4lPJc[]{o509QepiFlu1kb4lPJc};
    }

    public static O509QepiFlu1kb4lPJc valueOf(String str) {
        return (O509QepiFlu1kb4lPJc) Enum.valueOf(O509QepiFlu1kb4lPJc.class, str);
    }

    public static O509QepiFlu1kb4lPJc[] values() {
        return (O509QepiFlu1kb4lPJc[]) vekpFI4d1Nc4fakF.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
