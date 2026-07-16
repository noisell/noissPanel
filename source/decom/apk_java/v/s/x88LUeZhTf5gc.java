package v.s;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class x88LUeZhTf5gc {
    public final YqGxPPaYwAVe9 dDIMxZXP1V8HdM;
    public final jlshFfo9etdTz w9sT1Swbhx3hs;

    public x88LUeZhTf5gc(YqGxPPaYwAVe9 yqGxPPaYwAVe9, jlshFfo9etdTz jlshffo9etdtz) {
        this.dDIMxZXP1V8HdM = yqGxPPaYwAVe9;
        this.w9sT1Swbhx3hs = jlshffo9etdtz;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x88LUeZhTf5gc)) {
            return false;
        }
        x88LUeZhTf5gc x88luezhtf5gc = (x88LUeZhTf5gc) obj;
        jlshFfo9etdTz jlshffo9etdtz = x88luezhtf5gc.w9sT1Swbhx3hs;
        if (!this.dDIMxZXP1V8HdM.equals(x88luezhtf5gc.dDIMxZXP1V8HdM)) {
            return false;
        }
        Object obj2 = LB7U1qakabytBm.w9sT1Swbhx3hs;
        return obj2.equals(obj2) && this.w9sT1Swbhx3hs.equals(jlshffo9etdtz);
    }

    public final int hashCode() {
        return this.w9sT1Swbhx3hs.hashCode() ^ (((((1000003 * 1000003) ^ this.dDIMxZXP1V8HdM.hashCode()) * 1000003) ^ LB7U1qakabytBm.w9sT1Swbhx3hs.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.dDIMxZXP1V8HdM + ", priority=" + LB7U1qakabytBm.w9sT1Swbhx3hs + ", productData=" + this.w9sT1Swbhx3hs + "}";
    }
}
