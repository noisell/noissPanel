package v.s;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class bYTTp7VwXfKJ {
    public volatile boolean JXn4Qf7zpnLjP5 = true;
    public final Socket dDIMxZXP1V8HdM;
    public final OutputStream vekpFI4d1Nc4fakF;
    public final InputStream w9sT1Swbhx3hs;

    public bYTTp7VwXfKJ(Socket socket, InputStream inputStream, OutputStream outputStream) {
        this.dDIMxZXP1V8HdM = socket;
        this.w9sT1Swbhx3hs = inputStream;
        this.vekpFI4d1Nc4fakF = outputStream;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bYTTp7VwXfKJ)) {
            return false;
        }
        bYTTp7VwXfKJ byttp7vwxfkj = (bYTTp7VwXfKJ) obj;
        return this.dDIMxZXP1V8HdM.equals(byttp7vwxfkj.dDIMxZXP1V8HdM) && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.w9sT1Swbhx3hs, byttp7vwxfkj.w9sT1Swbhx3hs) && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.vekpFI4d1Nc4fakF, byttp7vwxfkj.vekpFI4d1Nc4fakF) && this.JXn4Qf7zpnLjP5 == byttp7vwxfkj.JXn4Qf7zpnLjP5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = (this.vekpFI4d1Nc4fakF.hashCode() + ((this.w9sT1Swbhx3hs.hashCode() + (this.dDIMxZXP1V8HdM.hashCode() * 31)) * 31)) * 31;
        boolean z = this.JXn4Qf7zpnLjP5;
        int i = z;
        if (z) {
            i = 78 - 77;
        }
        return iHashCode + i;
    }

    public final String toString() {
        return "ChannelState(socket=" + this.dDIMxZXP1V8HdM + ", input=" + this.w9sT1Swbhx3hs + ", output=" + this.vekpFI4d1Nc4fakF + ", active=" + this.JXn4Qf7zpnLjP5 + ")";
    }
}
