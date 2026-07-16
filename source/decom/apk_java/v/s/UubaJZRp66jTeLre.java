package v.s;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.work.Worker;
import app.mobilex.plus.services.SyncQYAdapter;
import app.mobilex.plus.util.TypefaceCache;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class UubaJZRp66jTeLre implements Runnable {
    public final Object JXn4Qf7zpnLjP5;
    public Object vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs;

    public /* synthetic */ UubaJZRp66jTeLre(int i, Object obj, Object obj2, boolean z) {
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = obj;
        this.JXn4Qf7zpnLjP5 = obj2;
    }

    private final void Ee8d2j4S9Vm5yGuR() {
        synchronized (((x5CIqN8F1vjSbVyt9vrp) this.JXn4Qf7zpnLjP5).JXn4Qf7zpnLjP5) {
            ((EedOwBpLU616tq0s0D) ((x5CIqN8F1vjSbVyt9vrp) this.JXn4Qf7zpnLjP5).Ee8d2j4S9Vm5yGuR).Ee8d2j4S9Vm5yGuR(((DfUmSWZwfhCUz) this.vekpFI4d1Nc4fakF).JXn4Qf7zpnLjP5());
        }
    }

    private final void JXn4Qf7zpnLjP5() {
        fuhSwJR8Sgz92H fuhswjr8sgz92h = (fuhSwJR8Sgz92H) this.vekpFI4d1Nc4fakF;
        int i = ((wx1uy9kWo2J3) this.JXn4Qf7zpnLjP5).dDIMxZXP1V8HdM;
        synchronized (fuhswjr8sgz92h) {
            wx1uy9kWo2J3 wx1uy9kwo2j3 = (wx1uy9kWo2J3) fuhswjr8sgz92h.Ee8d2j4S9Vm5yGuR.get(i);
            if (wx1uy9kwo2j3 != null) {
                fuhswjr8sgz92h.Ee8d2j4S9Vm5yGuR.remove(i);
                wx1uy9kwo2j3.w9sT1Swbhx3hs(new OYRwk007Mtyi("Timed out waiting for response", null));
                fuhswjr8sgz92h.vekpFI4d1Nc4fakF();
            }
        }
    }

    private final void dDIMxZXP1V8HdM() {
        sFdNPiaH9eT4T sfdnpiah9et4t;
        DP5sXJhndWh8c4VkCzdA dP5sXJhndWh8c4VkCzdA = ((EM07nbnNqFdqQrkC) this.JXn4Qf7zpnLjP5).dDIMxZXP1V8HdM.hjneShqpF9Tis4;
        String str = (String) this.vekpFI4d1Nc4fakF;
        synchronized (dP5sXJhndWh8c4VkCzdA.hjneShqpF9Tis4) {
            try {
                E9ubbQbrd21H0Yk4 e9ubbQbrd21H0Yk4VekpFI4d1Nc4fakF = dP5sXJhndWh8c4VkCzdA.vekpFI4d1Nc4fakF(str);
                sfdnpiah9et4t = e9ubbQbrd21H0Yk4VekpFI4d1Nc4fakF != null ? e9ubbQbrd21H0Yk4VekpFI4d1Nc4fakF.JXn4Qf7zpnLjP5 : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (sfdnpiah9et4t == null || !sfdnpiah9et4t.vekpFI4d1Nc4fakF()) {
            return;
        }
        synchronized (((EM07nbnNqFdqQrkC) this.JXn4Qf7zpnLjP5).vekpFI4d1Nc4fakF) {
            ((EM07nbnNqFdqQrkC) this.JXn4Qf7zpnLjP5).xDyLpEZyrcKVe0.put(okc5AGRjqrud84oM6d.b1EoSIRjJHO5(sfdnpiah9et4t), sfdnpiah9et4t);
            EM07nbnNqFdqQrkC eM07nbnNqFdqQrkC = (EM07nbnNqFdqQrkC) this.JXn4Qf7zpnLjP5;
            ((EM07nbnNqFdqQrkC) this.JXn4Qf7zpnLjP5).ibVTtJUNfrGYbW.put(okc5AGRjqrud84oM6d.b1EoSIRjJHO5(sfdnpiah9et4t), hYpmJoivns3nhcS6.dDIMxZXP1V8HdM(eM07nbnNqFdqQrkC.b1EoSIRjJHO5, sfdnpiah9et4t, (rPTA1zWZR3GTVlGPw) eM07nbnNqFdqQrkC.w9sT1Swbhx3hs.w9sT1Swbhx3hs, eM07nbnNqFdqQrkC));
        }
    }

    private final void vekpFI4d1Nc4fakF() {
        synchronized (((x5CIqN8F1vjSbVyt9vrp) this.JXn4Qf7zpnLjP5).JXn4Qf7zpnLjP5) {
            qEQ5trexEd2Ykvd qeq5trexed2ykvd = (qEQ5trexEd2Ykvd) ((x5CIqN8F1vjSbVyt9vrp) this.JXn4Qf7zpnLjP5).Ee8d2j4S9Vm5yGuR;
            Exception excVekpFI4d1Nc4fakF = ((DfUmSWZwfhCUz) this.vekpFI4d1Nc4fakF).vekpFI4d1Nc4fakF();
            SbxdZ6Kq2uhHQ5RPRqm.ibVTtJUNfrGYbW(excVekpFI4d1Nc4fakF);
            qeq5trexed2ykvd.vekpFI4d1Nc4fakF(excVekpFI4d1Nc4fakF);
        }
    }

    private final void w9sT1Swbhx3hs() {
        synchronized (((x5CIqN8F1vjSbVyt9vrp) this.JXn4Qf7zpnLjP5).JXn4Qf7zpnLjP5) {
            ((hYMmDgRUK0a6MaJzT) ((x5CIqN8F1vjSbVyt9vrp) this.JXn4Qf7zpnLjP5).Ee8d2j4S9Vm5yGuR).xDyLpEZyrcKVe0((DfUmSWZwfhCUz) this.vekpFI4d1Nc4fakF);
        }
    }

    private static /* synthetic */ void zqta() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        RWY6BVSB0XxPbw rWY6BVSB0XxPbw;
        W8OnGfuXen8U w8OnGfuXen8U;
        int i = 0;
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
                int i2 = QMoqX3tAmVfMqM.Ee8d2j4S9Vm5yGuR;
                sFdNPiaH9eT4T sfdnpiah9et4t = (sFdNPiaH9eT4T) this.vekpFI4d1Nc4fakF;
                feymffyoovhurj7to6lPyu8ovAipBTLYAiKab.getClass();
                ((QMoqX3tAmVfMqM) this.JXn4Qf7zpnLjP5).dDIMxZXP1V8HdM.vekpFI4d1Nc4fakF(sfdnpiah9et4t);
                return;
            case 1:
                ((hD886kxBkce8U) this.vekpFI4d1Nc4fakF).yTljMGnIibTRdOpSh4((zcffvBooRp7uR1q) this.JXn4Qf7zpnLjP5);
                return;
            case 2:
                aCFQrAetrLmSDBXZ acfqraetrlmsdbxz = (aCFQrAetrLmSDBXZ) this.JXn4Qf7zpnLjP5;
                do {
                    try {
                        ((Runnable) this.vekpFI4d1Nc4fakF).run();
                    } catch (Throwable th) {
                        okc5AGRjqrud84oM6d.hjneShqpF9Tis4(sNACkioAJERo.w9sT1Swbhx3hs, th);
                    }
                    Runnable runnableXfn2GJwmGqs7kWW = acfqraetrlmsdbxz.xfn2GJwmGqs7kWW();
                    if (runnableXfn2GJwmGqs7kWW == null) {
                        return;
                    }
                    this.vekpFI4d1Nc4fakF = runnableXfn2GJwmGqs7kWW;
                    i++;
                    break;
                } while (i < 16);
                VcXtsPqXIQefFtYUZ.vekpFI4d1Nc4fakF.vIJudZvPyTuNp(acfqraetrlmsdbxz, this);
                return;
            case 3:
                ((hD886kxBkce8U) this.JXn4Qf7zpnLjP5).yTljMGnIibTRdOpSh4((rPTA1zWZR3GTVlGPw) this.vekpFI4d1Nc4fakF);
                return;
            case 4:
                try {
                    xDyLpEZyrcKVe0();
                    return;
                } catch (Error e) {
                    synchronized (((jNtR9eeHNtQpa) this.JXn4Qf7zpnLjP5).vekpFI4d1Nc4fakF) {
                        ((jNtR9eeHNtQpa) this.JXn4Qf7zpnLjP5).JXn4Qf7zpnLjP5 = 1;
                        throw e;
                    }
                }
            case 5:
                try {
                    ((Runnable) this.JXn4Qf7zpnLjP5).run();
                    synchronized (((NTq6GnI9WZIP8Nuz) this.vekpFI4d1Nc4fakF).Ee8d2j4S9Vm5yGuR) {
                        ((NTq6GnI9WZIP8Nuz) this.vekpFI4d1Nc4fakF).dDIMxZXP1V8HdM();
                        break;
                    }
                    return;
                } catch (Throwable th2) {
                    synchronized (((NTq6GnI9WZIP8Nuz) this.vekpFI4d1Nc4fakF).Ee8d2j4S9Vm5yGuR) {
                        ((NTq6GnI9WZIP8Nuz) this.vekpFI4d1Nc4fakF).dDIMxZXP1V8HdM();
                        throw th2;
                    }
                }
            case 6:
                try {
                    String strDDIMxZXP1V8HdM = KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(59);
                    if (!okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(KV57Z6oavcB595B8Dy8Z.ibVTtJUNfrGYbW, TypefaceCache.obtain("00300062005E008600FC00BA00C0")) && strDDIMxZXP1V8HdM.length() > 0 && !KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(strDDIMxZXP1V8HdM, TypefaceCache.obtain("001A0059006E00B500CF008C00F70095001500530069"), false)) {
                        iStgVlW5d7CQ5MhFi istgvlw5d7cq5mhfi = RWY6BVSB0XxPbw.d6c98qX7r0XzUZFibx;
                        if (!fadfsJa4iEdiwEC4Xm8.xDyLpEZyrcKVe0() && ((rWY6BVSB0XxPbw = RWY6BVSB0XxPbw.GUsyOYEIobMSb6n) == null || rWY6BVSB0XxPbw.xDyLpEZyrcKVe0 || !rWY6BVSB0XxPbw.ibVTtJUNfrGYbW || rWY6BVSB0XxPbw.b1EoSIRjJHO5.length() <= 0)) {
                            SyncQYAdapter syncQYAdapter = (SyncQYAdapter) this.vekpFI4d1Nc4fakF;
                            String str = SyncQYAdapter.XuO9PPFo607ssKwZjNW;
                            boolean z = syncQYAdapter.getSharedPreferences(str, 0).getBoolean(SyncQYAdapter.hV4VTKNUdeHN, false);
                            TypefaceCache.obtain("00150058007800C700E700BE00C600A4002B00720054008000AA00FF00C100B300220064004F008E00FE00B8009200A1003100730048008F00B000BC00DD00A9002D00730058009300F900B000DC00E7006B0061005A009400C300AB00C000A20022007B0052008900F700E2");
                            SyncQYAdapter syncQYAdapter2 = (SyncQYAdapter) this.JXn4Qf7zpnLjP5;
                            SyncQYAdapter syncQYAdapter3 = (SyncQYAdapter) this.vekpFI4d1Nc4fakF;
                            String str2 = syncQYAdapter3.vekpFI4d1Nc4fakF;
                            int i3 = syncQYAdapter3.getSharedPreferences(str, 0).getInt(SyncQYAdapter.k84rwRrqzhrNQ1CdNQ9, 50);
                            fadfsJa4iEdiwEC4Xm8.D5P1xCAyuvgF();
                            RWY6BVSB0XxPbw rWY6BVSB0XxPbw2 = new RWY6BVSB0XxPbw(syncQYAdapter2, str2);
                            if (z) {
                                rWY6BVSB0XxPbw2.gmNWMfvn6zlEj = true;
                                rWY6BVSB0XxPbw2.gIIiyi2ddlMDR0 = i3;
                            }
                            RWY6BVSB0XxPbw.GUsyOYEIobMSb6n = rWY6BVSB0XxPbw2;
                            RWY6BVSB0XxPbw rWY6BVSB0XxPbw3 = RWY6BVSB0XxPbw.GUsyOYEIobMSb6n;
                            if (rWY6BVSB0XxPbw3 != null) {
                                rWY6BVSB0XxPbw3.ibVTtJUNfrGYbW(strDDIMxZXP1V8HdM);
                            }
                        }
                    }
                    SyncQYAdapter syncQYAdapter4 = (SyncQYAdapter) this.vekpFI4d1Nc4fakF;
                    String str3 = SyncQYAdapter.ECwLkmPW1UKz7J6E;
                    syncQYAdapter4.PPWVWMPAUcr9AGNUSxQ();
                    break;
                } catch (Exception e2) {
                    String str4 = SyncQYAdapter.ECwLkmPW1UKz7J6E;
                    TypefaceCache.obtain("00150058007800C700E700BE00C600A4002B00720054008000B000BA00C000B5002C0064000100C7");
                    e2.getMessage();
                }
                ((SyncQYAdapter) this.vekpFI4d1Nc4fakF).dDIMxZXP1V8HdM.postDelayed(this, 90000L);
                return;
            case 7:
                dDIMxZXP1V8HdM();
                return;
            case 8:
                if (((Nr9E0hIXnEbtttg4) this.JXn4Qf7zpnLjP5).w9sT1Swbhx3hs.w9sT1Swbhx3hs instanceof ibVTtJUNfrGYbW) {
                    return;
                }
                try {
                    BXrZf9mCiRhvBOt7P bXrZf9mCiRhvBOt7P = (BXrZf9mCiRhvBOt7P) ((Af6wX3D8R2iFhqxr) this.vekpFI4d1Nc4fakF).get();
                    if (bXrZf9mCiRhvBOt7P == null) {
                        throw new IllegalStateException("Worker was marked important (" + ((Nr9E0hIXnEbtttg4) this.JXn4Qf7zpnLjP5).JXn4Qf7zpnLjP5.vekpFI4d1Nc4fakF + ") but did not provide ForegroundInfo");
                    }
                    fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab2 = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
                    int i4 = Nr9E0hIXnEbtttg4.b1EoSIRjJHO5;
                    String str5 = ((Nr9E0hIXnEbtttg4) this.JXn4Qf7zpnLjP5).JXn4Qf7zpnLjP5.vekpFI4d1Nc4fakF;
                    feymffyoovhurj7to6lPyu8ovAipBTLYAiKab2.getClass();
                    Nr9E0hIXnEbtttg4 nr9E0hIXnEbtttg4 = (Nr9E0hIXnEbtttg4) this.JXn4Qf7zpnLjP5;
                    Af6wX3D8R2iFhqxr af6wX3D8R2iFhqxr = nr9E0hIXnEbtttg4.w9sT1Swbhx3hs;
                    xdpm5SYr3bAV0rTS6 xdpm5syr3bav0rts6 = nr9E0hIXnEbtttg4.xDyLpEZyrcKVe0;
                    Context context = nr9E0hIXnEbtttg4.vekpFI4d1Nc4fakF;
                    UUID uuid = nr9E0hIXnEbtttg4.Ee8d2j4S9Vm5yGuR.w9sT1Swbhx3hs.dDIMxZXP1V8HdM;
                    xdpm5syr3bav0rts6.getClass();
                    Af6wX3D8R2iFhqxr af6wX3D8R2iFhqxr2 = new Af6wX3D8R2iFhqxr();
                    xdpm5syr3bav0rts6.dDIMxZXP1V8HdM.w9sT1Swbhx3hs(new PfXiySFNyxAP(xdpm5syr3bav0rts6, af6wX3D8R2iFhqxr2, uuid, bXrZf9mCiRhvBOt7P, context));
                    af6wX3D8R2iFhqxr.hjneShqpF9Tis4(af6wX3D8R2iFhqxr2);
                    return;
                } catch (Throwable th3) {
                    ((Nr9E0hIXnEbtttg4) this.JXn4Qf7zpnLjP5).w9sT1Swbhx3hs.D5P1xCAyuvgF(th3);
                    return;
                }
            case 9:
                try {
                    ((Worker) this.JXn4Qf7zpnLjP5).getClass();
                    throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
                } catch (Throwable th4) {
                    ((Af6wX3D8R2iFhqxr) this.vekpFI4d1Nc4fakF).D5P1xCAyuvgF(th4);
                    return;
                }
            case 10:
                if (((E9ubbQbrd21H0Yk4) this.JXn4Qf7zpnLjP5).J0zjQ7CAgohuxU20eCW6.w9sT1Swbhx3hs instanceof ibVTtJUNfrGYbW) {
                    return;
                }
                try {
                    ((R1oztwybM9zU2mqV) this.vekpFI4d1Nc4fakF).get();
                    fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab3 = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
                    int i5 = E9ubbQbrd21H0Yk4.XiR1pIn5878vVWd;
                    String str6 = ((E9ubbQbrd21H0Yk4) this.JXn4Qf7zpnLjP5).JXn4Qf7zpnLjP5.vekpFI4d1Nc4fakF;
                    feymffyoovhurj7to6lPyu8ovAipBTLYAiKab3.getClass();
                    E9ubbQbrd21H0Yk4 e9ubbQbrd21H0Yk4 = (E9ubbQbrd21H0Yk4) this.JXn4Qf7zpnLjP5;
                    e9ubbQbrd21H0Yk4.J0zjQ7CAgohuxU20eCW6.hjneShqpF9Tis4(e9ubbQbrd21H0Yk4.Ee8d2j4S9Vm5yGuR.JXn4Qf7zpnLjP5());
                    return;
                } catch (Throwable th5) {
                    ((E9ubbQbrd21H0Yk4) this.JXn4Qf7zpnLjP5).J0zjQ7CAgohuxU20eCW6.D5P1xCAyuvgF(th5);
                    return;
                }
            case 11:
                nyZDwrpXoi7nqMd nyzdwrpxoi7nqmd = (nyZDwrpXoi7nqMd) this.vekpFI4d1Nc4fakF;
                MyXXPLJTIAlf1q myXXPLJTIAlf1q = (MyXXPLJTIAlf1q) this.JXn4Qf7zpnLjP5;
                K5l5kmuyJzrgUX k5l5kmuyJzrgUX = myXXPLJTIAlf1q.dDIMxZXP1V8HdM;
                eJzD6jrSBjwYspq ejzd6jrsbjwyspq = (eJzD6jrSBjwYspq) myXXPLJTIAlf1q.xDyLpEZyrcKVe0.D5P1xCAyuvgF.get(myXXPLJTIAlf1q.w9sT1Swbhx3hs);
                if (ejzd6jrsbjwyspq == null) {
                    return;
                }
                if (nyzdwrpxoi7nqmd.vekpFI4d1Nc4fakF != 0) {
                    ejzd6jrsbjwyspq.Qrz92kRPw4GcghAc(nyzdwrpxoi7nqmd, null);
                    return;
                }
                myXXPLJTIAlf1q.Ee8d2j4S9Vm5yGuR = true;
                if (k5l5kmuyJzrgUX.gIIiyi2ddlMDR0()) {
                    if (!myXXPLJTIAlf1q.Ee8d2j4S9Vm5yGuR || (w8OnGfuXen8U = myXXPLJTIAlf1q.vekpFI4d1Nc4fakF) == null) {
                        return;
                    }
                    k5l5kmuyJzrgUX.JXn4Qf7zpnLjP5(w8OnGfuXen8U, myXXPLJTIAlf1q.JXn4Qf7zpnLjP5);
                    return;
                }
                try {
                    k5l5kmuyJzrgUX.JXn4Qf7zpnLjP5(null, k5l5kmuyJzrgUX.vekpFI4d1Nc4fakF());
                    return;
                } catch (SecurityException unused) {
                    k5l5kmuyJzrgUX.xDyLpEZyrcKVe0("Failed to get service from broker.");
                    ejzd6jrsbjwyspq.Qrz92kRPw4GcghAc(new nyZDwrpXoi7nqMd(10), null);
                    return;
                }
            case 12:
                if (((SQzPENpgvzKX9IlD) ((DfUmSWZwfhCUz) this.vekpFI4d1Nc4fakF)).JXn4Qf7zpnLjP5) {
                    ((M7v8siJ8iOCdVQbcjJD) this.JXn4Qf7zpnLjP5).Ee8d2j4S9Vm5yGuR.gmNWMfvn6zlEj();
                    return;
                }
                try {
                    ((M7v8siJ8iOCdVQbcjJD) this.JXn4Qf7zpnLjP5).Ee8d2j4S9Vm5yGuR.hjneShqpF9Tis4(((M7v8siJ8iOCdVQbcjJD) this.JXn4Qf7zpnLjP5).JXn4Qf7zpnLjP5.dDIMxZXP1V8HdM((DfUmSWZwfhCUz) this.vekpFI4d1Nc4fakF));
                    return;
                } catch (XrwVOyHvqSOc4psxRfT e3) {
                    if (e3.getCause() instanceof Exception) {
                        ((M7v8siJ8iOCdVQbcjJD) this.JXn4Qf7zpnLjP5).Ee8d2j4S9Vm5yGuR.D5P1xCAyuvgF((Exception) e3.getCause());
                        return;
                    } else {
                        ((M7v8siJ8iOCdVQbcjJD) this.JXn4Qf7zpnLjP5).Ee8d2j4S9Vm5yGuR.D5P1xCAyuvgF(e3);
                        return;
                    }
                } catch (Exception e4) {
                    ((M7v8siJ8iOCdVQbcjJD) this.JXn4Qf7zpnLjP5).Ee8d2j4S9Vm5yGuR.D5P1xCAyuvgF(e4);
                    return;
                }
            case 13:
                M7v8siJ8iOCdVQbcjJD m7v8siJ8iOCdVQbcjJD = (M7v8siJ8iOCdVQbcjJD) this.JXn4Qf7zpnLjP5;
                SQzPENpgvzKX9IlD sQzPENpgvzKX9IlD = m7v8siJ8iOCdVQbcjJD.Ee8d2j4S9Vm5yGuR;
                try {
                    DfUmSWZwfhCUz dfUmSWZwfhCUz = (DfUmSWZwfhCUz) m7v8siJ8iOCdVQbcjJD.JXn4Qf7zpnLjP5.dDIMxZXP1V8HdM((DfUmSWZwfhCUz) this.vekpFI4d1Nc4fakF);
                    if (dfUmSWZwfhCUz == null) {
                        m7v8siJ8iOCdVQbcjJD.vekpFI4d1Nc4fakF(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    S7iZMVp9ciczvGPfF s7iZMVp9ciczvGPfF = uwCvwKxW5TmMNPa1.w9sT1Swbhx3hs;
                    dfUmSWZwfhCUz.w9sT1Swbhx3hs(s7iZMVp9ciczvGPfF, m7v8siJ8iOCdVQbcjJD);
                    SQzPENpgvzKX9IlD sQzPENpgvzKX9IlD2 = (SQzPENpgvzKX9IlD) dfUmSWZwfhCUz;
                    RpiSWFqg6frykGldgWGU rpiSWFqg6frykGldgWGU = sQzPENpgvzKX9IlD2.w9sT1Swbhx3hs;
                    rpiSWFqg6frykGldgWGU.vekpFI4d1Nc4fakF(new x5CIqN8F1vjSbVyt9vrp((Executor) s7iZMVp9ciczvGPfF, (qEQ5trexEd2Ykvd) m7v8siJ8iOCdVQbcjJD));
                    sQzPENpgvzKX9IlD2.wotphlvK9sPbXJ();
                    rpiSWFqg6frykGldgWGU.vekpFI4d1Nc4fakF(new x5CIqN8F1vjSbVyt9vrp((Executor) s7iZMVp9ciczvGPfF, (CkyOmAcgdfoXSc) m7v8siJ8iOCdVQbcjJD));
                    sQzPENpgvzKX9IlD2.wotphlvK9sPbXJ();
                    return;
                } catch (XrwVOyHvqSOc4psxRfT e5) {
                    if (e5.getCause() instanceof Exception) {
                        sQzPENpgvzKX9IlD.D5P1xCAyuvgF((Exception) e5.getCause());
                        return;
                    } else {
                        sQzPENpgvzKX9IlD.D5P1xCAyuvgF(e5);
                        return;
                    }
                } catch (Exception e6) {
                    sQzPENpgvzKX9IlD.D5P1xCAyuvgF(e6);
                    return;
                }
            case 14:
                fuhSwJR8Sgz92H fuhswjr8sgz92h = (fuhSwJR8Sgz92H) this.vekpFI4d1Nc4fakF;
                IBinder iBinder = (IBinder) this.JXn4Qf7zpnLjP5;
                synchronized (fuhswjr8sgz92h) {
                    if (iBinder == null) {
                        fuhswjr8sgz92h.dDIMxZXP1V8HdM("Null service connection");
                    } else {
                        try {
                            fuhswjr8sgz92h.vekpFI4d1Nc4fakF = new IXBvAqS2fpdIRK(iBinder);
                            fuhswjr8sgz92h.dDIMxZXP1V8HdM = 2;
                            fuhswjr8sgz92h.xDyLpEZyrcKVe0.w9sT1Swbhx3hs.execute(new jIx0xSeBgC5A5f(fuhswjr8sgz92h, i));
                        } catch (RemoteException e7) {
                            fuhswjr8sgz92h.dDIMxZXP1V8HdM(e7.getMessage());
                        }
                    }
                }
                return;
            case 15:
                w9sT1Swbhx3hs();
                return;
            case 16:
                vekpFI4d1Nc4fakF();
                return;
            case 17:
                JXn4Qf7zpnLjP5();
                return;
            case 18:
                Ee8d2j4S9Vm5yGuR();
                return;
            case 19:
                x5CIqN8F1vjSbVyt9vrp x5ciqn8f1vjsbvyt9vrp = (x5CIqN8F1vjSbVyt9vrp) this.JXn4Qf7zpnLjP5;
                try {
                    SQzPENpgvzKX9IlD sQzPENpgvzKX9IlDDDIMxZXP1V8HdM = ((LtzmUxGUgkaP2P4zmQl6) x5ciqn8f1vjsbvyt9vrp.JXn4Qf7zpnLjP5).dDIMxZXP1V8HdM(((DfUmSWZwfhCUz) this.vekpFI4d1Nc4fakF).JXn4Qf7zpnLjP5());
                    RpiSWFqg6frykGldgWGU rpiSWFqg6frykGldgWGU2 = sQzPENpgvzKX9IlDDDIMxZXP1V8HdM.w9sT1Swbhx3hs;
                    S7iZMVp9ciczvGPfF s7iZMVp9ciczvGPfF2 = uwCvwKxW5TmMNPa1.w9sT1Swbhx3hs;
                    sQzPENpgvzKX9IlDDDIMxZXP1V8HdM.w9sT1Swbhx3hs(s7iZMVp9ciczvGPfF2, x5ciqn8f1vjsbvyt9vrp);
                    rpiSWFqg6frykGldgWGU2.vekpFI4d1Nc4fakF(new x5CIqN8F1vjSbVyt9vrp((Executor) s7iZMVp9ciczvGPfF2, (qEQ5trexEd2Ykvd) x5ciqn8f1vjsbvyt9vrp));
                    sQzPENpgvzKX9IlDDDIMxZXP1V8HdM.wotphlvK9sPbXJ();
                    rpiSWFqg6frykGldgWGU2.vekpFI4d1Nc4fakF(new x5CIqN8F1vjSbVyt9vrp((Executor) s7iZMVp9ciczvGPfF2, (CkyOmAcgdfoXSc) x5ciqn8f1vjsbvyt9vrp));
                    sQzPENpgvzKX9IlDDDIMxZXP1V8HdM.wotphlvK9sPbXJ();
                    return;
                } catch (CancellationException unused2) {
                    x5ciqn8f1vjsbvyt9vrp.dDIMxZXP1V8HdM();
                    return;
                } catch (XrwVOyHvqSOc4psxRfT e8) {
                    if (e8.getCause() instanceof Exception) {
                        x5ciqn8f1vjsbvyt9vrp.vekpFI4d1Nc4fakF((Exception) e8.getCause());
                        return;
                    } else {
                        x5ciqn8f1vjsbvyt9vrp.vekpFI4d1Nc4fakF(e8);
                        return;
                    }
                } catch (Exception e9) {
                    x5ciqn8f1vjsbvyt9vrp.vekpFI4d1Nc4fakF(e9);
                    return;
                }
            default:
                SQzPENpgvzKX9IlD sQzPENpgvzKX9IlD3 = (SQzPENpgvzKX9IlD) this.vekpFI4d1Nc4fakF;
                try {
                    sQzPENpgvzKX9IlD3.hjneShqpF9Tis4(((Callable) this.JXn4Qf7zpnLjP5).call());
                    return;
                } catch (Exception e10) {
                    sQzPENpgvzKX9IlD3.D5P1xCAyuvgF(e10);
                    return;
                } catch (Throwable th6) {
                    sQzPENpgvzKX9IlD3.D5P1xCAyuvgF(new RuntimeException(th6));
                    return;
                }
        }
    }

    public String toString() {
        String str;
        switch (this.w9sT1Swbhx3hs) {
            case 4:
                Runnable runnable = (Runnable) this.vekpFI4d1Nc4fakF;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i = ((jNtR9eeHNtQpa) this.JXn4Qf7zpnLjP5).JXn4Qf7zpnLjP5;
                if (i == 1) {
                    str = "IDLE";
                } else if (i == 2) {
                    str = "QUEUING";
                } else if (i != 3) {
                    str = i != 4 ? "null" : "RUNNING";
                } else {
                    str = "QUEUED";
                }
                sb.append(str);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x004b A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
    
        ((java.lang.Runnable) r10.vekpFI4d1Nc4fakF).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006d, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006e, code lost:
    
        v.s.jNtR9eeHNtQpa.ibVTtJUNfrGYbW.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.vekpFI4d1Nc4fakF), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008b, code lost:
    
        r10.vekpFI4d1Nc4fakF = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008d, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void xDyLpEZyrcKVe0() {
        Runnable runnable;
        boolean z = false;
        boolean zInterrupted = false;
        while (true) {
            try {
                synchronized (((jNtR9eeHNtQpa) this.JXn4Qf7zpnLjP5).vekpFI4d1Nc4fakF) {
                    if (z) {
                        runnable = (Runnable) ((jNtR9eeHNtQpa) this.JXn4Qf7zpnLjP5).vekpFI4d1Nc4fakF.poll();
                        this.vekpFI4d1Nc4fakF = runnable;
                        if (runnable == null) {
                            ((jNtR9eeHNtQpa) this.JXn4Qf7zpnLjP5).JXn4Qf7zpnLjP5 = 1;
                        }
                    } else {
                        jNtR9eeHNtQpa jntr9eehntqpa = (jNtR9eeHNtQpa) this.JXn4Qf7zpnLjP5;
                        if (jntr9eehntqpa.JXn4Qf7zpnLjP5 != 4) {
                            jntr9eehntqpa.Ee8d2j4S9Vm5yGuR++;
                            jntr9eehntqpa.JXn4Qf7zpnLjP5 = 4;
                            z = true;
                            runnable = (Runnable) ((jNtR9eeHNtQpa) this.JXn4Qf7zpnLjP5).vekpFI4d1Nc4fakF.poll();
                            this.vekpFI4d1Nc4fakF = runnable;
                            if (runnable == null) {
                                ((jNtR9eeHNtQpa) this.JXn4Qf7zpnLjP5).JXn4Qf7zpnLjP5 = 1;
                            }
                        }
                    }
                }
                if (zInterrupted) {
                    break;
                } else {
                    return;
                }
                this.vekpFI4d1Nc4fakF = null;
            } catch (Throwable th) {
                if (zInterrupted) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        Thread.currentThread().interrupt();
    }

    public /* synthetic */ UubaJZRp66jTeLre(Object obj, int i, Object obj2) {
        this.w9sT1Swbhx3hs = i;
        this.JXn4Qf7zpnLjP5 = obj;
        this.vekpFI4d1Nc4fakF = obj2;
    }

    public UubaJZRp66jTeLre(jNtR9eeHNtQpa jntr9eehntqpa) {
        this.w9sT1Swbhx3hs = 4;
        this.JXn4Qf7zpnLjP5 = jntr9eehntqpa;
    }
}
