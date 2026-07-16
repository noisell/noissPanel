package v.s;

import java.util.ArrayList;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class Cid8LKolL4e2FdtXe {
    public long JXn4Qf7zpnLjP5;
    public final r5XEUfod5GSCCwq6c dDIMxZXP1V8HdM;
    public boolean vekpFI4d1Nc4fakF;
    public static final W6dfON4KdcdxlH b1EoSIRjJHO5 = new W6dfON4KdcdxlH(17);
    public static final Cid8LKolL4e2FdtXe pyu8ovAipBTLYAiKab = new Cid8LKolL4e2FdtXe(new r5XEUfod5GSCCwq6c(new Daw7QaVwgN3e6(Y9mRyRdkl5FOcwb66V6.D5P1xCAyuvgF(new StringBuilder(), yrMnf4fyLGfIJbMg8IbG.xDyLpEZyrcKVe0, " TaskRunner"), true)));
    public static final Logger D5P1xCAyuvgF = Logger.getLogger(Cid8LKolL4e2FdtXe.class.getName());
    public int w9sT1Swbhx3hs = 10000;
    public final ArrayList Ee8d2j4S9Vm5yGuR = new ArrayList();
    public final ArrayList xDyLpEZyrcKVe0 = new ArrayList();
    public final YqOiSVb2wSv9Lq63qb ibVTtJUNfrGYbW = new YqOiSVb2wSv9Lq63qb(8, this);

    public Cid8LKolL4e2FdtXe(r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c) {
        this.dDIMxZXP1V8HdM = r5xeufod5gsccwq6c;
    }

    public static final void dDIMxZXP1V8HdM(Cid8LKolL4e2FdtXe cid8LKolL4e2FdtXe, lF98dCR0TIO8DDCYOu lf98dcr0tio8ddcyou) {
        byte[] bArr = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(lf98dcr0tio8ddcyou.dDIMxZXP1V8HdM);
        try {
            long jDDIMxZXP1V8HdM = lf98dcr0tio8ddcyou.dDIMxZXP1V8HdM();
            synchronized (cid8LKolL4e2FdtXe) {
                cid8LKolL4e2FdtXe.w9sT1Swbhx3hs(lf98dcr0tio8ddcyou, jDDIMxZXP1V8HdM);
            }
        } finally {
            synchronized (cid8LKolL4e2FdtXe) {
                cid8LKolL4e2FdtXe.w9sT1Swbhx3hs(lf98dcr0tio8ddcyou, -1L);
                threadCurrentThread.setName(name);
            }
        }
    }

    private static /* synthetic */ void jzibkgsj() {
    }

    public final uV3RzXbqCGFOlAdx Ee8d2j4S9Vm5yGuR() {
        int i;
        synchronized (this) {
            i = this.w9sT1Swbhx3hs;
            this.w9sT1Swbhx3hs = i + 1;
        }
        return new uV3RzXbqCGFOlAdx(this, Y9mRyRdkl5FOcwb66V6.xDyLpEZyrcKVe0("Q", i));
    }

    public final void JXn4Qf7zpnLjP5(uV3RzXbqCGFOlAdx uv3rzxbqcgfoladx) {
        byte[] bArr = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
        if (uv3rzxbqcgfoladx.JXn4Qf7zpnLjP5 == null) {
            boolean zIsEmpty = uv3rzxbqcgfoladx.Ee8d2j4S9Vm5yGuR.isEmpty();
            ArrayList arrayList = this.xDyLpEZyrcKVe0;
            if (zIsEmpty) {
                arrayList.remove(uv3rzxbqcgfoladx);
            } else if (!arrayList.contains(uv3rzxbqcgfoladx)) {
                arrayList.add(uv3rzxbqcgfoladx);
            }
        }
        if (this.vekpFI4d1Nc4fakF) {
            notify();
        } else {
            ((ThreadPoolExecutor) this.dDIMxZXP1V8HdM.vekpFI4d1Nc4fakF).execute(this.ibVTtJUNfrGYbW);
        }
    }

    public final lF98dCR0TIO8DDCYOu vekpFI4d1Nc4fakF() {
        long j;
        lF98dCR0TIO8DDCYOu lf98dcr0tio8ddcyou;
        boolean z;
        byte[] bArr = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
        while (true) {
            ArrayList arrayList = this.xDyLpEZyrcKVe0;
            if (arrayList.isEmpty()) {
                return null;
            }
            long jNanoTime = System.nanoTime();
            int size = arrayList.size();
            long jMin = Long.MAX_VALUE;
            int i = 0;
            lF98dCR0TIO8DDCYOu lf98dcr0tio8ddcyou2 = null;
            while (true) {
                if (i >= size) {
                    j = jNanoTime;
                    lf98dcr0tio8ddcyou = null;
                    z = false;
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
                lF98dCR0TIO8DDCYOu lf98dcr0tio8ddcyou3 = (lF98dCR0TIO8DDCYOu) ((uV3RzXbqCGFOlAdx) obj).Ee8d2j4S9Vm5yGuR.get(0);
                j = jNanoTime;
                lf98dcr0tio8ddcyou = null;
                long jMax = Math.max(0L, lf98dcr0tio8ddcyou3.JXn4Qf7zpnLjP5 - j);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (lf98dcr0tio8ddcyou2 != null) {
                        z = true;
                        break;
                    }
                    lf98dcr0tio8ddcyou2 = lf98dcr0tio8ddcyou3;
                }
                jNanoTime = j;
            }
            ArrayList arrayList2 = this.Ee8d2j4S9Vm5yGuR;
            if (lf98dcr0tio8ddcyou2 != null) {
                byte[] bArr2 = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
                lf98dcr0tio8ddcyou2.JXn4Qf7zpnLjP5 = -1L;
                uV3RzXbqCGFOlAdx uv3rzxbqcgfoladx = lf98dcr0tio8ddcyou2.vekpFI4d1Nc4fakF;
                uv3rzxbqcgfoladx.Ee8d2j4S9Vm5yGuR.remove(lf98dcr0tio8ddcyou2);
                arrayList.remove(uv3rzxbqcgfoladx);
                uv3rzxbqcgfoladx.JXn4Qf7zpnLjP5 = lf98dcr0tio8ddcyou2;
                arrayList2.add(uv3rzxbqcgfoladx);
                if (z || (!this.vekpFI4d1Nc4fakF && !arrayList.isEmpty())) {
                    ((ThreadPoolExecutor) this.dDIMxZXP1V8HdM.vekpFI4d1Nc4fakF).execute(this.ibVTtJUNfrGYbW);
                }
                return lf98dcr0tio8ddcyou2;
            }
            if (this.vekpFI4d1Nc4fakF) {
                if (jMin >= this.JXn4Qf7zpnLjP5 - j) {
                    return lf98dcr0tio8ddcyou;
                }
                notify();
                return lf98dcr0tio8ddcyou;
            }
            this.vekpFI4d1Nc4fakF = true;
            this.JXn4Qf7zpnLjP5 = j + jMin;
            try {
                try {
                    long j2 = jMin / 1000000;
                    long j3 = jMin - (1000000 * j2);
                    if (j2 > 0 || jMin > 0) {
                        wait(j2, (int) j3);
                    }
                } catch (InterruptedException unused) {
                    for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
                        ((uV3RzXbqCGFOlAdx) arrayList2.get(size2)).w9sT1Swbhx3hs();
                    }
                    for (int size3 = arrayList.size() - 1; -1 < size3; size3--) {
                        uV3RzXbqCGFOlAdx uv3rzxbqcgfoladx2 = (uV3RzXbqCGFOlAdx) arrayList.get(size3);
                        uv3rzxbqcgfoladx2.w9sT1Swbhx3hs();
                        if (uv3rzxbqcgfoladx2.Ee8d2j4S9Vm5yGuR.isEmpty()) {
                            arrayList.remove(size3);
                        }
                    }
                }
                this.vekpFI4d1Nc4fakF = false;
            } catch (Throwable th) {
                this.vekpFI4d1Nc4fakF = false;
                throw th;
            }
        }
    }

    public final void w9sT1Swbhx3hs(lF98dCR0TIO8DDCYOu lf98dcr0tio8ddcyou, long j) {
        byte[] bArr = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
        uV3RzXbqCGFOlAdx uv3rzxbqcgfoladx = lf98dcr0tio8ddcyou.vekpFI4d1Nc4fakF;
        if (uv3rzxbqcgfoladx.JXn4Qf7zpnLjP5 != lf98dcr0tio8ddcyou) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z = uv3rzxbqcgfoladx.xDyLpEZyrcKVe0;
        uv3rzxbqcgfoladx.xDyLpEZyrcKVe0 = false;
        uv3rzxbqcgfoladx.JXn4Qf7zpnLjP5 = null;
        this.Ee8d2j4S9Vm5yGuR.remove(uv3rzxbqcgfoladx);
        if (j != -1 && !z && !uv3rzxbqcgfoladx.vekpFI4d1Nc4fakF) {
            uv3rzxbqcgfoladx.JXn4Qf7zpnLjP5(lf98dcr0tio8ddcyou, j, true);
        }
        if (uv3rzxbqcgfoladx.Ee8d2j4S9Vm5yGuR.isEmpty()) {
            return;
        }
        this.xDyLpEZyrcKVe0.add(uv3rzxbqcgfoladx);
    }
}
