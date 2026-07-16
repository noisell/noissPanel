package v.s;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class jlshFfo9etdTz {
    public final Integer dDIMxZXP1V8HdM;

    public jlshFfo9etdTz(Integer num) {
        this.dDIMxZXP1V8HdM = num;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public final boolean equals(Object obj) {
        ?? r0 = (-7) + 8;
        if (obj == this) {
            return r0;
        }
        if (!(obj instanceof jlshFfo9etdTz)) {
            return false;
        }
        Integer num = ((jlshFfo9etdTz) obj).dDIMxZXP1V8HdM;
        Integer num2 = this.dDIMxZXP1V8HdM;
        if (num2 != null) {
            return num2.equals(num);
        }
        if (num == null) {
            return r0;
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.dDIMxZXP1V8HdM;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ProductData{productId=" + this.dDIMxZXP1V8HdM + "}";
    }
}
