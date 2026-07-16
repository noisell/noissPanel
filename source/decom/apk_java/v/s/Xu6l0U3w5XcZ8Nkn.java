package v.s;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class Xu6l0U3w5XcZ8Nkn {
    public final LinkedHashMap dDIMxZXP1V8HdM = new LinkedHashMap();

    private static /* synthetic */ void afkrqej() {
    }

    public final void dDIMxZXP1V8HdM() {
        for (NxoJLFH7TrhGd5768J nxoJLFH7TrhGd5768J : this.dDIMxZXP1V8HdM.values()) {
            HashMap map = nxoJLFH7TrhGd5768J.dDIMxZXP1V8HdM;
            if (map != null) {
                synchronized (map) {
                    try {
                        for (Object obj : nxoJLFH7TrhGd5768J.dDIMxZXP1V8HdM.values()) {
                            if (obj instanceof Closeable) {
                                try {
                                    ((Closeable) obj).close();
                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            LinkedHashSet linkedHashSet = nxoJLFH7TrhGd5768J.w9sT1Swbhx3hs;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        for (Closeable closeable : nxoJLFH7TrhGd5768J.w9sT1Swbhx3hs) {
                            if (closeable != null) {
                                try {
                                    closeable.close();
                                } catch (IOException e2) {
                                    throw new RuntimeException(e2);
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            nxoJLFH7TrhGd5768J.dDIMxZXP1V8HdM();
        }
        this.dDIMxZXP1V8HdM.clear();
    }
}
