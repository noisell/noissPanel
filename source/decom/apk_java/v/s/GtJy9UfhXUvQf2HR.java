package v.s;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class GtJy9UfhXUvQf2HR implements Executor {
    public static final /* synthetic */ GtJy9UfhXUvQf2HR[] JXn4Qf7zpnLjP5;
    public static final Handler vekpFI4d1Nc4fakF;
    public static final GtJy9UfhXUvQf2HR w9sT1Swbhx3hs;

    static {
        GtJy9UfhXUvQf2HR gtJy9UfhXUvQf2HR = new GtJy9UfhXUvQf2HR("INSTANCE", 0);
        w9sT1Swbhx3hs = gtJy9UfhXUvQf2HR;
        JXn4Qf7zpnLjP5 = new GtJy9UfhXUvQf2HR[]{gtJy9UfhXUvQf2HR};
        vekpFI4d1Nc4fakF = new Handler(Looper.getMainLooper());
    }

    public static GtJy9UfhXUvQf2HR valueOf(String str) {
        return (GtJy9UfhXUvQf2HR) Enum.valueOf(GtJy9UfhXUvQf2HR.class, str);
    }

    public static GtJy9UfhXUvQf2HR[] values() {
        return (GtJy9UfhXUvQf2HR[]) JXn4Qf7zpnLjP5.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        vekpFI4d1Nc4fakF.post(runnable);
    }
}
