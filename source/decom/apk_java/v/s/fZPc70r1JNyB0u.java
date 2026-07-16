package v.s;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class fZPc70r1JNyB0u implements ThreadFactory {
    public static final ThreadFactory Ee8d2j4S9Vm5yGuR = Executors.defaultThreadFactory();
    public final StrictMode.ThreadPolicy JXn4Qf7zpnLjP5;
    public final AtomicLong dDIMxZXP1V8HdM = new AtomicLong();
    public final int vekpFI4d1Nc4fakF;
    public final String w9sT1Swbhx3hs;

    public fZPc70r1JNyB0u(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.w9sT1Swbhx3hs = str;
        this.vekpFI4d1Nc4fakF = i;
        this.JXn4Qf7zpnLjP5 = threadPolicy;
    }

    private static /* synthetic */ void upfxmex() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = Ee8d2j4S9Vm5yGuR.newThread(new A68NpXPqwTFos99nt(this, 6, runnable));
        Locale locale = Locale.ROOT;
        threadNewThread.setName(this.w9sT1Swbhx3hs + " Thread #" + this.dDIMxZXP1V8HdM.getAndIncrement());
        return threadNewThread;
    }
}
