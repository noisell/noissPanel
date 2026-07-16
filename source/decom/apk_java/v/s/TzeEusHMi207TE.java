package v.s;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class TzeEusHMi207TE implements Runnable, Comparable, Xoey1fYV9aCBctS {
    private volatile Object _heap;
    public int vekpFI4d1Nc4fakF;
    public long w9sT1Swbhx3hs;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.w9sT1Swbhx3hs - ((TzeEusHMi207TE) obj).w9sT1Swbhx3hs;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final int dDIMxZXP1V8HdM(long j, f13op62NCrgMb8IPpQhI f13op62ncrgmb8ippqhi, IcZQaQ1dQIeHVmGNCLL6 icZQaQ1dQIeHVmGNCLL6) {
        synchronized (this) {
            if (this._heap == OFMrQsTe5s1KYV0lq.w9sT1Swbhx3hs) {
                return 2;
            }
            synchronized (f13op62ncrgmb8ippqhi) {
                try {
                    TzeEusHMi207TE[] tzeEusHMi207TEArr = f13op62ncrgmb8ippqhi.dDIMxZXP1V8HdM;
                    TzeEusHMi207TE tzeEusHMi207TE = tzeEusHMi207TEArr != null ? tzeEusHMi207TEArr[0] : null;
                    if (IcZQaQ1dQIeHVmGNCLL6.b1EoSIRjJHO5.get(icZQaQ1dQIeHVmGNCLL6) != 0) {
                        return 1;
                    }
                    if (tzeEusHMi207TE == null) {
                        f13op62ncrgmb8ippqhi.vekpFI4d1Nc4fakF = j;
                    } else {
                        long j2 = tzeEusHMi207TE.w9sT1Swbhx3hs;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - f13op62ncrgmb8ippqhi.vekpFI4d1Nc4fakF > 0) {
                            f13op62ncrgmb8ippqhi.vekpFI4d1Nc4fakF = j;
                        }
                    }
                    long j3 = this.w9sT1Swbhx3hs;
                    long j4 = f13op62ncrgmb8ippqhi.vekpFI4d1Nc4fakF;
                    if (j3 - j4 < 0) {
                        this.w9sT1Swbhx3hs = j4;
                    }
                    f13op62ncrgmb8ippqhi.dDIMxZXP1V8HdM(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.w9sT1Swbhx3hs + ']';
    }

    @Override // v.s.Xoey1fYV9aCBctS
    public final void vekpFI4d1Nc4fakF() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                o0rN3ekjBJ6kKwok o0rn3ekjbj6kkwok = OFMrQsTe5s1KYV0lq.w9sT1Swbhx3hs;
                if (obj == o0rn3ekjbj6kkwok) {
                    return;
                }
                f13op62NCrgMb8IPpQhI f13op62ncrgmb8ippqhi = obj instanceof f13op62NCrgMb8IPpQhI ? (f13op62NCrgMb8IPpQhI) obj : null;
                if (f13op62ncrgmb8ippqhi != null) {
                    synchronized (f13op62ncrgmb8ippqhi) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof Q2lEaKSVZGE9bu0igCo ? (Q2lEaKSVZGE9bu0igCo) obj2 : null) != null) {
                            f13op62ncrgmb8ippqhi.w9sT1Swbhx3hs(this.vekpFI4d1Nc4fakF);
                        }
                    }
                }
                this._heap = o0rn3ekjbj6kkwok;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void w9sT1Swbhx3hs(f13op62NCrgMb8IPpQhI f13op62ncrgmb8ippqhi) {
        if (this._heap == OFMrQsTe5s1KYV0lq.w9sT1Swbhx3hs) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = f13op62ncrgmb8ippqhi;
    }
}
