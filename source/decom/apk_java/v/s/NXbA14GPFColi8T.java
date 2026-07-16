package v.s;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class NXbA14GPFColi8T implements zzxeBctTPcbuazkjVgh {
    public volatile Set dDIMxZXP1V8HdM;
    public volatile Set w9sT1Swbhx3hs;

    private static /* synthetic */ void aqppzdl() {
    }

    @Override // v.s.zzxeBctTPcbuazkjVgh
    public final Object get() {
        if (this.w9sT1Swbhx3hs == null) {
            synchronized (this) {
                try {
                    if (this.w9sT1Swbhx3hs == null) {
                        this.w9sT1Swbhx3hs = Collections.newSetFromMap(new ConcurrentHashMap());
                        synchronized (this) {
                            try {
                                Iterator it = this.dDIMxZXP1V8HdM.iterator();
                                while (it.hasNext()) {
                                    this.w9sT1Swbhx3hs.add(((zzxeBctTPcbuazkjVgh) it.next()).get());
                                }
                                this.dDIMxZXP1V8HdM = null;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return Collections.unmodifiableSet(this.w9sT1Swbhx3hs);
    }
}
