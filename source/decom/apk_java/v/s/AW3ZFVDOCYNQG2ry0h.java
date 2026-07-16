package v.s;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class AW3ZFVDOCYNQG2ry0h {
    public final uV3RzXbqCGFOlAdx w9sT1Swbhx3hs;
    public final long dDIMxZXP1V8HdM = TimeUnit.MINUTES.toNanos(5);
    public final m2RLabjFXo9vTghXAsK vekpFI4d1Nc4fakF = new m2RLabjFXo9vTghXAsK(this, Y9mRyRdkl5FOcwb66V6.D5P1xCAyuvgF(new StringBuilder(), yrMnf4fyLGfIJbMg8IbG.xDyLpEZyrcKVe0, " ConnectionPool"));
    public final ConcurrentLinkedQueue JXn4Qf7zpnLjP5 = new ConcurrentLinkedQueue();

    public AW3ZFVDOCYNQG2ry0h(Cid8LKolL4e2FdtXe cid8LKolL4e2FdtXe) {
        this.w9sT1Swbhx3hs = cid8LKolL4e2FdtXe.Ee8d2j4S9Vm5yGuR();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x002a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x002f A[SYNTHETIC] */
    public final boolean dDIMxZXP1V8HdM(VEkRsTDS6a9oHWI vEkRsTDS6a9oHWI, VdAulbq7zlVjr545h vdAulbq7zlVjr545h, ArrayList arrayList, boolean z) {
        Iterator it = this.JXn4Qf7zpnLjP5.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            zfPdbqrCOkdxWPAv zfpdbqrcokdxwpav = (zfPdbqrCOkdxWPAv) it.next();
            synchronized (zfpdbqrcokdxwpav) {
                if (z) {
                    try {
                        if (!(zfpdbqrcokdxwpav.ibVTtJUNfrGYbW != null)) {
                            continue;
                        } else if (zfpdbqrcokdxwpav.b1EoSIRjJHO5(vEkRsTDS6a9oHWI, arrayList)) {
                            vdAulbq7zlVjr545h.w9sT1Swbhx3hs(zfpdbqrcokdxwpav);
                            return true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else if (zfpdbqrcokdxwpav.b1EoSIRjJHO5(vEkRsTDS6a9oHWI, arrayList)) {
                    vdAulbq7zlVjr545h.w9sT1Swbhx3hs(zfpdbqrcokdxwpav);
                    return true;
                }
            }
        }
    }

    public final int w9sT1Swbhx3hs(zfPdbqrCOkdxWPAv zfpdbqrcokdxwpav, long j) {
        byte[] bArr = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
        ArrayList arrayList = zfpdbqrcokdxwpav.nQilHWaqS401ZtR;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + zfpdbqrcokdxwpav.w9sT1Swbhx3hs.dDIMxZXP1V8HdM.b1EoSIRjJHO5 + " was leaked. Did you forget to close a response body?";
                QnMItFgHCjZ1bOS qnMItFgHCjZ1bOS = QnMItFgHCjZ1bOS.dDIMxZXP1V8HdM;
                QnMItFgHCjZ1bOS.dDIMxZXP1V8HdM.D5P1xCAyuvgF(((RJ8VTQCOfB7ZL32c8xJ) reference).dDIMxZXP1V8HdM, str);
                arrayList.remove(i);
                zfpdbqrcokdxwpav.D5P1xCAyuvgF = true;
                if (arrayList.isEmpty()) {
                    zfpdbqrcokdxwpav.J0zjQ7CAgohuxU20eCW6 = j - this.dDIMxZXP1V8HdM;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
