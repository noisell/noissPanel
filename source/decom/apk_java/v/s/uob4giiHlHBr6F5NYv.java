package v.s;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class uob4giiHlHBr6F5NYv {
    public final VEkRsTDS6a9oHWI dDIMxZXP1V8HdM;
    public final InetSocketAddress vekpFI4d1Nc4fakF;
    public final Proxy w9sT1Swbhx3hs;

    public uob4giiHlHBr6F5NYv(VEkRsTDS6a9oHWI vEkRsTDS6a9oHWI, Proxy proxy, InetSocketAddress inetSocketAddress) {
        this.dDIMxZXP1V8HdM = vEkRsTDS6a9oHWI;
        this.w9sT1Swbhx3hs = proxy;
        this.vekpFI4d1Nc4fakF = inetSocketAddress;
    }

    private static /* synthetic */ void csitdcqn() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof uob4giiHlHBr6F5NYv)) {
            return false;
        }
        uob4giiHlHBr6F5NYv uob4giihlhbr6f5nyv = (uob4giiHlHBr6F5NYv) obj;
        return okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(uob4giihlhbr6f5nyv.dDIMxZXP1V8HdM, this.dDIMxZXP1V8HdM) && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(uob4giihlhbr6f5nyv.w9sT1Swbhx3hs, this.w9sT1Swbhx3hs) && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(uob4giihlhbr6f5nyv.vekpFI4d1Nc4fakF, this.vekpFI4d1Nc4fakF);
    }

    public final int hashCode() {
        return this.vekpFI4d1Nc4fakF.hashCode() + ((this.w9sT1Swbhx3hs.hashCode() + ((this.dDIMxZXP1V8HdM.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.vekpFI4d1Nc4fakF + '}';
    }
}
