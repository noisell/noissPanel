package v.s;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class aDVMGd8elswZl implements N0WdkAONIkuA3FtM {
    public static final AtomicReference dDIMxZXP1V8HdM = new AtomicReference();

    @Override // v.s.N0WdkAONIkuA3FtM
    public final void dDIMxZXP1V8HdM(boolean z) {
        synchronized (dfwkxUDiclPw1BowH4.D5P1xCAyuvgF) {
            try {
                ArrayList arrayList = new ArrayList(dfwkxUDiclPw1BowH4.hjneShqpF9Tis4.values());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    dfwkxUDiclPw1BowH4 dfwkxudiclpw1bowh4 = (dfwkxUDiclPw1BowH4) obj;
                    if (dfwkxudiclpw1bowh4.Ee8d2j4S9Vm5yGuR.get()) {
                        Iterator it = dfwkxudiclpw1bowh4.pyu8ovAipBTLYAiKab.iterator();
                        while (it.hasNext()) {
                            dfwkxUDiclPw1BowH4 dfwkxudiclpw1bowh5 = ((tPpWTwe5gflwjPMaBs) it.next()).dDIMxZXP1V8HdM;
                            if (!z) {
                                ((TT2KHOpLgEiQtjhkGm) dfwkxudiclpw1bowh5.b1EoSIRjJHO5.get()).w9sT1Swbhx3hs();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
