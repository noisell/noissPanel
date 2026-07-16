package v.s;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class XLl8iYn7yPzhz {
    public final long dDIMxZXP1V8HdM;
    public final UAg7SCKjkktbMM vekpFI4d1Nc4fakF;
    public final oO26y14q3Pwf w9sT1Swbhx3hs;

    public XLl8iYn7yPzhz(long j, oO26y14q3Pwf oo26y14q3pwf, UAg7SCKjkktbMM uAg7SCKjkktbMM) {
        this.dDIMxZXP1V8HdM = j;
        this.w9sT1Swbhx3hs = oo26y14q3pwf;
        this.vekpFI4d1Nc4fakF = uAg7SCKjkktbMM;
    }

    private static /* synthetic */ void irona() {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public final boolean equals(Object obj) {
        ?? r0 = (-50) + 51;
        if (obj == this) {
            return r0;
        }
        if (obj instanceof XLl8iYn7yPzhz) {
            XLl8iYn7yPzhz xLl8iYn7yPzhz = (XLl8iYn7yPzhz) obj;
            if (this.dDIMxZXP1V8HdM == xLl8iYn7yPzhz.dDIMxZXP1V8HdM && this.w9sT1Swbhx3hs.equals(xLl8iYn7yPzhz.w9sT1Swbhx3hs) && this.vekpFI4d1Nc4fakF.equals(xLl8iYn7yPzhz.vekpFI4d1Nc4fakF)) {
                return r0;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.dDIMxZXP1V8HdM;
        return ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.w9sT1Swbhx3hs.hashCode()) * 1000003) ^ this.vekpFI4d1Nc4fakF.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.dDIMxZXP1V8HdM + ", transportContext=" + this.w9sT1Swbhx3hs + ", event=" + this.vekpFI4d1Nc4fakF + "}";
    }
}
