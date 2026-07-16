package v.s;

import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class uV3RzXbqCGFOlAdx {
    public final ArrayList Ee8d2j4S9Vm5yGuR = new ArrayList();
    public lF98dCR0TIO8DDCYOu JXn4Qf7zpnLjP5;
    public final Cid8LKolL4e2FdtXe dDIMxZXP1V8HdM;
    public boolean vekpFI4d1Nc4fakF;
    public final String w9sT1Swbhx3hs;
    public boolean xDyLpEZyrcKVe0;

    public uV3RzXbqCGFOlAdx(Cid8LKolL4e2FdtXe cid8LKolL4e2FdtXe, String str) {
        this.dDIMxZXP1V8HdM = cid8LKolL4e2FdtXe;
        this.w9sT1Swbhx3hs = str;
    }

    private static /* synthetic */ void itqdqson() {
    }

    public final void Ee8d2j4S9Vm5yGuR() {
        byte[] bArr = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
        synchronized (this.dDIMxZXP1V8HdM) {
            this.vekpFI4d1Nc4fakF = true;
            if (w9sT1Swbhx3hs()) {
                this.dDIMxZXP1V8HdM.JXn4Qf7zpnLjP5(this);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x004c  */
    /* JADX WARN: Code duplicated, block: B:20:0x005a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    /* JADX WARN: Code duplicated, block: B:27:0x0082 A[LOOP:0: B:23:0x006e->B:27:0x0082, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x008a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0093 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0086 A[EDGE_INSN: B:39:0x0086->B:29:0x0086 BREAK  A[LOOP:0: B:23:0x006e->B:27:0x0082], SYNTHETIC] */
    public final boolean JXn4Qf7zpnLjP5(lF98dCR0TIO8DDCYOu lf98dcr0tio8ddcyou, long j, boolean z) {
        int size;
        int size2;
        int i;
        Object obj;
        String strConcat;
        uV3RzXbqCGFOlAdx uv3rzxbqcgfoladx = lf98dcr0tio8ddcyou.vekpFI4d1Nc4fakF;
        if (uv3rzxbqcgfoladx != this) {
            if (uv3rzxbqcgfoladx != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            lf98dcr0tio8ddcyou.vekpFI4d1Nc4fakF = this;
        }
        long jNanoTime = System.nanoTime();
        long j2 = jNanoTime + j;
        ArrayList arrayList = this.Ee8d2j4S9Vm5yGuR;
        int iIndexOf = arrayList.indexOf(lf98dcr0tio8ddcyou);
        int i2 = 92 - 93;
        if (iIndexOf == i2) {
            lf98dcr0tio8ddcyou.JXn4Qf7zpnLjP5 = j2;
            W6dfON4KdcdxlH w6dfON4KdcdxlH = Cid8LKolL4e2FdtXe.b1EoSIRjJHO5;
            if (Cid8LKolL4e2FdtXe.D5P1xCAyuvgF.isLoggable(Level.FINE)) {
                if (z) {
                    strConcat = "run again after ".concat(jb8et6SZeK5TWMrJFxDX.ibVTtJUNfrGYbW(j2 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(jb8et6SZeK5TWMrJFxDX.ibVTtJUNfrGYbW(j2 - jNanoTime));
                }
                jb8et6SZeK5TWMrJFxDX.w9sT1Swbhx3hs(lf98dcr0tio8ddcyou, this, strConcat);
            }
            size = arrayList.size();
            size2 = 0;
            i = 0;
            while (true) {
                if (i < size) {
                    size2 = i2;
                    break;
                }
                obj = arrayList.get(i);
                i++;
                if (((lF98dCR0TIO8DDCYOu) obj).JXn4Qf7zpnLjP5 - jNanoTime > j) {
                    break;
                }
                size2++;
            }
            if (size2 == i2) {
                size2 = arrayList.size();
            }
            arrayList.add(size2, lf98dcr0tio8ddcyou);
            if (size2 == 0) {
                return true;
            }
        } else if (lf98dcr0tio8ddcyou.JXn4Qf7zpnLjP5 <= j2) {
            W6dfON4KdcdxlH w6dfON4KdcdxlH2 = Cid8LKolL4e2FdtXe.b1EoSIRjJHO5;
            if (Cid8LKolL4e2FdtXe.D5P1xCAyuvgF.isLoggable(Level.FINE)) {
                jb8et6SZeK5TWMrJFxDX.w9sT1Swbhx3hs(lf98dcr0tio8ddcyou, this, "already scheduled");
                return false;
            }
        } else {
            arrayList.remove(iIndexOf);
            lf98dcr0tio8ddcyou.JXn4Qf7zpnLjP5 = j2;
            W6dfON4KdcdxlH w6dfON4KdcdxlH3 = Cid8LKolL4e2FdtXe.b1EoSIRjJHO5;
            if (Cid8LKolL4e2FdtXe.D5P1xCAyuvgF.isLoggable(Level.FINE)) {
                if (z) {
                    strConcat = "run again after ".concat(jb8et6SZeK5TWMrJFxDX.ibVTtJUNfrGYbW(j2 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(jb8et6SZeK5TWMrJFxDX.ibVTtJUNfrGYbW(j2 - jNanoTime));
                }
                jb8et6SZeK5TWMrJFxDX.w9sT1Swbhx3hs(lf98dcr0tio8ddcyou, this, strConcat);
            }
            size = arrayList.size();
            size2 = 0;
            i = 0;
            while (true) {
                if (i < size) {
                    size2 = i2;
                    break;
                }
                obj = arrayList.get(i);
                i++;
                if (((lF98dCR0TIO8DDCYOu) obj).JXn4Qf7zpnLjP5 - jNanoTime > j) {
                    break;
                    break;
                }
                size2++;
            }
            if (size2 == i2) {
                size2 = arrayList.size();
            }
            arrayList.add(size2, lf98dcr0tio8ddcyou);
            if (size2 == 0) {
                return true;
            }
        }
        return false;
    }

    public final void dDIMxZXP1V8HdM() {
        byte[] bArr = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
        synchronized (this.dDIMxZXP1V8HdM) {
            if (w9sT1Swbhx3hs()) {
                this.dDIMxZXP1V8HdM.JXn4Qf7zpnLjP5(this);
            }
        }
    }

    public final String toString() {
        return this.w9sT1Swbhx3hs;
    }

    public final void vekpFI4d1Nc4fakF(lF98dCR0TIO8DDCYOu lf98dcr0tio8ddcyou, long j) {
        synchronized (this.dDIMxZXP1V8HdM) {
            if (!this.vekpFI4d1Nc4fakF) {
                if (JXn4Qf7zpnLjP5(lf98dcr0tio8ddcyou, j, false)) {
                    this.dDIMxZXP1V8HdM.JXn4Qf7zpnLjP5(this);
                }
            } else if (lf98dcr0tio8ddcyou.w9sT1Swbhx3hs) {
                W6dfON4KdcdxlH w6dfON4KdcdxlH = Cid8LKolL4e2FdtXe.b1EoSIRjJHO5;
                if (Cid8LKolL4e2FdtXe.D5P1xCAyuvgF.isLoggable(Level.FINE)) {
                    jb8et6SZeK5TWMrJFxDX.w9sT1Swbhx3hs(lf98dcr0tio8ddcyou, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                W6dfON4KdcdxlH w6dfON4KdcdxlH2 = Cid8LKolL4e2FdtXe.b1EoSIRjJHO5;
                if (Cid8LKolL4e2FdtXe.D5P1xCAyuvgF.isLoggable(Level.FINE)) {
                    jb8et6SZeK5TWMrJFxDX.w9sT1Swbhx3hs(lf98dcr0tio8ddcyou, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean w9sT1Swbhx3hs() {
        lF98dCR0TIO8DDCYOu lf98dcr0tio8ddcyou = this.JXn4Qf7zpnLjP5;
        if (lf98dcr0tio8ddcyou != null && lf98dcr0tio8ddcyou.w9sT1Swbhx3hs) {
            this.xDyLpEZyrcKVe0 = true;
        }
        ArrayList arrayList = this.Ee8d2j4S9Vm5yGuR;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((lF98dCR0TIO8DDCYOu) arrayList.get(size)).w9sT1Swbhx3hs) {
                lF98dCR0TIO8DDCYOu lf98dcr0tio8ddcyou2 = (lF98dCR0TIO8DDCYOu) arrayList.get(size);
                W6dfON4KdcdxlH w6dfON4KdcdxlH = Cid8LKolL4e2FdtXe.b1EoSIRjJHO5;
                if (Cid8LKolL4e2FdtXe.D5P1xCAyuvgF.isLoggable(Level.FINE)) {
                    jb8et6SZeK5TWMrJFxDX.w9sT1Swbhx3hs(lf98dcr0tio8ddcyou2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }
}
