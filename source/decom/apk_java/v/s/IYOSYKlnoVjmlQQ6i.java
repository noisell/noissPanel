package v.s;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class IYOSYKlnoVjmlQQ6i implements IaJdiuw5vdcTDn7, d7yjIEB02ZavJfb7Dt, tnAmGCFqcZm9axi {
    public boolean JXn4Qf7zpnLjP5;
    public final Hnsrhf2jJV8dCt b1EoSIRjJHO5;
    public final Context dDIMxZXP1V8HdM;
    public final fUH025aw0Rgl gIIiyi2ddlMDR0;
    public final r5XEUfod5GSCCwq6c gmNWMfvn6zlEj;
    public Boolean hjneShqpF9Tis4;
    public final DP5sXJhndWh8c4VkCzdA ibVTtJUNfrGYbW;
    public final eDfRIe8Yxow8 pyu8ovAipBTLYAiKab;
    public final QMoqX3tAmVfMqM vekpFI4d1Nc4fakF;
    public final qvETFuMLonqpu4xIWtWA wotphlvK9sPbXJ;
    public final HashMap w9sT1Swbhx3hs = new HashMap();
    public final Object Ee8d2j4S9Vm5yGuR = new Object();
    public final icsq4nzWNlK1KIU2Hp xDyLpEZyrcKVe0 = new icsq4nzWNlK1KIU2Hp(5);
    public final HashMap D5P1xCAyuvgF = new HashMap();

    static {
        fEyMFFyOOvHURJ7To6L.wotphlvK9sPbXJ("GreedyScheduler");
    }

    public IYOSYKlnoVjmlQQ6i(Context context, eDfRIe8Yxow8 edfrie8yxow8, mYrXZiFjFW2Xg myrxzifjfw2xg, DP5sXJhndWh8c4VkCzdA dP5sXJhndWh8c4VkCzdA, Hnsrhf2jJV8dCt hnsrhf2jJV8dCt, fUH025aw0Rgl fuh025aw0rgl) {
        this.dDIMxZXP1V8HdM = context;
        r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c = (r5XEUfod5GSCCwq6c) edfrie8yxow8.pyu8ovAipBTLYAiKab;
        this.vekpFI4d1Nc4fakF = new QMoqX3tAmVfMqM(this, r5xeufod5gsccwq6c, (fEyMFFyOOvHURJ7To6L) edfrie8yxow8.xDyLpEZyrcKVe0);
        this.wotphlvK9sPbXJ = new qvETFuMLonqpu4xIWtWA(r5xeufod5gsccwq6c, hnsrhf2jJV8dCt);
        this.gIIiyi2ddlMDR0 = fuh025aw0rgl;
        this.gmNWMfvn6zlEj = new r5XEUfod5GSCCwq6c(myrxzifjfw2xg);
        this.pyu8ovAipBTLYAiKab = edfrie8yxow8;
        this.ibVTtJUNfrGYbW = dP5sXJhndWh8c4VkCzdA;
        this.b1EoSIRjJHO5 = hnsrhf2jJV8dCt;
    }

    private static /* synthetic */ void xbccugz() {
    }

    @Override // v.s.IaJdiuw5vdcTDn7
    public final boolean Ee8d2j4S9Vm5yGuR() {
        return false;
    }

    @Override // v.s.tnAmGCFqcZm9axi
    public final void JXn4Qf7zpnLjP5(ebR1taU40KcOGClk ebr1tau40kcogclk, boolean z) {
        WGrwEyVqR28VYxamRhIg wGrwEyVqR28VYxamRhIg;
        r9c8qUHbkyLZi r9c8quhbkylziPyu8ovAipBTLYAiKab = this.xDyLpEZyrcKVe0.pyu8ovAipBTLYAiKab(ebr1tau40kcogclk);
        if (r9c8quhbkylziPyu8ovAipBTLYAiKab != null) {
            this.wotphlvK9sPbXJ.dDIMxZXP1V8HdM(r9c8quhbkylziPyu8ovAipBTLYAiKab);
        }
        synchronized (this.Ee8d2j4S9Vm5yGuR) {
            wGrwEyVqR28VYxamRhIg = (WGrwEyVqR28VYxamRhIg) this.w9sT1Swbhx3hs.remove(ebr1tau40kcogclk);
        }
        if (wGrwEyVqR28VYxamRhIg != null) {
            fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
            Objects.toString(ebr1tau40kcogclk);
            feymffyoovhurj7to6lPyu8ovAipBTLYAiKab.getClass();
            wGrwEyVqR28VYxamRhIg.vekpFI4d1Nc4fakF(null);
        }
        if (z) {
            return;
        }
        synchronized (this.Ee8d2j4S9Vm5yGuR) {
            this.D5P1xCAyuvgF.remove(ebr1tau40kcogclk);
        }
    }

    @Override // v.s.IaJdiuw5vdcTDn7
    public final void dDIMxZXP1V8HdM(String str) {
        Runnable runnable;
        if (this.hjneShqpF9Tis4 == null) {
            this.hjneShqpF9Tis4 = Boolean.valueOf(rSRPUo6m8jmdbQfXxQ.dDIMxZXP1V8HdM(this.dDIMxZXP1V8HdM));
        }
        if (!this.hjneShqpF9Tis4.booleanValue()) {
            fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
            return;
        }
        if (!this.JXn4Qf7zpnLjP5) {
            this.ibVTtJUNfrGYbW.dDIMxZXP1V8HdM(this);
            this.JXn4Qf7zpnLjP5 = true;
        }
        fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
        QMoqX3tAmVfMqM qMoqX3tAmVfMqM = this.vekpFI4d1Nc4fakF;
        if (qMoqX3tAmVfMqM != null && (runnable = (Runnable) qMoqX3tAmVfMqM.JXn4Qf7zpnLjP5.remove(str)) != null) {
            ((Handler) qMoqX3tAmVfMqM.w9sT1Swbhx3hs.vekpFI4d1Nc4fakF).removeCallbacks(runnable);
        }
        for (r9c8qUHbkyLZi r9c8quhbkylzi : this.xDyLpEZyrcKVe0.b1EoSIRjJHO5(str)) {
            this.wotphlvK9sPbXJ.dDIMxZXP1V8HdM(r9c8quhbkylzi);
            this.b1EoSIRjJHO5.D5P1xCAyuvgF(r9c8quhbkylzi, -512);
        }
    }

    @Override // v.s.IaJdiuw5vdcTDn7
    public final void vekpFI4d1Nc4fakF(sFdNPiaH9eT4T... sfdnpiah9et4tArr) {
        boolean zContainsKey;
        long jMax;
        boolean zContainsKey2;
        if (this.hjneShqpF9Tis4 == null) {
            this.hjneShqpF9Tis4 = Boolean.valueOf(rSRPUo6m8jmdbQfXxQ.dDIMxZXP1V8HdM(this.dDIMxZXP1V8HdM));
        }
        if (!this.hjneShqpF9Tis4.booleanValue()) {
            fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
            return;
        }
        if (!this.JXn4Qf7zpnLjP5) {
            this.ibVTtJUNfrGYbW.dDIMxZXP1V8HdM(this);
            this.JXn4Qf7zpnLjP5 = true;
        }
        HashSet<sFdNPiaH9eT4T> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (sFdNPiaH9eT4T sfdnpiah9et4t : sfdnpiah9et4tArr) {
            ebR1taU40KcOGClk ebr1tau40kcogclkB1EoSIRjJHO5 = okc5AGRjqrud84oM6d.b1EoSIRjJHO5(sfdnpiah9et4t);
            icsq4nzWNlK1KIU2Hp icsq4nzwnlk1kiu2hp = this.xDyLpEZyrcKVe0;
            synchronized (icsq4nzwnlk1kiu2hp.w9sT1Swbhx3hs) {
                zContainsKey = ((LinkedHashMap) icsq4nzwnlk1kiu2hp.vekpFI4d1Nc4fakF).containsKey(ebr1tau40kcogclkB1EoSIRjJHO5);
            }
            if (!zContainsKey) {
                synchronized (this.Ee8d2j4S9Vm5yGuR) {
                    try {
                        ebR1taU40KcOGClk ebr1tau40kcogclkB1EoSIRjJHO6 = okc5AGRjqrud84oM6d.b1EoSIRjJHO5(sfdnpiah9et4t);
                        lx5MkByTT0CYr49sc lx5mkbytt0cyr49sc = (lx5MkByTT0CYr49sc) this.D5P1xCAyuvgF.get(ebr1tau40kcogclkB1EoSIRjJHO6);
                        if (lx5mkbytt0cyr49sc == null) {
                            int i = sfdnpiah9et4t.hjneShqpF9Tis4;
                            ((fEyMFFyOOvHURJ7To6L) this.pyu8ovAipBTLYAiKab.xDyLpEZyrcKVe0).getClass();
                            lx5mkbytt0cyr49sc = new lx5MkByTT0CYr49sc(i, System.currentTimeMillis());
                            this.D5P1xCAyuvgF.put(ebr1tau40kcogclkB1EoSIRjJHO6, lx5mkbytt0cyr49sc);
                        }
                        jMax = (((long) Math.max((sfdnpiah9et4t.hjneShqpF9Tis4 - lx5mkbytt0cyr49sc.dDIMxZXP1V8HdM) - 5, 0)) * 30000) + lx5mkbytt0cyr49sc.w9sT1Swbhx3hs;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                long jMax2 = Math.max(sfdnpiah9et4t.dDIMxZXP1V8HdM(), jMax);
                ((fEyMFFyOOvHURJ7To6L) this.pyu8ovAipBTLYAiKab.xDyLpEZyrcKVe0).getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (sfdnpiah9et4t.w9sT1Swbhx3hs != 1) {
                    continue;
                } else if (jCurrentTimeMillis < jMax2) {
                    QMoqX3tAmVfMqM qMoqX3tAmVfMqM = this.vekpFI4d1Nc4fakF;
                    if (qMoqX3tAmVfMqM != null) {
                        r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c = qMoqX3tAmVfMqM.w9sT1Swbhx3hs;
                        HashMap map = qMoqX3tAmVfMqM.JXn4Qf7zpnLjP5;
                        Runnable runnable = (Runnable) map.remove(sfdnpiah9et4t.dDIMxZXP1V8HdM);
                        if (runnable != null) {
                            ((Handler) r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF).removeCallbacks(runnable);
                        }
                        UubaJZRp66jTeLre uubaJZRp66jTeLre = new UubaJZRp66jTeLre(qMoqX3tAmVfMqM, 0, sfdnpiah9et4t);
                        map.put(sfdnpiah9et4t.dDIMxZXP1V8HdM, uubaJZRp66jTeLre);
                        qMoqX3tAmVfMqM.vekpFI4d1Nc4fakF.getClass();
                        ((Handler) r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF).postDelayed(uubaJZRp66jTeLre, jMax2 - System.currentTimeMillis());
                    }
                } else if (sfdnpiah9et4t.vekpFI4d1Nc4fakF()) {
                    RdWywP7AQUqPn0G rdWywP7AQUqPn0G = sfdnpiah9et4t.D5P1xCAyuvgF;
                    if (rdWywP7AQUqPn0G.vekpFI4d1Nc4fakF) {
                        fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
                        sfdnpiah9et4t.toString();
                        feymffyoovhurj7to6lPyu8ovAipBTLYAiKab.getClass();
                    } else if (rdWywP7AQUqPn0G.b1EoSIRjJHO5.isEmpty()) {
                        hashSet.add(sfdnpiah9et4t);
                        hashSet2.add(sfdnpiah9et4t.dDIMxZXP1V8HdM);
                    } else {
                        fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab2 = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
                        sfdnpiah9et4t.toString();
                        feymffyoovhurj7to6lPyu8ovAipBTLYAiKab2.getClass();
                    }
                } else {
                    icsq4nzWNlK1KIU2Hp icsq4nzwnlk1kiu2hp2 = this.xDyLpEZyrcKVe0;
                    ebR1taU40KcOGClk ebr1tau40kcogclkB1EoSIRjJHO7 = okc5AGRjqrud84oM6d.b1EoSIRjJHO5(sfdnpiah9et4t);
                    synchronized (icsq4nzwnlk1kiu2hp2.w9sT1Swbhx3hs) {
                        zContainsKey2 = ((LinkedHashMap) icsq4nzwnlk1kiu2hp2.vekpFI4d1Nc4fakF).containsKey(ebr1tau40kcogclkB1EoSIRjJHO7);
                    }
                    if (!zContainsKey2) {
                        fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
                        r9c8qUHbkyLZi r9c8quhbkylziD5P1xCAyuvgF = this.xDyLpEZyrcKVe0.D5P1xCAyuvgF(okc5AGRjqrud84oM6d.b1EoSIRjJHO5(sfdnpiah9et4t));
                        this.wotphlvK9sPbXJ.w9sT1Swbhx3hs(r9c8quhbkylziD5P1xCAyuvgF);
                        this.b1EoSIRjJHO5.pyu8ovAipBTLYAiKab(r9c8quhbkylziD5P1xCAyuvgF, null);
                    }
                }
            }
        }
        synchronized (this.Ee8d2j4S9Vm5yGuR) {
            try {
                if (!hashSet.isEmpty()) {
                    TextUtils.join(",", hashSet2);
                    fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
                    for (sFdNPiaH9eT4T sfdnpiah9et4t2 : hashSet) {
                        ebR1taU40KcOGClk ebr1tau40kcogclkB1EoSIRjJHO8 = okc5AGRjqrud84oM6d.b1EoSIRjJHO5(sfdnpiah9et4t2);
                        if (!this.w9sT1Swbhx3hs.containsKey(ebr1tau40kcogclkB1EoSIRjJHO8)) {
                            this.w9sT1Swbhx3hs.put(ebr1tau40kcogclkB1EoSIRjJHO8, hYpmJoivns3nhcS6.dDIMxZXP1V8HdM(this.gmNWMfvn6zlEj, sfdnpiah9et4t2, (rPTA1zWZR3GTVlGPw) this.gIIiyi2ddlMDR0.w9sT1Swbhx3hs, this));
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // v.s.d7yjIEB02ZavJfb7Dt
    public final void w9sT1Swbhx3hs(sFdNPiaH9eT4T sfdnpiah9et4t, vLtzHklHcOmK17 vltzhklhcomk17) {
        boolean zContainsKey;
        Hnsrhf2jJV8dCt hnsrhf2jJV8dCt = this.b1EoSIRjJHO5;
        qvETFuMLonqpu4xIWtWA qvetfumlonqpu4xiwtwa = this.wotphlvK9sPbXJ;
        icsq4nzWNlK1KIU2Hp icsq4nzwnlk1kiu2hp = this.xDyLpEZyrcKVe0;
        ebR1taU40KcOGClk ebr1tau40kcogclkB1EoSIRjJHO5 = okc5AGRjqrud84oM6d.b1EoSIRjJHO5(sfdnpiah9et4t);
        if (!(vltzhklhcomk17 instanceof dlsaeknCx25iNrToq)) {
            fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
            ebr1tau40kcogclkB1EoSIRjJHO5.toString();
            feymffyoovhurj7to6lPyu8ovAipBTLYAiKab.getClass();
            r9c8qUHbkyLZi r9c8quhbkylziPyu8ovAipBTLYAiKab = icsq4nzwnlk1kiu2hp.pyu8ovAipBTLYAiKab(ebr1tau40kcogclkB1EoSIRjJHO5);
            if (r9c8quhbkylziPyu8ovAipBTLYAiKab != null) {
                qvetfumlonqpu4xiwtwa.dDIMxZXP1V8HdM(r9c8quhbkylziPyu8ovAipBTLYAiKab);
                hnsrhf2jJV8dCt.D5P1xCAyuvgF(r9c8quhbkylziPyu8ovAipBTLYAiKab, ((PmgYwiy2tMPByUG991) vltzhklhcomk17).dDIMxZXP1V8HdM);
                return;
            }
            return;
        }
        synchronized (icsq4nzwnlk1kiu2hp.w9sT1Swbhx3hs) {
            zContainsKey = ((LinkedHashMap) icsq4nzwnlk1kiu2hp.vekpFI4d1Nc4fakF).containsKey(ebr1tau40kcogclkB1EoSIRjJHO5);
        }
        if (zContainsKey) {
            return;
        }
        fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab2 = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
        ebr1tau40kcogclkB1EoSIRjJHO5.toString();
        feymffyoovhurj7to6lPyu8ovAipBTLYAiKab2.getClass();
        r9c8qUHbkyLZi r9c8quhbkylziD5P1xCAyuvgF = icsq4nzwnlk1kiu2hp.D5P1xCAyuvgF(ebr1tau40kcogclkB1EoSIRjJHO5);
        qvetfumlonqpu4xiwtwa.w9sT1Swbhx3hs(r9c8quhbkylziD5P1xCAyuvgF);
        hnsrhf2jJV8dCt.pyu8ovAipBTLYAiKab(r9c8quhbkylziD5P1xCAyuvgF, null);
    }
}
