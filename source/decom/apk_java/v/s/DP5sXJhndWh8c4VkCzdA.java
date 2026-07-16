package v.s;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class DP5sXJhndWh8c4VkCzdA implements EPqa1arXoCTWIQdmEn {
    public final WorkDatabase Ee8d2j4S9Vm5yGuR;
    public final fUH025aw0Rgl JXn4Qf7zpnLjP5;
    public final eDfRIe8Yxow8 vekpFI4d1Nc4fakF;
    public final Context w9sT1Swbhx3hs;
    public final HashMap ibVTtJUNfrGYbW = new HashMap();
    public final HashMap xDyLpEZyrcKVe0 = new HashMap();
    public final HashSet pyu8ovAipBTLYAiKab = new HashSet();
    public final ArrayList D5P1xCAyuvgF = new ArrayList();
    public PowerManager.WakeLock dDIMxZXP1V8HdM = null;
    public final Object hjneShqpF9Tis4 = new Object();
    public final HashMap b1EoSIRjJHO5 = new HashMap();

    static {
        fEyMFFyOOvHURJ7To6L.wotphlvK9sPbXJ("Processor");
    }

    public DP5sXJhndWh8c4VkCzdA(Context context, eDfRIe8Yxow8 edfrie8yxow8, fUH025aw0Rgl fuh025aw0rgl, WorkDatabase workDatabase) {
        this.w9sT1Swbhx3hs = context;
        this.vekpFI4d1Nc4fakF = edfrie8yxow8;
        this.JXn4Qf7zpnLjP5 = fuh025aw0rgl;
        this.Ee8d2j4S9Vm5yGuR = workDatabase;
    }

    public static boolean JXn4Qf7zpnLjP5(E9ubbQbrd21H0Yk4 e9ubbQbrd21H0Yk4, int i) {
        if (e9ubbQbrd21H0Yk4 == null) {
            fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
            return false;
        }
        e9ubbQbrd21H0Yk4.MLSIo1htfMPWeB8V876L = i;
        e9ubbQbrd21H0Yk4.b1EoSIRjJHO5();
        e9ubbQbrd21H0Yk4.J0zjQ7CAgohuxU20eCW6.cancel(true);
        if (e9ubbQbrd21H0Yk4.Ee8d2j4S9Vm5yGuR == null || !(e9ubbQbrd21H0Yk4.J0zjQ7CAgohuxU20eCW6.w9sT1Swbhx3hs instanceof ibVTtJUNfrGYbW)) {
            Objects.toString(e9ubbQbrd21H0Yk4.JXn4Qf7zpnLjP5);
            fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
        } else {
            e9ubbQbrd21H0Yk4.Ee8d2j4S9Vm5yGuR.Ee8d2j4S9Vm5yGuR(i);
        }
        fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
        return true;
    }

    private static /* synthetic */ void lyrtqrc() {
    }

    public final boolean Ee8d2j4S9Vm5yGuR(String str) {
        boolean z;
        synchronized (this.hjneShqpF9Tis4) {
            z = vekpFI4d1Nc4fakF(str) != null;
        }
        return z;
    }

    public final boolean b1EoSIRjJHO5(r9c8qUHbkyLZi r9c8quhbkylzi, W6dfON4KdcdxlH w6dfON4KdcdxlH) {
        ebR1taU40KcOGClk ebr1tau40kcogclk = r9c8quhbkylzi.dDIMxZXP1V8HdM;
        String str = ebr1tau40kcogclk.dDIMxZXP1V8HdM;
        ArrayList arrayList = new ArrayList();
        sFdNPiaH9eT4T sfdnpiah9et4t = (sFdNPiaH9eT4T) this.Ee8d2j4S9Vm5yGuR.gIIiyi2ddlMDR0(new C5H5IAPDXXiG(this, arrayList, str, 1));
        if (sfdnpiah9et4t == null) {
            fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
            ebr1tau40kcogclk.toString();
            feymffyoovhurj7to6lPyu8ovAipBTLYAiKab.getClass();
            ((Qxq4OCIomL3rf7RSR) this.JXn4Qf7zpnLjP5.JXn4Qf7zpnLjP5).execute(new A68NpXPqwTFos99nt(this, 15, ebr1tau40kcogclk));
            return false;
        }
        synchronized (this.hjneShqpF9Tis4) {
            try {
                if (Ee8d2j4S9Vm5yGuR(str)) {
                    Set set = (Set) this.b1EoSIRjJHO5.get(str);
                    if (((r9c8qUHbkyLZi) set.iterator().next()).dDIMxZXP1V8HdM.w9sT1Swbhx3hs == ebr1tau40kcogclk.w9sT1Swbhx3hs) {
                        set.add(r9c8quhbkylzi);
                        fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab2 = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
                        ebr1tau40kcogclk.toString();
                        feymffyoovhurj7to6lPyu8ovAipBTLYAiKab2.getClass();
                    } else {
                        ((Qxq4OCIomL3rf7RSR) this.JXn4Qf7zpnLjP5.JXn4Qf7zpnLjP5).execute(new A68NpXPqwTFos99nt(this, 15, ebr1tau40kcogclk));
                    }
                    return false;
                }
                if (sfdnpiah9et4t.H9XlUr4OeMJFiXK != ebr1tau40kcogclk.w9sT1Swbhx3hs) {
                    ((Qxq4OCIomL3rf7RSR) this.JXn4Qf7zpnLjP5.JXn4Qf7zpnLjP5).execute(new A68NpXPqwTFos99nt(this, 15, ebr1tau40kcogclk));
                    return false;
                }
                Context context = this.w9sT1Swbhx3hs;
                eDfRIe8Yxow8 edfrie8yxow8 = this.vekpFI4d1Nc4fakF;
                fUH025aw0Rgl fuh025aw0rgl = this.JXn4Qf7zpnLjP5;
                WorkDatabase workDatabase = this.Ee8d2j4S9Vm5yGuR;
                NYXyLhuO3qlh84AKe52 nYXyLhuO3qlh84AKe52 = new NYXyLhuO3qlh84AKe52();
                new W6dfON4KdcdxlH();
                nYXyLhuO3qlh84AKe52.w9sT1Swbhx3hs = context.getApplicationContext();
                nYXyLhuO3qlh84AKe52.JXn4Qf7zpnLjP5 = fuh025aw0rgl;
                nYXyLhuO3qlh84AKe52.vekpFI4d1Nc4fakF = this;
                nYXyLhuO3qlh84AKe52.Ee8d2j4S9Vm5yGuR = edfrie8yxow8;
                nYXyLhuO3qlh84AKe52.xDyLpEZyrcKVe0 = workDatabase;
                nYXyLhuO3qlh84AKe52.ibVTtJUNfrGYbW = sfdnpiah9et4t;
                nYXyLhuO3qlh84AKe52.b1EoSIRjJHO5 = arrayList;
                E9ubbQbrd21H0Yk4 e9ubbQbrd21H0Yk4 = new E9ubbQbrd21H0Yk4(nYXyLhuO3qlh84AKe52);
                Af6wX3D8R2iFhqxr af6wX3D8R2iFhqxr = e9ubbQbrd21H0Yk4.nQilHWaqS401ZtR;
                af6wX3D8R2iFhqxr.dDIMxZXP1V8HdM(new BTOcbbE0oRvXzVh9(this, af6wX3D8R2iFhqxr, e9ubbQbrd21H0Yk4, 3), (Qxq4OCIomL3rf7RSR) this.JXn4Qf7zpnLjP5.JXn4Qf7zpnLjP5);
                this.ibVTtJUNfrGYbW.put(str, e9ubbQbrd21H0Yk4);
                HashSet hashSet = new HashSet();
                hashSet.add(r9c8quhbkylzi);
                this.b1EoSIRjJHO5.put(str, hashSet);
                ((NTq6GnI9WZIP8Nuz) this.JXn4Qf7zpnLjP5.dDIMxZXP1V8HdM).execute(e9ubbQbrd21H0Yk4);
                fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab3 = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
                ebr1tau40kcogclk.toString();
                feymffyoovhurj7to6lPyu8ovAipBTLYAiKab3.getClass();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void dDIMxZXP1V8HdM(tnAmGCFqcZm9axi tnamgcfqczm9axi) {
        synchronized (this.hjneShqpF9Tis4) {
            this.D5P1xCAyuvgF.add(tnamgcfqczm9axi);
        }
    }

    public final void ibVTtJUNfrGYbW(String str, BXrZf9mCiRhvBOt7P bXrZf9mCiRhvBOt7P) {
        synchronized (this.hjneShqpF9Tis4) {
            try {
                fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
                E9ubbQbrd21H0Yk4 e9ubbQbrd21H0Yk4 = (E9ubbQbrd21H0Yk4) this.ibVTtJUNfrGYbW.remove(str);
                if (e9ubbQbrd21H0Yk4 != null) {
                    if (this.dDIMxZXP1V8HdM == null) {
                        PowerManager.WakeLock wakeLockDDIMxZXP1V8HdM = BWybMLHPTAHr.dDIMxZXP1V8HdM(this.w9sT1Swbhx3hs, "ProcessorForegroundLck");
                        this.dDIMxZXP1V8HdM = wakeLockDDIMxZXP1V8HdM;
                        wakeLockDDIMxZXP1V8HdM.acquire();
                    }
                    this.xDyLpEZyrcKVe0.put(str, e9ubbQbrd21H0Yk4);
                    TrfNVrJ7zIgW2vJ.w9sT1Swbhx3hs(this.w9sT1Swbhx3hs, EM07nbnNqFdqQrkC.vekpFI4d1Nc4fakF(this.w9sT1Swbhx3hs, okc5AGRjqrud84oM6d.b1EoSIRjJHO5(e9ubbQbrd21H0Yk4.JXn4Qf7zpnLjP5), bXrZf9mCiRhvBOt7P));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final E9ubbQbrd21H0Yk4 vekpFI4d1Nc4fakF(String str) {
        E9ubbQbrd21H0Yk4 e9ubbQbrd21H0Yk4 = (E9ubbQbrd21H0Yk4) this.xDyLpEZyrcKVe0.get(str);
        return e9ubbQbrd21H0Yk4 == null ? (E9ubbQbrd21H0Yk4) this.ibVTtJUNfrGYbW.get(str) : e9ubbQbrd21H0Yk4;
    }

    public final E9ubbQbrd21H0Yk4 w9sT1Swbhx3hs(String str) {
        E9ubbQbrd21H0Yk4 e9ubbQbrd21H0Yk4 = (E9ubbQbrd21H0Yk4) this.xDyLpEZyrcKVe0.remove(str);
        boolean z = e9ubbQbrd21H0Yk4 != null;
        if (!z) {
            e9ubbQbrd21H0Yk4 = (E9ubbQbrd21H0Yk4) this.ibVTtJUNfrGYbW.remove(str);
        }
        this.b1EoSIRjJHO5.remove(str);
        if (z) {
            synchronized (this.hjneShqpF9Tis4) {
                try {
                    if (this.xDyLpEZyrcKVe0.isEmpty()) {
                        Context context = this.w9sT1Swbhx3hs;
                        int i = EM07nbnNqFdqQrkC.D5P1xCAyuvgF;
                        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                        intent.setAction("ACTION_STOP_FOREGROUND");
                        try {
                            this.w9sT1Swbhx3hs.startService(intent);
                        } catch (Throwable unused) {
                            fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
                        }
                        PowerManager.WakeLock wakeLock = this.dDIMxZXP1V8HdM;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.dDIMxZXP1V8HdM = null;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e9ubbQbrd21H0Yk4;
    }

    public final void xDyLpEZyrcKVe0(tnAmGCFqcZm9axi tnamgcfqczm9axi) {
        synchronized (this.hjneShqpF9Tis4) {
            this.D5P1xCAyuvgF.remove(tnamgcfqczm9axi);
        }
    }
}
