package v.s;

import android.content.Context;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class NYXyLhuO3qlh84AKe52 implements UPLbPDJGTcvz4zO, pARxL2hv3Xoc {
    public static final DQAp3IAySlIpLgRF pyu8ovAipBTLYAiKab = new DQAp3IAySlIpLgRF(0);
    public Object Ee8d2j4S9Vm5yGuR;
    public Object JXn4Qf7zpnLjP5;
    public Object b1EoSIRjJHO5;
    public Object ibVTtJUNfrGYbW;
    public Object vekpFI4d1Nc4fakF;
    public Object w9sT1Swbhx3hs;
    public Object xDyLpEZyrcKVe0;

    public ArrayList D5P1xCAyuvgF() {
        HashMap map = (HashMap) this.JXn4Qf7zpnLjP5;
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : ((HashMap) this.w9sT1Swbhx3hs).entrySet()) {
            FVxyDmZ6Vklq5C fVxyDmZ6Vklq5C = (FVxyDmZ6Vklq5C) entry.getKey();
            if (fVxyDmZ6Vklq5C.Ee8d2j4S9Vm5yGuR != 0) {
                zzxeBctTPcbuazkjVgh zzxebcttpcbuazkjvgh = (zzxeBctTPcbuazkjVgh) entry.getValue();
                for (QwPxr2jx1iGLmehgkv3g qwPxr2jx1iGLmehgkv3g : fVxyDmZ6Vklq5C.w9sT1Swbhx3hs) {
                    if (!map2.containsKey(qwPxr2jx1iGLmehgkv3g)) {
                        map2.put(qwPxr2jx1iGLmehgkv3g, new HashSet());
                    }
                    ((Set) map2.get(qwPxr2jx1iGLmehgkv3g)).add(zzxebcttpcbuazkjvgh);
                }
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (map.containsKey(entry2.getKey())) {
                NXbA14GPFColi8T nXbA14GPFColi8T = (NXbA14GPFColi8T) map.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new A68NpXPqwTFos99nt(nXbA14GPFColi8T, 2, (zzxeBctTPcbuazkjVgh) it.next()));
                }
            } else {
                QwPxr2jx1iGLmehgkv3g qwPxr2jx1iGLmehgkv3g2 = (QwPxr2jx1iGLmehgkv3g) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                NXbA14GPFColi8T nXbA14GPFColi8T2 = new NXbA14GPFColi8T();
                nXbA14GPFColi8T2.w9sT1Swbhx3hs = null;
                nXbA14GPFColi8T2.dDIMxZXP1V8HdM = Collections.newSetFromMap(new ConcurrentHashMap());
                nXbA14GPFColi8T2.dDIMxZXP1V8HdM.addAll(set);
                map.put(qwPxr2jx1iGLmehgkv3g2, nXbA14GPFColi8T2);
            }
        }
        return arrayList;
    }

    @Override // v.s.UPLbPDJGTcvz4zO
    public synchronized zzxeBctTPcbuazkjVgh Ee8d2j4S9Vm5yGuR(QwPxr2jx1iGLmehgkv3g qwPxr2jx1iGLmehgkv3g) {
        return (zzxeBctTPcbuazkjVgh) ((HashMap) this.vekpFI4d1Nc4fakF).get(qwPxr2jx1iGLmehgkv3g);
    }

    public void b1EoSIRjJHO5() {
        for (FVxyDmZ6Vklq5C fVxyDmZ6Vklq5C : ((HashMap) this.w9sT1Swbhx3hs).keySet()) {
            for (kha8vJMg5Bq7MuAMmONj kha8vjmg5bq7muammonj : fVxyDmZ6Vklq5C.vekpFI4d1Nc4fakF) {
                if (kha8vjmg5bq7muammonj.w9sT1Swbhx3hs == 2 && !((HashMap) this.JXn4Qf7zpnLjP5).containsKey(kha8vjmg5bq7muammonj.dDIMxZXP1V8HdM)) {
                    HashMap map = (HashMap) this.JXn4Qf7zpnLjP5;
                    QwPxr2jx1iGLmehgkv3g qwPxr2jx1iGLmehgkv3g = kha8vjmg5bq7muammonj.dDIMxZXP1V8HdM;
                    Set set = Collections.EMPTY_SET;
                    NXbA14GPFColi8T nXbA14GPFColi8T = new NXbA14GPFColi8T();
                    nXbA14GPFColi8T.w9sT1Swbhx3hs = null;
                    nXbA14GPFColi8T.dDIMxZXP1V8HdM = Collections.newSetFromMap(new ConcurrentHashMap());
                    nXbA14GPFColi8T.dDIMxZXP1V8HdM.addAll(set);
                    map.put(qwPxr2jx1iGLmehgkv3g, nXbA14GPFColi8T);
                } else if (((HashMap) this.vekpFI4d1Nc4fakF).containsKey(kha8vjmg5bq7muammonj.dDIMxZXP1V8HdM)) {
                    continue;
                } else {
                    int i = kha8vjmg5bq7muammonj.w9sT1Swbhx3hs;
                    if (i == 1) {
                        throw new Nu1RZytRZGiHqTFlrUmf("Unsatisfied dependency for component " + fVxyDmZ6Vklq5C + ": " + kha8vjmg5bq7muammonj.dDIMxZXP1V8HdM);
                    }
                    if (i != 2) {
                        HashMap map2 = (HashMap) this.vekpFI4d1Nc4fakF;
                        QwPxr2jx1iGLmehgkv3g qwPxr2jx1iGLmehgkv3g2 = kha8vjmg5bq7muammonj.dDIMxZXP1V8HdM;
                        UeVBYgBvSKYfVuXLhMs ueVBYgBvSKYfVuXLhMs = tXgalmBczDk7.vekpFI4d1Nc4fakF;
                        DQAp3IAySlIpLgRF dQAp3IAySlIpLgRF = tXgalmBczDk7.JXn4Qf7zpnLjP5;
                        tXgalmBczDk7 txgalmbczdk7 = new tXgalmBczDk7();
                        txgalmbczdk7.dDIMxZXP1V8HdM = ueVBYgBvSKYfVuXLhMs;
                        txgalmbczdk7.w9sT1Swbhx3hs = dQAp3IAySlIpLgRF;
                        map2.put(qwPxr2jx1iGLmehgkv3g2, txgalmbczdk7);
                    }
                }
            }
        }
    }

    @Override // v.s.RZKLDkRu6ZWDxTDL71X
    public Object get() {
        return new LutdQZ2I9fVx((Context) ((RZKLDkRu6ZWDxTDL71X) this.w9sT1Swbhx3hs).get(), (VxNS64aU1fc3I) ((RZKLDkRu6ZWDxTDL71X) this.vekpFI4d1Nc4fakF).get(), (qAHCZrfOx8WOS) ((RZKLDkRu6ZWDxTDL71X) this.JXn4Qf7zpnLjP5).get(), (eTeIZwLyooQrZ0ICI9i) ((UWYuX9UTvV9YpFO4TOW) this.Ee8d2j4S9Vm5yGuR).get(), (Executor) ((RZKLDkRu6ZWDxTDL71X) this.xDyLpEZyrcKVe0).get(), (WwqoyKhrbNp5qcng0CM) ((RZKLDkRu6ZWDxTDL71X) this.ibVTtJUNfrGYbW).get(), new fEyMFFyOOvHURJ7To6L(65 - 47), new fadfsJa4iEdiwEC4Xm8(17), (rR47ZPwFk6l5cadn8) ((RZKLDkRu6ZWDxTDL71X) this.b1EoSIRjJHO5).get());
    }

    public void ibVTtJUNfrGYbW(HashMap map, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            FVxyDmZ6Vklq5C fVxyDmZ6Vklq5C = (FVxyDmZ6Vklq5C) entry.getKey();
            zzxeBctTPcbuazkjVgh zzxebcttpcbuazkjvgh = (zzxeBctTPcbuazkjVgh) entry.getValue();
            int i = fVxyDmZ6Vklq5C.JXn4Qf7zpnLjP5;
            if (i == 1 || (i == 34 - 32 && z)) {
                zzxebcttpcbuazkjvgh.get();
            }
        }
        KkDKQuF0Y4jTwIefNU kkDKQuF0Y4jTwIefNU = (KkDKQuF0Y4jTwIefNU) this.xDyLpEZyrcKVe0;
        synchronized (kkDKQuF0Y4jTwIefNU) {
            try {
                arrayDeque = kkDKQuF0Y4jTwIefNU.w9sT1Swbhx3hs;
                if (arrayDeque != null) {
                    kkDKQuF0Y4jTwIefNU.w9sT1Swbhx3hs = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
    }

    public ArrayList pyu8ovAipBTLYAiKab(ArrayList arrayList) {
        HashMap map = (HashMap) this.vekpFI4d1Nc4fakF;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            FVxyDmZ6Vklq5C fVxyDmZ6Vklq5C = (FVxyDmZ6Vklq5C) obj;
            if (fVxyDmZ6Vklq5C.Ee8d2j4S9Vm5yGuR == 0) {
                zzxeBctTPcbuazkjVgh zzxebcttpcbuazkjvgh = (zzxeBctTPcbuazkjVgh) ((HashMap) this.w9sT1Swbhx3hs).get(fVxyDmZ6Vklq5C);
                for (QwPxr2jx1iGLmehgkv3g qwPxr2jx1iGLmehgkv3g : fVxyDmZ6Vklq5C.w9sT1Swbhx3hs) {
                    if (map.containsKey(qwPxr2jx1iGLmehgkv3g)) {
                        arrayList2.add(new A68NpXPqwTFos99nt((tXgalmBczDk7) ((zzxeBctTPcbuazkjVgh) map.get(qwPxr2jx1iGLmehgkv3g)), 1, zzxebcttpcbuazkjvgh));
                    } else {
                        map.put(qwPxr2jx1iGLmehgkv3g, zzxebcttpcbuazkjvgh);
                    }
                }
            }
        }
        return arrayList2;
    }

    @Override // v.s.UPLbPDJGTcvz4zO
    public synchronized zzxeBctTPcbuazkjVgh xDyLpEZyrcKVe0(QwPxr2jx1iGLmehgkv3g qwPxr2jx1iGLmehgkv3g) {
        NXbA14GPFColi8T nXbA14GPFColi8T = (NXbA14GPFColi8T) ((HashMap) this.JXn4Qf7zpnLjP5).get(qwPxr2jx1iGLmehgkv3g);
        if (nXbA14GPFColi8T != null) {
            return nXbA14GPFColi8T;
        }
        return pyu8ovAipBTLYAiKab;
    }
}
