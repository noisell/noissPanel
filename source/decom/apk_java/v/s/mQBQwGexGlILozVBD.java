package v.s;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class mQBQwGexGlILozVBD {
    public final long dDIMxZXP1V8HdM;
    public final long w9sT1Swbhx3hs;

    public mQBQwGexGlILozVBD(long j, long j2) {
        this.dDIMxZXP1V8HdM = j;
        this.w9sT1Swbhx3hs = j2;
    }

    private static /* synthetic */ void uglea() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mQBQwGexGlILozVBD.class.equals(obj.getClass())) {
            mQBQwGexGlILozVBD mqbqwgexglilozvbd = (mQBQwGexGlILozVBD) obj;
            if (mqbqwgexglilozvbd.dDIMxZXP1V8HdM == this.dDIMxZXP1V8HdM && mqbqwgexglilozvbd.w9sT1Swbhx3hs == this.w9sT1Swbhx3hs) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.w9sT1Swbhx3hs) + (Long.hashCode(this.dDIMxZXP1V8HdM) * 31);
    }

    public final String toString() {
        return "PeriodicityInfo{repeatIntervalMillis=" + this.dDIMxZXP1V8HdM + ", flexIntervalMillis=" + this.w9sT1Swbhx3hs + '}';
    }
}
