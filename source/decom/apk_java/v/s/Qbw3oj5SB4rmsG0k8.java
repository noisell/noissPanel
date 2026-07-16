package v.s;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class Qbw3oj5SB4rmsG0k8 {
    public static final /* synthetic */ int dDIMxZXP1V8HdM = 0;

    static {
        fEyMFFyOOvHURJ7To6L.wotphlvK9sPbXJ("Schedulers");
    }

    public static void dDIMxZXP1V8HdM(nLrxl2ExJj45rGBsZNLQ nlrxl2exjj45rgbsznlq, fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6l, ArrayList arrayList) {
        if (arrayList.size() > 0) {
            feymffyoovhurj7to6l.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                nlrxl2exjj45rgbsznlq.wotphlvK9sPbXJ(jCurrentTimeMillis, ((sFdNPiaH9eT4T) obj).dDIMxZXP1V8HdM);
            }
        }
    }

    public static void w9sT1Swbhx3hs(eDfRIe8Yxow8 edfrie8yxow8, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        nLrxl2ExJj45rGBsZNLQ nlrxl2exjj45rgbsznlqXiR1pIn5878vVWd = workDatabase.XiR1pIn5878vVWd();
        workDatabase.vekpFI4d1Nc4fakF();
        try {
            ArrayList arrayListIbVTtJUNfrGYbW = nlrxl2exjj45rgbsznlqXiR1pIn5878vVWd.ibVTtJUNfrGYbW();
            dDIMxZXP1V8HdM(nlrxl2exjj45rgbsznlqXiR1pIn5878vVWd, (fEyMFFyOOvHURJ7To6L) edfrie8yxow8.xDyLpEZyrcKVe0, arrayListIbVTtJUNfrGYbW);
            ArrayList arrayListXDyLpEZyrcKVe0 = nlrxl2exjj45rgbsznlqXiR1pIn5878vVWd.xDyLpEZyrcKVe0(edfrie8yxow8.vekpFI4d1Nc4fakF);
            dDIMxZXP1V8HdM(nlrxl2exjj45rgbsznlqXiR1pIn5878vVWd, (fEyMFFyOOvHURJ7To6L) edfrie8yxow8.xDyLpEZyrcKVe0, arrayListXDyLpEZyrcKVe0);
            arrayListXDyLpEZyrcKVe0.addAll(arrayListIbVTtJUNfrGYbW);
            ArrayList arrayListJXn4Qf7zpnLjP5 = nlrxl2exjj45rgbsznlqXiR1pIn5878vVWd.JXn4Qf7zpnLjP5();
            workDatabase.wotphlvK9sPbXJ();
            workDatabase.D5P1xCAyuvgF();
            if (arrayListXDyLpEZyrcKVe0.size() > 0) {
                sFdNPiaH9eT4T[] sfdnpiah9et4tArr = (sFdNPiaH9eT4T[]) arrayListXDyLpEZyrcKVe0.toArray(new sFdNPiaH9eT4T[arrayListXDyLpEZyrcKVe0.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    IaJdiuw5vdcTDn7 iaJdiuw5vdcTDn7 = (IaJdiuw5vdcTDn7) it.next();
                    if (iaJdiuw5vdcTDn7.Ee8d2j4S9Vm5yGuR()) {
                        iaJdiuw5vdcTDn7.vekpFI4d1Nc4fakF(sfdnpiah9et4tArr);
                    }
                }
            }
            if (arrayListJXn4Qf7zpnLjP5.size() > 0) {
                sFdNPiaH9eT4T[] sfdnpiah9et4tArr2 = (sFdNPiaH9eT4T[]) arrayListJXn4Qf7zpnLjP5.toArray(new sFdNPiaH9eT4T[arrayListJXn4Qf7zpnLjP5.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    IaJdiuw5vdcTDn7 iaJdiuw5vdcTDn8 = (IaJdiuw5vdcTDn7) it2.next();
                    if (!iaJdiuw5vdcTDn8.Ee8d2j4S9Vm5yGuR()) {
                        iaJdiuw5vdcTDn8.vekpFI4d1Nc4fakF(sfdnpiah9et4tArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.D5P1xCAyuvgF();
            throw th;
        }
    }
}
