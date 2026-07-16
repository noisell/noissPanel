package v.s;

import android.content.Context;
import android.database.Cursor;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class E9ubbQbrd21H0Yk4 implements Runnable {
    public static final /* synthetic */ int XiR1pIn5878vVWd = 0;
    public final DP5sXJhndWh8c4VkCzdA D5P1xCAyuvgF;
    public Qa4pJoqqkp7u Ee8d2j4S9Vm5yGuR;
    public final sFdNPiaH9eT4T JXn4Qf7zpnLjP5;
    public String Qrz92kRPw4GcghAc;
    public final eDfRIe8Yxow8 b1EoSIRjJHO5;
    public final Hnsrhf2jJV8dCt gIIiyi2ddlMDR0;
    public final nLrxl2ExJj45rGBsZNLQ gmNWMfvn6zlEj;
    public final WorkDatabase hjneShqpF9Tis4;
    public final fEyMFFyOOvHURJ7To6L pyu8ovAipBTLYAiKab;
    public final String vekpFI4d1Nc4fakF;
    public final Context w9sT1Swbhx3hs;
    public final ArrayList wotphlvK9sPbXJ;
    public final fUH025aw0Rgl xDyLpEZyrcKVe0;
    public MdvPnR06eW9Un0O ibVTtJUNfrGYbW = new zNadm2dnLHIyNeibE5();
    public final Af6wX3D8R2iFhqxr nQilHWaqS401ZtR = new Af6wX3D8R2iFhqxr();
    public final Af6wX3D8R2iFhqxr J0zjQ7CAgohuxU20eCW6 = new Af6wX3D8R2iFhqxr();
    public volatile int MLSIo1htfMPWeB8V876L = -256;

    static {
        fEyMFFyOOvHURJ7To6L.wotphlvK9sPbXJ("WorkerWrapper");
    }

    public E9ubbQbrd21H0Yk4(NYXyLhuO3qlh84AKe52 nYXyLhuO3qlh84AKe52) {
        this.w9sT1Swbhx3hs = (Context) nYXyLhuO3qlh84AKe52.w9sT1Swbhx3hs;
        this.xDyLpEZyrcKVe0 = (fUH025aw0Rgl) nYXyLhuO3qlh84AKe52.JXn4Qf7zpnLjP5;
        this.D5P1xCAyuvgF = (DP5sXJhndWh8c4VkCzdA) nYXyLhuO3qlh84AKe52.vekpFI4d1Nc4fakF;
        sFdNPiaH9eT4T sfdnpiah9et4t = (sFdNPiaH9eT4T) nYXyLhuO3qlh84AKe52.ibVTtJUNfrGYbW;
        this.JXn4Qf7zpnLjP5 = sfdnpiah9et4t;
        this.vekpFI4d1Nc4fakF = sfdnpiah9et4t.dDIMxZXP1V8HdM;
        this.Ee8d2j4S9Vm5yGuR = null;
        eDfRIe8Yxow8 edfrie8yxow8 = (eDfRIe8Yxow8) nYXyLhuO3qlh84AKe52.Ee8d2j4S9Vm5yGuR;
        this.b1EoSIRjJHO5 = edfrie8yxow8;
        this.pyu8ovAipBTLYAiKab = (fEyMFFyOOvHURJ7To6L) edfrie8yxow8.xDyLpEZyrcKVe0;
        WorkDatabase workDatabase = (WorkDatabase) nYXyLhuO3qlh84AKe52.xDyLpEZyrcKVe0;
        this.hjneShqpF9Tis4 = workDatabase;
        this.gmNWMfvn6zlEj = workDatabase.XiR1pIn5878vVWd();
        this.gIIiyi2ddlMDR0 = workDatabase.xDyLpEZyrcKVe0();
        this.wotphlvK9sPbXJ = (ArrayList) nYXyLhuO3qlh84AKe52.b1EoSIRjJHO5;
    }

    public final void Ee8d2j4S9Vm5yGuR(boolean z) {
        this.hjneShqpF9Tis4.vekpFI4d1Nc4fakF();
        try {
            nLrxl2ExJj45rGBsZNLQ nlrxl2exjj45rgbsznlqXiR1pIn5878vVWd = this.hjneShqpF9Tis4.XiR1pIn5878vVWd();
            nlrxl2exjj45rgbsznlqXiR1pIn5878vVWd.getClass();
            eZ6soZeOs7kkqZcCQFOR ez6sozeos7kkqzccqforD5P1xCAyuvgF = eZ6soZeOs7kkqZcCQFOR.D5P1xCAyuvgF("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
            WorkDatabase_Impl workDatabase_Impl = nlrxl2exjj45rgbsznlqXiR1pIn5878vVWd.dDIMxZXP1V8HdM;
            workDatabase_Impl.w9sT1Swbhx3hs();
            Cursor cursorGmNWMfvn6zlEj = workDatabase_Impl.gmNWMfvn6zlEj(ez6sozeos7kkqzccqforD5P1xCAyuvgF);
            try {
                boolean z2 = cursorGmNWMfvn6zlEj.moveToFirst() && cursorGmNWMfvn6zlEj.getInt(0) != 0;
                cursorGmNWMfvn6zlEj.close();
                ez6sozeos7kkqzccqforD5P1xCAyuvgF.hjneShqpF9Tis4();
                if (!z2) {
                    ppGAzznNjZ5j6h.dDIMxZXP1V8HdM(this.w9sT1Swbhx3hs, RescheduleReceiver.class, false);
                }
                if (z) {
                    this.gmNWMfvn6zlEj.MLSIo1htfMPWeB8V876L(this.vekpFI4d1Nc4fakF, 1);
                    this.gmNWMfvn6zlEj.XiR1pIn5878vVWd(this.vekpFI4d1Nc4fakF, this.MLSIo1htfMPWeB8V876L);
                    this.gmNWMfvn6zlEj.wotphlvK9sPbXJ(-1L, this.vekpFI4d1Nc4fakF);
                }
                this.hjneShqpF9Tis4.wotphlvK9sPbXJ();
                this.hjneShqpF9Tis4.D5P1xCAyuvgF();
                this.nQilHWaqS401ZtR.pyu8ovAipBTLYAiKab(Boolean.valueOf(z));
            } catch (Throwable th) {
                cursorGmNWMfvn6zlEj.close();
                ez6sozeos7kkqzccqforD5P1xCAyuvgF.hjneShqpF9Tis4();
                throw th;
            }
        } catch (Throwable th2) {
            this.hjneShqpF9Tis4.D5P1xCAyuvgF();
            throw th2;
        }
    }

    public final void JXn4Qf7zpnLjP5() {
        String str = this.vekpFI4d1Nc4fakF;
        nLrxl2ExJj45rGBsZNLQ nlrxl2exjj45rgbsznlq = this.gmNWMfvn6zlEj;
        WorkDatabase workDatabase = this.hjneShqpF9Tis4;
        workDatabase.vekpFI4d1Nc4fakF();
        try {
            this.pyu8ovAipBTLYAiKab.getClass();
            nlrxl2exjj45rgbsznlq.nQilHWaqS401ZtR(System.currentTimeMillis(), str);
            WorkDatabase_Impl workDatabase_Impl = nlrxl2exjj45rgbsznlq.dDIMxZXP1V8HdM;
            nlrxl2exjj45rgbsznlq.MLSIo1htfMPWeB8V876L(str, 1);
            workDatabase_Impl.w9sT1Swbhx3hs();
            wrjXKFWxtWGPk22 wrjxkfwxtwgpk22 = nlrxl2exjj45rgbsznlq.hjneShqpF9Tis4;
            IvGcaSCdlPOakpJ6v ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM = wrjxkfwxtwgpk22.dDIMxZXP1V8HdM();
            if (str == null) {
                ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM.xDyLpEZyrcKVe0(1);
            } else {
                ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM.MLSIo1htfMPWeB8V876L(str, 1);
            }
            workDatabase_Impl.vekpFI4d1Nc4fakF();
            try {
                ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM.dDIMxZXP1V8HdM();
                workDatabase_Impl.wotphlvK9sPbXJ();
                workDatabase_Impl.D5P1xCAyuvgF();
                wrjxkfwxtwgpk22.gIIiyi2ddlMDR0(ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM);
                nlrxl2exjj45rgbsznlq.Qrz92kRPw4GcghAc(str, this.JXn4Qf7zpnLjP5.l1V0lQr6TbwNKqHfXNbb);
                workDatabase_Impl.w9sT1Swbhx3hs();
                wrjXKFWxtWGPk22 wrjxkfwxtwgpk23 = nlrxl2exjj45rgbsznlq.ibVTtJUNfrGYbW;
                IvGcaSCdlPOakpJ6v ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM2 = wrjxkfwxtwgpk23.dDIMxZXP1V8HdM();
                if (str == null) {
                    ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM2.xDyLpEZyrcKVe0(1);
                } else {
                    ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM2.MLSIo1htfMPWeB8V876L(str, 1);
                }
                workDatabase_Impl.vekpFI4d1Nc4fakF();
                try {
                    ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM2.dDIMxZXP1V8HdM();
                    workDatabase_Impl.wotphlvK9sPbXJ();
                    workDatabase_Impl.D5P1xCAyuvgF();
                    wrjxkfwxtwgpk23.gIIiyi2ddlMDR0(ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM2);
                    nlrxl2exjj45rgbsznlq.wotphlvK9sPbXJ(-1L, str);
                    workDatabase.wotphlvK9sPbXJ();
                    workDatabase.D5P1xCAyuvgF();
                    Ee8d2j4S9Vm5yGuR(false);
                } catch (Throwable th) {
                    workDatabase_Impl.D5P1xCAyuvgF();
                    wrjxkfwxtwgpk23.gIIiyi2ddlMDR0(ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM2);
                    throw th;
                }
            } catch (Throwable th2) {
                workDatabase_Impl.D5P1xCAyuvgF();
                wrjxkfwxtwgpk22.gIIiyi2ddlMDR0(ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM);
                throw th2;
            }
        } catch (Throwable th3) {
            workDatabase.D5P1xCAyuvgF();
            Ee8d2j4S9Vm5yGuR(false);
            throw th3;
        }
    }

    public final boolean b1EoSIRjJHO5() {
        if (this.MLSIo1htfMPWeB8V876L == -256) {
            return false;
        }
        fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
        int iD5P1xCAyuvgF = this.gmNWMfvn6zlEj.D5P1xCAyuvgF(this.vekpFI4d1Nc4fakF);
        if (iD5P1xCAyuvgF == 0) {
            Ee8d2j4S9Vm5yGuR(false);
            return true;
        }
        Ee8d2j4S9Vm5yGuR(!Y9mRyRdkl5FOcwb66V6.dDIMxZXP1V8HdM(iD5P1xCAyuvgF));
        return true;
    }

    public final void dDIMxZXP1V8HdM(MdvPnR06eW9Un0O mdvPnR06eW9Un0O) {
        boolean z = mdvPnR06eW9Un0O instanceof usXe12lhWsuJbBd0Y;
        sFdNPiaH9eT4T sfdnpiah9et4t = this.JXn4Qf7zpnLjP5;
        if (!z) {
            if (mdvPnR06eW9Un0O instanceof di1l5OJ60eKNOgQR8yCS) {
                fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
                vekpFI4d1Nc4fakF();
                return;
            }
            fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
            if (sfdnpiah9et4t.JXn4Qf7zpnLjP5()) {
                JXn4Qf7zpnLjP5();
                return;
            } else {
                ibVTtJUNfrGYbW();
                return;
            }
        }
        fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
        if (sfdnpiah9et4t.JXn4Qf7zpnLjP5()) {
            JXn4Qf7zpnLjP5();
            return;
        }
        Hnsrhf2jJV8dCt hnsrhf2jJV8dCt = this.gIIiyi2ddlMDR0;
        String str = this.vekpFI4d1Nc4fakF;
        nLrxl2ExJj45rGBsZNLQ nlrxl2exjj45rgbsznlq = this.gmNWMfvn6zlEj;
        WorkDatabase workDatabase = this.hjneShqpF9Tis4;
        workDatabase.vekpFI4d1Nc4fakF();
        try {
            nlrxl2exjj45rgbsznlq.MLSIo1htfMPWeB8V876L(str, 3);
            nlrxl2exjj45rgbsznlq.J0zjQ7CAgohuxU20eCW6(str, ((usXe12lhWsuJbBd0Y) this.ibVTtJUNfrGYbW).dDIMxZXP1V8HdM);
            this.pyu8ovAipBTLYAiKab.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            ArrayList arrayListEe8d2j4S9Vm5yGuR = hnsrhf2jJV8dCt.Ee8d2j4S9Vm5yGuR(str);
            int size = arrayListEe8d2j4S9Vm5yGuR.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListEe8d2j4S9Vm5yGuR.get(i);
                i++;
                String str2 = (String) obj;
                if (nlrxl2exjj45rgbsznlq.D5P1xCAyuvgF(str2) == 5) {
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) hnsrhf2jJV8dCt.w9sT1Swbhx3hs;
                    eZ6soZeOs7kkqZcCQFOR ez6sozeos7kkqzccqforD5P1xCAyuvgF = eZ6soZeOs7kkqZcCQFOR.D5P1xCAyuvgF("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
                    if (str2 == null) {
                        ez6sozeos7kkqzccqforD5P1xCAyuvgF.xDyLpEZyrcKVe0(1);
                    } else {
                        ez6sozeos7kkqzccqforD5P1xCAyuvgF.MLSIo1htfMPWeB8V876L(str2, 1);
                    }
                    workDatabase_Impl.w9sT1Swbhx3hs();
                    Cursor cursorGmNWMfvn6zlEj = workDatabase_Impl.gmNWMfvn6zlEj(ez6sozeos7kkqzccqforD5P1xCAyuvgF);
                    try {
                        boolean z2 = cursorGmNWMfvn6zlEj.moveToFirst() && cursorGmNWMfvn6zlEj.getInt(0) != 0;
                        cursorGmNWMfvn6zlEj.close();
                        ez6sozeos7kkqzccqforD5P1xCAyuvgF.hjneShqpF9Tis4();
                        if (z2) {
                            fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
                            nlrxl2exjj45rgbsznlq.MLSIo1htfMPWeB8V876L(str2, 1);
                            nlrxl2exjj45rgbsznlq.nQilHWaqS401ZtR(jCurrentTimeMillis, str2);
                        }
                    } catch (Throwable th) {
                        cursorGmNWMfvn6zlEj.close();
                        ez6sozeos7kkqzccqforD5P1xCAyuvgF.hjneShqpF9Tis4();
                        throw th;
                    }
                }
            }
            workDatabase.wotphlvK9sPbXJ();
            workDatabase.D5P1xCAyuvgF();
            Ee8d2j4S9Vm5yGuR(false);
        } catch (Throwable th2) {
            workDatabase.D5P1xCAyuvgF();
            Ee8d2j4S9Vm5yGuR(false);
            throw th2;
        }
    }

    public final void ibVTtJUNfrGYbW() {
        String str = this.vekpFI4d1Nc4fakF;
        WorkDatabase workDatabase = this.hjneShqpF9Tis4;
        workDatabase.vekpFI4d1Nc4fakF();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (true) {
                boolean zIsEmpty = linkedList.isEmpty();
                nLrxl2ExJj45rGBsZNLQ nlrxl2exjj45rgbsznlq = this.gmNWMfvn6zlEj;
                if (zIsEmpty) {
                    MnLRqMow83uotly4qYT mnLRqMow83uotly4qYT = ((zNadm2dnLHIyNeibE5) this.ibVTtJUNfrGYbW).dDIMxZXP1V8HdM;
                    nlrxl2exjj45rgbsznlq.Qrz92kRPw4GcghAc(str, this.JXn4Qf7zpnLjP5.l1V0lQr6TbwNKqHfXNbb);
                    nlrxl2exjj45rgbsznlq.J0zjQ7CAgohuxU20eCW6(str, mnLRqMow83uotly4qYT);
                    workDatabase.wotphlvK9sPbXJ();
                    return;
                }
                String str2 = (String) linkedList.remove();
                if (nlrxl2exjj45rgbsznlq.D5P1xCAyuvgF(str2) != 6) {
                    nlrxl2exjj45rgbsznlq.MLSIo1htfMPWeB8V876L(str2, 4);
                }
                linkedList.addAll(this.gIIiyi2ddlMDR0.Ee8d2j4S9Vm5yGuR(str2));
            }
        } finally {
            workDatabase.D5P1xCAyuvgF();
            Ee8d2j4S9Vm5yGuR(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0087 A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:13:0x0059, B:16:0x0061, B:21:0x0075, B:23:0x007b, B:34:0x00aa, B:29:0x0087, B:31:0x0099), top: B:101:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0099 A[Catch: all -> 0x0072, TRY_LEAVE, TryCatch #0 {all -> 0x0072, blocks: (B:13:0x0059, B:16:0x0061, B:21:0x0075, B:23:0x007b, B:34:0x00aa, B:29:0x0087, B:31:0x0099), top: B:101:0x0059 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [v.s.B2htgWMZxsdry, v.s.eZ6soZeOs7kkqZcCQFOR] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r21v0, types: [java.lang.Object, v.s.E9ubbQbrd21H0Yk4] */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r8v3, types: [v.s.HjYi3nnbLmeB1CrY5tes, v.s.wrjXKFWxtWGPk22] */
    /* JADX WARN: Type inference failed for: r9v3, types: [v.s.IvGcaSCdlPOakpJ6v, v.s.SFSz9tfWEAQo] */
    /* JADX WARN: Type inference failed for: r9v4, types: [androidx.work.impl.WorkDatabase, androidx.work.impl.WorkDatabase_Impl] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r16;
        fmRvx7qJQwJVK fmrvx7qjqwjvk;
        StringBuilder sb = new StringBuilder("Work [ id=");
        String str = this.vekpFI4d1Nc4fakF;
        sb.append(str);
        sb.append(", tags={ ");
        ArrayList arrayList = this.wotphlvK9sPbXJ;
        int size = arrayList.size();
        ?? r6 = 37 - 36;
        int i = 0;
        ?? r7 = r6;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str2 = (String) obj;
            if (r7 != 0) {
                r7 = 0;
            } else {
                sb.append(", ");
            }
            sb.append(str2);
            r7 = r7;
        }
        sb.append(" } ]");
        this.Qrz92kRPw4GcghAc = sb.toString();
        sFdNPiaH9eT4T sfdnpiah9et4t = this.JXn4Qf7zpnLjP5;
        if (b1EoSIRjJHO5()) {
            return;
        }
        WorkDatabase workDatabase = this.hjneShqpF9Tis4;
        workDatabase.vekpFI4d1Nc4fakF();
        try {
            int i2 = sfdnpiah9et4t.w9sT1Swbhx3hs;
            int i3 = sfdnpiah9et4t.hjneShqpF9Tis4;
            MnLRqMow83uotly4qYT mnLRqMow83uotly4qYTDDIMxZXP1V8HdM = sfdnpiah9et4t.Ee8d2j4S9Vm5yGuR;
            if (i2 != r6) {
                xDyLpEZyrcKVe0();
                workDatabase.wotphlvK9sPbXJ();
                fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
                workDatabase.D5P1xCAyuvgF();
                return;
            }
            if (sfdnpiah9et4t.JXn4Qf7zpnLjP5()) {
                this.pyu8ovAipBTLYAiKab.getClass();
                if (System.currentTimeMillis() < sfdnpiah9et4t.dDIMxZXP1V8HdM()) {
                    fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
                    Ee8d2j4S9Vm5yGuR(r6);
                    workDatabase.wotphlvK9sPbXJ();
                    workDatabase.D5P1xCAyuvgF();
                    return;
                }
            } else {
                if (((sfdnpiah9et4t.w9sT1Swbhx3hs != r6 || i3 <= 0) ? 0 : r6) != 0) {
                    this.pyu8ovAipBTLYAiKab.getClass();
                    if (System.currentTimeMillis() < sfdnpiah9et4t.dDIMxZXP1V8HdM()) {
                        fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
                        Ee8d2j4S9Vm5yGuR(r6);
                        workDatabase.wotphlvK9sPbXJ();
                        workDatabase.D5P1xCAyuvgF();
                        return;
                    }
                }
            }
            workDatabase.wotphlvK9sPbXJ();
            workDatabase.D5P1xCAyuvgF();
            boolean zJXn4Qf7zpnLjP5 = sfdnpiah9et4t.JXn4Qf7zpnLjP5();
            nLrxl2ExJj45rGBsZNLQ nlrxl2exjj45rgbsznlq = this.gmNWMfvn6zlEj;
            eDfRIe8Yxow8 edfrie8yxow8 = this.b1EoSIRjJHO5;
            if (!zJXn4Qf7zpnLjP5) {
                fadfsJa4iEdiwEC4Xm8 fadfsja4iediwec4xm8 = (fadfsJa4iEdiwEC4Xm8) edfrie8yxow8.b1EoSIRjJHO5;
                String str3 = sfdnpiah9et4t.JXn4Qf7zpnLjP5;
                fadfsja4iediwec4xm8.getClass();
                int i4 = ZiDgHGgEJjhRgYD12OEP.dDIMxZXP1V8HdM;
                try {
                    fmrvx7qjqwjvk = (fmRvx7qJQwJVK) Class.forName(str3).getDeclaredConstructor(null).newInstance(null);
                } catch (Exception unused) {
                    fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
                    fmrvx7qjqwjvk = null;
                }
                if (fmrvx7qjqwjvk == null) {
                    fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
                    ibVTtJUNfrGYbW();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(mnLRqMow83uotly4qYTDDIMxZXP1V8HdM);
                ?? r9 = nlrxl2exjj45rgbsznlq.dDIMxZXP1V8HdM;
                ?? D5P1xCAyuvgF = eZ6soZeOs7kkqZcCQFOR.D5P1xCAyuvgF("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", r6);
                if (str == null) {
                    D5P1xCAyuvgF.xDyLpEZyrcKVe0(r6);
                } else {
                    D5P1xCAyuvgF.MLSIo1htfMPWeB8V876L(str, r6);
                }
                r9.w9sT1Swbhx3hs();
                Cursor cursorGmNWMfvn6zlEj = r9.gmNWMfvn6zlEj(D5P1xCAyuvgF);
                try {
                    ArrayList arrayList3 = new ArrayList(cursorGmNWMfvn6zlEj.getCount());
                    while (cursorGmNWMfvn6zlEj.moveToNext()) {
                        arrayList3.add(MnLRqMow83uotly4qYT.dDIMxZXP1V8HdM(cursorGmNWMfvn6zlEj.isNull(0) ? null : cursorGmNWMfvn6zlEj.getBlob(0)));
                    }
                    cursorGmNWMfvn6zlEj.close();
                    D5P1xCAyuvgF.hjneShqpF9Tis4();
                    arrayList2.addAll(arrayList3);
                    mnLRqMow83uotly4qYTDDIMxZXP1V8HdM = fmrvx7qjqwjvk.dDIMxZXP1V8HdM(arrayList2);
                } catch (Throwable th) {
                    cursorGmNWMfvn6zlEj.close();
                    D5P1xCAyuvgF.hjneShqpF9Tis4();
                    throw th;
                }
            }
            UUID uuidFromString = UUID.fromString(str);
            ExecutorService executorService = (ExecutorService) edfrie8yxow8.JXn4Qf7zpnLjP5;
            CnoOvV7IQM0UcSfbVg cnoOvV7IQM0UcSfbVg = (CnoOvV7IQM0UcSfbVg) edfrie8yxow8.ibVTtJUNfrGYbW;
            DP5sXJhndWh8c4VkCzdA dP5sXJhndWh8c4VkCzdA = this.D5P1xCAyuvgF;
            fUH025aw0Rgl fuh025aw0rgl = this.xDyLpEZyrcKVe0;
            xdpm5SYr3bAV0rTS6 xdpm5syr3bav0rts6 = new xdpm5SYr3bAV0rTS6(workDatabase, dP5sXJhndWh8c4VkCzdA, fuh025aw0rgl);
            WorkerParameters workerParameters = new WorkerParameters();
            workerParameters.dDIMxZXP1V8HdM = uuidFromString;
            workerParameters.w9sT1Swbhx3hs = mnLRqMow83uotly4qYTDDIMxZXP1V8HdM;
            new HashSet(arrayList);
            workerParameters.vekpFI4d1Nc4fakF = i3;
            workerParameters.JXn4Qf7zpnLjP5 = executorService;
            workerParameters.Ee8d2j4S9Vm5yGuR = fuh025aw0rgl;
            workerParameters.xDyLpEZyrcKVe0 = cnoOvV7IQM0UcSfbVg;
            if (this.Ee8d2j4S9Vm5yGuR == null) {
                String str4 = sfdnpiah9et4t.vekpFI4d1Nc4fakF;
                cnoOvV7IQM0UcSfbVg.getClass();
                this.Ee8d2j4S9Vm5yGuR = CnoOvV7IQM0UcSfbVg.dDIMxZXP1V8HdM(this.w9sT1Swbhx3hs, str4, workerParameters);
            }
            Qa4pJoqqkp7u qa4pJoqqkp7u = this.Ee8d2j4S9Vm5yGuR;
            if (qa4pJoqqkp7u == null) {
                fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
                ibVTtJUNfrGYbW();
                return;
            }
            if (qa4pJoqqkp7u.JXn4Qf7zpnLjP5) {
                fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
                ibVTtJUNfrGYbW();
                return;
            }
            qa4pJoqqkp7u.JXn4Qf7zpnLjP5 = r6;
            workDatabase.vekpFI4d1Nc4fakF();
            try {
                if (nlrxl2exjj45rgbsznlq.D5P1xCAyuvgF(str) == r6) {
                    nlrxl2exjj45rgbsznlq.MLSIo1htfMPWeB8V876L(str, 2);
                    WorkDatabase_Impl workDatabase_Impl = nlrxl2exjj45rgbsznlq.dDIMxZXP1V8HdM;
                    workDatabase_Impl.w9sT1Swbhx3hs();
                    ?? r8 = nlrxl2exjj45rgbsznlq.D5P1xCAyuvgF;
                    ?? DDIMxZXP1V8HdM = r8.dDIMxZXP1V8HdM();
                    if (str == null) {
                        DDIMxZXP1V8HdM.xDyLpEZyrcKVe0(r6);
                    } else {
                        DDIMxZXP1V8HdM.MLSIo1htfMPWeB8V876L(str, r6);
                    }
                    workDatabase_Impl.vekpFI4d1Nc4fakF();
                    try {
                        DDIMxZXP1V8HdM.dDIMxZXP1V8HdM();
                        workDatabase_Impl.wotphlvK9sPbXJ();
                        workDatabase_Impl.D5P1xCAyuvgF();
                        r8.gIIiyi2ddlMDR0(DDIMxZXP1V8HdM);
                        nlrxl2exjj45rgbsznlq.XiR1pIn5878vVWd(str, -256);
                        r16 = r6;
                    } catch (Throwable th2) {
                        workDatabase_Impl.D5P1xCAyuvgF();
                        r8.gIIiyi2ddlMDR0(DDIMxZXP1V8HdM);
                        throw th2;
                    }
                } else {
                    r16 = 0;
                }
                workDatabase.wotphlvK9sPbXJ();
                workDatabase.D5P1xCAyuvgF();
                if (r16 == 0) {
                    xDyLpEZyrcKVe0();
                    return;
                }
                if (b1EoSIRjJHO5()) {
                    return;
                }
                Nr9E0hIXnEbtttg4 nr9E0hIXnEbtttg4 = new Nr9E0hIXnEbtttg4(this.w9sT1Swbhx3hs, this.JXn4Qf7zpnLjP5, this.Ee8d2j4S9Vm5yGuR, xdpm5syr3bav0rts6, this.xDyLpEZyrcKVe0);
                ((Qxq4OCIomL3rf7RSR) fuh025aw0rgl.JXn4Qf7zpnLjP5).execute(nr9E0hIXnEbtttg4);
                Af6wX3D8R2iFhqxr af6wX3D8R2iFhqxr = nr9E0hIXnEbtttg4.w9sT1Swbhx3hs;
                A68NpXPqwTFos99nt a68NpXPqwTFos99nt = new A68NpXPqwTFos99nt(this, 26, af6wX3D8R2iFhqxr);
                S7iZMVp9ciczvGPfF s7iZMVp9ciczvGPfF = new S7iZMVp9ciczvGPfF(2);
                Af6wX3D8R2iFhqxr af6wX3D8R2iFhqxr2 = this.J0zjQ7CAgohuxU20eCW6;
                af6wX3D8R2iFhqxr2.dDIMxZXP1V8HdM(a68NpXPqwTFos99nt, s7iZMVp9ciczvGPfF);
                af6wX3D8R2iFhqxr.dDIMxZXP1V8HdM(new UubaJZRp66jTeLre(this, 10, af6wX3D8R2iFhqxr), (Qxq4OCIomL3rf7RSR) fuh025aw0rgl.JXn4Qf7zpnLjP5);
                af6wX3D8R2iFhqxr2.dDIMxZXP1V8HdM(new YqOiSVb2wSv9Lq63qb((E9ubbQbrd21H0Yk4) this, this.Qrz92kRPw4GcghAc), (NTq6GnI9WZIP8Nuz) fuh025aw0rgl.dDIMxZXP1V8HdM);
            } catch (Throwable th3) {
                workDatabase.D5P1xCAyuvgF();
                throw th3;
            }
        } catch (Throwable th4) {
            workDatabase.D5P1xCAyuvgF();
            throw th4;
        }
    }

    public final void vekpFI4d1Nc4fakF() {
        String str = this.vekpFI4d1Nc4fakF;
        nLrxl2ExJj45rGBsZNLQ nlrxl2exjj45rgbsznlq = this.gmNWMfvn6zlEj;
        WorkDatabase workDatabase = this.hjneShqpF9Tis4;
        workDatabase.vekpFI4d1Nc4fakF();
        try {
            nlrxl2exjj45rgbsznlq.MLSIo1htfMPWeB8V876L(str, 1);
            this.pyu8ovAipBTLYAiKab.getClass();
            nlrxl2exjj45rgbsznlq.nQilHWaqS401ZtR(System.currentTimeMillis(), str);
            nlrxl2exjj45rgbsznlq.Qrz92kRPw4GcghAc(str, this.JXn4Qf7zpnLjP5.l1V0lQr6TbwNKqHfXNbb);
            nlrxl2exjj45rgbsznlq.wotphlvK9sPbXJ(-1L, str);
            workDatabase.wotphlvK9sPbXJ();
        } finally {
            workDatabase.D5P1xCAyuvgF();
            Ee8d2j4S9Vm5yGuR(true);
        }
    }

    public final void w9sT1Swbhx3hs() {
        if (b1EoSIRjJHO5()) {
            return;
        }
        this.hjneShqpF9Tis4.vekpFI4d1Nc4fakF();
        try {
            int iD5P1xCAyuvgF = this.gmNWMfvn6zlEj.D5P1xCAyuvgF(this.vekpFI4d1Nc4fakF);
            this.hjneShqpF9Tis4.MLSIo1htfMPWeB8V876L().dDIMxZXP1V8HdM(this.vekpFI4d1Nc4fakF);
            if (iD5P1xCAyuvgF == 0) {
                Ee8d2j4S9Vm5yGuR(false);
            } else if (iD5P1xCAyuvgF == 2) {
                dDIMxZXP1V8HdM(this.ibVTtJUNfrGYbW);
            } else if (!Y9mRyRdkl5FOcwb66V6.dDIMxZXP1V8HdM(iD5P1xCAyuvgF)) {
                this.MLSIo1htfMPWeB8V876L = -512;
                vekpFI4d1Nc4fakF();
            }
            this.hjneShqpF9Tis4.wotphlvK9sPbXJ();
        } finally {
            this.hjneShqpF9Tis4.D5P1xCAyuvgF();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean, int] */
    public final void xDyLpEZyrcKVe0() {
        if (this.gmNWMfvn6zlEj.D5P1xCAyuvgF(this.vekpFI4d1Nc4fakF) == 2) {
            fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
            Ee8d2j4S9Vm5yGuR((-13) + 14);
        } else {
            fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
            Ee8d2j4S9Vm5yGuR(false);
        }
    }
}
