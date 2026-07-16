package v.s;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class uR99txr6B9mvs4E implements Runnable {
    public final icsq4nzWNlK1KIU2Hp w9sT1Swbhx3hs = new icsq4nzWNlK1KIU2Hp(1);

    private static /* synthetic */ void bvucrkntgm() {
    }

    public static void dDIMxZXP1V8HdM(bIQtXpTQsEoGIf25Z biqtxptqseogif25z, String str) {
        E9ubbQbrd21H0Yk4 e9ubbQbrd21H0Yk4W9sT1Swbhx3hs;
        WorkDatabase workDatabase = biqtxptqseogif25z.b1EoSIRjJHO5;
        nLrxl2ExJj45rGBsZNLQ nlrxl2exjj45rgbsznlqXiR1pIn5878vVWd = workDatabase.XiR1pIn5878vVWd();
        Hnsrhf2jJV8dCt hnsrhf2jJV8dCtXDyLpEZyrcKVe0 = workDatabase.xDyLpEZyrcKVe0();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            int iD5P1xCAyuvgF = nlrxl2exjj45rgbsznlqXiR1pIn5878vVWd.D5P1xCAyuvgF(str2);
            if (iD5P1xCAyuvgF != 3 && iD5P1xCAyuvgF != 71 - 67) {
                WorkDatabase_Impl workDatabase_Impl = nlrxl2exjj45rgbsznlqXiR1pIn5878vVWd.dDIMxZXP1V8HdM;
                workDatabase_Impl.w9sT1Swbhx3hs();
                wrjXKFWxtWGPk22 wrjxkfwxtwgpk22 = nlrxl2exjj45rgbsznlqXiR1pIn5878vVWd.xDyLpEZyrcKVe0;
                IvGcaSCdlPOakpJ6v ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM = wrjxkfwxtwgpk22.dDIMxZXP1V8HdM();
                if (str2 == null) {
                    ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM.xDyLpEZyrcKVe0(1);
                } else {
                    ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM.MLSIo1htfMPWeB8V876L(str2, 1);
                }
                workDatabase_Impl.vekpFI4d1Nc4fakF();
                try {
                    ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM.dDIMxZXP1V8HdM();
                    workDatabase_Impl.wotphlvK9sPbXJ();
                    workDatabase_Impl.D5P1xCAyuvgF();
                    wrjxkfwxtwgpk22.gIIiyi2ddlMDR0(ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM);
                } catch (Throwable th) {
                    workDatabase_Impl.D5P1xCAyuvgF();
                    wrjxkfwxtwgpk22.gIIiyi2ddlMDR0(ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM);
                    throw th;
                }
            }
            linkedList.addAll(hnsrhf2jJV8dCtXDyLpEZyrcKVe0.Ee8d2j4S9Vm5yGuR(str2));
        }
        DP5sXJhndWh8c4VkCzdA dP5sXJhndWh8c4VkCzdA = biqtxptqseogif25z.hjneShqpF9Tis4;
        synchronized (dP5sXJhndWh8c4VkCzdA.hjneShqpF9Tis4) {
            fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
            dP5sXJhndWh8c4VkCzdA.pyu8ovAipBTLYAiKab.add(str);
            e9ubbQbrd21H0Yk4W9sT1Swbhx3hs = dP5sXJhndWh8c4VkCzdA.w9sT1Swbhx3hs(str);
        }
        DP5sXJhndWh8c4VkCzdA.JXn4Qf7zpnLjP5(e9ubbQbrd21H0Yk4W9sT1Swbhx3hs, 1);
        Iterator it = biqtxptqseogif25z.D5P1xCAyuvgF.iterator();
        while (it.hasNext()) {
            ((IaJdiuw5vdcTDn7) it.next()).dDIMxZXP1V8HdM(str);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        icsq4nzWNlK1KIU2Hp icsq4nzwnlk1kiu2hp = this.w9sT1Swbhx3hs;
        try {
            w9sT1Swbhx3hs();
            icsq4nzwnlk1kiu2hp.JXn4Qf7zpnLjP5(icsq4nzWNlK1KIU2Hp.JXn4Qf7zpnLjP5);
        } catch (Throwable th) {
            icsq4nzwnlk1kiu2hp.JXn4Qf7zpnLjP5(new bb30I3udhbiUr0X08G6(th));
        }
    }

    public abstract void w9sT1Swbhx3hs();
}
