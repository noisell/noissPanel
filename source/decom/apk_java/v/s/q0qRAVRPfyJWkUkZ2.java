package v.s;

import android.database.Cursor;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class q0qRAVRPfyJWkUkZ2 implements Runnable {
    public final icsq4nzWNlK1KIU2Hp vekpFI4d1Nc4fakF;
    public final bVJI6LA77fw3pJCMf w9sT1Swbhx3hs;

    static {
        fEyMFFyOOvHURJ7To6L.wotphlvK9sPbXJ("EnqueueRunnable");
    }

    public q0qRAVRPfyJWkUkZ2(bVJI6LA77fw3pJCMf bvji6la77fw3pjcmf, icsq4nzWNlK1KIU2Hp icsq4nzwnlk1kiu2hp) {
        this.w9sT1Swbhx3hs = bvji6la77fw3pjcmf;
        this.vekpFI4d1Nc4fakF = icsq4nzwnlk1kiu2hp;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0147  */
    /* JADX WARN: Code duplicated, block: B:70:0x014d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0150  */
    /* JADX WARN: Code duplicated, block: B:74:0x0157  */
    /* JADX WARN: Code duplicated, block: B:75:0x015a  */
    /* JADX WARN: Code duplicated, block: B:77:0x015d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0169  */
    /* JADX WARN: Code duplicated, block: B:96:0x01c3  */
    public static boolean dDIMxZXP1V8HdM(bVJI6LA77fw3pJCMf bvji6la77fw3pjcmf) {
        boolean z;
        boolean z2;
        boolean z3;
        List<GIUFlVOyGkYog> list;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int i;
        boolean z9;
        HashSet hashSetEWUjsTERgdPbSw3NNlN = bVJI6LA77fw3pJCMf.EWUjsTERgdPbSw3NNlN(bvji6la77fw3pjcmf);
        bIQtXpTQsEoGIf25Z biqtxptqseogif25z = bvji6la77fw3pjcmf.Ee8d2j4S9Vm5yGuR;
        List list2 = bvji6la77fw3pjcmf.b1EoSIRjJHO5;
        int i2 = 0;
        String[] strArr = (String[]) hashSetEWUjsTERgdPbSw3NNlN.toArray(new String[0]);
        String str = bvji6la77fw3pjcmf.xDyLpEZyrcKVe0;
        int i3 = bvji6la77fw3pjcmf.ibVTtJUNfrGYbW;
        ((fEyMFFyOOvHURJ7To6L) biqtxptqseogif25z.ibVTtJUNfrGYbW.xDyLpEZyrcKVe0).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabase = biqtxptqseogif25z.b1EoSIRjJHO5;
        boolean z10 = strArr != null && strArr.length > 0;
        if (z10) {
            int length = strArr.length;
            z2 = false;
            z3 = false;
            z = true;
            while (true) {
                if (i2 < length) {
                    sFdNPiaH9eT4T sfdnpiah9et4tGmNWMfvn6zlEj = workDatabase.XiR1pIn5878vVWd().gmNWMfvn6zlEj(strArr[i2]);
                    if (sfdnpiah9et4tGmNWMfvn6zlEj == null) {
                        fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
                    } else {
                        int i4 = sfdnpiah9et4tGmNWMfvn6zlEj.w9sT1Swbhx3hs;
                        z &= i4 == 3;
                        if (i4 == 4) {
                            z3 = true;
                        } else if (i4 == 6) {
                            z2 = true;
                        }
                        i2++;
                    }
                }
                z6 = false;
                bvji6la77fw3pjcmf.hjneShqpF9Tis4 = true;
                return z6;
            }
        }
        z = true;
        z2 = false;
        z3 = false;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        if (zIsEmpty || z10) {
            list = list2;
            z4 = zIsEmpty;
            z5 = false;
        } else {
            ArrayList arrayListGIIiyi2ddlMDR0 = workDatabase.XiR1pIn5878vVWd().gIIiyi2ddlMDR0(str);
            if (arrayListGIIiyi2ddlMDR0.isEmpty()) {
                list = list2;
                z4 = zIsEmpty;
            } else if (i3 == 3 || i3 == 4) {
                Hnsrhf2jJV8dCt hnsrhf2jJV8dCtXDyLpEZyrcKVe0 = workDatabase.xDyLpEZyrcKVe0();
                ArrayList arrayList = new ArrayList();
                int size = arrayListGIIiyi2ddlMDR0.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj = arrayListGIIiyi2ddlMDR0.get(i5);
                    i5++;
                    Xc1FQ2gtMD4wYN6jPv xc1FQ2gtMD4wYN6jPv = (Xc1FQ2gtMD4wYN6jPv) obj;
                    String str2 = xc1FQ2gtMD4wYN6jPv.dDIMxZXP1V8HdM;
                    List list3 = list2;
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) hnsrhf2jJV8dCtXDyLpEZyrcKVe0.w9sT1Swbhx3hs;
                    Hnsrhf2jJV8dCt hnsrhf2jJV8dCt = hnsrhf2jJV8dCtXDyLpEZyrcKVe0;
                    boolean z11 = zIsEmpty;
                    eZ6soZeOs7kkqZcCQFOR ez6sozeos7kkqzccqforD5P1xCAyuvgF = eZ6soZeOs7kkqZcCQFOR.D5P1xCAyuvgF("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
                    if (str2 == null) {
                        ez6sozeos7kkqzccqforD5P1xCAyuvgF.xDyLpEZyrcKVe0(1);
                    } else {
                        ez6sozeos7kkqzccqforD5P1xCAyuvgF.MLSIo1htfMPWeB8V876L(str2, 1);
                    }
                    workDatabase_Impl.w9sT1Swbhx3hs();
                    Cursor cursorGmNWMfvn6zlEj = workDatabase_Impl.gmNWMfvn6zlEj(ez6sozeos7kkqzccqforD5P1xCAyuvgF);
                    try {
                        if (cursorGmNWMfvn6zlEj.moveToFirst()) {
                            z7 = false;
                            if (cursorGmNWMfvn6zlEj.getInt(0) != 0) {
                                z8 = true;
                            }
                            cursorGmNWMfvn6zlEj.close();
                            ez6sozeos7kkqzccqforD5P1xCAyuvgF.hjneShqpF9Tis4();
                            if (z8) {
                                i = xc1FQ2gtMD4wYN6jPv.w9sT1Swbhx3hs;
                                if (i == 3) {
                                    z9 = true;
                                } else {
                                    z9 = z7;
                                }
                                boolean z12 = z & z9;
                                if (i == 4) {
                                    z3 = true;
                                } else if (i == 6) {
                                    z2 = true;
                                }
                                arrayList.add(xc1FQ2gtMD4wYN6jPv.dDIMxZXP1V8HdM);
                                z = z12;
                            }
                            list2 = list3;
                            hnsrhf2jJV8dCtXDyLpEZyrcKVe0 = hnsrhf2jJV8dCt;
                            zIsEmpty = z11;
                        } else {
                            z7 = false;
                        }
                        z8 = z7;
                        cursorGmNWMfvn6zlEj.close();
                        ez6sozeos7kkqzccqforD5P1xCAyuvgF.hjneShqpF9Tis4();
                        if (z8) {
                            i = xc1FQ2gtMD4wYN6jPv.w9sT1Swbhx3hs;
                            if (i == 3) {
                                z9 = true;
                            } else {
                                z9 = z7;
                            }
                            boolean z13 = z & z9;
                            if (i == 4) {
                                z3 = true;
                            } else if (i == 6) {
                                z2 = true;
                            }
                            arrayList.add(xc1FQ2gtMD4wYN6jPv.dDIMxZXP1V8HdM);
                            z = z13;
                        }
                        list2 = list3;
                        hnsrhf2jJV8dCtXDyLpEZyrcKVe0 = hnsrhf2jJV8dCt;
                        zIsEmpty = z11;
                    } catch (Throwable th) {
                        cursorGmNWMfvn6zlEj.close();
                        ez6sozeos7kkqzccqforD5P1xCAyuvgF.hjneShqpF9Tis4();
                        throw th;
                    }
                }
                list = list2;
                z4 = zIsEmpty;
                List list4 = arrayList;
                list4 = arrayList;
                if (i3 == 65 - 61 && (z2 || z3)) {
                    nLrxl2ExJj45rGBsZNLQ nlrxl2exjj45rgbsznlqXiR1pIn5878vVWd = workDatabase.XiR1pIn5878vVWd();
                    ArrayList arrayListGIIiyi2ddlMDR1 = nlrxl2exjj45rgbsznlqXiR1pIn5878vVWd.gIIiyi2ddlMDR0(str);
                    int size2 = arrayListGIIiyi2ddlMDR1.size();
                    int i6 = 0;
                    while (i6 < size2) {
                        Object obj2 = arrayListGIIiyi2ddlMDR1.get(i6);
                        i6++;
                        nlrxl2exjj45rgbsznlqXiR1pIn5878vVWd.vekpFI4d1Nc4fakF(((Xc1FQ2gtMD4wYN6jPv) obj2).dDIMxZXP1V8HdM);
                    }
                    z2 = false;
                    z3 = false;
                    list4 = Collections.EMPTY_LIST;
                }
                strArr = (String[]) list4.toArray(strArr);
                z10 = strArr.length > 0;
            } else {
                if (i3 == 2) {
                    int size3 = arrayListGIIiyi2ddlMDR0.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 < size3) {
                            Object obj3 = arrayListGIIiyi2ddlMDR0.get(i7);
                            i7++;
                            int i8 = ((Xc1FQ2gtMD4wYN6jPv) obj3).w9sT1Swbhx3hs;
                            if (i8 == 1 || i8 == 2) {
                                z6 = false;
                                bvji6la77fw3pjcmf.hjneShqpF9Tis4 = true;
                                return z6;
                            }
                        }
                    }
                }
                new KmvtszLNijaA5ajr0da(biqtxptqseogif25z, str, (-62) + 63).run();
                nLrxl2ExJj45rGBsZNLQ nlrxl2exjj45rgbsznlqXiR1pIn5878vVWd2 = workDatabase.XiR1pIn5878vVWd();
                int size4 = arrayListGIIiyi2ddlMDR0.size();
                int i9 = 0;
                while (i9 < size4) {
                    Object obj4 = arrayListGIIiyi2ddlMDR0.get(i9);
                    i9++;
                    nlrxl2exjj45rgbsznlqXiR1pIn5878vVWd2.vekpFI4d1Nc4fakF(((Xc1FQ2gtMD4wYN6jPv) obj4).dDIMxZXP1V8HdM);
                }
                list = list2;
                z4 = zIsEmpty;
                z5 = true;
            }
            z5 = false;
        }
        boolean z14 = z5;
        for (GIUFlVOyGkYog gIUFlVOyGkYog : list) {
            sFdNPiaH9eT4T sfdnpiah9et4t = gIUFlVOyGkYog.w9sT1Swbhx3hs;
            UUID uuid = gIUFlVOyGkYog.dDIMxZXP1V8HdM;
            if (!z10 || z) {
                sfdnpiah9et4t.wotphlvK9sPbXJ = jCurrentTimeMillis;
            } else if (z3) {
                sfdnpiah9et4t.w9sT1Swbhx3hs = 4;
            } else if (z2) {
                sfdnpiah9et4t.w9sT1Swbhx3hs = 6;
            } else {
                sfdnpiah9et4t.w9sT1Swbhx3hs = (-34) + 39;
            }
            if (sfdnpiah9et4t.w9sT1Swbhx3hs == 1) {
                z14 = true;
            }
            nLrxl2ExJj45rGBsZNLQ nlrxl2exjj45rgbsznlqXiR1pIn5878vVWd3 = workDatabase.XiR1pIn5878vVWd();
            WorkDatabase_Impl workDatabase_Impl2 = nlrxl2exjj45rgbsznlqXiR1pIn5878vVWd3.dDIMxZXP1V8HdM;
            workDatabase_Impl2.w9sT1Swbhx3hs();
            workDatabase_Impl2.vekpFI4d1Nc4fakF();
            try {
                nlrxl2exjj45rgbsznlqXiR1pIn5878vVWd3.w9sT1Swbhx3hs.nQilHWaqS401ZtR(sfdnpiah9et4t);
                workDatabase_Impl2.wotphlvK9sPbXJ();
                workDatabase_Impl2.D5P1xCAyuvgF();
                if (z10) {
                    for (String str3 : strArr) {
                        XQQxIUVSx3rRAR xQQxIUVSx3rRAR = new XQQxIUVSx3rRAR(uuid.toString(), str3);
                        Hnsrhf2jJV8dCt hnsrhf2jJV8dCtXDyLpEZyrcKVe1 = workDatabase.xDyLpEZyrcKVe0();
                        WorkDatabase_Impl workDatabase_Impl3 = (WorkDatabase_Impl) hnsrhf2jJV8dCtXDyLpEZyrcKVe1.w9sT1Swbhx3hs;
                        workDatabase_Impl3.w9sT1Swbhx3hs();
                        workDatabase_Impl3.vekpFI4d1Nc4fakF();
                        try {
                            ((LeKZUBhDBK6LgUr) hnsrhf2jJV8dCtXDyLpEZyrcKVe1.vekpFI4d1Nc4fakF).nQilHWaqS401ZtR(xQQxIUVSx3rRAR);
                            workDatabase_Impl3.wotphlvK9sPbXJ();
                            workDatabase_Impl3.D5P1xCAyuvgF();
                        } catch (Throwable th2) {
                            workDatabase_Impl3.D5P1xCAyuvgF();
                            throw th2;
                        }
                    }
                }
                workDatabase.H9XlUr4OeMJFiXK().JXn4Qf7zpnLjP5(uuid.toString(), gIUFlVOyGkYog.vekpFI4d1Nc4fakF);
                if (!z4) {
                    IXBvAqS2fpdIRK iXBvAqS2fpdIRKJ0zjQ7CAgohuxU20eCW6 = workDatabase.J0zjQ7CAgohuxU20eCW6();
                    PwqKbED7Qujyj8xQ pwqKbED7Qujyj8xQ = new PwqKbED7Qujyj8xQ(str, uuid.toString());
                    WorkDatabase_Impl workDatabase_Impl4 = (WorkDatabase_Impl) iXBvAqS2fpdIRKJ0zjQ7CAgohuxU20eCW6.w9sT1Swbhx3hs;
                    workDatabase_Impl4.w9sT1Swbhx3hs();
                    workDatabase_Impl4.vekpFI4d1Nc4fakF();
                    try {
                        ((LeKZUBhDBK6LgUr) iXBvAqS2fpdIRKJ0zjQ7CAgohuxU20eCW6.vekpFI4d1Nc4fakF).nQilHWaqS401ZtR(pwqKbED7Qujyj8xQ);
                        workDatabase_Impl4.wotphlvK9sPbXJ();
                        workDatabase_Impl4.D5P1xCAyuvgF();
                    } catch (Throwable th3) {
                        workDatabase_Impl4.D5P1xCAyuvgF();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                workDatabase_Impl2.D5P1xCAyuvgF();
                throw th4;
            }
        }
        z6 = z14;
        bvji6la77fw3pjcmf.hjneShqpF9Tis4 = true;
        return z6;
    }

    private static /* synthetic */ void owxmdumee() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        icsq4nzWNlK1KIU2Hp icsq4nzwnlk1kiu2hp = this.vekpFI4d1Nc4fakF;
        bVJI6LA77fw3pJCMf bvji6la77fw3pjcmf = this.w9sT1Swbhx3hs;
        bIQtXpTQsEoGIf25Z biqtxptqseogif25z = bvji6la77fw3pjcmf.Ee8d2j4S9Vm5yGuR;
        try {
            HashSet hashSet = new HashSet();
            hashSet.addAll(bvji6la77fw3pjcmf.pyu8ovAipBTLYAiKab);
            HashSet hashSetEWUjsTERgdPbSw3NNlN = bVJI6LA77fw3pJCMf.EWUjsTERgdPbSw3NNlN(bvji6la77fw3pjcmf);
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    hashSet.removeAll(bvji6la77fw3pjcmf.pyu8ovAipBTLYAiKab);
                    z = false;
                    break;
                } else if (hashSetEWUjsTERgdPbSw3NNlN.contains((String) it.next())) {
                    z = true;
                    break;
                }
            }
            if (z) {
                throw new IllegalStateException("WorkContinuation has cycles (" + bvji6la77fw3pjcmf + ")");
            }
            WorkDatabase workDatabase = biqtxptqseogif25z.b1EoSIRjJHO5;
            workDatabase.vekpFI4d1Nc4fakF();
            try {
                FZ1sl4mHq4J0hOEYC.xDyLpEZyrcKVe0(workDatabase, biqtxptqseogif25z.ibVTtJUNfrGYbW, bvji6la77fw3pjcmf);
                boolean zDDIMxZXP1V8HdM = dDIMxZXP1V8HdM(bvji6la77fw3pjcmf);
                workDatabase.wotphlvK9sPbXJ();
                workDatabase.D5P1xCAyuvgF();
                if (zDDIMxZXP1V8HdM) {
                    ppGAzznNjZ5j6h.dDIMxZXP1V8HdM(biqtxptqseogif25z.xDyLpEZyrcKVe0, RescheduleReceiver.class, true);
                    Qbw3oj5SB4rmsG0k8.w9sT1Swbhx3hs(biqtxptqseogif25z.ibVTtJUNfrGYbW, biqtxptqseogif25z.b1EoSIRjJHO5, biqtxptqseogif25z.D5P1xCAyuvgF);
                }
                icsq4nzwnlk1kiu2hp.JXn4Qf7zpnLjP5(icsq4nzWNlK1KIU2Hp.JXn4Qf7zpnLjP5);
            } catch (Throwable th) {
                workDatabase.D5P1xCAyuvgF();
                throw th;
            }
        } catch (Throwable th2) {
            icsq4nzwnlk1kiu2hp.JXn4Qf7zpnLjP5(new bb30I3udhbiUr0X08G6(th2));
        }
    }
}
